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

import com.fds.vr.business.model.VRMigrateReview;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VRMigrateReview in entity cache.
 *
 * @author LamTV
 * @see VRMigrateReview
 * @generated
 */
@ProviderType
public class VRMigrateReviewCacheModel implements CacheModel<VRMigrateReview>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRMigrateReviewCacheModel)) {
			return false;
		}

		VRMigrateReviewCacheModel vrMigrateReviewCacheModel = (VRMigrateReviewCacheModel)obj;

		if (id == vrMigrateReviewCacheModel.id) {
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
		sb.append(", dataGroupID=");
		sb.append(dataGroupID);
		sb.append(", migrateTableName=");
		sb.append(migrateTableName);
		sb.append(", migrationConfiguration=");
		sb.append(migrationConfiguration);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", taskMigrationID=");
		sb.append(taskMigrationID);
		sb.append(", migrateRows=");
		sb.append(migrateRows);
		sb.append(", migrateRemarks=");
		sb.append(migrateRemarks);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRMigrateReview toEntityModel() {
		VRMigrateReviewImpl vrMigrateReviewImpl = new VRMigrateReviewImpl();

		vrMigrateReviewImpl.setId(id);
		vrMigrateReviewImpl.setDataGroupID(dataGroupID);

		if (migrateTableName == null) {
			vrMigrateReviewImpl.setMigrateTableName(StringPool.BLANK);
		}
		else {
			vrMigrateReviewImpl.setMigrateTableName(migrateTableName);
		}

		if (migrationConfiguration == null) {
			vrMigrateReviewImpl.setMigrationConfiguration(StringPool.BLANK);
		}
		else {
			vrMigrateReviewImpl.setMigrationConfiguration(migrationConfiguration);
		}

		vrMigrateReviewImpl.setSequenceNo(sequenceNo);
		vrMigrateReviewImpl.setTaskMigrationID(taskMigrationID);

		if (migrateRows == null) {
			vrMigrateReviewImpl.setMigrateRows(StringPool.BLANK);
		}
		else {
			vrMigrateReviewImpl.setMigrateRows(migrateRows);
		}

		if (migrateRemarks == null) {
			vrMigrateReviewImpl.setMigrateRemarks(StringPool.BLANK);
		}
		else {
			vrMigrateReviewImpl.setMigrateRemarks(migrateRemarks);
		}

		vrMigrateReviewImpl.resetOriginalValues();

		return vrMigrateReviewImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		dataGroupID = objectInput.readInt();
		migrateTableName = objectInput.readUTF();
		migrationConfiguration = objectInput.readUTF();

		sequenceNo = objectInput.readInt();

		taskMigrationID = objectInput.readInt();
		migrateRows = objectInput.readUTF();
		migrateRemarks = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeInt(dataGroupID);

		if (migrateTableName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(migrateTableName);
		}

		if (migrationConfiguration == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(migrationConfiguration);
		}

		objectOutput.writeInt(sequenceNo);

		objectOutput.writeInt(taskMigrationID);

		if (migrateRows == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(migrateRows);
		}

		if (migrateRemarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(migrateRemarks);
		}
	}

	public long id;
	public int dataGroupID;
	public String migrateTableName;
	public String migrationConfiguration;
	public int sequenceNo;
	public int taskMigrationID;
	public String migrateRows;
	public String migrateRemarks;
}