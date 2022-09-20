package org.opencps.dossiermgt.listenner;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import org.opencps.dossiermgt.action.util.DossierContentGenerator;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.ProcessOption;
import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.model.ServiceConfig;
import org.opencps.dossiermgt.service.DossierActionLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessOptionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessStepLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceConfigLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

@Component(immediate = true, service = ModelListener.class)
public class DossierBriefNoteListenner extends BaseModelListener<DossierFile> {

	@Override
	public void onBeforeUpdate(DossierFile model) throws ModelListenerException {
		try {
			modelBeforeUpdate = DossierFileLocalServiceUtil.fetchDossierFile(model.getPrimaryKey());
		} catch (Exception e) {
			_log.error(e);
		}
	}

	@Override
	public void onAfterUpdate(DossierFile model) throws ModelListenerException {
		_log.info("Update DossierBriefNote=====" + model.getDossierFileId());
		
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCompanyId(model.getCompanyId());
		serviceContext.setUserId(model.getUserId());
		
		try {
			long dossierId = model.getDossierId();
			long groupId = model.getGroupId();
//			_log.info("groupId: " + groupId);
//			_log.info("dossierId: " + dossierId);
//			ProcessOption option = null;
//			Dossier dossier = null;
//			if (Validator.isNotNull(dossierId)) {
//				dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
//			}
//			_log.info("dossier.getServiceCode(): " + dossier.getServiceCode());
//			_log.info("dossier.getGovAgencyCode(): " + dossier.getGovAgencyCode());
//			_log.info("dossier.getDossierTemplateNo(): " + dossier.getDossierTemplateNo());
			//option = getProcessOption(dossier.getServiceCode(), dossier.getGovAgencyCode(),
			//		dossier.getDossierTemplateNo(), groupId);
			//long serviceProcessId = option.getServiceProcessId();
//			_log.info("serviceProcessId: " + serviceProcessId);
//			String briefNote = StringPool.BLANK;
//			if (Validator.isNotNull(serviceProcessId)) {
//				List<ProcessStep> processStepList = ProcessStepLocalServiceUtil
//						.getProcessStepbyServiceProcessId(serviceProcessId);
//				if (processStepList != null && processStepList.size() > 0) {
//					for (ProcessStep processStep : processStepList) {
//						String briefNoteStep = processStep.getBriefNote();
////						_log.info("briefNoteStep: " + briefNoteStep);
//						if (Validator.isNotNull(briefNoteStep)) {
//							briefNote = DossierContentGenerator.getBriefNote(dossier, briefNoteStep);
////							_log.info("briefNote: " + briefNote);
//							break;
//						}
//					}
//				}
//			}
			
			Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
			if (dossier != null) {
				//DossierAction dAction = DossierActionLocalServiceUtil.getByNextActionId(dossierId, 0);
				//TODO: Fix cho trong hop dossierActionId = 0 trong dossierFile (lan dau tao moi ho so)
				long dossierActionId = model.getDossierActionId() > 0 ? model.getDossierActionId() : dossier.getDossierActionId();
				DossierAction dAction = DossierActionLocalServiceUtil.fetchDossierAction(dossierActionId);
				String briefNote = StringPool.BLANK;
				if (dAction != null) {
					ProcessStep processStep = ProcessStepLocalServiceUtil.fetchBySC_GID(dAction.getStepCode(), groupId,
							dAction.getServiceProcessId());
					//
					String briefNoteStep = processStep != null ? processStep.getBriefNote() :  StringPool.BLANK;
					if (Validator.isNotNull(briefNoteStep)) {
						briefNote = DossierContentGenerator.getBriefNote(dossier, briefNoteStep);
						
						_log.info("Update DossierBriefNote=====" + model.getDossierFileId() + "=" + briefNote);
					}
				}
				//
				if (Validator.isNotNull(briefNote)) {
					DossierLocalServiceUtil.updateDossierBriefNote(dossierId, briefNote);
				}
			}
	
		} catch (PortalException e) {
			_log.error(e);
		}
	}

	public static DossierFile modelBeforeUpdate;

	private Log _log = LogFactoryUtil.getLog(DossierBriefNoteListenner.class.getName());
	
	protected ProcessOption getProcessOption(String serviceInfoCode, String govAgencyCode, String dossierTemplateNo,
			long groupId) throws PortalException {

		ServiceConfig config = ServiceConfigLocalServiceUtil.getBySICodeAndGAC(groupId, serviceInfoCode, govAgencyCode);

		return ProcessOptionLocalServiceUtil.getByDTPLNoAndServiceCF(groupId, dossierTemplateNo,
				config.getServiceConfigId());
	}
}
