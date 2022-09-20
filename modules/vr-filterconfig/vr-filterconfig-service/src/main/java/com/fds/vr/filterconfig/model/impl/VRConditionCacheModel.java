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

package com.fds.vr.filterconfig.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.filterconfig.model.VRCondition;

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
 * The cache model class for representing VRCondition in entity cache.
 *
 * @author NhanHoang
 * @see VRCondition
 * @generated
 */
@ProviderType
public class VRConditionCacheModel implements CacheModel<VRCondition>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRConditionCacheModel)) {
			return false;
		}

		VRConditionCacheModel vrConditionCacheModel = (VRConditionCacheModel)obj;

		if (id == vrConditionCacheModel.id) {
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
		sb.append(", filterModuleCode=");
		sb.append(filterModuleCode);
		sb.append(", filterTableField=");
		sb.append(filterTableField);
		sb.append(", filterTableName=");
		sb.append(filterTableName);
		sb.append(", specificationCode=");
		sb.append(specificationCode);
		sb.append(", specificationDisplayName=");
		sb.append(specificationDisplayName);
		sb.append(", specificationDataCollectionID=");
		sb.append(specificationDataCollectionID);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", specificationBasicUnit=");
		sb.append(specificationBasicUnit);
		sb.append(", specificationStandard=");
		sb.append(specificationStandard);
		sb.append(", specificationGroup=");
		sb.append(specificationGroup);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCondition toEntityModel() {
		VRConditionImpl vrConditionImpl = new VRConditionImpl();

		vrConditionImpl.setId(id);

		if (filterModuleCode == null) {
			vrConditionImpl.setFilterModuleCode(StringPool.BLANK);
		}
		else {
			vrConditionImpl.setFilterModuleCode(filterModuleCode);
		}

		if (filterTableField == null) {
			vrConditionImpl.setFilterTableField(StringPool.BLANK);
		}
		else {
			vrConditionImpl.setFilterTableField(filterTableField);
		}

		if (filterTableName == null) {
			vrConditionImpl.setFilterTableName(StringPool.BLANK);
		}
		else {
			vrConditionImpl.setFilterTableName(filterTableName);
		}

		if (specificationCode == null) {
			vrConditionImpl.setSpecificationCode(StringPool.BLANK);
		}
		else {
			vrConditionImpl.setSpecificationCode(specificationCode);
		}

		if (specificationDisplayName == null) {
			vrConditionImpl.setSpecificationDisplayName(StringPool.BLANK);
		}
		else {
			vrConditionImpl.setSpecificationDisplayName(specificationDisplayName);
		}

		if (specificationDataCollectionID == null) {
			vrConditionImpl.setSpecificationDataCollectionID(StringPool.BLANK);
		}
		else {
			vrConditionImpl.setSpecificationDataCollectionID(specificationDataCollectionID);
		}

		vrConditionImpl.setSequenceNo(sequenceNo);

		if (specificationBasicUnit == null) {
			vrConditionImpl.setSpecificationBasicUnit(StringPool.BLANK);
		}
		else {
			vrConditionImpl.setSpecificationBasicUnit(specificationBasicUnit);
		}

		if (specificationStandard == null) {
			vrConditionImpl.setSpecificationStandard(StringPool.BLANK);
		}
		else {
			vrConditionImpl.setSpecificationStandard(specificationStandard);
		}

		if (specificationGroup == null) {
			vrConditionImpl.setSpecificationGroup(StringPool.BLANK);
		}
		else {
			vrConditionImpl.setSpecificationGroup(specificationGroup);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrConditionImpl.setModifyDate(null);
		}
		else {
			vrConditionImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrConditionImpl.setSyncDate(null);
		}
		else {
			vrConditionImpl.setSyncDate(new Date(syncDate));
		}

		vrConditionImpl.resetOriginalValues();

		return vrConditionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		filterModuleCode = objectInput.readUTF();
		filterTableField = objectInput.readUTF();
		filterTableName = objectInput.readUTF();
		specificationCode = objectInput.readUTF();
		specificationDisplayName = objectInput.readUTF();
		specificationDataCollectionID = objectInput.readUTF();

		sequenceNo = objectInput.readLong();
		specificationBasicUnit = objectInput.readUTF();
		specificationStandard = objectInput.readUTF();
		specificationGroup = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (filterModuleCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(filterModuleCode);
		}

		if (filterTableField == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(filterTableField);
		}

		if (filterTableName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(filterTableName);
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

		if (specificationDataCollectionID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationDataCollectionID);
		}

		objectOutput.writeLong(sequenceNo);

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

		if (specificationGroup == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationGroup);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public String filterModuleCode;
	public String filterTableField;
	public String filterTableName;
	public String specificationCode;
	public String specificationDisplayName;
	public String specificationDataCollectionID;
	public long sequenceNo;
	public String specificationBasicUnit;
	public String specificationStandard;
	public String specificationGroup;
	public long modifyDate;
	public long syncDate;
}