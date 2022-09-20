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

import com.fds.vr.business.model.VRClearingStampbook;

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
 * The cache model class for representing VRClearingStampbook in entity cache.
 *
 * @author LamTV
 * @see VRClearingStampbook
 * @generated
 */
@ProviderType
public class VRClearingStampbookCacheModel implements CacheModel<VRClearingStampbook>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRClearingStampbookCacheModel)) {
			return false;
		}

		VRClearingStampbookCacheModel vrClearingStampbookCacheModel = (VRClearingStampbookCacheModel)obj;

		if (id == vrClearingStampbookCacheModel.id) {
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
		StringBundler sb = new StringBundler(55);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", debitNoteId=");
		sb.append(debitNoteId);
		sb.append(", inputSheetId=");
		sb.append(inputSheetId);
		sb.append(", outputSheetId=");
		sb.append(outputSheetId);
		sb.append(", bookId=");
		sb.append(bookId);
		sb.append(", certificateId=");
		sb.append(certificateId);
		sb.append(", certificateNumber=");
		sb.append(certificateNumber);
		sb.append(", certificateDate=");
		sb.append(certificateDate);
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
		sb.append(", vehiclePrice=");
		sb.append(vehiclePrice);
		sb.append(", unitPrice=");
		sb.append(unitPrice);
		sb.append(", totalAmount=");
		sb.append(totalAmount);
		sb.append(", totalInUse=");
		sb.append(totalInUse);
		sb.append(", totalNotUsed=");
		sb.append(totalNotUsed);
		sb.append(", totalLost=");
		sb.append(totalLost);
		sb.append(", totalCancelled=");
		sb.append(totalCancelled);
		sb.append(", totalReturned=");
		sb.append(totalReturned);
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
	public VRClearingStampbook toEntityModel() {
		VRClearingStampbookImpl vrClearingStampbookImpl = new VRClearingStampbookImpl();

		vrClearingStampbookImpl.setId(id);
		vrClearingStampbookImpl.setMtCore(mtCore);
		vrClearingStampbookImpl.setDebitNoteId(debitNoteId);
		vrClearingStampbookImpl.setInputSheetId(inputSheetId);
		vrClearingStampbookImpl.setOutputSheetId(outputSheetId);
		vrClearingStampbookImpl.setBookId(bookId);
		vrClearingStampbookImpl.setCertificateId(certificateId);

		if (certificateNumber == null) {
			vrClearingStampbookImpl.setCertificateNumber(StringPool.BLANK);
		}
		else {
			vrClearingStampbookImpl.setCertificateNumber(certificateNumber);
		}

		if (certificateDate == Long.MIN_VALUE) {
			vrClearingStampbookImpl.setCertificateDate(null);
		}
		else {
			vrClearingStampbookImpl.setCertificateDate(new Date(certificateDate));
		}

		if (vehicleClass == null) {
			vrClearingStampbookImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vrClearingStampbookImpl.setVehicleClass(vehicleClass);
		}

		if (stampType == null) {
			vrClearingStampbookImpl.setStampType(StringPool.BLANK);
		}
		else {
			vrClearingStampbookImpl.setStampType(stampType);
		}

		if (stampShortNo == null) {
			vrClearingStampbookImpl.setStampShortNo(StringPool.BLANK);
		}
		else {
			vrClearingStampbookImpl.setStampShortNo(stampShortNo);
		}

		vrClearingStampbookImpl.setSerialStartNo(serialStartNo);
		vrClearingStampbookImpl.setSerialEndNo(serialEndNo);
		vrClearingStampbookImpl.setSubTotalInDocument(subTotalInDocument);
		vrClearingStampbookImpl.setSubTotalQuantities(subTotalQuantities);
		vrClearingStampbookImpl.setVehiclePrice(vehiclePrice);
		vrClearingStampbookImpl.setUnitPrice(unitPrice);
		vrClearingStampbookImpl.setTotalAmount(totalAmount);
		vrClearingStampbookImpl.setTotalInUse(totalInUse);
		vrClearingStampbookImpl.setTotalNotUsed(totalNotUsed);
		vrClearingStampbookImpl.setTotalLost(totalLost);
		vrClearingStampbookImpl.setTotalCancelled(totalCancelled);
		vrClearingStampbookImpl.setTotalReturned(totalReturned);

		if (remark == null) {
			vrClearingStampbookImpl.setRemark(StringPool.BLANK);
		}
		else {
			vrClearingStampbookImpl.setRemark(remark);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrClearingStampbookImpl.setModifyDate(null);
		}
		else {
			vrClearingStampbookImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrClearingStampbookImpl.setSyncDate(null);
		}
		else {
			vrClearingStampbookImpl.setSyncDate(new Date(syncDate));
		}

		vrClearingStampbookImpl.resetOriginalValues();

		return vrClearingStampbookImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		debitNoteId = objectInput.readLong();

		inputSheetId = objectInput.readLong();

		outputSheetId = objectInput.readLong();

		bookId = objectInput.readLong();

		certificateId = objectInput.readLong();
		certificateNumber = objectInput.readUTF();
		certificateDate = objectInput.readLong();
		vehicleClass = objectInput.readUTF();
		stampType = objectInput.readUTF();
		stampShortNo = objectInput.readUTF();

		serialStartNo = objectInput.readLong();

		serialEndNo = objectInput.readLong();

		subTotalInDocument = objectInput.readLong();

		subTotalQuantities = objectInput.readLong();

		vehiclePrice = objectInput.readLong();

		unitPrice = objectInput.readLong();

		totalAmount = objectInput.readLong();

		totalInUse = objectInput.readLong();

		totalNotUsed = objectInput.readLong();

		totalLost = objectInput.readLong();

		totalCancelled = objectInput.readLong();

		totalReturned = objectInput.readLong();
		remark = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(debitNoteId);

		objectOutput.writeLong(inputSheetId);

		objectOutput.writeLong(outputSheetId);

		objectOutput.writeLong(bookId);

		objectOutput.writeLong(certificateId);

		if (certificateNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateNumber);
		}

		objectOutput.writeLong(certificateDate);

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

		objectOutput.writeLong(vehiclePrice);

		objectOutput.writeLong(unitPrice);

		objectOutput.writeLong(totalAmount);

		objectOutput.writeLong(totalInUse);

		objectOutput.writeLong(totalNotUsed);

		objectOutput.writeLong(totalLost);

		objectOutput.writeLong(totalCancelled);

		objectOutput.writeLong(totalReturned);

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
	public long debitNoteId;
	public long inputSheetId;
	public long outputSheetId;
	public long bookId;
	public long certificateId;
	public String certificateNumber;
	public long certificateDate;
	public String vehicleClass;
	public String stampType;
	public String stampShortNo;
	public long serialStartNo;
	public long serialEndNo;
	public long subTotalInDocument;
	public long subTotalQuantities;
	public long vehiclePrice;
	public long unitPrice;
	public long totalAmount;
	public long totalInUse;
	public long totalNotUsed;
	public long totalLost;
	public long totalCancelled;
	public long totalReturned;
	public String remark;
	public long modifyDate;
	public long syncDate;
}