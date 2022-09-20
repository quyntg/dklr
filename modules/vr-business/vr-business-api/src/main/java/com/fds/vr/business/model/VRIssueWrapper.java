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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRIssue}.
 * </p>
 *
 * @author LamTV
 * @see VRIssue
 * @generated
 */
@ProviderType
public class VRIssueWrapper implements VRIssue, ModelWrapper<VRIssue> {
	public VRIssueWrapper(VRIssue vrIssue) {
		_vrIssue = vrIssue;
	}

	@Override
	public Class<?> getModelClass() {
		return VRIssue.class;
	}

	@Override
	public String getModelClassName() {
		return VRIssue.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("dossierId", getDossierId());
		attributes.put("stampIssueNo", getStampIssueNo());
		attributes.put("appliedDate", getAppliedDate());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("applicantProfileId", getApplicantProfileId());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("applicantRepresentative", getApplicantRepresentative());
		attributes.put("applicantRepresentativeTitle",
			getApplicantRepresentativeTitle());
		attributes.put("applicantEmail", getApplicantEmail());
		attributes.put("applicantPhone", getApplicantPhone());
		attributes.put("applicantFax", getApplicantFax());
		attributes.put("applicantContactName", getApplicantContactName());
		attributes.put("applicantContactEmail", getApplicantContactEmail());
		attributes.put("applicantContactPhone", getApplicantContactPhone());
		attributes.put("productionPlantId", getProductionPlantId());
		attributes.put("productionPlantCode", getProductionPlantCode());
		attributes.put("productionPlantName", getProductionPlantName());
		attributes.put("productionPlantAddress", getProductionPlantAddress());
		attributes.put("remarks", getRemarks());
		attributes.put("methodOfIssue", getMethodOfIssue());
		attributes.put("totalInDocument", getTotalInDocument());
		attributes.put("issueCorporationId", getIssueCorporationId());
		attributes.put("verifyCorporationId", getVerifyCorporationId());
		attributes.put("digitalIssueStatus", getDigitalIssueStatus());
		attributes.put("issueType", getIssueType());
		attributes.put("averageSTBQuantity", getAverageSTBQuantity());
		attributes.put("maxMonthQuantity", getMaxMonthQuantity());
		attributes.put("averageSTMQuantity", getAverageSTMQuantity());
		attributes.put("accumulatedMonthQuantity", getAccumulatedMonthQuantity());
		attributes.put("totalInUse", getTotalInUse());
		attributes.put("totalCancelled", getTotalCancelled());
		attributes.put("totalLost", getTotalLost());
		attributes.put("totalNotUsed", getTotalNotUsed());
		attributes.put("totalReturned", getTotalReturned());
		attributes.put("flow", getFlow());
		attributes.put("examinationRequired", getExaminationRequired());
		attributes.put("examinationPeriod", getExaminationPeriod());
		attributes.put("examinationLastTime", getExaminationLastTime());
		attributes.put("copResult", getCopResult());
		attributes.put("copReportNo", getCopReportNo());
		attributes.put("copReportDate", getCopReportDate());
		attributes.put("postReview", getPostReview());
		attributes.put("postReviewRecordNo", getPostReviewRecordNo());
		attributes.put("postReviewRecordDate", getPostReviewRecordDate());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorCode", getInspectorCode());
		attributes.put("inspectorName", getInspectorName());
		attributes.put("leaderName", getLeaderName());
		attributes.put("applicantMaker", getApplicantMaker());
		attributes.put("applicantChecker", getApplicantChecker());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("issueInspectorId", getIssueInspectorId());
		attributes.put("verifyInspectorId", getVerifyInspectorId());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());
		attributes.put("certifiedAssemblyType", getCertifiedAssemblyType());
		attributes.put("certifiedAssemblyTypeDescription",
			getCertifiedAssemblyTypeDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String stampIssueNo = (String)attributes.get("stampIssueNo");

		if (stampIssueNo != null) {
			setStampIssueNo(stampIssueNo);
		}

		Date appliedDate = (Date)attributes.get("appliedDate");

		if (appliedDate != null) {
			setAppliedDate(appliedDate);
		}

		Date approvedDate = (Date)attributes.get("approvedDate");

		if (approvedDate != null) {
			setApprovedDate(approvedDate);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		Long applicantProfileId = (Long)attributes.get("applicantProfileId");

		if (applicantProfileId != null) {
			setApplicantProfileId(applicantProfileId);
		}

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		String applicantRepresentative = (String)attributes.get(
				"applicantRepresentative");

		if (applicantRepresentative != null) {
			setApplicantRepresentative(applicantRepresentative);
		}

		String applicantRepresentativeTitle = (String)attributes.get(
				"applicantRepresentativeTitle");

		if (applicantRepresentativeTitle != null) {
			setApplicantRepresentativeTitle(applicantRepresentativeTitle);
		}

		String applicantEmail = (String)attributes.get("applicantEmail");

		if (applicantEmail != null) {
			setApplicantEmail(applicantEmail);
		}

		String applicantPhone = (String)attributes.get("applicantPhone");

		if (applicantPhone != null) {
			setApplicantPhone(applicantPhone);
		}

		String applicantFax = (String)attributes.get("applicantFax");

		if (applicantFax != null) {
			setApplicantFax(applicantFax);
		}

		String applicantContactName = (String)attributes.get(
				"applicantContactName");

		if (applicantContactName != null) {
			setApplicantContactName(applicantContactName);
		}

		String applicantContactEmail = (String)attributes.get(
				"applicantContactEmail");

		if (applicantContactEmail != null) {
			setApplicantContactEmail(applicantContactEmail);
		}

		String applicantContactPhone = (String)attributes.get(
				"applicantContactPhone");

		if (applicantContactPhone != null) {
			setApplicantContactPhone(applicantContactPhone);
		}

		Long productionPlantId = (Long)attributes.get("productionPlantId");

		if (productionPlantId != null) {
			setProductionPlantId(productionPlantId);
		}

		String productionPlantCode = (String)attributes.get(
				"productionPlantCode");

		if (productionPlantCode != null) {
			setProductionPlantCode(productionPlantCode);
		}

		String productionPlantName = (String)attributes.get(
				"productionPlantName");

		if (productionPlantName != null) {
			setProductionPlantName(productionPlantName);
		}

		String productionPlantAddress = (String)attributes.get(
				"productionPlantAddress");

		if (productionPlantAddress != null) {
			setProductionPlantAddress(productionPlantAddress);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String methodOfIssue = (String)attributes.get("methodOfIssue");

		if (methodOfIssue != null) {
			setMethodOfIssue(methodOfIssue);
		}

		Long totalInDocument = (Long)attributes.get("totalInDocument");

		if (totalInDocument != null) {
			setTotalInDocument(totalInDocument);
		}

		Long issueCorporationId = (Long)attributes.get("issueCorporationId");

		if (issueCorporationId != null) {
			setIssueCorporationId(issueCorporationId);
		}

		String verifyCorporationId = (String)attributes.get(
				"verifyCorporationId");

		if (verifyCorporationId != null) {
			setVerifyCorporationId(verifyCorporationId);
		}

		Integer digitalIssueStatus = (Integer)attributes.get(
				"digitalIssueStatus");

		if (digitalIssueStatus != null) {
			setDigitalIssueStatus(digitalIssueStatus);
		}

		String issueType = (String)attributes.get("issueType");

		if (issueType != null) {
			setIssueType(issueType);
		}

		Integer averageSTBQuantity = (Integer)attributes.get(
				"averageSTBQuantity");

		if (averageSTBQuantity != null) {
			setAverageSTBQuantity(averageSTBQuantity);
		}

		Integer maxMonthQuantity = (Integer)attributes.get("maxMonthQuantity");

		if (maxMonthQuantity != null) {
			setMaxMonthQuantity(maxMonthQuantity);
		}

		Integer averageSTMQuantity = (Integer)attributes.get(
				"averageSTMQuantity");

		if (averageSTMQuantity != null) {
			setAverageSTMQuantity(averageSTMQuantity);
		}

		Integer accumulatedMonthQuantity = (Integer)attributes.get(
				"accumulatedMonthQuantity");

		if (accumulatedMonthQuantity != null) {
			setAccumulatedMonthQuantity(accumulatedMonthQuantity);
		}

		Integer totalInUse = (Integer)attributes.get("totalInUse");

		if (totalInUse != null) {
			setTotalInUse(totalInUse);
		}

		Integer totalCancelled = (Integer)attributes.get("totalCancelled");

		if (totalCancelled != null) {
			setTotalCancelled(totalCancelled);
		}

		Integer totalLost = (Integer)attributes.get("totalLost");

		if (totalLost != null) {
			setTotalLost(totalLost);
		}

		Integer totalNotUsed = (Integer)attributes.get("totalNotUsed");

		if (totalNotUsed != null) {
			setTotalNotUsed(totalNotUsed);
		}

		Integer totalReturned = (Integer)attributes.get("totalReturned");

		if (totalReturned != null) {
			setTotalReturned(totalReturned);
		}

		String flow = (String)attributes.get("flow");

		if (flow != null) {
			setFlow(flow);
		}

		String examinationRequired = (String)attributes.get(
				"examinationRequired");

		if (examinationRequired != null) {
			setExaminationRequired(examinationRequired);
		}

		String examinationPeriod = (String)attributes.get("examinationPeriod");

		if (examinationPeriod != null) {
			setExaminationPeriod(examinationPeriod);
		}

		Date examinationLastTime = (Date)attributes.get("examinationLastTime");

		if (examinationLastTime != null) {
			setExaminationLastTime(examinationLastTime);
		}

		String copResult = (String)attributes.get("copResult");

		if (copResult != null) {
			setCopResult(copResult);
		}

		String copReportNo = (String)attributes.get("copReportNo");

		if (copReportNo != null) {
			setCopReportNo(copReportNo);
		}

		Date copReportDate = (Date)attributes.get("copReportDate");

		if (copReportDate != null) {
			setCopReportDate(copReportDate);
		}

		String postReview = (String)attributes.get("postReview");

		if (postReview != null) {
			setPostReview(postReview);
		}

		String postReviewRecordNo = (String)attributes.get("postReviewRecordNo");

		if (postReviewRecordNo != null) {
			setPostReviewRecordNo(postReviewRecordNo);
		}

		Date postReviewRecordDate = (Date)attributes.get("postReviewRecordDate");

		if (postReviewRecordDate != null) {
			setPostReviewRecordDate(postReviewRecordDate);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		String inspectorCode = (String)attributes.get("inspectorCode");

		if (inspectorCode != null) {
			setInspectorCode(inspectorCode);
		}

		String inspectorName = (String)attributes.get("inspectorName");

		if (inspectorName != null) {
			setInspectorName(inspectorName);
		}

		String leaderName = (String)attributes.get("leaderName");

		if (leaderName != null) {
			setLeaderName(leaderName);
		}

		String applicantMaker = (String)attributes.get("applicantMaker");

		if (applicantMaker != null) {
			setApplicantMaker(applicantMaker);
		}

		String applicantChecker = (String)attributes.get("applicantChecker");

		if (applicantChecker != null) {
			setApplicantChecker(applicantChecker);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		Long issueInspectorId = (Long)attributes.get("issueInspectorId");

		if (issueInspectorId != null) {
			setIssueInspectorId(issueInspectorId);
		}

		Long verifyInspectorId = (Long)attributes.get("verifyInspectorId");

		if (verifyInspectorId != null) {
			setVerifyInspectorId(verifyInspectorId);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}

		String certifiedAssemblyType = (String)attributes.get(
				"certifiedAssemblyType");

		if (certifiedAssemblyType != null) {
			setCertifiedAssemblyType(certifiedAssemblyType);
		}

		String certifiedAssemblyTypeDescription = (String)attributes.get(
				"certifiedAssemblyTypeDescription");

		if (certifiedAssemblyTypeDescription != null) {
			setCertifiedAssemblyTypeDescription(certifiedAssemblyTypeDescription);
		}
	}

	@Override
	public VRIssue toEscapedModel() {
		return new VRIssueWrapper(_vrIssue.toEscapedModel());
	}

	@Override
	public VRIssue toUnescapedModel() {
		return new VRIssueWrapper(_vrIssue.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrIssue.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrIssue.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrIssue.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrIssue.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRIssue> toCacheModel() {
		return _vrIssue.toCacheModel();
	}

	@Override
	public int compareTo(VRIssue vrIssue) {
		return _vrIssue.compareTo(vrIssue);
	}

	/**
	* Returns the accumulated month quantity of this vr issue.
	*
	* @return the accumulated month quantity of this vr issue
	*/
	@Override
	public int getAccumulatedMonthQuantity() {
		return _vrIssue.getAccumulatedMonthQuantity();
	}

	/**
	* Returns the average stb quantity of this vr issue.
	*
	* @return the average stb quantity of this vr issue
	*/
	@Override
	public int getAverageSTBQuantity() {
		return _vrIssue.getAverageSTBQuantity();
	}

	/**
	* Returns the average stm quantity of this vr issue.
	*
	* @return the average stm quantity of this vr issue
	*/
	@Override
	public int getAverageSTMQuantity() {
		return _vrIssue.getAverageSTMQuantity();
	}

	/**
	* Returns the digital issue status of this vr issue.
	*
	* @return the digital issue status of this vr issue
	*/
	@Override
	public int getDigitalIssueStatus() {
		return _vrIssue.getDigitalIssueStatus();
	}

	/**
	* Returns the max month quantity of this vr issue.
	*
	* @return the max month quantity of this vr issue
	*/
	@Override
	public int getMaxMonthQuantity() {
		return _vrIssue.getMaxMonthQuantity();
	}

	/**
	* Returns the total cancelled of this vr issue.
	*
	* @return the total cancelled of this vr issue
	*/
	@Override
	public int getTotalCancelled() {
		return _vrIssue.getTotalCancelled();
	}

	/**
	* Returns the total in use of this vr issue.
	*
	* @return the total in use of this vr issue
	*/
	@Override
	public int getTotalInUse() {
		return _vrIssue.getTotalInUse();
	}

	/**
	* Returns the total lost of this vr issue.
	*
	* @return the total lost of this vr issue
	*/
	@Override
	public int getTotalLost() {
		return _vrIssue.getTotalLost();
	}

	/**
	* Returns the total not used of this vr issue.
	*
	* @return the total not used of this vr issue
	*/
	@Override
	public int getTotalNotUsed() {
		return _vrIssue.getTotalNotUsed();
	}

	/**
	* Returns the total returned of this vr issue.
	*
	* @return the total returned of this vr issue
	*/
	@Override
	public int getTotalReturned() {
		return _vrIssue.getTotalReturned();
	}

	@Override
	public int hashCode() {
		return _vrIssue.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrIssue.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRIssueWrapper((VRIssue)_vrIssue.clone());
	}

	/**
	* Returns the applicant address of this vr issue.
	*
	* @return the applicant address of this vr issue
	*/
	@Override
	public java.lang.String getApplicantAddress() {
		return _vrIssue.getApplicantAddress();
	}

	/**
	* Returns the applicant checker of this vr issue.
	*
	* @return the applicant checker of this vr issue
	*/
	@Override
	public java.lang.String getApplicantChecker() {
		return _vrIssue.getApplicantChecker();
	}

	/**
	* Returns the applicant contact email of this vr issue.
	*
	* @return the applicant contact email of this vr issue
	*/
	@Override
	public java.lang.String getApplicantContactEmail() {
		return _vrIssue.getApplicantContactEmail();
	}

	/**
	* Returns the applicant contact name of this vr issue.
	*
	* @return the applicant contact name of this vr issue
	*/
	@Override
	public java.lang.String getApplicantContactName() {
		return _vrIssue.getApplicantContactName();
	}

	/**
	* Returns the applicant contact phone of this vr issue.
	*
	* @return the applicant contact phone of this vr issue
	*/
	@Override
	public java.lang.String getApplicantContactPhone() {
		return _vrIssue.getApplicantContactPhone();
	}

	/**
	* Returns the applicant email of this vr issue.
	*
	* @return the applicant email of this vr issue
	*/
	@Override
	public java.lang.String getApplicantEmail() {
		return _vrIssue.getApplicantEmail();
	}

	/**
	* Returns the applicant fax of this vr issue.
	*
	* @return the applicant fax of this vr issue
	*/
	@Override
	public java.lang.String getApplicantFax() {
		return _vrIssue.getApplicantFax();
	}

	/**
	* Returns the applicant maker of this vr issue.
	*
	* @return the applicant maker of this vr issue
	*/
	@Override
	public java.lang.String getApplicantMaker() {
		return _vrIssue.getApplicantMaker();
	}

	/**
	* Returns the applicant name of this vr issue.
	*
	* @return the applicant name of this vr issue
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _vrIssue.getApplicantName();
	}

	/**
	* Returns the applicant phone of this vr issue.
	*
	* @return the applicant phone of this vr issue
	*/
	@Override
	public java.lang.String getApplicantPhone() {
		return _vrIssue.getApplicantPhone();
	}

	/**
	* Returns the applicant representative of this vr issue.
	*
	* @return the applicant representative of this vr issue
	*/
	@Override
	public java.lang.String getApplicantRepresentative() {
		return _vrIssue.getApplicantRepresentative();
	}

	/**
	* Returns the applicant representative title of this vr issue.
	*
	* @return the applicant representative title of this vr issue
	*/
	@Override
	public java.lang.String getApplicantRepresentativeTitle() {
		return _vrIssue.getApplicantRepresentativeTitle();
	}

	/**
	* Returns the certified assembly type of this vr issue.
	*
	* @return the certified assembly type of this vr issue
	*/
	@Override
	public java.lang.String getCertifiedAssemblyType() {
		return _vrIssue.getCertifiedAssemblyType();
	}

	/**
	* Returns the certified assembly type description of this vr issue.
	*
	* @return the certified assembly type description of this vr issue
	*/
	@Override
	public java.lang.String getCertifiedAssemblyTypeDescription() {
		return _vrIssue.getCertifiedAssemblyTypeDescription();
	}

	/**
	* Returns the cop report no of this vr issue.
	*
	* @return the cop report no of this vr issue
	*/
	@Override
	public java.lang.String getCopReportNo() {
		return _vrIssue.getCopReportNo();
	}

	/**
	* Returns the cop result of this vr issue.
	*
	* @return the cop result of this vr issue
	*/
	@Override
	public java.lang.String getCopResult() {
		return _vrIssue.getCopResult();
	}

	/**
	* Returns the corporation ID of this vr issue.
	*
	* @return the corporation ID of this vr issue
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _vrIssue.getCorporationId();
	}

	/**
	* Returns the examination period of this vr issue.
	*
	* @return the examination period of this vr issue
	*/
	@Override
	public java.lang.String getExaminationPeriod() {
		return _vrIssue.getExaminationPeriod();
	}

	/**
	* Returns the examination required of this vr issue.
	*
	* @return the examination required of this vr issue
	*/
	@Override
	public java.lang.String getExaminationRequired() {
		return _vrIssue.getExaminationRequired();
	}

	/**
	* Returns the flow of this vr issue.
	*
	* @return the flow of this vr issue
	*/
	@Override
	public java.lang.String getFlow() {
		return _vrIssue.getFlow();
	}

	/**
	* Returns the inspector code of this vr issue.
	*
	* @return the inspector code of this vr issue
	*/
	@Override
	public java.lang.String getInspectorCode() {
		return _vrIssue.getInspectorCode();
	}

	/**
	* Returns the inspector name of this vr issue.
	*
	* @return the inspector name of this vr issue
	*/
	@Override
	public java.lang.String getInspectorName() {
		return _vrIssue.getInspectorName();
	}

	/**
	* Returns the issue type of this vr issue.
	*
	* @return the issue type of this vr issue
	*/
	@Override
	public java.lang.String getIssueType() {
		return _vrIssue.getIssueType();
	}

	/**
	* Returns the leader name of this vr issue.
	*
	* @return the leader name of this vr issue
	*/
	@Override
	public java.lang.String getLeaderName() {
		return _vrIssue.getLeaderName();
	}

	/**
	* Returns the method of issue of this vr issue.
	*
	* @return the method of issue of this vr issue
	*/
	@Override
	public java.lang.String getMethodOfIssue() {
		return _vrIssue.getMethodOfIssue();
	}

	/**
	* Returns the post review of this vr issue.
	*
	* @return the post review of this vr issue
	*/
	@Override
	public java.lang.String getPostReview() {
		return _vrIssue.getPostReview();
	}

	/**
	* Returns the post review record no of this vr issue.
	*
	* @return the post review record no of this vr issue
	*/
	@Override
	public java.lang.String getPostReviewRecordNo() {
		return _vrIssue.getPostReviewRecordNo();
	}

	/**
	* Returns the production plant address of this vr issue.
	*
	* @return the production plant address of this vr issue
	*/
	@Override
	public java.lang.String getProductionPlantAddress() {
		return _vrIssue.getProductionPlantAddress();
	}

	/**
	* Returns the production plant code of this vr issue.
	*
	* @return the production plant code of this vr issue
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrIssue.getProductionPlantCode();
	}

	/**
	* Returns the production plant name of this vr issue.
	*
	* @return the production plant name of this vr issue
	*/
	@Override
	public java.lang.String getProductionPlantName() {
		return _vrIssue.getProductionPlantName();
	}

	/**
	* Returns the remarks of this vr issue.
	*
	* @return the remarks of this vr issue
	*/
	@Override
	public java.lang.String getRemarks() {
		return _vrIssue.getRemarks();
	}

	/**
	* Returns the stamp issue no of this vr issue.
	*
	* @return the stamp issue no of this vr issue
	*/
	@Override
	public java.lang.String getStampIssueNo() {
		return _vrIssue.getStampIssueNo();
	}

	/**
	* Returns the vehicle class of this vr issue.
	*
	* @return the vehicle class of this vr issue
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrIssue.getVehicleClass();
	}

	/**
	* Returns the verify corporation ID of this vr issue.
	*
	* @return the verify corporation ID of this vr issue
	*/
	@Override
	public java.lang.String getVerifyCorporationId() {
		return _vrIssue.getVerifyCorporationId();
	}

	@Override
	public java.lang.String toString() {
		return _vrIssue.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrIssue.toXmlString();
	}

	/**
	* Returns the applied date of this vr issue.
	*
	* @return the applied date of this vr issue
	*/
	@Override
	public Date getAppliedDate() {
		return _vrIssue.getAppliedDate();
	}

	/**
	* Returns the approved date of this vr issue.
	*
	* @return the approved date of this vr issue
	*/
	@Override
	public Date getApprovedDate() {
		return _vrIssue.getApprovedDate();
	}

	/**
	* Returns the cop report date of this vr issue.
	*
	* @return the cop report date of this vr issue
	*/
	@Override
	public Date getCopReportDate() {
		return _vrIssue.getCopReportDate();
	}

	/**
	* Returns the examination last time of this vr issue.
	*
	* @return the examination last time of this vr issue
	*/
	@Override
	public Date getExaminationLastTime() {
		return _vrIssue.getExaminationLastTime();
	}

	/**
	* Returns the modify date of this vr issue.
	*
	* @return the modify date of this vr issue
	*/
	@Override
	public Date getModifyDate() {
		return _vrIssue.getModifyDate();
	}

	/**
	* Returns the post review record date of this vr issue.
	*
	* @return the post review record date of this vr issue
	*/
	@Override
	public Date getPostReviewRecordDate() {
		return _vrIssue.getPostReviewRecordDate();
	}

	/**
	* Returns the sync date of this vr issue.
	*
	* @return the sync date of this vr issue
	*/
	@Override
	public Date getSyncDate() {
		return _vrIssue.getSyncDate();
	}

	/**
	* Returns the applicant profile ID of this vr issue.
	*
	* @return the applicant profile ID of this vr issue
	*/
	@Override
	public long getApplicantProfileId() {
		return _vrIssue.getApplicantProfileId();
	}

	/**
	* Returns the dossier ID of this vr issue.
	*
	* @return the dossier ID of this vr issue
	*/
	@Override
	public long getDossierId() {
		return _vrIssue.getDossierId();
	}

	/**
	* Returns the ID of this vr issue.
	*
	* @return the ID of this vr issue
	*/
	@Override
	public long getId() {
		return _vrIssue.getId();
	}

	/**
	* Returns the inspector ID of this vr issue.
	*
	* @return the inspector ID of this vr issue
	*/
	@Override
	public long getInspectorId() {
		return _vrIssue.getInspectorId();
	}

	/**
	* Returns the issue corporation ID of this vr issue.
	*
	* @return the issue corporation ID of this vr issue
	*/
	@Override
	public long getIssueCorporationId() {
		return _vrIssue.getIssueCorporationId();
	}

	/**
	* Returns the issue inspector ID of this vr issue.
	*
	* @return the issue inspector ID of this vr issue
	*/
	@Override
	public long getIssueInspectorId() {
		return _vrIssue.getIssueInspectorId();
	}

	/**
	* Returns the mt core of this vr issue.
	*
	* @return the mt core of this vr issue
	*/
	@Override
	public long getMtCore() {
		return _vrIssue.getMtCore();
	}

	/**
	* Returns the primary key of this vr issue.
	*
	* @return the primary key of this vr issue
	*/
	@Override
	public long getPrimaryKey() {
		return _vrIssue.getPrimaryKey();
	}

	/**
	* Returns the production plant ID of this vr issue.
	*
	* @return the production plant ID of this vr issue
	*/
	@Override
	public long getProductionPlantId() {
		return _vrIssue.getProductionPlantId();
	}

	/**
	* Returns the total in document of this vr issue.
	*
	* @return the total in document of this vr issue
	*/
	@Override
	public long getTotalInDocument() {
		return _vrIssue.getTotalInDocument();
	}

	/**
	* Returns the verify inspector ID of this vr issue.
	*
	* @return the verify inspector ID of this vr issue
	*/
	@Override
	public long getVerifyInspectorId() {
		return _vrIssue.getVerifyInspectorId();
	}

	@Override
	public void persist() {
		_vrIssue.persist();
	}

	/**
	* Sets the accumulated month quantity of this vr issue.
	*
	* @param accumulatedMonthQuantity the accumulated month quantity of this vr issue
	*/
	@Override
	public void setAccumulatedMonthQuantity(int accumulatedMonthQuantity) {
		_vrIssue.setAccumulatedMonthQuantity(accumulatedMonthQuantity);
	}

	/**
	* Sets the applicant address of this vr issue.
	*
	* @param applicantAddress the applicant address of this vr issue
	*/
	@Override
	public void setApplicantAddress(java.lang.String applicantAddress) {
		_vrIssue.setApplicantAddress(applicantAddress);
	}

	/**
	* Sets the applicant checker of this vr issue.
	*
	* @param applicantChecker the applicant checker of this vr issue
	*/
	@Override
	public void setApplicantChecker(java.lang.String applicantChecker) {
		_vrIssue.setApplicantChecker(applicantChecker);
	}

	/**
	* Sets the applicant contact email of this vr issue.
	*
	* @param applicantContactEmail the applicant contact email of this vr issue
	*/
	@Override
	public void setApplicantContactEmail(java.lang.String applicantContactEmail) {
		_vrIssue.setApplicantContactEmail(applicantContactEmail);
	}

	/**
	* Sets the applicant contact name of this vr issue.
	*
	* @param applicantContactName the applicant contact name of this vr issue
	*/
	@Override
	public void setApplicantContactName(java.lang.String applicantContactName) {
		_vrIssue.setApplicantContactName(applicantContactName);
	}

	/**
	* Sets the applicant contact phone of this vr issue.
	*
	* @param applicantContactPhone the applicant contact phone of this vr issue
	*/
	@Override
	public void setApplicantContactPhone(java.lang.String applicantContactPhone) {
		_vrIssue.setApplicantContactPhone(applicantContactPhone);
	}

	/**
	* Sets the applicant email of this vr issue.
	*
	* @param applicantEmail the applicant email of this vr issue
	*/
	@Override
	public void setApplicantEmail(java.lang.String applicantEmail) {
		_vrIssue.setApplicantEmail(applicantEmail);
	}

	/**
	* Sets the applicant fax of this vr issue.
	*
	* @param applicantFax the applicant fax of this vr issue
	*/
	@Override
	public void setApplicantFax(java.lang.String applicantFax) {
		_vrIssue.setApplicantFax(applicantFax);
	}

	/**
	* Sets the applicant maker of this vr issue.
	*
	* @param applicantMaker the applicant maker of this vr issue
	*/
	@Override
	public void setApplicantMaker(java.lang.String applicantMaker) {
		_vrIssue.setApplicantMaker(applicantMaker);
	}

	/**
	* Sets the applicant name of this vr issue.
	*
	* @param applicantName the applicant name of this vr issue
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_vrIssue.setApplicantName(applicantName);
	}

	/**
	* Sets the applicant phone of this vr issue.
	*
	* @param applicantPhone the applicant phone of this vr issue
	*/
	@Override
	public void setApplicantPhone(java.lang.String applicantPhone) {
		_vrIssue.setApplicantPhone(applicantPhone);
	}

	/**
	* Sets the applicant profile ID of this vr issue.
	*
	* @param applicantProfileId the applicant profile ID of this vr issue
	*/
	@Override
	public void setApplicantProfileId(long applicantProfileId) {
		_vrIssue.setApplicantProfileId(applicantProfileId);
	}

	/**
	* Sets the applicant representative of this vr issue.
	*
	* @param applicantRepresentative the applicant representative of this vr issue
	*/
	@Override
	public void setApplicantRepresentative(
		java.lang.String applicantRepresentative) {
		_vrIssue.setApplicantRepresentative(applicantRepresentative);
	}

	/**
	* Sets the applicant representative title of this vr issue.
	*
	* @param applicantRepresentativeTitle the applicant representative title of this vr issue
	*/
	@Override
	public void setApplicantRepresentativeTitle(
		java.lang.String applicantRepresentativeTitle) {
		_vrIssue.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
	}

	/**
	* Sets the applied date of this vr issue.
	*
	* @param appliedDate the applied date of this vr issue
	*/
	@Override
	public void setAppliedDate(Date appliedDate) {
		_vrIssue.setAppliedDate(appliedDate);
	}

	/**
	* Sets the approved date of this vr issue.
	*
	* @param approvedDate the approved date of this vr issue
	*/
	@Override
	public void setApprovedDate(Date approvedDate) {
		_vrIssue.setApprovedDate(approvedDate);
	}

	/**
	* Sets the average stb quantity of this vr issue.
	*
	* @param averageSTBQuantity the average stb quantity of this vr issue
	*/
	@Override
	public void setAverageSTBQuantity(int averageSTBQuantity) {
		_vrIssue.setAverageSTBQuantity(averageSTBQuantity);
	}

	/**
	* Sets the average stm quantity of this vr issue.
	*
	* @param averageSTMQuantity the average stm quantity of this vr issue
	*/
	@Override
	public void setAverageSTMQuantity(int averageSTMQuantity) {
		_vrIssue.setAverageSTMQuantity(averageSTMQuantity);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrIssue.setCachedModel(cachedModel);
	}

	/**
	* Sets the certified assembly type of this vr issue.
	*
	* @param certifiedAssemblyType the certified assembly type of this vr issue
	*/
	@Override
	public void setCertifiedAssemblyType(java.lang.String certifiedAssemblyType) {
		_vrIssue.setCertifiedAssemblyType(certifiedAssemblyType);
	}

	/**
	* Sets the certified assembly type description of this vr issue.
	*
	* @param certifiedAssemblyTypeDescription the certified assembly type description of this vr issue
	*/
	@Override
	public void setCertifiedAssemblyTypeDescription(
		java.lang.String certifiedAssemblyTypeDescription) {
		_vrIssue.setCertifiedAssemblyTypeDescription(certifiedAssemblyTypeDescription);
	}

	/**
	* Sets the cop report date of this vr issue.
	*
	* @param copReportDate the cop report date of this vr issue
	*/
	@Override
	public void setCopReportDate(Date copReportDate) {
		_vrIssue.setCopReportDate(copReportDate);
	}

	/**
	* Sets the cop report no of this vr issue.
	*
	* @param copReportNo the cop report no of this vr issue
	*/
	@Override
	public void setCopReportNo(java.lang.String copReportNo) {
		_vrIssue.setCopReportNo(copReportNo);
	}

	/**
	* Sets the cop result of this vr issue.
	*
	* @param copResult the cop result of this vr issue
	*/
	@Override
	public void setCopResult(java.lang.String copResult) {
		_vrIssue.setCopResult(copResult);
	}

	/**
	* Sets the corporation ID of this vr issue.
	*
	* @param corporationId the corporation ID of this vr issue
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_vrIssue.setCorporationId(corporationId);
	}

	/**
	* Sets the digital issue status of this vr issue.
	*
	* @param digitalIssueStatus the digital issue status of this vr issue
	*/
	@Override
	public void setDigitalIssueStatus(int digitalIssueStatus) {
		_vrIssue.setDigitalIssueStatus(digitalIssueStatus);
	}

	/**
	* Sets the dossier ID of this vr issue.
	*
	* @param dossierId the dossier ID of this vr issue
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrIssue.setDossierId(dossierId);
	}

	/**
	* Sets the examination last time of this vr issue.
	*
	* @param examinationLastTime the examination last time of this vr issue
	*/
	@Override
	public void setExaminationLastTime(Date examinationLastTime) {
		_vrIssue.setExaminationLastTime(examinationLastTime);
	}

	/**
	* Sets the examination period of this vr issue.
	*
	* @param examinationPeriod the examination period of this vr issue
	*/
	@Override
	public void setExaminationPeriod(java.lang.String examinationPeriod) {
		_vrIssue.setExaminationPeriod(examinationPeriod);
	}

	/**
	* Sets the examination required of this vr issue.
	*
	* @param examinationRequired the examination required of this vr issue
	*/
	@Override
	public void setExaminationRequired(java.lang.String examinationRequired) {
		_vrIssue.setExaminationRequired(examinationRequired);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrIssue.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrIssue.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrIssue.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flow of this vr issue.
	*
	* @param flow the flow of this vr issue
	*/
	@Override
	public void setFlow(java.lang.String flow) {
		_vrIssue.setFlow(flow);
	}

	/**
	* Sets the ID of this vr issue.
	*
	* @param id the ID of this vr issue
	*/
	@Override
	public void setId(long id) {
		_vrIssue.setId(id);
	}

	/**
	* Sets the inspector code of this vr issue.
	*
	* @param inspectorCode the inspector code of this vr issue
	*/
	@Override
	public void setInspectorCode(java.lang.String inspectorCode) {
		_vrIssue.setInspectorCode(inspectorCode);
	}

	/**
	* Sets the inspector ID of this vr issue.
	*
	* @param inspectorId the inspector ID of this vr issue
	*/
	@Override
	public void setInspectorId(long inspectorId) {
		_vrIssue.setInspectorId(inspectorId);
	}

	/**
	* Sets the inspector name of this vr issue.
	*
	* @param inspectorName the inspector name of this vr issue
	*/
	@Override
	public void setInspectorName(java.lang.String inspectorName) {
		_vrIssue.setInspectorName(inspectorName);
	}

	/**
	* Sets the issue corporation ID of this vr issue.
	*
	* @param issueCorporationId the issue corporation ID of this vr issue
	*/
	@Override
	public void setIssueCorporationId(long issueCorporationId) {
		_vrIssue.setIssueCorporationId(issueCorporationId);
	}

	/**
	* Sets the issue inspector ID of this vr issue.
	*
	* @param issueInspectorId the issue inspector ID of this vr issue
	*/
	@Override
	public void setIssueInspectorId(long issueInspectorId) {
		_vrIssue.setIssueInspectorId(issueInspectorId);
	}

	/**
	* Sets the issue type of this vr issue.
	*
	* @param issueType the issue type of this vr issue
	*/
	@Override
	public void setIssueType(java.lang.String issueType) {
		_vrIssue.setIssueType(issueType);
	}

	/**
	* Sets the leader name of this vr issue.
	*
	* @param leaderName the leader name of this vr issue
	*/
	@Override
	public void setLeaderName(java.lang.String leaderName) {
		_vrIssue.setLeaderName(leaderName);
	}

	/**
	* Sets the max month quantity of this vr issue.
	*
	* @param maxMonthQuantity the max month quantity of this vr issue
	*/
	@Override
	public void setMaxMonthQuantity(int maxMonthQuantity) {
		_vrIssue.setMaxMonthQuantity(maxMonthQuantity);
	}

	/**
	* Sets the method of issue of this vr issue.
	*
	* @param methodOfIssue the method of issue of this vr issue
	*/
	@Override
	public void setMethodOfIssue(java.lang.String methodOfIssue) {
		_vrIssue.setMethodOfIssue(methodOfIssue);
	}

	/**
	* Sets the modify date of this vr issue.
	*
	* @param modifyDate the modify date of this vr issue
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrIssue.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr issue.
	*
	* @param mtCore the mt core of this vr issue
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrIssue.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrIssue.setNew(n);
	}

	/**
	* Sets the post review of this vr issue.
	*
	* @param postReview the post review of this vr issue
	*/
	@Override
	public void setPostReview(java.lang.String postReview) {
		_vrIssue.setPostReview(postReview);
	}

	/**
	* Sets the post review record date of this vr issue.
	*
	* @param postReviewRecordDate the post review record date of this vr issue
	*/
	@Override
	public void setPostReviewRecordDate(Date postReviewRecordDate) {
		_vrIssue.setPostReviewRecordDate(postReviewRecordDate);
	}

	/**
	* Sets the post review record no of this vr issue.
	*
	* @param postReviewRecordNo the post review record no of this vr issue
	*/
	@Override
	public void setPostReviewRecordNo(java.lang.String postReviewRecordNo) {
		_vrIssue.setPostReviewRecordNo(postReviewRecordNo);
	}

	/**
	* Sets the primary key of this vr issue.
	*
	* @param primaryKey the primary key of this vr issue
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrIssue.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrIssue.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production plant address of this vr issue.
	*
	* @param productionPlantAddress the production plant address of this vr issue
	*/
	@Override
	public void setProductionPlantAddress(
		java.lang.String productionPlantAddress) {
		_vrIssue.setProductionPlantAddress(productionPlantAddress);
	}

	/**
	* Sets the production plant code of this vr issue.
	*
	* @param productionPlantCode the production plant code of this vr issue
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrIssue.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the production plant ID of this vr issue.
	*
	* @param productionPlantId the production plant ID of this vr issue
	*/
	@Override
	public void setProductionPlantId(long productionPlantId) {
		_vrIssue.setProductionPlantId(productionPlantId);
	}

	/**
	* Sets the production plant name of this vr issue.
	*
	* @param productionPlantName the production plant name of this vr issue
	*/
	@Override
	public void setProductionPlantName(java.lang.String productionPlantName) {
		_vrIssue.setProductionPlantName(productionPlantName);
	}

	/**
	* Sets the remarks of this vr issue.
	*
	* @param remarks the remarks of this vr issue
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_vrIssue.setRemarks(remarks);
	}

	/**
	* Sets the stamp issue no of this vr issue.
	*
	* @param stampIssueNo the stamp issue no of this vr issue
	*/
	@Override
	public void setStampIssueNo(java.lang.String stampIssueNo) {
		_vrIssue.setStampIssueNo(stampIssueNo);
	}

	/**
	* Sets the sync date of this vr issue.
	*
	* @param syncDate the sync date of this vr issue
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrIssue.setSyncDate(syncDate);
	}

	/**
	* Sets the total cancelled of this vr issue.
	*
	* @param totalCancelled the total cancelled of this vr issue
	*/
	@Override
	public void setTotalCancelled(int totalCancelled) {
		_vrIssue.setTotalCancelled(totalCancelled);
	}

	/**
	* Sets the total in document of this vr issue.
	*
	* @param totalInDocument the total in document of this vr issue
	*/
	@Override
	public void setTotalInDocument(long totalInDocument) {
		_vrIssue.setTotalInDocument(totalInDocument);
	}

	/**
	* Sets the total in use of this vr issue.
	*
	* @param totalInUse the total in use of this vr issue
	*/
	@Override
	public void setTotalInUse(int totalInUse) {
		_vrIssue.setTotalInUse(totalInUse);
	}

	/**
	* Sets the total lost of this vr issue.
	*
	* @param totalLost the total lost of this vr issue
	*/
	@Override
	public void setTotalLost(int totalLost) {
		_vrIssue.setTotalLost(totalLost);
	}

	/**
	* Sets the total not used of this vr issue.
	*
	* @param totalNotUsed the total not used of this vr issue
	*/
	@Override
	public void setTotalNotUsed(int totalNotUsed) {
		_vrIssue.setTotalNotUsed(totalNotUsed);
	}

	/**
	* Sets the total returned of this vr issue.
	*
	* @param totalReturned the total returned of this vr issue
	*/
	@Override
	public void setTotalReturned(int totalReturned) {
		_vrIssue.setTotalReturned(totalReturned);
	}

	/**
	* Sets the vehicle class of this vr issue.
	*
	* @param vehicleClass the vehicle class of this vr issue
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrIssue.setVehicleClass(vehicleClass);
	}

	/**
	* Sets the verify corporation ID of this vr issue.
	*
	* @param verifyCorporationId the verify corporation ID of this vr issue
	*/
	@Override
	public void setVerifyCorporationId(java.lang.String verifyCorporationId) {
		_vrIssue.setVerifyCorporationId(verifyCorporationId);
	}

	/**
	* Sets the verify inspector ID of this vr issue.
	*
	* @param verifyInspectorId the verify inspector ID of this vr issue
	*/
	@Override
	public void setVerifyInspectorId(long verifyInspectorId) {
		_vrIssue.setVerifyInspectorId(verifyInspectorId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRIssueWrapper)) {
			return false;
		}

		VRIssueWrapper vrIssueWrapper = (VRIssueWrapper)obj;

		if (Objects.equals(_vrIssue, vrIssueWrapper._vrIssue)) {
			return true;
		}

		return false;
	}

	@Override
	public VRIssue getWrappedModel() {
		return _vrIssue;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrIssue.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrIssue.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrIssue.resetOriginalValues();
	}

	private final VRIssue _vrIssue;
}