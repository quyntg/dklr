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
public class VRCertificateProgressSoap implements Serializable {
	public static VRCertificateProgressSoap toSoapModel(
		VRCertificateProgress model) {
		VRCertificateProgressSoap soapModel = new VRCertificateProgressSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleCertificateId(model.getVehicleCertificateId());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setInspectorId(model.getInspectorId());
		soapModel.setActionCode(model.getActionCode());
		soapModel.setProgressTime(model.getProgressTime());
		soapModel.setRemarks(model.getRemarks());

		return soapModel;
	}

	public static VRCertificateProgressSoap[] toSoapModels(
		VRCertificateProgress[] models) {
		VRCertificateProgressSoap[] soapModels = new VRCertificateProgressSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRCertificateProgressSoap[][] toSoapModels(
		VRCertificateProgress[][] models) {
		VRCertificateProgressSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRCertificateProgressSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRCertificateProgressSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRCertificateProgressSoap[] toSoapModels(
		List<VRCertificateProgress> models) {
		List<VRCertificateProgressSoap> soapModels = new ArrayList<VRCertificateProgressSoap>(models.size());

		for (VRCertificateProgress model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRCertificateProgressSoap[soapModels.size()]);
	}

	public VRCertificateProgressSoap() {
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

	public long getVehicleCertificateId() {
		return _vehicleCertificateId;
	}

	public void setVehicleCertificateId(long vehicleCertificateId) {
		_vehicleCertificateId = vehicleCertificateId;
	}

	public String getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;
	}

	public long getInspectorId() {
		return _inspectorId;
	}

	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;
	}

	public String getActionCode() {
		return _actionCode;
	}

	public void setActionCode(String actionCode) {
		_actionCode = actionCode;
	}

	public Date getProgressTime() {
		return _progressTime;
	}

	public void setProgressTime(Date progressTime) {
		_progressTime = progressTime;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	private long _id;
	private long _vehicleCertificateId;
	private String _corporationId;
	private long _inspectorId;
	private String _actionCode;
	private Date _progressTime;
	private String _remarks;
}