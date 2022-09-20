package org.opencps.dossiermgt.scheduler;

import com.fds.vr.service.util.FileUploadUtils;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseSchedulerEntryMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.TimeUnit;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.scheduler.TriggerFactoryUtil;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.servlet.HttpMethods;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.HttpMethod;

import org.opencps.auth.api.exception.NotFoundException;
import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.communication.model.ServerConfig;
import org.opencps.communication.service.ServerConfigLocalServiceUtil;
import org.opencps.datamgt.model.DictCollection;
import org.opencps.datamgt.model.DictItem;
import org.opencps.datamgt.service.DictCollectionLocalServiceUtil;
import org.opencps.datamgt.service.DictItemLocalServiceUtil;
import org.opencps.dossiermgt.action.DossierActions;
import org.opencps.dossiermgt.action.DossierFileActions;
import org.opencps.dossiermgt.action.PaymentFileActions;
import org.opencps.dossiermgt.action.impl.DossierActionsImpl;
import org.opencps.dossiermgt.action.impl.DossierFileActionsImpl;
import org.opencps.dossiermgt.action.impl.DossierPermission;
import org.opencps.dossiermgt.action.impl.PaymentFileActionsImpl;
import org.opencps.dossiermgt.action.util.ConstantsUtils;
import org.opencps.dossiermgt.action.util.DossierMgtUtils;
import org.opencps.dossiermgt.action.util.DossierNumberGenerator;
import org.opencps.dossiermgt.action.util.MultipartUtility;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.DossierPart;
import org.opencps.dossiermgt.model.DossierRequestUD;
import org.opencps.dossiermgt.model.DossierSync;
import org.opencps.dossiermgt.model.PaymentFile;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.ProcessOption;
import org.opencps.dossiermgt.model.ServiceConfig;
import org.opencps.dossiermgt.model.ServiceInfo;
import org.opencps.dossiermgt.model.ServiceProcess;
import org.opencps.dossiermgt.service.DossierActionLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierPartLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierRequestUDLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierSyncLocalServiceUtil;
import org.opencps.dossiermgt.service.PaymentFileLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessOptionLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceConfigLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceInfoLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceProcessLocalServiceUtil;
import org.opencps.dossiermgt.vr.utils.VRBusinessUtils;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = DossierPullScheduler.class)
public class DossierPullScheduler extends BaseSchedulerEntryMessageListener {
	// private final String serectKey = "OPENCPSV2";
	private static final int BUFFER_SIZE = 4096;
	private static volatile boolean isRunningPull = false;

	@Override
	protected void doReceive(Message message) throws Exception {

		if (!isRunningPull) {
			isRunningPull = true;
		} else {
			return;
		}
		//_log.info("OpenCPS PULL DOSSIERS IS STARTING : " + APIDateTimeUtils.convertDateToString(new Date()));

		Company company = CompanyLocalServiceUtil.getCompanyByMx(PropsUtil.get(PropsKeys.COMPANY_DEFAULT_WEB_ID));

		User systemUser = UserLocalServiceUtil.getUserByEmailAddress(company.getCompanyId(),
				RESTFulConfiguration.SERVER_USER);

		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCompanyId(company.getCompanyId());
		serviceContext.setUserId(systemUser.getUserId());

		try {

			List<Dossier> dossierList = DossierLocalServiceUtil.getBySubmitting(true);

			if (dossierList != null && dossierList.size() > 0) {
				//_log.info("dossierList : " + dossierList.size());
				for (Dossier dossier : dossierList) {
					pullDossier(company, dossier, systemUser);
				}
			}

		} catch (Exception e) {
		}

		//Sync Scheduler
		try {
			List<ServerConfig> configList = ServerConfigLocalServiceUtil.getServerConfigs(QueryUtil.ALL_POS,
					QueryUtil.ALL_POS);

			for (ServerConfig config : configList) {
				if (Validator.isNotNull(config.getServerNo())) {
					List<DossierSync> dossierSyncList = DossierSyncLocalServiceUtil.fetchByServerNo(
							config.getServerNo(), ConstantsUtils.SYNC_PENDING, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					try {
						for (DossierSync dossierSync : dossierSyncList) {
							long dossierSyncId = dossierSync.getDossierSyncId();

							Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierSync.getDossierId());

							long actionPenddingId = Validator.isNotNull(dossier) ? dossier.getDossierActionId() : 0l;

							DossierAction action = DossierActionLocalServiceUtil
									.fetchDossierAction(dossierSync.getClassPK());

							singleServerSync(config.getGroupId(),
									Validator.isNotNull(action) ? action.getSyncActionCode() : StringPool.BLANK,
									Validator.isNotNull(action) ? action.getActionUser() : StringPool.BLANK,
									Validator.isNotNull(action) ? action.getActionNote() : StringPool.BLANK, 0l,
									dossier.getReferenceUid(), actionPenddingId, dossierSyncId,
									dossierSync.getDossierId(), dossierSync.getClassPK(),
									dossierSync.getCreateDossier(), serviceContext);
						}
					} catch (Exception e) {
					}
				}
			}
		} catch (Exception e) {
		}

		isRunningPull = false;
		//_log.info("OpenCPS PULL DOSSIERS IS DONE : " + APIDateTimeUtils.convertDateToString(new Date()));
	}
	
	//Sync ===

	private static final String GOVERNMENT_AGENCY = "GOVERNMENT_AGENCY";
	private static final String ADMINISTRATIVE_REGION = "ADMINISTRATIVE_REGION";
	private static final int LENGHT_DOSSIER_PASSWORD = 15;
	private static final String DEFAULT_PATTERN_PASSWORD = "0123456789khoa";

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

	private Dossier addDossier(long groupId, long userId, String serviceCode, String govAgencyCode,
			String dossierTemplateNo, String referenceUid, String applicantName, String applicantIdType,
			String applicantIdNo, Date applicantIdDate, String address, String cityCode, String districtCode,
			String wardCode, String contactName, String contactTelNo, String contactEmail, String applicantNote,
			ServiceContext serviceContext) throws PortalException {
		DossierPermission dossierPermission = new DossierPermission();

		DossierActions actions = new DossierActionsImpl();

		dossierPermission.hasCreateDossier(groupId, userId, serviceCode, govAgencyCode, dossierTemplateNo);

		int counter = DossierNumberGenerator.counterDossier(userId, groupId);

		ProcessOption option = DossierMgtUtils.getProcessOption(serviceCode, govAgencyCode, dossierTemplateNo, groupId);

		// Create dossierNote

		ServiceProcess process = ServiceProcessLocalServiceUtil.getServiceProcess(option.getServiceProcessId());

		if (Validator.isNull(referenceUid) || referenceUid.trim().length() == 0)
			referenceUid = DossierNumberGenerator.generateReferenceUID(groupId);

		String serviceName = getServiceName(serviceCode, groupId);

		String govAgencyName = getDictItemName(groupId, GOVERNMENT_AGENCY, govAgencyCode);

		String cityName = getDictItemName(groupId, ADMINISTRATIVE_REGION, cityCode);
		String districtName = getDictItemName(groupId, ADMINISTRATIVE_REGION, districtCode);
		String wardName = getDictItemName(groupId, ADMINISTRATIVE_REGION, wardCode);

		boolean online = true;

		// DOSSIER that was created in CLIENT is set ONLINE = false
		if (process.getServerNo().trim().length() != 0) {
			online = false;
		}

		String password = StringPool.BLANK;

		if (Validator.isNotNull(process.getGeneratePassword()) && process.getGeneratePassword()) {
			password = DossierNumberGenerator.generatePassword(DEFAULT_PATTERN_PASSWORD, LENGHT_DOSSIER_PASSWORD);
		}

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String _applicantIdDate = sdf.format(applicantIdDate);

		Dossier dossier = actions.initDossier(groupId, 0l, referenceUid, counter, serviceCode, serviceName,
				govAgencyCode, govAgencyName, applicantName, applicantIdType, applicantIdNo, _applicantIdDate, address,
				cityCode, cityName, districtCode, districtName, wardCode, wardName, contactName, contactTelNo,
				contactEmail, dossierTemplateNo, password, 0, StringPool.BLANK, StringPool.BLANK, StringPool.BLANK,
				StringPool.BLANK, online, process.getDirectNotification(), applicantNote, serviceContext);

		return dossier;
	}

