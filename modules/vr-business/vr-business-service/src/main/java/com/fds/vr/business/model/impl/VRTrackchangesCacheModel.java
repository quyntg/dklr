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

import com.fds.vr.business.model.VRTrackchanges;

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
 * The cache model class for representing VRTrackchanges in entity cache.
 *
 * @author LamTV
 * @see VRTrackchanges
 * @generated
 */
@ProviderType
public class VRTrackchangesCacheModel implements CacheModel<VRTrackchanges>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTrackchangesCacheModel)) {
			return false;
		}

		VRTrackchangesCacheModel vrTrackchangesCacheModel = (VRTrackchangesCacheModel)obj;

		if (id == vrTrackchangesCacheModel.id) {
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
		StringBundler sb = new StringBundler(31);

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
		sb.append(", previousContentFileEntryId=");
		sb.append(previousContentFileEntryId);
		sb.append(", currentContentFileEntryId=");
		sb.append(currentContentFileEntryId);
		sb.append(", nextContentFileEntryId=");
		sb.append(nextContentFileEntryId);
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
	public VRTrackchanges toEntityModel() {
		VRTrackchangesImpl vrTrackchangesImpl = new VRTrackchangesImpl();

		vrTrackchangesImpl.setId(id);

		if (applicantCode == null) {
			vrTrackchangesImpl.setApplicantCode(StringPool.BLANK);
		}
		else {
			vrTrackchangesImpl.setApplicantCode(applicantCode);
		}

		if (productionPlantCode == null) {
			vrTrackchangesImpl.setProductionPlantCode(StringPool.BLANK);
		}
		else {
			vrTrackchangesImpl.setProductionPlantCode(productionPlantCode);
		}

		if (contentType == null) {
			vrTrackchangesImpl.setContentType(StringPool.BLANK);
		}
		else {
			vrTrackchangesImpl.setContentType(contentType);
		}

		if (contentFileTemplate == null) {
			vrTrackchangesImpl.setContentFileTemplate(StringPool.BLANK);
		}
		else {
			vrTrackchangesImpl.setContentFileTemplate(contentFileTemplate);
		}

		vrTrackchangesImpl.setPreviousContentFileEntryId(previousContentFileEntryId);
		vrTrackchangesImpl.setCurrentContentFileEntryId(currentContentFileEntryId);
		vrTrackchangesImpl.setNextContentFileEntryId(nextContentFileEntryId);
		vrTrackchangesImpl.setDossierId(dossierId);

		if (dossierIdCTN == null) {
			vrTrackchangesImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTrackchangesImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (dossierNo == null) {
			vrTrackchangesImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTrackchangesImpl.setDossierNo(dossierNo);
		}

		vrTrackchangesImpl.setModifyUserId(modifyUserId);

		if (createdDate == Long.MIN_VALUE) {
			vrTrackchangesImpl.setCreatedDate(null);
		}
		else {
			vrTrackchangesImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTrackchangesImpl.setModifyDate(null);
		}
		else {
			vrTrackchangesImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTrackchangesImpl.setSyncDate(null);
		}
		else {
			vrTrackchangesImpl.setSyncDate(new Date(syncDate));
		}

		vrTrackchangesImpl.resetOriginalValues();

		return vrTrackchangesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		applicantCode = objectInput.readUTF();
		productionPlantCode = objectInput.readUTF();
		contentType = objectInput.readUTF();
		contentFileTemplate = objectInput.readUTF();

		previousContentFileEntryId = objectInput.readLong();

		currentContentFileEntryId = objectInput.readLong();

		nextContentFileEntryId = objectInput.readLong();

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

		objectOutput.writeLong(previousContentFileEntryId);

		objectOutput.writeLong(currentContentFileEntryId);

		objectOutput.writeLong(nextContentFileEntryId);

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
	public long previousContentFileEntryId;
	public long currentContentFileEntryId;
	public long nextContentFileEntryId;
	public long dossierId;
	public String dossierIdCTN;
	public String dossierNo;
	public long modifyUserId;
	public long createdDate;
	public long modifyDate;
	public long syncDate;
}