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

import com.fds.vr.business.model.VRLimitConfigTechSpec;

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
 * The cache model class for representing VRLimitConfigTechSpec in entity cache.
 *
 * @author LamTV
 * @see VRLimitConfigTechSpec
 * @generated
 */
@ProviderType
public class VRLimitConfigTechSpecCacheModel implements CacheModel<VRLimitConfigTechSpec>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRLimitConfigTechSpecCacheModel)) {
			return false;
		}

		VRLimitConfigTechSpecCacheModel vrLimitConfigTechSpecCacheModel = (VRLimitConfigTechSpecCacheModel)obj;

		if (id == vrLimitConfigTechSpecCacheModel.id) {
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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleType=");
		sb.append(vehicleType);
		sb.append(", vehicleTypeName=");
		sb.append(vehicleTypeName);
		sb.append(", markupSMRM=");
		sb.append(markupSMRM);
		sb.append(", searchingDriveConfig=");
		sb.append(searchingDriveConfig);
		sb.append(", searchingDriveConfigDesc=");
		sb.append(searchingDriveConfigDesc);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", specificationCode=");
		sb.append(specificationCode);
		sb.append(", specificationName=");
		sb.append(specificationName);
		sb.append(", synchDate=");
		sb.append(synchDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRLimitConfigTechSpec toEntityModel() {
		VRLimitConfigTechSpecImpl vrLimitConfigTechSpecImpl = new VRLimitConfigTechSpecImpl();

		vrLimitConfigTechSpecImpl.setId(id);

		if (vehicleType == null) {
			vrLimitConfigTechSpecImpl.setVehicleType(StringPool.BLANK);
		}
		else {
			vrLimitConfigTechSpecImpl.setVehicleType(vehicleType);
		}

		if (vehicleTypeName == null) {
			vrLimitConfigTechSpecImpl.setVehicleTypeName(StringPool.BLANK);
		}
		else {
			vrLimitConfigTechSpecImpl.setVehicleTypeName(vehicleTypeName);
		}

		if (markupSMRM == null) {
			vrLimitConfigTechSpecImpl.setMarkupSMRM(StringPool.BLANK);
		}
		else {
			vrLimitConfigTechSpecImpl.setMarkupSMRM(markupSMRM);
		}

		vrLimitConfigTechSpecImpl.setSearchingDriveConfig(searchingDriveConfig);

		if (searchingDriveConfigDesc == null) {
			vrLimitConfigTechSpecImpl.setSearchingDriveConfigDesc(StringPool.BLANK);
		}
		else {
			vrLimitConfigTechSpecImpl.setSearchingDriveConfigDesc(searchingDriveConfigDesc);
		}

		vrLimitConfigTechSpecImpl.setSequenceNo(sequenceNo);

		if (specificationCode == null) {
			vrLimitConfigTechSpecImpl.setSpecificationCode(StringPool.BLANK);
		}
		else {
			vrLimitConfigTechSpecImpl.setSpecificationCode(specificationCode);
		}

		if (specificationName == null) {
			vrLimitConfigTechSpecImpl.setSpecificationName(StringPool.BLANK);
		}
		else {
			vrLimitConfigTechSpecImpl.setSpecificationName(specificationName);
		}

		if (synchDate == Long.MIN_VALUE) {
			vrLimitConfigTechSpecImpl.setSynchDate(null);
		}
		else {
			vrLimitConfigTechSpecImpl.setSynchDate(new Date(synchDate));
		}

		vrLimitConfigTechSpecImpl.resetOriginalValues();

		return vrLimitConfigTechSpecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vehicleType = objectInput.readUTF();
		vehicleTypeName = objectInput.readUTF();
		markupSMRM = objectInput.readUTF();

		searchingDriveConfig = objectInput.readLong();
		searchingDriveConfigDesc = objectInput.readUTF();

		sequenceNo = objectInput.readInt();
		specificationCode = objectInput.readUTF();
		specificationName = objectInput.readUTF();
		synchDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (vehicleType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleType);
		}

		if (vehicleTypeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleTypeName);
		}

		if (markupSMRM == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupSMRM);
		}

		objectOutput.writeLong(searchingDriveConfig);

		if (searchingDriveConfigDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(searchingDriveConfigDesc);
		}

		objectOutput.writeInt(sequenceNo);

		if (specificationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationCode);
		}

		if (specificationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationName);
		}

		objectOutput.writeLong(synchDate);
	}

	public long id;
	public String vehicleType;
	public String vehicleTypeName;
	public String markupSMRM;
	public long searchingDriveConfig;
	public String searchingDriveConfigDesc;
	public int sequenceNo;
	public String specificationCode;
	public String specificationName;
	public long synchDate;
}