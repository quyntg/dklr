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

import com.fds.vr.business.model.VRProductType;

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
 * The cache model class for representing VRProductType in entity cache.
 *
 * @author LamTV
 * @see VRProductType
 * @generated
 */
@ProviderType
public class VRProductTypeCacheModel implements CacheModel<VRProductType>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductTypeCacheModel)) {
			return false;
		}

		VRProductTypeCacheModel vrProductTypeCacheModel = (VRProductTypeCacheModel)obj;

		if (id == vrProductTypeCacheModel.id) {
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
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", vehicleClass=");
		sb.append(vehicleClass);
		sb.append(", vehicleTypeCode=");
		sb.append(vehicleTypeCode);
		sb.append(", vehicleTypeDescription=");
		sb.append(vehicleTypeDescription);
		sb.append(", productClassificationCode=");
		sb.append(productClassificationCode);
		sb.append(", productClassificationDescription=");
		sb.append(productClassificationDescription);
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
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append(", productionPlantId=");
		sb.append(productionPlantId);
		sb.append(", productionPlantCode=");
		sb.append(productionPlantCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRProductType toEntityModel() {
		VRProductTypeImpl vrProductTypeImpl = new VRProductTypeImpl();

		vrProductTypeImpl.setId(id);
		vrProductTypeImpl.setMtCore(mtCore);
		vrProductTypeImpl.setSequenceNo(sequenceNo);

		if (vehicleClass == null) {
			vrProductTypeImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vrProductTypeImpl.setVehicleClass(vehicleClass);
		}

		if (vehicleTypeCode == null) {
			vrProductTypeImpl.setVehicleTypeCode(StringPool.BLANK);
		}
		else {
			vrProductTypeImpl.setVehicleTypeCode(vehicleTypeCode);
		}

		if (vehicleTypeDescription == null) {
			vrProductTypeImpl.setVehicleTypeDescription(StringPool.BLANK);
		}
		else {
			vrProductTypeImpl.setVehicleTypeDescription(vehicleTypeDescription);
		}

		if (productClassificationCode == null) {
			vrProductTypeImpl.setProductClassificationCode(StringPool.BLANK);
		}
		else {
			vrProductTypeImpl.setProductClassificationCode(productClassificationCode);
		}

		if (productClassificationDescription == null) {
			vrProductTypeImpl.setProductClassificationDescription(StringPool.BLANK);
		}
		else {
			vrProductTypeImpl.setProductClassificationDescription(productClassificationDescription);
		}

		if (trademark == null) {
			vrProductTypeImpl.setTrademark(StringPool.BLANK);
		}
		else {
			vrProductTypeImpl.setTrademark(trademark);
		}

		if (trademarkName == null) {
			vrProductTypeImpl.setTrademarkName(StringPool.BLANK);
		}
		else {
			vrProductTypeImpl.setTrademarkName(trademarkName);
		}

		if (commercialName == null) {
			vrProductTypeImpl.setCommercialName(StringPool.BLANK);
		}
		else {
			vrProductTypeImpl.setCommercialName(commercialName);
		}

		if (modelCode == null) {
			vrProductTypeImpl.setModelCode(StringPool.BLANK);
		}
		else {
			vrProductTypeImpl.setModelCode(modelCode);
		}

		if (designSymbolNo == null) {
			vrProductTypeImpl.setDesignSymbolNo(StringPool.BLANK);
		}
		else {
			vrProductTypeImpl.setDesignSymbolNo(designSymbolNo);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrProductTypeImpl.setModifyDate(null);
		}
		else {
			vrProductTypeImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrProductTypeImpl.setSyncDate(null);
		}
		else {
			vrProductTypeImpl.setSyncDate(new Date(syncDate));
		}

		vrProductTypeImpl.setProductionPlantId(productionPlantId);

		if (productionPlantCode == null) {
			vrProductTypeImpl.setProductionPlantCode(StringPool.BLANK);
		}
		else {
			vrProductTypeImpl.setProductionPlantCode(productionPlantCode);
		}

		vrProductTypeImpl.resetOriginalValues();

		return vrProductTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		sequenceNo = objectInput.readLong();
		vehicleClass = objectInput.readUTF();
		vehicleTypeCode = objectInput.readUTF();
		vehicleTypeDescription = objectInput.readUTF();
		productClassificationCode = objectInput.readUTF();
		productClassificationDescription = objectInput.readUTF();
		trademark = objectInput.readUTF();
		trademarkName = objectInput.readUTF();
		commercialName = objectInput.readUTF();
		modelCode = objectInput.readUTF();
		designSymbolNo = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();

		productionPlantId = objectInput.readLong();
		productionPlantCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(sequenceNo);

		if (vehicleClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleClass);
		}

		if (vehicleTypeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleTypeCode);
		}

		if (vehicleTypeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleTypeDescription);
		}

		if (productClassificationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productClassificationCode);
		}

		if (productClassificationDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productClassificationDescription);
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

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);

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
	public String vehicleClass;
	public String vehicleTypeCode;
	public String vehicleTypeDescription;
	public String productClassificationCode;
	public String productClassificationDescription;
	public String trademark;
	public String trademarkName;
	public String commercialName;
	public String modelCode;
	public String designSymbolNo;
	public long modifyDate;
	public long syncDate;
	public long productionPlantId;
	public String productionPlantCode;
}