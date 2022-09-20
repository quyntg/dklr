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

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRVehicleTypeCertificate}.
 * </p>
 *
 * @author LamTV
 * @see VRVehicleTypeCertificate
 * @generated
 */
@ProviderType
public class VRVehicleTypeCertificateWrapper implements VRVehicleTypeCertificate,
	ModelWrapper<VRVehicleTypeCertificate> {
	public VRVehicleTypeCertificateWrapper(
		VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		_vrVehicleTypeCertificate = vrVehicleTypeCertificate;
	}

	@Override
	public Class<?> getModelClass() {
		return VRVehicleTypeCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return VRVehicleTypeCertificate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("dossierType", getDossierType());
		attributes.put("dossierNo", getDossierNo());
		attributes.put("referenceUid", getReferenceUid());
		attributes.put("serviceCode", getServiceCode());
		attributes.put("serviceName", getServiceName());
		attributes.put("convertassembleId", getConvertassembleId());
		attributes.put("applicantIdNo", getApplicantIdNo());
		attributes.put("applicantTelNo", getApplicantTelNo());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantIdDate", getApplicantIdDate());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("applicantRepresentative", getApplicantRepresentative());
		attributes.put("applicantRepresentativeTitle",
			getApplicantRepresentativeTitle());
		attributes.put("applicantEmail", getApplicantEmail());
		attributes.put("applicantPhone", getApplicantPhone());
		attributes.put("applicantFax", getApplicantFax());
		attributes.put("applicantContactName", getApplicantContactName());
		attributes.put("applicantContactEmail", getApplicantContactEmail());
		attributes.put("applicantcontactPhone", getApplicantcontactPhone());
		attributes.put("applicantcontactTelNo", getApplicantcontactTelNo());
		attributes.put("cityCode", getCityCode());
		attributes.put("cityName", getCityName());
		attributes.put("districtCode", getDistrictCode());
		attributes.put("districtName", getDistrictName());
		attributes.put("wardCode", getWardCode());
		attributes.put("wardName", getWardName());
		attributes.put("manufacturerForeignCode", getManufacturerForeignCode());
		attributes.put("manufacturerName", getManufacturerName());
		attributes.put("manufacturerAddress", getManufacturerAddress());
		attributes.put("manufacturerRepresentative",
			getManufacturerRepresentative());
		attributes.put("manufacturerRepresentativeTitle",
			getManufacturerRepresentativeTitle());
		attributes.put("manufacturerEmail", getManufacturerEmail());
		attributes.put("manufacturerPhone", getManufacturerPhone());
		attributes.put("manufacturerFax", getManufacturerFax());
		attributes.put("productionPlantCode", getProductionPlantCode());
		attributes.put("productionPlantName", getProductionPlantName());
		attributes.put("productionPlantAddress", getProductionPlantAddress());
		attributes.put("productionPlantRepresentative",
			getProductionPlantRepresentative());
		attributes.put("productionPlantRepresentativeTitle",
			getProductionPlantRepresentativeTitle());
		attributes.put("copReportNo", getCopReportNo());
		attributes.put("copReportDate", getCopReportDate());
		attributes.put("copReportExpireDate", getCopReportExpireDate());
		attributes.put("designerCode", getDesignerCode());
		attributes.put("designerName", getDesignerName());
		attributes.put("designerAddress", getDesignerAddress());
		attributes.put("designerRepresentative", getDesignerRepresentative());
		attributes.put("designerRepresentativeTitle",
			getDesignerRepresentativeTitle());
		attributes.put("designerEmail", getDesignerEmail());
		attributes.put("designerPhone", getDesignerPhone());
		attributes.put("designerFax", getDesignerFax());
		attributes.put("verificationCertificateNo",
			getVerificationCertificateNo());
		attributes.put("verificationCertificateDate",
			getVerificationCertificateDate());
		attributes.put("verificationRefNo", getVerificationRefNo());
		attributes.put("verificationRefDate", getVerificationRefDate());
		attributes.put("typeApprovalCertificateNo",
			getTypeApprovalCertificateNo());
		attributes.put("typeApprovalCertificateDate",
			getTypeApprovalCertificateDate());
		attributes.put("designModelCode", getDesignModelCode());
		attributes.put("designModelDescription", getDesignModelDescription());
		attributes.put("designSymbol", getDesignSymbol());
		attributes.put("registeredNumber", getRegisteredNumber());
		attributes.put("inspectorReceiveDate", getInspectorReceiveDate());
		attributes.put("inspectorSubmitDate", getInspectorSubmitDate());
		attributes.put("inspectorendorSementDate", getInspectorendorSementDate());
		attributes.put("inspectorDeadline", getInspectorDeadline());
		attributes.put("inspectorFinishDate", getInspectorFinishDate());
		attributes.put("inspectorCancelDate", getInspectorCancelDate());
		attributes.put("inspectorOrganization", getInspectorOrganization());
		attributes.put("inspectorDivision", getInspectorDivision());
		attributes.put("inspectorSignName", getInspectorSignName());
		attributes.put("inspectorSignTitle", getInspectorSignTitle());
		attributes.put("inspectorSignPlace", getInspectorSignPlace());
		attributes.put("certificateType", getCertificateType());
		attributes.put("referenceCertificateNo", getReferenceCertificateNo());
		attributes.put("referenceCertificateDate", getReferenceCertificateDate());
		attributes.put("certificateRecordNo", getCertificateRecordNo());
		attributes.put("certificateSignName", getCertificateSignName());
		attributes.put("certificateSignTitle", getCertificateSignTitle());
		attributes.put("certificateSignPlace", getCertificateSignPlace());
		attributes.put("certificateRecordDate", getCertificateRecordDate());
		attributes.put("certificateRecordExpireDate",
			getCertificateRecordExpireDate());
		attributes.put("expiredStatus", getExpiredStatus());
		attributes.put("certificateRecordStatus", getCertificateRecordStatus());
		attributes.put("digitalIssueStatus", getDigitalIssueStatus());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("certifiedVehicleType", getCertifiedVehicleType());
		attributes.put("certifiedVehicleTypeDescription",
			getCertifiedVehicleTypeDescription());
		attributes.put("certifiedTrademark", getCertifiedTrademark());
		attributes.put("certifiedTrademarkName", getCertifiedTrademarkName());
		attributes.put("certifiedCommercialName", getCertifiedCommercialName());
		attributes.put("certifiedModelCode", getCertifiedModelCode());
		attributes.put("certifiedAssemblyType", getCertifiedAssemblyType());
		attributes.put("certifiedAssemblyTypeDescription",
			getCertifiedAssemblyTypeDescription());
		attributes.put("certifiedVINNo", getCertifiedVINNo());
		attributes.put("certifiedVINPosition", getCertifiedVINPosition());
		attributes.put("certifiedFrameNo", getCertifiedFrameNo());
		attributes.put("certifiedFrameAttachPlace",
			getCertifiedFrameAttachPlace());
		attributes.put("certifiedFramePosition", getCertifiedFramePosition());
		attributes.put("certifiedEngineNo", getCertifiedEngineNo());
		attributes.put("certifiedEngineAttachPlace",
			getCertifiedEngineAttachPlace());
		attributes.put("certifiedEnginePosition", getCertifiedEnginePosition());
		attributes.put("safetyTestReportNo", getSafetyTestReportNo());
		attributes.put("safetyTestReportDate", getSafetyTestReportDate());
		attributes.put("emissionTestReportNo", getEmissionTestReportNo());
		attributes.put("emissionTestReportDate", getEmissionTestReportDate());
		attributes.put("commonSafetyStandard", getCommonSafetyStandard());
		attributes.put("commonSafetyDescription", getCommonSafetyDescription());
		attributes.put("emissionStandard", getEmissionStandard());
		attributes.put("emissionDescription", getEmissionDescription());
		attributes.put("otherTestReportNo", getOtherTestReportNo());
		attributes.put("otherTestReportDate", getOtherTestReportDate());
		attributes.put("sampleFrameNo", getSampleFrameNo());
		attributes.put("sampleVINNo", getSampleVINNo());
		attributes.put("sampleEngineNo", getSampleEngineNo());
		attributes.put("sampleVehicleType", getSampleVehicleType());
		attributes.put("sampleVehicleTypeDescription",
			getSampleVehicleTypeDescription());
		attributes.put("sampleTrademark", getSampleTrademark());
		attributes.put("sampleTrademarkName", getSampleTrademarkName());
		attributes.put("sampleCommercialName", getSampleCommercialName());
		attributes.put("sampleModelCode", getSampleModelCode());
		attributes.put("customsDeclarationNo", getCustomsDeclarationNo());
		attributes.put("customsDeclarationDate", getCustomsDeclarationDate());
		attributes.put("productionCountry", getProductionCountry());
		attributes.put("importerQuantity", getImporterQuantity());
		attributes.put("inspectionRecordNo", getInspectionRecordNo());
		attributes.put("inspectionDate", getInspectionDate());
		attributes.put("inspectionSite", getInspectionSite());
		attributes.put("inspectionDistrictCode", getInspectionDistrictCode());
		attributes.put("inspectionDistrictName", getInspectionDistrictName());
		attributes.put("inspectionProvinceCode", getInspectionProvinceCode());
		attributes.put("inspectionProvinceName", getInspectionProvinceName());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("remarks", getRemarks());
		attributes.put("inspectionNote", getInspectionNote());
		attributes.put("certificateNote", getCertificateNote());
		attributes.put("deliverableCode", getDeliverableCode());
		attributes.put("deliverableFileEntryid", getDeliverableFileEntryid());
		attributes.put("module", getModule());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String dossierIdCTN = (String)attributes.get("dossierIdCTN");

		if (dossierIdCTN != null) {
			setDossierIdCTN(dossierIdCTN);
		}

		String dossierType = (String)attributes.get("dossierType");

		if (dossierType != null) {
			setDossierType(dossierType);
		}

		String dossierNo = (String)attributes.get("dossierNo");

		if (dossierNo != null) {
			setDossierNo(dossierNo);
		}

		String referenceUid = (String)attributes.get("referenceUid");

		if (referenceUid != null) {
			setReferenceUid(referenceUid);
		}

		String serviceCode = (String)attributes.get("serviceCode");

		if (serviceCode != null) {
			setServiceCode(serviceCode);
		}

		String serviceName = (String)attributes.get("serviceName");

		if (serviceName != null) {
			setServiceName(serviceName);
		}

		Long convertassembleId = (Long)attributes.get("convertassembleId");

		if (convertassembleId != null) {
			setConvertassembleId(convertassembleId);
		}

		String applicantIdNo = (String)attributes.get("applicantIdNo");

		if (applicantIdNo != null) {
			setApplicantIdNo(applicantIdNo);
		}

		String applicantTelNo = (String)attributes.get("applicantTelNo");

		if (applicantTelNo != null) {
			setApplicantTelNo(applicantTelNo);
		}

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		Date applicantIdDate = (Date)attributes.get("applicantIdDate");

		if (applicantIdDate != null) {
			setApplicantIdDate(applicantIdDate);
		}

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		String applicantRepresentative = (String)attributes.get(
				"applicantRepresentative");

		if (applicantRepresentative != null) {
			setApplicantRepresentative(applicantRepresentative);
		}

		String applicantRepresentativeTitle = (String)attributes.get(
				"applicantRepresentativeTitle");

		if (applicantRepresentativeTitle != null) {
			setApplicantRepresentativeTitle(applicantRepresentativeTitle);
		}

		String applicantEmail = (String)attributes.get("applicantEmail");

		if (applicantEmail != null) {
			setApplicantEmail(applicantEmail);
		}

		String applicantPhone = (String)attributes.get("applicantPhone");

		if (applicantPhone != null) {
			setApplicantPhone(applicantPhone);
		}

		String applicantFax = (String)attributes.get("applicantFax");

		if (applicantFax != null) {
			setApplicantFax(applicantFax);
		}

		String applicantContactName = (String)attributes.get(
				"applicantContactName");

		if (applicantContactName != null) {
			setApplicantContactName(applicantContactName);
		}

		String applicantContactEmail = (String)attributes.get(
				"applicantContactEmail");

		if (applicantContactEmail != null) {
			setApplicantContactEmail(applicantContactEmail);
		}

		String applicantcontactPhone = (String)attributes.get(
				"applicantcontactPhone");

		if (applicantcontactPhone != null) {
			setApplicantcontactPhone(applicantcontactPhone);
		}

		String applicantcontactTelNo = (String)attributes.get(
				"applicantcontactTelNo");

		if (applicantcontactTelNo != null) {
			setApplicantcontactTelNo(applicantcontactTelNo);
		}

		String cityCode = (String)attributes.get("cityCode");

		if (cityCode != null) {
			setCityCode(cityCode);
		}

		String cityName = (String)attributes.get("cityName");

		if (cityName != null) {
			setCityName(cityName);
		}

		String districtCode = (String)attributes.get("districtCode");

		if (districtCode != null) {
			setDistrictCode(districtCode);
		}

		String districtName = (String)attributes.get("districtName");

		if (districtName != null) {
			setDistrictName(districtName);
		}

		String wardCode = (String)attributes.get("wardCode");

		if (wardCode != null) {
			setWardCode(wardCode);
		}

		String wardName = (String)attributes.get("wardName");

		if (wardName != null) {
			setWardName(wardName);
		}

		String manufacturerForeignCode = (String)attributes.get(
				"manufacturerForeignCode");

		if (manufacturerForeignCode != null) {
			setManufacturerForeignCode(manufacturerForeignCode);
		}

		String manufacturerName = (String)attributes.get("manufacturerName");

		if (manufacturerName != null) {
			setManufacturerName(manufacturerName);
		}

		String manufacturerAddress = (String)attributes.get(
				"manufacturerAddress");

		if (manufacturerAddress != null) {
			setManufacturerAddress(manufacturerAddress);
		}

		String manufacturerRepresentative = (String)attributes.get(
				"manufacturerRepresentative");

		if (manufacturerRepresentative != null) {
			setManufacturerRepresentative(manufacturerRepresentative);
		}

		String manufacturerRepresentativeTitle = (String)attributes.get(
				"manufacturerRepresentativeTitle");

		if (manufacturerRepresentativeTitle != null) {
			setManufacturerRepresentativeTitle(manufacturerRepresentativeTitle);
		}

		String manufacturerEmail = (String)attributes.get("manufacturerEmail");

		if (manufacturerEmail != null) {
			setManufacturerEmail(manufacturerEmail);
		}

		String manufacturerPhone = (String)attributes.get("manufacturerPhone");

		if (manufacturerPhone != null) {
			setManufacturerPhone(manufacturerPhone);
		}

		String manufacturerFax = (String)attributes.get("manufacturerFax");

		if (manufacturerFax != null) {
			setManufacturerFax(manufacturerFax);
		}

		String productionPlantCode = (String)attributes.get(
				"productionPlantCode");

		if (productionPlantCode != null) {
			setProductionPlantCode(productionPlantCode);
		}

		String productionPlantName = (String)attributes.get(
				"productionPlantName");

		if (productionPlantName != null) {
			setProductionPlantName(productionPlantName);
		}

		String productionPlantAddress = (String)attributes.get(
				"productionPlantAddress");

		if (productionPlantAddress != null) {
			setProductionPlantAddress(productionPlantAddress);
		}

		String productionPlantRepresentative = (String)attributes.get(
				"productionPlantRepresentative");

		if (productionPlantRepresentative != null) {
			setProductionPlantRepresentative(productionPlantRepresentative);
		}

		String productionPlantRepresentativeTitle = (String)attributes.get(
				"productionPlantRepresentativeTitle");

		if (productionPlantRepresentativeTitle != null) {
			setProductionPlantRepresentativeTitle(productionPlantRepresentativeTitle);
		}

		String copReportNo = (String)attributes.get("copReportNo");

		if (copReportNo != null) {
			setCopReportNo(copReportNo);
		}

		Date copReportDate = (Date)attributes.get("copReportDate");

		if (copReportDate != null) {
			setCopReportDate(copReportDate);
		}

		Date copReportExpireDate = (Date)attributes.get("copReportExpireDate");

		if (copReportExpireDate != null) {
			setCopReportExpireDate(copReportExpireDate);
		}

		String designerCode = (String)attributes.get("designerCode");

		if (designerCode != null) {
			setDesignerCode(designerCode);
		}

		String designerName = (String)attributes.get("designerName");

		if (designerName != null) {
			setDesignerName(designerName);
		}

		String designerAddress = (String)attributes.get("designerAddress");

		if (designerAddress != null) {
			setDesignerAddress(designerAddress);
		}

		String designerRepresentative = (String)attributes.get(
				"designerRepresentative");

		if (designerRepresentative != null) {
			setDesignerRepresentative(designerRepresentative);
		}

		String designerRepresentativeTitle = (String)attributes.get(
				"designerRepresentativeTitle");

		if (designerRepresentativeTitle != null) {
			setDesignerRepresentativeTitle(designerRepresentativeTitle);
		}

		String designerEmail = (String)attributes.get("designerEmail");

		if (designerEmail != null) {
			setDesignerEmail(designerEmail);
		}

		String designerPhone = (String)attributes.get("designerPhone");

		if (designerPhone != null) {
			setDesignerPhone(designerPhone);
		}

		String designerFax = (String)attributes.get("designerFax");

		if (designerFax != null) {
			setDesignerFax(designerFax);
		}

		String verificationCertificateNo = (String)attributes.get(
				"verificationCertificateNo");

		if (verificationCertificateNo != null) {
			setVerificationCertificateNo(verificationCertificateNo);
		}

		Date verificationCertificateDate = (Date)attributes.get(
				"verificationCertificateDate");

		if (verificationCertificateDate != null) {
			setVerificationCertificateDate(verificationCertificateDate);
		}

		String verificationRefNo = (String)attributes.get("verificationRefNo");

		if (verificationRefNo != null) {
			setVerificationRefNo(verificationRefNo);
		}

		Date verificationRefDate = (Date)attributes.get("verificationRefDate");

		if (verificationRefDate != null) {
			setVerificationRefDate(verificationRefDate);
		}

		String typeApprovalCertificateNo = (String)attributes.get(
				"typeApprovalCertificateNo");

		if (typeApprovalCertificateNo != null) {
			setTypeApprovalCertificateNo(typeApprovalCertificateNo);
		}

		Date typeApprovalCertificateDate = (Date)attributes.get(
				"typeApprovalCertificateDate");

		if (typeApprovalCertificateDate != null) {
			setTypeApprovalCertificateDate(typeApprovalCertificateDate);
		}

		String designModelCode = (String)attributes.get("designModelCode");

		if (designModelCode != null) {
			setDesignModelCode(designModelCode);
		}

		String designModelDescription = (String)attributes.get(
				"designModelDescription");

		if (designModelDescription != null) {
			setDesignModelDescription(designModelDescription);
		}

		String designSymbol = (String)attributes.get("designSymbol");

		if (designSymbol != null) {
			setDesignSymbol(designSymbol);
		}

		String registeredNumber = (String)attributes.get("registeredNumber");

		if (registeredNumber != null) {
			setRegisteredNumber(registeredNumber);
		}

		Date inspectorReceiveDate = (Date)attributes.get("inspectorReceiveDate");

		if (inspectorReceiveDate != null) {
			setInspectorReceiveDate(inspectorReceiveDate);
		}

		Date inspectorSubmitDate = (Date)attributes.get("inspectorSubmitDate");

		if (inspectorSubmitDate != null) {
			setInspectorSubmitDate(inspectorSubmitDate);
		}

		Date inspectorendorSementDate = (Date)attributes.get(
				"inspectorendorSementDate");

		if (inspectorendorSementDate != null) {
			setInspectorendorSementDate(inspectorendorSementDate);
		}

		Date inspectorDeadline = (Date)attributes.get("inspectorDeadline");

		if (inspectorDeadline != null) {
			setInspectorDeadline(inspectorDeadline);
		}

		Date inspectorFinishDate = (Date)attributes.get("inspectorFinishDate");

		if (inspectorFinishDate != null) {
			setInspectorFinishDate(inspectorFinishDate);
		}

		Date inspectorCancelDate = (Date)attributes.get("inspectorCancelDate");

		if (inspectorCancelDate != null) {
			setInspectorCancelDate(inspectorCancelDate);
		}

		String inspectorOrganization = (String)attributes.get(
				"inspectorOrganization");

		if (inspectorOrganization != null) {
			setInspectorOrganization(inspectorOrganization);
		}

		String inspectorDivision = (String)attributes.get("inspectorDivision");

		if (inspectorDivision != null) {
			setInspectorDivision(inspectorDivision);
		}

		String inspectorSignName = (String)attributes.get("inspectorSignName");

		if (inspectorSignName != null) {
			setInspectorSignName(inspectorSignName);
		}

		String inspectorSignTitle = (String)attributes.get("inspectorSignTitle");

		if (inspectorSignTitle != null) {
			setInspectorSignTitle(inspectorSignTitle);
		}

		String inspectorSignPlace = (String)attributes.get("inspectorSignPlace");

		if (inspectorSignPlace != null) {
			setInspectorSignPlace(inspectorSignPlace);
		}

		String certificateType = (String)attributes.get("certificateType");

		if (certificateType != null) {
			setCertificateType(certificateType);
		}

		String referenceCertificateNo = (String)attributes.get(
				"referenceCertificateNo");

		if (referenceCertificateNo != null) {
			setReferenceCertificateNo(referenceCertificateNo);
		}

		Date referenceCertificateDate = (Date)attributes.get(
				"referenceCertificateDate");

		if (referenceCertificateDate != null) {
			setReferenceCertificateDate(referenceCertificateDate);
		}

		String certificateRecordNo = (String)attributes.get(
				"certificateRecordNo");

		if (certificateRecordNo != null) {
			setCertificateRecordNo(certificateRecordNo);
		}

		String certificateSignName = (String)attributes.get(
				"certificateSignName");

		if (certificateSignName != null) {
			setCertificateSignName(certificateSignName);
		}

		String certificateSignTitle = (String)attributes.get(
				"certificateSignTitle");

		if (certificateSignTitle != null) {
			setCertificateSignTitle(certificateSignTitle);
		}

		String certificateSignPlace = (String)attributes.get(
				"certificateSignPlace");

		if (certificateSignPlace != null) {
			setCertificateSignPlace(certificateSignPlace);
		}

		Date certificateRecordDate = (Date)attributes.get(
				"certificateRecordDate");

		if (certificateRecordDate != null) {
			setCertificateRecordDate(certificateRecordDate);
		}

		Date certificateRecordExpireDate = (Date)attributes.get(
				"certificateRecordExpireDate");

		if (certificateRecordExpireDate != null) {
			setCertificateRecordExpireDate(certificateRecordExpireDate);
		}

		String expiredStatus = (String)attributes.get("expiredStatus");

		if (expiredStatus != null) {
			setExpiredStatus(expiredStatus);
		}

		String certificateRecordStatus = (String)attributes.get(
				"certificateRecordStatus");

		if (certificateRecordStatus != null) {
			setCertificateRecordStatus(certificateRecordStatus);
		}

		String digitalIssueStatus = (String)attributes.get("digitalIssueStatus");

		if (digitalIssueStatus != null) {
			setDigitalIssueStatus(digitalIssueStatus);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		String certifiedVehicleType = (String)attributes.get(
				"certifiedVehicleType");

		if (certifiedVehicleType != null) {
			setCertifiedVehicleType(certifiedVehicleType);
		}

		String certifiedVehicleTypeDescription = (String)attributes.get(
				"certifiedVehicleTypeDescription");

		if (certifiedVehicleTypeDescription != null) {
			setCertifiedVehicleTypeDescription(certifiedVehicleTypeDescription);
		}

		String certifiedTrademark = (String)attributes.get("certifiedTrademark");

		if (certifiedTrademark != null) {
			setCertifiedTrademark(certifiedTrademark);
		}

		String certifiedTrademarkName = (String)attributes.get(
				"certifiedTrademarkName");

		if (certifiedTrademarkName != null) {
			setCertifiedTrademarkName(certifiedTrademarkName);
		}

		String certifiedCommercialName = (String)attributes.get(
				"certifiedCommercialName");

		if (certifiedCommercialName != null) {
			setCertifiedCommercialName(certifiedCommercialName);
		}

		String certifiedModelCode = (String)attributes.get("certifiedModelCode");

		if (certifiedModelCode != null) {
			setCertifiedModelCode(certifiedModelCode);
		}

		String certifiedAssemblyType = (String)attributes.get(
				"certifiedAssemblyType");

		if (certifiedAssemblyType != null) {
			setCertifiedAssemblyType(certifiedAssemblyType);
		}

		String certifiedAssemblyTypeDescription = (String)attributes.get(
				"certifiedAssemblyTypeDescription");

		if (certifiedAssemblyTypeDescription != null) {
			setCertifiedAssemblyTypeDescription(certifiedAssemblyTypeDescription);
		}

		String certifiedVINNo = (String)attributes.get("certifiedVINNo");

		if (certifiedVINNo != null) {
			setCertifiedVINNo(certifiedVINNo);
		}

		String certifiedVINPosition = (String)attributes.get(
				"certifiedVINPosition");

		if (certifiedVINPosition != null) {
			setCertifiedVINPosition(certifiedVINPosition);
		}

		String certifiedFrameNo = (String)attributes.get("certifiedFrameNo");

		if (certifiedFrameNo != null) {
			setCertifiedFrameNo(certifiedFrameNo);
		}

		String certifiedFrameAttachPlace = (String)attributes.get(
				"certifiedFrameAttachPlace");

		if (certifiedFrameAttachPlace != null) {
			setCertifiedFrameAttachPlace(certifiedFrameAttachPlace);
		}

		String certifiedFramePosition = (String)attributes.get(
				"certifiedFramePosition");

		if (certifiedFramePosition != null) {
			setCertifiedFramePosition(certifiedFramePosition);
		}

		String certifiedEngineNo = (String)attributes.get("certifiedEngineNo");

		if (certifiedEngineNo != null) {
			setCertifiedEngineNo(certifiedEngineNo);
		}

		String certifiedEngineAttachPlace = (String)attributes.get(
				"certifiedEngineAttachPlace");

		if (certifiedEngineAttachPlace != null) {
			setCertifiedEngineAttachPlace(certifiedEngineAttachPlace);
		}

		String certifiedEnginePosition = (String)attributes.get(
				"certifiedEnginePosition");

		if (certifiedEnginePosition != null) {
			setCertifiedEnginePosition(certifiedEnginePosition);
		}

		String safetyTestReportNo = (String)attributes.get("safetyTestReportNo");

		if (safetyTestReportNo != null) {
			setSafetyTestReportNo(safetyTestReportNo);
		}

		Date safetyTestReportDate = (Date)attributes.get("safetyTestReportDate");

		if (safetyTestReportDate != null) {
			setSafetyTestReportDate(safetyTestReportDate);
		}

		String emissionTestReportNo = (String)attributes.get(
				"emissionTestReportNo");

		if (emissionTestReportNo != null) {
			setEmissionTestReportNo(emissionTestReportNo);
		}

		Date emissionTestReportDate = (Date)attributes.get(
				"emissionTestReportDate");

		if (emissionTestReportDate != null) {
			setEmissionTestReportDate(emissionTestReportDate);
		}

		String commonSafetyStandard = (String)attributes.get(
				"commonSafetyStandard");

		if (commonSafetyStandard != null) {
			setCommonSafetyStandard(commonSafetyStandard);
		}

		String commonSafetyDescription = (String)attributes.get(
				"commonSafetyDescription");

		if (commonSafetyDescription != null) {
			setCommonSafetyDescription(commonSafetyDescription);
		}

		String emissionStandard = (String)attributes.get("emissionStandard");

		if (emissionStandard != null) {
			setEmissionStandard(emissionStandard);
		}

		String emissionDescription = (String)attributes.get(
				"emissionDescription");

		if (emissionDescription != null) {
			setEmissionDescription(emissionDescription);
		}

		String otherTestReportNo = (String)attributes.get("otherTestReportNo");

		if (otherTestReportNo != null) {
			setOtherTestReportNo(otherTestReportNo);
		}

		Date otherTestReportDate = (Date)attributes.get("otherTestReportDate");

		if (otherTestReportDate != null) {
			setOtherTestReportDate(otherTestReportDate);
		}

		String sampleFrameNo = (String)attributes.get("sampleFrameNo");

		if (sampleFrameNo != null) {
			setSampleFrameNo(sampleFrameNo);
		}

		String sampleVINNo = (String)attributes.get("sampleVINNo");

		if (sampleVINNo != null) {
			setSampleVINNo(sampleVINNo);
		}

		String sampleEngineNo = (String)attributes.get("sampleEngineNo");

		if (sampleEngineNo != null) {
			setSampleEngineNo(sampleEngineNo);
		}

		String sampleVehicleType = (String)attributes.get("sampleVehicleType");

		if (sampleVehicleType != null) {
			setSampleVehicleType(sampleVehicleType);
		}

		String sampleVehicleTypeDescription = (String)attributes.get(
				"sampleVehicleTypeDescription");

		if (sampleVehicleTypeDescription != null) {
			setSampleVehicleTypeDescription(sampleVehicleTypeDescription);
		}

		String sampleTrademark = (String)attributes.get("sampleTrademark");

		if (sampleTrademark != null) {
			setSampleTrademark(sampleTrademark);
		}

		String sampleTrademarkName = (String)attributes.get(
				"sampleTrademarkName");

		if (sampleTrademarkName != null) {
			setSampleTrademarkName(sampleTrademarkName);
		}

		String sampleCommercialName = (String)attributes.get(
				"sampleCommercialName");

		if (sampleCommercialName != null) {
			setSampleCommercialName(sampleCommercialName);
		}

		String sampleModelCode = (String)attributes.get("sampleModelCode");

		if (sampleModelCode != null) {
			setSampleModelCode(sampleModelCode);
		}

		String customsDeclarationNo = (String)attributes.get(
				"customsDeclarationNo");

		if (customsDeclarationNo != null) {
			setCustomsDeclarationNo(customsDeclarationNo);
		}

		Date customsDeclarationDate = (Date)attributes.get(
				"customsDeclarationDate");

		if (customsDeclarationDate != null) {
			setCustomsDeclarationDate(customsDeclarationDate);
		}

		String productionCountry = (String)attributes.get("productionCountry");

		if (productionCountry != null) {
			setProductionCountry(productionCountry);
		}

		Long importerQuantity = (Long)attributes.get("importerQuantity");

		if (importerQuantity != null) {
			setImporterQuantity(importerQuantity);
		}

		String inspectionRecordNo = (String)attributes.get("inspectionRecordNo");

		if (inspectionRecordNo != null) {
			setInspectionRecordNo(inspectionRecordNo);
		}

		Date inspectionDate = (Date)attributes.get("inspectionDate");

		if (inspectionDate != null) {
			setInspectionDate(inspectionDate);
		}

		String inspectionSite = (String)attributes.get("inspectionSite");

		if (inspectionSite != null) {
			setInspectionSite(inspectionSite);
		}

		String inspectionDistrictCode = (String)attributes.get(
				"inspectionDistrictCode");

		if (inspectionDistrictCode != null) {
			setInspectionDistrictCode(inspectionDistrictCode);
		}

		String inspectionDistrictName = (String)attributes.get(
				"inspectionDistrictName");

		if (inspectionDistrictName != null) {
			setInspectionDistrictName(inspectionDistrictName);
		}

		String inspectionProvinceCode = (String)attributes.get(
				"inspectionProvinceCode");

		if (inspectionProvinceCode != null) {
			setInspectionProvinceCode(inspectionProvinceCode);
		}

		String inspectionProvinceName = (String)attributes.get(
				"inspectionProvinceName");

		if (inspectionProvinceName != null) {
			setInspectionProvinceName(inspectionProvinceName);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String inspectionNote = (String)attributes.get("inspectionNote");

		if (inspectionNote != null) {
			setInspectionNote(inspectionNote);
		}

		String certificateNote = (String)attributes.get("certificateNote");

		if (certificateNote != null) {
			setCertificateNote(certificateNote);
		}

		String deliverableCode = (String)attributes.get("deliverableCode");

		if (deliverableCode != null) {
			setDeliverableCode(deliverableCode);
		}

		Long deliverableFileEntryid = (Long)attributes.get(
				"deliverableFileEntryid");

		if (deliverableFileEntryid != null) {
			setDeliverableFileEntryid(deliverableFileEntryid);
		}

		String module = (String)attributes.get("module");

		if (module != null) {
			setModule(module);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public VRVehicleTypeCertificate toEscapedModel() {
		return new VRVehicleTypeCertificateWrapper(_vrVehicleTypeCertificate.toEscapedModel());
	}

	@Override
	public VRVehicleTypeCertificate toUnescapedModel() {
		return new VRVehicleTypeCertificateWrapper(_vrVehicleTypeCertificate.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrVehicleTypeCertificate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrVehicleTypeCertificate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrVehicleTypeCertificate.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrVehicleTypeCertificate.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRVehicleTypeCertificate> toCacheModel() {
		return _vrVehicleTypeCertificate.toCacheModel();
	}

	@Override
	public int compareTo(VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		return _vrVehicleTypeCertificate.compareTo(vrVehicleTypeCertificate);
	}

	@Override
	public int hashCode() {
		return _vrVehicleTypeCertificate.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrVehicleTypeCertificate.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRVehicleTypeCertificateWrapper((VRVehicleTypeCertificate)_vrVehicleTypeCertificate.clone());
	}

	/**
	* Returns the applicant address of this vr vehicle type certificate.
	*
	* @return the applicant address of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getApplicantAddress() {
		return _vrVehicleTypeCertificate.getApplicantAddress();
	}

	/**
	* Returns the applicant contact email of this vr vehicle type certificate.
	*
	* @return the applicant contact email of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getApplicantContactEmail() {
		return _vrVehicleTypeCertificate.getApplicantContactEmail();
	}

	/**
	* Returns the applicant contact name of this vr vehicle type certificate.
	*
	* @return the applicant contact name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getApplicantContactName() {
		return _vrVehicleTypeCertificate.getApplicantContactName();
	}

	/**
	* Returns the applicant email of this vr vehicle type certificate.
	*
	* @return the applicant email of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getApplicantEmail() {
		return _vrVehicleTypeCertificate.getApplicantEmail();
	}

	/**
	* Returns the applicant fax of this vr vehicle type certificate.
	*
	* @return the applicant fax of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getApplicantFax() {
		return _vrVehicleTypeCertificate.getApplicantFax();
	}

	/**
	* Returns the applicant ID no of this vr vehicle type certificate.
	*
	* @return the applicant ID no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getApplicantIdNo() {
		return _vrVehicleTypeCertificate.getApplicantIdNo();
	}

	/**
	* Returns the applicant name of this vr vehicle type certificate.
	*
	* @return the applicant name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _vrVehicleTypeCertificate.getApplicantName();
	}

	/**
	* Returns the applicant phone of this vr vehicle type certificate.
	*
	* @return the applicant phone of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getApplicantPhone() {
		return _vrVehicleTypeCertificate.getApplicantPhone();
	}

	/**
	* Returns the applicant representative of this vr vehicle type certificate.
	*
	* @return the applicant representative of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getApplicantRepresentative() {
		return _vrVehicleTypeCertificate.getApplicantRepresentative();
	}

	/**
	* Returns the applicant representative title of this vr vehicle type certificate.
	*
	* @return the applicant representative title of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getApplicantRepresentativeTitle() {
		return _vrVehicleTypeCertificate.getApplicantRepresentativeTitle();
	}

	/**
	* Returns the applicant tel no of this vr vehicle type certificate.
	*
	* @return the applicant tel no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getApplicantTelNo() {
		return _vrVehicleTypeCertificate.getApplicantTelNo();
	}

	/**
	* Returns the applicantcontact phone of this vr vehicle type certificate.
	*
	* @return the applicantcontact phone of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getApplicantcontactPhone() {
		return _vrVehicleTypeCertificate.getApplicantcontactPhone();
	}

	/**
	* Returns the applicantcontact tel no of this vr vehicle type certificate.
	*
	* @return the applicantcontact tel no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getApplicantcontactTelNo() {
		return _vrVehicleTypeCertificate.getApplicantcontactTelNo();
	}

	/**
	* Returns the certificate note of this vr vehicle type certificate.
	*
	* @return the certificate note of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertificateNote() {
		return _vrVehicleTypeCertificate.getCertificateNote();
	}

	/**
	* Returns the certificate record no of this vr vehicle type certificate.
	*
	* @return the certificate record no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertificateRecordNo() {
		return _vrVehicleTypeCertificate.getCertificateRecordNo();
	}

	/**
	* Returns the certificate record status of this vr vehicle type certificate.
	*
	* @return the certificate record status of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertificateRecordStatus() {
		return _vrVehicleTypeCertificate.getCertificateRecordStatus();
	}

	/**
	* Returns the certificate sign name of this vr vehicle type certificate.
	*
	* @return the certificate sign name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertificateSignName() {
		return _vrVehicleTypeCertificate.getCertificateSignName();
	}

	/**
	* Returns the certificate sign place of this vr vehicle type certificate.
	*
	* @return the certificate sign place of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertificateSignPlace() {
		return _vrVehicleTypeCertificate.getCertificateSignPlace();
	}

	/**
	* Returns the certificate sign title of this vr vehicle type certificate.
	*
	* @return the certificate sign title of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertificateSignTitle() {
		return _vrVehicleTypeCertificate.getCertificateSignTitle();
	}

	/**
	* Returns the certificate type of this vr vehicle type certificate.
	*
	* @return the certificate type of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertificateType() {
		return _vrVehicleTypeCertificate.getCertificateType();
	}

	/**
	* Returns the certified assembly type of this vr vehicle type certificate.
	*
	* @return the certified assembly type of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedAssemblyType() {
		return _vrVehicleTypeCertificate.getCertifiedAssemblyType();
	}

	/**
	* Returns the certified assembly type description of this vr vehicle type certificate.
	*
	* @return the certified assembly type description of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedAssemblyTypeDescription() {
		return _vrVehicleTypeCertificate.getCertifiedAssemblyTypeDescription();
	}

	/**
	* Returns the certified commercial name of this vr vehicle type certificate.
	*
	* @return the certified commercial name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedCommercialName() {
		return _vrVehicleTypeCertificate.getCertifiedCommercialName();
	}

	/**
	* Returns the certified engine attach place of this vr vehicle type certificate.
	*
	* @return the certified engine attach place of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedEngineAttachPlace() {
		return _vrVehicleTypeCertificate.getCertifiedEngineAttachPlace();
	}

	/**
	* Returns the certified engine no of this vr vehicle type certificate.
	*
	* @return the certified engine no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedEngineNo() {
		return _vrVehicleTypeCertificate.getCertifiedEngineNo();
	}

	/**
	* Returns the certified engine position of this vr vehicle type certificate.
	*
	* @return the certified engine position of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedEnginePosition() {
		return _vrVehicleTypeCertificate.getCertifiedEnginePosition();
	}

	/**
	* Returns the certified frame attach place of this vr vehicle type certificate.
	*
	* @return the certified frame attach place of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedFrameAttachPlace() {
		return _vrVehicleTypeCertificate.getCertifiedFrameAttachPlace();
	}

	/**
	* Returns the certified frame no of this vr vehicle type certificate.
	*
	* @return the certified frame no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedFrameNo() {
		return _vrVehicleTypeCertificate.getCertifiedFrameNo();
	}

	/**
	* Returns the certified frame position of this vr vehicle type certificate.
	*
	* @return the certified frame position of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedFramePosition() {
		return _vrVehicleTypeCertificate.getCertifiedFramePosition();
	}

	/**
	* Returns the certified model code of this vr vehicle type certificate.
	*
	* @return the certified model code of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedModelCode() {
		return _vrVehicleTypeCertificate.getCertifiedModelCode();
	}

	/**
	* Returns the certified trademark of this vr vehicle type certificate.
	*
	* @return the certified trademark of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedTrademark() {
		return _vrVehicleTypeCertificate.getCertifiedTrademark();
	}

	/**
	* Returns the certified trademark name of this vr vehicle type certificate.
	*
	* @return the certified trademark name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedTrademarkName() {
		return _vrVehicleTypeCertificate.getCertifiedTrademarkName();
	}

	/**
	* Returns the certified vin no of this vr vehicle type certificate.
	*
	* @return the certified vin no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedVINNo() {
		return _vrVehicleTypeCertificate.getCertifiedVINNo();
	}

	/**
	* Returns the certified vin position of this vr vehicle type certificate.
	*
	* @return the certified vin position of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedVINPosition() {
		return _vrVehicleTypeCertificate.getCertifiedVINPosition();
	}

	/**
	* Returns the certified vehicle type of this vr vehicle type certificate.
	*
	* @return the certified vehicle type of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedVehicleType() {
		return _vrVehicleTypeCertificate.getCertifiedVehicleType();
	}

	/**
	* Returns the certified vehicle type description of this vr vehicle type certificate.
	*
	* @return the certified vehicle type description of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCertifiedVehicleTypeDescription() {
		return _vrVehicleTypeCertificate.getCertifiedVehicleTypeDescription();
	}

	/**
	* Returns the city code of this vr vehicle type certificate.
	*
	* @return the city code of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCityCode() {
		return _vrVehicleTypeCertificate.getCityCode();
	}

	/**
	* Returns the city name of this vr vehicle type certificate.
	*
	* @return the city name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCityName() {
		return _vrVehicleTypeCertificate.getCityName();
	}

	/**
	* Returns the common safety description of this vr vehicle type certificate.
	*
	* @return the common safety description of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCommonSafetyDescription() {
		return _vrVehicleTypeCertificate.getCommonSafetyDescription();
	}

	/**
	* Returns the common safety standard of this vr vehicle type certificate.
	*
	* @return the common safety standard of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCommonSafetyStandard() {
		return _vrVehicleTypeCertificate.getCommonSafetyStandard();
	}

	/**
	* Returns the cop report no of this vr vehicle type certificate.
	*
	* @return the cop report no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCopReportNo() {
		return _vrVehicleTypeCertificate.getCopReportNo();
	}

	/**
	* Returns the corporation ID of this vr vehicle type certificate.
	*
	* @return the corporation ID of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _vrVehicleTypeCertificate.getCorporationId();
	}

	/**
	* Returns the customs declaration no of this vr vehicle type certificate.
	*
	* @return the customs declaration no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getCustomsDeclarationNo() {
		return _vrVehicleTypeCertificate.getCustomsDeclarationNo();
	}

	/**
	* Returns the deliverable code of this vr vehicle type certificate.
	*
	* @return the deliverable code of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrVehicleTypeCertificate.getDeliverableCode();
	}

	/**
	* Returns the design model code of this vr vehicle type certificate.
	*
	* @return the design model code of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDesignModelCode() {
		return _vrVehicleTypeCertificate.getDesignModelCode();
	}

	/**
	* Returns the design model description of this vr vehicle type certificate.
	*
	* @return the design model description of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDesignModelDescription() {
		return _vrVehicleTypeCertificate.getDesignModelDescription();
	}

	/**
	* Returns the design symbol of this vr vehicle type certificate.
	*
	* @return the design symbol of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDesignSymbol() {
		return _vrVehicleTypeCertificate.getDesignSymbol();
	}

	/**
	* Returns the designer address of this vr vehicle type certificate.
	*
	* @return the designer address of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDesignerAddress() {
		return _vrVehicleTypeCertificate.getDesignerAddress();
	}

	/**
	* Returns the designer code of this vr vehicle type certificate.
	*
	* @return the designer code of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDesignerCode() {
		return _vrVehicleTypeCertificate.getDesignerCode();
	}

	/**
	* Returns the designer email of this vr vehicle type certificate.
	*
	* @return the designer email of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDesignerEmail() {
		return _vrVehicleTypeCertificate.getDesignerEmail();
	}

	/**
	* Returns the designer fax of this vr vehicle type certificate.
	*
	* @return the designer fax of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDesignerFax() {
		return _vrVehicleTypeCertificate.getDesignerFax();
	}

	/**
	* Returns the designer name of this vr vehicle type certificate.
	*
	* @return the designer name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDesignerName() {
		return _vrVehicleTypeCertificate.getDesignerName();
	}

	/**
	* Returns the designer phone of this vr vehicle type certificate.
	*
	* @return the designer phone of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDesignerPhone() {
		return _vrVehicleTypeCertificate.getDesignerPhone();
	}

	/**
	* Returns the designer representative of this vr vehicle type certificate.
	*
	* @return the designer representative of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDesignerRepresentative() {
		return _vrVehicleTypeCertificate.getDesignerRepresentative();
	}

	/**
	* Returns the designer representative title of this vr vehicle type certificate.
	*
	* @return the designer representative title of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDesignerRepresentativeTitle() {
		return _vrVehicleTypeCertificate.getDesignerRepresentativeTitle();
	}

	/**
	* Returns the digital issue status of this vr vehicle type certificate.
	*
	* @return the digital issue status of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDigitalIssueStatus() {
		return _vrVehicleTypeCertificate.getDigitalIssueStatus();
	}

	/**
	* Returns the district code of this vr vehicle type certificate.
	*
	* @return the district code of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDistrictCode() {
		return _vrVehicleTypeCertificate.getDistrictCode();
	}

	/**
	* Returns the district name of this vr vehicle type certificate.
	*
	* @return the district name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDistrictName() {
		return _vrVehicleTypeCertificate.getDistrictName();
	}

	/**
	* Returns the dossier ID ctn of this vr vehicle type certificate.
	*
	* @return the dossier ID ctn of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrVehicleTypeCertificate.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr vehicle type certificate.
	*
	* @return the dossier no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrVehicleTypeCertificate.getDossierNo();
	}

	/**
	* Returns the dossier type of this vr vehicle type certificate.
	*
	* @return the dossier type of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getDossierType() {
		return _vrVehicleTypeCertificate.getDossierType();
	}

	/**
	* Returns the emission description of this vr vehicle type certificate.
	*
	* @return the emission description of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getEmissionDescription() {
		return _vrVehicleTypeCertificate.getEmissionDescription();
	}

	/**
	* Returns the emission standard of this vr vehicle type certificate.
	*
	* @return the emission standard of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getEmissionStandard() {
		return _vrVehicleTypeCertificate.getEmissionStandard();
	}

	/**
	* Returns the emission test report no of this vr vehicle type certificate.
	*
	* @return the emission test report no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getEmissionTestReportNo() {
		return _vrVehicleTypeCertificate.getEmissionTestReportNo();
	}

	/**
	* Returns the expired status of this vr vehicle type certificate.
	*
	* @return the expired status of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getExpiredStatus() {
		return _vrVehicleTypeCertificate.getExpiredStatus();
	}

	/**
	* Returns the inspection district code of this vr vehicle type certificate.
	*
	* @return the inspection district code of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getInspectionDistrictCode() {
		return _vrVehicleTypeCertificate.getInspectionDistrictCode();
	}

	/**
	* Returns the inspection district name of this vr vehicle type certificate.
	*
	* @return the inspection district name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getInspectionDistrictName() {
		return _vrVehicleTypeCertificate.getInspectionDistrictName();
	}

	/**
	* Returns the inspection note of this vr vehicle type certificate.
	*
	* @return the inspection note of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getInspectionNote() {
		return _vrVehicleTypeCertificate.getInspectionNote();
	}

	/**
	* Returns the inspection province code of this vr vehicle type certificate.
	*
	* @return the inspection province code of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getInspectionProvinceCode() {
		return _vrVehicleTypeCertificate.getInspectionProvinceCode();
	}

	/**
	* Returns the inspection province name of this vr vehicle type certificate.
	*
	* @return the inspection province name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getInspectionProvinceName() {
		return _vrVehicleTypeCertificate.getInspectionProvinceName();
	}

	/**
	* Returns the inspection record no of this vr vehicle type certificate.
	*
	* @return the inspection record no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getInspectionRecordNo() {
		return _vrVehicleTypeCertificate.getInspectionRecordNo();
	}

	/**
	* Returns the inspection site of this vr vehicle type certificate.
	*
	* @return the inspection site of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getInspectionSite() {
		return _vrVehicleTypeCertificate.getInspectionSite();
	}

	/**
	* Returns the inspector division of this vr vehicle type certificate.
	*
	* @return the inspector division of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getInspectorDivision() {
		return _vrVehicleTypeCertificate.getInspectorDivision();
	}

	/**
	* Returns the inspector organization of this vr vehicle type certificate.
	*
	* @return the inspector organization of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getInspectorOrganization() {
		return _vrVehicleTypeCertificate.getInspectorOrganization();
	}

	/**
	* Returns the inspector sign name of this vr vehicle type certificate.
	*
	* @return the inspector sign name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getInspectorSignName() {
		return _vrVehicleTypeCertificate.getInspectorSignName();
	}

	/**
	* Returns the inspector sign place of this vr vehicle type certificate.
	*
	* @return the inspector sign place of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getInspectorSignPlace() {
		return _vrVehicleTypeCertificate.getInspectorSignPlace();
	}

	/**
	* Returns the inspector sign title of this vr vehicle type certificate.
	*
	* @return the inspector sign title of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getInspectorSignTitle() {
		return _vrVehicleTypeCertificate.getInspectorSignTitle();
	}

	/**
	* Returns the manufacturer address of this vr vehicle type certificate.
	*
	* @return the manufacturer address of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getManufacturerAddress() {
		return _vrVehicleTypeCertificate.getManufacturerAddress();
	}

	/**
	* Returns the manufacturer email of this vr vehicle type certificate.
	*
	* @return the manufacturer email of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getManufacturerEmail() {
		return _vrVehicleTypeCertificate.getManufacturerEmail();
	}

	/**
	* Returns the manufacturer fax of this vr vehicle type certificate.
	*
	* @return the manufacturer fax of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getManufacturerFax() {
		return _vrVehicleTypeCertificate.getManufacturerFax();
	}

	/**
	* Returns the manufacturer foreign code of this vr vehicle type certificate.
	*
	* @return the manufacturer foreign code of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getManufacturerForeignCode() {
		return _vrVehicleTypeCertificate.getManufacturerForeignCode();
	}

	/**
	* Returns the manufacturer name of this vr vehicle type certificate.
	*
	* @return the manufacturer name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getManufacturerName() {
		return _vrVehicleTypeCertificate.getManufacturerName();
	}

	/**
	* Returns the manufacturer phone of this vr vehicle type certificate.
	*
	* @return the manufacturer phone of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getManufacturerPhone() {
		return _vrVehicleTypeCertificate.getManufacturerPhone();
	}

	/**
	* Returns the manufacturer representative of this vr vehicle type certificate.
	*
	* @return the manufacturer representative of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getManufacturerRepresentative() {
		return _vrVehicleTypeCertificate.getManufacturerRepresentative();
	}

	/**
	* Returns the manufacturer representative title of this vr vehicle type certificate.
	*
	* @return the manufacturer representative title of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getManufacturerRepresentativeTitle() {
		return _vrVehicleTypeCertificate.getManufacturerRepresentativeTitle();
	}

	/**
	* Returns the module of this vr vehicle type certificate.
	*
	* @return the module of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getModule() {
		return _vrVehicleTypeCertificate.getModule();
	}

	/**
	* Returns the other test report no of this vr vehicle type certificate.
	*
	* @return the other test report no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getOtherTestReportNo() {
		return _vrVehicleTypeCertificate.getOtherTestReportNo();
	}

	/**
	* Returns the production country of this vr vehicle type certificate.
	*
	* @return the production country of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getProductionCountry() {
		return _vrVehicleTypeCertificate.getProductionCountry();
	}

	/**
	* Returns the production plant address of this vr vehicle type certificate.
	*
	* @return the production plant address of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getProductionPlantAddress() {
		return _vrVehicleTypeCertificate.getProductionPlantAddress();
	}

	/**
	* Returns the production plant code of this vr vehicle type certificate.
	*
	* @return the production plant code of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrVehicleTypeCertificate.getProductionPlantCode();
	}

	/**
	* Returns the production plant name of this vr vehicle type certificate.
	*
	* @return the production plant name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getProductionPlantName() {
		return _vrVehicleTypeCertificate.getProductionPlantName();
	}

	/**
	* Returns the production plant representative of this vr vehicle type certificate.
	*
	* @return the production plant representative of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getProductionPlantRepresentative() {
		return _vrVehicleTypeCertificate.getProductionPlantRepresentative();
	}

	/**
	* Returns the production plant representative title of this vr vehicle type certificate.
	*
	* @return the production plant representative title of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getProductionPlantRepresentativeTitle() {
		return _vrVehicleTypeCertificate.getProductionPlantRepresentativeTitle();
	}

	/**
	* Returns the reference certificate no of this vr vehicle type certificate.
	*
	* @return the reference certificate no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getReferenceCertificateNo() {
		return _vrVehicleTypeCertificate.getReferenceCertificateNo();
	}

	/**
	* Returns the reference uid of this vr vehicle type certificate.
	*
	* @return the reference uid of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrVehicleTypeCertificate.getReferenceUid();
	}

	/**
	* Returns the registered number of this vr vehicle type certificate.
	*
	* @return the registered number of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getRegisteredNumber() {
		return _vrVehicleTypeCertificate.getRegisteredNumber();
	}

	/**
	* Returns the remarks of this vr vehicle type certificate.
	*
	* @return the remarks of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getRemarks() {
		return _vrVehicleTypeCertificate.getRemarks();
	}

	/**
	* Returns the safety test report no of this vr vehicle type certificate.
	*
	* @return the safety test report no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getSafetyTestReportNo() {
		return _vrVehicleTypeCertificate.getSafetyTestReportNo();
	}

	/**
	* Returns the sample commercial name of this vr vehicle type certificate.
	*
	* @return the sample commercial name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getSampleCommercialName() {
		return _vrVehicleTypeCertificate.getSampleCommercialName();
	}

	/**
	* Returns the sample engine no of this vr vehicle type certificate.
	*
	* @return the sample engine no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getSampleEngineNo() {
		return _vrVehicleTypeCertificate.getSampleEngineNo();
	}

	/**
	* Returns the sample frame no of this vr vehicle type certificate.
	*
	* @return the sample frame no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getSampleFrameNo() {
		return _vrVehicleTypeCertificate.getSampleFrameNo();
	}

	/**
	* Returns the sample model code of this vr vehicle type certificate.
	*
	* @return the sample model code of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getSampleModelCode() {
		return _vrVehicleTypeCertificate.getSampleModelCode();
	}

	/**
	* Returns the sample trademark of this vr vehicle type certificate.
	*
	* @return the sample trademark of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getSampleTrademark() {
		return _vrVehicleTypeCertificate.getSampleTrademark();
	}

	/**
	* Returns the sample trademark name of this vr vehicle type certificate.
	*
	* @return the sample trademark name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getSampleTrademarkName() {
		return _vrVehicleTypeCertificate.getSampleTrademarkName();
	}

	/**
	* Returns the sample vin no of this vr vehicle type certificate.
	*
	* @return the sample vin no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getSampleVINNo() {
		return _vrVehicleTypeCertificate.getSampleVINNo();
	}

	/**
	* Returns the sample vehicle type of this vr vehicle type certificate.
	*
	* @return the sample vehicle type of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getSampleVehicleType() {
		return _vrVehicleTypeCertificate.getSampleVehicleType();
	}

	/**
	* Returns the sample vehicle type description of this vr vehicle type certificate.
	*
	* @return the sample vehicle type description of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getSampleVehicleTypeDescription() {
		return _vrVehicleTypeCertificate.getSampleVehicleTypeDescription();
	}

	/**
	* Returns the service code of this vr vehicle type certificate.
	*
	* @return the service code of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getServiceCode() {
		return _vrVehicleTypeCertificate.getServiceCode();
	}

	/**
	* Returns the service name of this vr vehicle type certificate.
	*
	* @return the service name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getServiceName() {
		return _vrVehicleTypeCertificate.getServiceName();
	}

	/**
	* Returns the type approval certificate no of this vr vehicle type certificate.
	*
	* @return the type approval certificate no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getTypeApprovalCertificateNo() {
		return _vrVehicleTypeCertificate.getTypeApprovalCertificateNo();
	}

	/**
	* Returns the vehicle class of this vr vehicle type certificate.
	*
	* @return the vehicle class of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrVehicleTypeCertificate.getVehicleClass();
	}

	/**
	* Returns the verification certificate no of this vr vehicle type certificate.
	*
	* @return the verification certificate no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getVerificationCertificateNo() {
		return _vrVehicleTypeCertificate.getVerificationCertificateNo();
	}

	/**
	* Returns the verification ref no of this vr vehicle type certificate.
	*
	* @return the verification ref no of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getVerificationRefNo() {
		return _vrVehicleTypeCertificate.getVerificationRefNo();
	}

	/**
	* Returns the ward code of this vr vehicle type certificate.
	*
	* @return the ward code of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getWardCode() {
		return _vrVehicleTypeCertificate.getWardCode();
	}

	/**
	* Returns the ward name of this vr vehicle type certificate.
	*
	* @return the ward name of this vr vehicle type certificate
	*/
	@Override
	public java.lang.String getWardName() {
		return _vrVehicleTypeCertificate.getWardName();
	}

	@Override
	public java.lang.String toString() {
		return _vrVehicleTypeCertificate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrVehicleTypeCertificate.toXmlString();
	}

	/**
	* Returns the applicant ID date of this vr vehicle type certificate.
	*
	* @return the applicant ID date of this vr vehicle type certificate
	*/
	@Override
	public Date getApplicantIdDate() {
		return _vrVehicleTypeCertificate.getApplicantIdDate();
	}

	/**
	* Returns the certificate record date of this vr vehicle type certificate.
	*
	* @return the certificate record date of this vr vehicle type certificate
	*/
	@Override
	public Date getCertificateRecordDate() {
		return _vrVehicleTypeCertificate.getCertificateRecordDate();
	}

	/**
	* Returns the certificate record expire date of this vr vehicle type certificate.
	*
	* @return the certificate record expire date of this vr vehicle type certificate
	*/
	@Override
	public Date getCertificateRecordExpireDate() {
		return _vrVehicleTypeCertificate.getCertificateRecordExpireDate();
	}

	/**
	* Returns the cop report date of this vr vehicle type certificate.
	*
	* @return the cop report date of this vr vehicle type certificate
	*/
	@Override
	public Date getCopReportDate() {
		return _vrVehicleTypeCertificate.getCopReportDate();
	}

	/**
	* Returns the cop report expire date of this vr vehicle type certificate.
	*
	* @return the cop report expire date of this vr vehicle type certificate
	*/
	@Override
	public Date getCopReportExpireDate() {
		return _vrVehicleTypeCertificate.getCopReportExpireDate();
	}

	/**
	* Returns the customs declaration date of this vr vehicle type certificate.
	*
	* @return the customs declaration date of this vr vehicle type certificate
	*/
	@Override
	public Date getCustomsDeclarationDate() {
		return _vrVehicleTypeCertificate.getCustomsDeclarationDate();
	}

	/**
	* Returns the emission test report date of this vr vehicle type certificate.
	*
	* @return the emission test report date of this vr vehicle type certificate
	*/
	@Override
	public Date getEmissionTestReportDate() {
		return _vrVehicleTypeCertificate.getEmissionTestReportDate();
	}

	/**
	* Returns the inspection date of this vr vehicle type certificate.
	*
	* @return the inspection date of this vr vehicle type certificate
	*/
	@Override
	public Date getInspectionDate() {
		return _vrVehicleTypeCertificate.getInspectionDate();
	}

	/**
	* Returns the inspector cancel date of this vr vehicle type certificate.
	*
	* @return the inspector cancel date of this vr vehicle type certificate
	*/
	@Override
	public Date getInspectorCancelDate() {
		return _vrVehicleTypeCertificate.getInspectorCancelDate();
	}

	/**
	* Returns the inspector deadline of this vr vehicle type certificate.
	*
	* @return the inspector deadline of this vr vehicle type certificate
	*/
	@Override
	public Date getInspectorDeadline() {
		return _vrVehicleTypeCertificate.getInspectorDeadline();
	}

	/**
	* Returns the inspector finish date of this vr vehicle type certificate.
	*
	* @return the inspector finish date of this vr vehicle type certificate
	*/
	@Override
	public Date getInspectorFinishDate() {
		return _vrVehicleTypeCertificate.getInspectorFinishDate();
	}

	/**
	* Returns the inspector receive date of this vr vehicle type certificate.
	*
	* @return the inspector receive date of this vr vehicle type certificate
	*/
	@Override
	public Date getInspectorReceiveDate() {
		return _vrVehicleTypeCertificate.getInspectorReceiveDate();
	}

	/**
	* Returns the inspector submit date of this vr vehicle type certificate.
	*
	* @return the inspector submit date of this vr vehicle type certificate
	*/
	@Override
	public Date getInspectorSubmitDate() {
		return _vrVehicleTypeCertificate.getInspectorSubmitDate();
	}

	/**
	* Returns the inspectorendor sement date of this vr vehicle type certificate.
	*
	* @return the inspectorendor sement date of this vr vehicle type certificate
	*/
	@Override
	public Date getInspectorendorSementDate() {
		return _vrVehicleTypeCertificate.getInspectorendorSementDate();
	}

	/**
	* Returns the modify date of this vr vehicle type certificate.
	*
	* @return the modify date of this vr vehicle type certificate
	*/
	@Override
	public Date getModifyDate() {
		return _vrVehicleTypeCertificate.getModifyDate();
	}

	/**
	* Returns the other test report date of this vr vehicle type certificate.
	*
	* @return the other test report date of this vr vehicle type certificate
	*/
	@Override
	public Date getOtherTestReportDate() {
		return _vrVehicleTypeCertificate.getOtherTestReportDate();
	}

	/**
	* Returns the reference certificate date of this vr vehicle type certificate.
	*
	* @return the reference certificate date of this vr vehicle type certificate
	*/
	@Override
	public Date getReferenceCertificateDate() {
		return _vrVehicleTypeCertificate.getReferenceCertificateDate();
	}

	/**
	* Returns the safety test report date of this vr vehicle type certificate.
	*
	* @return the safety test report date of this vr vehicle type certificate
	*/
	@Override
	public Date getSafetyTestReportDate() {
		return _vrVehicleTypeCertificate.getSafetyTestReportDate();
	}

	/**
	* Returns the sync date of this vr vehicle type certificate.
	*
	* @return the sync date of this vr vehicle type certificate
	*/
	@Override
	public Date getSyncDate() {
		return _vrVehicleTypeCertificate.getSyncDate();
	}

	/**
	* Returns the type approval certificate date of this vr vehicle type certificate.
	*
	* @return the type approval certificate date of this vr vehicle type certificate
	*/
	@Override
	public Date getTypeApprovalCertificateDate() {
		return _vrVehicleTypeCertificate.getTypeApprovalCertificateDate();
	}

	/**
	* Returns the verification certificate date of this vr vehicle type certificate.
	*
	* @return the verification certificate date of this vr vehicle type certificate
	*/
	@Override
	public Date getVerificationCertificateDate() {
		return _vrVehicleTypeCertificate.getVerificationCertificateDate();
	}

	/**
	* Returns the verification ref date of this vr vehicle type certificate.
	*
	* @return the verification ref date of this vr vehicle type certificate
	*/
	@Override
	public Date getVerificationRefDate() {
		return _vrVehicleTypeCertificate.getVerificationRefDate();
	}

	/**
	* Returns the convertassemble ID of this vr vehicle type certificate.
	*
	* @return the convertassemble ID of this vr vehicle type certificate
	*/
	@Override
	public long getConvertassembleId() {
		return _vrVehicleTypeCertificate.getConvertassembleId();
	}

	/**
	* Returns the deliverable file entryid of this vr vehicle type certificate.
	*
	* @return the deliverable file entryid of this vr vehicle type certificate
	*/
	@Override
	public long getDeliverableFileEntryid() {
		return _vrVehicleTypeCertificate.getDeliverableFileEntryid();
	}

	/**
	* Returns the dossier ID of this vr vehicle type certificate.
	*
	* @return the dossier ID of this vr vehicle type certificate
	*/
	@Override
	public long getDossierId() {
		return _vrVehicleTypeCertificate.getDossierId();
	}

	/**
	* Returns the ID of this vr vehicle type certificate.
	*
	* @return the ID of this vr vehicle type certificate
	*/
	@Override
	public long getId() {
		return _vrVehicleTypeCertificate.getId();
	}

	/**
	* Returns the importer quantity of this vr vehicle type certificate.
	*
	* @return the importer quantity of this vr vehicle type certificate
	*/
	@Override
	public long getImporterQuantity() {
		return _vrVehicleTypeCertificate.getImporterQuantity();
	}

	/**
	* Returns the inspector ID of this vr vehicle type certificate.
	*
	* @return the inspector ID of this vr vehicle type certificate
	*/
	@Override
	public long getInspectorId() {
		return _vrVehicleTypeCertificate.getInspectorId();
	}

	/**
	* Returns the mt core of this vr vehicle type certificate.
	*
	* @return the mt core of this vr vehicle type certificate
	*/
	@Override
	public long getMtCore() {
		return _vrVehicleTypeCertificate.getMtCore();
	}

	/**
	* Returns the primary key of this vr vehicle type certificate.
	*
	* @return the primary key of this vr vehicle type certificate
	*/
	@Override
	public long getPrimaryKey() {
		return _vrVehicleTypeCertificate.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrVehicleTypeCertificate.persist();
	}

	/**
	* Sets the applicant address of this vr vehicle type certificate.
	*
	* @param applicantAddress the applicant address of this vr vehicle type certificate
	*/
	@Override
	public void setApplicantAddress(java.lang.String applicantAddress) {
		_vrVehicleTypeCertificate.setApplicantAddress(applicantAddress);
	}

	/**
	* Sets the applicant contact email of this vr vehicle type certificate.
	*
	* @param applicantContactEmail the applicant contact email of this vr vehicle type certificate
	*/
	@Override
	public void setApplicantContactEmail(java.lang.String applicantContactEmail) {
		_vrVehicleTypeCertificate.setApplicantContactEmail(applicantContactEmail);
	}

	/**
	* Sets the applicant contact name of this vr vehicle type certificate.
	*
	* @param applicantContactName the applicant contact name of this vr vehicle type certificate
	*/
	@Override
	public void setApplicantContactName(java.lang.String applicantContactName) {
		_vrVehicleTypeCertificate.setApplicantContactName(applicantContactName);
	}

	/**
	* Sets the applicant email of this vr vehicle type certificate.
	*
	* @param applicantEmail the applicant email of this vr vehicle type certificate
	*/
	@Override
	public void setApplicantEmail(java.lang.String applicantEmail) {
		_vrVehicleTypeCertificate.setApplicantEmail(applicantEmail);
	}

	/**
	* Sets the applicant fax of this vr vehicle type certificate.
	*
	* @param applicantFax the applicant fax of this vr vehicle type certificate
	*/
	@Override
	public void setApplicantFax(java.lang.String applicantFax) {
		_vrVehicleTypeCertificate.setApplicantFax(applicantFax);
	}

	/**
	* Sets the applicant ID date of this vr vehicle type certificate.
	*
	* @param applicantIdDate the applicant ID date of this vr vehicle type certificate
	*/
	@Override
	public void setApplicantIdDate(Date applicantIdDate) {
		_vrVehicleTypeCertificate.setApplicantIdDate(applicantIdDate);
	}

	/**
	* Sets the applicant ID no of this vr vehicle type certificate.
	*
	* @param applicantIdNo the applicant ID no of this vr vehicle type certificate
	*/
	@Override
	public void setApplicantIdNo(java.lang.String applicantIdNo) {
		_vrVehicleTypeCertificate.setApplicantIdNo(applicantIdNo);
	}

	/**
	* Sets the applicant name of this vr vehicle type certificate.
	*
	* @param applicantName the applicant name of this vr vehicle type certificate
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_vrVehicleTypeCertificate.setApplicantName(applicantName);
	}

	/**
	* Sets the applicant phone of this vr vehicle type certificate.
	*
	* @param applicantPhone the applicant phone of this vr vehicle type certificate
	*/
	@Override
	public void setApplicantPhone(java.lang.String applicantPhone) {
		_vrVehicleTypeCertificate.setApplicantPhone(applicantPhone);
	}

	/**
	* Sets the applicant representative of this vr vehicle type certificate.
	*
	* @param applicantRepresentative the applicant representative of this vr vehicle type certificate
	*/
	@Override
	public void setApplicantRepresentative(
		java.lang.String applicantRepresentative) {
		_vrVehicleTypeCertificate.setApplicantRepresentative(applicantRepresentative);
	}

	/**
	* Sets the applicant representative title of this vr vehicle type certificate.
	*
	* @param applicantRepresentativeTitle the applicant representative title of this vr vehicle type certificate
	*/
	@Override
	public void setApplicantRepresentativeTitle(
		java.lang.String applicantRepresentativeTitle) {
		_vrVehicleTypeCertificate.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
	}

	/**
	* Sets the applicant tel no of this vr vehicle type certificate.
	*
	* @param applicantTelNo the applicant tel no of this vr vehicle type certificate
	*/
	@Override
	public void setApplicantTelNo(java.lang.String applicantTelNo) {
		_vrVehicleTypeCertificate.setApplicantTelNo(applicantTelNo);
	}

	/**
	* Sets the applicantcontact phone of this vr vehicle type certificate.
	*
	* @param applicantcontactPhone the applicantcontact phone of this vr vehicle type certificate
	*/
	@Override
	public void setApplicantcontactPhone(java.lang.String applicantcontactPhone) {
		_vrVehicleTypeCertificate.setApplicantcontactPhone(applicantcontactPhone);
	}

	/**
	* Sets the applicantcontact tel no of this vr vehicle type certificate.
	*
	* @param applicantcontactTelNo the applicantcontact tel no of this vr vehicle type certificate
	*/
	@Override
	public void setApplicantcontactTelNo(java.lang.String applicantcontactTelNo) {
		_vrVehicleTypeCertificate.setApplicantcontactTelNo(applicantcontactTelNo);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrVehicleTypeCertificate.setCachedModel(cachedModel);
	}

	/**
	* Sets the certificate note of this vr vehicle type certificate.
	*
	* @param certificateNote the certificate note of this vr vehicle type certificate
	*/
	@Override
	public void setCertificateNote(java.lang.String certificateNote) {
		_vrVehicleTypeCertificate.setCertificateNote(certificateNote);
	}

	/**
	* Sets the certificate record date of this vr vehicle type certificate.
	*
	* @param certificateRecordDate the certificate record date of this vr vehicle type certificate
	*/
	@Override
	public void setCertificateRecordDate(Date certificateRecordDate) {
		_vrVehicleTypeCertificate.setCertificateRecordDate(certificateRecordDate);
	}

	/**
	* Sets the certificate record expire date of this vr vehicle type certificate.
	*
	* @param certificateRecordExpireDate the certificate record expire date of this vr vehicle type certificate
	*/
	@Override
	public void setCertificateRecordExpireDate(Date certificateRecordExpireDate) {
		_vrVehicleTypeCertificate.setCertificateRecordExpireDate(certificateRecordExpireDate);
	}

	/**
	* Sets the certificate record no of this vr vehicle type certificate.
	*
	* @param certificateRecordNo the certificate record no of this vr vehicle type certificate
	*/
	@Override
	public void setCertificateRecordNo(java.lang.String certificateRecordNo) {
		_vrVehicleTypeCertificate.setCertificateRecordNo(certificateRecordNo);
	}

	/**
	* Sets the certificate record status of this vr vehicle type certificate.
	*
	* @param certificateRecordStatus the certificate record status of this vr vehicle type certificate
	*/
	@Override
	public void setCertificateRecordStatus(
		java.lang.String certificateRecordStatus) {
		_vrVehicleTypeCertificate.setCertificateRecordStatus(certificateRecordStatus);
	}

	/**
	* Sets the certificate sign name of this vr vehicle type certificate.
	*
	* @param certificateSignName the certificate sign name of this vr vehicle type certificate
	*/
	@Override
	public void setCertificateSignName(java.lang.String certificateSignName) {
		_vrVehicleTypeCertificate.setCertificateSignName(certificateSignName);
	}

	/**
	* Sets the certificate sign place of this vr vehicle type certificate.
	*
	* @param certificateSignPlace the certificate sign place of this vr vehicle type certificate
	*/
	@Override
	public void setCertificateSignPlace(java.lang.String certificateSignPlace) {
		_vrVehicleTypeCertificate.setCertificateSignPlace(certificateSignPlace);
	}

	/**
	* Sets the certificate sign title of this vr vehicle type certificate.
	*
	* @param certificateSignTitle the certificate sign title of this vr vehicle type certificate
	*/
	@Override
	public void setCertificateSignTitle(java.lang.String certificateSignTitle) {
		_vrVehicleTypeCertificate.setCertificateSignTitle(certificateSignTitle);
	}

	/**
	* Sets the certificate type of this vr vehicle type certificate.
	*
	* @param certificateType the certificate type of this vr vehicle type certificate
	*/
	@Override
	public void setCertificateType(java.lang.String certificateType) {
		_vrVehicleTypeCertificate.setCertificateType(certificateType);
	}

	/**
	* Sets the certified assembly type of this vr vehicle type certificate.
	*
	* @param certifiedAssemblyType the certified assembly type of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedAssemblyType(java.lang.String certifiedAssemblyType) {
		_vrVehicleTypeCertificate.setCertifiedAssemblyType(certifiedAssemblyType);
	}

	/**
	* Sets the certified assembly type description of this vr vehicle type certificate.
	*
	* @param certifiedAssemblyTypeDescription the certified assembly type description of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedAssemblyTypeDescription(
		java.lang.String certifiedAssemblyTypeDescription) {
		_vrVehicleTypeCertificate.setCertifiedAssemblyTypeDescription(certifiedAssemblyTypeDescription);
	}

	/**
	* Sets the certified commercial name of this vr vehicle type certificate.
	*
	* @param certifiedCommercialName the certified commercial name of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedCommercialName(
		java.lang.String certifiedCommercialName) {
		_vrVehicleTypeCertificate.setCertifiedCommercialName(certifiedCommercialName);
	}

	/**
	* Sets the certified engine attach place of this vr vehicle type certificate.
	*
	* @param certifiedEngineAttachPlace the certified engine attach place of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedEngineAttachPlace(
		java.lang.String certifiedEngineAttachPlace) {
		_vrVehicleTypeCertificate.setCertifiedEngineAttachPlace(certifiedEngineAttachPlace);
	}

	/**
	* Sets the certified engine no of this vr vehicle type certificate.
	*
	* @param certifiedEngineNo the certified engine no of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedEngineNo(java.lang.String certifiedEngineNo) {
		_vrVehicleTypeCertificate.setCertifiedEngineNo(certifiedEngineNo);
	}

	/**
	* Sets the certified engine position of this vr vehicle type certificate.
	*
	* @param certifiedEnginePosition the certified engine position of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedEnginePosition(
		java.lang.String certifiedEnginePosition) {
		_vrVehicleTypeCertificate.setCertifiedEnginePosition(certifiedEnginePosition);
	}

	/**
	* Sets the certified frame attach place of this vr vehicle type certificate.
	*
	* @param certifiedFrameAttachPlace the certified frame attach place of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedFrameAttachPlace(
		java.lang.String certifiedFrameAttachPlace) {
		_vrVehicleTypeCertificate.setCertifiedFrameAttachPlace(certifiedFrameAttachPlace);
	}

	/**
	* Sets the certified frame no of this vr vehicle type certificate.
	*
	* @param certifiedFrameNo the certified frame no of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedFrameNo(java.lang.String certifiedFrameNo) {
		_vrVehicleTypeCertificate.setCertifiedFrameNo(certifiedFrameNo);
	}

	/**
	* Sets the certified frame position of this vr vehicle type certificate.
	*
	* @param certifiedFramePosition the certified frame position of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedFramePosition(
		java.lang.String certifiedFramePosition) {
		_vrVehicleTypeCertificate.setCertifiedFramePosition(certifiedFramePosition);
	}

	/**
	* Sets the certified model code of this vr vehicle type certificate.
	*
	* @param certifiedModelCode the certified model code of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedModelCode(java.lang.String certifiedModelCode) {
		_vrVehicleTypeCertificate.setCertifiedModelCode(certifiedModelCode);
	}

	/**
	* Sets the certified trademark of this vr vehicle type certificate.
	*
	* @param certifiedTrademark the certified trademark of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedTrademark(java.lang.String certifiedTrademark) {
		_vrVehicleTypeCertificate.setCertifiedTrademark(certifiedTrademark);
	}

	/**
	* Sets the certified trademark name of this vr vehicle type certificate.
	*
	* @param certifiedTrademarkName the certified trademark name of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedTrademarkName(
		java.lang.String certifiedTrademarkName) {
		_vrVehicleTypeCertificate.setCertifiedTrademarkName(certifiedTrademarkName);
	}

	/**
	* Sets the certified vin no of this vr vehicle type certificate.
	*
	* @param certifiedVINNo the certified vin no of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedVINNo(java.lang.String certifiedVINNo) {
		_vrVehicleTypeCertificate.setCertifiedVINNo(certifiedVINNo);
	}

	/**
	* Sets the certified vin position of this vr vehicle type certificate.
	*
	* @param certifiedVINPosition the certified vin position of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedVINPosition(java.lang.String certifiedVINPosition) {
		_vrVehicleTypeCertificate.setCertifiedVINPosition(certifiedVINPosition);
	}

	/**
	* Sets the certified vehicle type of this vr vehicle type certificate.
	*
	* @param certifiedVehicleType the certified vehicle type of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedVehicleType(java.lang.String certifiedVehicleType) {
		_vrVehicleTypeCertificate.setCertifiedVehicleType(certifiedVehicleType);
	}

	/**
	* Sets the certified vehicle type description of this vr vehicle type certificate.
	*
	* @param certifiedVehicleTypeDescription the certified vehicle type description of this vr vehicle type certificate
	*/
	@Override
	public void setCertifiedVehicleTypeDescription(
		java.lang.String certifiedVehicleTypeDescription) {
		_vrVehicleTypeCertificate.setCertifiedVehicleTypeDescription(certifiedVehicleTypeDescription);
	}

	/**
	* Sets the city code of this vr vehicle type certificate.
	*
	* @param cityCode the city code of this vr vehicle type certificate
	*/
	@Override
	public void setCityCode(java.lang.String cityCode) {
		_vrVehicleTypeCertificate.setCityCode(cityCode);
	}

	/**
	* Sets the city name of this vr vehicle type certificate.
	*
	* @param cityName the city name of this vr vehicle type certificate
	*/
	@Override
	public void setCityName(java.lang.String cityName) {
		_vrVehicleTypeCertificate.setCityName(cityName);
	}

	/**
	* Sets the common safety description of this vr vehicle type certificate.
	*
	* @param commonSafetyDescription the common safety description of this vr vehicle type certificate
	*/
	@Override
	public void setCommonSafetyDescription(
		java.lang.String commonSafetyDescription) {
		_vrVehicleTypeCertificate.setCommonSafetyDescription(commonSafetyDescription);
	}

	/**
	* Sets the common safety standard of this vr vehicle type certificate.
	*
	* @param commonSafetyStandard the common safety standard of this vr vehicle type certificate
	*/
	@Override
	public void setCommonSafetyStandard(java.lang.String commonSafetyStandard) {
		_vrVehicleTypeCertificate.setCommonSafetyStandard(commonSafetyStandard);
	}

	/**
	* Sets the convertassemble ID of this vr vehicle type certificate.
	*
	* @param convertassembleId the convertassemble ID of this vr vehicle type certificate
	*/
	@Override
	public void setConvertassembleId(long convertassembleId) {
		_vrVehicleTypeCertificate.setConvertassembleId(convertassembleId);
	}

	/**
	* Sets the cop report date of this vr vehicle type certificate.
	*
	* @param copReportDate the cop report date of this vr vehicle type certificate
	*/
	@Override
	public void setCopReportDate(Date copReportDate) {
		_vrVehicleTypeCertificate.setCopReportDate(copReportDate);
	}

	/**
	* Sets the cop report expire date of this vr vehicle type certificate.
	*
	* @param copReportExpireDate the cop report expire date of this vr vehicle type certificate
	*/
	@Override
	public void setCopReportExpireDate(Date copReportExpireDate) {
		_vrVehicleTypeCertificate.setCopReportExpireDate(copReportExpireDate);
	}

	/**
	* Sets the cop report no of this vr vehicle type certificate.
	*
	* @param copReportNo the cop report no of this vr vehicle type certificate
	*/
	@Override
	public void setCopReportNo(java.lang.String copReportNo) {
		_vrVehicleTypeCertificate.setCopReportNo(copReportNo);
	}

	/**
	* Sets the corporation ID of this vr vehicle type certificate.
	*
	* @param corporationId the corporation ID of this vr vehicle type certificate
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_vrVehicleTypeCertificate.setCorporationId(corporationId);
	}

	/**
	* Sets the customs declaration date of this vr vehicle type certificate.
	*
	* @param customsDeclarationDate the customs declaration date of this vr vehicle type certificate
	*/
	@Override
	public void setCustomsDeclarationDate(Date customsDeclarationDate) {
		_vrVehicleTypeCertificate.setCustomsDeclarationDate(customsDeclarationDate);
	}

	/**
	* Sets the customs declaration no of this vr vehicle type certificate.
	*
	* @param customsDeclarationNo the customs declaration no of this vr vehicle type certificate
	*/
	@Override
	public void setCustomsDeclarationNo(java.lang.String customsDeclarationNo) {
		_vrVehicleTypeCertificate.setCustomsDeclarationNo(customsDeclarationNo);
	}

	/**
	* Sets the deliverable code of this vr vehicle type certificate.
	*
	* @param deliverableCode the deliverable code of this vr vehicle type certificate
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrVehicleTypeCertificate.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the deliverable file entryid of this vr vehicle type certificate.
	*
	* @param deliverableFileEntryid the deliverable file entryid of this vr vehicle type certificate
	*/
	@Override
	public void setDeliverableFileEntryid(long deliverableFileEntryid) {
		_vrVehicleTypeCertificate.setDeliverableFileEntryid(deliverableFileEntryid);
	}

	/**
	* Sets the design model code of this vr vehicle type certificate.
	*
	* @param designModelCode the design model code of this vr vehicle type certificate
	*/
	@Override
	public void setDesignModelCode(java.lang.String designModelCode) {
		_vrVehicleTypeCertificate.setDesignModelCode(designModelCode);
	}

	/**
	* Sets the design model description of this vr vehicle type certificate.
	*
	* @param designModelDescription the design model description of this vr vehicle type certificate
	*/
	@Override
	public void setDesignModelDescription(
		java.lang.String designModelDescription) {
		_vrVehicleTypeCertificate.setDesignModelDescription(designModelDescription);
	}

	/**
	* Sets the design symbol of this vr vehicle type certificate.
	*
	* @param designSymbol the design symbol of this vr vehicle type certificate
	*/
	@Override
	public void setDesignSymbol(java.lang.String designSymbol) {
		_vrVehicleTypeCertificate.setDesignSymbol(designSymbol);
	}

	/**
	* Sets the designer address of this vr vehicle type certificate.
	*
	* @param designerAddress the designer address of this vr vehicle type certificate
	*/
	@Override
	public void setDesignerAddress(java.lang.String designerAddress) {
		_vrVehicleTypeCertificate.setDesignerAddress(designerAddress);
	}

	/**
	* Sets the designer code of this vr vehicle type certificate.
	*
	* @param designerCode the designer code of this vr vehicle type certificate
	*/
	@Override
	public void setDesignerCode(java.lang.String designerCode) {
		_vrVehicleTypeCertificate.setDesignerCode(designerCode);
	}

	/**
	* Sets the designer email of this vr vehicle type certificate.
	*
	* @param designerEmail the designer email of this vr vehicle type certificate
	*/
	@Override
	public void setDesignerEmail(java.lang.String designerEmail) {
		_vrVehicleTypeCertificate.setDesignerEmail(designerEmail);
	}

	/**
	* Sets the designer fax of this vr vehicle type certificate.
	*
	* @param designerFax the designer fax of this vr vehicle type certificate
	*/
	@Override
	public void setDesignerFax(java.lang.String designerFax) {
		_vrVehicleTypeCertificate.setDesignerFax(designerFax);
	}

	/**
	* Sets the designer name of this vr vehicle type certificate.
	*
	* @param designerName the designer name of this vr vehicle type certificate
	*/
	@Override
	public void setDesignerName(java.lang.String designerName) {
		_vrVehicleTypeCertificate.setDesignerName(designerName);
	}

	/**
	* Sets the designer phone of this vr vehicle type certificate.
	*
	* @param designerPhone the designer phone of this vr vehicle type certificate
	*/
	@Override
	public void setDesignerPhone(java.lang.String designerPhone) {
		_vrVehicleTypeCertificate.setDesignerPhone(designerPhone);
	}

	/**
	* Sets the designer representative of this vr vehicle type certificate.
	*
	* @param designerRepresentative the designer representative of this vr vehicle type certificate
	*/
	@Override
	public void setDesignerRepresentative(
		java.lang.String designerRepresentative) {
		_vrVehicleTypeCertificate.setDesignerRepresentative(designerRepresentative);
	}

	/**
	* Sets the designer representative title of this vr vehicle type certificate.
	*
	* @param designerRepresentativeTitle the designer representative title of this vr vehicle type certificate
	*/
	@Override
	public void setDesignerRepresentativeTitle(
		java.lang.String designerRepresentativeTitle) {
		_vrVehicleTypeCertificate.setDesignerRepresentativeTitle(designerRepresentativeTitle);
	}

	/**
	* Sets the digital issue status of this vr vehicle type certificate.
	*
	* @param digitalIssueStatus the digital issue status of this vr vehicle type certificate
	*/
	@Override
	public void setDigitalIssueStatus(java.lang.String digitalIssueStatus) {
		_vrVehicleTypeCertificate.setDigitalIssueStatus(digitalIssueStatus);
	}

	/**
	* Sets the district code of this vr vehicle type certificate.
	*
	* @param districtCode the district code of this vr vehicle type certificate
	*/
	@Override
	public void setDistrictCode(java.lang.String districtCode) {
		_vrVehicleTypeCertificate.setDistrictCode(districtCode);
	}

	/**
	* Sets the district name of this vr vehicle type certificate.
	*
	* @param districtName the district name of this vr vehicle type certificate
	*/
	@Override
	public void setDistrictName(java.lang.String districtName) {
		_vrVehicleTypeCertificate.setDistrictName(districtName);
	}

	/**
	* Sets the dossier ID of this vr vehicle type certificate.
	*
	* @param dossierId the dossier ID of this vr vehicle type certificate
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrVehicleTypeCertificate.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr vehicle type certificate.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr vehicle type certificate
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrVehicleTypeCertificate.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr vehicle type certificate.
	*
	* @param dossierNo the dossier no of this vr vehicle type certificate
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrVehicleTypeCertificate.setDossierNo(dossierNo);
	}

	/**
	* Sets the dossier type of this vr vehicle type certificate.
	*
	* @param dossierType the dossier type of this vr vehicle type certificate
	*/
	@Override
	public void setDossierType(java.lang.String dossierType) {
		_vrVehicleTypeCertificate.setDossierType(dossierType);
	}

	/**
	* Sets the emission description of this vr vehicle type certificate.
	*
	* @param emissionDescription the emission description of this vr vehicle type certificate
	*/
	@Override
	public void setEmissionDescription(java.lang.String emissionDescription) {
		_vrVehicleTypeCertificate.setEmissionDescription(emissionDescription);
	}

	/**
	* Sets the emission standard of this vr vehicle type certificate.
	*
	* @param emissionStandard the emission standard of this vr vehicle type certificate
	*/
	@Override
	public void setEmissionStandard(java.lang.String emissionStandard) {
		_vrVehicleTypeCertificate.setEmissionStandard(emissionStandard);
	}

	/**
	* Sets the emission test report date of this vr vehicle type certificate.
	*
	* @param emissionTestReportDate the emission test report date of this vr vehicle type certificate
	*/
	@Override
	public void setEmissionTestReportDate(Date emissionTestReportDate) {
		_vrVehicleTypeCertificate.setEmissionTestReportDate(emissionTestReportDate);
	}

	/**
	* Sets the emission test report no of this vr vehicle type certificate.
	*
	* @param emissionTestReportNo the emission test report no of this vr vehicle type certificate
	*/
	@Override
	public void setEmissionTestReportNo(java.lang.String emissionTestReportNo) {
		_vrVehicleTypeCertificate.setEmissionTestReportNo(emissionTestReportNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrVehicleTypeCertificate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrVehicleTypeCertificate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrVehicleTypeCertificate.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expired status of this vr vehicle type certificate.
	*
	* @param expiredStatus the expired status of this vr vehicle type certificate
	*/
	@Override
	public void setExpiredStatus(java.lang.String expiredStatus) {
		_vrVehicleTypeCertificate.setExpiredStatus(expiredStatus);
	}

	/**
	* Sets the ID of this vr vehicle type certificate.
	*
	* @param id the ID of this vr vehicle type certificate
	*/
	@Override
	public void setId(long id) {
		_vrVehicleTypeCertificate.setId(id);
	}

	/**
	* Sets the importer quantity of this vr vehicle type certificate.
	*
	* @param importerQuantity the importer quantity of this vr vehicle type certificate
	*/
	@Override
	public void setImporterQuantity(long importerQuantity) {
		_vrVehicleTypeCertificate.setImporterQuantity(importerQuantity);
	}

	/**
	* Sets the inspection date of this vr vehicle type certificate.
	*
	* @param inspectionDate the inspection date of this vr vehicle type certificate
	*/
	@Override
	public void setInspectionDate(Date inspectionDate) {
		_vrVehicleTypeCertificate.setInspectionDate(inspectionDate);
	}

	/**
	* Sets the inspection district code of this vr vehicle type certificate.
	*
	* @param inspectionDistrictCode the inspection district code of this vr vehicle type certificate
	*/
	@Override
	public void setInspectionDistrictCode(
		java.lang.String inspectionDistrictCode) {
		_vrVehicleTypeCertificate.setInspectionDistrictCode(inspectionDistrictCode);
	}

	/**
	* Sets the inspection district name of this vr vehicle type certificate.
	*
	* @param inspectionDistrictName the inspection district name of this vr vehicle type certificate
	*/
	@Override
	public void setInspectionDistrictName(
		java.lang.String inspectionDistrictName) {
		_vrVehicleTypeCertificate.setInspectionDistrictName(inspectionDistrictName);
	}

	/**
	* Sets the inspection note of this vr vehicle type certificate.
	*
	* @param inspectionNote the inspection note of this vr vehicle type certificate
	*/
	@Override
	public void setInspectionNote(java.lang.String inspectionNote) {
		_vrVehicleTypeCertificate.setInspectionNote(inspectionNote);
	}

	/**
	* Sets the inspection province code of this vr vehicle type certificate.
	*
	* @param inspectionProvinceCode the inspection province code of this vr vehicle type certificate
	*/
	@Override
	public void setInspectionProvinceCode(
		java.lang.String inspectionProvinceCode) {
		_vrVehicleTypeCertificate.setInspectionProvinceCode(inspectionProvinceCode);
	}

	/**
	* Sets the inspection province name of this vr vehicle type certificate.
	*
	* @param inspectionProvinceName the inspection province name of this vr vehicle type certificate
	*/
	@Override
	public void setInspectionProvinceName(
		java.lang.String inspectionProvinceName) {
		_vrVehicleTypeCertificate.setInspectionProvinceName(inspectionProvinceName);
	}

	/**
	* Sets the inspection record no of this vr vehicle type certificate.
	*
	* @param inspectionRecordNo the inspection record no of this vr vehicle type certificate
	*/
	@Override
	public void setInspectionRecordNo(java.lang.String inspectionRecordNo) {
		_vrVehicleTypeCertificate.setInspectionRecordNo(inspectionRecordNo);
	}

	/**
	* Sets the inspection site of this vr vehicle type certificate.
	*
	* @param inspectionSite the inspection site of this vr vehicle type certificate
	*/
	@Override
	public void setInspectionSite(java.lang.String inspectionSite) {
		_vrVehicleTypeCertificate.setInspectionSite(inspectionSite);
	}

	/**
	* Sets the inspector cancel date of this vr vehicle type certificate.
	*
	* @param inspectorCancelDate the inspector cancel date of this vr vehicle type certificate
	*/
	@Override
	public void setInspectorCancelDate(Date inspectorCancelDate) {
		_vrVehicleTypeCertificate.setInspectorCancelDate(inspectorCancelDate);
	}

	/**
	* Sets the inspector deadline of this vr vehicle type certificate.
	*
	* @param inspectorDeadline the inspector deadline of this vr vehicle type certificate
	*/
	@Override
	public void setInspectorDeadline(Date inspectorDeadline) {
		_vrVehicleTypeCertificate.setInspectorDeadline(inspectorDeadline);
	}

	/**
	* Sets the inspector division of this vr vehicle type certificate.
	*
	* @param inspectorDivision the inspector division of this vr vehicle type certificate
	*/
	@Override
	public void setInspectorDivision(java.lang.String inspectorDivision) {
		_vrVehicleTypeCertificate.setInspectorDivision(inspectorDivision);
	}

	/**
	* Sets the inspector finish date of this vr vehicle type certificate.
	*
	* @param inspectorFinishDate the inspector finish date of this vr vehicle type certificate
	*/
	@Override
	public void setInspectorFinishDate(Date inspectorFinishDate) {
		_vrVehicleTypeCertificate.setInspectorFinishDate(inspectorFinishDate);
	}

	/**
	* Sets the inspector ID of this vr vehicle type certificate.
	*
	* @param inspectorId the inspector ID of this vr vehicle type certificate
	*/
	@Override
	public void setInspectorId(long inspectorId) {
		_vrVehicleTypeCertificate.setInspectorId(inspectorId);
	}

	/**
	* Sets the inspector organization of this vr vehicle type certificate.
	*
	* @param inspectorOrganization the inspector organization of this vr vehicle type certificate
	*/
	@Override
	public void setInspectorOrganization(java.lang.String inspectorOrganization) {
		_vrVehicleTypeCertificate.setInspectorOrganization(inspectorOrganization);
	}

	/**
	* Sets the inspector receive date of this vr vehicle type certificate.
	*
	* @param inspectorReceiveDate the inspector receive date of this vr vehicle type certificate
	*/
	@Override
	public void setInspectorReceiveDate(Date inspectorReceiveDate) {
		_vrVehicleTypeCertificate.setInspectorReceiveDate(inspectorReceiveDate);
	}

	/**
	* Sets the inspector sign name of this vr vehicle type certificate.
	*
	* @param inspectorSignName the inspector sign name of this vr vehicle type certificate
	*/
	@Override
	public void setInspectorSignName(java.lang.String inspectorSignName) {
		_vrVehicleTypeCertificate.setInspectorSignName(inspectorSignName);
	}

	/**
	* Sets the inspector sign place of this vr vehicle type certificate.
	*
	* @param inspectorSignPlace the inspector sign place of this vr vehicle type certificate
	*/
	@Override
	public void setInspectorSignPlace(java.lang.String inspectorSignPlace) {
		_vrVehicleTypeCertificate.setInspectorSignPlace(inspectorSignPlace);
	}

	/**
	* Sets the inspector sign title of this vr vehicle type certificate.
	*
	* @param inspectorSignTitle the inspector sign title of this vr vehicle type certificate
	*/
	@Override
	public void setInspectorSignTitle(java.lang.String inspectorSignTitle) {
		_vrVehicleTypeCertificate.setInspectorSignTitle(inspectorSignTitle);
	}

	/**
	* Sets the inspector submit date of this vr vehicle type certificate.
	*
	* @param inspectorSubmitDate the inspector submit date of this vr vehicle type certificate
	*/
	@Override
	public void setInspectorSubmitDate(Date inspectorSubmitDate) {
		_vrVehicleTypeCertificate.setInspectorSubmitDate(inspectorSubmitDate);
	}

	/**
	* Sets the inspectorendor sement date of this vr vehicle type certificate.
	*
	* @param inspectorendorSementDate the inspectorendor sement date of this vr vehicle type certificate
	*/
	@Override
	public void setInspectorendorSementDate(Date inspectorendorSementDate) {
		_vrVehicleTypeCertificate.setInspectorendorSementDate(inspectorendorSementDate);
	}

	/**
	* Sets the manufacturer address of this vr vehicle type certificate.
	*
	* @param manufacturerAddress the manufacturer address of this vr vehicle type certificate
	*/
	@Override
	public void setManufacturerAddress(java.lang.String manufacturerAddress) {
		_vrVehicleTypeCertificate.setManufacturerAddress(manufacturerAddress);
	}

	/**
	* Sets the manufacturer email of this vr vehicle type certificate.
	*
	* @param manufacturerEmail the manufacturer email of this vr vehicle type certificate
	*/
	@Override
	public void setManufacturerEmail(java.lang.String manufacturerEmail) {
		_vrVehicleTypeCertificate.setManufacturerEmail(manufacturerEmail);
	}

	/**
	* Sets the manufacturer fax of this vr vehicle type certificate.
	*
	* @param manufacturerFax the manufacturer fax of this vr vehicle type certificate
	*/
	@Override
	public void setManufacturerFax(java.lang.String manufacturerFax) {
		_vrVehicleTypeCertificate.setManufacturerFax(manufacturerFax);
	}

	/**
	* Sets the manufacturer foreign code of this vr vehicle type certificate.
	*
	* @param manufacturerForeignCode the manufacturer foreign code of this vr vehicle type certificate
	*/
	@Override
	public void setManufacturerForeignCode(
		java.lang.String manufacturerForeignCode) {
		_vrVehicleTypeCertificate.setManufacturerForeignCode(manufacturerForeignCode);
	}

	/**
	* Sets the manufacturer name of this vr vehicle type certificate.
	*
	* @param manufacturerName the manufacturer name of this vr vehicle type certificate
	*/
	@Override
	public void setManufacturerName(java.lang.String manufacturerName) {
		_vrVehicleTypeCertificate.setManufacturerName(manufacturerName);
	}

	/**
	* Sets the manufacturer phone of this vr vehicle type certificate.
	*
	* @param manufacturerPhone the manufacturer phone of this vr vehicle type certificate
	*/
	@Override
	public void setManufacturerPhone(java.lang.String manufacturerPhone) {
		_vrVehicleTypeCertificate.setManufacturerPhone(manufacturerPhone);
	}

	/**
	* Sets the manufacturer representative of this vr vehicle type certificate.
	*
	* @param manufacturerRepresentative the manufacturer representative of this vr vehicle type certificate
	*/
	@Override
	public void setManufacturerRepresentative(
		java.lang.String manufacturerRepresentative) {
		_vrVehicleTypeCertificate.setManufacturerRepresentative(manufacturerRepresentative);
	}

	/**
	* Sets the manufacturer representative title of this vr vehicle type certificate.
	*
	* @param manufacturerRepresentativeTitle the manufacturer representative title of this vr vehicle type certificate
	*/
	@Override
	public void setManufacturerRepresentativeTitle(
		java.lang.String manufacturerRepresentativeTitle) {
		_vrVehicleTypeCertificate.setManufacturerRepresentativeTitle(manufacturerRepresentativeTitle);
	}

	/**
	* Sets the modify date of this vr vehicle type certificate.
	*
	* @param modifyDate the modify date of this vr vehicle type certificate
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrVehicleTypeCertificate.setModifyDate(modifyDate);
	}

	/**
	* Sets the module of this vr vehicle type certificate.
	*
	* @param module the module of this vr vehicle type certificate
	*/
	@Override
	public void setModule(java.lang.String module) {
		_vrVehicleTypeCertificate.setModule(module);
	}

	/**
	* Sets the mt core of this vr vehicle type certificate.
	*
	* @param mtCore the mt core of this vr vehicle type certificate
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrVehicleTypeCertificate.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrVehicleTypeCertificate.setNew(n);
	}

	/**
	* Sets the other test report date of this vr vehicle type certificate.
	*
	* @param otherTestReportDate the other test report date of this vr vehicle type certificate
	*/
	@Override
	public void setOtherTestReportDate(Date otherTestReportDate) {
		_vrVehicleTypeCertificate.setOtherTestReportDate(otherTestReportDate);
	}

	/**
	* Sets the other test report no of this vr vehicle type certificate.
	*
	* @param otherTestReportNo the other test report no of this vr vehicle type certificate
	*/
	@Override
	public void setOtherTestReportNo(java.lang.String otherTestReportNo) {
		_vrVehicleTypeCertificate.setOtherTestReportNo(otherTestReportNo);
	}

	/**
	* Sets the primary key of this vr vehicle type certificate.
	*
	* @param primaryKey the primary key of this vr vehicle type certificate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrVehicleTypeCertificate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrVehicleTypeCertificate.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production country of this vr vehicle type certificate.
	*
	* @param productionCountry the production country of this vr vehicle type certificate
	*/
	@Override
	public void setProductionCountry(java.lang.String productionCountry) {
		_vrVehicleTypeCertificate.setProductionCountry(productionCountry);
	}

	/**
	* Sets the production plant address of this vr vehicle type certificate.
	*
	* @param productionPlantAddress the production plant address of this vr vehicle type certificate
	*/
	@Override
	public void setProductionPlantAddress(
		java.lang.String productionPlantAddress) {
		_vrVehicleTypeCertificate.setProductionPlantAddress(productionPlantAddress);
	}

	/**
	* Sets the production plant code of this vr vehicle type certificate.
	*
	* @param productionPlantCode the production plant code of this vr vehicle type certificate
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrVehicleTypeCertificate.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the production plant name of this vr vehicle type certificate.
	*
	* @param productionPlantName the production plant name of this vr vehicle type certificate
	*/
	@Override
	public void setProductionPlantName(java.lang.String productionPlantName) {
		_vrVehicleTypeCertificate.setProductionPlantName(productionPlantName);
	}

	/**
	* Sets the production plant representative of this vr vehicle type certificate.
	*
	* @param productionPlantRepresentative the production plant representative of this vr vehicle type certificate
	*/
	@Override
	public void setProductionPlantRepresentative(
		java.lang.String productionPlantRepresentative) {
		_vrVehicleTypeCertificate.setProductionPlantRepresentative(productionPlantRepresentative);
	}

	/**
	* Sets the production plant representative title of this vr vehicle type certificate.
	*
	* @param productionPlantRepresentativeTitle the production plant representative title of this vr vehicle type certificate
	*/
	@Override
	public void setProductionPlantRepresentativeTitle(
		java.lang.String productionPlantRepresentativeTitle) {
		_vrVehicleTypeCertificate.setProductionPlantRepresentativeTitle(productionPlantRepresentativeTitle);
	}

	/**
	* Sets the reference certificate date of this vr vehicle type certificate.
	*
	* @param referenceCertificateDate the reference certificate date of this vr vehicle type certificate
	*/
	@Override
	public void setReferenceCertificateDate(Date referenceCertificateDate) {
		_vrVehicleTypeCertificate.setReferenceCertificateDate(referenceCertificateDate);
	}

	/**
	* Sets the reference certificate no of this vr vehicle type certificate.
	*
	* @param referenceCertificateNo the reference certificate no of this vr vehicle type certificate
	*/
	@Override
	public void setReferenceCertificateNo(
		java.lang.String referenceCertificateNo) {
		_vrVehicleTypeCertificate.setReferenceCertificateNo(referenceCertificateNo);
	}

	/**
	* Sets the reference uid of this vr vehicle type certificate.
	*
	* @param referenceUid the reference uid of this vr vehicle type certificate
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrVehicleTypeCertificate.setReferenceUid(referenceUid);
	}

	/**
	* Sets the registered number of this vr vehicle type certificate.
	*
	* @param registeredNumber the registered number of this vr vehicle type certificate
	*/
	@Override
	public void setRegisteredNumber(java.lang.String registeredNumber) {
		_vrVehicleTypeCertificate.setRegisteredNumber(registeredNumber);
	}

	/**
	* Sets the remarks of this vr vehicle type certificate.
	*
	* @param remarks the remarks of this vr vehicle type certificate
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_vrVehicleTypeCertificate.setRemarks(remarks);
	}

	/**
	* Sets the safety test report date of this vr vehicle type certificate.
	*
	* @param safetyTestReportDate the safety test report date of this vr vehicle type certificate
	*/
	@Override
	public void setSafetyTestReportDate(Date safetyTestReportDate) {
		_vrVehicleTypeCertificate.setSafetyTestReportDate(safetyTestReportDate);
	}

	/**
	* Sets the safety test report no of this vr vehicle type certificate.
	*
	* @param safetyTestReportNo the safety test report no of this vr vehicle type certificate
	*/
	@Override
	public void setSafetyTestReportNo(java.lang.String safetyTestReportNo) {
		_vrVehicleTypeCertificate.setSafetyTestReportNo(safetyTestReportNo);
	}

	/**
	* Sets the sample commercial name of this vr vehicle type certificate.
	*
	* @param sampleCommercialName the sample commercial name of this vr vehicle type certificate
	*/
	@Override
	public void setSampleCommercialName(java.lang.String sampleCommercialName) {
		_vrVehicleTypeCertificate.setSampleCommercialName(sampleCommercialName);
	}

	/**
	* Sets the sample engine no of this vr vehicle type certificate.
	*
	* @param sampleEngineNo the sample engine no of this vr vehicle type certificate
	*/
	@Override
	public void setSampleEngineNo(java.lang.String sampleEngineNo) {
		_vrVehicleTypeCertificate.setSampleEngineNo(sampleEngineNo);
	}

	/**
	* Sets the sample frame no of this vr vehicle type certificate.
	*
	* @param sampleFrameNo the sample frame no of this vr vehicle type certificate
	*/
	@Override
	public void setSampleFrameNo(java.lang.String sampleFrameNo) {
		_vrVehicleTypeCertificate.setSampleFrameNo(sampleFrameNo);
	}

	/**
	* Sets the sample model code of this vr vehicle type certificate.
	*
	* @param sampleModelCode the sample model code of this vr vehicle type certificate
	*/
	@Override
	public void setSampleModelCode(java.lang.String sampleModelCode) {
		_vrVehicleTypeCertificate.setSampleModelCode(sampleModelCode);
	}

	/**
	* Sets the sample trademark of this vr vehicle type certificate.
	*
	* @param sampleTrademark the sample trademark of this vr vehicle type certificate
	*/
	@Override
	public void setSampleTrademark(java.lang.String sampleTrademark) {
		_vrVehicleTypeCertificate.setSampleTrademark(sampleTrademark);
	}

	/**
	* Sets the sample trademark name of this vr vehicle type certificate.
	*
	* @param sampleTrademarkName the sample trademark name of this vr vehicle type certificate
	*/
	@Override
	public void setSampleTrademarkName(java.lang.String sampleTrademarkName) {
		_vrVehicleTypeCertificate.setSampleTrademarkName(sampleTrademarkName);
	}

	/**
	* Sets the sample vin no of this vr vehicle type certificate.
	*
	* @param sampleVINNo the sample vin no of this vr vehicle type certificate
	*/
	@Override
	public void setSampleVINNo(java.lang.String sampleVINNo) {
		_vrVehicleTypeCertificate.setSampleVINNo(sampleVINNo);
	}

	/**
	* Sets the sample vehicle type of this vr vehicle type certificate.
	*
	* @param sampleVehicleType the sample vehicle type of this vr vehicle type certificate
	*/
	@Override
	public void setSampleVehicleType(java.lang.String sampleVehicleType) {
		_vrVehicleTypeCertificate.setSampleVehicleType(sampleVehicleType);
	}

	/**
	* Sets the sample vehicle type description of this vr vehicle type certificate.
	*
	* @param sampleVehicleTypeDescription the sample vehicle type description of this vr vehicle type certificate
	*/
	@Override
	public void setSampleVehicleTypeDescription(
		java.lang.String sampleVehicleTypeDescription) {
		_vrVehicleTypeCertificate.setSampleVehicleTypeDescription(sampleVehicleTypeDescription);
	}

	/**
	* Sets the service code of this vr vehicle type certificate.
	*
	* @param serviceCode the service code of this vr vehicle type certificate
	*/
	@Override
	public void setServiceCode(java.lang.String serviceCode) {
		_vrVehicleTypeCertificate.setServiceCode(serviceCode);
	}

	/**
	* Sets the service name of this vr vehicle type certificate.
	*
	* @param serviceName the service name of this vr vehicle type certificate
	*/
	@Override
	public void setServiceName(java.lang.String serviceName) {
		_vrVehicleTypeCertificate.setServiceName(serviceName);
	}

	/**
	* Sets the sync date of this vr vehicle type certificate.
	*
	* @param syncDate the sync date of this vr vehicle type certificate
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrVehicleTypeCertificate.setSyncDate(syncDate);
	}

	/**
	* Sets the type approval certificate date of this vr vehicle type certificate.
	*
	* @param typeApprovalCertificateDate the type approval certificate date of this vr vehicle type certificate
	*/
	@Override
	public void setTypeApprovalCertificateDate(Date typeApprovalCertificateDate) {
		_vrVehicleTypeCertificate.setTypeApprovalCertificateDate(typeApprovalCertificateDate);
	}

	/**
	* Sets the type approval certificate no of this vr vehicle type certificate.
	*
	* @param typeApprovalCertificateNo the type approval certificate no of this vr vehicle type certificate
	*/
	@Override
	public void setTypeApprovalCertificateNo(
		java.lang.String typeApprovalCertificateNo) {
		_vrVehicleTypeCertificate.setTypeApprovalCertificateNo(typeApprovalCertificateNo);
	}

	/**
	* Sets the vehicle class of this vr vehicle type certificate.
	*
	* @param vehicleClass the vehicle class of this vr vehicle type certificate
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrVehicleTypeCertificate.setVehicleClass(vehicleClass);
	}

	/**
	* Sets the verification certificate date of this vr vehicle type certificate.
	*
	* @param verificationCertificateDate the verification certificate date of this vr vehicle type certificate
	*/
	@Override
	public void setVerificationCertificateDate(Date verificationCertificateDate) {
		_vrVehicleTypeCertificate.setVerificationCertificateDate(verificationCertificateDate);
	}

	/**
	* Sets the verification certificate no of this vr vehicle type certificate.
	*
	* @param verificationCertificateNo the verification certificate no of this vr vehicle type certificate
	*/
	@Override
	public void setVerificationCertificateNo(
		java.lang.String verificationCertificateNo) {
		_vrVehicleTypeCertificate.setVerificationCertificateNo(verificationCertificateNo);
	}

	/**
	* Sets the verification ref date of this vr vehicle type certificate.
	*
	* @param verificationRefDate the verification ref date of this vr vehicle type certificate
	*/
	@Override
	public void setVerificationRefDate(Date verificationRefDate) {
		_vrVehicleTypeCertificate.setVerificationRefDate(verificationRefDate);
	}

	/**
	* Sets the verification ref no of this vr vehicle type certificate.
	*
	* @param verificationRefNo the verification ref no of this vr vehicle type certificate
	*/
	@Override
	public void setVerificationRefNo(java.lang.String verificationRefNo) {
		_vrVehicleTypeCertificate.setVerificationRefNo(verificationRefNo);
	}

	/**
	* Sets the ward code of this vr vehicle type certificate.
	*
	* @param wardCode the ward code of this vr vehicle type certificate
	*/
	@Override
	public void setWardCode(java.lang.String wardCode) {
		_vrVehicleTypeCertificate.setWardCode(wardCode);
	}

	/**
	* Sets the ward name of this vr vehicle type certificate.
	*
	* @param wardName the ward name of this vr vehicle type certificate
	*/
	@Override
	public void setWardName(java.lang.String wardName) {
		_vrVehicleTypeCertificate.setWardName(wardName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRVehicleTypeCertificateWrapper)) {
			return false;
		}

		VRVehicleTypeCertificateWrapper vrVehicleTypeCertificateWrapper = (VRVehicleTypeCertificateWrapper)obj;

		if (Objects.equals(_vrVehicleTypeCertificate,
					vrVehicleTypeCertificateWrapper._vrVehicleTypeCertificate)) {
			return true;
		}

		return false;
	}

	@Override
	public VRVehicleTypeCertificate getWrappedModel() {
		return _vrVehicleTypeCertificate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrVehicleTypeCertificate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrVehicleTypeCertificate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrVehicleTypeCertificate.resetOriginalValues();
	}

	private final VRVehicleTypeCertificate _vrVehicleTypeCertificate;
}