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
 * The base model interface for the VRApplicantProfile service. Represents a row in the &quot;vr_applicantprofile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRApplicantProfileModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRApplicantProfileImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRApplicantProfile
 * @see com.fds.vr.business.model.impl.VRApplicantProfileImpl
 * @see com.fds.vr.business.model.impl.VRApplicantProfileModelImpl
 * @generated
 */
@ProviderType
public interface VRApplicantProfileModel extends BaseModel<VRApplicantProfile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr applicant profile model instance should use the {@link VRApplicantProfile} interface instead.
	 */

	/**
	 * Returns the primary key of this vr applicant profile.
	 *
	 * @return the primary key of this vr applicant profile
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr applicant profile.
	 *
	 * @param primaryKey the primary key of this vr applicant profile
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr applicant profile.
	 *
	 * @return the ID of this vr applicant profile
	 */
	public long getId();

	/**
	 * Sets the ID of this vr applicant profile.
	 *
	 * @param id the ID of this vr applicant profile
	 */
	public void setId(long id);

	/**
	 * Returns the mt core of this vr applicant profile.
	 *
	 * @return the mt core of this vr applicant profile
	 */
	public long getMtCore();

	/**
	 * Sets the mt core of this vr applicant profile.
	 *
	 * @param mtCore the mt core of this vr applicant profile
	 */
	public void setMtCore(long mtCore);

	/**
	 * Returns the mapping ma_cty of this vr applicant profile.
	 *
	 * @return the mapping ma_cty of this vr applicant profile
	 */
	@AutoEscape
	public String getMappingMA_CTY();

	/**
	 * Sets the mapping ma_cty of this vr applicant profile.
	 *
	 * @param mappingMA_CTY the mapping ma_cty of this vr applicant profile
	 */
	public void setMappingMA_CTY(String mappingMA_CTY);

	/**
	 * Returns the mapping ten_cty of this vr applicant profile.
	 *
	 * @return the mapping ten_cty of this vr applicant profile
	 */
	@AutoEscape
	public String getMappingTEN_CTY();

	/**
	 * Sets the mapping ten_cty of this vr applicant profile.
	 *
	 * @param mappingTEN_CTY the mapping ten_cty of this vr applicant profile
	 */
	public void setMappingTEN_CTY(String mappingTEN_CTY);

	/**
	 * Returns the mapping dia_chi_cty of this vr applicant profile.
	 *
	 * @return the mapping dia_chi_cty of this vr applicant profile
	 */
	@AutoEscape
	public String getMappingDIA_CHI_CTY();

	/**
	 * Sets the mapping dia_chi_cty of this vr applicant profile.
	 *
	 * @param mappingDIA_CHI_CTY the mapping dia_chi_cty of this vr applicant profile
	 */
	public void setMappingDIA_CHI_CTY(String mappingDIA_CHI_CTY);

	/**
	 * Returns the mapping note of this vr applicant profile.
	 *
	 * @return the mapping note of this vr applicant profile
	 */
	@AutoEscape
	public String getMappingNote();

	/**
	 * Sets the mapping note of this vr applicant profile.
	 *
	 * @param mappingNote the mapping note of this vr applicant profile
	 */
	public void setMappingNote(String mappingNote);

	/**
	 * Returns the mapping status of this vr applicant profile.
	 *
	 * @return the mapping status of this vr applicant profile
	 */
	@AutoEscape
	public String getMappingStatus();

	/**
	 * Sets the mapping status of this vr applicant profile.
	 *
	 * @param mappingStatus the mapping status of this vr applicant profile
	 */
	public void setMappingStatus(String mappingStatus);

	/**
	 * Returns the applicant code of this vr applicant profile.
	 *
	 * @return the applicant code of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantCode();

	/**
	 * Sets the applicant code of this vr applicant profile.
	 *
	 * @param applicantCode the applicant code of this vr applicant profile
	 */
	public void setApplicantCode(String applicantCode);

	/**
	 * Returns the applicant name of this vr applicant profile.
	 *
	 * @return the applicant name of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantName();

	/**
	 * Sets the applicant name of this vr applicant profile.
	 *
	 * @param applicantName the applicant name of this vr applicant profile
	 */
	public void setApplicantName(String applicantName);

	/**
	 * Returns the applicant address of this vr applicant profile.
	 *
	 * @return the applicant address of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantAddress();

	/**
	 * Sets the applicant address of this vr applicant profile.
	 *
	 * @param applicantAddress the applicant address of this vr applicant profile
	 */
	public void setApplicantAddress(String applicantAddress);

	/**
	 * Returns the applicant phone of this vr applicant profile.
	 *
	 * @return the applicant phone of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantPhone();

	/**
	 * Sets the applicant phone of this vr applicant profile.
	 *
	 * @param applicantPhone the applicant phone of this vr applicant profile
	 */
	public void setApplicantPhone(String applicantPhone);

	/**
	 * Returns the applicant email of this vr applicant profile.
	 *
	 * @return the applicant email of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantEmail();

	/**
	 * Sets the applicant email of this vr applicant profile.
	 *
	 * @param applicantEmail the applicant email of this vr applicant profile
	 */
	public void setApplicantEmail(String applicantEmail);

	/**
	 * Returns the applicant fax of this vr applicant profile.
	 *
	 * @return the applicant fax of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantFax();

	/**
	 * Sets the applicant fax of this vr applicant profile.
	 *
	 * @param applicantFax the applicant fax of this vr applicant profile
	 */
	public void setApplicantFax(String applicantFax);

	/**
	 * Returns the applicant website of this vr applicant profile.
	 *
	 * @return the applicant website of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantWebsite();

	/**
	 * Sets the applicant website of this vr applicant profile.
	 *
	 * @param applicantWebsite the applicant website of this vr applicant profile
	 */
	public void setApplicantWebsite(String applicantWebsite);

	/**
	 * Returns the applicant representative phone of this vr applicant profile.
	 *
	 * @return the applicant representative phone of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantRepresentativePhone();

	/**
	 * Sets the applicant representative phone of this vr applicant profile.
	 *
	 * @param applicantRepresentativePhone the applicant representative phone of this vr applicant profile
	 */
	public void setApplicantRepresentativePhone(
		String applicantRepresentativePhone);

	/**
	 * Returns the applicant representative of this vr applicant profile.
	 *
	 * @return the applicant representative of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantRepresentative();

	/**
	 * Sets the applicant representative of this vr applicant profile.
	 *
	 * @param applicantRepresentative the applicant representative of this vr applicant profile
	 */
	public void setApplicantRepresentative(String applicantRepresentative);

	/**
	 * Returns the applicant representative title of this vr applicant profile.
	 *
	 * @return the applicant representative title of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantRepresentativeTitle();

	/**
	 * Sets the applicant representative title of this vr applicant profile.
	 *
	 * @param applicantRepresentativeTitle the applicant representative title of this vr applicant profile
	 */
	public void setApplicantRepresentativeTitle(
		String applicantRepresentativeTitle);

	/**
	 * Returns the applicant contact name of this vr applicant profile.
	 *
	 * @return the applicant contact name of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantContactName();

	/**
	 * Sets the applicant contact name of this vr applicant profile.
	 *
	 * @param applicantContactName the applicant contact name of this vr applicant profile
	 */
	public void setApplicantContactName(String applicantContactName);

	/**
	 * Returns the applicant contact email of this vr applicant profile.
	 *
	 * @return the applicant contact email of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantContactEmail();

	/**
	 * Sets the applicant contact email of this vr applicant profile.
	 *
	 * @param applicantContactEmail the applicant contact email of this vr applicant profile
	 */
	public void setApplicantContactEmail(String applicantContactEmail);

	/**
	 * Returns the applicant contact phone of this vr applicant profile.
	 *
	 * @return the applicant contact phone of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantContactPhone();

	/**
	 * Sets the applicant contact phone of this vr applicant profile.
	 *
	 * @param applicantContactPhone the applicant contact phone of this vr applicant profile
	 */
	public void setApplicantContactPhone(String applicantContactPhone);

	/**
	 * Returns the applicant nationality of this vr applicant profile.
	 *
	 * @return the applicant nationality of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantNationality();

	/**
	 * Sets the applicant nationality of this vr applicant profile.
	 *
	 * @param applicantNationality the applicant nationality of this vr applicant profile
	 */
	public void setApplicantNationality(String applicantNationality);

	/**
	 * Returns the applicant nationality code of this vr applicant profile.
	 *
	 * @return the applicant nationality code of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantNationalityCode();

	/**
	 * Sets the applicant nationality code of this vr applicant profile.
	 *
	 * @param applicantNationalityCode the applicant nationality code of this vr applicant profile
	 */
	public void setApplicantNationalityCode(String applicantNationalityCode);

	/**
	 * Returns the applicant region of this vr applicant profile.
	 *
	 * @return the applicant region of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantRegion();

	/**
	 * Sets the applicant region of this vr applicant profile.
	 *
	 * @param applicantRegion the applicant region of this vr applicant profile
	 */
	public void setApplicantRegion(String applicantRegion);

	/**
	 * Returns the applicant region code of this vr applicant profile.
	 *
	 * @return the applicant region code of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantRegionCode();

	/**
	 * Sets the applicant region code of this vr applicant profile.
	 *
	 * @param applicantRegionCode the applicant region code of this vr applicant profile
	 */
	public void setApplicantRegionCode(String applicantRegionCode);

	/**
	 * Returns the applicant city of this vr applicant profile.
	 *
	 * @return the applicant city of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantCity();

	/**
	 * Sets the applicant city of this vr applicant profile.
	 *
	 * @param applicantCity the applicant city of this vr applicant profile
	 */
	public void setApplicantCity(String applicantCity);

	/**
	 * Returns the applicant city code of this vr applicant profile.
	 *
	 * @return the applicant city code of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantCityCode();

	/**
	 * Sets the applicant city code of this vr applicant profile.
	 *
	 * @param applicantCityCode the applicant city code of this vr applicant profile
	 */
	public void setApplicantCityCode(String applicantCityCode);

	/**
	 * Returns the applicant district code of this vr applicant profile.
	 *
	 * @return the applicant district code of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantDistrictCode();

	/**
	 * Sets the applicant district code of this vr applicant profile.
	 *
	 * @param applicantDistrictCode the applicant district code of this vr applicant profile
	 */
	public void setApplicantDistrictCode(String applicantDistrictCode);

	/**
	 * Returns the applicant district name of this vr applicant profile.
	 *
	 * @return the applicant district name of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantDistrictName();

	/**
	 * Sets the applicant district name of this vr applicant profile.
	 *
	 * @param applicantDistrictName the applicant district name of this vr applicant profile
	 */
	public void setApplicantDistrictName(String applicantDistrictName);

	/**
	 * Returns the applicant ward code of this vr applicant profile.
	 *
	 * @return the applicant ward code of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantWardCode();

	/**
	 * Sets the applicant ward code of this vr applicant profile.
	 *
	 * @param applicantWardCode the applicant ward code of this vr applicant profile
	 */
	public void setApplicantWardCode(String applicantWardCode);

	/**
	 * Returns the applicant ward name of this vr applicant profile.
	 *
	 * @return the applicant ward name of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantWardName();

	/**
	 * Sets the applicant ward name of this vr applicant profile.
	 *
	 * @param applicantWardName the applicant ward name of this vr applicant profile
	 */
	public void setApplicantWardName(String applicantWardName);

	/**
	 * Returns the markup corporation of this vr applicant profile.
	 *
	 * @return the markup corporation of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupCorporation();

	/**
	 * Sets the markup corporation of this vr applicant profile.
	 *
	 * @param markupCorporation the markup corporation of this vr applicant profile
	 */
	public void setMarkupCorporation(String markupCorporation);

	/**
	 * Returns the corporation ID of this vr applicant profile.
	 *
	 * @return the corporation ID of this vr applicant profile
	 */
	@AutoEscape
	public String getCorporationId();

	/**
	 * Sets the corporation ID of this vr applicant profile.
	 *
	 * @param corporationId the corporation ID of this vr applicant profile
	 */
	public void setCorporationId(String corporationId);

	/**
	 * Returns the markup designer of this vr applicant profile.
	 *
	 * @return the markup designer of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupDesigner();

	/**
	 * Sets the markup designer of this vr applicant profile.
	 *
	 * @param markupDesigner the markup designer of this vr applicant profile
	 */
	public void setMarkupDesigner(String markupDesigner);

	/**
	 * Returns the markup overseas manufacturer of this vr applicant profile.
	 *
	 * @return the markup overseas manufacturer of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupOverseasManufacturer();

	/**
	 * Sets the markup overseas manufacturer of this vr applicant profile.
	 *
	 * @param markupOverseasManufacturer the markup overseas manufacturer of this vr applicant profile
	 */
	public void setMarkupOverseasManufacturer(String markupOverseasManufacturer);

	/**
	 * Returns the markup domestics manufacturer of this vr applicant profile.
	 *
	 * @return the markup domestics manufacturer of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupDomesticsManufacturer();

	/**
	 * Sets the markup domestics manufacturer of this vr applicant profile.
	 *
	 * @param markupDomesticsManufacturer the markup domestics manufacturer of this vr applicant profile
	 */
	public void setMarkupDomesticsManufacturer(
		String markupDomesticsManufacturer);

	/**
	 * Returns the markup maintainer of this vr applicant profile.
	 *
	 * @return the markup maintainer of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupMaintainer();

	/**
	 * Sets the markup maintainer of this vr applicant profile.
	 *
	 * @param markupMaintainer the markup maintainer of this vr applicant profile
	 */
	public void setMarkupMaintainer(String markupMaintainer);

	/**
	 * Returns the markup importer of this vr applicant profile.
	 *
	 * @return the markup importer of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupImporter();

	/**
	 * Sets the markup importer of this vr applicant profile.
	 *
	 * @param markupImporter the markup importer of this vr applicant profile
	 */
	public void setMarkupImporter(String markupImporter);

	/**
	 * Returns the markup component xcg of this vr applicant profile.
	 *
	 * @return the markup component xcg of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupComponentXCG();

	/**
	 * Sets the markup component xcg of this vr applicant profile.
	 *
	 * @param markupComponentXCG the markup component xcg of this vr applicant profile
	 */
	public void setMarkupComponentXCG(String markupComponentXCG);

	/**
	 * Returns the markup component xmy of this vr applicant profile.
	 *
	 * @return the markup component xmy of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupComponentXMY();

	/**
	 * Sets the markup component xmy of this vr applicant profile.
	 *
	 * @param markupComponentXMY the markup component xmy of this vr applicant profile
	 */
	public void setMarkupComponentXMY(String markupComponentXMY);

	/**
	 * Returns the markup component xcd of this vr applicant profile.
	 *
	 * @return the markup component xcd of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupComponentXCD();

	/**
	 * Sets the markup component xcd of this vr applicant profile.
	 *
	 * @param markupComponentXCD the markup component xcd of this vr applicant profile
	 */
	public void setMarkupComponentXCD(String markupComponentXCD);

	/**
	 * Returns the markup component xdd of this vr applicant profile.
	 *
	 * @return the markup component xdd of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupComponentXDD();

	/**
	 * Sets the markup component xdd of this vr applicant profile.
	 *
	 * @param markupComponentXDD the markup component xdd of this vr applicant profile
	 */
	public void setMarkupComponentXDD(String markupComponentXDD);

	/**
	 * Returns the markup component xcn of this vr applicant profile.
	 *
	 * @return the markup component xcn of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupComponentXCN();

	/**
	 * Sets the markup component xcn of this vr applicant profile.
	 *
	 * @param markupComponentXCN the markup component xcn of this vr applicant profile
	 */
	public void setMarkupComponentXCN(String markupComponentXCN);

	/**
	 * Returns the markup component xch of this vr applicant profile.
	 *
	 * @return the markup component xch of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupComponentXCH();

	/**
	 * Sets the markup component xch of this vr applicant profile.
	 *
	 * @param markupComponentXCH the markup component xch of this vr applicant profile
	 */
	public void setMarkupComponentXCH(String markupComponentXCH);

	/**
	 * Returns the markup xcg of this vr applicant profile.
	 *
	 * @return the markup xcg of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupXCG();

	/**
	 * Sets the markup xcg of this vr applicant profile.
	 *
	 * @param markupXCG the markup xcg of this vr applicant profile
	 */
	public void setMarkupXCG(String markupXCG);

	/**
	 * Returns the markup xmy of this vr applicant profile.
	 *
	 * @return the markup xmy of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupXMY();

	/**
	 * Sets the markup xmy of this vr applicant profile.
	 *
	 * @param markupXMY the markup xmy of this vr applicant profile
	 */
	public void setMarkupXMY(String markupXMY);

	/**
	 * Returns the markup xcd of this vr applicant profile.
	 *
	 * @return the markup xcd of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupXCD();

	/**
	 * Sets the markup xcd of this vr applicant profile.
	 *
	 * @param markupXCD the markup xcd of this vr applicant profile
	 */
	public void setMarkupXCD(String markupXCD);

	/**
	 * Returns the markup xdd of this vr applicant profile.
	 *
	 * @return the markup xdd of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupXDD();

	/**
	 * Sets the markup xdd of this vr applicant profile.
	 *
	 * @param markupXDD the markup xdd of this vr applicant profile
	 */
	public void setMarkupXDD(String markupXDD);

	/**
	 * Returns the markup xcn of this vr applicant profile.
	 *
	 * @return the markup xcn of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupXCN();

	/**
	 * Sets the markup xcn of this vr applicant profile.
	 *
	 * @param markupXCN the markup xcn of this vr applicant profile
	 */
	public void setMarkupXCN(String markupXCN);

	/**
	 * Returns the markup xch of this vr applicant profile.
	 *
	 * @return the markup xch of this vr applicant profile
	 */
	@AutoEscape
	public String getMarkupXCH();

	/**
	 * Sets the markup xch of this vr applicant profile.
	 *
	 * @param markupXCH the markup xch of this vr applicant profile
	 */
	public void setMarkupXCH(String markupXCH);

	/**
	 * Returns the issue type xcg of this vr applicant profile.
	 *
	 * @return the issue type xcg of this vr applicant profile
	 */
	@AutoEscape
	public String getIssueTypeXCG();

	/**
	 * Sets the issue type xcg of this vr applicant profile.
	 *
	 * @param issueTypeXCG the issue type xcg of this vr applicant profile
	 */
	public void setIssueTypeXCG(String issueTypeXCG);

	/**
	 * Returns the issue type xmy of this vr applicant profile.
	 *
	 * @return the issue type xmy of this vr applicant profile
	 */
	@AutoEscape
	public String getIssueTypeXMY();

	/**
	 * Sets the issue type xmy of this vr applicant profile.
	 *
	 * @param issueTypeXMY the issue type xmy of this vr applicant profile
	 */
	public void setIssueTypeXMY(String issueTypeXMY);

	/**
	 * Returns the issue type xcd of this vr applicant profile.
	 *
	 * @return the issue type xcd of this vr applicant profile
	 */
	@AutoEscape
	public String getIssueTypeXCD();

	/**
	 * Sets the issue type xcd of this vr applicant profile.
	 *
	 * @param issueTypeXCD the issue type xcd of this vr applicant profile
	 */
	public void setIssueTypeXCD(String issueTypeXCD);

	/**
	 * Returns the issue type xdd of this vr applicant profile.
	 *
	 * @return the issue type xdd of this vr applicant profile
	 */
	@AutoEscape
	public String getIssueTypeXDD();

	/**
	 * Sets the issue type xdd of this vr applicant profile.
	 *
	 * @param issueTypeXDD the issue type xdd of this vr applicant profile
	 */
	public void setIssueTypeXDD(String issueTypeXDD);

	/**
	 * Returns the issue type xcn of this vr applicant profile.
	 *
	 * @return the issue type xcn of this vr applicant profile
	 */
	@AutoEscape
	public String getIssueTypeXCN();

	/**
	 * Sets the issue type xcn of this vr applicant profile.
	 *
	 * @param issueTypeXCN the issue type xcn of this vr applicant profile
	 */
	public void setIssueTypeXCN(String issueTypeXCN);

	/**
	 * Returns the issue type xch of this vr applicant profile.
	 *
	 * @return the issue type xch of this vr applicant profile
	 */
	@AutoEscape
	public String getIssueTypeXCH();

	/**
	 * Sets the issue type xch of this vr applicant profile.
	 *
	 * @param issueTypeXCH the issue type xch of this vr applicant profile
	 */
	public void setIssueTypeXCH(String issueTypeXCH);

	/**
	 * Returns the issue type description of this vr applicant profile.
	 *
	 * @return the issue type description of this vr applicant profile
	 */
	@AutoEscape
	public String getIssueTypeDescription();

	/**
	 * Sets the issue type description of this vr applicant profile.
	 *
	 * @param issueTypeDescription the issue type description of this vr applicant profile
	 */
	public void setIssueTypeDescription(String issueTypeDescription);

	/**
	 * Returns the applicant ceremony date of this vr applicant profile.
	 *
	 * @return the applicant ceremony date of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantCeremonyDate();

	/**
	 * Sets the applicant ceremony date of this vr applicant profile.
	 *
	 * @param applicantCeremonyDate the applicant ceremony date of this vr applicant profile
	 */
	public void setApplicantCeremonyDate(String applicantCeremonyDate);

	/**
	 * Returns the applicant operation period of this vr applicant profile.
	 *
	 * @return the applicant operation period of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantOperationPeriod();

	/**
	 * Sets the applicant operation period of this vr applicant profile.
	 *
	 * @param applicantOperationPeriod the applicant operation period of this vr applicant profile
	 */
	public void setApplicantOperationPeriod(String applicantOperationPeriod);

	/**
	 * Returns the applicant business type of this vr applicant profile.
	 *
	 * @return the applicant business type of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantBusinessType();

	/**
	 * Sets the applicant business type of this vr applicant profile.
	 *
	 * @param applicantBusinessType the applicant business type of this vr applicant profile
	 */
	public void setApplicantBusinessType(String applicantBusinessType);

	/**
	 * Returns the applicant identity type of this vr applicant profile.
	 *
	 * @return the applicant identity type of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantIdentityType();

	/**
	 * Sets the applicant identity type of this vr applicant profile.
	 *
	 * @param applicantIdentityType the applicant identity type of this vr applicant profile
	 */
	public void setApplicantIdentityType(String applicantIdentityType);

	/**
	 * Returns the applicant identity description of this vr applicant profile.
	 *
	 * @return the applicant identity description of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantIdentityDescription();

	/**
	 * Sets the applicant identity description of this vr applicant profile.
	 *
	 * @param applicantIdentityDescription the applicant identity description of this vr applicant profile
	 */
	public void setApplicantIdentityDescription(
		String applicantIdentityDescription);

	/**
	 * Returns the applicant identity file name of this vr applicant profile.
	 *
	 * @return the applicant identity file name of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantIdentityFileName();

	/**
	 * Sets the applicant identity file name of this vr applicant profile.
	 *
	 * @param applicantIdentityFileName the applicant identity file name of this vr applicant profile
	 */
	public void setApplicantIdentityFileName(String applicantIdentityFileName);

	/**
	 * Returns the applicant identity file entry ID of this vr applicant profile.
	 *
	 * @return the applicant identity file entry ID of this vr applicant profile
	 */
	public long getApplicantIdentityFileEntryId();

	/**
	 * Sets the applicant identity file entry ID of this vr applicant profile.
	 *
	 * @param applicantIdentityFileEntryId the applicant identity file entry ID of this vr applicant profile
	 */
	public void setApplicantIdentityFileEntryId(
		long applicantIdentityFileEntryId);

	/**
	 * Returns the applicant xcg file name of this vr applicant profile.
	 *
	 * @return the applicant xcg file name of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantXcgFileName();

	/**
	 * Sets the applicant xcg file name of this vr applicant profile.
	 *
	 * @param applicantXcgFileName the applicant xcg file name of this vr applicant profile
	 */
	public void setApplicantXcgFileName(String applicantXcgFileName);

	/**
	 * Returns the applicant xcg file entry ID of this vr applicant profile.
	 *
	 * @return the applicant xcg file entry ID of this vr applicant profile
	 */
	public long getApplicantXcgFileEntryId();

	/**
	 * Sets the applicant xcg file entry ID of this vr applicant profile.
	 *
	 * @param applicantXcgFileEntryId the applicant xcg file entry ID of this vr applicant profile
	 */
	public void setApplicantXcgFileEntryId(long applicantXcgFileEntryId);

	/**
	 * Returns the applicant metadata of this vr applicant profile.
	 *
	 * @return the applicant metadata of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantMetadata();

	/**
	 * Sets the applicant metadata of this vr applicant profile.
	 *
	 * @param applicantMetadata the applicant metadata of this vr applicant profile
	 */
	public void setApplicantMetadata(String applicantMetadata);

	/**
	 * Returns the applicant status of this vr applicant profile.
	 *
	 * @return the applicant status of this vr applicant profile
	 */
	@AutoEscape
	public String getApplicantStatus();

	/**
	 * Sets the applicant status of this vr applicant profile.
	 *
	 * @param applicantStatus the applicant status of this vr applicant profile
	 */
	public void setApplicantStatus(String applicantStatus);

	/**
	 * Returns the modify date of this vr applicant profile.
	 *
	 * @return the modify date of this vr applicant profile
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vr applicant profile.
	 *
	 * @param modifyDate the modify date of this vr applicant profile
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vr applicant profile.
	 *
	 * @return the sync date of this vr applicant profile
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vr applicant profile.
	 *
	 * @param syncDate the sync date of this vr applicant profile
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
	public int compareTo(VRApplicantProfile vrApplicantProfile);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRApplicantProfile> toCacheModel();

	@Override
	public VRApplicantProfile toEscapedModel();

	@Override
	public VRApplicantProfile toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}