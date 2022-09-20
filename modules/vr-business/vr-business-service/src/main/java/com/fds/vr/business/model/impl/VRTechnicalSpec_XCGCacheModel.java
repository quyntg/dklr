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

import com.fds.vr.business.model.VRTechnicalSpec_XCG;

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
 * The cache model class for representing VRTechnicalSpec_XCG in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCG
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGCacheModel implements CacheModel<VRTechnicalSpec_XCG>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGCacheModel)) {
			return false;
		}

		VRTechnicalSpec_XCGCacheModel vrTechnicalSpec_XCGCacheModel = (VRTechnicalSpec_XCGCacheModel)obj;

		if (id == vrTechnicalSpec_XCGCacheModel.id) {
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
		StringBundler sb = new StringBundler(75);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", convertAssembleId=");
		sb.append(convertAssembleId);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierNo=");
		sb.append(dossierNo);
		sb.append(", referenceUid=");
		sb.append(referenceUid);
		sb.append(", dossierIdCTN=");
		sb.append(dossierIdCTN);
		sb.append(", deliverableCode=");
		sb.append(deliverableCode);
		sb.append(", vehicleTypeCertificateId=");
		sb.append(vehicleTypeCertificateId);
		sb.append(", XCG01070=");
		sb.append(XCG01070);
		sb.append(", XCG01072=");
		sb.append(XCG01072);
		sb.append(", XCG01083=");
		sb.append(XCG01083);
		sb.append(", XCG01084=");
		sb.append(XCG01084);
		sb.append(", XCG01085=");
		sb.append(XCG01085);
		sb.append(", XCG01086=");
		sb.append(XCG01086);
		sb.append(", XCG01087=");
		sb.append(XCG01087);
		sb.append(", XCG01088=");
		sb.append(XCG01088);
		sb.append(", XCG01090=");
		sb.append(XCG01090);
		sb.append(", XCG01091=");
		sb.append(XCG01091);
		sb.append(", XCG01092=");
		sb.append(XCG01092);
		sb.append(", XCG01123=");
		sb.append(XCG01123);
		sb.append(", XCG01124=");
		sb.append(XCG01124);
		sb.append(", XCG01125=");
		sb.append(XCG01125);
		sb.append(", XCG01156=");
		sb.append(XCG01156);
		sb.append(", XCG01157=");
		sb.append(XCG01157);
		sb.append(", XCG01163=");
		sb.append(XCG01163);
		sb.append(", XCG01169=");
		sb.append(XCG01169);
		sb.append(", XCG01170=");
		sb.append(XCG01170);
		sb.append(", XCG01171=");
		sb.append(XCG01171);
		sb.append(", XCG01172=");
		sb.append(XCG01172);
		sb.append(", XCG01173=");
		sb.append(XCG01173);
		sb.append(", XCG01182=");
		sb.append(XCG01182);
		sb.append(", XCG01183=");
		sb.append(XCG01183);
		sb.append(", XCG01192=");
		sb.append(XCG01192);
		sb.append(", loai_dong_co=");
		sb.append(loai_dong_co);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XCG toEntityModel() {
		VRTechnicalSpec_XCGImpl vrTechnicalSpec_XCGImpl = new VRTechnicalSpec_XCGImpl();

		vrTechnicalSpec_XCGImpl.setId(id);
		vrTechnicalSpec_XCGImpl.setMtCore(mtCore);
		vrTechnicalSpec_XCGImpl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XCGImpl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XCGImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XCGImpl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XCGImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XCGImpl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XCGImpl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XCG01070 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01070(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01070(XCG01070);
		}

		if (XCG01072 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01072(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01072(XCG01072);
		}

		if (XCG01083 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01083(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01083(XCG01083);
		}

		if (XCG01084 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01084(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01084(XCG01084);
		}

		if (XCG01085 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01085(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01085(XCG01085);
		}

		if (XCG01086 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01086(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01086(XCG01086);
		}

		if (XCG01087 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01087(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01087(XCG01087);
		}

		if (XCG01088 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01088(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01088(XCG01088);
		}

		if (XCG01090 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01090(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01090(XCG01090);
		}

		if (XCG01091 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01091(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01091(XCG01091);
		}

		if (XCG01092 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01092(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01092(XCG01092);
		}

		if (XCG01123 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01123(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01123(XCG01123);
		}

		if (XCG01124 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01124(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01124(XCG01124);
		}

		if (XCG01125 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01125(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01125(XCG01125);
		}

		if (XCG01156 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01156(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01156(XCG01156);
		}

		if (XCG01157 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01157(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01157(XCG01157);
		}

		if (XCG01163 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01163(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01163(XCG01163);
		}

		if (XCG01169 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01169(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01169(XCG01169);
		}

		if (XCG01170 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01170(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01170(XCG01170);
		}

		if (XCG01171 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01171(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01171(XCG01171);
		}

		if (XCG01172 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01172(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01172(XCG01172);
		}

		if (XCG01173 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01173(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01173(XCG01173);
		}

		if (XCG01182 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01182(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01182(XCG01182);
		}

		if (XCG01183 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01183(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01183(XCG01183);
		}

		if (XCG01192 == null) {
			vrTechnicalSpec_XCGImpl.setXCG01192(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setXCG01192(XCG01192);
		}

		if (loai_dong_co == null) {
			vrTechnicalSpec_XCGImpl.setLoai_dong_co(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGImpl.setLoai_dong_co(loai_dong_co);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCGImpl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XCGImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCGImpl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XCGImpl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XCGImpl.resetOriginalValues();

		return vrTechnicalSpec_XCGImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		convertAssembleId = objectInput.readLong();

		dossierId = objectInput.readLong();
		dossierNo = objectInput.readUTF();
		referenceUid = objectInput.readUTF();
		dossierIdCTN = objectInput.readUTF();
		deliverableCode = objectInput.readUTF();

		vehicleTypeCertificateId = objectInput.readLong();
		XCG01070 = objectInput.readUTF();
		XCG01072 = objectInput.readUTF();
		XCG01083 = objectInput.readUTF();
		XCG01084 = objectInput.readUTF();
		XCG01085 = objectInput.readUTF();
		XCG01086 = objectInput.readUTF();
		XCG01087 = objectInput.readUTF();
		XCG01088 = objectInput.readUTF();
		XCG01090 = objectInput.readUTF();
		XCG01091 = objectInput.readUTF();
		XCG01092 = objectInput.readUTF();
		XCG01123 = objectInput.readUTF();
		XCG01124 = objectInput.readUTF();
		XCG01125 = objectInput.readUTF();
		XCG01156 = objectInput.readUTF();
		XCG01157 = objectInput.readUTF();
		XCG01163 = objectInput.readUTF();
		XCG01169 = objectInput.readUTF();
		XCG01170 = objectInput.readUTF();
		XCG01171 = objectInput.readUTF();
		XCG01172 = objectInput.readUTF();
		XCG01173 = objectInput.readUTF();
		XCG01182 = objectInput.readUTF();
		XCG01183 = objectInput.readUTF();
		XCG01192 = objectInput.readUTF();
		loai_dong_co = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(convertAssembleId);

		objectOutput.writeLong(dossierId);

		if (dossierNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierNo);
		}

		if (referenceUid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(referenceUid);
		}

		if (dossierIdCTN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierIdCTN);
		}

		if (deliverableCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(deliverableCode);
		}

		objectOutput.writeLong(vehicleTypeCertificateId);

		if (XCG01070 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01070);
		}

		if (XCG01072 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01072);
		}

		if (XCG01083 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01083);
		}

		if (XCG01084 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01084);
		}

		if (XCG01085 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01085);
		}

		if (XCG01086 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01086);
		}

		if (XCG01087 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01087);
		}

		if (XCG01088 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01088);
		}

		if (XCG01090 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01090);
		}

		if (XCG01091 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01091);
		}

		if (XCG01092 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01092);
		}

		if (XCG01123 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01123);
		}

		if (XCG01124 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01124);
		}

		if (XCG01125 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01125);
		}

		if (XCG01156 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01156);
		}

		if (XCG01157 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01157);
		}

		if (XCG01163 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01163);
		}

		if (XCG01169 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01169);
		}

		if (XCG01170 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01170);
		}

		if (XCG01171 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01171);
		}

		if (XCG01172 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01172);
		}

		if (XCG01173 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01173);
		}

		if (XCG01182 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01182);
		}

		if (XCG01183 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01183);
		}

		if (XCG01192 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01192);
		}

		if (loai_dong_co == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loai_dong_co);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public long convertAssembleId;
	public long dossierId;
	public String dossierNo;
	public String referenceUid;
	public String dossierIdCTN;
	public String deliverableCode;
	public long vehicleTypeCertificateId;
	public String XCG01070;
	public String XCG01072;
	public String XCG01083;
	public String XCG01084;
	public String XCG01085;
	public String XCG01086;
	public String XCG01087;
	public String XCG01088;
	public String XCG01090;
	public String XCG01091;
	public String XCG01092;
	public String XCG01123;
	public String XCG01124;
	public String XCG01125;
	public String XCG01156;
	public String XCG01157;
	public String XCG01163;
	public String XCG01169;
	public String XCG01170;
	public String XCG01171;
	public String XCG01172;
	public String XCG01173;
	public String XCG01182;
	public String XCG01183;
	public String XCG01192;
	public String loai_dong_co;
	public long modifyDate;
	public long syncDate;
}