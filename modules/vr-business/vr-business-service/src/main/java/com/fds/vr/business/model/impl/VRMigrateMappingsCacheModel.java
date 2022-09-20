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

import com.fds.vr.business.model.VRMigrateMappings;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VRMigrateMappings in entity cache.
 *
 * @author LamTV
 * @see VRMigrateMappings
 * @generated
 */
@ProviderType
public class VRMigrateMappingsCacheModel implements CacheModel<VRMigrateMappings>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRMigrateMappingsCacheModel)) {
			return false;
		}

		VRMigrateMappingsCacheModel vrMigrateMappingsCacheModel = (VRMigrateMappingsCacheModel)obj;

		if (id == vrMigrateMappingsCacheModel.id) {
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
		StringBundler sb = new StringBundler(47);

		sb.append("{id=");
		sb.append(id);
		sb.append(", dataGroupId=");
		sb.append(dataGroupId);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", migrateTableName=");
		sb.append(migrateTableName);
		sb.append(", dataItemID=");
		sb.append(dataItemID);
		sb.append(", itemCode=");
		sb.append(itemCode);
		sb.append(", itemName=");
		sb.append(itemName);
		sb.append(", itemShortName=");
		sb.append(itemShortName);
		sb.append(", itemDescription=");
		sb.append(itemDescription);
		sb.append(", code_0=");
		sb.append(code_0);
		sb.append(", code_1=");
		sb.append(code_1);
		sb.append(", code_2=");
		sb.append(code_2);
		sb.append(", code_3=");
		sb.append(code_3);
		sb.append(", level=");
		sb.append(level);
		sb.append(", seqNo=");
		sb.append(seqNo);
		sb.append(", markedAsRestore=");
		sb.append(markedAsRestore);
		sb.append(", markedAsDelete=");
		sb.append(markedAsDelete);
		sb.append(", alterCollectionCode=");
		sb.append(alterCollectionCode);
		sb.append(", alterItemCode=");
		sb.append(alterItemCode);
		sb.append(", alterItemName=");
		sb.append(alterItemName);
		sb.append(", alterGroupCode=");
		sb.append(alterGroupCode);
		sb.append(", alterLevel=");
		sb.append(alterLevel);
		sb.append(", taskMigrationID=");
		sb.append(taskMigrationID);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRMigrateMappings toEntityModel() {
		VRMigrateMappingsImpl vrMigrateMappingsImpl = new VRMigrateMappingsImpl();

		vrMigrateMappingsImpl.setId(id);
		vrMigrateMappingsImpl.setDataGroupId(dataGroupId);
		vrMigrateMappingsImpl.setSequenceNo(sequenceNo);

		if (migrateTableName == null) {
			vrMigrateMappingsImpl.setMigrateTableName(StringPool.BLANK);
		}
		else {
			vrMigrateMappingsImpl.setMigrateTableName(migrateTableName);
		}

		vrMigrateMappingsImpl.setDataItemID(dataItemID);

		if (itemCode == null) {
			vrMigrateMappingsImpl.setItemCode(StringPool.BLANK);
		}
		else {
			vrMigrateMappingsImpl.setItemCode(itemCode);
		}

		if (itemName == null) {
			vrMigrateMappingsImpl.setItemName(StringPool.BLANK);
		}
		else {
			vrMigrateMappingsImpl.setItemName(itemName);
		}

		if (itemShortName == null) {
			vrMigrateMappingsImpl.setItemShortName(StringPool.BLANK);
		}
		else {
			vrMigrateMappingsImpl.setItemShortName(itemShortName);
		}

		if (itemDescription == null) {
			vrMigrateMappingsImpl.setItemDescription(StringPool.BLANK);
		}
		else {
			vrMigrateMappingsImpl.setItemDescription(itemDescription);
		}

		if (code_0 == null) {
			vrMigrateMappingsImpl.setCode_0(StringPool.BLANK);
		}
		else {
			vrMigrateMappingsImpl.setCode_0(code_0);
		}

		if (code_1 == null) {
			vrMigrateMappingsImpl.setCode_1(StringPool.BLANK);
		}
		else {
			vrMigrateMappingsImpl.setCode_1(code_1);
		}

		if (code_2 == null) {
			vrMigrateMappingsImpl.setCode_2(StringPool.BLANK);
		}
		else {
			vrMigrateMappingsImpl.setCode_2(code_2);
		}

		if (code_3 == null) {
			vrMigrateMappingsImpl.setCode_3(StringPool.BLANK);
		}
		else {
			vrMigrateMappingsImpl.setCode_3(code_3);
		}

		vrMigrateMappingsImpl.setLevel(level);
		vrMigrateMappingsImpl.setSeqNo(seqNo);
		vrMigrateMappingsImpl.setMarkedAsRestore(markedAsRestore);
		vrMigrateMappingsImpl.setMarkedAsDelete(markedAsDelete);

		if (alterCollectionCode == null) {
			vrMigrateMappingsImpl.setAlterCollectionCode(StringPool.BLANK);
		}
		else {
			vrMigrateMappingsImpl.setAlterCollectionCode(alterCollectionCode);
		}

		if (alterItemCode == null) {
			vrMigrateMappingsImpl.setAlterItemCode(StringPool.BLANK);
		}
		else {
			vrMigrateMappingsImpl.setAlterItemCode(alterItemCode);
		}

		if (alterItemName == null) {
			vrMigrateMappingsImpl.setAlterItemName(StringPool.BLANK);
		}
		else {
			vrMigrateMappingsImpl.setAlterItemName(alterItemName);
		}

		if (alterGroupCode == null) {
			vrMigrateMappingsImpl.setAlterGroupCode(StringPool.BLANK);
		}
		else {
			vrMigrateMappingsImpl.setAlterGroupCode(alterGroupCode);
		}

		if (alterLevel == null) {
			vrMigrateMappingsImpl.setAlterLevel(StringPool.BLANK);
		}
		else {
			vrMigrateMappingsImpl.setAlterLevel(alterLevel);
		}

		vrMigrateMappingsImpl.setTaskMigrationID(taskMigrationID);

		vrMigrateMappingsImpl.resetOriginalValues();

		return vrMigrateMappingsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		dataGroupId = objectInput.readInt();

		sequenceNo = objectInput.readInt();
		migrateTableName = objectInput.readUTF();

		dataItemID = objectInput.readInt();
		itemCode = objectInput.readUTF();
		itemName = objectInput.readUTF();
		itemShortName = objectInput.readUTF();
		itemDescription = objectInput.readUTF();
		code_0 = objectInput.readUTF();
		code_1 = objectInput.readUTF();
		code_2 = objectInput.readUTF();
		code_3 = objectInput.readUTF();

		level = objectInput.readInt();

		seqNo = objectInput.readInt();

		markedAsRestore = objectInput.readInt();

		markedAsDelete = objectInput.readInt();
		alterCollectionCode = objectInput.readUTF();
		alterItemCode = objectInput.readUTF();
		alterItemName = objectInput.readUTF();
		alterGroupCode = objectInput.readUTF();
		alterLevel = objectInput.readUTF();

		taskMigrationID = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeInt(dataGroupId);

		objectOutput.writeInt(sequenceNo);

		if (migrateTableName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(migrateTableName);
		}

		objectOutput.writeInt(dataItemID);

		if (itemCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(itemCode);
		}

		if (itemName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(itemName);
		}

		if (itemShortName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(itemShortName);
		}

		if (itemDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(itemDescription);
		}

		if (code_0 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code_0);
		}

		if (code_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code_1);
		}

		if (code_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code_2);
		}

		if (code_3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code_3);
		}

		objectOutput.writeInt(level);

		objectOutput.writeInt(seqNo);

		objectOutput.writeInt(markedAsRestore);

		objectOutput.writeInt(markedAsDelete);

		if (alterCollectionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(alterCollectionCode);
		}

		if (alterItemCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(alterItemCode);
		}

		if (alterItemName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(alterItemName);
		}

		if (alterGroupCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(alterGroupCode);
		}

		if (alterLevel == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(alterLevel);
		}

		objectOutput.writeInt(taskMigrationID);
	}

	public long id;
	public int dataGroupId;
	public int sequenceNo;
	public String migrateTableName;
	public int dataItemID;
	public String itemCode;
	public String itemName;
	public String itemShortName;
	public String itemDescription;
	public String code_0;
	public String code_1;
	public String code_2;
	public String code_3;
	public int level;
	public int seqNo;
	public int markedAsRestore;
	public int markedAsDelete;
	public String alterCollectionCode;
	public String alterItemCode;
	public String alterItemName;
	public String alterGroupCode;
	public String alterLevel;
	public int taskMigrationID;
}