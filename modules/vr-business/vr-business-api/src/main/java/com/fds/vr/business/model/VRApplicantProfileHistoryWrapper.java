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
 * This class is a wrapper for {@link VRApplicantProfileHistory}.
 * </p>
 *
 * @author LamTV
 * @see VRApplicantProfileHistory
 * @generated
 */
@ProviderType
public class VRApplicantProfileHistoryWrapper
	implements VRApplicantProfileHistory,
		ModelWrapper<VRApplicantProfileHistory> {
	public VRApplicantProfileHistoryWrapper(
		VRApplicantProfileHistory vrApplicantProfileHistory) {
		_vrApplicantProfileHistory = vrApplicantProfileHistory;
	}

	@Override
	public Class<?> getModelClass() {
		return VRApplicantProfileHistory.class;
	}

	@Override
	public String getModelClassName() {
		return VRApplicantProfileHistory.class.getName();
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
		attributes.put("applicantRepresentative", getApplicantRepresentative());
		attributes.put("applicantRepresentativeTitle",
			getApplicantRepresentativeTitle());
		attributes.put("applicantPhone", getApplicantPhone());
		attributes.put("applicantEmail", getApplicantEmail());
		attributes.put("applicantFax", getApplicantFax());
		attributes.put("applicantContactName", getApplicantContactName());
		attributes.put("applicantContactEmail", getApplicantContactEmail());
		attributes.put("applicantContactPhone", getApplicantContactPhone());
		attributes.put("applicantNationality", getApplicantNationality());
		attributes.put("applicantRegion", getApplicantRegion());
		attributes.put("applicantCity", getApplicantCity());
		attributes.put("markupCorporation", getMarkupCorporation());
		attributes.put("corporationId", getCorporationId());
		attributes.put("markupDesigner", getMarkupDesigner());
		attributes.put("markupOverseasManufacturer",
			getMarkupOverseasManufacturer());
		attributes.put("markupDomesticsManufacturer",
			getMarkupDomesticsManufacturer());
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

		String applicantRegion = (String)attributes.get("applicantRegion");

		if (applicantRegion != null) {
			setApplicantRegion(applicantRegion);
		}

		String applicantCity = (String)attributes.get("applicantCity");

		if (applicantCity != null) {
			setApplicantCity(applicantCity);
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
	public VRApplicantProfileHistory toEscapedModel() {
		return new VRApplicantProfileHistoryWrapper(_vrApplicantProfileHistory.toEscapedModel());
	}

	@Override
	public VRApplicantProfileHistory toUnescapedModel() {
		return new VRApplicantProfileHistoryWrapper(_vrApplicantProfileHistory.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrApplicantProfileHistory.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrApplicantProfileHistory.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrApplicantProfileHistory.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrApplicantProfileHistory.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRApplicantProfileHistory> toCacheModel() {
		return _vrApplicantProfileHistory.toCacheModel();
	}

	@Override
	public int compareTo(VRApplicantProfileHistory vrApplicantProfileHistory) {
		return _vrApplicantProfileHistory.compareTo(vrApplicantProfileHistory);
	}

	@Override
	public int hashCode() {
		return _vrApplicantProfileHistory.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrApplicantProfileHistory.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRApplicantProfileHistoryWrapper((VRApplicantProfileHistory)_vrApplicantProfileHistory.clone());
	}

	/**
	* Returns the applicant address of this vr applicant profile history.
	*
	* @return the applicant address of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantAddress() {
		return _vrApplicantProfileHistory.getApplicantAddress();
	}

	/**
	* Returns the applicant business type of this vr applicant profile history.
	*
	* @return the applicant business type of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantBusinessType() {
		return _vrApplicantProfileHistory.getApplicantBusinessType();
	}

	/**
	* Returns the applicant ceremony date of this vr applicant profile history.
	*
	* @return the applicant ceremony date of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantCeremonyDate() {
		return _vrApplicantProfileHistory.getApplicantCeremonyDate();
	}

	/**
	* Returns the applicant city of this vr applicant profile history.
	*
	* @return the applicant city of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantCity() {
		return _vrApplicantProfileHistory.getApplicantCity();
	}

	/**
	* Returns the applicant code of this vr applicant profile history.
	*
	* @return the applicant code of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantCode() {
		return _vrApplicantProfileHistory.getApplicantCode();
	}

	/**
	* Returns the applicant contact email of this vr applicant profile history.
	*
	* @return the applicant contact email of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantContactEmail() {
		return _vrApplicantProfileHistory.getApplicantContactEmail();
	}

	/**
	* Returns the applicant contact name of this vr applicant profile history.
	*
	* @return the applicant contact name of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantContactName() {
		return _vrApplicantProfileHistory.getApplicantContactName();
	}

	/**
	* Returns the applicant contact phone of this vr applicant profile history.
	*
	* @return the applicant contact phone of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantContactPhone() {
		return _vrApplicantProfileHistory.getApplicantContactPhone();
	}

	/**
	* Returns the applicant email of this vr applicant profile history.
	*
	* @return the applicant email of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantEmail() {
		return _vrApplicantProfileHistory.getApplicantEmail();
	}

	/**
	* Returns the applicant fax of this vr applicant profile history.
	*
	* @return the applicant fax of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantFax() {
		return _vrApplicantProfileHistory.getApplicantFax();
	}

	/**
	* Returns the applicant metadata of this vr applicant profile history.
	*
	* @return the applicant metadata of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantMetadata() {
		return _vrApplicantProfileHistory.getApplicantMetadata();
	}

	/**
	* Returns the applicant name of this vr applicant profile history.
	*
	* @return the applicant name of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _vrApplicantProfileHistory.getApplicantName();
	}

	/**
	* Returns the applicant nationality of this vr applicant profile history.
	*
	* @return the applicant nationality of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantNationality() {
		return _vrApplicantProfileHistory.getApplicantNationality();
	}

	/**
	* Returns the applicant operation period of this vr applicant profile history.
	*
	* @return the applicant operation period of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantOperationPeriod() {
		return _vrApplicantProfileHistory.getApplicantOperationPeriod();
	}

	/**
	* Returns the applicant phone of this vr applicant profile history.
	*
	* @return the applicant phone of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantPhone() {
		return _vrApplicantProfileHistory.getApplicantPhone();
	}

	/**
	* Returns the applicant region of this vr applicant profile history.
	*
	* @return the applicant region of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantRegion() {
		return _vrApplicantProfileHistory.getApplicantRegion();
	}

	/**
	* Returns the applicant representative of this vr applicant profile history.
	*
	* @return the applicant representative of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantRepresentative() {
		return _vrApplicantProfileHistory.getApplicantRepresentative();
	}

	/**
	* Returns the applicant representative title of this vr applicant profile history.
	*
	* @return the applicant representative title of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantRepresentativeTitle() {
		return _vrApplicantProfileHistory.getApplicantRepresentativeTitle();
	}

	/**
	* Returns the applicant status of this vr applicant profile history.
	*
	* @return the applicant status of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantStatus() {
		return _vrApplicantProfileHistory.getApplicantStatus();
	}

	/**
	* Returns the corporation ID of this vr applicant profile history.
	*
	* @return the corporation ID of this vr applicant profile history
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _vrApplicantProfileHistory.getCorporationId();
	}

	/**
	* Returns the issue type description of this vr applicant profile history.
	*
	* @return the issue type description of this vr applicant profile history
	*/
	@Override
	public java.lang.String getIssueTypeDescription() {
		return _vrApplicantProfileHistory.getIssueTypeDescription();
	}

	/**
	* Returns the issue type xcd of this vr applicant profile history.
	*
	* @return the issue type xcd of this vr applicant profile history
	*/
	@Override
	public java.lang.String getIssueTypeXCD() {
		return _vrApplicantProfileHistory.getIssueTypeXCD();
	}

	/**
	* Returns the issue type xcg of this vr applicant profile history.
	*
	* @return the issue type xcg of this vr applicant profile history
	*/
	@Override
	public java.lang.String getIssueTypeXCG() {
		return _vrApplicantProfileHistory.getIssueTypeXCG();
	}

	/**
	* Returns the issue type xch of this vr applicant profile history.
	*
	* @return the issue type xch of this vr applicant profile history
	*/
	@Override
	public java.lang.String getIssueTypeXCH() {
		return _vrApplicantProfileHistory.getIssueTypeXCH();
	}

	/**
	* Returns the issue type xcn of this vr applicant profile history.
	*
	* @return the issue type xcn of this vr applicant profile history
	*/
	@Override
	public java.lang.String getIssueTypeXCN() {
		return _vrApplicantProfileHistory.getIssueTypeXCN();
	}

	/**
	* Returns the issue type xdd of this vr applicant profile history.
	*
	* @return the issue type xdd of this vr applicant profile history
	*/
	@Override
	public java.lang.String getIssueTypeXDD() {
		return _vrApplicantProfileHistory.getIssueTypeXDD();
	}

	/**
	* Returns the issue type xmy of this vr applicant profile history.
	*
	* @return the issue type xmy of this vr applicant profile history
	*/
	@Override
	public java.lang.String getIssueTypeXMY() {
		return _vrApplicantProfileHistory.getIssueTypeXMY();
	}

	/**
	* Returns the mapping dia_chi_cty of this vr applicant profile history.
	*
	* @return the mapping dia_chi_cty of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMappingDIA_CHI_CTY() {
		return _vrApplicantProfileHistory.getMappingDIA_CHI_CTY();
	}

	/**
	* Returns the mapping ma_cty of this vr applicant profile history.
	*
	* @return the mapping ma_cty of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMappingMA_CTY() {
		return _vrApplicantProfileHistory.getMappingMA_CTY();
	}

	/**
	* Returns the mapping note of this vr applicant profile history.
	*
	* @return the mapping note of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMappingNote() {
		return _vrApplicantProfileHistory.getMappingNote();
	}

	/**
	* Returns the mapping status of this vr applicant profile history.
	*
	* @return the mapping status of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMappingStatus() {
		return _vrApplicantProfileHistory.getMappingStatus();
	}

	/**
	* Returns the mapping ten_cty of this vr applicant profile history.
	*
	* @return the mapping ten_cty of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMappingTEN_CTY() {
		return _vrApplicantProfileHistory.getMappingTEN_CTY();
	}

	/**
	* Returns the markup component xcd of this vr applicant profile history.
	*
	* @return the markup component xcd of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupComponentXCD() {
		return _vrApplicantProfileHistory.getMarkupComponentXCD();
	}

	/**
	* Returns the markup component xcg of this vr applicant profile history.
	*
	* @return the markup component xcg of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupComponentXCG() {
		return _vrApplicantProfileHistory.getMarkupComponentXCG();
	}

	/**
	* Returns the markup component xch of this vr applicant profile history.
	*
	* @return the markup component xch of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupComponentXCH() {
		return _vrApplicantProfileHistory.getMarkupComponentXCH();
	}

	/**
	* Returns the markup component xcn of this vr applicant profile history.
	*
	* @return the markup component xcn of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupComponentXCN() {
		return _vrApplicantProfileHistory.getMarkupComponentXCN();
	}

	/**
	* Returns the markup component xdd of this vr applicant profile history.
	*
	* @return the markup component xdd of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupComponentXDD() {
		return _vrApplicantProfileHistory.getMarkupComponentXDD();
	}

	/**
	* Returns the markup component xmy of this vr applicant profile history.
	*
	* @return the markup component xmy of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupComponentXMY() {
		return _vrApplicantProfileHistory.getMarkupComponentXMY();
	}

	/**
	* Returns the markup corporation of this vr applicant profile history.
	*
	* @return the markup corporation of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupCorporation() {
		return _vrApplicantProfileHistory.getMarkupCorporation();
	}

	/**
	* Returns the markup designer of this vr applicant profile history.
	*
	* @return the markup designer of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupDesigner() {
		return _vrApplicantProfileHistory.getMarkupDesigner();
	}

	/**
	* Returns the markup domestics manufacturer of this vr applicant profile history.
	*
	* @return the markup domestics manufacturer of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupDomesticsManufacturer() {
		return _vrApplicantProfileHistory.getMarkupDomesticsManufacturer();
	}

	/**
	* Returns the markup importer of this vr applicant profile history.
	*
	* @return the markup importer of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupImporter() {
		return _vrApplicantProfileHistory.getMarkupImporter();
	}

	/**
	* Returns the markup overseas manufacturer of this vr applicant profile history.
	*
	* @return the markup overseas manufacturer of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupOverseasManufacturer() {
		return _vrApplicantProfileHistory.getMarkupOverseasManufacturer();
	}

	/**
	* Returns the markup xcd of this vr applicant profile history.
	*
	* @return the markup xcd of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupXCD() {
		return _vrApplicantProfileHistory.getMarkupXCD();
	}

	/**
	* Returns the markup xcg of this vr applicant profile history.
	*
	* @return the markup xcg of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupXCG() {
		return _vrApplicantProfileHistory.getMarkupXCG();
	}

	/**
	* Returns the markup xch of this vr applicant profile history.
	*
	* @return the markup xch of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupXCH() {
		return _vrApplicantProfileHistory.getMarkupXCH();
	}

	/**
	* Returns the markup xcn of this vr applicant profile history.
	*
	* @return the markup xcn of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupXCN() {
		return _vrApplicantProfileHistory.getMarkupXCN();
	}

	/**
	* Returns the markup xdd of this vr applicant profile history.
	*
	* @return the markup xdd of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupXDD() {
		return _vrApplicantProfileHistory.getMarkupXDD();
	}

	/**
	* Returns the markup xmy of this vr applicant profile history.
	*
	* @return the markup xmy of this vr applicant profile history
	*/
	@Override
	public java.lang.String getMarkupXMY() {
		return _vrApplicantProfileHistory.getMarkupXMY();
	}

	@Override
	public java.lang.String toString() {
		return _vrApplicantProfileHistory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrApplicantProfileHistory.toXmlString();
	}

	/**
	* Returns the modify date of this vr applicant profile history.
	*
	* @return the modify date of this vr applicant profile history
	*/
	@Override
	public Date getModifyDate() {
		return _vrApplicantProfileHistory.getModifyDate();
	}

	/**
	* Returns the sync date of this vr applicant profile history.
	*
	* @return the sync date of this vr applicant profile history
	*/
	@Override
	public Date getSyncDate() {
		return _vrApplicantProfileHistory.getSyncDate();
	}

	/**
	* Returns the ID of this vr applicant profile history.
	*
	* @return the ID of this vr applicant profile history
	*/
	@Override
	public long getId() {
		return _vrApplicantProfileHistory.getId();
	}

	/**
	* Returns the mt core of this vr applicant profile history.
	*
	* @return the mt core of this vr applicant profile history
	*/
	@Override
	public long getMtCore() {
		return _vrApplicantProfileHistory.getMtCore();
	}

	/**
	* Returns the primary key of this vr applicant profile history.
	*
	* @return the primary key of this vr applicant profile history
	*/
	@Override
	public long getPrimaryKey() {
		return _vrApplicantProfileHistory.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrApplicantProfileHistory.persist();
	}

	/**
	* Sets the applicant address of this vr applicant profile history.
	*
	* @param applicantAddress the applicant address of this vr applicant profile history
	*/
	@Override
	public void setApplicantAddress(java.lang.String applicantAddress) {
		_vrApplicantProfileHistory.setApplicantAddress(applicantAddress);
	}

	/**
	* Sets the applicant business type of this vr applicant profile history.
	*
	* @param applicantBusinessType the applicant business type of this vr applicant profile history
	*/
	@Override
	public void setApplicantBusinessType(java.lang.String applicantBusinessType) {
		_vrApplicantProfileHistory.setApplicantBusinessType(applicantBusinessType);
	}

	/**
	* Sets the applicant ceremony date of this vr applicant profile history.
	*
	* @param applicantCeremonyDate the applicant ceremony date of this vr applicant profile history
	*/
	@Override
	public void setApplicantCeremonyDate(java.lang.String applicantCeremonyDate) {
		_vrApplicantProfileHistory.setApplicantCeremonyDate(applicantCeremonyDate);
	}

	/**
	* Sets the applicant city of this vr applicant profile history.
	*
	* @param applicantCity the applicant city of this vr applicant profile history
	*/
	@Override
	public void setApplicantCity(java.lang.String applicantCity) {
		_vrApplicantProfileHistory.setApplicantCity(applicantCity);
	}

	/**
	* Sets the applicant code of this vr applicant profile history.
	*
	* @param applicantCode the applicant code of this vr applicant profile history
	*/
	@Override
	public void setApplicantCode(java.lang.String applicantCode) {
		_vrApplicantProfileHistory.setApplicantCode(applicantCode);
	}

	/**
	* Sets the applicant contact email of this vr applicant profile history.
	*
	* @param applicantContactEmail the applicant contact email of this vr applicant profile history
	*/
	@Override
	public void setApplicantContactEmail(java.lang.String applicantContactEmail) {
		_vrApplicantProfileHistory.setApplicantContactEmail(applicantContactEmail);
	}

	/**
	* Sets the applicant contact name of this vr applicant profile history.
	*
	* @param applicantContactName the applicant contact name of this vr applicant profile history
	*/
	@Override
	public void setApplicantContactName(java.lang.String applicantContactName) {
		_vrApplicantProfileHistory.setApplicantContactName(applicantContactName);
	}

	/**
	* Sets the applicant contact phone of this vr applicant profile history.
	*
	* @param applicantContactPhone the applicant contact phone of this vr applicant profile history
	*/
	@Override
	public void setApplicantContactPhone(java.lang.String applicantContactPhone) {
		_vrApplicantProfileHistory.setApplicantContactPhone(applicantContactPhone);
	}

	/**
	* Sets the applicant email of this vr applicant profile history.
	*
	* @param applicantEmail the applicant email of this vr applicant profile history
	*/
	@Override
	public void setApplicantEmail(java.lang.String applicantEmail) {
		_vrApplicantProfileHistory.setApplicantEmail(applicantEmail);
	}

	/**
	* Sets the applicant fax of this vr applicant profile history.
	*
	* @param applicantFax the applicant fax of this vr applicant profile history
	*/
	@Override
	public void setApplicantFax(java.lang.String applicantFax) {
		_vrApplicantProfileHistory.setApplicantFax(applicantFax);
	}

	/**
	* Sets the applicant metadata of this vr applicant profile history.
	*
	* @param applicantMetadata the applicant metadata of this vr applicant profile history
	*/
	@Override
	public void setApplicantMetadata(java.lang.String applicantMetadata) {
		_vrApplicantProfileHistory.setApplicantMetadata(applicantMetadata);
	}

	/**
	* Sets the applicant name of this vr applicant profile history.
	*
	* @param applicantName the applicant name of this vr applicant profile history
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_vrApplicantProfileHistory.setApplicantName(applicantName);
	}

	/**
	* Sets the applicant nationality of this vr applicant profile history.
	*
	* @param applicantNationality the applicant nationality of this vr applicant profile history
	*/
	@Override
	public void setApplicantNationality(java.lang.String applicantNationality) {
		_vrApplicantProfileHistory.setApplicantNationality(applicantNationality);
	}

	/**
	* Sets the applicant operation period of this vr applicant profile history.
	*
	* @param applicantOperationPeriod the applicant operation period of this vr applicant profile history
	*/
	@Override
	public void setApplicantOperationPeriod(
		java.lang.String applicantOperationPeriod) {
		_vrApplicantProfileHistory.setApplicantOperationPeriod(applicantOperationPeriod);
	}

	/**
	* Sets the applicant phone of this vr applicant profile history.
	*
	* @param applicantPhone the applicant phone of this vr applicant profile history
	*/
	@Override
	public void setApplicantPhone(java.lang.String applicantPhone) {
		_vrApplicantProfileHistory.setApplicantPhone(applicantPhone);
	}

	/**
	* Sets the applicant region of this vr applicant profile history.
	*
	* @param applicantRegion the applicant region of this vr applicant profile history
	*/
	@Override
	public void setApplicantRegion(java.lang.String applicantRegion) {
		_vrApplicantProfileHistory.setApplicantRegion(applicantRegion);
	}

	/**
	* Sets the applicant representative of this vr applicant profile history.
	*
	* @param applicantRepresentative the applicant representative of this vr applicant profile history
	*/
	@Override
	public void setApplicantRepresentative(
		java.lang.String applicantRepresentative) {
		_vrApplicantProfileHistory.setApplicantRepresentative(applicantRepresentative);
	}

	/**
	* Sets the applicant representative title of this vr applicant profile history.
	*
	* @param applicantRepresentativeTitle the applicant representative title of this vr applicant profile history
	*/
	@Override
	public void setApplicantRepresentativeTitle(
		java.lang.String applicantRepresentativeTitle) {
		_vrApplicantProfileHistory.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
	}

	/**
	* Sets the applicant status of this vr applicant profile history.
	*
	* @param applicantStatus the applicant status of this vr applicant profile history
	*/
	@Override
	public void setApplicantStatus(java.lang.String applicantStatus) {
		_vrApplicantProfileHistory.setApplicantStatus(applicantStatus);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrApplicantProfileHistory.setCachedModel(cachedModel);
	}

	/**
	* Sets the corporation ID of this vr applicant profile history.
	*
	* @param corporationId the corporation ID of this vr applicant profile history
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_vrApplicantProfileHistory.setCorporationId(corporationId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrApplicantProfileHistory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrApplicantProfileHistory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrApplicantProfileHistory.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr applicant profile history.
	*
	* @param id the ID of this vr applicant profile history
	*/
	@Override
	public void setId(long id) {
		_vrApplicantProfileHistory.setId(id);
	}

	/**
	* Sets the issue type description of this vr applicant profile history.
	*
	* @param issueTypeDescription the issue type description of this vr applicant profile history
	*/
	@Override
	public void setIssueTypeDescription(java.lang.String issueTypeDescription) {
		_vrApplicantProfileHistory.setIssueTypeDescription(issueTypeDescription);
	}

	/**
	* Sets the issue type xcd of this vr applicant profile history.
	*
	* @param issueTypeXCD the issue type xcd of this vr applicant profile history
	*/
	@Override
	public void setIssueTypeXCD(java.lang.String issueTypeXCD) {
		_vrApplicantProfileHistory.setIssueTypeXCD(issueTypeXCD);
	}

	/**
	* Sets the issue type xcg of this vr applicant profile history.
	*
	* @param issueTypeXCG the issue type xcg of this vr applicant profile history
	*/
	@Override
	public void setIssueTypeXCG(java.lang.String issueTypeXCG) {
		_vrApplicantProfileHistory.setIssueTypeXCG(issueTypeXCG);
	}

	/**
	* Sets the issue type xch of this vr applicant profile history.
	*
	* @param issueTypeXCH the issue type xch of this vr applicant profile history
	*/
	@Override
	public void setIssueTypeXCH(java.lang.String issueTypeXCH) {
		_vrApplicantProfileHistory.setIssueTypeXCH(issueTypeXCH);
	}

	/**
	* Sets the issue type xcn of this vr applicant profile history.
	*
	* @param issueTypeXCN the issue type xcn of this vr applicant profile history
	*/
	@Override
	public void setIssueTypeXCN(java.lang.String issueTypeXCN) {
		_vrApplicantProfileHistory.setIssueTypeXCN(issueTypeXCN);
	}

	/**
	* Sets the issue type xdd of this vr applicant profile history.
	*
	* @param issueTypeXDD the issue type xdd of this vr applicant profile history
	*/
	@Override
	public void setIssueTypeXDD(java.lang.String issueTypeXDD) {
		_vrApplicantProfileHistory.setIssueTypeXDD(issueTypeXDD);
	}

	/**
	* Sets the issue type xmy of this vr applicant profile history.
	*
	* @param issueTypeXMY the issue type xmy of this vr applicant profile history
	*/
	@Override
	public void setIssueTypeXMY(java.lang.String issueTypeXMY) {
		_vrApplicantProfileHistory.setIssueTypeXMY(issueTypeXMY);
	}

	/**
	* Sets the mapping dia_chi_cty of this vr applicant profile history.
	*
	* @param mappingDIA_CHI_CTY the mapping dia_chi_cty of this vr applicant profile history
	*/
	@Override
	public void setMappingDIA_CHI_CTY(java.lang.String mappingDIA_CHI_CTY) {
		_vrApplicantProfileHistory.setMappingDIA_CHI_CTY(mappingDIA_CHI_CTY);
	}

	/**
	* Sets the mapping ma_cty of this vr applicant profile history.
	*
	* @param mappingMA_CTY the mapping ma_cty of this vr applicant profile history
	*/
	@Override
	public void setMappingMA_CTY(java.lang.String mappingMA_CTY) {
		_vrApplicantProfileHistory.setMappingMA_CTY(mappingMA_CTY);
	}

	/**
	* Sets the mapping note of this vr applicant profile history.
	*
	* @param mappingNote the mapping note of this vr applicant profile history
	*/
	@Override
	public void setMappingNote(java.lang.String mappingNote) {
		_vrApplicantProfileHistory.setMappingNote(mappingNote);
	}

	/**
	* Sets the mapping status of this vr applicant profile history.
	*
	* @param mappingStatus the mapping status of this vr applicant profile history
	*/
	@Override
	public void setMappingStatus(java.lang.String mappingStatus) {
		_vrApplicantProfileHistory.setMappingStatus(mappingStatus);
	}

	/**
	* Sets the mapping ten_cty of this vr applicant profile history.
	*
	* @param mappingTEN_CTY the mapping ten_cty of this vr applicant profile history
	*/
	@Override
	public void setMappingTEN_CTY(java.lang.String mappingTEN_CTY) {
		_vrApplicantProfileHistory.setMappingTEN_CTY(mappingTEN_CTY);
	}

	/**
	* Sets the markup component xcd of this vr applicant profile history.
	*
	* @param markupComponentXCD the markup component xcd of this vr applicant profile history
	*/
	@Override
	public void setMarkupComponentXCD(java.lang.String markupComponentXCD) {
		_vrApplicantProfileHistory.setMarkupComponentXCD(markupComponentXCD);
	}

	/**
	* Sets the markup component xcg of this vr applicant profile history.
	*
	* @param markupComponentXCG the markup component xcg of this vr applicant profile history
	*/
	@Override
	public void setMarkupComponentXCG(java.lang.String markupComponentXCG) {
		_vrApplicantProfileHistory.setMarkupComponentXCG(markupComponentXCG);
	}

	/**
	* Sets the markup component xch of this vr applicant profile history.
	*
	* @param markupComponentXCH the markup component xch of this vr applicant profile history
	*/
	@Override
	public void setMarkupComponentXCH(java.lang.String markupComponentXCH) {
		_vrApplicantProfileHistory.setMarkupComponentXCH(markupComponentXCH);
	}

	/**
	* Sets the markup component xcn of this vr applicant profile history.
	*
	* @param markupComponentXCN the markup component xcn of this vr applicant profile history
	*/
	@Override
	public void setMarkupComponentXCN(java.lang.String markupComponentXCN) {
		_vrApplicantProfileHistory.setMarkupComponentXCN(markupComponentXCN);
	}

	/**
	* Sets the markup component xdd of this vr applicant profile history.
	*
	* @param markupComponentXDD the markup component xdd of this vr applicant profile history
	*/
	@Override
	public void setMarkupComponentXDD(java.lang.String markupComponentXDD) {
		_vrApplicantProfileHistory.setMarkupComponentXDD(markupComponentXDD);
	}

	/**
	* Sets the markup component xmy of this vr applicant profile history.
	*
	* @param markupComponentXMY the markup component xmy of this vr applicant profile history
	*/
	@Override
	public void setMarkupComponentXMY(java.lang.String markupComponentXMY) {
		_vrApplicantProfileHistory.setMarkupComponentXMY(markupComponentXMY);
	}

	/**
	* Sets the markup corporation of this vr applicant profile history.
	*
	* @param markupCorporation the markup corporation of this vr applicant profile history
	*/
	@Override
	public void setMarkupCorporation(java.lang.String markupCorporation) {
		_vrApplicantProfileHistory.setMarkupCorporation(markupCorporation);
	}

	/**
	* Sets the markup designer of this vr applicant profile history.
	*
	* @param markupDesigner the markup designer of this vr applicant profile history
	*/
	@Override
	public void setMarkupDesigner(java.lang.String markupDesigner) {
		_vrApplicantProfileHistory.setMarkupDesigner(markupDesigner);
	}

	/**
	* Sets the markup domestics manufacturer of this vr applicant profile history.
	*
	* @param markupDomesticsManufacturer the markup domestics manufacturer of this vr applicant profile history
	*/
	@Override
	public void setMarkupDomesticsManufacturer(
		java.lang.String markupDomesticsManufacturer) {
		_vrApplicantProfileHistory.setMarkupDomesticsManufacturer(markupDomesticsManufacturer);
	}

	/**
	* Sets the markup importer of this vr applicant profile history.
	*
	* @param markupImporter the markup importer of this vr applicant profile history
	*/
	@Override
	public void setMarkupImporter(java.lang.String markupImporter) {
		_vrApplicantProfileHistory.setMarkupImporter(markupImporter);
	}

	/**
	* Sets the markup overseas manufacturer of this vr applicant profile history.
	*
	* @param markupOverseasManufacturer the markup overseas manufacturer of this vr applicant profile history
	*/
	@Override
	public void setMarkupOverseasManufacturer(
		java.lang.String markupOverseasManufacturer) {
		_vrApplicantProfileHistory.setMarkupOverseasManufacturer(markupOverseasManufacturer);
	}

	/**
	* Sets the markup xcd of this vr applicant profile history.
	*
	* @param markupXCD the markup xcd of this vr applicant profile history
	*/
	@Override
	public void setMarkupXCD(java.lang.String markupXCD) {
		_vrApplicantProfileHistory.setMarkupXCD(markupXCD);
	}

	/**
	* Sets the markup xcg of this vr applicant profile history.
	*
	* @param markupXCG the markup xcg of this vr applicant profile history
	*/
	@Override
	public void setMarkupXCG(java.lang.String markupXCG) {
		_vrApplicantProfileHistory.setMarkupXCG(markupXCG);
	}

	/**
	* Sets the markup xch of this vr applicant profile history.
	*
	* @param markupXCH the markup xch of this vr applicant profile history
	*/
	@Override
	public void setMarkupXCH(java.lang.String markupXCH) {
		_vrApplicantProfileHistory.setMarkupXCH(markupXCH);
	}

	/**
	* Sets the markup xcn of this vr applicant profile history.
	*
	* @param markupXCN the markup xcn of this vr applicant profile history
	*/
	@Override
	public void setMarkupXCN(java.lang.String markupXCN) {
		_vrApplicantProfileHistory.setMarkupXCN(markupXCN);
	}

	/**
	* Sets the markup xdd of this vr applicant profile history.
	*
	* @param markupXDD the markup xdd of this vr applicant profile history
	*/
	@Override
	public void setMarkupXDD(java.lang.String markupXDD) {
		_vrApplicantProfileHistory.setMarkupXDD(markupXDD);
	}

	/**
	* Sets the markup xmy of this vr applicant profile history.
	*
	* @param markupXMY the markup xmy of this vr applicant profile history
	*/
	@Override
	public void setMarkupXMY(java.lang.String markupXMY) {
		_vrApplicantProfileHistory.setMarkupXMY(markupXMY);
	}

	/**
	* Sets the modify date of this vr applicant profile history.
	*
	* @param modifyDate the modify date of this vr applicant profile history
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrApplicantProfileHistory.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr applicant profile history.
	*
	* @param mtCore the mt core of this vr applicant profile history
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrApplicantProfileHistory.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrApplicantProfileHistory.setNew(n);
	}

	/**
	* Sets the primary key of this vr applicant profile history.
	*
	* @param primaryKey the primary key of this vr applicant profile history
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrApplicantProfileHistory.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrApplicantProfileHistory.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sync date of this vr applicant profile history.
	*
	* @param syncDate the sync date of this vr applicant profile history
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrApplicantProfileHistory.setSyncDate(syncDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRApplicantProfileHistoryWrapper)) {
			return false;
		}

		VRApplicantProfileHistoryWrapper vrApplicantProfileHistoryWrapper = (VRApplicantProfileHistoryWrapper)obj;

		if (Objects.equals(_vrApplicantProfileHistory,
					vrApplicantProfileHistoryWrapper._vrApplicantProfileHistory)) {
			return true;
		}

		return false;
	}

	@Override
	public VRApplicantProfileHistory getWrappedModel() {
		return _vrApplicantProfileHistory;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrApplicantProfileHistory.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrApplicantProfileHistory.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrApplicantProfileHistory.resetOriginalValues();
	}

	private final VRApplicantProfileHistory _vrApplicantProfileHistory;
}