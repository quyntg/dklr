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

import com.fds.vr.business.model.VRCOPReportAttach;

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
 * The cache model class for representing VRCOPReportAttach in entity cache.
 *
 * @author LamTV
 * @see VRCOPReportAttach
 * @generated
 */
@ProviderType
public class VRCOPReportAttachCacheModel implements CacheModel<VRCOPReportAttach>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPReportAttachCacheModel)) {
			return false;
		}

		VRCOPReportAttachCacheModel vrcopReportAttachCacheModel = (VRCOPReportAttachCacheModel)obj;

		if (id == vrcopReportAttachCacheModel.id) {
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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", copReportRepositoryID=");
		sb.append(copReportRepositoryID);
		sb.append(", copReportNo=");
		sb.append(copReportNo);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", docName=");
		sb.append(docName);
		sb.append(", docNo=");
		sb.append(docNo);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierIdCTN=");
		sb.append(dossierIdCTN);
		sb.append(", dossierNo=");
		sb.append(dossierNo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCOPReportAttach toEntityModel() {
		VRCOPReportAttachImpl vrcopReportAttachImpl = new VRCOPReportAttachImpl();

		vrcopReportAttachImpl.setId(id);
		vrcopReportAttachImpl.setMtCore(mtCore);
		vrcopReportAttachImpl.setCopReportRepositoryID(copReportRepositoryID);

		if (copReportNo == null) {
			vrcopReportAttachImpl.setCopReportNo(StringPool.BLANK);
		}
		else {
			vrcopReportAttachImpl.setCopReportNo(copReportNo);
		}

		vrcopReportAttachImpl.setSequenceNo(sequenceNo);

		if (docName == null) {
			vrcopReportAttachImpl.setDocName(StringPool.BLANK);
		}
		else {
			vrcopReportAttachImpl.setDocName(docName);
		}

		if (docNo == null) {
			vrcopReportAttachImpl.setDocNo(StringPool.BLANK);
		}
		else {
			vrcopReportAttachImpl.setDocNo(docNo);
		}

		if (remarks == null) {
			vrcopReportAttachImpl.setRemarks(StringPool.BLANK);
		}
		else {
			vrcopReportAttachImpl.setRemarks(remarks);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrcopReportAttachImpl.setModifyDate(null);
		}
		else {
			vrcopReportAttachImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrcopReportAttachImpl.setSyncDate(null);
		}
		else {
			vrcopReportAttachImpl.setSyncDate(new Date(syncDate));
		}

		vrcopReportAttachImpl.setDossierId(dossierId);

		if (dossierIdCTN == null) {
			vrcopReportAttachImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrcopReportAttachImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (dossierNo == null) {
			vrcopReportAttachImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrcopReportAttachImpl.setDossierNo(dossierNo);
		}

		vrcopReportAttachImpl.resetOriginalValues();

		return vrcopReportAttachImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		copReportRepositoryID = objectInput.readLong();
		copReportNo = objectInput.readUTF();

		sequenceNo = objectInput.readLong();
		docName = objectInput.readUTF();
		docNo = objectInput.readUTF();
		remarks = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();

		dossierId = objectInput.readLong();
		dossierIdCTN = objectInput.readUTF();
		dossierNo = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(copReportRepositoryID);

		if (copReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportNo);
		}

		objectOutput.writeLong(sequenceNo);

		if (docName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(docName);
		}

		if (docNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(docNo);
		}

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);

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
	}

	public long id;
	public long mtCore;
	public long copReportRepositoryID;
	public String copReportNo;
	public long sequenceNo;
	public String docName;
	public String docNo;
	public String remarks;
	public long modifyDate;
	public long syncDate;
	public long dossierId;
	public String dossierIdCTN;
	public String dossierNo;
}