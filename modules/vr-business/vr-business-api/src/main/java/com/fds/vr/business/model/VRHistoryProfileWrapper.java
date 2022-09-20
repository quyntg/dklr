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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRHistoryProfile}.
 * </p>
 *
 * @author LamTV
 * @see VRHistoryProfile
 * @generated
 */
@ProviderType
public class VRHistoryProfileWrapper implements VRHistoryProfile,
	ModelWrapper<VRHistoryProfile> {
	public VRHistoryProfileWrapper(VRHistoryProfile vrHistoryProfile) {
		_vrHistoryProfile = vrHistoryProfile;
	}

	@Override
	public Class<?> getModelClass() {
		return VRHistoryProfile.class;
	}

	@Override
	public String getModelClassName() {
		return VRHistoryProfile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("applicantCode", getApplicantCode());
		attributes.put("productionPlantCode", getProductionPlantCode());
		attributes.put("contentType", getContentType());
		attributes.put("contentFileTemplate", getContentFileTemplate());
		attributes.put("contentFileEntryId", getContentFileEntryId());
		attributes.put("contentjsonFileEntryId", getContentjsonFileEntryId());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("dossierNo", getDossierNo());
		attributes.put("modifyUserId", getModifyUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String applicantCode = (String)attributes.get("applicantCode");

		if (applicantCode != null) {
			setApplicantCode(applicantCode);
		}

		String productionPlantCode = (String)attributes.get(
				"productionPlantCode");

		if (productionPlantCode != null) {
			setProductionPlantCode(productionPlantCode);
		}

		String contentType = (String)attributes.get("contentType");

		if (contentType != null) {
			setContentType(contentType);
		}

		String contentFileTemplate = (String)attributes.get(
				"contentFileTemplate");

		if (contentFileTemplate != null) {
			setContentFileTemplate(contentFileTemplate);
		}

		Long contentFileEntryId = (Long)attributes.get("contentFileEntryId");

		if (contentFileEntryId != null) {
			setContentFileEntryId(contentFileEntryId);
		}

		Long contentjsonFileEntryId = (Long)attributes.get(
				"contentjsonFileEntryId");

		if (contentjsonFileEntryId != null) {
			setContentjsonFileEntryId(contentjsonFileEntryId);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String dossierIdCTN = (String)attributes.get("dossierIdCTN");

		if (dossierIdCTN != null) {
			setDossierIdCTN(dossierIdCTN);
		}

		String dossierNo = (String)attributes.get("dossierNo");

		if (dossierNo != null) {
			setDossierNo(dossierNo);
		}

		Long modifyUserId = (Long)attributes.get("modifyUserId");

		if (modifyUserId != null) {
			setModifyUserId(modifyUserId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public VRHistoryProfile toEscapedModel() {
		return new VRHistoryProfileWrapper(_vrHistoryProfile.toEscapedModel());
	}

	@Override
	public VRHistoryProfile toUnescapedModel() {
		return new VRHistoryProfileWrapper(_vrHistoryProfile.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrHistoryProfile.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrHistoryProfile.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrHistoryProfile.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrHistoryProfile.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRHistoryProfile> toCacheModel() {
		return _vrHistoryProfile.toCacheModel();
	}

	@Override
	public int compareTo(VRHistoryProfile vrHistoryProfile) {
		return _vrHistoryProfile.compareTo(vrHistoryProfile);
	}

	@Override
	public int hashCode() {
		return _vrHistoryProfile.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrHistoryProfile.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRHistoryProfileWrapper((VRHistoryProfile)_vrHistoryProfile.clone());
	}

	/**
	* Returns the applicant code of this vr history profile.
	*
	* @return the applicant code of this vr history profile
	*/
	@Override
	public java.lang.String getApplicantCode() {
		return _vrHistoryProfile.getApplicantCode();
	}

	/**
	* Returns the content file template of this vr history profile.
	*
	* @return the content file template of this vr history profile
	*/
	@Override
	public java.lang.String getContentFileTemplate() {
		return _vrHistoryProfile.getContentFileTemplate();
	}

	/**
	* Returns the content type of this vr history profile.
	*
	* @return the content type of this vr history profile
	*/
	@Override
	public java.lang.String getContentType() {
		return _vrHistoryProfile.getContentType();
	}

	/**
	* Returns the dossier ID ctn of this vr history profile.
	*
	* @return the dossier ID ctn of this vr history profile
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrHistoryProfile.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr history profile.
	*
	* @return the dossier no of this vr history profile
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrHistoryProfile.getDossierNo();
	}

	/**
	* Returns the modify user uuid of this vr history profile.
	*
	* @return the modify user uuid of this vr history profile
	*/
	@Override
	public java.lang.String getModifyUserUuid() {
		return _vrHistoryProfile.getModifyUserUuid();
	}

	/**
	* Returns the production plant code of this vr history profile.
	*
	* @return the production plant code of this vr history profile
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrHistoryProfile.getProductionPlantCode();
	}

	@Override
	public java.lang.String toString() {
		return _vrHistoryProfile.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrHistoryProfile.toXmlString();
	}

	/**
	* Returns the created date of this vr history profile.
	*
	* @return the created date of this vr history profile
	*/
	@Override
	public Date getCreatedDate() {
		return _vrHistoryProfile.getCreatedDate();
	}

	/**
	* Returns the modify date of this vr history profile.
	*
	* @return the modify date of this vr history profile
	*/
	@Override
	public Date getModifyDate() {
		return _vrHistoryProfile.getModifyDate();
	}

	/**
	* Returns the sync date of this vr history profile.
	*
	* @return the sync date of this vr history profile
	*/
	@Override
	public Date getSyncDate() {
		return _vrHistoryProfile.getSyncDate();
	}

	/**
	* Returns the content file entry ID of this vr history profile.
	*
	* @return the content file entry ID of this vr history profile
	*/
	@Override
	public long getContentFileEntryId() {
		return _vrHistoryProfile.getContentFileEntryId();
	}

	/**
	* Returns the contentjson file entry ID of this vr history profile.
	*
	* @return the contentjson file entry ID of this vr history profile
	*/
	@Override
	public long getContentjsonFileEntryId() {
		return _vrHistoryProfile.getContentjsonFileEntryId();
	}

	/**
	* Returns the dossier ID of this vr history profile.
	*
	* @return the dossier ID of this vr history profile
	*/
	@Override
	public long getDossierId() {
		return _vrHistoryProfile.getDossierId();
	}

	/**
	* Returns the ID of this vr history profile.
	*
	* @return the ID of this vr history profile
	*/
	@Override
	public long getId() {
		return _vrHistoryProfile.getId();
	}

	/**
	* Returns the modify user ID of this vr history profile.
	*
	* @return the modify user ID of this vr history profile
	*/
	@Override
	public long getModifyUserId() {
		return _vrHistoryProfile.getModifyUserId();
	}

	/**
	* Returns the primary key of this vr history profile.
	*
	* @return the primary key of this vr history profile
	*/
	@Override
	public long getPrimaryKey() {
		return _vrHistoryProfile.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrHistoryProfile.persist();
	}

	/**
	* Sets the applicant code of this vr history profile.
	*
	* @param applicantCode the applicant code of this vr history profile
	*/
	@Override
	public void setApplicantCode(java.lang.String applicantCode) {
		_vrHistoryProfile.setApplicantCode(applicantCode);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrHistoryProfile.setCachedModel(cachedModel);
	}

	/**
	* Sets the content file entry ID of this vr history profile.
	*
	* @param contentFileEntryId the content file entry ID of this vr history profile
	*/
	@Override
	public void setContentFileEntryId(long contentFileEntryId) {
		_vrHistoryProfile.setContentFileEntryId(contentFileEntryId);
	}

	/**
	* Sets the content file template of this vr history profile.
	*
	* @param contentFileTemplate the content file template of this vr history profile
	*/
	@Override
	public void setContentFileTemplate(java.lang.String contentFileTemplate) {
		_vrHistoryProfile.setContentFileTemplate(contentFileTemplate);
	}

	/**
	* Sets the content type of this vr history profile.
	*
	* @param contentType the content type of this vr history profile
	*/
	@Override
	public void setContentType(java.lang.String contentType) {
		_vrHistoryProfile.setContentType(contentType);
	}

	/**
	* Sets the contentjson file entry ID of this vr history profile.
	*
	* @param contentjsonFileEntryId the contentjson file entry ID of this vr history profile
	*/
	@Override
	public void setContentjsonFileEntryId(long contentjsonFileEntryId) {
		_vrHistoryProfile.setContentjsonFileEntryId(contentjsonFileEntryId);
	}

	/**
	* Sets the created date of this vr history profile.
	*
	* @param createdDate the created date of this vr history profile
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vrHistoryProfile.setCreatedDate(createdDate);
	}

	/**
	* Sets the dossier ID of this vr history profile.
	*
	* @param dossierId the dossier ID of this vr history profile
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrHistoryProfile.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr history profile.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr history profile
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrHistoryProfile.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr history profile.
	*
	* @param dossierNo the dossier no of this vr history profile
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrHistoryProfile.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrHistoryProfile.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrHistoryProfile.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrHistoryProfile.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr history profile.
	*
	* @param id the ID of this vr history profile
	*/
	@Override
	public void setId(long id) {
		_vrHistoryProfile.setId(id);
	}

	/**
	* Sets the modify date of this vr history profile.
	*
	* @param modifyDate the modify date of this vr history profile
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrHistoryProfile.setModifyDate(modifyDate);
	}

	/**
	* Sets the modify user ID of this vr history profile.
	*
	* @param modifyUserId the modify user ID of this vr history profile
	*/
	@Override
	public void setModifyUserId(long modifyUserId) {
		_vrHistoryProfile.setModifyUserId(modifyUserId);
	}

	/**
	* Sets the modify user uuid of this vr history profile.
	*
	* @param modifyUserUuid the modify user uuid of this vr history profile
	*/
	@Override
	public void setModifyUserUuid(java.lang.String modifyUserUuid) {
		_vrHistoryProfile.setModifyUserUuid(modifyUserUuid);
	}

	@Override
	public void setNew(boolean n) {
		_vrHistoryProfile.setNew(n);
	}

	/**
	* Sets the primary key of this vr history profile.
	*
	* @param primaryKey the primary key of this vr history profile
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrHistoryProfile.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrHistoryProfile.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production plant code of this vr history profile.
	*
	* @param productionPlantCode the production plant code of this vr history profile
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrHistoryProfile.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the sync date of this vr history profile.
	*
	* @param syncDate the sync date of this vr history profile
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrHistoryProfile.setSyncDate(syncDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRHistoryProfileWrapper)) {
			return false;
		}

		VRHistoryProfileWrapper vrHistoryProfileWrapper = (VRHistoryProfileWrapper)obj;

		if (Objects.equals(_vrHistoryProfile,
					vrHistoryProfileWrapper._vrHistoryProfile)) {
			return true;
		}

		return false;
	}

	@Override
	public VRHistoryProfile getWrappedModel() {
		return _vrHistoryProfile;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrHistoryProfile.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrHistoryProfile.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrHistoryProfile.resetOriginalValues();
	}

	private final VRHistoryProfile _vrHistoryProfile;
}