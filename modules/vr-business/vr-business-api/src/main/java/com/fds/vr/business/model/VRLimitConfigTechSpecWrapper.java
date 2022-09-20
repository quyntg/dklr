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
 * This class is a wrapper for {@link VRLimitConfigTechSpec}.
 * </p>
 *
 * @author LamTV
 * @see VRLimitConfigTechSpec
 * @generated
 */
@ProviderType
public class VRLimitConfigTechSpecWrapper implements VRLimitConfigTechSpec,
	ModelWrapper<VRLimitConfigTechSpec> {
	public VRLimitConfigTechSpecWrapper(
		VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		_vrLimitConfigTechSpec = vrLimitConfigTechSpec;
	}

	@Override
	public Class<?> getModelClass() {
		return VRLimitConfigTechSpec.class;
	}

	@Override
	public String getModelClassName() {
		return VRLimitConfigTechSpec.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleType", getVehicleType());
		attributes.put("vehicleTypeName", getVehicleTypeName());
		attributes.put("markupSMRM", getMarkupSMRM());
		attributes.put("searchingDriveConfig", getSearchingDriveConfig());
		attributes.put("searchingDriveConfigDesc", getSearchingDriveConfigDesc());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("synchDate", getSynchDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String vehicleType = (String)attributes.get("vehicleType");

		if (vehicleType != null) {
			setVehicleType(vehicleType);
		}

		String vehicleTypeName = (String)attributes.get("vehicleTypeName");

		if (vehicleTypeName != null) {
			setVehicleTypeName(vehicleTypeName);
		}

		String markupSMRM = (String)attributes.get("markupSMRM");

		if (markupSMRM != null) {
			setMarkupSMRM(markupSMRM);
		}

		Long searchingDriveConfig = (Long)attributes.get("searchingDriveConfig");

		if (searchingDriveConfig != null) {
			setSearchingDriveConfig(searchingDriveConfig);
		}

		String searchingDriveConfigDesc = (String)attributes.get(
				"searchingDriveConfigDesc");

		if (searchingDriveConfigDesc != null) {
			setSearchingDriveConfigDesc(searchingDriveConfigDesc);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String specificationCode = (String)attributes.get("specificationCode");

		if (specificationCode != null) {
			setSpecificationCode(specificationCode);
		}

		String specificationName = (String)attributes.get("specificationName");

		if (specificationName != null) {
			setSpecificationName(specificationName);
		}

		Date synchDate = (Date)attributes.get("synchDate");

		if (synchDate != null) {
			setSynchDate(synchDate);
		}
	}

	@Override
	public VRLimitConfigTechSpec toEscapedModel() {
		return new VRLimitConfigTechSpecWrapper(_vrLimitConfigTechSpec.toEscapedModel());
	}

	@Override
	public VRLimitConfigTechSpec toUnescapedModel() {
		return new VRLimitConfigTechSpecWrapper(_vrLimitConfigTechSpec.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrLimitConfigTechSpec.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrLimitConfigTechSpec.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrLimitConfigTechSpec.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrLimitConfigTechSpec.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRLimitConfigTechSpec> toCacheModel() {
		return _vrLimitConfigTechSpec.toCacheModel();
	}

	@Override
	public int compareTo(VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		return _vrLimitConfigTechSpec.compareTo(vrLimitConfigTechSpec);
	}

	/**
	* Returns the sequence no of this vr limit config tech spec.
	*
	* @return the sequence no of this vr limit config tech spec
	*/
	@Override
	public int getSequenceNo() {
		return _vrLimitConfigTechSpec.getSequenceNo();
	}

	@Override
	public int hashCode() {
		return _vrLimitConfigTechSpec.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrLimitConfigTechSpec.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRLimitConfigTechSpecWrapper((VRLimitConfigTechSpec)_vrLimitConfigTechSpec.clone());
	}

	/**
	* Returns the markup smrm of this vr limit config tech spec.
	*
	* @return the markup smrm of this vr limit config tech spec
	*/
	@Override
	public java.lang.String getMarkupSMRM() {
		return _vrLimitConfigTechSpec.getMarkupSMRM();
	}

	/**
	* Returns the searching drive config desc of this vr limit config tech spec.
	*
	* @return the searching drive config desc of this vr limit config tech spec
	*/
	@Override
	public java.lang.String getSearchingDriveConfigDesc() {
		return _vrLimitConfigTechSpec.getSearchingDriveConfigDesc();
	}

	/**
	* Returns the specification code of this vr limit config tech spec.
	*
	* @return the specification code of this vr limit config tech spec
	*/
	@Override
	public java.lang.String getSpecificationCode() {
		return _vrLimitConfigTechSpec.getSpecificationCode();
	}

	/**
	* Returns the specification name of this vr limit config tech spec.
	*
	* @return the specification name of this vr limit config tech spec
	*/
	@Override
	public java.lang.String getSpecificationName() {
		return _vrLimitConfigTechSpec.getSpecificationName();
	}

	/**
	* Returns the vehicle type of this vr limit config tech spec.
	*
	* @return the vehicle type of this vr limit config tech spec
	*/
	@Override
	public java.lang.String getVehicleType() {
		return _vrLimitConfigTechSpec.getVehicleType();
	}

	/**
	* Returns the vehicle type name of this vr limit config tech spec.
	*
	* @return the vehicle type name of this vr limit config tech spec
	*/
	@Override
	public java.lang.String getVehicleTypeName() {
		return _vrLimitConfigTechSpec.getVehicleTypeName();
	}

	@Override
	public java.lang.String toString() {
		return _vrLimitConfigTechSpec.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrLimitConfigTechSpec.toXmlString();
	}

	/**
	* Returns the synch date of this vr limit config tech spec.
	*
	* @return the synch date of this vr limit config tech spec
	*/
	@Override
	public Date getSynchDate() {
		return _vrLimitConfigTechSpec.getSynchDate();
	}

	/**
	* Returns the ID of this vr limit config tech spec.
	*
	* @return the ID of this vr limit config tech spec
	*/
	@Override
	public long getId() {
		return _vrLimitConfigTechSpec.getId();
	}

	/**
	* Returns the primary key of this vr limit config tech spec.
	*
	* @return the primary key of this vr limit config tech spec
	*/
	@Override
	public long getPrimaryKey() {
		return _vrLimitConfigTechSpec.getPrimaryKey();
	}

	/**
	* Returns the searching drive config of this vr limit config tech spec.
	*
	* @return the searching drive config of this vr limit config tech spec
	*/
	@Override
	public long getSearchingDriveConfig() {
		return _vrLimitConfigTechSpec.getSearchingDriveConfig();
	}

	@Override
	public void persist() {
		_vrLimitConfigTechSpec.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrLimitConfigTechSpec.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrLimitConfigTechSpec.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrLimitConfigTechSpec.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrLimitConfigTechSpec.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr limit config tech spec.
	*
	* @param id the ID of this vr limit config tech spec
	*/
	@Override
	public void setId(long id) {
		_vrLimitConfigTechSpec.setId(id);
	}

	/**
	* Sets the markup smrm of this vr limit config tech spec.
	*
	* @param markupSMRM the markup smrm of this vr limit config tech spec
	*/
	@Override
	public void setMarkupSMRM(java.lang.String markupSMRM) {
		_vrLimitConfigTechSpec.setMarkupSMRM(markupSMRM);
	}

	@Override
	public void setNew(boolean n) {
		_vrLimitConfigTechSpec.setNew(n);
	}

	/**
	* Sets the primary key of this vr limit config tech spec.
	*
	* @param primaryKey the primary key of this vr limit config tech spec
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrLimitConfigTechSpec.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrLimitConfigTechSpec.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the searching drive config of this vr limit config tech spec.
	*
	* @param searchingDriveConfig the searching drive config of this vr limit config tech spec
	*/
	@Override
	public void setSearchingDriveConfig(long searchingDriveConfig) {
		_vrLimitConfigTechSpec.setSearchingDriveConfig(searchingDriveConfig);
	}

	/**
	* Sets the searching drive config desc of this vr limit config tech spec.
	*
	* @param searchingDriveConfigDesc the searching drive config desc of this vr limit config tech spec
	*/
	@Override
	public void setSearchingDriveConfigDesc(
		java.lang.String searchingDriveConfigDesc) {
		_vrLimitConfigTechSpec.setSearchingDriveConfigDesc(searchingDriveConfigDesc);
	}

	/**
	* Sets the sequence no of this vr limit config tech spec.
	*
	* @param sequenceNo the sequence no of this vr limit config tech spec
	*/
	@Override
	public void setSequenceNo(int sequenceNo) {
		_vrLimitConfigTechSpec.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the specification code of this vr limit config tech spec.
	*
	* @param specificationCode the specification code of this vr limit config tech spec
	*/
	@Override
	public void setSpecificationCode(java.lang.String specificationCode) {
		_vrLimitConfigTechSpec.setSpecificationCode(specificationCode);
	}

	/**
	* Sets the specification name of this vr limit config tech spec.
	*
	* @param specificationName the specification name of this vr limit config tech spec
	*/
	@Override
	public void setSpecificationName(java.lang.String specificationName) {
		_vrLimitConfigTechSpec.setSpecificationName(specificationName);
	}

	/**
	* Sets the synch date of this vr limit config tech spec.
	*
	* @param synchDate the synch date of this vr limit config tech spec
	*/
	@Override
	public void setSynchDate(Date synchDate) {
		_vrLimitConfigTechSpec.setSynchDate(synchDate);
	}

	/**
	* Sets the vehicle type of this vr limit config tech spec.
	*
	* @param vehicleType the vehicle type of this vr limit config tech spec
	*/
	@Override
	public void setVehicleType(java.lang.String vehicleType) {
		_vrLimitConfigTechSpec.setVehicleType(vehicleType);
	}

	/**
	* Sets the vehicle type name of this vr limit config tech spec.
	*
	* @param vehicleTypeName the vehicle type name of this vr limit config tech spec
	*/
	@Override
	public void setVehicleTypeName(java.lang.String vehicleTypeName) {
		_vrLimitConfigTechSpec.setVehicleTypeName(vehicleTypeName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRLimitConfigTechSpecWrapper)) {
			return false;
		}

		VRLimitConfigTechSpecWrapper vrLimitConfigTechSpecWrapper = (VRLimitConfigTechSpecWrapper)obj;

		if (Objects.equals(_vrLimitConfigTechSpec,
					vrLimitConfigTechSpecWrapper._vrLimitConfigTechSpec)) {
			return true;
		}

		return false;
	}

	@Override
	public VRLimitConfigTechSpec getWrappedModel() {
		return _vrLimitConfigTechSpec;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrLimitConfigTechSpec.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrLimitConfigTechSpec.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrLimitConfigTechSpec.resetOriginalValues();
	}

	private final VRLimitConfigTechSpec _vrLimitConfigTechSpec;
}