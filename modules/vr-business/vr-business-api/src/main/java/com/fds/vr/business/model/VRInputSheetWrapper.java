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
 * This class is a wrapper for {@link VRInputSheet}.
 * </p>
 *
 * @author LamTV
 * @see VRInputSheet
 * @generated
 */
@ProviderType
public class VRInputSheetWrapper implements VRInputSheet,
	ModelWrapper<VRInputSheet> {
	public VRInputSheetWrapper(VRInputSheet vrInputSheet) {
		_vrInputSheet = vrInputSheet;
	}

	@Override
	public Class<?> getModelClass() {
		return VRInputSheet.class;
	}

	@Override
	public String getModelClassName() {
		return VRInputSheet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("inputSheetNo", getInputSheetNo());
		attributes.put("inputSheetDate", getInputSheetDate());
		attributes.put("originalDocumentNo", getOriginalDocumentNo());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inputSheetType", getInputSheetType());
		attributes.put("maker", getMaker());
		attributes.put("checker", getChecker());
		attributes.put("approver", getApprover());
		attributes.put("deliveryName", getDeliveryName());
		attributes.put("inventoryName", getInventoryName());
		attributes.put("inventoryPlace", getInventoryPlace());
		attributes.put("inventoryDate", getInventoryDate());
		attributes.put("bookIDList", getBookIDList());
		attributes.put("isApproval", getIsApproval());
		attributes.put("totalQuantities", getTotalQuantities());
		attributes.put("totalAmount", getTotalAmount());
		attributes.put("amountInWords", getAmountInWords());
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

		String inputSheetNo = (String)attributes.get("inputSheetNo");

		if (inputSheetNo != null) {
			setInputSheetNo(inputSheetNo);
		}

		Date inputSheetDate = (Date)attributes.get("inputSheetDate");

		if (inputSheetDate != null) {
			setInputSheetDate(inputSheetDate);
		}

		String originalDocumentNo = (String)attributes.get("originalDocumentNo");

		if (originalDocumentNo != null) {
			setOriginalDocumentNo(originalDocumentNo);
		}

		Long corporationId = (Long)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		Long inputSheetType = (Long)attributes.get("inputSheetType");

		if (inputSheetType != null) {
			setInputSheetType(inputSheetType);
		}

		String maker = (String)attributes.get("maker");

		if (maker != null) {
			setMaker(maker);
		}

		String checker = (String)attributes.get("checker");

		if (checker != null) {
			setChecker(checker);
		}

		String approver = (String)attributes.get("approver");

		if (approver != null) {
			setApprover(approver);
		}

		String deliveryName = (String)attributes.get("deliveryName");

		if (deliveryName != null) {
			setDeliveryName(deliveryName);
		}

		String inventoryName = (String)attributes.get("inventoryName");

		if (inventoryName != null) {
			setInventoryName(inventoryName);
		}

		String inventoryPlace = (String)attributes.get("inventoryPlace");

		if (inventoryPlace != null) {
			setInventoryPlace(inventoryPlace);
		}

		Date inventoryDate = (Date)attributes.get("inventoryDate");

		if (inventoryDate != null) {
			setInventoryDate(inventoryDate);
		}

		String bookIDList = (String)attributes.get("bookIDList");

		if (bookIDList != null) {
			setBookIDList(bookIDList);
		}

		Long isApproval = (Long)attributes.get("isApproval");

		if (isApproval != null) {
			setIsApproval(isApproval);
		}

		Long totalQuantities = (Long)attributes.get("totalQuantities");

		if (totalQuantities != null) {
			setTotalQuantities(totalQuantities);
		}

		Long totalAmount = (Long)attributes.get("totalAmount");

		if (totalAmount != null) {
			setTotalAmount(totalAmount);
		}

		String amountInWords = (String)attributes.get("amountInWords");

		if (amountInWords != null) {
			setAmountInWords(amountInWords);
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
	public VRInputSheet toEscapedModel() {
		return new VRInputSheetWrapper(_vrInputSheet.toEscapedModel());
	}

	@Override
	public VRInputSheet toUnescapedModel() {
		return new VRInputSheetWrapper(_vrInputSheet.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrInputSheet.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrInputSheet.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrInputSheet.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrInputSheet.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRInputSheet> toCacheModel() {
		return _vrInputSheet.toCacheModel();
	}

	@Override
	public int compareTo(VRInputSheet vrInputSheet) {
		return _vrInputSheet.compareTo(vrInputSheet);
	}

	@Override
	public int hashCode() {
		return _vrInputSheet.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrInputSheet.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRInputSheetWrapper((VRInputSheet)_vrInputSheet.clone());
	}

	/**
	* Returns the amount in words of this vr input sheet.
	*
	* @return the amount in words of this vr input sheet
	*/
	@Override
	public java.lang.String getAmountInWords() {
		return _vrInputSheet.getAmountInWords();
	}

	/**
	* Returns the approver of this vr input sheet.
	*
	* @return the approver of this vr input sheet
	*/
	@Override
	public java.lang.String getApprover() {
		return _vrInputSheet.getApprover();
	}

	/**
	* Returns the book ID list of this vr input sheet.
	*
	* @return the book ID list of this vr input sheet
	*/
	@Override
	public java.lang.String getBookIDList() {
		return _vrInputSheet.getBookIDList();
	}

	/**
	* Returns the checker of this vr input sheet.
	*
	* @return the checker of this vr input sheet
	*/
	@Override
	public java.lang.String getChecker() {
		return _vrInputSheet.getChecker();
	}

	/**
	* Returns the delivery name of this vr input sheet.
	*
	* @return the delivery name of this vr input sheet
	*/
	@Override
	public java.lang.String getDeliveryName() {
		return _vrInputSheet.getDeliveryName();
	}

	/**
	* Returns the input sheet no of this vr input sheet.
	*
	* @return the input sheet no of this vr input sheet
	*/
	@Override
	public java.lang.String getInputSheetNo() {
		return _vrInputSheet.getInputSheetNo();
	}

	/**
	* Returns the inventory name of this vr input sheet.
	*
	* @return the inventory name of this vr input sheet
	*/
	@Override
	public java.lang.String getInventoryName() {
		return _vrInputSheet.getInventoryName();
	}

	/**
	* Returns the inventory place of this vr input sheet.
	*
	* @return the inventory place of this vr input sheet
	*/
	@Override
	public java.lang.String getInventoryPlace() {
		return _vrInputSheet.getInventoryPlace();
	}

	/**
	* Returns the maker of this vr input sheet.
	*
	* @return the maker of this vr input sheet
	*/
	@Override
	public java.lang.String getMaker() {
		return _vrInputSheet.getMaker();
	}

	/**
	* Returns the original document no of this vr input sheet.
	*
	* @return the original document no of this vr input sheet
	*/
	@Override
	public java.lang.String getOriginalDocumentNo() {
		return _vrInputSheet.getOriginalDocumentNo();
	}

	/**
	* Returns the remark of this vr input sheet.
	*
	* @return the remark of this vr input sheet
	*/
	@Override
	public java.lang.String getRemark() {
		return _vrInputSheet.getRemark();
	}

	@Override
	public java.lang.String toString() {
		return _vrInputSheet.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrInputSheet.toXmlString();
	}

	/**
	* Returns the input sheet date of this vr input sheet.
	*
	* @return the input sheet date of this vr input sheet
	*/
	@Override
	public Date getInputSheetDate() {
		return _vrInputSheet.getInputSheetDate();
	}

	/**
	* Returns the inventory date of this vr input sheet.
	*
	* @return the inventory date of this vr input sheet
	*/
	@Override
	public Date getInventoryDate() {
		return _vrInputSheet.getInventoryDate();
	}

	/**
	* Returns the modify date of this vr input sheet.
	*
	* @return the modify date of this vr input sheet
	*/
	@Override
	public Date getModifyDate() {
		return _vrInputSheet.getModifyDate();
	}

	/**
	* Returns the sync date of this vr input sheet.
	*
	* @return the sync date of this vr input sheet
	*/
	@Override
	public Date getSyncDate() {
		return _vrInputSheet.getSyncDate();
	}

	/**
	* Returns the corporation ID of this vr input sheet.
	*
	* @return the corporation ID of this vr input sheet
	*/
	@Override
	public long getCorporationId() {
		return _vrInputSheet.getCorporationId();
	}

	/**
	* Returns the ID of this vr input sheet.
	*
	* @return the ID of this vr input sheet
	*/
	@Override
	public long getId() {
		return _vrInputSheet.getId();
	}

	/**
	* Returns the input sheet type of this vr input sheet.
	*
	* @return the input sheet type of this vr input sheet
	*/
	@Override
	public long getInputSheetType() {
		return _vrInputSheet.getInputSheetType();
	}

	/**
	* Returns the is approval of this vr input sheet.
	*
	* @return the is approval of this vr input sheet
	*/
	@Override
	public long getIsApproval() {
		return _vrInputSheet.getIsApproval();
	}

	/**
	* Returns the mt core of this vr input sheet.
	*
	* @return the mt core of this vr input sheet
	*/
	@Override
	public long getMtCore() {
		return _vrInputSheet.getMtCore();
	}

	/**
	* Returns the primary key of this vr input sheet.
	*
	* @return the primary key of this vr input sheet
	*/
	@Override
	public long getPrimaryKey() {
		return _vrInputSheet.getPrimaryKey();
	}

	/**
	* Returns the total amount of this vr input sheet.
	*
	* @return the total amount of this vr input sheet
	*/
	@Override
	public long getTotalAmount() {
		return _vrInputSheet.getTotalAmount();
	}

	/**
	* Returns the total quantities of this vr input sheet.
	*
	* @return the total quantities of this vr input sheet
	*/
	@Override
	public long getTotalQuantities() {
		return _vrInputSheet.getTotalQuantities();
	}

	@Override
	public void persist() {
		_vrInputSheet.persist();
	}

	/**
	* Sets the amount in words of this vr input sheet.
	*
	* @param amountInWords the amount in words of this vr input sheet
	*/
	@Override
	public void setAmountInWords(java.lang.String amountInWords) {
		_vrInputSheet.setAmountInWords(amountInWords);
	}

	/**
	* Sets the approver of this vr input sheet.
	*
	* @param approver the approver of this vr input sheet
	*/
	@Override
	public void setApprover(java.lang.String approver) {
		_vrInputSheet.setApprover(approver);
	}

	/**
	* Sets the book ID list of this vr input sheet.
	*
	* @param bookIDList the book ID list of this vr input sheet
	*/
	@Override
	public void setBookIDList(java.lang.String bookIDList) {
		_vrInputSheet.setBookIDList(bookIDList);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrInputSheet.setCachedModel(cachedModel);
	}

	/**
	* Sets the checker of this vr input sheet.
	*
	* @param checker the checker of this vr input sheet
	*/
	@Override
	public void setChecker(java.lang.String checker) {
		_vrInputSheet.setChecker(checker);
	}

	/**
	* Sets the corporation ID of this vr input sheet.
	*
	* @param corporationId the corporation ID of this vr input sheet
	*/
	@Override
	public void setCorporationId(long corporationId) {
		_vrInputSheet.setCorporationId(corporationId);
	}

	/**
	* Sets the delivery name of this vr input sheet.
	*
	* @param deliveryName the delivery name of this vr input sheet
	*/
	@Override
	public void setDeliveryName(java.lang.String deliveryName) {
		_vrInputSheet.setDeliveryName(deliveryName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrInputSheet.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrInputSheet.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrInputSheet.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr input sheet.
	*
	* @param id the ID of this vr input sheet
	*/
	@Override
	public void setId(long id) {
		_vrInputSheet.setId(id);
	}

	/**
	* Sets the input sheet date of this vr input sheet.
	*
	* @param inputSheetDate the input sheet date of this vr input sheet
	*/
	@Override
	public void setInputSheetDate(Date inputSheetDate) {
		_vrInputSheet.setInputSheetDate(inputSheetDate);
	}

	/**
	* Sets the input sheet no of this vr input sheet.
	*
	* @param inputSheetNo the input sheet no of this vr input sheet
	*/
	@Override
	public void setInputSheetNo(java.lang.String inputSheetNo) {
		_vrInputSheet.setInputSheetNo(inputSheetNo);
	}

	/**
	* Sets the input sheet type of this vr input sheet.
	*
	* @param inputSheetType the input sheet type of this vr input sheet
	*/
	@Override
	public void setInputSheetType(long inputSheetType) {
		_vrInputSheet.setInputSheetType(inputSheetType);
	}

	/**
	* Sets the inventory date of this vr input sheet.
	*
	* @param inventoryDate the inventory date of this vr input sheet
	*/
	@Override
	public void setInventoryDate(Date inventoryDate) {
		_vrInputSheet.setInventoryDate(inventoryDate);
	}

	/**
	* Sets the inventory name of this vr input sheet.
	*
	* @param inventoryName the inventory name of this vr input sheet
	*/
	@Override
	public void setInventoryName(java.lang.String inventoryName) {
		_vrInputSheet.setInventoryName(inventoryName);
	}

	/**
	* Sets the inventory place of this vr input sheet.
	*
	* @param inventoryPlace the inventory place of this vr input sheet
	*/
	@Override
	public void setInventoryPlace(java.lang.String inventoryPlace) {
		_vrInputSheet.setInventoryPlace(inventoryPlace);
	}

	/**
	* Sets the is approval of this vr input sheet.
	*
	* @param isApproval the is approval of this vr input sheet
	*/
	@Override
	public void setIsApproval(long isApproval) {
		_vrInputSheet.setIsApproval(isApproval);
	}

	/**
	* Sets the maker of this vr input sheet.
	*
	* @param maker the maker of this vr input sheet
	*/
	@Override
	public void setMaker(java.lang.String maker) {
		_vrInputSheet.setMaker(maker);
	}

	/**
	* Sets the modify date of this vr input sheet.
	*
	* @param modifyDate the modify date of this vr input sheet
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrInputSheet.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr input sheet.
	*
	* @param mtCore the mt core of this vr input sheet
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrInputSheet.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrInputSheet.setNew(n);
	}

	/**
	* Sets the original document no of this vr input sheet.
	*
	* @param originalDocumentNo the original document no of this vr input sheet
	*/
	@Override
	public void setOriginalDocumentNo(java.lang.String originalDocumentNo) {
		_vrInputSheet.setOriginalDocumentNo(originalDocumentNo);
	}

	/**
	* Sets the primary key of this vr input sheet.
	*
	* @param primaryKey the primary key of this vr input sheet
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrInputSheet.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrInputSheet.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remark of this vr input sheet.
	*
	* @param remark the remark of this vr input sheet
	*/
	@Override
	public void setRemark(java.lang.String remark) {
		_vrInputSheet.setRemark(remark);
	}

	/**
	* Sets the sync date of this vr input sheet.
	*
	* @param syncDate the sync date of this vr input sheet
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrInputSheet.setSyncDate(syncDate);
	}

	/**
	* Sets the total amount of this vr input sheet.
	*
	* @param totalAmount the total amount of this vr input sheet
	*/
	@Override
	public void setTotalAmount(long totalAmount) {
		_vrInputSheet.setTotalAmount(totalAmount);
	}

	/**
	* Sets the total quantities of this vr input sheet.
	*
	* @param totalQuantities the total quantities of this vr input sheet
	*/
	@Override
	public void setTotalQuantities(long totalQuantities) {
		_vrInputSheet.setTotalQuantities(totalQuantities);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRInputSheetWrapper)) {
			return false;
		}

		VRInputSheetWrapper vrInputSheetWrapper = (VRInputSheetWrapper)obj;

		if (Objects.equals(_vrInputSheet, vrInputSheetWrapper._vrInputSheet)) {
			return true;
		}

		return false;
	}

	@Override
	public VRInputSheet getWrappedModel() {
		return _vrInputSheet;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrInputSheet.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrInputSheet.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrInputSheet.resetOriginalValues();
	}

	private final VRInputSheet _vrInputSheet;
}