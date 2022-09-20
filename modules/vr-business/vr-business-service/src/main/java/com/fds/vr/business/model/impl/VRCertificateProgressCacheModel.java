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

import com.fds.vr.business.model.VRCertificateProgress;

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
 * The cache model class for representing VRCertificateProgress in entity cache.
 *
 * @author LamTV
 * @see VRCertificateProgress
 * @generated
 */
@ProviderType
public class VRCertificateProgressCacheModel implements CacheModel<VRCertificateProgress>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCertificateProgressCacheModel)) {
			return false;
		}

		VRCertificateProgressCacheModel vrCertificateProgressCacheModel = (VRCertificateProgressCacheModel)obj;

		if (id == vrCertificateProgressCacheModel.id) {
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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleCertificateId=");
		sb.append(vehicleCertificateId);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", inspectorId=");
		sb.append(inspectorId);
		sb.append(", actionCode=");
		sb.append(actionCode);
		sb.append(", progressTime=");
		sb.append(progressTime);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCertificateProgress toEntityModel() {
		VRCertificateProgressImpl vrCertificateProgressImpl = new VRCertificateProgressImpl();

		vrCertificateProgressImpl.setId(id);
		vrCertificateProgressImpl.setVehicleCertificateId(vehicleCertificateId);

		if (corporationId == null) {
			vrCertificateProgressImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			vrCertificateProgressImpl.setCorporationId(corporationId);
		}

		vrCertificateProgressImpl.setInspectorId(inspectorId);

		if (actionCode == null) {
			vrCertificateProgressImpl.setActionCode(StringPool.BLANK);
		}
		else {
			vrCertificateProgressImpl.setActionCode(actionCode);
		}

		if (progressTime == Long.MIN_VALUE) {
			vrCertificateProgressImpl.setProgressTime(null);
		}
		else {
			vrCertificateProgressImpl.setProgressTime(new Date(progressTime));
		}

		if (remarks == null) {
			vrCertificateProgressImpl.setRemarks(StringPool.BLANK);
		}
		else {
			vrCertificateProgressImpl.setRemarks(remarks);
		}

		vrCertificateProgressImpl.resetOriginalValues();

		return vrCertificateProgressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		vehicleCertificateId = objectInput.readLong();
		corporationId = objectInput.readUTF();

		inspectorId = objectInput.readLong();
		actionCode = objectInput.readUTF();
		progressTime = objectInput.readLong();
		remarks = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(vehicleCertificateId);

		if (corporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationId);
		}

		objectOutput.writeLong(inspectorId);

		if (actionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actionCode);
		}

		objectOutput.writeLong(progressTime);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}
	}

	public long id;
	public long vehicleCertificateId;
	public String corporationId;
	public long inspectorId;
	public String actionCode;
	public long progressTime;
	public String remarks;
}