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

import org.opencps.dossiermgt.model.DossierAction;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DossierAction in entity cache.
 *
 * @author huymq
 * @see DossierAction
 * @generated
 */
@ProviderType
public class DossierActionCacheModel implements CacheModel<DossierAction>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierActionCacheModel)) {
			return false;
		}

		DossierActionCacheModel dossierActionCacheModel = (DossierActionCacheModel)obj;

		if (dossierActionId == dossierActionCacheModel.dossierActionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dossierActionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", dossierActionId=");
		sb.append(dossierActionId);
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
		sb.append(", serviceProcessId=");
		sb.append(serviceProcessId);
		sb.append(", previousActionId=");
		sb.append(previousActionId);
		sb.append(", actionCode=");
		sb.append(actionCode);
		sb.append(", actionUser=");
		sb.append(actionUser);
		sb.append(", actionName=");
		sb.append(actionName);
		sb.append(", actionNote=");
		sb.append(actionNote);
		sb.append(", actionOverdue=");
		sb.append(actionOverdue);
		sb.append(", syncActionCode=");
		sb.append(syncActionCode);
		sb.append(", pending=");
		sb.append(pending);
		sb.append(", rollbackable=");
		sb.append(rollbackable);
		sb.append(", stepCode=");
		sb.append(stepCode);
		sb.append(", stepName=");
		sb.append(stepName);
		sb.append(", dueDate=");
		sb.append(dueDate);
		sb.append(", nextActionId=");
		sb.append(nextActionId);
		sb.append(", payload=");
		sb.append(payload);
		sb.append(", stepInstruction=");
		sb.append(stepInstruction);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierAction toEntityModel() {
		DossierActionImpl dossierActionImpl = new DossierActionImpl();

		if (uuid == null) {
			dossierActionImpl.setUuid(StringPool.BLANK);
		}
		else {
			dossierActionImpl.setUuid(uuid);
		}

		dossierActionImpl.setDossierActionId(dossierActionId);
		dossierActionImpl.setCompanyId(companyId);
		dossierActionImpl.setGroupId(groupId);
		dossierActionImpl.setUserId(userId);

		if (userName == null) {
			dossierActionImpl.setUserName(StringPool.BLANK);
		}
		else {
			dossierActionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			dossierActionImpl.setCreateDate(null);
		}
		else {
			dossierActionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dossierActionImpl.setModifiedDate(null);
		}
		else {
			dossierActionImpl.setModifiedDate(new Date(modifiedDate));
		}

		dossierActionImpl.setDossierId(dossierId);
		dossierActionImpl.setServiceProcessId(serviceProcessId);
		dossierActionImpl.setPreviousActionId(previousActionId);

		if (actionCode == null) {
			dossierActionImpl.setActionCode(StringPool.BLANK);
		}
		else {
			dossierActionImpl.setActionCode(actionCode);
		}

		if (actionUser == null) {
			dossierActionImpl.setActionUser(StringPool.BLANK);
		}
		else {
			dossierActionImpl.setActionUser(actionUser);
		}

		if (actionName == null) {
			dossierActionImpl.setActionName(StringPool.BLANK);
		}
		else {
			dossierActionImpl.setActionName(actionName);
		}

		if (actionNote == null) {
			dossierActionImpl.setActionNote(StringPool.BLANK);
		}
		else {
			dossierActionImpl.setActionNote(actionNote);
		}

		dossierActionImpl.setActionOverdue(actionOverdue);

		if (syncActionCode == null) {
			dossierActionImpl.setSyncActionCode(StringPool.BLANK);
		}
		else {
			dossierActionImpl.setSyncActionCode(syncActionCode);
		}

		dossierActionImpl.setPending(pending);
		dossierActionImpl.setRollbackable(rollbackable);

		if (stepCode == null) {
			dossierActionImpl.setStepCode(StringPool.BLANK);
		}
		else {
			dossierActionImpl.setStepCode(stepCode);
		}

		if (stepName == null) {
			dossierActionImpl.setStepName(StringPool.BLANK);
		}
		else {
			dossierActionImpl.setStepName(stepName);
		}

		if (dueDate == Long.MIN_VALUE) {
			dossierActionImpl.setDueDate(null);
		}
		else {
			dossierActionImpl.setDueDate(new Date(dueDate));
		}

		dossierActionImpl.setNextActionId(nextActionId);

		if (payload == null) {
			dossierActionImpl.setPayload(StringPool.BLANK);
		}
		else {
			dossierActionImpl.setPayload(payload);
		}

		if (stepInstruction == null) {
			dossierActionImpl.setStepInstruction(StringPool.BLANK);
		}
		else {
			dossierActionImpl.setStepInstruction(stepInstruction);
		}

		dossierActionImpl.resetOriginalValues();

		return dossierActionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		dossierActionId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		dossierId = objectInput.readLong();

		serviceProcessId = objectInput.readLong();

		previousActionId = objectInput.readLong();
		actionCode = objectInput.readUTF();
		actionUser = objectInput.readUTF();
		actionName = objectInput.readUTF();
		actionNote = objectInput.readUTF();

		actionOverdue = objectInput.readInt();
		syncActionCode = objectInput.readUTF();

		pending = objectInput.readBoolean();

		rollbackable = objectInput.readBoolean();
		stepCode = objectInput.readUTF();
		stepName = objectInput.readUTF();
		dueDate = objectInput.readLong();

		nextActionId = objectInput.readLong();
		payload = objectInput.readUTF();
		stepInstruction = objectInput.readUTF();
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

		objectOutput.writeLong(dossierActionId);

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

		objectOutput.writeLong(serviceProcessId);

		objectOutput.writeLong(previousActionId);

		if (actionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actionCode);
		}

		if (actionUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actionUser);
		}

		if (actionName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actionName);
		}

		if (actionNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actionNote);
		}

		objectOutput.writeInt(actionOverdue);

		if (syncActionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(syncActionCode);
		}

		objectOutput.writeBoolean(pending);

		objectOutput.writeBoolean(rollbackable);

		if (stepCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stepCode);
		}

		if (stepName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stepName);
		}

		objectOutput.writeLong(dueDate);

		objectOutput.writeLong(nextActionId);

		if (payload == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(payload);
		}

		if (stepInstruction == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stepInstruction);
		}
	}

	public String uuid;
	public long dossierActionId;
	public long companyId;
	public long groupId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dossierId;
	public long serviceProcessId;
	public long previousActionId;
	public String actionCode;
	public String actionUser;
	public String actionName;
	public String actionNote;
	public int actionOverdue;
	public String syncActionCode;
	public boolean pending;
	public boolean rollbackable;
	public String stepCode;
	public String stepName;
	public long dueDate;
	public long nextActionId;
	public String payload;
	public String stepInstruction;
}