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

import com.fds.vr.business.model.VRActionconfig;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VRActionconfig in entity cache.
 *
 * @author LamTV
 * @see VRActionconfig
 * @generated
 */
@ProviderType
public class VRActionconfigCacheModel implements CacheModel<VRActionconfig>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRActionconfigCacheModel)) {
			return false;
		}

		VRActionconfigCacheModel vrActionconfigCacheModel = (VRActionconfigCacheModel)obj;

		if (id == vrActionconfigCacheModel.id) {
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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", actionCode=");
		sb.append(actionCode);
		sb.append(", processNo=");
		sb.append(processNo);
		sb.append(", status=");
		sb.append(status);
		sb.append(", vehicleClass=");
		sb.append(vehicleClass);
		sb.append(", fileTemplateNoBB=");
		sb.append(fileTemplateNoBB);
		sb.append(", fileTemplateNoCC=");
		sb.append(fileTemplateNoCC);
		sb.append(", deliverableCode=");
		sb.append(deliverableCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRActionconfig toEntityModel() {
		VRActionconfigImpl vrActionconfigImpl = new VRActionconfigImpl();

		vrActionconfigImpl.setId(id);

		if (actionCode == null) {
			vrActionconfigImpl.setActionCode(StringPool.BLANK);
		}
		else {
			vrActionconfigImpl.setActionCode(actionCode);
		}

		if (processNo == null) {
			vrActionconfigImpl.setProcessNo(StringPool.BLANK);
		}
		else {
			vrActionconfigImpl.setProcessNo(processNo);
		}

		vrActionconfigImpl.setStatus(status);

		if (vehicleClass == null) {
			vrActionconfigImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vrActionconfigImpl.setVehicleClass(vehicleClass);
		}

		if (fileTemplateNoBB == null) {
			vrActionconfigImpl.setFileTemplateNoBB(StringPool.BLANK);
		}
		else {
			vrActionconfigImpl.setFileTemplateNoBB(fileTemplateNoBB);
		}

		if (fileTemplateNoCC == null) {
			vrActionconfigImpl.setFileTemplateNoCC(StringPool.BLANK);
		}
		else {
			vrActionconfigImpl.setFileTemplateNoCC(fileTemplateNoCC);
		}

		if (deliverableCode == null) {
			vrActionconfigImpl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrActionconfigImpl.setDeliverableCode(deliverableCode);
		}

		vrActionconfigImpl.resetOriginalValues();

		return vrActionconfigImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		actionCode = objectInput.readUTF();
		processNo = objectInput.readUTF();

		status = objectInput.readInt();
		vehicleClass = objectInput.readUTF();
		fileTemplateNoBB = objectInput.readUTF();
		fileTemplateNoCC = objectInput.readUTF();
		deliverableCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (actionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actionCode);
		}

		if (processNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(processNo);
		}

		objectOutput.writeInt(status);

		if (vehicleClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleClass);
		}

		if (fileTemplateNoBB == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileTemplateNoBB);
		}

		if (fileTemplateNoCC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileTemplateNoCC);
		}

		if (deliverableCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(deliverableCode);
		}
	}

	public long id;
	public String actionCode;
	public String processNo;
	public int status;
	public String vehicleClass;
	public String fileTemplateNoBB;
	public String fileTemplateNoCC;
	public String deliverableCode;
}