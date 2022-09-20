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
public class VRCOPProductClassificationSoap implements Serializable {
	public static VRCOPProductClassificationSoap toSoapModel(
		VRCOPProductClassification model) {
		VRCOPProductClassificationSoap soapModel = new VRCOPProductClassificationSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setCopReportRepositoryID(model.getCopReportRepositoryID());
		soapModel.setCopReportNo(model.getCopReportNo());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setProductClassificationCode(model.getProductClassificationCode());
		soapModel.setProductClassificationDescription(model.getProductClassificationDescription());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRCOPProductClassificationSoap[] toSoapModels(
		VRCOPProductClassification[] models) {
		VRCOPProductClassificationSoap[] soapModels = new VRCOPProductClassificationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRCOPProductClassificationSoap[][] toSoapModels(
		VRCOPProductClassification[][] models) {
		VRCOPProductClassificationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRCOPProductClassificationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRCOPProductClassificationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRCOPProductClassificationSoap[] toSoapModels(
		List<VRCOPProductClassification> models) {
		List<VRCOPProductClassificationSoap> soapModels = new ArrayList<VRCOPProductClassificationSoap>(models.size());

		for (VRCOPProductClassification model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRCOPProductClassificationSoap[soapModels.size()]);
	}

	public VRCOPProductClassificationSoap() {
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

	public long getCopReportRepositoryID() {
		return _copReportRepositoryID;
	}

	public void setCopReportRepositoryID(long copReportRepositoryID) {
		_copReportRepositoryID = copReportRepositoryID;
	}

	public String getCopReportNo() {
		return _copReportNo;
	}

	public void setCopReportNo(String copReportNo) {
		_copReportNo = copReportNo;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
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
	private long _copReportRepositoryID;
	private String _copReportNo;
	private long _sequenceNo;
	private String _productClassificationCode;
	private String _productClassificationDescription;
	private Date _modifyDate;
	private Date _syncDate;
}