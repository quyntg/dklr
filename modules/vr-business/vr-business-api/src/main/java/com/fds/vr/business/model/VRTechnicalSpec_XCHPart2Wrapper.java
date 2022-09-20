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
 * This class is a wrapper for {@link VRTechnicalSpec_XCHPart2}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCHPart2
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCHPart2Wrapper implements VRTechnicalSpec_XCHPart2,
	ModelWrapper<VRTechnicalSpec_XCHPart2> {
	public VRTechnicalSpec_XCHPart2Wrapper(
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2) {
		_vrTechnicalSpec_XCHPart2 = vrTechnicalSpec_XCHPart2;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XCHPart2.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XCHPart2.class.getName();
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
		attributes.put("XCH01273", getXCH01273());
		attributes.put("XCH01274", getXCH01274());
		attributes.put("XCH01275", getXCH01275());
		attributes.put("XCH01276", getXCH01276());
		attributes.put("XCH01277", getXCH01277());
		attributes.put("XCH01278", getXCH01278());
		attributes.put("XCH01279", getXCH01279());
		attributes.put("XCH01280", getXCH01280());
		attributes.put("XCH01281", getXCH01281());
		attributes.put("XCH01282", getXCH01282());
		attributes.put("XCH01283", getXCH01283());
		attributes.put("XCH01284", getXCH01284());
		attributes.put("XCH01285", getXCH01285());
		attributes.put("XCH01286", getXCH01286());
		attributes.put("XCH01287", getXCH01287());
		attributes.put("XCH01288", getXCH01288());
		attributes.put("XCH01289", getXCH01289());
		attributes.put("XCH01290", getXCH01290());
		attributes.put("XCH01291", getXCH01291());
		attributes.put("XCH01292", getXCH01292());
		attributes.put("XCH01293", getXCH01293());
		attributes.put("XCH01294", getXCH01294());
		attributes.put("XCH01295", getXCH01295());
		attributes.put("XCH01296", getXCH01296());
		attributes.put("XCH01297", getXCH01297());
		attributes.put("XCH01298", getXCH01298());
		attributes.put("XCH01299", getXCH01299());
		attributes.put("XCH01300", getXCH01300());
		attributes.put("XCH01301", getXCH01301());
		attributes.put("XCH01302", getXCH01302());
		attributes.put("XCH01303", getXCH01303());
		attributes.put("XCH01304", getXCH01304());
		attributes.put("XCH01305", getXCH01305());
		attributes.put("XCH01306", getXCH01306());
		attributes.put("XCH01307", getXCH01307());
		attributes.put("XCH01308", getXCH01308());
		attributes.put("XCH01309", getXCH01309());
		attributes.put("XCH01310", getXCH01310());
		attributes.put("XCH01311", getXCH01311());
		attributes.put("XCH01312", getXCH01312());
		attributes.put("XCH01313", getXCH01313());
		attributes.put("XCH01314", getXCH01314());
		attributes.put("XCH01315", getXCH01315());
		attributes.put("XCH01316", getXCH01316());
		attributes.put("XCH01317", getXCH01317());
		attributes.put("XCH01318", getXCH01318());
		attributes.put("XCH01319", getXCH01319());
		attributes.put("XCH01320", getXCH01320());
		attributes.put("XCH01321", getXCH01321());
		attributes.put("XCH01322", getXCH01322());
		attributes.put("XCH01323", getXCH01323());
		attributes.put("XCH01324", getXCH01324());
		attributes.put("XCH01325", getXCH01325());
		attributes.put("XCH01326", getXCH01326());
		attributes.put("XCH01327", getXCH01327());
		attributes.put("XCH01328", getXCH01328());
		attributes.put("XCH01329", getXCH01329());
		attributes.put("XCH01330", getXCH01330());
		attributes.put("XCH01331", getXCH01331());
		attributes.put("XCH01332", getXCH01332());
		attributes.put("XCH01333", getXCH01333());
		attributes.put("XCH01334", getXCH01334());
		attributes.put("XCH01335", getXCH01335());
		attributes.put("XCH01336", getXCH01336());
		attributes.put("XCH01337", getXCH01337());
		attributes.put("XCH01338", getXCH01338());
		attributes.put("XCH01339", getXCH01339());
		attributes.put("XCH01340", getXCH01340());
		attributes.put("XCH01341", getXCH01341());
		attributes.put("XCH01342", getXCH01342());
		attributes.put("XCH01343", getXCH01343());
		attributes.put("XCH01344", getXCH01344());
		attributes.put("XCH01345", getXCH01345());
		attributes.put("XCH01346", getXCH01346());
		attributes.put("XCH01347", getXCH01347());
		attributes.put("XCH01348", getXCH01348());
		attributes.put("XCH01349", getXCH01349());
		attributes.put("XCH01350", getXCH01350());
		attributes.put("XCH01351", getXCH01351());
		attributes.put("XCH01352", getXCH01352());
		attributes.put("XCH01353", getXCH01353());
		attributes.put("XCH01354", getXCH01354());
		attributes.put("XCH01355", getXCH01355());
		attributes.put("XCH01356", getXCH01356());
		attributes.put("XCH01357", getXCH01357());
		attributes.put("XCH01358", getXCH01358());
		attributes.put("XCH01359", getXCH01359());
		attributes.put("XCH01360", getXCH01360());
		attributes.put("XCH01361", getXCH01361());
		attributes.put("XCH01362", getXCH01362());
		attributes.put("XCH01363", getXCH01363());
		attributes.put("XCH01364", getXCH01364());
		attributes.put("XCH01365", getXCH01365());
		attributes.put("XCH01366", getXCH01366());
		attributes.put("XCH01367", getXCH01367());
		attributes.put("XCH01368", getXCH01368());
		attributes.put("XCH01369", getXCH01369());
		attributes.put("XCH01370", getXCH01370());
		attributes.put("XCH01371", getXCH01371());
		attributes.put("XCH01372", getXCH01372());
		attributes.put("XCH01373", getXCH01373());
		attributes.put("XCH01374", getXCH01374());
		attributes.put("XCH01375", getXCH01375());
		attributes.put("XCH01376", getXCH01376());
		attributes.put("XCH01377", getXCH01377());
		attributes.put("XCH01378", getXCH01378());
		attributes.put("XCH01379", getXCH01379());
		attributes.put("XCH01380", getXCH01380());
		attributes.put("XCH01381", getXCH01381());
		attributes.put("XCH01382", getXCH01382());
		attributes.put("XCH01383", getXCH01383());
		attributes.put("XCH01384", getXCH01384());
		attributes.put("XCH01385", getXCH01385());
		attributes.put("XCH01386", getXCH01386());
		attributes.put("XCH01387", getXCH01387());
		attributes.put("XCH01388", getXCH01388());
		attributes.put("XCH01389", getXCH01389());
		attributes.put("XCH01390", getXCH01390());
		attributes.put("XCH01391", getXCH01391());
		attributes.put("XCH01392", getXCH01392());
		attributes.put("XCH01393", getXCH01393());
		attributes.put("XCH01394", getXCH01394());
		attributes.put("XCH01395", getXCH01395());
		attributes.put("XCH01396", getXCH01396());
		attributes.put("XCH01397", getXCH01397());
		attributes.put("XCH01398", getXCH01398());
		attributes.put("XCH01399", getXCH01399());
		attributes.put("XCH01400", getXCH01400());
		attributes.put("XCH01401", getXCH01401());
		attributes.put("XCH01402", getXCH01402());
		attributes.put("XCH01403", getXCH01403());
		attributes.put("XCH01404", getXCH01404());
		attributes.put("XCH01405", getXCH01405());
		attributes.put("XCH01406", getXCH01406());
		attributes.put("XCH01407", getXCH01407());
		attributes.put("XCH01408", getXCH01408());
		attributes.put("XCH01409", getXCH01409());
		attributes.put("XCH01410", getXCH01410());
		attributes.put("XCH01411", getXCH01411());
		attributes.put("XCH01412", getXCH01412());
		attributes.put("XCH01413", getXCH01413());
		attributes.put("XCH01414", getXCH01414());
		attributes.put("XCH01415", getXCH01415());
		attributes.put("XCH01416", getXCH01416());
		attributes.put("XCH01417", getXCH01417());
		attributes.put("XCH01418", getXCH01418());
		attributes.put("XCH01419", getXCH01419());
		attributes.put("XCH01420", getXCH01420());
		attributes.put("XCH01421", getXCH01421());
		attributes.put("XCH01422", getXCH01422());
		attributes.put("XCH01423", getXCH01423());
		attributes.put("XCH01424", getXCH01424());
		attributes.put("XCH01425", getXCH01425());
		attributes.put("XCH01426", getXCH01426());
		attributes.put("XCH01427", getXCH01427());
		attributes.put("XCH01428", getXCH01428());
		attributes.put("XCH01429", getXCH01429());
		attributes.put("XCH01430", getXCH01430());
		attributes.put("XCH01431", getXCH01431());
		attributes.put("XCH01432", getXCH01432());
		attributes.put("XCH01433", getXCH01433());
		attributes.put("XCH01434", getXCH01434());
		attributes.put("XCH01435", getXCH01435());
		attributes.put("XCH01436", getXCH01436());
		attributes.put("XCH01437", getXCH01437());
		attributes.put("XCH01438", getXCH01438());
		attributes.put("XCH01439", getXCH01439());
		attributes.put("XCH01440", getXCH01440());
		attributes.put("XCH01441", getXCH01441());
		attributes.put("XCH01442", getXCH01442());
		attributes.put("XCH01443", getXCH01443());
		attributes.put("XCH01444", getXCH01444());
		attributes.put("XCH01445", getXCH01445());
		attributes.put("BBCNCLKLXCH001", getBBCNCLKLXCH001());
		attributes.put("BBCNCLKLXCH002", getBBCNCLKLXCH002());
		attributes.put("BBCNCLKLXCH003", getBBCNCLKLXCH003());
		attributes.put("BBCNCLKLXCH004", getBBCNCLKLXCH004());
		attributes.put("BBCNCLKLXCH005", getBBCNCLKLXCH005());
		attributes.put("BBCNCLKLXCH006", getBBCNCLKLXCH006());
		attributes.put("BBCNCLKLXCH012", getBBCNCLKLXCH012());
		attributes.put("BBCNCLKLXCH013", getBBCNCLKLXCH013());
		attributes.put("BBCNCLKLXCH014", getBBCNCLKLXCH014());
		attributes.put("BBCNCLKLXCH015", getBBCNCLKLXCH015());
		attributes.put("BBCNCLKLXCH016", getBBCNCLKLXCH016());
		attributes.put("BBCNCLKLXCH017", getBBCNCLKLXCH017());
		attributes.put("BBCNCLKLXCH018", getBBCNCLKLXCH018());
		attributes.put("BBCNCLKLXCH019", getBBCNCLKLXCH019());
		attributes.put("BBCNCLKLXCH020", getBBCNCLKLXCH020());
		attributes.put("BBCNCLKLXCH021", getBBCNCLKLXCH021());
		attributes.put("BBCNCLKLXCH022", getBBCNCLKLXCH022());
		attributes.put("BBCNCLKLXCH023", getBBCNCLKLXCH023());
		attributes.put("BBCNCLKLXCH026", getBBCNCLKLXCH026());
		attributes.put("BBCNCLKLXCH027", getBBCNCLKLXCH027());
		attributes.put("BBCNCLKLXCH028", getBBCNCLKLXCH028());
		attributes.put("BBCNCLKLXCH033", getBBCNCLKLXCH033());
		attributes.put("BBCNCLKLXCH034", getBBCNCLKLXCH034());
		attributes.put("BBCNCLKLXCH037", getBBCNCLKLXCH037());
		attributes.put("BBCNCLKLXCH038", getBBCNCLKLXCH038());
		attributes.put("BBCNCLKLXCH039", getBBCNCLKLXCH039());
		attributes.put("BBCNCLKLXCH040", getBBCNCLKLXCH040());
		attributes.put("BBCNCLKLXCH041", getBBCNCLKLXCH041());
		attributes.put("BBCNCLKLXCH042", getBBCNCLKLXCH042());
		attributes.put("BBCNCLKLXCH043", getBBCNCLKLXCH043());
		attributes.put("BBCNCLKLXCH044", getBBCNCLKLXCH044());
		attributes.put("BBCNCLKLXCH045", getBBCNCLKLXCH045());
		attributes.put("BBCNCLKLXCH046", getBBCNCLKLXCH046());
		attributes.put("BBCNCLKLXCH047", getBBCNCLKLXCH047());
		attributes.put("BBCNCLKLXCH053", getBBCNCLKLXCH053());
		attributes.put("BBCNCLKLXCH054", getBBCNCLKLXCH054());
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

		String XCH01273 = (String)attributes.get("XCH01273");

		if (XCH01273 != null) {
			setXCH01273(XCH01273);
		}

		String XCH01274 = (String)attributes.get("XCH01274");

		if (XCH01274 != null) {
			setXCH01274(XCH01274);
		}

		String XCH01275 = (String)attributes.get("XCH01275");

		if (XCH01275 != null) {
			setXCH01275(XCH01275);
		}

		String XCH01276 = (String)attributes.get("XCH01276");

		if (XCH01276 != null) {
			setXCH01276(XCH01276);
		}

		String XCH01277 = (String)attributes.get("XCH01277");

		if (XCH01277 != null) {
			setXCH01277(XCH01277);
		}

		String XCH01278 = (String)attributes.get("XCH01278");

		if (XCH01278 != null) {
			setXCH01278(XCH01278);
		}

		String XCH01279 = (String)attributes.get("XCH01279");

		if (XCH01279 != null) {
			setXCH01279(XCH01279);
		}

		String XCH01280 = (String)attributes.get("XCH01280");

		if (XCH01280 != null) {
			setXCH01280(XCH01280);
		}

		String XCH01281 = (String)attributes.get("XCH01281");

		if (XCH01281 != null) {
			setXCH01281(XCH01281);
		}

		String XCH01282 = (String)attributes.get("XCH01282");

		if (XCH01282 != null) {
			setXCH01282(XCH01282);
		}

		String XCH01283 = (String)attributes.get("XCH01283");

		if (XCH01283 != null) {
			setXCH01283(XCH01283);
		}

		String XCH01284 = (String)attributes.get("XCH01284");

		if (XCH01284 != null) {
			setXCH01284(XCH01284);
		}

		String XCH01285 = (String)attributes.get("XCH01285");

		if (XCH01285 != null) {
			setXCH01285(XCH01285);
		}

		String XCH01286 = (String)attributes.get("XCH01286");

		if (XCH01286 != null) {
			setXCH01286(XCH01286);
		}

		String XCH01287 = (String)attributes.get("XCH01287");

		if (XCH01287 != null) {
			setXCH01287(XCH01287);
		}

		String XCH01288 = (String)attributes.get("XCH01288");

		if (XCH01288 != null) {
			setXCH01288(XCH01288);
		}

		String XCH01289 = (String)attributes.get("XCH01289");

		if (XCH01289 != null) {
			setXCH01289(XCH01289);
		}

		String XCH01290 = (String)attributes.get("XCH01290");

		if (XCH01290 != null) {
			setXCH01290(XCH01290);
		}

		String XCH01291 = (String)attributes.get("XCH01291");

		if (XCH01291 != null) {
			setXCH01291(XCH01291);
		}

		String XCH01292 = (String)attributes.get("XCH01292");

		if (XCH01292 != null) {
			setXCH01292(XCH01292);
		}

		String XCH01293 = (String)attributes.get("XCH01293");

		if (XCH01293 != null) {
			setXCH01293(XCH01293);
		}

		String XCH01294 = (String)attributes.get("XCH01294");

		if (XCH01294 != null) {
			setXCH01294(XCH01294);
		}

		String XCH01295 = (String)attributes.get("XCH01295");

		if (XCH01295 != null) {
			setXCH01295(XCH01295);
		}

		String XCH01296 = (String)attributes.get("XCH01296");

		if (XCH01296 != null) {
			setXCH01296(XCH01296);
		}

		String XCH01297 = (String)attributes.get("XCH01297");

		if (XCH01297 != null) {
			setXCH01297(XCH01297);
		}

		String XCH01298 = (String)attributes.get("XCH01298");

		if (XCH01298 != null) {
			setXCH01298(XCH01298);
		}

		String XCH01299 = (String)attributes.get("XCH01299");

		if (XCH01299 != null) {
			setXCH01299(XCH01299);
		}

		String XCH01300 = (String)attributes.get("XCH01300");

		if (XCH01300 != null) {
			setXCH01300(XCH01300);
		}

		String XCH01301 = (String)attributes.get("XCH01301");

		if (XCH01301 != null) {
			setXCH01301(XCH01301);
		}

		String XCH01302 = (String)attributes.get("XCH01302");

		if (XCH01302 != null) {
			setXCH01302(XCH01302);
		}

		String XCH01303 = (String)attributes.get("XCH01303");

		if (XCH01303 != null) {
			setXCH01303(XCH01303);
		}

		String XCH01304 = (String)attributes.get("XCH01304");

		if (XCH01304 != null) {
			setXCH01304(XCH01304);
		}

		String XCH01305 = (String)attributes.get("XCH01305");

		if (XCH01305 != null) {
			setXCH01305(XCH01305);
		}

		String XCH01306 = (String)attributes.get("XCH01306");

		if (XCH01306 != null) {
			setXCH01306(XCH01306);
		}

		String XCH01307 = (String)attributes.get("XCH01307");

		if (XCH01307 != null) {
			setXCH01307(XCH01307);
		}

		String XCH01308 = (String)attributes.get("XCH01308");

		if (XCH01308 != null) {
			setXCH01308(XCH01308);
		}

		String XCH01309 = (String)attributes.get("XCH01309");

		if (XCH01309 != null) {
			setXCH01309(XCH01309);
		}

		String XCH01310 = (String)attributes.get("XCH01310");

		if (XCH01310 != null) {
			setXCH01310(XCH01310);
		}

		String XCH01311 = (String)attributes.get("XCH01311");

		if (XCH01311 != null) {
			setXCH01311(XCH01311);
		}

		String XCH01312 = (String)attributes.get("XCH01312");

		if (XCH01312 != null) {
			setXCH01312(XCH01312);
		}

		String XCH01313 = (String)attributes.get("XCH01313");

		if (XCH01313 != null) {
			setXCH01313(XCH01313);
		}

		String XCH01314 = (String)attributes.get("XCH01314");

		if (XCH01314 != null) {
			setXCH01314(XCH01314);
		}

		String XCH01315 = (String)attributes.get("XCH01315");

		if (XCH01315 != null) {
			setXCH01315(XCH01315);
		}

		String XCH01316 = (String)attributes.get("XCH01316");

		if (XCH01316 != null) {
			setXCH01316(XCH01316);
		}

		String XCH01317 = (String)attributes.get("XCH01317");

		if (XCH01317 != null) {
			setXCH01317(XCH01317);
		}

		String XCH01318 = (String)attributes.get("XCH01318");

		if (XCH01318 != null) {
			setXCH01318(XCH01318);
		}

		String XCH01319 = (String)attributes.get("XCH01319");

		if (XCH01319 != null) {
			setXCH01319(XCH01319);
		}

		String XCH01320 = (String)attributes.get("XCH01320");

		if (XCH01320 != null) {
			setXCH01320(XCH01320);
		}

		String XCH01321 = (String)attributes.get("XCH01321");

		if (XCH01321 != null) {
			setXCH01321(XCH01321);
		}

		String XCH01322 = (String)attributes.get("XCH01322");

		if (XCH01322 != null) {
			setXCH01322(XCH01322);
		}

		String XCH01323 = (String)attributes.get("XCH01323");

		if (XCH01323 != null) {
			setXCH01323(XCH01323);
		}

		String XCH01324 = (String)attributes.get("XCH01324");

		if (XCH01324 != null) {
			setXCH01324(XCH01324);
		}

		String XCH01325 = (String)attributes.get("XCH01325");

		if (XCH01325 != null) {
			setXCH01325(XCH01325);
		}

		String XCH01326 = (String)attributes.get("XCH01326");

		if (XCH01326 != null) {
			setXCH01326(XCH01326);
		}

		String XCH01327 = (String)attributes.get("XCH01327");

		if (XCH01327 != null) {
			setXCH01327(XCH01327);
		}

		String XCH01328 = (String)attributes.get("XCH01328");

		if (XCH01328 != null) {
			setXCH01328(XCH01328);
		}

		String XCH01329 = (String)attributes.get("XCH01329");

		if (XCH01329 != null) {
			setXCH01329(XCH01329);
		}

		String XCH01330 = (String)attributes.get("XCH01330");

		if (XCH01330 != null) {
			setXCH01330(XCH01330);
		}

		String XCH01331 = (String)attributes.get("XCH01331");

		if (XCH01331 != null) {
			setXCH01331(XCH01331);
		}

		String XCH01332 = (String)attributes.get("XCH01332");

		if (XCH01332 != null) {
			setXCH01332(XCH01332);
		}

		String XCH01333 = (String)attributes.get("XCH01333");

		if (XCH01333 != null) {
			setXCH01333(XCH01333);
		}

		String XCH01334 = (String)attributes.get("XCH01334");

		if (XCH01334 != null) {
			setXCH01334(XCH01334);
		}

		String XCH01335 = (String)attributes.get("XCH01335");

		if (XCH01335 != null) {
			setXCH01335(XCH01335);
		}

		String XCH01336 = (String)attributes.get("XCH01336");

		if (XCH01336 != null) {
			setXCH01336(XCH01336);
		}

		String XCH01337 = (String)attributes.get("XCH01337");

		if (XCH01337 != null) {
			setXCH01337(XCH01337);
		}

		String XCH01338 = (String)attributes.get("XCH01338");

		if (XCH01338 != null) {
			setXCH01338(XCH01338);
		}

		String XCH01339 = (String)attributes.get("XCH01339");

		if (XCH01339 != null) {
			setXCH01339(XCH01339);
		}

		String XCH01340 = (String)attributes.get("XCH01340");

		if (XCH01340 != null) {
			setXCH01340(XCH01340);
		}

		String XCH01341 = (String)attributes.get("XCH01341");

		if (XCH01341 != null) {
			setXCH01341(XCH01341);
		}

		String XCH01342 = (String)attributes.get("XCH01342");

		if (XCH01342 != null) {
			setXCH01342(XCH01342);
		}

		String XCH01343 = (String)attributes.get("XCH01343");

		if (XCH01343 != null) {
			setXCH01343(XCH01343);
		}

		String XCH01344 = (String)attributes.get("XCH01344");

		if (XCH01344 != null) {
			setXCH01344(XCH01344);
		}

		String XCH01345 = (String)attributes.get("XCH01345");

		if (XCH01345 != null) {
			setXCH01345(XCH01345);
		}

		String XCH01346 = (String)attributes.get("XCH01346");

		if (XCH01346 != null) {
			setXCH01346(XCH01346);
		}

		String XCH01347 = (String)attributes.get("XCH01347");

		if (XCH01347 != null) {
			setXCH01347(XCH01347);
		}

		String XCH01348 = (String)attributes.get("XCH01348");

		if (XCH01348 != null) {
			setXCH01348(XCH01348);
		}

		String XCH01349 = (String)attributes.get("XCH01349");

		if (XCH01349 != null) {
			setXCH01349(XCH01349);
		}

		String XCH01350 = (String)attributes.get("XCH01350");

		if (XCH01350 != null) {
			setXCH01350(XCH01350);
		}

		String XCH01351 = (String)attributes.get("XCH01351");

		if (XCH01351 != null) {
			setXCH01351(XCH01351);
		}

		String XCH01352 = (String)attributes.get("XCH01352");

		if (XCH01352 != null) {
			setXCH01352(XCH01352);
		}

		String XCH01353 = (String)attributes.get("XCH01353");

		if (XCH01353 != null) {
			setXCH01353(XCH01353);
		}

		String XCH01354 = (String)attributes.get("XCH01354");

		if (XCH01354 != null) {
			setXCH01354(XCH01354);
		}

		String XCH01355 = (String)attributes.get("XCH01355");

		if (XCH01355 != null) {
			setXCH01355(XCH01355);
		}

		String XCH01356 = (String)attributes.get("XCH01356");

		if (XCH01356 != null) {
			setXCH01356(XCH01356);
		}

		String XCH01357 = (String)attributes.get("XCH01357");

		if (XCH01357 != null) {
			setXCH01357(XCH01357);
		}

		String XCH01358 = (String)attributes.get("XCH01358");

		if (XCH01358 != null) {
			setXCH01358(XCH01358);
		}

		String XCH01359 = (String)attributes.get("XCH01359");

		if (XCH01359 != null) {
			setXCH01359(XCH01359);
		}

		String XCH01360 = (String)attributes.get("XCH01360");

		if (XCH01360 != null) {
			setXCH01360(XCH01360);
		}

		String XCH01361 = (String)attributes.get("XCH01361");

		if (XCH01361 != null) {
			setXCH01361(XCH01361);
		}

		String XCH01362 = (String)attributes.get("XCH01362");

		if (XCH01362 != null) {
			setXCH01362(XCH01362);
		}

		String XCH01363 = (String)attributes.get("XCH01363");

		if (XCH01363 != null) {
			setXCH01363(XCH01363);
		}

		String XCH01364 = (String)attributes.get("XCH01364");

		if (XCH01364 != null) {
			setXCH01364(XCH01364);
		}

		String XCH01365 = (String)attributes.get("XCH01365");

		if (XCH01365 != null) {
			setXCH01365(XCH01365);
		}

		String XCH01366 = (String)attributes.get("XCH01366");

		if (XCH01366 != null) {
			setXCH01366(XCH01366);
		}

		String XCH01367 = (String)attributes.get("XCH01367");

		if (XCH01367 != null) {
			setXCH01367(XCH01367);
		}

		String XCH01368 = (String)attributes.get("XCH01368");

		if (XCH01368 != null) {
			setXCH01368(XCH01368);
		}

		String XCH01369 = (String)attributes.get("XCH01369");

		if (XCH01369 != null) {
			setXCH01369(XCH01369);
		}

		String XCH01370 = (String)attributes.get("XCH01370");

		if (XCH01370 != null) {
			setXCH01370(XCH01370);
		}

		String XCH01371 = (String)attributes.get("XCH01371");

		if (XCH01371 != null) {
			setXCH01371(XCH01371);
		}

		String XCH01372 = (String)attributes.get("XCH01372");

		if (XCH01372 != null) {
			setXCH01372(XCH01372);
		}

		String XCH01373 = (String)attributes.get("XCH01373");

		if (XCH01373 != null) {
			setXCH01373(XCH01373);
		}

		String XCH01374 = (String)attributes.get("XCH01374");

		if (XCH01374 != null) {
			setXCH01374(XCH01374);
		}

		String XCH01375 = (String)attributes.get("XCH01375");

		if (XCH01375 != null) {
			setXCH01375(XCH01375);
		}

		String XCH01376 = (String)attributes.get("XCH01376");

		if (XCH01376 != null) {
			setXCH01376(XCH01376);
		}

		String XCH01377 = (String)attributes.get("XCH01377");

		if (XCH01377 != null) {
			setXCH01377(XCH01377);
		}

		String XCH01378 = (String)attributes.get("XCH01378");

		if (XCH01378 != null) {
			setXCH01378(XCH01378);
		}

		String XCH01379 = (String)attributes.get("XCH01379");

		if (XCH01379 != null) {
			setXCH01379(XCH01379);
		}

		String XCH01380 = (String)attributes.get("XCH01380");

		if (XCH01380 != null) {
			setXCH01380(XCH01380);
		}

		String XCH01381 = (String)attributes.get("XCH01381");

		if (XCH01381 != null) {
			setXCH01381(XCH01381);
		}

		String XCH01382 = (String)attributes.get("XCH01382");

		if (XCH01382 != null) {
			setXCH01382(XCH01382);
		}

		String XCH01383 = (String)attributes.get("XCH01383");

		if (XCH01383 != null) {
			setXCH01383(XCH01383);
		}

		String XCH01384 = (String)attributes.get("XCH01384");

		if (XCH01384 != null) {
			setXCH01384(XCH01384);
		}

		String XCH01385 = (String)attributes.get("XCH01385");

		if (XCH01385 != null) {
			setXCH01385(XCH01385);
		}

		String XCH01386 = (String)attributes.get("XCH01386");

		if (XCH01386 != null) {
			setXCH01386(XCH01386);
		}

		String XCH01387 = (String)attributes.get("XCH01387");

		if (XCH01387 != null) {
			setXCH01387(XCH01387);
		}

		String XCH01388 = (String)attributes.get("XCH01388");

		if (XCH01388 != null) {
			setXCH01388(XCH01388);
		}

		String XCH01389 = (String)attributes.get("XCH01389");

		if (XCH01389 != null) {
			setXCH01389(XCH01389);
		}

		String XCH01390 = (String)attributes.get("XCH01390");

		if (XCH01390 != null) {
			setXCH01390(XCH01390);
		}

		String XCH01391 = (String)attributes.get("XCH01391");

		if (XCH01391 != null) {
			setXCH01391(XCH01391);
		}

		String XCH01392 = (String)attributes.get("XCH01392");

		if (XCH01392 != null) {
			setXCH01392(XCH01392);
		}

		String XCH01393 = (String)attributes.get("XCH01393");

		if (XCH01393 != null) {
			setXCH01393(XCH01393);
		}

		String XCH01394 = (String)attributes.get("XCH01394");

		if (XCH01394 != null) {
			setXCH01394(XCH01394);
		}

		String XCH01395 = (String)attributes.get("XCH01395");

		if (XCH01395 != null) {
			setXCH01395(XCH01395);
		}

		String XCH01396 = (String)attributes.get("XCH01396");

		if (XCH01396 != null) {
			setXCH01396(XCH01396);
		}

		String XCH01397 = (String)attributes.get("XCH01397");

		if (XCH01397 != null) {
			setXCH01397(XCH01397);
		}

		String XCH01398 = (String)attributes.get("XCH01398");

		if (XCH01398 != null) {
			setXCH01398(XCH01398);
		}

		String XCH01399 = (String)attributes.get("XCH01399");

		if (XCH01399 != null) {
			setXCH01399(XCH01399);
		}

		String XCH01400 = (String)attributes.get("XCH01400");

		if (XCH01400 != null) {
			setXCH01400(XCH01400);
		}

		String XCH01401 = (String)attributes.get("XCH01401");

		if (XCH01401 != null) {
			setXCH01401(XCH01401);
		}

		String XCH01402 = (String)attributes.get("XCH01402");

		if (XCH01402 != null) {
			setXCH01402(XCH01402);
		}

		String XCH01403 = (String)attributes.get("XCH01403");

		if (XCH01403 != null) {
			setXCH01403(XCH01403);
		}

		String XCH01404 = (String)attributes.get("XCH01404");

		if (XCH01404 != null) {
			setXCH01404(XCH01404);
		}

		String XCH01405 = (String)attributes.get("XCH01405");

		if (XCH01405 != null) {
			setXCH01405(XCH01405);
		}

		String XCH01406 = (String)attributes.get("XCH01406");

		if (XCH01406 != null) {
			setXCH01406(XCH01406);
		}

		String XCH01407 = (String)attributes.get("XCH01407");

		if (XCH01407 != null) {
			setXCH01407(XCH01407);
		}

		String XCH01408 = (String)attributes.get("XCH01408");

		if (XCH01408 != null) {
			setXCH01408(XCH01408);
		}

		String XCH01409 = (String)attributes.get("XCH01409");

		if (XCH01409 != null) {
			setXCH01409(XCH01409);
		}

		String XCH01410 = (String)attributes.get("XCH01410");

		if (XCH01410 != null) {
			setXCH01410(XCH01410);
		}

		String XCH01411 = (String)attributes.get("XCH01411");

		if (XCH01411 != null) {
			setXCH01411(XCH01411);
		}

		String XCH01412 = (String)attributes.get("XCH01412");

		if (XCH01412 != null) {
			setXCH01412(XCH01412);
		}

		String XCH01413 = (String)attributes.get("XCH01413");

		if (XCH01413 != null) {
			setXCH01413(XCH01413);
		}

		String XCH01414 = (String)attributes.get("XCH01414");

		if (XCH01414 != null) {
			setXCH01414(XCH01414);
		}

		String XCH01415 = (String)attributes.get("XCH01415");

		if (XCH01415 != null) {
			setXCH01415(XCH01415);
		}

		String XCH01416 = (String)attributes.get("XCH01416");

		if (XCH01416 != null) {
			setXCH01416(XCH01416);
		}

		String XCH01417 = (String)attributes.get("XCH01417");

		if (XCH01417 != null) {
			setXCH01417(XCH01417);
		}

		String XCH01418 = (String)attributes.get("XCH01418");

		if (XCH01418 != null) {
			setXCH01418(XCH01418);
		}

		String XCH01419 = (String)attributes.get("XCH01419");

		if (XCH01419 != null) {
			setXCH01419(XCH01419);
		}

		String XCH01420 = (String)attributes.get("XCH01420");

		if (XCH01420 != null) {
			setXCH01420(XCH01420);
		}

		String XCH01421 = (String)attributes.get("XCH01421");

		if (XCH01421 != null) {
			setXCH01421(XCH01421);
		}

		String XCH01422 = (String)attributes.get("XCH01422");

		if (XCH01422 != null) {
			setXCH01422(XCH01422);
		}

		String XCH01423 = (String)attributes.get("XCH01423");

		if (XCH01423 != null) {
			setXCH01423(XCH01423);
		}

		String XCH01424 = (String)attributes.get("XCH01424");

		if (XCH01424 != null) {
			setXCH01424(XCH01424);
		}

		String XCH01425 = (String)attributes.get("XCH01425");

		if (XCH01425 != null) {
			setXCH01425(XCH01425);
		}

		String XCH01426 = (String)attributes.get("XCH01426");

		if (XCH01426 != null) {
			setXCH01426(XCH01426);
		}

		String XCH01427 = (String)attributes.get("XCH01427");

		if (XCH01427 != null) {
			setXCH01427(XCH01427);
		}

		String XCH01428 = (String)attributes.get("XCH01428");

		if (XCH01428 != null) {
			setXCH01428(XCH01428);
		}

		String XCH01429 = (String)attributes.get("XCH01429");

		if (XCH01429 != null) {
			setXCH01429(XCH01429);
		}

		String XCH01430 = (String)attributes.get("XCH01430");

		if (XCH01430 != null) {
			setXCH01430(XCH01430);
		}

		String XCH01431 = (String)attributes.get("XCH01431");

		if (XCH01431 != null) {
			setXCH01431(XCH01431);
		}

		String XCH01432 = (String)attributes.get("XCH01432");

		if (XCH01432 != null) {
			setXCH01432(XCH01432);
		}

		String XCH01433 = (String)attributes.get("XCH01433");

		if (XCH01433 != null) {
			setXCH01433(XCH01433);
		}

		String XCH01434 = (String)attributes.get("XCH01434");

		if (XCH01434 != null) {
			setXCH01434(XCH01434);
		}

		String XCH01435 = (String)attributes.get("XCH01435");

		if (XCH01435 != null) {
			setXCH01435(XCH01435);
		}

		String XCH01436 = (String)attributes.get("XCH01436");

		if (XCH01436 != null) {
			setXCH01436(XCH01436);
		}

		String XCH01437 = (String)attributes.get("XCH01437");

		if (XCH01437 != null) {
			setXCH01437(XCH01437);
		}

		String XCH01438 = (String)attributes.get("XCH01438");

		if (XCH01438 != null) {
			setXCH01438(XCH01438);
		}

		String XCH01439 = (String)attributes.get("XCH01439");

		if (XCH01439 != null) {
			setXCH01439(XCH01439);
		}

		String XCH01440 = (String)attributes.get("XCH01440");

		if (XCH01440 != null) {
			setXCH01440(XCH01440);
		}

		String XCH01441 = (String)attributes.get("XCH01441");

		if (XCH01441 != null) {
			setXCH01441(XCH01441);
		}

		String XCH01442 = (String)attributes.get("XCH01442");

		if (XCH01442 != null) {
			setXCH01442(XCH01442);
		}

		String XCH01443 = (String)attributes.get("XCH01443");

		if (XCH01443 != null) {
			setXCH01443(XCH01443);
		}

		String XCH01444 = (String)attributes.get("XCH01444");

		if (XCH01444 != null) {
			setXCH01444(XCH01444);
		}

		String XCH01445 = (String)attributes.get("XCH01445");

		if (XCH01445 != null) {
			setXCH01445(XCH01445);
		}

		String BBCNCLKLXCH001 = (String)attributes.get("BBCNCLKLXCH001");

		if (BBCNCLKLXCH001 != null) {
			setBBCNCLKLXCH001(BBCNCLKLXCH001);
		}

		String BBCNCLKLXCH002 = (String)attributes.get("BBCNCLKLXCH002");

		if (BBCNCLKLXCH002 != null) {
			setBBCNCLKLXCH002(BBCNCLKLXCH002);
		}

		String BBCNCLKLXCH003 = (String)attributes.get("BBCNCLKLXCH003");

		if (BBCNCLKLXCH003 != null) {
			setBBCNCLKLXCH003(BBCNCLKLXCH003);
		}

		String BBCNCLKLXCH004 = (String)attributes.get("BBCNCLKLXCH004");

		if (BBCNCLKLXCH004 != null) {
			setBBCNCLKLXCH004(BBCNCLKLXCH004);
		}

		String BBCNCLKLXCH005 = (String)attributes.get("BBCNCLKLXCH005");

		if (BBCNCLKLXCH005 != null) {
			setBBCNCLKLXCH005(BBCNCLKLXCH005);
		}

		String BBCNCLKLXCH006 = (String)attributes.get("BBCNCLKLXCH006");

		if (BBCNCLKLXCH006 != null) {
			setBBCNCLKLXCH006(BBCNCLKLXCH006);
		}

		String BBCNCLKLXCH012 = (String)attributes.get("BBCNCLKLXCH012");

		if (BBCNCLKLXCH012 != null) {
			setBBCNCLKLXCH012(BBCNCLKLXCH012);
		}

		String BBCNCLKLXCH013 = (String)attributes.get("BBCNCLKLXCH013");

		if (BBCNCLKLXCH013 != null) {
			setBBCNCLKLXCH013(BBCNCLKLXCH013);
		}

		String BBCNCLKLXCH014 = (String)attributes.get("BBCNCLKLXCH014");

		if (BBCNCLKLXCH014 != null) {
			setBBCNCLKLXCH014(BBCNCLKLXCH014);
		}

		String BBCNCLKLXCH015 = (String)attributes.get("BBCNCLKLXCH015");

		if (BBCNCLKLXCH015 != null) {
			setBBCNCLKLXCH015(BBCNCLKLXCH015);
		}

		String BBCNCLKLXCH016 = (String)attributes.get("BBCNCLKLXCH016");

		if (BBCNCLKLXCH016 != null) {
			setBBCNCLKLXCH016(BBCNCLKLXCH016);
		}

		String BBCNCLKLXCH017 = (String)attributes.get("BBCNCLKLXCH017");

		if (BBCNCLKLXCH017 != null) {
			setBBCNCLKLXCH017(BBCNCLKLXCH017);
		}

		String BBCNCLKLXCH018 = (String)attributes.get("BBCNCLKLXCH018");

		if (BBCNCLKLXCH018 != null) {
			setBBCNCLKLXCH018(BBCNCLKLXCH018);
		}

		String BBCNCLKLXCH019 = (String)attributes.get("BBCNCLKLXCH019");

		if (BBCNCLKLXCH019 != null) {
			setBBCNCLKLXCH019(BBCNCLKLXCH019);
		}

		String BBCNCLKLXCH020 = (String)attributes.get("BBCNCLKLXCH020");

		if (BBCNCLKLXCH020 != null) {
			setBBCNCLKLXCH020(BBCNCLKLXCH020);
		}

		String BBCNCLKLXCH021 = (String)attributes.get("BBCNCLKLXCH021");

		if (BBCNCLKLXCH021 != null) {
			setBBCNCLKLXCH021(BBCNCLKLXCH021);
		}

		String BBCNCLKLXCH022 = (String)attributes.get("BBCNCLKLXCH022");

		if (BBCNCLKLXCH022 != null) {
			setBBCNCLKLXCH022(BBCNCLKLXCH022);
		}

		String BBCNCLKLXCH023 = (String)attributes.get("BBCNCLKLXCH023");

		if (BBCNCLKLXCH023 != null) {
			setBBCNCLKLXCH023(BBCNCLKLXCH023);
		}

		String BBCNCLKLXCH026 = (String)attributes.get("BBCNCLKLXCH026");

		if (BBCNCLKLXCH026 != null) {
			setBBCNCLKLXCH026(BBCNCLKLXCH026);
		}

		String BBCNCLKLXCH027 = (String)attributes.get("BBCNCLKLXCH027");

		if (BBCNCLKLXCH027 != null) {
			setBBCNCLKLXCH027(BBCNCLKLXCH027);
		}

		String BBCNCLKLXCH028 = (String)attributes.get("BBCNCLKLXCH028");

		if (BBCNCLKLXCH028 != null) {
			setBBCNCLKLXCH028(BBCNCLKLXCH028);
		}

		String BBCNCLKLXCH033 = (String)attributes.get("BBCNCLKLXCH033");

		if (BBCNCLKLXCH033 != null) {
			setBBCNCLKLXCH033(BBCNCLKLXCH033);
		}

		String BBCNCLKLXCH034 = (String)attributes.get("BBCNCLKLXCH034");

		if (BBCNCLKLXCH034 != null) {
			setBBCNCLKLXCH034(BBCNCLKLXCH034);
		}

		String BBCNCLKLXCH037 = (String)attributes.get("BBCNCLKLXCH037");

		if (BBCNCLKLXCH037 != null) {
			setBBCNCLKLXCH037(BBCNCLKLXCH037);
		}

		String BBCNCLKLXCH038 = (String)attributes.get("BBCNCLKLXCH038");

		if (BBCNCLKLXCH038 != null) {
			setBBCNCLKLXCH038(BBCNCLKLXCH038);
		}

		String BBCNCLKLXCH039 = (String)attributes.get("BBCNCLKLXCH039");

		if (BBCNCLKLXCH039 != null) {
			setBBCNCLKLXCH039(BBCNCLKLXCH039);
		}

		String BBCNCLKLXCH040 = (String)attributes.get("BBCNCLKLXCH040");

		if (BBCNCLKLXCH040 != null) {
			setBBCNCLKLXCH040(BBCNCLKLXCH040);
		}

		String BBCNCLKLXCH041 = (String)attributes.get("BBCNCLKLXCH041");

		if (BBCNCLKLXCH041 != null) {
			setBBCNCLKLXCH041(BBCNCLKLXCH041);
		}

		String BBCNCLKLXCH042 = (String)attributes.get("BBCNCLKLXCH042");

		if (BBCNCLKLXCH042 != null) {
			setBBCNCLKLXCH042(BBCNCLKLXCH042);
		}

		String BBCNCLKLXCH043 = (String)attributes.get("BBCNCLKLXCH043");

		if (BBCNCLKLXCH043 != null) {
			setBBCNCLKLXCH043(BBCNCLKLXCH043);
		}

		String BBCNCLKLXCH044 = (String)attributes.get("BBCNCLKLXCH044");

		if (BBCNCLKLXCH044 != null) {
			setBBCNCLKLXCH044(BBCNCLKLXCH044);
		}

		String BBCNCLKLXCH045 = (String)attributes.get("BBCNCLKLXCH045");

		if (BBCNCLKLXCH045 != null) {
			setBBCNCLKLXCH045(BBCNCLKLXCH045);
		}

		String BBCNCLKLXCH046 = (String)attributes.get("BBCNCLKLXCH046");

		if (BBCNCLKLXCH046 != null) {
			setBBCNCLKLXCH046(BBCNCLKLXCH046);
		}

		String BBCNCLKLXCH047 = (String)attributes.get("BBCNCLKLXCH047");

		if (BBCNCLKLXCH047 != null) {
			setBBCNCLKLXCH047(BBCNCLKLXCH047);
		}

		String BBCNCLKLXCH053 = (String)attributes.get("BBCNCLKLXCH053");

		if (BBCNCLKLXCH053 != null) {
			setBBCNCLKLXCH053(BBCNCLKLXCH053);
		}

		String BBCNCLKLXCH054 = (String)attributes.get("BBCNCLKLXCH054");

		if (BBCNCLKLXCH054 != null) {
			setBBCNCLKLXCH054(BBCNCLKLXCH054);
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
	public VRTechnicalSpec_XCHPart2 toEscapedModel() {
		return new VRTechnicalSpec_XCHPart2Wrapper(_vrTechnicalSpec_XCHPart2.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XCHPart2 toUnescapedModel() {
		return new VRTechnicalSpec_XCHPart2Wrapper(_vrTechnicalSpec_XCHPart2.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XCHPart2.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XCHPart2.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XCHPart2.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XCHPart2.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XCHPart2> toCacheModel() {
		return _vrTechnicalSpec_XCHPart2.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2) {
		return _vrTechnicalSpec_XCHPart2.compareTo(vrTechnicalSpec_XCHPart2);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XCHPart2.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XCHPart2.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XCHPart2Wrapper((VRTechnicalSpec_XCHPart2)_vrTechnicalSpec_XCHPart2.clone());
	}

	/**
	* Returns the bbcnclklxch001 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch001 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH001() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH001();
	}

	/**
	* Returns the bbcnclklxch002 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch002 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH002() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH002();
	}

	/**
	* Returns the bbcnclklxch003 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch003 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH003() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH003();
	}

	/**
	* Returns the bbcnclklxch004 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch004 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH004() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH004();
	}

	/**
	* Returns the bbcnclklxch005 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch005 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH005() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH005();
	}

	/**
	* Returns the bbcnclklxch006 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch006 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH006() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH006();
	}

	/**
	* Returns the bbcnclklxch012 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch012 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH012() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH012();
	}

	/**
	* Returns the bbcnclklxch013 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch013 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH013() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH013();
	}

	/**
	* Returns the bbcnclklxch014 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch014 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH014() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH014();
	}

	/**
	* Returns the bbcnclklxch015 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch015 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH015() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH015();
	}

	/**
	* Returns the bbcnclklxch016 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch016 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH016() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH016();
	}

	/**
	* Returns the bbcnclklxch017 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch017 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH017() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH017();
	}

	/**
	* Returns the bbcnclklxch018 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch018 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH018() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH018();
	}

	/**
	* Returns the bbcnclklxch019 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch019 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH019() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH019();
	}

	/**
	* Returns the bbcnclklxch020 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch020 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH020() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH020();
	}

	/**
	* Returns the bbcnclklxch021 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch021 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH021() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH021();
	}

	/**
	* Returns the bbcnclklxch022 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch022 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH022() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH022();
	}

	/**
	* Returns the bbcnclklxch023 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch023 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH023() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH023();
	}

	/**
	* Returns the bbcnclklxch026 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch026 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH026() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH026();
	}

	/**
	* Returns the bbcnclklxch027 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch027 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH027() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH027();
	}

	/**
	* Returns the bbcnclklxch028 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch028 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH028() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH028();
	}

	/**
	* Returns the bbcnclklxch033 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch033 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH033() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH033();
	}

	/**
	* Returns the bbcnclklxch034 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch034 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH034() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH034();
	}

	/**
	* Returns the bbcnclklxch037 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch037 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH037() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH037();
	}

	/**
	* Returns the bbcnclklxch038 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch038 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH038() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH038();
	}

	/**
	* Returns the bbcnclklxch039 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch039 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH039() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH039();
	}

	/**
	* Returns the bbcnclklxch040 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch040 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH040() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH040();
	}

	/**
	* Returns the bbcnclklxch041 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch041 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH041() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH041();
	}

	/**
	* Returns the bbcnclklxch042 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch042 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH042() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH042();
	}

	/**
	* Returns the bbcnclklxch043 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch043 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH043() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH043();
	}

	/**
	* Returns the bbcnclklxch044 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch044 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH044() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH044();
	}

	/**
	* Returns the bbcnclklxch045 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch045 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH045() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH045();
	}

	/**
	* Returns the bbcnclklxch046 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch046 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH046() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH046();
	}

	/**
	* Returns the bbcnclklxch047 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch047 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH047() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH047();
	}

	/**
	* Returns the bbcnclklxch053 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch053 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH053() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH053();
	}

	/**
	* Returns the bbcnclklxch054 of this vr technical spec_xch part2.
	*
	* @return the bbcnclklxch054 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getBBCNCLKLXCH054() {
		return _vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH054();
	}

	/**
	* Returns the deliverable code of this vr technical spec_xch part2.
	*
	* @return the deliverable code of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XCHPart2.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xch part2.
	*
	* @return the dossier ID ctn of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XCHPart2.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xch part2.
	*
	* @return the dossier no of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XCHPart2.getDossierNo();
	}

	/**
	* Returns the reference uid of this vr technical spec_xch part2.
	*
	* @return the reference uid of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XCHPart2.getReferenceUid();
	}

	/**
	* Returns the xch01273 of this vr technical spec_xch part2.
	*
	* @return the xch01273 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01273() {
		return _vrTechnicalSpec_XCHPart2.getXCH01273();
	}

	/**
	* Returns the xch01274 of this vr technical spec_xch part2.
	*
	* @return the xch01274 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01274() {
		return _vrTechnicalSpec_XCHPart2.getXCH01274();
	}

	/**
	* Returns the xch01275 of this vr technical spec_xch part2.
	*
	* @return the xch01275 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01275() {
		return _vrTechnicalSpec_XCHPart2.getXCH01275();
	}

	/**
	* Returns the xch01276 of this vr technical spec_xch part2.
	*
	* @return the xch01276 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01276() {
		return _vrTechnicalSpec_XCHPart2.getXCH01276();
	}

	/**
	* Returns the xch01277 of this vr technical spec_xch part2.
	*
	* @return the xch01277 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01277() {
		return _vrTechnicalSpec_XCHPart2.getXCH01277();
	}

	/**
	* Returns the xch01278 of this vr technical spec_xch part2.
	*
	* @return the xch01278 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01278() {
		return _vrTechnicalSpec_XCHPart2.getXCH01278();
	}

	/**
	* Returns the xch01279 of this vr technical spec_xch part2.
	*
	* @return the xch01279 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01279() {
		return _vrTechnicalSpec_XCHPart2.getXCH01279();
	}

	/**
	* Returns the xch01280 of this vr technical spec_xch part2.
	*
	* @return the xch01280 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01280() {
		return _vrTechnicalSpec_XCHPart2.getXCH01280();
	}

	/**
	* Returns the xch01281 of this vr technical spec_xch part2.
	*
	* @return the xch01281 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01281() {
		return _vrTechnicalSpec_XCHPart2.getXCH01281();
	}

	/**
	* Returns the xch01282 of this vr technical spec_xch part2.
	*
	* @return the xch01282 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01282() {
		return _vrTechnicalSpec_XCHPart2.getXCH01282();
	}

	/**
	* Returns the xch01283 of this vr technical spec_xch part2.
	*
	* @return the xch01283 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01283() {
		return _vrTechnicalSpec_XCHPart2.getXCH01283();
	}

	/**
	* Returns the xch01284 of this vr technical spec_xch part2.
	*
	* @return the xch01284 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01284() {
		return _vrTechnicalSpec_XCHPart2.getXCH01284();
	}

	/**
	* Returns the xch01285 of this vr technical spec_xch part2.
	*
	* @return the xch01285 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01285() {
		return _vrTechnicalSpec_XCHPart2.getXCH01285();
	}

	/**
	* Returns the xch01286 of this vr technical spec_xch part2.
	*
	* @return the xch01286 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01286() {
		return _vrTechnicalSpec_XCHPart2.getXCH01286();
	}

	/**
	* Returns the xch01287 of this vr technical spec_xch part2.
	*
	* @return the xch01287 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01287() {
		return _vrTechnicalSpec_XCHPart2.getXCH01287();
	}

	/**
	* Returns the xch01288 of this vr technical spec_xch part2.
	*
	* @return the xch01288 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01288() {
		return _vrTechnicalSpec_XCHPart2.getXCH01288();
	}

	/**
	* Returns the xch01289 of this vr technical spec_xch part2.
	*
	* @return the xch01289 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01289() {
		return _vrTechnicalSpec_XCHPart2.getXCH01289();
	}

	/**
	* Returns the xch01290 of this vr technical spec_xch part2.
	*
	* @return the xch01290 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01290() {
		return _vrTechnicalSpec_XCHPart2.getXCH01290();
	}

	/**
	* Returns the xch01291 of this vr technical spec_xch part2.
	*
	* @return the xch01291 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01291() {
		return _vrTechnicalSpec_XCHPart2.getXCH01291();
	}

	/**
	* Returns the xch01292 of this vr technical spec_xch part2.
	*
	* @return the xch01292 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01292() {
		return _vrTechnicalSpec_XCHPart2.getXCH01292();
	}

	/**
	* Returns the xch01293 of this vr technical spec_xch part2.
	*
	* @return the xch01293 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01293() {
		return _vrTechnicalSpec_XCHPart2.getXCH01293();
	}

	/**
	* Returns the xch01294 of this vr technical spec_xch part2.
	*
	* @return the xch01294 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01294() {
		return _vrTechnicalSpec_XCHPart2.getXCH01294();
	}

	/**
	* Returns the xch01295 of this vr technical spec_xch part2.
	*
	* @return the xch01295 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01295() {
		return _vrTechnicalSpec_XCHPart2.getXCH01295();
	}

	/**
	* Returns the xch01296 of this vr technical spec_xch part2.
	*
	* @return the xch01296 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01296() {
		return _vrTechnicalSpec_XCHPart2.getXCH01296();
	}

	/**
	* Returns the xch01297 of this vr technical spec_xch part2.
	*
	* @return the xch01297 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01297() {
		return _vrTechnicalSpec_XCHPart2.getXCH01297();
	}

	/**
	* Returns the xch01298 of this vr technical spec_xch part2.
	*
	* @return the xch01298 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01298() {
		return _vrTechnicalSpec_XCHPart2.getXCH01298();
	}

	/**
	* Returns the xch01299 of this vr technical spec_xch part2.
	*
	* @return the xch01299 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01299() {
		return _vrTechnicalSpec_XCHPart2.getXCH01299();
	}

	/**
	* Returns the xch01300 of this vr technical spec_xch part2.
	*
	* @return the xch01300 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01300() {
		return _vrTechnicalSpec_XCHPart2.getXCH01300();
	}

	/**
	* Returns the xch01301 of this vr technical spec_xch part2.
	*
	* @return the xch01301 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01301() {
		return _vrTechnicalSpec_XCHPart2.getXCH01301();
	}

	/**
	* Returns the xch01302 of this vr technical spec_xch part2.
	*
	* @return the xch01302 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01302() {
		return _vrTechnicalSpec_XCHPart2.getXCH01302();
	}

	/**
	* Returns the xch01303 of this vr technical spec_xch part2.
	*
	* @return the xch01303 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01303() {
		return _vrTechnicalSpec_XCHPart2.getXCH01303();
	}

	/**
	* Returns the xch01304 of this vr technical spec_xch part2.
	*
	* @return the xch01304 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01304() {
		return _vrTechnicalSpec_XCHPart2.getXCH01304();
	}

	/**
	* Returns the xch01305 of this vr technical spec_xch part2.
	*
	* @return the xch01305 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01305() {
		return _vrTechnicalSpec_XCHPart2.getXCH01305();
	}

	/**
	* Returns the xch01306 of this vr technical spec_xch part2.
	*
	* @return the xch01306 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01306() {
		return _vrTechnicalSpec_XCHPart2.getXCH01306();
	}

	/**
	* Returns the xch01307 of this vr technical spec_xch part2.
	*
	* @return the xch01307 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01307() {
		return _vrTechnicalSpec_XCHPart2.getXCH01307();
	}

	/**
	* Returns the xch01308 of this vr technical spec_xch part2.
	*
	* @return the xch01308 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01308() {
		return _vrTechnicalSpec_XCHPart2.getXCH01308();
	}

	/**
	* Returns the xch01309 of this vr technical spec_xch part2.
	*
	* @return the xch01309 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01309() {
		return _vrTechnicalSpec_XCHPart2.getXCH01309();
	}

	/**
	* Returns the xch01310 of this vr technical spec_xch part2.
	*
	* @return the xch01310 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01310() {
		return _vrTechnicalSpec_XCHPart2.getXCH01310();
	}

	/**
	* Returns the xch01311 of this vr technical spec_xch part2.
	*
	* @return the xch01311 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01311() {
		return _vrTechnicalSpec_XCHPart2.getXCH01311();
	}

	/**
	* Returns the xch01312 of this vr technical spec_xch part2.
	*
	* @return the xch01312 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01312() {
		return _vrTechnicalSpec_XCHPart2.getXCH01312();
	}

	/**
	* Returns the xch01313 of this vr technical spec_xch part2.
	*
	* @return the xch01313 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01313() {
		return _vrTechnicalSpec_XCHPart2.getXCH01313();
	}

	/**
	* Returns the xch01314 of this vr technical spec_xch part2.
	*
	* @return the xch01314 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01314() {
		return _vrTechnicalSpec_XCHPart2.getXCH01314();
	}

	/**
	* Returns the xch01315 of this vr technical spec_xch part2.
	*
	* @return the xch01315 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01315() {
		return _vrTechnicalSpec_XCHPart2.getXCH01315();
	}

	/**
	* Returns the xch01316 of this vr technical spec_xch part2.
	*
	* @return the xch01316 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01316() {
		return _vrTechnicalSpec_XCHPart2.getXCH01316();
	}

	/**
	* Returns the xch01317 of this vr technical spec_xch part2.
	*
	* @return the xch01317 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01317() {
		return _vrTechnicalSpec_XCHPart2.getXCH01317();
	}

	/**
	* Returns the xch01318 of this vr technical spec_xch part2.
	*
	* @return the xch01318 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01318() {
		return _vrTechnicalSpec_XCHPart2.getXCH01318();
	}

	/**
	* Returns the xch01319 of this vr technical spec_xch part2.
	*
	* @return the xch01319 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01319() {
		return _vrTechnicalSpec_XCHPart2.getXCH01319();
	}

	/**
	* Returns the xch01320 of this vr technical spec_xch part2.
	*
	* @return the xch01320 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01320() {
		return _vrTechnicalSpec_XCHPart2.getXCH01320();
	}

	/**
	* Returns the xch01321 of this vr technical spec_xch part2.
	*
	* @return the xch01321 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01321() {
		return _vrTechnicalSpec_XCHPart2.getXCH01321();
	}

	/**
	* Returns the xch01322 of this vr technical spec_xch part2.
	*
	* @return the xch01322 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01322() {
		return _vrTechnicalSpec_XCHPart2.getXCH01322();
	}

	/**
	* Returns the xch01323 of this vr technical spec_xch part2.
	*
	* @return the xch01323 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01323() {
		return _vrTechnicalSpec_XCHPart2.getXCH01323();
	}

	/**
	* Returns the xch01324 of this vr technical spec_xch part2.
	*
	* @return the xch01324 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01324() {
		return _vrTechnicalSpec_XCHPart2.getXCH01324();
	}

	/**
	* Returns the xch01325 of this vr technical spec_xch part2.
	*
	* @return the xch01325 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01325() {
		return _vrTechnicalSpec_XCHPart2.getXCH01325();
	}

	/**
	* Returns the xch01326 of this vr technical spec_xch part2.
	*
	* @return the xch01326 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01326() {
		return _vrTechnicalSpec_XCHPart2.getXCH01326();
	}

	/**
	* Returns the xch01327 of this vr technical spec_xch part2.
	*
	* @return the xch01327 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01327() {
		return _vrTechnicalSpec_XCHPart2.getXCH01327();
	}

	/**
	* Returns the xch01328 of this vr technical spec_xch part2.
	*
	* @return the xch01328 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01328() {
		return _vrTechnicalSpec_XCHPart2.getXCH01328();
	}

	/**
	* Returns the xch01329 of this vr technical spec_xch part2.
	*
	* @return the xch01329 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01329() {
		return _vrTechnicalSpec_XCHPart2.getXCH01329();
	}

	/**
	* Returns the xch01330 of this vr technical spec_xch part2.
	*
	* @return the xch01330 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01330() {
		return _vrTechnicalSpec_XCHPart2.getXCH01330();
	}

	/**
	* Returns the xch01331 of this vr technical spec_xch part2.
	*
	* @return the xch01331 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01331() {
		return _vrTechnicalSpec_XCHPart2.getXCH01331();
	}

	/**
	* Returns the xch01332 of this vr technical spec_xch part2.
	*
	* @return the xch01332 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01332() {
		return _vrTechnicalSpec_XCHPart2.getXCH01332();
	}

	/**
	* Returns the xch01333 of this vr technical spec_xch part2.
	*
	* @return the xch01333 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01333() {
		return _vrTechnicalSpec_XCHPart2.getXCH01333();
	}

	/**
	* Returns the xch01334 of this vr technical spec_xch part2.
	*
	* @return the xch01334 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01334() {
		return _vrTechnicalSpec_XCHPart2.getXCH01334();
	}

	/**
	* Returns the xch01335 of this vr technical spec_xch part2.
	*
	* @return the xch01335 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01335() {
		return _vrTechnicalSpec_XCHPart2.getXCH01335();
	}

	/**
	* Returns the xch01336 of this vr technical spec_xch part2.
	*
	* @return the xch01336 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01336() {
		return _vrTechnicalSpec_XCHPart2.getXCH01336();
	}

	/**
	* Returns the xch01337 of this vr technical spec_xch part2.
	*
	* @return the xch01337 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01337() {
		return _vrTechnicalSpec_XCHPart2.getXCH01337();
	}

	/**
	* Returns the xch01338 of this vr technical spec_xch part2.
	*
	* @return the xch01338 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01338() {
		return _vrTechnicalSpec_XCHPart2.getXCH01338();
	}

	/**
	* Returns the xch01339 of this vr technical spec_xch part2.
	*
	* @return the xch01339 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01339() {
		return _vrTechnicalSpec_XCHPart2.getXCH01339();
	}

	/**
	* Returns the xch01340 of this vr technical spec_xch part2.
	*
	* @return the xch01340 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01340() {
		return _vrTechnicalSpec_XCHPart2.getXCH01340();
	}

	/**
	* Returns the xch01341 of this vr technical spec_xch part2.
	*
	* @return the xch01341 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01341() {
		return _vrTechnicalSpec_XCHPart2.getXCH01341();
	}

	/**
	* Returns the xch01342 of this vr technical spec_xch part2.
	*
	* @return the xch01342 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01342() {
		return _vrTechnicalSpec_XCHPart2.getXCH01342();
	}

	/**
	* Returns the xch01343 of this vr technical spec_xch part2.
	*
	* @return the xch01343 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01343() {
		return _vrTechnicalSpec_XCHPart2.getXCH01343();
	}

	/**
	* Returns the xch01344 of this vr technical spec_xch part2.
	*
	* @return the xch01344 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01344() {
		return _vrTechnicalSpec_XCHPart2.getXCH01344();
	}

	/**
	* Returns the xch01345 of this vr technical spec_xch part2.
	*
	* @return the xch01345 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01345() {
		return _vrTechnicalSpec_XCHPart2.getXCH01345();
	}

	/**
	* Returns the xch01346 of this vr technical spec_xch part2.
	*
	* @return the xch01346 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01346() {
		return _vrTechnicalSpec_XCHPart2.getXCH01346();
	}

	/**
	* Returns the xch01347 of this vr technical spec_xch part2.
	*
	* @return the xch01347 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01347() {
		return _vrTechnicalSpec_XCHPart2.getXCH01347();
	}

	/**
	* Returns the xch01348 of this vr technical spec_xch part2.
	*
	* @return the xch01348 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01348() {
		return _vrTechnicalSpec_XCHPart2.getXCH01348();
	}

	/**
	* Returns the xch01349 of this vr technical spec_xch part2.
	*
	* @return the xch01349 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01349() {
		return _vrTechnicalSpec_XCHPart2.getXCH01349();
	}

	/**
	* Returns the xch01350 of this vr technical spec_xch part2.
	*
	* @return the xch01350 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01350() {
		return _vrTechnicalSpec_XCHPart2.getXCH01350();
	}

	/**
	* Returns the xch01351 of this vr technical spec_xch part2.
	*
	* @return the xch01351 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01351() {
		return _vrTechnicalSpec_XCHPart2.getXCH01351();
	}

	/**
	* Returns the xch01352 of this vr technical spec_xch part2.
	*
	* @return the xch01352 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01352() {
		return _vrTechnicalSpec_XCHPart2.getXCH01352();
	}

	/**
	* Returns the xch01353 of this vr technical spec_xch part2.
	*
	* @return the xch01353 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01353() {
		return _vrTechnicalSpec_XCHPart2.getXCH01353();
	}

	/**
	* Returns the xch01354 of this vr technical spec_xch part2.
	*
	* @return the xch01354 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01354() {
		return _vrTechnicalSpec_XCHPart2.getXCH01354();
	}

	/**
	* Returns the xch01355 of this vr technical spec_xch part2.
	*
	* @return the xch01355 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01355() {
		return _vrTechnicalSpec_XCHPart2.getXCH01355();
	}

	/**
	* Returns the xch01356 of this vr technical spec_xch part2.
	*
	* @return the xch01356 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01356() {
		return _vrTechnicalSpec_XCHPart2.getXCH01356();
	}

	/**
	* Returns the xch01357 of this vr technical spec_xch part2.
	*
	* @return the xch01357 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01357() {
		return _vrTechnicalSpec_XCHPart2.getXCH01357();
	}

	/**
	* Returns the xch01358 of this vr technical spec_xch part2.
	*
	* @return the xch01358 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01358() {
		return _vrTechnicalSpec_XCHPart2.getXCH01358();
	}

	/**
	* Returns the xch01359 of this vr technical spec_xch part2.
	*
	* @return the xch01359 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01359() {
		return _vrTechnicalSpec_XCHPart2.getXCH01359();
	}

	/**
	* Returns the xch01360 of this vr technical spec_xch part2.
	*
	* @return the xch01360 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01360() {
		return _vrTechnicalSpec_XCHPart2.getXCH01360();
	}

	/**
	* Returns the xch01361 of this vr technical spec_xch part2.
	*
	* @return the xch01361 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01361() {
		return _vrTechnicalSpec_XCHPart2.getXCH01361();
	}

	/**
	* Returns the xch01362 of this vr technical spec_xch part2.
	*
	* @return the xch01362 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01362() {
		return _vrTechnicalSpec_XCHPart2.getXCH01362();
	}

	/**
	* Returns the xch01363 of this vr technical spec_xch part2.
	*
	* @return the xch01363 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01363() {
		return _vrTechnicalSpec_XCHPart2.getXCH01363();
	}

	/**
	* Returns the xch01364 of this vr technical spec_xch part2.
	*
	* @return the xch01364 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01364() {
		return _vrTechnicalSpec_XCHPart2.getXCH01364();
	}

	/**
	* Returns the xch01365 of this vr technical spec_xch part2.
	*
	* @return the xch01365 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01365() {
		return _vrTechnicalSpec_XCHPart2.getXCH01365();
	}

	/**
	* Returns the xch01366 of this vr technical spec_xch part2.
	*
	* @return the xch01366 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01366() {
		return _vrTechnicalSpec_XCHPart2.getXCH01366();
	}

	/**
	* Returns the xch01367 of this vr technical spec_xch part2.
	*
	* @return the xch01367 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01367() {
		return _vrTechnicalSpec_XCHPart2.getXCH01367();
	}

	/**
	* Returns the xch01368 of this vr technical spec_xch part2.
	*
	* @return the xch01368 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01368() {
		return _vrTechnicalSpec_XCHPart2.getXCH01368();
	}

	/**
	* Returns the xch01369 of this vr technical spec_xch part2.
	*
	* @return the xch01369 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01369() {
		return _vrTechnicalSpec_XCHPart2.getXCH01369();
	}

	/**
	* Returns the xch01370 of this vr technical spec_xch part2.
	*
	* @return the xch01370 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01370() {
		return _vrTechnicalSpec_XCHPart2.getXCH01370();
	}

	/**
	* Returns the xch01371 of this vr technical spec_xch part2.
	*
	* @return the xch01371 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01371() {
		return _vrTechnicalSpec_XCHPart2.getXCH01371();
	}

	/**
	* Returns the xch01372 of this vr technical spec_xch part2.
	*
	* @return the xch01372 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01372() {
		return _vrTechnicalSpec_XCHPart2.getXCH01372();
	}

	/**
	* Returns the xch01373 of this vr technical spec_xch part2.
	*
	* @return the xch01373 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01373() {
		return _vrTechnicalSpec_XCHPart2.getXCH01373();
	}

	/**
	* Returns the xch01374 of this vr technical spec_xch part2.
	*
	* @return the xch01374 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01374() {
		return _vrTechnicalSpec_XCHPart2.getXCH01374();
	}

	/**
	* Returns the xch01375 of this vr technical spec_xch part2.
	*
	* @return the xch01375 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01375() {
		return _vrTechnicalSpec_XCHPart2.getXCH01375();
	}

	/**
	* Returns the xch01376 of this vr technical spec_xch part2.
	*
	* @return the xch01376 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01376() {
		return _vrTechnicalSpec_XCHPart2.getXCH01376();
	}

	/**
	* Returns the xch01377 of this vr technical spec_xch part2.
	*
	* @return the xch01377 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01377() {
		return _vrTechnicalSpec_XCHPart2.getXCH01377();
	}

	/**
	* Returns the xch01378 of this vr technical spec_xch part2.
	*
	* @return the xch01378 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01378() {
		return _vrTechnicalSpec_XCHPart2.getXCH01378();
	}

	/**
	* Returns the xch01379 of this vr technical spec_xch part2.
	*
	* @return the xch01379 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01379() {
		return _vrTechnicalSpec_XCHPart2.getXCH01379();
	}

	/**
	* Returns the xch01380 of this vr technical spec_xch part2.
	*
	* @return the xch01380 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01380() {
		return _vrTechnicalSpec_XCHPart2.getXCH01380();
	}

	/**
	* Returns the xch01381 of this vr technical spec_xch part2.
	*
	* @return the xch01381 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01381() {
		return _vrTechnicalSpec_XCHPart2.getXCH01381();
	}

	/**
	* Returns the xch01382 of this vr technical spec_xch part2.
	*
	* @return the xch01382 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01382() {
		return _vrTechnicalSpec_XCHPart2.getXCH01382();
	}

	/**
	* Returns the xch01383 of this vr technical spec_xch part2.
	*
	* @return the xch01383 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01383() {
		return _vrTechnicalSpec_XCHPart2.getXCH01383();
	}

	/**
	* Returns the xch01384 of this vr technical spec_xch part2.
	*
	* @return the xch01384 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01384() {
		return _vrTechnicalSpec_XCHPart2.getXCH01384();
	}

	/**
	* Returns the xch01385 of this vr technical spec_xch part2.
	*
	* @return the xch01385 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01385() {
		return _vrTechnicalSpec_XCHPart2.getXCH01385();
	}

	/**
	* Returns the xch01386 of this vr technical spec_xch part2.
	*
	* @return the xch01386 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01386() {
		return _vrTechnicalSpec_XCHPart2.getXCH01386();
	}

	/**
	* Returns the xch01387 of this vr technical spec_xch part2.
	*
	* @return the xch01387 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01387() {
		return _vrTechnicalSpec_XCHPart2.getXCH01387();
	}

	/**
	* Returns the xch01388 of this vr technical spec_xch part2.
	*
	* @return the xch01388 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01388() {
		return _vrTechnicalSpec_XCHPart2.getXCH01388();
	}

	/**
	* Returns the xch01389 of this vr technical spec_xch part2.
	*
	* @return the xch01389 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01389() {
		return _vrTechnicalSpec_XCHPart2.getXCH01389();
	}

	/**
	* Returns the xch01390 of this vr technical spec_xch part2.
	*
	* @return the xch01390 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01390() {
		return _vrTechnicalSpec_XCHPart2.getXCH01390();
	}

	/**
	* Returns the xch01391 of this vr technical spec_xch part2.
	*
	* @return the xch01391 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01391() {
		return _vrTechnicalSpec_XCHPart2.getXCH01391();
	}

	/**
	* Returns the xch01392 of this vr technical spec_xch part2.
	*
	* @return the xch01392 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01392() {
		return _vrTechnicalSpec_XCHPart2.getXCH01392();
	}

	/**
	* Returns the xch01393 of this vr technical spec_xch part2.
	*
	* @return the xch01393 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01393() {
		return _vrTechnicalSpec_XCHPart2.getXCH01393();
	}

	/**
	* Returns the xch01394 of this vr technical spec_xch part2.
	*
	* @return the xch01394 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01394() {
		return _vrTechnicalSpec_XCHPart2.getXCH01394();
	}

	/**
	* Returns the xch01395 of this vr technical spec_xch part2.
	*
	* @return the xch01395 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01395() {
		return _vrTechnicalSpec_XCHPart2.getXCH01395();
	}

	/**
	* Returns the xch01396 of this vr technical spec_xch part2.
	*
	* @return the xch01396 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01396() {
		return _vrTechnicalSpec_XCHPart2.getXCH01396();
	}

	/**
	* Returns the xch01397 of this vr technical spec_xch part2.
	*
	* @return the xch01397 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01397() {
		return _vrTechnicalSpec_XCHPart2.getXCH01397();
	}

	/**
	* Returns the xch01398 of this vr technical spec_xch part2.
	*
	* @return the xch01398 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01398() {
		return _vrTechnicalSpec_XCHPart2.getXCH01398();
	}

	/**
	* Returns the xch01399 of this vr technical spec_xch part2.
	*
	* @return the xch01399 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01399() {
		return _vrTechnicalSpec_XCHPart2.getXCH01399();
	}

	/**
	* Returns the xch01400 of this vr technical spec_xch part2.
	*
	* @return the xch01400 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01400() {
		return _vrTechnicalSpec_XCHPart2.getXCH01400();
	}

	/**
	* Returns the xch01401 of this vr technical spec_xch part2.
	*
	* @return the xch01401 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01401() {
		return _vrTechnicalSpec_XCHPart2.getXCH01401();
	}

	/**
	* Returns the xch01402 of this vr technical spec_xch part2.
	*
	* @return the xch01402 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01402() {
		return _vrTechnicalSpec_XCHPart2.getXCH01402();
	}

	/**
	* Returns the xch01403 of this vr technical spec_xch part2.
	*
	* @return the xch01403 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01403() {
		return _vrTechnicalSpec_XCHPart2.getXCH01403();
	}

	/**
	* Returns the xch01404 of this vr technical spec_xch part2.
	*
	* @return the xch01404 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01404() {
		return _vrTechnicalSpec_XCHPart2.getXCH01404();
	}

	/**
	* Returns the xch01405 of this vr technical spec_xch part2.
	*
	* @return the xch01405 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01405() {
		return _vrTechnicalSpec_XCHPart2.getXCH01405();
	}

	/**
	* Returns the xch01406 of this vr technical spec_xch part2.
	*
	* @return the xch01406 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01406() {
		return _vrTechnicalSpec_XCHPart2.getXCH01406();
	}

	/**
	* Returns the xch01407 of this vr technical spec_xch part2.
	*
	* @return the xch01407 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01407() {
		return _vrTechnicalSpec_XCHPart2.getXCH01407();
	}

	/**
	* Returns the xch01408 of this vr technical spec_xch part2.
	*
	* @return the xch01408 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01408() {
		return _vrTechnicalSpec_XCHPart2.getXCH01408();
	}

	/**
	* Returns the xch01409 of this vr technical spec_xch part2.
	*
	* @return the xch01409 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01409() {
		return _vrTechnicalSpec_XCHPart2.getXCH01409();
	}

	/**
	* Returns the xch01410 of this vr technical spec_xch part2.
	*
	* @return the xch01410 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01410() {
		return _vrTechnicalSpec_XCHPart2.getXCH01410();
	}

	/**
	* Returns the xch01411 of this vr technical spec_xch part2.
	*
	* @return the xch01411 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01411() {
		return _vrTechnicalSpec_XCHPart2.getXCH01411();
	}

	/**
	* Returns the xch01412 of this vr technical spec_xch part2.
	*
	* @return the xch01412 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01412() {
		return _vrTechnicalSpec_XCHPart2.getXCH01412();
	}

	/**
	* Returns the xch01413 of this vr technical spec_xch part2.
	*
	* @return the xch01413 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01413() {
		return _vrTechnicalSpec_XCHPart2.getXCH01413();
	}

	/**
	* Returns the xch01414 of this vr technical spec_xch part2.
	*
	* @return the xch01414 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01414() {
		return _vrTechnicalSpec_XCHPart2.getXCH01414();
	}

	/**
	* Returns the xch01415 of this vr technical spec_xch part2.
	*
	* @return the xch01415 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01415() {
		return _vrTechnicalSpec_XCHPart2.getXCH01415();
	}

	/**
	* Returns the xch01416 of this vr technical spec_xch part2.
	*
	* @return the xch01416 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01416() {
		return _vrTechnicalSpec_XCHPart2.getXCH01416();
	}

	/**
	* Returns the xch01417 of this vr technical spec_xch part2.
	*
	* @return the xch01417 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01417() {
		return _vrTechnicalSpec_XCHPart2.getXCH01417();
	}

	/**
	* Returns the xch01418 of this vr technical spec_xch part2.
	*
	* @return the xch01418 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01418() {
		return _vrTechnicalSpec_XCHPart2.getXCH01418();
	}

	/**
	* Returns the xch01419 of this vr technical spec_xch part2.
	*
	* @return the xch01419 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01419() {
		return _vrTechnicalSpec_XCHPart2.getXCH01419();
	}

	/**
	* Returns the xch01420 of this vr technical spec_xch part2.
	*
	* @return the xch01420 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01420() {
		return _vrTechnicalSpec_XCHPart2.getXCH01420();
	}

	/**
	* Returns the xch01421 of this vr technical spec_xch part2.
	*
	* @return the xch01421 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01421() {
		return _vrTechnicalSpec_XCHPart2.getXCH01421();
	}

	/**
	* Returns the xch01422 of this vr technical spec_xch part2.
	*
	* @return the xch01422 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01422() {
		return _vrTechnicalSpec_XCHPart2.getXCH01422();
	}

	/**
	* Returns the xch01423 of this vr technical spec_xch part2.
	*
	* @return the xch01423 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01423() {
		return _vrTechnicalSpec_XCHPart2.getXCH01423();
	}

	/**
	* Returns the xch01424 of this vr technical spec_xch part2.
	*
	* @return the xch01424 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01424() {
		return _vrTechnicalSpec_XCHPart2.getXCH01424();
	}

	/**
	* Returns the xch01425 of this vr technical spec_xch part2.
	*
	* @return the xch01425 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01425() {
		return _vrTechnicalSpec_XCHPart2.getXCH01425();
	}

	/**
	* Returns the xch01426 of this vr technical spec_xch part2.
	*
	* @return the xch01426 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01426() {
		return _vrTechnicalSpec_XCHPart2.getXCH01426();
	}

	/**
	* Returns the xch01427 of this vr technical spec_xch part2.
	*
	* @return the xch01427 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01427() {
		return _vrTechnicalSpec_XCHPart2.getXCH01427();
	}

	/**
	* Returns the xch01428 of this vr technical spec_xch part2.
	*
	* @return the xch01428 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01428() {
		return _vrTechnicalSpec_XCHPart2.getXCH01428();
	}

	/**
	* Returns the xch01429 of this vr technical spec_xch part2.
	*
	* @return the xch01429 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01429() {
		return _vrTechnicalSpec_XCHPart2.getXCH01429();
	}

	/**
	* Returns the xch01430 of this vr technical spec_xch part2.
	*
	* @return the xch01430 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01430() {
		return _vrTechnicalSpec_XCHPart2.getXCH01430();
	}

	/**
	* Returns the xch01431 of this vr technical spec_xch part2.
	*
	* @return the xch01431 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01431() {
		return _vrTechnicalSpec_XCHPart2.getXCH01431();
	}

	/**
	* Returns the xch01432 of this vr technical spec_xch part2.
	*
	* @return the xch01432 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01432() {
		return _vrTechnicalSpec_XCHPart2.getXCH01432();
	}

	/**
	* Returns the xch01433 of this vr technical spec_xch part2.
	*
	* @return the xch01433 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01433() {
		return _vrTechnicalSpec_XCHPart2.getXCH01433();
	}

	/**
	* Returns the xch01434 of this vr technical spec_xch part2.
	*
	* @return the xch01434 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01434() {
		return _vrTechnicalSpec_XCHPart2.getXCH01434();
	}

	/**
	* Returns the xch01435 of this vr technical spec_xch part2.
	*
	* @return the xch01435 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01435() {
		return _vrTechnicalSpec_XCHPart2.getXCH01435();
	}

	/**
	* Returns the xch01436 of this vr technical spec_xch part2.
	*
	* @return the xch01436 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01436() {
		return _vrTechnicalSpec_XCHPart2.getXCH01436();
	}

	/**
	* Returns the xch01437 of this vr technical spec_xch part2.
	*
	* @return the xch01437 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01437() {
		return _vrTechnicalSpec_XCHPart2.getXCH01437();
	}

	/**
	* Returns the xch01438 of this vr technical spec_xch part2.
	*
	* @return the xch01438 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01438() {
		return _vrTechnicalSpec_XCHPart2.getXCH01438();
	}

	/**
	* Returns the xch01439 of this vr technical spec_xch part2.
	*
	* @return the xch01439 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01439() {
		return _vrTechnicalSpec_XCHPart2.getXCH01439();
	}

	/**
	* Returns the xch01440 of this vr technical spec_xch part2.
	*
	* @return the xch01440 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01440() {
		return _vrTechnicalSpec_XCHPart2.getXCH01440();
	}

	/**
	* Returns the xch01441 of this vr technical spec_xch part2.
	*
	* @return the xch01441 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01441() {
		return _vrTechnicalSpec_XCHPart2.getXCH01441();
	}

	/**
	* Returns the xch01442 of this vr technical spec_xch part2.
	*
	* @return the xch01442 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01442() {
		return _vrTechnicalSpec_XCHPart2.getXCH01442();
	}

	/**
	* Returns the xch01443 of this vr technical spec_xch part2.
	*
	* @return the xch01443 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01443() {
		return _vrTechnicalSpec_XCHPart2.getXCH01443();
	}

	/**
	* Returns the xch01444 of this vr technical spec_xch part2.
	*
	* @return the xch01444 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01444() {
		return _vrTechnicalSpec_XCHPart2.getXCH01444();
	}

	/**
	* Returns the xch01445 of this vr technical spec_xch part2.
	*
	* @return the xch01445 of this vr technical spec_xch part2
	*/
	@Override
	public java.lang.String getXCH01445() {
		return _vrTechnicalSpec_XCHPart2.getXCH01445();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XCHPart2.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XCHPart2.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xch part2.
	*
	* @return the modify date of this vr technical spec_xch part2
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XCHPart2.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xch part2.
	*
	* @return the sync date of this vr technical spec_xch part2
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XCHPart2.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xch part2.
	*
	* @return the convert assemble ID of this vr technical spec_xch part2
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XCHPart2.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xch part2.
	*
	* @return the dossier ID of this vr technical spec_xch part2
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XCHPart2.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xch part2.
	*
	* @return the ID of this vr technical spec_xch part2
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XCHPart2.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xch part2.
	*
	* @return the mt core of this vr technical spec_xch part2
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XCHPart2.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xch part2.
	*
	* @return the primary key of this vr technical spec_xch part2
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XCHPart2.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xch part2.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xch part2
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XCHPart2.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XCHPart2.persist();
	}

	/**
	* Sets the bbcnclklxch001 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH001 the bbcnclklxch001 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH001(java.lang.String BBCNCLKLXCH001) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH001(BBCNCLKLXCH001);
	}

	/**
	* Sets the bbcnclklxch002 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH002 the bbcnclklxch002 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH002(java.lang.String BBCNCLKLXCH002) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH002(BBCNCLKLXCH002);
	}

	/**
	* Sets the bbcnclklxch003 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH003 the bbcnclklxch003 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH003(java.lang.String BBCNCLKLXCH003) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH003(BBCNCLKLXCH003);
	}

	/**
	* Sets the bbcnclklxch004 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH004 the bbcnclklxch004 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH004(java.lang.String BBCNCLKLXCH004) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH004(BBCNCLKLXCH004);
	}

	/**
	* Sets the bbcnclklxch005 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH005 the bbcnclklxch005 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH005(java.lang.String BBCNCLKLXCH005) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH005(BBCNCLKLXCH005);
	}

	/**
	* Sets the bbcnclklxch006 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH006 the bbcnclklxch006 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH006(java.lang.String BBCNCLKLXCH006) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH006(BBCNCLKLXCH006);
	}

	/**
	* Sets the bbcnclklxch012 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH012 the bbcnclklxch012 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH012(java.lang.String BBCNCLKLXCH012) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH012(BBCNCLKLXCH012);
	}

	/**
	* Sets the bbcnclklxch013 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH013 the bbcnclklxch013 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH013(java.lang.String BBCNCLKLXCH013) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH013(BBCNCLKLXCH013);
	}

	/**
	* Sets the bbcnclklxch014 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH014 the bbcnclklxch014 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH014(java.lang.String BBCNCLKLXCH014) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH014(BBCNCLKLXCH014);
	}

	/**
	* Sets the bbcnclklxch015 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH015 the bbcnclklxch015 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH015(java.lang.String BBCNCLKLXCH015) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH015(BBCNCLKLXCH015);
	}

	/**
	* Sets the bbcnclklxch016 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH016 the bbcnclklxch016 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH016(java.lang.String BBCNCLKLXCH016) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH016(BBCNCLKLXCH016);
	}

	/**
	* Sets the bbcnclklxch017 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH017 the bbcnclklxch017 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH017(java.lang.String BBCNCLKLXCH017) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH017(BBCNCLKLXCH017);
	}

	/**
	* Sets the bbcnclklxch018 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH018 the bbcnclklxch018 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH018(java.lang.String BBCNCLKLXCH018) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH018(BBCNCLKLXCH018);
	}

	/**
	* Sets the bbcnclklxch019 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH019 the bbcnclklxch019 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH019(java.lang.String BBCNCLKLXCH019) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH019(BBCNCLKLXCH019);
	}

	/**
	* Sets the bbcnclklxch020 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH020 the bbcnclklxch020 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH020(java.lang.String BBCNCLKLXCH020) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH020(BBCNCLKLXCH020);
	}

	/**
	* Sets the bbcnclklxch021 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH021 the bbcnclklxch021 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH021(java.lang.String BBCNCLKLXCH021) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH021(BBCNCLKLXCH021);
	}

	/**
	* Sets the bbcnclklxch022 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH022 the bbcnclklxch022 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH022(java.lang.String BBCNCLKLXCH022) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH022(BBCNCLKLXCH022);
	}

	/**
	* Sets the bbcnclklxch023 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH023 the bbcnclklxch023 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH023(java.lang.String BBCNCLKLXCH023) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH023(BBCNCLKLXCH023);
	}

	/**
	* Sets the bbcnclklxch026 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH026 the bbcnclklxch026 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH026(java.lang.String BBCNCLKLXCH026) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH026(BBCNCLKLXCH026);
	}

	/**
	* Sets the bbcnclklxch027 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH027 the bbcnclklxch027 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH027(java.lang.String BBCNCLKLXCH027) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH027(BBCNCLKLXCH027);
	}

	/**
	* Sets the bbcnclklxch028 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH028 the bbcnclklxch028 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH028(java.lang.String BBCNCLKLXCH028) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH028(BBCNCLKLXCH028);
	}

	/**
	* Sets the bbcnclklxch033 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH033 the bbcnclklxch033 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH033(java.lang.String BBCNCLKLXCH033) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH033(BBCNCLKLXCH033);
	}

	/**
	* Sets the bbcnclklxch034 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH034 the bbcnclklxch034 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH034(java.lang.String BBCNCLKLXCH034) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH034(BBCNCLKLXCH034);
	}

	/**
	* Sets the bbcnclklxch037 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH037 the bbcnclklxch037 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH037(java.lang.String BBCNCLKLXCH037) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH037(BBCNCLKLXCH037);
	}

	/**
	* Sets the bbcnclklxch038 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH038 the bbcnclklxch038 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH038(java.lang.String BBCNCLKLXCH038) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH038(BBCNCLKLXCH038);
	}

	/**
	* Sets the bbcnclklxch039 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH039 the bbcnclklxch039 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH039(java.lang.String BBCNCLKLXCH039) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH039(BBCNCLKLXCH039);
	}

	/**
	* Sets the bbcnclklxch040 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH040 the bbcnclklxch040 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH040(java.lang.String BBCNCLKLXCH040) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH040(BBCNCLKLXCH040);
	}

	/**
	* Sets the bbcnclklxch041 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH041 the bbcnclklxch041 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH041(java.lang.String BBCNCLKLXCH041) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH041(BBCNCLKLXCH041);
	}

	/**
	* Sets the bbcnclklxch042 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH042 the bbcnclklxch042 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH042(java.lang.String BBCNCLKLXCH042) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH042(BBCNCLKLXCH042);
	}

	/**
	* Sets the bbcnclklxch043 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH043 the bbcnclklxch043 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH043(java.lang.String BBCNCLKLXCH043) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH043(BBCNCLKLXCH043);
	}

	/**
	* Sets the bbcnclklxch044 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH044 the bbcnclklxch044 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH044(java.lang.String BBCNCLKLXCH044) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH044(BBCNCLKLXCH044);
	}

	/**
	* Sets the bbcnclklxch045 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH045 the bbcnclklxch045 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH045(java.lang.String BBCNCLKLXCH045) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH045(BBCNCLKLXCH045);
	}

	/**
	* Sets the bbcnclklxch046 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH046 the bbcnclklxch046 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH046(java.lang.String BBCNCLKLXCH046) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH046(BBCNCLKLXCH046);
	}

	/**
	* Sets the bbcnclklxch047 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH047 the bbcnclklxch047 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH047(java.lang.String BBCNCLKLXCH047) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH047(BBCNCLKLXCH047);
	}

	/**
	* Sets the bbcnclklxch053 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH053 the bbcnclklxch053 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH053(java.lang.String BBCNCLKLXCH053) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH053(BBCNCLKLXCH053);
	}

	/**
	* Sets the bbcnclklxch054 of this vr technical spec_xch part2.
	*
	* @param BBCNCLKLXCH054 the bbcnclklxch054 of this vr technical spec_xch part2
	*/
	@Override
	public void setBBCNCLKLXCH054(java.lang.String BBCNCLKLXCH054) {
		_vrTechnicalSpec_XCHPart2.setBBCNCLKLXCH054(BBCNCLKLXCH054);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XCHPart2.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xch part2.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xch part2
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XCHPart2.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xch part2.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xch part2
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XCHPart2.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xch part2.
	*
	* @param dossierId the dossier ID of this vr technical spec_xch part2
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XCHPart2.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xch part2.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xch part2
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XCHPart2.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xch part2.
	*
	* @param dossierNo the dossier no of this vr technical spec_xch part2
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XCHPart2.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XCHPart2.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XCHPart2.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XCHPart2.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xch part2.
	*
	* @param id the ID of this vr technical spec_xch part2
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XCHPart2.setId(id);
	}

	/**
	* Sets the modify date of this vr technical spec_xch part2.
	*
	* @param modifyDate the modify date of this vr technical spec_xch part2
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XCHPart2.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xch part2.
	*
	* @param mtCore the mt core of this vr technical spec_xch part2
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XCHPart2.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XCHPart2.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xch part2.
	*
	* @param primaryKey the primary key of this vr technical spec_xch part2
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XCHPart2.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XCHPart2.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xch part2.
	*
	* @param referenceUid the reference uid of this vr technical spec_xch part2
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XCHPart2.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xch part2.
	*
	* @param syncDate the sync date of this vr technical spec_xch part2
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XCHPart2.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xch part2.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xch part2
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XCHPart2.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xch01273 of this vr technical spec_xch part2.
	*
	* @param XCH01273 the xch01273 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01273(java.lang.String XCH01273) {
		_vrTechnicalSpec_XCHPart2.setXCH01273(XCH01273);
	}

	/**
	* Sets the xch01274 of this vr technical spec_xch part2.
	*
	* @param XCH01274 the xch01274 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01274(java.lang.String XCH01274) {
		_vrTechnicalSpec_XCHPart2.setXCH01274(XCH01274);
	}

	/**
	* Sets the xch01275 of this vr technical spec_xch part2.
	*
	* @param XCH01275 the xch01275 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01275(java.lang.String XCH01275) {
		_vrTechnicalSpec_XCHPart2.setXCH01275(XCH01275);
	}

	/**
	* Sets the xch01276 of this vr technical spec_xch part2.
	*
	* @param XCH01276 the xch01276 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01276(java.lang.String XCH01276) {
		_vrTechnicalSpec_XCHPart2.setXCH01276(XCH01276);
	}

	/**
	* Sets the xch01277 of this vr technical spec_xch part2.
	*
	* @param XCH01277 the xch01277 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01277(java.lang.String XCH01277) {
		_vrTechnicalSpec_XCHPart2.setXCH01277(XCH01277);
	}

	/**
	* Sets the xch01278 of this vr technical spec_xch part2.
	*
	* @param XCH01278 the xch01278 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01278(java.lang.String XCH01278) {
		_vrTechnicalSpec_XCHPart2.setXCH01278(XCH01278);
	}

	/**
	* Sets the xch01279 of this vr technical spec_xch part2.
	*
	* @param XCH01279 the xch01279 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01279(java.lang.String XCH01279) {
		_vrTechnicalSpec_XCHPart2.setXCH01279(XCH01279);
	}

	/**
	* Sets the xch01280 of this vr technical spec_xch part2.
	*
	* @param XCH01280 the xch01280 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01280(java.lang.String XCH01280) {
		_vrTechnicalSpec_XCHPart2.setXCH01280(XCH01280);
	}

	/**
	* Sets the xch01281 of this vr technical spec_xch part2.
	*
	* @param XCH01281 the xch01281 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01281(java.lang.String XCH01281) {
		_vrTechnicalSpec_XCHPart2.setXCH01281(XCH01281);
	}

	/**
	* Sets the xch01282 of this vr technical spec_xch part2.
	*
	* @param XCH01282 the xch01282 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01282(java.lang.String XCH01282) {
		_vrTechnicalSpec_XCHPart2.setXCH01282(XCH01282);
	}

	/**
	* Sets the xch01283 of this vr technical spec_xch part2.
	*
	* @param XCH01283 the xch01283 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01283(java.lang.String XCH01283) {
		_vrTechnicalSpec_XCHPart2.setXCH01283(XCH01283);
	}

	/**
	* Sets the xch01284 of this vr technical spec_xch part2.
	*
	* @param XCH01284 the xch01284 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01284(java.lang.String XCH01284) {
		_vrTechnicalSpec_XCHPart2.setXCH01284(XCH01284);
	}

	/**
	* Sets the xch01285 of this vr technical spec_xch part2.
	*
	* @param XCH01285 the xch01285 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01285(java.lang.String XCH01285) {
		_vrTechnicalSpec_XCHPart2.setXCH01285(XCH01285);
	}

	/**
	* Sets the xch01286 of this vr technical spec_xch part2.
	*
	* @param XCH01286 the xch01286 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01286(java.lang.String XCH01286) {
		_vrTechnicalSpec_XCHPart2.setXCH01286(XCH01286);
	}

	/**
	* Sets the xch01287 of this vr technical spec_xch part2.
	*
	* @param XCH01287 the xch01287 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01287(java.lang.String XCH01287) {
		_vrTechnicalSpec_XCHPart2.setXCH01287(XCH01287);
	}

	/**
	* Sets the xch01288 of this vr technical spec_xch part2.
	*
	* @param XCH01288 the xch01288 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01288(java.lang.String XCH01288) {
		_vrTechnicalSpec_XCHPart2.setXCH01288(XCH01288);
	}

	/**
	* Sets the xch01289 of this vr technical spec_xch part2.
	*
	* @param XCH01289 the xch01289 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01289(java.lang.String XCH01289) {
		_vrTechnicalSpec_XCHPart2.setXCH01289(XCH01289);
	}

	/**
	* Sets the xch01290 of this vr technical spec_xch part2.
	*
	* @param XCH01290 the xch01290 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01290(java.lang.String XCH01290) {
		_vrTechnicalSpec_XCHPart2.setXCH01290(XCH01290);
	}

	/**
	* Sets the xch01291 of this vr technical spec_xch part2.
	*
	* @param XCH01291 the xch01291 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01291(java.lang.String XCH01291) {
		_vrTechnicalSpec_XCHPart2.setXCH01291(XCH01291);
	}

	/**
	* Sets the xch01292 of this vr technical spec_xch part2.
	*
	* @param XCH01292 the xch01292 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01292(java.lang.String XCH01292) {
		_vrTechnicalSpec_XCHPart2.setXCH01292(XCH01292);
	}

	/**
	* Sets the xch01293 of this vr technical spec_xch part2.
	*
	* @param XCH01293 the xch01293 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01293(java.lang.String XCH01293) {
		_vrTechnicalSpec_XCHPart2.setXCH01293(XCH01293);
	}

	/**
	* Sets the xch01294 of this vr technical spec_xch part2.
	*
	* @param XCH01294 the xch01294 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01294(java.lang.String XCH01294) {
		_vrTechnicalSpec_XCHPart2.setXCH01294(XCH01294);
	}

	/**
	* Sets the xch01295 of this vr technical spec_xch part2.
	*
	* @param XCH01295 the xch01295 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01295(java.lang.String XCH01295) {
		_vrTechnicalSpec_XCHPart2.setXCH01295(XCH01295);
	}

	/**
	* Sets the xch01296 of this vr technical spec_xch part2.
	*
	* @param XCH01296 the xch01296 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01296(java.lang.String XCH01296) {
		_vrTechnicalSpec_XCHPart2.setXCH01296(XCH01296);
	}

	/**
	* Sets the xch01297 of this vr technical spec_xch part2.
	*
	* @param XCH01297 the xch01297 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01297(java.lang.String XCH01297) {
		_vrTechnicalSpec_XCHPart2.setXCH01297(XCH01297);
	}

	/**
	* Sets the xch01298 of this vr technical spec_xch part2.
	*
	* @param XCH01298 the xch01298 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01298(java.lang.String XCH01298) {
		_vrTechnicalSpec_XCHPart2.setXCH01298(XCH01298);
	}

	/**
	* Sets the xch01299 of this vr technical spec_xch part2.
	*
	* @param XCH01299 the xch01299 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01299(java.lang.String XCH01299) {
		_vrTechnicalSpec_XCHPart2.setXCH01299(XCH01299);
	}

	/**
	* Sets the xch01300 of this vr technical spec_xch part2.
	*
	* @param XCH01300 the xch01300 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01300(java.lang.String XCH01300) {
		_vrTechnicalSpec_XCHPart2.setXCH01300(XCH01300);
	}

	/**
	* Sets the xch01301 of this vr technical spec_xch part2.
	*
	* @param XCH01301 the xch01301 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01301(java.lang.String XCH01301) {
		_vrTechnicalSpec_XCHPart2.setXCH01301(XCH01301);
	}

	/**
	* Sets the xch01302 of this vr technical spec_xch part2.
	*
	* @param XCH01302 the xch01302 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01302(java.lang.String XCH01302) {
		_vrTechnicalSpec_XCHPart2.setXCH01302(XCH01302);
	}

	/**
	* Sets the xch01303 of this vr technical spec_xch part2.
	*
	* @param XCH01303 the xch01303 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01303(java.lang.String XCH01303) {
		_vrTechnicalSpec_XCHPart2.setXCH01303(XCH01303);
	}

	/**
	* Sets the xch01304 of this vr technical spec_xch part2.
	*
	* @param XCH01304 the xch01304 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01304(java.lang.String XCH01304) {
		_vrTechnicalSpec_XCHPart2.setXCH01304(XCH01304);
	}

	/**
	* Sets the xch01305 of this vr technical spec_xch part2.
	*
	* @param XCH01305 the xch01305 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01305(java.lang.String XCH01305) {
		_vrTechnicalSpec_XCHPart2.setXCH01305(XCH01305);
	}

	/**
	* Sets the xch01306 of this vr technical spec_xch part2.
	*
	* @param XCH01306 the xch01306 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01306(java.lang.String XCH01306) {
		_vrTechnicalSpec_XCHPart2.setXCH01306(XCH01306);
	}

	/**
	* Sets the xch01307 of this vr technical spec_xch part2.
	*
	* @param XCH01307 the xch01307 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01307(java.lang.String XCH01307) {
		_vrTechnicalSpec_XCHPart2.setXCH01307(XCH01307);
	}

	/**
	* Sets the xch01308 of this vr technical spec_xch part2.
	*
	* @param XCH01308 the xch01308 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01308(java.lang.String XCH01308) {
		_vrTechnicalSpec_XCHPart2.setXCH01308(XCH01308);
	}

	/**
	* Sets the xch01309 of this vr technical spec_xch part2.
	*
	* @param XCH01309 the xch01309 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01309(java.lang.String XCH01309) {
		_vrTechnicalSpec_XCHPart2.setXCH01309(XCH01309);
	}

	/**
	* Sets the xch01310 of this vr technical spec_xch part2.
	*
	* @param XCH01310 the xch01310 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01310(java.lang.String XCH01310) {
		_vrTechnicalSpec_XCHPart2.setXCH01310(XCH01310);
	}

	/**
	* Sets the xch01311 of this vr technical spec_xch part2.
	*
	* @param XCH01311 the xch01311 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01311(java.lang.String XCH01311) {
		_vrTechnicalSpec_XCHPart2.setXCH01311(XCH01311);
	}

	/**
	* Sets the xch01312 of this vr technical spec_xch part2.
	*
	* @param XCH01312 the xch01312 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01312(java.lang.String XCH01312) {
		_vrTechnicalSpec_XCHPart2.setXCH01312(XCH01312);
	}

	/**
	* Sets the xch01313 of this vr technical spec_xch part2.
	*
	* @param XCH01313 the xch01313 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01313(java.lang.String XCH01313) {
		_vrTechnicalSpec_XCHPart2.setXCH01313(XCH01313);
	}

	/**
	* Sets the xch01314 of this vr technical spec_xch part2.
	*
	* @param XCH01314 the xch01314 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01314(java.lang.String XCH01314) {
		_vrTechnicalSpec_XCHPart2.setXCH01314(XCH01314);
	}

	/**
	* Sets the xch01315 of this vr technical spec_xch part2.
	*
	* @param XCH01315 the xch01315 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01315(java.lang.String XCH01315) {
		_vrTechnicalSpec_XCHPart2.setXCH01315(XCH01315);
	}

	/**
	* Sets the xch01316 of this vr technical spec_xch part2.
	*
	* @param XCH01316 the xch01316 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01316(java.lang.String XCH01316) {
		_vrTechnicalSpec_XCHPart2.setXCH01316(XCH01316);
	}

	/**
	* Sets the xch01317 of this vr technical spec_xch part2.
	*
	* @param XCH01317 the xch01317 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01317(java.lang.String XCH01317) {
		_vrTechnicalSpec_XCHPart2.setXCH01317(XCH01317);
	}

	/**
	* Sets the xch01318 of this vr technical spec_xch part2.
	*
	* @param XCH01318 the xch01318 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01318(java.lang.String XCH01318) {
		_vrTechnicalSpec_XCHPart2.setXCH01318(XCH01318);
	}

	/**
	* Sets the xch01319 of this vr technical spec_xch part2.
	*
	* @param XCH01319 the xch01319 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01319(java.lang.String XCH01319) {
		_vrTechnicalSpec_XCHPart2.setXCH01319(XCH01319);
	}

	/**
	* Sets the xch01320 of this vr technical spec_xch part2.
	*
	* @param XCH01320 the xch01320 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01320(java.lang.String XCH01320) {
		_vrTechnicalSpec_XCHPart2.setXCH01320(XCH01320);
	}

	/**
	* Sets the xch01321 of this vr technical spec_xch part2.
	*
	* @param XCH01321 the xch01321 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01321(java.lang.String XCH01321) {
		_vrTechnicalSpec_XCHPart2.setXCH01321(XCH01321);
	}

	/**
	* Sets the xch01322 of this vr technical spec_xch part2.
	*
	* @param XCH01322 the xch01322 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01322(java.lang.String XCH01322) {
		_vrTechnicalSpec_XCHPart2.setXCH01322(XCH01322);
	}

	/**
	* Sets the xch01323 of this vr technical spec_xch part2.
	*
	* @param XCH01323 the xch01323 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01323(java.lang.String XCH01323) {
		_vrTechnicalSpec_XCHPart2.setXCH01323(XCH01323);
	}

	/**
	* Sets the xch01324 of this vr technical spec_xch part2.
	*
	* @param XCH01324 the xch01324 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01324(java.lang.String XCH01324) {
		_vrTechnicalSpec_XCHPart2.setXCH01324(XCH01324);
	}

	/**
	* Sets the xch01325 of this vr technical spec_xch part2.
	*
	* @param XCH01325 the xch01325 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01325(java.lang.String XCH01325) {
		_vrTechnicalSpec_XCHPart2.setXCH01325(XCH01325);
	}

	/**
	* Sets the xch01326 of this vr technical spec_xch part2.
	*
	* @param XCH01326 the xch01326 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01326(java.lang.String XCH01326) {
		_vrTechnicalSpec_XCHPart2.setXCH01326(XCH01326);
	}

	/**
	* Sets the xch01327 of this vr technical spec_xch part2.
	*
	* @param XCH01327 the xch01327 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01327(java.lang.String XCH01327) {
		_vrTechnicalSpec_XCHPart2.setXCH01327(XCH01327);
	}

	/**
	* Sets the xch01328 of this vr technical spec_xch part2.
	*
	* @param XCH01328 the xch01328 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01328(java.lang.String XCH01328) {
		_vrTechnicalSpec_XCHPart2.setXCH01328(XCH01328);
	}

	/**
	* Sets the xch01329 of this vr technical spec_xch part2.
	*
	* @param XCH01329 the xch01329 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01329(java.lang.String XCH01329) {
		_vrTechnicalSpec_XCHPart2.setXCH01329(XCH01329);
	}

	/**
	* Sets the xch01330 of this vr technical spec_xch part2.
	*
	* @param XCH01330 the xch01330 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01330(java.lang.String XCH01330) {
		_vrTechnicalSpec_XCHPart2.setXCH01330(XCH01330);
	}

	/**
	* Sets the xch01331 of this vr technical spec_xch part2.
	*
	* @param XCH01331 the xch01331 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01331(java.lang.String XCH01331) {
		_vrTechnicalSpec_XCHPart2.setXCH01331(XCH01331);
	}

	/**
	* Sets the xch01332 of this vr technical spec_xch part2.
	*
	* @param XCH01332 the xch01332 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01332(java.lang.String XCH01332) {
		_vrTechnicalSpec_XCHPart2.setXCH01332(XCH01332);
	}

	/**
	* Sets the xch01333 of this vr technical spec_xch part2.
	*
	* @param XCH01333 the xch01333 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01333(java.lang.String XCH01333) {
		_vrTechnicalSpec_XCHPart2.setXCH01333(XCH01333);
	}

	/**
	* Sets the xch01334 of this vr technical spec_xch part2.
	*
	* @param XCH01334 the xch01334 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01334(java.lang.String XCH01334) {
		_vrTechnicalSpec_XCHPart2.setXCH01334(XCH01334);
	}

	/**
	* Sets the xch01335 of this vr technical spec_xch part2.
	*
	* @param XCH01335 the xch01335 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01335(java.lang.String XCH01335) {
		_vrTechnicalSpec_XCHPart2.setXCH01335(XCH01335);
	}

	/**
	* Sets the xch01336 of this vr technical spec_xch part2.
	*
	* @param XCH01336 the xch01336 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01336(java.lang.String XCH01336) {
		_vrTechnicalSpec_XCHPart2.setXCH01336(XCH01336);
	}

	/**
	* Sets the xch01337 of this vr technical spec_xch part2.
	*
	* @param XCH01337 the xch01337 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01337(java.lang.String XCH01337) {
		_vrTechnicalSpec_XCHPart2.setXCH01337(XCH01337);
	}

	/**
	* Sets the xch01338 of this vr technical spec_xch part2.
	*
	* @param XCH01338 the xch01338 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01338(java.lang.String XCH01338) {
		_vrTechnicalSpec_XCHPart2.setXCH01338(XCH01338);
	}

	/**
	* Sets the xch01339 of this vr technical spec_xch part2.
	*
	* @param XCH01339 the xch01339 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01339(java.lang.String XCH01339) {
		_vrTechnicalSpec_XCHPart2.setXCH01339(XCH01339);
	}

	/**
	* Sets the xch01340 of this vr technical spec_xch part2.
	*
	* @param XCH01340 the xch01340 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01340(java.lang.String XCH01340) {
		_vrTechnicalSpec_XCHPart2.setXCH01340(XCH01340);
	}

	/**
	* Sets the xch01341 of this vr technical spec_xch part2.
	*
	* @param XCH01341 the xch01341 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01341(java.lang.String XCH01341) {
		_vrTechnicalSpec_XCHPart2.setXCH01341(XCH01341);
	}

	/**
	* Sets the xch01342 of this vr technical spec_xch part2.
	*
	* @param XCH01342 the xch01342 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01342(java.lang.String XCH01342) {
		_vrTechnicalSpec_XCHPart2.setXCH01342(XCH01342);
	}

	/**
	* Sets the xch01343 of this vr technical spec_xch part2.
	*
	* @param XCH01343 the xch01343 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01343(java.lang.String XCH01343) {
		_vrTechnicalSpec_XCHPart2.setXCH01343(XCH01343);
	}

	/**
	* Sets the xch01344 of this vr technical spec_xch part2.
	*
	* @param XCH01344 the xch01344 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01344(java.lang.String XCH01344) {
		_vrTechnicalSpec_XCHPart2.setXCH01344(XCH01344);
	}

	/**
	* Sets the xch01345 of this vr technical spec_xch part2.
	*
	* @param XCH01345 the xch01345 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01345(java.lang.String XCH01345) {
		_vrTechnicalSpec_XCHPart2.setXCH01345(XCH01345);
	}

	/**
	* Sets the xch01346 of this vr technical spec_xch part2.
	*
	* @param XCH01346 the xch01346 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01346(java.lang.String XCH01346) {
		_vrTechnicalSpec_XCHPart2.setXCH01346(XCH01346);
	}

	/**
	* Sets the xch01347 of this vr technical spec_xch part2.
	*
	* @param XCH01347 the xch01347 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01347(java.lang.String XCH01347) {
		_vrTechnicalSpec_XCHPart2.setXCH01347(XCH01347);
	}

	/**
	* Sets the xch01348 of this vr technical spec_xch part2.
	*
	* @param XCH01348 the xch01348 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01348(java.lang.String XCH01348) {
		_vrTechnicalSpec_XCHPart2.setXCH01348(XCH01348);
	}

	/**
	* Sets the xch01349 of this vr technical spec_xch part2.
	*
	* @param XCH01349 the xch01349 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01349(java.lang.String XCH01349) {
		_vrTechnicalSpec_XCHPart2.setXCH01349(XCH01349);
	}

	/**
	* Sets the xch01350 of this vr technical spec_xch part2.
	*
	* @param XCH01350 the xch01350 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01350(java.lang.String XCH01350) {
		_vrTechnicalSpec_XCHPart2.setXCH01350(XCH01350);
	}

	/**
	* Sets the xch01351 of this vr technical spec_xch part2.
	*
	* @param XCH01351 the xch01351 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01351(java.lang.String XCH01351) {
		_vrTechnicalSpec_XCHPart2.setXCH01351(XCH01351);
	}

	/**
	* Sets the xch01352 of this vr technical spec_xch part2.
	*
	* @param XCH01352 the xch01352 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01352(java.lang.String XCH01352) {
		_vrTechnicalSpec_XCHPart2.setXCH01352(XCH01352);
	}

	/**
	* Sets the xch01353 of this vr technical spec_xch part2.
	*
	* @param XCH01353 the xch01353 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01353(java.lang.String XCH01353) {
		_vrTechnicalSpec_XCHPart2.setXCH01353(XCH01353);
	}

	/**
	* Sets the xch01354 of this vr technical spec_xch part2.
	*
	* @param XCH01354 the xch01354 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01354(java.lang.String XCH01354) {
		_vrTechnicalSpec_XCHPart2.setXCH01354(XCH01354);
	}

	/**
	* Sets the xch01355 of this vr technical spec_xch part2.
	*
	* @param XCH01355 the xch01355 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01355(java.lang.String XCH01355) {
		_vrTechnicalSpec_XCHPart2.setXCH01355(XCH01355);
	}

	/**
	* Sets the xch01356 of this vr technical spec_xch part2.
	*
	* @param XCH01356 the xch01356 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01356(java.lang.String XCH01356) {
		_vrTechnicalSpec_XCHPart2.setXCH01356(XCH01356);
	}

	/**
	* Sets the xch01357 of this vr technical spec_xch part2.
	*
	* @param XCH01357 the xch01357 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01357(java.lang.String XCH01357) {
		_vrTechnicalSpec_XCHPart2.setXCH01357(XCH01357);
	}

	/**
	* Sets the xch01358 of this vr technical spec_xch part2.
	*
	* @param XCH01358 the xch01358 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01358(java.lang.String XCH01358) {
		_vrTechnicalSpec_XCHPart2.setXCH01358(XCH01358);
	}

	/**
	* Sets the xch01359 of this vr technical spec_xch part2.
	*
	* @param XCH01359 the xch01359 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01359(java.lang.String XCH01359) {
		_vrTechnicalSpec_XCHPart2.setXCH01359(XCH01359);
	}

	/**
	* Sets the xch01360 of this vr technical spec_xch part2.
	*
	* @param XCH01360 the xch01360 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01360(java.lang.String XCH01360) {
		_vrTechnicalSpec_XCHPart2.setXCH01360(XCH01360);
	}

	/**
	* Sets the xch01361 of this vr technical spec_xch part2.
	*
	* @param XCH01361 the xch01361 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01361(java.lang.String XCH01361) {
		_vrTechnicalSpec_XCHPart2.setXCH01361(XCH01361);
	}

	/**
	* Sets the xch01362 of this vr technical spec_xch part2.
	*
	* @param XCH01362 the xch01362 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01362(java.lang.String XCH01362) {
		_vrTechnicalSpec_XCHPart2.setXCH01362(XCH01362);
	}

	/**
	* Sets the xch01363 of this vr technical spec_xch part2.
	*
	* @param XCH01363 the xch01363 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01363(java.lang.String XCH01363) {
		_vrTechnicalSpec_XCHPart2.setXCH01363(XCH01363);
	}

	/**
	* Sets the xch01364 of this vr technical spec_xch part2.
	*
	* @param XCH01364 the xch01364 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01364(java.lang.String XCH01364) {
		_vrTechnicalSpec_XCHPart2.setXCH01364(XCH01364);
	}

	/**
	* Sets the xch01365 of this vr technical spec_xch part2.
	*
	* @param XCH01365 the xch01365 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01365(java.lang.String XCH01365) {
		_vrTechnicalSpec_XCHPart2.setXCH01365(XCH01365);
	}

	/**
	* Sets the xch01366 of this vr technical spec_xch part2.
	*
	* @param XCH01366 the xch01366 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01366(java.lang.String XCH01366) {
		_vrTechnicalSpec_XCHPart2.setXCH01366(XCH01366);
	}

	/**
	* Sets the xch01367 of this vr technical spec_xch part2.
	*
	* @param XCH01367 the xch01367 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01367(java.lang.String XCH01367) {
		_vrTechnicalSpec_XCHPart2.setXCH01367(XCH01367);
	}

	/**
	* Sets the xch01368 of this vr technical spec_xch part2.
	*
	* @param XCH01368 the xch01368 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01368(java.lang.String XCH01368) {
		_vrTechnicalSpec_XCHPart2.setXCH01368(XCH01368);
	}

	/**
	* Sets the xch01369 of this vr technical spec_xch part2.
	*
	* @param XCH01369 the xch01369 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01369(java.lang.String XCH01369) {
		_vrTechnicalSpec_XCHPart2.setXCH01369(XCH01369);
	}

	/**
	* Sets the xch01370 of this vr technical spec_xch part2.
	*
	* @param XCH01370 the xch01370 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01370(java.lang.String XCH01370) {
		_vrTechnicalSpec_XCHPart2.setXCH01370(XCH01370);
	}

	/**
	* Sets the xch01371 of this vr technical spec_xch part2.
	*
	* @param XCH01371 the xch01371 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01371(java.lang.String XCH01371) {
		_vrTechnicalSpec_XCHPart2.setXCH01371(XCH01371);
	}

	/**
	* Sets the xch01372 of this vr technical spec_xch part2.
	*
	* @param XCH01372 the xch01372 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01372(java.lang.String XCH01372) {
		_vrTechnicalSpec_XCHPart2.setXCH01372(XCH01372);
	}

	/**
	* Sets the xch01373 of this vr technical spec_xch part2.
	*
	* @param XCH01373 the xch01373 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01373(java.lang.String XCH01373) {
		_vrTechnicalSpec_XCHPart2.setXCH01373(XCH01373);
	}

	/**
	* Sets the xch01374 of this vr technical spec_xch part2.
	*
	* @param XCH01374 the xch01374 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01374(java.lang.String XCH01374) {
		_vrTechnicalSpec_XCHPart2.setXCH01374(XCH01374);
	}

	/**
	* Sets the xch01375 of this vr technical spec_xch part2.
	*
	* @param XCH01375 the xch01375 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01375(java.lang.String XCH01375) {
		_vrTechnicalSpec_XCHPart2.setXCH01375(XCH01375);
	}

	/**
	* Sets the xch01376 of this vr technical spec_xch part2.
	*
	* @param XCH01376 the xch01376 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01376(java.lang.String XCH01376) {
		_vrTechnicalSpec_XCHPart2.setXCH01376(XCH01376);
	}

	/**
	* Sets the xch01377 of this vr technical spec_xch part2.
	*
	* @param XCH01377 the xch01377 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01377(java.lang.String XCH01377) {
		_vrTechnicalSpec_XCHPart2.setXCH01377(XCH01377);
	}

	/**
	* Sets the xch01378 of this vr technical spec_xch part2.
	*
	* @param XCH01378 the xch01378 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01378(java.lang.String XCH01378) {
		_vrTechnicalSpec_XCHPart2.setXCH01378(XCH01378);
	}

	/**
	* Sets the xch01379 of this vr technical spec_xch part2.
	*
	* @param XCH01379 the xch01379 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01379(java.lang.String XCH01379) {
		_vrTechnicalSpec_XCHPart2.setXCH01379(XCH01379);
	}

	/**
	* Sets the xch01380 of this vr technical spec_xch part2.
	*
	* @param XCH01380 the xch01380 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01380(java.lang.String XCH01380) {
		_vrTechnicalSpec_XCHPart2.setXCH01380(XCH01380);
	}

	/**
	* Sets the xch01381 of this vr technical spec_xch part2.
	*
	* @param XCH01381 the xch01381 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01381(java.lang.String XCH01381) {
		_vrTechnicalSpec_XCHPart2.setXCH01381(XCH01381);
	}

	/**
	* Sets the xch01382 of this vr technical spec_xch part2.
	*
	* @param XCH01382 the xch01382 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01382(java.lang.String XCH01382) {
		_vrTechnicalSpec_XCHPart2.setXCH01382(XCH01382);
	}

	/**
	* Sets the xch01383 of this vr technical spec_xch part2.
	*
	* @param XCH01383 the xch01383 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01383(java.lang.String XCH01383) {
		_vrTechnicalSpec_XCHPart2.setXCH01383(XCH01383);
	}

	/**
	* Sets the xch01384 of this vr technical spec_xch part2.
	*
	* @param XCH01384 the xch01384 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01384(java.lang.String XCH01384) {
		_vrTechnicalSpec_XCHPart2.setXCH01384(XCH01384);
	}

	/**
	* Sets the xch01385 of this vr technical spec_xch part2.
	*
	* @param XCH01385 the xch01385 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01385(java.lang.String XCH01385) {
		_vrTechnicalSpec_XCHPart2.setXCH01385(XCH01385);
	}

	/**
	* Sets the xch01386 of this vr technical spec_xch part2.
	*
	* @param XCH01386 the xch01386 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01386(java.lang.String XCH01386) {
		_vrTechnicalSpec_XCHPart2.setXCH01386(XCH01386);
	}

	/**
	* Sets the xch01387 of this vr technical spec_xch part2.
	*
	* @param XCH01387 the xch01387 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01387(java.lang.String XCH01387) {
		_vrTechnicalSpec_XCHPart2.setXCH01387(XCH01387);
	}

	/**
	* Sets the xch01388 of this vr technical spec_xch part2.
	*
	* @param XCH01388 the xch01388 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01388(java.lang.String XCH01388) {
		_vrTechnicalSpec_XCHPart2.setXCH01388(XCH01388);
	}

	/**
	* Sets the xch01389 of this vr technical spec_xch part2.
	*
	* @param XCH01389 the xch01389 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01389(java.lang.String XCH01389) {
		_vrTechnicalSpec_XCHPart2.setXCH01389(XCH01389);
	}

	/**
	* Sets the xch01390 of this vr technical spec_xch part2.
	*
	* @param XCH01390 the xch01390 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01390(java.lang.String XCH01390) {
		_vrTechnicalSpec_XCHPart2.setXCH01390(XCH01390);
	}

	/**
	* Sets the xch01391 of this vr technical spec_xch part2.
	*
	* @param XCH01391 the xch01391 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01391(java.lang.String XCH01391) {
		_vrTechnicalSpec_XCHPart2.setXCH01391(XCH01391);
	}

	/**
	* Sets the xch01392 of this vr technical spec_xch part2.
	*
	* @param XCH01392 the xch01392 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01392(java.lang.String XCH01392) {
		_vrTechnicalSpec_XCHPart2.setXCH01392(XCH01392);
	}

	/**
	* Sets the xch01393 of this vr technical spec_xch part2.
	*
	* @param XCH01393 the xch01393 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01393(java.lang.String XCH01393) {
		_vrTechnicalSpec_XCHPart2.setXCH01393(XCH01393);
	}

	/**
	* Sets the xch01394 of this vr technical spec_xch part2.
	*
	* @param XCH01394 the xch01394 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01394(java.lang.String XCH01394) {
		_vrTechnicalSpec_XCHPart2.setXCH01394(XCH01394);
	}

	/**
	* Sets the xch01395 of this vr technical spec_xch part2.
	*
	* @param XCH01395 the xch01395 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01395(java.lang.String XCH01395) {
		_vrTechnicalSpec_XCHPart2.setXCH01395(XCH01395);
	}

	/**
	* Sets the xch01396 of this vr technical spec_xch part2.
	*
	* @param XCH01396 the xch01396 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01396(java.lang.String XCH01396) {
		_vrTechnicalSpec_XCHPart2.setXCH01396(XCH01396);
	}

	/**
	* Sets the xch01397 of this vr technical spec_xch part2.
	*
	* @param XCH01397 the xch01397 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01397(java.lang.String XCH01397) {
		_vrTechnicalSpec_XCHPart2.setXCH01397(XCH01397);
	}

	/**
	* Sets the xch01398 of this vr technical spec_xch part2.
	*
	* @param XCH01398 the xch01398 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01398(java.lang.String XCH01398) {
		_vrTechnicalSpec_XCHPart2.setXCH01398(XCH01398);
	}

	/**
	* Sets the xch01399 of this vr technical spec_xch part2.
	*
	* @param XCH01399 the xch01399 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01399(java.lang.String XCH01399) {
		_vrTechnicalSpec_XCHPart2.setXCH01399(XCH01399);
	}

	/**
	* Sets the xch01400 of this vr technical spec_xch part2.
	*
	* @param XCH01400 the xch01400 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01400(java.lang.String XCH01400) {
		_vrTechnicalSpec_XCHPart2.setXCH01400(XCH01400);
	}

	/**
	* Sets the xch01401 of this vr technical spec_xch part2.
	*
	* @param XCH01401 the xch01401 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01401(java.lang.String XCH01401) {
		_vrTechnicalSpec_XCHPart2.setXCH01401(XCH01401);
	}

	/**
	* Sets the xch01402 of this vr technical spec_xch part2.
	*
	* @param XCH01402 the xch01402 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01402(java.lang.String XCH01402) {
		_vrTechnicalSpec_XCHPart2.setXCH01402(XCH01402);
	}

	/**
	* Sets the xch01403 of this vr technical spec_xch part2.
	*
	* @param XCH01403 the xch01403 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01403(java.lang.String XCH01403) {
		_vrTechnicalSpec_XCHPart2.setXCH01403(XCH01403);
	}

	/**
	* Sets the xch01404 of this vr technical spec_xch part2.
	*
	* @param XCH01404 the xch01404 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01404(java.lang.String XCH01404) {
		_vrTechnicalSpec_XCHPart2.setXCH01404(XCH01404);
	}

	/**
	* Sets the xch01405 of this vr technical spec_xch part2.
	*
	* @param XCH01405 the xch01405 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01405(java.lang.String XCH01405) {
		_vrTechnicalSpec_XCHPart2.setXCH01405(XCH01405);
	}

	/**
	* Sets the xch01406 of this vr technical spec_xch part2.
	*
	* @param XCH01406 the xch01406 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01406(java.lang.String XCH01406) {
		_vrTechnicalSpec_XCHPart2.setXCH01406(XCH01406);
	}

	/**
	* Sets the xch01407 of this vr technical spec_xch part2.
	*
	* @param XCH01407 the xch01407 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01407(java.lang.String XCH01407) {
		_vrTechnicalSpec_XCHPart2.setXCH01407(XCH01407);
	}

	/**
	* Sets the xch01408 of this vr technical spec_xch part2.
	*
	* @param XCH01408 the xch01408 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01408(java.lang.String XCH01408) {
		_vrTechnicalSpec_XCHPart2.setXCH01408(XCH01408);
	}

	/**
	* Sets the xch01409 of this vr technical spec_xch part2.
	*
	* @param XCH01409 the xch01409 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01409(java.lang.String XCH01409) {
		_vrTechnicalSpec_XCHPart2.setXCH01409(XCH01409);
	}

	/**
	* Sets the xch01410 of this vr technical spec_xch part2.
	*
	* @param XCH01410 the xch01410 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01410(java.lang.String XCH01410) {
		_vrTechnicalSpec_XCHPart2.setXCH01410(XCH01410);
	}

	/**
	* Sets the xch01411 of this vr technical spec_xch part2.
	*
	* @param XCH01411 the xch01411 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01411(java.lang.String XCH01411) {
		_vrTechnicalSpec_XCHPart2.setXCH01411(XCH01411);
	}

	/**
	* Sets the xch01412 of this vr technical spec_xch part2.
	*
	* @param XCH01412 the xch01412 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01412(java.lang.String XCH01412) {
		_vrTechnicalSpec_XCHPart2.setXCH01412(XCH01412);
	}

	/**
	* Sets the xch01413 of this vr technical spec_xch part2.
	*
	* @param XCH01413 the xch01413 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01413(java.lang.String XCH01413) {
		_vrTechnicalSpec_XCHPart2.setXCH01413(XCH01413);
	}

	/**
	* Sets the xch01414 of this vr technical spec_xch part2.
	*
	* @param XCH01414 the xch01414 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01414(java.lang.String XCH01414) {
		_vrTechnicalSpec_XCHPart2.setXCH01414(XCH01414);
	}

	/**
	* Sets the xch01415 of this vr technical spec_xch part2.
	*
	* @param XCH01415 the xch01415 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01415(java.lang.String XCH01415) {
		_vrTechnicalSpec_XCHPart2.setXCH01415(XCH01415);
	}

	/**
	* Sets the xch01416 of this vr technical spec_xch part2.
	*
	* @param XCH01416 the xch01416 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01416(java.lang.String XCH01416) {
		_vrTechnicalSpec_XCHPart2.setXCH01416(XCH01416);
	}

	/**
	* Sets the xch01417 of this vr technical spec_xch part2.
	*
	* @param XCH01417 the xch01417 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01417(java.lang.String XCH01417) {
		_vrTechnicalSpec_XCHPart2.setXCH01417(XCH01417);
	}

	/**
	* Sets the xch01418 of this vr technical spec_xch part2.
	*
	* @param XCH01418 the xch01418 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01418(java.lang.String XCH01418) {
		_vrTechnicalSpec_XCHPart2.setXCH01418(XCH01418);
	}

	/**
	* Sets the xch01419 of this vr technical spec_xch part2.
	*
	* @param XCH01419 the xch01419 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01419(java.lang.String XCH01419) {
		_vrTechnicalSpec_XCHPart2.setXCH01419(XCH01419);
	}

	/**
	* Sets the xch01420 of this vr technical spec_xch part2.
	*
	* @param XCH01420 the xch01420 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01420(java.lang.String XCH01420) {
		_vrTechnicalSpec_XCHPart2.setXCH01420(XCH01420);
	}

	/**
	* Sets the xch01421 of this vr technical spec_xch part2.
	*
	* @param XCH01421 the xch01421 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01421(java.lang.String XCH01421) {
		_vrTechnicalSpec_XCHPart2.setXCH01421(XCH01421);
	}

	/**
	* Sets the xch01422 of this vr technical spec_xch part2.
	*
	* @param XCH01422 the xch01422 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01422(java.lang.String XCH01422) {
		_vrTechnicalSpec_XCHPart2.setXCH01422(XCH01422);
	}

	/**
	* Sets the xch01423 of this vr technical spec_xch part2.
	*
	* @param XCH01423 the xch01423 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01423(java.lang.String XCH01423) {
		_vrTechnicalSpec_XCHPart2.setXCH01423(XCH01423);
	}

	/**
	* Sets the xch01424 of this vr technical spec_xch part2.
	*
	* @param XCH01424 the xch01424 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01424(java.lang.String XCH01424) {
		_vrTechnicalSpec_XCHPart2.setXCH01424(XCH01424);
	}

	/**
	* Sets the xch01425 of this vr technical spec_xch part2.
	*
	* @param XCH01425 the xch01425 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01425(java.lang.String XCH01425) {
		_vrTechnicalSpec_XCHPart2.setXCH01425(XCH01425);
	}

	/**
	* Sets the xch01426 of this vr technical spec_xch part2.
	*
	* @param XCH01426 the xch01426 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01426(java.lang.String XCH01426) {
		_vrTechnicalSpec_XCHPart2.setXCH01426(XCH01426);
	}

	/**
	* Sets the xch01427 of this vr technical spec_xch part2.
	*
	* @param XCH01427 the xch01427 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01427(java.lang.String XCH01427) {
		_vrTechnicalSpec_XCHPart2.setXCH01427(XCH01427);
	}

	/**
	* Sets the xch01428 of this vr technical spec_xch part2.
	*
	* @param XCH01428 the xch01428 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01428(java.lang.String XCH01428) {
		_vrTechnicalSpec_XCHPart2.setXCH01428(XCH01428);
	}

	/**
	* Sets the xch01429 of this vr technical spec_xch part2.
	*
	* @param XCH01429 the xch01429 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01429(java.lang.String XCH01429) {
		_vrTechnicalSpec_XCHPart2.setXCH01429(XCH01429);
	}

	/**
	* Sets the xch01430 of this vr technical spec_xch part2.
	*
	* @param XCH01430 the xch01430 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01430(java.lang.String XCH01430) {
		_vrTechnicalSpec_XCHPart2.setXCH01430(XCH01430);
	}

	/**
	* Sets the xch01431 of this vr technical spec_xch part2.
	*
	* @param XCH01431 the xch01431 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01431(java.lang.String XCH01431) {
		_vrTechnicalSpec_XCHPart2.setXCH01431(XCH01431);
	}

	/**
	* Sets the xch01432 of this vr technical spec_xch part2.
	*
	* @param XCH01432 the xch01432 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01432(java.lang.String XCH01432) {
		_vrTechnicalSpec_XCHPart2.setXCH01432(XCH01432);
	}

	/**
	* Sets the xch01433 of this vr technical spec_xch part2.
	*
	* @param XCH01433 the xch01433 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01433(java.lang.String XCH01433) {
		_vrTechnicalSpec_XCHPart2.setXCH01433(XCH01433);
	}

	/**
	* Sets the xch01434 of this vr technical spec_xch part2.
	*
	* @param XCH01434 the xch01434 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01434(java.lang.String XCH01434) {
		_vrTechnicalSpec_XCHPart2.setXCH01434(XCH01434);
	}

	/**
	* Sets the xch01435 of this vr technical spec_xch part2.
	*
	* @param XCH01435 the xch01435 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01435(java.lang.String XCH01435) {
		_vrTechnicalSpec_XCHPart2.setXCH01435(XCH01435);
	}

	/**
	* Sets the xch01436 of this vr technical spec_xch part2.
	*
	* @param XCH01436 the xch01436 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01436(java.lang.String XCH01436) {
		_vrTechnicalSpec_XCHPart2.setXCH01436(XCH01436);
	}

	/**
	* Sets the xch01437 of this vr technical spec_xch part2.
	*
	* @param XCH01437 the xch01437 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01437(java.lang.String XCH01437) {
		_vrTechnicalSpec_XCHPart2.setXCH01437(XCH01437);
	}

	/**
	* Sets the xch01438 of this vr technical spec_xch part2.
	*
	* @param XCH01438 the xch01438 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01438(java.lang.String XCH01438) {
		_vrTechnicalSpec_XCHPart2.setXCH01438(XCH01438);
	}

	/**
	* Sets the xch01439 of this vr technical spec_xch part2.
	*
	* @param XCH01439 the xch01439 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01439(java.lang.String XCH01439) {
		_vrTechnicalSpec_XCHPart2.setXCH01439(XCH01439);
	}

	/**
	* Sets the xch01440 of this vr technical spec_xch part2.
	*
	* @param XCH01440 the xch01440 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01440(java.lang.String XCH01440) {
		_vrTechnicalSpec_XCHPart2.setXCH01440(XCH01440);
	}

	/**
	* Sets the xch01441 of this vr technical spec_xch part2.
	*
	* @param XCH01441 the xch01441 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01441(java.lang.String XCH01441) {
		_vrTechnicalSpec_XCHPart2.setXCH01441(XCH01441);
	}

	/**
	* Sets the xch01442 of this vr technical spec_xch part2.
	*
	* @param XCH01442 the xch01442 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01442(java.lang.String XCH01442) {
		_vrTechnicalSpec_XCHPart2.setXCH01442(XCH01442);
	}

	/**
	* Sets the xch01443 of this vr technical spec_xch part2.
	*
	* @param XCH01443 the xch01443 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01443(java.lang.String XCH01443) {
		_vrTechnicalSpec_XCHPart2.setXCH01443(XCH01443);
	}

	/**
	* Sets the xch01444 of this vr technical spec_xch part2.
	*
	* @param XCH01444 the xch01444 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01444(java.lang.String XCH01444) {
		_vrTechnicalSpec_XCHPart2.setXCH01444(XCH01444);
	}

	/**
	* Sets the xch01445 of this vr technical spec_xch part2.
	*
	* @param XCH01445 the xch01445 of this vr technical spec_xch part2
	*/
	@Override
	public void setXCH01445(java.lang.String XCH01445) {
		_vrTechnicalSpec_XCHPart2.setXCH01445(XCH01445);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCHPart2Wrapper)) {
			return false;
		}

		VRTechnicalSpec_XCHPart2Wrapper vrTechnicalSpec_XCHPart2Wrapper = (VRTechnicalSpec_XCHPart2Wrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XCHPart2,
					vrTechnicalSpec_XCHPart2Wrapper._vrTechnicalSpec_XCHPart2)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XCHPart2 getWrappedModel() {
		return _vrTechnicalSpec_XCHPart2;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XCHPart2.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XCHPart2.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XCHPart2.resetOriginalValues();
	}

	private final VRTechnicalSpec_XCHPart2 _vrTechnicalSpec_XCHPart2;
}