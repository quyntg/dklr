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
 * This class is a wrapper for {@link VRProductionPlantEmployee}.
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantEmployee
 * @generated
 */
@ProviderType
public class VRProductionPlantEmployeeWrapper
	implements VRProductionPlantEmployee,
		ModelWrapper<VRProductionPlantEmployee> {
	public VRProductionPlantEmployeeWrapper(
		VRProductionPlantEmployee vrProductionPlantEmployee) {
		_vrProductionPlantEmployee = vrProductionPlantEmployee;
	}

	@Override
	public Class<?> getModelClass() {
		return VRProductionPlantEmployee.class;
	}

	@Override
	public String getModelClassName() {
		return VRProductionPlantEmployee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("employeeName", getEmployeeName());
		attributes.put("employeeCertificateNo", getEmployeeCertificateNo());
		attributes.put("trainningAt", getTrainningAt());
		attributes.put("workingPosition", getWorkingPosition());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());
		attributes.put("productionPlantCode", getProductionPlantCode());
		attributes.put("productionPlantId", getProductionPlantId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String employeeName = (String)attributes.get("employeeName");

		if (employeeName != null) {
			setEmployeeName(employeeName);
		}

		String employeeCertificateNo = (String)attributes.get(
				"employeeCertificateNo");

		if (employeeCertificateNo != null) {
			setEmployeeCertificateNo(employeeCertificateNo);
		}

		String trainningAt = (String)attributes.get("trainningAt");

		if (trainningAt != null) {
			setTrainningAt(trainningAt);
		}

		String workingPosition = (String)attributes.get("workingPosition");

		if (workingPosition != null) {
			setWorkingPosition(workingPosition);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}

		String productionPlantCode = (String)attributes.get(
				"productionPlantCode");

		if (productionPlantCode != null) {
			setProductionPlantCode(productionPlantCode);
		}

		Long productionPlantId = (Long)attributes.get("productionPlantId");

		if (productionPlantId != null) {
			setProductionPlantId(productionPlantId);
		}
	}

	@Override
	public VRProductionPlantEmployee toEscapedModel() {
		return new VRProductionPlantEmployeeWrapper(_vrProductionPlantEmployee.toEscapedModel());
	}

	@Override
	public VRProductionPlantEmployee toUnescapedModel() {
		return new VRProductionPlantEmployeeWrapper(_vrProductionPlantEmployee.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrProductionPlantEmployee.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrProductionPlantEmployee.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrProductionPlantEmployee.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrProductionPlantEmployee.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRProductionPlantEmployee> toCacheModel() {
		return _vrProductionPlantEmployee.toCacheModel();
	}

	@Override
	public int compareTo(VRProductionPlantEmployee vrProductionPlantEmployee) {
		return _vrProductionPlantEmployee.compareTo(vrProductionPlantEmployee);
	}

	@Override
	public int hashCode() {
		return _vrProductionPlantEmployee.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrProductionPlantEmployee.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRProductionPlantEmployeeWrapper((VRProductionPlantEmployee)_vrProductionPlantEmployee.clone());
	}

	/**
	* Returns the employee certificate no of this vr production plant employee.
	*
	* @return the employee certificate no of this vr production plant employee
	*/
	@Override
	public java.lang.String getEmployeeCertificateNo() {
		return _vrProductionPlantEmployee.getEmployeeCertificateNo();
	}

	/**
	* Returns the employee name of this vr production plant employee.
	*
	* @return the employee name of this vr production plant employee
	*/
	@Override
	public java.lang.String getEmployeeName() {
		return _vrProductionPlantEmployee.getEmployeeName();
	}

	/**
	* Returns the production plant code of this vr production plant employee.
	*
	* @return the production plant code of this vr production plant employee
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrProductionPlantEmployee.getProductionPlantCode();
	}

	/**
	* Returns the trainning at of this vr production plant employee.
	*
	* @return the trainning at of this vr production plant employee
	*/
	@Override
	public java.lang.String getTrainningAt() {
		return _vrProductionPlantEmployee.getTrainningAt();
	}

	/**
	* Returns the working position of this vr production plant employee.
	*
	* @return the working position of this vr production plant employee
	*/
	@Override
	public java.lang.String getWorkingPosition() {
		return _vrProductionPlantEmployee.getWorkingPosition();
	}

	@Override
	public java.lang.String toString() {
		return _vrProductionPlantEmployee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrProductionPlantEmployee.toXmlString();
	}

	/**
	* Returns the modify date of this vr production plant employee.
	*
	* @return the modify date of this vr production plant employee
	*/
	@Override
	public Date getModifyDate() {
		return _vrProductionPlantEmployee.getModifyDate();
	}

	/**
	* Returns the sync date of this vr production plant employee.
	*
	* @return the sync date of this vr production plant employee
	*/
	@Override
	public Date getSyncDate() {
		return _vrProductionPlantEmployee.getSyncDate();
	}

	/**
	* Returns the ID of this vr production plant employee.
	*
	* @return the ID of this vr production plant employee
	*/
	@Override
	public long getId() {
		return _vrProductionPlantEmployee.getId();
	}

	/**
	* Returns the mt core of this vr production plant employee.
	*
	* @return the mt core of this vr production plant employee
	*/
	@Override
	public long getMtCore() {
		return _vrProductionPlantEmployee.getMtCore();
	}

	/**
	* Returns the primary key of this vr production plant employee.
	*
	* @return the primary key of this vr production plant employee
	*/
	@Override
	public long getPrimaryKey() {
		return _vrProductionPlantEmployee.getPrimaryKey();
	}

	/**
	* Returns the production plant ID of this vr production plant employee.
	*
	* @return the production plant ID of this vr production plant employee
	*/
	@Override
	public long getProductionPlantId() {
		return _vrProductionPlantEmployee.getProductionPlantId();
	}

	/**
	* Returns the sequence no of this vr production plant employee.
	*
	* @return the sequence no of this vr production plant employee
	*/
	@Override
	public long getSequenceNo() {
		return _vrProductionPlantEmployee.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrProductionPlantEmployee.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrProductionPlantEmployee.setCachedModel(cachedModel);
	}

	/**
	* Sets the employee certificate no of this vr production plant employee.
	*
	* @param employeeCertificateNo the employee certificate no of this vr production plant employee
	*/
	@Override
	public void setEmployeeCertificateNo(java.lang.String employeeCertificateNo) {
		_vrProductionPlantEmployee.setEmployeeCertificateNo(employeeCertificateNo);
	}

	/**
	* Sets the employee name of this vr production plant employee.
	*
	* @param employeeName the employee name of this vr production plant employee
	*/
	@Override
	public void setEmployeeName(java.lang.String employeeName) {
		_vrProductionPlantEmployee.setEmployeeName(employeeName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrProductionPlantEmployee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrProductionPlantEmployee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrProductionPlantEmployee.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr production plant employee.
	*
	* @param id the ID of this vr production plant employee
	*/
	@Override
	public void setId(long id) {
		_vrProductionPlantEmployee.setId(id);
	}

	/**
	* Sets the modify date of this vr production plant employee.
	*
	* @param modifyDate the modify date of this vr production plant employee
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrProductionPlantEmployee.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr production plant employee.
	*
	* @param mtCore the mt core of this vr production plant employee
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrProductionPlantEmployee.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrProductionPlantEmployee.setNew(n);
	}

	/**
	* Sets the primary key of this vr production plant employee.
	*
	* @param primaryKey the primary key of this vr production plant employee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrProductionPlantEmployee.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrProductionPlantEmployee.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production plant code of this vr production plant employee.
	*
	* @param productionPlantCode the production plant code of this vr production plant employee
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrProductionPlantEmployee.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the production plant ID of this vr production plant employee.
	*
	* @param productionPlantId the production plant ID of this vr production plant employee
	*/
	@Override
	public void setProductionPlantId(long productionPlantId) {
		_vrProductionPlantEmployee.setProductionPlantId(productionPlantId);
	}

	/**
	* Sets the sequence no of this vr production plant employee.
	*
	* @param sequenceNo the sequence no of this vr production plant employee
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrProductionPlantEmployee.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the sync date of this vr production plant employee.
	*
	* @param syncDate the sync date of this vr production plant employee
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrProductionPlantEmployee.setSyncDate(syncDate);
	}

	/**
	* Sets the trainning at of this vr production plant employee.
	*
	* @param trainningAt the trainning at of this vr production plant employee
	*/
	@Override
	public void setTrainningAt(java.lang.String trainningAt) {
		_vrProductionPlantEmployee.setTrainningAt(trainningAt);
	}

	/**
	* Sets the working position of this vr production plant employee.
	*
	* @param workingPosition the working position of this vr production plant employee
	*/
	@Override
	public void setWorkingPosition(java.lang.String workingPosition) {
		_vrProductionPlantEmployee.setWorkingPosition(workingPosition);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductionPlantEmployeeWrapper)) {
			return false;
		}

		VRProductionPlantEmployeeWrapper vrProductionPlantEmployeeWrapper = (VRProductionPlantEmployeeWrapper)obj;

		if (Objects.equals(_vrProductionPlantEmployee,
					vrProductionPlantEmployeeWrapper._vrProductionPlantEmployee)) {
			return true;
		}

		return false;
	}

	@Override
	public VRProductionPlantEmployee getWrappedModel() {
		return _vrProductionPlantEmployee;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrProductionPlantEmployee.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrProductionPlantEmployee.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrProductionPlantEmployee.resetOriginalValues();
	}

	private final VRProductionPlantEmployee _vrProductionPlantEmployee;
}