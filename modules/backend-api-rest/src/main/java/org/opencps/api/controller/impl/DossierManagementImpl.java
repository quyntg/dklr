package org.opencps.api.controller.impl;

import com.fds.vr.service.util.FileUploadUtils;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.SortFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.File;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import org.apache.commons.httpclient.util.HttpURLConnection;
import org.opencps.api.controller.DossierManagement;
import org.opencps.api.controller.exception.ErrorMsg;
import org.opencps.api.controller.util.DossierMarkUtils;
import org.opencps.api.controller.util.DossierUtils;
import org.opencps.api.controller.util.VRRestUtil;
import org.opencps.api.dossier.model.DoActionModel;
import org.opencps.api.dossier.model.DossierDetailModel;
import org.opencps.api.dossier.model.DossierInputModel;
import org.opencps.api.dossier.model.DossierResultsModel;
import org.opencps.api.dossier.model.DossierSearchModel;
import org.opencps.api.dossiermark.model.DossierMarkInputModel;
import org.opencps.api.dossiermark.model.DossierMarkModel;
import org.opencps.api.dossiermark.model.DossierMarkResultDetailModel;
import org.opencps.api.dossiermark.model.DossierMarkResultsModel;
import org.opencps.auth.api.BackendAuth;
import org.opencps.auth.api.BackendAuthImpl;
import org.opencps.auth.api.exception.NotFoundException;
import org.opencps.auth.api.exception.UnauthenticationException;
import org.opencps.auth.api.exception.UnauthorizationException;
import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.datamgt.model.DictCollection;
import org.opencps.datamgt.model.DictItem;
import org.opencps.datamgt.service.DictCollectionLocalServiceUtil;
import org.opencps.datamgt.service.DictItemLocalServiceUtil;
import org.opencps.dossiermgt.action.DossierActions;
import org.opencps.dossiermgt.action.DossierMarkActions;
import org.opencps.dossiermgt.action.impl.DossierActionsImpl;
import org.opencps.dossiermgt.action.impl.DossierMarkActionsImpl;
import org.opencps.dossiermgt.action.impl.DossierPermission;
import org.opencps.dossiermgt.action.util.ConstantsUtils;
import org.opencps.dossiermgt.action.util.DossierMgtUtils;
import org.opencps.dossiermgt.action.util.DossierNumberGenerator;
import org.opencps.dossiermgt.action.util.SpecialCharacterUtils;
import org.opencps.dossiermgt.constants.DossierTerm;
import org.opencps.dossiermgt.exception.NoSuchDossierFileException;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.DossierMark;
import org.opencps.dossiermgt.model.DossierTemplate;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.ProcessOption;
import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.model.ServiceInfo;
import org.opencps.dossiermgt.model.ServiceProcess;
import org.opencps.dossiermgt.service.DossierActionLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierRequestUDLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierTemplateLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessStepLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceInfoLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceProcessLocalServiceUtil;
import org.opencps.dossiermgt.service.comparator.DossierComparator;
import org.opencps.dossiermgt.service.comparator.DossierFileComparator;
import org.opencps.dossiermgt.vr.utils.VRBusinessUtils;

public class DossierManagementImpl implements DossierManagement {

	public static final String RT_CANCELLING = "cancelling";
	public static final String RT_CORRECTING = "correcting";
	public static final String RT_SUBMITTING = "submitting";

	@SuppressWarnings("unchecked")
	@Override
	public Response getDossiers(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, DossierSearchModel query) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		BackendAuth auth = new BackendAuthImpl();
		DossierPermission dossierPermission = new DossierPermission();
		DossierActions actions = new DossierActionsImpl();

