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
 * This class is a wrapper for {@link VRConfigTechSpec}.
 * </p>
 *
 * @author LamTV
 * @see VRConfigTechSpec
 * @generated
 */
@ProviderType
public class VRConfigTechSpecWrapper implements VRConfigTechSpec,
	ModelWrapper<VRConfigTechSpec> {
	public VRConfigTechSpecWrapper(VRConfigTechSpec vrConfigTechSpec) {
		_vrConfigTechSpec = vrConfigTechSpec;
	}

	@Override
	public Class<?> getModelClass() {
		return VRConfigTechSpec.class;
	}

	@Override
	public String getModelClassName() {
		return VRConfigTechSpec.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("vehicleType", getVehicleType());
		attributes.put("vehicletypeName", getVehicletypeName());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationDisplayName", getSpecificationDisplayName());
		attributes.put("specCategory", getSpecCategory());
		attributes.put("specificationGroup", getSpecificationGroup());
		attributes.put("specificationDataCollectionId",
			getSpecificationDataCollectionId());
		attributes.put("specificationBasicUnit", getSpecificationBasicUnit());
		attributes.put("specificationStandard", getSpecificationStandard());
		attributes.put("specificationEntryType", getSpecificationEntryType());
		attributes.put("specificationEntryPlaceholder",
			getSpecificationEntryPlaceholder());
		attributes.put("specificationMandatory", getSpecificationMandatory());
		attributes.put("module", getModule());
		attributes.put("synchDate", getSynchDate());

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

		String vehicletypeName = (String)attributes.get("vehicletypeName");

		if (vehicletypeName != null) {
			setVehicletypeName(vehicletypeName);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String specificationName = (String)attributes.get("specificationName");

		if (specificationName != null) {
			setSpecificationName(specificationName);
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

		String specCategory = (String)attributes.get("specCategory");

		if (specCategory != null) {
			setSpecCategory(specCategory);
		}

		Integer specificationGroup = (Integer)attributes.get(
				"specificationGroup");

		if (specificationGroup != null) {
			setSpecificationGroup(specificationGroup);
		}

		String specificationDataCollectionId = (String)attributes.get(
				"specificationDataCollectionId");

		if (specificationDataCollectionId != null) {
			setSpecificationDataCollectionId(specificationDataCollectionId);
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

		String specificationEntryType = (String)attributes.get(
				"specificationEntryType");

		if (specificationEntryType != null) {
			setSpecificationEntryType(specificationEntryType);
		}

		String specificationEntryPlaceholder = (String)attributes.get(
				"specificationEntryPlaceholder");

		if (specificationEntryPlaceholder != null) {
			setSpecificationEntryPlaceholder(specificationEntryPlaceholder);
		}

		Integer specificationMandatory = (Integer)attributes.get(
				"specificationMandatory");

		if (specificationMandatory != null) {
			setSpecificationMandatory(specificationMandatory);
		}

		String module = (String)attributes.get("module");

		if (module != null) {
			setModule(module);
		}

		Date synchDate = (Date)attributes.get("synchDate");

		if (synchDate != null) {
			setSynchDate(synchDate);
		}
	}

	@Override
	public VRConfigTechSpec toEscapedModel() {
		return new VRConfigTechSpecWrapper(_vrConfigTechSpec.toEscapedModel());
	}

	@Override
	public VRConfigTechSpec toUnescapedModel() {
		return new VRConfigTechSpecWrapper(_vrConfigTechSpec.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrConfigTechSpec.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrConfigTechSpec.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrConfigTechSpec.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrConfigTechSpec.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRConfigTechSpec> toCacheModel() {
		return _vrConfigTechSpec.toCacheModel();
	}

	@Override
	public int compareTo(VRConfigTechSpec vrConfigTechSpec) {
		return _vrConfigTechSpec.compareTo(vrConfigTechSpec);
	}

	/**
	* Returns the sequence no of this vr config tech spec.
	*
	* @return the sequence no of this vr config tech spec
	*/
	@Override
	public int getSequenceNo() {
		return _vrConfigTechSpec.getSequenceNo();
	}

	/**
	* Returns the specification group of this vr config tech spec.
	*
	* @return the specification group of this vr config tech spec
	*/
	@Override
	public int getSpecificationGroup() {
		return _vrConfigTechSpec.getSpecificationGroup();
	}

	/**
	* Returns the specification mandatory of this vr config tech spec.
	*
	* @return the specification mandatory of this vr config tech spec
	*/
	@Override
	public int getSpecificationMandatory() {
		return _vrConfigTechSpec.getSpecificationMandatory();
	}

	@Override
	public int hashCode() {
		return _vrConfigTechSpec.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrConfigTechSpec.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRConfigTechSpecWrapper((VRConfigTechSpec)_vrConfigTechSpec.clone());
	}

	/**
	* Returns the module of this vr config tech spec.
	*
	* @return the module of this vr config tech spec
	*/
	@Override
	public java.lang.String getModule() {
		return _vrConfigTechSpec.getModule();
	}

	/**
	* Returns the spec category of this vr config tech spec.
	*
	* @return the spec category of this vr config tech spec
	*/
	@Override
	public java.lang.String getSpecCategory() {
		return _vrConfigTechSpec.getSpecCategory();
	}

	/**
	* Returns the specification basic unit of this vr config tech spec.
	*
	* @return the specification basic unit of this vr config tech spec
	*/
	@Override
	public java.lang.String getSpecificationBasicUnit() {
		return _vrConfigTechSpec.getSpecificationBasicUnit();
	}

	/**
	* Returns the specification code of this vr config tech spec.
	*
	* @return the specification code of this vr config tech spec
	*/
	@Override
	public java.lang.String getSpecificationCode() {
		return _vrConfigTechSpec.getSpecificationCode();
	}

	/**
	* Returns the specification data collection ID of this vr config tech spec.
	*
	* @return the specification data collection ID of this vr config tech spec
	*/
	@Override
	public java.lang.String getSpecificationDataCollectionId() {
		return _vrConfigTechSpec.getSpecificationDataCollectionId();
	}

	/**
	* Returns the specification display name of this vr config tech spec.
	*
	* @return the specification display name of this vr config tech spec
	*/
	@Override
	public java.lang.String getSpecificationDisplayName() {
		return _vrConfigTechSpec.getSpecificationDisplayName();
	}

	/**
	* Returns the specification entry placeholder of this vr config tech spec.
	*
	* @return the specification entry placeholder of this vr config tech spec
	*/
	@Override
	public java.lang.String getSpecificationEntryPlaceholder() {
		return _vrConfigTechSpec.getSpecificationEntryPlaceholder();
	}

	/**
	* Returns the specification entry type of this vr config tech spec.
	*
	* @return the specification entry type of this vr config tech spec
	*/
	@Override
	public java.lang.String getSpecificationEntryType() {
		return _vrConfigTechSpec.getSpecificationEntryType();
	}

	/**
	* Returns the specification name of this vr config tech spec.
	*
	* @return the specification name of this vr config tech spec
	*/
	@Override
	public java.lang.String getSpecificationName() {
		return _vrConfigTechSpec.getSpecificationName();
	}

	/**
	* Returns the specification standard of this vr config tech spec.
	*
	* @return the specification standard of this vr config tech spec
	*/
	@Override
	public java.lang.String getSpecificationStandard() {
		return _vrConfigTechSpec.getSpecificationStandard();
	}

	/**
	* Returns the vehicle class of this vr config tech spec.
	*
	* @return the vehicle class of this vr config tech spec
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrConfigTechSpec.getVehicleClass();
	}

	/**
	* Returns the vehicle type of this vr config tech spec.
	*
	* @return the vehicle type of this vr config tech spec
	*/
	@Override
	public java.lang.String getVehicleType() {
		return _vrConfigTechSpec.getVehicleType();
	}

	/**
	* Returns the vehicletype name of this vr config tech spec.
	*
	* @return the vehicletype name of this vr config tech spec
	*/
	@Override
	public java.lang.String getVehicletypeName() {
		return _vrConfigTechSpec.getVehicletypeName();
	}

	@Override
	public java.lang.String toString() {
		return _vrConfigTechSpec.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrConfigTechSpec.toXmlString();
	}

	/**
	* Returns the synch date of this vr config tech spec.
	*
	* @return the synch date of this vr config tech spec
	*/
	@Override
	public Date getSynchDate() {
		return _vrConfigTechSpec.getSynchDate();
	}

	/**
	* Returns the ID of this vr config tech spec.
	*
	* @return the ID of this vr config tech spec
	*/
	@Override
	public long getId() {
		return _vrConfigTechSpec.getId();
	}

	/**
	* Returns the primary key of this vr config tech spec.
	*
	* @return the primary key of this vr config tech spec
	*/
	@Override
	public long getPrimaryKey() {
		return _vrConfigTechSpec.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrConfigTechSpec.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrConfigTechSpec.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrConfigTechSpec.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrConfigTechSpec.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrConfigTechSpec.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr config tech spec.
	*
	* @param id the ID of this vr config tech spec
	*/
	@Override
	public void setId(long id) {
		_vrConfigTechSpec.setId(id);
	}

	/**
	* Sets the module of this vr config tech spec.
	*
	* @param module the module of this vr config tech spec
	*/
	@Override
	public void setModule(java.lang.String module) {
		_vrConfigTechSpec.setModule(module);
	}

	@Override
	public void setNew(boolean n) {
		_vrConfigTechSpec.setNew(n);
	}

	/**
	* Sets the primary key of this vr config tech spec.
	*
	* @param primaryKey the primary key of this vr config tech spec
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrConfigTechSpec.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrConfigTechSpec.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sequence no of this vr config tech spec.
	*
	* @param sequenceNo the sequence no of this vr config tech spec
	*/
	@Override
	public void setSequenceNo(int sequenceNo) {
		_vrConfigTechSpec.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the spec category of this vr config tech spec.
	*
	* @param specCategory the spec category of this vr config tech spec
	*/
	@Override
	public void setSpecCategory(java.lang.String specCategory) {
		_vrConfigTechSpec.setSpecCategory(specCategory);
	}

	/**
	* Sets the specification basic unit of this vr config tech spec.
	*
	* @param specificationBasicUnit the specification basic unit of this vr config tech spec
	*/
	@Override
	public void setSpecificationBasicUnit(
		java.lang.String specificationBasicUnit) {
		_vrConfigTechSpec.setSpecificationBasicUnit(specificationBasicUnit);
	}

	/**
	* Sets the specification code of this vr config tech spec.
	*
	* @param specificationCode the specification code of this vr config tech spec
	*/
	@Override
	public void setSpecificationCode(java.lang.String specificationCode) {
		_vrConfigTechSpec.setSpecificationCode(specificationCode);
	}

	/**
	* Sets the specification data collection ID of this vr config tech spec.
	*
	* @param specificationDataCollectionId the specification data collection ID of this vr config tech spec
	*/
	@Override
	public void setSpecificationDataCollectionId(
		java.lang.String specificationDataCollectionId) {
		_vrConfigTechSpec.setSpecificationDataCollectionId(specificationDataCollectionId);
	}

	/**
	* Sets the specification display name of this vr config tech spec.
	*
	* @param specificationDisplayName the specification display name of this vr config tech spec
	*/
	@Override
	public void setSpecificationDisplayName(
		java.lang.String specificationDisplayName) {
		_vrConfigTechSpec.setSpecificationDisplayName(specificationDisplayName);
	}

	/**
	* Sets the specification entry placeholder of this vr config tech spec.
	*
	* @param specificationEntryPlaceholder the specification entry placeholder of this vr config tech spec
	*/
	@Override
	public void setSpecificationEntryPlaceholder(
		java.lang.String specificationEntryPlaceholder) {
		_vrConfigTechSpec.setSpecificationEntryPlaceholder(specificationEntryPlaceholder);
	}

	/**
	* Sets the specification entry type of this vr config tech spec.
	*
	* @param specificationEntryType the specification entry type of this vr config tech spec
	*/
	@Override
	public void setSpecificationEntryType(
		java.lang.String specificationEntryType) {
		_vrConfigTechSpec.setSpecificationEntryType(specificationEntryType);
	}

	/**
	* Sets the specification group of this vr config tech spec.
	*
	* @param specificationGroup the specification group of this vr config tech spec
	*/
	@Override
	public void setSpecificationGroup(int specificationGroup) {
		_vrConfigTechSpec.setSpecificationGroup(specificationGroup);
	}

	/**
	* Sets the specification mandatory of this vr config tech spec.
	*
	* @param specificationMandatory the specification mandatory of this vr config tech spec
	*/
	@Override
	public void setSpecificationMandatory(int specificationMandatory) {
		_vrConfigTechSpec.setSpecificationMandatory(specificationMandatory);
	}

	/**
	* Sets the specification name of this vr config tech spec.
	*
	* @param specificationName the specification name of this vr config tech spec
	*/
	@Override
	public void setSpecificationName(java.lang.String specificationName) {
		_vrConfigTechSpec.setSpecificationName(specificationName);
	}

	/**
	* Sets the specification standard of this vr config tech spec.
	*
	* @param specificationStandard the specification standard of this vr config tech spec
	*/
	@Override
	public void setSpecificationStandard(java.lang.String specificationStandard) {
		_vrConfigTechSpec.setSpecificationStandard(specificationStandard);
	}

	/**
	* Sets the synch date of this vr config tech spec.
	*
	* @param synchDate the synch date of this vr config tech spec
	*/
	@Override
	public void setSynchDate(Date synchDate) {
		_vrConfigTechSpec.setSynchDate(synchDate);
	}

	/**
	* Sets the vehicle class of this vr config tech spec.
	*
	* @param vehicleClass the vehicle class of this vr config tech spec
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrConfigTechSpec.setVehicleClass(vehicleClass);
	}

	/**
	* Sets the vehicle type of this vr config tech spec.
	*
	* @param vehicleType the vehicle type of this vr config tech spec
	*/
	@Override
	public void setVehicleType(java.lang.String vehicleType) {
		_vrConfigTechSpec.setVehicleType(vehicleType);
	}

	/**
	* Sets the vehicletype name of this vr config tech spec.
	*
	* @param vehicletypeName the vehicletype name of this vr config tech spec
	*/
	@Override
	public void setVehicletypeName(java.lang.String vehicletypeName) {
		_vrConfigTechSpec.setVehicletypeName(vehicletypeName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRConfigTechSpecWrapper)) {
			return false;
		}

		VRConfigTechSpecWrapper vrConfigTechSpecWrapper = (VRConfigTechSpecWrapper)obj;

		if (Objects.equals(_vrConfigTechSpec,
					vrConfigTechSpecWrapper._vrConfigTechSpec)) {
			return true;
		}

		return false;
	}

	@Override
	public VRConfigTechSpec getWrappedModel() {
		return _vrConfigTechSpec;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrConfigTechSpec.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrConfigTechSpec.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrConfigTechSpec.resetOriginalValues();
	}

	private final VRConfigTechSpec _vrConfigTechSpec;
}