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
 * This class is a wrapper for {@link VRSyncDate}.
 * </p>
 *
 * @author LamTV
 * @see VRSyncDate
 * @generated
 */
@ProviderType
public class VRSyncDateWrapper implements VRSyncDate, ModelWrapper<VRSyncDate> {
	public VRSyncDateWrapper(VRSyncDate vrSyncDate) {
		_vrSyncDate = vrSyncDate;
	}

	@Override
	public Class<?> getModelClass() {
		return VRSyncDate.class;
	}

	@Override
	public String getModelClassName() {
		return VRSyncDate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("tableName", getTableName());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String tableName = (String)attributes.get("tableName");

		if (tableName != null) {
			setTableName(tableName);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public VRSyncDate toEscapedModel() {
		return new VRSyncDateWrapper(_vrSyncDate.toEscapedModel());
	}

	@Override
	public VRSyncDate toUnescapedModel() {
		return new VRSyncDateWrapper(_vrSyncDate.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrSyncDate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrSyncDate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrSyncDate.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrSyncDate.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRSyncDate> toCacheModel() {
		return _vrSyncDate.toCacheModel();
	}

	@Override
	public int compareTo(VRSyncDate vrSyncDate) {
		return _vrSyncDate.compareTo(vrSyncDate);
	}

	@Override
	public int hashCode() {
		return _vrSyncDate.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrSyncDate.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRSyncDateWrapper((VRSyncDate)_vrSyncDate.clone());
	}

	/**
	* Returns the table name of this vr sync date.
	*
	* @return the table name of this vr sync date
	*/
	@Override
	public java.lang.String getTableName() {
		return _vrSyncDate.getTableName();
	}

	@Override
	public java.lang.String toString() {
		return _vrSyncDate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrSyncDate.toXmlString();
	}

	/**
	* Returns the sync date of this vr sync date.
	*
	* @return the sync date of this vr sync date
	*/
	@Override
	public Date getSyncDate() {
		return _vrSyncDate.getSyncDate();
	}

	/**
	* Returns the ID of this vr sync date.
	*
	* @return the ID of this vr sync date
	*/
	@Override
	public long getId() {
		return _vrSyncDate.getId();
	}

	/**
	* Returns the primary key of this vr sync date.
	*
	* @return the primary key of this vr sync date
	*/
	@Override
	public long getPrimaryKey() {
		return _vrSyncDate.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrSyncDate.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrSyncDate.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrSyncDate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrSyncDate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrSyncDate.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr sync date.
	*
	* @param id the ID of this vr sync date
	*/
	@Override
	public void setId(long id) {
		_vrSyncDate.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_vrSyncDate.setNew(n);
	}

	/**
	* Sets the primary key of this vr sync date.
	*
	* @param primaryKey the primary key of this vr sync date
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrSyncDate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrSyncDate.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sync date of this vr sync date.
	*
	* @param syncDate the sync date of this vr sync date
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrSyncDate.setSyncDate(syncDate);
	}

	/**
	* Sets the table name of this vr sync date.
	*
	* @param tableName the table name of this vr sync date
	*/
	@Override
	public void setTableName(java.lang.String tableName) {
		_vrSyncDate.setTableName(tableName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRSyncDateWrapper)) {
			return false;
		}

		VRSyncDateWrapper vrSyncDateWrapper = (VRSyncDateWrapper)obj;

		if (Objects.equals(_vrSyncDate, vrSyncDateWrapper._vrSyncDate)) {
			return true;
		}

		return false;
	}

	@Override
	public VRSyncDate getWrappedModel() {
		return _vrSyncDate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrSyncDate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrSyncDate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrSyncDate.resetOriginalValues();
	}

	private final VRSyncDate _vrSyncDate;
}