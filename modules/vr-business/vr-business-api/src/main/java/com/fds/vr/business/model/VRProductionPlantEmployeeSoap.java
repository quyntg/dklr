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
public class VRProductionPlantEmployeeSoap implements Serializable {
	public static VRProductionPlantEmployeeSoap toSoapModel(
		VRProductionPlantEmployee model) {
		VRProductionPlantEmployeeSoap soapModel = new VRProductionPlantEmployeeSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setEmployeeName(model.getEmployeeName());
		soapModel.setEmployeeCertificateNo(model.getEmployeeCertificateNo());
		soapModel.setTrainningAt(model.getTrainningAt());
		soapModel.setWorkingPosition(model.getWorkingPosition());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());
		soapModel.setProductionPlantId(model.getProductionPlantId());

		return soapModel;
	}

	public static VRProductionPlantEmployeeSoap[] toSoapModels(
		VRProductionPlantEmployee[] models) {
		VRProductionPlantEmployeeSoap[] soapModels = new VRProductionPlantEmployeeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRProductionPlantEmployeeSoap[][] toSoapModels(
		VRProductionPlantEmployee[][] models) {
		VRProductionPlantEmployeeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRProductionPlantEmployeeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRProductionPlantEmployeeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRProductionPlantEmployeeSoap[] toSoapModels(
		List<VRProductionPlantEmployee> models) {
		List<VRProductionPlantEmployeeSoap> soapModels = new ArrayList<VRProductionPlantEmployeeSoap>(models.size());

		for (VRProductionPlantEmployee model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRProductionPlantEmployeeSoap[soapModels.size()]);
	}

	public VRProductionPlantEmployeeSoap() {
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

	public long getMtCore() {
		return _mtCore;
	}

	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getEmployeeName() {
		return _employeeName;
	}

	public void setEmployeeName(String employeeName) {
		_employeeName = employeeName;
	}

	public String getEmployeeCertificateNo() {
		return _employeeCertificateNo;
	}

	public void setEmployeeCertificateNo(String employeeCertificateNo) {
		_employeeCertificateNo = employeeCertificateNo;
	}

	public String getTrainningAt() {
		return _trainningAt;
	}

	public void setTrainningAt(String trainningAt) {
		_trainningAt = trainningAt;
	}

	public String getWorkingPosition() {
		return _workingPosition;
	}

	public void setWorkingPosition(String workingPosition) {
		_workingPosition = workingPosition;
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

	public String getProductionPlantCode() {
		return _productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		_productionPlantCode = productionPlantCode;
	}

	public long getProductionPlantId() {
		return _productionPlantId;
	}

	public void setProductionPlantId(long productionPlantId) {
		_productionPlantId = productionPlantId;
	}

	private long _id;
	private long _mtCore;
	private long _sequenceNo;
	private String _employeeName;
	private String _employeeCertificateNo;
	private String _trainningAt;
	private String _workingPosition;
	private Date _modifyDate;
	private Date _syncDate;
	private String _productionPlantCode;
	private long _productionPlantId;
}