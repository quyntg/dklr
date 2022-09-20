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

import com.fds.vr.business.model.VRIssueEquipmentCertificate;

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
 * The cache model class for representing VRIssueEquipmentCertificate in entity cache.
 *
 * @author LamTV
 * @see VRIssueEquipmentCertificate
 * @generated
 */
@ProviderType
public class VRIssueEquipmentCertificateCacheModel implements CacheModel<VRIssueEquipmentCertificate>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRIssueEquipmentCertificateCacheModel)) {
			return false;
		}

		VRIssueEquipmentCertificateCacheModel vrIssueEquipmentCertificateCacheModel =
			(VRIssueEquipmentCertificateCacheModel)obj;

		if (id == vrIssueEquipmentCertificateCacheModel.id) {
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
		StringBundler sb = new StringBundler(53);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", issueId=");
		sb.append(issueId);
		sb.append(", issueVehicleCertificateId=");
		sb.append(issueVehicleCertificateId);
		sb.append(", vehicleCertificateRecordNo=");
		sb.append(vehicleCertificateRecordNo);
		sb.append(", equipmentName=");
		sb.append(equipmentName);
		sb.append(", equipmentType=");
		sb.append(equipmentType);
		sb.append(", equipmentCertificateType=");
		sb.append(equipmentCertificateType);
		sb.append(", equipmentDocumentNo=");
		sb.append(equipmentDocumentNo);
		sb.append(", equipmentCertificateRecordNo=");
		sb.append(equipmentCertificateRecordNo);
		sb.append(", equipmentExamRecordNo=");
		sb.append(equipmentExamRecordNo);
		sb.append(", EquipmentCertificateRecordId=");
		sb.append(EquipmentCertificateRecordId);
		sb.append(", TotalQuantity=");
		sb.append(TotalQuantity);
		sb.append(", TotalProductUsed=");
		sb.append(TotalProductUsed);
		sb.append(", TotalInUse=");
		sb.append(TotalInUse);
		sb.append(", TotalNotUsed=");
		sb.append(TotalNotUsed);
		sb.append(", applicantNo=");
		sb.append(applicantNo);
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", applicantAddress=");
		sb.append(applicantAddress);
		sb.append(", productionPlantName=");
		sb.append(productionPlantName);
		sb.append(", productionPlantAddress=");
		sb.append(productionPlantAddress);
		sb.append(", vehicleCertificateRecordDate=");
		sb.append(vehicleCertificateRecordDate);
		sb.append(", equipmentCertificateRecordDate=");
		sb.append(equipmentCertificateRecordDate);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRIssueEquipmentCertificate toEntityModel() {
		VRIssueEquipmentCertificateImpl vrIssueEquipmentCertificateImpl = new VRIssueEquipmentCertificateImpl();

		vrIssueEquipmentCertificateImpl.setId(id);
		vrIssueEquipmentCertificateImpl.setMtCore(mtCore);
		vrIssueEquipmentCertificateImpl.setDossierId(dossierId);
		vrIssueEquipmentCertificateImpl.setIssueId(issueId);
		vrIssueEquipmentCertificateImpl.setIssueVehicleCertificateId(issueVehicleCertificateId);

		if (vehicleCertificateRecordNo == null) {
			vrIssueEquipmentCertificateImpl.setVehicleCertificateRecordNo(StringPool.BLANK);
		}
		else {
			vrIssueEquipmentCertificateImpl.setVehicleCertificateRecordNo(vehicleCertificateRecordNo);
		}

		if (equipmentName == null) {
			vrIssueEquipmentCertificateImpl.setEquipmentName(StringPool.BLANK);
		}
		else {
			vrIssueEquipmentCertificateImpl.setEquipmentName(equipmentName);
		}

		if (equipmentType == null) {
			vrIssueEquipmentCertificateImpl.setEquipmentType(StringPool.BLANK);
		}
		else {
			vrIssueEquipmentCertificateImpl.setEquipmentType(equipmentType);
		}

		if (equipmentCertificateType == null) {
			vrIssueEquipmentCertificateImpl.setEquipmentCertificateType(StringPool.BLANK);
		}
		else {
			vrIssueEquipmentCertificateImpl.setEquipmentCertificateType(equipmentCertificateType);
		}

		if (equipmentDocumentNo == null) {
			vrIssueEquipmentCertificateImpl.setEquipmentDocumentNo(StringPool.BLANK);
		}
		else {
			vrIssueEquipmentCertificateImpl.setEquipmentDocumentNo(equipmentDocumentNo);
		}

		if (equipmentCertificateRecordNo == null) {
			vrIssueEquipmentCertificateImpl.setEquipmentCertificateRecordNo(StringPool.BLANK);
		}
		else {
			vrIssueEquipmentCertificateImpl.setEquipmentCertificateRecordNo(equipmentCertificateRecordNo);
		}

		if (equipmentExamRecordNo == null) {
			vrIssueEquipmentCertificateImpl.setEquipmentExamRecordNo(StringPool.BLANK);
		}
		else {
			vrIssueEquipmentCertificateImpl.setEquipmentExamRecordNo(equipmentExamRecordNo);
		}

		vrIssueEquipmentCertificateImpl.setEquipmentCertificateRecordId(EquipmentCertificateRecordId);
		vrIssueEquipmentCertificateImpl.setTotalQuantity(TotalQuantity);
		vrIssueEquipmentCertificateImpl.setTotalProductUsed(TotalProductUsed);
		vrIssueEquipmentCertificateImpl.setTotalInUse(TotalInUse);
		vrIssueEquipmentCertificateImpl.setTotalNotUsed(TotalNotUsed);

		if (applicantNo == null) {
			vrIssueEquipmentCertificateImpl.setApplicantNo(StringPool.BLANK);
		}
		else {
			vrIssueEquipmentCertificateImpl.setApplicantNo(applicantNo);
		}

		if (applicantName == null) {
			vrIssueEquipmentCertificateImpl.setApplicantName(StringPool.BLANK);
		}
		else {
			vrIssueEquipmentCertificateImpl.setApplicantName(applicantName);
		}

		if (applicantAddress == null) {
			vrIssueEquipmentCertificateImpl.setApplicantAddress(StringPool.BLANK);
		}
		else {
			vrIssueEquipmentCertificateImpl.setApplicantAddress(applicantAddress);
		}

		if (productionPlantName == null) {
			vrIssueEquipmentCertificateImpl.setProductionPlantName(StringPool.BLANK);
		}
		else {
			vrIssueEquipmentCertificateImpl.setProductionPlantName(productionPlantName);
		}

		if (productionPlantAddress == null) {
			vrIssueEquipmentCertificateImpl.setProductionPlantAddress(StringPool.BLANK);
		}
		else {
			vrIssueEquipmentCertificateImpl.setProductionPlantAddress(productionPlantAddress);
		}

		if (vehicleCertificateRecordDate == Long.MIN_VALUE) {
			vrIssueEquipmentCertificateImpl.setVehicleCertificateRecordDate(null);
		}
		else {
			vrIssueEquipmentCertificateImpl.setVehicleCertificateRecordDate(new Date(
					vehicleCertificateRecordDate));
		}

		if (equipmentCertificateRecordDate == Long.MIN_VALUE) {
			vrIssueEquipmentCertificateImpl.setEquipmentCertificateRecordDate(null);
		}
		else {
			vrIssueEquipmentCertificateImpl.setEquipmentCertificateRecordDate(new Date(
					equipmentCertificateRecordDate));
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrIssueEquipmentCertificateImpl.setModifyDate(null);
		}
		else {
			vrIssueEquipmentCertificateImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrIssueEquipmentCertificateImpl.setSyncDate(null);
		}
		else {
			vrIssueEquipmentCertificateImpl.setSyncDate(new Date(syncDate));
		}

		vrIssueEquipmentCertificateImpl.resetOriginalValues();

		return vrIssueEquipmentCertificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		dossierId = objectInput.readLong();

		issueId = objectInput.readLong();

		issueVehicleCertificateId = objectInput.readLong();
		vehicleCertificateRecordNo = objectInput.readUTF();
		equipmentName = objectInput.readUTF();
		equipmentType = objectInput.readUTF();
		equipmentCertificateType = objectInput.readUTF();
		equipmentDocumentNo = objectInput.readUTF();
		equipmentCertificateRecordNo = objectInput.readUTF();
		equipmentExamRecordNo = objectInput.readUTF();

		EquipmentCertificateRecordId = objectInput.readInt();

		TotalQuantity = objectInput.readInt();

		TotalProductUsed = objectInput.readInt();

		TotalInUse = objectInput.readInt();

		TotalNotUsed = objectInput.readInt();
		applicantNo = objectInput.readUTF();
		applicantName = objectInput.readUTF();
		applicantAddress = objectInput.readUTF();
		productionPlantName = objectInput.readUTF();
		productionPlantAddress = objectInput.readUTF();
		vehicleCertificateRecordDate = objectInput.readLong();
		equipmentCertificateRecordDate = objectInput.readLong();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(dossierId);

		objectOutput.writeLong(issueId);

		objectOutput.writeLong(issueVehicleCertificateId);

		if (vehicleCertificateRecordNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleCertificateRecordNo);
		}

		if (equipmentName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentName);
		}

		if (equipmentType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentType);
		}

		if (equipmentCertificateType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentCertificateType);
		}

		if (equipmentDocumentNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentDocumentNo);
		}

		if (equipmentCertificateRecordNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentCertificateRecordNo);
		}

		if (equipmentExamRecordNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentExamRecordNo);
		}

		objectOutput.writeInt(EquipmentCertificateRecordId);

		objectOutput.writeInt(TotalQuantity);

		objectOutput.writeInt(TotalProductUsed);

		objectOutput.writeInt(TotalInUse);

		objectOutput.writeInt(TotalNotUsed);

		if (applicantNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantNo);
		}

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

		if (productionPlantName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantName);
		}

		if (productionPlantAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantAddress);
		}

		objectOutput.writeLong(vehicleCertificateRecordDate);
		objectOutput.writeLong(equipmentCertificateRecordDate);
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public long dossierId;
	public long issueId;
	public long issueVehicleCertificateId;
	public String vehicleCertificateRecordNo;
	public String equipmentName;
	public String equipmentType;
	public String equipmentCertificateType;
	public String equipmentDocumentNo;
	public String equipmentCertificateRecordNo;
	public String equipmentExamRecordNo;
	public int EquipmentCertificateRecordId;
	public int TotalQuantity;
	public int TotalProductUsed;
	public int TotalInUse;
	public int TotalNotUsed;
	public String applicantNo;
	public String applicantName;
	public String applicantAddress;
	public String productionPlantName;
	public String productionPlantAddress;
	public long vehicleCertificateRecordDate;
	public long equipmentCertificateRecordDate;
	public long modifyDate;
	public long syncDate;
}