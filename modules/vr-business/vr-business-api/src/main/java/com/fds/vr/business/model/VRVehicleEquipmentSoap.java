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
public class VRVehicleEquipmentSoap implements Serializable {
	public static VRVehicleEquipmentSoap toSoapModel(VRVehicleEquipment model) {
		VRVehicleEquipmentSoap soapModel = new VRVehicleEquipmentSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleTypeCertificateId(model.getVehicleTypeCertificateId());
		soapModel.setCertificateRecordId(model.getCertificateRecordId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setIsMandatory(model.getIsMandatory());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setCertificateRecordNo(model.getCertificateRecordNo());
		soapModel.setCertificateRecordDate(model.getCertificateRecordDate());
		soapModel.setCertificateRecordExpireDate(model.getCertificateRecordExpireDate());
		soapModel.setExpiredStatus(model.getExpiredStatus());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setEquipmentCode(model.getEquipmentCode());
		soapModel.setEquipmentName(model.getEquipmentName());
		soapModel.setCertifiedVehicleType(model.getCertifiedVehicleType());
		soapModel.setCertifiedVehicleTypeDescription(model.getCertifiedVehicleTypeDescription());
		soapModel.setCertifiedTrademark(model.getCertifiedTrademark());
		soapModel.setCertifiedTrademarkName(model.getCertifiedTrademarkName());
		soapModel.setCertifiedCommercialName(model.getCertifiedCommercialName());
		soapModel.setCertifiedModelCode(model.getCertifiedModelCode());
		soapModel.setProductionCountry(model.getProductionCountry());
		soapModel.setOriginalCode(model.getOriginalCode());
		soapModel.setOriginalName(model.getOriginalName());
		soapModel.setProductionName(model.getProductionName());
		soapModel.setProductionAddress(model.getProductionAddress());
		soapModel.setManufacturerName(model.getManufacturerName());
		soapModel.setManufacturerAddress(model.getManufacturerAddress());
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
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRVehicleEquipmentSoap[] toSoapModels(
		VRVehicleEquipment[] models) {
		VRVehicleEquipmentSoap[] soapModels = new VRVehicleEquipmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRVehicleEquipmentSoap[][] toSoapModels(
		VRVehicleEquipment[][] models) {
		VRVehicleEquipmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRVehicleEquipmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRVehicleEquipmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRVehicleEquipmentSoap[] toSoapModels(
		List<VRVehicleEquipment> models) {
		List<VRVehicleEquipmentSoap> soapModels = new ArrayList<VRVehicleEquipmentSoap>(models.size());

		for (VRVehicleEquipment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRVehicleEquipmentSoap[soapModels.size()]);
	}

	public VRVehicleEquipmentSoap() {
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

	public long getVehicleTypeCertificateId() {
		return _vehicleTypeCertificateId;
	}

	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vehicleTypeCertificateId = vehicleTypeCertificateId;
	}

	public long getCertificateRecordId() {
		return _certificateRecordId;
	}

	public void setCertificateRecordId(long certificateRecordId) {
		_certificateRecordId = certificateRecordId;
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

	public int getIsMandatory() {
		return _isMandatory;
	}

	public void setIsMandatory(int isMandatory) {
		_isMandatory = isMandatory;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
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

	public String getEquipmentCode() {
		return _equipmentCode;
	}

	public void setEquipmentCode(String equipmentCode) {
		_equipmentCode = equipmentCode;
	}

	public String getEquipmentName() {
		return _equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		_equipmentName = equipmentName;
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

	public String getOriginalCode() {
		return _originalCode;
	}

	public void setOriginalCode(String originalCode) {
		_originalCode = originalCode;
	}

	public String getOriginalName() {
		return _originalName;
	}

	public void setOriginalName(String originalName) {
		_originalName = originalName;
	}

	public String getProductionName() {
		return _productionName;
	}

	public void setProductionName(String productionName) {
		_productionName = productionName;
	}

	public String getProductionAddress() {
		return _productionAddress;
	}

	public void setProductionAddress(String productionAddress) {
		_productionAddress = productionAddress;
	}

	public String getManufacturerName() {
		return _manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		_manufacturerName = manufacturerName;
	}

	public String getManufacturerAddress() {
		return _manufacturerAddress;
	}

	public void setManufacturerAddress(String manufacturerAddress) {
		_manufacturerAddress = manufacturerAddress;
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
	private long _vehicleTypeCertificateId;
	private long _certificateRecordId;
	private long _dossierId;
	private String _dossierIdCTN;
	private String _dossierNo;
	private int _isMandatory;
	private long _sequenceNo;
	private String _certificateRecordNo;
	private Date _certificateRecordDate;
	private Date _certificateRecordExpireDate;
	private int _expiredStatus;
	private String _vehicleClass;
	private String _equipmentCode;
	private String _equipmentName;
	private String _certifiedVehicleType;
	private String _certifiedVehicleTypeDescription;
	private String _certifiedTrademark;
	private String _certifiedTrademarkName;
	private String _certifiedCommercialName;
	private String _certifiedModelCode;
	private String _productionCountry;
	private String _originalCode;
	private String _originalName;
	private String _productionName;
	private String _productionAddress;
	private String _manufacturerName;
	private String _manufacturerAddress;
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
	private Date _modifyDate;
	private Date _syncDate;
}