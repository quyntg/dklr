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

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRIssueInspectionRecordSoap implements Serializable {
	public static VRIssueInspectionRecordSoap toSoapModel(
		VRIssueInspectionRecord model) {
		VRIssueInspectionRecordSoap soapModel = new VRIssueInspectionRecordSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setIssueId(model.getIssueId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setCertificateId(model.getCertificateId());
		soapModel.setTotalQuantity(model.getTotalQuantity());
		soapModel.setPostReview(model.getPostReview());
		soapModel.setPostReviewRecordNo(model.getPostReviewRecordNo());
		soapModel.setPostReviewRecordDate(model.getPostReviewRecordDate());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setInspectorCode(model.getInspectorCode());
		soapModel.setInspectorName(model.getInspectorName());
		soapModel.setLeaderName(model.getLeaderName());
		soapModel.setIssueCorporationId(model.getIssueCorporationId());
		soapModel.setVerifyCorporationId(model.getVerifyCorporationId());
		soapModel.setInspectorId(model.getInspectorId());
		soapModel.setIssueInspectorId(model.getIssueInspectorId());
		soapModel.setVerifyInspectorId(model.getVerifyInspectorId());
		soapModel.setDigitalIssueStatus(model.getDigitalIssueStatus());
		soapModel.setValidRemarks(model.getValidRemarks());
		soapModel.setValidInspectionNote(model.getValidInspectionNote());
		soapModel.setDocumentFileEntryid(model.getDocumentFileEntryid());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRIssueInspectionRecordSoap[] toSoapModels(
		VRIssueInspectionRecord[] models) {
		VRIssueInspectionRecordSoap[] soapModels = new VRIssueInspectionRecordSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRIssueInspectionRecordSoap[][] toSoapModels(
		VRIssueInspectionRecord[][] models) {
		VRIssueInspectionRecordSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRIssueInspectionRecordSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRIssueInspectionRecordSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRIssueInspectionRecordSoap[] toSoapModels(
		List<VRIssueInspectionRecord> models) {
		List<VRIssueInspectionRecordSoap> soapModels = new ArrayList<VRIssueInspectionRecordSoap>(models.size());

		for (VRIssueInspectionRecord model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRIssueInspectionRecordSoap[soapModels.size()]);
	}

	public VRIssueInspectionRecordSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getMtCore() {
		return _mtCore;
	}

	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	public long getIssueId() {
		return _issueId;
	}

	public void setIssueId(long issueId) {
		_issueId = issueId;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public long getCertificateId() {
		return _certificateId;
	}

	public void setCertificateId(long certificateId) {
		_certificateId = certificateId;
	}

	public int getTotalQuantity() {
		return _totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		_totalQuantity = totalQuantity;
	}

	public String getPostReview() {
		return _postReview;
	}

	public void setPostReview(String postReview) {
		_postReview = postReview;
	}

	public String getPostReviewRecordNo() {
		return _postReviewRecordNo;
	}

	public void setPostReviewRecordNo(String postReviewRecordNo) {
		_postReviewRecordNo = postReviewRecordNo;
	}

	public Date getPostReviewRecordDate() {
		return _postReviewRecordDate;
	}

	public void setPostReviewRecordDate(Date postReviewRecordDate) {
		_postReviewRecordDate = postReviewRecordDate;
	}

	public long getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(long corporationId) {
		_corporationId = corporationId;
	}

	public String getInspectorCode() {
		return _inspectorCode;
	}

	public void setInspectorCode(String inspectorCode) {
		_inspectorCode = inspectorCode;
	}

	public String getInspectorName() {
		return _inspectorName;
	}

	public void setInspectorName(String inspectorName) {
		_inspectorName = inspectorName;
	}

	public String getLeaderName() {
		return _leaderName;
	}

	public void setLeaderName(String leaderName) {
		_leaderName = leaderName;
	}

	public long getIssueCorporationId() {
		return _issueCorporationId;
	}

	public void setIssueCorporationId(long issueCorporationId) {
		_issueCorporationId = issueCorporationId;
	}

	public long getVerifyCorporationId() {
		return _verifyCorporationId;
	}

	public void setVerifyCorporationId(long verifyCorporationId) {
		_verifyCorporationId = verifyCorporationId;
	}

	public long getInspectorId() {
		return _inspectorId;
	}

	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;
	}

	public long getIssueInspectorId() {
		return _issueInspectorId;
	}

	public void setIssueInspectorId(long issueInspectorId) {
		_issueInspectorId = issueInspectorId;
	}

	public long getVerifyInspectorId() {
		return _verifyInspectorId;
	}

	public void setVerifyInspectorId(long verifyInspectorId) {
		_verifyInspectorId = verifyInspectorId;
	}

	public String getDigitalIssueStatus() {
		return _digitalIssueStatus;
	}

	public void setDigitalIssueStatus(String digitalIssueStatus) {
		_digitalIssueStatus = digitalIssueStatus;
	}

	public String getValidRemarks() {
		return _validRemarks;
	}

	public void setValidRemarks(String validRemarks) {
		_validRemarks = validRemarks;
	}

	public String getValidInspectionNote() {
		return _validInspectionNote;
	}

	public void setValidInspectionNote(String validInspectionNote) {
		_validInspectionNote = validInspectionNote;
	}

	public long getDocumentFileEntryid() {
		return _documentFileEntryid;
	}

	public void setDocumentFileEntryid(long documentFileEntryid) {
		_documentFileEntryid = documentFileEntryid;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private long _mtCore;
	private long _issueId;
	private long _dossierId;
	private long _certificateId;
	private int _totalQuantity;
	private String _postReview;
	private String _postReviewRecordNo;
	private Date _postReviewRecordDate;
	private long _corporationId;
	private String _inspectorCode;
	private String _inspectorName;
	private String _leaderName;
	private long _issueCorporationId;
	private long _verifyCorporationId;
	private long _inspectorId;
	private long _issueInspectorId;
	private long _verifyInspectorId;
	private String _digitalIssueStatus;
	private String _validRemarks;
	private String _validInspectionNote;
	private long _documentFileEntryid;
	private Date _modifyDate;
	private Date _syncDate;
}