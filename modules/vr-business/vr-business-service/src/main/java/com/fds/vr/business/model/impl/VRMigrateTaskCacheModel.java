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

import com.fds.vr.business.model.VRMigrateTask;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VRMigrateTask in entity cache.
 *
 * @author LamTV
 * @see VRMigrateTask
 * @generated
 */
@ProviderType
public class VRMigrateTaskCacheModel implements CacheModel<VRMigrateTask>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRMigrateTaskCacheModel)) {
			return false;
		}

		VRMigrateTaskCacheModel vrMigrateTaskCacheModel = (VRMigrateTaskCacheModel)obj;

		if (task_id == vrMigrateTaskCacheModel.task_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, task_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{task_id=");
		sb.append(task_id);
		sb.append(", task_name=");
		sb.append(task_name);
		sb.append(", taskMigrationID=");
		sb.append(taskMigrationID);
		sb.append(", source_config=");
		sb.append(source_config);
		sb.append(", target_config=");
		sb.append(target_config);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRMigrateTask toEntityModel() {
		VRMigrateTaskImpl vrMigrateTaskImpl = new VRMigrateTaskImpl();

		vrMigrateTaskImpl.setTask_id(task_id);

		if (task_name == null) {
			vrMigrateTaskImpl.setTask_name(StringPool.BLANK);
		}
		else {
			vrMigrateTaskImpl.setTask_name(task_name);
		}

		vrMigrateTaskImpl.setTaskMigrationID(taskMigrationID);

		if (source_config == null) {
			vrMigrateTaskImpl.setSource_config(StringPool.BLANK);
		}
		else {
			vrMigrateTaskImpl.setSource_config(source_config);
		}

		if (target_config == null) {
			vrMigrateTaskImpl.setTarget_config(StringPool.BLANK);
		}
		else {
			vrMigrateTaskImpl.setTarget_config(target_config);
		}

		if (remarks == null) {
			vrMigrateTaskImpl.setRemarks(StringPool.BLANK);
		}
		else {
			vrMigrateTaskImpl.setRemarks(remarks);
		}

		vrMigrateTaskImpl.setStatus(status);

		vrMigrateTaskImpl.resetOriginalValues();

		return vrMigrateTaskImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		task_id = objectInput.readLong();
		task_name = objectInput.readUTF();

		taskMigrationID = objectInput.readInt();
		source_config = objectInput.readUTF();
		target_config = objectInput.readUTF();
		remarks = objectInput.readUTF();

		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(task_id);

		if (task_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(task_name);
		}

		objectOutput.writeInt(taskMigrationID);

		if (source_config == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(source_config);
		}

		if (target_config == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(target_config);
		}

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeInt(status);
	}

	public long task_id;
	public String task_name;
	public int taskMigrationID;
	public String source_config;
	public String target_config;
	public String remarks;
	public int status;
}