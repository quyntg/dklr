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

import com.fds.vr.business.model.VRTechnicalSpec_XCNPart2;

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
 * The cache model class for representing VRTechnicalSpec_XCNPart2 in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCNPart2
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCNPart2CacheModel implements CacheModel<VRTechnicalSpec_XCNPart2>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCNPart2CacheModel)) {
			return false;
		}

		VRTechnicalSpec_XCNPart2CacheModel vrTechnicalSpec_XCNPart2CacheModel = (VRTechnicalSpec_XCNPart2CacheModel)obj;

		if (id == vrTechnicalSpec_XCNPart2CacheModel.id) {
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
		StringBundler sb = new StringBundler(323);

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
		sb.append(", XCN01186=");
		sb.append(XCN01186);
		sb.append(", XCN01187=");
		sb.append(XCN01187);
		sb.append(", XCN01188=");
		sb.append(XCN01188);
		sb.append(", XCN01189=");
		sb.append(XCN01189);
		sb.append(", XCN01190=");
		sb.append(XCN01190);
		sb.append(", XCN01191=");
		sb.append(XCN01191);
		sb.append(", XCN01192=");
		sb.append(XCN01192);
		sb.append(", XCN01193=");
		sb.append(XCN01193);
		sb.append(", XCN01194=");
		sb.append(XCN01194);
		sb.append(", XCN01195=");
		sb.append(XCN01195);
		sb.append(", XCN01196=");
		sb.append(XCN01196);
		sb.append(", XCN01197=");
		sb.append(XCN01197);
		sb.append(", XCN01198=");
		sb.append(XCN01198);
		sb.append(", XCN01199=");
		sb.append(XCN01199);
		sb.append(", XCN01200=");
		sb.append(XCN01200);
		sb.append(", XCN01201=");
		sb.append(XCN01201);
		sb.append(", XCN01202=");
		sb.append(XCN01202);
		sb.append(", XCN01203=");
		sb.append(XCN01203);
		sb.append(", XCN01204=");
		sb.append(XCN01204);
		sb.append(", XCN01205=");
		sb.append(XCN01205);
		sb.append(", XCN01206=");
		sb.append(XCN01206);
		sb.append(", XCN01207=");
		sb.append(XCN01207);
		sb.append(", XCN01208=");
		sb.append(XCN01208);
		sb.append(", XCN01209=");
		sb.append(XCN01209);
		sb.append(", XCN01210=");
		sb.append(XCN01210);
		sb.append(", XCN01211=");
		sb.append(XCN01211);
		sb.append(", XCN01212=");
		sb.append(XCN01212);
		sb.append(", XCN01213=");
		sb.append(XCN01213);
		sb.append(", XCN01214=");
		sb.append(XCN01214);
		sb.append(", XCN01215=");
		sb.append(XCN01215);
		sb.append(", XCN01216=");
		sb.append(XCN01216);
		sb.append(", XCN01217=");
		sb.append(XCN01217);
		sb.append(", XCN01218=");
		sb.append(XCN01218);
		sb.append(", XCN01219=");
		sb.append(XCN01219);
		sb.append(", XCN01220=");
		sb.append(XCN01220);
		sb.append(", XCN01221=");
		sb.append(XCN01221);
		sb.append(", XCN01222=");
		sb.append(XCN01222);
		sb.append(", XCN01223=");
		sb.append(XCN01223);
		sb.append(", XCN01224=");
		sb.append(XCN01224);
		sb.append(", XCN01225=");
		sb.append(XCN01225);
		sb.append(", XCN01226=");
		sb.append(XCN01226);
		sb.append(", XCN01227=");
		sb.append(XCN01227);
		sb.append(", XCN01228=");
		sb.append(XCN01228);
		sb.append(", XCN01229=");
		sb.append(XCN01229);
		sb.append(", XCN01230=");
		sb.append(XCN01230);
		sb.append(", XCN01231=");
		sb.append(XCN01231);
		sb.append(", XCN01232=");
		sb.append(XCN01232);
		sb.append(", XCN01233=");
		sb.append(XCN01233);
		sb.append(", XCN01234=");
		sb.append(XCN01234);
		sb.append(", XCN01235=");
		sb.append(XCN01235);
		sb.append(", XCN01236=");
		sb.append(XCN01236);
		sb.append(", XCN01237=");
		sb.append(XCN01237);
		sb.append(", XCN01238=");
		sb.append(XCN01238);
		sb.append(", XCN01239=");
		sb.append(XCN01239);
		sb.append(", XCN01240=");
		sb.append(XCN01240);
		sb.append(", XCN01241=");
		sb.append(XCN01241);
		sb.append(", XCN01242=");
		sb.append(XCN01242);
		sb.append(", XCN01243=");
		sb.append(XCN01243);
		sb.append(", XCN01244=");
		sb.append(XCN01244);
		sb.append(", XCN01245=");
		sb.append(XCN01245);
		sb.append(", XCN01246=");
		sb.append(XCN01246);
		sb.append(", XCN01247=");
		sb.append(XCN01247);
		sb.append(", XCN01248=");
		sb.append(XCN01248);
		sb.append(", XCN01249=");
		sb.append(XCN01249);
		sb.append(", XCN01250=");
		sb.append(XCN01250);
		sb.append(", XCN01251=");
		sb.append(XCN01251);
		sb.append(", XCN01252=");
		sb.append(XCN01252);
		sb.append(", XCN01253=");
		sb.append(XCN01253);
		sb.append(", XCN01254=");
		sb.append(XCN01254);
		sb.append(", XCN01255=");
		sb.append(XCN01255);
		sb.append(", XCN01256=");
		sb.append(XCN01256);
		sb.append(", XCN01257=");
		sb.append(XCN01257);
		sb.append(", XCN01258=");
		sb.append(XCN01258);
		sb.append(", XCN01259=");
		sb.append(XCN01259);
		sb.append(", XCN01260=");
		sb.append(XCN01260);
		sb.append(", XCN01261=");
		sb.append(XCN01261);
		sb.append(", XCN01262=");
		sb.append(XCN01262);
		sb.append(", XCN01263=");
		sb.append(XCN01263);
		sb.append(", XCN01264=");
		sb.append(XCN01264);
		sb.append(", XCN01265=");
		sb.append(XCN01265);
		sb.append(", XCN01266=");
		sb.append(XCN01266);
		sb.append(", XCN01267=");
		sb.append(XCN01267);
		sb.append(", XCN01268=");
		sb.append(XCN01268);
		sb.append(", XCN01269=");
		sb.append(XCN01269);
		sb.append(", XCN01270=");
		sb.append(XCN01270);
		sb.append(", XCN01271=");
		sb.append(XCN01271);
		sb.append(", XCN01272=");
		sb.append(XCN01272);
		sb.append(", XCN01273=");
		sb.append(XCN01273);
		sb.append(", XCN01274=");
		sb.append(XCN01274);
		sb.append(", XCN01275=");
		sb.append(XCN01275);
		sb.append(", XCN01276=");
		sb.append(XCN01276);
		sb.append(", XCN01277=");
		sb.append(XCN01277);
		sb.append(", XCN01278=");
		sb.append(XCN01278);
		sb.append(", XCN01279=");
		sb.append(XCN01279);
		sb.append(", XCN01280=");
		sb.append(XCN01280);
		sb.append(", XCN01281=");
		sb.append(XCN01281);
		sb.append(", XCN01282=");
		sb.append(XCN01282);
		sb.append(", XCN01283=");
		sb.append(XCN01283);
		sb.append(", XCN01284=");
		sb.append(XCN01284);
		sb.append(", XCN01285=");
		sb.append(XCN01285);
		sb.append(", XCN01286=");
		sb.append(XCN01286);
		sb.append(", XCN01287=");
		sb.append(XCN01287);
		sb.append(", XCN01288=");
		sb.append(XCN01288);
		sb.append(", XCN01289=");
		sb.append(XCN01289);
		sb.append(", XCN01290=");
		sb.append(XCN01290);
		sb.append(", XCN01291=");
		sb.append(XCN01291);
		sb.append(", XCN01292=");
		sb.append(XCN01292);
		sb.append(", XCN01293=");
		sb.append(XCN01293);
		sb.append(", XCN01294=");
		sb.append(XCN01294);
		sb.append(", XCN01295=");
		sb.append(XCN01295);
		sb.append(", XCN01296=");
		sb.append(XCN01296);
		sb.append(", XCN01297=");
		sb.append(XCN01297);
		sb.append(", XCN01298=");
		sb.append(XCN01298);
		sb.append(", XCN01299=");
		sb.append(XCN01299);
		sb.append(", XCN01300=");
		sb.append(XCN01300);
		sb.append(", XCN01301=");
		sb.append(XCN01301);
		sb.append(", XCN01302=");
		sb.append(XCN01302);
		sb.append(", XCN01303=");
		sb.append(XCN01303);
		sb.append(", XCN01304=");
		sb.append(XCN01304);
		sb.append(", XCN01305=");
		sb.append(XCN01305);
		sb.append(", XCN01306=");
		sb.append(XCN01306);
		sb.append(", XCN01307=");
		sb.append(XCN01307);
		sb.append(", XCN01308=");
		sb.append(XCN01308);
		sb.append(", XCN01309=");
		sb.append(XCN01309);
		sb.append(", XCN01310=");
		sb.append(XCN01310);
		sb.append(", XCN01311=");
		sb.append(XCN01311);
		sb.append(", XCN01312=");
		sb.append(XCN01312);
		sb.append(", XCN01313=");
		sb.append(XCN01313);
		sb.append(", XCN01314=");
		sb.append(XCN01314);
		sb.append(", XCN01315=");
		sb.append(XCN01315);
		sb.append(", XCN01316=");
		sb.append(XCN01316);
		sb.append(", XCN01317=");
		sb.append(XCN01317);
		sb.append(", XCN01318=");
		sb.append(XCN01318);
		sb.append(", XCN01319=");
		sb.append(XCN01319);
		sb.append(", XCN01320=");
		sb.append(XCN01320);
		sb.append(", XCN01321=");
		sb.append(XCN01321);
		sb.append(", XCN01322=");
		sb.append(XCN01322);
		sb.append(", XCN01323=");
		sb.append(XCN01323);
		sb.append(", XCN01324=");
		sb.append(XCN01324);
		sb.append(", XCN01325=");
		sb.append(XCN01325);
		sb.append(", XCN01326=");
		sb.append(XCN01326);
		sb.append(", XCN01327=");
		sb.append(XCN01327);
		sb.append(", XCN01328=");
		sb.append(XCN01328);
		sb.append(", XCN01329=");
		sb.append(XCN01329);
		sb.append(", XCN01330=");
		sb.append(XCN01330);
		sb.append(", XCN01331=");
		sb.append(XCN01331);
		sb.append(", XCN01332=");
		sb.append(XCN01332);
		sb.append(", XCN01333=");
		sb.append(XCN01333);
		sb.append(", XCN01334=");
		sb.append(XCN01334);
		sb.append(", XCN01335=");
		sb.append(XCN01335);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XCNPart2 toEntityModel() {
		VRTechnicalSpec_XCNPart2Impl vrTechnicalSpec_XCNPart2Impl = new VRTechnicalSpec_XCNPart2Impl();

		vrTechnicalSpec_XCNPart2Impl.setId(id);
		vrTechnicalSpec_XCNPart2Impl.setMtCore(mtCore);
		vrTechnicalSpec_XCNPart2Impl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XCNPart2Impl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XCNPart2Impl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XCNPart2Impl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XCNPart2Impl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XCNPart2Impl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XCNPart2Impl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XCN01186 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01186(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01186(XCN01186);
		}

		if (XCN01187 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01187(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01187(XCN01187);
		}

		if (XCN01188 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01188(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01188(XCN01188);
		}

		if (XCN01189 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01189(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01189(XCN01189);
		}

		if (XCN01190 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01190(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01190(XCN01190);
		}

		if (XCN01191 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01191(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01191(XCN01191);
		}

		if (XCN01192 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01192(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01192(XCN01192);
		}

		if (XCN01193 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01193(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01193(XCN01193);
		}

		if (XCN01194 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01194(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01194(XCN01194);
		}

		if (XCN01195 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01195(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01195(XCN01195);
		}

		if (XCN01196 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01196(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01196(XCN01196);
		}

		if (XCN01197 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01197(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01197(XCN01197);
		}

		if (XCN01198 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01198(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01198(XCN01198);
		}

		if (XCN01199 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01199(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01199(XCN01199);
		}

		if (XCN01200 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01200(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01200(XCN01200);
		}

		if (XCN01201 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01201(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01201(XCN01201);
		}

		if (XCN01202 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01202(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01202(XCN01202);
		}

		if (XCN01203 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01203(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01203(XCN01203);
		}

		if (XCN01204 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01204(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01204(XCN01204);
		}

		if (XCN01205 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01205(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01205(XCN01205);
		}

		if (XCN01206 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01206(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01206(XCN01206);
		}

		if (XCN01207 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01207(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01207(XCN01207);
		}

		if (XCN01208 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01208(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01208(XCN01208);
		}

		if (XCN01209 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01209(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01209(XCN01209);
		}

		if (XCN01210 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01210(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01210(XCN01210);
		}

		if (XCN01211 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01211(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01211(XCN01211);
		}

		if (XCN01212 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01212(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01212(XCN01212);
		}

		if (XCN01213 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01213(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01213(XCN01213);
		}

		if (XCN01214 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01214(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01214(XCN01214);
		}

		if (XCN01215 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01215(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01215(XCN01215);
		}

		if (XCN01216 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01216(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01216(XCN01216);
		}

		if (XCN01217 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01217(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01217(XCN01217);
		}

		if (XCN01218 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01218(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01218(XCN01218);
		}

		if (XCN01219 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01219(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01219(XCN01219);
		}

		if (XCN01220 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01220(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01220(XCN01220);
		}

		if (XCN01221 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01221(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01221(XCN01221);
		}

		if (XCN01222 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01222(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01222(XCN01222);
		}

		if (XCN01223 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01223(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01223(XCN01223);
		}

		if (XCN01224 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01224(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01224(XCN01224);
		}

		if (XCN01225 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01225(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01225(XCN01225);
		}

		if (XCN01226 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01226(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01226(XCN01226);
		}

		if (XCN01227 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01227(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01227(XCN01227);
		}

		if (XCN01228 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01228(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01228(XCN01228);
		}

		if (XCN01229 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01229(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01229(XCN01229);
		}

		if (XCN01230 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01230(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01230(XCN01230);
		}

		if (XCN01231 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01231(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01231(XCN01231);
		}

		if (XCN01232 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01232(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01232(XCN01232);
		}

		if (XCN01233 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01233(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01233(XCN01233);
		}

		if (XCN01234 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01234(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01234(XCN01234);
		}

		if (XCN01235 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01235(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01235(XCN01235);
		}

		if (XCN01236 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01236(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01236(XCN01236);
		}

		if (XCN01237 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01237(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01237(XCN01237);
		}

		if (XCN01238 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01238(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01238(XCN01238);
		}

		if (XCN01239 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01239(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01239(XCN01239);
		}

		if (XCN01240 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01240(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01240(XCN01240);
		}

		if (XCN01241 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01241(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01241(XCN01241);
		}

		if (XCN01242 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01242(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01242(XCN01242);
		}

		if (XCN01243 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01243(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01243(XCN01243);
		}

		if (XCN01244 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01244(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01244(XCN01244);
		}

		if (XCN01245 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01245(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01245(XCN01245);
		}

		if (XCN01246 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01246(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01246(XCN01246);
		}

		if (XCN01247 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01247(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01247(XCN01247);
		}

		if (XCN01248 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01248(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01248(XCN01248);
		}

		if (XCN01249 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01249(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01249(XCN01249);
		}

		if (XCN01250 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01250(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01250(XCN01250);
		}

		if (XCN01251 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01251(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01251(XCN01251);
		}

		if (XCN01252 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01252(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01252(XCN01252);
		}

		if (XCN01253 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01253(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01253(XCN01253);
		}

		if (XCN01254 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01254(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01254(XCN01254);
		}

		if (XCN01255 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01255(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01255(XCN01255);
		}

		if (XCN01256 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01256(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01256(XCN01256);
		}

		if (XCN01257 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01257(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01257(XCN01257);
		}

		if (XCN01258 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01258(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01258(XCN01258);
		}

		if (XCN01259 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01259(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01259(XCN01259);
		}

		if (XCN01260 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01260(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01260(XCN01260);
		}

		if (XCN01261 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01261(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01261(XCN01261);
		}

		if (XCN01262 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01262(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01262(XCN01262);
		}

		if (XCN01263 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01263(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01263(XCN01263);
		}

		if (XCN01264 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01264(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01264(XCN01264);
		}

		if (XCN01265 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01265(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01265(XCN01265);
		}

		if (XCN01266 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01266(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01266(XCN01266);
		}

		if (XCN01267 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01267(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01267(XCN01267);
		}

		if (XCN01268 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01268(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01268(XCN01268);
		}

		if (XCN01269 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01269(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01269(XCN01269);
		}

		if (XCN01270 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01270(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01270(XCN01270);
		}

		if (XCN01271 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01271(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01271(XCN01271);
		}

		if (XCN01272 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01272(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01272(XCN01272);
		}

		if (XCN01273 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01273(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01273(XCN01273);
		}

		if (XCN01274 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01274(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01274(XCN01274);
		}

		if (XCN01275 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01275(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01275(XCN01275);
		}

		if (XCN01276 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01276(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01276(XCN01276);
		}

		if (XCN01277 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01277(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01277(XCN01277);
		}

		if (XCN01278 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01278(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01278(XCN01278);
		}

		if (XCN01279 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01279(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01279(XCN01279);
		}

		if (XCN01280 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01280(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01280(XCN01280);
		}

		if (XCN01281 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01281(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01281(XCN01281);
		}

		if (XCN01282 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01282(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01282(XCN01282);
		}

		if (XCN01283 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01283(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01283(XCN01283);
		}

		if (XCN01284 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01284(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01284(XCN01284);
		}

		if (XCN01285 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01285(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01285(XCN01285);
		}

		if (XCN01286 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01286(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01286(XCN01286);
		}

		if (XCN01287 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01287(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01287(XCN01287);
		}

		if (XCN01288 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01288(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01288(XCN01288);
		}

		if (XCN01289 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01289(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01289(XCN01289);
		}

		if (XCN01290 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01290(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01290(XCN01290);
		}

		if (XCN01291 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01291(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01291(XCN01291);
		}

		if (XCN01292 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01292(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01292(XCN01292);
		}

		if (XCN01293 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01293(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01293(XCN01293);
		}

		if (XCN01294 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01294(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01294(XCN01294);
		}

		if (XCN01295 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01295(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01295(XCN01295);
		}

		if (XCN01296 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01296(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01296(XCN01296);
		}

		if (XCN01297 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01297(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01297(XCN01297);
		}

		if (XCN01298 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01298(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01298(XCN01298);
		}

		if (XCN01299 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01299(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01299(XCN01299);
		}

		if (XCN01300 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01300(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01300(XCN01300);
		}

		if (XCN01301 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01301(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01301(XCN01301);
		}

		if (XCN01302 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01302(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01302(XCN01302);
		}

		if (XCN01303 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01303(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01303(XCN01303);
		}

		if (XCN01304 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01304(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01304(XCN01304);
		}

		if (XCN01305 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01305(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01305(XCN01305);
		}

		if (XCN01306 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01306(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01306(XCN01306);
		}

		if (XCN01307 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01307(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01307(XCN01307);
		}

		if (XCN01308 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01308(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01308(XCN01308);
		}

		if (XCN01309 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01309(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01309(XCN01309);
		}

		if (XCN01310 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01310(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01310(XCN01310);
		}

		if (XCN01311 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01311(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01311(XCN01311);
		}

		if (XCN01312 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01312(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01312(XCN01312);
		}

		if (XCN01313 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01313(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01313(XCN01313);
		}

		if (XCN01314 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01314(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01314(XCN01314);
		}

		if (XCN01315 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01315(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01315(XCN01315);
		}

		if (XCN01316 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01316(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01316(XCN01316);
		}

		if (XCN01317 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01317(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01317(XCN01317);
		}

		if (XCN01318 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01318(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01318(XCN01318);
		}

		if (XCN01319 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01319(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01319(XCN01319);
		}

		if (XCN01320 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01320(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01320(XCN01320);
		}

		if (XCN01321 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01321(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01321(XCN01321);
		}

		if (XCN01322 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01322(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01322(XCN01322);
		}

		if (XCN01323 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01323(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01323(XCN01323);
		}

		if (XCN01324 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01324(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01324(XCN01324);
		}

		if (XCN01325 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01325(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01325(XCN01325);
		}

		if (XCN01326 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01326(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01326(XCN01326);
		}

		if (XCN01327 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01327(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01327(XCN01327);
		}

		if (XCN01328 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01328(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01328(XCN01328);
		}

		if (XCN01329 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01329(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01329(XCN01329);
		}

		if (XCN01330 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01330(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01330(XCN01330);
		}

		if (XCN01331 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01331(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01331(XCN01331);
		}

		if (XCN01332 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01332(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01332(XCN01332);
		}

		if (XCN01333 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01333(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01333(XCN01333);
		}

		if (XCN01334 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01334(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01334(XCN01334);
		}

		if (XCN01335 == null) {
			vrTechnicalSpec_XCNPart2Impl.setXCN01335(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setXCN01335(XCN01335);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCNPart2Impl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCNPart2Impl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XCNPart2Impl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XCNPart2Impl.resetOriginalValues();

		return vrTechnicalSpec_XCNPart2Impl;
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
		XCN01186 = objectInput.readUTF();
		XCN01187 = objectInput.readUTF();
		XCN01188 = objectInput.readUTF();
		XCN01189 = objectInput.readUTF();
		XCN01190 = objectInput.readUTF();
		XCN01191 = objectInput.readUTF();
		XCN01192 = objectInput.readUTF();
		XCN01193 = objectInput.readUTF();
		XCN01194 = objectInput.readUTF();
		XCN01195 = objectInput.readUTF();
		XCN01196 = objectInput.readUTF();
		XCN01197 = objectInput.readUTF();
		XCN01198 = objectInput.readUTF();
		XCN01199 = objectInput.readUTF();
		XCN01200 = objectInput.readUTF();
		XCN01201 = objectInput.readUTF();
		XCN01202 = objectInput.readUTF();
		XCN01203 = objectInput.readUTF();
		XCN01204 = objectInput.readUTF();
		XCN01205 = objectInput.readUTF();
		XCN01206 = objectInput.readUTF();
		XCN01207 = objectInput.readUTF();
		XCN01208 = objectInput.readUTF();
		XCN01209 = objectInput.readUTF();
		XCN01210 = objectInput.readUTF();
		XCN01211 = objectInput.readUTF();
		XCN01212 = objectInput.readUTF();
		XCN01213 = objectInput.readUTF();
		XCN01214 = objectInput.readUTF();
		XCN01215 = objectInput.readUTF();
		XCN01216 = objectInput.readUTF();
		XCN01217 = objectInput.readUTF();
		XCN01218 = objectInput.readUTF();
		XCN01219 = objectInput.readUTF();
		XCN01220 = objectInput.readUTF();
		XCN01221 = objectInput.readUTF();
		XCN01222 = objectInput.readUTF();
		XCN01223 = objectInput.readUTF();
		XCN01224 = objectInput.readUTF();
		XCN01225 = objectInput.readUTF();
		XCN01226 = objectInput.readUTF();
		XCN01227 = objectInput.readUTF();
		XCN01228 = objectInput.readUTF();
		XCN01229 = objectInput.readUTF();
		XCN01230 = objectInput.readUTF();
		XCN01231 = objectInput.readUTF();
		XCN01232 = objectInput.readUTF();
		XCN01233 = objectInput.readUTF();
		XCN01234 = objectInput.readUTF();
		XCN01235 = objectInput.readUTF();
		XCN01236 = objectInput.readUTF();
		XCN01237 = objectInput.readUTF();
		XCN01238 = objectInput.readUTF();
		XCN01239 = objectInput.readUTF();
		XCN01240 = objectInput.readUTF();
		XCN01241 = objectInput.readUTF();
		XCN01242 = objectInput.readUTF();
		XCN01243 = objectInput.readUTF();
		XCN01244 = objectInput.readUTF();
		XCN01245 = objectInput.readUTF();
		XCN01246 = objectInput.readUTF();
		XCN01247 = objectInput.readUTF();
		XCN01248 = objectInput.readUTF();
		XCN01249 = objectInput.readUTF();
		XCN01250 = objectInput.readUTF();
		XCN01251 = objectInput.readUTF();
		XCN01252 = objectInput.readUTF();
		XCN01253 = objectInput.readUTF();
		XCN01254 = objectInput.readUTF();
		XCN01255 = objectInput.readUTF();
		XCN01256 = objectInput.readUTF();
		XCN01257 = objectInput.readUTF();
		XCN01258 = objectInput.readUTF();
		XCN01259 = objectInput.readUTF();
		XCN01260 = objectInput.readUTF();
		XCN01261 = objectInput.readUTF();
		XCN01262 = objectInput.readUTF();
		XCN01263 = objectInput.readUTF();
		XCN01264 = objectInput.readUTF();
		XCN01265 = objectInput.readUTF();
		XCN01266 = objectInput.readUTF();
		XCN01267 = objectInput.readUTF();
		XCN01268 = objectInput.readUTF();
		XCN01269 = objectInput.readUTF();
		XCN01270 = objectInput.readUTF();
		XCN01271 = objectInput.readUTF();
		XCN01272 = objectInput.readUTF();
		XCN01273 = objectInput.readUTF();
		XCN01274 = objectInput.readUTF();
		XCN01275 = objectInput.readUTF();
		XCN01276 = objectInput.readUTF();
		XCN01277 = objectInput.readUTF();
		XCN01278 = objectInput.readUTF();
		XCN01279 = objectInput.readUTF();
		XCN01280 = objectInput.readUTF();
		XCN01281 = objectInput.readUTF();
		XCN01282 = objectInput.readUTF();
		XCN01283 = objectInput.readUTF();
		XCN01284 = objectInput.readUTF();
		XCN01285 = objectInput.readUTF();
		XCN01286 = objectInput.readUTF();
		XCN01287 = objectInput.readUTF();
		XCN01288 = objectInput.readUTF();
		XCN01289 = objectInput.readUTF();
		XCN01290 = objectInput.readUTF();
		XCN01291 = objectInput.readUTF();
		XCN01292 = objectInput.readUTF();
		XCN01293 = objectInput.readUTF();
		XCN01294 = objectInput.readUTF();
		XCN01295 = objectInput.readUTF();
		XCN01296 = objectInput.readUTF();
		XCN01297 = objectInput.readUTF();
		XCN01298 = objectInput.readUTF();
		XCN01299 = objectInput.readUTF();
		XCN01300 = objectInput.readUTF();
		XCN01301 = objectInput.readUTF();
		XCN01302 = objectInput.readUTF();
		XCN01303 = objectInput.readUTF();
		XCN01304 = objectInput.readUTF();
		XCN01305 = objectInput.readUTF();
		XCN01306 = objectInput.readUTF();
		XCN01307 = objectInput.readUTF();
		XCN01308 = objectInput.readUTF();
		XCN01309 = objectInput.readUTF();
		XCN01310 = objectInput.readUTF();
		XCN01311 = objectInput.readUTF();
		XCN01312 = objectInput.readUTF();
		XCN01313 = objectInput.readUTF();
		XCN01314 = objectInput.readUTF();
		XCN01315 = objectInput.readUTF();
		XCN01316 = objectInput.readUTF();
		XCN01317 = objectInput.readUTF();
		XCN01318 = objectInput.readUTF();
		XCN01319 = objectInput.readUTF();
		XCN01320 = objectInput.readUTF();
		XCN01321 = objectInput.readUTF();
		XCN01322 = objectInput.readUTF();
		XCN01323 = objectInput.readUTF();
		XCN01324 = objectInput.readUTF();
		XCN01325 = objectInput.readUTF();
		XCN01326 = objectInput.readUTF();
		XCN01327 = objectInput.readUTF();
		XCN01328 = objectInput.readUTF();
		XCN01329 = objectInput.readUTF();
		XCN01330 = objectInput.readUTF();
		XCN01331 = objectInput.readUTF();
		XCN01332 = objectInput.readUTF();
		XCN01333 = objectInput.readUTF();
		XCN01334 = objectInput.readUTF();
		XCN01335 = objectInput.readUTF();
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

		if (XCN01186 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01186);
		}

		if (XCN01187 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01187);
		}

		if (XCN01188 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01188);
		}

		if (XCN01189 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01189);
		}

		if (XCN01190 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01190);
		}

		if (XCN01191 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01191);
		}

		if (XCN01192 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01192);
		}

		if (XCN01193 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01193);
		}

		if (XCN01194 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01194);
		}

		if (XCN01195 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01195);
		}

		if (XCN01196 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01196);
		}

		if (XCN01197 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01197);
		}

		if (XCN01198 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01198);
		}

		if (XCN01199 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01199);
		}

		if (XCN01200 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01200);
		}

		if (XCN01201 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01201);
		}

		if (XCN01202 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01202);
		}

		if (XCN01203 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01203);
		}

		if (XCN01204 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01204);
		}

		if (XCN01205 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01205);
		}

		if (XCN01206 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01206);
		}

		if (XCN01207 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01207);
		}

		if (XCN01208 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01208);
		}

		if (XCN01209 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01209);
		}

		if (XCN01210 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01210);
		}

		if (XCN01211 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01211);
		}

		if (XCN01212 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01212);
		}

		if (XCN01213 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01213);
		}

		if (XCN01214 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01214);
		}

		if (XCN01215 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01215);
		}

		if (XCN01216 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01216);
		}

		if (XCN01217 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01217);
		}

		if (XCN01218 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01218);
		}

		if (XCN01219 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01219);
		}

		if (XCN01220 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01220);
		}

		if (XCN01221 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01221);
		}

		if (XCN01222 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01222);
		}

		if (XCN01223 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01223);
		}

		if (XCN01224 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01224);
		}

		if (XCN01225 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01225);
		}

		if (XCN01226 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01226);
		}

		if (XCN01227 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01227);
		}

		if (XCN01228 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01228);
		}

		if (XCN01229 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01229);
		}

		if (XCN01230 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01230);
		}

		if (XCN01231 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01231);
		}

		if (XCN01232 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01232);
		}

		if (XCN01233 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01233);
		}

		if (XCN01234 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01234);
		}

		if (XCN01235 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01235);
		}

		if (XCN01236 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01236);
		}

		if (XCN01237 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01237);
		}

		if (XCN01238 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01238);
		}

		if (XCN01239 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01239);
		}

		if (XCN01240 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01240);
		}

		if (XCN01241 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01241);
		}

		if (XCN01242 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01242);
		}

		if (XCN01243 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01243);
		}

		if (XCN01244 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01244);
		}

		if (XCN01245 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01245);
		}

		if (XCN01246 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01246);
		}

		if (XCN01247 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01247);
		}

		if (XCN01248 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01248);
		}

		if (XCN01249 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01249);
		}

		if (XCN01250 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01250);
		}

		if (XCN01251 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01251);
		}

		if (XCN01252 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01252);
		}

		if (XCN01253 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01253);
		}

		if (XCN01254 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01254);
		}

		if (XCN01255 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01255);
		}

		if (XCN01256 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01256);
		}

		if (XCN01257 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01257);
		}

		if (XCN01258 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01258);
		}

		if (XCN01259 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01259);
		}

		if (XCN01260 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01260);
		}

		if (XCN01261 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01261);
		}

		if (XCN01262 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01262);
		}

		if (XCN01263 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01263);
		}

		if (XCN01264 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01264);
		}

		if (XCN01265 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01265);
		}

		if (XCN01266 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01266);
		}

		if (XCN01267 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01267);
		}

		if (XCN01268 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01268);
		}

		if (XCN01269 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01269);
		}

		if (XCN01270 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01270);
		}

		if (XCN01271 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01271);
		}

		if (XCN01272 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01272);
		}

		if (XCN01273 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01273);
		}

		if (XCN01274 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01274);
		}

		if (XCN01275 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01275);
		}

		if (XCN01276 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01276);
		}

		if (XCN01277 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01277);
		}

		if (XCN01278 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01278);
		}

		if (XCN01279 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01279);
		}

		if (XCN01280 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01280);
		}

		if (XCN01281 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01281);
		}

		if (XCN01282 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01282);
		}

		if (XCN01283 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01283);
		}

		if (XCN01284 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01284);
		}

		if (XCN01285 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01285);
		}

		if (XCN01286 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01286);
		}

		if (XCN01287 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01287);
		}

		if (XCN01288 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01288);
		}

		if (XCN01289 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01289);
		}

		if (XCN01290 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01290);
		}

		if (XCN01291 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01291);
		}

		if (XCN01292 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01292);
		}

		if (XCN01293 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01293);
		}

		if (XCN01294 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01294);
		}

		if (XCN01295 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01295);
		}

		if (XCN01296 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01296);
		}

		if (XCN01297 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01297);
		}

		if (XCN01298 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01298);
		}

		if (XCN01299 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01299);
		}

		if (XCN01300 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01300);
		}

		if (XCN01301 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01301);
		}

		if (XCN01302 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01302);
		}

		if (XCN01303 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01303);
		}

		if (XCN01304 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01304);
		}

		if (XCN01305 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01305);
		}

		if (XCN01306 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01306);
		}

		if (XCN01307 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01307);
		}

		if (XCN01308 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01308);
		}

		if (XCN01309 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01309);
		}

		if (XCN01310 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01310);
		}

		if (XCN01311 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01311);
		}

		if (XCN01312 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01312);
		}

		if (XCN01313 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01313);
		}

		if (XCN01314 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01314);
		}

		if (XCN01315 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01315);
		}

		if (XCN01316 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01316);
		}

		if (XCN01317 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01317);
		}

		if (XCN01318 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01318);
		}

		if (XCN01319 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01319);
		}

		if (XCN01320 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01320);
		}

		if (XCN01321 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01321);
		}

		if (XCN01322 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01322);
		}

		if (XCN01323 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01323);
		}

		if (XCN01324 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01324);
		}

		if (XCN01325 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01325);
		}

		if (XCN01326 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01326);
		}

		if (XCN01327 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01327);
		}

		if (XCN01328 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01328);
		}

		if (XCN01329 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01329);
		}

		if (XCN01330 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01330);
		}

		if (XCN01331 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01331);
		}

		if (XCN01332 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01332);
		}

		if (XCN01333 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01333);
		}

		if (XCN01334 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01334);
		}

		if (XCN01335 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01335);
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
	public String XCN01186;
	public String XCN01187;
	public String XCN01188;
	public String XCN01189;
	public String XCN01190;
	public String XCN01191;
	public String XCN01192;
	public String XCN01193;
	public String XCN01194;
	public String XCN01195;
	public String XCN01196;
	public String XCN01197;
	public String XCN01198;
	public String XCN01199;
	public String XCN01200;
	public String XCN01201;
	public String XCN01202;
	public String XCN01203;
	public String XCN01204;
	public String XCN01205;
	public String XCN01206;
	public String XCN01207;
	public String XCN01208;
	public String XCN01209;
	public String XCN01210;
	public String XCN01211;
	public String XCN01212;
	public String XCN01213;
	public String XCN01214;
	public String XCN01215;
	public String XCN01216;
	public String XCN01217;
	public String XCN01218;
	public String XCN01219;
	public String XCN01220;
	public String XCN01221;
	public String XCN01222;
	public String XCN01223;
	public String XCN01224;
	public String XCN01225;
	public String XCN01226;
	public String XCN01227;
	public String XCN01228;
	public String XCN01229;
	public String XCN01230;
	public String XCN01231;
	public String XCN01232;
	public String XCN01233;
	public String XCN01234;
	public String XCN01235;
	public String XCN01236;
	public String XCN01237;
	public String XCN01238;
	public String XCN01239;
	public String XCN01240;
	public String XCN01241;
	public String XCN01242;
	public String XCN01243;
	public String XCN01244;
	public String XCN01245;
	public String XCN01246;
	public String XCN01247;
	public String XCN01248;
	public String XCN01249;
	public String XCN01250;
	public String XCN01251;
	public String XCN01252;
	public String XCN01253;
	public String XCN01254;
	public String XCN01255;
	public String XCN01256;
	public String XCN01257;
	public String XCN01258;
	public String XCN01259;
	public String XCN01260;
	public String XCN01261;
	public String XCN01262;
	public String XCN01263;
	public String XCN01264;
	public String XCN01265;
	public String XCN01266;
	public String XCN01267;
	public String XCN01268;
	public String XCN01269;
	public String XCN01270;
	public String XCN01271;
	public String XCN01272;
	public String XCN01273;
	public String XCN01274;
	public String XCN01275;
	public String XCN01276;
	public String XCN01277;
	public String XCN01278;
	public String XCN01279;
	public String XCN01280;
	public String XCN01281;
	public String XCN01282;
	public String XCN01283;
	public String XCN01284;
	public String XCN01285;
	public String XCN01286;
	public String XCN01287;
	public String XCN01288;
	public String XCN01289;
	public String XCN01290;
	public String XCN01291;
	public String XCN01292;
	public String XCN01293;
	public String XCN01294;
	public String XCN01295;
	public String XCN01296;
	public String XCN01297;
	public String XCN01298;
	public String XCN01299;
	public String XCN01300;
	public String XCN01301;
	public String XCN01302;
	public String XCN01303;
	public String XCN01304;
	public String XCN01305;
	public String XCN01306;
	public String XCN01307;
	public String XCN01308;
	public String XCN01309;
	public String XCN01310;
	public String XCN01311;
	public String XCN01312;
	public String XCN01313;
	public String XCN01314;
	public String XCN01315;
	public String XCN01316;
	public String XCN01317;
	public String XCN01318;
	public String XCN01319;
	public String XCN01320;
	public String XCN01321;
	public String XCN01322;
	public String XCN01323;
	public String XCN01324;
	public String XCN01325;
	public String XCN01326;
	public String XCN01327;
	public String XCN01328;
	public String XCN01329;
	public String XCN01330;
	public String XCN01331;
	public String XCN01332;
	public String XCN01333;
	public String XCN01334;
	public String XCN01335;
	public long modifyDate;
	public long syncDate;
}