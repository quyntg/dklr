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

import com.fds.vr.business.model.VRTechnicalSpec_XMYPart3;

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
 * The cache model class for representing VRTechnicalSpec_XMYPart3 in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XMYPart3
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XMYPart3CacheModel implements CacheModel<VRTechnicalSpec_XMYPart3>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XMYPart3CacheModel)) {
			return false;
		}

		VRTechnicalSpec_XMYPart3CacheModel vrTechnicalSpec_XMYPart3CacheModel = (VRTechnicalSpec_XMYPart3CacheModel)obj;

		if (id == vrTechnicalSpec_XMYPart3CacheModel.id) {
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
		StringBundler sb = new StringBundler(329);

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
		sb.append(", XMY0149=");
		sb.append(XMY0149);
		sb.append(", XMY0150=");
		sb.append(XMY0150);
		sb.append(", XMY0151=");
		sb.append(XMY0151);
		sb.append(", XMY0152=");
		sb.append(XMY0152);
		sb.append(", XMY0153=");
		sb.append(XMY0153);
		sb.append(", XMY0154=");
		sb.append(XMY0154);
		sb.append(", XMY0155=");
		sb.append(XMY0155);
		sb.append(", XMY0156=");
		sb.append(XMY0156);
		sb.append(", XMY0157=");
		sb.append(XMY0157);
		sb.append(", XMY0158=");
		sb.append(XMY0158);
		sb.append(", XMY0159=");
		sb.append(XMY0159);
		sb.append(", XMY0160=");
		sb.append(XMY0160);
		sb.append(", XMY0161=");
		sb.append(XMY0161);
		sb.append(", XMY0162=");
		sb.append(XMY0162);
		sb.append(", XMY0163=");
		sb.append(XMY0163);
		sb.append(", XMY0164=");
		sb.append(XMY0164);
		sb.append(", XMY0165=");
		sb.append(XMY0165);
		sb.append(", XMY0166=");
		sb.append(XMY0166);
		sb.append(", XMY0167=");
		sb.append(XMY0167);
		sb.append(", XMY0168=");
		sb.append(XMY0168);
		sb.append(", XMY0169=");
		sb.append(XMY0169);
		sb.append(", XMY0170=");
		sb.append(XMY0170);
		sb.append(", XMY0171=");
		sb.append(XMY0171);
		sb.append(", XMY0172=");
		sb.append(XMY0172);
		sb.append(", XMY0173=");
		sb.append(XMY0173);
		sb.append(", XMY0174=");
		sb.append(XMY0174);
		sb.append(", XMY0175=");
		sb.append(XMY0175);
		sb.append(", XMY0176=");
		sb.append(XMY0176);
		sb.append(", XMY0177=");
		sb.append(XMY0177);
		sb.append(", XMY0178=");
		sb.append(XMY0178);
		sb.append(", XMY0179=");
		sb.append(XMY0179);
		sb.append(", XMY0180=");
		sb.append(XMY0180);
		sb.append(", XMY0181=");
		sb.append(XMY0181);
		sb.append(", XMY0182=");
		sb.append(XMY0182);
		sb.append(", XMY0183=");
		sb.append(XMY0183);
		sb.append(", XMY0184=");
		sb.append(XMY0184);
		sb.append(", XMY0185=");
		sb.append(XMY0185);
		sb.append(", XMY0186=");
		sb.append(XMY0186);
		sb.append(", XMY0187=");
		sb.append(XMY0187);
		sb.append(", XMY0188=");
		sb.append(XMY0188);
		sb.append(", XMY0189=");
		sb.append(XMY0189);
		sb.append(", XMY0190=");
		sb.append(XMY0190);
		sb.append(", XMY0191=");
		sb.append(XMY0191);
		sb.append(", XMY0192=");
		sb.append(XMY0192);
		sb.append(", XMY0193=");
		sb.append(XMY0193);
		sb.append(", XMY0194=");
		sb.append(XMY0194);
		sb.append(", XMY0195=");
		sb.append(XMY0195);
		sb.append(", XMY0196=");
		sb.append(XMY0196);
		sb.append(", XMY0197=");
		sb.append(XMY0197);
		sb.append(", XMY0198=");
		sb.append(XMY0198);
		sb.append(", XMY0199=");
		sb.append(XMY0199);
		sb.append(", XMY0200=");
		sb.append(XMY0200);
		sb.append(", XMY0201=");
		sb.append(XMY0201);
		sb.append(", XMY0202=");
		sb.append(XMY0202);
		sb.append(", XMY0203=");
		sb.append(XMY0203);
		sb.append(", XMY0204=");
		sb.append(XMY0204);
		sb.append(", XMY0205=");
		sb.append(XMY0205);
		sb.append(", XMY0207=");
		sb.append(XMY0207);
		sb.append(", XMY0208=");
		sb.append(XMY0208);
		sb.append(", XMY0209=");
		sb.append(XMY0209);
		sb.append(", XMY0210=");
		sb.append(XMY0210);
		sb.append(", XMY0211=");
		sb.append(XMY0211);
		sb.append(", XMY0212=");
		sb.append(XMY0212);
		sb.append(", XMY0213=");
		sb.append(XMY0213);
		sb.append(", XMY0214=");
		sb.append(XMY0214);
		sb.append(", XMY0215=");
		sb.append(XMY0215);
		sb.append(", XMY0216=");
		sb.append(XMY0216);
		sb.append(", XMY0217=");
		sb.append(XMY0217);
		sb.append(", XMY0218=");
		sb.append(XMY0218);
		sb.append(", XMY0219=");
		sb.append(XMY0219);
		sb.append(", XMY0220=");
		sb.append(XMY0220);
		sb.append(", XMY0221=");
		sb.append(XMY0221);
		sb.append(", XMY0222=");
		sb.append(XMY0222);
		sb.append(", XMY0223=");
		sb.append(XMY0223);
		sb.append(", XMY0224=");
		sb.append(XMY0224);
		sb.append(", XMY0225=");
		sb.append(XMY0225);
		sb.append(", XMY0226=");
		sb.append(XMY0226);
		sb.append(", XMY0227=");
		sb.append(XMY0227);
		sb.append(", XMY0228=");
		sb.append(XMY0228);
		sb.append(", XMY0229=");
		sb.append(XMY0229);
		sb.append(", XMY0230=");
		sb.append(XMY0230);
		sb.append(", XMY0231=");
		sb.append(XMY0231);
		sb.append(", XMY0232=");
		sb.append(XMY0232);
		sb.append(", XMY0233=");
		sb.append(XMY0233);
		sb.append(", XMY0234=");
		sb.append(XMY0234);
		sb.append(", XMY0235=");
		sb.append(XMY0235);
		sb.append(", XMY0236=");
		sb.append(XMY0236);
		sb.append(", XMY0237=");
		sb.append(XMY0237);
		sb.append(", XMY0238=");
		sb.append(XMY0238);
		sb.append(", XMY0239=");
		sb.append(XMY0239);
		sb.append(", XMY0240=");
		sb.append(XMY0240);
		sb.append(", XMY0241=");
		sb.append(XMY0241);
		sb.append(", XMY0242=");
		sb.append(XMY0242);
		sb.append(", XMY0243=");
		sb.append(XMY0243);
		sb.append(", XMY0244=");
		sb.append(XMY0244);
		sb.append(", XMY0245=");
		sb.append(XMY0245);
		sb.append(", XMY0246=");
		sb.append(XMY0246);
		sb.append(", XMY0247=");
		sb.append(XMY0247);
		sb.append(", XMY0248=");
		sb.append(XMY0248);
		sb.append(", XMY0249=");
		sb.append(XMY0249);
		sb.append(", XMY0250=");
		sb.append(XMY0250);
		sb.append(", XMY0251=");
		sb.append(XMY0251);
		sb.append(", XMY0252=");
		sb.append(XMY0252);
		sb.append(", XMY0253=");
		sb.append(XMY0253);
		sb.append(", XMY0254=");
		sb.append(XMY0254);
		sb.append(", XMY0255=");
		sb.append(XMY0255);
		sb.append(", XMY0256=");
		sb.append(XMY0256);
		sb.append(", XMY0257=");
		sb.append(XMY0257);
		sb.append(", XMY0258=");
		sb.append(XMY0258);
		sb.append(", XMY0259=");
		sb.append(XMY0259);
		sb.append(", XMY0260=");
		sb.append(XMY0260);
		sb.append(", XMY0261=");
		sb.append(XMY0261);
		sb.append(", XMY0262=");
		sb.append(XMY0262);
		sb.append(", XMY0263=");
		sb.append(XMY0263);
		sb.append(", XMY0264=");
		sb.append(XMY0264);
		sb.append(", BBCNCLKLXMY001=");
		sb.append(BBCNCLKLXMY001);
		sb.append(", BBCNCLKLXMY002=");
		sb.append(BBCNCLKLXMY002);
		sb.append(", BBCNCLKLXMY003=");
		sb.append(BBCNCLKLXMY003);
		sb.append(", BBCNCLKLXMY004=");
		sb.append(BBCNCLKLXMY004);
		sb.append(", BBCNCLKLXMY005=");
		sb.append(BBCNCLKLXMY005);
		sb.append(", BBCNCLKLXMY006=");
		sb.append(BBCNCLKLXMY006);
		sb.append(", BBCNCLKLXMY012=");
		sb.append(BBCNCLKLXMY012);
		sb.append(", BBCNCLKLXMY013=");
		sb.append(BBCNCLKLXMY013);
		sb.append(", BBCNCLKLXMY014=");
		sb.append(BBCNCLKLXMY014);
		sb.append(", BBCNCLKLXMY015=");
		sb.append(BBCNCLKLXMY015);
		sb.append(", BBCNCLKLXMY016=");
		sb.append(BBCNCLKLXMY016);
		sb.append(", BBCNCLKLXMY017=");
		sb.append(BBCNCLKLXMY017);
		sb.append(", BBCNCLKLXMY018=");
		sb.append(BBCNCLKLXMY018);
		sb.append(", BBCNCLKLXMY019=");
		sb.append(BBCNCLKLXMY019);
		sb.append(", BBCNCLKLXMY020=");
		sb.append(BBCNCLKLXMY020);
		sb.append(", BBCNCLKLXMY021=");
		sb.append(BBCNCLKLXMY021);
		sb.append(", BBCNCLKLXMY022=");
		sb.append(BBCNCLKLXMY022);
		sb.append(", BBCNCLKLXMY024=");
		sb.append(BBCNCLKLXMY024);
		sb.append(", BBCNCLKLXMY026=");
		sb.append(BBCNCLKLXMY026);
		sb.append(", BBCNCLKLXMY027=");
		sb.append(BBCNCLKLXMY027);
		sb.append(", BBCNCLKLXMY028=");
		sb.append(BBCNCLKLXMY028);
		sb.append(", BBCNCLKLXMY029=");
		sb.append(BBCNCLKLXMY029);
		sb.append(", BBCNCLKLXMY033=");
		sb.append(BBCNCLKLXMY033);
		sb.append(", BBCNCLKLXMY034=");
		sb.append(BBCNCLKLXMY034);
		sb.append(", BBCNCLKLXMY037=");
		sb.append(BBCNCLKLXMY037);
		sb.append(", BBCNCLKLXMY038=");
		sb.append(BBCNCLKLXMY038);
		sb.append(", BBCNCLKLXMY039=");
		sb.append(BBCNCLKLXMY039);
		sb.append(", BBCNCLKLXMY040=");
		sb.append(BBCNCLKLXMY040);
		sb.append(", BBCNCLKLXMY041=");
		sb.append(BBCNCLKLXMY041);
		sb.append(", BBCNCLKLXMY042=");
		sb.append(BBCNCLKLXMY042);
		sb.append(", BBCNCLKLXMY043=");
		sb.append(BBCNCLKLXMY043);
		sb.append(", BBCNCLKLXMY044=");
		sb.append(BBCNCLKLXMY044);
		sb.append(", BBCNCLKLXMY045=");
		sb.append(BBCNCLKLXMY045);
		sb.append(", BBCNCLKLXDD030=");
		sb.append(BBCNCLKLXDD030);
		sb.append(", BBCNCLKLXMY046=");
		sb.append(BBCNCLKLXMY046);
		sb.append(", BBCNCLKLXMY047=");
		sb.append(BBCNCLKLXMY047);
		sb.append(", BBCNCLKLXMY053=");
		sb.append(BBCNCLKLXMY053);
		sb.append(", BBCNCLKLXMY054=");
		sb.append(BBCNCLKLXMY054);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XMYPart3 toEntityModel() {
		VRTechnicalSpec_XMYPart3Impl vrTechnicalSpec_XMYPart3Impl = new VRTechnicalSpec_XMYPart3Impl();

		vrTechnicalSpec_XMYPart3Impl.setId(id);
		vrTechnicalSpec_XMYPart3Impl.setMtCore(mtCore);
		vrTechnicalSpec_XMYPart3Impl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XMYPart3Impl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XMYPart3Impl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XMYPart3Impl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XMYPart3Impl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XMYPart3Impl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XMYPart3Impl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XMY0149 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0149(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0149(XMY0149);
		}

		if (XMY0150 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0150(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0150(XMY0150);
		}

		if (XMY0151 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0151(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0151(XMY0151);
		}

		if (XMY0152 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0152(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0152(XMY0152);
		}

		if (XMY0153 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0153(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0153(XMY0153);
		}

		if (XMY0154 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0154(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0154(XMY0154);
		}

		if (XMY0155 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0155(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0155(XMY0155);
		}

		if (XMY0156 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0156(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0156(XMY0156);
		}

		if (XMY0157 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0157(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0157(XMY0157);
		}

		if (XMY0158 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0158(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0158(XMY0158);
		}

		if (XMY0159 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0159(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0159(XMY0159);
		}

		if (XMY0160 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0160(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0160(XMY0160);
		}

		if (XMY0161 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0161(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0161(XMY0161);
		}

		if (XMY0162 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0162(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0162(XMY0162);
		}

		if (XMY0163 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0163(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0163(XMY0163);
		}

		if (XMY0164 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0164(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0164(XMY0164);
		}

		if (XMY0165 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0165(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0165(XMY0165);
		}

		if (XMY0166 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0166(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0166(XMY0166);
		}

		if (XMY0167 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0167(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0167(XMY0167);
		}

		if (XMY0168 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0168(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0168(XMY0168);
		}

		if (XMY0169 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0169(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0169(XMY0169);
		}

		if (XMY0170 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0170(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0170(XMY0170);
		}

		if (XMY0171 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0171(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0171(XMY0171);
		}

		if (XMY0172 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0172(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0172(XMY0172);
		}

		if (XMY0173 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0173(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0173(XMY0173);
		}

		if (XMY0174 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0174(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0174(XMY0174);
		}

		if (XMY0175 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0175(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0175(XMY0175);
		}

		if (XMY0176 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0176(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0176(XMY0176);
		}

		if (XMY0177 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0177(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0177(XMY0177);
		}

		if (XMY0178 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0178(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0178(XMY0178);
		}

		if (XMY0179 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0179(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0179(XMY0179);
		}

		if (XMY0180 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0180(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0180(XMY0180);
		}

		if (XMY0181 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0181(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0181(XMY0181);
		}

		if (XMY0182 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0182(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0182(XMY0182);
		}

		if (XMY0183 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0183(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0183(XMY0183);
		}

		if (XMY0184 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0184(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0184(XMY0184);
		}

		if (XMY0185 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0185(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0185(XMY0185);
		}

		if (XMY0186 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0186(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0186(XMY0186);
		}

		if (XMY0187 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0187(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0187(XMY0187);
		}

		if (XMY0188 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0188(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0188(XMY0188);
		}

		if (XMY0189 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0189(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0189(XMY0189);
		}

		if (XMY0190 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0190(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0190(XMY0190);
		}

		if (XMY0191 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0191(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0191(XMY0191);
		}

		if (XMY0192 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0192(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0192(XMY0192);
		}

		if (XMY0193 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0193(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0193(XMY0193);
		}

		if (XMY0194 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0194(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0194(XMY0194);
		}

		if (XMY0195 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0195(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0195(XMY0195);
		}

		if (XMY0196 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0196(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0196(XMY0196);
		}

		if (XMY0197 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0197(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0197(XMY0197);
		}

		if (XMY0198 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0198(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0198(XMY0198);
		}

		if (XMY0199 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0199(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0199(XMY0199);
		}

		if (XMY0200 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0200(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0200(XMY0200);
		}

		if (XMY0201 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0201(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0201(XMY0201);
		}

		if (XMY0202 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0202(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0202(XMY0202);
		}

		if (XMY0203 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0203(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0203(XMY0203);
		}

		if (XMY0204 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0204(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0204(XMY0204);
		}

		if (XMY0205 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0205(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0205(XMY0205);
		}

		if (XMY0207 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0207(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0207(XMY0207);
		}

		if (XMY0208 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0208(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0208(XMY0208);
		}

		if (XMY0209 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0209(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0209(XMY0209);
		}

		if (XMY0210 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0210(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0210(XMY0210);
		}

		if (XMY0211 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0211(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0211(XMY0211);
		}

		if (XMY0212 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0212(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0212(XMY0212);
		}

		if (XMY0213 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0213(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0213(XMY0213);
		}

		if (XMY0214 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0214(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0214(XMY0214);
		}

		if (XMY0215 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0215(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0215(XMY0215);
		}

		if (XMY0216 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0216(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0216(XMY0216);
		}

		if (XMY0217 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0217(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0217(XMY0217);
		}

		if (XMY0218 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0218(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0218(XMY0218);
		}

		if (XMY0219 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0219(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0219(XMY0219);
		}

		if (XMY0220 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0220(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0220(XMY0220);
		}

		if (XMY0221 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0221(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0221(XMY0221);
		}

		if (XMY0222 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0222(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0222(XMY0222);
		}

		if (XMY0223 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0223(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0223(XMY0223);
		}

		if (XMY0224 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0224(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0224(XMY0224);
		}

		if (XMY0225 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0225(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0225(XMY0225);
		}

		if (XMY0226 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0226(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0226(XMY0226);
		}

		if (XMY0227 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0227(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0227(XMY0227);
		}

		if (XMY0228 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0228(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0228(XMY0228);
		}

		if (XMY0229 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0229(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0229(XMY0229);
		}

		if (XMY0230 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0230(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0230(XMY0230);
		}

		if (XMY0231 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0231(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0231(XMY0231);
		}

		if (XMY0232 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0232(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0232(XMY0232);
		}

		if (XMY0233 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0233(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0233(XMY0233);
		}

		if (XMY0234 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0234(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0234(XMY0234);
		}

		if (XMY0235 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0235(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0235(XMY0235);
		}

		if (XMY0236 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0236(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0236(XMY0236);
		}

		if (XMY0237 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0237(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0237(XMY0237);
		}

		if (XMY0238 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0238(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0238(XMY0238);
		}

		if (XMY0239 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0239(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0239(XMY0239);
		}

		if (XMY0240 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0240(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0240(XMY0240);
		}

		if (XMY0241 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0241(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0241(XMY0241);
		}

		if (XMY0242 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0242(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0242(XMY0242);
		}

		if (XMY0243 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0243(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0243(XMY0243);
		}

		if (XMY0244 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0244(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0244(XMY0244);
		}

		if (XMY0245 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0245(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0245(XMY0245);
		}

		if (XMY0246 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0246(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0246(XMY0246);
		}

		if (XMY0247 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0247(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0247(XMY0247);
		}

		if (XMY0248 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0248(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0248(XMY0248);
		}

		if (XMY0249 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0249(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0249(XMY0249);
		}

		if (XMY0250 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0250(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0250(XMY0250);
		}

		if (XMY0251 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0251(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0251(XMY0251);
		}

		if (XMY0252 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0252(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0252(XMY0252);
		}

		if (XMY0253 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0253(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0253(XMY0253);
		}

		if (XMY0254 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0254(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0254(XMY0254);
		}

		if (XMY0255 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0255(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0255(XMY0255);
		}

		if (XMY0256 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0256(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0256(XMY0256);
		}

		if (XMY0257 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0257(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0257(XMY0257);
		}

		if (XMY0258 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0258(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0258(XMY0258);
		}

		if (XMY0259 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0259(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0259(XMY0259);
		}

		if (XMY0260 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0260(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0260(XMY0260);
		}

		if (XMY0261 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0261(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0261(XMY0261);
		}

		if (XMY0262 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0262(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0262(XMY0262);
		}

		if (XMY0263 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0263(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0263(XMY0263);
		}

		if (XMY0264 == null) {
			vrTechnicalSpec_XMYPart3Impl.setXMY0264(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setXMY0264(XMY0264);
		}

		if (BBCNCLKLXMY001 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY001(BBCNCLKLXMY001);
		}

		if (BBCNCLKLXMY002 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY002(BBCNCLKLXMY002);
		}

		if (BBCNCLKLXMY003 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY003(BBCNCLKLXMY003);
		}

		if (BBCNCLKLXMY004 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY004(BBCNCLKLXMY004);
		}

		if (BBCNCLKLXMY005 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY005(BBCNCLKLXMY005);
		}

		if (BBCNCLKLXMY006 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY006(BBCNCLKLXMY006);
		}

		if (BBCNCLKLXMY012 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY012(BBCNCLKLXMY012);
		}

		if (BBCNCLKLXMY013 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY013(BBCNCLKLXMY013);
		}

		if (BBCNCLKLXMY014 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY014(BBCNCLKLXMY014);
		}

		if (BBCNCLKLXMY015 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY015(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY015(BBCNCLKLXMY015);
		}

		if (BBCNCLKLXMY016 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY016(BBCNCLKLXMY016);
		}

		if (BBCNCLKLXMY017 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY017(BBCNCLKLXMY017);
		}

		if (BBCNCLKLXMY018 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY018(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY018(BBCNCLKLXMY018);
		}

		if (BBCNCLKLXMY019 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY019(BBCNCLKLXMY019);
		}

		if (BBCNCLKLXMY020 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY020(BBCNCLKLXMY020);
		}

		if (BBCNCLKLXMY021 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY021(BBCNCLKLXMY021);
		}

		if (BBCNCLKLXMY022 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY022(BBCNCLKLXMY022);
		}

		if (BBCNCLKLXMY024 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY024(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY024(BBCNCLKLXMY024);
		}

		if (BBCNCLKLXMY026 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY026(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY026(BBCNCLKLXMY026);
		}

		if (BBCNCLKLXMY027 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY027(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY027(BBCNCLKLXMY027);
		}

		if (BBCNCLKLXMY028 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY028(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY028(BBCNCLKLXMY028);
		}

		if (BBCNCLKLXMY029 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY029(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY029(BBCNCLKLXMY029);
		}

		if (BBCNCLKLXMY033 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY033(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY033(BBCNCLKLXMY033);
		}

		if (BBCNCLKLXMY034 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY034(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY034(BBCNCLKLXMY034);
		}

		if (BBCNCLKLXMY037 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY037(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY037(BBCNCLKLXMY037);
		}

		if (BBCNCLKLXMY038 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY038(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY038(BBCNCLKLXMY038);
		}

		if (BBCNCLKLXMY039 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY039(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY039(BBCNCLKLXMY039);
		}

		if (BBCNCLKLXMY040 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY040(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY040(BBCNCLKLXMY040);
		}

		if (BBCNCLKLXMY041 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY041(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY041(BBCNCLKLXMY041);
		}

		if (BBCNCLKLXMY042 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY042(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY042(BBCNCLKLXMY042);
		}

		if (BBCNCLKLXMY043 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY043(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY043(BBCNCLKLXMY043);
		}

		if (BBCNCLKLXMY044 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY044(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY044(BBCNCLKLXMY044);
		}

		if (BBCNCLKLXMY045 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY045(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY045(BBCNCLKLXMY045);
		}

		if (BBCNCLKLXDD030 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXDD030(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXDD030(BBCNCLKLXDD030);
		}

		if (BBCNCLKLXMY046 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY046(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY046(BBCNCLKLXMY046);
		}

		if (BBCNCLKLXMY047 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY047(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY047(BBCNCLKLXMY047);
		}

		if (BBCNCLKLXMY053 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY053(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY053(BBCNCLKLXMY053);
		}

		if (BBCNCLKLXMY054 == null) {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY054(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY054(BBCNCLKLXMY054);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XMYPart3Impl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XMYPart3Impl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XMYPart3Impl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XMYPart3Impl.resetOriginalValues();

		return vrTechnicalSpec_XMYPart3Impl;
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
		XMY0149 = objectInput.readUTF();
		XMY0150 = objectInput.readUTF();
		XMY0151 = objectInput.readUTF();
		XMY0152 = objectInput.readUTF();
		XMY0153 = objectInput.readUTF();
		XMY0154 = objectInput.readUTF();
		XMY0155 = objectInput.readUTF();
		XMY0156 = objectInput.readUTF();
		XMY0157 = objectInput.readUTF();
		XMY0158 = objectInput.readUTF();
		XMY0159 = objectInput.readUTF();
		XMY0160 = objectInput.readUTF();
		XMY0161 = objectInput.readUTF();
		XMY0162 = objectInput.readUTF();
		XMY0163 = objectInput.readUTF();
		XMY0164 = objectInput.readUTF();
		XMY0165 = objectInput.readUTF();
		XMY0166 = objectInput.readUTF();
		XMY0167 = objectInput.readUTF();
		XMY0168 = objectInput.readUTF();
		XMY0169 = objectInput.readUTF();
		XMY0170 = objectInput.readUTF();
		XMY0171 = objectInput.readUTF();
		XMY0172 = objectInput.readUTF();
		XMY0173 = objectInput.readUTF();
		XMY0174 = objectInput.readUTF();
		XMY0175 = objectInput.readUTF();
		XMY0176 = objectInput.readUTF();
		XMY0177 = objectInput.readUTF();
		XMY0178 = objectInput.readUTF();
		XMY0179 = objectInput.readUTF();
		XMY0180 = objectInput.readUTF();
		XMY0181 = objectInput.readUTF();
		XMY0182 = objectInput.readUTF();
		XMY0183 = objectInput.readUTF();
		XMY0184 = objectInput.readUTF();
		XMY0185 = objectInput.readUTF();
		XMY0186 = objectInput.readUTF();
		XMY0187 = objectInput.readUTF();
		XMY0188 = objectInput.readUTF();
		XMY0189 = objectInput.readUTF();
		XMY0190 = objectInput.readUTF();
		XMY0191 = objectInput.readUTF();
		XMY0192 = objectInput.readUTF();
		XMY0193 = objectInput.readUTF();
		XMY0194 = objectInput.readUTF();
		XMY0195 = objectInput.readUTF();
		XMY0196 = objectInput.readUTF();
		XMY0197 = objectInput.readUTF();
		XMY0198 = objectInput.readUTF();
		XMY0199 = objectInput.readUTF();
		XMY0200 = objectInput.readUTF();
		XMY0201 = objectInput.readUTF();
		XMY0202 = objectInput.readUTF();
		XMY0203 = objectInput.readUTF();
		XMY0204 = objectInput.readUTF();
		XMY0205 = objectInput.readUTF();
		XMY0207 = objectInput.readUTF();
		XMY0208 = objectInput.readUTF();
		XMY0209 = objectInput.readUTF();
		XMY0210 = objectInput.readUTF();
		XMY0211 = objectInput.readUTF();
		XMY0212 = objectInput.readUTF();
		XMY0213 = objectInput.readUTF();
		XMY0214 = objectInput.readUTF();
		XMY0215 = objectInput.readUTF();
		XMY0216 = objectInput.readUTF();
		XMY0217 = objectInput.readUTF();
		XMY0218 = objectInput.readUTF();
		XMY0219 = objectInput.readUTF();
		XMY0220 = objectInput.readUTF();
		XMY0221 = objectInput.readUTF();
		XMY0222 = objectInput.readUTF();
		XMY0223 = objectInput.readUTF();
		XMY0224 = objectInput.readUTF();
		XMY0225 = objectInput.readUTF();
		XMY0226 = objectInput.readUTF();
		XMY0227 = objectInput.readUTF();
		XMY0228 = objectInput.readUTF();
		XMY0229 = objectInput.readUTF();
		XMY0230 = objectInput.readUTF();
		XMY0231 = objectInput.readUTF();
		XMY0232 = objectInput.readUTF();
		XMY0233 = objectInput.readUTF();
		XMY0234 = objectInput.readUTF();
		XMY0235 = objectInput.readUTF();
		XMY0236 = objectInput.readUTF();
		XMY0237 = objectInput.readUTF();
		XMY0238 = objectInput.readUTF();
		XMY0239 = objectInput.readUTF();
		XMY0240 = objectInput.readUTF();
		XMY0241 = objectInput.readUTF();
		XMY0242 = objectInput.readUTF();
		XMY0243 = objectInput.readUTF();
		XMY0244 = objectInput.readUTF();
		XMY0245 = objectInput.readUTF();
		XMY0246 = objectInput.readUTF();
		XMY0247 = objectInput.readUTF();
		XMY0248 = objectInput.readUTF();
		XMY0249 = objectInput.readUTF();
		XMY0250 = objectInput.readUTF();
		XMY0251 = objectInput.readUTF();
		XMY0252 = objectInput.readUTF();
		XMY0253 = objectInput.readUTF();
		XMY0254 = objectInput.readUTF();
		XMY0255 = objectInput.readUTF();
		XMY0256 = objectInput.readUTF();
		XMY0257 = objectInput.readUTF();
		XMY0258 = objectInput.readUTF();
		XMY0259 = objectInput.readUTF();
		XMY0260 = objectInput.readUTF();
		XMY0261 = objectInput.readUTF();
		XMY0262 = objectInput.readUTF();
		XMY0263 = objectInput.readUTF();
		XMY0264 = objectInput.readUTF();
		BBCNCLKLXMY001 = objectInput.readUTF();
		BBCNCLKLXMY002 = objectInput.readUTF();
		BBCNCLKLXMY003 = objectInput.readUTF();
		BBCNCLKLXMY004 = objectInput.readUTF();
		BBCNCLKLXMY005 = objectInput.readUTF();
		BBCNCLKLXMY006 = objectInput.readUTF();
		BBCNCLKLXMY012 = objectInput.readUTF();
		BBCNCLKLXMY013 = objectInput.readUTF();
		BBCNCLKLXMY014 = objectInput.readUTF();
		BBCNCLKLXMY015 = objectInput.readUTF();
		BBCNCLKLXMY016 = objectInput.readUTF();
		BBCNCLKLXMY017 = objectInput.readUTF();
		BBCNCLKLXMY018 = objectInput.readUTF();
		BBCNCLKLXMY019 = objectInput.readUTF();
		BBCNCLKLXMY020 = objectInput.readUTF();
		BBCNCLKLXMY021 = objectInput.readUTF();
		BBCNCLKLXMY022 = objectInput.readUTF();
		BBCNCLKLXMY024 = objectInput.readUTF();
		BBCNCLKLXMY026 = objectInput.readUTF();
		BBCNCLKLXMY027 = objectInput.readUTF();
		BBCNCLKLXMY028 = objectInput.readUTF();
		BBCNCLKLXMY029 = objectInput.readUTF();
		BBCNCLKLXMY033 = objectInput.readUTF();
		BBCNCLKLXMY034 = objectInput.readUTF();
		BBCNCLKLXMY037 = objectInput.readUTF();
		BBCNCLKLXMY038 = objectInput.readUTF();
		BBCNCLKLXMY039 = objectInput.readUTF();
		BBCNCLKLXMY040 = objectInput.readUTF();
		BBCNCLKLXMY041 = objectInput.readUTF();
		BBCNCLKLXMY042 = objectInput.readUTF();
		BBCNCLKLXMY043 = objectInput.readUTF();
		BBCNCLKLXMY044 = objectInput.readUTF();
		BBCNCLKLXMY045 = objectInput.readUTF();
		BBCNCLKLXDD030 = objectInput.readUTF();
		BBCNCLKLXMY046 = objectInput.readUTF();
		BBCNCLKLXMY047 = objectInput.readUTF();
		BBCNCLKLXMY053 = objectInput.readUTF();
		BBCNCLKLXMY054 = objectInput.readUTF();
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

		if (XMY0149 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0149);
		}

		if (XMY0150 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0150);
		}

		if (XMY0151 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0151);
		}

		if (XMY0152 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0152);
		}

		if (XMY0153 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0153);
		}

		if (XMY0154 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0154);
		}

		if (XMY0155 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0155);
		}

		if (XMY0156 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0156);
		}

		if (XMY0157 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0157);
		}

		if (XMY0158 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0158);
		}

		if (XMY0159 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0159);
		}

		if (XMY0160 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0160);
		}

		if (XMY0161 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0161);
		}

		if (XMY0162 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0162);
		}

		if (XMY0163 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0163);
		}

		if (XMY0164 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0164);
		}

		if (XMY0165 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0165);
		}

		if (XMY0166 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0166);
		}

		if (XMY0167 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0167);
		}

		if (XMY0168 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0168);
		}

		if (XMY0169 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0169);
		}

		if (XMY0170 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0170);
		}

		if (XMY0171 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0171);
		}

		if (XMY0172 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0172);
		}

		if (XMY0173 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0173);
		}

		if (XMY0174 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0174);
		}

		if (XMY0175 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0175);
		}

		if (XMY0176 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0176);
		}

		if (XMY0177 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0177);
		}

		if (XMY0178 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0178);
		}

		if (XMY0179 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0179);
		}

		if (XMY0180 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0180);
		}

		if (XMY0181 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0181);
		}

		if (XMY0182 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0182);
		}

		if (XMY0183 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0183);
		}

		if (XMY0184 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0184);
		}

		if (XMY0185 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0185);
		}

		if (XMY0186 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0186);
		}

		if (XMY0187 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0187);
		}

		if (XMY0188 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0188);
		}

		if (XMY0189 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0189);
		}

		if (XMY0190 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0190);
		}

		if (XMY0191 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0191);
		}

		if (XMY0192 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0192);
		}

		if (XMY0193 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0193);
		}

		if (XMY0194 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0194);
		}

		if (XMY0195 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0195);
		}

		if (XMY0196 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0196);
		}

		if (XMY0197 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0197);
		}

		if (XMY0198 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0198);
		}

		if (XMY0199 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0199);
		}

		if (XMY0200 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0200);
		}

		if (XMY0201 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0201);
		}

		if (XMY0202 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0202);
		}

		if (XMY0203 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0203);
		}

		if (XMY0204 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0204);
		}

		if (XMY0205 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0205);
		}

		if (XMY0207 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0207);
		}

		if (XMY0208 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0208);
		}

		if (XMY0209 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0209);
		}

		if (XMY0210 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0210);
		}

		if (XMY0211 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0211);
		}

		if (XMY0212 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0212);
		}

		if (XMY0213 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0213);
		}

		if (XMY0214 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0214);
		}

		if (XMY0215 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0215);
		}

		if (XMY0216 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0216);
		}

		if (XMY0217 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0217);
		}

		if (XMY0218 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0218);
		}

		if (XMY0219 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0219);
		}

		if (XMY0220 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0220);
		}

		if (XMY0221 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0221);
		}

		if (XMY0222 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0222);
		}

		if (XMY0223 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0223);
		}

		if (XMY0224 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0224);
		}

		if (XMY0225 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0225);
		}

		if (XMY0226 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0226);
		}

		if (XMY0227 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0227);
		}

		if (XMY0228 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0228);
		}

		if (XMY0229 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0229);
		}

		if (XMY0230 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0230);
		}

		if (XMY0231 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0231);
		}

		if (XMY0232 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0232);
		}

		if (XMY0233 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0233);
		}

		if (XMY0234 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0234);
		}

		if (XMY0235 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0235);
		}

		if (XMY0236 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0236);
		}

		if (XMY0237 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0237);
		}

		if (XMY0238 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0238);
		}

		if (XMY0239 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0239);
		}

		if (XMY0240 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0240);
		}

		if (XMY0241 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0241);
		}

		if (XMY0242 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0242);
		}

		if (XMY0243 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0243);
		}

		if (XMY0244 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0244);
		}

		if (XMY0245 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0245);
		}

		if (XMY0246 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0246);
		}

		if (XMY0247 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0247);
		}

		if (XMY0248 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0248);
		}

		if (XMY0249 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0249);
		}

		if (XMY0250 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0250);
		}

		if (XMY0251 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0251);
		}

		if (XMY0252 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0252);
		}

		if (XMY0253 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0253);
		}

		if (XMY0254 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0254);
		}

		if (XMY0255 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0255);
		}

		if (XMY0256 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0256);
		}

		if (XMY0257 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0257);
		}

		if (XMY0258 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0258);
		}

		if (XMY0259 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0259);
		}

		if (XMY0260 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0260);
		}

		if (XMY0261 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0261);
		}

		if (XMY0262 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0262);
		}

		if (XMY0263 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0263);
		}

		if (XMY0264 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0264);
		}

		if (BBCNCLKLXMY001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY001);
		}

		if (BBCNCLKLXMY002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY002);
		}

		if (BBCNCLKLXMY003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY003);
		}

		if (BBCNCLKLXMY004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY004);
		}

		if (BBCNCLKLXMY005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY005);
		}

		if (BBCNCLKLXMY006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY006);
		}

		if (BBCNCLKLXMY012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY012);
		}

		if (BBCNCLKLXMY013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY013);
		}

		if (BBCNCLKLXMY014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY014);
		}

		if (BBCNCLKLXMY015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY015);
		}

		if (BBCNCLKLXMY016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY016);
		}

		if (BBCNCLKLXMY017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY017);
		}

		if (BBCNCLKLXMY018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY018);
		}

		if (BBCNCLKLXMY019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY019);
		}

		if (BBCNCLKLXMY020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY020);
		}

		if (BBCNCLKLXMY021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY021);
		}

		if (BBCNCLKLXMY022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY022);
		}

		if (BBCNCLKLXMY024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY024);
		}

		if (BBCNCLKLXMY026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY026);
		}

		if (BBCNCLKLXMY027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY027);
		}

		if (BBCNCLKLXMY028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY028);
		}

		if (BBCNCLKLXMY029 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY029);
		}

		if (BBCNCLKLXMY033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY033);
		}

		if (BBCNCLKLXMY034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY034);
		}

		if (BBCNCLKLXMY037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY037);
		}

		if (BBCNCLKLXMY038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY038);
		}

		if (BBCNCLKLXMY039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY039);
		}

		if (BBCNCLKLXMY040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY040);
		}

		if (BBCNCLKLXMY041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY041);
		}

		if (BBCNCLKLXMY042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY042);
		}

		if (BBCNCLKLXMY043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY043);
		}

		if (BBCNCLKLXMY044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY044);
		}

		if (BBCNCLKLXMY045 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY045);
		}

		if (BBCNCLKLXDD030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD030);
		}

		if (BBCNCLKLXMY046 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY046);
		}

		if (BBCNCLKLXMY047 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY047);
		}

		if (BBCNCLKLXMY053 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY053);
		}

		if (BBCNCLKLXMY054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXMY054);
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
	public String XMY0149;
	public String XMY0150;
	public String XMY0151;
	public String XMY0152;
	public String XMY0153;
	public String XMY0154;
	public String XMY0155;
	public String XMY0156;
	public String XMY0157;
	public String XMY0158;
	public String XMY0159;
	public String XMY0160;
	public String XMY0161;
	public String XMY0162;
	public String XMY0163;
	public String XMY0164;
	public String XMY0165;
	public String XMY0166;
	public String XMY0167;
	public String XMY0168;
	public String XMY0169;
	public String XMY0170;
	public String XMY0171;
	public String XMY0172;
	public String XMY0173;
	public String XMY0174;
	public String XMY0175;
	public String XMY0176;
	public String XMY0177;
	public String XMY0178;
	public String XMY0179;
	public String XMY0180;
	public String XMY0181;
	public String XMY0182;
	public String XMY0183;
	public String XMY0184;
	public String XMY0185;
	public String XMY0186;
	public String XMY0187;
	public String XMY0188;
	public String XMY0189;
	public String XMY0190;
	public String XMY0191;
	public String XMY0192;
	public String XMY0193;
	public String XMY0194;
	public String XMY0195;
	public String XMY0196;
	public String XMY0197;
	public String XMY0198;
	public String XMY0199;
	public String XMY0200;
	public String XMY0201;
	public String XMY0202;
	public String XMY0203;
	public String XMY0204;
	public String XMY0205;
	public String XMY0207;
	public String XMY0208;
	public String XMY0209;
	public String XMY0210;
	public String XMY0211;
	public String XMY0212;
	public String XMY0213;
	public String XMY0214;
	public String XMY0215;
	public String XMY0216;
	public String XMY0217;
	public String XMY0218;
	public String XMY0219;
	public String XMY0220;
	public String XMY0221;
	public String XMY0222;
	public String XMY0223;
	public String XMY0224;
	public String XMY0225;
	public String XMY0226;
	public String XMY0227;
	public String XMY0228;
	public String XMY0229;
	public String XMY0230;
	public String XMY0231;
	public String XMY0232;
	public String XMY0233;
	public String XMY0234;
	public String XMY0235;
	public String XMY0236;
	public String XMY0237;
	public String XMY0238;
	public String XMY0239;
	public String XMY0240;
	public String XMY0241;
	public String XMY0242;
	public String XMY0243;
	public String XMY0244;
	public String XMY0245;
	public String XMY0246;
	public String XMY0247;
	public String XMY0248;
	public String XMY0249;
	public String XMY0250;
	public String XMY0251;
	public String XMY0252;
	public String XMY0253;
	public String XMY0254;
	public String XMY0255;
	public String XMY0256;
	public String XMY0257;
	public String XMY0258;
	public String XMY0259;
	public String XMY0260;
	public String XMY0261;
	public String XMY0262;
	public String XMY0263;
	public String XMY0264;
	public String BBCNCLKLXMY001;
	public String BBCNCLKLXMY002;
	public String BBCNCLKLXMY003;
	public String BBCNCLKLXMY004;
	public String BBCNCLKLXMY005;
	public String BBCNCLKLXMY006;
	public String BBCNCLKLXMY012;
	public String BBCNCLKLXMY013;
	public String BBCNCLKLXMY014;
	public String BBCNCLKLXMY015;
	public String BBCNCLKLXMY016;
	public String BBCNCLKLXMY017;
	public String BBCNCLKLXMY018;
	public String BBCNCLKLXMY019;
	public String BBCNCLKLXMY020;
	public String BBCNCLKLXMY021;
	public String BBCNCLKLXMY022;
	public String BBCNCLKLXMY024;
	public String BBCNCLKLXMY026;
	public String BBCNCLKLXMY027;
	public String BBCNCLKLXMY028;
	public String BBCNCLKLXMY029;
	public String BBCNCLKLXMY033;
	public String BBCNCLKLXMY034;
	public String BBCNCLKLXMY037;
	public String BBCNCLKLXMY038;
	public String BBCNCLKLXMY039;
	public String BBCNCLKLXMY040;
	public String BBCNCLKLXMY041;
	public String BBCNCLKLXMY042;
	public String BBCNCLKLXMY043;
	public String BBCNCLKLXMY044;
	public String BBCNCLKLXMY045;
	public String BBCNCLKLXDD030;
	public String BBCNCLKLXMY046;
	public String BBCNCLKLXMY047;
	public String BBCNCLKLXMY053;
	public String BBCNCLKLXMY054;
	public long modifyDate;
	public long syncDate;
}