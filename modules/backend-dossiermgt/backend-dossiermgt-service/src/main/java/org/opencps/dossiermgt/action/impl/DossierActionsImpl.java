package org.opencps.dossiermgt.action.impl;

import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.service.VRVehicleTypeCertificateLocalServiceUtil;
import com.fds.vr.service.util.FileUploadUtils;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.SortFactoryUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

import javax.ws.rs.HttpMethod;

import org.opencps.datamgt.model.DictCollection;
import org.opencps.datamgt.model.DictItem;
import org.opencps.datamgt.service.DictCollectionLocalServiceUtil;
import org.opencps.datamgt.service.DictItemLocalServiceUtil;
import org.opencps.dossiermgt.action.DossierActions;
import org.opencps.dossiermgt.action.DossierFileActions;
import org.opencps.dossiermgt.action.util.AutoFillFormData;
import org.opencps.dossiermgt.action.util.ConstantsUtils;
import org.opencps.dossiermgt.action.util.DossierContentGenerator;
import org.opencps.dossiermgt.action.util.DossierMgtUtils;
import org.opencps.dossiermgt.action.util.DossierNumberGenerator;
import org.opencps.dossiermgt.action.util.DossierPaymentUtils;
import org.opencps.dossiermgt.action.util.SpecialCharacterUtils;
import org.opencps.dossiermgt.constants.DossierActionTerm;
import org.opencps.dossiermgt.constants.DossierFileTerm;
import org.opencps.dossiermgt.constants.DossierPartTerm;
import org.opencps.dossiermgt.constants.DossierStatusConstants;
import org.opencps.dossiermgt.constants.DossierTerm;
import org.opencps.dossiermgt.constants.ProcessActionTerm;
import org.opencps.dossiermgt.constants.ProcessStepRoleTerm;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierActionUser;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.DossierPart;
import org.opencps.dossiermgt.model.DossierTemplate;
import org.opencps.dossiermgt.model.PaymentFile;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.ProcessOption;
import org.opencps.dossiermgt.model.ProcessPlugin;
import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.model.ProcessStepRole;
import org.opencps.dossiermgt.model.ServiceProcess;
import org.opencps.dossiermgt.model.ServiceProcessRole;
import org.opencps.dossiermgt.scheduler.InvokeREST;
import org.opencps.dossiermgt.scheduler.RESTFulConfiguration;
import org.opencps.dossiermgt.service.DossierActionLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierActionUserLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierPartLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierRequestUDLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierSyncLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierTemplateLocalServiceUtil;
import org.opencps.dossiermgt.service.PaymentFileLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessPluginLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessStepLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessStepRoleLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceProcessLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceProcessRoleLocalServiceUtil;
import org.opencps.dossiermgt.service.comparator.DossierFileComparator;
import org.opencps.dossiermgt.vr.utils.VRBusinessUtils;
import org.opencps.usermgt.model.Applicant;
import org.opencps.usermgt.service.ApplicantLocalServiceUtil;
import org.opencps.usermgt.service.util.OCPSUserUtils;

import backend.auth.api.exception.NotFoundException;

public class DossierActionsImpl implements DossierActions {

	@Override
	public JSONObject getDossiers(long userId, long companyId, long groupId, LinkedHashMap<String, Object> params,
			Sort[] sorts, int start, int end, ServiceContext serviceContext) {

		JSONObject result = JSONFactoryUtil.createJSONObject();

		long total = 0;

		SearchContext searchContext = new SearchContext();
		searchContext.setCompanyId(companyId);

		try {

			String status = GetterUtil.getString(params.get(DossierTerm.STATUS));
			String state = GetterUtil.getString(params.get(DossierTerm.STATE));
			_log.info("status: " + status);
			if (Validator.isNotNull(status)) {
				if (Validator.isNotNull(state)
						&& (state.contains(ConstantsUtils.RT_EXPIRED) || state.contains(ConstantsUtils.RT_EXPIRING))) {
					params.put(DossierTerm.STATE, StringPool.BLANK);
				}
				List<Document> allDocsList = new ArrayList<Document>();
				if (!status.contains(StringPool.COMMA)) {
					if (!status.equals("done") && !status.equals("cancelled")) {
						_log.debug("done: " + status);
						params.put(DossierTerm.NOT_STATE, "cancelling");
					}
				}
				Hits hitStatus = DossierLocalServiceUtil.searchLucene(params, sorts, QueryUtil.ALL_POS,
						QueryUtil.ALL_POS, searchContext);

				if (hitStatus != null && hitStatus.getLength() > 0) {
					long count = DossierLocalServiceUtil.countLucene(params, searchContext);
					_log.info("count: " + count);
					allDocsList.addAll(hitStatus.toList());
					_log.info("SizeList1: " + hitStatus.toList().size());
					total += count;
				}
				//
				Applicant applicant = ApplicantLocalServiceUtil.fetchByMappingID(userId);

				if (Validator.isNotNull(state)
						&& (state.contains(ConstantsUtils.RT_EXPIRED) || state.contains(ConstantsUtils.RT_EXPIRING))) {
					params.put(DossierTerm.STATE, StringPool.BLANK);
					if (applicant != null) {
						if (state.contains(StringPool.COMMA)) {
							String[] stateArr = state.split(StringPool.COMMA);
							if (stateArr != null) {
								for (String statusState : stateArr) {
									if (statusState.equals(ConstantsUtils.RT_EXPIRED)) {
										List<VRVehicleTypeCertificate> certTypeList = VRVehicleTypeCertificateLocalServiceUtil
												.findByExpiredstatus(DossierTerm.EXPIRED_STATUS_WATTING);
										Hits hitState = null;
										if (certTypeList != null && certTypeList.size() > 0) {
											int lenghtCert = certTypeList.size();
											String strDossierNo = StringPool.BLANK;
											if (lenghtCert == 1) {
												strDossierNo = SpecialCharacterUtils
														.splitSpecial(certTypeList.get(0).getDossierNo());
											} else {
												StringBuilder sb = new StringBuilder();
												for (int i = 0; i < lenghtCert; i++) {
													VRVehicleTypeCertificate certType = certTypeList.get(i);
													if (i == lenghtCert - 1) {
														sb.append(SpecialCharacterUtils
																.splitSpecial(certType.getDossierNo()));
													} else {
														sb.append(SpecialCharacterUtils
																.splitSpecial(certType.getDossierNo()));
														sb.append(StringPool.COMMA);
													}
												}
												strDossierNo = sb.toString();
											}
											_log.info("strDossierNo: " + strDossierNo);
											if (Validator.isNotNull(strDossierNo)) {
												params.put(DossierTerm.DOSSIER_NO_EXPIRED, strDossierNo);
												//
												hitState = DossierLocalServiceUtil.searchLucene(params, sorts, start,
														end, searchContext);
											}
										}

										if (hitState != null && hitState.getLength() > 0) {
											long count = DossierLocalServiceUtil.countLucene(params, searchContext);
											_log.info("count: " + count);
											allDocsList.addAll(hitState.toList());
											_log.info("SizeList1: " + hitStatus.toList().size());
											total += count;
										}
									}
									//
									if (state.equals(ConstantsUtils.RT_EXPIRING)) {
										List<VRVehicleTypeCertificate> certTypeList = VRVehicleTypeCertificateLocalServiceUtil
												.findByExpiredstatus(DossierTerm.EXPIRED_STATUS_ACTIVE); // get to
																											// status =
																											// 0 or 1
										Hits hitState = null;
										if (certTypeList != null && certTypeList.size() > 0) {
											String strDossierNo = DossierMgtUtils.checkConditionState(certTypeList);
											_log.info("strDossierNo: " + strDossierNo);
											if (Validator.isNotNull(strDossierNo)) {
												params.put(DossierTerm.DOSSIER_NO_EXPIRED, strDossierNo);
												//
												hitState = DossierLocalServiceUtil.searchLucene(params, sorts, start,
														end, searchContext);
											}
										}
										if (hitState != null && hitState.getLength() > 0) {
											long count = DossierLocalServiceUtil.countLucene(params, searchContext);
											_log.info("count: " + count);
											allDocsList.addAll(hitState.toList());
											_log.info("SizeList1: " + hitStatus.toList().size());
											total += count;
										}
									}
								}
							}
						}
					}
				}
				result.put("data", allDocsList);
				result.put("total", total);
			} else {
				if (Validator.isNotNull(state)
						&& (state.contains(ConstantsUtils.RT_EXPIRED) || state.contains(ConstantsUtils.RT_EXPIRING))) {
					params.put(DossierTerm.STATE, StringPool.BLANK);
					if (state.equals(ConstantsUtils.RT_EXPIRED)) {
						List<VRVehicleTypeCertificate> certTypeList = VRVehicleTypeCertificateLocalServiceUtil
								.findByExpiredstatus(DossierTerm.EXPIRED_STATUS_WATTING);
						Hits hitState = null;
						if (certTypeList != null && certTypeList.size() > 0) {
							int lenghtCert = certTypeList.size();
							String strDossierNo = StringPool.BLANK;
							if (lenghtCert == 1) {
								strDossierNo = SpecialCharacterUtils.splitSpecial(certTypeList.get(0).getDossierNo());
							} else {
								StringBuilder sb = new StringBuilder();
								for (int i = 0; i < lenghtCert; i++) {
									VRVehicleTypeCertificate certType = certTypeList.get(i);
									if (i == lenghtCert - 1) {
										sb.append(SpecialCharacterUtils.splitSpecial(certType.getDossierNo()));
									} else {
										sb.append(SpecialCharacterUtils.splitSpecial(certType.getDossierNo()));
										sb.append(StringPool.COMMA);
									}
								}
								strDossierNo = sb.toString();
							}
							_log.info("strDossierNo: " + strDossierNo);
							params.put(DossierTerm.DOSSIER_NO_EXPIRED, strDossierNo);
							if (Validator.isNotNull(strDossierNo)) {
								params.put(DossierTerm.DOSSIER_NO_EXPIRED, strDossierNo);
								//
								hitState = DossierLocalServiceUtil.searchLucene(params, sorts, start, end,
										searchContext);
							}
						}

						if (hitState != null && hitState.getLength() > 0) {
							long totalState = DossierLocalServiceUtil.countLucene(params, searchContext);

							result.put("data", hitState.toList());
							result.put("total", totalState);
						}
						//
						return result;
					}

					if (state.equals(ConstantsUtils.RT_EXPIRING)) {
						List<VRVehicleTypeCertificate> certTypeList = VRVehicleTypeCertificateLocalServiceUtil
								.findByExpiredstatus(DossierTerm.EXPIRED_STATUS_ACTIVE); // get to status = 0 or 1
						Hits hitState = null;
						if (certTypeList != null && certTypeList.size() > 0) {
							String strDossierNo = DossierMgtUtils.checkConditionState(certTypeList);
							_log.info("strDossierNo: " + strDossierNo);
							params.put(DossierTerm.DOSSIER_NO_EXPIRED, strDossierNo);
							if (Validator.isNotNull(strDossierNo)) {
								params.put(DossierTerm.DOSSIER_NO_EXPIRED, strDossierNo);
								//
								hitState = DossierLocalServiceUtil.searchLucene(params, sorts, start, end,
										searchContext);
							}
						}

						if (hitState != null && hitState.getLength() > 0) {
							long totalState = DossierLocalServiceUtil.countLucene(params, searchContext);

							result.put("data", hitState.toList());
							result.put("total", totalState);
						}
						//
						return result;
					}
				}
			}
			if(Validator.isNotNull(state)
					&& (state.contains(ConstantsUtils.CORRECTING) || state.contains(ConstantsUtils.ENDORSEMENT)
					|| state.contains(ConstantsUtils.CANCELLING))){
				if (state.equals(ConstantsUtils.CORRECTING)) {

					params.put(DossierTerm.STATE, ConstantsUtils.CORRECTING);

					Hits hitState = null;
					hitState = DossierLocalServiceUtil.searchLucene(params, sorts, start, end,
							searchContext);

					if (hitState != null && hitState.getLength() > 0) {
						long totalState = DossierLocalServiceUtil.countLucene(params, searchContext);

						result.put("data", hitState.toList());
						result.put("total", totalState);
					}
					return result;
				}
				if (state.equals(ConstantsUtils.ENDORSEMENT)) {

					params.put(DossierTerm.STATE, ConstantsUtils.ENDORSEMENT);

					Hits hitState = null;
					hitState = DossierLocalServiceUtil.searchLucene(params, sorts, start, end,
							searchContext);

					if (hitState != null && hitState.getLength() > 0) {
						long totalState = DossierLocalServiceUtil.countLucene(params, searchContext);

						result.put("data", hitState.toList());
						result.put("total", totalState);
					}
					return result;
				}
				if (state.equals(ConstantsUtils.CANCELLING)) {

					params.put(DossierTerm.STATE, ConstantsUtils.CANCELLING);

					Hits hitState = null;
					hitState = DossierLocalServiceUtil.searchLucene(params, sorts, start, end,
							searchContext);

					if (hitState != null && hitState.getLength() > 0) {
						long totalState = DossierLocalServiceUtil.countLucene(params, searchContext);

						result.put("data", hitState.toList());
						result.put("total", totalState);
					}
					return result;
				}

			}

		} catch (Exception e) {
			_log.error(e);
		}

		return result;

	}

