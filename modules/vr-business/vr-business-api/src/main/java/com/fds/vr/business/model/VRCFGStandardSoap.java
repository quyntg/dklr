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
public class VRCFGStandardSoap implements Serializable {
	public static VRCFGStandardSoap toSoapModel(VRCFGStandard model) {
		VRCFGStandardSoap soapModel = new VRCFGStandardSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setVehicleType(model.getVehicleType());
		soapModel.setStandardCode(model.getStandardCode());
		soapModel.setStandardName(model.getStandardName());
		soapModel.setStandardDescription(model.getStandardDescription());
		soapModel.setStandardExpiredDate(model.getStandardExpiredDate());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setStandardType(model.getStandardType());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRCFGStandardSoap[] toSoapModels(VRCFGStandard[] models) {
		VRCFGStandardSoap[] soapModels = new VRCFGStandardSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRCFGStandardSoap[][] toSoapModels(VRCFGStandard[][] models) {
		VRCFGStandardSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRCFGStandardSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRCFGStandardSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRCFGStandardSoap[] toSoapModels(List<VRCFGStandard> models) {
		List<VRCFGStandardSoap> soapModels = new ArrayList<VRCFGStandardSoap>(models.size());

		for (VRCFGStandard model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRCFGStandardSoap[soapModels.size()]);
	}

	public VRCFGStandardSoap() {
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

	public String getVehicleClass() {
		return _vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	public String getVehicleType() {
		return _vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		_vehicleType = vehicleType;
	}

	public String getStandardCode() {
		return _standardCode;
	}

	public void setStandardCode(String standardCode) {
		_standardCode = standardCode;
	}

	public String getStandardName() {
		return _standardName;
	}

	public void setStandardName(String standardName) {
		_standardName = standardName;
	}

	public String getStandardDescription() {
		return _standardDescription;
	}

	public void setStandardDescription(String standardDescription) {
		_standardDescription = standardDescription;
	}

	public Date getStandardExpiredDate() {
		return _standardExpiredDate;
	}

	public void setStandardExpiredDate(Date standardExpiredDate) {
		_standardExpiredDate = standardExpiredDate;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getStandardType() {
		return _standardType;
	}

	public void setStandardType(String standardType) {
		_standardType = standardType;
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
	private String _vehicleClass;
	private String _vehicleType;
	private String _standardCode;
	private String _standardName;
	private String _standardDescription;
	private Date _standardExpiredDate;
	private long _sequenceNo;
	private String _standardType;
	private Date _modifyDate;
	private Date _syncDate;
}