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

import com.fds.vr.business.model.VRTechnicalSpec_LKXMY;

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
 * The cache model class for representing VRTechnicalSpec_LKXMY in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_LKXMY
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_LKXMYCacheModel implements CacheModel<VRTechnicalSpec_LKXMY>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_LKXMYCacheModel)) {
			return false;
		}

		VRTechnicalSpec_LKXMYCacheModel vrTechnicalSpec_LKXMYCacheModel = (VRTechnicalSpec_LKXMYCacheModel)obj;

		if (id == vrTechnicalSpec_LKXMYCacheModel.id) {
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
		StringBundler sb = new StringBundler(421);

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
		sb.append(", XMY01001=");
		sb.append(XMY01001);
		sb.append(", XMY01002=");
		sb.append(XMY01002);
		sb.append(", XMY01003=");
		sb.append(XMY01003);
		sb.append(", XMY01004=");
		sb.append(XMY01004);
		sb.append(", XMY01005=");
		sb.append(XMY01005);
		sb.append(", XMY01006=");
		sb.append(XMY01006);
		sb.append(", XMY01007=");
		sb.append(XMY01007);
		sb.append(", XMY01008=");
		sb.append(XMY01008);
		sb.append(", XMY01009=");
		sb.append(XMY01009);
		sb.append(", XMY01010=");
		sb.append(XMY01010);
		sb.append(", XMY01011=");
		sb.append(XMY01011);
		sb.append(", XMY01012=");
		sb.append(XMY01012);
		sb.append(", XMY01013=");
		sb.append(XMY01013);
		sb.append(", XMY01014=");
		sb.append(XMY01014);
		sb.append(", XMY01016=");
		sb.append(XMY01016);
		sb.append(", XMY01017=");
		sb.append(XMY01017);
		sb.append(", XMY01019=");
		sb.append(XMY01019);
		sb.append(", XMY01020=");
		sb.append(XMY01020);
		sb.append(", XMY01021=");
		sb.append(XMY01021);
		sb.append(", XMY01022=");
		sb.append(XMY01022);
		sb.append(", XMY01030=");
		sb.append(XMY01030);
		sb.append(", XMY01031=");
		sb.append(XMY01031);
		sb.append(", XMY01032=");
		sb.append(XMY01032);
		sb.append(", XMY01033=");
		sb.append(XMY01033);
		sb.append(", XMY01034=");
		sb.append(XMY01034);
		sb.append(", XMY01035=");
		sb.append(XMY01035);
		sb.append(", XMY01036=");
		sb.append(XMY01036);
		sb.append(", XMY01037=");
		sb.append(XMY01037);
		sb.append(", XMY01038=");
		sb.append(XMY01038);
		sb.append(", XMY01039=");
		sb.append(XMY01039);
		sb.append(", XMY01040=");
		sb.append(XMY01040);
		sb.append(", XMY01041=");
		sb.append(XMY01041);
		sb.append(", XMY01042=");
		sb.append(XMY01042);
		sb.append(", XMY01043=");
		sb.append(XMY01043);
		sb.append(", XMY01044=");
		sb.append(XMY01044);
		sb.append(", XMY01045=");
		sb.append(XMY01045);
		sb.append(", XMY01046=");
		sb.append(XMY01046);
		sb.append(", XMY01047=");
		sb.append(XMY01047);
		sb.append(", XMY01050=");
		sb.append(XMY01050);
		sb.append(", XMY01051=");
		sb.append(XMY01051);
		sb.append(", XMY01052=");
		sb.append(XMY01052);
		sb.append(", XMY01053=");
		sb.append(XMY01053);
		sb.append(", XMY01054=");
		sb.append(XMY01054);
		sb.append(", XMY01055=");
		sb.append(XMY01055);
		sb.append(", XMY01056=");
		sb.append(XMY01056);
		sb.append(", XMY01057=");
		sb.append(XMY01057);
		sb.append(", XMY01058=");
		sb.append(XMY01058);
		sb.append(", XMY01059=");
		sb.append(XMY01059);
		sb.append(", XMY01060=");
		sb.append(XMY01060);
		sb.append(", XMY01062=");
		sb.append(XMY01062);
		sb.append(", XMY01063=");
		sb.append(XMY01063);
		sb.append(", XMY01064=");
		sb.append(XMY01064);
		sb.append(", XMY01065=");
		sb.append(XMY01065);
		sb.append(", LKXMY01050=");
		sb.append(LKXMY01050);
		sb.append(", LKXMY01051=");
		sb.append(LKXMY01051);
		sb.append(", LKXMY01052=");
		sb.append(LKXMY01052);
		sb.append(", LKXMY01053=");
		sb.append(LKXMY01053);
		sb.append(", LKXMY01026=");
		sb.append(LKXMY01026);
		sb.append(", LKXMY0401=");
		sb.append(LKXMY0401);
		sb.append(", LKXMY0402=");
		sb.append(LKXMY0402);
		sb.append(", LKXMY0403=");
		sb.append(LKXMY0403);
		sb.append(", LKXMY0404=");
		sb.append(LKXMY0404);
		sb.append(", LKXMY0405=");
		sb.append(LKXMY0405);
		sb.append(", LKXMY0406=");
		sb.append(LKXMY0406);
		sb.append(", LKXMY1307=");
		sb.append(LKXMY1307);
		sb.append(", LKXMY1308=");
		sb.append(LKXMY1308);
		sb.append(", LKXMY1309=");
		sb.append(LKXMY1309);
		sb.append(", LKXMY1310=");
		sb.append(LKXMY1310);
		sb.append(", LKXMY1311=");
		sb.append(LKXMY1311);
		sb.append(", LKXMY1312=");
		sb.append(LKXMY1312);
		sb.append(", LKXMY1207=");
		sb.append(LKXMY1207);
		sb.append(", LKXMY1208=");
		sb.append(LKXMY1208);
		sb.append(", LKXMY1209=");
		sb.append(LKXMY1209);
		sb.append(", LKXMY1210=");
		sb.append(LKXMY1210);
		sb.append(", LKXMY1211=");
		sb.append(LKXMY1211);
		sb.append(", LKXMY0201=");
		sb.append(LKXMY0201);
		sb.append(", LKXMY0202=");
		sb.append(LKXMY0202);
		sb.append(", LKXMY0203=");
		sb.append(LKXMY0203);
		sb.append(", LKXMY0204=");
		sb.append(LKXMY0204);
		sb.append(", LKXMY0205=");
		sb.append(LKXMY0205);
		sb.append(", LKXMY0206=");
		sb.append(LKXMY0206);
		sb.append(", LKXMY0207=");
		sb.append(LKXMY0207);
		sb.append(", LKXMY0208=");
		sb.append(LKXMY0208);
		sb.append(", LKXMY0209=");
		sb.append(LKXMY0209);
		sb.append(", LKXMY0210=");
		sb.append(LKXMY0210);
		sb.append(", LKXMY0211=");
		sb.append(LKXMY0211);
		sb.append(", LKXMY0212=");
		sb.append(LKXMY0212);
		sb.append(", LKXMY0213=");
		sb.append(LKXMY0213);
		sb.append(", LKXMY0214=");
		sb.append(LKXMY0214);
		sb.append(", LKXMY0215=");
		sb.append(LKXMY0215);
		sb.append(", LKXMY0216=");
		sb.append(LKXMY0216);
		sb.append(", LKXMY0217=");
		sb.append(LKXMY0217);
		sb.append(", LKXMY0218=");
		sb.append(LKXMY0218);
		sb.append(", LKXMY0219=");
		sb.append(LKXMY0219);
		sb.append(", LKXMY0040=");
		sb.append(LKXMY0040);
		sb.append(", LKXMY0041=");
		sb.append(LKXMY0041);
		sb.append(", LKXMY0042=");
		sb.append(LKXMY0042);
		sb.append(", LKXMY0043=");
		sb.append(LKXMY0043);
		sb.append(", LKXMY0044=");
		sb.append(LKXMY0044);
		sb.append(", LKXMY0045=");
		sb.append(LKXMY0045);
		sb.append(", LKXMY0046=");
		sb.append(LKXMY0046);
		sb.append(", LKXMY0048=");
		sb.append(LKXMY0048);
		sb.append(", LKXMY0049=");
		sb.append(LKXMY0049);
		sb.append(", LKXMY0050=");
		sb.append(LKXMY0050);
		sb.append(", LKXMY0051=");
		sb.append(LKXMY0051);
		sb.append(", LKXMY0052=");
		sb.append(LKXMY0052);
		sb.append(", LKXMY0054=");
		sb.append(LKXMY0054);
		sb.append(", LKXMY0055=");
		sb.append(LKXMY0055);
		sb.append(", LKXMY0056=");
		sb.append(LKXMY0056);
		sb.append(", LKXMY0057=");
		sb.append(LKXMY0057);
		sb.append(", LKXMY0058=");
		sb.append(LKXMY0058);
		sb.append(", LKXMY0059=");
		sb.append(LKXMY0059);
		sb.append(", LKXMY0060=");
		sb.append(LKXMY0060);
		sb.append(", LKXMY0061=");
		sb.append(LKXMY0061);
		sb.append(", LKXMY0062=");
		sb.append(LKXMY0062);
		sb.append(", LKXMY0063=");
		sb.append(LKXMY0063);
		sb.append(", LKXMY0109=");
		sb.append(LKXMY0109);
		sb.append(", LKXMY0110=");
		sb.append(LKXMY0110);
		sb.append(", LKXMY0111=");
		sb.append(LKXMY0111);
		sb.append(", LKXMY0112=");
		sb.append(LKXMY0112);
		sb.append(", LKXMY0113=");
		sb.append(LKXMY0113);
		sb.append(", LKXMY0114=");
		sb.append(LKXMY0114);
		sb.append(", LKXMY0115=");
		sb.append(LKXMY0115);
		sb.append(", LKXMY0116=");
		sb.append(LKXMY0116);
		sb.append(", LKXMY0117=");
		sb.append(LKXMY0117);
		sb.append(", LKXMY0118=");
		sb.append(LKXMY0118);
		sb.append(", LKXMY0119=");
		sb.append(LKXMY0119);
		sb.append(", LKXMY0120=");
		sb.append(LKXMY0120);
		sb.append(", LKXMY0121=");
		sb.append(LKXMY0121);
		sb.append(", LKXMY0122=");
		sb.append(LKXMY0122);
		sb.append(", LKXMY0123=");
		sb.append(LKXMY0123);
		sb.append(", LKXMY0124=");
		sb.append(LKXMY0124);
		sb.append(", LKXMY0125=");
		sb.append(LKXMY0125);
		sb.append(", LKXMY0126=");
		sb.append(LKXMY0126);
		sb.append(", LKXMY0127=");
		sb.append(LKXMY0127);
		sb.append(", LKXMY0128=");
		sb.append(LKXMY0128);
		sb.append(", LKXMY0129=");
		sb.append(LKXMY0129);
		sb.append(", LKXMY0130=");
		sb.append(LKXMY0130);
		sb.append(", LKXMY0131=");
		sb.append(LKXMY0131);
		sb.append(", LKXMY0064=");
		sb.append(LKXMY0064);
		sb.append(", LKXMY0132=");
		sb.append(LKXMY0132);
		sb.append(", LKXMY0133=");
		sb.append(LKXMY0133);
		sb.append(", LKXMY0134=");
		sb.append(LKXMY0134);
		sb.append(", LKXMY0135=");
		sb.append(LKXMY0135);
		sb.append(", LKXMY0136=");
		sb.append(LKXMY0136);
		sb.append(", LKXMY0137=");
		sb.append(LKXMY0137);
		sb.append(", LKXMY0138=");
		sb.append(LKXMY0138);
		sb.append(", LKXMY0139=");
		sb.append(LKXMY0139);
		sb.append(", LKXMY0140=");
		sb.append(LKXMY0140);
		sb.append(", LKXMY0066=");
		sb.append(LKXMY0066);
		sb.append(", LKXMY0141=");
		sb.append(LKXMY0141);
		sb.append(", LKXMY0142=");
		sb.append(LKXMY0142);
		sb.append(", LKXMY0143=");
		sb.append(LKXMY0143);
		sb.append(", LKXMY0144=");
		sb.append(LKXMY0144);
		sb.append(", LKXMY0145=");
		sb.append(LKXMY0145);
		sb.append(", LKXMY0146=");
		sb.append(LKXMY0146);
		sb.append(", LKXMY0147=");
		sb.append(LKXMY0147);
		sb.append(", LKXMY0148=");
		sb.append(LKXMY0148);
		sb.append(", LKXMY0149=");
		sb.append(LKXMY0149);
		sb.append(", LKXMY0150=");
		sb.append(LKXMY0150);
		sb.append(", LKXMY0153=");
		sb.append(LKXMY0153);
		sb.append(", LKXMY0154=");
		sb.append(LKXMY0154);
		sb.append(", LKXMY0155=");
		sb.append(LKXMY0155);
		sb.append(", LKXMY0156=");
		sb.append(LKXMY0156);
		sb.append(", LKXMY0157=");
		sb.append(LKXMY0157);
		sb.append(", LKXMY0158=");
		sb.append(LKXMY0158);
		sb.append(", LKXMY0159=");
		sb.append(LKXMY0159);
		sb.append(", LKXMY0160=");
		sb.append(LKXMY0160);
		sb.append(", LKXMY0151=");
		sb.append(LKXMY0151);
		sb.append(", LKXMY0161=");
		sb.append(LKXMY0161);
		sb.append(", LKXMY0162=");
		sb.append(LKXMY0162);
		sb.append(", LKXMY0163=");
		sb.append(LKXMY0163);
		sb.append(", LKXMY0164=");
		sb.append(LKXMY0164);
		sb.append(", LKXMY0165=");
		sb.append(LKXMY0165);
		sb.append(", LKXMY0166=");
		sb.append(LKXMY0166);
		sb.append(", LKXMY0167=");
		sb.append(LKXMY0167);
		sb.append(", LKXMY0168=");
		sb.append(LKXMY0168);
		sb.append(", LKXMY0169=");
		sb.append(LKXMY0169);
		sb.append(", LKXMY0170=");
		sb.append(LKXMY0170);
		sb.append(", LKXMY0171=");
		sb.append(LKXMY0171);
		sb.append(", LKXMY0172=");
		sb.append(LKXMY0172);
		sb.append(", LKXMY0173=");
		sb.append(LKXMY0173);
		sb.append(", LKXMY0174=");
		sb.append(LKXMY0174);
		sb.append(", LKXMY0175=");
		sb.append(LKXMY0175);
		sb.append(", LKXMY0176=");
		sb.append(LKXMY0176);
		sb.append(", LKXMY0177=");
		sb.append(LKXMY0177);
		sb.append(", LKXMY0178=");
		sb.append(LKXMY0178);
		sb.append(", LKXMY0179=");
		sb.append(LKXMY0179);
		sb.append(", LKXMY0407=");
		sb.append(LKXMY0407);
		sb.append(", LKXMY0408=");
		sb.append(LKXMY0408);
		sb.append(", LKXMY0409=");
		sb.append(LKXMY0409);
		sb.append(", LKXMY0410=");
		sb.append(LKXMY0410);
		sb.append(", LKXMY0412=");
		sb.append(LKXMY0412);
		sb.append(", LKXMY0413=");
		sb.append(LKXMY0413);
		sb.append(", LKXMY0414=");
		sb.append(LKXMY0414);
		sb.append(", LKXMY0415=");
		sb.append(LKXMY0415);
		sb.append(", LKXMY0416=");
		sb.append(LKXMY0416);
		sb.append(", LKXMY0417=");
		sb.append(LKXMY0417);
		sb.append(", LKXMY0418=");
		sb.append(LKXMY0418);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_LKXMY toEntityModel() {
		VRTechnicalSpec_LKXMYImpl vrTechnicalSpec_LKXMYImpl = new VRTechnicalSpec_LKXMYImpl();

		vrTechnicalSpec_LKXMYImpl.setId(id);
		vrTechnicalSpec_LKXMYImpl.setMtCore(mtCore);
		vrTechnicalSpec_LKXMYImpl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_LKXMYImpl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_LKXMYImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_LKXMYImpl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_LKXMYImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_LKXMYImpl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_LKXMYImpl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XMY01001 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01001(XMY01001);
		}

		if (XMY01002 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01002(XMY01002);
		}

		if (XMY01003 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01003(XMY01003);
		}

		if (XMY01004 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01004(XMY01004);
		}

		if (XMY01005 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01005(XMY01005);
		}

		if (XMY01006 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01006(XMY01006);
		}

		if (XMY01007 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01007(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01007(XMY01007);
		}

		if (XMY01008 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01008(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01008(XMY01008);
		}

		if (XMY01009 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01009(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01009(XMY01009);
		}

		if (XMY01010 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01010(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01010(XMY01010);
		}

		if (XMY01011 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01011(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01011(XMY01011);
		}

		if (XMY01012 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01012(XMY01012);
		}

		if (XMY01013 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01013(XMY01013);
		}

		if (XMY01014 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01014(XMY01014);
		}

		if (XMY01016 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01016(XMY01016);
		}

		if (XMY01017 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01017(XMY01017);
		}

		if (XMY01019 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01019(XMY01019);
		}

		if (XMY01020 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01020(XMY01020);
		}

		if (XMY01021 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01021(XMY01021);
		}

		if (XMY01022 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01022(XMY01022);
		}

		if (XMY01030 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01030(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01030(XMY01030);
		}

		if (XMY01031 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01031(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01031(XMY01031);
		}

		if (XMY01032 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01032(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01032(XMY01032);
		}

		if (XMY01033 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01033(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01033(XMY01033);
		}

		if (XMY01034 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01034(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01034(XMY01034);
		}

		if (XMY01035 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01035(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01035(XMY01035);
		}

		if (XMY01036 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01036(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01036(XMY01036);
		}

		if (XMY01037 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01037(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01037(XMY01037);
		}

		if (XMY01038 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01038(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01038(XMY01038);
		}

		if (XMY01039 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01039(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01039(XMY01039);
		}

		if (XMY01040 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01040(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01040(XMY01040);
		}

		if (XMY01041 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01041(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01041(XMY01041);
		}

		if (XMY01042 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01042(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01042(XMY01042);
		}

		if (XMY01043 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01043(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01043(XMY01043);
		}

		if (XMY01044 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01044(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01044(XMY01044);
		}

		if (XMY01045 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01045(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01045(XMY01045);
		}

		if (XMY01046 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01046(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01046(XMY01046);
		}

		if (XMY01047 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01047(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01047(XMY01047);
		}

		if (XMY01050 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01050(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01050(XMY01050);
		}

		if (XMY01051 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01051(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01051(XMY01051);
		}

		if (XMY01052 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01052(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01052(XMY01052);
		}

		if (XMY01053 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01053(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01053(XMY01053);
		}

		if (XMY01054 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01054(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01054(XMY01054);
		}

		if (XMY01055 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01055(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01055(XMY01055);
		}

		if (XMY01056 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01056(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01056(XMY01056);
		}

		if (XMY01057 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01057(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01057(XMY01057);
		}

		if (XMY01058 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01058(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01058(XMY01058);
		}

		if (XMY01059 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01059(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01059(XMY01059);
		}

		if (XMY01060 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01060(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01060(XMY01060);
		}

		if (XMY01062 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01062(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01062(XMY01062);
		}

		if (XMY01063 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01063(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01063(XMY01063);
		}

		if (XMY01064 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01064(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01064(XMY01064);
		}

		if (XMY01065 == null) {
			vrTechnicalSpec_LKXMYImpl.setXMY01065(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setXMY01065(XMY01065);
		}

		if (LKXMY01050 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY01050(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY01050(LKXMY01050);
		}

		if (LKXMY01051 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY01051(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY01051(LKXMY01051);
		}

		if (LKXMY01052 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY01052(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY01052(LKXMY01052);
		}

		if (LKXMY01053 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY01053(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY01053(LKXMY01053);
		}

		if (LKXMY01026 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY01026(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY01026(LKXMY01026);
		}

		if (LKXMY0401 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0401(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0401(LKXMY0401);
		}

		if (LKXMY0402 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0402(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0402(LKXMY0402);
		}

		if (LKXMY0403 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0403(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0403(LKXMY0403);
		}

		if (LKXMY0404 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0404(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0404(LKXMY0404);
		}

		if (LKXMY0405 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0405(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0405(LKXMY0405);
		}

		if (LKXMY0406 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0406(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0406(LKXMY0406);
		}

		if (LKXMY1307 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1307(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1307(LKXMY1307);
		}

		if (LKXMY1308 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1308(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1308(LKXMY1308);
		}

		if (LKXMY1309 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1309(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1309(LKXMY1309);
		}

		if (LKXMY1310 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1310(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1310(LKXMY1310);
		}

		if (LKXMY1311 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1311(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1311(LKXMY1311);
		}

		if (LKXMY1312 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1312(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1312(LKXMY1312);
		}

		if (LKXMY1207 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1207(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1207(LKXMY1207);
		}

		if (LKXMY1208 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1208(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1208(LKXMY1208);
		}

		if (LKXMY1209 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1209(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1209(LKXMY1209);
		}

		if (LKXMY1210 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1210(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1210(LKXMY1210);
		}

		if (LKXMY1211 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1211(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY1211(LKXMY1211);
		}

		if (LKXMY0201 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0201(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0201(LKXMY0201);
		}

		if (LKXMY0202 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0202(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0202(LKXMY0202);
		}

		if (LKXMY0203 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0203(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0203(LKXMY0203);
		}

		if (LKXMY0204 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0204(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0204(LKXMY0204);
		}

		if (LKXMY0205 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0205(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0205(LKXMY0205);
		}

		if (LKXMY0206 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0206(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0206(LKXMY0206);
		}

		if (LKXMY0207 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0207(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0207(LKXMY0207);
		}

		if (LKXMY0208 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0208(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0208(LKXMY0208);
		}

		if (LKXMY0209 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0209(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0209(LKXMY0209);
		}

		if (LKXMY0210 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0210(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0210(LKXMY0210);
		}

		if (LKXMY0211 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0211(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0211(LKXMY0211);
		}

		if (LKXMY0212 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0212(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0212(LKXMY0212);
		}

		if (LKXMY0213 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0213(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0213(LKXMY0213);
		}

		if (LKXMY0214 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0214(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0214(LKXMY0214);
		}

		if (LKXMY0215 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0215(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0215(LKXMY0215);
		}

		if (LKXMY0216 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0216(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0216(LKXMY0216);
		}

		if (LKXMY0217 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0217(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0217(LKXMY0217);
		}

		if (LKXMY0218 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0218(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0218(LKXMY0218);
		}

		if (LKXMY0219 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0219(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0219(LKXMY0219);
		}

		if (LKXMY0040 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0040(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0040(LKXMY0040);
		}

		if (LKXMY0041 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0041(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0041(LKXMY0041);
		}

		if (LKXMY0042 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0042(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0042(LKXMY0042);
		}

		if (LKXMY0043 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0043(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0043(LKXMY0043);
		}

		if (LKXMY0044 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0044(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0044(LKXMY0044);
		}

		if (LKXMY0045 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0045(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0045(LKXMY0045);
		}

		if (LKXMY0046 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0046(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0046(LKXMY0046);
		}

		if (LKXMY0048 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0048(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0048(LKXMY0048);
		}

		if (LKXMY0049 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0049(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0049(LKXMY0049);
		}

		if (LKXMY0050 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0050(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0050(LKXMY0050);
		}

		if (LKXMY0051 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0051(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0051(LKXMY0051);
		}

		if (LKXMY0052 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0052(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0052(LKXMY0052);
		}

		if (LKXMY0054 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0054(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0054(LKXMY0054);
		}

		if (LKXMY0055 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0055(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0055(LKXMY0055);
		}

		if (LKXMY0056 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0056(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0056(LKXMY0056);
		}

		if (LKXMY0057 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0057(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0057(LKXMY0057);
		}

		if (LKXMY0058 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0058(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0058(LKXMY0058);
		}

		if (LKXMY0059 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0059(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0059(LKXMY0059);
		}

		if (LKXMY0060 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0060(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0060(LKXMY0060);
		}

		if (LKXMY0061 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0061(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0061(LKXMY0061);
		}

		if (LKXMY0062 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0062(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0062(LKXMY0062);
		}

		if (LKXMY0063 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0063(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0063(LKXMY0063);
		}

		if (LKXMY0109 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0109(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0109(LKXMY0109);
		}

		if (LKXMY0110 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0110(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0110(LKXMY0110);
		}

		if (LKXMY0111 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0111(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0111(LKXMY0111);
		}

		if (LKXMY0112 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0112(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0112(LKXMY0112);
		}

		if (LKXMY0113 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0113(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0113(LKXMY0113);
		}

		if (LKXMY0114 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0114(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0114(LKXMY0114);
		}

		if (LKXMY0115 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0115(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0115(LKXMY0115);
		}

		if (LKXMY0116 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0116(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0116(LKXMY0116);
		}

		if (LKXMY0117 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0117(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0117(LKXMY0117);
		}

		if (LKXMY0118 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0118(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0118(LKXMY0118);
		}

		if (LKXMY0119 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0119(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0119(LKXMY0119);
		}

		if (LKXMY0120 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0120(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0120(LKXMY0120);
		}

		if (LKXMY0121 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0121(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0121(LKXMY0121);
		}

		if (LKXMY0122 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0122(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0122(LKXMY0122);
		}

		if (LKXMY0123 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0123(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0123(LKXMY0123);
		}

		if (LKXMY0124 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0124(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0124(LKXMY0124);
		}

		if (LKXMY0125 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0125(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0125(LKXMY0125);
		}

		if (LKXMY0126 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0126(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0126(LKXMY0126);
		}

		if (LKXMY0127 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0127(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0127(LKXMY0127);
		}

		if (LKXMY0128 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0128(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0128(LKXMY0128);
		}

		if (LKXMY0129 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0129(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0129(LKXMY0129);
		}

		if (LKXMY0130 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0130(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0130(LKXMY0130);
		}

		if (LKXMY0131 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0131(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0131(LKXMY0131);
		}

		if (LKXMY0064 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0064(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0064(LKXMY0064);
		}

		if (LKXMY0132 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0132(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0132(LKXMY0132);
		}

		if (LKXMY0133 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0133(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0133(LKXMY0133);
		}

		if (LKXMY0134 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0134(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0134(LKXMY0134);
		}

		if (LKXMY0135 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0135(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0135(LKXMY0135);
		}

		if (LKXMY0136 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0136(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0136(LKXMY0136);
		}

		if (LKXMY0137 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0137(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0137(LKXMY0137);
		}

		if (LKXMY0138 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0138(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0138(LKXMY0138);
		}

		if (LKXMY0139 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0139(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0139(LKXMY0139);
		}

		if (LKXMY0140 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0140(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0140(LKXMY0140);
		}

		if (LKXMY0066 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0066(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0066(LKXMY0066);
		}

		if (LKXMY0141 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0141(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0141(LKXMY0141);
		}

		if (LKXMY0142 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0142(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0142(LKXMY0142);
		}

		if (LKXMY0143 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0143(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0143(LKXMY0143);
		}

		if (LKXMY0144 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0144(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0144(LKXMY0144);
		}

		if (LKXMY0145 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0145(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0145(LKXMY0145);
		}

		if (LKXMY0146 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0146(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0146(LKXMY0146);
		}

		if (LKXMY0147 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0147(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0147(LKXMY0147);
		}

		if (LKXMY0148 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0148(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0148(LKXMY0148);
		}

		if (LKXMY0149 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0149(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0149(LKXMY0149);
		}

		if (LKXMY0150 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0150(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0150(LKXMY0150);
		}

		if (LKXMY0153 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0153(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0153(LKXMY0153);
		}

		if (LKXMY0154 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0154(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0154(LKXMY0154);
		}

		if (LKXMY0155 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0155(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0155(LKXMY0155);
		}

		if (LKXMY0156 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0156(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0156(LKXMY0156);
		}

		if (LKXMY0157 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0157(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0157(LKXMY0157);
		}

		if (LKXMY0158 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0158(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0158(LKXMY0158);
		}

		if (LKXMY0159 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0159(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0159(LKXMY0159);
		}

		if (LKXMY0160 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0160(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0160(LKXMY0160);
		}

		if (LKXMY0151 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0151(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0151(LKXMY0151);
		}

		if (LKXMY0161 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0161(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0161(LKXMY0161);
		}

		if (LKXMY0162 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0162(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0162(LKXMY0162);
		}

		if (LKXMY0163 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0163(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0163(LKXMY0163);
		}

		if (LKXMY0164 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0164(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0164(LKXMY0164);
		}

		if (LKXMY0165 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0165(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0165(LKXMY0165);
		}

		if (LKXMY0166 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0166(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0166(LKXMY0166);
		}

		if (LKXMY0167 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0167(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0167(LKXMY0167);
		}

		if (LKXMY0168 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0168(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0168(LKXMY0168);
		}

		if (LKXMY0169 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0169(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0169(LKXMY0169);
		}

		if (LKXMY0170 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0170(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0170(LKXMY0170);
		}

		if (LKXMY0171 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0171(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0171(LKXMY0171);
		}

		if (LKXMY0172 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0172(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0172(LKXMY0172);
		}

		if (LKXMY0173 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0173(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0173(LKXMY0173);
		}

		if (LKXMY0174 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0174(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0174(LKXMY0174);
		}

		if (LKXMY0175 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0175(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0175(LKXMY0175);
		}

		if (LKXMY0176 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0176(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0176(LKXMY0176);
		}

		if (LKXMY0177 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0177(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0177(LKXMY0177);
		}

		if (LKXMY0178 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0178(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0178(LKXMY0178);
		}

		if (LKXMY0179 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0179(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0179(LKXMY0179);
		}

		if (LKXMY0407 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0407(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0407(LKXMY0407);
		}

		if (LKXMY0408 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0408(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0408(LKXMY0408);
		}

		if (LKXMY0409 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0409(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0409(LKXMY0409);
		}

		if (LKXMY0410 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0410(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0410(LKXMY0410);
		}

		if (LKXMY0412 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0412(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0412(LKXMY0412);
		}

		if (LKXMY0413 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0413(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0413(LKXMY0413);
		}

		if (LKXMY0414 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0414(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0414(LKXMY0414);
		}

		if (LKXMY0415 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0415(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0415(LKXMY0415);
		}

		if (LKXMY0416 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0416(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0416(LKXMY0416);
		}

		if (LKXMY0417 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0417(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0417(LKXMY0417);
		}

		if (LKXMY0418 == null) {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0418(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setLKXMY0418(LKXMY0418);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_LKXMYImpl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_LKXMYImpl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_LKXMYImpl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_LKXMYImpl.resetOriginalValues();

		return vrTechnicalSpec_LKXMYImpl;
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
		XMY01001 = objectInput.readUTF();
		XMY01002 = objectInput.readUTF();
		XMY01003 = objectInput.readUTF();
		XMY01004 = objectInput.readUTF();
		XMY01005 = objectInput.readUTF();
		XMY01006 = objectInput.readUTF();
		XMY01007 = objectInput.readUTF();
		XMY01008 = objectInput.readUTF();
		XMY01009 = objectInput.readUTF();
		XMY01010 = objectInput.readUTF();
		XMY01011 = objectInput.readUTF();
		XMY01012 = objectInput.readUTF();
		XMY01013 = objectInput.readUTF();
		XMY01014 = objectInput.readUTF();
		XMY01016 = objectInput.readUTF();
		XMY01017 = objectInput.readUTF();
		XMY01019 = objectInput.readUTF();
		XMY01020 = objectInput.readUTF();
		XMY01021 = objectInput.readUTF();
		XMY01022 = objectInput.readUTF();
		XMY01030 = objectInput.readUTF();
		XMY01031 = objectInput.readUTF();
		XMY01032 = objectInput.readUTF();
		XMY01033 = objectInput.readUTF();
		XMY01034 = objectInput.readUTF();
		XMY01035 = objectInput.readUTF();
		XMY01036 = objectInput.readUTF();
		XMY01037 = objectInput.readUTF();
		XMY01038 = objectInput.readUTF();
		XMY01039 = objectInput.readUTF();
		XMY01040 = objectInput.readUTF();
		XMY01041 = objectInput.readUTF();
		XMY01042 = objectInput.readUTF();
		XMY01043 = objectInput.readUTF();
		XMY01044 = objectInput.readUTF();
		XMY01045 = objectInput.readUTF();
		XMY01046 = objectInput.readUTF();
		XMY01047 = objectInput.readUTF();
		XMY01050 = objectInput.readUTF();
		XMY01051 = objectInput.readUTF();
		XMY01052 = objectInput.readUTF();
		XMY01053 = objectInput.readUTF();
		XMY01054 = objectInput.readUTF();
		XMY01055 = objectInput.readUTF();
		XMY01056 = objectInput.readUTF();
		XMY01057 = objectInput.readUTF();
		XMY01058 = objectInput.readUTF();
		XMY01059 = objectInput.readUTF();
		XMY01060 = objectInput.readUTF();
		XMY01062 = objectInput.readUTF();
		XMY01063 = objectInput.readUTF();
		XMY01064 = objectInput.readUTF();
		XMY01065 = objectInput.readUTF();
		LKXMY01050 = objectInput.readUTF();
		LKXMY01051 = objectInput.readUTF();
		LKXMY01052 = objectInput.readUTF();
		LKXMY01053 = objectInput.readUTF();
		LKXMY01026 = objectInput.readUTF();
		LKXMY0401 = objectInput.readUTF();
		LKXMY0402 = objectInput.readUTF();
		LKXMY0403 = objectInput.readUTF();
		LKXMY0404 = objectInput.readUTF();
		LKXMY0405 = objectInput.readUTF();
		LKXMY0406 = objectInput.readUTF();
		LKXMY1307 = objectInput.readUTF();
		LKXMY1308 = objectInput.readUTF();
		LKXMY1309 = objectInput.readUTF();
		LKXMY1310 = objectInput.readUTF();
		LKXMY1311 = objectInput.readUTF();
		LKXMY1312 = objectInput.readUTF();
		LKXMY1207 = objectInput.readUTF();
		LKXMY1208 = objectInput.readUTF();
		LKXMY1209 = objectInput.readUTF();
		LKXMY1210 = objectInput.readUTF();
		LKXMY1211 = objectInput.readUTF();
		LKXMY0201 = objectInput.readUTF();
		LKXMY0202 = objectInput.readUTF();
		LKXMY0203 = objectInput.readUTF();
		LKXMY0204 = objectInput.readUTF();
		LKXMY0205 = objectInput.readUTF();
		LKXMY0206 = objectInput.readUTF();
		LKXMY0207 = objectInput.readUTF();
		LKXMY0208 = objectInput.readUTF();
		LKXMY0209 = objectInput.readUTF();
		LKXMY0210 = objectInput.readUTF();
		LKXMY0211 = objectInput.readUTF();
		LKXMY0212 = objectInput.readUTF();
		LKXMY0213 = objectInput.readUTF();
		LKXMY0214 = objectInput.readUTF();
		LKXMY0215 = objectInput.readUTF();
		LKXMY0216 = objectInput.readUTF();
		LKXMY0217 = objectInput.readUTF();
		LKXMY0218 = objectInput.readUTF();
		LKXMY0219 = objectInput.readUTF();
		LKXMY0040 = objectInput.readUTF();
		LKXMY0041 = objectInput.readUTF();
		LKXMY0042 = objectInput.readUTF();
		LKXMY0043 = objectInput.readUTF();
		LKXMY0044 = objectInput.readUTF();
		LKXMY0045 = objectInput.readUTF();
		LKXMY0046 = objectInput.readUTF();
		LKXMY0048 = objectInput.readUTF();
		LKXMY0049 = objectInput.readUTF();
		LKXMY0050 = objectInput.readUTF();
		LKXMY0051 = objectInput.readUTF();
		LKXMY0052 = objectInput.readUTF();
		LKXMY0054 = objectInput.readUTF();
		LKXMY0055 = objectInput.readUTF();
		LKXMY0056 = objectInput.readUTF();
		LKXMY0057 = objectInput.readUTF();
		LKXMY0058 = objectInput.readUTF();
		LKXMY0059 = objectInput.readUTF();
		LKXMY0060 = objectInput.readUTF();
		LKXMY0061 = objectInput.readUTF();
		LKXMY0062 = objectInput.readUTF();
		LKXMY0063 = objectInput.readUTF();
		LKXMY0109 = objectInput.readUTF();
		LKXMY0110 = objectInput.readUTF();
		LKXMY0111 = objectInput.readUTF();
		LKXMY0112 = objectInput.readUTF();
		LKXMY0113 = objectInput.readUTF();
		LKXMY0114 = objectInput.readUTF();
		LKXMY0115 = objectInput.readUTF();
		LKXMY0116 = objectInput.readUTF();
		LKXMY0117 = objectInput.readUTF();
		LKXMY0118 = objectInput.readUTF();
		LKXMY0119 = objectInput.readUTF();
		LKXMY0120 = objectInput.readUTF();
		LKXMY0121 = objectInput.readUTF();
		LKXMY0122 = objectInput.readUTF();
		LKXMY0123 = objectInput.readUTF();
		LKXMY0124 = objectInput.readUTF();
		LKXMY0125 = objectInput.readUTF();
		LKXMY0126 = objectInput.readUTF();
		LKXMY0127 = objectInput.readUTF();
		LKXMY0128 = objectInput.readUTF();
		LKXMY0129 = objectInput.readUTF();
		LKXMY0130 = objectInput.readUTF();
		LKXMY0131 = objectInput.readUTF();
		LKXMY0064 = objectInput.readUTF();
		LKXMY0132 = objectInput.readUTF();
		LKXMY0133 = objectInput.readUTF();
		LKXMY0134 = objectInput.readUTF();
		LKXMY0135 = objectInput.readUTF();
		LKXMY0136 = objectInput.readUTF();
		LKXMY0137 = objectInput.readUTF();
		LKXMY0138 = objectInput.readUTF();
		LKXMY0139 = objectInput.readUTF();
		LKXMY0140 = objectInput.readUTF();
		LKXMY0066 = objectInput.readUTF();
		LKXMY0141 = objectInput.readUTF();
		LKXMY0142 = objectInput.readUTF();
		LKXMY0143 = objectInput.readUTF();
		LKXMY0144 = objectInput.readUTF();
		LKXMY0145 = objectInput.readUTF();
		LKXMY0146 = objectInput.readUTF();
		LKXMY0147 = objectInput.readUTF();
		LKXMY0148 = objectInput.readUTF();
		LKXMY0149 = objectInput.readUTF();
		LKXMY0150 = objectInput.readUTF();
		LKXMY0153 = objectInput.readUTF();
		LKXMY0154 = objectInput.readUTF();
		LKXMY0155 = objectInput.readUTF();
		LKXMY0156 = objectInput.readUTF();
		LKXMY0157 = objectInput.readUTF();
		LKXMY0158 = objectInput.readUTF();
		LKXMY0159 = objectInput.readUTF();
		LKXMY0160 = objectInput.readUTF();
		LKXMY0151 = objectInput.readUTF();
		LKXMY0161 = objectInput.readUTF();
		LKXMY0162 = objectInput.readUTF();
		LKXMY0163 = objectInput.readUTF();
		LKXMY0164 = objectInput.readUTF();
		LKXMY0165 = objectInput.readUTF();
		LKXMY0166 = objectInput.readUTF();
		LKXMY0167 = objectInput.readUTF();
		LKXMY0168 = objectInput.readUTF();
		LKXMY0169 = objectInput.readUTF();
		LKXMY0170 = objectInput.readUTF();
		LKXMY0171 = objectInput.readUTF();
		LKXMY0172 = objectInput.readUTF();
		LKXMY0173 = objectInput.readUTF();
		LKXMY0174 = objectInput.readUTF();
		LKXMY0175 = objectInput.readUTF();
		LKXMY0176 = objectInput.readUTF();
		LKXMY0177 = objectInput.readUTF();
		LKXMY0178 = objectInput.readUTF();
		LKXMY0179 = objectInput.readUTF();
		LKXMY0407 = objectInput.readUTF();
		LKXMY0408 = objectInput.readUTF();
		LKXMY0409 = objectInput.readUTF();
		LKXMY0410 = objectInput.readUTF();
		LKXMY0412 = objectInput.readUTF();
		LKXMY0413 = objectInput.readUTF();
		LKXMY0414 = objectInput.readUTF();
		LKXMY0415 = objectInput.readUTF();
		LKXMY0416 = objectInput.readUTF();
		LKXMY0417 = objectInput.readUTF();
		LKXMY0418 = objectInput.readUTF();
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

		if (XMY01001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01001);
		}

		if (XMY01002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01002);
		}

		if (XMY01003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01003);
		}

		if (XMY01004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01004);
		}

		if (XMY01005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01005);
		}

		if (XMY01006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01006);
		}

		if (XMY01007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01007);
		}

		if (XMY01008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01008);
		}

		if (XMY01009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01009);
		}

		if (XMY01010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01010);
		}

		if (XMY01011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01011);
		}

		if (XMY01012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01012);
		}

		if (XMY01013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01013);
		}

		if (XMY01014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01014);
		}

		if (XMY01016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01016);
		}

		if (XMY01017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01017);
		}

		if (XMY01019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01019);
		}

		if (XMY01020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01020);
		}

		if (XMY01021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01021);
		}

		if (XMY01022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01022);
		}

		if (XMY01030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01030);
		}

		if (XMY01031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01031);
		}

		if (XMY01032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01032);
		}

		if (XMY01033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01033);
		}

		if (XMY01034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01034);
		}

		if (XMY01035 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01035);
		}

		if (XMY01036 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01036);
		}

		if (XMY01037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01037);
		}

		if (XMY01038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01038);
		}

		if (XMY01039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01039);
		}

		if (XMY01040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01040);
		}

		if (XMY01041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01041);
		}

		if (XMY01042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01042);
		}

		if (XMY01043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01043);
		}

		if (XMY01044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01044);
		}

		if (XMY01045 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01045);
		}

		if (XMY01046 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01046);
		}

		if (XMY01047 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01047);
		}

		if (XMY01050 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01050);
		}

		if (XMY01051 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01051);
		}

		if (XMY01052 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01052);
		}

		if (XMY01053 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01053);
		}

		if (XMY01054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01054);
		}

		if (XMY01055 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01055);
		}

		if (XMY01056 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01056);
		}

		if (XMY01057 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01057);
		}

		if (XMY01058 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01058);
		}

		if (XMY01059 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01059);
		}

		if (XMY01060 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01060);
		}

		if (XMY01062 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01062);
		}

		if (XMY01063 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01063);
		}

		if (XMY01064 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01064);
		}

		if (XMY01065 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01065);
		}

		if (LKXMY01050 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY01050);
		}

		if (LKXMY01051 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY01051);
		}

		if (LKXMY01052 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY01052);
		}

		if (LKXMY01053 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY01053);
		}

		if (LKXMY01026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY01026);
		}

		if (LKXMY0401 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0401);
		}

		if (LKXMY0402 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0402);
		}

		if (LKXMY0403 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0403);
		}

		if (LKXMY0404 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0404);
		}

		if (LKXMY0405 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0405);
		}

		if (LKXMY0406 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0406);
		}

		if (LKXMY1307 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1307);
		}

		if (LKXMY1308 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1308);
		}

		if (LKXMY1309 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1309);
		}

		if (LKXMY1310 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1310);
		}

		if (LKXMY1311 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1311);
		}

		if (LKXMY1312 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1312);
		}

		if (LKXMY1207 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1207);
		}

		if (LKXMY1208 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1208);
		}

		if (LKXMY1209 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1209);
		}

		if (LKXMY1210 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1210);
		}

		if (LKXMY1211 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1211);
		}

		if (LKXMY0201 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0201);
		}

		if (LKXMY0202 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0202);
		}

		if (LKXMY0203 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0203);
		}

		if (LKXMY0204 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0204);
		}

		if (LKXMY0205 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0205);
		}

		if (LKXMY0206 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0206);
		}

		if (LKXMY0207 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0207);
		}

		if (LKXMY0208 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0208);
		}

		if (LKXMY0209 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0209);
		}

		if (LKXMY0210 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0210);
		}

		if (LKXMY0211 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0211);
		}

		if (LKXMY0212 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0212);
		}

		if (LKXMY0213 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0213);
		}

		if (LKXMY0214 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0214);
		}

		if (LKXMY0215 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0215);
		}

		if (LKXMY0216 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0216);
		}

		if (LKXMY0217 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0217);
		}

		if (LKXMY0218 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0218);
		}

		if (LKXMY0219 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0219);
		}

		if (LKXMY0040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0040);
		}

		if (LKXMY0041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0041);
		}

		if (LKXMY0042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0042);
		}

		if (LKXMY0043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0043);
		}

		if (LKXMY0044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0044);
		}

		if (LKXMY0045 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0045);
		}

		if (LKXMY0046 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0046);
		}

		if (LKXMY0048 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0048);
		}

		if (LKXMY0049 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0049);
		}

		if (LKXMY0050 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0050);
		}

		if (LKXMY0051 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0051);
		}

		if (LKXMY0052 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0052);
		}

		if (LKXMY0054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0054);
		}

		if (LKXMY0055 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0055);
		}

		if (LKXMY0056 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0056);
		}

		if (LKXMY0057 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0057);
		}

		if (LKXMY0058 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0058);
		}

		if (LKXMY0059 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0059);
		}

		if (LKXMY0060 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0060);
		}

		if (LKXMY0061 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0061);
		}

		if (LKXMY0062 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0062);
		}

		if (LKXMY0063 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0063);
		}

		if (LKXMY0109 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0109);
		}

		if (LKXMY0110 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0110);
		}

		if (LKXMY0111 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0111);
		}

		if (LKXMY0112 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0112);
		}

		if (LKXMY0113 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0113);
		}

		if (LKXMY0114 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0114);
		}

		if (LKXMY0115 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0115);
		}

		if (LKXMY0116 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0116);
		}

		if (LKXMY0117 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0117);
		}

		if (LKXMY0118 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0118);
		}

		if (LKXMY0119 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0119);
		}

		if (LKXMY0120 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0120);
		}

		if (LKXMY0121 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0121);
		}

		if (LKXMY0122 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0122);
		}

		if (LKXMY0123 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0123);
		}

		if (LKXMY0124 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0124);
		}

		if (LKXMY0125 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0125);
		}

		if (LKXMY0126 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0126);
		}

		if (LKXMY0127 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0127);
		}

		if (LKXMY0128 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0128);
		}

		if (LKXMY0129 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0129);
		}

		if (LKXMY0130 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0130);
		}

		if (LKXMY0131 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0131);
		}

		if (LKXMY0064 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0064);
		}

		if (LKXMY0132 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0132);
		}

		if (LKXMY0133 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0133);
		}

		if (LKXMY0134 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0134);
		}

		if (LKXMY0135 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0135);
		}

		if (LKXMY0136 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0136);
		}

		if (LKXMY0137 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0137);
		}

		if (LKXMY0138 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0138);
		}

		if (LKXMY0139 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0139);
		}

		if (LKXMY0140 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0140);
		}

		if (LKXMY0066 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0066);
		}

		if (LKXMY0141 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0141);
		}

		if (LKXMY0142 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0142);
		}

		if (LKXMY0143 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0143);
		}

		if (LKXMY0144 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0144);
		}

		if (LKXMY0145 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0145);
		}

		if (LKXMY0146 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0146);
		}

		if (LKXMY0147 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0147);
		}

		if (LKXMY0148 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0148);
		}

		if (LKXMY0149 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0149);
		}

		if (LKXMY0150 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0150);
		}

		if (LKXMY0153 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0153);
		}

		if (LKXMY0154 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0154);
		}

		if (LKXMY0155 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0155);
		}

		if (LKXMY0156 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0156);
		}

		if (LKXMY0157 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0157);
		}

		if (LKXMY0158 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0158);
		}

		if (LKXMY0159 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0159);
		}

		if (LKXMY0160 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0160);
		}

		if (LKXMY0151 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0151);
		}

		if (LKXMY0161 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0161);
		}

		if (LKXMY0162 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0162);
		}

		if (LKXMY0163 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0163);
		}

		if (LKXMY0164 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0164);
		}

		if (LKXMY0165 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0165);
		}

		if (LKXMY0166 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0166);
		}

		if (LKXMY0167 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0167);
		}

		if (LKXMY0168 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0168);
		}

		if (LKXMY0169 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0169);
		}

		if (LKXMY0170 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0170);
		}

		if (LKXMY0171 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0171);
		}

		if (LKXMY0172 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0172);
		}

		if (LKXMY0173 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0173);
		}

		if (LKXMY0174 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0174);
		}

		if (LKXMY0175 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0175);
		}

		if (LKXMY0176 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0176);
		}

		if (LKXMY0177 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0177);
		}

		if (LKXMY0178 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0178);
		}

		if (LKXMY0179 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0179);
		}

		if (LKXMY0407 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0407);
		}

		if (LKXMY0408 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0408);
		}

		if (LKXMY0409 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0409);
		}

		if (LKXMY0410 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0410);
		}

		if (LKXMY0412 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0412);
		}

		if (LKXMY0413 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0413);
		}

		if (LKXMY0414 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0414);
		}

		if (LKXMY0415 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0415);
		}

		if (LKXMY0416 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0416);
		}

		if (LKXMY0417 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0417);
		}

		if (LKXMY0418 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0418);
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
	public String XMY01001;
	public String XMY01002;
	public String XMY01003;
	public String XMY01004;
	public String XMY01005;
	public String XMY01006;
	public String XMY01007;
	public String XMY01008;
	public String XMY01009;
	public String XMY01010;
	public String XMY01011;
	public String XMY01012;
	public String XMY01013;
	public String XMY01014;
	public String XMY01016;
	public String XMY01017;
	public String XMY01019;
	public String XMY01020;
	public String XMY01021;
	public String XMY01022;
	public String XMY01030;
	public String XMY01031;
	public String XMY01032;
	public String XMY01033;
	public String XMY01034;
	public String XMY01035;
	public String XMY01036;
	public String XMY01037;
	public String XMY01038;
	public String XMY01039;
	public String XMY01040;
	public String XMY01041;
	public String XMY01042;
	public String XMY01043;
	public String XMY01044;
	public String XMY01045;
	public String XMY01046;
	public String XMY01047;
	public String XMY01050;
	public String XMY01051;
	public String XMY01052;
	public String XMY01053;
	public String XMY01054;
	public String XMY01055;
	public String XMY01056;
	public String XMY01057;
	public String XMY01058;
	public String XMY01059;
	public String XMY01060;
	public String XMY01062;
	public String XMY01063;
	public String XMY01064;
	public String XMY01065;
	public String LKXMY01050;
	public String LKXMY01051;
	public String LKXMY01052;
	public String LKXMY01053;
	public String LKXMY01026;
	public String LKXMY0401;
	public String LKXMY0402;
	public String LKXMY0403;
	public String LKXMY0404;
	public String LKXMY0405;
	public String LKXMY0406;
	public String LKXMY1307;
	public String LKXMY1308;
	public String LKXMY1309;
	public String LKXMY1310;
	public String LKXMY1311;
	public String LKXMY1312;
	public String LKXMY1207;
	public String LKXMY1208;
	public String LKXMY1209;
	public String LKXMY1210;
	public String LKXMY1211;
	public String LKXMY0201;
	public String LKXMY0202;
	public String LKXMY0203;
	public String LKXMY0204;
	public String LKXMY0205;
	public String LKXMY0206;
	public String LKXMY0207;
	public String LKXMY0208;
	public String LKXMY0209;
	public String LKXMY0210;
	public String LKXMY0211;
	public String LKXMY0212;
	public String LKXMY0213;
	public String LKXMY0214;
	public String LKXMY0215;
	public String LKXMY0216;
	public String LKXMY0217;
	public String LKXMY0218;
	public String LKXMY0219;
	public String LKXMY0040;
	public String LKXMY0041;
	public String LKXMY0042;
	public String LKXMY0043;
	public String LKXMY0044;
	public String LKXMY0045;
	public String LKXMY0046;
	public String LKXMY0048;
	public String LKXMY0049;
	public String LKXMY0050;
	public String LKXMY0051;
	public String LKXMY0052;
	public String LKXMY0054;
	public String LKXMY0055;
	public String LKXMY0056;
	public String LKXMY0057;
	public String LKXMY0058;
	public String LKXMY0059;
	public String LKXMY0060;
	public String LKXMY0061;
	public String LKXMY0062;
	public String LKXMY0063;
	public String LKXMY0109;
	public String LKXMY0110;
	public String LKXMY0111;
	public String LKXMY0112;
	public String LKXMY0113;
	public String LKXMY0114;
	public String LKXMY0115;
	public String LKXMY0116;
	public String LKXMY0117;
	public String LKXMY0118;
	public String LKXMY0119;
	public String LKXMY0120;
	public String LKXMY0121;
	public String LKXMY0122;
	public String LKXMY0123;
	public String LKXMY0124;
	public String LKXMY0125;
	public String LKXMY0126;
	public String LKXMY0127;
	public String LKXMY0128;
	public String LKXMY0129;
	public String LKXMY0130;
	public String LKXMY0131;
	public String LKXMY0064;
	public String LKXMY0132;
	public String LKXMY0133;
	public String LKXMY0134;
	public String LKXMY0135;
	public String LKXMY0136;
	public String LKXMY0137;
	public String LKXMY0138;
	public String LKXMY0139;
	public String LKXMY0140;
	public String LKXMY0066;
	public String LKXMY0141;
	public String LKXMY0142;
	public String LKXMY0143;
	public String LKXMY0144;
	public String LKXMY0145;
	public String LKXMY0146;
	public String LKXMY0147;
	public String LKXMY0148;
	public String LKXMY0149;
	public String LKXMY0150;
	public String LKXMY0153;
	public String LKXMY0154;
	public String LKXMY0155;
	public String LKXMY0156;
	public String LKXMY0157;
	public String LKXMY0158;
	public String LKXMY0159;
	public String LKXMY0160;
	public String LKXMY0151;
	public String LKXMY0161;
	public String LKXMY0162;
	public String LKXMY0163;
	public String LKXMY0164;
	public String LKXMY0165;
	public String LKXMY0166;
	public String LKXMY0167;
	public String LKXMY0168;
	public String LKXMY0169;
	public String LKXMY0170;
	public String LKXMY0171;
	public String LKXMY0172;
	public String LKXMY0173;
	public String LKXMY0174;
	public String LKXMY0175;
	public String LKXMY0176;
	public String LKXMY0177;
	public String LKXMY0178;
	public String LKXMY0179;
	public String LKXMY0407;
	public String LKXMY0408;
	public String LKXMY0409;
	public String LKXMY0410;
	public String LKXMY0412;
	public String LKXMY0413;
	public String LKXMY0414;
	public String LKXMY0415;
	public String LKXMY0416;
	public String LKXMY0417;
	public String LKXMY0418;
	public long modifyDate;
	public long syncDate;
}