	public JSONObject getAllDossiers(long userId, long companyId, long groupId, LinkedHashMap<String, Object> params,
			Sort[] sorts, int start, int end, ServiceContext serviceContext) {

		JSONObject result = JSONFactoryUtil.createJSONObject();

		Hits hits = null;

		SearchContext searchContext = new SearchContext();
		searchContext.setCompanyId(companyId);

		try {

			String statusCode = GetterUtil.getString(params.get(DossierTerm.STATUS));

			String subStatusCode = GetterUtil.getString(params.get(DossierTerm.SUBSTATUS));
			if (groupId == ConstantsUtils.GROUP_CTN) {
				hits = DossierLocalServiceUtil.searchLucene(params, sorts, start, end, searchContext);

				result.put("data", hits.toList());

				long total = DossierLocalServiceUtil.countLucene(params, searchContext);

				result.put("total", total);

				return result;
			}

			// Get collection with collection Code
			DictCollection dictCollection = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode("DOSSIER_STATUS",
					groupId);

			// Get list dossier follow status Code
			if (Validator.isNotNull(statusCode) || Validator.isNotNull(subStatusCode)) {
				// _log.info("52" + sb.toString());

				DictItem dictItem = null;
				if (Validator.isNotNull(subStatusCode)) {
					dictItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(subStatusCode,
							dictCollection.getDictCollectionId(), groupId);
				} else {
					dictItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(statusCode,
							dictCollection.getDictCollectionId(), groupId);
				}

				long total = 0;
				if (dictItem != null) {
					// _log.info("53");
					String metaData = dictItem.getMetaData();
					String specialStatus = StringPool.BLANK;
					if (Validator.isNotNull(metaData)) {
						_log.debug("metaData: " + metaData);
						try {
							JSONObject metaJson = JSONFactoryUtil.createJSONObject(metaData);
							specialStatus = metaJson.getString("specialStatus");
							_log.debug("specialStatus: " + specialStatus);

						} catch (Exception e) {
							_log.debug(e);
						}
					}

					if (Validator.isNotNull(specialStatus) && Boolean.parseBoolean(specialStatus)) {
						// params.put(DossierTerm.DOSSIER_ACTION_ID,
						// sb.toString());
						params.put(DossierTerm.FOLLOW, String.valueOf(true));
					} else {
						params.put(DossierTerm.FOLLOW, false);
					}

					hits = DossierLocalServiceUtil.searchLucene(params, sorts, start, end, searchContext);
					if (hits != null && hits.getLength() > 0) {
						result.put("data", hits.toList());
						_log.debug("hits.toList(): " + hits.toList().size());
						total = DossierLocalServiceUtil.countLucene(params, searchContext);
						_log.debug("total: " + total);
						result.put("total", total);
					}
				}
			} else { /* Get list dossier follow roles user login */

				List<DictItem> dictItems = DictItemLocalServiceUtil
						.findByF_dictCollectionId(dictCollection.getDictCollectionId());

				// Get list dossier follow each status
				if (dictItems != null && dictItems.size() > 0) {
					List<ProcessStep> stepList = ProcessStepLocalServiceUtil.getProcessStepbyUserId(userId);
					List<Document> allDocsList = new ArrayList<Document>();
					long total = 0;
					for (DictItem dictItem : dictItems) {
						String metaData = dictItem.getMetaData();
						String specialStatus = StringPool.BLANK;
						if (Validator.isNotNull(metaData)) {
							_log.debug("metaData: " + metaData);
							try {
								JSONObject metaJson = JSONFactoryUtil.createJSONObject(metaData);
								specialStatus = metaJson.getString("specialStatus");
								_log.debug("specialStatus: " + specialStatus);

							} catch (Exception e) {
								_log.debug(e);
							}
						}

						statusCode = StringPool.BLANK;
						subStatusCode = StringPool.BLANK;
						// Get info status of dossier
						if (dictItem.getParentItemId() != 0) {
							subStatusCode = dictItem.getItemCode();
							_log.debug("subStatusCode: " + subStatusCode);
							DictItem parentDictItem = DictItemLocalServiceUtil.getDictItem(dictItem.getParentItemId());
							statusCode = parentDictItem.getItemCode();
							_log.debug("statusCode: " + statusCode);
						} else {
							statusCode = dictItem.getItemCode();
							_log.debug("statusCode: " + statusCode);
						}

						// Check permission user login
						// TODO Tam comment
						boolean isPermission = checkPermission(statusCode, subStatusCode, stepList);

						if (isPermission) {
							_log.debug("isPermission: " + isPermission);
							_log.debug("userId: " + userId);
							// _log.info("strdossierActionId: " +
							// sb.toString());

							if (Validator.isNotNull(specialStatus) && Boolean.parseBoolean(specialStatus)) {
								// Add params
								params.put(DossierTerm.STATUS, statusCode);
								params.put(DossierTerm.SUBSTATUS, subStatusCode);
								// params.put(DossierTerm.DOSSIER_ACTION_ID,
								// sb.toString());
								params.put(DossierTerm.FOLLOW, String.valueOf(true));

								hits = DossierLocalServiceUtil.searchLucene(params, sorts, QueryUtil.ALL_POS,
										QueryUtil.ALL_POS, searchContext);

								if (hits != null && hits.getLength() > 0) {
									long count = DossierLocalServiceUtil.countLucene(params, searchContext);
									_log.debug("count: " + count);
									if (dictItem.getParentItemId() != 0) {
										allDocsList.addAll(hits.toList());
										_log.debug("SizeList1: " + hits.toList().size());
										total += count;
									}
								}

							} else {
								params.put(DossierTerm.STATUS, statusCode);
								params.put(DossierTerm.SUBSTATUS, subStatusCode);
								params.put(DossierTerm.FOLLOW, String.valueOf(false));

								hits = DossierLocalServiceUtil.searchLucene(params, sorts, QueryUtil.ALL_POS,
										QueryUtil.ALL_POS, searchContext);

								if (hits != null && hits.getLength() > 0) {
									// allDocsList.addAll(hits.toList());
									// _log.info("SizeList2: " +
									// hits.toList().size());
									long count = DossierLocalServiceUtil.countLucene(params, searchContext);
									_log.debug("count: " + count);
									if (dictItem.getParentItemId() != 0) {
										allDocsList.addAll(hits.toList());
										_log.debug("SizeList2: " + hits.toList().size());
										total += count;
									}
								}
							}
						}
					}
					// Add all list dossier of multiple status
					result.put("data", allDocsList);
					result.put("total", total);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return result;

	}

	@Override
	public JSONObject getDossiersTest(long userId, long companyId, long groupId, LinkedHashMap<String, Object> params,
			Sort[] sorts, int start, int end, ServiceContext serviceContext) {

		JSONObject result = JSONFactoryUtil.createJSONObject();

		Hits hits = null;

		SearchContext searchContext = new SearchContext();
		searchContext.setCompanyId(companyId);

		try {

			String statusCode = GetterUtil.getString(params.get(DossierTerm.STATUS));

			String subStatusCode = GetterUtil.getString(params.get(DossierTerm.SUBSTATUS));
			if (groupId == 55217) {
				hits = DossierLocalServiceUtil.searchLucene(params, sorts, start, end, searchContext);

				result.put("data", hits.toList());

				long total = DossierLocalServiceUtil.countLucene(params, searchContext);

				result.put("total", total);

				return result;
			}

			// Get collection with collection Code
			DictCollection dictCollection = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode("DOSSIER_STATUS",
					groupId);

			// Get list dossier follow status Code
			if (Validator.isNotNull(statusCode) || Validator.isNotNull(subStatusCode)) {
				// _log.info("52" + sb.toString());

				DictItem dictItem = null;
				if (Validator.isNotNull(subStatusCode)) {
					dictItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(subStatusCode,
							dictCollection.getDictCollectionId(), groupId);
				} else {
					dictItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(statusCode,
							dictCollection.getDictCollectionId(), groupId);
				}

				long total = 0;
				if (dictItem != null) {
					// _log.info("53");
					String metaData = dictItem.getMetaData();
					String specialStatus = StringPool.BLANK;
					if (Validator.isNotNull(metaData)) {
						_log.debug("metaData: " + metaData);
						try {
							JSONObject metaJson = JSONFactoryUtil.createJSONObject(metaData);
							specialStatus = metaJson.getString("specialStatus");
							_log.debug("specialStatus: " + specialStatus);

						} catch (Exception e) {
							_log.debug(e);
						}
					}

					if (Validator.isNotNull(specialStatus) && Boolean.parseBoolean(specialStatus)) {
						// params.put(DossierTerm.DOSSIER_ACTION_ID,
						// sb.toString());
						params.put(DossierTerm.FOLLOW, String.valueOf(true));
					} else {
						params.put(DossierTerm.FOLLOW, false);
					}

					hits = DossierLocalServiceUtil.searchLucene(params, sorts, start, end, searchContext);
					if (hits != null && hits.getLength() > 0) {
						result.put("data", hits.toList());
						_log.debug("hits.toList(): " + hits.toList().size());
						total = DossierLocalServiceUtil.countLucene(params, searchContext);
						_log.debug("total: " + total);
						result.put("total", total);
					}
				}
			} else { /* Get list dossier follow roles user login */

				List<DictItem> dictItems = DictItemLocalServiceUtil
						.findByF_dictCollectionId(dictCollection.getDictCollectionId());

				// Get list dossier follow each status
				if (dictItems != null && dictItems.size() > 0) {
					List<ProcessStep> stepList = ProcessStepLocalServiceUtil.getProcessStepbyUserId(userId);
					List<Document> allDocsList = new ArrayList<Document>();
					long total = 0;
					for (DictItem dictItem : dictItems) {
						String metaData = dictItem.getMetaData();
						String specialStatus = StringPool.BLANK;
						if (Validator.isNotNull(metaData)) {
							_log.debug("metaData: " + metaData);
							try {
								JSONObject metaJson = JSONFactoryUtil.createJSONObject(metaData);
								specialStatus = metaJson.getString("specialStatus");
								_log.debug("specialStatus: " + specialStatus);

							} catch (Exception e) {
								_log.debug(e);
							}
						}

						statusCode = StringPool.BLANK;
						subStatusCode = StringPool.BLANK;
						// Get info status of dossier
						if (dictItem.getParentItemId() != 0) {
							subStatusCode = dictItem.getItemCode();
							_log.debug("subStatusCode: " + subStatusCode);
							DictItem parentDictItem = DictItemLocalServiceUtil.getDictItem(dictItem.getParentItemId());
							statusCode = parentDictItem.getItemCode();
							_log.debug("statusCode: " + statusCode);
						} else {
							statusCode = dictItem.getItemCode();
							_log.debug("statusCode: " + statusCode);
						}

						// Check permission user login
						boolean isPermission = checkPermission(statusCode, subStatusCode, stepList);

						if (isPermission) {
							// _log.info("isPermission: " + isPermission);
							// _log.info("userId: " + userId);
							// _log.info("strdossierActionId: " +
							// sb.toString());

							if (Validator.isNotNull(specialStatus) && Boolean.parseBoolean(specialStatus)) {
								// Add params
								params.put(DossierTerm.STATUS, statusCode);
								params.put(DossierTerm.SUBSTATUS, subStatusCode);
								// params.put(DossierTerm.DOSSIER_ACTION_ID,
								// sb.toString());
								params.put(DossierTerm.FOLLOW, String.valueOf(true));

								hits = DossierLocalServiceUtil.searchLucene(params, sorts, -1, -1, searchContext);

								if (hits != null && hits.getLength() > 0) {
									long count = DossierLocalServiceUtil.countLucene(params, searchContext);
									_log.debug("count: " + count);
									if (dictItem.getParentItemId() != 0) {
										allDocsList.addAll(hits.toList());
										_log.debug("SizeList1: " + hits.toList().size());
										total += count;
									}
								}

							} else {
								params.put(DossierTerm.STATUS, statusCode);
								params.put(DossierTerm.SUBSTATUS, subStatusCode);
								params.put(DossierTerm.FOLLOW, String.valueOf(false));

								hits = DossierLocalServiceUtil.searchLucene(params, sorts, -1, -1, searchContext);

								if (hits != null && hits.getLength() > 0) {
									// allDocsList.addAll(hits.toList());
									// _log.info("SizeList2: " +
									// hits.toList().size());
									long count = DossierLocalServiceUtil.countLucene(params, searchContext);
									_log.debug("count: " + count);
									if (dictItem.getParentItemId() != 0) {
										allDocsList.addAll(hits.toList());
										_log.debug("SizeList2: " + hits.toList().size());
										total += count;
									}
								}
							}
						}
					}
					// Add all list dossier of multiple status
					result.put("data", allDocsList);
					result.put("total", total);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return result;

	}

	@Override
	public Dossier addDossier(long groupId, long dossierId, String referenceUid, int counter, String serviceCode,
			String serviceName, String govAgencyCode, String govAgencyName, String applicantName,
			String applicantIdType, String applicantIdNo, Date applicantIdDate, String address, String cityCode,
			String cityName, String districtCode, String districtName, String wardCode, String wardName,
			String contactName, String contactTelNo, String contactEmail, String dossierTemplateNo, String dossierNote,
			String submissionNote, String applicantNote, String briefNote, String dossierNo, boolean submitting,
			Date correctingDate, String dossierStatus, String dossierStatusText, String dossierSubStatus,
			String dossierSubStatusText, long folderId, long dossierActionId, int viaPostal, String postalAddress,
			String postalCityCode, String postalCityName, String postalTelNo, String password, boolean notification,
			boolean online, String serverNo, ServiceContext context) throws PortalException {

		Dossier dossier = DossierLocalServiceUtil.updateDossier(groupId, dossierId, referenceUid, counter, serviceCode,
				serviceName, govAgencyCode, govAgencyName, applicantName, applicantIdType, applicantIdNo,
				applicantIdDate, address, cityCode, cityName, districtCode, districtName, wardCode, wardName,
				contactName, contactTelNo, contactEmail, dossierTemplateNo, dossierNote, submissionNote, applicantNote,
				briefNote, dossierNo, submitting, correctingDate, dossierStatus, dossierStatusText, dossierSubStatus,
				dossierSubStatusText, folderId, dossierActionId, viaPostal, postalAddress, postalCityCode,
				postalCityName, postalTelNo, password, notification, online, serverNo, context);

		return dossier;
	}

	@Override
	public Dossier getDossierDetail(long groupId, long dossierId, String referenceUid) throws PortalException {
		if (dossierId != 0) {
			return DossierLocalServiceUtil.fetchDossier(dossierId);
		} else {
			return DossierLocalServiceUtil.getByRef(groupId, referenceUid);
		}

	}

	@Override
	public Dossier removeDossier(long groupId, long dossierId, String referenceUid) throws PortalException {

		return DossierLocalServiceUtil.removeDossier(groupId, dossierId, referenceUid);
	}

	@Override
	public Dossier cancelDossier(long groupId, long dossierId, String referenceUid, ServiceContext context)
			throws PortalException {
		return DossierLocalServiceUtil.updateCancellingDate(groupId, dossierId, referenceUid, new Date(), context);
	}

	@Override
	public Dossier correctDossier(long groupId, long dossierId, String referenceUid, ServiceContext context)
			throws PortalException {
		return DossierLocalServiceUtil.updateCorrectingDate(groupId, dossierId, referenceUid, new Date(), context);
	}

	@Override
	public Dossier submitPostDossier(long groupId, long dossierId, String referenceUid, ServiceContext context)
			throws PortalException {
		return DossierLocalServiceUtil.updateEndosementDate(groupId, dossierId, referenceUid, new Date(), context);
	}

	@Override
	public Dossier submitDossier(long groupId, long dossierId, String referenceUid, ServiceContext context)
			throws PortalException {
		return DossierLocalServiceUtil.submitting(groupId, dossierId, referenceUid, context);
	}

	@Override
	public Dossier resetDossier(long groupId, long dossierId, String referenceUid, ServiceContext context)
			throws PortalException {
		return DossierLocalServiceUtil.reset(groupId, dossierId, referenceUid, context);
	}

	@Override
	public JSONArray getNextActionList(long userId, long companyId, long groupId, LinkedHashMap<String, Object> params,
			Sort[] sorts, Integer start, Integer end, ServiceContext serviceContext) {

		long dossierId = GetterUtil.getLong(params.get(DossierTerm.DOSSIER_ID));

		DossierAction dossierAction = null;
		List<ProcessAction> processActionList = null;
		JSONArray results = null;
		Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierId);

		try {
			if (dossier != null) {
				long dossierActionId = dossier.getDossierActionId();
				_log.info("dossierActionId: " + dossierActionId);
				if (dossierActionId > 0) {
					dossierAction = DossierActionLocalServiceUtil.fetchDossierAction(dossierActionId);
				}

				long serviceProcessId = dossierAction != null ? dossierAction.getServiceProcessId() : 0;
				String stepCode = dossierAction != null ? dossierAction.getStepCode() : StringPool.BLANK;
				// _log.info("stepCode: "+stepCode);
				boolean pending = dossierAction != null ? dossierAction.getPending() : false;

				if (Validator.isNotNull(stepCode) && serviceProcessId > 0) {
					// _log.info("User id: " + userId);
					processActionList = ProcessActionLocalServiceUtil.getProcessActionByG_SPID_PRESC(groupId,
							serviceProcessId, stepCode);
					_log.info("processActionList: " + processActionList.size());
					if (processActionList != null && processActionList.size() > 0) {
						if (results == null) {
							results = JSONFactoryUtil.createJSONArray();
						}
						JSONObject data = null;
						long processActionId = 0;
						String actionCode;
						String actionName;
						String preStepCode;
						String postStepCode;
						String autoEvent;
						String preCondition;
						boolean eSignature;
						for (ProcessAction processAction : processActionList) {
							// _log.info("processAction: "+processAction);
							data = JSONFactoryUtil.createJSONObject();
							processActionId = processAction.getProcessActionId();
							actionCode = processAction.getActionCode();
							actionName = processAction.getActionName();
							preStepCode = processAction.getPreStepCode();
							postStepCode = processAction.getPostStepCode();
							autoEvent = processAction.getAutoEvent();
							preCondition = processAction.getPreCondition();
							eSignature = processAction.getESignature();
							//
							String[] preConditionArr = Validator.isNotNull(preCondition)
									? StringUtil.split(preCondition)
									: null;
							boolean checkPreCondition = preConditionArr != null
									? DossierMgtUtils.checkPreCondition(preConditionArr, dossier)
									: true;
							if (!checkPreCondition) {
								continue;
							}
//							_log.info("SONDT NEXTACTIONLIST PRECONDITION ======== " + preCondition);

							data.put(ProcessActionTerm.PROCESS_ACTION_ID, processActionId);
							data.put(ProcessActionTerm.ACTION_CODE, actionCode);
							data.put(ProcessActionTerm.ACTION_NAME, actionName);
							data.put(ProcessActionTerm.PRESTEP_CODE, preStepCode);
							data.put(ProcessActionTerm.POSTSTEP_CODE, postStepCode);
							data.put(ProcessActionTerm.AUTO_EVENT, autoEvent);
							data.put(ProcessActionTerm.PRE_CONDITION, preCondition);
							data.put("pending", pending);
							data.put(ProcessActionTerm.ESIGNATURE, eSignature);

//							Comment by Dungnv
//							results.put(data);
//							
//							List<ProcessPlugin> pluginList = ProcessPluginLocalServiceUtil.getBySC_SPID_ARUN(serviceProcessId,
//									postStepCode, true);
//
//							if (pluginList != null && pluginList.size() > 0) {
//								for (ProcessPlugin plg : pluginList) {
//									// do create file
//									String pluginForm = plg.getPluginForm();
//									String fileTemplateNo = StringUtil.replaceFirst(plg.getSampleData(), "#", StringPool.BLANK);
//
//									if (Validator.isNotNull(pluginForm) && !pluginForm.contains("original")) {
//										_doAutoRun(groupId, fileTemplateNo, dossierId, dossier.getDossierTemplateNo(),
//												dossierActionId, serviceContext);
//									}
//								}
//							}
							// add by Dungnv
							LinkedHashMap<String, Object> paramDetailNextActions = new LinkedHashMap<String, Object>();
							paramDetailNextActions.put(Field.GROUP_ID, String.valueOf(groupId));
							paramDetailNextActions.put(DossierTerm.DOSSIER_ID, String.valueOf(dossierId));
							paramDetailNextActions.put(ProcessActionTerm.PROCESS_ACTION_ID, processActionId);
							paramDetailNextActions.put(DossierActionTerm.ACTION_CODE, actionCode);

							JSONObject createFiles = getDetailNextActions(userId, companyId, groupId,
									paramDetailNextActions, sorts, start, end, serviceContext);
							data.put("createFiles", createFiles.getJSONArray("createFiles"));
							results.put(data);
						}
					}

					DossierActionUser dau = DossierActionUserLocalServiceUtil.getByDID_UID_MOD(dossierActionId, userId,
							1);
					if (dau != null) {
						List<ProcessPlugin> pluginList = ProcessPluginLocalServiceUtil
								.getBySC_SPID_ARUN(serviceProcessId, stepCode, true);

						if (pluginList != null && pluginList.size() > 0) {
							for (ProcessPlugin plg : pluginList) {
								// do create file
								String pluginForm = plg.getPluginForm();
								String fileTemplateNo = StringUtil.replaceFirst(plg.getSampleData(), "#",
										StringPool.BLANK);

								if (Validator.isNotNull(pluginForm) && !pluginForm.contains("original")) {
									_doAutoRun(groupId, fileTemplateNo, dossierId, dossier.getDossierTemplateNo(),
											dossierActionId, serviceContext);
								}
							}
						}
					}
				}

			}
		} catch (Exception e) {
			_log.error(e);
		}

		return results;
	}

	public JSONArray getNextActionTimmer(long userId, long companyId, long groupId,
			LinkedHashMap<String, Object> params, Sort[] sorts, int start, int end, ServiceContext serviceContext)
			throws PortalException {

		JSONArray results = JSONFactoryUtil.createJSONArray();

		List<ProcessAction> lstProcessAction = new ArrayList<ProcessAction>();

		Dossier dossier = null;

		DossierAction dossierAction = null;

		long serviceProcessId = 0;

		String stepCode = StringPool.BLANK;

		String actionCode = GetterUtil.getString(params.get(DossierActionTerm.ACTION_CODE));
		// TODO filter by Auto
		String auto = GetterUtil.getString(params.get(DossierActionTerm.AUTO));

		// auto != null ko check role, check dk preCondition = auto or submmit

		String referenceUid = GetterUtil.getString(params.get(DossierTerm.REFERENCE_UID));

		long dossierId = GetterUtil.getLong(params.get(DossierTerm.DOSSIER_ID));

		if (Validator.isNotNull(referenceUid)) {
			dossier = DossierLocalServiceUtil.getByRef(groupId, referenceUid);
		} else {
			dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
		}

		if (dossier != null) {

			long dossierActionId = dossier.getDossierActionId();

			if (Validator.isNotNull(actionCode)) {
				dossierAction = getDossierAction(dossier.getDossierId(), actionCode);
			} else {
				dossierAction = DossierActionLocalServiceUtil.fetchDossierAction(dossierActionId);
			}

			serviceProcessId = dossierAction != null ? dossierAction.getServiceProcessId() : 0;

			stepCode = dossierAction != null ? dossierAction.getStepCode() : StringPool.BLANK;

			boolean pending = dossierAction != null ? dossierAction.getPending() : false;

			if (Validator.isNotNull(stepCode)) {

				try {
					lstProcessAction = ProcessActionLocalServiceUtil.getProcessActionByG_SPID_PRESC(groupId,
							serviceProcessId, stepCode);
					for (ProcessAction processAction : lstProcessAction) {

						String[] preConditions = StringUtil.split(processAction.getPreCondition());

						// String createDossierFiles =
						// processAction.getCreateDossierFiles();

						// String returnDossierFiles =
						// processAction.getReturnDossierFiles();

						boolean checkPreCondition = DossierMgtUtils.checkPreCondition(preConditions, dossier);

						if (!checkPreCondition) {
							continue;
						}

						JSONObject result = JSONFactoryUtil.createJSONObject();

						String postStepCode = processAction.getPostStepCode();

						if (Validator.isNull(postStepCode)) {
							continue;
						}

						ProcessStep processStep = ProcessStepLocalServiceUtil.fetchBySC_GID(postStepCode, groupId,
								processAction.getServiceProcessId());

						List<ProcessStepRole> lstProcessStepRole = ProcessStepRoleLocalServiceUtil
								.findByP_S_ID(processStep.getProcessStepId());
						List<User> lstUser = new ArrayList<User>();

						if (Validator.isNotNull(auto) && (processAction.getAutoEvent().equals("submit")
								|| processAction.getAutoEvent().equals("timer"))) {
							// TODO ?
						} else {
							// Check roles

							if (lstProcessStepRole == null || lstProcessStepRole.isEmpty()) {
								// Search in ServiceProcessRole
								List<ServiceProcessRole> serviceProcessRoles = ServiceProcessRoleLocalServiceUtil
										.findByS_P_ID(serviceProcessId);

								for (ServiceProcessRole serviceProcessRole : serviceProcessRoles) {

									List<User> users = UserLocalServiceUtil
											.getRoleUsers(serviceProcessRole.getRoleId());

									if (users != null) {
										for (User user : users) {
											HashMap<String, Object> moderator = new HashMap<>();
											moderator.put("moderator", serviceProcessRole.getModerator());
											user.setModelAttributes(moderator);
										}

										lstUser.addAll(users);
									}

								}
							} else {
								for (ProcessStepRole processStepRole : lstProcessStepRole) {

									List<User> users = UserLocalServiceUtil.getRoleUsers(processStepRole.getRoleId());

									if (users != null) {
										for (User user : users) {
											HashMap<String, Object> moderator = new HashMap<>();
											moderator.put("moderator", processStepRole.getModerator());
											user.setModelAttributes(moderator);
										}

										lstUser.addAll(users);
									}
								}
							}

						}

						result.put("pending", pending);
						result.put("processAction", processAction);
						result.put("lstUser", lstUser);

						results.put(result);
					}
				} catch (Exception e) {
					_log.error(e);
				}
			}
		}

		return results;
	}

	@Override
	public JSONObject getDossierActions(long dossierId, long groupId, Boolean owner, int start, int end, String sort,
			String order, ServiceContext serviceContext) throws PortalException {

		JSONObject result = JSONFactoryUtil.createJSONObject();

		Hits hits = null;

		SearchContext searchContext = new SearchContext();
		searchContext.setCompanyId(serviceContext.getCompanyId());

		try {
			// String referenceUid = null;
			// if (dossierId == 0) {
			// referenceUid = String.valueOf(dossierId);
			// }
			if (start == 0) {
				start = -1;
				end = -1;
			}
			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();

			params.put(Field.GROUP_ID, String.valueOf(groupId));
			params.put(DossierActionTerm.DOSSIER_ID, dossierId);
			if (owner != null && owner.booleanValue()) {
				params.put(Field.USER_ID, serviceContext.getUserId());
			}
			Sort[] sorts = new Sort[] {
					SortFactoryUtil.create(sort + "_sortable", Sort.STRING_TYPE, GetterUtil.getBoolean(order)) };

			hits = DossierActionLocalServiceUtil.searchLucene(params, sorts, start, end, searchContext);

			result.put("data", hits.toList());

			long total = DossierActionLocalServiceUtil.countLucene(params, searchContext);

			result.put("total", total);

		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}

//	@Override
//	public DossierAction doAction(long groupId, Dossier dossier, ProcessOption option, ProcessAction proAction,
//			String actionCode, String actionUser, String actionNote, long assignUserId, long userId, String subUsers,
//			String payment, ServiceContext context) throws PortalException {
//
//		_log.info("START DO ACTION ==========:GroupID: " + groupId);
//
//		// Update DossierSync (if it in the client)
//		context.setUserId(userId);
//		DossierAction dossierAction = null;
//
//		String type = StringPool.BLANK;
//		long dossierId = dossier.getDossierId();
//		String applicantNote = _buildDossierNote(dossier, actionNote, groupId, type);
//		_log.debug("applicantNote: " + applicantNote);
//		dossier.setApplicantNote(applicantNote);
//
//		// update reference dossier
//		DossierAction prvAction = DossierActionLocalServiceUtil.getByNextActionId(dossierId, 0l);
//
//		ServiceProcess serviceProcess = null;
//		long serviceProcessId = 0;
//		if ((option != null || prvAction != null) && proAction != null) {
//			serviceProcessId = (option != null ? option.getServiceProcessId() : prvAction.getServiceProcessId());
//			serviceProcess = ServiceProcessLocalServiceUtil.fetchServiceProcess(serviceProcessId);
//			// Add paymentFile
////			String paymentFee = proAction.getPaymentFee();
//			String paymentFee = StringPool.BLANK;
////			_log.info("Payment fee: " + JSONFactoryUtil.looseSerialize(proAction.getPaymentFee()) + ", request payment: " + proAction.getRequestPayment());
//			if (proAction.getRequestPayment() == ProcessActionTerm.REQUEST_PAYMENT_YEU_CAU_QUYET_TOAN_PHI) {
//
//				JSONObject paymentFeeJSON = null;
//				try {
//					paymentFeeJSON = JSONFactoryUtil.createJSONObject(proAction.getPaymentFee());
//					paymentFee = paymentFeeJSON.has("paymentFee") ? paymentFeeJSON.getString("paymentFee") : StringPool.BLANK;
//				} catch (JSONException e) {
//					_log.debug(e);
//				}
//				PaymentFile oldPaymentFile = PaymentFileLocalServiceUtil.getByG_ID(groupId, dossier.getDossierId());
//				if (oldPaymentFile != null) {
////					//if (Validator.isNotNull(paymentNote))
////					//	oldPaymentFile.setPaymentNote(paymentNote);
////					try {
////						PaymentFile paymentFile = PaymentFileLocalServiceUtil.updateApplicantFeeAmount(
////								oldPaymentFile.getPaymentFileId(), proAction.getRequestPayment(), feeAmount,
////								serviceAmount, shipAmount, paymentNote);
////						
////						String generatorPayURL = PaymentUrlGenerator.generatorPayURL(groupId,
////								paymentFile.getPaymentFileId(), paymentFee, dossierId);
////						
////						JSONObject epaymentProfileJsonNew = JSONFactoryUtil.createJSONObject(paymentFile.getEpaymentProfile());
////						
////						epaymentProfileJsonNew.put("keypayUrl", generatorPayURL);
////						
////						PaymentFileActions actions = new PaymentFileActionsImpl();
////						
////						actions.updateEProfile(dossierId, paymentFile.getReferenceUid(), epaymentProfileJsonNew.toJSONString(),
////								context);
////						
////					} catch (IOException e) {
////						_log.error(e);
////					}
//				} else {
//					_log.info("proAction.getPaymentFee(): "+proAction.getPaymentFee());
//					DossierPaymentUtils.processPaymentFile(proAction, proAction.getPaymentFee(), groupId, dossierId, userId,
//							context, "DKLR_CTN");
//				}
//			} else if (proAction.getRequestPayment() == ProcessActionTerm.REQUEST_PAYMENT_XAC_NHAN_HOAN_THANH_THU_PHI) {
//				String CINVOICEUrl = "postal/invoice";
//				
//				//_log.info("SONDT payment REQUESTPAYMENT 5 ========= "+ JSONFactoryUtil.looseSerialize(payment));
//				
//				JSONObject resultObj = null;
//				Map<String, Object> params = new HashMap<>();
//				//_log.info("SONDT payment REQUESTPAYMENT 5: DOSSIERID ========= "+ dossier.getDossierId());
//				PaymentFile oldPaymentFile = PaymentFileLocalServiceUtil.getByG_ID(groupId, dossier.getDossierId());
//				int intpaymentMethod = 1; // KeyPay
//				//if(Validator.isNotNull(proAction.getPreCondition())) {
//				//	intpaymentMethod = checkPaymentMethodinPrecondition(proAction.getPreCondition());
//				//}
//				if(oldPaymentFile != null){
//					
//					//_log.info("SONDT oldPaymentFile REQUESTPAYMENT 5 ===========================  " + JSONFactoryUtil.looseSerialize(oldPaymentFile));
//					params = createParamsInvoice(oldPaymentFile, dossier, intpaymentMethod);
//					InvokeREST callRest = new InvokeREST();
//					String baseUrl = RESTFulConfiguration.SERVER_PATH_BASE;
//					HashMap<String, String> properties = new HashMap<String, String>();
//					
//					_log.info("START CALL POST API CINVOICEUrl");
//					resultObj = callRest.callPostAPI(groupId, HttpMethod.POST, "application/json", baseUrl,
//							CINVOICEUrl, "", "", properties, params, context);
//					
//				}
//				//_log.info("SONDT resultCINVOICE REQUESTPAYMENT 5 ===========================  " + JSONFactoryUtil.looseSerialize(resultObj));
//				
//				if (Validator.isNotNull(oldPaymentFile) ) {
//					String paymentMethod = "";
//					if (intpaymentMethod != 0) {
//						paymentMethod = checkPaymentMethod(intpaymentMethod);
//					}
//					// C_Invoice
//					if(Validator.isNotNull(resultObj) && resultObj.getLong("status") == 200) {
//						String message = resultObj.getString("message");
//						if (Validator.isNotNull(message)) {
//							String[] splitMessage = message.split("#");
//							JSONObject resultInvoice = JSONFactoryUtil.createJSONObject();
//							resultInvoice.put("EInvoiceNo", splitMessage[1]);
//							resultInvoice.put("EInvoiceSearch", splitMessage[3]);
//							//
//							oldPaymentFile.setEinvoice(resultInvoice.toString());
//						}
//						oldPaymentFile.setInvoicePayload(params.toString());
//						if (Validator.isNotNull(paymentMethod)) {
//							oldPaymentFile.setPaymentMethod(paymentMethod);
//						}
//					}
//					
//					oldPaymentFile.setPaymentStatus(DossierPaymentUtils.convertPaymentStatus(proAction.getRequestPayment()));
//					
//					PaymentFileLocalServiceUtil.updatePaymentFile(oldPaymentFile);
//				}
//				
//				
//			} else if (proAction.getRequestPayment() == ProcessActionTerm.REQUEST_PAYMENT_BAO_DA_NOP_PHI) {
//				PaymentFile oldPaymentFile = PaymentFileLocalServiceUtil.getByG_ID(groupId, dossier.getDossierId());
//				//_log.info("SONDT DOSSIERACTION oldPaymentFile REQUESTPAYMENT 3 ===========================  " + JSONFactoryUtil.looseSerialize(oldPaymentFile));
//				int intpaymentMethod = checkPaymentMethodinPrecondition(proAction.getPreCondition());
//				String paymentMethod = checkPaymentMethod(intpaymentMethod);
//				if (oldPaymentFile != null) {
////					PaymentFileLocalServiceUtil.updateApplicantFeeAmount(oldPaymentFile.getPaymentFileId(),
////							proAction.getRequestPayment(), oldPaymentFile.getFeeAmount(), oldPaymentFile.getServiceAmount(),
////							oldPaymentFile.getShipAmount());
//					oldPaymentFile.setPaymentStatus(DossierPaymentUtils.convertPaymentStatus(proAction.getRequestPayment()));
//					oldPaymentFile.setPaymentMethod(paymentMethod);
//					
//					PaymentFileLocalServiceUtil.updatePaymentFile(oldPaymentFile);
//				}
//			}
//		}
//
//		boolean hasDossierSync = false;
//		if (proAction.getProcessActionId() > 0) {
//			hasDossierSync = hasDossierSync(groupId, dossier, proAction);
//		}
//		boolean isCreateDossier = hasCreateDossier(groupId, dossier, actionCode, serviceProcessId, hasDossierSync);
//
//		// TODO Hard fix for test
//		List<String> types = new ArrayList<>();
//		types.add(OCPSUserUtils.APPLICANT_01);
//		types.add(OCPSUserUtils.APPLICANT_02);
//		types.add(OCPSUserUtils.EMPLOYEE_01);
//		types.add(OCPSUserUtils.EMPLOYEE_02);
//
//		String postStepCode = Validator.isNotNull(proAction.getPostStepCode()) ? proAction.getPostStepCode()
//				: StringPool.BLANK;
//
//		ProcessStep curStep = ProcessStepLocalServiceUtil.fetchBySC_GID(postStepCode, groupId, serviceProcessId);
//
//		//TODO: actionOverDue = 0
//		//int actionOverdue = getActionDueDate(groupId, dossierId, referenceUid, processActionId);
//		int actionOverdue = 0;
//		//TODO: Date dueDate = new Date();
//		//Date dueDate = getDueDate(groupId, dossierId, referenceUid, processActionId);
//		Date dueDate = new Date();
//		//TODO: payload = ""
//		//String payload = buildPayload(groupId, dossierId, referenceUid, processActionId);
//		String payload = StringPool.BLANK;
//
//		// In the special action (actionCode = 1100, save DOSSIER in SERVER)
//		if (actionCode.contentEquals(ConstantsUtils.SPECIAL_ACTION)
//				&& (types.contains(OCPSUserUtils.APPLICANT_01) || types.contains(OCPSUserUtils.APPLICANT_02))) {
//			_log.info("DO_SPECIAL_ACTION");
//
//			// Set dossierStatus is NEW
//			//JSONObject jsStatus = JSONFactoryUtil.createJSONObject();
//			//getDossierStatus(jsStatus, groupId, DOSSIER_SATUS_DC_CODE, DossierStatusConstants.NEW);
//			JSONObject jsonDataStatusText = getStatusText(groupId, ConstantsUtils.DOSSIER_SATUS_DC_CODE, DossierStatusConstants.NEW, StringPool.BLANK);
//
//			dossierAction = DossierActionLocalServiceUtil.updateDossierAction(groupId, 0, dossierId, serviceProcessId,
//					0l, actionCode, actionUser, proAction.getActionName(), actionNote, actionOverdue,
//					proAction.getSyncActionCode(), false, proAction.getRollbackable(), curStep.getStepCode(),
//					curStep.getStepName(), dueDate, 0l, payload, curStep.getStepInstruction(), context);
//			//
//			dossier.setDossierActionId(dossierAction.getDossierActionId());
//
//			// Add DossierActionUser
//			DossierActionUserImpl dossierActionUser = new DossierActionUserImpl();
//
//			_log.debug("subUsers***" + subUsers);
//			if (Validator.isNotNull(subUsers)) {
//				JSONArray subUsersArray = JSONFactoryUtil.createJSONArray(subUsers);
//				dossierActionUser.assignDossierActionUser(dossierAction.getDossierActionId(), userId, groupId,
//						assignUserId, subUsersArray);
//			} else {
//				dossierActionUser.initDossierActionUsers(dossierAction.getDossierActionId(), userId, groupId,
//						assignUserId, curStep.getStepCode());
//			}
//			//update dossierStatus
//			DossierMgtUtils.updateStatus(dossier, DossierStatusConstants.NEW,
//					jsonDataStatusText.getString(DossierStatusConstants.NEW), StringPool.BLANK, StringPool.BLANK,
//					StringPool.BLANK, context);
//
//		} else {
//
//			_log.info("NEXT_ACTION");
//
//			JSONObject jsonDataStatusText = getStatusText(groupId, ConstantsUtils.DOSSIER_SATUS_DC_CODE, curStep.getDossierStatus(),
//					curStep.getDossierSubStatus());
//			_log.info("jsonDataStatusText: "+JSONFactoryUtil.looseSerialize(jsonDataStatusText));
//
//			//update current dossierAction
//			if (prvAction != null) {
//				dossierAction = DossierActionLocalServiceUtil.updateDossierAction(groupId, 0, dossierId, serviceProcessId,
//						prvAction.getDossierActionId(), actionCode, actionUser, proAction.getActionName(), actionNote, actionOverdue,
//						proAction.getSyncActionCode(), hasDossierSync, proAction.getRollbackable(),
//						curStep.getStepCode(), curStep.getStepName(), dueDate, 0l, payload, curStep.getStepInstruction(),
//						context);
//			} else {
//				dossierAction = DossierActionLocalServiceUtil.updateDossierAction(groupId, 0, dossierId, serviceProcessId,
//						0l, actionCode, actionUser, proAction.getActionName(), actionNote, actionOverdue,
//						proAction.getSyncActionCode(), hasDossierSync, proAction.getRollbackable(),
//						curStep.getStepCode(), curStep.getStepName(), dueDate, 0l, payload, curStep.getStepInstruction(),
//						context);
//			}
//			
//			//Update action id to dossier
//			dossier.setDossierActionId(dossierAction.getDossierActionId());
//
//			// Add DossierActionUser
//			DossierActionUserImpl dossierActionUser = new DossierActionUserImpl();
//			if (Validator.isNotNull(subUsers)) {
//				_log.info("PROCESS subUsers != null");
//				JSONArray subUsersArray = JSONFactoryUtil.createJSONArray(subUsers);
//				dossierActionUser.assignDossierActionUser(dossierAction.getDossierActionId(), userId, groupId,
//						assignUserId, subUsersArray);
//			} else {
//				_log.info("PROCESS subUsers == null");
//				dossierActionUser.initDossierActionUsers(dossierAction.getDossierActionId(), userId, groupId,
//						assignUserId, curStep.getStepCode());
//			}
//			//_log.info("UPDATE DOSSIER STATUS************");
//			//_log.info(curStep.getDossierStatus());
//			//_log.info(curStep.getDossierSubStatus());
//			//_log.info("*********************************");
//			// Set dossierStatus by CUR_STEP
//			// LamTV: Update lockState when Sync
//			
//			DossierMgtUtils.updateStatus(dossier, curStep.getDossierStatus(),
//					jsonDataStatusText.getString(curStep.getDossierStatus()), curStep.getDossierSubStatus(),
//					jsonDataStatusText.getString(curStep.getDossierSubStatus()), curStep.getLockState(), context);
//			//.info("status: "+dossier.getDossierStatus());
//			//_log.info(jsStatus.toJSONString());
//			//_log.info(jsSubStatus.toJSONString());
//			//_log.info("dossier_" + dossier.getDossierStatus());
//			//_log.info("*********************************");
//
//			if (Validator.isNull(dossier.getDossierNo())
//					&& (curStep.getDossierStatus().contentEquals(DossierStatusConstants.PAYING)
//							|| (curStep.getDossierStatus().contentEquals(DossierStatusConstants.PROCESSING)))) {
//
//				_log.info("PROCESS getDossierStatus == PAYING or PROCESSING");
//				LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
//				params.put(DossierTerm.GOV_AGENCY_CODE, dossier.getGovAgencyCode());
//				params.put(DossierTerm.SERVICE_CODE, dossier.getServiceCode());
//				params.put(DossierTerm.DOSSIER_TEMPLATE_NO, dossier.getDossierTemplateNo());
//				params.put(DossierTerm.DOSSIER_STATUS, StringPool.BLANK);
//
//				String dossierRef = DossierNumberGenerator.generateDossierNumber(groupId, dossier.getCompanyId(),
//						dossierId, serviceProcess.getProcessNo(), serviceProcess.getDossierNoPattern(), params);
//
//				// Cap nhat ngay tiep nhan khi duoc cap so
//				dossier.setReceiveDate(new Date());
//
//				dossier.setDossierNo(dossierRef.trim());
//				
//				// To index
//				//DossierLocalServiceUtil.syncDossier(dossier);
//			}
//			// TODO: Hot fix COP
//			boolean flagCOP = false;
//			if (Validator.isNull(dossier.getDossierNo())) {
//				if (curStep.getDossierStatus().contentEquals(DossierStatusConstants.WAITING)) {
//					if (curStep.getDossierSubStatus().equalsIgnoreCase("waiting_4")) {
//						flagCOP = true;
//					}
//					if (curStep.getDossierSubStatus().equalsIgnoreCase("waiting_3")) {
//						flagCOP = true;
//					}
//					if (curStep.getDossierSubStatus().equalsIgnoreCase("waiting_8")) {
//						flagCOP = true;
//					}
//					if (curStep.getDossierSubStatus().equalsIgnoreCase("waiting_15")) {
//						flagCOP = true;
//					}
//				}
//			}
//
//			if (flagCOP) {
//				_log.info("PROCESS getDossierStatus " + curStep.getDossierStatus());
//				LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
//				params.put(DossierTerm.GOV_AGENCY_CODE, dossier.getGovAgencyCode());
//				params.put(DossierTerm.SERVICE_CODE, dossier.getServiceCode());
//				params.put(DossierTerm.DOSSIER_TEMPLATE_NO, dossier.getDossierTemplateNo());
//				params.put(DossierTerm.DOSSIER_STATUS, StringPool.BLANK);
//
//				String dossierRef = DossierNumberGenerator.generateDossierNumber(groupId, dossier.getCompanyId(),
//						dossierId, serviceProcess.getProcessNo(), serviceProcess.getDossierNoPattern(), params);
//
//				// Cap nhat ngay tiep nhan khi duoc cap so
//				dossier.setReceiveDate(new Date());
//				
//				dossier.setDossierNo(dossierRef.trim());
//				// To index
//				//DossierLocalServiceUtil.syncDossier(dossier);
//			}
//
//			// update nextActionId
//			_log.info("prvAction:" + prvAction);
//			if (Validator.isNotNull(prvAction)) {
//				DossierActionLocalServiceUtil.updateNextActionId(prvAction.getDossierActionId(),
//						dossierAction.getDossierActionId());
//			}
//
//			_log.info("hasDossierSync:" + hasDossierSync);
//			if (hasDossierSync) {
//				// SyncAction
//				//int method = 0;
//				_log.info("PROCESS update Dossier Sync:" + hasDossierSync);
//				DossierSyncLocalServiceUtil.updateDossierSync(groupId, userId, dossierId, dossier.getReferenceUid(),
//						isCreateDossier, 0, dossierAction.getPrimaryKey(), StringPool.BLANK,
//						serviceProcess.getServerNo());
//
//				// Comment code process pre-develop
//				List<DossierFile> lsDossierFile = DossierFileLocalServiceUtil.getAllDossierFile(dossierId);
//				// check return file
//				List<String> returnDossierFileTemplateNos = ListUtil
//						.toList(StringUtil.split(proAction.getReturnDossierFiles()));
//				_log.debug("__return dossierFiles" + proAction.getReturnDossierFiles());
//				if (lsDossierFile != null && lsDossierFile.size() > 0) {
//					for (DossierFile dosserFile : lsDossierFile) {
//						_log.debug("&&&StartUpdateDossierFile" + new Date());
//						dosserFile.setIsNew(false);
//						DossierFileLocalServiceUtil.updateDossierFile(dosserFile);
//						_log.debug("&&&EndUpdateDossierFile" + new Date());
//
//						if (returnDossierFileTemplateNos.contains(dosserFile.getFileTemplateNo())) {
//							_log.info("START SYNC DOSSIER FILE"+ new Date());
//							DossierSyncLocalServiceUtil.updateDossierSync(groupId, userId, dossierId,
//									dossier.getReferenceUid(), false, 1, dosserFile.getDossierFileId(),
//									dosserFile.getReferenceUid(), serviceProcess.getServerNo());
//						}
//					}
//				}
//
//			}
//
//			String preCondition = proAction.getPreCondition();
//			String autoEvent = proAction.getAutoEvent();
//			_log.debug("preCondition: " + preCondition);
//
//			// LamTV: Process case auto Event
//			boolean flagEvent = false;
//			if (Validator.isNotNull(autoEvent) && autoEvent.toLowerCase().contentEquals("timmer")) {
//				flagEvent = true;
//			}
//
//			if (Validator.isNotNull(preCondition)) {
//				// case reject_cancelling
//				_log.info("REJECT_CANCELLING....");
//
//				if (preCondition.toLowerCase().contentEquals("reject_cancelling")) {
//					// flag-off
//					_log.info("DO REJECT_CANCELLING....");
//
//					Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
//					_log.info("DO REJECT_CANCELLING.... FIND RESOURCE");
//
//					sourceDossier.setCancellingDate(null);
//					DossierLocalServiceUtil.updateDossier(sourceDossier);
//
//					dossier.setCancellingDate(null);
//					//DossierLocalServiceUtil.updateDossier(dossier);
//
//					// in CLIENT
//					String refUid = PortalUUIDUtil.generate();
//					int status = 2;
//
//					DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "reject_cancelling",
//							actionNote, 0, status, context);
//
//					// in SERVER
//					context.setScopeGroupId(sourceDossier.getGroupId());
//					DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(), refUid,
//							"reject_cancelling", actionNote, 0, status, context);
//					context.setScopeGroupId(dossier.getGroupId());
//				}
//
//				// LamTV: Update status when approved canceling
//				if (preCondition.toLowerCase().contentEquals("cancelling")) {
//					// flag-off
//					_log.info("START CANCELLING....");
//
//					// in CLIENT
//
//					String refUid = PortalUUIDUtil.generate();
//					int status = 1;
//
//					DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "cancelling",
//							actionNote, 0, status, context);
//
//					// in SERVER
//
//					Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
//					if (sourceDossier != null) {
//						context.setScopeGroupId(sourceDossier.getGroupId());
//						DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(), refUid,
//								"cancelling", actionNote, 0, status, context);
//					}
//
//					context.setScopeGroupId(dossier.getGroupId());
//
//				}
//
//				_log.info("REJECT_SUBMIT....");
//				if (preCondition.toLowerCase().contentEquals("reject_submitting")) {
//					// flag-off
//					_log.info("DO REJECT_SUBMIT....");
//
//					Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
//					_log.info("DO REJECT_SUBMIT.... FIND RESOURCE");
//
//					sourceDossier.setEndorsementDate(null);
//					DossierLocalServiceUtil.updateDossier(sourceDossier);
//
//					dossier.setEndorsementDate(null);
//					// To index
//					//DossierLocalServiceUtil.syncDossier(dossier);
//
//					String refUid = PortalUUIDUtil.generate();
//					int status = 2;
//
//					DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "reject_submitting",
//							actionNote, 0, status, context);
//
//					// in SERVER
//					context.setScopeGroupId(sourceDossier.getGroupId());
//					DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(), refUid,
//							"reject_submitting", actionNote, 0, status, context);
//
//					context.setScopeGroupId(dossier.getGroupId());
//
//				}
//
//				// LamTV: Update process approved endorsement
//				if (preCondition.toLowerCase().contentEquals("submitting")) {
//					if (flagEvent) {
//						// flag-off
//						_log.info("START APPROVED SUBMIT....");
//
//						String refUid = PortalUUIDUtil.generate();
//						int status = 3;
//
//						DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "submitting",
//								actionNote, 0, status, context);
//
//						// in SERVER
//						Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
//						if (sourceDossier != null) {
//							context.setScopeGroupId(sourceDossier.getGroupId());
//							DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(),
//									refUid, "submitting", actionNote, 0, status, context);
//						}
//
//						context.setScopeGroupId(dossier.getGroupId());
//					} else {
//						// flag-off
//						_log.info("START APPROVED SUBMIT....");
//
//						String refUid = PortalUUIDUtil.generate();
//						int status = 1;
//
//						DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "submitting",
//								actionNote, 0, status, context);
//
//						// in SERVER
//						Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
//						if (sourceDossier != null) {
//							context.setScopeGroupId(sourceDossier.getGroupId());
//							DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(),
//									refUid, "submitting", actionNote, 0, status, context);
//						}
//
//						context.setScopeGroupId(dossier.getGroupId());
//					}
//
//				}
//
//				_log.info("REJECT_CORRECTING....");
//				if (preCondition.toLowerCase().contentEquals("reject_correcting")) {
//					// flag-off
//					_log.info("DO REJECT_CORRECTING....");
//
//					Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
//					_log.info("DO REJECT_CORRECTING.... FIND RESOURCE");
//
//					sourceDossier.setCorrecttingDate(null);
//					DossierLocalServiceUtil.updateDossier(sourceDossier);
//
//					dossier.setCorrecttingDate(null);
//					// To index
//					//DossierLocalServiceUtil.syncDossier(dossier);
//
//					String refUid = PortalUUIDUtil.generate();
//					int status = 2;
//
//					DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "reject_correcting",
//							actionNote, 0, status, context);
//
//					// in SERVER
//
//					context.setScopeGroupId(sourceDossier.getGroupId());
//					DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(), refUid,
//							"reject_correcting", actionNote, 0, status, context);
//
//					context.setScopeGroupId(dossier.getGroupId());
//
//				}
//
//				// LamTV: Update process approved correcting
//				if (preCondition.toLowerCase().contentEquals("correcting")) {
//					if (flagEvent) {
//						// flag-off
//						_log.info("START APPROVED CORRECTING....");
//
//						String refUid = PortalUUIDUtil.generate();
//						int status = 3;
//
//						// IN CLIENT
//						DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "correcting",
//								actionNote, 0, status, context);
//
//						// IN SERVER
//						Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
//						if (sourceDossier != null) {
//							context.setScopeGroupId(sourceDossier.getGroupId());
//							DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(),
//									refUid, "correcting", actionNote, 0, status, context);
//						}
//						context.setScopeGroupId(dossier.getGroupId());
//					} else {
//						// flag-off
//						_log.info("START APPROVED CORRECTING....");
//
//						String refUid = PortalUUIDUtil.generate();
//						int status = 1;
//
//						// IN CLIENT
//						DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "correcting",
//								actionNote, 0, status, context);
//
//						// IN SERVER
//						Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
//						if (sourceDossier != null) {
//							context.setScopeGroupId(sourceDossier.getGroupId());
//							DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(),
//									refUid, "correcting", actionNote, 0, status, context);
//						}
//						context.setScopeGroupId(dossier.getGroupId());
//					}
//				}
//
//			}
//
//			List<PaymentFile> syncPaymentFileList = PaymentFileLocalServiceUtil.getByDID_ISN(dossierId, true);
//			if (syncPaymentFileList != null && syncPaymentFileList.size() > 0) {
//				for (PaymentFile spf : syncPaymentFileList) {
//					// Hard-code
//					_log.info("PROCESS PaymentFile START");
//					if (groupId != ConstantsUtils.GROUP_CTN) {
//						DossierSyncLocalServiceUtil.updateDossierSync(groupId, userId, dossierId,
//								dossier.getReferenceUid(), false, 3, spf.getPrimaryKey(), spf.getReferenceUid(),
//								serviceProcess.getServerNo());
//					}
//				}
//			}
//		}
//
//		ProcessStep postStep = ProcessStepLocalServiceUtil.fetchBySC_GID(postStepCode, groupId, serviceProcessId);
//
//		String dossierBriefNote = DossierContentGenerator.getBriefNote(dossier, postStep.getBriefNote());
//		if (Validator.isNotNull(dossierBriefNote)) {
//			dossier.setBriefNote(dossierBriefNote);
//		}
//		//Reindex dossier
//		Dossier dossierUpdate = DossierLocalServiceUtil.updateDossier(dossier);
//		//_log.info("dossier: "+dossier);
//
//		// do plugin auto
//
//		// 1. get current Step
//		// 2. get all plugins of this step
//		// 3. get plugin has autoRun
//		// 4. Create update formData
//
////		_log.info("IN_CURRENT_STEP:" + curStep.getStepCode() + curStep.getStepName());
//		
//		List<ProcessPlugin> pluginList = ProcessPluginLocalServiceUtil.getBySC_SPID_ARUN(serviceProcessId,
//				curStep.getStepCode(), true);
//		
//		_log.info("AND_HAVE_AUTO_RUN_PLUGINS:" + pluginList.size());
//		if (pluginList != null && pluginList.size() > 0) {
//			for (ProcessPlugin plg : pluginList) {
//				// do create file
//				String fileTemplateNo = StringUtil.replaceFirst(plg.getSampleData(), "#", StringPool.BLANK);
//
//				_doAutoRun(groupId, fileTemplateNo, dossierId, dossierUpdate.getDossierTemplateNo(),
//						dossierUpdate.getDossierActionId(), context);
//			}
//		}
//
//		//Process write CSDL
//		if (dossierAction != null) {
//			VRBussinessUtils.processVRBussiness(groupId, dossier, dossierAction, 1, payload.toString());
//		}
//
//		_log.info("END DO ACTION ==========");
//		return dossierAction;
//	}

	@Override
	public DossierAction doAction(long groupId, Dossier dossier, ProcessOption option, ProcessAction proAction,
			String actionCode, String actionUser, String actionNote, long assignUserId, long userId, String subUsers,
			String payment, ServiceContext context) throws PortalException {


		DossierAction dossierAction = null;
		try {
			_log.info("START DO ACTION ==========:GroupID: " + groupId + " - DossierId: " + dossier.getDossierId());
			JSONObject payloadSync = JSONFactoryUtil.createJSONObject();

			// Update DossierSync (if it in the client)
			context.setUserId(userId);

			String type = StringPool.BLANK;
			long dossierId = dossier.getDossierId();
			String applicantNote = _buildDossierNote(dossier, actionNote, groupId, type);
			_log.debug("applicantNote: " + applicantNote);
			dossier.setApplicantNote(applicantNote);

			// update reference dossier
			DossierAction prvAction = DossierActionLocalServiceUtil.getByNextActionId(dossierId, 0l);

			ServiceProcess serviceProcess = null;
			long serviceProcessId = 0;
			if ((option != null || prvAction != null) && proAction != null) {
				serviceProcessId = (option != null ? option.getServiceProcessId() : prvAction.getServiceProcessId());
				serviceProcess = ServiceProcessLocalServiceUtil.fetchServiceProcess(serviceProcessId);
				// Add paymentFile
//			String paymentFee = proAction.getPaymentFee();
				String paymentFee = StringPool.BLANK;
//			_log.info("Payment fee: " + JSONFactoryUtil.looseSerialize(proAction.getPaymentFee()) + ", request payment: " + proAction.getRequestPayment());
				if (proAction.getRequestPayment() == ProcessActionTerm.REQUEST_PAYMENT_YEU_CAU_QUYET_TOAN_PHI) {

					JSONObject paymentFeeJSON = null;
					try {
						paymentFeeJSON = JSONFactoryUtil.createJSONObject(proAction.getPaymentFee());
						paymentFee = paymentFeeJSON.has("paymentFee") ? paymentFeeJSON.getString("paymentFee")
								: StringPool.BLANK;
					} catch (JSONException e) {
						_log.debug(e);
					}
					PaymentFile oldPaymentFile = PaymentFileLocalServiceUtil.getByG_ID(groupId, dossier.getDossierId());
					if (oldPaymentFile != null) {
//					//if (Validator.isNotNull(paymentNote))
//					//	oldPaymentFile.setPaymentNote(paymentNote);
//					try {
//						PaymentFile paymentFile = PaymentFileLocalServiceUtil.updateApplicantFeeAmount(
//								oldPaymentFile.getPaymentFileId(), proAction.getRequestPayment(), feeAmount,
//								serviceAmount, shipAmount, paymentNote);
//						
//						String generatorPayURL = PaymentUrlGenerator.generatorPayURL(groupId,
//								paymentFile.getPaymentFileId(), paymentFee, dossierId);
//						
//						JSONObject epaymentProfileJsonNew = JSONFactoryUtil.createJSONObject(paymentFile.getEpaymentProfile());
//						
//						epaymentProfileJsonNew.put("keypayUrl", generatorPayURL);
//						
//						PaymentFileActions actions = new PaymentFileActionsImpl();
//						
//						actions.updateEProfile(dossierId, paymentFile.getReferenceUid(), epaymentProfileJsonNew.toJSONString(),
//								context);
//						
//					} catch (IOException e) {
//						_log.error(e);
//					}
					} else {
						_log.info("proAction.getPaymentFee(): " + proAction.getPaymentFee());
						JSONObject jPaymentFile = DossierPaymentUtils.processPaymentFileNew(proAction,
								proAction.getPaymentFee(), groupId, dossierId, userId, context, "DKLR_CTN");
						if (jPaymentFile.length() > 0) {
							payloadSync.put(ConstantsUtils.PAYLOAD_SYNC_PAYMENTFILE, jPaymentFile);
						}
					}
				} else if (proAction
						.getRequestPayment() == ProcessActionTerm.REQUEST_PAYMENT_XAC_NHAN_HOAN_THANH_THU_PHI) {
					String CINVOICEUrl = "postal/invoice";

					// _log.info("SONDT payment REQUESTPAYMENT 5 ========= "+
					// JSONFactoryUtil.looseSerialize(payment));

					JSONObject resultObj = null;
					Map<String, Object> params = new HashMap<>();
					// _log.info("SONDT payment REQUESTPAYMENT 5: DOSSIERID ========= "+
					// dossier.getDossierId());
					PaymentFile oldPaymentFile = PaymentFileLocalServiceUtil.getByG_ID(groupId, dossier.getDossierId());
					int intpaymentMethod = 1; // KeyPay
					// if(Validator.isNotNull(proAction.getPreCondition())) {
					// intpaymentMethod =
					// checkPaymentMethodinPrecondition(proAction.getPreCondition());
					// }
					if (oldPaymentFile != null) {

						// _log.info("SONDT oldPaymentFile REQUESTPAYMENT 5 ===========================
						// " + JSONFactoryUtil.looseSerialize(oldPaymentFile));
						params = createParamsInvoice(oldPaymentFile, dossier, intpaymentMethod);
						InvokeREST callRest = new InvokeREST();
						String baseUrl = RESTFulConfiguration.SERVER_PATH_BASE;
						HashMap<String, String> properties = new HashMap<String, String>();

						_log.info("START CALL POST API CINVOICEUrl");
						resultObj = callRest.callPostAPI(groupId, HttpMethod.POST, "application/json", baseUrl,
								CINVOICEUrl, "", "", properties, params, context);

					}
					// _log.info("SONDT resultCINVOICE REQUESTPAYMENT 5 ===========================
					// " + JSONFactoryUtil.looseSerialize(resultObj));

					if (Validator.isNotNull(oldPaymentFile)) {
						String paymentMethod = "";
						if (intpaymentMethod != 0) {
							paymentMethod = checkPaymentMethod(intpaymentMethod);
						}
						// C_Invoice
						if (Validator.isNotNull(resultObj) && resultObj.getLong("status") == 200) {
							String message = resultObj.getString("message");
							if (Validator.isNotNull(message)) {
								String[] splitMessage = message.split("#");
								JSONObject resultInvoice = JSONFactoryUtil.createJSONObject();
								resultInvoice.put("EInvoiceNo", splitMessage[1]);
								resultInvoice.put("EInvoiceSearch", splitMessage[3]);
								//
								oldPaymentFile.setEinvoice(resultInvoice.toString());
							}
							oldPaymentFile.setInvoicePayload(params.toString());
							if (Validator.isNotNull(paymentMethod)) {
								oldPaymentFile.setPaymentMethod(paymentMethod);
							}
						}

						oldPaymentFile.setPaymentStatus(
								DossierPaymentUtils.convertPaymentStatus(proAction.getRequestPayment()));

						PaymentFileLocalServiceUtil.updatePaymentFile(oldPaymentFile);
					}

				} else if (proAction.getRequestPayment() == ProcessActionTerm.REQUEST_PAYMENT_BAO_DA_NOP_PHI) {
					PaymentFile oldPaymentFile = PaymentFileLocalServiceUtil.getByG_ID(groupId, dossier.getDossierId());
					// _log.info("SONDT DOSSIERACTION oldPaymentFile REQUESTPAYMENT 3
					// =========================== " +
					// JSONFactoryUtil.looseSerialize(oldPaymentFile));
					int intpaymentMethod = checkPaymentMethodinPrecondition(proAction.getPreCondition());
					String paymentMethod = checkPaymentMethod(intpaymentMethod);
					if (oldPaymentFile != null) {
//					PaymentFileLocalServiceUtil.updateApplicantFeeAmount(oldPaymentFile.getPaymentFileId(),
//							proAction.getRequestPayment(), oldPaymentFile.getFeeAmount(), oldPaymentFile.getServiceAmount(),
//							oldPaymentFile.getShipAmount());
						oldPaymentFile.setPaymentStatus(
								DossierPaymentUtils.convertPaymentStatus(proAction.getRequestPayment()));
						oldPaymentFile.setPaymentMethod(paymentMethod);

						PaymentFileLocalServiceUtil.updatePaymentFile(oldPaymentFile);
					}
				}
			}

			boolean hasDossierSync = false;
			if (proAction.getProcessActionId() > 0) {
				hasDossierSync = hasDossierSync(groupId, dossier, proAction);
			}
			boolean isCreateDossier = hasCreateDossier(groupId, dossier, actionCode, serviceProcessId, hasDossierSync);

			// TODO Hard fix for test
			List<String> types = new ArrayList<>();
			types.add(OCPSUserUtils.APPLICANT_01);
			types.add(OCPSUserUtils.APPLICANT_02);
			types.add(OCPSUserUtils.EMPLOYEE_01);
			types.add(OCPSUserUtils.EMPLOYEE_02);

			String postStepCode = Validator.isNotNull(proAction.getPostStepCode()) ? proAction.getPostStepCode()
					: StringPool.BLANK;

			ProcessStep curStep = ProcessStepLocalServiceUtil.fetchBySC_GID(postStepCode, groupId, serviceProcessId);

			// TODO: actionOverDue = 0
			// int actionOverdue = getActionDueDate(groupId, dossierId, referenceUid,
			// processActionId);
			int actionOverdue = 0;
			// TODO: Date dueDate = new Date();
			// Date dueDate = getDueDate(groupId, dossierId, referenceUid, processActionId);
			Date dueDate = new Date();
			// TODO: payload = ""
			// String payload = buildPayload(groupId, dossierId, referenceUid,
			// processActionId);
			String payload = StringPool.BLANK;

			// In the special action (actionCode = 1100, save DOSSIER in SERVER)
			if (actionCode.contentEquals(ConstantsUtils.SPECIAL_ACTION)
					&& (types.contains(OCPSUserUtils.APPLICANT_01) || types.contains(OCPSUserUtils.APPLICANT_02))) {
				_log.info("DO_SPECIAL_ACTION");

				// Set dossierStatus is NEW
				// JSONObject jsStatus = JSONFactoryUtil.createJSONObject();
				// getDossierStatus(jsStatus, groupId, DOSSIER_SATUS_DC_CODE,
				// DossierStatusConstants.NEW);
				JSONObject jsonDataStatusText = getStatusText(groupId, ConstantsUtils.DOSSIER_SATUS_DC_CODE,
						DossierStatusConstants.NEW, StringPool.BLANK);

				dossierAction = DossierActionLocalServiceUtil.updateDossierAction(groupId, 0, dossierId,
						serviceProcessId, 0l, actionCode, actionUser, proAction.getActionName(), actionNote,
						actionOverdue, proAction.getSyncActionCode(), false, proAction.getRollbackable(),
						curStep.getStepCode(), curStep.getStepName(), dueDate, 0l, payload,
						curStep.getStepInstruction(), context);
				//
				dossier.setDossierActionId(dossierAction.getDossierActionId());

				// Add DossierActionUser
				DossierActionUserImpl dossierActionUser = new DossierActionUserImpl();

				_log.debug("subUsers***" + subUsers);
				if (Validator.isNotNull(subUsers)) {
					JSONArray subUsersArray = JSONFactoryUtil.createJSONArray(subUsers);
					dossierActionUser.assignDossierActionUser(dossierAction.getDossierActionId(), userId, groupId,
							assignUserId, subUsersArray);
				} else {
					dossierActionUser.initDossierActionUsers(dossierAction.getDossierActionId(), userId, groupId,
							assignUserId, curStep.getStepCode());
				}
				// update dossierStatus
				DossierMgtUtils.updateStatus(dossier, DossierStatusConstants.NEW,
						jsonDataStatusText.getString(DossierStatusConstants.NEW), StringPool.BLANK, StringPool.BLANK,
						StringPool.BLANK, context);

			} else {

				_log.info("NEXT_ACTION");

				JSONObject jsonDataStatusText = getStatusText(groupId, ConstantsUtils.DOSSIER_SATUS_DC_CODE,
						curStep.getDossierStatus(), curStep.getDossierSubStatus());
				_log.info("jsonDataStatusText: " + JSONFactoryUtil.looseSerialize(jsonDataStatusText));

				// update current dossierAction
				if (prvAction != null) {
					dossierAction = DossierActionLocalServiceUtil.updateDossierAction(groupId, 0, dossierId,
							serviceProcessId, prvAction.getDossierActionId(), actionCode, actionUser,
							proAction.getActionName(), actionNote, actionOverdue, proAction.getSyncActionCode(),
							hasDossierSync, proAction.getRollbackable(), curStep.getStepCode(), curStep.getStepName(),
							dueDate, 0l, payload, curStep.getStepInstruction(), context);
				} else {
					dossierAction = DossierActionLocalServiceUtil.updateDossierAction(groupId, 0, dossierId,
							serviceProcessId, 0l, actionCode, actionUser, proAction.getActionName(), actionNote,
							actionOverdue, proAction.getSyncActionCode(), hasDossierSync, proAction.getRollbackable(),
							curStep.getStepCode(), curStep.getStepName(), dueDate, 0l, payload,
							curStep.getStepInstruction(), context);
				}

				// Update action id to dossier
				dossier.setDossierActionId(dossierAction.getDossierActionId());

				// Add DossierActionUser
				DossierActionUserImpl dossierActionUser = new DossierActionUserImpl();
				if (Validator.isNotNull(subUsers)) {
					_log.info("PROCESS subUsers != null");
					JSONArray subUsersArray = JSONFactoryUtil.createJSONArray(subUsers);
					dossierActionUser.assignDossierActionUser(dossierAction.getDossierActionId(), userId, groupId,
							assignUserId, subUsersArray);
				} else {
					_log.info("PROCESS subUsers == null");
					dossierActionUser.initDossierActionUsers(dossierAction.getDossierActionId(), userId, groupId,
							assignUserId, curStep.getStepCode());
				}
				_log.info("UPDATE DOSSIER STATUS FOR DOSSIER_ID: " + dossier.getDossierId() + "************");
				_log.info(curStep.getDossierStatus());
				_log.info(curStep.getDossierSubStatus());
				_log.info("*********************************");
				// Set dossierStatus by CUR_STEP
				// LamTV: Update lockState when Sync

				DossierMgtUtils.updateStatus(dossier, curStep.getDossierStatus(),
						jsonDataStatusText.getString(curStep.getDossierStatus()), curStep.getDossierSubStatus(),
						jsonDataStatusText.getString(curStep.getDossierSubStatus()), curStep.getLockState(), context);

				_log.info("==> dossier: " + dossier);
				// .info("status: "+dossier.getDossierStatus());
				// _log.info(jsStatus.toJSONString());
				// _log.info(jsSubStatus.toJSONString());
				// _log.info("dossier_" + dossier.getDossierStatus());
				// _log.info("*********************************");

				if (Validator.isNull(dossier.getDossierNo())
						&& (curStep.getDossierStatus().contentEquals(DossierStatusConstants.PAYING)
								|| (curStep.getDossierStatus().contentEquals(DossierStatusConstants.PROCESSING)))) {

					_log.info("PROCESS getDossierStatus == PAYING or PROCESSING");
					LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
					params.put(DossierTerm.GOV_AGENCY_CODE, dossier.getGovAgencyCode());
					params.put(DossierTerm.SERVICE_CODE, dossier.getServiceCode());
					params.put(DossierTerm.DOSSIER_TEMPLATE_NO, dossier.getDossierTemplateNo());
					params.put(DossierTerm.DOSSIER_STATUS, StringPool.BLANK);

					String dossierRef = DossierNumberGenerator.generateDossierNumber(groupId, dossier.getCompanyId(),
							dossierId, serviceProcess.getProcessNo(), serviceProcess.getDossierNoPattern(), params);

					// Cap nhat ngay tiep nhan khi duoc cap so
					dossier.setReceiveDate(new Date());

					dossier.setDossierNo(dossierRef.trim());

					// To index
					// DossierLocalServiceUtil.syncDossier(dossier);
				}
				// TODO: Hot fix COP
				boolean flagCOP = false;
				if (Validator.isNull(dossier.getDossierNo())) {
					if (curStep.getDossierStatus().contentEquals(DossierStatusConstants.WAITING)) {
						if (curStep.getDossierSubStatus().equalsIgnoreCase("waiting_4")) {
							flagCOP = true;
						}
						if (curStep.getDossierSubStatus().equalsIgnoreCase("waiting_3")) {
							flagCOP = true;
						}
						if (curStep.getDossierSubStatus().equalsIgnoreCase("waiting_8")) {
							flagCOP = true;
						}
						if (curStep.getDossierSubStatus().equalsIgnoreCase("waiting_15")) {
							flagCOP = true;
						}
					}
				}

				if (flagCOP) {
					_log.info("PROCESS getDossierStatus " + curStep.getDossierStatus());
					LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
					params.put(DossierTerm.GOV_AGENCY_CODE, dossier.getGovAgencyCode());
					params.put(DossierTerm.SERVICE_CODE, dossier.getServiceCode());
					params.put(DossierTerm.DOSSIER_TEMPLATE_NO, dossier.getDossierTemplateNo());
					params.put(DossierTerm.DOSSIER_STATUS, StringPool.BLANK);

					String dossierRef = DossierNumberGenerator.generateDossierNumber(groupId, dossier.getCompanyId(),
							dossierId, serviceProcess.getProcessNo(), serviceProcess.getDossierNoPattern(), params);

					// Cap nhat ngay tiep nhan khi duoc cap so
					dossier.setReceiveDate(new Date());

					dossier.setDossierNo(dossierRef.trim());
					// To index
					// DossierLocalServiceUtil.syncDossier(dossier);
				}

				// update nextActionId
				_log.info("prvAction:" + prvAction);
				if (Validator.isNotNull(prvAction)) {
					DossierActionLocalServiceUtil.updateNextActionId(prvAction.getDossierActionId(),
							dossierAction.getDossierActionId());
				}

				_log.info("hasDossierSync:" + hasDossierSync);
				if (hasDossierSync) {
					// Comment code process pre-develop
					List<DossierFile> lsDossierFile = DossierFileLocalServiceUtil.getAllDossierFile(dossierId);
					// check return file
					List<String> returnDossierFileTemplateNos = ListUtil
							.toList(StringUtil.split(proAction.getReturnDossierFiles()));
					_log.debug("__return dossierFiles" + proAction.getReturnDossierFiles());
					if (lsDossierFile != null && lsDossierFile.size() > 0) {
						JSONArray arrayDossierFile = JSONFactoryUtil.createJSONArray();
						for (DossierFile dosserFile : lsDossierFile) {
							_log.debug("&&&StartUpdateDossierFile" + new Date());
							dosserFile.setIsNew(false);
							DossierFileLocalServiceUtil.updateDossierFile(dosserFile);
							_log.debug("&&&EndUpdateDossierFile" + new Date());

							if (returnDossierFileTemplateNos.contains(dosserFile.getFileTemplateNo())) {
								_log.info("START SYNC DOSSIER FILE" + new Date());
								JSONObject jDossierFile = JSONFactoryUtil.createJSONObject();
								jDossierFile.put("groupId", groupId);
								jDossierFile.put("userId", userId);
								jDossierFile.put("dossierId", dossierId);
								jDossierFile.put("dossierReferenceUid", dosserFile.getReferenceUid());
								jDossierFile.put("createDossier", false);
								jDossierFile.put("method", 1);
								jDossierFile.put("classPK", dosserFile.getDossierFileId());
								jDossierFile.put("fileReferenceUid", dosserFile.getReferenceUid());
								jDossierFile.put("serverNo", serviceProcess.getServerNo());
								arrayDossierFile.put(jDossierFile);
							}
						}
						if (arrayDossierFile.length() > 0) {
							payloadSync.put(ConstantsUtils.PAYLOAD_SYNC_FILES, arrayDossierFile);
						}
					}
				}

				String preCondition = proAction.getPreCondition();
				String autoEvent = proAction.getAutoEvent();
				_log.debug("preCondition: " + preCondition);

				// LamTV: Process case auto Event
				boolean flagEvent = false;
				if (Validator.isNotNull(autoEvent) && autoEvent.toLowerCase().contentEquals("timmer")) {
					flagEvent = true;
				}

				if (Validator.isNotNull(preCondition)) {
					// case reject_cancelling
					_log.info("REJECT_CANCELLING....");

					if (preCondition.toLowerCase().contentEquals("reject_cancelling")) {
						// flag-off
						_log.info("DO REJECT_CANCELLING....");

						Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
						_log.info("DO REJECT_CANCELLING.... FIND RESOURCE");

						sourceDossier.setCancellingDate(null);
						DossierLocalServiceUtil.updateDossier(sourceDossier);

						dossier.setCancellingDate(null);
						// DossierLocalServiceUtil.updateDossier(dossier);

						// in CLIENT
						String refUid = PortalUUIDUtil.generate();
						int status = 2;

						DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "reject_cancelling",
								actionNote, 0, status, context);

						// in SERVER
						context.setScopeGroupId(sourceDossier.getGroupId());
						DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(), refUid,
								"reject_cancelling", actionNote, 0, status, context);
						context.setScopeGroupId(dossier.getGroupId());
					}

					// LamTV: Update status when approved canceling
					if (preCondition.toLowerCase().contentEquals("cancelling")) {
						// flag-off
						_log.info("START CANCELLING....");

						// in CLIENT

						String refUid = PortalUUIDUtil.generate();
						int status = 1;

						DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "cancelling",
								actionNote, 0, status, context);

						// in SERVER

						Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
						if (sourceDossier != null) {
							context.setScopeGroupId(sourceDossier.getGroupId());
							DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(),
									refUid, "cancelling", actionNote, 0, status, context);
						}

						context.setScopeGroupId(dossier.getGroupId());

					}

					_log.info("REJECT_SUBMIT....");
					if (preCondition.toLowerCase().contentEquals("reject_submitting")) {
						// flag-off
						_log.info("DO REJECT_SUBMIT....");

						Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
						_log.info("DO REJECT_SUBMIT.... FIND RESOURCE");

						sourceDossier.setEndorsementDate(null);
						DossierLocalServiceUtil.updateDossier(sourceDossier);

						dossier.setEndorsementDate(null);
						// To index
						// DossierLocalServiceUtil.syncDossier(dossier);

						String refUid = PortalUUIDUtil.generate();
						int status = 2;

						DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "reject_submitting",
								actionNote, 0, status, context);

						// in SERVER
						context.setScopeGroupId(sourceDossier.getGroupId());
						DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(), refUid,
								"reject_submitting", actionNote, 0, status, context);

						context.setScopeGroupId(dossier.getGroupId());

					}

					// LamTV: Update process approved endorsement
					if (preCondition.toLowerCase().contentEquals("submitting")) {
						if (flagEvent) {
							// flag-off
							_log.info("START APPROVED SUBMIT....");

							String refUid = PortalUUIDUtil.generate();
							int status = 3;

							DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "submitting",
									actionNote, 0, status, context);

							// in SERVER
							Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
							if (sourceDossier != null) {
								context.setScopeGroupId(sourceDossier.getGroupId());
								DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(),
										refUid, "submitting", actionNote, 0, status, context);
							}

							context.setScopeGroupId(dossier.getGroupId());
						} else {
							// flag-off
							_log.info("START APPROVED SUBMIT....");

							String refUid = PortalUUIDUtil.generate();
							int status = 1;

							DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "submitting",
									actionNote, 0, status, context);

							// in SERVER
							Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
							if (sourceDossier != null) {
								context.setScopeGroupId(sourceDossier.getGroupId());
								DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(),
										refUid, "submitting", actionNote, 0, status, context);
							}

							context.setScopeGroupId(dossier.getGroupId());
						}

					}

