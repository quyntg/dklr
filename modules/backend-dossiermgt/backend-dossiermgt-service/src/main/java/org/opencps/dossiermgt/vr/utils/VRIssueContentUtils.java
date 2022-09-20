package org.opencps.dossiermgt.vr.utils;

import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.VRIssue;
import com.fds.vr.business.model.VRIssueVehiclecertificate;
import com.fds.vr.business.service.VRApplicantProfileLocalServiceUtil;
import com.fds.vr.business.service.VRIssueLocalServiceUtil;
import com.fds.vr.business.service.VRIssueVehiclecertificateLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleRecordLocalServiceUtil;
import com.fds.vr.service.util.FileUploadUtils;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.comparator.DossierFileComparator;


public class VRIssueContentUtils {

	private static final Log _log = LogFactoryUtil.getLog(VRIssueContentUtils.class);
	
	public static String updateVRIssueCertificate(Dossier objDossier, DossierAction dossierActionModel, int mtCore)
			throws PortalException {
		// SONVH bosung 10/05/2019: Cap nhat thong tin ho so CHO CAP PHAT PXX
		// 1. vr_issue; 
		// 2. vr_issue_vehiclecertificate
		// 3. vr_vehiclerecord
		// 4. vr_issue_equipmentcertificate
		try {
			String fileTemplateNo = StringPool.BLANK;
			String issueVehicleClass = StringPool.BLANK;
			String formData = StringPool.BLANK;
			long dossierId = objDossier.getDossierId();
			String dossierTemplateNo = objDossier.getDossierTemplateNo();
			//Dossier objDossier = DossierLocalServiceUtil.fetchDossier(dossierId);
			//ProcessAction processAction = ProcessActionLocalServiceUtil.fetchBySPID_AC(serviceProcessId, actionCode);
			//String postStepCode = dossierActionModel.getStepCode();
			//List <ProcessStep> lstProcessStep = ProcessStepLocalServiceUtil.getBySC_SPID(postStepCode, dossierId);
			//if (Validator.isNotNull(lstProcessStep) && lstProcessStep.size() > 0 ) {
			//if (groupId == 55301 && postStepCode.equalsIgnoreCase("136") && lstProcessStep.get(0).getDossierSubStatus().equalsIgnoreCase("PROCESSING_72")) {
//			if (dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTCPPXBBCH")) {
//				fileTemplateNo = "TT302011BGTVTCPPXBBCHBTTX";
//				issueVehicleClass = "PXX_XCH";
//			} else if (dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTCPPXBBCN")) {
//				fileTemplateNo = "TT302011BGTVTCPPXBBCNBTTX";
//				issueVehicleClass = "PXX_XCN";
//			} else if (dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTCPPXDD")) {
//				fileTemplateNo = "TT302011BGTVTCPPGNTUAC";
//				issueVehicleClass = "PXX_XDD";
//			} else if (dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTCPPXMTGM")) {
//				fileTemplateNo = "TT302011BGTVTCPPXMTGMBTTX";
//				issueVehicleClass = "PXX_XMY";
//			} else if (dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTCPPXCG")) {
//				fileTemplateNo = "TT302011BGTVTCPPXCGBTTX";
//				issueVehicleClass = "PXX_XCG";
//			} else if (dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTCPPXCD")) {
//				fileTemplateNo = "TT302011BGTVTCPPXCDBTTX";
//				issueVehicleClass = "PXX_XCD";
//			} else {
//				return "";
//			}
			if (Validator.isNotNull(dossierTemplateNo)) {
				String templateNoUpcase = dossierTemplateNo.toUpperCase();
				switch (templateNoUpcase) {
				case "TT302011BGTVTCPPXBBCH":
					fileTemplateNo = "TT302011BGTVTCPPXBBCHBTTX";
					issueVehicleClass = "PXX_XCH";
					break;
				case "TT302011BGTVTCPPXBBCN":
					fileTemplateNo = "TT302011BGTVTCPPXBBCNBTTX";
					issueVehicleClass = "PXX_XCN";
					break;
				case "TT302011BGTVTCPPXDD":
					fileTemplateNo = "TT302011BGTVTCPPGNTUAC";
					issueVehicleClass = "PXX_XDD";
					break;
				case "TT302011BGTVTCPPXMTGM":
					fileTemplateNo = "TT302011BGTVTCPPXMTGMBTTX";
					issueVehicleClass = "PXX_XMY";
					break;
				case "TT302011BGTVTCPPXCG":
					fileTemplateNo = "TT302011BGTVTCPPXCGBTTX";
					issueVehicleClass = "PXX_XCG";
					break;
				case "TT302011BGTVTCPPXCD":
					fileTemplateNo = "TT302011BGTVTCPPXCDBTTX";
					issueVehicleClass = "PXX_XCD";
					break;
				default:
					return "";
				}
			} else {
				return "";
			}

			DossierFile dossierFile = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_DPT_First(dossierId, fileTemplateNo, 1,
					false, new DossierFileComparator(false, "createDate", Date.class));
			if (Validator.isNotNull(dossierFile) && (dossierFile.getFormDataDossierFile() > 0)) {
				//Add by Dungnv
				File formDataFile = FileUploadUtils.getFile(dossierFile.getFormDataDossierFile());
				if (formDataFile != null) {
					formData = FileUploadUtils.fileToString(formDataFile);
				}
			}
			if (Validator.isNotNull(dossierFile) && formData.isEmpty()) {
				formData = dossierFile.getFormData();				
			}
			if (Validator.isNull(formData)) {
				return "";
			}
			JSONObject jsonData = JSONFactoryUtil.createJSONObject(formData);
			//Process mapIssue
			Map<String, String> mapIssue = new HashMap<>();
			//
			mapIssue.put("stampIssueNo", objDossier.getDossierNo());
			mapIssue.put("appliedDate", String.valueOf(objDossier.getReceiveDate()));
			mapIssue.put("vehicleclass", issueVehicleClass);
			//Get applicant profile
			VRApplicantProfile appProfile = VRApplicantProfileLocalServiceUtil.findByApplicantCode(objDossier.getApplicantIdNo());
			if (appProfile != null) {
				mapIssue.put("applicantprofileId", String.valueOf(appProfile.getId()));
				mapIssue.put("applicantName", appProfile.getApplicantName());
				mapIssue.put("applicantAddress", appProfile.getApplicantAddress());
				mapIssue.put("applicantPhone", appProfile.getApplicantPhone());
				
				mapIssue.put("applicantEmail", appProfile.getApplicantEmail());
				mapIssue.put("applicantFax", appProfile.getApplicantFax());
				mapIssue.put("applicantRepresentative", appProfile.getApplicantRepresentative());
				mapIssue.put("applicantRepresentativeTitle", appProfile.getApplicantRepresentativeTitle());
				mapIssue.put("applicantContactName", appProfile.getApplicantContactName());
				mapIssue.put("applicantContactEmail", appProfile.getApplicantContactEmail());
				mapIssue.put("applicantContactPhone", appProfile.getApplicantContactPhone());
			}
			//
			mapIssue.put("productionPlantId", String.valueOf(jsonData.getLong("ten_nha_xuong_hidden")));
			mapIssue.put("productionPlantCode", jsonData.getString("ten_nha_xuong"));
			mapIssue.put("productionPlantName", jsonData.getString("ten_nha_xuong_text"));
			mapIssue.put("productionPlantAddress", jsonData.getString("dia_chi_nha_xuong"));
			//
			int method = jsonData.getInt("phuong_thuc_cap", 0);
			boolean flagProcess = jsonData.getBoolean("quyet_toan ", false);
			int methodOfIssue = 0;
			switch (method) {
			case 1:
				methodOfIssue = flagProcess ? 40 : 10;
				break;
			case 2:
				methodOfIssue = 20;
				break;
			case 3:
				methodOfIssue = 30;
				break;
			default:
				break;
			}

			mapIssue.put("methodOfIssue", String.valueOf(methodOfIssue));
			//TODO: TotalInDocument  = Tổng số Lượng xe xin cấp — Tính toán trong mảng bang_khai
			mapIssue.put("issueCorporationId", "10002");
			mapIssue.put("digitalissuestatus", "1");
			mapIssue.put("digitalissuestatus", "1");

			int issueType = jsonData.getInt("hinh_thuc_cap", 0);
			mapIssue.put("issueType", String.valueOf(issueType));
			//
			VRIssue vrIssue = VRIssueLocalServiceUtil.findByMT_DID(mtCore, dossierId);
			if (Validator.isNotNull(vrIssue)) {
				// Delete all VRVehicleRecord, VRIssueVehiclecertificate, VRIssueEquipmentCertificate
				// Delete VRVehicleRecord
				VRVehicleRecordLocalServiceUtil.deleteBydossierId(mtCore, vrIssue.getId());
				// Delete VRIssueVehiclecertificate
				VRVehicleRecordLocalServiceUtil.deleteBydossierId(mtCore, vrIssue.getId());
				//
				vrIssue = VRIssueLocalServiceUtil.updateVRIssue(mapIssue, mtCore, true);
			} else {
				vrIssue = VRIssueLocalServiceUtil.updateVRIssue(mapIssue, mtCore, false);
			}
			//
			if (vrIssue != null && methodOfIssue != 10) {
				processVRIssueCert(jsonData, vrIssue.getId(), dossierId, appProfile, mtCore);
			}

			return "";	
		} catch (SystemException e) {
			_log.error(e);
			return "";
		}
	}

