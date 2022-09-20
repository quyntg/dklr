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

import com.fds.vr.business.model.VRCFGStandard;

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
 * The cache model class for representing VRCFGStandard in entity cache.
 *
 * @author LamTV
 * @see VRCFGStandard
 * @generated
 */
@ProviderType
public class VRCFGStandardCacheModel implements CacheModel<VRCFGStandard>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCFGStandardCacheModel)) {
			return false;
		}

		VRCFGStandardCacheModel vrcfgStandardCacheModel = (VRCFGStandardCacheModel)obj;

		if (id == vrcfgStandardCacheModel.id) {
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
		sb.append(", vehicleClass=");
		sb.append(vehicleClass);
		sb.append(", vehicleType=");
		sb.append(vehicleType);
		sb.append(", standardCode=");
		sb.append(standardCode);
		sb.append(", standardName=");
		sb.append(standardName);
		sb.append(", standardDescription=");
		sb.append(standardDescription);
		sb.append(", standardExpiredDate=");
		sb.append(standardExpiredDate);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", standardType=");
		sb.append(standardType);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCFGStandard toEntityModel() {
		VRCFGStandardImpl vrcfgStandardImpl = new VRCFGStandardImpl();

		vrcfgStandardImpl.setId(id);

		if (vehicleClass == null) {
			vrcfgStandardImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vrcfgStandardImpl.setVehicleClass(vehicleClass);
		}

		if (vehicleType == null) {
			vrcfgStandardImpl.setVehicleType(StringPool.BLANK);
		}
		else {
			vrcfgStandardImpl.setVehicleType(vehicleType);
		}

		if (standardCode == null) {
			vrcfgStandardImpl.setStandardCode(StringPool.BLANK);
		}
		else {
			vrcfgStandardImpl.setStandardCode(standardCode);
		}

		if (standardName == null) {
			vrcfgStandardImpl.setStandardName(StringPool.BLANK);
		}
		else {
			vrcfgStandardImpl.setStandardName(standardName);
		}

		if (standardDescription == null) {
			vrcfgStandardImpl.setStandardDescription(StringPool.BLANK);
		}
		else {
			vrcfgStandardImpl.setStandardDescription(standardDescription);
		}

		if (standardExpiredDate == Long.MIN_VALUE) {
			vrcfgStandardImpl.setStandardExpiredDate(null);
		}
		else {
			vrcfgStandardImpl.setStandardExpiredDate(new Date(
					standardExpiredDate));
		}

		vrcfgStandardImpl.setSequenceNo(sequenceNo);

		if (standardType == null) {
			vrcfgStandardImpl.setStandardType(StringPool.BLANK);
		}
		else {
			vrcfgStandardImpl.setStandardType(standardType);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrcfgStandardImpl.setModifyDate(null);
		}
		else {
			vrcfgStandardImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrcfgStandardImpl.setSyncDate(null);
		}
		else {
			vrcfgStandardImpl.setSyncDate(new Date(syncDate));
		}

		vrcfgStandardImpl.resetOriginalValues();

		return vrcfgStandardImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vehicleClass = objectInput.readUTF();
		vehicleType = objectInput.readUTF();
		standardCode = objectInput.readUTF();
		standardName = objectInput.readUTF();
		standardDescription = objectInput.readUTF();
		standardExpiredDate = objectInput.readLong();

		sequenceNo = objectInput.readLong();
		standardType = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (vehicleClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleClass);
		}

		if (vehicleType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleType);
		}

		if (standardCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(standardCode);
		}

		if (standardName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(standardName);
		}

		if (standardDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(standardDescription);
		}

		objectOutput.writeLong(standardExpiredDate);

		objectOutput.writeLong(sequenceNo);

		if (standardType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(standardType);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public String vehicleClass;
	public String vehicleType;
	public String standardCode;
	public String standardName;
	public String standardDescription;
	public long standardExpiredDate;
	public long sequenceNo;
	public String standardType;
	public long modifyDate;
	public long syncDate;
}