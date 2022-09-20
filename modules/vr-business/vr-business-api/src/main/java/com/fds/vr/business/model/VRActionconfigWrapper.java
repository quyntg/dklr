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
 * This class is a wrapper for {@link VRActionconfig}.
 * </p>
 *
 * @author LamTV
 * @see VRActionconfig
 * @generated
 */
@ProviderType
public class VRActionconfigWrapper implements VRActionconfig,
	ModelWrapper<VRActionconfig> {
	public VRActionconfigWrapper(VRActionconfig vrActionconfig) {
		_vrActionconfig = vrActionconfig;
	}

	@Override
	public Class<?> getModelClass() {
		return VRActionconfig.class;
	}

	@Override
	public String getModelClassName() {
		return VRActionconfig.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("actionCode", getActionCode());
		attributes.put("processNo", getProcessNo());
		attributes.put("status", getStatus());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("fileTemplateNoBB", getFileTemplateNoBB());
		attributes.put("fileTemplateNoCC", getFileTemplateNoCC());
		attributes.put("deliverableCode", getDeliverableCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String actionCode = (String)attributes.get("actionCode");

		if (actionCode != null) {
			setActionCode(actionCode);
		}

		String processNo = (String)attributes.get("processNo");

		if (processNo != null) {
			setProcessNo(processNo);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		String fileTemplateNoBB = (String)attributes.get("fileTemplateNoBB");

		if (fileTemplateNoBB != null) {
			setFileTemplateNoBB(fileTemplateNoBB);
		}

		String fileTemplateNoCC = (String)attributes.get("fileTemplateNoCC");

		if (fileTemplateNoCC != null) {
			setFileTemplateNoCC(fileTemplateNoCC);
		}

		String deliverableCode = (String)attributes.get("deliverableCode");

		if (deliverableCode != null) {
			setDeliverableCode(deliverableCode);
		}
	}

	@Override
	public VRActionconfig toEscapedModel() {
		return new VRActionconfigWrapper(_vrActionconfig.toEscapedModel());
	}

	@Override
	public VRActionconfig toUnescapedModel() {
		return new VRActionconfigWrapper(_vrActionconfig.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrActionconfig.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrActionconfig.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrActionconfig.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrActionconfig.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRActionconfig> toCacheModel() {
		return _vrActionconfig.toCacheModel();
	}

	@Override
	public int compareTo(VRActionconfig vrActionconfig) {
		return _vrActionconfig.compareTo(vrActionconfig);
	}

	/**
	* Returns the status of this vr actionconfig.
	*
	* @return the status of this vr actionconfig
	*/
	@Override
	public int getStatus() {
		return _vrActionconfig.getStatus();
	}

	@Override
	public int hashCode() {
		return _vrActionconfig.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrActionconfig.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRActionconfigWrapper((VRActionconfig)_vrActionconfig.clone());
	}

	/**
	* Returns the action code of this vr actionconfig.
	*
	* @return the action code of this vr actionconfig
	*/
	@Override
	public java.lang.String getActionCode() {
		return _vrActionconfig.getActionCode();
	}

	/**
	* Returns the deliverable code of this vr actionconfig.
	*
	* @return the deliverable code of this vr actionconfig
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrActionconfig.getDeliverableCode();
	}

	/**
	* Returns the file template no bb of this vr actionconfig.
	*
	* @return the file template no bb of this vr actionconfig
	*/
	@Override
	public java.lang.String getFileTemplateNoBB() {
		return _vrActionconfig.getFileTemplateNoBB();
	}

	/**
	* Returns the file template no cc of this vr actionconfig.
	*
	* @return the file template no cc of this vr actionconfig
	*/
	@Override
	public java.lang.String getFileTemplateNoCC() {
		return _vrActionconfig.getFileTemplateNoCC();
	}

	/**
	* Returns the process no of this vr actionconfig.
	*
	* @return the process no of this vr actionconfig
	*/
	@Override
	public java.lang.String getProcessNo() {
		return _vrActionconfig.getProcessNo();
	}

	/**
	* Returns the vehicle class of this vr actionconfig.
	*
	* @return the vehicle class of this vr actionconfig
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrActionconfig.getVehicleClass();
	}

	@Override
	public java.lang.String toString() {
		return _vrActionconfig.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrActionconfig.toXmlString();
	}

	/**
	* Returns the ID of this vr actionconfig.
	*
	* @return the ID of this vr actionconfig
	*/
	@Override
	public long getId() {
		return _vrActionconfig.getId();
	}

	/**
	* Returns the primary key of this vr actionconfig.
	*
	* @return the primary key of this vr actionconfig
	*/
	@Override
	public long getPrimaryKey() {
		return _vrActionconfig.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrActionconfig.persist();
	}

	/**
	* Sets the action code of this vr actionconfig.
	*
	* @param actionCode the action code of this vr actionconfig
	*/
	@Override
	public void setActionCode(java.lang.String actionCode) {
		_vrActionconfig.setActionCode(actionCode);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrActionconfig.setCachedModel(cachedModel);
	}

	/**
	* Sets the deliverable code of this vr actionconfig.
	*
	* @param deliverableCode the deliverable code of this vr actionconfig
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrActionconfig.setDeliverableCode(deliverableCode);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrActionconfig.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrActionconfig.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrActionconfig.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the file template no bb of this vr actionconfig.
	*
	* @param fileTemplateNoBB the file template no bb of this vr actionconfig
	*/
	@Override
	public void setFileTemplateNoBB(java.lang.String fileTemplateNoBB) {
		_vrActionconfig.setFileTemplateNoBB(fileTemplateNoBB);
	}

	/**
	* Sets the file template no cc of this vr actionconfig.
	*
	* @param fileTemplateNoCC the file template no cc of this vr actionconfig
	*/
	@Override
	public void setFileTemplateNoCC(java.lang.String fileTemplateNoCC) {
		_vrActionconfig.setFileTemplateNoCC(fileTemplateNoCC);
	}

	/**
	* Sets the ID of this vr actionconfig.
	*
	* @param id the ID of this vr actionconfig
	*/
	@Override
	public void setId(long id) {
		_vrActionconfig.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_vrActionconfig.setNew(n);
	}

	/**
	* Sets the primary key of this vr actionconfig.
	*
	* @param primaryKey the primary key of this vr actionconfig
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrActionconfig.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrActionconfig.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the process no of this vr actionconfig.
	*
	* @param processNo the process no of this vr actionconfig
	*/
	@Override
	public void setProcessNo(java.lang.String processNo) {
		_vrActionconfig.setProcessNo(processNo);
	}

	/**
	* Sets the status of this vr actionconfig.
	*
	* @param status the status of this vr actionconfig
	*/
	@Override
	public void setStatus(int status) {
		_vrActionconfig.setStatus(status);
	}

	/**
	* Sets the vehicle class of this vr actionconfig.
	*
	* @param vehicleClass the vehicle class of this vr actionconfig
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrActionconfig.setVehicleClass(vehicleClass);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRActionconfigWrapper)) {
			return false;
		}

		VRActionconfigWrapper vrActionconfigWrapper = (VRActionconfigWrapper)obj;

		if (Objects.equals(_vrActionconfig,
					vrActionconfigWrapper._vrActionconfig)) {
			return true;
		}

		return false;
	}

	@Override
	public VRActionconfig getWrappedModel() {
		return _vrActionconfig;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrActionconfig.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrActionconfig.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrActionconfig.resetOriginalValues();
	}

	private final VRActionconfig _vrActionconfig;
}