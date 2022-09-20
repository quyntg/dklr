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

import com.fds.vr.business.model.VRApplicantProfileHistory;

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
 * The cache model class for representing VRApplicantProfileHistory in entity cache.
 *
 * @author LamTV
 * @see VRApplicantProfileHistory
 * @generated
 */
@ProviderType
public class VRApplicantProfileHistoryCacheModel implements CacheModel<VRApplicantProfileHistory>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRApplicantProfileHistoryCacheModel)) {
			return false;
		}

		VRApplicantProfileHistoryCacheModel vrApplicantProfileHistoryCacheModel = (VRApplicantProfileHistoryCacheModel)obj;

		if (id == vrApplicantProfileHistoryCacheModel.id) {
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
		StringBundler sb = new StringBundler(107);

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
		sb.append(", applicantRepresentative=");
		sb.append(applicantRepresentative);
		sb.append(", applicantRepresentativeTitle=");
		sb.append(applicantRepresentativeTitle);
		sb.append(", applicantPhone=");
		sb.append(applicantPhone);
		sb.append(", applicantEmail=");
		sb.append(applicantEmail);
		sb.append(", applicantFax=");
		sb.append(applicantFax);
		sb.append(", applicantContactName=");
		sb.append(applicantContactName);
		sb.append(", applicantContactEmail=");
		sb.append(applicantContactEmail);
		sb.append(", applicantContactPhone=");
		sb.append(applicantContactPhone);
		sb.append(", applicantNationality=");
		sb.append(applicantNationality);
		sb.append(", applicantRegion=");
		sb.append(applicantRegion);
		sb.append(", applicantCity=");
		sb.append(applicantCity);
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
	public VRApplicantProfileHistory toEntityModel() {
		VRApplicantProfileHistoryImpl vrApplicantProfileHistoryImpl = new VRApplicantProfileHistoryImpl();

		vrApplicantProfileHistoryImpl.setId(id);
		vrApplicantProfileHistoryImpl.setMtCore(mtCore);

		if (mappingMA_CTY == null) {
			vrApplicantProfileHistoryImpl.setMappingMA_CTY(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMappingMA_CTY(mappingMA_CTY);
		}

		if (mappingTEN_CTY == null) {
			vrApplicantProfileHistoryImpl.setMappingTEN_CTY(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMappingTEN_CTY(mappingTEN_CTY);
		}

		if (mappingDIA_CHI_CTY == null) {
			vrApplicantProfileHistoryImpl.setMappingDIA_CHI_CTY(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMappingDIA_CHI_CTY(mappingDIA_CHI_CTY);
		}

		if (mappingNote == null) {
			vrApplicantProfileHistoryImpl.setMappingNote(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMappingNote(mappingNote);
		}

		if (mappingStatus == null) {
			vrApplicantProfileHistoryImpl.setMappingStatus(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMappingStatus(mappingStatus);
		}

		if (applicantCode == null) {
			vrApplicantProfileHistoryImpl.setApplicantCode(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantCode(applicantCode);
		}

		if (applicantName == null) {
			vrApplicantProfileHistoryImpl.setApplicantName(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantName(applicantName);
		}

		if (applicantAddress == null) {
			vrApplicantProfileHistoryImpl.setApplicantAddress(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantAddress(applicantAddress);
		}

		if (applicantRepresentative == null) {
			vrApplicantProfileHistoryImpl.setApplicantRepresentative(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantRepresentative(applicantRepresentative);
		}

		if (applicantRepresentativeTitle == null) {
			vrApplicantProfileHistoryImpl.setApplicantRepresentativeTitle(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
		}

		if (applicantPhone == null) {
			vrApplicantProfileHistoryImpl.setApplicantPhone(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantPhone(applicantPhone);
		}

		if (applicantEmail == null) {
			vrApplicantProfileHistoryImpl.setApplicantEmail(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantEmail(applicantEmail);
		}

		if (applicantFax == null) {
			vrApplicantProfileHistoryImpl.setApplicantFax(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantFax(applicantFax);
		}

		if (applicantContactName == null) {
			vrApplicantProfileHistoryImpl.setApplicantContactName(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantContactName(applicantContactName);
		}

		if (applicantContactEmail == null) {
			vrApplicantProfileHistoryImpl.setApplicantContactEmail(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantContactEmail(applicantContactEmail);
		}

		if (applicantContactPhone == null) {
			vrApplicantProfileHistoryImpl.setApplicantContactPhone(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantContactPhone(applicantContactPhone);
		}

		if (applicantNationality == null) {
			vrApplicantProfileHistoryImpl.setApplicantNationality(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantNationality(applicantNationality);
		}

		if (applicantRegion == null) {
			vrApplicantProfileHistoryImpl.setApplicantRegion(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantRegion(applicantRegion);
		}

		if (applicantCity == null) {
			vrApplicantProfileHistoryImpl.setApplicantCity(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantCity(applicantCity);
		}

		if (markupCorporation == null) {
			vrApplicantProfileHistoryImpl.setMarkupCorporation(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupCorporation(markupCorporation);
		}

		if (corporationId == null) {
			vrApplicantProfileHistoryImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setCorporationId(corporationId);
		}

		if (markupDesigner == null) {
			vrApplicantProfileHistoryImpl.setMarkupDesigner(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupDesigner(markupDesigner);
		}

		if (markupOverseasManufacturer == null) {
			vrApplicantProfileHistoryImpl.setMarkupOverseasManufacturer(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupOverseasManufacturer(markupOverseasManufacturer);
		}

		if (markupDomesticsManufacturer == null) {
			vrApplicantProfileHistoryImpl.setMarkupDomesticsManufacturer(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupDomesticsManufacturer(markupDomesticsManufacturer);
		}

		if (markupImporter == null) {
			vrApplicantProfileHistoryImpl.setMarkupImporter(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupImporter(markupImporter);
		}

		if (markupComponentXCG == null) {
			vrApplicantProfileHistoryImpl.setMarkupComponentXCG(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupComponentXCG(markupComponentXCG);
		}

		if (markupComponentXMY == null) {
			vrApplicantProfileHistoryImpl.setMarkupComponentXMY(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupComponentXMY(markupComponentXMY);
		}

		if (markupComponentXCD == null) {
			vrApplicantProfileHistoryImpl.setMarkupComponentXCD(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupComponentXCD(markupComponentXCD);
		}

		if (markupComponentXDD == null) {
			vrApplicantProfileHistoryImpl.setMarkupComponentXDD(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupComponentXDD(markupComponentXDD);
		}

		if (markupComponentXCN == null) {
			vrApplicantProfileHistoryImpl.setMarkupComponentXCN(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupComponentXCN(markupComponentXCN);
		}

		if (markupComponentXCH == null) {
			vrApplicantProfileHistoryImpl.setMarkupComponentXCH(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupComponentXCH(markupComponentXCH);
		}

		if (markupXCG == null) {
			vrApplicantProfileHistoryImpl.setMarkupXCG(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupXCG(markupXCG);
		}

		if (markupXMY == null) {
			vrApplicantProfileHistoryImpl.setMarkupXMY(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupXMY(markupXMY);
		}

		if (markupXCD == null) {
			vrApplicantProfileHistoryImpl.setMarkupXCD(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupXCD(markupXCD);
		}

		if (markupXDD == null) {
			vrApplicantProfileHistoryImpl.setMarkupXDD(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupXDD(markupXDD);
		}

		if (markupXCN == null) {
			vrApplicantProfileHistoryImpl.setMarkupXCN(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupXCN(markupXCN);
		}

		if (markupXCH == null) {
			vrApplicantProfileHistoryImpl.setMarkupXCH(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setMarkupXCH(markupXCH);
		}

		if (issueTypeXCG == null) {
			vrApplicantProfileHistoryImpl.setIssueTypeXCG(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setIssueTypeXCG(issueTypeXCG);
		}

		if (issueTypeXMY == null) {
			vrApplicantProfileHistoryImpl.setIssueTypeXMY(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setIssueTypeXMY(issueTypeXMY);
		}

		if (issueTypeXCD == null) {
			vrApplicantProfileHistoryImpl.setIssueTypeXCD(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setIssueTypeXCD(issueTypeXCD);
		}

		if (issueTypeXDD == null) {
			vrApplicantProfileHistoryImpl.setIssueTypeXDD(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setIssueTypeXDD(issueTypeXDD);
		}

		if (issueTypeXCN == null) {
			vrApplicantProfileHistoryImpl.setIssueTypeXCN(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setIssueTypeXCN(issueTypeXCN);
		}

		if (issueTypeXCH == null) {
			vrApplicantProfileHistoryImpl.setIssueTypeXCH(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setIssueTypeXCH(issueTypeXCH);
		}

		if (issueTypeDescription == null) {
			vrApplicantProfileHistoryImpl.setIssueTypeDescription(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setIssueTypeDescription(issueTypeDescription);
		}

		if (applicantCeremonyDate == null) {
			vrApplicantProfileHistoryImpl.setApplicantCeremonyDate(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantCeremonyDate(applicantCeremonyDate);
		}

		if (applicantOperationPeriod == null) {
			vrApplicantProfileHistoryImpl.setApplicantOperationPeriod(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantOperationPeriod(applicantOperationPeriod);
		}

		if (applicantBusinessType == null) {
			vrApplicantProfileHistoryImpl.setApplicantBusinessType(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantBusinessType(applicantBusinessType);
		}

		if (applicantMetadata == null) {
			vrApplicantProfileHistoryImpl.setApplicantMetadata(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantMetadata(applicantMetadata);
		}

		if (applicantStatus == null) {
			vrApplicantProfileHistoryImpl.setApplicantStatus(StringPool.BLANK);
		}
		else {
			vrApplicantProfileHistoryImpl.setApplicantStatus(applicantStatus);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrApplicantProfileHistoryImpl.setModifyDate(null);
		}
		else {
			vrApplicantProfileHistoryImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrApplicantProfileHistoryImpl.setSyncDate(null);
		}
		else {
			vrApplicantProfileHistoryImpl.setSyncDate(new Date(syncDate));
		}

		vrApplicantProfileHistoryImpl.resetOriginalValues();

		return vrApplicantProfileHistoryImpl;
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
		applicantRepresentative = objectInput.readUTF();
		applicantRepresentativeTitle = objectInput.readUTF();
		applicantPhone = objectInput.readUTF();
		applicantEmail = objectInput.readUTF();
		applicantFax = objectInput.readUTF();
		applicantContactName = objectInput.readUTF();
		applicantContactEmail = objectInput.readUTF();
		applicantContactPhone = objectInput.readUTF();
		applicantNationality = objectInput.readUTF();
		applicantRegion = objectInput.readUTF();
		applicantCity = objectInput.readUTF();
		markupCorporation = objectInput.readUTF();
		corporationId = objectInput.readUTF();
		markupDesigner = objectInput.readUTF();
		markupOverseasManufacturer = objectInput.readUTF();
		markupDomesticsManufacturer = objectInput.readUTF();
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

		if (applicantRegion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantRegion);
		}

		if (applicantCity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantCity);
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
	public String applicantRepresentative;
	public String applicantRepresentativeTitle;
	public String applicantPhone;
	public String applicantEmail;
	public String applicantFax;
	public String applicantContactName;
	public String applicantContactEmail;
	public String applicantContactPhone;
	public String applicantNationality;
	public String applicantRegion;
	public String applicantCity;
	public String markupCorporation;
	public String corporationId;
	public String markupDesigner;
	public String markupOverseasManufacturer;
	public String markupDomesticsManufacturer;
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
	public String applicantMetadata;
	public String applicantStatus;
	public long modifyDate;
	public long syncDate;
}