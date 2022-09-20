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

import com.fds.vr.business.model.VRCertificateProgressFile;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VRCertificateProgressFile in entity cache.
 *
 * @author LamTV
 * @see VRCertificateProgressFile
 * @generated
 */
@ProviderType
public class VRCertificateProgressFileCacheModel implements CacheModel<VRCertificateProgressFile>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCertificateProgressFileCacheModel)) {
			return false;
		}

		VRCertificateProgressFileCacheModel vrCertificateProgressFileCacheModel = (VRCertificateProgressFileCacheModel)obj;

		if (id == vrCertificateProgressFileCacheModel.id) {
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
		sb.append(", certificateProgressID=");
		sb.append(certificateProgressID);
		sb.append(", attachedFileID=");
		sb.append(attachedFileID);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCertificateProgressFile toEntityModel() {
		VRCertificateProgressFileImpl vrCertificateProgressFileImpl = new VRCertificateProgressFileImpl();

		vrCertificateProgressFileImpl.setId(id);
		vrCertificateProgressFileImpl.setCertificateProgressID(certificateProgressID);
		vrCertificateProgressFileImpl.setAttachedFileID(attachedFileID);

		vrCertificateProgressFileImpl.resetOriginalValues();

		return vrCertificateProgressFileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		certificateProgressID = objectInput.readLong();

		attachedFileID = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(certificateProgressID);

		objectOutput.writeLong(attachedFileID);
	}

	public long id;
	public long certificateProgressID;
	public long attachedFileID;
}