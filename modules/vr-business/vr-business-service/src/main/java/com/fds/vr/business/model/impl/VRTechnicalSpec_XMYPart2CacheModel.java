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

import com.fds.vr.business.model.VRTechnicalSpec_XMYPart2;

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
 * The cache model class for representing VRTechnicalSpec_XMYPart2 in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XMYPart2
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XMYPart2CacheModel implements CacheModel<VRTechnicalSpec_XMYPart2>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XMYPart2CacheModel)) {
			return false;
		}

		VRTechnicalSpec_XMYPart2CacheModel vrTechnicalSpec_XMYPart2CacheModel = (VRTechnicalSpec_XMYPart2CacheModel)obj;

		if (id == vrTechnicalSpec_XMYPart2CacheModel.id) {
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
		StringBundler sb = new StringBundler(295);

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
		sb.append(", XMY0010=");
		sb.append(XMY0010);
		sb.append(", XMY0011=");
		sb.append(XMY0011);
		sb.append(", XMY0012=");
		sb.append(XMY0012);
		sb.append(", XMY0013=");
		sb.append(XMY0013);
		sb.append(", XMY0014=");
		sb.append(XMY0014);
		sb.append(", XMY0015=");
		sb.append(XMY0015);
		sb.append(", XMY0016=");
		sb.append(XMY0016);
		sb.append(", XMY0017=");
		sb.append(XMY0017);
		sb.append(", XMY0018=");
		sb.append(XMY0018);
		sb.append(", XMY0019=");
		sb.append(XMY0019);
		sb.append(", XMY0020=");
		sb.append(XMY0020);
		sb.append(", XMY0021=");
		sb.append(XMY0021);
		sb.append(", XMY0022=");
		sb.append(XMY0022);
		sb.append(", XMY0023=");
		sb.append(XMY0023);
		sb.append(", XMY0024=");
		sb.append(XMY0024);
		sb.append(", XMY0025=");
		sb.append(XMY0025);
		sb.append(", XMY0026=");
		sb.append(XMY0026);
		sb.append(", XMY0027=");
		sb.append(XMY0027);
		sb.append(", XMY0028=");
		sb.append(XMY0028);
		sb.append(", XMY0029=");
		sb.append(XMY0029);
		sb.append(", XMY0030=");
		sb.append(XMY0030);
		sb.append(", XMY0031=");
		sb.append(XMY0031);
		sb.append(", XMY0032=");
		sb.append(XMY0032);
		sb.append(", XMY0033=");
		sb.append(XMY0033);
		sb.append(", XMY0034=");
		sb.append(XMY0034);
		sb.append(", XMY0036=");
		sb.append(XMY0036);
		sb.append(", XMY0037=");
		sb.append(XMY0037);
		sb.append(", XMY0038=");
		sb.append(XMY0038);
		sb.append(", XMY0039=");
		sb.append(XMY0039);
		sb.append(", XMY0040=");
		sb.append(XMY0040);
		sb.append(", XMY0041=");
		sb.append(XMY0041);
		sb.append(", XMY0042=");
		sb.append(XMY0042);
		sb.append(", XMY0043=");
		sb.append(XMY0043);
		sb.append(", XMY0044=");
		sb.append(XMY0044);
		sb.append(", XMY0045=");
		sb.append(XMY0045);
		sb.append(", XMY0046=");
		sb.append(XMY0046);
		sb.append(", XMY0048=");
		sb.append(XMY0048);
		sb.append(", XMY0049=");
		sb.append(XMY0049);
		sb.append(", XMY0050=");
		sb.append(XMY0050);
		sb.append(", XMY0051=");
		sb.append(XMY0051);
		sb.append(", XMY0052=");
		sb.append(XMY0052);
		sb.append(", XMY0053=");
		sb.append(XMY0053);
		sb.append(", XMY0054=");
		sb.append(XMY0054);
		sb.append(", XMY0055=");
		sb.append(XMY0055);
		sb.append(", XMY0056=");
		sb.append(XMY0056);
		sb.append(", XMY0057=");
		sb.append(XMY0057);
		sb.append(", XMY0058=");
		sb.append(XMY0058);
		sb.append(", XMY0059=");
		sb.append(XMY0059);
		sb.append(", XMY0060=");
		sb.append(XMY0060);
		sb.append(", XMY0061=");
		sb.append(XMY0061);
		sb.append(", XMY0062=");
		sb.append(XMY0062);
		sb.append(", XMY0063=");
		sb.append(XMY0063);
		sb.append(", XMY0064=");
		sb.append(XMY0064);
		sb.append(", XMY0065=");
		sb.append(XMY0065);
		sb.append(", XMY0066=");
		sb.append(XMY0066);
		sb.append(", XMY0067=");
		sb.append(XMY0067);
		sb.append(", XMY0068=");
		sb.append(XMY0068);
		sb.append(", XMY0070=");
		sb.append(XMY0070);
		sb.append(", XMY0071=");
		sb.append(XMY0071);
		sb.append(", XMY0072=");
		sb.append(XMY0072);
		sb.append(", XMY0073=");
		sb.append(XMY0073);
		sb.append(", XMY0074=");
		sb.append(XMY0074);
		sb.append(", XMY0075=");
		sb.append(XMY0075);
		sb.append(", XMY0076=");
		sb.append(XMY0076);
		sb.append(", XMY0077=");
		sb.append(XMY0077);
		sb.append(", XMY0078=");
		sb.append(XMY0078);
		sb.append(", XMY0079=");
		sb.append(XMY0079);
		sb.append(", XMY0080=");
		sb.append(XMY0080);
		sb.append(", XMY0081=");
		sb.append(XMY0081);
		sb.append(", XMY0082=");
		sb.append(XMY0082);
		sb.append(", XMY0083=");
		sb.append(XMY0083);
		sb.append(", XMY0084=");
		sb.append(XMY0084);
		sb.append(", XMY0085=");
		sb.append(XMY0085);
		sb.append(", XMY0086=");
		sb.append(XMY0086);
		sb.append(", XMY0087=");
		sb.append(XMY0087);
		sb.append(", XMY0088=");
		sb.append(XMY0088);
		sb.append(", XMY0089=");
		sb.append(XMY0089);
		sb.append(", XMY0090=");
		sb.append(XMY0090);
		sb.append(", XMY0091=");
		sb.append(XMY0091);
		sb.append(", XMY0092=");
		sb.append(XMY0092);
		sb.append(", XMY0093=");
		sb.append(XMY0093);
		sb.append(", XMY0094=");
		sb.append(XMY0094);
		sb.append(", XMY0095=");
		sb.append(XMY0095);
		sb.append(", XMY0096=");
		sb.append(XMY0096);
		sb.append(", XMY0097=");
		sb.append(XMY0097);
		sb.append(", XMY0098=");
		sb.append(XMY0098);
		sb.append(", XMY0099=");
		sb.append(XMY0099);
		sb.append(", XMY0100=");
		sb.append(XMY0100);
		sb.append(", XMY0101=");
		sb.append(XMY0101);
		sb.append(", XMY0102=");
		sb.append(XMY0102);
		sb.append(", XMY0103=");
		sb.append(XMY0103);
		sb.append(", XMY0104=");
		sb.append(XMY0104);
		sb.append(", XMY0105=");
		sb.append(XMY0105);
		sb.append(", XMY0106=");
		sb.append(XMY0106);
		sb.append(", XMY0107=");
		sb.append(XMY0107);
		sb.append(", XMY0108=");
		sb.append(XMY0108);
		sb.append(", XMY0109=");
		sb.append(XMY0109);
		sb.append(", XMY0110=");
		sb.append(XMY0110);
		sb.append(", XMY0111=");
		sb.append(XMY0111);
		sb.append(", XMY0112=");
		sb.append(XMY0112);
		sb.append(", XMY0113=");
		sb.append(XMY0113);
		sb.append(", XMY0114=");
		sb.append(XMY0114);
		sb.append(", XMY0115=");
		sb.append(XMY0115);
		sb.append(", XMY0116=");
		sb.append(XMY0116);
		sb.append(", XMY0117=");
		sb.append(XMY0117);
		sb.append(", XMY0118=");
		sb.append(XMY0118);
		sb.append(", XMY0119=");
		sb.append(XMY0119);
		sb.append(", XMY0120=");
		sb.append(XMY0120);
		sb.append(", XMY0121=");
		sb.append(XMY0121);
		sb.append(", XMY0122=");
		sb.append(XMY0122);
		sb.append(", XMY0123=");
		sb.append(XMY0123);
		sb.append(", XMY0124=");
		sb.append(XMY0124);
		sb.append(", XMY0125=");
		sb.append(XMY0125);
		sb.append(", XMY0126=");
		sb.append(XMY0126);
		sb.append(", XMY0127=");
		sb.append(XMY0127);
		sb.append(", XMY0128=");
		sb.append(XMY0128);
		sb.append(", XMY0129=");
		sb.append(XMY0129);
		sb.append(", XMY0130=");
		sb.append(XMY0130);
		sb.append(", XMY0131=");
		sb.append(XMY0131);
		sb.append(", XMY0132=");
		sb.append(XMY0132);
		sb.append(", XMY0133=");
		sb.append(XMY0133);
		sb.append(", XMY0134=");
		sb.append(XMY0134);
		sb.append(", XMY0135=");
		sb.append(XMY0135);
		sb.append(", XMY0136=");
		sb.append(XMY0136);
		sb.append(", XMY0137=");
		sb.append(XMY0137);
		sb.append(", XMY0138=");
		sb.append(XMY0138);
		sb.append(", XMY0139=");
		sb.append(XMY0139);
		sb.append(", XMY0140=");
		sb.append(XMY0140);
		sb.append(", XMY0141=");
		sb.append(XMY0141);
		sb.append(", XMY0142=");
		sb.append(XMY0142);
		sb.append(", XMY0143=");
		sb.append(XMY0143);
		sb.append(", XMY0144=");
		sb.append(XMY0144);
		sb.append(", XMY0145=");
		sb.append(XMY0145);
		sb.append(", XMY0146=");
		sb.append(XMY0146);
		sb.append(", XMY0147=");
		sb.append(XMY0147);
		sb.append(", XMY0148=");
		sb.append(XMY0148);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XMYPart2 toEntityModel() {
		VRTechnicalSpec_XMYPart2Impl vrTechnicalSpec_XMYPart2Impl = new VRTechnicalSpec_XMYPart2Impl();

		vrTechnicalSpec_XMYPart2Impl.setId(id);
		vrTechnicalSpec_XMYPart2Impl.setMtCore(mtCore);
		vrTechnicalSpec_XMYPart2Impl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XMYPart2Impl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XMYPart2Impl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XMYPart2Impl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XMYPart2Impl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XMYPart2Impl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XMYPart2Impl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XMY0010 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0010(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0010(XMY0010);
		}

		if (XMY0011 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0011(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0011(XMY0011);
		}

		if (XMY0012 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0012(XMY0012);
		}

		if (XMY0013 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0013(XMY0013);
		}

		if (XMY0014 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0014(XMY0014);
		}

		if (XMY0015 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0015(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0015(XMY0015);
		}

		if (XMY0016 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0016(XMY0016);
		}

		if (XMY0017 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0017(XMY0017);
		}

		if (XMY0018 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0018(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0018(XMY0018);
		}

		if (XMY0019 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0019(XMY0019);
		}

		if (XMY0020 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0020(XMY0020);
		}

		if (XMY0021 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0021(XMY0021);
		}

		if (XMY0022 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0022(XMY0022);
		}

		if (XMY0023 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0023(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0023(XMY0023);
		}

		if (XMY0024 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0024(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0024(XMY0024);
		}

		if (XMY0025 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0025(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0025(XMY0025);
		}

		if (XMY0026 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0026(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0026(XMY0026);
		}

		if (XMY0027 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0027(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0027(XMY0027);
		}

		if (XMY0028 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0028(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0028(XMY0028);
		}

		if (XMY0029 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0029(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0029(XMY0029);
		}

		if (XMY0030 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0030(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0030(XMY0030);
		}

		if (XMY0031 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0031(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0031(XMY0031);
		}

		if (XMY0032 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0032(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0032(XMY0032);
		}

		if (XMY0033 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0033(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0033(XMY0033);
		}

		if (XMY0034 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0034(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0034(XMY0034);
		}

		if (XMY0036 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0036(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0036(XMY0036);
		}

		if (XMY0037 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0037(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0037(XMY0037);
		}

		if (XMY0038 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0038(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0038(XMY0038);
		}

		if (XMY0039 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0039(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0039(XMY0039);
		}

		if (XMY0040 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0040(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0040(XMY0040);
		}

		if (XMY0041 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0041(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0041(XMY0041);
		}

		if (XMY0042 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0042(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0042(XMY0042);
		}

		if (XMY0043 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0043(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0043(XMY0043);
		}

		if (XMY0044 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0044(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0044(XMY0044);
		}

		if (XMY0045 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0045(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0045(XMY0045);
		}

		if (XMY0046 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0046(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0046(XMY0046);
		}

		if (XMY0048 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0048(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0048(XMY0048);
		}

		if (XMY0049 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0049(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0049(XMY0049);
		}

		if (XMY0050 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0050(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0050(XMY0050);
		}

		if (XMY0051 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0051(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0051(XMY0051);
		}

		if (XMY0052 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0052(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0052(XMY0052);
		}

		if (XMY0053 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0053(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0053(XMY0053);
		}

		if (XMY0054 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0054(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0054(XMY0054);
		}

		if (XMY0055 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0055(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0055(XMY0055);
		}

		if (XMY0056 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0056(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0056(XMY0056);
		}

		if (XMY0057 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0057(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0057(XMY0057);
		}

		if (XMY0058 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0058(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0058(XMY0058);
		}

		if (XMY0059 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0059(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0059(XMY0059);
		}

		if (XMY0060 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0060(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0060(XMY0060);
		}

		if (XMY0061 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0061(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0061(XMY0061);
		}

		if (XMY0062 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0062(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0062(XMY0062);
		}

		if (XMY0063 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0063(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0063(XMY0063);
		}

		if (XMY0064 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0064(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0064(XMY0064);
		}

		if (XMY0065 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0065(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0065(XMY0065);
		}

		if (XMY0066 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0066(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0066(XMY0066);
		}

		if (XMY0067 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0067(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0067(XMY0067);
		}

		if (XMY0068 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0068(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0068(XMY0068);
		}

		if (XMY0070 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0070(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0070(XMY0070);
		}

		if (XMY0071 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0071(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0071(XMY0071);
		}

		if (XMY0072 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0072(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0072(XMY0072);
		}

		if (XMY0073 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0073(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0073(XMY0073);
		}

		if (XMY0074 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0074(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0074(XMY0074);
		}

		if (XMY0075 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0075(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0075(XMY0075);
		}

		if (XMY0076 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0076(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0076(XMY0076);
		}

		if (XMY0077 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0077(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0077(XMY0077);
		}

		if (XMY0078 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0078(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0078(XMY0078);
		}

		if (XMY0079 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0079(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0079(XMY0079);
		}

		if (XMY0080 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0080(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0080(XMY0080);
		}

		if (XMY0081 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0081(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0081(XMY0081);
		}

		if (XMY0082 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0082(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0082(XMY0082);
		}

		if (XMY0083 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0083(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0083(XMY0083);
		}

		if (XMY0084 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0084(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0084(XMY0084);
		}

		if (XMY0085 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0085(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0085(XMY0085);
		}

		if (XMY0086 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0086(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0086(XMY0086);
		}

		if (XMY0087 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0087(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0087(XMY0087);
		}

		if (XMY0088 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0088(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0088(XMY0088);
		}

		if (XMY0089 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0089(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0089(XMY0089);
		}

		if (XMY0090 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0090(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0090(XMY0090);
		}

		if (XMY0091 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0091(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0091(XMY0091);
		}

		if (XMY0092 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0092(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0092(XMY0092);
		}

		if (XMY0093 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0093(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0093(XMY0093);
		}

		if (XMY0094 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0094(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0094(XMY0094);
		}

		if (XMY0095 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0095(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0095(XMY0095);
		}

		if (XMY0096 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0096(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0096(XMY0096);
		}

		if (XMY0097 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0097(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0097(XMY0097);
		}

		if (XMY0098 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0098(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0098(XMY0098);
		}

		if (XMY0099 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0099(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0099(XMY0099);
		}

		if (XMY0100 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0100(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0100(XMY0100);
		}

		if (XMY0101 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0101(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0101(XMY0101);
		}

		if (XMY0102 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0102(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0102(XMY0102);
		}

		if (XMY0103 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0103(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0103(XMY0103);
		}

		if (XMY0104 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0104(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0104(XMY0104);
		}

		if (XMY0105 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0105(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0105(XMY0105);
		}

		if (XMY0106 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0106(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0106(XMY0106);
		}

		if (XMY0107 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0107(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0107(XMY0107);
		}

		if (XMY0108 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0108(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0108(XMY0108);
		}

		if (XMY0109 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0109(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0109(XMY0109);
		}

		if (XMY0110 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0110(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0110(XMY0110);
		}

		if (XMY0111 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0111(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0111(XMY0111);
		}

		if (XMY0112 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0112(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0112(XMY0112);
		}

		if (XMY0113 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0113(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0113(XMY0113);
		}

		if (XMY0114 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0114(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0114(XMY0114);
		}

		if (XMY0115 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0115(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0115(XMY0115);
		}

		if (XMY0116 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0116(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0116(XMY0116);
		}

		if (XMY0117 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0117(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0117(XMY0117);
		}

		if (XMY0118 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0118(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0118(XMY0118);
		}

		if (XMY0119 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0119(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0119(XMY0119);
		}

		if (XMY0120 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0120(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0120(XMY0120);
		}

		if (XMY0121 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0121(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0121(XMY0121);
		}

		if (XMY0122 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0122(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0122(XMY0122);
		}

		if (XMY0123 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0123(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0123(XMY0123);
		}

		if (XMY0124 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0124(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0124(XMY0124);
		}

		if (XMY0125 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0125(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0125(XMY0125);
		}

		if (XMY0126 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0126(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0126(XMY0126);
		}

		if (XMY0127 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0127(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0127(XMY0127);
		}

		if (XMY0128 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0128(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0128(XMY0128);
		}

		if (XMY0129 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0129(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0129(XMY0129);
		}

		if (XMY0130 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0130(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0130(XMY0130);
		}

		if (XMY0131 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0131(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0131(XMY0131);
		}

		if (XMY0132 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0132(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0132(XMY0132);
		}

		if (XMY0133 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0133(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0133(XMY0133);
		}

		if (XMY0134 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0134(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0134(XMY0134);
		}

		if (XMY0135 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0135(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0135(XMY0135);
		}

		if (XMY0136 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0136(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0136(XMY0136);
		}

		if (XMY0137 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0137(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0137(XMY0137);
		}

		if (XMY0138 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0138(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0138(XMY0138);
		}

		if (XMY0139 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0139(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0139(XMY0139);
		}

		if (XMY0140 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0140(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0140(XMY0140);
		}

		if (XMY0141 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0141(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0141(XMY0141);
		}

		if (XMY0142 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0142(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0142(XMY0142);
		}

		if (XMY0143 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0143(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0143(XMY0143);
		}

		if (XMY0144 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0144(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0144(XMY0144);
		}

		if (XMY0145 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0145(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0145(XMY0145);
		}

		if (XMY0146 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0146(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0146(XMY0146);
		}

		if (XMY0147 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0147(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0147(XMY0147);
		}

		if (XMY0148 == null) {
			vrTechnicalSpec_XMYPart2Impl.setXMY0148(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setXMY0148(XMY0148);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XMYPart2Impl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XMYPart2Impl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XMYPart2Impl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XMYPart2Impl.resetOriginalValues();

		return vrTechnicalSpec_XMYPart2Impl;
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
		XMY0010 = objectInput.readUTF();
		XMY0011 = objectInput.readUTF();
		XMY0012 = objectInput.readUTF();
		XMY0013 = objectInput.readUTF();
		XMY0014 = objectInput.readUTF();
		XMY0015 = objectInput.readUTF();
		XMY0016 = objectInput.readUTF();
		XMY0017 = objectInput.readUTF();
		XMY0018 = objectInput.readUTF();
		XMY0019 = objectInput.readUTF();
		XMY0020 = objectInput.readUTF();
		XMY0021 = objectInput.readUTF();
		XMY0022 = objectInput.readUTF();
		XMY0023 = objectInput.readUTF();
		XMY0024 = objectInput.readUTF();
		XMY0025 = objectInput.readUTF();
		XMY0026 = objectInput.readUTF();
		XMY0027 = objectInput.readUTF();
		XMY0028 = objectInput.readUTF();
		XMY0029 = objectInput.readUTF();
		XMY0030 = objectInput.readUTF();
		XMY0031 = objectInput.readUTF();
		XMY0032 = objectInput.readUTF();
		XMY0033 = objectInput.readUTF();
		XMY0034 = objectInput.readUTF();
		XMY0036 = objectInput.readUTF();
		XMY0037 = objectInput.readUTF();
		XMY0038 = objectInput.readUTF();
		XMY0039 = objectInput.readUTF();
		XMY0040 = objectInput.readUTF();
		XMY0041 = objectInput.readUTF();
		XMY0042 = objectInput.readUTF();
		XMY0043 = objectInput.readUTF();
		XMY0044 = objectInput.readUTF();
		XMY0045 = objectInput.readUTF();
		XMY0046 = objectInput.readUTF();
		XMY0048 = objectInput.readUTF();
		XMY0049 = objectInput.readUTF();
		XMY0050 = objectInput.readUTF();
		XMY0051 = objectInput.readUTF();
		XMY0052 = objectInput.readUTF();
		XMY0053 = objectInput.readUTF();
		XMY0054 = objectInput.readUTF();
		XMY0055 = objectInput.readUTF();
		XMY0056 = objectInput.readUTF();
		XMY0057 = objectInput.readUTF();
		XMY0058 = objectInput.readUTF();
		XMY0059 = objectInput.readUTF();
		XMY0060 = objectInput.readUTF();
		XMY0061 = objectInput.readUTF();
		XMY0062 = objectInput.readUTF();
		XMY0063 = objectInput.readUTF();
		XMY0064 = objectInput.readUTF();
		XMY0065 = objectInput.readUTF();
		XMY0066 = objectInput.readUTF();
		XMY0067 = objectInput.readUTF();
		XMY0068 = objectInput.readUTF();
		XMY0070 = objectInput.readUTF();
		XMY0071 = objectInput.readUTF();
		XMY0072 = objectInput.readUTF();
		XMY0073 = objectInput.readUTF();
		XMY0074 = objectInput.readUTF();
		XMY0075 = objectInput.readUTF();
		XMY0076 = objectInput.readUTF();
		XMY0077 = objectInput.readUTF();
		XMY0078 = objectInput.readUTF();
		XMY0079 = objectInput.readUTF();
		XMY0080 = objectInput.readUTF();
		XMY0081 = objectInput.readUTF();
		XMY0082 = objectInput.readUTF();
		XMY0083 = objectInput.readUTF();
		XMY0084 = objectInput.readUTF();
		XMY0085 = objectInput.readUTF();
		XMY0086 = objectInput.readUTF();
		XMY0087 = objectInput.readUTF();
		XMY0088 = objectInput.readUTF();
		XMY0089 = objectInput.readUTF();
		XMY0090 = objectInput.readUTF();
		XMY0091 = objectInput.readUTF();
		XMY0092 = objectInput.readUTF();
		XMY0093 = objectInput.readUTF();
		XMY0094 = objectInput.readUTF();
		XMY0095 = objectInput.readUTF();
		XMY0096 = objectInput.readUTF();
		XMY0097 = objectInput.readUTF();
		XMY0098 = objectInput.readUTF();
		XMY0099 = objectInput.readUTF();
		XMY0100 = objectInput.readUTF();
		XMY0101 = objectInput.readUTF();
		XMY0102 = objectInput.readUTF();
		XMY0103 = objectInput.readUTF();
		XMY0104 = objectInput.readUTF();
		XMY0105 = objectInput.readUTF();
		XMY0106 = objectInput.readUTF();
		XMY0107 = objectInput.readUTF();
		XMY0108 = objectInput.readUTF();
		XMY0109 = objectInput.readUTF();
		XMY0110 = objectInput.readUTF();
		XMY0111 = objectInput.readUTF();
		XMY0112 = objectInput.readUTF();
		XMY0113 = objectInput.readUTF();
		XMY0114 = objectInput.readUTF();
		XMY0115 = objectInput.readUTF();
		XMY0116 = objectInput.readUTF();
		XMY0117 = objectInput.readUTF();
		XMY0118 = objectInput.readUTF();
		XMY0119 = objectInput.readUTF();
		XMY0120 = objectInput.readUTF();
		XMY0121 = objectInput.readUTF();
		XMY0122 = objectInput.readUTF();
		XMY0123 = objectInput.readUTF();
		XMY0124 = objectInput.readUTF();
		XMY0125 = objectInput.readUTF();
		XMY0126 = objectInput.readUTF();
		XMY0127 = objectInput.readUTF();
		XMY0128 = objectInput.readUTF();
		XMY0129 = objectInput.readUTF();
		XMY0130 = objectInput.readUTF();
		XMY0131 = objectInput.readUTF();
		XMY0132 = objectInput.readUTF();
		XMY0133 = objectInput.readUTF();
		XMY0134 = objectInput.readUTF();
		XMY0135 = objectInput.readUTF();
		XMY0136 = objectInput.readUTF();
		XMY0137 = objectInput.readUTF();
		XMY0138 = objectInput.readUTF();
		XMY0139 = objectInput.readUTF();
		XMY0140 = objectInput.readUTF();
		XMY0141 = objectInput.readUTF();
		XMY0142 = objectInput.readUTF();
		XMY0143 = objectInput.readUTF();
		XMY0144 = objectInput.readUTF();
		XMY0145 = objectInput.readUTF();
		XMY0146 = objectInput.readUTF();
		XMY0147 = objectInput.readUTF();
		XMY0148 = objectInput.readUTF();
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

		if (XMY0010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0010);
		}

		if (XMY0011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0011);
		}

		if (XMY0012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0012);
		}

		if (XMY0013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0013);
		}

		if (XMY0014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0014);
		}

		if (XMY0015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0015);
		}

		if (XMY0016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0016);
		}

		if (XMY0017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0017);
		}

		if (XMY0018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0018);
		}

		if (XMY0019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0019);
		}

		if (XMY0020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0020);
		}

		if (XMY0021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0021);
		}

		if (XMY0022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0022);
		}

		if (XMY0023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0023);
		}

		if (XMY0024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0024);
		}

		if (XMY0025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0025);
		}

		if (XMY0026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0026);
		}

		if (XMY0027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0027);
		}

		if (XMY0028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0028);
		}

		if (XMY0029 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0029);
		}

		if (XMY0030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0030);
		}

		if (XMY0031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0031);
		}

		if (XMY0032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0032);
		}

		if (XMY0033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0033);
		}

		if (XMY0034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0034);
		}

		if (XMY0036 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0036);
		}

		if (XMY0037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0037);
		}

		if (XMY0038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0038);
		}

		if (XMY0039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0039);
		}

		if (XMY0040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0040);
		}

		if (XMY0041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0041);
		}

		if (XMY0042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0042);
		}

		if (XMY0043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0043);
		}

		if (XMY0044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0044);
		}

		if (XMY0045 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0045);
		}

		if (XMY0046 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0046);
		}

		if (XMY0048 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0048);
		}

		if (XMY0049 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0049);
		}

		if (XMY0050 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0050);
		}

		if (XMY0051 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0051);
		}

		if (XMY0052 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0052);
		}

		if (XMY0053 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0053);
		}

		if (XMY0054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0054);
		}

		if (XMY0055 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0055);
		}

		if (XMY0056 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0056);
		}

		if (XMY0057 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0057);
		}

		if (XMY0058 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0058);
		}

		if (XMY0059 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0059);
		}

		if (XMY0060 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0060);
		}

		if (XMY0061 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0061);
		}

		if (XMY0062 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0062);
		}

		if (XMY0063 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0063);
		}

		if (XMY0064 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0064);
		}

		if (XMY0065 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0065);
		}

		if (XMY0066 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0066);
		}

		if (XMY0067 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0067);
		}

		if (XMY0068 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0068);
		}

		if (XMY0070 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0070);
		}

		if (XMY0071 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0071);
		}

		if (XMY0072 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0072);
		}

		if (XMY0073 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0073);
		}

		if (XMY0074 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0074);
		}

		if (XMY0075 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0075);
		}

		if (XMY0076 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0076);
		}

		if (XMY0077 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0077);
		}

		if (XMY0078 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0078);
		}

		if (XMY0079 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0079);
		}

		if (XMY0080 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0080);
		}

		if (XMY0081 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0081);
		}

		if (XMY0082 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0082);
		}

		if (XMY0083 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0083);
		}

		if (XMY0084 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0084);
		}

		if (XMY0085 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0085);
		}

		if (XMY0086 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0086);
		}

		if (XMY0087 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0087);
		}

		if (XMY0088 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0088);
		}

		if (XMY0089 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0089);
		}

		if (XMY0090 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0090);
		}

		if (XMY0091 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0091);
		}

		if (XMY0092 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0092);
		}

		if (XMY0093 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0093);
		}

		if (XMY0094 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0094);
		}

		if (XMY0095 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0095);
		}

		if (XMY0096 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0096);
		}

		if (XMY0097 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0097);
		}

		if (XMY0098 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0098);
		}

		if (XMY0099 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0099);
		}

		if (XMY0100 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0100);
		}

		if (XMY0101 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0101);
		}

		if (XMY0102 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0102);
		}

		if (XMY0103 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0103);
		}

		if (XMY0104 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0104);
		}

		if (XMY0105 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0105);
		}

		if (XMY0106 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0106);
		}

		if (XMY0107 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0107);
		}

		if (XMY0108 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0108);
		}

		if (XMY0109 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0109);
		}

		if (XMY0110 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0110);
		}

		if (XMY0111 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0111);
		}

		if (XMY0112 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0112);
		}

		if (XMY0113 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0113);
		}

		if (XMY0114 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0114);
		}

		if (XMY0115 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0115);
		}

		if (XMY0116 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0116);
		}

		if (XMY0117 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0117);
		}

		if (XMY0118 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0118);
		}

		if (XMY0119 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0119);
		}

		if (XMY0120 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0120);
		}

		if (XMY0121 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0121);
		}

		if (XMY0122 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0122);
		}

		if (XMY0123 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0123);
		}

		if (XMY0124 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0124);
		}

		if (XMY0125 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0125);
		}

		if (XMY0126 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0126);
		}

		if (XMY0127 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0127);
		}

		if (XMY0128 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0128);
		}

		if (XMY0129 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0129);
		}

		if (XMY0130 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0130);
		}

		if (XMY0131 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0131);
		}

		if (XMY0132 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0132);
		}

		if (XMY0133 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0133);
		}

		if (XMY0134 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0134);
		}

		if (XMY0135 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0135);
		}

		if (XMY0136 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0136);
		}

		if (XMY0137 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0137);
		}

		if (XMY0138 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0138);
		}

		if (XMY0139 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0139);
		}

		if (XMY0140 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0140);
		}

		if (XMY0141 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0141);
		}

		if (XMY0142 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0142);
		}

		if (XMY0143 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0143);
		}

		if (XMY0144 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0144);
		}

		if (XMY0145 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0145);
		}

		if (XMY0146 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0146);
		}

		if (XMY0147 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0147);
		}

		if (XMY0148 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0148);
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
	public String XMY0010;
	public String XMY0011;
	public String XMY0012;
	public String XMY0013;
	public String XMY0014;
	public String XMY0015;
	public String XMY0016;
	public String XMY0017;
	public String XMY0018;
	public String XMY0019;
	public String XMY0020;
	public String XMY0021;
	public String XMY0022;
	public String XMY0023;
	public String XMY0024;
	public String XMY0025;
	public String XMY0026;
	public String XMY0027;
	public String XMY0028;
	public String XMY0029;
	public String XMY0030;
	public String XMY0031;
	public String XMY0032;
	public String XMY0033;
	public String XMY0034;
	public String XMY0036;
	public String XMY0037;
	public String XMY0038;
	public String XMY0039;
	public String XMY0040;
	public String XMY0041;
	public String XMY0042;
	public String XMY0043;
	public String XMY0044;
	public String XMY0045;
	public String XMY0046;
	public String XMY0048;
	public String XMY0049;
	public String XMY0050;
	public String XMY0051;
	public String XMY0052;
	public String XMY0053;
	public String XMY0054;
	public String XMY0055;
	public String XMY0056;
	public String XMY0057;
	public String XMY0058;
	public String XMY0059;
	public String XMY0060;
	public String XMY0061;
	public String XMY0062;
	public String XMY0063;
	public String XMY0064;
	public String XMY0065;
	public String XMY0066;
	public String XMY0067;
	public String XMY0068;
	public String XMY0070;
	public String XMY0071;
	public String XMY0072;
	public String XMY0073;
	public String XMY0074;
	public String XMY0075;
	public String XMY0076;
	public String XMY0077;
	public String XMY0078;
	public String XMY0079;
	public String XMY0080;
	public String XMY0081;
	public String XMY0082;
	public String XMY0083;
	public String XMY0084;
	public String XMY0085;
	public String XMY0086;
	public String XMY0087;
	public String XMY0088;
	public String XMY0089;
	public String XMY0090;
	public String XMY0091;
	public String XMY0092;
	public String XMY0093;
	public String XMY0094;
	public String XMY0095;
	public String XMY0096;
	public String XMY0097;
	public String XMY0098;
	public String XMY0099;
	public String XMY0100;
	public String XMY0101;
	public String XMY0102;
	public String XMY0103;
	public String XMY0104;
	public String XMY0105;
	public String XMY0106;
	public String XMY0107;
	public String XMY0108;
	public String XMY0109;
	public String XMY0110;
	public String XMY0111;
	public String XMY0112;
	public String XMY0113;
	public String XMY0114;
	public String XMY0115;
	public String XMY0116;
	public String XMY0117;
	public String XMY0118;
	public String XMY0119;
	public String XMY0120;
	public String XMY0121;
	public String XMY0122;
	public String XMY0123;
	public String XMY0124;
	public String XMY0125;
	public String XMY0126;
	public String XMY0127;
	public String XMY0128;
	public String XMY0129;
	public String XMY0130;
	public String XMY0131;
	public String XMY0132;
	public String XMY0133;
	public String XMY0134;
	public String XMY0135;
	public String XMY0136;
	public String XMY0137;
	public String XMY0138;
	public String XMY0139;
	public String XMY0140;
	public String XMY0141;
	public String XMY0142;
	public String XMY0143;
	public String XMY0144;
	public String XMY0145;
	public String XMY0146;
	public String XMY0147;
	public String XMY0148;
	public long modifyDate;
	public long syncDate;
}