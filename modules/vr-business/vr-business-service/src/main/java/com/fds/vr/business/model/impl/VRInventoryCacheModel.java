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

import com.fds.vr.business.model.VRInventory;

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
 * The cache model class for representing VRInventory in entity cache.
 *
 * @author LamTV
 * @see VRInventory
 * @generated
 */
@ProviderType
public class VRInventoryCacheModel implements CacheModel<VRInventory>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRInventoryCacheModel)) {
			return false;
		}

		VRInventoryCacheModel vrInventoryCacheModel = (VRInventoryCacheModel)obj;

		if (id == vrInventoryCacheModel.id) {
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
		StringBundler sb = new StringBundler(41);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", yearofPeriod=");
		sb.append(yearofPeriod);
		sb.append(", previousPeriod=");
		sb.append(previousPeriod);
		sb.append(", previousPeriodCode=");
		sb.append(previousPeriodCode);
		sb.append(", bookId=");
		sb.append(bookId);
		sb.append(", vehicleClass=");
		sb.append(vehicleClass);
		sb.append(", stampType=");
		sb.append(stampType);
		sb.append(", stampShortNo=");
		sb.append(stampShortNo);
		sb.append(", serialStartNo=");
		sb.append(serialStartNo);
		sb.append(", serialEndNo=");
		sb.append(serialEndNo);
		sb.append(", totalQuantities=");
		sb.append(totalQuantities);
		sb.append(", totalInUse=");
		sb.append(totalInUse);
		sb.append(", totalNotUsed=");
		sb.append(totalNotUsed);
		sb.append(", remark=");
		sb.append(remark);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", checkType=");
		sb.append(checkType);
		sb.append(", checkStatus=");
		sb.append(checkStatus);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRInventory toEntityModel() {
		VRInventoryImpl vrInventoryImpl = new VRInventoryImpl();

		vrInventoryImpl.setId(id);
		vrInventoryImpl.setMtCore(mtCore);
		vrInventoryImpl.setYearofPeriod(yearofPeriod);

		if (previousPeriod == null) {
			vrInventoryImpl.setPreviousPeriod(StringPool.BLANK);
		}
		else {
			vrInventoryImpl.setPreviousPeriod(previousPeriod);
		}

		if (previousPeriodCode == null) {
			vrInventoryImpl.setPreviousPeriodCode(StringPool.BLANK);
		}
		else {
			vrInventoryImpl.setPreviousPeriodCode(previousPeriodCode);
		}

		vrInventoryImpl.setBookId(bookId);

		if (vehicleClass == null) {
			vrInventoryImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vrInventoryImpl.setVehicleClass(vehicleClass);
		}

		if (stampType == null) {
			vrInventoryImpl.setStampType(StringPool.BLANK);
		}
		else {
			vrInventoryImpl.setStampType(stampType);
		}

		if (stampShortNo == null) {
			vrInventoryImpl.setStampShortNo(StringPool.BLANK);
		}
		else {
			vrInventoryImpl.setStampShortNo(stampShortNo);
		}

		vrInventoryImpl.setSerialStartNo(serialStartNo);
		vrInventoryImpl.setSerialEndNo(serialEndNo);
		vrInventoryImpl.setTotalQuantities(totalQuantities);
		vrInventoryImpl.setTotalInUse(totalInUse);
		vrInventoryImpl.setTotalNotUsed(totalNotUsed);

		if (remark == null) {
			vrInventoryImpl.setRemark(StringPool.BLANK);
		}
		else {
			vrInventoryImpl.setRemark(remark);
		}

		vrInventoryImpl.setCorporationId(corporationId);
		vrInventoryImpl.setCheckType(checkType);
		vrInventoryImpl.setCheckStatus(checkStatus);

		if (modifyDate == Long.MIN_VALUE) {
			vrInventoryImpl.setModifyDate(null);
		}
		else {
			vrInventoryImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrInventoryImpl.setSyncDate(null);
		}
		else {
			vrInventoryImpl.setSyncDate(new Date(syncDate));
		}

		vrInventoryImpl.resetOriginalValues();

		return vrInventoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		yearofPeriod = objectInput.readLong();
		previousPeriod = objectInput.readUTF();
		previousPeriodCode = objectInput.readUTF();

		bookId = objectInput.readLong();
		vehicleClass = objectInput.readUTF();
		stampType = objectInput.readUTF();
		stampShortNo = objectInput.readUTF();

		serialStartNo = objectInput.readLong();

		serialEndNo = objectInput.readLong();

		totalQuantities = objectInput.readLong();

		totalInUse = objectInput.readLong();

		totalNotUsed = objectInput.readLong();
		remark = objectInput.readUTF();

		corporationId = objectInput.readLong();

		checkType = objectInput.readLong();

		checkStatus = objectInput.readLong();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(yearofPeriod);

		if (previousPeriod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(previousPeriod);
		}

		if (previousPeriodCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(previousPeriodCode);
		}

		objectOutput.writeLong(bookId);

		if (vehicleClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleClass);
		}

		if (stampType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stampType);
		}

		if (stampShortNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stampShortNo);
		}

		objectOutput.writeLong(serialStartNo);

		objectOutput.writeLong(serialEndNo);

		objectOutput.writeLong(totalQuantities);

		objectOutput.writeLong(totalInUse);

		objectOutput.writeLong(totalNotUsed);

		if (remark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remark);
		}

		objectOutput.writeLong(corporationId);

		objectOutput.writeLong(checkType);

		objectOutput.writeLong(checkStatus);
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public long yearofPeriod;
	public String previousPeriod;
	public String previousPeriodCode;
	public long bookId;
	public String vehicleClass;
	public String stampType;
	public String stampShortNo;
	public long serialStartNo;
	public long serialEndNo;
	public long totalQuantities;
	public long totalInUse;
	public long totalNotUsed;
	public String remark;
	public long corporationId;
	public long checkType;
	public long checkStatus;
	public long modifyDate;
	public long syncDate;
}