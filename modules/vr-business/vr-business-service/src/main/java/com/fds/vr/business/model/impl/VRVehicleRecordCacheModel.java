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

import com.fds.vr.business.model.VRVehicleRecord;

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
 * The cache model class for representing VRVehicleRecord in entity cache.
 *
 * @author LamTV
 * @see VRVehicleRecord
 * @generated
 */
@ProviderType
public class VRVehicleRecordCacheModel implements CacheModel<VRVehicleRecord>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRVehicleRecordCacheModel)) {
			return false;
		}

		VRVehicleRecordCacheModel vrVehicleRecordCacheModel = (VRVehicleRecordCacheModel)obj;

		if (id == vrVehicleRecordCacheModel.id) {
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
		StringBundler sb = new StringBundler(63);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", issueId=");
		sb.append(issueId);
		sb.append(", issueVehicleCertificateId=");
		sb.append(issueVehicleCertificateId);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", applicantProfileId=");
		sb.append(applicantProfileId);
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", applicantAddress=");
		sb.append(applicantAddress);
		sb.append(", certificateId=");
		sb.append(certificateId);
		sb.append(", productionNumber=");
		sb.append(productionNumber);
		sb.append(", productionDate=");
		sb.append(productionDate);
		sb.append(", frameNo=");
		sb.append(frameNo);
		sb.append(", boxNo=");
		sb.append(boxNo);
		sb.append(", engineNo=");
		sb.append(engineNo);
		sb.append(", color=");
		sb.append(color);
		sb.append(", stampShortNo=");
		sb.append(stampShortNo);
		sb.append(", serialNo=");
		sb.append(serialNo);
		sb.append(", vehicleRecordStatus=");
		sb.append(vehicleRecordStatus);
		sb.append(", printingStatus=");
		sb.append(printingStatus);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", signName=");
		sb.append(signName);
		sb.append(", signTitle=");
		sb.append(signTitle);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append(", certificateRecordDate=");
		sb.append(certificateRecordDate);
		sb.append(", issueInspectionRecordId=");
		sb.append(issueInspectionRecordId);
		sb.append(", certificaterecordno=");
		sb.append(certificaterecordno);
		sb.append(", postPrintingStatus=");
		sb.append(postPrintingStatus);
		sb.append(", qrCode=");
		sb.append(qrCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRVehicleRecord toEntityModel() {
		VRVehicleRecordImpl vrVehicleRecordImpl = new VRVehicleRecordImpl();

		vrVehicleRecordImpl.setId(id);
		vrVehicleRecordImpl.setMtCore(mtCore);
		vrVehicleRecordImpl.setIssueId(issueId);
		vrVehicleRecordImpl.setIssueVehicleCertificateId(issueVehicleCertificateId);
		vrVehicleRecordImpl.setDossierId(dossierId);
		vrVehicleRecordImpl.setApplicantProfileId(applicantProfileId);

		if (applicantName == null) {
			vrVehicleRecordImpl.setApplicantName(StringPool.BLANK);
		}
		else {
			vrVehicleRecordImpl.setApplicantName(applicantName);
		}

		if (applicantAddress == null) {
			vrVehicleRecordImpl.setApplicantAddress(StringPool.BLANK);
		}
		else {
			vrVehicleRecordImpl.setApplicantAddress(applicantAddress);
		}

		vrVehicleRecordImpl.setCertificateId(certificateId);

		if (productionNumber == null) {
			vrVehicleRecordImpl.setProductionNumber(StringPool.BLANK);
		}
		else {
			vrVehicleRecordImpl.setProductionNumber(productionNumber);
		}

		if (productionDate == Long.MIN_VALUE) {
			vrVehicleRecordImpl.setProductionDate(null);
		}
		else {
			vrVehicleRecordImpl.setProductionDate(new Date(productionDate));
		}

		if (frameNo == null) {
			vrVehicleRecordImpl.setFrameNo(StringPool.BLANK);
		}
		else {
			vrVehicleRecordImpl.setFrameNo(frameNo);
		}

		if (boxNo == null) {
			vrVehicleRecordImpl.setBoxNo(StringPool.BLANK);
		}
		else {
			vrVehicleRecordImpl.setBoxNo(boxNo);
		}

		if (engineNo == null) {
			vrVehicleRecordImpl.setEngineNo(StringPool.BLANK);
		}
		else {
			vrVehicleRecordImpl.setEngineNo(engineNo);
		}

		if (color == null) {
			vrVehicleRecordImpl.setColor(StringPool.BLANK);
		}
		else {
			vrVehicleRecordImpl.setColor(color);
		}

		if (stampShortNo == null) {
			vrVehicleRecordImpl.setStampShortNo(StringPool.BLANK);
		}
		else {
			vrVehicleRecordImpl.setStampShortNo(stampShortNo);
		}

		if (serialNo == null) {
			vrVehicleRecordImpl.setSerialNo(StringPool.BLANK);
		}
		else {
			vrVehicleRecordImpl.setSerialNo(serialNo);
		}

		vrVehicleRecordImpl.setVehicleRecordStatus(vehicleRecordStatus);
		vrVehicleRecordImpl.setPrintingStatus(printingStatus);
		vrVehicleRecordImpl.setAttachedFile(attachedFile);

		if (signName == null) {
			vrVehicleRecordImpl.setSignName(StringPool.BLANK);
		}
		else {
			vrVehicleRecordImpl.setSignName(signName);
		}

		if (signTitle == null) {
			vrVehicleRecordImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			vrVehicleRecordImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			vrVehicleRecordImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			vrVehicleRecordImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			vrVehicleRecordImpl.setSignDate(null);
		}
		else {
			vrVehicleRecordImpl.setSignDate(new Date(signDate));
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrVehicleRecordImpl.setModifyDate(null);
		}
		else {
			vrVehicleRecordImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrVehicleRecordImpl.setSyncDate(null);
		}
		else {
			vrVehicleRecordImpl.setSyncDate(new Date(syncDate));
		}

		if (certificateRecordDate == Long.MIN_VALUE) {
			vrVehicleRecordImpl.setCertificateRecordDate(null);
		}
		else {
			vrVehicleRecordImpl.setCertificateRecordDate(new Date(
					certificateRecordDate));
		}

		vrVehicleRecordImpl.setIssueInspectionRecordId(issueInspectionRecordId);

		if (certificaterecordno == null) {
			vrVehicleRecordImpl.setCertificaterecordno(StringPool.BLANK);
		}
		else {
			vrVehicleRecordImpl.setCertificaterecordno(certificaterecordno);
		}

		vrVehicleRecordImpl.setPostPrintingStatus(postPrintingStatus);

		if (qrCode == null) {
			vrVehicleRecordImpl.setQrCode(StringPool.BLANK);
		}
		else {
			vrVehicleRecordImpl.setQrCode(qrCode);
		}

		vrVehicleRecordImpl.resetOriginalValues();

		return vrVehicleRecordImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		issueId = objectInput.readLong();

		issueVehicleCertificateId = objectInput.readLong();

		dossierId = objectInput.readLong();

		applicantProfileId = objectInput.readLong();
		applicantName = objectInput.readUTF();
		applicantAddress = objectInput.readUTF();

		certificateId = objectInput.readLong();
		productionNumber = objectInput.readUTF();
		productionDate = objectInput.readLong();
		frameNo = objectInput.readUTF();
		boxNo = objectInput.readUTF();
		engineNo = objectInput.readUTF();
		color = objectInput.readUTF();
		stampShortNo = objectInput.readUTF();
		serialNo = objectInput.readUTF();

		vehicleRecordStatus = objectInput.readLong();

		printingStatus = objectInput.readLong();

		attachedFile = objectInput.readLong();
		signName = objectInput.readUTF();
		signTitle = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
		certificateRecordDate = objectInput.readLong();

		issueInspectionRecordId = objectInput.readLong();
		certificaterecordno = objectInput.readUTF();

		postPrintingStatus = objectInput.readInt();
		qrCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(issueId);

		objectOutput.writeLong(issueVehicleCertificateId);

		objectOutput.writeLong(dossierId);

		objectOutput.writeLong(applicantProfileId);

		if (applicantName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantName);
		}

		if (applicantAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantAddress);
		}

		objectOutput.writeLong(certificateId);

		if (productionNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionNumber);
		}

		objectOutput.writeLong(productionDate);

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

		if (engineNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(engineNo);
		}

		if (color == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(color);
		}

		if (stampShortNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stampShortNo);
		}

		if (serialNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serialNo);
		}

		objectOutput.writeLong(vehicleRecordStatus);

		objectOutput.writeLong(printingStatus);

		objectOutput.writeLong(attachedFile);

		if (signName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signName);
		}

		if (signTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signTitle);
		}

		if (signPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signPlace);
		}

		objectOutput.writeLong(signDate);
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
		objectOutput.writeLong(certificateRecordDate);

		objectOutput.writeLong(issueInspectionRecordId);

		if (certificaterecordno == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificaterecordno);
		}

		objectOutput.writeInt(postPrintingStatus);

		if (qrCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(qrCode);
		}
	}

	public long id;
	public long mtCore;
	public long issueId;
	public long issueVehicleCertificateId;
	public long dossierId;
	public long applicantProfileId;
	public String applicantName;
	public String applicantAddress;
	public long certificateId;
	public String productionNumber;
	public long productionDate;
	public String frameNo;
	public String boxNo;
	public String engineNo;
	public String color;
	public String stampShortNo;
	public String serialNo;
	public long vehicleRecordStatus;
	public long printingStatus;
	public long attachedFile;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
	public long modifyDate;
	public long syncDate;
	public long certificateRecordDate;
	public long issueInspectionRecordId;
	public String certificaterecordno;
	public int postPrintingStatus;
	public String qrCode;
}