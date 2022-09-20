package com.fds.vr.util;

import java.util.ArrayList;
import java.util.List;

import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.model.VRVehicleTypeCertificateModel;

public class VRVehicleCertificateUtils {

	public static List<VRVehicleTypeCertificateModel> mappingToResultCertificate (List<VRVehicleTypeCertificate> certList) {

		if (certList != null && certList.size() > 0) {
			List<VRVehicleTypeCertificateModel> certModelList = new ArrayList<VRVehicleTypeCertificateModel>();
			for (VRVehicleTypeCertificate certInfo : certList) {
				VRVehicleTypeCertificateModel model = mappingToDetailCertificate(certInfo);

				certModelList.add(model);
			}
			return certModelList;
		} else {
			return null;
		}
	}

	public static VRVehicleTypeCertificateModel mappingToDetailCertificate (VRVehicleTypeCertificate certInfo) {

		VRVehicleTypeCertificateModel model = new VRVehicleTypeCertificateModel();
		//
		model.setCertificateId(certInfo.getId());
		model.setMtCore(certInfo.getMtCore());
		model.setDossierId(certInfo.getDossierId());
		model.setDossierNo(certInfo.getDossierNo());
		model.setServiceCode(certInfo.getServiceCode());
		model.setServiceName(certInfo.getServiceName());
		model.setConvertassembleId(certInfo.getConvertassembleId());
		model.setApplicantIdNo(certInfo.getApplicantIdNo());
		model.setApplicantName(certInfo.getApplicantName());
		model.setProductionPlantCode(certInfo.getProductionPlantCode());
		model.setProductionPlantName(certInfo.getProductionPlantName());
		model.setProductionPlantAddress(certInfo.getProductionPlantAddress());
		model.setCopReportNo(certInfo.getCopReportNo());
		model.setCopReportDate(ConvertFormatDate.convertDateToString(certInfo.getCopReportDate(),
				ConvertFormatDate._NORMAL_DATE_TIME));
		model.setCopReportExpireDate(ConvertFormatDate.convertDateToString(certInfo.getCopReportExpireDate(),
				ConvertFormatDate._NORMAL_DATE_TIME));
		model.setCertificateType(certInfo.getCertificateType());
		model.setCertificateRecordNo(certInfo.getCertificateRecordNo());
		model.setCertificateRecordDate(ConvertFormatDate.convertDateToString(certInfo.getCertificateRecordDate(),
				ConvertFormatDate._NORMAL_DATE_TIME));
		model.setCertificateRecordExpireDate(ConvertFormatDate
				.convertDateToString(certInfo.getCertificateRecordExpireDate(), ConvertFormatDate._NORMAL_DATE_TIME));
		model.setExpiredStatus(certInfo.getExpiredStatus());
		model.setCertificateRecordStatus(certInfo.getCertificateRecordStatus());
		model.setVehicleClass(certInfo.getVehicleClass());
		model.setCertifiedVehicleType(certInfo.getCertifiedVehicleType());
		model.setCertifiedVehicleTypeDescription(certInfo.getCertifiedVehicleTypeDescription());
		model.setCertifiedTrademark(certInfo.getCertifiedTrademark());
		model.setCertifiedTrademarkName(certInfo.getCertifiedTrademarkName());
		model.setCertifiedCommercialName(certInfo.getCertifiedCommercialName());
		model.setCertifiedModelCode(certInfo.getCertifiedModelCode());
		model.setSafetyTestReportNo(certInfo.getSafetyTestReportNo());
		model.setSafetyTestReportDate(ConvertFormatDate.convertDateToString(certInfo.getSafetyTestReportDate(),
				ConvertFormatDate._NORMAL_DATE_TIME));
		model.setEmissionTestReportNo(certInfo.getEmissionTestReportNo());
		model.setEmissionTestReportDate(ConvertFormatDate.convertDateToString(certInfo.getEmissionTestReportDate(),
				ConvertFormatDate._NORMAL_DATE_TIME));
		model.setCommonSafetyStandard(certInfo.getCommonSafetyStandard());
		model.setEmissionStandard(certInfo.getEmissionStandard());
		model.setCommonSafetyDescription(certInfo.getCommonSafetyDescription());
		model.setEmissionDescription(certInfo.getEmissionDescription());
		model.setOtherTestReportNo(certInfo.getOtherTestReportNo());
		model.setOtherTestReportDate(ConvertFormatDate.convertDateToString(certInfo.getOtherTestReportDate(),
				ConvertFormatDate._NORMAL_DATE_TIME));
		model.setCustomsDeclarationNo(certInfo.getCustomsDeclarationNo());
		model.setCustomsDeclarationDate(ConvertFormatDate.convertDateToString(certInfo.getCustomsDeclarationDate(),
				ConvertFormatDate._NORMAL_DATE_TIME));
		model.setProductionCountry(certInfo.getProductionCountry());
		model.setImporterQuantity(certInfo.getImporterQuantity());
		model.setRemarks(certInfo.getRemarks());
		model.setInspectionNote(certInfo.getInspectionNote());
		model.setCertificateNote(certInfo.getCertificateNote());
		model.setDeliverableCode(certInfo.getDeliverableCode());
		model.setModule(certInfo.getModule());

		return model;
	}

}
