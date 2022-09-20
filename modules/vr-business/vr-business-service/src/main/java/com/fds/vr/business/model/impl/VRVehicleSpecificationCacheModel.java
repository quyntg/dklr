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

import com.fds.vr.business.model.VRVehicleSpecification;

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
 * The cache model class for representing VRVehicleSpecification in entity cache.
 *
 * @author LamTV
 * @see VRVehicleSpecification
 * @generated
 */
@ProviderType
public class VRVehicleSpecificationCacheModel implements CacheModel<VRVehicleSpecification>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRVehicleSpecificationCacheModel)) {
			return false;
		}

		VRVehicleSpecificationCacheModel vrVehicleSpecificationCacheModel = (VRVehicleSpecificationCacheModel)obj;

		if (id == vrVehicleSpecificationCacheModel.id) {
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
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleCertificateId=");
		sb.append(vehicleCertificateId);
		sb.append(", specificationCode=");
		sb.append(specificationCode);
		sb.append(", specificationName=");
		sb.append(specificationName);
		sb.append(", specificationValue=");
		sb.append(specificationValue);
		sb.append(", specificationValueDescription=");
		sb.append(specificationValueDescription);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", specificationBasicUnit=");
		sb.append(specificationBasicUnit);
		sb.append(", specificationStandard=");
		sb.append(specificationStandard);
		sb.append(", specificationGroup=");
		sb.append(specificationGroup);
		sb.append(", specificationDataCollectionID=");
		sb.append(specificationDataCollectionID);
		sb.append(", specificationResult=");
		sb.append(specificationResult);
		sb.append(", deliverableCode=");
		sb.append(deliverableCode);
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
	public VRVehicleSpecification toEntityModel() {
		VRVehicleSpecificationImpl vrVehicleSpecificationImpl = new VRVehicleSpecificationImpl();

		vrVehicleSpecificationImpl.setId(id);
		vrVehicleSpecificationImpl.setVehicleCertificateId(vehicleCertificateId);

		if (specificationCode == null) {
			vrVehicleSpecificationImpl.setSpecificationCode(StringPool.BLANK);
		}
		else {
			vrVehicleSpecificationImpl.setSpecificationCode(specificationCode);
		}

		if (specificationName == null) {
			vrVehicleSpecificationImpl.setSpecificationName(StringPool.BLANK);
		}
		else {
			vrVehicleSpecificationImpl.setSpecificationName(specificationName);
		}

		if (specificationValue == null) {
			vrVehicleSpecificationImpl.setSpecificationValue(StringPool.BLANK);
		}
		else {
			vrVehicleSpecificationImpl.setSpecificationValue(specificationValue);
		}

		if (specificationValueDescription == null) {
			vrVehicleSpecificationImpl.setSpecificationValueDescription(StringPool.BLANK);
		}
		else {
			vrVehicleSpecificationImpl.setSpecificationValueDescription(specificationValueDescription);
		}

		vrVehicleSpecificationImpl.setSequenceNo(sequenceNo);

		if (specificationBasicUnit == null) {
			vrVehicleSpecificationImpl.setSpecificationBasicUnit(StringPool.BLANK);
		}
		else {
			vrVehicleSpecificationImpl.setSpecificationBasicUnit(specificationBasicUnit);
		}

		if (specificationStandard == null) {
			vrVehicleSpecificationImpl.setSpecificationStandard(StringPool.BLANK);
		}
		else {
			vrVehicleSpecificationImpl.setSpecificationStandard(specificationStandard);
		}

		if (specificationGroup == null) {
			vrVehicleSpecificationImpl.setSpecificationGroup(StringPool.BLANK);
		}
		else {
			vrVehicleSpecificationImpl.setSpecificationGroup(specificationGroup);
		}

		if (specificationDataCollectionID == null) {
			vrVehicleSpecificationImpl.setSpecificationDataCollectionID(StringPool.BLANK);
		}
		else {
			vrVehicleSpecificationImpl.setSpecificationDataCollectionID(specificationDataCollectionID);
		}

		if (specificationResult == null) {
			vrVehicleSpecificationImpl.setSpecificationResult(StringPool.BLANK);
		}
		else {
			vrVehicleSpecificationImpl.setSpecificationResult(specificationResult);
		}

		if (deliverableCode == null) {
			vrVehicleSpecificationImpl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrVehicleSpecificationImpl.setDeliverableCode(deliverableCode);
		}

		vrVehicleSpecificationImpl.setDossierId(dossierId);

		if (dossierIdCTN == null) {
			vrVehicleSpecificationImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrVehicleSpecificationImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (dossierNo == null) {
			vrVehicleSpecificationImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrVehicleSpecificationImpl.setDossierNo(dossierNo);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrVehicleSpecificationImpl.setModifyDate(null);
		}
		else {
			vrVehicleSpecificationImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrVehicleSpecificationImpl.setSyncDate(null);
		}
		else {
			vrVehicleSpecificationImpl.setSyncDate(new Date(syncDate));
		}

		vrVehicleSpecificationImpl.resetOriginalValues();

		return vrVehicleSpecificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		vehicleCertificateId = objectInput.readLong();
		specificationCode = objectInput.readUTF();
		specificationName = objectInput.readUTF();
		specificationValue = objectInput.readUTF();
		specificationValueDescription = objectInput.readUTF();

		sequenceNo = objectInput.readLong();
		specificationBasicUnit = objectInput.readUTF();
		specificationStandard = objectInput.readUTF();
		specificationGroup = objectInput.readUTF();
		specificationDataCollectionID = objectInput.readUTF();
		specificationResult = objectInput.readUTF();
		deliverableCode = objectInput.readUTF();

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

		if (specificationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationCode);
		}

		if (specificationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationName);
		}

		if (specificationValue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationValue);
		}

		if (specificationValueDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationValueDescription);
		}

		objectOutput.writeLong(sequenceNo);

		if (specificationBasicUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationBasicUnit);
		}

		if (specificationStandard == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationStandard);
		}

		if (specificationGroup == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationGroup);
		}

		if (specificationDataCollectionID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationDataCollectionID);
		}

		if (specificationResult == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationResult);
		}

		if (deliverableCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(deliverableCode);
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
	public String specificationCode;
	public String specificationName;
	public String specificationValue;
	public String specificationValueDescription;
	public long sequenceNo;
	public String specificationBasicUnit;
	public String specificationStandard;
	public String specificationGroup;
	public String specificationDataCollectionID;
	public String specificationResult;
	public String deliverableCode;
	public long dossierId;
	public String dossierIdCTN;
	public String dossierNo;
	public long modifyDate;
	public long syncDate;
}