	//Process update table VRIssueVehiclecertificate
	private static void processVRIssueCert(JSONObject jsonData, long issueId, long dossierId, VRApplicantProfile appProfile,
			int mtCore) throws JSONException {
		String strDataArr = jsonData.getString("bang_khai");
		Map<String, String> mapValue = null;
		if (Validator.isNotNull(strDataArr)) {
			JSONArray dataArr = JSONFactoryUtil.createJSONArray(strDataArr);
			if (dataArr != null && dataArr.length() > 0) {
				for (int i = 0; i < dataArr.length(); i++) {
					JSONObject jsonDataCert = dataArr.getJSONObject(i);
					//
					if (jsonDataCert.has("so_gcn") && Validator.isNotNull(jsonDataCert.get("so_gcn"))) {
						mapValue = new HashMap<>();
						mapValue.put("issueId", String.valueOf(issueId));
						mapValue.put("dossierId", String.valueOf(dossierId));
						mapValue.put("certificateId", "0");
						mapValue.put("vehiclePrice", jsonDataCert.getString("gia_ban"));
						mapValue.put("totalQuantity", jsonDataCert.getString("so_luong"));
						mapValue.put("unitPrice", jsonDataCert.getString("gia_ban"));
						mapValue.put("certificateRecordNo", jsonDataCert.getString("so_gcn"));
						mapValue.put("productionExamReportNo", "");
						mapValue.put("totalProduct", "0");
						//
						VRIssueVehiclecertificate issueCert = VRIssueVehiclecertificateLocalServiceUtil
								.updateVRIssueVehicleCertificate(mapValue, mtCore);
						if (issueCert != null) {
							processVRVehicleRecord(jsonDataCert, appProfile, issueCert.getId(), dossierId, mtCore);
						}
					}
				}
			}
		}
	}

