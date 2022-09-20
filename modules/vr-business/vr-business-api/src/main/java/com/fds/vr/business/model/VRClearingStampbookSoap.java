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
public class VRClearingStampbookSoap implements Serializable {
	public static VRClearingStampbookSoap toSoapModel(VRClearingStampbook model) {
		VRClearingStampbookSoap soapModel = new VRClearingStampbookSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setDebitNoteId(model.getDebitNoteId());
		soapModel.setInputSheetId(model.getInputSheetId());
		soapModel.setOutputSheetId(model.getOutputSheetId());
		soapModel.setBookId(model.getBookId());
		soapModel.setCertificateId(model.getCertificateId());
		soapModel.setCertificateNumber(model.getCertificateNumber());
		soapModel.setCertificateDate(model.getCertificateDate());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setStampType(model.getStampType());
		soapModel.setStampShortNo(model.getStampShortNo());
		soapModel.setSerialStartNo(model.getSerialStartNo());
		soapModel.setSerialEndNo(model.getSerialEndNo());
		soapModel.setSubTotalInDocument(model.getSubTotalInDocument());
		soapModel.setSubTotalQuantities(model.getSubTotalQuantities());
		soapModel.setVehiclePrice(model.getVehiclePrice());
		soapModel.setUnitPrice(model.getUnitPrice());
		soapModel.setTotalAmount(model.getTotalAmount());
		soapModel.setTotalInUse(model.getTotalInUse());
		soapModel.setTotalNotUsed(model.getTotalNotUsed());
		soapModel.setTotalLost(model.getTotalLost());
		soapModel.setTotalCancelled(model.getTotalCancelled());
		soapModel.setTotalReturned(model.getTotalReturned());
		soapModel.setRemark(model.getRemark());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRClearingStampbookSoap[] toSoapModels(
		VRClearingStampbook[] models) {
		VRClearingStampbookSoap[] soapModels = new VRClearingStampbookSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRClearingStampbookSoap[][] toSoapModels(
		VRClearingStampbook[][] models) {
		VRClearingStampbookSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRClearingStampbookSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRClearingStampbookSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRClearingStampbookSoap[] toSoapModels(
		List<VRClearingStampbook> models) {
		List<VRClearingStampbookSoap> soapModels = new ArrayList<VRClearingStampbookSoap>(models.size());

		for (VRClearingStampbook model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRClearingStampbookSoap[soapModels.size()]);
	}

	public VRClearingStampbookSoap() {
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

	public long getDebitNoteId() {
		return _debitNoteId;
	}

	public void setDebitNoteId(long debitNoteId) {
		_debitNoteId = debitNoteId;
	}

	public long getInputSheetId() {
		return _inputSheetId;
	}

	public void setInputSheetId(long inputSheetId) {
		_inputSheetId = inputSheetId;
	}

	public long getOutputSheetId() {
		return _outputSheetId;
	}

	public void setOutputSheetId(long outputSheetId) {
		_outputSheetId = outputSheetId;
	}

	public long getBookId() {
		return _bookId;
	}

	public void setBookId(long bookId) {
		_bookId = bookId;
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

	public String getVehicleClass() {
		return _vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	public String getStampType() {
		return _stampType;
	}

	public void setStampType(String stampType) {
		_stampType = stampType;
	}

	public String getStampShortNo() {
		return _stampShortNo;
	}

	public void setStampShortNo(String stampShortNo) {
		_stampShortNo = stampShortNo;
	}

	public long getSerialStartNo() {
		return _serialStartNo;
	}

	public void setSerialStartNo(long serialStartNo) {
		_serialStartNo = serialStartNo;
	}

	public long getSerialEndNo() {
		return _serialEndNo;
	}

	public void setSerialEndNo(long serialEndNo) {
		_serialEndNo = serialEndNo;
	}

	public long getSubTotalInDocument() {
		return _subTotalInDocument;
	}

	public void setSubTotalInDocument(long subTotalInDocument) {
		_subTotalInDocument = subTotalInDocument;
	}

	public long getSubTotalQuantities() {
		return _subTotalQuantities;
	}

	public void setSubTotalQuantities(long subTotalQuantities) {
		_subTotalQuantities = subTotalQuantities;
	}

	public long getVehiclePrice() {
		return _vehiclePrice;
	}

	public void setVehiclePrice(long vehiclePrice) {
		_vehiclePrice = vehiclePrice;
	}

	public long getUnitPrice() {
		return _unitPrice;
	}

	public void setUnitPrice(long unitPrice) {
		_unitPrice = unitPrice;
	}

	public long getTotalAmount() {
		return _totalAmount;
	}

	public void setTotalAmount(long totalAmount) {
		_totalAmount = totalAmount;
	}

	public long getTotalInUse() {
		return _totalInUse;
	}

	public void setTotalInUse(long totalInUse) {
		_totalInUse = totalInUse;
	}

	public long getTotalNotUsed() {
		return _totalNotUsed;
	}

	public void setTotalNotUsed(long totalNotUsed) {
		_totalNotUsed = totalNotUsed;
	}

	public long getTotalLost() {
		return _totalLost;
	}

	public void setTotalLost(long totalLost) {
		_totalLost = totalLost;
	}

	public long getTotalCancelled() {
		return _totalCancelled;
	}

	public void setTotalCancelled(long totalCancelled) {
		_totalCancelled = totalCancelled;
	}

	public long getTotalReturned() {
		return _totalReturned;
	}

	public void setTotalReturned(long totalReturned) {
		_totalReturned = totalReturned;
	}

	public String getRemark() {
		return _remark;
	}

	public void setRemark(String remark) {
		_remark = remark;
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
	private long _debitNoteId;
	private long _inputSheetId;
	private long _outputSheetId;
	private long _bookId;
	private long _certificateId;
	private String _certificateNumber;
	private Date _certificateDate;
	private String _vehicleClass;
	private String _stampType;
	private String _stampShortNo;
	private long _serialStartNo;
	private long _serialEndNo;
	private long _subTotalInDocument;
	private long _subTotalQuantities;
	private long _vehiclePrice;
	private long _unitPrice;
	private long _totalAmount;
	private long _totalInUse;
	private long _totalNotUsed;
	private long _totalLost;
	private long _totalCancelled;
	private long _totalReturned;
	private String _remark;
	private Date _modifyDate;
	private Date _syncDate;
}