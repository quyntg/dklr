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

import com.fds.vr.business.model.VRTechnicalSpec_XCGPart3;

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
 * The cache model class for representing VRTechnicalSpec_XCGPart3 in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart3
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart3CacheModel implements CacheModel<VRTechnicalSpec_XCGPart3>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGPart3CacheModel)) {
			return false;
		}

		VRTechnicalSpec_XCGPart3CacheModel vrTechnicalSpec_XCGPart3CacheModel = (VRTechnicalSpec_XCGPart3CacheModel)obj;

		if (id == vrTechnicalSpec_XCGPart3CacheModel.id) {
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
		StringBundler sb = new StringBundler(383);

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
		sb.append(", XCG01310=");
		sb.append(XCG01310);
		sb.append(", XCG01311=");
		sb.append(XCG01311);
		sb.append(", XCG01312=");
		sb.append(XCG01312);
		sb.append(", XCG01313=");
		sb.append(XCG01313);
		sb.append(", XCG01314=");
		sb.append(XCG01314);
		sb.append(", XCG01315=");
		sb.append(XCG01315);
		sb.append(", XCG01316=");
		sb.append(XCG01316);
		sb.append(", XCG01317=");
		sb.append(XCG01317);
		sb.append(", XCG01318=");
		sb.append(XCG01318);
		sb.append(", XCG01319=");
		sb.append(XCG01319);
		sb.append(", XCG01320=");
		sb.append(XCG01320);
		sb.append(", XCG01321=");
		sb.append(XCG01321);
		sb.append(", XCG01322=");
		sb.append(XCG01322);
		sb.append(", XCG01323=");
		sb.append(XCG01323);
		sb.append(", XCG01324=");
		sb.append(XCG01324);
		sb.append(", XCG01325=");
		sb.append(XCG01325);
		sb.append(", XCG01326=");
		sb.append(XCG01326);
		sb.append(", XCG01327=");
		sb.append(XCG01327);
		sb.append(", XCG01328=");
		sb.append(XCG01328);
		sb.append(", XCG01330=");
		sb.append(XCG01330);
		sb.append(", XCG01331=");
		sb.append(XCG01331);
		sb.append(", XCG01332=");
		sb.append(XCG01332);
		sb.append(", XCG01333=");
		sb.append(XCG01333);
		sb.append(", XCG01334=");
		sb.append(XCG01334);
		sb.append(", XCG01335=");
		sb.append(XCG01335);
		sb.append(", XCG01336=");
		sb.append(XCG01336);
		sb.append(", XCG01337=");
		sb.append(XCG01337);
		sb.append(", XCG01338=");
		sb.append(XCG01338);
		sb.append(", XCG01339=");
		sb.append(XCG01339);
		sb.append(", XCG01340=");
		sb.append(XCG01340);
		sb.append(", XCG01341=");
		sb.append(XCG01341);
		sb.append(", XCG01342=");
		sb.append(XCG01342);
		sb.append(", XCG01343=");
		sb.append(XCG01343);
		sb.append(", XCG01344=");
		sb.append(XCG01344);
		sb.append(", XCG01345=");
		sb.append(XCG01345);
		sb.append(", XCG01346=");
		sb.append(XCG01346);
		sb.append(", XCG01347=");
		sb.append(XCG01347);
		sb.append(", XCG01348=");
		sb.append(XCG01348);
		sb.append(", XCG01349=");
		sb.append(XCG01349);
		sb.append(", XCG01350=");
		sb.append(XCG01350);
		sb.append(", XCG01351=");
		sb.append(XCG01351);
		sb.append(", XCG01352=");
		sb.append(XCG01352);
		sb.append(", XCG01353=");
		sb.append(XCG01353);
		sb.append(", XCG01354=");
		sb.append(XCG01354);
		sb.append(", XCG01355=");
		sb.append(XCG01355);
		sb.append(", XCG01356=");
		sb.append(XCG01356);
		sb.append(", XCG01357=");
		sb.append(XCG01357);
		sb.append(", XCG01358=");
		sb.append(XCG01358);
		sb.append(", XCG01359=");
		sb.append(XCG01359);
		sb.append(", XCG01360=");
		sb.append(XCG01360);
		sb.append(", XCG01361=");
		sb.append(XCG01361);
		sb.append(", XCG01362=");
		sb.append(XCG01362);
		sb.append(", XCG01363=");
		sb.append(XCG01363);
		sb.append(", XCG01364=");
		sb.append(XCG01364);
		sb.append(", XCG01365=");
		sb.append(XCG01365);
		sb.append(", XCG01366=");
		sb.append(XCG01366);
		sb.append(", XCG01367=");
		sb.append(XCG01367);
		sb.append(", XCG01368=");
		sb.append(XCG01368);
		sb.append(", XCG01369=");
		sb.append(XCG01369);
		sb.append(", XCG01370=");
		sb.append(XCG01370);
		sb.append(", XCG01371=");
		sb.append(XCG01371);
		sb.append(", XCG01372=");
		sb.append(XCG01372);
		sb.append(", XCG01373=");
		sb.append(XCG01373);
		sb.append(", XCG01374=");
		sb.append(XCG01374);
		sb.append(", XCG01375=");
		sb.append(XCG01375);
		sb.append(", XCG01376=");
		sb.append(XCG01376);
		sb.append(", XCG01377=");
		sb.append(XCG01377);
		sb.append(", XCG01378=");
		sb.append(XCG01378);
		sb.append(", XCG01379=");
		sb.append(XCG01379);
		sb.append(", XCG01381=");
		sb.append(XCG01381);
		sb.append(", XCG01382=");
		sb.append(XCG01382);
		sb.append(", XCG01383=");
		sb.append(XCG01383);
		sb.append(", XCG01384=");
		sb.append(XCG01384);
		sb.append(", XCG01385=");
		sb.append(XCG01385);
		sb.append(", XCG01386=");
		sb.append(XCG01386);
		sb.append(", XCG01387=");
		sb.append(XCG01387);
		sb.append(", XCG01388=");
		sb.append(XCG01388);
		sb.append(", XCG01389=");
		sb.append(XCG01389);
		sb.append(", XCG01390=");
		sb.append(XCG01390);
		sb.append(", XCG01391=");
		sb.append(XCG01391);
		sb.append(", XCG01392=");
		sb.append(XCG01392);
		sb.append(", XCG01393=");
		sb.append(XCG01393);
		sb.append(", XCG01394=");
		sb.append(XCG01394);
		sb.append(", XCG01395=");
		sb.append(XCG01395);
		sb.append(", XCG01396=");
		sb.append(XCG01396);
		sb.append(", XCG01397=");
		sb.append(XCG01397);
		sb.append(", XCG01398=");
		sb.append(XCG01398);
		sb.append(", XCG01399=");
		sb.append(XCG01399);
		sb.append(", XCG01400=");
		sb.append(XCG01400);
		sb.append(", XCG01402=");
		sb.append(XCG01402);
		sb.append(", XCG01403=");
		sb.append(XCG01403);
		sb.append(", XCG01404=");
		sb.append(XCG01404);
		sb.append(", XCG01405=");
		sb.append(XCG01405);
		sb.append(", XCG01406=");
		sb.append(XCG01406);
		sb.append(", XCG01407=");
		sb.append(XCG01407);
		sb.append(", XCG01408=");
		sb.append(XCG01408);
		sb.append(", XCG01409=");
		sb.append(XCG01409);
		sb.append(", XCG01410=");
		sb.append(XCG01410);
		sb.append(", XCG01411=");
		sb.append(XCG01411);
		sb.append(", XCG01412=");
		sb.append(XCG01412);
		sb.append(", XCG01413=");
		sb.append(XCG01413);
		sb.append(", XCG01414=");
		sb.append(XCG01414);
		sb.append(", XCG01415=");
		sb.append(XCG01415);
		sb.append(", XCG01416=");
		sb.append(XCG01416);
		sb.append(", XCG01417=");
		sb.append(XCG01417);
		sb.append(", XCG01418=");
		sb.append(XCG01418);
		sb.append(", XCG01419=");
		sb.append(XCG01419);
		sb.append(", XCG01420=");
		sb.append(XCG01420);
		sb.append(", XCG01421=");
		sb.append(XCG01421);
		sb.append(", XCG01422=");
		sb.append(XCG01422);
		sb.append(", XCG01423=");
		sb.append(XCG01423);
		sb.append(", XCG01424=");
		sb.append(XCG01424);
		sb.append(", XCG01425=");
		sb.append(XCG01425);
		sb.append(", XCG01426=");
		sb.append(XCG01426);
		sb.append(", XCG01427=");
		sb.append(XCG01427);
		sb.append(", XCG01428=");
		sb.append(XCG01428);
		sb.append(", XCG01437=");
		sb.append(XCG01437);
		sb.append(", XCG01429=");
		sb.append(XCG01429);
		sb.append(", XCG01430=");
		sb.append(XCG01430);
		sb.append(", XCG01431=");
		sb.append(XCG01431);
		sb.append(", XCG01432=");
		sb.append(XCG01432);
		sb.append(", XCG01433=");
		sb.append(XCG01433);
		sb.append(", XCG01434=");
		sb.append(XCG01434);
		sb.append(", XCG01435=");
		sb.append(XCG01435);
		sb.append(", XCG01436=");
		sb.append(XCG01436);
		sb.append(", XCG01439=");
		sb.append(XCG01439);
		sb.append(", XCG01440=");
		sb.append(XCG01440);
		sb.append(", XCG01441=");
		sb.append(XCG01441);
		sb.append(", XCG01442=");
		sb.append(XCG01442);
		sb.append(", XCG01443=");
		sb.append(XCG01443);
		sb.append(", XCG01445=");
		sb.append(XCG01445);
		sb.append(", XCG01446=");
		sb.append(XCG01446);
		sb.append(", XCG01447=");
		sb.append(XCG01447);
		sb.append(", XCG01448=");
		sb.append(XCG01448);
		sb.append(", XCG01449=");
		sb.append(XCG01449);
		sb.append(", XCG01450=");
		sb.append(XCG01450);
		sb.append(", XCG01451=");
		sb.append(XCG01451);
		sb.append(", XCG01452=");
		sb.append(XCG01452);
		sb.append(", XCG01453=");
		sb.append(XCG01453);
		sb.append(", XCG01454=");
		sb.append(XCG01454);
		sb.append(", XCG01455=");
		sb.append(XCG01455);
		sb.append(", XCG01456=");
		sb.append(XCG01456);
		sb.append(", XCG01457=");
		sb.append(XCG01457);
		sb.append(", XCG01458=");
		sb.append(XCG01458);
		sb.append(", XCG01459=");
		sb.append(XCG01459);
		sb.append(", XCG01460=");
		sb.append(XCG01460);
		sb.append(", XCG01461=");
		sb.append(XCG01461);
		sb.append(", XCG01462=");
		sb.append(XCG01462);
		sb.append(", XCG01463=");
		sb.append(XCG01463);
		sb.append(", XCG01464=");
		sb.append(XCG01464);
		sb.append(", XCG01465=");
		sb.append(XCG01465);
		sb.append(", XCG01466=");
		sb.append(XCG01466);
		sb.append(", XCG01467=");
		sb.append(XCG01467);
		sb.append(", XCG01468=");
		sb.append(XCG01468);
		sb.append(", XCG01469=");
		sb.append(XCG01469);
		sb.append(", XCG01470=");
		sb.append(XCG01470);
		sb.append(", XCG01471=");
		sb.append(XCG01471);
		sb.append(", XCG01472=");
		sb.append(XCG01472);
		sb.append(", XCG01473=");
		sb.append(XCG01473);
		sb.append(", XCG01474=");
		sb.append(XCG01474);
		sb.append(", XCG01475=");
		sb.append(XCG01475);
		sb.append(", XCG01476=");
		sb.append(XCG01476);
		sb.append(", XCG01477=");
		sb.append(XCG01477);
		sb.append(", XCG01478=");
		sb.append(XCG01478);
		sb.append(", XCG01479=");
		sb.append(XCG01479);
		sb.append(", XCG01480=");
		sb.append(XCG01480);
		sb.append(", XCG01481=");
		sb.append(XCG01481);
		sb.append(", XCG01482=");
		sb.append(XCG01482);
		sb.append(", XCG01483=");
		sb.append(XCG01483);
		sb.append(", XCG01484=");
		sb.append(XCG01484);
		sb.append(", XCG01485=");
		sb.append(XCG01485);
		sb.append(", XCG01486=");
		sb.append(XCG01486);
		sb.append(", XCG01487=");
		sb.append(XCG01487);
		sb.append(", XCG01488=");
		sb.append(XCG01488);
		sb.append(", XCG01489=");
		sb.append(XCG01489);
		sb.append(", XCG01490=");
		sb.append(XCG01490);
		sb.append(", XCG01491=");
		sb.append(XCG01491);
		sb.append(", XCG01492=");
		sb.append(XCG01492);
		sb.append(", XCG01493=");
		sb.append(XCG01493);
		sb.append(", XCG01494=");
		sb.append(XCG01494);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XCGPart3 toEntityModel() {
		VRTechnicalSpec_XCGPart3Impl vrTechnicalSpec_XCGPart3Impl = new VRTechnicalSpec_XCGPart3Impl();

		vrTechnicalSpec_XCGPart3Impl.setId(id);
		vrTechnicalSpec_XCGPart3Impl.setMtCore(mtCore);
		vrTechnicalSpec_XCGPart3Impl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XCGPart3Impl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XCGPart3Impl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XCGPart3Impl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XCGPart3Impl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XCGPart3Impl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XCGPart3Impl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XCG01310 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01310(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01310(XCG01310);
		}

		if (XCG01311 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01311(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01311(XCG01311);
		}

		if (XCG01312 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01312(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01312(XCG01312);
		}

		if (XCG01313 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01313(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01313(XCG01313);
		}

		if (XCG01314 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01314(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01314(XCG01314);
		}

		if (XCG01315 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01315(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01315(XCG01315);
		}

		if (XCG01316 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01316(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01316(XCG01316);
		}

		if (XCG01317 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01317(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01317(XCG01317);
		}

		if (XCG01318 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01318(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01318(XCG01318);
		}

		if (XCG01319 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01319(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01319(XCG01319);
		}

		if (XCG01320 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01320(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01320(XCG01320);
		}

		if (XCG01321 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01321(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01321(XCG01321);
		}

		if (XCG01322 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01322(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01322(XCG01322);
		}

		if (XCG01323 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01323(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01323(XCG01323);
		}

		if (XCG01324 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01324(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01324(XCG01324);
		}

		if (XCG01325 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01325(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01325(XCG01325);
		}

		if (XCG01326 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01326(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01326(XCG01326);
		}

		if (XCG01327 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01327(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01327(XCG01327);
		}

		if (XCG01328 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01328(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01328(XCG01328);
		}

		if (XCG01330 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01330(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01330(XCG01330);
		}

		if (XCG01331 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01331(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01331(XCG01331);
		}

		if (XCG01332 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01332(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01332(XCG01332);
		}

		if (XCG01333 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01333(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01333(XCG01333);
		}

		if (XCG01334 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01334(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01334(XCG01334);
		}

		if (XCG01335 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01335(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01335(XCG01335);
		}

		if (XCG01336 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01336(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01336(XCG01336);
		}

		if (XCG01337 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01337(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01337(XCG01337);
		}

		if (XCG01338 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01338(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01338(XCG01338);
		}

		if (XCG01339 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01339(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01339(XCG01339);
		}

		if (XCG01340 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01340(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01340(XCG01340);
		}

		if (XCG01341 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01341(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01341(XCG01341);
		}

		if (XCG01342 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01342(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01342(XCG01342);
		}

		if (XCG01343 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01343(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01343(XCG01343);
		}

		if (XCG01344 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01344(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01344(XCG01344);
		}

		if (XCG01345 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01345(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01345(XCG01345);
		}

		if (XCG01346 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01346(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01346(XCG01346);
		}

		if (XCG01347 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01347(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01347(XCG01347);
		}

		if (XCG01348 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01348(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01348(XCG01348);
		}

		if (XCG01349 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01349(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01349(XCG01349);
		}

		if (XCG01350 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01350(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01350(XCG01350);
		}

		if (XCG01351 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01351(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01351(XCG01351);
		}

		if (XCG01352 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01352(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01352(XCG01352);
		}

		if (XCG01353 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01353(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01353(XCG01353);
		}

		if (XCG01354 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01354(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01354(XCG01354);
		}

		if (XCG01355 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01355(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01355(XCG01355);
		}

		if (XCG01356 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01356(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01356(XCG01356);
		}

		if (XCG01357 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01357(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01357(XCG01357);
		}

		if (XCG01358 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01358(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01358(XCG01358);
		}

		if (XCG01359 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01359(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01359(XCG01359);
		}

		if (XCG01360 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01360(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01360(XCG01360);
		}

		if (XCG01361 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01361(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01361(XCG01361);
		}

		if (XCG01362 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01362(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01362(XCG01362);
		}

		if (XCG01363 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01363(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01363(XCG01363);
		}

		if (XCG01364 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01364(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01364(XCG01364);
		}

		if (XCG01365 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01365(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01365(XCG01365);
		}

		if (XCG01366 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01366(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01366(XCG01366);
		}

		if (XCG01367 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01367(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01367(XCG01367);
		}

		if (XCG01368 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01368(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01368(XCG01368);
		}

		if (XCG01369 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01369(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01369(XCG01369);
		}

		if (XCG01370 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01370(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01370(XCG01370);
		}

		if (XCG01371 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01371(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01371(XCG01371);
		}

		if (XCG01372 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01372(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01372(XCG01372);
		}

		if (XCG01373 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01373(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01373(XCG01373);
		}

		if (XCG01374 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01374(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01374(XCG01374);
		}

		if (XCG01375 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01375(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01375(XCG01375);
		}

		if (XCG01376 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01376(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01376(XCG01376);
		}

		if (XCG01377 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01377(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01377(XCG01377);
		}

		if (XCG01378 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01378(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01378(XCG01378);
		}

		if (XCG01379 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01379(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01379(XCG01379);
		}

		if (XCG01381 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01381(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01381(XCG01381);
		}

		if (XCG01382 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01382(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01382(XCG01382);
		}

		if (XCG01383 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01383(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01383(XCG01383);
		}

		if (XCG01384 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01384(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01384(XCG01384);
		}

		if (XCG01385 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01385(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01385(XCG01385);
		}

		if (XCG01386 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01386(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01386(XCG01386);
		}

		if (XCG01387 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01387(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01387(XCG01387);
		}

		if (XCG01388 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01388(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01388(XCG01388);
		}

		if (XCG01389 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01389(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01389(XCG01389);
		}

		if (XCG01390 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01390(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01390(XCG01390);
		}

		if (XCG01391 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01391(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01391(XCG01391);
		}

		if (XCG01392 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01392(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01392(XCG01392);
		}

		if (XCG01393 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01393(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01393(XCG01393);
		}

		if (XCG01394 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01394(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01394(XCG01394);
		}

		if (XCG01395 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01395(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01395(XCG01395);
		}

		if (XCG01396 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01396(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01396(XCG01396);
		}

		if (XCG01397 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01397(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01397(XCG01397);
		}

		if (XCG01398 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01398(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01398(XCG01398);
		}

		if (XCG01399 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01399(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01399(XCG01399);
		}

		if (XCG01400 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01400(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01400(XCG01400);
		}

		if (XCG01402 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01402(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01402(XCG01402);
		}

		if (XCG01403 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01403(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01403(XCG01403);
		}

		if (XCG01404 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01404(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01404(XCG01404);
		}

		if (XCG01405 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01405(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01405(XCG01405);
		}

		if (XCG01406 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01406(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01406(XCG01406);
		}

		if (XCG01407 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01407(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01407(XCG01407);
		}

		if (XCG01408 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01408(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01408(XCG01408);
		}

		if (XCG01409 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01409(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01409(XCG01409);
		}

		if (XCG01410 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01410(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01410(XCG01410);
		}

		if (XCG01411 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01411(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01411(XCG01411);
		}

		if (XCG01412 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01412(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01412(XCG01412);
		}

		if (XCG01413 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01413(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01413(XCG01413);
		}

		if (XCG01414 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01414(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01414(XCG01414);
		}

		if (XCG01415 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01415(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01415(XCG01415);
		}

		if (XCG01416 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01416(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01416(XCG01416);
		}

		if (XCG01417 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01417(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01417(XCG01417);
		}

		if (XCG01418 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01418(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01418(XCG01418);
		}

		if (XCG01419 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01419(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01419(XCG01419);
		}

		if (XCG01420 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01420(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01420(XCG01420);
		}

		if (XCG01421 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01421(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01421(XCG01421);
		}

		if (XCG01422 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01422(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01422(XCG01422);
		}

		if (XCG01423 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01423(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01423(XCG01423);
		}

		if (XCG01424 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01424(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01424(XCG01424);
		}

		if (XCG01425 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01425(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01425(XCG01425);
		}

		if (XCG01426 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01426(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01426(XCG01426);
		}

		if (XCG01427 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01427(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01427(XCG01427);
		}

		if (XCG01428 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01428(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01428(XCG01428);
		}

		if (XCG01437 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01437(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01437(XCG01437);
		}

		if (XCG01429 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01429(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01429(XCG01429);
		}

		if (XCG01430 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01430(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01430(XCG01430);
		}

		if (XCG01431 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01431(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01431(XCG01431);
		}

		if (XCG01432 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01432(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01432(XCG01432);
		}

		if (XCG01433 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01433(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01433(XCG01433);
		}

		if (XCG01434 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01434(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01434(XCG01434);
		}

		if (XCG01435 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01435(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01435(XCG01435);
		}

		if (XCG01436 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01436(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01436(XCG01436);
		}

		if (XCG01439 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01439(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01439(XCG01439);
		}

		if (XCG01440 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01440(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01440(XCG01440);
		}

		if (XCG01441 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01441(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01441(XCG01441);
		}

		if (XCG01442 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01442(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01442(XCG01442);
		}

		if (XCG01443 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01443(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01443(XCG01443);
		}

		if (XCG01445 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01445(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01445(XCG01445);
		}

		if (XCG01446 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01446(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01446(XCG01446);
		}

		if (XCG01447 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01447(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01447(XCG01447);
		}

		if (XCG01448 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01448(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01448(XCG01448);
		}

		if (XCG01449 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01449(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01449(XCG01449);
		}

		if (XCG01450 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01450(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01450(XCG01450);
		}

		if (XCG01451 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01451(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01451(XCG01451);
		}

		if (XCG01452 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01452(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01452(XCG01452);
		}

		if (XCG01453 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01453(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01453(XCG01453);
		}

		if (XCG01454 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01454(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01454(XCG01454);
		}

		if (XCG01455 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01455(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01455(XCG01455);
		}

		if (XCG01456 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01456(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01456(XCG01456);
		}

		if (XCG01457 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01457(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01457(XCG01457);
		}

		if (XCG01458 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01458(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01458(XCG01458);
		}

		if (XCG01459 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01459(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01459(XCG01459);
		}

		if (XCG01460 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01460(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01460(XCG01460);
		}

		if (XCG01461 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01461(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01461(XCG01461);
		}

		if (XCG01462 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01462(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01462(XCG01462);
		}

		if (XCG01463 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01463(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01463(XCG01463);
		}

		if (XCG01464 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01464(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01464(XCG01464);
		}

		if (XCG01465 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01465(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01465(XCG01465);
		}

		if (XCG01466 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01466(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01466(XCG01466);
		}

		if (XCG01467 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01467(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01467(XCG01467);
		}

		if (XCG01468 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01468(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01468(XCG01468);
		}

		if (XCG01469 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01469(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01469(XCG01469);
		}

		if (XCG01470 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01470(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01470(XCG01470);
		}

		if (XCG01471 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01471(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01471(XCG01471);
		}

		if (XCG01472 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01472(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01472(XCG01472);
		}

		if (XCG01473 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01473(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01473(XCG01473);
		}

		if (XCG01474 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01474(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01474(XCG01474);
		}

		if (XCG01475 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01475(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01475(XCG01475);
		}

		if (XCG01476 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01476(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01476(XCG01476);
		}

		if (XCG01477 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01477(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01477(XCG01477);
		}

		if (XCG01478 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01478(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01478(XCG01478);
		}

		if (XCG01479 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01479(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01479(XCG01479);
		}

		if (XCG01480 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01480(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01480(XCG01480);
		}

		if (XCG01481 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01481(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01481(XCG01481);
		}

		if (XCG01482 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01482(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01482(XCG01482);
		}

		if (XCG01483 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01483(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01483(XCG01483);
		}

		if (XCG01484 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01484(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01484(XCG01484);
		}

		if (XCG01485 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01485(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01485(XCG01485);
		}

		if (XCG01486 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01486(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01486(XCG01486);
		}

		if (XCG01487 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01487(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01487(XCG01487);
		}

		if (XCG01488 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01488(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01488(XCG01488);
		}

		if (XCG01489 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01489(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01489(XCG01489);
		}

		if (XCG01490 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01490(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01490(XCG01490);
		}

		if (XCG01491 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01491(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01491(XCG01491);
		}

		if (XCG01492 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01492(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01492(XCG01492);
		}

		if (XCG01493 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01493(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01493(XCG01493);
		}

		if (XCG01494 == null) {
			vrTechnicalSpec_XCGPart3Impl.setXCG01494(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setXCG01494(XCG01494);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCGPart3Impl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCGPart3Impl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XCGPart3Impl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XCGPart3Impl.resetOriginalValues();

		return vrTechnicalSpec_XCGPart3Impl;
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
		XCG01310 = objectInput.readUTF();
		XCG01311 = objectInput.readUTF();
		XCG01312 = objectInput.readUTF();
		XCG01313 = objectInput.readUTF();
		XCG01314 = objectInput.readUTF();
		XCG01315 = objectInput.readUTF();
		XCG01316 = objectInput.readUTF();
		XCG01317 = objectInput.readUTF();
		XCG01318 = objectInput.readUTF();
		XCG01319 = objectInput.readUTF();
		XCG01320 = objectInput.readUTF();
		XCG01321 = objectInput.readUTF();
		XCG01322 = objectInput.readUTF();
		XCG01323 = objectInput.readUTF();
		XCG01324 = objectInput.readUTF();
		XCG01325 = objectInput.readUTF();
		XCG01326 = objectInput.readUTF();
		XCG01327 = objectInput.readUTF();
		XCG01328 = objectInput.readUTF();
		XCG01330 = objectInput.readUTF();
		XCG01331 = objectInput.readUTF();
		XCG01332 = objectInput.readUTF();
		XCG01333 = objectInput.readUTF();
		XCG01334 = objectInput.readUTF();
		XCG01335 = objectInput.readUTF();
		XCG01336 = objectInput.readUTF();
		XCG01337 = objectInput.readUTF();
		XCG01338 = objectInput.readUTF();
		XCG01339 = objectInput.readUTF();
		XCG01340 = objectInput.readUTF();
		XCG01341 = objectInput.readUTF();
		XCG01342 = objectInput.readUTF();
		XCG01343 = objectInput.readUTF();
		XCG01344 = objectInput.readUTF();
		XCG01345 = objectInput.readUTF();
		XCG01346 = objectInput.readUTF();
		XCG01347 = objectInput.readUTF();
		XCG01348 = objectInput.readUTF();
		XCG01349 = objectInput.readUTF();
		XCG01350 = objectInput.readUTF();
		XCG01351 = objectInput.readUTF();
		XCG01352 = objectInput.readUTF();
		XCG01353 = objectInput.readUTF();
		XCG01354 = objectInput.readUTF();
		XCG01355 = objectInput.readUTF();
		XCG01356 = objectInput.readUTF();
		XCG01357 = objectInput.readUTF();
		XCG01358 = objectInput.readUTF();
		XCG01359 = objectInput.readUTF();
		XCG01360 = objectInput.readUTF();
		XCG01361 = objectInput.readUTF();
		XCG01362 = objectInput.readUTF();
		XCG01363 = objectInput.readUTF();
		XCG01364 = objectInput.readUTF();
		XCG01365 = objectInput.readUTF();
		XCG01366 = objectInput.readUTF();
		XCG01367 = objectInput.readUTF();
		XCG01368 = objectInput.readUTF();
		XCG01369 = objectInput.readUTF();
		XCG01370 = objectInput.readUTF();
		XCG01371 = objectInput.readUTF();
		XCG01372 = objectInput.readUTF();
		XCG01373 = objectInput.readUTF();
		XCG01374 = objectInput.readUTF();
		XCG01375 = objectInput.readUTF();
		XCG01376 = objectInput.readUTF();
		XCG01377 = objectInput.readUTF();
		XCG01378 = objectInput.readUTF();
		XCG01379 = objectInput.readUTF();
		XCG01381 = objectInput.readUTF();
		XCG01382 = objectInput.readUTF();
		XCG01383 = objectInput.readUTF();
		XCG01384 = objectInput.readUTF();
		XCG01385 = objectInput.readUTF();
		XCG01386 = objectInput.readUTF();
		XCG01387 = objectInput.readUTF();
		XCG01388 = objectInput.readUTF();
		XCG01389 = objectInput.readUTF();
		XCG01390 = objectInput.readUTF();
		XCG01391 = objectInput.readUTF();
		XCG01392 = objectInput.readUTF();
		XCG01393 = objectInput.readUTF();
		XCG01394 = objectInput.readUTF();
		XCG01395 = objectInput.readUTF();
		XCG01396 = objectInput.readUTF();
		XCG01397 = objectInput.readUTF();
		XCG01398 = objectInput.readUTF();
		XCG01399 = objectInput.readUTF();
		XCG01400 = objectInput.readUTF();
		XCG01402 = objectInput.readUTF();
		XCG01403 = objectInput.readUTF();
		XCG01404 = objectInput.readUTF();
		XCG01405 = objectInput.readUTF();
		XCG01406 = objectInput.readUTF();
		XCG01407 = objectInput.readUTF();
		XCG01408 = objectInput.readUTF();
		XCG01409 = objectInput.readUTF();
		XCG01410 = objectInput.readUTF();
		XCG01411 = objectInput.readUTF();
		XCG01412 = objectInput.readUTF();
		XCG01413 = objectInput.readUTF();
		XCG01414 = objectInput.readUTF();
		XCG01415 = objectInput.readUTF();
		XCG01416 = objectInput.readUTF();
		XCG01417 = objectInput.readUTF();
		XCG01418 = objectInput.readUTF();
		XCG01419 = objectInput.readUTF();
		XCG01420 = objectInput.readUTF();
		XCG01421 = objectInput.readUTF();
		XCG01422 = objectInput.readUTF();
		XCG01423 = objectInput.readUTF();
		XCG01424 = objectInput.readUTF();
		XCG01425 = objectInput.readUTF();
		XCG01426 = objectInput.readUTF();
		XCG01427 = objectInput.readUTF();
		XCG01428 = objectInput.readUTF();
		XCG01437 = objectInput.readUTF();
		XCG01429 = objectInput.readUTF();
		XCG01430 = objectInput.readUTF();
		XCG01431 = objectInput.readUTF();
		XCG01432 = objectInput.readUTF();
		XCG01433 = objectInput.readUTF();
		XCG01434 = objectInput.readUTF();
		XCG01435 = objectInput.readUTF();
		XCG01436 = objectInput.readUTF();
		XCG01439 = objectInput.readUTF();
		XCG01440 = objectInput.readUTF();
		XCG01441 = objectInput.readUTF();
		XCG01442 = objectInput.readUTF();
		XCG01443 = objectInput.readUTF();
		XCG01445 = objectInput.readUTF();
		XCG01446 = objectInput.readUTF();
		XCG01447 = objectInput.readUTF();
		XCG01448 = objectInput.readUTF();
		XCG01449 = objectInput.readUTF();
		XCG01450 = objectInput.readUTF();
		XCG01451 = objectInput.readUTF();
		XCG01452 = objectInput.readUTF();
		XCG01453 = objectInput.readUTF();
		XCG01454 = objectInput.readUTF();
		XCG01455 = objectInput.readUTF();
		XCG01456 = objectInput.readUTF();
		XCG01457 = objectInput.readUTF();
		XCG01458 = objectInput.readUTF();
		XCG01459 = objectInput.readUTF();
		XCG01460 = objectInput.readUTF();
		XCG01461 = objectInput.readUTF();
		XCG01462 = objectInput.readUTF();
		XCG01463 = objectInput.readUTF();
		XCG01464 = objectInput.readUTF();
		XCG01465 = objectInput.readUTF();
		XCG01466 = objectInput.readUTF();
		XCG01467 = objectInput.readUTF();
		XCG01468 = objectInput.readUTF();
		XCG01469 = objectInput.readUTF();
		XCG01470 = objectInput.readUTF();
		XCG01471 = objectInput.readUTF();
		XCG01472 = objectInput.readUTF();
		XCG01473 = objectInput.readUTF();
		XCG01474 = objectInput.readUTF();
		XCG01475 = objectInput.readUTF();
		XCG01476 = objectInput.readUTF();
		XCG01477 = objectInput.readUTF();
		XCG01478 = objectInput.readUTF();
		XCG01479 = objectInput.readUTF();
		XCG01480 = objectInput.readUTF();
		XCG01481 = objectInput.readUTF();
		XCG01482 = objectInput.readUTF();
		XCG01483 = objectInput.readUTF();
		XCG01484 = objectInput.readUTF();
		XCG01485 = objectInput.readUTF();
		XCG01486 = objectInput.readUTF();
		XCG01487 = objectInput.readUTF();
		XCG01488 = objectInput.readUTF();
		XCG01489 = objectInput.readUTF();
		XCG01490 = objectInput.readUTF();
		XCG01491 = objectInput.readUTF();
		XCG01492 = objectInput.readUTF();
		XCG01493 = objectInput.readUTF();
		XCG01494 = objectInput.readUTF();
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

		if (XCG01310 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01310);
		}

		if (XCG01311 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01311);
		}

		if (XCG01312 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01312);
		}

		if (XCG01313 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01313);
		}

		if (XCG01314 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01314);
		}

		if (XCG01315 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01315);
		}

		if (XCG01316 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01316);
		}

		if (XCG01317 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01317);
		}

		if (XCG01318 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01318);
		}

		if (XCG01319 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01319);
		}

		if (XCG01320 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01320);
		}

		if (XCG01321 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01321);
		}

		if (XCG01322 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01322);
		}

		if (XCG01323 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01323);
		}

		if (XCG01324 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01324);
		}

		if (XCG01325 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01325);
		}

		if (XCG01326 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01326);
		}

		if (XCG01327 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01327);
		}

		if (XCG01328 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01328);
		}

		if (XCG01330 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01330);
		}

		if (XCG01331 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01331);
		}

		if (XCG01332 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01332);
		}

		if (XCG01333 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01333);
		}

		if (XCG01334 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01334);
		}

		if (XCG01335 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01335);
		}

		if (XCG01336 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01336);
		}

		if (XCG01337 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01337);
		}

		if (XCG01338 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01338);
		}

		if (XCG01339 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01339);
		}

		if (XCG01340 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01340);
		}

		if (XCG01341 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01341);
		}

		if (XCG01342 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01342);
		}

		if (XCG01343 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01343);
		}

		if (XCG01344 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01344);
		}

		if (XCG01345 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01345);
		}

		if (XCG01346 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01346);
		}

		if (XCG01347 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01347);
		}

		if (XCG01348 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01348);
		}

		if (XCG01349 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01349);
		}

		if (XCG01350 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01350);
		}

		if (XCG01351 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01351);
		}

		if (XCG01352 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01352);
		}

		if (XCG01353 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01353);
		}

		if (XCG01354 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01354);
		}

		if (XCG01355 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01355);
		}

		if (XCG01356 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01356);
		}

		if (XCG01357 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01357);
		}

		if (XCG01358 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01358);
		}

		if (XCG01359 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01359);
		}

		if (XCG01360 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01360);
		}

		if (XCG01361 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01361);
		}

		if (XCG01362 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01362);
		}

		if (XCG01363 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01363);
		}

		if (XCG01364 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01364);
		}

		if (XCG01365 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01365);
		}

		if (XCG01366 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01366);
		}

		if (XCG01367 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01367);
		}

		if (XCG01368 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01368);
		}

		if (XCG01369 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01369);
		}

		if (XCG01370 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01370);
		}

		if (XCG01371 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01371);
		}

		if (XCG01372 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01372);
		}

		if (XCG01373 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01373);
		}

		if (XCG01374 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01374);
		}

		if (XCG01375 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01375);
		}

		if (XCG01376 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01376);
		}

		if (XCG01377 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01377);
		}

		if (XCG01378 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01378);
		}

		if (XCG01379 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01379);
		}

		if (XCG01381 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01381);
		}

		if (XCG01382 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01382);
		}

		if (XCG01383 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01383);
		}

		if (XCG01384 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01384);
		}

		if (XCG01385 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01385);
		}

		if (XCG01386 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01386);
		}

		if (XCG01387 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01387);
		}

		if (XCG01388 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01388);
		}

		if (XCG01389 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01389);
		}

		if (XCG01390 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01390);
		}

		if (XCG01391 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01391);
		}

		if (XCG01392 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01392);
		}

		if (XCG01393 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01393);
		}

		if (XCG01394 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01394);
		}

		if (XCG01395 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01395);
		}

		if (XCG01396 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01396);
		}

		if (XCG01397 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01397);
		}

		if (XCG01398 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01398);
		}

		if (XCG01399 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01399);
		}

		if (XCG01400 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01400);
		}

		if (XCG01402 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01402);
		}

		if (XCG01403 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01403);
		}

		if (XCG01404 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01404);
		}

		if (XCG01405 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01405);
		}

		if (XCG01406 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01406);
		}

		if (XCG01407 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01407);
		}

		if (XCG01408 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01408);
		}

		if (XCG01409 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01409);
		}

		if (XCG01410 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01410);
		}

		if (XCG01411 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01411);
		}

		if (XCG01412 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01412);
		}

		if (XCG01413 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01413);
		}

		if (XCG01414 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01414);
		}

		if (XCG01415 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01415);
		}

		if (XCG01416 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01416);
		}

		if (XCG01417 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01417);
		}

		if (XCG01418 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01418);
		}

		if (XCG01419 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01419);
		}

		if (XCG01420 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01420);
		}

		if (XCG01421 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01421);
		}

		if (XCG01422 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01422);
		}

		if (XCG01423 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01423);
		}

		if (XCG01424 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01424);
		}

		if (XCG01425 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01425);
		}

		if (XCG01426 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01426);
		}

		if (XCG01427 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01427);
		}

		if (XCG01428 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01428);
		}

		if (XCG01437 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01437);
		}

		if (XCG01429 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01429);
		}

		if (XCG01430 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01430);
		}

		if (XCG01431 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01431);
		}

		if (XCG01432 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01432);
		}

		if (XCG01433 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01433);
		}

		if (XCG01434 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01434);
		}

		if (XCG01435 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01435);
		}

		if (XCG01436 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01436);
		}

		if (XCG01439 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01439);
		}

		if (XCG01440 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01440);
		}

		if (XCG01441 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01441);
		}

		if (XCG01442 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01442);
		}

		if (XCG01443 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01443);
		}

		if (XCG01445 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01445);
		}

		if (XCG01446 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01446);
		}

		if (XCG01447 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01447);
		}

		if (XCG01448 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01448);
		}

		if (XCG01449 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01449);
		}

		if (XCG01450 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01450);
		}

		if (XCG01451 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01451);
		}

		if (XCG01452 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01452);
		}

		if (XCG01453 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01453);
		}

		if (XCG01454 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01454);
		}

		if (XCG01455 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01455);
		}

		if (XCG01456 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01456);
		}

		if (XCG01457 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01457);
		}

		if (XCG01458 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01458);
		}

		if (XCG01459 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01459);
		}

		if (XCG01460 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01460);
		}

		if (XCG01461 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01461);
		}

		if (XCG01462 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01462);
		}

		if (XCG01463 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01463);
		}

		if (XCG01464 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01464);
		}

		if (XCG01465 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01465);
		}

		if (XCG01466 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01466);
		}

		if (XCG01467 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01467);
		}

		if (XCG01468 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01468);
		}

		if (XCG01469 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01469);
		}

		if (XCG01470 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01470);
		}

		if (XCG01471 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01471);
		}

		if (XCG01472 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01472);
		}

		if (XCG01473 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01473);
		}

		if (XCG01474 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01474);
		}

		if (XCG01475 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01475);
		}

		if (XCG01476 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01476);
		}

		if (XCG01477 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01477);
		}

		if (XCG01478 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01478);
		}

		if (XCG01479 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01479);
		}

		if (XCG01480 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01480);
		}

		if (XCG01481 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01481);
		}

		if (XCG01482 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01482);
		}

		if (XCG01483 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01483);
		}

		if (XCG01484 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01484);
		}

		if (XCG01485 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01485);
		}

		if (XCG01486 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01486);
		}

		if (XCG01487 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01487);
		}

		if (XCG01488 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01488);
		}

		if (XCG01489 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01489);
		}

		if (XCG01490 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01490);
		}

		if (XCG01491 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01491);
		}

		if (XCG01492 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01492);
		}

		if (XCG01493 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01493);
		}

		if (XCG01494 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01494);
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
	public String XCG01310;
	public String XCG01311;
	public String XCG01312;
	public String XCG01313;
	public String XCG01314;
	public String XCG01315;
	public String XCG01316;
	public String XCG01317;
	public String XCG01318;
	public String XCG01319;
	public String XCG01320;
	public String XCG01321;
	public String XCG01322;
	public String XCG01323;
	public String XCG01324;
	public String XCG01325;
	public String XCG01326;
	public String XCG01327;
	public String XCG01328;
	public String XCG01330;
	public String XCG01331;
	public String XCG01332;
	public String XCG01333;
	public String XCG01334;
	public String XCG01335;
	public String XCG01336;
	public String XCG01337;
	public String XCG01338;
	public String XCG01339;
	public String XCG01340;
	public String XCG01341;
	public String XCG01342;
	public String XCG01343;
	public String XCG01344;
	public String XCG01345;
	public String XCG01346;
	public String XCG01347;
	public String XCG01348;
	public String XCG01349;
	public String XCG01350;
	public String XCG01351;
	public String XCG01352;
	public String XCG01353;
	public String XCG01354;
	public String XCG01355;
	public String XCG01356;
	public String XCG01357;
	public String XCG01358;
	public String XCG01359;
	public String XCG01360;
	public String XCG01361;
	public String XCG01362;
	public String XCG01363;
	public String XCG01364;
	public String XCG01365;
	public String XCG01366;
	public String XCG01367;
	public String XCG01368;
	public String XCG01369;
	public String XCG01370;
	public String XCG01371;
	public String XCG01372;
	public String XCG01373;
	public String XCG01374;
	public String XCG01375;
	public String XCG01376;
	public String XCG01377;
	public String XCG01378;
	public String XCG01379;
	public String XCG01381;
	public String XCG01382;
	public String XCG01383;
	public String XCG01384;
	public String XCG01385;
	public String XCG01386;
	public String XCG01387;
	public String XCG01388;
	public String XCG01389;
	public String XCG01390;
	public String XCG01391;
	public String XCG01392;
	public String XCG01393;
	public String XCG01394;
	public String XCG01395;
	public String XCG01396;
	public String XCG01397;
	public String XCG01398;
	public String XCG01399;
	public String XCG01400;
	public String XCG01402;
	public String XCG01403;
	public String XCG01404;
	public String XCG01405;
	public String XCG01406;
	public String XCG01407;
	public String XCG01408;
	public String XCG01409;
	public String XCG01410;
	public String XCG01411;
	public String XCG01412;
	public String XCG01413;
	public String XCG01414;
	public String XCG01415;
	public String XCG01416;
	public String XCG01417;
	public String XCG01418;
	public String XCG01419;
	public String XCG01420;
	public String XCG01421;
	public String XCG01422;
	public String XCG01423;
	public String XCG01424;
	public String XCG01425;
	public String XCG01426;
	public String XCG01427;
	public String XCG01428;
	public String XCG01437;
	public String XCG01429;
	public String XCG01430;
	public String XCG01431;
	public String XCG01432;
	public String XCG01433;
	public String XCG01434;
	public String XCG01435;
	public String XCG01436;
	public String XCG01439;
	public String XCG01440;
	public String XCG01441;
	public String XCG01442;
	public String XCG01443;
	public String XCG01445;
	public String XCG01446;
	public String XCG01447;
	public String XCG01448;
	public String XCG01449;
	public String XCG01450;
	public String XCG01451;
	public String XCG01452;
	public String XCG01453;
	public String XCG01454;
	public String XCG01455;
	public String XCG01456;
	public String XCG01457;
	public String XCG01458;
	public String XCG01459;
	public String XCG01460;
	public String XCG01461;
	public String XCG01462;
	public String XCG01463;
	public String XCG01464;
	public String XCG01465;
	public String XCG01466;
	public String XCG01467;
	public String XCG01468;
	public String XCG01469;
	public String XCG01470;
	public String XCG01471;
	public String XCG01472;
	public String XCG01473;
	public String XCG01474;
	public String XCG01475;
	public String XCG01476;
	public String XCG01477;
	public String XCG01478;
	public String XCG01479;
	public String XCG01480;
	public String XCG01481;
	public String XCG01482;
	public String XCG01483;
	public String XCG01484;
	public String XCG01485;
	public String XCG01486;
	public String XCG01487;
	public String XCG01488;
	public String XCG01489;
	public String XCG01490;
	public String XCG01491;
	public String XCG01492;
	public String XCG01493;
	public String XCG01494;
	public long modifyDate;
	public long syncDate;
}