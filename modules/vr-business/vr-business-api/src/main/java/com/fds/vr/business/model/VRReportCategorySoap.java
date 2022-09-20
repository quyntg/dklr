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
public class VRReportCategorySoap implements Serializable {
	public static VRReportCategorySoap toSoapModel(VRReportCategory model) {
		VRReportCategorySoap soapModel = new VRReportCategorySoap();

		soapModel.setId(model.getId());
		soapModel.setRptCode(model.getRptCode());
		soapModel.setRptName(model.getRptName());
		soapModel.setRptDescription(model.getRptDescription());
		soapModel.setRptGroup(model.getRptGroup());
		soapModel.setRptLevel(model.getRptLevel());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setJasperFileTemplate(model.getJasperFileTemplate());
		soapModel.setExcelFileTemplate(model.getExcelFileTemplate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static VRReportCategorySoap[] toSoapModels(VRReportCategory[] models) {
		VRReportCategorySoap[] soapModels = new VRReportCategorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRReportCategorySoap[][] toSoapModels(
		VRReportCategory[][] models) {
		VRReportCategorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRReportCategorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRReportCategorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRReportCategorySoap[] toSoapModels(
		List<VRReportCategory> models) {
		List<VRReportCategorySoap> soapModels = new ArrayList<VRReportCategorySoap>(models.size());

		for (VRReportCategory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRReportCategorySoap[soapModels.size()]);
	}

	public VRReportCategorySoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getRptCode() {
		return _rptCode;
	}

	public void setRptCode(String rptCode) {
		_rptCode = rptCode;
	}

	public String getRptName() {
		return _rptName;
	}

	public void setRptName(String rptName) {
		_rptName = rptName;
	}

	public String getRptDescription() {
		return _rptDescription;
	}

	public void setRptDescription(String rptDescription) {
		_rptDescription = rptDescription;
	}

	public String getRptGroup() {
		return _rptGroup;
	}

	public void setRptGroup(String rptGroup) {
		_rptGroup = rptGroup;
	}

	public int getRptLevel() {
		return _rptLevel;
	}

	public void setRptLevel(int rptLevel) {
		_rptLevel = rptLevel;
	}

	public int getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getJasperFileTemplate() {
		return _jasperFileTemplate;
	}

	public void setJasperFileTemplate(String jasperFileTemplate) {
		_jasperFileTemplate = jasperFileTemplate;
	}

	public String getExcelFileTemplate() {
		return _excelFileTemplate;
	}

	public void setExcelFileTemplate(String excelFileTemplate) {
		_excelFileTemplate = excelFileTemplate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private int _id;
	private String _rptCode;
	private String _rptName;
	private String _rptDescription;
	private String _rptGroup;
	private int _rptLevel;
	private int _sequenceNo;
	private String _jasperFileTemplate;
	private String _excelFileTemplate;
	private Date _modifiedDate;
}