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
 * This class is a wrapper for {@link VRInspectionStandard}.
 * </p>
 *
 * @author LamTV
 * @see VRInspectionStandard
 * @generated
 */
@ProviderType
public class VRInspectionStandardWrapper implements VRInspectionStandard,
	ModelWrapper<VRInspectionStandard> {
	public VRInspectionStandardWrapper(
		VRInspectionStandard vrInspectionStandard) {
		_vrInspectionStandard = vrInspectionStandard;
	}

	@Override
	public Class<?> getModelClass() {
		return VRInspectionStandard.class;
	}

	@Override
	public String getModelClassName() {
		return VRInspectionStandard.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleCertificateId", getVehicleCertificateId());
		attributes.put("deliverableCode", getDeliverableCode());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("circularno", getCircularno());
		attributes.put("circulardate", getCirculardate());
		attributes.put("markupstatus", getMarkupstatus());
		attributes.put("module", getModule());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("dossierNo", getDossierNo());
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

		Long vehicleCertificateId = (Long)attributes.get("vehicleCertificateId");

		if (vehicleCertificateId != null) {
			setVehicleCertificateId(vehicleCertificateId);
		}

		String deliverableCode = (String)attributes.get("deliverableCode");

		if (deliverableCode != null) {
			setDeliverableCode(deliverableCode);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String circularno = (String)attributes.get("circularno");

		if (circularno != null) {
			setCircularno(circularno);
		}

		Date circulardate = (Date)attributes.get("circulardate");

		if (circulardate != null) {
			setCirculardate(circulardate);
		}

		Long markupstatus = (Long)attributes.get("markupstatus");

		if (markupstatus != null) {
			setMarkupstatus(markupstatus);
		}

		String module = (String)attributes.get("module");

		if (module != null) {
			setModule(module);
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
	public VRInspectionStandard toEscapedModel() {
		return new VRInspectionStandardWrapper(_vrInspectionStandard.toEscapedModel());
	}

	@Override
	public VRInspectionStandard toUnescapedModel() {
		return new VRInspectionStandardWrapper(_vrInspectionStandard.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrInspectionStandard.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrInspectionStandard.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrInspectionStandard.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrInspectionStandard.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRInspectionStandard> toCacheModel() {
		return _vrInspectionStandard.toCacheModel();
	}

	@Override
	public int compareTo(VRInspectionStandard vrInspectionStandard) {
		return _vrInspectionStandard.compareTo(vrInspectionStandard);
	}

	@Override
	public int hashCode() {
		return _vrInspectionStandard.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrInspectionStandard.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRInspectionStandardWrapper((VRInspectionStandard)_vrInspectionStandard.clone());
	}

	/**
	* Returns the circularno of this vr inspection standard.
	*
	* @return the circularno of this vr inspection standard
	*/
	@Override
	public java.lang.String getCircularno() {
		return _vrInspectionStandard.getCircularno();
	}

	/**
	* Returns the deliverable code of this vr inspection standard.
	*
	* @return the deliverable code of this vr inspection standard
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrInspectionStandard.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr inspection standard.
	*
	* @return the dossier ID ctn of this vr inspection standard
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrInspectionStandard.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr inspection standard.
	*
	* @return the dossier no of this vr inspection standard
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrInspectionStandard.getDossierNo();
	}

	/**
	* Returns the module of this vr inspection standard.
	*
	* @return the module of this vr inspection standard
	*/
	@Override
	public java.lang.String getModule() {
		return _vrInspectionStandard.getModule();
	}

	@Override
	public java.lang.String toString() {
		return _vrInspectionStandard.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrInspectionStandard.toXmlString();
	}

	/**
	* Returns the circulardate of this vr inspection standard.
	*
	* @return the circulardate of this vr inspection standard
	*/
	@Override
	public Date getCirculardate() {
		return _vrInspectionStandard.getCirculardate();
	}

	/**
	* Returns the modify date of this vr inspection standard.
	*
	* @return the modify date of this vr inspection standard
	*/
	@Override
	public Date getModifyDate() {
		return _vrInspectionStandard.getModifyDate();
	}

	/**
	* Returns the sync date of this vr inspection standard.
	*
	* @return the sync date of this vr inspection standard
	*/
	@Override
	public Date getSyncDate() {
		return _vrInspectionStandard.getSyncDate();
	}

	/**
	* Returns the dossier ID of this vr inspection standard.
	*
	* @return the dossier ID of this vr inspection standard
	*/
	@Override
	public long getDossierId() {
		return _vrInspectionStandard.getDossierId();
	}

	/**
	* Returns the ID of this vr inspection standard.
	*
	* @return the ID of this vr inspection standard
	*/
	@Override
	public long getId() {
		return _vrInspectionStandard.getId();
	}

	/**
	* Returns the markupstatus of this vr inspection standard.
	*
	* @return the markupstatus of this vr inspection standard
	*/
	@Override
	public long getMarkupstatus() {
		return _vrInspectionStandard.getMarkupstatus();
	}

	/**
	* Returns the primary key of this vr inspection standard.
	*
	* @return the primary key of this vr inspection standard
	*/
	@Override
	public long getPrimaryKey() {
		return _vrInspectionStandard.getPrimaryKey();
	}

	/**
	* Returns the sequence no of this vr inspection standard.
	*
	* @return the sequence no of this vr inspection standard
	*/
	@Override
	public long getSequenceNo() {
		return _vrInspectionStandard.getSequenceNo();
	}

	/**
	* Returns the vehicle certificate ID of this vr inspection standard.
	*
	* @return the vehicle certificate ID of this vr inspection standard
	*/
	@Override
	public long getVehicleCertificateId() {
		return _vrInspectionStandard.getVehicleCertificateId();
	}

	@Override
	public void persist() {
		_vrInspectionStandard.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrInspectionStandard.setCachedModel(cachedModel);
	}

	/**
	* Sets the circulardate of this vr inspection standard.
	*
	* @param circulardate the circulardate of this vr inspection standard
	*/
	@Override
	public void setCirculardate(Date circulardate) {
		_vrInspectionStandard.setCirculardate(circulardate);
	}

	/**
	* Sets the circularno of this vr inspection standard.
	*
	* @param circularno the circularno of this vr inspection standard
	*/
	@Override
	public void setCircularno(java.lang.String circularno) {
		_vrInspectionStandard.setCircularno(circularno);
	}

	/**
	* Sets the deliverable code of this vr inspection standard.
	*
	* @param deliverableCode the deliverable code of this vr inspection standard
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrInspectionStandard.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr inspection standard.
	*
	* @param dossierId the dossier ID of this vr inspection standard
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrInspectionStandard.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr inspection standard.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr inspection standard
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrInspectionStandard.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr inspection standard.
	*
	* @param dossierNo the dossier no of this vr inspection standard
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrInspectionStandard.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrInspectionStandard.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrInspectionStandard.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrInspectionStandard.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr inspection standard.
	*
	* @param id the ID of this vr inspection standard
	*/
	@Override
	public void setId(long id) {
		_vrInspectionStandard.setId(id);
	}

	/**
	* Sets the markupstatus of this vr inspection standard.
	*
	* @param markupstatus the markupstatus of this vr inspection standard
	*/
	@Override
	public void setMarkupstatus(long markupstatus) {
		_vrInspectionStandard.setMarkupstatus(markupstatus);
	}

	/**
	* Sets the modify date of this vr inspection standard.
	*
	* @param modifyDate the modify date of this vr inspection standard
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrInspectionStandard.setModifyDate(modifyDate);
	}

	/**
	* Sets the module of this vr inspection standard.
	*
	* @param module the module of this vr inspection standard
	*/
	@Override
	public void setModule(java.lang.String module) {
		_vrInspectionStandard.setModule(module);
	}

	@Override
	public void setNew(boolean n) {
		_vrInspectionStandard.setNew(n);
	}

	/**
	* Sets the primary key of this vr inspection standard.
	*
	* @param primaryKey the primary key of this vr inspection standard
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrInspectionStandard.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrInspectionStandard.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sequence no of this vr inspection standard.
	*
	* @param sequenceNo the sequence no of this vr inspection standard
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrInspectionStandard.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the sync date of this vr inspection standard.
	*
	* @param syncDate the sync date of this vr inspection standard
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrInspectionStandard.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle certificate ID of this vr inspection standard.
	*
	* @param vehicleCertificateId the vehicle certificate ID of this vr inspection standard
	*/
	@Override
	public void setVehicleCertificateId(long vehicleCertificateId) {
		_vrInspectionStandard.setVehicleCertificateId(vehicleCertificateId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRInspectionStandardWrapper)) {
			return false;
		}

		VRInspectionStandardWrapper vrInspectionStandardWrapper = (VRInspectionStandardWrapper)obj;

		if (Objects.equals(_vrInspectionStandard,
					vrInspectionStandardWrapper._vrInspectionStandard)) {
			return true;
		}

		return false;
	}

	@Override
	public VRInspectionStandard getWrappedModel() {
		return _vrInspectionStandard;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrInspectionStandard.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrInspectionStandard.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrInspectionStandard.resetOriginalValues();
	}

	private final VRInspectionStandard _vrInspectionStandard;
}