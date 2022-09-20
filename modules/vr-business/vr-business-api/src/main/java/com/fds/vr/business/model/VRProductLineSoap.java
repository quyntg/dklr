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
public class VRProductLineSoap implements Serializable {
	public static VRProductLineSoap toSoapModel(VRProductLine model) {
		VRProductLineSoap soapModel = new VRProductLineSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setProductPlantID(model.getProductPlantID());
		soapModel.setProductTypeID(model.getProductTypeID());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setTrademark(model.getTrademark());
		soapModel.setTrademarkName(model.getTrademarkName());
		soapModel.setCommercialName(model.getCommercialName());
		soapModel.setModelCode(model.getModelCode());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRProductLineSoap[] toSoapModels(VRProductLine[] models) {
		VRProductLineSoap[] soapModels = new VRProductLineSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRProductLineSoap[][] toSoapModels(VRProductLine[][] models) {
		VRProductLineSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRProductLineSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRProductLineSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRProductLineSoap[] toSoapModels(List<VRProductLine> models) {
		List<VRProductLineSoap> soapModels = new ArrayList<VRProductLineSoap>(models.size());

		for (VRProductLine model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRProductLineSoap[soapModels.size()]);
	}

	public VRProductLineSoap() {
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

	public long getProductPlantID() {
		return _productPlantID;
	}

	public void setProductPlantID(long productPlantID) {
		_productPlantID = productPlantID;
	}

	public long getProductTypeID() {
		return _productTypeID;
	}

	public void setProductTypeID(long productTypeID) {
		_productTypeID = productTypeID;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getTrademark() {
		return _trademark;
	}

	public void setTrademark(String trademark) {
		_trademark = trademark;
	}

	public String getTrademarkName() {
		return _trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		_trademarkName = trademarkName;
	}

	public String getCommercialName() {
		return _commercialName;
	}

	public void setCommercialName(String commercialName) {
		_commercialName = commercialName;
	}

	public String getModelCode() {
		return _modelCode;
	}

	public void setModelCode(String modelCode) {
		_modelCode = modelCode;
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
	private long _productPlantID;
	private long _productTypeID;
	private long _sequenceNo;
	private String _trademark;
	private String _trademarkName;
	private String _commercialName;
	private String _modelCode;
	private Date _modifyDate;
	private Date _syncDate;
}