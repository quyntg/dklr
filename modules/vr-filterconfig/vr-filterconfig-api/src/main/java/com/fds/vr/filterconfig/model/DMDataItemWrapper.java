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
 * This class is a wrapper for {@link DMDataItem}.
 * </p>
 *
 * @author NhanHoang
 * @see DMDataItem
 * @generated
 */
@ProviderType
public class DMDataItemWrapper implements DMDataItem, ModelWrapper<DMDataItem> {
	public DMDataItemWrapper(DMDataItem dmDataItem) {
		_dmDataItem = dmDataItem;
	}

	@Override
	public Class<?> getModelClass() {
		return DMDataItem.class;
	}

	@Override
	public String getModelClassName() {
		return DMDataItem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dataGroupId", getDataGroupId());
		attributes.put("code_0", getCode_0());
		attributes.put("code_1", getCode_1());
		attributes.put("code_2", getCode_2());
		attributes.put("code_3", getCode_3());
		attributes.put("level", getLevel());
		attributes.put("name", getName());
		attributes.put("altername", getAltername());
		attributes.put("description", getDescription());
		attributes.put("validatedFrom", getValidatedFrom());
		attributes.put("validatedTo", getValidatedTo());
		attributes.put("status", getStatus());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dataGroupId = (Long)attributes.get("dataGroupId");

		if (dataGroupId != null) {
			setDataGroupId(dataGroupId);
		}

		String code_0 = (String)attributes.get("code_0");

		if (code_0 != null) {
			setCode_0(code_0);
		}

		String code_1 = (String)attributes.get("code_1");

		if (code_1 != null) {
			setCode_1(code_1);
		}

		String code_2 = (String)attributes.get("code_2");

		if (code_2 != null) {
			setCode_2(code_2);
		}

		String code_3 = (String)attributes.get("code_3");

		if (code_3 != null) {
			setCode_3(code_3);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String altername = (String)attributes.get("altername");

		if (altername != null) {
			setAltername(altername);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date validatedFrom = (Date)attributes.get("validatedFrom");

		if (validatedFrom != null) {
			setValidatedFrom(validatedFrom);
		}

		Date validatedTo = (Date)attributes.get("validatedTo");

		if (validatedTo != null) {
			setValidatedTo(validatedTo);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public DMDataItem toEscapedModel() {
		return new DMDataItemWrapper(_dmDataItem.toEscapedModel());
	}

	@Override
	public DMDataItem toUnescapedModel() {
		return new DMDataItemWrapper(_dmDataItem.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _dmDataItem.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dmDataItem.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dmDataItem.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dmDataItem.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<DMDataItem> toCacheModel() {
		return _dmDataItem.toCacheModel();
	}

	@Override
	public int compareTo(DMDataItem dmDataItem) {
		return _dmDataItem.compareTo(dmDataItem);
	}

	/**
	* Returns the level of this dm data item.
	*
	* @return the level of this dm data item
	*/
	@Override
	public int getLevel() {
		return _dmDataItem.getLevel();
	}

	/**
	* Returns the status of this dm data item.
	*
	* @return the status of this dm data item
	*/
	@Override
	public int getStatus() {
		return _dmDataItem.getStatus();
	}

	@Override
	public int hashCode() {
		return _dmDataItem.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dmDataItem.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DMDataItemWrapper((DMDataItem)_dmDataItem.clone());
	}

	/**
	* Returns the altername of this dm data item.
	*
	* @return the altername of this dm data item
	*/
	@Override
	public java.lang.String getAltername() {
		return _dmDataItem.getAltername();
	}

	/**
	* Returns the code_0 of this dm data item.
	*
	* @return the code_0 of this dm data item
	*/
	@Override
	public java.lang.String getCode_0() {
		return _dmDataItem.getCode_0();
	}

	/**
	* Returns the code_1 of this dm data item.
	*
	* @return the code_1 of this dm data item
	*/
	@Override
	public java.lang.String getCode_1() {
		return _dmDataItem.getCode_1();
	}

	/**
	* Returns the code_2 of this dm data item.
	*
	* @return the code_2 of this dm data item
	*/
	@Override
	public java.lang.String getCode_2() {
		return _dmDataItem.getCode_2();
	}

	/**
	* Returns the code_3 of this dm data item.
	*
	* @return the code_3 of this dm data item
	*/
	@Override
	public java.lang.String getCode_3() {
		return _dmDataItem.getCode_3();
	}

	/**
	* Returns the description of this dm data item.
	*
	* @return the description of this dm data item
	*/
	@Override
	public java.lang.String getDescription() {
		return _dmDataItem.getDescription();
	}

	/**
	* Returns the name of this dm data item.
	*
	* @return the name of this dm data item
	*/
	@Override
	public java.lang.String getName() {
		return _dmDataItem.getName();
	}

	@Override
	public java.lang.String toString() {
		return _dmDataItem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmDataItem.toXmlString();
	}

	/**
	* Returns the sync date of this dm data item.
	*
	* @return the sync date of this dm data item
	*/
	@Override
	public Date getSyncDate() {
		return _dmDataItem.getSyncDate();
	}

	/**
	* Returns the validated from of this dm data item.
	*
	* @return the validated from of this dm data item
	*/
	@Override
	public Date getValidatedFrom() {
		return _dmDataItem.getValidatedFrom();
	}

	/**
	* Returns the validated to of this dm data item.
	*
	* @return the validated to of this dm data item
	*/
	@Override
	public Date getValidatedTo() {
		return _dmDataItem.getValidatedTo();
	}

	/**
	* Returns the data group ID of this dm data item.
	*
	* @return the data group ID of this dm data item
	*/
	@Override
	public long getDataGroupId() {
		return _dmDataItem.getDataGroupId();
	}

	/**
	* Returns the ID of this dm data item.
	*
	* @return the ID of this dm data item
	*/
	@Override
	public long getId() {
		return _dmDataItem.getId();
	}

	/**
	* Returns the primary key of this dm data item.
	*
	* @return the primary key of this dm data item
	*/
	@Override
	public long getPrimaryKey() {
		return _dmDataItem.getPrimaryKey();
	}

	@Override
	public void persist() {
		_dmDataItem.persist();
	}

	/**
	* Sets the altername of this dm data item.
	*
	* @param altername the altername of this dm data item
	*/
	@Override
	public void setAltername(java.lang.String altername) {
		_dmDataItem.setAltername(altername);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmDataItem.setCachedModel(cachedModel);
	}

	/**
	* Sets the code_0 of this dm data item.
	*
	* @param code_0 the code_0 of this dm data item
	*/
	@Override
	public void setCode_0(java.lang.String code_0) {
		_dmDataItem.setCode_0(code_0);
	}

	/**
	* Sets the code_1 of this dm data item.
	*
	* @param code_1 the code_1 of this dm data item
	*/
	@Override
	public void setCode_1(java.lang.String code_1) {
		_dmDataItem.setCode_1(code_1);
	}

	/**
	* Sets the code_2 of this dm data item.
	*
	* @param code_2 the code_2 of this dm data item
	*/
	@Override
	public void setCode_2(java.lang.String code_2) {
		_dmDataItem.setCode_2(code_2);
	}

	/**
	* Sets the code_3 of this dm data item.
	*
	* @param code_3 the code_3 of this dm data item
	*/
	@Override
	public void setCode_3(java.lang.String code_3) {
		_dmDataItem.setCode_3(code_3);
	}

	/**
	* Sets the data group ID of this dm data item.
	*
	* @param dataGroupId the data group ID of this dm data item
	*/
	@Override
	public void setDataGroupId(long dataGroupId) {
		_dmDataItem.setDataGroupId(dataGroupId);
	}

	/**
	* Sets the description of this dm data item.
	*
	* @param description the description of this dm data item
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_dmDataItem.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dmDataItem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dmDataItem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dmDataItem.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this dm data item.
	*
	* @param id the ID of this dm data item
	*/
	@Override
	public void setId(long id) {
		_dmDataItem.setId(id);
	}

	/**
	* Sets the level of this dm data item.
	*
	* @param level the level of this dm data item
	*/
	@Override
	public void setLevel(int level) {
		_dmDataItem.setLevel(level);
	}

	/**
	* Sets the name of this dm data item.
	*
	* @param name the name of this dm data item
	*/
	@Override
	public void setName(java.lang.String name) {
		_dmDataItem.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_dmDataItem.setNew(n);
	}

	/**
	* Sets the primary key of this dm data item.
	*
	* @param primaryKey the primary key of this dm data item
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmDataItem.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dmDataItem.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this dm data item.
	*
	* @param status the status of this dm data item
	*/
	@Override
	public void setStatus(int status) {
		_dmDataItem.setStatus(status);
	}

	/**
	* Sets the sync date of this dm data item.
	*
	* @param syncDate the sync date of this dm data item
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_dmDataItem.setSyncDate(syncDate);
	}

	/**
	* Sets the validated from of this dm data item.
	*
	* @param validatedFrom the validated from of this dm data item
	*/
	@Override
	public void setValidatedFrom(Date validatedFrom) {
		_dmDataItem.setValidatedFrom(validatedFrom);
	}

	/**
	* Sets the validated to of this dm data item.
	*
	* @param validatedTo the validated to of this dm data item
	*/
	@Override
	public void setValidatedTo(Date validatedTo) {
		_dmDataItem.setValidatedTo(validatedTo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DMDataItemWrapper)) {
			return false;
		}

		DMDataItemWrapper dmDataItemWrapper = (DMDataItemWrapper)obj;

		if (Objects.equals(_dmDataItem, dmDataItemWrapper._dmDataItem)) {
			return true;
		}

		return false;
	}

	@Override
	public DMDataItem getWrappedModel() {
		return _dmDataItem;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dmDataItem.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dmDataItem.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dmDataItem.resetOriginalValues();
	}

	private final DMDataItem _dmDataItem;
}