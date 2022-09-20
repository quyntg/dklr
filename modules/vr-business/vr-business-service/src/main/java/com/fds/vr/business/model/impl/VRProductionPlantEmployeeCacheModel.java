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

import com.fds.vr.business.model.VRProductionPlantEmployee;

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
 * The cache model class for representing VRProductionPlantEmployee in entity cache.
 *
 * @author LamTV
 * @see VRProductionPlantEmployee
 * @generated
 */
@ProviderType
public class VRProductionPlantEmployeeCacheModel implements CacheModel<VRProductionPlantEmployee>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductionPlantEmployeeCacheModel)) {
			return false;
		}

		VRProductionPlantEmployeeCacheModel vrProductionPlantEmployeeCacheModel = (VRProductionPlantEmployeeCacheModel)obj;

		if (id == vrProductionPlantEmployeeCacheModel.id) {
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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", employeeName=");
		sb.append(employeeName);
		sb.append(", employeeCertificateNo=");
		sb.append(employeeCertificateNo);
		sb.append(", trainningAt=");
		sb.append(trainningAt);
		sb.append(", workingPosition=");
		sb.append(workingPosition);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append(", productionPlantCode=");
		sb.append(productionPlantCode);
		sb.append(", productionPlantId=");
		sb.append(productionPlantId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRProductionPlantEmployee toEntityModel() {
		VRProductionPlantEmployeeImpl vrProductionPlantEmployeeImpl = new VRProductionPlantEmployeeImpl();

		vrProductionPlantEmployeeImpl.setId(id);
		vrProductionPlantEmployeeImpl.setMtCore(mtCore);
		vrProductionPlantEmployeeImpl.setSequenceNo(sequenceNo);

		if (employeeName == null) {
			vrProductionPlantEmployeeImpl.setEmployeeName(StringPool.BLANK);
		}
		else {
			vrProductionPlantEmployeeImpl.setEmployeeName(employeeName);
		}

		if (employeeCertificateNo == null) {
			vrProductionPlantEmployeeImpl.setEmployeeCertificateNo(StringPool.BLANK);
		}
		else {
			vrProductionPlantEmployeeImpl.setEmployeeCertificateNo(employeeCertificateNo);
		}

		if (trainningAt == null) {
			vrProductionPlantEmployeeImpl.setTrainningAt(StringPool.BLANK);
		}
		else {
			vrProductionPlantEmployeeImpl.setTrainningAt(trainningAt);
		}

		if (workingPosition == null) {
			vrProductionPlantEmployeeImpl.setWorkingPosition(StringPool.BLANK);
		}
		else {
			vrProductionPlantEmployeeImpl.setWorkingPosition(workingPosition);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrProductionPlantEmployeeImpl.setModifyDate(null);
		}
		else {
			vrProductionPlantEmployeeImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrProductionPlantEmployeeImpl.setSyncDate(null);
		}
		else {
			vrProductionPlantEmployeeImpl.setSyncDate(new Date(syncDate));
		}

		if (productionPlantCode == null) {
			vrProductionPlantEmployeeImpl.setProductionPlantCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantEmployeeImpl.setProductionPlantCode(productionPlantCode);
		}

		vrProductionPlantEmployeeImpl.setProductionPlantId(productionPlantId);

		vrProductionPlantEmployeeImpl.resetOriginalValues();

		return vrProductionPlantEmployeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		sequenceNo = objectInput.readLong();
		employeeName = objectInput.readUTF();
		employeeCertificateNo = objectInput.readUTF();
		trainningAt = objectInput.readUTF();
		workingPosition = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
		productionPlantCode = objectInput.readUTF();

		productionPlantId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(sequenceNo);

		if (employeeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeName);
		}

		if (employeeCertificateNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeCertificateNo);
		}

		if (trainningAt == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trainningAt);
		}

		if (workingPosition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(workingPosition);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);

		if (productionPlantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantCode);
		}

		objectOutput.writeLong(productionPlantId);
	}

	public long id;
	public long mtCore;
	public long sequenceNo;
	public String employeeName;
	public String employeeCertificateNo;
	public String trainningAt;
	public String workingPosition;
	public long modifyDate;
	public long syncDate;
	public String productionPlantCode;
	public long productionPlantId;
}