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
 * This class is a wrapper for {@link VRIssueEquipmentCertificate}.
 * </p>
 *
 * @author LamTV
 * @see VRIssueEquipmentCertificate
 * @generated
 */
@ProviderType
public class VRIssueEquipmentCertificateWrapper
	implements VRIssueEquipmentCertificate,
		ModelWrapper<VRIssueEquipmentCertificate> {
	public VRIssueEquipmentCertificateWrapper(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate) {
		_vrIssueEquipmentCertificate = vrIssueEquipmentCertificate;
	}

	@Override
	public Class<?> getModelClass() {
		return VRIssueEquipmentCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return VRIssueEquipmentCertificate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("dossierId", getDossierId());
		attributes.put("issueId", getIssueId());
		attributes.put("issueVehicleCertificateId",
			getIssueVehicleCertificateId());
		attributes.put("vehicleCertificateRecordNo",
			getVehicleCertificateRecordNo());
		attributes.put("equipmentName", getEquipmentName());
		attributes.put("equipmentType", getEquipmentType());
		attributes.put("equipmentCertificateType", getEquipmentCertificateType());
		attributes.put("equipmentDocumentNo", getEquipmentDocumentNo());
		attributes.put("equipmentCertificateRecordNo",
			getEquipmentCertificateRecordNo());
		attributes.put("equipmentExamRecordNo", getEquipmentExamRecordNo());
		attributes.put("EquipmentCertificateRecordId",
			getEquipmentCertificateRecordId());
		attributes.put("TotalQuantity", getTotalQuantity());
		attributes.put("TotalProductUsed", getTotalProductUsed());
		attributes.put("TotalInUse", getTotalInUse());
		attributes.put("TotalNotUsed", getTotalNotUsed());
		attributes.put("applicantNo", getApplicantNo());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("productionPlantName", getProductionPlantName());
		attributes.put("productionPlantAddress", getProductionPlantAddress());
		attributes.put("vehicleCertificateRecordDate",
			getVehicleCertificateRecordDate());
		attributes.put("equipmentCertificateRecordDate",
			getEquipmentCertificateRecordDate());
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

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long issueId = (Long)attributes.get("issueId");

		if (issueId != null) {
			setIssueId(issueId);
		}

		Long issueVehicleCertificateId = (Long)attributes.get(
				"issueVehicleCertificateId");

		if (issueVehicleCertificateId != null) {
			setIssueVehicleCertificateId(issueVehicleCertificateId);
		}

		String vehicleCertificateRecordNo = (String)attributes.get(
				"vehicleCertificateRecordNo");

		if (vehicleCertificateRecordNo != null) {
			setVehicleCertificateRecordNo(vehicleCertificateRecordNo);
		}

		String equipmentName = (String)attributes.get("equipmentName");

		if (equipmentName != null) {
			setEquipmentName(equipmentName);
		}

		String equipmentType = (String)attributes.get("equipmentType");

		if (equipmentType != null) {
			setEquipmentType(equipmentType);
		}

		String equipmentCertificateType = (String)attributes.get(
				"equipmentCertificateType");

		if (equipmentCertificateType != null) {
			setEquipmentCertificateType(equipmentCertificateType);
		}

		String equipmentDocumentNo = (String)attributes.get(
				"equipmentDocumentNo");

		if (equipmentDocumentNo != null) {
			setEquipmentDocumentNo(equipmentDocumentNo);
		}

		String equipmentCertificateRecordNo = (String)attributes.get(
				"equipmentCertificateRecordNo");

		if (equipmentCertificateRecordNo != null) {
			setEquipmentCertificateRecordNo(equipmentCertificateRecordNo);
		}

		String equipmentExamRecordNo = (String)attributes.get(
				"equipmentExamRecordNo");

		if (equipmentExamRecordNo != null) {
			setEquipmentExamRecordNo(equipmentExamRecordNo);
		}

		Integer EquipmentCertificateRecordId = (Integer)attributes.get(
				"EquipmentCertificateRecordId");

		if (EquipmentCertificateRecordId != null) {
			setEquipmentCertificateRecordId(EquipmentCertificateRecordId);
		}

		Integer TotalQuantity = (Integer)attributes.get("TotalQuantity");

		if (TotalQuantity != null) {
			setTotalQuantity(TotalQuantity);
		}

		Integer TotalProductUsed = (Integer)attributes.get("TotalProductUsed");

		if (TotalProductUsed != null) {
			setTotalProductUsed(TotalProductUsed);
		}

		Integer TotalInUse = (Integer)attributes.get("TotalInUse");

		if (TotalInUse != null) {
			setTotalInUse(TotalInUse);
		}

		Integer TotalNotUsed = (Integer)attributes.get("TotalNotUsed");

		if (TotalNotUsed != null) {
			setTotalNotUsed(TotalNotUsed);
		}

		String applicantNo = (String)attributes.get("applicantNo");

		if (applicantNo != null) {
			setApplicantNo(applicantNo);
		}

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		String productionPlantName = (String)attributes.get(
				"productionPlantName");

		if (productionPlantName != null) {
			setProductionPlantName(productionPlantName);
		}

		String productionPlantAddress = (String)attributes.get(
				"productionPlantAddress");

		if (productionPlantAddress != null) {
			setProductionPlantAddress(productionPlantAddress);
		}

		Date vehicleCertificateRecordDate = (Date)attributes.get(
				"vehicleCertificateRecordDate");

		if (vehicleCertificateRecordDate != null) {
			setVehicleCertificateRecordDate(vehicleCertificateRecordDate);
		}

		Date equipmentCertificateRecordDate = (Date)attributes.get(
				"equipmentCertificateRecordDate");

		if (equipmentCertificateRecordDate != null) {
			setEquipmentCertificateRecordDate(equipmentCertificateRecordDate);
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
	public VRIssueEquipmentCertificate toEscapedModel() {
		return new VRIssueEquipmentCertificateWrapper(_vrIssueEquipmentCertificate.toEscapedModel());
	}

	@Override
	public VRIssueEquipmentCertificate toUnescapedModel() {
		return new VRIssueEquipmentCertificateWrapper(_vrIssueEquipmentCertificate.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrIssueEquipmentCertificate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrIssueEquipmentCertificate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrIssueEquipmentCertificate.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrIssueEquipmentCertificate.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRIssueEquipmentCertificate> toCacheModel() {
		return _vrIssueEquipmentCertificate.toCacheModel();
	}

	@Override
	public int compareTo(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate) {
		return _vrIssueEquipmentCertificate.compareTo(vrIssueEquipmentCertificate);
	}

	/**
	* Returns the equipment certificate record ID of this vr issue equipment certificate.
	*
	* @return the equipment certificate record ID of this vr issue equipment certificate
	*/
	@Override
	public int getEquipmentCertificateRecordId() {
		return _vrIssueEquipmentCertificate.getEquipmentCertificateRecordId();
	}

	/**
	* Returns the total in use of this vr issue equipment certificate.
	*
	* @return the total in use of this vr issue equipment certificate
	*/
	@Override
	public int getTotalInUse() {
		return _vrIssueEquipmentCertificate.getTotalInUse();
	}

	/**
	* Returns the total not used of this vr issue equipment certificate.
	*
	* @return the total not used of this vr issue equipment certificate
	*/
	@Override
	public int getTotalNotUsed() {
		return _vrIssueEquipmentCertificate.getTotalNotUsed();
	}

	/**
	* Returns the total product used of this vr issue equipment certificate.
	*
	* @return the total product used of this vr issue equipment certificate
	*/
	@Override
	public int getTotalProductUsed() {
		return _vrIssueEquipmentCertificate.getTotalProductUsed();
	}

	/**
	* Returns the total quantity of this vr issue equipment certificate.
	*
	* @return the total quantity of this vr issue equipment certificate
	*/
	@Override
	public int getTotalQuantity() {
		return _vrIssueEquipmentCertificate.getTotalQuantity();
	}

	@Override
	public int hashCode() {
		return _vrIssueEquipmentCertificate.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrIssueEquipmentCertificate.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRIssueEquipmentCertificateWrapper((VRIssueEquipmentCertificate)_vrIssueEquipmentCertificate.clone());
	}

	/**
	* Returns the applicant address of this vr issue equipment certificate.
	*
	* @return the applicant address of this vr issue equipment certificate
	*/
	@Override
	public java.lang.String getApplicantAddress() {
		return _vrIssueEquipmentCertificate.getApplicantAddress();
	}

	/**
	* Returns the applicant name of this vr issue equipment certificate.
	*
	* @return the applicant name of this vr issue equipment certificate
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _vrIssueEquipmentCertificate.getApplicantName();
	}

	/**
	* Returns the applicant no of this vr issue equipment certificate.
	*
	* @return the applicant no of this vr issue equipment certificate
	*/
	@Override
	public java.lang.String getApplicantNo() {
		return _vrIssueEquipmentCertificate.getApplicantNo();
	}

	/**
	* Returns the equipment certificate record no of this vr issue equipment certificate.
	*
	* @return the equipment certificate record no of this vr issue equipment certificate
	*/
	@Override
	public java.lang.String getEquipmentCertificateRecordNo() {
		return _vrIssueEquipmentCertificate.getEquipmentCertificateRecordNo();
	}

	/**
	* Returns the equipment certificate type of this vr issue equipment certificate.
	*
	* @return the equipment certificate type of this vr issue equipment certificate
	*/
	@Override
	public java.lang.String getEquipmentCertificateType() {
		return _vrIssueEquipmentCertificate.getEquipmentCertificateType();
	}

	/**
	* Returns the equipment document no of this vr issue equipment certificate.
	*
	* @return the equipment document no of this vr issue equipment certificate
	*/
	@Override
	public java.lang.String getEquipmentDocumentNo() {
		return _vrIssueEquipmentCertificate.getEquipmentDocumentNo();
	}

	/**
	* Returns the equipment exam record no of this vr issue equipment certificate.
	*
	* @return the equipment exam record no of this vr issue equipment certificate
	*/
	@Override
	public java.lang.String getEquipmentExamRecordNo() {
		return _vrIssueEquipmentCertificate.getEquipmentExamRecordNo();
	}

	/**
	* Returns the equipment name of this vr issue equipment certificate.
	*
	* @return the equipment name of this vr issue equipment certificate
	*/
	@Override
	public java.lang.String getEquipmentName() {
		return _vrIssueEquipmentCertificate.getEquipmentName();
	}

	/**
	* Returns the equipment type of this vr issue equipment certificate.
	*
	* @return the equipment type of this vr issue equipment certificate
	*/
	@Override
	public java.lang.String getEquipmentType() {
		return _vrIssueEquipmentCertificate.getEquipmentType();
	}

	/**
	* Returns the production plant address of this vr issue equipment certificate.
	*
	* @return the production plant address of this vr issue equipment certificate
	*/
	@Override
	public java.lang.String getProductionPlantAddress() {
		return _vrIssueEquipmentCertificate.getProductionPlantAddress();
	}

	/**
	* Returns the production plant name of this vr issue equipment certificate.
	*
	* @return the production plant name of this vr issue equipment certificate
	*/
	@Override
	public java.lang.String getProductionPlantName() {
		return _vrIssueEquipmentCertificate.getProductionPlantName();
	}

	/**
	* Returns the vehicle certificate record no of this vr issue equipment certificate.
	*
	* @return the vehicle certificate record no of this vr issue equipment certificate
	*/
	@Override
	public java.lang.String getVehicleCertificateRecordNo() {
		return _vrIssueEquipmentCertificate.getVehicleCertificateRecordNo();
	}

	@Override
	public java.lang.String toString() {
		return _vrIssueEquipmentCertificate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrIssueEquipmentCertificate.toXmlString();
	}

	/**
	* Returns the equipment certificate record date of this vr issue equipment certificate.
	*
	* @return the equipment certificate record date of this vr issue equipment certificate
	*/
	@Override
	public Date getEquipmentCertificateRecordDate() {
		return _vrIssueEquipmentCertificate.getEquipmentCertificateRecordDate();
	}

	/**
	* Returns the modify date of this vr issue equipment certificate.
	*
	* @return the modify date of this vr issue equipment certificate
	*/
	@Override
	public Date getModifyDate() {
		return _vrIssueEquipmentCertificate.getModifyDate();
	}

	/**
	* Returns the sync date of this vr issue equipment certificate.
	*
	* @return the sync date of this vr issue equipment certificate
	*/
	@Override
	public Date getSyncDate() {
		return _vrIssueEquipmentCertificate.getSyncDate();
	}

	/**
	* Returns the vehicle certificate record date of this vr issue equipment certificate.
	*
	* @return the vehicle certificate record date of this vr issue equipment certificate
	*/
	@Override
	public Date getVehicleCertificateRecordDate() {
		return _vrIssueEquipmentCertificate.getVehicleCertificateRecordDate();
	}

	/**
	* Returns the dossier ID of this vr issue equipment certificate.
	*
	* @return the dossier ID of this vr issue equipment certificate
	*/
	@Override
	public long getDossierId() {
		return _vrIssueEquipmentCertificate.getDossierId();
	}

	/**
	* Returns the ID of this vr issue equipment certificate.
	*
	* @return the ID of this vr issue equipment certificate
	*/
	@Override
	public long getId() {
		return _vrIssueEquipmentCertificate.getId();
	}

	/**
	* Returns the issue ID of this vr issue equipment certificate.
	*
	* @return the issue ID of this vr issue equipment certificate
	*/
	@Override
	public long getIssueId() {
		return _vrIssueEquipmentCertificate.getIssueId();
	}

	/**
	* Returns the issue vehicle certificate ID of this vr issue equipment certificate.
	*
	* @return the issue vehicle certificate ID of this vr issue equipment certificate
	*/
	@Override
	public long getIssueVehicleCertificateId() {
		return _vrIssueEquipmentCertificate.getIssueVehicleCertificateId();
	}

	/**
	* Returns the mt core of this vr issue equipment certificate.
	*
	* @return the mt core of this vr issue equipment certificate
	*/
	@Override
	public long getMtCore() {
		return _vrIssueEquipmentCertificate.getMtCore();
	}

	/**
	* Returns the primary key of this vr issue equipment certificate.
	*
	* @return the primary key of this vr issue equipment certificate
	*/
	@Override
	public long getPrimaryKey() {
		return _vrIssueEquipmentCertificate.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrIssueEquipmentCertificate.persist();
	}

	/**
	* Sets the applicant address of this vr issue equipment certificate.
	*
	* @param applicantAddress the applicant address of this vr issue equipment certificate
	*/
	@Override
	public void setApplicantAddress(java.lang.String applicantAddress) {
		_vrIssueEquipmentCertificate.setApplicantAddress(applicantAddress);
	}

	/**
	* Sets the applicant name of this vr issue equipment certificate.
	*
	* @param applicantName the applicant name of this vr issue equipment certificate
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_vrIssueEquipmentCertificate.setApplicantName(applicantName);
	}

	/**
	* Sets the applicant no of this vr issue equipment certificate.
	*
	* @param applicantNo the applicant no of this vr issue equipment certificate
	*/
	@Override
	public void setApplicantNo(java.lang.String applicantNo) {
		_vrIssueEquipmentCertificate.setApplicantNo(applicantNo);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrIssueEquipmentCertificate.setCachedModel(cachedModel);
	}

	/**
	* Sets the dossier ID of this vr issue equipment certificate.
	*
	* @param dossierId the dossier ID of this vr issue equipment certificate
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrIssueEquipmentCertificate.setDossierId(dossierId);
	}

	/**
	* Sets the equipment certificate record date of this vr issue equipment certificate.
	*
	* @param equipmentCertificateRecordDate the equipment certificate record date of this vr issue equipment certificate
	*/
	@Override
	public void setEquipmentCertificateRecordDate(
		Date equipmentCertificateRecordDate) {
		_vrIssueEquipmentCertificate.setEquipmentCertificateRecordDate(equipmentCertificateRecordDate);
	}

	/**
	* Sets the equipment certificate record ID of this vr issue equipment certificate.
	*
	* @param EquipmentCertificateRecordId the equipment certificate record ID of this vr issue equipment certificate
	*/
	@Override
	public void setEquipmentCertificateRecordId(
		int EquipmentCertificateRecordId) {
		_vrIssueEquipmentCertificate.setEquipmentCertificateRecordId(EquipmentCertificateRecordId);
	}

	/**
	* Sets the equipment certificate record no of this vr issue equipment certificate.
	*
	* @param equipmentCertificateRecordNo the equipment certificate record no of this vr issue equipment certificate
	*/
	@Override
	public void setEquipmentCertificateRecordNo(
		java.lang.String equipmentCertificateRecordNo) {
		_vrIssueEquipmentCertificate.setEquipmentCertificateRecordNo(equipmentCertificateRecordNo);
	}

	/**
	* Sets the equipment certificate type of this vr issue equipment certificate.
	*
	* @param equipmentCertificateType the equipment certificate type of this vr issue equipment certificate
	*/
	@Override
	public void setEquipmentCertificateType(
		java.lang.String equipmentCertificateType) {
		_vrIssueEquipmentCertificate.setEquipmentCertificateType(equipmentCertificateType);
	}

	/**
	* Sets the equipment document no of this vr issue equipment certificate.
	*
	* @param equipmentDocumentNo the equipment document no of this vr issue equipment certificate
	*/
	@Override
	public void setEquipmentDocumentNo(java.lang.String equipmentDocumentNo) {
		_vrIssueEquipmentCertificate.setEquipmentDocumentNo(equipmentDocumentNo);
	}

	/**
	* Sets the equipment exam record no of this vr issue equipment certificate.
	*
	* @param equipmentExamRecordNo the equipment exam record no of this vr issue equipment certificate
	*/
	@Override
	public void setEquipmentExamRecordNo(java.lang.String equipmentExamRecordNo) {
		_vrIssueEquipmentCertificate.setEquipmentExamRecordNo(equipmentExamRecordNo);
	}

	/**
	* Sets the equipment name of this vr issue equipment certificate.
	*
	* @param equipmentName the equipment name of this vr issue equipment certificate
	*/
	@Override
	public void setEquipmentName(java.lang.String equipmentName) {
		_vrIssueEquipmentCertificate.setEquipmentName(equipmentName);
	}

	/**
	* Sets the equipment type of this vr issue equipment certificate.
	*
	* @param equipmentType the equipment type of this vr issue equipment certificate
	*/
	@Override
	public void setEquipmentType(java.lang.String equipmentType) {
		_vrIssueEquipmentCertificate.setEquipmentType(equipmentType);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrIssueEquipmentCertificate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrIssueEquipmentCertificate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrIssueEquipmentCertificate.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr issue equipment certificate.
	*
	* @param id the ID of this vr issue equipment certificate
	*/
	@Override
	public void setId(long id) {
		_vrIssueEquipmentCertificate.setId(id);
	}

	/**
	* Sets the issue ID of this vr issue equipment certificate.
	*
	* @param issueId the issue ID of this vr issue equipment certificate
	*/
	@Override
	public void setIssueId(long issueId) {
		_vrIssueEquipmentCertificate.setIssueId(issueId);
	}

	/**
	* Sets the issue vehicle certificate ID of this vr issue equipment certificate.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID of this vr issue equipment certificate
	*/
	@Override
	public void setIssueVehicleCertificateId(long issueVehicleCertificateId) {
		_vrIssueEquipmentCertificate.setIssueVehicleCertificateId(issueVehicleCertificateId);
	}

	/**
	* Sets the modify date of this vr issue equipment certificate.
	*
	* @param modifyDate the modify date of this vr issue equipment certificate
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrIssueEquipmentCertificate.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr issue equipment certificate.
	*
	* @param mtCore the mt core of this vr issue equipment certificate
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrIssueEquipmentCertificate.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrIssueEquipmentCertificate.setNew(n);
	}

	/**
	* Sets the primary key of this vr issue equipment certificate.
	*
	* @param primaryKey the primary key of this vr issue equipment certificate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrIssueEquipmentCertificate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrIssueEquipmentCertificate.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production plant address of this vr issue equipment certificate.
	*
	* @param productionPlantAddress the production plant address of this vr issue equipment certificate
	*/
	@Override
	public void setProductionPlantAddress(
		java.lang.String productionPlantAddress) {
		_vrIssueEquipmentCertificate.setProductionPlantAddress(productionPlantAddress);
	}

	/**
	* Sets the production plant name of this vr issue equipment certificate.
	*
	* @param productionPlantName the production plant name of this vr issue equipment certificate
	*/
	@Override
	public void setProductionPlantName(java.lang.String productionPlantName) {
		_vrIssueEquipmentCertificate.setProductionPlantName(productionPlantName);
	}

	/**
	* Sets the sync date of this vr issue equipment certificate.
	*
	* @param syncDate the sync date of this vr issue equipment certificate
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrIssueEquipmentCertificate.setSyncDate(syncDate);
	}

	/**
	* Sets the total in use of this vr issue equipment certificate.
	*
	* @param TotalInUse the total in use of this vr issue equipment certificate
	*/
	@Override
	public void setTotalInUse(int TotalInUse) {
		_vrIssueEquipmentCertificate.setTotalInUse(TotalInUse);
	}

	/**
	* Sets the total not used of this vr issue equipment certificate.
	*
	* @param TotalNotUsed the total not used of this vr issue equipment certificate
	*/
	@Override
	public void setTotalNotUsed(int TotalNotUsed) {
		_vrIssueEquipmentCertificate.setTotalNotUsed(TotalNotUsed);
	}

	/**
	* Sets the total product used of this vr issue equipment certificate.
	*
	* @param TotalProductUsed the total product used of this vr issue equipment certificate
	*/
	@Override
	public void setTotalProductUsed(int TotalProductUsed) {
		_vrIssueEquipmentCertificate.setTotalProductUsed(TotalProductUsed);
	}

	/**
	* Sets the total quantity of this vr issue equipment certificate.
	*
	* @param TotalQuantity the total quantity of this vr issue equipment certificate
	*/
	@Override
	public void setTotalQuantity(int TotalQuantity) {
		_vrIssueEquipmentCertificate.setTotalQuantity(TotalQuantity);
	}

	/**
	* Sets the vehicle certificate record date of this vr issue equipment certificate.
	*
	* @param vehicleCertificateRecordDate the vehicle certificate record date of this vr issue equipment certificate
	*/
	@Override
	public void setVehicleCertificateRecordDate(
		Date vehicleCertificateRecordDate) {
		_vrIssueEquipmentCertificate.setVehicleCertificateRecordDate(vehicleCertificateRecordDate);
	}

	/**
	* Sets the vehicle certificate record no of this vr issue equipment certificate.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no of this vr issue equipment certificate
	*/
	@Override
	public void setVehicleCertificateRecordNo(
		java.lang.String vehicleCertificateRecordNo) {
		_vrIssueEquipmentCertificate.setVehicleCertificateRecordNo(vehicleCertificateRecordNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRIssueEquipmentCertificateWrapper)) {
			return false;
		}

		VRIssueEquipmentCertificateWrapper vrIssueEquipmentCertificateWrapper = (VRIssueEquipmentCertificateWrapper)obj;

		if (Objects.equals(_vrIssueEquipmentCertificate,
					vrIssueEquipmentCertificateWrapper._vrIssueEquipmentCertificate)) {
			return true;
		}

		return false;
	}

	@Override
	public VRIssueEquipmentCertificate getWrappedModel() {
		return _vrIssueEquipmentCertificate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrIssueEquipmentCertificate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrIssueEquipmentCertificate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrIssueEquipmentCertificate.resetOriginalValues();
	}

	private final VRIssueEquipmentCertificate _vrIssueEquipmentCertificate;
}