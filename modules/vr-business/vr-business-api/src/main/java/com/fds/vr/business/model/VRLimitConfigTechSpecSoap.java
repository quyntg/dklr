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
public class VRLimitConfigTechSpecSoap implements Serializable {
	public static VRLimitConfigTechSpecSoap toSoapModel(
		VRLimitConfigTechSpec model) {
		VRLimitConfigTechSpecSoap soapModel = new VRLimitConfigTechSpecSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleType(model.getVehicleType());
		soapModel.setVehicleTypeName(model.getVehicleTypeName());
		soapModel.setMarkupSMRM(model.getMarkupSMRM());
		soapModel.setSearchingDriveConfig(model.getSearchingDriveConfig());
		soapModel.setSearchingDriveConfigDesc(model.getSearchingDriveConfigDesc());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setSpecificationCode(model.getSpecificationCode());
		soapModel.setSpecificationName(model.getSpecificationName());
		soapModel.setSynchDate(model.getSynchDate());

		return soapModel;
	}

	public static VRLimitConfigTechSpecSoap[] toSoapModels(
		VRLimitConfigTechSpec[] models) {
		VRLimitConfigTechSpecSoap[] soapModels = new VRLimitConfigTechSpecSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRLimitConfigTechSpecSoap[][] toSoapModels(
		VRLimitConfigTechSpec[][] models) {
		VRLimitConfigTechSpecSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRLimitConfigTechSpecSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRLimitConfigTechSpecSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRLimitConfigTechSpecSoap[] toSoapModels(
		List<VRLimitConfigTechSpec> models) {
		List<VRLimitConfigTechSpecSoap> soapModels = new ArrayList<VRLimitConfigTechSpecSoap>(models.size());

		for (VRLimitConfigTechSpec model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRLimitConfigTechSpecSoap[soapModels.size()]);
	}

	public VRLimitConfigTechSpecSoap() {
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

	public String getVehicleType() {
		return _vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		_vehicleType = vehicleType;
	}

	public String getVehicleTypeName() {
		return _vehicleTypeName;
	}

	public void setVehicleTypeName(String vehicleTypeName) {
		_vehicleTypeName = vehicleTypeName;
	}

	public String getMarkupSMRM() {
		return _markupSMRM;
	}

	public void setMarkupSMRM(String markupSMRM) {
		_markupSMRM = markupSMRM;
	}

	public long getSearchingDriveConfig() {
		return _searchingDriveConfig;
	}

	public void setSearchingDriveConfig(long searchingDriveConfig) {
		_searchingDriveConfig = searchingDriveConfig;
	}

	public String getSearchingDriveConfigDesc() {
		return _searchingDriveConfigDesc;
	}

	public void setSearchingDriveConfigDesc(String searchingDriveConfigDesc) {
		_searchingDriveConfigDesc = searchingDriveConfigDesc;
	}

	public int getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getSpecificationCode() {
		return _specificationCode;
	}

	public void setSpecificationCode(String specificationCode) {
		_specificationCode = specificationCode;
	}

	public String getSpecificationName() {
		return _specificationName;
	}

	public void setSpecificationName(String specificationName) {
		_specificationName = specificationName;
	}

	public Date getSynchDate() {
		return _synchDate;
	}

	public void setSynchDate(Date synchDate) {
		_synchDate = synchDate;
	}

	private long _id;
	private String _vehicleType;
	private String _vehicleTypeName;
	private String _markupSMRM;
	private long _searchingDriveConfig;
	private String _searchingDriveConfigDesc;
	private int _sequenceNo;
	private String _specificationCode;
	private String _specificationName;
	private Date _synchDate;
}