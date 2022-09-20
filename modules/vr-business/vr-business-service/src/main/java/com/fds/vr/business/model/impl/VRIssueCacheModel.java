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

import com.fds.vr.business.model.VRIssue;

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
 * The cache model class for representing VRIssue in entity cache.
 *
 * @author LamTV
 * @see VRIssue
 * @generated
 */
@ProviderType
public class VRIssueCacheModel implements CacheModel<VRIssue>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRIssueCacheModel)) {
			return false;
		}

		VRIssueCacheModel vrIssueCacheModel = (VRIssueCacheModel)obj;

		if (id == vrIssueCacheModel.id) {
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
		StringBundler sb = new StringBundler(123);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", stampIssueNo=");
		sb.append(stampIssueNo);
		sb.append(", appliedDate=");
		sb.append(appliedDate);
		sb.append(", approvedDate=");
		sb.append(approvedDate);
		sb.append(", vehicleClass=");
		sb.append(vehicleClass);
		sb.append(", applicantProfileId=");
		sb.append(applicantProfileId);
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", applicantAddress=");
		sb.append(applicantAddress);
		sb.append(", applicantRepresentative=");
		sb.append(applicantRepresentative);
		sb.append(", applicantRepresentativeTitle=");
		sb.append(applicantRepresentativeTitle);
		sb.append(", applicantEmail=");
		sb.append(applicantEmail);
		sb.append(", applicantPhone=");
		sb.append(applicantPhone);
		sb.append(", applicantFax=");
		sb.append(applicantFax);
		sb.append(", applicantContactName=");
		sb.append(applicantContactName);
		sb.append(", applicantContactEmail=");
		sb.append(applicantContactEmail);
		sb.append(", applicantContactPhone=");
		sb.append(applicantContactPhone);
		sb.append(", productionPlantId=");
		sb.append(productionPlantId);
		sb.append(", productionPlantCode=");
		sb.append(productionPlantCode);
		sb.append(", productionPlantName=");
		sb.append(productionPlantName);
		sb.append(", productionPlantAddress=");
		sb.append(productionPlantAddress);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", methodOfIssue=");
		sb.append(methodOfIssue);
		sb.append(", totalInDocument=");
		sb.append(totalInDocument);
		sb.append(", issueCorporationId=");
		sb.append(issueCorporationId);
		sb.append(", verifyCorporationId=");
		sb.append(verifyCorporationId);
		sb.append(", digitalIssueStatus=");
		sb.append(digitalIssueStatus);
		sb.append(", issueType=");
		sb.append(issueType);
		sb.append(", averageSTBQuantity=");
		sb.append(averageSTBQuantity);
		sb.append(", maxMonthQuantity=");
		sb.append(maxMonthQuantity);
		sb.append(", averageSTMQuantity=");
		sb.append(averageSTMQuantity);
		sb.append(", accumulatedMonthQuantity=");
		sb.append(accumulatedMonthQuantity);
		sb.append(", totalInUse=");
		sb.append(totalInUse);
		sb.append(", totalCancelled=");
		sb.append(totalCancelled);
		sb.append(", totalLost=");
		sb.append(totalLost);
		sb.append(", totalNotUsed=");
		sb.append(totalNotUsed);
		sb.append(", totalReturned=");
		sb.append(totalReturned);
		sb.append(", flow=");
		sb.append(flow);
		sb.append(", examinationRequired=");
		sb.append(examinationRequired);
		sb.append(", examinationPeriod=");
		sb.append(examinationPeriod);
		sb.append(", examinationLastTime=");
		sb.append(examinationLastTime);
		sb.append(", copResult=");
		sb.append(copResult);
		sb.append(", copReportNo=");
		sb.append(copReportNo);
		sb.append(", copReportDate=");
		sb.append(copReportDate);
		sb.append(", postReview=");
		sb.append(postReview);
		sb.append(", postReviewRecordNo=");
		sb.append(postReviewRecordNo);
		sb.append(", postReviewRecordDate=");
		sb.append(postReviewRecordDate);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", inspectorCode=");
		sb.append(inspectorCode);
		sb.append(", inspectorName=");
		sb.append(inspectorName);
		sb.append(", leaderName=");
		sb.append(leaderName);
		sb.append(", applicantMaker=");
		sb.append(applicantMaker);
		sb.append(", applicantChecker=");
		sb.append(applicantChecker);
		sb.append(", inspectorId=");
		sb.append(inspectorId);
		sb.append(", issueInspectorId=");
		sb.append(issueInspectorId);
		sb.append(", verifyInspectorId=");
		sb.append(verifyInspectorId);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append(", certifiedAssemblyType=");
		sb.append(certifiedAssemblyType);
		sb.append(", certifiedAssemblyTypeDescription=");
		sb.append(certifiedAssemblyTypeDescription);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRIssue toEntityModel() {
		VRIssueImpl vrIssueImpl = new VRIssueImpl();

		vrIssueImpl.setId(id);
		vrIssueImpl.setMtCore(mtCore);
		vrIssueImpl.setDossierId(dossierId);

		if (stampIssueNo == null) {
			vrIssueImpl.setStampIssueNo(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setStampIssueNo(stampIssueNo);
		}

		if (appliedDate == Long.MIN_VALUE) {
			vrIssueImpl.setAppliedDate(null);
		}
		else {
			vrIssueImpl.setAppliedDate(new Date(appliedDate));
		}

		if (approvedDate == Long.MIN_VALUE) {
			vrIssueImpl.setApprovedDate(null);
		}
		else {
			vrIssueImpl.setApprovedDate(new Date(approvedDate));
		}

		if (vehicleClass == null) {
			vrIssueImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setVehicleClass(vehicleClass);
		}

		vrIssueImpl.setApplicantProfileId(applicantProfileId);

		if (applicantName == null) {
			vrIssueImpl.setApplicantName(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setApplicantName(applicantName);
		}

		if (applicantAddress == null) {
			vrIssueImpl.setApplicantAddress(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setApplicantAddress(applicantAddress);
		}

		if (applicantRepresentative == null) {
			vrIssueImpl.setApplicantRepresentative(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setApplicantRepresentative(applicantRepresentative);
		}

		if (applicantRepresentativeTitle == null) {
			vrIssueImpl.setApplicantRepresentativeTitle(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
		}

		if (applicantEmail == null) {
			vrIssueImpl.setApplicantEmail(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setApplicantEmail(applicantEmail);
		}

		if (applicantPhone == null) {
			vrIssueImpl.setApplicantPhone(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setApplicantPhone(applicantPhone);
		}

		if (applicantFax == null) {
			vrIssueImpl.setApplicantFax(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setApplicantFax(applicantFax);
		}

		if (applicantContactName == null) {
			vrIssueImpl.setApplicantContactName(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setApplicantContactName(applicantContactName);
		}

		if (applicantContactEmail == null) {
			vrIssueImpl.setApplicantContactEmail(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setApplicantContactEmail(applicantContactEmail);
		}

		if (applicantContactPhone == null) {
			vrIssueImpl.setApplicantContactPhone(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setApplicantContactPhone(applicantContactPhone);
		}

		vrIssueImpl.setProductionPlantId(productionPlantId);

		if (productionPlantCode == null) {
			vrIssueImpl.setProductionPlantCode(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setProductionPlantCode(productionPlantCode);
		}

		if (productionPlantName == null) {
			vrIssueImpl.setProductionPlantName(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setProductionPlantName(productionPlantName);
		}

		if (productionPlantAddress == null) {
			vrIssueImpl.setProductionPlantAddress(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setProductionPlantAddress(productionPlantAddress);
		}

		if (remarks == null) {
			vrIssueImpl.setRemarks(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setRemarks(remarks);
		}

		if (methodOfIssue == null) {
			vrIssueImpl.setMethodOfIssue(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setMethodOfIssue(methodOfIssue);
		}

		vrIssueImpl.setTotalInDocument(totalInDocument);
		vrIssueImpl.setIssueCorporationId(issueCorporationId);

		if (verifyCorporationId == null) {
			vrIssueImpl.setVerifyCorporationId(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setVerifyCorporationId(verifyCorporationId);
		}

		vrIssueImpl.setDigitalIssueStatus(digitalIssueStatus);

		if (issueType == null) {
			vrIssueImpl.setIssueType(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setIssueType(issueType);
		}

		vrIssueImpl.setAverageSTBQuantity(averageSTBQuantity);
		vrIssueImpl.setMaxMonthQuantity(maxMonthQuantity);
		vrIssueImpl.setAverageSTMQuantity(averageSTMQuantity);
		vrIssueImpl.setAccumulatedMonthQuantity(accumulatedMonthQuantity);
		vrIssueImpl.setTotalInUse(totalInUse);
		vrIssueImpl.setTotalCancelled(totalCancelled);
		vrIssueImpl.setTotalLost(totalLost);
		vrIssueImpl.setTotalNotUsed(totalNotUsed);
		vrIssueImpl.setTotalReturned(totalReturned);

		if (flow == null) {
			vrIssueImpl.setFlow(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setFlow(flow);
		}

		if (examinationRequired == null) {
			vrIssueImpl.setExaminationRequired(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setExaminationRequired(examinationRequired);
		}

		if (examinationPeriod == null) {
			vrIssueImpl.setExaminationPeriod(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setExaminationPeriod(examinationPeriod);
		}

		if (examinationLastTime == Long.MIN_VALUE) {
			vrIssueImpl.setExaminationLastTime(null);
		}
		else {
			vrIssueImpl.setExaminationLastTime(new Date(examinationLastTime));
		}

		if (copResult == null) {
			vrIssueImpl.setCopResult(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setCopResult(copResult);
		}

		if (copReportNo == null) {
			vrIssueImpl.setCopReportNo(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setCopReportNo(copReportNo);
		}

		if (copReportDate == Long.MIN_VALUE) {
			vrIssueImpl.setCopReportDate(null);
		}
		else {
			vrIssueImpl.setCopReportDate(new Date(copReportDate));
		}

		if (postReview == null) {
			vrIssueImpl.setPostReview(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setPostReview(postReview);
		}

		if (postReviewRecordNo == null) {
			vrIssueImpl.setPostReviewRecordNo(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setPostReviewRecordNo(postReviewRecordNo);
		}

		if (postReviewRecordDate == Long.MIN_VALUE) {
			vrIssueImpl.setPostReviewRecordDate(null);
		}
		else {
			vrIssueImpl.setPostReviewRecordDate(new Date(postReviewRecordDate));
		}

		if (corporationId == null) {
			vrIssueImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setCorporationId(corporationId);
		}

		if (inspectorCode == null) {
			vrIssueImpl.setInspectorCode(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setInspectorCode(inspectorCode);
		}

		if (inspectorName == null) {
			vrIssueImpl.setInspectorName(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setInspectorName(inspectorName);
		}

		if (leaderName == null) {
			vrIssueImpl.setLeaderName(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setLeaderName(leaderName);
		}

		if (applicantMaker == null) {
			vrIssueImpl.setApplicantMaker(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setApplicantMaker(applicantMaker);
		}

		if (applicantChecker == null) {
			vrIssueImpl.setApplicantChecker(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setApplicantChecker(applicantChecker);
		}

		vrIssueImpl.setInspectorId(inspectorId);
		vrIssueImpl.setIssueInspectorId(issueInspectorId);
		vrIssueImpl.setVerifyInspectorId(verifyInspectorId);

		if (modifyDate == Long.MIN_VALUE) {
			vrIssueImpl.setModifyDate(null);
		}
		else {
			vrIssueImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrIssueImpl.setSyncDate(null);
		}
		else {
			vrIssueImpl.setSyncDate(new Date(syncDate));
		}

		if (certifiedAssemblyType == null) {
			vrIssueImpl.setCertifiedAssemblyType(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setCertifiedAssemblyType(certifiedAssemblyType);
		}

		if (certifiedAssemblyTypeDescription == null) {
			vrIssueImpl.setCertifiedAssemblyTypeDescription(StringPool.BLANK);
		}
		else {
			vrIssueImpl.setCertifiedAssemblyTypeDescription(certifiedAssemblyTypeDescription);
		}

		vrIssueImpl.resetOriginalValues();

		return vrIssueImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		dossierId = objectInput.readLong();
		stampIssueNo = objectInput.readUTF();
		appliedDate = objectInput.readLong();
		approvedDate = objectInput.readLong();
		vehicleClass = objectInput.readUTF();

		applicantProfileId = objectInput.readLong();
		applicantName = objectInput.readUTF();
		applicantAddress = objectInput.readUTF();
		applicantRepresentative = objectInput.readUTF();
		applicantRepresentativeTitle = objectInput.readUTF();
		applicantEmail = objectInput.readUTF();
		applicantPhone = objectInput.readUTF();
		applicantFax = objectInput.readUTF();
		applicantContactName = objectInput.readUTF();
		applicantContactEmail = objectInput.readUTF();
		applicantContactPhone = objectInput.readUTF();

		productionPlantId = objectInput.readLong();
		productionPlantCode = objectInput.readUTF();
		productionPlantName = objectInput.readUTF();
		productionPlantAddress = objectInput.readUTF();
		remarks = objectInput.readUTF();
		methodOfIssue = objectInput.readUTF();

		totalInDocument = objectInput.readLong();

		issueCorporationId = objectInput.readLong();
		verifyCorporationId = objectInput.readUTF();

		digitalIssueStatus = objectInput.readInt();
		issueType = objectInput.readUTF();

		averageSTBQuantity = objectInput.readInt();

		maxMonthQuantity = objectInput.readInt();

		averageSTMQuantity = objectInput.readInt();

		accumulatedMonthQuantity = objectInput.readInt();

		totalInUse = objectInput.readInt();

		totalCancelled = objectInput.readInt();

		totalLost = objectInput.readInt();

		totalNotUsed = objectInput.readInt();

		totalReturned = objectInput.readInt();
		flow = objectInput.readUTF();
		examinationRequired = objectInput.readUTF();
		examinationPeriod = objectInput.readUTF();
		examinationLastTime = objectInput.readLong();
		copResult = objectInput.readUTF();
		copReportNo = objectInput.readUTF();
		copReportDate = objectInput.readLong();
		postReview = objectInput.readUTF();
		postReviewRecordNo = objectInput.readUTF();
		postReviewRecordDate = objectInput.readLong();
		corporationId = objectInput.readUTF();
		inspectorCode = objectInput.readUTF();
		inspectorName = objectInput.readUTF();
		leaderName = objectInput.readUTF();
		applicantMaker = objectInput.readUTF();
		applicantChecker = objectInput.readUTF();

		inspectorId = objectInput.readLong();

		issueInspectorId = objectInput.readLong();

		verifyInspectorId = objectInput.readLong();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
		certifiedAssemblyType = objectInput.readUTF();
		certifiedAssemblyTypeDescription = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(dossierId);

		if (stampIssueNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stampIssueNo);
		}

		objectOutput.writeLong(appliedDate);
		objectOutput.writeLong(approvedDate);

		if (vehicleClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleClass);
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

		if (applicantRepresentative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantRepresentative);
		}

		if (applicantRepresentativeTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantRepresentativeTitle);
		}

		if (applicantEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantEmail);
		}

		if (applicantPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantPhone);
		}

		if (applicantFax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantFax);
		}

		if (applicantContactName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantContactName);
		}

		if (applicantContactEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantContactEmail);
		}

		if (applicantContactPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantContactPhone);
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

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (methodOfIssue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(methodOfIssue);
		}

		objectOutput.writeLong(totalInDocument);

		objectOutput.writeLong(issueCorporationId);

		if (verifyCorporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(verifyCorporationId);
		}

		objectOutput.writeInt(digitalIssueStatus);

		if (issueType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issueType);
		}

		objectOutput.writeInt(averageSTBQuantity);

		objectOutput.writeInt(maxMonthQuantity);

		objectOutput.writeInt(averageSTMQuantity);

		objectOutput.writeInt(accumulatedMonthQuantity);

		objectOutput.writeInt(totalInUse);

		objectOutput.writeInt(totalCancelled);

		objectOutput.writeInt(totalLost);

		objectOutput.writeInt(totalNotUsed);

		objectOutput.writeInt(totalReturned);

		if (flow == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(flow);
		}

		if (examinationRequired == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(examinationRequired);
		}

		if (examinationPeriod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(examinationPeriod);
		}

		objectOutput.writeLong(examinationLastTime);

		if (copResult == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copResult);
		}

		if (copReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportNo);
		}

		objectOutput.writeLong(copReportDate);

		if (postReview == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(postReview);
		}

		if (postReviewRecordNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(postReviewRecordNo);
		}

		objectOutput.writeLong(postReviewRecordDate);

		if (corporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationId);
		}

		if (inspectorCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorCode);
		}

		if (inspectorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorName);
		}

		if (leaderName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(leaderName);
		}

		if (applicantMaker == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantMaker);
		}

		if (applicantChecker == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantChecker);
		}

		objectOutput.writeLong(inspectorId);

		objectOutput.writeLong(issueInspectorId);

		objectOutput.writeLong(verifyInspectorId);
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);

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
	}

	public long id;
	public long mtCore;
	public long dossierId;
	public String stampIssueNo;
	public long appliedDate;
	public long approvedDate;
	public String vehicleClass;
	public long applicantProfileId;
	public String applicantName;
	public String applicantAddress;
	public String applicantRepresentative;
	public String applicantRepresentativeTitle;
	public String applicantEmail;
	public String applicantPhone;
	public String applicantFax;
	public String applicantContactName;
	public String applicantContactEmail;
	public String applicantContactPhone;
	public long productionPlantId;
	public String productionPlantCode;
	public String productionPlantName;
	public String productionPlantAddress;
	public String remarks;
	public String methodOfIssue;
	public long totalInDocument;
	public long issueCorporationId;
	public String verifyCorporationId;
	public int digitalIssueStatus;
	public String issueType;
	public int averageSTBQuantity;
	public int maxMonthQuantity;
	public int averageSTMQuantity;
	public int accumulatedMonthQuantity;
	public int totalInUse;
	public int totalCancelled;
	public int totalLost;
	public int totalNotUsed;
	public int totalReturned;
	public String flow;
	public String examinationRequired;
	public String examinationPeriod;
	public long examinationLastTime;
	public String copResult;
	public String copReportNo;
	public long copReportDate;
	public String postReview;
	public String postReviewRecordNo;
	public long postReviewRecordDate;
	public String corporationId;
	public String inspectorCode;
	public String inspectorName;
	public String leaderName;
	public String applicantMaker;
	public String applicantChecker;
	public long inspectorId;
	public long issueInspectorId;
	public long verifyInspectorId;
	public long modifyDate;
	public long syncDate;
	public String certifiedAssemblyType;
	public String certifiedAssemblyTypeDescription;
}