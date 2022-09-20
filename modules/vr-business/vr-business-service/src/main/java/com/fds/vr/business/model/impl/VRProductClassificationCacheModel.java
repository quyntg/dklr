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

import com.fds.vr.business.model.VRProductClassification;

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
 * The cache model class for representing VRProductClassification in entity cache.
 *
 * @author LamTV
 * @see VRProductClassification
 * @generated
 */
@ProviderType
public class VRProductClassificationCacheModel implements CacheModel<VRProductClassification>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductClassificationCacheModel)) {
			return false;
		}

		VRProductClassificationCacheModel vrProductClassificationCacheModel = (VRProductClassificationCacheModel)obj;

		if (id == vrProductClassificationCacheModel.id) {
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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", productPlantID=");
		sb.append(productPlantID);
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
	public VRProductClassification toEntityModel() {
		VRProductClassificationImpl vrProductClassificationImpl = new VRProductClassificationImpl();

		vrProductClassificationImpl.setId(id);
		vrProductClassificationImpl.setMtCore(mtCore);
		vrProductClassificationImpl.setProductPlantID(productPlantID);
		vrProductClassificationImpl.setSequenceNo(sequenceNo);

		if (productClassificationCode == null) {
			vrProductClassificationImpl.setProductClassificationCode(StringPool.BLANK);
		}
		else {
			vrProductClassificationImpl.setProductClassificationCode(productClassificationCode);
		}

		if (productClassificationDescription == null) {
			vrProductClassificationImpl.setProductClassificationDescription(StringPool.BLANK);
		}
		else {
			vrProductClassificationImpl.setProductClassificationDescription(productClassificationDescription);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrProductClassificationImpl.setModifyDate(null);
		}
		else {
			vrProductClassificationImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrProductClassificationImpl.setSyncDate(null);
		}
		else {
			vrProductClassificationImpl.setSyncDate(new Date(syncDate));
		}

		vrProductClassificationImpl.resetOriginalValues();

		return vrProductClassificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		productPlantID = objectInput.readLong();

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

		objectOutput.writeLong(productPlantID);

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
	public long productPlantID;
	public long sequenceNo;
	public String productClassificationCode;
	public String productClassificationDescription;
	public long modifyDate;
	public long syncDate;
}