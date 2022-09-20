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

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRTechnicalSpec_XCNPart3}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCNPart3
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCNPart3Wrapper implements VRTechnicalSpec_XCNPart3,
	ModelWrapper<VRTechnicalSpec_XCNPart3> {
	public VRTechnicalSpec_XCNPart3Wrapper(
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3) {
		_vrTechnicalSpec_XCNPart3 = vrTechnicalSpec_XCNPart3;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XCNPart3.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XCNPart3.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("convertAssembleId", getConvertAssembleId());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierNo", getDossierNo());
		attributes.put("referenceUid", getReferenceUid());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("deliverableCode", getDeliverableCode());
		attributes.put("vehicleTypeCertificateId", getVehicleTypeCertificateId());
		attributes.put("XCN01336", getXCN01336());
		attributes.put("XCN01337", getXCN01337());
		attributes.put("XCN01338", getXCN01338());
		attributes.put("XCN01339", getXCN01339());
		attributes.put("XCN01340", getXCN01340());
		attributes.put("XCN01341", getXCN01341());
		attributes.put("XCN01342", getXCN01342());
		attributes.put("XCN01343", getXCN01343());
		attributes.put("XCN01344", getXCN01344());
		attributes.put("XCN01345", getXCN01345());
		attributes.put("XCN01346", getXCN01346());
		attributes.put("XCN01347", getXCN01347());
		attributes.put("XCN01348", getXCN01348());
		attributes.put("XCN01349", getXCN01349());
		attributes.put("XCN01350", getXCN01350());
		attributes.put("XCN01351", getXCN01351());
		attributes.put("XCN01352", getXCN01352());
		attributes.put("XCN01353", getXCN01353());
		attributes.put("XCN01354", getXCN01354());
		attributes.put("XCN01355", getXCN01355());
		attributes.put("XCN01356", getXCN01356());
		attributes.put("XCN01357", getXCN01357());
		attributes.put("XCN01358", getXCN01358());
		attributes.put("XCN01359", getXCN01359());
		attributes.put("XCN01360", getXCN01360());
		attributes.put("XCN01361", getXCN01361());
		attributes.put("XCN01362", getXCN01362());
		attributes.put("XCN01363", getXCN01363());
		attributes.put("XCN01364", getXCN01364());
		attributes.put("XCN01365", getXCN01365());
		attributes.put("XCN01366", getXCN01366());
		attributes.put("XCN01367", getXCN01367());
		attributes.put("XCN01368", getXCN01368());
		attributes.put("XCN01369", getXCN01369());
		attributes.put("XCN01370", getXCN01370());
		attributes.put("XCN01371", getXCN01371());
		attributes.put("XCN01372", getXCN01372());
		attributes.put("XCN01373", getXCN01373());
		attributes.put("XCN01374", getXCN01374());
		attributes.put("XCN01375", getXCN01375());
		attributes.put("XCN01376", getXCN01376());
		attributes.put("XCN01377", getXCN01377());
		attributes.put("XCN01378", getXCN01378());
		attributes.put("XCN01379", getXCN01379());
		attributes.put("XCN01380", getXCN01380());
		attributes.put("XCN01381", getXCN01381());
		attributes.put("XCN01382", getXCN01382());
		attributes.put("XCN01383", getXCN01383());
		attributes.put("XCN01384", getXCN01384());
		attributes.put("XCN01385", getXCN01385());
		attributes.put("XCN01386", getXCN01386());
		attributes.put("XCN01387", getXCN01387());
		attributes.put("XCN01388", getXCN01388());
		attributes.put("XCN01389", getXCN01389());
		attributes.put("XCN01390", getXCN01390());
		attributes.put("XCN01391", getXCN01391());
		attributes.put("XCN01392", getXCN01392());
		attributes.put("XCN01393", getXCN01393());
		attributes.put("XCN01394", getXCN01394());
		attributes.put("XCN01395", getXCN01395());
		attributes.put("XCN01396", getXCN01396());
		attributes.put("XCN01397", getXCN01397());
		attributes.put("XCN01398", getXCN01398());
		attributes.put("XCN01399", getXCN01399());
		attributes.put("XCN01400", getXCN01400());
		attributes.put("XCN01401", getXCN01401());
		attributes.put("XCN01402", getXCN01402());
		attributes.put("XCN01403", getXCN01403());
		attributes.put("XCN01404", getXCN01404());
		attributes.put("XCN01405", getXCN01405());
		attributes.put("XCN01406", getXCN01406());
		attributes.put("XCN01407", getXCN01407());
		attributes.put("XCN01408", getXCN01408());
		attributes.put("XCN01409", getXCN01409());
		attributes.put("XCN01410", getXCN01410());
		attributes.put("XCN01411", getXCN01411());
		attributes.put("XCN01412", getXCN01412());
		attributes.put("XCN01413", getXCN01413());
		attributes.put("XCN01414", getXCN01414());
		attributes.put("XCN01415", getXCN01415());
		attributes.put("XCN01416", getXCN01416());
		attributes.put("XCN01417", getXCN01417());
		attributes.put("XCN01418", getXCN01418());
		attributes.put("XCN01419", getXCN01419());
		attributes.put("XCN01420", getXCN01420());
		attributes.put("XCN01421", getXCN01421());
		attributes.put("XCN01422", getXCN01422());
		attributes.put("XCN01423", getXCN01423());
		attributes.put("XCN01424", getXCN01424());
		attributes.put("XCN01425", getXCN01425());
		attributes.put("XCN01426", getXCN01426());
		attributes.put("XCN01427", getXCN01427());
		attributes.put("XCN01428", getXCN01428());
		attributes.put("XCN01429", getXCN01429());
		attributes.put("XCN01430", getXCN01430());
		attributes.put("XCN01431", getXCN01431());
		attributes.put("XCN01432", getXCN01432());
		attributes.put("XCN01433", getXCN01433());
		attributes.put("XCN01434", getXCN01434());
		attributes.put("XCN01435", getXCN01435());
		attributes.put("XCN01436", getXCN01436());
		attributes.put("XCN01437", getXCN01437());
		attributes.put("BBCNCLKLXCN001", getBBCNCLKLXCN001());
		attributes.put("BBCNCLKLXCN002", getBBCNCLKLXCN002());
		attributes.put("BBCNCLKLXCN003", getBBCNCLKLXCN003());
		attributes.put("BBCNCLKLXCN004", getBBCNCLKLXCN004());
		attributes.put("BBCNCLKLXCN005", getBBCNCLKLXCN005());
		attributes.put("BBCNCLKLXCN006", getBBCNCLKLXCN006());
		attributes.put("BBCNCLKLXCN012", getBBCNCLKLXCN012());
		attributes.put("BBCNCLKLXCN013", getBBCNCLKLXCN013());
		attributes.put("BBCNCLKLXCN014", getBBCNCLKLXCN014());
		attributes.put("BBCNCLKLXCN015", getBBCNCLKLXCN015());
		attributes.put("BBCNCLKLXCN016", getBBCNCLKLXCN016());
		attributes.put("BBCNCLKLXCN017", getBBCNCLKLXCN017());
		attributes.put("BBCNCLKLXCN018", getBBCNCLKLXCN018());
		attributes.put("BBCNCLKLXCN019", getBBCNCLKLXCN019());
		attributes.put("BBCNCLKLXCN020", getBBCNCLKLXCN020());
		attributes.put("BBCNCLKLXCN021", getBBCNCLKLXCN021());
		attributes.put("BBCNCLKLXCN022", getBBCNCLKLXCN022());
		attributes.put("BBCNCLKLXCN026", getBBCNCLKLXCN026());
		attributes.put("BBCNCLKLXCN027", getBBCNCLKLXCN027());
		attributes.put("BBCNCLKLXCN028", getBBCNCLKLXCN028());
		attributes.put("BBCNCLKLXCN033", getBBCNCLKLXCN033());
		attributes.put("BBCNCLKLXCN034", getBBCNCLKLXCN034());
		attributes.put("BBCNCLKLXCN037", getBBCNCLKLXCN037());
		attributes.put("BBCNCLKLXCN038", getBBCNCLKLXCN038());
		attributes.put("BBCNCLKLXCN039", getBBCNCLKLXCN039());
		attributes.put("BBCNCLKLXCN040", getBBCNCLKLXCN040());
		attributes.put("BBCNCLKLXCN041", getBBCNCLKLXCN041());
		attributes.put("BBCNCLKLXCN042", getBBCNCLKLXCN042());
		attributes.put("BBCNCLKLXCN043", getBBCNCLKLXCN043());
		attributes.put("BBCNCLKLXCN044", getBBCNCLKLXCN044());
		attributes.put("BBCNCLKLXCN045", getBBCNCLKLXCN045());
		attributes.put("BBCNCLKLXCN046", getBBCNCLKLXCN046());
		attributes.put("BBCNCLKLXCN047", getBBCNCLKLXCN047());
		attributes.put("BBCNCLKLXCN053", getBBCNCLKLXCN053());
		attributes.put("BBCNCLKLXCN054", getBBCNCLKLXCN054());
		attributes.put("BBKTSPMXCN001", getBBKTSPMXCN001());
		attributes.put("BBKTSPMXCN002", getBBKTSPMXCN002());
		attributes.put("BBKTSPMXCN003", getBBKTSPMXCN003());
		attributes.put("BBKTSPMXCN004", getBBKTSPMXCN004());
		attributes.put("BBKTSPMXCN005", getBBKTSPMXCN005());
		attributes.put("BBKTSPMXCN006", getBBKTSPMXCN006());
		attributes.put("BBKTSPMXCN007", getBBKTSPMXCN007());
		attributes.put("BBKTSPMXCN008", getBBKTSPMXCN008());
		attributes.put("BBKTSPMXCN009", getBBKTSPMXCN009());
		attributes.put("BBKTSPMXCN012", getBBKTSPMXCN012());
		attributes.put("BBKTSPMXCN013", getBBKTSPMXCN013());
		attributes.put("BBKTSPMXCN014", getBBKTSPMXCN014());
		attributes.put("BBKTSPMXCN015", getBBKTSPMXCN015());
		attributes.put("BBKTSPMXCN016", getBBKTSPMXCN016());
		attributes.put("BBKTSPMXCN017", getBBKTSPMXCN017());
		attributes.put("BBKTSPMXCN018", getBBKTSPMXCN018());
		attributes.put("BBKTSPMXCN019", getBBKTSPMXCN019());
		attributes.put("BBKTSPMXCN020", getBBKTSPMXCN020());
		attributes.put("BBKTSPMXCN021", getBBKTSPMXCN021());
		attributes.put("BBKTSPMXCN022", getBBKTSPMXCN022());
		attributes.put("BBKTSPMXCN023", getBBKTSPMXCN023());
		attributes.put("BBKTSPMXCN024", getBBKTSPMXCN024());
		attributes.put("BBKTSPMXCN025", getBBKTSPMXCN025());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long convertAssembleId = (Long)attributes.get("convertAssembleId");

		if (convertAssembleId != null) {
			setConvertAssembleId(convertAssembleId);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String dossierNo = (String)attributes.get("dossierNo");

		if (dossierNo != null) {
			setDossierNo(dossierNo);
		}

		String referenceUid = (String)attributes.get("referenceUid");

		if (referenceUid != null) {
			setReferenceUid(referenceUid);
		}

		String dossierIdCTN = (String)attributes.get("dossierIdCTN");

		if (dossierIdCTN != null) {
			setDossierIdCTN(dossierIdCTN);
		}

		String deliverableCode = (String)attributes.get("deliverableCode");

		if (deliverableCode != null) {
			setDeliverableCode(deliverableCode);
		}

		Long vehicleTypeCertificateId = (Long)attributes.get(
				"vehicleTypeCertificateId");

		if (vehicleTypeCertificateId != null) {
			setVehicleTypeCertificateId(vehicleTypeCertificateId);
		}

		String XCN01336 = (String)attributes.get("XCN01336");

		if (XCN01336 != null) {
			setXCN01336(XCN01336);
		}

		String XCN01337 = (String)attributes.get("XCN01337");

		if (XCN01337 != null) {
			setXCN01337(XCN01337);
		}

		String XCN01338 = (String)attributes.get("XCN01338");

		if (XCN01338 != null) {
			setXCN01338(XCN01338);
		}

		String XCN01339 = (String)attributes.get("XCN01339");

		if (XCN01339 != null) {
			setXCN01339(XCN01339);
		}

		String XCN01340 = (String)attributes.get("XCN01340");

		if (XCN01340 != null) {
			setXCN01340(XCN01340);
		}

		String XCN01341 = (String)attributes.get("XCN01341");

		if (XCN01341 != null) {
			setXCN01341(XCN01341);
		}

		String XCN01342 = (String)attributes.get("XCN01342");

		if (XCN01342 != null) {
			setXCN01342(XCN01342);
		}

		String XCN01343 = (String)attributes.get("XCN01343");

		if (XCN01343 != null) {
			setXCN01343(XCN01343);
		}

		String XCN01344 = (String)attributes.get("XCN01344");

		if (XCN01344 != null) {
			setXCN01344(XCN01344);
		}

		String XCN01345 = (String)attributes.get("XCN01345");

		if (XCN01345 != null) {
			setXCN01345(XCN01345);
		}

		String XCN01346 = (String)attributes.get("XCN01346");

		if (XCN01346 != null) {
			setXCN01346(XCN01346);
		}

		String XCN01347 = (String)attributes.get("XCN01347");

		if (XCN01347 != null) {
			setXCN01347(XCN01347);
		}

		String XCN01348 = (String)attributes.get("XCN01348");

		if (XCN01348 != null) {
			setXCN01348(XCN01348);
		}

		String XCN01349 = (String)attributes.get("XCN01349");

		if (XCN01349 != null) {
			setXCN01349(XCN01349);
		}

		String XCN01350 = (String)attributes.get("XCN01350");

		if (XCN01350 != null) {
			setXCN01350(XCN01350);
		}

		String XCN01351 = (String)attributes.get("XCN01351");

		if (XCN01351 != null) {
			setXCN01351(XCN01351);
		}

		String XCN01352 = (String)attributes.get("XCN01352");

		if (XCN01352 != null) {
			setXCN01352(XCN01352);
		}

		String XCN01353 = (String)attributes.get("XCN01353");

		if (XCN01353 != null) {
			setXCN01353(XCN01353);
		}

		String XCN01354 = (String)attributes.get("XCN01354");

		if (XCN01354 != null) {
			setXCN01354(XCN01354);
		}

		String XCN01355 = (String)attributes.get("XCN01355");

		if (XCN01355 != null) {
			setXCN01355(XCN01355);
		}

		String XCN01356 = (String)attributes.get("XCN01356");

		if (XCN01356 != null) {
			setXCN01356(XCN01356);
		}

		String XCN01357 = (String)attributes.get("XCN01357");

		if (XCN01357 != null) {
			setXCN01357(XCN01357);
		}

		String XCN01358 = (String)attributes.get("XCN01358");

		if (XCN01358 != null) {
			setXCN01358(XCN01358);
		}

		String XCN01359 = (String)attributes.get("XCN01359");

		if (XCN01359 != null) {
			setXCN01359(XCN01359);
		}

		String XCN01360 = (String)attributes.get("XCN01360");

		if (XCN01360 != null) {
			setXCN01360(XCN01360);
		}

		String XCN01361 = (String)attributes.get("XCN01361");

		if (XCN01361 != null) {
			setXCN01361(XCN01361);
		}

		String XCN01362 = (String)attributes.get("XCN01362");

		if (XCN01362 != null) {
			setXCN01362(XCN01362);
		}

		String XCN01363 = (String)attributes.get("XCN01363");

		if (XCN01363 != null) {
			setXCN01363(XCN01363);
		}

		String XCN01364 = (String)attributes.get("XCN01364");

		if (XCN01364 != null) {
			setXCN01364(XCN01364);
		}

		String XCN01365 = (String)attributes.get("XCN01365");

		if (XCN01365 != null) {
			setXCN01365(XCN01365);
		}

		String XCN01366 = (String)attributes.get("XCN01366");

		if (XCN01366 != null) {
			setXCN01366(XCN01366);
		}

		String XCN01367 = (String)attributes.get("XCN01367");

		if (XCN01367 != null) {
			setXCN01367(XCN01367);
		}

		String XCN01368 = (String)attributes.get("XCN01368");

		if (XCN01368 != null) {
			setXCN01368(XCN01368);
		}

		String XCN01369 = (String)attributes.get("XCN01369");

		if (XCN01369 != null) {
			setXCN01369(XCN01369);
		}

		String XCN01370 = (String)attributes.get("XCN01370");

		if (XCN01370 != null) {
			setXCN01370(XCN01370);
		}

		String XCN01371 = (String)attributes.get("XCN01371");

		if (XCN01371 != null) {
			setXCN01371(XCN01371);
		}

		String XCN01372 = (String)attributes.get("XCN01372");

		if (XCN01372 != null) {
			setXCN01372(XCN01372);
		}

		String XCN01373 = (String)attributes.get("XCN01373");

		if (XCN01373 != null) {
			setXCN01373(XCN01373);
		}

		String XCN01374 = (String)attributes.get("XCN01374");

		if (XCN01374 != null) {
			setXCN01374(XCN01374);
		}

		String XCN01375 = (String)attributes.get("XCN01375");

		if (XCN01375 != null) {
			setXCN01375(XCN01375);
		}

		String XCN01376 = (String)attributes.get("XCN01376");

		if (XCN01376 != null) {
			setXCN01376(XCN01376);
		}

		String XCN01377 = (String)attributes.get("XCN01377");

		if (XCN01377 != null) {
			setXCN01377(XCN01377);
		}

		String XCN01378 = (String)attributes.get("XCN01378");

		if (XCN01378 != null) {
			setXCN01378(XCN01378);
		}

		String XCN01379 = (String)attributes.get("XCN01379");

		if (XCN01379 != null) {
			setXCN01379(XCN01379);
		}

		String XCN01380 = (String)attributes.get("XCN01380");

		if (XCN01380 != null) {
			setXCN01380(XCN01380);
		}

		String XCN01381 = (String)attributes.get("XCN01381");

		if (XCN01381 != null) {
			setXCN01381(XCN01381);
		}

		String XCN01382 = (String)attributes.get("XCN01382");

		if (XCN01382 != null) {
			setXCN01382(XCN01382);
		}

		String XCN01383 = (String)attributes.get("XCN01383");

		if (XCN01383 != null) {
			setXCN01383(XCN01383);
		}

		String XCN01384 = (String)attributes.get("XCN01384");

		if (XCN01384 != null) {
			setXCN01384(XCN01384);
		}

		String XCN01385 = (String)attributes.get("XCN01385");

		if (XCN01385 != null) {
			setXCN01385(XCN01385);
		}

		String XCN01386 = (String)attributes.get("XCN01386");

		if (XCN01386 != null) {
			setXCN01386(XCN01386);
		}

		String XCN01387 = (String)attributes.get("XCN01387");

		if (XCN01387 != null) {
			setXCN01387(XCN01387);
		}

		String XCN01388 = (String)attributes.get("XCN01388");

		if (XCN01388 != null) {
			setXCN01388(XCN01388);
		}

		String XCN01389 = (String)attributes.get("XCN01389");

		if (XCN01389 != null) {
			setXCN01389(XCN01389);
		}

		String XCN01390 = (String)attributes.get("XCN01390");

		if (XCN01390 != null) {
			setXCN01390(XCN01390);
		}

		String XCN01391 = (String)attributes.get("XCN01391");

		if (XCN01391 != null) {
			setXCN01391(XCN01391);
		}

		String XCN01392 = (String)attributes.get("XCN01392");

		if (XCN01392 != null) {
			setXCN01392(XCN01392);
		}

		String XCN01393 = (String)attributes.get("XCN01393");

		if (XCN01393 != null) {
			setXCN01393(XCN01393);
		}

		String XCN01394 = (String)attributes.get("XCN01394");

		if (XCN01394 != null) {
			setXCN01394(XCN01394);
		}

		String XCN01395 = (String)attributes.get("XCN01395");

		if (XCN01395 != null) {
			setXCN01395(XCN01395);
		}

		String XCN01396 = (String)attributes.get("XCN01396");

		if (XCN01396 != null) {
			setXCN01396(XCN01396);
		}

		String XCN01397 = (String)attributes.get("XCN01397");

		if (XCN01397 != null) {
			setXCN01397(XCN01397);
		}

		String XCN01398 = (String)attributes.get("XCN01398");

		if (XCN01398 != null) {
			setXCN01398(XCN01398);
		}

		String XCN01399 = (String)attributes.get("XCN01399");

		if (XCN01399 != null) {
			setXCN01399(XCN01399);
		}

		String XCN01400 = (String)attributes.get("XCN01400");

		if (XCN01400 != null) {
			setXCN01400(XCN01400);
		}

		String XCN01401 = (String)attributes.get("XCN01401");

		if (XCN01401 != null) {
			setXCN01401(XCN01401);
		}

		String XCN01402 = (String)attributes.get("XCN01402");

		if (XCN01402 != null) {
			setXCN01402(XCN01402);
		}

		String XCN01403 = (String)attributes.get("XCN01403");

		if (XCN01403 != null) {
			setXCN01403(XCN01403);
		}

		String XCN01404 = (String)attributes.get("XCN01404");

		if (XCN01404 != null) {
			setXCN01404(XCN01404);
		}

		String XCN01405 = (String)attributes.get("XCN01405");

		if (XCN01405 != null) {
			setXCN01405(XCN01405);
		}

		String XCN01406 = (String)attributes.get("XCN01406");

		if (XCN01406 != null) {
			setXCN01406(XCN01406);
		}

		String XCN01407 = (String)attributes.get("XCN01407");

		if (XCN01407 != null) {
			setXCN01407(XCN01407);
		}

		String XCN01408 = (String)attributes.get("XCN01408");

		if (XCN01408 != null) {
			setXCN01408(XCN01408);
		}

		String XCN01409 = (String)attributes.get("XCN01409");

		if (XCN01409 != null) {
			setXCN01409(XCN01409);
		}

		String XCN01410 = (String)attributes.get("XCN01410");

		if (XCN01410 != null) {
			setXCN01410(XCN01410);
		}

		String XCN01411 = (String)attributes.get("XCN01411");

		if (XCN01411 != null) {
			setXCN01411(XCN01411);
		}

		String XCN01412 = (String)attributes.get("XCN01412");

		if (XCN01412 != null) {
			setXCN01412(XCN01412);
		}

		String XCN01413 = (String)attributes.get("XCN01413");

		if (XCN01413 != null) {
			setXCN01413(XCN01413);
		}

		String XCN01414 = (String)attributes.get("XCN01414");

		if (XCN01414 != null) {
			setXCN01414(XCN01414);
		}

		String XCN01415 = (String)attributes.get("XCN01415");

		if (XCN01415 != null) {
			setXCN01415(XCN01415);
		}

		String XCN01416 = (String)attributes.get("XCN01416");

		if (XCN01416 != null) {
			setXCN01416(XCN01416);
		}

		String XCN01417 = (String)attributes.get("XCN01417");

		if (XCN01417 != null) {
			setXCN01417(XCN01417);
		}

		String XCN01418 = (String)attributes.get("XCN01418");

		if (XCN01418 != null) {
			setXCN01418(XCN01418);
		}

		String XCN01419 = (String)attributes.get("XCN01419");

		if (XCN01419 != null) {
			setXCN01419(XCN01419);
		}

		String XCN01420 = (String)attributes.get("XCN01420");

		if (XCN01420 != null) {
			setXCN01420(XCN01420);
		}

		String XCN01421 = (String)attributes.get("XCN01421");

		if (XCN01421 != null) {
			setXCN01421(XCN01421);
		}

		String XCN01422 = (String)attributes.get("XCN01422");

		if (XCN01422 != null) {
			setXCN01422(XCN01422);
		}

		String XCN01423 = (String)attributes.get("XCN01423");

		if (XCN01423 != null) {
			setXCN01423(XCN01423);
		}

		String XCN01424 = (String)attributes.get("XCN01424");

		if (XCN01424 != null) {
			setXCN01424(XCN01424);
		}

		String XCN01425 = (String)attributes.get("XCN01425");

		if (XCN01425 != null) {
			setXCN01425(XCN01425);
		}

		String XCN01426 = (String)attributes.get("XCN01426");

		if (XCN01426 != null) {
			setXCN01426(XCN01426);
		}

		String XCN01427 = (String)attributes.get("XCN01427");

		if (XCN01427 != null) {
			setXCN01427(XCN01427);
		}

		String XCN01428 = (String)attributes.get("XCN01428");

		if (XCN01428 != null) {
			setXCN01428(XCN01428);
		}

		String XCN01429 = (String)attributes.get("XCN01429");

		if (XCN01429 != null) {
			setXCN01429(XCN01429);
		}

		String XCN01430 = (String)attributes.get("XCN01430");

		if (XCN01430 != null) {
			setXCN01430(XCN01430);
		}

		String XCN01431 = (String)attributes.get("XCN01431");

		if (XCN01431 != null) {
			setXCN01431(XCN01431);
		}

		String XCN01432 = (String)attributes.get("XCN01432");

		if (XCN01432 != null) {
			setXCN01432(XCN01432);
		}

		String XCN01433 = (String)attributes.get("XCN01433");

		if (XCN01433 != null) {
			setXCN01433(XCN01433);
		}

		String XCN01434 = (String)attributes.get("XCN01434");

		if (XCN01434 != null) {
			setXCN01434(XCN01434);
		}

		String XCN01435 = (String)attributes.get("XCN01435");

		if (XCN01435 != null) {
			setXCN01435(XCN01435);
		}

		String XCN01436 = (String)attributes.get("XCN01436");

		if (XCN01436 != null) {
			setXCN01436(XCN01436);
		}

		String XCN01437 = (String)attributes.get("XCN01437");

		if (XCN01437 != null) {
			setXCN01437(XCN01437);
		}

		String BBCNCLKLXCN001 = (String)attributes.get("BBCNCLKLXCN001");

		if (BBCNCLKLXCN001 != null) {
			setBBCNCLKLXCN001(BBCNCLKLXCN001);
		}

		String BBCNCLKLXCN002 = (String)attributes.get("BBCNCLKLXCN002");

		if (BBCNCLKLXCN002 != null) {
			setBBCNCLKLXCN002(BBCNCLKLXCN002);
		}

		String BBCNCLKLXCN003 = (String)attributes.get("BBCNCLKLXCN003");

		if (BBCNCLKLXCN003 != null) {
			setBBCNCLKLXCN003(BBCNCLKLXCN003);
		}

		String BBCNCLKLXCN004 = (String)attributes.get("BBCNCLKLXCN004");

		if (BBCNCLKLXCN004 != null) {
			setBBCNCLKLXCN004(BBCNCLKLXCN004);
		}

		String BBCNCLKLXCN005 = (String)attributes.get("BBCNCLKLXCN005");

		if (BBCNCLKLXCN005 != null) {
			setBBCNCLKLXCN005(BBCNCLKLXCN005);
		}

		String BBCNCLKLXCN006 = (String)attributes.get("BBCNCLKLXCN006");

		if (BBCNCLKLXCN006 != null) {
			setBBCNCLKLXCN006(BBCNCLKLXCN006);
		}

		String BBCNCLKLXCN012 = (String)attributes.get("BBCNCLKLXCN012");

		if (BBCNCLKLXCN012 != null) {
			setBBCNCLKLXCN012(BBCNCLKLXCN012);
		}

		String BBCNCLKLXCN013 = (String)attributes.get("BBCNCLKLXCN013");

		if (BBCNCLKLXCN013 != null) {
			setBBCNCLKLXCN013(BBCNCLKLXCN013);
		}

		String BBCNCLKLXCN014 = (String)attributes.get("BBCNCLKLXCN014");

		if (BBCNCLKLXCN014 != null) {
			setBBCNCLKLXCN014(BBCNCLKLXCN014);
		}

		String BBCNCLKLXCN015 = (String)attributes.get("BBCNCLKLXCN015");

		if (BBCNCLKLXCN015 != null) {
			setBBCNCLKLXCN015(BBCNCLKLXCN015);
		}

		String BBCNCLKLXCN016 = (String)attributes.get("BBCNCLKLXCN016");

		if (BBCNCLKLXCN016 != null) {
			setBBCNCLKLXCN016(BBCNCLKLXCN016);
		}

		String BBCNCLKLXCN017 = (String)attributes.get("BBCNCLKLXCN017");

		if (BBCNCLKLXCN017 != null) {
			setBBCNCLKLXCN017(BBCNCLKLXCN017);
		}

		String BBCNCLKLXCN018 = (String)attributes.get("BBCNCLKLXCN018");

		if (BBCNCLKLXCN018 != null) {
			setBBCNCLKLXCN018(BBCNCLKLXCN018);
		}

		String BBCNCLKLXCN019 = (String)attributes.get("BBCNCLKLXCN019");

		if (BBCNCLKLXCN019 != null) {
			setBBCNCLKLXCN019(BBCNCLKLXCN019);
		}

		String BBCNCLKLXCN020 = (String)attributes.get("BBCNCLKLXCN020");

		if (BBCNCLKLXCN020 != null) {
			setBBCNCLKLXCN020(BBCNCLKLXCN020);
		}

		String BBCNCLKLXCN021 = (String)attributes.get("BBCNCLKLXCN021");

		if (BBCNCLKLXCN021 != null) {
			setBBCNCLKLXCN021(BBCNCLKLXCN021);
		}

		String BBCNCLKLXCN022 = (String)attributes.get("BBCNCLKLXCN022");

		if (BBCNCLKLXCN022 != null) {
			setBBCNCLKLXCN022(BBCNCLKLXCN022);
		}

		String BBCNCLKLXCN026 = (String)attributes.get("BBCNCLKLXCN026");

		if (BBCNCLKLXCN026 != null) {
			setBBCNCLKLXCN026(BBCNCLKLXCN026);
		}

		String BBCNCLKLXCN027 = (String)attributes.get("BBCNCLKLXCN027");

		if (BBCNCLKLXCN027 != null) {
			setBBCNCLKLXCN027(BBCNCLKLXCN027);
		}

		String BBCNCLKLXCN028 = (String)attributes.get("BBCNCLKLXCN028");

		if (BBCNCLKLXCN028 != null) {
			setBBCNCLKLXCN028(BBCNCLKLXCN028);
		}

		String BBCNCLKLXCN033 = (String)attributes.get("BBCNCLKLXCN033");

		if (BBCNCLKLXCN033 != null) {
			setBBCNCLKLXCN033(BBCNCLKLXCN033);
		}

		String BBCNCLKLXCN034 = (String)attributes.get("BBCNCLKLXCN034");

		if (BBCNCLKLXCN034 != null) {
			setBBCNCLKLXCN034(BBCNCLKLXCN034);
		}

		String BBCNCLKLXCN037 = (String)attributes.get("BBCNCLKLXCN037");

		if (BBCNCLKLXCN037 != null) {
			setBBCNCLKLXCN037(BBCNCLKLXCN037);
		}

		String BBCNCLKLXCN038 = (String)attributes.get("BBCNCLKLXCN038");

		if (BBCNCLKLXCN038 != null) {
			setBBCNCLKLXCN038(BBCNCLKLXCN038);
		}

		String BBCNCLKLXCN039 = (String)attributes.get("BBCNCLKLXCN039");

		if (BBCNCLKLXCN039 != null) {
			setBBCNCLKLXCN039(BBCNCLKLXCN039);
		}

		String BBCNCLKLXCN040 = (String)attributes.get("BBCNCLKLXCN040");

		if (BBCNCLKLXCN040 != null) {
			setBBCNCLKLXCN040(BBCNCLKLXCN040);
		}

		String BBCNCLKLXCN041 = (String)attributes.get("BBCNCLKLXCN041");

		if (BBCNCLKLXCN041 != null) {
			setBBCNCLKLXCN041(BBCNCLKLXCN041);
		}

		String BBCNCLKLXCN042 = (String)attributes.get("BBCNCLKLXCN042");

		if (BBCNCLKLXCN042 != null) {
			setBBCNCLKLXCN042(BBCNCLKLXCN042);
		}

		String BBCNCLKLXCN043 = (String)attributes.get("BBCNCLKLXCN043");

		if (BBCNCLKLXCN043 != null) {
			setBBCNCLKLXCN043(BBCNCLKLXCN043);
		}

		String BBCNCLKLXCN044 = (String)attributes.get("BBCNCLKLXCN044");

		if (BBCNCLKLXCN044 != null) {
			setBBCNCLKLXCN044(BBCNCLKLXCN044);
		}

		String BBCNCLKLXCN045 = (String)attributes.get("BBCNCLKLXCN045");

		if (BBCNCLKLXCN045 != null) {
			setBBCNCLKLXCN045(BBCNCLKLXCN045);
		}

		String BBCNCLKLXCN046 = (String)attributes.get("BBCNCLKLXCN046");

		if (BBCNCLKLXCN046 != null) {
			setBBCNCLKLXCN046(BBCNCLKLXCN046);
		}

		String BBCNCLKLXCN047 = (String)attributes.get("BBCNCLKLXCN047");

		if (BBCNCLKLXCN047 != null) {
			setBBCNCLKLXCN047(BBCNCLKLXCN047);
		}

		String BBCNCLKLXCN053 = (String)attributes.get("BBCNCLKLXCN053");

		if (BBCNCLKLXCN053 != null) {
			setBBCNCLKLXCN053(BBCNCLKLXCN053);
		}

		String BBCNCLKLXCN054 = (String)attributes.get("BBCNCLKLXCN054");

		if (BBCNCLKLXCN054 != null) {
			setBBCNCLKLXCN054(BBCNCLKLXCN054);
		}

		String BBKTSPMXCN001 = (String)attributes.get("BBKTSPMXCN001");

		if (BBKTSPMXCN001 != null) {
			setBBKTSPMXCN001(BBKTSPMXCN001);
		}

		String BBKTSPMXCN002 = (String)attributes.get("BBKTSPMXCN002");

		if (BBKTSPMXCN002 != null) {
			setBBKTSPMXCN002(BBKTSPMXCN002);
		}

		String BBKTSPMXCN003 = (String)attributes.get("BBKTSPMXCN003");

		if (BBKTSPMXCN003 != null) {
			setBBKTSPMXCN003(BBKTSPMXCN003);
		}

		String BBKTSPMXCN004 = (String)attributes.get("BBKTSPMXCN004");

		if (BBKTSPMXCN004 != null) {
			setBBKTSPMXCN004(BBKTSPMXCN004);
		}

		String BBKTSPMXCN005 = (String)attributes.get("BBKTSPMXCN005");

		if (BBKTSPMXCN005 != null) {
			setBBKTSPMXCN005(BBKTSPMXCN005);
		}

		String BBKTSPMXCN006 = (String)attributes.get("BBKTSPMXCN006");

		if (BBKTSPMXCN006 != null) {
			setBBKTSPMXCN006(BBKTSPMXCN006);
		}

		String BBKTSPMXCN007 = (String)attributes.get("BBKTSPMXCN007");

		if (BBKTSPMXCN007 != null) {
			setBBKTSPMXCN007(BBKTSPMXCN007);
		}

		String BBKTSPMXCN008 = (String)attributes.get("BBKTSPMXCN008");

		if (BBKTSPMXCN008 != null) {
			setBBKTSPMXCN008(BBKTSPMXCN008);
		}

		String BBKTSPMXCN009 = (String)attributes.get("BBKTSPMXCN009");

		if (BBKTSPMXCN009 != null) {
			setBBKTSPMXCN009(BBKTSPMXCN009);
		}

		String BBKTSPMXCN012 = (String)attributes.get("BBKTSPMXCN012");

		if (BBKTSPMXCN012 != null) {
			setBBKTSPMXCN012(BBKTSPMXCN012);
		}

		String BBKTSPMXCN013 = (String)attributes.get("BBKTSPMXCN013");

		if (BBKTSPMXCN013 != null) {
			setBBKTSPMXCN013(BBKTSPMXCN013);
		}

		String BBKTSPMXCN014 = (String)attributes.get("BBKTSPMXCN014");

		if (BBKTSPMXCN014 != null) {
			setBBKTSPMXCN014(BBKTSPMXCN014);
		}

		String BBKTSPMXCN015 = (String)attributes.get("BBKTSPMXCN015");

		if (BBKTSPMXCN015 != null) {
			setBBKTSPMXCN015(BBKTSPMXCN015);
		}

		String BBKTSPMXCN016 = (String)attributes.get("BBKTSPMXCN016");

		if (BBKTSPMXCN016 != null) {
			setBBKTSPMXCN016(BBKTSPMXCN016);
		}

		String BBKTSPMXCN017 = (String)attributes.get("BBKTSPMXCN017");

		if (BBKTSPMXCN017 != null) {
			setBBKTSPMXCN017(BBKTSPMXCN017);
		}

		String BBKTSPMXCN018 = (String)attributes.get("BBKTSPMXCN018");

		if (BBKTSPMXCN018 != null) {
			setBBKTSPMXCN018(BBKTSPMXCN018);
		}

		String BBKTSPMXCN019 = (String)attributes.get("BBKTSPMXCN019");

		if (BBKTSPMXCN019 != null) {
			setBBKTSPMXCN019(BBKTSPMXCN019);
		}

		String BBKTSPMXCN020 = (String)attributes.get("BBKTSPMXCN020");

		if (BBKTSPMXCN020 != null) {
			setBBKTSPMXCN020(BBKTSPMXCN020);
		}

		String BBKTSPMXCN021 = (String)attributes.get("BBKTSPMXCN021");

		if (BBKTSPMXCN021 != null) {
			setBBKTSPMXCN021(BBKTSPMXCN021);
		}

		String BBKTSPMXCN022 = (String)attributes.get("BBKTSPMXCN022");

		if (BBKTSPMXCN022 != null) {
			setBBKTSPMXCN022(BBKTSPMXCN022);
		}

		String BBKTSPMXCN023 = (String)attributes.get("BBKTSPMXCN023");

		if (BBKTSPMXCN023 != null) {
			setBBKTSPMXCN023(BBKTSPMXCN023);
		}

		String BBKTSPMXCN024 = (String)attributes.get("BBKTSPMXCN024");

		if (BBKTSPMXCN024 != null) {
			setBBKTSPMXCN024(BBKTSPMXCN024);
		}

		String BBKTSPMXCN025 = (String)attributes.get("BBKTSPMXCN025");

		if (BBKTSPMXCN025 != null) {
			setBBKTSPMXCN025(BBKTSPMXCN025);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public VRTechnicalSpec_XCNPart3 toEscapedModel() {
		return new VRTechnicalSpec_XCNPart3Wrapper(_vrTechnicalSpec_XCNPart3.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XCNPart3 toUnescapedModel() {
		return new VRTechnicalSpec_XCNPart3Wrapper(_vrTechnicalSpec_XCNPart3.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XCNPart3.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XCNPart3.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XCNPart3.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XCNPart3.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XCNPart3> toCacheModel() {
		return _vrTechnicalSpec_XCNPart3.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3) {
		return _vrTechnicalSpec_XCNPart3.compareTo(vrTechnicalSpec_XCNPart3);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XCNPart3.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XCNPart3.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XCNPart3Wrapper((VRTechnicalSpec_XCNPart3)_vrTechnicalSpec_XCNPart3.clone());
	}

	/**
	* Returns the bbcnclklxcn001 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn001 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN001() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN001();
	}

	/**
	* Returns the bbcnclklxcn002 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn002 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN002() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN002();
	}

	/**
	* Returns the bbcnclklxcn003 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn003 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN003() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN003();
	}

	/**
	* Returns the bbcnclklxcn004 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn004 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN004() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN004();
	}

	/**
	* Returns the bbcnclklxcn005 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn005 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN005() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN005();
	}

	/**
	* Returns the bbcnclklxcn006 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn006 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN006() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN006();
	}

	/**
	* Returns the bbcnclklxcn012 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn012 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN012() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN012();
	}

	/**
	* Returns the bbcnclklxcn013 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn013 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN013() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN013();
	}

	/**
	* Returns the bbcnclklxcn014 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn014 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN014() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN014();
	}

	/**
	* Returns the bbcnclklxcn015 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn015 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN015() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN015();
	}

	/**
	* Returns the bbcnclklxcn016 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn016 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN016() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN016();
	}

	/**
	* Returns the bbcnclklxcn017 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn017 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN017() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN017();
	}

	/**
	* Returns the bbcnclklxcn018 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn018 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN018() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN018();
	}

	/**
	* Returns the bbcnclklxcn019 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn019 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN019() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN019();
	}

	/**
	* Returns the bbcnclklxcn020 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn020 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN020() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN020();
	}

	/**
	* Returns the bbcnclklxcn021 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn021 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN021() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN021();
	}

	/**
	* Returns the bbcnclklxcn022 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn022 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN022() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN022();
	}

	/**
	* Returns the bbcnclklxcn026 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn026 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN026() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN026();
	}

	/**
	* Returns the bbcnclklxcn027 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn027 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN027() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN027();
	}

	/**
	* Returns the bbcnclklxcn028 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn028 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN028() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN028();
	}

	/**
	* Returns the bbcnclklxcn033 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn033 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN033() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN033();
	}

	/**
	* Returns the bbcnclklxcn034 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn034 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN034() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN034();
	}

	/**
	* Returns the bbcnclklxcn037 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn037 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN037() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN037();
	}

	/**
	* Returns the bbcnclklxcn038 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn038 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN038() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN038();
	}

	/**
	* Returns the bbcnclklxcn039 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn039 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN039() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN039();
	}

	/**
	* Returns the bbcnclklxcn040 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn040 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN040() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN040();
	}

	/**
	* Returns the bbcnclklxcn041 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn041 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN041() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN041();
	}

	/**
	* Returns the bbcnclklxcn042 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn042 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN042() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN042();
	}

	/**
	* Returns the bbcnclklxcn043 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn043 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN043() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN043();
	}

	/**
	* Returns the bbcnclklxcn044 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn044 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN044() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN044();
	}

	/**
	* Returns the bbcnclklxcn045 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn045 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN045() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN045();
	}

	/**
	* Returns the bbcnclklxcn046 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn046 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN046() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN046();
	}

	/**
	* Returns the bbcnclklxcn047 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn047 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN047() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN047();
	}

	/**
	* Returns the bbcnclklxcn053 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn053 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN053() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN053();
	}

	/**
	* Returns the bbcnclklxcn054 of this vr technical spec_xcn part3.
	*
	* @return the bbcnclklxcn054 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXCN054() {
		return _vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN054();
	}

	/**
	* Returns the bbktspmxcn001 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn001 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN001() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN001();
	}

	/**
	* Returns the bbktspmxcn002 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn002 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN002() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN002();
	}

	/**
	* Returns the bbktspmxcn003 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn003 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN003() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN003();
	}

	/**
	* Returns the bbktspmxcn004 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn004 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN004() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN004();
	}

	/**
	* Returns the bbktspmxcn005 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn005 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN005() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN005();
	}

	/**
	* Returns the bbktspmxcn006 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn006 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN006() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN006();
	}

	/**
	* Returns the bbktspmxcn007 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn007 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN007() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN007();
	}

	/**
	* Returns the bbktspmxcn008 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn008 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN008() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN008();
	}

	/**
	* Returns the bbktspmxcn009 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn009 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN009() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN009();
	}

	/**
	* Returns the bbktspmxcn012 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn012 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN012() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN012();
	}

	/**
	* Returns the bbktspmxcn013 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn013 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN013() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN013();
	}

	/**
	* Returns the bbktspmxcn014 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn014 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN014() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN014();
	}

	/**
	* Returns the bbktspmxcn015 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn015 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN015() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN015();
	}

	/**
	* Returns the bbktspmxcn016 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn016 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN016() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN016();
	}

	/**
	* Returns the bbktspmxcn017 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn017 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN017() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN017();
	}

	/**
	* Returns the bbktspmxcn018 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn018 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN018() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN018();
	}

	/**
	* Returns the bbktspmxcn019 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn019 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN019() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN019();
	}

	/**
	* Returns the bbktspmxcn020 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn020 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN020() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN020();
	}

	/**
	* Returns the bbktspmxcn021 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn021 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN021() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN021();
	}

	/**
	* Returns the bbktspmxcn022 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn022 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN022() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN022();
	}

	/**
	* Returns the bbktspmxcn023 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn023 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN023() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN023();
	}

	/**
	* Returns the bbktspmxcn024 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn024 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN024() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN024();
	}

	/**
	* Returns the bbktspmxcn025 of this vr technical spec_xcn part3.
	*
	* @return the bbktspmxcn025 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getBBKTSPMXCN025() {
		return _vrTechnicalSpec_XCNPart3.getBBKTSPMXCN025();
	}

	/**
	* Returns the deliverable code of this vr technical spec_xcn part3.
	*
	* @return the deliverable code of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XCNPart3.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xcn part3.
	*
	* @return the dossier ID ctn of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XCNPart3.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xcn part3.
	*
	* @return the dossier no of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XCNPart3.getDossierNo();
	}

	/**
	* Returns the reference uid of this vr technical spec_xcn part3.
	*
	* @return the reference uid of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XCNPart3.getReferenceUid();
	}

	/**
	* Returns the xcn01336 of this vr technical spec_xcn part3.
	*
	* @return the xcn01336 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01336() {
		return _vrTechnicalSpec_XCNPart3.getXCN01336();
	}

	/**
	* Returns the xcn01337 of this vr technical spec_xcn part3.
	*
	* @return the xcn01337 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01337() {
		return _vrTechnicalSpec_XCNPart3.getXCN01337();
	}

	/**
	* Returns the xcn01338 of this vr technical spec_xcn part3.
	*
	* @return the xcn01338 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01338() {
		return _vrTechnicalSpec_XCNPart3.getXCN01338();
	}

	/**
	* Returns the xcn01339 of this vr technical spec_xcn part3.
	*
	* @return the xcn01339 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01339() {
		return _vrTechnicalSpec_XCNPart3.getXCN01339();
	}

	/**
	* Returns the xcn01340 of this vr technical spec_xcn part3.
	*
	* @return the xcn01340 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01340() {
		return _vrTechnicalSpec_XCNPart3.getXCN01340();
	}

	/**
	* Returns the xcn01341 of this vr technical spec_xcn part3.
	*
	* @return the xcn01341 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01341() {
		return _vrTechnicalSpec_XCNPart3.getXCN01341();
	}

	/**
	* Returns the xcn01342 of this vr technical spec_xcn part3.
	*
	* @return the xcn01342 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01342() {
		return _vrTechnicalSpec_XCNPart3.getXCN01342();
	}

	/**
	* Returns the xcn01343 of this vr technical spec_xcn part3.
	*
	* @return the xcn01343 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01343() {
		return _vrTechnicalSpec_XCNPart3.getXCN01343();
	}

	/**
	* Returns the xcn01344 of this vr technical spec_xcn part3.
	*
	* @return the xcn01344 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01344() {
		return _vrTechnicalSpec_XCNPart3.getXCN01344();
	}

	/**
	* Returns the xcn01345 of this vr technical spec_xcn part3.
	*
	* @return the xcn01345 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01345() {
		return _vrTechnicalSpec_XCNPart3.getXCN01345();
	}

	/**
	* Returns the xcn01346 of this vr technical spec_xcn part3.
	*
	* @return the xcn01346 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01346() {
		return _vrTechnicalSpec_XCNPart3.getXCN01346();
	}

	/**
	* Returns the xcn01347 of this vr technical spec_xcn part3.
	*
	* @return the xcn01347 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01347() {
		return _vrTechnicalSpec_XCNPart3.getXCN01347();
	}

	/**
	* Returns the xcn01348 of this vr technical spec_xcn part3.
	*
	* @return the xcn01348 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01348() {
		return _vrTechnicalSpec_XCNPart3.getXCN01348();
	}

	/**
	* Returns the xcn01349 of this vr technical spec_xcn part3.
	*
	* @return the xcn01349 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01349() {
		return _vrTechnicalSpec_XCNPart3.getXCN01349();
	}

	/**
	* Returns the xcn01350 of this vr technical spec_xcn part3.
	*
	* @return the xcn01350 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01350() {
		return _vrTechnicalSpec_XCNPart3.getXCN01350();
	}

	/**
	* Returns the xcn01351 of this vr technical spec_xcn part3.
	*
	* @return the xcn01351 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01351() {
		return _vrTechnicalSpec_XCNPart3.getXCN01351();
	}

	/**
	* Returns the xcn01352 of this vr technical spec_xcn part3.
	*
	* @return the xcn01352 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01352() {
		return _vrTechnicalSpec_XCNPart3.getXCN01352();
	}

	/**
	* Returns the xcn01353 of this vr technical spec_xcn part3.
	*
	* @return the xcn01353 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01353() {
		return _vrTechnicalSpec_XCNPart3.getXCN01353();
	}

	/**
	* Returns the xcn01354 of this vr technical spec_xcn part3.
	*
	* @return the xcn01354 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01354() {
		return _vrTechnicalSpec_XCNPart3.getXCN01354();
	}

	/**
	* Returns the xcn01355 of this vr technical spec_xcn part3.
	*
	* @return the xcn01355 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01355() {
		return _vrTechnicalSpec_XCNPart3.getXCN01355();
	}

	/**
	* Returns the xcn01356 of this vr technical spec_xcn part3.
	*
	* @return the xcn01356 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01356() {
		return _vrTechnicalSpec_XCNPart3.getXCN01356();
	}

	/**
	* Returns the xcn01357 of this vr technical spec_xcn part3.
	*
	* @return the xcn01357 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01357() {
		return _vrTechnicalSpec_XCNPart3.getXCN01357();
	}

	/**
	* Returns the xcn01358 of this vr technical spec_xcn part3.
	*
	* @return the xcn01358 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01358() {
		return _vrTechnicalSpec_XCNPart3.getXCN01358();
	}

	/**
	* Returns the xcn01359 of this vr technical spec_xcn part3.
	*
	* @return the xcn01359 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01359() {
		return _vrTechnicalSpec_XCNPart3.getXCN01359();
	}

	/**
	* Returns the xcn01360 of this vr technical spec_xcn part3.
	*
	* @return the xcn01360 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01360() {
		return _vrTechnicalSpec_XCNPart3.getXCN01360();
	}

	/**
	* Returns the xcn01361 of this vr technical spec_xcn part3.
	*
	* @return the xcn01361 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01361() {
		return _vrTechnicalSpec_XCNPart3.getXCN01361();
	}

	/**
	* Returns the xcn01362 of this vr technical spec_xcn part3.
	*
	* @return the xcn01362 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01362() {
		return _vrTechnicalSpec_XCNPart3.getXCN01362();
	}

	/**
	* Returns the xcn01363 of this vr technical spec_xcn part3.
	*
	* @return the xcn01363 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01363() {
		return _vrTechnicalSpec_XCNPart3.getXCN01363();
	}

	/**
	* Returns the xcn01364 of this vr technical spec_xcn part3.
	*
	* @return the xcn01364 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01364() {
		return _vrTechnicalSpec_XCNPart3.getXCN01364();
	}

	/**
	* Returns the xcn01365 of this vr technical spec_xcn part3.
	*
	* @return the xcn01365 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01365() {
		return _vrTechnicalSpec_XCNPart3.getXCN01365();
	}

	/**
	* Returns the xcn01366 of this vr technical spec_xcn part3.
	*
	* @return the xcn01366 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01366() {
		return _vrTechnicalSpec_XCNPart3.getXCN01366();
	}

	/**
	* Returns the xcn01367 of this vr technical spec_xcn part3.
	*
	* @return the xcn01367 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01367() {
		return _vrTechnicalSpec_XCNPart3.getXCN01367();
	}

	/**
	* Returns the xcn01368 of this vr technical spec_xcn part3.
	*
	* @return the xcn01368 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01368() {
		return _vrTechnicalSpec_XCNPart3.getXCN01368();
	}

	/**
	* Returns the xcn01369 of this vr technical spec_xcn part3.
	*
	* @return the xcn01369 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01369() {
		return _vrTechnicalSpec_XCNPart3.getXCN01369();
	}

	/**
	* Returns the xcn01370 of this vr technical spec_xcn part3.
	*
	* @return the xcn01370 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01370() {
		return _vrTechnicalSpec_XCNPart3.getXCN01370();
	}

	/**
	* Returns the xcn01371 of this vr technical spec_xcn part3.
	*
	* @return the xcn01371 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01371() {
		return _vrTechnicalSpec_XCNPart3.getXCN01371();
	}

	/**
	* Returns the xcn01372 of this vr technical spec_xcn part3.
	*
	* @return the xcn01372 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01372() {
		return _vrTechnicalSpec_XCNPart3.getXCN01372();
	}

	/**
	* Returns the xcn01373 of this vr technical spec_xcn part3.
	*
	* @return the xcn01373 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01373() {
		return _vrTechnicalSpec_XCNPart3.getXCN01373();
	}

	/**
	* Returns the xcn01374 of this vr technical spec_xcn part3.
	*
	* @return the xcn01374 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01374() {
		return _vrTechnicalSpec_XCNPart3.getXCN01374();
	}

	/**
	* Returns the xcn01375 of this vr technical spec_xcn part3.
	*
	* @return the xcn01375 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01375() {
		return _vrTechnicalSpec_XCNPart3.getXCN01375();
	}

	/**
	* Returns the xcn01376 of this vr technical spec_xcn part3.
	*
	* @return the xcn01376 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01376() {
		return _vrTechnicalSpec_XCNPart3.getXCN01376();
	}

	/**
	* Returns the xcn01377 of this vr technical spec_xcn part3.
	*
	* @return the xcn01377 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01377() {
		return _vrTechnicalSpec_XCNPart3.getXCN01377();
	}

	/**
	* Returns the xcn01378 of this vr technical spec_xcn part3.
	*
	* @return the xcn01378 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01378() {
		return _vrTechnicalSpec_XCNPart3.getXCN01378();
	}

	/**
	* Returns the xcn01379 of this vr technical spec_xcn part3.
	*
	* @return the xcn01379 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01379() {
		return _vrTechnicalSpec_XCNPart3.getXCN01379();
	}

	/**
	* Returns the xcn01380 of this vr technical spec_xcn part3.
	*
	* @return the xcn01380 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01380() {
		return _vrTechnicalSpec_XCNPart3.getXCN01380();
	}

	/**
	* Returns the xcn01381 of this vr technical spec_xcn part3.
	*
	* @return the xcn01381 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01381() {
		return _vrTechnicalSpec_XCNPart3.getXCN01381();
	}

	/**
	* Returns the xcn01382 of this vr technical spec_xcn part3.
	*
	* @return the xcn01382 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01382() {
		return _vrTechnicalSpec_XCNPart3.getXCN01382();
	}

	/**
	* Returns the xcn01383 of this vr technical spec_xcn part3.
	*
	* @return the xcn01383 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01383() {
		return _vrTechnicalSpec_XCNPart3.getXCN01383();
	}

	/**
	* Returns the xcn01384 of this vr technical spec_xcn part3.
	*
	* @return the xcn01384 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01384() {
		return _vrTechnicalSpec_XCNPart3.getXCN01384();
	}

	/**
	* Returns the xcn01385 of this vr technical spec_xcn part3.
	*
	* @return the xcn01385 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01385() {
		return _vrTechnicalSpec_XCNPart3.getXCN01385();
	}

	/**
	* Returns the xcn01386 of this vr technical spec_xcn part3.
	*
	* @return the xcn01386 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01386() {
		return _vrTechnicalSpec_XCNPart3.getXCN01386();
	}

	/**
	* Returns the xcn01387 of this vr technical spec_xcn part3.
	*
	* @return the xcn01387 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01387() {
		return _vrTechnicalSpec_XCNPart3.getXCN01387();
	}

	/**
	* Returns the xcn01388 of this vr technical spec_xcn part3.
	*
	* @return the xcn01388 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01388() {
		return _vrTechnicalSpec_XCNPart3.getXCN01388();
	}

	/**
	* Returns the xcn01389 of this vr technical spec_xcn part3.
	*
	* @return the xcn01389 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01389() {
		return _vrTechnicalSpec_XCNPart3.getXCN01389();
	}

	/**
	* Returns the xcn01390 of this vr technical spec_xcn part3.
	*
	* @return the xcn01390 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01390() {
		return _vrTechnicalSpec_XCNPart3.getXCN01390();
	}

	/**
	* Returns the xcn01391 of this vr technical spec_xcn part3.
	*
	* @return the xcn01391 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01391() {
		return _vrTechnicalSpec_XCNPart3.getXCN01391();
	}

	/**
	* Returns the xcn01392 of this vr technical spec_xcn part3.
	*
	* @return the xcn01392 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01392() {
		return _vrTechnicalSpec_XCNPart3.getXCN01392();
	}

	/**
	* Returns the xcn01393 of this vr technical spec_xcn part3.
	*
	* @return the xcn01393 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01393() {
		return _vrTechnicalSpec_XCNPart3.getXCN01393();
	}

	/**
	* Returns the xcn01394 of this vr technical spec_xcn part3.
	*
	* @return the xcn01394 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01394() {
		return _vrTechnicalSpec_XCNPart3.getXCN01394();
	}

	/**
	* Returns the xcn01395 of this vr technical spec_xcn part3.
	*
	* @return the xcn01395 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01395() {
		return _vrTechnicalSpec_XCNPart3.getXCN01395();
	}

	/**
	* Returns the xcn01396 of this vr technical spec_xcn part3.
	*
	* @return the xcn01396 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01396() {
		return _vrTechnicalSpec_XCNPart3.getXCN01396();
	}

	/**
	* Returns the xcn01397 of this vr technical spec_xcn part3.
	*
	* @return the xcn01397 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01397() {
		return _vrTechnicalSpec_XCNPart3.getXCN01397();
	}

	/**
	* Returns the xcn01398 of this vr technical spec_xcn part3.
	*
	* @return the xcn01398 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01398() {
		return _vrTechnicalSpec_XCNPart3.getXCN01398();
	}

	/**
	* Returns the xcn01399 of this vr technical spec_xcn part3.
	*
	* @return the xcn01399 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01399() {
		return _vrTechnicalSpec_XCNPart3.getXCN01399();
	}

	/**
	* Returns the xcn01400 of this vr technical spec_xcn part3.
	*
	* @return the xcn01400 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01400() {
		return _vrTechnicalSpec_XCNPart3.getXCN01400();
	}

	/**
	* Returns the xcn01401 of this vr technical spec_xcn part3.
	*
	* @return the xcn01401 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01401() {
		return _vrTechnicalSpec_XCNPart3.getXCN01401();
	}

	/**
	* Returns the xcn01402 of this vr technical spec_xcn part3.
	*
	* @return the xcn01402 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01402() {
		return _vrTechnicalSpec_XCNPart3.getXCN01402();
	}

	/**
	* Returns the xcn01403 of this vr technical spec_xcn part3.
	*
	* @return the xcn01403 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01403() {
		return _vrTechnicalSpec_XCNPart3.getXCN01403();
	}

	/**
	* Returns the xcn01404 of this vr technical spec_xcn part3.
	*
	* @return the xcn01404 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01404() {
		return _vrTechnicalSpec_XCNPart3.getXCN01404();
	}

	/**
	* Returns the xcn01405 of this vr technical spec_xcn part3.
	*
	* @return the xcn01405 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01405() {
		return _vrTechnicalSpec_XCNPart3.getXCN01405();
	}

	/**
	* Returns the xcn01406 of this vr technical spec_xcn part3.
	*
	* @return the xcn01406 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01406() {
		return _vrTechnicalSpec_XCNPart3.getXCN01406();
	}

	/**
	* Returns the xcn01407 of this vr technical spec_xcn part3.
	*
	* @return the xcn01407 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01407() {
		return _vrTechnicalSpec_XCNPart3.getXCN01407();
	}

	/**
	* Returns the xcn01408 of this vr technical spec_xcn part3.
	*
	* @return the xcn01408 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01408() {
		return _vrTechnicalSpec_XCNPart3.getXCN01408();
	}

	/**
	* Returns the xcn01409 of this vr technical spec_xcn part3.
	*
	* @return the xcn01409 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01409() {
		return _vrTechnicalSpec_XCNPart3.getXCN01409();
	}

	/**
	* Returns the xcn01410 of this vr technical spec_xcn part3.
	*
	* @return the xcn01410 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01410() {
		return _vrTechnicalSpec_XCNPart3.getXCN01410();
	}

	/**
	* Returns the xcn01411 of this vr technical spec_xcn part3.
	*
	* @return the xcn01411 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01411() {
		return _vrTechnicalSpec_XCNPart3.getXCN01411();
	}

	/**
	* Returns the xcn01412 of this vr technical spec_xcn part3.
	*
	* @return the xcn01412 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01412() {
		return _vrTechnicalSpec_XCNPart3.getXCN01412();
	}

	/**
	* Returns the xcn01413 of this vr technical spec_xcn part3.
	*
	* @return the xcn01413 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01413() {
		return _vrTechnicalSpec_XCNPart3.getXCN01413();
	}

	/**
	* Returns the xcn01414 of this vr technical spec_xcn part3.
	*
	* @return the xcn01414 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01414() {
		return _vrTechnicalSpec_XCNPart3.getXCN01414();
	}

	/**
	* Returns the xcn01415 of this vr technical spec_xcn part3.
	*
	* @return the xcn01415 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01415() {
		return _vrTechnicalSpec_XCNPart3.getXCN01415();
	}

	/**
	* Returns the xcn01416 of this vr technical spec_xcn part3.
	*
	* @return the xcn01416 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01416() {
		return _vrTechnicalSpec_XCNPart3.getXCN01416();
	}

	/**
	* Returns the xcn01417 of this vr technical spec_xcn part3.
	*
	* @return the xcn01417 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01417() {
		return _vrTechnicalSpec_XCNPart3.getXCN01417();
	}

	/**
	* Returns the xcn01418 of this vr technical spec_xcn part3.
	*
	* @return the xcn01418 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01418() {
		return _vrTechnicalSpec_XCNPart3.getXCN01418();
	}

	/**
	* Returns the xcn01419 of this vr technical spec_xcn part3.
	*
	* @return the xcn01419 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01419() {
		return _vrTechnicalSpec_XCNPart3.getXCN01419();
	}

	/**
	* Returns the xcn01420 of this vr technical spec_xcn part3.
	*
	* @return the xcn01420 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01420() {
		return _vrTechnicalSpec_XCNPart3.getXCN01420();
	}

	/**
	* Returns the xcn01421 of this vr technical spec_xcn part3.
	*
	* @return the xcn01421 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01421() {
		return _vrTechnicalSpec_XCNPart3.getXCN01421();
	}

	/**
	* Returns the xcn01422 of this vr technical spec_xcn part3.
	*
	* @return the xcn01422 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01422() {
		return _vrTechnicalSpec_XCNPart3.getXCN01422();
	}

	/**
	* Returns the xcn01423 of this vr technical spec_xcn part3.
	*
	* @return the xcn01423 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01423() {
		return _vrTechnicalSpec_XCNPart3.getXCN01423();
	}

	/**
	* Returns the xcn01424 of this vr technical spec_xcn part3.
	*
	* @return the xcn01424 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01424() {
		return _vrTechnicalSpec_XCNPart3.getXCN01424();
	}

	/**
	* Returns the xcn01425 of this vr technical spec_xcn part3.
	*
	* @return the xcn01425 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01425() {
		return _vrTechnicalSpec_XCNPart3.getXCN01425();
	}

	/**
	* Returns the xcn01426 of this vr technical spec_xcn part3.
	*
	* @return the xcn01426 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01426() {
		return _vrTechnicalSpec_XCNPart3.getXCN01426();
	}

	/**
	* Returns the xcn01427 of this vr technical spec_xcn part3.
	*
	* @return the xcn01427 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01427() {
		return _vrTechnicalSpec_XCNPart3.getXCN01427();
	}

	/**
	* Returns the xcn01428 of this vr technical spec_xcn part3.
	*
	* @return the xcn01428 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01428() {
		return _vrTechnicalSpec_XCNPart3.getXCN01428();
	}

	/**
	* Returns the xcn01429 of this vr technical spec_xcn part3.
	*
	* @return the xcn01429 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01429() {
		return _vrTechnicalSpec_XCNPart3.getXCN01429();
	}

	/**
	* Returns the xcn01430 of this vr technical spec_xcn part3.
	*
	* @return the xcn01430 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01430() {
		return _vrTechnicalSpec_XCNPart3.getXCN01430();
	}

	/**
	* Returns the xcn01431 of this vr technical spec_xcn part3.
	*
	* @return the xcn01431 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01431() {
		return _vrTechnicalSpec_XCNPart3.getXCN01431();
	}

	/**
	* Returns the xcn01432 of this vr technical spec_xcn part3.
	*
	* @return the xcn01432 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01432() {
		return _vrTechnicalSpec_XCNPart3.getXCN01432();
	}

	/**
	* Returns the xcn01433 of this vr technical spec_xcn part3.
	*
	* @return the xcn01433 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01433() {
		return _vrTechnicalSpec_XCNPart3.getXCN01433();
	}

	/**
	* Returns the xcn01434 of this vr technical spec_xcn part3.
	*
	* @return the xcn01434 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01434() {
		return _vrTechnicalSpec_XCNPart3.getXCN01434();
	}

	/**
	* Returns the xcn01435 of this vr technical spec_xcn part3.
	*
	* @return the xcn01435 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01435() {
		return _vrTechnicalSpec_XCNPart3.getXCN01435();
	}

	/**
	* Returns the xcn01436 of this vr technical spec_xcn part3.
	*
	* @return the xcn01436 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01436() {
		return _vrTechnicalSpec_XCNPart3.getXCN01436();
	}

	/**
	* Returns the xcn01437 of this vr technical spec_xcn part3.
	*
	* @return the xcn01437 of this vr technical spec_xcn part3
	*/
	@Override
	public java.lang.String getXCN01437() {
		return _vrTechnicalSpec_XCNPart3.getXCN01437();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XCNPart3.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XCNPart3.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xcn part3.
	*
	* @return the modify date of this vr technical spec_xcn part3
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XCNPart3.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xcn part3.
	*
	* @return the sync date of this vr technical spec_xcn part3
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XCNPart3.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xcn part3.
	*
	* @return the convert assemble ID of this vr technical spec_xcn part3
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XCNPart3.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xcn part3.
	*
	* @return the dossier ID of this vr technical spec_xcn part3
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XCNPart3.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xcn part3.
	*
	* @return the ID of this vr technical spec_xcn part3
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XCNPart3.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xcn part3.
	*
	* @return the mt core of this vr technical spec_xcn part3
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XCNPart3.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xcn part3.
	*
	* @return the primary key of this vr technical spec_xcn part3
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XCNPart3.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xcn part3.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xcn part3
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XCNPart3.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XCNPart3.persist();
	}

	/**
	* Sets the bbcnclklxcn001 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN001 the bbcnclklxcn001 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN001(java.lang.String BBCNCLKLXCN001) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN001(BBCNCLKLXCN001);
	}

	/**
	* Sets the bbcnclklxcn002 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN002 the bbcnclklxcn002 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN002(java.lang.String BBCNCLKLXCN002) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN002(BBCNCLKLXCN002);
	}

	/**
	* Sets the bbcnclklxcn003 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN003 the bbcnclklxcn003 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN003(java.lang.String BBCNCLKLXCN003) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN003(BBCNCLKLXCN003);
	}

	/**
	* Sets the bbcnclklxcn004 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN004 the bbcnclklxcn004 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN004(java.lang.String BBCNCLKLXCN004) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN004(BBCNCLKLXCN004);
	}

	/**
	* Sets the bbcnclklxcn005 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN005 the bbcnclklxcn005 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN005(java.lang.String BBCNCLKLXCN005) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN005(BBCNCLKLXCN005);
	}

	/**
	* Sets the bbcnclklxcn006 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN006 the bbcnclklxcn006 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN006(java.lang.String BBCNCLKLXCN006) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN006(BBCNCLKLXCN006);
	}

	/**
	* Sets the bbcnclklxcn012 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN012 the bbcnclklxcn012 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN012(java.lang.String BBCNCLKLXCN012) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN012(BBCNCLKLXCN012);
	}

	/**
	* Sets the bbcnclklxcn013 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN013 the bbcnclklxcn013 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN013(java.lang.String BBCNCLKLXCN013) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN013(BBCNCLKLXCN013);
	}

	/**
	* Sets the bbcnclklxcn014 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN014 the bbcnclklxcn014 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN014(java.lang.String BBCNCLKLXCN014) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN014(BBCNCLKLXCN014);
	}

	/**
	* Sets the bbcnclklxcn015 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN015 the bbcnclklxcn015 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN015(java.lang.String BBCNCLKLXCN015) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN015(BBCNCLKLXCN015);
	}

	/**
	* Sets the bbcnclklxcn016 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN016 the bbcnclklxcn016 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN016(java.lang.String BBCNCLKLXCN016) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN016(BBCNCLKLXCN016);
	}

	/**
	* Sets the bbcnclklxcn017 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN017 the bbcnclklxcn017 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN017(java.lang.String BBCNCLKLXCN017) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN017(BBCNCLKLXCN017);
	}

	/**
	* Sets the bbcnclklxcn018 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN018 the bbcnclklxcn018 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN018(java.lang.String BBCNCLKLXCN018) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN018(BBCNCLKLXCN018);
	}

	/**
	* Sets the bbcnclklxcn019 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN019 the bbcnclklxcn019 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN019(java.lang.String BBCNCLKLXCN019) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN019(BBCNCLKLXCN019);
	}

	/**
	* Sets the bbcnclklxcn020 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN020 the bbcnclklxcn020 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN020(java.lang.String BBCNCLKLXCN020) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN020(BBCNCLKLXCN020);
	}

	/**
	* Sets the bbcnclklxcn021 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN021 the bbcnclklxcn021 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN021(java.lang.String BBCNCLKLXCN021) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN021(BBCNCLKLXCN021);
	}

	/**
	* Sets the bbcnclklxcn022 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN022 the bbcnclklxcn022 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN022(java.lang.String BBCNCLKLXCN022) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN022(BBCNCLKLXCN022);
	}

	/**
	* Sets the bbcnclklxcn026 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN026 the bbcnclklxcn026 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN026(java.lang.String BBCNCLKLXCN026) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN026(BBCNCLKLXCN026);
	}

	/**
	* Sets the bbcnclklxcn027 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN027 the bbcnclklxcn027 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN027(java.lang.String BBCNCLKLXCN027) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN027(BBCNCLKLXCN027);
	}

	/**
	* Sets the bbcnclklxcn028 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN028 the bbcnclklxcn028 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN028(java.lang.String BBCNCLKLXCN028) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN028(BBCNCLKLXCN028);
	}

	/**
	* Sets the bbcnclklxcn033 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN033 the bbcnclklxcn033 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN033(java.lang.String BBCNCLKLXCN033) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN033(BBCNCLKLXCN033);
	}

	/**
	* Sets the bbcnclklxcn034 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN034 the bbcnclklxcn034 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN034(java.lang.String BBCNCLKLXCN034) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN034(BBCNCLKLXCN034);
	}

	/**
	* Sets the bbcnclklxcn037 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN037 the bbcnclklxcn037 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN037(java.lang.String BBCNCLKLXCN037) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN037(BBCNCLKLXCN037);
	}

	/**
	* Sets the bbcnclklxcn038 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN038 the bbcnclklxcn038 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN038(java.lang.String BBCNCLKLXCN038) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN038(BBCNCLKLXCN038);
	}

	/**
	* Sets the bbcnclklxcn039 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN039 the bbcnclklxcn039 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN039(java.lang.String BBCNCLKLXCN039) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN039(BBCNCLKLXCN039);
	}

	/**
	* Sets the bbcnclklxcn040 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN040 the bbcnclklxcn040 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN040(java.lang.String BBCNCLKLXCN040) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN040(BBCNCLKLXCN040);
	}

	/**
	* Sets the bbcnclklxcn041 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN041 the bbcnclklxcn041 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN041(java.lang.String BBCNCLKLXCN041) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN041(BBCNCLKLXCN041);
	}

	/**
	* Sets the bbcnclklxcn042 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN042 the bbcnclklxcn042 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN042(java.lang.String BBCNCLKLXCN042) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN042(BBCNCLKLXCN042);
	}

	/**
	* Sets the bbcnclklxcn043 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN043 the bbcnclklxcn043 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN043(java.lang.String BBCNCLKLXCN043) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN043(BBCNCLKLXCN043);
	}

	/**
	* Sets the bbcnclklxcn044 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN044 the bbcnclklxcn044 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN044(java.lang.String BBCNCLKLXCN044) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN044(BBCNCLKLXCN044);
	}

	/**
	* Sets the bbcnclklxcn045 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN045 the bbcnclklxcn045 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN045(java.lang.String BBCNCLKLXCN045) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN045(BBCNCLKLXCN045);
	}

	/**
	* Sets the bbcnclklxcn046 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN046 the bbcnclklxcn046 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN046(java.lang.String BBCNCLKLXCN046) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN046(BBCNCLKLXCN046);
	}

	/**
	* Sets the bbcnclklxcn047 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN047 the bbcnclklxcn047 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN047(java.lang.String BBCNCLKLXCN047) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN047(BBCNCLKLXCN047);
	}

	/**
	* Sets the bbcnclklxcn053 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN053 the bbcnclklxcn053 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN053(java.lang.String BBCNCLKLXCN053) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN053(BBCNCLKLXCN053);
	}

	/**
	* Sets the bbcnclklxcn054 of this vr technical spec_xcn part3.
	*
	* @param BBCNCLKLXCN054 the bbcnclklxcn054 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBCNCLKLXCN054(java.lang.String BBCNCLKLXCN054) {
		_vrTechnicalSpec_XCNPart3.setBBCNCLKLXCN054(BBCNCLKLXCN054);
	}

	/**
	* Sets the bbktspmxcn001 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN001 the bbktspmxcn001 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN001(java.lang.String BBKTSPMXCN001) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN001(BBKTSPMXCN001);
	}

	/**
	* Sets the bbktspmxcn002 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN002 the bbktspmxcn002 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN002(java.lang.String BBKTSPMXCN002) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN002(BBKTSPMXCN002);
	}

	/**
	* Sets the bbktspmxcn003 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN003 the bbktspmxcn003 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN003(java.lang.String BBKTSPMXCN003) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN003(BBKTSPMXCN003);
	}

	/**
	* Sets the bbktspmxcn004 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN004 the bbktspmxcn004 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN004(java.lang.String BBKTSPMXCN004) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN004(BBKTSPMXCN004);
	}

	/**
	* Sets the bbktspmxcn005 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN005 the bbktspmxcn005 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN005(java.lang.String BBKTSPMXCN005) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN005(BBKTSPMXCN005);
	}

	/**
	* Sets the bbktspmxcn006 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN006 the bbktspmxcn006 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN006(java.lang.String BBKTSPMXCN006) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN006(BBKTSPMXCN006);
	}

	/**
	* Sets the bbktspmxcn007 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN007 the bbktspmxcn007 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN007(java.lang.String BBKTSPMXCN007) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN007(BBKTSPMXCN007);
	}

	/**
	* Sets the bbktspmxcn008 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN008 the bbktspmxcn008 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN008(java.lang.String BBKTSPMXCN008) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN008(BBKTSPMXCN008);
	}

	/**
	* Sets the bbktspmxcn009 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN009 the bbktspmxcn009 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN009(java.lang.String BBKTSPMXCN009) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN009(BBKTSPMXCN009);
	}

	/**
	* Sets the bbktspmxcn012 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN012 the bbktspmxcn012 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN012(java.lang.String BBKTSPMXCN012) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN012(BBKTSPMXCN012);
	}

	/**
	* Sets the bbktspmxcn013 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN013 the bbktspmxcn013 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN013(java.lang.String BBKTSPMXCN013) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN013(BBKTSPMXCN013);
	}

	/**
	* Sets the bbktspmxcn014 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN014 the bbktspmxcn014 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN014(java.lang.String BBKTSPMXCN014) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN014(BBKTSPMXCN014);
	}

	/**
	* Sets the bbktspmxcn015 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN015 the bbktspmxcn015 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN015(java.lang.String BBKTSPMXCN015) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN015(BBKTSPMXCN015);
	}

	/**
	* Sets the bbktspmxcn016 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN016 the bbktspmxcn016 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN016(java.lang.String BBKTSPMXCN016) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN016(BBKTSPMXCN016);
	}

	/**
	* Sets the bbktspmxcn017 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN017 the bbktspmxcn017 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN017(java.lang.String BBKTSPMXCN017) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN017(BBKTSPMXCN017);
	}

	/**
	* Sets the bbktspmxcn018 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN018 the bbktspmxcn018 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN018(java.lang.String BBKTSPMXCN018) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN018(BBKTSPMXCN018);
	}

	/**
	* Sets the bbktspmxcn019 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN019 the bbktspmxcn019 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN019(java.lang.String BBKTSPMXCN019) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN019(BBKTSPMXCN019);
	}

	/**
	* Sets the bbktspmxcn020 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN020 the bbktspmxcn020 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN020(java.lang.String BBKTSPMXCN020) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN020(BBKTSPMXCN020);
	}

	/**
	* Sets the bbktspmxcn021 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN021 the bbktspmxcn021 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN021(java.lang.String BBKTSPMXCN021) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN021(BBKTSPMXCN021);
	}

	/**
	* Sets the bbktspmxcn022 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN022 the bbktspmxcn022 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN022(java.lang.String BBKTSPMXCN022) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN022(BBKTSPMXCN022);
	}

	/**
	* Sets the bbktspmxcn023 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN023 the bbktspmxcn023 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN023(java.lang.String BBKTSPMXCN023) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN023(BBKTSPMXCN023);
	}

	/**
	* Sets the bbktspmxcn024 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN024 the bbktspmxcn024 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN024(java.lang.String BBKTSPMXCN024) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN024(BBKTSPMXCN024);
	}

	/**
	* Sets the bbktspmxcn025 of this vr technical spec_xcn part3.
	*
	* @param BBKTSPMXCN025 the bbktspmxcn025 of this vr technical spec_xcn part3
	*/
	@Override
	public void setBBKTSPMXCN025(java.lang.String BBKTSPMXCN025) {
		_vrTechnicalSpec_XCNPart3.setBBKTSPMXCN025(BBKTSPMXCN025);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XCNPart3.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xcn part3.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xcn part3
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XCNPart3.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xcn part3.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xcn part3
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XCNPart3.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xcn part3.
	*
	* @param dossierId the dossier ID of this vr technical spec_xcn part3
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XCNPart3.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xcn part3.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xcn part3
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XCNPart3.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xcn part3.
	*
	* @param dossierNo the dossier no of this vr technical spec_xcn part3
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XCNPart3.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XCNPart3.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XCNPart3.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XCNPart3.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xcn part3.
	*
	* @param id the ID of this vr technical spec_xcn part3
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XCNPart3.setId(id);
	}

	/**
	* Sets the modify date of this vr technical spec_xcn part3.
	*
	* @param modifyDate the modify date of this vr technical spec_xcn part3
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XCNPart3.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xcn part3.
	*
	* @param mtCore the mt core of this vr technical spec_xcn part3
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XCNPart3.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XCNPart3.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xcn part3.
	*
	* @param primaryKey the primary key of this vr technical spec_xcn part3
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XCNPart3.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XCNPart3.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xcn part3.
	*
	* @param referenceUid the reference uid of this vr technical spec_xcn part3
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XCNPart3.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xcn part3.
	*
	* @param syncDate the sync date of this vr technical spec_xcn part3
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XCNPart3.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xcn part3.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xcn part3
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XCNPart3.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xcn01336 of this vr technical spec_xcn part3.
	*
	* @param XCN01336 the xcn01336 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01336(java.lang.String XCN01336) {
		_vrTechnicalSpec_XCNPart3.setXCN01336(XCN01336);
	}

	/**
	* Sets the xcn01337 of this vr technical spec_xcn part3.
	*
	* @param XCN01337 the xcn01337 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01337(java.lang.String XCN01337) {
		_vrTechnicalSpec_XCNPart3.setXCN01337(XCN01337);
	}

	/**
	* Sets the xcn01338 of this vr technical spec_xcn part3.
	*
	* @param XCN01338 the xcn01338 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01338(java.lang.String XCN01338) {
		_vrTechnicalSpec_XCNPart3.setXCN01338(XCN01338);
	}

	/**
	* Sets the xcn01339 of this vr technical spec_xcn part3.
	*
	* @param XCN01339 the xcn01339 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01339(java.lang.String XCN01339) {
		_vrTechnicalSpec_XCNPart3.setXCN01339(XCN01339);
	}

	/**
	* Sets the xcn01340 of this vr technical spec_xcn part3.
	*
	* @param XCN01340 the xcn01340 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01340(java.lang.String XCN01340) {
		_vrTechnicalSpec_XCNPart3.setXCN01340(XCN01340);
	}

	/**
	* Sets the xcn01341 of this vr technical spec_xcn part3.
	*
	* @param XCN01341 the xcn01341 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01341(java.lang.String XCN01341) {
		_vrTechnicalSpec_XCNPart3.setXCN01341(XCN01341);
	}

	/**
	* Sets the xcn01342 of this vr technical spec_xcn part3.
	*
	* @param XCN01342 the xcn01342 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01342(java.lang.String XCN01342) {
		_vrTechnicalSpec_XCNPart3.setXCN01342(XCN01342);
	}

	/**
	* Sets the xcn01343 of this vr technical spec_xcn part3.
	*
	* @param XCN01343 the xcn01343 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01343(java.lang.String XCN01343) {
		_vrTechnicalSpec_XCNPart3.setXCN01343(XCN01343);
	}

	/**
	* Sets the xcn01344 of this vr technical spec_xcn part3.
	*
	* @param XCN01344 the xcn01344 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01344(java.lang.String XCN01344) {
		_vrTechnicalSpec_XCNPart3.setXCN01344(XCN01344);
	}

	/**
	* Sets the xcn01345 of this vr technical spec_xcn part3.
	*
	* @param XCN01345 the xcn01345 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01345(java.lang.String XCN01345) {
		_vrTechnicalSpec_XCNPart3.setXCN01345(XCN01345);
	}

	/**
	* Sets the xcn01346 of this vr technical spec_xcn part3.
	*
	* @param XCN01346 the xcn01346 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01346(java.lang.String XCN01346) {
		_vrTechnicalSpec_XCNPart3.setXCN01346(XCN01346);
	}

	/**
	* Sets the xcn01347 of this vr technical spec_xcn part3.
	*
	* @param XCN01347 the xcn01347 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01347(java.lang.String XCN01347) {
		_vrTechnicalSpec_XCNPart3.setXCN01347(XCN01347);
	}

	/**
	* Sets the xcn01348 of this vr technical spec_xcn part3.
	*
	* @param XCN01348 the xcn01348 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01348(java.lang.String XCN01348) {
		_vrTechnicalSpec_XCNPart3.setXCN01348(XCN01348);
	}

	/**
	* Sets the xcn01349 of this vr technical spec_xcn part3.
	*
	* @param XCN01349 the xcn01349 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01349(java.lang.String XCN01349) {
		_vrTechnicalSpec_XCNPart3.setXCN01349(XCN01349);
	}

	/**
	* Sets the xcn01350 of this vr technical spec_xcn part3.
	*
	* @param XCN01350 the xcn01350 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01350(java.lang.String XCN01350) {
		_vrTechnicalSpec_XCNPart3.setXCN01350(XCN01350);
	}

	/**
	* Sets the xcn01351 of this vr technical spec_xcn part3.
	*
	* @param XCN01351 the xcn01351 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01351(java.lang.String XCN01351) {
		_vrTechnicalSpec_XCNPart3.setXCN01351(XCN01351);
	}

	/**
	* Sets the xcn01352 of this vr technical spec_xcn part3.
	*
	* @param XCN01352 the xcn01352 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01352(java.lang.String XCN01352) {
		_vrTechnicalSpec_XCNPart3.setXCN01352(XCN01352);
	}

	/**
	* Sets the xcn01353 of this vr technical spec_xcn part3.
	*
	* @param XCN01353 the xcn01353 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01353(java.lang.String XCN01353) {
		_vrTechnicalSpec_XCNPart3.setXCN01353(XCN01353);
	}

	/**
	* Sets the xcn01354 of this vr technical spec_xcn part3.
	*
	* @param XCN01354 the xcn01354 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01354(java.lang.String XCN01354) {
		_vrTechnicalSpec_XCNPart3.setXCN01354(XCN01354);
	}

	/**
	* Sets the xcn01355 of this vr technical spec_xcn part3.
	*
	* @param XCN01355 the xcn01355 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01355(java.lang.String XCN01355) {
		_vrTechnicalSpec_XCNPart3.setXCN01355(XCN01355);
	}

	/**
	* Sets the xcn01356 of this vr technical spec_xcn part3.
	*
	* @param XCN01356 the xcn01356 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01356(java.lang.String XCN01356) {
		_vrTechnicalSpec_XCNPart3.setXCN01356(XCN01356);
	}

	/**
	* Sets the xcn01357 of this vr technical spec_xcn part3.
	*
	* @param XCN01357 the xcn01357 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01357(java.lang.String XCN01357) {
		_vrTechnicalSpec_XCNPart3.setXCN01357(XCN01357);
	}

	/**
	* Sets the xcn01358 of this vr technical spec_xcn part3.
	*
	* @param XCN01358 the xcn01358 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01358(java.lang.String XCN01358) {
		_vrTechnicalSpec_XCNPart3.setXCN01358(XCN01358);
	}

	/**
	* Sets the xcn01359 of this vr technical spec_xcn part3.
	*
	* @param XCN01359 the xcn01359 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01359(java.lang.String XCN01359) {
		_vrTechnicalSpec_XCNPart3.setXCN01359(XCN01359);
	}

	/**
	* Sets the xcn01360 of this vr technical spec_xcn part3.
	*
	* @param XCN01360 the xcn01360 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01360(java.lang.String XCN01360) {
		_vrTechnicalSpec_XCNPart3.setXCN01360(XCN01360);
	}

	/**
	* Sets the xcn01361 of this vr technical spec_xcn part3.
	*
	* @param XCN01361 the xcn01361 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01361(java.lang.String XCN01361) {
		_vrTechnicalSpec_XCNPart3.setXCN01361(XCN01361);
	}

	/**
	* Sets the xcn01362 of this vr technical spec_xcn part3.
	*
	* @param XCN01362 the xcn01362 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01362(java.lang.String XCN01362) {
		_vrTechnicalSpec_XCNPart3.setXCN01362(XCN01362);
	}

	/**
	* Sets the xcn01363 of this vr technical spec_xcn part3.
	*
	* @param XCN01363 the xcn01363 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01363(java.lang.String XCN01363) {
		_vrTechnicalSpec_XCNPart3.setXCN01363(XCN01363);
	}

	/**
	* Sets the xcn01364 of this vr technical spec_xcn part3.
	*
	* @param XCN01364 the xcn01364 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01364(java.lang.String XCN01364) {
		_vrTechnicalSpec_XCNPart3.setXCN01364(XCN01364);
	}

	/**
	* Sets the xcn01365 of this vr technical spec_xcn part3.
	*
	* @param XCN01365 the xcn01365 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01365(java.lang.String XCN01365) {
		_vrTechnicalSpec_XCNPart3.setXCN01365(XCN01365);
	}

	/**
	* Sets the xcn01366 of this vr technical spec_xcn part3.
	*
	* @param XCN01366 the xcn01366 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01366(java.lang.String XCN01366) {
		_vrTechnicalSpec_XCNPart3.setXCN01366(XCN01366);
	}

	/**
	* Sets the xcn01367 of this vr technical spec_xcn part3.
	*
	* @param XCN01367 the xcn01367 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01367(java.lang.String XCN01367) {
		_vrTechnicalSpec_XCNPart3.setXCN01367(XCN01367);
	}

	/**
	* Sets the xcn01368 of this vr technical spec_xcn part3.
	*
	* @param XCN01368 the xcn01368 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01368(java.lang.String XCN01368) {
		_vrTechnicalSpec_XCNPart3.setXCN01368(XCN01368);
	}

	/**
	* Sets the xcn01369 of this vr technical spec_xcn part3.
	*
	* @param XCN01369 the xcn01369 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01369(java.lang.String XCN01369) {
		_vrTechnicalSpec_XCNPart3.setXCN01369(XCN01369);
	}

	/**
	* Sets the xcn01370 of this vr technical spec_xcn part3.
	*
	* @param XCN01370 the xcn01370 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01370(java.lang.String XCN01370) {
		_vrTechnicalSpec_XCNPart3.setXCN01370(XCN01370);
	}

	/**
	* Sets the xcn01371 of this vr technical spec_xcn part3.
	*
	* @param XCN01371 the xcn01371 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01371(java.lang.String XCN01371) {
		_vrTechnicalSpec_XCNPart3.setXCN01371(XCN01371);
	}

	/**
	* Sets the xcn01372 of this vr technical spec_xcn part3.
	*
	* @param XCN01372 the xcn01372 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01372(java.lang.String XCN01372) {
		_vrTechnicalSpec_XCNPart3.setXCN01372(XCN01372);
	}

	/**
	* Sets the xcn01373 of this vr technical spec_xcn part3.
	*
	* @param XCN01373 the xcn01373 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01373(java.lang.String XCN01373) {
		_vrTechnicalSpec_XCNPart3.setXCN01373(XCN01373);
	}

	/**
	* Sets the xcn01374 of this vr technical spec_xcn part3.
	*
	* @param XCN01374 the xcn01374 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01374(java.lang.String XCN01374) {
		_vrTechnicalSpec_XCNPart3.setXCN01374(XCN01374);
	}

	/**
	* Sets the xcn01375 of this vr technical spec_xcn part3.
	*
	* @param XCN01375 the xcn01375 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01375(java.lang.String XCN01375) {
		_vrTechnicalSpec_XCNPart3.setXCN01375(XCN01375);
	}

	/**
	* Sets the xcn01376 of this vr technical spec_xcn part3.
	*
	* @param XCN01376 the xcn01376 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01376(java.lang.String XCN01376) {
		_vrTechnicalSpec_XCNPart3.setXCN01376(XCN01376);
	}

	/**
	* Sets the xcn01377 of this vr technical spec_xcn part3.
	*
	* @param XCN01377 the xcn01377 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01377(java.lang.String XCN01377) {
		_vrTechnicalSpec_XCNPart3.setXCN01377(XCN01377);
	}

	/**
	* Sets the xcn01378 of this vr technical spec_xcn part3.
	*
	* @param XCN01378 the xcn01378 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01378(java.lang.String XCN01378) {
		_vrTechnicalSpec_XCNPart3.setXCN01378(XCN01378);
	}

	/**
	* Sets the xcn01379 of this vr technical spec_xcn part3.
	*
	* @param XCN01379 the xcn01379 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01379(java.lang.String XCN01379) {
		_vrTechnicalSpec_XCNPart3.setXCN01379(XCN01379);
	}

	/**
	* Sets the xcn01380 of this vr technical spec_xcn part3.
	*
	* @param XCN01380 the xcn01380 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01380(java.lang.String XCN01380) {
		_vrTechnicalSpec_XCNPart3.setXCN01380(XCN01380);
	}

	/**
	* Sets the xcn01381 of this vr technical spec_xcn part3.
	*
	* @param XCN01381 the xcn01381 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01381(java.lang.String XCN01381) {
		_vrTechnicalSpec_XCNPart3.setXCN01381(XCN01381);
	}

	/**
	* Sets the xcn01382 of this vr technical spec_xcn part3.
	*
	* @param XCN01382 the xcn01382 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01382(java.lang.String XCN01382) {
		_vrTechnicalSpec_XCNPart3.setXCN01382(XCN01382);
	}

	/**
	* Sets the xcn01383 of this vr technical spec_xcn part3.
	*
	* @param XCN01383 the xcn01383 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01383(java.lang.String XCN01383) {
		_vrTechnicalSpec_XCNPart3.setXCN01383(XCN01383);
	}

	/**
	* Sets the xcn01384 of this vr technical spec_xcn part3.
	*
	* @param XCN01384 the xcn01384 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01384(java.lang.String XCN01384) {
		_vrTechnicalSpec_XCNPart3.setXCN01384(XCN01384);
	}

	/**
	* Sets the xcn01385 of this vr technical spec_xcn part3.
	*
	* @param XCN01385 the xcn01385 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01385(java.lang.String XCN01385) {
		_vrTechnicalSpec_XCNPart3.setXCN01385(XCN01385);
	}

	/**
	* Sets the xcn01386 of this vr technical spec_xcn part3.
	*
	* @param XCN01386 the xcn01386 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01386(java.lang.String XCN01386) {
		_vrTechnicalSpec_XCNPart3.setXCN01386(XCN01386);
	}

	/**
	* Sets the xcn01387 of this vr technical spec_xcn part3.
	*
	* @param XCN01387 the xcn01387 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01387(java.lang.String XCN01387) {
		_vrTechnicalSpec_XCNPart3.setXCN01387(XCN01387);
	}

	/**
	* Sets the xcn01388 of this vr technical spec_xcn part3.
	*
	* @param XCN01388 the xcn01388 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01388(java.lang.String XCN01388) {
		_vrTechnicalSpec_XCNPart3.setXCN01388(XCN01388);
	}

	/**
	* Sets the xcn01389 of this vr technical spec_xcn part3.
	*
	* @param XCN01389 the xcn01389 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01389(java.lang.String XCN01389) {
		_vrTechnicalSpec_XCNPart3.setXCN01389(XCN01389);
	}

	/**
	* Sets the xcn01390 of this vr technical spec_xcn part3.
	*
	* @param XCN01390 the xcn01390 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01390(java.lang.String XCN01390) {
		_vrTechnicalSpec_XCNPart3.setXCN01390(XCN01390);
	}

	/**
	* Sets the xcn01391 of this vr technical spec_xcn part3.
	*
	* @param XCN01391 the xcn01391 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01391(java.lang.String XCN01391) {
		_vrTechnicalSpec_XCNPart3.setXCN01391(XCN01391);
	}

	/**
	* Sets the xcn01392 of this vr technical spec_xcn part3.
	*
	* @param XCN01392 the xcn01392 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01392(java.lang.String XCN01392) {
		_vrTechnicalSpec_XCNPart3.setXCN01392(XCN01392);
	}

	/**
	* Sets the xcn01393 of this vr technical spec_xcn part3.
	*
	* @param XCN01393 the xcn01393 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01393(java.lang.String XCN01393) {
		_vrTechnicalSpec_XCNPart3.setXCN01393(XCN01393);
	}

	/**
	* Sets the xcn01394 of this vr technical spec_xcn part3.
	*
	* @param XCN01394 the xcn01394 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01394(java.lang.String XCN01394) {
		_vrTechnicalSpec_XCNPart3.setXCN01394(XCN01394);
	}

	/**
	* Sets the xcn01395 of this vr technical spec_xcn part3.
	*
	* @param XCN01395 the xcn01395 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01395(java.lang.String XCN01395) {
		_vrTechnicalSpec_XCNPart3.setXCN01395(XCN01395);
	}

	/**
	* Sets the xcn01396 of this vr technical spec_xcn part3.
	*
	* @param XCN01396 the xcn01396 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01396(java.lang.String XCN01396) {
		_vrTechnicalSpec_XCNPart3.setXCN01396(XCN01396);
	}

	/**
	* Sets the xcn01397 of this vr technical spec_xcn part3.
	*
	* @param XCN01397 the xcn01397 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01397(java.lang.String XCN01397) {
		_vrTechnicalSpec_XCNPart3.setXCN01397(XCN01397);
	}

	/**
	* Sets the xcn01398 of this vr technical spec_xcn part3.
	*
	* @param XCN01398 the xcn01398 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01398(java.lang.String XCN01398) {
		_vrTechnicalSpec_XCNPart3.setXCN01398(XCN01398);
	}

	/**
	* Sets the xcn01399 of this vr technical spec_xcn part3.
	*
	* @param XCN01399 the xcn01399 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01399(java.lang.String XCN01399) {
		_vrTechnicalSpec_XCNPart3.setXCN01399(XCN01399);
	}

	/**
	* Sets the xcn01400 of this vr technical spec_xcn part3.
	*
	* @param XCN01400 the xcn01400 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01400(java.lang.String XCN01400) {
		_vrTechnicalSpec_XCNPart3.setXCN01400(XCN01400);
	}

	/**
	* Sets the xcn01401 of this vr technical spec_xcn part3.
	*
	* @param XCN01401 the xcn01401 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01401(java.lang.String XCN01401) {
		_vrTechnicalSpec_XCNPart3.setXCN01401(XCN01401);
	}

	/**
	* Sets the xcn01402 of this vr technical spec_xcn part3.
	*
	* @param XCN01402 the xcn01402 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01402(java.lang.String XCN01402) {
		_vrTechnicalSpec_XCNPart3.setXCN01402(XCN01402);
	}

	/**
	* Sets the xcn01403 of this vr technical spec_xcn part3.
	*
	* @param XCN01403 the xcn01403 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01403(java.lang.String XCN01403) {
		_vrTechnicalSpec_XCNPart3.setXCN01403(XCN01403);
	}

	/**
	* Sets the xcn01404 of this vr technical spec_xcn part3.
	*
	* @param XCN01404 the xcn01404 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01404(java.lang.String XCN01404) {
		_vrTechnicalSpec_XCNPart3.setXCN01404(XCN01404);
	}

	/**
	* Sets the xcn01405 of this vr technical spec_xcn part3.
	*
	* @param XCN01405 the xcn01405 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01405(java.lang.String XCN01405) {
		_vrTechnicalSpec_XCNPart3.setXCN01405(XCN01405);
	}

	/**
	* Sets the xcn01406 of this vr technical spec_xcn part3.
	*
	* @param XCN01406 the xcn01406 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01406(java.lang.String XCN01406) {
		_vrTechnicalSpec_XCNPart3.setXCN01406(XCN01406);
	}

	/**
	* Sets the xcn01407 of this vr technical spec_xcn part3.
	*
	* @param XCN01407 the xcn01407 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01407(java.lang.String XCN01407) {
		_vrTechnicalSpec_XCNPart3.setXCN01407(XCN01407);
	}

	/**
	* Sets the xcn01408 of this vr technical spec_xcn part3.
	*
	* @param XCN01408 the xcn01408 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01408(java.lang.String XCN01408) {
		_vrTechnicalSpec_XCNPart3.setXCN01408(XCN01408);
	}

	/**
	* Sets the xcn01409 of this vr technical spec_xcn part3.
	*
	* @param XCN01409 the xcn01409 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01409(java.lang.String XCN01409) {
		_vrTechnicalSpec_XCNPart3.setXCN01409(XCN01409);
	}

	/**
	* Sets the xcn01410 of this vr technical spec_xcn part3.
	*
	* @param XCN01410 the xcn01410 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01410(java.lang.String XCN01410) {
		_vrTechnicalSpec_XCNPart3.setXCN01410(XCN01410);
	}

	/**
	* Sets the xcn01411 of this vr technical spec_xcn part3.
	*
	* @param XCN01411 the xcn01411 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01411(java.lang.String XCN01411) {
		_vrTechnicalSpec_XCNPart3.setXCN01411(XCN01411);
	}

	/**
	* Sets the xcn01412 of this vr technical spec_xcn part3.
	*
	* @param XCN01412 the xcn01412 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01412(java.lang.String XCN01412) {
		_vrTechnicalSpec_XCNPart3.setXCN01412(XCN01412);
	}

	/**
	* Sets the xcn01413 of this vr technical spec_xcn part3.
	*
	* @param XCN01413 the xcn01413 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01413(java.lang.String XCN01413) {
		_vrTechnicalSpec_XCNPart3.setXCN01413(XCN01413);
	}

	/**
	* Sets the xcn01414 of this vr technical spec_xcn part3.
	*
	* @param XCN01414 the xcn01414 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01414(java.lang.String XCN01414) {
		_vrTechnicalSpec_XCNPart3.setXCN01414(XCN01414);
	}

	/**
	* Sets the xcn01415 of this vr technical spec_xcn part3.
	*
	* @param XCN01415 the xcn01415 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01415(java.lang.String XCN01415) {
		_vrTechnicalSpec_XCNPart3.setXCN01415(XCN01415);
	}

	/**
	* Sets the xcn01416 of this vr technical spec_xcn part3.
	*
	* @param XCN01416 the xcn01416 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01416(java.lang.String XCN01416) {
		_vrTechnicalSpec_XCNPart3.setXCN01416(XCN01416);
	}

	/**
	* Sets the xcn01417 of this vr technical spec_xcn part3.
	*
	* @param XCN01417 the xcn01417 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01417(java.lang.String XCN01417) {
		_vrTechnicalSpec_XCNPart3.setXCN01417(XCN01417);
	}

	/**
	* Sets the xcn01418 of this vr technical spec_xcn part3.
	*
	* @param XCN01418 the xcn01418 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01418(java.lang.String XCN01418) {
		_vrTechnicalSpec_XCNPart3.setXCN01418(XCN01418);
	}

	/**
	* Sets the xcn01419 of this vr technical spec_xcn part3.
	*
	* @param XCN01419 the xcn01419 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01419(java.lang.String XCN01419) {
		_vrTechnicalSpec_XCNPart3.setXCN01419(XCN01419);
	}

	/**
	* Sets the xcn01420 of this vr technical spec_xcn part3.
	*
	* @param XCN01420 the xcn01420 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01420(java.lang.String XCN01420) {
		_vrTechnicalSpec_XCNPart3.setXCN01420(XCN01420);
	}

	/**
	* Sets the xcn01421 of this vr technical spec_xcn part3.
	*
	* @param XCN01421 the xcn01421 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01421(java.lang.String XCN01421) {
		_vrTechnicalSpec_XCNPart3.setXCN01421(XCN01421);
	}

	/**
	* Sets the xcn01422 of this vr technical spec_xcn part3.
	*
	* @param XCN01422 the xcn01422 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01422(java.lang.String XCN01422) {
		_vrTechnicalSpec_XCNPart3.setXCN01422(XCN01422);
	}

	/**
	* Sets the xcn01423 of this vr technical spec_xcn part3.
	*
	* @param XCN01423 the xcn01423 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01423(java.lang.String XCN01423) {
		_vrTechnicalSpec_XCNPart3.setXCN01423(XCN01423);
	}

	/**
	* Sets the xcn01424 of this vr technical spec_xcn part3.
	*
	* @param XCN01424 the xcn01424 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01424(java.lang.String XCN01424) {
		_vrTechnicalSpec_XCNPart3.setXCN01424(XCN01424);
	}

	/**
	* Sets the xcn01425 of this vr technical spec_xcn part3.
	*
	* @param XCN01425 the xcn01425 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01425(java.lang.String XCN01425) {
		_vrTechnicalSpec_XCNPart3.setXCN01425(XCN01425);
	}

	/**
	* Sets the xcn01426 of this vr technical spec_xcn part3.
	*
	* @param XCN01426 the xcn01426 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01426(java.lang.String XCN01426) {
		_vrTechnicalSpec_XCNPart3.setXCN01426(XCN01426);
	}

	/**
	* Sets the xcn01427 of this vr technical spec_xcn part3.
	*
	* @param XCN01427 the xcn01427 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01427(java.lang.String XCN01427) {
		_vrTechnicalSpec_XCNPart3.setXCN01427(XCN01427);
	}

	/**
	* Sets the xcn01428 of this vr technical spec_xcn part3.
	*
	* @param XCN01428 the xcn01428 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01428(java.lang.String XCN01428) {
		_vrTechnicalSpec_XCNPart3.setXCN01428(XCN01428);
	}

	/**
	* Sets the xcn01429 of this vr technical spec_xcn part3.
	*
	* @param XCN01429 the xcn01429 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01429(java.lang.String XCN01429) {
		_vrTechnicalSpec_XCNPart3.setXCN01429(XCN01429);
	}

	/**
	* Sets the xcn01430 of this vr technical spec_xcn part3.
	*
	* @param XCN01430 the xcn01430 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01430(java.lang.String XCN01430) {
		_vrTechnicalSpec_XCNPart3.setXCN01430(XCN01430);
	}

	/**
	* Sets the xcn01431 of this vr technical spec_xcn part3.
	*
	* @param XCN01431 the xcn01431 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01431(java.lang.String XCN01431) {
		_vrTechnicalSpec_XCNPart3.setXCN01431(XCN01431);
	}

	/**
	* Sets the xcn01432 of this vr technical spec_xcn part3.
	*
	* @param XCN01432 the xcn01432 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01432(java.lang.String XCN01432) {
		_vrTechnicalSpec_XCNPart3.setXCN01432(XCN01432);
	}

	/**
	* Sets the xcn01433 of this vr technical spec_xcn part3.
	*
	* @param XCN01433 the xcn01433 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01433(java.lang.String XCN01433) {
		_vrTechnicalSpec_XCNPart3.setXCN01433(XCN01433);
	}

	/**
	* Sets the xcn01434 of this vr technical spec_xcn part3.
	*
	* @param XCN01434 the xcn01434 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01434(java.lang.String XCN01434) {
		_vrTechnicalSpec_XCNPart3.setXCN01434(XCN01434);
	}

	/**
	* Sets the xcn01435 of this vr technical spec_xcn part3.
	*
	* @param XCN01435 the xcn01435 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01435(java.lang.String XCN01435) {
		_vrTechnicalSpec_XCNPart3.setXCN01435(XCN01435);
	}

	/**
	* Sets the xcn01436 of this vr technical spec_xcn part3.
	*
	* @param XCN01436 the xcn01436 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01436(java.lang.String XCN01436) {
		_vrTechnicalSpec_XCNPart3.setXCN01436(XCN01436);
	}

	/**
	* Sets the xcn01437 of this vr technical spec_xcn part3.
	*
	* @param XCN01437 the xcn01437 of this vr technical spec_xcn part3
	*/
	@Override
	public void setXCN01437(java.lang.String XCN01437) {
		_vrTechnicalSpec_XCNPart3.setXCN01437(XCN01437);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCNPart3Wrapper)) {
			return false;
		}

		VRTechnicalSpec_XCNPart3Wrapper vrTechnicalSpec_XCNPart3Wrapper = (VRTechnicalSpec_XCNPart3Wrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XCNPart3,
					vrTechnicalSpec_XCNPart3Wrapper._vrTechnicalSpec_XCNPart3)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XCNPart3 getWrappedModel() {
		return _vrTechnicalSpec_XCNPart3;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XCNPart3.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XCNPart3.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XCNPart3.resetOriginalValues();
	}

	private final VRTechnicalSpec_XCNPart3 _vrTechnicalSpec_XCNPart3;
}