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

import com.fds.vr.business.model.VRConfigTechSpec;

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
 * The cache model class for representing VRConfigTechSpec in entity cache.
 *
 * @author LamTV
 * @see VRConfigTechSpec
 * @generated
 */
@ProviderType
public class VRConfigTechSpecCacheModel implements CacheModel<VRConfigTechSpec>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRConfigTechSpecCacheModel)) {
			return false;
		}

		VRConfigTechSpecCacheModel vrConfigTechSpecCacheModel = (VRConfigTechSpecCacheModel)obj;

		if (id == vrConfigTechSpecCacheModel.id) {
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
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleClass=");
		sb.append(vehicleClass);
		sb.append(", vehicleType=");
		sb.append(vehicleType);
		sb.append(", vehicletypeName=");
		sb.append(vehicletypeName);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", specificationName=");
		sb.append(specificationName);
		sb.append(", specificationCode=");
		sb.append(specificationCode);
		sb.append(", specificationDisplayName=");
		sb.append(specificationDisplayName);
		sb.append(", specCategory=");
		sb.append(specCategory);
		sb.append(", specificationGroup=");
		sb.append(specificationGroup);
		sb.append(", specificationDataCollectionId=");
		sb.append(specificationDataCollectionId);
		sb.append(", specificationBasicUnit=");
		sb.append(specificationBasicUnit);
		sb.append(", specificationStandard=");
		sb.append(specificationStandard);
		sb.append(", specificationEntryType=");
		sb.append(specificationEntryType);
		sb.append(", specificationEntryPlaceholder=");
		sb.append(specificationEntryPlaceholder);
		sb.append(", specificationMandatory=");
		sb.append(specificationMandatory);
		sb.append(", module=");
		sb.append(module);
		sb.append(", synchDate=");
		sb.append(synchDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRConfigTechSpec toEntityModel() {
		VRConfigTechSpecImpl vrConfigTechSpecImpl = new VRConfigTechSpecImpl();

		vrConfigTechSpecImpl.setId(id);

		if (vehicleClass == null) {
			vrConfigTechSpecImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vrConfigTechSpecImpl.setVehicleClass(vehicleClass);
		}

		if (vehicleType == null) {
			vrConfigTechSpecImpl.setVehicleType(StringPool.BLANK);
		}
		else {
			vrConfigTechSpecImpl.setVehicleType(vehicleType);
		}

		if (vehicletypeName == null) {
			vrConfigTechSpecImpl.setVehicletypeName(StringPool.BLANK);
		}
		else {
			vrConfigTechSpecImpl.setVehicletypeName(vehicletypeName);
		}

		vrConfigTechSpecImpl.setSequenceNo(sequenceNo);

		if (specificationName == null) {
			vrConfigTechSpecImpl.setSpecificationName(StringPool.BLANK);
		}
		else {
			vrConfigTechSpecImpl.setSpecificationName(specificationName);
		}

		if (specificationCode == null) {
			vrConfigTechSpecImpl.setSpecificationCode(StringPool.BLANK);
		}
		else {
			vrConfigTechSpecImpl.setSpecificationCode(specificationCode);
		}

		if (specificationDisplayName == null) {
			vrConfigTechSpecImpl.setSpecificationDisplayName(StringPool.BLANK);
		}
		else {
			vrConfigTechSpecImpl.setSpecificationDisplayName(specificationDisplayName);
		}

		if (specCategory == null) {
			vrConfigTechSpecImpl.setSpecCategory(StringPool.BLANK);
		}
		else {
			vrConfigTechSpecImpl.setSpecCategory(specCategory);
		}

		vrConfigTechSpecImpl.setSpecificationGroup(specificationGroup);

		if (specificationDataCollectionId == null) {
			vrConfigTechSpecImpl.setSpecificationDataCollectionId(StringPool.BLANK);
		}
		else {
			vrConfigTechSpecImpl.setSpecificationDataCollectionId(specificationDataCollectionId);
		}

		if (specificationBasicUnit == null) {
			vrConfigTechSpecImpl.setSpecificationBasicUnit(StringPool.BLANK);
		}
		else {
			vrConfigTechSpecImpl.setSpecificationBasicUnit(specificationBasicUnit);
		}

		if (specificationStandard == null) {
			vrConfigTechSpecImpl.setSpecificationStandard(StringPool.BLANK);
		}
		else {
			vrConfigTechSpecImpl.setSpecificationStandard(specificationStandard);
		}

		if (specificationEntryType == null) {
			vrConfigTechSpecImpl.setSpecificationEntryType(StringPool.BLANK);
		}
		else {
			vrConfigTechSpecImpl.setSpecificationEntryType(specificationEntryType);
		}

		if (specificationEntryPlaceholder == null) {
			vrConfigTechSpecImpl.setSpecificationEntryPlaceholder(StringPool.BLANK);
		}
		else {
			vrConfigTechSpecImpl.setSpecificationEntryPlaceholder(specificationEntryPlaceholder);
		}

		vrConfigTechSpecImpl.setSpecificationMandatory(specificationMandatory);

		if (module == null) {
			vrConfigTechSpecImpl.setModule(StringPool.BLANK);
		}
		else {
			vrConfigTechSpecImpl.setModule(module);
		}

		if (synchDate == Long.MIN_VALUE) {
			vrConfigTechSpecImpl.setSynchDate(null);
		}
		else {
			vrConfigTechSpecImpl.setSynchDate(new Date(synchDate));
		}

		vrConfigTechSpecImpl.resetOriginalValues();

		return vrConfigTechSpecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vehicleClass = objectInput.readUTF();
		vehicleType = objectInput.readUTF();
		vehicletypeName = objectInput.readUTF();

		sequenceNo = objectInput.readInt();
		specificationName = objectInput.readUTF();
		specificationCode = objectInput.readUTF();
		specificationDisplayName = objectInput.readUTF();
		specCategory = objectInput.readUTF();

		specificationGroup = objectInput.readInt();
		specificationDataCollectionId = objectInput.readUTF();
		specificationBasicUnit = objectInput.readUTF();
		specificationStandard = objectInput.readUTF();
		specificationEntryType = objectInput.readUTF();
		specificationEntryPlaceholder = objectInput.readUTF();

		specificationMandatory = objectInput.readInt();
		module = objectInput.readUTF();
		synchDate = objectInput.readLong();
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

		if (vehicletypeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicletypeName);
		}

		objectOutput.writeInt(sequenceNo);

		if (specificationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationName);
		}

		if (specificationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationCode);
		}

		if (specificationDisplayName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationDisplayName);
		}

		if (specCategory == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specCategory);
		}

		objectOutput.writeInt(specificationGroup);

		if (specificationDataCollectionId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationDataCollectionId);
		}

		if (specificationBasicUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationBasicUnit);
		}

		if (specificationStandard == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationStandard);
		}

		if (specificationEntryType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationEntryType);
		}

		if (specificationEntryPlaceholder == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationEntryPlaceholder);
		}

		objectOutput.writeInt(specificationMandatory);

		if (module == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(module);
		}

		objectOutput.writeLong(synchDate);
	}

	public long id;
	public String vehicleClass;
	public String vehicleType;
	public String vehicletypeName;
	public int sequenceNo;
	public String specificationName;
	public String specificationCode;
	public String specificationDisplayName;
	public String specCategory;
	public int specificationGroup;
	public String specificationDataCollectionId;
	public String specificationBasicUnit;
	public String specificationStandard;
	public String specificationEntryType;
	public String specificationEntryPlaceholder;
	public int specificationMandatory;
	public String module;
	public long synchDate;
}