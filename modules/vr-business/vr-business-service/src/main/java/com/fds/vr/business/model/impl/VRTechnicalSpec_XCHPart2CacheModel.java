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

import com.fds.vr.business.model.VRTechnicalSpec_XCHPart2;

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
 * The cache model class for representing VRTechnicalSpec_XCHPart2 in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCHPart2
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCHPart2CacheModel implements CacheModel<VRTechnicalSpec_XCHPart2>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCHPart2CacheModel)) {
			return false;
		}

		VRTechnicalSpec_XCHPart2CacheModel vrTechnicalSpec_XCHPart2CacheModel = (VRTechnicalSpec_XCHPart2CacheModel)obj;

		if (id == vrTechnicalSpec_XCHPart2CacheModel.id) {
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
		StringBundler sb = new StringBundler(441);

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
		sb.append(", XCH01273=");
		sb.append(XCH01273);
		sb.append(", XCH01274=");
		sb.append(XCH01274);
		sb.append(", XCH01275=");
		sb.append(XCH01275);
		sb.append(", XCH01276=");
		sb.append(XCH01276);
		sb.append(", XCH01277=");
		sb.append(XCH01277);
		sb.append(", XCH01278=");
		sb.append(XCH01278);
		sb.append(", XCH01279=");
		sb.append(XCH01279);
		sb.append(", XCH01280=");
		sb.append(XCH01280);
		sb.append(", XCH01281=");
		sb.append(XCH01281);
		sb.append(", XCH01282=");
		sb.append(XCH01282);
		sb.append(", XCH01283=");
		sb.append(XCH01283);
		sb.append(", XCH01284=");
		sb.append(XCH01284);
		sb.append(", XCH01285=");
		sb.append(XCH01285);
		sb.append(", XCH01286=");
		sb.append(XCH01286);
		sb.append(", XCH01287=");
		sb.append(XCH01287);
		sb.append(", XCH01288=");
		sb.append(XCH01288);
		sb.append(", XCH01289=");
		sb.append(XCH01289);
		sb.append(", XCH01290=");
		sb.append(XCH01290);
		sb.append(", XCH01291=");
		sb.append(XCH01291);
		sb.append(", XCH01292=");
		sb.append(XCH01292);
		sb.append(", XCH01293=");
		sb.append(XCH01293);
		sb.append(", XCH01294=");
		sb.append(XCH01294);
		sb.append(", XCH01295=");
		sb.append(XCH01295);
		sb.append(", XCH01296=");
		sb.append(XCH01296);
		sb.append(", XCH01297=");
		sb.append(XCH01297);
		sb.append(", XCH01298=");
		sb.append(XCH01298);
		sb.append(", XCH01299=");
		sb.append(XCH01299);
		sb.append(", XCH01300=");
		sb.append(XCH01300);
		sb.append(", XCH01301=");
		sb.append(XCH01301);
		sb.append(", XCH01302=");
		sb.append(XCH01302);
		sb.append(", XCH01303=");
		sb.append(XCH01303);
		sb.append(", XCH01304=");
		sb.append(XCH01304);
		sb.append(", XCH01305=");
		sb.append(XCH01305);
		sb.append(", XCH01306=");
		sb.append(XCH01306);
		sb.append(", XCH01307=");
		sb.append(XCH01307);
		sb.append(", XCH01308=");
		sb.append(XCH01308);
		sb.append(", XCH01309=");
		sb.append(XCH01309);
		sb.append(", XCH01310=");
		sb.append(XCH01310);
		sb.append(", XCH01311=");
		sb.append(XCH01311);
		sb.append(", XCH01312=");
		sb.append(XCH01312);
		sb.append(", XCH01313=");
		sb.append(XCH01313);
		sb.append(", XCH01314=");
		sb.append(XCH01314);
		sb.append(", XCH01315=");
		sb.append(XCH01315);
		sb.append(", XCH01316=");
		sb.append(XCH01316);
		sb.append(", XCH01317=");
		sb.append(XCH01317);
		sb.append(", XCH01318=");
		sb.append(XCH01318);
		sb.append(", XCH01319=");
		sb.append(XCH01319);
		sb.append(", XCH01320=");
		sb.append(XCH01320);
		sb.append(", XCH01321=");
		sb.append(XCH01321);
		sb.append(", XCH01322=");
		sb.append(XCH01322);
		sb.append(", XCH01323=");
		sb.append(XCH01323);
		sb.append(", XCH01324=");
		sb.append(XCH01324);
		sb.append(", XCH01325=");
		sb.append(XCH01325);
		sb.append(", XCH01326=");
		sb.append(XCH01326);
		sb.append(", XCH01327=");
		sb.append(XCH01327);
		sb.append(", XCH01328=");
		sb.append(XCH01328);
		sb.append(", XCH01329=");
		sb.append(XCH01329);
		sb.append(", XCH01330=");
		sb.append(XCH01330);
		sb.append(", XCH01331=");
		sb.append(XCH01331);
		sb.append(", XCH01332=");
		sb.append(XCH01332);
		sb.append(", XCH01333=");
		sb.append(XCH01333);
		sb.append(", XCH01334=");
		sb.append(XCH01334);
		sb.append(", XCH01335=");
		sb.append(XCH01335);
		sb.append(", XCH01336=");
		sb.append(XCH01336);
		sb.append(", XCH01337=");
		sb.append(XCH01337);
		sb.append(", XCH01338=");
		sb.append(XCH01338);
		sb.append(", XCH01339=");
		sb.append(XCH01339);
		sb.append(", XCH01340=");
		sb.append(XCH01340);
		sb.append(", XCH01341=");
		sb.append(XCH01341);
		sb.append(", XCH01342=");
		sb.append(XCH01342);
		sb.append(", XCH01343=");
		sb.append(XCH01343);
		sb.append(", XCH01344=");
		sb.append(XCH01344);
		sb.append(", XCH01345=");
		sb.append(XCH01345);
		sb.append(", XCH01346=");
		sb.append(XCH01346);
		sb.append(", XCH01347=");
		sb.append(XCH01347);
		sb.append(", XCH01348=");
		sb.append(XCH01348);
		sb.append(", XCH01349=");
		sb.append(XCH01349);
		sb.append(", XCH01350=");
		sb.append(XCH01350);
		sb.append(", XCH01351=");
		sb.append(XCH01351);
		sb.append(", XCH01352=");
		sb.append(XCH01352);
		sb.append(", XCH01353=");
		sb.append(XCH01353);
		sb.append(", XCH01354=");
		sb.append(XCH01354);
		sb.append(", XCH01355=");
		sb.append(XCH01355);
		sb.append(", XCH01356=");
		sb.append(XCH01356);
		sb.append(", XCH01357=");
		sb.append(XCH01357);
		sb.append(", XCH01358=");
		sb.append(XCH01358);
		sb.append(", XCH01359=");
		sb.append(XCH01359);
		sb.append(", XCH01360=");
		sb.append(XCH01360);
		sb.append(", XCH01361=");
		sb.append(XCH01361);
		sb.append(", XCH01362=");
		sb.append(XCH01362);
		sb.append(", XCH01363=");
		sb.append(XCH01363);
		sb.append(", XCH01364=");
		sb.append(XCH01364);
		sb.append(", XCH01365=");
		sb.append(XCH01365);
		sb.append(", XCH01366=");
		sb.append(XCH01366);
		sb.append(", XCH01367=");
		sb.append(XCH01367);
		sb.append(", XCH01368=");
		sb.append(XCH01368);
		sb.append(", XCH01369=");
		sb.append(XCH01369);
		sb.append(", XCH01370=");
		sb.append(XCH01370);
		sb.append(", XCH01371=");
		sb.append(XCH01371);
		sb.append(", XCH01372=");
		sb.append(XCH01372);
		sb.append(", XCH01373=");
		sb.append(XCH01373);
		sb.append(", XCH01374=");
		sb.append(XCH01374);
		sb.append(", XCH01375=");
		sb.append(XCH01375);
		sb.append(", XCH01376=");
		sb.append(XCH01376);
		sb.append(", XCH01377=");
		sb.append(XCH01377);
		sb.append(", XCH01378=");
		sb.append(XCH01378);
		sb.append(", XCH01379=");
		sb.append(XCH01379);
		sb.append(", XCH01380=");
		sb.append(XCH01380);
		sb.append(", XCH01381=");
		sb.append(XCH01381);
		sb.append(", XCH01382=");
		sb.append(XCH01382);
		sb.append(", XCH01383=");
		sb.append(XCH01383);
		sb.append(", XCH01384=");
		sb.append(XCH01384);
		sb.append(", XCH01385=");
		sb.append(XCH01385);
		sb.append(", XCH01386=");
		sb.append(XCH01386);
		sb.append(", XCH01387=");
		sb.append(XCH01387);
		sb.append(", XCH01388=");
		sb.append(XCH01388);
		sb.append(", XCH01389=");
		sb.append(XCH01389);
		sb.append(", XCH01390=");
		sb.append(XCH01390);
		sb.append(", XCH01391=");
		sb.append(XCH01391);
		sb.append(", XCH01392=");
		sb.append(XCH01392);
		sb.append(", XCH01393=");
		sb.append(XCH01393);
		sb.append(", XCH01394=");
		sb.append(XCH01394);
		sb.append(", XCH01395=");
		sb.append(XCH01395);
		sb.append(", XCH01396=");
		sb.append(XCH01396);
		sb.append(", XCH01397=");
		sb.append(XCH01397);
		sb.append(", XCH01398=");
		sb.append(XCH01398);
		sb.append(", XCH01399=");
		sb.append(XCH01399);
		sb.append(", XCH01400=");
		sb.append(XCH01400);
		sb.append(", XCH01401=");
		sb.append(XCH01401);
		sb.append(", XCH01402=");
		sb.append(XCH01402);
		sb.append(", XCH01403=");
		sb.append(XCH01403);
		sb.append(", XCH01404=");
		sb.append(XCH01404);
		sb.append(", XCH01405=");
		sb.append(XCH01405);
		sb.append(", XCH01406=");
		sb.append(XCH01406);
		sb.append(", XCH01407=");
		sb.append(XCH01407);
		sb.append(", XCH01408=");
		sb.append(XCH01408);
		sb.append(", XCH01409=");
		sb.append(XCH01409);
		sb.append(", XCH01410=");
		sb.append(XCH01410);
		sb.append(", XCH01411=");
		sb.append(XCH01411);
		sb.append(", XCH01412=");
		sb.append(XCH01412);
		sb.append(", XCH01413=");
		sb.append(XCH01413);
		sb.append(", XCH01414=");
		sb.append(XCH01414);
		sb.append(", XCH01415=");
		sb.append(XCH01415);
		sb.append(", XCH01416=");
		sb.append(XCH01416);
		sb.append(", XCH01417=");
		sb.append(XCH01417);
		sb.append(", XCH01418=");
		sb.append(XCH01418);
		sb.append(", XCH01419=");
		sb.append(XCH01419);
		sb.append(", XCH01420=");
		sb.append(XCH01420);
		sb.append(", XCH01421=");
		sb.append(XCH01421);
		sb.append(", XCH01422=");
		sb.append(XCH01422);
		sb.append(", XCH01423=");
		sb.append(XCH01423);
		sb.append(", XCH01424=");
		sb.append(XCH01424);
		sb.append(", XCH01425=");
		sb.append(XCH01425);
		sb.append(", XCH01426=");
		sb.append(XCH01426);
		sb.append(", XCH01427=");
		sb.append(XCH01427);
		sb.append(", XCH01428=");
		sb.append(XCH01428);
		sb.append(", XCH01429=");
		sb.append(XCH01429);
		sb.append(", XCH01430=");
		sb.append(XCH01430);
		sb.append(", XCH01431=");
		sb.append(XCH01431);
		sb.append(", XCH01432=");
		sb.append(XCH01432);
		sb.append(", XCH01433=");
		sb.append(XCH01433);
		sb.append(", XCH01434=");
		sb.append(XCH01434);
		sb.append(", XCH01435=");
		sb.append(XCH01435);
		sb.append(", XCH01436=");
		sb.append(XCH01436);
		sb.append(", XCH01437=");
		sb.append(XCH01437);
		sb.append(", XCH01438=");
		sb.append(XCH01438);
		sb.append(", XCH01439=");
		sb.append(XCH01439);
		sb.append(", XCH01440=");
		sb.append(XCH01440);
		sb.append(", XCH01441=");
		sb.append(XCH01441);
		sb.append(", XCH01442=");
		sb.append(XCH01442);
		sb.append(", XCH01443=");
		sb.append(XCH01443);
		sb.append(", XCH01444=");
		sb.append(XCH01444);
		sb.append(", XCH01445=");
		sb.append(XCH01445);
		sb.append(", BBCNCLKLXCH001=");
		sb.append(BBCNCLKLXCH001);
		sb.append(", BBCNCLKLXCH002=");
		sb.append(BBCNCLKLXCH002);
		sb.append(", BBCNCLKLXCH003=");
		sb.append(BBCNCLKLXCH003);
		sb.append(", BBCNCLKLXCH004=");
		sb.append(BBCNCLKLXCH004);
		sb.append(", BBCNCLKLXCH005=");
		sb.append(BBCNCLKLXCH005);
		sb.append(", BBCNCLKLXCH006=");
		sb.append(BBCNCLKLXCH006);
		sb.append(", BBCNCLKLXCH012=");
		sb.append(BBCNCLKLXCH012);
		sb.append(", BBCNCLKLXCH013=");
		sb.append(BBCNCLKLXCH013);
		sb.append(", BBCNCLKLXCH014=");
		sb.append(BBCNCLKLXCH014);
		sb.append(", BBCNCLKLXCH015=");
		sb.append(BBCNCLKLXCH015);
		sb.append(", BBCNCLKLXCH016=");
		sb.append(BBCNCLKLXCH016);
		sb.append(", BBCNCLKLXCH017=");
		sb.append(BBCNCLKLXCH017);
		sb.append(", BBCNCLKLXCH018=");
		sb.append(BBCNCLKLXCH018);
		sb.append(", BBCNCLKLXCH019=");
		sb.append(BBCNCLKLXCH019);
		sb.append(", BBCNCLKLXCH020=");
		sb.append(BBCNCLKLXCH020);
		sb.append(", BBCNCLKLXCH021=");
		sb.append(BBCNCLKLXCH021);
		sb.append(", BBCNCLKLXCH022=");
		sb.append(BBCNCLKLXCH022);
		sb.append(", BBCNCLKLXCH023=");
		sb.append(BBCNCLKLXCH023);
		sb.append(", BBCNCLKLXCH026=");
		sb.append(BBCNCLKLXCH026);
		sb.append(", BBCNCLKLXCH027=");
		sb.append(BBCNCLKLXCH027);
		sb.append(", BBCNCLKLXCH028=");
		sb.append(BBCNCLKLXCH028);
		sb.append(", BBCNCLKLXCH033=");
		sb.append(BBCNCLKLXCH033);
		sb.append(", BBCNCLKLXCH034=");
		sb.append(BBCNCLKLXCH034);
		sb.append(", BBCNCLKLXCH037=");
		sb.append(BBCNCLKLXCH037);
		sb.append(", BBCNCLKLXCH038=");
		sb.append(BBCNCLKLXCH038);
		sb.append(", BBCNCLKLXCH039=");
		sb.append(BBCNCLKLXCH039);
		sb.append(", BBCNCLKLXCH040=");
		sb.append(BBCNCLKLXCH040);
		sb.append(", BBCNCLKLXCH041=");
		sb.append(BBCNCLKLXCH041);
		sb.append(", BBCNCLKLXCH042=");
		sb.append(BBCNCLKLXCH042);
		sb.append(", BBCNCLKLXCH043=");
		sb.append(BBCNCLKLXCH043);
		sb.append(", BBCNCLKLXCH044=");
		sb.append(BBCNCLKLXCH044);
		sb.append(", BBCNCLKLXCH045=");
		sb.append(BBCNCLKLXCH045);
		sb.append(", BBCNCLKLXCH046=");
		sb.append(BBCNCLKLXCH046);
		sb.append(", BBCNCLKLXCH047=");
		sb.append(BBCNCLKLXCH047);
		sb.append(", BBCNCLKLXCH053=");
		sb.append(BBCNCLKLXCH053);
		sb.append(", BBCNCLKLXCH054=");
		sb.append(BBCNCLKLXCH054);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XCHPart2 toEntityModel() {
		VRTechnicalSpec_XCHPart2Impl vrTechnicalSpec_XCHPart2Impl = new VRTechnicalSpec_XCHPart2Impl();

		vrTechnicalSpec_XCHPart2Impl.setId(id);
		vrTechnicalSpec_XCHPart2Impl.setMtCore(mtCore);
		vrTechnicalSpec_XCHPart2Impl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XCHPart2Impl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XCHPart2Impl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XCHPart2Impl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XCHPart2Impl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XCHPart2Impl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XCHPart2Impl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XCH01273 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01273(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01273(XCH01273);
		}

		if (XCH01274 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01274(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01274(XCH01274);
		}

		if (XCH01275 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01275(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01275(XCH01275);
		}

		if (XCH01276 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01276(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01276(XCH01276);
		}

		if (XCH01277 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01277(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01277(XCH01277);
		}

		if (XCH01278 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01278(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01278(XCH01278);
		}

		if (XCH01279 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01279(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01279(XCH01279);
		}

		if (XCH01280 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01280(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01280(XCH01280);
		}

		if (XCH01281 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01281(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01281(XCH01281);
		}

		if (XCH01282 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01282(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01282(XCH01282);
		}

		if (XCH01283 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01283(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01283(XCH01283);
		}

		if (XCH01284 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01284(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01284(XCH01284);
		}

		if (XCH01285 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01285(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01285(XCH01285);
		}

		if (XCH01286 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01286(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01286(XCH01286);
		}

		if (XCH01287 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01287(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01287(XCH01287);
		}

		if (XCH01288 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01288(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01288(XCH01288);
		}

		if (XCH01289 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01289(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01289(XCH01289);
		}

		if (XCH01290 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01290(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01290(XCH01290);
		}

		if (XCH01291 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01291(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01291(XCH01291);
		}

		if (XCH01292 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01292(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01292(XCH01292);
		}

		if (XCH01293 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01293(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01293(XCH01293);
		}

		if (XCH01294 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01294(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01294(XCH01294);
		}

		if (XCH01295 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01295(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01295(XCH01295);
		}

		if (XCH01296 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01296(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01296(XCH01296);
		}

		if (XCH01297 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01297(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01297(XCH01297);
		}

		if (XCH01298 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01298(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01298(XCH01298);
		}

		if (XCH01299 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01299(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01299(XCH01299);
		}

		if (XCH01300 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01300(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01300(XCH01300);
		}

		if (XCH01301 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01301(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01301(XCH01301);
		}

		if (XCH01302 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01302(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01302(XCH01302);
		}

		if (XCH01303 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01303(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01303(XCH01303);
		}

		if (XCH01304 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01304(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01304(XCH01304);
		}

		if (XCH01305 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01305(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01305(XCH01305);
		}

		if (XCH01306 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01306(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01306(XCH01306);
		}

		if (XCH01307 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01307(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01307(XCH01307);
		}

		if (XCH01308 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01308(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01308(XCH01308);
		}

		if (XCH01309 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01309(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01309(XCH01309);
		}

		if (XCH01310 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01310(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01310(XCH01310);
		}

		if (XCH01311 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01311(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01311(XCH01311);
		}

		if (XCH01312 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01312(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01312(XCH01312);
		}

		if (XCH01313 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01313(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01313(XCH01313);
		}

		if (XCH01314 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01314(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01314(XCH01314);
		}

		if (XCH01315 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01315(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01315(XCH01315);
		}

		if (XCH01316 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01316(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01316(XCH01316);
		}

		if (XCH01317 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01317(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01317(XCH01317);
		}

		if (XCH01318 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01318(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01318(XCH01318);
		}

		if (XCH01319 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01319(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01319(XCH01319);
		}

		if (XCH01320 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01320(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01320(XCH01320);
		}

		if (XCH01321 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01321(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01321(XCH01321);
		}

		if (XCH01322 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01322(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01322(XCH01322);
		}

		if (XCH01323 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01323(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01323(XCH01323);
		}

		if (XCH01324 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01324(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01324(XCH01324);
		}

		if (XCH01325 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01325(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01325(XCH01325);
		}

		if (XCH01326 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01326(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01326(XCH01326);
		}

		if (XCH01327 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01327(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01327(XCH01327);
		}

		if (XCH01328 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01328(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01328(XCH01328);
		}

		if (XCH01329 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01329(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01329(XCH01329);
		}

		if (XCH01330 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01330(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01330(XCH01330);
		}

		if (XCH01331 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01331(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01331(XCH01331);
		}

		if (XCH01332 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01332(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01332(XCH01332);
		}

		if (XCH01333 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01333(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01333(XCH01333);
		}

		if (XCH01334 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01334(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01334(XCH01334);
		}

		if (XCH01335 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01335(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01335(XCH01335);
		}

		if (XCH01336 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01336(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01336(XCH01336);
		}

		if (XCH01337 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01337(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01337(XCH01337);
		}

		if (XCH01338 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01338(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01338(XCH01338);
		}

		if (XCH01339 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01339(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01339(XCH01339);
		}

		if (XCH01340 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01340(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01340(XCH01340);
		}

		if (XCH01341 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01341(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01341(XCH01341);
		}

		if (XCH01342 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01342(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01342(XCH01342);
		}

		if (XCH01343 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01343(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01343(XCH01343);
		}

		if (XCH01344 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01344(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01344(XCH01344);
		}

		if (XCH01345 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01345(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01345(XCH01345);
		}

		if (XCH01346 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01346(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01346(XCH01346);
		}

		if (XCH01347 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01347(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01347(XCH01347);
		}

		if (XCH01348 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01348(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01348(XCH01348);
		}

		if (XCH01349 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01349(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01349(XCH01349);
		}

		if (XCH01350 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01350(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01350(XCH01350);
		}

		if (XCH01351 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01351(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01351(XCH01351);
		}

		if (XCH01352 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01352(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01352(XCH01352);
		}

		if (XCH01353 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01353(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01353(XCH01353);
		}

		if (XCH01354 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01354(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01354(XCH01354);
		}

		if (XCH01355 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01355(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01355(XCH01355);
		}

		if (XCH01356 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01356(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01356(XCH01356);
		}

		if (XCH01357 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01357(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01357(XCH01357);
		}

		if (XCH01358 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01358(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01358(XCH01358);
		}

		if (XCH01359 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01359(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01359(XCH01359);
		}

		if (XCH01360 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01360(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01360(XCH01360);
		}

		if (XCH01361 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01361(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01361(XCH01361);
		}

		if (XCH01362 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01362(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01362(XCH01362);
		}

		if (XCH01363 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01363(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01363(XCH01363);
		}

		if (XCH01364 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01364(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01364(XCH01364);
		}

		if (XCH01365 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01365(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01365(XCH01365);
		}

		if (XCH01366 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01366(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01366(XCH01366);
		}

		if (XCH01367 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01367(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01367(XCH01367);
		}

		if (XCH01368 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01368(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01368(XCH01368);
		}

		if (XCH01369 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01369(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01369(XCH01369);
		}

		if (XCH01370 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01370(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01370(XCH01370);
		}

		if (XCH01371 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01371(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01371(XCH01371);
		}

		if (XCH01372 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01372(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01372(XCH01372);
		}

		if (XCH01373 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01373(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01373(XCH01373);
		}

		if (XCH01374 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01374(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01374(XCH01374);
		}

		if (XCH01375 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01375(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01375(XCH01375);
		}

		if (XCH01376 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01376(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01376(XCH01376);
		}

		if (XCH01377 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01377(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01377(XCH01377);
		}

		if (XCH01378 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01378(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01378(XCH01378);
		}

		if (XCH01379 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01379(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01379(XCH01379);
		}

		if (XCH01380 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01380(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01380(XCH01380);
		}

		if (XCH01381 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01381(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01381(XCH01381);
		}

		if (XCH01382 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01382(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01382(XCH01382);
		}

		if (XCH01383 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01383(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01383(XCH01383);
		}

		if (XCH01384 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01384(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01384(XCH01384);
		}

		if (XCH01385 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01385(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01385(XCH01385);
		}

		if (XCH01386 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01386(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01386(XCH01386);
		}

		if (XCH01387 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01387(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01387(XCH01387);
		}

		if (XCH01388 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01388(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01388(XCH01388);
		}

		if (XCH01389 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01389(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01389(XCH01389);
		}

		if (XCH01390 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01390(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01390(XCH01390);
		}

		if (XCH01391 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01391(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01391(XCH01391);
		}

		if (XCH01392 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01392(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01392(XCH01392);
		}

		if (XCH01393 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01393(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01393(XCH01393);
		}

		if (XCH01394 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01394(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01394(XCH01394);
		}

		if (XCH01395 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01395(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01395(XCH01395);
		}

		if (XCH01396 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01396(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01396(XCH01396);
		}

		if (XCH01397 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01397(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01397(XCH01397);
		}

		if (XCH01398 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01398(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01398(XCH01398);
		}

		if (XCH01399 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01399(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01399(XCH01399);
		}

		if (XCH01400 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01400(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01400(XCH01400);
		}

		if (XCH01401 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01401(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01401(XCH01401);
		}

		if (XCH01402 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01402(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01402(XCH01402);
		}

		if (XCH01403 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01403(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01403(XCH01403);
		}

		if (XCH01404 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01404(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01404(XCH01404);
		}

		if (XCH01405 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01405(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01405(XCH01405);
		}

		if (XCH01406 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01406(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01406(XCH01406);
		}

		if (XCH01407 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01407(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01407(XCH01407);
		}

		if (XCH01408 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01408(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01408(XCH01408);
		}

		if (XCH01409 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01409(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01409(XCH01409);
		}

		if (XCH01410 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01410(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01410(XCH01410);
		}

		if (XCH01411 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01411(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01411(XCH01411);
		}

		if (XCH01412 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01412(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01412(XCH01412);
		}

		if (XCH01413 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01413(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01413(XCH01413);
		}

		if (XCH01414 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01414(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01414(XCH01414);
		}

		if (XCH01415 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01415(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01415(XCH01415);
		}

		if (XCH01416 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01416(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01416(XCH01416);
		}

		if (XCH01417 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01417(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01417(XCH01417);
		}

		if (XCH01418 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01418(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01418(XCH01418);
		}

		if (XCH01419 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01419(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01419(XCH01419);
		}

		if (XCH01420 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01420(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01420(XCH01420);
		}

		if (XCH01421 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01421(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01421(XCH01421);
		}

		if (XCH01422 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01422(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01422(XCH01422);
		}

		if (XCH01423 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01423(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01423(XCH01423);
		}

		if (XCH01424 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01424(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01424(XCH01424);
		}

		if (XCH01425 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01425(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01425(XCH01425);
		}

		if (XCH01426 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01426(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01426(XCH01426);
		}

		if (XCH01427 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01427(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01427(XCH01427);
		}

		if (XCH01428 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01428(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01428(XCH01428);
		}

		if (XCH01429 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01429(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01429(XCH01429);
		}

		if (XCH01430 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01430(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01430(XCH01430);
		}

		if (XCH01431 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01431(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01431(XCH01431);
		}

		if (XCH01432 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01432(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01432(XCH01432);
		}

		if (XCH01433 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01433(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01433(XCH01433);
		}

		if (XCH01434 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01434(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01434(XCH01434);
		}

		if (XCH01435 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01435(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01435(XCH01435);
		}

		if (XCH01436 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01436(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01436(XCH01436);
		}

		if (XCH01437 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01437(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01437(XCH01437);
		}

		if (XCH01438 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01438(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01438(XCH01438);
		}

		if (XCH01439 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01439(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01439(XCH01439);
		}

		if (XCH01440 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01440(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01440(XCH01440);
		}

		if (XCH01441 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01441(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01441(XCH01441);
		}

		if (XCH01442 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01442(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01442(XCH01442);
		}

		if (XCH01443 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01443(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01443(XCH01443);
		}

		if (XCH01444 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01444(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01444(XCH01444);
		}

		if (XCH01445 == null) {
			vrTechnicalSpec_XCHPart2Impl.setXCH01445(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setXCH01445(XCH01445);
		}

		if (BBCNCLKLXCH001 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH001(BBCNCLKLXCH001);
		}

		if (BBCNCLKLXCH002 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH002(BBCNCLKLXCH002);
		}

		if (BBCNCLKLXCH003 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH003(BBCNCLKLXCH003);
		}

		if (BBCNCLKLXCH004 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH004(BBCNCLKLXCH004);
		}

		if (BBCNCLKLXCH005 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH005(BBCNCLKLXCH005);
		}

		if (BBCNCLKLXCH006 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH006(BBCNCLKLXCH006);
		}

		if (BBCNCLKLXCH012 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH012(BBCNCLKLXCH012);
		}

		if (BBCNCLKLXCH013 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH013(BBCNCLKLXCH013);
		}

		if (BBCNCLKLXCH014 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH014(BBCNCLKLXCH014);
		}

		if (BBCNCLKLXCH015 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH015(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH015(BBCNCLKLXCH015);
		}

		if (BBCNCLKLXCH016 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH016(BBCNCLKLXCH016);
		}

		if (BBCNCLKLXCH017 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH017(BBCNCLKLXCH017);
		}

		if (BBCNCLKLXCH018 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH018(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH018(BBCNCLKLXCH018);
		}

		if (BBCNCLKLXCH019 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH019(BBCNCLKLXCH019);
		}

		if (BBCNCLKLXCH020 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH020(BBCNCLKLXCH020);
		}

		if (BBCNCLKLXCH021 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH021(BBCNCLKLXCH021);
		}

		if (BBCNCLKLXCH022 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH022(BBCNCLKLXCH022);
		}

		if (BBCNCLKLXCH023 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH023(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH023(BBCNCLKLXCH023);
		}

		if (BBCNCLKLXCH026 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH026(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH026(BBCNCLKLXCH026);
		}

		if (BBCNCLKLXCH027 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH027(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH027(BBCNCLKLXCH027);
		}

		if (BBCNCLKLXCH028 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH028(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH028(BBCNCLKLXCH028);
		}

		if (BBCNCLKLXCH033 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH033(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH033(BBCNCLKLXCH033);
		}

		if (BBCNCLKLXCH034 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH034(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH034(BBCNCLKLXCH034);
		}

		if (BBCNCLKLXCH037 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH037(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH037(BBCNCLKLXCH037);
		}

		if (BBCNCLKLXCH038 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH038(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH038(BBCNCLKLXCH038);
		}

		if (BBCNCLKLXCH039 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH039(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH039(BBCNCLKLXCH039);
		}

		if (BBCNCLKLXCH040 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH040(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH040(BBCNCLKLXCH040);
		}

		if (BBCNCLKLXCH041 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH041(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH041(BBCNCLKLXCH041);
		}

		if (BBCNCLKLXCH042 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH042(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH042(BBCNCLKLXCH042);
		}

		if (BBCNCLKLXCH043 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH043(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH043(BBCNCLKLXCH043);
		}

		if (BBCNCLKLXCH044 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH044(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH044(BBCNCLKLXCH044);
		}

		if (BBCNCLKLXCH045 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH045(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH045(BBCNCLKLXCH045);
		}

		if (BBCNCLKLXCH046 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH046(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH046(BBCNCLKLXCH046);
		}

		if (BBCNCLKLXCH047 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH047(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH047(BBCNCLKLXCH047);
		}

		if (BBCNCLKLXCH053 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH053(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH053(BBCNCLKLXCH053);
		}

		if (BBCNCLKLXCH054 == null) {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH054(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH054(BBCNCLKLXCH054);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCHPart2Impl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCHPart2Impl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XCHPart2Impl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XCHPart2Impl.resetOriginalValues();

		return vrTechnicalSpec_XCHPart2Impl;
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
		XCH01273 = objectInput.readUTF();
		XCH01274 = objectInput.readUTF();
		XCH01275 = objectInput.readUTF();
		XCH01276 = objectInput.readUTF();
		XCH01277 = objectInput.readUTF();
		XCH01278 = objectInput.readUTF();
		XCH01279 = objectInput.readUTF();
		XCH01280 = objectInput.readUTF();
		XCH01281 = objectInput.readUTF();
		XCH01282 = objectInput.readUTF();
		XCH01283 = objectInput.readUTF();
		XCH01284 = objectInput.readUTF();
		XCH01285 = objectInput.readUTF();
		XCH01286 = objectInput.readUTF();
		XCH01287 = objectInput.readUTF();
		XCH01288 = objectInput.readUTF();
		XCH01289 = objectInput.readUTF();
		XCH01290 = objectInput.readUTF();
		XCH01291 = objectInput.readUTF();
		XCH01292 = objectInput.readUTF();
		XCH01293 = objectInput.readUTF();
		XCH01294 = objectInput.readUTF();
		XCH01295 = objectInput.readUTF();
		XCH01296 = objectInput.readUTF();
		XCH01297 = objectInput.readUTF();
		XCH01298 = objectInput.readUTF();
		XCH01299 = objectInput.readUTF();
		XCH01300 = objectInput.readUTF();
		XCH01301 = objectInput.readUTF();
		XCH01302 = objectInput.readUTF();
		XCH01303 = objectInput.readUTF();
		XCH01304 = objectInput.readUTF();
		XCH01305 = objectInput.readUTF();
		XCH01306 = objectInput.readUTF();
		XCH01307 = objectInput.readUTF();
		XCH01308 = objectInput.readUTF();
		XCH01309 = objectInput.readUTF();
		XCH01310 = objectInput.readUTF();
		XCH01311 = objectInput.readUTF();
		XCH01312 = objectInput.readUTF();
		XCH01313 = objectInput.readUTF();
		XCH01314 = objectInput.readUTF();
		XCH01315 = objectInput.readUTF();
		XCH01316 = objectInput.readUTF();
		XCH01317 = objectInput.readUTF();
		XCH01318 = objectInput.readUTF();
		XCH01319 = objectInput.readUTF();
		XCH01320 = objectInput.readUTF();
		XCH01321 = objectInput.readUTF();
		XCH01322 = objectInput.readUTF();
		XCH01323 = objectInput.readUTF();
		XCH01324 = objectInput.readUTF();
		XCH01325 = objectInput.readUTF();
		XCH01326 = objectInput.readUTF();
		XCH01327 = objectInput.readUTF();
		XCH01328 = objectInput.readUTF();
		XCH01329 = objectInput.readUTF();
		XCH01330 = objectInput.readUTF();
		XCH01331 = objectInput.readUTF();
		XCH01332 = objectInput.readUTF();
		XCH01333 = objectInput.readUTF();
		XCH01334 = objectInput.readUTF();
		XCH01335 = objectInput.readUTF();
		XCH01336 = objectInput.readUTF();
		XCH01337 = objectInput.readUTF();
		XCH01338 = objectInput.readUTF();
		XCH01339 = objectInput.readUTF();
		XCH01340 = objectInput.readUTF();
		XCH01341 = objectInput.readUTF();
		XCH01342 = objectInput.readUTF();
		XCH01343 = objectInput.readUTF();
		XCH01344 = objectInput.readUTF();
		XCH01345 = objectInput.readUTF();
		XCH01346 = objectInput.readUTF();
		XCH01347 = objectInput.readUTF();
		XCH01348 = objectInput.readUTF();
		XCH01349 = objectInput.readUTF();
		XCH01350 = objectInput.readUTF();
		XCH01351 = objectInput.readUTF();
		XCH01352 = objectInput.readUTF();
		XCH01353 = objectInput.readUTF();
		XCH01354 = objectInput.readUTF();
		XCH01355 = objectInput.readUTF();
		XCH01356 = objectInput.readUTF();
		XCH01357 = objectInput.readUTF();
		XCH01358 = objectInput.readUTF();
		XCH01359 = objectInput.readUTF();
		XCH01360 = objectInput.readUTF();
		XCH01361 = objectInput.readUTF();
		XCH01362 = objectInput.readUTF();
		XCH01363 = objectInput.readUTF();
		XCH01364 = objectInput.readUTF();
		XCH01365 = objectInput.readUTF();
		XCH01366 = objectInput.readUTF();
		XCH01367 = objectInput.readUTF();
		XCH01368 = objectInput.readUTF();
		XCH01369 = objectInput.readUTF();
		XCH01370 = objectInput.readUTF();
		XCH01371 = objectInput.readUTF();
		XCH01372 = objectInput.readUTF();
		XCH01373 = objectInput.readUTF();
		XCH01374 = objectInput.readUTF();
		XCH01375 = objectInput.readUTF();
		XCH01376 = objectInput.readUTF();
		XCH01377 = objectInput.readUTF();
		XCH01378 = objectInput.readUTF();
		XCH01379 = objectInput.readUTF();
		XCH01380 = objectInput.readUTF();
		XCH01381 = objectInput.readUTF();
		XCH01382 = objectInput.readUTF();
		XCH01383 = objectInput.readUTF();
		XCH01384 = objectInput.readUTF();
		XCH01385 = objectInput.readUTF();
		XCH01386 = objectInput.readUTF();
		XCH01387 = objectInput.readUTF();
		XCH01388 = objectInput.readUTF();
		XCH01389 = objectInput.readUTF();
		XCH01390 = objectInput.readUTF();
		XCH01391 = objectInput.readUTF();
		XCH01392 = objectInput.readUTF();
		XCH01393 = objectInput.readUTF();
		XCH01394 = objectInput.readUTF();
		XCH01395 = objectInput.readUTF();
		XCH01396 = objectInput.readUTF();
		XCH01397 = objectInput.readUTF();
		XCH01398 = objectInput.readUTF();
		XCH01399 = objectInput.readUTF();
		XCH01400 = objectInput.readUTF();
		XCH01401 = objectInput.readUTF();
		XCH01402 = objectInput.readUTF();
		XCH01403 = objectInput.readUTF();
		XCH01404 = objectInput.readUTF();
		XCH01405 = objectInput.readUTF();
		XCH01406 = objectInput.readUTF();
		XCH01407 = objectInput.readUTF();
		XCH01408 = objectInput.readUTF();
		XCH01409 = objectInput.readUTF();
		XCH01410 = objectInput.readUTF();
		XCH01411 = objectInput.readUTF();
		XCH01412 = objectInput.readUTF();
		XCH01413 = objectInput.readUTF();
		XCH01414 = objectInput.readUTF();
		XCH01415 = objectInput.readUTF();
		XCH01416 = objectInput.readUTF();
		XCH01417 = objectInput.readUTF();
		XCH01418 = objectInput.readUTF();
		XCH01419 = objectInput.readUTF();
		XCH01420 = objectInput.readUTF();
		XCH01421 = objectInput.readUTF();
		XCH01422 = objectInput.readUTF();
		XCH01423 = objectInput.readUTF();
		XCH01424 = objectInput.readUTF();
		XCH01425 = objectInput.readUTF();
		XCH01426 = objectInput.readUTF();
		XCH01427 = objectInput.readUTF();
		XCH01428 = objectInput.readUTF();
		XCH01429 = objectInput.readUTF();
		XCH01430 = objectInput.readUTF();
		XCH01431 = objectInput.readUTF();
		XCH01432 = objectInput.readUTF();
		XCH01433 = objectInput.readUTF();
		XCH01434 = objectInput.readUTF();
		XCH01435 = objectInput.readUTF();
		XCH01436 = objectInput.readUTF();
		XCH01437 = objectInput.readUTF();
		XCH01438 = objectInput.readUTF();
		XCH01439 = objectInput.readUTF();
		XCH01440 = objectInput.readUTF();
		XCH01441 = objectInput.readUTF();
		XCH01442 = objectInput.readUTF();
		XCH01443 = objectInput.readUTF();
		XCH01444 = objectInput.readUTF();
		XCH01445 = objectInput.readUTF();
		BBCNCLKLXCH001 = objectInput.readUTF();
		BBCNCLKLXCH002 = objectInput.readUTF();
		BBCNCLKLXCH003 = objectInput.readUTF();
		BBCNCLKLXCH004 = objectInput.readUTF();
		BBCNCLKLXCH005 = objectInput.readUTF();
		BBCNCLKLXCH006 = objectInput.readUTF();
		BBCNCLKLXCH012 = objectInput.readUTF();
		BBCNCLKLXCH013 = objectInput.readUTF();
		BBCNCLKLXCH014 = objectInput.readUTF();
		BBCNCLKLXCH015 = objectInput.readUTF();
		BBCNCLKLXCH016 = objectInput.readUTF();
		BBCNCLKLXCH017 = objectInput.readUTF();
		BBCNCLKLXCH018 = objectInput.readUTF();
		BBCNCLKLXCH019 = objectInput.readUTF();
		BBCNCLKLXCH020 = objectInput.readUTF();
		BBCNCLKLXCH021 = objectInput.readUTF();
		BBCNCLKLXCH022 = objectInput.readUTF();
		BBCNCLKLXCH023 = objectInput.readUTF();
		BBCNCLKLXCH026 = objectInput.readUTF();
		BBCNCLKLXCH027 = objectInput.readUTF();
		BBCNCLKLXCH028 = objectInput.readUTF();
		BBCNCLKLXCH033 = objectInput.readUTF();
		BBCNCLKLXCH034 = objectInput.readUTF();
		BBCNCLKLXCH037 = objectInput.readUTF();
		BBCNCLKLXCH038 = objectInput.readUTF();
		BBCNCLKLXCH039 = objectInput.readUTF();
		BBCNCLKLXCH040 = objectInput.readUTF();
		BBCNCLKLXCH041 = objectInput.readUTF();
		BBCNCLKLXCH042 = objectInput.readUTF();
		BBCNCLKLXCH043 = objectInput.readUTF();
		BBCNCLKLXCH044 = objectInput.readUTF();
		BBCNCLKLXCH045 = objectInput.readUTF();
		BBCNCLKLXCH046 = objectInput.readUTF();
		BBCNCLKLXCH047 = objectInput.readUTF();
		BBCNCLKLXCH053 = objectInput.readUTF();
		BBCNCLKLXCH054 = objectInput.readUTF();
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

		if (XCH01273 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01273);
		}

		if (XCH01274 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01274);
		}

		if (XCH01275 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01275);
		}

		if (XCH01276 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01276);
		}

		if (XCH01277 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01277);
		}

		if (XCH01278 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01278);
		}

		if (XCH01279 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01279);
		}

		if (XCH01280 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01280);
		}

		if (XCH01281 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01281);
		}

		if (XCH01282 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01282);
		}

		if (XCH01283 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01283);
		}

		if (XCH01284 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01284);
		}

		if (XCH01285 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01285);
		}

		if (XCH01286 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01286);
		}

		if (XCH01287 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01287);
		}

		if (XCH01288 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01288);
		}

		if (XCH01289 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01289);
		}

		if (XCH01290 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01290);
		}

		if (XCH01291 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01291);
		}

		if (XCH01292 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01292);
		}

		if (XCH01293 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01293);
		}

		if (XCH01294 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01294);
		}

		if (XCH01295 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01295);
		}

		if (XCH01296 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01296);
		}

		if (XCH01297 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01297);
		}

		if (XCH01298 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01298);
		}

		if (XCH01299 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01299);
		}

		if (XCH01300 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01300);
		}

		if (XCH01301 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01301);
		}

		if (XCH01302 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01302);
		}

		if (XCH01303 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01303);
		}

		if (XCH01304 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01304);
		}

		if (XCH01305 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01305);
		}

		if (XCH01306 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01306);
		}

		if (XCH01307 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01307);
		}

		if (XCH01308 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01308);
		}

		if (XCH01309 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01309);
		}

		if (XCH01310 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01310);
		}

		if (XCH01311 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01311);
		}

		if (XCH01312 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01312);
		}

		if (XCH01313 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01313);
		}

		if (XCH01314 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01314);
		}

		if (XCH01315 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01315);
		}

		if (XCH01316 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01316);
		}

		if (XCH01317 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01317);
		}

		if (XCH01318 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01318);
		}

		if (XCH01319 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01319);
		}

		if (XCH01320 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01320);
		}

		if (XCH01321 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01321);
		}

		if (XCH01322 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01322);
		}

		if (XCH01323 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01323);
		}

		if (XCH01324 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01324);
		}

		if (XCH01325 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01325);
		}

		if (XCH01326 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01326);
		}

		if (XCH01327 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01327);
		}

		if (XCH01328 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01328);
		}

		if (XCH01329 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01329);
		}

		if (XCH01330 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01330);
		}

		if (XCH01331 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01331);
		}

		if (XCH01332 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01332);
		}

		if (XCH01333 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01333);
		}

		if (XCH01334 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01334);
		}

		if (XCH01335 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01335);
		}

		if (XCH01336 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01336);
		}

		if (XCH01337 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01337);
		}

		if (XCH01338 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01338);
		}

		if (XCH01339 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01339);
		}

		if (XCH01340 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01340);
		}

		if (XCH01341 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01341);
		}

		if (XCH01342 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01342);
		}

		if (XCH01343 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01343);
		}

		if (XCH01344 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01344);
		}

		if (XCH01345 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01345);
		}

		if (XCH01346 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01346);
		}

		if (XCH01347 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01347);
		}

		if (XCH01348 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01348);
		}

		if (XCH01349 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01349);
		}

		if (XCH01350 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01350);
		}

		if (XCH01351 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01351);
		}

		if (XCH01352 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01352);
		}

		if (XCH01353 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01353);
		}

		if (XCH01354 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01354);
		}

		if (XCH01355 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01355);
		}

		if (XCH01356 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01356);
		}

		if (XCH01357 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01357);
		}

		if (XCH01358 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01358);
		}

		if (XCH01359 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01359);
		}

		if (XCH01360 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01360);
		}

		if (XCH01361 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01361);
		}

		if (XCH01362 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01362);
		}

		if (XCH01363 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01363);
		}

		if (XCH01364 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01364);
		}

		if (XCH01365 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01365);
		}

		if (XCH01366 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01366);
		}

		if (XCH01367 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01367);
		}

		if (XCH01368 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01368);
		}

		if (XCH01369 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01369);
		}

		if (XCH01370 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01370);
		}

		if (XCH01371 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01371);
		}

		if (XCH01372 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01372);
		}

		if (XCH01373 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01373);
		}

		if (XCH01374 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01374);
		}

		if (XCH01375 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01375);
		}

		if (XCH01376 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01376);
		}

		if (XCH01377 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01377);
		}

		if (XCH01378 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01378);
		}

		if (XCH01379 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01379);
		}

		if (XCH01380 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01380);
		}

		if (XCH01381 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01381);
		}

		if (XCH01382 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01382);
		}

		if (XCH01383 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01383);
		}

		if (XCH01384 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01384);
		}

		if (XCH01385 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01385);
		}

		if (XCH01386 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01386);
		}

		if (XCH01387 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01387);
		}

		if (XCH01388 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01388);
		}

		if (XCH01389 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01389);
		}

		if (XCH01390 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01390);
		}

		if (XCH01391 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01391);
		}

		if (XCH01392 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01392);
		}

		if (XCH01393 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01393);
		}

		if (XCH01394 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01394);
		}

		if (XCH01395 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01395);
		}

		if (XCH01396 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01396);
		}

		if (XCH01397 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01397);
		}

		if (XCH01398 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01398);
		}

		if (XCH01399 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01399);
		}

		if (XCH01400 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01400);
		}

		if (XCH01401 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01401);
		}

		if (XCH01402 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01402);
		}

		if (XCH01403 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01403);
		}

		if (XCH01404 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01404);
		}

		if (XCH01405 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01405);
		}

		if (XCH01406 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01406);
		}

		if (XCH01407 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01407);
		}

		if (XCH01408 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01408);
		}

		if (XCH01409 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01409);
		}

		if (XCH01410 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01410);
		}

		if (XCH01411 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01411);
		}

		if (XCH01412 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01412);
		}

		if (XCH01413 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01413);
		}

		if (XCH01414 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01414);
		}

		if (XCH01415 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01415);
		}

		if (XCH01416 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01416);
		}

		if (XCH01417 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01417);
		}

		if (XCH01418 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01418);
		}

		if (XCH01419 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01419);
		}

		if (XCH01420 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01420);
		}

		if (XCH01421 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01421);
		}

		if (XCH01422 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01422);
		}

		if (XCH01423 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01423);
		}

		if (XCH01424 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01424);
		}

		if (XCH01425 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01425);
		}

		if (XCH01426 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01426);
		}

		if (XCH01427 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01427);
		}

		if (XCH01428 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01428);
		}

		if (XCH01429 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01429);
		}

		if (XCH01430 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01430);
		}

		if (XCH01431 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01431);
		}

		if (XCH01432 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01432);
		}

		if (XCH01433 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01433);
		}

		if (XCH01434 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01434);
		}

		if (XCH01435 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01435);
		}

		if (XCH01436 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01436);
		}

		if (XCH01437 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01437);
		}

		if (XCH01438 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01438);
		}

		if (XCH01439 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01439);
		}

		if (XCH01440 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01440);
		}

		if (XCH01441 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01441);
		}

		if (XCH01442 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01442);
		}

		if (XCH01443 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01443);
		}

		if (XCH01444 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01444);
		}

		if (XCH01445 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01445);
		}

		if (BBCNCLKLXCH001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH001);
		}

		if (BBCNCLKLXCH002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH002);
		}

		if (BBCNCLKLXCH003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH003);
		}

		if (BBCNCLKLXCH004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH004);
		}

		if (BBCNCLKLXCH005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH005);
		}

		if (BBCNCLKLXCH006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH006);
		}

		if (BBCNCLKLXCH012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH012);
		}

		if (BBCNCLKLXCH013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH013);
		}

		if (BBCNCLKLXCH014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH014);
		}

		if (BBCNCLKLXCH015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH015);
		}

		if (BBCNCLKLXCH016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH016);
		}

		if (BBCNCLKLXCH017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH017);
		}

		if (BBCNCLKLXCH018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH018);
		}

		if (BBCNCLKLXCH019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH019);
		}

		if (BBCNCLKLXCH020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH020);
		}

		if (BBCNCLKLXCH021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH021);
		}

		if (BBCNCLKLXCH022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH022);
		}

		if (BBCNCLKLXCH023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH023);
		}

		if (BBCNCLKLXCH026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH026);
		}

		if (BBCNCLKLXCH027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH027);
		}

		if (BBCNCLKLXCH028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH028);
		}

		if (BBCNCLKLXCH033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH033);
		}

		if (BBCNCLKLXCH034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH034);
		}

		if (BBCNCLKLXCH037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH037);
		}

		if (BBCNCLKLXCH038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH038);
		}

		if (BBCNCLKLXCH039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH039);
		}

		if (BBCNCLKLXCH040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH040);
		}

		if (BBCNCLKLXCH041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH041);
		}

		if (BBCNCLKLXCH042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH042);
		}

		if (BBCNCLKLXCH043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH043);
		}

		if (BBCNCLKLXCH044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH044);
		}

		if (BBCNCLKLXCH045 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH045);
		}

		if (BBCNCLKLXCH046 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH046);
		}

		if (BBCNCLKLXCH047 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH047);
		}

		if (BBCNCLKLXCH053 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH053);
		}

		if (BBCNCLKLXCH054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCH054);
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
	public String XCH01273;
	public String XCH01274;
	public String XCH01275;
	public String XCH01276;
	public String XCH01277;
	public String XCH01278;
	public String XCH01279;
	public String XCH01280;
	public String XCH01281;
	public String XCH01282;
	public String XCH01283;
	public String XCH01284;
	public String XCH01285;
	public String XCH01286;
	public String XCH01287;
	public String XCH01288;
	public String XCH01289;
	public String XCH01290;
	public String XCH01291;
	public String XCH01292;
	public String XCH01293;
	public String XCH01294;
	public String XCH01295;
	public String XCH01296;
	public String XCH01297;
	public String XCH01298;
	public String XCH01299;
	public String XCH01300;
	public String XCH01301;
	public String XCH01302;
	public String XCH01303;
	public String XCH01304;
	public String XCH01305;
	public String XCH01306;
	public String XCH01307;
	public String XCH01308;
	public String XCH01309;
	public String XCH01310;
	public String XCH01311;
	public String XCH01312;
	public String XCH01313;
	public String XCH01314;
	public String XCH01315;
	public String XCH01316;
	public String XCH01317;
	public String XCH01318;
	public String XCH01319;
	public String XCH01320;
	public String XCH01321;
	public String XCH01322;
	public String XCH01323;
	public String XCH01324;
	public String XCH01325;
	public String XCH01326;
	public String XCH01327;
	public String XCH01328;
	public String XCH01329;
	public String XCH01330;
	public String XCH01331;
	public String XCH01332;
	public String XCH01333;
	public String XCH01334;
	public String XCH01335;
	public String XCH01336;
	public String XCH01337;
	public String XCH01338;
	public String XCH01339;
	public String XCH01340;
	public String XCH01341;
	public String XCH01342;
	public String XCH01343;
	public String XCH01344;
	public String XCH01345;
	public String XCH01346;
	public String XCH01347;
	public String XCH01348;
	public String XCH01349;
	public String XCH01350;
	public String XCH01351;
	public String XCH01352;
	public String XCH01353;
	public String XCH01354;
	public String XCH01355;
	public String XCH01356;
	public String XCH01357;
	public String XCH01358;
	public String XCH01359;
	public String XCH01360;
	public String XCH01361;
	public String XCH01362;
	public String XCH01363;
	public String XCH01364;
	public String XCH01365;
	public String XCH01366;
	public String XCH01367;
	public String XCH01368;
	public String XCH01369;
	public String XCH01370;
	public String XCH01371;
	public String XCH01372;
	public String XCH01373;
	public String XCH01374;
	public String XCH01375;
	public String XCH01376;
	public String XCH01377;
	public String XCH01378;
	public String XCH01379;
	public String XCH01380;
	public String XCH01381;
	public String XCH01382;
	public String XCH01383;
	public String XCH01384;
	public String XCH01385;
	public String XCH01386;
	public String XCH01387;
	public String XCH01388;
	public String XCH01389;
	public String XCH01390;
	public String XCH01391;
	public String XCH01392;
	public String XCH01393;
	public String XCH01394;
	public String XCH01395;
	public String XCH01396;
	public String XCH01397;
	public String XCH01398;
	public String XCH01399;
	public String XCH01400;
	public String XCH01401;
	public String XCH01402;
	public String XCH01403;
	public String XCH01404;
	public String XCH01405;
	public String XCH01406;
	public String XCH01407;
	public String XCH01408;
	public String XCH01409;
	public String XCH01410;
	public String XCH01411;
	public String XCH01412;
	public String XCH01413;
	public String XCH01414;
	public String XCH01415;
	public String XCH01416;
	public String XCH01417;
	public String XCH01418;
	public String XCH01419;
	public String XCH01420;
	public String XCH01421;
	public String XCH01422;
	public String XCH01423;
	public String XCH01424;
	public String XCH01425;
	public String XCH01426;
	public String XCH01427;
	public String XCH01428;
	public String XCH01429;
	public String XCH01430;
	public String XCH01431;
	public String XCH01432;
	public String XCH01433;
	public String XCH01434;
	public String XCH01435;
	public String XCH01436;
	public String XCH01437;
	public String XCH01438;
	public String XCH01439;
	public String XCH01440;
	public String XCH01441;
	public String XCH01442;
	public String XCH01443;
	public String XCH01444;
	public String XCH01445;
	public String BBCNCLKLXCH001;
	public String BBCNCLKLXCH002;
	public String BBCNCLKLXCH003;
	public String BBCNCLKLXCH004;
	public String BBCNCLKLXCH005;
	public String BBCNCLKLXCH006;
	public String BBCNCLKLXCH012;
	public String BBCNCLKLXCH013;
	public String BBCNCLKLXCH014;
	public String BBCNCLKLXCH015;
	public String BBCNCLKLXCH016;
	public String BBCNCLKLXCH017;
	public String BBCNCLKLXCH018;
	public String BBCNCLKLXCH019;
	public String BBCNCLKLXCH020;
	public String BBCNCLKLXCH021;
	public String BBCNCLKLXCH022;
	public String BBCNCLKLXCH023;
	public String BBCNCLKLXCH026;
	public String BBCNCLKLXCH027;
	public String BBCNCLKLXCH028;
	public String BBCNCLKLXCH033;
	public String BBCNCLKLXCH034;
	public String BBCNCLKLXCH037;
	public String BBCNCLKLXCH038;
	public String BBCNCLKLXCH039;
	public String BBCNCLKLXCH040;
	public String BBCNCLKLXCH041;
	public String BBCNCLKLXCH042;
	public String BBCNCLKLXCH043;
	public String BBCNCLKLXCH044;
	public String BBCNCLKLXCH045;
	public String BBCNCLKLXCH046;
	public String BBCNCLKLXCH047;
	public String BBCNCLKLXCH053;
	public String BBCNCLKLXCH054;
	public long modifyDate;
	public long syncDate;
}