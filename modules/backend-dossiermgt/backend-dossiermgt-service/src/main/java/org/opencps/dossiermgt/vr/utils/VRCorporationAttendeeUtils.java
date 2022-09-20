package org.opencps.dossiermgt.vr.utils;

import com.fds.vr.business.action.util.ConvertJONObjectUtils;
import com.fds.vr.business.model.VRCorporationAttendee;
import com.fds.vr.business.model.impl.VRCorporationAttendeeImpl;
import com.fds.vr.business.service.VRCorporationAttendeeLocalServiceUtil;
import com.fds.vr.service.util.FileUploadUtils;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.File;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import org.opencps.dossiermgt.action.util.ConstantsUtils;
import org.opencps.dossiermgt.action.util.DossierMgtUtils;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.impl.DossierFileImpl;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.comparator.DossierFileComparator;
import org.opencps.usermgt.model.Employee;
import org.opencps.usermgt.model.EmployeeJobPos;
import org.opencps.usermgt.model.JobPos;
import org.opencps.usermgt.model.WorkingUnit;
import org.opencps.usermgt.service.EmployeeJobPosLocalServiceUtil;
import org.opencps.usermgt.service.EmployeeLocalServiceUtil;
import org.opencps.usermgt.service.JobPosLocalServiceUtil;
import org.opencps.usermgt.service.WorkingUnitLocalServiceUtil;

public class VRCorporationAttendeeUtils {

	private static Log _log = LogFactoryUtil.getLog(VRCorporationAttendeeUtils.class.getName());

