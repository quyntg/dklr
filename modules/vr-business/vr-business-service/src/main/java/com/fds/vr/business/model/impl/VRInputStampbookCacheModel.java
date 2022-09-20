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

import com.fds.vr.business.model.VRInputStampbook;

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
 * The cache model class for representing VRInputStampbook in entity cache.
 *
 * @author LamTV
 * @see VRInputStampbook
 * @generated
 */
@ProviderType
public class VRInputStampbookCacheModel implements CacheModel<VRInputStampbook>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRInputStampbookCacheModel)) {
			return false;
		}

		VRInputStampbookCacheModel vrInputStampbookCacheModel = (VRInputStampbookCacheModel)obj;

		if (id == vrInputStampbookCacheModel.id) {
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
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", inputSheetId=");
		sb.append(inputSheetId);
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
		sb.append(", subTotalInDocument=");
		sb.append(subTotalInDocument);
		sb.append(", subTotalQuantities=");
		sb.append(subTotalQuantities);
		sb.append(", units=");
		sb.append(units);
		sb.append(", unitPrice=");
		sb.append(unitPrice);
		sb.append(", totalAmount=");
		sb.append(totalAmount);
		sb.append(", totalInUse=");
		sb.append(totalInUse);
		sb.append(", totalNotUsed=");
		sb.append(totalNotUsed);
		sb.append(", sum1=");
		sb.append(sum1);
		sb.append(", sum2=");
		sb.append(sum2);
		sb.append(", sum3=");
		sb.append(sum3);
		sb.append(", remark=");
		sb.append(remark);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRInputStampbook toEntityModel() {
		VRInputStampbookImpl vrInputStampbookImpl = new VRInputStampbookImpl();

		vrInputStampbookImpl.setId(id);
		vrInputStampbookImpl.setMtCore(mtCore);
		vrInputStampbookImpl.setInputSheetId(inputSheetId);
		vrInputStampbookImpl.setBookId(bookId);

		if (vehicleClass == null) {
			vrInputStampbookImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vrInputStampbookImpl.setVehicleClass(vehicleClass);
		}

		if (stampType == null) {
			vrInputStampbookImpl.setStampType(StringPool.BLANK);
		}
		else {
			vrInputStampbookImpl.setStampType(stampType);
		}

		if (stampShortNo == null) {
			vrInputStampbookImpl.setStampShortNo(StringPool.BLANK);
		}
		else {
			vrInputStampbookImpl.setStampShortNo(stampShortNo);
		}

		vrInputStampbookImpl.setSerialStartNo(serialStartNo);
		vrInputStampbookImpl.setSerialEndNo(serialEndNo);
		vrInputStampbookImpl.setSubTotalInDocument(subTotalInDocument);
		vrInputStampbookImpl.setSubTotalQuantities(subTotalQuantities);
		vrInputStampbookImpl.setUnits(units);
		vrInputStampbookImpl.setUnitPrice(unitPrice);
		vrInputStampbookImpl.setTotalAmount(totalAmount);
		vrInputStampbookImpl.setTotalInUse(totalInUse);
		vrInputStampbookImpl.setTotalNotUsed(totalNotUsed);
		vrInputStampbookImpl.setSum1(sum1);
		vrInputStampbookImpl.setSum2(sum2);
		vrInputStampbookImpl.setSum3(sum3);

		if (remark == null) {
			vrInputStampbookImpl.setRemark(StringPool.BLANK);
		}
		else {
			vrInputStampbookImpl.setRemark(remark);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrInputStampbookImpl.setModifyDate(null);
		}
		else {
			vrInputStampbookImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrInputStampbookImpl.setSyncDate(null);
		}
		else {
			vrInputStampbookImpl.setSyncDate(new Date(syncDate));
		}

		vrInputStampbookImpl.resetOriginalValues();

		return vrInputStampbookImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		inputSheetId = objectInput.readLong();

		bookId = objectInput.readLong();
		vehicleClass = objectInput.readUTF();
		stampType = objectInput.readUTF();
		stampShortNo = objectInput.readUTF();

		serialStartNo = objectInput.readLong();

		serialEndNo = objectInput.readLong();

		subTotalInDocument = objectInput.readLong();

		subTotalQuantities = objectInput.readLong();

		units = objectInput.readLong();

		unitPrice = objectInput.readLong();

		totalAmount = objectInput.readLong();

		totalInUse = objectInput.readLong();

		totalNotUsed = objectInput.readLong();

		sum1 = objectInput.readLong();

		sum2 = objectInput.readLong();

		sum3 = objectInput.readLong();
		remark = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(inputSheetId);

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

		objectOutput.writeLong(subTotalInDocument);

		objectOutput.writeLong(subTotalQuantities);

		objectOutput.writeLong(units);

		objectOutput.writeLong(unitPrice);

		objectOutput.writeLong(totalAmount);

		objectOutput.writeLong(totalInUse);

		objectOutput.writeLong(totalNotUsed);

		objectOutput.writeLong(sum1);

		objectOutput.writeLong(sum2);

		objectOutput.writeLong(sum3);

		if (remark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remark);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public long inputSheetId;
	public long bookId;
	public String vehicleClass;
	public String stampType;
	public String stampShortNo;
	public long serialStartNo;
	public long serialEndNo;
	public long subTotalInDocument;
	public long subTotalQuantities;
	public long units;
	public long unitPrice;
	public long totalAmount;
	public long totalInUse;
	public long totalNotUsed;
	public long sum1;
	public long sum2;
	public long sum3;
	public String remark;
	public long modifyDate;
	public long syncDate;
}