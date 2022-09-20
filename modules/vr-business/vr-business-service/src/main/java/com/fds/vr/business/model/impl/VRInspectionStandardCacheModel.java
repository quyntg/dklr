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

import com.fds.vr.business.model.VRInspectionStandard;

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
 * The cache model class for representing VRInspectionStandard in entity cache.
 *
 * @author LamTV
 * @see VRInspectionStandard
 * @generated
 */
@ProviderType
public class VRInspectionStandardCacheModel implements CacheModel<VRInspectionStandard>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRInspectionStandardCacheModel)) {
			return false;
		}

		VRInspectionStandardCacheModel vrInspectionStandardCacheModel = (VRInspectionStandardCacheModel)obj;

		if (id == vrInspectionStandardCacheModel.id) {
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
		sb.append(", vehicleCertificateId=");
		sb.append(vehicleCertificateId);
		sb.append(", deliverableCode=");
		sb.append(deliverableCode);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", circularno=");
		sb.append(circularno);
		sb.append(", circulardate=");
		sb.append(circulardate);
		sb.append(", markupstatus=");
		sb.append(markupstatus);
		sb.append(", module=");
		sb.append(module);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierIdCTN=");
		sb.append(dossierIdCTN);
		sb.append(", dossierNo=");
		sb.append(dossierNo);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRInspectionStandard toEntityModel() {
		VRInspectionStandardImpl vrInspectionStandardImpl = new VRInspectionStandardImpl();

		vrInspectionStandardImpl.setId(id);
		vrInspectionStandardImpl.setVehicleCertificateId(vehicleCertificateId);

		if (deliverableCode == null) {
			vrInspectionStandardImpl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrInspectionStandardImpl.setDeliverableCode(deliverableCode);
		}

		vrInspectionStandardImpl.setSequenceNo(sequenceNo);

		if (circularno == null) {
			vrInspectionStandardImpl.setCircularno(StringPool.BLANK);
		}
		else {
			vrInspectionStandardImpl.setCircularno(circularno);
		}

		if (circulardate == Long.MIN_VALUE) {
			vrInspectionStandardImpl.setCirculardate(null);
		}
		else {
			vrInspectionStandardImpl.setCirculardate(new Date(circulardate));
		}

		vrInspectionStandardImpl.setMarkupstatus(markupstatus);

		if (module == null) {
			vrInspectionStandardImpl.setModule(StringPool.BLANK);
		}
		else {
			vrInspectionStandardImpl.setModule(module);
		}

		vrInspectionStandardImpl.setDossierId(dossierId);

		if (dossierIdCTN == null) {
			vrInspectionStandardImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrInspectionStandardImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (dossierNo == null) {
			vrInspectionStandardImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrInspectionStandardImpl.setDossierNo(dossierNo);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrInspectionStandardImpl.setModifyDate(null);
		}
		else {
			vrInspectionStandardImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrInspectionStandardImpl.setSyncDate(null);
		}
		else {
			vrInspectionStandardImpl.setSyncDate(new Date(syncDate));
		}

		vrInspectionStandardImpl.resetOriginalValues();

		return vrInspectionStandardImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		vehicleCertificateId = objectInput.readLong();
		deliverableCode = objectInput.readUTF();

		sequenceNo = objectInput.readLong();
		circularno = objectInput.readUTF();
		circulardate = objectInput.readLong();

		markupstatus = objectInput.readLong();
		module = objectInput.readUTF();

		dossierId = objectInput.readLong();
		dossierIdCTN = objectInput.readUTF();
		dossierNo = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(vehicleCertificateId);

		if (deliverableCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(deliverableCode);
		}

		objectOutput.writeLong(sequenceNo);

		if (circularno == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(circularno);
		}

		objectOutput.writeLong(circulardate);

		objectOutput.writeLong(markupstatus);

		if (module == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(module);
		}

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

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long vehicleCertificateId;
	public String deliverableCode;
	public long sequenceNo;
	public String circularno;
	public long circulardate;
	public long markupstatus;
	public String module;
	public long dossierId;
	public String dossierIdCTN;
	public String dossierNo;
	public long modifyDate;
	public long syncDate;
}