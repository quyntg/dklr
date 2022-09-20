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

import com.fds.vr.business.model.VRHistoryProfile;

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
 * The cache model class for representing VRHistoryProfile in entity cache.
 *
 * @author LamTV
 * @see VRHistoryProfile
 * @generated
 */
@ProviderType
public class VRHistoryProfileCacheModel implements CacheModel<VRHistoryProfile>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRHistoryProfileCacheModel)) {
			return false;
		}

		VRHistoryProfileCacheModel vrHistoryProfileCacheModel = (VRHistoryProfileCacheModel)obj;

		if (id == vrHistoryProfileCacheModel.id) {
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
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", applicantCode=");
		sb.append(applicantCode);
		sb.append(", productionPlantCode=");
		sb.append(productionPlantCode);
		sb.append(", contentType=");
		sb.append(contentType);
		sb.append(", contentFileTemplate=");
		sb.append(contentFileTemplate);
		sb.append(", contentFileEntryId=");
		sb.append(contentFileEntryId);
		sb.append(", contentjsonFileEntryId=");
		sb.append(contentjsonFileEntryId);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierIdCTN=");
		sb.append(dossierIdCTN);
		sb.append(", dossierNo=");
		sb.append(dossierNo);
		sb.append(", modifyUserId=");
		sb.append(modifyUserId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRHistoryProfile toEntityModel() {
		VRHistoryProfileImpl vrHistoryProfileImpl = new VRHistoryProfileImpl();

		vrHistoryProfileImpl.setId(id);

		if (applicantCode == null) {
			vrHistoryProfileImpl.setApplicantCode(StringPool.BLANK);
		}
		else {
			vrHistoryProfileImpl.setApplicantCode(applicantCode);
		}

		if (productionPlantCode == null) {
			vrHistoryProfileImpl.setProductionPlantCode(StringPool.BLANK);
		}
		else {
			vrHistoryProfileImpl.setProductionPlantCode(productionPlantCode);
		}

		if (contentType == null) {
			vrHistoryProfileImpl.setContentType(StringPool.BLANK);
		}
		else {
			vrHistoryProfileImpl.setContentType(contentType);
		}

		if (contentFileTemplate == null) {
			vrHistoryProfileImpl.setContentFileTemplate(StringPool.BLANK);
		}
		else {
			vrHistoryProfileImpl.setContentFileTemplate(contentFileTemplate);
		}

		vrHistoryProfileImpl.setContentFileEntryId(contentFileEntryId);
		vrHistoryProfileImpl.setContentjsonFileEntryId(contentjsonFileEntryId);
		vrHistoryProfileImpl.setDossierId(dossierId);

		if (dossierIdCTN == null) {
			vrHistoryProfileImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrHistoryProfileImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (dossierNo == null) {
			vrHistoryProfileImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrHistoryProfileImpl.setDossierNo(dossierNo);
		}

		vrHistoryProfileImpl.setModifyUserId(modifyUserId);

		if (createdDate == Long.MIN_VALUE) {
			vrHistoryProfileImpl.setCreatedDate(null);
		}
		else {
			vrHistoryProfileImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrHistoryProfileImpl.setModifyDate(null);
		}
		else {
			vrHistoryProfileImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrHistoryProfileImpl.setSyncDate(null);
		}
		else {
			vrHistoryProfileImpl.setSyncDate(new Date(syncDate));
		}

		vrHistoryProfileImpl.resetOriginalValues();

		return vrHistoryProfileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		applicantCode = objectInput.readUTF();
		productionPlantCode = objectInput.readUTF();
		contentType = objectInput.readUTF();
		contentFileTemplate = objectInput.readUTF();

		contentFileEntryId = objectInput.readLong();

		contentjsonFileEntryId = objectInput.readLong();

		dossierId = objectInput.readLong();
		dossierIdCTN = objectInput.readUTF();
		dossierNo = objectInput.readUTF();

		modifyUserId = objectInput.readLong();
		createdDate = objectInput.readLong();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (applicantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantCode);
		}

		if (productionPlantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantCode);
		}

		if (contentType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contentType);
		}

		if (contentFileTemplate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contentFileTemplate);
		}

		objectOutput.writeLong(contentFileEntryId);

		objectOutput.writeLong(contentjsonFileEntryId);

		objectOutput.writeLong(dossierId);

		if (dossierIdCTN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierIdCTN);
		}

		if (dossierNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierNo);
		}

		objectOutput.writeLong(modifyUserId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public String applicantCode;
	public String productionPlantCode;
	public String contentType;
	public String contentFileTemplate;
	public long contentFileEntryId;
	public long contentjsonFileEntryId;
	public long dossierId;
	public String dossierIdCTN;
	public String dossierNo;
	public long modifyUserId;
	public long createdDate;
	public long modifyDate;
	public long syncDate;
}