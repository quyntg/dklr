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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRInputStampbookDetailsSoap implements Serializable {
	public static VRInputStampbookDetailsSoap toSoapModel(
		VRInputStampbookDetails model) {
		VRInputStampbookDetailsSoap soapModel = new VRInputStampbookDetailsSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setStampSerialNo(model.getStampSerialNo());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setCertificateId(model.getCertificateId());
		soapModel.setCertificateNumber(model.getCertificateNumber());
		soapModel.setCertificateDate(model.getCertificateDate());
		soapModel.setVehicleRecordId(model.getVehicleRecordId());
		soapModel.setFrameNo(model.getFrameNo());
		soapModel.setBoxNo(model.getBoxNo());
		soapModel.setVinNo(model.getVinNo());
		soapModel.setEngineNo(model.getEngineNo());
		soapModel.setQrCode(model.getQrCode());
		soapModel.setCopies(model.getCopies());
		soapModel.setMarkupFulfill(model.getMarkupFulfill());
		soapModel.setReplacedSerialNo(model.getReplacedSerialNo());
		soapModel.setRemark(model.getRemark());
		soapModel.setInputSheetId(model.getInputSheetId());
		soapModel.setBookId(model.getBookId());
		soapModel.setPurchaserId(model.getPurchaserId());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setIssuingStatus(model.getIssuingStatus());
		soapModel.setClearingStatus(model.getClearingStatus());
		soapModel.setStampStatus(model.getStampStatus());
		soapModel.setIssuingDate(model.getIssuingDate());
		soapModel.setPrintingDate(model.getPrintingDate());
		soapModel.setNoticeofLostDate(model.getNoticeofLostDate());
		soapModel.setNoticeofCancelDate(model.getNoticeofCancelDate());
		soapModel.setNoticeofReturnDate(model.getNoticeofReturnDate());
		soapModel.setClearingDate(model.getClearingDate());
		soapModel.setClearingAdvancePaymentID(model.getClearingAdvancePaymentID());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRInputStampbookDetailsSoap[] toSoapModels(
		VRInputStampbookDetails[] models) {
		VRInputStampbookDetailsSoap[] soapModels = new VRInputStampbookDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRInputStampbookDetailsSoap[][] toSoapModels(
		VRInputStampbookDetails[][] models) {
		VRInputStampbookDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRInputStampbookDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRInputStampbookDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRInputStampbookDetailsSoap[] toSoapModels(
		List<VRInputStampbookDetails> models) {
		List<VRInputStampbookDetailsSoap> soapModels = new ArrayList<VRInputStampbookDetailsSoap>(models.size());

		for (VRInputStampbookDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRInputStampbookDetailsSoap[soapModels.size()]);
	}

	public VRInputStampbookDetailsSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getMtCore() {
		return _mtCore;
	}

	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	public String getStampSerialNo() {
		return _stampSerialNo;
	}

	public void setStampSerialNo(String stampSerialNo) {
		_stampSerialNo = stampSerialNo;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public long getCertificateId() {
		return _certificateId;
	}

	public void setCertificateId(long certificateId) {
		_certificateId = certificateId;
	}

	public String getCertificateNumber() {
		return _certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		_certificateNumber = certificateNumber;
	}

	public Date getCertificateDate() {
		return _certificateDate;
	}

	public void setCertificateDate(Date certificateDate) {
		_certificateDate = certificateDate;
	}

	public long getVehicleRecordId() {
		return _vehicleRecordId;
	}

	public void setVehicleRecordId(long vehicleRecordId) {
		_vehicleRecordId = vehicleRecordId;
	}

	public String getFrameNo() {
		return _frameNo;
	}

	public void setFrameNo(String frameNo) {
		_frameNo = frameNo;
	}

	public String getBoxNo() {
		return _boxNo;
	}

	public void setBoxNo(String boxNo) {
		_boxNo = boxNo;
	}

	public String getVinNo() {
		return _vinNo;
	}

	public void setVinNo(String vinNo) {
		_vinNo = vinNo;
	}

	public String getEngineNo() {
		return _engineNo;
	}

	public void setEngineNo(String engineNo) {
		_engineNo = engineNo;
	}

	public String getQrCode() {
		return _qrCode;
	}

	public void setQrCode(String qrCode) {
		_qrCode = qrCode;
	}

	public long getCopies() {
		return _copies;
	}

	public void setCopies(long copies) {
		_copies = copies;
	}

	public long getMarkupFulfill() {
		return _markupFulfill;
	}

	public void setMarkupFulfill(long markupFulfill) {
		_markupFulfill = markupFulfill;
	}

	public String getReplacedSerialNo() {
		return _replacedSerialNo;
	}

	public void setReplacedSerialNo(String replacedSerialNo) {
		_replacedSerialNo = replacedSerialNo;
	}

	public String getRemark() {
		return _remark;
	}

	public void setRemark(String remark) {
		_remark = remark;
	}

	public long getInputSheetId() {
		return _inputSheetId;
	}

	public void setInputSheetId(long inputSheetId) {
		_inputSheetId = inputSheetId;
	}

	public long getBookId() {
		return _bookId;
	}

	public void setBookId(long bookId) {
		_bookId = bookId;
	}

	public long getPurchaserId() {
		return _purchaserId;
	}

	public void setPurchaserId(long purchaserId) {
		_purchaserId = purchaserId;
	}

	public long getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(long corporationId) {
		_corporationId = corporationId;
	}

	public long getIssuingStatus() {
		return _issuingStatus;
	}

	public void setIssuingStatus(long issuingStatus) {
		_issuingStatus = issuingStatus;
	}

	public long getClearingStatus() {
		return _clearingStatus;
	}

	public void setClearingStatus(long clearingStatus) {
		_clearingStatus = clearingStatus;
	}

	public long getStampStatus() {
		return _stampStatus;
	}

	public void setStampStatus(long stampStatus) {
		_stampStatus = stampStatus;
	}

	public Date getIssuingDate() {
		return _issuingDate;
	}

	public void setIssuingDate(Date issuingDate) {
		_issuingDate = issuingDate;
	}

	public Date getPrintingDate() {
		return _printingDate;
	}

	public void setPrintingDate(Date printingDate) {
		_printingDate = printingDate;
	}

	public Date getNoticeofLostDate() {
		return _noticeofLostDate;
	}

	public void setNoticeofLostDate(Date noticeofLostDate) {
		_noticeofLostDate = noticeofLostDate;
	}

	public Date getNoticeofCancelDate() {
		return _noticeofCancelDate;
	}

	public void setNoticeofCancelDate(Date noticeofCancelDate) {
		_noticeofCancelDate = noticeofCancelDate;
	}

	public Date getNoticeofReturnDate() {
		return _noticeofReturnDate;
	}

	public void setNoticeofReturnDate(Date noticeofReturnDate) {
		_noticeofReturnDate = noticeofReturnDate;
	}

	public Date getClearingDate() {
		return _clearingDate;
	}

	public void setClearingDate(Date clearingDate) {
		_clearingDate = clearingDate;
	}

	public long getClearingAdvancePaymentID() {
		return _clearingAdvancePaymentID;
	}

	public void setClearingAdvancePaymentID(long clearingAdvancePaymentID) {
		_clearingAdvancePaymentID = clearingAdvancePaymentID;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private long _mtCore;
	private String _stampSerialNo;
	private long _sequenceNo;
	private long _dossierId;
	private long _certificateId;
	private String _certificateNumber;
	private Date _certificateDate;
	private long _vehicleRecordId;
	private String _frameNo;
	private String _boxNo;
	private String _vinNo;
	private String _engineNo;
	private String _qrCode;
	private long _copies;
	private long _markupFulfill;
	private String _replacedSerialNo;
	private String _remark;
	private long _inputSheetId;
	private long _bookId;
	private long _purchaserId;
	private long _corporationId;
	private long _issuingStatus;
	private long _clearingStatus;
	private long _stampStatus;
	private Date _issuingDate;
	private Date _printingDate;
	private Date _noticeofLostDate;
	private Date _noticeofCancelDate;
	private Date _noticeofReturnDate;
	private Date _clearingDate;
	private long _clearingAdvancePaymentID;
	private Date _modifyDate;
	private Date _syncDate;
}