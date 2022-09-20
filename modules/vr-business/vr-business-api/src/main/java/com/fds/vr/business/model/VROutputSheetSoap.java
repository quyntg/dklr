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
public class VROutputSheetSoap implements Serializable {
	public static VROutputSheetSoap toSoapModel(VROutputSheet model) {
		VROutputSheetSoap soapModel = new VROutputSheetSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setOutputSheetNo(model.getOutputSheetNo());
		soapModel.setOutputSheetDate(model.getOutputSheetDate());
		soapModel.setOriginalDocumentNo(model.getOriginalDocumentNo());
		soapModel.setSupplierCorporationId(model.getSupplierCorporationId());
		soapModel.setOutputSheetType(model.getOutputSheetType());
		soapModel.setMaker(model.getMaker());
		soapModel.setChecker(model.getChecker());
		soapModel.setApprover(model.getApprover());
		soapModel.setReceiverName(model.getReceiverName());
		soapModel.setReceiverPlace(model.getReceiverPlace());
		soapModel.setReceiverRequest(model.getReceiverRequest());
		soapModel.setInventoryName(model.getInventoryName());
		soapModel.setInventoryPlace(model.getInventoryPlace());
		soapModel.setInventoryDate(model.getInventoryDate());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setIssueId(model.getIssueId());
		soapModel.setPurchaserId(model.getPurchaserId());
		soapModel.setPurchaserCorporationId(model.getPurchaserCorporationId());
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

	public static VROutputSheetSoap[] toSoapModels(VROutputSheet[] models) {
		VROutputSheetSoap[] soapModels = new VROutputSheetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VROutputSheetSoap[][] toSoapModels(VROutputSheet[][] models) {
		VROutputSheetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VROutputSheetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VROutputSheetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VROutputSheetSoap[] toSoapModels(List<VROutputSheet> models) {
		List<VROutputSheetSoap> soapModels = new ArrayList<VROutputSheetSoap>(models.size());

		for (VROutputSheet model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VROutputSheetSoap[soapModels.size()]);
	}

	public VROutputSheetSoap() {
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

	public String getOutputSheetNo() {
		return _outputSheetNo;
	}

	public void setOutputSheetNo(String outputSheetNo) {
		_outputSheetNo = outputSheetNo;
	}

	public Date getOutputSheetDate() {
		return _outputSheetDate;
	}

	public void setOutputSheetDate(Date outputSheetDate) {
		_outputSheetDate = outputSheetDate;
	}

	public String getOriginalDocumentNo() {
		return _originalDocumentNo;
	}

	public void setOriginalDocumentNo(String originalDocumentNo) {
		_originalDocumentNo = originalDocumentNo;
	}

	public long getSupplierCorporationId() {
		return _supplierCorporationId;
	}

	public void setSupplierCorporationId(long supplierCorporationId) {
		_supplierCorporationId = supplierCorporationId;
	}

	public long getOutputSheetType() {
		return _outputSheetType;
	}

	public void setOutputSheetType(long outputSheetType) {
		_outputSheetType = outputSheetType;
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

	public String getReceiverName() {
		return _receiverName;
	}

	public void setReceiverName(String receiverName) {
		_receiverName = receiverName;
	}

	public String getReceiverPlace() {
		return _receiverPlace;
	}

	public void setReceiverPlace(String receiverPlace) {
		_receiverPlace = receiverPlace;
	}

	public String getReceiverRequest() {
		return _receiverRequest;
	}

	public void setReceiverRequest(String receiverRequest) {
		_receiverRequest = receiverRequest;
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

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public long getIssueId() {
		return _issueId;
	}

	public void setIssueId(long issueId) {
		_issueId = issueId;
	}

	public long getPurchaserId() {
		return _purchaserId;
	}

	public void setPurchaserId(long purchaserId) {
		_purchaserId = purchaserId;
	}

	public long getPurchaserCorporationId() {
		return _purchaserCorporationId;
	}

	public void setPurchaserCorporationId(long purchaserCorporationId) {
		_purchaserCorporationId = purchaserCorporationId;
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
	private String _outputSheetNo;
	private Date _outputSheetDate;
	private String _originalDocumentNo;
	private long _supplierCorporationId;
	private long _outputSheetType;
	private String _maker;
	private String _checker;
	private String _approver;
	private String _receiverName;
	private String _receiverPlace;
	private String _receiverRequest;
	private String _inventoryName;
	private String _inventoryPlace;
	private Date _inventoryDate;
	private long _dossierId;
	private long _issueId;
	private long _purchaserId;
	private long _purchaserCorporationId;
	private String _bookIDList;
	private long _isApproval;
	private long _totalQuantities;
	private long _totalAmount;
	private String _amountInWords;
	private String _remark;
	private Date _modifyDate;
	private Date _syncDate;
}