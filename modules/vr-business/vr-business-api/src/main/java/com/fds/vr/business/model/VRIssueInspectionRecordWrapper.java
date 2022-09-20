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
 * This class is a wrapper for {@link VRIssueInspectionRecord}.
 * </p>
 *
 * @author LamTV
 * @see VRIssueInspectionRecord
 * @generated
 */
@ProviderType
public class VRIssueInspectionRecordWrapper implements VRIssueInspectionRecord,
	ModelWrapper<VRIssueInspectionRecord> {
	public VRIssueInspectionRecordWrapper(
		VRIssueInspectionRecord vrIssueInspectionRecord) {
		_vrIssueInspectionRecord = vrIssueInspectionRecord;
	}

	@Override
	public Class<?> getModelClass() {
		return VRIssueInspectionRecord.class;
	}

	@Override
	public String getModelClassName() {
		return VRIssueInspectionRecord.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("issueId", getIssueId());
		attributes.put("dossierId", getDossierId());
		attributes.put("certificateId", getCertificateId());
		attributes.put("totalQuantity", getTotalQuantity());
		attributes.put("postReview", getPostReview());
		attributes.put("postReviewRecordNo", getPostReviewRecordNo());
		attributes.put("postReviewRecordDate", getPostReviewRecordDate());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorCode", getInspectorCode());
		attributes.put("inspectorName", getInspectorName());
		attributes.put("leaderName", getLeaderName());
		attributes.put("issueCorporationId", getIssueCorporationId());
		attributes.put("verifyCorporationId", getVerifyCorporationId());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("issueInspectorId", getIssueInspectorId());
		attributes.put("verifyInspectorId", getVerifyInspectorId());
		attributes.put("digitalIssueStatus", getDigitalIssueStatus());
		attributes.put("validRemarks", getValidRemarks());
		attributes.put("validInspectionNote", getValidInspectionNote());
		attributes.put("documentFileEntryid", getDocumentFileEntryid());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

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

		Long issueId = (Long)attributes.get("issueId");

		if (issueId != null) {
			setIssueId(issueId);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long certificateId = (Long)attributes.get("certificateId");

		if (certificateId != null) {
			setCertificateId(certificateId);
		}

		Integer totalQuantity = (Integer)attributes.get("totalQuantity");

		if (totalQuantity != null) {
			setTotalQuantity(totalQuantity);
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

		Long corporationId = (Long)attributes.get("corporationId");

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

		Long issueCorporationId = (Long)attributes.get("issueCorporationId");

		if (issueCorporationId != null) {
			setIssueCorporationId(issueCorporationId);
		}

		Long verifyCorporationId = (Long)attributes.get("verifyCorporationId");

		if (verifyCorporationId != null) {
			setVerifyCorporationId(verifyCorporationId);
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

		String digitalIssueStatus = (String)attributes.get("digitalIssueStatus");

		if (digitalIssueStatus != null) {
			setDigitalIssueStatus(digitalIssueStatus);
		}

		String validRemarks = (String)attributes.get("validRemarks");

		if (validRemarks != null) {
			setValidRemarks(validRemarks);
		}

		String validInspectionNote = (String)attributes.get(
				"validInspectionNote");

		if (validInspectionNote != null) {
			setValidInspectionNote(validInspectionNote);
		}

		Long documentFileEntryid = (Long)attributes.get("documentFileEntryid");

		if (documentFileEntryid != null) {
			setDocumentFileEntryid(documentFileEntryid);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public VRIssueInspectionRecord toEscapedModel() {
		return new VRIssueInspectionRecordWrapper(_vrIssueInspectionRecord.toEscapedModel());
	}

	@Override
	public VRIssueInspectionRecord toUnescapedModel() {
		return new VRIssueInspectionRecordWrapper(_vrIssueInspectionRecord.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrIssueInspectionRecord.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrIssueInspectionRecord.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrIssueInspectionRecord.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrIssueInspectionRecord.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRIssueInspectionRecord> toCacheModel() {
		return _vrIssueInspectionRecord.toCacheModel();
	}

	@Override
	public int compareTo(VRIssueInspectionRecord vrIssueInspectionRecord) {
		return _vrIssueInspectionRecord.compareTo(vrIssueInspectionRecord);
	}

	/**
	* Returns the total quantity of this vr issue inspection record.
	*
	* @return the total quantity of this vr issue inspection record
	*/
	@Override
	public int getTotalQuantity() {
		return _vrIssueInspectionRecord.getTotalQuantity();
	}

	@Override
	public int hashCode() {
		return _vrIssueInspectionRecord.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrIssueInspectionRecord.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRIssueInspectionRecordWrapper((VRIssueInspectionRecord)_vrIssueInspectionRecord.clone());
	}

	/**
	* Returns the digital issue status of this vr issue inspection record.
	*
	* @return the digital issue status of this vr issue inspection record
	*/
	@Override
	public java.lang.String getDigitalIssueStatus() {
		return _vrIssueInspectionRecord.getDigitalIssueStatus();
	}

	/**
	* Returns the inspector code of this vr issue inspection record.
	*
	* @return the inspector code of this vr issue inspection record
	*/
	@Override
	public java.lang.String getInspectorCode() {
		return _vrIssueInspectionRecord.getInspectorCode();
	}

	/**
	* Returns the inspector name of this vr issue inspection record.
	*
	* @return the inspector name of this vr issue inspection record
	*/
	@Override
	public java.lang.String getInspectorName() {
		return _vrIssueInspectionRecord.getInspectorName();
	}

	/**
	* Returns the leader name of this vr issue inspection record.
	*
	* @return the leader name of this vr issue inspection record
	*/
	@Override
	public java.lang.String getLeaderName() {
		return _vrIssueInspectionRecord.getLeaderName();
	}

	/**
	* Returns the post review of this vr issue inspection record.
	*
	* @return the post review of this vr issue inspection record
	*/
	@Override
	public java.lang.String getPostReview() {
		return _vrIssueInspectionRecord.getPostReview();
	}

	/**
	* Returns the post review record no of this vr issue inspection record.
	*
	* @return the post review record no of this vr issue inspection record
	*/
	@Override
	public java.lang.String getPostReviewRecordNo() {
		return _vrIssueInspectionRecord.getPostReviewRecordNo();
	}

	/**
	* Returns the valid inspection note of this vr issue inspection record.
	*
	* @return the valid inspection note of this vr issue inspection record
	*/
	@Override
	public java.lang.String getValidInspectionNote() {
		return _vrIssueInspectionRecord.getValidInspectionNote();
	}

	/**
	* Returns the valid remarks of this vr issue inspection record.
	*
	* @return the valid remarks of this vr issue inspection record
	*/
	@Override
	public java.lang.String getValidRemarks() {
		return _vrIssueInspectionRecord.getValidRemarks();
	}

	@Override
	public java.lang.String toString() {
		return _vrIssueInspectionRecord.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrIssueInspectionRecord.toXmlString();
	}

	/**
	* Returns the modify date of this vr issue inspection record.
	*
	* @return the modify date of this vr issue inspection record
	*/
	@Override
	public Date getModifyDate() {
		return _vrIssueInspectionRecord.getModifyDate();
	}

	/**
	* Returns the post review record date of this vr issue inspection record.
	*
	* @return the post review record date of this vr issue inspection record
	*/
	@Override
	public Date getPostReviewRecordDate() {
		return _vrIssueInspectionRecord.getPostReviewRecordDate();
	}

	/**
	* Returns the sync date of this vr issue inspection record.
	*
	* @return the sync date of this vr issue inspection record
	*/
	@Override
	public Date getSyncDate() {
		return _vrIssueInspectionRecord.getSyncDate();
	}

	/**
	* Returns the certificate ID of this vr issue inspection record.
	*
	* @return the certificate ID of this vr issue inspection record
	*/
	@Override
	public long getCertificateId() {
		return _vrIssueInspectionRecord.getCertificateId();
	}

	/**
	* Returns the corporation ID of this vr issue inspection record.
	*
	* @return the corporation ID of this vr issue inspection record
	*/
	@Override
	public long getCorporationId() {
		return _vrIssueInspectionRecord.getCorporationId();
	}

	/**
	* Returns the document file entryid of this vr issue inspection record.
	*
	* @return the document file entryid of this vr issue inspection record
	*/
	@Override
	public long getDocumentFileEntryid() {
		return _vrIssueInspectionRecord.getDocumentFileEntryid();
	}

	/**
	* Returns the dossier ID of this vr issue inspection record.
	*
	* @return the dossier ID of this vr issue inspection record
	*/
	@Override
	public long getDossierId() {
		return _vrIssueInspectionRecord.getDossierId();
	}

	/**
	* Returns the ID of this vr issue inspection record.
	*
	* @return the ID of this vr issue inspection record
	*/
	@Override
	public long getId() {
		return _vrIssueInspectionRecord.getId();
	}

	/**
	* Returns the inspector ID of this vr issue inspection record.
	*
	* @return the inspector ID of this vr issue inspection record
	*/
	@Override
	public long getInspectorId() {
		return _vrIssueInspectionRecord.getInspectorId();
	}

	/**
	* Returns the issue corporation ID of this vr issue inspection record.
	*
	* @return the issue corporation ID of this vr issue inspection record
	*/
	@Override
	public long getIssueCorporationId() {
		return _vrIssueInspectionRecord.getIssueCorporationId();
	}

	/**
	* Returns the issue ID of this vr issue inspection record.
	*
	* @return the issue ID of this vr issue inspection record
	*/
	@Override
	public long getIssueId() {
		return _vrIssueInspectionRecord.getIssueId();
	}

	/**
	* Returns the issue inspector ID of this vr issue inspection record.
	*
	* @return the issue inspector ID of this vr issue inspection record
	*/
	@Override
	public long getIssueInspectorId() {
		return _vrIssueInspectionRecord.getIssueInspectorId();
	}

	/**
	* Returns the mt core of this vr issue inspection record.
	*
	* @return the mt core of this vr issue inspection record
	*/
	@Override
	public long getMtCore() {
		return _vrIssueInspectionRecord.getMtCore();
	}

	/**
	* Returns the primary key of this vr issue inspection record.
	*
	* @return the primary key of this vr issue inspection record
	*/
	@Override
	public long getPrimaryKey() {
		return _vrIssueInspectionRecord.getPrimaryKey();
	}

	/**
	* Returns the verify corporation ID of this vr issue inspection record.
	*
	* @return the verify corporation ID of this vr issue inspection record
	*/
	@Override
	public long getVerifyCorporationId() {
		return _vrIssueInspectionRecord.getVerifyCorporationId();
	}

	/**
	* Returns the verify inspector ID of this vr issue inspection record.
	*
	* @return the verify inspector ID of this vr issue inspection record
	*/
	@Override
	public long getVerifyInspectorId() {
		return _vrIssueInspectionRecord.getVerifyInspectorId();
	}

	@Override
	public void persist() {
		_vrIssueInspectionRecord.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrIssueInspectionRecord.setCachedModel(cachedModel);
	}

	/**
	* Sets the certificate ID of this vr issue inspection record.
	*
	* @param certificateId the certificate ID of this vr issue inspection record
	*/
	@Override
	public void setCertificateId(long certificateId) {
		_vrIssueInspectionRecord.setCertificateId(certificateId);
	}

	/**
	* Sets the corporation ID of this vr issue inspection record.
	*
	* @param corporationId the corporation ID of this vr issue inspection record
	*/
	@Override
	public void setCorporationId(long corporationId) {
		_vrIssueInspectionRecord.setCorporationId(corporationId);
	}

	/**
	* Sets the digital issue status of this vr issue inspection record.
	*
	* @param digitalIssueStatus the digital issue status of this vr issue inspection record
	*/
	@Override
	public void setDigitalIssueStatus(java.lang.String digitalIssueStatus) {
		_vrIssueInspectionRecord.setDigitalIssueStatus(digitalIssueStatus);
	}

	/**
	* Sets the document file entryid of this vr issue inspection record.
	*
	* @param documentFileEntryid the document file entryid of this vr issue inspection record
	*/
	@Override
	public void setDocumentFileEntryid(long documentFileEntryid) {
		_vrIssueInspectionRecord.setDocumentFileEntryid(documentFileEntryid);
	}

	/**
	* Sets the dossier ID of this vr issue inspection record.
	*
	* @param dossierId the dossier ID of this vr issue inspection record
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrIssueInspectionRecord.setDossierId(dossierId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrIssueInspectionRecord.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrIssueInspectionRecord.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrIssueInspectionRecord.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr issue inspection record.
	*
	* @param id the ID of this vr issue inspection record
	*/
	@Override
	public void setId(long id) {
		_vrIssueInspectionRecord.setId(id);
	}

	/**
	* Sets the inspector code of this vr issue inspection record.
	*
	* @param inspectorCode the inspector code of this vr issue inspection record
	*/
	@Override
	public void setInspectorCode(java.lang.String inspectorCode) {
		_vrIssueInspectionRecord.setInspectorCode(inspectorCode);
	}

	/**
	* Sets the inspector ID of this vr issue inspection record.
	*
	* @param inspectorId the inspector ID of this vr issue inspection record
	*/
	@Override
	public void setInspectorId(long inspectorId) {
		_vrIssueInspectionRecord.setInspectorId(inspectorId);
	}

	/**
	* Sets the inspector name of this vr issue inspection record.
	*
	* @param inspectorName the inspector name of this vr issue inspection record
	*/
	@Override
	public void setInspectorName(java.lang.String inspectorName) {
		_vrIssueInspectionRecord.setInspectorName(inspectorName);
	}

	/**
	* Sets the issue corporation ID of this vr issue inspection record.
	*
	* @param issueCorporationId the issue corporation ID of this vr issue inspection record
	*/
	@Override
	public void setIssueCorporationId(long issueCorporationId) {
		_vrIssueInspectionRecord.setIssueCorporationId(issueCorporationId);
	}

	/**
	* Sets the issue ID of this vr issue inspection record.
	*
	* @param issueId the issue ID of this vr issue inspection record
	*/
	@Override
	public void setIssueId(long issueId) {
		_vrIssueInspectionRecord.setIssueId(issueId);
	}

	/**
	* Sets the issue inspector ID of this vr issue inspection record.
	*
	* @param issueInspectorId the issue inspector ID of this vr issue inspection record
	*/
	@Override
	public void setIssueInspectorId(long issueInspectorId) {
		_vrIssueInspectionRecord.setIssueInspectorId(issueInspectorId);
	}

	/**
	* Sets the leader name of this vr issue inspection record.
	*
	* @param leaderName the leader name of this vr issue inspection record
	*/
	@Override
	public void setLeaderName(java.lang.String leaderName) {
		_vrIssueInspectionRecord.setLeaderName(leaderName);
	}

	/**
	* Sets the modify date of this vr issue inspection record.
	*
	* @param modifyDate the modify date of this vr issue inspection record
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrIssueInspectionRecord.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr issue inspection record.
	*
	* @param mtCore the mt core of this vr issue inspection record
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrIssueInspectionRecord.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrIssueInspectionRecord.setNew(n);
	}

	/**
	* Sets the post review of this vr issue inspection record.
	*
	* @param postReview the post review of this vr issue inspection record
	*/
	@Override
	public void setPostReview(java.lang.String postReview) {
		_vrIssueInspectionRecord.setPostReview(postReview);
	}

	/**
	* Sets the post review record date of this vr issue inspection record.
	*
	* @param postReviewRecordDate the post review record date of this vr issue inspection record
	*/
	@Override
	public void setPostReviewRecordDate(Date postReviewRecordDate) {
		_vrIssueInspectionRecord.setPostReviewRecordDate(postReviewRecordDate);
	}

	/**
	* Sets the post review record no of this vr issue inspection record.
	*
	* @param postReviewRecordNo the post review record no of this vr issue inspection record
	*/
	@Override
	public void setPostReviewRecordNo(java.lang.String postReviewRecordNo) {
		_vrIssueInspectionRecord.setPostReviewRecordNo(postReviewRecordNo);
	}

	/**
	* Sets the primary key of this vr issue inspection record.
	*
	* @param primaryKey the primary key of this vr issue inspection record
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrIssueInspectionRecord.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrIssueInspectionRecord.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sync date of this vr issue inspection record.
	*
	* @param syncDate the sync date of this vr issue inspection record
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrIssueInspectionRecord.setSyncDate(syncDate);
	}

	/**
	* Sets the total quantity of this vr issue inspection record.
	*
	* @param totalQuantity the total quantity of this vr issue inspection record
	*/
	@Override
	public void setTotalQuantity(int totalQuantity) {
		_vrIssueInspectionRecord.setTotalQuantity(totalQuantity);
	}

	/**
	* Sets the valid inspection note of this vr issue inspection record.
	*
	* @param validInspectionNote the valid inspection note of this vr issue inspection record
	*/
	@Override
	public void setValidInspectionNote(java.lang.String validInspectionNote) {
		_vrIssueInspectionRecord.setValidInspectionNote(validInspectionNote);
	}

	/**
	* Sets the valid remarks of this vr issue inspection record.
	*
	* @param validRemarks the valid remarks of this vr issue inspection record
	*/
	@Override
	public void setValidRemarks(java.lang.String validRemarks) {
		_vrIssueInspectionRecord.setValidRemarks(validRemarks);
	}

	/**
	* Sets the verify corporation ID of this vr issue inspection record.
	*
	* @param verifyCorporationId the verify corporation ID of this vr issue inspection record
	*/
	@Override
	public void setVerifyCorporationId(long verifyCorporationId) {
		_vrIssueInspectionRecord.setVerifyCorporationId(verifyCorporationId);
	}

	/**
	* Sets the verify inspector ID of this vr issue inspection record.
	*
	* @param verifyInspectorId the verify inspector ID of this vr issue inspection record
	*/
	@Override
	public void setVerifyInspectorId(long verifyInspectorId) {
		_vrIssueInspectionRecord.setVerifyInspectorId(verifyInspectorId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRIssueInspectionRecordWrapper)) {
			return false;
		}

		VRIssueInspectionRecordWrapper vrIssueInspectionRecordWrapper = (VRIssueInspectionRecordWrapper)obj;

		if (Objects.equals(_vrIssueInspectionRecord,
					vrIssueInspectionRecordWrapper._vrIssueInspectionRecord)) {
			return true;
		}

		return false;
	}

	@Override
	public VRIssueInspectionRecord getWrappedModel() {
		return _vrIssueInspectionRecord;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrIssueInspectionRecord.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrIssueInspectionRecord.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrIssueInspectionRecord.resetOriginalValues();
	}

	private final VRIssueInspectionRecord _vrIssueInspectionRecord;
}