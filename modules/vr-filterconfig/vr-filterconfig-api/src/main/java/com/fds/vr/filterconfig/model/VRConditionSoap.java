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

package com.fds.vr.filterconfig.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author NhanHoang
 * @generated
 */
@ProviderType
public class VRConditionSoap implements Serializable {
	public static VRConditionSoap toSoapModel(VRCondition model) {
		VRConditionSoap soapModel = new VRConditionSoap();

		soapModel.setId(model.getId());
		soapModel.setFilterModuleCode(model.getFilterModuleCode());
		soapModel.setFilterTableField(model.getFilterTableField());
		soapModel.setFilterTableName(model.getFilterTableName());
		soapModel.setSpecificationCode(model.getSpecificationCode());
		soapModel.setSpecificationDisplayName(model.getSpecificationDisplayName());
		soapModel.setSpecificationDataCollectionID(model.getSpecificationDataCollectionID());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setSpecificationBasicUnit(model.getSpecificationBasicUnit());
		soapModel.setSpecificationStandard(model.getSpecificationStandard());
		soapModel.setSpecificationGroup(model.getSpecificationGroup());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRConditionSoap[] toSoapModels(VRCondition[] models) {
		VRConditionSoap[] soapModels = new VRConditionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRConditionSoap[][] toSoapModels(VRCondition[][] models) {
		VRConditionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRConditionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRConditionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRConditionSoap[] toSoapModels(List<VRCondition> models) {
		List<VRConditionSoap> soapModels = new ArrayList<VRConditionSoap>(models.size());

		for (VRCondition model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRConditionSoap[soapModels.size()]);
	}

	public VRConditionSoap() {
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

	public String getFilterModuleCode() {
		return _filterModuleCode;
	}

	public void setFilterModuleCode(String filterModuleCode) {
		_filterModuleCode = filterModuleCode;
	}

	public String getFilterTableField() {
		return _filterTableField;
	}

	public void setFilterTableField(String filterTableField) {
		_filterTableField = filterTableField;
	}

	public String getFilterTableName() {
		return _filterTableName;
	}

	public void setFilterTableName(String filterTableName) {
		_filterTableName = filterTableName;
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

	public String getSpecificationDataCollectionID() {
		return _specificationDataCollectionID;
	}

	public void setSpecificationDataCollectionID(
		String specificationDataCollectionID) {
		_specificationDataCollectionID = specificationDataCollectionID;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
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

	public String getSpecificationGroup() {
		return _specificationGroup;
	}

	public void setSpecificationGroup(String specificationGroup) {
		_specificationGroup = specificationGroup;
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
	private String _filterModuleCode;
	private String _filterTableField;
	private String _filterTableName;
	private String _specificationCode;
	private String _specificationDisplayName;
	private String _specificationDataCollectionID;
	private long _sequenceNo;
	private String _specificationBasicUnit;
	private String _specificationStandard;
	private String _specificationGroup;
	private Date _modifyDate;
	private Date _syncDate;
}