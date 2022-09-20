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

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRProductionPlant;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VRProductionPlant in entity cache.
 *
 * @author LamTV
 * @see VRProductionPlant
 * @generated
 */
@ProviderType
public class VRProductionPlantCacheModel implements CacheModel<VRProductionPlant>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductionPlantCacheModel)) {
			return false;
		}

		VRProductionPlantCacheModel vrProductionPlantCacheModel = (VRProductionPlantCacheModel)obj;

		if (id == vrProductionPlantCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(119);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", mappingMA_CTY=");
		sb.append(mappingMA_CTY);
		sb.append(", mappingTEN_CTY=");
		sb.append(mappingTEN_CTY);
		sb.append(", mappingDIA_CHI_CTY=");
		sb.append(mappingDIA_CHI_CTY);
		sb.append(", mappingMA_XUONG_LR=");
		sb.append(mappingMA_XUONG_LR);
		sb.append(", mappingTEN_XUONG_LR=");
		sb.append(mappingTEN_XUONG_LR);
		sb.append(", mappingDIA_CHI_XUONG_LR=");
		sb.append(mappingDIA_CHI_XUONG_LR);
		sb.append(", mappingNote=");
		sb.append(mappingNote);
		sb.append(", mappingStatus=");
		sb.append(mappingStatus);
		sb.append(", productionPlantCode=");
		sb.append(productionPlantCode);
		sb.append(", productionPlantName=");
		sb.append(productionPlantName);
		sb.append(", productionPlantAddress=");
		sb.append(productionPlantAddress);
		sb.append(", productionPlantRegion=");
		sb.append(productionPlantRegion);
		sb.append(", productionPlantRegionCode=");
		sb.append(productionPlantRegionCode);
		sb.append(", productionPlantStateCode=");
		sb.append(productionPlantStateCode);
		sb.append(", productionPlantStateName=");
		sb.append(productionPlantStateName);
		sb.append(", productionPlantProvinceCode=");
		sb.append(productionPlantProvinceCode);
		sb.append(", productionPlantProvinceName=");
		sb.append(productionPlantProvinceName);
		sb.append(", productionPlantDistrictCode=");
		sb.append(productionPlantDistrictCode);
		sb.append(", productionPlantDistrictName=");
		sb.append(productionPlantDistrictName);
		sb.append(", productionPlantWardCode=");
		sb.append(productionPlantWardCode);
		sb.append(", productionPlantWardName=");
		sb.append(productionPlantWardName);
		sb.append(", productionPlantEmail=");
		sb.append(productionPlantEmail);
		sb.append(", productionPlantPhone=");
		sb.append(productionPlantPhone);
		sb.append(", productionPlantFax=");
		sb.append(productionPlantFax);
		sb.append(", productionPlantWebsite=");
		sb.append(productionPlantWebsite);
		sb.append(", productionPlantRepresentativePhone=");
		sb.append(productionPlantRepresentativePhone);
		sb.append(", productionPlantRepresentative=");
		sb.append(productionPlantRepresentative);
		sb.append(", productionPlantRepresentativeTitle=");
		sb.append(productionPlantRepresentativeTitle);
		sb.append(", productionPlantContactName=");
		sb.append(productionPlantContactName);
		sb.append(", productionPlantContactEmail=");
		sb.append(productionPlantContactEmail);
		sb.append(", productionPlantContactPhone=");
		sb.append(productionPlantContactPhone);
		sb.append(", productionPlantType=");
		sb.append(productionPlantType);
		sb.append(", productionPlantStatus=");
		sb.append(productionPlantStatus);
		sb.append(", productionManufacture=");
		sb.append(productionManufacture);
		sb.append(", productionMaintainer=");
		sb.append(productionMaintainer);
		sb.append(", productionPlantIdentityNo=");
		sb.append(productionPlantIdentityNo);
		sb.append(", productionPlantIdentityType=");
		sb.append(productionPlantIdentityType);
		sb.append(", productionPlantIdentityDescription=");
		sb.append(productionPlantIdentityDescription);
		sb.append(", productionPlantIdentityFileEntryId=");
		sb.append(productionPlantIdentityFileEntryId);
		sb.append(", productionPlantEmployeesNote=");
		sb.append(productionPlantEmployeesNote);
		sb.append(", productionPlantEquipmentsNote=");
		sb.append(productionPlantEquipmentsNote);
		sb.append(", productionPlantProdEquipmentsNote=");
		sb.append(productionPlantProdEquipmentsNote);
		sb.append(", productionIdentityFileName=");
		sb.append(productionIdentityFileName);
		sb.append(", productionIdentityFileEntryId=");
		sb.append(productionIdentityFileEntryId);
		sb.append(", applicantCode=");
		sb.append(applicantCode);
		sb.append(", supplierName=");
		sb.append(supplierName);
		sb.append(", supplierAddress=");
		sb.append(supplierAddress);
		sb.append(", corporationCode=");
		sb.append(corporationCode);
		sb.append(", corporationName=");
		sb.append(corporationName);
		sb.append(", corporationAddress=");
		sb.append(corporationAddress);
		sb.append(", productionPlantMetadata=");
		sb.append(productionPlantMetadata);
		sb.append(", registrationId=");
		sb.append(registrationId);
		sb.append(", registrationFormId=");
		sb.append(registrationFormId);
		sb.append(", applicantProfileId=");
		sb.append(applicantProfileId);
		sb.append(", supplierId=");
		sb.append(supplierId);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRProductionPlant toEntityModel() {
		VRProductionPlantImpl vrProductionPlantImpl = new VRProductionPlantImpl();

		vrProductionPlantImpl.setId(id);
		vrProductionPlantImpl.setMtCore(mtCore);

		if (mappingMA_CTY == null) {
			vrProductionPlantImpl.setMappingMA_CTY(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setMappingMA_CTY(mappingMA_CTY);
		}

		if (mappingTEN_CTY == null) {
			vrProductionPlantImpl.setMappingTEN_CTY(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setMappingTEN_CTY(mappingTEN_CTY);
		}

		if (mappingDIA_CHI_CTY == null) {
			vrProductionPlantImpl.setMappingDIA_CHI_CTY(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setMappingDIA_CHI_CTY(mappingDIA_CHI_CTY);
		}

		if (mappingMA_XUONG_LR == null) {
			vrProductionPlantImpl.setMappingMA_XUONG_LR(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setMappingMA_XUONG_LR(mappingMA_XUONG_LR);
		}

		if (mappingTEN_XUONG_LR == null) {
			vrProductionPlantImpl.setMappingTEN_XUONG_LR(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setMappingTEN_XUONG_LR(mappingTEN_XUONG_LR);
		}

		if (mappingDIA_CHI_XUONG_LR == null) {
			vrProductionPlantImpl.setMappingDIA_CHI_XUONG_LR(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setMappingDIA_CHI_XUONG_LR(mappingDIA_CHI_XUONG_LR);
		}

		if (mappingNote == null) {
			vrProductionPlantImpl.setMappingNote(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setMappingNote(mappingNote);
		}

		if (mappingStatus == null) {
			vrProductionPlantImpl.setMappingStatus(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setMappingStatus(mappingStatus);
		}

		if (productionPlantCode == null) {
			vrProductionPlantImpl.setProductionPlantCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantCode(productionPlantCode);
		}

		if (productionPlantName == null) {
			vrProductionPlantImpl.setProductionPlantName(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantName(productionPlantName);
		}

		if (productionPlantAddress == null) {
			vrProductionPlantImpl.setProductionPlantAddress(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantAddress(productionPlantAddress);
		}

		if (productionPlantRegion == null) {
			vrProductionPlantImpl.setProductionPlantRegion(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantRegion(productionPlantRegion);
		}

		if (productionPlantRegionCode == null) {
			vrProductionPlantImpl.setProductionPlantRegionCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantRegionCode(productionPlantRegionCode);
		}

		if (productionPlantStateCode == null) {
			vrProductionPlantImpl.setProductionPlantStateCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantStateCode(productionPlantStateCode);
		}

		if (productionPlantStateName == null) {
			vrProductionPlantImpl.setProductionPlantStateName(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantStateName(productionPlantStateName);
		}

		if (productionPlantProvinceCode == null) {
			vrProductionPlantImpl.setProductionPlantProvinceCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantProvinceCode(productionPlantProvinceCode);
		}

		if (productionPlantProvinceName == null) {
			vrProductionPlantImpl.setProductionPlantProvinceName(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantProvinceName(productionPlantProvinceName);
		}

		if (productionPlantDistrictCode == null) {
			vrProductionPlantImpl.setProductionPlantDistrictCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantDistrictCode(productionPlantDistrictCode);
		}

		if (productionPlantDistrictName == null) {
			vrProductionPlantImpl.setProductionPlantDistrictName(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantDistrictName(productionPlantDistrictName);
		}

		if (productionPlantWardCode == null) {
			vrProductionPlantImpl.setProductionPlantWardCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantWardCode(productionPlantWardCode);
		}

		if (productionPlantWardName == null) {
			vrProductionPlantImpl.setProductionPlantWardName(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantWardName(productionPlantWardName);
		}

		if (productionPlantEmail == null) {
			vrProductionPlantImpl.setProductionPlantEmail(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantEmail(productionPlantEmail);
		}

		if (productionPlantPhone == null) {
			vrProductionPlantImpl.setProductionPlantPhone(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantPhone(productionPlantPhone);
		}

		if (productionPlantFax == null) {
			vrProductionPlantImpl.setProductionPlantFax(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantFax(productionPlantFax);
		}

		if (productionPlantWebsite == null) {
			vrProductionPlantImpl.setProductionPlantWebsite(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantWebsite(productionPlantWebsite);
		}

		if (productionPlantRepresentativePhone == null) {
			vrProductionPlantImpl.setProductionPlantRepresentativePhone(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantRepresentativePhone(productionPlantRepresentativePhone);
		}

		if (productionPlantRepresentative == null) {
			vrProductionPlantImpl.setProductionPlantRepresentative(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantRepresentative(productionPlantRepresentative);
		}

		if (productionPlantRepresentativeTitle == null) {
			vrProductionPlantImpl.setProductionPlantRepresentativeTitle(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantRepresentativeTitle(productionPlantRepresentativeTitle);
		}

		if (productionPlantContactName == null) {
			vrProductionPlantImpl.setProductionPlantContactName(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantContactName(productionPlantContactName);
		}

		if (productionPlantContactEmail == null) {
			vrProductionPlantImpl.setProductionPlantContactEmail(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantContactEmail(productionPlantContactEmail);
		}

		if (productionPlantContactPhone == null) {
			vrProductionPlantImpl.setProductionPlantContactPhone(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantContactPhone(productionPlantContactPhone);
		}

		if (productionPlantType == null) {
			vrProductionPlantImpl.setProductionPlantType(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantType(productionPlantType);
		}

		if (productionPlantStatus == null) {
			vrProductionPlantImpl.setProductionPlantStatus(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantStatus(productionPlantStatus);
		}

		if (productionManufacture == null) {
			vrProductionPlantImpl.setProductionManufacture(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionManufacture(productionManufacture);
		}

		if (productionMaintainer == null) {
			vrProductionPlantImpl.setProductionMaintainer(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionMaintainer(productionMaintainer);
		}

		if (productionPlantIdentityNo == null) {
			vrProductionPlantImpl.setProductionPlantIdentityNo(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantIdentityNo(productionPlantIdentityNo);
		}

		if (productionPlantIdentityType == null) {
			vrProductionPlantImpl.setProductionPlantIdentityType(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantIdentityType(productionPlantIdentityType);
		}

		if (productionPlantIdentityDescription == null) {
			vrProductionPlantImpl.setProductionPlantIdentityDescription(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantIdentityDescription(productionPlantIdentityDescription);
		}

		vrProductionPlantImpl.setProductionPlantIdentityFileEntryId(productionPlantIdentityFileEntryId);

		if (productionPlantEmployeesNote == null) {
			vrProductionPlantImpl.setProductionPlantEmployeesNote(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantEmployeesNote(productionPlantEmployeesNote);
		}

		if (productionPlantEquipmentsNote == null) {
			vrProductionPlantImpl.setProductionPlantEquipmentsNote(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantEquipmentsNote(productionPlantEquipmentsNote);
		}

		if (productionPlantProdEquipmentsNote == null) {
			vrProductionPlantImpl.setProductionPlantProdEquipmentsNote(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantProdEquipmentsNote(productionPlantProdEquipmentsNote);
		}

		if (productionIdentityFileName == null) {
			vrProductionPlantImpl.setProductionIdentityFileName(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionIdentityFileName(productionIdentityFileName);
		}

		vrProductionPlantImpl.setProductionIdentityFileEntryId(productionIdentityFileEntryId);

		if (applicantCode == null) {
			vrProductionPlantImpl.setApplicantCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setApplicantCode(applicantCode);
		}

		if (supplierName == null) {
			vrProductionPlantImpl.setSupplierName(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setSupplierName(supplierName);
		}

		if (supplierAddress == null) {
			vrProductionPlantImpl.setSupplierAddress(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setSupplierAddress(supplierAddress);
		}

		if (corporationCode == null) {
			vrProductionPlantImpl.setCorporationCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setCorporationCode(corporationCode);
		}

		if (corporationName == null) {
			vrProductionPlantImpl.setCorporationName(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setCorporationName(corporationName);
		}

		if (corporationAddress == null) {
			vrProductionPlantImpl.setCorporationAddress(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setCorporationAddress(corporationAddress);
		}

		if (productionPlantMetadata == null) {
			vrProductionPlantImpl.setProductionPlantMetadata(StringPool.BLANK);
		}
		else {
			vrProductionPlantImpl.setProductionPlantMetadata(productionPlantMetadata);
		}

		vrProductionPlantImpl.setRegistrationId(registrationId);
		vrProductionPlantImpl.setRegistrationFormId(registrationFormId);
		vrProductionPlantImpl.setApplicantProfileId(applicantProfileId);
		vrProductionPlantImpl.setSupplierId(supplierId);

		if (modifyDate == Long.MIN_VALUE) {
			vrProductionPlantImpl.setModifyDate(null);
		}
		else {
			vrProductionPlantImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrProductionPlantImpl.setSyncDate(null);
		}
		else {
			vrProductionPlantImpl.setSyncDate(new Date(syncDate));
		}

		vrProductionPlantImpl.resetOriginalValues();

		return vrProductionPlantImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();
		mappingMA_CTY = objectInput.readUTF();
		mappingTEN_CTY = objectInput.readUTF();
		mappingDIA_CHI_CTY = objectInput.readUTF();
		mappingMA_XUONG_LR = objectInput.readUTF();
		mappingTEN_XUONG_LR = objectInput.readUTF();
		mappingDIA_CHI_XUONG_LR = objectInput.readUTF();
		mappingNote = objectInput.readUTF();
		mappingStatus = objectInput.readUTF();
		productionPlantCode = objectInput.readUTF();
		productionPlantName = objectInput.readUTF();
		productionPlantAddress = objectInput.readUTF();
		productionPlantRegion = objectInput.readUTF();
		productionPlantRegionCode = objectInput.readUTF();
		productionPlantStateCode = objectInput.readUTF();
		productionPlantStateName = objectInput.readUTF();
		productionPlantProvinceCode = objectInput.readUTF();
		productionPlantProvinceName = objectInput.readUTF();
		productionPlantDistrictCode = objectInput.readUTF();
		productionPlantDistrictName = objectInput.readUTF();
		productionPlantWardCode = objectInput.readUTF();
		productionPlantWardName = objectInput.readUTF();
		productionPlantEmail = objectInput.readUTF();
		productionPlantPhone = objectInput.readUTF();
		productionPlantFax = objectInput.readUTF();
		productionPlantWebsite = objectInput.readUTF();
		productionPlantRepresentativePhone = objectInput.readUTF();
		productionPlantRepresentative = objectInput.readUTF();
		productionPlantRepresentativeTitle = objectInput.readUTF();
		productionPlantContactName = objectInput.readUTF();
		productionPlantContactEmail = objectInput.readUTF();
		productionPlantContactPhone = objectInput.readUTF();
		productionPlantType = objectInput.readUTF();
		productionPlantStatus = objectInput.readUTF();
		productionManufacture = objectInput.readUTF();
		productionMaintainer = objectInput.readUTF();
		productionPlantIdentityNo = objectInput.readUTF();
		productionPlantIdentityType = objectInput.readUTF();
		productionPlantIdentityDescription = objectInput.readUTF();

		productionPlantIdentityFileEntryId = objectInput.readLong();
		productionPlantEmployeesNote = objectInput.readUTF();
		productionPlantEquipmentsNote = objectInput.readUTF();
		productionPlantProdEquipmentsNote = objectInput.readUTF();
		productionIdentityFileName = objectInput.readUTF();

		productionIdentityFileEntryId = objectInput.readLong();
		applicantCode = objectInput.readUTF();
		supplierName = objectInput.readUTF();
		supplierAddress = objectInput.readUTF();
		corporationCode = objectInput.readUTF();
		corporationName = objectInput.readUTF();
		corporationAddress = objectInput.readUTF();
		productionPlantMetadata = objectInput.readUTF();

		registrationId = objectInput.readLong();

		registrationFormId = objectInput.readLong();

		applicantProfileId = objectInput.readLong();

		supplierId = objectInput.readLong();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		if (mappingMA_CTY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mappingMA_CTY);
		}

		if (mappingTEN_CTY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mappingTEN_CTY);
		}

		if (mappingDIA_CHI_CTY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mappingDIA_CHI_CTY);
		}

		if (mappingMA_XUONG_LR == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mappingMA_XUONG_LR);
		}

		if (mappingTEN_XUONG_LR == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mappingTEN_XUONG_LR);
		}

		if (mappingDIA_CHI_XUONG_LR == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mappingDIA_CHI_XUONG_LR);
		}

		if (mappingNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mappingNote);
		}

		if (mappingStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mappingStatus);
		}

		if (productionPlantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantCode);
		}

		if (productionPlantName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantName);
		}

		if (productionPlantAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantAddress);
		}

		if (productionPlantRegion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantRegion);
		}

		if (productionPlantRegionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantRegionCode);
		}

		if (productionPlantStateCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantStateCode);
		}

		if (productionPlantStateName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantStateName);
		}

		if (productionPlantProvinceCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantProvinceCode);
		}

		if (productionPlantProvinceName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantProvinceName);
		}

		if (productionPlantDistrictCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantDistrictCode);
		}

		if (productionPlantDistrictName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantDistrictName);
		}

		if (productionPlantWardCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantWardCode);
		}

		if (productionPlantWardName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantWardName);
		}

		if (productionPlantEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantEmail);
		}

		if (productionPlantPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantPhone);
		}

		if (productionPlantFax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantFax);
		}

		if (productionPlantWebsite == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantWebsite);
		}

		if (productionPlantRepresentativePhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantRepresentativePhone);
		}

		if (productionPlantRepresentative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantRepresentative);
		}

		if (productionPlantRepresentativeTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantRepresentativeTitle);
		}

		if (productionPlantContactName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantContactName);
		}

		if (productionPlantContactEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantContactEmail);
		}

		if (productionPlantContactPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantContactPhone);
		}

		if (productionPlantType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantType);
		}

		if (productionPlantStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantStatus);
		}

		if (productionManufacture == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionManufacture);
		}

		if (productionMaintainer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionMaintainer);
		}

		if (productionPlantIdentityNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantIdentityNo);
		}

		if (productionPlantIdentityType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantIdentityType);
		}

		if (productionPlantIdentityDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantIdentityDescription);
		}

		objectOutput.writeLong(productionPlantIdentityFileEntryId);

		if (productionPlantEmployeesNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantEmployeesNote);
		}

		if (productionPlantEquipmentsNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantEquipmentsNote);
		}

		if (productionPlantProdEquipmentsNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantProdEquipmentsNote);
		}

		if (productionIdentityFileName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionIdentityFileName);
		}

		objectOutput.writeLong(productionIdentityFileEntryId);

		if (applicantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantCode);
		}

		if (supplierName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(supplierName);
		}

		if (supplierAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(supplierAddress);
		}

		if (corporationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationCode);
		}

		if (corporationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationName);
		}

		if (corporationAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationAddress);
		}

		if (productionPlantMetadata == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantMetadata);
		}

		objectOutput.writeLong(registrationId);

		objectOutput.writeLong(registrationFormId);

		objectOutput.writeLong(applicantProfileId);

		objectOutput.writeLong(supplierId);
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public String mappingMA_CTY;
	public String mappingTEN_CTY;
	public String mappingDIA_CHI_CTY;
	public String mappingMA_XUONG_LR;
	public String mappingTEN_XUONG_LR;
	public String mappingDIA_CHI_XUONG_LR;
	public String mappingNote;
	public String mappingStatus;
	public String productionPlantCode;
	public String productionPlantName;
	public String productionPlantAddress;
	public String productionPlantRegion;
	public String productionPlantRegionCode;
	public String productionPlantStateCode;
	public String productionPlantStateName;
	public String productionPlantProvinceCode;
	public String productionPlantProvinceName;
	public String productionPlantDistrictCode;
	public String productionPlantDistrictName;
	public String productionPlantWardCode;
	public String productionPlantWardName;
	public String productionPlantEmail;
	public String productionPlantPhone;
	public String productionPlantFax;
	public String productionPlantWebsite;
	public String productionPlantRepresentativePhone;
	public String productionPlantRepresentative;
	public String productionPlantRepresentativeTitle;
	public String productionPlantContactName;
	public String productionPlantContactEmail;
	public String productionPlantContactPhone;
	public String productionPlantType;
	public String productionPlantStatus;
	public String productionManufacture;
	public String productionMaintainer;
	public String productionPlantIdentityNo;
	public String productionPlantIdentityType;
	public String productionPlantIdentityDescription;
	public long productionPlantIdentityFileEntryId;
	public String productionPlantEmployeesNote;
	public String productionPlantEquipmentsNote;
	public String productionPlantProdEquipmentsNote;
	public String productionIdentityFileName;
	public long productionIdentityFileEntryId;
	public String applicantCode;
	public String supplierName;
	public String supplierAddress;
	public String corporationCode;
	public String corporationName;
	public String corporationAddress;
	public String productionPlantMetadata;
	public long registrationId;
	public long registrationFormId;
	public long applicantProfileId;
	public long supplierId;
	public long modifyDate;
	public long syncDate;
}