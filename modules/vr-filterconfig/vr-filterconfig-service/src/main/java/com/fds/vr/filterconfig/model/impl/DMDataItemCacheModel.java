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

package com.fds.vr.filterconfig.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.filterconfig.model.DMDataItem;

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
 * The cache model class for representing DMDataItem in entity cache.
 *
 * @author NhanHoang
 * @see DMDataItem
 * @generated
 */
@ProviderType
public class DMDataItemCacheModel implements CacheModel<DMDataItem>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DMDataItemCacheModel)) {
			return false;
		}

		DMDataItemCacheModel dmDataItemCacheModel = (DMDataItemCacheModel)obj;

		if (id == dmDataItemCacheModel.id) {
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
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", dataGroupId=");
		sb.append(dataGroupId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", altername=");
		sb.append(altername);
		sb.append(", description=");
		sb.append(description);
		sb.append(", validatedFrom=");
		sb.append(validatedFrom);
		sb.append(", validatedTo=");
		sb.append(validatedTo);
		sb.append(", status=");
		sb.append(status);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DMDataItem toEntityModel() {
		DMDataItemImpl dmDataItemImpl = new DMDataItemImpl();

		dmDataItemImpl.setId(id);
		dmDataItemImpl.setDataGroupId(dataGroupId);

		if (code_0 == null) {
			dmDataItemImpl.setCode_0(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setCode_0(code_0);
		}

		if (code_1 == null) {
			dmDataItemImpl.setCode_1(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setCode_1(code_1);
		}

		if (code_2 == null) {
			dmDataItemImpl.setCode_2(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setCode_2(code_2);
		}

		if (code_3 == null) {
			dmDataItemImpl.setCode_3(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setCode_3(code_3);
		}

		dmDataItemImpl.setLevel(level);

		if (name == null) {
			dmDataItemImpl.setName(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setName(name);
		}

		if (altername == null) {
			dmDataItemImpl.setAltername(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setAltername(altername);
		}

		if (description == null) {
			dmDataItemImpl.setDescription(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setDescription(description);
		}

		if (validatedFrom == Long.MIN_VALUE) {
			dmDataItemImpl.setValidatedFrom(null);
		}
		else {
			dmDataItemImpl.setValidatedFrom(new Date(validatedFrom));
		}

		if (validatedTo == Long.MIN_VALUE) {
			dmDataItemImpl.setValidatedTo(null);
		}
		else {
			dmDataItemImpl.setValidatedTo(new Date(validatedTo));
		}

		dmDataItemImpl.setStatus(status);

		if (syncDate == Long.MIN_VALUE) {
			dmDataItemImpl.setSyncDate(null);
		}
		else {
			dmDataItemImpl.setSyncDate(new Date(syncDate));
		}

		dmDataItemImpl.resetOriginalValues();

		return dmDataItemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		dataGroupId = objectInput.readLong();
		code_0 = objectInput.readUTF();
		code_1 = objectInput.readUTF();
		code_2 = objectInput.readUTF();
		code_3 = objectInput.readUTF();

		level = objectInput.readInt();
		name = objectInput.readUTF();
		altername = objectInput.readUTF();
		description = objectInput.readUTF();
		validatedFrom = objectInput.readLong();
		validatedTo = objectInput.readLong();

		status = objectInput.readInt();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(dataGroupId);

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

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (altername == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(altername);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(validatedFrom);
		objectOutput.writeLong(validatedTo);

		objectOutput.writeInt(status);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long dataGroupId;
	public String code_0;
	public String code_1;
	public String code_2;
	public String code_3;
	public int level;
	public String name;
	public String altername;
	public String description;
	public long validatedFrom;
	public long validatedTo;
	public int status;
	public long syncDate;
}