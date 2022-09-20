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

import com.fds.vr.business.model.VRCOPProductionPlantEquipment;

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
 * The cache model class for representing VRCOPProductionPlantEquipment in entity cache.
 *
 * @author LamTV
 * @see VRCOPProductionPlantEquipment
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantEquipmentCacheModel implements CacheModel<VRCOPProductionPlantEquipment>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProductionPlantEquipmentCacheModel)) {
			return false;
		}

		VRCOPProductionPlantEquipmentCacheModel vrcopProductionPlantEquipmentCacheModel =
			(VRCOPProductionPlantEquipmentCacheModel)obj;

		if (id == vrcopProductionPlantEquipmentCacheModel.id) {
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
		StringBundler sb = new StringBundler(81);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", copReportRepositoryID=");
		sb.append(copReportRepositoryID);
		sb.append(", copReportNo=");
		sb.append(copReportNo);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", equipmentCode=");
		sb.append(equipmentCode);
		sb.append(", equipmentName=");
		sb.append(equipmentName);
		sb.append(", equipmentType=");
		sb.append(equipmentType);
		sb.append(", trademark=");
		sb.append(trademark);
		sb.append(", trademarkName=");
		sb.append(trademarkName);
		sb.append(", commercialName=");
		sb.append(commercialName);
		sb.append(", modelCode=");
		sb.append(modelCode);
		sb.append(", productionCountryCode=");
		sb.append(productionCountryCode);
		sb.append(", equipmentStatus=");
		sb.append(equipmentStatus);
		sb.append(", expireDate=");
		sb.append(expireDate);
		sb.append(", notes=");
		sb.append(notes);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append(", equipmentSerialNo=");
		sb.append(equipmentSerialNo);
		sb.append(", productionYear=");
		sb.append(productionYear);
		sb.append(", registrationYear=");
		sb.append(registrationYear);
		sb.append(", markupXCG=");
		sb.append(markupXCG);
		sb.append(", markupXCGNK=");
		sb.append(markupXCGNK);
		sb.append(", markupSMRM=");
		sb.append(markupSMRM);
		sb.append(", markupXCH=");
		sb.append(markupXCH);
		sb.append(", markupXCN=");
		sb.append(markupXCN);
		sb.append(", markupXMY=");
		sb.append(markupXMY);
		sb.append(", markupXDD=");
		sb.append(markupXDD);
		sb.append(", testingResult=");
		sb.append(testingResult);
		sb.append(", description=");
		sb.append(description);
		sb.append(", inspectionRecordNumber=");
		sb.append(inspectionRecordNumber);
		sb.append(", inspectionRecordDate=");
		sb.append(inspectionRecordDate);
		sb.append(", expiredDate=");
		sb.append(expiredDate);
		sb.append(", expiredStatus=");
		sb.append(expiredStatus);
		sb.append(", stampTestingNo=");
		sb.append(stampTestingNo);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierIdCTN=");
		sb.append(dossierIdCTN);
		sb.append(", dossierNo=");
		sb.append(dossierNo);
		sb.append(", productionPlantId=");
		sb.append(productionPlantId);
		sb.append(", productionPlantCode=");
		sb.append(productionPlantCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCOPProductionPlantEquipment toEntityModel() {
		VRCOPProductionPlantEquipmentImpl vrcopProductionPlantEquipmentImpl = new VRCOPProductionPlantEquipmentImpl();

		vrcopProductionPlantEquipmentImpl.setId(id);
		vrcopProductionPlantEquipmentImpl.setMtCore(mtCore);
		vrcopProductionPlantEquipmentImpl.setCopReportRepositoryID(copReportRepositoryID);

		if (copReportNo == null) {
			vrcopProductionPlantEquipmentImpl.setCopReportNo(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setCopReportNo(copReportNo);
		}

		vrcopProductionPlantEquipmentImpl.setSequenceNo(sequenceNo);

		if (equipmentCode == null) {
			vrcopProductionPlantEquipmentImpl.setEquipmentCode(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setEquipmentCode(equipmentCode);
		}

		if (equipmentName == null) {
			vrcopProductionPlantEquipmentImpl.setEquipmentName(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setEquipmentName(equipmentName);
		}

		if (equipmentType == null) {
			vrcopProductionPlantEquipmentImpl.setEquipmentType(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setEquipmentType(equipmentType);
		}

		if (trademark == null) {
			vrcopProductionPlantEquipmentImpl.setTrademark(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setTrademark(trademark);
		}

		if (trademarkName == null) {
			vrcopProductionPlantEquipmentImpl.setTrademarkName(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setTrademarkName(trademarkName);
		}

		if (commercialName == null) {
			vrcopProductionPlantEquipmentImpl.setCommercialName(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setCommercialName(commercialName);
		}

		if (modelCode == null) {
			vrcopProductionPlantEquipmentImpl.setModelCode(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setModelCode(modelCode);
		}

		if (productionCountryCode == null) {
			vrcopProductionPlantEquipmentImpl.setProductionCountryCode(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setProductionCountryCode(productionCountryCode);
		}

		if (equipmentStatus == null) {
			vrcopProductionPlantEquipmentImpl.setEquipmentStatus(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setEquipmentStatus(equipmentStatus);
		}

		if (expireDate == Long.MIN_VALUE) {
			vrcopProductionPlantEquipmentImpl.setExpireDate(null);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setExpireDate(new Date(expireDate));
		}

		if (notes == null) {
			vrcopProductionPlantEquipmentImpl.setNotes(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setNotes(notes);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrcopProductionPlantEquipmentImpl.setModifyDate(null);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrcopProductionPlantEquipmentImpl.setSyncDate(null);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setSyncDate(new Date(syncDate));
		}

		if (equipmentSerialNo == null) {
			vrcopProductionPlantEquipmentImpl.setEquipmentSerialNo(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setEquipmentSerialNo(equipmentSerialNo);
		}

		if (productionYear == null) {
			vrcopProductionPlantEquipmentImpl.setProductionYear(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setProductionYear(productionYear);
		}

		if (registrationYear == null) {
			vrcopProductionPlantEquipmentImpl.setRegistrationYear(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setRegistrationYear(registrationYear);
		}

		vrcopProductionPlantEquipmentImpl.setMarkupXCG(markupXCG);
		vrcopProductionPlantEquipmentImpl.setMarkupXCGNK(markupXCGNK);
		vrcopProductionPlantEquipmentImpl.setMarkupSMRM(markupSMRM);
		vrcopProductionPlantEquipmentImpl.setMarkupXCH(markupXCH);
		vrcopProductionPlantEquipmentImpl.setMarkupXCN(markupXCN);
		vrcopProductionPlantEquipmentImpl.setMarkupXMY(markupXMY);
		vrcopProductionPlantEquipmentImpl.setMarkupXDD(markupXDD);
		vrcopProductionPlantEquipmentImpl.setTestingResult(testingResult);

		if (description == null) {
			vrcopProductionPlantEquipmentImpl.setDescription(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setDescription(description);
		}

		if (inspectionRecordNumber == null) {
			vrcopProductionPlantEquipmentImpl.setInspectionRecordNumber(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setInspectionRecordNumber(inspectionRecordNumber);
		}

		if (inspectionRecordDate == Long.MIN_VALUE) {
			vrcopProductionPlantEquipmentImpl.setInspectionRecordDate(null);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setInspectionRecordDate(new Date(
					inspectionRecordDate));
		}

		if (expiredDate == Long.MIN_VALUE) {
			vrcopProductionPlantEquipmentImpl.setExpiredDate(null);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setExpiredDate(new Date(
					expiredDate));
		}

		vrcopProductionPlantEquipmentImpl.setExpiredStatus(expiredStatus);

		if (stampTestingNo == null) {
			vrcopProductionPlantEquipmentImpl.setStampTestingNo(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setStampTestingNo(stampTestingNo);
		}

		vrcopProductionPlantEquipmentImpl.setDossierId(dossierId);

		if (dossierIdCTN == null) {
			vrcopProductionPlantEquipmentImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (dossierNo == null) {
			vrcopProductionPlantEquipmentImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setDossierNo(dossierNo);
		}

		vrcopProductionPlantEquipmentImpl.setProductionPlantId(productionPlantId);

		if (productionPlantCode == null) {
			vrcopProductionPlantEquipmentImpl.setProductionPlantCode(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setProductionPlantCode(productionPlantCode);
		}

		vrcopProductionPlantEquipmentImpl.resetOriginalValues();

		return vrcopProductionPlantEquipmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		copReportRepositoryID = objectInput.readLong();
		copReportNo = objectInput.readUTF();

		sequenceNo = objectInput.readLong();
		equipmentCode = objectInput.readUTF();
		equipmentName = objectInput.readUTF();
		equipmentType = objectInput.readUTF();
		trademark = objectInput.readUTF();
		trademarkName = objectInput.readUTF();
		commercialName = objectInput.readUTF();
		modelCode = objectInput.readUTF();
		productionCountryCode = objectInput.readUTF();
		equipmentStatus = objectInput.readUTF();
		expireDate = objectInput.readLong();
		notes = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
		equipmentSerialNo = objectInput.readUTF();
		productionYear = objectInput.readUTF();
		registrationYear = objectInput.readUTF();

		markupXCG = objectInput.readLong();

		markupXCGNK = objectInput.readLong();

		markupSMRM = objectInput.readLong();

		markupXCH = objectInput.readLong();

		markupXCN = objectInput.readLong();

		markupXMY = objectInput.readLong();

		markupXDD = objectInput.readLong();

		testingResult = objectInput.readInt();
		description = objectInput.readUTF();
		inspectionRecordNumber = objectInput.readUTF();
		inspectionRecordDate = objectInput.readLong();
		expiredDate = objectInput.readLong();

		expiredStatus = objectInput.readInt();
		stampTestingNo = objectInput.readUTF();

		dossierId = objectInput.readLong();
		dossierIdCTN = objectInput.readUTF();
		dossierNo = objectInput.readUTF();

		productionPlantId = objectInput.readLong();
		productionPlantCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(copReportRepositoryID);

		if (copReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportNo);
		}

		objectOutput.writeLong(sequenceNo);

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

		if (equipmentType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentType);
		}

		if (trademark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trademark);
		}

		if (trademarkName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trademarkName);
		}

		if (commercialName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commercialName);
		}

		if (modelCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(modelCode);
		}

		if (productionCountryCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionCountryCode);
		}

		if (equipmentStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentStatus);
		}

		objectOutput.writeLong(expireDate);

		if (notes == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(notes);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);

		if (equipmentSerialNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentSerialNo);
		}

		if (productionYear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionYear);
		}

		if (registrationYear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registrationYear);
		}

		objectOutput.writeLong(markupXCG);

		objectOutput.writeLong(markupXCGNK);

		objectOutput.writeLong(markupSMRM);

		objectOutput.writeLong(markupXCH);

		objectOutput.writeLong(markupXCN);

		objectOutput.writeLong(markupXMY);

		objectOutput.writeLong(markupXDD);

		objectOutput.writeInt(testingResult);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (inspectionRecordNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionRecordNumber);
		}

		objectOutput.writeLong(inspectionRecordDate);
		objectOutput.writeLong(expiredDate);

		objectOutput.writeInt(expiredStatus);

		if (stampTestingNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stampTestingNo);
		}

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

		objectOutput.writeLong(productionPlantId);

		if (productionPlantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantCode);
		}
	}

	public long id;
	public long mtCore;
	public long copReportRepositoryID;
	public String copReportNo;
	public long sequenceNo;
	public String equipmentCode;
	public String equipmentName;
	public String equipmentType;
	public String trademark;
	public String trademarkName;
	public String commercialName;
	public String modelCode;
	public String productionCountryCode;
	public String equipmentStatus;
	public long expireDate;
	public String notes;
	public long modifyDate;
	public long syncDate;
	public String equipmentSerialNo;
	public String productionYear;
	public String registrationYear;
	public long markupXCG;
	public long markupXCGNK;
	public long markupSMRM;
	public long markupXCH;
	public long markupXCN;
	public long markupXMY;
	public long markupXDD;
	public int testingResult;
	public String description;
	public String inspectionRecordNumber;
	public long inspectionRecordDate;
	public long expiredDate;
	public int expiredStatus;
	public String stampTestingNo;
	public long dossierId;
	public String dossierIdCTN;
	public String dossierNo;
	public long productionPlantId;
	public String productionPlantCode;
}