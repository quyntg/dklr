package org.opencps.dossiermgt.vr.utils;

import com.fds.vr.business.action.VRHistoryProfileAction;
import com.fds.vr.business.action.VRTrackchangesAction;
import com.fds.vr.business.action.impl.VRHistoryProfileActionImpl;
import com.fds.vr.business.action.impl.VRTrackchangesActionImpl;
import com.fds.vr.business.model.VRExpireCertificate;
import com.fds.vr.business.model.VRHistoryProfile;
import com.fds.vr.business.model.VRTrackchanges;
import com.fds.vr.business.service.VRExpireCertificateLocalServiceUtil;
import com.fds.vr.business.service.VRHistoryProfileLocalServiceUtil;
import com.fds.vr.business.service.VRTrackchangesLocalServiceUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import org.opencps.dossiermgt.constants.DossierTerm;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.impl.DossierModelImpl;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;

public class VRBusinessUtils {

	public static void processVRBussiness(long groupId, Dossier dossier, DossierAction dossierAction, int mtCore,
			String payload) throws PortalException {

		_log.info("====processVRBussiness====" + dossierAction.getServiceProcessId() + "="
				+ dossierAction.getActionCode());

		// Comment by Dungnv: 05/10/2020
		// HuyMQ: Process save techspec by vr_action_config
//		ServiceProcess sp = ServiceProcessLocalServiceUtil.getServiceProcess(dossierAction.getServiceProcessId());
//		VRActionconfig actionConfig = VRActionconfigLocalServiceUtil.fetchByA_P(dossierAction.getActionCode(),
//				sp.getProcessNo());
//
//		if (actionConfig != null) {
//			String vehicleClass = actionConfig.getVehicleClass();

//			DossierFile dossierFileBB = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_First(
//					dossier.getDossierId(), actionConfig.getFileTemplateNoBB(), false, null);
//
//			DossierFile dossierFileCC = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_First(
//					dossier.getDossierId(), actionConfig.getFileTemplateNoCC(), false, null);
//
//			// Add by Dungnv
//			String formDataBB = StringPool.BLANK;
//			if (dossierFileBB != null) {
//				File formDataFile = FileUploadUtils.getFile(dossierFileBB.getFormDataDossierFile());
//				if (formDataFile != null) {
//					formDataBB = FileUploadUtils.fileToString(formDataFile);
//				}
//				if (formDataBB.isEmpty()) {
//					formDataBB = dossierFileBB.getFormData();
//				}
//			}
//			String formDataCC = StringPool.BLANK;
//			if (dossierFileCC != null) {
//				File formDataFile = FileUploadUtils.getFile(dossierFileCC.getFormDataDossierFile());
//				if (formDataFile != null) {
//					formDataCC = FileUploadUtils.fileToString(formDataFile);
//				}
//				if (formDataCC.isEmpty()) {
//					formDataCC = dossierFileCC.getFormData();
//				}
//			}
//			VRVehicleUpdateUtils.updateVrBusiness(formDataBB, formDataCC, actionConfig.getDeliverableCode(), mtCore);			
//			VRVehicleUpdateUtils.updateVrBusiness(dossierFileBB.getFormData(), dossierFileCC.getFormData(),
//					actionConfig.getDeliverableCode(), mtCore);
		// =================05/10/2020

//			
//			LinkedHashMap<String, String> mapValues = ConvertJONObjectUtils.getKeyValuesMap(dossierFile.getFormData());
//			
//			for (Map.Entry<String, String> entry : mapValues.entrySet()) {
//			    _log.info(entry.getKey() + "/" + entry.getValue());
//			}
//			
////			if(vehicleClass.equalsIgnoreCase("xcg")) {
////				String formData = dossierFile.getFormData();
////				
////				boolean save = false;
////				
////				try {
////					if(formData != null && formData.length() > 0) {
////						JSONObject json = JSONFactoryUtil.createJSONObject(formData);
////						
////						Iterator<String> keys = json.keys();
////						
////						while (keys.hasNext()) {
////							String key = keys.next();
////							if (key.indexOf("bb_") > -1) {
////								_log.info("====keys===" + key);
////								String tmp = StringUtil.replace(key, "bb_", "");
////								_log.info("====tmp===" + tmp + "=" + json.get(key));
////
////							}
////						}
////					}
////				} catch(Exception e) {
////					_log.error(e);
////				}
////			}
//
//			if (vehicleClass.equalsIgnoreCase("xcg")) {
//				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XCG(dossierFile.getFormData(), 0l,
//						dossier.getDossierId(), "", dossier.getDossierNo(), new Date(),
//						dossierFile.getDeliverableCode());
//			} else if (vehicleClass.equalsIgnoreCase("xmy")) {
//				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XMY(dossierFile.getFormData(), 0l,
//						dossier.getDossierId(), "", dossier.getDossierNo(), new Date(),
//						dossierFile.getDeliverableCode());
//			} else if (vehicleClass.equalsIgnoreCase("xdd")) {
//				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XDD(dossierFile.getFormData(), 0l,
//						dossier.getDossierId(), "", dossier.getDossierNo(), new Date(),
//						dossierFile.getDeliverableCode());
//			} else if (vehicleClass.equalsIgnoreCase("xcn")) {
//				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XCN(dossierFile.getFormData(), 0l,
//						dossier.getDossierId(), "", dossier.getDossierNo(), new Date(),
//						dossierFile.getDeliverableCode());
//			} else if (vehicleClass.equalsIgnoreCase("xch")) {
//				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XCH(dossierFile.getFormData(), 0l,
//						dossier.getDossierId(), "", dossier.getDossierNo(), new Date(),
//						dossierFile.getDeliverableCode());
//			}
//		}

		// Process update DossierStatistic
		VRRPDossierStatisticUtils.updateRPdossierstatistics(dossierAction, payload.toString());

		// Comment by Dungnv: Logic khong can thiet, co the can check lai - 05/10/2020
		// SONVH bosung 10/05/2019: Cap nhat thong tin ho so CHO CAP PHAT PXX
//		String vrStepCode = dossierAction.getStepCode();
//		if (groupId == ConstantsUtils.GROUP_CXL && Validator.isNotNull(vrStepCode)
//				&& vrStepCode.equalsIgnoreCase("136")) {
//			ProcessStep proStep = ProcessStepLocalServiceUtil.fetchBySC_GID(vrStepCode, groupId,
//					dossierAction.getServiceProcessId());
//			if (proStep != null && proStep.getDossierSubStatus().equalsIgnoreCase("PROCESSING_72")) {
//				VRIssueContentUtils.updateVRIssueCertificate(dossier, dossierAction, mtCore);
//			}
//		}
		// =======================05/10/2020
	}

