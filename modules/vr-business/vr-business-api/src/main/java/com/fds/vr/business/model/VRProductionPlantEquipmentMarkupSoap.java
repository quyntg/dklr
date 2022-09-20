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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRProductionPlantEquipmentMarkupSoap implements Serializable {
	public static VRProductionPlantEquipmentMarkupSoap toSoapModel(
		VRProductionPlantEquipmentMarkup model) {
		VRProductionPlantEquipmentMarkupSoap soapModel = new VRProductionPlantEquipmentMarkupSoap();

		soapModel.setId(model.getId());
		soapModel.setProductClassificationCode(model.getProductClassificationCode());
		soapModel.setProductionPlantEquipmentId(model.getProductionPlantEquipmentId());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static VRProductionPlantEquipmentMarkupSoap[] toSoapModels(
		VRProductionPlantEquipmentMarkup[] models) {
		VRProductionPlantEquipmentMarkupSoap[] soapModels = new VRProductionPlantEquipmentMarkupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRProductionPlantEquipmentMarkupSoap[][] toSoapModels(
		VRProductionPlantEquipmentMarkup[][] models) {
		VRProductionPlantEquipmentMarkupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRProductionPlantEquipmentMarkupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRProductionPlantEquipmentMarkupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRProductionPlantEquipmentMarkupSoap[] toSoapModels(
		List<VRProductionPlantEquipmentMarkup> models) {
		List<VRProductionPlantEquipmentMarkupSoap> soapModels = new ArrayList<VRProductionPlantEquipmentMarkupSoap>(models.size());

		for (VRProductionPlantEquipmentMarkup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRProductionPlantEquipmentMarkupSoap[soapModels.size()]);
	}

	public VRProductionPlantEquipmentMarkupSoap() {
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

	public String getProductClassificationCode() {
		return _productClassificationCode;
	}

	public void setProductClassificationCode(String productClassificationCode) {
		_productClassificationCode = productClassificationCode;
	}

	public long getProductionPlantEquipmentId() {
		return _productionPlantEquipmentId;
	}

	public void setProductionPlantEquipmentId(long productionPlantEquipmentId) {
		_productionPlantEquipmentId = productionPlantEquipmentId;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private long _id;
	private String _productClassificationCode;
	private long _productionPlantEquipmentId;
	private int _status;
}