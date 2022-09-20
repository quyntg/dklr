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
 * This class is a wrapper for {@link DossierSync}.
 * </p>
 *
 * @author huymq
 * @see DossierSync
 * @generated
 */
@ProviderType
public class DossierSyncWrapper implements DossierSync,
	ModelWrapper<DossierSync> {
	public DossierSyncWrapper(DossierSync dossierSync) {
		_dossierSync = dossierSync;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierSync.class;
	}

	@Override
	public String getModelClassName() {
		return DossierSync.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dossierSyncId", getDossierSyncId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierReferenceUid", getDossierReferenceUid());
		attributes.put("createDossier", getCreateDossier());
		attributes.put("method", getMethod());
		attributes.put("classPK", getClassPK());
		attributes.put("fileReferenceUid", getFileReferenceUid());
		attributes.put("serverNo", getServerNo());
		attributes.put("payload", getPayload());
		attributes.put("retry", getRetry());
		attributes.put("state", getState());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long dossierSyncId = (Long)attributes.get("dossierSyncId");

		if (dossierSyncId != null) {
			setDossierSyncId(dossierSyncId);
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

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
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

		String dossierReferenceUid = (String)attributes.get(
				"dossierReferenceUid");

		if (dossierReferenceUid != null) {
			setDossierReferenceUid(dossierReferenceUid);
		}

		Boolean createDossier = (Boolean)attributes.get("createDossier");

		if (createDossier != null) {
			setCreateDossier(createDossier);
		}

		Integer method = (Integer)attributes.get("method");

		if (method != null) {
			setMethod(method);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		String fileReferenceUid = (String)attributes.get("fileReferenceUid");

		if (fileReferenceUid != null) {
			setFileReferenceUid(fileReferenceUid);
		}

		String serverNo = (String)attributes.get("serverNo");

		if (serverNo != null) {
			setServerNo(serverNo);
		}

		String payload = (String)attributes.get("payload");

		if (payload != null) {
			setPayload(payload);
		}

		Integer retry = (Integer)attributes.get("retry");

		if (retry != null) {
			setRetry(retry);
		}

		Integer state = (Integer)attributes.get("state");

		if (state != null) {
			setState(state);
		}
	}

	@Override
	public DossierSync toEscapedModel() {
		return new DossierSyncWrapper(_dossierSync.toEscapedModel());
	}

	@Override
	public DossierSync toUnescapedModel() {
		return new DossierSyncWrapper(_dossierSync.toUnescapedModel());
	}

	/**
	* Returns the create dossier of this dossier sync.
	*
	* @return the create dossier of this dossier sync
	*/
	@Override
	public boolean getCreateDossier() {
		return _dossierSync.getCreateDossier();
	}

	@Override
	public boolean isCachedModel() {
		return _dossierSync.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this dossier sync is create dossier.
	*
	* @return <code>true</code> if this dossier sync is create dossier; <code>false</code> otherwise
	*/
	@Override
	public boolean isCreateDossier() {
		return _dossierSync.isCreateDossier();
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierSync.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dossierSync.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dossierSync.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<DossierSync> toCacheModel() {
		return _dossierSync.toCacheModel();
	}

	@Override
	public int compareTo(DossierSync dossierSync) {
		return _dossierSync.compareTo(dossierSync);
	}

	/**
	* Returns the method of this dossier sync.
	*
	* @return the method of this dossier sync
	*/
	@Override
	public int getMethod() {
		return _dossierSync.getMethod();
	}

	/**
	* Returns the retry of this dossier sync.
	*
	* @return the retry of this dossier sync
	*/
	@Override
	public int getRetry() {
		return _dossierSync.getRetry();
	}

	/**
	* Returns the state of this dossier sync.
	*
	* @return the state of this dossier sync
	*/
	@Override
	public int getState() {
		return _dossierSync.getState();
	}

	@Override
	public int hashCode() {
		return _dossierSync.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierSync.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DossierSyncWrapper((DossierSync)_dossierSync.clone());
	}

	/**
	* Returns the dossier reference uid of this dossier sync.
	*
	* @return the dossier reference uid of this dossier sync
	*/
	@Override
	public java.lang.String getDossierReferenceUid() {
		return _dossierSync.getDossierReferenceUid();
	}

	/**
	* Returns the file reference uid of this dossier sync.
	*
	* @return the file reference uid of this dossier sync
	*/
	@Override
	public java.lang.String getFileReferenceUid() {
		return _dossierSync.getFileReferenceUid();
	}

	/**
	* Returns the payload of this dossier sync.
	*
	* @return the payload of this dossier sync
	*/
	@Override
	public java.lang.String getPayload() {
		return _dossierSync.getPayload();
	}

	/**
	* Returns the server no of this dossier sync.
	*
	* @return the server no of this dossier sync
	*/
	@Override
	public java.lang.String getServerNo() {
		return _dossierSync.getServerNo();
	}

	/**
	* Returns the user name of this dossier sync.
	*
	* @return the user name of this dossier sync
	*/
	@Override
	public java.lang.String getUserName() {
		return _dossierSync.getUserName();
	}

	/**
	* Returns the user uuid of this dossier sync.
	*
	* @return the user uuid of this dossier sync
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _dossierSync.getUserUuid();
	}

	/**
	* Returns the uuid of this dossier sync.
	*
	* @return the uuid of this dossier sync
	*/
	@Override
	public java.lang.String getUuid() {
		return _dossierSync.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _dossierSync.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierSync.toXmlString();
	}

	/**
	* Returns the create date of this dossier sync.
	*
	* @return the create date of this dossier sync
	*/
	@Override
	public Date getCreateDate() {
		return _dossierSync.getCreateDate();
	}

	/**
	* Returns the modified date of this dossier sync.
	*
	* @return the modified date of this dossier sync
	*/
	@Override
	public Date getModifiedDate() {
		return _dossierSync.getModifiedDate();
	}

	/**
	* Returns the class pk of this dossier sync.
	*
	* @return the class pk of this dossier sync
	*/
	@Override
	public long getClassPK() {
		return _dossierSync.getClassPK();
	}

	/**
	* Returns the company ID of this dossier sync.
	*
	* @return the company ID of this dossier sync
	*/
	@Override
	public long getCompanyId() {
		return _dossierSync.getCompanyId();
	}

	/**
	* Returns the dossier ID of this dossier sync.
	*
	* @return the dossier ID of this dossier sync
	*/
	@Override
	public long getDossierId() {
		return _dossierSync.getDossierId();
	}

	/**
	* Returns the dossier sync ID of this dossier sync.
	*
	* @return the dossier sync ID of this dossier sync
	*/
	@Override
	public long getDossierSyncId() {
		return _dossierSync.getDossierSyncId();
	}

	/**
	* Returns the group ID of this dossier sync.
	*
	* @return the group ID of this dossier sync
	*/
	@Override
	public long getGroupId() {
		return _dossierSync.getGroupId();
	}

	/**
	* Returns the primary key of this dossier sync.
	*
	* @return the primary key of this dossier sync
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierSync.getPrimaryKey();
	}

	/**
	* Returns the user ID of this dossier sync.
	*
	* @return the user ID of this dossier sync
	*/
	@Override
	public long getUserId() {
		return _dossierSync.getUserId();
	}

	@Override
	public void persist() {
		_dossierSync.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierSync.setCachedModel(cachedModel);
	}

	/**
	* Sets the class pk of this dossier sync.
	*
	* @param classPK the class pk of this dossier sync
	*/
	@Override
	public void setClassPK(long classPK) {
		_dossierSync.setClassPK(classPK);
	}

	/**
	* Sets the company ID of this dossier sync.
	*
	* @param companyId the company ID of this dossier sync
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierSync.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this dossier sync.
	*
	* @param createDate the create date of this dossier sync
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_dossierSync.setCreateDate(createDate);
	}

	/**
	* Sets whether this dossier sync is create dossier.
	*
	* @param createDossier the create dossier of this dossier sync
	*/
	@Override
	public void setCreateDossier(boolean createDossier) {
		_dossierSync.setCreateDossier(createDossier);
	}

	/**
	* Sets the dossier ID of this dossier sync.
	*
	* @param dossierId the dossier ID of this dossier sync
	*/
	@Override
	public void setDossierId(long dossierId) {
		_dossierSync.setDossierId(dossierId);
	}

	/**
	* Sets the dossier reference uid of this dossier sync.
	*
	* @param dossierReferenceUid the dossier reference uid of this dossier sync
	*/
	@Override
	public void setDossierReferenceUid(java.lang.String dossierReferenceUid) {
		_dossierSync.setDossierReferenceUid(dossierReferenceUid);
	}

	/**
	* Sets the dossier sync ID of this dossier sync.
	*
	* @param dossierSyncId the dossier sync ID of this dossier sync
	*/
	@Override
	public void setDossierSyncId(long dossierSyncId) {
		_dossierSync.setDossierSyncId(dossierSyncId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dossierSync.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dossierSync.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dossierSync.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the file reference uid of this dossier sync.
	*
	* @param fileReferenceUid the file reference uid of this dossier sync
	*/
	@Override
	public void setFileReferenceUid(java.lang.String fileReferenceUid) {
		_dossierSync.setFileReferenceUid(fileReferenceUid);
	}

	/**
	* Sets the group ID of this dossier sync.
	*
	* @param groupId the group ID of this dossier sync
	*/
	@Override
	public void setGroupId(long groupId) {
		_dossierSync.setGroupId(groupId);
	}

	/**
	* Sets the method of this dossier sync.
	*
	* @param method the method of this dossier sync
	*/
	@Override
	public void setMethod(int method) {
		_dossierSync.setMethod(method);
	}

	/**
	* Sets the modified date of this dossier sync.
	*
	* @param modifiedDate the modified date of this dossier sync
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_dossierSync.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_dossierSync.setNew(n);
	}

	/**
	* Sets the payload of this dossier sync.
	*
	* @param payload the payload of this dossier sync
	*/
	@Override
	public void setPayload(java.lang.String payload) {
		_dossierSync.setPayload(payload);
	}

	/**
	* Sets the primary key of this dossier sync.
	*
	* @param primaryKey the primary key of this dossier sync
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierSync.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dossierSync.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the retry of this dossier sync.
	*
	* @param retry the retry of this dossier sync
	*/
	@Override
	public void setRetry(int retry) {
		_dossierSync.setRetry(retry);
	}

	/**
	* Sets the server no of this dossier sync.
	*
	* @param serverNo the server no of this dossier sync
	*/
	@Override
	public void setServerNo(java.lang.String serverNo) {
		_dossierSync.setServerNo(serverNo);
	}

	/**
	* Sets the state of this dossier sync.
	*
	* @param state the state of this dossier sync
	*/
	@Override
	public void setState(int state) {
		_dossierSync.setState(state);
	}

	/**
	* Sets the user ID of this dossier sync.
	*
	* @param userId the user ID of this dossier sync
	*/
	@Override
	public void setUserId(long userId) {
		_dossierSync.setUserId(userId);
	}

	/**
	* Sets the user name of this dossier sync.
	*
	* @param userName the user name of this dossier sync
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_dossierSync.setUserName(userName);
	}

	/**
	* Sets the user uuid of this dossier sync.
	*
	* @param userUuid the user uuid of this dossier sync
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dossierSync.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this dossier sync.
	*
	* @param uuid the uuid of this dossier sync
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_dossierSync.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierSyncWrapper)) {
			return false;
		}

		DossierSyncWrapper dossierSyncWrapper = (DossierSyncWrapper)obj;

		if (Objects.equals(_dossierSync, dossierSyncWrapper._dossierSync)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _dossierSync.getStagedModelType();
	}

	@Override
	public DossierSync getWrappedModel() {
		return _dossierSync;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dossierSync.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dossierSync.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dossierSync.resetOriginalValues();
	}

	private final DossierSync _dossierSync;
}