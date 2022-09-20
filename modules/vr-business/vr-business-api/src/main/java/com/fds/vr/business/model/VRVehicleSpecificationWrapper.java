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
 * This class is a wrapper for {@link VRVehicleSpecification}.
 * </p>
 *
 * @author LamTV
 * @see VRVehicleSpecification
 * @generated
 */
@ProviderType
public class VRVehicleSpecificationWrapper implements VRVehicleSpecification,
	ModelWrapper<VRVehicleSpecification> {
	public VRVehicleSpecificationWrapper(
		VRVehicleSpecification vrVehicleSpecification) {
		_vrVehicleSpecification = vrVehicleSpecification;
	}

	@Override
	public Class<?> getModelClass() {
		return VRVehicleSpecification.class;
	}

	@Override
	public String getModelClassName() {
		return VRVehicleSpecification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleCertificateId", getVehicleCertificateId());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specificationValue", getSpecificationValue());
		attributes.put("specificationValueDescription",
			getSpecificationValueDescription());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("specificationBasicUnit", getSpecificationBasicUnit());
		attributes.put("specificationStandard", getSpecificationStandard());
		attributes.put("specificationGroup", getSpecificationGroup());
		attributes.put("specificationDataCollectionID",
			getSpecificationDataCollectionID());
		attributes.put("specificationResult", getSpecificationResult());
		attributes.put("deliverableCode", getDeliverableCode());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("dossierNo", getDossierNo());
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

		Long vehicleCertificateId = (Long)attributes.get("vehicleCertificateId");

		if (vehicleCertificateId != null) {
			setVehicleCertificateId(vehicleCertificateId);
		}

		String specificationCode = (String)attributes.get("specificationCode");

		if (specificationCode != null) {
			setSpecificationCode(specificationCode);
		}

		String specificationName = (String)attributes.get("specificationName");

		if (specificationName != null) {
			setSpecificationName(specificationName);
		}

		String specificationValue = (String)attributes.get("specificationValue");

		if (specificationValue != null) {
			setSpecificationValue(specificationValue);
		}

		String specificationValueDescription = (String)attributes.get(
				"specificationValueDescription");

		if (specificationValueDescription != null) {
			setSpecificationValueDescription(specificationValueDescription);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
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

		String specificationGroup = (String)attributes.get("specificationGroup");

		if (specificationGroup != null) {
			setSpecificationGroup(specificationGroup);
		}

		String specificationDataCollectionID = (String)attributes.get(
				"specificationDataCollectionID");

		if (specificationDataCollectionID != null) {
			setSpecificationDataCollectionID(specificationDataCollectionID);
		}

		String specificationResult = (String)attributes.get(
				"specificationResult");

		if (specificationResult != null) {
			setSpecificationResult(specificationResult);
		}

		String deliverableCode = (String)attributes.get("deliverableCode");

		if (deliverableCode != null) {
			setDeliverableCode(deliverableCode);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String dossierIdCTN = (String)attributes.get("dossierIdCTN");

		if (dossierIdCTN != null) {
			setDossierIdCTN(dossierIdCTN);
		}

		String dossierNo = (String)attributes.get("dossierNo");

		if (dossierNo != null) {
			setDossierNo(dossierNo);
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
	public VRVehicleSpecification toEscapedModel() {
		return new VRVehicleSpecificationWrapper(_vrVehicleSpecification.toEscapedModel());
	}

	@Override
	public VRVehicleSpecification toUnescapedModel() {
		return new VRVehicleSpecificationWrapper(_vrVehicleSpecification.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrVehicleSpecification.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrVehicleSpecification.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrVehicleSpecification.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrVehicleSpecification.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRVehicleSpecification> toCacheModel() {
		return _vrVehicleSpecification.toCacheModel();
	}

	@Override
	public int compareTo(VRVehicleSpecification vrVehicleSpecification) {
		return _vrVehicleSpecification.compareTo(vrVehicleSpecification);
	}

	@Override
	public int hashCode() {
		return _vrVehicleSpecification.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrVehicleSpecification.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRVehicleSpecificationWrapper((VRVehicleSpecification)_vrVehicleSpecification.clone());
	}

	/**
	* Returns the deliverable code of this vr vehicle specification.
	*
	* @return the deliverable code of this vr vehicle specification
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrVehicleSpecification.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr vehicle specification.
	*
	* @return the dossier ID ctn of this vr vehicle specification
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrVehicleSpecification.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr vehicle specification.
	*
	* @return the dossier no of this vr vehicle specification
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrVehicleSpecification.getDossierNo();
	}

	/**
	* Returns the specification basic unit of this vr vehicle specification.
	*
	* @return the specification basic unit of this vr vehicle specification
	*/
	@Override
	public java.lang.String getSpecificationBasicUnit() {
		return _vrVehicleSpecification.getSpecificationBasicUnit();
	}

	/**
	* Returns the specification code of this vr vehicle specification.
	*
	* @return the specification code of this vr vehicle specification
	*/
	@Override
	public java.lang.String getSpecificationCode() {
		return _vrVehicleSpecification.getSpecificationCode();
	}

	/**
	* Returns the specification data collection ID of this vr vehicle specification.
	*
	* @return the specification data collection ID of this vr vehicle specification
	*/
	@Override
	public java.lang.String getSpecificationDataCollectionID() {
		return _vrVehicleSpecification.getSpecificationDataCollectionID();
	}

	/**
	* Returns the specification group of this vr vehicle specification.
	*
	* @return the specification group of this vr vehicle specification
	*/
	@Override
	public java.lang.String getSpecificationGroup() {
		return _vrVehicleSpecification.getSpecificationGroup();
	}

	/**
	* Returns the specification name of this vr vehicle specification.
	*
	* @return the specification name of this vr vehicle specification
	*/
	@Override
	public java.lang.String getSpecificationName() {
		return _vrVehicleSpecification.getSpecificationName();
	}

	/**
	* Returns the specification result of this vr vehicle specification.
	*
	* @return the specification result of this vr vehicle specification
	*/
	@Override
	public java.lang.String getSpecificationResult() {
		return _vrVehicleSpecification.getSpecificationResult();
	}

	/**
	* Returns the specification standard of this vr vehicle specification.
	*
	* @return the specification standard of this vr vehicle specification
	*/
	@Override
	public java.lang.String getSpecificationStandard() {
		return _vrVehicleSpecification.getSpecificationStandard();
	}

	/**
	* Returns the specification value of this vr vehicle specification.
	*
	* @return the specification value of this vr vehicle specification
	*/
	@Override
	public java.lang.String getSpecificationValue() {
		return _vrVehicleSpecification.getSpecificationValue();
	}

	/**
	* Returns the specification value description of this vr vehicle specification.
	*
	* @return the specification value description of this vr vehicle specification
	*/
	@Override
	public java.lang.String getSpecificationValueDescription() {
		return _vrVehicleSpecification.getSpecificationValueDescription();
	}

	@Override
	public java.lang.String toString() {
		return _vrVehicleSpecification.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrVehicleSpecification.toXmlString();
	}

	/**
	* Returns the modify date of this vr vehicle specification.
	*
	* @return the modify date of this vr vehicle specification
	*/
	@Override
	public Date getModifyDate() {
		return _vrVehicleSpecification.getModifyDate();
	}

	/**
	* Returns the sync date of this vr vehicle specification.
	*
	* @return the sync date of this vr vehicle specification
	*/
	@Override
	public Date getSyncDate() {
		return _vrVehicleSpecification.getSyncDate();
	}

	/**
	* Returns the dossier ID of this vr vehicle specification.
	*
	* @return the dossier ID of this vr vehicle specification
	*/
	@Override
	public long getDossierId() {
		return _vrVehicleSpecification.getDossierId();
	}

	/**
	* Returns the ID of this vr vehicle specification.
	*
	* @return the ID of this vr vehicle specification
	*/
	@Override
	public long getId() {
		return _vrVehicleSpecification.getId();
	}

	/**
	* Returns the primary key of this vr vehicle specification.
	*
	* @return the primary key of this vr vehicle specification
	*/
	@Override
	public long getPrimaryKey() {
		return _vrVehicleSpecification.getPrimaryKey();
	}

	/**
	* Returns the sequence no of this vr vehicle specification.
	*
	* @return the sequence no of this vr vehicle specification
	*/
	@Override
	public long getSequenceNo() {
		return _vrVehicleSpecification.getSequenceNo();
	}

	/**
	* Returns the vehicle certificate ID of this vr vehicle specification.
	*
	* @return the vehicle certificate ID of this vr vehicle specification
	*/
	@Override
	public long getVehicleCertificateId() {
		return _vrVehicleSpecification.getVehicleCertificateId();
	}

	@Override
	public void persist() {
		_vrVehicleSpecification.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrVehicleSpecification.setCachedModel(cachedModel);
	}

	/**
	* Sets the deliverable code of this vr vehicle specification.
	*
	* @param deliverableCode the deliverable code of this vr vehicle specification
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrVehicleSpecification.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr vehicle specification.
	*
	* @param dossierId the dossier ID of this vr vehicle specification
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrVehicleSpecification.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr vehicle specification.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr vehicle specification
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrVehicleSpecification.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr vehicle specification.
	*
	* @param dossierNo the dossier no of this vr vehicle specification
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrVehicleSpecification.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrVehicleSpecification.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrVehicleSpecification.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrVehicleSpecification.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr vehicle specification.
	*
	* @param id the ID of this vr vehicle specification
	*/
	@Override
	public void setId(long id) {
		_vrVehicleSpecification.setId(id);
	}

	/**
	* Sets the modify date of this vr vehicle specification.
	*
	* @param modifyDate the modify date of this vr vehicle specification
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrVehicleSpecification.setModifyDate(modifyDate);
	}

	@Override
	public void setNew(boolean n) {
		_vrVehicleSpecification.setNew(n);
	}

	/**
	* Sets the primary key of this vr vehicle specification.
	*
	* @param primaryKey the primary key of this vr vehicle specification
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrVehicleSpecification.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrVehicleSpecification.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sequence no of this vr vehicle specification.
	*
	* @param sequenceNo the sequence no of this vr vehicle specification
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrVehicleSpecification.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the specification basic unit of this vr vehicle specification.
	*
	* @param specificationBasicUnit the specification basic unit of this vr vehicle specification
	*/
	@Override
	public void setSpecificationBasicUnit(
		java.lang.String specificationBasicUnit) {
		_vrVehicleSpecification.setSpecificationBasicUnit(specificationBasicUnit);
	}

	/**
	* Sets the specification code of this vr vehicle specification.
	*
	* @param specificationCode the specification code of this vr vehicle specification
	*/
	@Override
	public void setSpecificationCode(java.lang.String specificationCode) {
		_vrVehicleSpecification.setSpecificationCode(specificationCode);
	}

	/**
	* Sets the specification data collection ID of this vr vehicle specification.
	*
	* @param specificationDataCollectionID the specification data collection ID of this vr vehicle specification
	*/
	@Override
	public void setSpecificationDataCollectionID(
		java.lang.String specificationDataCollectionID) {
		_vrVehicleSpecification.setSpecificationDataCollectionID(specificationDataCollectionID);
	}

	/**
	* Sets the specification group of this vr vehicle specification.
	*
	* @param specificationGroup the specification group of this vr vehicle specification
	*/
	@Override
	public void setSpecificationGroup(java.lang.String specificationGroup) {
		_vrVehicleSpecification.setSpecificationGroup(specificationGroup);
	}

	/**
	* Sets the specification name of this vr vehicle specification.
	*
	* @param specificationName the specification name of this vr vehicle specification
	*/
	@Override
	public void setSpecificationName(java.lang.String specificationName) {
		_vrVehicleSpecification.setSpecificationName(specificationName);
	}

	/**
	* Sets the specification result of this vr vehicle specification.
	*
	* @param specificationResult the specification result of this vr vehicle specification
	*/
	@Override
	public void setSpecificationResult(java.lang.String specificationResult) {
		_vrVehicleSpecification.setSpecificationResult(specificationResult);
	}

	/**
	* Sets the specification standard of this vr vehicle specification.
	*
	* @param specificationStandard the specification standard of this vr vehicle specification
	*/
	@Override
	public void setSpecificationStandard(java.lang.String specificationStandard) {
		_vrVehicleSpecification.setSpecificationStandard(specificationStandard);
	}

	/**
	* Sets the specification value of this vr vehicle specification.
	*
	* @param specificationValue the specification value of this vr vehicle specification
	*/
	@Override
	public void setSpecificationValue(java.lang.String specificationValue) {
		_vrVehicleSpecification.setSpecificationValue(specificationValue);
	}

	/**
	* Sets the specification value description of this vr vehicle specification.
	*
	* @param specificationValueDescription the specification value description of this vr vehicle specification
	*/
	@Override
	public void setSpecificationValueDescription(
		java.lang.String specificationValueDescription) {
		_vrVehicleSpecification.setSpecificationValueDescription(specificationValueDescription);
	}

	/**
	* Sets the sync date of this vr vehicle specification.
	*
	* @param syncDate the sync date of this vr vehicle specification
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrVehicleSpecification.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle certificate ID of this vr vehicle specification.
	*
	* @param vehicleCertificateId the vehicle certificate ID of this vr vehicle specification
	*/
	@Override
	public void setVehicleCertificateId(long vehicleCertificateId) {
		_vrVehicleSpecification.setVehicleCertificateId(vehicleCertificateId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRVehicleSpecificationWrapper)) {
			return false;
		}

		VRVehicleSpecificationWrapper vrVehicleSpecificationWrapper = (VRVehicleSpecificationWrapper)obj;

		if (Objects.equals(_vrVehicleSpecification,
					vrVehicleSpecificationWrapper._vrVehicleSpecification)) {
			return true;
		}

		return false;
	}

	@Override
	public VRVehicleSpecification getWrappedModel() {
		return _vrVehicleSpecification;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrVehicleSpecification.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrVehicleSpecification.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrVehicleSpecification.resetOriginalValues();
	}

	private final VRVehicleSpecification _vrVehicleSpecification;
}