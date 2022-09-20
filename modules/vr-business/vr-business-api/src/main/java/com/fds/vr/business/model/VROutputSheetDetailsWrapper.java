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
 * This class is a wrapper for {@link VROutputSheetDetails}.
 * </p>
 *
 * @author LamTV
 * @see VROutputSheetDetails
 * @generated
 */
@ProviderType
public class VROutputSheetDetailsWrapper implements VROutputSheetDetails,
	ModelWrapper<VROutputSheetDetails> {
	public VROutputSheetDetailsWrapper(
		VROutputSheetDetails vrOutputSheetDetails) {
		_vrOutputSheetDetails = vrOutputSheetDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return VROutputSheetDetails.class;
	}

	@Override
	public String getModelClassName() {
		return VROutputSheetDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("inputSheetId", getInputSheetId());
		attributes.put("outputSheetId", getOutputSheetId());
		attributes.put("bookId", getBookId());
		attributes.put("issueVehicleCertificateId",
			getIssueVehicleCertificateId());
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

		Long issueVehicleCertificateId = (Long)attributes.get(
				"issueVehicleCertificateId");

		if (issueVehicleCertificateId != null) {
			setIssueVehicleCertificateId(issueVehicleCertificateId);
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
	public VROutputSheetDetails toEscapedModel() {
		return new VROutputSheetDetailsWrapper(_vrOutputSheetDetails.toEscapedModel());
	}

	@Override
	public VROutputSheetDetails toUnescapedModel() {
		return new VROutputSheetDetailsWrapper(_vrOutputSheetDetails.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrOutputSheetDetails.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrOutputSheetDetails.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrOutputSheetDetails.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrOutputSheetDetails.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VROutputSheetDetails> toCacheModel() {
		return _vrOutputSheetDetails.toCacheModel();
	}

	@Override
	public int compareTo(VROutputSheetDetails vrOutputSheetDetails) {
		return _vrOutputSheetDetails.compareTo(vrOutputSheetDetails);
	}

	@Override
	public int hashCode() {
		return _vrOutputSheetDetails.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrOutputSheetDetails.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VROutputSheetDetailsWrapper((VROutputSheetDetails)_vrOutputSheetDetails.clone());
	}

	/**
	* Returns the certificate number of this vr output sheet details.
	*
	* @return the certificate number of this vr output sheet details
	*/
	@Override
	public java.lang.String getCertificateNumber() {
		return _vrOutputSheetDetails.getCertificateNumber();
	}

	/**
	* Returns the remark of this vr output sheet details.
	*
	* @return the remark of this vr output sheet details
	*/
	@Override
	public java.lang.String getRemark() {
		return _vrOutputSheetDetails.getRemark();
	}

	/**
	* Returns the stamp short no of this vr output sheet details.
	*
	* @return the stamp short no of this vr output sheet details
	*/
	@Override
	public java.lang.String getStampShortNo() {
		return _vrOutputSheetDetails.getStampShortNo();
	}

	/**
	* Returns the stamp type of this vr output sheet details.
	*
	* @return the stamp type of this vr output sheet details
	*/
	@Override
	public java.lang.String getStampType() {
		return _vrOutputSheetDetails.getStampType();
	}

	/**
	* Returns the vehicle class of this vr output sheet details.
	*
	* @return the vehicle class of this vr output sheet details
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrOutputSheetDetails.getVehicleClass();
	}

	@Override
	public java.lang.String toString() {
		return _vrOutputSheetDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrOutputSheetDetails.toXmlString();
	}

	/**
	* Returns the certificate date of this vr output sheet details.
	*
	* @return the certificate date of this vr output sheet details
	*/
	@Override
	public Date getCertificateDate() {
		return _vrOutputSheetDetails.getCertificateDate();
	}

	/**
	* Returns the modify date of this vr output sheet details.
	*
	* @return the modify date of this vr output sheet details
	*/
	@Override
	public Date getModifyDate() {
		return _vrOutputSheetDetails.getModifyDate();
	}

	/**
	* Returns the sync date of this vr output sheet details.
	*
	* @return the sync date of this vr output sheet details
	*/
	@Override
	public Date getSyncDate() {
		return _vrOutputSheetDetails.getSyncDate();
	}

	/**
	* Returns the book ID of this vr output sheet details.
	*
	* @return the book ID of this vr output sheet details
	*/
	@Override
	public long getBookId() {
		return _vrOutputSheetDetails.getBookId();
	}

	/**
	* Returns the certificate ID of this vr output sheet details.
	*
	* @return the certificate ID of this vr output sheet details
	*/
	@Override
	public long getCertificateId() {
		return _vrOutputSheetDetails.getCertificateId();
	}

	/**
	* Returns the ID of this vr output sheet details.
	*
	* @return the ID of this vr output sheet details
	*/
	@Override
	public long getId() {
		return _vrOutputSheetDetails.getId();
	}

	/**
	* Returns the input sheet ID of this vr output sheet details.
	*
	* @return the input sheet ID of this vr output sheet details
	*/
	@Override
	public long getInputSheetId() {
		return _vrOutputSheetDetails.getInputSheetId();
	}

	/**
	* Returns the issue vehicle certificate ID of this vr output sheet details.
	*
	* @return the issue vehicle certificate ID of this vr output sheet details
	*/
	@Override
	public long getIssueVehicleCertificateId() {
		return _vrOutputSheetDetails.getIssueVehicleCertificateId();
	}

	/**
	* Returns the mt core of this vr output sheet details.
	*
	* @return the mt core of this vr output sheet details
	*/
	@Override
	public long getMtCore() {
		return _vrOutputSheetDetails.getMtCore();
	}

	/**
	* Returns the output sheet ID of this vr output sheet details.
	*
	* @return the output sheet ID of this vr output sheet details
	*/
	@Override
	public long getOutputSheetId() {
		return _vrOutputSheetDetails.getOutputSheetId();
	}

	/**
	* Returns the primary key of this vr output sheet details.
	*
	* @return the primary key of this vr output sheet details
	*/
	@Override
	public long getPrimaryKey() {
		return _vrOutputSheetDetails.getPrimaryKey();
	}

	/**
	* Returns the serial end no of this vr output sheet details.
	*
	* @return the serial end no of this vr output sheet details
	*/
	@Override
	public long getSerialEndNo() {
		return _vrOutputSheetDetails.getSerialEndNo();
	}

	/**
	* Returns the serial start no of this vr output sheet details.
	*
	* @return the serial start no of this vr output sheet details
	*/
	@Override
	public long getSerialStartNo() {
		return _vrOutputSheetDetails.getSerialStartNo();
	}

	/**
	* Returns the sub total in document of this vr output sheet details.
	*
	* @return the sub total in document of this vr output sheet details
	*/
	@Override
	public long getSubTotalInDocument() {
		return _vrOutputSheetDetails.getSubTotalInDocument();
	}

	/**
	* Returns the sub total quantities of this vr output sheet details.
	*
	* @return the sub total quantities of this vr output sheet details
	*/
	@Override
	public long getSubTotalQuantities() {
		return _vrOutputSheetDetails.getSubTotalQuantities();
	}

	/**
	* Returns the total amount of this vr output sheet details.
	*
	* @return the total amount of this vr output sheet details
	*/
	@Override
	public long getTotalAmount() {
		return _vrOutputSheetDetails.getTotalAmount();
	}

	/**
	* Returns the total cancelled of this vr output sheet details.
	*
	* @return the total cancelled of this vr output sheet details
	*/
	@Override
	public long getTotalCancelled() {
		return _vrOutputSheetDetails.getTotalCancelled();
	}

	/**
	* Returns the total in use of this vr output sheet details.
	*
	* @return the total in use of this vr output sheet details
	*/
	@Override
	public long getTotalInUse() {
		return _vrOutputSheetDetails.getTotalInUse();
	}

	/**
	* Returns the total lost of this vr output sheet details.
	*
	* @return the total lost of this vr output sheet details
	*/
	@Override
	public long getTotalLost() {
		return _vrOutputSheetDetails.getTotalLost();
	}

	/**
	* Returns the total not used of this vr output sheet details.
	*
	* @return the total not used of this vr output sheet details
	*/
	@Override
	public long getTotalNotUsed() {
		return _vrOutputSheetDetails.getTotalNotUsed();
	}

	/**
	* Returns the total returned of this vr output sheet details.
	*
	* @return the total returned of this vr output sheet details
	*/
	@Override
	public long getTotalReturned() {
		return _vrOutputSheetDetails.getTotalReturned();
	}

	/**
	* Returns the unit price of this vr output sheet details.
	*
	* @return the unit price of this vr output sheet details
	*/
	@Override
	public long getUnitPrice() {
		return _vrOutputSheetDetails.getUnitPrice();
	}

	@Override
	public void persist() {
		_vrOutputSheetDetails.persist();
	}

	/**
	* Sets the book ID of this vr output sheet details.
	*
	* @param bookId the book ID of this vr output sheet details
	*/
	@Override
	public void setBookId(long bookId) {
		_vrOutputSheetDetails.setBookId(bookId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrOutputSheetDetails.setCachedModel(cachedModel);
	}

	/**
	* Sets the certificate date of this vr output sheet details.
	*
	* @param certificateDate the certificate date of this vr output sheet details
	*/
	@Override
	public void setCertificateDate(Date certificateDate) {
		_vrOutputSheetDetails.setCertificateDate(certificateDate);
	}

	/**
	* Sets the certificate ID of this vr output sheet details.
	*
	* @param certificateId the certificate ID of this vr output sheet details
	*/
	@Override
	public void setCertificateId(long certificateId) {
		_vrOutputSheetDetails.setCertificateId(certificateId);
	}

	/**
	* Sets the certificate number of this vr output sheet details.
	*
	* @param certificateNumber the certificate number of this vr output sheet details
	*/
	@Override
	public void setCertificateNumber(java.lang.String certificateNumber) {
		_vrOutputSheetDetails.setCertificateNumber(certificateNumber);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrOutputSheetDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrOutputSheetDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrOutputSheetDetails.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr output sheet details.
	*
	* @param id the ID of this vr output sheet details
	*/
	@Override
	public void setId(long id) {
		_vrOutputSheetDetails.setId(id);
	}

	/**
	* Sets the input sheet ID of this vr output sheet details.
	*
	* @param inputSheetId the input sheet ID of this vr output sheet details
	*/
	@Override
	public void setInputSheetId(long inputSheetId) {
		_vrOutputSheetDetails.setInputSheetId(inputSheetId);
	}

	/**
	* Sets the issue vehicle certificate ID of this vr output sheet details.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID of this vr output sheet details
	*/
	@Override
	public void setIssueVehicleCertificateId(long issueVehicleCertificateId) {
		_vrOutputSheetDetails.setIssueVehicleCertificateId(issueVehicleCertificateId);
	}

	/**
	* Sets the modify date of this vr output sheet details.
	*
	* @param modifyDate the modify date of this vr output sheet details
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrOutputSheetDetails.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr output sheet details.
	*
	* @param mtCore the mt core of this vr output sheet details
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrOutputSheetDetails.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrOutputSheetDetails.setNew(n);
	}

	/**
	* Sets the output sheet ID of this vr output sheet details.
	*
	* @param outputSheetId the output sheet ID of this vr output sheet details
	*/
	@Override
	public void setOutputSheetId(long outputSheetId) {
		_vrOutputSheetDetails.setOutputSheetId(outputSheetId);
	}

	/**
	* Sets the primary key of this vr output sheet details.
	*
	* @param primaryKey the primary key of this vr output sheet details
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrOutputSheetDetails.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrOutputSheetDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remark of this vr output sheet details.
	*
	* @param remark the remark of this vr output sheet details
	*/
	@Override
	public void setRemark(java.lang.String remark) {
		_vrOutputSheetDetails.setRemark(remark);
	}

	/**
	* Sets the serial end no of this vr output sheet details.
	*
	* @param serialEndNo the serial end no of this vr output sheet details
	*/
	@Override
	public void setSerialEndNo(long serialEndNo) {
		_vrOutputSheetDetails.setSerialEndNo(serialEndNo);
	}

	/**
	* Sets the serial start no of this vr output sheet details.
	*
	* @param serialStartNo the serial start no of this vr output sheet details
	*/
	@Override
	public void setSerialStartNo(long serialStartNo) {
		_vrOutputSheetDetails.setSerialStartNo(serialStartNo);
	}

	/**
	* Sets the stamp short no of this vr output sheet details.
	*
	* @param stampShortNo the stamp short no of this vr output sheet details
	*/
	@Override
	public void setStampShortNo(java.lang.String stampShortNo) {
		_vrOutputSheetDetails.setStampShortNo(stampShortNo);
	}

	/**
	* Sets the stamp type of this vr output sheet details.
	*
	* @param stampType the stamp type of this vr output sheet details
	*/
	@Override
	public void setStampType(java.lang.String stampType) {
		_vrOutputSheetDetails.setStampType(stampType);
	}

	/**
	* Sets the sub total in document of this vr output sheet details.
	*
	* @param subTotalInDocument the sub total in document of this vr output sheet details
	*/
	@Override
	public void setSubTotalInDocument(long subTotalInDocument) {
		_vrOutputSheetDetails.setSubTotalInDocument(subTotalInDocument);
	}

	/**
	* Sets the sub total quantities of this vr output sheet details.
	*
	* @param subTotalQuantities the sub total quantities of this vr output sheet details
	*/
	@Override
	public void setSubTotalQuantities(long subTotalQuantities) {
		_vrOutputSheetDetails.setSubTotalQuantities(subTotalQuantities);
	}

	/**
	* Sets the sync date of this vr output sheet details.
	*
	* @param syncDate the sync date of this vr output sheet details
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrOutputSheetDetails.setSyncDate(syncDate);
	}

	/**
	* Sets the total amount of this vr output sheet details.
	*
	* @param totalAmount the total amount of this vr output sheet details
	*/
	@Override
	public void setTotalAmount(long totalAmount) {
		_vrOutputSheetDetails.setTotalAmount(totalAmount);
	}

	/**
	* Sets the total cancelled of this vr output sheet details.
	*
	* @param totalCancelled the total cancelled of this vr output sheet details
	*/
	@Override
	public void setTotalCancelled(long totalCancelled) {
		_vrOutputSheetDetails.setTotalCancelled(totalCancelled);
	}

	/**
	* Sets the total in use of this vr output sheet details.
	*
	* @param totalInUse the total in use of this vr output sheet details
	*/
	@Override
	public void setTotalInUse(long totalInUse) {
		_vrOutputSheetDetails.setTotalInUse(totalInUse);
	}

	/**
	* Sets the total lost of this vr output sheet details.
	*
	* @param totalLost the total lost of this vr output sheet details
	*/
	@Override
	public void setTotalLost(long totalLost) {
		_vrOutputSheetDetails.setTotalLost(totalLost);
	}

	/**
	* Sets the total not used of this vr output sheet details.
	*
	* @param totalNotUsed the total not used of this vr output sheet details
	*/
	@Override
	public void setTotalNotUsed(long totalNotUsed) {
		_vrOutputSheetDetails.setTotalNotUsed(totalNotUsed);
	}

	/**
	* Sets the total returned of this vr output sheet details.
	*
	* @param totalReturned the total returned of this vr output sheet details
	*/
	@Override
	public void setTotalReturned(long totalReturned) {
		_vrOutputSheetDetails.setTotalReturned(totalReturned);
	}

	/**
	* Sets the unit price of this vr output sheet details.
	*
	* @param unitPrice the unit price of this vr output sheet details
	*/
	@Override
	public void setUnitPrice(long unitPrice) {
		_vrOutputSheetDetails.setUnitPrice(unitPrice);
	}

	/**
	* Sets the vehicle class of this vr output sheet details.
	*
	* @param vehicleClass the vehicle class of this vr output sheet details
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrOutputSheetDetails.setVehicleClass(vehicleClass);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VROutputSheetDetailsWrapper)) {
			return false;
		}

		VROutputSheetDetailsWrapper vrOutputSheetDetailsWrapper = (VROutputSheetDetailsWrapper)obj;

		if (Objects.equals(_vrOutputSheetDetails,
					vrOutputSheetDetailsWrapper._vrOutputSheetDetails)) {
			return true;
		}

		return false;
	}

	@Override
	public VROutputSheetDetails getWrappedModel() {
		return _vrOutputSheetDetails;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrOutputSheetDetails.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrOutputSheetDetails.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrOutputSheetDetails.resetOriginalValues();
	}

	private final VROutputSheetDetails _vrOutputSheetDetails;
}