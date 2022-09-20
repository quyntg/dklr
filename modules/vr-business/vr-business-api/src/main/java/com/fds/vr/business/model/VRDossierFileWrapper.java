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
 * This class is a wrapper for {@link VRDossierFile}.
 * </p>
 *
 * @author LamTV
 * @see VRDossierFile
 * @generated
 */
@ProviderType
public class VRDossierFileWrapper implements VRDossierFile,
	ModelWrapper<VRDossierFile> {
	public VRDossierFileWrapper(VRDossierFile vrDossierFile) {
		_vrDossierFile = vrDossierFile;
	}

	@Override
	public Class<?> getModelClass() {
		return VRDossierFile.class;
	}

	@Override
	public String getModelClassName() {
		return VRDossierFile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dossierFileId", getDossierFileId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("referenceUid", getReferenceUid());
		attributes.put("dossierTemplateNo", getDossierTemplateNo());
		attributes.put("dossierPartNo", getDossierPartNo());
		attributes.put("dossierPartType", getDossierPartType());
		attributes.put("fileTemplateNo", getFileTemplateNo());
		attributes.put("displayName", getDisplayName());
		attributes.put("formData", getFormData());
		attributes.put("formDataDossierFile", getFormDataDossierFile());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("original", getOriginal());
		attributes.put("eForm", getEForm());
		attributes.put("isNew", getIsNew());
		attributes.put("removed", getRemoved());
		attributes.put("signCheck", getSignCheck());
		attributes.put("signInfo", getSignInfo());
		attributes.put("formScript", getFormScript());
		attributes.put("formReport", getFormReport());
		attributes.put("formSchema", getFormSchema());
		attributes.put("deliverableCode", getDeliverableCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long dossierFileId = (Long)attributes.get("dossierFileId");

		if (dossierFileId != null) {
			setDossierFileId(dossierFileId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
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

		String referenceUid = (String)attributes.get("referenceUid");

		if (referenceUid != null) {
			setReferenceUid(referenceUid);
		}

		String dossierTemplateNo = (String)attributes.get("dossierTemplateNo");

		if (dossierTemplateNo != null) {
			setDossierTemplateNo(dossierTemplateNo);
		}

		String dossierPartNo = (String)attributes.get("dossierPartNo");

		if (dossierPartNo != null) {
			setDossierPartNo(dossierPartNo);
		}

		Integer dossierPartType = (Integer)attributes.get("dossierPartType");

		if (dossierPartType != null) {
			setDossierPartType(dossierPartType);
		}

		String fileTemplateNo = (String)attributes.get("fileTemplateNo");

		if (fileTemplateNo != null) {
			setFileTemplateNo(fileTemplateNo);
		}

		String displayName = (String)attributes.get("displayName");

		if (displayName != null) {
			setDisplayName(displayName);
		}

		String formData = (String)attributes.get("formData");

		if (formData != null) {
			setFormData(formData);
		}

		Long formDataDossierFile = (Long)attributes.get("formDataDossierFile");

		if (formDataDossierFile != null) {
			setFormDataDossierFile(formDataDossierFile);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		Boolean original = (Boolean)attributes.get("original");

		if (original != null) {
			setOriginal(original);
		}

		Boolean eForm = (Boolean)attributes.get("eForm");

		if (eForm != null) {
			setEForm(eForm);
		}

		Boolean isNew = (Boolean)attributes.get("isNew");

		if (isNew != null) {
			setIsNew(isNew);
		}

		Boolean removed = (Boolean)attributes.get("removed");

		if (removed != null) {
			setRemoved(removed);
		}

		Integer signCheck = (Integer)attributes.get("signCheck");

		if (signCheck != null) {
			setSignCheck(signCheck);
		}

		String signInfo = (String)attributes.get("signInfo");

		if (signInfo != null) {
			setSignInfo(signInfo);
		}

		String formScript = (String)attributes.get("formScript");

		if (formScript != null) {
			setFormScript(formScript);
		}

		String formReport = (String)attributes.get("formReport");

		if (formReport != null) {
			setFormReport(formReport);
		}

		String formSchema = (String)attributes.get("formSchema");

		if (formSchema != null) {
			setFormSchema(formSchema);
		}

		String deliverableCode = (String)attributes.get("deliverableCode");

		if (deliverableCode != null) {
			setDeliverableCode(deliverableCode);
		}
	}

	@Override
	public VRDossierFile toEscapedModel() {
		return new VRDossierFileWrapper(_vrDossierFile.toEscapedModel());
	}

	@Override
	public VRDossierFile toUnescapedModel() {
		return new VRDossierFileWrapper(_vrDossierFile.toUnescapedModel());
	}

	/**
	* Returns the e form of this vr dossier file.
	*
	* @return the e form of this vr dossier file
	*/
	@Override
	public boolean getEForm() {
		return _vrDossierFile.getEForm();
	}

	/**
	* Returns the is new of this vr dossier file.
	*
	* @return the is new of this vr dossier file
	*/
	@Override
	public boolean getIsNew() {
		return _vrDossierFile.getIsNew();
	}

	/**
	* Returns the original of this vr dossier file.
	*
	* @return the original of this vr dossier file
	*/
	@Override
	public boolean getOriginal() {
		return _vrDossierFile.getOriginal();
	}

	/**
	* Returns the removed of this vr dossier file.
	*
	* @return the removed of this vr dossier file
	*/
	@Override
	public boolean getRemoved() {
		return _vrDossierFile.getRemoved();
	}

	@Override
	public boolean isCachedModel() {
		return _vrDossierFile.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this vr dossier file is e form.
	*
	* @return <code>true</code> if this vr dossier file is e form; <code>false</code> otherwise
	*/
	@Override
	public boolean isEForm() {
		return _vrDossierFile.isEForm();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrDossierFile.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this vr dossier file is is new.
	*
	* @return <code>true</code> if this vr dossier file is is new; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsNew() {
		return _vrDossierFile.isIsNew();
	}

	@Override
	public boolean isNew() {
		return _vrDossierFile.isNew();
	}

	/**
	* Returns <code>true</code> if this vr dossier file is original.
	*
	* @return <code>true</code> if this vr dossier file is original; <code>false</code> otherwise
	*/
	@Override
	public boolean isOriginal() {
		return _vrDossierFile.isOriginal();
	}

	/**
	* Returns <code>true</code> if this vr dossier file is removed.
	*
	* @return <code>true</code> if this vr dossier file is removed; <code>false</code> otherwise
	*/
	@Override
	public boolean isRemoved() {
		return _vrDossierFile.isRemoved();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrDossierFile.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRDossierFile> toCacheModel() {
		return _vrDossierFile.toCacheModel();
	}

	@Override
	public int compareTo(VRDossierFile vrDossierFile) {
		return _vrDossierFile.compareTo(vrDossierFile);
	}

	/**
	* Returns the dossier part type of this vr dossier file.
	*
	* @return the dossier part type of this vr dossier file
	*/
	@Override
	public int getDossierPartType() {
		return _vrDossierFile.getDossierPartType();
	}

	/**
	* Returns the sign check of this vr dossier file.
	*
	* @return the sign check of this vr dossier file
	*/
	@Override
	public int getSignCheck() {
		return _vrDossierFile.getSignCheck();
	}

	@Override
	public int hashCode() {
		return _vrDossierFile.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrDossierFile.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRDossierFileWrapper((VRDossierFile)_vrDossierFile.clone());
	}

	/**
	* Returns the deliverable code of this vr dossier file.
	*
	* @return the deliverable code of this vr dossier file
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrDossierFile.getDeliverableCode();
	}

	/**
	* Returns the display name of this vr dossier file.
	*
	* @return the display name of this vr dossier file
	*/
	@Override
	public java.lang.String getDisplayName() {
		return _vrDossierFile.getDisplayName();
	}

	/**
	* Returns the dossier part no of this vr dossier file.
	*
	* @return the dossier part no of this vr dossier file
	*/
	@Override
	public java.lang.String getDossierPartNo() {
		return _vrDossierFile.getDossierPartNo();
	}

	/**
	* Returns the dossier template no of this vr dossier file.
	*
	* @return the dossier template no of this vr dossier file
	*/
	@Override
	public java.lang.String getDossierTemplateNo() {
		return _vrDossierFile.getDossierTemplateNo();
	}

	/**
	* Returns the file template no of this vr dossier file.
	*
	* @return the file template no of this vr dossier file
	*/
	@Override
	public java.lang.String getFileTemplateNo() {
		return _vrDossierFile.getFileTemplateNo();
	}

	/**
	* Returns the form data of this vr dossier file.
	*
	* @return the form data of this vr dossier file
	*/
	@Override
	public java.lang.String getFormData() {
		return _vrDossierFile.getFormData();
	}

	/**
	* Returns the form report of this vr dossier file.
	*
	* @return the form report of this vr dossier file
	*/
	@Override
	public java.lang.String getFormReport() {
		return _vrDossierFile.getFormReport();
	}

	/**
	* Returns the form schema of this vr dossier file.
	*
	* @return the form schema of this vr dossier file
	*/
	@Override
	public java.lang.String getFormSchema() {
		return _vrDossierFile.getFormSchema();
	}

	/**
	* Returns the form script of this vr dossier file.
	*
	* @return the form script of this vr dossier file
	*/
	@Override
	public java.lang.String getFormScript() {
		return _vrDossierFile.getFormScript();
	}

	/**
	* Returns the reference uid of this vr dossier file.
	*
	* @return the reference uid of this vr dossier file
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrDossierFile.getReferenceUid();
	}

	/**
	* Returns the sign info of this vr dossier file.
	*
	* @return the sign info of this vr dossier file
	*/
	@Override
	public java.lang.String getSignInfo() {
		return _vrDossierFile.getSignInfo();
	}

	/**
	* Returns the user name of this vr dossier file.
	*
	* @return the user name of this vr dossier file
	*/
	@Override
	public java.lang.String getUserName() {
		return _vrDossierFile.getUserName();
	}

	/**
	* Returns the user uuid of this vr dossier file.
	*
	* @return the user uuid of this vr dossier file
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vrDossierFile.getUserUuid();
	}

	/**
	* Returns the uuid of this vr dossier file.
	*
	* @return the uuid of this vr dossier file
	*/
	@Override
	public java.lang.String getUuid() {
		return _vrDossierFile.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vrDossierFile.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrDossierFile.toXmlString();
	}

	/**
	* Returns the create date of this vr dossier file.
	*
	* @return the create date of this vr dossier file
	*/
	@Override
	public Date getCreateDate() {
		return _vrDossierFile.getCreateDate();
	}

	/**
	* Returns the modified date of this vr dossier file.
	*
	* @return the modified date of this vr dossier file
	*/
	@Override
	public Date getModifiedDate() {
		return _vrDossierFile.getModifiedDate();
	}

	/**
	* Returns the company ID of this vr dossier file.
	*
	* @return the company ID of this vr dossier file
	*/
	@Override
	public long getCompanyId() {
		return _vrDossierFile.getCompanyId();
	}

	/**
	* Returns the dossier file ID of this vr dossier file.
	*
	* @return the dossier file ID of this vr dossier file
	*/
	@Override
	public long getDossierFileId() {
		return _vrDossierFile.getDossierFileId();
	}

	/**
	* Returns the dossier ID of this vr dossier file.
	*
	* @return the dossier ID of this vr dossier file
	*/
	@Override
	public long getDossierId() {
		return _vrDossierFile.getDossierId();
	}

	/**
	* Returns the file entry ID of this vr dossier file.
	*
	* @return the file entry ID of this vr dossier file
	*/
	@Override
	public long getFileEntryId() {
		return _vrDossierFile.getFileEntryId();
	}

	/**
	* Returns the form data dossier file of this vr dossier file.
	*
	* @return the form data dossier file of this vr dossier file
	*/
	@Override
	public long getFormDataDossierFile() {
		return _vrDossierFile.getFormDataDossierFile();
	}

	/**
	* Returns the group ID of this vr dossier file.
	*
	* @return the group ID of this vr dossier file
	*/
	@Override
	public long getGroupId() {
		return _vrDossierFile.getGroupId();
	}

	/**
	* Returns the primary key of this vr dossier file.
	*
	* @return the primary key of this vr dossier file
	*/
	@Override
	public long getPrimaryKey() {
		return _vrDossierFile.getPrimaryKey();
	}

	/**
	* Returns the user ID of this vr dossier file.
	*
	* @return the user ID of this vr dossier file
	*/
	@Override
	public long getUserId() {
		return _vrDossierFile.getUserId();
	}

	@Override
	public void persist() {
		_vrDossierFile.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrDossierFile.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this vr dossier file.
	*
	* @param companyId the company ID of this vr dossier file
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vrDossierFile.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this vr dossier file.
	*
	* @param createDate the create date of this vr dossier file
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_vrDossierFile.setCreateDate(createDate);
	}

	/**
	* Sets the deliverable code of this vr dossier file.
	*
	* @param deliverableCode the deliverable code of this vr dossier file
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrDossierFile.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the display name of this vr dossier file.
	*
	* @param displayName the display name of this vr dossier file
	*/
	@Override
	public void setDisplayName(java.lang.String displayName) {
		_vrDossierFile.setDisplayName(displayName);
	}

	/**
	* Sets the dossier file ID of this vr dossier file.
	*
	* @param dossierFileId the dossier file ID of this vr dossier file
	*/
	@Override
	public void setDossierFileId(long dossierFileId) {
		_vrDossierFile.setDossierFileId(dossierFileId);
	}

	/**
	* Sets the dossier ID of this vr dossier file.
	*
	* @param dossierId the dossier ID of this vr dossier file
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrDossierFile.setDossierId(dossierId);
	}

	/**
	* Sets the dossier part no of this vr dossier file.
	*
	* @param dossierPartNo the dossier part no of this vr dossier file
	*/
	@Override
	public void setDossierPartNo(java.lang.String dossierPartNo) {
		_vrDossierFile.setDossierPartNo(dossierPartNo);
	}

	/**
	* Sets the dossier part type of this vr dossier file.
	*
	* @param dossierPartType the dossier part type of this vr dossier file
	*/
	@Override
	public void setDossierPartType(int dossierPartType) {
		_vrDossierFile.setDossierPartType(dossierPartType);
	}

	/**
	* Sets the dossier template no of this vr dossier file.
	*
	* @param dossierTemplateNo the dossier template no of this vr dossier file
	*/
	@Override
	public void setDossierTemplateNo(java.lang.String dossierTemplateNo) {
		_vrDossierFile.setDossierTemplateNo(dossierTemplateNo);
	}

	/**
	* Sets whether this vr dossier file is e form.
	*
	* @param eForm the e form of this vr dossier file
	*/
	@Override
	public void setEForm(boolean eForm) {
		_vrDossierFile.setEForm(eForm);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrDossierFile.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrDossierFile.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrDossierFile.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the file entry ID of this vr dossier file.
	*
	* @param fileEntryId the file entry ID of this vr dossier file
	*/
	@Override
	public void setFileEntryId(long fileEntryId) {
		_vrDossierFile.setFileEntryId(fileEntryId);
	}

	/**
	* Sets the file template no of this vr dossier file.
	*
	* @param fileTemplateNo the file template no of this vr dossier file
	*/
	@Override
	public void setFileTemplateNo(java.lang.String fileTemplateNo) {
		_vrDossierFile.setFileTemplateNo(fileTemplateNo);
	}

	/**
	* Sets the form data of this vr dossier file.
	*
	* @param formData the form data of this vr dossier file
	*/
	@Override
	public void setFormData(java.lang.String formData) {
		_vrDossierFile.setFormData(formData);
	}

	/**
	* Sets the form data dossier file of this vr dossier file.
	*
	* @param formDataDossierFile the form data dossier file of this vr dossier file
	*/
	@Override
	public void setFormDataDossierFile(long formDataDossierFile) {
		_vrDossierFile.setFormDataDossierFile(formDataDossierFile);
	}

	/**
	* Sets the form report of this vr dossier file.
	*
	* @param formReport the form report of this vr dossier file
	*/
	@Override
	public void setFormReport(java.lang.String formReport) {
		_vrDossierFile.setFormReport(formReport);
	}

	/**
	* Sets the form schema of this vr dossier file.
	*
	* @param formSchema the form schema of this vr dossier file
	*/
	@Override
	public void setFormSchema(java.lang.String formSchema) {
		_vrDossierFile.setFormSchema(formSchema);
	}

	/**
	* Sets the form script of this vr dossier file.
	*
	* @param formScript the form script of this vr dossier file
	*/
	@Override
	public void setFormScript(java.lang.String formScript) {
		_vrDossierFile.setFormScript(formScript);
	}

	/**
	* Sets the group ID of this vr dossier file.
	*
	* @param groupId the group ID of this vr dossier file
	*/
	@Override
	public void setGroupId(long groupId) {
		_vrDossierFile.setGroupId(groupId);
	}

	/**
	* Sets whether this vr dossier file is is new.
	*
	* @param isNew the is new of this vr dossier file
	*/
	@Override
	public void setIsNew(boolean isNew) {
		_vrDossierFile.setIsNew(isNew);
	}

	/**
	* Sets the modified date of this vr dossier file.
	*
	* @param modifiedDate the modified date of this vr dossier file
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vrDossierFile.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vrDossierFile.setNew(n);
	}

	/**
	* Sets whether this vr dossier file is original.
	*
	* @param original the original of this vr dossier file
	*/
	@Override
	public void setOriginal(boolean original) {
		_vrDossierFile.setOriginal(original);
	}

	/**
	* Sets the primary key of this vr dossier file.
	*
	* @param primaryKey the primary key of this vr dossier file
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrDossierFile.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrDossierFile.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr dossier file.
	*
	* @param referenceUid the reference uid of this vr dossier file
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrDossierFile.setReferenceUid(referenceUid);
	}

	/**
	* Sets whether this vr dossier file is removed.
	*
	* @param removed the removed of this vr dossier file
	*/
	@Override
	public void setRemoved(boolean removed) {
		_vrDossierFile.setRemoved(removed);
	}

	/**
	* Sets the sign check of this vr dossier file.
	*
	* @param signCheck the sign check of this vr dossier file
	*/
	@Override
	public void setSignCheck(int signCheck) {
		_vrDossierFile.setSignCheck(signCheck);
	}

	/**
	* Sets the sign info of this vr dossier file.
	*
	* @param signInfo the sign info of this vr dossier file
	*/
	@Override
	public void setSignInfo(java.lang.String signInfo) {
		_vrDossierFile.setSignInfo(signInfo);
	}

	/**
	* Sets the user ID of this vr dossier file.
	*
	* @param userId the user ID of this vr dossier file
	*/
	@Override
	public void setUserId(long userId) {
		_vrDossierFile.setUserId(userId);
	}

	/**
	* Sets the user name of this vr dossier file.
	*
	* @param userName the user name of this vr dossier file
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_vrDossierFile.setUserName(userName);
	}

	/**
	* Sets the user uuid of this vr dossier file.
	*
	* @param userUuid the user uuid of this vr dossier file
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vrDossierFile.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this vr dossier file.
	*
	* @param uuid the uuid of this vr dossier file
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_vrDossierFile.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRDossierFileWrapper)) {
			return false;
		}

		VRDossierFileWrapper vrDossierFileWrapper = (VRDossierFileWrapper)obj;

		if (Objects.equals(_vrDossierFile, vrDossierFileWrapper._vrDossierFile)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _vrDossierFile.getStagedModelType();
	}

	@Override
	public VRDossierFile getWrappedModel() {
		return _vrDossierFile;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrDossierFile.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrDossierFile.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrDossierFile.resetOriginalValues();
	}

	private final VRDossierFile _vrDossierFile;
}