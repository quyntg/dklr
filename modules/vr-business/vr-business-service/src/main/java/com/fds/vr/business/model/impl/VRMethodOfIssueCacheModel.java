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

import com.fds.vr.business.model.VRMethodOfIssue;

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
 * The cache model class for representing VRMethodOfIssue in entity cache.
 *
 * @author LamTV
 * @see VRMethodOfIssue
 * @generated
 */
@ProviderType
public class VRMethodOfIssueCacheModel implements CacheModel<VRMethodOfIssue>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRMethodOfIssueCacheModel)) {
			return false;
		}

		VRMethodOfIssueCacheModel vrMethodOfIssueCacheModel = (VRMethodOfIssueCacheModel)obj;

		if (id == vrMethodOfIssueCacheModel.id) {
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
		StringBundler sb = new StringBundler(73);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", vehicleClass=");
		sb.append(vehicleClass);
		sb.append(", certifiedAssemblyType=");
		sb.append(certifiedAssemblyType);
		sb.append(", certifiedAssemblyTypeDescription=");
		sb.append(certifiedAssemblyTypeDescription);
		sb.append(", applicantProfileId=");
		sb.append(applicantProfileId);
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", applicantAddress=");
		sb.append(applicantAddress);
		sb.append(", productionPlantId=");
		sb.append(productionPlantId);
		sb.append(", productionPlantCode=");
		sb.append(productionPlantCode);
		sb.append(", productionPlantName=");
		sb.append(productionPlantName);
		sb.append(", productionPlantAddress=");
		sb.append(productionPlantAddress);
		sb.append(", methodOfIssue=");
		sb.append(methodOfIssue);
		sb.append(", methodApproved=");
		sb.append(methodApproved);
		sb.append(", methodInMonth=");
		sb.append(methodInMonth);
		sb.append(", methodInYear=");
		sb.append(methodInYear);
		sb.append(", periodDuration=");
		sb.append(periodDuration);
		sb.append(", frequencyIndex=");
		sb.append(frequencyIndex);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", averageStbQuantityIndex=");
		sb.append(averageStbQuantityIndex);
		sb.append(", maxMonthQuantityIndex=");
		sb.append(maxMonthQuantityIndex);
		sb.append(", averageStmQuantityIndex=");
		sb.append(averageStmQuantityIndex);
		sb.append(", accumulatedMonthQuantityIndex=");
		sb.append(accumulatedMonthQuantityIndex);
		sb.append(", latestOtherIndex1=");
		sb.append(latestOtherIndex1);
		sb.append(", latestOtherIndex2=");
		sb.append(latestOtherIndex2);
		sb.append(", latestOtherIndex3=");
		sb.append(latestOtherIndex3);
		sb.append(", latestCOPReportDate=");
		sb.append(latestCOPReportDate);
		sb.append(", latestInspectionRecordDate=");
		sb.append(latestInspectionRecordDate);
		sb.append(", latestNumberOfInspectionInYear=");
		sb.append(latestNumberOfInspectionInYear);
		sb.append(", latestNumberOfInspectionInMonth=");
		sb.append(latestNumberOfInspectionInMonth);
		sb.append(", latestNumberOfStampInMonth=");
		sb.append(latestNumberOfStampInMonth);
		sb.append(", periodStartFrom=");
		sb.append(periodStartFrom);
		sb.append(", totalInspection=");
		sb.append(totalInspection);
		sb.append(", flowIndex=");
		sb.append(flowIndex);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRMethodOfIssue toEntityModel() {
		VRMethodOfIssueImpl vrMethodOfIssueImpl = new VRMethodOfIssueImpl();

		vrMethodOfIssueImpl.setId(id);
		vrMethodOfIssueImpl.setMtCore(mtCore);

		if (vehicleClass == null) {
			vrMethodOfIssueImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vrMethodOfIssueImpl.setVehicleClass(vehicleClass);
		}

		if (certifiedAssemblyType == null) {
			vrMethodOfIssueImpl.setCertifiedAssemblyType(StringPool.BLANK);
		}
		else {
			vrMethodOfIssueImpl.setCertifiedAssemblyType(certifiedAssemblyType);
		}

		if (certifiedAssemblyTypeDescription == null) {
			vrMethodOfIssueImpl.setCertifiedAssemblyTypeDescription(StringPool.BLANK);
		}
		else {
			vrMethodOfIssueImpl.setCertifiedAssemblyTypeDescription(certifiedAssemblyTypeDescription);
		}

		vrMethodOfIssueImpl.setApplicantProfileId(applicantProfileId);

		if (applicantName == null) {
			vrMethodOfIssueImpl.setApplicantName(StringPool.BLANK);
		}
		else {
			vrMethodOfIssueImpl.setApplicantName(applicantName);
		}

		if (applicantAddress == null) {
			vrMethodOfIssueImpl.setApplicantAddress(StringPool.BLANK);
		}
		else {
			vrMethodOfIssueImpl.setApplicantAddress(applicantAddress);
		}

		vrMethodOfIssueImpl.setProductionPlantId(productionPlantId);

		if (productionPlantCode == null) {
			vrMethodOfIssueImpl.setProductionPlantCode(StringPool.BLANK);
		}
		else {
			vrMethodOfIssueImpl.setProductionPlantCode(productionPlantCode);
		}

		if (productionPlantName == null) {
			vrMethodOfIssueImpl.setProductionPlantName(StringPool.BLANK);
		}
		else {
			vrMethodOfIssueImpl.setProductionPlantName(productionPlantName);
		}

		if (productionPlantAddress == null) {
			vrMethodOfIssueImpl.setProductionPlantAddress(StringPool.BLANK);
		}
		else {
			vrMethodOfIssueImpl.setProductionPlantAddress(productionPlantAddress);
		}

		if (methodOfIssue == null) {
			vrMethodOfIssueImpl.setMethodOfIssue(StringPool.BLANK);
		}
		else {
			vrMethodOfIssueImpl.setMethodOfIssue(methodOfIssue);
		}

		vrMethodOfIssueImpl.setMethodApproved(methodApproved);
		vrMethodOfIssueImpl.setMethodInMonth(methodInMonth);
		vrMethodOfIssueImpl.setMethodInYear(methodInYear);
		vrMethodOfIssueImpl.setPeriodDuration(periodDuration);
		vrMethodOfIssueImpl.setFrequencyIndex(frequencyIndex);

		if (remarks == null) {
			vrMethodOfIssueImpl.setRemarks(StringPool.BLANK);
		}
		else {
			vrMethodOfIssueImpl.setRemarks(remarks);
		}

		vrMethodOfIssueImpl.setAverageStbQuantityIndex(averageStbQuantityIndex);
		vrMethodOfIssueImpl.setMaxMonthQuantityIndex(maxMonthQuantityIndex);
		vrMethodOfIssueImpl.setAverageStmQuantityIndex(averageStmQuantityIndex);
		vrMethodOfIssueImpl.setAccumulatedMonthQuantityIndex(accumulatedMonthQuantityIndex);
		vrMethodOfIssueImpl.setLatestOtherIndex1(latestOtherIndex1);
		vrMethodOfIssueImpl.setLatestOtherIndex2(latestOtherIndex2);
		vrMethodOfIssueImpl.setLatestOtherIndex3(latestOtherIndex3);

		if (latestCOPReportDate == Long.MIN_VALUE) {
			vrMethodOfIssueImpl.setLatestCOPReportDate(null);
		}
		else {
			vrMethodOfIssueImpl.setLatestCOPReportDate(new Date(
					latestCOPReportDate));
		}

		if (latestInspectionRecordDate == Long.MIN_VALUE) {
			vrMethodOfIssueImpl.setLatestInspectionRecordDate(null);
		}
		else {
			vrMethodOfIssueImpl.setLatestInspectionRecordDate(new Date(
					latestInspectionRecordDate));
		}

		vrMethodOfIssueImpl.setLatestNumberOfInspectionInYear(latestNumberOfInspectionInYear);
		vrMethodOfIssueImpl.setLatestNumberOfInspectionInMonth(latestNumberOfInspectionInMonth);
		vrMethodOfIssueImpl.setLatestNumberOfStampInMonth(latestNumberOfStampInMonth);

		if (periodStartFrom == Long.MIN_VALUE) {
			vrMethodOfIssueImpl.setPeriodStartFrom(null);
		}
		else {
			vrMethodOfIssueImpl.setPeriodStartFrom(new Date(periodStartFrom));
		}

		vrMethodOfIssueImpl.setTotalInspection(totalInspection);

		if (flowIndex == null) {
			vrMethodOfIssueImpl.setFlowIndex(StringPool.BLANK);
		}
		else {
			vrMethodOfIssueImpl.setFlowIndex(flowIndex);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrMethodOfIssueImpl.setModifyDate(null);
		}
		else {
			vrMethodOfIssueImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrMethodOfIssueImpl.setSyncDate(null);
		}
		else {
			vrMethodOfIssueImpl.setSyncDate(new Date(syncDate));
		}

		vrMethodOfIssueImpl.resetOriginalValues();

		return vrMethodOfIssueImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();
		vehicleClass = objectInput.readUTF();
		certifiedAssemblyType = objectInput.readUTF();
		certifiedAssemblyTypeDescription = objectInput.readUTF();

		applicantProfileId = objectInput.readLong();
		applicantName = objectInput.readUTF();
		applicantAddress = objectInput.readUTF();

		productionPlantId = objectInput.readLong();
		productionPlantCode = objectInput.readUTF();
		productionPlantName = objectInput.readUTF();
		productionPlantAddress = objectInput.readUTF();
		methodOfIssue = objectInput.readUTF();

		methodApproved = objectInput.readInt();

		methodInMonth = objectInput.readInt();

		methodInYear = objectInput.readInt();

		periodDuration = objectInput.readInt();

		frequencyIndex = objectInput.readInt();
		remarks = objectInput.readUTF();

		averageStbQuantityIndex = objectInput.readInt();

		maxMonthQuantityIndex = objectInput.readInt();

		averageStmQuantityIndex = objectInput.readInt();

		accumulatedMonthQuantityIndex = objectInput.readInt();

		latestOtherIndex1 = objectInput.readInt();

		latestOtherIndex2 = objectInput.readInt();

		latestOtherIndex3 = objectInput.readInt();
		latestCOPReportDate = objectInput.readLong();
		latestInspectionRecordDate = objectInput.readLong();

		latestNumberOfInspectionInYear = objectInput.readInt();

		latestNumberOfInspectionInMonth = objectInput.readInt();

		latestNumberOfStampInMonth = objectInput.readInt();
		periodStartFrom = objectInput.readLong();

		totalInspection = objectInput.readInt();
		flowIndex = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		if (vehicleClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleClass);
		}

		if (certifiedAssemblyType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedAssemblyType);
		}

		if (certifiedAssemblyTypeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedAssemblyTypeDescription);
		}

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

		objectOutput.writeLong(productionPlantId);

		if (productionPlantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantCode);
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

		if (methodOfIssue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(methodOfIssue);
		}

		objectOutput.writeInt(methodApproved);

		objectOutput.writeInt(methodInMonth);

		objectOutput.writeInt(methodInYear);

		objectOutput.writeInt(periodDuration);

		objectOutput.writeInt(frequencyIndex);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeInt(averageStbQuantityIndex);

		objectOutput.writeInt(maxMonthQuantityIndex);

		objectOutput.writeInt(averageStmQuantityIndex);

		objectOutput.writeInt(accumulatedMonthQuantityIndex);

		objectOutput.writeInt(latestOtherIndex1);

		objectOutput.writeInt(latestOtherIndex2);

		objectOutput.writeInt(latestOtherIndex3);
		objectOutput.writeLong(latestCOPReportDate);
		objectOutput.writeLong(latestInspectionRecordDate);

		objectOutput.writeInt(latestNumberOfInspectionInYear);

		objectOutput.writeInt(latestNumberOfInspectionInMonth);

		objectOutput.writeInt(latestNumberOfStampInMonth);
		objectOutput.writeLong(periodStartFrom);

		objectOutput.writeInt(totalInspection);

		if (flowIndex == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(flowIndex);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public String vehicleClass;
	public String certifiedAssemblyType;
	public String certifiedAssemblyTypeDescription;
	public long applicantProfileId;
	public String applicantName;
	public String applicantAddress;
	public long productionPlantId;
	public String productionPlantCode;
	public String productionPlantName;
	public String productionPlantAddress;
	public String methodOfIssue;
	public int methodApproved;
	public int methodInMonth;
	public int methodInYear;
	public int periodDuration;
	public int frequencyIndex;
	public String remarks;
	public int averageStbQuantityIndex;
	public int maxMonthQuantityIndex;
	public int averageStmQuantityIndex;
	public int accumulatedMonthQuantityIndex;
	public int latestOtherIndex1;
	public int latestOtherIndex2;
	public int latestOtherIndex3;
	public long latestCOPReportDate;
	public long latestInspectionRecordDate;
	public int latestNumberOfInspectionInYear;
	public int latestNumberOfInspectionInMonth;
	public int latestNumberOfStampInMonth;
	public long periodStartFrom;
	public int totalInspection;
	public String flowIndex;
	public long modifyDate;
	public long syncDate;
}