	public static void updateVRTrackchangesAndVRHistoryProfileForDossier(long formDataFileEntryId, String partNo,
			String dossierTemplateNo, long dossierId, long companyId, long pdfFileEntryId,
			ServiceContext serviceContext) {
		try {
			if ("KQ1, KQ2, KQ4, TP1, KQ5, KQ6, KQ7".contains(partNo)) {

				Date now = new Date();

				VRTrackchangesAction trackchangesAction = new VRTrackchangesActionImpl();
				VRHistoryProfileAction profileAction = new VRHistoryProfileActionImpl();

				Document dossierDoc = DossierLocalServiceUtil.getDossierById(dossierId, companyId);
				String dossierIdCTN = dossierDoc.get(DossierTerm.DOSSIER_ID + "CTN");
				String applicantIdNo = dossierDoc.get(DossierTerm.APPLICANT_ID_NO);
				String dossierNo = dossierDoc.get(DossierTerm.DOSSIER_NO);

				_log.info("--- Dungnv: VRTrackchanges - VRHistoryProfile --------> dossierIdCTN: " + dossierIdCTN
						+ " - dossierId: " + dossierId + " - companyId: " + companyId);

				List<VRHistoryProfile> vrHistoryProfiles = VRHistoryProfileLocalServiceUtil
						.findByDossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				boolean hasUpdate = true;
				for (int i = vrHistoryProfiles.size() - 1; i >= 0; i--) {
					// Neu ton tai roi thi khong them nua
					if (vrHistoryProfiles.get(i).getContentjsonFileEntryId() != 0 && formDataFileEntryId != 0
							&& vrHistoryProfiles.get(i).getDossierId() != 0
							&& vrHistoryProfiles.get(i).getContentjsonFileEntryId() == formDataFileEntryId
							&& vrHistoryProfiles.get(i).getDossierId() == dossierId
							&& vrHistoryProfiles.get(i).getContentFileTemplate().equals(partNo)) {
						hasUpdate = false;
						break;
					}
				}
				if (hasUpdate) {
					// Ky so va dong dau chi luu cung 1 ban ghi lich su
					if ((partNo.equals("KQ6") && !dossierTemplateNo.equals("TT302011BGTVTKTSPMXCG")
							&& !dossierTemplateNo.equals("TT302011BGTVTKTSPMXBBCN"))
							|| ("KQ2, KQ7, KQ14".contains(partNo))) {
						VRHistoryProfileLocalServiceUtil.deleteByDossierIdCTN_contentFileTemplate(dossierIdCTN, partNo);
					}
					profileAction.updateVRHistoryProfile(0L, applicantIdNo, null, dossierId, dossierIdCTN, dossierNo,
							dossierTemplateNo, partNo, formDataFileEntryId, pdfFileEntryId, now, serviceContext);
				}

				VRTrackchanges vrTrackchanges = VRTrackchangesLocalServiceUtil
						.findByDossierIdCTN_ContentFileTemplate(dossierIdCTN, partNo);
				if (Validator.isNull(vrTrackchanges)) {
					vrTrackchanges = VRTrackchangesLocalServiceUtil.findByDossierId_ContentFileTemplate(dossierId,
							partNo);
				}
				if (vrTrackchanges != null) {
					long nextContentFileEntryId = vrTrackchanges.getNextContentFileEntryId();
					long previousContentFileEntryId = vrTrackchanges.getPreviousContentFileEntryId();
					// formDataFileEntryId lan truoc khong duoc giong lan sau
					if (nextContentFileEntryId != 0 && formDataFileEntryId != 0
							&& nextContentFileEntryId != formDataFileEntryId
							&& previousContentFileEntryId != formDataFileEntryId) {
						trackchangesAction.updateVRTrackchanges(vrTrackchanges.getPrimaryKey(), applicantIdNo, null,
								dossierId, dossierIdCTN, dossierNo, dossierTemplateNo, partNo, formDataFileEntryId, now,
								serviceContext);
					}
				} else {
					trackchangesAction.updateVRTrackchanges(0L, applicantIdNo, null, dossierId, dossierIdCTN, dossierNo,
							dossierTemplateNo, partNo, formDataFileEntryId, now, serviceContext);
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
	}

	public static JSONObject findByDossierStatus(String dossierStatus, int start, int end) throws PortalException {
		List<VRExpireCertificate> vrExpireCertificates = VRExpireCertificateLocalServiceUtil
				.findByDossierStatus(dossierStatus, start, end);
		JSONArray array = JSONFactoryUtil.createJSONArray();
		for (VRExpireCertificate vrExpireCertificate : vrExpireCertificates) {
			Dossier vrDossier_CTN = DossierLocalServiceUtil.fetchDossier(vrExpireCertificate.getDossierId());
			if (Validator.isNotNull(vrDossier_CTN)) {
				Dossier vrDossier_CXL = DossierLocalServiceUtil.getByRef(55301L, vrDossier_CTN.getReferenceUid());
				if (Validator.isNotNull(vrDossier_CXL)) {
					Document dossierDoc = DossierLocalServiceUtil.getDossierById(vrDossier_CXL.getDossierId(),
							vrDossier_CXL.getCompanyId());
					JSONObject obj = BusinessUtil.object2Json_originColumnName(vrDossier_CXL, DossierModelImpl.class,
							StringPool.BLANK);
					obj.put("expireCertificateId", vrExpireCertificate.getPrimaryKey());
					if (Validator.isNotNull(dossierDoc)) {
						obj.put("certNo", dossierDoc.get("so_chung_chi"));
						obj.put("certDate", dossierDoc.get("ngay_ky_cc"));
						obj.put("dossierIdCTN", dossierDoc.get("dossierIdCTN"));
					}
					array.put(obj);
				}
			}
		}
		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("data", array);
		result.put("total", VRExpireCertificateLocalServiceUtil
				.findByDossierStatus(dossierStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS).size());

		return result;
	}

	private static final Log _log = LogFactoryUtil.getLog(VRBusinessUtils.class);

}
