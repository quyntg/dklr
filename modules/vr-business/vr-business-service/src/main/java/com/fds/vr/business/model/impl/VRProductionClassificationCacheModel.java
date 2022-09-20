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

import com.fds.vr.business.model.VRProductionClassification;

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
 * The cache model class for representing VRProductionClassification in entity cache.
 *
 * @author LamTV
 * @see VRProductionClassification
 * @generated
 */
@ProviderType
public class VRProductionClassificationCacheModel implements CacheModel<VRProductionClassification>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductionClassificationCacheModel)) {
			return false;
		}

		VRProductionClassificationCacheModel vrProductionClassificationCacheModel =
			(VRProductionClassificationCacheModel)obj;

		if (id == vrProductionClassificationCacheModel.id) {
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
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", applicantProfileId=");
		sb.append(applicantProfileId);
		sb.append(", applicantCode=");
		sb.append(applicantCode);
		sb.append(", productionPlantId=");
		sb.append(productionPlantId);
		sb.append(", productionPlantCode=");
		sb.append(productionPlantCode);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", productClassificationCode=");
		sb.append(productClassificationCode);
		sb.append(", productClassificationDescription=");
		sb.append(productClassificationDescription);
		sb.append(", classificationMode=");
		sb.append(classificationMode);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", status=");
		sb.append(status);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRProductionClassification toEntityModel() {
		VRProductionClassificationImpl vrProductionClassificationImpl = new VRProductionClassificationImpl();

		vrProductionClassificationImpl.setId(id);
		vrProductionClassificationImpl.setMtCore(mtCore);
		vrProductionClassificationImpl.setApplicantProfileId(applicantProfileId);

		if (applicantCode == null) {
			vrProductionClassificationImpl.setApplicantCode(StringPool.BLANK);
		}
		else {
			vrProductionClassificationImpl.setApplicantCode(applicantCode);
		}

		vrProductionClassificationImpl.setProductionPlantId(productionPlantId);

		if (productionPlantCode == null) {
			vrProductionClassificationImpl.setProductionPlantCode(StringPool.BLANK);
		}
		else {
			vrProductionClassificationImpl.setProductionPlantCode(productionPlantCode);
		}

		vrProductionClassificationImpl.setSequenceNo(sequenceNo);

		if (productClassificationCode == null) {
			vrProductionClassificationImpl.setProductClassificationCode(StringPool.BLANK);
		}
		else {
			vrProductionClassificationImpl.setProductClassificationCode(productClassificationCode);
		}

		if (productClassificationDescription == null) {
			vrProductionClassificationImpl.setProductClassificationDescription(StringPool.BLANK);
		}
		else {
			vrProductionClassificationImpl.setProductClassificationDescription(productClassificationDescription);
		}

		if (classificationMode == null) {
			vrProductionClassificationImpl.setClassificationMode(StringPool.BLANK);
		}
		else {
			vrProductionClassificationImpl.setClassificationMode(classificationMode);
		}

		if (remarks == null) {
			vrProductionClassificationImpl.setRemarks(StringPool.BLANK);
		}
		else {
			vrProductionClassificationImpl.setRemarks(remarks);
		}

		if (status == null) {
			vrProductionClassificationImpl.setStatus(StringPool.BLANK);
		}
		else {
			vrProductionClassificationImpl.setStatus(status);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrProductionClassificationImpl.setModifyDate(null);
		}
		else {
			vrProductionClassificationImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrProductionClassificationImpl.setSyncDate(null);
		}
		else {
			vrProductionClassificationImpl.setSyncDate(new Date(syncDate));
		}

		vrProductionClassificationImpl.resetOriginalValues();

		return vrProductionClassificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		applicantProfileId = objectInput.readLong();
		applicantCode = objectInput.readUTF();

		productionPlantId = objectInput.readLong();
		productionPlantCode = objectInput.readUTF();

		sequenceNo = objectInput.readInt();
		productClassificationCode = objectInput.readUTF();
		productClassificationDescription = objectInput.readUTF();
		classificationMode = objectInput.readUTF();
		remarks = objectInput.readUTF();
		status = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(applicantProfileId);

		if (applicantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantCode);
		}

		objectOutput.writeLong(productionPlantId);

		if (productionPlantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantCode);
		}

		objectOutput.writeInt(sequenceNo);

		if (productClassificationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productClassificationCode);
		}

		if (productClassificationDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productClassificationDescription);
		}

		if (classificationMode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(classificationMode);
		}

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public long applicantProfileId;
	public String applicantCode;
	public long productionPlantId;
	public String productionPlantCode;
	public int sequenceNo;
	public String productClassificationCode;
	public String productClassificationDescription;
	public String classificationMode;
	public String remarks;
	public String status;
	public long modifyDate;
	public long syncDate;
}