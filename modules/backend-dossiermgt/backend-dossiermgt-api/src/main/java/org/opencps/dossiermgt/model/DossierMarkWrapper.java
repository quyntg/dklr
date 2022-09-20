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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link DossierMark}.
 * </p>
 *
 * @author huymq
 * @see DossierMark
 * @generated
 */
@ProviderType
public class DossierMarkWrapper implements DossierMark,
	ModelWrapper<DossierMark> {
	public DossierMarkWrapper(DossierMark dossierMark) {
		_dossierMark = dossierMark;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierMark.class;
	}

	@Override
	public String getModelClassName() {
		return DossierMark.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dossierMarkId", getDossierMarkId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierPartNo", getDossierPartNo());
		attributes.put("fileCheck", getFileCheck());
		attributes.put("fileType", getFileType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long dossierMarkId = (Long)attributes.get("dossierMarkId");

		if (dossierMarkId != null) {
			setDossierMarkId(dossierMarkId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String dossierPartNo = (String)attributes.get("dossierPartNo");

		if (dossierPartNo != null) {
			setDossierPartNo(dossierPartNo);
		}

		Boolean fileCheck = (Boolean)attributes.get("fileCheck");

		if (fileCheck != null) {
			setFileCheck(fileCheck);
		}

		Integer fileType = (Integer)attributes.get("fileType");

		if (fileType != null) {
			setFileType(fileType);
		}
	}

	@Override
	public DossierMark toEscapedModel() {
		return new DossierMarkWrapper(_dossierMark.toEscapedModel());
	}

	@Override
	public DossierMark toUnescapedModel() {
		return new DossierMarkWrapper(_dossierMark.toUnescapedModel());
	}

	/**
	* Returns the file check of this dossier mark.
	*
	* @return the file check of this dossier mark
	*/
	@Override
	public boolean getFileCheck() {
		return _dossierMark.getFileCheck();
	}

	@Override
	public boolean isCachedModel() {
		return _dossierMark.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierMark.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this dossier mark is file check.
	*
	* @return <code>true</code> if this dossier mark is file check; <code>false</code> otherwise
	*/
	@Override
	public boolean isFileCheck() {
		return _dossierMark.isFileCheck();
	}

	@Override
	public boolean isNew() {
		return _dossierMark.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dossierMark.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<DossierMark> toCacheModel() {
		return _dossierMark.toCacheModel();
	}

	@Override
	public int compareTo(DossierMark dossierMark) {
		return _dossierMark.compareTo(dossierMark);
	}

	/**
	* Returns the file type of this dossier mark.
	*
	* @return the file type of this dossier mark
	*/
	@Override
	public int getFileType() {
		return _dossierMark.getFileType();
	}

	@Override
	public int hashCode() {
		return _dossierMark.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierMark.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DossierMarkWrapper((DossierMark)_dossierMark.clone());
	}

	/**
	* Returns the dossier part no of this dossier mark.
	*
	* @return the dossier part no of this dossier mark
	*/
	@Override
	public java.lang.String getDossierPartNo() {
		return _dossierMark.getDossierPartNo();
	}

	/**
	* Returns the user uuid of this dossier mark.
	*
	* @return the user uuid of this dossier mark
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _dossierMark.getUserUuid();
	}

	/**
	* Returns the uuid of this dossier mark.
	*
	* @return the uuid of this dossier mark
	*/
	@Override
	public java.lang.String getUuid() {
		return _dossierMark.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _dossierMark.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierMark.toXmlString();
	}

	/**
	* Returns the create date of this dossier mark.
	*
	* @return the create date of this dossier mark
	*/
	@Override
	public Date getCreateDate() {
		return _dossierMark.getCreateDate();
	}

	/**
	* Returns the modified date of this dossier mark.
	*
	* @return the modified date of this dossier mark
	*/
	@Override
	public Date getModifiedDate() {
		return _dossierMark.getModifiedDate();
	}

	/**
	* Returns the company ID of this dossier mark.
	*
	* @return the company ID of this dossier mark
	*/
	@Override
	public long getCompanyId() {
		return _dossierMark.getCompanyId();
	}

	/**
	* Returns the dossier ID of this dossier mark.
	*
	* @return the dossier ID of this dossier mark
	*/
	@Override
	public long getDossierId() {
		return _dossierMark.getDossierId();
	}

	/**
	* Returns the dossier mark ID of this dossier mark.
	*
	* @return the dossier mark ID of this dossier mark
	*/
	@Override
	public long getDossierMarkId() {
		return _dossierMark.getDossierMarkId();
	}

	/**
	* Returns the group ID of this dossier mark.
	*
	* @return the group ID of this dossier mark
	*/
	@Override
	public long getGroupId() {
		return _dossierMark.getGroupId();
	}

	/**
	* Returns the primary key of this dossier mark.
	*
	* @return the primary key of this dossier mark
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierMark.getPrimaryKey();
	}

	/**
	* Returns the user ID of this dossier mark.
	*
	* @return the user ID of this dossier mark
	*/
	@Override
	public long getUserId() {
		return _dossierMark.getUserId();
	}

	@Override
	public void persist() {
		_dossierMark.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierMark.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this dossier mark.
	*
	* @param companyId the company ID of this dossier mark
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierMark.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this dossier mark.
	*
	* @param createDate the create date of this dossier mark
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_dossierMark.setCreateDate(createDate);
	}

	/**
	* Sets the dossier ID of this dossier mark.
	*
	* @param dossierId the dossier ID of this dossier mark
	*/
	@Override
	public void setDossierId(long dossierId) {
		_dossierMark.setDossierId(dossierId);
	}

	/**
	* Sets the dossier mark ID of this dossier mark.
	*
	* @param dossierMarkId the dossier mark ID of this dossier mark
	*/
	@Override
	public void setDossierMarkId(long dossierMarkId) {
		_dossierMark.setDossierMarkId(dossierMarkId);
	}

	/**
	* Sets the dossier part no of this dossier mark.
	*
	* @param dossierPartNo the dossier part no of this dossier mark
	*/
	@Override
	public void setDossierPartNo(java.lang.String dossierPartNo) {
		_dossierMark.setDossierPartNo(dossierPartNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dossierMark.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dossierMark.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dossierMark.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets whether this dossier mark is file check.
	*
	* @param fileCheck the file check of this dossier mark
	*/
	@Override
	public void setFileCheck(boolean fileCheck) {
		_dossierMark.setFileCheck(fileCheck);
	}

	/**
	* Sets the file type of this dossier mark.
	*
	* @param fileType the file type of this dossier mark
	*/
	@Override
	public void setFileType(int fileType) {
		_dossierMark.setFileType(fileType);
	}

	/**
	* Sets the group ID of this dossier mark.
	*
	* @param groupId the group ID of this dossier mark
	*/
	@Override
	public void setGroupId(long groupId) {
		_dossierMark.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this dossier mark.
	*
	* @param modifiedDate the modified date of this dossier mark
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_dossierMark.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_dossierMark.setNew(n);
	}

	/**
	* Sets the primary key of this dossier mark.
	*
	* @param primaryKey the primary key of this dossier mark
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierMark.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dossierMark.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this dossier mark.
	*
	* @param userId the user ID of this dossier mark
	*/
	@Override
	public void setUserId(long userId) {
		_dossierMark.setUserId(userId);
	}

	/**
	* Sets the user uuid of this dossier mark.
	*
	* @param userUuid the user uuid of this dossier mark
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dossierMark.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this dossier mark.
	*
	* @param uuid the uuid of this dossier mark
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_dossierMark.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierMarkWrapper)) {
			return false;
		}

		DossierMarkWrapper dossierMarkWrapper = (DossierMarkWrapper)obj;

		if (Objects.equals(_dossierMark, dossierMarkWrapper._dossierMark)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _dossierMark.getStagedModelType();
	}

	@Override
	public DossierMark getWrappedModel() {
		return _dossierMark;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dossierMark.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dossierMark.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dossierMark.resetOriginalValues();
	}

	private final DossierMark _dossierMark;
}