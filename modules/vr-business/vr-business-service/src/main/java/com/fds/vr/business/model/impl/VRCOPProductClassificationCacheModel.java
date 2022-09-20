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

import com.fds.vr.business.model.VRCOPProductClassification;

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
 * The cache model class for representing VRCOPProductClassification in entity cache.
 *
 * @author LamTV
 * @see VRCOPProductClassification
 * @generated
 */
@ProviderType
public class VRCOPProductClassificationCacheModel implements CacheModel<VRCOPProductClassification>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProductClassificationCacheModel)) {
			return false;
		}

		VRCOPProductClassificationCacheModel vrcopProductClassificationCacheModel =
			(VRCOPProductClassificationCacheModel)obj;

		if (id == vrcopProductClassificationCacheModel.id) {
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
		StringBundler sb = new StringBundler(19);

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
		sb.append(", productClassificationCode=");
		sb.append(productClassificationCode);
		sb.append(", productClassificationDescription=");
		sb.append(productClassificationDescription);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCOPProductClassification toEntityModel() {
		VRCOPProductClassificationImpl vrcopProductClassificationImpl = new VRCOPProductClassificationImpl();

		vrcopProductClassificationImpl.setId(id);
		vrcopProductClassificationImpl.setMtCore(mtCore);
		vrcopProductClassificationImpl.setCopReportRepositoryID(copReportRepositoryID);

		if (copReportNo == null) {
			vrcopProductClassificationImpl.setCopReportNo(StringPool.BLANK);
		}
		else {
			vrcopProductClassificationImpl.setCopReportNo(copReportNo);
		}

		vrcopProductClassificationImpl.setSequenceNo(sequenceNo);

		if (productClassificationCode == null) {
			vrcopProductClassificationImpl.setProductClassificationCode(StringPool.BLANK);
		}
		else {
			vrcopProductClassificationImpl.setProductClassificationCode(productClassificationCode);
		}

		if (productClassificationDescription == null) {
			vrcopProductClassificationImpl.setProductClassificationDescription(StringPool.BLANK);
		}
		else {
			vrcopProductClassificationImpl.setProductClassificationDescription(productClassificationDescription);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrcopProductClassificationImpl.setModifyDate(null);
		}
		else {
			vrcopProductClassificationImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrcopProductClassificationImpl.setSyncDate(null);
		}
		else {
			vrcopProductClassificationImpl.setSyncDate(new Date(syncDate));
		}

		vrcopProductClassificationImpl.resetOriginalValues();

		return vrcopProductClassificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		copReportRepositoryID = objectInput.readLong();
		copReportNo = objectInput.readUTF();

		sequenceNo = objectInput.readLong();
		productClassificationCode = objectInput.readUTF();
		productClassificationDescription = objectInput.readUTF();
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

		objectOutput.writeLong(sequenceNo);

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

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public long copReportRepositoryID;
	public String copReportNo;
	public long sequenceNo;
	public String productClassificationCode;
	public String productClassificationDescription;
	public long modifyDate;
	public long syncDate;
}