package org.opencps.dossiermgt.listenner;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.List;

import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.DossierLog;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.scheduler.RESTFulConfiguration;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLogLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.vr.utils.VRCorporationAttendeeUtils;
import org.opencps.usermgt.action.impl.EmployeeActions;
import org.opencps.usermgt.action.impl.JobposActions;
import org.opencps.usermgt.model.Employee;
import org.opencps.usermgt.model.JobPos;
import org.osgi.service.component.annotations.Component;

import backend.utils.APIDateTimeUtils;

@Component(immediate = true, service = ModelListener.class)
public class DossierActionListenner extends BaseModelListener<DossierAction> {
	@Override
	public void onAfterCreate(DossierAction model) throws ModelListenerException {

		_log.info("START Dossier Action model: " + model);
		Indexer<DossierLog> indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(DossierLog.class);
		if (true) {

			ServiceContext serviceContext = new ServiceContext();

			EmployeeActions employeeActions = new EmployeeActions();

			JobposActions jobposActions = new JobposActions();

			try {

				long userId = model.getUserId();

				Employee employee = employeeActions.getEmployeeByMappingUserId(model.getGroupId(), userId);

				long mainJobposId = employee != null ? employee.getMainJobPostId() : 0;

				long dossierId = model.getDossierId();

				String jobPosName = StringPool.BLANK;

				if (mainJobposId > 0) {

					JobPos jobPos = jobposActions.getJobPos(mainJobposId);

					jobPosName = (jobPos != null && Validator.isNotNull(jobPos.getTitle())) ? jobPos.getTitle()
							: StringPool.BLANK;
				}

				String content = model.getActionNote();

				JSONObject payload = JSONFactoryUtil.createJSONObject();

				JSONArray files = JSONFactoryUtil.createJSONArray();

				if (dossierId > 0) {
					long now = System.currentTimeMillis();
					_log.info("START Dossier Action11111: " + (System.currentTimeMillis() - now));
					List<DossierLog> dossierLogs = DossierLogLocalServiceUtil.getByDossierAndType(dossierId,
							DossierFileListenerMessageKeys.DOSSIER_LOG_CREATE_TYPE, QueryUtil.ALL_POS,
							QueryUtil.ALL_POS);
					_log.info("START Dossier Action2222: " + (System.currentTimeMillis() - now));
					for (DossierLog log : dossierLogs) {
						long dossierFileId = 0;

						try {
							JSONObject payloadFile = JSONFactoryUtil.createJSONObject(log.getPayload());

							dossierFileId = GetterUtil.getLong(payloadFile.get("dossierFileId"));
						} catch (Exception e) {

						}
						_log.info("START Dossier Action333: " + (System.currentTimeMillis() - now));
						if (dossierFileId != 0) {
							DossierFile dossierFile = DossierFileLocalServiceUtil.fetchDossierFile(dossierFileId);

							if (Validator.isNotNull(dossierFile)) {
								JSONObject file = JSONFactoryUtil.createJSONObject();

								file.put("dossierFileId", dossierFile.getDossierFileId());
								file.put("fileName", dossierFile.getDisplayName());
								file.put("createDate", APIDateTimeUtils.convertDateToString(dossierFile.getCreateDate(),
										APIDateTimeUtils._TIMESTAMP));
								files.put(file);
							}
						}

						//DossierLogLocalServiceUtil.deleteDossierLog(log);
						indexer.delete(log);
					}
					DossierLogLocalServiceUtil.deleteByDossierAndType(dossierId,
							DossierFileListenerMessageKeys.DOSSIER_LOG_CREATE_TYPE);
					_log.info("START Dossier Action4444: " + (System.currentTimeMillis() - now));
				}

				payload.put("jobPosName", jobPosName);
				payload.put("stepName", model.getActionName());
				payload.put("stepInstruction", model.getStepInstruction());
				payload.put("files", files);

				serviceContext.setCompanyId(model.getCompanyId());
				serviceContext.setUserId(userId);

				ProcessAction processAction = ProcessActionLocalServiceUtil
						.getByNameActionNo(model.getServiceProcessId(), model.getActionCode(), model.getActionName());

				boolean ok = true;

				if (Validator.isNotNull(processAction)) {
					if ((processAction.getPreCondition().contains("cancelling")
							&& processAction.getAutoEvent().contains("timmer"))
							|| (processAction.getPreCondition().contains("correcting")
									&& processAction.getAutoEvent().contains("timmer"))
							|| (processAction.getPreCondition().contains("submitting"))
									&& processAction.getAutoEvent().contains("timmer")) {
						ok = false;

					}
				}

				if (processAction.getPreCondition().contains("reject_cancelling")
						|| processAction.getPreCondition().contains("reject_correcting")
						|| processAction.getPreCondition().contains("reject_submitting")) {
					ok = false;
				}

				_log.debug("content: "+content);
				if (ok) {
					_log.info("START Dossier Action11111");
					DossierLog dossierLog = DossierLogLocalServiceUtil.addDossierLog(model.getGroupId(), model.getDossierId(),
							model.getActionUser(), content, "PROCESS_TYPE", payload.toString(),
							serviceContext);
					//_log.debug("dossierLog: "+dossierLog);
				}
				
				// SONVH bosung 25/03/2019: Ghi vao vr_rp_dossierstatistics
				//String processNo = UpdateRPdossierstatistics(model, payload.toString());
				

				Company company = CompanyLocalServiceUtil.getCompanyByMx(PropsUtil.get(PropsKeys.COMPANY_DEFAULT_WEB_ID));
				User systemUser = UserLocalServiceUtil.getUserByEmailAddress(company.getCompanyId(),
						RESTFulConfiguration.SERVER_USER);
				if (serviceContext.getUserId() != systemUser.getUserId()) {
					// Sau khi update VRRPDossierStatistics, cap nhat thong tin phieu phan cong Dang kiem vien VRCorporationAttendee
					VRCorporationAttendeeUtils.updateVRCorporationAttendee(model);
					
					// Cap nhat thong tin ho so CAP PHAT PHIEU
					//VRIssueContentUtils.updateVRIssueCertificate(model, 1);

				}

			} catch (SystemException | PortalException e) {
				_log.error(e);
			}
		}

		if (Validator.isNotNull(model.getSyncActionCode()) && model.getSyncActionCode().length() != 0) {
			String content = "On DossiserAction Created";
			String notificationType = "";
			String payload = "";

			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setCompanyId(model.getCompanyId());
			serviceContext.setUserId(model.getUserId());

			try {
				_log.info("START Dossier Action11111");
				DossierLogLocalServiceUtil.addDossierLog(model.getGroupId(), model.getDossierId(), model.getUserName(),
						content, notificationType, payload, serviceContext);
			} catch (SystemException | PortalException e) {
				_log.error(e);
			}
		}
	}

//	private String getUserName(long userId, long groupId) {
//		String userName = StringPool.BLANK;
//
//		Employee employee = null;
//
//		Applicant applicant = null;
//
//		employee = EmployeeLocalServiceUtil.fetchByF_mappingUserId(groupId, userId);
//
//		if (Validator.isNotNull(employee)) {
//			return employee.getFullName();
//
//		}
//
//		applicant = ApplicantLocalServiceUtil.fetchByMappingID(userId);
//
//		if (Validator.isNotNull(applicant)) {
//			return applicant.getApplicantName();
//		}
//
//		return userName;
//	}

	private Log _log = LogFactoryUtil.getLog(DossierActionListenner.class.getName());

}