					_log.info("REJECT_CORRECTING....");
					if (preCondition.toLowerCase().contentEquals("reject_correcting")) {
						// flag-off
						_log.info("DO REJECT_CORRECTING....");

						Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
						_log.info("DO REJECT_CORRECTING.... FIND RESOURCE");

						sourceDossier.setCorrecttingDate(null);
						DossierLocalServiceUtil.updateDossier(sourceDossier);

						dossier.setCorrecttingDate(null);
						// To index
						// DossierLocalServiceUtil.syncDossier(dossier);

						String refUid = PortalUUIDUtil.generate();
						int status = 2;

						DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "reject_correcting",
								actionNote, 0, status, context);

						// in SERVER

						context.setScopeGroupId(sourceDossier.getGroupId());
						DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(), refUid,
								"reject_correcting", actionNote, 0, status, context);

						context.setScopeGroupId(dossier.getGroupId());

					}

					// LamTV: Update process approved correcting
					if (preCondition.toLowerCase().contentEquals("correcting")) {
						if (flagEvent) {
							// flag-off
							_log.info("START APPROVED CORRECTING....");

							String refUid = PortalUUIDUtil.generate();
							int status = 3;

							// IN CLIENT
							DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "correcting",
									actionNote, 0, status, context);

							// IN SERVER
							Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
							if (sourceDossier != null) {
								context.setScopeGroupId(sourceDossier.getGroupId());
								DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(),
										refUid, "correcting", actionNote, 0, status, context);
							}
							context.setScopeGroupId(dossier.getGroupId());
						} else {
							// flag-off
							_log.info("START APPROVED CORRECTING....");

							String refUid = PortalUUIDUtil.generate();
							int status = 1;

							// IN CLIENT
							DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossierId, refUid, "correcting",
									actionNote, 0, status, context);

							// IN SERVER
							Dossier sourceDossier = DossierLocalServiceUtil.getByRef(55217, dossier.getReferenceUid());
							if (sourceDossier != null) {
								context.setScopeGroupId(sourceDossier.getGroupId());
								DossierRequestUDLocalServiceUtil.updateDossierRequest(0, sourceDossier.getDossierId(),
										refUid, "correcting", actionNote, 0, status, context);
							}
							context.setScopeGroupId(dossier.getGroupId());
						}
					}
				}

				List<PaymentFile> syncPaymentFileList = PaymentFileLocalServiceUtil.getByDID_ISN(dossierId, true);
				if (syncPaymentFileList != null && syncPaymentFileList.size() > 0) {
					JSONArray arrayPaymentStatus = JSONFactoryUtil.createJSONArray();
					for (PaymentFile spf : syncPaymentFileList) {
						// Hard-code
						_log.info("PROCESS PaymentFile START");
						if (groupId != ConstantsUtils.GROUP_CTN) {
							// Add by Dungnv
							JSONObject jPaymentStatus = JSONFactoryUtil.createJSONObject();
							jPaymentStatus.put("groupId", groupId);
							jPaymentStatus.put("userId", userId);
							jPaymentStatus.put("dossierId", dossierId);
							jPaymentStatus.put("dossierReferenceUid", dossier.getReferenceUid());
							jPaymentStatus.put("createDossier", false);
							jPaymentStatus.put("method", 3);
							jPaymentStatus.put("classPK", spf.getPrimaryKey());
							jPaymentStatus.put("fileReferenceUid", spf.getReferenceUid());
							jPaymentStatus.put("serverNo", serviceProcess.getServerNo());
							arrayPaymentStatus.put(jPaymentStatus);
						}
					}
					if (arrayPaymentStatus.length() > 0) {
						payloadSync.put(ConstantsUtils.PAYLOAD_SYNC_PAYMENTSTATUS, arrayPaymentStatus);
					}
				}
				if (hasDossierSync) {
					_log.info("PROCESS update Dossier Sync:" + hasDossierSync);
					DossierSyncLocalServiceUtil.updateDossierSync(groupId, userId, dossierId, dossier.getReferenceUid(),
							isCreateDossier, 0, dossierAction.getPrimaryKey(), StringPool.BLANK,
							serviceProcess.getServerNo(), payloadSync.toJSONString(), 0, 2);
				} else {
					if (payloadSync.has(ConstantsUtils.PAYLOAD_SYNC_PAYMENTFILE)
							|| payloadSync.has(ConstantsUtils.PAYLOAD_SYNC_PAYMENTSTATUS)) {
						_log.info("PROCESS update Dossier Sync:" + hasDossierSync);
						DossierSyncLocalServiceUtil.updateDossierSync(groupId, userId, dossierId,
								dossier.getReferenceUid(), isCreateDossier, 0, dossierAction.getPrimaryKey(),
								StringPool.BLANK, serviceProcess.getServerNo(), payloadSync.toJSONString(), 0, 2);
					}
				}
			}

			ProcessStep postStep = ProcessStepLocalServiceUtil.fetchBySC_GID(postStepCode, groupId, serviceProcessId);

			String dossierBriefNote = DossierContentGenerator.getBriefNote(dossier, postStep.getBriefNote());
			if (Validator.isNotNull(dossierBriefNote)) {
				dossier.setBriefNote(dossierBriefNote);
			}
			// Reindex dossier
			Dossier dossierUpdate = DossierLocalServiceUtil.updateDossier(dossier);
			_log.info("==> dossierUpdate: " + dossierUpdate);
			// _log.info("dossier: "+dossier);

			// do plugin auto

			// 1. get current Step
			// 2. get all plugins of this step
			// 3. get plugin has autoRun
			// 4. Create update formData

