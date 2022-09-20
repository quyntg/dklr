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

package com.fds.vr.filterconfig.model;

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
 * This class is a wrapper for {@link VRCondition}.
 * </p>
 *
 * @author NhanHoang
 * @see VRCondition
 * @generated
 */
@ProviderType
public class VRConditionWrapper implements VRCondition,
	ModelWrapper<VRCondition> {
	public VRConditionWrapper(VRCondition vrCondition) {
		_vrCondition = vrCondition;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCondition.class;
	}

	@Override
	public String getModelClassName() {
		return VRCondition.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("filterModuleCode", getFilterModuleCode());
		attributes.put("filterTableField", getFilterTableField());
		attributes.put("filterTableName", getFilterTableName());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationDisplayName", getSpecificationDisplayName());
		attributes.put("specificationDataCollectionID",
			getSpecificationDataCollectionID());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("specificationBasicUnit", getSpecificationBasicUnit());
		attributes.put("specificationStandard", getSpecificationStandard());
		attributes.put("specificationGroup", getSpecificationGroup());
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

		String filterModuleCode = (String)attributes.get("filterModuleCode");

		if (filterModuleCode != null) {
			setFilterModuleCode(filterModuleCode);
		}

		String filterTableField = (String)attributes.get("filterTableField");

		if (filterTableField != null) {
			setFilterTableField(filterTableField);
		}

		String filterTableName = (String)attributes.get("filterTableName");

		if (filterTableName != null) {
			setFilterTableName(filterTableName);
		}

		String specificationCode = (String)attributes.get("specificationCode");

		if (specificationCode != null) {
			setSpecificationCode(specificationCode);
		}

		String specificationDisplayName = (String)attributes.get(
				"specificationDisplayName");

		if (specificationDisplayName != null) {
			setSpecificationDisplayName(specificationDisplayName);
		}

		String specificationDataCollectionID = (String)attributes.get(
				"specificationDataCollectionID");

		if (specificationDataCollectionID != null) {
			setSpecificationDataCollectionID(specificationDataCollectionID);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String specificationBasicUnit = (String)attributes.get(
				"specificationBasicUnit");

		if (specificationBasicUnit != null) {
			setSpecificationBasicUnit(specificationBasicUnit);
		}

		String specificationStandard = (String)attributes.get(
				"specificationStandard");

		if (specificationStandard != null) {
			setSpecificationStandard(specificationStandard);
		}

		String specificationGroup = (String)attributes.get("specificationGroup");

		if (specificationGroup != null) {
			setSpecificationGroup(specificationGroup);
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
	public VRCondition toEscapedModel() {
		return new VRConditionWrapper(_vrCondition.toEscapedModel());
	}

	@Override
	public VRCondition toUnescapedModel() {
		return new VRConditionWrapper(_vrCondition.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrCondition.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrCondition.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrCondition.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrCondition.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCondition> toCacheModel() {
		return _vrCondition.toCacheModel();
	}

	@Override
	public int compareTo(VRCondition vrCondition) {
		return _vrCondition.compareTo(vrCondition);
	}

	@Override
	public int hashCode() {
		return _vrCondition.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrCondition.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRConditionWrapper((VRCondition)_vrCondition.clone());
	}

	/**
	* Returns the filter module code of this vr condition.
	*
	* @return the filter module code of this vr condition
	*/
	@Override
	public java.lang.String getFilterModuleCode() {
		return _vrCondition.getFilterModuleCode();
	}

	/**
	* Returns the filter table field of this vr condition.
	*
	* @return the filter table field of this vr condition
	*/
	@Override
	public java.lang.String getFilterTableField() {
		return _vrCondition.getFilterTableField();
	}

	/**
	* Returns the filter table name of this vr condition.
	*
	* @return the filter table name of this vr condition
	*/
	@Override
	public java.lang.String getFilterTableName() {
		return _vrCondition.getFilterTableName();
	}

	/**
	* Returns the specification basic unit of this vr condition.
	*
	* @return the specification basic unit of this vr condition
	*/
	@Override
	public java.lang.String getSpecificationBasicUnit() {
		return _vrCondition.getSpecificationBasicUnit();
	}

	/**
	* Returns the specification code of this vr condition.
	*
	* @return the specification code of this vr condition
	*/
	@Override
	public java.lang.String getSpecificationCode() {
		return _vrCondition.getSpecificationCode();
	}

	/**
	* Returns the specification data collection ID of this vr condition.
	*
	* @return the specification data collection ID of this vr condition
	*/
	@Override
	public java.lang.String getSpecificationDataCollectionID() {
		return _vrCondition.getSpecificationDataCollectionID();
	}

	/**
	* Returns the specification display name of this vr condition.
	*
	* @return the specification display name of this vr condition
	*/
	@Override
	public java.lang.String getSpecificationDisplayName() {
		return _vrCondition.getSpecificationDisplayName();
	}

	/**
	* Returns the specification group of this vr condition.
	*
	* @return the specification group of this vr condition
	*/
	@Override
	public java.lang.String getSpecificationGroup() {
		return _vrCondition.getSpecificationGroup();
	}

	/**
	* Returns the specification standard of this vr condition.
	*
	* @return the specification standard of this vr condition
	*/
	@Override
	public java.lang.String getSpecificationStandard() {
		return _vrCondition.getSpecificationStandard();
	}

	@Override
	public java.lang.String toString() {
		return _vrCondition.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrCondition.toXmlString();
	}

	/**
	* Returns the modify date of this vr condition.
	*
	* @return the modify date of this vr condition
	*/
	@Override
	public Date getModifyDate() {
		return _vrCondition.getModifyDate();
	}

	/**
	* Returns the sync date of this vr condition.
	*
	* @return the sync date of this vr condition
	*/
	@Override
	public Date getSyncDate() {
		return _vrCondition.getSyncDate();
	}

	/**
	* Returns the ID of this vr condition.
	*
	* @return the ID of this vr condition
	*/
	@Override
	public long getId() {
		return _vrCondition.getId();
	}

	/**
	* Returns the primary key of this vr condition.
	*
	* @return the primary key of this vr condition
	*/
	@Override
	public long getPrimaryKey() {
		return _vrCondition.getPrimaryKey();
	}

	/**
	* Returns the sequence no of this vr condition.
	*
	* @return the sequence no of this vr condition
	*/
	@Override
	public long getSequenceNo() {
		return _vrCondition.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrCondition.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrCondition.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrCondition.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrCondition.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrCondition.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the filter module code of this vr condition.
	*
	* @param filterModuleCode the filter module code of this vr condition
	*/
	@Override
	public void setFilterModuleCode(java.lang.String filterModuleCode) {
		_vrCondition.setFilterModuleCode(filterModuleCode);
	}

	/**
	* Sets the filter table field of this vr condition.
	*
	* @param filterTableField the filter table field of this vr condition
	*/
	@Override
	public void setFilterTableField(java.lang.String filterTableField) {
		_vrCondition.setFilterTableField(filterTableField);
	}

	/**
	* Sets the filter table name of this vr condition.
	*
	* @param filterTableName the filter table name of this vr condition
	*/
	@Override
	public void setFilterTableName(java.lang.String filterTableName) {
		_vrCondition.setFilterTableName(filterTableName);
	}

	/**
	* Sets the ID of this vr condition.
	*
	* @param id the ID of this vr condition
	*/
	@Override
	public void setId(long id) {
		_vrCondition.setId(id);
	}

	/**
	* Sets the modify date of this vr condition.
	*
	* @param modifyDate the modify date of this vr condition
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrCondition.setModifyDate(modifyDate);
	}

	@Override
	public void setNew(boolean n) {
		_vrCondition.setNew(n);
	}

	/**
	* Sets the primary key of this vr condition.
	*
	* @param primaryKey the primary key of this vr condition
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrCondition.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrCondition.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sequence no of this vr condition.
	*
	* @param sequenceNo the sequence no of this vr condition
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrCondition.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the specification basic unit of this vr condition.
	*
	* @param specificationBasicUnit the specification basic unit of this vr condition
	*/
	@Override
	public void setSpecificationBasicUnit(
		java.lang.String specificationBasicUnit) {
		_vrCondition.setSpecificationBasicUnit(specificationBasicUnit);
	}

	/**
	* Sets the specification code of this vr condition.
	*
	* @param specificationCode the specification code of this vr condition
	*/
	@Override
	public void setSpecificationCode(java.lang.String specificationCode) {
		_vrCondition.setSpecificationCode(specificationCode);
	}

	/**
	* Sets the specification data collection ID of this vr condition.
	*
	* @param specificationDataCollectionID the specification data collection ID of this vr condition
	*/
	@Override
	public void setSpecificationDataCollectionID(
		java.lang.String specificationDataCollectionID) {
		_vrCondition.setSpecificationDataCollectionID(specificationDataCollectionID);
	}

	/**
	* Sets the specification display name of this vr condition.
	*
	* @param specificationDisplayName the specification display name of this vr condition
	*/
	@Override
	public void setSpecificationDisplayName(
		java.lang.String specificationDisplayName) {
		_vrCondition.setSpecificationDisplayName(specificationDisplayName);
	}

	/**
	* Sets the specification group of this vr condition.
	*
	* @param specificationGroup the specification group of this vr condition
	*/
	@Override
	public void setSpecificationGroup(java.lang.String specificationGroup) {
		_vrCondition.setSpecificationGroup(specificationGroup);
	}

	/**
	* Sets the specification standard of this vr condition.
	*
	* @param specificationStandard the specification standard of this vr condition
	*/
	@Override
	public void setSpecificationStandard(java.lang.String specificationStandard) {
		_vrCondition.setSpecificationStandard(specificationStandard);
	}

	/**
	* Sets the sync date of this vr condition.
	*
	* @param syncDate the sync date of this vr condition
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrCondition.setSyncDate(syncDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRConditionWrapper)) {
			return false;
		}

		VRConditionWrapper vrConditionWrapper = (VRConditionWrapper)obj;

		if (Objects.equals(_vrCondition, vrConditionWrapper._vrCondition)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCondition getWrappedModel() {
		return _vrCondition;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrCondition.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrCondition.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrCondition.resetOriginalValues();
	}

	private final VRCondition _vrCondition;
}