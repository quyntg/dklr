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
 * This class is a wrapper for {@link VRApplicantProfile}.
 * </p>
 *
 * @author LamTV
 * @see VRApplicantProfile
 * @generated
 */
@ProviderType
public class VRApplicantProfileWrapper implements VRApplicantProfile,
	ModelWrapper<VRApplicantProfile> {
	public VRApplicantProfileWrapper(VRApplicantProfile vrApplicantProfile) {
		_vrApplicantProfile = vrApplicantProfile;
	}

	@Override
	public Class<?> getModelClass() {
		return VRApplicantProfile.class;
	}

	@Override
	public String getModelClassName() {
		return VRApplicantProfile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("mappingMA_CTY", getMappingMA_CTY());
		attributes.put("mappingTEN_CTY", getMappingTEN_CTY());
		attributes.put("mappingDIA_CHI_CTY", getMappingDIA_CHI_CTY());
		attributes.put("mappingNote", getMappingNote());
		attributes.put("mappingStatus", getMappingStatus());
		attributes.put("applicantCode", getApplicantCode());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("applicantPhone", getApplicantPhone());
		attributes.put("applicantEmail", getApplicantEmail());
		attributes.put("applicantFax", getApplicantFax());
		attributes.put("applicantWebsite", getApplicantWebsite());
		attributes.put("applicantRepresentativePhone",
			getApplicantRepresentativePhone());
		attributes.put("applicantRepresentative", getApplicantRepresentative());
		attributes.put("applicantRepresentativeTitle",
			getApplicantRepresentativeTitle());
		attributes.put("applicantContactName", getApplicantContactName());
		attributes.put("applicantContactEmail", getApplicantContactEmail());
		attributes.put("applicantContactPhone", getApplicantContactPhone());
		attributes.put("applicantNationality", getApplicantNationality());
		attributes.put("applicantNationalityCode", getApplicantNationalityCode());
		attributes.put("applicantRegion", getApplicantRegion());
		attributes.put("applicantRegionCode", getApplicantRegionCode());
		attributes.put("applicantCity", getApplicantCity());
		attributes.put("applicantCityCode", getApplicantCityCode());
		attributes.put("applicantDistrictCode", getApplicantDistrictCode());
		attributes.put("applicantDistrictName", getApplicantDistrictName());
		attributes.put("applicantWardCode", getApplicantWardCode());
		attributes.put("applicantWardName", getApplicantWardName());
		attributes.put("markupCorporation", getMarkupCorporation());
		attributes.put("corporationId", getCorporationId());
		attributes.put("markupDesigner", getMarkupDesigner());
		attributes.put("markupOverseasManufacturer",
			getMarkupOverseasManufacturer());
		attributes.put("markupDomesticsManufacturer",
			getMarkupDomesticsManufacturer());
		attributes.put("markupMaintainer", getMarkupMaintainer());
		attributes.put("markupImporter", getMarkupImporter());
		attributes.put("markupComponentXCG", getMarkupComponentXCG());
		attributes.put("markupComponentXMY", getMarkupComponentXMY());
		attributes.put("markupComponentXCD", getMarkupComponentXCD());
		attributes.put("markupComponentXDD", getMarkupComponentXDD());
		attributes.put("markupComponentXCN", getMarkupComponentXCN());
		attributes.put("markupComponentXCH", getMarkupComponentXCH());
		attributes.put("markupXCG", getMarkupXCG());
		attributes.put("markupXMY", getMarkupXMY());
		attributes.put("markupXCD", getMarkupXCD());
		attributes.put("markupXDD", getMarkupXDD());
		attributes.put("markupXCN", getMarkupXCN());
		attributes.put("markupXCH", getMarkupXCH());
		attributes.put("issueTypeXCG", getIssueTypeXCG());
		attributes.put("issueTypeXMY", getIssueTypeXMY());
		attributes.put("issueTypeXCD", getIssueTypeXCD());
		attributes.put("issueTypeXDD", getIssueTypeXDD());
		attributes.put("issueTypeXCN", getIssueTypeXCN());
		attributes.put("issueTypeXCH", getIssueTypeXCH());
		attributes.put("issueTypeDescription", getIssueTypeDescription());
		attributes.put("applicantCeremonyDate", getApplicantCeremonyDate());
		attributes.put("applicantOperationPeriod", getApplicantOperationPeriod());
		attributes.put("applicantBusinessType", getApplicantBusinessType());
		attributes.put("applicantIdentityType", getApplicantIdentityType());
		attributes.put("applicantIdentityDescription",
			getApplicantIdentityDescription());
		attributes.put("applicantIdentityFileName",
			getApplicantIdentityFileName());
		attributes.put("applicantIdentityFileEntryId",
			getApplicantIdentityFileEntryId());
		attributes.put("applicantXcgFileName", getApplicantXcgFileName());
		attributes.put("applicantXcgFileEntryId", getApplicantXcgFileEntryId());
		attributes.put("applicantMetadata", getApplicantMetadata());
		attributes.put("applicantStatus", getApplicantStatus());
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

		String mappingMA_CTY = (String)attributes.get("mappingMA_CTY");

		if (mappingMA_CTY != null) {
			setMappingMA_CTY(mappingMA_CTY);
		}

		String mappingTEN_CTY = (String)attributes.get("mappingTEN_CTY");

		if (mappingTEN_CTY != null) {
			setMappingTEN_CTY(mappingTEN_CTY);
		}

		String mappingDIA_CHI_CTY = (String)attributes.get("mappingDIA_CHI_CTY");

		if (mappingDIA_CHI_CTY != null) {
			setMappingDIA_CHI_CTY(mappingDIA_CHI_CTY);
		}

		String mappingNote = (String)attributes.get("mappingNote");

		if (mappingNote != null) {
			setMappingNote(mappingNote);
		}

		String mappingStatus = (String)attributes.get("mappingStatus");

		if (mappingStatus != null) {
			setMappingStatus(mappingStatus);
		}

		String applicantCode = (String)attributes.get("applicantCode");

		if (applicantCode != null) {
			setApplicantCode(applicantCode);
		}

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		String applicantPhone = (String)attributes.get("applicantPhone");

		if (applicantPhone != null) {
			setApplicantPhone(applicantPhone);
		}

		String applicantEmail = (String)attributes.get("applicantEmail");

		if (applicantEmail != null) {
			setApplicantEmail(applicantEmail);
		}

		String applicantFax = (String)attributes.get("applicantFax");

		if (applicantFax != null) {
			setApplicantFax(applicantFax);
		}

		String applicantWebsite = (String)attributes.get("applicantWebsite");

		if (applicantWebsite != null) {
			setApplicantWebsite(applicantWebsite);
		}

		String applicantRepresentativePhone = (String)attributes.get(
				"applicantRepresentativePhone");

		if (applicantRepresentativePhone != null) {
			setApplicantRepresentativePhone(applicantRepresentativePhone);
		}

		String applicantRepresentative = (String)attributes.get(
				"applicantRepresentative");

		if (applicantRepresentative != null) {
			setApplicantRepresentative(applicantRepresentative);
		}

		String applicantRepresentativeTitle = (String)attributes.get(
				"applicantRepresentativeTitle");

		if (applicantRepresentativeTitle != null) {
			setApplicantRepresentativeTitle(applicantRepresentativeTitle);
		}

		String applicantContactName = (String)attributes.get(
				"applicantContactName");

		if (applicantContactName != null) {
			setApplicantContactName(applicantContactName);
		}

		String applicantContactEmail = (String)attributes.get(
				"applicantContactEmail");

		if (applicantContactEmail != null) {
			setApplicantContactEmail(applicantContactEmail);
		}

		String applicantContactPhone = (String)attributes.get(
				"applicantContactPhone");

		if (applicantContactPhone != null) {
			setApplicantContactPhone(applicantContactPhone);
		}

		String applicantNationality = (String)attributes.get(
				"applicantNationality");

		if (applicantNationality != null) {
			setApplicantNationality(applicantNationality);
		}

		String applicantNationalityCode = (String)attributes.get(
				"applicantNationalityCode");

		if (applicantNationalityCode != null) {
			setApplicantNationalityCode(applicantNationalityCode);
		}

		String applicantRegion = (String)attributes.get("applicantRegion");

		if (applicantRegion != null) {
			setApplicantRegion(applicantRegion);
		}

		String applicantRegionCode = (String)attributes.get(
				"applicantRegionCode");

		if (applicantRegionCode != null) {
			setApplicantRegionCode(applicantRegionCode);
		}

		String applicantCity = (String)attributes.get("applicantCity");

		if (applicantCity != null) {
			setApplicantCity(applicantCity);
		}

		String applicantCityCode = (String)attributes.get("applicantCityCode");

		if (applicantCityCode != null) {
			setApplicantCityCode(applicantCityCode);
		}

		String applicantDistrictCode = (String)attributes.get(
				"applicantDistrictCode");

		if (applicantDistrictCode != null) {
			setApplicantDistrictCode(applicantDistrictCode);
		}

		String applicantDistrictName = (String)attributes.get(
				"applicantDistrictName");

		if (applicantDistrictName != null) {
			setApplicantDistrictName(applicantDistrictName);
		}

		String applicantWardCode = (String)attributes.get("applicantWardCode");

		if (applicantWardCode != null) {
			setApplicantWardCode(applicantWardCode);
		}

		String applicantWardName = (String)attributes.get("applicantWardName");

		if (applicantWardName != null) {
			setApplicantWardName(applicantWardName);
		}

		String markupCorporation = (String)attributes.get("markupCorporation");

		if (markupCorporation != null) {
			setMarkupCorporation(markupCorporation);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		String markupDesigner = (String)attributes.get("markupDesigner");

		if (markupDesigner != null) {
			setMarkupDesigner(markupDesigner);
		}

		String markupOverseasManufacturer = (String)attributes.get(
				"markupOverseasManufacturer");

		if (markupOverseasManufacturer != null) {
			setMarkupOverseasManufacturer(markupOverseasManufacturer);
		}

		String markupDomesticsManufacturer = (String)attributes.get(
				"markupDomesticsManufacturer");

		if (markupDomesticsManufacturer != null) {
			setMarkupDomesticsManufacturer(markupDomesticsManufacturer);
		}

		String markupMaintainer = (String)attributes.get("markupMaintainer");

		if (markupMaintainer != null) {
			setMarkupMaintainer(markupMaintainer);
		}

		String markupImporter = (String)attributes.get("markupImporter");

		if (markupImporter != null) {
			setMarkupImporter(markupImporter);
		}

		String markupComponentXCG = (String)attributes.get("markupComponentXCG");

		if (markupComponentXCG != null) {
			setMarkupComponentXCG(markupComponentXCG);
		}

		String markupComponentXMY = (String)attributes.get("markupComponentXMY");

		if (markupComponentXMY != null) {
			setMarkupComponentXMY(markupComponentXMY);
		}

		String markupComponentXCD = (String)attributes.get("markupComponentXCD");

		if (markupComponentXCD != null) {
			setMarkupComponentXCD(markupComponentXCD);
		}

		String markupComponentXDD = (String)attributes.get("markupComponentXDD");

		if (markupComponentXDD != null) {
			setMarkupComponentXDD(markupComponentXDD);
		}

		String markupComponentXCN = (String)attributes.get("markupComponentXCN");

		if (markupComponentXCN != null) {
			setMarkupComponentXCN(markupComponentXCN);
		}

		String markupComponentXCH = (String)attributes.get("markupComponentXCH");

		if (markupComponentXCH != null) {
			setMarkupComponentXCH(markupComponentXCH);
		}

		String markupXCG = (String)attributes.get("markupXCG");

		if (markupXCG != null) {
			setMarkupXCG(markupXCG);
		}

		String markupXMY = (String)attributes.get("markupXMY");

		if (markupXMY != null) {
			setMarkupXMY(markupXMY);
		}

		String markupXCD = (String)attributes.get("markupXCD");

		if (markupXCD != null) {
			setMarkupXCD(markupXCD);
		}

		String markupXDD = (String)attributes.get("markupXDD");

		if (markupXDD != null) {
			setMarkupXDD(markupXDD);
		}

		String markupXCN = (String)attributes.get("markupXCN");

		if (markupXCN != null) {
			setMarkupXCN(markupXCN);
		}

		String markupXCH = (String)attributes.get("markupXCH");

		if (markupXCH != null) {
			setMarkupXCH(markupXCH);
		}

		String issueTypeXCG = (String)attributes.get("issueTypeXCG");

		if (issueTypeXCG != null) {
			setIssueTypeXCG(issueTypeXCG);
		}

		String issueTypeXMY = (String)attributes.get("issueTypeXMY");

		if (issueTypeXMY != null) {
			setIssueTypeXMY(issueTypeXMY);
		}

		String issueTypeXCD = (String)attributes.get("issueTypeXCD");

		if (issueTypeXCD != null) {
			setIssueTypeXCD(issueTypeXCD);
		}

		String issueTypeXDD = (String)attributes.get("issueTypeXDD");

		if (issueTypeXDD != null) {
			setIssueTypeXDD(issueTypeXDD);
		}

		String issueTypeXCN = (String)attributes.get("issueTypeXCN");

		if (issueTypeXCN != null) {
			setIssueTypeXCN(issueTypeXCN);
		}

		String issueTypeXCH = (String)attributes.get("issueTypeXCH");

		if (issueTypeXCH != null) {
			setIssueTypeXCH(issueTypeXCH);
		}

		String issueTypeDescription = (String)attributes.get(
				"issueTypeDescription");

		if (issueTypeDescription != null) {
			setIssueTypeDescription(issueTypeDescription);
		}

		String applicantCeremonyDate = (String)attributes.get(
				"applicantCeremonyDate");

		if (applicantCeremonyDate != null) {
			setApplicantCeremonyDate(applicantCeremonyDate);
		}

		String applicantOperationPeriod = (String)attributes.get(
				"applicantOperationPeriod");

		if (applicantOperationPeriod != null) {
			setApplicantOperationPeriod(applicantOperationPeriod);
		}

		String applicantBusinessType = (String)attributes.get(
				"applicantBusinessType");

		if (applicantBusinessType != null) {
			setApplicantBusinessType(applicantBusinessType);
		}

		String applicantIdentityType = (String)attributes.get(
				"applicantIdentityType");

		if (applicantIdentityType != null) {
			setApplicantIdentityType(applicantIdentityType);
		}

		String applicantIdentityDescription = (String)attributes.get(
				"applicantIdentityDescription");

		if (applicantIdentityDescription != null) {
			setApplicantIdentityDescription(applicantIdentityDescription);
		}

		String applicantIdentityFileName = (String)attributes.get(
				"applicantIdentityFileName");

		if (applicantIdentityFileName != null) {
			setApplicantIdentityFileName(applicantIdentityFileName);
		}

		Long applicantIdentityFileEntryId = (Long)attributes.get(
				"applicantIdentityFileEntryId");

		if (applicantIdentityFileEntryId != null) {
			setApplicantIdentityFileEntryId(applicantIdentityFileEntryId);
		}

		String applicantXcgFileName = (String)attributes.get(
				"applicantXcgFileName");

		if (applicantXcgFileName != null) {
			setApplicantXcgFileName(applicantXcgFileName);
		}

		Long applicantXcgFileEntryId = (Long)attributes.get(
				"applicantXcgFileEntryId");

		if (applicantXcgFileEntryId != null) {
			setApplicantXcgFileEntryId(applicantXcgFileEntryId);
		}

		String applicantMetadata = (String)attributes.get("applicantMetadata");

		if (applicantMetadata != null) {
			setApplicantMetadata(applicantMetadata);
		}

		String applicantStatus = (String)attributes.get("applicantStatus");

		if (applicantStatus != null) {
			setApplicantStatus(applicantStatus);
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
	public VRApplicantProfile toEscapedModel() {
		return new VRApplicantProfileWrapper(_vrApplicantProfile.toEscapedModel());
	}

	@Override
	public VRApplicantProfile toUnescapedModel() {
		return new VRApplicantProfileWrapper(_vrApplicantProfile.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrApplicantProfile.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrApplicantProfile.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrApplicantProfile.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrApplicantProfile.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRApplicantProfile> toCacheModel() {
		return _vrApplicantProfile.toCacheModel();
	}

	@Override
	public int compareTo(VRApplicantProfile vrApplicantProfile) {
		return _vrApplicantProfile.compareTo(vrApplicantProfile);
	}

	@Override
	public int hashCode() {
		return _vrApplicantProfile.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrApplicantProfile.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRApplicantProfileWrapper((VRApplicantProfile)_vrApplicantProfile.clone());
	}

	/**
	* Returns the applicant address of this vr applicant profile.
	*
	* @return the applicant address of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantAddress() {
		return _vrApplicantProfile.getApplicantAddress();
	}

	/**
	* Returns the applicant business type of this vr applicant profile.
	*
	* @return the applicant business type of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantBusinessType() {
		return _vrApplicantProfile.getApplicantBusinessType();
	}

	/**
	* Returns the applicant ceremony date of this vr applicant profile.
	*
	* @return the applicant ceremony date of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantCeremonyDate() {
		return _vrApplicantProfile.getApplicantCeremonyDate();
	}

	/**
	* Returns the applicant city of this vr applicant profile.
	*
	* @return the applicant city of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantCity() {
		return _vrApplicantProfile.getApplicantCity();
	}

	/**
	* Returns the applicant city code of this vr applicant profile.
	*
	* @return the applicant city code of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantCityCode() {
		return _vrApplicantProfile.getApplicantCityCode();
	}

	/**
	* Returns the applicant code of this vr applicant profile.
	*
	* @return the applicant code of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantCode() {
		return _vrApplicantProfile.getApplicantCode();
	}

	/**
	* Returns the applicant contact email of this vr applicant profile.
	*
	* @return the applicant contact email of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantContactEmail() {
		return _vrApplicantProfile.getApplicantContactEmail();
	}

	/**
	* Returns the applicant contact name of this vr applicant profile.
	*
	* @return the applicant contact name of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantContactName() {
		return _vrApplicantProfile.getApplicantContactName();
	}

	/**
	* Returns the applicant contact phone of this vr applicant profile.
	*
	* @return the applicant contact phone of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantContactPhone() {
		return _vrApplicantProfile.getApplicantContactPhone();
	}

	/**
	* Returns the applicant district code of this vr applicant profile.
	*
	* @return the applicant district code of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantDistrictCode() {
		return _vrApplicantProfile.getApplicantDistrictCode();
	}

	/**
	* Returns the applicant district name of this vr applicant profile.
	*
	* @return the applicant district name of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantDistrictName() {
		return _vrApplicantProfile.getApplicantDistrictName();
	}

	/**
	* Returns the applicant email of this vr applicant profile.
	*
	* @return the applicant email of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantEmail() {
		return _vrApplicantProfile.getApplicantEmail();
	}

	/**
	* Returns the applicant fax of this vr applicant profile.
	*
	* @return the applicant fax of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantFax() {
		return _vrApplicantProfile.getApplicantFax();
	}

	/**
	* Returns the applicant identity description of this vr applicant profile.
	*
	* @return the applicant identity description of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantIdentityDescription() {
		return _vrApplicantProfile.getApplicantIdentityDescription();
	}

	/**
	* Returns the applicant identity file name of this vr applicant profile.
	*
	* @return the applicant identity file name of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantIdentityFileName() {
		return _vrApplicantProfile.getApplicantIdentityFileName();
	}

	/**
	* Returns the applicant identity type of this vr applicant profile.
	*
	* @return the applicant identity type of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantIdentityType() {
		return _vrApplicantProfile.getApplicantIdentityType();
	}

	/**
	* Returns the applicant metadata of this vr applicant profile.
	*
	* @return the applicant metadata of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantMetadata() {
		return _vrApplicantProfile.getApplicantMetadata();
	}

	/**
	* Returns the applicant name of this vr applicant profile.
	*
	* @return the applicant name of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _vrApplicantProfile.getApplicantName();
	}

	/**
	* Returns the applicant nationality of this vr applicant profile.
	*
	* @return the applicant nationality of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantNationality() {
		return _vrApplicantProfile.getApplicantNationality();
	}

	/**
	* Returns the applicant nationality code of this vr applicant profile.
	*
	* @return the applicant nationality code of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantNationalityCode() {
		return _vrApplicantProfile.getApplicantNationalityCode();
	}

	/**
	* Returns the applicant operation period of this vr applicant profile.
	*
	* @return the applicant operation period of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantOperationPeriod() {
		return _vrApplicantProfile.getApplicantOperationPeriod();
	}

	/**
	* Returns the applicant phone of this vr applicant profile.
	*
	* @return the applicant phone of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantPhone() {
		return _vrApplicantProfile.getApplicantPhone();
	}

	/**
	* Returns the applicant region of this vr applicant profile.
	*
	* @return the applicant region of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantRegion() {
		return _vrApplicantProfile.getApplicantRegion();
	}

	/**
	* Returns the applicant region code of this vr applicant profile.
	*
	* @return the applicant region code of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantRegionCode() {
		return _vrApplicantProfile.getApplicantRegionCode();
	}

	/**
	* Returns the applicant representative of this vr applicant profile.
	*
	* @return the applicant representative of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantRepresentative() {
		return _vrApplicantProfile.getApplicantRepresentative();
	}

	/**
	* Returns the applicant representative phone of this vr applicant profile.
	*
	* @return the applicant representative phone of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantRepresentativePhone() {
		return _vrApplicantProfile.getApplicantRepresentativePhone();
	}

	/**
	* Returns the applicant representative title of this vr applicant profile.
	*
	* @return the applicant representative title of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantRepresentativeTitle() {
		return _vrApplicantProfile.getApplicantRepresentativeTitle();
	}

	/**
	* Returns the applicant status of this vr applicant profile.
	*
	* @return the applicant status of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantStatus() {
		return _vrApplicantProfile.getApplicantStatus();
	}

	/**
	* Returns the applicant ward code of this vr applicant profile.
	*
	* @return the applicant ward code of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantWardCode() {
		return _vrApplicantProfile.getApplicantWardCode();
	}

	/**
	* Returns the applicant ward name of this vr applicant profile.
	*
	* @return the applicant ward name of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantWardName() {
		return _vrApplicantProfile.getApplicantWardName();
	}

	/**
	* Returns the applicant website of this vr applicant profile.
	*
	* @return the applicant website of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantWebsite() {
		return _vrApplicantProfile.getApplicantWebsite();
	}

	/**
	* Returns the applicant xcg file name of this vr applicant profile.
	*
	* @return the applicant xcg file name of this vr applicant profile
	*/
	@Override
	public java.lang.String getApplicantXcgFileName() {
		return _vrApplicantProfile.getApplicantXcgFileName();
	}

	/**
	* Returns the corporation ID of this vr applicant profile.
	*
	* @return the corporation ID of this vr applicant profile
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _vrApplicantProfile.getCorporationId();
	}

	/**
	* Returns the issue type description of this vr applicant profile.
	*
	* @return the issue type description of this vr applicant profile
	*/
	@Override
	public java.lang.String getIssueTypeDescription() {
		return _vrApplicantProfile.getIssueTypeDescription();
	}

	/**
	* Returns the issue type xcd of this vr applicant profile.
	*
	* @return the issue type xcd of this vr applicant profile
	*/
	@Override
	public java.lang.String getIssueTypeXCD() {
		return _vrApplicantProfile.getIssueTypeXCD();
	}

	/**
	* Returns the issue type xcg of this vr applicant profile.
	*
	* @return the issue type xcg of this vr applicant profile
	*/
	@Override
	public java.lang.String getIssueTypeXCG() {
		return _vrApplicantProfile.getIssueTypeXCG();
	}

	/**
	* Returns the issue type xch of this vr applicant profile.
	*
	* @return the issue type xch of this vr applicant profile
	*/
	@Override
	public java.lang.String getIssueTypeXCH() {
		return _vrApplicantProfile.getIssueTypeXCH();
	}

	/**
	* Returns the issue type xcn of this vr applicant profile.
	*
	* @return the issue type xcn of this vr applicant profile
	*/
	@Override
	public java.lang.String getIssueTypeXCN() {
		return _vrApplicantProfile.getIssueTypeXCN();
	}

	/**
	* Returns the issue type xdd of this vr applicant profile.
	*
	* @return the issue type xdd of this vr applicant profile
	*/
	@Override
	public java.lang.String getIssueTypeXDD() {
		return _vrApplicantProfile.getIssueTypeXDD();
	}

	/**
	* Returns the issue type xmy of this vr applicant profile.
	*
	* @return the issue type xmy of this vr applicant profile
	*/
	@Override
	public java.lang.String getIssueTypeXMY() {
		return _vrApplicantProfile.getIssueTypeXMY();
	}

	/**
	* Returns the mapping dia_chi_cty of this vr applicant profile.
	*
	* @return the mapping dia_chi_cty of this vr applicant profile
	*/
	@Override
	public java.lang.String getMappingDIA_CHI_CTY() {
		return _vrApplicantProfile.getMappingDIA_CHI_CTY();
	}

	/**
	* Returns the mapping ma_cty of this vr applicant profile.
	*
	* @return the mapping ma_cty of this vr applicant profile
	*/
	@Override
	public java.lang.String getMappingMA_CTY() {
		return _vrApplicantProfile.getMappingMA_CTY();
	}

	/**
	* Returns the mapping note of this vr applicant profile.
	*
	* @return the mapping note of this vr applicant profile
	*/
	@Override
	public java.lang.String getMappingNote() {
		return _vrApplicantProfile.getMappingNote();
	}

	/**
	* Returns the mapping status of this vr applicant profile.
	*
	* @return the mapping status of this vr applicant profile
	*/
	@Override
	public java.lang.String getMappingStatus() {
		return _vrApplicantProfile.getMappingStatus();
	}

	/**
	* Returns the mapping ten_cty of this vr applicant profile.
	*
	* @return the mapping ten_cty of this vr applicant profile
	*/
	@Override
	public java.lang.String getMappingTEN_CTY() {
		return _vrApplicantProfile.getMappingTEN_CTY();
	}

	/**
	* Returns the markup component xcd of this vr applicant profile.
	*
	* @return the markup component xcd of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupComponentXCD() {
		return _vrApplicantProfile.getMarkupComponentXCD();
	}

	/**
	* Returns the markup component xcg of this vr applicant profile.
	*
	* @return the markup component xcg of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupComponentXCG() {
		return _vrApplicantProfile.getMarkupComponentXCG();
	}

	/**
	* Returns the markup component xch of this vr applicant profile.
	*
	* @return the markup component xch of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupComponentXCH() {
		return _vrApplicantProfile.getMarkupComponentXCH();
	}

	/**
	* Returns the markup component xcn of this vr applicant profile.
	*
	* @return the markup component xcn of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupComponentXCN() {
		return _vrApplicantProfile.getMarkupComponentXCN();
	}

	/**
	* Returns the markup component xdd of this vr applicant profile.
	*
	* @return the markup component xdd of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupComponentXDD() {
		return _vrApplicantProfile.getMarkupComponentXDD();
	}

	/**
	* Returns the markup component xmy of this vr applicant profile.
	*
	* @return the markup component xmy of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupComponentXMY() {
		return _vrApplicantProfile.getMarkupComponentXMY();
	}

	/**
	* Returns the markup corporation of this vr applicant profile.
	*
	* @return the markup corporation of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupCorporation() {
		return _vrApplicantProfile.getMarkupCorporation();
	}

	/**
	* Returns the markup designer of this vr applicant profile.
	*
	* @return the markup designer of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupDesigner() {
		return _vrApplicantProfile.getMarkupDesigner();
	}

	/**
	* Returns the markup domestics manufacturer of this vr applicant profile.
	*
	* @return the markup domestics manufacturer of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupDomesticsManufacturer() {
		return _vrApplicantProfile.getMarkupDomesticsManufacturer();
	}

	/**
	* Returns the markup importer of this vr applicant profile.
	*
	* @return the markup importer of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupImporter() {
		return _vrApplicantProfile.getMarkupImporter();
	}

	/**
	* Returns the markup maintainer of this vr applicant profile.
	*
	* @return the markup maintainer of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupMaintainer() {
		return _vrApplicantProfile.getMarkupMaintainer();
	}

	/**
	* Returns the markup overseas manufacturer of this vr applicant profile.
	*
	* @return the markup overseas manufacturer of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupOverseasManufacturer() {
		return _vrApplicantProfile.getMarkupOverseasManufacturer();
	}

	/**
	* Returns the markup xcd of this vr applicant profile.
	*
	* @return the markup xcd of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupXCD() {
		return _vrApplicantProfile.getMarkupXCD();
	}

	/**
	* Returns the markup xcg of this vr applicant profile.
	*
	* @return the markup xcg of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupXCG() {
		return _vrApplicantProfile.getMarkupXCG();
	}

	/**
	* Returns the markup xch of this vr applicant profile.
	*
	* @return the markup xch of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupXCH() {
		return _vrApplicantProfile.getMarkupXCH();
	}

	/**
	* Returns the markup xcn of this vr applicant profile.
	*
	* @return the markup xcn of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupXCN() {
		return _vrApplicantProfile.getMarkupXCN();
	}

	/**
	* Returns the markup xdd of this vr applicant profile.
	*
	* @return the markup xdd of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupXDD() {
		return _vrApplicantProfile.getMarkupXDD();
	}

	/**
	* Returns the markup xmy of this vr applicant profile.
	*
	* @return the markup xmy of this vr applicant profile
	*/
	@Override
	public java.lang.String getMarkupXMY() {
		return _vrApplicantProfile.getMarkupXMY();
	}

	@Override
	public java.lang.String toString() {
		return _vrApplicantProfile.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrApplicantProfile.toXmlString();
	}

	/**
	* Returns the modify date of this vr applicant profile.
	*
	* @return the modify date of this vr applicant profile
	*/
	@Override
	public Date getModifyDate() {
		return _vrApplicantProfile.getModifyDate();
	}

	/**
	* Returns the sync date of this vr applicant profile.
	*
	* @return the sync date of this vr applicant profile
	*/
	@Override
	public Date getSyncDate() {
		return _vrApplicantProfile.getSyncDate();
	}

	/**
	* Returns the applicant identity file entry ID of this vr applicant profile.
	*
	* @return the applicant identity file entry ID of this vr applicant profile
	*/
	@Override
	public long getApplicantIdentityFileEntryId() {
		return _vrApplicantProfile.getApplicantIdentityFileEntryId();
	}

	/**
	* Returns the applicant xcg file entry ID of this vr applicant profile.
	*
	* @return the applicant xcg file entry ID of this vr applicant profile
	*/
	@Override
	public long getApplicantXcgFileEntryId() {
		return _vrApplicantProfile.getApplicantXcgFileEntryId();
	}

	/**
	* Returns the ID of this vr applicant profile.
	*
	* @return the ID of this vr applicant profile
	*/
	@Override
	public long getId() {
		return _vrApplicantProfile.getId();
	}

	/**
	* Returns the mt core of this vr applicant profile.
	*
	* @return the mt core of this vr applicant profile
	*/
	@Override
	public long getMtCore() {
		return _vrApplicantProfile.getMtCore();
	}

	/**
	* Returns the primary key of this vr applicant profile.
	*
	* @return the primary key of this vr applicant profile
	*/
	@Override
	public long getPrimaryKey() {
		return _vrApplicantProfile.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrApplicantProfile.persist();
	}

	/**
	* Sets the applicant address of this vr applicant profile.
	*
	* @param applicantAddress the applicant address of this vr applicant profile
	*/
	@Override
	public void setApplicantAddress(java.lang.String applicantAddress) {
		_vrApplicantProfile.setApplicantAddress(applicantAddress);
	}

	/**
	* Sets the applicant business type of this vr applicant profile.
	*
	* @param applicantBusinessType the applicant business type of this vr applicant profile
	*/
	@Override
	public void setApplicantBusinessType(java.lang.String applicantBusinessType) {
		_vrApplicantProfile.setApplicantBusinessType(applicantBusinessType);
	}

	/**
	* Sets the applicant ceremony date of this vr applicant profile.
	*
	* @param applicantCeremonyDate the applicant ceremony date of this vr applicant profile
	*/
	@Override
	public void setApplicantCeremonyDate(java.lang.String applicantCeremonyDate) {
		_vrApplicantProfile.setApplicantCeremonyDate(applicantCeremonyDate);
	}

	/**
	* Sets the applicant city of this vr applicant profile.
	*
	* @param applicantCity the applicant city of this vr applicant profile
	*/
	@Override
	public void setApplicantCity(java.lang.String applicantCity) {
		_vrApplicantProfile.setApplicantCity(applicantCity);
	}

	/**
	* Sets the applicant city code of this vr applicant profile.
	*
	* @param applicantCityCode the applicant city code of this vr applicant profile
	*/
	@Override
	public void setApplicantCityCode(java.lang.String applicantCityCode) {
		_vrApplicantProfile.setApplicantCityCode(applicantCityCode);
	}

	/**
	* Sets the applicant code of this vr applicant profile.
	*
	* @param applicantCode the applicant code of this vr applicant profile
	*/
	@Override
	public void setApplicantCode(java.lang.String applicantCode) {
		_vrApplicantProfile.setApplicantCode(applicantCode);
	}

	/**
	* Sets the applicant contact email of this vr applicant profile.
	*
	* @param applicantContactEmail the applicant contact email of this vr applicant profile
	*/
	@Override
	public void setApplicantContactEmail(java.lang.String applicantContactEmail) {
		_vrApplicantProfile.setApplicantContactEmail(applicantContactEmail);
	}

	/**
	* Sets the applicant contact name of this vr applicant profile.
	*
	* @param applicantContactName the applicant contact name of this vr applicant profile
	*/
	@Override
	public void setApplicantContactName(java.lang.String applicantContactName) {
		_vrApplicantProfile.setApplicantContactName(applicantContactName);
	}

	/**
	* Sets the applicant contact phone of this vr applicant profile.
	*
	* @param applicantContactPhone the applicant contact phone of this vr applicant profile
	*/
	@Override
	public void setApplicantContactPhone(java.lang.String applicantContactPhone) {
		_vrApplicantProfile.setApplicantContactPhone(applicantContactPhone);
	}

	/**
	* Sets the applicant district code of this vr applicant profile.
	*
	* @param applicantDistrictCode the applicant district code of this vr applicant profile
	*/
	@Override
	public void setApplicantDistrictCode(java.lang.String applicantDistrictCode) {
		_vrApplicantProfile.setApplicantDistrictCode(applicantDistrictCode);
	}

	/**
	* Sets the applicant district name of this vr applicant profile.
	*
	* @param applicantDistrictName the applicant district name of this vr applicant profile
	*/
	@Override
	public void setApplicantDistrictName(java.lang.String applicantDistrictName) {
		_vrApplicantProfile.setApplicantDistrictName(applicantDistrictName);
	}

	/**
	* Sets the applicant email of this vr applicant profile.
	*
	* @param applicantEmail the applicant email of this vr applicant profile
	*/
	@Override
	public void setApplicantEmail(java.lang.String applicantEmail) {
		_vrApplicantProfile.setApplicantEmail(applicantEmail);
	}

	/**
	* Sets the applicant fax of this vr applicant profile.
	*
	* @param applicantFax the applicant fax of this vr applicant profile
	*/
	@Override
	public void setApplicantFax(java.lang.String applicantFax) {
		_vrApplicantProfile.setApplicantFax(applicantFax);
	}

	/**
	* Sets the applicant identity description of this vr applicant profile.
	*
	* @param applicantIdentityDescription the applicant identity description of this vr applicant profile
	*/
	@Override
	public void setApplicantIdentityDescription(
		java.lang.String applicantIdentityDescription) {
		_vrApplicantProfile.setApplicantIdentityDescription(applicantIdentityDescription);
	}

	/**
	* Sets the applicant identity file entry ID of this vr applicant profile.
	*
	* @param applicantIdentityFileEntryId the applicant identity file entry ID of this vr applicant profile
	*/
	@Override
	public void setApplicantIdentityFileEntryId(
		long applicantIdentityFileEntryId) {
		_vrApplicantProfile.setApplicantIdentityFileEntryId(applicantIdentityFileEntryId);
	}

	/**
	* Sets the applicant identity file name of this vr applicant profile.
	*
	* @param applicantIdentityFileName the applicant identity file name of this vr applicant profile
	*/
	@Override
	public void setApplicantIdentityFileName(
		java.lang.String applicantIdentityFileName) {
		_vrApplicantProfile.setApplicantIdentityFileName(applicantIdentityFileName);
	}

	/**
	* Sets the applicant identity type of this vr applicant profile.
	*
	* @param applicantIdentityType the applicant identity type of this vr applicant profile
	*/
	@Override
	public void setApplicantIdentityType(java.lang.String applicantIdentityType) {
		_vrApplicantProfile.setApplicantIdentityType(applicantIdentityType);
	}

	/**
	* Sets the applicant metadata of this vr applicant profile.
	*
	* @param applicantMetadata the applicant metadata of this vr applicant profile
	*/
	@Override
	public void setApplicantMetadata(java.lang.String applicantMetadata) {
		_vrApplicantProfile.setApplicantMetadata(applicantMetadata);
	}

	/**
	* Sets the applicant name of this vr applicant profile.
	*
	* @param applicantName the applicant name of this vr applicant profile
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_vrApplicantProfile.setApplicantName(applicantName);
	}

	/**
	* Sets the applicant nationality of this vr applicant profile.
	*
	* @param applicantNationality the applicant nationality of this vr applicant profile
	*/
	@Override
	public void setApplicantNationality(java.lang.String applicantNationality) {
		_vrApplicantProfile.setApplicantNationality(applicantNationality);
	}

	/**
	* Sets the applicant nationality code of this vr applicant profile.
	*
	* @param applicantNationalityCode the applicant nationality code of this vr applicant profile
	*/
	@Override
	public void setApplicantNationalityCode(
		java.lang.String applicantNationalityCode) {
		_vrApplicantProfile.setApplicantNationalityCode(applicantNationalityCode);
	}

	/**
	* Sets the applicant operation period of this vr applicant profile.
	*
	* @param applicantOperationPeriod the applicant operation period of this vr applicant profile
	*/
	@Override
	public void setApplicantOperationPeriod(
		java.lang.String applicantOperationPeriod) {
		_vrApplicantProfile.setApplicantOperationPeriod(applicantOperationPeriod);
	}

	/**
	* Sets the applicant phone of this vr applicant profile.
	*
	* @param applicantPhone the applicant phone of this vr applicant profile
	*/
	@Override
	public void setApplicantPhone(java.lang.String applicantPhone) {
		_vrApplicantProfile.setApplicantPhone(applicantPhone);
	}

	/**
	* Sets the applicant region of this vr applicant profile.
	*
	* @param applicantRegion the applicant region of this vr applicant profile
	*/
	@Override
	public void setApplicantRegion(java.lang.String applicantRegion) {
		_vrApplicantProfile.setApplicantRegion(applicantRegion);
	}

	/**
	* Sets the applicant region code of this vr applicant profile.
	*
	* @param applicantRegionCode the applicant region code of this vr applicant profile
	*/
	@Override
	public void setApplicantRegionCode(java.lang.String applicantRegionCode) {
		_vrApplicantProfile.setApplicantRegionCode(applicantRegionCode);
	}

	/**
	* Sets the applicant representative of this vr applicant profile.
	*
	* @param applicantRepresentative the applicant representative of this vr applicant profile
	*/
	@Override
	public void setApplicantRepresentative(
		java.lang.String applicantRepresentative) {
		_vrApplicantProfile.setApplicantRepresentative(applicantRepresentative);
	}

	/**
	* Sets the applicant representative phone of this vr applicant profile.
	*
	* @param applicantRepresentativePhone the applicant representative phone of this vr applicant profile
	*/
	@Override
	public void setApplicantRepresentativePhone(
		java.lang.String applicantRepresentativePhone) {
		_vrApplicantProfile.setApplicantRepresentativePhone(applicantRepresentativePhone);
	}

	/**
	* Sets the applicant representative title of this vr applicant profile.
	*
	* @param applicantRepresentativeTitle the applicant representative title of this vr applicant profile
	*/
	@Override
	public void setApplicantRepresentativeTitle(
		java.lang.String applicantRepresentativeTitle) {
		_vrApplicantProfile.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
	}

	/**
	* Sets the applicant status of this vr applicant profile.
	*
	* @param applicantStatus the applicant status of this vr applicant profile
	*/
	@Override
	public void setApplicantStatus(java.lang.String applicantStatus) {
		_vrApplicantProfile.setApplicantStatus(applicantStatus);
	}

	/**
	* Sets the applicant ward code of this vr applicant profile.
	*
	* @param applicantWardCode the applicant ward code of this vr applicant profile
	*/
	@Override
	public void setApplicantWardCode(java.lang.String applicantWardCode) {
		_vrApplicantProfile.setApplicantWardCode(applicantWardCode);
	}

	/**
	* Sets the applicant ward name of this vr applicant profile.
	*
	* @param applicantWardName the applicant ward name of this vr applicant profile
	*/
	@Override
	public void setApplicantWardName(java.lang.String applicantWardName) {
		_vrApplicantProfile.setApplicantWardName(applicantWardName);
	}

	/**
	* Sets the applicant website of this vr applicant profile.
	*
	* @param applicantWebsite the applicant website of this vr applicant profile
	*/
	@Override
	public void setApplicantWebsite(java.lang.String applicantWebsite) {
		_vrApplicantProfile.setApplicantWebsite(applicantWebsite);
	}

	/**
	* Sets the applicant xcg file entry ID of this vr applicant profile.
	*
	* @param applicantXcgFileEntryId the applicant xcg file entry ID of this vr applicant profile
	*/
	@Override
	public void setApplicantXcgFileEntryId(long applicantXcgFileEntryId) {
		_vrApplicantProfile.setApplicantXcgFileEntryId(applicantXcgFileEntryId);
	}

	/**
	* Sets the applicant xcg file name of this vr applicant profile.
	*
	* @param applicantXcgFileName the applicant xcg file name of this vr applicant profile
	*/
	@Override
	public void setApplicantXcgFileName(java.lang.String applicantXcgFileName) {
		_vrApplicantProfile.setApplicantXcgFileName(applicantXcgFileName);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrApplicantProfile.setCachedModel(cachedModel);
	}

	/**
	* Sets the corporation ID of this vr applicant profile.
	*
	* @param corporationId the corporation ID of this vr applicant profile
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_vrApplicantProfile.setCorporationId(corporationId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrApplicantProfile.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrApplicantProfile.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrApplicantProfile.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr applicant profile.
	*
	* @param id the ID of this vr applicant profile
	*/
	@Override
	public void setId(long id) {
		_vrApplicantProfile.setId(id);
	}

	/**
	* Sets the issue type description of this vr applicant profile.
	*
	* @param issueTypeDescription the issue type description of this vr applicant profile
	*/
	@Override
	public void setIssueTypeDescription(java.lang.String issueTypeDescription) {
		_vrApplicantProfile.setIssueTypeDescription(issueTypeDescription);
	}

	/**
	* Sets the issue type xcd of this vr applicant profile.
	*
	* @param issueTypeXCD the issue type xcd of this vr applicant profile
	*/
	@Override
	public void setIssueTypeXCD(java.lang.String issueTypeXCD) {
		_vrApplicantProfile.setIssueTypeXCD(issueTypeXCD);
	}

	/**
	* Sets the issue type xcg of this vr applicant profile.
	*
	* @param issueTypeXCG the issue type xcg of this vr applicant profile
	*/
	@Override
	public void setIssueTypeXCG(java.lang.String issueTypeXCG) {
		_vrApplicantProfile.setIssueTypeXCG(issueTypeXCG);
	}

	/**
	* Sets the issue type xch of this vr applicant profile.
	*
	* @param issueTypeXCH the issue type xch of this vr applicant profile
	*/
	@Override
	public void setIssueTypeXCH(java.lang.String issueTypeXCH) {
		_vrApplicantProfile.setIssueTypeXCH(issueTypeXCH);
	}

	/**
	* Sets the issue type xcn of this vr applicant profile.
	*
	* @param issueTypeXCN the issue type xcn of this vr applicant profile
	*/
	@Override
	public void setIssueTypeXCN(java.lang.String issueTypeXCN) {
		_vrApplicantProfile.setIssueTypeXCN(issueTypeXCN);
	}

	/**
	* Sets the issue type xdd of this vr applicant profile.
	*
	* @param issueTypeXDD the issue type xdd of this vr applicant profile
	*/
	@Override
	public void setIssueTypeXDD(java.lang.String issueTypeXDD) {
		_vrApplicantProfile.setIssueTypeXDD(issueTypeXDD);
	}

	/**
	* Sets the issue type xmy of this vr applicant profile.
	*
	* @param issueTypeXMY the issue type xmy of this vr applicant profile
	*/
	@Override
	public void setIssueTypeXMY(java.lang.String issueTypeXMY) {
		_vrApplicantProfile.setIssueTypeXMY(issueTypeXMY);
	}

	/**
	* Sets the mapping dia_chi_cty of this vr applicant profile.
	*
	* @param mappingDIA_CHI_CTY the mapping dia_chi_cty of this vr applicant profile
	*/
	@Override
	public void setMappingDIA_CHI_CTY(java.lang.String mappingDIA_CHI_CTY) {
		_vrApplicantProfile.setMappingDIA_CHI_CTY(mappingDIA_CHI_CTY);
	}

	/**
	* Sets the mapping ma_cty of this vr applicant profile.
	*
	* @param mappingMA_CTY the mapping ma_cty of this vr applicant profile
	*/
	@Override
	public void setMappingMA_CTY(java.lang.String mappingMA_CTY) {
		_vrApplicantProfile.setMappingMA_CTY(mappingMA_CTY);
	}

	/**
	* Sets the mapping note of this vr applicant profile.
	*
	* @param mappingNote the mapping note of this vr applicant profile
	*/
	@Override
	public void setMappingNote(java.lang.String mappingNote) {
		_vrApplicantProfile.setMappingNote(mappingNote);
	}

	/**
	* Sets the mapping status of this vr applicant profile.
	*
	* @param mappingStatus the mapping status of this vr applicant profile
	*/
	@Override
	public void setMappingStatus(java.lang.String mappingStatus) {
		_vrApplicantProfile.setMappingStatus(mappingStatus);
	}

	/**
	* Sets the mapping ten_cty of this vr applicant profile.
	*
	* @param mappingTEN_CTY the mapping ten_cty of this vr applicant profile
	*/
	@Override
	public void setMappingTEN_CTY(java.lang.String mappingTEN_CTY) {
		_vrApplicantProfile.setMappingTEN_CTY(mappingTEN_CTY);
	}

	/**
	* Sets the markup component xcd of this vr applicant profile.
	*
	* @param markupComponentXCD the markup component xcd of this vr applicant profile
	*/
	@Override
	public void setMarkupComponentXCD(java.lang.String markupComponentXCD) {
		_vrApplicantProfile.setMarkupComponentXCD(markupComponentXCD);
	}

	/**
	* Sets the markup component xcg of this vr applicant profile.
	*
	* @param markupComponentXCG the markup component xcg of this vr applicant profile
	*/
	@Override
	public void setMarkupComponentXCG(java.lang.String markupComponentXCG) {
		_vrApplicantProfile.setMarkupComponentXCG(markupComponentXCG);
	}

	/**
	* Sets the markup component xch of this vr applicant profile.
	*
	* @param markupComponentXCH the markup component xch of this vr applicant profile
	*/
	@Override
	public void setMarkupComponentXCH(java.lang.String markupComponentXCH) {
		_vrApplicantProfile.setMarkupComponentXCH(markupComponentXCH);
	}

	/**
	* Sets the markup component xcn of this vr applicant profile.
	*
	* @param markupComponentXCN the markup component xcn of this vr applicant profile
	*/
	@Override
	public void setMarkupComponentXCN(java.lang.String markupComponentXCN) {
		_vrApplicantProfile.setMarkupComponentXCN(markupComponentXCN);
	}

	/**
	* Sets the markup component xdd of this vr applicant profile.
	*
	* @param markupComponentXDD the markup component xdd of this vr applicant profile
	*/
	@Override
	public void setMarkupComponentXDD(java.lang.String markupComponentXDD) {
		_vrApplicantProfile.setMarkupComponentXDD(markupComponentXDD);
	}

	/**
	* Sets the markup component xmy of this vr applicant profile.
	*
	* @param markupComponentXMY the markup component xmy of this vr applicant profile
	*/
	@Override
	public void setMarkupComponentXMY(java.lang.String markupComponentXMY) {
		_vrApplicantProfile.setMarkupComponentXMY(markupComponentXMY);
	}

	/**
	* Sets the markup corporation of this vr applicant profile.
	*
	* @param markupCorporation the markup corporation of this vr applicant profile
	*/
	@Override
	public void setMarkupCorporation(java.lang.String markupCorporation) {
		_vrApplicantProfile.setMarkupCorporation(markupCorporation);
	}

	/**
	* Sets the markup designer of this vr applicant profile.
	*
	* @param markupDesigner the markup designer of this vr applicant profile
	*/
	@Override
	public void setMarkupDesigner(java.lang.String markupDesigner) {
		_vrApplicantProfile.setMarkupDesigner(markupDesigner);
	}

	/**
	* Sets the markup domestics manufacturer of this vr applicant profile.
	*
	* @param markupDomesticsManufacturer the markup domestics manufacturer of this vr applicant profile
	*/
	@Override
	public void setMarkupDomesticsManufacturer(
		java.lang.String markupDomesticsManufacturer) {
		_vrApplicantProfile.setMarkupDomesticsManufacturer(markupDomesticsManufacturer);
	}

	/**
	* Sets the markup importer of this vr applicant profile.
	*
	* @param markupImporter the markup importer of this vr applicant profile
	*/
	@Override
	public void setMarkupImporter(java.lang.String markupImporter) {
		_vrApplicantProfile.setMarkupImporter(markupImporter);
	}

	/**
	* Sets the markup maintainer of this vr applicant profile.
	*
	* @param markupMaintainer the markup maintainer of this vr applicant profile
	*/
	@Override
	public void setMarkupMaintainer(java.lang.String markupMaintainer) {
		_vrApplicantProfile.setMarkupMaintainer(markupMaintainer);
	}

	/**
	* Sets the markup overseas manufacturer of this vr applicant profile.
	*
	* @param markupOverseasManufacturer the markup overseas manufacturer of this vr applicant profile
	*/
	@Override
	public void setMarkupOverseasManufacturer(
		java.lang.String markupOverseasManufacturer) {
		_vrApplicantProfile.setMarkupOverseasManufacturer(markupOverseasManufacturer);
	}

	/**
	* Sets the markup xcd of this vr applicant profile.
	*
	* @param markupXCD the markup xcd of this vr applicant profile
	*/
	@Override
	public void setMarkupXCD(java.lang.String markupXCD) {
		_vrApplicantProfile.setMarkupXCD(markupXCD);
	}

	/**
	* Sets the markup xcg of this vr applicant profile.
	*
	* @param markupXCG the markup xcg of this vr applicant profile
	*/
	@Override
	public void setMarkupXCG(java.lang.String markupXCG) {
		_vrApplicantProfile.setMarkupXCG(markupXCG);
	}

	/**
	* Sets the markup xch of this vr applicant profile.
	*
	* @param markupXCH the markup xch of this vr applicant profile
	*/
	@Override
	public void setMarkupXCH(java.lang.String markupXCH) {
		_vrApplicantProfile.setMarkupXCH(markupXCH);
	}

	/**
	* Sets the markup xcn of this vr applicant profile.
	*
	* @param markupXCN the markup xcn of this vr applicant profile
	*/
	@Override
	public void setMarkupXCN(java.lang.String markupXCN) {
		_vrApplicantProfile.setMarkupXCN(markupXCN);
	}

	/**
	* Sets the markup xdd of this vr applicant profile.
	*
	* @param markupXDD the markup xdd of this vr applicant profile
	*/
	@Override
	public void setMarkupXDD(java.lang.String markupXDD) {
		_vrApplicantProfile.setMarkupXDD(markupXDD);
	}

	/**
	* Sets the markup xmy of this vr applicant profile.
	*
	* @param markupXMY the markup xmy of this vr applicant profile
	*/
	@Override
	public void setMarkupXMY(java.lang.String markupXMY) {
		_vrApplicantProfile.setMarkupXMY(markupXMY);
	}

	/**
	* Sets the modify date of this vr applicant profile.
	*
	* @param modifyDate the modify date of this vr applicant profile
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrApplicantProfile.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr applicant profile.
	*
	* @param mtCore the mt core of this vr applicant profile
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrApplicantProfile.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrApplicantProfile.setNew(n);
	}

	/**
	* Sets the primary key of this vr applicant profile.
	*
	* @param primaryKey the primary key of this vr applicant profile
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrApplicantProfile.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrApplicantProfile.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sync date of this vr applicant profile.
	*
	* @param syncDate the sync date of this vr applicant profile
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrApplicantProfile.setSyncDate(syncDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRApplicantProfileWrapper)) {
			return false;
		}

		VRApplicantProfileWrapper vrApplicantProfileWrapper = (VRApplicantProfileWrapper)obj;

		if (Objects.equals(_vrApplicantProfile,
					vrApplicantProfileWrapper._vrApplicantProfile)) {
			return true;
		}

		return false;
	}

	@Override
	public VRApplicantProfile getWrappedModel() {
		return _vrApplicantProfile;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrApplicantProfile.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrApplicantProfile.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrApplicantProfile.resetOriginalValues();
	}

	private final VRApplicantProfile _vrApplicantProfile;
}