	public static String updateVRCorporationAttendee(DossierAction dossierActionModel) throws PortalException {
		try {
			//Lan luot tung quy trinh
			long serviceProcessId = dossierActionModel.getServiceProcessId();
			String postStepCode = dossierActionModel.getStepCode();
			String actionUserName =  dossierActionModel.getActionUser();
			String actionCode =  dossierActionModel.getActionCode();
			boolean flagUpdate = true; 
			long groupId = dossierActionModel.getGroupId(); 
			String fileTemplateNo = "PPC";
			
			String formData = StringPool.BLANK;
			DossierFile dossierFile = new DossierFileImpl();
			Dossier objDossier = DossierLocalServiceUtil.fetchDossier(dossierActionModel.getDossierId());
			ProcessAction processAction = ProcessActionLocalServiceUtil.fetchBySPID_AC(serviceProcessId, actionCode);
			
			if (Validator.isNotNull(postStepCode) && groupId == ConstantsUtils.GROUP_CXL
					&& Validator.isNotNull(processAction.getCreateDossierFiles()) && processAction.getCreateDossierFiles().equalsIgnoreCase(fileTemplateNo) ) {
				dossierFile = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_DPT_First(dossierActionModel.getDossierId(), fileTemplateNo, 2,
						false, new DossierFileComparator(false, "createDate", Date.class));
				//Add by Dungnv
				if (Validator.isNotNull(dossierFile) && (dossierFile.getFormDataDossierFile() > 0)) {
					File formDataFile = FileUploadUtils.getFile(dossierFile.getFormDataDossierFile());
					if (formDataFile != null) {
						formData = FileUploadUtils.fileToString(formDataFile);
					}
					
			    }
				if (Validator.isNotNull(dossierFile) && formData.isEmpty()) {
					formData = dossierFile.getFormData();
				}
			}
			if (Validator.isNull(formData)) {
				return "";
			}
			
			LinkedHashMap<String, String> mapValues = ConvertJONObjectUtils.getKeyValuesMap(formData);
			if (Validator.isNull(mapValues)) {
				return "";
			}

			List<VRCorporationAttendee> lstVRCorporationAttendee = VRCorporationAttendeeLocalServiceUtil
					.findByDossierIdAssignType(dossierActionModel.getDossierId(), postStepCode);
			
			
			// Co 3 truong hop: 
			// 1. Phan cong lan dau; 2: Phan cong cap lai giay phep da cap; 3: Phan cong sua doi bo sung sau khi cap phep
			// Ghi lai tung lan phan cong theo postStepCode. Moi lan cap phep, neu phan cong lai nhieu lan, thi xoa lan truoc do.
			
			if (Validator.isNotNull(lstVRCorporationAttendee) && lstVRCorporationAttendee.size() > 0) {
				for (VRCorporationAttendee vrCorporationAttendee : lstVRCorporationAttendee) {
					VRCorporationAttendeeLocalServiceUtil.deleteVRCorporationAttendee(vrCorporationAttendee);
				}
			}
			VRCorporationAttendee objVRCorporationAttendee = new VRCorporationAttendeeImpl();
			long vrCorporationAttendeeId = CounterLocalServiceUtil.increment(VRCorporationAttendee.class.getName());
			objVRCorporationAttendee.setId(vrCorporationAttendeeId);
			
			objVRCorporationAttendee.setMtCore(1);
			objVRCorporationAttendee.setCreateDate(new Date());
			objVRCorporationAttendee.setModifyDate(new Date());
			objVRCorporationAttendee.setSyncDate(new Date());
			
			Employee employee = EmployeeLocalServiceUtil.fetchByF_mappingUserId(groupId, dossierActionModel.getUserId());

			_log.info("groupId==="+groupId+"====employee.getMainJobPostId()====="+employee.getMainJobPostId() + "===dossierActionModel.getUserId()==="+dossierActionModel.getUserId());
			EmployeeJobPos objEmployeeJobPos = (employee != null && employee.getMainJobPostId() >0) ? EmployeeJobPosLocalServiceUtil
					.fetchEmployeeJobPos(employee.getMainJobPostId())
					: null;
			
			WorkingUnit objWorkingUnit = objEmployeeJobPos != null
					? WorkingUnitLocalServiceUtil.fetchWorkingUnit(objEmployeeJobPos.getWorkingUnitId()) : null;
			if (objWorkingUnit != null) {
				String corporationCode = objWorkingUnit.getGovAgencyCode();
				String corporationName = objWorkingUnit.getName();
				objVRCorporationAttendee.setCorporationCode(corporationCode);
				objVRCorporationAttendee.setCorporationName(corporationName);
			} else {
				_log.info("objWorkingUnit  === null");
			}
			
			try {
				if (Validator.isNotNull(mapValues.get("ngay_bat_dau_tham_dinh"))) {
					_log.info("ngay_bat_dau_tham_dinh: "+mapValues.get("ngay_bat_dau_tham_dinh"));
					objVRCorporationAttendee.setInspectionDate(DossierMgtUtils.parseStringToDate(mapValues.get("ngay_bat_dau_tham_dinh")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			

			objVRCorporationAttendee.setActivityId(dossierActionModel.getDossierActionId()); //dossierActionId
			objVRCorporationAttendee.setUserId(dossierActionModel.getUserId());
			objVRCorporationAttendee.setUserName(dossierActionModel.getUserName());
			objVRCorporationAttendee.setActivityType("EVENT");		
			objVRCorporationAttendee.setCategoryName(actionCode);
			String dossierTemplateNo = dossierFile.getDossierTemplateNo();
			objVRCorporationAttendee.setActivityCatetory(dossierTemplateNo);
			objVRCorporationAttendee.setDossierId(dossierActionModel.getDossierId());
			
			objVRCorporationAttendee.setServiceName(objDossier.getServiceName());
			objVRCorporationAttendee.setSubject(dossierActionModel.getActionName());
			objVRCorporationAttendee.setLocation("PHÒNG CHẤT LƯỢNG XE CƠ GIỚI (VAQ)");
			objVRCorporationAttendee.setState("9");
			objVRCorporationAttendee.setStateName("---");
			objVRCorporationAttendee.setStateColor("#FFBD33");
			objVRCorporationAttendee.setPriority("0");
			objVRCorporationAttendee.setOverdue(dossierActionModel.getActionOverdue()+"");			
			objVRCorporationAttendee.setProgress("100");
			objVRCorporationAttendee.setPermission("read");
			objVRCorporationAttendee.setManagerId(dossierFile.getUserId());
			objVRCorporationAttendee.setManagerName(dossierFile.getUserName());
			long leaderId = Validator.isNotNull(mapValues.get("userAction"))? Long.valueOf(mapValues.get("userAction")) : 0;
			objVRCorporationAttendee.setLeaderId(leaderId);
			objVRCorporationAttendee.setLeaderName(mapValues.get("userNameAction") + " -" + mapValues.get("userNoAction"));
			objVRCorporationAttendee.setLeaderJobTitle("");
			objVRCorporationAttendee.setDescription(dossierActionModel.getActionNote());
			String resultNote = StringPool.BLANK;
			objVRCorporationAttendee.setResultNote(resultNote);
			objVRCorporationAttendee.setAssignType(postStepCode);
			JobPos objJobPos = JobPosLocalServiceUtil.fetchJobPos(objEmployeeJobPos.getJobPostId());
			if(objJobPos!=null){
				objVRCorporationAttendee.setJobPosId(objJobPos.getJobPosId());
				objVRCorporationAttendee.setJobPosTitle(objJobPos.getTitle());
			}

			//Set Invitation
			JSONObject jsonData = JSONFactoryUtil.createJSONObject(formData);
			if (jsonData.has("subUsers") && Validator.isNotNull(jsonData.get("subUsers"))) {
				JSONArray subUserArr = jsonData.getJSONArray("subUsers");
				StringBuilder sb = new StringBuilder();
				if (subUserArr != null && subUserArr.length() > 0) {
					int length = subUserArr.length();
					for (int i = 0; i < length; i++) {
						JSONObject jsonUserInfo = subUserArr.getJSONObject(i);
						if (i == length - 1) {
							sb.append(jsonUserInfo.getString("fullName"));
						} else {
							sb.append(jsonUserInfo.getString("fullName"));
							sb.append(StringPool.COMMA);
						}
					}
					//
					objVRCorporationAttendee.setInvitation(sb.toString());
				}
			}
			//
			objVRCorporationAttendee.setEditable("0");
			objVRCorporationAttendee.setRegisterednumber(objDossier.getDossierNo());

			if (dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTCOP") 
					|| dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTKTSPMXCG")
					|| dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTKTSPMXBBCN")
					|| dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTKTTBLANDAU")
					|| dossierTemplateNo.equalsIgnoreCase("TT192012TTBGTVTDGLD")
					) {
				String testingRegisteredPlace = mapValues.get("dia_chi_nha_xuong");
				String testingPlaceDistrict = StringPool.BLANK;
				String testingPlaceCity = StringPool.BLANK;
				String testingPlaceRegion = StringPool.BLANK;
				String testingPlaceCountry = StringPool.BLANK;
 
				objVRCorporationAttendee.setTestingRegisteredPlace(testingRegisteredPlace);
				objVRCorporationAttendee.setTestingPlaceDistrict(testingPlaceDistrict);
				objVRCorporationAttendee.setTestingPlaceCity(testingPlaceCity);
				objVRCorporationAttendee.setTestingPlaceRegion(testingPlaceRegion);
				objVRCorporationAttendee.setTestingPlaceCountry(testingPlaceCountry);				
				
				objVRCorporationAttendee.setTenCoSoSanXuat(mapValues.get("ten_doanh_nghiep"));
				objVRCorporationAttendee.setDiaChiCoSoSanXuat(mapValues.get("dia_chi_doanh_nghiep"));
				objVRCorporationAttendee.setTenXuongSanXuat(mapValues.get("ten_nha_xuong"));
				objVRCorporationAttendee.setDiaChiXuongSanXuat(mapValues.get("dia_chi_nha_xuong"));
				// Tam thoi chua dien du lieu.
				
				/*
				objVRCorporationAttendee.setSoTKHQ(soTKHQ);
				objVRCorporationAttendee.setNgayTKHQ(ngayTKHQ);
				objVRCorporationAttendee.setMaChiCucHQ(maChiCucHQ);
				objVRCorporationAttendee.setNhanHieu(mapValues.get("HINO"));
				objVRCorporationAttendee.setTenThuongMai(tenThuongMai);
				objVRCorporationAttendee.setMaKieuLoai(maKieuLoai);
				objVRCorporationAttendee.setLoaiPhuongTien(mapValues.get("loai_phuong_tien"));
				objVRCorporationAttendee.setSoKhung(soKhung);
				objVRCorporationAttendee.setSoDongCo(soDongCo);
				objVRCorporationAttendee.setTinhTrangPhuongTien(tinhTrangPhuongTien);
				objVRCorporationAttendee.setKyHieuThietKe(kyHieuThietKe);
				objVRCorporationAttendee.setSoGCNThamDinhThietKe(soGCNThamDinhThietKe);
				objVRCorporationAttendee.setSoGCNPheDuyetKieuLoaiNuocNgoai(soGCNPheDuyetKieuLoaiNuocNgoai);

				*/
				
			} else {
				objVRCorporationAttendee.setTestingRegisteredPlace(objVRCorporationAttendee.getLocation());
			}
			
			
			objVRCorporationAttendee.setTestingRemarks(objDossier.getBriefNote());
			
			objVRCorporationAttendee.setVaqcontactname(mapValues.get("userNameAction") + " -" + mapValues.get("userNoAction"));
			objVRCorporationAttendee.setVaqcontactphone(mapValues.get(""));
			objVRCorporationAttendee.setApplicantIdNo(objDossier.getApplicantIdNo());			
			objVRCorporationAttendee.setImportercontactname(mapValues.get("nguoi_lien_he"));
			objVRCorporationAttendee.setImportercontactemail(objDossier.getContactEmail());
			objVRCorporationAttendee.setImportercontactphone(mapValues.get("dien_thoai_lien_he"));
			objVRCorporationAttendee.setImporterfax(mapValues.get(""));
			if (Validator.isNotNull(objVRCorporationAttendee.getTenCoSoSanXuat())) {
				objVRCorporationAttendee.setTenCoSoSanXuat(objDossier.getApplicantName());
			}
			if (Validator.isNotNull(objVRCorporationAttendee.getDiaChiCoSoSanXuat())) {
				objVRCorporationAttendee.setDiaChiCoSoSanXuat(objDossier.getAddress());
			}
			
			VRCorporationAttendeeLocalServiceUtil.addVRCorporationAttendee(objVRCorporationAttendee);
			return postStepCode;	
		} catch (SystemException e) {
			_log.error(e);
			return "";
		}
	}
}
