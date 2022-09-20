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

package org.opencps.dossiermgt.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import org.opencps.dossiermgt.model.DossierSync;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DossierSync in entity cache.
 *
 * @author huymq
 * @see DossierSync
 * @generated
 */
@ProviderType
public class DossierSyncCacheModel implements CacheModel<DossierSync>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierSyncCacheModel)) {
			return false;
		}

		DossierSyncCacheModel dossierSyncCacheModel = (DossierSyncCacheModel)obj;

		if (dossierSyncId == dossierSyncCacheModel.dossierSyncId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dossierSyncId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", dossierSyncId=");
		sb.append(dossierSyncId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierReferenceUid=");
		sb.append(dossierReferenceUid);
		sb.append(", createDossier=");
		sb.append(createDossier);
		sb.append(", method=");
		sb.append(method);
		sb.append(", classPK=");
		sb.append(classPK);
		sb.append(", fileReferenceUid=");
		sb.append(fileReferenceUid);
		sb.append(", serverNo=");
		sb.append(serverNo);
		sb.append(", payload=");
		sb.append(payload);
		sb.append(", retry=");
		sb.append(retry);
		sb.append(", state=");
		sb.append(state);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierSync toEntityModel() {
		DossierSyncImpl dossierSyncImpl = new DossierSyncImpl();

		if (uuid == null) {
			dossierSyncImpl.setUuid(StringPool.BLANK);
		}
		else {
			dossierSyncImpl.setUuid(uuid);
		}

		dossierSyncImpl.setDossierSyncId(dossierSyncId);
		dossierSyncImpl.setCompanyId(companyId);
		dossierSyncImpl.setGroupId(groupId);
		dossierSyncImpl.setUserId(userId);

		if (userName == null) {
			dossierSyncImpl.setUserName(StringPool.BLANK);
		}
		else {
			dossierSyncImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			dossierSyncImpl.setCreateDate(null);
		}
		else {
			dossierSyncImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dossierSyncImpl.setModifiedDate(null);
		}
		else {
			dossierSyncImpl.setModifiedDate(new Date(modifiedDate));
		}

		dossierSyncImpl.setDossierId(dossierId);

		if (dossierReferenceUid == null) {
			dossierSyncImpl.setDossierReferenceUid(StringPool.BLANK);
		}
		else {
			dossierSyncImpl.setDossierReferenceUid(dossierReferenceUid);
		}

		dossierSyncImpl.setCreateDossier(createDossier);
		dossierSyncImpl.setMethod(method);
		dossierSyncImpl.setClassPK(classPK);

		if (fileReferenceUid == null) {
			dossierSyncImpl.setFileReferenceUid(StringPool.BLANK);
		}
		else {
			dossierSyncImpl.setFileReferenceUid(fileReferenceUid);
		}

		if (serverNo == null) {
			dossierSyncImpl.setServerNo(StringPool.BLANK);
		}
		else {
			dossierSyncImpl.setServerNo(serverNo);
		}

		if (payload == null) {
			dossierSyncImpl.setPayload(StringPool.BLANK);
		}
		else {
			dossierSyncImpl.setPayload(payload);
		}

		dossierSyncImpl.setRetry(retry);
		dossierSyncImpl.setState(state);

		dossierSyncImpl.resetOriginalValues();

		return dossierSyncImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		dossierSyncId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		dossierId = objectInput.readLong();
		dossierReferenceUid = objectInput.readUTF();

		createDossier = objectInput.readBoolean();

		method = objectInput.readInt();

		classPK = objectInput.readLong();
		fileReferenceUid = objectInput.readUTF();
		serverNo = objectInput.readUTF();
		payload = objectInput.readUTF();

		retry = objectInput.readInt();

		state = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(dossierSyncId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(dossierId);

		if (dossierReferenceUid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierReferenceUid);
		}

		objectOutput.writeBoolean(createDossier);

		objectOutput.writeInt(method);

		objectOutput.writeLong(classPK);

		if (fileReferenceUid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileReferenceUid);
		}

		if (serverNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serverNo);
		}

		if (payload == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(payload);
		}

		objectOutput.writeInt(retry);

		objectOutput.writeInt(state);
	}

	public String uuid;
	public long dossierSyncId;
	public long companyId;
	public long groupId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dossierId;
	public String dossierReferenceUid;
	public boolean createDossier;
	public int method;
	public long classPK;
	public String fileReferenceUid;
	public String serverNo;
	public String payload;
	public int retry;
	public int state;
}