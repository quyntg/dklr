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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRExpireCertificateSoap implements Serializable {
	public static VRExpireCertificateSoap toSoapModel(VRExpireCertificate model) {
		VRExpireCertificateSoap soapModel = new VRExpireCertificateSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setConvertAssembleId(model.getConvertAssembleId());
		soapModel.setValidDossierId(model.getValidDossierId());
		soapModel.setValidDossierIdCTN(model.getValidDossierIdCTN());
		soapModel.setValidDossierNo(model.getValidDossierNo());
		soapModel.setVehicleTypeCertificateId(model.getVehicleTypeCertificateId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setDossierStatus(model.getDossierStatus());
		soapModel.setPreviousExpireDate(model.getPreviousExpireDate());
		soapModel.setCertificateRecordNo(model.getCertificateRecordNo());
		soapModel.setCertificateRecordDate(model.getCertificateRecordDate());
		soapModel.setCertificateRecordExpireDate(model.getCertificateRecordExpireDate());
		soapModel.setExpiredStatus(model.getExpiredStatus());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setCertifiedVehicleType(model.getCertifiedVehicleType());
		soapModel.setCertifiedVehicleTypeDescription(model.getCertifiedVehicleTypeDescription());
		soapModel.setCertifiedTrademark(model.getCertifiedTrademark());
		soapModel.setCertifiedTrademarkName(model.getCertifiedTrademarkName());
		soapModel.setCertifiedCommercialName(model.getCertifiedCommercialName());
		soapModel.setCertifiedModelCode(model.getCertifiedModelCode());
		soapModel.setProductionCountry(model.getProductionCountry());
		soapModel.setSafetytestReportNo(model.getSafetytestReportNo());
		soapModel.setSafetytestReportDate(model.getSafetytestReportDate());
		soapModel.setEmissionTestReportNo(model.getEmissionTestReportNo());
		soapModel.setEmissionTestReportDate(model.getEmissionTestReportDate());
		soapModel.setCommonSafetyStandard(model.getCommonSafetyStandard());
		soapModel.setCommonSafetyDescription(model.getCommonSafetyDescription());
		soapModel.setEmissionStandard(model.getEmissionStandard());
		soapModel.setEmissionDescription(model.getEmissionDescription());
		soapModel.setOthertestReportNo(model.getOthertestReportNo());
		soapModel.setOthertestReportDate(model.getOthertestReportDate());
		soapModel.setCopReportNo(model.getCopReportNo());
		soapModel.setCopReportDate(model.getCopReportDate());
		soapModel.setCopReportExpireDate(model.getCopReportExpireDate());
		soapModel.setValidRequestNo(model.getValidRequestNo());
		soapModel.setValidRequestDate(model.getValidRequestDate());
		soapModel.setValidInspectionRecordNo(model.getValidInspectionRecordNo());
		soapModel.setValidInspectionRecordDate(model.getValidInspectionRecordDate());
		soapModel.setValidCorporationId(model.getValidCorporationId());
		soapModel.setValidInspectorId(model.getValidInspectorId());
		soapModel.setValidInspectorName(model.getValidInspectorName());
		soapModel.setValidRemarks(model.getValidRemarks());
		soapModel.setValidInspectionNote(model.getValidInspectionNote());
		soapModel.setDeliverableFileEntryId(model.getDeliverableFileEntryId());
		soapModel.setDocumentFileEntryId(model.getDocumentFileEntryId());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRExpireCertificateSoap[] toSoapModels(
		VRExpireCertificate[] models) {
		VRExpireCertificateSoap[] soapModels = new VRExpireCertificateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRExpireCertificateSoap[][] toSoapModels(
		VRExpireCertificate[][] models) {
		VRExpireCertificateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRExpireCertificateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRExpireCertificateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRExpireCertificateSoap[] toSoapModels(
		List<VRExpireCertificate> models) {
		List<VRExpireCertificateSoap> soapModels = new ArrayList<VRExpireCertificateSoap>(models.size());

		for (VRExpireCertificate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRExpireCertificateSoap[soapModels.size()]);
	}

	public VRExpireCertificateSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getMtCore() {
		return _mtCore;
	}

	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	public long getConvertAssembleId() {
		return _convertAssembleId;
	}

	public void setConvertAssembleId(long convertAssembleId) {
		_convertAssembleId = convertAssembleId;
	}

	public long getValidDossierId() {
		return _validDossierId;
	}

	public void setValidDossierId(long validDossierId) {
		_validDossierId = validDossierId;
	}

	public String getValidDossierIdCTN() {
		return _validDossierIdCTN;
	}

	public void setValidDossierIdCTN(String validDossierIdCTN) {
		_validDossierIdCTN = validDossierIdCTN;
	}

	public String getValidDossierNo() {
		return _validDossierNo;
	}

	public void setValidDossierNo(String validDossierNo) {
		_validDossierNo = validDossierNo;
	}

	public long getVehicleTypeCertificateId() {
		return _vehicleTypeCertificateId;
	}

	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vehicleTypeCertificateId = vehicleTypeCertificateId;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getDossierIdCTN() {
		return _dossierIdCTN;
	}

	public void setDossierIdCTN(String dossierIdCTN) {
		_dossierIdCTN = dossierIdCTN;
	}

	public String getDossierNo() {
		return _dossierNo;
	}

	public void setDossierNo(String dossierNo) {
		_dossierNo = dossierNo;
	}

	public String getDossierStatus() {
		return _dossierStatus;
	}

	public void setDossierStatus(String dossierStatus) {
		_dossierStatus = dossierStatus;
	}

	public Date getPreviousExpireDate() {
		return _previousExpireDate;
	}

	public void setPreviousExpireDate(Date previousExpireDate) {
		_previousExpireDate = previousExpireDate;
	}

	public String getCertificateRecordNo() {
		return _certificateRecordNo;
	}

	public void setCertificateRecordNo(String certificateRecordNo) {
		_certificateRecordNo = certificateRecordNo;
	}

	public Date getCertificateRecordDate() {
		return _certificateRecordDate;
	}

	public void setCertificateRecordDate(Date certificateRecordDate) {
		_certificateRecordDate = certificateRecordDate;
	}

	public Date getCertificateRecordExpireDate() {
		return _certificateRecordExpireDate;
	}

	public void setCertificateRecordExpireDate(Date certificateRecordExpireDate) {
		_certificateRecordExpireDate = certificateRecordExpireDate;
	}

	public int getExpiredStatus() {
		return _expiredStatus;
	}

	public void setExpiredStatus(int expiredStatus) {
		_expiredStatus = expiredStatus;
	}

	public String getVehicleClass() {
		return _vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	public String getCertifiedVehicleType() {
		return _certifiedVehicleType;
	}

	public void setCertifiedVehicleType(String certifiedVehicleType) {
		_certifiedVehicleType = certifiedVehicleType;
	}

	public String getCertifiedVehicleTypeDescription() {
		return _certifiedVehicleTypeDescription;
	}

	public void setCertifiedVehicleTypeDescription(
		String certifiedVehicleTypeDescription) {
		_certifiedVehicleTypeDescription = certifiedVehicleTypeDescription;
	}

	public String getCertifiedTrademark() {
		return _certifiedTrademark;
	}

	public void setCertifiedTrademark(String certifiedTrademark) {
		_certifiedTrademark = certifiedTrademark;
	}

	public String getCertifiedTrademarkName() {
		return _certifiedTrademarkName;
	}

	public void setCertifiedTrademarkName(String certifiedTrademarkName) {
		_certifiedTrademarkName = certifiedTrademarkName;
	}

	public String getCertifiedCommercialName() {
		return _certifiedCommercialName;
	}

	public void setCertifiedCommercialName(String certifiedCommercialName) {
		_certifiedCommercialName = certifiedCommercialName;
	}

	public String getCertifiedModelCode() {
		return _certifiedModelCode;
	}

	public void setCertifiedModelCode(String certifiedModelCode) {
		_certifiedModelCode = certifiedModelCode;
	}

	public String getProductionCountry() {
		return _productionCountry;
	}

	public void setProductionCountry(String productionCountry) {
		_productionCountry = productionCountry;
	}

	public String getSafetytestReportNo() {
		return _safetytestReportNo;
	}

	public void setSafetytestReportNo(String safetytestReportNo) {
		_safetytestReportNo = safetytestReportNo;
	}

	public Date getSafetytestReportDate() {
		return _safetytestReportDate;
	}

	public void setSafetytestReportDate(Date safetytestReportDate) {
		_safetytestReportDate = safetytestReportDate;
	}

	public String getEmissionTestReportNo() {
		return _emissionTestReportNo;
	}

	public void setEmissionTestReportNo(String emissionTestReportNo) {
		_emissionTestReportNo = emissionTestReportNo;
	}

	public Date getEmissionTestReportDate() {
		return _emissionTestReportDate;
	}

	public void setEmissionTestReportDate(Date emissionTestReportDate) {
		_emissionTestReportDate = emissionTestReportDate;
	}

	public String getCommonSafetyStandard() {
		return _commonSafetyStandard;
	}

	public void setCommonSafetyStandard(String commonSafetyStandard) {
		_commonSafetyStandard = commonSafetyStandard;
	}

	public String getCommonSafetyDescription() {
		return _commonSafetyDescription;
	}

	public void setCommonSafetyDescription(String commonSafetyDescription) {
		_commonSafetyDescription = commonSafetyDescription;
	}

	public String getEmissionStandard() {
		return _emissionStandard;
	}

	public void setEmissionStandard(String emissionStandard) {
		_emissionStandard = emissionStandard;
	}

	public String getEmissionDescription() {
		return _emissionDescription;
	}

	public void setEmissionDescription(String emissionDescription) {
		_emissionDescription = emissionDescription;
	}

	public String getOthertestReportNo() {
		return _othertestReportNo;
	}

	public void setOthertestReportNo(String othertestReportNo) {
		_othertestReportNo = othertestReportNo;
	}

	public Date getOthertestReportDate() {
		return _othertestReportDate;
	}

	public void setOthertestReportDate(Date othertestReportDate) {
		_othertestReportDate = othertestReportDate;
	}

	public String getCopReportNo() {
		return _copReportNo;
	}

	public void setCopReportNo(String copReportNo) {
		_copReportNo = copReportNo;
	}

	public Date getCopReportDate() {
		return _copReportDate;
	}

	public void setCopReportDate(Date copReportDate) {
		_copReportDate = copReportDate;
	}

	public Date getCopReportExpireDate() {
		return _copReportExpireDate;
	}

	public void setCopReportExpireDate(Date copReportExpireDate) {
		_copReportExpireDate = copReportExpireDate;
	}

	public String getValidRequestNo() {
		return _validRequestNo;
	}

	public void setValidRequestNo(String validRequestNo) {
		_validRequestNo = validRequestNo;
	}

	public Date getValidRequestDate() {
		return _validRequestDate;
	}

	public void setValidRequestDate(Date validRequestDate) {
		_validRequestDate = validRequestDate;
	}

	public String getValidInspectionRecordNo() {
		return _validInspectionRecordNo;
	}

	public void setValidInspectionRecordNo(String validInspectionRecordNo) {
		_validInspectionRecordNo = validInspectionRecordNo;
	}

	public Date getValidInspectionRecordDate() {
		return _validInspectionRecordDate;
	}

	public void setValidInspectionRecordDate(Date validInspectionRecordDate) {
		_validInspectionRecordDate = validInspectionRecordDate;
	}

	public long getValidCorporationId() {
		return _validCorporationId;
	}

	public void setValidCorporationId(long validCorporationId) {
		_validCorporationId = validCorporationId;
	}

	public long getValidInspectorId() {
		return _validInspectorId;
	}

	public void setValidInspectorId(long validInspectorId) {
		_validInspectorId = validInspectorId;
	}

	public String getValidInspectorName() {
		return _validInspectorName;
	}

	public void setValidInspectorName(String validInspectorName) {
		_validInspectorName = validInspectorName;
	}

	public String getValidRemarks() {
		return _validRemarks;
	}

	public void setValidRemarks(String validRemarks) {
		_validRemarks = validRemarks;
	}

	public String getValidInspectionNote() {
		return _validInspectionNote;
	}

	public void setValidInspectionNote(String validInspectionNote) {
		_validInspectionNote = validInspectionNote;
	}

	public long getDeliverableFileEntryId() {
		return _deliverableFileEntryId;
	}

	public void setDeliverableFileEntryId(long deliverableFileEntryId) {
		_deliverableFileEntryId = deliverableFileEntryId;
	}

	public long getDocumentFileEntryId() {
		return _documentFileEntryId;
	}

	public void setDocumentFileEntryId(long documentFileEntryId) {
		_documentFileEntryId = documentFileEntryId;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private long _mtCore;
	private long _convertAssembleId;
	private long _validDossierId;
	private String _validDossierIdCTN;
	private String _validDossierNo;
	private long _vehicleTypeCertificateId;
	private long _dossierId;
	private String _dossierIdCTN;
	private String _dossierNo;
	private String _dossierStatus;
	private Date _previousExpireDate;
	private String _certificateRecordNo;
	private Date _certificateRecordDate;
	private Date _certificateRecordExpireDate;
	private int _expiredStatus;
	private String _vehicleClass;
	private String _certifiedVehicleType;
	private String _certifiedVehicleTypeDescription;
	private String _certifiedTrademark;
	private String _certifiedTrademarkName;
	private String _certifiedCommercialName;
	private String _certifiedModelCode;
	private String _productionCountry;
	private String _safetytestReportNo;
	private Date _safetytestReportDate;
	private String _emissionTestReportNo;
	private Date _emissionTestReportDate;
	private String _commonSafetyStandard;
	private String _commonSafetyDescription;
	private String _emissionStandard;
	private String _emissionDescription;
	private String _othertestReportNo;
	private Date _othertestReportDate;
	private String _copReportNo;
	private Date _copReportDate;
	private Date _copReportExpireDate;
	private String _validRequestNo;
	private Date _validRequestDate;
	private String _validInspectionRecordNo;
	private Date _validInspectionRecordDate;
	private long _validCorporationId;
	private long _validInspectorId;
	private String _validInspectorName;
	private String _validRemarks;
	private String _validInspectionNote;
	private long _deliverableFileEntryId;
	private long _documentFileEntryId;
	private Date _modifyDate;
	private Date _syncDate;
}