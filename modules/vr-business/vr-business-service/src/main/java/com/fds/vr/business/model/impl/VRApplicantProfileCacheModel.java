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

import com.fds.vr.business.model.VRApplicantProfile;

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
 * The cache model class for representing VRApplicantProfile in entity cache.
 *
 * @author LamTV
 * @see VRApplicantProfile
 * @generated
 */
@ProviderType
public class VRApplicantProfileCacheModel implements CacheModel<VRApplicantProfile>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRApplicantProfileCacheModel)) {
			return false;
		}

		VRApplicantProfileCacheModel vrApplicantProfileCacheModel = (VRApplicantProfileCacheModel)obj;

		if (id == vrApplicantProfileCacheModel.id) {
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
		StringBundler sb = new StringBundler(139);

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
		sb.append(", mappingNote=");
		sb.append(mappingNote);
		sb.append(", mappingStatus=");
		sb.append(mappingStatus);
		sb.append(", applicantCode=");
		sb.append(applicantCode);
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", applicantAddress=");
		sb.append(applicantAddress);
		sb.append(", applicantPhone=");
		sb.append(applicantPhone);
		sb.append(", applicantEmail=");
		sb.append(applicantEmail);
		sb.append(", applicantFax=");
		sb.append(applicantFax);
		sb.append(", applicantWebsite=");
		sb.append(applicantWebsite);
		sb.append(", applicantRepresentativePhone=");
		sb.append(applicantRepresentativePhone);
		sb.append(", applicantRepresentative=");
		sb.append(applicantRepresentative);
		sb.append(", applicantRepresentativeTitle=");
		sb.append(applicantRepresentativeTitle);
		sb.append(", applicantContactName=");
		sb.append(applicantContactName);
		sb.append(", applicantContactEmail=");
		sb.append(applicantContactEmail);
		sb.append(", applicantContactPhone=");
		sb.append(applicantContactPhone);
		sb.append(", applicantNationality=");
		sb.append(applicantNationality);
		sb.append(", applicantNationalityCode=");
		sb.append(applicantNationalityCode);
		sb.append(", applicantRegion=");
		sb.append(applicantRegion);
		sb.append(", applicantRegionCode=");
		sb.append(applicantRegionCode);
		sb.append(", applicantCity=");
		sb.append(applicantCity);
		sb.append(", applicantCityCode=");
		sb.append(applicantCityCode);
		sb.append(", applicantDistrictCode=");
		sb.append(applicantDistrictCode);
		sb.append(", applicantDistrictName=");
		sb.append(applicantDistrictName);
		sb.append(", applicantWardCode=");
		sb.append(applicantWardCode);
		sb.append(", applicantWardName=");
		sb.append(applicantWardName);
		sb.append(", markupCorporation=");
		sb.append(markupCorporation);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", markupDesigner=");
		sb.append(markupDesigner);
		sb.append(", markupOverseasManufacturer=");
		sb.append(markupOverseasManufacturer);
		sb.append(", markupDomesticsManufacturer=");
		sb.append(markupDomesticsManufacturer);
		sb.append(", markupMaintainer=");
		sb.append(markupMaintainer);
		sb.append(", markupImporter=");
		sb.append(markupImporter);
		sb.append(", markupComponentXCG=");
		sb.append(markupComponentXCG);
		sb.append(", markupComponentXMY=");
		sb.append(markupComponentXMY);
		sb.append(", markupComponentXCD=");
		sb.append(markupComponentXCD);
		sb.append(", markupComponentXDD=");
		sb.append(markupComponentXDD);
		sb.append(", markupComponentXCN=");
		sb.append(markupComponentXCN);
		sb.append(", markupComponentXCH=");
		sb.append(markupComponentXCH);
		sb.append(", markupXCG=");
		sb.append(markupXCG);
		sb.append(", markupXMY=");
		sb.append(markupXMY);
		sb.append(", markupXCD=");
		sb.append(markupXCD);
		sb.append(", markupXDD=");
		sb.append(markupXDD);
		sb.append(", markupXCN=");
		sb.append(markupXCN);
		sb.append(", markupXCH=");
		sb.append(markupXCH);
		sb.append(", issueTypeXCG=");
		sb.append(issueTypeXCG);
		sb.append(", issueTypeXMY=");
		sb.append(issueTypeXMY);
		sb.append(", issueTypeXCD=");
		sb.append(issueTypeXCD);
		sb.append(", issueTypeXDD=");
		sb.append(issueTypeXDD);
		sb.append(", issueTypeXCN=");
		sb.append(issueTypeXCN);
		sb.append(", issueTypeXCH=");
		sb.append(issueTypeXCH);
		sb.append(", issueTypeDescription=");
		sb.append(issueTypeDescription);
		sb.append(", applicantCeremonyDate=");
		sb.append(applicantCeremonyDate);
		sb.append(", applicantOperationPeriod=");
		sb.append(applicantOperationPeriod);
		sb.append(", applicantBusinessType=");
		sb.append(applicantBusinessType);
		sb.append(", applicantIdentityType=");
		sb.append(applicantIdentityType);
		sb.append(", applicantIdentityDescription=");
		sb.append(applicantIdentityDescription);
		sb.append(", applicantIdentityFileName=");
		sb.append(applicantIdentityFileName);
		sb.append(", applicantIdentityFileEntryId=");
		sb.append(applicantIdentityFileEntryId);
		sb.append(", applicantXcgFileName=");
		sb.append(applicantXcgFileName);
		sb.append(", applicantXcgFileEntryId=");
		sb.append(applicantXcgFileEntryId);
		sb.append(", applicantMetadata=");
		sb.append(applicantMetadata);
		sb.append(", applicantStatus=");
		sb.append(applicantStatus);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRApplicantProfile toEntityModel() {
		VRApplicantProfileImpl vrApplicantProfileImpl = new VRApplicantProfileImpl();

		vrApplicantProfileImpl.setId(id);
		vrApplicantProfileImpl.setMtCore(mtCore);

		if (mappingMA_CTY == null) {
			vrApplicantProfileImpl.setMappingMA_CTY(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMappingMA_CTY(mappingMA_CTY);
		}

		if (mappingTEN_CTY == null) {
			vrApplicantProfileImpl.setMappingTEN_CTY(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMappingTEN_CTY(mappingTEN_CTY);
		}

		if (mappingDIA_CHI_CTY == null) {
			vrApplicantProfileImpl.setMappingDIA_CHI_CTY(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMappingDIA_CHI_CTY(mappingDIA_CHI_CTY);
		}

		if (mappingNote == null) {
			vrApplicantProfileImpl.setMappingNote(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMappingNote(mappingNote);
		}

		if (mappingStatus == null) {
			vrApplicantProfileImpl.setMappingStatus(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMappingStatus(mappingStatus);
		}

		if (applicantCode == null) {
			vrApplicantProfileImpl.setApplicantCode(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantCode(applicantCode);
		}

		if (applicantName == null) {
			vrApplicantProfileImpl.setApplicantName(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantName(applicantName);
		}

		if (applicantAddress == null) {
			vrApplicantProfileImpl.setApplicantAddress(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantAddress(applicantAddress);
		}

		if (applicantPhone == null) {
			vrApplicantProfileImpl.setApplicantPhone(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantPhone(applicantPhone);
		}

		if (applicantEmail == null) {
			vrApplicantProfileImpl.setApplicantEmail(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantEmail(applicantEmail);
		}

		if (applicantFax == null) {
			vrApplicantProfileImpl.setApplicantFax(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantFax(applicantFax);
		}

		if (applicantWebsite == null) {
			vrApplicantProfileImpl.setApplicantWebsite(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantWebsite(applicantWebsite);
		}

		if (applicantRepresentativePhone == null) {
			vrApplicantProfileImpl.setApplicantRepresentativePhone(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantRepresentativePhone(applicantRepresentativePhone);
		}

		if (applicantRepresentative == null) {
			vrApplicantProfileImpl.setApplicantRepresentative(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantRepresentative(applicantRepresentative);
		}

		if (applicantRepresentativeTitle == null) {
			vrApplicantProfileImpl.setApplicantRepresentativeTitle(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
		}

		if (applicantContactName == null) {
			vrApplicantProfileImpl.setApplicantContactName(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantContactName(applicantContactName);
		}

		if (applicantContactEmail == null) {
			vrApplicantProfileImpl.setApplicantContactEmail(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantContactEmail(applicantContactEmail);
		}

		if (applicantContactPhone == null) {
			vrApplicantProfileImpl.setApplicantContactPhone(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantContactPhone(applicantContactPhone);
		}

		if (applicantNationality == null) {
			vrApplicantProfileImpl.setApplicantNationality(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantNationality(applicantNationality);
		}

		if (applicantNationalityCode == null) {
			vrApplicantProfileImpl.setApplicantNationalityCode(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantNationalityCode(applicantNationalityCode);
		}

		if (applicantRegion == null) {
			vrApplicantProfileImpl.setApplicantRegion(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantRegion(applicantRegion);
		}

		if (applicantRegionCode == null) {
			vrApplicantProfileImpl.setApplicantRegionCode(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantRegionCode(applicantRegionCode);
		}

		if (applicantCity == null) {
			vrApplicantProfileImpl.setApplicantCity(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantCity(applicantCity);
		}

		if (applicantCityCode == null) {
			vrApplicantProfileImpl.setApplicantCityCode(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantCityCode(applicantCityCode);
		}

		if (applicantDistrictCode == null) {
			vrApplicantProfileImpl.setApplicantDistrictCode(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantDistrictCode(applicantDistrictCode);
		}

		if (applicantDistrictName == null) {
			vrApplicantProfileImpl.setApplicantDistrictName(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantDistrictName(applicantDistrictName);
		}

		if (applicantWardCode == null) {
			vrApplicantProfileImpl.setApplicantWardCode(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantWardCode(applicantWardCode);
		}

		if (applicantWardName == null) {
			vrApplicantProfileImpl.setApplicantWardName(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantWardName(applicantWardName);
		}

		if (markupCorporation == null) {
			vrApplicantProfileImpl.setMarkupCorporation(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupCorporation(markupCorporation);
		}

		if (corporationId == null) {
			vrApplicantProfileImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setCorporationId(corporationId);
		}

		if (markupDesigner == null) {
			vrApplicantProfileImpl.setMarkupDesigner(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupDesigner(markupDesigner);
		}

		if (markupOverseasManufacturer == null) {
			vrApplicantProfileImpl.setMarkupOverseasManufacturer(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupOverseasManufacturer(markupOverseasManufacturer);
		}

		if (markupDomesticsManufacturer == null) {
			vrApplicantProfileImpl.setMarkupDomesticsManufacturer(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupDomesticsManufacturer(markupDomesticsManufacturer);
		}

		if (markupMaintainer == null) {
			vrApplicantProfileImpl.setMarkupMaintainer(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupMaintainer(markupMaintainer);
		}

		if (markupImporter == null) {
			vrApplicantProfileImpl.setMarkupImporter(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupImporter(markupImporter);
		}

		if (markupComponentXCG == null) {
			vrApplicantProfileImpl.setMarkupComponentXCG(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupComponentXCG(markupComponentXCG);
		}

		if (markupComponentXMY == null) {
			vrApplicantProfileImpl.setMarkupComponentXMY(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupComponentXMY(markupComponentXMY);
		}

		if (markupComponentXCD == null) {
			vrApplicantProfileImpl.setMarkupComponentXCD(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupComponentXCD(markupComponentXCD);
		}

		if (markupComponentXDD == null) {
			vrApplicantProfileImpl.setMarkupComponentXDD(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupComponentXDD(markupComponentXDD);
		}

		if (markupComponentXCN == null) {
			vrApplicantProfileImpl.setMarkupComponentXCN(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupComponentXCN(markupComponentXCN);
		}

		if (markupComponentXCH == null) {
			vrApplicantProfileImpl.setMarkupComponentXCH(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupComponentXCH(markupComponentXCH);
		}

		if (markupXCG == null) {
			vrApplicantProfileImpl.setMarkupXCG(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupXCG(markupXCG);
		}

		if (markupXMY == null) {
			vrApplicantProfileImpl.setMarkupXMY(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupXMY(markupXMY);
		}

		if (markupXCD == null) {
			vrApplicantProfileImpl.setMarkupXCD(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupXCD(markupXCD);
		}

		if (markupXDD == null) {
			vrApplicantProfileImpl.setMarkupXDD(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupXDD(markupXDD);
		}

		if (markupXCN == null) {
			vrApplicantProfileImpl.setMarkupXCN(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupXCN(markupXCN);
		}

		if (markupXCH == null) {
			vrApplicantProfileImpl.setMarkupXCH(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setMarkupXCH(markupXCH);
		}

		if (issueTypeXCG == null) {
			vrApplicantProfileImpl.setIssueTypeXCG(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setIssueTypeXCG(issueTypeXCG);
		}

		if (issueTypeXMY == null) {
			vrApplicantProfileImpl.setIssueTypeXMY(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setIssueTypeXMY(issueTypeXMY);
		}

		if (issueTypeXCD == null) {
			vrApplicantProfileImpl.setIssueTypeXCD(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setIssueTypeXCD(issueTypeXCD);
		}

		if (issueTypeXDD == null) {
			vrApplicantProfileImpl.setIssueTypeXDD(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setIssueTypeXDD(issueTypeXDD);
		}

		if (issueTypeXCN == null) {
			vrApplicantProfileImpl.setIssueTypeXCN(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setIssueTypeXCN(issueTypeXCN);
		}

		if (issueTypeXCH == null) {
			vrApplicantProfileImpl.setIssueTypeXCH(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setIssueTypeXCH(issueTypeXCH);
		}

		if (issueTypeDescription == null) {
			vrApplicantProfileImpl.setIssueTypeDescription(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setIssueTypeDescription(issueTypeDescription);
		}

		if (applicantCeremonyDate == null) {
			vrApplicantProfileImpl.setApplicantCeremonyDate(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantCeremonyDate(applicantCeremonyDate);
		}

		if (applicantOperationPeriod == null) {
			vrApplicantProfileImpl.setApplicantOperationPeriod(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantOperationPeriod(applicantOperationPeriod);
		}

		if (applicantBusinessType == null) {
			vrApplicantProfileImpl.setApplicantBusinessType(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantBusinessType(applicantBusinessType);
		}

		if (applicantIdentityType == null) {
			vrApplicantProfileImpl.setApplicantIdentityType(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantIdentityType(applicantIdentityType);
		}

		if (applicantIdentityDescription == null) {
			vrApplicantProfileImpl.setApplicantIdentityDescription(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantIdentityDescription(applicantIdentityDescription);
		}

		if (applicantIdentityFileName == null) {
			vrApplicantProfileImpl.setApplicantIdentityFileName(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantIdentityFileName(applicantIdentityFileName);
		}

		vrApplicantProfileImpl.setApplicantIdentityFileEntryId(applicantIdentityFileEntryId);

		if (applicantXcgFileName == null) {
			vrApplicantProfileImpl.setApplicantXcgFileName(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantXcgFileName(applicantXcgFileName);
		}

		vrApplicantProfileImpl.setApplicantXcgFileEntryId(applicantXcgFileEntryId);

		if (applicantMetadata == null) {
			vrApplicantProfileImpl.setApplicantMetadata(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantMetadata(applicantMetadata);
		}

		if (applicantStatus == null) {
			vrApplicantProfileImpl.setApplicantStatus(StringPool.BLANK);
		}
		else {
			vrApplicantProfileImpl.setApplicantStatus(applicantStatus);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrApplicantProfileImpl.setModifyDate(null);
		}
		else {
			vrApplicantProfileImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrApplicantProfileImpl.setSyncDate(null);
		}
		else {
			vrApplicantProfileImpl.setSyncDate(new Date(syncDate));
		}

		vrApplicantProfileImpl.resetOriginalValues();

		return vrApplicantProfileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();
		mappingMA_CTY = objectInput.readUTF();
		mappingTEN_CTY = objectInput.readUTF();
		mappingDIA_CHI_CTY = objectInput.readUTF();
		mappingNote = objectInput.readUTF();
		mappingStatus = objectInput.readUTF();
		applicantCode = objectInput.readUTF();
		applicantName = objectInput.readUTF();
		applicantAddress = objectInput.readUTF();
		applicantPhone = objectInput.readUTF();
		applicantEmail = objectInput.readUTF();
		applicantFax = objectInput.readUTF();
		applicantWebsite = objectInput.readUTF();
		applicantRepresentativePhone = objectInput.readUTF();
		applicantRepresentative = objectInput.readUTF();
		applicantRepresentativeTitle = objectInput.readUTF();
		applicantContactName = objectInput.readUTF();
		applicantContactEmail = objectInput.readUTF();
		applicantContactPhone = objectInput.readUTF();
		applicantNationality = objectInput.readUTF();
		applicantNationalityCode = objectInput.readUTF();
		applicantRegion = objectInput.readUTF();
		applicantRegionCode = objectInput.readUTF();
		applicantCity = objectInput.readUTF();
		applicantCityCode = objectInput.readUTF();
		applicantDistrictCode = objectInput.readUTF();
		applicantDistrictName = objectInput.readUTF();
		applicantWardCode = objectInput.readUTF();
		applicantWardName = objectInput.readUTF();
		markupCorporation = objectInput.readUTF();
		corporationId = objectInput.readUTF();
		markupDesigner = objectInput.readUTF();
		markupOverseasManufacturer = objectInput.readUTF();
		markupDomesticsManufacturer = objectInput.readUTF();
		markupMaintainer = objectInput.readUTF();
		markupImporter = objectInput.readUTF();
		markupComponentXCG = objectInput.readUTF();
		markupComponentXMY = objectInput.readUTF();
		markupComponentXCD = objectInput.readUTF();
		markupComponentXDD = objectInput.readUTF();
		markupComponentXCN = objectInput.readUTF();
		markupComponentXCH = objectInput.readUTF();
		markupXCG = objectInput.readUTF();
		markupXMY = objectInput.readUTF();
		markupXCD = objectInput.readUTF();
		markupXDD = objectInput.readUTF();
		markupXCN = objectInput.readUTF();
		markupXCH = objectInput.readUTF();
		issueTypeXCG = objectInput.readUTF();
		issueTypeXMY = objectInput.readUTF();
		issueTypeXCD = objectInput.readUTF();
		issueTypeXDD = objectInput.readUTF();
		issueTypeXCN = objectInput.readUTF();
		issueTypeXCH = objectInput.readUTF();
		issueTypeDescription = objectInput.readUTF();
		applicantCeremonyDate = objectInput.readUTF();
		applicantOperationPeriod = objectInput.readUTF();
		applicantBusinessType = objectInput.readUTF();
		applicantIdentityType = objectInput.readUTF();
		applicantIdentityDescription = objectInput.readUTF();
		applicantIdentityFileName = objectInput.readUTF();

		applicantIdentityFileEntryId = objectInput.readLong();
		applicantXcgFileName = objectInput.readUTF();

		applicantXcgFileEntryId = objectInput.readLong();
		applicantMetadata = objectInput.readUTF();
		applicantStatus = objectInput.readUTF();
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

		if (applicantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantCode);
		}

		if (applicantName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantName);
		}

		if (applicantAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantAddress);
		}

		if (applicantPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantPhone);
		}

		if (applicantEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantEmail);
		}

		if (applicantFax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantFax);
		}

		if (applicantWebsite == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantWebsite);
		}

		if (applicantRepresentativePhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantRepresentativePhone);
		}

		if (applicantRepresentative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantRepresentative);
		}

		if (applicantRepresentativeTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantRepresentativeTitle);
		}

		if (applicantContactName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantContactName);
		}

		if (applicantContactEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantContactEmail);
		}

		if (applicantContactPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantContactPhone);
		}

		if (applicantNationality == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantNationality);
		}

		if (applicantNationalityCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantNationalityCode);
		}

		if (applicantRegion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantRegion);
		}

		if (applicantRegionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantRegionCode);
		}

		if (applicantCity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantCity);
		}

		if (applicantCityCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantCityCode);
		}

		if (applicantDistrictCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantDistrictCode);
		}

		if (applicantDistrictName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantDistrictName);
		}

		if (applicantWardCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantWardCode);
		}

		if (applicantWardName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantWardName);
		}

		if (markupCorporation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupCorporation);
		}

		if (corporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationId);
		}

		if (markupDesigner == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupDesigner);
		}

		if (markupOverseasManufacturer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupOverseasManufacturer);
		}

		if (markupDomesticsManufacturer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupDomesticsManufacturer);
		}

		if (markupMaintainer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupMaintainer);
		}

		if (markupImporter == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupImporter);
		}

		if (markupComponentXCG == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupComponentXCG);
		}

		if (markupComponentXMY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupComponentXMY);
		}

		if (markupComponentXCD == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupComponentXCD);
		}

		if (markupComponentXDD == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupComponentXDD);
		}

		if (markupComponentXCN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupComponentXCN);
		}

		if (markupComponentXCH == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupComponentXCH);
		}

		if (markupXCG == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupXCG);
		}

		if (markupXMY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupXMY);
		}

		if (markupXCD == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupXCD);
		}

		if (markupXDD == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupXDD);
		}

		if (markupXCN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupXCN);
		}

		if (markupXCH == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupXCH);
		}

		if (issueTypeXCG == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issueTypeXCG);
		}

		if (issueTypeXMY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issueTypeXMY);
		}

		if (issueTypeXCD == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issueTypeXCD);
		}

		if (issueTypeXDD == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issueTypeXDD);
		}

		if (issueTypeXCN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issueTypeXCN);
		}

		if (issueTypeXCH == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issueTypeXCH);
		}

		if (issueTypeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issueTypeDescription);
		}

		if (applicantCeremonyDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantCeremonyDate);
		}

		if (applicantOperationPeriod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantOperationPeriod);
		}

		if (applicantBusinessType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantBusinessType);
		}

		if (applicantIdentityType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantIdentityType);
		}

		if (applicantIdentityDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantIdentityDescription);
		}

		if (applicantIdentityFileName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantIdentityFileName);
		}

		objectOutput.writeLong(applicantIdentityFileEntryId);

		if (applicantXcgFileName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantXcgFileName);
		}

		objectOutput.writeLong(applicantXcgFileEntryId);

		if (applicantMetadata == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantMetadata);
		}

		if (applicantStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantStatus);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public String mappingMA_CTY;
	public String mappingTEN_CTY;
	public String mappingDIA_CHI_CTY;
	public String mappingNote;
	public String mappingStatus;
	public String applicantCode;
	public String applicantName;
	public String applicantAddress;
	public String applicantPhone;
	public String applicantEmail;
	public String applicantFax;
	public String applicantWebsite;
	public String applicantRepresentativePhone;
	public String applicantRepresentative;
	public String applicantRepresentativeTitle;
	public String applicantContactName;
	public String applicantContactEmail;
	public String applicantContactPhone;
	public String applicantNationality;
	public String applicantNationalityCode;
	public String applicantRegion;
	public String applicantRegionCode;
	public String applicantCity;
	public String applicantCityCode;
	public String applicantDistrictCode;
	public String applicantDistrictName;
	public String applicantWardCode;
	public String applicantWardName;
	public String markupCorporation;
	public String corporationId;
	public String markupDesigner;
	public String markupOverseasManufacturer;
	public String markupDomesticsManufacturer;
	public String markupMaintainer;
	public String markupImporter;
	public String markupComponentXCG;
	public String markupComponentXMY;
	public String markupComponentXCD;
	public String markupComponentXDD;
	public String markupComponentXCN;
	public String markupComponentXCH;
	public String markupXCG;
	public String markupXMY;
	public String markupXCD;
	public String markupXDD;
	public String markupXCN;
	public String markupXCH;
	public String issueTypeXCG;
	public String issueTypeXMY;
	public String issueTypeXCD;
	public String issueTypeXDD;
	public String issueTypeXCN;
	public String issueTypeXCH;
	public String issueTypeDescription;
	public String applicantCeremonyDate;
	public String applicantOperationPeriod;
	public String applicantBusinessType;
	public String applicantIdentityType;
	public String applicantIdentityDescription;
	public String applicantIdentityFileName;
	public long applicantIdentityFileEntryId;
	public String applicantXcgFileName;
	public long applicantXcgFileEntryId;
	public String applicantMetadata;
	public String applicantStatus;
	public long modifyDate;
	public long syncDate;
}