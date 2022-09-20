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

import com.fds.vr.business.model.VRSyncDate;

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
 * The cache model class for representing VRSyncDate in entity cache.
 *
 * @author LamTV
 * @see VRSyncDate
 * @generated
 */
@ProviderType
public class VRSyncDateCacheModel implements CacheModel<VRSyncDate>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRSyncDateCacheModel)) {
			return false;
		}

		VRSyncDateCacheModel vrSyncDateCacheModel = (VRSyncDateCacheModel)obj;

		if (id == vrSyncDateCacheModel.id) {
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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", tableName=");
		sb.append(tableName);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRSyncDate toEntityModel() {
		VRSyncDateImpl vrSyncDateImpl = new VRSyncDateImpl();

		vrSyncDateImpl.setId(id);

		if (tableName == null) {
			vrSyncDateImpl.setTableName(StringPool.BLANK);
		}
		else {
			vrSyncDateImpl.setTableName(tableName);
		}

		if (syncDate == Long.MIN_VALUE) {
			vrSyncDateImpl.setSyncDate(null);
		}
		else {
			vrSyncDateImpl.setSyncDate(new Date(syncDate));
		}

		vrSyncDateImpl.resetOriginalValues();

		return vrSyncDateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		tableName = objectInput.readUTF();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (tableName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tableName);
		}

		objectOutput.writeLong(syncDate);
	}

	public long id;
	public String tableName;
	public long syncDate;
}