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
 * This class is a wrapper for {@link VRProductionPlantEquipmentMarkup}.
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantEquipmentMarkup
 * @generated
 */
@ProviderType
public class VRProductionPlantEquipmentMarkupWrapper
	implements VRProductionPlantEquipmentMarkup,
		ModelWrapper<VRProductionPlantEquipmentMarkup> {
	public VRProductionPlantEquipmentMarkupWrapper(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		_vrProductionPlantEquipmentMarkup = vrProductionPlantEquipmentMarkup;
	}

	@Override
	public Class<?> getModelClass() {
		return VRProductionPlantEquipmentMarkup.class;
	}

	@Override
	public String getModelClassName() {
		return VRProductionPlantEquipmentMarkup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("productClassificationCode",
			getProductClassificationCode());
		attributes.put("productionPlantEquipmentId",
			getProductionPlantEquipmentId());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String productClassificationCode = (String)attributes.get(
				"productClassificationCode");

		if (productClassificationCode != null) {
			setProductClassificationCode(productClassificationCode);
		}

		Long productionPlantEquipmentId = (Long)attributes.get(
				"productionPlantEquipmentId");

		if (productionPlantEquipmentId != null) {
			setProductionPlantEquipmentId(productionPlantEquipmentId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public VRProductionPlantEquipmentMarkup toEscapedModel() {
		return new VRProductionPlantEquipmentMarkupWrapper(_vrProductionPlantEquipmentMarkup.toEscapedModel());
	}

	@Override
	public VRProductionPlantEquipmentMarkup toUnescapedModel() {
		return new VRProductionPlantEquipmentMarkupWrapper(_vrProductionPlantEquipmentMarkup.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrProductionPlantEquipmentMarkup.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrProductionPlantEquipmentMarkup.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrProductionPlantEquipmentMarkup.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrProductionPlantEquipmentMarkup.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRProductionPlantEquipmentMarkup> toCacheModel() {
		return _vrProductionPlantEquipmentMarkup.toCacheModel();
	}

	@Override
	public int compareTo(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		return _vrProductionPlantEquipmentMarkup.compareTo(vrProductionPlantEquipmentMarkup);
	}

	/**
	* Returns the status of this vr production plant equipment markup.
	*
	* @return the status of this vr production plant equipment markup
	*/
	@Override
	public int getStatus() {
		return _vrProductionPlantEquipmentMarkup.getStatus();
	}

	@Override
	public int hashCode() {
		return _vrProductionPlantEquipmentMarkup.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrProductionPlantEquipmentMarkup.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRProductionPlantEquipmentMarkupWrapper((VRProductionPlantEquipmentMarkup)_vrProductionPlantEquipmentMarkup.clone());
	}

	/**
	* Returns the product classification code of this vr production plant equipment markup.
	*
	* @return the product classification code of this vr production plant equipment markup
	*/
	@Override
	public java.lang.String getProductClassificationCode() {
		return _vrProductionPlantEquipmentMarkup.getProductClassificationCode();
	}

	@Override
	public java.lang.String toString() {
		return _vrProductionPlantEquipmentMarkup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrProductionPlantEquipmentMarkup.toXmlString();
	}

	/**
	* Returns the ID of this vr production plant equipment markup.
	*
	* @return the ID of this vr production plant equipment markup
	*/
	@Override
	public long getId() {
		return _vrProductionPlantEquipmentMarkup.getId();
	}

	/**
	* Returns the primary key of this vr production plant equipment markup.
	*
	* @return the primary key of this vr production plant equipment markup
	*/
	@Override
	public long getPrimaryKey() {
		return _vrProductionPlantEquipmentMarkup.getPrimaryKey();
	}

	/**
	* Returns the production plant equipment ID of this vr production plant equipment markup.
	*
	* @return the production plant equipment ID of this vr production plant equipment markup
	*/
	@Override
	public long getProductionPlantEquipmentId() {
		return _vrProductionPlantEquipmentMarkup.getProductionPlantEquipmentId();
	}

	@Override
	public void persist() {
		_vrProductionPlantEquipmentMarkup.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrProductionPlantEquipmentMarkup.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrProductionPlantEquipmentMarkup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrProductionPlantEquipmentMarkup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrProductionPlantEquipmentMarkup.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr production plant equipment markup.
	*
	* @param id the ID of this vr production plant equipment markup
	*/
	@Override
	public void setId(long id) {
		_vrProductionPlantEquipmentMarkup.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_vrProductionPlantEquipmentMarkup.setNew(n);
	}

	/**
	* Sets the primary key of this vr production plant equipment markup.
	*
	* @param primaryKey the primary key of this vr production plant equipment markup
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrProductionPlantEquipmentMarkup.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrProductionPlantEquipmentMarkup.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product classification code of this vr production plant equipment markup.
	*
	* @param productClassificationCode the product classification code of this vr production plant equipment markup
	*/
	@Override
	public void setProductClassificationCode(
		java.lang.String productClassificationCode) {
		_vrProductionPlantEquipmentMarkup.setProductClassificationCode(productClassificationCode);
	}

	/**
	* Sets the production plant equipment ID of this vr production plant equipment markup.
	*
	* @param productionPlantEquipmentId the production plant equipment ID of this vr production plant equipment markup
	*/
	@Override
	public void setProductionPlantEquipmentId(long productionPlantEquipmentId) {
		_vrProductionPlantEquipmentMarkup.setProductionPlantEquipmentId(productionPlantEquipmentId);
	}

	/**
	* Sets the status of this vr production plant equipment markup.
	*
	* @param status the status of this vr production plant equipment markup
	*/
	@Override
	public void setStatus(int status) {
		_vrProductionPlantEquipmentMarkup.setStatus(status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductionPlantEquipmentMarkupWrapper)) {
			return false;
		}

		VRProductionPlantEquipmentMarkupWrapper vrProductionPlantEquipmentMarkupWrapper =
			(VRProductionPlantEquipmentMarkupWrapper)obj;

		if (Objects.equals(_vrProductionPlantEquipmentMarkup,
					vrProductionPlantEquipmentMarkupWrapper._vrProductionPlantEquipmentMarkup)) {
			return true;
		}

		return false;
	}

	@Override
	public VRProductionPlantEquipmentMarkup getWrappedModel() {
		return _vrProductionPlantEquipmentMarkup;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrProductionPlantEquipmentMarkup.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrProductionPlantEquipmentMarkup.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrProductionPlantEquipmentMarkup.resetOriginalValues();
	}

	private final VRProductionPlantEquipmentMarkup _vrProductionPlantEquipmentMarkup;
}