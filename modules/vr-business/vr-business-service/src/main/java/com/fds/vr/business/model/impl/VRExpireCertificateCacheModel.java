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

import com.fds.vr.business.model.VRExpireCertificate;

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
 * The cache model class for representing VRExpireCertificate in entity cache.
 *
 * @author LamTV
 * @see VRExpireCertificate
 * @generated
 */
@ProviderType
public class VRExpireCertificateCacheModel implements CacheModel<VRExpireCertificate>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRExpireCertificateCacheModel)) {
			return false;
		}

		VRExpireCertificateCacheModel vrExpireCertificateCacheModel = (VRExpireCertificateCacheModel)obj;

		if (id == vrExpireCertificateCacheModel.id) {
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
		StringBundler sb = new StringBundler(101);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", convertAssembleId=");
		sb.append(convertAssembleId);
		sb.append(", validDossierId=");
		sb.append(validDossierId);
		sb.append(", validDossierIdCTN=");
		sb.append(validDossierIdCTN);
		sb.append(", validDossierNo=");
		sb.append(validDossierNo);
		sb.append(", vehicleTypeCertificateId=");
		sb.append(vehicleTypeCertificateId);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierIdCTN=");
		sb.append(dossierIdCTN);
		sb.append(", dossierNo=");
		sb.append(dossierNo);
		sb.append(", dossierStatus=");
		sb.append(dossierStatus);
		sb.append(", previousExpireDate=");
		sb.append(previousExpireDate);
		sb.append(", certificateRecordNo=");
		sb.append(certificateRecordNo);
		sb.append(", certificateRecordDate=");
		sb.append(certificateRecordDate);
		sb.append(", certificateRecordExpireDate=");
		sb.append(certificateRecordExpireDate);
		sb.append(", expiredStatus=");
		sb.append(expiredStatus);
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
		sb.append(", productionCountry=");
		sb.append(productionCountry);
		sb.append(", safetytestReportNo=");
		sb.append(safetytestReportNo);
		sb.append(", safetytestReportDate=");
		sb.append(safetytestReportDate);
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
		sb.append(", othertestReportNo=");
		sb.append(othertestReportNo);
		sb.append(", othertestReportDate=");
		sb.append(othertestReportDate);
		sb.append(", copReportNo=");
		sb.append(copReportNo);
		sb.append(", copReportDate=");
		sb.append(copReportDate);
		sb.append(", copReportExpireDate=");
		sb.append(copReportExpireDate);
		sb.append(", validRequestNo=");
		sb.append(validRequestNo);
		sb.append(", validRequestDate=");
		sb.append(validRequestDate);
		sb.append(", validInspectionRecordNo=");
		sb.append(validInspectionRecordNo);
		sb.append(", validInspectionRecordDate=");
		sb.append(validInspectionRecordDate);
		sb.append(", validCorporationId=");
		sb.append(validCorporationId);
		sb.append(", validInspectorId=");
		sb.append(validInspectorId);
		sb.append(", validInspectorName=");
		sb.append(validInspectorName);
		sb.append(", validRemarks=");
		sb.append(validRemarks);
		sb.append(", validInspectionNote=");
		sb.append(validInspectionNote);
		sb.append(", deliverableFileEntryId=");
		sb.append(deliverableFileEntryId);
		sb.append(", documentFileEntryId=");
		sb.append(documentFileEntryId);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRExpireCertificate toEntityModel() {
		VRExpireCertificateImpl vrExpireCertificateImpl = new VRExpireCertificateImpl();

		vrExpireCertificateImpl.setId(id);
		vrExpireCertificateImpl.setMtCore(mtCore);
		vrExpireCertificateImpl.setConvertAssembleId(convertAssembleId);
		vrExpireCertificateImpl.setValidDossierId(validDossierId);

		if (validDossierIdCTN == null) {
			vrExpireCertificateImpl.setValidDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setValidDossierIdCTN(validDossierIdCTN);
		}

		if (validDossierNo == null) {
			vrExpireCertificateImpl.setValidDossierNo(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setValidDossierNo(validDossierNo);
		}

		vrExpireCertificateImpl.setVehicleTypeCertificateId(vehicleTypeCertificateId);
		vrExpireCertificateImpl.setDossierId(dossierId);

		if (dossierIdCTN == null) {
			vrExpireCertificateImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (dossierNo == null) {
			vrExpireCertificateImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setDossierNo(dossierNo);
		}

		if (dossierStatus == null) {
			vrExpireCertificateImpl.setDossierStatus(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setDossierStatus(dossierStatus);
		}

		if (previousExpireDate == Long.MIN_VALUE) {
			vrExpireCertificateImpl.setPreviousExpireDate(null);
		}
		else {
			vrExpireCertificateImpl.setPreviousExpireDate(new Date(
					previousExpireDate));
		}

		if (certificateRecordNo == null) {
			vrExpireCertificateImpl.setCertificateRecordNo(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setCertificateRecordNo(certificateRecordNo);
		}

		if (certificateRecordDate == Long.MIN_VALUE) {
			vrExpireCertificateImpl.setCertificateRecordDate(null);
		}
		else {
			vrExpireCertificateImpl.setCertificateRecordDate(new Date(
					certificateRecordDate));
		}

		if (certificateRecordExpireDate == Long.MIN_VALUE) {
			vrExpireCertificateImpl.setCertificateRecordExpireDate(null);
		}
		else {
			vrExpireCertificateImpl.setCertificateRecordExpireDate(new Date(
					certificateRecordExpireDate));
		}

		vrExpireCertificateImpl.setExpiredStatus(expiredStatus);

		if (vehicleClass == null) {
			vrExpireCertificateImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setVehicleClass(vehicleClass);
		}

		if (certifiedVehicleType == null) {
			vrExpireCertificateImpl.setCertifiedVehicleType(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setCertifiedVehicleType(certifiedVehicleType);
		}

		if (certifiedVehicleTypeDescription == null) {
			vrExpireCertificateImpl.setCertifiedVehicleTypeDescription(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setCertifiedVehicleTypeDescription(certifiedVehicleTypeDescription);
		}

		if (certifiedTrademark == null) {
			vrExpireCertificateImpl.setCertifiedTrademark(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setCertifiedTrademark(certifiedTrademark);
		}

		if (certifiedTrademarkName == null) {
			vrExpireCertificateImpl.setCertifiedTrademarkName(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setCertifiedTrademarkName(certifiedTrademarkName);
		}

		if (certifiedCommercialName == null) {
			vrExpireCertificateImpl.setCertifiedCommercialName(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setCertifiedCommercialName(certifiedCommercialName);
		}

		if (certifiedModelCode == null) {
			vrExpireCertificateImpl.setCertifiedModelCode(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setCertifiedModelCode(certifiedModelCode);
		}

		if (productionCountry == null) {
			vrExpireCertificateImpl.setProductionCountry(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setProductionCountry(productionCountry);
		}

		if (safetytestReportNo == null) {
			vrExpireCertificateImpl.setSafetytestReportNo(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setSafetytestReportNo(safetytestReportNo);
		}

		if (safetytestReportDate == Long.MIN_VALUE) {
			vrExpireCertificateImpl.setSafetytestReportDate(null);
		}
		else {
			vrExpireCertificateImpl.setSafetytestReportDate(new Date(
					safetytestReportDate));
		}

		if (emissionTestReportNo == null) {
			vrExpireCertificateImpl.setEmissionTestReportNo(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setEmissionTestReportNo(emissionTestReportNo);
		}

		if (emissionTestReportDate == Long.MIN_VALUE) {
			vrExpireCertificateImpl.setEmissionTestReportDate(null);
		}
		else {
			vrExpireCertificateImpl.setEmissionTestReportDate(new Date(
					emissionTestReportDate));
		}

		if (commonSafetyStandard == null) {
			vrExpireCertificateImpl.setCommonSafetyStandard(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setCommonSafetyStandard(commonSafetyStandard);
		}

		if (commonSafetyDescription == null) {
			vrExpireCertificateImpl.setCommonSafetyDescription(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setCommonSafetyDescription(commonSafetyDescription);
		}

		if (emissionStandard == null) {
			vrExpireCertificateImpl.setEmissionStandard(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setEmissionStandard(emissionStandard);
		}

		if (emissionDescription == null) {
			vrExpireCertificateImpl.setEmissionDescription(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setEmissionDescription(emissionDescription);
		}

		if (othertestReportNo == null) {
			vrExpireCertificateImpl.setOthertestReportNo(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setOthertestReportNo(othertestReportNo);
		}

		if (othertestReportDate == Long.MIN_VALUE) {
			vrExpireCertificateImpl.setOthertestReportDate(null);
		}
		else {
			vrExpireCertificateImpl.setOthertestReportDate(new Date(
					othertestReportDate));
		}

		if (copReportNo == null) {
			vrExpireCertificateImpl.setCopReportNo(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setCopReportNo(copReportNo);
		}

		if (copReportDate == Long.MIN_VALUE) {
			vrExpireCertificateImpl.setCopReportDate(null);
		}
		else {
			vrExpireCertificateImpl.setCopReportDate(new Date(copReportDate));
		}

		if (copReportExpireDate == Long.MIN_VALUE) {
			vrExpireCertificateImpl.setCopReportExpireDate(null);
		}
		else {
			vrExpireCertificateImpl.setCopReportExpireDate(new Date(
					copReportExpireDate));
		}

		if (validRequestNo == null) {
			vrExpireCertificateImpl.setValidRequestNo(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setValidRequestNo(validRequestNo);
		}

		if (validRequestDate == Long.MIN_VALUE) {
			vrExpireCertificateImpl.setValidRequestDate(null);
		}
		else {
			vrExpireCertificateImpl.setValidRequestDate(new Date(
					validRequestDate));
		}

		if (validInspectionRecordNo == null) {
			vrExpireCertificateImpl.setValidInspectionRecordNo(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setValidInspectionRecordNo(validInspectionRecordNo);
		}

		if (validInspectionRecordDate == Long.MIN_VALUE) {
			vrExpireCertificateImpl.setValidInspectionRecordDate(null);
		}
		else {
			vrExpireCertificateImpl.setValidInspectionRecordDate(new Date(
					validInspectionRecordDate));
		}

		vrExpireCertificateImpl.setValidCorporationId(validCorporationId);
		vrExpireCertificateImpl.setValidInspectorId(validInspectorId);

		if (validInspectorName == null) {
			vrExpireCertificateImpl.setValidInspectorName(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setValidInspectorName(validInspectorName);
		}

		if (validRemarks == null) {
			vrExpireCertificateImpl.setValidRemarks(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setValidRemarks(validRemarks);
		}

		if (validInspectionNote == null) {
			vrExpireCertificateImpl.setValidInspectionNote(StringPool.BLANK);
		}
		else {
			vrExpireCertificateImpl.setValidInspectionNote(validInspectionNote);
		}

		vrExpireCertificateImpl.setDeliverableFileEntryId(deliverableFileEntryId);
		vrExpireCertificateImpl.setDocumentFileEntryId(documentFileEntryId);

		if (modifyDate == Long.MIN_VALUE) {
			vrExpireCertificateImpl.setModifyDate(null);
		}
		else {
			vrExpireCertificateImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrExpireCertificateImpl.setSyncDate(null);
		}
		else {
			vrExpireCertificateImpl.setSyncDate(new Date(syncDate));
		}

		vrExpireCertificateImpl.resetOriginalValues();

		return vrExpireCertificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		convertAssembleId = objectInput.readLong();

		validDossierId = objectInput.readLong();
		validDossierIdCTN = objectInput.readUTF();
		validDossierNo = objectInput.readUTF();

		vehicleTypeCertificateId = objectInput.readLong();

		dossierId = objectInput.readLong();
		dossierIdCTN = objectInput.readUTF();
		dossierNo = objectInput.readUTF();
		dossierStatus = objectInput.readUTF();
		previousExpireDate = objectInput.readLong();
		certificateRecordNo = objectInput.readUTF();
		certificateRecordDate = objectInput.readLong();
		certificateRecordExpireDate = objectInput.readLong();

		expiredStatus = objectInput.readInt();
		vehicleClass = objectInput.readUTF();
		certifiedVehicleType = objectInput.readUTF();
		certifiedVehicleTypeDescription = objectInput.readUTF();
		certifiedTrademark = objectInput.readUTF();
		certifiedTrademarkName = objectInput.readUTF();
		certifiedCommercialName = objectInput.readUTF();
		certifiedModelCode = objectInput.readUTF();
		productionCountry = objectInput.readUTF();
		safetytestReportNo = objectInput.readUTF();
		safetytestReportDate = objectInput.readLong();
		emissionTestReportNo = objectInput.readUTF();
		emissionTestReportDate = objectInput.readLong();
		commonSafetyStandard = objectInput.readUTF();
		commonSafetyDescription = objectInput.readUTF();
		emissionStandard = objectInput.readUTF();
		emissionDescription = objectInput.readUTF();
		othertestReportNo = objectInput.readUTF();
		othertestReportDate = objectInput.readLong();
		copReportNo = objectInput.readUTF();
		copReportDate = objectInput.readLong();
		copReportExpireDate = objectInput.readLong();
		validRequestNo = objectInput.readUTF();
		validRequestDate = objectInput.readLong();
		validInspectionRecordNo = objectInput.readUTF();
		validInspectionRecordDate = objectInput.readLong();

		validCorporationId = objectInput.readLong();

		validInspectorId = objectInput.readLong();
		validInspectorName = objectInput.readUTF();
		validRemarks = objectInput.readUTF();
		validInspectionNote = objectInput.readUTF();

		deliverableFileEntryId = objectInput.readLong();

		documentFileEntryId = objectInput.readLong();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(convertAssembleId);

		objectOutput.writeLong(validDossierId);

		if (validDossierIdCTN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(validDossierIdCTN);
		}

		if (validDossierNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(validDossierNo);
		}

		objectOutput.writeLong(vehicleTypeCertificateId);

		objectOutput.writeLong(dossierId);

		if (dossierIdCTN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierIdCTN);
		}

		if (dossierNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierNo);
		}

		if (dossierStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierStatus);
		}

		objectOutput.writeLong(previousExpireDate);

		if (certificateRecordNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateRecordNo);
		}

		objectOutput.writeLong(certificateRecordDate);
		objectOutput.writeLong(certificateRecordExpireDate);

		objectOutput.writeInt(expiredStatus);

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

		if (productionCountry == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionCountry);
		}

		if (safetytestReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(safetytestReportNo);
		}

		objectOutput.writeLong(safetytestReportDate);

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

		if (othertestReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(othertestReportNo);
		}

		objectOutput.writeLong(othertestReportDate);

		if (copReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportNo);
		}

		objectOutput.writeLong(copReportDate);
		objectOutput.writeLong(copReportExpireDate);

		if (validRequestNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(validRequestNo);
		}

		objectOutput.writeLong(validRequestDate);

		if (validInspectionRecordNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(validInspectionRecordNo);
		}

		objectOutput.writeLong(validInspectionRecordDate);

		objectOutput.writeLong(validCorporationId);

		objectOutput.writeLong(validInspectorId);

		if (validInspectorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(validInspectorName);
		}

		if (validRemarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(validRemarks);
		}

		if (validInspectionNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(validInspectionNote);
		}

		objectOutput.writeLong(deliverableFileEntryId);

		objectOutput.writeLong(documentFileEntryId);
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public long convertAssembleId;
	public long validDossierId;
	public String validDossierIdCTN;
	public String validDossierNo;
	public long vehicleTypeCertificateId;
	public long dossierId;
	public String dossierIdCTN;
	public String dossierNo;
	public String dossierStatus;
	public long previousExpireDate;
	public String certificateRecordNo;
	public long certificateRecordDate;
	public long certificateRecordExpireDate;
	public int expiredStatus;
	public String vehicleClass;
	public String certifiedVehicleType;
	public String certifiedVehicleTypeDescription;
	public String certifiedTrademark;
	public String certifiedTrademarkName;
	public String certifiedCommercialName;
	public String certifiedModelCode;
	public String productionCountry;
	public String safetytestReportNo;
	public long safetytestReportDate;
	public String emissionTestReportNo;
	public long emissionTestReportDate;
	public String commonSafetyStandard;
	public String commonSafetyDescription;
	public String emissionStandard;
	public String emissionDescription;
	public String othertestReportNo;
	public long othertestReportDate;
	public String copReportNo;
	public long copReportDate;
	public long copReportExpireDate;
	public String validRequestNo;
	public long validRequestDate;
	public String validInspectionRecordNo;
	public long validInspectionRecordDate;
	public long validCorporationId;
	public long validInspectorId;
	public String validInspectorName;
	public String validRemarks;
	public String validInspectionNote;
	public long deliverableFileEntryId;
	public long documentFileEntryId;
	public long modifyDate;
	public long syncDate;
}