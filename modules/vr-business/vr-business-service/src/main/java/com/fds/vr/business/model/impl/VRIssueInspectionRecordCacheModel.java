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

import com.fds.vr.business.model.VRIssueInspectionRecord;

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
 * The cache model class for representing VRIssueInspectionRecord in entity cache.
 *
 * @author LamTV
 * @see VRIssueInspectionRecord
 * @generated
 */
@ProviderType
public class VRIssueInspectionRecordCacheModel implements CacheModel<VRIssueInspectionRecord>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRIssueInspectionRecordCacheModel)) {
			return false;
		}

		VRIssueInspectionRecordCacheModel vrIssueInspectionRecordCacheModel = (VRIssueInspectionRecordCacheModel)obj;

		if (id == vrIssueInspectionRecordCacheModel.id) {
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
		StringBundler sb = new StringBundler(49);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", issueId=");
		sb.append(issueId);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", certificateId=");
		sb.append(certificateId);
		sb.append(", totalQuantity=");
		sb.append(totalQuantity);
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
		sb.append(", issueCorporationId=");
		sb.append(issueCorporationId);
		sb.append(", verifyCorporationId=");
		sb.append(verifyCorporationId);
		sb.append(", inspectorId=");
		sb.append(inspectorId);
		sb.append(", issueInspectorId=");
		sb.append(issueInspectorId);
		sb.append(", verifyInspectorId=");
		sb.append(verifyInspectorId);
		sb.append(", digitalIssueStatus=");
		sb.append(digitalIssueStatus);
		sb.append(", validRemarks=");
		sb.append(validRemarks);
		sb.append(", validInspectionNote=");
		sb.append(validInspectionNote);
		sb.append(", documentFileEntryid=");
		sb.append(documentFileEntryid);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRIssueInspectionRecord toEntityModel() {
		VRIssueInspectionRecordImpl vrIssueInspectionRecordImpl = new VRIssueInspectionRecordImpl();

		vrIssueInspectionRecordImpl.setId(id);
		vrIssueInspectionRecordImpl.setMtCore(mtCore);
		vrIssueInspectionRecordImpl.setIssueId(issueId);
		vrIssueInspectionRecordImpl.setDossierId(dossierId);
		vrIssueInspectionRecordImpl.setCertificateId(certificateId);
		vrIssueInspectionRecordImpl.setTotalQuantity(totalQuantity);

		if (postReview == null) {
			vrIssueInspectionRecordImpl.setPostReview(StringPool.BLANK);
		}
		else {
			vrIssueInspectionRecordImpl.setPostReview(postReview);
		}

		if (postReviewRecordNo == null) {
			vrIssueInspectionRecordImpl.setPostReviewRecordNo(StringPool.BLANK);
		}
		else {
			vrIssueInspectionRecordImpl.setPostReviewRecordNo(postReviewRecordNo);
		}

		if (postReviewRecordDate == Long.MIN_VALUE) {
			vrIssueInspectionRecordImpl.setPostReviewRecordDate(null);
		}
		else {
			vrIssueInspectionRecordImpl.setPostReviewRecordDate(new Date(
					postReviewRecordDate));
		}

		vrIssueInspectionRecordImpl.setCorporationId(corporationId);

		if (inspectorCode == null) {
			vrIssueInspectionRecordImpl.setInspectorCode(StringPool.BLANK);
		}
		else {
			vrIssueInspectionRecordImpl.setInspectorCode(inspectorCode);
		}

		if (inspectorName == null) {
			vrIssueInspectionRecordImpl.setInspectorName(StringPool.BLANK);
		}
		else {
			vrIssueInspectionRecordImpl.setInspectorName(inspectorName);
		}

		if (leaderName == null) {
			vrIssueInspectionRecordImpl.setLeaderName(StringPool.BLANK);
		}
		else {
			vrIssueInspectionRecordImpl.setLeaderName(leaderName);
		}

		vrIssueInspectionRecordImpl.setIssueCorporationId(issueCorporationId);
		vrIssueInspectionRecordImpl.setVerifyCorporationId(verifyCorporationId);
		vrIssueInspectionRecordImpl.setInspectorId(inspectorId);
		vrIssueInspectionRecordImpl.setIssueInspectorId(issueInspectorId);
		vrIssueInspectionRecordImpl.setVerifyInspectorId(verifyInspectorId);

		if (digitalIssueStatus == null) {
			vrIssueInspectionRecordImpl.setDigitalIssueStatus(StringPool.BLANK);
		}
		else {
			vrIssueInspectionRecordImpl.setDigitalIssueStatus(digitalIssueStatus);
		}

		if (validRemarks == null) {
			vrIssueInspectionRecordImpl.setValidRemarks(StringPool.BLANK);
		}
		else {
			vrIssueInspectionRecordImpl.setValidRemarks(validRemarks);
		}

		if (validInspectionNote == null) {
			vrIssueInspectionRecordImpl.setValidInspectionNote(StringPool.BLANK);
		}
		else {
			vrIssueInspectionRecordImpl.setValidInspectionNote(validInspectionNote);
		}

		vrIssueInspectionRecordImpl.setDocumentFileEntryid(documentFileEntryid);

		if (modifyDate == Long.MIN_VALUE) {
			vrIssueInspectionRecordImpl.setModifyDate(null);
		}
		else {
			vrIssueInspectionRecordImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrIssueInspectionRecordImpl.setSyncDate(null);
		}
		else {
			vrIssueInspectionRecordImpl.setSyncDate(new Date(syncDate));
		}

		vrIssueInspectionRecordImpl.resetOriginalValues();

		return vrIssueInspectionRecordImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		issueId = objectInput.readLong();

		dossierId = objectInput.readLong();

		certificateId = objectInput.readLong();

		totalQuantity = objectInput.readInt();
		postReview = objectInput.readUTF();
		postReviewRecordNo = objectInput.readUTF();
		postReviewRecordDate = objectInput.readLong();

		corporationId = objectInput.readLong();
		inspectorCode = objectInput.readUTF();
		inspectorName = objectInput.readUTF();
		leaderName = objectInput.readUTF();

		issueCorporationId = objectInput.readLong();

		verifyCorporationId = objectInput.readLong();

		inspectorId = objectInput.readLong();

		issueInspectorId = objectInput.readLong();

		verifyInspectorId = objectInput.readLong();
		digitalIssueStatus = objectInput.readUTF();
		validRemarks = objectInput.readUTF();
		validInspectionNote = objectInput.readUTF();

		documentFileEntryid = objectInput.readLong();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(issueId);

		objectOutput.writeLong(dossierId);

		objectOutput.writeLong(certificateId);

		objectOutput.writeInt(totalQuantity);

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

		objectOutput.writeLong(corporationId);

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

		objectOutput.writeLong(issueCorporationId);

		objectOutput.writeLong(verifyCorporationId);

		objectOutput.writeLong(inspectorId);

		objectOutput.writeLong(issueInspectorId);

		objectOutput.writeLong(verifyInspectorId);

		if (digitalIssueStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(digitalIssueStatus);
		}

		if (validRemarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(validRemarks);
		}

		if (validInspectionNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(validInspectionNote);
		}

		objectOutput.writeLong(documentFileEntryid);
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public long issueId;
	public long dossierId;
	public long certificateId;
	public int totalQuantity;
	public String postReview;
	public String postReviewRecordNo;
	public long postReviewRecordDate;
	public long corporationId;
	public String inspectorCode;
	public String inspectorName;
	public String leaderName;
	public long issueCorporationId;
	public long verifyCorporationId;
	public long inspectorId;
	public long issueInspectorId;
	public long verifyInspectorId;
	public String digitalIssueStatus;
	public String validRemarks;
	public String validInspectionNote;
	public long documentFileEntryid;
	public long modifyDate;
	public long syncDate;
}