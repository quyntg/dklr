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
 * This class is a wrapper for {@link VRInputStampbook}.
 * </p>
 *
 * @author LamTV
 * @see VRInputStampbook
 * @generated
 */
@ProviderType
public class VRInputStampbookWrapper implements VRInputStampbook,
	ModelWrapper<VRInputStampbook> {
	public VRInputStampbookWrapper(VRInputStampbook vrInputStampbook) {
		_vrInputStampbook = vrInputStampbook;
	}

	@Override
	public Class<?> getModelClass() {
		return VRInputStampbook.class;
	}

	@Override
	public String getModelClassName() {
		return VRInputStampbook.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("inputSheetId", getInputSheetId());
		attributes.put("bookId", getBookId());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("stampType", getStampType());
		attributes.put("stampShortNo", getStampShortNo());
		attributes.put("serialStartNo", getSerialStartNo());
		attributes.put("serialEndNo", getSerialEndNo());
		attributes.put("subTotalInDocument", getSubTotalInDocument());
		attributes.put("subTotalQuantities", getSubTotalQuantities());
		attributes.put("units", getUnits());
		attributes.put("unitPrice", getUnitPrice());
		attributes.put("totalAmount", getTotalAmount());
		attributes.put("totalInUse", getTotalInUse());
		attributes.put("totalNotUsed", getTotalNotUsed());
		attributes.put("sum1", getSum1());
		attributes.put("sum2", getSum2());
		attributes.put("sum3", getSum3());
		attributes.put("remark", getRemark());
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

		Long inputSheetId = (Long)attributes.get("inputSheetId");

		if (inputSheetId != null) {
			setInputSheetId(inputSheetId);
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

		Long subTotalInDocument = (Long)attributes.get("subTotalInDocument");

		if (subTotalInDocument != null) {
			setSubTotalInDocument(subTotalInDocument);
		}

		Long subTotalQuantities = (Long)attributes.get("subTotalQuantities");

		if (subTotalQuantities != null) {
			setSubTotalQuantities(subTotalQuantities);
		}

		Long units = (Long)attributes.get("units");

		if (units != null) {
			setUnits(units);
		}

		Long unitPrice = (Long)attributes.get("unitPrice");

		if (unitPrice != null) {
			setUnitPrice(unitPrice);
		}

		Long totalAmount = (Long)attributes.get("totalAmount");

		if (totalAmount != null) {
			setTotalAmount(totalAmount);
		}

		Long totalInUse = (Long)attributes.get("totalInUse");

		if (totalInUse != null) {
			setTotalInUse(totalInUse);
		}

		Long totalNotUsed = (Long)attributes.get("totalNotUsed");

		if (totalNotUsed != null) {
			setTotalNotUsed(totalNotUsed);
		}

		Long sum1 = (Long)attributes.get("sum1");

		if (sum1 != null) {
			setSum1(sum1);
		}

		Long sum2 = (Long)attributes.get("sum2");

		if (sum2 != null) {
			setSum2(sum2);
		}

		Long sum3 = (Long)attributes.get("sum3");

		if (sum3 != null) {
			setSum3(sum3);
		}

		String remark = (String)attributes.get("remark");

		if (remark != null) {
			setRemark(remark);
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
	public VRInputStampbook toEscapedModel() {
		return new VRInputStampbookWrapper(_vrInputStampbook.toEscapedModel());
	}

	@Override
	public VRInputStampbook toUnescapedModel() {
		return new VRInputStampbookWrapper(_vrInputStampbook.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrInputStampbook.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrInputStampbook.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrInputStampbook.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrInputStampbook.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRInputStampbook> toCacheModel() {
		return _vrInputStampbook.toCacheModel();
	}

	@Override
	public int compareTo(VRInputStampbook vrInputStampbook) {
		return _vrInputStampbook.compareTo(vrInputStampbook);
	}

	@Override
	public int hashCode() {
		return _vrInputStampbook.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrInputStampbook.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRInputStampbookWrapper((VRInputStampbook)_vrInputStampbook.clone());
	}

	/**
	* Returns the remark of this vr input stampbook.
	*
	* @return the remark of this vr input stampbook
	*/
	@Override
	public java.lang.String getRemark() {
		return _vrInputStampbook.getRemark();
	}

	/**
	* Returns the stamp short no of this vr input stampbook.
	*
	* @return the stamp short no of this vr input stampbook
	*/
	@Override
	public java.lang.String getStampShortNo() {
		return _vrInputStampbook.getStampShortNo();
	}

	/**
	* Returns the stamp type of this vr input stampbook.
	*
	* @return the stamp type of this vr input stampbook
	*/
	@Override
	public java.lang.String getStampType() {
		return _vrInputStampbook.getStampType();
	}

	/**
	* Returns the vehicle class of this vr input stampbook.
	*
	* @return the vehicle class of this vr input stampbook
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrInputStampbook.getVehicleClass();
	}

	@Override
	public java.lang.String toString() {
		return _vrInputStampbook.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrInputStampbook.toXmlString();
	}

	/**
	* Returns the modify date of this vr input stampbook.
	*
	* @return the modify date of this vr input stampbook
	*/
	@Override
	public Date getModifyDate() {
		return _vrInputStampbook.getModifyDate();
	}

	/**
	* Returns the sync date of this vr input stampbook.
	*
	* @return the sync date of this vr input stampbook
	*/
	@Override
	public Date getSyncDate() {
		return _vrInputStampbook.getSyncDate();
	}

	/**
	* Returns the book ID of this vr input stampbook.
	*
	* @return the book ID of this vr input stampbook
	*/
	@Override
	public long getBookId() {
		return _vrInputStampbook.getBookId();
	}

	/**
	* Returns the ID of this vr input stampbook.
	*
	* @return the ID of this vr input stampbook
	*/
	@Override
	public long getId() {
		return _vrInputStampbook.getId();
	}

	/**
	* Returns the input sheet ID of this vr input stampbook.
	*
	* @return the input sheet ID of this vr input stampbook
	*/
	@Override
	public long getInputSheetId() {
		return _vrInputStampbook.getInputSheetId();
	}

	/**
	* Returns the mt core of this vr input stampbook.
	*
	* @return the mt core of this vr input stampbook
	*/
	@Override
	public long getMtCore() {
		return _vrInputStampbook.getMtCore();
	}

	/**
	* Returns the primary key of this vr input stampbook.
	*
	* @return the primary key of this vr input stampbook
	*/
	@Override
	public long getPrimaryKey() {
		return _vrInputStampbook.getPrimaryKey();
	}

	/**
	* Returns the serial end no of this vr input stampbook.
	*
	* @return the serial end no of this vr input stampbook
	*/
	@Override
	public long getSerialEndNo() {
		return _vrInputStampbook.getSerialEndNo();
	}

	/**
	* Returns the serial start no of this vr input stampbook.
	*
	* @return the serial start no of this vr input stampbook
	*/
	@Override
	public long getSerialStartNo() {
		return _vrInputStampbook.getSerialStartNo();
	}

	/**
	* Returns the sub total in document of this vr input stampbook.
	*
	* @return the sub total in document of this vr input stampbook
	*/
	@Override
	public long getSubTotalInDocument() {
		return _vrInputStampbook.getSubTotalInDocument();
	}

	/**
	* Returns the sub total quantities of this vr input stampbook.
	*
	* @return the sub total quantities of this vr input stampbook
	*/
	@Override
	public long getSubTotalQuantities() {
		return _vrInputStampbook.getSubTotalQuantities();
	}

	/**
	* Returns the sum1 of this vr input stampbook.
	*
	* @return the sum1 of this vr input stampbook
	*/
	@Override
	public long getSum1() {
		return _vrInputStampbook.getSum1();
	}

	/**
	* Returns the sum2 of this vr input stampbook.
	*
	* @return the sum2 of this vr input stampbook
	*/
	@Override
	public long getSum2() {
		return _vrInputStampbook.getSum2();
	}

	/**
	* Returns the sum3 of this vr input stampbook.
	*
	* @return the sum3 of this vr input stampbook
	*/
	@Override
	public long getSum3() {
		return _vrInputStampbook.getSum3();
	}

	/**
	* Returns the total amount of this vr input stampbook.
	*
	* @return the total amount of this vr input stampbook
	*/
	@Override
	public long getTotalAmount() {
		return _vrInputStampbook.getTotalAmount();
	}

	/**
	* Returns the total in use of this vr input stampbook.
	*
	* @return the total in use of this vr input stampbook
	*/
	@Override
	public long getTotalInUse() {
		return _vrInputStampbook.getTotalInUse();
	}

	/**
	* Returns the total not used of this vr input stampbook.
	*
	* @return the total not used of this vr input stampbook
	*/
	@Override
	public long getTotalNotUsed() {
		return _vrInputStampbook.getTotalNotUsed();
	}

	/**
	* Returns the unit price of this vr input stampbook.
	*
	* @return the unit price of this vr input stampbook
	*/
	@Override
	public long getUnitPrice() {
		return _vrInputStampbook.getUnitPrice();
	}

	/**
	* Returns the units of this vr input stampbook.
	*
	* @return the units of this vr input stampbook
	*/
	@Override
	public long getUnits() {
		return _vrInputStampbook.getUnits();
	}

	@Override
	public void persist() {
		_vrInputStampbook.persist();
	}

	/**
	* Sets the book ID of this vr input stampbook.
	*
	* @param bookId the book ID of this vr input stampbook
	*/
	@Override
	public void setBookId(long bookId) {
		_vrInputStampbook.setBookId(bookId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrInputStampbook.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrInputStampbook.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrInputStampbook.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrInputStampbook.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr input stampbook.
	*
	* @param id the ID of this vr input stampbook
	*/
	@Override
	public void setId(long id) {
		_vrInputStampbook.setId(id);
	}

	/**
	* Sets the input sheet ID of this vr input stampbook.
	*
	* @param inputSheetId the input sheet ID of this vr input stampbook
	*/
	@Override
	public void setInputSheetId(long inputSheetId) {
		_vrInputStampbook.setInputSheetId(inputSheetId);
	}

	/**
	* Sets the modify date of this vr input stampbook.
	*
	* @param modifyDate the modify date of this vr input stampbook
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrInputStampbook.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr input stampbook.
	*
	* @param mtCore the mt core of this vr input stampbook
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrInputStampbook.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrInputStampbook.setNew(n);
	}

	/**
	* Sets the primary key of this vr input stampbook.
	*
	* @param primaryKey the primary key of this vr input stampbook
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrInputStampbook.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrInputStampbook.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remark of this vr input stampbook.
	*
	* @param remark the remark of this vr input stampbook
	*/
	@Override
	public void setRemark(java.lang.String remark) {
		_vrInputStampbook.setRemark(remark);
	}

	/**
	* Sets the serial end no of this vr input stampbook.
	*
	* @param serialEndNo the serial end no of this vr input stampbook
	*/
	@Override
	public void setSerialEndNo(long serialEndNo) {
		_vrInputStampbook.setSerialEndNo(serialEndNo);
	}

	/**
	* Sets the serial start no of this vr input stampbook.
	*
	* @param serialStartNo the serial start no of this vr input stampbook
	*/
	@Override
	public void setSerialStartNo(long serialStartNo) {
		_vrInputStampbook.setSerialStartNo(serialStartNo);
	}

	/**
	* Sets the stamp short no of this vr input stampbook.
	*
	* @param stampShortNo the stamp short no of this vr input stampbook
	*/
	@Override
	public void setStampShortNo(java.lang.String stampShortNo) {
		_vrInputStampbook.setStampShortNo(stampShortNo);
	}

	/**
	* Sets the stamp type of this vr input stampbook.
	*
	* @param stampType the stamp type of this vr input stampbook
	*/
	@Override
	public void setStampType(java.lang.String stampType) {
		_vrInputStampbook.setStampType(stampType);
	}

	/**
	* Sets the sub total in document of this vr input stampbook.
	*
	* @param subTotalInDocument the sub total in document of this vr input stampbook
	*/
	@Override
	public void setSubTotalInDocument(long subTotalInDocument) {
		_vrInputStampbook.setSubTotalInDocument(subTotalInDocument);
	}

	/**
	* Sets the sub total quantities of this vr input stampbook.
	*
	* @param subTotalQuantities the sub total quantities of this vr input stampbook
	*/
	@Override
	public void setSubTotalQuantities(long subTotalQuantities) {
		_vrInputStampbook.setSubTotalQuantities(subTotalQuantities);
	}

	/**
	* Sets the sum1 of this vr input stampbook.
	*
	* @param sum1 the sum1 of this vr input stampbook
	*/
	@Override
	public void setSum1(long sum1) {
		_vrInputStampbook.setSum1(sum1);
	}

	/**
	* Sets the sum2 of this vr input stampbook.
	*
	* @param sum2 the sum2 of this vr input stampbook
	*/
	@Override
	public void setSum2(long sum2) {
		_vrInputStampbook.setSum2(sum2);
	}

	/**
	* Sets the sum3 of this vr input stampbook.
	*
	* @param sum3 the sum3 of this vr input stampbook
	*/
	@Override
	public void setSum3(long sum3) {
		_vrInputStampbook.setSum3(sum3);
	}

	/**
	* Sets the sync date of this vr input stampbook.
	*
	* @param syncDate the sync date of this vr input stampbook
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrInputStampbook.setSyncDate(syncDate);
	}

	/**
	* Sets the total amount of this vr input stampbook.
	*
	* @param totalAmount the total amount of this vr input stampbook
	*/
	@Override
	public void setTotalAmount(long totalAmount) {
		_vrInputStampbook.setTotalAmount(totalAmount);
	}

	/**
	* Sets the total in use of this vr input stampbook.
	*
	* @param totalInUse the total in use of this vr input stampbook
	*/
	@Override
	public void setTotalInUse(long totalInUse) {
		_vrInputStampbook.setTotalInUse(totalInUse);
	}

	/**
	* Sets the total not used of this vr input stampbook.
	*
	* @param totalNotUsed the total not used of this vr input stampbook
	*/
	@Override
	public void setTotalNotUsed(long totalNotUsed) {
		_vrInputStampbook.setTotalNotUsed(totalNotUsed);
	}

	/**
	* Sets the unit price of this vr input stampbook.
	*
	* @param unitPrice the unit price of this vr input stampbook
	*/
	@Override
	public void setUnitPrice(long unitPrice) {
		_vrInputStampbook.setUnitPrice(unitPrice);
	}

	/**
	* Sets the units of this vr input stampbook.
	*
	* @param units the units of this vr input stampbook
	*/
	@Override
	public void setUnits(long units) {
		_vrInputStampbook.setUnits(units);
	}

	/**
	* Sets the vehicle class of this vr input stampbook.
	*
	* @param vehicleClass the vehicle class of this vr input stampbook
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrInputStampbook.setVehicleClass(vehicleClass);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRInputStampbookWrapper)) {
			return false;
		}

		VRInputStampbookWrapper vrInputStampbookWrapper = (VRInputStampbookWrapper)obj;

		if (Objects.equals(_vrInputStampbook,
					vrInputStampbookWrapper._vrInputStampbook)) {
			return true;
		}

		return false;
	}

	@Override
	public VRInputStampbook getWrappedModel() {
		return _vrInputStampbook;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrInputStampbook.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrInputStampbook.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrInputStampbook.resetOriginalValues();
	}

	private final VRInputStampbook _vrInputStampbook;
}