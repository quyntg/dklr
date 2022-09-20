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
public class VRHistoryProfileSoap implements Serializable {
	public static VRHistoryProfileSoap toSoapModel(VRHistoryProfile model) {
		VRHistoryProfileSoap soapModel = new VRHistoryProfileSoap();

		soapModel.setId(model.getId());
		soapModel.setApplicantCode(model.getApplicantCode());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());
		soapModel.setContentType(model.getContentType());
		soapModel.setContentFileTemplate(model.getContentFileTemplate());
		soapModel.setContentFileEntryId(model.getContentFileEntryId());
		soapModel.setContentjsonFileEntryId(model.getContentjsonFileEntryId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setModifyUserId(model.getModifyUserId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRHistoryProfileSoap[] toSoapModels(VRHistoryProfile[] models) {
		VRHistoryProfileSoap[] soapModels = new VRHistoryProfileSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRHistoryProfileSoap[][] toSoapModels(
		VRHistoryProfile[][] models) {
		VRHistoryProfileSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRHistoryProfileSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRHistoryProfileSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRHistoryProfileSoap[] toSoapModels(
		List<VRHistoryProfile> models) {
		List<VRHistoryProfileSoap> soapModels = new ArrayList<VRHistoryProfileSoap>(models.size());

		for (VRHistoryProfile model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRHistoryProfileSoap[soapModels.size()]);
	}

	public VRHistoryProfileSoap() {
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

	public String getApplicantCode() {
		return _applicantCode;
	}

	public void setApplicantCode(String applicantCode) {
		_applicantCode = applicantCode;
	}

	public String getProductionPlantCode() {
		return _productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		_productionPlantCode = productionPlantCode;
	}

	public String getContentType() {
		return _contentType;
	}

	public void setContentType(String contentType) {
		_contentType = contentType;
	}

	public String getContentFileTemplate() {
		return _contentFileTemplate;
	}

	public void setContentFileTemplate(String contentFileTemplate) {
		_contentFileTemplate = contentFileTemplate;
	}

	public long getContentFileEntryId() {
		return _contentFileEntryId;
	}

	public void setContentFileEntryId(long contentFileEntryId) {
		_contentFileEntryId = contentFileEntryId;
	}

	public long getContentjsonFileEntryId() {
		return _contentjsonFileEntryId;
	}

	public void setContentjsonFileEntryId(long contentjsonFileEntryId) {
		_contentjsonFileEntryId = contentjsonFileEntryId;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getDossierIdCTN() {
		return _dossierIdCTN;
	}

	public void setDossierIdCTN(String dossierIdCTN) {
		_dossierIdCTN = dossierIdCTN;
	}

	public String getDossierNo() {
		return _dossierNo;
	}

	public void setDossierNo(String dossierNo) {
		_dossierNo = dossierNo;
	}

	public long getModifyUserId() {
		return _modifyUserId;
	}

	public void setModifyUserId(long modifyUserId) {
		_modifyUserId = modifyUserId;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
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
	private String _applicantCode;
	private String _productionPlantCode;
	private String _contentType;
	private String _contentFileTemplate;
	private long _contentFileEntryId;
	private long _contentjsonFileEntryId;
	private long _dossierId;
	private String _dossierIdCTN;
	private String _dossierNo;
	private long _modifyUserId;
	private Date _createdDate;
	private Date _modifyDate;
	private Date _syncDate;
}