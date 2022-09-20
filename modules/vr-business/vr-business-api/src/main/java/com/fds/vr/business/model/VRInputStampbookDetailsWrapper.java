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
 * This class is a wrapper for {@link VRInputStampbookDetails}.
 * </p>
 *
 * @author LamTV
 * @see VRInputStampbookDetails
 * @generated
 */
@ProviderType
public class VRInputStampbookDetailsWrapper implements VRInputStampbookDetails,
	ModelWrapper<VRInputStampbookDetails> {
	public VRInputStampbookDetailsWrapper(
		VRInputStampbookDetails vrInputStampbookDetails) {
		_vrInputStampbookDetails = vrInputStampbookDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return VRInputStampbookDetails.class;
	}

	@Override
	public String getModelClassName() {
		return VRInputStampbookDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("stampSerialNo", getStampSerialNo());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("dossierId", getDossierId());
		attributes.put("certificateId", getCertificateId());
		attributes.put("certificateNumber", getCertificateNumber());
		attributes.put("certificateDate", getCertificateDate());
		attributes.put("vehicleRecordId", getVehicleRecordId());
		attributes.put("frameNo", getFrameNo());
		attributes.put("boxNo", getBoxNo());
		attributes.put("vinNo", getVinNo());
		attributes.put("engineNo", getEngineNo());
		attributes.put("qrCode", getQrCode());
		attributes.put("copies", getCopies());
		attributes.put("markupFulfill", getMarkupFulfill());
		attributes.put("replacedSerialNo", getReplacedSerialNo());
		attributes.put("remark", getRemark());
		attributes.put("inputSheetId", getInputSheetId());
		attributes.put("bookId", getBookId());
		attributes.put("purchaserId", getPurchaserId());
		attributes.put("corporationId", getCorporationId());
		attributes.put("issuingStatus", getIssuingStatus());
		attributes.put("clearingStatus", getClearingStatus());
		attributes.put("stampStatus", getStampStatus());
		attributes.put("issuingDate", getIssuingDate());
		attributes.put("printingDate", getPrintingDate());
		attributes.put("noticeofLostDate", getNoticeofLostDate());
		attributes.put("noticeofCancelDate", getNoticeofCancelDate());
		attributes.put("noticeofReturnDate", getNoticeofReturnDate());
		attributes.put("clearingDate", getClearingDate());
		attributes.put("clearingAdvancePaymentID", getClearingAdvancePaymentID());
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

		String stampSerialNo = (String)attributes.get("stampSerialNo");

		if (stampSerialNo != null) {
			setStampSerialNo(stampSerialNo);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
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

		Long vehicleRecordId = (Long)attributes.get("vehicleRecordId");

		if (vehicleRecordId != null) {
			setVehicleRecordId(vehicleRecordId);
		}

		String frameNo = (String)attributes.get("frameNo");

		if (frameNo != null) {
			setFrameNo(frameNo);
		}

		String boxNo = (String)attributes.get("boxNo");

		if (boxNo != null) {
			setBoxNo(boxNo);
		}

		String vinNo = (String)attributes.get("vinNo");

		if (vinNo != null) {
			setVinNo(vinNo);
		}

		String engineNo = (String)attributes.get("engineNo");

		if (engineNo != null) {
			setEngineNo(engineNo);
		}

		String qrCode = (String)attributes.get("qrCode");

		if (qrCode != null) {
			setQrCode(qrCode);
		}

		Long copies = (Long)attributes.get("copies");

		if (copies != null) {
			setCopies(copies);
		}

		Long markupFulfill = (Long)attributes.get("markupFulfill");

		if (markupFulfill != null) {
			setMarkupFulfill(markupFulfill);
		}

		String replacedSerialNo = (String)attributes.get("replacedSerialNo");

		if (replacedSerialNo != null) {
			setReplacedSerialNo(replacedSerialNo);
		}

		String remark = (String)attributes.get("remark");

		if (remark != null) {
			setRemark(remark);
		}

		Long inputSheetId = (Long)attributes.get("inputSheetId");

		if (inputSheetId != null) {
			setInputSheetId(inputSheetId);
		}

		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		Long purchaserId = (Long)attributes.get("purchaserId");

		if (purchaserId != null) {
			setPurchaserId(purchaserId);
		}

		Long corporationId = (Long)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		Long issuingStatus = (Long)attributes.get("issuingStatus");

		if (issuingStatus != null) {
			setIssuingStatus(issuingStatus);
		}

		Long clearingStatus = (Long)attributes.get("clearingStatus");

		if (clearingStatus != null) {
			setClearingStatus(clearingStatus);
		}

		Long stampStatus = (Long)attributes.get("stampStatus");

		if (stampStatus != null) {
			setStampStatus(stampStatus);
		}

		Date issuingDate = (Date)attributes.get("issuingDate");

		if (issuingDate != null) {
			setIssuingDate(issuingDate);
		}

		Date printingDate = (Date)attributes.get("printingDate");

		if (printingDate != null) {
			setPrintingDate(printingDate);
		}

		Date noticeofLostDate = (Date)attributes.get("noticeofLostDate");

		if (noticeofLostDate != null) {
			setNoticeofLostDate(noticeofLostDate);
		}

		Date noticeofCancelDate = (Date)attributes.get("noticeofCancelDate");

		if (noticeofCancelDate != null) {
			setNoticeofCancelDate(noticeofCancelDate);
		}

		Date noticeofReturnDate = (Date)attributes.get("noticeofReturnDate");

		if (noticeofReturnDate != null) {
			setNoticeofReturnDate(noticeofReturnDate);
		}

		Date clearingDate = (Date)attributes.get("clearingDate");

		if (clearingDate != null) {
			setClearingDate(clearingDate);
		}

		Long clearingAdvancePaymentID = (Long)attributes.get(
				"clearingAdvancePaymentID");

		if (clearingAdvancePaymentID != null) {
			setClearingAdvancePaymentID(clearingAdvancePaymentID);
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
	public VRInputStampbookDetails toEscapedModel() {
		return new VRInputStampbookDetailsWrapper(_vrInputStampbookDetails.toEscapedModel());
	}

	@Override
	public VRInputStampbookDetails toUnescapedModel() {
		return new VRInputStampbookDetailsWrapper(_vrInputStampbookDetails.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrInputStampbookDetails.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrInputStampbookDetails.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrInputStampbookDetails.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrInputStampbookDetails.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRInputStampbookDetails> toCacheModel() {
		return _vrInputStampbookDetails.toCacheModel();
	}

	@Override
	public int compareTo(VRInputStampbookDetails vrInputStampbookDetails) {
		return _vrInputStampbookDetails.compareTo(vrInputStampbookDetails);
	}

	@Override
	public int hashCode() {
		return _vrInputStampbookDetails.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrInputStampbookDetails.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRInputStampbookDetailsWrapper((VRInputStampbookDetails)_vrInputStampbookDetails.clone());
	}

	/**
	* Returns the box no of this vr input stampbook details.
	*
	* @return the box no of this vr input stampbook details
	*/
	@Override
	public java.lang.String getBoxNo() {
		return _vrInputStampbookDetails.getBoxNo();
	}

	/**
	* Returns the certificate number of this vr input stampbook details.
	*
	* @return the certificate number of this vr input stampbook details
	*/
	@Override
	public java.lang.String getCertificateNumber() {
		return _vrInputStampbookDetails.getCertificateNumber();
	}

	/**
	* Returns the engine no of this vr input stampbook details.
	*
	* @return the engine no of this vr input stampbook details
	*/
	@Override
	public java.lang.String getEngineNo() {
		return _vrInputStampbookDetails.getEngineNo();
	}

	/**
	* Returns the frame no of this vr input stampbook details.
	*
	* @return the frame no of this vr input stampbook details
	*/
	@Override
	public java.lang.String getFrameNo() {
		return _vrInputStampbookDetails.getFrameNo();
	}

	/**
	* Returns the qr code of this vr input stampbook details.
	*
	* @return the qr code of this vr input stampbook details
	*/
	@Override
	public java.lang.String getQrCode() {
		return _vrInputStampbookDetails.getQrCode();
	}

	/**
	* Returns the remark of this vr input stampbook details.
	*
	* @return the remark of this vr input stampbook details
	*/
	@Override
	public java.lang.String getRemark() {
		return _vrInputStampbookDetails.getRemark();
	}

	/**
	* Returns the replaced serial no of this vr input stampbook details.
	*
	* @return the replaced serial no of this vr input stampbook details
	*/
	@Override
	public java.lang.String getReplacedSerialNo() {
		return _vrInputStampbookDetails.getReplacedSerialNo();
	}

	/**
	* Returns the stamp serial no of this vr input stampbook details.
	*
	* @return the stamp serial no of this vr input stampbook details
	*/
	@Override
	public java.lang.String getStampSerialNo() {
		return _vrInputStampbookDetails.getStampSerialNo();
	}

	/**
	* Returns the vin no of this vr input stampbook details.
	*
	* @return the vin no of this vr input stampbook details
	*/
	@Override
	public java.lang.String getVinNo() {
		return _vrInputStampbookDetails.getVinNo();
	}

	@Override
	public java.lang.String toString() {
		return _vrInputStampbookDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrInputStampbookDetails.toXmlString();
	}

	/**
	* Returns the certificate date of this vr input stampbook details.
	*
	* @return the certificate date of this vr input stampbook details
	*/
	@Override
	public Date getCertificateDate() {
		return _vrInputStampbookDetails.getCertificateDate();
	}

	/**
	* Returns the clearing date of this vr input stampbook details.
	*
	* @return the clearing date of this vr input stampbook details
	*/
	@Override
	public Date getClearingDate() {
		return _vrInputStampbookDetails.getClearingDate();
	}

	/**
	* Returns the issuing date of this vr input stampbook details.
	*
	* @return the issuing date of this vr input stampbook details
	*/
	@Override
	public Date getIssuingDate() {
		return _vrInputStampbookDetails.getIssuingDate();
	}

	/**
	* Returns the modify date of this vr input stampbook details.
	*
	* @return the modify date of this vr input stampbook details
	*/
	@Override
	public Date getModifyDate() {
		return _vrInputStampbookDetails.getModifyDate();
	}

	/**
	* Returns the noticeof cancel date of this vr input stampbook details.
	*
	* @return the noticeof cancel date of this vr input stampbook details
	*/
	@Override
	public Date getNoticeofCancelDate() {
		return _vrInputStampbookDetails.getNoticeofCancelDate();
	}

	/**
	* Returns the noticeof lost date of this vr input stampbook details.
	*
	* @return the noticeof lost date of this vr input stampbook details
	*/
	@Override
	public Date getNoticeofLostDate() {
		return _vrInputStampbookDetails.getNoticeofLostDate();
	}

	/**
	* Returns the noticeof return date of this vr input stampbook details.
	*
	* @return the noticeof return date of this vr input stampbook details
	*/
	@Override
	public Date getNoticeofReturnDate() {
		return _vrInputStampbookDetails.getNoticeofReturnDate();
	}

	/**
	* Returns the printing date of this vr input stampbook details.
	*
	* @return the printing date of this vr input stampbook details
	*/
	@Override
	public Date getPrintingDate() {
		return _vrInputStampbookDetails.getPrintingDate();
	}

	/**
	* Returns the sync date of this vr input stampbook details.
	*
	* @return the sync date of this vr input stampbook details
	*/
	@Override
	public Date getSyncDate() {
		return _vrInputStampbookDetails.getSyncDate();
	}

	/**
	* Returns the book ID of this vr input stampbook details.
	*
	* @return the book ID of this vr input stampbook details
	*/
	@Override
	public long getBookId() {
		return _vrInputStampbookDetails.getBookId();
	}

	/**
	* Returns the certificate ID of this vr input stampbook details.
	*
	* @return the certificate ID of this vr input stampbook details
	*/
	@Override
	public long getCertificateId() {
		return _vrInputStampbookDetails.getCertificateId();
	}

	/**
	* Returns the clearing advance payment ID of this vr input stampbook details.
	*
	* @return the clearing advance payment ID of this vr input stampbook details
	*/
	@Override
	public long getClearingAdvancePaymentID() {
		return _vrInputStampbookDetails.getClearingAdvancePaymentID();
	}

	/**
	* Returns the clearing status of this vr input stampbook details.
	*
	* @return the clearing status of this vr input stampbook details
	*/
	@Override
	public long getClearingStatus() {
		return _vrInputStampbookDetails.getClearingStatus();
	}

	/**
	* Returns the copies of this vr input stampbook details.
	*
	* @return the copies of this vr input stampbook details
	*/
	@Override
	public long getCopies() {
		return _vrInputStampbookDetails.getCopies();
	}

	/**
	* Returns the corporation ID of this vr input stampbook details.
	*
	* @return the corporation ID of this vr input stampbook details
	*/
	@Override
	public long getCorporationId() {
		return _vrInputStampbookDetails.getCorporationId();
	}

	/**
	* Returns the dossier ID of this vr input stampbook details.
	*
	* @return the dossier ID of this vr input stampbook details
	*/
	@Override
	public long getDossierId() {
		return _vrInputStampbookDetails.getDossierId();
	}

	/**
	* Returns the ID of this vr input stampbook details.
	*
	* @return the ID of this vr input stampbook details
	*/
	@Override
	public long getId() {
		return _vrInputStampbookDetails.getId();
	}

	/**
	* Returns the input sheet ID of this vr input stampbook details.
	*
	* @return the input sheet ID of this vr input stampbook details
	*/
	@Override
	public long getInputSheetId() {
		return _vrInputStampbookDetails.getInputSheetId();
	}

	/**
	* Returns the issuing status of this vr input stampbook details.
	*
	* @return the issuing status of this vr input stampbook details
	*/
	@Override
	public long getIssuingStatus() {
		return _vrInputStampbookDetails.getIssuingStatus();
	}

	/**
	* Returns the markup fulfill of this vr input stampbook details.
	*
	* @return the markup fulfill of this vr input stampbook details
	*/
	@Override
	public long getMarkupFulfill() {
		return _vrInputStampbookDetails.getMarkupFulfill();
	}

	/**
	* Returns the mt core of this vr input stampbook details.
	*
	* @return the mt core of this vr input stampbook details
	*/
	@Override
	public long getMtCore() {
		return _vrInputStampbookDetails.getMtCore();
	}

	/**
	* Returns the primary key of this vr input stampbook details.
	*
	* @return the primary key of this vr input stampbook details
	*/
	@Override
	public long getPrimaryKey() {
		return _vrInputStampbookDetails.getPrimaryKey();
	}

	/**
	* Returns the purchaser ID of this vr input stampbook details.
	*
	* @return the purchaser ID of this vr input stampbook details
	*/
	@Override
	public long getPurchaserId() {
		return _vrInputStampbookDetails.getPurchaserId();
	}

	/**
	* Returns the sequence no of this vr input stampbook details.
	*
	* @return the sequence no of this vr input stampbook details
	*/
	@Override
	public long getSequenceNo() {
		return _vrInputStampbookDetails.getSequenceNo();
	}

	/**
	* Returns the stamp status of this vr input stampbook details.
	*
	* @return the stamp status of this vr input stampbook details
	*/
	@Override
	public long getStampStatus() {
		return _vrInputStampbookDetails.getStampStatus();
	}

	/**
	* Returns the vehicle record ID of this vr input stampbook details.
	*
	* @return the vehicle record ID of this vr input stampbook details
	*/
	@Override
	public long getVehicleRecordId() {
		return _vrInputStampbookDetails.getVehicleRecordId();
	}

	@Override
	public void persist() {
		_vrInputStampbookDetails.persist();
	}

	/**
	* Sets the book ID of this vr input stampbook details.
	*
	* @param bookId the book ID of this vr input stampbook details
	*/
	@Override
	public void setBookId(long bookId) {
		_vrInputStampbookDetails.setBookId(bookId);
	}

	/**
	* Sets the box no of this vr input stampbook details.
	*
	* @param boxNo the box no of this vr input stampbook details
	*/
	@Override
	public void setBoxNo(java.lang.String boxNo) {
		_vrInputStampbookDetails.setBoxNo(boxNo);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrInputStampbookDetails.setCachedModel(cachedModel);
	}

	/**
	* Sets the certificate date of this vr input stampbook details.
	*
	* @param certificateDate the certificate date of this vr input stampbook details
	*/
	@Override
	public void setCertificateDate(Date certificateDate) {
		_vrInputStampbookDetails.setCertificateDate(certificateDate);
	}

	/**
	* Sets the certificate ID of this vr input stampbook details.
	*
	* @param certificateId the certificate ID of this vr input stampbook details
	*/
	@Override
	public void setCertificateId(long certificateId) {
		_vrInputStampbookDetails.setCertificateId(certificateId);
	}

	/**
	* Sets the certificate number of this vr input stampbook details.
	*
	* @param certificateNumber the certificate number of this vr input stampbook details
	*/
	@Override
	public void setCertificateNumber(java.lang.String certificateNumber) {
		_vrInputStampbookDetails.setCertificateNumber(certificateNumber);
	}

	/**
	* Sets the clearing advance payment ID of this vr input stampbook details.
	*
	* @param clearingAdvancePaymentID the clearing advance payment ID of this vr input stampbook details
	*/
	@Override
	public void setClearingAdvancePaymentID(long clearingAdvancePaymentID) {
		_vrInputStampbookDetails.setClearingAdvancePaymentID(clearingAdvancePaymentID);
	}

	/**
	* Sets the clearing date of this vr input stampbook details.
	*
	* @param clearingDate the clearing date of this vr input stampbook details
	*/
	@Override
	public void setClearingDate(Date clearingDate) {
		_vrInputStampbookDetails.setClearingDate(clearingDate);
	}

	/**
	* Sets the clearing status of this vr input stampbook details.
	*
	* @param clearingStatus the clearing status of this vr input stampbook details
	*/
	@Override
	public void setClearingStatus(long clearingStatus) {
		_vrInputStampbookDetails.setClearingStatus(clearingStatus);
	}

	/**
	* Sets the copies of this vr input stampbook details.
	*
	* @param copies the copies of this vr input stampbook details
	*/
	@Override
	public void setCopies(long copies) {
		_vrInputStampbookDetails.setCopies(copies);
	}

	/**
	* Sets the corporation ID of this vr input stampbook details.
	*
	* @param corporationId the corporation ID of this vr input stampbook details
	*/
	@Override
	public void setCorporationId(long corporationId) {
		_vrInputStampbookDetails.setCorporationId(corporationId);
	}

	/**
	* Sets the dossier ID of this vr input stampbook details.
	*
	* @param dossierId the dossier ID of this vr input stampbook details
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrInputStampbookDetails.setDossierId(dossierId);
	}

	/**
	* Sets the engine no of this vr input stampbook details.
	*
	* @param engineNo the engine no of this vr input stampbook details
	*/
	@Override
	public void setEngineNo(java.lang.String engineNo) {
		_vrInputStampbookDetails.setEngineNo(engineNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrInputStampbookDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrInputStampbookDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrInputStampbookDetails.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the frame no of this vr input stampbook details.
	*
	* @param frameNo the frame no of this vr input stampbook details
	*/
	@Override
	public void setFrameNo(java.lang.String frameNo) {
		_vrInputStampbookDetails.setFrameNo(frameNo);
	}

	/**
	* Sets the ID of this vr input stampbook details.
	*
	* @param id the ID of this vr input stampbook details
	*/
	@Override
	public void setId(long id) {
		_vrInputStampbookDetails.setId(id);
	}

	/**
	* Sets the input sheet ID of this vr input stampbook details.
	*
	* @param inputSheetId the input sheet ID of this vr input stampbook details
	*/
	@Override
	public void setInputSheetId(long inputSheetId) {
		_vrInputStampbookDetails.setInputSheetId(inputSheetId);
	}

	/**
	* Sets the issuing date of this vr input stampbook details.
	*
	* @param issuingDate the issuing date of this vr input stampbook details
	*/
	@Override
	public void setIssuingDate(Date issuingDate) {
		_vrInputStampbookDetails.setIssuingDate(issuingDate);
	}

	/**
	* Sets the issuing status of this vr input stampbook details.
	*
	* @param issuingStatus the issuing status of this vr input stampbook details
	*/
	@Override
	public void setIssuingStatus(long issuingStatus) {
		_vrInputStampbookDetails.setIssuingStatus(issuingStatus);
	}

	/**
	* Sets the markup fulfill of this vr input stampbook details.
	*
	* @param markupFulfill the markup fulfill of this vr input stampbook details
	*/
	@Override
	public void setMarkupFulfill(long markupFulfill) {
		_vrInputStampbookDetails.setMarkupFulfill(markupFulfill);
	}

	/**
	* Sets the modify date of this vr input stampbook details.
	*
	* @param modifyDate the modify date of this vr input stampbook details
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrInputStampbookDetails.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr input stampbook details.
	*
	* @param mtCore the mt core of this vr input stampbook details
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrInputStampbookDetails.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrInputStampbookDetails.setNew(n);
	}

	/**
	* Sets the noticeof cancel date of this vr input stampbook details.
	*
	* @param noticeofCancelDate the noticeof cancel date of this vr input stampbook details
	*/
	@Override
	public void setNoticeofCancelDate(Date noticeofCancelDate) {
		_vrInputStampbookDetails.setNoticeofCancelDate(noticeofCancelDate);
	}

	/**
	* Sets the noticeof lost date of this vr input stampbook details.
	*
	* @param noticeofLostDate the noticeof lost date of this vr input stampbook details
	*/
	@Override
	public void setNoticeofLostDate(Date noticeofLostDate) {
		_vrInputStampbookDetails.setNoticeofLostDate(noticeofLostDate);
	}

	/**
	* Sets the noticeof return date of this vr input stampbook details.
	*
	* @param noticeofReturnDate the noticeof return date of this vr input stampbook details
	*/
	@Override
	public void setNoticeofReturnDate(Date noticeofReturnDate) {
		_vrInputStampbookDetails.setNoticeofReturnDate(noticeofReturnDate);
	}

	/**
	* Sets the primary key of this vr input stampbook details.
	*
	* @param primaryKey the primary key of this vr input stampbook details
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrInputStampbookDetails.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrInputStampbookDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the printing date of this vr input stampbook details.
	*
	* @param printingDate the printing date of this vr input stampbook details
	*/
	@Override
	public void setPrintingDate(Date printingDate) {
		_vrInputStampbookDetails.setPrintingDate(printingDate);
	}

	/**
	* Sets the purchaser ID of this vr input stampbook details.
	*
	* @param purchaserId the purchaser ID of this vr input stampbook details
	*/
	@Override
	public void setPurchaserId(long purchaserId) {
		_vrInputStampbookDetails.setPurchaserId(purchaserId);
	}

	/**
	* Sets the qr code of this vr input stampbook details.
	*
	* @param qrCode the qr code of this vr input stampbook details
	*/
	@Override
	public void setQrCode(java.lang.String qrCode) {
		_vrInputStampbookDetails.setQrCode(qrCode);
	}

	/**
	* Sets the remark of this vr input stampbook details.
	*
	* @param remark the remark of this vr input stampbook details
	*/
	@Override
	public void setRemark(java.lang.String remark) {
		_vrInputStampbookDetails.setRemark(remark);
	}

	/**
	* Sets the replaced serial no of this vr input stampbook details.
	*
	* @param replacedSerialNo the replaced serial no of this vr input stampbook details
	*/
	@Override
	public void setReplacedSerialNo(java.lang.String replacedSerialNo) {
		_vrInputStampbookDetails.setReplacedSerialNo(replacedSerialNo);
	}

	/**
	* Sets the sequence no of this vr input stampbook details.
	*
	* @param sequenceNo the sequence no of this vr input stampbook details
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrInputStampbookDetails.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the stamp serial no of this vr input stampbook details.
	*
	* @param stampSerialNo the stamp serial no of this vr input stampbook details
	*/
	@Override
	public void setStampSerialNo(java.lang.String stampSerialNo) {
		_vrInputStampbookDetails.setStampSerialNo(stampSerialNo);
	}

	/**
	* Sets the stamp status of this vr input stampbook details.
	*
	* @param stampStatus the stamp status of this vr input stampbook details
	*/
	@Override
	public void setStampStatus(long stampStatus) {
		_vrInputStampbookDetails.setStampStatus(stampStatus);
	}

	/**
	* Sets the sync date of this vr input stampbook details.
	*
	* @param syncDate the sync date of this vr input stampbook details
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrInputStampbookDetails.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle record ID of this vr input stampbook details.
	*
	* @param vehicleRecordId the vehicle record ID of this vr input stampbook details
	*/
	@Override
	public void setVehicleRecordId(long vehicleRecordId) {
		_vrInputStampbookDetails.setVehicleRecordId(vehicleRecordId);
	}

	/**
	* Sets the vin no of this vr input stampbook details.
	*
	* @param vinNo the vin no of this vr input stampbook details
	*/
	@Override
	public void setVinNo(java.lang.String vinNo) {
		_vrInputStampbookDetails.setVinNo(vinNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRInputStampbookDetailsWrapper)) {
			return false;
		}

		VRInputStampbookDetailsWrapper vrInputStampbookDetailsWrapper = (VRInputStampbookDetailsWrapper)obj;

		if (Objects.equals(_vrInputStampbookDetails,
					vrInputStampbookDetailsWrapper._vrInputStampbookDetails)) {
			return true;
		}

		return false;
	}

	@Override
	public VRInputStampbookDetails getWrappedModel() {
		return _vrInputStampbookDetails;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrInputStampbookDetails.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrInputStampbookDetails.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrInputStampbookDetails.resetOriginalValues();
	}

	private final VRInputStampbookDetails _vrInputStampbookDetails;
}