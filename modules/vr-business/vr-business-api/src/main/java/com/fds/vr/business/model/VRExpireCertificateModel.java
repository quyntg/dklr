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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VRExpireCertificate service. Represents a row in the &quot;vr_expire_certificate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRExpireCertificateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRExpireCertificateImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRExpireCertificate
 * @see com.fds.vr.business.model.impl.VRExpireCertificateImpl
 * @see com.fds.vr.business.model.impl.VRExpireCertificateModelImpl
 * @generated
 */
@ProviderType
public interface VRExpireCertificateModel extends BaseModel<VRExpireCertificate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr expire certificate model instance should use the {@link VRExpireCertificate} interface instead.
	 */

	/**
	 * Returns the primary key of this vr expire certificate.
	 *
	 * @return the primary key of this vr expire certificate
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr expire certificate.
	 *
	 * @param primaryKey the primary key of this vr expire certificate
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr expire certificate.
	 *
	 * @return the ID of this vr expire certificate
	 */
	public long getId();

	/**
	 * Sets the ID of this vr expire certificate.
	 *
	 * @param id the ID of this vr expire certificate
	 */
	public void setId(long id);

	/**
	 * Returns the mt core of this vr expire certificate.
	 *
	 * @return the mt core of this vr expire certificate
	 */
	public long getMtCore();

	/**
	 * Sets the mt core of this vr expire certificate.
	 *
	 * @param mtCore the mt core of this vr expire certificate
	 */
	public void setMtCore(long mtCore);

	/**
	 * Returns the convert assemble ID of this vr expire certificate.
	 *
	 * @return the convert assemble ID of this vr expire certificate
	 */
	public long getConvertAssembleId();

	/**
	 * Sets the convert assemble ID of this vr expire certificate.
	 *
	 * @param convertAssembleId the convert assemble ID of this vr expire certificate
	 */
	public void setConvertAssembleId(long convertAssembleId);

	/**
	 * Returns the valid dossier ID of this vr expire certificate.
	 *
	 * @return the valid dossier ID of this vr expire certificate
	 */
	public long getValidDossierId();

	/**
	 * Sets the valid dossier ID of this vr expire certificate.
	 *
	 * @param validDossierId the valid dossier ID of this vr expire certificate
	 */
	public void setValidDossierId(long validDossierId);

	/**
	 * Returns the valid dossier ID ctn of this vr expire certificate.
	 *
	 * @return the valid dossier ID ctn of this vr expire certificate
	 */
	@AutoEscape
	public String getValidDossierIdCTN();

	/**
	 * Sets the valid dossier ID ctn of this vr expire certificate.
	 *
	 * @param validDossierIdCTN the valid dossier ID ctn of this vr expire certificate
	 */
	public void setValidDossierIdCTN(String validDossierIdCTN);

	/**
	 * Returns the valid dossier no of this vr expire certificate.
	 *
	 * @return the valid dossier no of this vr expire certificate
	 */
	@AutoEscape
	public String getValidDossierNo();

	/**
	 * Sets the valid dossier no of this vr expire certificate.
	 *
	 * @param validDossierNo the valid dossier no of this vr expire certificate
	 */
	public void setValidDossierNo(String validDossierNo);

	/**
	 * Returns the vehicle type certificate ID of this vr expire certificate.
	 *
	 * @return the vehicle type certificate ID of this vr expire certificate
	 */
	public long getVehicleTypeCertificateId();

	/**
	 * Sets the vehicle type certificate ID of this vr expire certificate.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID of this vr expire certificate
	 */
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId);

	/**
	 * Returns the dossier ID of this vr expire certificate.
	 *
	 * @return the dossier ID of this vr expire certificate
	 */
	public long getDossierId();

	/**
	 * Sets the dossier ID of this vr expire certificate.
	 *
	 * @param dossierId the dossier ID of this vr expire certificate
	 */
	public void setDossierId(long dossierId);

	/**
	 * Returns the dossier ID ctn of this vr expire certificate.
	 *
	 * @return the dossier ID ctn of this vr expire certificate
	 */
	@AutoEscape
	public String getDossierIdCTN();

	/**
	 * Sets the dossier ID ctn of this vr expire certificate.
	 *
	 * @param dossierIdCTN the dossier ID ctn of this vr expire certificate
	 */
	public void setDossierIdCTN(String dossierIdCTN);

	/**
	 * Returns the dossier no of this vr expire certificate.
	 *
	 * @return the dossier no of this vr expire certificate
	 */
	@AutoEscape
	public String getDossierNo();

	/**
	 * Sets the dossier no of this vr expire certificate.
	 *
	 * @param dossierNo the dossier no of this vr expire certificate
	 */
	public void setDossierNo(String dossierNo);

	/**
	 * Returns the dossier status of this vr expire certificate.
	 *
	 * @return the dossier status of this vr expire certificate
	 */
	@AutoEscape
	public String getDossierStatus();

	/**
	 * Sets the dossier status of this vr expire certificate.
	 *
	 * @param dossierStatus the dossier status of this vr expire certificate
	 */
	public void setDossierStatus(String dossierStatus);

	/**
	 * Returns the previous expire date of this vr expire certificate.
	 *
	 * @return the previous expire date of this vr expire certificate
	 */
	public Date getPreviousExpireDate();

	/**
	 * Sets the previous expire date of this vr expire certificate.
	 *
	 * @param previousExpireDate the previous expire date of this vr expire certificate
	 */
	public void setPreviousExpireDate(Date previousExpireDate);

	/**
	 * Returns the certificate record no of this vr expire certificate.
	 *
	 * @return the certificate record no of this vr expire certificate
	 */
	@AutoEscape
	public String getCertificateRecordNo();

	/**
	 * Sets the certificate record no of this vr expire certificate.
	 *
	 * @param certificateRecordNo the certificate record no of this vr expire certificate
	 */
	public void setCertificateRecordNo(String certificateRecordNo);

	/**
	 * Returns the certificate record date of this vr expire certificate.
	 *
	 * @return the certificate record date of this vr expire certificate
	 */
	public Date getCertificateRecordDate();

	/**
	 * Sets the certificate record date of this vr expire certificate.
	 *
	 * @param certificateRecordDate the certificate record date of this vr expire certificate
	 */
	public void setCertificateRecordDate(Date certificateRecordDate);

	/**
	 * Returns the certificate record expire date of this vr expire certificate.
	 *
	 * @return the certificate record expire date of this vr expire certificate
	 */
	public Date getCertificateRecordExpireDate();

	/**
	 * Sets the certificate record expire date of this vr expire certificate.
	 *
	 * @param certificateRecordExpireDate the certificate record expire date of this vr expire certificate
	 */
	public void setCertificateRecordExpireDate(Date certificateRecordExpireDate);

	/**
	 * Returns the expired status of this vr expire certificate.
	 *
	 * @return the expired status of this vr expire certificate
	 */
	public int getExpiredStatus();

	/**
	 * Sets the expired status of this vr expire certificate.
	 *
	 * @param expiredStatus the expired status of this vr expire certificate
	 */
	public void setExpiredStatus(int expiredStatus);

	/**
	 * Returns the vehicle class of this vr expire certificate.
	 *
	 * @return the vehicle class of this vr expire certificate
	 */
	@AutoEscape
	public String getVehicleClass();

	/**
	 * Sets the vehicle class of this vr expire certificate.
	 *
	 * @param vehicleClass the vehicle class of this vr expire certificate
	 */
	public void setVehicleClass(String vehicleClass);

	/**
	 * Returns the certified vehicle type of this vr expire certificate.
	 *
	 * @return the certified vehicle type of this vr expire certificate
	 */
	@AutoEscape
	public String getCertifiedVehicleType();

	/**
	 * Sets the certified vehicle type of this vr expire certificate.
	 *
	 * @param certifiedVehicleType the certified vehicle type of this vr expire certificate
	 */
	public void setCertifiedVehicleType(String certifiedVehicleType);

	/**
	 * Returns the certified vehicle type description of this vr expire certificate.
	 *
	 * @return the certified vehicle type description of this vr expire certificate
	 */
	@AutoEscape
	public String getCertifiedVehicleTypeDescription();

	/**
	 * Sets the certified vehicle type description of this vr expire certificate.
	 *
	 * @param certifiedVehicleTypeDescription the certified vehicle type description of this vr expire certificate
	 */
	public void setCertifiedVehicleTypeDescription(
		String certifiedVehicleTypeDescription);

	/**
	 * Returns the certified trademark of this vr expire certificate.
	 *
	 * @return the certified trademark of this vr expire certificate
	 */
	@AutoEscape
	public String getCertifiedTrademark();

	/**
	 * Sets the certified trademark of this vr expire certificate.
	 *
	 * @param certifiedTrademark the certified trademark of this vr expire certificate
	 */
	public void setCertifiedTrademark(String certifiedTrademark);

	/**
	 * Returns the certified trademark name of this vr expire certificate.
	 *
	 * @return the certified trademark name of this vr expire certificate
	 */
	@AutoEscape
	public String getCertifiedTrademarkName();

	/**
	 * Sets the certified trademark name of this vr expire certificate.
	 *
	 * @param certifiedTrademarkName the certified trademark name of this vr expire certificate
	 */
	public void setCertifiedTrademarkName(String certifiedTrademarkName);

	/**
	 * Returns the certified commercial name of this vr expire certificate.
	 *
	 * @return the certified commercial name of this vr expire certificate
	 */
	@AutoEscape
	public String getCertifiedCommercialName();

	/**
	 * Sets the certified commercial name of this vr expire certificate.
	 *
	 * @param certifiedCommercialName the certified commercial name of this vr expire certificate
	 */
	public void setCertifiedCommercialName(String certifiedCommercialName);

	/**
	 * Returns the certified model code of this vr expire certificate.
	 *
	 * @return the certified model code of this vr expire certificate
	 */
	@AutoEscape
	public String getCertifiedModelCode();

	/**
	 * Sets the certified model code of this vr expire certificate.
	 *
	 * @param certifiedModelCode the certified model code of this vr expire certificate
	 */
	public void setCertifiedModelCode(String certifiedModelCode);

	/**
	 * Returns the production country of this vr expire certificate.
	 *
	 * @return the production country of this vr expire certificate
	 */
	@AutoEscape
	public String getProductionCountry();

	/**
	 * Sets the production country of this vr expire certificate.
	 *
	 * @param productionCountry the production country of this vr expire certificate
	 */
	public void setProductionCountry(String productionCountry);

	/**
	 * Returns the safetytest report no of this vr expire certificate.
	 *
	 * @return the safetytest report no of this vr expire certificate
	 */
	@AutoEscape
	public String getSafetytestReportNo();

	/**
	 * Sets the safetytest report no of this vr expire certificate.
	 *
	 * @param safetytestReportNo the safetytest report no of this vr expire certificate
	 */
	public void setSafetytestReportNo(String safetytestReportNo);

	/**
	 * Returns the safetytest report date of this vr expire certificate.
	 *
	 * @return the safetytest report date of this vr expire certificate
	 */
	public Date getSafetytestReportDate();

	/**
	 * Sets the safetytest report date of this vr expire certificate.
	 *
	 * @param safetytestReportDate the safetytest report date of this vr expire certificate
	 */
	public void setSafetytestReportDate(Date safetytestReportDate);

	/**
	 * Returns the emission test report no of this vr expire certificate.
	 *
	 * @return the emission test report no of this vr expire certificate
	 */
	@AutoEscape
	public String getEmissionTestReportNo();

	/**
	 * Sets the emission test report no of this vr expire certificate.
	 *
	 * @param emissionTestReportNo the emission test report no of this vr expire certificate
	 */
	public void setEmissionTestReportNo(String emissionTestReportNo);

	/**
	 * Returns the emission test report date of this vr expire certificate.
	 *
	 * @return the emission test report date of this vr expire certificate
	 */
	public Date getEmissionTestReportDate();

	/**
	 * Sets the emission test report date of this vr expire certificate.
	 *
	 * @param emissionTestReportDate the emission test report date of this vr expire certificate
	 */
	public void setEmissionTestReportDate(Date emissionTestReportDate);

	/**
	 * Returns the common safety standard of this vr expire certificate.
	 *
	 * @return the common safety standard of this vr expire certificate
	 */
	@AutoEscape
	public String getCommonSafetyStandard();

	/**
	 * Sets the common safety standard of this vr expire certificate.
	 *
	 * @param commonSafetyStandard the common safety standard of this vr expire certificate
	 */
	public void setCommonSafetyStandard(String commonSafetyStandard);

	/**
	 * Returns the common safety description of this vr expire certificate.
	 *
	 * @return the common safety description of this vr expire certificate
	 */
	@AutoEscape
	public String getCommonSafetyDescription();

	/**
	 * Sets the common safety description of this vr expire certificate.
	 *
	 * @param commonSafetyDescription the common safety description of this vr expire certificate
	 */
	public void setCommonSafetyDescription(String commonSafetyDescription);

	/**
	 * Returns the emission standard of this vr expire certificate.
	 *
	 * @return the emission standard of this vr expire certificate
	 */
	@AutoEscape
	public String getEmissionStandard();

	/**
	 * Sets the emission standard of this vr expire certificate.
	 *
	 * @param emissionStandard the emission standard of this vr expire certificate
	 */
	public void setEmissionStandard(String emissionStandard);

	/**
	 * Returns the emission description of this vr expire certificate.
	 *
	 * @return the emission description of this vr expire certificate
	 */
	@AutoEscape
	public String getEmissionDescription();

	/**
	 * Sets the emission description of this vr expire certificate.
	 *
	 * @param emissionDescription the emission description of this vr expire certificate
	 */
	public void setEmissionDescription(String emissionDescription);

	/**
	 * Returns the othertest report no of this vr expire certificate.
	 *
	 * @return the othertest report no of this vr expire certificate
	 */
	@AutoEscape
	public String getOthertestReportNo();

	/**
	 * Sets the othertest report no of this vr expire certificate.
	 *
	 * @param othertestReportNo the othertest report no of this vr expire certificate
	 */
	public void setOthertestReportNo(String othertestReportNo);

	/**
	 * Returns the othertest report date of this vr expire certificate.
	 *
	 * @return the othertest report date of this vr expire certificate
	 */
	public Date getOthertestReportDate();

	/**
	 * Sets the othertest report date of this vr expire certificate.
	 *
	 * @param othertestReportDate the othertest report date of this vr expire certificate
	 */
	public void setOthertestReportDate(Date othertestReportDate);

	/**
	 * Returns the cop report no of this vr expire certificate.
	 *
	 * @return the cop report no of this vr expire certificate
	 */
	@AutoEscape
	public String getCopReportNo();

	/**
	 * Sets the cop report no of this vr expire certificate.
	 *
	 * @param copReportNo the cop report no of this vr expire certificate
	 */
	public void setCopReportNo(String copReportNo);

	/**
	 * Returns the cop report date of this vr expire certificate.
	 *
	 * @return the cop report date of this vr expire certificate
	 */
	public Date getCopReportDate();

	/**
	 * Sets the cop report date of this vr expire certificate.
	 *
	 * @param copReportDate the cop report date of this vr expire certificate
	 */
	public void setCopReportDate(Date copReportDate);

	/**
	 * Returns the cop report expire date of this vr expire certificate.
	 *
	 * @return the cop report expire date of this vr expire certificate
	 */
	public Date getCopReportExpireDate();

	/**
	 * Sets the cop report expire date of this vr expire certificate.
	 *
	 * @param copReportExpireDate the cop report expire date of this vr expire certificate
	 */
	public void setCopReportExpireDate(Date copReportExpireDate);

	/**
	 * Returns the valid request no of this vr expire certificate.
	 *
	 * @return the valid request no of this vr expire certificate
	 */
	@AutoEscape
	public String getValidRequestNo();

	/**
	 * Sets the valid request no of this vr expire certificate.
	 *
	 * @param validRequestNo the valid request no of this vr expire certificate
	 */
	public void setValidRequestNo(String validRequestNo);

	/**
	 * Returns the valid request date of this vr expire certificate.
	 *
	 * @return the valid request date of this vr expire certificate
	 */
	public Date getValidRequestDate();

	/**
	 * Sets the valid request date of this vr expire certificate.
	 *
	 * @param validRequestDate the valid request date of this vr expire certificate
	 */
	public void setValidRequestDate(Date validRequestDate);

	/**
	 * Returns the valid inspection record no of this vr expire certificate.
	 *
	 * @return the valid inspection record no of this vr expire certificate
	 */
	@AutoEscape
	public String getValidInspectionRecordNo();

	/**
	 * Sets the valid inspection record no of this vr expire certificate.
	 *
	 * @param validInspectionRecordNo the valid inspection record no of this vr expire certificate
	 */
	public void setValidInspectionRecordNo(String validInspectionRecordNo);

	/**
	 * Returns the valid inspection record date of this vr expire certificate.
	 *
	 * @return the valid inspection record date of this vr expire certificate
	 */
	public Date getValidInspectionRecordDate();

	/**
	 * Sets the valid inspection record date of this vr expire certificate.
	 *
	 * @param validInspectionRecordDate the valid inspection record date of this vr expire certificate
	 */
	public void setValidInspectionRecordDate(Date validInspectionRecordDate);

	/**
	 * Returns the valid corporation ID of this vr expire certificate.
	 *
	 * @return the valid corporation ID of this vr expire certificate
	 */
	public long getValidCorporationId();

	/**
	 * Sets the valid corporation ID of this vr expire certificate.
	 *
	 * @param validCorporationId the valid corporation ID of this vr expire certificate
	 */
	public void setValidCorporationId(long validCorporationId);

	/**
	 * Returns the valid inspector ID of this vr expire certificate.
	 *
	 * @return the valid inspector ID of this vr expire certificate
	 */
	public long getValidInspectorId();

	/**
	 * Sets the valid inspector ID of this vr expire certificate.
	 *
	 * @param validInspectorId the valid inspector ID of this vr expire certificate
	 */
	public void setValidInspectorId(long validInspectorId);

	/**
	 * Returns the valid inspector name of this vr expire certificate.
	 *
	 * @return the valid inspector name of this vr expire certificate
	 */
	@AutoEscape
	public String getValidInspectorName();

	/**
	 * Sets the valid inspector name of this vr expire certificate.
	 *
	 * @param validInspectorName the valid inspector name of this vr expire certificate
	 */
	public void setValidInspectorName(String validInspectorName);

	/**
	 * Returns the valid remarks of this vr expire certificate.
	 *
	 * @return the valid remarks of this vr expire certificate
	 */
	@AutoEscape
	public String getValidRemarks();

	/**
	 * Sets the valid remarks of this vr expire certificate.
	 *
	 * @param validRemarks the valid remarks of this vr expire certificate
	 */
	public void setValidRemarks(String validRemarks);

	/**
	 * Returns the valid inspection note of this vr expire certificate.
	 *
	 * @return the valid inspection note of this vr expire certificate
	 */
	@AutoEscape
	public String getValidInspectionNote();

	/**
	 * Sets the valid inspection note of this vr expire certificate.
	 *
	 * @param validInspectionNote the valid inspection note of this vr expire certificate
	 */
	public void setValidInspectionNote(String validInspectionNote);

	/**
	 * Returns the deliverable file entry ID of this vr expire certificate.
	 *
	 * @return the deliverable file entry ID of this vr expire certificate
	 */
	public long getDeliverableFileEntryId();

	/**
	 * Sets the deliverable file entry ID of this vr expire certificate.
	 *
	 * @param deliverableFileEntryId the deliverable file entry ID of this vr expire certificate
	 */
	public void setDeliverableFileEntryId(long deliverableFileEntryId);

	/**
	 * Returns the document file entry ID of this vr expire certificate.
	 *
	 * @return the document file entry ID of this vr expire certificate
	 */
	public long getDocumentFileEntryId();

	/**
	 * Sets the document file entry ID of this vr expire certificate.
	 *
	 * @param documentFileEntryId the document file entry ID of this vr expire certificate
	 */
	public void setDocumentFileEntryId(long documentFileEntryId);

	/**
	 * Returns the modify date of this vr expire certificate.
	 *
	 * @return the modify date of this vr expire certificate
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vr expire certificate.
	 *
	 * @param modifyDate the modify date of this vr expire certificate
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vr expire certificate.
	 *
	 * @return the sync date of this vr expire certificate
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vr expire certificate.
	 *
	 * @param syncDate the sync date of this vr expire certificate
	 */
	public void setSyncDate(Date syncDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(VRExpireCertificate vrExpireCertificate);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRExpireCertificate> toCacheModel();

	@Override
	public VRExpireCertificate toEscapedModel();

	@Override
	public VRExpireCertificate toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}