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

import com.fds.vr.business.model.VRCorporationInspector;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VRCorporationInspector in entity cache.
 *
 * @author LamTV
 * @see VRCorporationInspector
 * @generated
 */
@ProviderType
public class VRCorporationInspectorCacheModel implements CacheModel<VRCorporationInspector>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCorporationInspectorCacheModel)) {
			return false;
		}

		VRCorporationInspectorCacheModel vrCorporationInspectorCacheModel = (VRCorporationInspectorCacheModel)obj;

		if (id == vrCorporationInspectorCacheModel.id) {
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
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", inspectorid=");
		sb.append(inspectorid);
		sb.append(", inspectorName=");
		sb.append(inspectorName);
		sb.append(", inspectorPhone=");
		sb.append(inspectorPhone);
		sb.append(", inspectorEmail=");
		sb.append(inspectorEmail);
		sb.append(", contactcode=");
		sb.append(contactcode);
		sb.append(", regularTthc=");
		sb.append(regularTthc);
		sb.append(", searchVehicle=");
		sb.append(searchVehicle);
		sb.append(", teamId=");
		sb.append(teamId);
		sb.append(", markupTeamLeader=");
		sb.append(markupTeamLeader);
		sb.append(", markUpBoss=");
		sb.append(markUpBoss);
		sb.append(", executedictionary=");
		sb.append(executedictionary);
		sb.append(", place=");
		sb.append(place);
		sb.append(", title=");
		sb.append(title);
		sb.append(", filechukyId=");
		sb.append(filechukyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCorporationInspector toEntityModel() {
		VRCorporationInspectorImpl vrCorporationInspectorImpl = new VRCorporationInspectorImpl();

		vrCorporationInspectorImpl.setId(id);
		vrCorporationInspectorImpl.setMtCore(mtCore);

		if (corporationId == null) {
			vrCorporationInspectorImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			vrCorporationInspectorImpl.setCorporationId(corporationId);
		}

		vrCorporationInspectorImpl.setInspectorid(inspectorid);

		if (inspectorName == null) {
			vrCorporationInspectorImpl.setInspectorName(StringPool.BLANK);
		}
		else {
			vrCorporationInspectorImpl.setInspectorName(inspectorName);
		}

		if (inspectorPhone == null) {
			vrCorporationInspectorImpl.setInspectorPhone(StringPool.BLANK);
		}
		else {
			vrCorporationInspectorImpl.setInspectorPhone(inspectorPhone);
		}

		if (inspectorEmail == null) {
			vrCorporationInspectorImpl.setInspectorEmail(StringPool.BLANK);
		}
		else {
			vrCorporationInspectorImpl.setInspectorEmail(inspectorEmail);
		}

		if (contactcode == null) {
			vrCorporationInspectorImpl.setContactcode(StringPool.BLANK);
		}
		else {
			vrCorporationInspectorImpl.setContactcode(contactcode);
		}

		vrCorporationInspectorImpl.setRegularTthc(regularTthc);
		vrCorporationInspectorImpl.setSearchVehicle(searchVehicle);
		vrCorporationInspectorImpl.setTeamId(teamId);
		vrCorporationInspectorImpl.setMarkupTeamLeader(markupTeamLeader);
		vrCorporationInspectorImpl.setMarkUpBoss(markUpBoss);

		if (executedictionary == null) {
			vrCorporationInspectorImpl.setExecutedictionary(StringPool.BLANK);
		}
		else {
			vrCorporationInspectorImpl.setExecutedictionary(executedictionary);
		}

		if (place == null) {
			vrCorporationInspectorImpl.setPlace(StringPool.BLANK);
		}
		else {
			vrCorporationInspectorImpl.setPlace(place);
		}

		if (title == null) {
			vrCorporationInspectorImpl.setTitle(StringPool.BLANK);
		}
		else {
			vrCorporationInspectorImpl.setTitle(title);
		}

		vrCorporationInspectorImpl.setFilechukyId(filechukyId);

		vrCorporationInspectorImpl.resetOriginalValues();

		return vrCorporationInspectorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();
		corporationId = objectInput.readUTF();

		inspectorid = objectInput.readLong();
		inspectorName = objectInput.readUTF();
		inspectorPhone = objectInput.readUTF();
		inspectorEmail = objectInput.readUTF();
		contactcode = objectInput.readUTF();

		regularTthc = objectInput.readLong();

		searchVehicle = objectInput.readInt();

		teamId = objectInput.readLong();

		markupTeamLeader = objectInput.readInt();

		markUpBoss = objectInput.readInt();
		executedictionary = objectInput.readUTF();
		place = objectInput.readUTF();
		title = objectInput.readUTF();

		filechukyId = objectInput.readLong();
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

		objectOutput.writeLong(inspectorid);

		if (inspectorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorName);
		}

		if (inspectorPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorPhone);
		}

		if (inspectorEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorEmail);
		}

		if (contactcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactcode);
		}

		objectOutput.writeLong(regularTthc);

		objectOutput.writeInt(searchVehicle);

		objectOutput.writeLong(teamId);

		objectOutput.writeInt(markupTeamLeader);

		objectOutput.writeInt(markUpBoss);

		if (executedictionary == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(executedictionary);
		}

		if (place == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(place);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		objectOutput.writeLong(filechukyId);
	}

	public long id;
	public long mtCore;
	public String corporationId;
	public long inspectorid;
	public String inspectorName;
	public String inspectorPhone;
	public String inspectorEmail;
	public String contactcode;
	public long regularTthc;
	public int searchVehicle;
	public long teamId;
	public int markupTeamLeader;
	public int markUpBoss;
	public String executedictionary;
	public String place;
	public String title;
	public long filechukyId;
}