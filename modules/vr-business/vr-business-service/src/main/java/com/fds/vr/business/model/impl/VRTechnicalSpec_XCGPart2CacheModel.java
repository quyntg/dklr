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

import com.fds.vr.business.model.VRTechnicalSpec_XCGPart2;

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
 * The cache model class for representing VRTechnicalSpec_XCGPart2 in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart2
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart2CacheModel implements CacheModel<VRTechnicalSpec_XCGPart2>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGPart2CacheModel)) {
			return false;
		}

		VRTechnicalSpec_XCGPart2CacheModel vrTechnicalSpec_XCGPart2CacheModel = (VRTechnicalSpec_XCGPart2CacheModel)obj;

		if (id == vrTechnicalSpec_XCGPart2CacheModel.id) {
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
		StringBundler sb = new StringBundler(311);

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
		sb.append(", XCG01163=");
		sb.append(XCG01163);
		sb.append(", XCG01164=");
		sb.append(XCG01164);
		sb.append(", XCG01165=");
		sb.append(XCG01165);
		sb.append(", XCG01166=");
		sb.append(XCG01166);
		sb.append(", XCG01167=");
		sb.append(XCG01167);
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
		sb.append(", XCG01174=");
		sb.append(XCG01174);
		sb.append(", XCG01175=");
		sb.append(XCG01175);
		sb.append(", XCG01176=");
		sb.append(XCG01176);
		sb.append(", XCG01177=");
		sb.append(XCG01177);
		sb.append(", XCG01178=");
		sb.append(XCG01178);
		sb.append(", XCG01179=");
		sb.append(XCG01179);
		sb.append(", XCG01180=");
		sb.append(XCG01180);
		sb.append(", XCG01181=");
		sb.append(XCG01181);
		sb.append(", XCG01182=");
		sb.append(XCG01182);
		sb.append(", XCG01183=");
		sb.append(XCG01183);
		sb.append(", XCG01184=");
		sb.append(XCG01184);
		sb.append(", XCG01185=");
		sb.append(XCG01185);
		sb.append(", XCG01186=");
		sb.append(XCG01186);
		sb.append(", XCG01187=");
		sb.append(XCG01187);
		sb.append(", XCG01188=");
		sb.append(XCG01188);
		sb.append(", XCG01189=");
		sb.append(XCG01189);
		sb.append(", XCG01190=");
		sb.append(XCG01190);
		sb.append(", XCG01191=");
		sb.append(XCG01191);
		sb.append(", XCG01192=");
		sb.append(XCG01192);
		sb.append(", XCG01193=");
		sb.append(XCG01193);
		sb.append(", XCG01194=");
		sb.append(XCG01194);
		sb.append(", XCG01195=");
		sb.append(XCG01195);
		sb.append(", XCG01196=");
		sb.append(XCG01196);
		sb.append(", XCG01197=");
		sb.append(XCG01197);
		sb.append(", XCG01198=");
		sb.append(XCG01198);
		sb.append(", XCG01199=");
		sb.append(XCG01199);
		sb.append(", XCG01200=");
		sb.append(XCG01200);
		sb.append(", XCG01202=");
		sb.append(XCG01202);
		sb.append(", XCG01203=");
		sb.append(XCG01203);
		sb.append(", XCG01204=");
		sb.append(XCG01204);
		sb.append(", XCG01205=");
		sb.append(XCG01205);
		sb.append(", XCG01206=");
		sb.append(XCG01206);
		sb.append(", XCG01207=");
		sb.append(XCG01207);
		sb.append(", XCG01208=");
		sb.append(XCG01208);
		sb.append(", XCG01209=");
		sb.append(XCG01209);
		sb.append(", XCG01210=");
		sb.append(XCG01210);
		sb.append(", XCG01212=");
		sb.append(XCG01212);
		sb.append(", XCG01213=");
		sb.append(XCG01213);
		sb.append(", XCG01214=");
		sb.append(XCG01214);
		sb.append(", XCG01215=");
		sb.append(XCG01215);
		sb.append(", XCG01216=");
		sb.append(XCG01216);
		sb.append(", XCG01217=");
		sb.append(XCG01217);
		sb.append(", XCG01218=");
		sb.append(XCG01218);
		sb.append(", XCG01219=");
		sb.append(XCG01219);
		sb.append(", XCG01220=");
		sb.append(XCG01220);
		sb.append(", XCG01221=");
		sb.append(XCG01221);
		sb.append(", XCG01222=");
		sb.append(XCG01222);
		sb.append(", XCG01223=");
		sb.append(XCG01223);
		sb.append(", XCG01224=");
		sb.append(XCG01224);
		sb.append(", XCG01225=");
		sb.append(XCG01225);
		sb.append(", XCG01226=");
		sb.append(XCG01226);
		sb.append(", XCG01228=");
		sb.append(XCG01228);
		sb.append(", XCG01230=");
		sb.append(XCG01230);
		sb.append(", XCG01231=");
		sb.append(XCG01231);
		sb.append(", XCG01232=");
		sb.append(XCG01232);
		sb.append(", XCG01234=");
		sb.append(XCG01234);
		sb.append(", XCG01236=");
		sb.append(XCG01236);
		sb.append(", XCG01237=");
		sb.append(XCG01237);
		sb.append(", XCG01229=");
		sb.append(XCG01229);
		sb.append(", XCG01238=");
		sb.append(XCG01238);
		sb.append(", XCG01239=");
		sb.append(XCG01239);
		sb.append(", XCG01240=");
		sb.append(XCG01240);
		sb.append(", XCG01241=");
		sb.append(XCG01241);
		sb.append(", XCG01242=");
		sb.append(XCG01242);
		sb.append(", XCG01243=");
		sb.append(XCG01243);
		sb.append(", XCG01235=");
		sb.append(XCG01235);
		sb.append(", XCG01244=");
		sb.append(XCG01244);
		sb.append(", XCG01245=");
		sb.append(XCG01245);
		sb.append(", XCG01246=");
		sb.append(XCG01246);
		sb.append(", XCG01247=");
		sb.append(XCG01247);
		sb.append(", XCG01248=");
		sb.append(XCG01248);
		sb.append(", XCG01249=");
		sb.append(XCG01249);
		sb.append(", XCG11248=");
		sb.append(XCG11248);
		sb.append(", XCG11249=");
		sb.append(XCG11249);
		sb.append(", XCG01250=");
		sb.append(XCG01250);
		sb.append(", XCG01251=");
		sb.append(XCG01251);
		sb.append(", XCG01252=");
		sb.append(XCG01252);
		sb.append(", XCG01253=");
		sb.append(XCG01253);
		sb.append(", XCG01255=");
		sb.append(XCG01255);
		sb.append(", XCG01256=");
		sb.append(XCG01256);
		sb.append(", XCG01257=");
		sb.append(XCG01257);
		sb.append(", XCG01258=");
		sb.append(XCG01258);
		sb.append(", XCG01259=");
		sb.append(XCG01259);
		sb.append(", XCG01260=");
		sb.append(XCG01260);
		sb.append(", XCG01261=");
		sb.append(XCG01261);
		sb.append(", XCG01262=");
		sb.append(XCG01262);
		sb.append(", XCG11253=");
		sb.append(XCG11253);
		sb.append(", XCG01263=");
		sb.append(XCG01263);
		sb.append(", XCG01264=");
		sb.append(XCG01264);
		sb.append(", XCG01265=");
		sb.append(XCG01265);
		sb.append(", XCG01266=");
		sb.append(XCG01266);
		sb.append(", XCG01901=");
		sb.append(XCG01901);
		sb.append(", XCG01267=");
		sb.append(XCG01267);
		sb.append(", XCG01902=");
		sb.append(XCG01902);
		sb.append(", XCG01268=");
		sb.append(XCG01268);
		sb.append(", XCG01269=");
		sb.append(XCG01269);
		sb.append(", XCG01903=");
		sb.append(XCG01903);
		sb.append(", XCG01270=");
		sb.append(XCG01270);
		sb.append(", XCG01271=");
		sb.append(XCG01271);
		sb.append(", XCG01273=");
		sb.append(XCG01273);
		sb.append(", XCG01274=");
		sb.append(XCG01274);
		sb.append(", XCG01275=");
		sb.append(XCG01275);
		sb.append(", XCG01276=");
		sb.append(XCG01276);
		sb.append(", XCG01277=");
		sb.append(XCG01277);
		sb.append(", XCG01278=");
		sb.append(XCG01278);
		sb.append(", XCG01279=");
		sb.append(XCG01279);
		sb.append(", XCG01280=");
		sb.append(XCG01280);
		sb.append(", XCG01281=");
		sb.append(XCG01281);
		sb.append(", XCG01282=");
		sb.append(XCG01282);
		sb.append(", XCG01283=");
		sb.append(XCG01283);
		sb.append(", XCG01284=");
		sb.append(XCG01284);
		sb.append(", XCG01285=");
		sb.append(XCG01285);
		sb.append(", XCG01286=");
		sb.append(XCG01286);
		sb.append(", XCG01287=");
		sb.append(XCG01287);
		sb.append(", XCG01288=");
		sb.append(XCG01288);
		sb.append(", XCG01289=");
		sb.append(XCG01289);
		sb.append(", XCG01290=");
		sb.append(XCG01290);
		sb.append(", XCG01291=");
		sb.append(XCG01291);
		sb.append(", XCG01292=");
		sb.append(XCG01292);
		sb.append(", XCG01293=");
		sb.append(XCG01293);
		sb.append(", XCG01294=");
		sb.append(XCG01294);
		sb.append(", XCG01295=");
		sb.append(XCG01295);
		sb.append(", XCG01296=");
		sb.append(XCG01296);
		sb.append(", XCG01297=");
		sb.append(XCG01297);
		sb.append(", XCG01298=");
		sb.append(XCG01298);
		sb.append(", XCG01300=");
		sb.append(XCG01300);
		sb.append(", XCG01301=");
		sb.append(XCG01301);
		sb.append(", XCG01302=");
		sb.append(XCG01302);
		sb.append(", XCG01303=");
		sb.append(XCG01303);
		sb.append(", XCG01304=");
		sb.append(XCG01304);
		sb.append(", XCG01305=");
		sb.append(XCG01305);
		sb.append(", XCG01306=");
		sb.append(XCG01306);
		sb.append(", XCG01307=");
		sb.append(XCG01307);
		sb.append(", XCG01308=");
		sb.append(XCG01308);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XCGPart2 toEntityModel() {
		VRTechnicalSpec_XCGPart2Impl vrTechnicalSpec_XCGPart2Impl = new VRTechnicalSpec_XCGPart2Impl();

		vrTechnicalSpec_XCGPart2Impl.setId(id);
		vrTechnicalSpec_XCGPart2Impl.setMtCore(mtCore);
		vrTechnicalSpec_XCGPart2Impl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XCGPart2Impl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XCGPart2Impl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XCGPart2Impl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XCGPart2Impl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XCGPart2Impl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XCGPart2Impl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XCG01163 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01163(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01163(XCG01163);
		}

		if (XCG01164 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01164(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01164(XCG01164);
		}

		if (XCG01165 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01165(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01165(XCG01165);
		}

		if (XCG01166 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01166(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01166(XCG01166);
		}

		if (XCG01167 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01167(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01167(XCG01167);
		}

		if (XCG01169 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01169(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01169(XCG01169);
		}

		if (XCG01170 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01170(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01170(XCG01170);
		}

		if (XCG01171 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01171(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01171(XCG01171);
		}

		if (XCG01172 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01172(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01172(XCG01172);
		}

		if (XCG01173 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01173(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01173(XCG01173);
		}

		if (XCG01174 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01174(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01174(XCG01174);
		}

		if (XCG01175 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01175(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01175(XCG01175);
		}

		if (XCG01176 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01176(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01176(XCG01176);
		}

		if (XCG01177 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01177(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01177(XCG01177);
		}

		if (XCG01178 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01178(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01178(XCG01178);
		}

		if (XCG01179 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01179(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01179(XCG01179);
		}

		if (XCG01180 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01180(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01180(XCG01180);
		}

		if (XCG01181 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01181(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01181(XCG01181);
		}

		if (XCG01182 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01182(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01182(XCG01182);
		}

		if (XCG01183 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01183(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01183(XCG01183);
		}

		if (XCG01184 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01184(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01184(XCG01184);
		}

		if (XCG01185 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01185(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01185(XCG01185);
		}

		if (XCG01186 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01186(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01186(XCG01186);
		}

		if (XCG01187 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01187(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01187(XCG01187);
		}

		if (XCG01188 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01188(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01188(XCG01188);
		}

		if (XCG01189 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01189(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01189(XCG01189);
		}

		if (XCG01190 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01190(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01190(XCG01190);
		}

		if (XCG01191 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01191(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01191(XCG01191);
		}

		if (XCG01192 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01192(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01192(XCG01192);
		}

		if (XCG01193 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01193(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01193(XCG01193);
		}

		if (XCG01194 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01194(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01194(XCG01194);
		}

		if (XCG01195 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01195(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01195(XCG01195);
		}

		if (XCG01196 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01196(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01196(XCG01196);
		}

		if (XCG01197 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01197(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01197(XCG01197);
		}

		if (XCG01198 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01198(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01198(XCG01198);
		}

		if (XCG01199 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01199(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01199(XCG01199);
		}

		if (XCG01200 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01200(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01200(XCG01200);
		}

		if (XCG01202 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01202(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01202(XCG01202);
		}

		if (XCG01203 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01203(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01203(XCG01203);
		}

		if (XCG01204 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01204(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01204(XCG01204);
		}

		if (XCG01205 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01205(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01205(XCG01205);
		}

		if (XCG01206 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01206(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01206(XCG01206);
		}

		if (XCG01207 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01207(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01207(XCG01207);
		}

		if (XCG01208 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01208(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01208(XCG01208);
		}

		if (XCG01209 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01209(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01209(XCG01209);
		}

		if (XCG01210 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01210(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01210(XCG01210);
		}

		if (XCG01212 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01212(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01212(XCG01212);
		}

		if (XCG01213 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01213(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01213(XCG01213);
		}

		if (XCG01214 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01214(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01214(XCG01214);
		}

		if (XCG01215 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01215(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01215(XCG01215);
		}

		if (XCG01216 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01216(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01216(XCG01216);
		}

		if (XCG01217 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01217(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01217(XCG01217);
		}

		if (XCG01218 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01218(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01218(XCG01218);
		}

		if (XCG01219 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01219(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01219(XCG01219);
		}

		if (XCG01220 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01220(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01220(XCG01220);
		}

		if (XCG01221 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01221(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01221(XCG01221);
		}

		if (XCG01222 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01222(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01222(XCG01222);
		}

		if (XCG01223 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01223(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01223(XCG01223);
		}

		if (XCG01224 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01224(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01224(XCG01224);
		}

		if (XCG01225 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01225(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01225(XCG01225);
		}

		if (XCG01226 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01226(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01226(XCG01226);
		}

		if (XCG01228 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01228(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01228(XCG01228);
		}

		if (XCG01230 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01230(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01230(XCG01230);
		}

		if (XCG01231 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01231(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01231(XCG01231);
		}

		if (XCG01232 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01232(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01232(XCG01232);
		}

		if (XCG01234 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01234(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01234(XCG01234);
		}

		if (XCG01236 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01236(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01236(XCG01236);
		}

		if (XCG01237 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01237(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01237(XCG01237);
		}

		if (XCG01229 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01229(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01229(XCG01229);
		}

		if (XCG01238 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01238(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01238(XCG01238);
		}

		if (XCG01239 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01239(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01239(XCG01239);
		}

		if (XCG01240 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01240(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01240(XCG01240);
		}

		if (XCG01241 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01241(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01241(XCG01241);
		}

		if (XCG01242 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01242(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01242(XCG01242);
		}

		if (XCG01243 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01243(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01243(XCG01243);
		}

		if (XCG01235 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01235(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01235(XCG01235);
		}

		if (XCG01244 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01244(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01244(XCG01244);
		}

		if (XCG01245 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01245(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01245(XCG01245);
		}

		if (XCG01246 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01246(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01246(XCG01246);
		}

		if (XCG01247 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01247(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01247(XCG01247);
		}

		if (XCG01248 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01248(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01248(XCG01248);
		}

		if (XCG01249 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01249(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01249(XCG01249);
		}

		if (XCG11248 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG11248(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG11248(XCG11248);
		}

		if (XCG11249 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG11249(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG11249(XCG11249);
		}

		if (XCG01250 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01250(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01250(XCG01250);
		}

		if (XCG01251 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01251(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01251(XCG01251);
		}

		if (XCG01252 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01252(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01252(XCG01252);
		}

		if (XCG01253 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01253(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01253(XCG01253);
		}

		if (XCG01255 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01255(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01255(XCG01255);
		}

		if (XCG01256 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01256(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01256(XCG01256);
		}

		if (XCG01257 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01257(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01257(XCG01257);
		}

		if (XCG01258 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01258(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01258(XCG01258);
		}

		if (XCG01259 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01259(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01259(XCG01259);
		}

		if (XCG01260 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01260(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01260(XCG01260);
		}

		if (XCG01261 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01261(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01261(XCG01261);
		}

		if (XCG01262 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01262(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01262(XCG01262);
		}

		if (XCG11253 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG11253(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG11253(XCG11253);
		}

		if (XCG01263 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01263(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01263(XCG01263);
		}

		if (XCG01264 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01264(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01264(XCG01264);
		}

		if (XCG01265 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01265(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01265(XCG01265);
		}

		if (XCG01266 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01266(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01266(XCG01266);
		}

		if (XCG01901 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01901(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01901(XCG01901);
		}

		if (XCG01267 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01267(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01267(XCG01267);
		}

		if (XCG01902 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01902(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01902(XCG01902);
		}

		if (XCG01268 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01268(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01268(XCG01268);
		}

		if (XCG01269 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01269(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01269(XCG01269);
		}

		if (XCG01903 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01903(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01903(XCG01903);
		}

		if (XCG01270 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01270(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01270(XCG01270);
		}

		if (XCG01271 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01271(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01271(XCG01271);
		}

		if (XCG01273 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01273(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01273(XCG01273);
		}

		if (XCG01274 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01274(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01274(XCG01274);
		}

		if (XCG01275 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01275(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01275(XCG01275);
		}

		if (XCG01276 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01276(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01276(XCG01276);
		}

		if (XCG01277 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01277(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01277(XCG01277);
		}

		if (XCG01278 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01278(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01278(XCG01278);
		}

		if (XCG01279 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01279(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01279(XCG01279);
		}

		if (XCG01280 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01280(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01280(XCG01280);
		}

		if (XCG01281 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01281(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01281(XCG01281);
		}

		if (XCG01282 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01282(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01282(XCG01282);
		}

		if (XCG01283 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01283(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01283(XCG01283);
		}

		if (XCG01284 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01284(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01284(XCG01284);
		}

		if (XCG01285 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01285(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01285(XCG01285);
		}

		if (XCG01286 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01286(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01286(XCG01286);
		}

		if (XCG01287 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01287(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01287(XCG01287);
		}

		if (XCG01288 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01288(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01288(XCG01288);
		}

		if (XCG01289 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01289(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01289(XCG01289);
		}

		if (XCG01290 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01290(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01290(XCG01290);
		}

		if (XCG01291 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01291(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01291(XCG01291);
		}

		if (XCG01292 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01292(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01292(XCG01292);
		}

		if (XCG01293 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01293(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01293(XCG01293);
		}

		if (XCG01294 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01294(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01294(XCG01294);
		}

		if (XCG01295 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01295(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01295(XCG01295);
		}

		if (XCG01296 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01296(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01296(XCG01296);
		}

		if (XCG01297 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01297(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01297(XCG01297);
		}

		if (XCG01298 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01298(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01298(XCG01298);
		}

		if (XCG01300 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01300(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01300(XCG01300);
		}

		if (XCG01301 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01301(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01301(XCG01301);
		}

		if (XCG01302 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01302(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01302(XCG01302);
		}

		if (XCG01303 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01303(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01303(XCG01303);
		}

		if (XCG01304 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01304(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01304(XCG01304);
		}

		if (XCG01305 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01305(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01305(XCG01305);
		}

		if (XCG01306 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01306(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01306(XCG01306);
		}

		if (XCG01307 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01307(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01307(XCG01307);
		}

		if (XCG01308 == null) {
			vrTechnicalSpec_XCGPart2Impl.setXCG01308(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setXCG01308(XCG01308);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCGPart2Impl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCGPart2Impl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XCGPart2Impl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XCGPart2Impl.resetOriginalValues();

		return vrTechnicalSpec_XCGPart2Impl;
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
		XCG01163 = objectInput.readUTF();
		XCG01164 = objectInput.readUTF();
		XCG01165 = objectInput.readUTF();
		XCG01166 = objectInput.readUTF();
		XCG01167 = objectInput.readUTF();
		XCG01169 = objectInput.readUTF();
		XCG01170 = objectInput.readUTF();
		XCG01171 = objectInput.readUTF();
		XCG01172 = objectInput.readUTF();
		XCG01173 = objectInput.readUTF();
		XCG01174 = objectInput.readUTF();
		XCG01175 = objectInput.readUTF();
		XCG01176 = objectInput.readUTF();
		XCG01177 = objectInput.readUTF();
		XCG01178 = objectInput.readUTF();
		XCG01179 = objectInput.readUTF();
		XCG01180 = objectInput.readUTF();
		XCG01181 = objectInput.readUTF();
		XCG01182 = objectInput.readUTF();
		XCG01183 = objectInput.readUTF();
		XCG01184 = objectInput.readUTF();
		XCG01185 = objectInput.readUTF();
		XCG01186 = objectInput.readUTF();
		XCG01187 = objectInput.readUTF();
		XCG01188 = objectInput.readUTF();
		XCG01189 = objectInput.readUTF();
		XCG01190 = objectInput.readUTF();
		XCG01191 = objectInput.readUTF();
		XCG01192 = objectInput.readUTF();
		XCG01193 = objectInput.readUTF();
		XCG01194 = objectInput.readUTF();
		XCG01195 = objectInput.readUTF();
		XCG01196 = objectInput.readUTF();
		XCG01197 = objectInput.readUTF();
		XCG01198 = objectInput.readUTF();
		XCG01199 = objectInput.readUTF();
		XCG01200 = objectInput.readUTF();
		XCG01202 = objectInput.readUTF();
		XCG01203 = objectInput.readUTF();
		XCG01204 = objectInput.readUTF();
		XCG01205 = objectInput.readUTF();
		XCG01206 = objectInput.readUTF();
		XCG01207 = objectInput.readUTF();
		XCG01208 = objectInput.readUTF();
		XCG01209 = objectInput.readUTF();
		XCG01210 = objectInput.readUTF();
		XCG01212 = objectInput.readUTF();
		XCG01213 = objectInput.readUTF();
		XCG01214 = objectInput.readUTF();
		XCG01215 = objectInput.readUTF();
		XCG01216 = objectInput.readUTF();
		XCG01217 = objectInput.readUTF();
		XCG01218 = objectInput.readUTF();
		XCG01219 = objectInput.readUTF();
		XCG01220 = objectInput.readUTF();
		XCG01221 = objectInput.readUTF();
		XCG01222 = objectInput.readUTF();
		XCG01223 = objectInput.readUTF();
		XCG01224 = objectInput.readUTF();
		XCG01225 = objectInput.readUTF();
		XCG01226 = objectInput.readUTF();
		XCG01228 = objectInput.readUTF();
		XCG01230 = objectInput.readUTF();
		XCG01231 = objectInput.readUTF();
		XCG01232 = objectInput.readUTF();
		XCG01234 = objectInput.readUTF();
		XCG01236 = objectInput.readUTF();
		XCG01237 = objectInput.readUTF();
		XCG01229 = objectInput.readUTF();
		XCG01238 = objectInput.readUTF();
		XCG01239 = objectInput.readUTF();
		XCG01240 = objectInput.readUTF();
		XCG01241 = objectInput.readUTF();
		XCG01242 = objectInput.readUTF();
		XCG01243 = objectInput.readUTF();
		XCG01235 = objectInput.readUTF();
		XCG01244 = objectInput.readUTF();
		XCG01245 = objectInput.readUTF();
		XCG01246 = objectInput.readUTF();
		XCG01247 = objectInput.readUTF();
		XCG01248 = objectInput.readUTF();
		XCG01249 = objectInput.readUTF();
		XCG11248 = objectInput.readUTF();
		XCG11249 = objectInput.readUTF();
		XCG01250 = objectInput.readUTF();
		XCG01251 = objectInput.readUTF();
		XCG01252 = objectInput.readUTF();
		XCG01253 = objectInput.readUTF();
		XCG01255 = objectInput.readUTF();
		XCG01256 = objectInput.readUTF();
		XCG01257 = objectInput.readUTF();
		XCG01258 = objectInput.readUTF();
		XCG01259 = objectInput.readUTF();
		XCG01260 = objectInput.readUTF();
		XCG01261 = objectInput.readUTF();
		XCG01262 = objectInput.readUTF();
		XCG11253 = objectInput.readUTF();
		XCG01263 = objectInput.readUTF();
		XCG01264 = objectInput.readUTF();
		XCG01265 = objectInput.readUTF();
		XCG01266 = objectInput.readUTF();
		XCG01901 = objectInput.readUTF();
		XCG01267 = objectInput.readUTF();
		XCG01902 = objectInput.readUTF();
		XCG01268 = objectInput.readUTF();
		XCG01269 = objectInput.readUTF();
		XCG01903 = objectInput.readUTF();
		XCG01270 = objectInput.readUTF();
		XCG01271 = objectInput.readUTF();
		XCG01273 = objectInput.readUTF();
		XCG01274 = objectInput.readUTF();
		XCG01275 = objectInput.readUTF();
		XCG01276 = objectInput.readUTF();
		XCG01277 = objectInput.readUTF();
		XCG01278 = objectInput.readUTF();
		XCG01279 = objectInput.readUTF();
		XCG01280 = objectInput.readUTF();
		XCG01281 = objectInput.readUTF();
		XCG01282 = objectInput.readUTF();
		XCG01283 = objectInput.readUTF();
		XCG01284 = objectInput.readUTF();
		XCG01285 = objectInput.readUTF();
		XCG01286 = objectInput.readUTF();
		XCG01287 = objectInput.readUTF();
		XCG01288 = objectInput.readUTF();
		XCG01289 = objectInput.readUTF();
		XCG01290 = objectInput.readUTF();
		XCG01291 = objectInput.readUTF();
		XCG01292 = objectInput.readUTF();
		XCG01293 = objectInput.readUTF();
		XCG01294 = objectInput.readUTF();
		XCG01295 = objectInput.readUTF();
		XCG01296 = objectInput.readUTF();
		XCG01297 = objectInput.readUTF();
		XCG01298 = objectInput.readUTF();
		XCG01300 = objectInput.readUTF();
		XCG01301 = objectInput.readUTF();
		XCG01302 = objectInput.readUTF();
		XCG01303 = objectInput.readUTF();
		XCG01304 = objectInput.readUTF();
		XCG01305 = objectInput.readUTF();
		XCG01306 = objectInput.readUTF();
		XCG01307 = objectInput.readUTF();
		XCG01308 = objectInput.readUTF();
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

		if (XCG01163 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01163);
		}

		if (XCG01164 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01164);
		}

		if (XCG01165 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01165);
		}

		if (XCG01166 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01166);
		}

		if (XCG01167 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01167);
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

		if (XCG01174 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01174);
		}

		if (XCG01175 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01175);
		}

		if (XCG01176 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01176);
		}

		if (XCG01177 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01177);
		}

		if (XCG01178 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01178);
		}

		if (XCG01179 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01179);
		}

		if (XCG01180 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01180);
		}

		if (XCG01181 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01181);
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

		if (XCG01184 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01184);
		}

		if (XCG01185 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01185);
		}

		if (XCG01186 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01186);
		}

		if (XCG01187 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01187);
		}

		if (XCG01188 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01188);
		}

		if (XCG01189 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01189);
		}

		if (XCG01190 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01190);
		}

		if (XCG01191 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01191);
		}

		if (XCG01192 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01192);
		}

		if (XCG01193 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01193);
		}

		if (XCG01194 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01194);
		}

		if (XCG01195 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01195);
		}

		if (XCG01196 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01196);
		}

		if (XCG01197 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01197);
		}

		if (XCG01198 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01198);
		}

		if (XCG01199 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01199);
		}

		if (XCG01200 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01200);
		}

		if (XCG01202 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01202);
		}

		if (XCG01203 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01203);
		}

		if (XCG01204 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01204);
		}

		if (XCG01205 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01205);
		}

		if (XCG01206 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01206);
		}

		if (XCG01207 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01207);
		}

		if (XCG01208 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01208);
		}

		if (XCG01209 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01209);
		}

		if (XCG01210 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01210);
		}

		if (XCG01212 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01212);
		}

		if (XCG01213 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01213);
		}

		if (XCG01214 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01214);
		}

		if (XCG01215 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01215);
		}

		if (XCG01216 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01216);
		}

		if (XCG01217 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01217);
		}

		if (XCG01218 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01218);
		}

		if (XCG01219 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01219);
		}

		if (XCG01220 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01220);
		}

		if (XCG01221 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01221);
		}

		if (XCG01222 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01222);
		}

		if (XCG01223 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01223);
		}

		if (XCG01224 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01224);
		}

		if (XCG01225 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01225);
		}

		if (XCG01226 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01226);
		}

		if (XCG01228 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01228);
		}

		if (XCG01230 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01230);
		}

		if (XCG01231 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01231);
		}

		if (XCG01232 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01232);
		}

		if (XCG01234 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01234);
		}

		if (XCG01236 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01236);
		}

		if (XCG01237 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01237);
		}

		if (XCG01229 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01229);
		}

		if (XCG01238 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01238);
		}

		if (XCG01239 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01239);
		}

		if (XCG01240 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01240);
		}

		if (XCG01241 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01241);
		}

		if (XCG01242 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01242);
		}

		if (XCG01243 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01243);
		}

		if (XCG01235 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01235);
		}

		if (XCG01244 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01244);
		}

		if (XCG01245 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01245);
		}

		if (XCG01246 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01246);
		}

		if (XCG01247 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01247);
		}

		if (XCG01248 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01248);
		}

		if (XCG01249 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01249);
		}

		if (XCG11248 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG11248);
		}

		if (XCG11249 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG11249);
		}

		if (XCG01250 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01250);
		}

		if (XCG01251 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01251);
		}

		if (XCG01252 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01252);
		}

		if (XCG01253 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01253);
		}

		if (XCG01255 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01255);
		}

		if (XCG01256 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01256);
		}

		if (XCG01257 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01257);
		}

		if (XCG01258 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01258);
		}

		if (XCG01259 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01259);
		}

		if (XCG01260 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01260);
		}

		if (XCG01261 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01261);
		}

		if (XCG01262 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01262);
		}

		if (XCG11253 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG11253);
		}

		if (XCG01263 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01263);
		}

		if (XCG01264 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01264);
		}

		if (XCG01265 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01265);
		}

		if (XCG01266 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01266);
		}

		if (XCG01901 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01901);
		}

		if (XCG01267 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01267);
		}

		if (XCG01902 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01902);
		}

		if (XCG01268 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01268);
		}

		if (XCG01269 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01269);
		}

		if (XCG01903 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01903);
		}

		if (XCG01270 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01270);
		}

		if (XCG01271 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01271);
		}

		if (XCG01273 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01273);
		}

		if (XCG01274 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01274);
		}

		if (XCG01275 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01275);
		}

		if (XCG01276 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01276);
		}

		if (XCG01277 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01277);
		}

		if (XCG01278 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01278);
		}

		if (XCG01279 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01279);
		}

		if (XCG01280 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01280);
		}

		if (XCG01281 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01281);
		}

		if (XCG01282 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01282);
		}

		if (XCG01283 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01283);
		}

		if (XCG01284 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01284);
		}

		if (XCG01285 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01285);
		}

		if (XCG01286 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01286);
		}

		if (XCG01287 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01287);
		}

		if (XCG01288 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01288);
		}

		if (XCG01289 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01289);
		}

		if (XCG01290 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01290);
		}

		if (XCG01291 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01291);
		}

		if (XCG01292 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01292);
		}

		if (XCG01293 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01293);
		}

		if (XCG01294 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01294);
		}

		if (XCG01295 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01295);
		}

		if (XCG01296 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01296);
		}

		if (XCG01297 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01297);
		}

		if (XCG01298 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01298);
		}

		if (XCG01300 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01300);
		}

		if (XCG01301 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01301);
		}

		if (XCG01302 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01302);
		}

		if (XCG01303 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01303);
		}

		if (XCG01304 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01304);
		}

		if (XCG01305 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01305);
		}

		if (XCG01306 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01306);
		}

		if (XCG01307 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01307);
		}

		if (XCG01308 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01308);
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
	public String XCG01163;
	public String XCG01164;
	public String XCG01165;
	public String XCG01166;
	public String XCG01167;
	public String XCG01169;
	public String XCG01170;
	public String XCG01171;
	public String XCG01172;
	public String XCG01173;
	public String XCG01174;
	public String XCG01175;
	public String XCG01176;
	public String XCG01177;
	public String XCG01178;
	public String XCG01179;
	public String XCG01180;
	public String XCG01181;
	public String XCG01182;
	public String XCG01183;
	public String XCG01184;
	public String XCG01185;
	public String XCG01186;
	public String XCG01187;
	public String XCG01188;
	public String XCG01189;
	public String XCG01190;
	public String XCG01191;
	public String XCG01192;
	public String XCG01193;
	public String XCG01194;
	public String XCG01195;
	public String XCG01196;
	public String XCG01197;
	public String XCG01198;
	public String XCG01199;
	public String XCG01200;
	public String XCG01202;
	public String XCG01203;
	public String XCG01204;
	public String XCG01205;
	public String XCG01206;
	public String XCG01207;
	public String XCG01208;
	public String XCG01209;
	public String XCG01210;
	public String XCG01212;
	public String XCG01213;
	public String XCG01214;
	public String XCG01215;
	public String XCG01216;
	public String XCG01217;
	public String XCG01218;
	public String XCG01219;
	public String XCG01220;
	public String XCG01221;
	public String XCG01222;
	public String XCG01223;
	public String XCG01224;
	public String XCG01225;
	public String XCG01226;
	public String XCG01228;
	public String XCG01230;
	public String XCG01231;
	public String XCG01232;
	public String XCG01234;
	public String XCG01236;
	public String XCG01237;
	public String XCG01229;
	public String XCG01238;
	public String XCG01239;
	public String XCG01240;
	public String XCG01241;
	public String XCG01242;
	public String XCG01243;
	public String XCG01235;
	public String XCG01244;
	public String XCG01245;
	public String XCG01246;
	public String XCG01247;
	public String XCG01248;
	public String XCG01249;
	public String XCG11248;
	public String XCG11249;
	public String XCG01250;
	public String XCG01251;
	public String XCG01252;
	public String XCG01253;
	public String XCG01255;
	public String XCG01256;
	public String XCG01257;
	public String XCG01258;
	public String XCG01259;
	public String XCG01260;
	public String XCG01261;
	public String XCG01262;
	public String XCG11253;
	public String XCG01263;
	public String XCG01264;
	public String XCG01265;
	public String XCG01266;
	public String XCG01901;
	public String XCG01267;
	public String XCG01902;
	public String XCG01268;
	public String XCG01269;
	public String XCG01903;
	public String XCG01270;
	public String XCG01271;
	public String XCG01273;
	public String XCG01274;
	public String XCG01275;
	public String XCG01276;
	public String XCG01277;
	public String XCG01278;
	public String XCG01279;
	public String XCG01280;
	public String XCG01281;
	public String XCG01282;
	public String XCG01283;
	public String XCG01284;
	public String XCG01285;
	public String XCG01286;
	public String XCG01287;
	public String XCG01288;
	public String XCG01289;
	public String XCG01290;
	public String XCG01291;
	public String XCG01292;
	public String XCG01293;
	public String XCG01294;
	public String XCG01295;
	public String XCG01296;
	public String XCG01297;
	public String XCG01298;
	public String XCG01300;
	public String XCG01301;
	public String XCG01302;
	public String XCG01303;
	public String XCG01304;
	public String XCG01305;
	public String XCG01306;
	public String XCG01307;
	public String XCG01308;
	public long modifyDate;
	public long syncDate;
}