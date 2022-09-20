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

import com.fds.vr.business.model.VRCOPProdEquipment;

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
 * The cache model class for representing VRCOPProdEquipment in entity cache.
 *
 * @author LamTV
 * @see VRCOPProdEquipment
 * @generated
 */
@ProviderType
public class VRCOPProdEquipmentCacheModel implements CacheModel<VRCOPProdEquipment>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProdEquipmentCacheModel)) {
			return false;
		}

		VRCOPProdEquipmentCacheModel vrcopProdEquipmentCacheModel = (VRCOPProdEquipmentCacheModel)obj;

		if (id == vrcopProdEquipmentCacheModel.id) {
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
		StringBundler sb = new StringBundler(45);

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
		sb.append(", designSymbolNo=");
		sb.append(designSymbolNo);
		sb.append(", productionCountryCode=");
		sb.append(productionCountryCode);
		sb.append(", equipmentStatus=");
		sb.append(equipmentStatus);
		sb.append(", notes=");
		sb.append(notes);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierIdCTN=");
		sb.append(dossierIdCTN);
		sb.append(", dossierNo=");
		sb.append(dossierNo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCOPProdEquipment toEntityModel() {
		VRCOPProdEquipmentImpl vrcopProdEquipmentImpl = new VRCOPProdEquipmentImpl();

		vrcopProdEquipmentImpl.setId(id);
		vrcopProdEquipmentImpl.setMtCore(mtCore);
		vrcopProdEquipmentImpl.setCopReportRepositoryID(copReportRepositoryID);

		if (copReportNo == null) {
			vrcopProdEquipmentImpl.setCopReportNo(StringPool.BLANK);
		}
		else {
			vrcopProdEquipmentImpl.setCopReportNo(copReportNo);
		}

		vrcopProdEquipmentImpl.setSequenceNo(sequenceNo);

		if (equipmentCode == null) {
			vrcopProdEquipmentImpl.setEquipmentCode(StringPool.BLANK);
		}
		else {
			vrcopProdEquipmentImpl.setEquipmentCode(equipmentCode);
		}

		if (equipmentName == null) {
			vrcopProdEquipmentImpl.setEquipmentName(StringPool.BLANK);
		}
		else {
			vrcopProdEquipmentImpl.setEquipmentName(equipmentName);
		}

		if (equipmentType == null) {
			vrcopProdEquipmentImpl.setEquipmentType(StringPool.BLANK);
		}
		else {
			vrcopProdEquipmentImpl.setEquipmentType(equipmentType);
		}

		if (trademark == null) {
			vrcopProdEquipmentImpl.setTrademark(StringPool.BLANK);
		}
		else {
			vrcopProdEquipmentImpl.setTrademark(trademark);
		}

		if (trademarkName == null) {
			vrcopProdEquipmentImpl.setTrademarkName(StringPool.BLANK);
		}
		else {
			vrcopProdEquipmentImpl.setTrademarkName(trademarkName);
		}

		if (commercialName == null) {
			vrcopProdEquipmentImpl.setCommercialName(StringPool.BLANK);
		}
		else {
			vrcopProdEquipmentImpl.setCommercialName(commercialName);
		}

		if (modelCode == null) {
			vrcopProdEquipmentImpl.setModelCode(StringPool.BLANK);
		}
		else {
			vrcopProdEquipmentImpl.setModelCode(modelCode);
		}

		if (designSymbolNo == null) {
			vrcopProdEquipmentImpl.setDesignSymbolNo(StringPool.BLANK);
		}
		else {
			vrcopProdEquipmentImpl.setDesignSymbolNo(designSymbolNo);
		}

		if (productionCountryCode == null) {
			vrcopProdEquipmentImpl.setProductionCountryCode(StringPool.BLANK);
		}
		else {
			vrcopProdEquipmentImpl.setProductionCountryCode(productionCountryCode);
		}

		if (equipmentStatus == null) {
			vrcopProdEquipmentImpl.setEquipmentStatus(StringPool.BLANK);
		}
		else {
			vrcopProdEquipmentImpl.setEquipmentStatus(equipmentStatus);
		}

		if (notes == null) {
			vrcopProdEquipmentImpl.setNotes(StringPool.BLANK);
		}
		else {
			vrcopProdEquipmentImpl.setNotes(notes);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrcopProdEquipmentImpl.setModifyDate(null);
		}
		else {
			vrcopProdEquipmentImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrcopProdEquipmentImpl.setSyncDate(null);
		}
		else {
			vrcopProdEquipmentImpl.setSyncDate(new Date(syncDate));
		}

		vrcopProdEquipmentImpl.setQuantity(quantity);
		vrcopProdEquipmentImpl.setDossierId(dossierId);

		if (dossierIdCTN == null) {
			vrcopProdEquipmentImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrcopProdEquipmentImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (dossierNo == null) {
			vrcopProdEquipmentImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrcopProdEquipmentImpl.setDossierNo(dossierNo);
		}

		vrcopProdEquipmentImpl.resetOriginalValues();

		return vrcopProdEquipmentImpl;
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
		designSymbolNo = objectInput.readUTF();
		productionCountryCode = objectInput.readUTF();
		equipmentStatus = objectInput.readUTF();
		notes = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();

		quantity = objectInput.readInt();

		dossierId = objectInput.readLong();
		dossierIdCTN = objectInput.readUTF();
		dossierNo = objectInput.readUTF();
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

		if (designSymbolNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designSymbolNo);
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

		if (notes == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(notes);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);

		objectOutput.writeInt(quantity);

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
	public String designSymbolNo;
	public String productionCountryCode;
	public String equipmentStatus;
	public String notes;
	public long modifyDate;
	public long syncDate;
	public int quantity;
	public long dossierId;
	public String dossierIdCTN;
	public String dossierNo;
}