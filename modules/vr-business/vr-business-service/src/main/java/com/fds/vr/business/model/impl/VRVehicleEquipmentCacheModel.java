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

import com.fds.vr.business.model.VRVehicleEquipment;

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
 * The cache model class for representing VRVehicleEquipment in entity cache.
 *
 * @author LamTV
 * @see VRVehicleEquipment
 * @generated
 */
@ProviderType
public class VRVehicleEquipmentCacheModel implements CacheModel<VRVehicleEquipment>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRVehicleEquipmentCacheModel)) {
			return false;
		}

		VRVehicleEquipmentCacheModel vrVehicleEquipmentCacheModel = (VRVehicleEquipmentCacheModel)obj;

		if (id == vrVehicleEquipmentCacheModel.id) {
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
		StringBundler sb = new StringBundler(87);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleTypeCertificateId=");
		sb.append(vehicleTypeCertificateId);
		sb.append(", certificateRecordId=");
		sb.append(certificateRecordId);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierIdCTN=");
		sb.append(dossierIdCTN);
		sb.append(", dossierNo=");
		sb.append(dossierNo);
		sb.append(", isMandatory=");
		sb.append(isMandatory);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
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
		sb.append(", equipmentCode=");
		sb.append(equipmentCode);
		sb.append(", equipmentName=");
		sb.append(equipmentName);
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
		sb.append(", originalCode=");
		sb.append(originalCode);
		sb.append(", originalName=");
		sb.append(originalName);
		sb.append(", productionName=");
		sb.append(productionName);
		sb.append(", productionAddress=");
		sb.append(productionAddress);
		sb.append(", manufacturerName=");
		sb.append(manufacturerName);
		sb.append(", manufacturerAddress=");
		sb.append(manufacturerAddress);
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
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRVehicleEquipment toEntityModel() {
		VRVehicleEquipmentImpl vrVehicleEquipmentImpl = new VRVehicleEquipmentImpl();

		vrVehicleEquipmentImpl.setId(id);
		vrVehicleEquipmentImpl.setVehicleTypeCertificateId(vehicleTypeCertificateId);
		vrVehicleEquipmentImpl.setCertificateRecordId(certificateRecordId);
		vrVehicleEquipmentImpl.setDossierId(dossierId);

		if (dossierIdCTN == null) {
			vrVehicleEquipmentImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (dossierNo == null) {
			vrVehicleEquipmentImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setDossierNo(dossierNo);
		}

		vrVehicleEquipmentImpl.setIsMandatory(isMandatory);
		vrVehicleEquipmentImpl.setSequenceNo(sequenceNo);

		if (certificateRecordNo == null) {
			vrVehicleEquipmentImpl.setCertificateRecordNo(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setCertificateRecordNo(certificateRecordNo);
		}

		if (certificateRecordDate == Long.MIN_VALUE) {
			vrVehicleEquipmentImpl.setCertificateRecordDate(null);
		}
		else {
			vrVehicleEquipmentImpl.setCertificateRecordDate(new Date(
					certificateRecordDate));
		}

		if (certificateRecordExpireDate == Long.MIN_VALUE) {
			vrVehicleEquipmentImpl.setCertificateRecordExpireDate(null);
		}
		else {
			vrVehicleEquipmentImpl.setCertificateRecordExpireDate(new Date(
					certificateRecordExpireDate));
		}

		vrVehicleEquipmentImpl.setExpiredStatus(expiredStatus);

		if (vehicleClass == null) {
			vrVehicleEquipmentImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setVehicleClass(vehicleClass);
		}

		if (equipmentCode == null) {
			vrVehicleEquipmentImpl.setEquipmentCode(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setEquipmentCode(equipmentCode);
		}

		if (equipmentName == null) {
			vrVehicleEquipmentImpl.setEquipmentName(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setEquipmentName(equipmentName);
		}

		if (certifiedVehicleType == null) {
			vrVehicleEquipmentImpl.setCertifiedVehicleType(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setCertifiedVehicleType(certifiedVehicleType);
		}

		if (certifiedVehicleTypeDescription == null) {
			vrVehicleEquipmentImpl.setCertifiedVehicleTypeDescription(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setCertifiedVehicleTypeDescription(certifiedVehicleTypeDescription);
		}

		if (certifiedTrademark == null) {
			vrVehicleEquipmentImpl.setCertifiedTrademark(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setCertifiedTrademark(certifiedTrademark);
		}

		if (certifiedTrademarkName == null) {
			vrVehicleEquipmentImpl.setCertifiedTrademarkName(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setCertifiedTrademarkName(certifiedTrademarkName);
		}

		if (certifiedCommercialName == null) {
			vrVehicleEquipmentImpl.setCertifiedCommercialName(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setCertifiedCommercialName(certifiedCommercialName);
		}

		if (certifiedModelCode == null) {
			vrVehicleEquipmentImpl.setCertifiedModelCode(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setCertifiedModelCode(certifiedModelCode);
		}

		if (productionCountry == null) {
			vrVehicleEquipmentImpl.setProductionCountry(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setProductionCountry(productionCountry);
		}

		if (originalCode == null) {
			vrVehicleEquipmentImpl.setOriginalCode(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setOriginalCode(originalCode);
		}

		if (originalName == null) {
			vrVehicleEquipmentImpl.setOriginalName(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setOriginalName(originalName);
		}

		if (productionName == null) {
			vrVehicleEquipmentImpl.setProductionName(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setProductionName(productionName);
		}

		if (productionAddress == null) {
			vrVehicleEquipmentImpl.setProductionAddress(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setProductionAddress(productionAddress);
		}

		if (manufacturerName == null) {
			vrVehicleEquipmentImpl.setManufacturerName(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setManufacturerName(manufacturerName);
		}

		if (manufacturerAddress == null) {
			vrVehicleEquipmentImpl.setManufacturerAddress(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setManufacturerAddress(manufacturerAddress);
		}

		if (safetytestReportNo == null) {
			vrVehicleEquipmentImpl.setSafetytestReportNo(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setSafetytestReportNo(safetytestReportNo);
		}

		if (safetytestReportDate == Long.MIN_VALUE) {
			vrVehicleEquipmentImpl.setSafetytestReportDate(null);
		}
		else {
			vrVehicleEquipmentImpl.setSafetytestReportDate(new Date(
					safetytestReportDate));
		}

		if (emissionTestReportNo == null) {
			vrVehicleEquipmentImpl.setEmissionTestReportNo(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setEmissionTestReportNo(emissionTestReportNo);
		}

		if (emissionTestReportDate == Long.MIN_VALUE) {
			vrVehicleEquipmentImpl.setEmissionTestReportDate(null);
		}
		else {
			vrVehicleEquipmentImpl.setEmissionTestReportDate(new Date(
					emissionTestReportDate));
		}

		if (commonSafetyStandard == null) {
			vrVehicleEquipmentImpl.setCommonSafetyStandard(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setCommonSafetyStandard(commonSafetyStandard);
		}

		if (commonSafetyDescription == null) {
			vrVehicleEquipmentImpl.setCommonSafetyDescription(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setCommonSafetyDescription(commonSafetyDescription);
		}

		if (emissionStandard == null) {
			vrVehicleEquipmentImpl.setEmissionStandard(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setEmissionStandard(emissionStandard);
		}

		if (emissionDescription == null) {
			vrVehicleEquipmentImpl.setEmissionDescription(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setEmissionDescription(emissionDescription);
		}

		if (othertestReportNo == null) {
			vrVehicleEquipmentImpl.setOthertestReportNo(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setOthertestReportNo(othertestReportNo);
		}

		if (othertestReportDate == Long.MIN_VALUE) {
			vrVehicleEquipmentImpl.setOthertestReportDate(null);
		}
		else {
			vrVehicleEquipmentImpl.setOthertestReportDate(new Date(
					othertestReportDate));
		}

		if (copReportNo == null) {
			vrVehicleEquipmentImpl.setCopReportNo(StringPool.BLANK);
		}
		else {
			vrVehicleEquipmentImpl.setCopReportNo(copReportNo);
		}

		if (copReportDate == Long.MIN_VALUE) {
			vrVehicleEquipmentImpl.setCopReportDate(null);
		}
		else {
			vrVehicleEquipmentImpl.setCopReportDate(new Date(copReportDate));
		}

		if (copReportExpireDate == Long.MIN_VALUE) {
			vrVehicleEquipmentImpl.setCopReportExpireDate(null);
		}
		else {
			vrVehicleEquipmentImpl.setCopReportExpireDate(new Date(
					copReportExpireDate));
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrVehicleEquipmentImpl.setModifyDate(null);
		}
		else {
			vrVehicleEquipmentImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrVehicleEquipmentImpl.setSyncDate(null);
		}
		else {
			vrVehicleEquipmentImpl.setSyncDate(new Date(syncDate));
		}

		vrVehicleEquipmentImpl.resetOriginalValues();

		return vrVehicleEquipmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		vehicleTypeCertificateId = objectInput.readLong();

		certificateRecordId = objectInput.readLong();

		dossierId = objectInput.readLong();
		dossierIdCTN = objectInput.readUTF();
		dossierNo = objectInput.readUTF();

		isMandatory = objectInput.readInt();

		sequenceNo = objectInput.readLong();
		certificateRecordNo = objectInput.readUTF();
		certificateRecordDate = objectInput.readLong();
		certificateRecordExpireDate = objectInput.readLong();

		expiredStatus = objectInput.readInt();
		vehicleClass = objectInput.readUTF();
		equipmentCode = objectInput.readUTF();
		equipmentName = objectInput.readUTF();
		certifiedVehicleType = objectInput.readUTF();
		certifiedVehicleTypeDescription = objectInput.readUTF();
		certifiedTrademark = objectInput.readUTF();
		certifiedTrademarkName = objectInput.readUTF();
		certifiedCommercialName = objectInput.readUTF();
		certifiedModelCode = objectInput.readUTF();
		productionCountry = objectInput.readUTF();
		originalCode = objectInput.readUTF();
		originalName = objectInput.readUTF();
		productionName = objectInput.readUTF();
		productionAddress = objectInput.readUTF();
		manufacturerName = objectInput.readUTF();
		manufacturerAddress = objectInput.readUTF();
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
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(vehicleTypeCertificateId);

		objectOutput.writeLong(certificateRecordId);

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

		objectOutput.writeInt(isMandatory);

		objectOutput.writeLong(sequenceNo);

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

		if (equipmentCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentCode);
		}

		if (equipmentName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentName);
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

		if (originalCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(originalCode);
		}

		if (originalName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(originalName);
		}

		if (productionName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionName);
		}

		if (productionAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionAddress);
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
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long vehicleTypeCertificateId;
	public long certificateRecordId;
	public long dossierId;
	public String dossierIdCTN;
	public String dossierNo;
	public int isMandatory;
	public long sequenceNo;
	public String certificateRecordNo;
	public long certificateRecordDate;
	public long certificateRecordExpireDate;
	public int expiredStatus;
	public String vehicleClass;
	public String equipmentCode;
	public String equipmentName;
	public String certifiedVehicleType;
	public String certifiedVehicleTypeDescription;
	public String certifiedTrademark;
	public String certifiedTrademarkName;
	public String certifiedCommercialName;
	public String certifiedModelCode;
	public String productionCountry;
	public String originalCode;
	public String originalName;
	public String productionName;
	public String productionAddress;
	public String manufacturerName;
	public String manufacturerAddress;
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
	public long modifyDate;
	public long syncDate;
}