	//Sau nay ai maintain he thong nay nho dua ham nay vao trong dossierSyncLocalServiceImpl de cac table duoc commit cung luc
	private void singleServerSync(long groupId, String actionCode, String actionUser, String actionNote,
			long assignUserId, String refId, long clientDossierActionId, long dossierSyncId, long dossierId,
			long classPK, boolean isCreateDossier, ServiceContext serviceContext) throws PortalException {
		boolean hasResult = true;
		DossierSync sync = DossierSyncLocalServiceUtil.getDossierSync(dossierSyncId);
		//_log.info("=========== DossierSync is starting ==========> " + sync);
		Dossier dossier_CXL = DossierLocalServiceUtil.fetchDossier(dossierId);

		int retry = sync.getRetry();
		// Retry sync duoi 5 lan
		if (retry <= 5) {
			if (isCreateDossier) {
				//_log.info("===========> Creating Dossier_CTN - START");
				// Tao dossier tai CTN
				Dossier dossier_CTN = addDossier(groupId, serviceContext.getUserId(), dossier_CXL.getServiceCode(),
						dossier_CXL.getGovAgencyCode(), dossier_CXL.getDossierTemplateNo(),
						dossier_CXL.getReferenceUid(), dossier_CXL.getApplicantName(), dossier_CXL.getApplicantIdType(),
						dossier_CXL.getApplicantIdNo(), dossier_CXL.getApplicantIdDate(), dossier_CXL.getAddress(),
						dossier_CXL.getCityCode(), dossier_CXL.getDistrictCode(), dossier_CXL.getWardCode(),
						dossier_CXL.getContactName(), dossier_CXL.getContactTelNo(), dossier_CXL.getContactEmail(),
						dossier_CXL.getApplicantNote(), serviceContext);

				if (dossier_CTN != null) {
					// reset creaetDossier flag
					DossierSyncLocalServiceUtil.shiftCreateDossierStatus(dossierSyncId);

					//_log.info("===========> Created Dossier_CTN - DONE");
				}
			}

			String payload = sync.getPayload();
			// _log.debug("Dungnv: -----------> Sync: " + payload);
			JSONObject jPayload = JSONFactoryUtil.createJSONObject(payload);
			// Sync paymentFile
			if (jPayload.has(ConstantsUtils.PAYLOAD_SYNC_PAYMENTFILE)) {
				//_log.info("----> SYNC PaymentFile - START - dossierId_CXL: " + dossierId);
				try {
					JSONObject payloadPaymentfile = JSONFactoryUtil
							.createJSONObject(jPayload.getString(ConstantsUtils.PAYLOAD_SYNC_PAYMENTFILE));

					PaymentFile paymentFileServer = PaymentFileLocalServiceUtil.fectPaymentFile(
							payloadPaymentfile.getLong("dossierId"), payloadPaymentfile.getString("fileReferenceUid"));

					Dossier dossier_PaymentFile = DossierMgtUtils
							.getDossier(payloadPaymentfile.getString("dossierReferenceUid"), groupId);

					PaymentFileActions actions = new PaymentFileActionsImpl();

					PaymentFile oldPaymentFileClient = PaymentFileLocalServiceUtil.getByG_ID(groupId,
							dossier_PaymentFile.getDossierId());

					PaymentFile paymentFileClient = null;

					if (oldPaymentFileClient != null) {
						paymentFileClient = oldPaymentFileClient;
					} else {
						paymentFileClient = actions.createPaymentFile(serviceContext.getUserId(), groupId,
								dossier_PaymentFile.getDossierId(), paymentFileServer.getReferenceUid(),
								paymentFileServer.getPaymentFee(), paymentFileServer.getPaymentAmount(),
								paymentFileServer.getPaymentNote(), paymentFileServer.getEpaymentProfile(),
								paymentFileServer.getBankInfo(), 0, paymentFileServer.getPaymentMethod(),
								paymentFileServer.getPaymentFormData(), serviceContext);
					}

					paymentFileClient.setInvoiceTemplateNo(paymentFileServer.getInvoiceTemplateNo());
					if (Validator.isNotNull(paymentFileServer.getConfirmFileEntryId())) {
						paymentFileClient.setConfirmFileEntryId(paymentFileServer.getConfirmFileEntryId());
					}
					if (Validator.isNotNull(paymentFileServer.getPaymentStatus())) {
						paymentFileClient.setPaymentStatus(paymentFileServer.getPaymentStatus());
					}
					if (Validator.isNotNull(paymentFileServer.getEinvoice())) {
						paymentFileClient.setEinvoice(paymentFileServer.getEinvoice());
					}
					if (Validator.isNotNull(paymentFileServer.getPaymentAmount())) {
						paymentFileClient.setPaymentAmount(paymentFileServer.getPaymentAmount());
					}
					if (Validator.isNotNull(paymentFileServer.getPaymentMethod())) {
						paymentFileClient.setPaymentMethod(paymentFileServer.getPaymentMethod());
					}
					if (Validator.isNotNull(paymentFileServer.getGovAgencyCode())) {
						paymentFileClient.setGovAgencyCode(paymentFileServer.getGovAgencyCode());
					}
					if (Validator.isNotNull(paymentFileServer.getGovAgencyName())) {
						paymentFileClient.setGovAgencyName(paymentFileServer.getGovAgencyName());
					}
					if (Validator.isNotNull(paymentFileServer.getGovAgencyTaxNo())) {
						paymentFileClient.setGovAgencyTaxNo(paymentFileServer.getGovAgencyTaxNo());
					}

					paymentFileClient = PaymentFileLocalServiceUtil.updatePaymentFile(paymentFileClient);

					if (paymentFileClient != null) {
						// Reset isNew
						paymentFileServer.setIsNew(false);
						PaymentFileLocalServiceUtil.updatePaymentFile(paymentFileServer);
						// DossierFileLocalServiceUtil.updateDossierFile(dossierFile);

						//_log.info("--> Sync PaymentFile - DONE - dossierId_CXL: " + dossierId);
					} else {
						//_log.info("--> Sync PaymentFile - FAILED - dossierId_CXL: " + dossierId);
						hasResult = false;
					}
				} catch (Exception e) {
					_log.error(e);
					hasResult = false;
				}
			}
			if (hasResult) {
				// SyncDossierFile
				if (jPayload.has(ConstantsUtils.PAYLOAD_SYNC_FILES)) {
					_log.info("----> SYNC DossierFile - START - dossierId_CXL: " + dossierId);
					try {
						String payloadDossierFiles = jPayload.getString(ConstantsUtils.PAYLOAD_SYNC_FILES);
						JSONArray arrayDossierFile = JSONFactoryUtil.createJSONArray(payloadDossierFiles);
						for (int i = 0; i < arrayDossierFile.length(); i++) {
							JSONObject object = arrayDossierFile.getJSONObject(i);

							DossierFile dossierFileServer = DossierFileLocalServiceUtil
									.getDossierFile(object.getLong("classPK"));

							if (dossierFileServer.getRemoved()) {
								DossierFile dossierFileClient = DossierFileLocalServiceUtil.getByRefAndGroupId(
										ConstantsUtils.GROUP_CTN, dossierFileServer.getReferenceUid());
								dossierFileClient.setRemoved(true);

								// update dossierFile
								DossierFileLocalServiceUtil.updateDossierFile(dossierFileClient);
							} else {
								String formData = StringPool.BLANK;
								if (Validator.isNotNull(dossierFileServer) && (dossierFileServer.getFormDataDossierFile() > 0)) {
									File formDataFile = FileUploadUtils.getFile(dossierFileServer.getFormDataDossierFile());
									if (formDataFile != null) {
										formData = FileUploadUtils.fileToString(formDataFile);
									}
								}
								
								if (Validator.isNotNull(dossierFileServer) && formData.isEmpty()) {
									formData = dossierFileServer.getFormData();
								}

								FileEntry fileEntry = null;
								if (dossierFileServer.getFileEntryId() > 0) {
									fileEntry = DLAppLocalServiceUtil.getFileEntry(dossierFileServer.getFileEntryId());
								}

								Dossier dossier_DossierFiles = DossierLocalServiceUtil.getByRef(groupId, refId);

								String referenceUid = dossierFileServer.getReferenceUid();
								if (Validator.isNull(referenceUid) || referenceUid.equals(StringPool.BLANK)) {
									referenceUid = UUID.randomUUID().toString();
								}

								DossierFileActions action = new DossierFileActionsImpl();
								DossierFile dossierFileClient = null;
								DossierFile oldDossierFileClient = null;

								if (Validator.isNotNull(referenceUid)) {
									oldDossierFileClient = DossierFileLocalServiceUtil.getDossierFileByReferenceUid(
											dossier_DossierFiles.getDossierId(), referenceUid);
								}
								if (oldDossierFileClient != null) {
									dossierFileClient = action.updateDossierFileBySingleServer(groupId,
											dossier_DossierFiles.getDossierId(), referenceUid,
											dossierFileServer.getDisplayName(), dossierFileServer.getFileEntryId(),
											serviceContext);

									//_log.info("__End add file at:" + new Date());

									if (dossierFileServer.getFormDataDossierFile() > 0) {
										dossierFileClient
												.setFormDataDossierFile(dossierFileServer.getFormDataDossierFile());
									} else {
										if (Validator.isNotNull(formData)) {
											dossierFileClient.setFormData(formData);
										}
									}
									//_log.info("__Start update dossier file at:" + new Date());

									dossierFileClient = DossierFileLocalServiceUtil
											.updateDossierFile(dossierFileClient);

									//_log.info("__End update dossier file at:" + new Date());
								} else {
									//_log.info("__Start add file at:" + new Date());

									dossierFileClient = action.addDossierFileBySingleServer(groupId,
											dossier_DossierFiles.getDossierId(), referenceUid,
											dossierFileServer.getDossierTemplateNo(),
											dossierFileServer.getDossierPartNo(), dossierFileServer.getFileTemplateNo(),
											dossierFileServer.getDisplayName(), dossierFileServer.getDisplayName(), 0,
											dossierFileServer.getFileEntryId(),
											Validator.isNotNull(fileEntry) ? fileEntry.getMimeType() : StringPool.BLANK,
											StringPool.FALSE, dossier_DossierFiles.getDossierActionId(),
											serviceContext);

									//_log.info("__End add file at:" + new Date());

									if (dossierFileServer.getFormDataDossierFile() > 0) {
										dossierFileClient
												.setFormDataDossierFile(dossierFileServer.getFormDataDossierFile());
									} else {
										if (Validator.isNotNull(formData)) {
											dossierFileClient.setFormData(formData);
										}
									}
									//_log.info("__Start update dossier file at:" + new Date());

									dossierFileClient = DossierFileLocalServiceUtil
											.updateDossierFile(dossierFileClient);

									//_log.info("__End update dossier file at:" + new Date());
								}

								if (dossierFileClient != null) {
									//_log.info("--> Sync DossierFile - DONE - dossierId_CXL: " + dossierId);
								} else {
									hasResult = false;
									//_log.info("--> Sync DossierFile - FAILED - dossierId_CXL: " + dossierId);
								}

							}

							// Reset isNew
							dossierFileServer.setIsNew(false);
							DossierFileLocalServiceUtil.updateDossierFile(dossierFileServer);
						}
					} catch (Exception e) {
						_log.error(e);
						hasResult = false;
					}
				}
			}
			// Sync paymentStatus
			if (hasResult) {
				if (jPayload.has(ConstantsUtils.PAYLOAD_SYNC_PAYMENTSTATUS)) {
					try {
						_log.info("----> SYNC PaymentStatus - START - dossierId_CXL: " + dossierId);
						JSONArray arrayPaymentStatus = JSONFactoryUtil
								.createJSONArray(jPayload.getString(ConstantsUtils.PAYLOAD_SYNC_PAYMENTSTATUS));

						for (int i = 0; i < arrayPaymentStatus.length(); i++) {
							JSONObject paymentStatus = arrayPaymentStatus.getJSONObject(0);

							PaymentFile paymentFileServer = PaymentFileLocalServiceUtil.fectPaymentFile(
									paymentStatus.getLong("dossierId"), paymentStatus.getString("fileReferenceUid"));

							SimpleDateFormat format = new SimpleDateFormat("DD-MM-YYYY HH:MM:SS");

							Dossier dossier_PaymentStatus = DossierLocalServiceUtil.getByRef(groupId,
									paymentStatus.getString("dossierReferenceUid"));

							PaymentFileActions action = new PaymentFileActionsImpl();

							PaymentFile paymentFileClient = action.updateFileApproval(groupId,
									dossier_PaymentStatus.getDossierId(), paymentFileServer.getReferenceUid(),
									Validator.isNotNull(paymentFileServer.getApproveDatetime())
											? format.format(paymentFileServer.getApproveDatetime())
											: format.format(new Date()),
									paymentFileServer.getAccountUserName(), paymentFileServer.getGovAgencyTaxNo(),
									paymentFileServer.getInvoiceTemplateNo(), paymentFileServer.getInvoiceIssueNo(),
									paymentFileServer.getInvoiceNo(), false, serviceContext);

							if (paymentFileClient != null) {
								// Reset isNew Server
								paymentFileServer.setIsNew(false);
								PaymentFileLocalServiceUtil.updatePaymentFile(paymentFileServer);

								// Reset isNew Client
								paymentFileClient.setIsNew(false);
								paymentFileClient = PaymentFileLocalServiceUtil.updatePaymentFile(paymentFileClient);

								//_log.info("--> Sync PaymentStatus - DONE - dossierId_CXL: " + dossierId);
							} else {
								hasResult = false;
								//_log.info("--> Sync PaymentStatus - FAILED - dossierId_CXL: " + dossierId);
							}
						}
					} catch (Exception e) {
						_log.error(e);
						hasResult = false;
					}
				}
			}
			// SyncAction
			if (hasResult) {
				try {
					_log.info("----> SYNC DossierAction - START - dossierId_CXL: " + dossierId);

					DossierActions actions = new DossierActionsImpl();

					Dossier dossier_DossierActions = DossierMgtUtils.getDossier(refId, groupId);
					if (dossier_DossierActions != null) {
						ProcessOption option = DossierMgtUtils.getProcessOption(dossier_DossierActions.getServiceCode(),
								dossier_DossierActions.getGovAgencyCode(),
								dossier_DossierActions.getDossierTemplateNo(), groupId);
						//_log.info("===================> option = " + option);
						if (option != null) {
							ProcessAction proAction = DossierMgtUtils.getProcessAction(groupId, dossier_DossierActions,
									actionCode, option.getServiceProcessId());
							//_log.info("===================> proAction = " + proAction);
							if (proAction != null) {
								//_log.info("Call in SynAction **********8 ===========");
								actions.doAction(groupId, dossier_DossierActions, option, proAction, actionCode,
										actionUser, actionNote, assignUserId, 0l, null, null, serviceContext);
							}
						}
					}
					//_log.info("--> Sync DossierAction - DONE - dossierId_CXL: " + dossierId);

					if (dossier_CXL != null && Validator.isNotNull(dossier_CXL.getDossierNo())) {

						Dossier dossier_DossierNo = DossierMgtUtils.getDossier(refId, groupId);

						if (dossier_DossierNo != null && Validator.isNull(dossier_DossierNo.getDossierNo())) {
							dossier_DossierNo.setDossierNo(dossier_CXL.getDossierNo());
							dossier_DossierNo = DossierLocalServiceUtil.updateDossier(dossier_DossierNo);
						}

						if (dossier_DossierNo != null) {
							//_log.info("=========> Update dossierNo for dossierId: " + dossier_DossierNo.getDossierId()	+ " = " + dossier_DossierNo.getDossierNo());
						} else {
							hasResult = false;
						}
					}
				} catch (Exception e) {
					_log.error(e);
					hasResult = false;
				}
			}
			if (hasResult) {
				sync.setState(ConstantsUtils.SYNC_SUCCESS);
			} else {
				sync.setState(ConstantsUtils.SYNC_PENDING); // Sync khong thanh cong thi tiep tuc sync
				sync.setRetry(++retry);
			}
			if (hasResult) {
				// remove pending in DossierAction
				int countDossierSync = DossierSyncLocalServiceUtil.countByDossierId(dossierId);

				if (countDossierSync == 0 && clientDossierActionId > 0) {
					DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);
				}
			}
		} else {
			hasResult = false;
			sync.setState(ConstantsUtils.SYNC_FAIL);
		}
		DossierSyncLocalServiceUtil.updateDossierSync(sync);
	}
	//===

	private void pullDossier(Company company, Dossier dossier, User systemUser) throws PortalException {

		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCompanyId(company.getCompanyId());
		serviceContext.setUserId(dossier.getUserId());

		long dossierId = dossier.getDossierId();
		long sourceGroupId = dossier.getGroupId();
		String referenceUid = dossier.getReferenceUid();
		String serverno = dossier.getServerNo();
		String serviceCode = dossier.getServiceCode();
		String govAgencyCode = dossier.getGovAgencyCode();
		String dossierTemplateNo = dossier.getDossierTemplateNo();

		List<ServiceProcess> processes = ServiceProcessLocalServiceUtil.getByServerNo(serverno);
		// List<ServiceProcess> syncProcesses = new ArrayList<ServiceProcess>();
		DossierActions actions = new DossierActionsImpl();

		long desGroupId = 0;
		long serviceProcessId = 0;
		ProcessOption option = null;
		for (ServiceProcess process : processes) {
			desGroupId = process.getGroupId();
			try {
				ServiceConfig config = ServiceConfigLocalServiceUtil.getBySICodeAndGAC(desGroupId, serviceCode,
						govAgencyCode);

				if (Validator.isNotNull(config)) {
					option = ProcessOptionLocalServiceUtil.getByDTPLNoAndServiceCF(desGroupId, dossierTemplateNo,
							config.getServiceConfigId());
					if (Validator.isNotNull(option)) {
						serviceProcessId = option.getServiceProcessId();
						break;
					}
				}
			} catch (Exception e) {
				_log.info("NOProcess");
			}

		}

		if (desGroupId > 0 && serviceProcessId > 0 && option != null) {

			Dossier desDossier = DossierLocalServiceUtil.getByRef(desGroupId, referenceUid);
			long userId = systemUser.getUserId();
			//_log.info("userId: " + userId + "====desGroupId=====" + desGroupId + "======serviceProcessId====="	+ serviceProcessId);

			if (Validator.isNull(desDossier)) {
				// Create DOSSIER
				//_log.info("CREATE DOSSIER PULL");
				desDossier = DossierLocalServiceUtil.updateDossier(desGroupId, 0l, referenceUid, dossier.getCounter(),
						serviceCode, dossier.getServiceName(), govAgencyCode, dossier.getGovAgencyName(),
						dossier.getApplicantName(), dossier.getApplicantIdType(), dossier.getApplicantIdNo(),
						dossier.getApplicantIdDate(), dossier.getAddress(), dossier.getCityCode(),
						dossier.getCityName(), dossier.getDistrictCode(), dossier.getDistrictName(),
						dossier.getWardCode(), dossier.getWardName(), dossier.getContactName(),
						dossier.getContactTelNo(), dossier.getContactEmail(), dossierTemplateNo,
						dossier.getDossierNote(), dossier.getSubmissionNote(), dossier.getApplicantNote(),
						dossier.getBriefNote(), dossier.getDossierNo(), false, dossier.getCorrecttingDate(),
						dossier.getDossierStatus(), dossier.getDossierStatusText(), dossier.getDossierSubStatus(),
						dossier.getDossierSubStatusText(), 0l, 0l, dossier.getViaPostal(), dossier.getPostalAddress(),
						dossier.getPostalCityCode(), dossier.getPostalCityName(), dossier.getPostalTelNo(),
						dossier.getPassword(), dossier.getNotification(), dossier.getOnline(), dossier.getServerNo(),
						dossier.getSubmitDate() != null ? dossier.getSubmitDate() : new Date(), serviceContext);

				// get the list of payment file need to sync
				List<JSONObject> lsPaymentsFileSync = new ArrayList<>();
				getPaymentFiles(sourceGroupId, dossierId, lsPaymentsFileSync);

				// Do Pull paymentFile to client
				pullPaymentFile(sourceGroupId, dossierId, desDossier.getGroupId(), desDossier.getDossierId(),
						lsPaymentsFileSync, serviceContext);

				// long desDossierId = desDossier.getPrimaryKey();
				// doAction in this case is an Applicant object
				String applicantNote = dossier.getApplicantNote();
				String applicantName = dossier.getApplicantName();

				// Process doAction (with autoEvent = SUBMIT)
				try {

					ProcessAction processAction = ProcessActionLocalServiceUtil.fetchBySPI_PRESC_AEV(serviceProcessId,
							StringPool.BLANK, "SUBMIT");

					if (processAction != null && processAction.getProcessActionId() > 0) {
						//_log.info("========serviceProcessId=======" + serviceProcessId
						//		+ "=======GETPROCESSACTION************" + processAction.getActionName());
						actions.doAction(desGroupId, desDossier, option, processAction, processAction.getActionCode(),
								applicantName, applicantNote, processAction.getAssignUserId(), systemUser.getUserId(),
								StringPool.BLANK, StringPool.BLANK, serviceContext);
						//
						// TODO add sync DOSSIERFILE and PAYMENTFILE
						// get the list of file of source dossier need to sync
						List<DossierFile> dossierFileList = DossierFileLocalServiceUtil
								.getByDossierIdAndIsNew(dossierId, true);
						// getDossierFiles(sourceGroupId, dossierId, lsFileSync);
						if (dossierFileList != null && dossierFileList.size() > 0) {
							for (DossierFile dossierFile : dossierFileList) {
								dossierFile.setIsNew(false);
								dossierFile = DossierFileLocalServiceUtil.updateDossierFile(dossierFile);

								// Add by Dungnv - Add trackchanges and history
//								serviceContext.setScopeGroupId(dossier.getGroupId());
//								String partNo = dossierFile.getDossierPartNo();
//								
//								VRBusinessUtils.updateVRTrackchangesAndVRHistoryProfileForDossier(dossierFile.getFormDataDossierFile(), partNo, 
//										dossierFile.getDossierTemplateNo(), dossierId, dossier.getCompanyId(), 
//										dossierFile.getFileEntryId(), serviceContext);
							}
							//_log.info("START pull dossier File1: ");
							pullDossierFiles(userId, desDossier.getGroupId(), desDossier.getDossierId(),
									dossierFileList, dossier, referenceUid, desDossier.getDossierActionId(),
									serviceContext);
						}
					}

				} catch (Exception e) {
					_log.error(e);
					_log.info("SyncDossier Unsuccessfully=========" + desDossier.getReferenceUid());
				}

			} else {
				//_log.info("UPDATE_____IN_CASE_HAS_DES_DOSSIER___________");
				Date cancellingDate = dossier.getCancellingDate();
				Date correctingDate = dossier.getCorrecttingDate();
				Date endorsementDate = dossier.getEndorsementDate();
				//_log.info("CANCELLING DATE: " + cancellingDate);

				if (Validator.isNotNull(cancellingDate)) {
					// Update cancellingDate
					_log.info("UPDATE____CANCELLING_DATE");
					desDossier.setCancellingDate(cancellingDate);
				}

				if (Validator.isNotNull(correctingDate)) {
					_log.info("UPDATE____CORRECTTING_DATE");
					// Update correctingDate
					desDossier.setCorrecttingDate(correctingDate);
				}

				if (Validator.isNotNull(endorsementDate)) {
					_log.info("UPDATE____ENDOSEMENT_DATE");
					// Update correctingDate
					desDossier.setEndorsementDate(endorsementDate);
				}

				// Update dossier
				DossierLocalServiceUtil.updateDossier(desDossier);

				// the resubmit case
				if (dossier.getSubmitting()) {
					// Check autoEvent
					ProcessAction processAction = null;
					DossierAction dossierAction = null;

					try {
						dossierAction = DossierActionLocalServiceUtil.getDossierAction(desDossier.getDossierActionId());

						processAction = ProcessActionLocalServiceUtil.fetchBySPI_PRESC_AEV(serviceProcessId,
								dossierAction.getStepCode(), "SUBMIT");
					} catch (Exception e) {
						_log.error(e);
					}

					// get the list of payment file need to sync
					List<JSONObject> lsPaymentsFileSync = new ArrayList<>();
					getPaymentFiles(sourceGroupId, dossierId, lsPaymentsFileSync);

					// Do Pull paymentFile to client
					pullPaymentFile(sourceGroupId, dossierId, desDossier.getGroupId(), desDossier.getDossierId(),
							lsPaymentsFileSync, serviceContext);

					serviceContext.setCompanyId(desDossier.getCompanyId());
					serviceContext.setScopeGroupId(desDossier.getGroupId());

					synDossierRequest(dossierId, desDossier.getDossierId(), serviceContext);

					if (Validator.isNotNull(processAction) && Validator.isNull(cancellingDate)) {
						// doAction in this case is an Applicant object
						String applicantNote = dossier.getApplicantNote();
						String applicantName = dossier.getApplicantName();
//						String actionNote = StringPool.BLANK;
//						if (dossierAction != null) {
//							actionNote = dossierAction.getActionNote();
//						}

						actions.doAction(desGroupId, desDossier, option, processAction, processAction.getActionCode(),
								applicantName, applicantNote, processAction.getAssignUserId(), systemUser.getUserId(),
								StringPool.BLANK, StringPool.BLANK, serviceContext);

						// TODO add sync DOSSIERFILE and PAYMENTFILE
						// get the list of file of source dossier need to sync
						List<DossierFile> dossierFileList = DossierFileLocalServiceUtil
								.getByDossierIdAndIsNew(dossierId, true);
						// getDossierFiles(sourceGroupId, dossierId, lsFileSync);
						if (dossierFileList != null && dossierFileList.size() > 0) {
							for (DossierFile dossierFile : dossierFileList) {
								dossierFile.setIsNew(false);
								dossierFile = DossierFileLocalServiceUtil.updateDossierFile(dossierFile);

								// Add by Dungnv - Add trackchanges and history
//								serviceContext.setScopeGroupId(dossier.getGroupId());
//								String partNo = dossierFile.getDossierPartNo();
//								
//								VRBusinessUtils.updateVRTrackchangesAndVRHistoryProfileForDossier(dossierFile.getFormDataDossierFile(), partNo, 
//										dossierFile.getDossierTemplateNo(), dossierId, dossier.getCompanyId(), 
//										dossierFile.getFileEntryId(), serviceContext);
							}
							_log.info("START pull dossier File1: ");
							pullDossierFiles(userId, desDossier.getGroupId(), desDossier.getDossierId(),
									dossierFileList, dossier, referenceUid, desDossier.getDossierActionId(),
									serviceContext);
						}

					} else {
						desDossier.setSubmitting(true);
					}
				}
			}

		}

		// ResetDossier
		resetDossier(sourceGroupId, referenceUid, true, serviceContext);

	}

	private void synDossierRequest(long srcDossierId, long desDossierId, ServiceContext context) {

		try {

			//_log.info("****RUN SYN DOSSIER REQUEST****" + srcDossierId);

			List<DossierRequestUD> dossierRequests = DossierRequestUDLocalServiceUtil.getDossierRequest(srcDossierId,
					1);
			//_log.info("****RUN SYN DOSSIER REQUEST**** 1" + dossierRequests.size() + " " + srcDossierId);

			for (DossierRequestUD dr : dossierRequests) {

				dr.setIsNew(0);

				DossierRequestUDLocalServiceUtil.updateDossierRequestUD(dr);

				context.setUserId(dr.getUserId());

				DossierRequestUDLocalServiceUtil.updateDossierRequest(0, desDossierId, dr.getReferenceUid(),
						dr.getRequestType(), dr.getComment(), 0, dr.getStatusReg(), context);

			}

		} catch (Exception e) {
			_log.error(e);
		}
	}

	private void getPaymentFiles(long srcGroupId, long srcDossierId, List<JSONObject> lsPaymentsFileSync) {

		try {

			InvokeREST rest = new InvokeREST();

			HashMap<String, String> properties = new HashMap<String, String>();
			properties.put("Content-Type", "application/x-www-form-urlencoded");

			String path = "dossiers/" + srcDossierId + "/payments";

			ServiceContext serviceContext = new ServiceContext();

			JSONObject resDossierFile = rest.callAPI(srcGroupId, HttpMethods.GET, "application/json",
					RESTFulConfiguration.SERVER_PATH_BASE, path, RESTFulConfiguration.SERVER_USER,
					RESTFulConfiguration.SERVER_PASS, properties, serviceContext);

			if (GetterUtil.getInteger(resDossierFile.get(RESTFulConfiguration.STATUS)) != HttpURLConnection.HTTP_OK) {
				throw new RuntimeException(
						"Failed : HTTP error code : " + resDossierFile.get(RESTFulConfiguration.STATUS));
			} else {

				JSONObject jsData = JSONFactoryUtil
						.createJSONObject(resDossierFile.getString(RESTFulConfiguration.MESSAGE));

				JSONArray array = JSONFactoryUtil.createJSONArray(jsData.getString("data"));

				for (int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);

					if (GetterUtil.getInteger(object.get("isNew")) == 1) {
						lsPaymentsFileSync.add(object);
					}

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void pullPaymentFile(long srcGroupId, long srcDossierId, long groupId, long dossierId,
			List<JSONObject> syncPaymentFiles, ServiceContext context) throws PortalException {
		for (JSONObject object : syncPaymentFiles) {
			// Add paymentFile to CLIENT

			PaymentFileActions actions = new PaymentFileActionsImpl();

			// check paymentFile is exist
			PaymentFile paymentFile = PaymentFileLocalServiceUtil.fectPaymentFile(dossierId,
					object.getString("referenceUid"));

			if (Validator.isNull(paymentFile)) {
				paymentFile = actions.createPaymentFile(context.getUserId(), groupId, dossierId,
						object.getString("referenceUid"), object.getString("paymentFee"),
						object.getLong("paymentAmount"), object.getString("paymentNote"),
						object.getString("epaymentProfile"), object.getString("bankInfo"),
						object.getInt("paymentStatus"), object.getString("paymentMethod"),
						object.getString("paymentFormData"), context);
			}
			//
			// paymentFile.setPaymentStatus(object.getInt("paymentStatus"));
			paymentFile.setPaymentMethod(object.getString("paymentMethod"));

			PaymentFileLocalServiceUtil.updatePaymentFile(paymentFile);

			// Add fileConfirmId
			if (object.getLong("confirmFileEntryId") != 0) {
				// Download confirmFile form SERVER
				try {

					String fileRef = object.getString("referenceUid");

					// Get file from SERVER
					String path = "dossiers/" + srcDossierId + "/payments/" + fileRef + "/confirmfile";

					URL url = new URL(RESTFulConfiguration.SERVER_PATH_BASE + path);

					HttpURLConnection conn = (HttpURLConnection) url.openConnection();

					String authString = RESTFulConfiguration.SERVER_USER + ":" + RESTFulConfiguration.SERVER_PASS;

					String authStringEnc = new String(Base64.getEncoder().encodeToString(authString.getBytes()));

					conn.setRequestProperty("Authorization", "Basic " + authStringEnc);

					conn.setRequestMethod(HttpMethods.GET);
					conn.setDoInput(true);
					conn.setDoOutput(true);
					conn.setRequestProperty("Accept", "application/json");
					conn.setRequestProperty("groupId", String.valueOf(srcGroupId));

					int responseCode = conn.getResponseCode();

					if (responseCode != 200) {
						if (responseCode != 204) {
							throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
						}

					} else {

						InputStream is = conn.getInputStream();

						String raw = conn.getHeaderField("Content-Disposition");
						// raw = "attachment; filename=abc.jpg"
						File tempFile = null;

						if (raw != null && raw.indexOf("=") != -1) {
							String fileName = raw.split("=")[1];

							fileName = StringUtil.replace(fileName, "\"", StringPool.BLANK);

							tempFile = File.createTempFile(String.valueOf(System.currentTimeMillis()),
									StringPool.PERIOD + fileName);

						} else {
							tempFile = File.createTempFile(String.valueOf(System.currentTimeMillis()),
									StringPool.PERIOD + "tmp");
						}

						FileOutputStream outStream = new FileOutputStream(tempFile);

						int bytesRead = -1;
						byte[] buffer = new byte[BUFFER_SIZE];
						while ((bytesRead = is.read(buffer)) != -1) {
							outStream.write(buffer, 0, bytesRead);
						}

						outStream.close();
						is.close();

						String requestURL = RESTFulConfiguration.CLIENT_PATH_BASE + "dossiers/" + dossierId
								+ "/payments/" + fileRef + "/confirm";

						String clientAuthString = new String(Base64.getEncoder().encodeToString(
								(RESTFulConfiguration.CLIENT_USER + StringPool.COLON + RESTFulConfiguration.CLIENT_PASS)
										.getBytes()));

						pullPaymentFile(requestURL, "UTF-8", groupId, dossierId, clientAuthString, tempFile,
								StringPool.BLANK, object.getString("paymentMethod"), object.getString("confirmPayload"),
								context);

					}

					conn.disconnect();

				} catch (MalformedURLException e) {

					e.printStackTrace();
				} catch (IOException e) {

					e.printStackTrace();

				}

				// Add conformFile to CLIENT
			} else {
				try {
					String fileRef = object.getString("referenceUid");

					// Get file from SERVER
					String path = "dossiers/" + srcDossierId + "/payments/" + fileRef + "/confirm/noattachment";

					URL url = new URL(RESTFulConfiguration.SERVER_PATH_BASE + path);

					HttpURLConnection conn = (HttpURLConnection) url.openConnection();

					String authString = RESTFulConfiguration.SERVER_USER + ":" + RESTFulConfiguration.SERVER_PASS;

					String authStringEnc = new String(Base64.getEncoder().encodeToString(authString.getBytes()));

					conn.setRequestProperty("Authorization", "Basic " + authStringEnc);

					conn.setRequestMethod(HttpMethods.PUT);
					conn.setDoInput(true);
					conn.setDoOutput(true);
					conn.setRequestProperty("Accept", "application/json");
					conn.setRequestProperty("groupId", String.valueOf(srcGroupId));

					int responseCode = conn.getResponseCode();

					if (responseCode != 200) {
						if (responseCode != 204) {
							throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
						}

					} else {

						_log.info("PULL PAYMENT FILE" + dossierId + "fileReference" + fileRef);

						String requestURL = "dossiers/" + dossierId + "/payments/" + fileRef + "/confirm/noattachment";

						/*
						 * String clientAuthString = new String(Base64.getEncoder().encodeToString(
						 * (RESTFulConfiguration.CLIENT_USER + StringPool.COLON +
						 * RESTFulConfiguration.CLIENT_PASS) .getBytes()));
						 */

						InvokeREST callRest = new InvokeREST();

						HashMap<String, String> properties = new HashMap<String, String>();

						Map<String, Object> params = new HashMap<String, Object>();

						params.put("confirmNote", StringPool.BLANK);
						params.put("paymentMethod", object.getString("paymentMethod"));
						params.put("confirmPayload", object.getString("confirmPayload"));
						params.put("isSync", StringPool.FALSE);

						callRest.callPostAPI(groupId, HttpMethod.PUT, "application/json",
								RESTFulConfiguration.CLIENT_PATH_BASE, requestURL, RESTFulConfiguration.CLIENT_USER,
								RESTFulConfiguration.CLIENT_PASS, properties, params, context);

						/*
						 * pullPaymentFileNoAttach(requestURL, "UTF-8", groupId, dossierId,
						 * clientAuthString, StringPool.BLANK, object.getString("paymentMethod"),
						 * object.getString("confirmPayload"), context);
						 */

					}

					conn.disconnect();

				} catch (MalformedURLException e) {

					e.printStackTrace();
				} catch (IOException e) {

					e.printStackTrace();

				}

			}

		}
	}

	private void resetDossier(long groupId, String refId, boolean isServer, ServiceContext serviceContext) {

		// RESET submitting
		DossierActions actions = new DossierActionsImpl();
		try {
			Dossier dossier = DossierMgtUtils.getDossier(refId, groupId);

			actions.resetDossier(groupId, dossier.getDossierId(), dossier.getReferenceUid(), serviceContext);

		} catch (Exception e) {
			_log.error(e);
			_log.info("Can't reset DOSSIER has groupId=" + groupId + " and ref=" + refId
					+ (isServer ? "in SERVER" : " in CLIENT"));
		}

	}

	private void pullDossierFiles(long userId, long desGroupId, long desDossierId, List<DossierFile> dossierFileList,
			Dossier dossier, String dossierRef, long dossierActionId, ServiceContext serviceContext)
			throws PortalException {

		for (DossierFile dossierFile : dossierFileList) {
			String fileRef = dossierFile.getReferenceUid();

			if (dossierFile.getRemoved()) {
				// remove file in CLIENT
				//_log.info("referenceUid" + fileRef);
				//_log.info("dossierId" + desDossierId);
				//_log.info("srcDossierId" + dossier.getDossierId());
				DossierFile file = DossierFileLocalServiceUtil.getDossierFileByReferenceUid(desDossierId, fileRef);
				if (file != null) {
					file.setRemoved(true);
					DossierFileLocalServiceUtil.updateDossierFile(file);
				}
			} else {
				try {
					//_log.info("START update dossier File not Removed: " + false);
					// DossierFile srcDossierFile =
					// DossierFileLocalServiceUtil.getDossierFileByReferenceUid(srcDossierId,
					// fileRef);
					// srcDossierFile.setIsNew(false);
					// DossierFileLocalServiceUtil.updateDossierFile(srcDossierFile);

					// Get file from SERVER
					//_log.info("dossier.getDossierId(): " + dossier.getDossierId() + " ==== fileRef: " + fileRef);
					String path = "dossiers/" + dossier.getDossierId() + "/files/" + fileRef;

					URL url = new URL(RESTFulConfiguration.SERVER_PATH_BASE + path);

					HttpURLConnection conn = (HttpURLConnection) url.openConnection();

					String authString = RESTFulConfiguration.SERVER_USER + ":" + RESTFulConfiguration.SERVER_PASS;

					String authStringEnc = new String(Base64.getEncoder().encodeToString(authString.getBytes()));

					conn.setRequestProperty("Authorization", "Basic " + authStringEnc);

					conn.setRequestMethod(HttpMethods.GET);
					conn.setDoInput(true);
					conn.setDoOutput(true);
					conn.setRequestProperty("Accept", "application/json");
					conn.setRequestProperty("groupId", String.valueOf(dossier.getGroupId()));

					int responseCode = conn.getResponseCode();
					_log.info("responseCode: " + responseCode);

					if (responseCode != 200) {

						if (responseCode != 204) {
							throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
						} else {
							// Sync FormData
							//_log.info("Sync FormData START ERROR:****** ");
							String dossierTemplateNo = dossierFile.getDossierTemplateNo();
							// Edit by Dungnv: dossierTemplateNo -> dossierFile.getFileTemplateNo()
							DossierPart part = DossierPartLocalServiceUtil.getByFileTemplateNo(desGroupId,
									dossierFile.getFileTemplateNo());
							if (part != null) {
								// Add by Dungnv
								long formDataFileEntryId = dossierFile.getFormDataDossierFile();
								pullFormData(desGroupId, fileRef, dossierTemplateNo, desDossierId, formDataFileEntryId,
										part, dossierActionId, serviceContext);
								// Comment by Dungnv
								// String formData = dossierFile.getFormData();
								// _log.info("formData: " + formData);
								// pullFormData(desGroupId, fileRef, dossierTemplateNo, desDossierId, formData,
								// part,
								// dossierActionId, serviceContext);
							}
						}
					} else {

						//_log.info("Sync FormData START NOTTTT ERROR:****** ");
						//_log.info("dossierId: " + desDossierId);
						//_log.info("ReferenceUid fileRef: " + fileRef);
						DLFileEntry fileEntry = DLFileEntryLocalServiceUtil
								.fetchDLFileEntry(dossierFile.getFileEntryId());
						DossierFile file = DossierFileLocalServiceUtil.getDossierFileByReferenceUid(desDossierId,
								fileRef);

						if (Validator.isNull(file)) {

							//_log.info("dossierFile NULL:****** ");
							InputStream is = conn.getInputStream();

							File tempFile = File.createTempFile(String.valueOf(System.currentTimeMillis()),
									StringPool.PERIOD + fileEntry.getExtension());

							FileOutputStream outStream = new FileOutputStream(tempFile);

							int bytesRead = -1;
							byte[] buffer = new byte[BUFFER_SIZE];
							while ((bytesRead = is.read(buffer)) != -1) {
								outStream.write(buffer, 0, bytesRead);
							}

							outStream.close();
							is.close();

							String requestURL = RESTFulConfiguration.CLIENT_PATH_BASE + "dossiers/" + desDossierId
									+ "/files";

							String clientAuthString = new String(
									Base64.getEncoder().encodeToString((RESTFulConfiguration.CLIENT_USER
											+ StringPool.COLON + RESTFulConfiguration.CLIENT_PASS).getBytes()));

							// Add by Dungnv
							String formData = StringPool.BLANK;
							if (Validator.isNotNull(dossierFile) && (dossierFile.getFormDataDossierFile() > 0)) {
								File formDataFile = FileUploadUtils.getFile(dossierFile.getFormDataDossierFile());
								if (formDataFile != null) {
									formData = FileUploadUtils.fileToString(formDataFile);
								}
							}
							
							if (Validator.isNotNull(dossierFile) && formData.isEmpty()) {
								formData = dossierFile.getFormData();
							}
							pullDossierFile(requestURL, "UTF-8", desGroupId, desDossierId, clientAuthString, tempFile,
									dossierFile.getDossierTemplateNo(), dossierFile.getDossierPartNo(),
									dossierFile.getFileTemplateNo(), dossierFile.getDisplayName(), formData, dossierRef,
									fileRef, dossierFile.getFormDataDossierFile(), serviceContext);
							// Comment by Dungnv
							// pullDossierFile(requestURL, "UTF-8", desGroupId, desDossierId,
							// clientAuthString, tempFile,
							// dossierFile.getDossierTemplateNo(), dossierFile.getDossierPartNo(),
							// dossierFile.getFileTemplateNo(), dossierFile.getDisplayName(),
							// dossierFile.getFormData(), dossierRef, fileRef, serviceContext);
						} else {
							// Sync FormData
							//_log.info("Sync FormData START ERROR:****** ");
							String dossierTemplateNo = dossierFile.getDossierTemplateNo();
							// Edit by Dungnv: dossierTemplateNo -> dossierFile.getFileTemplateNo()
							DossierPart part = DossierPartLocalServiceUtil.getByFileTemplateNo(desGroupId,
									dossierFile.getFileTemplateNo());
							if (part != null) {
								// Add by Dungnv
								long formDataFileEntryId = dossierFile.getFormDataDossierFile();
								pullFormData(desGroupId, fileRef, dossierTemplateNo, desDossierId, formDataFileEntryId,
										part, dossierActionId, serviceContext);
								// Comment by Dungnv
								// String formData = dossierFile.getFormData();
								// _log.info("formData: " + formData);
								// pullFormData(desGroupId, fileRef, dossierTemplateNo, desDossierId, formData,
								// part,
								// dossierActionId, serviceContext);
							}

							// TODO: Write file upload sync
							InputStream is = conn.getInputStream();

							File tempFile = File.createTempFile(String.valueOf(System.currentTimeMillis()),
									StringPool.PERIOD + fileEntry.getExtension());

							FileOutputStream outStream = new FileOutputStream(tempFile);

							int bytesRead = -1;
							byte[] buffer = new byte[BUFFER_SIZE];
							while ((bytesRead = is.read(buffer)) != -1) {
								outStream.write(buffer, 0, bytesRead);
							}

							outStream.close();
							is.close();
							// Update file entry
							//_log.info("START UPDATE FILE ENTRY");
							DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil
									.fetchDLFileEntry(file.getFileEntryId());

							DLAppLocalServiceUtil.updateFileEntry(userId, dlFileEntry.getFileEntryId(),
									dlFileEntry.getTitle(), dlFileEntry.getMimeType(), dlFileEntry.getTitle(),
									dlFileEntry.getDescription(), StringPool.BLANK, true, tempFile, serviceContext);
							//_log.info("END UPDATE FILE ENTRY");
						}

					}
					conn.disconnect();

				} catch (MalformedURLException e) {
					_log.error(e);
				} catch (IOException e1) {
					_log.error(e1);

				}
			}

			// Add by Dungnv - Add trackchanges and history
			serviceContext.setScopeGroupId(desGroupId);
			String partNo = dossierFile.getDossierPartNo();

			VRBusinessUtils.updateVRTrackchangesAndVRHistoryProfileForDossier(dossierFile.getFormDataDossierFile(),
					partNo, dossierFile.getDossierTemplateNo(), desDossierId, dossier.getCompanyId(),
					dossierFile.getFileEntryId(), serviceContext);
		}

	}

	private void pullPaymentFile(String requestURL, String charset, long desGroupId, long dossierId,
			String authStringEnc, File file, String confirmNote, String paymentMethod, String confirmPayload,
			ServiceContext serviceContext) {

		try {
			MultipartUtility multipart = new MultipartUtility(requestURL, charset, desGroupId, authStringEnc,
					HttpMethod.PUT);
			// TODO; check logic here, if ref fileId in SERVER equal CLIENT

			multipart.addFilePart("file", file);
			multipart.addFormField("confirmNote", confirmNote);
			multipart.addFormField("paymentMethod", paymentMethod);
			multipart.addFormField("confirmPayload", confirmPayload);

			multipart.finish();
			// JSONObject object = JSONFactoryUtil.createJSONObject();
//			List<String> response = multipart.finish();

			// resetDossier(desGroupId, dossierRef, false, serviceContext);

		} catch (Exception e) {
			_log.error(e);
		}

	}

//	private void pullPaymentFileNoAttach(String requestURL, String charset, long desGroupId, long dossierId,
//			String authStringEnc, String confirmNote, String paymentMethod, String confirmPayload,
//			ServiceContext serviceContext) {
//
//		try {
//
//			MultipartUtility multipart = new MultipartUtility(requestURL, charset, desGroupId, authStringEnc,
//					HttpMethod.PUT);
//			// TODO; check logic here, if ref fileId in SERVER equal CLIENT
//
//			multipart.addFormField("confirmNote", confirmNote);
//			multipart.addFormField("paymentMethod", paymentMethod);
//			multipart.addFormField("confirmPayload", confirmPayload);
//
//			JSONObject object = JSONFactoryUtil.createJSONObject();
//
//			List<String> response = multipart.finish();
//
//			// resetDossier(desGroupId, dossierRef, false, serviceContext);
//
//		} catch (Exception e) {
//			_log.error(e);
//		}
//
//	}

	private void pullDossierFile(String requestURL, String charset, long desGroupId, long dossierId,
			String authStringEnc, File file, String dossierTemplateNo, String dossierPartNo, String fileTemplateNo,
			String displayName, String formData, String dossierRef, String fileRef, long formDataDossierFile,
			ServiceContext serviceContext) {

		_log.info("START update FORMDATA*****");
		try {
			MultipartUtility multipart = new MultipartUtility(requestURL, charset, desGroupId, authStringEnc);
			// TODO; check logic here, if ref fileId in SERVER equal CLIENT

			multipart.addFilePart("file", file);
			multipart.addFormField("referenceUid", fileRef);
			multipart.addFormField("dossierTemplateNo", dossierTemplateNo);
			multipart.addFormField("dossierPartNo", dossierPartNo);
			multipart.addFormField("fileTemplateNo", fileTemplateNo);
			multipart.addFormField("displayName", displayName);
			multipart.addFormField("fileType", StringPool.BLANK);
			multipart.addFormField("isSync", StringPool.BLANK);
			multipart.addFormField("formData", formData);
			multipart.addFormField("formDataDossierFile", String.valueOf(formDataDossierFile));

			//_log.info("START update FORMDATA*****referenceUid: " + fileRef);
			//_log.info("START update FORMDATA*****dossierTemplateNo: " + dossierTemplateNo);
			//_log.info("START update FORMDATA*****dossierPartNo: " + dossierPartNo);
			//_log.info("START update FORMDATA*****fileTemplateNo: " + fileTemplateNo);
			//_log.info("START update FORMDATA*****displayName: " + displayName);
			//_log.info("START update FORMDATA*****formData"+formData);
			//_log.info("START update FORMDATA*****formDataDossierFile: " + formDataDossierFile);

			multipart.finish();
			resetDossier(desGroupId, dossierRef, false, serviceContext);

		} catch (Exception e) {
			_log.error(e);
		}

	}

//	private void pullPaymentFiles(long srcGroupId, long desDossierId) throws PortalException {
//		// get all paymentFile need to sync
//
//		//
//	}

//	Comment by Dungnv
//	private void pullFormData(long desGroupId, String fileRef, String dossierTemplateNo, long dossierId,
//			String formData, DossierPart part, long dossierActionId, ServiceContext serviceContext) {
//		try {
//			DossierFile dossierFile = DossierFileLocalServiceUtil.getDossierFileByReferenceUid(dossierId, fileRef);
//			if (Validator.isNull(dossierFile)) {
//				// create dossierFile
//				dossierFile = DossierFileLocalServiceUtil.addDossierFile(desGroupId, dossierId,
//						PortalUUIDUtil.generate(), dossierTemplateNo, part.getPartNo(), part.getFileTemplateNo(),
//						part.getPartName(), StringPool.BLANK, 0, null, StringPool.BLANK, StringPool.FALSE,
//						dossierActionId, serviceContext);
//			}
//
//			dossierFile.setFormData(formData);
//
//			DossierFileLocalServiceUtil.updateDossierFile(dossierFile);
//
//		} catch (Exception e) {
//			_log.error(e);
//		}
//	}

	// Add by Dungnv
	private void pullFormData(long desGroupId, String fileRef, String dossierTemplateNo, long dossierId,
			long formDataDossierFile, DossierPart part, long dossierActionId, ServiceContext serviceContext) {
		try {
			DossierFile dossierFile = DossierFileLocalServiceUtil.getDossierFileByReferenceUid(dossierId, fileRef);
			if (Validator.isNull(dossierFile)) {
				// create dossierFile
				dossierFile = DossierFileLocalServiceUtil.addDossierFile(desGroupId, dossierId, fileRef,
						dossierTemplateNo, part.getPartNo(), part.getFileTemplateNo(), part.getPartName(),
						StringPool.BLANK, 0, null, StringPool.BLANK, StringPool.FALSE, dossierActionId, serviceContext);
			}

			dossierFile.setFormDataDossierFile(formDataDossierFile);

			DossierFileLocalServiceUtil.updateDossierFile(dossierFile);

		} catch (Exception e) {
			_log.error(e);
		}
	}

//	private void updateFormData(long desGroupId, List<String> response, long dossierId, String formData,
//			ServiceContext serviceContext) throws PortalException {
//
//		StringBuilder sb = new StringBuilder();
//
//		for (String line : response) {
//			sb.append(line);
//		}
//
//		JSONObject jsDossierFile = JSONFactoryUtil.createJSONObject(sb.toString());
//
//		String fileRef = jsDossierFile.getString("referenceUid");
//
//		// Update formData
//
//		DossierFile dossierFile = DossierFileLocalServiceUtil.getDossierFileByReferenceUid(dossierId, fileRef);
//
//		if (Validator.isNotNull(dossierFile)) {
//			dossierFile.setFormData(formData);
//
//			DossierFileLocalServiceUtil.updateDossierFile(dossierFile);
//		}
//		// DossierFileLocalServiceUtil.updateFormData(desGroupId, dossierId,
//		// fileRef, formData, serviceContext);
//
//	}

	public void pullRequestDossiers(long dossierId, long desDossierId) {
		// TODO need update use API not use LocalService

		try {
			List<DossierRequestUD> lsDossierRequest = DossierRequestUDLocalServiceUtil.getDossierRequest(dossierId, 1);

			ServiceContext context = new ServiceContext();

			context.setUserId(0);
			context.setScopeGroupId(55301);

			for (DossierRequestUD dr : lsDossierRequest) {
				// update to client

				DossierRequestUDLocalServiceUtil.updateDossierRequest(0, desDossierId, dr.getReferenceUid(),
						dr.getRequestType(), dr.getComment(), 0, dr.getStatusReg(), context);
			}

		} catch (Exception e) {

		}
	}

	@Activate
	@Modified
	protected void activate() {
		schedulerEntryImpl.setTrigger(TriggerFactoryUtil.createTrigger(getEventListenerClass(), getEventListenerClass(),
				10, TimeUnit.SECOND));
		_schedulerEngineHelper.register(this, schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);
	}

	@Deactivate
	protected void deactivate() {
		_schedulerEngineHelper.unregister(this);
	}

	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	protected void setModuleServiceLifecycle(ModuleServiceLifecycle moduleServiceLifecycle) {
	}

	@Reference(unbind = "-")
	protected void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) {

		_schedulerEngineHelper = schedulerEngineHelper;
	}

	@Reference(unbind = "-")
	protected void setTriggerFactory(TriggerFactory triggerFactory) {
	}

	private SchedulerEngineHelper _schedulerEngineHelper;

	private Log _log = LogFactoryUtil.getLog(DossierPullScheduler.class);
}
