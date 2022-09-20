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
 * This class is a wrapper for {@link VRExpireCertificate}.
 * </p>
 *
 * @author LamTV
 * @see VRExpireCertificate
 * @generated
 */
@ProviderType
public class VRExpireCertificateWrapper implements VRExpireCertificate,
	ModelWrapper<VRExpireCertificate> {
	public VRExpireCertificateWrapper(VRExpireCertificate vrExpireCertificate) {
		_vrExpireCertificate = vrExpireCertificate;
	}

	@Override
	public Class<?> getModelClass() {
		return VRExpireCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return VRExpireCertificate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("convertAssembleId", getConvertAssembleId());
		attributes.put("validDossierId", getValidDossierId());
		attributes.put("validDossierIdCTN", getValidDossierIdCTN());
		attributes.put("validDossierNo", getValidDossierNo());
		attributes.put("vehicleTypeCertificateId", getVehicleTypeCertificateId());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("dossierNo", getDossierNo());
		attributes.put("dossierStatus", getDossierStatus());
		attributes.put("previousExpireDate", getPreviousExpireDate());
		attributes.put("certificateRecordNo", getCertificateRecordNo());
		attributes.put("certificateRecordDate", getCertificateRecordDate());
		attributes.put("certificateRecordExpireDate",
			getCertificateRecordExpireDate());
		attributes.put("expiredStatus", getExpiredStatus());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("certifiedVehicleType", getCertifiedVehicleType());
		attributes.put("certifiedVehicleTypeDescription",
			getCertifiedVehicleTypeDescription());
		attributes.put("certifiedTrademark", getCertifiedTrademark());
		attributes.put("certifiedTrademarkName", getCertifiedTrademarkName());
		attributes.put("certifiedCommercialName", getCertifiedCommercialName());
		attributes.put("certifiedModelCode", getCertifiedModelCode());
		attributes.put("productionCountry", getProductionCountry());
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
		attributes.put("validRequestNo", getValidRequestNo());
		attributes.put("validRequestDate", getValidRequestDate());
		attributes.put("validInspectionRecordNo", getValidInspectionRecordNo());
		attributes.put("validInspectionRecordDate",
			getValidInspectionRecordDate());
		attributes.put("validCorporationId", getValidCorporationId());
		attributes.put("validInspectorId", getValidInspectorId());
		attributes.put("validInspectorName", getValidInspectorName());
		attributes.put("validRemarks", getValidRemarks());
		attributes.put("validInspectionNote", getValidInspectionNote());
		attributes.put("deliverableFileEntryId", getDeliverableFileEntryId());
		attributes.put("documentFileEntryId", getDocumentFileEntryId());
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

		Long convertAssembleId = (Long)attributes.get("convertAssembleId");

		if (convertAssembleId != null) {
			setConvertAssembleId(convertAssembleId);
		}

		Long validDossierId = (Long)attributes.get("validDossierId");

		if (validDossierId != null) {
			setValidDossierId(validDossierId);
		}

		String validDossierIdCTN = (String)attributes.get("validDossierIdCTN");

		if (validDossierIdCTN != null) {
			setValidDossierIdCTN(validDossierIdCTN);
		}

		String validDossierNo = (String)attributes.get("validDossierNo");

		if (validDossierNo != null) {
			setValidDossierNo(validDossierNo);
		}

		Long vehicleTypeCertificateId = (Long)attributes.get(
				"vehicleTypeCertificateId");

		if (vehicleTypeCertificateId != null) {
			setVehicleTypeCertificateId(vehicleTypeCertificateId);
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

		String dossierStatus = (String)attributes.get("dossierStatus");

		if (dossierStatus != null) {
			setDossierStatus(dossierStatus);
		}

		Date previousExpireDate = (Date)attributes.get("previousExpireDate");

		if (previousExpireDate != null) {
			setPreviousExpireDate(previousExpireDate);
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

		String validRequestNo = (String)attributes.get("validRequestNo");

		if (validRequestNo != null) {
			setValidRequestNo(validRequestNo);
		}

		Date validRequestDate = (Date)attributes.get("validRequestDate");

		if (validRequestDate != null) {
			setValidRequestDate(validRequestDate);
		}

		String validInspectionRecordNo = (String)attributes.get(
				"validInspectionRecordNo");

		if (validInspectionRecordNo != null) {
			setValidInspectionRecordNo(validInspectionRecordNo);
		}

		Date validInspectionRecordDate = (Date)attributes.get(
				"validInspectionRecordDate");

		if (validInspectionRecordDate != null) {
			setValidInspectionRecordDate(validInspectionRecordDate);
		}

		Long validCorporationId = (Long)attributes.get("validCorporationId");

		if (validCorporationId != null) {
			setValidCorporationId(validCorporationId);
		}

		Long validInspectorId = (Long)attributes.get("validInspectorId");

		if (validInspectorId != null) {
			setValidInspectorId(validInspectorId);
		}

		String validInspectorName = (String)attributes.get("validInspectorName");

		if (validInspectorName != null) {
			setValidInspectorName(validInspectorName);
		}

		String validRemarks = (String)attributes.get("validRemarks");

		if (validRemarks != null) {
			setValidRemarks(validRemarks);
		}

		String validInspectionNote = (String)attributes.get(
				"validInspectionNote");

		if (validInspectionNote != null) {
			setValidInspectionNote(validInspectionNote);
		}

		Long deliverableFileEntryId = (Long)attributes.get(
				"deliverableFileEntryId");

		if (deliverableFileEntryId != null) {
			setDeliverableFileEntryId(deliverableFileEntryId);
		}

		Long documentFileEntryId = (Long)attributes.get("documentFileEntryId");

		if (documentFileEntryId != null) {
			setDocumentFileEntryId(documentFileEntryId);
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
	public VRExpireCertificate toEscapedModel() {
		return new VRExpireCertificateWrapper(_vrExpireCertificate.toEscapedModel());
	}

	@Override
	public VRExpireCertificate toUnescapedModel() {
		return new VRExpireCertificateWrapper(_vrExpireCertificate.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrExpireCertificate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrExpireCertificate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrExpireCertificate.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrExpireCertificate.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRExpireCertificate> toCacheModel() {
		return _vrExpireCertificate.toCacheModel();
	}

	@Override
	public int compareTo(VRExpireCertificate vrExpireCertificate) {
		return _vrExpireCertificate.compareTo(vrExpireCertificate);
	}

	/**
	* Returns the expired status of this vr expire certificate.
	*
	* @return the expired status of this vr expire certificate
	*/
	@Override
	public int getExpiredStatus() {
		return _vrExpireCertificate.getExpiredStatus();
	}

	@Override
	public int hashCode() {
		return _vrExpireCertificate.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrExpireCertificate.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRExpireCertificateWrapper((VRExpireCertificate)_vrExpireCertificate.clone());
	}

	/**
	* Returns the certificate record no of this vr expire certificate.
	*
	* @return the certificate record no of this vr expire certificate
	*/
	@Override
	public java.lang.String getCertificateRecordNo() {
		return _vrExpireCertificate.getCertificateRecordNo();
	}

	/**
	* Returns the certified commercial name of this vr expire certificate.
	*
	* @return the certified commercial name of this vr expire certificate
	*/
	@Override
	public java.lang.String getCertifiedCommercialName() {
		return _vrExpireCertificate.getCertifiedCommercialName();
	}

	/**
	* Returns the certified model code of this vr expire certificate.
	*
	* @return the certified model code of this vr expire certificate
	*/
	@Override
	public java.lang.String getCertifiedModelCode() {
		return _vrExpireCertificate.getCertifiedModelCode();
	}

	/**
	* Returns the certified trademark of this vr expire certificate.
	*
	* @return the certified trademark of this vr expire certificate
	*/
	@Override
	public java.lang.String getCertifiedTrademark() {
		return _vrExpireCertificate.getCertifiedTrademark();
	}

	/**
	* Returns the certified trademark name of this vr expire certificate.
	*
	* @return the certified trademark name of this vr expire certificate
	*/
	@Override
	public java.lang.String getCertifiedTrademarkName() {
		return _vrExpireCertificate.getCertifiedTrademarkName();
	}

	/**
	* Returns the certified vehicle type of this vr expire certificate.
	*
	* @return the certified vehicle type of this vr expire certificate
	*/
	@Override
	public java.lang.String getCertifiedVehicleType() {
		return _vrExpireCertificate.getCertifiedVehicleType();
	}

	/**
	* Returns the certified vehicle type description of this vr expire certificate.
	*
	* @return the certified vehicle type description of this vr expire certificate
	*/
	@Override
	public java.lang.String getCertifiedVehicleTypeDescription() {
		return _vrExpireCertificate.getCertifiedVehicleTypeDescription();
	}

	/**
	* Returns the common safety description of this vr expire certificate.
	*
	* @return the common safety description of this vr expire certificate
	*/
	@Override
	public java.lang.String getCommonSafetyDescription() {
		return _vrExpireCertificate.getCommonSafetyDescription();
	}

	/**
	* Returns the common safety standard of this vr expire certificate.
	*
	* @return the common safety standard of this vr expire certificate
	*/
	@Override
	public java.lang.String getCommonSafetyStandard() {
		return _vrExpireCertificate.getCommonSafetyStandard();
	}

	/**
	* Returns the cop report no of this vr expire certificate.
	*
	* @return the cop report no of this vr expire certificate
	*/
	@Override
	public java.lang.String getCopReportNo() {
		return _vrExpireCertificate.getCopReportNo();
	}

	/**
	* Returns the dossier ID ctn of this vr expire certificate.
	*
	* @return the dossier ID ctn of this vr expire certificate
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrExpireCertificate.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr expire certificate.
	*
	* @return the dossier no of this vr expire certificate
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrExpireCertificate.getDossierNo();
	}

	/**
	* Returns the dossier status of this vr expire certificate.
	*
	* @return the dossier status of this vr expire certificate
	*/
	@Override
	public java.lang.String getDossierStatus() {
		return _vrExpireCertificate.getDossierStatus();
	}

	/**
	* Returns the emission description of this vr expire certificate.
	*
	* @return the emission description of this vr expire certificate
	*/
	@Override
	public java.lang.String getEmissionDescription() {
		return _vrExpireCertificate.getEmissionDescription();
	}

	/**
	* Returns the emission standard of this vr expire certificate.
	*
	* @return the emission standard of this vr expire certificate
	*/
	@Override
	public java.lang.String getEmissionStandard() {
		return _vrExpireCertificate.getEmissionStandard();
	}

	/**
	* Returns the emission test report no of this vr expire certificate.
	*
	* @return the emission test report no of this vr expire certificate
	*/
	@Override
	public java.lang.String getEmissionTestReportNo() {
		return _vrExpireCertificate.getEmissionTestReportNo();
	}

	/**
	* Returns the othertest report no of this vr expire certificate.
	*
	* @return the othertest report no of this vr expire certificate
	*/
	@Override
	public java.lang.String getOthertestReportNo() {
		return _vrExpireCertificate.getOthertestReportNo();
	}

	/**
	* Returns the production country of this vr expire certificate.
	*
	* @return the production country of this vr expire certificate
	*/
	@Override
	public java.lang.String getProductionCountry() {
		return _vrExpireCertificate.getProductionCountry();
	}

	/**
	* Returns the safetytest report no of this vr expire certificate.
	*
	* @return the safetytest report no of this vr expire certificate
	*/
	@Override
	public java.lang.String getSafetytestReportNo() {
		return _vrExpireCertificate.getSafetytestReportNo();
	}

	/**
	* Returns the valid dossier ID ctn of this vr expire certificate.
	*
	* @return the valid dossier ID ctn of this vr expire certificate
	*/
	@Override
	public java.lang.String getValidDossierIdCTN() {
		return _vrExpireCertificate.getValidDossierIdCTN();
	}

	/**
	* Returns the valid dossier no of this vr expire certificate.
	*
	* @return the valid dossier no of this vr expire certificate
	*/
	@Override
	public java.lang.String getValidDossierNo() {
		return _vrExpireCertificate.getValidDossierNo();
	}

	/**
	* Returns the valid inspection note of this vr expire certificate.
	*
	* @return the valid inspection note of this vr expire certificate
	*/
	@Override
	public java.lang.String getValidInspectionNote() {
		return _vrExpireCertificate.getValidInspectionNote();
	}

	/**
	* Returns the valid inspection record no of this vr expire certificate.
	*
	* @return the valid inspection record no of this vr expire certificate
	*/
	@Override
	public java.lang.String getValidInspectionRecordNo() {
		return _vrExpireCertificate.getValidInspectionRecordNo();
	}

	/**
	* Returns the valid inspector name of this vr expire certificate.
	*
	* @return the valid inspector name of this vr expire certificate
	*/
	@Override
	public java.lang.String getValidInspectorName() {
		return _vrExpireCertificate.getValidInspectorName();
	}

	/**
	* Returns the valid remarks of this vr expire certificate.
	*
	* @return the valid remarks of this vr expire certificate
	*/
	@Override
	public java.lang.String getValidRemarks() {
		return _vrExpireCertificate.getValidRemarks();
	}

	/**
	* Returns the valid request no of this vr expire certificate.
	*
	* @return the valid request no of this vr expire certificate
	*/
	@Override
	public java.lang.String getValidRequestNo() {
		return _vrExpireCertificate.getValidRequestNo();
	}

	/**
	* Returns the vehicle class of this vr expire certificate.
	*
	* @return the vehicle class of this vr expire certificate
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrExpireCertificate.getVehicleClass();
	}

	@Override
	public java.lang.String toString() {
		return _vrExpireCertificate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrExpireCertificate.toXmlString();
	}

	/**
	* Returns the certificate record date of this vr expire certificate.
	*
	* @return the certificate record date of this vr expire certificate
	*/
	@Override
	public Date getCertificateRecordDate() {
		return _vrExpireCertificate.getCertificateRecordDate();
	}

	/**
	* Returns the certificate record expire date of this vr expire certificate.
	*
	* @return the certificate record expire date of this vr expire certificate
	*/
	@Override
	public Date getCertificateRecordExpireDate() {
		return _vrExpireCertificate.getCertificateRecordExpireDate();
	}

	/**
	* Returns the cop report date of this vr expire certificate.
	*
	* @return the cop report date of this vr expire certificate
	*/
	@Override
	public Date getCopReportDate() {
		return _vrExpireCertificate.getCopReportDate();
	}

	/**
	* Returns the cop report expire date of this vr expire certificate.
	*
	* @return the cop report expire date of this vr expire certificate
	*/
	@Override
	public Date getCopReportExpireDate() {
		return _vrExpireCertificate.getCopReportExpireDate();
	}

	/**
	* Returns the emission test report date of this vr expire certificate.
	*
	* @return the emission test report date of this vr expire certificate
	*/
	@Override
	public Date getEmissionTestReportDate() {
		return _vrExpireCertificate.getEmissionTestReportDate();
	}

	/**
	* Returns the modify date of this vr expire certificate.
	*
	* @return the modify date of this vr expire certificate
	*/
	@Override
	public Date getModifyDate() {
		return _vrExpireCertificate.getModifyDate();
	}

	/**
	* Returns the othertest report date of this vr expire certificate.
	*
	* @return the othertest report date of this vr expire certificate
	*/
	@Override
	public Date getOthertestReportDate() {
		return _vrExpireCertificate.getOthertestReportDate();
	}

	/**
	* Returns the previous expire date of this vr expire certificate.
	*
	* @return the previous expire date of this vr expire certificate
	*/
	@Override
	public Date getPreviousExpireDate() {
		return _vrExpireCertificate.getPreviousExpireDate();
	}

	/**
	* Returns the safetytest report date of this vr expire certificate.
	*
	* @return the safetytest report date of this vr expire certificate
	*/
	@Override
	public Date getSafetytestReportDate() {
		return _vrExpireCertificate.getSafetytestReportDate();
	}

	/**
	* Returns the sync date of this vr expire certificate.
	*
	* @return the sync date of this vr expire certificate
	*/
	@Override
	public Date getSyncDate() {
		return _vrExpireCertificate.getSyncDate();
	}

	/**
	* Returns the valid inspection record date of this vr expire certificate.
	*
	* @return the valid inspection record date of this vr expire certificate
	*/
	@Override
	public Date getValidInspectionRecordDate() {
		return _vrExpireCertificate.getValidInspectionRecordDate();
	}

	/**
	* Returns the valid request date of this vr expire certificate.
	*
	* @return the valid request date of this vr expire certificate
	*/
	@Override
	public Date getValidRequestDate() {
		return _vrExpireCertificate.getValidRequestDate();
	}

	/**
	* Returns the convert assemble ID of this vr expire certificate.
	*
	* @return the convert assemble ID of this vr expire certificate
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrExpireCertificate.getConvertAssembleId();
	}

	/**
	* Returns the deliverable file entry ID of this vr expire certificate.
	*
	* @return the deliverable file entry ID of this vr expire certificate
	*/
	@Override
	public long getDeliverableFileEntryId() {
		return _vrExpireCertificate.getDeliverableFileEntryId();
	}

	/**
	* Returns the document file entry ID of this vr expire certificate.
	*
	* @return the document file entry ID of this vr expire certificate
	*/
	@Override
	public long getDocumentFileEntryId() {
		return _vrExpireCertificate.getDocumentFileEntryId();
	}

	/**
	* Returns the dossier ID of this vr expire certificate.
	*
	* @return the dossier ID of this vr expire certificate
	*/
	@Override
	public long getDossierId() {
		return _vrExpireCertificate.getDossierId();
	}

	/**
	* Returns the ID of this vr expire certificate.
	*
	* @return the ID of this vr expire certificate
	*/
	@Override
	public long getId() {
		return _vrExpireCertificate.getId();
	}

	/**
	* Returns the mt core of this vr expire certificate.
	*
	* @return the mt core of this vr expire certificate
	*/
	@Override
	public long getMtCore() {
		return _vrExpireCertificate.getMtCore();
	}

	/**
	* Returns the primary key of this vr expire certificate.
	*
	* @return the primary key of this vr expire certificate
	*/
	@Override
	public long getPrimaryKey() {
		return _vrExpireCertificate.getPrimaryKey();
	}

	/**
	* Returns the valid corporation ID of this vr expire certificate.
	*
	* @return the valid corporation ID of this vr expire certificate
	*/
	@Override
	public long getValidCorporationId() {
		return _vrExpireCertificate.getValidCorporationId();
	}

	/**
	* Returns the valid dossier ID of this vr expire certificate.
	*
	* @return the valid dossier ID of this vr expire certificate
	*/
	@Override
	public long getValidDossierId() {
		return _vrExpireCertificate.getValidDossierId();
	}

	/**
	* Returns the valid inspector ID of this vr expire certificate.
	*
	* @return the valid inspector ID of this vr expire certificate
	*/
	@Override
	public long getValidInspectorId() {
		return _vrExpireCertificate.getValidInspectorId();
	}

	/**
	* Returns the vehicle type certificate ID of this vr expire certificate.
	*
	* @return the vehicle type certificate ID of this vr expire certificate
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrExpireCertificate.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrExpireCertificate.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrExpireCertificate.setCachedModel(cachedModel);
	}

	/**
	* Sets the certificate record date of this vr expire certificate.
	*
	* @param certificateRecordDate the certificate record date of this vr expire certificate
	*/
	@Override
	public void setCertificateRecordDate(Date certificateRecordDate) {
		_vrExpireCertificate.setCertificateRecordDate(certificateRecordDate);
	}

	/**
	* Sets the certificate record expire date of this vr expire certificate.
	*
	* @param certificateRecordExpireDate the certificate record expire date of this vr expire certificate
	*/
	@Override
	public void setCertificateRecordExpireDate(Date certificateRecordExpireDate) {
		_vrExpireCertificate.setCertificateRecordExpireDate(certificateRecordExpireDate);
	}

	/**
	* Sets the certificate record no of this vr expire certificate.
	*
	* @param certificateRecordNo the certificate record no of this vr expire certificate
	*/
	@Override
	public void setCertificateRecordNo(java.lang.String certificateRecordNo) {
		_vrExpireCertificate.setCertificateRecordNo(certificateRecordNo);
	}

	/**
	* Sets the certified commercial name of this vr expire certificate.
	*
	* @param certifiedCommercialName the certified commercial name of this vr expire certificate
	*/
	@Override
	public void setCertifiedCommercialName(
		java.lang.String certifiedCommercialName) {
		_vrExpireCertificate.setCertifiedCommercialName(certifiedCommercialName);
	}

	/**
	* Sets the certified model code of this vr expire certificate.
	*
	* @param certifiedModelCode the certified model code of this vr expire certificate
	*/
	@Override
	public void setCertifiedModelCode(java.lang.String certifiedModelCode) {
		_vrExpireCertificate.setCertifiedModelCode(certifiedModelCode);
	}

	/**
	* Sets the certified trademark of this vr expire certificate.
	*
	* @param certifiedTrademark the certified trademark of this vr expire certificate
	*/
	@Override
	public void setCertifiedTrademark(java.lang.String certifiedTrademark) {
		_vrExpireCertificate.setCertifiedTrademark(certifiedTrademark);
	}

	/**
	* Sets the certified trademark name of this vr expire certificate.
	*
	* @param certifiedTrademarkName the certified trademark name of this vr expire certificate
	*/
	@Override
	public void setCertifiedTrademarkName(
		java.lang.String certifiedTrademarkName) {
		_vrExpireCertificate.setCertifiedTrademarkName(certifiedTrademarkName);
	}

	/**
	* Sets the certified vehicle type of this vr expire certificate.
	*
	* @param certifiedVehicleType the certified vehicle type of this vr expire certificate
	*/
	@Override
	public void setCertifiedVehicleType(java.lang.String certifiedVehicleType) {
		_vrExpireCertificate.setCertifiedVehicleType(certifiedVehicleType);
	}

	/**
	* Sets the certified vehicle type description of this vr expire certificate.
	*
	* @param certifiedVehicleTypeDescription the certified vehicle type description of this vr expire certificate
	*/
	@Override
	public void setCertifiedVehicleTypeDescription(
		java.lang.String certifiedVehicleTypeDescription) {
		_vrExpireCertificate.setCertifiedVehicleTypeDescription(certifiedVehicleTypeDescription);
	}

	/**
	* Sets the common safety description of this vr expire certificate.
	*
	* @param commonSafetyDescription the common safety description of this vr expire certificate
	*/
	@Override
	public void setCommonSafetyDescription(
		java.lang.String commonSafetyDescription) {
		_vrExpireCertificate.setCommonSafetyDescription(commonSafetyDescription);
	}

	/**
	* Sets the common safety standard of this vr expire certificate.
	*
	* @param commonSafetyStandard the common safety standard of this vr expire certificate
	*/
	@Override
	public void setCommonSafetyStandard(java.lang.String commonSafetyStandard) {
		_vrExpireCertificate.setCommonSafetyStandard(commonSafetyStandard);
	}

	/**
	* Sets the convert assemble ID of this vr expire certificate.
	*
	* @param convertAssembleId the convert assemble ID of this vr expire certificate
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrExpireCertificate.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the cop report date of this vr expire certificate.
	*
	* @param copReportDate the cop report date of this vr expire certificate
	*/
	@Override
	public void setCopReportDate(Date copReportDate) {
		_vrExpireCertificate.setCopReportDate(copReportDate);
	}

	/**
	* Sets the cop report expire date of this vr expire certificate.
	*
	* @param copReportExpireDate the cop report expire date of this vr expire certificate
	*/
	@Override
	public void setCopReportExpireDate(Date copReportExpireDate) {
		_vrExpireCertificate.setCopReportExpireDate(copReportExpireDate);
	}

	/**
	* Sets the cop report no of this vr expire certificate.
	*
	* @param copReportNo the cop report no of this vr expire certificate
	*/
	@Override
	public void setCopReportNo(java.lang.String copReportNo) {
		_vrExpireCertificate.setCopReportNo(copReportNo);
	}

	/**
	* Sets the deliverable file entry ID of this vr expire certificate.
	*
	* @param deliverableFileEntryId the deliverable file entry ID of this vr expire certificate
	*/
	@Override
	public void setDeliverableFileEntryId(long deliverableFileEntryId) {
		_vrExpireCertificate.setDeliverableFileEntryId(deliverableFileEntryId);
	}

	/**
	* Sets the document file entry ID of this vr expire certificate.
	*
	* @param documentFileEntryId the document file entry ID of this vr expire certificate
	*/
	@Override
	public void setDocumentFileEntryId(long documentFileEntryId) {
		_vrExpireCertificate.setDocumentFileEntryId(documentFileEntryId);
	}

	/**
	* Sets the dossier ID of this vr expire certificate.
	*
	* @param dossierId the dossier ID of this vr expire certificate
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrExpireCertificate.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr expire certificate.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr expire certificate
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrExpireCertificate.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr expire certificate.
	*
	* @param dossierNo the dossier no of this vr expire certificate
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrExpireCertificate.setDossierNo(dossierNo);
	}

	/**
	* Sets the dossier status of this vr expire certificate.
	*
	* @param dossierStatus the dossier status of this vr expire certificate
	*/
	@Override
	public void setDossierStatus(java.lang.String dossierStatus) {
		_vrExpireCertificate.setDossierStatus(dossierStatus);
	}

	/**
	* Sets the emission description of this vr expire certificate.
	*
	* @param emissionDescription the emission description of this vr expire certificate
	*/
	@Override
	public void setEmissionDescription(java.lang.String emissionDescription) {
		_vrExpireCertificate.setEmissionDescription(emissionDescription);
	}

	/**
	* Sets the emission standard of this vr expire certificate.
	*
	* @param emissionStandard the emission standard of this vr expire certificate
	*/
	@Override
	public void setEmissionStandard(java.lang.String emissionStandard) {
		_vrExpireCertificate.setEmissionStandard(emissionStandard);
	}

	/**
	* Sets the emission test report date of this vr expire certificate.
	*
	* @param emissionTestReportDate the emission test report date of this vr expire certificate
	*/
	@Override
	public void setEmissionTestReportDate(Date emissionTestReportDate) {
		_vrExpireCertificate.setEmissionTestReportDate(emissionTestReportDate);
	}

	/**
	* Sets the emission test report no of this vr expire certificate.
	*
	* @param emissionTestReportNo the emission test report no of this vr expire certificate
	*/
	@Override
	public void setEmissionTestReportNo(java.lang.String emissionTestReportNo) {
		_vrExpireCertificate.setEmissionTestReportNo(emissionTestReportNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrExpireCertificate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrExpireCertificate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrExpireCertificate.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expired status of this vr expire certificate.
	*
	* @param expiredStatus the expired status of this vr expire certificate
	*/
	@Override
	public void setExpiredStatus(int expiredStatus) {
		_vrExpireCertificate.setExpiredStatus(expiredStatus);
	}

	/**
	* Sets the ID of this vr expire certificate.
	*
	* @param id the ID of this vr expire certificate
	*/
	@Override
	public void setId(long id) {
		_vrExpireCertificate.setId(id);
	}

	/**
	* Sets the modify date of this vr expire certificate.
	*
	* @param modifyDate the modify date of this vr expire certificate
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrExpireCertificate.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr expire certificate.
	*
	* @param mtCore the mt core of this vr expire certificate
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrExpireCertificate.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrExpireCertificate.setNew(n);
	}

	/**
	* Sets the othertest report date of this vr expire certificate.
	*
	* @param othertestReportDate the othertest report date of this vr expire certificate
	*/
	@Override
	public void setOthertestReportDate(Date othertestReportDate) {
		_vrExpireCertificate.setOthertestReportDate(othertestReportDate);
	}

	/**
	* Sets the othertest report no of this vr expire certificate.
	*
	* @param othertestReportNo the othertest report no of this vr expire certificate
	*/
	@Override
	public void setOthertestReportNo(java.lang.String othertestReportNo) {
		_vrExpireCertificate.setOthertestReportNo(othertestReportNo);
	}

	/**
	* Sets the previous expire date of this vr expire certificate.
	*
	* @param previousExpireDate the previous expire date of this vr expire certificate
	*/
	@Override
	public void setPreviousExpireDate(Date previousExpireDate) {
		_vrExpireCertificate.setPreviousExpireDate(previousExpireDate);
	}

	/**
	* Sets the primary key of this vr expire certificate.
	*
	* @param primaryKey the primary key of this vr expire certificate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrExpireCertificate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrExpireCertificate.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production country of this vr expire certificate.
	*
	* @param productionCountry the production country of this vr expire certificate
	*/
	@Override
	public void setProductionCountry(java.lang.String productionCountry) {
		_vrExpireCertificate.setProductionCountry(productionCountry);
	}

	/**
	* Sets the safetytest report date of this vr expire certificate.
	*
	* @param safetytestReportDate the safetytest report date of this vr expire certificate
	*/
	@Override
	public void setSafetytestReportDate(Date safetytestReportDate) {
		_vrExpireCertificate.setSafetytestReportDate(safetytestReportDate);
	}

	/**
	* Sets the safetytest report no of this vr expire certificate.
	*
	* @param safetytestReportNo the safetytest report no of this vr expire certificate
	*/
	@Override
	public void setSafetytestReportNo(java.lang.String safetytestReportNo) {
		_vrExpireCertificate.setSafetytestReportNo(safetytestReportNo);
	}

	/**
	* Sets the sync date of this vr expire certificate.
	*
	* @param syncDate the sync date of this vr expire certificate
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrExpireCertificate.setSyncDate(syncDate);
	}

	/**
	* Sets the valid corporation ID of this vr expire certificate.
	*
	* @param validCorporationId the valid corporation ID of this vr expire certificate
	*/
	@Override
	public void setValidCorporationId(long validCorporationId) {
		_vrExpireCertificate.setValidCorporationId(validCorporationId);
	}

	/**
	* Sets the valid dossier ID of this vr expire certificate.
	*
	* @param validDossierId the valid dossier ID of this vr expire certificate
	*/
	@Override
	public void setValidDossierId(long validDossierId) {
		_vrExpireCertificate.setValidDossierId(validDossierId);
	}

	/**
	* Sets the valid dossier ID ctn of this vr expire certificate.
	*
	* @param validDossierIdCTN the valid dossier ID ctn of this vr expire certificate
	*/
	@Override
	public void setValidDossierIdCTN(java.lang.String validDossierIdCTN) {
		_vrExpireCertificate.setValidDossierIdCTN(validDossierIdCTN);
	}

	/**
	* Sets the valid dossier no of this vr expire certificate.
	*
	* @param validDossierNo the valid dossier no of this vr expire certificate
	*/
	@Override
	public void setValidDossierNo(java.lang.String validDossierNo) {
		_vrExpireCertificate.setValidDossierNo(validDossierNo);
	}

	/**
	* Sets the valid inspection note of this vr expire certificate.
	*
	* @param validInspectionNote the valid inspection note of this vr expire certificate
	*/
	@Override
	public void setValidInspectionNote(java.lang.String validInspectionNote) {
		_vrExpireCertificate.setValidInspectionNote(validInspectionNote);
	}

	/**
	* Sets the valid inspection record date of this vr expire certificate.
	*
	* @param validInspectionRecordDate the valid inspection record date of this vr expire certificate
	*/
	@Override
	public void setValidInspectionRecordDate(Date validInspectionRecordDate) {
		_vrExpireCertificate.setValidInspectionRecordDate(validInspectionRecordDate);
	}

	/**
	* Sets the valid inspection record no of this vr expire certificate.
	*
	* @param validInspectionRecordNo the valid inspection record no of this vr expire certificate
	*/
	@Override
	public void setValidInspectionRecordNo(
		java.lang.String validInspectionRecordNo) {
		_vrExpireCertificate.setValidInspectionRecordNo(validInspectionRecordNo);
	}

	/**
	* Sets the valid inspector ID of this vr expire certificate.
	*
	* @param validInspectorId the valid inspector ID of this vr expire certificate
	*/
	@Override
	public void setValidInspectorId(long validInspectorId) {
		_vrExpireCertificate.setValidInspectorId(validInspectorId);
	}

	/**
	* Sets the valid inspector name of this vr expire certificate.
	*
	* @param validInspectorName the valid inspector name of this vr expire certificate
	*/
	@Override
	public void setValidInspectorName(java.lang.String validInspectorName) {
		_vrExpireCertificate.setValidInspectorName(validInspectorName);
	}

	/**
	* Sets the valid remarks of this vr expire certificate.
	*
	* @param validRemarks the valid remarks of this vr expire certificate
	*/
	@Override
	public void setValidRemarks(java.lang.String validRemarks) {
		_vrExpireCertificate.setValidRemarks(validRemarks);
	}

	/**
	* Sets the valid request date of this vr expire certificate.
	*
	* @param validRequestDate the valid request date of this vr expire certificate
	*/
	@Override
	public void setValidRequestDate(Date validRequestDate) {
		_vrExpireCertificate.setValidRequestDate(validRequestDate);
	}

	/**
	* Sets the valid request no of this vr expire certificate.
	*
	* @param validRequestNo the valid request no of this vr expire certificate
	*/
	@Override
	public void setValidRequestNo(java.lang.String validRequestNo) {
		_vrExpireCertificate.setValidRequestNo(validRequestNo);
	}

	/**
	* Sets the vehicle class of this vr expire certificate.
	*
	* @param vehicleClass the vehicle class of this vr expire certificate
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrExpireCertificate.setVehicleClass(vehicleClass);
	}

	/**
	* Sets the vehicle type certificate ID of this vr expire certificate.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr expire certificate
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrExpireCertificate.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRExpireCertificateWrapper)) {
			return false;
		}

		VRExpireCertificateWrapper vrExpireCertificateWrapper = (VRExpireCertificateWrapper)obj;

		if (Objects.equals(_vrExpireCertificate,
					vrExpireCertificateWrapper._vrExpireCertificate)) {
			return true;
		}

		return false;
	}

	@Override
	public VRExpireCertificate getWrappedModel() {
		return _vrExpireCertificate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrExpireCertificate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrExpireCertificate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrExpireCertificate.resetOriginalValues();
	}

	private final VRExpireCertificate _vrExpireCertificate;
}