//		_log.info("IN_CURRENT_STEP:" + curStep.getStepCode() + curStep.getStepName());

			List<ProcessPlugin> pluginList = ProcessPluginLocalServiceUtil.getBySC_SPID_ARUN(serviceProcessId,
					curStep.getStepCode(), true);

			_log.info("AND_HAVE_AUTO_RUN_PLUGINS:" + pluginList.size());
			if (pluginList != null && pluginList.size() > 0) {
				for (ProcessPlugin plg : pluginList) {
					// do create file
					String fileTemplateNo = StringUtil.replaceFirst(plg.getSampleData(), "#", StringPool.BLANK);

					_doAutoRun(groupId, fileTemplateNo, dossierId, dossierUpdate.getDossierTemplateNo(),
							dossierUpdate.getDossierActionId(), context);
				}
			}

			// Process write CSDL
			if (dossierAction != null) {
				VRBusinessUtils.processVRBussiness(groupId, dossier, dossierAction, 1, payload.toString());

				// Add by Dungnv - Add trackchanges and history
				if (groupId == ConstantsUtils.GROUP_CXL) {
					context.setScopeGroupId(groupId);
					List<DossierFile> dossierFiles = DossierFileLocalServiceUtil.getAllDossierFile(dossierId);
					for (DossierFile dossierFile : dossierFiles) {
						VRBusinessUtils.updateVRTrackchangesAndVRHistoryProfileForDossier(
								dossierFile.getFormDataDossierFile(), dossierFile.getDossierPartNo(),
								dossierFile.getDossierTemplateNo(), dossierId, dossier.getCompanyId(),
								dossierFile.getFileEntryId(), context);
					}
				}
			}
		} catch (Exception e) {
			_log.info("Error in dossierActions.doAction()");
			_log.error(e);
		}

		_log.info("END DO ACTION ==========");
		return dossierAction;
	}

	private void _doAutoRun(long groupId, String fileTemplateNo, long dossierId, String dossierTemplateNo,
			long dossierActionId, ServiceContext context) {

		// String formData = StringPool.BLANK;
		// fileTemplateNo = StringUtil.replaceFirst(fileTemplateNo, "#",
		// StringPool.BLANK);
		long now = System.currentTimeMillis();

		_log.info("@@@@@ START_DOAUTORUN: " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));

		try {
			// Dossier dossier = DossierLocalServiceUtil.getDossier(dossierId);

			DossierFile dossierFile = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_First(dossierId,
					fileTemplateNo, false, new DossierFileComparator(false, "createDate", Date.class));

			_log.info("- DOSSIER_FILE 1: " + (System.currentTimeMillis() - now));

			DossierPart dossierPart = DossierPartLocalServiceUtil.getByFileTemplateNo(groupId, fileTemplateNo);

			_log.info("- DOSSIER_PART	: " + (System.currentTimeMillis() - now));

			String formData = AutoFillFormData.sampleDataBinding(dossierPart.getSampleData(), dossierId, context);

			_log.info("- FORM_DATA		: " + (System.currentTimeMillis() - now));

			if (Validator.isNull(dossierFile)) {

				DossierFileActions actions = new DossierFileActionsImpl();

				dossierFile = actions.addDossierFile(groupId, dossierId, PortalUUIDUtil.generate(), dossierTemplateNo,
						dossierPart.getPartNo(), fileTemplateNo, dossierPart.getPartName(), StringPool.BLANK, 0L, null,
						StringPool.BLANK, String.valueOf(false), dossierActionId, context);

				_log.info("- ADD DOSSIER_FL		: " + (System.currentTimeMillis() - now));

			}

			DossierFileActions actions = new DossierFileActionsImpl();
			actions.updateDossierFileFormData(groupId, dossierId, dossierActionId, dossierFile.getReferenceUid(),
					formData, context);

			// DossierFileLocalServiceUtil.updateFormDataPlugin(groupId, dossierId,
			// dossierFile.getReferenceUid(), formData, context);
			_log.info("- UPDATE DSR_ACT		: " + (System.currentTimeMillis() - now));

		} catch (Exception e) {
			_log.info("Cant get formdata with fileTemplateNo_" + fileTemplateNo);
		}

		_log.info("!!!! END_DOAUTORUN: " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));

	}

	@Override
	public Dossier markerVisited(long groupId, long dossierId, String referenceUid) throws PortalException {
		return null;
	}

	@Override
	public DossierAction doRollback(long groupId, long dossierId, String referenceUid, long userId)
			throws PortalException {
		return null;
	}

	@Override
	public JSONObject getContacts(long groupId, long dossierId, String referenceUid) throws PortalException {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		// get DossierAction
		DossierAction dossierAction = DossierActionLocalServiceUtil.getByNextActionId(dossierId, 0);
		long dossierActionId = dossierAction.getDossierActionId();
		List<DossierActionUser> listUser = DossierActionUserLocalServiceUtil.getListUser(dossierActionId);
		result.put("listUser", listUser);
		return result;
	}

	protected long getNextActionId(long groupId, long dossierId, String refId, ProcessAction currentAction) {

		return 0l;
	}

	// LamTV_Process get dossierStatus and dossierSubStatus text
	private JSONObject getStatusText(long groupId, String collectionCode, String curStatus, String curSubStatus) {

		JSONObject jsonData = null;
		DictCollection dc = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode(collectionCode, groupId);

		if (Validator.isNotNull(dc) && Validator.isNotNull(curStatus)) {
			jsonData = JSONFactoryUtil.createJSONObject();
			DictItem it = DictItemLocalServiceUtil.fetchByF_dictItemCode(curStatus, dc.getPrimaryKey(), groupId);
			if (Validator.isNotNull(it)) {
				jsonData.put(curStatus, it.getItemName());
				if (Validator.isNotNull(curSubStatus)) {
					DictItem dItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(curSubStatus, dc.getPrimaryKey(),
							groupId);
					if (Validator.isNotNull(dItem)) {
						jsonData.put(curSubStatus, dItem.getItemName());
					}
				}
			}
		}

		return jsonData;
	}

	protected void getDossierStatus(JSONObject ob, long groupId, String collectionCode, String itemCode) {

		DictCollection dc = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode(collectionCode, groupId);

		if (Validator.isNotNull(dc)) {
			DictItem it = DictItemLocalServiceUtil.fetchByF_dictItemCode(itemCode, dc.getPrimaryKey(), groupId);

			if (Validator.isNotNull(it)) {
				ob.put(itemCode, it.getItemName());
			}
		}
	}

	protected boolean isSubmitType(ProcessAction processAction) {
		if (processAction.getAutoEvent().contentEquals(ConstantsUtils.AUTO_EVENT_SUBMIT)) {
			return true;
		} else {
			return false;
		}
	}

	protected Date getDueDate(long groupId, long dossierId, String refId, long processActionId) {

		return new Date();
	}

	protected String buildPayload(long groupId, long dossierId, String refId, long processActionId) {

		return StringPool.BLANK;
	}

	protected int getActionDueDate(long groupId, Dossier dossier, long processActionId) {

		return 0;
	}

	protected Dossier getDossier(long groupId, long dossierId, String refId) throws PortalException {

		Dossier dossier = null;

		if (dossierId != 0) {
			dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
		} else {
			dossier = DossierLocalServiceUtil.getByRef(groupId, refId);
		}

		return dossier;
	}

	protected boolean hasCreateDossier(long groupId, Dossier dossier, String actionCode, long serviceProcessId,
			boolean hasDossierSync) throws PortalException {

		// boolean isCreate = false;
		// Dossier dossier = getDossier(groupId, dossierId, refId);
		// ProcessAction action = getProcessAction(groupId, dossierId, refId,
		// actionCode, serviceProcessId);
		// String postStepCode = action.getPostStepCode();
		// ProcessStep step =
		// ProcessStepLocalServiceUtil.fetchBySC_GID(postStepCode, groupId,
		// serviceProcessId);

		// DOSSIER has nextAction form NEW to PROCESSING that it was created on
		// client and it wasn't created ONLINE
		if (hasDossierSync && DossierStatusConstants.NEW.contentEquals(dossier.getDossierStatus())
				&& !dossier.isOnline()) {
			return true;
		}

		return false;
	}

	protected boolean hasDossierSync(long groupId, Dossier dossier, ProcessAction action) throws PortalException {

		// Dossier dossier = getDossier(groupId, dossierId, refId);
		boolean isSync = false;
		if (dossier.getOnline() && action.getSyncActionCode().length() != 0) {
			isSync = true;
		}

		_log.info("ISSYNC_" + isSync);
		return isSync;

	}

	protected boolean forcedDossierSync(long groupId, long dossierId, String refId, ProcessAction action,
			boolean isSubmit) throws PortalException {

		Dossier dossier = getDossier(groupId, dossierId, refId);

		boolean isSync = false;

		if (!isSubmit && dossier.getOnline() && (action.getSyncActionCode().length() != 0
				&& action.getSyncActionCode().contains(StringPool.EXCLAMATION))) {
			isSync = true;
		}

		return isSync;

	}

	protected ProcessAction getProcessAction(long groupId, long dossierId, String refId, String actionCode,
			long serviceProcessId) throws PortalException {

		ProcessAction action = null;

		try {
			List<ProcessAction> actions = ProcessActionLocalServiceUtil.getByActionCode(groupId, actionCode,
					serviceProcessId);
			Dossier dossier = getDossier(groupId, dossierId, refId);

			String dossierStatus = dossier.getDossierStatus();

			String dossierSubStatus = Validator.isNull(dossier.getDossierSubStatus()) ? StringPool.BLANK
					: dossier.getDossierSubStatus();

			for (ProcessAction act : actions) {

				String preStepCode = act.getPreStepCode();

				ProcessStep step = ProcessStepLocalServiceUtil.fetchBySC_GID(preStepCode, groupId, serviceProcessId);

				String subStepStatus = StringPool.BLANK;

				if (Validator.isNotNull(step)) {
					subStepStatus = Validator.isNull(step.getDossierSubStatus()) ? StringPool.BLANK
							: step.getDossierSubStatus();
				}

				if (Validator.isNull(step)) {
					action = act;
					break;
				} else {
					// _log.info("ENNNN***NNN888888888888888888888");

					_log.info(step.getDossierStatus() + "_" + dossierStatus);

					if (step.getDossierStatus().contentEquals(dossierStatus)
							&& subStepStatus.contentEquals(dossierSubStatus)) {

						action = act;
						break;
					}
				}
			}

		} catch (Exception e) {

			_log.error(e);

			throw new NotFoundException("ProcessActionNotFoundException with actionCode= " + actionCode
					+ "|serviceProcessId= " + serviceProcessId + "|referenceUid= " + refId + "|groupId= " + groupId);
		}

		return action;
	}

	@Override
	public Dossier initDossier(long groupId, long dossierId, String referenceUid, int counter, String serviceCode,
			String serviceName, String govAgencyCode, String govAgencyName, String applicantName,
			String applicantIdType, String applicantIdNo, String applicantIdDate, String address, String cityCode,
			String cityName, String districtCode, String districtName, String wardCode, String wardName,
			String contactName, String contactTelNo, String contactEmail, String dossierTemplateNo, String password,
			int viaPostal, String postalAddress, String postalCityCode, String postalCityName, String postalTelNo,
			boolean online, boolean notification, String applicantNote, ServiceContext context) throws PortalException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date appIdDate = null;

		try {
			appIdDate = sdf.parse(applicantIdDate);

		} catch (Exception e) {
			_log.debug(e);
		}

		Dossier dossier = null;

		try {

			dossier = DossierLocalServiceUtil.initDossier(groupId, dossierId, referenceUid, counter, serviceCode,
					serviceName, govAgencyCode, govAgencyName, applicantName, applicantIdType, applicantIdNo, appIdDate,
					address, cityCode, cityName, districtCode, districtName, wardCode, wardName, contactName,
					contactTelNo, contactEmail, dossierTemplateNo, password, viaPostal, postalAddress, postalCityCode,
					postalCityName, postalTelNo, online, notification, applicantNote, context);

		} catch (Exception e) {
			_log.error(e);
		}

		return dossier;
	}

	@Override
	public Dossier assignDossierToProcess(long dossierId, String dossierNote, String submissionNote, String briefNote,
			String dossierNo, long folderId, long dossierActionId, String serverNo, ServiceContext context)
			throws PortalException {

		return DossierLocalServiceUtil.assignToProcess(dossierId, dossierNote, submissionNote, briefNote, dossierNo,
				folderId, dossierActionId, serverNo, context);
	}

	protected DossierAction getDossierAction(long dossierId, String actionCode) {

		DossierAction dossierAction = DossierActionLocalServiceUtil.getDossierActionbyDossierIdandActionCode(dossierId,
				actionCode);

		return dossierAction;
	}

	protected List<ProcessAction> getListProcessAtion(long serviceProcessId) throws PortalException {

		List<ProcessAction> lstprocessAction = ProcessActionLocalServiceUtil
				.getProcessActionbyServiceProcessId(serviceProcessId);

		return lstprocessAction;

	}

	protected List<ProcessStep> getListProcessStep(long serviceProcessId) throws PortalException {

		List<ProcessStep> lstprocessStep = ProcessStepLocalServiceUtil
				.getProcessStepbyServiceProcessId(serviceProcessId);

		return lstprocessStep;

	}

	protected Log _log = LogFactoryUtil.getLog(DossierActionsImpl.class);

	@Override
	public Dossier cloneDossier(long groupId, long dossierId, ServiceContext context) throws PortalException {

		Dossier srcDossier = DossierLocalServiceUtil.fetchDossier(dossierId);

		long desDossierId = CounterLocalServiceUtil.increment(Dossier.class.getName());

		srcDossier.setUuid(UUID.randomUUID().toString());
		srcDossier.setDossierId(desDossierId);
		srcDossier.setDossierStatus(StringPool.BLANK);
		srcDossier.setDossierStatusText(StringPool.BLANK);
		srcDossier.setDossierSubStatus(StringPool.BLANK);
		srcDossier.setDossierSubStatusText(StringPool.BLANK);

		int counter = DossierNumberGenerator.counterDossier(srcDossier.getUserId(), groupId);
		String referenceUid = DossierNumberGenerator.generateReferenceUID(groupId);

		srcDossier.setCounter(counter);
		srcDossier.setReferenceUid(referenceUid);

		Dossier desDossier = DossierLocalServiceUtil.addDossier(srcDossier);

		DossierFileLocalServiceUtil.cloneDossierFilesByDossierId(groupId, srcDossier.getPrimaryKey(), dossierId, 1,
				context);

		return desDossier;
	}

	@Override
	public JSONObject getDossierTodo(long userId, long companyId, long groupId, LinkedHashMap<String, Object> params,
			Sort[] sorts, ServiceContext serviceContext) {

		JSONObject result = JSONFactoryUtil.createJSONObject();

		SearchContext searchContext = new SearchContext();

		searchContext.setCompanyId(companyId);

		String statusCode = StringPool.BLANK;

		String subStatusCode = StringPool.BLANK;

		JSONArray statistics = JSONFactoryUtil.createJSONArray();

		long total = 0;

		try {
			DictCollection dictCollection = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode("DOSSIER_STATUS",
					groupId);
			statusCode = GetterUtil.getString(params.get(DossierTerm.STATUS));

			subStatusCode = GetterUtil.getString(params.get(DossierTerm.SUBSTATUS));

			if (Validator.isNotNull(statusCode) || Validator.isNotNull(subStatusCode)) {
				DictItem dictItem = null;
				if (Validator.isNotNull(statusCode)) {
					dictItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(statusCode,
							dictCollection.getDictCollectionId(), groupId);
				} else {
					dictItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(subStatusCode,
							dictCollection.getDictCollectionId(), groupId);
				}

				if (dictItem != null) {
					long count = DossierLocalServiceUtil.countLucene(params, searchContext);

					JSONObject statistic = JSONFactoryUtil.createJSONObject();
					statistic.put("dossierStatus", statusCode);
					statistic.put("dossierSubStatus", subStatusCode);
					statistic.put("level", dictItem.getLevel());
					statistic.put("statusName", dictItem.getItemName());
					statistic.put("count", count);

					statistics.put(statistic);

					total = count;
				}

			} else {

				// DictItem: treeIndex chua luu dung nen chua dung duoc ham nay
				/*
				 * List<DictItem> dictItems = DictItemLocalServiceUtil.findByF_dictCollectionId(
				 * dictCollection.getDictCollectionId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				 * new DictItemComparator(false, "treeIndex", String.class));
				 * 
				 * for (DictItem dictItem : dictItems) { statusCode = dictItem.getLevel() == 0 ?
				 * dictItem.getItemCode() : StringPool.BLANK; subStatusCode =
				 * dictItem.getLevel() == 1 ? dictItem.getItemCode() : StringPool.BLANK;
				 * params.put(DossierTerm.DOSSIER_STATUS, statusCode);
				 * params.put(DossierTerm.DOSSIER_SUB_STATUS, subStatusCode); long count =
				 * DossierLocalServiceUtil.countLucene(params, searchContext);
				 * 
				 * JSONObject statistic = JSONFactoryUtil.createJSONObject();
				 * 
				 * statistic.put("dossierStatus", statusCode); statistic.put("dossierSubStatus",
				 * subStatusCode); statistic.put("level", dictItem.getLevel());
				 * statistic.put("statusName", dictItem.getItemName()); statistic.put("count",
				 * count); total += count; statistics.put(statistic); }
				 */

				/*
				 * List<DictItem> dictItems = DictItemLocalServiceUtil
				 * .findByF_dictCollectionId_parentItemId(dictCollection. getDictCollectionId(),
				 * 0);
				 * 
				 * 
				 * for (DictItem dictItem : dictItems) {
				 * 
				 * statusCode = dictItem.getItemCode(); subStatusCode = StringPool.BLANK;
				 * 
				 * params.put(DossierTerm.STATUS, statusCode); params.put(DossierTerm.SUBSTATUS,
				 * subStatusCode);
				 * 
				 * long count = DossierLocalServiceUtil.countLucene(params, searchContext);
				 * 
				 * JSONObject statistic = JSONFactoryUtil.createJSONObject();
				 * 
				 * statistic.put("dossierStatus", statusCode); statistic.put("dossierSubStatus",
				 * subStatusCode); statistic.put("level", dictItem.getLevel());
				 * statistic.put("statusName", dictItem.getItemName()); statistic.put("count",
				 * count); total += count; statistics.put(statistic);
				 * 
				 * List<DictItem> childDictItems = DictItemLocalServiceUtil.
				 * findByF_dictCollectionId_parentItemId( dictCollection.getDictCollectionId(),
				 * dictItem.getDictItemId());
				 * 
				 * if (childDictItems != null) { for (DictItem childDictItem : childDictItems) {
				 * 
				 * subStatusCode = childDictItem.getItemCode();
				 * 
				 * statusCode = StringPool.BLANK;
				 * 
				 * params.put(DossierTerm.STATUS, statusCode);
				 * 
				 * params.put(DossierTerm.SUBSTATUS, subStatusCode);
				 * 
				 * long childCount = DossierLocalServiceUtil.countLucene(params, searchContext);
				 * 
				 * JSONObject childStatistic = JSONFactoryUtil.createJSONObject();
				 * 
				 * childStatistic.put("dossierStatus", dictItem.getItemCode());
				 * childStatistic.put("dossierSubStatus", subStatusCode);
				 * childStatistic.put("level", childDictItem.getLevel());
				 * childStatistic.put("statusName", childDictItem.getItemName());
				 * childStatistic.put("count", childCount);
				 * 
				 * // Khong tinh tong so cua con do da tinh tong cua // cha // total +=
				 * childCount; statistics.put(childStatistic); } } }
				 */

				List<DictItem> dictItems = DictItemLocalServiceUtil
						.findByF_dictCollectionId(dictCollection.getDictCollectionId());

				for (DictItem dictItem : dictItems) {

					statusCode = StringPool.BLANK;
					subStatusCode = StringPool.BLANK;

					if (dictItem.getParentItemId() != 0) {
						subStatusCode = dictItem.getItemCode();
						DictItem parentDictItem = DictItemLocalServiceUtil.getDictItem(dictItem.getParentItemId());
						statusCode = parentDictItem.getItemCode();
					} else {
						statusCode = dictItem.getItemCode();
					}
					params.put(DossierTerm.STATUS, statusCode);
					params.put(DossierTerm.SUBSTATUS, subStatusCode);

					long count = DossierLocalServiceUtil.countLucene(params, searchContext);

					JSONObject statistic = JSONFactoryUtil.createJSONObject();

					statistic.put("dossierStatus", statusCode);
					statistic.put("dossierSubStatus", subStatusCode);
					statistic.put("level", dictItem.getLevel());
					statistic.put("statusName", dictItem.getItemName());
					statistic.put("count", count);
					if (dictItem.getParentItemId() == 0) {
						total += count;
					}

					statistics.put(statistic);
				}
			}

			result.put("data", statistics);

			result.put("total", total);

		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}

	// @Override
	// public JSONObject getDossierTodoPermission(long userId, long companyId,
	// long groupId,
	// LinkedHashMap<String, Object> params, Sort[] sorts, ServiceContext
	// serviceContext) {
	//
	// JSONObject result = JSONFactoryUtil.createJSONObject();
	//
	// SearchContext searchContext = new SearchContext();
	//
	// searchContext.setCompanyId(companyId);
	//
	// String statusCode = StringPool.BLANK;
	//
	// String subStatusCode = StringPool.BLANK;
	//
	// JSONArray statistics = JSONFactoryUtil.createJSONArray();
	//
	// long total = 0;
	//
	// try {
	// DictCollection dictCollection =
	// DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode("DOSSIER_STATUS",
	// groupId);
	// statusCode = GetterUtil.getString(params.get(DossierTerm.STATUS));
	//
	// subStatusCode = GetterUtil.getString(params.get(DossierTerm.SUBSTATUS));
	//
	// if (Validator.isNotNull(statusCode) ||
	// Validator.isNotNull(subStatusCode)) {
	// DictItem dictItem = null;
	// if (Validator.isNotNull(statusCode)) {
	// dictItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(statusCode,
	// dictCollection.getDictCollectionId(), groupId);
	// } else {
	// dictItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(subStatusCode,
	// dictCollection.getDictCollectionId(), groupId);
	// }
	//
	// if (dictItem != null) {
	// long count = DossierLocalServiceUtil.countLucene(params, searchContext);
	//
	// JSONObject statistic = JSONFactoryUtil.createJSONObject();
	// statistic.put("dossierStatus", statusCode);
	// statistic.put("dossierSubStatus", subStatusCode);
	// statistic.put("level", dictItem.getLevel());
	// statistic.put("statusName", dictItem.getItemName());
	// statistic.put("count", count);
	//
	// statistics.put(statistic);
	//
	// total = count;
	// }
	//
	// } else {
	// List<DictItem> dictItems = DictItemLocalServiceUtil
	// .findByF_dictCollectionId(dictCollection.getDictCollectionId());
	//
	// for (DictItem dictItem : dictItems) {
	//
	// statusCode = StringPool.BLANK;
	// subStatusCode = StringPool.BLANK;
	//
	// if (dictItem.getParentItemId() != 0) {
	// subStatusCode = dictItem.getItemCode();
	// DictItem parentDictItem =
	// DictItemLocalServiceUtil.getDictItem(dictItem.getParentItemId());
	// statusCode = parentDictItem.getItemCode();
	// } else {
	// statusCode = dictItem.getItemCode();
	// }
	//
	// boolean isPermission = checkPermission(statusCode, subStatusCode,
	// groupId, userId);
	//
	// if (isPermission) {
	// params.put(DossierTerm.STATUS, statusCode);
	// params.put(DossierTerm.SUBSTATUS, subStatusCode);
	//
	// long count = DossierLocalServiceUtil.countLucene(params, searchContext);
	//
	// JSONObject statistic = JSONFactoryUtil.createJSONObject();
	//
	// statistic.put("dossierStatus", statusCode);
	// statistic.put("dossierSubStatus", subStatusCode);
	// statistic.put("level", dictItem.getLevel());
	// statistic.put("statusName", dictItem.getItemName());
	// statistic.put("count", count);
	// if (dictItem.getParentItemId() == 0) {
	// total += count;
	// }
	// statistics.put(statistic);
	// }
	//
	// }
	// }
	//
	// result.put("data", statistics);
	//
	// result.put("total", total);
	//
	// } catch (Exception e) {
	// _log.error(e);
	// }
	//
	// return result;
	// }

	private String _buildDossierNote(Dossier dossier, String actionNote, long groupId, String type) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String defaultTimezone = TimeZone.getDefault().getID();
		sdf.setTimeZone(TimeZone.getTimeZone(defaultTimezone));
		Date date = new Date();

		StringBuilder sb = new StringBuilder();

		String oldNote = dossier.getApplicantNote();
		_log.debug("oldNote: " + oldNote);

		if (Validator.isNotNull(oldNote) && oldNote.contains("<br>")) {
			if (Validator.isNotNull(actionNote)) {
				if (groupId != 55217) {
					sb.append("<br>");
					sb.append("[" + sdf.format(date) + "]");
					sb.append(": ");
					sb.append(actionNote);
					sb.append(oldNote);
				} else {
					sb.append("<br>");
					sb.append("[" + sdf.format(date) + "]");
					sb.append(": ");
					sb.append(actionNote);
				}
			} else {
				if (groupId != 55217) {
					sb.append(oldNote);
				}
			}
		} else if (Validator.isNotNull(actionNote)) {
			sb.append("<br>");
			sb.append("[" + sdf.format(date) + "]");
			sb.append(": ");
			sb.append(actionNote);
		}

		return sb.toString();

	}

	private boolean checkPermission_bk1(String status, String subStatus, long groupId, long userId) {
		boolean isPermission = false;

		List<Role> roleList = RoleLocalServiceUtil.getUserRelatedRoles(userId, groupId);

		for (Role role : roleList) {
			List<ProcessStepRole> processStepRoles = ProcessStepRoleLocalServiceUtil.findByP_RID(role.getRoleId());
			for (ProcessStepRole processStepRole : processStepRoles) {
				ProcessStep processStep = ProcessStepLocalServiceUtil
						.fetchProcessStep(processStepRole.getProcessStepId());

				if (processStep != null && processStep.getDossierStatus().equals(status)
						&& processStep.getDossierSubStatus().equals(subStatus)) {
					return true;
				}
			}
		}

		return isPermission;
	}

	private boolean checkPermission(String status, String subStatus, List<ProcessStep> stepList) {
		boolean isPermission = false;

		if (stepList != null && stepList.size() > 0) {
			for (ProcessStep processStep : stepList) {
				if (processStep != null && processStep.getDossierStatus().equals(status)
						&& processStep.getDossierSubStatus().equals(subStatus)) {
					return true;
				}
			}
		}
		return isPermission;
	}

	@Override
	public JSONObject getDossierTodoPermission(long userId, long companyId, long groupId,
			LinkedHashMap<String, Object> params, Sort[] sorts, ServiceContext serviceContext) {

		JSONObject result = JSONFactoryUtil.createJSONObject();

		SearchContext searchContext = new SearchContext();

		searchContext.setCompanyId(companyId);

		String statusCode = StringPool.BLANK;

		String subStatusCode = StringPool.BLANK;

		JSONArray statistics = JSONFactoryUtil.createJSONArray();

		long total = 0;

		try {
			DictCollection dictCollection = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode("DOSSIER_STATUS",
					groupId);
			statusCode = GetterUtil.getString(params.get(DossierTerm.STATUS));

			subStatusCode = GetterUtil.getString(params.get(DossierTerm.SUBSTATUS));

			_log.info("====>statusCode "+statusCode);
			_log.info("====>subStatusCode "+subStatusCode);
			if (Validator.isNotNull(statusCode) || Validator.isNotNull(subStatusCode)) {
				DictItem dictItem = null;
				if (Validator.isNotNull(statusCode)) {
					dictItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(statusCode,
							dictCollection.getDictCollectionId(), groupId);
				} else {
					dictItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(subStatusCode,
							dictCollection.getDictCollectionId(), groupId);
				}

				if (dictItem != null) {
					long count = DossierLocalServiceUtil.countLucene(params, searchContext);

					JSONObject statistic = JSONFactoryUtil.createJSONObject();
					statistic.put("dossierStatus", statusCode);
					statistic.put("dossierSubStatus", subStatusCode);
					statistic.put("level", dictItem.getLevel());
					statistic.put("statusName", dictItem.getItemName());
					statistic.put("count", count);

					statistics.put(statistic);

					total = count;
				}

			} else {
				List<DictItem> dictItems = DictItemLocalServiceUtil
						.findByF_dictCollectionId(dictCollection.getDictCollectionId());

				long now = System.currentTimeMillis();
				// _log.info("START TODO: "+ new Date());
				if (dictItems != null && dictItems.size() > 0) {
					List<ProcessStep> stepList = ProcessStepLocalServiceUtil.getProcessStepbyUserId(userId);
					for (DictItem dictItem : dictItems) {
						String metaData = dictItem.getMetaData();
						String specialStatus = StringPool.BLANK;
						if (Validator.isNotNull(metaData)) {
							// _log.info("metaData: " +metaData);
							try {
								JSONObject metaJson = JSONFactoryUtil.createJSONObject(metaData);
								specialStatus = metaJson.getString("specialStatus");
								// _log.info("specialStatus: " +specialStatus);

							} catch (Exception e) {
								_log.debug(e);
							}
						}

						statusCode = StringPool.BLANK;
						subStatusCode = StringPool.BLANK;
						// Get info status of dossier
						if (dictItem.getParentItemId() != 0) {
							subStatusCode = dictItem.getItemCode();
							// _log.info("subStatusCode: " +subStatusCode);
							DictItem parentDictItem = DictItemLocalServiceUtil.getDictItem(dictItem.getParentItemId());
							statusCode = parentDictItem.getItemCode();
							// _log.info("statusCode: " +statusCode);
						} else {
							statusCode = dictItem.getItemCode();
							// _log.info("statusCode: " +statusCode);
						}
						// Check permission user login
						// _log.info("isPermission Time: "+ (System.currentTimeMillis() - now));
						boolean isPermission = checkPermission(statusCode, subStatusCode, stepList);
						// _log.info("isPermission Time End: "+ (System.currentTimeMillis() - now));

						if (isPermission) {
							// _log.info("isPermission: " +isPermission);
							// _log.info("userId: " +userId);
							// _log.info("strdossierActionId: " +sb.toString());

							JSONObject statistic = JSONFactoryUtil.createJSONObject();

							if (Validator.isNotNull(specialStatus) && Boolean.parseBoolean(specialStatus)) {
								// Add params
								params.put(DossierTerm.STATUS, statusCode);
								params.put(DossierTerm.SUBSTATUS, subStatusCode);
								// params.put(DossierTerm.DOSSIER_ACTION_ID,
								// sb.toString());
								params.put(DossierTerm.FOLLOW, String.valueOf(true));

								long count = DossierLocalServiceUtil.countLucene(params, searchContext);
								// _log.info("count: " + count);

								statistic.put("dossierStatus", statusCode);
								statistic.put("dossierSubStatus", subStatusCode);
								statistic.put("level", dictItem.getLevel());
								statistic.put("statusName", dictItem.getItemName());
								statistic.put("count", count);
								if (dictItem.getParentItemId() != 0) {
									total += count;
								}
								statistics.put(statistic);
							} else {
								params.put(DossierTerm.STATUS, statusCode);
								params.put(DossierTerm.SUBSTATUS, subStatusCode);
								params.put(DossierTerm.FOLLOW, String.valueOf(false));

								long count = DossierLocalServiceUtil.countLucene(params, searchContext);

								statistic.put("dossierStatus", statusCode);
								statistic.put("dossierSubStatus", subStatusCode);
								statistic.put("level", dictItem.getLevel());
								statistic.put("statusName", dictItem.getItemName());
								statistic.put("count", count);
								if (dictItem.getParentItemId() != 0) {
									total += count;
								}
								statistics.put(statistic);
							}
						}
						// _log.info("Search Time End: "+ (System.currentTimeMillis() - now));

					}
				}

				_log.info("Search All Time End: " + (System.currentTimeMillis() - now));
			}
			result.put("data", statistics);

			result.put("total", total);

		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}

	@Override
	public JSONObject getDossierCountTodoPermission(long userId, long companyId, long groupId,
			LinkedHashMap<String, Object> params, Object object, ServiceContext serviceContext) {
		JSONObject result = JSONFactoryUtil.createJSONObject();

		SearchContext searchContext = new SearchContext();

		searchContext.setCompanyId(companyId);

		String subStatusCode = StringPool.BLANK;

		JSONArray statistics = JSONFactoryUtil.createJSONArray();

		long total = 0;

		Applicant applicant = ApplicantLocalServiceUtil.fetchByMappingID(userId);
		try {
			String statusCode = GetterUtil.getString(params.get(DossierTerm.STATUS));
			String state = GetterUtil.getString(params.get(DossierTerm.STATE));

			if (Validator.isNotNull(state)
					&& (state.contains(ConstantsUtils.RT_EXPIRED) || state.contains(ConstantsUtils.RT_EXPIRING))) {
				params.put(DossierTerm.STATE, StringPool.BLANK);
				if (applicant != null) {
					if (state.contains(StringPool.COMMA)) {
						String[] stateArr = state.split(StringPool.COMMA);
						if (stateArr != null) {
							for (String statusState : stateArr) {
								_log.info("statusState: " + statusState);
								if (statusState.equals(ConstantsUtils.RT_EXPIRED)) {
									List<VRVehicleTypeCertificate> certTypeList = VRVehicleTypeCertificateLocalServiceUtil
											.findByF_APPNO_EXP_STATUS(applicant.getApplicantIdNo(),
													DossierTerm.EXPIRED_STATUS_WATTING);

									long count = 0;
									if (certTypeList != null && certTypeList.size() > 0) {
										int lenghtCert = certTypeList.size();
										String strDossierNo = StringPool.BLANK;
										if (lenghtCert == 1) {
											strDossierNo = SpecialCharacterUtils
													.splitSpecial(certTypeList.get(0).getDossierNo());
										} else {
											StringBuilder sb = new StringBuilder();
											for (int i = 0; i < lenghtCert; i++) {
												VRVehicleTypeCertificate certType = certTypeList.get(i);
												if (i == lenghtCert - 1) {
													sb.append(SpecialCharacterUtils
															.splitSpecial(certType.getDossierNo()));
												} else {
													sb.append(SpecialCharacterUtils
															.splitSpecial(certType.getDossierNo()));
													sb.append(StringPool.COMMA);
												}
											}
											strDossierNo = sb.toString();
										}
										_log.info("strDossierNo: " + strDossierNo);
										params.put(DossierTerm.DOSSIER_NO_EXPIRED, strDossierNo);
										//
										count = DossierLocalServiceUtil.countLucene(params, searchContext);
									}

									JSONObject statistic = JSONFactoryUtil.createJSONObject();
									statistic.put("dossierStatus", statusState);
									statistic.put("dossierSubStatus", StringPool.BLANK);
									statistic.put("count", count);

									statistics.put(statistic);

									total += count;
								}
								//
								if (statusState.equals(ConstantsUtils.RT_EXPIRING)) {
									String[] expireStatusArr = new String[] { DossierTerm.EXPIRED_STATUS_NOT_ACTIVE,
											DossierTerm.EXPIRED_STATUS_ACTIVE };
									List<VRVehicleTypeCertificate> certTypeList = VRVehicleTypeCertificateLocalServiceUtil
											.findByF_APPNO_EXP_STATUS(applicant.getApplicantIdNo(), expireStatusArr); // get
																														// to
																														// status
																														// =
																														// 0
																														// or
																														// 1

									long count = 0;
									if (certTypeList != null && certTypeList.size() > 0) {
										String strDossierNo = DossierMgtUtils.checkConditionState(certTypeList);
										_log.info("strDossierNo: " + strDossierNo);
										if (Validator.isNotNull(strDossierNo)) {
											params.put(DossierTerm.DOSSIER_NO_EXPIRED, strDossierNo);
											//
											count = DossierLocalServiceUtil.countLucene(params, searchContext);
										}
									}

									_log.info("count: " + count);
									_log.info("dossierStatus: " + statusState);
									JSONObject statistic = JSONFactoryUtil.createJSONObject();
									statistic.put("dossierStatus", statusState);
									statistic.put("dossierSubStatus", StringPool.BLANK);
									statistic.put("count", count);

									statistics.put(statistic);

									total += count;
								}
							}
						}
					}
				}
			}

			if (Validator.isNotNull(statusCode)) {
				params.put(DossierTerm.DOSSIER_NO_EXPIRED, StringPool.BLANK);
				String[] statusCodeArr = statusCode.split(StringPool.COMMA);
				if (statusCodeArr != null && statusCodeArr.length > 0) {
					for (String strStatus : statusCodeArr) {
						if (Validator.isNotNull(strStatus)) {
							_log.debug("strStatus: " + strStatus);
							params.put(DossierTerm.STATUS, strStatus);
							params.put(DossierTerm.SUBSTATUS, subStatusCode);
							params.put(DossierTerm.OWNER, String.valueOf(true));
							if (!strStatus.equals("done") && !strStatus.equals("cancelled")) {
								params.put(DossierTerm.NOT_STATE, "cancelling");
							}
							if (strStatus.equals("cancelled")) {
								params.put(DossierTerm.NOT_STATE, StringPool.BLANK);
								params.put(DossierTerm.NOT_STATUS_REG, null);
							}

							long count = DossierLocalServiceUtil.countLucene(params, searchContext);

							JSONObject statistic = JSONFactoryUtil.createJSONObject();
							statistic.put("dossierStatus", strStatus);
							statistic.put("dossierSubStatus", subStatusCode);
							statistic.put("count", count);

							statistics.put(statistic);

							total += count;
						}
					}
				}
			}

			result.put("data", statistics);
			// _log.info("statistics: "+statistics);

			result.put("total", total);
			// _log.info("total: "+total);

		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}

	@Override
	public JSONObject getDetailNextActions(long userId, long companyId, long groupId,
			LinkedHashMap<String, Object> params, Sort[] sorts, Integer start, Integer end,
			ServiceContext serviceContext) {
		JSONObject result = JSONFactoryUtil.createJSONObject();

		long dossierId = GetterUtil.getLong(params.get(DossierTerm.DOSSIER_ID));

		try {
			Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
			if (dossier != null) {
				long dossierActionId = dossier.getDossierActionId();
				String dossierTempNo = dossier.getDossierTemplateNo();
				long processActionId = GetterUtil.getLong(params.get(ProcessActionTerm.PROCESS_ACTION_ID));
				ProcessAction processAction = ProcessActionLocalServiceUtil.fetchProcessAction(processActionId);

				String postStepCode = StringPool.BLANK;
				long serviceProcessId = 0;
				if (processAction != null) {
					postStepCode = processAction.getPostStepCode();
					serviceProcessId = processAction.getServiceProcessId();
				}

				ProcessStep processStep = ProcessStepLocalServiceUtil.fetchBySC_GID(postStepCode, groupId,
						serviceProcessId);
				if (processStep != null) {
					List<User> lstUser = new ArrayList<>();

					List<ProcessStepRole> processStepRoleList = ProcessStepRoleLocalServiceUtil
							.findByP_S_ID(processStep.getProcessStepId());
					if (processStepRoleList != null && !processStepRoleList.isEmpty()) {
						List<ProcessStepRole> lstStepRoles = new ArrayList<>();
						for (ProcessStepRole psr : processStepRoleList) {
							if (Validator.isNotNull(psr.getCondition())) {
								String[] conditions = StringUtil.split(psr.getCondition());

								if (DossierMgtUtils.checkPreCondition(conditions, dossier)) {
									lstStepRoles.add(psr);
								}
							} else {
								lstStepRoles.add(psr);
							}
						}
						lstUser.addAll(processRoleListUser(lstStepRoles, serviceProcessId));
					}
					if (lstUser != null && !lstUser.isEmpty()) {
						result.put("lstUser", lstUser);
					}
				}

				String createDossierFiles = StringPool.BLANK;
				String returnDossierFiles = StringPool.BLANK;
				if (processAction != null) {
					createDossierFiles = processAction.getCreateDossierFiles();
					returnDossierFiles = processAction.getReturnDossierFiles();
				}

				_log.info("createDossierFiles: " + createDossierFiles);
				List<String> createFileTempNoList = ListUtil.toList(StringUtil.split(createDossierFiles));
				List<String> returnFileTempNoList = ListUtil.toList(StringUtil.split(returnDossierFiles));

				DossierTemplate dossierTemplate = DossierTemplateLocalServiceUtil.getByTemplateNo(groupId,
						dossier.getDossierTemplateNo());

				List<DossierPart> partList = DossierPartLocalServiceUtil.getByTemplateNo(groupId,
						dossierTemplate.getTemplateNo());

				if (returnFileTempNoList != null && !returnFileTempNoList.isEmpty()) {
					List<DossierFile> returnFiles = new ArrayList<>();
					if (partList != null && partList.size() > 0) {
						for (DossierPart dossierPart : partList) {
							String fileTemplateNo = dossierPart.getFileTemplateNo();
							int dossierPartType = dossierPart.getPartType();
							if (returnFileTempNoList.contains(fileTemplateNo)) {
								List<DossierFile> fileList = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_DPT(
										dossierId, fileTemplateNo, dossierPartType, false);
								if (fileList != null && fileList.size() > 0) {
									returnFiles.addAll(fileList);
								}
							}
						}
					}
					result.put("returnFiles", returnFiles);
				}

				JSONArray createFiles = JSONFactoryUtil.createJSONArray();
				if (createFileTempNoList != null && !createFileTempNoList.isEmpty()) {
					if (partList != null && partList.size() > 0) {
						long fileEntryId = 0;
						boolean eForm = false;
						// boolean multiple = false;
						String formData = StringPool.BLANK;
						String formScript = StringPool.BLANK;
						String docFileReferenceUid = StringPool.BLANK;
						int counter = 0;
						long dossierFileId = 0;
						boolean returned = false;
						for (DossierPart dossierPart : partList) {
							String fileTemplateNo = dossierPart.getFileTemplateNo();
							_log.debug("fileTemplateNo: " + fileTemplateNo);
							// eForm = dossierPart.getEForm();
							// multiple = dossierPart.getMultiple();

							if (createFileTempNoList.contains(fileTemplateNo)) {
								JSONObject createFile = JSONFactoryUtil.createJSONObject();
								createFile.put(DossierPartTerm.DOSSIERPART_ID, dossierPart.getDossierPartId());
								createFile.put(DossierPartTerm.PART_NO, dossierPart.getPartNo());
								createFile.put(DossierPartTerm.PART_NAME, dossierPart.getPartName());
								createFile.put(DossierPartTerm.PART_TIP, dossierPart.getPartTip());
								createFile.put(DossierPartTerm.MULTIPLE, dossierPart.getMultiple());
								createFile.put(DossierPartTerm.FILE_TEMPLATE_NO, fileTemplateNo);
								createFile.put(DossierPartTerm.PART_TYPE, dossierPart.getPartType());
								// createFile.put(DossierPartTerm.EFORM, eForm);
								createFile.put(DossierPartTerm.MULTIPLE, dossierPart.getMultiple());

								List<DossierFile> dossierFilesResult = DossierFileLocalServiceUtil
										.getDossierFileByDID_FTNO_DPT(dossierId, fileTemplateNo, 2, false,
												QueryUtil.ALL_POS, QueryUtil.ALL_POS,
												new DossierFileComparator(false, "createDate", Date.class));

								if (dossierFilesResult != null && !dossierFilesResult.isEmpty()) {
									_log.debug("dossierFilesResult: " + dossierFilesResult.size());
									df: for (DossierFile dossierFile : dossierFilesResult) {
										// Add by Dungnv
										if (ConstantsUtils.LIST_BB.contains(dossierFile.getDossierPartNo())
												&& ConstantsUtils.LIST_BB.contains(dossierPart.getPartNo())) {
											DossierFile dossierFile_KQ = dossierFile;
											List<DossierFile> dossierFile_TPs = DossierFileLocalServiceUtil
													.getDossierFileByDID_DPNO(dossierId, "TP1", false);
											DossierFile dossierFile_TP = null;
											if (!dossierFile_TPs.isEmpty() && dossierFile_TPs != null) {
												dossierFile_TP = dossierFile_TPs.get(0);
											}
											String formData_KQ = StringPool.BLANK;
											String formData_TP = StringPool.BLANK;
											File formDataFile_KQ = FileUploadUtils
													.getFile(dossierFile_KQ.getFormDataDossierFile());
											if (formDataFile_KQ != null) {
												formData_KQ = FileUploadUtils.fileToString(formDataFile_KQ);
											}
											if (formData_KQ.isEmpty()) {
												formData_KQ = dossierFile_KQ.getFormData();
											}

											File formDataFile_TP = FileUploadUtils
													.getFile(dossierFile_TP.getFormDataDossierFile());
											if (formDataFile_TP != null) {
												formData_TP = FileUploadUtils.fileToString(formDataFile_TP);
											}
											if (formData_TP.isEmpty()) {
												formData_TP = dossierFile_TP.getFormData();
											}

											JSONObject jFormData_KQ = JSONFactoryUtil.createJSONObject(formData_KQ);
											JSONObject jFormData_TP = JSONFactoryUtil.createJSONObject(formData_TP);
											_log.info("- Dungnv: jFormData_KQ_Id: "
													+ dossierFile_KQ.getFormDataDossierFile());
											_log.info("- Dungnv: jFormData_TP_Id: "
													+ dossierFile_TP.getFormDataDossierFile());
											jFormData_TP.keys().forEachRemaining(key -> {
												if (!key.contains("trackChange")) {
													jFormData_KQ.put(key, jFormData_TP.getString(key));
												}
											});
											formData = jFormData_KQ.toJSONString();
											formScript = dossierFile_KQ.getFormScript();
											docFileReferenceUid = dossierFile_KQ.getReferenceUid();
											fileEntryId = dossierFile_KQ.getFileEntryId();
											returned = createFileTempNoList.contains(dossierFile_KQ.getFileTemplateNo())
													? true
													: false;
											dossierFileId = dossierFile_KQ.getDossierFileId();
											eForm = dossierFile_KQ.getEForm();
											break df;
										} else if (dossierFile.getDossierPartNo().equals(dossierPart.getPartNo())) {
											eForm = dossierFile.getEForm();
											// Add by Dungnv
											File formDataFile = FileUploadUtils
													.getFile(dossierFile.getFormDataDossierFile());
											if (formDataFile != null) {
												formData = FileUploadUtils.fileToString(formDataFile);
											}
											if (formData.isEmpty()) {
												formData = dossierFile.getFormData();
											}
											// Comment by Dungnv
											// formData = dossierFile.getFormData();
											formScript = dossierFile.getFormScript();
											docFileReferenceUid = dossierFile.getReferenceUid();
											fileEntryId = dossierFile.getFileEntryId();
											returned = createFileTempNoList.contains(dossierFile.getFileTemplateNo())
													? true
													: false;
											dossierFileId = dossierFile.getDossierFileId();

											break df;
										}
									}
									_log.info("docFileReferenceUid: " + docFileReferenceUid);
									_log.debug("fileEntryId: " + fileEntryId);
								} else {
									eForm = Validator.isNotNull(dossierPart.getFormScript()) ? true : false;
									_log.info("eForm: " + eForm);
									formData = AutoFillFormData.sampleDataBinding(dossierPart.getSampleData(),
											dossierId, serviceContext);
									formScript = dossierPart.getFormScript();
									returned = returnFileTempNoList.contains(dossierPart.getFileTemplateNo()) ? true
											: false;

									// create Dossier File
									if (eForm) {
										DossierFileActions actions = new DossierFileActionsImpl();

										// check dossierFile contain
										DossierFile dossierFile = DossierFileLocalServiceUtil
												.getDossierFileByDID_FTNO_DPT_First(dossierId, fileTemplateNo, 2, false,
														new DossierFileComparator(false, "createDate", Date.class));

										if (Validator.isNull(dossierFile)) {
											dossierFile = actions.addDossierFile(groupId, dossierId, StringPool.BLANK,
													dossier.getDossierTemplateNo(), dossierPart.getPartNo(),
													fileTemplateNo, dossierPart.getPartName(), StringPool.BLANK, 0L,
													null, StringPool.BLANK, String.valueOf(false), dossierActionId,
													serviceContext);
										}
										docFileReferenceUid = dossierFile.getReferenceUid();
										dossierFileId = dossierFile.getDossierFileId();

										_log.info("docFileReferenceUid: " + docFileReferenceUid);
									}
								}

								counter = DossierFileLocalServiceUtil.countDossierFileByDID_FTNO_DPT_NOT_NULL_FID(
										dossierId, fileTemplateNo, 2, 0, false);
								createFile.put(DossierPartTerm.EFORM, eForm);
								createFile.put(DossierFileTerm.DOSSIER_FILE_ID, dossierFileId);
								createFile.put(DossierPartTerm.FORM_DATA, formData);
								createFile.put(DossierPartTerm.FORM_SCRIPT, formScript);
								createFile.put(DossierTerm.REFERENCE_UID, docFileReferenceUid);
								createFile.put("counter", counter);
								createFile.put("returned", returned);
								createFile.put(DossierFileTerm.FILE_ENTRY_ID, fileEntryId);
								createFile.put(DossierFileTerm.DOSSIER_TEMPLATE_NO, dossierTempNo);

								createFiles.put(createFile);

							}
						}
//						_log.info("#" + j + ".>> END-FOR-DOSSIER-PART: "
//								+ LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));

					}
				}
				result.put("processAction", processAction);
				result.put("createFiles", createFiles);
				//
				_log.info(">> END-FOR-PROCESS-ACTION: " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
//				List<ProcessPlugin> pluginList = ProcessPluginLocalServiceUtil.getBySC_SPID_ARUN(serviceProcessId,
//						postStepCode, true);
//
//				if (pluginList != null && pluginList.size() > 0) {
//					for (ProcessPlugin plg : pluginList) {
//						// do create file
//						String pluginForm = plg.getPluginForm();
//						String fileTemplateNo = StringUtil.replaceFirst(plg.getSampleData(), "#", StringPool.BLANK);
//
//						if (Validator.isNotNull(pluginForm) && !pluginForm.contains("original")) {
//							_doAutoRun(groupId, fileTemplateNo, dossierId, dossier.getDossierTemplateNo(),
//									dossierActionId, serviceContext);
//						}
//					}
//				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		return result;
	}

	// LamTV_Process role list user
	private List<User> processRoleListUser(List<ProcessStepRole> processStepRoleList, long serviceProcessId) {
		List<User> lstUser = null;
		// Check roles
		_log.debug("processStepRoleList: " + processStepRoleList);
		if (processStepRoleList != null && processStepRoleList.size() > 0) {
			_log.debug("processStepRoleList.size(): " + processStepRoleList.size());
			lstUser = new ArrayList<User>();
			for (ProcessStepRole processStepRole : processStepRoleList) {
				List<User> users = UserLocalServiceUtil.getRoleUsers(processStepRole.getRoleId());
				if (users != null && users.size() > 0) {
					_log.debug("users.size(): " + users.size());
					HashMap<String, Object> assigned = new HashMap<>();
					assigned.put(ProcessStepRoleTerm.ASSIGNED, 0);
					for (User user : users) {
						if (!user.isLockout() && user.isActive()) {
							HashMap<String, Object> moderator = new HashMap<>();
							moderator.put(ProcessStepRoleTerm.MODERATOR, processStepRole.getModerator());
							user.setModelAttributes(moderator);
							user.setModelAttributes(assigned);
							lstUser.add(user);
						}
					}
				}
			}
		} else {
			// Search in ServiceProcessRole
			List<ServiceProcessRole> serviceProcessRoleList = ServiceProcessRoleLocalServiceUtil
					.findByS_P_ID(serviceProcessId);
			if (serviceProcessRoleList != null && serviceProcessRoleList.size() > 0) {
				lstUser = new ArrayList<User>();
				for (ServiceProcessRole serviceProcessRole : serviceProcessRoleList) {
					List<User> users = UserLocalServiceUtil.getRoleUsers(serviceProcessRole.getRoleId());
					if (users != null && users.size() > 0) {
						for (User user : users) {
							if (!user.isLockout() && user.isActive()) {
								HashMap<String, Object> moderator = new HashMap<>();
								moderator.put("moderator", serviceProcessRole.getModerator());
								user.setModelAttributes(moderator);
								lstUser.add(user);
							}
						}
					}
				}
			}
		}

		return lstUser;
	}

	private int checkPaymentMethodinPrecondition(String preCondition) {
		// _log.info("SONDT checkPaymentMethodinPrecondition preCondition ===== " +
		// preCondition);
		int paymentMethod = 0;
		String[] preConditions = StringUtil.split(preCondition);
		for (String pre : preConditions) {
			pre = pre.trim();
			// _log.info("SONDT checkPaymentMethodinPrecondition pre ===== " + pre);
			if (pre.toLowerCase().contains("paymentmethod=")) {
				String[] splitPaymentMethod = pre.split("=");
				// _log.info("SONDT checkPaymentMethodinPrecondition splitPaymentMethod ===== "
				// + splitPaymentMethod);
				if (splitPaymentMethod.length == 2) {
					paymentMethod = Integer.parseInt(splitPaymentMethod[1]);
					// _log.info("SONDT checkPaymentMethodinPrecondition paymentMethod in if ===== "
					// + paymentMethod);
				}
				break;
			}
		}
		_log.info("SONDT checkPaymentMethodinPrecondition paymentMethod ===== " + paymentMethod);
		return paymentMethod;
	}

	private String checkPaymentMethod(int mt) {
		String pmMethod = "";
		if (mt == 1) {
			pmMethod = "Chuyển khoản";// KeyPay
		} else if (mt == 2) {
			pmMethod = "Chuyển khoản";
		} else if (mt == 3) {
			pmMethod = "Tiền mặt";
		}

		_log.info("SONDT checkPaymentMethod pmMethod ===== " + pmMethod);
		return pmMethod;
	}

	private Map<String, Object> createParamsInvoice(PaymentFile oldPaymentFile, Dossier dossier, int intpaymentMethod) {
		Map<String, Object> params = new HashMap<>();

		StringBuilder address = new StringBuilder();
		address.append(dossier.getAddress());
		address.append(", ");
		address.append(dossier.getWardName());
		address.append(", ");
		address.append(dossier.getDistrictName());
		address.append(", ");
		address.append(dossier.getCityName());

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		String dateformatted = sdf.format(new Date());
		_log.info("SONDT CINVOICE DATEFORMATED ============= " + dateformatted);

		params.put("userName", "HA");
		params.put("passWord", "1");
		params.put("soid", "0");
		params.put("maHoadon", "01GTKT0/001");
		params.put("ngayHd", dateformatted); // "01/08/2018"
		params.put("seri", "12314");
		params.put("maNthue", "01");
		params.put("kieuSo", "G");
		params.put("maKhackHang", Long.toString(dossier.getUserId()));
		params.put("ten", dossier.getApplicantName());
		// TODO
		// params.put("phone", dossier.getContactTelNo());
		params.put("phone", "0983025123");
//		if(dossier.getApplicantIdType().contentEquals("business")) {
//			params.put("tax", dossier.getApplicantIdNo()); 
//		} else {
//			params.put("tax", "");
//		}
		params.put("tax", "0311123290");
		params.put("dchi", address);
		params.put("maTk", "");
		params.put("tenNh", "");
		params.put("mailH", GetterUtil.getString(dossier.getContactEmail()));
		// TODO
		// params.put("phoneH", GetterUtil.getString(dossier.getContactTelNo()));
		params.put("phoneH", "0983025123");
		params.put("tenM", GetterUtil.getString(dossier.getApplicantName()));
		params.put("maKhL", "K");
		params.put("maNt", "VND");
		params.put("tg", "1");
		if (intpaymentMethod == 3) {
			params.put("hthuc", "M");
		} else {
			params.put("hthuc", "C");
		}
		params.put("han", "");
		params.put("tlGgia", "0");
		params.put("ggia", "0");
		params.put("phi", "0");
		params.put("noidung", dossier.getDossierNo());
		params.put("tien", Long.toString(oldPaymentFile.getPaymentAmount()));
		params.put("ttoan", Long.toString(oldPaymentFile.getPaymentAmount()));
		// TODO
		params.put("maVtDetail", dossier.getDossierNo().replace("/", "."));
		params.put("tenDetail", GetterUtil.getString(dossier.getServiceName()));
		params.put("dvtDetail", "bo");
		params.put("luongDetail", "1");
		params.put("giaDetail", Long.toString(oldPaymentFile.getPaymentAmount()));
		params.put("tienDetail", Long.toString(oldPaymentFile.getPaymentAmount()));
		params.put("tsDetail", "0");
		params.put("thueDetail", "0");
		params.put("ttoanDetail", Long.toString(oldPaymentFile.getPaymentAmount()));

		return params;
	}
}
