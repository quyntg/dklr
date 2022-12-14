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
public class RegistrationFormSoap implements Serializable {
	public static RegistrationFormSoap toSoapModel(RegistrationForm model) {
		RegistrationFormSoap soapModel = new RegistrationFormSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setRegistrationFormId(model.getRegistrationFormId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRegistrationId(model.getRegistrationId());
		soapModel.setReferenceUid(model.getReferenceUid());
		soapModel.setFormNo(model.getFormNo());
		soapModel.setFormName(model.getFormName());
		soapModel.setFormData(model.getFormData());
		soapModel.setFormScript(model.getFormScript());
		soapModel.setFormReport(model.getFormReport());
		soapModel.setFileEntryId(model.getFileEntryId());
		soapModel.setIsNew(model.getIsNew());
		soapModel.setRemoved(model.getRemoved());

		return soapModel;
	}

	public static RegistrationFormSoap[] toSoapModels(RegistrationForm[] models) {
		RegistrationFormSoap[] soapModels = new RegistrationFormSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RegistrationFormSoap[][] toSoapModels(
		RegistrationForm[][] models) {
		RegistrationFormSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RegistrationFormSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RegistrationFormSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RegistrationFormSoap[] toSoapModels(
		List<RegistrationForm> models) {
		List<RegistrationFormSoap> soapModels = new ArrayList<RegistrationFormSoap>(models.size());

		for (RegistrationForm model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RegistrationFormSoap[soapModels.size()]);
	}

	public RegistrationFormSoap() {
	}

	public long getPrimaryKey() {
		return _registrationFormId;
	}

	public void setPrimaryKey(long pk) {
		setRegistrationFormId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getRegistrationFormId() {
		return _registrationFormId;
	}

	public void setRegistrationFormId(long registrationFormId) {
		_registrationFormId = registrationFormId;
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

	public long getRegistrationId() {
		return _registrationId;
	}

	public void setRegistrationId(long registrationId) {
		_registrationId = registrationId;
	}

	public String getReferenceUid() {
		return _referenceUid;
	}

	public void setReferenceUid(String referenceUid) {
		_referenceUid = referenceUid;
	}

	public String getFormNo() {
		return _formNo;
	}

	public void setFormNo(String formNo) {
		_formNo = formNo;
	}

	public String getFormName() {
		return _formName;
	}

	public void setFormName(String formName) {
		_formName = formName;
	}

	public String getFormData() {
		return _formData;
	}

	public void setFormData(String formData) {
		_formData = formData;
	}

	public String getFormScript() {
		return _formScript;
	}

	public void setFormScript(String formScript) {
		_formScript = formScript;
	}

	public String getFormReport() {
		return _formReport;
	}

	public void setFormReport(String formReport) {
		_formReport = formReport;
	}

	public long getFileEntryId() {
		return _fileEntryId;
	}

	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	public boolean getIsNew() {
		return _isNew;
	}

	public boolean isIsNew() {
		return _isNew;
	}

	public void setIsNew(boolean isNew) {
		_isNew = isNew;
	}

	public boolean getRemoved() {
		return _removed;
	}

	public boolean isRemoved() {
		return _removed;
	}

	public void setRemoved(boolean removed) {
		_removed = removed;
	}

	private String _uuid;
	private long _registrationFormId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _registrationId;
	private String _referenceUid;
	private String _formNo;
	private String _formName;
	private String _formData;
	private String _formScript;
	private String _formReport;
	private long _fileEntryId;
	private boolean _isNew;
	private boolean _removed;
}