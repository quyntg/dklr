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
public class VRProductTypeSoap implements Serializable {
	public static VRProductTypeSoap toSoapModel(VRProductType model) {
		VRProductTypeSoap soapModel = new VRProductTypeSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setVehicleTypeCode(model.getVehicleTypeCode());
		soapModel.setVehicleTypeDescription(model.getVehicleTypeDescription());
		soapModel.setProductClassificationCode(model.getProductClassificationCode());
		soapModel.setProductClassificationDescription(model.getProductClassificationDescription());
		soapModel.setTrademark(model.getTrademark());
		soapModel.setTrademarkName(model.getTrademarkName());
		soapModel.setCommercialName(model.getCommercialName());
		soapModel.setModelCode(model.getModelCode());
		soapModel.setDesignSymbolNo(model.getDesignSymbolNo());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());
		soapModel.setProductionPlantId(model.getProductionPlantId());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());

		return soapModel;
	}

	public static VRProductTypeSoap[] toSoapModels(VRProductType[] models) {
		VRProductTypeSoap[] soapModels = new VRProductTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRProductTypeSoap[][] toSoapModels(VRProductType[][] models) {
		VRProductTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRProductTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRProductTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRProductTypeSoap[] toSoapModels(List<VRProductType> models) {
		List<VRProductTypeSoap> soapModels = new ArrayList<VRProductTypeSoap>(models.size());

		for (VRProductType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRProductTypeSoap[soapModels.size()]);
	}

	public VRProductTypeSoap() {
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

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getVehicleClass() {
		return _vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	public String getVehicleTypeCode() {
		return _vehicleTypeCode;
	}

	public void setVehicleTypeCode(String vehicleTypeCode) {
		_vehicleTypeCode = vehicleTypeCode;
	}

	public String getVehicleTypeDescription() {
		return _vehicleTypeDescription;
	}

	public void setVehicleTypeDescription(String vehicleTypeDescription) {
		_vehicleTypeDescription = vehicleTypeDescription;
	}

	public String getProductClassificationCode() {
		return _productClassificationCode;
	}

	public void setProductClassificationCode(String productClassificationCode) {
		_productClassificationCode = productClassificationCode;
	}

	public String getProductClassificationDescription() {
		return _productClassificationDescription;
	}

	public void setProductClassificationDescription(
		String productClassificationDescription) {
		_productClassificationDescription = productClassificationDescription;
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

	public String getDesignSymbolNo() {
		return _designSymbolNo;
	}

	public void setDesignSymbolNo(String designSymbolNo) {
		_designSymbolNo = designSymbolNo;
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

	public long getProductionPlantId() {
		return _productionPlantId;
	}

	public void setProductionPlantId(long productionPlantId) {
		_productionPlantId = productionPlantId;
	}

	public String getProductionPlantCode() {
		return _productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		_productionPlantCode = productionPlantCode;
	}

	private long _id;
	private long _mtCore;
	private long _sequenceNo;
	private String _vehicleClass;
	private String _vehicleTypeCode;
	private String _vehicleTypeDescription;
	private String _productClassificationCode;
	private String _productClassificationDescription;
	private String _trademark;
	private String _trademarkName;
	private String _commercialName;
	private String _modelCode;
	private String _designSymbolNo;
	private Date _modifyDate;
	private Date _syncDate;
	private long _productionPlantId;
	private String _productionPlantCode;
}