/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.fds.vr.business.service.impl;

import com.fds.vr.business.action.VRVehicleTypeCertificateAction;
import com.fds.vr.business.action.impl.VRVehicleTypeCertificateActionImpl;
import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.VRCOPReportRepository;
import com.fds.vr.business.model.VRDossier;
import com.fds.vr.business.model.VRDossierFile;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.VRRegistration;
import com.fds.vr.business.model.VRVehicleEquipment;
import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.model.impl.VRDossierImpl;
import com.fds.vr.business.model.impl.VRProductionPlantImpl;
import com.fds.vr.business.model.impl.VRVehicleTypeCertificateImpl;
import com.fds.vr.business.model.impl.VRVehicleTypeCertificateModelImpl;
import com.fds.vr.business.service.VRCOPReportRepositoryLocalServiceUtil;
import com.fds.vr.business.service.VRDossierLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleSpecificationLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleTypeCertificateLocalServiceUtil;
import com.fds.vr.business.service.base.VRVehicleTypeCertificateLocalServiceBaseImpl;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr vehicle type certificate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRVehicleTypeCertificateLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRVehicleTypeCertificateLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRVehicleTypeCertificateLocalServiceUtil
 */
@ProviderType
public class VRVehicleTypeCertificateLocalServiceImpl extends VRVehicleTypeCertificateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRVehicleTypeCertificateLocalServiceUtil} to
	 * access the vr vehicle type certificate local service.
	 */

	private Log _log = LogFactoryUtil.getLog(VRVehicleTypeCertificateLocalServiceImpl.class);
	private final String PATTERN_DATE = "dd-MM-yyyy HH:mm:ss";
	private final String PATTERN_DATE_2 = "dd/MM/yyyy HH:mm:ss";
	private final String PATTERN_DATE_3 = "dd/MM/yyyy";

	public VRVehicleTypeCertificate updateVehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date modifiedDate, VRRegistration registration, VRDossierFile dossierFile) {

		Date now = new Date();

		long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());

		VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
		// VRVehicleTypeCertificateLocalServiceUtil.
		/// Add audit fields
		object.setSyncDate(now);
		_log.info("Vao KHONG syncDateList:" + object.getSyncDate());

		// Add other fields
		object.setMtCore(1);
		if (dossierFile != null) {
			object.setDossierId(dossierFile.getDossierId());
		}
		object.setDossierType(mapValues.get("bien_ban@hinh_thuc_cap_giay"));
		object.setDossierNo(mapValues.get("so_ho_so"));
		object.setConvertassembleId(0);
		if (registration != null) {
			object.setApplicantIdNo(registration.getApplicantIdNo());
			object.setApplicantIdDate(registration.getApplicantIdDate());
			object.setApplicantName(registration.getApplicantName());
		}

		object.setApplicantAddress(mapValues.get(""));
		object.setApplicantRepresentative(mapValues.get(""));
		object.setApplicantRepresentativeTitle(mapValues.get(""));
		object.setApplicantEmail(mapValues.get(""));
		object.setApplicantPhone(mapValues.get(""));
		object.setApplicantFax(mapValues.get(""));
		object.setApplicantContactName(mapValues.get(""));
		object.setApplicantContactEmail(mapValues.get(""));
		object.setApplicantcontactPhone(mapValues.get(""));
		object.setManufacturerForeignCode(mapValues.get(""));

		object.setManufacturerName(mapValues.get("bien_ban@bb_XCG01001"));
		object.setManufacturerAddress(mapValues.get("bien_ban@bb_XCG01002"));
		object.setManufacturerRepresentative(mapValues.get(""));
		object.setManufacturerRepresentativeTitle(mapValues.get(""));
		object.setManufacturerEmail(mapValues.get(""));
		object.setManufacturerPhone(mapValues.get(""));
		object.setManufacturerFax(mapValues.get(""));
		object.setProductionPlantCode(mapValues.get(""));
		object.setProductionPlantName(mapValues.get(""));
		object.setProductionPlantAddress(mapValues.get(""));
		object.setProductionPlantRepresentative(mapValues.get(""));
		object.setProductionPlantRepresentativeTitle(mapValues.get(""));
		object.setCopReportNo(mapValues.get(""));
		object.setCopReportDate(now);
		object.setCopReportExpireDate(now);

		object.setDesignerCode(registration.getApplicantIdNo().toString());
		object.setDesignerName(mapValues.get("bien_ban@bb_ten_co_so_thiet_ke"));
		object.setDesignerAddress(mapValues.get("bien_ban@bb_dia_chi_co_so_thiet_ke"));
		object.setDesignerRepresentative(mapValues.get("bien_ban@bb_XCG01003"));
		object.setDesignerRepresentativeTitle(mapValues.get(""));

		object.setDesignerEmail(mapValues.get("bien_ban@bb_XCG01006"));
		object.setDesignerPhone(mapValues.get("bien_ban@bb_XCG01005"));
		object.setDesignerFax(mapValues.get(""));
		object.setVerificationCertificateNo(mapValues.get("chung_chi@so_bien_ban"));
		object.setVerificationCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_ket_thuc_tham_dinh")));
		object.setVerificationRefNo(mapValues.get("bien_ban@bb_XCG01020"));
		object.setVerificationRefDate(now);
		object.setTypeApprovalCertificateNo(mapValues.get(""));
		object.setTypeApprovalCertificateDate(now);
		object.setDesignModelCode(mapValues.get("bien_ban@loai_hinh_thiet_ke"));
		object.setDesignModelDescription(mapValues.get("bien_ban@loai_hinh_thiet_ke_text"));
		object.setDesignSymbol(mapValues.get("bien_ban@bb_XCG01026"));

		object.setRegisteredNumber(mapValues.get(""));
		object.setInspectorReceiveDate(now);
		object.setInspectorSubmitDate(now);
		object.setInspectorendorSementDate(now);
		object.setInspectorDeadline(now);
		object.setInspectorFinishDate(now);
		object.setInspectorCancelDate(now);
		object.setInspectorOrganization(mapValues.get(""));
		object.setInspectorDivision(mapValues.get(""));
		object.setInspectorSignName(mapValues.get(""));
		object.setInspectorSignTitle(mapValues.get(""));
		object.setInspectorSignPlace(mapValues.get(""));
		object.setCertificateType(mapValues.get("de_xuat_cap_chung_chi"));
		object.setReferenceCertificateNo(mapValues.get("bien_ban@XCG01022"));
		object.setReferenceCertificateDate(now);
		object.setCertificateRecordNo(mapValues.get("chung_chi@so_chung_chi"));
		object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_cc_text"));
		object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
		object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
		object.setCertificateRecordDate(parseStringToDate(mapValues.get("chung_chi@ngay_cap_cc")));
		object.setCertificateRecordExpireDate(now);
		object.setExpiredStatus("1");
		object.setCertificateRecordStatus("3");
		object.setDigitalIssueStatus("1");
		object.setVehicleClass(mapValues.get(""));
		object.setCertifiedVehicleType(mapValues.get("chung_chi@bb_XCG01050"));
		object.setCertifiedVehicleTypeDescription(mapValues.get("chung_chi@bb_XCG01050_text"));
		object.setCertifiedTrademark(mapValues.get("chung_chi@bb_XCG01051"));
		object.setCertifiedTrademarkName(mapValues.get("chung_chi@bb_XCG01051_text"));
		object.setCertifiedCommercialName(mapValues.get("chung_chi@bb_XCG01052"));
		object.setCertifiedModelCode(mapValues.get("chung_chi@bb_XCG01052"));
		object.setCertifiedAssemblyType(mapValues.get(""));
		object.setCertifiedAssemblyTypeDescription(mapValues.get(""));
		object.setCertifiedVINNo(mapValues.get(""));
		object.setCertifiedVINPosition(mapValues.get(""));
		object.setCertifiedFrameNo(mapValues.get(""));
		object.setCertifiedFrameAttachPlace(mapValues.get(""));
		object.setCertifiedFramePosition(mapValues.get(""));
		object.setCertifiedEngineNo(mapValues.get(""));
		object.setCertifiedEngineAttachPlace(mapValues.get(""));
		object.setCertifiedEnginePosition(mapValues.get(""));
		object.setSafetyTestReportNo(mapValues.get(""));
		object.setSafetyTestReportDate(now);
		object.setEmissionTestReportNo(mapValues.get(""));
		object.setEmissionTestReportDate(now);
		object.setCommonSafetyStandard(mapValues.get(""));
		object.setEmissionStandard(mapValues.get(""));
		object.setOtherTestReportNo(mapValues.get(""));
		object.setOtherTestReportDate(now);
		object.setSampleFrameNo(mapValues.get(""));
		object.setSampleVINNo(mapValues.get(""));
		object.setSampleEngineNo(mapValues.get(""));
		object.setSampleVehicleType(mapValues.get(""));
		object.setSampleVehicleTypeDescription(mapValues.get(""));
		object.setSampleTrademark(mapValues.get(""));
		object.setSampleTrademarkName(mapValues.get(""));
		object.setSampleCommercialName(mapValues.get(""));
		object.setSampleModelCode(mapValues.get(""));
		object.setCustomsDeclarationNo(mapValues.get(""));
		object.setCustomsDeclarationDate(now);
		object.setProductionCountry(mapValues.get(""));
		object.setImporterQuantity(Long.valueOf(mapValues.get("")));
		object.setInspectionRecordNo(mapValues.get(""));
		object.setInspectionDate(now);
		object.setInspectionSite(mapValues.get(""));
		object.setInspectionDistrictCode(mapValues.get(""));
		object.setInspectionDistrictName(mapValues.get(""));
		object.setInspectionProvinceCode(mapValues.get(""));
		object.setInspectionProvinceName(mapValues.get(""));
		object.setCorporationId(mapValues.get(""));
		object.setInspectorId(Long.valueOf(mapValues.get("")));
		object.setRemarks(mapValues.get(""));
		object.setInspectionNote(mapValues.get(""));
		object.setCertificateNote(mapValues.get(""));
		object.setModule(mapValues.get(""));
		object.setModifyDate(modifiedDate);

		return vrVehicleTypeCertificatePersistence.update(object);
	}

	public VRVehicleTypeCertificate updateTT302011BGTVTTTKXCG_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date applicantIdDate, VRApplicantProfile appProfile,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();
			boolean flagUpdate = true;

			VRVehicleTypeCertificate object = new VRVehicleTypeCertificateImpl();
			List<VRVehicleTypeCertificate> lsVRVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
					.findByDeliverableCode(dossierFile.getDeliverableCode());
			if (Validator.isNotNull(lsVRVehicleTypeCertificate) && lsVRVehicleTypeCertificate.size() > 0) {
				if (Validator.isNotNull(lsVRVehicleTypeCertificate.get(0))
						&& lsVRVehicleTypeCertificate.get(0).getModule().contains("01")) {
					object = lsVRVehicleTypeCertificate.get(0);
					flagUpdate = true;
				} else {
					flagUpdate = false;
					long vrVehicleTypeCertificateId = counterLocalService
							.increment(VRVehicleTypeCertificate.class.getName());
					object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
				}
			} else {
				flagUpdate = false;
				long vrVehicleTypeCertificateId = counterLocalService
						.increment(VRVehicleTypeCertificate.class.getName());
				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}
			object.setMtCore(1);
			object.setModifyDate(new Date());
			object.setSyncDate(new Date());
			if (appProfile != null) {
				object.setApplicantIdNo(appProfile.getApplicantCode());
				object.setApplicantIdDate(applicantIdDate);
				object.setApplicantName(appProfile.getApplicantName());
				object.setApplicantAddress(appProfile.getApplicantAddress());
				object.setApplicantRepresentative(appProfile.getApplicantRepresentative());
				object.setApplicantRepresentativeTitle(appProfile.getApplicantRepresentativeTitle());
				object.setApplicantEmail(appProfile.getApplicantEmail());
				object.setApplicantPhone(appProfile.getApplicantPhone());
				object.setApplicantFax(mapValues.get(""));
				object.setApplicantContactName(mapValues.get("bien_ban@bb_XCG01013"));
				object.setApplicantContactEmail(mapValues.get("bien_ban@bb_XCG01012"));
				object.setApplicantcontactPhone(mapValues.get("bien_ban@bb_XCG01014"));
				object.setCityCode(appProfile.getApplicantCity());

			} else {
				return object;
			}
			VRDossier objDossier = new VRDossierImpl();
			if (dossierFile != null) {
				object.setDossierId(dossierFile.getDossierId());
				object.setDeliverableCode(dossierFile.getDeliverableCode());
				objDossier = VRDossierLocalServiceUtil.fetchVRDossier(dossierFile.getDossierId());
			}
			object.setDossierType(mapValues.get("bien_ban@hinh_thuc_cap_giay"));

			object.setConvertassembleId(0);

			if (Validator.isNotNull(objDossier)) {
				object.setDossierNo(objDossier.getDossierNo());
				object.setReferenceUid(objDossier.getReferenceUid());
				object.setServiceCode(objDossier.getServiceCode());
				object.setServiceName(objDossier.getServiceName());
				object.setRegisteredNumber(mapValues.get("ma_ho_so"));
			}

			// Khong ap dung voi Tham dinh thiet ke
			/*
			 * object.setManufacturerForeignCode(mapValues.get(""));
			 * object.setManufacturerName(mapValues.get(""));
			 * object.setManufacturerAddress(mapValues.get(""));
			 * object.setManufacturerRepresentative(mapValues.get(""));
			 * object.setManufacturerRepresentativeTitle(mapValues.get(""));
			 * object.setManufacturerEmail(mapValues.get(""));
			 * object.setManufacturerPhone(mapValues.get(""));
			 * object.setManufacturerFax(mapValues.get(""));
			 *
			 * object.setCopReportNo(mapValues.get("")); object.setCopReportDate(null);
			 * object.setCopReportExpireDate(null);
			 */

			String productionPlantCode = mapValues.get("bien_ban@bb_XCG01007");
			VRProductionPlant objVRProductionPlant = new VRProductionPlantImpl();
			try {
				long productionPlantRegistrationId = Long.parseLong(productionPlantCode);
				// fake
				List<VRProductionPlant> lstVRProductionPlant = VRProductionPlantLocalServiceUtil
						.findByRegistrationFormId(1, appProfile.getId(), productionPlantRegistrationId);
				if (Validator.isNotNull(lstVRProductionPlant) && lstVRProductionPlant.size() > 0) {
					objVRProductionPlant = lstVRProductionPlant.get(0);
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				productionPlantCode = objVRProductionPlant.getProductionPlantCode();
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantName(objVRProductionPlant.getProductionPlantName());
				object.setProductionPlantAddress(objVRProductionPlant.getProductionPlantAddress());
				object.setProductionPlantRepresentative(mapValues.get("bien_ban@bb_XCG01009"));
				object.setProductionPlantRepresentativeTitle(mapValues.get("bien_ban@bb_XCG01010"));

			}

			object.setDesignerCode(mapValues.get("ma_so_doanh_nghiep"));
			object.setDesignerName(Validator.isNotNull(mapValues.get("bien_ban@bb_ten_co_so_thiet_ke"))
					? mapValues.get("bien_ban@bb_ten_co_so_thiet_ke")
					: appProfile.getApplicantName());
			object.setDesignerAddress(Validator.isNotNull(mapValues.get("bien_ban@bb_dia_chi_co_so_thiet_ke"))
					? mapValues.get("bien_ban@bb_dia_chi_co_so_thiet_ke")
					: appProfile.getApplicantAddress());
			object.setDesignerRepresentative(mapValues.get("bien_ban@bb_XCG01003"));
			object.setDesignerRepresentativeTitle(mapValues.get("bien_ban@bb_XCG01004")); // Chua xuat hien trong data
																							// bien ban

			object.setDesignerEmail(mapValues.get("bien_ban@bb_XCG01006"));
			object.setDesignerPhone(mapValues.get("bien_ban@bb_XCG01005")); // Chua xuat hien trong data bien ban
			object.setDesignerFax(mapValues.get(""));
			try {
				object.setVerificationCertificateNo(mapValues.get("so_chung_chi"));

				if (Validator.isNotNull(mapValues.get("ngay_ky_cc"))) {
					object.setVerificationCertificateDate(parseStringToDate(mapValues.get("ngay_ky_cc")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setVerificationRefNo(mapValues.get("chung_chi@so_bien_ban"));
				SimpleDateFormat formatDateShort = new SimpleDateFormat("dd/MM/yyyy");
				Date setDate = formatDateShort.parse(mapValues.get("chung_chi@ngay_ket_thuc_tham_dinh"));
				object.setVerificationRefDate(setDate);
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setReferenceCertificateNo(mapValues.get("bien_ban@XCG01020")); // Chua xuat hien trong data bien
																						// ban
				if (Validator.isNotNull(mapValues.get("bien_ban@XCG01021"))) { // Chua xuat hien trong data bien ban
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("bien_ban@XCG01021")));
				}

				// Mo rong: so_gcn_goc va ngay_gcn_goc;
				if (mapValues.get("chung_chi@so_gcn_goc").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_goc"))
						&& mapValues.get("chung_chi@ngay_gcn_goc").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_goc")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_gcn_goc"));
				}
				// Cap lai: so_chung_chi va ngay_gcn_cu;
				if (mapValues.get("chung_chi@so_chung_chi").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_cu"))
						&& mapValues.get("chung_chi@ngay_gcn_cu").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_cu")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_chung_chi"));
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			object.setDesignModelCode(mapValues.get("bien_ban@loai_hinh_thiet_ke"));
			object.setDesignModelDescription(mapValues.get("bien_ban@loai_hinh_thiet_ke_text"));
			object.setDesignSymbol(mapValues.get("bien_ban@bb_XCG01026"));

			// Khong ap dung voi Tham dinh thiet ke
			/*
			 * object.setTypeApprovalCertificateNo(mapValues.get(""));
			 * object.setTypeApprovalCertificateDate(now);
			 * object.setInspectorReceiveDate(now); object.setInspectorSubmitDate(now);
			 * object.setInspectorendorSementDate(now); object.setInspectorDeadline(now);
			 * object.setInspectorFinishDate(now); object.setInspectorCancelDate(now);
			 * object.setInspectorOrganization(mapValues.get(""));
			 * object.setInspectorDivision(mapValues.get(""));
			 * object.setInspectorSignName(mapValues.get(""));
			 * object.setInspectorSignTitle(mapValues.get(""));
			 * object.setInspectorSignPlace(mapValues.get(""));
			 */

			object.setCertificateType(mapValues.get("chung_chi@ket_luan_chung")); // 1: Giay chung nhan; 0: Thong bao
																					// khong dat
			object.setCertificateRecordNo(mapValues.get("chung_chi@so_chung_chi"));
			object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_cc_text"));
			object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
			object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
			object.setCertificateNote(mapValues.get("chung_chi@ghi_chu_in_chung_chi"));

			try {
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_cap_cc"))) {
					object.setCertificateRecordDate(parseStringToDate(mapValues.get("chung_chi@ngay_cap_cc")));
				}
				object.setCertificateRecordExpireDate(null);
			} catch (Exception e) {
				_log.debug(e);
			}
			object.setExpiredStatus("1");
			object.setCertificateRecordStatus("2");
			object.setDigitalIssueStatus("0");
			object.setVehicleClass("XCG");
			object.setCertifiedVehicleType(mapValues.get("chung_chi@bb_XCG01050"));
			object.setCertifiedVehicleTypeDescription(mapValues.get("chung_chi@bb_XCG01050_text"));
			object.setCertifiedTrademark(mapValues.get("bien_ban@bb_XCG01051"));
			object.setCertifiedTrademarkName(mapValues.get("chung_chi@bb_XCG01051_text"));
			object.setCertifiedCommercialName(mapValues.get("chung_chi@bb_XCG01052"));
			object.setCertifiedModelCode(mapValues.get("chung_chi@bb_XCG01053"));

			// Khong ap dung voi Tham dinh thiet ke
			/*
			 * object.setCertifiedAssemblyType(mapValues.get(""));
			 * object.setCertifiedAssemblyTypeDescription(mapValues.get(""));
			 * object.setCertifiedVINNo(mapValues.get(""));
			 * object.setCertifiedVINPosition(mapValues.get(""));
			 * object.setCertifiedFrameNo(mapValues.get(""));
			 * object.setCertifiedFrameAttachPlace(mapValues.get(""));
			 * object.setCertifiedFramePosition(mapValues.get(""));
			 * object.setCertifiedEngineNo(mapValues.get(""));
			 * object.setCertifiedEngineAttachPlace(mapValues.get(""));
			 * object.setCertifiedEnginePosition(mapValues.get(""));
			 * object.setSafetyTestReportNo(mapValues.get(""));
			 * object.setSafetyTestReportDate(now);
			 * object.setEmissionTestReportNo(mapValues.get(""));
			 * object.setEmissionTestReportDate(now);
			 */

			object.setCommonSafetyStandard(mapValues.get("bien_ban@bb_XCG01031"));
			object.setEmissionStandard(mapValues.get("bien_ban@bb_XCG01032"));
			object.setCommonSafetyDescription(mapValues.get("bien_ban@XCG01031_text"));
			object.setEmissionDescription(mapValues.get("bien_ban@XCG01032_text"));

			// Khong ap dung voi Tham dinh thiet ke
			/*
			 * object.setOtherTestReportNo(mapValues.get(""));
			 * object.setOtherTestReportDate(now);
			 * object.setSampleFrameNo(mapValues.get(""));
			 * object.setSampleVINNo(mapValues.get(""));
			 * object.setSampleEngineNo(mapValues.get(""));
			 * object.setSampleVehicleType(mapValues.get(""));
			 * object.setSampleVehicleTypeDescription(mapValues.get(""));
			 * object.setSampleTrademark(mapValues.get(""));
			 * object.setSampleTrademarkName(mapValues.get(""));
			 * object.setSampleCommercialName(mapValues.get(""));
			 * object.setSampleModelCode(mapValues.get(""));
			 * object.setCustomsDeclarationNo(mapValues.get(""));
			 * object.setCustomsDeclarationDate(now);
			 * object.setProductionCountry(mapValues.get(""));
			 * object.setImporterQuantity(Long.valueOf(mapValues.get("")));
			 * object.setInspectionRecordNo(mapValues.get(""));
			 * object.setInspectionDate(now); object.setInspectionSite(mapValues.get(""));
			 * object.setInspectionDistrictCode(mapValues.get(""));
			 * object.setInspectionDistrictName(mapValues.get(""));
			 * object.setInspectionProvinceCode(mapValues.get(""));
			 * object.setInspectionProvinceName(mapValues.get(""));
			 * object.setCorporationId(mapValues.get(""));
			 * object.setInspectorId(Long.valueOf(mapValues.get("")));
			 * object.setRemarks(mapValues.get(""));
			 * object.setInspectionNote(mapValues.get(""));
			 */

			object.setModule("01"); // 01: Tham dinh thiet ke

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate updateTT302011BGTVTTDTKXMCD_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date applicantIdDate, VRApplicantProfile appProfile,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();

			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());

			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate updateTT302011BGTVTKTSPMXCG_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date applicantIdDate, VRApplicantProfile appProfile,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();
			boolean flagUpdate = true;

			VRVehicleTypeCertificate object = new VRVehicleTypeCertificateImpl();
			List<VRVehicleTypeCertificate> lsVRVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
					.findByDeliverableCode(dossierFile.getDeliverableCode());
			if (Validator.isNotNull(lsVRVehicleTypeCertificate) && lsVRVehicleTypeCertificate.size() > 0) {
				if (Validator.isNotNull(lsVRVehicleTypeCertificate.get(0))
						&& lsVRVehicleTypeCertificate.get(0).getModule().contains("02")) {
					object = lsVRVehicleTypeCertificate.get(0);
					flagUpdate = true;
				} else {
					flagUpdate = false;
					long vrVehicleTypeCertificateId = counterLocalService
							.increment(VRVehicleTypeCertificate.class.getName());
					object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
				}
			} else {
				flagUpdate = false;
				long vrVehicleTypeCertificateId = counterLocalService
						.increment(VRVehicleTypeCertificate.class.getName());
				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}
			object.setMtCore(1);
			object.setModifyDate(new Date());
			object.setSyncDate(new Date());
			if (appProfile != null) {
				object.setApplicantIdNo(appProfile.getApplicantCode());
				object.setApplicantIdDate(applicantIdDate);
				object.setApplicantName(appProfile.getApplicantName());
				object.setApplicantAddress(appProfile.getApplicantAddress());
				object.setApplicantRepresentative(appProfile.getApplicantRepresentative());
				object.setApplicantRepresentativeTitle(appProfile.getApplicantRepresentativeTitle());
				object.setApplicantEmail(appProfile.getApplicantEmail());
				object.setApplicantPhone(appProfile.getApplicantPhone());
				object.setApplicantFax(mapValues.get(""));
				object.setApplicantContactName(mapValues.get("chungchi@bb_XCG01013"));
				object.setApplicantContactEmail(mapValues.get("chungchi@bb_XCG01012"));
				object.setApplicantcontactPhone(mapValues.get("chungchi@bb_XCG01014"));
				object.setCityCode(appProfile.getApplicantCity());

			} else {
				return object;
			}
			VRDossier objDossier = new VRDossierImpl();
			if (dossierFile != null) {
				object.setDossierId(dossierFile.getDossierId());
				object.setDeliverableCode(dossierFile.getDeliverableCode());
				objDossier = VRDossierLocalServiceUtil.fetchVRDossier(dossierFile.getDossierId());
			}
			object.setDossierType(mapValues.get("bien_ban@bb_XCG01019"));

			object.setConvertassembleId(0);

			if (Validator.isNotNull(objDossier)) {
				object.setDossierNo(objDossier.getDossierNo());
				object.setReferenceUid(objDossier.getReferenceUid());
				object.setServiceCode(objDossier.getServiceCode());
				object.setServiceName(objDossier.getServiceName());
				object.setRegisteredNumber(mapValues.get("ma_ho_so"));
			}

			// Khong ap dung voi Kiem tra san pham mau
			/*
			 * object.setManufacturerForeignCode(mapValues.get(""));
			 * object.setManufacturerName(mapValues.get(""));
			 * object.setManufacturerAddress(mapValues.get(""));
			 * object.setManufacturerRepresentative(mapValues.get(""));
			 * object.setManufacturerRepresentativeTitle(mapValues.get(""));
			 * object.setManufacturerEmail(mapValues.get(""));
			 * object.setManufacturerPhone(mapValues.get(""));
			 * object.setManufacturerFax(mapValues.get(""));
			 */

			String productionPlantCode = mapValues.get("bien_ban@bb_XCG01007");

			VRProductionPlant objVRProductionPlant = new VRProductionPlantImpl();
			try {
				long productionPlantRegistrationId = Long.parseLong(productionPlantCode);

				List<VRProductionPlant> lstVRProductionPlant = VRProductionPlantLocalServiceUtil
						.findByRegistrationFormId(1, appProfile.getId(), productionPlantRegistrationId);
				if (Validator.isNotNull(lstVRProductionPlant) && lstVRProductionPlant.size() > 0) {
					objVRProductionPlant = lstVRProductionPlant.get(0);
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				productionPlantCode = objVRProductionPlant.getProductionPlantCode();
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantName(objVRProductionPlant.getProductionPlantName());
				object.setProductionPlantAddress(objVRProductionPlant.getProductionPlantAddress());
				object.setProductionPlantRepresentative(mapValues.get("bien_ban@bb_XCG01009"));
				object.setProductionPlantRepresentativeTitle(mapValues.get("bien_ban@bb_XCG01010"));

			}
			// Khong ap dung voi Kiem tra san pham mau
			/*
			 * object.setCopReportNo(mapValues.get("")); object.setCopReportDate(null);
			 * object.setCopReportExpireDate(null);
			 *
			 * object.setDesignerCode(""); object.setDesignerName("");
			 * object.setDesignerAddress(""); object.setDesignerRepresentative("");
			 * object.setDesignerRepresentativeTitle("");
			 *
			 * object.setDesignerEmail(""); object.setDesignerPhone("");
			 * object.setDesignerFax(""); object.setVerificationCertificateNo("");
			 * object.setVerificationCertificateDate(null); object.setDesignModelCode("");
			 * object.setDesignModelDescription(""); object.setDesignSymbol("");
			 */

			// Khong ap dung voi Kiem tra san pham mau
			/*
			 * object.setTypeApprovalCertificateNo(mapValues.get(""));
			 * object.setTypeApprovalCertificateDate(now);
			 * object.setInspectorReceiveDate(now); object.setInspectorSubmitDate(now);
			 * object.setInspectorendorSementDate(now); object.setInspectorDeadline(now);
			 * object.setInspectorFinishDate(now); object.setInspectorCancelDate(now);
			 * object.setInspectorOrganization(mapValues.get(""));
			 * object.setInspectorDivision(mapValues.get(""));
			 * object.setInspectorSignName(mapValues.get(""));
			 * object.setInspectorSignTitle(mapValues.get(""));
			 * object.setInspectorSignPlace(mapValues.get(""));
			 */
			object.setCertificateType(mapValues.get("chung_chi@ket_luan_chung")); // 1: Giay chung nhan; 0: Thong bao
																					// khong dat

			object.setCertificateRecordNo(mapValues.get("chung_chi@so_bao_cao"));
			object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_bao_cao"));
			object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
			object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
			// object.setCertificateNote(mapValues.get("chung_chi@ghi_chu_in_chung_chi"));
			try {
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra"))) {
					object.setCertificateRecordDate(
							parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}
				object.setCertificateRecordExpireDate(null);
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setExpiredStatus("1");
			object.setCertificateRecordStatus("2");
			object.setDigitalIssueStatus("0");
			object.setVehicleClass("XCG");
			object.setCertifiedVehicleType(mapValues.get("bien_ban@bb_XCG01050"));
			object.setCertifiedVehicleTypeDescription(mapValues.get("bien_ban@bb_XCG01050_text"));
			object.setCertifiedTrademark(mapValues.get("bien_ban@bb_XCG01051"));
			object.setCertifiedTrademarkName(mapValues.get("bien_ban@bb_XCG01051_text"));
			object.setCertifiedCommercialName(mapValues.get("bien_ban@bb_XCG01052"));
			object.setCertifiedModelCode(mapValues.get("bien_ban@bb_XCG01053"));
			//
			object.setCertifiedAssemblyType(mapValues.get("bien_ban@bb_XCG01049"));
			object.setCertifiedAssemblyTypeDescription(mapValues.get("bien_ban@bb_XCG01049_text"));
			object.setCertifiedVINNo(mapValues.get("bien_ban@bb_XCG01055"));
			object.setCertifiedVINPosition(mapValues.get("bien_ban@bb_XCG01056"));
			object.setCertifiedFrameNo(mapValues.get("bien_ban@bb_XCG01057"));
			// object.setCertifiedFrameAttachPlace(mapValues.get(""));
			object.setCertifiedFramePosition(mapValues.get("bien_ban@bb_XCG01058"));
			object.setCertifiedEngineNo(mapValues.get("bien_ban@bb_XCG01059"));
			// object.setCertifiedEngineAttachPlace(mapValues.get(""));
			object.setCertifiedEnginePosition(mapValues.get("bien_ban@bb_XCG01060"));

			object.setCommonSafetyStandard(mapValues.get("bien_ban@bb_XCG01031"));
			object.setEmissionStandard(mapValues.get("bien_ban@bb_XCG01032"));
			object.setCommonSafetyDescription(mapValues.get("bien_ban@XCG01031_text"));
			object.setEmissionDescription(mapValues.get("bien_ban@XCG01032_text"));

			try {
				object.setSafetyTestReportNo(mapValues.get("bien_ban@bb_XCG01034"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01035"))) {
					object.setSafetyTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCG01035")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setEmissionTestReportNo(mapValues.get("bien_ban@bb_XCG01040"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01041"))) {
					object.setEmissionTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCG01041")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Kiem tra san pham mau
			/*
			 * object.setOtherTestReportNo(mapValues.get(""));
			 * object.setOtherTestReportDate(now);
			 */
			object.setSampleFrameNo(mapValues.get("bien_ban@bb_XCG01062"));
			object.setSampleVINNo(mapValues.get("bien_ban@bb_XCG01062"));
			object.setSampleEngineNo(mapValues.get("bien_ban@bb_XCG01063"));
			object.setSampleVehicleType(mapValues.get("bien_ban@bb_XCG01066"));
			object.setSampleVehicleTypeDescription(mapValues.get("bien_ban@bb_XCG01066_text"));
			object.setSampleTrademark(mapValues.get("bien_ban@bb_XCG01067"));
			object.setSampleTrademarkName(mapValues.get("bien_ban@bb_XCG01067_text"));
			object.setSampleCommercialName(mapValues.get("bien_ban@bb_XCG01068"));
			object.setSampleModelCode(mapValues.get("bien_ban@bb_XCG01069"));
			/*
			 * object.setCustomsDeclarationNo(mapValues.get(""));
			 * object.setCustomsDeclarationDate(now);
			 * object.setProductionCountry(mapValues.get(""));
			 * object.setImporterQuantity(Long.valueOf(mapValues.get("")));
			 */
			object.setInspectionRecordNo(mapValues.get("bien_ban@so_bien_ban"));
			try {
				object.setInspectionSite(mapValues.get("bien_ban@bb_XCG01008"));
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra"))) {
					object.setInspectionDate(parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				object.setInspectionDistrictCode(objVRProductionPlant.getProductionPlantDistrictCode());
				object.setInspectionDistrictName(objVRProductionPlant.getProductionPlantDistrictName());
				object.setInspectionProvinceCode(objVRProductionPlant.getProductionPlantProvinceCode());
				object.setInspectionProvinceName(objVRProductionPlant.getProductionPlantProvinceName());
			}

			object.setCorporationId(mapValues.get("bien_ban@workingUnitId"));
			object.setInspectorId(Long.valueOf(mapValues.get("bien_ban@dang_kiem_vien_chinh_userId")));
			object.setRemarks(mapValues.get(""));
			object.setInspectionNote(mapValues.get(""));

			object.setModule("02"); // 02: Kiem tra san pham mau

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate updateTT302011BGTVTKTSPMXBBCN_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date applicantIdDate, VRApplicantProfile appProfile,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();
			boolean flagUpdate = true;

			VRVehicleTypeCertificate object = new VRVehicleTypeCertificateImpl();
			List<VRVehicleTypeCertificate> lsVRVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
					.findByDeliverableCode(dossierFile.getDeliverableCode());
			if (Validator.isNotNull(lsVRVehicleTypeCertificate) && lsVRVehicleTypeCertificate.size() > 0) {
				if (Validator.isNotNull(lsVRVehicleTypeCertificate.get(0))
						&& lsVRVehicleTypeCertificate.get(0).getModule().contains("02")) {
					object = lsVRVehicleTypeCertificate.get(0);
					flagUpdate = true;
				} else {
					flagUpdate = false;
					long vrVehicleTypeCertificateId = counterLocalService
							.increment(VRVehicleTypeCertificate.class.getName());
					object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
				}
			} else {
				flagUpdate = false;
				long vrVehicleTypeCertificateId = counterLocalService
						.increment(VRVehicleTypeCertificate.class.getName());
				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}
			object.setMtCore(1);
			object.setModifyDate(new Date());
			object.setSyncDate(new Date());
			if (appProfile != null) {
				object.setApplicantIdNo(appProfile.getApplicantCode());
				object.setApplicantIdDate(applicantIdDate);
				object.setApplicantName(appProfile.getApplicantName());
				object.setApplicantAddress(appProfile.getApplicantAddress());
				object.setApplicantRepresentative(appProfile.getApplicantRepresentative());
				object.setApplicantRepresentativeTitle(appProfile.getApplicantRepresentativeTitle());
				object.setApplicantEmail(appProfile.getApplicantEmail());
				object.setApplicantPhone(appProfile.getApplicantPhone());
				object.setApplicantFax(mapValues.get(""));
				object.setApplicantContactName(mapValues.get("chungchi@bb_XCN01013")); // Chua xuat hien trong data bien
																						// ban
				object.setApplicantContactEmail(mapValues.get("chungchi@bb_XCN01012")); // Chua xuat hien trong data
																						// bien ban
				object.setApplicantcontactPhone(mapValues.get("chungchi@bb_XCN01014")); // Chua xuat hien trong data
																						// bien ban
				object.setCityCode(appProfile.getApplicantCity());

			} else {
				return object;
			}
			VRDossier objDossier = new VRDossierImpl();
			if (dossierFile != null) {
				object.setDossierId(dossierFile.getDossierId());
				object.setDeliverableCode(dossierFile.getDeliverableCode());
				objDossier = VRDossierLocalServiceUtil.fetchVRDossier(dossierFile.getDossierId());
			}
			object.setDossierType(mapValues.get("bien_ban@bb_XCN01019"));

			object.setConvertassembleId(0);

			if (Validator.isNotNull(objDossier)) {
				object.setDossierNo(objDossier.getDossierNo());
				object.setReferenceUid(objDossier.getReferenceUid());
				object.setServiceCode(objDossier.getServiceCode());
				object.setServiceName(objDossier.getServiceName());
				object.setRegisteredNumber(mapValues.get("ma_ho_so"));
			}

			// Khong ap dung voi Kiem tra san pham mau
			/*
			 * object.setManufacturerForeignCode(mapValues.get(""));
			 * object.setManufacturerName(mapValues.get(""));
			 * object.setManufacturerAddress(mapValues.get(""));
			 * object.setManufacturerRepresentative(mapValues.get(""));
			 * object.setManufacturerRepresentativeTitle(mapValues.get(""));
			 * object.setManufacturerEmail(mapValues.get(""));
			 * object.setManufacturerPhone(mapValues.get(""));
			 * object.setManufacturerFax(mapValues.get(""));
			 */

			String productionPlantCode = mapValues.get("bien_ban@bb_XCN01007");

			VRProductionPlant objVRProductionPlant = new VRProductionPlantImpl();
			try {
				long productionPlantRegistrationId = Long.parseLong(productionPlantCode);

				List<VRProductionPlant> lstVRProductionPlant = VRProductionPlantLocalServiceUtil
						.findByRegistrationFormId(1, appProfile.getId(), productionPlantRegistrationId);
				if (Validator.isNotNull(lstVRProductionPlant) && lstVRProductionPlant.size() > 0) {
					objVRProductionPlant = lstVRProductionPlant.get(0);
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				productionPlantCode = objVRProductionPlant.getProductionPlantCode();
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantName(objVRProductionPlant.getProductionPlantName());
				object.setProductionPlantAddress(objVRProductionPlant.getProductionPlantAddress());
				object.setProductionPlantRepresentative(mapValues.get("bien_ban@bb_XCN01009"));
				object.setProductionPlantRepresentativeTitle(mapValues.get("bien_ban@bb_XCN01010"));

			}
			// Khong ap dung voi Kiem tra san pham mau
			/*
			 * object.setCopReportNo(mapValues.get("")); object.setCopReportDate(null);
			 * object.setCopReportExpireDate(null);
			 *
			 * object.setDesignerCode(""); object.setDesignerName("");
			 * object.setDesignerAddress(""); object.setDesignerRepresentative("");
			 * object.setDesignerRepresentativeTitle("");
			 *
			 * object.setDesignerEmail(""); object.setDesignerPhone("");
			 * object.setDesignerFax(""); object.setVerificationCertificateNo("");
			 * object.setVerificationCertificateDate(null); object.setDesignModelCode("");
			 * object.setDesignModelDescription(""); object.setDesignSymbol("");
			 */

			// Khong ap dung voi Kiem tra san pham mau
			/*
			 * object.setTypeApprovalCertificateNo(mapValues.get(""));
			 * object.setTypeApprovalCertificateDate(now);
			 * object.setInspectorReceiveDate(now); object.setInspectorSubmitDate(now);
			 * object.setInspectorendorSementDate(now); object.setInspectorDeadline(now);
			 * object.setInspectorFinishDate(now); object.setInspectorCancelDate(now);
			 * object.setInspectorOrganization(mapValues.get(""));
			 * object.setInspectorDivision(mapValues.get(""));
			 * object.setInspectorSignName(mapValues.get(""));
			 * object.setInspectorSignTitle(mapValues.get(""));
			 * object.setInspectorSignPlace(mapValues.get(""));
			 */
			object.setCertificateType(mapValues.get("chung_chi@ket_luan_chung")); // 1: Giay chung nhan; 0: Thong bao
																					// khong dat

			object.setCertificateRecordNo(mapValues.get("chung_chi@so_bao_cao"));
			object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_bao_cao"));
			object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
			object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
			// object.setCertificateNote(mapValues.get("chung_chi@ghi_chu_in_chung_chi"));
			try {
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra"))) {
					object.setCertificateRecordDate(
							parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}
				object.setCertificateRecordExpireDate(null);
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setExpiredStatus("1");
			object.setCertificateRecordStatus("2");
			object.setDigitalIssueStatus("0");
			object.setVehicleClass("XCN");
			object.setCertifiedVehicleType(mapValues.get("bien_ban@bb_XCN01050"));
			object.setCertifiedVehicleTypeDescription(mapValues.get("bien_ban@bb_XCN01050_text"));
			object.setCertifiedTrademark(mapValues.get("bien_ban@bb_XCN01051"));
			object.setCertifiedTrademarkName(mapValues.get("bien_ban@bb_XCN01051_text"));
			object.setCertifiedCommercialName(mapValues.get("bien_ban@bb_XCN01052"));
			object.setCertifiedModelCode(mapValues.get("bien_ban@bb_XCN01053"));
			//
			object.setCertifiedAssemblyType(mapValues.get("bien_ban@bb_XCN01049"));
			object.setCertifiedAssemblyTypeDescription(mapValues.get("bien_ban@bb_XCN01049_text"));
			object.setCertifiedVINNo(mapValues.get("bien_ban@bb_XCN01055"));
			object.setCertifiedVINPosition(mapValues.get("bien_ban@bb_XCN01056"));
			object.setCertifiedFrameNo(mapValues.get("bien_ban@bb_XCN01057"));
			// object.setCertifiedFrameAttachPlace(mapValues.get(""));
			object.setCertifiedFramePosition(mapValues.get("bien_ban@bb_XCN01058"));
			object.setCertifiedEngineNo(mapValues.get("bien_ban@bb_XCN01059"));
			// object.setCertifiedEngineAttachPlace(mapValues.get(""));
			object.setCertifiedEnginePosition(mapValues.get("bien_ban@bb_XCN01060"));

			object.setCommonSafetyStandard(mapValues.get("bien_ban@bb_XCN01031"));
			object.setEmissionStandard(mapValues.get("bien_ban@bb_XCN01032"));
			object.setCommonSafetyDescription(mapValues.get("bien_ban@XCN01031_text"));
			object.setEmissionDescription(mapValues.get("bien_ban@XCN01032_text"));

			try {
				object.setSafetyTestReportNo(mapValues.get("bien_ban@bb_XCN01034"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCN01035"))) {
					object.setSafetyTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCN01035")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setEmissionTestReportNo(mapValues.get("bien_ban@bb_XCN01040"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCN01041"))) {
					object.setEmissionTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCN01041")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Kiem tra san pham mau
			/*
			 * object.setOtherTestReportNo(mapValues.get(""));
			 * object.setOtherTestReportDate(now);
			 */
			object.setSampleFrameNo(mapValues.get("bien_ban@bb_XCN01062"));
			object.setSampleVINNo(mapValues.get("bien_ban@bb_XCN01062"));
			object.setSampleEngineNo(mapValues.get("bien_ban@bb_XCN01063"));
			object.setSampleVehicleType(mapValues.get("bien_ban@bb_XCN01066"));
			object.setSampleVehicleTypeDescription(mapValues.get("bien_ban@bb_XCN01066_text"));
			object.setSampleTrademark(mapValues.get("bien_ban@bb_XCN01067"));
			object.setSampleTrademarkName(mapValues.get("bien_ban@bb_XCN01067_text"));
			object.setSampleCommercialName(mapValues.get("bien_ban@bb_XCN01068"));
			object.setSampleModelCode(mapValues.get("bien_ban@bb_XCN01069"));
			/*
			 * object.setCustomsDeclarationNo(mapValues.get(""));
			 * object.setCustomsDeclarationDate(now);
			 * object.setProductionCountry(mapValues.get(""));
			 * object.setImporterQuantity(Long.valueOf(mapValues.get("")));
			 */
			object.setInspectionRecordNo(mapValues.get("bien_ban@so_bien_ban"));
			try {
				object.setInspectionSite(mapValues.get("bien_ban@bb_XCN01008"));
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra"))) {
					object.setInspectionDate(parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				object.setInspectionDistrictCode(objVRProductionPlant.getProductionPlantDistrictCode());
				object.setInspectionDistrictName(objVRProductionPlant.getProductionPlantDistrictName());
				object.setInspectionProvinceCode(objVRProductionPlant.getProductionPlantProvinceCode());
				object.setInspectionProvinceName(objVRProductionPlant.getProductionPlantProvinceName());
			}

			object.setCorporationId(mapValues.get("bien_ban@workingUnitId"));
			object.setInspectorId(Long.valueOf(mapValues.get("bien_ban@dang_kiem_vien_chinh_userId")));
			object.setRemarks(mapValues.get(""));
			object.setInspectionNote(mapValues.get(""));

			object.setModule("02"); // 02: Kiem tra san pham mau

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate updateTT302011BGTVTCOP_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date modifiedDate, VRRegistration registration,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();

			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());

			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate updateTT302011BGTVTKTTBLANDAU_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date modifiedDate, VRRegistration registration,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();

			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());

			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate updateTT192012TTBGTVTDGLD_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date modifiedDate, VRRegistration registration,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();

			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());

			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate update432014TTLTBGTVTBCTTTNLNK_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date modifiedDate, VRRegistration registration,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();

			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());

			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate update432014TTLTBGTVTBCTTTNLSXLR_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date modifiedDate, VRRegistration registration,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();

			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());

			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLLKXCG_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date applicantIdDate, VRApplicantProfile appProfile,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();
			boolean flagUpdate = true;

			VRVehicleTypeCertificate object = new VRVehicleTypeCertificateImpl();
			List<VRVehicleTypeCertificate> lsVRVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
					.findByDeliverableCode(dossierFile.getDeliverableCode());
			if (Validator.isNotNull(lsVRVehicleTypeCertificate) && lsVRVehicleTypeCertificate.size() > 0) {
				if (Validator.isNotNull(lsVRVehicleTypeCertificate.get(0))
						&& lsVRVehicleTypeCertificate.get(0).getModule().contains("04")) {
					object = lsVRVehicleTypeCertificate.get(0);
					flagUpdate = true;
				} else {
					flagUpdate = false;
					long vrVehicleTypeCertificateId = counterLocalService
							.increment(VRVehicleTypeCertificate.class.getName());
					object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
				}
			} else {
				flagUpdate = false;
				long vrVehicleTypeCertificateId = counterLocalService
						.increment(VRVehicleTypeCertificate.class.getName());
				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}
			object.setMtCore(1);
			object.setModifyDate(new Date());
			object.setSyncDate(new Date());
			if (appProfile != null) {
				object.setApplicantIdNo(appProfile.getApplicantCode());
				object.setApplicantIdDate(applicantIdDate);
				object.setApplicantName(appProfile.getApplicantName());
				object.setApplicantAddress(appProfile.getApplicantAddress());
				object.setApplicantRepresentative(appProfile.getApplicantRepresentative());
				object.setApplicantRepresentativeTitle(appProfile.getApplicantRepresentativeTitle());
				object.setApplicantEmail(appProfile.getApplicantEmail());
				object.setApplicantPhone(appProfile.getApplicantPhone());
				object.setApplicantFax(mapValues.get(""));
				object.setApplicantContactName(mapValues.get("chungchi@bb_XCG01013")); // Chua xuat hien trong data bien
																						// ban
				object.setApplicantContactEmail(mapValues.get("chungchi@bb_XCG01012")); // Chua xuat hien trong data
																						// bien ban
				object.setApplicantcontactPhone(mapValues.get("chungchi@bb_XCG01014")); // Chua xuat hien trong data
																						// bien ban
				object.setCityCode(appProfile.getApplicantCity());

			} else {
				return object;
			}
			VRDossier objDossier = new VRDossierImpl();
			if (dossierFile != null) {
				object.setDossierId(dossierFile.getDossierId());
				object.setDeliverableCode(dossierFile.getDeliverableCode());
				objDossier = VRDossierLocalServiceUtil.fetchVRDossier(dossierFile.getDossierId());
			}
			object.setDossierType(mapValues.get("bien_ban@bb_XCG01019"));

			object.setConvertassembleId(0);

			if (Validator.isNotNull(objDossier)) {
				object.setDossierNo(objDossier.getDossierNo());
				object.setReferenceUid(objDossier.getReferenceUid());
				object.setServiceCode(objDossier.getServiceCode());
				object.setServiceName(objDossier.getServiceName());
				object.setRegisteredNumber(mapValues.get("ma_ho_so"));
			}

			String productionPlantCode = mapValues.get("bien_ban@bb_XCG01007");
			String loai_hinh_san_xuat = mapValues.get("bien_ban@loai_hinh_san_xuat"); // sxlr / nk

			VRProductionPlant objVRProductionPlant = new VRProductionPlantImpl();
			try {
				if (Validator.isNotNull(loai_hinh_san_xuat) && loai_hinh_san_xuat.contains("sxlr")) {
					long productionPlantRegistrationId = Long.parseLong(productionPlantCode);

					List<VRProductionPlant> lstVRProductionPlant = VRProductionPlantLocalServiceUtil
							.findByRegistrationFormId(1, appProfile.getId(), productionPlantRegistrationId);
					if (Validator.isNotNull(lstVRProductionPlant) && lstVRProductionPlant.size() > 0) {
						objVRProductionPlant = lstVRProductionPlant.get(0);
					}
				} else {
					// Co so nhap khau
					// Chi ap dung voi Chung nhan chat luong linh kien Nhap khau
					object.setManufacturerForeignCode(mapValues.get("bien_ban@bb_co_so_nhap_khau"));
					object.setManufacturerName(mapValues.get("bien_ban@bb_co_so_nhap_khau_text"));
					object.setManufacturerAddress(mapValues.get("bien_ban@bb_dia_chi_co_so_nhap_khau"));
					object.setManufacturerRepresentative(mapValues.get("bien_ban@bb_nguoi_dai_dien_nhap_khau"));
					object.setManufacturerRepresentativeTitle(mapValues.get("bien_ban@bb_chuc_danh_nhap_khau"));
					object.setManufacturerEmail(mapValues.get("bien_ban@bb_thu_dien_tu_nhap_khau"));
					object.setManufacturerPhone(mapValues.get("bien_ban@bb_so_dien_thoai_nhap_khau"));
					object.setManufacturerFax(mapValues.get("bien_ban@bb_thu_dien_tu_nguoi_lien_he"));
				}

			} catch (Exception e) {
				_log.debug(e);
			}
			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				productionPlantCode = objVRProductionPlant.getProductionPlantCode();
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantName(objVRProductionPlant.getProductionPlantName());
				object.setProductionPlantAddress(objVRProductionPlant.getProductionPlantAddress());
				object.setProductionPlantRepresentative(mapValues.get("bien_ban@bb_XCG01009")); // Chua xuat hien trong
																								// data bien ban
				object.setProductionPlantRepresentativeTitle(mapValues.get("bien_ban@bb_XCG01010")); // Chua xuat hien
																										// trong data
																										// bien ban

			}

			try {
				object.setCopReportNo(mapValues.get("chung_chi@bb_XCG01016"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCG01017"))
						&& mapValues.get("chung_chi@bb_XCG01017").length() > 9) {
					object.setCopReportDate(parseStringToDate(mapValues.get("chung_chi@bb_XCG01017"))); // Chua xuat
																										// hien trong
																										// data bien ban
				}
				object.setCopReportExpireDate(null);

				// Kiem tra hieu luc COP cho lan ke tiep
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCG01016"))
						&& mapValues.get("chung_chi@bb_XCG01016").trim().length() > 0) {
					VRCOPReportRepository objVRCOPReportRepository = VRCOPReportRepositoryLocalServiceUtil
							.findBycopReportNo(1, mapValues.get("chung_chi@bb_XCG01016").trim());
					if (Validator.isNotNull(objVRCOPReportRepository)) {
						object.setCopReportDate(objVRCOPReportRepository.getCopReportDate());
						object.setCopReportExpireDate(objVRCOPReportRepository.getCopReportExpiredDate());
					}
				}

			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Chung nhan chat luong linh kien
			/*
			 * object.setDesignerCode(""); object.setDesignerName("");
			 * object.setDesignerAddress(""); object.setDesignerRepresentative("");
			 * object.setDesignerRepresentativeTitle("");
			 *
			 * object.setDesignerEmail(""); object.setDesignerPhone("");
			 * object.setDesignerFax("");
			 * object.setDesignModelCode(mapValues.get("bien_ban@loai_hinh_thiet_ke"));
			 * object.setDesignModelDescription(mapValues.get(
			 * "bien_ban@loai_hinh_thiet_ke_text"));
			 *
			 * //object.setVerificationCertificateNo //object.setVerificationCertificateDate
			 * //object.setTypeApprovalCertificateNo //object.setTypeApprovalCertificateDate
			 *
			 */
			try {
				object.setVerificationRefNo(mapValues.get("chung_chi@so_bien_ban"));
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra"))
						&& mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setVerificationRefDate(parseStringToDate(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setReferenceCertificateNo(mapValues.get("bien_ban@bb_XCG01020")); // Chua xuat hien trong data
																							// bien ban
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01021"))
						&& mapValues.get("bien_ban@bb_XCG01021").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("bien_ban@bb_XCG01021"))); // Chua
																													// xuat
																													// hien
																													// trong
																													// data
																													// bien
																													// ban
				}

				// Mo rong: so_gcn_goc va ngay_gcn_goc;
				if (mapValues.get("chung_chi@so_gcn_goc").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_goc"))
						&& mapValues.get("chung_chi@ngay_gcn_goc").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_goc")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_gcn_goc"));
				}
				// Cap lai: so_chung_chi va ngay_gcn_cu;
				if (mapValues.get("chung_chi@so_chung_chi").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_cu"))
						&& mapValues.get("chung_chi@ngay_gcn_cu").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_cu")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_chung_chi"));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Chung nhan chat luong linh kien
			/*
			 * object.setInspectorReceiveDate(now); object.setInspectorSubmitDate(now);
			 * object.setInspectorendorSementDate(now); object.setInspectorDeadline(now);
			 * object.setInspectorFinishDate(now); object.setInspectorCancelDate(now);
			 * object.setInspectorOrganization(mapValues.get(""));
			 * object.setInspectorDivision(mapValues.get(""));
			 * object.setInspectorSignName(mapValues.get(""));
			 * object.setInspectorSignTitle(mapValues.get(""));
			 * object.setInspectorSignPlace(mapValues.get(""));
			 */
			object.setCertificateType(mapValues.get("chung_chi@ket_luan_chung")); // 1: Giay chung nhan; 0: Thong bao
																					// khong dat

			object.setCertificateRecordNo(mapValues.get("chung_chi@so_chung_chi"));
			object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_cc_text"));
			object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
			object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
			object.setCertificateNote(mapValues.get("chung_chi@ghi_chu_in_chung_chi"));
			try {
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_cap_cc"))
						&& mapValues.get("chung_chi@ngay_cap_cc").length() > 9) {
					object.setCertificateRecordDate(parseStringToDate(mapValues.get("chung_chi@ngay_cap_cc")));
				}
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_het_han_gcn"))
						&& mapValues.get("bien_ban@ngay_het_han_gcn").length() > 9) {
					object.setCertificateRecordExpireDate(
							parseStringToDate(mapValues.get("bien_ban@ngay_het_han_gcn")));
					// Moi co trong bien ban, Chua xuat hien trong data chung chi
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setExpiredStatus("1");
			object.setCertificateRecordStatus("2");
			object.setDigitalIssueStatus("0");
			object.setVehicleClass("LKXCG");
			object.setCertifiedVehicleType(mapValues.get("bien_ban@bb_loai_san_pham"));
			object.setCertifiedVehicleTypeDescription(mapValues.get("bien_ban@bb_loai_san_pham_text"));
			object.setCertifiedTrademark(mapValues.get("bien_ban@bb_XCG01051"));
			object.setCertifiedTrademarkName(mapValues.get("bien_ban@bb_XCG01051"));
			object.setCertifiedCommercialName(mapValues.get("bien_ban@bb_XCG01052"));
			object.setCertifiedModelCode(mapValues.get("bien_ban@bb_XCG01053"));
			//
			object.setCertifiedAssemblyType(mapValues.get("bien_ban@bb_hinh_thuc_cap"));
			object.setCertifiedAssemblyTypeDescription(mapValues.get("bien_ban@bb_hinh_thuc_cap_text"));

			/*
			 * object.setCertifiedVINNo(mapValues.get("bien_ban@bb_XCG01055"));
			 * object.setCertifiedVINPosition(mapValues.get("bien_ban@bb_XCG01056"));
			 * object.setCertifiedFrameNo(mapValues.get("bien_ban@bb_XCG01057"));
			 * object.setCertifiedFrameAttachPlace(mapValues.get(""));
			 * object.setCertifiedFramePosition(mapValues.get("bien_ban@bb_XCG01058"));
			 * object.setCertifiedEngineNo(mapValues.get("bien_ban@bb_XCG01059"));
			 * object.setCertifiedEngineAttachPlace(mapValues.get(""));
			 * object.setCertifiedEnginePosition(mapValues.get("bien_ban@bb_XCG01060"));
			 * object.setSampleFrameNo(mapValues.get("bien_ban@bb_XCG01062"));
			 * object.setSampleVINNo(mapValues.get("bien_ban@bb_XCG01062"));
			 * object.setSampleEngineNo(mapValues.get("bien_ban@bb_XCG01063"));
			 * object.setSampleVehicleType(mapValues.get("bien_ban@bb_XCG01066"));
			 * object.setSampleVehicleTypeDescription(mapValues.get(
			 * "bien_ban@bb_XCG01066_text"));
			 * object.setSampleTrademark(mapValues.get("bien_ban@bb_XCG01067"));
			 * object.setSampleTrademarkName(mapValues.get("bien_ban@bb_XCG01067_text"));
			 * object.setSampleCommercialName(mapValues.get("bien_ban@bb_XCG01068"));
			 * object.setSampleModelCode(mapValues.get("bien_ban@bb_XCG01069"));
			 */

			object.setCommonSafetyStandard(mapValues.get("bien_ban@bb_tieu_chuan_ap_dung"));
			object.setCommonSafetyDescription(mapValues.get("bien_ban@bb_tieu_chuan_ap_dung_text"));
			/*
			 * object.setEmissionStandard(mapValues.get("bien_ban@bb_XCG01032"));
			 * object.setEmissionDescription(mapValues.get("bien_ban@XCG01032_text"));
			 */

			try {
				object.setSafetyTestReportNo(mapValues.get("bien_ban@bb_bao_cao_ket_qua_thu_nghiem"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem"))
						&& mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem").length() > 9) {
					object.setSafetyTestReportDate(
							parseStringToDate(mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem")));
				} // Chua xuat hien trong data bien ban
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setEmissionTestReportNo(mapValues.get("bien_ban@bb_bao_cao_ket_qua_thu_nghiem_lien_quan"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem_lien_quan"))
						&& mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem_lien_quan").length() > 9) {
					object.setEmissionTestReportDate(parseStringToDate(
							mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem_lien_quan")));
				} // Chua xuat hien trong data bien ban
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setOtherTestReportNo(mapValues.get("bien_ban@bb_bien_ban_kiem_tra_xac_nhan"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_ngay_cap_bien_ban_kiem_tra_xac_nhan"))
						&& mapValues.get("bien_ban@bb_ngay_cap_bien_ban_kiem_tra_xac_nhan").length() > 9) {
					object.setOtherTestReportDate(
							parseStringToDate(mapValues.get("bien_ban@bb_ngay_cap_bien_ban_kiem_tra_xac_nhan")));
				} // Chua xuat hien trong data bien ban
			} catch (Exception e) {
				_log.debug(e);
			}

			// Chi ap dung voi Chung nhan chat luong linh kien
			// so_to_khai ngay_mo_to_khai nuoc_san_xuat
			try {
				object.setCustomsDeclarationNo(mapValues.get("bien_ban@bb_LKXCG0401"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_LKXCG0402"))
						&& mapValues.get("bien_ban@bb_LKXCG0402").length() > 9) {
					object.setCustomsDeclarationDate(parseStringToDate(mapValues.get("bien_ban@bb_LKXCG0402")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				// Chua xuat hien trong data bien ban
				object.setDesignSymbol(Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01026"))
						? mapValues.get("bien_ban@bb_XCG01026")
						: Validator.isNotNull(mapValues.get("bien_ban@so_to_khai"))
								? mapValues.get("bien_ban@so_to_khai")
								: null);
				object.setProductionCountry(Validator.isNotNull(mapValues.get("bien_ban@bb_LKXCG0405"))
						? mapValues.get("bien_ban@bb_LKXCG0405")
						: Validator.isNotNull(mapValues.get("bien_ban@nuoc_san_xuat"))
								? mapValues.get("bien_ban@nuoc_san_xuat")
								: null);
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_LKXCG0404"))
						&& mapValues.get("bien_ban@bb_LKXCG0404").length() > 0) {
					object.setImporterQuantity(Long.valueOf(mapValues.get("bien_ban@bb_LKXCG0404")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setInspectionRecordNo(mapValues.get("bien_ban@so_bien_ban"));
			try {
				object.setInspectionSite(mapValues.get("bien_ban@bb_XCG01008"));
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra"))
						&& mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setInspectionDate(parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				object.setInspectionDistrictCode(objVRProductionPlant.getProductionPlantDistrictCode());
				object.setInspectionDistrictName(objVRProductionPlant.getProductionPlantDistrictName());
				object.setInspectionProvinceCode(objVRProductionPlant.getProductionPlantProvinceCode());
				object.setInspectionProvinceName(objVRProductionPlant.getProductionPlantProvinceName());
			}

			// object.setCorporationId(mapValues.get("bien_ban@workingUnitId"));
			object.setInspectorId(Long.valueOf(mapValues.get("bien_ban@dang_kiem_vien_chinh_userId")));
			object.setRemarks(mapValues.get(""));
			object.setInspectionNote(mapValues.get(""));

			object.setModule("04"); // 04: Chung nhan chat luong linh kien

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLLKXM_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date applicantIdDate, VRApplicantProfile appProfile,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();
			boolean flagUpdate = true;

			VRVehicleTypeCertificate object = new VRVehicleTypeCertificateImpl();
			List<VRVehicleTypeCertificate> lsVRVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
					.findByDeliverableCode(dossierFile.getDeliverableCode());
			if (Validator.isNotNull(lsVRVehicleTypeCertificate) && lsVRVehicleTypeCertificate.size() > 0) {
				if (Validator.isNotNull(lsVRVehicleTypeCertificate.get(0))
						&& lsVRVehicleTypeCertificate.get(0).getModule().contains("04")) {
					object = lsVRVehicleTypeCertificate.get(0);
					flagUpdate = true;
				} else {
					flagUpdate = false;
					long vrVehicleTypeCertificateId = counterLocalService
							.increment(VRVehicleTypeCertificate.class.getName());
					object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
				}
			} else {
				flagUpdate = false;
				long vrVehicleTypeCertificateId = counterLocalService
						.increment(VRVehicleTypeCertificate.class.getName());
				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}
			object.setMtCore(1);
			object.setModifyDate(new Date());
			object.setSyncDate(new Date());
			if (appProfile != null) {
				object.setApplicantIdNo(appProfile.getApplicantCode());
				object.setApplicantIdDate(applicantIdDate);
				object.setApplicantName(appProfile.getApplicantName());
				object.setApplicantAddress(appProfile.getApplicantAddress());
				object.setApplicantRepresentative(appProfile.getApplicantRepresentative());
				object.setApplicantRepresentativeTitle(appProfile.getApplicantRepresentativeTitle());
				object.setApplicantEmail(appProfile.getApplicantEmail());
				object.setApplicantPhone(appProfile.getApplicantPhone());
				object.setApplicantFax(mapValues.get(""));
				object.setApplicantContactName(mapValues.get("chungchi@bb_XMY01013"));
				object.setApplicantContactEmail(mapValues.get("chungchi@bb_XMY01012"));
				object.setApplicantcontactPhone(mapValues.get("chungchi@bb_XMY01014"));
				object.setCityCode(appProfile.getApplicantCity());

			} else {
				return object;
			}
			VRDossier objDossier = new VRDossierImpl();
			if (dossierFile != null) {
				object.setDossierId(dossierFile.getDossierId());
				object.setDeliverableCode(dossierFile.getDeliverableCode());
				objDossier = VRDossierLocalServiceUtil.fetchVRDossier(dossierFile.getDossierId());
			}
			object.setDossierType(mapValues.get("bien_ban@bb_XMY01019"));

			object.setConvertassembleId(0);

			if (Validator.isNotNull(objDossier)) {
				object.setDossierNo(objDossier.getDossierNo());
				object.setReferenceUid(objDossier.getReferenceUid());
				object.setServiceCode(objDossier.getServiceCode());
				object.setServiceName(objDossier.getServiceName());
				object.setRegisteredNumber(mapValues.get("ma_ho_so"));
			}

			String productionPlantCode = mapValues.get("bien_ban@bb_XMY01007");
			String loai_hinh_san_xuat = mapValues.get("bien_ban@loai_hinh_san_xuat"); // sxlr / nk

			VRProductionPlant objVRProductionPlant = new VRProductionPlantImpl();
			try {
				if (Validator.isNotNull(loai_hinh_san_xuat) && loai_hinh_san_xuat.contains("sxlr")) {
					long productionPlantRegistrationId = Long.parseLong(productionPlantCode);

					List<VRProductionPlant> lstVRProductionPlant = VRProductionPlantLocalServiceUtil
							.findByRegistrationFormId(1, appProfile.getId(), productionPlantRegistrationId);
					if (Validator.isNotNull(lstVRProductionPlant) && lstVRProductionPlant.size() > 0) {
						objVRProductionPlant = lstVRProductionPlant.get(0);
					}
				} else {
					// Co so nhap khau
					// Chi ap dung voi Chung nhan chat luong linh kien Nhap khau
					object.setManufacturerForeignCode(mapValues.get("bien_ban@bb_co_so_nhap_khau"));
					object.setManufacturerName(mapValues.get("bien_ban@bb_co_so_nhap_khau_text"));
					object.setManufacturerAddress(mapValues.get("bien_ban@bb_dia_chi_co_so_nhap_khau"));
					object.setManufacturerRepresentative(mapValues.get("bien_ban@bb_nguoi_dai_dien_nhap_khau"));
					object.setManufacturerRepresentativeTitle(mapValues.get("bien_ban@bb_chuc_danh_nhap_khau"));
					object.setManufacturerEmail(mapValues.get("bien_ban@bb_thu_dien_tu_nhap_khau"));
					object.setManufacturerPhone(mapValues.get("bien_ban@bb_so_dien_thoai_nhap_khau"));
					object.setManufacturerFax(mapValues.get("bien_ban@bb_thu_dien_tu_nguoi_lien_he"));
				}

			} catch (Exception e) {
				_log.debug(e);
			}
			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				productionPlantCode = objVRProductionPlant.getProductionPlantCode();
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantName(objVRProductionPlant.getProductionPlantName());
				object.setProductionPlantAddress(objVRProductionPlant.getProductionPlantAddress());
				object.setProductionPlantRepresentative(mapValues.get("bien_ban@bb_XMY01009")); // Chua xuat hien trong
																								// data bien ban
				object.setProductionPlantRepresentativeTitle(mapValues.get("bien_ban@bb_XMY01010")); // Chua xuat hien
																										// trong data
																										// bien ban

			}

			try {
				object.setCopReportNo(mapValues.get("chung_chi@bb_XMY01016"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XMY01017"))
						&& mapValues.get("chung_chi@bb_XMY01017").length() > 9) {
					object.setCopReportDate(parseStringToDate(mapValues.get("chung_chi@bb_XMY01017"))); // Chua xuat
																										// hien trong
																										// data bien ban
				}
				object.setCopReportExpireDate(null);

				// Kiem tra hieu luc COP cho lan ke tiep
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XMY01016"))
						&& mapValues.get("chung_chi@bb_XMY01016").trim().length() > 0) {
					VRCOPReportRepository objVRCOPReportRepository = VRCOPReportRepositoryLocalServiceUtil
							.findBycopReportNo(1, mapValues.get("chung_chi@bb_XMY01016").trim());
					if (Validator.isNotNull(objVRCOPReportRepository)) {
						object.setCopReportDate(objVRCOPReportRepository.getCopReportDate());
						object.setCopReportExpireDate(objVRCOPReportRepository.getCopReportExpiredDate());
					}
				}

			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Chung nhan chat luong linh kien
			/*
			 * object.setDesignerCode(""); object.setDesignerName("");
			 * object.setDesignerAddress(""); object.setDesignerRepresentative("");
			 * object.setDesignerRepresentativeTitle("");
			 *
			 * object.setDesignerEmail(""); object.setDesignerPhone("");
			 * object.setDesignerFax("");
			 * object.setDesignModelCode(mapValues.get("bien_ban@loai_hinh_thiet_ke"));
			 * object.setDesignModelDescription(mapValues.get(
			 * "bien_ban@loai_hinh_thiet_ke_text"));
			 *
			 * //object.setVerificationCertificateNo //object.setVerificationCertificateDate
			 * //object.setTypeApprovalCertificateNo //object.setTypeApprovalCertificateDate
			 *
			 */
			try {
				object.setVerificationRefNo(mapValues.get("chung_chi@so_bien_ban"));
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra"))
						&& mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setVerificationRefDate(parseStringToDate(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setReferenceCertificateNo(mapValues.get("bien_ban@bb_XMY01020")); // Chua xuat hien trong data
																							// bien ban

				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XMY01021"))
						&& mapValues.get("bien_ban@bb_XMY01021").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("bien_ban@bb_XMY01021"))); // Chua
																													// xuat
																													// hien
																													// trong
																													// data
																													// bien
																													// ban
				}
				// Mo rong: so_gcn_goc va ngay_gcn_goc;
				if (mapValues.get("chung_chi@so_gcn_goc").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_goc"))
						&& mapValues.get("chung_chi@ngay_gcn_goc").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_goc")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_gcn_goc"));
				}
				// Cap lai: so_chung_chi va ngay_gcn_cu;
				if (mapValues.get("chung_chi@so_chung_chi").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_cu"))
						&& mapValues.get("chung_chi@ngay_gcn_cu").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_cu")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_chung_chi"));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Chung nhan chat luong linh kien
			/*
			 * object.setInspectorReceiveDate(now); object.setInspectorSubmitDate(now);
			 * object.setInspectorendorSementDate(now); object.setInspectorDeadline(now);
			 * object.setInspectorFinishDate(now); object.setInspectorCancelDate(now);
			 * object.setInspectorOrganization(mapValues.get(""));
			 * object.setInspectorDivision(mapValues.get(""));
			 * object.setInspectorSignName(mapValues.get(""));
			 * object.setInspectorSignTitle(mapValues.get(""));
			 * object.setInspectorSignPlace(mapValues.get(""));
			 */
			object.setCertificateType(mapValues.get("chung_chi@ket_luan_chung")); // 1: Giay chung nhan; 0: Thong bao
																					// khong dat

			object.setCertificateRecordNo(mapValues.get("chung_chi@so_chung_chi"));
			object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_cc_text"));
			object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
			object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
			object.setCertificateNote(mapValues.get("chung_chi@ghi_chu_in_chung_chi"));
			try {
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_cap_cc"))
						&& mapValues.get("chung_chi@ngay_cap_cc").length() > 9) {
					object.setCertificateRecordDate(parseStringToDate(mapValues.get("chung_chi@ngay_cap_cc")));
				}
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_het_han_gcn"))
						&& mapValues.get("bien_ban@ngay_het_han_gcn").length() > 9) {
					object.setCertificateRecordExpireDate(
							parseStringToDate(mapValues.get("bien_ban@ngay_het_han_gcn")));
					// Moi co trong bien ban, Chua xuat hien trong data chung chi
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setExpiredStatus("1");
			object.setCertificateRecordStatus("2");
			object.setDigitalIssueStatus("0");
			object.setVehicleClass("LKXMY");
			object.setCertifiedVehicleType(mapValues.get("bien_ban@bb_loai_san_pham"));
			object.setCertifiedVehicleTypeDescription(mapValues.get("bien_ban@bb_loai_san_pham_text"));
			object.setCertifiedTrademark(mapValues.get("bien_ban@bb_XMY01051"));
			object.setCertifiedTrademarkName(mapValues.get("bien_ban@bb_XMY01051"));
			object.setCertifiedCommercialName(mapValues.get("bien_ban@bb_XMY01052"));
			object.setCertifiedModelCode(mapValues.get("bien_ban@bb_XMY01053"));
			//
			object.setCertifiedAssemblyType(mapValues.get("bien_ban@bb_hinh_thuc_cap"));
			object.setCertifiedAssemblyTypeDescription(mapValues.get("bien_ban@bb_hinh_thuc_cap_text"));

			/*
			 * object.setCertifiedVINNo(mapValues.get("bien_ban@bb_XMY01055"));
			 * object.setCertifiedVINPosition(mapValues.get("bien_ban@bb_XMY01056"));
			 * object.setCertifiedFrameNo(mapValues.get("bien_ban@bb_XMY01057"));
			 * object.setCertifiedFrameAttachPlace(mapValues.get(""));
			 * object.setCertifiedFramePosition(mapValues.get("bien_ban@bb_XMY01058"));
			 * object.setCertifiedEngineNo(mapValues.get("bien_ban@bb_XMY01059"));
			 * object.setCertifiedEngineAttachPlace(mapValues.get(""));
			 * object.setCertifiedEnginePosition(mapValues.get("bien_ban@bb_XMY01060"));
			 * object.setSampleFrameNo(mapValues.get("bien_ban@bb_XMY01062"));
			 * object.setSampleVINNo(mapValues.get("bien_ban@bb_XMY01062"));
			 * object.setSampleEngineNo(mapValues.get("bien_ban@bb_XMY01063"));
			 * object.setSampleVehicleType(mapValues.get("bien_ban@bb_XMY01066"));
			 * object.setSampleVehicleTypeDescription(mapValues.get(
			 * "bien_ban@bb_XMY01066_text"));
			 * object.setSampleTrademark(mapValues.get("bien_ban@bb_XMY01067"));
			 * object.setSampleTrademarkName(mapValues.get("bien_ban@bb_XMY01067_text"));
			 * object.setSampleCommercialName(mapValues.get("bien_ban@bb_XMY01068"));
			 * object.setSampleModelCode(mapValues.get("bien_ban@bb_XMY01069"));
			 */

			object.setCommonSafetyStandard(mapValues.get("bien_ban@bb_tieu_chuan_ap_dung"));
			object.setCommonSafetyDescription(mapValues.get("bien_ban@bb_tieu_chuan_ap_dung_text"));
			/*
			 * object.setEmissionStandard(mapValues.get("bien_ban@bb_XMY01032"));
			 * object.setEmissionDescription(mapValues.get("bien_ban@XMY01032_text"));
			 */

			try {
				object.setSafetyTestReportNo(mapValues.get("bien_ban@bb_bao_cao_ket_qua_thu_nghiem"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem"))
						&& mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem").length() > 9) {
					object.setSafetyTestReportDate(
							parseStringToDate(mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem")));
				} // Chua xuat hien trong data bien ban
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setEmissionTestReportNo(mapValues.get("bien_ban@bb_bao_cao_ket_qua_thu_nghiem_lien_quan"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem_lien_quan"))
						&& mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem_lien_quan").length() > 9) {
					object.setEmissionTestReportDate(parseStringToDate(
							mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem_lien_quan")));
				} // Chua xuat hien trong data bien ban
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setOtherTestReportNo(mapValues.get("bien_ban@bb_bien_ban_kiem_tra_xac_nhan"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_ngay_cap_bien_ban_kiem_tra_xac_nhan"))
						&& mapValues.get("bien_ban@bb_ngay_cap_bien_ban_kiem_tra_xac_nhan").length() > 9) {
					object.setOtherTestReportDate(
							parseStringToDate(mapValues.get("bien_ban@bb_ngay_cap_bien_ban_kiem_tra_xac_nhan")));
				} // Chua xuat hien trong data bien ban
			} catch (Exception e) {
				_log.debug(e);
			}

			// Chi ap dung voi Chung nhan chat luong linh kien
			// so_to_khai ngay_mo_to_khai nuoc_san_xuat
			try {
				object.setCustomsDeclarationNo(mapValues.get("bien_ban@bb_LKXMY0401"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_LKXMY0402"))
						&& mapValues.get("bien_ban@bb_LKXMY0402").length() > 9) {
					object.setCustomsDeclarationDate(parseStringToDate(mapValues.get("bien_ban@bb_LKXMY0402")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				// Chua xuat hien trong data bien ban
				object.setDesignSymbol(Validator.isNotNull(mapValues.get("bien_ban@bb_XMY01026"))
						? mapValues.get("bien_ban@bb_XMY01026")
						: Validator.isNotNull(mapValues.get("bien_ban@so_to_khai"))
								? mapValues.get("bien_ban@so_to_khai")
								: null);
				object.setProductionCountry(Validator.isNotNull(mapValues.get("bien_ban@bb_LKXMY0405"))
						? mapValues.get("bien_ban@bb_LKXMY0405")
						: Validator.isNotNull(mapValues.get("bien_ban@nuoc_san_xuat"))
								? mapValues.get("bien_ban@nuoc_san_xuat")
								: null);
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_LKXMY0404"))
						&& mapValues.get("bien_ban@bb_LKXMY0404").length() > 0) {
					object.setImporterQuantity(Long.valueOf(mapValues.get("bien_ban@bb_LKXMY0404")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setInspectionRecordNo(mapValues.get("bien_ban@so_bien_ban"));
			try {
				object.setInspectionSite(mapValues.get("bien_ban@bb_XMY01008"));
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra"))
						&& mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setInspectionDate(parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				object.setInspectionDistrictCode(objVRProductionPlant.getProductionPlantDistrictCode());
				object.setInspectionDistrictName(objVRProductionPlant.getProductionPlantDistrictName());
				object.setInspectionProvinceCode(objVRProductionPlant.getProductionPlantProvinceCode());
				object.setInspectionProvinceName(objVRProductionPlant.getProductionPlantProvinceName());
			}

			// object.setCorporationId(mapValues.get("bien_ban@workingUnitId"));
			object.setInspectorId(Long.valueOf(mapValues.get("bien_ban@dang_kiem_vien_chinh_userId")));
			object.setRemarks(mapValues.get(""));
			object.setInspectionNote(mapValues.get(""));

			object.setModule("04"); // 04: Chung nhan chat luong linh kien

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXCG_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date applicantIdDate, VRApplicantProfile appProfile,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();
			boolean flagUpdate = true;

			VRVehicleTypeCertificate object = new VRVehicleTypeCertificateImpl();
			List<VRVehicleTypeCertificate> lsVRVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
					.findByDeliverableCode(dossierFile.getDeliverableCode());
			if (Validator.isNotNull(lsVRVehicleTypeCertificate) && lsVRVehicleTypeCertificate.size() > 0) {
				if (Validator.isNotNull(lsVRVehicleTypeCertificate.get(0))
						&& lsVRVehicleTypeCertificate.get(0).getModule().contains("03")) {
					object = lsVRVehicleTypeCertificate.get(0);
					flagUpdate = true;
				} else {
					flagUpdate = false;
					long vrVehicleTypeCertificateId = counterLocalService
							.increment(VRVehicleTypeCertificate.class.getName());
					object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
				}
			} else {
				flagUpdate = false;
				long vrVehicleTypeCertificateId = counterLocalService
						.increment(VRVehicleTypeCertificate.class.getName());
				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}
			object.setMtCore(1);
			object.setModifyDate(new Date());
			object.setSyncDate(new Date());
			if (appProfile != null) {
				object.setApplicantIdNo(appProfile.getApplicantCode());
				object.setApplicantIdDate(applicantIdDate);
				object.setApplicantName(appProfile.getApplicantName());
				object.setApplicantAddress(appProfile.getApplicantAddress());
				object.setApplicantRepresentative(appProfile.getApplicantRepresentative());
				object.setApplicantRepresentativeTitle(appProfile.getApplicantRepresentativeTitle());
				object.setApplicantEmail(appProfile.getApplicantEmail());
				object.setApplicantPhone(appProfile.getApplicantPhone());
				object.setApplicantFax(mapValues.get(""));
				object.setApplicantContactName(mapValues.get("chungchi@bb_XCG01013"));
				object.setApplicantContactEmail(mapValues.get("chungchi@bb_XCG01012"));
				object.setApplicantcontactPhone(mapValues.get("chungchi@bb_XCG01014"));
				object.setCityCode(appProfile.getApplicantCity());

			} else {
				return object;
			}
			VRDossier objDossier = new VRDossierImpl();
			if (dossierFile != null) {
				object.setDossierId(dossierFile.getDossierId());
				object.setDeliverableCode(dossierFile.getDeliverableCode());
				objDossier = VRDossierLocalServiceUtil.fetchVRDossier(dossierFile.getDossierId());
			}
			object.setDossierType(mapValues.get("bien_ban@bb_XCG01019"));

			object.setConvertassembleId(0);

			if (Validator.isNotNull(objDossier)) {
				object.setDossierNo(objDossier.getDossierNo());
				object.setReferenceUid(objDossier.getReferenceUid());
				object.setServiceCode(objDossier.getServiceCode());
				object.setServiceName(objDossier.getServiceName());
				object.setRegisteredNumber(mapValues.get("ma_ho_so"));
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setManufacturerForeignCode(mapValues.get(""));
			 * object.setManufacturerName(mapValues.get(""));
			 * object.setManufacturerAddress(mapValues.get(""));
			 * object.setManufacturerRepresentative(mapValues.get(""));
			 * object.setManufacturerRepresentativeTitle(mapValues.get(""));
			 * object.setManufacturerEmail(mapValues.get(""));
			 * object.setManufacturerPhone(mapValues.get(""));
			 * object.setManufacturerFax(mapValues.get(""));
			 */

			String productionPlantCode = mapValues.get("bien_ban@bb_XCG01007");

			VRProductionPlant objVRProductionPlant = new VRProductionPlantImpl();
			try {
				long productionPlantRegistrationId = Long.parseLong(productionPlantCode);

				List<VRProductionPlant> lstVRProductionPlant = VRProductionPlantLocalServiceUtil
						.findByRegistrationFormId(1, appProfile.getId(), productionPlantRegistrationId);
				if (Validator.isNotNull(lstVRProductionPlant) && lstVRProductionPlant.size() > 0) {
					objVRProductionPlant = lstVRProductionPlant.get(0);
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				productionPlantCode = objVRProductionPlant.getProductionPlantCode();
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantName(objVRProductionPlant.getProductionPlantName());
				object.setProductionPlantAddress(objVRProductionPlant.getProductionPlantAddress());
				object.setProductionPlantRepresentative(mapValues.get("bien_ban@bb_XCG01009"));
				object.setProductionPlantRepresentativeTitle(mapValues.get("bien_ban@bb_XCG01010"));

			}

			try {
				object.setCopReportNo(mapValues.get("chung_chi@bb_XCG01016"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCG01017"))
						&& mapValues.get("chung_chi@bb_XCG01017").length() > 9) {
					object.setCopReportDate(parseStringToDate(mapValues.get("chung_chi@bb_XCG01017")));
				}
				object.setCopReportExpireDate(null);

				// Kiem tra hieu luc COP cho lan ke tiep
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCG01016"))
						&& mapValues.get("chung_chi@bb_XCG01016").trim().length() > 0) {
					VRCOPReportRepository objVRCOPReportRepository = VRCOPReportRepositoryLocalServiceUtil
							.findBycopReportNo(1, mapValues.get("chung_chi@bb_XCG01016").trim());
					if (Validator.isNotNull(objVRCOPReportRepository)) {
						object.setCopReportDate(objVRCOPReportRepository.getCopReportDate());
						object.setCopReportExpireDate(objVRCOPReportRepository.getCopReportExpiredDate());
					}
				}

			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setDesignerCode(""); object.setDesignerName("");
			 * object.setDesignerAddress(""); object.setDesignerRepresentative("");
			 * object.setDesignerRepresentativeTitle("");
			 *
			 * object.setDesignerEmail(""); object.setDesignerPhone("");
			 * object.setDesignerFax("");
			 * object.setDesignModelCode(mapValues.get("bien_ban@loai_hinh_thiet_ke"));
			 * object.setDesignModelDescription(mapValues.get(
			 * "bien_ban@loai_hinh_thiet_ke_text"));
			 */

			try {
				object.setVerificationCertificateNo(mapValues.get("chung_chi@bb_XCG01024"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCG01025"))
						&& mapValues.get("chung_chi@bb_XCG01025").length() > 9) {
					object.setVerificationCertificateDate(parseStringToDate(mapValues.get("chung_chi@bb_XCG01025")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setVerificationRefNo(mapValues.get("chung_chi@so_bien_ban"));
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra"))
						&& mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setVerificationRefDate(parseStringToDate(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setReferenceCertificateNo(mapValues.get("bien_ban@bb_XCG01020")); // Chua xuat hien trong data
																							// bien ban
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01021"))
						&& mapValues.get("bien_ban@bb_XCG01021").length() > 9) { // Chua xuat hien trong data bien ban
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("bien_ban@bb_XCG01021")));
				}

				// Mo rong: so_gcn_goc va ngay_gcn_goc;
				if (mapValues.get("chung_chi@so_gcn_goc").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_goc"))
						&& mapValues.get("chung_chi@ngay_gcn_goc").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_goc")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_gcn_goc"));
				}
				// Cap lai: so_chung_chi va ngay_gcn_cu;
				if (mapValues.get("chung_chi@so_chung_chi").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_cu"))
						&& mapValues.get("chung_chi@ngay_gcn_cu").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_cu")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_chung_chi"));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setDesignSymbol(mapValues.get("bien_ban@bb_XCG01026")); // Chua xuat hien trong data bien ban

			try {
				object.setTypeApprovalCertificateNo(mapValues.get("chung_chi@bb_XCG01027")); // Chua xuat hien trong
																								// data bien ban
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCG01028"))
						&& mapValues.get("chung_chi@bb_XCG01028").length() > 9) { // Chua xuat hien trong data bien ban
					object.setTypeApprovalCertificateDate(parseStringToDate(mapValues.get("chung_chi@bb_XCG01028")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setInspectorReceiveDate(now); object.setInspectorSubmitDate(now);
			 * object.setInspectorendorSementDate(now); object.setInspectorDeadline(now);
			 * object.setInspectorFinishDate(now); object.setInspectorCancelDate(now);
			 * object.setInspectorOrganization(mapValues.get(""));
			 * object.setInspectorDivision(mapValues.get(""));
			 * object.setInspectorSignName(mapValues.get(""));
			 * object.setInspectorSignTitle(mapValues.get(""));
			 * object.setInspectorSignPlace(mapValues.get(""));
			 */
			object.setCertificateType(mapValues.get("chung_chi@ket_luan_chung")); // 1: Giay chung nhan; 0: Thong bao
																					// khong dat

			object.setCertificateRecordNo(mapValues.get("chung_chi@so_chung_chi"));
			object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_cc_text"));
			object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
			object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
			object.setCertificateNote(mapValues.get("chung_chi@ghi_chu_in_chung_chi"));
			try {
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_cap_cc"))
						&& mapValues.get("chung_chi@ngay_cap_cc").length() > 9) {
					object.setCertificateRecordDate(parseStringToDate(mapValues.get("chung_chi@ngay_cap_cc")));
				}
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_het_han_gcn"))
						&& mapValues.get("chung_chi@ngay_het_han_gcn").length() > 9) {
					object.setCertificateRecordExpireDate(
							parseStringToDate(mapValues.get("chung_chi@ngay_het_han_gcn")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setExpiredStatus("1");
			object.setCertificateRecordStatus("2");
			object.setDigitalIssueStatus("0");
			object.setVehicleClass("XCG");
			object.setCertifiedVehicleType(mapValues.get("bien_ban@bb_XCG01050"));
			object.setCertifiedVehicleTypeDescription(mapValues.get("bien_ban@bb_XCG01050_text"));
			object.setCertifiedTrademark(mapValues.get("bien_ban@bb_XCG01051"));
			object.setCertifiedTrademarkName(mapValues.get("bien_ban@bb_XCG01051_text"));
			object.setCertifiedCommercialName(mapValues.get("bien_ban@bb_XCG01052"));
			object.setCertifiedModelCode(mapValues.get("bien_ban@bb_XCG01053"));
			//
			object.setCertifiedAssemblyType(mapValues.get("bien_ban@bb_XCG01049"));
			object.setCertifiedAssemblyTypeDescription(mapValues.get("bien_ban@bb_XCG01049_text"));
			object.setCertifiedVINNo(mapValues.get("bien_ban@bb_XCG01055"));
			object.setCertifiedVINPosition(mapValues.get("bien_ban@bb_XCG01056"));
			object.setCertifiedFrameNo(mapValues.get("bien_ban@bb_XCG01057"));
			// object.setCertifiedFrameAttachPlace(mapValues.get(""));
			object.setCertifiedFramePosition(mapValues.get("bien_ban@bb_XCG01058"));
			object.setCertifiedEngineNo(mapValues.get("bien_ban@bb_XCG01059"));
			// object.setCertifiedEngineAttachPlace(mapValues.get(""));
			object.setCertifiedEnginePosition(mapValues.get("bien_ban@bb_XCG01060"));

			object.setCommonSafetyStandard(mapValues.get("bien_ban@bb_XCG01031"));
			object.setEmissionStandard(mapValues.get("bien_ban@bb_XCG01032"));
			object.setCommonSafetyDescription(mapValues.get("bien_ban@XCG01031_text"));
			object.setEmissionDescription(mapValues.get("bien_ban@XCG01032_text"));

			try {
				object.setSafetyTestReportNo(mapValues.get("bien_ban@bb_XCG01034"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01035"))
						&& mapValues.get("bien_ban@bb_XCG01035").length() > 9) {
					object.setSafetyTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCG01035")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setEmissionTestReportNo(mapValues.get("bien_ban@bb_XCG01040"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01041"))
						&& mapValues.get("bien_ban@bb_XCG01041").length() > 9) {
					object.setEmissionTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCG01041")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setOtherTestReportNo(mapValues.get("bien_ban@bb_XCG01046"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01047"))
						&& mapValues.get("bien_ban@bb_XCG01047").length() > 9) {
					object.setOtherTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCG01047")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setSampleFrameNo(mapValues.get("bien_ban@bb_XCG01062"));
			object.setSampleVINNo(mapValues.get("bien_ban@bb_XCG01062"));
			object.setSampleEngineNo(mapValues.get("bien_ban@bb_XCG01063"));
			object.setSampleVehicleType(mapValues.get("bien_ban@bb_XCG01066"));
			object.setSampleVehicleTypeDescription(mapValues.get("bien_ban@bb_XCG01066_text"));
			object.setSampleTrademark(mapValues.get("bien_ban@bb_XCG01067"));
			object.setSampleTrademarkName(mapValues.get("bien_ban@bb_XCG01067_text"));
			object.setSampleCommercialName(mapValues.get("bien_ban@bb_XCG01068"));
			object.setSampleModelCode(mapValues.get("bien_ban@bb_XCG01069"));

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setCustomsDeclarationNo(mapValues.get(""));
			 * object.setCustomsDeclarationDate(now);
			 * object.setProductionCountry(mapValues.get(""));
			 * object.setImporterQuantity(Long.valueOf(mapValues.get("")));
			 */
			object.setInspectionRecordNo(mapValues.get("bien_ban@so_bien_ban"));
			try {
				object.setInspectionSite(mapValues.get("bien_ban@bb_XCG01008"));
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra"))
						&& mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setInspectionDate(parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				object.setInspectionDistrictCode(objVRProductionPlant.getProductionPlantDistrictCode());
				object.setInspectionDistrictName(objVRProductionPlant.getProductionPlantDistrictName());
				object.setInspectionProvinceCode(objVRProductionPlant.getProductionPlantProvinceCode());
				object.setInspectionProvinceName(objVRProductionPlant.getProductionPlantProvinceName());
			}

			// object.setCorporationId(mapValues.get("bien_ban@workingUnitId"));
			object.setInspectorId(Long.valueOf(mapValues.get("bien_ban@dang_kiem_vien_chinh_userId")));
			object.setRemarks(mapValues.get(""));
			object.setInspectionNote(mapValues.get(""));

			object.setModule("03"); // 03: Chung nhan chat luong kieu loai toan xe

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXMTGM_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date applicantIdDate, VRApplicantProfile appProfile,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();
			boolean flagUpdate = true;

			VRVehicleTypeCertificate object = new VRVehicleTypeCertificateImpl();
			List<VRVehicleTypeCertificate> lsVRVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
					.findByDeliverableCode(dossierFile.getDeliverableCode());
			if (Validator.isNotNull(lsVRVehicleTypeCertificate) && lsVRVehicleTypeCertificate.size() > 0) {
				if (Validator.isNotNull(lsVRVehicleTypeCertificate.get(0))
						&& lsVRVehicleTypeCertificate.get(0).getModule().contains("03")) {
					object = lsVRVehicleTypeCertificate.get(0);
					flagUpdate = true;
				} else {
					flagUpdate = false;
					long vrVehicleTypeCertificateId = counterLocalService
							.increment(VRVehicleTypeCertificate.class.getName());
					object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
				}
			} else {
				flagUpdate = false;
				long vrVehicleTypeCertificateId = counterLocalService
						.increment(VRVehicleTypeCertificate.class.getName());
				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}
			object.setMtCore(1);
			object.setModifyDate(new Date());
			object.setSyncDate(new Date());
			if (appProfile != null) {
				object.setApplicantIdNo(appProfile.getApplicantCode());
				object.setApplicantIdDate(applicantIdDate);
				object.setApplicantName(appProfile.getApplicantName());
				object.setApplicantAddress(appProfile.getApplicantAddress());
				object.setApplicantRepresentative(appProfile.getApplicantRepresentative());
				object.setApplicantRepresentativeTitle(appProfile.getApplicantRepresentativeTitle());
				object.setApplicantEmail(appProfile.getApplicantEmail());
				object.setApplicantPhone(appProfile.getApplicantPhone());
				object.setApplicantFax(mapValues.get(""));
				object.setApplicantContactName(mapValues.get("chungchi@bb_XMY01013"));
				object.setApplicantContactEmail(mapValues.get("chungchi@bb_XMY01012"));
				object.setApplicantcontactPhone(mapValues.get("chungchi@bb_XMY01014"));
				object.setCityCode(appProfile.getApplicantCity());

			} else {
				return object;
			}
			VRDossier objDossier = new VRDossierImpl();
			if (dossierFile != null) {
				object.setDossierId(dossierFile.getDossierId());
				object.setDeliverableCode(dossierFile.getDeliverableCode());
				objDossier = VRDossierLocalServiceUtil.fetchVRDossier(dossierFile.getDossierId());
			}
			object.setDossierType(mapValues.get("bien_ban@bb_XMY01019"));

			object.setConvertassembleId(0);

			if (Validator.isNotNull(objDossier)) {
				object.setDossierNo(objDossier.getDossierNo());
				object.setReferenceUid(objDossier.getReferenceUid());
				object.setServiceCode(objDossier.getServiceCode());
				object.setServiceName(objDossier.getServiceName());
				object.setRegisteredNumber(mapValues.get("ma_ho_so"));
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setManufacturerForeignCode(mapValues.get(""));
			 * object.setManufacturerName(mapValues.get(""));
			 * object.setManufacturerAddress(mapValues.get(""));
			 * object.setManufacturerRepresentative(mapValues.get(""));
			 * object.setManufacturerRepresentativeTitle(mapValues.get(""));
			 * object.setManufacturerEmail(mapValues.get(""));
			 * object.setManufacturerPhone(mapValues.get(""));
			 * object.setManufacturerFax(mapValues.get(""));
			 */

			String productionPlantCode = mapValues.get("bien_ban@bb_XMY01007");

			VRProductionPlant objVRProductionPlant = new VRProductionPlantImpl();
			try {
				long productionPlantRegistrationId = Long.parseLong(productionPlantCode);

				List<VRProductionPlant> lstVRProductionPlant = VRProductionPlantLocalServiceUtil
						.findByRegistrationFormId(1, appProfile.getId(), productionPlantRegistrationId);
				if (Validator.isNotNull(lstVRProductionPlant) && lstVRProductionPlant.size() > 0) {
					objVRProductionPlant = lstVRProductionPlant.get(0);
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				productionPlantCode = objVRProductionPlant.getProductionPlantCode();
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantName(objVRProductionPlant.getProductionPlantName());
				object.setProductionPlantAddress(objVRProductionPlant.getProductionPlantAddress());
				object.setProductionPlantRepresentative(mapValues.get("bien_ban@bb_XMY01009"));
				object.setProductionPlantRepresentativeTitle(mapValues.get("bien_ban@bb_XMY01010"));

			}

			try {
				object.setCopReportNo(mapValues.get("chung_chi@bb_XMY01016"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XMY01017"))
						&& mapValues.get("chung_chi@bb_XMY01017").length() > 9) {
					object.setCopReportDate(parseStringToDate(mapValues.get("chung_chi@bb_XMY01017")));
				}
				object.setCopReportExpireDate(null);

				// Kiem tra hieu luc COP cho lan ke tiep
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XMY01016"))
						&& mapValues.get("chung_chi@bb_XMY01016").trim().length() > 0) {
					VRCOPReportRepository objVRCOPReportRepository = VRCOPReportRepositoryLocalServiceUtil
							.findBycopReportNo(1, mapValues.get("chung_chi@bb_XMY01016").trim());
					if (Validator.isNotNull(objVRCOPReportRepository)) {
						object.setCopReportDate(objVRCOPReportRepository.getCopReportDate());
						object.setCopReportExpireDate(objVRCOPReportRepository.getCopReportExpiredDate());
					}
				}

			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setDesignerCode(""); object.setDesignerName("");
			 * object.setDesignerAddress(""); object.setDesignerRepresentative("");
			 * object.setDesignerRepresentativeTitle("");
			 *
			 * object.setDesignerEmail(""); object.setDesignerPhone("");
			 * object.setDesignerFax("");
			 * object.setDesignModelCode(mapValues.get("bien_ban@loai_hinh_thiet_ke"));
			 * object.setDesignModelDescription(mapValues.get(
			 * "bien_ban@loai_hinh_thiet_ke_text"));
			 */

			try {
				object.setVerificationCertificateNo(mapValues.get("chung_chi@bb_XMY01024"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XMY01025"))
						&& mapValues.get("chung_chi@bb_XMY01025").length() > 9) {
					object.setVerificationCertificateDate(parseStringToDate(mapValues.get("chung_chi@bb_XMY01025")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setVerificationRefNo(mapValues.get("chung_chi@so_bien_ban"));
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra"))
						&& mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setVerificationRefDate(parseStringToDate(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setReferenceCertificateNo(mapValues.get("bien_ban@bb_XMY01020")); // Chua xuat hien trong data
																							// bien ban
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XMY01021"))
						&& mapValues.get("bien_ban@bb_XMY01021").length() > 9) { // Chua xuat hien trong data bien ban
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("bien_ban@bb_XMY01021")));
				}

				// Mo rong: so_gcn_goc va ngay_gcn_goc;
				if (mapValues.get("chung_chi@so_gcn_goc").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_goc"))
						&& mapValues.get("chung_chi@ngay_gcn_goc").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_goc")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_gcn_goc"));
				}
				// Cap lai: so_chung_chi va ngay_gcn_cu;
				if (mapValues.get("chung_chi@so_chung_chi").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_cu"))
						&& mapValues.get("chung_chi@ngay_gcn_cu").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_cu")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_chung_chi"));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setDesignSymbol(mapValues.get("bien_ban@bb_XMY01026")); // Chua xuat hien trong data bien ban

			try {
				object.setTypeApprovalCertificateNo(mapValues.get("chung_chi@bb_XMY01027")); // Chua xuat hien trong
																								// data bien ban
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XMY01028"))
						&& mapValues.get("chung_chi@bb_XMY01028").length() > 9) { // Chua xuat hien trong data bien ban
					object.setTypeApprovalCertificateDate(parseStringToDate(mapValues.get("chung_chi@bb_XMY01028")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setInspectorReceiveDate(now); object.setInspectorSubmitDate(now);
			 * object.setInspectorendorSementDate(now); object.setInspectorDeadline(now);
			 * object.setInspectorFinishDate(now); object.setInspectorCancelDate(now);
			 * object.setInspectorOrganization(mapValues.get(""));
			 * object.setInspectorDivision(mapValues.get(""));
			 * object.setInspectorSignName(mapValues.get(""));
			 * object.setInspectorSignTitle(mapValues.get(""));
			 * object.setInspectorSignPlace(mapValues.get(""));
			 */
			object.setCertificateType(mapValues.get("chung_chi@ket_luan_chung")); // 1: Giay chung nhan; 0: Thong bao
																					// khong dat

			object.setCertificateRecordNo(mapValues.get("chung_chi@so_chung_chi"));
			object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_cc_text"));
			object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
			object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
			object.setCertificateNote(mapValues.get("chung_chi@ghi_chu_in_chung_chi"));
			try {
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_cap_cc"))
						&& mapValues.get("chung_chi@ngay_cap_cc").length() > 9) {
					object.setCertificateRecordDate(parseStringToDate(mapValues.get("chung_chi@ngay_cap_cc")));
				}
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_het_han_gcn"))
						&& mapValues.get("chung_chi@ngay_het_han_gcn").length() > 9) {
					object.setCertificateRecordExpireDate(
							parseStringToDate(mapValues.get("chung_chi@ngay_het_han_gcn")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setExpiredStatus("1");
			object.setCertificateRecordStatus("2");
			object.setDigitalIssueStatus("0");
			object.setVehicleClass("XMY");
			object.setCertifiedVehicleType(mapValues.get("bien_ban@bb_XMY01050"));
			object.setCertifiedVehicleTypeDescription(mapValues.get("bien_ban@bb_XMY01050_text"));
			object.setCertifiedTrademark(mapValues.get("bien_ban@bb_XMY01051"));
			object.setCertifiedTrademarkName(mapValues.get("bien_ban@bb_XMY01051_text"));
			object.setCertifiedCommercialName(mapValues.get("bien_ban@bb_XMY01052"));
			object.setCertifiedModelCode(mapValues.get("bien_ban@bb_XMY01053"));
			//
			object.setCertifiedAssemblyType(mapValues.get("bien_ban@bb_XMY01049"));
			object.setCertifiedAssemblyTypeDescription(mapValues.get("bien_ban@bb_XMY01049_text"));
			object.setCertifiedVINNo(mapValues.get("bien_ban@bb_XMY01055"));
			object.setCertifiedVINPosition(mapValues.get("bien_ban@bb_XMY01056"));
			object.setCertifiedFrameNo(mapValues.get("bien_ban@bb_XMY01057"));
			// object.setCertifiedFrameAttachPlace(mapValues.get(""));
			object.setCertifiedFramePosition(mapValues.get("bien_ban@bb_XMY01058"));
			object.setCertifiedEngineNo(mapValues.get("bien_ban@bb_XMY01059"));
			// object.setCertifiedEngineAttachPlace(mapValues.get(""));
			object.setCertifiedEnginePosition(mapValues.get("bien_ban@bb_XMY01060"));

			object.setCommonSafetyStandard(mapValues.get("bien_ban@bb_XMY01031"));
			object.setEmissionStandard(mapValues.get("bien_ban@bb_XMY01032"));
			object.setCommonSafetyDescription(mapValues.get("bien_ban@XMY01031_text"));
			object.setEmissionDescription(mapValues.get("bien_ban@XMY01032_text"));

			try {
				object.setSafetyTestReportNo(mapValues.get("bien_ban@bb_XMY01034"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XMY01035"))
						&& mapValues.get("bien_ban@bb_XMY01035").length() > 9) {
					object.setSafetyTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XMY01035")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setEmissionTestReportNo(mapValues.get("bien_ban@bb_XMY01040"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XMY01041"))
						&& mapValues.get("bien_ban@bb_XMY01041").length() > 9) {
					object.setEmissionTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XMY01041")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setOtherTestReportNo(mapValues.get("bien_ban@bb_XMY01046"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XMY01047"))
						&& mapValues.get("bien_ban@bb_XMY01047").length() > 9) {
					object.setOtherTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XMY01047")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setSampleFrameNo(mapValues.get("bien_ban@bb_XMY01062"));
			object.setSampleVINNo(mapValues.get("bien_ban@bb_XMY01062"));
			object.setSampleEngineNo(mapValues.get("bien_ban@bb_XMY01063"));
			object.setSampleVehicleType(mapValues.get("bien_ban@bb_XMY01066"));
			object.setSampleVehicleTypeDescription(mapValues.get("bien_ban@bb_XMY01066_text"));
			object.setSampleTrademark(mapValues.get("bien_ban@bb_XMY01067"));
			object.setSampleTrademarkName(mapValues.get("bien_ban@bb_XMY01067_text"));
			object.setSampleCommercialName(mapValues.get("bien_ban@bb_XMY01068"));
			object.setSampleModelCode(mapValues.get("bien_ban@bb_XMY01069"));

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setCustomsDeclarationNo(mapValues.get(""));
			 * object.setCustomsDeclarationDate(now);
			 * object.setProductionCountry(mapValues.get(""));
			 * object.setImporterQuantity(Long.valueOf(mapValues.get("")));
			 */
			object.setInspectionRecordNo(mapValues.get("bien_ban@so_bien_ban"));
			try {
				object.setInspectionSite(mapValues.get("bien_ban@bb_XMY01008"));
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra"))
						&& mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setInspectionDate(parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				object.setInspectionDistrictCode(objVRProductionPlant.getProductionPlantDistrictCode());
				object.setInspectionDistrictName(objVRProductionPlant.getProductionPlantDistrictName());
				object.setInspectionProvinceCode(objVRProductionPlant.getProductionPlantProvinceCode());
				object.setInspectionProvinceName(objVRProductionPlant.getProductionPlantProvinceName());
			}

			// object.setCorporationId(mapValues.get("bien_ban@workingUnitId"));
			object.setInspectorId(Long.valueOf(mapValues.get("bien_ban@dang_kiem_vien_chinh_userId")));
			object.setRemarks(mapValues.get(""));
			object.setInspectionNote(mapValues.get(""));

			object.setModule("03"); // 03: Chung nhan chat luong kieu loai toan xe

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXDD_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date applicantIdDate, VRApplicantProfile appProfile,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();
			boolean flagUpdate = true;

			VRVehicleTypeCertificate object = new VRVehicleTypeCertificateImpl();
			List<VRVehicleTypeCertificate> lsVRVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
					.findByDeliverableCode(dossierFile.getDeliverableCode());
			if (Validator.isNotNull(lsVRVehicleTypeCertificate) && lsVRVehicleTypeCertificate.size() > 0) {
				if (Validator.isNotNull(lsVRVehicleTypeCertificate.get(0))
						&& lsVRVehicleTypeCertificate.get(0).getModule().contains("03")) {
					object = lsVRVehicleTypeCertificate.get(0);
					flagUpdate = true;
				} else {
					flagUpdate = false;
					long vrVehicleTypeCertificateId = counterLocalService
							.increment(VRVehicleTypeCertificate.class.getName());
					object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
				}
			} else {
				flagUpdate = false;
				long vrVehicleTypeCertificateId = counterLocalService
						.increment(VRVehicleTypeCertificate.class.getName());
				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}
			object.setMtCore(1);
			object.setModifyDate(new Date());
			object.setSyncDate(new Date());
			if (appProfile != null) {
				object.setApplicantIdNo(appProfile.getApplicantCode());
				object.setApplicantIdDate(applicantIdDate);
				object.setApplicantName(appProfile.getApplicantName());
				object.setApplicantAddress(appProfile.getApplicantAddress());
				object.setApplicantRepresentative(appProfile.getApplicantRepresentative());
				object.setApplicantRepresentativeTitle(appProfile.getApplicantRepresentativeTitle());
				object.setApplicantEmail(appProfile.getApplicantEmail());
				object.setApplicantPhone(appProfile.getApplicantPhone());
				object.setApplicantFax(mapValues.get(""));
				object.setApplicantContactName(mapValues.get("chungchi@bb_XDD01013"));
				object.setApplicantContactEmail(mapValues.get("chungchi@bb_XDD01012"));
				object.setApplicantcontactPhone(mapValues.get("chungchi@bb_XDD01014"));
				object.setCityCode(appProfile.getApplicantCity());

			} else {
				return object;
			}
			VRDossier objDossier = new VRDossierImpl();
			if (dossierFile != null) {
				object.setDossierId(dossierFile.getDossierId());
				object.setDeliverableCode(dossierFile.getDeliverableCode());
				objDossier = VRDossierLocalServiceUtil.fetchVRDossier(dossierFile.getDossierId());
			}
			object.setDossierType(mapValues.get("bien_ban@bb_XDD01019"));

			object.setConvertassembleId(0);

			if (Validator.isNotNull(objDossier)) {
				object.setDossierNo(objDossier.getDossierNo());
				object.setReferenceUid(objDossier.getReferenceUid());
				object.setServiceCode(objDossier.getServiceCode());
				object.setServiceName(objDossier.getServiceName());
				object.setRegisteredNumber(mapValues.get("ma_ho_so"));
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setManufacturerForeignCode(mapValues.get(""));
			 * object.setManufacturerName(mapValues.get(""));
			 * object.setManufacturerAddress(mapValues.get(""));
			 * object.setManufacturerRepresentative(mapValues.get(""));
			 * object.setManufacturerRepresentativeTitle(mapValues.get(""));
			 * object.setManufacturerEmail(mapValues.get(""));
			 * object.setManufacturerPhone(mapValues.get(""));
			 * object.setManufacturerFax(mapValues.get(""));
			 */

			String productionPlantCode = mapValues.get("bien_ban@bb_XDD01007");

			VRProductionPlant objVRProductionPlant = new VRProductionPlantImpl();
			try {
				long productionPlantRegistrationId = Long.parseLong(productionPlantCode);

				List<VRProductionPlant> lstVRProductionPlant = VRProductionPlantLocalServiceUtil
						.findByRegistrationFormId(1, appProfile.getId(), productionPlantRegistrationId);
				if (Validator.isNotNull(lstVRProductionPlant) && lstVRProductionPlant.size() > 0) {
					objVRProductionPlant = lstVRProductionPlant.get(0);
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				productionPlantCode = objVRProductionPlant.getProductionPlantCode();
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantName(objVRProductionPlant.getProductionPlantName());
				object.setProductionPlantAddress(objVRProductionPlant.getProductionPlantAddress());
				object.setProductionPlantRepresentative(mapValues.get("bien_ban@bb_XDD01009"));
				object.setProductionPlantRepresentativeTitle(mapValues.get("bien_ban@bb_XDD01010"));

			}

			try {
				object.setCopReportNo(mapValues.get("chung_chi@bb_XDD01016"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XDD01017"))
						&& mapValues.get("chung_chi@bb_XDD01017").length() > 9) {
					object.setCopReportDate(parseStringToDate(mapValues.get("chung_chi@bb_XDD01017")));
				}
				object.setCopReportExpireDate(null);

				// Kiem tra hieu luc COP cho lan ke tiep
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XDD01016"))
						&& mapValues.get("chung_chi@bb_XDD01016").trim().length() > 0) {
					VRCOPReportRepository objVRCOPReportRepository = VRCOPReportRepositoryLocalServiceUtil
							.findBycopReportNo(1, mapValues.get("chung_chi@bb_XDD01016").trim());
					if (Validator.isNotNull(objVRCOPReportRepository)) {
						object.setCopReportDate(objVRCOPReportRepository.getCopReportDate());
						object.setCopReportExpireDate(objVRCOPReportRepository.getCopReportExpiredDate());
					}
				}

			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setDesignerCode(""); object.setDesignerName("");
			 * object.setDesignerAddress(""); object.setDesignerRepresentative("");
			 * object.setDesignerRepresentativeTitle("");
			 *
			 * object.setDesignerEmail(""); object.setDesignerPhone("");
			 * object.setDesignerFax("");
			 * object.setDesignModelCode(mapValues.get("bien_ban@loai_hinh_thiet_ke"));
			 * object.setDesignModelDescription(mapValues.get(
			 * "bien_ban@loai_hinh_thiet_ke_text"));
			 */

			try {
				object.setVerificationCertificateNo(mapValues.get("chung_chi@bb_XDD01024"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XDD01025"))
						&& mapValues.get("chung_chi@bb_XDD01025").length() > 9) {
					object.setVerificationCertificateDate(parseStringToDate(mapValues.get("chung_chi@bb_XDD01025")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setVerificationRefNo(mapValues.get("chung_chi@so_bien_ban"));
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra"))
						&& mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setVerificationRefDate(parseStringToDate(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setReferenceCertificateNo(mapValues.get("bien_ban@bb_XDD01020")); // Chua xuat hien trong data
																							// bien ban
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XDD01021"))
						&& mapValues.get("bien_ban@bb_XDD01021").length() > 9) { // Chua xuat hien trong data bien ban
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("bien_ban@bb_XDD01021")));
				}

				// Mo rong: so_gcn_goc va ngay_gcn_goc;
				if (mapValues.get("chung_chi@so_gcn_goc").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_goc"))
						&& mapValues.get("chung_chi@ngay_gcn_goc").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_goc")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_gcn_goc"));
				}
				// Cap lai: so_chung_chi va ngay_gcn_cu;
				if (mapValues.get("chung_chi@so_chung_chi").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_cu"))
						&& mapValues.get("chung_chi@ngay_gcn_cu").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_cu")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_chung_chi"));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setDesignSymbol(mapValues.get("bien_ban@bb_XDD01026")); // Chua xuat hien trong data bien ban

			try {
				object.setTypeApprovalCertificateNo(mapValues.get("chung_chi@bb_XDD01027")); // Chua xuat hien trong
																								// data bien ban
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XDD01028"))
						&& mapValues.get("chung_chi@bb_XDD01028").length() > 9) { // Chua xuat hien trong data bien ban
					object.setTypeApprovalCertificateDate(parseStringToDate(mapValues.get("chung_chi@bb_XDD01028")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setInspectorReceiveDate(now); object.setInspectorSubmitDate(now);
			 * object.setInspectorendorSementDate(now); object.setInspectorDeadline(now);
			 * object.setInspectorFinishDate(now); object.setInspectorCancelDate(now);
			 * object.setInspectorOrganization(mapValues.get(""));
			 * object.setInspectorDivision(mapValues.get(""));
			 * object.setInspectorSignName(mapValues.get(""));
			 * object.setInspectorSignTitle(mapValues.get(""));
			 * object.setInspectorSignPlace(mapValues.get(""));
			 */
			object.setCertificateType(mapValues.get("chung_chi@ket_luan_chung")); // 1: Giay chung nhan; 0: Thong bao
																					// khong dat

			object.setCertificateRecordNo(mapValues.get("chung_chi@so_chung_chi"));
			object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_cc_text"));
			object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
			object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
			object.setCertificateNote(mapValues.get("chung_chi@ghi_chu_in_chung_chi"));
			try {
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_cap_cc"))
						&& mapValues.get("chung_chi@ngay_cap_cc").length() > 9) {
					object.setCertificateRecordDate(parseStringToDate(mapValues.get("chung_chi@ngay_cap_cc")));
				}
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_het_han_gcn"))
						&& mapValues.get("chung_chi@ngay_het_han_gcn").length() > 9) {
					object.setCertificateRecordExpireDate(
							parseStringToDate(mapValues.get("chung_chi@ngay_het_han_gcn")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setExpiredStatus("1");
			object.setCertificateRecordStatus("2");
			object.setDigitalIssueStatus("0");
			object.setVehicleClass("XDD");
			object.setCertifiedVehicleType(mapValues.get("bien_ban@bb_XDD01050"));
			object.setCertifiedVehicleTypeDescription(mapValues.get("bien_ban@bb_XDD01050_text"));
			object.setCertifiedTrademark(mapValues.get("bien_ban@bb_XDD01051"));
			object.setCertifiedTrademarkName(mapValues.get("bien_ban@bb_XDD01051_text"));
			object.setCertifiedCommercialName(mapValues.get("bien_ban@bb_XDD01052"));
			object.setCertifiedModelCode(mapValues.get("bien_ban@bb_XDD01053"));
			//
			object.setCertifiedAssemblyType(mapValues.get("bien_ban@bb_XDD01049"));
			object.setCertifiedAssemblyTypeDescription(mapValues.get("bien_ban@bb_XDD01049_text"));
			object.setCertifiedVINNo(mapValues.get("bien_ban@bb_XDD01055"));
			object.setCertifiedVINPosition(mapValues.get("bien_ban@bb_XDD01056"));
			object.setCertifiedFrameNo(mapValues.get("bien_ban@bb_XDD01057"));
			// object.setCertifiedFrameAttachPlace(mapValues.get(""));
			object.setCertifiedFramePosition(mapValues.get("bien_ban@bb_XDD01058"));
			object.setCertifiedEngineNo(mapValues.get("bien_ban@bb_XDD01059"));
			// object.setCertifiedEngineAttachPlace(mapValues.get(""));
			object.setCertifiedEnginePosition(mapValues.get("bien_ban@bb_XDD01060"));

			object.setCommonSafetyStandard(mapValues.get("bien_ban@bb_XDD01031"));
			object.setEmissionStandard(mapValues.get("bien_ban@bb_XDD01032"));
			object.setCommonSafetyDescription(mapValues.get("bien_ban@XDD01031_text"));
			object.setEmissionDescription(mapValues.get("bien_ban@XDD01032_text"));

			try {
				object.setSafetyTestReportNo(mapValues.get("bien_ban@bb_XDD01034"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XDD01035"))
						&& mapValues.get("bien_ban@bb_XDD01035").length() > 9) {
					object.setSafetyTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XDD01035")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setEmissionTestReportNo(mapValues.get("bien_ban@bb_XDD01040"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XDD01041"))
						&& mapValues.get("bien_ban@bb_XDD01041").length() > 9) {
					object.setEmissionTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XDD01041")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setOtherTestReportNo(mapValues.get("bien_ban@bb_XDD01046"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XDD01047"))
						&& mapValues.get("bien_ban@bb_XDD01047").length() > 9) {
					object.setOtherTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XDD01047")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setSampleFrameNo(mapValues.get("bien_ban@bb_XDD01062"));
			object.setSampleVINNo(mapValues.get("bien_ban@bb_XDD01062"));
			object.setSampleEngineNo(mapValues.get("bien_ban@bb_XDD01063"));
			object.setSampleVehicleType(mapValues.get("bien_ban@bb_XDD01066"));
			object.setSampleVehicleTypeDescription(mapValues.get("bien_ban@bb_XDD01066_text"));
			object.setSampleTrademark(mapValues.get("bien_ban@bb_XDD01067"));
			object.setSampleTrademarkName(mapValues.get("bien_ban@bb_XDD01067_text"));
			object.setSampleCommercialName(mapValues.get("bien_ban@bb_XDD01068"));
			object.setSampleModelCode(mapValues.get("bien_ban@bb_XDD01069"));

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setCustomsDeclarationNo(mapValues.get(""));
			 * object.setCustomsDeclarationDate(now);
			 * object.setProductionCountry(mapValues.get(""));
			 * object.setImporterQuantity(Long.valueOf(mapValues.get("")));
			 */
			object.setInspectionRecordNo(mapValues.get("bien_ban@so_bien_ban"));
			try {
				object.setInspectionSite(mapValues.get("bien_ban@bb_XDD01008"));
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra"))
						&& mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setInspectionDate(parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				object.setInspectionDistrictCode(objVRProductionPlant.getProductionPlantDistrictCode());
				object.setInspectionDistrictName(objVRProductionPlant.getProductionPlantDistrictName());
				object.setInspectionProvinceCode(objVRProductionPlant.getProductionPlantProvinceCode());
				object.setInspectionProvinceName(objVRProductionPlant.getProductionPlantProvinceName());
			}

			// object.setCorporationId(mapValues.get("bien_ban@workingUnitId"));
			object.setInspectorId(Long.valueOf(mapValues.get("bien_ban@dang_kiem_vien_chinh_userId")));
			object.setRemarks(mapValues.get(""));
			object.setInspectionNote(mapValues.get(""));

			object.setModule("03"); // 03: Chung nhan chat luong kieu loai toan xe

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXBBCN_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date applicantIdDate, VRApplicantProfile appProfile,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();
			boolean flagUpdate = true;

			VRVehicleTypeCertificate object = new VRVehicleTypeCertificateImpl();
			List<VRVehicleTypeCertificate> lsVRVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
					.findByDeliverableCode(dossierFile.getDeliverableCode());
			if (Validator.isNotNull(lsVRVehicleTypeCertificate) && lsVRVehicleTypeCertificate.size() > 0) {
				if (Validator.isNotNull(lsVRVehicleTypeCertificate.get(0))
						&& lsVRVehicleTypeCertificate.get(0).getModule().contains("03")) {
					object = lsVRVehicleTypeCertificate.get(0);
					flagUpdate = true;
				} else {
					flagUpdate = false;
					long vrVehicleTypeCertificateId = counterLocalService
							.increment(VRVehicleTypeCertificate.class.getName());
					object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
				}
			} else {
				flagUpdate = false;
				long vrVehicleTypeCertificateId = counterLocalService
						.increment(VRVehicleTypeCertificate.class.getName());
				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}
			object.setMtCore(1);
			object.setModifyDate(new Date());
			object.setSyncDate(new Date());
			if (appProfile != null) {
				object.setApplicantIdNo(appProfile.getApplicantCode());
				object.setApplicantIdDate(applicantIdDate);
				object.setApplicantName(appProfile.getApplicantName());
				object.setApplicantAddress(appProfile.getApplicantAddress());
				object.setApplicantRepresentative(appProfile.getApplicantRepresentative());
				object.setApplicantRepresentativeTitle(appProfile.getApplicantRepresentativeTitle());
				object.setApplicantEmail(appProfile.getApplicantEmail());
				object.setApplicantPhone(appProfile.getApplicantPhone());
				object.setApplicantFax(mapValues.get(""));
				object.setApplicantContactName(mapValues.get("chungchi@bb_XCN01013"));
				object.setApplicantContactEmail(mapValues.get("chungchi@bb_XCN01012"));
				object.setApplicantcontactPhone(mapValues.get("chungchi@bb_XCN01014"));
				object.setCityCode(appProfile.getApplicantCity());

			} else {
				return object;
			}
			VRDossier objDossier = new VRDossierImpl();
			if (dossierFile != null) {
				object.setDossierId(dossierFile.getDossierId());
				object.setDeliverableCode(dossierFile.getDeliverableCode());
				objDossier = VRDossierLocalServiceUtil.fetchVRDossier(dossierFile.getDossierId());
			}
			object.setDossierType(mapValues.get("bien_ban@bb_XCN01019"));

			object.setConvertassembleId(0);

			if (Validator.isNotNull(objDossier)) {
				object.setDossierNo(objDossier.getDossierNo());
				object.setReferenceUid(objDossier.getReferenceUid());
				object.setServiceCode(objDossier.getServiceCode());
				object.setServiceName(objDossier.getServiceName());
				object.setRegisteredNumber(mapValues.get("ma_ho_so"));
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setManufacturerForeignCode(mapValues.get(""));
			 * object.setManufacturerName(mapValues.get(""));
			 * object.setManufacturerAddress(mapValues.get(""));
			 * object.setManufacturerRepresentative(mapValues.get(""));
			 * object.setManufacturerRepresentativeTitle(mapValues.get(""));
			 * object.setManufacturerEmail(mapValues.get(""));
			 * object.setManufacturerPhone(mapValues.get(""));
			 * object.setManufacturerFax(mapValues.get(""));
			 */

			String productionPlantCode = mapValues.get("bien_ban@bb_XCN01007");

			VRProductionPlant objVRProductionPlant = new VRProductionPlantImpl();
			try {
				long productionPlantRegistrationId = Long.parseLong(productionPlantCode);

				List<VRProductionPlant> lstVRProductionPlant = VRProductionPlantLocalServiceUtil
						.findByRegistrationFormId(1, appProfile.getId(), productionPlantRegistrationId);
				if (Validator.isNotNull(lstVRProductionPlant) && lstVRProductionPlant.size() > 0) {
					objVRProductionPlant = lstVRProductionPlant.get(0);
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				productionPlantCode = objVRProductionPlant.getProductionPlantCode();
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantName(objVRProductionPlant.getProductionPlantName());
				object.setProductionPlantAddress(objVRProductionPlant.getProductionPlantAddress());
				object.setProductionPlantRepresentative(mapValues.get("bien_ban@bb_XCN01009"));
				object.setProductionPlantRepresentativeTitle(mapValues.get("bien_ban@bb_XCN01010"));

			}

			try {
				object.setCopReportNo(mapValues.get("chung_chi@bb_XCN01016"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCN01017"))
						&& mapValues.get("chung_chi@bb_XCN01017").length() > 9) {
					object.setCopReportDate(parseStringToDate(mapValues.get("chung_chi@bb_XCN01017")));
				}
				object.setCopReportExpireDate(null);

				// Kiem tra hieu luc COP cho lan ke tiep
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCN01016"))
						&& mapValues.get("chung_chi@bb_XCN01016").trim().length() > 0) {
					VRCOPReportRepository objVRCOPReportRepository = VRCOPReportRepositoryLocalServiceUtil
							.findBycopReportNo(1, mapValues.get("chung_chi@bb_XCN01016").trim());
					if (Validator.isNotNull(objVRCOPReportRepository)) {
						object.setCopReportDate(objVRCOPReportRepository.getCopReportDate());
						object.setCopReportExpireDate(objVRCOPReportRepository.getCopReportExpiredDate());
					}
				}

			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setDesignerCode(""); object.setDesignerName("");
			 * object.setDesignerAddress(""); object.setDesignerRepresentative("");
			 * object.setDesignerRepresentativeTitle("");
			 *
			 * object.setDesignerEmail(""); object.setDesignerPhone("");
			 * object.setDesignerFax("");
			 * object.setDesignModelCode(mapValues.get("bien_ban@loai_hinh_thiet_ke"));
			 * object.setDesignModelDescription(mapValues.get(
			 * "bien_ban@loai_hinh_thiet_ke_text"));
			 */

			try {
				object.setVerificationCertificateNo(mapValues.get("chung_chi@bb_XCN01024"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCN01025"))
						&& mapValues.get("chung_chi@bb_XCN01025").length() > 9) {
					object.setVerificationCertificateDate(parseStringToDate(mapValues.get("chung_chi@bb_XCN01025")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setVerificationRefNo(mapValues.get("chung_chi@so_bien_ban"));
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra"))
						&& mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setVerificationRefDate(parseStringToDate(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setReferenceCertificateNo(mapValues.get("bien_ban@bb_XCN01020")); // Chua xuat hien trong data
																							// bien ban
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCN01021"))
						&& mapValues.get("bien_ban@bb_XCN01021").length() > 9) { // Chua xuat hien trong data bien ban
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("bien_ban@bb_XCN01021")));
				}

				// Mo rong: so_gcn_goc va ngay_gcn_goc;
				if (mapValues.get("chung_chi@so_gcn_goc").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_goc"))
						&& mapValues.get("chung_chi@ngay_gcn_goc").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_goc")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_gcn_goc"));
				}
				// Cap lai: so_chung_chi va ngay_gcn_cu;
				if (mapValues.get("chung_chi@so_chung_chi").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_cu"))
						&& mapValues.get("chung_chi@ngay_gcn_cu").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_cu")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_chung_chi"));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setDesignSymbol(mapValues.get("bien_ban@bb_XCN01026")); // Chua xuat hien trong data bien ban

			try {
				object.setTypeApprovalCertificateNo(mapValues.get("chung_chi@bb_XCN01027")); // Chua xuat hien trong
																								// data bien ban
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCN01028"))
						&& mapValues.get("chung_chi@bb_XCN01028").length() > 9) { // Chua xuat hien trong data bien ban
					object.setTypeApprovalCertificateDate(parseStringToDate(mapValues.get("chung_chi@bb_XCN01028")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setInspectorReceiveDate(now); object.setInspectorSubmitDate(now);
			 * object.setInspectorendorSementDate(now); object.setInspectorDeadline(now);
			 * object.setInspectorFinishDate(now); object.setInspectorCancelDate(now);
			 * object.setInspectorOrganization(mapValues.get(""));
			 * object.setInspectorDivision(mapValues.get(""));
			 * object.setInspectorSignName(mapValues.get(""));
			 * object.setInspectorSignTitle(mapValues.get(""));
			 * object.setInspectorSignPlace(mapValues.get(""));
			 */
			object.setCertificateType(mapValues.get("chung_chi@ket_luan_chung")); // 1: Giay chung nhan; 0: Thong bao
																					// khong dat

			object.setCertificateRecordNo(mapValues.get("chung_chi@so_chung_chi"));
			object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_cc_text"));
			object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
			object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
			object.setCertificateNote(mapValues.get("chung_chi@ghi_chu_in_chung_chi"));
			try {
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_cap_cc"))
						&& mapValues.get("chung_chi@ngay_cap_cc").length() > 9) {
					object.setCertificateRecordDate(parseStringToDate(mapValues.get("chung_chi@ngay_cap_cc")));
				}
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_het_han_gcn"))
						&& mapValues.get("chung_chi@ngay_het_han_gcn").length() > 9) {
					object.setCertificateRecordExpireDate(
							parseStringToDate(mapValues.get("chung_chi@ngay_het_han_gcn")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setExpiredStatus("1");
			object.setCertificateRecordStatus("2");
			object.setDigitalIssueStatus("0");
			object.setVehicleClass("XCN");
			object.setCertifiedVehicleType(mapValues.get("bien_ban@bb_XCN01050"));
			object.setCertifiedVehicleTypeDescription(mapValues.get("bien_ban@bb_XCN01050_text"));
			object.setCertifiedTrademark(mapValues.get("bien_ban@bb_XCN01051"));
			object.setCertifiedTrademarkName(mapValues.get("bien_ban@bb_XCN01051_text"));
			object.setCertifiedCommercialName(mapValues.get("bien_ban@bb_XCN01052"));
			object.setCertifiedModelCode(mapValues.get("bien_ban@bb_XCN01053"));
			//
			object.setCertifiedAssemblyType(mapValues.get("bien_ban@bb_XCN01049"));
			object.setCertifiedAssemblyTypeDescription(mapValues.get("bien_ban@bb_XCN01049_text"));
			object.setCertifiedVINNo(mapValues.get("bien_ban@bb_XCN01055"));
			object.setCertifiedVINPosition(mapValues.get("bien_ban@bb_XCN01056"));
			object.setCertifiedFrameNo(mapValues.get("bien_ban@bb_XCN01057"));
			// object.setCertifiedFrameAttachPlace(mapValues.get(""));
			object.setCertifiedFramePosition(mapValues.get("bien_ban@bb_XCN01058"));
			object.setCertifiedEngineNo(mapValues.get("bien_ban@bb_XCN01059"));
			// object.setCertifiedEngineAttachPlace(mapValues.get(""));
			object.setCertifiedEnginePosition(mapValues.get("bien_ban@bb_XCN01060"));

			object.setCommonSafetyStandard(mapValues.get("bien_ban@bb_XCN01031"));
			object.setEmissionStandard(mapValues.get("bien_ban@bb_XCN01032"));
			object.setCommonSafetyDescription(mapValues.get("bien_ban@XCN01031_text"));
			object.setEmissionDescription(mapValues.get("bien_ban@XCN01032_text"));

			try {
				object.setSafetyTestReportNo(mapValues.get("bien_ban@bb_XCN01034"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCN01035"))
						&& mapValues.get("bien_ban@bb_XCN01035").length() > 9) {
					object.setSafetyTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCN01035")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setEmissionTestReportNo(mapValues.get("bien_ban@bb_XCN01040"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCN01041"))
						&& mapValues.get("bien_ban@bb_XCN01041").length() > 9) {
					object.setEmissionTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCN01041")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setOtherTestReportNo(mapValues.get("bien_ban@bb_XCN01046"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCN01047"))
						&& mapValues.get("bien_ban@bb_XCN01047").length() > 9) {
					object.setOtherTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCN01047")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setSampleFrameNo(mapValues.get("bien_ban@bb_XCN01062"));
			object.setSampleVINNo(mapValues.get("bien_ban@bb_XCN01062"));
			object.setSampleEngineNo(mapValues.get("bien_ban@bb_XCN01063"));
			object.setSampleVehicleType(mapValues.get("bien_ban@bb_XCN01066"));
			object.setSampleVehicleTypeDescription(mapValues.get("bien_ban@bb_XCN01066_text"));
			object.setSampleTrademark(mapValues.get("bien_ban@bb_XCN01067"));
			object.setSampleTrademarkName(mapValues.get("bien_ban@bb_XCN01067_text"));
			object.setSampleCommercialName(mapValues.get("bien_ban@bb_XCN01068"));
			object.setSampleModelCode(mapValues.get("bien_ban@bb_XCN01069"));

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setCustomsDeclarationNo(mapValues.get(""));
			 * object.setCustomsDeclarationDate(now);
			 * object.setProductionCountry(mapValues.get(""));
			 * object.setImporterQuantity(Long.valueOf(mapValues.get("")));
			 */
			object.setInspectionRecordNo(mapValues.get("bien_ban@so_bien_ban"));
			try {
				object.setInspectionSite(mapValues.get("bien_ban@bb_XCN01008"));
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra"))
						&& mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setInspectionDate(parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				object.setInspectionDistrictCode(objVRProductionPlant.getProductionPlantDistrictCode());
				object.setInspectionDistrictName(objVRProductionPlant.getProductionPlantDistrictName());
				object.setInspectionProvinceCode(objVRProductionPlant.getProductionPlantProvinceCode());
				object.setInspectionProvinceName(objVRProductionPlant.getProductionPlantProvinceName());
			}

			// object.setCorporationId(mapValues.get("bien_ban@workingUnitId"));
			object.setInspectorId(Long.valueOf(mapValues.get("bien_ban@dang_kiem_vien_chinh_userId")));
			object.setRemarks(mapValues.get(""));
			object.setInspectionNote(mapValues.get(""));

			object.setModule("03"); // 03: Chung nhan chat luong kieu loai toan xe

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXBBCH_VehicleTypeCertificate(
			LinkedHashMap<String, String> mapValues, Date applicantIdDate, VRApplicantProfile appProfile,
			VRDossierFile dossierFile) throws PortalException, SystemException {
		try {
			Date now = new Date();
			boolean flagUpdate = true;

			VRVehicleTypeCertificate object = new VRVehicleTypeCertificateImpl();
			List<VRVehicleTypeCertificate> lsVRVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
					.findByDeliverableCode(dossierFile.getDeliverableCode());
			if (Validator.isNotNull(lsVRVehicleTypeCertificate) && lsVRVehicleTypeCertificate.size() > 0) {
				if (Validator.isNotNull(lsVRVehicleTypeCertificate.get(0))
						&& lsVRVehicleTypeCertificate.get(0).getModule().contains("03")) {
					object = lsVRVehicleTypeCertificate.get(0);
					flagUpdate = true;
				} else {
					flagUpdate = false;
					long vrVehicleTypeCertificateId = counterLocalService
							.increment(VRVehicleTypeCertificate.class.getName());
					object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
				}
			} else {
				flagUpdate = false;
				long vrVehicleTypeCertificateId = counterLocalService
						.increment(VRVehicleTypeCertificate.class.getName());
				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}
			object.setMtCore(1);
			object.setModifyDate(new Date());
			object.setSyncDate(new Date());
			if (appProfile != null) {
				object.setApplicantIdNo(appProfile.getApplicantCode());
				object.setApplicantIdDate(applicantIdDate);
				object.setApplicantName(appProfile.getApplicantName());
				object.setApplicantAddress(appProfile.getApplicantAddress());
				object.setApplicantRepresentative(appProfile.getApplicantRepresentative());
				object.setApplicantRepresentativeTitle(appProfile.getApplicantRepresentativeTitle());
				object.setApplicantEmail(appProfile.getApplicantEmail());
				object.setApplicantPhone(appProfile.getApplicantPhone());
				object.setApplicantFax(mapValues.get(""));
				object.setApplicantContactName(mapValues.get("chungchi@bb_XCH01013"));
				object.setApplicantContactEmail(mapValues.get("chungchi@bb_XCH01012"));
				object.setApplicantcontactPhone(mapValues.get("chungchi@bb_XCH01014"));
				object.setCityCode(appProfile.getApplicantCity());

			} else {
				return object;
			}
			VRDossier objDossier = new VRDossierImpl();
			if (dossierFile != null) {
				object.setDossierId(dossierFile.getDossierId());
				object.setDeliverableCode(dossierFile.getDeliverableCode());
				objDossier = VRDossierLocalServiceUtil.fetchVRDossier(dossierFile.getDossierId());
			}
			object.setDossierType(mapValues.get("bien_ban@bb_XCH01019"));

			object.setConvertassembleId(0);

			if (Validator.isNotNull(objDossier)) {
				object.setDossierNo(objDossier.getDossierNo());
				object.setReferenceUid(objDossier.getReferenceUid());
				object.setServiceCode(objDossier.getServiceCode());
				object.setServiceName(objDossier.getServiceName());
				object.setRegisteredNumber(mapValues.get("ma_ho_so"));
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setManufacturerForeignCode(mapValues.get(""));
			 * object.setManufacturerName(mapValues.get(""));
			 * object.setManufacturerAddress(mapValues.get(""));
			 * object.setManufacturerRepresentative(mapValues.get(""));
			 * object.setManufacturerRepresentativeTitle(mapValues.get(""));
			 * object.setManufacturerEmail(mapValues.get(""));
			 * object.setManufacturerPhone(mapValues.get(""));
			 * object.setManufacturerFax(mapValues.get(""));
			 */

			String productionPlantCode = mapValues.get("bien_ban@bb_XCH01007");

			VRProductionPlant objVRProductionPlant = new VRProductionPlantImpl();
			try {
				long productionPlantRegistrationId = Long.parseLong(productionPlantCode);

				List<VRProductionPlant> lstVRProductionPlant = VRProductionPlantLocalServiceUtil
						.findByRegistrationFormId(1, appProfile.getId(), productionPlantRegistrationId);
				if (Validator.isNotNull(lstVRProductionPlant) && lstVRProductionPlant.size() > 0) {
					objVRProductionPlant = lstVRProductionPlant.get(0);
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				productionPlantCode = objVRProductionPlant.getProductionPlantCode();
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantName(objVRProductionPlant.getProductionPlantName());
				object.setProductionPlantAddress(objVRProductionPlant.getProductionPlantAddress());
				object.setProductionPlantRepresentative(mapValues.get("bien_ban@bb_XCH01009"));
				object.setProductionPlantRepresentativeTitle(mapValues.get("bien_ban@bb_XCH01010"));

			}

			try {
				object.setCopReportNo(mapValues.get("chung_chi@bb_XCH01016"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCH01017"))
						&& mapValues.get("chung_chi@bb_XCH01017").length() > 9) {
					object.setCopReportDate(parseStringToDate(mapValues.get("chung_chi@bb_XCH01017")));
				}
				object.setCopReportExpireDate(null);

				// Kiem tra hieu luc COP cho lan ke tiep
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCH01016"))
						&& mapValues.get("chung_chi@bb_XCH01016").trim().length() > 0) {
					VRCOPReportRepository objVRCOPReportRepository = VRCOPReportRepositoryLocalServiceUtil
							.findBycopReportNo(1, mapValues.get("chung_chi@bb_XCH01016").trim());
					if (Validator.isNotNull(objVRCOPReportRepository)) {
						object.setCopReportDate(objVRCOPReportRepository.getCopReportDate());
						object.setCopReportExpireDate(objVRCOPReportRepository.getCopReportExpiredDate());
					}
				}

			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setDesignerCode(""); object.setDesignerName("");
			 * object.setDesignerAddress(""); object.setDesignerRepresentative("");
			 * object.setDesignerRepresentativeTitle("");
			 *
			 * object.setDesignerEmail(""); object.setDesignerPhone("");
			 * object.setDesignerFax("");
			 * object.setDesignModelCode(mapValues.get("bien_ban@loai_hinh_thiet_ke"));
			 * object.setDesignModelDescription(mapValues.get(
			 * "bien_ban@loai_hinh_thiet_ke_text"));
			 */

			try {
				object.setVerificationCertificateNo(mapValues.get("chung_chi@bb_XCH01024"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCH01025"))
						&& mapValues.get("chung_chi@bb_XCH01025").length() > 9) {
					object.setVerificationCertificateDate(parseStringToDate(mapValues.get("chung_chi@bb_XCH01025")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setVerificationRefNo(mapValues.get("chung_chi@so_bien_ban"));
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra"))
						&& mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setVerificationRefDate(parseStringToDate(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setReferenceCertificateNo(mapValues.get("bien_ban@bb_XCH01020")); // Chua xuat hien trong data
																							// bien ban
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCH01021"))
						&& mapValues.get("bien_ban@bb_XCH01021").length() > 9) { // Chua xuat hien trong data bien ban
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("bien_ban@bb_XCH01021")));
				}

				// Mo rong: so_gcn_goc va ngay_gcn_goc;
				if (mapValues.get("chung_chi@so_gcn_goc").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_goc"))
						&& mapValues.get("chung_chi@ngay_gcn_goc").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_goc")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_gcn_goc"));
				}
				// Cap lai: so_chung_chi va ngay_gcn_cu;
				if (mapValues.get("chung_chi@so_chung_chi").trim().length() > 0
						&& Validator.isNotNull(mapValues.get("chung_chi@ngay_gcn_cu"))
						&& mapValues.get("chung_chi@ngay_gcn_cu").length() > 9) {
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_gcn_cu")));
					object.setReferenceCertificateNo(mapValues.get("chung_chi@so_chung_chi"));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setDesignSymbol(mapValues.get("bien_ban@bb_XCH01026")); // Chua xuat hien trong data bien ban

			try {
				object.setTypeApprovalCertificateNo(mapValues.get("chung_chi@bb_XCH01027")); // Chua xuat hien trong
																								// data bien ban
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCH01028"))
						&& mapValues.get("chung_chi@bb_XCH01028").length() > 9) { // Chua xuat hien trong data bien ban
					object.setTypeApprovalCertificateDate(parseStringToDate(mapValues.get("chung_chi@bb_XCH01028")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setInspectorReceiveDate(now); object.setInspectorSubmitDate(now);
			 * object.setInspectorendorSementDate(now); object.setInspectorDeadline(now);
			 * object.setInspectorFinishDate(now); object.setInspectorCancelDate(now);
			 * object.setInspectorOrganization(mapValues.get(""));
			 * object.setInspectorDivision(mapValues.get(""));
			 * object.setInspectorSignName(mapValues.get(""));
			 * object.setInspectorSignTitle(mapValues.get(""));
			 * object.setInspectorSignPlace(mapValues.get(""));
			 */
			object.setCertificateType(mapValues.get("chung_chi@ket_luan_chung")); // 1: Giay chung nhan; 0: Thong bao
																					// khong dat

			object.setCertificateRecordNo(mapValues.get("chung_chi@so_chung_chi"));
			object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_cc_text"));
			object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
			object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
			object.setCertificateNote(mapValues.get("chung_chi@ghi_chu_in_chung_chi"));
			try {
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_cap_cc"))
						&& mapValues.get("chung_chi@ngay_cap_cc").length() > 9) {
					object.setCertificateRecordDate(parseStringToDate(mapValues.get("chung_chi@ngay_cap_cc")));
				}
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_het_han_gcn"))
						&& mapValues.get("chung_chi@ngay_het_han_gcn").length() > 9) {
					object.setCertificateRecordExpireDate(
							parseStringToDate(mapValues.get("chung_chi@ngay_het_han_gcn")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setExpiredStatus("1");
			object.setCertificateRecordStatus("2");
			object.setDigitalIssueStatus("0");
			object.setVehicleClass("XCH");
			object.setCertifiedVehicleType(mapValues.get("bien_ban@bb_XCH01050"));
			object.setCertifiedVehicleTypeDescription(mapValues.get("bien_ban@bb_XCH01050_text"));
			object.setCertifiedTrademark(mapValues.get("bien_ban@bb_XCH01051"));
			object.setCertifiedTrademarkName(mapValues.get("bien_ban@bb_XCH01051_text"));
			object.setCertifiedCommercialName(mapValues.get("bien_ban@bb_XCH01052"));
			object.setCertifiedModelCode(mapValues.get("bien_ban@bb_XCH01053"));
			//
			object.setCertifiedAssemblyType(mapValues.get("bien_ban@bb_XCH01049"));
			object.setCertifiedAssemblyTypeDescription(mapValues.get("bien_ban@bb_XCH01049_text"));
			object.setCertifiedVINNo(mapValues.get("bien_ban@bb_XCH01055"));
			object.setCertifiedVINPosition(mapValues.get("bien_ban@bb_XCH01056"));
			object.setCertifiedFrameNo(mapValues.get("bien_ban@bb_XCH01057"));
			// object.setCertifiedFrameAttachPlace(mapValues.get(""));
			object.setCertifiedFramePosition(mapValues.get("bien_ban@bb_XCH01058"));
			object.setCertifiedEngineNo(mapValues.get("bien_ban@bb_XCH01059"));
			// object.setCertifiedEngineAttachPlace(mapValues.get(""));
			object.setCertifiedEnginePosition(mapValues.get("bien_ban@bb_XCH01060"));

			object.setCommonSafetyStandard(mapValues.get("bien_ban@bb_XCH01031"));
			object.setEmissionStandard(mapValues.get("bien_ban@bb_XCH01032"));
			object.setCommonSafetyDescription(mapValues.get("bien_ban@XCH01031_text"));
			object.setEmissionDescription(mapValues.get("bien_ban@XCH01032_text"));

			try {
				object.setSafetyTestReportNo(mapValues.get("bien_ban@bb_XCH01034"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCH01035"))
						&& mapValues.get("bien_ban@bb_XCH01035").length() > 9) {
					object.setSafetyTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCH01035")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setEmissionTestReportNo(mapValues.get("bien_ban@bb_XCH01040"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCH01041"))
						&& mapValues.get("bien_ban@bb_XCH01041").length() > 9) {
					object.setEmissionTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCH01041")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			try {
				object.setOtherTestReportNo(mapValues.get("bien_ban@bb_XCH01046"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCH01047"))
						&& mapValues.get("bien_ban@bb_XCH01047").length() > 9) {
					object.setOtherTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCH01047")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			object.setSampleFrameNo(mapValues.get("bien_ban@bb_XCH01062"));
			object.setSampleVINNo(mapValues.get("bien_ban@bb_XCH01062"));
			object.setSampleEngineNo(mapValues.get("bien_ban@bb_XCH01063"));
			object.setSampleVehicleType(mapValues.get("bien_ban@bb_XCH01066"));
			object.setSampleVehicleTypeDescription(mapValues.get("bien_ban@bb_XCH01066_text"));
			object.setSampleTrademark(mapValues.get("bien_ban@bb_XCH01067"));
			object.setSampleTrademarkName(mapValues.get("bien_ban@bb_XCH01067_text"));
			object.setSampleCommercialName(mapValues.get("bien_ban@bb_XCH01068"));
			object.setSampleModelCode(mapValues.get("bien_ban@bb_XCH01069"));

			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			 * object.setCustomsDeclarationNo(mapValues.get(""));
			 * object.setCustomsDeclarationDate(now);
			 * object.setProductionCountry(mapValues.get(""));
			 * object.setImporterQuantity(Long.valueOf(mapValues.get("")));
			 */
			object.setInspectionRecordNo(mapValues.get("bien_ban@so_bien_ban"));
			try {
				object.setInspectionSite(mapValues.get("bien_ban@bb_XCH01008"));
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra"))
						&& mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setInspectionDate(parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}

			if (Validator.isNotNull(objVRProductionPlant)
					&& objVRProductionPlant.getProductionPlantCode().length() > 0) {
				object.setInspectionDistrictCode(objVRProductionPlant.getProductionPlantDistrictCode());
				object.setInspectionDistrictName(objVRProductionPlant.getProductionPlantDistrictName());
				object.setInspectionProvinceCode(objVRProductionPlant.getProductionPlantProvinceCode());
				object.setInspectionProvinceName(objVRProductionPlant.getProductionPlantProvinceName());
			}

			// object.setCorporationId(mapValues.get("bien_ban@workingUnitId"));
			object.setInspectorId(Long.valueOf(mapValues.get("bien_ban@dang_kiem_vien_chinh_userId")));
			object.setRemarks(mapValues.get(""));
			object.setInspectionNote(mapValues.get(""));

			object.setModule("03"); // 03: Chung nhan chat luong kieu loai toan xe

			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	private Date parseStringToDate(String strDate) {

		try {
			SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE);
			return df.parse(strDate);
		} catch (ParseException e) {

			try {
				SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE_2);
				return df.parse(strDate);
			} catch (Exception e2) {
				try {
					SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE_3);
					return df.parse(strDate);
				} catch (Exception e3) {

				}
			}

			// _log.error(e);
			return null;
		}

	}

	public List<VRVehicleTypeCertificate> findByInspectorId(long inspectorId) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByInspectorId(inspectorId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByCorporationId(String corporationId)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByCorporationId(corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(String corporationId, long inspectorId)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByInspectorIdCorporationId(corporationId, inspectorId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByServiceCode(String serviceCode)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByServiceCode(serviceCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByApplicantIdNo(String applicantIdNo)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByApplicantIdNo(applicantIdNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(String applicantIdNo,
			String productionPlantCode) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByApplicantAndProductionPlant(applicantIdNo,
					productionPlantCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByDeliverableCode(String deliverableCode)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByDeliverableCode(deliverableCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByManufacturerForeignCode(String manufacturerForeignCode)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByManufacturerForeignCode(manufacturerForeignCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByCopReportNo(String copReportNo)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByCopReportNo(copReportNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByDesignerCode(String designerCode)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByDesignerCode(designerCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByVerificationCertificateNo(String verificationCertificateNo)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByVerificationCertificateNo(verificationCertificateNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByDesignsymbol(String designSymbol)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByDesignsymbol(designSymbol);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByCertificaterecordno(String certificateRecordNo, String serviceCode)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByCertificaterecordno(certificateRecordNo, serviceCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByExpiredstatus(String expiredStatus)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByExpiredstatus(expiredStatus);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByF_EXP_STATUS(String[] expiredStatus)
			throws PortalException, SystemException {

		return vrVehicleTypeCertificatePersistence.findByF_EXP_STATUS(expiredStatus);
	}

	public List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(String expiredStatus, String serviceCode)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByExpiredstatusAndServiceCode(expiredStatus, serviceCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(String vehicleClass,
			String certifiedVehicleType, String certifiedTrademarkName, String certifiedCommercialName,
			String certifiedModelCode, String serviceCode) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByVehicletypeAndServiceCode(vehicleClass,
					certifiedVehicleType, certifiedTrademarkName, certifiedCommercialName, certifiedModelCode,
					serviceCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByCommonsafetystandard(String commonSafetyStandard)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByCommonsafetystandard(commonSafetyStandard);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByEmissionstandard(String emissionStandard)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByEmissionstandard(emissionStandard);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByInspectionRecordNo(String inspectionRecordNo)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByInspectionRecordNo(inspectionRecordNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByApplicantAndService(String serviceCode, String applicantIdNo,
			long mtCore) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByApplicantAndService(serviceCode, applicantIdNo, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public VRVehicleTypeCertificate findByDossierId_MtCore(long dossierId, long mtCore) {
		return vrVehicleTypeCertificatePersistence.fetchByDossierId(dossierId, mtCore);
	}

	public List<VRVehicleTypeCertificate> findByDossierNo_MtCore(String dossierNo, long mtCore)
			throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByDossierNo_MtCore(dossierNo, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(String serviceCode,
			String applicantIdNo, String productionPlantCode, long mtCore) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByServiceCodeAndProductionPlantCode(serviceCode,
					applicantIdNo, productionPlantCode, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(String serviceCode, String applicantIdNo,
			String productionPlantName, String productionPlantAddress) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByServiceCodeAndProductionPlant(serviceCode, applicantIdNo,
					productionPlantName, productionPlantAddress);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();

	}

	public boolean updateVRTechnicalSpec_ALL(LinkedHashMap<String, String> mapValues, long vrVehicleTypeCertificateId,
			long dossierId, String dossierIdCTN, String dossierNo, Date modifyDate, String VehicleClass,
			String deliverableCode) {
		try {
			String strChungChi = mapValues.get("bien_ban");
			String prefixSpecificationCode = "bb_";
			String specificationValue = StringPool.BLANK;

			if (VehicleClass.equalsIgnoreCase("LKXCG")) {
				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_LKXCG(strChungChi,
						vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo, modifyDate, deliverableCode);
			}

			if (VehicleClass.equalsIgnoreCase("LKXMY")) {
				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_LKXMY(strChungChi,
						vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo, modifyDate, deliverableCode);
			}

			if (VehicleClass.equalsIgnoreCase("XCG")) {
				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XCG(strChungChi,
						vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo, modifyDate, deliverableCode);
			}

			if (VehicleClass.equalsIgnoreCase("XMY")) {
				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XMY(strChungChi,
						vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo, modifyDate, deliverableCode);
			}

			if (VehicleClass.equalsIgnoreCase("XDD")) {
				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XDD(strChungChi,
						vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo, modifyDate, deliverableCode);
			}

			if (VehicleClass.equalsIgnoreCase("XCN")) {
				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XCN(strChungChi,
						vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo, modifyDate, deliverableCode);
			}

			if (VehicleClass.equalsIgnoreCase("XCH")) {
				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XCH(strChungChi,
						vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo, modifyDate, deliverableCode);
			}
		} catch (Exception e) {
			_log.debug(e);
		}
		return true;
	}

	public List<VRVehicleTypeCertificate> finByF_APP_VH_EXP(String applicantIdNo, String vehicleClass,
			String expiredStatus) {

		return vrVehicleTypeCertificatePersistence.findByF_APP_VH_EXP(applicantIdNo, vehicleClass, expiredStatus);
	}

	public List<VRVehicleTypeCertificate> finByF_APP_VH_EXP_CERTNO(String applicantIdNo, String vehicleClass,
			String expiredStatus, String certNo) {

		return vrVehicleTypeCertificatePersistence.findByF_APP_VH_EXP_CERTNO(applicantIdNo, vehicleClass, expiredStatus,
				certNo);
	}

	public List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(String applicantIdNo, String expiredStatus) {

		return vrVehicleTypeCertificatePersistence.findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatus);
	}

	public List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(String applicantIdNo, String[] expiredStatus)
			throws PortalException, SystemException {

		return vrVehicleTypeCertificatePersistence.findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatus);
	}
	
	public List<VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(String applicantIdNo, String vehicleClass,
			String expiredStatus, String serviceCode) {

		return vrVehicleTypeCertificatePersistence.findByServiceCodeVehicleClassAndApplicantIdNo(applicantIdNo, expiredStatus,
				expiredStatus, serviceCode);
	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrVehicleTypeCertificateFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start,
				end);
	}

	public long counData(String sql) throws SystemException {

		return vrVehicleTypeCertificateFinder.countData(sql);
	}

	public VRVehicleTypeCertificate createVRVehicleTypeCertificate(VRVehicleTypeCertificate object)
			throws SystemException {

		long id = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());

		object.setId(id);

		Date now = new Date();

		object.setModifyDate(now);

		return vrVehicleTypeCertificatePersistence.update(object);
	}

    public VRVehicleTypeCertificate updateVRVehicleTypeCertificate(VRVehicleTypeCertificate object, Company company) {
        try {
            Date now = new Date();
            _log.info("--------------Object: " + object);
            object.setModifyDate(now);
            _log.info("NOW: " + now);

            object = vrVehicleTypeCertificatePersistence.updateImpl(object);
            if (object != null) {
                VRVehicleTypeCertificateAction action = new VRVehicleTypeCertificateActionImpl();
                action.indexing(object, company);
            }

        } catch (Exception e) {
            _log.info("--------------error updateVRVehicleTypeCertificate : ");
        }

        return object;
    }

	public List<VRVehicleTypeCertificate> findExpiredCertificates(int day, String expiredStatus) {
		return vrVehicleTypeCertificateFinder.findExpiredVRVehicleTypeCertificates(day, expiredStatus);
	}

	public JSONObject adminProcessData(JSONObject objectData, JSONArray arrayVRVehicleSpecification,
			JSONArray arrayVRInspectionStandard, JSONArray arrayLKXCG, JSONArray arrayXCG, JSONArray arrayLKXMY,
			JSONArray arrayXMY, JSONArray arrayXCH, JSONArray arrayXCN, JSONArray arrayXDD) {
		JSONObject result = JSONFactoryUtil.createJSONObject();

		if (objectData.getLong("dossierId") > 0 && objectData.getLong("mtCore") > 0) {
			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence
					.fetchByDossierId(objectData.getLong("dossierId"), objectData.getLong("mtCore"));

			if (object == null) {
				long vrVehicleTypeCertificateId = counterLocalService
						.increment(VRVehicleTypeCertificate.class.getName());

				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}

			Date now = new Date();
			object.setSyncDate(now);
			// Add other fields
			object.setMtCore(1);
			object.setDossierType(objectData.getString("dossierType"));
			object.setDossierNo(objectData.getString("dossierNo"));
			object.setConvertassembleId(0);

			VRApplicantProfile vrApplicantProfile = vrApplicantProfileLocalService
					.findByApplicantCode(objectData.getString("applicantIdNo"));
			VRRegistration registration = vrRegistrationPersistence
					.fetchByREG_APPNO(objectData.getString("applicantIdNo"));

			VRDossier dossier = vrDossierPersistence.fetchByPrimaryKey(objectData.getLong("dossierId"));
			object.setServiceCode(dossier.getServiceCode());
			object.setServiceName(dossier.getServiceName());
			object.setReferenceUid(dossier.getReferenceUid());
			object.setDossierId(dossier.getDossierId());
			object.setDossierNo(dossier.getDossierNo());
			object.setDossierIdCTN(objectData.getString("dossierIdCTN"));

			object.setApplicantIdDate(registration.getApplicantIdDate());
			object.setApplicantTelNo(vrApplicantProfile.getApplicantPhone());
			object.setApplicantIdNo(vrApplicantProfile.getApplicantCode());
			object.setApplicantName(vrApplicantProfile.getApplicantName());
			object.setApplicantAddress(vrApplicantProfile.getApplicantAddress());
			object.setApplicantRepresentative(vrApplicantProfile.getApplicantRepresentative());
			object.setApplicantRepresentativeTitle(vrApplicantProfile.getApplicantRepresentativeTitle());
			object.setApplicantEmail(vrApplicantProfile.getApplicantEmail());
			object.setApplicantPhone(vrApplicantProfile.getApplicantPhone());
			object.setApplicantFax(vrApplicantProfile.getApplicantFax());
			object.setApplicantContactName(vrApplicantProfile.getApplicantContactName());
			object.setApplicantContactEmail(vrApplicantProfile.getApplicantContactEmail());
			object.setApplicantcontactPhone(vrApplicantProfile.getApplicantContactPhone());
			object.setApplicantcontactTelNo(vrApplicantProfile.getApplicantContactPhone());
			object.setCityCode(vrApplicantProfile.getApplicantCityCode());
			object.setCityName(vrApplicantProfile.getApplicantCity());
			object.setDistrictCode(vrApplicantProfile.getApplicantDistrictCode());
			object.setDistrictName(vrApplicantProfile.getApplicantDistrictName());
			object.setWardCode(vrApplicantProfile.getApplicantWardCode());
			object.setWardName(vrApplicantProfile.getApplicantWardName());

			object.setManufacturerForeignCode(objectData.getString("manufacturerForeignCode"));
			object.setManufacturerName(objectData.getString("manufacturerName"));
			object.setManufacturerAddress(objectData.getString("manufacturerAddress"));
			object.setManufacturerRepresentative(objectData.getString("manufacturerRepresentative"));
			object.setManufacturerRepresentativeTitle(objectData.getString("manufacturerRepresentativeTitle"));
			object.setManufacturerEmail(objectData.getString("manufacturerEmail"));
			object.setManufacturerPhone(objectData.getString("manufacturerPhone"));
			object.setManufacturerFax(objectData.getString("manufacturerFax"));

			if (Validator.isNotNull(objectData.getString("productionPlantCode"))) {
				VRProductionPlant vrProductionPlant = vrProductionPlantPersistence
						.fetchByF_ProductionPlantCode(objectData.getString("productionPlantCode"));
				if (vrProductionPlant != null) {
					object.setProductionPlantCode(vrProductionPlant.getProductionPlantCode());
					object.setProductionPlantName(vrProductionPlant.getProductionPlantName());
					object.setProductionPlantAddress(vrProductionPlant.getProductionPlantAddress());
					object.setProductionPlantRepresentative(vrProductionPlant.getProductionPlantRepresentative());
					object.setProductionPlantRepresentativeTitle(
							vrProductionPlant.getProductionPlantRepresentativeTitle());
				}
			} else {
				object.setProductionPlantCode(objectData.getString("manufacturerForeignCode"));
				object.setProductionPlantName(objectData.getString("manufacturerName"));
				object.setProductionPlantAddress(objectData.getString("manufacturerAddress"));
				object.setProductionPlantRepresentative(objectData.getString("manufacturerRepresentative"));
				object.setProductionPlantRepresentativeTitle(objectData.getString("manufacturerRepresentativeTitle"));
			}
			object.setCopReportNo(objectData.getString("copReportNo"));
			object.setCopReportDate(parseStringToDate(objectData.getString("copReportDate")));
			// object.setCopReportDate(parseStringToDate(objectData.getString("copReportExpireDate")));

			// object.setDesignerCode(registration.getApplicantIdNo().toString());
			object.setDesignerName(objectData.getString("designerName"));
			object.setDesignerAddress(objectData.getString("designerAddress"));
			object.setDesignerRepresentative(objectData.getString("designerRepresentative"));
			object.setDesignerRepresentativeTitle(objectData.getString("designerRepresentativeTitle"));

			object.setDesignerEmail(objectData.getString("designerEmail"));
			object.setDesignerPhone(objectData.getString("designerPhone"));
			object.setDesignerFax(objectData.getString("designerFax"));
			object.setVerificationCertificateNo(objectData.getString("verificationCertificateNo"));
			object.setVerificationCertificateDate(
					parseStringToDate(objectData.getString("verificationCertificateDate"))); // Action
			object.setVerificationRefNo(objectData.getString("verificationRefNo"));
			// object.setVerificationRefDate(now); //Action
			object.setTypeApprovalCertificateNo(objectData.getString("typeApprovalCertificateNo"));
			object.setTypeApprovalCertificateDate(parseStringToDate("typeApprovalCertificateDate"));
			object.setDesignModelCode(objectData.getString("designModelCode"));
			object.setDesignModelDescription(objectData.getString("designModelDescription"));
			object.setDesignSymbol(objectData.getString("designSymbol"));

			object.setRegisteredNumber(objectData.getString("registeredNumber"));
			// object.setInspectorReceiveDate(now); //Action - CNCLKL
			// object.setInspectorSubmitDate(now); //Action - CNCLKL
			// object.setInspectorendorSementDate(now); //Action
			// object.setInspectorDeadline(now); //Khong biet
			// object.setInspectorFinishDate(now); //Khong biet
			// object.setInspectorCancelDate(now); //Khong biet
			object.setInspectorOrganization(objectData.getString("inspectorOrganization"));
			object.setInspectorDivision(objectData.getString("inspectorDivision"));
			object.setCertificateType(objectData.getString("certificateType"));
			object.setReferenceCertificateNo(objectData.getString("referenceCertificateNo"));
			object.setReferenceCertificateDate(parseStringToDate(objectData.getString("referenceCertificateDate")));
			object.setCertificateRecordNo(objectData.getString("certificateRecordNo"));
			// object.setCertificateSignName(objectData.getString("certificateSignName"));
			// object.setCertificateSignTitle(objectData.getString("certificateSignTitle"));
			// object.setCertificateSignPlace(objectData.getString("certificateSignPlace"));
			object.setCertificateRecordDate(parseStringToDate(objectData.getString("certificateRecordDate")));
			// //CNCLKL
			// object.setCertificateRecordExpireDate(now); //CNCLKL
			// object.setExpiredStatus("1"); //TODO: confirm lai
			object.setCertificateRecordStatus(objectData.getString("certificateRecordStatus"));
			// object.setDigitalIssueStatus("1"); //TODO: confirm lai
			object.setVehicleClass(objectData.getString("vehicleClass"));
			object.setCertifiedVehicleType(objectData.getString("certifiedVehicleType"));
			object.setCertifiedVehicleTypeDescription(objectData.getString("certifiedVehicleTypeDescription"));
			object.setCertifiedTrademark(objectData.getString("certifiedTrademark"));
			object.setCertifiedTrademarkName(objectData.getString("certifiedTrademarkName"));
			object.setCertifiedCommercialName(objectData.getString("certifiedCommercialName"));
			object.setCertifiedModelCode(objectData.getString("certifiedModelCode"));
			object.setCertifiedAssemblyType(objectData.getString("certifiedAssemblyType"));
			object.setCertifiedAssemblyTypeDescription(objectData.getString("certifiedAssemblyTypeDescription"));
			object.setCertifiedVINNo(objectData.getString("certifiedVinNo"));
			object.setCertifiedVINPosition(objectData.getString("certifiedVinPosition"));
			object.setCertifiedFrameNo(objectData.getString("certifiedFrameNo"));
			object.setCertifiedFrameAttachPlace(objectData.getString("certifiedFrameAttachPlace"));
			object.setCertifiedFramePosition(objectData.getString("certifiedFrameAttachPlace"));
			object.setCertifiedEngineNo(objectData.getString("certifiedEngineNo"));
			object.setCertifiedEngineAttachPlace(objectData.getString("certifiedEngineAttachPlace"));
			object.setCertifiedEnginePosition(objectData.getString("certifiedEngineAttachPlace"));
			object.setSafetyTestReportNo(objectData.getString("safetyTestReportNo"));
			object.setSafetyTestReportDate(parseStringToDate(objectData.getString("safetyTestReportDate")));
			object.setEmissionTestReportNo(objectData.getString("emissionTestReportNo"));
			object.setEmissionTestReportDate(parseStringToDate(objectData.getString("emissionTestReportDate")));
			object.setCommonSafetyStandard(objectData.getString("commonSafetyStandard"));
			object.setCommonSafetyDescription(objectData.getString("commonSafetyDescription"));
			object.setEmissionStandard(objectData.getString("emissionStandard"));
			object.setEmissionDescription(objectData.getString("emissionDescription"));
			object.setOtherTestReportNo(objectData.getString("otherTestReportNo"));
			object.setOtherTestReportDate(parseStringToDate(objectData.getString("otherTestReportDate")));
			object.setSampleFrameNo(objectData.getString("sampleFrameNo"));
			object.setSampleVINNo(objectData.getString("sampleFrameNo"));
			object.setSampleEngineNo(objectData.getString("sampleEngineNo"));
			object.setSampleVehicleType(objectData.getString("sampleVehicleType"));
			object.setSampleVehicleTypeDescription(objectData.getString("sampleVehicleTypeDescription"));
			object.setSampleTrademark(objectData.getString("sampleTrademark"));
			object.setSampleTrademarkName(objectData.getString("sampleTrademarkName"));
			object.setSampleCommercialName(objectData.getString("sampleCommercialName"));
			object.setSampleModelCode(objectData.getString("sampleModelCode"));
			object.setCustomsDeclarationNo(objectData.getString("customsDeclarationNo"));
			object.setCustomsDeclarationDate(parseStringToDate(objectData.getString("customsDeclarationDate")));
			object.setProductionCountry(objectData.getString("productionCountry"));
			object.setImporterQuantity(objectData.getLong("importerQuantity"));
			object.setInspectionRecordNo(objectData.getString("inspectionRecordNo"));
			object.setInspectionDate(parseStringToDate(objectData.getString("inspectionDate")));
			object.setInspectionSite(objectData.getString("inspectionSite"));
			object.setInspectionDistrictCode(objectData.getString("inspectionDistrictCode"));
			object.setInspectionDistrictName(objectData.getString("inspectionDistrictName"));
			object.setInspectionProvinceCode(objectData.getString("inspectionProvinceCode"));
			object.setInspectionProvinceName(objectData.getString("inspectionProvinceName"));
			// object.setCorporationId(objectData.getString("corporationId"));
			// object.setInspectorId(objectData.getLong("inspectorId"));
			object.setRemarks(objectData.getString("remarks"));
			object.setInspectionNote(objectData.getString("inspectionNote"));
			object.setCertificateNote(objectData.getString("certificateNote"));
			object.setModule(objectData.getString("module"));
			// object.setDeliverableFileEntryid(objectData.getLong("deliverableFileEntryId"));
			object.setModifyDate(now);

			object = vrVehicleTypeCertificatePersistence.update(object);

			List<VRVehicleEquipment> vrVehicleEquipments = vrVehicleEquipmentLocalService
					.findByDossierId(objectData.getLong("dossierId"), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			for (VRVehicleEquipment vrVehicleEquipment : vrVehicleEquipments) {
				vrVehicleEquipment.setVehicleTypeCertificateId(object.getPrimaryKey());

				vrVehicleEquipmentPersistence.update(vrVehicleEquipment);
			}

			try {
				JSONObject jVRVehicleTypeCertificate = BusinessUtil.object2Json_originColumnName(object,
						VRVehicleTypeCertificateModelImpl.class, StringPool.BLANK);
				result.put("vr_VehicleTypeCertificate", jVRVehicleTypeCertificate);
			} catch (JSONException e) {
			}
			if (arrayVRVehicleSpecification != null) {
				JSONArray array = vrVehicleSpecificationLocalService.adminProcessData(arrayVRVehicleSpecification,
						object.getDossierId(), object.getPrimaryKey());
				result.put("vr_VehicleSpecification", array);
			}
			if (arrayVRInspectionStandard != null) {
				JSONArray array = vrInspectionStandardLocalService.adminProcessData(arrayVRInspectionStandard,
						object.getDossierId(), object.getPrimaryKey());
				result.put("vr_InspectionStandard", array);
			}
			if (arrayLKXCG != null) {
				JSONArray array = vrTechnicalSpec_LKXCGLocalService.adminProcessData(arrayLKXCG, object.getDossierId(),
						object.getMtCore(), object.getPrimaryKey());
				result.put("vr_Technicalspec_LKXCG", array);
			}
			if (arrayXCG != null) {
				JSONArray array = vrTechnicalSpec_XCGLocalService.adminProcessData(arrayXCG, object.getDossierId(),
						object.getMtCore(), object.getPrimaryKey());
				result.put("vr_Technicalspec_XCG", array);
			}
			if (arrayLKXMY != null) {
				JSONArray array = vrTechnicalSpec_LKXMYLocalService.adminProcessData(arrayLKXMY, object.getDossierId(),
						object.getMtCore(), object.getPrimaryKey());
				result.put("vr_Technicalspec_LKXMY", array);
			}
			if (arrayXMY != null) {
				JSONArray array = vrTechnicalSpec_XMYLocalService.adminProcessData(arrayXMY, object.getDossierId(),
						object.getMtCore(), object.getPrimaryKey());
				result.put("vr_Technicalspec_XMY", array);
			}
			if (arrayXCH != null) {
				JSONArray array = vrTechnicalSpec_XCHLocalService.adminProcessData(arrayXCH, object.getDossierId(),
						object.getMtCore(), object.getPrimaryKey());
				result.put("vr_Technicalspec_XCH", array);
			}
			if (arrayXCN != null) {
				JSONArray array = vrTechnicalSpec_XCNLocalService.adminProcessData(arrayXCN, object.getDossierId(),
						object.getMtCore(), object.getPrimaryKey());
				result.put("vr_Technicalspec_XCN", array);
			}
			if (arrayXDD != null) {
				JSONArray array = vrTechnicalSpec_XDDLocalService.adminProcessData(arrayXDD, object.getDossierId(),
						object.getMtCore(), object.getPrimaryKey());
				result.put("vr_Technicalspec_XDD", array);
			}
		}

		return result;
	}

}