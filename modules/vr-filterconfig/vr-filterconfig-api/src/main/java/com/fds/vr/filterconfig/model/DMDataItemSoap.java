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
public class DMDataItemSoap implements Serializable {
	public static DMDataItemSoap toSoapModel(DMDataItem model) {
		DMDataItemSoap soapModel = new DMDataItemSoap();

		soapModel.setId(model.getId());
		soapModel.setDataGroupId(model.getDataGroupId());
		soapModel.setCode_0(model.getCode_0());
		soapModel.setCode_1(model.getCode_1());
		soapModel.setCode_2(model.getCode_2());
		soapModel.setCode_3(model.getCode_3());
		soapModel.setLevel(model.getLevel());
		soapModel.setName(model.getName());
		soapModel.setAltername(model.getAltername());
		soapModel.setDescription(model.getDescription());
		soapModel.setValidatedFrom(model.getValidatedFrom());
		soapModel.setValidatedTo(model.getValidatedTo());
		soapModel.setStatus(model.getStatus());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static DMDataItemSoap[] toSoapModels(DMDataItem[] models) {
		DMDataItemSoap[] soapModels = new DMDataItemSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DMDataItemSoap[][] toSoapModels(DMDataItem[][] models) {
		DMDataItemSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DMDataItemSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DMDataItemSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DMDataItemSoap[] toSoapModels(List<DMDataItem> models) {
		List<DMDataItemSoap> soapModels = new ArrayList<DMDataItemSoap>(models.size());

		for (DMDataItem model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DMDataItemSoap[soapModels.size()]);
	}

	public DMDataItemSoap() {
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

	public long getDataGroupId() {
		return _dataGroupId;
	}

	public void setDataGroupId(long dataGroupId) {
		_dataGroupId = dataGroupId;
	}

	public String getCode_0() {
		return _code_0;
	}

	public void setCode_0(String code_0) {
		_code_0 = code_0;
	}

	public String getCode_1() {
		return _code_1;
	}

	public void setCode_1(String code_1) {
		_code_1 = code_1;
	}

	public String getCode_2() {
		return _code_2;
	}

	public void setCode_2(String code_2) {
		_code_2 = code_2;
	}

	public String getCode_3() {
		return _code_3;
	}

	public void setCode_3(String code_3) {
		_code_3 = code_3;
	}

	public int getLevel() {
		return _level;
	}

	public void setLevel(int level) {
		_level = level;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getAltername() {
		return _altername;
	}

	public void setAltername(String altername) {
		_altername = altername;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Date getValidatedFrom() {
		return _validatedFrom;
	}

	public void setValidatedFrom(Date validatedFrom) {
		_validatedFrom = validatedFrom;
	}

	public Date getValidatedTo() {
		return _validatedTo;
	}

	public void setValidatedTo(Date validatedTo) {
		_validatedTo = validatedTo;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private long _dataGroupId;
	private String _code_0;
	private String _code_1;
	private String _code_2;
	private String _code_3;
	private int _level;
	private String _name;
	private String _altername;
	private String _description;
	private Date _validatedFrom;
	private Date _validatedTo;
	private int _status;
	private Date _syncDate;
}