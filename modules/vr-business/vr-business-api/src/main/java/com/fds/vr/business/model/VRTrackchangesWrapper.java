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
 * This class is a wrapper for {@link VRTrackchanges}.
 * </p>
 *
 * @author LamTV
 * @see VRTrackchanges
 * @generated
 */
@ProviderType
public class VRTrackchangesWrapper implements VRTrackchanges,
	ModelWrapper<VRTrackchanges> {
	public VRTrackchangesWrapper(VRTrackchanges vrTrackchanges) {
		_vrTrackchanges = vrTrackchanges;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTrackchanges.class;
	}

	@Override
	public String getModelClassName() {
		return VRTrackchanges.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("applicantCode", getApplicantCode());
		attributes.put("productionPlantCode", getProductionPlantCode());
		attributes.put("contentType", getContentType());
		attributes.put("contentFileTemplate", getContentFileTemplate());
		attributes.put("previousContentFileEntryId",
			getPreviousContentFileEntryId());
		attributes.put("currentContentFileEntryId",
			getCurrentContentFileEntryId());
		attributes.put("nextContentFileEntryId", getNextContentFileEntryId());
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

		Long previousContentFileEntryId = (Long)attributes.get(
				"previousContentFileEntryId");

		if (previousContentFileEntryId != null) {
			setPreviousContentFileEntryId(previousContentFileEntryId);
		}

		Long currentContentFileEntryId = (Long)attributes.get(
				"currentContentFileEntryId");

		if (currentContentFileEntryId != null) {
			setCurrentContentFileEntryId(currentContentFileEntryId);
		}

		Long nextContentFileEntryId = (Long)attributes.get(
				"nextContentFileEntryId");

		if (nextContentFileEntryId != null) {
			setNextContentFileEntryId(nextContentFileEntryId);
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
	public VRTrackchanges toEscapedModel() {
		return new VRTrackchangesWrapper(_vrTrackchanges.toEscapedModel());
	}

	@Override
	public VRTrackchanges toUnescapedModel() {
		return new VRTrackchangesWrapper(_vrTrackchanges.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTrackchanges.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTrackchanges.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTrackchanges.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTrackchanges.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTrackchanges> toCacheModel() {
		return _vrTrackchanges.toCacheModel();
	}

	@Override
	public int compareTo(VRTrackchanges vrTrackchanges) {
		return _vrTrackchanges.compareTo(vrTrackchanges);
	}

	@Override
	public int hashCode() {
		return _vrTrackchanges.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTrackchanges.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTrackchangesWrapper((VRTrackchanges)_vrTrackchanges.clone());
	}

	/**
	* Returns the applicant code of this vr trackchanges.
	*
	* @return the applicant code of this vr trackchanges
	*/
	@Override
	public java.lang.String getApplicantCode() {
		return _vrTrackchanges.getApplicantCode();
	}

	/**
	* Returns the content file template of this vr trackchanges.
	*
	* @return the content file template of this vr trackchanges
	*/
	@Override
	public java.lang.String getContentFileTemplate() {
		return _vrTrackchanges.getContentFileTemplate();
	}

	/**
	* Returns the content type of this vr trackchanges.
	*
	* @return the content type of this vr trackchanges
	*/
	@Override
	public java.lang.String getContentType() {
		return _vrTrackchanges.getContentType();
	}

	/**
	* Returns the dossier ID ctn of this vr trackchanges.
	*
	* @return the dossier ID ctn of this vr trackchanges
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTrackchanges.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr trackchanges.
	*
	* @return the dossier no of this vr trackchanges
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTrackchanges.getDossierNo();
	}

	/**
	* Returns the modify user uuid of this vr trackchanges.
	*
	* @return the modify user uuid of this vr trackchanges
	*/
	@Override
	public java.lang.String getModifyUserUuid() {
		return _vrTrackchanges.getModifyUserUuid();
	}

	/**
	* Returns the production plant code of this vr trackchanges.
	*
	* @return the production plant code of this vr trackchanges
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrTrackchanges.getProductionPlantCode();
	}

	@Override
	public java.lang.String toString() {
		return _vrTrackchanges.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTrackchanges.toXmlString();
	}

	/**
	* Returns the created date of this vr trackchanges.
	*
	* @return the created date of this vr trackchanges
	*/
	@Override
	public Date getCreatedDate() {
		return _vrTrackchanges.getCreatedDate();
	}

	/**
	* Returns the modify date of this vr trackchanges.
	*
	* @return the modify date of this vr trackchanges
	*/
	@Override
	public Date getModifyDate() {
		return _vrTrackchanges.getModifyDate();
	}

	/**
	* Returns the sync date of this vr trackchanges.
	*
	* @return the sync date of this vr trackchanges
	*/
	@Override
	public Date getSyncDate() {
		return _vrTrackchanges.getSyncDate();
	}

	/**
	* Returns the current content file entry ID of this vr trackchanges.
	*
	* @return the current content file entry ID of this vr trackchanges
	*/
	@Override
	public long getCurrentContentFileEntryId() {
		return _vrTrackchanges.getCurrentContentFileEntryId();
	}

	/**
	* Returns the dossier ID of this vr trackchanges.
	*
	* @return the dossier ID of this vr trackchanges
	*/
	@Override
	public long getDossierId() {
		return _vrTrackchanges.getDossierId();
	}

	/**
	* Returns the ID of this vr trackchanges.
	*
	* @return the ID of this vr trackchanges
	*/
	@Override
	public long getId() {
		return _vrTrackchanges.getId();
	}

	/**
	* Returns the modify user ID of this vr trackchanges.
	*
	* @return the modify user ID of this vr trackchanges
	*/
	@Override
	public long getModifyUserId() {
		return _vrTrackchanges.getModifyUserId();
	}

	/**
	* Returns the next content file entry ID of this vr trackchanges.
	*
	* @return the next content file entry ID of this vr trackchanges
	*/
	@Override
	public long getNextContentFileEntryId() {
		return _vrTrackchanges.getNextContentFileEntryId();
	}

	/**
	* Returns the previous content file entry ID of this vr trackchanges.
	*
	* @return the previous content file entry ID of this vr trackchanges
	*/
	@Override
	public long getPreviousContentFileEntryId() {
		return _vrTrackchanges.getPreviousContentFileEntryId();
	}

	/**
	* Returns the primary key of this vr trackchanges.
	*
	* @return the primary key of this vr trackchanges
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTrackchanges.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrTrackchanges.persist();
	}

	/**
	* Sets the applicant code of this vr trackchanges.
	*
	* @param applicantCode the applicant code of this vr trackchanges
	*/
	@Override
	public void setApplicantCode(java.lang.String applicantCode) {
		_vrTrackchanges.setApplicantCode(applicantCode);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTrackchanges.setCachedModel(cachedModel);
	}

	/**
	* Sets the content file template of this vr trackchanges.
	*
	* @param contentFileTemplate the content file template of this vr trackchanges
	*/
	@Override
	public void setContentFileTemplate(java.lang.String contentFileTemplate) {
		_vrTrackchanges.setContentFileTemplate(contentFileTemplate);
	}

	/**
	* Sets the content type of this vr trackchanges.
	*
	* @param contentType the content type of this vr trackchanges
	*/
	@Override
	public void setContentType(java.lang.String contentType) {
		_vrTrackchanges.setContentType(contentType);
	}

	/**
	* Sets the created date of this vr trackchanges.
	*
	* @param createdDate the created date of this vr trackchanges
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vrTrackchanges.setCreatedDate(createdDate);
	}

	/**
	* Sets the current content file entry ID of this vr trackchanges.
	*
	* @param currentContentFileEntryId the current content file entry ID of this vr trackchanges
	*/
	@Override
	public void setCurrentContentFileEntryId(long currentContentFileEntryId) {
		_vrTrackchanges.setCurrentContentFileEntryId(currentContentFileEntryId);
	}

	/**
	* Sets the dossier ID of this vr trackchanges.
	*
	* @param dossierId the dossier ID of this vr trackchanges
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTrackchanges.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr trackchanges.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr trackchanges
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTrackchanges.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr trackchanges.
	*
	* @param dossierNo the dossier no of this vr trackchanges
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTrackchanges.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTrackchanges.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTrackchanges.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTrackchanges.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr trackchanges.
	*
	* @param id the ID of this vr trackchanges
	*/
	@Override
	public void setId(long id) {
		_vrTrackchanges.setId(id);
	}

	/**
	* Sets the modify date of this vr trackchanges.
	*
	* @param modifyDate the modify date of this vr trackchanges
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTrackchanges.setModifyDate(modifyDate);
	}

	/**
	* Sets the modify user ID of this vr trackchanges.
	*
	* @param modifyUserId the modify user ID of this vr trackchanges
	*/
	@Override
	public void setModifyUserId(long modifyUserId) {
		_vrTrackchanges.setModifyUserId(modifyUserId);
	}

	/**
	* Sets the modify user uuid of this vr trackchanges.
	*
	* @param modifyUserUuid the modify user uuid of this vr trackchanges
	*/
	@Override
	public void setModifyUserUuid(java.lang.String modifyUserUuid) {
		_vrTrackchanges.setModifyUserUuid(modifyUserUuid);
	}

	@Override
	public void setNew(boolean n) {
		_vrTrackchanges.setNew(n);
	}

	/**
	* Sets the next content file entry ID of this vr trackchanges.
	*
	* @param nextContentFileEntryId the next content file entry ID of this vr trackchanges
	*/
	@Override
	public void setNextContentFileEntryId(long nextContentFileEntryId) {
		_vrTrackchanges.setNextContentFileEntryId(nextContentFileEntryId);
	}

	/**
	* Sets the previous content file entry ID of this vr trackchanges.
	*
	* @param previousContentFileEntryId the previous content file entry ID of this vr trackchanges
	*/
	@Override
	public void setPreviousContentFileEntryId(long previousContentFileEntryId) {
		_vrTrackchanges.setPreviousContentFileEntryId(previousContentFileEntryId);
	}

	/**
	* Sets the primary key of this vr trackchanges.
	*
	* @param primaryKey the primary key of this vr trackchanges
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTrackchanges.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTrackchanges.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production plant code of this vr trackchanges.
	*
	* @param productionPlantCode the production plant code of this vr trackchanges
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrTrackchanges.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the sync date of this vr trackchanges.
	*
	* @param syncDate the sync date of this vr trackchanges
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTrackchanges.setSyncDate(syncDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTrackchangesWrapper)) {
			return false;
		}

		VRTrackchangesWrapper vrTrackchangesWrapper = (VRTrackchangesWrapper)obj;

		if (Objects.equals(_vrTrackchanges,
					vrTrackchangesWrapper._vrTrackchanges)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTrackchanges getWrappedModel() {
		return _vrTrackchanges;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTrackchanges.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTrackchanges.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTrackchanges.resetOriginalValues();
	}

	private final VRTrackchanges _vrTrackchanges;
}