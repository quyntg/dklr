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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRTemplateNo}.
 * </p>
 *
 * @author LamTV
 * @see VRTemplateNo
 * @generated
 */
@ProviderType
public class VRTemplateNoWrapper implements VRTemplateNo,
	ModelWrapper<VRTemplateNo> {
	public VRTemplateNoWrapper(VRTemplateNo vrTemplateNo) {
		_vrTemplateNo = vrTemplateNo;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTemplateNo.class;
	}

	@Override
	public String getModelClassName() {
		return VRTemplateNo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("patternNo", getPatternNo());
		attributes.put("year", getYear());
		attributes.put("initNumber", getInitNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String patternNo = (String)attributes.get("patternNo");

		if (patternNo != null) {
			setPatternNo(patternNo);
		}

		Integer year = (Integer)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		Integer initNumber = (Integer)attributes.get("initNumber");

		if (initNumber != null) {
			setInitNumber(initNumber);
		}
	}

	@Override
	public VRTemplateNo toEscapedModel() {
		return new VRTemplateNoWrapper(_vrTemplateNo.toEscapedModel());
	}

	@Override
	public VRTemplateNo toUnescapedModel() {
		return new VRTemplateNoWrapper(_vrTemplateNo.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTemplateNo.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTemplateNo.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTemplateNo.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTemplateNo.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTemplateNo> toCacheModel() {
		return _vrTemplateNo.toCacheModel();
	}

	@Override
	public int compareTo(VRTemplateNo vrTemplateNo) {
		return _vrTemplateNo.compareTo(vrTemplateNo);
	}

	/**
	* Returns the init number of this vr template no.
	*
	* @return the init number of this vr template no
	*/
	@Override
	public int getInitNumber() {
		return _vrTemplateNo.getInitNumber();
	}

	/**
	* Returns the year of this vr template no.
	*
	* @return the year of this vr template no
	*/
	@Override
	public int getYear() {
		return _vrTemplateNo.getYear();
	}

	@Override
	public int hashCode() {
		return _vrTemplateNo.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTemplateNo.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTemplateNoWrapper((VRTemplateNo)_vrTemplateNo.clone());
	}

	/**
	* Returns the pattern no of this vr template no.
	*
	* @return the pattern no of this vr template no
	*/
	@Override
	public java.lang.String getPatternNo() {
		return _vrTemplateNo.getPatternNo();
	}

	@Override
	public java.lang.String toString() {
		return _vrTemplateNo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTemplateNo.toXmlString();
	}

	/**
	* Returns the ID of this vr template no.
	*
	* @return the ID of this vr template no
	*/
	@Override
	public long getId() {
		return _vrTemplateNo.getId();
	}

	/**
	* Returns the primary key of this vr template no.
	*
	* @return the primary key of this vr template no
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTemplateNo.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrTemplateNo.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTemplateNo.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTemplateNo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTemplateNo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTemplateNo.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr template no.
	*
	* @param id the ID of this vr template no
	*/
	@Override
	public void setId(long id) {
		_vrTemplateNo.setId(id);
	}

	/**
	* Sets the init number of this vr template no.
	*
	* @param initNumber the init number of this vr template no
	*/
	@Override
	public void setInitNumber(int initNumber) {
		_vrTemplateNo.setInitNumber(initNumber);
	}

	@Override
	public void setNew(boolean n) {
		_vrTemplateNo.setNew(n);
	}

	/**
	* Sets the pattern no of this vr template no.
	*
	* @param patternNo the pattern no of this vr template no
	*/
	@Override
	public void setPatternNo(java.lang.String patternNo) {
		_vrTemplateNo.setPatternNo(patternNo);
	}

	/**
	* Sets the primary key of this vr template no.
	*
	* @param primaryKey the primary key of this vr template no
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTemplateNo.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTemplateNo.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the year of this vr template no.
	*
	* @param year the year of this vr template no
	*/
	@Override
	public void setYear(int year) {
		_vrTemplateNo.setYear(year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTemplateNoWrapper)) {
			return false;
		}

		VRTemplateNoWrapper vrTemplateNoWrapper = (VRTemplateNoWrapper)obj;

		if (Objects.equals(_vrTemplateNo, vrTemplateNoWrapper._vrTemplateNo)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTemplateNo getWrappedModel() {
		return _vrTemplateNo;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTemplateNo.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTemplateNo.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTemplateNo.resetOriginalValues();
	}

	private final VRTemplateNo _vrTemplateNo;
}