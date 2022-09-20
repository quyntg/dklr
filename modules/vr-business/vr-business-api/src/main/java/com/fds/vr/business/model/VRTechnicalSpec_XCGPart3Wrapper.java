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
 * This class is a wrapper for {@link VRTechnicalSpec_XCGPart3}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart3
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart3Wrapper implements VRTechnicalSpec_XCGPart3,
	ModelWrapper<VRTechnicalSpec_XCGPart3> {
	public VRTechnicalSpec_XCGPart3Wrapper(
		VRTechnicalSpec_XCGPart3 vrTechnicalSpec_XCGPart3) {
		_vrTechnicalSpec_XCGPart3 = vrTechnicalSpec_XCGPart3;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XCGPart3.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XCGPart3.class.getName();
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
		attributes.put("XCG01310", getXCG01310());
		attributes.put("XCG01311", getXCG01311());
		attributes.put("XCG01312", getXCG01312());
		attributes.put("XCG01313", getXCG01313());
		attributes.put("XCG01314", getXCG01314());
		attributes.put("XCG01315", getXCG01315());
		attributes.put("XCG01316", getXCG01316());
		attributes.put("XCG01317", getXCG01317());
		attributes.put("XCG01318", getXCG01318());
		attributes.put("XCG01319", getXCG01319());
		attributes.put("XCG01320", getXCG01320());
		attributes.put("XCG01321", getXCG01321());
		attributes.put("XCG01322", getXCG01322());
		attributes.put("XCG01323", getXCG01323());
		attributes.put("XCG01324", getXCG01324());
		attributes.put("XCG01325", getXCG01325());
		attributes.put("XCG01326", getXCG01326());
		attributes.put("XCG01327", getXCG01327());
		attributes.put("XCG01328", getXCG01328());
		attributes.put("XCG01330", getXCG01330());
		attributes.put("XCG01331", getXCG01331());
		attributes.put("XCG01332", getXCG01332());
		attributes.put("XCG01333", getXCG01333());
		attributes.put("XCG01334", getXCG01334());
		attributes.put("XCG01335", getXCG01335());
		attributes.put("XCG01336", getXCG01336());
		attributes.put("XCG01337", getXCG01337());
		attributes.put("XCG01338", getXCG01338());
		attributes.put("XCG01339", getXCG01339());
		attributes.put("XCG01340", getXCG01340());
		attributes.put("XCG01341", getXCG01341());
		attributes.put("XCG01342", getXCG01342());
		attributes.put("XCG01343", getXCG01343());
		attributes.put("XCG01344", getXCG01344());
		attributes.put("XCG01345", getXCG01345());
		attributes.put("XCG01346", getXCG01346());
		attributes.put("XCG01347", getXCG01347());
		attributes.put("XCG01348", getXCG01348());
		attributes.put("XCG01349", getXCG01349());
		attributes.put("XCG01350", getXCG01350());
		attributes.put("XCG01351", getXCG01351());
		attributes.put("XCG01352", getXCG01352());
		attributes.put("XCG01353", getXCG01353());
		attributes.put("XCG01354", getXCG01354());
		attributes.put("XCG01355", getXCG01355());
		attributes.put("XCG01356", getXCG01356());
		attributes.put("XCG01357", getXCG01357());
		attributes.put("XCG01358", getXCG01358());
		attributes.put("XCG01359", getXCG01359());
		attributes.put("XCG01360", getXCG01360());
		attributes.put("XCG01361", getXCG01361());
		attributes.put("XCG01362", getXCG01362());
		attributes.put("XCG01363", getXCG01363());
		attributes.put("XCG01364", getXCG01364());
		attributes.put("XCG01365", getXCG01365());
		attributes.put("XCG01366", getXCG01366());
		attributes.put("XCG01367", getXCG01367());
		attributes.put("XCG01368", getXCG01368());
		attributes.put("XCG01369", getXCG01369());
		attributes.put("XCG01370", getXCG01370());
		attributes.put("XCG01371", getXCG01371());
		attributes.put("XCG01372", getXCG01372());
		attributes.put("XCG01373", getXCG01373());
		attributes.put("XCG01374", getXCG01374());
		attributes.put("XCG01375", getXCG01375());
		attributes.put("XCG01376", getXCG01376());
		attributes.put("XCG01377", getXCG01377());
		attributes.put("XCG01378", getXCG01378());
		attributes.put("XCG01379", getXCG01379());
		attributes.put("XCG01381", getXCG01381());
		attributes.put("XCG01382", getXCG01382());
		attributes.put("XCG01383", getXCG01383());
		attributes.put("XCG01384", getXCG01384());
		attributes.put("XCG01385", getXCG01385());
		attributes.put("XCG01386", getXCG01386());
		attributes.put("XCG01387", getXCG01387());
		attributes.put("XCG01388", getXCG01388());
		attributes.put("XCG01389", getXCG01389());
		attributes.put("XCG01390", getXCG01390());
		attributes.put("XCG01391", getXCG01391());
		attributes.put("XCG01392", getXCG01392());
		attributes.put("XCG01393", getXCG01393());
		attributes.put("XCG01394", getXCG01394());
		attributes.put("XCG01395", getXCG01395());
		attributes.put("XCG01396", getXCG01396());
		attributes.put("XCG01397", getXCG01397());
		attributes.put("XCG01398", getXCG01398());
		attributes.put("XCG01399", getXCG01399());
		attributes.put("XCG01400", getXCG01400());
		attributes.put("XCG01402", getXCG01402());
		attributes.put("XCG01403", getXCG01403());
		attributes.put("XCG01404", getXCG01404());
		attributes.put("XCG01405", getXCG01405());
		attributes.put("XCG01406", getXCG01406());
		attributes.put("XCG01407", getXCG01407());
		attributes.put("XCG01408", getXCG01408());
		attributes.put("XCG01409", getXCG01409());
		attributes.put("XCG01410", getXCG01410());
		attributes.put("XCG01411", getXCG01411());
		attributes.put("XCG01412", getXCG01412());
		attributes.put("XCG01413", getXCG01413());
		attributes.put("XCG01414", getXCG01414());
		attributes.put("XCG01415", getXCG01415());
		attributes.put("XCG01416", getXCG01416());
		attributes.put("XCG01417", getXCG01417());
		attributes.put("XCG01418", getXCG01418());
		attributes.put("XCG01419", getXCG01419());
		attributes.put("XCG01420", getXCG01420());
		attributes.put("XCG01421", getXCG01421());
		attributes.put("XCG01422", getXCG01422());
		attributes.put("XCG01423", getXCG01423());
		attributes.put("XCG01424", getXCG01424());
		attributes.put("XCG01425", getXCG01425());
		attributes.put("XCG01426", getXCG01426());
		attributes.put("XCG01427", getXCG01427());
		attributes.put("XCG01428", getXCG01428());
		attributes.put("XCG01437", getXCG01437());
		attributes.put("XCG01429", getXCG01429());
		attributes.put("XCG01430", getXCG01430());
		attributes.put("XCG01431", getXCG01431());
		attributes.put("XCG01432", getXCG01432());
		attributes.put("XCG01433", getXCG01433());
		attributes.put("XCG01434", getXCG01434());
		attributes.put("XCG01435", getXCG01435());
		attributes.put("XCG01436", getXCG01436());
		attributes.put("XCG01439", getXCG01439());
		attributes.put("XCG01440", getXCG01440());
		attributes.put("XCG01441", getXCG01441());
		attributes.put("XCG01442", getXCG01442());
		attributes.put("XCG01443", getXCG01443());
		attributes.put("XCG01445", getXCG01445());
		attributes.put("XCG01446", getXCG01446());
		attributes.put("XCG01447", getXCG01447());
		attributes.put("XCG01448", getXCG01448());
		attributes.put("XCG01449", getXCG01449());
		attributes.put("XCG01450", getXCG01450());
		attributes.put("XCG01451", getXCG01451());
		attributes.put("XCG01452", getXCG01452());
		attributes.put("XCG01453", getXCG01453());
		attributes.put("XCG01454", getXCG01454());
		attributes.put("XCG01455", getXCG01455());
		attributes.put("XCG01456", getXCG01456());
		attributes.put("XCG01457", getXCG01457());
		attributes.put("XCG01458", getXCG01458());
		attributes.put("XCG01459", getXCG01459());
		attributes.put("XCG01460", getXCG01460());
		attributes.put("XCG01461", getXCG01461());
		attributes.put("XCG01462", getXCG01462());
		attributes.put("XCG01463", getXCG01463());
		attributes.put("XCG01464", getXCG01464());
		attributes.put("XCG01465", getXCG01465());
		attributes.put("XCG01466", getXCG01466());
		attributes.put("XCG01467", getXCG01467());
		attributes.put("XCG01468", getXCG01468());
		attributes.put("XCG01469", getXCG01469());
		attributes.put("XCG01470", getXCG01470());
		attributes.put("XCG01471", getXCG01471());
		attributes.put("XCG01472", getXCG01472());
		attributes.put("XCG01473", getXCG01473());
		attributes.put("XCG01474", getXCG01474());
		attributes.put("XCG01475", getXCG01475());
		attributes.put("XCG01476", getXCG01476());
		attributes.put("XCG01477", getXCG01477());
		attributes.put("XCG01478", getXCG01478());
		attributes.put("XCG01479", getXCG01479());
		attributes.put("XCG01480", getXCG01480());
		attributes.put("XCG01481", getXCG01481());
		attributes.put("XCG01482", getXCG01482());
		attributes.put("XCG01483", getXCG01483());
		attributes.put("XCG01484", getXCG01484());
		attributes.put("XCG01485", getXCG01485());
		attributes.put("XCG01486", getXCG01486());
		attributes.put("XCG01487", getXCG01487());
		attributes.put("XCG01488", getXCG01488());
		attributes.put("XCG01489", getXCG01489());
		attributes.put("XCG01490", getXCG01490());
		attributes.put("XCG01491", getXCG01491());
		attributes.put("XCG01492", getXCG01492());
		attributes.put("XCG01493", getXCG01493());
		attributes.put("XCG01494", getXCG01494());
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

		String XCG01310 = (String)attributes.get("XCG01310");

		if (XCG01310 != null) {
			setXCG01310(XCG01310);
		}

		String XCG01311 = (String)attributes.get("XCG01311");

		if (XCG01311 != null) {
			setXCG01311(XCG01311);
		}

		String XCG01312 = (String)attributes.get("XCG01312");

		if (XCG01312 != null) {
			setXCG01312(XCG01312);
		}

		String XCG01313 = (String)attributes.get("XCG01313");

		if (XCG01313 != null) {
			setXCG01313(XCG01313);
		}

		String XCG01314 = (String)attributes.get("XCG01314");

		if (XCG01314 != null) {
			setXCG01314(XCG01314);
		}

		String XCG01315 = (String)attributes.get("XCG01315");

		if (XCG01315 != null) {
			setXCG01315(XCG01315);
		}

		String XCG01316 = (String)attributes.get("XCG01316");

		if (XCG01316 != null) {
			setXCG01316(XCG01316);
		}

		String XCG01317 = (String)attributes.get("XCG01317");

		if (XCG01317 != null) {
			setXCG01317(XCG01317);
		}

		String XCG01318 = (String)attributes.get("XCG01318");

		if (XCG01318 != null) {
			setXCG01318(XCG01318);
		}

		String XCG01319 = (String)attributes.get("XCG01319");

		if (XCG01319 != null) {
			setXCG01319(XCG01319);
		}

		String XCG01320 = (String)attributes.get("XCG01320");

		if (XCG01320 != null) {
			setXCG01320(XCG01320);
		}

		String XCG01321 = (String)attributes.get("XCG01321");

		if (XCG01321 != null) {
			setXCG01321(XCG01321);
		}

		String XCG01322 = (String)attributes.get("XCG01322");

		if (XCG01322 != null) {
			setXCG01322(XCG01322);
		}

		String XCG01323 = (String)attributes.get("XCG01323");

		if (XCG01323 != null) {
			setXCG01323(XCG01323);
		}

		String XCG01324 = (String)attributes.get("XCG01324");

		if (XCG01324 != null) {
			setXCG01324(XCG01324);
		}

		String XCG01325 = (String)attributes.get("XCG01325");

		if (XCG01325 != null) {
			setXCG01325(XCG01325);
		}

		String XCG01326 = (String)attributes.get("XCG01326");

		if (XCG01326 != null) {
			setXCG01326(XCG01326);
		}

		String XCG01327 = (String)attributes.get("XCG01327");

		if (XCG01327 != null) {
			setXCG01327(XCG01327);
		}

		String XCG01328 = (String)attributes.get("XCG01328");

		if (XCG01328 != null) {
			setXCG01328(XCG01328);
		}

		String XCG01330 = (String)attributes.get("XCG01330");

		if (XCG01330 != null) {
			setXCG01330(XCG01330);
		}

		String XCG01331 = (String)attributes.get("XCG01331");

		if (XCG01331 != null) {
			setXCG01331(XCG01331);
		}

		String XCG01332 = (String)attributes.get("XCG01332");

		if (XCG01332 != null) {
			setXCG01332(XCG01332);
		}

		String XCG01333 = (String)attributes.get("XCG01333");

		if (XCG01333 != null) {
			setXCG01333(XCG01333);
		}

		String XCG01334 = (String)attributes.get("XCG01334");

		if (XCG01334 != null) {
			setXCG01334(XCG01334);
		}

		String XCG01335 = (String)attributes.get("XCG01335");

		if (XCG01335 != null) {
			setXCG01335(XCG01335);
		}

		String XCG01336 = (String)attributes.get("XCG01336");

		if (XCG01336 != null) {
			setXCG01336(XCG01336);
		}

		String XCG01337 = (String)attributes.get("XCG01337");

		if (XCG01337 != null) {
			setXCG01337(XCG01337);
		}

		String XCG01338 = (String)attributes.get("XCG01338");

		if (XCG01338 != null) {
			setXCG01338(XCG01338);
		}

		String XCG01339 = (String)attributes.get("XCG01339");

		if (XCG01339 != null) {
			setXCG01339(XCG01339);
		}

		String XCG01340 = (String)attributes.get("XCG01340");

		if (XCG01340 != null) {
			setXCG01340(XCG01340);
		}

		String XCG01341 = (String)attributes.get("XCG01341");

		if (XCG01341 != null) {
			setXCG01341(XCG01341);
		}

		String XCG01342 = (String)attributes.get("XCG01342");

		if (XCG01342 != null) {
			setXCG01342(XCG01342);
		}

		String XCG01343 = (String)attributes.get("XCG01343");

		if (XCG01343 != null) {
			setXCG01343(XCG01343);
		}

		String XCG01344 = (String)attributes.get("XCG01344");

		if (XCG01344 != null) {
			setXCG01344(XCG01344);
		}

		String XCG01345 = (String)attributes.get("XCG01345");

		if (XCG01345 != null) {
			setXCG01345(XCG01345);
		}

		String XCG01346 = (String)attributes.get("XCG01346");

		if (XCG01346 != null) {
			setXCG01346(XCG01346);
		}

		String XCG01347 = (String)attributes.get("XCG01347");

		if (XCG01347 != null) {
			setXCG01347(XCG01347);
		}

		String XCG01348 = (String)attributes.get("XCG01348");

		if (XCG01348 != null) {
			setXCG01348(XCG01348);
		}

		String XCG01349 = (String)attributes.get("XCG01349");

		if (XCG01349 != null) {
			setXCG01349(XCG01349);
		}

		String XCG01350 = (String)attributes.get("XCG01350");

		if (XCG01350 != null) {
			setXCG01350(XCG01350);
		}

		String XCG01351 = (String)attributes.get("XCG01351");

		if (XCG01351 != null) {
			setXCG01351(XCG01351);
		}

		String XCG01352 = (String)attributes.get("XCG01352");

		if (XCG01352 != null) {
			setXCG01352(XCG01352);
		}

		String XCG01353 = (String)attributes.get("XCG01353");

		if (XCG01353 != null) {
			setXCG01353(XCG01353);
		}

		String XCG01354 = (String)attributes.get("XCG01354");

		if (XCG01354 != null) {
			setXCG01354(XCG01354);
		}

		String XCG01355 = (String)attributes.get("XCG01355");

		if (XCG01355 != null) {
			setXCG01355(XCG01355);
		}

		String XCG01356 = (String)attributes.get("XCG01356");

		if (XCG01356 != null) {
			setXCG01356(XCG01356);
		}

		String XCG01357 = (String)attributes.get("XCG01357");

		if (XCG01357 != null) {
			setXCG01357(XCG01357);
		}

		String XCG01358 = (String)attributes.get("XCG01358");

		if (XCG01358 != null) {
			setXCG01358(XCG01358);
		}

		String XCG01359 = (String)attributes.get("XCG01359");

		if (XCG01359 != null) {
			setXCG01359(XCG01359);
		}

		String XCG01360 = (String)attributes.get("XCG01360");

		if (XCG01360 != null) {
			setXCG01360(XCG01360);
		}

		String XCG01361 = (String)attributes.get("XCG01361");

		if (XCG01361 != null) {
			setXCG01361(XCG01361);
		}

		String XCG01362 = (String)attributes.get("XCG01362");

		if (XCG01362 != null) {
			setXCG01362(XCG01362);
		}

		String XCG01363 = (String)attributes.get("XCG01363");

		if (XCG01363 != null) {
			setXCG01363(XCG01363);
		}

		String XCG01364 = (String)attributes.get("XCG01364");

		if (XCG01364 != null) {
			setXCG01364(XCG01364);
		}

		String XCG01365 = (String)attributes.get("XCG01365");

		if (XCG01365 != null) {
			setXCG01365(XCG01365);
		}

		String XCG01366 = (String)attributes.get("XCG01366");

		if (XCG01366 != null) {
			setXCG01366(XCG01366);
		}

		String XCG01367 = (String)attributes.get("XCG01367");

		if (XCG01367 != null) {
			setXCG01367(XCG01367);
		}

		String XCG01368 = (String)attributes.get("XCG01368");

		if (XCG01368 != null) {
			setXCG01368(XCG01368);
		}

		String XCG01369 = (String)attributes.get("XCG01369");

		if (XCG01369 != null) {
			setXCG01369(XCG01369);
		}

		String XCG01370 = (String)attributes.get("XCG01370");

		if (XCG01370 != null) {
			setXCG01370(XCG01370);
		}

		String XCG01371 = (String)attributes.get("XCG01371");

		if (XCG01371 != null) {
			setXCG01371(XCG01371);
		}

		String XCG01372 = (String)attributes.get("XCG01372");

		if (XCG01372 != null) {
			setXCG01372(XCG01372);
		}

		String XCG01373 = (String)attributes.get("XCG01373");

		if (XCG01373 != null) {
			setXCG01373(XCG01373);
		}

		String XCG01374 = (String)attributes.get("XCG01374");

		if (XCG01374 != null) {
			setXCG01374(XCG01374);
		}

		String XCG01375 = (String)attributes.get("XCG01375");

		if (XCG01375 != null) {
			setXCG01375(XCG01375);
		}

		String XCG01376 = (String)attributes.get("XCG01376");

		if (XCG01376 != null) {
			setXCG01376(XCG01376);
		}

		String XCG01377 = (String)attributes.get("XCG01377");

		if (XCG01377 != null) {
			setXCG01377(XCG01377);
		}

		String XCG01378 = (String)attributes.get("XCG01378");

		if (XCG01378 != null) {
			setXCG01378(XCG01378);
		}

		String XCG01379 = (String)attributes.get("XCG01379");

		if (XCG01379 != null) {
			setXCG01379(XCG01379);
		}

		String XCG01381 = (String)attributes.get("XCG01381");

		if (XCG01381 != null) {
			setXCG01381(XCG01381);
		}

		String XCG01382 = (String)attributes.get("XCG01382");

		if (XCG01382 != null) {
			setXCG01382(XCG01382);
		}

		String XCG01383 = (String)attributes.get("XCG01383");

		if (XCG01383 != null) {
			setXCG01383(XCG01383);
		}

		String XCG01384 = (String)attributes.get("XCG01384");

		if (XCG01384 != null) {
			setXCG01384(XCG01384);
		}

		String XCG01385 = (String)attributes.get("XCG01385");

		if (XCG01385 != null) {
			setXCG01385(XCG01385);
		}

		String XCG01386 = (String)attributes.get("XCG01386");

		if (XCG01386 != null) {
			setXCG01386(XCG01386);
		}

		String XCG01387 = (String)attributes.get("XCG01387");

		if (XCG01387 != null) {
			setXCG01387(XCG01387);
		}

		String XCG01388 = (String)attributes.get("XCG01388");

		if (XCG01388 != null) {
			setXCG01388(XCG01388);
		}

		String XCG01389 = (String)attributes.get("XCG01389");

		if (XCG01389 != null) {
			setXCG01389(XCG01389);
		}

		String XCG01390 = (String)attributes.get("XCG01390");

		if (XCG01390 != null) {
			setXCG01390(XCG01390);
		}

		String XCG01391 = (String)attributes.get("XCG01391");

		if (XCG01391 != null) {
			setXCG01391(XCG01391);
		}

		String XCG01392 = (String)attributes.get("XCG01392");

		if (XCG01392 != null) {
			setXCG01392(XCG01392);
		}

		String XCG01393 = (String)attributes.get("XCG01393");

		if (XCG01393 != null) {
			setXCG01393(XCG01393);
		}

		String XCG01394 = (String)attributes.get("XCG01394");

		if (XCG01394 != null) {
			setXCG01394(XCG01394);
		}

		String XCG01395 = (String)attributes.get("XCG01395");

		if (XCG01395 != null) {
			setXCG01395(XCG01395);
		}

		String XCG01396 = (String)attributes.get("XCG01396");

		if (XCG01396 != null) {
			setXCG01396(XCG01396);
		}

		String XCG01397 = (String)attributes.get("XCG01397");

		if (XCG01397 != null) {
			setXCG01397(XCG01397);
		}

		String XCG01398 = (String)attributes.get("XCG01398");

		if (XCG01398 != null) {
			setXCG01398(XCG01398);
		}

		String XCG01399 = (String)attributes.get("XCG01399");

		if (XCG01399 != null) {
			setXCG01399(XCG01399);
		}

		String XCG01400 = (String)attributes.get("XCG01400");

		if (XCG01400 != null) {
			setXCG01400(XCG01400);
		}

		String XCG01402 = (String)attributes.get("XCG01402");

		if (XCG01402 != null) {
			setXCG01402(XCG01402);
		}

		String XCG01403 = (String)attributes.get("XCG01403");

		if (XCG01403 != null) {
			setXCG01403(XCG01403);
		}

		String XCG01404 = (String)attributes.get("XCG01404");

		if (XCG01404 != null) {
			setXCG01404(XCG01404);
		}

		String XCG01405 = (String)attributes.get("XCG01405");

		if (XCG01405 != null) {
			setXCG01405(XCG01405);
		}

		String XCG01406 = (String)attributes.get("XCG01406");

		if (XCG01406 != null) {
			setXCG01406(XCG01406);
		}

		String XCG01407 = (String)attributes.get("XCG01407");

		if (XCG01407 != null) {
			setXCG01407(XCG01407);
		}

		String XCG01408 = (String)attributes.get("XCG01408");

		if (XCG01408 != null) {
			setXCG01408(XCG01408);
		}

		String XCG01409 = (String)attributes.get("XCG01409");

		if (XCG01409 != null) {
			setXCG01409(XCG01409);
		}

		String XCG01410 = (String)attributes.get("XCG01410");

		if (XCG01410 != null) {
			setXCG01410(XCG01410);
		}

		String XCG01411 = (String)attributes.get("XCG01411");

		if (XCG01411 != null) {
			setXCG01411(XCG01411);
		}

		String XCG01412 = (String)attributes.get("XCG01412");

		if (XCG01412 != null) {
			setXCG01412(XCG01412);
		}

		String XCG01413 = (String)attributes.get("XCG01413");

		if (XCG01413 != null) {
			setXCG01413(XCG01413);
		}

		String XCG01414 = (String)attributes.get("XCG01414");

		if (XCG01414 != null) {
			setXCG01414(XCG01414);
		}

		String XCG01415 = (String)attributes.get("XCG01415");

		if (XCG01415 != null) {
			setXCG01415(XCG01415);
		}

		String XCG01416 = (String)attributes.get("XCG01416");

		if (XCG01416 != null) {
			setXCG01416(XCG01416);
		}

		String XCG01417 = (String)attributes.get("XCG01417");

		if (XCG01417 != null) {
			setXCG01417(XCG01417);
		}

		String XCG01418 = (String)attributes.get("XCG01418");

		if (XCG01418 != null) {
			setXCG01418(XCG01418);
		}

		String XCG01419 = (String)attributes.get("XCG01419");

		if (XCG01419 != null) {
			setXCG01419(XCG01419);
		}

		String XCG01420 = (String)attributes.get("XCG01420");

		if (XCG01420 != null) {
			setXCG01420(XCG01420);
		}

		String XCG01421 = (String)attributes.get("XCG01421");

		if (XCG01421 != null) {
			setXCG01421(XCG01421);
		}

		String XCG01422 = (String)attributes.get("XCG01422");

		if (XCG01422 != null) {
			setXCG01422(XCG01422);
		}

		String XCG01423 = (String)attributes.get("XCG01423");

		if (XCG01423 != null) {
			setXCG01423(XCG01423);
		}

		String XCG01424 = (String)attributes.get("XCG01424");

		if (XCG01424 != null) {
			setXCG01424(XCG01424);
		}

		String XCG01425 = (String)attributes.get("XCG01425");

		if (XCG01425 != null) {
			setXCG01425(XCG01425);
		}

		String XCG01426 = (String)attributes.get("XCG01426");

		if (XCG01426 != null) {
			setXCG01426(XCG01426);
		}

		String XCG01427 = (String)attributes.get("XCG01427");

		if (XCG01427 != null) {
			setXCG01427(XCG01427);
		}

		String XCG01428 = (String)attributes.get("XCG01428");

		if (XCG01428 != null) {
			setXCG01428(XCG01428);
		}

		String XCG01437 = (String)attributes.get("XCG01437");

		if (XCG01437 != null) {
			setXCG01437(XCG01437);
		}

		String XCG01429 = (String)attributes.get("XCG01429");

		if (XCG01429 != null) {
			setXCG01429(XCG01429);
		}

		String XCG01430 = (String)attributes.get("XCG01430");

		if (XCG01430 != null) {
			setXCG01430(XCG01430);
		}

		String XCG01431 = (String)attributes.get("XCG01431");

		if (XCG01431 != null) {
			setXCG01431(XCG01431);
		}

		String XCG01432 = (String)attributes.get("XCG01432");

		if (XCG01432 != null) {
			setXCG01432(XCG01432);
		}

		String XCG01433 = (String)attributes.get("XCG01433");

		if (XCG01433 != null) {
			setXCG01433(XCG01433);
		}

		String XCG01434 = (String)attributes.get("XCG01434");

		if (XCG01434 != null) {
			setXCG01434(XCG01434);
		}

		String XCG01435 = (String)attributes.get("XCG01435");

		if (XCG01435 != null) {
			setXCG01435(XCG01435);
		}

		String XCG01436 = (String)attributes.get("XCG01436");

		if (XCG01436 != null) {
			setXCG01436(XCG01436);
		}

		String XCG01439 = (String)attributes.get("XCG01439");

		if (XCG01439 != null) {
			setXCG01439(XCG01439);
		}

		String XCG01440 = (String)attributes.get("XCG01440");

		if (XCG01440 != null) {
			setXCG01440(XCG01440);
		}

		String XCG01441 = (String)attributes.get("XCG01441");

		if (XCG01441 != null) {
			setXCG01441(XCG01441);
		}

		String XCG01442 = (String)attributes.get("XCG01442");

		if (XCG01442 != null) {
			setXCG01442(XCG01442);
		}

		String XCG01443 = (String)attributes.get("XCG01443");

		if (XCG01443 != null) {
			setXCG01443(XCG01443);
		}

		String XCG01445 = (String)attributes.get("XCG01445");

		if (XCG01445 != null) {
			setXCG01445(XCG01445);
		}

		String XCG01446 = (String)attributes.get("XCG01446");

		if (XCG01446 != null) {
			setXCG01446(XCG01446);
		}

		String XCG01447 = (String)attributes.get("XCG01447");

		if (XCG01447 != null) {
			setXCG01447(XCG01447);
		}

		String XCG01448 = (String)attributes.get("XCG01448");

		if (XCG01448 != null) {
			setXCG01448(XCG01448);
		}

		String XCG01449 = (String)attributes.get("XCG01449");

		if (XCG01449 != null) {
			setXCG01449(XCG01449);
		}

		String XCG01450 = (String)attributes.get("XCG01450");

		if (XCG01450 != null) {
			setXCG01450(XCG01450);
		}

		String XCG01451 = (String)attributes.get("XCG01451");

		if (XCG01451 != null) {
			setXCG01451(XCG01451);
		}

		String XCG01452 = (String)attributes.get("XCG01452");

		if (XCG01452 != null) {
			setXCG01452(XCG01452);
		}

		String XCG01453 = (String)attributes.get("XCG01453");

		if (XCG01453 != null) {
			setXCG01453(XCG01453);
		}

		String XCG01454 = (String)attributes.get("XCG01454");

		if (XCG01454 != null) {
			setXCG01454(XCG01454);
		}

		String XCG01455 = (String)attributes.get("XCG01455");

		if (XCG01455 != null) {
			setXCG01455(XCG01455);
		}

		String XCG01456 = (String)attributes.get("XCG01456");

		if (XCG01456 != null) {
			setXCG01456(XCG01456);
		}

		String XCG01457 = (String)attributes.get("XCG01457");

		if (XCG01457 != null) {
			setXCG01457(XCG01457);
		}

		String XCG01458 = (String)attributes.get("XCG01458");

		if (XCG01458 != null) {
			setXCG01458(XCG01458);
		}

		String XCG01459 = (String)attributes.get("XCG01459");

		if (XCG01459 != null) {
			setXCG01459(XCG01459);
		}

		String XCG01460 = (String)attributes.get("XCG01460");

		if (XCG01460 != null) {
			setXCG01460(XCG01460);
		}

		String XCG01461 = (String)attributes.get("XCG01461");

		if (XCG01461 != null) {
			setXCG01461(XCG01461);
		}

		String XCG01462 = (String)attributes.get("XCG01462");

		if (XCG01462 != null) {
			setXCG01462(XCG01462);
		}

		String XCG01463 = (String)attributes.get("XCG01463");

		if (XCG01463 != null) {
			setXCG01463(XCG01463);
		}

		String XCG01464 = (String)attributes.get("XCG01464");

		if (XCG01464 != null) {
			setXCG01464(XCG01464);
		}

		String XCG01465 = (String)attributes.get("XCG01465");

		if (XCG01465 != null) {
			setXCG01465(XCG01465);
		}

		String XCG01466 = (String)attributes.get("XCG01466");

		if (XCG01466 != null) {
			setXCG01466(XCG01466);
		}

		String XCG01467 = (String)attributes.get("XCG01467");

		if (XCG01467 != null) {
			setXCG01467(XCG01467);
		}

		String XCG01468 = (String)attributes.get("XCG01468");

		if (XCG01468 != null) {
			setXCG01468(XCG01468);
		}

		String XCG01469 = (String)attributes.get("XCG01469");

		if (XCG01469 != null) {
			setXCG01469(XCG01469);
		}

		String XCG01470 = (String)attributes.get("XCG01470");

		if (XCG01470 != null) {
			setXCG01470(XCG01470);
		}

		String XCG01471 = (String)attributes.get("XCG01471");

		if (XCG01471 != null) {
			setXCG01471(XCG01471);
		}

		String XCG01472 = (String)attributes.get("XCG01472");

		if (XCG01472 != null) {
			setXCG01472(XCG01472);
		}

		String XCG01473 = (String)attributes.get("XCG01473");

		if (XCG01473 != null) {
			setXCG01473(XCG01473);
		}

		String XCG01474 = (String)attributes.get("XCG01474");

		if (XCG01474 != null) {
			setXCG01474(XCG01474);
		}

		String XCG01475 = (String)attributes.get("XCG01475");

		if (XCG01475 != null) {
			setXCG01475(XCG01475);
		}

		String XCG01476 = (String)attributes.get("XCG01476");

		if (XCG01476 != null) {
			setXCG01476(XCG01476);
		}

		String XCG01477 = (String)attributes.get("XCG01477");

		if (XCG01477 != null) {
			setXCG01477(XCG01477);
		}

		String XCG01478 = (String)attributes.get("XCG01478");

		if (XCG01478 != null) {
			setXCG01478(XCG01478);
		}

		String XCG01479 = (String)attributes.get("XCG01479");

		if (XCG01479 != null) {
			setXCG01479(XCG01479);
		}

		String XCG01480 = (String)attributes.get("XCG01480");

		if (XCG01480 != null) {
			setXCG01480(XCG01480);
		}

		String XCG01481 = (String)attributes.get("XCG01481");

		if (XCG01481 != null) {
			setXCG01481(XCG01481);
		}

		String XCG01482 = (String)attributes.get("XCG01482");

		if (XCG01482 != null) {
			setXCG01482(XCG01482);
		}

		String XCG01483 = (String)attributes.get("XCG01483");

		if (XCG01483 != null) {
			setXCG01483(XCG01483);
		}

		String XCG01484 = (String)attributes.get("XCG01484");

		if (XCG01484 != null) {
			setXCG01484(XCG01484);
		}

		String XCG01485 = (String)attributes.get("XCG01485");

		if (XCG01485 != null) {
			setXCG01485(XCG01485);
		}

		String XCG01486 = (String)attributes.get("XCG01486");

		if (XCG01486 != null) {
			setXCG01486(XCG01486);
		}

		String XCG01487 = (String)attributes.get("XCG01487");

		if (XCG01487 != null) {
			setXCG01487(XCG01487);
		}

		String XCG01488 = (String)attributes.get("XCG01488");

		if (XCG01488 != null) {
			setXCG01488(XCG01488);
		}

		String XCG01489 = (String)attributes.get("XCG01489");

		if (XCG01489 != null) {
			setXCG01489(XCG01489);
		}

		String XCG01490 = (String)attributes.get("XCG01490");

		if (XCG01490 != null) {
			setXCG01490(XCG01490);
		}

		String XCG01491 = (String)attributes.get("XCG01491");

		if (XCG01491 != null) {
			setXCG01491(XCG01491);
		}

		String XCG01492 = (String)attributes.get("XCG01492");

		if (XCG01492 != null) {
			setXCG01492(XCG01492);
		}

		String XCG01493 = (String)attributes.get("XCG01493");

		if (XCG01493 != null) {
			setXCG01493(XCG01493);
		}

		String XCG01494 = (String)attributes.get("XCG01494");

		if (XCG01494 != null) {
			setXCG01494(XCG01494);
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
	public VRTechnicalSpec_XCGPart3 toEscapedModel() {
		return new VRTechnicalSpec_XCGPart3Wrapper(_vrTechnicalSpec_XCGPart3.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XCGPart3 toUnescapedModel() {
		return new VRTechnicalSpec_XCGPart3Wrapper(_vrTechnicalSpec_XCGPart3.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XCGPart3.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XCGPart3.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XCGPart3.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XCGPart3.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XCGPart3> toCacheModel() {
		return _vrTechnicalSpec_XCGPart3.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XCGPart3 vrTechnicalSpec_XCGPart3) {
		return _vrTechnicalSpec_XCGPart3.compareTo(vrTechnicalSpec_XCGPart3);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XCGPart3.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XCGPart3.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XCGPart3Wrapper((VRTechnicalSpec_XCGPart3)_vrTechnicalSpec_XCGPart3.clone());
	}

	/**
	* Returns the deliverable code of this vr technical spec_xcg part3.
	*
	* @return the deliverable code of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XCGPart3.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xcg part3.
	*
	* @return the dossier ID ctn of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XCGPart3.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xcg part3.
	*
	* @return the dossier no of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XCGPart3.getDossierNo();
	}

	/**
	* Returns the reference uid of this vr technical spec_xcg part3.
	*
	* @return the reference uid of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XCGPart3.getReferenceUid();
	}

	/**
	* Returns the xcg01310 of this vr technical spec_xcg part3.
	*
	* @return the xcg01310 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01310() {
		return _vrTechnicalSpec_XCGPart3.getXCG01310();
	}

	/**
	* Returns the xcg01311 of this vr technical spec_xcg part3.
	*
	* @return the xcg01311 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01311() {
		return _vrTechnicalSpec_XCGPart3.getXCG01311();
	}

	/**
	* Returns the xcg01312 of this vr technical spec_xcg part3.
	*
	* @return the xcg01312 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01312() {
		return _vrTechnicalSpec_XCGPart3.getXCG01312();
	}

	/**
	* Returns the xcg01313 of this vr technical spec_xcg part3.
	*
	* @return the xcg01313 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01313() {
		return _vrTechnicalSpec_XCGPart3.getXCG01313();
	}

	/**
	* Returns the xcg01314 of this vr technical spec_xcg part3.
	*
	* @return the xcg01314 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01314() {
		return _vrTechnicalSpec_XCGPart3.getXCG01314();
	}

	/**
	* Returns the xcg01315 of this vr technical spec_xcg part3.
	*
	* @return the xcg01315 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01315() {
		return _vrTechnicalSpec_XCGPart3.getXCG01315();
	}

	/**
	* Returns the xcg01316 of this vr technical spec_xcg part3.
	*
	* @return the xcg01316 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01316() {
		return _vrTechnicalSpec_XCGPart3.getXCG01316();
	}

	/**
	* Returns the xcg01317 of this vr technical spec_xcg part3.
	*
	* @return the xcg01317 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01317() {
		return _vrTechnicalSpec_XCGPart3.getXCG01317();
	}

	/**
	* Returns the xcg01318 of this vr technical spec_xcg part3.
	*
	* @return the xcg01318 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01318() {
		return _vrTechnicalSpec_XCGPart3.getXCG01318();
	}

	/**
	* Returns the xcg01319 of this vr technical spec_xcg part3.
	*
	* @return the xcg01319 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01319() {
		return _vrTechnicalSpec_XCGPart3.getXCG01319();
	}

	/**
	* Returns the xcg01320 of this vr technical spec_xcg part3.
	*
	* @return the xcg01320 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01320() {
		return _vrTechnicalSpec_XCGPart3.getXCG01320();
	}

	/**
	* Returns the xcg01321 of this vr technical spec_xcg part3.
	*
	* @return the xcg01321 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01321() {
		return _vrTechnicalSpec_XCGPart3.getXCG01321();
	}

	/**
	* Returns the xcg01322 of this vr technical spec_xcg part3.
	*
	* @return the xcg01322 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01322() {
		return _vrTechnicalSpec_XCGPart3.getXCG01322();
	}

	/**
	* Returns the xcg01323 of this vr technical spec_xcg part3.
	*
	* @return the xcg01323 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01323() {
		return _vrTechnicalSpec_XCGPart3.getXCG01323();
	}

	/**
	* Returns the xcg01324 of this vr technical spec_xcg part3.
	*
	* @return the xcg01324 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01324() {
		return _vrTechnicalSpec_XCGPart3.getXCG01324();
	}

	/**
	* Returns the xcg01325 of this vr technical spec_xcg part3.
	*
	* @return the xcg01325 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01325() {
		return _vrTechnicalSpec_XCGPart3.getXCG01325();
	}

	/**
	* Returns the xcg01326 of this vr technical spec_xcg part3.
	*
	* @return the xcg01326 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01326() {
		return _vrTechnicalSpec_XCGPart3.getXCG01326();
	}

	/**
	* Returns the xcg01327 of this vr technical spec_xcg part3.
	*
	* @return the xcg01327 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01327() {
		return _vrTechnicalSpec_XCGPart3.getXCG01327();
	}

	/**
	* Returns the xcg01328 of this vr technical spec_xcg part3.
	*
	* @return the xcg01328 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01328() {
		return _vrTechnicalSpec_XCGPart3.getXCG01328();
	}

	/**
	* Returns the xcg01330 of this vr technical spec_xcg part3.
	*
	* @return the xcg01330 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01330() {
		return _vrTechnicalSpec_XCGPart3.getXCG01330();
	}

	/**
	* Returns the xcg01331 of this vr technical spec_xcg part3.
	*
	* @return the xcg01331 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01331() {
		return _vrTechnicalSpec_XCGPart3.getXCG01331();
	}

	/**
	* Returns the xcg01332 of this vr technical spec_xcg part3.
	*
	* @return the xcg01332 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01332() {
		return _vrTechnicalSpec_XCGPart3.getXCG01332();
	}

	/**
	* Returns the xcg01333 of this vr technical spec_xcg part3.
	*
	* @return the xcg01333 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01333() {
		return _vrTechnicalSpec_XCGPart3.getXCG01333();
	}

	/**
	* Returns the xcg01334 of this vr technical spec_xcg part3.
	*
	* @return the xcg01334 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01334() {
		return _vrTechnicalSpec_XCGPart3.getXCG01334();
	}

	/**
	* Returns the xcg01335 of this vr technical spec_xcg part3.
	*
	* @return the xcg01335 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01335() {
		return _vrTechnicalSpec_XCGPart3.getXCG01335();
	}

	/**
	* Returns the xcg01336 of this vr technical spec_xcg part3.
	*
	* @return the xcg01336 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01336() {
		return _vrTechnicalSpec_XCGPart3.getXCG01336();
	}

	/**
	* Returns the xcg01337 of this vr technical spec_xcg part3.
	*
	* @return the xcg01337 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01337() {
		return _vrTechnicalSpec_XCGPart3.getXCG01337();
	}

	/**
	* Returns the xcg01338 of this vr technical spec_xcg part3.
	*
	* @return the xcg01338 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01338() {
		return _vrTechnicalSpec_XCGPart3.getXCG01338();
	}

	/**
	* Returns the xcg01339 of this vr technical spec_xcg part3.
	*
	* @return the xcg01339 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01339() {
		return _vrTechnicalSpec_XCGPart3.getXCG01339();
	}

	/**
	* Returns the xcg01340 of this vr technical spec_xcg part3.
	*
	* @return the xcg01340 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01340() {
		return _vrTechnicalSpec_XCGPart3.getXCG01340();
	}

	/**
	* Returns the xcg01341 of this vr technical spec_xcg part3.
	*
	* @return the xcg01341 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01341() {
		return _vrTechnicalSpec_XCGPart3.getXCG01341();
	}

	/**
	* Returns the xcg01342 of this vr technical spec_xcg part3.
	*
	* @return the xcg01342 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01342() {
		return _vrTechnicalSpec_XCGPart3.getXCG01342();
	}

	/**
	* Returns the xcg01343 of this vr technical spec_xcg part3.
	*
	* @return the xcg01343 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01343() {
		return _vrTechnicalSpec_XCGPart3.getXCG01343();
	}

	/**
	* Returns the xcg01344 of this vr technical spec_xcg part3.
	*
	* @return the xcg01344 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01344() {
		return _vrTechnicalSpec_XCGPart3.getXCG01344();
	}

	/**
	* Returns the xcg01345 of this vr technical spec_xcg part3.
	*
	* @return the xcg01345 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01345() {
		return _vrTechnicalSpec_XCGPart3.getXCG01345();
	}

	/**
	* Returns the xcg01346 of this vr technical spec_xcg part3.
	*
	* @return the xcg01346 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01346() {
		return _vrTechnicalSpec_XCGPart3.getXCG01346();
	}

	/**
	* Returns the xcg01347 of this vr technical spec_xcg part3.
	*
	* @return the xcg01347 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01347() {
		return _vrTechnicalSpec_XCGPart3.getXCG01347();
	}

	/**
	* Returns the xcg01348 of this vr technical spec_xcg part3.
	*
	* @return the xcg01348 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01348() {
		return _vrTechnicalSpec_XCGPart3.getXCG01348();
	}

	/**
	* Returns the xcg01349 of this vr technical spec_xcg part3.
	*
	* @return the xcg01349 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01349() {
		return _vrTechnicalSpec_XCGPart3.getXCG01349();
	}

	/**
	* Returns the xcg01350 of this vr technical spec_xcg part3.
	*
	* @return the xcg01350 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01350() {
		return _vrTechnicalSpec_XCGPart3.getXCG01350();
	}

	/**
	* Returns the xcg01351 of this vr technical spec_xcg part3.
	*
	* @return the xcg01351 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01351() {
		return _vrTechnicalSpec_XCGPart3.getXCG01351();
	}

	/**
	* Returns the xcg01352 of this vr technical spec_xcg part3.
	*
	* @return the xcg01352 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01352() {
		return _vrTechnicalSpec_XCGPart3.getXCG01352();
	}

	/**
	* Returns the xcg01353 of this vr technical spec_xcg part3.
	*
	* @return the xcg01353 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01353() {
		return _vrTechnicalSpec_XCGPart3.getXCG01353();
	}

	/**
	* Returns the xcg01354 of this vr technical spec_xcg part3.
	*
	* @return the xcg01354 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01354() {
		return _vrTechnicalSpec_XCGPart3.getXCG01354();
	}

	/**
	* Returns the xcg01355 of this vr technical spec_xcg part3.
	*
	* @return the xcg01355 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01355() {
		return _vrTechnicalSpec_XCGPart3.getXCG01355();
	}

	/**
	* Returns the xcg01356 of this vr technical spec_xcg part3.
	*
	* @return the xcg01356 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01356() {
		return _vrTechnicalSpec_XCGPart3.getXCG01356();
	}

	/**
	* Returns the xcg01357 of this vr technical spec_xcg part3.
	*
	* @return the xcg01357 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01357() {
		return _vrTechnicalSpec_XCGPart3.getXCG01357();
	}

	/**
	* Returns the xcg01358 of this vr technical spec_xcg part3.
	*
	* @return the xcg01358 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01358() {
		return _vrTechnicalSpec_XCGPart3.getXCG01358();
	}

	/**
	* Returns the xcg01359 of this vr technical spec_xcg part3.
	*
	* @return the xcg01359 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01359() {
		return _vrTechnicalSpec_XCGPart3.getXCG01359();
	}

	/**
	* Returns the xcg01360 of this vr technical spec_xcg part3.
	*
	* @return the xcg01360 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01360() {
		return _vrTechnicalSpec_XCGPart3.getXCG01360();
	}

	/**
	* Returns the xcg01361 of this vr technical spec_xcg part3.
	*
	* @return the xcg01361 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01361() {
		return _vrTechnicalSpec_XCGPart3.getXCG01361();
	}

	/**
	* Returns the xcg01362 of this vr technical spec_xcg part3.
	*
	* @return the xcg01362 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01362() {
		return _vrTechnicalSpec_XCGPart3.getXCG01362();
	}

	/**
	* Returns the xcg01363 of this vr technical spec_xcg part3.
	*
	* @return the xcg01363 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01363() {
		return _vrTechnicalSpec_XCGPart3.getXCG01363();
	}

	/**
	* Returns the xcg01364 of this vr technical spec_xcg part3.
	*
	* @return the xcg01364 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01364() {
		return _vrTechnicalSpec_XCGPart3.getXCG01364();
	}

	/**
	* Returns the xcg01365 of this vr technical spec_xcg part3.
	*
	* @return the xcg01365 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01365() {
		return _vrTechnicalSpec_XCGPart3.getXCG01365();
	}

	/**
	* Returns the xcg01366 of this vr technical spec_xcg part3.
	*
	* @return the xcg01366 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01366() {
		return _vrTechnicalSpec_XCGPart3.getXCG01366();
	}

	/**
	* Returns the xcg01367 of this vr technical spec_xcg part3.
	*
	* @return the xcg01367 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01367() {
		return _vrTechnicalSpec_XCGPart3.getXCG01367();
	}

	/**
	* Returns the xcg01368 of this vr technical spec_xcg part3.
	*
	* @return the xcg01368 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01368() {
		return _vrTechnicalSpec_XCGPart3.getXCG01368();
	}

	/**
	* Returns the xcg01369 of this vr technical spec_xcg part3.
	*
	* @return the xcg01369 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01369() {
		return _vrTechnicalSpec_XCGPart3.getXCG01369();
	}

	/**
	* Returns the xcg01370 of this vr technical spec_xcg part3.
	*
	* @return the xcg01370 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01370() {
		return _vrTechnicalSpec_XCGPart3.getXCG01370();
	}

	/**
	* Returns the xcg01371 of this vr technical spec_xcg part3.
	*
	* @return the xcg01371 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01371() {
		return _vrTechnicalSpec_XCGPart3.getXCG01371();
	}

	/**
	* Returns the xcg01372 of this vr technical spec_xcg part3.
	*
	* @return the xcg01372 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01372() {
		return _vrTechnicalSpec_XCGPart3.getXCG01372();
	}

	/**
	* Returns the xcg01373 of this vr technical spec_xcg part3.
	*
	* @return the xcg01373 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01373() {
		return _vrTechnicalSpec_XCGPart3.getXCG01373();
	}

	/**
	* Returns the xcg01374 of this vr technical spec_xcg part3.
	*
	* @return the xcg01374 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01374() {
		return _vrTechnicalSpec_XCGPart3.getXCG01374();
	}

	/**
	* Returns the xcg01375 of this vr technical spec_xcg part3.
	*
	* @return the xcg01375 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01375() {
		return _vrTechnicalSpec_XCGPart3.getXCG01375();
	}

	/**
	* Returns the xcg01376 of this vr technical spec_xcg part3.
	*
	* @return the xcg01376 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01376() {
		return _vrTechnicalSpec_XCGPart3.getXCG01376();
	}

	/**
	* Returns the xcg01377 of this vr technical spec_xcg part3.
	*
	* @return the xcg01377 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01377() {
		return _vrTechnicalSpec_XCGPart3.getXCG01377();
	}

	/**
	* Returns the xcg01378 of this vr technical spec_xcg part3.
	*
	* @return the xcg01378 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01378() {
		return _vrTechnicalSpec_XCGPart3.getXCG01378();
	}

	/**
	* Returns the xcg01379 of this vr technical spec_xcg part3.
	*
	* @return the xcg01379 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01379() {
		return _vrTechnicalSpec_XCGPart3.getXCG01379();
	}

	/**
	* Returns the xcg01381 of this vr technical spec_xcg part3.
	*
	* @return the xcg01381 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01381() {
		return _vrTechnicalSpec_XCGPart3.getXCG01381();
	}

	/**
	* Returns the xcg01382 of this vr technical spec_xcg part3.
	*
	* @return the xcg01382 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01382() {
		return _vrTechnicalSpec_XCGPart3.getXCG01382();
	}

	/**
	* Returns the xcg01383 of this vr technical spec_xcg part3.
	*
	* @return the xcg01383 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01383() {
		return _vrTechnicalSpec_XCGPart3.getXCG01383();
	}

	/**
	* Returns the xcg01384 of this vr technical spec_xcg part3.
	*
	* @return the xcg01384 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01384() {
		return _vrTechnicalSpec_XCGPart3.getXCG01384();
	}

	/**
	* Returns the xcg01385 of this vr technical spec_xcg part3.
	*
	* @return the xcg01385 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01385() {
		return _vrTechnicalSpec_XCGPart3.getXCG01385();
	}

	/**
	* Returns the xcg01386 of this vr technical spec_xcg part3.
	*
	* @return the xcg01386 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01386() {
		return _vrTechnicalSpec_XCGPart3.getXCG01386();
	}

	/**
	* Returns the xcg01387 of this vr technical spec_xcg part3.
	*
	* @return the xcg01387 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01387() {
		return _vrTechnicalSpec_XCGPart3.getXCG01387();
	}

	/**
	* Returns the xcg01388 of this vr technical spec_xcg part3.
	*
	* @return the xcg01388 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01388() {
		return _vrTechnicalSpec_XCGPart3.getXCG01388();
	}

	/**
	* Returns the xcg01389 of this vr technical spec_xcg part3.
	*
	* @return the xcg01389 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01389() {
		return _vrTechnicalSpec_XCGPart3.getXCG01389();
	}

	/**
	* Returns the xcg01390 of this vr technical spec_xcg part3.
	*
	* @return the xcg01390 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01390() {
		return _vrTechnicalSpec_XCGPart3.getXCG01390();
	}

	/**
	* Returns the xcg01391 of this vr technical spec_xcg part3.
	*
	* @return the xcg01391 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01391() {
		return _vrTechnicalSpec_XCGPart3.getXCG01391();
	}

	/**
	* Returns the xcg01392 of this vr technical spec_xcg part3.
	*
	* @return the xcg01392 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01392() {
		return _vrTechnicalSpec_XCGPart3.getXCG01392();
	}

	/**
	* Returns the xcg01393 of this vr technical spec_xcg part3.
	*
	* @return the xcg01393 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01393() {
		return _vrTechnicalSpec_XCGPart3.getXCG01393();
	}

	/**
	* Returns the xcg01394 of this vr technical spec_xcg part3.
	*
	* @return the xcg01394 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01394() {
		return _vrTechnicalSpec_XCGPart3.getXCG01394();
	}

	/**
	* Returns the xcg01395 of this vr technical spec_xcg part3.
	*
	* @return the xcg01395 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01395() {
		return _vrTechnicalSpec_XCGPart3.getXCG01395();
	}

	/**
	* Returns the xcg01396 of this vr technical spec_xcg part3.
	*
	* @return the xcg01396 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01396() {
		return _vrTechnicalSpec_XCGPart3.getXCG01396();
	}

	/**
	* Returns the xcg01397 of this vr technical spec_xcg part3.
	*
	* @return the xcg01397 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01397() {
		return _vrTechnicalSpec_XCGPart3.getXCG01397();
	}

	/**
	* Returns the xcg01398 of this vr technical spec_xcg part3.
	*
	* @return the xcg01398 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01398() {
		return _vrTechnicalSpec_XCGPart3.getXCG01398();
	}

	/**
	* Returns the xcg01399 of this vr technical spec_xcg part3.
	*
	* @return the xcg01399 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01399() {
		return _vrTechnicalSpec_XCGPart3.getXCG01399();
	}

	/**
	* Returns the xcg01400 of this vr technical spec_xcg part3.
	*
	* @return the xcg01400 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01400() {
		return _vrTechnicalSpec_XCGPart3.getXCG01400();
	}

	/**
	* Returns the xcg01402 of this vr technical spec_xcg part3.
	*
	* @return the xcg01402 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01402() {
		return _vrTechnicalSpec_XCGPart3.getXCG01402();
	}

	/**
	* Returns the xcg01403 of this vr technical spec_xcg part3.
	*
	* @return the xcg01403 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01403() {
		return _vrTechnicalSpec_XCGPart3.getXCG01403();
	}

	/**
	* Returns the xcg01404 of this vr technical spec_xcg part3.
	*
	* @return the xcg01404 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01404() {
		return _vrTechnicalSpec_XCGPart3.getXCG01404();
	}

	/**
	* Returns the xcg01405 of this vr technical spec_xcg part3.
	*
	* @return the xcg01405 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01405() {
		return _vrTechnicalSpec_XCGPart3.getXCG01405();
	}

	/**
	* Returns the xcg01406 of this vr technical spec_xcg part3.
	*
	* @return the xcg01406 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01406() {
		return _vrTechnicalSpec_XCGPart3.getXCG01406();
	}

	/**
	* Returns the xcg01407 of this vr technical spec_xcg part3.
	*
	* @return the xcg01407 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01407() {
		return _vrTechnicalSpec_XCGPart3.getXCG01407();
	}

	/**
	* Returns the xcg01408 of this vr technical spec_xcg part3.
	*
	* @return the xcg01408 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01408() {
		return _vrTechnicalSpec_XCGPart3.getXCG01408();
	}

	/**
	* Returns the xcg01409 of this vr technical spec_xcg part3.
	*
	* @return the xcg01409 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01409() {
		return _vrTechnicalSpec_XCGPart3.getXCG01409();
	}

	/**
	* Returns the xcg01410 of this vr technical spec_xcg part3.
	*
	* @return the xcg01410 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01410() {
		return _vrTechnicalSpec_XCGPart3.getXCG01410();
	}

	/**
	* Returns the xcg01411 of this vr technical spec_xcg part3.
	*
	* @return the xcg01411 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01411() {
		return _vrTechnicalSpec_XCGPart3.getXCG01411();
	}

	/**
	* Returns the xcg01412 of this vr technical spec_xcg part3.
	*
	* @return the xcg01412 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01412() {
		return _vrTechnicalSpec_XCGPart3.getXCG01412();
	}

	/**
	* Returns the xcg01413 of this vr technical spec_xcg part3.
	*
	* @return the xcg01413 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01413() {
		return _vrTechnicalSpec_XCGPart3.getXCG01413();
	}

	/**
	* Returns the xcg01414 of this vr technical spec_xcg part3.
	*
	* @return the xcg01414 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01414() {
		return _vrTechnicalSpec_XCGPart3.getXCG01414();
	}

	/**
	* Returns the xcg01415 of this vr technical spec_xcg part3.
	*
	* @return the xcg01415 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01415() {
		return _vrTechnicalSpec_XCGPart3.getXCG01415();
	}

	/**
	* Returns the xcg01416 of this vr technical spec_xcg part3.
	*
	* @return the xcg01416 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01416() {
		return _vrTechnicalSpec_XCGPart3.getXCG01416();
	}

	/**
	* Returns the xcg01417 of this vr technical spec_xcg part3.
	*
	* @return the xcg01417 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01417() {
		return _vrTechnicalSpec_XCGPart3.getXCG01417();
	}

	/**
	* Returns the xcg01418 of this vr technical spec_xcg part3.
	*
	* @return the xcg01418 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01418() {
		return _vrTechnicalSpec_XCGPart3.getXCG01418();
	}

	/**
	* Returns the xcg01419 of this vr technical spec_xcg part3.
	*
	* @return the xcg01419 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01419() {
		return _vrTechnicalSpec_XCGPart3.getXCG01419();
	}

	/**
	* Returns the xcg01420 of this vr technical spec_xcg part3.
	*
	* @return the xcg01420 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01420() {
		return _vrTechnicalSpec_XCGPart3.getXCG01420();
	}

	/**
	* Returns the xcg01421 of this vr technical spec_xcg part3.
	*
	* @return the xcg01421 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01421() {
		return _vrTechnicalSpec_XCGPart3.getXCG01421();
	}

	/**
	* Returns the xcg01422 of this vr technical spec_xcg part3.
	*
	* @return the xcg01422 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01422() {
		return _vrTechnicalSpec_XCGPart3.getXCG01422();
	}

	/**
	* Returns the xcg01423 of this vr technical spec_xcg part3.
	*
	* @return the xcg01423 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01423() {
		return _vrTechnicalSpec_XCGPart3.getXCG01423();
	}

	/**
	* Returns the xcg01424 of this vr technical spec_xcg part3.
	*
	* @return the xcg01424 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01424() {
		return _vrTechnicalSpec_XCGPart3.getXCG01424();
	}

	/**
	* Returns the xcg01425 of this vr technical spec_xcg part3.
	*
	* @return the xcg01425 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01425() {
		return _vrTechnicalSpec_XCGPart3.getXCG01425();
	}

	/**
	* Returns the xcg01426 of this vr technical spec_xcg part3.
	*
	* @return the xcg01426 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01426() {
		return _vrTechnicalSpec_XCGPart3.getXCG01426();
	}

	/**
	* Returns the xcg01427 of this vr technical spec_xcg part3.
	*
	* @return the xcg01427 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01427() {
		return _vrTechnicalSpec_XCGPart3.getXCG01427();
	}

	/**
	* Returns the xcg01428 of this vr technical spec_xcg part3.
	*
	* @return the xcg01428 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01428() {
		return _vrTechnicalSpec_XCGPart3.getXCG01428();
	}

	/**
	* Returns the xcg01429 of this vr technical spec_xcg part3.
	*
	* @return the xcg01429 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01429() {
		return _vrTechnicalSpec_XCGPart3.getXCG01429();
	}

	/**
	* Returns the xcg01430 of this vr technical spec_xcg part3.
	*
	* @return the xcg01430 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01430() {
		return _vrTechnicalSpec_XCGPart3.getXCG01430();
	}

	/**
	* Returns the xcg01431 of this vr technical spec_xcg part3.
	*
	* @return the xcg01431 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01431() {
		return _vrTechnicalSpec_XCGPart3.getXCG01431();
	}

	/**
	* Returns the xcg01432 of this vr technical spec_xcg part3.
	*
	* @return the xcg01432 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01432() {
		return _vrTechnicalSpec_XCGPart3.getXCG01432();
	}

	/**
	* Returns the xcg01433 of this vr technical spec_xcg part3.
	*
	* @return the xcg01433 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01433() {
		return _vrTechnicalSpec_XCGPart3.getXCG01433();
	}

	/**
	* Returns the xcg01434 of this vr technical spec_xcg part3.
	*
	* @return the xcg01434 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01434() {
		return _vrTechnicalSpec_XCGPart3.getXCG01434();
	}

	/**
	* Returns the xcg01435 of this vr technical spec_xcg part3.
	*
	* @return the xcg01435 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01435() {
		return _vrTechnicalSpec_XCGPart3.getXCG01435();
	}

	/**
	* Returns the xcg01436 of this vr technical spec_xcg part3.
	*
	* @return the xcg01436 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01436() {
		return _vrTechnicalSpec_XCGPart3.getXCG01436();
	}

	/**
	* Returns the xcg01437 of this vr technical spec_xcg part3.
	*
	* @return the xcg01437 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01437() {
		return _vrTechnicalSpec_XCGPart3.getXCG01437();
	}

	/**
	* Returns the xcg01439 of this vr technical spec_xcg part3.
	*
	* @return the xcg01439 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01439() {
		return _vrTechnicalSpec_XCGPart3.getXCG01439();
	}

	/**
	* Returns the xcg01440 of this vr technical spec_xcg part3.
	*
	* @return the xcg01440 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01440() {
		return _vrTechnicalSpec_XCGPart3.getXCG01440();
	}

	/**
	* Returns the xcg01441 of this vr technical spec_xcg part3.
	*
	* @return the xcg01441 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01441() {
		return _vrTechnicalSpec_XCGPart3.getXCG01441();
	}

	/**
	* Returns the xcg01442 of this vr technical spec_xcg part3.
	*
	* @return the xcg01442 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01442() {
		return _vrTechnicalSpec_XCGPart3.getXCG01442();
	}

	/**
	* Returns the xcg01443 of this vr technical spec_xcg part3.
	*
	* @return the xcg01443 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01443() {
		return _vrTechnicalSpec_XCGPart3.getXCG01443();
	}

	/**
	* Returns the xcg01445 of this vr technical spec_xcg part3.
	*
	* @return the xcg01445 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01445() {
		return _vrTechnicalSpec_XCGPart3.getXCG01445();
	}

	/**
	* Returns the xcg01446 of this vr technical spec_xcg part3.
	*
	* @return the xcg01446 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01446() {
		return _vrTechnicalSpec_XCGPart3.getXCG01446();
	}

	/**
	* Returns the xcg01447 of this vr technical spec_xcg part3.
	*
	* @return the xcg01447 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01447() {
		return _vrTechnicalSpec_XCGPart3.getXCG01447();
	}

	/**
	* Returns the xcg01448 of this vr technical spec_xcg part3.
	*
	* @return the xcg01448 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01448() {
		return _vrTechnicalSpec_XCGPart3.getXCG01448();
	}

	/**
	* Returns the xcg01449 of this vr technical spec_xcg part3.
	*
	* @return the xcg01449 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01449() {
		return _vrTechnicalSpec_XCGPart3.getXCG01449();
	}

	/**
	* Returns the xcg01450 of this vr technical spec_xcg part3.
	*
	* @return the xcg01450 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01450() {
		return _vrTechnicalSpec_XCGPart3.getXCG01450();
	}

	/**
	* Returns the xcg01451 of this vr technical spec_xcg part3.
	*
	* @return the xcg01451 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01451() {
		return _vrTechnicalSpec_XCGPart3.getXCG01451();
	}

	/**
	* Returns the xcg01452 of this vr technical spec_xcg part3.
	*
	* @return the xcg01452 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01452() {
		return _vrTechnicalSpec_XCGPart3.getXCG01452();
	}

	/**
	* Returns the xcg01453 of this vr technical spec_xcg part3.
	*
	* @return the xcg01453 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01453() {
		return _vrTechnicalSpec_XCGPart3.getXCG01453();
	}

	/**
	* Returns the xcg01454 of this vr technical spec_xcg part3.
	*
	* @return the xcg01454 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01454() {
		return _vrTechnicalSpec_XCGPart3.getXCG01454();
	}

	/**
	* Returns the xcg01455 of this vr technical spec_xcg part3.
	*
	* @return the xcg01455 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01455() {
		return _vrTechnicalSpec_XCGPart3.getXCG01455();
	}

	/**
	* Returns the xcg01456 of this vr technical spec_xcg part3.
	*
	* @return the xcg01456 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01456() {
		return _vrTechnicalSpec_XCGPart3.getXCG01456();
	}

	/**
	* Returns the xcg01457 of this vr technical spec_xcg part3.
	*
	* @return the xcg01457 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01457() {
		return _vrTechnicalSpec_XCGPart3.getXCG01457();
	}

	/**
	* Returns the xcg01458 of this vr technical spec_xcg part3.
	*
	* @return the xcg01458 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01458() {
		return _vrTechnicalSpec_XCGPart3.getXCG01458();
	}

	/**
	* Returns the xcg01459 of this vr technical spec_xcg part3.
	*
	* @return the xcg01459 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01459() {
		return _vrTechnicalSpec_XCGPart3.getXCG01459();
	}

	/**
	* Returns the xcg01460 of this vr technical spec_xcg part3.
	*
	* @return the xcg01460 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01460() {
		return _vrTechnicalSpec_XCGPart3.getXCG01460();
	}

	/**
	* Returns the xcg01461 of this vr technical spec_xcg part3.
	*
	* @return the xcg01461 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01461() {
		return _vrTechnicalSpec_XCGPart3.getXCG01461();
	}

	/**
	* Returns the xcg01462 of this vr technical spec_xcg part3.
	*
	* @return the xcg01462 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01462() {
		return _vrTechnicalSpec_XCGPart3.getXCG01462();
	}

	/**
	* Returns the xcg01463 of this vr technical spec_xcg part3.
	*
	* @return the xcg01463 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01463() {
		return _vrTechnicalSpec_XCGPart3.getXCG01463();
	}

	/**
	* Returns the xcg01464 of this vr technical spec_xcg part3.
	*
	* @return the xcg01464 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01464() {
		return _vrTechnicalSpec_XCGPart3.getXCG01464();
	}

	/**
	* Returns the xcg01465 of this vr technical spec_xcg part3.
	*
	* @return the xcg01465 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01465() {
		return _vrTechnicalSpec_XCGPart3.getXCG01465();
	}

	/**
	* Returns the xcg01466 of this vr technical spec_xcg part3.
	*
	* @return the xcg01466 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01466() {
		return _vrTechnicalSpec_XCGPart3.getXCG01466();
	}

	/**
	* Returns the xcg01467 of this vr technical spec_xcg part3.
	*
	* @return the xcg01467 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01467() {
		return _vrTechnicalSpec_XCGPart3.getXCG01467();
	}

	/**
	* Returns the xcg01468 of this vr technical spec_xcg part3.
	*
	* @return the xcg01468 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01468() {
		return _vrTechnicalSpec_XCGPart3.getXCG01468();
	}

	/**
	* Returns the xcg01469 of this vr technical spec_xcg part3.
	*
	* @return the xcg01469 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01469() {
		return _vrTechnicalSpec_XCGPart3.getXCG01469();
	}

	/**
	* Returns the xcg01470 of this vr technical spec_xcg part3.
	*
	* @return the xcg01470 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01470() {
		return _vrTechnicalSpec_XCGPart3.getXCG01470();
	}

	/**
	* Returns the xcg01471 of this vr technical spec_xcg part3.
	*
	* @return the xcg01471 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01471() {
		return _vrTechnicalSpec_XCGPart3.getXCG01471();
	}

	/**
	* Returns the xcg01472 of this vr technical spec_xcg part3.
	*
	* @return the xcg01472 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01472() {
		return _vrTechnicalSpec_XCGPart3.getXCG01472();
	}

	/**
	* Returns the xcg01473 of this vr technical spec_xcg part3.
	*
	* @return the xcg01473 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01473() {
		return _vrTechnicalSpec_XCGPart3.getXCG01473();
	}

	/**
	* Returns the xcg01474 of this vr technical spec_xcg part3.
	*
	* @return the xcg01474 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01474() {
		return _vrTechnicalSpec_XCGPart3.getXCG01474();
	}

	/**
	* Returns the xcg01475 of this vr technical spec_xcg part3.
	*
	* @return the xcg01475 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01475() {
		return _vrTechnicalSpec_XCGPart3.getXCG01475();
	}

	/**
	* Returns the xcg01476 of this vr technical spec_xcg part3.
	*
	* @return the xcg01476 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01476() {
		return _vrTechnicalSpec_XCGPart3.getXCG01476();
	}

	/**
	* Returns the xcg01477 of this vr technical spec_xcg part3.
	*
	* @return the xcg01477 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01477() {
		return _vrTechnicalSpec_XCGPart3.getXCG01477();
	}

	/**
	* Returns the xcg01478 of this vr technical spec_xcg part3.
	*
	* @return the xcg01478 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01478() {
		return _vrTechnicalSpec_XCGPart3.getXCG01478();
	}

	/**
	* Returns the xcg01479 of this vr technical spec_xcg part3.
	*
	* @return the xcg01479 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01479() {
		return _vrTechnicalSpec_XCGPart3.getXCG01479();
	}

	/**
	* Returns the xcg01480 of this vr technical spec_xcg part3.
	*
	* @return the xcg01480 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01480() {
		return _vrTechnicalSpec_XCGPart3.getXCG01480();
	}

	/**
	* Returns the xcg01481 of this vr technical spec_xcg part3.
	*
	* @return the xcg01481 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01481() {
		return _vrTechnicalSpec_XCGPart3.getXCG01481();
	}

	/**
	* Returns the xcg01482 of this vr technical spec_xcg part3.
	*
	* @return the xcg01482 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01482() {
		return _vrTechnicalSpec_XCGPart3.getXCG01482();
	}

	/**
	* Returns the xcg01483 of this vr technical spec_xcg part3.
	*
	* @return the xcg01483 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01483() {
		return _vrTechnicalSpec_XCGPart3.getXCG01483();
	}

	/**
	* Returns the xcg01484 of this vr technical spec_xcg part3.
	*
	* @return the xcg01484 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01484() {
		return _vrTechnicalSpec_XCGPart3.getXCG01484();
	}

	/**
	* Returns the xcg01485 of this vr technical spec_xcg part3.
	*
	* @return the xcg01485 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01485() {
		return _vrTechnicalSpec_XCGPart3.getXCG01485();
	}

	/**
	* Returns the xcg01486 of this vr technical spec_xcg part3.
	*
	* @return the xcg01486 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01486() {
		return _vrTechnicalSpec_XCGPart3.getXCG01486();
	}

	/**
	* Returns the xcg01487 of this vr technical spec_xcg part3.
	*
	* @return the xcg01487 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01487() {
		return _vrTechnicalSpec_XCGPart3.getXCG01487();
	}

	/**
	* Returns the xcg01488 of this vr technical spec_xcg part3.
	*
	* @return the xcg01488 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01488() {
		return _vrTechnicalSpec_XCGPart3.getXCG01488();
	}

	/**
	* Returns the xcg01489 of this vr technical spec_xcg part3.
	*
	* @return the xcg01489 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01489() {
		return _vrTechnicalSpec_XCGPart3.getXCG01489();
	}

	/**
	* Returns the xcg01490 of this vr technical spec_xcg part3.
	*
	* @return the xcg01490 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01490() {
		return _vrTechnicalSpec_XCGPart3.getXCG01490();
	}

	/**
	* Returns the xcg01491 of this vr technical spec_xcg part3.
	*
	* @return the xcg01491 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01491() {
		return _vrTechnicalSpec_XCGPart3.getXCG01491();
	}

	/**
	* Returns the xcg01492 of this vr technical spec_xcg part3.
	*
	* @return the xcg01492 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01492() {
		return _vrTechnicalSpec_XCGPart3.getXCG01492();
	}

	/**
	* Returns the xcg01493 of this vr technical spec_xcg part3.
	*
	* @return the xcg01493 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01493() {
		return _vrTechnicalSpec_XCGPart3.getXCG01493();
	}

	/**
	* Returns the xcg01494 of this vr technical spec_xcg part3.
	*
	* @return the xcg01494 of this vr technical spec_xcg part3
	*/
	@Override
	public java.lang.String getXCG01494() {
		return _vrTechnicalSpec_XCGPart3.getXCG01494();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XCGPart3.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XCGPart3.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xcg part3.
	*
	* @return the modify date of this vr technical spec_xcg part3
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XCGPart3.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xcg part3.
	*
	* @return the sync date of this vr technical spec_xcg part3
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XCGPart3.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xcg part3.
	*
	* @return the convert assemble ID of this vr technical spec_xcg part3
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XCGPart3.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xcg part3.
	*
	* @return the dossier ID of this vr technical spec_xcg part3
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XCGPart3.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xcg part3.
	*
	* @return the ID of this vr technical spec_xcg part3
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XCGPart3.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xcg part3.
	*
	* @return the mt core of this vr technical spec_xcg part3
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XCGPart3.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xcg part3.
	*
	* @return the primary key of this vr technical spec_xcg part3
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XCGPart3.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xcg part3.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xcg part3
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XCGPart3.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XCGPart3.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XCGPart3.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xcg part3.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xcg part3
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XCGPart3.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xcg part3.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xcg part3
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XCGPart3.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xcg part3.
	*
	* @param dossierId the dossier ID of this vr technical spec_xcg part3
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XCGPart3.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xcg part3.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xcg part3
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XCGPart3.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xcg part3.
	*
	* @param dossierNo the dossier no of this vr technical spec_xcg part3
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XCGPart3.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XCGPart3.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XCGPart3.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XCGPart3.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xcg part3.
	*
	* @param id the ID of this vr technical spec_xcg part3
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XCGPart3.setId(id);
	}

	/**
	* Sets the modify date of this vr technical spec_xcg part3.
	*
	* @param modifyDate the modify date of this vr technical spec_xcg part3
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XCGPart3.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xcg part3.
	*
	* @param mtCore the mt core of this vr technical spec_xcg part3
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XCGPart3.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XCGPart3.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xcg part3.
	*
	* @param primaryKey the primary key of this vr technical spec_xcg part3
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XCGPart3.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XCGPart3.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xcg part3.
	*
	* @param referenceUid the reference uid of this vr technical spec_xcg part3
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XCGPart3.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xcg part3.
	*
	* @param syncDate the sync date of this vr technical spec_xcg part3
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XCGPart3.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xcg part3.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xcg part3
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XCGPart3.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xcg01310 of this vr technical spec_xcg part3.
	*
	* @param XCG01310 the xcg01310 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01310(java.lang.String XCG01310) {
		_vrTechnicalSpec_XCGPart3.setXCG01310(XCG01310);
	}

	/**
	* Sets the xcg01311 of this vr technical spec_xcg part3.
	*
	* @param XCG01311 the xcg01311 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01311(java.lang.String XCG01311) {
		_vrTechnicalSpec_XCGPart3.setXCG01311(XCG01311);
	}

	/**
	* Sets the xcg01312 of this vr technical spec_xcg part3.
	*
	* @param XCG01312 the xcg01312 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01312(java.lang.String XCG01312) {
		_vrTechnicalSpec_XCGPart3.setXCG01312(XCG01312);
	}

	/**
	* Sets the xcg01313 of this vr technical spec_xcg part3.
	*
	* @param XCG01313 the xcg01313 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01313(java.lang.String XCG01313) {
		_vrTechnicalSpec_XCGPart3.setXCG01313(XCG01313);
	}

	/**
	* Sets the xcg01314 of this vr technical spec_xcg part3.
	*
	* @param XCG01314 the xcg01314 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01314(java.lang.String XCG01314) {
		_vrTechnicalSpec_XCGPart3.setXCG01314(XCG01314);
	}

	/**
	* Sets the xcg01315 of this vr technical spec_xcg part3.
	*
	* @param XCG01315 the xcg01315 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01315(java.lang.String XCG01315) {
		_vrTechnicalSpec_XCGPart3.setXCG01315(XCG01315);
	}

	/**
	* Sets the xcg01316 of this vr technical spec_xcg part3.
	*
	* @param XCG01316 the xcg01316 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01316(java.lang.String XCG01316) {
		_vrTechnicalSpec_XCGPart3.setXCG01316(XCG01316);
	}

	/**
	* Sets the xcg01317 of this vr technical spec_xcg part3.
	*
	* @param XCG01317 the xcg01317 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01317(java.lang.String XCG01317) {
		_vrTechnicalSpec_XCGPart3.setXCG01317(XCG01317);
	}

	/**
	* Sets the xcg01318 of this vr technical spec_xcg part3.
	*
	* @param XCG01318 the xcg01318 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01318(java.lang.String XCG01318) {
		_vrTechnicalSpec_XCGPart3.setXCG01318(XCG01318);
	}

	/**
	* Sets the xcg01319 of this vr technical spec_xcg part3.
	*
	* @param XCG01319 the xcg01319 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01319(java.lang.String XCG01319) {
		_vrTechnicalSpec_XCGPart3.setXCG01319(XCG01319);
	}

	/**
	* Sets the xcg01320 of this vr technical spec_xcg part3.
	*
	* @param XCG01320 the xcg01320 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01320(java.lang.String XCG01320) {
		_vrTechnicalSpec_XCGPart3.setXCG01320(XCG01320);
	}

	/**
	* Sets the xcg01321 of this vr technical spec_xcg part3.
	*
	* @param XCG01321 the xcg01321 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01321(java.lang.String XCG01321) {
		_vrTechnicalSpec_XCGPart3.setXCG01321(XCG01321);
	}

	/**
	* Sets the xcg01322 of this vr technical spec_xcg part3.
	*
	* @param XCG01322 the xcg01322 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01322(java.lang.String XCG01322) {
		_vrTechnicalSpec_XCGPart3.setXCG01322(XCG01322);
	}

	/**
	* Sets the xcg01323 of this vr technical spec_xcg part3.
	*
	* @param XCG01323 the xcg01323 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01323(java.lang.String XCG01323) {
		_vrTechnicalSpec_XCGPart3.setXCG01323(XCG01323);
	}

	/**
	* Sets the xcg01324 of this vr technical spec_xcg part3.
	*
	* @param XCG01324 the xcg01324 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01324(java.lang.String XCG01324) {
		_vrTechnicalSpec_XCGPart3.setXCG01324(XCG01324);
	}

	/**
	* Sets the xcg01325 of this vr technical spec_xcg part3.
	*
	* @param XCG01325 the xcg01325 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01325(java.lang.String XCG01325) {
		_vrTechnicalSpec_XCGPart3.setXCG01325(XCG01325);
	}

	/**
	* Sets the xcg01326 of this vr technical spec_xcg part3.
	*
	* @param XCG01326 the xcg01326 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01326(java.lang.String XCG01326) {
		_vrTechnicalSpec_XCGPart3.setXCG01326(XCG01326);
	}

	/**
	* Sets the xcg01327 of this vr technical spec_xcg part3.
	*
	* @param XCG01327 the xcg01327 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01327(java.lang.String XCG01327) {
		_vrTechnicalSpec_XCGPart3.setXCG01327(XCG01327);
	}

	/**
	* Sets the xcg01328 of this vr technical spec_xcg part3.
	*
	* @param XCG01328 the xcg01328 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01328(java.lang.String XCG01328) {
		_vrTechnicalSpec_XCGPart3.setXCG01328(XCG01328);
	}

	/**
	* Sets the xcg01330 of this vr technical spec_xcg part3.
	*
	* @param XCG01330 the xcg01330 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01330(java.lang.String XCG01330) {
		_vrTechnicalSpec_XCGPart3.setXCG01330(XCG01330);
	}

	/**
	* Sets the xcg01331 of this vr technical spec_xcg part3.
	*
	* @param XCG01331 the xcg01331 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01331(java.lang.String XCG01331) {
		_vrTechnicalSpec_XCGPart3.setXCG01331(XCG01331);
	}

	/**
	* Sets the xcg01332 of this vr technical spec_xcg part3.
	*
	* @param XCG01332 the xcg01332 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01332(java.lang.String XCG01332) {
		_vrTechnicalSpec_XCGPart3.setXCG01332(XCG01332);
	}

	/**
	* Sets the xcg01333 of this vr technical spec_xcg part3.
	*
	* @param XCG01333 the xcg01333 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01333(java.lang.String XCG01333) {
		_vrTechnicalSpec_XCGPart3.setXCG01333(XCG01333);
	}

	/**
	* Sets the xcg01334 of this vr technical spec_xcg part3.
	*
	* @param XCG01334 the xcg01334 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01334(java.lang.String XCG01334) {
		_vrTechnicalSpec_XCGPart3.setXCG01334(XCG01334);
	}

	/**
	* Sets the xcg01335 of this vr technical spec_xcg part3.
	*
	* @param XCG01335 the xcg01335 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01335(java.lang.String XCG01335) {
		_vrTechnicalSpec_XCGPart3.setXCG01335(XCG01335);
	}

	/**
	* Sets the xcg01336 of this vr technical spec_xcg part3.
	*
	* @param XCG01336 the xcg01336 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01336(java.lang.String XCG01336) {
		_vrTechnicalSpec_XCGPart3.setXCG01336(XCG01336);
	}

	/**
	* Sets the xcg01337 of this vr technical spec_xcg part3.
	*
	* @param XCG01337 the xcg01337 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01337(java.lang.String XCG01337) {
		_vrTechnicalSpec_XCGPart3.setXCG01337(XCG01337);
	}

	/**
	* Sets the xcg01338 of this vr technical spec_xcg part3.
	*
	* @param XCG01338 the xcg01338 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01338(java.lang.String XCG01338) {
		_vrTechnicalSpec_XCGPart3.setXCG01338(XCG01338);
	}

	/**
	* Sets the xcg01339 of this vr technical spec_xcg part3.
	*
	* @param XCG01339 the xcg01339 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01339(java.lang.String XCG01339) {
		_vrTechnicalSpec_XCGPart3.setXCG01339(XCG01339);
	}

	/**
	* Sets the xcg01340 of this vr technical spec_xcg part3.
	*
	* @param XCG01340 the xcg01340 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01340(java.lang.String XCG01340) {
		_vrTechnicalSpec_XCGPart3.setXCG01340(XCG01340);
	}

	/**
	* Sets the xcg01341 of this vr technical spec_xcg part3.
	*
	* @param XCG01341 the xcg01341 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01341(java.lang.String XCG01341) {
		_vrTechnicalSpec_XCGPart3.setXCG01341(XCG01341);
	}

	/**
	* Sets the xcg01342 of this vr technical spec_xcg part3.
	*
	* @param XCG01342 the xcg01342 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01342(java.lang.String XCG01342) {
		_vrTechnicalSpec_XCGPart3.setXCG01342(XCG01342);
	}

	/**
	* Sets the xcg01343 of this vr technical spec_xcg part3.
	*
	* @param XCG01343 the xcg01343 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01343(java.lang.String XCG01343) {
		_vrTechnicalSpec_XCGPart3.setXCG01343(XCG01343);
	}

	/**
	* Sets the xcg01344 of this vr technical spec_xcg part3.
	*
	* @param XCG01344 the xcg01344 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01344(java.lang.String XCG01344) {
		_vrTechnicalSpec_XCGPart3.setXCG01344(XCG01344);
	}

	/**
	* Sets the xcg01345 of this vr technical spec_xcg part3.
	*
	* @param XCG01345 the xcg01345 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01345(java.lang.String XCG01345) {
		_vrTechnicalSpec_XCGPart3.setXCG01345(XCG01345);
	}

	/**
	* Sets the xcg01346 of this vr technical spec_xcg part3.
	*
	* @param XCG01346 the xcg01346 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01346(java.lang.String XCG01346) {
		_vrTechnicalSpec_XCGPart3.setXCG01346(XCG01346);
	}

	/**
	* Sets the xcg01347 of this vr technical spec_xcg part3.
	*
	* @param XCG01347 the xcg01347 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01347(java.lang.String XCG01347) {
		_vrTechnicalSpec_XCGPart3.setXCG01347(XCG01347);
	}

	/**
	* Sets the xcg01348 of this vr technical spec_xcg part3.
	*
	* @param XCG01348 the xcg01348 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01348(java.lang.String XCG01348) {
		_vrTechnicalSpec_XCGPart3.setXCG01348(XCG01348);
	}

	/**
	* Sets the xcg01349 of this vr technical spec_xcg part3.
	*
	* @param XCG01349 the xcg01349 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01349(java.lang.String XCG01349) {
		_vrTechnicalSpec_XCGPart3.setXCG01349(XCG01349);
	}

	/**
	* Sets the xcg01350 of this vr technical spec_xcg part3.
	*
	* @param XCG01350 the xcg01350 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01350(java.lang.String XCG01350) {
		_vrTechnicalSpec_XCGPart3.setXCG01350(XCG01350);
	}

	/**
	* Sets the xcg01351 of this vr technical spec_xcg part3.
	*
	* @param XCG01351 the xcg01351 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01351(java.lang.String XCG01351) {
		_vrTechnicalSpec_XCGPart3.setXCG01351(XCG01351);
	}

	/**
	* Sets the xcg01352 of this vr technical spec_xcg part3.
	*
	* @param XCG01352 the xcg01352 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01352(java.lang.String XCG01352) {
		_vrTechnicalSpec_XCGPart3.setXCG01352(XCG01352);
	}

	/**
	* Sets the xcg01353 of this vr technical spec_xcg part3.
	*
	* @param XCG01353 the xcg01353 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01353(java.lang.String XCG01353) {
		_vrTechnicalSpec_XCGPart3.setXCG01353(XCG01353);
	}

	/**
	* Sets the xcg01354 of this vr technical spec_xcg part3.
	*
	* @param XCG01354 the xcg01354 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01354(java.lang.String XCG01354) {
		_vrTechnicalSpec_XCGPart3.setXCG01354(XCG01354);
	}

	/**
	* Sets the xcg01355 of this vr technical spec_xcg part3.
	*
	* @param XCG01355 the xcg01355 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01355(java.lang.String XCG01355) {
		_vrTechnicalSpec_XCGPart3.setXCG01355(XCG01355);
	}

	/**
	* Sets the xcg01356 of this vr technical spec_xcg part3.
	*
	* @param XCG01356 the xcg01356 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01356(java.lang.String XCG01356) {
		_vrTechnicalSpec_XCGPart3.setXCG01356(XCG01356);
	}

	/**
	* Sets the xcg01357 of this vr technical spec_xcg part3.
	*
	* @param XCG01357 the xcg01357 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01357(java.lang.String XCG01357) {
		_vrTechnicalSpec_XCGPart3.setXCG01357(XCG01357);
	}

	/**
	* Sets the xcg01358 of this vr technical spec_xcg part3.
	*
	* @param XCG01358 the xcg01358 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01358(java.lang.String XCG01358) {
		_vrTechnicalSpec_XCGPart3.setXCG01358(XCG01358);
	}

	/**
	* Sets the xcg01359 of this vr technical spec_xcg part3.
	*
	* @param XCG01359 the xcg01359 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01359(java.lang.String XCG01359) {
		_vrTechnicalSpec_XCGPart3.setXCG01359(XCG01359);
	}

	/**
	* Sets the xcg01360 of this vr technical spec_xcg part3.
	*
	* @param XCG01360 the xcg01360 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01360(java.lang.String XCG01360) {
		_vrTechnicalSpec_XCGPart3.setXCG01360(XCG01360);
	}

	/**
	* Sets the xcg01361 of this vr technical spec_xcg part3.
	*
	* @param XCG01361 the xcg01361 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01361(java.lang.String XCG01361) {
		_vrTechnicalSpec_XCGPart3.setXCG01361(XCG01361);
	}

	/**
	* Sets the xcg01362 of this vr technical spec_xcg part3.
	*
	* @param XCG01362 the xcg01362 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01362(java.lang.String XCG01362) {
		_vrTechnicalSpec_XCGPart3.setXCG01362(XCG01362);
	}

	/**
	* Sets the xcg01363 of this vr technical spec_xcg part3.
	*
	* @param XCG01363 the xcg01363 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01363(java.lang.String XCG01363) {
		_vrTechnicalSpec_XCGPart3.setXCG01363(XCG01363);
	}

	/**
	* Sets the xcg01364 of this vr technical spec_xcg part3.
	*
	* @param XCG01364 the xcg01364 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01364(java.lang.String XCG01364) {
		_vrTechnicalSpec_XCGPart3.setXCG01364(XCG01364);
	}

	/**
	* Sets the xcg01365 of this vr technical spec_xcg part3.
	*
	* @param XCG01365 the xcg01365 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01365(java.lang.String XCG01365) {
		_vrTechnicalSpec_XCGPart3.setXCG01365(XCG01365);
	}

	/**
	* Sets the xcg01366 of this vr technical spec_xcg part3.
	*
	* @param XCG01366 the xcg01366 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01366(java.lang.String XCG01366) {
		_vrTechnicalSpec_XCGPart3.setXCG01366(XCG01366);
	}

	/**
	* Sets the xcg01367 of this vr technical spec_xcg part3.
	*
	* @param XCG01367 the xcg01367 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01367(java.lang.String XCG01367) {
		_vrTechnicalSpec_XCGPart3.setXCG01367(XCG01367);
	}

	/**
	* Sets the xcg01368 of this vr technical spec_xcg part3.
	*
	* @param XCG01368 the xcg01368 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01368(java.lang.String XCG01368) {
		_vrTechnicalSpec_XCGPart3.setXCG01368(XCG01368);
	}

	/**
	* Sets the xcg01369 of this vr technical spec_xcg part3.
	*
	* @param XCG01369 the xcg01369 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01369(java.lang.String XCG01369) {
		_vrTechnicalSpec_XCGPart3.setXCG01369(XCG01369);
	}

	/**
	* Sets the xcg01370 of this vr technical spec_xcg part3.
	*
	* @param XCG01370 the xcg01370 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01370(java.lang.String XCG01370) {
		_vrTechnicalSpec_XCGPart3.setXCG01370(XCG01370);
	}

	/**
	* Sets the xcg01371 of this vr technical spec_xcg part3.
	*
	* @param XCG01371 the xcg01371 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01371(java.lang.String XCG01371) {
		_vrTechnicalSpec_XCGPart3.setXCG01371(XCG01371);
	}

	/**
	* Sets the xcg01372 of this vr technical spec_xcg part3.
	*
	* @param XCG01372 the xcg01372 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01372(java.lang.String XCG01372) {
		_vrTechnicalSpec_XCGPart3.setXCG01372(XCG01372);
	}

	/**
	* Sets the xcg01373 of this vr technical spec_xcg part3.
	*
	* @param XCG01373 the xcg01373 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01373(java.lang.String XCG01373) {
		_vrTechnicalSpec_XCGPart3.setXCG01373(XCG01373);
	}

	/**
	* Sets the xcg01374 of this vr technical spec_xcg part3.
	*
	* @param XCG01374 the xcg01374 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01374(java.lang.String XCG01374) {
		_vrTechnicalSpec_XCGPart3.setXCG01374(XCG01374);
	}

	/**
	* Sets the xcg01375 of this vr technical spec_xcg part3.
	*
	* @param XCG01375 the xcg01375 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01375(java.lang.String XCG01375) {
		_vrTechnicalSpec_XCGPart3.setXCG01375(XCG01375);
	}

	/**
	* Sets the xcg01376 of this vr technical spec_xcg part3.
	*
	* @param XCG01376 the xcg01376 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01376(java.lang.String XCG01376) {
		_vrTechnicalSpec_XCGPart3.setXCG01376(XCG01376);
	}

	/**
	* Sets the xcg01377 of this vr technical spec_xcg part3.
	*
	* @param XCG01377 the xcg01377 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01377(java.lang.String XCG01377) {
		_vrTechnicalSpec_XCGPart3.setXCG01377(XCG01377);
	}

	/**
	* Sets the xcg01378 of this vr technical spec_xcg part3.
	*
	* @param XCG01378 the xcg01378 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01378(java.lang.String XCG01378) {
		_vrTechnicalSpec_XCGPart3.setXCG01378(XCG01378);
	}

	/**
	* Sets the xcg01379 of this vr technical spec_xcg part3.
	*
	* @param XCG01379 the xcg01379 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01379(java.lang.String XCG01379) {
		_vrTechnicalSpec_XCGPart3.setXCG01379(XCG01379);
	}

	/**
	* Sets the xcg01381 of this vr technical spec_xcg part3.
	*
	* @param XCG01381 the xcg01381 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01381(java.lang.String XCG01381) {
		_vrTechnicalSpec_XCGPart3.setXCG01381(XCG01381);
	}

	/**
	* Sets the xcg01382 of this vr technical spec_xcg part3.
	*
	* @param XCG01382 the xcg01382 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01382(java.lang.String XCG01382) {
		_vrTechnicalSpec_XCGPart3.setXCG01382(XCG01382);
	}

	/**
	* Sets the xcg01383 of this vr technical spec_xcg part3.
	*
	* @param XCG01383 the xcg01383 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01383(java.lang.String XCG01383) {
		_vrTechnicalSpec_XCGPart3.setXCG01383(XCG01383);
	}

	/**
	* Sets the xcg01384 of this vr technical spec_xcg part3.
	*
	* @param XCG01384 the xcg01384 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01384(java.lang.String XCG01384) {
		_vrTechnicalSpec_XCGPart3.setXCG01384(XCG01384);
	}

	/**
	* Sets the xcg01385 of this vr technical spec_xcg part3.
	*
	* @param XCG01385 the xcg01385 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01385(java.lang.String XCG01385) {
		_vrTechnicalSpec_XCGPart3.setXCG01385(XCG01385);
	}

	/**
	* Sets the xcg01386 of this vr technical spec_xcg part3.
	*
	* @param XCG01386 the xcg01386 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01386(java.lang.String XCG01386) {
		_vrTechnicalSpec_XCGPart3.setXCG01386(XCG01386);
	}

	/**
	* Sets the xcg01387 of this vr technical spec_xcg part3.
	*
	* @param XCG01387 the xcg01387 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01387(java.lang.String XCG01387) {
		_vrTechnicalSpec_XCGPart3.setXCG01387(XCG01387);
	}

	/**
	* Sets the xcg01388 of this vr technical spec_xcg part3.
	*
	* @param XCG01388 the xcg01388 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01388(java.lang.String XCG01388) {
		_vrTechnicalSpec_XCGPart3.setXCG01388(XCG01388);
	}

	/**
	* Sets the xcg01389 of this vr technical spec_xcg part3.
	*
	* @param XCG01389 the xcg01389 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01389(java.lang.String XCG01389) {
		_vrTechnicalSpec_XCGPart3.setXCG01389(XCG01389);
	}

	/**
	* Sets the xcg01390 of this vr technical spec_xcg part3.
	*
	* @param XCG01390 the xcg01390 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01390(java.lang.String XCG01390) {
		_vrTechnicalSpec_XCGPart3.setXCG01390(XCG01390);
	}

	/**
	* Sets the xcg01391 of this vr technical spec_xcg part3.
	*
	* @param XCG01391 the xcg01391 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01391(java.lang.String XCG01391) {
		_vrTechnicalSpec_XCGPart3.setXCG01391(XCG01391);
	}

	/**
	* Sets the xcg01392 of this vr technical spec_xcg part3.
	*
	* @param XCG01392 the xcg01392 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01392(java.lang.String XCG01392) {
		_vrTechnicalSpec_XCGPart3.setXCG01392(XCG01392);
	}

	/**
	* Sets the xcg01393 of this vr technical spec_xcg part3.
	*
	* @param XCG01393 the xcg01393 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01393(java.lang.String XCG01393) {
		_vrTechnicalSpec_XCGPart3.setXCG01393(XCG01393);
	}

	/**
	* Sets the xcg01394 of this vr technical spec_xcg part3.
	*
	* @param XCG01394 the xcg01394 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01394(java.lang.String XCG01394) {
		_vrTechnicalSpec_XCGPart3.setXCG01394(XCG01394);
	}

	/**
	* Sets the xcg01395 of this vr technical spec_xcg part3.
	*
	* @param XCG01395 the xcg01395 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01395(java.lang.String XCG01395) {
		_vrTechnicalSpec_XCGPart3.setXCG01395(XCG01395);
	}

	/**
	* Sets the xcg01396 of this vr technical spec_xcg part3.
	*
	* @param XCG01396 the xcg01396 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01396(java.lang.String XCG01396) {
		_vrTechnicalSpec_XCGPart3.setXCG01396(XCG01396);
	}

	/**
	* Sets the xcg01397 of this vr technical spec_xcg part3.
	*
	* @param XCG01397 the xcg01397 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01397(java.lang.String XCG01397) {
		_vrTechnicalSpec_XCGPart3.setXCG01397(XCG01397);
	}

	/**
	* Sets the xcg01398 of this vr technical spec_xcg part3.
	*
	* @param XCG01398 the xcg01398 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01398(java.lang.String XCG01398) {
		_vrTechnicalSpec_XCGPart3.setXCG01398(XCG01398);
	}

	/**
	* Sets the xcg01399 of this vr technical spec_xcg part3.
	*
	* @param XCG01399 the xcg01399 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01399(java.lang.String XCG01399) {
		_vrTechnicalSpec_XCGPart3.setXCG01399(XCG01399);
	}

	/**
	* Sets the xcg01400 of this vr technical spec_xcg part3.
	*
	* @param XCG01400 the xcg01400 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01400(java.lang.String XCG01400) {
		_vrTechnicalSpec_XCGPart3.setXCG01400(XCG01400);
	}

	/**
	* Sets the xcg01402 of this vr technical spec_xcg part3.
	*
	* @param XCG01402 the xcg01402 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01402(java.lang.String XCG01402) {
		_vrTechnicalSpec_XCGPart3.setXCG01402(XCG01402);
	}

	/**
	* Sets the xcg01403 of this vr technical spec_xcg part3.
	*
	* @param XCG01403 the xcg01403 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01403(java.lang.String XCG01403) {
		_vrTechnicalSpec_XCGPart3.setXCG01403(XCG01403);
	}

	/**
	* Sets the xcg01404 of this vr technical spec_xcg part3.
	*
	* @param XCG01404 the xcg01404 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01404(java.lang.String XCG01404) {
		_vrTechnicalSpec_XCGPart3.setXCG01404(XCG01404);
	}

	/**
	* Sets the xcg01405 of this vr technical spec_xcg part3.
	*
	* @param XCG01405 the xcg01405 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01405(java.lang.String XCG01405) {
		_vrTechnicalSpec_XCGPart3.setXCG01405(XCG01405);
	}

	/**
	* Sets the xcg01406 of this vr technical spec_xcg part3.
	*
	* @param XCG01406 the xcg01406 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01406(java.lang.String XCG01406) {
		_vrTechnicalSpec_XCGPart3.setXCG01406(XCG01406);
	}

	/**
	* Sets the xcg01407 of this vr technical spec_xcg part3.
	*
	* @param XCG01407 the xcg01407 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01407(java.lang.String XCG01407) {
		_vrTechnicalSpec_XCGPart3.setXCG01407(XCG01407);
	}

	/**
	* Sets the xcg01408 of this vr technical spec_xcg part3.
	*
	* @param XCG01408 the xcg01408 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01408(java.lang.String XCG01408) {
		_vrTechnicalSpec_XCGPart3.setXCG01408(XCG01408);
	}

	/**
	* Sets the xcg01409 of this vr technical spec_xcg part3.
	*
	* @param XCG01409 the xcg01409 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01409(java.lang.String XCG01409) {
		_vrTechnicalSpec_XCGPart3.setXCG01409(XCG01409);
	}

	/**
	* Sets the xcg01410 of this vr technical spec_xcg part3.
	*
	* @param XCG01410 the xcg01410 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01410(java.lang.String XCG01410) {
		_vrTechnicalSpec_XCGPart3.setXCG01410(XCG01410);
	}

	/**
	* Sets the xcg01411 of this vr technical spec_xcg part3.
	*
	* @param XCG01411 the xcg01411 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01411(java.lang.String XCG01411) {
		_vrTechnicalSpec_XCGPart3.setXCG01411(XCG01411);
	}

	/**
	* Sets the xcg01412 of this vr technical spec_xcg part3.
	*
	* @param XCG01412 the xcg01412 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01412(java.lang.String XCG01412) {
		_vrTechnicalSpec_XCGPart3.setXCG01412(XCG01412);
	}

	/**
	* Sets the xcg01413 of this vr technical spec_xcg part3.
	*
	* @param XCG01413 the xcg01413 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01413(java.lang.String XCG01413) {
		_vrTechnicalSpec_XCGPart3.setXCG01413(XCG01413);
	}

	/**
	* Sets the xcg01414 of this vr technical spec_xcg part3.
	*
	* @param XCG01414 the xcg01414 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01414(java.lang.String XCG01414) {
		_vrTechnicalSpec_XCGPart3.setXCG01414(XCG01414);
	}

	/**
	* Sets the xcg01415 of this vr technical spec_xcg part3.
	*
	* @param XCG01415 the xcg01415 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01415(java.lang.String XCG01415) {
		_vrTechnicalSpec_XCGPart3.setXCG01415(XCG01415);
	}

	/**
	* Sets the xcg01416 of this vr technical spec_xcg part3.
	*
	* @param XCG01416 the xcg01416 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01416(java.lang.String XCG01416) {
		_vrTechnicalSpec_XCGPart3.setXCG01416(XCG01416);
	}

	/**
	* Sets the xcg01417 of this vr technical spec_xcg part3.
	*
	* @param XCG01417 the xcg01417 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01417(java.lang.String XCG01417) {
		_vrTechnicalSpec_XCGPart3.setXCG01417(XCG01417);
	}

	/**
	* Sets the xcg01418 of this vr technical spec_xcg part3.
	*
	* @param XCG01418 the xcg01418 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01418(java.lang.String XCG01418) {
		_vrTechnicalSpec_XCGPart3.setXCG01418(XCG01418);
	}

	/**
	* Sets the xcg01419 of this vr technical spec_xcg part3.
	*
	* @param XCG01419 the xcg01419 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01419(java.lang.String XCG01419) {
		_vrTechnicalSpec_XCGPart3.setXCG01419(XCG01419);
	}

	/**
	* Sets the xcg01420 of this vr technical spec_xcg part3.
	*
	* @param XCG01420 the xcg01420 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01420(java.lang.String XCG01420) {
		_vrTechnicalSpec_XCGPart3.setXCG01420(XCG01420);
	}

	/**
	* Sets the xcg01421 of this vr technical spec_xcg part3.
	*
	* @param XCG01421 the xcg01421 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01421(java.lang.String XCG01421) {
		_vrTechnicalSpec_XCGPart3.setXCG01421(XCG01421);
	}

	/**
	* Sets the xcg01422 of this vr technical spec_xcg part3.
	*
	* @param XCG01422 the xcg01422 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01422(java.lang.String XCG01422) {
		_vrTechnicalSpec_XCGPart3.setXCG01422(XCG01422);
	}

	/**
	* Sets the xcg01423 of this vr technical spec_xcg part3.
	*
	* @param XCG01423 the xcg01423 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01423(java.lang.String XCG01423) {
		_vrTechnicalSpec_XCGPart3.setXCG01423(XCG01423);
	}

	/**
	* Sets the xcg01424 of this vr technical spec_xcg part3.
	*
	* @param XCG01424 the xcg01424 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01424(java.lang.String XCG01424) {
		_vrTechnicalSpec_XCGPart3.setXCG01424(XCG01424);
	}

	/**
	* Sets the xcg01425 of this vr technical spec_xcg part3.
	*
	* @param XCG01425 the xcg01425 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01425(java.lang.String XCG01425) {
		_vrTechnicalSpec_XCGPart3.setXCG01425(XCG01425);
	}

	/**
	* Sets the xcg01426 of this vr technical spec_xcg part3.
	*
	* @param XCG01426 the xcg01426 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01426(java.lang.String XCG01426) {
		_vrTechnicalSpec_XCGPart3.setXCG01426(XCG01426);
	}

	/**
	* Sets the xcg01427 of this vr technical spec_xcg part3.
	*
	* @param XCG01427 the xcg01427 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01427(java.lang.String XCG01427) {
		_vrTechnicalSpec_XCGPart3.setXCG01427(XCG01427);
	}

	/**
	* Sets the xcg01428 of this vr technical spec_xcg part3.
	*
	* @param XCG01428 the xcg01428 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01428(java.lang.String XCG01428) {
		_vrTechnicalSpec_XCGPart3.setXCG01428(XCG01428);
	}

	/**
	* Sets the xcg01429 of this vr technical spec_xcg part3.
	*
	* @param XCG01429 the xcg01429 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01429(java.lang.String XCG01429) {
		_vrTechnicalSpec_XCGPart3.setXCG01429(XCG01429);
	}

	/**
	* Sets the xcg01430 of this vr technical spec_xcg part3.
	*
	* @param XCG01430 the xcg01430 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01430(java.lang.String XCG01430) {
		_vrTechnicalSpec_XCGPart3.setXCG01430(XCG01430);
	}

	/**
	* Sets the xcg01431 of this vr technical spec_xcg part3.
	*
	* @param XCG01431 the xcg01431 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01431(java.lang.String XCG01431) {
		_vrTechnicalSpec_XCGPart3.setXCG01431(XCG01431);
	}

	/**
	* Sets the xcg01432 of this vr technical spec_xcg part3.
	*
	* @param XCG01432 the xcg01432 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01432(java.lang.String XCG01432) {
		_vrTechnicalSpec_XCGPart3.setXCG01432(XCG01432);
	}

	/**
	* Sets the xcg01433 of this vr technical spec_xcg part3.
	*
	* @param XCG01433 the xcg01433 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01433(java.lang.String XCG01433) {
		_vrTechnicalSpec_XCGPart3.setXCG01433(XCG01433);
	}

	/**
	* Sets the xcg01434 of this vr technical spec_xcg part3.
	*
	* @param XCG01434 the xcg01434 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01434(java.lang.String XCG01434) {
		_vrTechnicalSpec_XCGPart3.setXCG01434(XCG01434);
	}

	/**
	* Sets the xcg01435 of this vr technical spec_xcg part3.
	*
	* @param XCG01435 the xcg01435 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01435(java.lang.String XCG01435) {
		_vrTechnicalSpec_XCGPart3.setXCG01435(XCG01435);
	}

	/**
	* Sets the xcg01436 of this vr technical spec_xcg part3.
	*
	* @param XCG01436 the xcg01436 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01436(java.lang.String XCG01436) {
		_vrTechnicalSpec_XCGPart3.setXCG01436(XCG01436);
	}

	/**
	* Sets the xcg01437 of this vr technical spec_xcg part3.
	*
	* @param XCG01437 the xcg01437 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01437(java.lang.String XCG01437) {
		_vrTechnicalSpec_XCGPart3.setXCG01437(XCG01437);
	}

	/**
	* Sets the xcg01439 of this vr technical spec_xcg part3.
	*
	* @param XCG01439 the xcg01439 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01439(java.lang.String XCG01439) {
		_vrTechnicalSpec_XCGPart3.setXCG01439(XCG01439);
	}

	/**
	* Sets the xcg01440 of this vr technical spec_xcg part3.
	*
	* @param XCG01440 the xcg01440 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01440(java.lang.String XCG01440) {
		_vrTechnicalSpec_XCGPart3.setXCG01440(XCG01440);
	}

	/**
	* Sets the xcg01441 of this vr technical spec_xcg part3.
	*
	* @param XCG01441 the xcg01441 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01441(java.lang.String XCG01441) {
		_vrTechnicalSpec_XCGPart3.setXCG01441(XCG01441);
	}

	/**
	* Sets the xcg01442 of this vr technical spec_xcg part3.
	*
	* @param XCG01442 the xcg01442 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01442(java.lang.String XCG01442) {
		_vrTechnicalSpec_XCGPart3.setXCG01442(XCG01442);
	}

	/**
	* Sets the xcg01443 of this vr technical spec_xcg part3.
	*
	* @param XCG01443 the xcg01443 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01443(java.lang.String XCG01443) {
		_vrTechnicalSpec_XCGPart3.setXCG01443(XCG01443);
	}

	/**
	* Sets the xcg01445 of this vr technical spec_xcg part3.
	*
	* @param XCG01445 the xcg01445 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01445(java.lang.String XCG01445) {
		_vrTechnicalSpec_XCGPart3.setXCG01445(XCG01445);
	}

	/**
	* Sets the xcg01446 of this vr technical spec_xcg part3.
	*
	* @param XCG01446 the xcg01446 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01446(java.lang.String XCG01446) {
		_vrTechnicalSpec_XCGPart3.setXCG01446(XCG01446);
	}

	/**
	* Sets the xcg01447 of this vr technical spec_xcg part3.
	*
	* @param XCG01447 the xcg01447 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01447(java.lang.String XCG01447) {
		_vrTechnicalSpec_XCGPart3.setXCG01447(XCG01447);
	}

	/**
	* Sets the xcg01448 of this vr technical spec_xcg part3.
	*
	* @param XCG01448 the xcg01448 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01448(java.lang.String XCG01448) {
		_vrTechnicalSpec_XCGPart3.setXCG01448(XCG01448);
	}

	/**
	* Sets the xcg01449 of this vr technical spec_xcg part3.
	*
	* @param XCG01449 the xcg01449 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01449(java.lang.String XCG01449) {
		_vrTechnicalSpec_XCGPart3.setXCG01449(XCG01449);
	}

	/**
	* Sets the xcg01450 of this vr technical spec_xcg part3.
	*
	* @param XCG01450 the xcg01450 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01450(java.lang.String XCG01450) {
		_vrTechnicalSpec_XCGPart3.setXCG01450(XCG01450);
	}

	/**
	* Sets the xcg01451 of this vr technical spec_xcg part3.
	*
	* @param XCG01451 the xcg01451 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01451(java.lang.String XCG01451) {
		_vrTechnicalSpec_XCGPart3.setXCG01451(XCG01451);
	}

	/**
	* Sets the xcg01452 of this vr technical spec_xcg part3.
	*
	* @param XCG01452 the xcg01452 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01452(java.lang.String XCG01452) {
		_vrTechnicalSpec_XCGPart3.setXCG01452(XCG01452);
	}

	/**
	* Sets the xcg01453 of this vr technical spec_xcg part3.
	*
	* @param XCG01453 the xcg01453 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01453(java.lang.String XCG01453) {
		_vrTechnicalSpec_XCGPart3.setXCG01453(XCG01453);
	}

	/**
	* Sets the xcg01454 of this vr technical spec_xcg part3.
	*
	* @param XCG01454 the xcg01454 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01454(java.lang.String XCG01454) {
		_vrTechnicalSpec_XCGPart3.setXCG01454(XCG01454);
	}

	/**
	* Sets the xcg01455 of this vr technical spec_xcg part3.
	*
	* @param XCG01455 the xcg01455 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01455(java.lang.String XCG01455) {
		_vrTechnicalSpec_XCGPart3.setXCG01455(XCG01455);
	}

	/**
	* Sets the xcg01456 of this vr technical spec_xcg part3.
	*
	* @param XCG01456 the xcg01456 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01456(java.lang.String XCG01456) {
		_vrTechnicalSpec_XCGPart3.setXCG01456(XCG01456);
	}

	/**
	* Sets the xcg01457 of this vr technical spec_xcg part3.
	*
	* @param XCG01457 the xcg01457 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01457(java.lang.String XCG01457) {
		_vrTechnicalSpec_XCGPart3.setXCG01457(XCG01457);
	}

	/**
	* Sets the xcg01458 of this vr technical spec_xcg part3.
	*
	* @param XCG01458 the xcg01458 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01458(java.lang.String XCG01458) {
		_vrTechnicalSpec_XCGPart3.setXCG01458(XCG01458);
	}

	/**
	* Sets the xcg01459 of this vr technical spec_xcg part3.
	*
	* @param XCG01459 the xcg01459 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01459(java.lang.String XCG01459) {
		_vrTechnicalSpec_XCGPart3.setXCG01459(XCG01459);
	}

	/**
	* Sets the xcg01460 of this vr technical spec_xcg part3.
	*
	* @param XCG01460 the xcg01460 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01460(java.lang.String XCG01460) {
		_vrTechnicalSpec_XCGPart3.setXCG01460(XCG01460);
	}

	/**
	* Sets the xcg01461 of this vr technical spec_xcg part3.
	*
	* @param XCG01461 the xcg01461 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01461(java.lang.String XCG01461) {
		_vrTechnicalSpec_XCGPart3.setXCG01461(XCG01461);
	}

	/**
	* Sets the xcg01462 of this vr technical spec_xcg part3.
	*
	* @param XCG01462 the xcg01462 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01462(java.lang.String XCG01462) {
		_vrTechnicalSpec_XCGPart3.setXCG01462(XCG01462);
	}

	/**
	* Sets the xcg01463 of this vr technical spec_xcg part3.
	*
	* @param XCG01463 the xcg01463 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01463(java.lang.String XCG01463) {
		_vrTechnicalSpec_XCGPart3.setXCG01463(XCG01463);
	}

	/**
	* Sets the xcg01464 of this vr technical spec_xcg part3.
	*
	* @param XCG01464 the xcg01464 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01464(java.lang.String XCG01464) {
		_vrTechnicalSpec_XCGPart3.setXCG01464(XCG01464);
	}

	/**
	* Sets the xcg01465 of this vr technical spec_xcg part3.
	*
	* @param XCG01465 the xcg01465 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01465(java.lang.String XCG01465) {
		_vrTechnicalSpec_XCGPart3.setXCG01465(XCG01465);
	}

	/**
	* Sets the xcg01466 of this vr technical spec_xcg part3.
	*
	* @param XCG01466 the xcg01466 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01466(java.lang.String XCG01466) {
		_vrTechnicalSpec_XCGPart3.setXCG01466(XCG01466);
	}

	/**
	* Sets the xcg01467 of this vr technical spec_xcg part3.
	*
	* @param XCG01467 the xcg01467 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01467(java.lang.String XCG01467) {
		_vrTechnicalSpec_XCGPart3.setXCG01467(XCG01467);
	}

	/**
	* Sets the xcg01468 of this vr technical spec_xcg part3.
	*
	* @param XCG01468 the xcg01468 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01468(java.lang.String XCG01468) {
		_vrTechnicalSpec_XCGPart3.setXCG01468(XCG01468);
	}

	/**
	* Sets the xcg01469 of this vr technical spec_xcg part3.
	*
	* @param XCG01469 the xcg01469 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01469(java.lang.String XCG01469) {
		_vrTechnicalSpec_XCGPart3.setXCG01469(XCG01469);
	}

	/**
	* Sets the xcg01470 of this vr technical spec_xcg part3.
	*
	* @param XCG01470 the xcg01470 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01470(java.lang.String XCG01470) {
		_vrTechnicalSpec_XCGPart3.setXCG01470(XCG01470);
	}

	/**
	* Sets the xcg01471 of this vr technical spec_xcg part3.
	*
	* @param XCG01471 the xcg01471 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01471(java.lang.String XCG01471) {
		_vrTechnicalSpec_XCGPart3.setXCG01471(XCG01471);
	}

	/**
	* Sets the xcg01472 of this vr technical spec_xcg part3.
	*
	* @param XCG01472 the xcg01472 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01472(java.lang.String XCG01472) {
		_vrTechnicalSpec_XCGPart3.setXCG01472(XCG01472);
	}

	/**
	* Sets the xcg01473 of this vr technical spec_xcg part3.
	*
	* @param XCG01473 the xcg01473 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01473(java.lang.String XCG01473) {
		_vrTechnicalSpec_XCGPart3.setXCG01473(XCG01473);
	}

	/**
	* Sets the xcg01474 of this vr technical spec_xcg part3.
	*
	* @param XCG01474 the xcg01474 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01474(java.lang.String XCG01474) {
		_vrTechnicalSpec_XCGPart3.setXCG01474(XCG01474);
	}

	/**
	* Sets the xcg01475 of this vr technical spec_xcg part3.
	*
	* @param XCG01475 the xcg01475 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01475(java.lang.String XCG01475) {
		_vrTechnicalSpec_XCGPart3.setXCG01475(XCG01475);
	}

	/**
	* Sets the xcg01476 of this vr technical spec_xcg part3.
	*
	* @param XCG01476 the xcg01476 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01476(java.lang.String XCG01476) {
		_vrTechnicalSpec_XCGPart3.setXCG01476(XCG01476);
	}

	/**
	* Sets the xcg01477 of this vr technical spec_xcg part3.
	*
	* @param XCG01477 the xcg01477 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01477(java.lang.String XCG01477) {
		_vrTechnicalSpec_XCGPart3.setXCG01477(XCG01477);
	}

	/**
	* Sets the xcg01478 of this vr technical spec_xcg part3.
	*
	* @param XCG01478 the xcg01478 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01478(java.lang.String XCG01478) {
		_vrTechnicalSpec_XCGPart3.setXCG01478(XCG01478);
	}

	/**
	* Sets the xcg01479 of this vr technical spec_xcg part3.
	*
	* @param XCG01479 the xcg01479 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01479(java.lang.String XCG01479) {
		_vrTechnicalSpec_XCGPart3.setXCG01479(XCG01479);
	}

	/**
	* Sets the xcg01480 of this vr technical spec_xcg part3.
	*
	* @param XCG01480 the xcg01480 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01480(java.lang.String XCG01480) {
		_vrTechnicalSpec_XCGPart3.setXCG01480(XCG01480);
	}

	/**
	* Sets the xcg01481 of this vr technical spec_xcg part3.
	*
	* @param XCG01481 the xcg01481 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01481(java.lang.String XCG01481) {
		_vrTechnicalSpec_XCGPart3.setXCG01481(XCG01481);
	}

	/**
	* Sets the xcg01482 of this vr technical spec_xcg part3.
	*
	* @param XCG01482 the xcg01482 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01482(java.lang.String XCG01482) {
		_vrTechnicalSpec_XCGPart3.setXCG01482(XCG01482);
	}

	/**
	* Sets the xcg01483 of this vr technical spec_xcg part3.
	*
	* @param XCG01483 the xcg01483 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01483(java.lang.String XCG01483) {
		_vrTechnicalSpec_XCGPart3.setXCG01483(XCG01483);
	}

	/**
	* Sets the xcg01484 of this vr technical spec_xcg part3.
	*
	* @param XCG01484 the xcg01484 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01484(java.lang.String XCG01484) {
		_vrTechnicalSpec_XCGPart3.setXCG01484(XCG01484);
	}

	/**
	* Sets the xcg01485 of this vr technical spec_xcg part3.
	*
	* @param XCG01485 the xcg01485 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01485(java.lang.String XCG01485) {
		_vrTechnicalSpec_XCGPart3.setXCG01485(XCG01485);
	}

	/**
	* Sets the xcg01486 of this vr technical spec_xcg part3.
	*
	* @param XCG01486 the xcg01486 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01486(java.lang.String XCG01486) {
		_vrTechnicalSpec_XCGPart3.setXCG01486(XCG01486);
	}

	/**
	* Sets the xcg01487 of this vr technical spec_xcg part3.
	*
	* @param XCG01487 the xcg01487 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01487(java.lang.String XCG01487) {
		_vrTechnicalSpec_XCGPart3.setXCG01487(XCG01487);
	}

	/**
	* Sets the xcg01488 of this vr technical spec_xcg part3.
	*
	* @param XCG01488 the xcg01488 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01488(java.lang.String XCG01488) {
		_vrTechnicalSpec_XCGPart3.setXCG01488(XCG01488);
	}

	/**
	* Sets the xcg01489 of this vr technical spec_xcg part3.
	*
	* @param XCG01489 the xcg01489 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01489(java.lang.String XCG01489) {
		_vrTechnicalSpec_XCGPart3.setXCG01489(XCG01489);
	}

	/**
	* Sets the xcg01490 of this vr technical spec_xcg part3.
	*
	* @param XCG01490 the xcg01490 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01490(java.lang.String XCG01490) {
		_vrTechnicalSpec_XCGPart3.setXCG01490(XCG01490);
	}

	/**
	* Sets the xcg01491 of this vr technical spec_xcg part3.
	*
	* @param XCG01491 the xcg01491 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01491(java.lang.String XCG01491) {
		_vrTechnicalSpec_XCGPart3.setXCG01491(XCG01491);
	}

	/**
	* Sets the xcg01492 of this vr technical spec_xcg part3.
	*
	* @param XCG01492 the xcg01492 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01492(java.lang.String XCG01492) {
		_vrTechnicalSpec_XCGPart3.setXCG01492(XCG01492);
	}

	/**
	* Sets the xcg01493 of this vr technical spec_xcg part3.
	*
	* @param XCG01493 the xcg01493 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01493(java.lang.String XCG01493) {
		_vrTechnicalSpec_XCGPart3.setXCG01493(XCG01493);
	}

	/**
	* Sets the xcg01494 of this vr technical spec_xcg part3.
	*
	* @param XCG01494 the xcg01494 of this vr technical spec_xcg part3
	*/
	@Override
	public void setXCG01494(java.lang.String XCG01494) {
		_vrTechnicalSpec_XCGPart3.setXCG01494(XCG01494);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGPart3Wrapper)) {
			return false;
		}

		VRTechnicalSpec_XCGPart3Wrapper vrTechnicalSpec_XCGPart3Wrapper = (VRTechnicalSpec_XCGPart3Wrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XCGPart3,
					vrTechnicalSpec_XCGPart3Wrapper._vrTechnicalSpec_XCGPart3)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XCGPart3 getWrappedModel() {
		return _vrTechnicalSpec_XCGPart3;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XCGPart3.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XCGPart3.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XCGPart3.resetOriginalValues();
	}

	private final VRTechnicalSpec_XCGPart3 _vrTechnicalSpec_XCGPart3;
}