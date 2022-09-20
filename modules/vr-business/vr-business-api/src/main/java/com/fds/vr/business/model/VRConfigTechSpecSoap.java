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
public class VRConfigTechSpecSoap implements Serializable {
	public static VRConfigTechSpecSoap toSoapModel(VRConfigTechSpec model) {
		VRConfigTechSpecSoap soapModel = new VRConfigTechSpecSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setVehicleType(model.getVehicleType());
		soapModel.setVehicletypeName(model.getVehicletypeName());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setSpecificationName(model.getSpecificationName());
		soapModel.setSpecificationCode(model.getSpecificationCode());
		soapModel.setSpecificationDisplayName(model.getSpecificationDisplayName());
		soapModel.setSpecCategory(model.getSpecCategory());
		soapModel.setSpecificationGroup(model.getSpecificationGroup());
		soapModel.setSpecificationDataCollectionId(model.getSpecificationDataCollectionId());
		soapModel.setSpecificationBasicUnit(model.getSpecificationBasicUnit());
		soapModel.setSpecificationStandard(model.getSpecificationStandard());
		soapModel.setSpecificationEntryType(model.getSpecificationEntryType());
		soapModel.setSpecificationEntryPlaceholder(model.getSpecificationEntryPlaceholder());
		soapModel.setSpecificationMandatory(model.getSpecificationMandatory());
		soapModel.setModule(model.getModule());
		soapModel.setSynchDate(model.getSynchDate());

		return soapModel;
	}

	public static VRConfigTechSpecSoap[] toSoapModels(VRConfigTechSpec[] models) {
		VRConfigTechSpecSoap[] soapModels = new VRConfigTechSpecSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRConfigTechSpecSoap[][] toSoapModels(
		VRConfigTechSpec[][] models) {
		VRConfigTechSpecSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRConfigTechSpecSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRConfigTechSpecSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRConfigTechSpecSoap[] toSoapModels(
		List<VRConfigTechSpec> models) {
		List<VRConfigTechSpecSoap> soapModels = new ArrayList<VRConfigTechSpecSoap>(models.size());

		for (VRConfigTechSpec model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRConfigTechSpecSoap[soapModels.size()]);
	}

	public VRConfigTechSpecSoap() {
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

	public String getVehicletypeName() {
		return _vehicletypeName;
	}

	public void setVehicletypeName(String vehicletypeName) {
		_vehicletypeName = vehicletypeName;
	}

	public int getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getSpecificationName() {
		return _specificationName;
	}

	public void setSpecificationName(String specificationName) {
		_specificationName = specificationName;
	}

	public String getSpecificationCode() {
		return _specificationCode;
	}

	public void setSpecificationCode(String specificationCode) {
		_specificationCode = specificationCode;
	}

	public String getSpecificationDisplayName() {
		return _specificationDisplayName;
	}

	public void setSpecificationDisplayName(String specificationDisplayName) {
		_specificationDisplayName = specificationDisplayName;
	}

	public String getSpecCategory() {
		return _specCategory;
	}

	public void setSpecCategory(String specCategory) {
		_specCategory = specCategory;
	}

	public int getSpecificationGroup() {
		return _specificationGroup;
	}

	public void setSpecificationGroup(int specificationGroup) {
		_specificationGroup = specificationGroup;
	}

	public String getSpecificationDataCollectionId() {
		return _specificationDataCollectionId;
	}

	public void setSpecificationDataCollectionId(
		String specificationDataCollectionId) {
		_specificationDataCollectionId = specificationDataCollectionId;
	}

	public String getSpecificationBasicUnit() {
		return _specificationBasicUnit;
	}

	public void setSpecificationBasicUnit(String specificationBasicUnit) {
		_specificationBasicUnit = specificationBasicUnit;
	}

	public String getSpecificationStandard() {
		return _specificationStandard;
	}

	public void setSpecificationStandard(String specificationStandard) {
		_specificationStandard = specificationStandard;
	}

	public String getSpecificationEntryType() {
		return _specificationEntryType;
	}

	public void setSpecificationEntryType(String specificationEntryType) {
		_specificationEntryType = specificationEntryType;
	}

	public String getSpecificationEntryPlaceholder() {
		return _specificationEntryPlaceholder;
	}

	public void setSpecificationEntryPlaceholder(
		String specificationEntryPlaceholder) {
		_specificationEntryPlaceholder = specificationEntryPlaceholder;
	}

	public int getSpecificationMandatory() {
		return _specificationMandatory;
	}

	public void setSpecificationMandatory(int specificationMandatory) {
		_specificationMandatory = specificationMandatory;
	}

	public String getModule() {
		return _module;
	}

	public void setModule(String module) {
		_module = module;
	}

	public Date getSynchDate() {
		return _synchDate;
	}

	public void setSynchDate(Date synchDate) {
		_synchDate = synchDate;
	}

	private long _id;
	private String _vehicleClass;
	private String _vehicleType;
	private String _vehicletypeName;
	private int _sequenceNo;
	private String _specificationName;
	private String _specificationCode;
	private String _specificationDisplayName;
	private String _specCategory;
	private int _specificationGroup;
	private String _specificationDataCollectionId;
	private String _specificationBasicUnit;
	private String _specificationStandard;
	private String _specificationEntryType;
	private String _specificationEntryPlaceholder;
	private int _specificationMandatory;
	private String _module;
	private Date _synchDate;
}