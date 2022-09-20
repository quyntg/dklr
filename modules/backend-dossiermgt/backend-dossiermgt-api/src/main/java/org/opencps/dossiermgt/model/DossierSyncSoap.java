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

package org.opencps.dossiermgt.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author huymq
 * @generated
 */
@ProviderType
public class DossierSyncSoap implements Serializable {
	public static DossierSyncSoap toSoapModel(DossierSync model) {
		DossierSyncSoap soapModel = new DossierSyncSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setDossierSyncId(model.getDossierSyncId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierReferenceUid(model.getDossierReferenceUid());
		soapModel.setCreateDossier(model.getCreateDossier());
		soapModel.setMethod(model.getMethod());
		soapModel.setClassPK(model.getClassPK());
		soapModel.setFileReferenceUid(model.getFileReferenceUid());
		soapModel.setServerNo(model.getServerNo());
		soapModel.setPayload(model.getPayload());
		soapModel.setRetry(model.getRetry());
		soapModel.setState(model.getState());

		return soapModel;
	}

	public static DossierSyncSoap[] toSoapModels(DossierSync[] models) {
		DossierSyncSoap[] soapModels = new DossierSyncSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierSyncSoap[][] toSoapModels(DossierSync[][] models) {
		DossierSyncSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierSyncSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierSyncSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierSyncSoap[] toSoapModels(List<DossierSync> models) {
		List<DossierSyncSoap> soapModels = new ArrayList<DossierSyncSoap>(models.size());

		for (DossierSync model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierSyncSoap[soapModels.size()]);
	}

	public DossierSyncSoap() {
	}

	public long getPrimaryKey() {
		return _dossierSyncId;
	}

	public void setPrimaryKey(long pk) {
		setDossierSyncId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getDossierSyncId() {
		return _dossierSyncId;
	}

	public void setDossierSyncId(long dossierSyncId) {
		_dossierSyncId = dossierSyncId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getDossierReferenceUid() {
		return _dossierReferenceUid;
	}

	public void setDossierReferenceUid(String dossierReferenceUid) {
		_dossierReferenceUid = dossierReferenceUid;
	}

	public boolean getCreateDossier() {
		return _createDossier;
	}

	public boolean isCreateDossier() {
		return _createDossier;
	}

	public void setCreateDossier(boolean createDossier) {
		_createDossier = createDossier;
	}

	public int getMethod() {
		return _method;
	}

	public void setMethod(int method) {
		_method = method;
	}

	public long getClassPK() {
		return _classPK;
	}

	public void setClassPK(long classPK) {
		_classPK = classPK;
	}

	public String getFileReferenceUid() {
		return _fileReferenceUid;
	}

	public void setFileReferenceUid(String fileReferenceUid) {
		_fileReferenceUid = fileReferenceUid;
	}

	public String getServerNo() {
		return _serverNo;
	}

	public void setServerNo(String serverNo) {
		_serverNo = serverNo;
	}

	public String getPayload() {
		return _payload;
	}

	public void setPayload(String payload) {
		_payload = payload;
	}

	public int getRetry() {
		return _retry;
	}

	public void setRetry(int retry) {
		_retry = retry;
	}

	public int getState() {
		return _state;
	}

	public void setState(int state) {
		_state = state;
	}

	private String _uuid;
	private long _dossierSyncId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierId;
	private String _dossierReferenceUid;
	private boolean _createDossier;
	private int _method;
	private long _classPK;
	private String _fileReferenceUid;
	private String _serverNo;
	private String _payload;
	private int _retry;
	private int _state;
}