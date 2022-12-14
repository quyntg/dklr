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
 * The base model interface for the VRProductionPlant service. Represents a row in the &quot;vr_productionplant&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRProductionPlantModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRProductionPlantImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlant
 * @see com.fds.vr.business.model.impl.VRProductionPlantImpl
 * @see com.fds.vr.business.model.impl.VRProductionPlantModelImpl
 * @generated
 */
@ProviderType
public interface VRProductionPlantModel extends BaseModel<VRProductionPlant> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr production plant model instance should use the {@link VRProductionPlant} interface instead.
	 */

	/**
	 * Returns the primary key of this vr production plant.
	 *
	 * @return the primary key of this vr production plant
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr production plant.
	 *
	 * @param primaryKey the primary key of this vr production plant
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr production plant.
	 *
	 * @return the ID of this vr production plant
	 */
	public long getId();

	/**
	 * Sets the ID of this vr production plant.
	 *
	 * @param id the ID of this vr production plant
	 */
	public void setId(long id);

	/**
	 * Returns the mt core of this vr production plant.
	 *
	 * @return the mt core of this vr production plant
	 */
	public long getMtCore();

	/**
	 * Sets the mt core of this vr production plant.
	 *
	 * @param mtCore the mt core of this vr production plant
	 */
	public void setMtCore(long mtCore);

	/**
	 * Returns the mapping ma_cty of this vr production plant.
	 *
	 * @return the mapping ma_cty of this vr production plant
	 */
	@AutoEscape
	public String getMappingMA_CTY();

	/**
	 * Sets the mapping ma_cty of this vr production plant.
	 *
	 * @param mappingMA_CTY the mapping ma_cty of this vr production plant
	 */
	public void setMappingMA_CTY(String mappingMA_CTY);

	/**
	 * Returns the mapping ten_cty of this vr production plant.
	 *
	 * @return the mapping ten_cty of this vr production plant
	 */
	@AutoEscape
	public String getMappingTEN_CTY();

	/**
	 * Sets the mapping ten_cty of this vr production plant.
	 *
	 * @param mappingTEN_CTY the mapping ten_cty of this vr production plant
	 */
	public void setMappingTEN_CTY(String mappingTEN_CTY);

	/**
	 * Returns the mapping dia_chi_cty of this vr production plant.
	 *
	 * @return the mapping dia_chi_cty of this vr production plant
	 */
	@AutoEscape
	public String getMappingDIA_CHI_CTY();

	/**
	 * Sets the mapping dia_chi_cty of this vr production plant.
	 *
	 * @param mappingDIA_CHI_CTY the mapping dia_chi_cty of this vr production plant
	 */
	public void setMappingDIA_CHI_CTY(String mappingDIA_CHI_CTY);

	/**
	 * Returns the mapping ma_xuong_lr of this vr production plant.
	 *
	 * @return the mapping ma_xuong_lr of this vr production plant
	 */
	@AutoEscape
	public String getMappingMA_XUONG_LR();

	/**
	 * Sets the mapping ma_xuong_lr of this vr production plant.
	 *
	 * @param mappingMA_XUONG_LR the mapping ma_xuong_lr of this vr production plant
	 */
	public void setMappingMA_XUONG_LR(String mappingMA_XUONG_LR);

	/**
	 * Returns the mapping ten_xuong_lr of this vr production plant.
	 *
	 * @return the mapping ten_xuong_lr of this vr production plant
	 */
	@AutoEscape
	public String getMappingTEN_XUONG_LR();

	/**
	 * Sets the mapping ten_xuong_lr of this vr production plant.
	 *
	 * @param mappingTEN_XUONG_LR the mapping ten_xuong_lr of this vr production plant
	 */
	public void setMappingTEN_XUONG_LR(String mappingTEN_XUONG_LR);

	/**
	 * Returns the mapping dia_chi_xuong_lr of this vr production plant.
	 *
	 * @return the mapping dia_chi_xuong_lr of this vr production plant
	 */
	@AutoEscape
	public String getMappingDIA_CHI_XUONG_LR();

	/**
	 * Sets the mapping dia_chi_xuong_lr of this vr production plant.
	 *
	 * @param mappingDIA_CHI_XUONG_LR the mapping dia_chi_xuong_lr of this vr production plant
	 */
	public void setMappingDIA_CHI_XUONG_LR(String mappingDIA_CHI_XUONG_LR);

	/**
	 * Returns the mapping note of this vr production plant.
	 *
	 * @return the mapping note of this vr production plant
	 */
	@AutoEscape
	public String getMappingNote();

	/**
	 * Sets the mapping note of this vr production plant.
	 *
	 * @param mappingNote the mapping note of this vr production plant
	 */
	public void setMappingNote(String mappingNote);

	/**
	 * Returns the mapping status of this vr production plant.
	 *
	 * @return the mapping status of this vr production plant
	 */
	@AutoEscape
	public String getMappingStatus();

	/**
	 * Sets the mapping status of this vr production plant.
	 *
	 * @param mappingStatus the mapping status of this vr production plant
	 */
	public void setMappingStatus(String mappingStatus);

	/**
	 * Returns the production plant code of this vr production plant.
	 *
	 * @return the production plant code of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantCode();

	/**
	 * Sets the production plant code of this vr production plant.
	 *
	 * @param productionPlantCode the production plant code of this vr production plant
	 */
	public void setProductionPlantCode(String productionPlantCode);

	/**
	 * Returns the production plant name of this vr production plant.
	 *
	 * @return the production plant name of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantName();

	/**
	 * Sets the production plant name of this vr production plant.
	 *
	 * @param productionPlantName the production plant name of this vr production plant
	 */
	public void setProductionPlantName(String productionPlantName);

	/**
	 * Returns the production plant address of this vr production plant.
	 *
	 * @return the production plant address of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantAddress();

	/**
	 * Sets the production plant address of this vr production plant.
	 *
	 * @param productionPlantAddress the production plant address of this vr production plant
	 */
	public void setProductionPlantAddress(String productionPlantAddress);

	/**
	 * Returns the production plant region of this vr production plant.
	 *
	 * @return the production plant region of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantRegion();

	/**
	 * Sets the production plant region of this vr production plant.
	 *
	 * @param productionPlantRegion the production plant region of this vr production plant
	 */
	public void setProductionPlantRegion(String productionPlantRegion);

	/**
	 * Returns the production plant region code of this vr production plant.
	 *
	 * @return the production plant region code of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantRegionCode();

	/**
	 * Sets the production plant region code of this vr production plant.
	 *
	 * @param productionPlantRegionCode the production plant region code of this vr production plant
	 */
	public void setProductionPlantRegionCode(String productionPlantRegionCode);

	/**
	 * Returns the production plant state code of this vr production plant.
	 *
	 * @return the production plant state code of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantStateCode();

	/**
	 * Sets the production plant state code of this vr production plant.
	 *
	 * @param productionPlantStateCode the production plant state code of this vr production plant
	 */
	public void setProductionPlantStateCode(String productionPlantStateCode);

	/**
	 * Returns the production plant state name of this vr production plant.
	 *
	 * @return the production plant state name of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantStateName();

	/**
	 * Sets the production plant state name of this vr production plant.
	 *
	 * @param productionPlantStateName the production plant state name of this vr production plant
	 */
	public void setProductionPlantStateName(String productionPlantStateName);

	/**
	 * Returns the production plant province code of this vr production plant.
	 *
	 * @return the production plant province code of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantProvinceCode();

	/**
	 * Sets the production plant province code of this vr production plant.
	 *
	 * @param productionPlantProvinceCode the production plant province code of this vr production plant
	 */
	public void setProductionPlantProvinceCode(
		String productionPlantProvinceCode);

	/**
	 * Returns the production plant province name of this vr production plant.
	 *
	 * @return the production plant province name of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantProvinceName();

	/**
	 * Sets the production plant province name of this vr production plant.
	 *
	 * @param productionPlantProvinceName the production plant province name of this vr production plant
	 */
	public void setProductionPlantProvinceName(
		String productionPlantProvinceName);

	/**
	 * Returns the production plant district code of this vr production plant.
	 *
	 * @return the production plant district code of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantDistrictCode();

	/**
	 * Sets the production plant district code of this vr production plant.
	 *
	 * @param productionPlantDistrictCode the production plant district code of this vr production plant
	 */
	public void setProductionPlantDistrictCode(
		String productionPlantDistrictCode);

	/**
	 * Returns the production plant district name of this vr production plant.
	 *
	 * @return the production plant district name of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantDistrictName();

	/**
	 * Sets the production plant district name of this vr production plant.
	 *
	 * @param productionPlantDistrictName the production plant district name of this vr production plant
	 */
	public void setProductionPlantDistrictName(
		String productionPlantDistrictName);

	/**
	 * Returns the production plant ward code of this vr production plant.
	 *
	 * @return the production plant ward code of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantWardCode();

	/**
	 * Sets the production plant ward code of this vr production plant.
	 *
	 * @param productionPlantWardCode the production plant ward code of this vr production plant
	 */
	public void setProductionPlantWardCode(String productionPlantWardCode);

	/**
	 * Returns the production plant ward name of this vr production plant.
	 *
	 * @return the production plant ward name of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantWardName();

	/**
	 * Sets the production plant ward name of this vr production plant.
	 *
	 * @param productionPlantWardName the production plant ward name of this vr production plant
	 */
	public void setProductionPlantWardName(String productionPlantWardName);

	/**
	 * Returns the production plant email of this vr production plant.
	 *
	 * @return the production plant email of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantEmail();

	/**
	 * Sets the production plant email of this vr production plant.
	 *
	 * @param productionPlantEmail the production plant email of this vr production plant
	 */
	public void setProductionPlantEmail(String productionPlantEmail);

	/**
	 * Returns the production plant phone of this vr production plant.
	 *
	 * @return the production plant phone of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantPhone();

	/**
	 * Sets the production plant phone of this vr production plant.
	 *
	 * @param productionPlantPhone the production plant phone of this vr production plant
	 */
	public void setProductionPlantPhone(String productionPlantPhone);

	/**
	 * Returns the production plant fax of this vr production plant.
	 *
	 * @return the production plant fax of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantFax();

	/**
	 * Sets the production plant fax of this vr production plant.
	 *
	 * @param productionPlantFax the production plant fax of this vr production plant
	 */
	public void setProductionPlantFax(String productionPlantFax);

	/**
	 * Returns the production plant website of this vr production plant.
	 *
	 * @return the production plant website of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantWebsite();

	/**
	 * Sets the production plant website of this vr production plant.
	 *
	 * @param productionPlantWebsite the production plant website of this vr production plant
	 */
	public void setProductionPlantWebsite(String productionPlantWebsite);

	/**
	 * Returns the production plant representative phone of this vr production plant.
	 *
	 * @return the production plant representative phone of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantRepresentativePhone();

	/**
	 * Sets the production plant representative phone of this vr production plant.
	 *
	 * @param productionPlantRepresentativePhone the production plant representative phone of this vr production plant
	 */
	public void setProductionPlantRepresentativePhone(
		String productionPlantRepresentativePhone);

	/**
	 * Returns the production plant representative of this vr production plant.
	 *
	 * @return the production plant representative of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantRepresentative();

	/**
	 * Sets the production plant representative of this vr production plant.
	 *
	 * @param productionPlantRepresentative the production plant representative of this vr production plant
	 */
	public void setProductionPlantRepresentative(
		String productionPlantRepresentative);

	/**
	 * Returns the production plant representative title of this vr production plant.
	 *
	 * @return the production plant representative title of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantRepresentativeTitle();

	/**
	 * Sets the production plant representative title of this vr production plant.
	 *
	 * @param productionPlantRepresentativeTitle the production plant representative title of this vr production plant
	 */
	public void setProductionPlantRepresentativeTitle(
		String productionPlantRepresentativeTitle);

	/**
	 * Returns the production plant contact name of this vr production plant.
	 *
	 * @return the production plant contact name of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantContactName();

	/**
	 * Sets the production plant contact name of this vr production plant.
	 *
	 * @param productionPlantContactName the production plant contact name of this vr production plant
	 */
	public void setProductionPlantContactName(String productionPlantContactName);

	/**
	 * Returns the production plant contact email of this vr production plant.
	 *
	 * @return the production plant contact email of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantContactEmail();

	/**
	 * Sets the production plant contact email of this vr production plant.
	 *
	 * @param productionPlantContactEmail the production plant contact email of this vr production plant
	 */
	public void setProductionPlantContactEmail(
		String productionPlantContactEmail);

	/**
	 * Returns the production plant contact phone of this vr production plant.
	 *
	 * @return the production plant contact phone of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantContactPhone();

	/**
	 * Sets the production plant contact phone of this vr production plant.
	 *
	 * @param productionPlantContactPhone the production plant contact phone of this vr production plant
	 */
	public void setProductionPlantContactPhone(
		String productionPlantContactPhone);

	/**
	 * Returns the production plant type of this vr production plant.
	 *
	 * @return the production plant type of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantType();

	/**
	 * Sets the production plant type of this vr production plant.
	 *
	 * @param productionPlantType the production plant type of this vr production plant
	 */
	public void setProductionPlantType(String productionPlantType);

	/**
	 * Returns the production plant status of this vr production plant.
	 *
	 * @return the production plant status of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantStatus();

	/**
	 * Sets the production plant status of this vr production plant.
	 *
	 * @param productionPlantStatus the production plant status of this vr production plant
	 */
	public void setProductionPlantStatus(String productionPlantStatus);

	/**
	 * Returns the production manufacture of this vr production plant.
	 *
	 * @return the production manufacture of this vr production plant
	 */
	@AutoEscape
	public String getProductionManufacture();

	/**
	 * Sets the production manufacture of this vr production plant.
	 *
	 * @param productionManufacture the production manufacture of this vr production plant
	 */
	public void setProductionManufacture(String productionManufacture);

	/**
	 * Returns the production maintainer of this vr production plant.
	 *
	 * @return the production maintainer of this vr production plant
	 */
	@AutoEscape
	public String getProductionMaintainer();

	/**
	 * Sets the production maintainer of this vr production plant.
	 *
	 * @param productionMaintainer the production maintainer of this vr production plant
	 */
	public void setProductionMaintainer(String productionMaintainer);

	/**
	 * Returns the production plant identity no of this vr production plant.
	 *
	 * @return the production plant identity no of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantIdentityNo();

	/**
	 * Sets the production plant identity no of this vr production plant.
	 *
	 * @param productionPlantIdentityNo the production plant identity no of this vr production plant
	 */
	public void setProductionPlantIdentityNo(String productionPlantIdentityNo);

	/**
	 * Returns the production plant identity type of this vr production plant.
	 *
	 * @return the production plant identity type of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantIdentityType();

	/**
	 * Sets the production plant identity type of this vr production plant.
	 *
	 * @param productionPlantIdentityType the production plant identity type of this vr production plant
	 */
	public void setProductionPlantIdentityType(
		String productionPlantIdentityType);

	/**
	 * Returns the production plant identity description of this vr production plant.
	 *
	 * @return the production plant identity description of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantIdentityDescription();

	/**
	 * Sets the production plant identity description of this vr production plant.
	 *
	 * @param productionPlantIdentityDescription the production plant identity description of this vr production plant
	 */
	public void setProductionPlantIdentityDescription(
		String productionPlantIdentityDescription);

	/**
	 * Returns the production plant identity file entry ID of this vr production plant.
	 *
	 * @return the production plant identity file entry ID of this vr production plant
	 */
	public long getProductionPlantIdentityFileEntryId();

	/**
	 * Sets the production plant identity file entry ID of this vr production plant.
	 *
	 * @param productionPlantIdentityFileEntryId the production plant identity file entry ID of this vr production plant
	 */
	public void setProductionPlantIdentityFileEntryId(
		long productionPlantIdentityFileEntryId);

	/**
	 * Returns the production plant employees note of this vr production plant.
	 *
	 * @return the production plant employees note of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantEmployeesNote();

	/**
	 * Sets the production plant employees note of this vr production plant.
	 *
	 * @param productionPlantEmployeesNote the production plant employees note of this vr production plant
	 */
	public void setProductionPlantEmployeesNote(
		String productionPlantEmployeesNote);

	/**
	 * Returns the production plant equipments note of this vr production plant.
	 *
	 * @return the production plant equipments note of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantEquipmentsNote();

	/**
	 * Sets the production plant equipments note of this vr production plant.
	 *
	 * @param productionPlantEquipmentsNote the production plant equipments note of this vr production plant
	 */
	public void setProductionPlantEquipmentsNote(
		String productionPlantEquipmentsNote);

	/**
	 * Returns the production plant prod equipments note of this vr production plant.
	 *
	 * @return the production plant prod equipments note of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantProdEquipmentsNote();

	/**
	 * Sets the production plant prod equipments note of this vr production plant.
	 *
	 * @param productionPlantProdEquipmentsNote the production plant prod equipments note of this vr production plant
	 */
	public void setProductionPlantProdEquipmentsNote(
		String productionPlantProdEquipmentsNote);

	/**
	 * Returns the production identity file name of this vr production plant.
	 *
	 * @return the production identity file name of this vr production plant
	 */
	@AutoEscape
	public String getProductionIdentityFileName();

	/**
	 * Sets the production identity file name of this vr production plant.
	 *
	 * @param productionIdentityFileName the production identity file name of this vr production plant
	 */
	public void setProductionIdentityFileName(String productionIdentityFileName);

	/**
	 * Returns the production identity file entry ID of this vr production plant.
	 *
	 * @return the production identity file entry ID of this vr production plant
	 */
	public long getProductionIdentityFileEntryId();

	/**
	 * Sets the production identity file entry ID of this vr production plant.
	 *
	 * @param productionIdentityFileEntryId the production identity file entry ID of this vr production plant
	 */
	public void setProductionIdentityFileEntryId(
		long productionIdentityFileEntryId);

	/**
	 * Returns the applicant code of this vr production plant.
	 *
	 * @return the applicant code of this vr production plant
	 */
	@AutoEscape
	public String getApplicantCode();

	/**
	 * Sets the applicant code of this vr production plant.
	 *
	 * @param applicantCode the applicant code of this vr production plant
	 */
	public void setApplicantCode(String applicantCode);

	/**
	 * Returns the supplier name of this vr production plant.
	 *
	 * @return the supplier name of this vr production plant
	 */
	@AutoEscape
	public String getSupplierName();

	/**
	 * Sets the supplier name of this vr production plant.
	 *
	 * @param supplierName the supplier name of this vr production plant
	 */
	public void setSupplierName(String supplierName);

	/**
	 * Returns the supplier address of this vr production plant.
	 *
	 * @return the supplier address of this vr production plant
	 */
	@AutoEscape
	public String getSupplierAddress();

	/**
	 * Sets the supplier address of this vr production plant.
	 *
	 * @param supplierAddress the supplier address of this vr production plant
	 */
	public void setSupplierAddress(String supplierAddress);

	/**
	 * Returns the corporation code of this vr production plant.
	 *
	 * @return the corporation code of this vr production plant
	 */
	@AutoEscape
	public String getCorporationCode();

	/**
	 * Sets the corporation code of this vr production plant.
	 *
	 * @param corporationCode the corporation code of this vr production plant
	 */
	public void setCorporationCode(String corporationCode);

	/**
	 * Returns the corporation name of this vr production plant.
	 *
	 * @return the corporation name of this vr production plant
	 */
	@AutoEscape
	public String getCorporationName();

	/**
	 * Sets the corporation name of this vr production plant.
	 *
	 * @param corporationName the corporation name of this vr production plant
	 */
	public void setCorporationName(String corporationName);

	/**
	 * Returns the corporation address of this vr production plant.
	 *
	 * @return the corporation address of this vr production plant
	 */
	@AutoEscape
	public String getCorporationAddress();

	/**
	 * Sets the corporation address of this vr production plant.
	 *
	 * @param corporationAddress the corporation address of this vr production plant
	 */
	public void setCorporationAddress(String corporationAddress);

	/**
	 * Returns the production plant metadata of this vr production plant.
	 *
	 * @return the production plant metadata of this vr production plant
	 */
	@AutoEscape
	public String getProductionPlantMetadata();

	/**
	 * Sets the production plant metadata of this vr production plant.
	 *
	 * @param productionPlantMetadata the production plant metadata of this vr production plant
	 */
	public void setProductionPlantMetadata(String productionPlantMetadata);

	/**
	 * Returns the registration ID of this vr production plant.
	 *
	 * @return the registration ID of this vr production plant
	 */
	public long getRegistrationId();

	/**
	 * Sets the registration ID of this vr production plant.
	 *
	 * @param registrationId the registration ID of this vr production plant
	 */
	public void setRegistrationId(long registrationId);

	/**
	 * Returns the registration form ID of this vr production plant.
	 *
	 * @return the registration form ID of this vr production plant
	 */
	public long getRegistrationFormId();

	/**
	 * Sets the registration form ID of this vr production plant.
	 *
	 * @param registrationFormId the registration form ID of this vr production plant
	 */
	public void setRegistrationFormId(long registrationFormId);

	/**
	 * Returns the applicant profile ID of this vr production plant.
	 *
	 * @return the applicant profile ID of this vr production plant
	 */
	public long getApplicantProfileId();

	/**
	 * Sets the applicant profile ID of this vr production plant.
	 *
	 * @param applicantProfileId the applicant profile ID of this vr production plant
	 */
	public void setApplicantProfileId(long applicantProfileId);

	/**
	 * Returns the supplier ID of this vr production plant.
	 *
	 * @return the supplier ID of this vr production plant
	 */
	public long getSupplierId();

	/**
	 * Sets the supplier ID of this vr production plant.
	 *
	 * @param supplierId the supplier ID of this vr production plant
	 */
	public void setSupplierId(long supplierId);

	/**
	 * Returns the modify date of this vr production plant.
	 *
	 * @return the modify date of this vr production plant
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vr production plant.
	 *
	 * @param modifyDate the modify date of this vr production plant
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vr production plant.
	 *
	 * @return the sync date of this vr production plant
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vr production plant.
	 *
	 * @param syncDate the sync date of this vr production plant
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
	public int compareTo(VRProductionPlant vrProductionPlant);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRProductionPlant> toCacheModel();

	@Override
	public VRProductionPlant toEscapedModel();

	@Override
	public VRProductionPlant toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}