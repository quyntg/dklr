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
 * This class is a wrapper for {@link VRCOPProductClassification}.
 * </p>
 *
 * @author LamTV
 * @see VRCOPProductClassification
 * @generated
 */
@ProviderType
public class VRCOPProductClassificationWrapper
	implements VRCOPProductClassification,
		ModelWrapper<VRCOPProductClassification> {
	public VRCOPProductClassificationWrapper(
		VRCOPProductClassification vrcopProductClassification) {
		_vrcopProductClassification = vrcopProductClassification;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCOPProductClassification.class;
	}

	@Override
	public String getModelClassName() {
		return VRCOPProductClassification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("copReportRepositoryID", getCopReportRepositoryID());
		attributes.put("copReportNo", getCopReportNo());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("productClassificationCode",
			getProductClassificationCode());
		attributes.put("productClassificationDescription",
			getProductClassificationDescription());
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

		Long copReportRepositoryID = (Long)attributes.get(
				"copReportRepositoryID");

		if (copReportRepositoryID != null) {
			setCopReportRepositoryID(copReportRepositoryID);
		}

		String copReportNo = (String)attributes.get("copReportNo");

		if (copReportNo != null) {
			setCopReportNo(copReportNo);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

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
	public VRCOPProductClassification toEscapedModel() {
		return new VRCOPProductClassificationWrapper(_vrcopProductClassification.toEscapedModel());
	}

	@Override
	public VRCOPProductClassification toUnescapedModel() {
		return new VRCOPProductClassificationWrapper(_vrcopProductClassification.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrcopProductClassification.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrcopProductClassification.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrcopProductClassification.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrcopProductClassification.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCOPProductClassification> toCacheModel() {
		return _vrcopProductClassification.toCacheModel();
	}

	@Override
	public int compareTo(VRCOPProductClassification vrcopProductClassification) {
		return _vrcopProductClassification.compareTo(vrcopProductClassification);
	}

	@Override
	public int hashCode() {
		return _vrcopProductClassification.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrcopProductClassification.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCOPProductClassificationWrapper((VRCOPProductClassification)_vrcopProductClassification.clone());
	}

	/**
	* Returns the cop report no of this vrcop product classification.
	*
	* @return the cop report no of this vrcop product classification
	*/
	@Override
	public java.lang.String getCopReportNo() {
		return _vrcopProductClassification.getCopReportNo();
	}

	/**
	* Returns the product classification code of this vrcop product classification.
	*
	* @return the product classification code of this vrcop product classification
	*/
	@Override
	public java.lang.String getProductClassificationCode() {
		return _vrcopProductClassification.getProductClassificationCode();
	}

	/**
	* Returns the product classification description of this vrcop product classification.
	*
	* @return the product classification description of this vrcop product classification
	*/
	@Override
	public java.lang.String getProductClassificationDescription() {
		return _vrcopProductClassification.getProductClassificationDescription();
	}

	@Override
	public java.lang.String toString() {
		return _vrcopProductClassification.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrcopProductClassification.toXmlString();
	}

	/**
	* Returns the modify date of this vrcop product classification.
	*
	* @return the modify date of this vrcop product classification
	*/
	@Override
	public Date getModifyDate() {
		return _vrcopProductClassification.getModifyDate();
	}

	/**
	* Returns the sync date of this vrcop product classification.
	*
	* @return the sync date of this vrcop product classification
	*/
	@Override
	public Date getSyncDate() {
		return _vrcopProductClassification.getSyncDate();
	}

	/**
	* Returns the cop report repository ID of this vrcop product classification.
	*
	* @return the cop report repository ID of this vrcop product classification
	*/
	@Override
	public long getCopReportRepositoryID() {
		return _vrcopProductClassification.getCopReportRepositoryID();
	}

	/**
	* Returns the ID of this vrcop product classification.
	*
	* @return the ID of this vrcop product classification
	*/
	@Override
	public long getId() {
		return _vrcopProductClassification.getId();
	}

	/**
	* Returns the mt core of this vrcop product classification.
	*
	* @return the mt core of this vrcop product classification
	*/
	@Override
	public long getMtCore() {
		return _vrcopProductClassification.getMtCore();
	}

	/**
	* Returns the primary key of this vrcop product classification.
	*
	* @return the primary key of this vrcop product classification
	*/
	@Override
	public long getPrimaryKey() {
		return _vrcopProductClassification.getPrimaryKey();
	}

	/**
	* Returns the sequence no of this vrcop product classification.
	*
	* @return the sequence no of this vrcop product classification
	*/
	@Override
	public long getSequenceNo() {
		return _vrcopProductClassification.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrcopProductClassification.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrcopProductClassification.setCachedModel(cachedModel);
	}

	/**
	* Sets the cop report no of this vrcop product classification.
	*
	* @param copReportNo the cop report no of this vrcop product classification
	*/
	@Override
	public void setCopReportNo(java.lang.String copReportNo) {
		_vrcopProductClassification.setCopReportNo(copReportNo);
	}

	/**
	* Sets the cop report repository ID of this vrcop product classification.
	*
	* @param copReportRepositoryID the cop report repository ID of this vrcop product classification
	*/
	@Override
	public void setCopReportRepositoryID(long copReportRepositoryID) {
		_vrcopProductClassification.setCopReportRepositoryID(copReportRepositoryID);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrcopProductClassification.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrcopProductClassification.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrcopProductClassification.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vrcop product classification.
	*
	* @param id the ID of this vrcop product classification
	*/
	@Override
	public void setId(long id) {
		_vrcopProductClassification.setId(id);
	}

	/**
	* Sets the modify date of this vrcop product classification.
	*
	* @param modifyDate the modify date of this vrcop product classification
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrcopProductClassification.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vrcop product classification.
	*
	* @param mtCore the mt core of this vrcop product classification
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrcopProductClassification.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrcopProductClassification.setNew(n);
	}

	/**
	* Sets the primary key of this vrcop product classification.
	*
	* @param primaryKey the primary key of this vrcop product classification
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrcopProductClassification.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrcopProductClassification.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product classification code of this vrcop product classification.
	*
	* @param productClassificationCode the product classification code of this vrcop product classification
	*/
	@Override
	public void setProductClassificationCode(
		java.lang.String productClassificationCode) {
		_vrcopProductClassification.setProductClassificationCode(productClassificationCode);
	}

	/**
	* Sets the product classification description of this vrcop product classification.
	*
	* @param productClassificationDescription the product classification description of this vrcop product classification
	*/
	@Override
	public void setProductClassificationDescription(
		java.lang.String productClassificationDescription) {
		_vrcopProductClassification.setProductClassificationDescription(productClassificationDescription);
	}

	/**
	* Sets the sequence no of this vrcop product classification.
	*
	* @param sequenceNo the sequence no of this vrcop product classification
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrcopProductClassification.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the sync date of this vrcop product classification.
	*
	* @param syncDate the sync date of this vrcop product classification
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrcopProductClassification.setSyncDate(syncDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProductClassificationWrapper)) {
			return false;
		}

		VRCOPProductClassificationWrapper vrcopProductClassificationWrapper = (VRCOPProductClassificationWrapper)obj;

		if (Objects.equals(_vrcopProductClassification,
					vrcopProductClassificationWrapper._vrcopProductClassification)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCOPProductClassification getWrappedModel() {
		return _vrcopProductClassification;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrcopProductClassification.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrcopProductClassification.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrcopProductClassification.resetOriginalValues();
	}

	private final VRCOPProductClassification _vrcopProductClassification;
}