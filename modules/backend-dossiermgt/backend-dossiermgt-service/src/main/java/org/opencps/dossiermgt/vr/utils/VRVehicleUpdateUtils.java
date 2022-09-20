package org.opencps.dossiermgt.vr.utils;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import org.opencps.dossiermgt.model.Deliverable;
import org.opencps.usermgt.model.Applicant;
import org.opencps.usermgt.service.ApplicantLocalServiceUtil;

import com.fds.vr.business.action.util.ConvertJONObjectUtils;
import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.VRConfigTechSpec;
import com.fds.vr.business.model.VRDossierFile;
import com.fds.vr.business.model.VRVehicleSpecification;
import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.model.impl.VRVehicleSpecificationImpl;
import com.fds.vr.business.service.VRApplicantProfileLocalServiceUtil;
import com.fds.vr.business.service.VRConfigTechSpecLocalServiceUtil;
import com.fds.vr.business.service.VRDossierFileLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleSpecificationLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleTypeCertificateLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class VRVehicleUpdateUtils {
	private static final Log _log = LogFactoryUtil.getLog(VRVehicleUpdateUtils.class);
	
	public static String updateVrBusiness(Deliverable dossierDeliverableModel, int mtCore) throws PortalException {
		try {
			if (dossierDeliverableModel == null || (dossierDeliverableModel != null
					&& !dossierDeliverableModel.getDeliverableState().equalsIgnoreCase("2"))) {
				return "";
			}

			String formData = dossierDeliverableModel.getFormData();
			Date modifiedDate = dossierDeliverableModel.getModifiedDate();
			VRDossierFile dossierFile = null;
			//VRRegistration registration = null;
			VRApplicantProfile appProfile = null;
			Applicant applicant = null;
			
			String applicantIdNo = dossierDeliverableModel.getApplicantIdNo();
			String deliverableCode = dossierDeliverableModel.getDeliverableCode();
			if (Validator.isNotNull(applicantIdNo)) {
				// 1. Get ApplicantProfile, Registration and Applicant
				VRApplicantProfile vrApplicantProfile = VRApplicantProfileLocalServiceUtil.findByApplicantCode(applicantIdNo);
				if (vrApplicantProfile != null) {
					appProfile = vrApplicantProfile;
				}
				//registration = VRRegistrationLocalServiceUtil.getByApplicantIdNo(applicantIdNo);
				applicant = ApplicantLocalServiceUtil.fetchByAppId(applicantIdNo);
			}
			_log.info("DA VAO HAM UPDATE RECORD");
			if (Validator.isNotNull(deliverableCode)) {
				dossierFile = VRDossierFileLocalServiceUtil.getByDeliverableCode(deliverableCode);
			}			
			if (Validator.isNull(dossierFile) || Validator.isNull(formData)) {
				return "";
			}
			LinkedHashMap<String, String> mapValues = ConvertJONObjectUtils.getKeyValuesMap(formData);
			if (Validator.isNull(mapValues)) {
				return "";
			}
			if ((mtCore == 1) && (Validator.isNotNull(applicant)) && (Validator.isNull(appProfile)) ) {
				_log.info("VRApplicantProfile is NULL");
				return "";
				/*
				// 2. Insert vr_applicantprofile
				String markupDesigner = StringPool.BLANK; // 1: CSTK
				String markupDomesticsManufacturer = StringPool.BLANK; // 2: CSSX TN
				String markupImporter = StringPool.BLANK; // 3: CSNK
				String markupCorporation = StringPool.BLANK; // 4:CSSX NN, 5: CSBHBD, 9: KHAC
				String markupOverseasManufacturer = StringPool.BLANK;
	
				SimpleDateFormat formatDateShort = new SimpleDateFormat("dd/MM/yyyy");
				String applicantCeremonyDate = formatDateShort
						.format(applicant.getApplicantIdDate());
				
				RegistrationForm registrationFormTTC = RegistrationFormLocalServiceUtil
						.getByRegIdAndFormNo(registration.getRegistrationId(), "TTCDN");
	
				String applicantBusinessType = StringPool.BLANK;
				if (registrationFormTTC != null && registrationFormTTC.getFormData().length() > 1) {
					JSONObject formJson = JSONFactoryUtil
							.createJSONObject(registrationFormTTC.getFormData());
					applicantBusinessType = formJson.getString("loai_hinh_doanh_nghiep");
					markupCorporation = formJson.getString("doi_tuong");
					markupDesigner = markupCorporation.contains("1") ? "1" : "0";
					markupDomesticsManufacturer = markupCorporation.contains("2") ? "1" : "0";
					markupImporter = markupCorporation.contains("3") ? "1" : "0";
				}
	
				
				appProfile = new VRApplicantProfileImpl();
				appProfile.setId(CounterLocalServiceUtil.increment(VRApplicantProfile.class.getName()));
				appProfile.setMtCore(1);
				appProfile.setModifyDate(new Date());
				appProfile.setSyncDate(new Date());
	
				appProfile.setApplicantCode(applicant.getApplicantIdNo());
				appProfile.setApplicantName(applicant.getApplicantName());
				appProfile.setApplicantAddress(applicant.getAddress());
				appProfile.setApplicantPhone(applicant.getContactTelNo());
				appProfile.setApplicantEmail(applicant.getContactEmail());
				appProfile.setApplicantFax("---");
				appProfile.setApplicantBusinessType(applicantBusinessType); // Lay tu json
				appProfile.setApplicantRepresentative(applicant.getContactName());
				appProfile
						.setApplicantRepresentativeTitle(applicant.getRepresentativeEnterprise());
				appProfile.setApplicantCity(applicant.getCityCode());
				appProfile.setApplicantContactName(applicant.getContactName());
				appProfile.setApplicantContactEmail(applicant.getContactEmail());
				appProfile.setApplicantContactPhone(applicant.getContactTelNo());
				appProfile.setApplicantNationality("VN");
				appProfile.setApplicantRegion("---");
				appProfile.setMarkupDesigner(markupDesigner); // Lay tu json
				appProfile.setMarkupDomesticsManufacturer(markupDomesticsManufacturer); // Lay tu json
				appProfile.setMarkupOverseasManufacturer(markupOverseasManufacturer); // Chua co thong tin
				appProfile.setMarkupCorporation(markupCorporation); // Lay tu json
				appProfile.setMarkupImporter(markupImporter); // Lay tu json
				appProfile.setApplicantStatus("2"); // da phe duyet
				appProfile.setApplicantCeremonyDate(applicantCeremonyDate.toString());
				
				VRApplicantProfileLocalServiceUtil.addVRApplicantProfile(appProfile);
				
				// 3. Insert vr_applicantprofile_history
				VRApplicantProfileHistory appProfileHistory = new VRApplicantProfileHistoryImpl();
				long VRApplicantProfileHistoryId = CounterLocalServiceUtil
						.increment(VRApplicantProfileHistory.class.getName());
				appProfileHistory.setId(VRApplicantProfileHistoryId);
				appProfileHistory.setMtCore(1);
				
				appProfileHistory.setApplicantCode(applicant.getApplicantIdNo());
				appProfileHistory.setApplicantName(applicant.getApplicantName());
				appProfileHistory.setApplicantAddress(applicant.getAddress());
				appProfileHistory.setApplicantPhone(applicant.getContactTelNo());
				appProfileHistory.setApplicantEmail(applicant.getContactEmail());
				appProfileHistory.setApplicantFax("---");
				appProfileHistory.setApplicantBusinessType(applicantBusinessType);
				appProfileHistory.setApplicantRepresentative(applicant.getContactName());
				appProfileHistory
						.setApplicantRepresentativeTitle(applicant.getRepresentativeEnterprise());
				appProfileHistory.setApplicantCity(applicant.getCityCode());
				appProfileHistory.setApplicantContactName(applicant.getContactName());
				appProfileHistory.setApplicantContactEmail(applicant.getContactEmail());
				appProfileHistory.setApplicantContactPhone(applicant.getContactTelNo());
				appProfileHistory.setApplicantNationality("VN");
				appProfileHistory.setApplicantRegion("---");
				appProfileHistory.setMarkupDesigner(markupDesigner);
				appProfileHistory.setMarkupDomesticsManufacturer(markupDomesticsManufacturer);
				appProfileHistory.setMarkupOverseasManufacturer(markupOverseasManufacturer);
				appProfileHistory.setMarkupCorporation(markupCorporation);
				appProfileHistory.setMarkupImporter(markupImporter);
				appProfileHistory.setApplicantStatus("2");
				appProfileHistory.setApplicantCeremonyDate(applicantCeremonyDate.toString());
				appProfileHistory.setModifyDate(new Date());
				appProfileHistory.setSyncDate(new Date());
	
				VRApplicantProfileHistoryLocalServiceUtil.addVRApplicantProfileHistory(appProfileHistory);
	
			*/}
			String businessTypeCode = dossierDeliverableModel.getDeliverableType();
			_log.info("businessTypeCode: "+businessTypeCode);
			switch (businessTypeCode) {
			case "GCN_TDTK_XCG":  //Tham dinh thiet ke Xe co gioi
				// update table VRVehicleTypeCertificate
				// update table VR_VEHICLESPECIFICATION
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTTTKXCG_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
					
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XCG", "1");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}
					
				}
				break;				
			case "TT302011BGTVTTDTKXMCD": //Tham dinh thiet ke Xe may chuyen dung
				
				break;
			case "TT302011BGTVTKTSPMXCG":  //Kiem tra san pham mau Xe co gioi
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTKTSPMXCG_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XCG", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}
					
				}
				break;				
			case "TT302011BGTVTKTSPMXBBCN": //Kiem tra san pham mau Xe cho nguoi bon banh co gan dong co
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTKTSPMXBBCN_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XCN", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;
			case "TT302011BGTVTCOP": //Danh gia COP
				
				break;				
			case "TT302011BGTVTKTTBLANDAU": //Kiem tra tinh trang hoat dong thiet bi kiem tra
				
				break;				
			case "TT192012TTBGTVTDGLD": //Kiem tra, danh gia co so bao hanh bao duong
				
				break;				
			case "432014TTLTBGTVTBCTTTNLNK": //Dang ky chung nhan muc tieu thu nhien lieu doi voi xe o to nhap khau
				
				break;				
			case "432014TTLTBGTVTBCTTTNLSXLR": //Dang ky chung nhan muc tieu thu nhien lieu doi voi xe o to san xuat, lap rap
				
				break;
			case "TT302011BGTVTCNCLKLLKXCG": //Chung nhan chat luong kieu loai linh kien Xe co gioi
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTCNCLKLLKXCG_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "LKXCG", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;				
			case "TT302011BGTVTCNCLKLLKXM": //Chung nhan chat luong kieu loai linh kien Xe mo to, xe gan may
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTCNCLKLLKXM_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "LKXMY", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;		
			case "TT302011BGTVTCNCLKLTXXCG": //Chung nhan chat luong kieu loai toan xe Xe co gioi
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTCNCLKLTXXCG_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XCG", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;				
			case "TT302011BGTVTCNCLKLTXXMTGM": //Chung nhan chat luong kieu loai toan xe Xe mo to, xe gan may
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTCNCLKLTXXMTGM_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XMY", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;				
			case "TT302011BGTVTCNCLKLTXXDD": //Chung nhan chat luong kieu loai toan xe Xe dap dien
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTCNCLKLTXXDD_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XDD", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;				
			case "TT302011BGTVTCNCLKLTXXBBCN": //Chung nhan chat luong kieu loai toan xe Xe cho nguoi bon banh co gan dong co
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTCNCLKLTXXBBCN_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XCN", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;				
			case "TT302011BGTVTCNCLKLTXXBBCH": //Chung nhan chat luong kieu loai toan xe Xe cho hang bon banh co gan dong co
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTCNCLKLTXXBBCH_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XCH", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;	
			case "TT302011BGTVTCPPXCG": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe co gioi
				
				break;
			case "TT302011BGTVTCPPXMTGM": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe mo to, xe gan may
				
				break;
			case "TT302011BGTVTCPPXDD": //Cap phat va su dung tem hop quy Xe dap dien 
				
				break;
			case "TT302011BGTVTCPPXBBCN": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe cho nguoi bon banh co gan dong co
				
				break;
			
			case "TT302011BGTVTCPPXBBCH": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe cho hang bon banh co gan dong co
				
				break;
			case "TT302011BGTVTCPPXCD": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe may chuyen dung
				
				break;
			
			case "TT302011BGTVTCNCLKLXMCD": //Chung nhan chat luong kieu loai toan xe Xe may chuyen dung
				
				break;
			case "TT302011BGTVTCNCLKLLKXCD": //Chung nhan chat luong kieu loai linh kien Xe may chuyen dung
				
				break;
			
			case "TT302011BGTVTCNCLKLLKXDD": //Chung nhan chat luong kieu loai linh kien Xe dap dien
				
				break;
			case "TT302011BGTVTCNCLKLLKXCN": //Chung nhan chat luong kieu loai linh kien Xe cho nguoi bon banh co gan dong co
				
				break;
			case "TT302011BGTVTCNCLKLLKXCH": //Chung nhan chat luong kieu loai linh kien Xe cho hang bon banh co gan dong co
				
				break;
			case "TT302011BGTVTTHSPNK": //Trieu hoi san pham Xe co gioi nhap khau linh kien de san xuat lap rap xe
				
				break;
			case "TT302011BGTVTTHSPSXLR": //Trieu hoi san pham Xe co gioi san xuat, lap rap linh kien de san xuat lap rap xe
				
				break;
			
			default:
				break;
			}
			
			return "finished";	
		} catch (SystemException e) {
			_log.error(e);
			return "";
		}
	}
	
	public static String updateVrBusiness(String formDataBienBan, String formDataChungChi, String businessTypeCode,
			int mtCore) {
		try {
			JSONObject json = JSONFactoryUtil.createJSONObject();
			JSONObject jsonBB = JSONFactoryUtil.createJSONObject(formDataBienBan);
			JSONObject jsonCC = JSONFactoryUtil.createJSONObject(formDataChungChi);
			
			json.put("bien_ban", jsonBB);
			json.put("chung_chi", jsonCC);
			
			String formData = json.toString();
			Date modifiedDate = new Date();
			VRDossierFile dossierFile = null;
			//VRRegistration registration = null;
			VRApplicantProfile appProfile = null;
			Applicant applicant = null;
			
			String applicantIdNo = "";//dossierDeliverableModel.getApplicantIdNo();
			String deliverableCode = "";//dossierDeliverableModel.getDeliverableCode();
			if (Validator.isNotNull(applicantIdNo)) {
				// 1. Get ApplicantProfile, Registration and Applicant
				VRApplicantProfile vrApplicantProfile = VRApplicantProfileLocalServiceUtil.findByApplicantCode(applicantIdNo);
				if (vrApplicantProfile != null) {
					appProfile = vrApplicantProfile;
				}
				//registration = VRRegistrationLocalServiceUtil.getByApplicantIdNo(applicantIdNo);
				applicant = ApplicantLocalServiceUtil.fetchByAppId(applicantIdNo);
			}
			_log.info("DA VAO HAM UPDATE RECORD");
			
			if (Validator.isNotNull(deliverableCode)) {
				dossierFile = VRDossierFileLocalServiceUtil.getByDeliverableCode(deliverableCode);
			}	
			
			if (Validator.isNull(dossierFile) || Validator.isNull(formData)) {
				return "";
			}
			
			LinkedHashMap<String, String> mapValues = ConvertJONObjectUtils.getKeyValuesMap(formData);
			
			if (Validator.isNull(mapValues)) {
				return "";
			}
			
			if ((mtCore == 1) && (Validator.isNotNull(applicant)) && (Validator.isNull(appProfile)) ) {
				return "";
			}
			
//			String businessTypeCode = dossierDeliverableModel.getDeliverableType();
			_log.info("businessTypeCode: "+businessTypeCode);
			switch (businessTypeCode) {
			case "GCN_TDTK_XCG":  //Tham dinh thiet ke Xe co gioi
				// update table VRVehicleTypeCertificate
				// update table VR_VEHICLESPECIFICATION
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTTTKXCG_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
					
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XCG", "1");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}
					
				}
				break;				
			case "TT302011BGTVTTDTKXMCD": //Tham dinh thiet ke Xe may chuyen dung
				
				break;
			case "TT302011BGTVTKTSPMXCG":  //Kiem tra san pham mau Xe co gioi
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTKTSPMXCG_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XCG", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}
					
				}
				break;				
			case "TT302011BGTVTKTSPMXBBCN": //Kiem tra san pham mau Xe cho nguoi bon banh co gan dong co
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTKTSPMXBBCN_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XCN", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;
			case "TT302011BGTVTCOP": //Danh gia COP
				
				break;				
			case "TT302011BGTVTKTTBLANDAU": //Kiem tra tinh trang hoat dong thiet bi kiem tra
				
				break;				
			case "TT192012TTBGTVTDGLD": //Kiem tra, danh gia co so bao hanh bao duong
				
				break;				
			case "432014TTLTBGTVTBCTTTNLNK": //Dang ky chung nhan muc tieu thu nhien lieu doi voi xe o to nhap khau
				
				break;				
			case "432014TTLTBGTVTBCTTTNLSXLR": //Dang ky chung nhan muc tieu thu nhien lieu doi voi xe o to san xuat, lap rap
				
				break;
			case "TT302011BGTVTCNCLKLLKXCG": //Chung nhan chat luong kieu loai linh kien Xe co gioi
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTCNCLKLLKXCG_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "LKXCG", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;				
			case "TT302011BGTVTCNCLKLLKXM": //Chung nhan chat luong kieu loai linh kien Xe mo to, xe gan may
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTCNCLKLLKXM_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "LKXMY", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;		
			case "TT302011BGTVTCNCLKLTXXCG": //Chung nhan chat luong kieu loai toan xe Xe co gioi
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTCNCLKLTXXCG_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XCG", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;				
			case "TT302011BGTVTCNCLKLTXXMTGM": //Chung nhan chat luong kieu loai toan xe Xe mo to, xe gan may
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTCNCLKLTXXMTGM_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XMY", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;				
			case "TT302011BGTVTCNCLKLTXXDD": //Chung nhan chat luong kieu loai toan xe Xe dap dien
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTCNCLKLTXXDD_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XDD", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;				
			case "TT302011BGTVTCNCLKLTXXBBCN": //Chung nhan chat luong kieu loai toan xe Xe cho nguoi bon banh co gan dong co
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTCNCLKLTXXBBCN_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XCN", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;				
			case "TT302011BGTVTCNCLKLTXXBBCH": //Chung nhan chat luong kieu loai toan xe Xe cho hang bon banh co gan dong co
				if (mtCore == 1) {
					
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTCNCLKLTXXBBCH_VehicleTypeCertificate(mapValues, applicant.getApplicantIdDate(), appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					if (vrVehicleTypeCertificateId > 0 ) {
						updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate, "XCH", "21");
						VRVehicleTypeCertificateLocalServiceUtil
						.updateVRTechnicalSpec_ALL(mapValues, vrVehicleTypeCertificateId, vrVehicleTypeCertificate.getDossierId(), "", vrVehicleTypeCertificate.getDossierNo(), 
								vrVehicleTypeCertificate.getModifyDate(), vrVehicleTypeCertificate.getVehicleClass(), vrVehicleTypeCertificate.getDeliverableCode());
					}					
				}
				break;	
			case "TT302011BGTVTCPPXCG": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe co gioi
				
				break;
			case "TT302011BGTVTCPPXMTGM": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe mo to, xe gan may
				
				break;
			case "TT302011BGTVTCPPXDD": //Cap phat va su dung tem hop quy Xe dap dien 
				
				break;
			case "TT302011BGTVTCPPXBBCN": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe cho nguoi bon banh co gan dong co
				
				break;
			
			case "TT302011BGTVTCPPXBBCH": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe cho hang bon banh co gan dong co
				
				break;
			case "TT302011BGTVTCPPXCD": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe may chuyen dung
				
				break;
			
			case "TT302011BGTVTCNCLKLXMCD": //Chung nhan chat luong kieu loai toan xe Xe may chuyen dung
				
				break;
			case "TT302011BGTVTCNCLKLLKXCD": //Chung nhan chat luong kieu loai linh kien Xe may chuyen dung
				
				break;
			
			case "TT302011BGTVTCNCLKLLKXDD": //Chung nhan chat luong kieu loai linh kien Xe dap dien
				
				break;
			case "TT302011BGTVTCNCLKLLKXCN": //Chung nhan chat luong kieu loai linh kien Xe cho nguoi bon banh co gan dong co
				
				break;
			case "TT302011BGTVTCNCLKLLKXCH": //Chung nhan chat luong kieu loai linh kien Xe cho hang bon banh co gan dong co
				
				break;
			case "TT302011BGTVTTHSPNK": //Trieu hoi san pham Xe co gioi nhap khau linh kien de san xuat lap rap xe
				
				break;
			case "TT302011BGTVTTHSPSXLR": //Trieu hoi san pham Xe co gioi san xuat, lap rap linh kien de san xuat lap rap xe
				
				break;
			
			default:
				break;
			}
			
			return "finished";	
		} catch (Exception e) {
			_log.error(e);
			return "";
		}
	}
	
	private static void updateVehicleSpecification(LinkedHashMap<String, String> mapValues, long vrVehicleTypeCertificateId, Date modifiedDate, String VehicleClass, String module) {
		
		
		String strChungChi = mapValues.get("bien_ban");
		
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);
			
			List<VRConfigTechSpec> configTechSpecs = VRConfigTechSpecLocalServiceUtil.getByVCMD(VehicleClass, module);
	
			String prefix = "bb_";
			
			String prefixResult = "kl_";
	
			for (VRConfigTechSpec configTechSpec : configTechSpecs) {
				
				
				String specificationCode = prefix + configTechSpec.getSpecificationCode();
				
				String specificationValue = objChungChi.getString(specificationCode);
				
				String specificationResult = objChungChi.getString(prefixResult + configTechSpec.getSpecificationCode());
				
				VRVehicleSpecification elm = VRVehicleSpecificationLocalServiceUtil.findByCode(vrVehicleTypeCertificateId, configTechSpec.getSpecificationCode());
	
				VRVehicleSpecification specification = new VRVehicleSpecificationImpl();
				
				boolean isnew = false;
				
				if (Validator.isNotNull(elm)) {
					 specification = elm;
				} else {
					specification.setId(CounterLocalServiceUtil.increment(VRVehicleSpecification.class.getName()));
					
					isnew = true;
				}
				
				
				specification.setVehicleCertificateId(vrVehicleTypeCertificateId);
				specification.setSpecificationCode(configTechSpec.getSpecificationCode());
				specification.setSpecificationName(configTechSpec.getSpecificationDisplayName());
				specification.setSpecificationValue(specificationValue);
				specification.setSpecificationValueDescription(configTechSpec.getSpecificationEntryPlaceholder());
				//TODO
				specification.setSequenceNo(configTechSpec.getSequenceNo());
				specification.setSpecificationBasicUnit(configTechSpec.getSpecificationBasicUnit());
				specification.setSpecificationStandard(configTechSpec.getSpecificationStandard());
				specification.setSpecificationGroup(Integer.toString(configTechSpec.getSpecificationGroup()));
				specification.setSpecificationDataCollectionID(configTechSpec.getSpecificationDataCollectionId());
				specification.setSpecificationResult(specificationResult);
				specification.setSyncDate(modifiedDate);
				
				if (isnew) {
					VRVehicleSpecificationLocalServiceUtil.addVRVehicleSpecification(specification);
	
				} else {
					VRVehicleSpecificationLocalServiceUtil.updateVRVehicleSpecification(specification);
	
				}
			}
			
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE VehicleSpecification");
	
		}
	}
}