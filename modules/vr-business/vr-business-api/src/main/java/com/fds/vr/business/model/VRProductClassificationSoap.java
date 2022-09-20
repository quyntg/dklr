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
public class VRProductClassificationSoap implements Serializable {
	public static VRProductClassificationSoap toSoapModel(
		VRProductClassification model) {
		VRProductClassificationSoap soapModel = new VRProductClassificationSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setProductPlantID(model.getProductPlantID());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setProductClassificationCode(model.getProductClassificationCode());
		soapModel.setProductClassificationDescription(model.getProductClassificationDescription());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRProductClassificationSoap[] toSoapModels(
		VRProductClassification[] models) {
		VRProductClassificationSoap[] soapModels = new VRProductClassificationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRProductClassificationSoap[][] toSoapModels(
		VRProductClassification[][] models) {
		VRProductClassificationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRProductClassificationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRProductClassificationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRProductClassificationSoap[] toSoapModels(
		List<VRProductClassification> models) {
		List<VRProductClassificationSoap> soapModels = new ArrayList<VRProductClassificationSoap>(models.size());

		for (VRProductClassification model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRProductClassificationSoap[soapModels.size()]);
	}

	public VRProductClassificationSoap() {
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

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
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
	private long _sequenceNo;
	private String _productClassificationCode;
	private String _productClassificationDescription;
	private Date _modifyDate;
	private Date _syncDate;
}