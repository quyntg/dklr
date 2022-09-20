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
public class VRInputSheetSoap implements Serializable {
	public static VRInputSheetSoap toSoapModel(VRInputSheet model) {
		VRInputSheetSoap soapModel = new VRInputSheetSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setInputSheetNo(model.getInputSheetNo());
		soapModel.setInputSheetDate(model.getInputSheetDate());
		soapModel.setOriginalDocumentNo(model.getOriginalDocumentNo());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setInputSheetType(model.getInputSheetType());
		soapModel.setMaker(model.getMaker());
		soapModel.setChecker(model.getChecker());
		soapModel.setApprover(model.getApprover());
		soapModel.setDeliveryName(model.getDeliveryName());
		soapModel.setInventoryName(model.getInventoryName());
		soapModel.setInventoryPlace(model.getInventoryPlace());
		soapModel.setInventoryDate(model.getInventoryDate());
		soapModel.setBookIDList(model.getBookIDList());
		soapModel.setIsApproval(model.getIsApproval());
		soapModel.setTotalQuantities(model.getTotalQuantities());
		soapModel.setTotalAmount(model.getTotalAmount());
		soapModel.setAmountInWords(model.getAmountInWords());
		soapModel.setRemark(model.getRemark());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRInputSheetSoap[] toSoapModels(VRInputSheet[] models) {
		VRInputSheetSoap[] soapModels = new VRInputSheetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRInputSheetSoap[][] toSoapModels(VRInputSheet[][] models) {
		VRInputSheetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRInputSheetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRInputSheetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRInputSheetSoap[] toSoapModels(List<VRInputSheet> models) {
		List<VRInputSheetSoap> soapModels = new ArrayList<VRInputSheetSoap>(models.size());

		for (VRInputSheet model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRInputSheetSoap[soapModels.size()]);
	}

	public VRInputSheetSoap() {
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

	public String getInputSheetNo() {
		return _inputSheetNo;
	}

	public void setInputSheetNo(String inputSheetNo) {
		_inputSheetNo = inputSheetNo;
	}

	public Date getInputSheetDate() {
		return _inputSheetDate;
	}

	public void setInputSheetDate(Date inputSheetDate) {
		_inputSheetDate = inputSheetDate;
	}

	public String getOriginalDocumentNo() {
		return _originalDocumentNo;
	}

	public void setOriginalDocumentNo(String originalDocumentNo) {
		_originalDocumentNo = originalDocumentNo;
	}

	public long getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(long corporationId) {
		_corporationId = corporationId;
	}

	public long getInputSheetType() {
		return _inputSheetType;
	}

	public void setInputSheetType(long inputSheetType) {
		_inputSheetType = inputSheetType;
	}

	public String getMaker() {
		return _maker;
	}

	public void setMaker(String maker) {
		_maker = maker;
	}

	public String getChecker() {
		return _checker;
	}

	public void setChecker(String checker) {
		_checker = checker;
	}

	public String getApprover() {
		return _approver;
	}

	public void setApprover(String approver) {
		_approver = approver;
	}

	public String getDeliveryName() {
		return _deliveryName;
	}

	public void setDeliveryName(String deliveryName) {
		_deliveryName = deliveryName;
	}

	public String getInventoryName() {
		return _inventoryName;
	}

	public void setInventoryName(String inventoryName) {
		_inventoryName = inventoryName;
	}

	public String getInventoryPlace() {
		return _inventoryPlace;
	}

	public void setInventoryPlace(String inventoryPlace) {
		_inventoryPlace = inventoryPlace;
	}

	public Date getInventoryDate() {
		return _inventoryDate;
	}

	public void setInventoryDate(Date inventoryDate) {
		_inventoryDate = inventoryDate;
	}

	public String getBookIDList() {
		return _bookIDList;
	}

	public void setBookIDList(String bookIDList) {
		_bookIDList = bookIDList;
	}

	public long getIsApproval() {
		return _isApproval;
	}

	public void setIsApproval(long isApproval) {
		_isApproval = isApproval;
	}

	public long getTotalQuantities() {
		return _totalQuantities;
	}

	public void setTotalQuantities(long totalQuantities) {
		_totalQuantities = totalQuantities;
	}

	public long getTotalAmount() {
		return _totalAmount;
	}

	public void setTotalAmount(long totalAmount) {
		_totalAmount = totalAmount;
	}

	public String getAmountInWords() {
		return _amountInWords;
	}

	public void setAmountInWords(String amountInWords) {
		_amountInWords = amountInWords;
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
	private String _inputSheetNo;
	private Date _inputSheetDate;
	private String _originalDocumentNo;
	private long _corporationId;
	private long _inputSheetType;
	private String _maker;
	private String _checker;
	private String _approver;
	private String _deliveryName;
	private String _inventoryName;
	private String _inventoryPlace;
	private Date _inventoryDate;
	private String _bookIDList;
	private long _isApproval;
	private long _totalQuantities;
	private long _totalAmount;
	private String _amountInWords;
	private String _remark;
	private Date _modifyDate;
	private Date _syncDate;
}