	//Process update table VRVehicleRecord
	private static void processVRVehicleRecord(JSONObject jsonData, VRApplicantProfile appProfile, long issueCertId,
			long dossierId, int mtCore) throws JSONException {
		JSONArray jsonDetailArr = JSONFactoryUtil.createJSONArray(jsonData.getString("chi_tiet_2"));
		Map<String, String> mapValue = null;
		if (jsonDetailArr != null && jsonDetailArr.length() > 0) {
			for (int j = 0; j < jsonDetailArr.length(); j++) {
				JSONObject jsonDetail = jsonDetailArr.getJSONObject(j);
				mapValue = new HashMap<>();
				mapValue.put("issueVehicleCertificateId", String.valueOf(issueCertId));
				mapValue.put("dossierId", String.valueOf(dossierId));
				mapValue.put("applicantProfileId", String.valueOf(appProfile.getId()));
				mapValue.put("applicantName", appProfile.getApplicantName());
				mapValue.put("applicantAddress", appProfile.getApplicantAddress());
				mapValue.put("certificateId", "0");
				mapValue.put("certificateRecordNo", jsonData.getString("so_gcn"));
				mapValue.put("frameNo", jsonDetail.getString("so_khung"));
				mapValue.put("boxNo", jsonDetail.getString("so_khung"));
				mapValue.put("engineNo", jsonDetail.getString("so_may"));
				mapValue.put("color", jsonDetail.getString("mau_son"));
				mapValue.put("vehicleRecordStatus", "0");
				mapValue.put("printingStatus", "0");
				mapValue.put("postPrintingStatus", "0");
				//
				VRVehicleRecordLocalServiceUtil.updateVRVehicleRecord(mapValue, mtCore);
			}
		}
	}

}