		try {
			boolean isCitizen = false;

			if (!query.getSecetKey().contentEquals("OPENCPSV2")) {

				if (!auth.isAuth(serviceContext)) {
					throw new UnauthenticationException();
				}

				isCitizen = dossierPermission.isCitizen(user.getUserId());

				dossierPermission.hasGetDossiers(groupId, user.getUserId(), query.getSecetKey());
			}

			if (Validator.isNull(query.getEnd()) || query.getEnd() == 0) {

				query.setStart(-1);

				query.setEnd(-1);

			}

			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
			params.put(Field.GROUP_ID, String.valueOf(groupId));
			// LamTV_Process search LIKE
			String keywordSearch = query.getKeyword();
			String keySearch = StringPool.BLANK;
			if (Validator.isNotNull(keywordSearch)) {
				keySearch = SpecialCharacterUtils.splitSpecial(keywordSearch);
			}
			params.put(Field.KEYWORD_SEARCH, keySearch);

			String status = query.getStatus();
			String substatus = query.getSubstatus();
			String agency = query.getAgency();
			String service = query.getService();
			String template = query.getTemplate();
			int year = query.getYear();
			int month = query.getMonth();
			String owner = query.getOwner();
			// If user is citizen then default owner true
			if (isCitizen) {
				owner = String.valueOf(true);
			}
			String follow = query.getFollow();
			String step = query.getStep();
			String submitting = query.getSubmitting();
			String top = query.getTop();
			String state = query.getState();
			String dossierIdNo = query.getDossierNo();
			String dossierNoSearch = StringPool.BLANK;
			if (Validator.isNotNull(dossierIdNo)) {
				dossierNoSearch = SpecialCharacterUtils.splitSpecial(dossierIdNo);
			}
			String soChungChi = query.getSoChungChi();
			String certNo = StringPool.BLANK;
			if (Validator.isNotNull(soChungChi)) {
				certNo = SpecialCharacterUtils.splitSpecial(soChungChi);
			}

			String fromReceiveDate = APIDateTimeUtils.convertNormalDateToLuceneDate(query.getFromReceiveDate());

			String toReceiveDate = APIDateTimeUtils.convertNormalDateToLuceneDate(query.getToReceiveDate());

			String fromCertDate = APIDateTimeUtils.convertNormalDateToLuceneDate(query.getTuNgayKyCc());

			String toCertDate = APIDateTimeUtils.convertNormalDateToLuceneDate(query.getDenNgayKyCc());

			String dossierIdCTN = query.getDossierIdCTN();
			String fromSubmitDate = APIDateTimeUtils.convertNormalDateToLuceneDate(query.getFromSubmitDate());
			String toSubmitDate = APIDateTimeUtils.convertNormalDateToLuceneDate(query.getToSubmitDate());
			//LamTV:Get info case abnormal
			Long statusRegNo = null;
			if (Validator.isNotNull(query.getStatusReg())) {
				statusRegNo = Long.valueOf(query.getStatusReg());
			}

			Long notStatusRegNo = null;
			if (Validator.isNotNull(query.getNotStatusReg())) {
				notStatusRegNo = Long.valueOf(query.getNotStatusReg());
			}

			params.put(DossierTerm.STATUS, status);
			params.put(DossierTerm.SUBSTATUS, substatus);
			params.put(DossierTerm.AGENCY, agency);
			params.put(DossierTerm.SERVICE, service);
			params.put(DossierTerm.TEMPLATE, template);
			params.put(DossierTerm.YEAR, year);
			params.put(DossierTerm.MONTH, month);
			params.put(DossierTerm.STEP, step);
			params.put(DossierTerm.OWNER, owner);
			params.put(DossierTerm.SUBMITTING, submitting);
			params.put(DossierTerm.FOLLOW, follow);
			params.put(DossierTerm.TOP, top);
			params.put(DossierTerm.USER_ID, user.getUserId());
			params.put("secetKey", query.getSecetKey());
			params.put(DossierTerm.STATE, state);
			params.put(DossierTerm.DOSSIER_NO, dossierNoSearch);
			params.put(DossierTerm.CERT_NO, certNo);
			params.put(DossierTerm.FROM_RECEIVEDATE, fromReceiveDate);
			params.put(DossierTerm.TO_RECEIVEDATE, toReceiveDate);
			params.put(DossierTerm.FROM_CERT_DATE, fromCertDate);
			params.put(DossierTerm.TO_CERT_DATE, toCertDate);
			params.put(DossierTerm.DOSSIER_ID_CTN, dossierIdCTN);
			params.put(DossierTerm.FROM_SUBMIT_DATE, fromSubmitDate);
			params.put(DossierTerm.TO_SUBMIT_DATE, toSubmitDate);
			params.put(DossierTerm.STATUS_REG, statusRegNo);
			params.put(DossierTerm.NOT_STATUS_REG, notStatusRegNo);

			String strSort = query.getSort();
			Sort[] sorts = null;
			if (Validator.isNotNull(strSort) && (strSort.equals("modified") || strSort.contains("Date"))) {
				_log.info("SORT DATE");
				sorts = new Sort[] { SortFactoryUtil.create(query.getSort() + "_Number_sortable", Sort.LONG_TYPE,
						GetterUtil.getBoolean(query.getOrder())) };
			} else {
				sorts = new Sort[] { SortFactoryUtil.create(query.getSort() + "_sortable", Sort.STRING_TYPE,
						GetterUtil.getBoolean(query.getOrder())) };
			}

			if (Validator.isNotNull(top)) {
				switch (top) {
				case "receive":
					sorts = new Sort[] { SortFactoryUtil.create(DossierTerm.RECEIVE_DATE_TIMESTAMP + "_sortable",
							Sort.LONG_TYPE, false) };
					break;
				case "overdue":
					sorts = new Sort[] { SortFactoryUtil.create(DossierTerm.DUE_DATE_TIMESTAMP + "_sortable",
							Sort.LONG_TYPE, false) };
					break;
				case "release":
					sorts = new Sort[] { SortFactoryUtil.create(DossierTerm.RELEASE_DATE_TIMESTAMP + "_sortable",
							Sort.LONG_TYPE, false) };
					break;
				case "cancelling":
					sorts = new Sort[] { SortFactoryUtil.create(DossierTerm.CANCELLING_DATE_TIMESTAMP + "_sortable",
							Sort.LONG_TYPE, false) };
					break;
				case "corecting":
					sorts = new Sort[] { SortFactoryUtil.create(DossierTerm.CORRECTING_DATE_TIMESTAMP + "_sortable",
							Sort.LONG_TYPE, false) };
					break;
				default:
					break;
				}

			}

			DossierResultsModel results = new DossierResultsModel();

			JSONObject jsonData = actions.getDossiers(user.getUserId(), company.getCompanyId(), groupId, params, sorts,
						-1, -1, serviceContext);

			results.setTotal(jsonData.getInt("total"));

			results.getData().addAll(DossierUtils.mappingForGetList((List<Document>) jsonData.get("data")));

			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}

	}

	@Override
	public Response getDossiersProcessList(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, DossierSearchModel query) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		BackendAuth auth = new BackendAuthImpl();
		DossierPermission dossierPermission = new DossierPermission();
		DossierActions actions = new DossierActionsImpl();

		try {

			// _log.info("1");
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			// _log.info("2");
			boolean isCitizen = dossierPermission.isCitizen(user.getUserId());

			// _log.info("3");
			dossierPermission.hasGetDossiers(groupId, user.getUserId(), query.getSecetKey());

			if (Validator.isNull(query.getEnd()) || query.getEnd() == 0) {

				query.setStart(-1);

				query.setEnd(-1);

			}

			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();

			params.put(Field.GROUP_ID, String.valueOf(groupId));
			// LamTV_Process search LIKE
			String keywordSearch = query.getKeyword();
			String keySearch = StringPool.BLANK;
			if (Validator.isNotNull(keywordSearch)) {
				keySearch = SpecialCharacterUtils.splitSpecial(keywordSearch);
			}
			params.put(Field.KEYWORD_SEARCH, keySearch);

			String status = query.getStatus();
			String substatus = query.getSubstatus();
			String agency = query.getAgency();
			String service = query.getService();
			String template = query.getTemplate();
			int year = query.getYear();
			int month = query.getMonth();
			String owner = query.getOwner();
			// If user is citizen then default owner true
			if (isCitizen) {
				owner = String.valueOf(true);
			}
			String follow = query.getFollow();
			String step = query.getStep();
			String submitting = query.getSubmitting();
			String top = query.getTop();
			String state = query.getState();
			String dossierIdNo = query.getDossierNo();
			String dossierNoSearch = StringPool.BLANK;
			if (Validator.isNotNull(dossierIdNo)) {
				dossierNoSearch = SpecialCharacterUtils.splitSpecial(dossierIdNo);
			}
			String soChungChi = query.getSoChungChi();
			String certNo = StringPool.BLANK;
			if (Validator.isNotNull(soChungChi)) {
				certNo = SpecialCharacterUtils.splitSpecial(soChungChi);
			}

			String fromReceiveDate = APIDateTimeUtils.convertNormalDateToLuceneDate(query.getFromReceiveDate());

			String toReceiveDate = APIDateTimeUtils.convertNormalDateToLuceneDate(query.getToReceiveDate());

			String fromCertDate = APIDateTimeUtils.convertNormalDateToLuceneDate(query.getTuNgayKyCc());

			String toCertDate = APIDateTimeUtils.convertNormalDateToLuceneDate(query.getDenNgayKyCc());

			String dossierIdCTN = query.getDossierIdCTN();
			String fromSubmitDate = APIDateTimeUtils.convertNormalDateToLuceneDate(query.getFromSubmitDate());
			String toSubmitDate = APIDateTimeUtils.convertNormalDateToLuceneDate(query.getToSubmitDate());

			params.put(DossierTerm.STATUS, status);
			params.put(DossierTerm.SUBSTATUS, substatus);
			params.put(DossierTerm.AGENCY, agency);
			params.put(DossierTerm.SERVICE, service);
			params.put(DossierTerm.TEMPLATE, template);
			params.put(DossierTerm.YEAR, year);
			params.put(DossierTerm.MONTH, month);
			params.put(DossierTerm.STEP, step);
			params.put(DossierTerm.OWNER, owner);
			params.put(DossierTerm.SUBMITTING, submitting);
			params.put(DossierTerm.FOLLOW, follow);
			params.put(DossierTerm.TOP, top);
			params.put(DossierTerm.USER_ID, user.getUserId());
			params.put("secetKey", query.getSecetKey());
			params.put(DossierTerm.STATE, state);
			params.put(DossierTerm.DOSSIER_NO, dossierNoSearch);
			params.put(DossierTerm.CERT_NO, certNo);
			params.put(DossierTerm.FROM_RECEIVEDATE, fromReceiveDate);
			params.put(DossierTerm.TO_RECEIVEDATE, toReceiveDate);
			params.put(DossierTerm.FROM_CERT_DATE, fromCertDate);
			params.put(DossierTerm.TO_CERT_DATE, toCertDate);
			params.put(DossierTerm.DOSSIER_ID_CTN, dossierIdCTN);
			params.put(DossierTerm.FROM_SUBMIT_DATE, fromSubmitDate);
			params.put(DossierTerm.TO_SUBMIT_DATE, toSubmitDate);

			// _log.info("4");
			String strSort = query.getSort();
			Sort[] sorts = null;
			if (Validator.isNotNull(strSort) && (strSort.equals("modified") || strSort.contains("Date"))) {
				_log.info("SORT DATE");
				sorts = new Sort[] { SortFactoryUtil.create(query.getSort() + "_Number_sortable", Sort.LONG_TYPE,
						GetterUtil.getBoolean(query.getOrder())) };
			} else {
				sorts = new Sort[] { SortFactoryUtil.create(query.getSort() + "_sortable", Sort.STRING_TYPE,
						GetterUtil.getBoolean(query.getOrder())) };
			}

			if (Validator.isNotNull(top)) {
				switch (top) {
				case "receive":
					sorts = new Sort[] { SortFactoryUtil.create(DossierTerm.RECEIVE_DATE_TIMESTAMP + "_sortable",
							Sort.LONG_TYPE, false) };
					break;
				case "overdue":
					sorts = new Sort[] { SortFactoryUtil.create(DossierTerm.DUE_DATE_TIMESTAMP + "_sortable",
							Sort.LONG_TYPE, false) };
					break;
				case "release":
					sorts = new Sort[] { SortFactoryUtil.create(DossierTerm.RELEASE_DATE_TIMESTAMP + "_sortable",
							Sort.LONG_TYPE, false) };
					break;
				case "cancelling":
					sorts = new Sort[] { SortFactoryUtil.create(DossierTerm.CANCELLING_DATE_TIMESTAMP + "_sortable",
							Sort.LONG_TYPE, false) };
					break;
				case "corecting":
					sorts = new Sort[] { SortFactoryUtil.create(DossierTerm.CORRECTING_DATE_TIMESTAMP + "_sortable",
							Sort.LONG_TYPE, false) };
					break;
				default:
					break;
				}

			}
			// _log.info("5");
			JSONObject jsonData = actions.getDossiersTest(user.getUserId(), company.getCompanyId(), groupId, params,
					sorts, query.getStart(), query.getEnd(), serviceContext);

			// _log.info("6");
			DossierResultsModel results = new DossierResultsModel();

			if (jsonData != null && jsonData.length() > 0) {
				results.setTotal(jsonData.getInt("total"));
//				_log.info("7");
//				results.getData().addAll(DossierUtils.mappingForGetList((List<Document>) jsonData.get("data")));

				@SuppressWarnings("unchecked")
				List<Document> docs = (List<Document>) jsonData.get("data");
				if (docs != null && docs.size() > 0) {
					if (Validator.isNotNull(status) || Validator.isNotNull(substatus)) {
						results.getData().addAll(DossierUtils.mappingForGetList(docs));
					} else {
						// Process paging
						if (query.getEnd() == -1) {
							results.getData().addAll(DossierUtils.mappingForGetList(docs));
						} else {
							_log.info("669999");
							results.getData().addAll(
									DossierUtils.mappingForGetListPaging(docs, query.getStart(), query.getEnd()));
						}
					}
				}
			} else {
				results.setTotal(0);
			}

			// _log.info("8");
			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}

	}

	@Override
	public Response addDossier(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, DossierInputModel input) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		BackendAuth auth = new BackendAuthImpl();
		DossierPermission dossierPermission = new DossierPermission();

		DossierActions actions = new DossierActionsImpl();

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			// if (!auth.hasResource(serviceContext,
			// DossierTemplate.class.getName(), ActionKeys.ADD_ENTRY)) {
			// throw new UnauthorizationException();
			// }

			dossierPermission.hasCreateDossier(groupId, user.getUserId(), input.getServiceCode(),
					input.getGovAgencyCode(), input.getDossierTemplateNo());

			int counter = DossierNumberGenerator.counterDossier(user.getUserId(), groupId);
			String referenceUid = input.getReferenceUid();

			ProcessOption option = DossierMgtUtils.getProcessOption(input.getServiceCode(), input.getGovAgencyCode(),
					input.getDossierTemplateNo(), groupId);

			// Create dossierNote

			ServiceProcess process = ServiceProcessLocalServiceUtil.getServiceProcess(option.getServiceProcessId());

			if (Validator.isNull(referenceUid) || referenceUid.trim().length() == 0)
				referenceUid = DossierNumberGenerator.generateReferenceUID(groupId);

			String serviceName = getServiceName(input.getServiceCode(), groupId);

			String govAgencyName = getDictItemName(groupId, GOVERNMENT_AGENCY, input.getGovAgencyCode());

			String cityName = getDictItemName(groupId, ADMINISTRATIVE_REGION, input.getCityCode());
			String districtName = getDictItemName(groupId, ADMINISTRATIVE_REGION, input.getDistrictCode());
			String wardName = getDictItemName(groupId, ADMINISTRATIVE_REGION, input.getWardCode());

			boolean online = true;

			// DOSSIER that was created in CLIENT is set ONLINE = false
			if (process.getServerNo().trim().length() != 0) {
				online = false;
			}

			String password = StringPool.BLANK;

			if (Validator.isNotNull(process.getGeneratePassword()) && process.getGeneratePassword()) {
				password = DossierNumberGenerator.generatePassword(DEFAULT_PATTERN_PASSWORD, LENGHT_DOSSIER_PASSWORD);
			}

			Dossier dossier = actions.initDossier(groupId, 0l, referenceUid, counter, input.getServiceCode(),
					serviceName, input.getGovAgencyCode(), govAgencyName, input.getApplicantName(),
					input.getApplicantIdType(), input.getApplicantIdNo(), input.getApplicantIdDate(),
					input.getAddress(), input.getCityCode(), cityName, input.getDistrictCode(), districtName,
					input.getWardCode(), wardName, input.getContactName(), input.getContactTelNo(),
					input.getContactEmail(), input.getDossierTemplateNo(), password, 0, StringPool.BLANK,
					StringPool.BLANK, StringPool.BLANK, StringPool.BLANK, online, process.getDirectNotification(),
					input.getApplicantNote(), serviceContext);

			if (Validator.isNull(dossier)) {
				throw new NotFoundException("Cant add DOSSIER");
			}

			DossierDetailModel result = DossierUtils.mappingForGetDetail(dossier, user.getUserId());

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}

	}

	@Override
	public Response getDetailDossier(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		String password = GetterUtil.getString(header.getHeaderString("password"));
		DossierPermission dossierPermission = new DossierPermission();
		BackendAuth auth = new BackendAuthImpl();

		try {

			if (Validator.isNotNull(password)) {

				Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

				dossierPermission.checkPassword(dossier, password);

				DossierDetailModel result = DossierUtils.mappingForGetDetail(dossier, user.getUserId());

				return Response.status(200).entity(result).build();

			} else {
				if (!auth.isAuth(serviceContext)) {
					throw new UnauthenticationException();
				}

				Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

				//ProcessOption option = getProcessOption(dossier.getServiceCode(), dossier.getGovAgencyCode(),
				//		dossier.getDossierTemplateNo(), groupId);

				// dossierPermission.hasGetDetailDossier(groupId,
				// user.getUserId(), dossier, option.getServiceProcessId());

				DossierDetailModel result = DossierUtils.mappingForGetDetail(dossier, user.getUserId());

				return Response.status(200).entity(result).build();

			}

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}

	}

	@Override
	public Response updateDossier(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, long id, DossierInputModel input) {
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		BackendAuth auth = new BackendAuthImpl();

		DossierActions actions = new DossierActionsImpl();
		DossierPermission dossierPermission = new DossierPermission();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			// if (!auth.hasResource(serviceContext,
			// DossierTemplate.class.getName(), ActionKeys.ADD_ENTRY)) {
			// throw new UnauthorizationException();
			// }

			dossierPermission.hasCreateDossier(groupId, user.getUserId(), input.getServiceCode(),
					input.getGovAgencyCode(), input.getDossierTemplateNo());

			int counter = 0;
			String referenceUid = StringPool.BLANK;
			//
			// ProcessOption option = getProcessOption(input.getServiceCode(),
			// input.getGovAgencyCode(),
			// input.getDossierTemplateNo(), groupId);
			//
			// ServiceProcess process =
			// ServiceProcessLocalServiceUtil.getServiceProcess(option.getServiceProcessId());

			if (referenceUid.trim().length() == 0)
				referenceUid = DossierNumberGenerator.generateReferenceUID(groupId);

			// String serviceName = getServiceName(input.getServiceCode(),
			// groupId);

			// String govAgencyName = getDictItemName(groupId,
			// GOVERNMENT_AGENCY, input.getGovAgencyCode());

			String cityName = StringPool.BLANK;
			String districtName = StringPool.BLANK;
			String wardName = StringPool.BLANK;
			String postalCityName = StringPool.BLANK;

			if (Validator.isNotNull(input.getCityCode()))
				cityName = getDictItemName(groupId, ADMINISTRATIVE_REGION, input.getCityCode());
			if (Validator.isNotNull(input.getDistrictCode()))
				districtName = getDictItemName(groupId, ADMINISTRATIVE_REGION, input.getDistrictCode());
			if (Validator.isNotNull(input.getWardCode()))
				wardName = getDictItemName(groupId, ADMINISTRATIVE_REGION, input.getWardCode());

			if (Validator.isNotNull(input.getPostalCityCode())) {
				postalCityName = getDictItemName(groupId, ADMINISTRATIVE_REGION, input.getPostalCityCode());
			}

			boolean online = true;

			String password = StringPool.BLANK;

			Dossier dossier = actions.initDossier(groupId, id, referenceUid, counter, input.getServiceCode(),
					StringPool.BLANK, StringPool.BLANK, StringPool.BLANK, input.getApplicantName(),
					input.getApplicantIdType(), input.getApplicantIdNo(), input.getApplicantIdDate(),
					input.getAddress(), input.getCityCode(), cityName, input.getDistrictCode(), districtName,
					input.getWardCode(), wardName, input.getContactName(), input.getContactTelNo(),
					input.getContactEmail(), input.getDossierTemplateNo(), password, input.getViaPostal(),
					input.getPostalAddress(), input.getPostalCityCode(), postalCityName, input.getPostalTelNo(), online,
					true, input.getApplicantNote(), serviceContext);

			DossierDetailModel result = DossierUtils.mappingForGetDetail(dossier, user.getUserId());

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}
	}

	@Override
	public Response removeDossier(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id) {
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		BackendAuth auth = new BackendAuthImpl();

		DossierActions actions = new DossierActionsImpl();
		//DossierPermission dossierPermission = new DossierPermission();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			// dossierPermission.allowSubmitting(user.getUserId(),
			// dossier.getDossierId());

			Dossier removeDossier = actions.removeDossier(groupId, dossier.getDossierId(), dossier.getReferenceUid());

			DossierDetailModel result = DossierUtils.mappingForGetDetail(removeDossier, user.getUserId());

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}
	}

	@Override
	public Response cancellingDossier(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id) {
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		BackendAuth auth = new BackendAuthImpl();

		DossierActions actions = new DossierActionsImpl();
		//DossierPermission dossierPermission = new DossierPermission();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			// dossierPermission.allowSubmitting(user.getUserId(),
			// dossier.getDossierId());

			Dossier cancellingDossier = actions.cancelDossier(groupId, dossier.getDossierId(),
					dossier.getReferenceUid(), serviceContext);

			DossierDetailModel result = DossierUtils.mappingForGetDetail(cancellingDossier, user.getUserId());

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}
	}

	@Override
	public Response correctingDossier(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		BackendAuth auth = new BackendAuthImpl();

		DossierActions actions = new DossierActionsImpl();
		//DossierPermission dossierPermission = new DossierPermission();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			// dossierPermission.allowSubmitting(user.getUserId(),
			// dossier.getDossierId());

			Dossier correctingDossier = actions.correctDossier(groupId, dossier.getDossierId(),
					dossier.getReferenceUid(), serviceContext);

			DossierDetailModel result = DossierUtils.mappingForGetDetail(correctingDossier, user.getUserId());

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}

	}

	@Override
	public Response submittingDossier(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		BackendAuth auth = new BackendAuthImpl();

		DossierActions actions = new DossierActionsImpl();

		DossierPermission dossierPermission = new DossierPermission();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			dossierPermission.allowSubmitting(user.getUserId(), dossier.getDossierId());

			Dossier submittedDossier = actions.submitDossier(groupId, dossier.getDossierId(), dossier.getReferenceUid(),
					serviceContext);

			DossierDetailModel result = DossierUtils.mappingForGetDetail(submittedDossier, user.getUserId());

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}

	}

	@Override
	public Response resetDossier(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id) {

		// RESET submitting
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		//DossierPermission dossierPermission = new DossierPermission();
		//BackendAuth auth = new BackendAuthImpl();
		DossierActions actions = new DossierActionsImpl();
		try {
			// isSyncAction equal 1 that is the action was processed by
			// DossierPushScheduler
			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			Dossier dossierResetted = actions.resetDossier(groupId, dossier.getDossierId(), dossier.getReferenceUid(),
					serviceContext);

			return Response.status(200).entity(DossierUtils.mappingForGetDetail(dossierResetted, user.getUserId()))
					.build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}

	}

	@Override
	public Response doAction(HttpServletRequest request, HttpHeaders header, Company company, Locale locale, User user,
			ServiceContext serviceContext, String id, DoActionModel input, String subUsers) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		//DossierPermission dossierPermission = new DossierPermission();
		BackendAuth auth = new BackendAuthImpl();
		DossierActions actions = new DossierActionsImpl();

		try {
			DossierAction dossierAction = null;
			// isSyncAction equal 1 that is the action was processed by
			// DossierPushScheduler
			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);
			if (dossier != null) {
				ProcessOption option = DossierMgtUtils.getProcessOption(dossier.getServiceCode(), dossier.getGovAgencyCode(),
						dossier.getDossierTemplateNo(), groupId);
				if (option != null) {
					ProcessAction proAction = DossierMgtUtils.getProcessAction(groupId, dossier, input.getActionCode(),
							option.getServiceProcessId());
					if (proAction != null) {
						if (input.getIsSynAction() == 1) {
							//_log.info(JSONFactoryUtil.looseSerialize(input));
							_log.info("Call in SynAction **********8 ===========");
							dossierAction = actions.doAction(groupId, dossier, option, proAction, input.getActionCode(),
									input.getActionUser(), input.getActionNote(), input.getAssignUserId(), 0l, subUsers,
									input.getPayment(), serviceContext);
		
						} else {
							if (!auth.isAuth(serviceContext)) {
								throw new UnauthenticationException();
							}
							_log.info("Call ===========");
							_log.info("input.getActionCode(): " + input.getActionCode());
							_log.info("action.getProcessActionId(): " + proAction.getProcessActionId());
							_log.info("input.getActionUser(): " + input.getActionUser());
							dossierAction = actions.doAction(groupId, dossier, option, proAction, input.getActionCode(),
									input.getActionUser(), input.getActionNote(), input.getAssignUserId(),
									user.getUserId(), subUsers, input.getPayment(), serviceContext);
						}
					}
				}
			}

			//
			if (dossierAction != null) {
				return Response.status(200).entity(JSONFactoryUtil.looseSerializeDeep(dossierAction)).build();
			} else {
				return Response.status(405).entity("{ \"error\": \"L???i x???y ra kh??ng th??? th???c hi???n h??nh ?????ng!\" }").build();
			}

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}
	}

	protected String getDictItemName(long groupId, String collectionCode, String itemCode) {

		DictCollection dc = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode(collectionCode, groupId);

		if (Validator.isNotNull(dc)) {
			DictItem it = DictItemLocalServiceUtil.fetchByF_dictItemCode(itemCode, dc.getPrimaryKey(), groupId);

			return it.getItemName();

		} else {
			return StringPool.BLANK;
		}

	}

	protected String getServiceName(String serviceCode, long groupId) throws PortalException {

		try {
			ServiceInfo service = ServiceInfoLocalServiceUtil.getByCode(groupId, serviceCode);

			return service.getServiceName();
		} catch (Exception e) {
			throw new NotFoundException("NotFoundExceptionWithServiceCode");
		}

	}

	protected String getDossierTemplateName(String dossierTemplateCode, long groupId) throws PortalException {
		try {
			DossierTemplate template = DossierTemplateLocalServiceUtil.getByTemplateNo(groupId, dossierTemplateCode);

			return template.getTemplateName();
		} catch (Exception e) {
			throw new NotFoundException("NotFoundExceptionWithTemplateCode");
		}

	}

	public static final String GOVERNMENT_AGENCY = "GOVERNMENT_AGENCY";
	public static final String ADMINISTRATIVE_REGION = "ADMINISTRATIVE_REGION";
	public static final int LENGHT_DOSSIER_PASSWORD = 15;
	public static final String DEFAULT_PATTERN_PASSWORD = "0123456789khoa";

	@Override
	public Response getContactsDossier(HttpHeaders header, ServiceContext serviceContext, Long dossierId,
			String referenceUid) {
		DossierActions action = new DossierActionsImpl();
		BackendAuth auth = new BackendAuthImpl();
		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
			JSONObject result = action.getContacts(groupId, dossierId, referenceUid);
			return Response.status(200).entity(result).build();
		} catch (PortalException e) {
			_log.info(e);
			return processException(e);
		}
	}

	@Override
	public Response cloneDossier(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, long dossierId, String referenceUid) {
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		BackendAuth auth = new BackendAuthImpl();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			DossierActions actions = new DossierActionsImpl();

			Dossier dossier = actions.cloneDossier(groupId, dossierId, serviceContext);

			DossierDetailModel result = DossierUtils.mappingForGetDetail(dossier, user.getUserId());

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}

	}

	@Override
	public Response updateDossierNo(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		String dossierno = GetterUtil.getString(header.getHeaderString("dossierno"));

		BackendAuth auth = new BackendAuthImpl();

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			_log.info("===================== dossierId " + id);

			_log.info("===================== groupId " + groupId);

			_log.info("===================== dossierno " + dossierno);

			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			if (dossier != null && Validator.isNull(dossier.getDossierNo())) {
				dossier.setDossierNo(dossierno);

				DossierLocalServiceUtil.updateDossier(dossier);
			}

			return Response.status(200).entity("OK").build();

		} catch (Exception e) {

			_log.error("Can't syncDossierNo with id = " + id, e);
			_log.info(e);
			return processException(e);

		}

	}

	Log _log = LogFactoryUtil.getLog(DossierManagementImpl.class);

	// Get dossier by certificate Number
	@SuppressWarnings("unchecked")
	@Override
	public Response getDossierByCertificateNumber(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String certificateNumber) {
		_log.info("START*********1");
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		_log.info("groupId: " + groupId);
		BackendAuth auth = new BackendAuthImpl();
		DossierActions actions = new DossierActionsImpl();

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();

			_log.info("certificateNumber: " + certificateNumber);
			params.put(Field.GROUP_ID, String.valueOf(groupId));
			params.put(DossierTerm.DOSSIER_ID + "CTN", certificateNumber);

			Sort[] sorts = new Sort[] { SortFactoryUtil.create("modifiedDate" + "_sortable", Sort.STRING_TYPE, false) };

			JSONObject jsonData = actions.getDossiers(user.getUserId(), company.getCompanyId(), groupId, params, sorts,
					-1, -1, serviceContext);

			JSONObject results = JSONFactoryUtil.createJSONObject();

			Document data = ((List<Document>) jsonData.get("data")).get(0);
			results.put("dossierId", data.get(DossierTerm.DOSSIER_ID));

			return Response.status(200).entity(JSONFactoryUtil.looseSerialize(results)).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}

	}
	
	@Override
	public Response addDossierMark(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, long dossierId, String dossierPartNo,
			DossierMarkInputModel input) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		BackendAuth auth = new BackendAuthImpl();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			DossierMarkActions actions = new DossierMarkActionsImpl();

			DossierMark dossierMark = actions.addDossierMark(groupId, dossierId, dossierPartNo, input.isFileCheck(),
					input.getFileType(), serviceContext);

			DossierMarkResultDetailModel result = DossierMarkUtils.mappingDossierMarkDetailModel(dossierMark);

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			return processException(e);
		}
	}

	@Override
	public Response getDossierMarks(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, long dossierId) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		BackendAuth auth = new BackendAuthImpl();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			DossierMarkActions actions = new DossierMarkActionsImpl();
			
			DossierMarkResultsModel result = new DossierMarkResultsModel();

			List<DossierMark> lstDossierMark = actions.getDossierMarks(groupId, dossierId);

			List<DossierMarkModel> outputs = DossierMarkUtils.mappingDossierMarks(lstDossierMark);
			
			result.setTotal(lstDossierMark.size());
			result.getData().addAll(outputs);

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			return processException(e);
		}
	}

	@Override
	public Response getDossierMarkbyDossierId(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long dossierId, String dossierPartNo) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		BackendAuth auth = new BackendAuthImpl();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			DossierMarkActions actions = new DossierMarkActionsImpl();

			DossierMark dossierMark = actions.getDossierMarkbyDossierId(groupId, dossierId, dossierPartNo);

			DossierMarkResultDetailModel result = DossierMarkUtils.mappingDossierMarkDetailModel(dossierMark);

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			return processException(e);
		}
	}
	

	@Override
	public Response cancellingRequestDossier(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String id, String body) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		BackendAuth auth = new BackendAuthImpl();

		DossierActions actions = new DossierActionsImpl();
		//DossierPermission dossierPermission = new DossierPermission();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			// 1. Update cancellingDate in dossier

			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			serviceContext.setScopeGroupId(groupId);

			Dossier cancellingDossier = actions.cancelDossier(groupId, dossier.getDossierId(),
					dossier.getReferenceUid(), serviceContext);

			// 2. update requestDossier

			String referenceUid = PortalUUIDUtil.generate();
			int status = 3;

			DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossier.getDossierId(), referenceUid,
					RT_CANCELLING, body, 1, status, serviceContext);

			DossierDetailModel result = DossierUtils.mappingForGetDetail(cancellingDossier, user.getUserId());

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}

	}

	@Override
	public Response correctingRequestDossier(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String id, String body) {
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		BackendAuth auth = new BackendAuthImpl();

		DossierActions actions = new DossierActionsImpl();
		//DossierPermission dossierPermission = new DossierPermission();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			// 1. Update cancellingDate in dossier

			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			serviceContext.setScopeGroupId(groupId);

			Dossier correctingDossier = actions.correctDossier(groupId, dossier.getDossierId(),
					dossier.getReferenceUid(), serviceContext);

			// 2. update requestDossier

			String referenceUid = PortalUUIDUtil.generate();
			int status = 3;

			DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossier.getDossierId(), referenceUid,
					RT_CORRECTING, body, 1, status, serviceContext);

			DossierDetailModel result = DossierUtils.mappingForGetDetail(correctingDossier, user.getUserId());

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}

	}

	@Override
	public Response submittingDossierPOST(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String id, String body) {
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		BackendAuth auth = new BackendAuthImpl();

		DossierActions actions = new DossierActionsImpl();
		//DossierPermission dossierPermission = new DossierPermission();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			// 1. Update cancellingDate in dossier

			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			serviceContext.setScopeGroupId(groupId);

			Dossier endorsementDossier = actions.submitPostDossier(groupId, dossier.getDossierId(),
					dossier.getReferenceUid(), serviceContext);

			// 2. update requestDossier

			String referenceUid = PortalUUIDUtil.generate();
			int status = 3;

			DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossier.getDossierId(), referenceUid,
					RT_SUBMITTING, body, 1, status, serviceContext);

			DossierDetailModel result = DossierUtils.mappingForGetDetail(endorsementDossier, user.getUserId());

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}

	}

	@Override
	public Response getProcessStepByDossierId(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String id) {
		BackendAuth auth = new BackendAuthImpl();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
			long dossierId = GetterUtil.getLong(id);

			Dossier dossier = DossierLocalServiceUtil.getDossier(dossierId);
			long dossierActionId = 0;
			DossierAction dossierAction = null;
			long serviceProcessId = 0;
			String actionCode = StringPool.BLANK;
			if (dossier != null) {
				dossierActionId = dossier.getDossierActionId();
				if (dossierActionId > 0) {
					dossierAction = DossierActionLocalServiceUtil.fetchDossierAction(dossierActionId);
				}
			}
			if (dossierAction != null) {
				serviceProcessId = dossierAction.getServiceProcessId();
				actionCode = dossierAction.getActionCode();
			}

			ProcessStep proStep = ProcessStepLocalServiceUtil.fetchBySC_GID(actionCode, groupId, serviceProcessId);
			String restrictDossier = StringPool.BLANK;
			if (proStep != null) {
				restrictDossier = proStep.getRestrictDossier();
			}

			return Response.status(200).entity(restrictDossier).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}
	}

	@Override
	public Response submitDossier(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id, String body) {
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		BackendAuth auth = new BackendAuthImpl();

		DossierActions actions = new DossierActionsImpl();

		//DossierPermission dossierPermission = new DossierPermission();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			// 1. Update cancellingDate in dossier

			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			serviceContext.setScopeGroupId(groupId);

			Dossier cancellingDossier = actions.submitPostDossier(groupId, dossier.getDossierId(),
					dossier.getReferenceUid(), serviceContext);

			// 2. update requestDossier

			String referenceUid = PortalUUIDUtil.generate();
			int status = 0;

			DossierRequestUDLocalServiceUtil.updateDossierRequest(0, dossier.getDossierId(), referenceUid,
					RT_SUBMITTING, body, 1, status, serviceContext);

			DossierDetailModel result = DossierUtils.mappingForGetDetail(cancellingDossier, user.getUserId());

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			return processException(e);
		}
	}
	
	private Response processException(Exception e) {
		ErrorMsg error = new ErrorMsg();

		if (e instanceof UnauthenticationException) {
			error.setMessage("Non-Authoritative Information.");
			error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
			error.setDescription("Non-Authoritative Information.");

			return Response.status(HttpURLConnection.HTTP_NOT_AUTHORITATIVE).entity(error).build();
		} else {
			if (e instanceof UnauthorizationException) {
				error.setMessage("Unauthorized.");
				error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
				error.setDescription("Unauthorized.");

				return Response.status(HttpURLConnection.HTTP_UNAUTHORIZED).entity(error).build();

			} else {

				error.setMessage("No Content.");
				error.setCode(HttpURLConnection.HTTP_FORBIDDEN);
				error.setDescription(e.getMessage());

				return Response.status(HttpURLConnection.HTTP_FORBIDDEN).entity(error).build();

			}
		}
	}
	
	public Response getDossierPenddingByDossierId(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String referenceUid) {
		BackendAuth auth = new BackendAuthImpl();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			//TODO: Fix port process
			long groupId = 55301;

			Dossier dossier = DossierLocalServiceUtil.getByRef(groupId, referenceUid);
			long dossierActionId = 0;
			DossierAction dossierAction = null;
			boolean pendding = false;
			if (dossier != null) {
				dossierActionId = dossier.getDossierActionId();
				if (dossierActionId > 0) {
					dossierAction = DossierActionLocalServiceUtil.fetchDossierAction(dossierActionId);
				}
			}
			if (dossierAction != null) {
				pendding = dossierAction.getPending();
			}

			return Response.status(200).entity(pendding).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Response getDossiersPendingList(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, DossierSearchModel query) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		BackendAuth auth = new BackendAuthImpl();
		DossierPermission dossierPermission = new DossierPermission();
		DossierActions actions = new DossierActionsImpl();

		try {
			boolean isCitizen = false;

			if (!query.getSecetKey().contentEquals("OPENCPSV2")) {

				if (!auth.isAuth(serviceContext)) {
					throw new UnauthenticationException();
				}

				isCitizen = dossierPermission.isCitizen(user.getUserId());

				dossierPermission.hasGetDossiers(groupId, user.getUserId(), query.getSecetKey());
			}

			if (Validator.isNull(query.getEnd()) || query.getEnd() == 0) {

				query.setStart(-1);

				query.setEnd(-1);

			}

			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
			DossierResultsModel results = new DossierResultsModel();

			params.put(Field.GROUP_ID, String.valueOf(groupId));
			params.put(Field.KEYWORD_SEARCH, query.getKeyword());

			String owner = query.getOwner();
			// If user is citizen then default owner true
			if (isCitizen) {
				owner = String.valueOf(true);
			}
			// Get info input params
			String submitting = query.getSubmitting();
			String pendding = query.getPendding();
			String applicantIdNo = query.getApplicantIdNo();

			params.put(DossierTerm.OWNER, owner);
			params.put(DossierTerm.SUBMITTING, submitting);
			params.put("pendding", pendding);
			params.put(DossierTerm.APPLICANT_ID_NO, applicantIdNo);

			Sort[] sorts = new Sort[] { SortFactoryUtil.create(query.getSort() + "_sortable", Sort.STRING_TYPE,
					GetterUtil.getBoolean(query.getOrder())) };

//			_log.info("START 1");
//			_log.info("START Applicant: "+query.getApplicantIdNo());
			
			if (Boolean.parseBoolean(pendding)) {
				long groupIdCXL = 55301;
				JSONObject jsonDataPending = null;

				List<DossierAction> dActionList = DossierActionLocalServiceUtil.getDossiersPending(groupIdCXL, pendding);

				if (dActionList != null && dActionList.size() > 0) {
					LinkedHashMap<String, Object> paramPending = new LinkedHashMap<String, Object>();
					_log.info("dActionList: "+dActionList.size());
					int length = dActionList.size();
					StringBuilder sb = new StringBuilder();
					for (int i = 0; i < length; i ++) {
						DossierAction dAct = dActionList.get(i);
						long dActId = dAct.getDossierActionId();
						if (i == 0) {
							sb.append(dActId);
						} else {
							sb.append(StringPool.COMMA);
							sb.append(dActId);
							
						}
					}
					_log.info("DOSSIER_ACTION_ID_PENDING: "+sb.toString());

					paramPending.put(Field.GROUP_ID, String.valueOf(groupIdCXL));
					paramPending.put(DossierTerm.OWNER, String.valueOf(false));
					paramPending.put(DossierTerm.APPLICANT_ID_NO, query.getApplicantIdNo());
					paramPending.put(DossierTerm.DOSSIER_ACTION_ID_PENDING, sb.toString());
					
					jsonDataPending = actions.getDossiers(user.getUserId(), company.getCompanyId(), groupIdCXL, paramPending, sorts,
							-1, -1, serviceContext);
					_log.info("jsonDataPending: "+jsonDataPending);
				}
				if (jsonDataPending != null) {
					List<Document> docs = (List<Document>) jsonDataPending.get("data");
					if (docs != null && docs.size() > 0) {
						StringBuilder sb1 = new StringBuilder();
						int length = docs.size();
						for (int i = 0; i < length; i ++) {
							Document doc = docs.get(i);
							String referenceUid = doc.get(DossierTerm.REFERENCE_UID);
							if (i == 0) {
								sb1.append(referenceUid);
							} else {
								sb1.append(StringPool.COMMA);
								sb1.append(referenceUid);
							}
						}
						_log.info("REFERENCE_UID: "+sb1.toString());
						params.put(DossierTerm.REFERENCE_UID, sb1.toString());
					}
				}
				
			}

			JSONObject jsonData = actions.getDossiers(user.getUserId(), company.getCompanyId(), groupId, params, sorts,
					-1, -1, serviceContext);

			if (jsonData == null) {
				jsonData = JSONFactoryUtil.createJSONObject(); 
			}

			results.setTotal(jsonData.getInt("total"));

			results.getData().addAll(DossierUtils.mappingForGetList((List<Document>) jsonData.get("data")));

			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Response getDossiersInfoList(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, DossierSearchModel query) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		BackendAuth auth = new BackendAuthImpl();
		DossierPermission dossierPermission = new DossierPermission();
		DossierActions actions = new DossierActionsImpl();

		try {
			boolean isCitizen = false;

			if (!query.getSecetKey().contentEquals("OPENCPSV2")) {

				if (!auth.isAuth(serviceContext)) {
					throw new UnauthenticationException();
				}

				isCitizen = dossierPermission.isCitizen(user.getUserId());

				dossierPermission.hasGetDossiers(groupId, user.getUserId(), query.getSecetKey());
			}

			if (Validator.isNull(query.getEnd()) || query.getEnd() == 0) {

				query.setStart(-1);

				query.setEnd(-1);

			}

			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
			DossierResultsModel results = new DossierResultsModel();

			params.put(Field.GROUP_ID, String.valueOf(groupId));
			params.put(Field.KEYWORD_SEARCH, query.getKeyword());

			String owner = query.getOwner();
			// If user is citizen then default owner true
			if (isCitizen) {
				owner = String.valueOf(true);
			}

			// Test API new
			String dossierArr = query.getDossierArr();
			String status = query.getStatus();
			// Get info input params
//			String submitting = query.getSubmitting();
//			String pendding = query.getPendding();
			String applicantIdNo = query.getApplicantIdNo();

			params.put(DossierTerm.OWNER, owner);
//			params.put(DossierTerm.SUBMITTING, submitting);
//			params.put("pendding", pendding);
			params.put(DossierTerm.APPLICANT_ID_NO, applicantIdNo);
			params.put(DossierTerm.STATUS, status);
			params.put("dossierArr", dossierArr);

			Sort[] sorts = new Sort[] { SortFactoryUtil.create(query.getSort() + "_sortable", Sort.STRING_TYPE,
					GetterUtil.getBoolean(query.getOrder())) };

			
			
//			if (Boolean.parseBoolean(pendding)) {
//				long groupIdCXL = 55301;
//				JSONObject jsonDataPending = null;
//
//				List<DossierAction> dActionList = DossierActionLocalServiceUtil.getDossiersPending(groupIdCXL, pendding);
//
//				if (dActionList != null && dActionList.size() > 0) {
//					LinkedHashMap<String, Object> paramPending = new LinkedHashMap<String, Object>();
//					_log.info("dActionList: "+dActionList.size());
//					int length = dActionList.size();
//					StringBuilder sb = new StringBuilder();
//					for (int i = 0; i < length; i ++) {
//						DossierAction dAct = dActionList.get(i);
//						long dActId = dAct.getDossierActionId();
//						if (i == 0) {
//							sb.append(dActId);
//						} else {
//							sb.append(StringPool.COMMA);
//							sb.append(dActId);
//							
//						}
//					}
//					_log.info("DOSSIER_ACTION_ID_PENDING: "+sb.toString());
//
//					paramPending.put(Field.GROUP_ID, String.valueOf(groupIdCXL));
//					paramPending.put(DossierTerm.OWNER, String.valueOf(false));
//					paramPending.put(DossierTerm.APPLICANT_ID_NO, query.getApplicantIdNo());
//					paramPending.put(DossierTerm.DOSSIER_ACTION_ID_PENDING, sb.toString());
//					
//					jsonDataPending = actions.getDossiers(user.getUserId(), company.getCompanyId(), groupIdCXL, paramPending, sorts,
//							-1, -1, serviceContext);
//					_log.info("jsonDataPending: "+jsonDataPending);
//				}
//				if (jsonDataPending != null) {
//					List<Document> docs = (List<Document>) jsonDataPending.get("data");
//					if (docs != null && docs.size() > 0) {
//						StringBuilder sb1 = new StringBuilder();
//						int length = docs.size();
//						for (int i = 0; i < length; i ++) {
//							Document doc = docs.get(i);
//							String referenceUid = doc.get(DossierTerm.REFERENCE_UID);
//							if (i == 0) {
//								sb1.append(referenceUid);
//							} else {
//								sb1.append(StringPool.COMMA);
//								sb1.append(referenceUid);
//							}
//						}
//						_log.info("REFERENCE_UID: "+sb1.toString());
//						params.put(DossierTerm.REFERENCE_UID, sb1.toString());
//					}
//				}
//				
//			}

			JSONObject jsonData = actions.getDossiers(user.getUserId(), company.getCompanyId(), groupId, params, sorts,
					-1, -1, serviceContext);

			if (jsonData == null) {
				jsonData = JSONFactoryUtil.createJSONObject(); 
			}

			results.setTotal(jsonData.getInt("total"));

			results.getData().addAll(DossierUtils.mappingForGetList((List<Document>) jsonData.get("data")));

			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			_log.info(e);
			return processException(e);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Response resolveConflictDossier(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext) {
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		//long userId = user.getUserId();
		DossierActions actions = new DossierActionsImpl();
		Indexer<Dossier> indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(Dossier.class);
		
		LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
		params.put(Field.GROUP_ID, String.valueOf(groupId));

		//DossierResultsModel results = new DossierResultsModel();

		JSONObject jsonData = actions.getDossiers(user.getUserId(), company.getCompanyId(), groupId, params, null,
					-1, -1, serviceContext);
		
		//List<Dossier> lstInDbs = DossierLocalServiceUtil.getDossiers(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		
		long total = jsonData.getLong("total");
		//JSONArray dossierArr = JSONFactoryUtil.createJSONArray();
		
		if (total > 0) {
			List<Document> lstDocuments = (List<Document>) jsonData.get("data");	
			for (Document document : lstDocuments) {
				long dossierId = GetterUtil.getLong(document.get(DossierTerm.DOSSIER_ID));
				long companyId = GetterUtil.getLong(document.get(Field.COMPANY_ID));
				String uid = document.get(Field.UID);
				Dossier oldDossier = DossierLocalServiceUtil.fetchDossier(dossierId);
				if (oldDossier == null) {
					try {
						indexer.delete(companyId, uid);
					} catch (SearchException e) {
					}
				}
			}
		}
		else {
			
		}
		
		return Response.status(200).entity("{}").build();
	}
	
	@Override
	public Response reindexDossier(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long dossierId) {

		Indexer<Dossier> indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(Dossier.class);
		
		Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
		
		
		try {
			indexer.reindex(dossier);
		} catch (Exception e) {
			return Response.status(404).entity("{error}").build();
		}
		
		
		return Response.status(200).entity("{}").build();
	}
	
	@Override
	public Response delAndReindexDossier(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long dossierId) {

		Indexer<Dossier> indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(Dossier.class);
		
		Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
		
		try {
			
			if (Validator.isNotNull(dossier)) {
				
				//remove dossier
				
				DossierLocalServiceUtil.deleteDossier(dossier);
				
				
				//remove index
				
				indexer.delete(dossier);
			}
		} catch (Exception e) {
			return Response.status(404).entity("{error}").build();
		}
		
		
		return Response.status(200).entity("{}").build();
	}
	
	
	@Override
	public Response resetDossier(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long dossierId) {

		Indexer<Dossier> indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(Dossier.class);
		
		Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
		
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		
		try {
			
			if (Validator.isNotNull(dossier)) {
				
				DictCollection dc = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode(DOSSIER_SATUS_DC_CODE, groupId);

				if (Validator.isNotNull(dc)) {
					DictItem it = DictItemLocalServiceUtil.fetchByF_dictItemCode("new", dc.getPrimaryKey(), groupId);
					
					dossier.setSubmitting(true);
					dossier.setDossierStatus(it.getItemCode());
					dossier.setDossierStatusText(it.getItemName());

				}
				
				
				//update dossier
				
				DossierLocalServiceUtil.updateDossier(dossier);
				
				List<DossierFile> lsDossierFiles = DossierFileLocalServiceUtil.getAllDossierFile(dossierId);
				
				for (DossierFile dossierFile : lsDossierFiles) {
					dossierFile.setIsNew(true);
					
					DossierFileLocalServiceUtil.updateDossierFile(dossierFile);
				}
				
				//update index
				
				indexer.reindex(dossier);
			}
		} catch (Exception e) {
			return Response.status(404).entity("{error}").build();
		}
		
		
		return Response.status(200).entity("{" + dossierId + "groupId" + groupId + "}").build();
	}
	
	
	@Override
	public Response correctingDossier(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long dossierId) {

		Indexer<Dossier> indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(Dossier.class);
		
		Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
		
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		
		try {
			
			if (Validator.isNotNull(dossier)) {
				
				dossier.setSubmitting(true);
				
				dossier.setModifiedDate(new Date());
				
				dossier.setLockState(LOCK_ALL);
				
				//update dossier
				
				DossierLocalServiceUtil.updateDossier(dossier);
				
				List<DossierFile> lsDossierFiles = DossierFileLocalServiceUtil.getAllDossierFile(dossierId);
				
				for (DossierFile dossierFile : lsDossierFiles) {
					dossierFile.setIsNew(true);
					
					DossierFileLocalServiceUtil.updateDossierFile(dossierFile);
				}
				
				//update index
				
				indexer.reindex(dossier);
			}
		} catch (Exception e) {
			return Response.status(404).entity("{error}").build();
		}
		
		
		return Response.status(200).entity("{" + dossierId + "groupId" + groupId + "}").build();
	}

	@Override
	public Response reindexFixDossier(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id) {
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		BackendAuth auth = new BackendAuthImpl();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}
			List<Role> userRoles = user.getRoles();
			boolean isAdmin = false;
			for (Role r : userRoles) {
				if (r.getName().startsWith("Administrator")) {
					isAdmin = true;
					break;
				}
			}
			
			if (!isAdmin) {
				throw new UnauthenticationException();
			}
			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);
			Indexer<Dossier> indexer = IndexerRegistryUtil
					.nullSafeGetIndexer(Dossier.class);
			indexer.reindex(dossier);
			
			DossierDetailModel result = DossierUtils.mappingForGetDetail(dossier, user.getUserId());

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			return Response.status(405).entity("H??? s?? kh??ng t???n t???i ????? index").build();
		}		
	}

	@Override
	public Response rollback(HttpServletRequest request, HttpHeaders header, Company company, Locale locale, User user,
			ServiceContext serviceContext, String id) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		Dossier dossier = DossierMgtUtils.getDossier(id, groupId);
		List<Role> userRoles = user.getRoles();
		boolean isAdmin = false;
		for (Role r : userRoles) {
			if (r.getName().startsWith("Administrator")) {
				isAdmin = true;
				break;
			}
		}

		if (dossier != null) {
			DossierAction dossierAction = DossierActionLocalServiceUtil.fetchDossierAction(dossier.getDossierActionId());
//			if (dossierAction != null && dossierAction.isRollbackable()) {
//				DossierActionLocalServiceUtil.updateState(dossierAction.getDossierActionId(), DossierActionTerm.STATE_ROLLBACK);
//			
//				DossierAction previousAction = DossierActionLocalServiceUtil.fetchDossierAction(dossierAction.getPreviousActionId());
//				if (previousAction != null) {
//					DossierActionLocalServiceUtil.updateState(previousAction.getDossierActionId(), DossierActionTerm.STATE_WAITING_PROCESSING);
//					try {
//						DossierActionLocalServiceUtil.updateNextActionId(previousAction.getDossierActionId(), 0);
//						DossierLocalServiceUtil.rollback(dossier, previousAction);
//					} catch (PortalException e) {
//						return BusinessExceptionImpl.processException(e);
//					}
//				}
//				
//				DossierSync ds = DossierSyncLocalServiceUtil.getByDID_DAD(groupId, dossier.getDossierId(), dossierAction.getDossierActionId());
//				if (ds != null && ((ds.getSyncType() == DossierSyncTerm.SYNCTYPE_INFORM && dossier.getOriginality() == DossierTerm.ORIGINALITY_LIENTHONG)
//						|| (ds.getSyncType() == DossierSyncTerm.SYNCTYPE_REQUEST && dossier.getOriginality() == DossierTerm.ORIGINALITY_DVCTT))) {
//					DossierMgtUtils.processSyncRollbackDossier(dossier);					
//				}
//			}
//			else 
			if (dossierAction != null && isAdmin) {

				DossierAction previousAction = DossierActionLocalServiceUtil.fetchDossierAction(dossierAction.getPreviousActionId());
				if (previousAction != null) {
					//DossierActionLocalServiceUtil.updateState(previousAction.getDossierActionId(), DossierActionTerm.STATE_WAITING_PROCESSING);
					try {
						// Set nextActionId = 0 to previousAction
						DossierActionLocalServiceUtil.updateNextActionId(previousAction.getDossierActionId(), 0);
						
						rollback(dossier, previousAction);
					} catch (PortalException e) {
						return Response.status(500).entity(null).build();
					}
				}	
				
//				DossierSync ds = DossierSyncLocalServiceUtil.getByDID_DAD(groupId, dossier.getDossierId(), dossierAction.getDossierActionId());
//				if (ds != null && ((ds.getSyncType() == DossierSyncTerm.SYNCTYPE_INFORM && dossier.getOriginality() == DossierTerm.ORIGINALITY_LIENTHONG)
//						|| (ds.getSyncType() == DossierSyncTerm.SYNCTYPE_REQUEST && dossier.getOriginality() == DossierTerm.ORIGINALITY_DVCTT))) {
//					DossierMgtUtils.processSyncRollbackDossier(dossier);					
//				}
			}
			return Response.status(200).entity(null).build();
		}
		else {
			return Response.status(405).entity(null).build();
		}
	}

	public Dossier rollback(Dossier dossier, DossierAction dossierAction) {
		ProcessStep processStep = ProcessStepLocalServiceUtil.fetchBySC_GID(dossierAction.getStepCode(),
				dossier.getGroupId(), dossierAction.getServiceProcessId());
		if (processStep != null) {
			JSONObject jsonDataStatusText = getStatusText(dossier.getGroupId(), DOSSIER_SATUS_DC_CODE,
					processStep.getDossierStatus(), processStep.getDossierSubStatus());

			dossier.setDossierActionId(dossierAction.getDossierActionId());
			dossier.setDossierStatus(processStep.getDossierStatus());
			dossier.setDossierStatusText(jsonDataStatusText != null
					? jsonDataStatusText.getString(processStep.getDossierStatus()) : StringPool.BLANK);
			dossier.setDossierSubStatus(processStep.getDossierSubStatus());
			dossier.setDossierSubStatusText(jsonDataStatusText != null
					? jsonDataStatusText.getString(processStep.getDossierSubStatus()) : StringPool.BLANK);
		}
		return DossierLocalServiceUtil.updateDossier(dossier);
	}

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

	public static final String DOSSIER_SATUS_DC_CODE = "DOSSIER_STATUS";
	
	private static final String LOCK_ALL = "LOCK ALL";

	@Override
	public Response getFormDataByDossierFinished(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String serviceCode, String applicantIdNo,
			String registrationId, String fileTemplateNo) {
		
		long groupId = ConstantsUtils.GROUP_CXL;
		try {
		Dossier dossier = DossierLocalServiceUtil.getByF_GID_SC_DS_First(groupId, serviceCode, "done",
				new DossierComparator(false, "finishDate", Date.class));
			if (dossier != null) {
				DossierFile dossierFileDN = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_DPT_First(
						dossier.getDossierId(), fileTemplateNo, 1, false,
						new DossierFileComparator(false, "createDate", Date.class));
				//Add by Dungnv
		        String formData = StringPool.BLANK;
		        if (dossierFileDN != null && (dossierFileDN.getFormDataDossierFile() > 0)) {
			    	File formDataFile = FileUploadUtils.getFile(dossierFileDN.getFormDataDossierFile());
					if (formDataFile != null) {
						formData = FileUploadUtils.fileToString(formDataFile);
					}
		        }
		        if (dossierFileDN != null && formData.isEmpty()) {
		        	formData = dossierFileDN != null ? dossierFileDN.getFormData() : StringPool.BLANK;
		        }
				//Comment by Dungnv
				//String formData = dossierFileDN != null ? dossierFileDN.getFormData() : StringPool.BLANK;
				return Response.status(200).entity(formData).build();
			}
		} catch (NoSuchDossierFileException e) {
			_log.error(e);
		}
		return Response.status(500).entity("{error}").build();
	}

	@Override
	public Response getDossierByReferenceUid_GroupId(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String referenceUid) {
		
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		try {
			BackendAuth auth = new BackendAuthImpl();
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}
			
			Dossier dossier = DossierLocalServiceUtil.getByRef(groupId, referenceUid);
			DossierDetailModel result = DossierUtils.mappingForGetDetail(dossier, user.getUserId());

			return Response.status(200).entity(result).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity("Can't get Dossier: " + e.getClass().getName()).build();
		}
	}

	@Override
	public Response findByDossierStatus(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String dossierStatus, int start, int end) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			result = VRBusinessUtils.findByDossierStatus(dossierStatus, start, end);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get VRExpiredCertificate").toJSONString())
					.build();
		}
	}

}
