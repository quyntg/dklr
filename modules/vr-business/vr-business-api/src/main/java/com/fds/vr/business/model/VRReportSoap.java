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
public class VRReportSoap implements Serializable {
	public static VRReportSoap toSoapModel(VRReport model) {
		VRReportSoap soapModel = new VRReportSoap();

		soapModel.setId(model.getId());
		soapModel.setReportCode(model.getReportCode());
		soapModel.setReportName(model.getReportName());
		soapModel.setFormReport(model.getFormReport());

		return soapModel;
	}

	public static VRReportSoap[] toSoapModels(VRReport[] models) {
		VRReportSoap[] soapModels = new VRReportSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRReportSoap[][] toSoapModels(VRReport[][] models) {
		VRReportSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRReportSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRReportSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRReportSoap[] toSoapModels(List<VRReport> models) {
		List<VRReportSoap> soapModels = new ArrayList<VRReportSoap>(models.size());

		for (VRReport model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRReportSoap[soapModels.size()]);
	}

	public VRReportSoap() {
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

	public String getReportCode() {
		return _reportCode;
	}

	public void setReportCode(String reportCode) {
		_reportCode = reportCode;
	}

	public String getReportName() {
		return _reportName;
	}

	public void setReportName(String reportName) {
		_reportName = reportName;
	}

	public String getFormReport() {
		return _formReport;
	}

	public void setFormReport(String formReport) {
		_formReport = formReport;
	}

	private long _id;
	private String _reportCode;
	private String _reportName;
	private String _formReport;
}