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

import com.fds.vr.business.model.VRTechnicalSpec_XCNPart3;

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
 * The cache model class for representing VRTechnicalSpec_XCNPart3 in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCNPart3
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCNPart3CacheModel implements CacheModel<VRTechnicalSpec_XCNPart3>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCNPart3CacheModel)) {
			return false;
		}

		VRTechnicalSpec_XCNPart3CacheModel vrTechnicalSpec_XCNPart3CacheModel = (VRTechnicalSpec_XCNPart3CacheModel)obj;

		if (id == vrTechnicalSpec_XCNPart3CacheModel.id) {
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
		StringBundler sb = new StringBundler(343);

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
		sb.append(", XCN01336=");
		sb.append(XCN01336);
		sb.append(", XCN01337=");
		sb.append(XCN01337);
		sb.append(", XCN01338=");
		sb.append(XCN01338);
		sb.append(", XCN01339=");
		sb.append(XCN01339);
		sb.append(", XCN01340=");
		sb.append(XCN01340);
		sb.append(", XCN01341=");
		sb.append(XCN01341);
		sb.append(", XCN01342=");
		sb.append(XCN01342);
		sb.append(", XCN01343=");
		sb.append(XCN01343);
		sb.append(", XCN01344=");
		sb.append(XCN01344);
		sb.append(", XCN01345=");
		sb.append(XCN01345);
		sb.append(", XCN01346=");
		sb.append(XCN01346);
		sb.append(", XCN01347=");
		sb.append(XCN01347);
		sb.append(", XCN01348=");
		sb.append(XCN01348);
		sb.append(", XCN01349=");
		sb.append(XCN01349);
		sb.append(", XCN01350=");
		sb.append(XCN01350);
		sb.append(", XCN01351=");
		sb.append(XCN01351);
		sb.append(", XCN01352=");
		sb.append(XCN01352);
		sb.append(", XCN01353=");
		sb.append(XCN01353);
		sb.append(", XCN01354=");
		sb.append(XCN01354);
		sb.append(", XCN01355=");
		sb.append(XCN01355);
		sb.append(", XCN01356=");
		sb.append(XCN01356);
		sb.append(", XCN01357=");
		sb.append(XCN01357);
		sb.append(", XCN01358=");
		sb.append(XCN01358);
		sb.append(", XCN01359=");
		sb.append(XCN01359);
		sb.append(", XCN01360=");
		sb.append(XCN01360);
		sb.append(", XCN01361=");
		sb.append(XCN01361);
		sb.append(", XCN01362=");
		sb.append(XCN01362);
		sb.append(", XCN01363=");
		sb.append(XCN01363);
		sb.append(", XCN01364=");
		sb.append(XCN01364);
		sb.append(", XCN01365=");
		sb.append(XCN01365);
		sb.append(", XCN01366=");
		sb.append(XCN01366);
		sb.append(", XCN01367=");
		sb.append(XCN01367);
		sb.append(", XCN01368=");
		sb.append(XCN01368);
		sb.append(", XCN01369=");
		sb.append(XCN01369);
		sb.append(", XCN01370=");
		sb.append(XCN01370);
		sb.append(", XCN01371=");
		sb.append(XCN01371);
		sb.append(", XCN01372=");
		sb.append(XCN01372);
		sb.append(", XCN01373=");
		sb.append(XCN01373);
		sb.append(", XCN01374=");
		sb.append(XCN01374);
		sb.append(", XCN01375=");
		sb.append(XCN01375);
		sb.append(", XCN01376=");
		sb.append(XCN01376);
		sb.append(", XCN01377=");
		sb.append(XCN01377);
		sb.append(", XCN01378=");
		sb.append(XCN01378);
		sb.append(", XCN01379=");
		sb.append(XCN01379);
		sb.append(", XCN01380=");
		sb.append(XCN01380);
		sb.append(", XCN01381=");
		sb.append(XCN01381);
		sb.append(", XCN01382=");
		sb.append(XCN01382);
		sb.append(", XCN01383=");
		sb.append(XCN01383);
		sb.append(", XCN01384=");
		sb.append(XCN01384);
		sb.append(", XCN01385=");
		sb.append(XCN01385);
		sb.append(", XCN01386=");
		sb.append(XCN01386);
		sb.append(", XCN01387=");
		sb.append(XCN01387);
		sb.append(", XCN01388=");
		sb.append(XCN01388);
		sb.append(", XCN01389=");
		sb.append(XCN01389);
		sb.append(", XCN01390=");
		sb.append(XCN01390);
		sb.append(", XCN01391=");
		sb.append(XCN01391);
		sb.append(", XCN01392=");
		sb.append(XCN01392);
		sb.append(", XCN01393=");
		sb.append(XCN01393);
		sb.append(", XCN01394=");
		sb.append(XCN01394);
		sb.append(", XCN01395=");
		sb.append(XCN01395);
		sb.append(", XCN01396=");
		sb.append(XCN01396);
		sb.append(", XCN01397=");
		sb.append(XCN01397);
		sb.append(", XCN01398=");
		sb.append(XCN01398);
		sb.append(", XCN01399=");
		sb.append(XCN01399);
		sb.append(", XCN01400=");
		sb.append(XCN01400);
		sb.append(", XCN01401=");
		sb.append(XCN01401);
		sb.append(", XCN01402=");
		sb.append(XCN01402);
		sb.append(", XCN01403=");
		sb.append(XCN01403);
		sb.append(", XCN01404=");
		sb.append(XCN01404);
		sb.append(", XCN01405=");
		sb.append(XCN01405);
		sb.append(", XCN01406=");
		sb.append(XCN01406);
		sb.append(", XCN01407=");
		sb.append(XCN01407);
		sb.append(", XCN01408=");
		sb.append(XCN01408);
		sb.append(", XCN01409=");
		sb.append(XCN01409);
		sb.append(", XCN01410=");
		sb.append(XCN01410);
		sb.append(", XCN01411=");
		sb.append(XCN01411);
		sb.append(", XCN01412=");
		sb.append(XCN01412);
		sb.append(", XCN01413=");
		sb.append(XCN01413);
		sb.append(", XCN01414=");
		sb.append(XCN01414);
		sb.append(", XCN01415=");
		sb.append(XCN01415);
		sb.append(", XCN01416=");
		sb.append(XCN01416);
		sb.append(", XCN01417=");
		sb.append(XCN01417);
		sb.append(", XCN01418=");
		sb.append(XCN01418);
		sb.append(", XCN01419=");
		sb.append(XCN01419);
		sb.append(", XCN01420=");
		sb.append(XCN01420);
		sb.append(", XCN01421=");
		sb.append(XCN01421);
		sb.append(", XCN01422=");
		sb.append(XCN01422);
		sb.append(", XCN01423=");
		sb.append(XCN01423);
		sb.append(", XCN01424=");
		sb.append(XCN01424);
		sb.append(", XCN01425=");
		sb.append(XCN01425);
		sb.append(", XCN01426=");
		sb.append(XCN01426);
		sb.append(", XCN01427=");
		sb.append(XCN01427);
		sb.append(", XCN01428=");
		sb.append(XCN01428);
		sb.append(", XCN01429=");
		sb.append(XCN01429);
		sb.append(", XCN01430=");
		sb.append(XCN01430);
		sb.append(", XCN01431=");
		sb.append(XCN01431);
		sb.append(", XCN01432=");
		sb.append(XCN01432);
		sb.append(", XCN01433=");
		sb.append(XCN01433);
		sb.append(", XCN01434=");
		sb.append(XCN01434);
		sb.append(", XCN01435=");
		sb.append(XCN01435);
		sb.append(", XCN01436=");
		sb.append(XCN01436);
		sb.append(", XCN01437=");
		sb.append(XCN01437);
		sb.append(", BBCNCLKLXCN001=");
		sb.append(BBCNCLKLXCN001);
		sb.append(", BBCNCLKLXCN002=");
		sb.append(BBCNCLKLXCN002);
		sb.append(", BBCNCLKLXCN003=");
		sb.append(BBCNCLKLXCN003);
		sb.append(", BBCNCLKLXCN004=");
		sb.append(BBCNCLKLXCN004);
		sb.append(", BBCNCLKLXCN005=");
		sb.append(BBCNCLKLXCN005);
		sb.append(", BBCNCLKLXCN006=");
		sb.append(BBCNCLKLXCN006);
		sb.append(", BBCNCLKLXCN012=");
		sb.append(BBCNCLKLXCN012);
		sb.append(", BBCNCLKLXCN013=");
		sb.append(BBCNCLKLXCN013);
		sb.append(", BBCNCLKLXCN014=");
		sb.append(BBCNCLKLXCN014);
		sb.append(", BBCNCLKLXCN015=");
		sb.append(BBCNCLKLXCN015);
		sb.append(", BBCNCLKLXCN016=");
		sb.append(BBCNCLKLXCN016);
		sb.append(", BBCNCLKLXCN017=");
		sb.append(BBCNCLKLXCN017);
		sb.append(", BBCNCLKLXCN018=");
		sb.append(BBCNCLKLXCN018);
		sb.append(", BBCNCLKLXCN019=");
		sb.append(BBCNCLKLXCN019);
		sb.append(", BBCNCLKLXCN020=");
		sb.append(BBCNCLKLXCN020);
		sb.append(", BBCNCLKLXCN021=");
		sb.append(BBCNCLKLXCN021);
		sb.append(", BBCNCLKLXCN022=");
		sb.append(BBCNCLKLXCN022);
		sb.append(", BBCNCLKLXCN026=");
		sb.append(BBCNCLKLXCN026);
		sb.append(", BBCNCLKLXCN027=");
		sb.append(BBCNCLKLXCN027);
		sb.append(", BBCNCLKLXCN028=");
		sb.append(BBCNCLKLXCN028);
		sb.append(", BBCNCLKLXCN033=");
		sb.append(BBCNCLKLXCN033);
		sb.append(", BBCNCLKLXCN034=");
		sb.append(BBCNCLKLXCN034);
		sb.append(", BBCNCLKLXCN037=");
		sb.append(BBCNCLKLXCN037);
		sb.append(", BBCNCLKLXCN038=");
		sb.append(BBCNCLKLXCN038);
		sb.append(", BBCNCLKLXCN039=");
		sb.append(BBCNCLKLXCN039);
		sb.append(", BBCNCLKLXCN040=");
		sb.append(BBCNCLKLXCN040);
		sb.append(", BBCNCLKLXCN041=");
		sb.append(BBCNCLKLXCN041);
		sb.append(", BBCNCLKLXCN042=");
		sb.append(BBCNCLKLXCN042);
		sb.append(", BBCNCLKLXCN043=");
		sb.append(BBCNCLKLXCN043);
		sb.append(", BBCNCLKLXCN044=");
		sb.append(BBCNCLKLXCN044);
		sb.append(", BBCNCLKLXCN045=");
		sb.append(BBCNCLKLXCN045);
		sb.append(", BBCNCLKLXCN046=");
		sb.append(BBCNCLKLXCN046);
		sb.append(", BBCNCLKLXCN047=");
		sb.append(BBCNCLKLXCN047);
		sb.append(", BBCNCLKLXCN053=");
		sb.append(BBCNCLKLXCN053);
		sb.append(", BBCNCLKLXCN054=");
		sb.append(BBCNCLKLXCN054);
		sb.append(", BBKTSPMXCN001=");
		sb.append(BBKTSPMXCN001);
		sb.append(", BBKTSPMXCN002=");
		sb.append(BBKTSPMXCN002);
		sb.append(", BBKTSPMXCN003=");
		sb.append(BBKTSPMXCN003);
		sb.append(", BBKTSPMXCN004=");
		sb.append(BBKTSPMXCN004);
		sb.append(", BBKTSPMXCN005=");
		sb.append(BBKTSPMXCN005);
		sb.append(", BBKTSPMXCN006=");
		sb.append(BBKTSPMXCN006);
		sb.append(", BBKTSPMXCN007=");
		sb.append(BBKTSPMXCN007);
		sb.append(", BBKTSPMXCN008=");
		sb.append(BBKTSPMXCN008);
		sb.append(", BBKTSPMXCN009=");
		sb.append(BBKTSPMXCN009);
		sb.append(", BBKTSPMXCN012=");
		sb.append(BBKTSPMXCN012);
		sb.append(", BBKTSPMXCN013=");
		sb.append(BBKTSPMXCN013);
		sb.append(", BBKTSPMXCN014=");
		sb.append(BBKTSPMXCN014);
		sb.append(", BBKTSPMXCN015=");
		sb.append(BBKTSPMXCN015);
		sb.append(", BBKTSPMXCN016=");
		sb.append(BBKTSPMXCN016);
		sb.append(", BBKTSPMXCN017=");
		sb.append(BBKTSPMXCN017);
		sb.append(", BBKTSPMXCN018=");
		sb.append(BBKTSPMXCN018);
		sb.append(", BBKTSPMXCN019=");
		sb.append(BBKTSPMXCN019);
		sb.append(", BBKTSPMXCN020=");
		sb.append(BBKTSPMXCN020);
		sb.append(", BBKTSPMXCN021=");
		sb.append(BBKTSPMXCN021);
		sb.append(", BBKTSPMXCN022=");
		sb.append(BBKTSPMXCN022);
		sb.append(", BBKTSPMXCN023=");
		sb.append(BBKTSPMXCN023);
		sb.append(", BBKTSPMXCN024=");
		sb.append(BBKTSPMXCN024);
		sb.append(", BBKTSPMXCN025=");
		sb.append(BBKTSPMXCN025);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XCNPart3 toEntityModel() {
		VRTechnicalSpec_XCNPart3Impl vrTechnicalSpec_XCNPart3Impl = new VRTechnicalSpec_XCNPart3Impl();

		vrTechnicalSpec_XCNPart3Impl.setId(id);
		vrTechnicalSpec_XCNPart3Impl.setMtCore(mtCore);
		vrTechnicalSpec_XCNPart3Impl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XCNPart3Impl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XCNPart3Impl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XCNPart3Impl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XCNPart3Impl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XCNPart3Impl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XCNPart3Impl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XCN01336 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01336(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01336(XCN01336);
		}

		if (XCN01337 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01337(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01337(XCN01337);
		}

		if (XCN01338 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01338(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01338(XCN01338);
		}

		if (XCN01339 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01339(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01339(XCN01339);
		}

		if (XCN01340 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01340(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01340(XCN01340);
		}

		if (XCN01341 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01341(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01341(XCN01341);
		}

		if (XCN01342 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01342(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01342(XCN01342);
		}

		if (XCN01343 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01343(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01343(XCN01343);
		}

		if (XCN01344 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01344(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01344(XCN01344);
		}

		if (XCN01345 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01345(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01345(XCN01345);
		}

		if (XCN01346 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01346(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01346(XCN01346);
		}

		if (XCN01347 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01347(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01347(XCN01347);
		}

		if (XCN01348 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01348(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01348(XCN01348);
		}

		if (XCN01349 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01349(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01349(XCN01349);
		}

		if (XCN01350 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01350(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01350(XCN01350);
		}

		if (XCN01351 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01351(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01351(XCN01351);
		}

		if (XCN01352 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01352(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01352(XCN01352);
		}

		if (XCN01353 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01353(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01353(XCN01353);
		}

		if (XCN01354 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01354(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01354(XCN01354);
		}

		if (XCN01355 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01355(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01355(XCN01355);
		}

		if (XCN01356 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01356(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01356(XCN01356);
		}

		if (XCN01357 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01357(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01357(XCN01357);
		}

		if (XCN01358 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01358(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01358(XCN01358);
		}

		if (XCN01359 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01359(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01359(XCN01359);
		}

		if (XCN01360 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01360(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01360(XCN01360);
		}

		if (XCN01361 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01361(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01361(XCN01361);
		}

		if (XCN01362 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01362(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01362(XCN01362);
		}

		if (XCN01363 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01363(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01363(XCN01363);
		}

		if (XCN01364 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01364(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01364(XCN01364);
		}

		if (XCN01365 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01365(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01365(XCN01365);
		}

		if (XCN01366 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01366(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01366(XCN01366);
		}

		if (XCN01367 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01367(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01367(XCN01367);
		}

		if (XCN01368 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01368(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01368(XCN01368);
		}

		if (XCN01369 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01369(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01369(XCN01369);
		}

		if (XCN01370 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01370(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01370(XCN01370);
		}

		if (XCN01371 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01371(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01371(XCN01371);
		}

		if (XCN01372 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01372(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01372(XCN01372);
		}

		if (XCN01373 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01373(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01373(XCN01373);
		}

		if (XCN01374 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01374(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01374(XCN01374);
		}

		if (XCN01375 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01375(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01375(XCN01375);
		}

		if (XCN01376 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01376(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01376(XCN01376);
		}

		if (XCN01377 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01377(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01377(XCN01377);
		}

		if (XCN01378 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01378(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01378(XCN01378);
		}

		if (XCN01379 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01379(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01379(XCN01379);
		}

		if (XCN01380 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01380(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01380(XCN01380);
		}

		if (XCN01381 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01381(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01381(XCN01381);
		}

		if (XCN01382 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01382(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01382(XCN01382);
		}

		if (XCN01383 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01383(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01383(XCN01383);
		}

		if (XCN01384 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01384(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01384(XCN01384);
		}

		if (XCN01385 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01385(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01385(XCN01385);
		}

		if (XCN01386 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01386(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01386(XCN01386);
		}

		if (XCN01387 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01387(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01387(XCN01387);
		}

		if (XCN01388 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01388(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01388(XCN01388);
		}

		if (XCN01389 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01389(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01389(XCN01389);
		}

		if (XCN01390 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01390(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01390(XCN01390);
		}

		if (XCN01391 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01391(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01391(XCN01391);
		}

		if (XCN01392 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01392(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01392(XCN01392);
		}

		if (XCN01393 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01393(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01393(XCN01393);
		}

		if (XCN01394 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01394(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01394(XCN01394);
		}

		if (XCN01395 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01395(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01395(XCN01395);
		}

		if (XCN01396 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01396(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01396(XCN01396);
		}

		if (XCN01397 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01397(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01397(XCN01397);
		}

		if (XCN01398 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01398(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01398(XCN01398);
		}

		if (XCN01399 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01399(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01399(XCN01399);
		}

		if (XCN01400 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01400(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01400(XCN01400);
		}

		if (XCN01401 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01401(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01401(XCN01401);
		}

		if (XCN01402 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01402(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01402(XCN01402);
		}

		if (XCN01403 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01403(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01403(XCN01403);
		}

		if (XCN01404 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01404(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01404(XCN01404);
		}

		if (XCN01405 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01405(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01405(XCN01405);
		}

		if (XCN01406 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01406(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01406(XCN01406);
		}

		if (XCN01407 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01407(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01407(XCN01407);
		}

		if (XCN01408 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01408(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01408(XCN01408);
		}

		if (XCN01409 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01409(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01409(XCN01409);
		}

		if (XCN01410 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01410(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01410(XCN01410);
		}

		if (XCN01411 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01411(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01411(XCN01411);
		}

		if (XCN01412 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01412(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01412(XCN01412);
		}

		if (XCN01413 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01413(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01413(XCN01413);
		}

		if (XCN01414 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01414(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01414(XCN01414);
		}

		if (XCN01415 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01415(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01415(XCN01415);
		}

		if (XCN01416 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01416(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01416(XCN01416);
		}

		if (XCN01417 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01417(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01417(XCN01417);
		}

		if (XCN01418 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01418(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01418(XCN01418);
		}

		if (XCN01419 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01419(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01419(XCN01419);
		}

		if (XCN01420 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01420(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01420(XCN01420);
		}

		if (XCN01421 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01421(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01421(XCN01421);
		}

		if (XCN01422 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01422(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01422(XCN01422);
		}

		if (XCN01423 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01423(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01423(XCN01423);
		}

		if (XCN01424 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01424(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01424(XCN01424);
		}

		if (XCN01425 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01425(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01425(XCN01425);
		}

		if (XCN01426 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01426(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01426(XCN01426);
		}

		if (XCN01427 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01427(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01427(XCN01427);
		}

		if (XCN01428 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01428(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01428(XCN01428);
		}

		if (XCN01429 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01429(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01429(XCN01429);
		}

		if (XCN01430 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01430(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01430(XCN01430);
		}

		if (XCN01431 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01431(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01431(XCN01431);
		}

		if (XCN01432 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01432(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01432(XCN01432);
		}

		if (XCN01433 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01433(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01433(XCN01433);
		}

		if (XCN01434 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01434(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01434(XCN01434);
		}

		if (XCN01435 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01435(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01435(XCN01435);
		}

		if (XCN01436 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01436(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01436(XCN01436);
		}

		if (XCN01437 == null) {
			vrTechnicalSpec_XCNPart3Impl.setXCN01437(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setXCN01437(XCN01437);
		}

		if (BBCNCLKLXCN001 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN001(BBCNCLKLXCN001);
		}

		if (BBCNCLKLXCN002 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN002(BBCNCLKLXCN002);
		}

		if (BBCNCLKLXCN003 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN003(BBCNCLKLXCN003);
		}

		if (BBCNCLKLXCN004 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN004(BBCNCLKLXCN004);
		}

		if (BBCNCLKLXCN005 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN005(BBCNCLKLXCN005);
		}

		if (BBCNCLKLXCN006 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN006(BBCNCLKLXCN006);
		}

		if (BBCNCLKLXCN012 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN012(BBCNCLKLXCN012);
		}

		if (BBCNCLKLXCN013 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN013(BBCNCLKLXCN013);
		}

		if (BBCNCLKLXCN014 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN014(BBCNCLKLXCN014);
		}

		if (BBCNCLKLXCN015 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN015(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN015(BBCNCLKLXCN015);
		}

		if (BBCNCLKLXCN016 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN016(BBCNCLKLXCN016);
		}

		if (BBCNCLKLXCN017 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN017(BBCNCLKLXCN017);
		}

		if (BBCNCLKLXCN018 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN018(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN018(BBCNCLKLXCN018);
		}

		if (BBCNCLKLXCN019 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN019(BBCNCLKLXCN019);
		}

		if (BBCNCLKLXCN020 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN020(BBCNCLKLXCN020);
		}

		if (BBCNCLKLXCN021 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN021(BBCNCLKLXCN021);
		}

		if (BBCNCLKLXCN022 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN022(BBCNCLKLXCN022);
		}

		if (BBCNCLKLXCN026 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN026(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN026(BBCNCLKLXCN026);
		}

		if (BBCNCLKLXCN027 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN027(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN027(BBCNCLKLXCN027);
		}

		if (BBCNCLKLXCN028 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN028(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN028(BBCNCLKLXCN028);
		}

		if (BBCNCLKLXCN033 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN033(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN033(BBCNCLKLXCN033);
		}

		if (BBCNCLKLXCN034 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN034(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN034(BBCNCLKLXCN034);
		}

		if (BBCNCLKLXCN037 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN037(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN037(BBCNCLKLXCN037);
		}

		if (BBCNCLKLXCN038 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN038(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN038(BBCNCLKLXCN038);
		}

		if (BBCNCLKLXCN039 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN039(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN039(BBCNCLKLXCN039);
		}

		if (BBCNCLKLXCN040 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN040(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN040(BBCNCLKLXCN040);
		}

		if (BBCNCLKLXCN041 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN041(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN041(BBCNCLKLXCN041);
		}

		if (BBCNCLKLXCN042 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN042(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN042(BBCNCLKLXCN042);
		}

		if (BBCNCLKLXCN043 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN043(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN043(BBCNCLKLXCN043);
		}

		if (BBCNCLKLXCN044 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN044(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN044(BBCNCLKLXCN044);
		}

		if (BBCNCLKLXCN045 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN045(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN045(BBCNCLKLXCN045);
		}

		if (BBCNCLKLXCN046 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN046(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN046(BBCNCLKLXCN046);
		}

		if (BBCNCLKLXCN047 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN047(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN047(BBCNCLKLXCN047);
		}

		if (BBCNCLKLXCN053 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN053(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN053(BBCNCLKLXCN053);
		}

		if (BBCNCLKLXCN054 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN054(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN054(BBCNCLKLXCN054);
		}

		if (BBKTSPMXCN001 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN001(BBKTSPMXCN001);
		}

		if (BBKTSPMXCN002 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN002(BBKTSPMXCN002);
		}

		if (BBKTSPMXCN003 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN003(BBKTSPMXCN003);
		}

		if (BBKTSPMXCN004 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN004(BBKTSPMXCN004);
		}

		if (BBKTSPMXCN005 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN005(BBKTSPMXCN005);
		}

		if (BBKTSPMXCN006 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN006(BBKTSPMXCN006);
		}

		if (BBKTSPMXCN007 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN007(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN007(BBKTSPMXCN007);
		}

		if (BBKTSPMXCN008 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN008(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN008(BBKTSPMXCN008);
		}

		if (BBKTSPMXCN009 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN009(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN009(BBKTSPMXCN009);
		}

		if (BBKTSPMXCN012 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN012(BBKTSPMXCN012);
		}

		if (BBKTSPMXCN013 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN013(BBKTSPMXCN013);
		}

		if (BBKTSPMXCN014 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN014(BBKTSPMXCN014);
		}

		if (BBKTSPMXCN015 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN015(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN015(BBKTSPMXCN015);
		}

		if (BBKTSPMXCN016 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN016(BBKTSPMXCN016);
		}

		if (BBKTSPMXCN017 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN017(BBKTSPMXCN017);
		}

		if (BBKTSPMXCN018 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN018(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN018(BBKTSPMXCN018);
		}

		if (BBKTSPMXCN019 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN019(BBKTSPMXCN019);
		}

		if (BBKTSPMXCN020 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN020(BBKTSPMXCN020);
		}

		if (BBKTSPMXCN021 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN021(BBKTSPMXCN021);
		}

		if (BBKTSPMXCN022 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN022(BBKTSPMXCN022);
		}

		if (BBKTSPMXCN023 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN023(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN023(BBKTSPMXCN023);
		}

		if (BBKTSPMXCN024 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN024(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN024(BBKTSPMXCN024);
		}

		if (BBKTSPMXCN025 == null) {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN025(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN025(BBKTSPMXCN025);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCNPart3Impl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCNPart3Impl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XCNPart3Impl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XCNPart3Impl.resetOriginalValues();

		return vrTechnicalSpec_XCNPart3Impl;
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
		XCN01336 = objectInput.readUTF();
		XCN01337 = objectInput.readUTF();
		XCN01338 = objectInput.readUTF();
		XCN01339 = objectInput.readUTF();
		XCN01340 = objectInput.readUTF();
		XCN01341 = objectInput.readUTF();
		XCN01342 = objectInput.readUTF();
		XCN01343 = objectInput.readUTF();
		XCN01344 = objectInput.readUTF();
		XCN01345 = objectInput.readUTF();
		XCN01346 = objectInput.readUTF();
		XCN01347 = objectInput.readUTF();
		XCN01348 = objectInput.readUTF();
		XCN01349 = objectInput.readUTF();
		XCN01350 = objectInput.readUTF();
		XCN01351 = objectInput.readUTF();
		XCN01352 = objectInput.readUTF();
		XCN01353 = objectInput.readUTF();
		XCN01354 = objectInput.readUTF();
		XCN01355 = objectInput.readUTF();
		XCN01356 = objectInput.readUTF();
		XCN01357 = objectInput.readUTF();
		XCN01358 = objectInput.readUTF();
		XCN01359 = objectInput.readUTF();
		XCN01360 = objectInput.readUTF();
		XCN01361 = objectInput.readUTF();
		XCN01362 = objectInput.readUTF();
		XCN01363 = objectInput.readUTF();
		XCN01364 = objectInput.readUTF();
		XCN01365 = objectInput.readUTF();
		XCN01366 = objectInput.readUTF();
		XCN01367 = objectInput.readUTF();
		XCN01368 = objectInput.readUTF();
		XCN01369 = objectInput.readUTF();
		XCN01370 = objectInput.readUTF();
		XCN01371 = objectInput.readUTF();
		XCN01372 = objectInput.readUTF();
		XCN01373 = objectInput.readUTF();
		XCN01374 = objectInput.readUTF();
		XCN01375 = objectInput.readUTF();
		XCN01376 = objectInput.readUTF();
		XCN01377 = objectInput.readUTF();
		XCN01378 = objectInput.readUTF();
		XCN01379 = objectInput.readUTF();
		XCN01380 = objectInput.readUTF();
		XCN01381 = objectInput.readUTF();
		XCN01382 = objectInput.readUTF();
		XCN01383 = objectInput.readUTF();
		XCN01384 = objectInput.readUTF();
		XCN01385 = objectInput.readUTF();
		XCN01386 = objectInput.readUTF();
		XCN01387 = objectInput.readUTF();
		XCN01388 = objectInput.readUTF();
		XCN01389 = objectInput.readUTF();
		XCN01390 = objectInput.readUTF();
		XCN01391 = objectInput.readUTF();
		XCN01392 = objectInput.readUTF();
		XCN01393 = objectInput.readUTF();
		XCN01394 = objectInput.readUTF();
		XCN01395 = objectInput.readUTF();
		XCN01396 = objectInput.readUTF();
		XCN01397 = objectInput.readUTF();
		XCN01398 = objectInput.readUTF();
		XCN01399 = objectInput.readUTF();
		XCN01400 = objectInput.readUTF();
		XCN01401 = objectInput.readUTF();
		XCN01402 = objectInput.readUTF();
		XCN01403 = objectInput.readUTF();
		XCN01404 = objectInput.readUTF();
		XCN01405 = objectInput.readUTF();
		XCN01406 = objectInput.readUTF();
		XCN01407 = objectInput.readUTF();
		XCN01408 = objectInput.readUTF();
		XCN01409 = objectInput.readUTF();
		XCN01410 = objectInput.readUTF();
		XCN01411 = objectInput.readUTF();
		XCN01412 = objectInput.readUTF();
		XCN01413 = objectInput.readUTF();
		XCN01414 = objectInput.readUTF();
		XCN01415 = objectInput.readUTF();
		XCN01416 = objectInput.readUTF();
		XCN01417 = objectInput.readUTF();
		XCN01418 = objectInput.readUTF();
		XCN01419 = objectInput.readUTF();
		XCN01420 = objectInput.readUTF();
		XCN01421 = objectInput.readUTF();
		XCN01422 = objectInput.readUTF();
		XCN01423 = objectInput.readUTF();
		XCN01424 = objectInput.readUTF();
		XCN01425 = objectInput.readUTF();
		XCN01426 = objectInput.readUTF();
		XCN01427 = objectInput.readUTF();
		XCN01428 = objectInput.readUTF();
		XCN01429 = objectInput.readUTF();
		XCN01430 = objectInput.readUTF();
		XCN01431 = objectInput.readUTF();
		XCN01432 = objectInput.readUTF();
		XCN01433 = objectInput.readUTF();
		XCN01434 = objectInput.readUTF();
		XCN01435 = objectInput.readUTF();
		XCN01436 = objectInput.readUTF();
		XCN01437 = objectInput.readUTF();
		BBCNCLKLXCN001 = objectInput.readUTF();
		BBCNCLKLXCN002 = objectInput.readUTF();
		BBCNCLKLXCN003 = objectInput.readUTF();
		BBCNCLKLXCN004 = objectInput.readUTF();
		BBCNCLKLXCN005 = objectInput.readUTF();
		BBCNCLKLXCN006 = objectInput.readUTF();
		BBCNCLKLXCN012 = objectInput.readUTF();
		BBCNCLKLXCN013 = objectInput.readUTF();
		BBCNCLKLXCN014 = objectInput.readUTF();
		BBCNCLKLXCN015 = objectInput.readUTF();
		BBCNCLKLXCN016 = objectInput.readUTF();
		BBCNCLKLXCN017 = objectInput.readUTF();
		BBCNCLKLXCN018 = objectInput.readUTF();
		BBCNCLKLXCN019 = objectInput.readUTF();
		BBCNCLKLXCN020 = objectInput.readUTF();
		BBCNCLKLXCN021 = objectInput.readUTF();
		BBCNCLKLXCN022 = objectInput.readUTF();
		BBCNCLKLXCN026 = objectInput.readUTF();
		BBCNCLKLXCN027 = objectInput.readUTF();
		BBCNCLKLXCN028 = objectInput.readUTF();
		BBCNCLKLXCN033 = objectInput.readUTF();
		BBCNCLKLXCN034 = objectInput.readUTF();
		BBCNCLKLXCN037 = objectInput.readUTF();
		BBCNCLKLXCN038 = objectInput.readUTF();
		BBCNCLKLXCN039 = objectInput.readUTF();
		BBCNCLKLXCN040 = objectInput.readUTF();
		BBCNCLKLXCN041 = objectInput.readUTF();
		BBCNCLKLXCN042 = objectInput.readUTF();
		BBCNCLKLXCN043 = objectInput.readUTF();
		BBCNCLKLXCN044 = objectInput.readUTF();
		BBCNCLKLXCN045 = objectInput.readUTF();
		BBCNCLKLXCN046 = objectInput.readUTF();
		BBCNCLKLXCN047 = objectInput.readUTF();
		BBCNCLKLXCN053 = objectInput.readUTF();
		BBCNCLKLXCN054 = objectInput.readUTF();
		BBKTSPMXCN001 = objectInput.readUTF();
		BBKTSPMXCN002 = objectInput.readUTF();
		BBKTSPMXCN003 = objectInput.readUTF();
		BBKTSPMXCN004 = objectInput.readUTF();
		BBKTSPMXCN005 = objectInput.readUTF();
		BBKTSPMXCN006 = objectInput.readUTF();
		BBKTSPMXCN007 = objectInput.readUTF();
		BBKTSPMXCN008 = objectInput.readUTF();
		BBKTSPMXCN009 = objectInput.readUTF();
		BBKTSPMXCN012 = objectInput.readUTF();
		BBKTSPMXCN013 = objectInput.readUTF();
		BBKTSPMXCN014 = objectInput.readUTF();
		BBKTSPMXCN015 = objectInput.readUTF();
		BBKTSPMXCN016 = objectInput.readUTF();
		BBKTSPMXCN017 = objectInput.readUTF();
		BBKTSPMXCN018 = objectInput.readUTF();
		BBKTSPMXCN019 = objectInput.readUTF();
		BBKTSPMXCN020 = objectInput.readUTF();
		BBKTSPMXCN021 = objectInput.readUTF();
		BBKTSPMXCN022 = objectInput.readUTF();
		BBKTSPMXCN023 = objectInput.readUTF();
		BBKTSPMXCN024 = objectInput.readUTF();
		BBKTSPMXCN025 = objectInput.readUTF();
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

		if (XCN01336 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01336);
		}

		if (XCN01337 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01337);
		}

		if (XCN01338 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01338);
		}

		if (XCN01339 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01339);
		}

		if (XCN01340 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01340);
		}

		if (XCN01341 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01341);
		}

		if (XCN01342 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01342);
		}

		if (XCN01343 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01343);
		}

		if (XCN01344 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01344);
		}

		if (XCN01345 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01345);
		}

		if (XCN01346 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01346);
		}

		if (XCN01347 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01347);
		}

		if (XCN01348 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01348);
		}

		if (XCN01349 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01349);
		}

		if (XCN01350 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01350);
		}

		if (XCN01351 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01351);
		}

		if (XCN01352 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01352);
		}

		if (XCN01353 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01353);
		}

		if (XCN01354 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01354);
		}

		if (XCN01355 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01355);
		}

		if (XCN01356 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01356);
		}

		if (XCN01357 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01357);
		}

		if (XCN01358 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01358);
		}

		if (XCN01359 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01359);
		}

		if (XCN01360 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01360);
		}

		if (XCN01361 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01361);
		}

		if (XCN01362 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01362);
		}

		if (XCN01363 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01363);
		}

		if (XCN01364 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01364);
		}

		if (XCN01365 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01365);
		}

		if (XCN01366 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01366);
		}

		if (XCN01367 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01367);
		}

		if (XCN01368 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01368);
		}

		if (XCN01369 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01369);
		}

		if (XCN01370 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01370);
		}

		if (XCN01371 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01371);
		}

		if (XCN01372 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01372);
		}

		if (XCN01373 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01373);
		}

		if (XCN01374 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01374);
		}

		if (XCN01375 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01375);
		}

		if (XCN01376 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01376);
		}

		if (XCN01377 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01377);
		}

		if (XCN01378 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01378);
		}

		if (XCN01379 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01379);
		}

		if (XCN01380 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01380);
		}

		if (XCN01381 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01381);
		}

		if (XCN01382 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01382);
		}

		if (XCN01383 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01383);
		}

		if (XCN01384 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01384);
		}

		if (XCN01385 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01385);
		}

		if (XCN01386 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01386);
		}

		if (XCN01387 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01387);
		}

		if (XCN01388 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01388);
		}

		if (XCN01389 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01389);
		}

		if (XCN01390 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01390);
		}

		if (XCN01391 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01391);
		}

		if (XCN01392 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01392);
		}

		if (XCN01393 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01393);
		}

		if (XCN01394 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01394);
		}

		if (XCN01395 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01395);
		}

		if (XCN01396 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01396);
		}

		if (XCN01397 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01397);
		}

		if (XCN01398 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01398);
		}

		if (XCN01399 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01399);
		}

		if (XCN01400 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01400);
		}

		if (XCN01401 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01401);
		}

		if (XCN01402 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01402);
		}

		if (XCN01403 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01403);
		}

		if (XCN01404 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01404);
		}

		if (XCN01405 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01405);
		}

		if (XCN01406 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01406);
		}

		if (XCN01407 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01407);
		}

		if (XCN01408 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01408);
		}

		if (XCN01409 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01409);
		}

		if (XCN01410 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01410);
		}

		if (XCN01411 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01411);
		}

		if (XCN01412 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01412);
		}

		if (XCN01413 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01413);
		}

		if (XCN01414 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01414);
		}

		if (XCN01415 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01415);
		}

		if (XCN01416 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01416);
		}

		if (XCN01417 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01417);
		}

		if (XCN01418 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01418);
		}

		if (XCN01419 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01419);
		}

		if (XCN01420 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01420);
		}

		if (XCN01421 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01421);
		}

		if (XCN01422 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01422);
		}

		if (XCN01423 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01423);
		}

		if (XCN01424 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01424);
		}

		if (XCN01425 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01425);
		}

		if (XCN01426 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01426);
		}

		if (XCN01427 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01427);
		}

		if (XCN01428 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01428);
		}

		if (XCN01429 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01429);
		}

		if (XCN01430 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01430);
		}

		if (XCN01431 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01431);
		}

		if (XCN01432 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01432);
		}

		if (XCN01433 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01433);
		}

		if (XCN01434 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01434);
		}

		if (XCN01435 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01435);
		}

		if (XCN01436 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01436);
		}

		if (XCN01437 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01437);
		}

		if (BBCNCLKLXCN001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN001);
		}

		if (BBCNCLKLXCN002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN002);
		}

		if (BBCNCLKLXCN003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN003);
		}

		if (BBCNCLKLXCN004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN004);
		}

		if (BBCNCLKLXCN005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN005);
		}

		if (BBCNCLKLXCN006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN006);
		}

		if (BBCNCLKLXCN012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN012);
		}

		if (BBCNCLKLXCN013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN013);
		}

		if (BBCNCLKLXCN014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN014);
		}

		if (BBCNCLKLXCN015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN015);
		}

		if (BBCNCLKLXCN016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN016);
		}

		if (BBCNCLKLXCN017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN017);
		}

		if (BBCNCLKLXCN018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN018);
		}

		if (BBCNCLKLXCN019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN019);
		}

		if (BBCNCLKLXCN020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN020);
		}

		if (BBCNCLKLXCN021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN021);
		}

		if (BBCNCLKLXCN022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN022);
		}

		if (BBCNCLKLXCN026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN026);
		}

		if (BBCNCLKLXCN027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN027);
		}

		if (BBCNCLKLXCN028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN028);
		}

		if (BBCNCLKLXCN033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN033);
		}

		if (BBCNCLKLXCN034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN034);
		}

		if (BBCNCLKLXCN037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN037);
		}

		if (BBCNCLKLXCN038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN038);
		}

		if (BBCNCLKLXCN039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN039);
		}

		if (BBCNCLKLXCN040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN040);
		}

		if (BBCNCLKLXCN041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN041);
		}

		if (BBCNCLKLXCN042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN042);
		}

		if (BBCNCLKLXCN043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN043);
		}

		if (BBCNCLKLXCN044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN044);
		}

		if (BBCNCLKLXCN045 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN045);
		}

		if (BBCNCLKLXCN046 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN046);
		}

		if (BBCNCLKLXCN047 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN047);
		}

		if (BBCNCLKLXCN053 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN053);
		}

		if (BBCNCLKLXCN054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCN054);
		}

		if (BBKTSPMXCN001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN001);
		}

		if (BBKTSPMXCN002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN002);
		}

		if (BBKTSPMXCN003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN003);
		}

		if (BBKTSPMXCN004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN004);
		}

		if (BBKTSPMXCN005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN005);
		}

		if (BBKTSPMXCN006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN006);
		}

		if (BBKTSPMXCN007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN007);
		}

		if (BBKTSPMXCN008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN008);
		}

		if (BBKTSPMXCN009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN009);
		}

		if (BBKTSPMXCN012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN012);
		}

		if (BBKTSPMXCN013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN013);
		}

		if (BBKTSPMXCN014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN014);
		}

		if (BBKTSPMXCN015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN015);
		}

		if (BBKTSPMXCN016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN016);
		}

		if (BBKTSPMXCN017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN017);
		}

		if (BBKTSPMXCN018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN018);
		}

		if (BBKTSPMXCN019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN019);
		}

		if (BBKTSPMXCN020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN020);
		}

		if (BBKTSPMXCN021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN021);
		}

		if (BBKTSPMXCN022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN022);
		}

		if (BBKTSPMXCN023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN023);
		}

		if (BBKTSPMXCN024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN024);
		}

		if (BBKTSPMXCN025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCN025);
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
	public String XCN01336;
	public String XCN01337;
	public String XCN01338;
	public String XCN01339;
	public String XCN01340;
	public String XCN01341;
	public String XCN01342;
	public String XCN01343;
	public String XCN01344;
	public String XCN01345;
	public String XCN01346;
	public String XCN01347;
	public String XCN01348;
	public String XCN01349;
	public String XCN01350;
	public String XCN01351;
	public String XCN01352;
	public String XCN01353;
	public String XCN01354;
	public String XCN01355;
	public String XCN01356;
	public String XCN01357;
	public String XCN01358;
	public String XCN01359;
	public String XCN01360;
	public String XCN01361;
	public String XCN01362;
	public String XCN01363;
	public String XCN01364;
	public String XCN01365;
	public String XCN01366;
	public String XCN01367;
	public String XCN01368;
	public String XCN01369;
	public String XCN01370;
	public String XCN01371;
	public String XCN01372;
	public String XCN01373;
	public String XCN01374;
	public String XCN01375;
	public String XCN01376;
	public String XCN01377;
	public String XCN01378;
	public String XCN01379;
	public String XCN01380;
	public String XCN01381;
	public String XCN01382;
	public String XCN01383;
	public String XCN01384;
	public String XCN01385;
	public String XCN01386;
	public String XCN01387;
	public String XCN01388;
	public String XCN01389;
	public String XCN01390;
	public String XCN01391;
	public String XCN01392;
	public String XCN01393;
	public String XCN01394;
	public String XCN01395;
	public String XCN01396;
	public String XCN01397;
	public String XCN01398;
	public String XCN01399;
	public String XCN01400;
	public String XCN01401;
	public String XCN01402;
	public String XCN01403;
	public String XCN01404;
	public String XCN01405;
	public String XCN01406;
	public String XCN01407;
	public String XCN01408;
	public String XCN01409;
	public String XCN01410;
	public String XCN01411;
	public String XCN01412;
	public String XCN01413;
	public String XCN01414;
	public String XCN01415;
	public String XCN01416;
	public String XCN01417;
	public String XCN01418;
	public String XCN01419;
	public String XCN01420;
	public String XCN01421;
	public String XCN01422;
	public String XCN01423;
	public String XCN01424;
	public String XCN01425;
	public String XCN01426;
	public String XCN01427;
	public String XCN01428;
	public String XCN01429;
	public String XCN01430;
	public String XCN01431;
	public String XCN01432;
	public String XCN01433;
	public String XCN01434;
	public String XCN01435;
	public String XCN01436;
	public String XCN01437;
	public String BBCNCLKLXCN001;
	public String BBCNCLKLXCN002;
	public String BBCNCLKLXCN003;
	public String BBCNCLKLXCN004;
	public String BBCNCLKLXCN005;
	public String BBCNCLKLXCN006;
	public String BBCNCLKLXCN012;
	public String BBCNCLKLXCN013;
	public String BBCNCLKLXCN014;
	public String BBCNCLKLXCN015;
	public String BBCNCLKLXCN016;
	public String BBCNCLKLXCN017;
	public String BBCNCLKLXCN018;
	public String BBCNCLKLXCN019;
	public String BBCNCLKLXCN020;
	public String BBCNCLKLXCN021;
	public String BBCNCLKLXCN022;
	public String BBCNCLKLXCN026;
	public String BBCNCLKLXCN027;
	public String BBCNCLKLXCN028;
	public String BBCNCLKLXCN033;
	public String BBCNCLKLXCN034;
	public String BBCNCLKLXCN037;
	public String BBCNCLKLXCN038;
	public String BBCNCLKLXCN039;
	public String BBCNCLKLXCN040;
	public String BBCNCLKLXCN041;
	public String BBCNCLKLXCN042;
	public String BBCNCLKLXCN043;
	public String BBCNCLKLXCN044;
	public String BBCNCLKLXCN045;
	public String BBCNCLKLXCN046;
	public String BBCNCLKLXCN047;
	public String BBCNCLKLXCN053;
	public String BBCNCLKLXCN054;
	public String BBKTSPMXCN001;
	public String BBKTSPMXCN002;
	public String BBKTSPMXCN003;
	public String BBKTSPMXCN004;
	public String BBKTSPMXCN005;
	public String BBKTSPMXCN006;
	public String BBKTSPMXCN007;
	public String BBKTSPMXCN008;
	public String BBKTSPMXCN009;
	public String BBKTSPMXCN012;
	public String BBKTSPMXCN013;
	public String BBKTSPMXCN014;
	public String BBKTSPMXCN015;
	public String BBKTSPMXCN016;
	public String BBKTSPMXCN017;
	public String BBKTSPMXCN018;
	public String BBKTSPMXCN019;
	public String BBKTSPMXCN020;
	public String BBKTSPMXCN021;
	public String BBKTSPMXCN022;
	public String BBKTSPMXCN023;
	public String BBKTSPMXCN024;
	public String BBKTSPMXCN025;
	public long modifyDate;
	public long syncDate;
}