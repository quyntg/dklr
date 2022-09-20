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

import com.fds.vr.business.model.VRTemplateNo;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VRTemplateNo in entity cache.
 *
 * @author LamTV
 * @see VRTemplateNo
 * @generated
 */
@ProviderType
public class VRTemplateNoCacheModel implements CacheModel<VRTemplateNo>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTemplateNoCacheModel)) {
			return false;
		}

		VRTemplateNoCacheModel vrTemplateNoCacheModel = (VRTemplateNoCacheModel)obj;

		if (id == vrTemplateNoCacheModel.id) {
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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", patternNo=");
		sb.append(patternNo);
		sb.append(", year=");
		sb.append(year);
		sb.append(", initNumber=");
		sb.append(initNumber);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTemplateNo toEntityModel() {
		VRTemplateNoImpl vrTemplateNoImpl = new VRTemplateNoImpl();

		vrTemplateNoImpl.setId(id);

		if (patternNo == null) {
			vrTemplateNoImpl.setPatternNo(StringPool.BLANK);
		}
		else {
			vrTemplateNoImpl.setPatternNo(patternNo);
		}

		vrTemplateNoImpl.setYear(year);
		vrTemplateNoImpl.setInitNumber(initNumber);

		vrTemplateNoImpl.resetOriginalValues();

		return vrTemplateNoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		patternNo = objectInput.readUTF();

		year = objectInput.readInt();

		initNumber = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (patternNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(patternNo);
		}

		objectOutput.writeInt(year);

		objectOutput.writeInt(initNumber);
	}

	public long id;
	public String patternNo;
	public int year;
	public int initNumber;
}