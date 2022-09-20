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

import com.fds.vr.business.model.VRInputStampbookDetails;

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
 * The cache model class for representing VRInputStampbookDetails in entity cache.
 *
 * @author LamTV
 * @see VRInputStampbookDetails
 * @generated
 */
@ProviderType
public class VRInputStampbookDetailsCacheModel implements CacheModel<VRInputStampbookDetails>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRInputStampbookDetailsCacheModel)) {
			return false;
		}

		VRInputStampbookDetailsCacheModel vrInputStampbookDetailsCacheModel = (VRInputStampbookDetailsCacheModel)obj;

		if (id == vrInputStampbookDetailsCacheModel.id) {
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
		StringBundler sb = new StringBundler(69);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", stampSerialNo=");
		sb.append(stampSerialNo);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", certificateId=");
		sb.append(certificateId);
		sb.append(", certificateNumber=");
		sb.append(certificateNumber);
		sb.append(", certificateDate=");
		sb.append(certificateDate);
		sb.append(", vehicleRecordId=");
		sb.append(vehicleRecordId);
		sb.append(", frameNo=");
		sb.append(frameNo);
		sb.append(", boxNo=");
		sb.append(boxNo);
		sb.append(", vinNo=");
		sb.append(vinNo);
		sb.append(", engineNo=");
		sb.append(engineNo);
		sb.append(", qrCode=");
		sb.append(qrCode);
		sb.append(", copies=");
		sb.append(copies);
		sb.append(", markupFulfill=");
		sb.append(markupFulfill);
		sb.append(", replacedSerialNo=");
		sb.append(replacedSerialNo);
		sb.append(", remark=");
		sb.append(remark);
		sb.append(", inputSheetId=");
		sb.append(inputSheetId);
		sb.append(", bookId=");
		sb.append(bookId);
		sb.append(", purchaserId=");
		sb.append(purchaserId);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", issuingStatus=");
		sb.append(issuingStatus);
		sb.append(", clearingStatus=");
		sb.append(clearingStatus);
		sb.append(", stampStatus=");
		sb.append(stampStatus);
		sb.append(", issuingDate=");
		sb.append(issuingDate);
		sb.append(", printingDate=");
		sb.append(printingDate);
		sb.append(", noticeofLostDate=");
		sb.append(noticeofLostDate);
		sb.append(", noticeofCancelDate=");
		sb.append(noticeofCancelDate);
		sb.append(", noticeofReturnDate=");
		sb.append(noticeofReturnDate);
		sb.append(", clearingDate=");
		sb.append(clearingDate);
		sb.append(", clearingAdvancePaymentID=");
		sb.append(clearingAdvancePaymentID);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRInputStampbookDetails toEntityModel() {
		VRInputStampbookDetailsImpl vrInputStampbookDetailsImpl = new VRInputStampbookDetailsImpl();

		vrInputStampbookDetailsImpl.setId(id);
		vrInputStampbookDetailsImpl.setMtCore(mtCore);

		if (stampSerialNo == null) {
			vrInputStampbookDetailsImpl.setStampSerialNo(StringPool.BLANK);
		}
		else {
			vrInputStampbookDetailsImpl.setStampSerialNo(stampSerialNo);
		}

		vrInputStampbookDetailsImpl.setSequenceNo(sequenceNo);
		vrInputStampbookDetailsImpl.setDossierId(dossierId);
		vrInputStampbookDetailsImpl.setCertificateId(certificateId);

		if (certificateNumber == null) {
			vrInputStampbookDetailsImpl.setCertificateNumber(StringPool.BLANK);
		}
		else {
			vrInputStampbookDetailsImpl.setCertificateNumber(certificateNumber);
		}

		if (certificateDate == Long.MIN_VALUE) {
			vrInputStampbookDetailsImpl.setCertificateDate(null);
		}
		else {
			vrInputStampbookDetailsImpl.setCertificateDate(new Date(
					certificateDate));
		}

		vrInputStampbookDetailsImpl.setVehicleRecordId(vehicleRecordId);

		if (frameNo == null) {
			vrInputStampbookDetailsImpl.setFrameNo(StringPool.BLANK);
		}
		else {
			vrInputStampbookDetailsImpl.setFrameNo(frameNo);
		}

		if (boxNo == null) {
			vrInputStampbookDetailsImpl.setBoxNo(StringPool.BLANK);
		}
		else {
			vrInputStampbookDetailsImpl.setBoxNo(boxNo);
		}

		if (vinNo == null) {
			vrInputStampbookDetailsImpl.setVinNo(StringPool.BLANK);
		}
		else {
			vrInputStampbookDetailsImpl.setVinNo(vinNo);
		}

		if (engineNo == null) {
			vrInputStampbookDetailsImpl.setEngineNo(StringPool.BLANK);
		}
		else {
			vrInputStampbookDetailsImpl.setEngineNo(engineNo);
		}

		if (qrCode == null) {
			vrInputStampbookDetailsImpl.setQrCode(StringPool.BLANK);
		}
		else {
			vrInputStampbookDetailsImpl.setQrCode(qrCode);
		}

		vrInputStampbookDetailsImpl.setCopies(copies);
		vrInputStampbookDetailsImpl.setMarkupFulfill(markupFulfill);

		if (replacedSerialNo == null) {
			vrInputStampbookDetailsImpl.setReplacedSerialNo(StringPool.BLANK);
		}
		else {
			vrInputStampbookDetailsImpl.setReplacedSerialNo(replacedSerialNo);
		}

		if (remark == null) {
			vrInputStampbookDetailsImpl.setRemark(StringPool.BLANK);
		}
		else {
			vrInputStampbookDetailsImpl.setRemark(remark);
		}

		vrInputStampbookDetailsImpl.setInputSheetId(inputSheetId);
		vrInputStampbookDetailsImpl.setBookId(bookId);
		vrInputStampbookDetailsImpl.setPurchaserId(purchaserId);
		vrInputStampbookDetailsImpl.setCorporationId(corporationId);
		vrInputStampbookDetailsImpl.setIssuingStatus(issuingStatus);
		vrInputStampbookDetailsImpl.setClearingStatus(clearingStatus);
		vrInputStampbookDetailsImpl.setStampStatus(stampStatus);

		if (issuingDate == Long.MIN_VALUE) {
			vrInputStampbookDetailsImpl.setIssuingDate(null);
		}
		else {
			vrInputStampbookDetailsImpl.setIssuingDate(new Date(issuingDate));
		}

		if (printingDate == Long.MIN_VALUE) {
			vrInputStampbookDetailsImpl.setPrintingDate(null);
		}
		else {
			vrInputStampbookDetailsImpl.setPrintingDate(new Date(printingDate));
		}

		if (noticeofLostDate == Long.MIN_VALUE) {
			vrInputStampbookDetailsImpl.setNoticeofLostDate(null);
		}
		else {
			vrInputStampbookDetailsImpl.setNoticeofLostDate(new Date(
					noticeofLostDate));
		}

		if (noticeofCancelDate == Long.MIN_VALUE) {
			vrInputStampbookDetailsImpl.setNoticeofCancelDate(null);
		}
		else {
			vrInputStampbookDetailsImpl.setNoticeofCancelDate(new Date(
					noticeofCancelDate));
		}

		if (noticeofReturnDate == Long.MIN_VALUE) {
			vrInputStampbookDetailsImpl.setNoticeofReturnDate(null);
		}
		else {
			vrInputStampbookDetailsImpl.setNoticeofReturnDate(new Date(
					noticeofReturnDate));
		}

		if (clearingDate == Long.MIN_VALUE) {
			vrInputStampbookDetailsImpl.setClearingDate(null);
		}
		else {
			vrInputStampbookDetailsImpl.setClearingDate(new Date(clearingDate));
		}

		vrInputStampbookDetailsImpl.setClearingAdvancePaymentID(clearingAdvancePaymentID);

		if (modifyDate == Long.MIN_VALUE) {
			vrInputStampbookDetailsImpl.setModifyDate(null);
		}
		else {
			vrInputStampbookDetailsImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrInputStampbookDetailsImpl.setSyncDate(null);
		}
		else {
			vrInputStampbookDetailsImpl.setSyncDate(new Date(syncDate));
		}

		vrInputStampbookDetailsImpl.resetOriginalValues();

		return vrInputStampbookDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();
		stampSerialNo = objectInput.readUTF();

		sequenceNo = objectInput.readLong();

		dossierId = objectInput.readLong();

		certificateId = objectInput.readLong();
		certificateNumber = objectInput.readUTF();
		certificateDate = objectInput.readLong();

		vehicleRecordId = objectInput.readLong();
		frameNo = objectInput.readUTF();
		boxNo = objectInput.readUTF();
		vinNo = objectInput.readUTF();
		engineNo = objectInput.readUTF();
		qrCode = objectInput.readUTF();

		copies = objectInput.readLong();

		markupFulfill = objectInput.readLong();
		replacedSerialNo = objectInput.readUTF();
		remark = objectInput.readUTF();

		inputSheetId = objectInput.readLong();

		bookId = objectInput.readLong();

		purchaserId = objectInput.readLong();

		corporationId = objectInput.readLong();

		issuingStatus = objectInput.readLong();

		clearingStatus = objectInput.readLong();

		stampStatus = objectInput.readLong();
		issuingDate = objectInput.readLong();
		printingDate = objectInput.readLong();
		noticeofLostDate = objectInput.readLong();
		noticeofCancelDate = objectInput.readLong();
		noticeofReturnDate = objectInput.readLong();
		clearingDate = objectInput.readLong();

		clearingAdvancePaymentID = objectInput.readLong();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		if (stampSerialNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stampSerialNo);
		}

		objectOutput.writeLong(sequenceNo);

		objectOutput.writeLong(dossierId);

		objectOutput.writeLong(certificateId);

		if (certificateNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateNumber);
		}

		objectOutput.writeLong(certificateDate);

		objectOutput.writeLong(vehicleRecordId);

		if (frameNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(frameNo);
		}

		if (boxNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(boxNo);
		}

		if (vinNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vinNo);
		}

		if (engineNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(engineNo);
		}

		if (qrCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(qrCode);
		}

		objectOutput.writeLong(copies);

		objectOutput.writeLong(markupFulfill);

		if (replacedSerialNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(replacedSerialNo);
		}

		if (remark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remark);
		}

		objectOutput.writeLong(inputSheetId);

		objectOutput.writeLong(bookId);

		objectOutput.writeLong(purchaserId);

		objectOutput.writeLong(corporationId);

		objectOutput.writeLong(issuingStatus);

		objectOutput.writeLong(clearingStatus);

		objectOutput.writeLong(stampStatus);
		objectOutput.writeLong(issuingDate);
		objectOutput.writeLong(printingDate);
		objectOutput.writeLong(noticeofLostDate);
		objectOutput.writeLong(noticeofCancelDate);
		objectOutput.writeLong(noticeofReturnDate);
		objectOutput.writeLong(clearingDate);

		objectOutput.writeLong(clearingAdvancePaymentID);
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public String stampSerialNo;
	public long sequenceNo;
	public long dossierId;
	public long certificateId;
	public String certificateNumber;
	public long certificateDate;
	public long vehicleRecordId;
	public String frameNo;
	public String boxNo;
	public String vinNo;
	public String engineNo;
	public String qrCode;
	public long copies;
	public long markupFulfill;
	public String replacedSerialNo;
	public String remark;
	public long inputSheetId;
	public long bookId;
	public long purchaserId;
	public long corporationId;
	public long issuingStatus;
	public long clearingStatus;
	public long stampStatus;
	public long issuingDate;
	public long printingDate;
	public long noticeofLostDate;
	public long noticeofCancelDate;
	public long noticeofReturnDate;
	public long clearingDate;
	public long clearingAdvancePaymentID;
	public long modifyDate;
	public long syncDate;
}