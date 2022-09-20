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

import com.fds.vr.business.model.VRProductionPlantEquipment;

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
 * The cache model class for representing VRProductionPlantEquipment in entity cache.
 *
 * @author LamTV
 * @see VRProductionPlantEquipment
 * @generated
 */
@ProviderType
public class VRProductionPlantEquipmentCacheModel implements CacheModel<VRProductionPlantEquipment>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductionPlantEquipmentCacheModel)) {
			return false;
		}

		VRProductionPlantEquipmentCacheModel vrProductionPlantEquipmentCacheModel =
			(VRProductionPlantEquipmentCacheModel)obj;

		if (id == vrProductionPlantEquipmentCacheModel.id) {
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
		StringBundler sb = new StringBundler(67);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
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
		sb.append(", stampTestingNo=");
		sb.append(stampTestingNo);
		sb.append(", productionPlantId=");
		sb.append(productionPlantId);
		sb.append(", productionPlantCode=");
		sb.append(productionPlantCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRProductionPlantEquipment toEntityModel() {
		VRProductionPlantEquipmentImpl vrProductionPlantEquipmentImpl = new VRProductionPlantEquipmentImpl();

		vrProductionPlantEquipmentImpl.setId(id);
		vrProductionPlantEquipmentImpl.setMtCore(mtCore);
		vrProductionPlantEquipmentImpl.setSequenceNo(sequenceNo);

		if (equipmentCode == null) {
			vrProductionPlantEquipmentImpl.setEquipmentCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setEquipmentCode(equipmentCode);
		}

		if (equipmentName == null) {
			vrProductionPlantEquipmentImpl.setEquipmentName(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setEquipmentName(equipmentName);
		}

		if (equipmentType == null) {
			vrProductionPlantEquipmentImpl.setEquipmentType(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setEquipmentType(equipmentType);
		}

		if (trademark == null) {
			vrProductionPlantEquipmentImpl.setTrademark(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setTrademark(trademark);
		}

		if (trademarkName == null) {
			vrProductionPlantEquipmentImpl.setTrademarkName(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setTrademarkName(trademarkName);
		}

		if (commercialName == null) {
			vrProductionPlantEquipmentImpl.setCommercialName(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setCommercialName(commercialName);
		}

		if (modelCode == null) {
			vrProductionPlantEquipmentImpl.setModelCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setModelCode(modelCode);
		}

		if (productionCountryCode == null) {
			vrProductionPlantEquipmentImpl.setProductionCountryCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setProductionCountryCode(productionCountryCode);
		}

		if (equipmentStatus == null) {
			vrProductionPlantEquipmentImpl.setEquipmentStatus(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setEquipmentStatus(equipmentStatus);
		}

		if (expireDate == Long.MIN_VALUE) {
			vrProductionPlantEquipmentImpl.setExpireDate(null);
		}
		else {
			vrProductionPlantEquipmentImpl.setExpireDate(new Date(expireDate));
		}

		if (notes == null) {
			vrProductionPlantEquipmentImpl.setNotes(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setNotes(notes);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrProductionPlantEquipmentImpl.setModifyDate(null);
		}
		else {
			vrProductionPlantEquipmentImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrProductionPlantEquipmentImpl.setSyncDate(null);
		}
		else {
			vrProductionPlantEquipmentImpl.setSyncDate(new Date(syncDate));
		}

		if (equipmentSerialNo == null) {
			vrProductionPlantEquipmentImpl.setEquipmentSerialNo(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setEquipmentSerialNo(equipmentSerialNo);
		}

		if (productionYear == null) {
			vrProductionPlantEquipmentImpl.setProductionYear(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setProductionYear(productionYear);
		}

		if (registrationYear == null) {
			vrProductionPlantEquipmentImpl.setRegistrationYear(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setRegistrationYear(registrationYear);
		}

		vrProductionPlantEquipmentImpl.setMarkupXCG(markupXCG);
		vrProductionPlantEquipmentImpl.setMarkupXCGNK(markupXCGNK);
		vrProductionPlantEquipmentImpl.setMarkupSMRM(markupSMRM);
		vrProductionPlantEquipmentImpl.setMarkupXCH(markupXCH);
		vrProductionPlantEquipmentImpl.setMarkupXCN(markupXCN);
		vrProductionPlantEquipmentImpl.setMarkupXMY(markupXMY);
		vrProductionPlantEquipmentImpl.setMarkupXDD(markupXDD);
		vrProductionPlantEquipmentImpl.setTestingResult(testingResult);

		if (description == null) {
			vrProductionPlantEquipmentImpl.setDescription(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setDescription(description);
		}

		if (inspectionRecordNumber == null) {
			vrProductionPlantEquipmentImpl.setInspectionRecordNumber(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setInspectionRecordNumber(inspectionRecordNumber);
		}

		if (inspectionRecordDate == Long.MIN_VALUE) {
			vrProductionPlantEquipmentImpl.setInspectionRecordDate(null);
		}
		else {
			vrProductionPlantEquipmentImpl.setInspectionRecordDate(new Date(
					inspectionRecordDate));
		}

		if (stampTestingNo == null) {
			vrProductionPlantEquipmentImpl.setStampTestingNo(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setStampTestingNo(stampTestingNo);
		}

		vrProductionPlantEquipmentImpl.setProductionPlantId(productionPlantId);

		if (productionPlantCode == null) {
			vrProductionPlantEquipmentImpl.setProductionPlantCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantEquipmentImpl.setProductionPlantCode(productionPlantCode);
		}

		vrProductionPlantEquipmentImpl.resetOriginalValues();

		return vrProductionPlantEquipmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

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
		stampTestingNo = objectInput.readUTF();

		productionPlantId = objectInput.readLong();
		productionPlantCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

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

		if (stampTestingNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stampTestingNo);
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
	public String stampTestingNo;
	public long productionPlantId;
	public String productionPlantCode;
}