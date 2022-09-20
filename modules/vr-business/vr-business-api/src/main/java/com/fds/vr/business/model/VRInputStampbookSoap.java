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
public class VRInputStampbookSoap implements Serializable {
	public static VRInputStampbookSoap toSoapModel(VRInputStampbook model) {
		VRInputStampbookSoap soapModel = new VRInputStampbookSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setInputSheetId(model.getInputSheetId());
		soapModel.setBookId(model.getBookId());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setStampType(model.getStampType());
		soapModel.setStampShortNo(model.getStampShortNo());
		soapModel.setSerialStartNo(model.getSerialStartNo());
		soapModel.setSerialEndNo(model.getSerialEndNo());
		soapModel.setSubTotalInDocument(model.getSubTotalInDocument());
		soapModel.setSubTotalQuantities(model.getSubTotalQuantities());
		soapModel.setUnits(model.getUnits());
		soapModel.setUnitPrice(model.getUnitPrice());
		soapModel.setTotalAmount(model.getTotalAmount());
		soapModel.setTotalInUse(model.getTotalInUse());
		soapModel.setTotalNotUsed(model.getTotalNotUsed());
		soapModel.setSum1(model.getSum1());
		soapModel.setSum2(model.getSum2());
		soapModel.setSum3(model.getSum3());
		soapModel.setRemark(model.getRemark());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRInputStampbookSoap[] toSoapModels(VRInputStampbook[] models) {
		VRInputStampbookSoap[] soapModels = new VRInputStampbookSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRInputStampbookSoap[][] toSoapModels(
		VRInputStampbook[][] models) {
		VRInputStampbookSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRInputStampbookSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRInputStampbookSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRInputStampbookSoap[] toSoapModels(
		List<VRInputStampbook> models) {
		List<VRInputStampbookSoap> soapModels = new ArrayList<VRInputStampbookSoap>(models.size());

		for (VRInputStampbook model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRInputStampbookSoap[soapModels.size()]);
	}

	public VRInputStampbookSoap() {
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

	public long getUnits() {
		return _units;
	}

	public void setUnits(long units) {
		_units = units;
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

	public long getSum1() {
		return _sum1;
	}

	public void setSum1(long sum1) {
		_sum1 = sum1;
	}

	public long getSum2() {
		return _sum2;
	}

	public void setSum2(long sum2) {
		_sum2 = sum2;
	}

	public long getSum3() {
		return _sum3;
	}

	public void setSum3(long sum3) {
		_sum3 = sum3;
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
	private long _inputSheetId;
	private long _bookId;
	private String _vehicleClass;
	private String _stampType;
	private String _stampShortNo;
	private long _serialStartNo;
	private long _serialEndNo;
	private long _subTotalInDocument;
	private long _subTotalQuantities;
	private long _units;
	private long _unitPrice;
	private long _totalAmount;
	private long _totalInUse;
	private long _totalNotUsed;
	private long _sum1;
	private long _sum2;
	private long _sum3;
	private String _remark;
	private Date _modifyDate;
	private Date _syncDate;
}