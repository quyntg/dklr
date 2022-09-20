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
 * This class is a wrapper for {@link VRProductionPlantSupplier}.
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantSupplier
 * @generated
 */
@ProviderType
public class VRProductionPlantSupplierWrapper
	implements VRProductionPlantSupplier,
		ModelWrapper<VRProductionPlantSupplier> {
	public VRProductionPlantSupplierWrapper(
		VRProductionPlantSupplier vrProductionPlantSupplier) {
		_vrProductionPlantSupplier = vrProductionPlantSupplier;
	}

	@Override
	public Class<?> getModelClass() {
		return VRProductionPlantSupplier.class;
	}

	@Override
	public String getModelClassName() {
		return VRProductionPlantSupplier.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("corporationCode", getCorporationCode());
		attributes.put("corporationName", getCorporationName());
		attributes.put("corporationAddress", getCorporationAddress());
		attributes.put("productionPlantCode", getProductionPlantCode());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());
		attributes.put("productionPlantId", getProductionPlantId());
		attributes.put("applicantProfileId", getApplicantProfileId());
		attributes.put("applicantCode", getApplicantCode());
		attributes.put("supplierId", getSupplierId());
		attributes.put("supplierName", getSupplierName());
		attributes.put("supplierAddress", getSupplierAddress());

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

		String corporationCode = (String)attributes.get("corporationCode");

		if (corporationCode != null) {
			setCorporationCode(corporationCode);
		}

		String corporationName = (String)attributes.get("corporationName");

		if (corporationName != null) {
			setCorporationName(corporationName);
		}

		String corporationAddress = (String)attributes.get("corporationAddress");

		if (corporationAddress != null) {
			setCorporationAddress(corporationAddress);
		}

		String productionPlantCode = (String)attributes.get(
				"productionPlantCode");

		if (productionPlantCode != null) {
			setProductionPlantCode(productionPlantCode);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}

		Long productionPlantId = (Long)attributes.get("productionPlantId");

		if (productionPlantId != null) {
			setProductionPlantId(productionPlantId);
		}

		Long applicantProfileId = (Long)attributes.get("applicantProfileId");

		if (applicantProfileId != null) {
			setApplicantProfileId(applicantProfileId);
		}

		String applicantCode = (String)attributes.get("applicantCode");

		if (applicantCode != null) {
			setApplicantCode(applicantCode);
		}

		Long supplierId = (Long)attributes.get("supplierId");

		if (supplierId != null) {
			setSupplierId(supplierId);
		}

		String supplierName = (String)attributes.get("supplierName");

		if (supplierName != null) {
			setSupplierName(supplierName);
		}

		String supplierAddress = (String)attributes.get("supplierAddress");

		if (supplierAddress != null) {
			setSupplierAddress(supplierAddress);
		}
	}

	@Override
	public VRProductionPlantSupplier toEscapedModel() {
		return new VRProductionPlantSupplierWrapper(_vrProductionPlantSupplier.toEscapedModel());
	}

	@Override
	public VRProductionPlantSupplier toUnescapedModel() {
		return new VRProductionPlantSupplierWrapper(_vrProductionPlantSupplier.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrProductionPlantSupplier.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrProductionPlantSupplier.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrProductionPlantSupplier.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrProductionPlantSupplier.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRProductionPlantSupplier> toCacheModel() {
		return _vrProductionPlantSupplier.toCacheModel();
	}

	@Override
	public int compareTo(VRProductionPlantSupplier vrProductionPlantSupplier) {
		return _vrProductionPlantSupplier.compareTo(vrProductionPlantSupplier);
	}

	@Override
	public int hashCode() {
		return _vrProductionPlantSupplier.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrProductionPlantSupplier.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRProductionPlantSupplierWrapper((VRProductionPlantSupplier)_vrProductionPlantSupplier.clone());
	}

	/**
	* Returns the applicant code of this vr production plant supplier.
	*
	* @return the applicant code of this vr production plant supplier
	*/
	@Override
	public java.lang.String getApplicantCode() {
		return _vrProductionPlantSupplier.getApplicantCode();
	}

	/**
	* Returns the corporation address of this vr production plant supplier.
	*
	* @return the corporation address of this vr production plant supplier
	*/
	@Override
	public java.lang.String getCorporationAddress() {
		return _vrProductionPlantSupplier.getCorporationAddress();
	}

	/**
	* Returns the corporation code of this vr production plant supplier.
	*
	* @return the corporation code of this vr production plant supplier
	*/
	@Override
	public java.lang.String getCorporationCode() {
		return _vrProductionPlantSupplier.getCorporationCode();
	}

	/**
	* Returns the corporation name of this vr production plant supplier.
	*
	* @return the corporation name of this vr production plant supplier
	*/
	@Override
	public java.lang.String getCorporationName() {
		return _vrProductionPlantSupplier.getCorporationName();
	}

	/**
	* Returns the production plant code of this vr production plant supplier.
	*
	* @return the production plant code of this vr production plant supplier
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrProductionPlantSupplier.getProductionPlantCode();
	}

	/**
	* Returns the supplier address of this vr production plant supplier.
	*
	* @return the supplier address of this vr production plant supplier
	*/
	@Override
	public java.lang.String getSupplierAddress() {
		return _vrProductionPlantSupplier.getSupplierAddress();
	}

	/**
	* Returns the supplier name of this vr production plant supplier.
	*
	* @return the supplier name of this vr production plant supplier
	*/
	@Override
	public java.lang.String getSupplierName() {
		return _vrProductionPlantSupplier.getSupplierName();
	}

	@Override
	public java.lang.String toString() {
		return _vrProductionPlantSupplier.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrProductionPlantSupplier.toXmlString();
	}

	/**
	* Returns the modify date of this vr production plant supplier.
	*
	* @return the modify date of this vr production plant supplier
	*/
	@Override
	public Date getModifyDate() {
		return _vrProductionPlantSupplier.getModifyDate();
	}

	/**
	* Returns the sync date of this vr production plant supplier.
	*
	* @return the sync date of this vr production plant supplier
	*/
	@Override
	public Date getSyncDate() {
		return _vrProductionPlantSupplier.getSyncDate();
	}

	/**
	* Returns the applicant profile ID of this vr production plant supplier.
	*
	* @return the applicant profile ID of this vr production plant supplier
	*/
	@Override
	public long getApplicantProfileId() {
		return _vrProductionPlantSupplier.getApplicantProfileId();
	}

	/**
	* Returns the ID of this vr production plant supplier.
	*
	* @return the ID of this vr production plant supplier
	*/
	@Override
	public long getId() {
		return _vrProductionPlantSupplier.getId();
	}

	/**
	* Returns the mt core of this vr production plant supplier.
	*
	* @return the mt core of this vr production plant supplier
	*/
	@Override
	public long getMtCore() {
		return _vrProductionPlantSupplier.getMtCore();
	}

	/**
	* Returns the primary key of this vr production plant supplier.
	*
	* @return the primary key of this vr production plant supplier
	*/
	@Override
	public long getPrimaryKey() {
		return _vrProductionPlantSupplier.getPrimaryKey();
	}

	/**
	* Returns the production plant ID of this vr production plant supplier.
	*
	* @return the production plant ID of this vr production plant supplier
	*/
	@Override
	public long getProductionPlantId() {
		return _vrProductionPlantSupplier.getProductionPlantId();
	}

	/**
	* Returns the supplier ID of this vr production plant supplier.
	*
	* @return the supplier ID of this vr production plant supplier
	*/
	@Override
	public long getSupplierId() {
		return _vrProductionPlantSupplier.getSupplierId();
	}

	@Override
	public void persist() {
		_vrProductionPlantSupplier.persist();
	}

	/**
	* Sets the applicant code of this vr production plant supplier.
	*
	* @param applicantCode the applicant code of this vr production plant supplier
	*/
	@Override
	public void setApplicantCode(java.lang.String applicantCode) {
		_vrProductionPlantSupplier.setApplicantCode(applicantCode);
	}

	/**
	* Sets the applicant profile ID of this vr production plant supplier.
	*
	* @param applicantProfileId the applicant profile ID of this vr production plant supplier
	*/
	@Override
	public void setApplicantProfileId(long applicantProfileId) {
		_vrProductionPlantSupplier.setApplicantProfileId(applicantProfileId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrProductionPlantSupplier.setCachedModel(cachedModel);
	}

	/**
	* Sets the corporation address of this vr production plant supplier.
	*
	* @param corporationAddress the corporation address of this vr production plant supplier
	*/
	@Override
	public void setCorporationAddress(java.lang.String corporationAddress) {
		_vrProductionPlantSupplier.setCorporationAddress(corporationAddress);
	}

	/**
	* Sets the corporation code of this vr production plant supplier.
	*
	* @param corporationCode the corporation code of this vr production plant supplier
	*/
	@Override
	public void setCorporationCode(java.lang.String corporationCode) {
		_vrProductionPlantSupplier.setCorporationCode(corporationCode);
	}

	/**
	* Sets the corporation name of this vr production plant supplier.
	*
	* @param corporationName the corporation name of this vr production plant supplier
	*/
	@Override
	public void setCorporationName(java.lang.String corporationName) {
		_vrProductionPlantSupplier.setCorporationName(corporationName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrProductionPlantSupplier.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrProductionPlantSupplier.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrProductionPlantSupplier.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr production plant supplier.
	*
	* @param id the ID of this vr production plant supplier
	*/
	@Override
	public void setId(long id) {
		_vrProductionPlantSupplier.setId(id);
	}

	/**
	* Sets the modify date of this vr production plant supplier.
	*
	* @param modifyDate the modify date of this vr production plant supplier
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrProductionPlantSupplier.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr production plant supplier.
	*
	* @param mtCore the mt core of this vr production plant supplier
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrProductionPlantSupplier.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrProductionPlantSupplier.setNew(n);
	}

	/**
	* Sets the primary key of this vr production plant supplier.
	*
	* @param primaryKey the primary key of this vr production plant supplier
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrProductionPlantSupplier.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrProductionPlantSupplier.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production plant code of this vr production plant supplier.
	*
	* @param productionPlantCode the production plant code of this vr production plant supplier
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrProductionPlantSupplier.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the production plant ID of this vr production plant supplier.
	*
	* @param productionPlantId the production plant ID of this vr production plant supplier
	*/
	@Override
	public void setProductionPlantId(long productionPlantId) {
		_vrProductionPlantSupplier.setProductionPlantId(productionPlantId);
	}

	/**
	* Sets the supplier address of this vr production plant supplier.
	*
	* @param supplierAddress the supplier address of this vr production plant supplier
	*/
	@Override
	public void setSupplierAddress(java.lang.String supplierAddress) {
		_vrProductionPlantSupplier.setSupplierAddress(supplierAddress);
	}

	/**
	* Sets the supplier ID of this vr production plant supplier.
	*
	* @param supplierId the supplier ID of this vr production plant supplier
	*/
	@Override
	public void setSupplierId(long supplierId) {
		_vrProductionPlantSupplier.setSupplierId(supplierId);
	}

	/**
	* Sets the supplier name of this vr production plant supplier.
	*
	* @param supplierName the supplier name of this vr production plant supplier
	*/
	@Override
	public void setSupplierName(java.lang.String supplierName) {
		_vrProductionPlantSupplier.setSupplierName(supplierName);
	}

	/**
	* Sets the sync date of this vr production plant supplier.
	*
	* @param syncDate the sync date of this vr production plant supplier
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrProductionPlantSupplier.setSyncDate(syncDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductionPlantSupplierWrapper)) {
			return false;
		}

		VRProductionPlantSupplierWrapper vrProductionPlantSupplierWrapper = (VRProductionPlantSupplierWrapper)obj;

		if (Objects.equals(_vrProductionPlantSupplier,
					vrProductionPlantSupplierWrapper._vrProductionPlantSupplier)) {
			return true;
		}

		return false;
	}

	@Override
	public VRProductionPlantSupplier getWrappedModel() {
		return _vrProductionPlantSupplier;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrProductionPlantSupplier.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrProductionPlantSupplier.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrProductionPlantSupplier.resetOriginalValues();
	}

	private final VRProductionPlantSupplier _vrProductionPlantSupplier;
}