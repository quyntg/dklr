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
 * This class is a wrapper for {@link VRClearingStampbook}.
 * </p>
 *
 * @author LamTV
 * @see VRClearingStampbook
 * @generated
 */
@ProviderType
public class VRClearingStampbookWrapper implements VRClearingStampbook,
	ModelWrapper<VRClearingStampbook> {
	public VRClearingStampbookWrapper(VRClearingStampbook vrClearingStampbook) {
		_vrClearingStampbook = vrClearingStampbook;
	}

	@Override
	public Class<?> getModelClass() {
		return VRClearingStampbook.class;
	}

	@Override
	public String getModelClassName() {
		return VRClearingStampbook.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("debitNoteId", getDebitNoteId());
		attributes.put("inputSheetId", getInputSheetId());
		attributes.put("outputSheetId", getOutputSheetId());
		attributes.put("bookId", getBookId());
		attributes.put("certificateId", getCertificateId());
		attributes.put("certificateNumber", getCertificateNumber());
		attributes.put("certificateDate", getCertificateDate());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("stampType", getStampType());
		attributes.put("stampShortNo", getStampShortNo());
		attributes.put("serialStartNo", getSerialStartNo());
		attributes.put("serialEndNo", getSerialEndNo());
		attributes.put("subTotalInDocument", getSubTotalInDocument());
		attributes.put("subTotalQuantities", getSubTotalQuantities());
		attributes.put("vehiclePrice", getVehiclePrice());
		attributes.put("unitPrice", getUnitPrice());
		attributes.put("totalAmount", getTotalAmount());
		attributes.put("totalInUse", getTotalInUse());
		attributes.put("totalNotUsed", getTotalNotUsed());
		attributes.put("totalLost", getTotalLost());
		attributes.put("totalCancelled", getTotalCancelled());
		attributes.put("totalReturned", getTotalReturned());
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

		Long debitNoteId = (Long)attributes.get("debitNoteId");

		if (debitNoteId != null) {
			setDebitNoteId(debitNoteId);
		}

		Long inputSheetId = (Long)attributes.get("inputSheetId");

		if (inputSheetId != null) {
			setInputSheetId(inputSheetId);
		}

		Long outputSheetId = (Long)attributes.get("outputSheetId");

		if (outputSheetId != null) {
			setOutputSheetId(outputSheetId);
		}

		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		Long certificateId = (Long)attributes.get("certificateId");

		if (certificateId != null) {
			setCertificateId(certificateId);
		}

		String certificateNumber = (String)attributes.get("certificateNumber");

		if (certificateNumber != null) {
			setCertificateNumber(certificateNumber);
		}

		Date certificateDate = (Date)attributes.get("certificateDate");

		if (certificateDate != null) {
			setCertificateDate(certificateDate);
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

		Long vehiclePrice = (Long)attributes.get("vehiclePrice");

		if (vehiclePrice != null) {
			setVehiclePrice(vehiclePrice);
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

		Long totalLost = (Long)attributes.get("totalLost");

		if (totalLost != null) {
			setTotalLost(totalLost);
		}

		Long totalCancelled = (Long)attributes.get("totalCancelled");

		if (totalCancelled != null) {
			setTotalCancelled(totalCancelled);
		}

		Long totalReturned = (Long)attributes.get("totalReturned");

		if (totalReturned != null) {
			setTotalReturned(totalReturned);
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
	public VRClearingStampbook toEscapedModel() {
		return new VRClearingStampbookWrapper(_vrClearingStampbook.toEscapedModel());
	}

	@Override
	public VRClearingStampbook toUnescapedModel() {
		return new VRClearingStampbookWrapper(_vrClearingStampbook.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrClearingStampbook.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrClearingStampbook.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrClearingStampbook.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrClearingStampbook.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRClearingStampbook> toCacheModel() {
		return _vrClearingStampbook.toCacheModel();
	}

	@Override
	public int compareTo(VRClearingStampbook vrClearingStampbook) {
		return _vrClearingStampbook.compareTo(vrClearingStampbook);
	}

	@Override
	public int hashCode() {
		return _vrClearingStampbook.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrClearingStampbook.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRClearingStampbookWrapper((VRClearingStampbook)_vrClearingStampbook.clone());
	}

	/**
	* Returns the certificate number of this vr clearing stampbook.
	*
	* @return the certificate number of this vr clearing stampbook
	*/
	@Override
	public java.lang.String getCertificateNumber() {
		return _vrClearingStampbook.getCertificateNumber();
	}

	/**
	* Returns the remark of this vr clearing stampbook.
	*
	* @return the remark of this vr clearing stampbook
	*/
	@Override
	public java.lang.String getRemark() {
		return _vrClearingStampbook.getRemark();
	}

	/**
	* Returns the stamp short no of this vr clearing stampbook.
	*
	* @return the stamp short no of this vr clearing stampbook
	*/
	@Override
	public java.lang.String getStampShortNo() {
		return _vrClearingStampbook.getStampShortNo();
	}

	/**
	* Returns the stamp type of this vr clearing stampbook.
	*
	* @return the stamp type of this vr clearing stampbook
	*/
	@Override
	public java.lang.String getStampType() {
		return _vrClearingStampbook.getStampType();
	}

	/**
	* Returns the vehicle class of this vr clearing stampbook.
	*
	* @return the vehicle class of this vr clearing stampbook
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrClearingStampbook.getVehicleClass();
	}

	@Override
	public java.lang.String toString() {
		return _vrClearingStampbook.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrClearingStampbook.toXmlString();
	}

	/**
	* Returns the certificate date of this vr clearing stampbook.
	*
	* @return the certificate date of this vr clearing stampbook
	*/
	@Override
	public Date getCertificateDate() {
		return _vrClearingStampbook.getCertificateDate();
	}

	/**
	* Returns the modify date of this vr clearing stampbook.
	*
	* @return the modify date of this vr clearing stampbook
	*/
	@Override
	public Date getModifyDate() {
		return _vrClearingStampbook.getModifyDate();
	}

	/**
	* Returns the sync date of this vr clearing stampbook.
	*
	* @return the sync date of this vr clearing stampbook
	*/
	@Override
	public Date getSyncDate() {
		return _vrClearingStampbook.getSyncDate();
	}

	/**
	* Returns the book ID of this vr clearing stampbook.
	*
	* @return the book ID of this vr clearing stampbook
	*/
	@Override
	public long getBookId() {
		return _vrClearingStampbook.getBookId();
	}

	/**
	* Returns the certificate ID of this vr clearing stampbook.
	*
	* @return the certificate ID of this vr clearing stampbook
	*/
	@Override
	public long getCertificateId() {
		return _vrClearingStampbook.getCertificateId();
	}

	/**
	* Returns the debit note ID of this vr clearing stampbook.
	*
	* @return the debit note ID of this vr clearing stampbook
	*/
	@Override
	public long getDebitNoteId() {
		return _vrClearingStampbook.getDebitNoteId();
	}

	/**
	* Returns the ID of this vr clearing stampbook.
	*
	* @return the ID of this vr clearing stampbook
	*/
	@Override
	public long getId() {
		return _vrClearingStampbook.getId();
	}

	/**
	* Returns the input sheet ID of this vr clearing stampbook.
	*
	* @return the input sheet ID of this vr clearing stampbook
	*/
	@Override
	public long getInputSheetId() {
		return _vrClearingStampbook.getInputSheetId();
	}

	/**
	* Returns the mt core of this vr clearing stampbook.
	*
	* @return the mt core of this vr clearing stampbook
	*/
	@Override
	public long getMtCore() {
		return _vrClearingStampbook.getMtCore();
	}

	/**
	* Returns the output sheet ID of this vr clearing stampbook.
	*
	* @return the output sheet ID of this vr clearing stampbook
	*/
	@Override
	public long getOutputSheetId() {
		return _vrClearingStampbook.getOutputSheetId();
	}

	/**
	* Returns the primary key of this vr clearing stampbook.
	*
	* @return the primary key of this vr clearing stampbook
	*/
	@Override
	public long getPrimaryKey() {
		return _vrClearingStampbook.getPrimaryKey();
	}

	/**
	* Returns the serial end no of this vr clearing stampbook.
	*
	* @return the serial end no of this vr clearing stampbook
	*/
	@Override
	public long getSerialEndNo() {
		return _vrClearingStampbook.getSerialEndNo();
	}

	/**
	* Returns the serial start no of this vr clearing stampbook.
	*
	* @return the serial start no of this vr clearing stampbook
	*/
	@Override
	public long getSerialStartNo() {
		return _vrClearingStampbook.getSerialStartNo();
	}

	/**
	* Returns the sub total in document of this vr clearing stampbook.
	*
	* @return the sub total in document of this vr clearing stampbook
	*/
	@Override
	public long getSubTotalInDocument() {
		return _vrClearingStampbook.getSubTotalInDocument();
	}

	/**
	* Returns the sub total quantities of this vr clearing stampbook.
	*
	* @return the sub total quantities of this vr clearing stampbook
	*/
	@Override
	public long getSubTotalQuantities() {
		return _vrClearingStampbook.getSubTotalQuantities();
	}

	/**
	* Returns the total amount of this vr clearing stampbook.
	*
	* @return the total amount of this vr clearing stampbook
	*/
	@Override
	public long getTotalAmount() {
		return _vrClearingStampbook.getTotalAmount();
	}

	/**
	* Returns the total cancelled of this vr clearing stampbook.
	*
	* @return the total cancelled of this vr clearing stampbook
	*/
	@Override
	public long getTotalCancelled() {
		return _vrClearingStampbook.getTotalCancelled();
	}

	/**
	* Returns the total in use of this vr clearing stampbook.
	*
	* @return the total in use of this vr clearing stampbook
	*/
	@Override
	public long getTotalInUse() {
		return _vrClearingStampbook.getTotalInUse();
	}

	/**
	* Returns the total lost of this vr clearing stampbook.
	*
	* @return the total lost of this vr clearing stampbook
	*/
	@Override
	public long getTotalLost() {
		return _vrClearingStampbook.getTotalLost();
	}

	/**
	* Returns the total not used of this vr clearing stampbook.
	*
	* @return the total not used of this vr clearing stampbook
	*/
	@Override
	public long getTotalNotUsed() {
		return _vrClearingStampbook.getTotalNotUsed();
	}

	/**
	* Returns the total returned of this vr clearing stampbook.
	*
	* @return the total returned of this vr clearing stampbook
	*/
	@Override
	public long getTotalReturned() {
		return _vrClearingStampbook.getTotalReturned();
	}

	/**
	* Returns the unit price of this vr clearing stampbook.
	*
	* @return the unit price of this vr clearing stampbook
	*/
	@Override
	public long getUnitPrice() {
		return _vrClearingStampbook.getUnitPrice();
	}

	/**
	* Returns the vehicle price of this vr clearing stampbook.
	*
	* @return the vehicle price of this vr clearing stampbook
	*/
	@Override
	public long getVehiclePrice() {
		return _vrClearingStampbook.getVehiclePrice();
	}

	@Override
	public void persist() {
		_vrClearingStampbook.persist();
	}

	/**
	* Sets the book ID of this vr clearing stampbook.
	*
	* @param bookId the book ID of this vr clearing stampbook
	*/
	@Override
	public void setBookId(long bookId) {
		_vrClearingStampbook.setBookId(bookId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrClearingStampbook.setCachedModel(cachedModel);
	}

	/**
	* Sets the certificate date of this vr clearing stampbook.
	*
	* @param certificateDate the certificate date of this vr clearing stampbook
	*/
	@Override
	public void setCertificateDate(Date certificateDate) {
		_vrClearingStampbook.setCertificateDate(certificateDate);
	}

	/**
	* Sets the certificate ID of this vr clearing stampbook.
	*
	* @param certificateId the certificate ID of this vr clearing stampbook
	*/
	@Override
	public void setCertificateId(long certificateId) {
		_vrClearingStampbook.setCertificateId(certificateId);
	}

	/**
	* Sets the certificate number of this vr clearing stampbook.
	*
	* @param certificateNumber the certificate number of this vr clearing stampbook
	*/
	@Override
	public void setCertificateNumber(java.lang.String certificateNumber) {
		_vrClearingStampbook.setCertificateNumber(certificateNumber);
	}

	/**
	* Sets the debit note ID of this vr clearing stampbook.
	*
	* @param debitNoteId the debit note ID of this vr clearing stampbook
	*/
	@Override
	public void setDebitNoteId(long debitNoteId) {
		_vrClearingStampbook.setDebitNoteId(debitNoteId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrClearingStampbook.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrClearingStampbook.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrClearingStampbook.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr clearing stampbook.
	*
	* @param id the ID of this vr clearing stampbook
	*/
	@Override
	public void setId(long id) {
		_vrClearingStampbook.setId(id);
	}

	/**
	* Sets the input sheet ID of this vr clearing stampbook.
	*
	* @param inputSheetId the input sheet ID of this vr clearing stampbook
	*/
	@Override
	public void setInputSheetId(long inputSheetId) {
		_vrClearingStampbook.setInputSheetId(inputSheetId);
	}

	/**
	* Sets the modify date of this vr clearing stampbook.
	*
	* @param modifyDate the modify date of this vr clearing stampbook
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrClearingStampbook.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr clearing stampbook.
	*
	* @param mtCore the mt core of this vr clearing stampbook
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrClearingStampbook.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrClearingStampbook.setNew(n);
	}

	/**
	* Sets the output sheet ID of this vr clearing stampbook.
	*
	* @param outputSheetId the output sheet ID of this vr clearing stampbook
	*/
	@Override
	public void setOutputSheetId(long outputSheetId) {
		_vrClearingStampbook.setOutputSheetId(outputSheetId);
	}

	/**
	* Sets the primary key of this vr clearing stampbook.
	*
	* @param primaryKey the primary key of this vr clearing stampbook
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrClearingStampbook.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrClearingStampbook.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remark of this vr clearing stampbook.
	*
	* @param remark the remark of this vr clearing stampbook
	*/
	@Override
	public void setRemark(java.lang.String remark) {
		_vrClearingStampbook.setRemark(remark);
	}

	/**
	* Sets the serial end no of this vr clearing stampbook.
	*
	* @param serialEndNo the serial end no of this vr clearing stampbook
	*/
	@Override
	public void setSerialEndNo(long serialEndNo) {
		_vrClearingStampbook.setSerialEndNo(serialEndNo);
	}

	/**
	* Sets the serial start no of this vr clearing stampbook.
	*
	* @param serialStartNo the serial start no of this vr clearing stampbook
	*/
	@Override
	public void setSerialStartNo(long serialStartNo) {
		_vrClearingStampbook.setSerialStartNo(serialStartNo);
	}

	/**
	* Sets the stamp short no of this vr clearing stampbook.
	*
	* @param stampShortNo the stamp short no of this vr clearing stampbook
	*/
	@Override
	public void setStampShortNo(java.lang.String stampShortNo) {
		_vrClearingStampbook.setStampShortNo(stampShortNo);
	}

	/**
	* Sets the stamp type of this vr clearing stampbook.
	*
	* @param stampType the stamp type of this vr clearing stampbook
	*/
	@Override
	public void setStampType(java.lang.String stampType) {
		_vrClearingStampbook.setStampType(stampType);
	}

	/**
	* Sets the sub total in document of this vr clearing stampbook.
	*
	* @param subTotalInDocument the sub total in document of this vr clearing stampbook
	*/
	@Override
	public void setSubTotalInDocument(long subTotalInDocument) {
		_vrClearingStampbook.setSubTotalInDocument(subTotalInDocument);
	}

	/**
	* Sets the sub total quantities of this vr clearing stampbook.
	*
	* @param subTotalQuantities the sub total quantities of this vr clearing stampbook
	*/
	@Override
	public void setSubTotalQuantities(long subTotalQuantities) {
		_vrClearingStampbook.setSubTotalQuantities(subTotalQuantities);
	}

	/**
	* Sets the sync date of this vr clearing stampbook.
	*
	* @param syncDate the sync date of this vr clearing stampbook
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrClearingStampbook.setSyncDate(syncDate);
	}

	/**
	* Sets the total amount of this vr clearing stampbook.
	*
	* @param totalAmount the total amount of this vr clearing stampbook
	*/
	@Override
	public void setTotalAmount(long totalAmount) {
		_vrClearingStampbook.setTotalAmount(totalAmount);
	}

	/**
	* Sets the total cancelled of this vr clearing stampbook.
	*
	* @param totalCancelled the total cancelled of this vr clearing stampbook
	*/
	@Override
	public void setTotalCancelled(long totalCancelled) {
		_vrClearingStampbook.setTotalCancelled(totalCancelled);
	}

	/**
	* Sets the total in use of this vr clearing stampbook.
	*
	* @param totalInUse the total in use of this vr clearing stampbook
	*/
	@Override
	public void setTotalInUse(long totalInUse) {
		_vrClearingStampbook.setTotalInUse(totalInUse);
	}

	/**
	* Sets the total lost of this vr clearing stampbook.
	*
	* @param totalLost the total lost of this vr clearing stampbook
	*/
	@Override
	public void setTotalLost(long totalLost) {
		_vrClearingStampbook.setTotalLost(totalLost);
	}

	/**
	* Sets the total not used of this vr clearing stampbook.
	*
	* @param totalNotUsed the total not used of this vr clearing stampbook
	*/
	@Override
	public void setTotalNotUsed(long totalNotUsed) {
		_vrClearingStampbook.setTotalNotUsed(totalNotUsed);
	}

	/**
	* Sets the total returned of this vr clearing stampbook.
	*
	* @param totalReturned the total returned of this vr clearing stampbook
	*/
	@Override
	public void setTotalReturned(long totalReturned) {
		_vrClearingStampbook.setTotalReturned(totalReturned);
	}

	/**
	* Sets the unit price of this vr clearing stampbook.
	*
	* @param unitPrice the unit price of this vr clearing stampbook
	*/
	@Override
	public void setUnitPrice(long unitPrice) {
		_vrClearingStampbook.setUnitPrice(unitPrice);
	}

	/**
	* Sets the vehicle class of this vr clearing stampbook.
	*
	* @param vehicleClass the vehicle class of this vr clearing stampbook
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrClearingStampbook.setVehicleClass(vehicleClass);
	}

	/**
	* Sets the vehicle price of this vr clearing stampbook.
	*
	* @param vehiclePrice the vehicle price of this vr clearing stampbook
	*/
	@Override
	public void setVehiclePrice(long vehiclePrice) {
		_vrClearingStampbook.setVehiclePrice(vehiclePrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRClearingStampbookWrapper)) {
			return false;
		}

		VRClearingStampbookWrapper vrClearingStampbookWrapper = (VRClearingStampbookWrapper)obj;

		if (Objects.equals(_vrClearingStampbook,
					vrClearingStampbookWrapper._vrClearingStampbook)) {
			return true;
		}

		return false;
	}

	@Override
	public VRClearingStampbook getWrappedModel() {
		return _vrClearingStampbook;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrClearingStampbook.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrClearingStampbook.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrClearingStampbook.resetOriginalValues();
	}

	private final VRClearingStampbook _vrClearingStampbook;
}