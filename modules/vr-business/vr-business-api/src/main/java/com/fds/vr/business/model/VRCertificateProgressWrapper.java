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
 * This class is a wrapper for {@link VRCertificateProgress}.
 * </p>
 *
 * @author LamTV
 * @see VRCertificateProgress
 * @generated
 */
@ProviderType
public class VRCertificateProgressWrapper implements VRCertificateProgress,
	ModelWrapper<VRCertificateProgress> {
	public VRCertificateProgressWrapper(
		VRCertificateProgress vrCertificateProgress) {
		_vrCertificateProgress = vrCertificateProgress;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCertificateProgress.class;
	}

	@Override
	public String getModelClassName() {
		return VRCertificateProgress.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleCertificateId", getVehicleCertificateId());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("actionCode", getActionCode());
		attributes.put("progressTime", getProgressTime());
		attributes.put("remarks", getRemarks());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long vehicleCertificateId = (Long)attributes.get("vehicleCertificateId");

		if (vehicleCertificateId != null) {
			setVehicleCertificateId(vehicleCertificateId);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		String actionCode = (String)attributes.get("actionCode");

		if (actionCode != null) {
			setActionCode(actionCode);
		}

		Date progressTime = (Date)attributes.get("progressTime");

		if (progressTime != null) {
			setProgressTime(progressTime);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}
	}

	@Override
	public VRCertificateProgress toEscapedModel() {
		return new VRCertificateProgressWrapper(_vrCertificateProgress.toEscapedModel());
	}

	@Override
	public VRCertificateProgress toUnescapedModel() {
		return new VRCertificateProgressWrapper(_vrCertificateProgress.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrCertificateProgress.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrCertificateProgress.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrCertificateProgress.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrCertificateProgress.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCertificateProgress> toCacheModel() {
		return _vrCertificateProgress.toCacheModel();
	}

	@Override
	public int compareTo(VRCertificateProgress vrCertificateProgress) {
		return _vrCertificateProgress.compareTo(vrCertificateProgress);
	}

	@Override
	public int hashCode() {
		return _vrCertificateProgress.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrCertificateProgress.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCertificateProgressWrapper((VRCertificateProgress)_vrCertificateProgress.clone());
	}

	/**
	* Returns the action code of this vr certificate progress.
	*
	* @return the action code of this vr certificate progress
	*/
	@Override
	public java.lang.String getActionCode() {
		return _vrCertificateProgress.getActionCode();
	}

	/**
	* Returns the corporation ID of this vr certificate progress.
	*
	* @return the corporation ID of this vr certificate progress
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _vrCertificateProgress.getCorporationId();
	}

	/**
	* Returns the remarks of this vr certificate progress.
	*
	* @return the remarks of this vr certificate progress
	*/
	@Override
	public java.lang.String getRemarks() {
		return _vrCertificateProgress.getRemarks();
	}

	@Override
	public java.lang.String toString() {
		return _vrCertificateProgress.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrCertificateProgress.toXmlString();
	}

	/**
	* Returns the progress time of this vr certificate progress.
	*
	* @return the progress time of this vr certificate progress
	*/
	@Override
	public Date getProgressTime() {
		return _vrCertificateProgress.getProgressTime();
	}

	/**
	* Returns the ID of this vr certificate progress.
	*
	* @return the ID of this vr certificate progress
	*/
	@Override
	public long getId() {
		return _vrCertificateProgress.getId();
	}

	/**
	* Returns the inspector ID of this vr certificate progress.
	*
	* @return the inspector ID of this vr certificate progress
	*/
	@Override
	public long getInspectorId() {
		return _vrCertificateProgress.getInspectorId();
	}

	/**
	* Returns the primary key of this vr certificate progress.
	*
	* @return the primary key of this vr certificate progress
	*/
	@Override
	public long getPrimaryKey() {
		return _vrCertificateProgress.getPrimaryKey();
	}

	/**
	* Returns the vehicle certificate ID of this vr certificate progress.
	*
	* @return the vehicle certificate ID of this vr certificate progress
	*/
	@Override
	public long getVehicleCertificateId() {
		return _vrCertificateProgress.getVehicleCertificateId();
	}

	@Override
	public void persist() {
		_vrCertificateProgress.persist();
	}

	/**
	* Sets the action code of this vr certificate progress.
	*
	* @param actionCode the action code of this vr certificate progress
	*/
	@Override
	public void setActionCode(java.lang.String actionCode) {
		_vrCertificateProgress.setActionCode(actionCode);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrCertificateProgress.setCachedModel(cachedModel);
	}

	/**
	* Sets the corporation ID of this vr certificate progress.
	*
	* @param corporationId the corporation ID of this vr certificate progress
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_vrCertificateProgress.setCorporationId(corporationId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrCertificateProgress.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrCertificateProgress.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrCertificateProgress.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr certificate progress.
	*
	* @param id the ID of this vr certificate progress
	*/
	@Override
	public void setId(long id) {
		_vrCertificateProgress.setId(id);
	}

	/**
	* Sets the inspector ID of this vr certificate progress.
	*
	* @param inspectorId the inspector ID of this vr certificate progress
	*/
	@Override
	public void setInspectorId(long inspectorId) {
		_vrCertificateProgress.setInspectorId(inspectorId);
	}

	@Override
	public void setNew(boolean n) {
		_vrCertificateProgress.setNew(n);
	}

	/**
	* Sets the primary key of this vr certificate progress.
	*
	* @param primaryKey the primary key of this vr certificate progress
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrCertificateProgress.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrCertificateProgress.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the progress time of this vr certificate progress.
	*
	* @param progressTime the progress time of this vr certificate progress
	*/
	@Override
	public void setProgressTime(Date progressTime) {
		_vrCertificateProgress.setProgressTime(progressTime);
	}

	/**
	* Sets the remarks of this vr certificate progress.
	*
	* @param remarks the remarks of this vr certificate progress
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_vrCertificateProgress.setRemarks(remarks);
	}

	/**
	* Sets the vehicle certificate ID of this vr certificate progress.
	*
	* @param vehicleCertificateId the vehicle certificate ID of this vr certificate progress
	*/
	@Override
	public void setVehicleCertificateId(long vehicleCertificateId) {
		_vrCertificateProgress.setVehicleCertificateId(vehicleCertificateId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCertificateProgressWrapper)) {
			return false;
		}

		VRCertificateProgressWrapper vrCertificateProgressWrapper = (VRCertificateProgressWrapper)obj;

		if (Objects.equals(_vrCertificateProgress,
					vrCertificateProgressWrapper._vrCertificateProgress)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCertificateProgress getWrappedModel() {
		return _vrCertificateProgress;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrCertificateProgress.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrCertificateProgress.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrCertificateProgress.resetOriginalValues();
	}

	private final VRCertificateProgress _vrCertificateProgress;
}