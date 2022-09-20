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
 * This class is a wrapper for {@link VRCFGStandard}.
 * </p>
 *
 * @author LamTV
 * @see VRCFGStandard
 * @generated
 */
@ProviderType
public class VRCFGStandardWrapper implements VRCFGStandard,
	ModelWrapper<VRCFGStandard> {
	public VRCFGStandardWrapper(VRCFGStandard vrcfgStandard) {
		_vrcfgStandard = vrcfgStandard;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCFGStandard.class;
	}

	@Override
	public String getModelClassName() {
		return VRCFGStandard.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("vehicleType", getVehicleType());
		attributes.put("standardCode", getStandardCode());
		attributes.put("standardName", getStandardName());
		attributes.put("standardDescription", getStandardDescription());
		attributes.put("standardExpiredDate", getStandardExpiredDate());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("standardType", getStandardType());
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

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		String vehicleType = (String)attributes.get("vehicleType");

		if (vehicleType != null) {
			setVehicleType(vehicleType);
		}

		String standardCode = (String)attributes.get("standardCode");

		if (standardCode != null) {
			setStandardCode(standardCode);
		}

		String standardName = (String)attributes.get("standardName");

		if (standardName != null) {
			setStandardName(standardName);
		}

		String standardDescription = (String)attributes.get(
				"standardDescription");

		if (standardDescription != null) {
			setStandardDescription(standardDescription);
		}

		Date standardExpiredDate = (Date)attributes.get("standardExpiredDate");

		if (standardExpiredDate != null) {
			setStandardExpiredDate(standardExpiredDate);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String standardType = (String)attributes.get("standardType");

		if (standardType != null) {
			setStandardType(standardType);
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
	public VRCFGStandard toEscapedModel() {
		return new VRCFGStandardWrapper(_vrcfgStandard.toEscapedModel());
	}

	@Override
	public VRCFGStandard toUnescapedModel() {
		return new VRCFGStandardWrapper(_vrcfgStandard.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrcfgStandard.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrcfgStandard.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrcfgStandard.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrcfgStandard.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCFGStandard> toCacheModel() {
		return _vrcfgStandard.toCacheModel();
	}

	@Override
	public int compareTo(VRCFGStandard vrcfgStandard) {
		return _vrcfgStandard.compareTo(vrcfgStandard);
	}

	@Override
	public int hashCode() {
		return _vrcfgStandard.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrcfgStandard.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCFGStandardWrapper((VRCFGStandard)_vrcfgStandard.clone());
	}

	/**
	* Returns the standard code of this vrcfg standard.
	*
	* @return the standard code of this vrcfg standard
	*/
	@Override
	public java.lang.String getStandardCode() {
		return _vrcfgStandard.getStandardCode();
	}

	/**
	* Returns the standard description of this vrcfg standard.
	*
	* @return the standard description of this vrcfg standard
	*/
	@Override
	public java.lang.String getStandardDescription() {
		return _vrcfgStandard.getStandardDescription();
	}

	/**
	* Returns the standard name of this vrcfg standard.
	*
	* @return the standard name of this vrcfg standard
	*/
	@Override
	public java.lang.String getStandardName() {
		return _vrcfgStandard.getStandardName();
	}

	/**
	* Returns the standard type of this vrcfg standard.
	*
	* @return the standard type of this vrcfg standard
	*/
	@Override
	public java.lang.String getStandardType() {
		return _vrcfgStandard.getStandardType();
	}

	/**
	* Returns the vehicle class of this vrcfg standard.
	*
	* @return the vehicle class of this vrcfg standard
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrcfgStandard.getVehicleClass();
	}

	/**
	* Returns the vehicle type of this vrcfg standard.
	*
	* @return the vehicle type of this vrcfg standard
	*/
	@Override
	public java.lang.String getVehicleType() {
		return _vrcfgStandard.getVehicleType();
	}

	@Override
	public java.lang.String toString() {
		return _vrcfgStandard.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrcfgStandard.toXmlString();
	}

	/**
	* Returns the modify date of this vrcfg standard.
	*
	* @return the modify date of this vrcfg standard
	*/
	@Override
	public Date getModifyDate() {
		return _vrcfgStandard.getModifyDate();
	}

	/**
	* Returns the standard expired date of this vrcfg standard.
	*
	* @return the standard expired date of this vrcfg standard
	*/
	@Override
	public Date getStandardExpiredDate() {
		return _vrcfgStandard.getStandardExpiredDate();
	}

	/**
	* Returns the sync date of this vrcfg standard.
	*
	* @return the sync date of this vrcfg standard
	*/
	@Override
	public Date getSyncDate() {
		return _vrcfgStandard.getSyncDate();
	}

	/**
	* Returns the ID of this vrcfg standard.
	*
	* @return the ID of this vrcfg standard
	*/
	@Override
	public long getId() {
		return _vrcfgStandard.getId();
	}

	/**
	* Returns the primary key of this vrcfg standard.
	*
	* @return the primary key of this vrcfg standard
	*/
	@Override
	public long getPrimaryKey() {
		return _vrcfgStandard.getPrimaryKey();
	}

	/**
	* Returns the sequence no of this vrcfg standard.
	*
	* @return the sequence no of this vrcfg standard
	*/
	@Override
	public long getSequenceNo() {
		return _vrcfgStandard.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrcfgStandard.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrcfgStandard.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrcfgStandard.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrcfgStandard.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrcfgStandard.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vrcfg standard.
	*
	* @param id the ID of this vrcfg standard
	*/
	@Override
	public void setId(long id) {
		_vrcfgStandard.setId(id);
	}

	/**
	* Sets the modify date of this vrcfg standard.
	*
	* @param modifyDate the modify date of this vrcfg standard
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrcfgStandard.setModifyDate(modifyDate);
	}

	@Override
	public void setNew(boolean n) {
		_vrcfgStandard.setNew(n);
	}

	/**
	* Sets the primary key of this vrcfg standard.
	*
	* @param primaryKey the primary key of this vrcfg standard
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrcfgStandard.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrcfgStandard.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sequence no of this vrcfg standard.
	*
	* @param sequenceNo the sequence no of this vrcfg standard
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrcfgStandard.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the standard code of this vrcfg standard.
	*
	* @param standardCode the standard code of this vrcfg standard
	*/
	@Override
	public void setStandardCode(java.lang.String standardCode) {
		_vrcfgStandard.setStandardCode(standardCode);
	}

	/**
	* Sets the standard description of this vrcfg standard.
	*
	* @param standardDescription the standard description of this vrcfg standard
	*/
	@Override
	public void setStandardDescription(java.lang.String standardDescription) {
		_vrcfgStandard.setStandardDescription(standardDescription);
	}

	/**
	* Sets the standard expired date of this vrcfg standard.
	*
	* @param standardExpiredDate the standard expired date of this vrcfg standard
	*/
	@Override
	public void setStandardExpiredDate(Date standardExpiredDate) {
		_vrcfgStandard.setStandardExpiredDate(standardExpiredDate);
	}

	/**
	* Sets the standard name of this vrcfg standard.
	*
	* @param standardName the standard name of this vrcfg standard
	*/
	@Override
	public void setStandardName(java.lang.String standardName) {
		_vrcfgStandard.setStandardName(standardName);
	}

	/**
	* Sets the standard type of this vrcfg standard.
	*
	* @param standardType the standard type of this vrcfg standard
	*/
	@Override
	public void setStandardType(java.lang.String standardType) {
		_vrcfgStandard.setStandardType(standardType);
	}

	/**
	* Sets the sync date of this vrcfg standard.
	*
	* @param syncDate the sync date of this vrcfg standard
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrcfgStandard.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle class of this vrcfg standard.
	*
	* @param vehicleClass the vehicle class of this vrcfg standard
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrcfgStandard.setVehicleClass(vehicleClass);
	}

	/**
	* Sets the vehicle type of this vrcfg standard.
	*
	* @param vehicleType the vehicle type of this vrcfg standard
	*/
	@Override
	public void setVehicleType(java.lang.String vehicleType) {
		_vrcfgStandard.setVehicleType(vehicleType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCFGStandardWrapper)) {
			return false;
		}

		VRCFGStandardWrapper vrcfgStandardWrapper = (VRCFGStandardWrapper)obj;

		if (Objects.equals(_vrcfgStandard, vrcfgStandardWrapper._vrcfgStandard)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCFGStandard getWrappedModel() {
		return _vrcfgStandard;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrcfgStandard.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrcfgStandard.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrcfgStandard.resetOriginalValues();
	}

	private final VRCFGStandard _vrcfgStandard;
}