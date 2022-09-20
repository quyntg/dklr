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

import com.fds.vr.business.model.VRProductLine;

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
 * The cache model class for representing VRProductLine in entity cache.
 *
 * @author LamTV
 * @see VRProductLine
 * @generated
 */
@ProviderType
public class VRProductLineCacheModel implements CacheModel<VRProductLine>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductLineCacheModel)) {
			return false;
		}

		VRProductLineCacheModel vrProductLineCacheModel = (VRProductLineCacheModel)obj;

		if (id == vrProductLineCacheModel.id) {
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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", productPlantID=");
		sb.append(productPlantID);
		sb.append(", productTypeID=");
		sb.append(productTypeID);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", trademark=");
		sb.append(trademark);
		sb.append(", trademarkName=");
		sb.append(trademarkName);
		sb.append(", commercialName=");
		sb.append(commercialName);
		sb.append(", modelCode=");
		sb.append(modelCode);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRProductLine toEntityModel() {
		VRProductLineImpl vrProductLineImpl = new VRProductLineImpl();

		vrProductLineImpl.setId(id);
		vrProductLineImpl.setMtCore(mtCore);
		vrProductLineImpl.setProductPlantID(productPlantID);
		vrProductLineImpl.setProductTypeID(productTypeID);
		vrProductLineImpl.setSequenceNo(sequenceNo);

		if (trademark == null) {
			vrProductLineImpl.setTrademark(StringPool.BLANK);
		}
		else {
			vrProductLineImpl.setTrademark(trademark);
		}

		if (trademarkName == null) {
			vrProductLineImpl.setTrademarkName(StringPool.BLANK);
		}
		else {
			vrProductLineImpl.setTrademarkName(trademarkName);
		}

		if (commercialName == null) {
			vrProductLineImpl.setCommercialName(StringPool.BLANK);
		}
		else {
			vrProductLineImpl.setCommercialName(commercialName);
		}

		if (modelCode == null) {
			vrProductLineImpl.setModelCode(StringPool.BLANK);
		}
		else {
			vrProductLineImpl.setModelCode(modelCode);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrProductLineImpl.setModifyDate(null);
		}
		else {
			vrProductLineImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrProductLineImpl.setSyncDate(null);
		}
		else {
			vrProductLineImpl.setSyncDate(new Date(syncDate));
		}

		vrProductLineImpl.resetOriginalValues();

		return vrProductLineImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		productPlantID = objectInput.readLong();

		productTypeID = objectInput.readLong();

		sequenceNo = objectInput.readLong();
		trademark = objectInput.readUTF();
		trademarkName = objectInput.readUTF();
		commercialName = objectInput.readUTF();
		modelCode = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(productPlantID);

		objectOutput.writeLong(productTypeID);

		objectOutput.writeLong(sequenceNo);

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

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public long productPlantID;
	public long productTypeID;
	public long sequenceNo;
	public String trademark;
	public String trademarkName;
	public String commercialName;
	public String modelCode;
	public long modifyDate;
	public long syncDate;
}