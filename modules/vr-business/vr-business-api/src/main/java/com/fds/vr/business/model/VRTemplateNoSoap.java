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
public class VRTemplateNoSoap implements Serializable {
	public static VRTemplateNoSoap toSoapModel(VRTemplateNo model) {
		VRTemplateNoSoap soapModel = new VRTemplateNoSoap();

		soapModel.setId(model.getId());
		soapModel.setPatternNo(model.getPatternNo());
		soapModel.setYear(model.getYear());
		soapModel.setInitNumber(model.getInitNumber());

		return soapModel;
	}

	public static VRTemplateNoSoap[] toSoapModels(VRTemplateNo[] models) {
		VRTemplateNoSoap[] soapModels = new VRTemplateNoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRTemplateNoSoap[][] toSoapModels(VRTemplateNo[][] models) {
		VRTemplateNoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRTemplateNoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRTemplateNoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRTemplateNoSoap[] toSoapModels(List<VRTemplateNo> models) {
		List<VRTemplateNoSoap> soapModels = new ArrayList<VRTemplateNoSoap>(models.size());

		for (VRTemplateNo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRTemplateNoSoap[soapModels.size()]);
	}

	public VRTemplateNoSoap() {
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

	public String getPatternNo() {
		return _patternNo;
	}

	public void setPatternNo(String patternNo) {
		_patternNo = patternNo;
	}

	public int getYear() {
		return _year;
	}

	public void setYear(int year) {
		_year = year;
	}

	public int getInitNumber() {
		return _initNumber;
	}

	public void setInitNumber(int initNumber) {
		_initNumber = initNumber;
	}

	private long _id;
	private String _patternNo;
	private int _year;
	private int _initNumber;
}