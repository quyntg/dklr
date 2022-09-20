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
public class VRProductionClassificationSoap implements Serializable {
	public static VRProductionClassificationSoap toSoapModel(
		VRProductionClassification model) {
		VRProductionClassificationSoap soapModel = new VRProductionClassificationSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setApplicantProfileId(model.getApplicantProfileId());
		soapModel.setApplicantCode(model.getApplicantCode());
		soapModel.setProductionPlantId(model.getProductionPlantId());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setProductClassificationCode(model.getProductClassificationCode());
		soapModel.setProductClassificationDescription(model.getProductClassificationDescription());
		soapModel.setClassificationMode(model.getClassificationMode());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setStatus(model.getStatus());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRProductionClassificationSoap[] toSoapModels(
		VRProductionClassification[] models) {
		VRProductionClassificationSoap[] soapModels = new VRProductionClassificationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRProductionClassificationSoap[][] toSoapModels(
		VRProductionClassification[][] models) {
		VRProductionClassificationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRProductionClassificationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRProductionClassificationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRProductionClassificationSoap[] toSoapModels(
		List<VRProductionClassification> models) {
		List<VRProductionClassificationSoap> soapModels = new ArrayList<VRProductionClassificationSoap>(models.size());

		for (VRProductionClassification model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRProductionClassificationSoap[soapModels.size()]);
	}

	public VRProductionClassificationSoap() {
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

	public long getApplicantProfileId() {
		return _applicantProfileId;
	}

	public void setApplicantProfileId(long applicantProfileId) {
		_applicantProfileId = applicantProfileId;
	}

	public String getApplicantCode() {
		return _applicantCode;
	}

	public void setApplicantCode(String applicantCode) {
		_applicantCode = applicantCode;
	}

	public long getProductionPlantId() {
		return _productionPlantId;
	}

	public void setProductionPlantId(long productionPlantId) {
		_productionPlantId = productionPlantId;
	}

	public String getProductionPlantCode() {
		return _productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		_productionPlantCode = productionPlantCode;
	}

	public int getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getProductClassificationCode() {
		return _productClassificationCode;
	}

	public void setProductClassificationCode(String productClassificationCode) {
		_productClassificationCode = productClassificationCode;
	}

	public String getProductClassificationDescription() {
		return _productClassificationDescription;
	}

	public void setProductClassificationDescription(
		String productClassificationDescription) {
		_productClassificationDescription = productClassificationDescription;
	}

	public String getClassificationMode() {
		return _classificationMode;
	}

	public void setClassificationMode(String classificationMode) {
		_classificationMode = classificationMode;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
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
	private long _mtCore;
	private long _applicantProfileId;
	private String _applicantCode;
	private long _productionPlantId;
	private String _productionPlantCode;
	private int _sequenceNo;
	private String _productClassificationCode;
	private String _productClassificationDescription;
	private String _classificationMode;
	private String _remarks;
	private String _status;
	private Date _modifyDate;
	private Date _syncDate;
}