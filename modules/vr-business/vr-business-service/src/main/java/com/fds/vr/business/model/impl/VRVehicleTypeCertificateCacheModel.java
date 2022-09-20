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

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRVehicleTypeCertificate;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VRVehicleTypeCertificate in entity cache.
 *
 * @author LamTV
 * @see VRVehicleTypeCertificate
 * @generated
 */
@ProviderType
public class VRVehicleTypeCertificateCacheModel implements CacheModel<VRVehicleTypeCertificate>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRVehicleTypeCertificateCacheModel)) {
			return false;
		}

		VRVehicleTypeCertificateCacheModel vrVehicleTypeCertificateCacheModel = (VRVehicleTypeCertificateCacheModel)obj;

		if (id == vrVehicleTypeCertificateCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(289);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierIdCTN=");
		sb.append(dossierIdCTN);
		sb.append(", dossierType=");
		sb.append(dossierType);
		sb.append(", dossierNo=");
		sb.append(dossierNo);
		sb.append(", referenceUid=");
		sb.append(referenceUid);
		sb.append(", serviceCode=");
		sb.append(serviceCode);
		sb.append(", serviceName=");
		sb.append(serviceName);
		sb.append(", convertassembleId=");
		sb.append(convertassembleId);
		sb.append(", applicantIdNo=");
		sb.append(applicantIdNo);
		sb.append(", applicantTelNo=");
		sb.append(applicantTelNo);
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", applicantIdDate=");
		sb.append(applicantIdDate);
		sb.append(", applicantAddress=");
		sb.append(applicantAddress);
		sb.append(", applicantRepresentative=");
		sb.append(applicantRepresentative);
		sb.append(", applicantRepresentativeTitle=");
		sb.append(applicantRepresentativeTitle);
		sb.append(", applicantEmail=");
		sb.append(applicantEmail);
		sb.append(", applicantPhone=");
		sb.append(applicantPhone);
		sb.append(", applicantFax=");
		sb.append(applicantFax);
		sb.append(", applicantContactName=");
		sb.append(applicantContactName);
		sb.append(", applicantContactEmail=");
		sb.append(applicantContactEmail);
		sb.append(", applicantcontactPhone=");
		sb.append(applicantcontactPhone);
		sb.append(", applicantcontactTelNo=");
		sb.append(applicantcontactTelNo);
		sb.append(", cityCode=");
		sb.append(cityCode);
		sb.append(", cityName=");
		sb.append(cityName);
		sb.append(", districtCode=");
		sb.append(districtCode);
		sb.append(", districtName=");
		sb.append(districtName);
		sb.append(", wardCode=");
		sb.append(wardCode);
		sb.append(", wardName=");
		sb.append(wardName);
		sb.append(", manufacturerForeignCode=");
		sb.append(manufacturerForeignCode);
		sb.append(", manufacturerName=");
		sb.append(manufacturerName);
		sb.append(", manufacturerAddress=");
		sb.append(manufacturerAddress);
		sb.append(", manufacturerRepresentative=");
		sb.append(manufacturerRepresentative);
		sb.append(", manufacturerRepresentativeTitle=");
		sb.append(manufacturerRepresentativeTitle);
		sb.append(", manufacturerEmail=");
		sb.append(manufacturerEmail);
		sb.append(", manufacturerPhone=");
		sb.append(manufacturerPhone);
		sb.append(", manufacturerFax=");
		sb.append(manufacturerFax);
		sb.append(", productionPlantCode=");
		sb.append(productionPlantCode);
		sb.append(", productionPlantName=");
		sb.append(productionPlantName);
		sb.append(", productionPlantAddress=");
		sb.append(productionPlantAddress);
		sb.append(", productionPlantRepresentative=");
		sb.append(productionPlantRepresentative);
		sb.append(", productionPlantRepresentativeTitle=");
		sb.append(productionPlantRepresentativeTitle);
		sb.append(", copReportNo=");
		sb.append(copReportNo);
		sb.append(", copReportDate=");
		sb.append(copReportDate);
		sb.append(", copReportExpireDate=");
		sb.append(copReportExpireDate);
		sb.append(", designerCode=");
		sb.append(designerCode);
		sb.append(", designerName=");
		sb.append(designerName);
		sb.append(", designerAddress=");
		sb.append(designerAddress);
		sb.append(", designerRepresentative=");
		sb.append(designerRepresentative);
		sb.append(", designerRepresentativeTitle=");
		sb.append(designerRepresentativeTitle);
		sb.append(", designerEmail=");
		sb.append(designerEmail);
		sb.append(", designerPhone=");
		sb.append(designerPhone);
		sb.append(", designerFax=");
		sb.append(designerFax);
		sb.append(", verificationCertificateNo=");
		sb.append(verificationCertificateNo);
		sb.append(", verificationCertificateDate=");
		sb.append(verificationCertificateDate);
		sb.append(", verificationRefNo=");
		sb.append(verificationRefNo);
		sb.append(", verificationRefDate=");
		sb.append(verificationRefDate);
		sb.append(", typeApprovalCertificateNo=");
		sb.append(typeApprovalCertificateNo);
		sb.append(", typeApprovalCertificateDate=");
		sb.append(typeApprovalCertificateDate);
		sb.append(", designModelCode=");
		sb.append(designModelCode);
		sb.append(", designModelDescription=");
		sb.append(designModelDescription);
		sb.append(", designSymbol=");
		sb.append(designSymbol);
		sb.append(", registeredNumber=");
		sb.append(registeredNumber);
		sb.append(", inspectorReceiveDate=");
		sb.append(inspectorReceiveDate);
		sb.append(", inspectorSubmitDate=");
		sb.append(inspectorSubmitDate);
		sb.append(", inspectorendorSementDate=");
		sb.append(inspectorendorSementDate);
		sb.append(", inspectorDeadline=");
		sb.append(inspectorDeadline);
		sb.append(", inspectorFinishDate=");
		sb.append(inspectorFinishDate);
		sb.append(", inspectorCancelDate=");
		sb.append(inspectorCancelDate);
		sb.append(", inspectorOrganization=");
		sb.append(inspectorOrganization);
		sb.append(", inspectorDivision=");
		sb.append(inspectorDivision);
		sb.append(", inspectorSignName=");
		sb.append(inspectorSignName);
		sb.append(", inspectorSignTitle=");
		sb.append(inspectorSignTitle);
		sb.append(", inspectorSignPlace=");
		sb.append(inspectorSignPlace);
		sb.append(", certificateType=");
		sb.append(certificateType);
		sb.append(", referenceCertificateNo=");
		sb.append(referenceCertificateNo);
		sb.append(", referenceCertificateDate=");
		sb.append(referenceCertificateDate);
		sb.append(", certificateRecordNo=");
		sb.append(certificateRecordNo);
		sb.append(", certificateSignName=");
		sb.append(certificateSignName);
		sb.append(", certificateSignTitle=");
		sb.append(certificateSignTitle);
		sb.append(", certificateSignPlace=");
		sb.append(certificateSignPlace);
		sb.append(", certificateRecordDate=");
		sb.append(certificateRecordDate);
		sb.append(", certificateRecordExpireDate=");
		sb.append(certificateRecordExpireDate);
		sb.append(", expiredStatus=");
		sb.append(expiredStatus);
		sb.append(", certificateRecordStatus=");
		sb.append(certificateRecordStatus);
		sb.append(", digitalIssueStatus=");
		sb.append(digitalIssueStatus);
		sb.append(", vehicleClass=");
		sb.append(vehicleClass);
		sb.append(", certifiedVehicleType=");
		sb.append(certifiedVehicleType);
		sb.append(", certifiedVehicleTypeDescription=");
		sb.append(certifiedVehicleTypeDescription);
		sb.append(", certifiedTrademark=");
		sb.append(certifiedTrademark);
		sb.append(", certifiedTrademarkName=");
		sb.append(certifiedTrademarkName);
		sb.append(", certifiedCommercialName=");
		sb.append(certifiedCommercialName);
		sb.append(", certifiedModelCode=");
		sb.append(certifiedModelCode);
		sb.append(", certifiedAssemblyType=");
		sb.append(certifiedAssemblyType);
		sb.append(", certifiedAssemblyTypeDescription=");
		sb.append(certifiedAssemblyTypeDescription);
		sb.append(", certifiedVINNo=");
		sb.append(certifiedVINNo);
		sb.append(", certifiedVINPosition=");
		sb.append(certifiedVINPosition);
		sb.append(", certifiedFrameNo=");
		sb.append(certifiedFrameNo);
		sb.append(", certifiedFrameAttachPlace=");
		sb.append(certifiedFrameAttachPlace);
		sb.append(", certifiedFramePosition=");
		sb.append(certifiedFramePosition);
		sb.append(", certifiedEngineNo=");
		sb.append(certifiedEngineNo);
		sb.append(", certifiedEngineAttachPlace=");
		sb.append(certifiedEngineAttachPlace);
		sb.append(", certifiedEnginePosition=");
		sb.append(certifiedEnginePosition);
		sb.append(", safetyTestReportNo=");
		sb.append(safetyTestReportNo);
		sb.append(", safetyTestReportDate=");
		sb.append(safetyTestReportDate);
		sb.append(", emissionTestReportNo=");
		sb.append(emissionTestReportNo);
		sb.append(", emissionTestReportDate=");
		sb.append(emissionTestReportDate);
		sb.append(", commonSafetyStandard=");
		sb.append(commonSafetyStandard);
		sb.append(", commonSafetyDescription=");
		sb.append(commonSafetyDescription);
		sb.append(", emissionStandard=");
		sb.append(emissionStandard);
		sb.append(", emissionDescription=");
		sb.append(emissionDescription);
		sb.append(", otherTestReportNo=");
		sb.append(otherTestReportNo);
		sb.append(", otherTestReportDate=");
		sb.append(otherTestReportDate);
		sb.append(", sampleFrameNo=");
		sb.append(sampleFrameNo);
		sb.append(", sampleVINNo=");
		sb.append(sampleVINNo);
		sb.append(", sampleEngineNo=");
		sb.append(sampleEngineNo);
		sb.append(", sampleVehicleType=");
		sb.append(sampleVehicleType);
		sb.append(", sampleVehicleTypeDescription=");
		sb.append(sampleVehicleTypeDescription);
		sb.append(", sampleTrademark=");
		sb.append(sampleTrademark);
		sb.append(", sampleTrademarkName=");
		sb.append(sampleTrademarkName);
		sb.append(", sampleCommercialName=");
		sb.append(sampleCommercialName);
		sb.append(", sampleModelCode=");
		sb.append(sampleModelCode);
		sb.append(", customsDeclarationNo=");
		sb.append(customsDeclarationNo);
		sb.append(", customsDeclarationDate=");
		sb.append(customsDeclarationDate);
		sb.append(", productionCountry=");
		sb.append(productionCountry);
		sb.append(", importerQuantity=");
		sb.append(importerQuantity);
		sb.append(", inspectionRecordNo=");
		sb.append(inspectionRecordNo);
		sb.append(", inspectionDate=");
		sb.append(inspectionDate);
		sb.append(", inspectionSite=");
		sb.append(inspectionSite);
		sb.append(", inspectionDistrictCode=");
		sb.append(inspectionDistrictCode);
		sb.append(", inspectionDistrictName=");
		sb.append(inspectionDistrictName);
		sb.append(", inspectionProvinceCode=");
		sb.append(inspectionProvinceCode);
		sb.append(", inspectionProvinceName=");
		sb.append(inspectionProvinceName);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", inspectorId=");
		sb.append(inspectorId);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", inspectionNote=");
		sb.append(inspectionNote);
		sb.append(", certificateNote=");
		sb.append(certificateNote);
		sb.append(", deliverableCode=");
		sb.append(deliverableCode);
		sb.append(", deliverableFileEntryid=");
		sb.append(deliverableFileEntryid);
		sb.append(", module=");
		sb.append(module);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRVehicleTypeCertificate toEntityModel() {
		VRVehicleTypeCertificateImpl vrVehicleTypeCertificateImpl = new VRVehicleTypeCertificateImpl();

		vrVehicleTypeCertificateImpl.setId(id);
		vrVehicleTypeCertificateImpl.setMtCore(mtCore);
		vrVehicleTypeCertificateImpl.setDossierId(dossierId);

		if (dossierIdCTN == null) {
			vrVehicleTypeCertificateImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (dossierType == null) {
			vrVehicleTypeCertificateImpl.setDossierType(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDossierType(dossierType);
		}

		if (dossierNo == null) {
			vrVehicleTypeCertificateImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrVehicleTypeCertificateImpl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setReferenceUid(referenceUid);
		}

		if (serviceCode == null) {
			vrVehicleTypeCertificateImpl.setServiceCode(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setServiceCode(serviceCode);
		}

		if (serviceName == null) {
			vrVehicleTypeCertificateImpl.setServiceName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setServiceName(serviceName);
		}

		vrVehicleTypeCertificateImpl.setConvertassembleId(convertassembleId);

		if (applicantIdNo == null) {
			vrVehicleTypeCertificateImpl.setApplicantIdNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setApplicantIdNo(applicantIdNo);
		}

		if (applicantTelNo == null) {
			vrVehicleTypeCertificateImpl.setApplicantTelNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setApplicantTelNo(applicantTelNo);
		}

		if (applicantName == null) {
			vrVehicleTypeCertificateImpl.setApplicantName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setApplicantName(applicantName);
		}

		if (applicantIdDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setApplicantIdDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setApplicantIdDate(new Date(
					applicantIdDate));
		}

		if (applicantAddress == null) {
			vrVehicleTypeCertificateImpl.setApplicantAddress(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setApplicantAddress(applicantAddress);
		}

		if (applicantRepresentative == null) {
			vrVehicleTypeCertificateImpl.setApplicantRepresentative(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setApplicantRepresentative(applicantRepresentative);
		}

		if (applicantRepresentativeTitle == null) {
			vrVehicleTypeCertificateImpl.setApplicantRepresentativeTitle(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
		}

		if (applicantEmail == null) {
			vrVehicleTypeCertificateImpl.setApplicantEmail(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setApplicantEmail(applicantEmail);
		}

		if (applicantPhone == null) {
			vrVehicleTypeCertificateImpl.setApplicantPhone(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setApplicantPhone(applicantPhone);
		}

		if (applicantFax == null) {
			vrVehicleTypeCertificateImpl.setApplicantFax(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setApplicantFax(applicantFax);
		}

		if (applicantContactName == null) {
			vrVehicleTypeCertificateImpl.setApplicantContactName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setApplicantContactName(applicantContactName);
		}

		if (applicantContactEmail == null) {
			vrVehicleTypeCertificateImpl.setApplicantContactEmail(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setApplicantContactEmail(applicantContactEmail);
		}

		if (applicantcontactPhone == null) {
			vrVehicleTypeCertificateImpl.setApplicantcontactPhone(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setApplicantcontactPhone(applicantcontactPhone);
		}

		if (applicantcontactTelNo == null) {
			vrVehicleTypeCertificateImpl.setApplicantcontactTelNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setApplicantcontactTelNo(applicantcontactTelNo);
		}

		if (cityCode == null) {
			vrVehicleTypeCertificateImpl.setCityCode(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCityCode(cityCode);
		}

		if (cityName == null) {
			vrVehicleTypeCertificateImpl.setCityName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCityName(cityName);
		}

		if (districtCode == null) {
			vrVehicleTypeCertificateImpl.setDistrictCode(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDistrictCode(districtCode);
		}

		if (districtName == null) {
			vrVehicleTypeCertificateImpl.setDistrictName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDistrictName(districtName);
		}

		if (wardCode == null) {
			vrVehicleTypeCertificateImpl.setWardCode(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setWardCode(wardCode);
		}

		if (wardName == null) {
			vrVehicleTypeCertificateImpl.setWardName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setWardName(wardName);
		}

		if (manufacturerForeignCode == null) {
			vrVehicleTypeCertificateImpl.setManufacturerForeignCode(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setManufacturerForeignCode(manufacturerForeignCode);
		}

		if (manufacturerName == null) {
			vrVehicleTypeCertificateImpl.setManufacturerName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setManufacturerName(manufacturerName);
		}

		if (manufacturerAddress == null) {
			vrVehicleTypeCertificateImpl.setManufacturerAddress(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setManufacturerAddress(manufacturerAddress);
		}

		if (manufacturerRepresentative == null) {
			vrVehicleTypeCertificateImpl.setManufacturerRepresentative(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setManufacturerRepresentative(manufacturerRepresentative);
		}

		if (manufacturerRepresentativeTitle == null) {
			vrVehicleTypeCertificateImpl.setManufacturerRepresentativeTitle(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setManufacturerRepresentativeTitle(manufacturerRepresentativeTitle);
		}

		if (manufacturerEmail == null) {
			vrVehicleTypeCertificateImpl.setManufacturerEmail(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setManufacturerEmail(manufacturerEmail);
		}

		if (manufacturerPhone == null) {
			vrVehicleTypeCertificateImpl.setManufacturerPhone(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setManufacturerPhone(manufacturerPhone);
		}

		if (manufacturerFax == null) {
			vrVehicleTypeCertificateImpl.setManufacturerFax(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setManufacturerFax(manufacturerFax);
		}

		if (productionPlantCode == null) {
			vrVehicleTypeCertificateImpl.setProductionPlantCode(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setProductionPlantCode(productionPlantCode);
		}

		if (productionPlantName == null) {
			vrVehicleTypeCertificateImpl.setProductionPlantName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setProductionPlantName(productionPlantName);
		}

		if (productionPlantAddress == null) {
			vrVehicleTypeCertificateImpl.setProductionPlantAddress(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setProductionPlantAddress(productionPlantAddress);
		}

		if (productionPlantRepresentative == null) {
			vrVehicleTypeCertificateImpl.setProductionPlantRepresentative(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setProductionPlantRepresentative(productionPlantRepresentative);
		}

		if (productionPlantRepresentativeTitle == null) {
			vrVehicleTypeCertificateImpl.setProductionPlantRepresentativeTitle(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setProductionPlantRepresentativeTitle(productionPlantRepresentativeTitle);
		}

		if (copReportNo == null) {
			vrVehicleTypeCertificateImpl.setCopReportNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCopReportNo(copReportNo);
		}

		if (copReportDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setCopReportDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setCopReportDate(new Date(
					copReportDate));
		}

		if (copReportExpireDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setCopReportExpireDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setCopReportExpireDate(new Date(
					copReportExpireDate));
		}

		if (designerCode == null) {
			vrVehicleTypeCertificateImpl.setDesignerCode(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDesignerCode(designerCode);
		}

		if (designerName == null) {
			vrVehicleTypeCertificateImpl.setDesignerName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDesignerName(designerName);
		}

		if (designerAddress == null) {
			vrVehicleTypeCertificateImpl.setDesignerAddress(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDesignerAddress(designerAddress);
		}

		if (designerRepresentative == null) {
			vrVehicleTypeCertificateImpl.setDesignerRepresentative(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDesignerRepresentative(designerRepresentative);
		}

		if (designerRepresentativeTitle == null) {
			vrVehicleTypeCertificateImpl.setDesignerRepresentativeTitle(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDesignerRepresentativeTitle(designerRepresentativeTitle);
		}

		if (designerEmail == null) {
			vrVehicleTypeCertificateImpl.setDesignerEmail(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDesignerEmail(designerEmail);
		}

		if (designerPhone == null) {
			vrVehicleTypeCertificateImpl.setDesignerPhone(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDesignerPhone(designerPhone);
		}

		if (designerFax == null) {
			vrVehicleTypeCertificateImpl.setDesignerFax(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDesignerFax(designerFax);
		}

		if (verificationCertificateNo == null) {
			vrVehicleTypeCertificateImpl.setVerificationCertificateNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setVerificationCertificateNo(verificationCertificateNo);
		}

		if (verificationCertificateDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setVerificationCertificateDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setVerificationCertificateDate(new Date(
					verificationCertificateDate));
		}

		if (verificationRefNo == null) {
			vrVehicleTypeCertificateImpl.setVerificationRefNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setVerificationRefNo(verificationRefNo);
		}

		if (verificationRefDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setVerificationRefDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setVerificationRefDate(new Date(
					verificationRefDate));
		}

		if (typeApprovalCertificateNo == null) {
			vrVehicleTypeCertificateImpl.setTypeApprovalCertificateNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setTypeApprovalCertificateNo(typeApprovalCertificateNo);
		}

		if (typeApprovalCertificateDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setTypeApprovalCertificateDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setTypeApprovalCertificateDate(new Date(
					typeApprovalCertificateDate));
		}

		if (designModelCode == null) {
			vrVehicleTypeCertificateImpl.setDesignModelCode(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDesignModelCode(designModelCode);
		}

		if (designModelDescription == null) {
			vrVehicleTypeCertificateImpl.setDesignModelDescription(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDesignModelDescription(designModelDescription);
		}

		if (designSymbol == null) {
			vrVehicleTypeCertificateImpl.setDesignSymbol(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDesignSymbol(designSymbol);
		}

		if (registeredNumber == null) {
			vrVehicleTypeCertificateImpl.setRegisteredNumber(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setRegisteredNumber(registeredNumber);
		}

		if (inspectorReceiveDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setInspectorReceiveDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectorReceiveDate(new Date(
					inspectorReceiveDate));
		}

		if (inspectorSubmitDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setInspectorSubmitDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectorSubmitDate(new Date(
					inspectorSubmitDate));
		}

		if (inspectorendorSementDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setInspectorendorSementDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectorendorSementDate(new Date(
					inspectorendorSementDate));
		}

		if (inspectorDeadline == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setInspectorDeadline(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectorDeadline(new Date(
					inspectorDeadline));
		}

		if (inspectorFinishDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setInspectorFinishDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectorFinishDate(new Date(
					inspectorFinishDate));
		}

		if (inspectorCancelDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setInspectorCancelDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectorCancelDate(new Date(
					inspectorCancelDate));
		}

		if (inspectorOrganization == null) {
			vrVehicleTypeCertificateImpl.setInspectorOrganization(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectorOrganization(inspectorOrganization);
		}

		if (inspectorDivision == null) {
			vrVehicleTypeCertificateImpl.setInspectorDivision(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectorDivision(inspectorDivision);
		}

		if (inspectorSignName == null) {
			vrVehicleTypeCertificateImpl.setInspectorSignName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectorSignName(inspectorSignName);
		}

		if (inspectorSignTitle == null) {
			vrVehicleTypeCertificateImpl.setInspectorSignTitle(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectorSignTitle(inspectorSignTitle);
		}

		if (inspectorSignPlace == null) {
			vrVehicleTypeCertificateImpl.setInspectorSignPlace(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectorSignPlace(inspectorSignPlace);
		}

		if (certificateType == null) {
			vrVehicleTypeCertificateImpl.setCertificateType(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertificateType(certificateType);
		}

		if (referenceCertificateNo == null) {
			vrVehicleTypeCertificateImpl.setReferenceCertificateNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setReferenceCertificateNo(referenceCertificateNo);
		}

		if (referenceCertificateDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setReferenceCertificateDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setReferenceCertificateDate(new Date(
					referenceCertificateDate));
		}

		if (certificateRecordNo == null) {
			vrVehicleTypeCertificateImpl.setCertificateRecordNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertificateRecordNo(certificateRecordNo);
		}

		if (certificateSignName == null) {
			vrVehicleTypeCertificateImpl.setCertificateSignName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertificateSignName(certificateSignName);
		}

		if (certificateSignTitle == null) {
			vrVehicleTypeCertificateImpl.setCertificateSignTitle(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertificateSignTitle(certificateSignTitle);
		}

		if (certificateSignPlace == null) {
			vrVehicleTypeCertificateImpl.setCertificateSignPlace(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertificateSignPlace(certificateSignPlace);
		}

		if (certificateRecordDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setCertificateRecordDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertificateRecordDate(new Date(
					certificateRecordDate));
		}

		if (certificateRecordExpireDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setCertificateRecordExpireDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertificateRecordExpireDate(new Date(
					certificateRecordExpireDate));
		}

		if (expiredStatus == null) {
			vrVehicleTypeCertificateImpl.setExpiredStatus(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setExpiredStatus(expiredStatus);
		}

		if (certificateRecordStatus == null) {
			vrVehicleTypeCertificateImpl.setCertificateRecordStatus(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertificateRecordStatus(certificateRecordStatus);
		}

		if (digitalIssueStatus == null) {
			vrVehicleTypeCertificateImpl.setDigitalIssueStatus(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDigitalIssueStatus(digitalIssueStatus);
		}

		if (vehicleClass == null) {
			vrVehicleTypeCertificateImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setVehicleClass(vehicleClass);
		}

		if (certifiedVehicleType == null) {
			vrVehicleTypeCertificateImpl.setCertifiedVehicleType(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedVehicleType(certifiedVehicleType);
		}

		if (certifiedVehicleTypeDescription == null) {
			vrVehicleTypeCertificateImpl.setCertifiedVehicleTypeDescription(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedVehicleTypeDescription(certifiedVehicleTypeDescription);
		}

		if (certifiedTrademark == null) {
			vrVehicleTypeCertificateImpl.setCertifiedTrademark(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedTrademark(certifiedTrademark);
		}

		if (certifiedTrademarkName == null) {
			vrVehicleTypeCertificateImpl.setCertifiedTrademarkName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedTrademarkName(certifiedTrademarkName);
		}

		if (certifiedCommercialName == null) {
			vrVehicleTypeCertificateImpl.setCertifiedCommercialName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedCommercialName(certifiedCommercialName);
		}

		if (certifiedModelCode == null) {
			vrVehicleTypeCertificateImpl.setCertifiedModelCode(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedModelCode(certifiedModelCode);
		}

		if (certifiedAssemblyType == null) {
			vrVehicleTypeCertificateImpl.setCertifiedAssemblyType(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedAssemblyType(certifiedAssemblyType);
		}

		if (certifiedAssemblyTypeDescription == null) {
			vrVehicleTypeCertificateImpl.setCertifiedAssemblyTypeDescription(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedAssemblyTypeDescription(certifiedAssemblyTypeDescription);
		}

		if (certifiedVINNo == null) {
			vrVehicleTypeCertificateImpl.setCertifiedVINNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedVINNo(certifiedVINNo);
		}

		if (certifiedVINPosition == null) {
			vrVehicleTypeCertificateImpl.setCertifiedVINPosition(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedVINPosition(certifiedVINPosition);
		}

		if (certifiedFrameNo == null) {
			vrVehicleTypeCertificateImpl.setCertifiedFrameNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedFrameNo(certifiedFrameNo);
		}

		if (certifiedFrameAttachPlace == null) {
			vrVehicleTypeCertificateImpl.setCertifiedFrameAttachPlace(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedFrameAttachPlace(certifiedFrameAttachPlace);
		}

		if (certifiedFramePosition == null) {
			vrVehicleTypeCertificateImpl.setCertifiedFramePosition(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedFramePosition(certifiedFramePosition);
		}

		if (certifiedEngineNo == null) {
			vrVehicleTypeCertificateImpl.setCertifiedEngineNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedEngineNo(certifiedEngineNo);
		}

		if (certifiedEngineAttachPlace == null) {
			vrVehicleTypeCertificateImpl.setCertifiedEngineAttachPlace(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedEngineAttachPlace(certifiedEngineAttachPlace);
		}

		if (certifiedEnginePosition == null) {
			vrVehicleTypeCertificateImpl.setCertifiedEnginePosition(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertifiedEnginePosition(certifiedEnginePosition);
		}

		if (safetyTestReportNo == null) {
			vrVehicleTypeCertificateImpl.setSafetyTestReportNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setSafetyTestReportNo(safetyTestReportNo);
		}

		if (safetyTestReportDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setSafetyTestReportDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setSafetyTestReportDate(new Date(
					safetyTestReportDate));
		}

		if (emissionTestReportNo == null) {
			vrVehicleTypeCertificateImpl.setEmissionTestReportNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setEmissionTestReportNo(emissionTestReportNo);
		}

		if (emissionTestReportDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setEmissionTestReportDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setEmissionTestReportDate(new Date(
					emissionTestReportDate));
		}

		if (commonSafetyStandard == null) {
			vrVehicleTypeCertificateImpl.setCommonSafetyStandard(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCommonSafetyStandard(commonSafetyStandard);
		}

		if (commonSafetyDescription == null) {
			vrVehicleTypeCertificateImpl.setCommonSafetyDescription(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCommonSafetyDescription(commonSafetyDescription);
		}

		if (emissionStandard == null) {
			vrVehicleTypeCertificateImpl.setEmissionStandard(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setEmissionStandard(emissionStandard);
		}

		if (emissionDescription == null) {
			vrVehicleTypeCertificateImpl.setEmissionDescription(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setEmissionDescription(emissionDescription);
		}

		if (otherTestReportNo == null) {
			vrVehicleTypeCertificateImpl.setOtherTestReportNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setOtherTestReportNo(otherTestReportNo);
		}

		if (otherTestReportDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setOtherTestReportDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setOtherTestReportDate(new Date(
					otherTestReportDate));
		}

		if (sampleFrameNo == null) {
			vrVehicleTypeCertificateImpl.setSampleFrameNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setSampleFrameNo(sampleFrameNo);
		}

		if (sampleVINNo == null) {
			vrVehicleTypeCertificateImpl.setSampleVINNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setSampleVINNo(sampleVINNo);
		}

		if (sampleEngineNo == null) {
			vrVehicleTypeCertificateImpl.setSampleEngineNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setSampleEngineNo(sampleEngineNo);
		}

		if (sampleVehicleType == null) {
			vrVehicleTypeCertificateImpl.setSampleVehicleType(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setSampleVehicleType(sampleVehicleType);
		}

		if (sampleVehicleTypeDescription == null) {
			vrVehicleTypeCertificateImpl.setSampleVehicleTypeDescription(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setSampleVehicleTypeDescription(sampleVehicleTypeDescription);
		}

		if (sampleTrademark == null) {
			vrVehicleTypeCertificateImpl.setSampleTrademark(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setSampleTrademark(sampleTrademark);
		}

		if (sampleTrademarkName == null) {
			vrVehicleTypeCertificateImpl.setSampleTrademarkName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setSampleTrademarkName(sampleTrademarkName);
		}

		if (sampleCommercialName == null) {
			vrVehicleTypeCertificateImpl.setSampleCommercialName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setSampleCommercialName(sampleCommercialName);
		}

		if (sampleModelCode == null) {
			vrVehicleTypeCertificateImpl.setSampleModelCode(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setSampleModelCode(sampleModelCode);
		}

		if (customsDeclarationNo == null) {
			vrVehicleTypeCertificateImpl.setCustomsDeclarationNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCustomsDeclarationNo(customsDeclarationNo);
		}

		if (customsDeclarationDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setCustomsDeclarationDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setCustomsDeclarationDate(new Date(
					customsDeclarationDate));
		}

		if (productionCountry == null) {
			vrVehicleTypeCertificateImpl.setProductionCountry(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setProductionCountry(productionCountry);
		}

		vrVehicleTypeCertificateImpl.setImporterQuantity(importerQuantity);

		if (inspectionRecordNo == null) {
			vrVehicleTypeCertificateImpl.setInspectionRecordNo(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectionRecordNo(inspectionRecordNo);
		}

		if (inspectionDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setInspectionDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectionDate(new Date(
					inspectionDate));
		}

		if (inspectionSite == null) {
			vrVehicleTypeCertificateImpl.setInspectionSite(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectionSite(inspectionSite);
		}

		if (inspectionDistrictCode == null) {
			vrVehicleTypeCertificateImpl.setInspectionDistrictCode(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectionDistrictCode(inspectionDistrictCode);
		}

		if (inspectionDistrictName == null) {
			vrVehicleTypeCertificateImpl.setInspectionDistrictName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectionDistrictName(inspectionDistrictName);
		}

		if (inspectionProvinceCode == null) {
			vrVehicleTypeCertificateImpl.setInspectionProvinceCode(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectionProvinceCode(inspectionProvinceCode);
		}

		if (inspectionProvinceName == null) {
			vrVehicleTypeCertificateImpl.setInspectionProvinceName(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectionProvinceName(inspectionProvinceName);
		}

		if (corporationId == null) {
			vrVehicleTypeCertificateImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCorporationId(corporationId);
		}

		vrVehicleTypeCertificateImpl.setInspectorId(inspectorId);

		if (remarks == null) {
			vrVehicleTypeCertificateImpl.setRemarks(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setRemarks(remarks);
		}

		if (inspectionNote == null) {
			vrVehicleTypeCertificateImpl.setInspectionNote(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setInspectionNote(inspectionNote);
		}

		if (certificateNote == null) {
			vrVehicleTypeCertificateImpl.setCertificateNote(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setCertificateNote(certificateNote);
		}

		if (deliverableCode == null) {
			vrVehicleTypeCertificateImpl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setDeliverableCode(deliverableCode);
		}

		vrVehicleTypeCertificateImpl.setDeliverableFileEntryid(deliverableFileEntryid);

		if (module == null) {
			vrVehicleTypeCertificateImpl.setModule(StringPool.BLANK);
		}
		else {
			vrVehicleTypeCertificateImpl.setModule(module);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setModifyDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrVehicleTypeCertificateImpl.setSyncDate(null);
		}
		else {
			vrVehicleTypeCertificateImpl.setSyncDate(new Date(syncDate));
		}

		vrVehicleTypeCertificateImpl.resetOriginalValues();

		return vrVehicleTypeCertificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		dossierId = objectInput.readLong();
		dossierIdCTN = objectInput.readUTF();
		dossierType = objectInput.readUTF();
		dossierNo = objectInput.readUTF();
		referenceUid = objectInput.readUTF();
		serviceCode = objectInput.readUTF();
		serviceName = objectInput.readUTF();

		convertassembleId = objectInput.readLong();
		applicantIdNo = objectInput.readUTF();
		applicantTelNo = objectInput.readUTF();
		applicantName = objectInput.readUTF();
		applicantIdDate = objectInput.readLong();
		applicantAddress = objectInput.readUTF();
		applicantRepresentative = objectInput.readUTF();
		applicantRepresentativeTitle = objectInput.readUTF();
		applicantEmail = objectInput.readUTF();
		applicantPhone = objectInput.readUTF();
		applicantFax = objectInput.readUTF();
		applicantContactName = objectInput.readUTF();
		applicantContactEmail = objectInput.readUTF();
		applicantcontactPhone = objectInput.readUTF();
		applicantcontactTelNo = objectInput.readUTF();
		cityCode = objectInput.readUTF();
		cityName = objectInput.readUTF();
		districtCode = objectInput.readUTF();
		districtName = objectInput.readUTF();
		wardCode = objectInput.readUTF();
		wardName = objectInput.readUTF();
		manufacturerForeignCode = objectInput.readUTF();
		manufacturerName = objectInput.readUTF();
		manufacturerAddress = objectInput.readUTF();
		manufacturerRepresentative = objectInput.readUTF();
		manufacturerRepresentativeTitle = objectInput.readUTF();
		manufacturerEmail = objectInput.readUTF();
		manufacturerPhone = objectInput.readUTF();
		manufacturerFax = objectInput.readUTF();
		productionPlantCode = objectInput.readUTF();
		productionPlantName = objectInput.readUTF();
		productionPlantAddress = objectInput.readUTF();
		productionPlantRepresentative = objectInput.readUTF();
		productionPlantRepresentativeTitle = objectInput.readUTF();
		copReportNo = objectInput.readUTF();
		copReportDate = objectInput.readLong();
		copReportExpireDate = objectInput.readLong();
		designerCode = objectInput.readUTF();
		designerName = objectInput.readUTF();
		designerAddress = objectInput.readUTF();
		designerRepresentative = objectInput.readUTF();
		designerRepresentativeTitle = objectInput.readUTF();
		designerEmail = objectInput.readUTF();
		designerPhone = objectInput.readUTF();
		designerFax = objectInput.readUTF();
		verificationCertificateNo = objectInput.readUTF();
		verificationCertificateDate = objectInput.readLong();
		verificationRefNo = objectInput.readUTF();
		verificationRefDate = objectInput.readLong();
		typeApprovalCertificateNo = objectInput.readUTF();
		typeApprovalCertificateDate = objectInput.readLong();
		designModelCode = objectInput.readUTF();
		designModelDescription = objectInput.readUTF();
		designSymbol = objectInput.readUTF();
		registeredNumber = objectInput.readUTF();
		inspectorReceiveDate = objectInput.readLong();
		inspectorSubmitDate = objectInput.readLong();
		inspectorendorSementDate = objectInput.readLong();
		inspectorDeadline = objectInput.readLong();
		inspectorFinishDate = objectInput.readLong();
		inspectorCancelDate = objectInput.readLong();
		inspectorOrganization = objectInput.readUTF();
		inspectorDivision = objectInput.readUTF();
		inspectorSignName = objectInput.readUTF();
		inspectorSignTitle = objectInput.readUTF();
		inspectorSignPlace = objectInput.readUTF();
		certificateType = objectInput.readUTF();
		referenceCertificateNo = objectInput.readUTF();
		referenceCertificateDate = objectInput.readLong();
		certificateRecordNo = objectInput.readUTF();
		certificateSignName = objectInput.readUTF();
		certificateSignTitle = objectInput.readUTF();
		certificateSignPlace = objectInput.readUTF();
		certificateRecordDate = objectInput.readLong();
		certificateRecordExpireDate = objectInput.readLong();
		expiredStatus = objectInput.readUTF();
		certificateRecordStatus = objectInput.readUTF();
		digitalIssueStatus = objectInput.readUTF();
		vehicleClass = objectInput.readUTF();
		certifiedVehicleType = objectInput.readUTF();
		certifiedVehicleTypeDescription = objectInput.readUTF();
		certifiedTrademark = objectInput.readUTF();
		certifiedTrademarkName = objectInput.readUTF();
		certifiedCommercialName = objectInput.readUTF();
		certifiedModelCode = objectInput.readUTF();
		certifiedAssemblyType = objectInput.readUTF();
		certifiedAssemblyTypeDescription = objectInput.readUTF();
		certifiedVINNo = objectInput.readUTF();
		certifiedVINPosition = objectInput.readUTF();
		certifiedFrameNo = objectInput.readUTF();
		certifiedFrameAttachPlace = objectInput.readUTF();
		certifiedFramePosition = objectInput.readUTF();
		certifiedEngineNo = objectInput.readUTF();
		certifiedEngineAttachPlace = objectInput.readUTF();
		certifiedEnginePosition = objectInput.readUTF();
		safetyTestReportNo = objectInput.readUTF();
		safetyTestReportDate = objectInput.readLong();
		emissionTestReportNo = objectInput.readUTF();
		emissionTestReportDate = objectInput.readLong();
		commonSafetyStandard = objectInput.readUTF();
		commonSafetyDescription = objectInput.readUTF();
		emissionStandard = objectInput.readUTF();
		emissionDescription = objectInput.readUTF();
		otherTestReportNo = objectInput.readUTF();
		otherTestReportDate = objectInput.readLong();
		sampleFrameNo = objectInput.readUTF();
		sampleVINNo = objectInput.readUTF();
		sampleEngineNo = objectInput.readUTF();
		sampleVehicleType = objectInput.readUTF();
		sampleVehicleTypeDescription = objectInput.readUTF();
		sampleTrademark = objectInput.readUTF();
		sampleTrademarkName = objectInput.readUTF();
		sampleCommercialName = objectInput.readUTF();
		sampleModelCode = objectInput.readUTF();
		customsDeclarationNo = objectInput.readUTF();
		customsDeclarationDate = objectInput.readLong();
		productionCountry = objectInput.readUTF();

		importerQuantity = objectInput.readLong();
		inspectionRecordNo = objectInput.readUTF();
		inspectionDate = objectInput.readLong();
		inspectionSite = objectInput.readUTF();
		inspectionDistrictCode = objectInput.readUTF();
		inspectionDistrictName = objectInput.readUTF();
		inspectionProvinceCode = objectInput.readUTF();
		inspectionProvinceName = objectInput.readUTF();
		corporationId = objectInput.readUTF();

		inspectorId = objectInput.readLong();
		remarks = objectInput.readUTF();
		inspectionNote = objectInput.readUTF();
		certificateNote = objectInput.readUTF();
		deliverableCode = objectInput.readUTF();

		deliverableFileEntryid = objectInput.readLong();
		module = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(dossierId);

		if (dossierIdCTN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierIdCTN);
		}

		if (dossierType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierType);
		}

		if (dossierNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierNo);
		}

		if (referenceUid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(referenceUid);
		}

		if (serviceCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serviceCode);
		}

		if (serviceName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serviceName);
		}

		objectOutput.writeLong(convertassembleId);

		if (applicantIdNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantIdNo);
		}

		if (applicantTelNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantTelNo);
		}

		if (applicantName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantName);
		}

		objectOutput.writeLong(applicantIdDate);

		if (applicantAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantAddress);
		}

		if (applicantRepresentative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantRepresentative);
		}

		if (applicantRepresentativeTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantRepresentativeTitle);
		}

		if (applicantEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantEmail);
		}

		if (applicantPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantPhone);
		}

		if (applicantFax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantFax);
		}

		if (applicantContactName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantContactName);
		}

		if (applicantContactEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantContactEmail);
		}

		if (applicantcontactPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantcontactPhone);
		}

		if (applicantcontactTelNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantcontactTelNo);
		}

		if (cityCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cityCode);
		}

		if (cityName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cityName);
		}

		if (districtCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(districtCode);
		}

		if (districtName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(districtName);
		}

		if (wardCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wardCode);
		}

		if (wardName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wardName);
		}

		if (manufacturerForeignCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturerForeignCode);
		}

		if (manufacturerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturerName);
		}

		if (manufacturerAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturerAddress);
		}

		if (manufacturerRepresentative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturerRepresentative);
		}

		if (manufacturerRepresentativeTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturerRepresentativeTitle);
		}

		if (manufacturerEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturerEmail);
		}

		if (manufacturerPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturerPhone);
		}

		if (manufacturerFax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturerFax);
		}

		if (productionPlantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantCode);
		}

		if (productionPlantName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantName);
		}

		if (productionPlantAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantAddress);
		}

		if (productionPlantRepresentative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantRepresentative);
		}

		if (productionPlantRepresentativeTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantRepresentativeTitle);
		}

		if (copReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportNo);
		}

		objectOutput.writeLong(copReportDate);
		objectOutput.writeLong(copReportExpireDate);

		if (designerCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designerCode);
		}

		if (designerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designerName);
		}

		if (designerAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designerAddress);
		}

		if (designerRepresentative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designerRepresentative);
		}

		if (designerRepresentativeTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designerRepresentativeTitle);
		}

		if (designerEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designerEmail);
		}

		if (designerPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designerPhone);
		}

		if (designerFax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designerFax);
		}

		if (verificationCertificateNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(verificationCertificateNo);
		}

		objectOutput.writeLong(verificationCertificateDate);

		if (verificationRefNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(verificationRefNo);
		}

		objectOutput.writeLong(verificationRefDate);

		if (typeApprovalCertificateNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(typeApprovalCertificateNo);
		}

		objectOutput.writeLong(typeApprovalCertificateDate);

		if (designModelCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designModelCode);
		}

		if (designModelDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designModelDescription);
		}

		if (designSymbol == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designSymbol);
		}

		if (registeredNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registeredNumber);
		}

		objectOutput.writeLong(inspectorReceiveDate);
		objectOutput.writeLong(inspectorSubmitDate);
		objectOutput.writeLong(inspectorendorSementDate);
		objectOutput.writeLong(inspectorDeadline);
		objectOutput.writeLong(inspectorFinishDate);
		objectOutput.writeLong(inspectorCancelDate);

		if (inspectorOrganization == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorOrganization);
		}

		if (inspectorDivision == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorDivision);
		}

		if (inspectorSignName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorSignName);
		}

		if (inspectorSignTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorSignTitle);
		}

		if (inspectorSignPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorSignPlace);
		}

		if (certificateType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateType);
		}

		if (referenceCertificateNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(referenceCertificateNo);
		}

		objectOutput.writeLong(referenceCertificateDate);

		if (certificateRecordNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateRecordNo);
		}

		if (certificateSignName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateSignName);
		}

		if (certificateSignTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateSignTitle);
		}

		if (certificateSignPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateSignPlace);
		}

		objectOutput.writeLong(certificateRecordDate);
		objectOutput.writeLong(certificateRecordExpireDate);

		if (expiredStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(expiredStatus);
		}

		if (certificateRecordStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateRecordStatus);
		}

		if (digitalIssueStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(digitalIssueStatus);
		}

		if (vehicleClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleClass);
		}

		if (certifiedVehicleType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedVehicleType);
		}

		if (certifiedVehicleTypeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedVehicleTypeDescription);
		}

		if (certifiedTrademark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedTrademark);
		}

		if (certifiedTrademarkName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedTrademarkName);
		}

		if (certifiedCommercialName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedCommercialName);
		}

		if (certifiedModelCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedModelCode);
		}

		if (certifiedAssemblyType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedAssemblyType);
		}

		if (certifiedAssemblyTypeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedAssemblyTypeDescription);
		}

		if (certifiedVINNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedVINNo);
		}

		if (certifiedVINPosition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedVINPosition);
		}

		if (certifiedFrameNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedFrameNo);
		}

		if (certifiedFrameAttachPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedFrameAttachPlace);
		}

		if (certifiedFramePosition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedFramePosition);
		}

		if (certifiedEngineNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedEngineNo);
		}

		if (certifiedEngineAttachPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedEngineAttachPlace);
		}

		if (certifiedEnginePosition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedEnginePosition);
		}

		if (safetyTestReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(safetyTestReportNo);
		}

		objectOutput.writeLong(safetyTestReportDate);

		if (emissionTestReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emissionTestReportNo);
		}

		objectOutput.writeLong(emissionTestReportDate);

		if (commonSafetyStandard == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commonSafetyStandard);
		}

		if (commonSafetyDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commonSafetyDescription);
		}

		if (emissionStandard == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emissionStandard);
		}

		if (emissionDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emissionDescription);
		}

		if (otherTestReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(otherTestReportNo);
		}

		objectOutput.writeLong(otherTestReportDate);

		if (sampleFrameNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sampleFrameNo);
		}

		if (sampleVINNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sampleVINNo);
		}

		if (sampleEngineNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sampleEngineNo);
		}

		if (sampleVehicleType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sampleVehicleType);
		}

		if (sampleVehicleTypeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sampleVehicleTypeDescription);
		}

		if (sampleTrademark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sampleTrademark);
		}

		if (sampleTrademarkName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sampleTrademarkName);
		}

		if (sampleCommercialName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sampleCommercialName);
		}

		if (sampleModelCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sampleModelCode);
		}

		if (customsDeclarationNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customsDeclarationNo);
		}

		objectOutput.writeLong(customsDeclarationDate);

		if (productionCountry == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionCountry);
		}

		objectOutput.writeLong(importerQuantity);

		if (inspectionRecordNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionRecordNo);
		}

		objectOutput.writeLong(inspectionDate);

		if (inspectionSite == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionSite);
		}

		if (inspectionDistrictCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionDistrictCode);
		}

		if (inspectionDistrictName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionDistrictName);
		}

		if (inspectionProvinceCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionProvinceCode);
		}

		if (inspectionProvinceName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionProvinceName);
		}

		if (corporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationId);
		}

		objectOutput.writeLong(inspectorId);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (inspectionNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionNote);
		}

		if (certificateNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateNote);
		}

		if (deliverableCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(deliverableCode);
		}

		objectOutput.writeLong(deliverableFileEntryid);

		if (module == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(module);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public long dossierId;
	public String dossierIdCTN;
	public String dossierType;
	public String dossierNo;
	public String referenceUid;
	public String serviceCode;
	public String serviceName;
	public long convertassembleId;
	public String applicantIdNo;
	public String applicantTelNo;
	public String applicantName;
	public long applicantIdDate;
	public String applicantAddress;
	public String applicantRepresentative;
	public String applicantRepresentativeTitle;
	public String applicantEmail;
	public String applicantPhone;
	public String applicantFax;
	public String applicantContactName;
	public String applicantContactEmail;
	public String applicantcontactPhone;
	public String applicantcontactTelNo;
	public String cityCode;
	public String cityName;
	public String districtCode;
	public String districtName;
	public String wardCode;
	public String wardName;
	public String manufacturerForeignCode;
	public String manufacturerName;
	public String manufacturerAddress;
	public String manufacturerRepresentative;
	public String manufacturerRepresentativeTitle;
	public String manufacturerEmail;
	public String manufacturerPhone;
	public String manufacturerFax;
	public String productionPlantCode;
	public String productionPlantName;
	public String productionPlantAddress;
	public String productionPlantRepresentative;
	public String productionPlantRepresentativeTitle;
	public String copReportNo;
	public long copReportDate;
	public long copReportExpireDate;
	public String designerCode;
	public String designerName;
	public String designerAddress;
	public String designerRepresentative;
	public String designerRepresentativeTitle;
	public String designerEmail;
	public String designerPhone;
	public String designerFax;
	public String verificationCertificateNo;
	public long verificationCertificateDate;
	public String verificationRefNo;
	public long verificationRefDate;
	public String typeApprovalCertificateNo;
	public long typeApprovalCertificateDate;
	public String designModelCode;
	public String designModelDescription;
	public String designSymbol;
	public String registeredNumber;
	public long inspectorReceiveDate;
	public long inspectorSubmitDate;
	public long inspectorendorSementDate;
	public long inspectorDeadline;
	public long inspectorFinishDate;
	public long inspectorCancelDate;
	public String inspectorOrganization;
	public String inspectorDivision;
	public String inspectorSignName;
	public String inspectorSignTitle;
	public String inspectorSignPlace;
	public String certificateType;
	public String referenceCertificateNo;
	public long referenceCertificateDate;
	public String certificateRecordNo;
	public String certificateSignName;
	public String certificateSignTitle;
	public String certificateSignPlace;
	public long certificateRecordDate;
	public long certificateRecordExpireDate;
	public String expiredStatus;
	public String certificateRecordStatus;
	public String digitalIssueStatus;
	public String vehicleClass;
	public String certifiedVehicleType;
	public String certifiedVehicleTypeDescription;
	public String certifiedTrademark;
	public String certifiedTrademarkName;
	public String certifiedCommercialName;
	public String certifiedModelCode;
	public String certifiedAssemblyType;
	public String certifiedAssemblyTypeDescription;
	public String certifiedVINNo;
	public String certifiedVINPosition;
	public String certifiedFrameNo;
	public String certifiedFrameAttachPlace;
	public String certifiedFramePosition;
	public String certifiedEngineNo;
	public String certifiedEngineAttachPlace;
	public String certifiedEnginePosition;
	public String safetyTestReportNo;
	public long safetyTestReportDate;
	public String emissionTestReportNo;
	public long emissionTestReportDate;
	public String commonSafetyStandard;
	public String commonSafetyDescription;
	public String emissionStandard;
	public String emissionDescription;
	public String otherTestReportNo;
	public long otherTestReportDate;
	public String sampleFrameNo;
	public String sampleVINNo;
	public String sampleEngineNo;
	public String sampleVehicleType;
	public String sampleVehicleTypeDescription;
	public String sampleTrademark;
	public String sampleTrademarkName;
	public String sampleCommercialName;
	public String sampleModelCode;
	public String customsDeclarationNo;
	public long customsDeclarationDate;
	public String productionCountry;
	public long importerQuantity;
	public String inspectionRecordNo;
	public long inspectionDate;
	public String inspectionSite;
	public String inspectionDistrictCode;
	public String inspectionDistrictName;
	public String inspectionProvinceCode;
	public String inspectionProvinceName;
	public String corporationId;
	public long inspectorId;
	public String remarks;
	public String inspectionNote;
	public String certificateNote;
	public String deliverableCode;
	public long deliverableFileEntryid;
	public String module;
	public long modifyDate;
	public long syncDate;
}