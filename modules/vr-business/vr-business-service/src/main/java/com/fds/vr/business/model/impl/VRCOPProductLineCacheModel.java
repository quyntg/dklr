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

import com.fds.vr.business.model.VRCOPProductLine;

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
 * The cache model class for representing VRCOPProductLine in entity cache.
 *
 * @author LamTV
 * @see VRCOPProductLine
 * @generated
 */
@ProviderType
public class VRCOPProductLineCacheModel implements CacheModel<VRCOPProductLine>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProductLineCacheModel)) {
			return false;
		}

		VRCOPProductLineCacheModel vrcopProductLineCacheModel = (VRCOPProductLineCacheModel)obj;

		if (id == vrcopProductLineCacheModel.id) {
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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", copReportRepositoryID=");
		sb.append(copReportRepositoryID);
		sb.append(", copReportNo=");
		sb.append(copReportNo);
		sb.append(", copProductTypeID=");
		sb.append(copProductTypeID);
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
		sb.append(", designSymbolNo=");
		sb.append(designSymbolNo);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCOPProductLine toEntityModel() {
		VRCOPProductLineImpl vrcopProductLineImpl = new VRCOPProductLineImpl();

		vrcopProductLineImpl.setId(id);
		vrcopProductLineImpl.setMtCore(mtCore);
		vrcopProductLineImpl.setCopReportRepositoryID(copReportRepositoryID);

		if (copReportNo == null) {
			vrcopProductLineImpl.setCopReportNo(StringPool.BLANK);
		}
		else {
			vrcopProductLineImpl.setCopReportNo(copReportNo);
		}

		vrcopProductLineImpl.setCopProductTypeID(copProductTypeID);
		vrcopProductLineImpl.setSequenceNo(sequenceNo);

		if (trademark == null) {
			vrcopProductLineImpl.setTrademark(StringPool.BLANK);
		}
		else {
			vrcopProductLineImpl.setTrademark(trademark);
		}

		if (trademarkName == null) {
			vrcopProductLineImpl.setTrademarkName(StringPool.BLANK);
		}
		else {
			vrcopProductLineImpl.setTrademarkName(trademarkName);
		}

		if (commercialName == null) {
			vrcopProductLineImpl.setCommercialName(StringPool.BLANK);
		}
		else {
			vrcopProductLineImpl.setCommercialName(commercialName);
		}

		if (modelCode == null) {
			vrcopProductLineImpl.setModelCode(StringPool.BLANK);
		}
		else {
			vrcopProductLineImpl.setModelCode(modelCode);
		}

		if (designSymbolNo == null) {
			vrcopProductLineImpl.setDesignSymbolNo(StringPool.BLANK);
		}
		else {
			vrcopProductLineImpl.setDesignSymbolNo(designSymbolNo);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrcopProductLineImpl.setModifyDate(null);
		}
		else {
			vrcopProductLineImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrcopProductLineImpl.setSyncDate(null);
		}
		else {
			vrcopProductLineImpl.setSyncDate(new Date(syncDate));
		}

		vrcopProductLineImpl.resetOriginalValues();

		return vrcopProductLineImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		copReportRepositoryID = objectInput.readLong();
		copReportNo = objectInput.readUTF();

		copProductTypeID = objectInput.readLong();

		sequenceNo = objectInput.readLong();
		trademark = objectInput.readUTF();
		trademarkName = objectInput.readUTF();
		commercialName = objectInput.readUTF();
		modelCode = objectInput.readUTF();
		designSymbolNo = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
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

		objectOutput.writeLong(copProductTypeID);

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

		if (designSymbolNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designSymbolNo);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public long copReportRepositoryID;
	public String copReportNo;
	public long copProductTypeID;
	public long sequenceNo;
	public String trademark;
	public String trademarkName;
	public String commercialName;
	public String modelCode;
	public String designSymbolNo;
	public long modifyDate;
	public long syncDate;
}