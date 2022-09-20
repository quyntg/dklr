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
public class VRProductionPlantSoap implements Serializable {
	public static VRProductionPlantSoap toSoapModel(VRProductionPlant model) {
		VRProductionPlantSoap soapModel = new VRProductionPlantSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setMappingMA_CTY(model.getMappingMA_CTY());
		soapModel.setMappingTEN_CTY(model.getMappingTEN_CTY());
		soapModel.setMappingDIA_CHI_CTY(model.getMappingDIA_CHI_CTY());
		soapModel.setMappingMA_XUONG_LR(model.getMappingMA_XUONG_LR());
		soapModel.setMappingTEN_XUONG_LR(model.getMappingTEN_XUONG_LR());
		soapModel.setMappingDIA_CHI_XUONG_LR(model.getMappingDIA_CHI_XUONG_LR());
		soapModel.setMappingNote(model.getMappingNote());
		soapModel.setMappingStatus(model.getMappingStatus());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());
		soapModel.setProductionPlantName(model.getProductionPlantName());
		soapModel.setProductionPlantAddress(model.getProductionPlantAddress());
		soapModel.setProductionPlantRegion(model.getProductionPlantRegion());
		soapModel.setProductionPlantRegionCode(model.getProductionPlantRegionCode());
		soapModel.setProductionPlantStateCode(model.getProductionPlantStateCode());
		soapModel.setProductionPlantStateName(model.getProductionPlantStateName());
		soapModel.setProductionPlantProvinceCode(model.getProductionPlantProvinceCode());
		soapModel.setProductionPlantProvinceName(model.getProductionPlantProvinceName());
		soapModel.setProductionPlantDistrictCode(model.getProductionPlantDistrictCode());
		soapModel.setProductionPlantDistrictName(model.getProductionPlantDistrictName());
		soapModel.setProductionPlantWardCode(model.getProductionPlantWardCode());
		soapModel.setProductionPlantWardName(model.getProductionPlantWardName());
		soapModel.setProductionPlantEmail(model.getProductionPlantEmail());
		soapModel.setProductionPlantPhone(model.getProductionPlantPhone());
		soapModel.setProductionPlantFax(model.getProductionPlantFax());
		soapModel.setProductionPlantWebsite(model.getProductionPlantWebsite());
		soapModel.setProductionPlantRepresentativePhone(model.getProductionPlantRepresentativePhone());
		soapModel.setProductionPlantRepresentative(model.getProductionPlantRepresentative());
		soapModel.setProductionPlantRepresentativeTitle(model.getProductionPlantRepresentativeTitle());
		soapModel.setProductionPlantContactName(model.getProductionPlantContactName());
		soapModel.setProductionPlantContactEmail(model.getProductionPlantContactEmail());
		soapModel.setProductionPlantContactPhone(model.getProductionPlantContactPhone());
		soapModel.setProductionPlantType(model.getProductionPlantType());
		soapModel.setProductionPlantStatus(model.getProductionPlantStatus());
		soapModel.setProductionManufacture(model.getProductionManufacture());
		soapModel.setProductionMaintainer(model.getProductionMaintainer());
		soapModel.setProductionPlantIdentityNo(model.getProductionPlantIdentityNo());
		soapModel.setProductionPlantIdentityType(model.getProductionPlantIdentityType());
		soapModel.setProductionPlantIdentityDescription(model.getProductionPlantIdentityDescription());
		soapModel.setProductionPlantIdentityFileEntryId(model.getProductionPlantIdentityFileEntryId());
		soapModel.setProductionPlantEmployeesNote(model.getProductionPlantEmployeesNote());
		soapModel.setProductionPlantEquipmentsNote(model.getProductionPlantEquipmentsNote());
		soapModel.setProductionPlantProdEquipmentsNote(model.getProductionPlantProdEquipmentsNote());
		soapModel.setProductionIdentityFileName(model.getProductionIdentityFileName());
		soapModel.setProductionIdentityFileEntryId(model.getProductionIdentityFileEntryId());
		soapModel.setApplicantCode(model.getApplicantCode());
		soapModel.setSupplierName(model.getSupplierName());
		soapModel.setSupplierAddress(model.getSupplierAddress());
		soapModel.setCorporationCode(model.getCorporationCode());
		soapModel.setCorporationName(model.getCorporationName());
		soapModel.setCorporationAddress(model.getCorporationAddress());
		soapModel.setProductionPlantMetadata(model.getProductionPlantMetadata());
		soapModel.setRegistrationId(model.getRegistrationId());
		soapModel.setRegistrationFormId(model.getRegistrationFormId());
		soapModel.setApplicantProfileId(model.getApplicantProfileId());
		soapModel.setSupplierId(model.getSupplierId());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRProductionPlantSoap[] toSoapModels(
		VRProductionPlant[] models) {
		VRProductionPlantSoap[] soapModels = new VRProductionPlantSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRProductionPlantSoap[][] toSoapModels(
		VRProductionPlant[][] models) {
		VRProductionPlantSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRProductionPlantSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRProductionPlantSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRProductionPlantSoap[] toSoapModels(
		List<VRProductionPlant> models) {
		List<VRProductionPlantSoap> soapModels = new ArrayList<VRProductionPlantSoap>(models.size());

		for (VRProductionPlant model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRProductionPlantSoap[soapModels.size()]);
	}

	public VRProductionPlantSoap() {
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

	public String getMappingMA_CTY() {
		return _mappingMA_CTY;
	}

	public void setMappingMA_CTY(String mappingMA_CTY) {
		_mappingMA_CTY = mappingMA_CTY;
	}

	public String getMappingTEN_CTY() {
		return _mappingTEN_CTY;
	}

	public void setMappingTEN_CTY(String mappingTEN_CTY) {
		_mappingTEN_CTY = mappingTEN_CTY;
	}

	public String getMappingDIA_CHI_CTY() {
		return _mappingDIA_CHI_CTY;
	}

	public void setMappingDIA_CHI_CTY(String mappingDIA_CHI_CTY) {
		_mappingDIA_CHI_CTY = mappingDIA_CHI_CTY;
	}

	public String getMappingMA_XUONG_LR() {
		return _mappingMA_XUONG_LR;
	}

	public void setMappingMA_XUONG_LR(String mappingMA_XUONG_LR) {
		_mappingMA_XUONG_LR = mappingMA_XUONG_LR;
	}

	public String getMappingTEN_XUONG_LR() {
		return _mappingTEN_XUONG_LR;
	}

	public void setMappingTEN_XUONG_LR(String mappingTEN_XUONG_LR) {
		_mappingTEN_XUONG_LR = mappingTEN_XUONG_LR;
	}

	public String getMappingDIA_CHI_XUONG_LR() {
		return _mappingDIA_CHI_XUONG_LR;
	}

	public void setMappingDIA_CHI_XUONG_LR(String mappingDIA_CHI_XUONG_LR) {
		_mappingDIA_CHI_XUONG_LR = mappingDIA_CHI_XUONG_LR;
	}

	public String getMappingNote() {
		return _mappingNote;
	}

	public void setMappingNote(String mappingNote) {
		_mappingNote = mappingNote;
	}

	public String getMappingStatus() {
		return _mappingStatus;
	}

	public void setMappingStatus(String mappingStatus) {
		_mappingStatus = mappingStatus;
	}

	public String getProductionPlantCode() {
		return _productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		_productionPlantCode = productionPlantCode;
	}

	public String getProductionPlantName() {
		return _productionPlantName;
	}

	public void setProductionPlantName(String productionPlantName) {
		_productionPlantName = productionPlantName;
	}

	public String getProductionPlantAddress() {
		return _productionPlantAddress;
	}

	public void setProductionPlantAddress(String productionPlantAddress) {
		_productionPlantAddress = productionPlantAddress;
	}

	public String getProductionPlantRegion() {
		return _productionPlantRegion;
	}

	public void setProductionPlantRegion(String productionPlantRegion) {
		_productionPlantRegion = productionPlantRegion;
	}

	public String getProductionPlantRegionCode() {
		return _productionPlantRegionCode;
	}

	public void setProductionPlantRegionCode(String productionPlantRegionCode) {
		_productionPlantRegionCode = productionPlantRegionCode;
	}

	public String getProductionPlantStateCode() {
		return _productionPlantStateCode;
	}

	public void setProductionPlantStateCode(String productionPlantStateCode) {
		_productionPlantStateCode = productionPlantStateCode;
	}

	public String getProductionPlantStateName() {
		return _productionPlantStateName;
	}

	public void setProductionPlantStateName(String productionPlantStateName) {
		_productionPlantStateName = productionPlantStateName;
	}

	public String getProductionPlantProvinceCode() {
		return _productionPlantProvinceCode;
	}

	public void setProductionPlantProvinceCode(
		String productionPlantProvinceCode) {
		_productionPlantProvinceCode = productionPlantProvinceCode;
	}

	public String getProductionPlantProvinceName() {
		return _productionPlantProvinceName;
	}

	public void setProductionPlantProvinceName(
		String productionPlantProvinceName) {
		_productionPlantProvinceName = productionPlantProvinceName;
	}

	public String getProductionPlantDistrictCode() {
		return _productionPlantDistrictCode;
	}

	public void setProductionPlantDistrictCode(
		String productionPlantDistrictCode) {
		_productionPlantDistrictCode = productionPlantDistrictCode;
	}

	public String getProductionPlantDistrictName() {
		return _productionPlantDistrictName;
	}

	public void setProductionPlantDistrictName(
		String productionPlantDistrictName) {
		_productionPlantDistrictName = productionPlantDistrictName;
	}

	public String getProductionPlantWardCode() {
		return _productionPlantWardCode;
	}

	public void setProductionPlantWardCode(String productionPlantWardCode) {
		_productionPlantWardCode = productionPlantWardCode;
	}

	public String getProductionPlantWardName() {
		return _productionPlantWardName;
	}

	public void setProductionPlantWardName(String productionPlantWardName) {
		_productionPlantWardName = productionPlantWardName;
	}

	public String getProductionPlantEmail() {
		return _productionPlantEmail;
	}

	public void setProductionPlantEmail(String productionPlantEmail) {
		_productionPlantEmail = productionPlantEmail;
	}

	public String getProductionPlantPhone() {
		return _productionPlantPhone;
	}

	public void setProductionPlantPhone(String productionPlantPhone) {
		_productionPlantPhone = productionPlantPhone;
	}

	public String getProductionPlantFax() {
		return _productionPlantFax;
	}

	public void setProductionPlantFax(String productionPlantFax) {
		_productionPlantFax = productionPlantFax;
	}

	public String getProductionPlantWebsite() {
		return _productionPlantWebsite;
	}

	public void setProductionPlantWebsite(String productionPlantWebsite) {
		_productionPlantWebsite = productionPlantWebsite;
	}

	public String getProductionPlantRepresentativePhone() {
		return _productionPlantRepresentativePhone;
	}

	public void setProductionPlantRepresentativePhone(
		String productionPlantRepresentativePhone) {
		_productionPlantRepresentativePhone = productionPlantRepresentativePhone;
	}

	public String getProductionPlantRepresentative() {
		return _productionPlantRepresentative;
	}

	public void setProductionPlantRepresentative(
		String productionPlantRepresentative) {
		_productionPlantRepresentative = productionPlantRepresentative;
	}

	public String getProductionPlantRepresentativeTitle() {
		return _productionPlantRepresentativeTitle;
	}

	public void setProductionPlantRepresentativeTitle(
		String productionPlantRepresentativeTitle) {
		_productionPlantRepresentativeTitle = productionPlantRepresentativeTitle;
	}

	public String getProductionPlantContactName() {
		return _productionPlantContactName;
	}

	public void setProductionPlantContactName(String productionPlantContactName) {
		_productionPlantContactName = productionPlantContactName;
	}

	public String getProductionPlantContactEmail() {
		return _productionPlantContactEmail;
	}

	public void setProductionPlantContactEmail(
		String productionPlantContactEmail) {
		_productionPlantContactEmail = productionPlantContactEmail;
	}

	public String getProductionPlantContactPhone() {
		return _productionPlantContactPhone;
	}

	public void setProductionPlantContactPhone(
		String productionPlantContactPhone) {
		_productionPlantContactPhone = productionPlantContactPhone;
	}

	public String getProductionPlantType() {
		return _productionPlantType;
	}

	public void setProductionPlantType(String productionPlantType) {
		_productionPlantType = productionPlantType;
	}

	public String getProductionPlantStatus() {
		return _productionPlantStatus;
	}

	public void setProductionPlantStatus(String productionPlantStatus) {
		_productionPlantStatus = productionPlantStatus;
	}

	public String getProductionManufacture() {
		return _productionManufacture;
	}

	public void setProductionManufacture(String productionManufacture) {
		_productionManufacture = productionManufacture;
	}

	public String getProductionMaintainer() {
		return _productionMaintainer;
	}

	public void setProductionMaintainer(String productionMaintainer) {
		_productionMaintainer = productionMaintainer;
	}

	public String getProductionPlantIdentityNo() {
		return _productionPlantIdentityNo;
	}

	public void setProductionPlantIdentityNo(String productionPlantIdentityNo) {
		_productionPlantIdentityNo = productionPlantIdentityNo;
	}

	public String getProductionPlantIdentityType() {
		return _productionPlantIdentityType;
	}

	public void setProductionPlantIdentityType(
		String productionPlantIdentityType) {
		_productionPlantIdentityType = productionPlantIdentityType;
	}

	public String getProductionPlantIdentityDescription() {
		return _productionPlantIdentityDescription;
	}

	public void setProductionPlantIdentityDescription(
		String productionPlantIdentityDescription) {
		_productionPlantIdentityDescription = productionPlantIdentityDescription;
	}

	public long getProductionPlantIdentityFileEntryId() {
		return _productionPlantIdentityFileEntryId;
	}

	public void setProductionPlantIdentityFileEntryId(
		long productionPlantIdentityFileEntryId) {
		_productionPlantIdentityFileEntryId = productionPlantIdentityFileEntryId;
	}

	public String getProductionPlantEmployeesNote() {
		return _productionPlantEmployeesNote;
	}

	public void setProductionPlantEmployeesNote(
		String productionPlantEmployeesNote) {
		_productionPlantEmployeesNote = productionPlantEmployeesNote;
	}

	public String getProductionPlantEquipmentsNote() {
		return _productionPlantEquipmentsNote;
	}

	public void setProductionPlantEquipmentsNote(
		String productionPlantEquipmentsNote) {
		_productionPlantEquipmentsNote = productionPlantEquipmentsNote;
	}

	public String getProductionPlantProdEquipmentsNote() {
		return _productionPlantProdEquipmentsNote;
	}

	public void setProductionPlantProdEquipmentsNote(
		String productionPlantProdEquipmentsNote) {
		_productionPlantProdEquipmentsNote = productionPlantProdEquipmentsNote;
	}

	public String getProductionIdentityFileName() {
		return _productionIdentityFileName;
	}

	public void setProductionIdentityFileName(String productionIdentityFileName) {
		_productionIdentityFileName = productionIdentityFileName;
	}

	public long getProductionIdentityFileEntryId() {
		return _productionIdentityFileEntryId;
	}

	public void setProductionIdentityFileEntryId(
		long productionIdentityFileEntryId) {
		_productionIdentityFileEntryId = productionIdentityFileEntryId;
	}

	public String getApplicantCode() {
		return _applicantCode;
	}

	public void setApplicantCode(String applicantCode) {
		_applicantCode = applicantCode;
	}

	public String getSupplierName() {
		return _supplierName;
	}

	public void setSupplierName(String supplierName) {
		_supplierName = supplierName;
	}

	public String getSupplierAddress() {
		return _supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		_supplierAddress = supplierAddress;
	}

	public String getCorporationCode() {
		return _corporationCode;
	}

	public void setCorporationCode(String corporationCode) {
		_corporationCode = corporationCode;
	}

	public String getCorporationName() {
		return _corporationName;
	}

	public void setCorporationName(String corporationName) {
		_corporationName = corporationName;
	}

	public String getCorporationAddress() {
		return _corporationAddress;
	}

	public void setCorporationAddress(String corporationAddress) {
		_corporationAddress = corporationAddress;
	}

	public String getProductionPlantMetadata() {
		return _productionPlantMetadata;
	}

	public void setProductionPlantMetadata(String productionPlantMetadata) {
		_productionPlantMetadata = productionPlantMetadata;
	}

	public long getRegistrationId() {
		return _registrationId;
	}

	public void setRegistrationId(long registrationId) {
		_registrationId = registrationId;
	}

	public long getRegistrationFormId() {
		return _registrationFormId;
	}

	public void setRegistrationFormId(long registrationFormId) {
		_registrationFormId = registrationFormId;
	}

	public long getApplicantProfileId() {
		return _applicantProfileId;
	}

	public void setApplicantProfileId(long applicantProfileId) {
		_applicantProfileId = applicantProfileId;
	}

	public long getSupplierId() {
		return _supplierId;
	}

	public void setSupplierId(long supplierId) {
		_supplierId = supplierId;
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
	private String _mappingMA_CTY;
	private String _mappingTEN_CTY;
	private String _mappingDIA_CHI_CTY;
	private String _mappingMA_XUONG_LR;
	private String _mappingTEN_XUONG_LR;
	private String _mappingDIA_CHI_XUONG_LR;
	private String _mappingNote;
	private String _mappingStatus;
	private String _productionPlantCode;
	private String _productionPlantName;
	private String _productionPlantAddress;
	private String _productionPlantRegion;
	private String _productionPlantRegionCode;
	private String _productionPlantStateCode;
	private String _productionPlantStateName;
	private String _productionPlantProvinceCode;
	private String _productionPlantProvinceName;
	private String _productionPlantDistrictCode;
	private String _productionPlantDistrictName;
	private String _productionPlantWardCode;
	private String _productionPlantWardName;
	private String _productionPlantEmail;
	private String _productionPlantPhone;
	private String _productionPlantFax;
	private String _productionPlantWebsite;
	private String _productionPlantRepresentativePhone;
	private String _productionPlantRepresentative;
	private String _productionPlantRepresentativeTitle;
	private String _productionPlantContactName;
	private String _productionPlantContactEmail;
	private String _productionPlantContactPhone;
	private String _productionPlantType;
	private String _productionPlantStatus;
	private String _productionManufacture;
	private String _productionMaintainer;
	private String _productionPlantIdentityNo;
	private String _productionPlantIdentityType;
	private String _productionPlantIdentityDescription;
	private long _productionPlantIdentityFileEntryId;
	private String _productionPlantEmployeesNote;
	private String _productionPlantEquipmentsNote;
	private String _productionPlantProdEquipmentsNote;
	private String _productionIdentityFileName;
	private long _productionIdentityFileEntryId;
	private String _applicantCode;
	private String _supplierName;
	private String _supplierAddress;
	private String _corporationCode;
	private String _corporationName;
	private String _corporationAddress;
	private String _productionPlantMetadata;
	private long _registrationId;
	private long _registrationFormId;
	private long _applicantProfileId;
	private long _supplierId;
	private Date _modifyDate;
	private Date _syncDate;
}