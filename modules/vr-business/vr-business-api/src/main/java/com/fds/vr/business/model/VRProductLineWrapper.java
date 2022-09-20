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
 * This class is a wrapper for {@link VRProductLine}.
 * </p>
 *
 * @author LamTV
 * @see VRProductLine
 * @generated
 */
@ProviderType
public class VRProductLineWrapper implements VRProductLine,
	ModelWrapper<VRProductLine> {
	public VRProductLineWrapper(VRProductLine vrProductLine) {
		_vrProductLine = vrProductLine;
	}

	@Override
	public Class<?> getModelClass() {
		return VRProductLine.class;
	}

	@Override
	public String getModelClassName() {
		return VRProductLine.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("productPlantID", getProductPlantID());
		attributes.put("productTypeID", getProductTypeID());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("trademark", getTrademark());
		attributes.put("trademarkName", getTrademarkName());
		attributes.put("commercialName", getCommercialName());
		attributes.put("modelCode", getModelCode());
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

		Long productTypeID = (Long)attributes.get("productTypeID");

		if (productTypeID != null) {
			setProductTypeID(productTypeID);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String trademark = (String)attributes.get("trademark");

		if (trademark != null) {
			setTrademark(trademark);
		}

		String trademarkName = (String)attributes.get("trademarkName");

		if (trademarkName != null) {
			setTrademarkName(trademarkName);
		}

		String commercialName = (String)attributes.get("commercialName");

		if (commercialName != null) {
			setCommercialName(commercialName);
		}

		String modelCode = (String)attributes.get("modelCode");

		if (modelCode != null) {
			setModelCode(modelCode);
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
	public VRProductLine toEscapedModel() {
		return new VRProductLineWrapper(_vrProductLine.toEscapedModel());
	}

	@Override
	public VRProductLine toUnescapedModel() {
		return new VRProductLineWrapper(_vrProductLine.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrProductLine.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrProductLine.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrProductLine.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrProductLine.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRProductLine> toCacheModel() {
		return _vrProductLine.toCacheModel();
	}

	@Override
	public int compareTo(VRProductLine vrProductLine) {
		return _vrProductLine.compareTo(vrProductLine);
	}

	@Override
	public int hashCode() {
		return _vrProductLine.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrProductLine.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRProductLineWrapper((VRProductLine)_vrProductLine.clone());
	}

	/**
	* Returns the commercial name of this vr product line.
	*
	* @return the commercial name of this vr product line
	*/
	@Override
	public java.lang.String getCommercialName() {
		return _vrProductLine.getCommercialName();
	}

	/**
	* Returns the model code of this vr product line.
	*
	* @return the model code of this vr product line
	*/
	@Override
	public java.lang.String getModelCode() {
		return _vrProductLine.getModelCode();
	}

	/**
	* Returns the trademark of this vr product line.
	*
	* @return the trademark of this vr product line
	*/
	@Override
	public java.lang.String getTrademark() {
		return _vrProductLine.getTrademark();
	}

	/**
	* Returns the trademark name of this vr product line.
	*
	* @return the trademark name of this vr product line
	*/
	@Override
	public java.lang.String getTrademarkName() {
		return _vrProductLine.getTrademarkName();
	}

	@Override
	public java.lang.String toString() {
		return _vrProductLine.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrProductLine.toXmlString();
	}

	/**
	* Returns the modify date of this vr product line.
	*
	* @return the modify date of this vr product line
	*/
	@Override
	public Date getModifyDate() {
		return _vrProductLine.getModifyDate();
	}

	/**
	* Returns the sync date of this vr product line.
	*
	* @return the sync date of this vr product line
	*/
	@Override
	public Date getSyncDate() {
		return _vrProductLine.getSyncDate();
	}

	/**
	* Returns the ID of this vr product line.
	*
	* @return the ID of this vr product line
	*/
	@Override
	public long getId() {
		return _vrProductLine.getId();
	}

	/**
	* Returns the mt core of this vr product line.
	*
	* @return the mt core of this vr product line
	*/
	@Override
	public long getMtCore() {
		return _vrProductLine.getMtCore();
	}

	/**
	* Returns the primary key of this vr product line.
	*
	* @return the primary key of this vr product line
	*/
	@Override
	public long getPrimaryKey() {
		return _vrProductLine.getPrimaryKey();
	}

	/**
	* Returns the product plant ID of this vr product line.
	*
	* @return the product plant ID of this vr product line
	*/
	@Override
	public long getProductPlantID() {
		return _vrProductLine.getProductPlantID();
	}

	/**
	* Returns the product type ID of this vr product line.
	*
	* @return the product type ID of this vr product line
	*/
	@Override
	public long getProductTypeID() {
		return _vrProductLine.getProductTypeID();
	}

	/**
	* Returns the sequence no of this vr product line.
	*
	* @return the sequence no of this vr product line
	*/
	@Override
	public long getSequenceNo() {
		return _vrProductLine.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrProductLine.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrProductLine.setCachedModel(cachedModel);
	}

	/**
	* Sets the commercial name of this vr product line.
	*
	* @param commercialName the commercial name of this vr product line
	*/
	@Override
	public void setCommercialName(java.lang.String commercialName) {
		_vrProductLine.setCommercialName(commercialName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrProductLine.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrProductLine.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrProductLine.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr product line.
	*
	* @param id the ID of this vr product line
	*/
	@Override
	public void setId(long id) {
		_vrProductLine.setId(id);
	}

	/**
	* Sets the model code of this vr product line.
	*
	* @param modelCode the model code of this vr product line
	*/
	@Override
	public void setModelCode(java.lang.String modelCode) {
		_vrProductLine.setModelCode(modelCode);
	}

	/**
	* Sets the modify date of this vr product line.
	*
	* @param modifyDate the modify date of this vr product line
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrProductLine.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr product line.
	*
	* @param mtCore the mt core of this vr product line
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrProductLine.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrProductLine.setNew(n);
	}

	/**
	* Sets the primary key of this vr product line.
	*
	* @param primaryKey the primary key of this vr product line
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrProductLine.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrProductLine.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product plant ID of this vr product line.
	*
	* @param productPlantID the product plant ID of this vr product line
	*/
	@Override
	public void setProductPlantID(long productPlantID) {
		_vrProductLine.setProductPlantID(productPlantID);
	}

	/**
	* Sets the product type ID of this vr product line.
	*
	* @param productTypeID the product type ID of this vr product line
	*/
	@Override
	public void setProductTypeID(long productTypeID) {
		_vrProductLine.setProductTypeID(productTypeID);
	}

	/**
	* Sets the sequence no of this vr product line.
	*
	* @param sequenceNo the sequence no of this vr product line
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrProductLine.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the sync date of this vr product line.
	*
	* @param syncDate the sync date of this vr product line
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrProductLine.setSyncDate(syncDate);
	}

	/**
	* Sets the trademark of this vr product line.
	*
	* @param trademark the trademark of this vr product line
	*/
	@Override
	public void setTrademark(java.lang.String trademark) {
		_vrProductLine.setTrademark(trademark);
	}

	/**
	* Sets the trademark name of this vr product line.
	*
	* @param trademarkName the trademark name of this vr product line
	*/
	@Override
	public void setTrademarkName(java.lang.String trademarkName) {
		_vrProductLine.setTrademarkName(trademarkName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductLineWrapper)) {
			return false;
		}

		VRProductLineWrapper vrProductLineWrapper = (VRProductLineWrapper)obj;

		if (Objects.equals(_vrProductLine, vrProductLineWrapper._vrProductLine)) {
			return true;
		}

		return false;
	}

	@Override
	public VRProductLine getWrappedModel() {
		return _vrProductLine;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrProductLine.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrProductLine.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrProductLine.resetOriginalValues();
	}

	private final VRProductLine _vrProductLine;
}