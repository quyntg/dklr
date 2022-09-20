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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRVehicleTypeCertificateSoap implements Serializable {
	public static VRVehicleTypeCertificateSoap toSoapModel(
		VRVehicleTypeCertificate model) {
		VRVehicleTypeCertificateSoap soapModel = new VRVehicleTypeCertificateSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDossierType(model.getDossierType());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setReferenceUid(model.getReferenceUid());
		soapModel.setServiceCode(model.getServiceCode());
		soapModel.setServiceName(model.getServiceName());
		soapModel.setConvertassembleId(model.getConvertassembleId());
		soapModel.setApplicantIdNo(model.getApplicantIdNo());
		soapModel.setApplicantTelNo(model.getApplicantTelNo());
		soapModel.setApplicantName(model.getApplicantName());
		soapModel.setApplicantIdDate(model.getApplicantIdDate());
		soapModel.setApplicantAddress(model.getApplicantAddress());
		soapModel.setApplicantRepresentative(model.getApplicantRepresentative());
		soapModel.setApplicantRepresentativeTitle(model.getApplicantRepresentativeTitle());
		soapModel.setApplicantEmail(model.getApplicantEmail());
		soapModel.setApplicantPhone(model.getApplicantPhone());
		soapModel.setApplicantFax(model.getApplicantFax());
		soapModel.setApplicantContactName(model.getApplicantContactName());
		soapModel.setApplicantContactEmail(model.getApplicantContactEmail());
		soapModel.setApplicantcontactPhone(model.getApplicantcontactPhone());
		soapModel.setApplicantcontactTelNo(model.getApplicantcontactTelNo());
		soapModel.setCityCode(model.getCityCode());
		soapModel.setCityName(model.getCityName());
		soapModel.setDistrictCode(model.getDistrictCode());
		soapModel.setDistrictName(model.getDistrictName());
		soapModel.setWardCode(model.getWardCode());
		soapModel.setWardName(model.getWardName());
		soapModel.setManufacturerForeignCode(model.getManufacturerForeignCode());
		soapModel.setManufacturerName(model.getManufacturerName());
		soapModel.setManufacturerAddress(model.getManufacturerAddress());
		soapModel.setManufacturerRepresentative(model.getManufacturerRepresentative());
		soapModel.setManufacturerRepresentativeTitle(model.getManufacturerRepresentativeTitle());
		soapModel.setManufacturerEmail(model.getManufacturerEmail());
		soapModel.setManufacturerPhone(model.getManufacturerPhone());
		soapModel.setManufacturerFax(model.getManufacturerFax());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());
		soapModel.setProductionPlantName(model.getProductionPlantName());
		soapModel.setProductionPlantAddress(model.getProductionPlantAddress());
		soapModel.setProductionPlantRepresentative(model.getProductionPlantRepresentative());
		soapModel.setProductionPlantRepresentativeTitle(model.getProductionPlantRepresentativeTitle());
		soapModel.setCopReportNo(model.getCopReportNo());
		soapModel.setCopReportDate(model.getCopReportDate());
		soapModel.setCopReportExpireDate(model.getCopReportExpireDate());
		soapModel.setDesignerCode(model.getDesignerCode());
		soapModel.setDesignerName(model.getDesignerName());
		soapModel.setDesignerAddress(model.getDesignerAddress());
		soapModel.setDesignerRepresentative(model.getDesignerRepresentative());
		soapModel.setDesignerRepresentativeTitle(model.getDesignerRepresentativeTitle());
		soapModel.setDesignerEmail(model.getDesignerEmail());
		soapModel.setDesignerPhone(model.getDesignerPhone());
		soapModel.setDesignerFax(model.getDesignerFax());
		soapModel.setVerificationCertificateNo(model.getVerificationCertificateNo());
		soapModel.setVerificationCertificateDate(model.getVerificationCertificateDate());
		soapModel.setVerificationRefNo(model.getVerificationRefNo());
		soapModel.setVerificationRefDate(model.getVerificationRefDate());
		soapModel.setTypeApprovalCertificateNo(model.getTypeApprovalCertificateNo());
		soapModel.setTypeApprovalCertificateDate(model.getTypeApprovalCertificateDate());
		soapModel.setDesignModelCode(model.getDesignModelCode());
		soapModel.setDesignModelDescription(model.getDesignModelDescription());
		soapModel.setDesignSymbol(model.getDesignSymbol());
		soapModel.setRegisteredNumber(model.getRegisteredNumber());
		soapModel.setInspectorReceiveDate(model.getInspectorReceiveDate());
		soapModel.setInspectorSubmitDate(model.getInspectorSubmitDate());
		soapModel.setInspectorendorSementDate(model.getInspectorendorSementDate());
		soapModel.setInspectorDeadline(model.getInspectorDeadline());
		soapModel.setInspectorFinishDate(model.getInspectorFinishDate());
		soapModel.setInspectorCancelDate(model.getInspectorCancelDate());
		soapModel.setInspectorOrganization(model.getInspectorOrganization());
		soapModel.setInspectorDivision(model.getInspectorDivision());
		soapModel.setInspectorSignName(model.getInspectorSignName());
		soapModel.setInspectorSignTitle(model.getInspectorSignTitle());
		soapModel.setInspectorSignPlace(model.getInspectorSignPlace());
		soapModel.setCertificateType(model.getCertificateType());
		soapModel.setReferenceCertificateNo(model.getReferenceCertificateNo());
		soapModel.setReferenceCertificateDate(model.getReferenceCertificateDate());
		soapModel.setCertificateRecordNo(model.getCertificateRecordNo());
		soapModel.setCertificateSignName(model.getCertificateSignName());
		soapModel.setCertificateSignTitle(model.getCertificateSignTitle());
		soapModel.setCertificateSignPlace(model.getCertificateSignPlace());
		soapModel.setCertificateRecordDate(model.getCertificateRecordDate());
		soapModel.setCertificateRecordExpireDate(model.getCertificateRecordExpireDate());
		soapModel.setExpiredStatus(model.getExpiredStatus());
		soapModel.setCertificateRecordStatus(model.getCertificateRecordStatus());
		soapModel.setDigitalIssueStatus(model.getDigitalIssueStatus());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setCertifiedVehicleType(model.getCertifiedVehicleType());
		soapModel.setCertifiedVehicleTypeDescription(model.getCertifiedVehicleTypeDescription());
		soapModel.setCertifiedTrademark(model.getCertifiedTrademark());
		soapModel.setCertifiedTrademarkName(model.getCertifiedTrademarkName());
		soapModel.setCertifiedCommercialName(model.getCertifiedCommercialName());
		soapModel.setCertifiedModelCode(model.getCertifiedModelCode());
		soapModel.setCertifiedAssemblyType(model.getCertifiedAssemblyType());
		soapModel.setCertifiedAssemblyTypeDescription(model.getCertifiedAssemblyTypeDescription());
		soapModel.setCertifiedVINNo(model.getCertifiedVINNo());
		soapModel.setCertifiedVINPosition(model.getCertifiedVINPosition());
		soapModel.setCertifiedFrameNo(model.getCertifiedFrameNo());
		soapModel.setCertifiedFrameAttachPlace(model.getCertifiedFrameAttachPlace());
		soapModel.setCertifiedFramePosition(model.getCertifiedFramePosition());
		soapModel.setCertifiedEngineNo(model.getCertifiedEngineNo());
		soapModel.setCertifiedEngineAttachPlace(model.getCertifiedEngineAttachPlace());
		soapModel.setCertifiedEnginePosition(model.getCertifiedEnginePosition());
		soapModel.setSafetyTestReportNo(model.getSafetyTestReportNo());
		soapModel.setSafetyTestReportDate(model.getSafetyTestReportDate());
		soapModel.setEmissionTestReportNo(model.getEmissionTestReportNo());
		soapModel.setEmissionTestReportDate(model.getEmissionTestReportDate());
		soapModel.setCommonSafetyStandard(model.getCommonSafetyStandard());
		soapModel.setCommonSafetyDescription(model.getCommonSafetyDescription());
		soapModel.setEmissionStandard(model.getEmissionStandard());
		soapModel.setEmissionDescription(model.getEmissionDescription());
		soapModel.setOtherTestReportNo(model.getOtherTestReportNo());
		soapModel.setOtherTestReportDate(model.getOtherTestReportDate());
		soapModel.setSampleFrameNo(model.getSampleFrameNo());
		soapModel.setSampleVINNo(model.getSampleVINNo());
		soapModel.setSampleEngineNo(model.getSampleEngineNo());
		soapModel.setSampleVehicleType(model.getSampleVehicleType());
		soapModel.setSampleVehicleTypeDescription(model.getSampleVehicleTypeDescription());
		soapModel.setSampleTrademark(model.getSampleTrademark());
		soapModel.setSampleTrademarkName(model.getSampleTrademarkName());
		soapModel.setSampleCommercialName(model.getSampleCommercialName());
		soapModel.setSampleModelCode(model.getSampleModelCode());
		soapModel.setCustomsDeclarationNo(model.getCustomsDeclarationNo());
		soapModel.setCustomsDeclarationDate(model.getCustomsDeclarationDate());
		soapModel.setProductionCountry(model.getProductionCountry());
		soapModel.setImporterQuantity(model.getImporterQuantity());
		soapModel.setInspectionRecordNo(model.getInspectionRecordNo());
		soapModel.setInspectionDate(model.getInspectionDate());
		soapModel.setInspectionSite(model.getInspectionSite());
		soapModel.setInspectionDistrictCode(model.getInspectionDistrictCode());
		soapModel.setInspectionDistrictName(model.getInspectionDistrictName());
		soapModel.setInspectionProvinceCode(model.getInspectionProvinceCode());
		soapModel.setInspectionProvinceName(model.getInspectionProvinceName());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setInspectorId(model.getInspectorId());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setInspectionNote(model.getInspectionNote());
		soapModel.setCertificateNote(model.getCertificateNote());
		soapModel.setDeliverableCode(model.getDeliverableCode());
		soapModel.setDeliverableFileEntryid(model.getDeliverableFileEntryid());
		soapModel.setModule(model.getModule());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRVehicleTypeCertificateSoap[] toSoapModels(
		VRVehicleTypeCertificate[] models) {
		VRVehicleTypeCertificateSoap[] soapModels = new VRVehicleTypeCertificateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRVehicleTypeCertificateSoap[][] toSoapModels(
		VRVehicleTypeCertificate[][] models) {
		VRVehicleTypeCertificateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRVehicleTypeCertificateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRVehicleTypeCertificateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRVehicleTypeCertificateSoap[] toSoapModels(
		List<VRVehicleTypeCertificate> models) {
		List<VRVehicleTypeCertificateSoap> soapModels = new ArrayList<VRVehicleTypeCertificateSoap>(models.size());

		for (VRVehicleTypeCertificate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRVehicleTypeCertificateSoap[soapModels.size()]);
	}

	public VRVehicleTypeCertificateSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getMtCore() {
		return _mtCore;
	}

	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getDossierIdCTN() {
		return _dossierIdCTN;
	}

	public void setDossierIdCTN(String dossierIdCTN) {
		_dossierIdCTN = dossierIdCTN;
	}

	public String getDossierType() {
		return _dossierType;
	}

	public void setDossierType(String dossierType) {
		_dossierType = dossierType;
	}

	public String getDossierNo() {
		return _dossierNo;
	}

	public void setDossierNo(String dossierNo) {
		_dossierNo = dossierNo;
	}

	public String getReferenceUid() {
		return _referenceUid;
	}

	public void setReferenceUid(String referenceUid) {
		_referenceUid = referenceUid;
	}

	public String getServiceCode() {
		return _serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		_serviceCode = serviceCode;
	}

	public String getServiceName() {
		return _serviceName;
	}

	public void setServiceName(String serviceName) {
		_serviceName = serviceName;
	}

	public long getConvertassembleId() {
		return _convertassembleId;
	}

	public void setConvertassembleId(long convertassembleId) {
		_convertassembleId = convertassembleId;
	}

	public String getApplicantIdNo() {
		return _applicantIdNo;
	}

	public void setApplicantIdNo(String applicantIdNo) {
		_applicantIdNo = applicantIdNo;
	}

	public String getApplicantTelNo() {
		return _applicantTelNo;
	}

	public void setApplicantTelNo(String applicantTelNo) {
		_applicantTelNo = applicantTelNo;
	}

	public String getApplicantName() {
		return _applicantName;
	}

	public void setApplicantName(String applicantName) {
		_applicantName = applicantName;
	}

	public Date getApplicantIdDate() {
		return _applicantIdDate;
	}

	public void setApplicantIdDate(Date applicantIdDate) {
		_applicantIdDate = applicantIdDate;
	}

	public String getApplicantAddress() {
		return _applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		_applicantAddress = applicantAddress;
	}

	public String getApplicantRepresentative() {
		return _applicantRepresentative;
	}

	public void setApplicantRepresentative(String applicantRepresentative) {
		_applicantRepresentative = applicantRepresentative;
	}

	public String getApplicantRepresentativeTitle() {
		return _applicantRepresentativeTitle;
	}

	public void setApplicantRepresentativeTitle(
		String applicantRepresentativeTitle) {
		_applicantRepresentativeTitle = applicantRepresentativeTitle;
	}

	public String getApplicantEmail() {
		return _applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		_applicantEmail = applicantEmail;
	}

	public String getApplicantPhone() {
		return _applicantPhone;
	}

	public void setApplicantPhone(String applicantPhone) {
		_applicantPhone = applicantPhone;
	}

	public String getApplicantFax() {
		return _applicantFax;
	}

	public void setApplicantFax(String applicantFax) {
		_applicantFax = applicantFax;
	}

	public String getApplicantContactName() {
		return _applicantContactName;
	}

	public void setApplicantContactName(String applicantContactName) {
		_applicantContactName = applicantContactName;
	}

	public String getApplicantContactEmail() {
		return _applicantContactEmail;
	}

	public void setApplicantContactEmail(String applicantContactEmail) {
		_applicantContactEmail = applicantContactEmail;
	}

	public String getApplicantcontactPhone() {
		return _applicantcontactPhone;
	}

	public void setApplicantcontactPhone(String applicantcontactPhone) {
		_applicantcontactPhone = applicantcontactPhone;
	}

	public String getApplicantcontactTelNo() {
		return _applicantcontactTelNo;
	}

	public void setApplicantcontactTelNo(String applicantcontactTelNo) {
		_applicantcontactTelNo = applicantcontactTelNo;
	}

	public String getCityCode() {
		return _cityCode;
	}

	public void setCityCode(String cityCode) {
		_cityCode = cityCode;
	}

	public String getCityName() {
		return _cityName;
	}

	public void setCityName(String cityName) {
		_cityName = cityName;
	}

	public String getDistrictCode() {
		return _districtCode;
	}

	public void setDistrictCode(String districtCode) {
		_districtCode = districtCode;
	}

	public String getDistrictName() {
		return _districtName;
	}

	public void setDistrictName(String districtName) {
		_districtName = districtName;
	}

	public String getWardCode() {
		return _wardCode;
	}

	public void setWardCode(String wardCode) {
		_wardCode = wardCode;
	}

	public String getWardName() {
		return _wardName;
	}

	public void setWardName(String wardName) {
		_wardName = wardName;
	}

	public String getManufacturerForeignCode() {
		return _manufacturerForeignCode;
	}

	public void setManufacturerForeignCode(String manufacturerForeignCode) {
		_manufacturerForeignCode = manufacturerForeignCode;
	}

	public String getManufacturerName() {
		return _manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		_manufacturerName = manufacturerName;
	}

	public String getManufacturerAddress() {
		return _manufacturerAddress;
	}

	public void setManufacturerAddress(String manufacturerAddress) {
		_manufacturerAddress = manufacturerAddress;
	}

	public String getManufacturerRepresentative() {
		return _manufacturerRepresentative;
	}

	public void setManufacturerRepresentative(String manufacturerRepresentative) {
		_manufacturerRepresentative = manufacturerRepresentative;
	}

	public String getManufacturerRepresentativeTitle() {
		return _manufacturerRepresentativeTitle;
	}

	public void setManufacturerRepresentativeTitle(
		String manufacturerRepresentativeTitle) {
		_manufacturerRepresentativeTitle = manufacturerRepresentativeTitle;
	}

	public String getManufacturerEmail() {
		return _manufacturerEmail;
	}

	public void setManufacturerEmail(String manufacturerEmail) {
		_manufacturerEmail = manufacturerEmail;
	}

	public String getManufacturerPhone() {
		return _manufacturerPhone;
	}

	public void setManufacturerPhone(String manufacturerPhone) {
		_manufacturerPhone = manufacturerPhone;
	}

	public String getManufacturerFax() {
		return _manufacturerFax;
	}

	public void setManufacturerFax(String manufacturerFax) {
		_manufacturerFax = manufacturerFax;
	}

	public String getProductionPlantCode() {
		return _productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		_productionPlantCode = productionPlantCode;
	}

	public String getProductionPlantName() {
		return _productionPlantName;
	}

	public void setProductionPlantName(String productionPlantName) {
		_productionPlantName = productionPlantName;
	}

	public String getProductionPlantAddress() {
		return _productionPlantAddress;
	}

	public void setProductionPlantAddress(String productionPlantAddress) {
		_productionPlantAddress = productionPlantAddress;
	}

	public String getProductionPlantRepresentative() {
		return _productionPlantRepresentative;
	}

	public void setProductionPlantRepresentative(
		String productionPlantRepresentative) {
		_productionPlantRepresentative = productionPlantRepresentative;
	}

	public String getProductionPlantRepresentativeTitle() {
		return _productionPlantRepresentativeTitle;
	}

	public void setProductionPlantRepresentativeTitle(
		String productionPlantRepresentativeTitle) {
		_productionPlantRepresentativeTitle = productionPlantRepresentativeTitle;
	}

	public String getCopReportNo() {
		return _copReportNo;
	}

	public void setCopReportNo(String copReportNo) {
		_copReportNo = copReportNo;
	}

	public Date getCopReportDate() {
		return _copReportDate;
	}

	public void setCopReportDate(Date copReportDate) {
		_copReportDate = copReportDate;
	}

	public Date getCopReportExpireDate() {
		return _copReportExpireDate;
	}

	public void setCopReportExpireDate(Date copReportExpireDate) {
		_copReportExpireDate = copReportExpireDate;
	}

	public String getDesignerCode() {
		return _designerCode;
	}

	public void setDesignerCode(String designerCode) {
		_designerCode = designerCode;
	}

	public String getDesignerName() {
		return _designerName;
	}

	public void setDesignerName(String designerName) {
		_designerName = designerName;
	}

	public String getDesignerAddress() {
		return _designerAddress;
	}

	public void setDesignerAddress(String designerAddress) {
		_designerAddress = designerAddress;
	}

	public String getDesignerRepresentative() {
		return _designerRepresentative;
	}

	public void setDesignerRepresentative(String designerRepresentative) {
		_designerRepresentative = designerRepresentative;
	}

	public String getDesignerRepresentativeTitle() {
		return _designerRepresentativeTitle;
	}

	public void setDesignerRepresentativeTitle(
		String designerRepresentativeTitle) {
		_designerRepresentativeTitle = designerRepresentativeTitle;
	}

	public String getDesignerEmail() {
		return _designerEmail;
	}

	public void setDesignerEmail(String designerEmail) {
		_designerEmail = designerEmail;
	}

	public String getDesignerPhone() {
		return _designerPhone;
	}

	public void setDesignerPhone(String designerPhone) {
		_designerPhone = designerPhone;
	}

	public String getDesignerFax() {
		return _designerFax;
	}

	public void setDesignerFax(String designerFax) {
		_designerFax = designerFax;
	}

	public String getVerificationCertificateNo() {
		return _verificationCertificateNo;
	}

	public void setVerificationCertificateNo(String verificationCertificateNo) {
		_verificationCertificateNo = verificationCertificateNo;
	}

	public Date getVerificationCertificateDate() {
		return _verificationCertificateDate;
	}

	public void setVerificationCertificateDate(Date verificationCertificateDate) {
		_verificationCertificateDate = verificationCertificateDate;
	}

	public String getVerificationRefNo() {
		return _verificationRefNo;
	}

	public void setVerificationRefNo(String verificationRefNo) {
		_verificationRefNo = verificationRefNo;
	}

	public Date getVerificationRefDate() {
		return _verificationRefDate;
	}

	public void setVerificationRefDate(Date verificationRefDate) {
		_verificationRefDate = verificationRefDate;
	}

	public String getTypeApprovalCertificateNo() {
		return _typeApprovalCertificateNo;
	}

	public void setTypeApprovalCertificateNo(String typeApprovalCertificateNo) {
		_typeApprovalCertificateNo = typeApprovalCertificateNo;
	}

	public Date getTypeApprovalCertificateDate() {
		return _typeApprovalCertificateDate;
	}

	public void setTypeApprovalCertificateDate(Date typeApprovalCertificateDate) {
		_typeApprovalCertificateDate = typeApprovalCertificateDate;
	}

	public String getDesignModelCode() {
		return _designModelCode;
	}

	public void setDesignModelCode(String designModelCode) {
		_designModelCode = designModelCode;
	}

	public String getDesignModelDescription() {
		return _designModelDescription;
	}

	public void setDesignModelDescription(String designModelDescription) {
		_designModelDescription = designModelDescription;
	}

	public String getDesignSymbol() {
		return _designSymbol;
	}

	public void setDesignSymbol(String designSymbol) {
		_designSymbol = designSymbol;
	}

	public String getRegisteredNumber() {
		return _registeredNumber;
	}

	public void setRegisteredNumber(String registeredNumber) {
		_registeredNumber = registeredNumber;
	}

	public Date getInspectorReceiveDate() {
		return _inspectorReceiveDate;
	}

	public void setInspectorReceiveDate(Date inspectorReceiveDate) {
		_inspectorReceiveDate = inspectorReceiveDate;
	}

	public Date getInspectorSubmitDate() {
		return _inspectorSubmitDate;
	}

	public void setInspectorSubmitDate(Date inspectorSubmitDate) {
		_inspectorSubmitDate = inspectorSubmitDate;
	}

	public Date getInspectorendorSementDate() {
		return _inspectorendorSementDate;
	}

	public void setInspectorendorSementDate(Date inspectorendorSementDate) {
		_inspectorendorSementDate = inspectorendorSementDate;
	}

	public Date getInspectorDeadline() {
		return _inspectorDeadline;
	}

	public void setInspectorDeadline(Date inspectorDeadline) {
		_inspectorDeadline = inspectorDeadline;
	}

	public Date getInspectorFinishDate() {
		return _inspectorFinishDate;
	}

	public void setInspectorFinishDate(Date inspectorFinishDate) {
		_inspectorFinishDate = inspectorFinishDate;
	}

	public Date getInspectorCancelDate() {
		return _inspectorCancelDate;
	}

	public void setInspectorCancelDate(Date inspectorCancelDate) {
		_inspectorCancelDate = inspectorCancelDate;
	}

	public String getInspectorOrganization() {
		return _inspectorOrganization;
	}

	public void setInspectorOrganization(String inspectorOrganization) {
		_inspectorOrganization = inspectorOrganization;
	}

	public String getInspectorDivision() {
		return _inspectorDivision;
	}

	public void setInspectorDivision(String inspectorDivision) {
		_inspectorDivision = inspectorDivision;
	}

	public String getInspectorSignName() {
		return _inspectorSignName;
	}

	public void setInspectorSignName(String inspectorSignName) {
		_inspectorSignName = inspectorSignName;
	}

	public String getInspectorSignTitle() {
		return _inspectorSignTitle;
	}

	public void setInspectorSignTitle(String inspectorSignTitle) {
		_inspectorSignTitle = inspectorSignTitle;
	}

	public String getInspectorSignPlace() {
		return _inspectorSignPlace;
	}

	public void setInspectorSignPlace(String inspectorSignPlace) {
		_inspectorSignPlace = inspectorSignPlace;
	}

	public String getCertificateType() {
		return _certificateType;
	}

	public void setCertificateType(String certificateType) {
		_certificateType = certificateType;
	}

	public String getReferenceCertificateNo() {
		return _referenceCertificateNo;
	}

	public void setReferenceCertificateNo(String referenceCertificateNo) {
		_referenceCertificateNo = referenceCertificateNo;
	}

	public Date getReferenceCertificateDate() {
		return _referenceCertificateDate;
	}

	public void setReferenceCertificateDate(Date referenceCertificateDate) {
		_referenceCertificateDate = referenceCertificateDate;
	}

	public String getCertificateRecordNo() {
		return _certificateRecordNo;
	}

	public void setCertificateRecordNo(String certificateRecordNo) {
		_certificateRecordNo = certificateRecordNo;
	}

	public String getCertificateSignName() {
		return _certificateSignName;
	}

	public void setCertificateSignName(String certificateSignName) {
		_certificateSignName = certificateSignName;
	}

	public String getCertificateSignTitle() {
		return _certificateSignTitle;
	}

	public void setCertificateSignTitle(String certificateSignTitle) {
		_certificateSignTitle = certificateSignTitle;
	}

	public String getCertificateSignPlace() {
		return _certificateSignPlace;
	}

	public void setCertificateSignPlace(String certificateSignPlace) {
		_certificateSignPlace = certificateSignPlace;
	}

	public Date getCertificateRecordDate() {
		return _certificateRecordDate;
	}

	public void setCertificateRecordDate(Date certificateRecordDate) {
		_certificateRecordDate = certificateRecordDate;
	}

	public Date getCertificateRecordExpireDate() {
		return _certificateRecordExpireDate;
	}

	public void setCertificateRecordExpireDate(Date certificateRecordExpireDate) {
		_certificateRecordExpireDate = certificateRecordExpireDate;
	}

	public String getExpiredStatus() {
		return _expiredStatus;
	}

	public void setExpiredStatus(String expiredStatus) {
		_expiredStatus = expiredStatus;
	}

	public String getCertificateRecordStatus() {
		return _certificateRecordStatus;
	}

	public void setCertificateRecordStatus(String certificateRecordStatus) {
		_certificateRecordStatus = certificateRecordStatus;
	}

	public String getDigitalIssueStatus() {
		return _digitalIssueStatus;
	}

	public void setDigitalIssueStatus(String digitalIssueStatus) {
		_digitalIssueStatus = digitalIssueStatus;
	}

	public String getVehicleClass() {
		return _vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	public String getCertifiedVehicleType() {
		return _certifiedVehicleType;
	}

	public void setCertifiedVehicleType(String certifiedVehicleType) {
		_certifiedVehicleType = certifiedVehicleType;
	}

	public String getCertifiedVehicleTypeDescription() {
		return _certifiedVehicleTypeDescription;
	}

	public void setCertifiedVehicleTypeDescription(
		String certifiedVehicleTypeDescription) {
		_certifiedVehicleTypeDescription = certifiedVehicleTypeDescription;
	}

	public String getCertifiedTrademark() {
		return _certifiedTrademark;
	}

	public void setCertifiedTrademark(String certifiedTrademark) {
		_certifiedTrademark = certifiedTrademark;
	}

	public String getCertifiedTrademarkName() {
		return _certifiedTrademarkName;
	}

	public void setCertifiedTrademarkName(String certifiedTrademarkName) {
		_certifiedTrademarkName = certifiedTrademarkName;
	}

	public String getCertifiedCommercialName() {
		return _certifiedCommercialName;
	}

	public void setCertifiedCommercialName(String certifiedCommercialName) {
		_certifiedCommercialName = certifiedCommercialName;
	}

	public String getCertifiedModelCode() {
		return _certifiedModelCode;
	}

	public void setCertifiedModelCode(String certifiedModelCode) {
		_certifiedModelCode = certifiedModelCode;
	}

	public String getCertifiedAssemblyType() {
		return _certifiedAssemblyType;
	}

	public void setCertifiedAssemblyType(String certifiedAssemblyType) {
		_certifiedAssemblyType = certifiedAssemblyType;
	}

	public String getCertifiedAssemblyTypeDescription() {
		return _certifiedAssemblyTypeDescription;
	}

	public void setCertifiedAssemblyTypeDescription(
		String certifiedAssemblyTypeDescription) {
		_certifiedAssemblyTypeDescription = certifiedAssemblyTypeDescription;
	}

	public String getCertifiedVINNo() {
		return _certifiedVINNo;
	}

	public void setCertifiedVINNo(String certifiedVINNo) {
		_certifiedVINNo = certifiedVINNo;
	}

	public String getCertifiedVINPosition() {
		return _certifiedVINPosition;
	}

	public void setCertifiedVINPosition(String certifiedVINPosition) {
		_certifiedVINPosition = certifiedVINPosition;
	}

	public String getCertifiedFrameNo() {
		return _certifiedFrameNo;
	}

	public void setCertifiedFrameNo(String certifiedFrameNo) {
		_certifiedFrameNo = certifiedFrameNo;
	}

	public String getCertifiedFrameAttachPlace() {
		return _certifiedFrameAttachPlace;
	}

	public void setCertifiedFrameAttachPlace(String certifiedFrameAttachPlace) {
		_certifiedFrameAttachPlace = certifiedFrameAttachPlace;
	}

	public String getCertifiedFramePosition() {
		return _certifiedFramePosition;
	}

	public void setCertifiedFramePosition(String certifiedFramePosition) {
		_certifiedFramePosition = certifiedFramePosition;
	}

	public String getCertifiedEngineNo() {
		return _certifiedEngineNo;
	}

	public void setCertifiedEngineNo(String certifiedEngineNo) {
		_certifiedEngineNo = certifiedEngineNo;
	}

	public String getCertifiedEngineAttachPlace() {
		return _certifiedEngineAttachPlace;
	}

	public void setCertifiedEngineAttachPlace(String certifiedEngineAttachPlace) {
		_certifiedEngineAttachPlace = certifiedEngineAttachPlace;
	}

	public String getCertifiedEnginePosition() {
		return _certifiedEnginePosition;
	}

	public void setCertifiedEnginePosition(String certifiedEnginePosition) {
		_certifiedEnginePosition = certifiedEnginePosition;
	}

	public String getSafetyTestReportNo() {
		return _safetyTestReportNo;
	}

	public void setSafetyTestReportNo(String safetyTestReportNo) {
		_safetyTestReportNo = safetyTestReportNo;
	}

	public Date getSafetyTestReportDate() {
		return _safetyTestReportDate;
	}

	public void setSafetyTestReportDate(Date safetyTestReportDate) {
		_safetyTestReportDate = safetyTestReportDate;
	}

	public String getEmissionTestReportNo() {
		return _emissionTestReportNo;
	}

	public void setEmissionTestReportNo(String emissionTestReportNo) {
		_emissionTestReportNo = emissionTestReportNo;
	}

	public Date getEmissionTestReportDate() {
		return _emissionTestReportDate;
	}

	public void setEmissionTestReportDate(Date emissionTestReportDate) {
		_emissionTestReportDate = emissionTestReportDate;
	}

	public String getCommonSafetyStandard() {
		return _commonSafetyStandard;
	}

	public void setCommonSafetyStandard(String commonSafetyStandard) {
		_commonSafetyStandard = commonSafetyStandard;
	}

	public String getCommonSafetyDescription() {
		return _commonSafetyDescription;
	}

	public void setCommonSafetyDescription(String commonSafetyDescription) {
		_commonSafetyDescription = commonSafetyDescription;
	}

	public String getEmissionStandard() {
		return _emissionStandard;
	}

	public void setEmissionStandard(String emissionStandard) {
		_emissionStandard = emissionStandard;
	}

	public String getEmissionDescription() {
		return _emissionDescription;
	}

	public void setEmissionDescription(String emissionDescription) {
		_emissionDescription = emissionDescription;
	}

	public String getOtherTestReportNo() {
		return _otherTestReportNo;
	}

	public void setOtherTestReportNo(String otherTestReportNo) {
		_otherTestReportNo = otherTestReportNo;
	}

	public Date getOtherTestReportDate() {
		return _otherTestReportDate;
	}

	public void setOtherTestReportDate(Date otherTestReportDate) {
		_otherTestReportDate = otherTestReportDate;
	}

	public String getSampleFrameNo() {
		return _sampleFrameNo;
	}

	public void setSampleFrameNo(String sampleFrameNo) {
		_sampleFrameNo = sampleFrameNo;
	}

	public String getSampleVINNo() {
		return _sampleVINNo;
	}

	public void setSampleVINNo(String sampleVINNo) {
		_sampleVINNo = sampleVINNo;
	}

	public String getSampleEngineNo() {
		return _sampleEngineNo;
	}

	public void setSampleEngineNo(String sampleEngineNo) {
		_sampleEngineNo = sampleEngineNo;
	}

	public String getSampleVehicleType() {
		return _sampleVehicleType;
	}

	public void setSampleVehicleType(String sampleVehicleType) {
		_sampleVehicleType = sampleVehicleType;
	}

	public String getSampleVehicleTypeDescription() {
		return _sampleVehicleTypeDescription;
	}

	public void setSampleVehicleTypeDescription(
		String sampleVehicleTypeDescription) {
		_sampleVehicleTypeDescription = sampleVehicleTypeDescription;
	}

	public String getSampleTrademark() {
		return _sampleTrademark;
	}

	public void setSampleTrademark(String sampleTrademark) {
		_sampleTrademark = sampleTrademark;
	}

	public String getSampleTrademarkName() {
		return _sampleTrademarkName;
	}

	public void setSampleTrademarkName(String sampleTrademarkName) {
		_sampleTrademarkName = sampleTrademarkName;
	}

	public String getSampleCommercialName() {
		return _sampleCommercialName;
	}

	public void setSampleCommercialName(String sampleCommercialName) {
		_sampleCommercialName = sampleCommercialName;
	}

	public String getSampleModelCode() {
		return _sampleModelCode;
	}

	public void setSampleModelCode(String sampleModelCode) {
		_sampleModelCode = sampleModelCode;
	}

	public String getCustomsDeclarationNo() {
		return _customsDeclarationNo;
	}

	public void setCustomsDeclarationNo(String customsDeclarationNo) {
		_customsDeclarationNo = customsDeclarationNo;
	}

	public Date getCustomsDeclarationDate() {
		return _customsDeclarationDate;
	}

	public void setCustomsDeclarationDate(Date customsDeclarationDate) {
		_customsDeclarationDate = customsDeclarationDate;
	}

	public String getProductionCountry() {
		return _productionCountry;
	}

	public void setProductionCountry(String productionCountry) {
		_productionCountry = productionCountry;
	}

	public long getImporterQuantity() {
		return _importerQuantity;
	}

	public void setImporterQuantity(long importerQuantity) {
		_importerQuantity = importerQuantity;
	}

	public String getInspectionRecordNo() {
		return _inspectionRecordNo;
	}

	public void setInspectionRecordNo(String inspectionRecordNo) {
		_inspectionRecordNo = inspectionRecordNo;
	}

	public Date getInspectionDate() {
		return _inspectionDate;
	}

	public void setInspectionDate(Date inspectionDate) {
		_inspectionDate = inspectionDate;
	}

	public String getInspectionSite() {
		return _inspectionSite;
	}

	public void setInspectionSite(String inspectionSite) {
		_inspectionSite = inspectionSite;
	}

	public String getInspectionDistrictCode() {
		return _inspectionDistrictCode;
	}

	public void setInspectionDistrictCode(String inspectionDistrictCode) {
		_inspectionDistrictCode = inspectionDistrictCode;
	}

	public String getInspectionDistrictName() {
		return _inspectionDistrictName;
	}

	public void setInspectionDistrictName(String inspectionDistrictName) {
		_inspectionDistrictName = inspectionDistrictName;
	}

	public String getInspectionProvinceCode() {
		return _inspectionProvinceCode;
	}

	public void setInspectionProvinceCode(String inspectionProvinceCode) {
		_inspectionProvinceCode = inspectionProvinceCode;
	}

	public String getInspectionProvinceName() {
		return _inspectionProvinceName;
	}

	public void setInspectionProvinceName(String inspectionProvinceName) {
		_inspectionProvinceName = inspectionProvinceName;
	}

	public String getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;
	}

	public long getInspectorId() {
		return _inspectorId;
	}

	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getInspectionNote() {
		return _inspectionNote;
	}

	public void setInspectionNote(String inspectionNote) {
		_inspectionNote = inspectionNote;
	}

	public String getCertificateNote() {
		return _certificateNote;
	}

	public void setCertificateNote(String certificateNote) {
		_certificateNote = certificateNote;
	}

	public String getDeliverableCode() {
		return _deliverableCode;
	}

	public void setDeliverableCode(String deliverableCode) {
		_deliverableCode = deliverableCode;
	}

	public long getDeliverableFileEntryid() {
		return _deliverableFileEntryid;
	}

	public void setDeliverableFileEntryid(long deliverableFileEntryid) {
		_deliverableFileEntryid = deliverableFileEntryid;
	}

	public String getModule() {
		return _module;
	}

	public void setModule(String module) {
		_module = module;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private long _mtCore;
	private long _dossierId;
	private String _dossierIdCTN;
	private String _dossierType;
	private String _dossierNo;
	private String _referenceUid;
	private String _serviceCode;
	private String _serviceName;
	private long _convertassembleId;
	private String _applicantIdNo;
	private String _applicantTelNo;
	private String _applicantName;
	private Date _applicantIdDate;
	private String _applicantAddress;
	private String _applicantRepresentative;
	private String _applicantRepresentativeTitle;
	private String _applicantEmail;
	private String _applicantPhone;
	private String _applicantFax;
	private String _applicantContactName;
	private String _applicantContactEmail;
	private String _applicantcontactPhone;
	private String _applicantcontactTelNo;
	private String _cityCode;
	private String _cityName;
	private String _districtCode;
	private String _districtName;
	private String _wardCode;
	private String _wardName;
	private String _manufacturerForeignCode;
	private String _manufacturerName;
	private String _manufacturerAddress;
	private String _manufacturerRepresentative;
	private String _manufacturerRepresentativeTitle;
	private String _manufacturerEmail;
	private String _manufacturerPhone;
	private String _manufacturerFax;
	private String _productionPlantCode;
	private String _productionPlantName;
	private String _productionPlantAddress;
	private String _productionPlantRepresentative;
	private String _productionPlantRepresentativeTitle;
	private String _copReportNo;
	private Date _copReportDate;
	private Date _copReportExpireDate;
	private String _designerCode;
	private String _designerName;
	private String _designerAddress;
	private String _designerRepresentative;
	private String _designerRepresentativeTitle;
	private String _designerEmail;
	private String _designerPhone;
	private String _designerFax;
	private String _verificationCertificateNo;
	private Date _verificationCertificateDate;
	private String _verificationRefNo;
	private Date _verificationRefDate;
	private String _typeApprovalCertificateNo;
	private Date _typeApprovalCertificateDate;
	private String _designModelCode;
	private String _designModelDescription;
	private String _designSymbol;
	private String _registeredNumber;
	private Date _inspectorReceiveDate;
	private Date _inspectorSubmitDate;
	private Date _inspectorendorSementDate;
	private Date _inspectorDeadline;
	private Date _inspectorFinishDate;
	private Date _inspectorCancelDate;
	private String _inspectorOrganization;
	private String _inspectorDivision;
	private String _inspectorSignName;
	private String _inspectorSignTitle;
	private String _inspectorSignPlace;
	private String _certificateType;
	private String _referenceCertificateNo;
	private Date _referenceCertificateDate;
	private String _certificateRecordNo;
	private String _certificateSignName;
	private String _certificateSignTitle;
	private String _certificateSignPlace;
	private Date _certificateRecordDate;
	private Date _certificateRecordExpireDate;
	private String _expiredStatus;
	private String _certificateRecordStatus;
	private String _digitalIssueStatus;
	private String _vehicleClass;
	private String _certifiedVehicleType;
	private String _certifiedVehicleTypeDescription;
	private String _certifiedTrademark;
	private String _certifiedTrademarkName;
	private String _certifiedCommercialName;
	private String _certifiedModelCode;
	private String _certifiedAssemblyType;
	private String _certifiedAssemblyTypeDescription;
	private String _certifiedVINNo;
	private String _certifiedVINPosition;
	private String _certifiedFrameNo;
	private String _certifiedFrameAttachPlace;
	private String _certifiedFramePosition;
	private String _certifiedEngineNo;
	private String _certifiedEngineAttachPlace;
	private String _certifiedEnginePosition;
	private String _safetyTestReportNo;
	private Date _safetyTestReportDate;
	private String _emissionTestReportNo;
	private Date _emissionTestReportDate;
	private String _commonSafetyStandard;
	private String _commonSafetyDescription;
	private String _emissionStandard;
	private String _emissionDescription;
	private String _otherTestReportNo;
	private Date _otherTestReportDate;
	private String _sampleFrameNo;
	private String _sampleVINNo;
	private String _sampleEngineNo;
	private String _sampleVehicleType;
	private String _sampleVehicleTypeDescription;
	private String _sampleTrademark;
	private String _sampleTrademarkName;
	private String _sampleCommercialName;
	private String _sampleModelCode;
	private String _customsDeclarationNo;
	private Date _customsDeclarationDate;
	private String _productionCountry;
	private long _importerQuantity;
	private String _inspectionRecordNo;
	private Date _inspectionDate;
	private String _inspectionSite;
	private String _inspectionDistrictCode;
	private String _inspectionDistrictName;
	private String _inspectionProvinceCode;
	private String _inspectionProvinceName;
	private String _corporationId;
	private long _inspectorId;
	private String _remarks;
	private String _inspectionNote;
	private String _certificateNote;
	private String _deliverableCode;
	private long _deliverableFileEntryid;
	private String _module;
	private Date _modifyDate;
	private Date _syncDate;
}