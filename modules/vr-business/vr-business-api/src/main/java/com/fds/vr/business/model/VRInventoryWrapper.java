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
 * This class is a wrapper for {@link VRInventory}.
 * </p>
 *
 * @author LamTV
 * @see VRInventory
 * @generated
 */
@ProviderType
public class VRInventoryWrapper implements VRInventory,
	ModelWrapper<VRInventory> {
	public VRInventoryWrapper(VRInventory vrInventory) {
		_vrInventory = vrInventory;
	}

	@Override
	public Class<?> getModelClass() {
		return VRInventory.class;
	}

	@Override
	public String getModelClassName() {
		return VRInventory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("yearofPeriod", getYearofPeriod());
		attributes.put("previousPeriod", getPreviousPeriod());
		attributes.put("previousPeriodCode", getPreviousPeriodCode());
		attributes.put("bookId", getBookId());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("stampType", getStampType());
		attributes.put("stampShortNo", getStampShortNo());
		attributes.put("serialStartNo", getSerialStartNo());
		attributes.put("serialEndNo", getSerialEndNo());
		attributes.put("totalQuantities", getTotalQuantities());
		attributes.put("totalInUse", getTotalInUse());
		attributes.put("totalNotUsed", getTotalNotUsed());
		attributes.put("remark", getRemark());
		attributes.put("corporationId", getCorporationId());
		attributes.put("checkType", getCheckType());
		attributes.put("checkStatus", getCheckStatus());
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

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long yearofPeriod = (Long)attributes.get("yearofPeriod");

		if (yearofPeriod != null) {
			setYearofPeriod(yearofPeriod);
		}

		String previousPeriod = (String)attributes.get("previousPeriod");

		if (previousPeriod != null) {
			setPreviousPeriod(previousPeriod);
		}

		String previousPeriodCode = (String)attributes.get("previousPeriodCode");

		if (previousPeriodCode != null) {
			setPreviousPeriodCode(previousPeriodCode);
		}

		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		String stampType = (String)attributes.get("stampType");

		if (stampType != null) {
			setStampType(stampType);
		}

		String stampShortNo = (String)attributes.get("stampShortNo");

		if (stampShortNo != null) {
			setStampShortNo(stampShortNo);
		}

		Long serialStartNo = (Long)attributes.get("serialStartNo");

		if (serialStartNo != null) {
			setSerialStartNo(serialStartNo);
		}

		Long serialEndNo = (Long)attributes.get("serialEndNo");

		if (serialEndNo != null) {
			setSerialEndNo(serialEndNo);
		}

		Long totalQuantities = (Long)attributes.get("totalQuantities");

		if (totalQuantities != null) {
			setTotalQuantities(totalQuantities);
		}

		Long totalInUse = (Long)attributes.get("totalInUse");

		if (totalInUse != null) {
			setTotalInUse(totalInUse);
		}

		Long totalNotUsed = (Long)attributes.get("totalNotUsed");

		if (totalNotUsed != null) {
			setTotalNotUsed(totalNotUsed);
		}

		String remark = (String)attributes.get("remark");

		if (remark != null) {
			setRemark(remark);
		}

		Long corporationId = (Long)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		Long checkType = (Long)attributes.get("checkType");

		if (checkType != null) {
			setCheckType(checkType);
		}

		Long checkStatus = (Long)attributes.get("checkStatus");

		if (checkStatus != null) {
			setCheckStatus(checkStatus);
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
	public VRInventory toEscapedModel() {
		return new VRInventoryWrapper(_vrInventory.toEscapedModel());
	}

	@Override
	public VRInventory toUnescapedModel() {
		return new VRInventoryWrapper(_vrInventory.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrInventory.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrInventory.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrInventory.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrInventory.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRInventory> toCacheModel() {
		return _vrInventory.toCacheModel();
	}

	@Override
	public int compareTo(VRInventory vrInventory) {
		return _vrInventory.compareTo(vrInventory);
	}

	@Override
	public int hashCode() {
		return _vrInventory.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrInventory.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRInventoryWrapper((VRInventory)_vrInventory.clone());
	}

	/**
	* Returns the previous period of this vr inventory.
	*
	* @return the previous period of this vr inventory
	*/
	@Override
	public java.lang.String getPreviousPeriod() {
		return _vrInventory.getPreviousPeriod();
	}

	/**
	* Returns the previous period code of this vr inventory.
	*
	* @return the previous period code of this vr inventory
	*/
	@Override
	public java.lang.String getPreviousPeriodCode() {
		return _vrInventory.getPreviousPeriodCode();
	}

	/**
	* Returns the remark of this vr inventory.
	*
	* @return the remark of this vr inventory
	*/
	@Override
	public java.lang.String getRemark() {
		return _vrInventory.getRemark();
	}

	/**
	* Returns the stamp short no of this vr inventory.
	*
	* @return the stamp short no of this vr inventory
	*/
	@Override
	public java.lang.String getStampShortNo() {
		return _vrInventory.getStampShortNo();
	}

	/**
	* Returns the stamp type of this vr inventory.
	*
	* @return the stamp type of this vr inventory
	*/
	@Override
	public java.lang.String getStampType() {
		return _vrInventory.getStampType();
	}

	/**
	* Returns the vehicle class of this vr inventory.
	*
	* @return the vehicle class of this vr inventory
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrInventory.getVehicleClass();
	}

	@Override
	public java.lang.String toString() {
		return _vrInventory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrInventory.toXmlString();
	}

	/**
	* Returns the modify date of this vr inventory.
	*
	* @return the modify date of this vr inventory
	*/
	@Override
	public Date getModifyDate() {
		return _vrInventory.getModifyDate();
	}

	/**
	* Returns the sync date of this vr inventory.
	*
	* @return the sync date of this vr inventory
	*/
	@Override
	public Date getSyncDate() {
		return _vrInventory.getSyncDate();
	}

	/**
	* Returns the book ID of this vr inventory.
	*
	* @return the book ID of this vr inventory
	*/
	@Override
	public long getBookId() {
		return _vrInventory.getBookId();
	}

	/**
	* Returns the check status of this vr inventory.
	*
	* @return the check status of this vr inventory
	*/
	@Override
	public long getCheckStatus() {
		return _vrInventory.getCheckStatus();
	}

	/**
	* Returns the check type of this vr inventory.
	*
	* @return the check type of this vr inventory
	*/
	@Override
	public long getCheckType() {
		return _vrInventory.getCheckType();
	}

	/**
	* Returns the corporation ID of this vr inventory.
	*
	* @return the corporation ID of this vr inventory
	*/
	@Override
	public long getCorporationId() {
		return _vrInventory.getCorporationId();
	}

	/**
	* Returns the ID of this vr inventory.
	*
	* @return the ID of this vr inventory
	*/
	@Override
	public long getId() {
		return _vrInventory.getId();
	}

	/**
	* Returns the mt core of this vr inventory.
	*
	* @return the mt core of this vr inventory
	*/
	@Override
	public long getMtCore() {
		return _vrInventory.getMtCore();
	}

	/**
	* Returns the primary key of this vr inventory.
	*
	* @return the primary key of this vr inventory
	*/
	@Override
	public long getPrimaryKey() {
		return _vrInventory.getPrimaryKey();
	}

	/**
	* Returns the serial end no of this vr inventory.
	*
	* @return the serial end no of this vr inventory
	*/
	@Override
	public long getSerialEndNo() {
		return _vrInventory.getSerialEndNo();
	}

	/**
	* Returns the serial start no of this vr inventory.
	*
	* @return the serial start no of this vr inventory
	*/
	@Override
	public long getSerialStartNo() {
		return _vrInventory.getSerialStartNo();
	}

	/**
	* Returns the total in use of this vr inventory.
	*
	* @return the total in use of this vr inventory
	*/
	@Override
	public long getTotalInUse() {
		return _vrInventory.getTotalInUse();
	}

	/**
	* Returns the total not used of this vr inventory.
	*
	* @return the total not used of this vr inventory
	*/
	@Override
	public long getTotalNotUsed() {
		return _vrInventory.getTotalNotUsed();
	}

	/**
	* Returns the total quantities of this vr inventory.
	*
	* @return the total quantities of this vr inventory
	*/
	@Override
	public long getTotalQuantities() {
		return _vrInventory.getTotalQuantities();
	}

	/**
	* Returns the yearof period of this vr inventory.
	*
	* @return the yearof period of this vr inventory
	*/
	@Override
	public long getYearofPeriod() {
		return _vrInventory.getYearofPeriod();
	}

	@Override
	public void persist() {
		_vrInventory.persist();
	}

	/**
	* Sets the book ID of this vr inventory.
	*
	* @param bookId the book ID of this vr inventory
	*/
	@Override
	public void setBookId(long bookId) {
		_vrInventory.setBookId(bookId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrInventory.setCachedModel(cachedModel);
	}

	/**
	* Sets the check status of this vr inventory.
	*
	* @param checkStatus the check status of this vr inventory
	*/
	@Override
	public void setCheckStatus(long checkStatus) {
		_vrInventory.setCheckStatus(checkStatus);
	}

	/**
	* Sets the check type of this vr inventory.
	*
	* @param checkType the check type of this vr inventory
	*/
	@Override
	public void setCheckType(long checkType) {
		_vrInventory.setCheckType(checkType);
	}

	/**
	* Sets the corporation ID of this vr inventory.
	*
	* @param corporationId the corporation ID of this vr inventory
	*/
	@Override
	public void setCorporationId(long corporationId) {
		_vrInventory.setCorporationId(corporationId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrInventory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrInventory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrInventory.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr inventory.
	*
	* @param id the ID of this vr inventory
	*/
	@Override
	public void setId(long id) {
		_vrInventory.setId(id);
	}

	/**
	* Sets the modify date of this vr inventory.
	*
	* @param modifyDate the modify date of this vr inventory
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrInventory.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr inventory.
	*
	* @param mtCore the mt core of this vr inventory
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrInventory.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrInventory.setNew(n);
	}

	/**
	* Sets the previous period of this vr inventory.
	*
	* @param previousPeriod the previous period of this vr inventory
	*/
	@Override
	public void setPreviousPeriod(java.lang.String previousPeriod) {
		_vrInventory.setPreviousPeriod(previousPeriod);
	}

	/**
	* Sets the previous period code of this vr inventory.
	*
	* @param previousPeriodCode the previous period code of this vr inventory
	*/
	@Override
	public void setPreviousPeriodCode(java.lang.String previousPeriodCode) {
		_vrInventory.setPreviousPeriodCode(previousPeriodCode);
	}

	/**
	* Sets the primary key of this vr inventory.
	*
	* @param primaryKey the primary key of this vr inventory
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrInventory.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrInventory.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remark of this vr inventory.
	*
	* @param remark the remark of this vr inventory
	*/
	@Override
	public void setRemark(java.lang.String remark) {
		_vrInventory.setRemark(remark);
	}

	/**
	* Sets the serial end no of this vr inventory.
	*
	* @param serialEndNo the serial end no of this vr inventory
	*/
	@Override
	public void setSerialEndNo(long serialEndNo) {
		_vrInventory.setSerialEndNo(serialEndNo);
	}

	/**
	* Sets the serial start no of this vr inventory.
	*
	* @param serialStartNo the serial start no of this vr inventory
	*/
	@Override
	public void setSerialStartNo(long serialStartNo) {
		_vrInventory.setSerialStartNo(serialStartNo);
	}

	/**
	* Sets the stamp short no of this vr inventory.
	*
	* @param stampShortNo the stamp short no of this vr inventory
	*/
	@Override
	public void setStampShortNo(java.lang.String stampShortNo) {
		_vrInventory.setStampShortNo(stampShortNo);
	}

	/**
	* Sets the stamp type of this vr inventory.
	*
	* @param stampType the stamp type of this vr inventory
	*/
	@Override
	public void setStampType(java.lang.String stampType) {
		_vrInventory.setStampType(stampType);
	}

	/**
	* Sets the sync date of this vr inventory.
	*
	* @param syncDate the sync date of this vr inventory
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrInventory.setSyncDate(syncDate);
	}

	/**
	* Sets the total in use of this vr inventory.
	*
	* @param totalInUse the total in use of this vr inventory
	*/
	@Override
	public void setTotalInUse(long totalInUse) {
		_vrInventory.setTotalInUse(totalInUse);
	}

	/**
	* Sets the total not used of this vr inventory.
	*
	* @param totalNotUsed the total not used of this vr inventory
	*/
	@Override
	public void setTotalNotUsed(long totalNotUsed) {
		_vrInventory.setTotalNotUsed(totalNotUsed);
	}

	/**
	* Sets the total quantities of this vr inventory.
	*
	* @param totalQuantities the total quantities of this vr inventory
	*/
	@Override
	public void setTotalQuantities(long totalQuantities) {
		_vrInventory.setTotalQuantities(totalQuantities);
	}

	/**
	* Sets the vehicle class of this vr inventory.
	*
	* @param vehicleClass the vehicle class of this vr inventory
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrInventory.setVehicleClass(vehicleClass);
	}

	/**
	* Sets the yearof period of this vr inventory.
	*
	* @param yearofPeriod the yearof period of this vr inventory
	*/
	@Override
	public void setYearofPeriod(long yearofPeriod) {
		_vrInventory.setYearofPeriod(yearofPeriod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRInventoryWrapper)) {
			return false;
		}

		VRInventoryWrapper vrInventoryWrapper = (VRInventoryWrapper)obj;

		if (Objects.equals(_vrInventory, vrInventoryWrapper._vrInventory)) {
			return true;
		}

		return false;
	}

	@Override
	public VRInventory getWrappedModel() {
		return _vrInventory;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrInventory.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrInventory.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrInventory.resetOriginalValues();
	}

	private final VRInventory _vrInventory;
}