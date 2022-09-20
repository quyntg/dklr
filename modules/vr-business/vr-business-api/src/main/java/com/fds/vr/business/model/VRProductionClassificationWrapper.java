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
 * This class is a wrapper for {@link VRProductionClassification}.
 * </p>
 *
 * @author LamTV
 * @see VRProductionClassification
 * @generated
 */
@ProviderType
public class VRProductionClassificationWrapper
	implements VRProductionClassification,
		ModelWrapper<VRProductionClassification> {
	public VRProductionClassificationWrapper(
		VRProductionClassification vrProductionClassification) {
		_vrProductionClassification = vrProductionClassification;
	}

	@Override
	public Class<?> getModelClass() {
		return VRProductionClassification.class;
	}

	@Override
	public String getModelClassName() {
		return VRProductionClassification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("applicantProfileId", getApplicantProfileId());
		attributes.put("applicantCode", getApplicantCode());
		attributes.put("productionPlantId", getProductionPlantId());
		attributes.put("productionPlantCode", getProductionPlantCode());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("productClassificationCode",
			getProductClassificationCode());
		attributes.put("productClassificationDescription",
			getProductClassificationDescription());
		attributes.put("classificationMode", getClassificationMode());
		attributes.put("remarks", getRemarks());
		attributes.put("status", getStatus());
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

		Long applicantProfileId = (Long)attributes.get("applicantProfileId");

		if (applicantProfileId != null) {
			setApplicantProfileId(applicantProfileId);
		}

		String applicantCode = (String)attributes.get("applicantCode");

		if (applicantCode != null) {
			setApplicantCode(applicantCode);
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

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String productClassificationCode = (String)attributes.get(
				"productClassificationCode");

		if (productClassificationCode != null) {
			setProductClassificationCode(productClassificationCode);
		}

		String productClassificationDescription = (String)attributes.get(
				"productClassificationDescription");

		if (productClassificationDescription != null) {
			setProductClassificationDescription(productClassificationDescription);
		}

		String classificationMode = (String)attributes.get("classificationMode");

		if (classificationMode != null) {
			setClassificationMode(classificationMode);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
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
	public VRProductionClassification toEscapedModel() {
		return new VRProductionClassificationWrapper(_vrProductionClassification.toEscapedModel());
	}

	@Override
	public VRProductionClassification toUnescapedModel() {
		return new VRProductionClassificationWrapper(_vrProductionClassification.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrProductionClassification.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrProductionClassification.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrProductionClassification.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrProductionClassification.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRProductionClassification> toCacheModel() {
		return _vrProductionClassification.toCacheModel();
	}

	@Override
	public int compareTo(VRProductionClassification vrProductionClassification) {
		return _vrProductionClassification.compareTo(vrProductionClassification);
	}

	/**
	* Returns the sequence no of this vr production classification.
	*
	* @return the sequence no of this vr production classification
	*/
	@Override
	public int getSequenceNo() {
		return _vrProductionClassification.getSequenceNo();
	}

	@Override
	public int hashCode() {
		return _vrProductionClassification.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrProductionClassification.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRProductionClassificationWrapper((VRProductionClassification)_vrProductionClassification.clone());
	}

	/**
	* Returns the applicant code of this vr production classification.
	*
	* @return the applicant code of this vr production classification
	*/
	@Override
	public java.lang.String getApplicantCode() {
		return _vrProductionClassification.getApplicantCode();
	}

	/**
	* Returns the classification mode of this vr production classification.
	*
	* @return the classification mode of this vr production classification
	*/
	@Override
	public java.lang.String getClassificationMode() {
		return _vrProductionClassification.getClassificationMode();
	}

	/**
	* Returns the product classification code of this vr production classification.
	*
	* @return the product classification code of this vr production classification
	*/
	@Override
	public java.lang.String getProductClassificationCode() {
		return _vrProductionClassification.getProductClassificationCode();
	}

	/**
	* Returns the product classification description of this vr production classification.
	*
	* @return the product classification description of this vr production classification
	*/
	@Override
	public java.lang.String getProductClassificationDescription() {
		return _vrProductionClassification.getProductClassificationDescription();
	}

	/**
	* Returns the production plant code of this vr production classification.
	*
	* @return the production plant code of this vr production classification
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrProductionClassification.getProductionPlantCode();
	}

	/**
	* Returns the remarks of this vr production classification.
	*
	* @return the remarks of this vr production classification
	*/
	@Override
	public java.lang.String getRemarks() {
		return _vrProductionClassification.getRemarks();
	}

	/**
	* Returns the status of this vr production classification.
	*
	* @return the status of this vr production classification
	*/
	@Override
	public java.lang.String getStatus() {
		return _vrProductionClassification.getStatus();
	}

	@Override
	public java.lang.String toString() {
		return _vrProductionClassification.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrProductionClassification.toXmlString();
	}

	/**
	* Returns the modify date of this vr production classification.
	*
	* @return the modify date of this vr production classification
	*/
	@Override
	public Date getModifyDate() {
		return _vrProductionClassification.getModifyDate();
	}

	/**
	* Returns the sync date of this vr production classification.
	*
	* @return the sync date of this vr production classification
	*/
	@Override
	public Date getSyncDate() {
		return _vrProductionClassification.getSyncDate();
	}

	/**
	* Returns the applicant profile ID of this vr production classification.
	*
	* @return the applicant profile ID of this vr production classification
	*/
	@Override
	public long getApplicantProfileId() {
		return _vrProductionClassification.getApplicantProfileId();
	}

	/**
	* Returns the ID of this vr production classification.
	*
	* @return the ID of this vr production classification
	*/
	@Override
	public long getId() {
		return _vrProductionClassification.getId();
	}

	/**
	* Returns the mt core of this vr production classification.
	*
	* @return the mt core of this vr production classification
	*/
	@Override
	public long getMtCore() {
		return _vrProductionClassification.getMtCore();
	}

	/**
	* Returns the primary key of this vr production classification.
	*
	* @return the primary key of this vr production classification
	*/
	@Override
	public long getPrimaryKey() {
		return _vrProductionClassification.getPrimaryKey();
	}

	/**
	* Returns the production plant ID of this vr production classification.
	*
	* @return the production plant ID of this vr production classification
	*/
	@Override
	public long getProductionPlantId() {
		return _vrProductionClassification.getProductionPlantId();
	}

	@Override
	public void persist() {
		_vrProductionClassification.persist();
	}

	/**
	* Sets the applicant code of this vr production classification.
	*
	* @param applicantCode the applicant code of this vr production classification
	*/
	@Override
	public void setApplicantCode(java.lang.String applicantCode) {
		_vrProductionClassification.setApplicantCode(applicantCode);
	}

	/**
	* Sets the applicant profile ID of this vr production classification.
	*
	* @param applicantProfileId the applicant profile ID of this vr production classification
	*/
	@Override
	public void setApplicantProfileId(long applicantProfileId) {
		_vrProductionClassification.setApplicantProfileId(applicantProfileId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrProductionClassification.setCachedModel(cachedModel);
	}

	/**
	* Sets the classification mode of this vr production classification.
	*
	* @param classificationMode the classification mode of this vr production classification
	*/
	@Override
	public void setClassificationMode(java.lang.String classificationMode) {
		_vrProductionClassification.setClassificationMode(classificationMode);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrProductionClassification.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrProductionClassification.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrProductionClassification.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr production classification.
	*
	* @param id the ID of this vr production classification
	*/
	@Override
	public void setId(long id) {
		_vrProductionClassification.setId(id);
	}

	/**
	* Sets the modify date of this vr production classification.
	*
	* @param modifyDate the modify date of this vr production classification
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrProductionClassification.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr production classification.
	*
	* @param mtCore the mt core of this vr production classification
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrProductionClassification.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrProductionClassification.setNew(n);
	}

	/**
	* Sets the primary key of this vr production classification.
	*
	* @param primaryKey the primary key of this vr production classification
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrProductionClassification.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrProductionClassification.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product classification code of this vr production classification.
	*
	* @param productClassificationCode the product classification code of this vr production classification
	*/
	@Override
	public void setProductClassificationCode(
		java.lang.String productClassificationCode) {
		_vrProductionClassification.setProductClassificationCode(productClassificationCode);
	}

	/**
	* Sets the product classification description of this vr production classification.
	*
	* @param productClassificationDescription the product classification description of this vr production classification
	*/
	@Override
	public void setProductClassificationDescription(
		java.lang.String productClassificationDescription) {
		_vrProductionClassification.setProductClassificationDescription(productClassificationDescription);
	}

	/**
	* Sets the production plant code of this vr production classification.
	*
	* @param productionPlantCode the production plant code of this vr production classification
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrProductionClassification.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the production plant ID of this vr production classification.
	*
	* @param productionPlantId the production plant ID of this vr production classification
	*/
	@Override
	public void setProductionPlantId(long productionPlantId) {
		_vrProductionClassification.setProductionPlantId(productionPlantId);
	}

	/**
	* Sets the remarks of this vr production classification.
	*
	* @param remarks the remarks of this vr production classification
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_vrProductionClassification.setRemarks(remarks);
	}

	/**
	* Sets the sequence no of this vr production classification.
	*
	* @param sequenceNo the sequence no of this vr production classification
	*/
	@Override
	public void setSequenceNo(int sequenceNo) {
		_vrProductionClassification.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the status of this vr production classification.
	*
	* @param status the status of this vr production classification
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_vrProductionClassification.setStatus(status);
	}

	/**
	* Sets the sync date of this vr production classification.
	*
	* @param syncDate the sync date of this vr production classification
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrProductionClassification.setSyncDate(syncDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductionClassificationWrapper)) {
			return false;
		}

		VRProductionClassificationWrapper vrProductionClassificationWrapper = (VRProductionClassificationWrapper)obj;

		if (Objects.equals(_vrProductionClassification,
					vrProductionClassificationWrapper._vrProductionClassification)) {
			return true;
		}

		return false;
	}

	@Override
	public VRProductionClassification getWrappedModel() {
		return _vrProductionClassification;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrProductionClassification.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrProductionClassification.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrProductionClassification.resetOriginalValues();
	}

	private final VRProductionClassification _vrProductionClassification;
}