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

import com.fds.vr.business.model.VRCorporationView;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VRCorporationView in entity cache.
 *
 * @author LamTV
 * @see VRCorporationView
 * @generated
 */
@ProviderType
public class VRCorporationViewCacheModel implements CacheModel<VRCorporationView>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCorporationViewCacheModel)) {
			return false;
		}

		VRCorporationViewCacheModel vrCorporationViewCacheModel = (VRCorporationViewCacheModel)obj;

		if (id == vrCorporationViewCacheModel.id) {
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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", corporationName=");
		sb.append(corporationName);
		sb.append(", inspectorId=");
		sb.append(inspectorId);
		sb.append(", isLeader=");
		sb.append(isLeader);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCorporationView toEntityModel() {
		VRCorporationViewImpl vrCorporationViewImpl = new VRCorporationViewImpl();

		vrCorporationViewImpl.setId(id);
		vrCorporationViewImpl.setMtCore(mtCore);

		if (corporationId == null) {
			vrCorporationViewImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			vrCorporationViewImpl.setCorporationId(corporationId);
		}

		if (corporationName == null) {
			vrCorporationViewImpl.setCorporationName(StringPool.BLANK);
		}
		else {
			vrCorporationViewImpl.setCorporationName(corporationName);
		}

		vrCorporationViewImpl.setInspectorId(inspectorId);
		vrCorporationViewImpl.setIsLeader(isLeader);

		vrCorporationViewImpl.resetOriginalValues();

		return vrCorporationViewImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();
		corporationId = objectInput.readUTF();
		corporationName = objectInput.readUTF();

		inspectorId = objectInput.readLong();

		isLeader = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		if (corporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationId);
		}

		if (corporationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationName);
		}

		objectOutput.writeLong(inspectorId);

		objectOutput.writeInt(isLeader);
	}

	public long id;
	public long mtCore;
	public String corporationId;
	public String corporationName;
	public long inspectorId;
	public int isLeader;
}