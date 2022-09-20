package org.opencps.dossiermgt.action.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.opencps.auth.api.exception.NotFoundException;
import org.opencps.datamgt.model.DictItem;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.model.ProcessStepRole;
import org.opencps.dossiermgt.model.ServiceProcess;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierSyncLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessStepLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessStepRoleLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class ProcessBackUpUtils {

	private static final Log _log = LogFactoryUtil.getLog(ProcessBackUpUtils.class);

	public boolean checkPermission_bak(String status, String subStatus, long groupId, long userId) {
		boolean isPermission = false;

		List<ProcessStep> processSteps = new ArrayList<ProcessStep>();

		processSteps = ProcessStepLocalServiceUtil.getByStatusAnsSubStatus(status, subStatus, groupId);

		List<Role> roles = new ArrayList<Role>();

		for (ProcessStep step : processSteps) {
			List<ProcessStepRole> processStepRoles = new ArrayList<ProcessStepRole>();

			processStepRoles = ProcessStepRoleLocalServiceUtil.findByP_S_ID(step.getPrimaryKey());

			for (ProcessStepRole stepRole : processStepRoles) {
				Role role = null;

				try {
					role = RoleLocalServiceUtil.getRole(stepRole.getRoleId());

					roles.add(role);
				} catch (Exception e) {
					_log.debug(e);
				}
			}
		}

		for (Role role : roles) {

			long[] elmUsers = RoleLocalServiceUtil.getUserPrimaryKeys(role.getRoleId());

			for (long elmUserId : elmUsers) {
				if (elmUserId == userId) {
					isPermission = true;

					break;
				}
			}
		}

		return isPermission;
	}

	public boolean checkSpecialStatus_bk(DictItem dictItem) {
		boolean flag = false;
		String metaData = dictItem.getMetaData();
		String specialStatus = StringPool.BLANK;
		if (Validator.isNotNull(metaData)) {
			//_log.info("metaData: " + metaData);
			try {
				JSONObject metaJson = JSONFactoryUtil.createJSONObject(metaData);
				specialStatus = metaJson.getString("specialStatus");
				//_log.info("specialStatus: " + specialStatus);

			} catch (Exception e) {
				_log.debug(e);
			}
		}

		if (Validator.isNotNull(specialStatus) && Boolean.parseBoolean(specialStatus)) {
			flag = true;
		}

		return flag;
	}

	public int getDuration_bk(ServiceProcess serviceProcess) {
		int duration = 0;

		int unit = serviceProcess.getDurationUnit();

		int count = serviceProcess.getDurationCount();

		if (unit == 0) {
			duration = count;
		}

		if (unit != 0) {
			duration = count / 8;
		}

		return duration;
	}

	public void processSyncDossierFile_bk(long dossierId, String referenceUid, ProcessAction processAction, long groupId,
			long userId, String serverNo) {

		// check return file
		List<String> returnDossierFileTemplateNos = ListUtil
				.toList(StringUtil.split(processAction.getReturnDossierFiles()));
		_log.info("__return dossierFiles" + processAction.getReturnDossierFiles());

		List<DossierFile> dossierFileList = null;
		if (returnDossierFileTemplateNos != null && returnDossierFileTemplateNos.size() > 0) {
			dossierFileList = DossierFileLocalServiceUtil.getDossierFileByDID_DPNO(dossierId, "2", false);
		} else {
			dossierFileList = DossierFileLocalServiceUtil.getByDossierIdAndIsNew(dossierId, true);
		}

		// Update and sync dossierFile
		if (returnDossierFileTemplateNos != null && returnDossierFileTemplateNos.size() > 0) {
			if (dossierFileList != null && dossierFileList.size() > 0) {
				String fileTemplateNo = StringPool.BLANK;
				for (DossierFile dossierFile : dossierFileList) {

					// Update record dossierFile
					if (dossierFile.getIsNew()) {
						updateIsNewDossierFile(dossierFile);
					}

					_log.info("__dossierPart" + processAction.getReturnDossierFiles());
					_log.info("__dossierPart" + dossierFile.getFileTemplateNo());
					fileTemplateNo = dossierFile.getFileTemplateNo();

					if (returnDossierFileTemplateNos.contains(fileTemplateNo)) {
						_log.info("START SYNC DOSSIER FILE");
						DossierSyncLocalServiceUtil.updateDossierSync(groupId, userId, dossierId, referenceUid, false,
								1, dossierFile.getDossierFileId(), dossierFile.getReferenceUid(), serverNo);
					}
				}
			}
		} else {// only update dossierFile
			if (dossierFileList != null && dossierFileList.size() > 0) {
				for (DossierFile dossierFile : dossierFileList) {
					updateIsNewDossierFile(dossierFile);
				}
			}
		}
	}

	// Update DossierFile when Sync
	private void updateIsNewDossierFile(DossierFile dossierFile) {
		_log.info("&&&StartUpdateDossierFile" + new Date());
		dossierFile.setIsNew(false);
		DossierFileLocalServiceUtil.updateDossierFile(dossierFile);
		_log.info("&&&EndUpdateDossierFile" + new Date());
	}

	protected ProcessAction getProcessAction(long groupId, long dossierId, String refId, String actionCode,
			long serviceProcessId) throws PortalException {

		_log.debug("GET PROCESS ACTION____");

		ProcessAction action = null;

		try {
			List<ProcessAction> actions = ProcessActionLocalServiceUtil.getByActionCode(groupId, actionCode,
					serviceProcessId);

			Dossier dossier = getDossier(groupId, dossierId, refId);

			String dossierStatus = dossier.getDossierStatus();

			String dossierSubStatus = dossier.getDossierSubStatus();

			for (ProcessAction act : actions) {

				String preStepCode = act.getPreStepCode();

				ProcessStep step = ProcessStepLocalServiceUtil.fetchBySC_GID(preStepCode, groupId, serviceProcessId);

				if (Validator.isNull(step)) {
					action = act;
					break;
				} else {
					if (step.getDossierStatus().contentEquals(dossierStatus)
							&& StringUtil.containsIgnoreCase(step.getDossierSubStatus(), dossierSubStatus)) {

						action = act;
						break;
					}
				}
			}

		} catch (Exception e) {
			throw new NotFoundException("NotProcessActionFound");
		}

		return action;
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
}
