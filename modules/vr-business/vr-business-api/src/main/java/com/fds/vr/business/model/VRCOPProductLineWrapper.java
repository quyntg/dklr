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
 * This class is a wrapper for {@link VRCOPProductLine}.
 * </p>
 *
 * @author LamTV
 * @see VRCOPProductLine
 * @generated
 */
@ProviderType
public class VRCOPProductLineWrapper implements VRCOPProductLine,
	ModelWrapper<VRCOPProductLine> {
	public VRCOPProductLineWrapper(VRCOPProductLine vrcopProductLine) {
		_vrcopProductLine = vrcopProductLine;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCOPProductLine.class;
	}

	@Override
	public String getModelClassName() {
		return VRCOPProductLine.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("copReportRepositoryID", getCopReportRepositoryID());
		attributes.put("copReportNo", getCopReportNo());
		attributes.put("copProductTypeID", getCopProductTypeID());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("trademark", getTrademark());
		attributes.put("trademarkName", getTrademarkName());
		attributes.put("commercialName", getCommercialName());
		attributes.put("modelCode", getModelCode());
		attributes.put("designSymbolNo", getDesignSymbolNo());
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

		Long copProductTypeID = (Long)attributes.get("copProductTypeID");

		if (copProductTypeID != null) {
			setCopProductTypeID(copProductTypeID);
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

		String designSymbolNo = (String)attributes.get("designSymbolNo");

		if (designSymbolNo != null) {
			setDesignSymbolNo(designSymbolNo);
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
	public VRCOPProductLine toEscapedModel() {
		return new VRCOPProductLineWrapper(_vrcopProductLine.toEscapedModel());
	}

	@Override
	public VRCOPProductLine toUnescapedModel() {
		return new VRCOPProductLineWrapper(_vrcopProductLine.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrcopProductLine.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrcopProductLine.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrcopProductLine.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrcopProductLine.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCOPProductLine> toCacheModel() {
		return _vrcopProductLine.toCacheModel();
	}

	@Override
	public int compareTo(VRCOPProductLine vrcopProductLine) {
		return _vrcopProductLine.compareTo(vrcopProductLine);
	}

	@Override
	public int hashCode() {
		return _vrcopProductLine.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrcopProductLine.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCOPProductLineWrapper((VRCOPProductLine)_vrcopProductLine.clone());
	}

	/**
	* Returns the commercial name of this vrcop product line.
	*
	* @return the commercial name of this vrcop product line
	*/
	@Override
	public java.lang.String getCommercialName() {
		return _vrcopProductLine.getCommercialName();
	}

	/**
	* Returns the cop report no of this vrcop product line.
	*
	* @return the cop report no of this vrcop product line
	*/
	@Override
	public java.lang.String getCopReportNo() {
		return _vrcopProductLine.getCopReportNo();
	}

	/**
	* Returns the design symbol no of this vrcop product line.
	*
	* @return the design symbol no of this vrcop product line
	*/
	@Override
	public java.lang.String getDesignSymbolNo() {
		return _vrcopProductLine.getDesignSymbolNo();
	}

	/**
	* Returns the model code of this vrcop product line.
	*
	* @return the model code of this vrcop product line
	*/
	@Override
	public java.lang.String getModelCode() {
		return _vrcopProductLine.getModelCode();
	}

	/**
	* Returns the trademark of this vrcop product line.
	*
	* @return the trademark of this vrcop product line
	*/
	@Override
	public java.lang.String getTrademark() {
		return _vrcopProductLine.getTrademark();
	}

	/**
	* Returns the trademark name of this vrcop product line.
	*
	* @return the trademark name of this vrcop product line
	*/
	@Override
	public java.lang.String getTrademarkName() {
		return _vrcopProductLine.getTrademarkName();
	}

	@Override
	public java.lang.String toString() {
		return _vrcopProductLine.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrcopProductLine.toXmlString();
	}

	/**
	* Returns the modify date of this vrcop product line.
	*
	* @return the modify date of this vrcop product line
	*/
	@Override
	public Date getModifyDate() {
		return _vrcopProductLine.getModifyDate();
	}

	/**
	* Returns the sync date of this vrcop product line.
	*
	* @return the sync date of this vrcop product line
	*/
	@Override
	public Date getSyncDate() {
		return _vrcopProductLine.getSyncDate();
	}

	/**
	* Returns the cop product type ID of this vrcop product line.
	*
	* @return the cop product type ID of this vrcop product line
	*/
	@Override
	public long getCopProductTypeID() {
		return _vrcopProductLine.getCopProductTypeID();
	}

	/**
	* Returns the cop report repository ID of this vrcop product line.
	*
	* @return the cop report repository ID of this vrcop product line
	*/
	@Override
	public long getCopReportRepositoryID() {
		return _vrcopProductLine.getCopReportRepositoryID();
	}

	/**
	* Returns the ID of this vrcop product line.
	*
	* @return the ID of this vrcop product line
	*/
	@Override
	public long getId() {
		return _vrcopProductLine.getId();
	}

	/**
	* Returns the mt core of this vrcop product line.
	*
	* @return the mt core of this vrcop product line
	*/
	@Override
	public long getMtCore() {
		return _vrcopProductLine.getMtCore();
	}

	/**
	* Returns the primary key of this vrcop product line.
	*
	* @return the primary key of this vrcop product line
	*/
	@Override
	public long getPrimaryKey() {
		return _vrcopProductLine.getPrimaryKey();
	}

	/**
	* Returns the sequence no of this vrcop product line.
	*
	* @return the sequence no of this vrcop product line
	*/
	@Override
	public long getSequenceNo() {
		return _vrcopProductLine.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrcopProductLine.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrcopProductLine.setCachedModel(cachedModel);
	}

	/**
	* Sets the commercial name of this vrcop product line.
	*
	* @param commercialName the commercial name of this vrcop product line
	*/
	@Override
	public void setCommercialName(java.lang.String commercialName) {
		_vrcopProductLine.setCommercialName(commercialName);
	}

	/**
	* Sets the cop product type ID of this vrcop product line.
	*
	* @param copProductTypeID the cop product type ID of this vrcop product line
	*/
	@Override
	public void setCopProductTypeID(long copProductTypeID) {
		_vrcopProductLine.setCopProductTypeID(copProductTypeID);
	}

	/**
	* Sets the cop report no of this vrcop product line.
	*
	* @param copReportNo the cop report no of this vrcop product line
	*/
	@Override
	public void setCopReportNo(java.lang.String copReportNo) {
		_vrcopProductLine.setCopReportNo(copReportNo);
	}

	/**
	* Sets the cop report repository ID of this vrcop product line.
	*
	* @param copReportRepositoryID the cop report repository ID of this vrcop product line
	*/
	@Override
	public void setCopReportRepositoryID(long copReportRepositoryID) {
		_vrcopProductLine.setCopReportRepositoryID(copReportRepositoryID);
	}

	/**
	* Sets the design symbol no of this vrcop product line.
	*
	* @param designSymbolNo the design symbol no of this vrcop product line
	*/
	@Override
	public void setDesignSymbolNo(java.lang.String designSymbolNo) {
		_vrcopProductLine.setDesignSymbolNo(designSymbolNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrcopProductLine.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrcopProductLine.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrcopProductLine.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vrcop product line.
	*
	* @param id the ID of this vrcop product line
	*/
	@Override
	public void setId(long id) {
		_vrcopProductLine.setId(id);
	}

	/**
	* Sets the model code of this vrcop product line.
	*
	* @param modelCode the model code of this vrcop product line
	*/
	@Override
	public void setModelCode(java.lang.String modelCode) {
		_vrcopProductLine.setModelCode(modelCode);
	}

	/**
	* Sets the modify date of this vrcop product line.
	*
	* @param modifyDate the modify date of this vrcop product line
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrcopProductLine.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vrcop product line.
	*
	* @param mtCore the mt core of this vrcop product line
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrcopProductLine.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrcopProductLine.setNew(n);
	}

	/**
	* Sets the primary key of this vrcop product line.
	*
	* @param primaryKey the primary key of this vrcop product line
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrcopProductLine.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrcopProductLine.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sequence no of this vrcop product line.
	*
	* @param sequenceNo the sequence no of this vrcop product line
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrcopProductLine.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the sync date of this vrcop product line.
	*
	* @param syncDate the sync date of this vrcop product line
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrcopProductLine.setSyncDate(syncDate);
	}

	/**
	* Sets the trademark of this vrcop product line.
	*
	* @param trademark the trademark of this vrcop product line
	*/
	@Override
	public void setTrademark(java.lang.String trademark) {
		_vrcopProductLine.setTrademark(trademark);
	}

	/**
	* Sets the trademark name of this vrcop product line.
	*
	* @param trademarkName the trademark name of this vrcop product line
	*/
	@Override
	public void setTrademarkName(java.lang.String trademarkName) {
		_vrcopProductLine.setTrademarkName(trademarkName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProductLineWrapper)) {
			return false;
		}

		VRCOPProductLineWrapper vrcopProductLineWrapper = (VRCOPProductLineWrapper)obj;

		if (Objects.equals(_vrcopProductLine,
					vrcopProductLineWrapper._vrcopProductLine)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCOPProductLine getWrappedModel() {
		return _vrcopProductLine;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrcopProductLine.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrcopProductLine.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrcopProductLine.resetOriginalValues();
	}

	private final VRCOPProductLine _vrcopProductLine;
}