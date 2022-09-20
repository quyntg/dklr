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
 * This class is a wrapper for {@link VRTechnicalSpec_XCGPart4}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart4
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart4Wrapper implements VRTechnicalSpec_XCGPart4,
	ModelWrapper<VRTechnicalSpec_XCGPart4> {
	public VRTechnicalSpec_XCGPart4Wrapper(
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4) {
		_vrTechnicalSpec_XCGPart4 = vrTechnicalSpec_XCGPart4;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XCGPart4.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XCGPart4.class.getName();
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
		attributes.put("XCG01496", getXCG01496());
		attributes.put("XCG01497", getXCG01497());
		attributes.put("XCG01498", getXCG01498());
		attributes.put("XCG01499", getXCG01499());
		attributes.put("XCG01500", getXCG01500());
		attributes.put("XCG01501", getXCG01501());
		attributes.put("XCG01502", getXCG01502());
		attributes.put("XCG01503", getXCG01503());
		attributes.put("XCG01504", getXCG01504());
		attributes.put("XCG01505", getXCG01505());
		attributes.put("XCG01506", getXCG01506());
		attributes.put("XCG01507", getXCG01507());
		attributes.put("XCG01508", getXCG01508());
		attributes.put("XCG01509", getXCG01509());
		attributes.put("XCG01510", getXCG01510());
		attributes.put("XCG01512", getXCG01512());
		attributes.put("XCG01513", getXCG01513());
		attributes.put("XCG01514", getXCG01514());
		attributes.put("XCG01515", getXCG01515());
		attributes.put("XCG01516", getXCG01516());
		attributes.put("XCG01517", getXCG01517());
		attributes.put("XCG01518", getXCG01518());
		attributes.put("XCG01519", getXCG01519());
		attributes.put("XCG01520", getXCG01520());
		attributes.put("XCG01521", getXCG01521());
		attributes.put("XCG01522", getXCG01522());
		attributes.put("XCG01523", getXCG01523());
		attributes.put("XCG01524", getXCG01524());
		attributes.put("XCG01525", getXCG01525());
		attributes.put("XCG01526", getXCG01526());
		attributes.put("XCG01527", getXCG01527());
		attributes.put("XCG01528", getXCG01528());
		attributes.put("XCG01529", getXCG01529());
		attributes.put("XCG01530", getXCG01530());
		attributes.put("XCG01531", getXCG01531());
		attributes.put("XCG01904", getXCG01904());
		attributes.put("XCG01533", getXCG01533());
		attributes.put("XCG01905", getXCG01905());
		attributes.put("XCG01534", getXCG01534());
		attributes.put("XCG01906", getXCG01906());
		attributes.put("XCG01535", getXCG01535());
		attributes.put("XCG01907", getXCG01907());
		attributes.put("XCG01536", getXCG01536());
		attributes.put("XCG01908", getXCG01908());
		attributes.put("XCG01537", getXCG01537());
		attributes.put("XCG01909", getXCG01909());
		attributes.put("XCG01538", getXCG01538());
		attributes.put("XCG01910", getXCG01910());
		attributes.put("XCG01539", getXCG01539());
		attributes.put("XCG11535", getXCG11535());
		attributes.put("XCG01541", getXCG01541());
		attributes.put("XCG01542", getXCG01542());
		attributes.put("XCG01911", getXCG01911());
		attributes.put("XCG01543", getXCG01543());
		attributes.put("XCG01912", getXCG01912());
		attributes.put("XCG01544", getXCG01544());
		attributes.put("XCG01545", getXCG01545());
		attributes.put("XCG01546", getXCG01546());
		attributes.put("XCG01547", getXCG01547());
		attributes.put("XCG01548", getXCG01548());
		attributes.put("XCG01913", getXCG01913());
		attributes.put("XCG01549", getXCG01549());
		attributes.put("XCG01914", getXCG01914());
		attributes.put("XCG01550", getXCG01550());
		attributes.put("XCG01551", getXCG01551());
		attributes.put("XCG01552", getXCG01552());
		attributes.put("XCG01553", getXCG01553());
		attributes.put("XCG01554", getXCG01554());
		attributes.put("XCG01915", getXCG01915());
		attributes.put("XCG01555", getXCG01555());
		attributes.put("XCG01556", getXCG01556());
		attributes.put("XCG01557", getXCG01557());
		attributes.put("XCG01558", getXCG01558());
		attributes.put("XCG01559", getXCG01559());
		attributes.put("XCG01560", getXCG01560());
		attributes.put("XCG01561", getXCG01561());
		attributes.put("XCG01916", getXCG01916());
		attributes.put("XCG01562", getXCG01562());
		attributes.put("XCG01917", getXCG01917());
		attributes.put("XCG01563", getXCG01563());
		attributes.put("XCG01918", getXCG01918());
		attributes.put("XCG01564", getXCG01564());
		attributes.put("XCG01565", getXCG01565());
		attributes.put("XCG01566", getXCG01566());
		attributes.put("XCG01567", getXCG01567());
		attributes.put("XCG01568", getXCG01568());
		attributes.put("XCG01919", getXCG01919());
		attributes.put("XCG01569", getXCG01569());
		attributes.put("XCG01570", getXCG01570());
		attributes.put("XCG01571", getXCG01571());
		attributes.put("XCG01572", getXCG01572());
		attributes.put("XCG01920", getXCG01920());
		attributes.put("XCG01573", getXCG01573());
		attributes.put("XCG01921", getXCG01921());
		attributes.put("XCG01574", getXCG01574());
		attributes.put("XCG01922", getXCG01922());
		attributes.put("XCG01575", getXCG01575());
		attributes.put("XCG01576", getXCG01576());
		attributes.put("XCG01577", getXCG01577());
		attributes.put("XCG01578", getXCG01578());
		attributes.put("XCG01579", getXCG01579());
		attributes.put("XCG01580", getXCG01580());
		attributes.put("XCG01581", getXCG01581());
		attributes.put("XCG01582", getXCG01582());
		attributes.put("XCG01583", getXCG01583());
		attributes.put("XCG01584", getXCG01584());
		attributes.put("XCG01585", getXCG01585());
		attributes.put("XCG01586", getXCG01586());
		attributes.put("XCG01587", getXCG01587());
		attributes.put("XCG01588", getXCG01588());
		attributes.put("XCG01589", getXCG01589());
		attributes.put("XCG01590", getXCG01590());
		attributes.put("XCG01591", getXCG01591());
		attributes.put("XCG01592", getXCG01592());
		attributes.put("XCG01593", getXCG01593());
		attributes.put("XCG01594", getXCG01594());
		attributes.put("XCG01595", getXCG01595());
		attributes.put("XCG01596", getXCG01596());
		attributes.put("XCG01597", getXCG01597());
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

		String XCG01496 = (String)attributes.get("XCG01496");

		if (XCG01496 != null) {
			setXCG01496(XCG01496);
		}

		String XCG01497 = (String)attributes.get("XCG01497");

		if (XCG01497 != null) {
			setXCG01497(XCG01497);
		}

		String XCG01498 = (String)attributes.get("XCG01498");

		if (XCG01498 != null) {
			setXCG01498(XCG01498);
		}

		String XCG01499 = (String)attributes.get("XCG01499");

		if (XCG01499 != null) {
			setXCG01499(XCG01499);
		}

		String XCG01500 = (String)attributes.get("XCG01500");

		if (XCG01500 != null) {
			setXCG01500(XCG01500);
		}

		String XCG01501 = (String)attributes.get("XCG01501");

		if (XCG01501 != null) {
			setXCG01501(XCG01501);
		}

		String XCG01502 = (String)attributes.get("XCG01502");

		if (XCG01502 != null) {
			setXCG01502(XCG01502);
		}

		String XCG01503 = (String)attributes.get("XCG01503");

		if (XCG01503 != null) {
			setXCG01503(XCG01503);
		}

		String XCG01504 = (String)attributes.get("XCG01504");

		if (XCG01504 != null) {
			setXCG01504(XCG01504);
		}

		String XCG01505 = (String)attributes.get("XCG01505");

		if (XCG01505 != null) {
			setXCG01505(XCG01505);
		}

		String XCG01506 = (String)attributes.get("XCG01506");

		if (XCG01506 != null) {
			setXCG01506(XCG01506);
		}

		String XCG01507 = (String)attributes.get("XCG01507");

		if (XCG01507 != null) {
			setXCG01507(XCG01507);
		}

		String XCG01508 = (String)attributes.get("XCG01508");

		if (XCG01508 != null) {
			setXCG01508(XCG01508);
		}

		String XCG01509 = (String)attributes.get("XCG01509");

		if (XCG01509 != null) {
			setXCG01509(XCG01509);
		}

		String XCG01510 = (String)attributes.get("XCG01510");

		if (XCG01510 != null) {
			setXCG01510(XCG01510);
		}

		String XCG01512 = (String)attributes.get("XCG01512");

		if (XCG01512 != null) {
			setXCG01512(XCG01512);
		}

		String XCG01513 = (String)attributes.get("XCG01513");

		if (XCG01513 != null) {
			setXCG01513(XCG01513);
		}

		String XCG01514 = (String)attributes.get("XCG01514");

		if (XCG01514 != null) {
			setXCG01514(XCG01514);
		}

		String XCG01515 = (String)attributes.get("XCG01515");

		if (XCG01515 != null) {
			setXCG01515(XCG01515);
		}

		String XCG01516 = (String)attributes.get("XCG01516");

		if (XCG01516 != null) {
			setXCG01516(XCG01516);
		}

		String XCG01517 = (String)attributes.get("XCG01517");

		if (XCG01517 != null) {
			setXCG01517(XCG01517);
		}

		String XCG01518 = (String)attributes.get("XCG01518");

		if (XCG01518 != null) {
			setXCG01518(XCG01518);
		}

		String XCG01519 = (String)attributes.get("XCG01519");

		if (XCG01519 != null) {
			setXCG01519(XCG01519);
		}

		String XCG01520 = (String)attributes.get("XCG01520");

		if (XCG01520 != null) {
			setXCG01520(XCG01520);
		}

		String XCG01521 = (String)attributes.get("XCG01521");

		if (XCG01521 != null) {
			setXCG01521(XCG01521);
		}

		String XCG01522 = (String)attributes.get("XCG01522");

		if (XCG01522 != null) {
			setXCG01522(XCG01522);
		}

		String XCG01523 = (String)attributes.get("XCG01523");

		if (XCG01523 != null) {
			setXCG01523(XCG01523);
		}

		String XCG01524 = (String)attributes.get("XCG01524");

		if (XCG01524 != null) {
			setXCG01524(XCG01524);
		}

		String XCG01525 = (String)attributes.get("XCG01525");

		if (XCG01525 != null) {
			setXCG01525(XCG01525);
		}

		String XCG01526 = (String)attributes.get("XCG01526");

		if (XCG01526 != null) {
			setXCG01526(XCG01526);
		}

		String XCG01527 = (String)attributes.get("XCG01527");

		if (XCG01527 != null) {
			setXCG01527(XCG01527);
		}

		String XCG01528 = (String)attributes.get("XCG01528");

		if (XCG01528 != null) {
			setXCG01528(XCG01528);
		}

		String XCG01529 = (String)attributes.get("XCG01529");

		if (XCG01529 != null) {
			setXCG01529(XCG01529);
		}

		String XCG01530 = (String)attributes.get("XCG01530");

		if (XCG01530 != null) {
			setXCG01530(XCG01530);
		}

		String XCG01531 = (String)attributes.get("XCG01531");

		if (XCG01531 != null) {
			setXCG01531(XCG01531);
		}

		String XCG01904 = (String)attributes.get("XCG01904");

		if (XCG01904 != null) {
			setXCG01904(XCG01904);
		}

		String XCG01533 = (String)attributes.get("XCG01533");

		if (XCG01533 != null) {
			setXCG01533(XCG01533);
		}

		String XCG01905 = (String)attributes.get("XCG01905");

		if (XCG01905 != null) {
			setXCG01905(XCG01905);
		}

		String XCG01534 = (String)attributes.get("XCG01534");

		if (XCG01534 != null) {
			setXCG01534(XCG01534);
		}

		String XCG01906 = (String)attributes.get("XCG01906");

		if (XCG01906 != null) {
			setXCG01906(XCG01906);
		}

		String XCG01535 = (String)attributes.get("XCG01535");

		if (XCG01535 != null) {
			setXCG01535(XCG01535);
		}

		String XCG01907 = (String)attributes.get("XCG01907");

		if (XCG01907 != null) {
			setXCG01907(XCG01907);
		}

		String XCG01536 = (String)attributes.get("XCG01536");

		if (XCG01536 != null) {
			setXCG01536(XCG01536);
		}

		String XCG01908 = (String)attributes.get("XCG01908");

		if (XCG01908 != null) {
			setXCG01908(XCG01908);
		}

		String XCG01537 = (String)attributes.get("XCG01537");

		if (XCG01537 != null) {
			setXCG01537(XCG01537);
		}

		String XCG01909 = (String)attributes.get("XCG01909");

		if (XCG01909 != null) {
			setXCG01909(XCG01909);
		}

		String XCG01538 = (String)attributes.get("XCG01538");

		if (XCG01538 != null) {
			setXCG01538(XCG01538);
		}

		String XCG01910 = (String)attributes.get("XCG01910");

		if (XCG01910 != null) {
			setXCG01910(XCG01910);
		}

		String XCG01539 = (String)attributes.get("XCG01539");

		if (XCG01539 != null) {
			setXCG01539(XCG01539);
		}

		String XCG11535 = (String)attributes.get("XCG11535");

		if (XCG11535 != null) {
			setXCG11535(XCG11535);
		}

		String XCG01541 = (String)attributes.get("XCG01541");

		if (XCG01541 != null) {
			setXCG01541(XCG01541);
		}

		String XCG01542 = (String)attributes.get("XCG01542");

		if (XCG01542 != null) {
			setXCG01542(XCG01542);
		}

		String XCG01911 = (String)attributes.get("XCG01911");

		if (XCG01911 != null) {
			setXCG01911(XCG01911);
		}

		String XCG01543 = (String)attributes.get("XCG01543");

		if (XCG01543 != null) {
			setXCG01543(XCG01543);
		}

		String XCG01912 = (String)attributes.get("XCG01912");

		if (XCG01912 != null) {
			setXCG01912(XCG01912);
		}

		String XCG01544 = (String)attributes.get("XCG01544");

		if (XCG01544 != null) {
			setXCG01544(XCG01544);
		}

		String XCG01545 = (String)attributes.get("XCG01545");

		if (XCG01545 != null) {
			setXCG01545(XCG01545);
		}

		String XCG01546 = (String)attributes.get("XCG01546");

		if (XCG01546 != null) {
			setXCG01546(XCG01546);
		}

		String XCG01547 = (String)attributes.get("XCG01547");

		if (XCG01547 != null) {
			setXCG01547(XCG01547);
		}

		String XCG01548 = (String)attributes.get("XCG01548");

		if (XCG01548 != null) {
			setXCG01548(XCG01548);
		}

		String XCG01913 = (String)attributes.get("XCG01913");

		if (XCG01913 != null) {
			setXCG01913(XCG01913);
		}

		String XCG01549 = (String)attributes.get("XCG01549");

		if (XCG01549 != null) {
			setXCG01549(XCG01549);
		}

		String XCG01914 = (String)attributes.get("XCG01914");

		if (XCG01914 != null) {
			setXCG01914(XCG01914);
		}

		String XCG01550 = (String)attributes.get("XCG01550");

		if (XCG01550 != null) {
			setXCG01550(XCG01550);
		}

		String XCG01551 = (String)attributes.get("XCG01551");

		if (XCG01551 != null) {
			setXCG01551(XCG01551);
		}

		String XCG01552 = (String)attributes.get("XCG01552");

		if (XCG01552 != null) {
			setXCG01552(XCG01552);
		}

		String XCG01553 = (String)attributes.get("XCG01553");

		if (XCG01553 != null) {
			setXCG01553(XCG01553);
		}

		String XCG01554 = (String)attributes.get("XCG01554");

		if (XCG01554 != null) {
			setXCG01554(XCG01554);
		}

		String XCG01915 = (String)attributes.get("XCG01915");

		if (XCG01915 != null) {
			setXCG01915(XCG01915);
		}

		String XCG01555 = (String)attributes.get("XCG01555");

		if (XCG01555 != null) {
			setXCG01555(XCG01555);
		}

		String XCG01556 = (String)attributes.get("XCG01556");

		if (XCG01556 != null) {
			setXCG01556(XCG01556);
		}

		String XCG01557 = (String)attributes.get("XCG01557");

		if (XCG01557 != null) {
			setXCG01557(XCG01557);
		}

		String XCG01558 = (String)attributes.get("XCG01558");

		if (XCG01558 != null) {
			setXCG01558(XCG01558);
		}

		String XCG01559 = (String)attributes.get("XCG01559");

		if (XCG01559 != null) {
			setXCG01559(XCG01559);
		}

		String XCG01560 = (String)attributes.get("XCG01560");

		if (XCG01560 != null) {
			setXCG01560(XCG01560);
		}

		String XCG01561 = (String)attributes.get("XCG01561");

		if (XCG01561 != null) {
			setXCG01561(XCG01561);
		}

		String XCG01916 = (String)attributes.get("XCG01916");

		if (XCG01916 != null) {
			setXCG01916(XCG01916);
		}

		String XCG01562 = (String)attributes.get("XCG01562");

		if (XCG01562 != null) {
			setXCG01562(XCG01562);
		}

		String XCG01917 = (String)attributes.get("XCG01917");

		if (XCG01917 != null) {
			setXCG01917(XCG01917);
		}

		String XCG01563 = (String)attributes.get("XCG01563");

		if (XCG01563 != null) {
			setXCG01563(XCG01563);
		}

		String XCG01918 = (String)attributes.get("XCG01918");

		if (XCG01918 != null) {
			setXCG01918(XCG01918);
		}

		String XCG01564 = (String)attributes.get("XCG01564");

		if (XCG01564 != null) {
			setXCG01564(XCG01564);
		}

		String XCG01565 = (String)attributes.get("XCG01565");

		if (XCG01565 != null) {
			setXCG01565(XCG01565);
		}

		String XCG01566 = (String)attributes.get("XCG01566");

		if (XCG01566 != null) {
			setXCG01566(XCG01566);
		}

		String XCG01567 = (String)attributes.get("XCG01567");

		if (XCG01567 != null) {
			setXCG01567(XCG01567);
		}

		String XCG01568 = (String)attributes.get("XCG01568");

		if (XCG01568 != null) {
			setXCG01568(XCG01568);
		}

		String XCG01919 = (String)attributes.get("XCG01919");

		if (XCG01919 != null) {
			setXCG01919(XCG01919);
		}

		String XCG01569 = (String)attributes.get("XCG01569");

		if (XCG01569 != null) {
			setXCG01569(XCG01569);
		}

		String XCG01570 = (String)attributes.get("XCG01570");

		if (XCG01570 != null) {
			setXCG01570(XCG01570);
		}

		String XCG01571 = (String)attributes.get("XCG01571");

		if (XCG01571 != null) {
			setXCG01571(XCG01571);
		}

		String XCG01572 = (String)attributes.get("XCG01572");

		if (XCG01572 != null) {
			setXCG01572(XCG01572);
		}

		String XCG01920 = (String)attributes.get("XCG01920");

		if (XCG01920 != null) {
			setXCG01920(XCG01920);
		}

		String XCG01573 = (String)attributes.get("XCG01573");

		if (XCG01573 != null) {
			setXCG01573(XCG01573);
		}

		String XCG01921 = (String)attributes.get("XCG01921");

		if (XCG01921 != null) {
			setXCG01921(XCG01921);
		}

		String XCG01574 = (String)attributes.get("XCG01574");

		if (XCG01574 != null) {
			setXCG01574(XCG01574);
		}

		String XCG01922 = (String)attributes.get("XCG01922");

		if (XCG01922 != null) {
			setXCG01922(XCG01922);
		}

		String XCG01575 = (String)attributes.get("XCG01575");

		if (XCG01575 != null) {
			setXCG01575(XCG01575);
		}

		String XCG01576 = (String)attributes.get("XCG01576");

		if (XCG01576 != null) {
			setXCG01576(XCG01576);
		}

		String XCG01577 = (String)attributes.get("XCG01577");

		if (XCG01577 != null) {
			setXCG01577(XCG01577);
		}

		String XCG01578 = (String)attributes.get("XCG01578");

		if (XCG01578 != null) {
			setXCG01578(XCG01578);
		}

		String XCG01579 = (String)attributes.get("XCG01579");

		if (XCG01579 != null) {
			setXCG01579(XCG01579);
		}

		String XCG01580 = (String)attributes.get("XCG01580");

		if (XCG01580 != null) {
			setXCG01580(XCG01580);
		}

		String XCG01581 = (String)attributes.get("XCG01581");

		if (XCG01581 != null) {
			setXCG01581(XCG01581);
		}

		String XCG01582 = (String)attributes.get("XCG01582");

		if (XCG01582 != null) {
			setXCG01582(XCG01582);
		}

		String XCG01583 = (String)attributes.get("XCG01583");

		if (XCG01583 != null) {
			setXCG01583(XCG01583);
		}

		String XCG01584 = (String)attributes.get("XCG01584");

		if (XCG01584 != null) {
			setXCG01584(XCG01584);
		}

		String XCG01585 = (String)attributes.get("XCG01585");

		if (XCG01585 != null) {
			setXCG01585(XCG01585);
		}

		String XCG01586 = (String)attributes.get("XCG01586");

		if (XCG01586 != null) {
			setXCG01586(XCG01586);
		}

		String XCG01587 = (String)attributes.get("XCG01587");

		if (XCG01587 != null) {
			setXCG01587(XCG01587);
		}

		String XCG01588 = (String)attributes.get("XCG01588");

		if (XCG01588 != null) {
			setXCG01588(XCG01588);
		}

		String XCG01589 = (String)attributes.get("XCG01589");

		if (XCG01589 != null) {
			setXCG01589(XCG01589);
		}

		String XCG01590 = (String)attributes.get("XCG01590");

		if (XCG01590 != null) {
			setXCG01590(XCG01590);
		}

		String XCG01591 = (String)attributes.get("XCG01591");

		if (XCG01591 != null) {
			setXCG01591(XCG01591);
		}

		String XCG01592 = (String)attributes.get("XCG01592");

		if (XCG01592 != null) {
			setXCG01592(XCG01592);
		}

		String XCG01593 = (String)attributes.get("XCG01593");

		if (XCG01593 != null) {
			setXCG01593(XCG01593);
		}

		String XCG01594 = (String)attributes.get("XCG01594");

		if (XCG01594 != null) {
			setXCG01594(XCG01594);
		}

		String XCG01595 = (String)attributes.get("XCG01595");

		if (XCG01595 != null) {
			setXCG01595(XCG01595);
		}

		String XCG01596 = (String)attributes.get("XCG01596");

		if (XCG01596 != null) {
			setXCG01596(XCG01596);
		}

		String XCG01597 = (String)attributes.get("XCG01597");

		if (XCG01597 != null) {
			setXCG01597(XCG01597);
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
	public VRTechnicalSpec_XCGPart4 toEscapedModel() {
		return new VRTechnicalSpec_XCGPart4Wrapper(_vrTechnicalSpec_XCGPart4.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XCGPart4 toUnescapedModel() {
		return new VRTechnicalSpec_XCGPart4Wrapper(_vrTechnicalSpec_XCGPart4.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XCGPart4.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XCGPart4.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XCGPart4.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XCGPart4.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XCGPart4> toCacheModel() {
		return _vrTechnicalSpec_XCGPart4.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4) {
		return _vrTechnicalSpec_XCGPart4.compareTo(vrTechnicalSpec_XCGPart4);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XCGPart4.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XCGPart4.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XCGPart4Wrapper((VRTechnicalSpec_XCGPart4)_vrTechnicalSpec_XCGPart4.clone());
	}

	/**
	* Returns the deliverable code of this vr technical spec_xcg part4.
	*
	* @return the deliverable code of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XCGPart4.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xcg part4.
	*
	* @return the dossier ID ctn of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XCGPart4.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xcg part4.
	*
	* @return the dossier no of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XCGPart4.getDossierNo();
	}

	/**
	* Returns the reference uid of this vr technical spec_xcg part4.
	*
	* @return the reference uid of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XCGPart4.getReferenceUid();
	}

	/**
	* Returns the xcg01496 of this vr technical spec_xcg part4.
	*
	* @return the xcg01496 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01496() {
		return _vrTechnicalSpec_XCGPart4.getXCG01496();
	}

	/**
	* Returns the xcg01497 of this vr technical spec_xcg part4.
	*
	* @return the xcg01497 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01497() {
		return _vrTechnicalSpec_XCGPart4.getXCG01497();
	}

	/**
	* Returns the xcg01498 of this vr technical spec_xcg part4.
	*
	* @return the xcg01498 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01498() {
		return _vrTechnicalSpec_XCGPart4.getXCG01498();
	}

	/**
	* Returns the xcg01499 of this vr technical spec_xcg part4.
	*
	* @return the xcg01499 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01499() {
		return _vrTechnicalSpec_XCGPart4.getXCG01499();
	}

	/**
	* Returns the xcg01500 of this vr technical spec_xcg part4.
	*
	* @return the xcg01500 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01500() {
		return _vrTechnicalSpec_XCGPart4.getXCG01500();
	}

	/**
	* Returns the xcg01501 of this vr technical spec_xcg part4.
	*
	* @return the xcg01501 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01501() {
		return _vrTechnicalSpec_XCGPart4.getXCG01501();
	}

	/**
	* Returns the xcg01502 of this vr technical spec_xcg part4.
	*
	* @return the xcg01502 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01502() {
		return _vrTechnicalSpec_XCGPart4.getXCG01502();
	}

	/**
	* Returns the xcg01503 of this vr technical spec_xcg part4.
	*
	* @return the xcg01503 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01503() {
		return _vrTechnicalSpec_XCGPart4.getXCG01503();
	}

	/**
	* Returns the xcg01504 of this vr technical spec_xcg part4.
	*
	* @return the xcg01504 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01504() {
		return _vrTechnicalSpec_XCGPart4.getXCG01504();
	}

	/**
	* Returns the xcg01505 of this vr technical spec_xcg part4.
	*
	* @return the xcg01505 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01505() {
		return _vrTechnicalSpec_XCGPart4.getXCG01505();
	}

	/**
	* Returns the xcg01506 of this vr technical spec_xcg part4.
	*
	* @return the xcg01506 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01506() {
		return _vrTechnicalSpec_XCGPart4.getXCG01506();
	}

	/**
	* Returns the xcg01507 of this vr technical spec_xcg part4.
	*
	* @return the xcg01507 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01507() {
		return _vrTechnicalSpec_XCGPart4.getXCG01507();
	}

	/**
	* Returns the xcg01508 of this vr technical spec_xcg part4.
	*
	* @return the xcg01508 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01508() {
		return _vrTechnicalSpec_XCGPart4.getXCG01508();
	}

	/**
	* Returns the xcg01509 of this vr technical spec_xcg part4.
	*
	* @return the xcg01509 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01509() {
		return _vrTechnicalSpec_XCGPart4.getXCG01509();
	}

	/**
	* Returns the xcg01510 of this vr technical spec_xcg part4.
	*
	* @return the xcg01510 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01510() {
		return _vrTechnicalSpec_XCGPart4.getXCG01510();
	}

	/**
	* Returns the xcg01512 of this vr technical spec_xcg part4.
	*
	* @return the xcg01512 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01512() {
		return _vrTechnicalSpec_XCGPart4.getXCG01512();
	}

	/**
	* Returns the xcg01513 of this vr technical spec_xcg part4.
	*
	* @return the xcg01513 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01513() {
		return _vrTechnicalSpec_XCGPart4.getXCG01513();
	}

	/**
	* Returns the xcg01514 of this vr technical spec_xcg part4.
	*
	* @return the xcg01514 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01514() {
		return _vrTechnicalSpec_XCGPart4.getXCG01514();
	}

	/**
	* Returns the xcg01515 of this vr technical spec_xcg part4.
	*
	* @return the xcg01515 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01515() {
		return _vrTechnicalSpec_XCGPart4.getXCG01515();
	}

	/**
	* Returns the xcg01516 of this vr technical spec_xcg part4.
	*
	* @return the xcg01516 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01516() {
		return _vrTechnicalSpec_XCGPart4.getXCG01516();
	}

	/**
	* Returns the xcg01517 of this vr technical spec_xcg part4.
	*
	* @return the xcg01517 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01517() {
		return _vrTechnicalSpec_XCGPart4.getXCG01517();
	}

	/**
	* Returns the xcg01518 of this vr technical spec_xcg part4.
	*
	* @return the xcg01518 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01518() {
		return _vrTechnicalSpec_XCGPart4.getXCG01518();
	}

	/**
	* Returns the xcg01519 of this vr technical spec_xcg part4.
	*
	* @return the xcg01519 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01519() {
		return _vrTechnicalSpec_XCGPart4.getXCG01519();
	}

	/**
	* Returns the xcg01520 of this vr technical spec_xcg part4.
	*
	* @return the xcg01520 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01520() {
		return _vrTechnicalSpec_XCGPart4.getXCG01520();
	}

	/**
	* Returns the xcg01521 of this vr technical spec_xcg part4.
	*
	* @return the xcg01521 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01521() {
		return _vrTechnicalSpec_XCGPart4.getXCG01521();
	}

	/**
	* Returns the xcg01522 of this vr technical spec_xcg part4.
	*
	* @return the xcg01522 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01522() {
		return _vrTechnicalSpec_XCGPart4.getXCG01522();
	}

	/**
	* Returns the xcg01523 of this vr technical spec_xcg part4.
	*
	* @return the xcg01523 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01523() {
		return _vrTechnicalSpec_XCGPart4.getXCG01523();
	}

	/**
	* Returns the xcg01524 of this vr technical spec_xcg part4.
	*
	* @return the xcg01524 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01524() {
		return _vrTechnicalSpec_XCGPart4.getXCG01524();
	}

	/**
	* Returns the xcg01525 of this vr technical spec_xcg part4.
	*
	* @return the xcg01525 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01525() {
		return _vrTechnicalSpec_XCGPart4.getXCG01525();
	}

	/**
	* Returns the xcg01526 of this vr technical spec_xcg part4.
	*
	* @return the xcg01526 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01526() {
		return _vrTechnicalSpec_XCGPart4.getXCG01526();
	}

	/**
	* Returns the xcg01527 of this vr technical spec_xcg part4.
	*
	* @return the xcg01527 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01527() {
		return _vrTechnicalSpec_XCGPart4.getXCG01527();
	}

	/**
	* Returns the xcg01528 of this vr technical spec_xcg part4.
	*
	* @return the xcg01528 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01528() {
		return _vrTechnicalSpec_XCGPart4.getXCG01528();
	}

	/**
	* Returns the xcg01529 of this vr technical spec_xcg part4.
	*
	* @return the xcg01529 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01529() {
		return _vrTechnicalSpec_XCGPart4.getXCG01529();
	}

	/**
	* Returns the xcg01530 of this vr technical spec_xcg part4.
	*
	* @return the xcg01530 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01530() {
		return _vrTechnicalSpec_XCGPart4.getXCG01530();
	}

	/**
	* Returns the xcg01531 of this vr technical spec_xcg part4.
	*
	* @return the xcg01531 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01531() {
		return _vrTechnicalSpec_XCGPart4.getXCG01531();
	}

	/**
	* Returns the xcg01533 of this vr technical spec_xcg part4.
	*
	* @return the xcg01533 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01533() {
		return _vrTechnicalSpec_XCGPart4.getXCG01533();
	}

	/**
	* Returns the xcg01534 of this vr technical spec_xcg part4.
	*
	* @return the xcg01534 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01534() {
		return _vrTechnicalSpec_XCGPart4.getXCG01534();
	}

	/**
	* Returns the xcg01535 of this vr technical spec_xcg part4.
	*
	* @return the xcg01535 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01535() {
		return _vrTechnicalSpec_XCGPart4.getXCG01535();
	}

	/**
	* Returns the xcg01536 of this vr technical spec_xcg part4.
	*
	* @return the xcg01536 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01536() {
		return _vrTechnicalSpec_XCGPart4.getXCG01536();
	}

	/**
	* Returns the xcg01537 of this vr technical spec_xcg part4.
	*
	* @return the xcg01537 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01537() {
		return _vrTechnicalSpec_XCGPart4.getXCG01537();
	}

	/**
	* Returns the xcg01538 of this vr technical spec_xcg part4.
	*
	* @return the xcg01538 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01538() {
		return _vrTechnicalSpec_XCGPart4.getXCG01538();
	}

	/**
	* Returns the xcg01539 of this vr technical spec_xcg part4.
	*
	* @return the xcg01539 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01539() {
		return _vrTechnicalSpec_XCGPart4.getXCG01539();
	}

	/**
	* Returns the xcg01541 of this vr technical spec_xcg part4.
	*
	* @return the xcg01541 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01541() {
		return _vrTechnicalSpec_XCGPart4.getXCG01541();
	}

	/**
	* Returns the xcg01542 of this vr technical spec_xcg part4.
	*
	* @return the xcg01542 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01542() {
		return _vrTechnicalSpec_XCGPart4.getXCG01542();
	}

	/**
	* Returns the xcg01543 of this vr technical spec_xcg part4.
	*
	* @return the xcg01543 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01543() {
		return _vrTechnicalSpec_XCGPart4.getXCG01543();
	}

	/**
	* Returns the xcg01544 of this vr technical spec_xcg part4.
	*
	* @return the xcg01544 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01544() {
		return _vrTechnicalSpec_XCGPart4.getXCG01544();
	}

	/**
	* Returns the xcg01545 of this vr technical spec_xcg part4.
	*
	* @return the xcg01545 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01545() {
		return _vrTechnicalSpec_XCGPart4.getXCG01545();
	}

	/**
	* Returns the xcg01546 of this vr technical spec_xcg part4.
	*
	* @return the xcg01546 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01546() {
		return _vrTechnicalSpec_XCGPart4.getXCG01546();
	}

	/**
	* Returns the xcg01547 of this vr technical spec_xcg part4.
	*
	* @return the xcg01547 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01547() {
		return _vrTechnicalSpec_XCGPart4.getXCG01547();
	}

	/**
	* Returns the xcg01548 of this vr technical spec_xcg part4.
	*
	* @return the xcg01548 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01548() {
		return _vrTechnicalSpec_XCGPart4.getXCG01548();
	}

	/**
	* Returns the xcg01549 of this vr technical spec_xcg part4.
	*
	* @return the xcg01549 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01549() {
		return _vrTechnicalSpec_XCGPart4.getXCG01549();
	}

	/**
	* Returns the xcg01550 of this vr technical spec_xcg part4.
	*
	* @return the xcg01550 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01550() {
		return _vrTechnicalSpec_XCGPart4.getXCG01550();
	}

	/**
	* Returns the xcg01551 of this vr technical spec_xcg part4.
	*
	* @return the xcg01551 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01551() {
		return _vrTechnicalSpec_XCGPart4.getXCG01551();
	}

	/**
	* Returns the xcg01552 of this vr technical spec_xcg part4.
	*
	* @return the xcg01552 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01552() {
		return _vrTechnicalSpec_XCGPart4.getXCG01552();
	}

	/**
	* Returns the xcg01553 of this vr technical spec_xcg part4.
	*
	* @return the xcg01553 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01553() {
		return _vrTechnicalSpec_XCGPart4.getXCG01553();
	}

	/**
	* Returns the xcg01554 of this vr technical spec_xcg part4.
	*
	* @return the xcg01554 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01554() {
		return _vrTechnicalSpec_XCGPart4.getXCG01554();
	}

	/**
	* Returns the xcg01555 of this vr technical spec_xcg part4.
	*
	* @return the xcg01555 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01555() {
		return _vrTechnicalSpec_XCGPart4.getXCG01555();
	}

	/**
	* Returns the xcg01556 of this vr technical spec_xcg part4.
	*
	* @return the xcg01556 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01556() {
		return _vrTechnicalSpec_XCGPart4.getXCG01556();
	}

	/**
	* Returns the xcg01557 of this vr technical spec_xcg part4.
	*
	* @return the xcg01557 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01557() {
		return _vrTechnicalSpec_XCGPart4.getXCG01557();
	}

	/**
	* Returns the xcg01558 of this vr technical spec_xcg part4.
	*
	* @return the xcg01558 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01558() {
		return _vrTechnicalSpec_XCGPart4.getXCG01558();
	}

	/**
	* Returns the xcg01559 of this vr technical spec_xcg part4.
	*
	* @return the xcg01559 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01559() {
		return _vrTechnicalSpec_XCGPart4.getXCG01559();
	}

	/**
	* Returns the xcg01560 of this vr technical spec_xcg part4.
	*
	* @return the xcg01560 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01560() {
		return _vrTechnicalSpec_XCGPart4.getXCG01560();
	}

	/**
	* Returns the xcg01561 of this vr technical spec_xcg part4.
	*
	* @return the xcg01561 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01561() {
		return _vrTechnicalSpec_XCGPart4.getXCG01561();
	}

	/**
	* Returns the xcg01562 of this vr technical spec_xcg part4.
	*
	* @return the xcg01562 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01562() {
		return _vrTechnicalSpec_XCGPart4.getXCG01562();
	}

	/**
	* Returns the xcg01563 of this vr technical spec_xcg part4.
	*
	* @return the xcg01563 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01563() {
		return _vrTechnicalSpec_XCGPart4.getXCG01563();
	}

	/**
	* Returns the xcg01564 of this vr technical spec_xcg part4.
	*
	* @return the xcg01564 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01564() {
		return _vrTechnicalSpec_XCGPart4.getXCG01564();
	}

	/**
	* Returns the xcg01565 of this vr technical spec_xcg part4.
	*
	* @return the xcg01565 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01565() {
		return _vrTechnicalSpec_XCGPart4.getXCG01565();
	}

	/**
	* Returns the xcg01566 of this vr technical spec_xcg part4.
	*
	* @return the xcg01566 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01566() {
		return _vrTechnicalSpec_XCGPart4.getXCG01566();
	}

	/**
	* Returns the xcg01567 of this vr technical spec_xcg part4.
	*
	* @return the xcg01567 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01567() {
		return _vrTechnicalSpec_XCGPart4.getXCG01567();
	}

	/**
	* Returns the xcg01568 of this vr technical spec_xcg part4.
	*
	* @return the xcg01568 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01568() {
		return _vrTechnicalSpec_XCGPart4.getXCG01568();
	}

	/**
	* Returns the xcg01569 of this vr technical spec_xcg part4.
	*
	* @return the xcg01569 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01569() {
		return _vrTechnicalSpec_XCGPart4.getXCG01569();
	}

	/**
	* Returns the xcg01570 of this vr technical spec_xcg part4.
	*
	* @return the xcg01570 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01570() {
		return _vrTechnicalSpec_XCGPart4.getXCG01570();
	}

	/**
	* Returns the xcg01571 of this vr technical spec_xcg part4.
	*
	* @return the xcg01571 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01571() {
		return _vrTechnicalSpec_XCGPart4.getXCG01571();
	}

	/**
	* Returns the xcg01572 of this vr technical spec_xcg part4.
	*
	* @return the xcg01572 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01572() {
		return _vrTechnicalSpec_XCGPart4.getXCG01572();
	}

	/**
	* Returns the xcg01573 of this vr technical spec_xcg part4.
	*
	* @return the xcg01573 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01573() {
		return _vrTechnicalSpec_XCGPart4.getXCG01573();
	}

	/**
	* Returns the xcg01574 of this vr technical spec_xcg part4.
	*
	* @return the xcg01574 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01574() {
		return _vrTechnicalSpec_XCGPart4.getXCG01574();
	}

	/**
	* Returns the xcg01575 of this vr technical spec_xcg part4.
	*
	* @return the xcg01575 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01575() {
		return _vrTechnicalSpec_XCGPart4.getXCG01575();
	}

	/**
	* Returns the xcg01576 of this vr technical spec_xcg part4.
	*
	* @return the xcg01576 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01576() {
		return _vrTechnicalSpec_XCGPart4.getXCG01576();
	}

	/**
	* Returns the xcg01577 of this vr technical spec_xcg part4.
	*
	* @return the xcg01577 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01577() {
		return _vrTechnicalSpec_XCGPart4.getXCG01577();
	}

	/**
	* Returns the xcg01578 of this vr technical spec_xcg part4.
	*
	* @return the xcg01578 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01578() {
		return _vrTechnicalSpec_XCGPart4.getXCG01578();
	}

	/**
	* Returns the xcg01579 of this vr technical spec_xcg part4.
	*
	* @return the xcg01579 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01579() {
		return _vrTechnicalSpec_XCGPart4.getXCG01579();
	}

	/**
	* Returns the xcg01580 of this vr technical spec_xcg part4.
	*
	* @return the xcg01580 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01580() {
		return _vrTechnicalSpec_XCGPart4.getXCG01580();
	}

	/**
	* Returns the xcg01581 of this vr technical spec_xcg part4.
	*
	* @return the xcg01581 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01581() {
		return _vrTechnicalSpec_XCGPart4.getXCG01581();
	}

	/**
	* Returns the xcg01582 of this vr technical spec_xcg part4.
	*
	* @return the xcg01582 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01582() {
		return _vrTechnicalSpec_XCGPart4.getXCG01582();
	}

	/**
	* Returns the xcg01583 of this vr technical spec_xcg part4.
	*
	* @return the xcg01583 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01583() {
		return _vrTechnicalSpec_XCGPart4.getXCG01583();
	}

	/**
	* Returns the xcg01584 of this vr technical spec_xcg part4.
	*
	* @return the xcg01584 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01584() {
		return _vrTechnicalSpec_XCGPart4.getXCG01584();
	}

	/**
	* Returns the xcg01585 of this vr technical spec_xcg part4.
	*
	* @return the xcg01585 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01585() {
		return _vrTechnicalSpec_XCGPart4.getXCG01585();
	}

	/**
	* Returns the xcg01586 of this vr technical spec_xcg part4.
	*
	* @return the xcg01586 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01586() {
		return _vrTechnicalSpec_XCGPart4.getXCG01586();
	}

	/**
	* Returns the xcg01587 of this vr technical spec_xcg part4.
	*
	* @return the xcg01587 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01587() {
		return _vrTechnicalSpec_XCGPart4.getXCG01587();
	}

	/**
	* Returns the xcg01588 of this vr technical spec_xcg part4.
	*
	* @return the xcg01588 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01588() {
		return _vrTechnicalSpec_XCGPart4.getXCG01588();
	}

	/**
	* Returns the xcg01589 of this vr technical spec_xcg part4.
	*
	* @return the xcg01589 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01589() {
		return _vrTechnicalSpec_XCGPart4.getXCG01589();
	}

	/**
	* Returns the xcg01590 of this vr technical spec_xcg part4.
	*
	* @return the xcg01590 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01590() {
		return _vrTechnicalSpec_XCGPart4.getXCG01590();
	}

	/**
	* Returns the xcg01591 of this vr technical spec_xcg part4.
	*
	* @return the xcg01591 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01591() {
		return _vrTechnicalSpec_XCGPart4.getXCG01591();
	}

	/**
	* Returns the xcg01592 of this vr technical spec_xcg part4.
	*
	* @return the xcg01592 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01592() {
		return _vrTechnicalSpec_XCGPart4.getXCG01592();
	}

	/**
	* Returns the xcg01593 of this vr technical spec_xcg part4.
	*
	* @return the xcg01593 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01593() {
		return _vrTechnicalSpec_XCGPart4.getXCG01593();
	}

	/**
	* Returns the xcg01594 of this vr technical spec_xcg part4.
	*
	* @return the xcg01594 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01594() {
		return _vrTechnicalSpec_XCGPart4.getXCG01594();
	}

	/**
	* Returns the xcg01595 of this vr technical spec_xcg part4.
	*
	* @return the xcg01595 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01595() {
		return _vrTechnicalSpec_XCGPart4.getXCG01595();
	}

	/**
	* Returns the xcg01596 of this vr technical spec_xcg part4.
	*
	* @return the xcg01596 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01596() {
		return _vrTechnicalSpec_XCGPart4.getXCG01596();
	}

	/**
	* Returns the xcg01597 of this vr technical spec_xcg part4.
	*
	* @return the xcg01597 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01597() {
		return _vrTechnicalSpec_XCGPart4.getXCG01597();
	}

	/**
	* Returns the xcg01904 of this vr technical spec_xcg part4.
	*
	* @return the xcg01904 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01904() {
		return _vrTechnicalSpec_XCGPart4.getXCG01904();
	}

	/**
	* Returns the xcg01905 of this vr technical spec_xcg part4.
	*
	* @return the xcg01905 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01905() {
		return _vrTechnicalSpec_XCGPart4.getXCG01905();
	}

	/**
	* Returns the xcg01906 of this vr technical spec_xcg part4.
	*
	* @return the xcg01906 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01906() {
		return _vrTechnicalSpec_XCGPart4.getXCG01906();
	}

	/**
	* Returns the xcg01907 of this vr technical spec_xcg part4.
	*
	* @return the xcg01907 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01907() {
		return _vrTechnicalSpec_XCGPart4.getXCG01907();
	}

	/**
	* Returns the xcg01908 of this vr technical spec_xcg part4.
	*
	* @return the xcg01908 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01908() {
		return _vrTechnicalSpec_XCGPart4.getXCG01908();
	}

	/**
	* Returns the xcg01909 of this vr technical spec_xcg part4.
	*
	* @return the xcg01909 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01909() {
		return _vrTechnicalSpec_XCGPart4.getXCG01909();
	}

	/**
	* Returns the xcg01910 of this vr technical spec_xcg part4.
	*
	* @return the xcg01910 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01910() {
		return _vrTechnicalSpec_XCGPart4.getXCG01910();
	}

	/**
	* Returns the xcg01911 of this vr technical spec_xcg part4.
	*
	* @return the xcg01911 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01911() {
		return _vrTechnicalSpec_XCGPart4.getXCG01911();
	}

	/**
	* Returns the xcg01912 of this vr technical spec_xcg part4.
	*
	* @return the xcg01912 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01912() {
		return _vrTechnicalSpec_XCGPart4.getXCG01912();
	}

	/**
	* Returns the xcg01913 of this vr technical spec_xcg part4.
	*
	* @return the xcg01913 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01913() {
		return _vrTechnicalSpec_XCGPart4.getXCG01913();
	}

	/**
	* Returns the xcg01914 of this vr technical spec_xcg part4.
	*
	* @return the xcg01914 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01914() {
		return _vrTechnicalSpec_XCGPart4.getXCG01914();
	}

	/**
	* Returns the xcg01915 of this vr technical spec_xcg part4.
	*
	* @return the xcg01915 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01915() {
		return _vrTechnicalSpec_XCGPart4.getXCG01915();
	}

	/**
	* Returns the xcg01916 of this vr technical spec_xcg part4.
	*
	* @return the xcg01916 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01916() {
		return _vrTechnicalSpec_XCGPart4.getXCG01916();
	}

	/**
	* Returns the xcg01917 of this vr technical spec_xcg part4.
	*
	* @return the xcg01917 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01917() {
		return _vrTechnicalSpec_XCGPart4.getXCG01917();
	}

	/**
	* Returns the xcg01918 of this vr technical spec_xcg part4.
	*
	* @return the xcg01918 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01918() {
		return _vrTechnicalSpec_XCGPart4.getXCG01918();
	}

	/**
	* Returns the xcg01919 of this vr technical spec_xcg part4.
	*
	* @return the xcg01919 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01919() {
		return _vrTechnicalSpec_XCGPart4.getXCG01919();
	}

	/**
	* Returns the xcg01920 of this vr technical spec_xcg part4.
	*
	* @return the xcg01920 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01920() {
		return _vrTechnicalSpec_XCGPart4.getXCG01920();
	}

	/**
	* Returns the xcg01921 of this vr technical spec_xcg part4.
	*
	* @return the xcg01921 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01921() {
		return _vrTechnicalSpec_XCGPart4.getXCG01921();
	}

	/**
	* Returns the xcg01922 of this vr technical spec_xcg part4.
	*
	* @return the xcg01922 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG01922() {
		return _vrTechnicalSpec_XCGPart4.getXCG01922();
	}

	/**
	* Returns the xcg11535 of this vr technical spec_xcg part4.
	*
	* @return the xcg11535 of this vr technical spec_xcg part4
	*/
	@Override
	public java.lang.String getXCG11535() {
		return _vrTechnicalSpec_XCGPart4.getXCG11535();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XCGPart4.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XCGPart4.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xcg part4.
	*
	* @return the modify date of this vr technical spec_xcg part4
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XCGPart4.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xcg part4.
	*
	* @return the sync date of this vr technical spec_xcg part4
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XCGPart4.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xcg part4.
	*
	* @return the convert assemble ID of this vr technical spec_xcg part4
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XCGPart4.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xcg part4.
	*
	* @return the dossier ID of this vr technical spec_xcg part4
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XCGPart4.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xcg part4.
	*
	* @return the ID of this vr technical spec_xcg part4
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XCGPart4.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xcg part4.
	*
	* @return the mt core of this vr technical spec_xcg part4
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XCGPart4.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xcg part4.
	*
	* @return the primary key of this vr technical spec_xcg part4
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XCGPart4.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xcg part4.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xcg part4
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XCGPart4.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XCGPart4.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XCGPart4.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xcg part4.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xcg part4
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XCGPart4.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xcg part4.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xcg part4
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XCGPart4.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xcg part4.
	*
	* @param dossierId the dossier ID of this vr technical spec_xcg part4
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XCGPart4.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xcg part4.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xcg part4
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XCGPart4.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xcg part4.
	*
	* @param dossierNo the dossier no of this vr technical spec_xcg part4
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XCGPart4.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XCGPart4.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XCGPart4.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XCGPart4.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xcg part4.
	*
	* @param id the ID of this vr technical spec_xcg part4
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XCGPart4.setId(id);
	}

	/**
	* Sets the modify date of this vr technical spec_xcg part4.
	*
	* @param modifyDate the modify date of this vr technical spec_xcg part4
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XCGPart4.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xcg part4.
	*
	* @param mtCore the mt core of this vr technical spec_xcg part4
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XCGPart4.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XCGPart4.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xcg part4.
	*
	* @param primaryKey the primary key of this vr technical spec_xcg part4
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XCGPart4.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XCGPart4.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xcg part4.
	*
	* @param referenceUid the reference uid of this vr technical spec_xcg part4
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XCGPart4.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xcg part4.
	*
	* @param syncDate the sync date of this vr technical spec_xcg part4
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XCGPart4.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xcg part4.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xcg part4
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XCGPart4.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xcg01496 of this vr technical spec_xcg part4.
	*
	* @param XCG01496 the xcg01496 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01496(java.lang.String XCG01496) {
		_vrTechnicalSpec_XCGPart4.setXCG01496(XCG01496);
	}

	/**
	* Sets the xcg01497 of this vr technical spec_xcg part4.
	*
	* @param XCG01497 the xcg01497 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01497(java.lang.String XCG01497) {
		_vrTechnicalSpec_XCGPart4.setXCG01497(XCG01497);
	}

	/**
	* Sets the xcg01498 of this vr technical spec_xcg part4.
	*
	* @param XCG01498 the xcg01498 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01498(java.lang.String XCG01498) {
		_vrTechnicalSpec_XCGPart4.setXCG01498(XCG01498);
	}

	/**
	* Sets the xcg01499 of this vr technical spec_xcg part4.
	*
	* @param XCG01499 the xcg01499 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01499(java.lang.String XCG01499) {
		_vrTechnicalSpec_XCGPart4.setXCG01499(XCG01499);
	}

	/**
	* Sets the xcg01500 of this vr technical spec_xcg part4.
	*
	* @param XCG01500 the xcg01500 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01500(java.lang.String XCG01500) {
		_vrTechnicalSpec_XCGPart4.setXCG01500(XCG01500);
	}

	/**
	* Sets the xcg01501 of this vr technical spec_xcg part4.
	*
	* @param XCG01501 the xcg01501 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01501(java.lang.String XCG01501) {
		_vrTechnicalSpec_XCGPart4.setXCG01501(XCG01501);
	}

	/**
	* Sets the xcg01502 of this vr technical spec_xcg part4.
	*
	* @param XCG01502 the xcg01502 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01502(java.lang.String XCG01502) {
		_vrTechnicalSpec_XCGPart4.setXCG01502(XCG01502);
	}

	/**
	* Sets the xcg01503 of this vr technical spec_xcg part4.
	*
	* @param XCG01503 the xcg01503 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01503(java.lang.String XCG01503) {
		_vrTechnicalSpec_XCGPart4.setXCG01503(XCG01503);
	}

	/**
	* Sets the xcg01504 of this vr technical spec_xcg part4.
	*
	* @param XCG01504 the xcg01504 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01504(java.lang.String XCG01504) {
		_vrTechnicalSpec_XCGPart4.setXCG01504(XCG01504);
	}

	/**
	* Sets the xcg01505 of this vr technical spec_xcg part4.
	*
	* @param XCG01505 the xcg01505 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01505(java.lang.String XCG01505) {
		_vrTechnicalSpec_XCGPart4.setXCG01505(XCG01505);
	}

	/**
	* Sets the xcg01506 of this vr technical spec_xcg part4.
	*
	* @param XCG01506 the xcg01506 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01506(java.lang.String XCG01506) {
		_vrTechnicalSpec_XCGPart4.setXCG01506(XCG01506);
	}

	/**
	* Sets the xcg01507 of this vr technical spec_xcg part4.
	*
	* @param XCG01507 the xcg01507 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01507(java.lang.String XCG01507) {
		_vrTechnicalSpec_XCGPart4.setXCG01507(XCG01507);
	}

	/**
	* Sets the xcg01508 of this vr technical spec_xcg part4.
	*
	* @param XCG01508 the xcg01508 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01508(java.lang.String XCG01508) {
		_vrTechnicalSpec_XCGPart4.setXCG01508(XCG01508);
	}

	/**
	* Sets the xcg01509 of this vr technical spec_xcg part4.
	*
	* @param XCG01509 the xcg01509 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01509(java.lang.String XCG01509) {
		_vrTechnicalSpec_XCGPart4.setXCG01509(XCG01509);
	}

	/**
	* Sets the xcg01510 of this vr technical spec_xcg part4.
	*
	* @param XCG01510 the xcg01510 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01510(java.lang.String XCG01510) {
		_vrTechnicalSpec_XCGPart4.setXCG01510(XCG01510);
	}

	/**
	* Sets the xcg01512 of this vr technical spec_xcg part4.
	*
	* @param XCG01512 the xcg01512 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01512(java.lang.String XCG01512) {
		_vrTechnicalSpec_XCGPart4.setXCG01512(XCG01512);
	}

	/**
	* Sets the xcg01513 of this vr technical spec_xcg part4.
	*
	* @param XCG01513 the xcg01513 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01513(java.lang.String XCG01513) {
		_vrTechnicalSpec_XCGPart4.setXCG01513(XCG01513);
	}

	/**
	* Sets the xcg01514 of this vr technical spec_xcg part4.
	*
	* @param XCG01514 the xcg01514 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01514(java.lang.String XCG01514) {
		_vrTechnicalSpec_XCGPart4.setXCG01514(XCG01514);
	}

	/**
	* Sets the xcg01515 of this vr technical spec_xcg part4.
	*
	* @param XCG01515 the xcg01515 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01515(java.lang.String XCG01515) {
		_vrTechnicalSpec_XCGPart4.setXCG01515(XCG01515);
	}

	/**
	* Sets the xcg01516 of this vr technical spec_xcg part4.
	*
	* @param XCG01516 the xcg01516 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01516(java.lang.String XCG01516) {
		_vrTechnicalSpec_XCGPart4.setXCG01516(XCG01516);
	}

	/**
	* Sets the xcg01517 of this vr technical spec_xcg part4.
	*
	* @param XCG01517 the xcg01517 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01517(java.lang.String XCG01517) {
		_vrTechnicalSpec_XCGPart4.setXCG01517(XCG01517);
	}

	/**
	* Sets the xcg01518 of this vr technical spec_xcg part4.
	*
	* @param XCG01518 the xcg01518 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01518(java.lang.String XCG01518) {
		_vrTechnicalSpec_XCGPart4.setXCG01518(XCG01518);
	}

	/**
	* Sets the xcg01519 of this vr technical spec_xcg part4.
	*
	* @param XCG01519 the xcg01519 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01519(java.lang.String XCG01519) {
		_vrTechnicalSpec_XCGPart4.setXCG01519(XCG01519);
	}

	/**
	* Sets the xcg01520 of this vr technical spec_xcg part4.
	*
	* @param XCG01520 the xcg01520 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01520(java.lang.String XCG01520) {
		_vrTechnicalSpec_XCGPart4.setXCG01520(XCG01520);
	}

	/**
	* Sets the xcg01521 of this vr technical spec_xcg part4.
	*
	* @param XCG01521 the xcg01521 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01521(java.lang.String XCG01521) {
		_vrTechnicalSpec_XCGPart4.setXCG01521(XCG01521);
	}

	/**
	* Sets the xcg01522 of this vr technical spec_xcg part4.
	*
	* @param XCG01522 the xcg01522 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01522(java.lang.String XCG01522) {
		_vrTechnicalSpec_XCGPart4.setXCG01522(XCG01522);
	}

	/**
	* Sets the xcg01523 of this vr technical spec_xcg part4.
	*
	* @param XCG01523 the xcg01523 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01523(java.lang.String XCG01523) {
		_vrTechnicalSpec_XCGPart4.setXCG01523(XCG01523);
	}

	/**
	* Sets the xcg01524 of this vr technical spec_xcg part4.
	*
	* @param XCG01524 the xcg01524 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01524(java.lang.String XCG01524) {
		_vrTechnicalSpec_XCGPart4.setXCG01524(XCG01524);
	}

	/**
	* Sets the xcg01525 of this vr technical spec_xcg part4.
	*
	* @param XCG01525 the xcg01525 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01525(java.lang.String XCG01525) {
		_vrTechnicalSpec_XCGPart4.setXCG01525(XCG01525);
	}

	/**
	* Sets the xcg01526 of this vr technical spec_xcg part4.
	*
	* @param XCG01526 the xcg01526 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01526(java.lang.String XCG01526) {
		_vrTechnicalSpec_XCGPart4.setXCG01526(XCG01526);
	}

	/**
	* Sets the xcg01527 of this vr technical spec_xcg part4.
	*
	* @param XCG01527 the xcg01527 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01527(java.lang.String XCG01527) {
		_vrTechnicalSpec_XCGPart4.setXCG01527(XCG01527);
	}

	/**
	* Sets the xcg01528 of this vr technical spec_xcg part4.
	*
	* @param XCG01528 the xcg01528 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01528(java.lang.String XCG01528) {
		_vrTechnicalSpec_XCGPart4.setXCG01528(XCG01528);
	}

	/**
	* Sets the xcg01529 of this vr technical spec_xcg part4.
	*
	* @param XCG01529 the xcg01529 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01529(java.lang.String XCG01529) {
		_vrTechnicalSpec_XCGPart4.setXCG01529(XCG01529);
	}

	/**
	* Sets the xcg01530 of this vr technical spec_xcg part4.
	*
	* @param XCG01530 the xcg01530 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01530(java.lang.String XCG01530) {
		_vrTechnicalSpec_XCGPart4.setXCG01530(XCG01530);
	}

	/**
	* Sets the xcg01531 of this vr technical spec_xcg part4.
	*
	* @param XCG01531 the xcg01531 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01531(java.lang.String XCG01531) {
		_vrTechnicalSpec_XCGPart4.setXCG01531(XCG01531);
	}

	/**
	* Sets the xcg01533 of this vr technical spec_xcg part4.
	*
	* @param XCG01533 the xcg01533 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01533(java.lang.String XCG01533) {
		_vrTechnicalSpec_XCGPart4.setXCG01533(XCG01533);
	}

	/**
	* Sets the xcg01534 of this vr technical spec_xcg part4.
	*
	* @param XCG01534 the xcg01534 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01534(java.lang.String XCG01534) {
		_vrTechnicalSpec_XCGPart4.setXCG01534(XCG01534);
	}

	/**
	* Sets the xcg01535 of this vr technical spec_xcg part4.
	*
	* @param XCG01535 the xcg01535 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01535(java.lang.String XCG01535) {
		_vrTechnicalSpec_XCGPart4.setXCG01535(XCG01535);
	}

	/**
	* Sets the xcg01536 of this vr technical spec_xcg part4.
	*
	* @param XCG01536 the xcg01536 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01536(java.lang.String XCG01536) {
		_vrTechnicalSpec_XCGPart4.setXCG01536(XCG01536);
	}

	/**
	* Sets the xcg01537 of this vr technical spec_xcg part4.
	*
	* @param XCG01537 the xcg01537 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01537(java.lang.String XCG01537) {
		_vrTechnicalSpec_XCGPart4.setXCG01537(XCG01537);
	}

	/**
	* Sets the xcg01538 of this vr technical spec_xcg part4.
	*
	* @param XCG01538 the xcg01538 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01538(java.lang.String XCG01538) {
		_vrTechnicalSpec_XCGPart4.setXCG01538(XCG01538);
	}

	/**
	* Sets the xcg01539 of this vr technical spec_xcg part4.
	*
	* @param XCG01539 the xcg01539 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01539(java.lang.String XCG01539) {
		_vrTechnicalSpec_XCGPart4.setXCG01539(XCG01539);
	}

	/**
	* Sets the xcg01541 of this vr technical spec_xcg part4.
	*
	* @param XCG01541 the xcg01541 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01541(java.lang.String XCG01541) {
		_vrTechnicalSpec_XCGPart4.setXCG01541(XCG01541);
	}

	/**
	* Sets the xcg01542 of this vr technical spec_xcg part4.
	*
	* @param XCG01542 the xcg01542 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01542(java.lang.String XCG01542) {
		_vrTechnicalSpec_XCGPart4.setXCG01542(XCG01542);
	}

	/**
	* Sets the xcg01543 of this vr technical spec_xcg part4.
	*
	* @param XCG01543 the xcg01543 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01543(java.lang.String XCG01543) {
		_vrTechnicalSpec_XCGPart4.setXCG01543(XCG01543);
	}

	/**
	* Sets the xcg01544 of this vr technical spec_xcg part4.
	*
	* @param XCG01544 the xcg01544 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01544(java.lang.String XCG01544) {
		_vrTechnicalSpec_XCGPart4.setXCG01544(XCG01544);
	}

	/**
	* Sets the xcg01545 of this vr technical spec_xcg part4.
	*
	* @param XCG01545 the xcg01545 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01545(java.lang.String XCG01545) {
		_vrTechnicalSpec_XCGPart4.setXCG01545(XCG01545);
	}

	/**
	* Sets the xcg01546 of this vr technical spec_xcg part4.
	*
	* @param XCG01546 the xcg01546 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01546(java.lang.String XCG01546) {
		_vrTechnicalSpec_XCGPart4.setXCG01546(XCG01546);
	}

	/**
	* Sets the xcg01547 of this vr technical spec_xcg part4.
	*
	* @param XCG01547 the xcg01547 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01547(java.lang.String XCG01547) {
		_vrTechnicalSpec_XCGPart4.setXCG01547(XCG01547);
	}

	/**
	* Sets the xcg01548 of this vr technical spec_xcg part4.
	*
	* @param XCG01548 the xcg01548 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01548(java.lang.String XCG01548) {
		_vrTechnicalSpec_XCGPart4.setXCG01548(XCG01548);
	}

	/**
	* Sets the xcg01549 of this vr technical spec_xcg part4.
	*
	* @param XCG01549 the xcg01549 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01549(java.lang.String XCG01549) {
		_vrTechnicalSpec_XCGPart4.setXCG01549(XCG01549);
	}

	/**
	* Sets the xcg01550 of this vr technical spec_xcg part4.
	*
	* @param XCG01550 the xcg01550 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01550(java.lang.String XCG01550) {
		_vrTechnicalSpec_XCGPart4.setXCG01550(XCG01550);
	}

	/**
	* Sets the xcg01551 of this vr technical spec_xcg part4.
	*
	* @param XCG01551 the xcg01551 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01551(java.lang.String XCG01551) {
		_vrTechnicalSpec_XCGPart4.setXCG01551(XCG01551);
	}

	/**
	* Sets the xcg01552 of this vr technical spec_xcg part4.
	*
	* @param XCG01552 the xcg01552 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01552(java.lang.String XCG01552) {
		_vrTechnicalSpec_XCGPart4.setXCG01552(XCG01552);
	}

	/**
	* Sets the xcg01553 of this vr technical spec_xcg part4.
	*
	* @param XCG01553 the xcg01553 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01553(java.lang.String XCG01553) {
		_vrTechnicalSpec_XCGPart4.setXCG01553(XCG01553);
	}

	/**
	* Sets the xcg01554 of this vr technical spec_xcg part4.
	*
	* @param XCG01554 the xcg01554 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01554(java.lang.String XCG01554) {
		_vrTechnicalSpec_XCGPart4.setXCG01554(XCG01554);
	}

	/**
	* Sets the xcg01555 of this vr technical spec_xcg part4.
	*
	* @param XCG01555 the xcg01555 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01555(java.lang.String XCG01555) {
		_vrTechnicalSpec_XCGPart4.setXCG01555(XCG01555);
	}

	/**
	* Sets the xcg01556 of this vr technical spec_xcg part4.
	*
	* @param XCG01556 the xcg01556 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01556(java.lang.String XCG01556) {
		_vrTechnicalSpec_XCGPart4.setXCG01556(XCG01556);
	}

	/**
	* Sets the xcg01557 of this vr technical spec_xcg part4.
	*
	* @param XCG01557 the xcg01557 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01557(java.lang.String XCG01557) {
		_vrTechnicalSpec_XCGPart4.setXCG01557(XCG01557);
	}

	/**
	* Sets the xcg01558 of this vr technical spec_xcg part4.
	*
	* @param XCG01558 the xcg01558 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01558(java.lang.String XCG01558) {
		_vrTechnicalSpec_XCGPart4.setXCG01558(XCG01558);
	}

	/**
	* Sets the xcg01559 of this vr technical spec_xcg part4.
	*
	* @param XCG01559 the xcg01559 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01559(java.lang.String XCG01559) {
		_vrTechnicalSpec_XCGPart4.setXCG01559(XCG01559);
	}

	/**
	* Sets the xcg01560 of this vr technical spec_xcg part4.
	*
	* @param XCG01560 the xcg01560 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01560(java.lang.String XCG01560) {
		_vrTechnicalSpec_XCGPart4.setXCG01560(XCG01560);
	}

	/**
	* Sets the xcg01561 of this vr technical spec_xcg part4.
	*
	* @param XCG01561 the xcg01561 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01561(java.lang.String XCG01561) {
		_vrTechnicalSpec_XCGPart4.setXCG01561(XCG01561);
	}

	/**
	* Sets the xcg01562 of this vr technical spec_xcg part4.
	*
	* @param XCG01562 the xcg01562 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01562(java.lang.String XCG01562) {
		_vrTechnicalSpec_XCGPart4.setXCG01562(XCG01562);
	}

	/**
	* Sets the xcg01563 of this vr technical spec_xcg part4.
	*
	* @param XCG01563 the xcg01563 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01563(java.lang.String XCG01563) {
		_vrTechnicalSpec_XCGPart4.setXCG01563(XCG01563);
	}

	/**
	* Sets the xcg01564 of this vr technical spec_xcg part4.
	*
	* @param XCG01564 the xcg01564 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01564(java.lang.String XCG01564) {
		_vrTechnicalSpec_XCGPart4.setXCG01564(XCG01564);
	}

	/**
	* Sets the xcg01565 of this vr technical spec_xcg part4.
	*
	* @param XCG01565 the xcg01565 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01565(java.lang.String XCG01565) {
		_vrTechnicalSpec_XCGPart4.setXCG01565(XCG01565);
	}

	/**
	* Sets the xcg01566 of this vr technical spec_xcg part4.
	*
	* @param XCG01566 the xcg01566 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01566(java.lang.String XCG01566) {
		_vrTechnicalSpec_XCGPart4.setXCG01566(XCG01566);
	}

	/**
	* Sets the xcg01567 of this vr technical spec_xcg part4.
	*
	* @param XCG01567 the xcg01567 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01567(java.lang.String XCG01567) {
		_vrTechnicalSpec_XCGPart4.setXCG01567(XCG01567);
	}

	/**
	* Sets the xcg01568 of this vr technical spec_xcg part4.
	*
	* @param XCG01568 the xcg01568 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01568(java.lang.String XCG01568) {
		_vrTechnicalSpec_XCGPart4.setXCG01568(XCG01568);
	}

	/**
	* Sets the xcg01569 of this vr technical spec_xcg part4.
	*
	* @param XCG01569 the xcg01569 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01569(java.lang.String XCG01569) {
		_vrTechnicalSpec_XCGPart4.setXCG01569(XCG01569);
	}

	/**
	* Sets the xcg01570 of this vr technical spec_xcg part4.
	*
	* @param XCG01570 the xcg01570 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01570(java.lang.String XCG01570) {
		_vrTechnicalSpec_XCGPart4.setXCG01570(XCG01570);
	}

	/**
	* Sets the xcg01571 of this vr technical spec_xcg part4.
	*
	* @param XCG01571 the xcg01571 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01571(java.lang.String XCG01571) {
		_vrTechnicalSpec_XCGPart4.setXCG01571(XCG01571);
	}

	/**
	* Sets the xcg01572 of this vr technical spec_xcg part4.
	*
	* @param XCG01572 the xcg01572 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01572(java.lang.String XCG01572) {
		_vrTechnicalSpec_XCGPart4.setXCG01572(XCG01572);
	}

	/**
	* Sets the xcg01573 of this vr technical spec_xcg part4.
	*
	* @param XCG01573 the xcg01573 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01573(java.lang.String XCG01573) {
		_vrTechnicalSpec_XCGPart4.setXCG01573(XCG01573);
	}

	/**
	* Sets the xcg01574 of this vr technical spec_xcg part4.
	*
	* @param XCG01574 the xcg01574 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01574(java.lang.String XCG01574) {
		_vrTechnicalSpec_XCGPart4.setXCG01574(XCG01574);
	}

	/**
	* Sets the xcg01575 of this vr technical spec_xcg part4.
	*
	* @param XCG01575 the xcg01575 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01575(java.lang.String XCG01575) {
		_vrTechnicalSpec_XCGPart4.setXCG01575(XCG01575);
	}

	/**
	* Sets the xcg01576 of this vr technical spec_xcg part4.
	*
	* @param XCG01576 the xcg01576 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01576(java.lang.String XCG01576) {
		_vrTechnicalSpec_XCGPart4.setXCG01576(XCG01576);
	}

	/**
	* Sets the xcg01577 of this vr technical spec_xcg part4.
	*
	* @param XCG01577 the xcg01577 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01577(java.lang.String XCG01577) {
		_vrTechnicalSpec_XCGPart4.setXCG01577(XCG01577);
	}

	/**
	* Sets the xcg01578 of this vr technical spec_xcg part4.
	*
	* @param XCG01578 the xcg01578 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01578(java.lang.String XCG01578) {
		_vrTechnicalSpec_XCGPart4.setXCG01578(XCG01578);
	}

	/**
	* Sets the xcg01579 of this vr technical spec_xcg part4.
	*
	* @param XCG01579 the xcg01579 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01579(java.lang.String XCG01579) {
		_vrTechnicalSpec_XCGPart4.setXCG01579(XCG01579);
	}

	/**
	* Sets the xcg01580 of this vr technical spec_xcg part4.
	*
	* @param XCG01580 the xcg01580 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01580(java.lang.String XCG01580) {
		_vrTechnicalSpec_XCGPart4.setXCG01580(XCG01580);
	}

	/**
	* Sets the xcg01581 of this vr technical spec_xcg part4.
	*
	* @param XCG01581 the xcg01581 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01581(java.lang.String XCG01581) {
		_vrTechnicalSpec_XCGPart4.setXCG01581(XCG01581);
	}

	/**
	* Sets the xcg01582 of this vr technical spec_xcg part4.
	*
	* @param XCG01582 the xcg01582 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01582(java.lang.String XCG01582) {
		_vrTechnicalSpec_XCGPart4.setXCG01582(XCG01582);
	}

	/**
	* Sets the xcg01583 of this vr technical spec_xcg part4.
	*
	* @param XCG01583 the xcg01583 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01583(java.lang.String XCG01583) {
		_vrTechnicalSpec_XCGPart4.setXCG01583(XCG01583);
	}

	/**
	* Sets the xcg01584 of this vr technical spec_xcg part4.
	*
	* @param XCG01584 the xcg01584 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01584(java.lang.String XCG01584) {
		_vrTechnicalSpec_XCGPart4.setXCG01584(XCG01584);
	}

	/**
	* Sets the xcg01585 of this vr technical spec_xcg part4.
	*
	* @param XCG01585 the xcg01585 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01585(java.lang.String XCG01585) {
		_vrTechnicalSpec_XCGPart4.setXCG01585(XCG01585);
	}

	/**
	* Sets the xcg01586 of this vr technical spec_xcg part4.
	*
	* @param XCG01586 the xcg01586 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01586(java.lang.String XCG01586) {
		_vrTechnicalSpec_XCGPart4.setXCG01586(XCG01586);
	}

	/**
	* Sets the xcg01587 of this vr technical spec_xcg part4.
	*
	* @param XCG01587 the xcg01587 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01587(java.lang.String XCG01587) {
		_vrTechnicalSpec_XCGPart4.setXCG01587(XCG01587);
	}

	/**
	* Sets the xcg01588 of this vr technical spec_xcg part4.
	*
	* @param XCG01588 the xcg01588 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01588(java.lang.String XCG01588) {
		_vrTechnicalSpec_XCGPart4.setXCG01588(XCG01588);
	}

	/**
	* Sets the xcg01589 of this vr technical spec_xcg part4.
	*
	* @param XCG01589 the xcg01589 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01589(java.lang.String XCG01589) {
		_vrTechnicalSpec_XCGPart4.setXCG01589(XCG01589);
	}

	/**
	* Sets the xcg01590 of this vr technical spec_xcg part4.
	*
	* @param XCG01590 the xcg01590 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01590(java.lang.String XCG01590) {
		_vrTechnicalSpec_XCGPart4.setXCG01590(XCG01590);
	}

	/**
	* Sets the xcg01591 of this vr technical spec_xcg part4.
	*
	* @param XCG01591 the xcg01591 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01591(java.lang.String XCG01591) {
		_vrTechnicalSpec_XCGPart4.setXCG01591(XCG01591);
	}

	/**
	* Sets the xcg01592 of this vr technical spec_xcg part4.
	*
	* @param XCG01592 the xcg01592 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01592(java.lang.String XCG01592) {
		_vrTechnicalSpec_XCGPart4.setXCG01592(XCG01592);
	}

	/**
	* Sets the xcg01593 of this vr technical spec_xcg part4.
	*
	* @param XCG01593 the xcg01593 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01593(java.lang.String XCG01593) {
		_vrTechnicalSpec_XCGPart4.setXCG01593(XCG01593);
	}

	/**
	* Sets the xcg01594 of this vr technical spec_xcg part4.
	*
	* @param XCG01594 the xcg01594 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01594(java.lang.String XCG01594) {
		_vrTechnicalSpec_XCGPart4.setXCG01594(XCG01594);
	}

	/**
	* Sets the xcg01595 of this vr technical spec_xcg part4.
	*
	* @param XCG01595 the xcg01595 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01595(java.lang.String XCG01595) {
		_vrTechnicalSpec_XCGPart4.setXCG01595(XCG01595);
	}

	/**
	* Sets the xcg01596 of this vr technical spec_xcg part4.
	*
	* @param XCG01596 the xcg01596 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01596(java.lang.String XCG01596) {
		_vrTechnicalSpec_XCGPart4.setXCG01596(XCG01596);
	}

	/**
	* Sets the xcg01597 of this vr technical spec_xcg part4.
	*
	* @param XCG01597 the xcg01597 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01597(java.lang.String XCG01597) {
		_vrTechnicalSpec_XCGPart4.setXCG01597(XCG01597);
	}

	/**
	* Sets the xcg01904 of this vr technical spec_xcg part4.
	*
	* @param XCG01904 the xcg01904 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01904(java.lang.String XCG01904) {
		_vrTechnicalSpec_XCGPart4.setXCG01904(XCG01904);
	}

	/**
	* Sets the xcg01905 of this vr technical spec_xcg part4.
	*
	* @param XCG01905 the xcg01905 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01905(java.lang.String XCG01905) {
		_vrTechnicalSpec_XCGPart4.setXCG01905(XCG01905);
	}

	/**
	* Sets the xcg01906 of this vr technical spec_xcg part4.
	*
	* @param XCG01906 the xcg01906 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01906(java.lang.String XCG01906) {
		_vrTechnicalSpec_XCGPart4.setXCG01906(XCG01906);
	}

	/**
	* Sets the xcg01907 of this vr technical spec_xcg part4.
	*
	* @param XCG01907 the xcg01907 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01907(java.lang.String XCG01907) {
		_vrTechnicalSpec_XCGPart4.setXCG01907(XCG01907);
	}

	/**
	* Sets the xcg01908 of this vr technical spec_xcg part4.
	*
	* @param XCG01908 the xcg01908 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01908(java.lang.String XCG01908) {
		_vrTechnicalSpec_XCGPart4.setXCG01908(XCG01908);
	}

	/**
	* Sets the xcg01909 of this vr technical spec_xcg part4.
	*
	* @param XCG01909 the xcg01909 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01909(java.lang.String XCG01909) {
		_vrTechnicalSpec_XCGPart4.setXCG01909(XCG01909);
	}

	/**
	* Sets the xcg01910 of this vr technical spec_xcg part4.
	*
	* @param XCG01910 the xcg01910 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01910(java.lang.String XCG01910) {
		_vrTechnicalSpec_XCGPart4.setXCG01910(XCG01910);
	}

	/**
	* Sets the xcg01911 of this vr technical spec_xcg part4.
	*
	* @param XCG01911 the xcg01911 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01911(java.lang.String XCG01911) {
		_vrTechnicalSpec_XCGPart4.setXCG01911(XCG01911);
	}

	/**
	* Sets the xcg01912 of this vr technical spec_xcg part4.
	*
	* @param XCG01912 the xcg01912 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01912(java.lang.String XCG01912) {
		_vrTechnicalSpec_XCGPart4.setXCG01912(XCG01912);
	}

	/**
	* Sets the xcg01913 of this vr technical spec_xcg part4.
	*
	* @param XCG01913 the xcg01913 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01913(java.lang.String XCG01913) {
		_vrTechnicalSpec_XCGPart4.setXCG01913(XCG01913);
	}

	/**
	* Sets the xcg01914 of this vr technical spec_xcg part4.
	*
	* @param XCG01914 the xcg01914 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01914(java.lang.String XCG01914) {
		_vrTechnicalSpec_XCGPart4.setXCG01914(XCG01914);
	}

	/**
	* Sets the xcg01915 of this vr technical spec_xcg part4.
	*
	* @param XCG01915 the xcg01915 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01915(java.lang.String XCG01915) {
		_vrTechnicalSpec_XCGPart4.setXCG01915(XCG01915);
	}

	/**
	* Sets the xcg01916 of this vr technical spec_xcg part4.
	*
	* @param XCG01916 the xcg01916 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01916(java.lang.String XCG01916) {
		_vrTechnicalSpec_XCGPart4.setXCG01916(XCG01916);
	}

	/**
	* Sets the xcg01917 of this vr technical spec_xcg part4.
	*
	* @param XCG01917 the xcg01917 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01917(java.lang.String XCG01917) {
		_vrTechnicalSpec_XCGPart4.setXCG01917(XCG01917);
	}

	/**
	* Sets the xcg01918 of this vr technical spec_xcg part4.
	*
	* @param XCG01918 the xcg01918 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01918(java.lang.String XCG01918) {
		_vrTechnicalSpec_XCGPart4.setXCG01918(XCG01918);
	}

	/**
	* Sets the xcg01919 of this vr technical spec_xcg part4.
	*
	* @param XCG01919 the xcg01919 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01919(java.lang.String XCG01919) {
		_vrTechnicalSpec_XCGPart4.setXCG01919(XCG01919);
	}

	/**
	* Sets the xcg01920 of this vr technical spec_xcg part4.
	*
	* @param XCG01920 the xcg01920 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01920(java.lang.String XCG01920) {
		_vrTechnicalSpec_XCGPart4.setXCG01920(XCG01920);
	}

	/**
	* Sets the xcg01921 of this vr technical spec_xcg part4.
	*
	* @param XCG01921 the xcg01921 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01921(java.lang.String XCG01921) {
		_vrTechnicalSpec_XCGPart4.setXCG01921(XCG01921);
	}

	/**
	* Sets the xcg01922 of this vr technical spec_xcg part4.
	*
	* @param XCG01922 the xcg01922 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG01922(java.lang.String XCG01922) {
		_vrTechnicalSpec_XCGPart4.setXCG01922(XCG01922);
	}

	/**
	* Sets the xcg11535 of this vr technical spec_xcg part4.
	*
	* @param XCG11535 the xcg11535 of this vr technical spec_xcg part4
	*/
	@Override
	public void setXCG11535(java.lang.String XCG11535) {
		_vrTechnicalSpec_XCGPart4.setXCG11535(XCG11535);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGPart4Wrapper)) {
			return false;
		}

		VRTechnicalSpec_XCGPart4Wrapper vrTechnicalSpec_XCGPart4Wrapper = (VRTechnicalSpec_XCGPart4Wrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XCGPart4,
					vrTechnicalSpec_XCGPart4Wrapper._vrTechnicalSpec_XCGPart4)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XCGPart4 getWrappedModel() {
		return _vrTechnicalSpec_XCGPart4;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XCGPart4.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XCGPart4.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XCGPart4.resetOriginalValues();
	}

	private final VRTechnicalSpec_XCGPart4 _vrTechnicalSpec_XCGPart4;
}