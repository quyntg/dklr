//package org.opencps.dossiermgt.scheduler;
//
//import com.fds.vr.service.util.FileUploadUtils;
//import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
//import com.liferay.portal.kernel.dao.orm.QueryUtil;
//import com.liferay.portal.kernel.exception.PortalException;
//import com.liferay.portal.kernel.json.JSONArray;
//import com.liferay.portal.kernel.json.JSONFactoryUtil;
//import com.liferay.portal.kernel.json.JSONObject;
//import com.liferay.portal.kernel.log.Log;
//import com.liferay.portal.kernel.log.LogFactoryUtil;
//import com.liferay.portal.kernel.messaging.BaseSchedulerEntryMessageListener;
//import com.liferay.portal.kernel.messaging.DestinationNames;
//import com.liferay.portal.kernel.messaging.Message;
//import com.liferay.portal.kernel.model.Company;
//import com.liferay.portal.kernel.model.User;
//import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
//import com.liferay.portal.kernel.repository.model.FileEntry;
//import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
//import com.liferay.portal.kernel.scheduler.TimeUnit;
//import com.liferay.portal.kernel.scheduler.TriggerFactory;
//import com.liferay.portal.kernel.scheduler.TriggerFactoryUtil;
//import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
//import com.liferay.portal.kernel.service.ServiceContext;
//import com.liferay.portal.kernel.service.UserLocalServiceUtil;
//import com.liferay.portal.kernel.servlet.HttpMethods;
//import com.liferay.portal.kernel.util.PropsKeys;
//import com.liferay.portal.kernel.util.PropsUtil;
//import com.liferay.portal.kernel.util.StringPool;
//import com.liferay.portal.kernel.util.Validator;
//
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.UUID;
//
//import org.opencps.auth.api.exception.NotFoundException;
//import org.opencps.auth.utils.APIDateTimeUtils;
//import org.opencps.communication.model.ServerConfig;
//import org.opencps.communication.service.ServerConfigLocalServiceUtil;
//import org.opencps.datamgt.model.DictCollection;
//import org.opencps.datamgt.model.DictItem;
//import org.opencps.datamgt.service.DictCollectionLocalServiceUtil;
//import org.opencps.datamgt.service.DictItemLocalServiceUtil;
//import org.opencps.dossiermgt.action.DossierActions;
//import org.opencps.dossiermgt.action.DossierFileActions;
//import org.opencps.dossiermgt.action.PaymentFileActions;
//import org.opencps.dossiermgt.action.impl.DossierActionsImpl;
//import org.opencps.dossiermgt.action.impl.DossierFileActionsImpl;
//import org.opencps.dossiermgt.action.impl.DossierPermission;
//import org.opencps.dossiermgt.action.impl.PaymentFileActionsImpl;
//import org.opencps.dossiermgt.action.util.ConstantsUtils;
//import org.opencps.dossiermgt.action.util.DossierMgtUtils;
//import org.opencps.dossiermgt.action.util.DossierNumberGenerator;
//import org.opencps.dossiermgt.model.Dossier;
//import org.opencps.dossiermgt.model.DossierAction;
//import org.opencps.dossiermgt.model.DossierFile;
//import org.opencps.dossiermgt.model.DossierSync;
//import org.opencps.dossiermgt.model.PaymentFile;
//import org.opencps.dossiermgt.model.ProcessAction;
//import org.opencps.dossiermgt.model.ProcessOption;
//import org.opencps.dossiermgt.model.ServiceInfo;
//import org.opencps.dossiermgt.model.ServiceProcess;
//import org.opencps.dossiermgt.service.DossierActionLocalServiceUtil;
//import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
//import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
//import org.opencps.dossiermgt.service.DossierSyncLocalServiceUtil;
//import org.opencps.dossiermgt.service.PaymentFileLocalServiceUtil;
//import org.opencps.dossiermgt.service.ServiceInfoLocalServiceUtil;
//import org.opencps.dossiermgt.service.ServiceProcessLocalServiceUtil;
//import org.osgi.service.component.annotations.Activate;
//import org.osgi.service.component.annotations.Component;
//import org.osgi.service.component.annotations.Deactivate;
//import org.osgi.service.component.annotations.Modified;
//import org.osgi.service.component.annotations.Reference;
//
//@Component(immediate = true, service = DossierSyncScheduler.class)
//public class DossierSyncScheduler extends BaseSchedulerEntryMessageListener {
//
//	private static volatile boolean isRunningSync = false;
//
//	@Override
//	protected void doReceive(Message message) throws Exception {
//
//		if (!isRunningSync) {
//			isRunningSync = true;
//		} else {
//			return;
//		}
//
//		try {
//			_log.info("OpenCPS SYNC DOSSIERS IS  : " + APIDateTimeUtils.convertDateToString(new Date()));
//
//			Company company = CompanyLocalServiceUtil.getCompanyByMx(PropsUtil.get(PropsKeys.COMPANY_DEFAULT_WEB_ID));
//			ServiceContext serviceContext = new ServiceContext();
//			serviceContext.setCompanyId(company.getCompanyId());
//
//			User systemUser = UserLocalServiceUtil.getUserByEmailAddress(company.getCompanyId(),
//					RESTFulConfiguration.SERVER_USER);
//			serviceContext.setUserId(systemUser.getUserId());
//
//			InvokeREST rest = new InvokeREST();
//			// Get all SERVER NO need to DOSSIER sync to
//			HashMap<String, String> properties = new HashMap<String, String>();
//
//			List<ServerConfig> configList = ServerConfigLocalServiceUtil.getServerConfigs(QueryUtil.ALL_POS,
//					QueryUtil.ALL_POS);
//
//			for (ServerConfig config : configList) {
//				// String dossierSyncEndpoint = "dossiersyncs/server/" + serverNo;
//
////			JSONObject resDossierSync = rest.callAPI(0l, HttpMethods.GET, "application/json",
////					RESTFulConfiguration.CLIENT_PATH_BASE, dossierSyncEndpoint, RESTFulConfiguration.CLIENT_USER,
////					RESTFulConfiguration.CLIENT_PASS, properties, serviceContext);
//				if (Validator.isNotNull(config.getServerNo())) {
//					// Add param state = 2
//					List<DossierSync> dossierSyncList = DossierSyncLocalServiceUtil.fetchByServerNo(
//							config.getServerNo(), ConstantsUtils.SYNC_PENDING, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
//					try {
//						String syncType = PropsUtil.get("sync.type");
//						if (syncType.equalsIgnoreCase("singleSync")) {
//							for (DossierSync dossierSync : dossierSyncList) {
//								long dossierSyncId = dossierSync.getDossierSyncId();
//
//								Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierSync.getDossierId());
//
//								long actionPenddingId = Validator.isNotNull(dossier) ? dossier.getDossierActionId()
//										: 0l;
//
//								DossierAction action = DossierActionLocalServiceUtil
//										.fetchDossierAction(dossierSync.getClassPK());
//
//								singleServerSync(config.getGroupId(),
//										Validator.isNotNull(action) ? action.getSyncActionCode() : StringPool.BLANK,
//										Validator.isNotNull(action) ? action.getActionUser() : StringPool.BLANK,
//										Validator.isNotNull(action) ? action.getActionNote() : StringPool.BLANK, 0l,
//										dossier.getReferenceUid(), actionPenddingId, dossierSyncId,
//										dossierSync.getDossierId(), dossierSync.getClassPK(),
//										dossierSync.getCreateDossier(), serviceContext);
//							}
//						} else {
//							for (DossierSync dossierSync : dossierSyncList) {
//								long dossierSyncId = dossierSync.getDossierSyncId();
//								// call to rest API sync
//								String doDossierSyncEnpoint = "dossiersyncs/" + dossierSyncId + "/sending";
//								rest.callAPI(config.getGroupId(), HttpMethods.GET, "application/json",
//										RESTFulConfiguration.CLIENT_PATH_BASE, doDossierSyncEnpoint,
//										RESTFulConfiguration.CLIENT_USER, RESTFulConfiguration.CLIENT_PASS, properties,
//										serviceContext);
//							}
//						}
//					} catch (Exception e) {
//					}
//				}
//			}
//		} catch (Exception e) {
//		}
//
//		isRunningSync = false;
//		_log.info("OpenCPS SYNC DOSSIERS HAS BEEN DONE : " + APIDateTimeUtils.convertDateToString(new Date()));
//
//	}
//
//	private static final String GOVERNMENT_AGENCY = "GOVERNMENT_AGENCY";
//	private static final String ADMINISTRATIVE_REGION = "ADMINISTRATIVE_REGION";
//	private static final int LENGHT_DOSSIER_PASSWORD = 15;
//	private static final String DEFAULT_PATTERN_PASSWORD = "0123456789khoa";
//
//	protected String getDictItemName(long groupId, String collectionCode, String itemCode) {
//
//		DictCollection dc = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode(collectionCode, groupId);
//
//		if (Validator.isNotNull(dc)) {
//			DictItem it = DictItemLocalServiceUtil.fetchByF_dictItemCode(itemCode, dc.getPrimaryKey(), groupId);
//
//			return it.getItemName();
//
//		} else {
//			return StringPool.BLANK;
//		}
//
//	}
//
//	protected String getServiceName(String serviceCode, long groupId) throws PortalException {
//
//		try {
//			ServiceInfo service = ServiceInfoLocalServiceUtil.getByCode(groupId, serviceCode);
//
//			return service.getServiceName();
//		} catch (Exception e) {
//			throw new NotFoundException("NotFoundExceptionWithServiceCode");
//		}
//
//	}
//
//	private Dossier addDossier(long groupId, long userId, String serviceCode, String govAgencyCode,
//			String dossierTemplateNo, String referenceUid, String applicantName, String applicantIdType,
//			String applicantIdNo, Date applicantIdDate, String address, String cityCode, String districtCode,
//			String wardCode, String contactName, String contactTelNo, String contactEmail, String applicantNote,
//			ServiceContext serviceContext) throws PortalException {
//		DossierPermission dossierPermission = new DossierPermission();
//
//		DossierActions actions = new DossierActionsImpl();
//
//		dossierPermission.hasCreateDossier(groupId, userId, serviceCode, govAgencyCode, dossierTemplateNo);
//
//		int counter = DossierNumberGenerator.counterDossier(userId, groupId);
//
//		ProcessOption option = DossierMgtUtils.getProcessOption(serviceCode, govAgencyCode, dossierTemplateNo, groupId);
//
//		// Create dossierNote
//
//		ServiceProcess process = ServiceProcessLocalServiceUtil.getServiceProcess(option.getServiceProcessId());
//
//		if (Validator.isNull(referenceUid) || referenceUid.trim().length() == 0)
//			referenceUid = DossierNumberGenerator.generateReferenceUID(groupId);
//
//		String serviceName = getServiceName(serviceCode, groupId);
//
//		String govAgencyName = getDictItemName(groupId, GOVERNMENT_AGENCY, govAgencyCode);
//
//		String cityName = getDictItemName(groupId, ADMINISTRATIVE_REGION, cityCode);
//		String districtName = getDictItemName(groupId, ADMINISTRATIVE_REGION, districtCode);
//		String wardName = getDictItemName(groupId, ADMINISTRATIVE_REGION, wardCode);
//
//		boolean online = true;
//
//		// DOSSIER that was created in CLIENT is set ONLINE = false
//		if (process.getServerNo().trim().length() != 0) {
//			online = false;
//		}
//
//		String password = StringPool.BLANK;
//
//		if (Validator.isNotNull(process.getGeneratePassword()) && process.getGeneratePassword()) {
//			password = DossierNumberGenerator.generatePassword(DEFAULT_PATTERN_PASSWORD, LENGHT_DOSSIER_PASSWORD);
//		}
//
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
//		String _applicantIdDate = sdf.format(applicantIdDate);
//
//		Dossier dossier = actions.initDossier(groupId, 0l, referenceUid, counter, serviceCode, serviceName,
//				govAgencyCode, govAgencyName, applicantName, applicantIdType, applicantIdNo, _applicantIdDate, address,
//				cityCode, cityName, districtCode, districtName, wardCode, wardName, contactName, contactTelNo,
//				contactEmail, dossierTemplateNo, password, 0, StringPool.BLANK, StringPool.BLANK, StringPool.BLANK,
//				StringPool.BLANK, online, process.getDirectNotification(), applicantNote, serviceContext);
//
//		return dossier;
//	}
//
//	//Sau nay ai maintain he thong nay nho dua ham nay vao trong dossierSyncLocalServiceImpl de cac table duoc commit cung luc
//	private void singleServerSync(long groupId, String actionCode, String actionUser, String actionNote,
//			long assignUserId, String refId, long clientDossierActionId, long dossierSyncId, long dossierId,
//			long classPK, boolean isCreateDossier, ServiceContext serviceContext) throws PortalException {
//		boolean hasResult = true;
//		DossierSync sync = DossierSyncLocalServiceUtil.getDossierSync(dossierSyncId);
//		_log.info("=========== DossierSync is starting ==========> " + sync);
//		Dossier dossier_CXL = DossierLocalServiceUtil.fetchDossier(dossierId);
//
//		int retry = sync.getRetry();
//		// Retry sync duoi 5 lan
//		if (retry <= 5) {
//			if (isCreateDossier) {
//				_log.info("===========> Creating Dossier_CTN - START");
//				// Tao dossier tai CTN
//				Dossier dossier_CTN = addDossier(groupId, serviceContext.getUserId(), dossier_CXL.getServiceCode(),
//						dossier_CXL.getGovAgencyCode(), dossier_CXL.getDossierTemplateNo(),
//						dossier_CXL.getReferenceUid(), dossier_CXL.getApplicantName(), dossier_CXL.getApplicantIdType(),
//						dossier_CXL.getApplicantIdNo(), dossier_CXL.getApplicantIdDate(), dossier_CXL.getAddress(),
//						dossier_CXL.getCityCode(), dossier_CXL.getDistrictCode(), dossier_CXL.getWardCode(),
//						dossier_CXL.getContactName(), dossier_CXL.getContactTelNo(), dossier_CXL.getContactEmail(),
//						dossier_CXL.getApplicantNote(), serviceContext);
//
//				if (dossier_CTN != null) {
//					// reset creaetDossier flag
//					DossierSyncLocalServiceUtil.shiftCreateDossierStatus(dossierSyncId);
//
//					_log.info("===========> Created Dossier_CTN - DONE");
//				}
//			}
//
//			String payload = sync.getPayload();
//			// _log.debug("Dungnv: -----------> Sync: " + payload);
//			JSONObject jPayload = JSONFactoryUtil.createJSONObject(payload);
//			// Sync paymentFile
//			if (jPayload.has(ConstantsUtils.PAYLOAD_SYNC_PAYMENTFILE)) {
//				_log.info("----> SYNC PaymentFile - START - dossierId_CXL: " + dossierId);
//				try {
//					JSONObject payloadPaymentfile = JSONFactoryUtil
//							.createJSONObject(jPayload.getString(ConstantsUtils.PAYLOAD_SYNC_PAYMENTFILE));
//
//					PaymentFile paymentFileServer = PaymentFileLocalServiceUtil.fectPaymentFile(
//							payloadPaymentfile.getLong("dossierId"), payloadPaymentfile.getString("fileReferenceUid"));
//
//					Dossier dossier_PaymentFile = DossierMgtUtils
//							.getDossier(payloadPaymentfile.getString("dossierReferenceUid"), groupId);
//
//					PaymentFileActions actions = new PaymentFileActionsImpl();
//
//					PaymentFile oldPaymentFileClient = PaymentFileLocalServiceUtil.getByG_ID(groupId,
//							dossier_PaymentFile.getDossierId());
//
//					PaymentFile paymentFileClient = null;
//
//					if (oldPaymentFileClient != null) {
//						paymentFileClient = oldPaymentFileClient;
//					} else {
//						paymentFileClient = actions.createPaymentFile(serviceContext.getUserId(), groupId,
//								dossier_PaymentFile.getDossierId(), paymentFileServer.getReferenceUid(),
//								paymentFileServer.getPaymentFee(), paymentFileServer.getPaymentAmount(),
//								paymentFileServer.getPaymentNote(), paymentFileServer.getEpaymentProfile(),
//								paymentFileServer.getBankInfo(), 0, paymentFileServer.getPaymentMethod(),
//								paymentFileServer.getPaymentFormData(), serviceContext);
//					}
//
//					paymentFileClient.setInvoiceTemplateNo(paymentFileServer.getInvoiceTemplateNo());
//					if (Validator.isNotNull(paymentFileServer.getConfirmFileEntryId())) {
//						paymentFileClient.setConfirmFileEntryId(paymentFileServer.getConfirmFileEntryId());
//					}
//					if (Validator.isNotNull(paymentFileServer.getPaymentStatus())) {
//						paymentFileClient.setPaymentStatus(paymentFileServer.getPaymentStatus());
//					}
//					if (Validator.isNotNull(paymentFileServer.getEinvoice())) {
//						paymentFileClient.setEinvoice(paymentFileServer.getEinvoice());
//					}
//					if (Validator.isNotNull(paymentFileServer.getPaymentAmount())) {
//						paymentFileClient.setPaymentAmount(paymentFileServer.getPaymentAmount());
//					}
//					if (Validator.isNotNull(paymentFileServer.getPaymentMethod())) {
//						paymentFileClient.setPaymentMethod(paymentFileServer.getPaymentMethod());
//					}
//					if (Validator.isNotNull(paymentFileServer.getGovAgencyCode())) {
//						paymentFileClient.setGovAgencyCode(paymentFileServer.getGovAgencyCode());
//					}
//					if (Validator.isNotNull(paymentFileServer.getGovAgencyName())) {
//						paymentFileClient.setGovAgencyName(paymentFileServer.getGovAgencyName());
//					}
//					if (Validator.isNotNull(paymentFileServer.getGovAgencyTaxNo())) {
//						paymentFileClient.setGovAgencyTaxNo(paymentFileServer.getGovAgencyTaxNo());
//					}
//
//					paymentFileClient = PaymentFileLocalServiceUtil.updatePaymentFile(paymentFileClient);
//
//					if (paymentFileClient != null) {
//						// Reset isNew
//						paymentFileServer.setIsNew(false);
//						PaymentFileLocalServiceUtil.updatePaymentFile(paymentFileServer);
//						// DossierFileLocalServiceUtil.updateDossierFile(dossierFile);
//
//						_log.info("--> Sync PaymentFile - DONE - dossierId_CXL: " + dossierId);
//					} else {
//						_log.info("--> Sync PaymentFile - FAILED - dossierId_CXL: " + dossierId);
//						hasResult = false;
//					}
//				} catch (Exception e) {
//					_log.error(e);
//					hasResult = false;
//				}
//			}
//			if (hasResult) {
//				// SyncDossierFile
//				if (jPayload.has(ConstantsUtils.PAYLOAD_SYNC_FILES)) {
//					_log.info("----> SYNC DossierFile - START - dossierId_CXL: " + dossierId);
//					try {
//						String payloadDossierFiles = jPayload.getString(ConstantsUtils.PAYLOAD_SYNC_FILES);
//						JSONArray arrayDossierFile = JSONFactoryUtil.createJSONArray(payloadDossierFiles);
//						for (int i = 0; i < arrayDossierFile.length(); i++) {
//							JSONObject object = arrayDossierFile.getJSONObject(i);
//
//							DossierFile dossierFileServer = DossierFileLocalServiceUtil
//									.getDossierFile(object.getLong("classPK"));
//
//							if (dossierFileServer.getRemoved()) {
//								DossierFile dossierFileClient = DossierFileLocalServiceUtil.getByRefAndGroupId(
//										ConstantsUtils.GROUP_CTN, dossierFileServer.getReferenceUid());
//								dossierFileClient.setRemoved(true);
//
//								// update dossierFile
//								DossierFileLocalServiceUtil.updateDossierFile(dossierFileClient);
//							} else {
//								String formData = StringPool.BLANK;
//								File formDataFile = FileUploadUtils.getFile(dossierFileServer.getFormDataDossierFile());
//								if (formDataFile != null) {
//									formData = FileUploadUtils.fileToString(formDataFile);
//								}
//								if (formData.isEmpty()) {
//									formData = dossierFileServer.getFormData();
//								}
//
//								FileEntry fileEntry = null;
//								if (dossierFileServer.getFileEntryId() > 0) {
//									fileEntry = DLAppLocalServiceUtil.getFileEntry(dossierFileServer.getFileEntryId());
//								}
//
//								Dossier dossier_DossierFiles = DossierLocalServiceUtil.getByRef(groupId, refId);
//
//								String referenceUid = dossierFileServer.getReferenceUid();
//								if (Validator.isNull(referenceUid) || referenceUid.equals(StringPool.BLANK)) {
//									referenceUid = UUID.randomUUID().toString();
//								}
//
//								DossierFileActions action = new DossierFileActionsImpl();
//								DossierFile dossierFileClient = null;
//								DossierFile oldDossierFileClient = null;
//
//								if (Validator.isNotNull(referenceUid)) {
//									oldDossierFileClient = DossierFileLocalServiceUtil.getDossierFileByReferenceUid(
//											dossier_DossierFiles.getDossierId(), referenceUid);
//								}
//								if (oldDossierFileClient != null) {
//									dossierFileClient = action.updateDossierFileBySingleServer(groupId,
//											dossier_DossierFiles.getDossierId(), referenceUid,
//											dossierFileServer.getDisplayName(), dossierFileServer.getFileEntryId(),
//											serviceContext);
//
//									_log.info("__End add file at:" + new Date());
//
//									if (dossierFileServer.getFormDataDossierFile() > 0) {
//										dossierFileClient
//												.setFormDataDossierFile(dossierFileServer.getFormDataDossierFile());
//									} else {
//										if (Validator.isNotNull(formData)) {
//											dossierFileClient.setFormData(formData);
//										}
//									}
//									_log.info("__Start update dossier file at:" + new Date());
//
//									dossierFileClient = DossierFileLocalServiceUtil
//											.updateDossierFile(dossierFileClient);
//
//									_log.info("__End update dossier file at:" + new Date());
//								} else {
//									_log.info("__Start add file at:" + new Date());
//
//									dossierFileClient = action.addDossierFileBySingleServer(groupId,
//											dossier_DossierFiles.getDossierId(), referenceUid,
//											dossierFileServer.getDossierTemplateNo(),
//											dossierFileServer.getDossierPartNo(), dossierFileServer.getFileTemplateNo(),
//											dossierFileServer.getDisplayName(), dossierFileServer.getDisplayName(), 0,
//											dossierFileServer.getFileEntryId(),
//											Validator.isNotNull(fileEntry) ? fileEntry.getMimeType() : StringPool.BLANK,
//											StringPool.FALSE, dossier_DossierFiles.getDossierActionId(),
//											serviceContext);
//
//									_log.info("__End add file at:" + new Date());
//
//									if (dossierFileServer.getFormDataDossierFile() > 0) {
//										dossierFileClient
//												.setFormDataDossierFile(dossierFileServer.getFormDataDossierFile());
//									} else {
//										if (Validator.isNotNull(formData)) {
//											dossierFileClient.setFormData(formData);
//										}
//									}
//									_log.info("__Start update dossier file at:" + new Date());
//
//									dossierFileClient = DossierFileLocalServiceUtil
//											.updateDossierFile(dossierFileClient);
//
//									_log.info("__End update dossier file at:" + new Date());
//								}
//
//								if (dossierFileClient != null) {
//									_log.info("--> Sync DossierFile - DONE - dossierId_CXL: " + dossierId);
//								} else {
//									hasResult = false;
//									_log.info("--> Sync DossierFile - FAILED - dossierId_CXL: " + dossierId);
//								}
//
//							}
//
//							// Reset isNew
//							dossierFileServer.setIsNew(false);
//							DossierFileLocalServiceUtil.updateDossierFile(dossierFileServer);
//						}
//					} catch (Exception e) {
//						_log.error(e);
//						hasResult = false;
//					}
//				}
//			}
//			// Sync paymentStatus
//			if (hasResult) {
//				if (jPayload.has(ConstantsUtils.PAYLOAD_SYNC_PAYMENTSTATUS)) {
//					try {
//						_log.info("----> SYNC PaymentStatus - START - dossierId_CXL: " + dossierId);
//						JSONArray arrayPaymentStatus = JSONFactoryUtil
//								.createJSONArray(jPayload.getString(ConstantsUtils.PAYLOAD_SYNC_PAYMENTSTATUS));
//
//						for (int i = 0; i < arrayPaymentStatus.length(); i++) {
//							JSONObject paymentStatus = arrayPaymentStatus.getJSONObject(0);
//
//							PaymentFile paymentFileServer = PaymentFileLocalServiceUtil.fectPaymentFile(
//									paymentStatus.getLong("dossierId"), paymentStatus.getString("fileReferenceUid"));
//
//							SimpleDateFormat format = new SimpleDateFormat("DD-MM-YYYY HH:MM:SS");
//
//							Dossier dossier_PaymentStatus = DossierLocalServiceUtil.getByRef(groupId,
//									paymentStatus.getString("dossierReferenceUid"));
//
//							PaymentFileActions action = new PaymentFileActionsImpl();
//
//							PaymentFile paymentFileClient = action.updateFileApproval(groupId,
//									dossier_PaymentStatus.getDossierId(), paymentFileServer.getReferenceUid(),
//									Validator.isNotNull(paymentFileServer.getApproveDatetime())
//											? format.format(paymentFileServer.getApproveDatetime())
//											: format.format(new Date()),
//									paymentFileServer.getAccountUserName(), paymentFileServer.getGovAgencyTaxNo(),
//									paymentFileServer.getInvoiceTemplateNo(), paymentFileServer.getInvoiceIssueNo(),
//									paymentFileServer.getInvoiceNo(), false, serviceContext);
//
//							if (paymentFileClient != null) {
//								// Reset isNew Server
//								paymentFileServer.setIsNew(false);
//								PaymentFileLocalServiceUtil.updatePaymentFile(paymentFileServer);
//
//								// Reset isNew Client
//								paymentFileClient.setIsNew(false);
//								paymentFileClient = PaymentFileLocalServiceUtil.updatePaymentFile(paymentFileClient);
//
//								_log.info("--> Sync PaymentStatus - DONE - dossierId_CXL: " + dossierId);
//							} else {
//								hasResult = false;
//								_log.info("--> Sync PaymentStatus - FAILED - dossierId_CXL: " + dossierId);
//							}
//						}
//					} catch (Exception e) {
//						_log.error(e);
//						hasResult = false;
//					}
//				}
//			}
//			// SyncAction
//			if (hasResult) {
//				try {
//					_log.info("----> SYNC DossierAction - START - dossierId_CXL: " + dossierId);
//
//					DossierActions actions = new DossierActionsImpl();
//
//					Dossier dossier_DossierActions = DossierMgtUtils.getDossier(refId, groupId);
//					if (dossier_DossierActions != null) {
//						ProcessOption option = DossierMgtUtils.getProcessOption(dossier_DossierActions.getServiceCode(),
//								dossier_DossierActions.getGovAgencyCode(),
//								dossier_DossierActions.getDossierTemplateNo(), groupId);
//						_log.info("===================> option = " + option);
//						if (option != null) {
//							ProcessAction proAction = DossierMgtUtils.getProcessAction(groupId, dossier_DossierActions,
//									actionCode, option.getServiceProcessId());
//							_log.info("===================> proAction = " + proAction);
//							if (proAction != null) {
//								_log.info("Call in SynAction **********8 ===========");
//								actions.doAction(groupId, dossier_DossierActions, option, proAction, actionCode,
//										actionUser, actionNote, assignUserId, 0l, null, null, serviceContext);
//							}
//						}
//					}
//					_log.info("--> Sync DossierAction - DONE - dossierId_CXL: " + dossierId);
//
//					if (dossier_CXL != null && Validator.isNotNull(dossier_CXL.getDossierNo())) {
//
//						Dossier dossier_DossierNo = DossierMgtUtils.getDossier(refId, groupId);
//
//						if (dossier_DossierNo != null && Validator.isNull(dossier_DossierNo.getDossierNo())) {
//							dossier_DossierNo.setDossierNo(dossier_CXL.getDossierNo());
//							dossier_DossierNo = DossierLocalServiceUtil.updateDossier(dossier_DossierNo);
//						}
//
//						if (dossier_DossierNo != null) {
//							_log.info("=========> Update dossierNo for dossierId: " + dossier_DossierNo.getDossierId()
//									+ " = " + dossier_DossierNo.getDossierNo());
//						} else {
//							hasResult = false;
//						}
//					}
//				} catch (Exception e) {
//					_log.error(e);
//					hasResult = false;
//				}
//			}
//			if (hasResult) {
//				sync.setState(ConstantsUtils.SYNC_SUCCESS);
//			} else {
//				sync.setState(ConstantsUtils.SYNC_PENDING); // Sync khong thanh cong thi tiep tuc sync
//				sync.setRetry(++retry);
//			}
//			if (hasResult) {
//				// remove pending in DossierAction
//				int countDossierSync = DossierSyncLocalServiceUtil.countByDossierId(dossierId);
//
//				if (countDossierSync == 0 && clientDossierActionId > 0) {
//					DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);
//				}
//			}
//		} else {
//			hasResult = false;
//			sync.setState(ConstantsUtils.SYNC_FAIL);
//		}
//		DossierSyncLocalServiceUtil.updateDossierSync(sync);
//	}
//
//	@Activate
//	@Modified
//	protected void activate() {
//		schedulerEntryImpl.setTrigger(TriggerFactoryUtil.createTrigger(getEventListenerClass(), getEventListenerClass(),
//				40, TimeUnit.SECOND));
//		_schedulerEngineHelper.register(this, schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);
//	}
//
//	@Deactivate
//	protected void deactivate() {
//		_schedulerEngineHelper.unregister(this);
//	}
//
//	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
//	protected void setModuleServiceLifecycle(ModuleServiceLifecycle moduleServiceLifecycle) {
//	}
//
//	@Reference(unbind = "-")
//	protected void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) {
//
//		_schedulerEngineHelper = schedulerEngineHelper;
//	}
//
//	@Reference(unbind = "-")
//	protected void setTriggerFactory(TriggerFactory triggerFactory) {
//	}
//
//	private SchedulerEngineHelper _schedulerEngineHelper;
//
//	private Log _log = LogFactoryUtil.getLog(DossierSyncScheduler.class);
//
//}
