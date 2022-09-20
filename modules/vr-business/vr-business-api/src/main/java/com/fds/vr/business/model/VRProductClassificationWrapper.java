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
 * This class is a wrapper for {@link VRProductClassification}.
 * </p>
 *
 * @author LamTV
 * @see VRProductClassification
 * @generated
 */
@ProviderType
public class VRProductClassificationWrapper implements VRProductClassification,
	ModelWrapper<VRProductClassification> {
	public VRProductClassificationWrapper(
		VRProductClassification vrProductClassification) {
		_vrProductClassification = vrProductClassification;
	}

	@Override
	public Class<?> getModelClass() {
		return VRProductClassification.class;
	}

	@Override
	public String getModelClassName() {
		return VRProductClassification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("productPlantID", getProductPlantID());
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

		Long productPlantID = (Long)attributes.get("productPlantID");

		if (productPlantID != null) {
			setProductPlantID(productPlantID);
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
	public VRProductClassification toEscapedModel() {
		return new VRProductClassificationWrapper(_vrProductClassification.toEscapedModel());
	}

	@Override
	public VRProductClassification toUnescapedModel() {
		return new VRProductClassificationWrapper(_vrProductClassification.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrProductClassification.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrProductClassification.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrProductClassification.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrProductClassification.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRProductClassification> toCacheModel() {
		return _vrProductClassification.toCacheModel();
	}

	@Override
	public int compareTo(VRProductClassification vrProductClassification) {
		return _vrProductClassification.compareTo(vrProductClassification);
	}

	@Override
	public int hashCode() {
		return _vrProductClassification.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrProductClassification.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRProductClassificationWrapper((VRProductClassification)_vrProductClassification.clone());
	}

	/**
	* Returns the product classification code of this vr product classification.
	*
	* @return the product classification code of this vr product classification
	*/
	@Override
	public java.lang.String getProductClassificationCode() {
		return _vrProductClassification.getProductClassificationCode();
	}

	/**
	* Returns the product classification description of this vr product classification.
	*
	* @return the product classification description of this vr product classification
	*/
	@Override
	public java.lang.String getProductClassificationDescription() {
		return _vrProductClassification.getProductClassificationDescription();
	}

	@Override
	public java.lang.String toString() {
		return _vrProductClassification.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrProductClassification.toXmlString();
	}

	/**
	* Returns the modify date of this vr product classification.
	*
	* @return the modify date of this vr product classification
	*/
	@Override
	public Date getModifyDate() {
		return _vrProductClassification.getModifyDate();
	}

	/**
	* Returns the sync date of this vr product classification.
	*
	* @return the sync date of this vr product classification
	*/
	@Override
	public Date getSyncDate() {
		return _vrProductClassification.getSyncDate();
	}

	/**
	* Returns the ID of this vr product classification.
	*
	* @return the ID of this vr product classification
	*/
	@Override
	public long getId() {
		return _vrProductClassification.getId();
	}

	/**
	* Returns the mt core of this vr product classification.
	*
	* @return the mt core of this vr product classification
	*/
	@Override
	public long getMtCore() {
		return _vrProductClassification.getMtCore();
	}

	/**
	* Returns the primary key of this vr product classification.
	*
	* @return the primary key of this vr product classification
	*/
	@Override
	public long getPrimaryKey() {
		return _vrProductClassification.getPrimaryKey();
	}

	/**
	* Returns the product plant ID of this vr product classification.
	*
	* @return the product plant ID of this vr product classification
	*/
	@Override
	public long getProductPlantID() {
		return _vrProductClassification.getProductPlantID();
	}

	/**
	* Returns the sequence no of this vr product classification.
	*
	* @return the sequence no of this vr product classification
	*/
	@Override
	public long getSequenceNo() {
		return _vrProductClassification.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrProductClassification.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrProductClassification.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrProductClassification.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrProductClassification.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrProductClassification.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr product classification.
	*
	* @param id the ID of this vr product classification
	*/
	@Override
	public void setId(long id) {
		_vrProductClassification.setId(id);
	}

	/**
	* Sets the modify date of this vr product classification.
	*
	* @param modifyDate the modify date of this vr product classification
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrProductClassification.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr product classification.
	*
	* @param mtCore the mt core of this vr product classification
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrProductClassification.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrProductClassification.setNew(n);
	}

	/**
	* Sets the primary key of this vr product classification.
	*
	* @param primaryKey the primary key of this vr product classification
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrProductClassification.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrProductClassification.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product classification code of this vr product classification.
	*
	* @param productClassificationCode the product classification code of this vr product classification
	*/
	@Override
	public void setProductClassificationCode(
		java.lang.String productClassificationCode) {
		_vrProductClassification.setProductClassificationCode(productClassificationCode);
	}

	/**
	* Sets the product classification description of this vr product classification.
	*
	* @param productClassificationDescription the product classification description of this vr product classification
	*/
	@Override
	public void setProductClassificationDescription(
		java.lang.String productClassificationDescription) {
		_vrProductClassification.setProductClassificationDescription(productClassificationDescription);
	}

	/**
	* Sets the product plant ID of this vr product classification.
	*
	* @param productPlantID the product plant ID of this vr product classification
	*/
	@Override
	public void setProductPlantID(long productPlantID) {
		_vrProductClassification.setProductPlantID(productPlantID);
	}

	/**
	* Sets the sequence no of this vr product classification.
	*
	* @param sequenceNo the sequence no of this vr product classification
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrProductClassification.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the sync date of this vr product classification.
	*
	* @param syncDate the sync date of this vr product classification
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrProductClassification.setSyncDate(syncDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductClassificationWrapper)) {
			return false;
		}

		VRProductClassificationWrapper vrProductClassificationWrapper = (VRProductClassificationWrapper)obj;

		if (Objects.equals(_vrProductClassification,
					vrProductClassificationWrapper._vrProductClassification)) {
			return true;
		}

		return false;
	}

	@Override
	public VRProductClassification getWrappedModel() {
		return _vrProductClassification;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrProductClassification.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrProductClassification.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrProductClassification.resetOriginalValues();
	}

	private final VRProductClassification _vrProductClassification;
}