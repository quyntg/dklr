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
public class VRInventorySoap implements Serializable {
	public static VRInventorySoap toSoapModel(VRInventory model) {
		VRInventorySoap soapModel = new VRInventorySoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setYearofPeriod(model.getYearofPeriod());
		soapModel.setPreviousPeriod(model.getPreviousPeriod());
		soapModel.setPreviousPeriodCode(model.getPreviousPeriodCode());
		soapModel.setBookId(model.getBookId());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setStampType(model.getStampType());
		soapModel.setStampShortNo(model.getStampShortNo());
		soapModel.setSerialStartNo(model.getSerialStartNo());
		soapModel.setSerialEndNo(model.getSerialEndNo());
		soapModel.setTotalQuantities(model.getTotalQuantities());
		soapModel.setTotalInUse(model.getTotalInUse());
		soapModel.setTotalNotUsed(model.getTotalNotUsed());
		soapModel.setRemark(model.getRemark());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setCheckType(model.getCheckType());
		soapModel.setCheckStatus(model.getCheckStatus());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRInventorySoap[] toSoapModels(VRInventory[] models) {
		VRInventorySoap[] soapModels = new VRInventorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRInventorySoap[][] toSoapModels(VRInventory[][] models) {
		VRInventorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRInventorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRInventorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRInventorySoap[] toSoapModels(List<VRInventory> models) {
		List<VRInventorySoap> soapModels = new ArrayList<VRInventorySoap>(models.size());

		for (VRInventory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRInventorySoap[soapModels.size()]);
	}

	public VRInventorySoap() {
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

	public long getYearofPeriod() {
		return _yearofPeriod;
	}

	public void setYearofPeriod(long yearofPeriod) {
		_yearofPeriod = yearofPeriod;
	}

	public String getPreviousPeriod() {
		return _previousPeriod;
	}

	public void setPreviousPeriod(String previousPeriod) {
		_previousPeriod = previousPeriod;
	}

	public String getPreviousPeriodCode() {
		return _previousPeriodCode;
	}

	public void setPreviousPeriodCode(String previousPeriodCode) {
		_previousPeriodCode = previousPeriodCode;
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

	public long getTotalQuantities() {
		return _totalQuantities;
	}

	public void setTotalQuantities(long totalQuantities) {
		_totalQuantities = totalQuantities;
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

	public String getRemark() {
		return _remark;
	}

	public void setRemark(String remark) {
		_remark = remark;
	}

	public long getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(long corporationId) {
		_corporationId = corporationId;
	}

	public long getCheckType() {
		return _checkType;
	}

	public void setCheckType(long checkType) {
		_checkType = checkType;
	}

	public long getCheckStatus() {
		return _checkStatus;
	}

	public void setCheckStatus(long checkStatus) {
		_checkStatus = checkStatus;
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
	private long _yearofPeriod;
	private String _previousPeriod;
	private String _previousPeriodCode;
	private long _bookId;
	private String _vehicleClass;
	private String _stampType;
	private String _stampShortNo;
	private long _serialStartNo;
	private long _serialEndNo;
	private long _totalQuantities;
	private long _totalInUse;
	private long _totalNotUsed;
	private String _remark;
	private long _corporationId;
	private long _checkType;
	private long _checkStatus;
	private Date _modifyDate;
	private Date _syncDate;
}