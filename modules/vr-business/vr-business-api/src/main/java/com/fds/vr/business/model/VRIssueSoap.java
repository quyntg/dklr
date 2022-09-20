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
public class VRIssueSoap implements Serializable {
	public static VRIssueSoap toSoapModel(VRIssue model) {
		VRIssueSoap soapModel = new VRIssueSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setStampIssueNo(model.getStampIssueNo());
		soapModel.setAppliedDate(model.getAppliedDate());
		soapModel.setApprovedDate(model.getApprovedDate());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setApplicantProfileId(model.getApplicantProfileId());
		soapModel.setApplicantName(model.getApplicantName());
		soapModel.setApplicantAddress(model.getApplicantAddress());
		soapModel.setApplicantRepresentative(model.getApplicantRepresentative());
		soapModel.setApplicantRepresentativeTitle(model.getApplicantRepresentativeTitle());
		soapModel.setApplicantEmail(model.getApplicantEmail());
		soapModel.setApplicantPhone(model.getApplicantPhone());
		soapModel.setApplicantFax(model.getApplicantFax());
		soapModel.setApplicantContactName(model.getApplicantContactName());
		soapModel.setApplicantContactEmail(model.getApplicantContactEmail());
		soapModel.setApplicantContactPhone(model.getApplicantContactPhone());
		soapModel.setProductionPlantId(model.getProductionPlantId());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());
		soapModel.setProductionPlantName(model.getProductionPlantName());
		soapModel.setProductionPlantAddress(model.getProductionPlantAddress());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setMethodOfIssue(model.getMethodOfIssue());
		soapModel.setTotalInDocument(model.getTotalInDocument());
		soapModel.setIssueCorporationId(model.getIssueCorporationId());
		soapModel.setVerifyCorporationId(model.getVerifyCorporationId());
		soapModel.setDigitalIssueStatus(model.getDigitalIssueStatus());
		soapModel.setIssueType(model.getIssueType());
		soapModel.setAverageSTBQuantity(model.getAverageSTBQuantity());
		soapModel.setMaxMonthQuantity(model.getMaxMonthQuantity());
		soapModel.setAverageSTMQuantity(model.getAverageSTMQuantity());
		soapModel.setAccumulatedMonthQuantity(model.getAccumulatedMonthQuantity());
		soapModel.setTotalInUse(model.getTotalInUse());
		soapModel.setTotalCancelled(model.getTotalCancelled());
		soapModel.setTotalLost(model.getTotalLost());
		soapModel.setTotalNotUsed(model.getTotalNotUsed());
		soapModel.setTotalReturned(model.getTotalReturned());
		soapModel.setFlow(model.getFlow());
		soapModel.setExaminationRequired(model.getExaminationRequired());
		soapModel.setExaminationPeriod(model.getExaminationPeriod());
		soapModel.setExaminationLastTime(model.getExaminationLastTime());
		soapModel.setCopResult(model.getCopResult());
		soapModel.setCopReportNo(model.getCopReportNo());
		soapModel.setCopReportDate(model.getCopReportDate());
		soapModel.setPostReview(model.getPostReview());
		soapModel.setPostReviewRecordNo(model.getPostReviewRecordNo());
		soapModel.setPostReviewRecordDate(model.getPostReviewRecordDate());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setInspectorCode(model.getInspectorCode());
		soapModel.setInspectorName(model.getInspectorName());
		soapModel.setLeaderName(model.getLeaderName());
		soapModel.setApplicantMaker(model.getApplicantMaker());
		soapModel.setApplicantChecker(model.getApplicantChecker());
		soapModel.setInspectorId(model.getInspectorId());
		soapModel.setIssueInspectorId(model.getIssueInspectorId());
		soapModel.setVerifyInspectorId(model.getVerifyInspectorId());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());
		soapModel.setCertifiedAssemblyType(model.getCertifiedAssemblyType());
		soapModel.setCertifiedAssemblyTypeDescription(model.getCertifiedAssemblyTypeDescription());

		return soapModel;
	}

	public static VRIssueSoap[] toSoapModels(VRIssue[] models) {
		VRIssueSoap[] soapModels = new VRIssueSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRIssueSoap[][] toSoapModels(VRIssue[][] models) {
		VRIssueSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRIssueSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRIssueSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRIssueSoap[] toSoapModels(List<VRIssue> models) {
		List<VRIssueSoap> soapModels = new ArrayList<VRIssueSoap>(models.size());

		for (VRIssue model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRIssueSoap[soapModels.size()]);
	}

	public VRIssueSoap() {
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

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getStampIssueNo() {
		return _stampIssueNo;
	}

	public void setStampIssueNo(String stampIssueNo) {
		_stampIssueNo = stampIssueNo;
	}

	public Date getAppliedDate() {
		return _appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		_appliedDate = appliedDate;
	}

	public Date getApprovedDate() {
		return _approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;
	}

	public String getVehicleClass() {
		return _vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	public long getApplicantProfileId() {
		return _applicantProfileId;
	}

	public void setApplicantProfileId(long applicantProfileId) {
		_applicantProfileId = applicantProfileId;
	}

	public String getApplicantName() {
		return _applicantName;
	}

	public void setApplicantName(String applicantName) {
		_applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return _applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		_applicantAddress = applicantAddress;
	}

	public String getApplicantRepresentative() {
		return _applicantRepresentative;
	}

	public void setApplicantRepresentative(String applicantRepresentative) {
		_applicantRepresentative = applicantRepresentative;
	}

	public String getApplicantRepresentativeTitle() {
		return _applicantRepresentativeTitle;
	}

	public void setApplicantRepresentativeTitle(
		String applicantRepresentativeTitle) {
		_applicantRepresentativeTitle = applicantRepresentativeTitle;
	}

	public String getApplicantEmail() {
		return _applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		_applicantEmail = applicantEmail;
	}

	public String getApplicantPhone() {
		return _applicantPhone;
	}

	public void setApplicantPhone(String applicantPhone) {
		_applicantPhone = applicantPhone;
	}

	public String getApplicantFax() {
		return _applicantFax;
	}

	public void setApplicantFax(String applicantFax) {
		_applicantFax = applicantFax;
	}

	public String getApplicantContactName() {
		return _applicantContactName;
	}

	public void setApplicantContactName(String applicantContactName) {
		_applicantContactName = applicantContactName;
	}

	public String getApplicantContactEmail() {
		return _applicantContactEmail;
	}

	public void setApplicantContactEmail(String applicantContactEmail) {
		_applicantContactEmail = applicantContactEmail;
	}

	public String getApplicantContactPhone() {
		return _applicantContactPhone;
	}

	public void setApplicantContactPhone(String applicantContactPhone) {
		_applicantContactPhone = applicantContactPhone;
	}

	public long getProductionPlantId() {
		return _productionPlantId;
	}

	public void setProductionPlantId(long productionPlantId) {
		_productionPlantId = productionPlantId;
	}

	public String getProductionPlantCode() {
		return _productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		_productionPlantCode = productionPlantCode;
	}

	public String getProductionPlantName() {
		return _productionPlantName;
	}

	public void setProductionPlantName(String productionPlantName) {
		_productionPlantName = productionPlantName;
	}

	public String getProductionPlantAddress() {
		return _productionPlantAddress;
	}

	public void setProductionPlantAddress(String productionPlantAddress) {
		_productionPlantAddress = productionPlantAddress;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getMethodOfIssue() {
		return _methodOfIssue;
	}

	public void setMethodOfIssue(String methodOfIssue) {
		_methodOfIssue = methodOfIssue;
	}

	public long getTotalInDocument() {
		return _totalInDocument;
	}

	public void setTotalInDocument(long totalInDocument) {
		_totalInDocument = totalInDocument;
	}

	public long getIssueCorporationId() {
		return _issueCorporationId;
	}

	public void setIssueCorporationId(long issueCorporationId) {
		_issueCorporationId = issueCorporationId;
	}

	public String getVerifyCorporationId() {
		return _verifyCorporationId;
	}

	public void setVerifyCorporationId(String verifyCorporationId) {
		_verifyCorporationId = verifyCorporationId;
	}

	public int getDigitalIssueStatus() {
		return _digitalIssueStatus;
	}

	public void setDigitalIssueStatus(int digitalIssueStatus) {
		_digitalIssueStatus = digitalIssueStatus;
	}

	public String getIssueType() {
		return _issueType;
	}

	public void setIssueType(String issueType) {
		_issueType = issueType;
	}

	public int getAverageSTBQuantity() {
		return _averageSTBQuantity;
	}

	public void setAverageSTBQuantity(int averageSTBQuantity) {
		_averageSTBQuantity = averageSTBQuantity;
	}

	public int getMaxMonthQuantity() {
		return _maxMonthQuantity;
	}

	public void setMaxMonthQuantity(int maxMonthQuantity) {
		_maxMonthQuantity = maxMonthQuantity;
	}

	public int getAverageSTMQuantity() {
		return _averageSTMQuantity;
	}

	public void setAverageSTMQuantity(int averageSTMQuantity) {
		_averageSTMQuantity = averageSTMQuantity;
	}

	public int getAccumulatedMonthQuantity() {
		return _accumulatedMonthQuantity;
	}

	public void setAccumulatedMonthQuantity(int accumulatedMonthQuantity) {
		_accumulatedMonthQuantity = accumulatedMonthQuantity;
	}

	public int getTotalInUse() {
		return _totalInUse;
	}

	public void setTotalInUse(int totalInUse) {
		_totalInUse = totalInUse;
	}

	public int getTotalCancelled() {
		return _totalCancelled;
	}

	public void setTotalCancelled(int totalCancelled) {
		_totalCancelled = totalCancelled;
	}

	public int getTotalLost() {
		return _totalLost;
	}

	public void setTotalLost(int totalLost) {
		_totalLost = totalLost;
	}

	public int getTotalNotUsed() {
		return _totalNotUsed;
	}

	public void setTotalNotUsed(int totalNotUsed) {
		_totalNotUsed = totalNotUsed;
	}

	public int getTotalReturned() {
		return _totalReturned;
	}

	public void setTotalReturned(int totalReturned) {
		_totalReturned = totalReturned;
	}

	public String getFlow() {
		return _flow;
	}

	public void setFlow(String flow) {
		_flow = flow;
	}

	public String getExaminationRequired() {
		return _examinationRequired;
	}

	public void setExaminationRequired(String examinationRequired) {
		_examinationRequired = examinationRequired;
	}

	public String getExaminationPeriod() {
		return _examinationPeriod;
	}

	public void setExaminationPeriod(String examinationPeriod) {
		_examinationPeriod = examinationPeriod;
	}

	public Date getExaminationLastTime() {
		return _examinationLastTime;
	}

	public void setExaminationLastTime(Date examinationLastTime) {
		_examinationLastTime = examinationLastTime;
	}

	public String getCopResult() {
		return _copResult;
	}

	public void setCopResult(String copResult) {
		_copResult = copResult;
	}

	public String getCopReportNo() {
		return _copReportNo;
	}

	public void setCopReportNo(String copReportNo) {
		_copReportNo = copReportNo;
	}

	public Date getCopReportDate() {
		return _copReportDate;
	}

	public void setCopReportDate(Date copReportDate) {
		_copReportDate = copReportDate;
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

	public String getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(String corporationId) {
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

	public String getApplicantMaker() {
		return _applicantMaker;
	}

	public void setApplicantMaker(String applicantMaker) {
		_applicantMaker = applicantMaker;
	}

	public String getApplicantChecker() {
		return _applicantChecker;
	}

	public void setApplicantChecker(String applicantChecker) {
		_applicantChecker = applicantChecker;
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

	public String getCertifiedAssemblyType() {
		return _certifiedAssemblyType;
	}

	public void setCertifiedAssemblyType(String certifiedAssemblyType) {
		_certifiedAssemblyType = certifiedAssemblyType;
	}

	public String getCertifiedAssemblyTypeDescription() {
		return _certifiedAssemblyTypeDescription;
	}

	public void setCertifiedAssemblyTypeDescription(
		String certifiedAssemblyTypeDescription) {
		_certifiedAssemblyTypeDescription = certifiedAssemblyTypeDescription;
	}

	private long _id;
	private long _mtCore;
	private long _dossierId;
	private String _stampIssueNo;
	private Date _appliedDate;
	private Date _approvedDate;
	private String _vehicleClass;
	private long _applicantProfileId;
	private String _applicantName;
	private String _applicantAddress;
	private String _applicantRepresentative;
	private String _applicantRepresentativeTitle;
	private String _applicantEmail;
	private String _applicantPhone;
	private String _applicantFax;
	private String _applicantContactName;
	private String _applicantContactEmail;
	private String _applicantContactPhone;
	private long _productionPlantId;
	private String _productionPlantCode;
	private String _productionPlantName;
	private String _productionPlantAddress;
	private String _remarks;
	private String _methodOfIssue;
	private long _totalInDocument;
	private long _issueCorporationId;
	private String _verifyCorporationId;
	private int _digitalIssueStatus;
	private String _issueType;
	private int _averageSTBQuantity;
	private int _maxMonthQuantity;
	private int _averageSTMQuantity;
	private int _accumulatedMonthQuantity;
	private int _totalInUse;
	private int _totalCancelled;
	private int _totalLost;
	private int _totalNotUsed;
	private int _totalReturned;
	private String _flow;
	private String _examinationRequired;
	private String _examinationPeriod;
	private Date _examinationLastTime;
	private String _copResult;
	private String _copReportNo;
	private Date _copReportDate;
	private String _postReview;
	private String _postReviewRecordNo;
	private Date _postReviewRecordDate;
	private String _corporationId;
	private String _inspectorCode;
	private String _inspectorName;
	private String _leaderName;
	private String _applicantMaker;
	private String _applicantChecker;
	private long _inspectorId;
	private long _issueInspectorId;
	private long _verifyInspectorId;
	private Date _modifyDate;
	private Date _syncDate;
	private String _certifiedAssemblyType;
	private String _certifiedAssemblyTypeDescription;
}