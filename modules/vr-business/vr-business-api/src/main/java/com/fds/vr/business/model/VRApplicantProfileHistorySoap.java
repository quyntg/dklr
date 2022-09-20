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
public class VRApplicantProfileHistorySoap implements Serializable {
	public static VRApplicantProfileHistorySoap toSoapModel(
		VRApplicantProfileHistory model) {
		VRApplicantProfileHistorySoap soapModel = new VRApplicantProfileHistorySoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setMappingMA_CTY(model.getMappingMA_CTY());
		soapModel.setMappingTEN_CTY(model.getMappingTEN_CTY());
		soapModel.setMappingDIA_CHI_CTY(model.getMappingDIA_CHI_CTY());
		soapModel.setMappingNote(model.getMappingNote());
		soapModel.setMappingStatus(model.getMappingStatus());
		soapModel.setApplicantCode(model.getApplicantCode());
		soapModel.setApplicantName(model.getApplicantName());
		soapModel.setApplicantAddress(model.getApplicantAddress());
		soapModel.setApplicantRepresentative(model.getApplicantRepresentative());
		soapModel.setApplicantRepresentativeTitle(model.getApplicantRepresentativeTitle());
		soapModel.setApplicantPhone(model.getApplicantPhone());
		soapModel.setApplicantEmail(model.getApplicantEmail());
		soapModel.setApplicantFax(model.getApplicantFax());
		soapModel.setApplicantContactName(model.getApplicantContactName());
		soapModel.setApplicantContactEmail(model.getApplicantContactEmail());
		soapModel.setApplicantContactPhone(model.getApplicantContactPhone());
		soapModel.setApplicantNationality(model.getApplicantNationality());
		soapModel.setApplicantRegion(model.getApplicantRegion());
		soapModel.setApplicantCity(model.getApplicantCity());
		soapModel.setMarkupCorporation(model.getMarkupCorporation());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setMarkupDesigner(model.getMarkupDesigner());
		soapModel.setMarkupOverseasManufacturer(model.getMarkupOverseasManufacturer());
		soapModel.setMarkupDomesticsManufacturer(model.getMarkupDomesticsManufacturer());
		soapModel.setMarkupImporter(model.getMarkupImporter());
		soapModel.setMarkupComponentXCG(model.getMarkupComponentXCG());
		soapModel.setMarkupComponentXMY(model.getMarkupComponentXMY());
		soapModel.setMarkupComponentXCD(model.getMarkupComponentXCD());
		soapModel.setMarkupComponentXDD(model.getMarkupComponentXDD());
		soapModel.setMarkupComponentXCN(model.getMarkupComponentXCN());
		soapModel.setMarkupComponentXCH(model.getMarkupComponentXCH());
		soapModel.setMarkupXCG(model.getMarkupXCG());
		soapModel.setMarkupXMY(model.getMarkupXMY());
		soapModel.setMarkupXCD(model.getMarkupXCD());
		soapModel.setMarkupXDD(model.getMarkupXDD());
		soapModel.setMarkupXCN(model.getMarkupXCN());
		soapModel.setMarkupXCH(model.getMarkupXCH());
		soapModel.setIssueTypeXCG(model.getIssueTypeXCG());
		soapModel.setIssueTypeXMY(model.getIssueTypeXMY());
		soapModel.setIssueTypeXCD(model.getIssueTypeXCD());
		soapModel.setIssueTypeXDD(model.getIssueTypeXDD());
		soapModel.setIssueTypeXCN(model.getIssueTypeXCN());
		soapModel.setIssueTypeXCH(model.getIssueTypeXCH());
		soapModel.setIssueTypeDescription(model.getIssueTypeDescription());
		soapModel.setApplicantCeremonyDate(model.getApplicantCeremonyDate());
		soapModel.setApplicantOperationPeriod(model.getApplicantOperationPeriod());
		soapModel.setApplicantBusinessType(model.getApplicantBusinessType());
		soapModel.setApplicantMetadata(model.getApplicantMetadata());
		soapModel.setApplicantStatus(model.getApplicantStatus());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRApplicantProfileHistorySoap[] toSoapModels(
		VRApplicantProfileHistory[] models) {
		VRApplicantProfileHistorySoap[] soapModels = new VRApplicantProfileHistorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRApplicantProfileHistorySoap[][] toSoapModels(
		VRApplicantProfileHistory[][] models) {
		VRApplicantProfileHistorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRApplicantProfileHistorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRApplicantProfileHistorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRApplicantProfileHistorySoap[] toSoapModels(
		List<VRApplicantProfileHistory> models) {
		List<VRApplicantProfileHistorySoap> soapModels = new ArrayList<VRApplicantProfileHistorySoap>(models.size());

		for (VRApplicantProfileHistory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRApplicantProfileHistorySoap[soapModels.size()]);
	}

	public VRApplicantProfileHistorySoap() {
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

	public String getApplicantCode() {
		return _applicantCode;
	}

	public void setApplicantCode(String applicantCode) {
		_applicantCode = applicantCode;
	}

	public String getApplicantName() {
		return _applicantName;
	}

	public void setApplicantName(String applicantName) {
		_applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return _applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		_applicantAddress = applicantAddress;
	}

	public String getApplicantRepresentative() {
		return _applicantRepresentative;
	}

	public void setApplicantRepresentative(String applicantRepresentative) {
		_applicantRepresentative = applicantRepresentative;
	}

	public String getApplicantRepresentativeTitle() {
		return _applicantRepresentativeTitle;
	}

	public void setApplicantRepresentativeTitle(
		String applicantRepresentativeTitle) {
		_applicantRepresentativeTitle = applicantRepresentativeTitle;
	}

	public String getApplicantPhone() {
		return _applicantPhone;
	}

	public void setApplicantPhone(String applicantPhone) {
		_applicantPhone = applicantPhone;
	}

	public String getApplicantEmail() {
		return _applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		_applicantEmail = applicantEmail;
	}

	public String getApplicantFax() {
		return _applicantFax;
	}

	public void setApplicantFax(String applicantFax) {
		_applicantFax = applicantFax;
	}

	public String getApplicantContactName() {
		return _applicantContactName;
	}

	public void setApplicantContactName(String applicantContactName) {
		_applicantContactName = applicantContactName;
	}

	public String getApplicantContactEmail() {
		return _applicantContactEmail;
	}

	public void setApplicantContactEmail(String applicantContactEmail) {
		_applicantContactEmail = applicantContactEmail;
	}

	public String getApplicantContactPhone() {
		return _applicantContactPhone;
	}

	public void setApplicantContactPhone(String applicantContactPhone) {
		_applicantContactPhone = applicantContactPhone;
	}

	public String getApplicantNationality() {
		return _applicantNationality;
	}

	public void setApplicantNationality(String applicantNationality) {
		_applicantNationality = applicantNationality;
	}

	public String getApplicantRegion() {
		return _applicantRegion;
	}

	public void setApplicantRegion(String applicantRegion) {
		_applicantRegion = applicantRegion;
	}

	public String getApplicantCity() {
		return _applicantCity;
	}

	public void setApplicantCity(String applicantCity) {
		_applicantCity = applicantCity;
	}

	public String getMarkupCorporation() {
		return _markupCorporation;
	}

	public void setMarkupCorporation(String markupCorporation) {
		_markupCorporation = markupCorporation;
	}

	public String getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;
	}

	public String getMarkupDesigner() {
		return _markupDesigner;
	}

	public void setMarkupDesigner(String markupDesigner) {
		_markupDesigner = markupDesigner;
	}

	public String getMarkupOverseasManufacturer() {
		return _markupOverseasManufacturer;
	}

	public void setMarkupOverseasManufacturer(String markupOverseasManufacturer) {
		_markupOverseasManufacturer = markupOverseasManufacturer;
	}

	public String getMarkupDomesticsManufacturer() {
		return _markupDomesticsManufacturer;
	}

	public void setMarkupDomesticsManufacturer(
		String markupDomesticsManufacturer) {
		_markupDomesticsManufacturer = markupDomesticsManufacturer;
	}

	public String getMarkupImporter() {
		return _markupImporter;
	}

	public void setMarkupImporter(String markupImporter) {
		_markupImporter = markupImporter;
	}

	public String getMarkupComponentXCG() {
		return _markupComponentXCG;
	}

	public void setMarkupComponentXCG(String markupComponentXCG) {
		_markupComponentXCG = markupComponentXCG;
	}

	public String getMarkupComponentXMY() {
		return _markupComponentXMY;
	}

	public void setMarkupComponentXMY(String markupComponentXMY) {
		_markupComponentXMY = markupComponentXMY;
	}

	public String getMarkupComponentXCD() {
		return _markupComponentXCD;
	}

	public void setMarkupComponentXCD(String markupComponentXCD) {
		_markupComponentXCD = markupComponentXCD;
	}

	public String getMarkupComponentXDD() {
		return _markupComponentXDD;
	}

	public void setMarkupComponentXDD(String markupComponentXDD) {
		_markupComponentXDD = markupComponentXDD;
	}

	public String getMarkupComponentXCN() {
		return _markupComponentXCN;
	}

	public void setMarkupComponentXCN(String markupComponentXCN) {
		_markupComponentXCN = markupComponentXCN;
	}

	public String getMarkupComponentXCH() {
		return _markupComponentXCH;
	}

	public void setMarkupComponentXCH(String markupComponentXCH) {
		_markupComponentXCH = markupComponentXCH;
	}

	public String getMarkupXCG() {
		return _markupXCG;
	}

	public void setMarkupXCG(String markupXCG) {
		_markupXCG = markupXCG;
	}

	public String getMarkupXMY() {
		return _markupXMY;
	}

	public void setMarkupXMY(String markupXMY) {
		_markupXMY = markupXMY;
	}

	public String getMarkupXCD() {
		return _markupXCD;
	}

	public void setMarkupXCD(String markupXCD) {
		_markupXCD = markupXCD;
	}

	public String getMarkupXDD() {
		return _markupXDD;
	}

	public void setMarkupXDD(String markupXDD) {
		_markupXDD = markupXDD;
	}

	public String getMarkupXCN() {
		return _markupXCN;
	}

	public void setMarkupXCN(String markupXCN) {
		_markupXCN = markupXCN;
	}

	public String getMarkupXCH() {
		return _markupXCH;
	}

	public void setMarkupXCH(String markupXCH) {
		_markupXCH = markupXCH;
	}

	public String getIssueTypeXCG() {
		return _issueTypeXCG;
	}

	public void setIssueTypeXCG(String issueTypeXCG) {
		_issueTypeXCG = issueTypeXCG;
	}

	public String getIssueTypeXMY() {
		return _issueTypeXMY;
	}

	public void setIssueTypeXMY(String issueTypeXMY) {
		_issueTypeXMY = issueTypeXMY;
	}

	public String getIssueTypeXCD() {
		return _issueTypeXCD;
	}

	public void setIssueTypeXCD(String issueTypeXCD) {
		_issueTypeXCD = issueTypeXCD;
	}

	public String getIssueTypeXDD() {
		return _issueTypeXDD;
	}

	public void setIssueTypeXDD(String issueTypeXDD) {
		_issueTypeXDD = issueTypeXDD;
	}

	public String getIssueTypeXCN() {
		return _issueTypeXCN;
	}

	public void setIssueTypeXCN(String issueTypeXCN) {
		_issueTypeXCN = issueTypeXCN;
	}

	public String getIssueTypeXCH() {
		return _issueTypeXCH;
	}

	public void setIssueTypeXCH(String issueTypeXCH) {
		_issueTypeXCH = issueTypeXCH;
	}

	public String getIssueTypeDescription() {
		return _issueTypeDescription;
	}

	public void setIssueTypeDescription(String issueTypeDescription) {
		_issueTypeDescription = issueTypeDescription;
	}

	public String getApplicantCeremonyDate() {
		return _applicantCeremonyDate;
	}

	public void setApplicantCeremonyDate(String applicantCeremonyDate) {
		_applicantCeremonyDate = applicantCeremonyDate;
	}

	public String getApplicantOperationPeriod() {
		return _applicantOperationPeriod;
	}

	public void setApplicantOperationPeriod(String applicantOperationPeriod) {
		_applicantOperationPeriod = applicantOperationPeriod;
	}

	public String getApplicantBusinessType() {
		return _applicantBusinessType;
	}

	public void setApplicantBusinessType(String applicantBusinessType) {
		_applicantBusinessType = applicantBusinessType;
	}

	public String getApplicantMetadata() {
		return _applicantMetadata;
	}

	public void setApplicantMetadata(String applicantMetadata) {
		_applicantMetadata = applicantMetadata;
	}

	public String getApplicantStatus() {
		return _applicantStatus;
	}

	public void setApplicantStatus(String applicantStatus) {
		_applicantStatus = applicantStatus;
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
	private String _mappingNote;
	private String _mappingStatus;
	private String _applicantCode;
	private String _applicantName;
	private String _applicantAddress;
	private String _applicantRepresentative;
	private String _applicantRepresentativeTitle;
	private String _applicantPhone;
	private String _applicantEmail;
	private String _applicantFax;
	private String _applicantContactName;
	private String _applicantContactEmail;
	private String _applicantContactPhone;
	private String _applicantNationality;
	private String _applicantRegion;
	private String _applicantCity;
	private String _markupCorporation;
	private String _corporationId;
	private String _markupDesigner;
	private String _markupOverseasManufacturer;
	private String _markupDomesticsManufacturer;
	private String _markupImporter;
	private String _markupComponentXCG;
	private String _markupComponentXMY;
	private String _markupComponentXCD;
	private String _markupComponentXDD;
	private String _markupComponentXCN;
	private String _markupComponentXCH;
	private String _markupXCG;
	private String _markupXMY;
	private String _markupXCD;
	private String _markupXDD;
	private String _markupXCN;
	private String _markupXCH;
	private String _issueTypeXCG;
	private String _issueTypeXMY;
	private String _issueTypeXCD;
	private String _issueTypeXDD;
	private String _issueTypeXCN;
	private String _issueTypeXCH;
	private String _issueTypeDescription;
	private String _applicantCeremonyDate;
	private String _applicantOperationPeriod;
	private String _applicantBusinessType;
	private String _applicantMetadata;
	private String _applicantStatus;
	private Date _modifyDate;
	private Date _syncDate;
}