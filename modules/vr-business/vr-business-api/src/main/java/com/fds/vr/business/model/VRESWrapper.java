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
 * This class is a wrapper for {@link VRES}.
 * </p>
 *
 * @author LamTV
 * @see VRES
 * @generated
 */
@ProviderType
public class VRESWrapper implements VRES, ModelWrapper<VRES> {
	public VRESWrapper(VRES vres) {
		_vres = vres;
	}

	@Override
	public Class<?> getModelClass() {
		return VRES.class;
	}

	@Override
	public String getModelClassName() {
		return VRES.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("type", getType());
		attributes.put("data", getData());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String data = (String)attributes.get("data");

		if (data != null) {
			setData(data);
		}
	}

	@Override
	public VRES toEscapedModel() {
		return new VRESWrapper(_vres.toEscapedModel());
	}

	@Override
	public VRES toUnescapedModel() {
		return new VRESWrapper(_vres.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vres.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vres.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vres.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vres.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRES> toCacheModel() {
		return _vres.toCacheModel();
	}

	@Override
	public int compareTo(VRES vres) {
		return _vres.compareTo(vres);
	}

	@Override
	public int hashCode() {
		return _vres.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vres.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRESWrapper((VRES)_vres.clone());
	}

	/**
	* Returns the data of this vres.
	*
	* @return the data of this vres
	*/
	@Override
	public java.lang.String getData() {
		return _vres.getData();
	}

	/**
	* Returns the type of this vres.
	*
	* @return the type of this vres
	*/
	@Override
	public java.lang.String getType() {
		return _vres.getType();
	}

	/**
	* Returns the user name of this vres.
	*
	* @return the user name of this vres
	*/
	@Override
	public java.lang.String getUserName() {
		return _vres.getUserName();
	}

	/**
	* Returns the user uuid of this vres.
	*
	* @return the user uuid of this vres
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vres.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vres.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vres.toXmlString();
	}

	/**
	* Returns the create date of this vres.
	*
	* @return the create date of this vres
	*/
	@Override
	public Date getCreateDate() {
		return _vres.getCreateDate();
	}

	/**
	* Returns the modified date of this vres.
	*
	* @return the modified date of this vres
	*/
	@Override
	public Date getModifiedDate() {
		return _vres.getModifiedDate();
	}

	/**
	* Returns the company ID of this vres.
	*
	* @return the company ID of this vres
	*/
	@Override
	public long getCompanyId() {
		return _vres.getCompanyId();
	}

	/**
	* Returns the group ID of this vres.
	*
	* @return the group ID of this vres
	*/
	@Override
	public long getGroupId() {
		return _vres.getGroupId();
	}

	/**
	* Returns the ID of this vres.
	*
	* @return the ID of this vres
	*/
	@Override
	public long getId() {
		return _vres.getId();
	}

	/**
	* Returns the primary key of this vres.
	*
	* @return the primary key of this vres
	*/
	@Override
	public long getPrimaryKey() {
		return _vres.getPrimaryKey();
	}

	/**
	* Returns the user ID of this vres.
	*
	* @return the user ID of this vres
	*/
	@Override
	public long getUserId() {
		return _vres.getUserId();
	}

	@Override
	public void persist() {
		_vres.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vres.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this vres.
	*
	* @param companyId the company ID of this vres
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vres.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this vres.
	*
	* @param createDate the create date of this vres
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_vres.setCreateDate(createDate);
	}

	/**
	* Sets the data of this vres.
	*
	* @param data the data of this vres
	*/
	@Override
	public void setData(java.lang.String data) {
		_vres.setData(data);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vres.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vres.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vres.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this vres.
	*
	* @param groupId the group ID of this vres
	*/
	@Override
	public void setGroupId(long groupId) {
		_vres.setGroupId(groupId);
	}

	/**
	* Sets the ID of this vres.
	*
	* @param id the ID of this vres
	*/
	@Override
	public void setId(long id) {
		_vres.setId(id);
	}

	/**
	* Sets the modified date of this vres.
	*
	* @param modifiedDate the modified date of this vres
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vres.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vres.setNew(n);
	}

	/**
	* Sets the primary key of this vres.
	*
	* @param primaryKey the primary key of this vres
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vres.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vres.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the type of this vres.
	*
	* @param type the type of this vres
	*/
	@Override
	public void setType(java.lang.String type) {
		_vres.setType(type);
	}

	/**
	* Sets the user ID of this vres.
	*
	* @param userId the user ID of this vres
	*/
	@Override
	public void setUserId(long userId) {
		_vres.setUserId(userId);
	}

	/**
	* Sets the user name of this vres.
	*
	* @param userName the user name of this vres
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_vres.setUserName(userName);
	}

	/**
	* Sets the user uuid of this vres.
	*
	* @param userUuid the user uuid of this vres
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vres.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRESWrapper)) {
			return false;
		}

		VRESWrapper vresWrapper = (VRESWrapper)obj;

		if (Objects.equals(_vres, vresWrapper._vres)) {
			return true;
		}

		return false;
	}

	@Override
	public VRES getWrappedModel() {
		return _vres;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vres.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vres.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vres.resetOriginalValues();
	}

	private final VRES _vres;
}