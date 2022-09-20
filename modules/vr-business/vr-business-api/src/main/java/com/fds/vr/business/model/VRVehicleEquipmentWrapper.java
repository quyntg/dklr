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
 * This class is a wrapper for {@link VRVehicleEquipment}.
 * </p>
 *
 * @author LamTV
 * @see VRVehicleEquipment
 * @generated
 */
@ProviderType
public class VRVehicleEquipmentWrapper implements VRVehicleEquipment,
	ModelWrapper<VRVehicleEquipment> {
	public VRVehicleEquipmentWrapper(VRVehicleEquipment vrVehicleEquipment) {
		_vrVehicleEquipment = vrVehicleEquipment;
	}

	@Override
	public Class<?> getModelClass() {
		return VRVehicleEquipment.class;
	}

	@Override
	public String getModelClassName() {
		return VRVehicleEquipment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleTypeCertificateId", getVehicleTypeCertificateId());
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("dossierNo", getDossierNo());
		attributes.put("isMandatory", getIsMandatory());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("certificateRecordNo", getCertificateRecordNo());
		attributes.put("certificateRecordDate", getCertificateRecordDate());
		attributes.put("certificateRecordExpireDate",
			getCertificateRecordExpireDate());
		attributes.put("expiredStatus", getExpiredStatus());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("equipmentCode", getEquipmentCode());
		attributes.put("equipmentName", getEquipmentName());
		attributes.put("certifiedVehicleType", getCertifiedVehicleType());
		attributes.put("certifiedVehicleTypeDescription",
			getCertifiedVehicleTypeDescription());
		attributes.put("certifiedTrademark", getCertifiedTrademark());
		attributes.put("certifiedTrademarkName", getCertifiedTrademarkName());
		attributes.put("certifiedCommercialName", getCertifiedCommercialName());
		attributes.put("certifiedModelCode", getCertifiedModelCode());
		attributes.put("productionCountry", getProductionCountry());
		attributes.put("originalCode", getOriginalCode());
		attributes.put("originalName", getOriginalName());
		attributes.put("productionName", getProductionName());
		attributes.put("productionAddress", getProductionAddress());
		attributes.put("manufacturerName", getManufacturerName());
		attributes.put("manufacturerAddress", getManufacturerAddress());
		attributes.put("safetytestReportNo", getSafetytestReportNo());
		attributes.put("safetytestReportDate", getSafetytestReportDate());
		attributes.put("emissionTestReportNo", getEmissionTestReportNo());
		attributes.put("emissionTestReportDate", getEmissionTestReportDate());
		attributes.put("commonSafetyStandard", getCommonSafetyStandard());
		attributes.put("commonSafetyDescription", getCommonSafetyDescription());
		attributes.put("emissionStandard", getEmissionStandard());
		attributes.put("emissionDescription", getEmissionDescription());
		attributes.put("othertestReportNo", getOthertestReportNo());
		attributes.put("othertestReportDate", getOthertestReportDate());
		attributes.put("copReportNo", getCopReportNo());
		attributes.put("copReportDate", getCopReportDate());
		attributes.put("copReportExpireDate", getCopReportExpireDate());
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

		Long vehicleTypeCertificateId = (Long)attributes.get(
				"vehicleTypeCertificateId");

		if (vehicleTypeCertificateId != null) {
			setVehicleTypeCertificateId(vehicleTypeCertificateId);
		}

		Long certificateRecordId = (Long)attributes.get("certificateRecordId");

		if (certificateRecordId != null) {
			setCertificateRecordId(certificateRecordId);
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

		Integer isMandatory = (Integer)attributes.get("isMandatory");

		if (isMandatory != null) {
			setIsMandatory(isMandatory);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String certificateRecordNo = (String)attributes.get(
				"certificateRecordNo");

		if (certificateRecordNo != null) {
			setCertificateRecordNo(certificateRecordNo);
		}

		Date certificateRecordDate = (Date)attributes.get(
				"certificateRecordDate");

		if (certificateRecordDate != null) {
			setCertificateRecordDate(certificateRecordDate);
		}

		Date certificateRecordExpireDate = (Date)attributes.get(
				"certificateRecordExpireDate");

		if (certificateRecordExpireDate != null) {
			setCertificateRecordExpireDate(certificateRecordExpireDate);
		}

		Integer expiredStatus = (Integer)attributes.get("expiredStatus");

		if (expiredStatus != null) {
			setExpiredStatus(expiredStatus);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		String equipmentCode = (String)attributes.get("equipmentCode");

		if (equipmentCode != null) {
			setEquipmentCode(equipmentCode);
		}

		String equipmentName = (String)attributes.get("equipmentName");

		if (equipmentName != null) {
			setEquipmentName(equipmentName);
		}

		String certifiedVehicleType = (String)attributes.get(
				"certifiedVehicleType");

		if (certifiedVehicleType != null) {
			setCertifiedVehicleType(certifiedVehicleType);
		}

		String certifiedVehicleTypeDescription = (String)attributes.get(
				"certifiedVehicleTypeDescription");

		if (certifiedVehicleTypeDescription != null) {
			setCertifiedVehicleTypeDescription(certifiedVehicleTypeDescription);
		}

		String certifiedTrademark = (String)attributes.get("certifiedTrademark");

		if (certifiedTrademark != null) {
			setCertifiedTrademark(certifiedTrademark);
		}

		String certifiedTrademarkName = (String)attributes.get(
				"certifiedTrademarkName");

		if (certifiedTrademarkName != null) {
			setCertifiedTrademarkName(certifiedTrademarkName);
		}

		String certifiedCommercialName = (String)attributes.get(
				"certifiedCommercialName");

		if (certifiedCommercialName != null) {
			setCertifiedCommercialName(certifiedCommercialName);
		}

		String certifiedModelCode = (String)attributes.get("certifiedModelCode");

		if (certifiedModelCode != null) {
			setCertifiedModelCode(certifiedModelCode);
		}

		String productionCountry = (String)attributes.get("productionCountry");

		if (productionCountry != null) {
			setProductionCountry(productionCountry);
		}

		String originalCode = (String)attributes.get("originalCode");

		if (originalCode != null) {
			setOriginalCode(originalCode);
		}

		String originalName = (String)attributes.get("originalName");

		if (originalName != null) {
			setOriginalName(originalName);
		}

		String productionName = (String)attributes.get("productionName");

		if (productionName != null) {
			setProductionName(productionName);
		}

		String productionAddress = (String)attributes.get("productionAddress");

		if (productionAddress != null) {
			setProductionAddress(productionAddress);
		}

		String manufacturerName = (String)attributes.get("manufacturerName");

		if (manufacturerName != null) {
			setManufacturerName(manufacturerName);
		}

		String manufacturerAddress = (String)attributes.get(
				"manufacturerAddress");

		if (manufacturerAddress != null) {
			setManufacturerAddress(manufacturerAddress);
		}

		String safetytestReportNo = (String)attributes.get("safetytestReportNo");

		if (safetytestReportNo != null) {
			setSafetytestReportNo(safetytestReportNo);
		}

		Date safetytestReportDate = (Date)attributes.get("safetytestReportDate");

		if (safetytestReportDate != null) {
			setSafetytestReportDate(safetytestReportDate);
		}

		String emissionTestReportNo = (String)attributes.get(
				"emissionTestReportNo");

		if (emissionTestReportNo != null) {
			setEmissionTestReportNo(emissionTestReportNo);
		}

		Date emissionTestReportDate = (Date)attributes.get(
				"emissionTestReportDate");

		if (emissionTestReportDate != null) {
			setEmissionTestReportDate(emissionTestReportDate);
		}

		String commonSafetyStandard = (String)attributes.get(
				"commonSafetyStandard");

		if (commonSafetyStandard != null) {
			setCommonSafetyStandard(commonSafetyStandard);
		}

		String commonSafetyDescription = (String)attributes.get(
				"commonSafetyDescription");

		if (commonSafetyDescription != null) {
			setCommonSafetyDescription(commonSafetyDescription);
		}

		String emissionStandard = (String)attributes.get("emissionStandard");

		if (emissionStandard != null) {
			setEmissionStandard(emissionStandard);
		}

		String emissionDescription = (String)attributes.get(
				"emissionDescription");

		if (emissionDescription != null) {
			setEmissionDescription(emissionDescription);
		}

		String othertestReportNo = (String)attributes.get("othertestReportNo");

		if (othertestReportNo != null) {
			setOthertestReportNo(othertestReportNo);
		}

		Date othertestReportDate = (Date)attributes.get("othertestReportDate");

		if (othertestReportDate != null) {
			setOthertestReportDate(othertestReportDate);
		}

		String copReportNo = (String)attributes.get("copReportNo");

		if (copReportNo != null) {
			setCopReportNo(copReportNo);
		}

		Date copReportDate = (Date)attributes.get("copReportDate");

		if (copReportDate != null) {
			setCopReportDate(copReportDate);
		}

		Date copReportExpireDate = (Date)attributes.get("copReportExpireDate");

		if (copReportExpireDate != null) {
			setCopReportExpireDate(copReportExpireDate);
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
	public VRVehicleEquipment toEscapedModel() {
		return new VRVehicleEquipmentWrapper(_vrVehicleEquipment.toEscapedModel());
	}

	@Override
	public VRVehicleEquipment toUnescapedModel() {
		return new VRVehicleEquipmentWrapper(_vrVehicleEquipment.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrVehicleEquipment.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrVehicleEquipment.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrVehicleEquipment.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrVehicleEquipment.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRVehicleEquipment> toCacheModel() {
		return _vrVehicleEquipment.toCacheModel();
	}

	@Override
	public int compareTo(VRVehicleEquipment vrVehicleEquipment) {
		return _vrVehicleEquipment.compareTo(vrVehicleEquipment);
	}

	/**
	* Returns the expired status of this vr vehicle equipment.
	*
	* @return the expired status of this vr vehicle equipment
	*/
	@Override
	public int getExpiredStatus() {
		return _vrVehicleEquipment.getExpiredStatus();
	}

	/**
	* Returns the is mandatory of this vr vehicle equipment.
	*
	* @return the is mandatory of this vr vehicle equipment
	*/
	@Override
	public int getIsMandatory() {
		return _vrVehicleEquipment.getIsMandatory();
	}

	@Override
	public int hashCode() {
		return _vrVehicleEquipment.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrVehicleEquipment.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRVehicleEquipmentWrapper((VRVehicleEquipment)_vrVehicleEquipment.clone());
	}

	/**
	* Returns the certificate record no of this vr vehicle equipment.
	*
	* @return the certificate record no of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getCertificateRecordNo() {
		return _vrVehicleEquipment.getCertificateRecordNo();
	}

	/**
	* Returns the certified commercial name of this vr vehicle equipment.
	*
	* @return the certified commercial name of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getCertifiedCommercialName() {
		return _vrVehicleEquipment.getCertifiedCommercialName();
	}

	/**
	* Returns the certified model code of this vr vehicle equipment.
	*
	* @return the certified model code of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getCertifiedModelCode() {
		return _vrVehicleEquipment.getCertifiedModelCode();
	}

	/**
	* Returns the certified trademark of this vr vehicle equipment.
	*
	* @return the certified trademark of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getCertifiedTrademark() {
		return _vrVehicleEquipment.getCertifiedTrademark();
	}

	/**
	* Returns the certified trademark name of this vr vehicle equipment.
	*
	* @return the certified trademark name of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getCertifiedTrademarkName() {
		return _vrVehicleEquipment.getCertifiedTrademarkName();
	}

	/**
	* Returns the certified vehicle type of this vr vehicle equipment.
	*
	* @return the certified vehicle type of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getCertifiedVehicleType() {
		return _vrVehicleEquipment.getCertifiedVehicleType();
	}

	/**
	* Returns the certified vehicle type description of this vr vehicle equipment.
	*
	* @return the certified vehicle type description of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getCertifiedVehicleTypeDescription() {
		return _vrVehicleEquipment.getCertifiedVehicleTypeDescription();
	}

	/**
	* Returns the common safety description of this vr vehicle equipment.
	*
	* @return the common safety description of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getCommonSafetyDescription() {
		return _vrVehicleEquipment.getCommonSafetyDescription();
	}

	/**
	* Returns the common safety standard of this vr vehicle equipment.
	*
	* @return the common safety standard of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getCommonSafetyStandard() {
		return _vrVehicleEquipment.getCommonSafetyStandard();
	}

	/**
	* Returns the cop report no of this vr vehicle equipment.
	*
	* @return the cop report no of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getCopReportNo() {
		return _vrVehicleEquipment.getCopReportNo();
	}

	/**
	* Returns the dossier ID ctn of this vr vehicle equipment.
	*
	* @return the dossier ID ctn of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrVehicleEquipment.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr vehicle equipment.
	*
	* @return the dossier no of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrVehicleEquipment.getDossierNo();
	}

	/**
	* Returns the emission description of this vr vehicle equipment.
	*
	* @return the emission description of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getEmissionDescription() {
		return _vrVehicleEquipment.getEmissionDescription();
	}

	/**
	* Returns the emission standard of this vr vehicle equipment.
	*
	* @return the emission standard of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getEmissionStandard() {
		return _vrVehicleEquipment.getEmissionStandard();
	}

	/**
	* Returns the emission test report no of this vr vehicle equipment.
	*
	* @return the emission test report no of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getEmissionTestReportNo() {
		return _vrVehicleEquipment.getEmissionTestReportNo();
	}

	/**
	* Returns the equipment code of this vr vehicle equipment.
	*
	* @return the equipment code of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getEquipmentCode() {
		return _vrVehicleEquipment.getEquipmentCode();
	}

	/**
	* Returns the equipment name of this vr vehicle equipment.
	*
	* @return the equipment name of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getEquipmentName() {
		return _vrVehicleEquipment.getEquipmentName();
	}

	/**
	* Returns the manufacturer address of this vr vehicle equipment.
	*
	* @return the manufacturer address of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getManufacturerAddress() {
		return _vrVehicleEquipment.getManufacturerAddress();
	}

	/**
	* Returns the manufacturer name of this vr vehicle equipment.
	*
	* @return the manufacturer name of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getManufacturerName() {
		return _vrVehicleEquipment.getManufacturerName();
	}

	/**
	* Returns the original code of this vr vehicle equipment.
	*
	* @return the original code of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getOriginalCode() {
		return _vrVehicleEquipment.getOriginalCode();
	}

	/**
	* Returns the original name of this vr vehicle equipment.
	*
	* @return the original name of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getOriginalName() {
		return _vrVehicleEquipment.getOriginalName();
	}

	/**
	* Returns the othertest report no of this vr vehicle equipment.
	*
	* @return the othertest report no of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getOthertestReportNo() {
		return _vrVehicleEquipment.getOthertestReportNo();
	}

	/**
	* Returns the production address of this vr vehicle equipment.
	*
	* @return the production address of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getProductionAddress() {
		return _vrVehicleEquipment.getProductionAddress();
	}

	/**
	* Returns the production country of this vr vehicle equipment.
	*
	* @return the production country of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getProductionCountry() {
		return _vrVehicleEquipment.getProductionCountry();
	}

	/**
	* Returns the production name of this vr vehicle equipment.
	*
	* @return the production name of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getProductionName() {
		return _vrVehicleEquipment.getProductionName();
	}

	/**
	* Returns the safetytest report no of this vr vehicle equipment.
	*
	* @return the safetytest report no of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getSafetytestReportNo() {
		return _vrVehicleEquipment.getSafetytestReportNo();
	}

	/**
	* Returns the vehicle class of this vr vehicle equipment.
	*
	* @return the vehicle class of this vr vehicle equipment
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrVehicleEquipment.getVehicleClass();
	}

	@Override
	public java.lang.String toString() {
		return _vrVehicleEquipment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrVehicleEquipment.toXmlString();
	}

	/**
	* Returns the certificate record date of this vr vehicle equipment.
	*
	* @return the certificate record date of this vr vehicle equipment
	*/
	@Override
	public Date getCertificateRecordDate() {
		return _vrVehicleEquipment.getCertificateRecordDate();
	}

	/**
	* Returns the certificate record expire date of this vr vehicle equipment.
	*
	* @return the certificate record expire date of this vr vehicle equipment
	*/
	@Override
	public Date getCertificateRecordExpireDate() {
		return _vrVehicleEquipment.getCertificateRecordExpireDate();
	}

	/**
	* Returns the cop report date of this vr vehicle equipment.
	*
	* @return the cop report date of this vr vehicle equipment
	*/
	@Override
	public Date getCopReportDate() {
		return _vrVehicleEquipment.getCopReportDate();
	}

	/**
	* Returns the cop report expire date of this vr vehicle equipment.
	*
	* @return the cop report expire date of this vr vehicle equipment
	*/
	@Override
	public Date getCopReportExpireDate() {
		return _vrVehicleEquipment.getCopReportExpireDate();
	}

	/**
	* Returns the emission test report date of this vr vehicle equipment.
	*
	* @return the emission test report date of this vr vehicle equipment
	*/
	@Override
	public Date getEmissionTestReportDate() {
		return _vrVehicleEquipment.getEmissionTestReportDate();
	}

	/**
	* Returns the modify date of this vr vehicle equipment.
	*
	* @return the modify date of this vr vehicle equipment
	*/
	@Override
	public Date getModifyDate() {
		return _vrVehicleEquipment.getModifyDate();
	}

	/**
	* Returns the othertest report date of this vr vehicle equipment.
	*
	* @return the othertest report date of this vr vehicle equipment
	*/
	@Override
	public Date getOthertestReportDate() {
		return _vrVehicleEquipment.getOthertestReportDate();
	}

	/**
	* Returns the safetytest report date of this vr vehicle equipment.
	*
	* @return the safetytest report date of this vr vehicle equipment
	*/
	@Override
	public Date getSafetytestReportDate() {
		return _vrVehicleEquipment.getSafetytestReportDate();
	}

	/**
	* Returns the sync date of this vr vehicle equipment.
	*
	* @return the sync date of this vr vehicle equipment
	*/
	@Override
	public Date getSyncDate() {
		return _vrVehicleEquipment.getSyncDate();
	}

	/**
	* Returns the certificate record ID of this vr vehicle equipment.
	*
	* @return the certificate record ID of this vr vehicle equipment
	*/
	@Override
	public long getCertificateRecordId() {
		return _vrVehicleEquipment.getCertificateRecordId();
	}

	/**
	* Returns the dossier ID of this vr vehicle equipment.
	*
	* @return the dossier ID of this vr vehicle equipment
	*/
	@Override
	public long getDossierId() {
		return _vrVehicleEquipment.getDossierId();
	}

	/**
	* Returns the ID of this vr vehicle equipment.
	*
	* @return the ID of this vr vehicle equipment
	*/
	@Override
	public long getId() {
		return _vrVehicleEquipment.getId();
	}

	/**
	* Returns the primary key of this vr vehicle equipment.
	*
	* @return the primary key of this vr vehicle equipment
	*/
	@Override
	public long getPrimaryKey() {
		return _vrVehicleEquipment.getPrimaryKey();
	}

	/**
	* Returns the sequence no of this vr vehicle equipment.
	*
	* @return the sequence no of this vr vehicle equipment
	*/
	@Override
	public long getSequenceNo() {
		return _vrVehicleEquipment.getSequenceNo();
	}

	/**
	* Returns the vehicle type certificate ID of this vr vehicle equipment.
	*
	* @return the vehicle type certificate ID of this vr vehicle equipment
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrVehicleEquipment.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrVehicleEquipment.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrVehicleEquipment.setCachedModel(cachedModel);
	}

	/**
	* Sets the certificate record date of this vr vehicle equipment.
	*
	* @param certificateRecordDate the certificate record date of this vr vehicle equipment
	*/
	@Override
	public void setCertificateRecordDate(Date certificateRecordDate) {
		_vrVehicleEquipment.setCertificateRecordDate(certificateRecordDate);
	}

	/**
	* Sets the certificate record expire date of this vr vehicle equipment.
	*
	* @param certificateRecordExpireDate the certificate record expire date of this vr vehicle equipment
	*/
	@Override
	public void setCertificateRecordExpireDate(Date certificateRecordExpireDate) {
		_vrVehicleEquipment.setCertificateRecordExpireDate(certificateRecordExpireDate);
	}

	/**
	* Sets the certificate record ID of this vr vehicle equipment.
	*
	* @param certificateRecordId the certificate record ID of this vr vehicle equipment
	*/
	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_vrVehicleEquipment.setCertificateRecordId(certificateRecordId);
	}

	/**
	* Sets the certificate record no of this vr vehicle equipment.
	*
	* @param certificateRecordNo the certificate record no of this vr vehicle equipment
	*/
	@Override
	public void setCertificateRecordNo(java.lang.String certificateRecordNo) {
		_vrVehicleEquipment.setCertificateRecordNo(certificateRecordNo);
	}

	/**
	* Sets the certified commercial name of this vr vehicle equipment.
	*
	* @param certifiedCommercialName the certified commercial name of this vr vehicle equipment
	*/
	@Override
	public void setCertifiedCommercialName(
		java.lang.String certifiedCommercialName) {
		_vrVehicleEquipment.setCertifiedCommercialName(certifiedCommercialName);
	}

	/**
	* Sets the certified model code of this vr vehicle equipment.
	*
	* @param certifiedModelCode the certified model code of this vr vehicle equipment
	*/
	@Override
	public void setCertifiedModelCode(java.lang.String certifiedModelCode) {
		_vrVehicleEquipment.setCertifiedModelCode(certifiedModelCode);
	}

	/**
	* Sets the certified trademark of this vr vehicle equipment.
	*
	* @param certifiedTrademark the certified trademark of this vr vehicle equipment
	*/
	@Override
	public void setCertifiedTrademark(java.lang.String certifiedTrademark) {
		_vrVehicleEquipment.setCertifiedTrademark(certifiedTrademark);
	}

	/**
	* Sets the certified trademark name of this vr vehicle equipment.
	*
	* @param certifiedTrademarkName the certified trademark name of this vr vehicle equipment
	*/
	@Override
	public void setCertifiedTrademarkName(
		java.lang.String certifiedTrademarkName) {
		_vrVehicleEquipment.setCertifiedTrademarkName(certifiedTrademarkName);
	}

	/**
	* Sets the certified vehicle type of this vr vehicle equipment.
	*
	* @param certifiedVehicleType the certified vehicle type of this vr vehicle equipment
	*/
	@Override
	public void setCertifiedVehicleType(java.lang.String certifiedVehicleType) {
		_vrVehicleEquipment.setCertifiedVehicleType(certifiedVehicleType);
	}

	/**
	* Sets the certified vehicle type description of this vr vehicle equipment.
	*
	* @param certifiedVehicleTypeDescription the certified vehicle type description of this vr vehicle equipment
	*/
	@Override
	public void setCertifiedVehicleTypeDescription(
		java.lang.String certifiedVehicleTypeDescription) {
		_vrVehicleEquipment.setCertifiedVehicleTypeDescription(certifiedVehicleTypeDescription);
	}

	/**
	* Sets the common safety description of this vr vehicle equipment.
	*
	* @param commonSafetyDescription the common safety description of this vr vehicle equipment
	*/
	@Override
	public void setCommonSafetyDescription(
		java.lang.String commonSafetyDescription) {
		_vrVehicleEquipment.setCommonSafetyDescription(commonSafetyDescription);
	}

	/**
	* Sets the common safety standard of this vr vehicle equipment.
	*
	* @param commonSafetyStandard the common safety standard of this vr vehicle equipment
	*/
	@Override
	public void setCommonSafetyStandard(java.lang.String commonSafetyStandard) {
		_vrVehicleEquipment.setCommonSafetyStandard(commonSafetyStandard);
	}

	/**
	* Sets the cop report date of this vr vehicle equipment.
	*
	* @param copReportDate the cop report date of this vr vehicle equipment
	*/
	@Override
	public void setCopReportDate(Date copReportDate) {
		_vrVehicleEquipment.setCopReportDate(copReportDate);
	}

	/**
	* Sets the cop report expire date of this vr vehicle equipment.
	*
	* @param copReportExpireDate the cop report expire date of this vr vehicle equipment
	*/
	@Override
	public void setCopReportExpireDate(Date copReportExpireDate) {
		_vrVehicleEquipment.setCopReportExpireDate(copReportExpireDate);
	}

	/**
	* Sets the cop report no of this vr vehicle equipment.
	*
	* @param copReportNo the cop report no of this vr vehicle equipment
	*/
	@Override
	public void setCopReportNo(java.lang.String copReportNo) {
		_vrVehicleEquipment.setCopReportNo(copReportNo);
	}

	/**
	* Sets the dossier ID of this vr vehicle equipment.
	*
	* @param dossierId the dossier ID of this vr vehicle equipment
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrVehicleEquipment.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr vehicle equipment.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr vehicle equipment
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrVehicleEquipment.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr vehicle equipment.
	*
	* @param dossierNo the dossier no of this vr vehicle equipment
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrVehicleEquipment.setDossierNo(dossierNo);
	}

	/**
	* Sets the emission description of this vr vehicle equipment.
	*
	* @param emissionDescription the emission description of this vr vehicle equipment
	*/
	@Override
	public void setEmissionDescription(java.lang.String emissionDescription) {
		_vrVehicleEquipment.setEmissionDescription(emissionDescription);
	}

	/**
	* Sets the emission standard of this vr vehicle equipment.
	*
	* @param emissionStandard the emission standard of this vr vehicle equipment
	*/
	@Override
	public void setEmissionStandard(java.lang.String emissionStandard) {
		_vrVehicleEquipment.setEmissionStandard(emissionStandard);
	}

	/**
	* Sets the emission test report date of this vr vehicle equipment.
	*
	* @param emissionTestReportDate the emission test report date of this vr vehicle equipment
	*/
	@Override
	public void setEmissionTestReportDate(Date emissionTestReportDate) {
		_vrVehicleEquipment.setEmissionTestReportDate(emissionTestReportDate);
	}

	/**
	* Sets the emission test report no of this vr vehicle equipment.
	*
	* @param emissionTestReportNo the emission test report no of this vr vehicle equipment
	*/
	@Override
	public void setEmissionTestReportNo(java.lang.String emissionTestReportNo) {
		_vrVehicleEquipment.setEmissionTestReportNo(emissionTestReportNo);
	}

	/**
	* Sets the equipment code of this vr vehicle equipment.
	*
	* @param equipmentCode the equipment code of this vr vehicle equipment
	*/
	@Override
	public void setEquipmentCode(java.lang.String equipmentCode) {
		_vrVehicleEquipment.setEquipmentCode(equipmentCode);
	}

	/**
	* Sets the equipment name of this vr vehicle equipment.
	*
	* @param equipmentName the equipment name of this vr vehicle equipment
	*/
	@Override
	public void setEquipmentName(java.lang.String equipmentName) {
		_vrVehicleEquipment.setEquipmentName(equipmentName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrVehicleEquipment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrVehicleEquipment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrVehicleEquipment.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expired status of this vr vehicle equipment.
	*
	* @param expiredStatus the expired status of this vr vehicle equipment
	*/
	@Override
	public void setExpiredStatus(int expiredStatus) {
		_vrVehicleEquipment.setExpiredStatus(expiredStatus);
	}

	/**
	* Sets the ID of this vr vehicle equipment.
	*
	* @param id the ID of this vr vehicle equipment
	*/
	@Override
	public void setId(long id) {
		_vrVehicleEquipment.setId(id);
	}

	/**
	* Sets the is mandatory of this vr vehicle equipment.
	*
	* @param isMandatory the is mandatory of this vr vehicle equipment
	*/
	@Override
	public void setIsMandatory(int isMandatory) {
		_vrVehicleEquipment.setIsMandatory(isMandatory);
	}

	/**
	* Sets the manufacturer address of this vr vehicle equipment.
	*
	* @param manufacturerAddress the manufacturer address of this vr vehicle equipment
	*/
	@Override
	public void setManufacturerAddress(java.lang.String manufacturerAddress) {
		_vrVehicleEquipment.setManufacturerAddress(manufacturerAddress);
	}

	/**
	* Sets the manufacturer name of this vr vehicle equipment.
	*
	* @param manufacturerName the manufacturer name of this vr vehicle equipment
	*/
	@Override
	public void setManufacturerName(java.lang.String manufacturerName) {
		_vrVehicleEquipment.setManufacturerName(manufacturerName);
	}

	/**
	* Sets the modify date of this vr vehicle equipment.
	*
	* @param modifyDate the modify date of this vr vehicle equipment
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrVehicleEquipment.setModifyDate(modifyDate);
	}

	@Override
	public void setNew(boolean n) {
		_vrVehicleEquipment.setNew(n);
	}

	/**
	* Sets the original code of this vr vehicle equipment.
	*
	* @param originalCode the original code of this vr vehicle equipment
	*/
	@Override
	public void setOriginalCode(java.lang.String originalCode) {
		_vrVehicleEquipment.setOriginalCode(originalCode);
	}

	/**
	* Sets the original name of this vr vehicle equipment.
	*
	* @param originalName the original name of this vr vehicle equipment
	*/
	@Override
	public void setOriginalName(java.lang.String originalName) {
		_vrVehicleEquipment.setOriginalName(originalName);
	}

	/**
	* Sets the othertest report date of this vr vehicle equipment.
	*
	* @param othertestReportDate the othertest report date of this vr vehicle equipment
	*/
	@Override
	public void setOthertestReportDate(Date othertestReportDate) {
		_vrVehicleEquipment.setOthertestReportDate(othertestReportDate);
	}

	/**
	* Sets the othertest report no of this vr vehicle equipment.
	*
	* @param othertestReportNo the othertest report no of this vr vehicle equipment
	*/
	@Override
	public void setOthertestReportNo(java.lang.String othertestReportNo) {
		_vrVehicleEquipment.setOthertestReportNo(othertestReportNo);
	}

	/**
	* Sets the primary key of this vr vehicle equipment.
	*
	* @param primaryKey the primary key of this vr vehicle equipment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrVehicleEquipment.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrVehicleEquipment.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production address of this vr vehicle equipment.
	*
	* @param productionAddress the production address of this vr vehicle equipment
	*/
	@Override
	public void setProductionAddress(java.lang.String productionAddress) {
		_vrVehicleEquipment.setProductionAddress(productionAddress);
	}

	/**
	* Sets the production country of this vr vehicle equipment.
	*
	* @param productionCountry the production country of this vr vehicle equipment
	*/
	@Override
	public void setProductionCountry(java.lang.String productionCountry) {
		_vrVehicleEquipment.setProductionCountry(productionCountry);
	}

	/**
	* Sets the production name of this vr vehicle equipment.
	*
	* @param productionName the production name of this vr vehicle equipment
	*/
	@Override
	public void setProductionName(java.lang.String productionName) {
		_vrVehicleEquipment.setProductionName(productionName);
	}

	/**
	* Sets the safetytest report date of this vr vehicle equipment.
	*
	* @param safetytestReportDate the safetytest report date of this vr vehicle equipment
	*/
	@Override
	public void setSafetytestReportDate(Date safetytestReportDate) {
		_vrVehicleEquipment.setSafetytestReportDate(safetytestReportDate);
	}

	/**
	* Sets the safetytest report no of this vr vehicle equipment.
	*
	* @param safetytestReportNo the safetytest report no of this vr vehicle equipment
	*/
	@Override
	public void setSafetytestReportNo(java.lang.String safetytestReportNo) {
		_vrVehicleEquipment.setSafetytestReportNo(safetytestReportNo);
	}

	/**
	* Sets the sequence no of this vr vehicle equipment.
	*
	* @param sequenceNo the sequence no of this vr vehicle equipment
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrVehicleEquipment.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the sync date of this vr vehicle equipment.
	*
	* @param syncDate the sync date of this vr vehicle equipment
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrVehicleEquipment.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle class of this vr vehicle equipment.
	*
	* @param vehicleClass the vehicle class of this vr vehicle equipment
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrVehicleEquipment.setVehicleClass(vehicleClass);
	}

	/**
	* Sets the vehicle type certificate ID of this vr vehicle equipment.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr vehicle equipment
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrVehicleEquipment.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRVehicleEquipmentWrapper)) {
			return false;
		}

		VRVehicleEquipmentWrapper vrVehicleEquipmentWrapper = (VRVehicleEquipmentWrapper)obj;

		if (Objects.equals(_vrVehicleEquipment,
					vrVehicleEquipmentWrapper._vrVehicleEquipment)) {
			return true;
		}

		return false;
	}

	@Override
	public VRVehicleEquipment getWrappedModel() {
		return _vrVehicleEquipment;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrVehicleEquipment.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrVehicleEquipment.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrVehicleEquipment.resetOriginalValues();
	}

	private final VRVehicleEquipment _vrVehicleEquipment;
}