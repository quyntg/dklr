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
public class VRActionconfigSoap implements Serializable {
	public static VRActionconfigSoap toSoapModel(VRActionconfig model) {
		VRActionconfigSoap soapModel = new VRActionconfigSoap();

		soapModel.setId(model.getId());
		soapModel.setActionCode(model.getActionCode());
		soapModel.setProcessNo(model.getProcessNo());
		soapModel.setStatus(model.getStatus());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setFileTemplateNoBB(model.getFileTemplateNoBB());
		soapModel.setFileTemplateNoCC(model.getFileTemplateNoCC());
		soapModel.setDeliverableCode(model.getDeliverableCode());

		return soapModel;
	}

	public static VRActionconfigSoap[] toSoapModels(VRActionconfig[] models) {
		VRActionconfigSoap[] soapModels = new VRActionconfigSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRActionconfigSoap[][] toSoapModels(VRActionconfig[][] models) {
		VRActionconfigSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRActionconfigSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRActionconfigSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRActionconfigSoap[] toSoapModels(List<VRActionconfig> models) {
		List<VRActionconfigSoap> soapModels = new ArrayList<VRActionconfigSoap>(models.size());

		for (VRActionconfig model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRActionconfigSoap[soapModels.size()]);
	}

	public VRActionconfigSoap() {
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

	public String getActionCode() {
		return _actionCode;
	}

	public void setActionCode(String actionCode) {
		_actionCode = actionCode;
	}

	public String getProcessNo() {
		return _processNo;
	}

	public void setProcessNo(String processNo) {
		_processNo = processNo;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public String getVehicleClass() {
		return _vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	public String getFileTemplateNoBB() {
		return _fileTemplateNoBB;
	}

	public void setFileTemplateNoBB(String fileTemplateNoBB) {
		_fileTemplateNoBB = fileTemplateNoBB;
	}

	public String getFileTemplateNoCC() {
		return _fileTemplateNoCC;
	}

	public void setFileTemplateNoCC(String fileTemplateNoCC) {
		_fileTemplateNoCC = fileTemplateNoCC;
	}

	public String getDeliverableCode() {
		return _deliverableCode;
	}

	public void setDeliverableCode(String deliverableCode) {
		_deliverableCode = deliverableCode;
	}

	private long _id;
	private String _actionCode;
	private String _processNo;
	private int _status;
	private String _vehicleClass;
	private String _fileTemplateNoBB;
	private String _fileTemplateNoCC;
	private String _deliverableCode;
}