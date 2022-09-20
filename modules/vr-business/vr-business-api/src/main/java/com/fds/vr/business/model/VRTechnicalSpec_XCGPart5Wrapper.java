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
 * This class is a wrapper for {@link VRTechnicalSpec_XCGPart5}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart5
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart5Wrapper implements VRTechnicalSpec_XCGPart5,
	ModelWrapper<VRTechnicalSpec_XCGPart5> {
	public VRTechnicalSpec_XCGPart5Wrapper(
		VRTechnicalSpec_XCGPart5 vrTechnicalSpec_XCGPart5) {
		_vrTechnicalSpec_XCGPart5 = vrTechnicalSpec_XCGPart5;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XCGPart5.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XCGPart5.class.getName();
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
		attributes.put("XCG01598", getXCG01598());
		attributes.put("XCG01599", getXCG01599());
		attributes.put("XCG01600", getXCG01600());
		attributes.put("XCG01601", getXCG01601());
		attributes.put("XCG01602", getXCG01602());
		attributes.put("XCG01603", getXCG01603());
		attributes.put("XCG01923", getXCG01923());
		attributes.put("XCG01604", getXCG01604());
		attributes.put("XCG01924", getXCG01924());
		attributes.put("XCG01605", getXCG01605());
		attributes.put("XCG01606", getXCG01606());
		attributes.put("XCG01607", getXCG01607());
		attributes.put("XCG01608", getXCG01608());
		attributes.put("XCG01609", getXCG01609());
		attributes.put("XCG01925", getXCG01925());
		attributes.put("XCG01610", getXCG01610());
		attributes.put("XCG01926", getXCG01926());
		attributes.put("XCG01611", getXCG01611());
		attributes.put("XCG01612", getXCG01612());
		attributes.put("XCG01928", getXCG01928());
		attributes.put("XCG01613", getXCG01613());
		attributes.put("XCG01929", getXCG01929());
		attributes.put("XCG01614", getXCG01614());
		attributes.put("XCG01930", getXCG01930());
		attributes.put("XCG01615", getXCG01615());
		attributes.put("XCG01931", getXCG01931());
		attributes.put("XCG01616", getXCG01616());
		attributes.put("XCG01932", getXCG01932());
		attributes.put("XCG01617", getXCG01617());
		attributes.put("XCG01933", getXCG01933());
		attributes.put("XCG01618", getXCG01618());
		attributes.put("XCG01934", getXCG01934());
		attributes.put("XCG01619", getXCG01619());
		attributes.put("XCG01935", getXCG01935());
		attributes.put("XCG01620", getXCG01620());
		attributes.put("XCG01936", getXCG01936());
		attributes.put("XCG01621", getXCG01621());
		attributes.put("XCG01937", getXCG01937());
		attributes.put("XCG01622", getXCG01622());
		attributes.put("XCG01938", getXCG01938());
		attributes.put("XCG01623", getXCG01623());
		attributes.put("XCG01939", getXCG01939());
		attributes.put("XCG01624", getXCG01624());
		attributes.put("XCG01940", getXCG01940());
		attributes.put("XCG01625", getXCG01625());
		attributes.put("XCG01941", getXCG01941());
		attributes.put("XCG01626", getXCG01626());
		attributes.put("XCG01942", getXCG01942());
		attributes.put("XCG01627", getXCG01627());
		attributes.put("XCG01943", getXCG01943());
		attributes.put("XCG01628", getXCG01628());
		attributes.put("XCG01944", getXCG01944());
		attributes.put("XCG01630", getXCG01630());
		attributes.put("XCG01631", getXCG01631());
		attributes.put("XCG01632", getXCG01632());
		attributes.put("XCG01633", getXCG01633());
		attributes.put("XCG01634", getXCG01634());
		attributes.put("XCG01635", getXCG01635());
		attributes.put("XCG01636", getXCG01636());
		attributes.put("XCG01637", getXCG01637());
		attributes.put("XCG01638", getXCG01638());
		attributes.put("XCG01639", getXCG01639());
		attributes.put("XCG01640", getXCG01640());
		attributes.put("XCG01641", getXCG01641());
		attributes.put("XCG01642", getXCG01642());
		attributes.put("XCG01643", getXCG01643());
		attributes.put("XCG01644", getXCG01644());
		attributes.put("XCG01645", getXCG01645());
		attributes.put("XCG01646", getXCG01646());
		attributes.put("XCG01647", getXCG01647());
		attributes.put("XCG01648", getXCG01648());
		attributes.put("XCG01649", getXCG01649());
		attributes.put("XCG01650", getXCG01650());
		attributes.put("XCG01651", getXCG01651());
		attributes.put("XCG01652", getXCG01652());
		attributes.put("XCG01653", getXCG01653());
		attributes.put("XCG01654", getXCG01654());
		attributes.put("XCG01655", getXCG01655());
		attributes.put("XCG01656", getXCG01656());
		attributes.put("XCG01657", getXCG01657());
		attributes.put("XCG01658", getXCG01658());
		attributes.put("XCG01659", getXCG01659());
		attributes.put("XCG01660", getXCG01660());
		attributes.put("XCG01661", getXCG01661());
		attributes.put("XCG01662", getXCG01662());
		attributes.put("XCG01663", getXCG01663());
		attributes.put("XCG01664", getXCG01664());
		attributes.put("XCG01665", getXCG01665());
		attributes.put("XCG01666", getXCG01666());
		attributes.put("XCG01667", getXCG01667());
		attributes.put("XCG01668", getXCG01668());
		attributes.put("XCG01669", getXCG01669());
		attributes.put("XCG01670", getXCG01670());
		attributes.put("XCG01671", getXCG01671());
		attributes.put("XCG01672", getXCG01672());
		attributes.put("XCG01673", getXCG01673());
		attributes.put("XCG01674", getXCG01674());
		attributes.put("XCG01675", getXCG01675());
		attributes.put("XCG01676", getXCG01676());
		attributes.put("XCG01677", getXCG01677());
		attributes.put("XCG01678", getXCG01678());
		attributes.put("XCG01679", getXCG01679());
		attributes.put("XCG01680", getXCG01680());
		attributes.put("XCG01681", getXCG01681());
		attributes.put("XCG01682", getXCG01682());
		attributes.put("XCG01683", getXCG01683());
		attributes.put("XCG01684", getXCG01684());
		attributes.put("XCG01685", getXCG01685());
		attributes.put("XCG01686", getXCG01686());
		attributes.put("XCG01687", getXCG01687());
		attributes.put("XCG01688", getXCG01688());
		attributes.put("XCG01689", getXCG01689());
		attributes.put("XCG01690", getXCG01690());
		attributes.put("XCG01691", getXCG01691());
		attributes.put("XCG01692", getXCG01692());
		attributes.put("XCG01693", getXCG01693());
		attributes.put("XCG01694", getXCG01694());
		attributes.put("XCG01695", getXCG01695());
		attributes.put("XCG01696", getXCG01696());
		attributes.put("XCG01697", getXCG01697());
		attributes.put("XCG01698", getXCG01698());
		attributes.put("XCG01699", getXCG01699());
		attributes.put("XCG01700", getXCG01700());
		attributes.put("XCG01701", getXCG01701());
		attributes.put("XCG01702", getXCG01702());
		attributes.put("XCG01703", getXCG01703());
		attributes.put("XCG01704", getXCG01704());
		attributes.put("XCG01705", getXCG01705());
		attributes.put("XCG01706", getXCG01706());
		attributes.put("XCG01707", getXCG01707());
		attributes.put("XCG01708", getXCG01708());
		attributes.put("XCG01709", getXCG01709());
		attributes.put("XCG01710", getXCG01710());
		attributes.put("XCG01711", getXCG01711());
		attributes.put("XCG01712", getXCG01712());
		attributes.put("XCG01713", getXCG01713());
		attributes.put("XCG01714", getXCG01714());
		attributes.put("XCG01715", getXCG01715());
		attributes.put("XCG01716", getXCG01716());
		attributes.put("XCG01717", getXCG01717());
		attributes.put("XCG01718", getXCG01718());
		attributes.put("XCG01719", getXCG01719());
		attributes.put("XCG01720", getXCG01720());
		attributes.put("XCG01721", getXCG01721());
		attributes.put("XCG01722", getXCG01722());
		attributes.put("XCG01723", getXCG01723());
		attributes.put("XCG01724", getXCG01724());
		attributes.put("XCG01725", getXCG01725());
		attributes.put("XCG01726", getXCG01726());
		attributes.put("XCG01727", getXCG01727());
		attributes.put("XCG01728", getXCG01728());
		attributes.put("XCG01729", getXCG01729());
		attributes.put("XCG01730", getXCG01730());
		attributes.put("XCG01731", getXCG01731());
		attributes.put("XCG01732", getXCG01732());
		attributes.put("XCG01733", getXCG01733());
		attributes.put("XCG01734", getXCG01734());
		attributes.put("XCG01735", getXCG01735());
		attributes.put("XCG01736", getXCG01736());
		attributes.put("XCG01737", getXCG01737());
		attributes.put("XCG01738", getXCG01738());
		attributes.put("XCG01739", getXCG01739());
		attributes.put("XCG01740", getXCG01740());
		attributes.put("XCG01741", getXCG01741());
		attributes.put("XCG01742", getXCG01742());
		attributes.put("XCG01744", getXCG01744());
		attributes.put("XCG01745", getXCG01745());
		attributes.put("XCG01746", getXCG01746());
		attributes.put("XCG01747", getXCG01747());
		attributes.put("XCG01748", getXCG01748());
		attributes.put("XCG01749", getXCG01749());
		attributes.put("XCG01945", getXCG01945());
		attributes.put("XCG01750", getXCG01750());
		attributes.put("XCG01946", getXCG01946());
		attributes.put("XCG01751", getXCG01751());
		attributes.put("XCG01752", getXCG01752());
		attributes.put("XCG01753", getXCG01753());
		attributes.put("XCG01754", getXCG01754());
		attributes.put("XCG01756", getXCG01756());
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

		String XCG01598 = (String)attributes.get("XCG01598");

		if (XCG01598 != null) {
			setXCG01598(XCG01598);
		}

		String XCG01599 = (String)attributes.get("XCG01599");

		if (XCG01599 != null) {
			setXCG01599(XCG01599);
		}

		String XCG01600 = (String)attributes.get("XCG01600");

		if (XCG01600 != null) {
			setXCG01600(XCG01600);
		}

		String XCG01601 = (String)attributes.get("XCG01601");

		if (XCG01601 != null) {
			setXCG01601(XCG01601);
		}

		String XCG01602 = (String)attributes.get("XCG01602");

		if (XCG01602 != null) {
			setXCG01602(XCG01602);
		}

		String XCG01603 = (String)attributes.get("XCG01603");

		if (XCG01603 != null) {
			setXCG01603(XCG01603);
		}

		String XCG01923 = (String)attributes.get("XCG01923");

		if (XCG01923 != null) {
			setXCG01923(XCG01923);
		}

		String XCG01604 = (String)attributes.get("XCG01604");

		if (XCG01604 != null) {
			setXCG01604(XCG01604);
		}

		String XCG01924 = (String)attributes.get("XCG01924");

		if (XCG01924 != null) {
			setXCG01924(XCG01924);
		}

		String XCG01605 = (String)attributes.get("XCG01605");

		if (XCG01605 != null) {
			setXCG01605(XCG01605);
		}

		String XCG01606 = (String)attributes.get("XCG01606");

		if (XCG01606 != null) {
			setXCG01606(XCG01606);
		}

		String XCG01607 = (String)attributes.get("XCG01607");

		if (XCG01607 != null) {
			setXCG01607(XCG01607);
		}

		String XCG01608 = (String)attributes.get("XCG01608");

		if (XCG01608 != null) {
			setXCG01608(XCG01608);
		}

		String XCG01609 = (String)attributes.get("XCG01609");

		if (XCG01609 != null) {
			setXCG01609(XCG01609);
		}

		String XCG01925 = (String)attributes.get("XCG01925");

		if (XCG01925 != null) {
			setXCG01925(XCG01925);
		}

		String XCG01610 = (String)attributes.get("XCG01610");

		if (XCG01610 != null) {
			setXCG01610(XCG01610);
		}

		String XCG01926 = (String)attributes.get("XCG01926");

		if (XCG01926 != null) {
			setXCG01926(XCG01926);
		}

		String XCG01611 = (String)attributes.get("XCG01611");

		if (XCG01611 != null) {
			setXCG01611(XCG01611);
		}

		String XCG01612 = (String)attributes.get("XCG01612");

		if (XCG01612 != null) {
			setXCG01612(XCG01612);
		}

		String XCG01928 = (String)attributes.get("XCG01928");

		if (XCG01928 != null) {
			setXCG01928(XCG01928);
		}

		String XCG01613 = (String)attributes.get("XCG01613");

		if (XCG01613 != null) {
			setXCG01613(XCG01613);
		}

		String XCG01929 = (String)attributes.get("XCG01929");

		if (XCG01929 != null) {
			setXCG01929(XCG01929);
		}

		String XCG01614 = (String)attributes.get("XCG01614");

		if (XCG01614 != null) {
			setXCG01614(XCG01614);
		}

		String XCG01930 = (String)attributes.get("XCG01930");

		if (XCG01930 != null) {
			setXCG01930(XCG01930);
		}

		String XCG01615 = (String)attributes.get("XCG01615");

		if (XCG01615 != null) {
			setXCG01615(XCG01615);
		}

		String XCG01931 = (String)attributes.get("XCG01931");

		if (XCG01931 != null) {
			setXCG01931(XCG01931);
		}

		String XCG01616 = (String)attributes.get("XCG01616");

		if (XCG01616 != null) {
			setXCG01616(XCG01616);
		}

		String XCG01932 = (String)attributes.get("XCG01932");

		if (XCG01932 != null) {
			setXCG01932(XCG01932);
		}

		String XCG01617 = (String)attributes.get("XCG01617");

		if (XCG01617 != null) {
			setXCG01617(XCG01617);
		}

		String XCG01933 = (String)attributes.get("XCG01933");

		if (XCG01933 != null) {
			setXCG01933(XCG01933);
		}

		String XCG01618 = (String)attributes.get("XCG01618");

		if (XCG01618 != null) {
			setXCG01618(XCG01618);
		}

		String XCG01934 = (String)attributes.get("XCG01934");

		if (XCG01934 != null) {
			setXCG01934(XCG01934);
		}

		String XCG01619 = (String)attributes.get("XCG01619");

		if (XCG01619 != null) {
			setXCG01619(XCG01619);
		}

		String XCG01935 = (String)attributes.get("XCG01935");

		if (XCG01935 != null) {
			setXCG01935(XCG01935);
		}

		String XCG01620 = (String)attributes.get("XCG01620");

		if (XCG01620 != null) {
			setXCG01620(XCG01620);
		}

		String XCG01936 = (String)attributes.get("XCG01936");

		if (XCG01936 != null) {
			setXCG01936(XCG01936);
		}

		String XCG01621 = (String)attributes.get("XCG01621");

		if (XCG01621 != null) {
			setXCG01621(XCG01621);
		}

		String XCG01937 = (String)attributes.get("XCG01937");

		if (XCG01937 != null) {
			setXCG01937(XCG01937);
		}

		String XCG01622 = (String)attributes.get("XCG01622");

		if (XCG01622 != null) {
			setXCG01622(XCG01622);
		}

		String XCG01938 = (String)attributes.get("XCG01938");

		if (XCG01938 != null) {
			setXCG01938(XCG01938);
		}

		String XCG01623 = (String)attributes.get("XCG01623");

		if (XCG01623 != null) {
			setXCG01623(XCG01623);
		}

		String XCG01939 = (String)attributes.get("XCG01939");

		if (XCG01939 != null) {
			setXCG01939(XCG01939);
		}

		String XCG01624 = (String)attributes.get("XCG01624");

		if (XCG01624 != null) {
			setXCG01624(XCG01624);
		}

		String XCG01940 = (String)attributes.get("XCG01940");

		if (XCG01940 != null) {
			setXCG01940(XCG01940);
		}

		String XCG01625 = (String)attributes.get("XCG01625");

		if (XCG01625 != null) {
			setXCG01625(XCG01625);
		}

		String XCG01941 = (String)attributes.get("XCG01941");

		if (XCG01941 != null) {
			setXCG01941(XCG01941);
		}

		String XCG01626 = (String)attributes.get("XCG01626");

		if (XCG01626 != null) {
			setXCG01626(XCG01626);
		}

		String XCG01942 = (String)attributes.get("XCG01942");

		if (XCG01942 != null) {
			setXCG01942(XCG01942);
		}

		String XCG01627 = (String)attributes.get("XCG01627");

		if (XCG01627 != null) {
			setXCG01627(XCG01627);
		}

		String XCG01943 = (String)attributes.get("XCG01943");

		if (XCG01943 != null) {
			setXCG01943(XCG01943);
		}

		String XCG01628 = (String)attributes.get("XCG01628");

		if (XCG01628 != null) {
			setXCG01628(XCG01628);
		}

		String XCG01944 = (String)attributes.get("XCG01944");

		if (XCG01944 != null) {
			setXCG01944(XCG01944);
		}

		String XCG01630 = (String)attributes.get("XCG01630");

		if (XCG01630 != null) {
			setXCG01630(XCG01630);
		}

		String XCG01631 = (String)attributes.get("XCG01631");

		if (XCG01631 != null) {
			setXCG01631(XCG01631);
		}

		String XCG01632 = (String)attributes.get("XCG01632");

		if (XCG01632 != null) {
			setXCG01632(XCG01632);
		}

		String XCG01633 = (String)attributes.get("XCG01633");

		if (XCG01633 != null) {
			setXCG01633(XCG01633);
		}

		String XCG01634 = (String)attributes.get("XCG01634");

		if (XCG01634 != null) {
			setXCG01634(XCG01634);
		}

		String XCG01635 = (String)attributes.get("XCG01635");

		if (XCG01635 != null) {
			setXCG01635(XCG01635);
		}

		String XCG01636 = (String)attributes.get("XCG01636");

		if (XCG01636 != null) {
			setXCG01636(XCG01636);
		}

		String XCG01637 = (String)attributes.get("XCG01637");

		if (XCG01637 != null) {
			setXCG01637(XCG01637);
		}

		String XCG01638 = (String)attributes.get("XCG01638");

		if (XCG01638 != null) {
			setXCG01638(XCG01638);
		}

		String XCG01639 = (String)attributes.get("XCG01639");

		if (XCG01639 != null) {
			setXCG01639(XCG01639);
		}

		String XCG01640 = (String)attributes.get("XCG01640");

		if (XCG01640 != null) {
			setXCG01640(XCG01640);
		}

		String XCG01641 = (String)attributes.get("XCG01641");

		if (XCG01641 != null) {
			setXCG01641(XCG01641);
		}

		String XCG01642 = (String)attributes.get("XCG01642");

		if (XCG01642 != null) {
			setXCG01642(XCG01642);
		}

		String XCG01643 = (String)attributes.get("XCG01643");

		if (XCG01643 != null) {
			setXCG01643(XCG01643);
		}

		String XCG01644 = (String)attributes.get("XCG01644");

		if (XCG01644 != null) {
			setXCG01644(XCG01644);
		}

		String XCG01645 = (String)attributes.get("XCG01645");

		if (XCG01645 != null) {
			setXCG01645(XCG01645);
		}

		String XCG01646 = (String)attributes.get("XCG01646");

		if (XCG01646 != null) {
			setXCG01646(XCG01646);
		}

		String XCG01647 = (String)attributes.get("XCG01647");

		if (XCG01647 != null) {
			setXCG01647(XCG01647);
		}

		String XCG01648 = (String)attributes.get("XCG01648");

		if (XCG01648 != null) {
			setXCG01648(XCG01648);
		}

		String XCG01649 = (String)attributes.get("XCG01649");

		if (XCG01649 != null) {
			setXCG01649(XCG01649);
		}

		String XCG01650 = (String)attributes.get("XCG01650");

		if (XCG01650 != null) {
			setXCG01650(XCG01650);
		}

		String XCG01651 = (String)attributes.get("XCG01651");

		if (XCG01651 != null) {
			setXCG01651(XCG01651);
		}

		String XCG01652 = (String)attributes.get("XCG01652");

		if (XCG01652 != null) {
			setXCG01652(XCG01652);
		}

		String XCG01653 = (String)attributes.get("XCG01653");

		if (XCG01653 != null) {
			setXCG01653(XCG01653);
		}

		String XCG01654 = (String)attributes.get("XCG01654");

		if (XCG01654 != null) {
			setXCG01654(XCG01654);
		}

		String XCG01655 = (String)attributes.get("XCG01655");

		if (XCG01655 != null) {
			setXCG01655(XCG01655);
		}

		String XCG01656 = (String)attributes.get("XCG01656");

		if (XCG01656 != null) {
			setXCG01656(XCG01656);
		}

		String XCG01657 = (String)attributes.get("XCG01657");

		if (XCG01657 != null) {
			setXCG01657(XCG01657);
		}

		String XCG01658 = (String)attributes.get("XCG01658");

		if (XCG01658 != null) {
			setXCG01658(XCG01658);
		}

		String XCG01659 = (String)attributes.get("XCG01659");

		if (XCG01659 != null) {
			setXCG01659(XCG01659);
		}

		String XCG01660 = (String)attributes.get("XCG01660");

		if (XCG01660 != null) {
			setXCG01660(XCG01660);
		}

		String XCG01661 = (String)attributes.get("XCG01661");

		if (XCG01661 != null) {
			setXCG01661(XCG01661);
		}

		String XCG01662 = (String)attributes.get("XCG01662");

		if (XCG01662 != null) {
			setXCG01662(XCG01662);
		}

		String XCG01663 = (String)attributes.get("XCG01663");

		if (XCG01663 != null) {
			setXCG01663(XCG01663);
		}

		String XCG01664 = (String)attributes.get("XCG01664");

		if (XCG01664 != null) {
			setXCG01664(XCG01664);
		}

		String XCG01665 = (String)attributes.get("XCG01665");

		if (XCG01665 != null) {
			setXCG01665(XCG01665);
		}

		String XCG01666 = (String)attributes.get("XCG01666");

		if (XCG01666 != null) {
			setXCG01666(XCG01666);
		}

		String XCG01667 = (String)attributes.get("XCG01667");

		if (XCG01667 != null) {
			setXCG01667(XCG01667);
		}

		String XCG01668 = (String)attributes.get("XCG01668");

		if (XCG01668 != null) {
			setXCG01668(XCG01668);
		}

		String XCG01669 = (String)attributes.get("XCG01669");

		if (XCG01669 != null) {
			setXCG01669(XCG01669);
		}

		String XCG01670 = (String)attributes.get("XCG01670");

		if (XCG01670 != null) {
			setXCG01670(XCG01670);
		}

		String XCG01671 = (String)attributes.get("XCG01671");

		if (XCG01671 != null) {
			setXCG01671(XCG01671);
		}

		String XCG01672 = (String)attributes.get("XCG01672");

		if (XCG01672 != null) {
			setXCG01672(XCG01672);
		}

		String XCG01673 = (String)attributes.get("XCG01673");

		if (XCG01673 != null) {
			setXCG01673(XCG01673);
		}

		String XCG01674 = (String)attributes.get("XCG01674");

		if (XCG01674 != null) {
			setXCG01674(XCG01674);
		}

		String XCG01675 = (String)attributes.get("XCG01675");

		if (XCG01675 != null) {
			setXCG01675(XCG01675);
		}

		String XCG01676 = (String)attributes.get("XCG01676");

		if (XCG01676 != null) {
			setXCG01676(XCG01676);
		}

		String XCG01677 = (String)attributes.get("XCG01677");

		if (XCG01677 != null) {
			setXCG01677(XCG01677);
		}

		String XCG01678 = (String)attributes.get("XCG01678");

		if (XCG01678 != null) {
			setXCG01678(XCG01678);
		}

		String XCG01679 = (String)attributes.get("XCG01679");

		if (XCG01679 != null) {
			setXCG01679(XCG01679);
		}

		String XCG01680 = (String)attributes.get("XCG01680");

		if (XCG01680 != null) {
			setXCG01680(XCG01680);
		}

		String XCG01681 = (String)attributes.get("XCG01681");

		if (XCG01681 != null) {
			setXCG01681(XCG01681);
		}

		String XCG01682 = (String)attributes.get("XCG01682");

		if (XCG01682 != null) {
			setXCG01682(XCG01682);
		}

		String XCG01683 = (String)attributes.get("XCG01683");

		if (XCG01683 != null) {
			setXCG01683(XCG01683);
		}

		String XCG01684 = (String)attributes.get("XCG01684");

		if (XCG01684 != null) {
			setXCG01684(XCG01684);
		}

		String XCG01685 = (String)attributes.get("XCG01685");

		if (XCG01685 != null) {
			setXCG01685(XCG01685);
		}

		String XCG01686 = (String)attributes.get("XCG01686");

		if (XCG01686 != null) {
			setXCG01686(XCG01686);
		}

		String XCG01687 = (String)attributes.get("XCG01687");

		if (XCG01687 != null) {
			setXCG01687(XCG01687);
		}

		String XCG01688 = (String)attributes.get("XCG01688");

		if (XCG01688 != null) {
			setXCG01688(XCG01688);
		}

		String XCG01689 = (String)attributes.get("XCG01689");

		if (XCG01689 != null) {
			setXCG01689(XCG01689);
		}

		String XCG01690 = (String)attributes.get("XCG01690");

		if (XCG01690 != null) {
			setXCG01690(XCG01690);
		}

		String XCG01691 = (String)attributes.get("XCG01691");

		if (XCG01691 != null) {
			setXCG01691(XCG01691);
		}

		String XCG01692 = (String)attributes.get("XCG01692");

		if (XCG01692 != null) {
			setXCG01692(XCG01692);
		}

		String XCG01693 = (String)attributes.get("XCG01693");

		if (XCG01693 != null) {
			setXCG01693(XCG01693);
		}

		String XCG01694 = (String)attributes.get("XCG01694");

		if (XCG01694 != null) {
			setXCG01694(XCG01694);
		}

		String XCG01695 = (String)attributes.get("XCG01695");

		if (XCG01695 != null) {
			setXCG01695(XCG01695);
		}

		String XCG01696 = (String)attributes.get("XCG01696");

		if (XCG01696 != null) {
			setXCG01696(XCG01696);
		}

		String XCG01697 = (String)attributes.get("XCG01697");

		if (XCG01697 != null) {
			setXCG01697(XCG01697);
		}

		String XCG01698 = (String)attributes.get("XCG01698");

		if (XCG01698 != null) {
			setXCG01698(XCG01698);
		}

		String XCG01699 = (String)attributes.get("XCG01699");

		if (XCG01699 != null) {
			setXCG01699(XCG01699);
		}

		String XCG01700 = (String)attributes.get("XCG01700");

		if (XCG01700 != null) {
			setXCG01700(XCG01700);
		}

		String XCG01701 = (String)attributes.get("XCG01701");

		if (XCG01701 != null) {
			setXCG01701(XCG01701);
		}

		String XCG01702 = (String)attributes.get("XCG01702");

		if (XCG01702 != null) {
			setXCG01702(XCG01702);
		}

		String XCG01703 = (String)attributes.get("XCG01703");

		if (XCG01703 != null) {
			setXCG01703(XCG01703);
		}

		String XCG01704 = (String)attributes.get("XCG01704");

		if (XCG01704 != null) {
			setXCG01704(XCG01704);
		}

		String XCG01705 = (String)attributes.get("XCG01705");

		if (XCG01705 != null) {
			setXCG01705(XCG01705);
		}

		String XCG01706 = (String)attributes.get("XCG01706");

		if (XCG01706 != null) {
			setXCG01706(XCG01706);
		}

		String XCG01707 = (String)attributes.get("XCG01707");

		if (XCG01707 != null) {
			setXCG01707(XCG01707);
		}

		String XCG01708 = (String)attributes.get("XCG01708");

		if (XCG01708 != null) {
			setXCG01708(XCG01708);
		}

		String XCG01709 = (String)attributes.get("XCG01709");

		if (XCG01709 != null) {
			setXCG01709(XCG01709);
		}

		String XCG01710 = (String)attributes.get("XCG01710");

		if (XCG01710 != null) {
			setXCG01710(XCG01710);
		}

		String XCG01711 = (String)attributes.get("XCG01711");

		if (XCG01711 != null) {
			setXCG01711(XCG01711);
		}

		String XCG01712 = (String)attributes.get("XCG01712");

		if (XCG01712 != null) {
			setXCG01712(XCG01712);
		}

		String XCG01713 = (String)attributes.get("XCG01713");

		if (XCG01713 != null) {
			setXCG01713(XCG01713);
		}

		String XCG01714 = (String)attributes.get("XCG01714");

		if (XCG01714 != null) {
			setXCG01714(XCG01714);
		}

		String XCG01715 = (String)attributes.get("XCG01715");

		if (XCG01715 != null) {
			setXCG01715(XCG01715);
		}

		String XCG01716 = (String)attributes.get("XCG01716");

		if (XCG01716 != null) {
			setXCG01716(XCG01716);
		}

		String XCG01717 = (String)attributes.get("XCG01717");

		if (XCG01717 != null) {
			setXCG01717(XCG01717);
		}

		String XCG01718 = (String)attributes.get("XCG01718");

		if (XCG01718 != null) {
			setXCG01718(XCG01718);
		}

		String XCG01719 = (String)attributes.get("XCG01719");

		if (XCG01719 != null) {
			setXCG01719(XCG01719);
		}

		String XCG01720 = (String)attributes.get("XCG01720");

		if (XCG01720 != null) {
			setXCG01720(XCG01720);
		}

		String XCG01721 = (String)attributes.get("XCG01721");

		if (XCG01721 != null) {
			setXCG01721(XCG01721);
		}

		String XCG01722 = (String)attributes.get("XCG01722");

		if (XCG01722 != null) {
			setXCG01722(XCG01722);
		}

		String XCG01723 = (String)attributes.get("XCG01723");

		if (XCG01723 != null) {
			setXCG01723(XCG01723);
		}

		String XCG01724 = (String)attributes.get("XCG01724");

		if (XCG01724 != null) {
			setXCG01724(XCG01724);
		}

		String XCG01725 = (String)attributes.get("XCG01725");

		if (XCG01725 != null) {
			setXCG01725(XCG01725);
		}

		String XCG01726 = (String)attributes.get("XCG01726");

		if (XCG01726 != null) {
			setXCG01726(XCG01726);
		}

		String XCG01727 = (String)attributes.get("XCG01727");

		if (XCG01727 != null) {
			setXCG01727(XCG01727);
		}

		String XCG01728 = (String)attributes.get("XCG01728");

		if (XCG01728 != null) {
			setXCG01728(XCG01728);
		}

		String XCG01729 = (String)attributes.get("XCG01729");

		if (XCG01729 != null) {
			setXCG01729(XCG01729);
		}

		String XCG01730 = (String)attributes.get("XCG01730");

		if (XCG01730 != null) {
			setXCG01730(XCG01730);
		}

		String XCG01731 = (String)attributes.get("XCG01731");

		if (XCG01731 != null) {
			setXCG01731(XCG01731);
		}

		String XCG01732 = (String)attributes.get("XCG01732");

		if (XCG01732 != null) {
			setXCG01732(XCG01732);
		}

		String XCG01733 = (String)attributes.get("XCG01733");

		if (XCG01733 != null) {
			setXCG01733(XCG01733);
		}

		String XCG01734 = (String)attributes.get("XCG01734");

		if (XCG01734 != null) {
			setXCG01734(XCG01734);
		}

		String XCG01735 = (String)attributes.get("XCG01735");

		if (XCG01735 != null) {
			setXCG01735(XCG01735);
		}

		String XCG01736 = (String)attributes.get("XCG01736");

		if (XCG01736 != null) {
			setXCG01736(XCG01736);
		}

		String XCG01737 = (String)attributes.get("XCG01737");

		if (XCG01737 != null) {
			setXCG01737(XCG01737);
		}

		String XCG01738 = (String)attributes.get("XCG01738");

		if (XCG01738 != null) {
			setXCG01738(XCG01738);
		}

		String XCG01739 = (String)attributes.get("XCG01739");

		if (XCG01739 != null) {
			setXCG01739(XCG01739);
		}

		String XCG01740 = (String)attributes.get("XCG01740");

		if (XCG01740 != null) {
			setXCG01740(XCG01740);
		}

		String XCG01741 = (String)attributes.get("XCG01741");

		if (XCG01741 != null) {
			setXCG01741(XCG01741);
		}

		String XCG01742 = (String)attributes.get("XCG01742");

		if (XCG01742 != null) {
			setXCG01742(XCG01742);
		}

		String XCG01744 = (String)attributes.get("XCG01744");

		if (XCG01744 != null) {
			setXCG01744(XCG01744);
		}

		String XCG01745 = (String)attributes.get("XCG01745");

		if (XCG01745 != null) {
			setXCG01745(XCG01745);
		}

		String XCG01746 = (String)attributes.get("XCG01746");

		if (XCG01746 != null) {
			setXCG01746(XCG01746);
		}

		String XCG01747 = (String)attributes.get("XCG01747");

		if (XCG01747 != null) {
			setXCG01747(XCG01747);
		}

		String XCG01748 = (String)attributes.get("XCG01748");

		if (XCG01748 != null) {
			setXCG01748(XCG01748);
		}

		String XCG01749 = (String)attributes.get("XCG01749");

		if (XCG01749 != null) {
			setXCG01749(XCG01749);
		}

		String XCG01945 = (String)attributes.get("XCG01945");

		if (XCG01945 != null) {
			setXCG01945(XCG01945);
		}

		String XCG01750 = (String)attributes.get("XCG01750");

		if (XCG01750 != null) {
			setXCG01750(XCG01750);
		}

		String XCG01946 = (String)attributes.get("XCG01946");

		if (XCG01946 != null) {
			setXCG01946(XCG01946);
		}

		String XCG01751 = (String)attributes.get("XCG01751");

		if (XCG01751 != null) {
			setXCG01751(XCG01751);
		}

		String XCG01752 = (String)attributes.get("XCG01752");

		if (XCG01752 != null) {
			setXCG01752(XCG01752);
		}

		String XCG01753 = (String)attributes.get("XCG01753");

		if (XCG01753 != null) {
			setXCG01753(XCG01753);
		}

		String XCG01754 = (String)attributes.get("XCG01754");

		if (XCG01754 != null) {
			setXCG01754(XCG01754);
		}

		String XCG01756 = (String)attributes.get("XCG01756");

		if (XCG01756 != null) {
			setXCG01756(XCG01756);
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
	public VRTechnicalSpec_XCGPart5 toEscapedModel() {
		return new VRTechnicalSpec_XCGPart5Wrapper(_vrTechnicalSpec_XCGPart5.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XCGPart5 toUnescapedModel() {
		return new VRTechnicalSpec_XCGPart5Wrapper(_vrTechnicalSpec_XCGPart5.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XCGPart5.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XCGPart5.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XCGPart5.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XCGPart5.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XCGPart5> toCacheModel() {
		return _vrTechnicalSpec_XCGPart5.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XCGPart5 vrTechnicalSpec_XCGPart5) {
		return _vrTechnicalSpec_XCGPart5.compareTo(vrTechnicalSpec_XCGPart5);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XCGPart5.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XCGPart5.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XCGPart5Wrapper((VRTechnicalSpec_XCGPart5)_vrTechnicalSpec_XCGPart5.clone());
	}

	/**
	* Returns the deliverable code of this vr technical spec_xcg part5.
	*
	* @return the deliverable code of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XCGPart5.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xcg part5.
	*
	* @return the dossier ID ctn of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XCGPart5.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xcg part5.
	*
	* @return the dossier no of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XCGPart5.getDossierNo();
	}

	/**
	* Returns the reference uid of this vr technical spec_xcg part5.
	*
	* @return the reference uid of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XCGPart5.getReferenceUid();
	}

	/**
	* Returns the xcg01598 of this vr technical spec_xcg part5.
	*
	* @return the xcg01598 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01598() {
		return _vrTechnicalSpec_XCGPart5.getXCG01598();
	}

	/**
	* Returns the xcg01599 of this vr technical spec_xcg part5.
	*
	* @return the xcg01599 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01599() {
		return _vrTechnicalSpec_XCGPart5.getXCG01599();
	}

	/**
	* Returns the xcg01600 of this vr technical spec_xcg part5.
	*
	* @return the xcg01600 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01600() {
		return _vrTechnicalSpec_XCGPart5.getXCG01600();
	}

	/**
	* Returns the xcg01601 of this vr technical spec_xcg part5.
	*
	* @return the xcg01601 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01601() {
		return _vrTechnicalSpec_XCGPart5.getXCG01601();
	}

	/**
	* Returns the xcg01602 of this vr technical spec_xcg part5.
	*
	* @return the xcg01602 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01602() {
		return _vrTechnicalSpec_XCGPart5.getXCG01602();
	}

	/**
	* Returns the xcg01603 of this vr technical spec_xcg part5.
	*
	* @return the xcg01603 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01603() {
		return _vrTechnicalSpec_XCGPart5.getXCG01603();
	}

	/**
	* Returns the xcg01604 of this vr technical spec_xcg part5.
	*
	* @return the xcg01604 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01604() {
		return _vrTechnicalSpec_XCGPart5.getXCG01604();
	}

	/**
	* Returns the xcg01605 of this vr technical spec_xcg part5.
	*
	* @return the xcg01605 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01605() {
		return _vrTechnicalSpec_XCGPart5.getXCG01605();
	}

	/**
	* Returns the xcg01606 of this vr technical spec_xcg part5.
	*
	* @return the xcg01606 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01606() {
		return _vrTechnicalSpec_XCGPart5.getXCG01606();
	}

	/**
	* Returns the xcg01607 of this vr technical spec_xcg part5.
	*
	* @return the xcg01607 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01607() {
		return _vrTechnicalSpec_XCGPart5.getXCG01607();
	}

	/**
	* Returns the xcg01608 of this vr technical spec_xcg part5.
	*
	* @return the xcg01608 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01608() {
		return _vrTechnicalSpec_XCGPart5.getXCG01608();
	}

	/**
	* Returns the xcg01609 of this vr technical spec_xcg part5.
	*
	* @return the xcg01609 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01609() {
		return _vrTechnicalSpec_XCGPart5.getXCG01609();
	}

	/**
	* Returns the xcg01610 of this vr technical spec_xcg part5.
	*
	* @return the xcg01610 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01610() {
		return _vrTechnicalSpec_XCGPart5.getXCG01610();
	}

	/**
	* Returns the xcg01611 of this vr technical spec_xcg part5.
	*
	* @return the xcg01611 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01611() {
		return _vrTechnicalSpec_XCGPart5.getXCG01611();
	}

	/**
	* Returns the xcg01612 of this vr technical spec_xcg part5.
	*
	* @return the xcg01612 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01612() {
		return _vrTechnicalSpec_XCGPart5.getXCG01612();
	}

	/**
	* Returns the xcg01613 of this vr technical spec_xcg part5.
	*
	* @return the xcg01613 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01613() {
		return _vrTechnicalSpec_XCGPart5.getXCG01613();
	}

	/**
	* Returns the xcg01614 of this vr technical spec_xcg part5.
	*
	* @return the xcg01614 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01614() {
		return _vrTechnicalSpec_XCGPart5.getXCG01614();
	}

	/**
	* Returns the xcg01615 of this vr technical spec_xcg part5.
	*
	* @return the xcg01615 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01615() {
		return _vrTechnicalSpec_XCGPart5.getXCG01615();
	}

	/**
	* Returns the xcg01616 of this vr technical spec_xcg part5.
	*
	* @return the xcg01616 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01616() {
		return _vrTechnicalSpec_XCGPart5.getXCG01616();
	}

	/**
	* Returns the xcg01617 of this vr technical spec_xcg part5.
	*
	* @return the xcg01617 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01617() {
		return _vrTechnicalSpec_XCGPart5.getXCG01617();
	}

	/**
	* Returns the xcg01618 of this vr technical spec_xcg part5.
	*
	* @return the xcg01618 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01618() {
		return _vrTechnicalSpec_XCGPart5.getXCG01618();
	}

	/**
	* Returns the xcg01619 of this vr technical spec_xcg part5.
	*
	* @return the xcg01619 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01619() {
		return _vrTechnicalSpec_XCGPart5.getXCG01619();
	}

	/**
	* Returns the xcg01620 of this vr technical spec_xcg part5.
	*
	* @return the xcg01620 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01620() {
		return _vrTechnicalSpec_XCGPart5.getXCG01620();
	}

	/**
	* Returns the xcg01621 of this vr technical spec_xcg part5.
	*
	* @return the xcg01621 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01621() {
		return _vrTechnicalSpec_XCGPart5.getXCG01621();
	}

	/**
	* Returns the xcg01622 of this vr technical spec_xcg part5.
	*
	* @return the xcg01622 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01622() {
		return _vrTechnicalSpec_XCGPart5.getXCG01622();
	}

	/**
	* Returns the xcg01623 of this vr technical spec_xcg part5.
	*
	* @return the xcg01623 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01623() {
		return _vrTechnicalSpec_XCGPart5.getXCG01623();
	}

	/**
	* Returns the xcg01624 of this vr technical spec_xcg part5.
	*
	* @return the xcg01624 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01624() {
		return _vrTechnicalSpec_XCGPart5.getXCG01624();
	}

	/**
	* Returns the xcg01625 of this vr technical spec_xcg part5.
	*
	* @return the xcg01625 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01625() {
		return _vrTechnicalSpec_XCGPart5.getXCG01625();
	}

	/**
	* Returns the xcg01626 of this vr technical spec_xcg part5.
	*
	* @return the xcg01626 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01626() {
		return _vrTechnicalSpec_XCGPart5.getXCG01626();
	}

	/**
	* Returns the xcg01627 of this vr technical spec_xcg part5.
	*
	* @return the xcg01627 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01627() {
		return _vrTechnicalSpec_XCGPart5.getXCG01627();
	}

	/**
	* Returns the xcg01628 of this vr technical spec_xcg part5.
	*
	* @return the xcg01628 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01628() {
		return _vrTechnicalSpec_XCGPart5.getXCG01628();
	}

	/**
	* Returns the xcg01630 of this vr technical spec_xcg part5.
	*
	* @return the xcg01630 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01630() {
		return _vrTechnicalSpec_XCGPart5.getXCG01630();
	}

	/**
	* Returns the xcg01631 of this vr technical spec_xcg part5.
	*
	* @return the xcg01631 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01631() {
		return _vrTechnicalSpec_XCGPart5.getXCG01631();
	}

	/**
	* Returns the xcg01632 of this vr technical spec_xcg part5.
	*
	* @return the xcg01632 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01632() {
		return _vrTechnicalSpec_XCGPart5.getXCG01632();
	}

	/**
	* Returns the xcg01633 of this vr technical spec_xcg part5.
	*
	* @return the xcg01633 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01633() {
		return _vrTechnicalSpec_XCGPart5.getXCG01633();
	}

	/**
	* Returns the xcg01634 of this vr technical spec_xcg part5.
	*
	* @return the xcg01634 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01634() {
		return _vrTechnicalSpec_XCGPart5.getXCG01634();
	}

	/**
	* Returns the xcg01635 of this vr technical spec_xcg part5.
	*
	* @return the xcg01635 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01635() {
		return _vrTechnicalSpec_XCGPart5.getXCG01635();
	}

	/**
	* Returns the xcg01636 of this vr technical spec_xcg part5.
	*
	* @return the xcg01636 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01636() {
		return _vrTechnicalSpec_XCGPart5.getXCG01636();
	}

	/**
	* Returns the xcg01637 of this vr technical spec_xcg part5.
	*
	* @return the xcg01637 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01637() {
		return _vrTechnicalSpec_XCGPart5.getXCG01637();
	}

	/**
	* Returns the xcg01638 of this vr technical spec_xcg part5.
	*
	* @return the xcg01638 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01638() {
		return _vrTechnicalSpec_XCGPart5.getXCG01638();
	}

	/**
	* Returns the xcg01639 of this vr technical spec_xcg part5.
	*
	* @return the xcg01639 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01639() {
		return _vrTechnicalSpec_XCGPart5.getXCG01639();
	}

	/**
	* Returns the xcg01640 of this vr technical spec_xcg part5.
	*
	* @return the xcg01640 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01640() {
		return _vrTechnicalSpec_XCGPart5.getXCG01640();
	}

	/**
	* Returns the xcg01641 of this vr technical spec_xcg part5.
	*
	* @return the xcg01641 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01641() {
		return _vrTechnicalSpec_XCGPart5.getXCG01641();
	}

	/**
	* Returns the xcg01642 of this vr technical spec_xcg part5.
	*
	* @return the xcg01642 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01642() {
		return _vrTechnicalSpec_XCGPart5.getXCG01642();
	}

	/**
	* Returns the xcg01643 of this vr technical spec_xcg part5.
	*
	* @return the xcg01643 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01643() {
		return _vrTechnicalSpec_XCGPart5.getXCG01643();
	}

	/**
	* Returns the xcg01644 of this vr technical spec_xcg part5.
	*
	* @return the xcg01644 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01644() {
		return _vrTechnicalSpec_XCGPart5.getXCG01644();
	}

	/**
	* Returns the xcg01645 of this vr technical spec_xcg part5.
	*
	* @return the xcg01645 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01645() {
		return _vrTechnicalSpec_XCGPart5.getXCG01645();
	}

	/**
	* Returns the xcg01646 of this vr technical spec_xcg part5.
	*
	* @return the xcg01646 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01646() {
		return _vrTechnicalSpec_XCGPart5.getXCG01646();
	}

	/**
	* Returns the xcg01647 of this vr technical spec_xcg part5.
	*
	* @return the xcg01647 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01647() {
		return _vrTechnicalSpec_XCGPart5.getXCG01647();
	}

	/**
	* Returns the xcg01648 of this vr technical spec_xcg part5.
	*
	* @return the xcg01648 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01648() {
		return _vrTechnicalSpec_XCGPart5.getXCG01648();
	}

	/**
	* Returns the xcg01649 of this vr technical spec_xcg part5.
	*
	* @return the xcg01649 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01649() {
		return _vrTechnicalSpec_XCGPart5.getXCG01649();
	}

	/**
	* Returns the xcg01650 of this vr technical spec_xcg part5.
	*
	* @return the xcg01650 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01650() {
		return _vrTechnicalSpec_XCGPart5.getXCG01650();
	}

	/**
	* Returns the xcg01651 of this vr technical spec_xcg part5.
	*
	* @return the xcg01651 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01651() {
		return _vrTechnicalSpec_XCGPart5.getXCG01651();
	}

	/**
	* Returns the xcg01652 of this vr technical spec_xcg part5.
	*
	* @return the xcg01652 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01652() {
		return _vrTechnicalSpec_XCGPart5.getXCG01652();
	}

	/**
	* Returns the xcg01653 of this vr technical spec_xcg part5.
	*
	* @return the xcg01653 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01653() {
		return _vrTechnicalSpec_XCGPart5.getXCG01653();
	}

	/**
	* Returns the xcg01654 of this vr technical spec_xcg part5.
	*
	* @return the xcg01654 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01654() {
		return _vrTechnicalSpec_XCGPart5.getXCG01654();
	}

	/**
	* Returns the xcg01655 of this vr technical spec_xcg part5.
	*
	* @return the xcg01655 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01655() {
		return _vrTechnicalSpec_XCGPart5.getXCG01655();
	}

	/**
	* Returns the xcg01656 of this vr technical spec_xcg part5.
	*
	* @return the xcg01656 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01656() {
		return _vrTechnicalSpec_XCGPart5.getXCG01656();
	}

	/**
	* Returns the xcg01657 of this vr technical spec_xcg part5.
	*
	* @return the xcg01657 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01657() {
		return _vrTechnicalSpec_XCGPart5.getXCG01657();
	}

	/**
	* Returns the xcg01658 of this vr technical spec_xcg part5.
	*
	* @return the xcg01658 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01658() {
		return _vrTechnicalSpec_XCGPart5.getXCG01658();
	}

	/**
	* Returns the xcg01659 of this vr technical spec_xcg part5.
	*
	* @return the xcg01659 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01659() {
		return _vrTechnicalSpec_XCGPart5.getXCG01659();
	}

	/**
	* Returns the xcg01660 of this vr technical spec_xcg part5.
	*
	* @return the xcg01660 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01660() {
		return _vrTechnicalSpec_XCGPart5.getXCG01660();
	}

	/**
	* Returns the xcg01661 of this vr technical spec_xcg part5.
	*
	* @return the xcg01661 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01661() {
		return _vrTechnicalSpec_XCGPart5.getXCG01661();
	}

	/**
	* Returns the xcg01662 of this vr technical spec_xcg part5.
	*
	* @return the xcg01662 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01662() {
		return _vrTechnicalSpec_XCGPart5.getXCG01662();
	}

	/**
	* Returns the xcg01663 of this vr technical spec_xcg part5.
	*
	* @return the xcg01663 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01663() {
		return _vrTechnicalSpec_XCGPart5.getXCG01663();
	}

	/**
	* Returns the xcg01664 of this vr technical spec_xcg part5.
	*
	* @return the xcg01664 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01664() {
		return _vrTechnicalSpec_XCGPart5.getXCG01664();
	}

	/**
	* Returns the xcg01665 of this vr technical spec_xcg part5.
	*
	* @return the xcg01665 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01665() {
		return _vrTechnicalSpec_XCGPart5.getXCG01665();
	}

	/**
	* Returns the xcg01666 of this vr technical spec_xcg part5.
	*
	* @return the xcg01666 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01666() {
		return _vrTechnicalSpec_XCGPart5.getXCG01666();
	}

	/**
	* Returns the xcg01667 of this vr technical spec_xcg part5.
	*
	* @return the xcg01667 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01667() {
		return _vrTechnicalSpec_XCGPart5.getXCG01667();
	}

	/**
	* Returns the xcg01668 of this vr technical spec_xcg part5.
	*
	* @return the xcg01668 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01668() {
		return _vrTechnicalSpec_XCGPart5.getXCG01668();
	}

	/**
	* Returns the xcg01669 of this vr technical spec_xcg part5.
	*
	* @return the xcg01669 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01669() {
		return _vrTechnicalSpec_XCGPart5.getXCG01669();
	}

	/**
	* Returns the xcg01670 of this vr technical spec_xcg part5.
	*
	* @return the xcg01670 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01670() {
		return _vrTechnicalSpec_XCGPart5.getXCG01670();
	}

	/**
	* Returns the xcg01671 of this vr technical spec_xcg part5.
	*
	* @return the xcg01671 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01671() {
		return _vrTechnicalSpec_XCGPart5.getXCG01671();
	}

	/**
	* Returns the xcg01672 of this vr technical spec_xcg part5.
	*
	* @return the xcg01672 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01672() {
		return _vrTechnicalSpec_XCGPart5.getXCG01672();
	}

	/**
	* Returns the xcg01673 of this vr technical spec_xcg part5.
	*
	* @return the xcg01673 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01673() {
		return _vrTechnicalSpec_XCGPart5.getXCG01673();
	}

	/**
	* Returns the xcg01674 of this vr technical spec_xcg part5.
	*
	* @return the xcg01674 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01674() {
		return _vrTechnicalSpec_XCGPart5.getXCG01674();
	}

	/**
	* Returns the xcg01675 of this vr technical spec_xcg part5.
	*
	* @return the xcg01675 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01675() {
		return _vrTechnicalSpec_XCGPart5.getXCG01675();
	}

	/**
	* Returns the xcg01676 of this vr technical spec_xcg part5.
	*
	* @return the xcg01676 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01676() {
		return _vrTechnicalSpec_XCGPart5.getXCG01676();
	}

	/**
	* Returns the xcg01677 of this vr technical spec_xcg part5.
	*
	* @return the xcg01677 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01677() {
		return _vrTechnicalSpec_XCGPart5.getXCG01677();
	}

	/**
	* Returns the xcg01678 of this vr technical spec_xcg part5.
	*
	* @return the xcg01678 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01678() {
		return _vrTechnicalSpec_XCGPart5.getXCG01678();
	}

	/**
	* Returns the xcg01679 of this vr technical spec_xcg part5.
	*
	* @return the xcg01679 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01679() {
		return _vrTechnicalSpec_XCGPart5.getXCG01679();
	}

	/**
	* Returns the xcg01680 of this vr technical spec_xcg part5.
	*
	* @return the xcg01680 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01680() {
		return _vrTechnicalSpec_XCGPart5.getXCG01680();
	}

	/**
	* Returns the xcg01681 of this vr technical spec_xcg part5.
	*
	* @return the xcg01681 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01681() {
		return _vrTechnicalSpec_XCGPart5.getXCG01681();
	}

	/**
	* Returns the xcg01682 of this vr technical spec_xcg part5.
	*
	* @return the xcg01682 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01682() {
		return _vrTechnicalSpec_XCGPart5.getXCG01682();
	}

	/**
	* Returns the xcg01683 of this vr technical spec_xcg part5.
	*
	* @return the xcg01683 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01683() {
		return _vrTechnicalSpec_XCGPart5.getXCG01683();
	}

	/**
	* Returns the xcg01684 of this vr technical spec_xcg part5.
	*
	* @return the xcg01684 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01684() {
		return _vrTechnicalSpec_XCGPart5.getXCG01684();
	}

	/**
	* Returns the xcg01685 of this vr technical spec_xcg part5.
	*
	* @return the xcg01685 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01685() {
		return _vrTechnicalSpec_XCGPart5.getXCG01685();
	}

	/**
	* Returns the xcg01686 of this vr technical spec_xcg part5.
	*
	* @return the xcg01686 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01686() {
		return _vrTechnicalSpec_XCGPart5.getXCG01686();
	}

	/**
	* Returns the xcg01687 of this vr technical spec_xcg part5.
	*
	* @return the xcg01687 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01687() {
		return _vrTechnicalSpec_XCGPart5.getXCG01687();
	}

	/**
	* Returns the xcg01688 of this vr technical spec_xcg part5.
	*
	* @return the xcg01688 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01688() {
		return _vrTechnicalSpec_XCGPart5.getXCG01688();
	}

	/**
	* Returns the xcg01689 of this vr technical spec_xcg part5.
	*
	* @return the xcg01689 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01689() {
		return _vrTechnicalSpec_XCGPart5.getXCG01689();
	}

	/**
	* Returns the xcg01690 of this vr technical spec_xcg part5.
	*
	* @return the xcg01690 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01690() {
		return _vrTechnicalSpec_XCGPart5.getXCG01690();
	}

	/**
	* Returns the xcg01691 of this vr technical spec_xcg part5.
	*
	* @return the xcg01691 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01691() {
		return _vrTechnicalSpec_XCGPart5.getXCG01691();
	}

	/**
	* Returns the xcg01692 of this vr technical spec_xcg part5.
	*
	* @return the xcg01692 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01692() {
		return _vrTechnicalSpec_XCGPart5.getXCG01692();
	}

	/**
	* Returns the xcg01693 of this vr technical spec_xcg part5.
	*
	* @return the xcg01693 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01693() {
		return _vrTechnicalSpec_XCGPart5.getXCG01693();
	}

	/**
	* Returns the xcg01694 of this vr technical spec_xcg part5.
	*
	* @return the xcg01694 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01694() {
		return _vrTechnicalSpec_XCGPart5.getXCG01694();
	}

	/**
	* Returns the xcg01695 of this vr technical spec_xcg part5.
	*
	* @return the xcg01695 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01695() {
		return _vrTechnicalSpec_XCGPart5.getXCG01695();
	}

	/**
	* Returns the xcg01696 of this vr technical spec_xcg part5.
	*
	* @return the xcg01696 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01696() {
		return _vrTechnicalSpec_XCGPart5.getXCG01696();
	}

	/**
	* Returns the xcg01697 of this vr technical spec_xcg part5.
	*
	* @return the xcg01697 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01697() {
		return _vrTechnicalSpec_XCGPart5.getXCG01697();
	}

	/**
	* Returns the xcg01698 of this vr technical spec_xcg part5.
	*
	* @return the xcg01698 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01698() {
		return _vrTechnicalSpec_XCGPart5.getXCG01698();
	}

	/**
	* Returns the xcg01699 of this vr technical spec_xcg part5.
	*
	* @return the xcg01699 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01699() {
		return _vrTechnicalSpec_XCGPart5.getXCG01699();
	}

	/**
	* Returns the xcg01700 of this vr technical spec_xcg part5.
	*
	* @return the xcg01700 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01700() {
		return _vrTechnicalSpec_XCGPart5.getXCG01700();
	}

	/**
	* Returns the xcg01701 of this vr technical spec_xcg part5.
	*
	* @return the xcg01701 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01701() {
		return _vrTechnicalSpec_XCGPart5.getXCG01701();
	}

	/**
	* Returns the xcg01702 of this vr technical spec_xcg part5.
	*
	* @return the xcg01702 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01702() {
		return _vrTechnicalSpec_XCGPart5.getXCG01702();
	}

	/**
	* Returns the xcg01703 of this vr technical spec_xcg part5.
	*
	* @return the xcg01703 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01703() {
		return _vrTechnicalSpec_XCGPart5.getXCG01703();
	}

	/**
	* Returns the xcg01704 of this vr technical spec_xcg part5.
	*
	* @return the xcg01704 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01704() {
		return _vrTechnicalSpec_XCGPart5.getXCG01704();
	}

	/**
	* Returns the xcg01705 of this vr technical spec_xcg part5.
	*
	* @return the xcg01705 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01705() {
		return _vrTechnicalSpec_XCGPart5.getXCG01705();
	}

	/**
	* Returns the xcg01706 of this vr technical spec_xcg part5.
	*
	* @return the xcg01706 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01706() {
		return _vrTechnicalSpec_XCGPart5.getXCG01706();
	}

	/**
	* Returns the xcg01707 of this vr technical spec_xcg part5.
	*
	* @return the xcg01707 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01707() {
		return _vrTechnicalSpec_XCGPart5.getXCG01707();
	}

	/**
	* Returns the xcg01708 of this vr technical spec_xcg part5.
	*
	* @return the xcg01708 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01708() {
		return _vrTechnicalSpec_XCGPart5.getXCG01708();
	}

	/**
	* Returns the xcg01709 of this vr technical spec_xcg part5.
	*
	* @return the xcg01709 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01709() {
		return _vrTechnicalSpec_XCGPart5.getXCG01709();
	}

	/**
	* Returns the xcg01710 of this vr technical spec_xcg part5.
	*
	* @return the xcg01710 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01710() {
		return _vrTechnicalSpec_XCGPart5.getXCG01710();
	}

	/**
	* Returns the xcg01711 of this vr technical spec_xcg part5.
	*
	* @return the xcg01711 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01711() {
		return _vrTechnicalSpec_XCGPart5.getXCG01711();
	}

	/**
	* Returns the xcg01712 of this vr technical spec_xcg part5.
	*
	* @return the xcg01712 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01712() {
		return _vrTechnicalSpec_XCGPart5.getXCG01712();
	}

	/**
	* Returns the xcg01713 of this vr technical spec_xcg part5.
	*
	* @return the xcg01713 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01713() {
		return _vrTechnicalSpec_XCGPart5.getXCG01713();
	}

	/**
	* Returns the xcg01714 of this vr technical spec_xcg part5.
	*
	* @return the xcg01714 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01714() {
		return _vrTechnicalSpec_XCGPart5.getXCG01714();
	}

	/**
	* Returns the xcg01715 of this vr technical spec_xcg part5.
	*
	* @return the xcg01715 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01715() {
		return _vrTechnicalSpec_XCGPart5.getXCG01715();
	}

	/**
	* Returns the xcg01716 of this vr technical spec_xcg part5.
	*
	* @return the xcg01716 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01716() {
		return _vrTechnicalSpec_XCGPart5.getXCG01716();
	}

	/**
	* Returns the xcg01717 of this vr technical spec_xcg part5.
	*
	* @return the xcg01717 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01717() {
		return _vrTechnicalSpec_XCGPart5.getXCG01717();
	}

	/**
	* Returns the xcg01718 of this vr technical spec_xcg part5.
	*
	* @return the xcg01718 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01718() {
		return _vrTechnicalSpec_XCGPart5.getXCG01718();
	}

	/**
	* Returns the xcg01719 of this vr technical spec_xcg part5.
	*
	* @return the xcg01719 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01719() {
		return _vrTechnicalSpec_XCGPart5.getXCG01719();
	}

	/**
	* Returns the xcg01720 of this vr technical spec_xcg part5.
	*
	* @return the xcg01720 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01720() {
		return _vrTechnicalSpec_XCGPart5.getXCG01720();
	}

	/**
	* Returns the xcg01721 of this vr technical spec_xcg part5.
	*
	* @return the xcg01721 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01721() {
		return _vrTechnicalSpec_XCGPart5.getXCG01721();
	}

	/**
	* Returns the xcg01722 of this vr technical spec_xcg part5.
	*
	* @return the xcg01722 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01722() {
		return _vrTechnicalSpec_XCGPart5.getXCG01722();
	}

	/**
	* Returns the xcg01723 of this vr technical spec_xcg part5.
	*
	* @return the xcg01723 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01723() {
		return _vrTechnicalSpec_XCGPart5.getXCG01723();
	}

	/**
	* Returns the xcg01724 of this vr technical spec_xcg part5.
	*
	* @return the xcg01724 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01724() {
		return _vrTechnicalSpec_XCGPart5.getXCG01724();
	}

	/**
	* Returns the xcg01725 of this vr technical spec_xcg part5.
	*
	* @return the xcg01725 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01725() {
		return _vrTechnicalSpec_XCGPart5.getXCG01725();
	}

	/**
	* Returns the xcg01726 of this vr technical spec_xcg part5.
	*
	* @return the xcg01726 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01726() {
		return _vrTechnicalSpec_XCGPart5.getXCG01726();
	}

	/**
	* Returns the xcg01727 of this vr technical spec_xcg part5.
	*
	* @return the xcg01727 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01727() {
		return _vrTechnicalSpec_XCGPart5.getXCG01727();
	}

	/**
	* Returns the xcg01728 of this vr technical spec_xcg part5.
	*
	* @return the xcg01728 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01728() {
		return _vrTechnicalSpec_XCGPart5.getXCG01728();
	}

	/**
	* Returns the xcg01729 of this vr technical spec_xcg part5.
	*
	* @return the xcg01729 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01729() {
		return _vrTechnicalSpec_XCGPart5.getXCG01729();
	}

	/**
	* Returns the xcg01730 of this vr technical spec_xcg part5.
	*
	* @return the xcg01730 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01730() {
		return _vrTechnicalSpec_XCGPart5.getXCG01730();
	}

	/**
	* Returns the xcg01731 of this vr technical spec_xcg part5.
	*
	* @return the xcg01731 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01731() {
		return _vrTechnicalSpec_XCGPart5.getXCG01731();
	}

	/**
	* Returns the xcg01732 of this vr technical spec_xcg part5.
	*
	* @return the xcg01732 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01732() {
		return _vrTechnicalSpec_XCGPart5.getXCG01732();
	}

	/**
	* Returns the xcg01733 of this vr technical spec_xcg part5.
	*
	* @return the xcg01733 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01733() {
		return _vrTechnicalSpec_XCGPart5.getXCG01733();
	}

	/**
	* Returns the xcg01734 of this vr technical spec_xcg part5.
	*
	* @return the xcg01734 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01734() {
		return _vrTechnicalSpec_XCGPart5.getXCG01734();
	}

	/**
	* Returns the xcg01735 of this vr technical spec_xcg part5.
	*
	* @return the xcg01735 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01735() {
		return _vrTechnicalSpec_XCGPart5.getXCG01735();
	}

	/**
	* Returns the xcg01736 of this vr technical spec_xcg part5.
	*
	* @return the xcg01736 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01736() {
		return _vrTechnicalSpec_XCGPart5.getXCG01736();
	}

	/**
	* Returns the xcg01737 of this vr technical spec_xcg part5.
	*
	* @return the xcg01737 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01737() {
		return _vrTechnicalSpec_XCGPart5.getXCG01737();
	}

	/**
	* Returns the xcg01738 of this vr technical spec_xcg part5.
	*
	* @return the xcg01738 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01738() {
		return _vrTechnicalSpec_XCGPart5.getXCG01738();
	}

	/**
	* Returns the xcg01739 of this vr technical spec_xcg part5.
	*
	* @return the xcg01739 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01739() {
		return _vrTechnicalSpec_XCGPart5.getXCG01739();
	}

	/**
	* Returns the xcg01740 of this vr technical spec_xcg part5.
	*
	* @return the xcg01740 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01740() {
		return _vrTechnicalSpec_XCGPart5.getXCG01740();
	}

	/**
	* Returns the xcg01741 of this vr technical spec_xcg part5.
	*
	* @return the xcg01741 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01741() {
		return _vrTechnicalSpec_XCGPart5.getXCG01741();
	}

	/**
	* Returns the xcg01742 of this vr technical spec_xcg part5.
	*
	* @return the xcg01742 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01742() {
		return _vrTechnicalSpec_XCGPart5.getXCG01742();
	}

	/**
	* Returns the xcg01744 of this vr technical spec_xcg part5.
	*
	* @return the xcg01744 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01744() {
		return _vrTechnicalSpec_XCGPart5.getXCG01744();
	}

	/**
	* Returns the xcg01745 of this vr technical spec_xcg part5.
	*
	* @return the xcg01745 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01745() {
		return _vrTechnicalSpec_XCGPart5.getXCG01745();
	}

	/**
	* Returns the xcg01746 of this vr technical spec_xcg part5.
	*
	* @return the xcg01746 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01746() {
		return _vrTechnicalSpec_XCGPart5.getXCG01746();
	}

	/**
	* Returns the xcg01747 of this vr technical spec_xcg part5.
	*
	* @return the xcg01747 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01747() {
		return _vrTechnicalSpec_XCGPart5.getXCG01747();
	}

	/**
	* Returns the xcg01748 of this vr technical spec_xcg part5.
	*
	* @return the xcg01748 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01748() {
		return _vrTechnicalSpec_XCGPart5.getXCG01748();
	}

	/**
	* Returns the xcg01749 of this vr technical spec_xcg part5.
	*
	* @return the xcg01749 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01749() {
		return _vrTechnicalSpec_XCGPart5.getXCG01749();
	}

	/**
	* Returns the xcg01750 of this vr technical spec_xcg part5.
	*
	* @return the xcg01750 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01750() {
		return _vrTechnicalSpec_XCGPart5.getXCG01750();
	}

	/**
	* Returns the xcg01751 of this vr technical spec_xcg part5.
	*
	* @return the xcg01751 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01751() {
		return _vrTechnicalSpec_XCGPart5.getXCG01751();
	}

	/**
	* Returns the xcg01752 of this vr technical spec_xcg part5.
	*
	* @return the xcg01752 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01752() {
		return _vrTechnicalSpec_XCGPart5.getXCG01752();
	}

	/**
	* Returns the xcg01753 of this vr technical spec_xcg part5.
	*
	* @return the xcg01753 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01753() {
		return _vrTechnicalSpec_XCGPart5.getXCG01753();
	}

	/**
	* Returns the xcg01754 of this vr technical spec_xcg part5.
	*
	* @return the xcg01754 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01754() {
		return _vrTechnicalSpec_XCGPart5.getXCG01754();
	}

	/**
	* Returns the xcg01756 of this vr technical spec_xcg part5.
	*
	* @return the xcg01756 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01756() {
		return _vrTechnicalSpec_XCGPart5.getXCG01756();
	}

	/**
	* Returns the xcg01923 of this vr technical spec_xcg part5.
	*
	* @return the xcg01923 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01923() {
		return _vrTechnicalSpec_XCGPart5.getXCG01923();
	}

	/**
	* Returns the xcg01924 of this vr technical spec_xcg part5.
	*
	* @return the xcg01924 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01924() {
		return _vrTechnicalSpec_XCGPart5.getXCG01924();
	}

	/**
	* Returns the xcg01925 of this vr technical spec_xcg part5.
	*
	* @return the xcg01925 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01925() {
		return _vrTechnicalSpec_XCGPart5.getXCG01925();
	}

	/**
	* Returns the xcg01926 of this vr technical spec_xcg part5.
	*
	* @return the xcg01926 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01926() {
		return _vrTechnicalSpec_XCGPart5.getXCG01926();
	}

	/**
	* Returns the xcg01928 of this vr technical spec_xcg part5.
	*
	* @return the xcg01928 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01928() {
		return _vrTechnicalSpec_XCGPart5.getXCG01928();
	}

	/**
	* Returns the xcg01929 of this vr technical spec_xcg part5.
	*
	* @return the xcg01929 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01929() {
		return _vrTechnicalSpec_XCGPart5.getXCG01929();
	}

	/**
	* Returns the xcg01930 of this vr technical spec_xcg part5.
	*
	* @return the xcg01930 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01930() {
		return _vrTechnicalSpec_XCGPart5.getXCG01930();
	}

	/**
	* Returns the xcg01931 of this vr technical spec_xcg part5.
	*
	* @return the xcg01931 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01931() {
		return _vrTechnicalSpec_XCGPart5.getXCG01931();
	}

	/**
	* Returns the xcg01932 of this vr technical spec_xcg part5.
	*
	* @return the xcg01932 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01932() {
		return _vrTechnicalSpec_XCGPart5.getXCG01932();
	}

	/**
	* Returns the xcg01933 of this vr technical spec_xcg part5.
	*
	* @return the xcg01933 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01933() {
		return _vrTechnicalSpec_XCGPart5.getXCG01933();
	}

	/**
	* Returns the xcg01934 of this vr technical spec_xcg part5.
	*
	* @return the xcg01934 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01934() {
		return _vrTechnicalSpec_XCGPart5.getXCG01934();
	}

	/**
	* Returns the xcg01935 of this vr technical spec_xcg part5.
	*
	* @return the xcg01935 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01935() {
		return _vrTechnicalSpec_XCGPart5.getXCG01935();
	}

	/**
	* Returns the xcg01936 of this vr technical spec_xcg part5.
	*
	* @return the xcg01936 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01936() {
		return _vrTechnicalSpec_XCGPart5.getXCG01936();
	}

	/**
	* Returns the xcg01937 of this vr technical spec_xcg part5.
	*
	* @return the xcg01937 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01937() {
		return _vrTechnicalSpec_XCGPart5.getXCG01937();
	}

	/**
	* Returns the xcg01938 of this vr technical spec_xcg part5.
	*
	* @return the xcg01938 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01938() {
		return _vrTechnicalSpec_XCGPart5.getXCG01938();
	}

	/**
	* Returns the xcg01939 of this vr technical spec_xcg part5.
	*
	* @return the xcg01939 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01939() {
		return _vrTechnicalSpec_XCGPart5.getXCG01939();
	}

	/**
	* Returns the xcg01940 of this vr technical spec_xcg part5.
	*
	* @return the xcg01940 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01940() {
		return _vrTechnicalSpec_XCGPart5.getXCG01940();
	}

	/**
	* Returns the xcg01941 of this vr technical spec_xcg part5.
	*
	* @return the xcg01941 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01941() {
		return _vrTechnicalSpec_XCGPart5.getXCG01941();
	}

	/**
	* Returns the xcg01942 of this vr technical spec_xcg part5.
	*
	* @return the xcg01942 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01942() {
		return _vrTechnicalSpec_XCGPart5.getXCG01942();
	}

	/**
	* Returns the xcg01943 of this vr technical spec_xcg part5.
	*
	* @return the xcg01943 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01943() {
		return _vrTechnicalSpec_XCGPart5.getXCG01943();
	}

	/**
	* Returns the xcg01944 of this vr technical spec_xcg part5.
	*
	* @return the xcg01944 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01944() {
		return _vrTechnicalSpec_XCGPart5.getXCG01944();
	}

	/**
	* Returns the xcg01945 of this vr technical spec_xcg part5.
	*
	* @return the xcg01945 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01945() {
		return _vrTechnicalSpec_XCGPart5.getXCG01945();
	}

	/**
	* Returns the xcg01946 of this vr technical spec_xcg part5.
	*
	* @return the xcg01946 of this vr technical spec_xcg part5
	*/
	@Override
	public java.lang.String getXCG01946() {
		return _vrTechnicalSpec_XCGPart5.getXCG01946();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XCGPart5.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XCGPart5.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xcg part5.
	*
	* @return the modify date of this vr technical spec_xcg part5
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XCGPart5.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xcg part5.
	*
	* @return the sync date of this vr technical spec_xcg part5
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XCGPart5.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xcg part5.
	*
	* @return the convert assemble ID of this vr technical spec_xcg part5
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XCGPart5.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xcg part5.
	*
	* @return the dossier ID of this vr technical spec_xcg part5
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XCGPart5.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xcg part5.
	*
	* @return the ID of this vr technical spec_xcg part5
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XCGPart5.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xcg part5.
	*
	* @return the mt core of this vr technical spec_xcg part5
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XCGPart5.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xcg part5.
	*
	* @return the primary key of this vr technical spec_xcg part5
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XCGPart5.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xcg part5.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xcg part5
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XCGPart5.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XCGPart5.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XCGPart5.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xcg part5.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xcg part5
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XCGPart5.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xcg part5.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xcg part5
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XCGPart5.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xcg part5.
	*
	* @param dossierId the dossier ID of this vr technical spec_xcg part5
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XCGPart5.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xcg part5.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xcg part5
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XCGPart5.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xcg part5.
	*
	* @param dossierNo the dossier no of this vr technical spec_xcg part5
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XCGPart5.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XCGPart5.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XCGPart5.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XCGPart5.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xcg part5.
	*
	* @param id the ID of this vr technical spec_xcg part5
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XCGPart5.setId(id);
	}

	/**
	* Sets the modify date of this vr technical spec_xcg part5.
	*
	* @param modifyDate the modify date of this vr technical spec_xcg part5
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XCGPart5.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xcg part5.
	*
	* @param mtCore the mt core of this vr technical spec_xcg part5
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XCGPart5.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XCGPart5.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xcg part5.
	*
	* @param primaryKey the primary key of this vr technical spec_xcg part5
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XCGPart5.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XCGPart5.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xcg part5.
	*
	* @param referenceUid the reference uid of this vr technical spec_xcg part5
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XCGPart5.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xcg part5.
	*
	* @param syncDate the sync date of this vr technical spec_xcg part5
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XCGPart5.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xcg part5.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xcg part5
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XCGPart5.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xcg01598 of this vr technical spec_xcg part5.
	*
	* @param XCG01598 the xcg01598 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01598(java.lang.String XCG01598) {
		_vrTechnicalSpec_XCGPart5.setXCG01598(XCG01598);
	}

	/**
	* Sets the xcg01599 of this vr technical spec_xcg part5.
	*
	* @param XCG01599 the xcg01599 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01599(java.lang.String XCG01599) {
		_vrTechnicalSpec_XCGPart5.setXCG01599(XCG01599);
	}

	/**
	* Sets the xcg01600 of this vr technical spec_xcg part5.
	*
	* @param XCG01600 the xcg01600 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01600(java.lang.String XCG01600) {
		_vrTechnicalSpec_XCGPart5.setXCG01600(XCG01600);
	}

	/**
	* Sets the xcg01601 of this vr technical spec_xcg part5.
	*
	* @param XCG01601 the xcg01601 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01601(java.lang.String XCG01601) {
		_vrTechnicalSpec_XCGPart5.setXCG01601(XCG01601);
	}

	/**
	* Sets the xcg01602 of this vr technical spec_xcg part5.
	*
	* @param XCG01602 the xcg01602 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01602(java.lang.String XCG01602) {
		_vrTechnicalSpec_XCGPart5.setXCG01602(XCG01602);
	}

	/**
	* Sets the xcg01603 of this vr technical spec_xcg part5.
	*
	* @param XCG01603 the xcg01603 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01603(java.lang.String XCG01603) {
		_vrTechnicalSpec_XCGPart5.setXCG01603(XCG01603);
	}

	/**
	* Sets the xcg01604 of this vr technical spec_xcg part5.
	*
	* @param XCG01604 the xcg01604 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01604(java.lang.String XCG01604) {
		_vrTechnicalSpec_XCGPart5.setXCG01604(XCG01604);
	}

	/**
	* Sets the xcg01605 of this vr technical spec_xcg part5.
	*
	* @param XCG01605 the xcg01605 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01605(java.lang.String XCG01605) {
		_vrTechnicalSpec_XCGPart5.setXCG01605(XCG01605);
	}

	/**
	* Sets the xcg01606 of this vr technical spec_xcg part5.
	*
	* @param XCG01606 the xcg01606 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01606(java.lang.String XCG01606) {
		_vrTechnicalSpec_XCGPart5.setXCG01606(XCG01606);
	}

	/**
	* Sets the xcg01607 of this vr technical spec_xcg part5.
	*
	* @param XCG01607 the xcg01607 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01607(java.lang.String XCG01607) {
		_vrTechnicalSpec_XCGPart5.setXCG01607(XCG01607);
	}

	/**
	* Sets the xcg01608 of this vr technical spec_xcg part5.
	*
	* @param XCG01608 the xcg01608 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01608(java.lang.String XCG01608) {
		_vrTechnicalSpec_XCGPart5.setXCG01608(XCG01608);
	}

	/**
	* Sets the xcg01609 of this vr technical spec_xcg part5.
	*
	* @param XCG01609 the xcg01609 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01609(java.lang.String XCG01609) {
		_vrTechnicalSpec_XCGPart5.setXCG01609(XCG01609);
	}

	/**
	* Sets the xcg01610 of this vr technical spec_xcg part5.
	*
	* @param XCG01610 the xcg01610 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01610(java.lang.String XCG01610) {
		_vrTechnicalSpec_XCGPart5.setXCG01610(XCG01610);
	}

	/**
	* Sets the xcg01611 of this vr technical spec_xcg part5.
	*
	* @param XCG01611 the xcg01611 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01611(java.lang.String XCG01611) {
		_vrTechnicalSpec_XCGPart5.setXCG01611(XCG01611);
	}

	/**
	* Sets the xcg01612 of this vr technical spec_xcg part5.
	*
	* @param XCG01612 the xcg01612 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01612(java.lang.String XCG01612) {
		_vrTechnicalSpec_XCGPart5.setXCG01612(XCG01612);
	}

	/**
	* Sets the xcg01613 of this vr technical spec_xcg part5.
	*
	* @param XCG01613 the xcg01613 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01613(java.lang.String XCG01613) {
		_vrTechnicalSpec_XCGPart5.setXCG01613(XCG01613);
	}

	/**
	* Sets the xcg01614 of this vr technical spec_xcg part5.
	*
	* @param XCG01614 the xcg01614 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01614(java.lang.String XCG01614) {
		_vrTechnicalSpec_XCGPart5.setXCG01614(XCG01614);
	}

	/**
	* Sets the xcg01615 of this vr technical spec_xcg part5.
	*
	* @param XCG01615 the xcg01615 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01615(java.lang.String XCG01615) {
		_vrTechnicalSpec_XCGPart5.setXCG01615(XCG01615);
	}

	/**
	* Sets the xcg01616 of this vr technical spec_xcg part5.
	*
	* @param XCG01616 the xcg01616 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01616(java.lang.String XCG01616) {
		_vrTechnicalSpec_XCGPart5.setXCG01616(XCG01616);
	}

	/**
	* Sets the xcg01617 of this vr technical spec_xcg part5.
	*
	* @param XCG01617 the xcg01617 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01617(java.lang.String XCG01617) {
		_vrTechnicalSpec_XCGPart5.setXCG01617(XCG01617);
	}

	/**
	* Sets the xcg01618 of this vr technical spec_xcg part5.
	*
	* @param XCG01618 the xcg01618 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01618(java.lang.String XCG01618) {
		_vrTechnicalSpec_XCGPart5.setXCG01618(XCG01618);
	}

	/**
	* Sets the xcg01619 of this vr technical spec_xcg part5.
	*
	* @param XCG01619 the xcg01619 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01619(java.lang.String XCG01619) {
		_vrTechnicalSpec_XCGPart5.setXCG01619(XCG01619);
	}

	/**
	* Sets the xcg01620 of this vr technical spec_xcg part5.
	*
	* @param XCG01620 the xcg01620 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01620(java.lang.String XCG01620) {
		_vrTechnicalSpec_XCGPart5.setXCG01620(XCG01620);
	}

	/**
	* Sets the xcg01621 of this vr technical spec_xcg part5.
	*
	* @param XCG01621 the xcg01621 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01621(java.lang.String XCG01621) {
		_vrTechnicalSpec_XCGPart5.setXCG01621(XCG01621);
	}

	/**
	* Sets the xcg01622 of this vr technical spec_xcg part5.
	*
	* @param XCG01622 the xcg01622 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01622(java.lang.String XCG01622) {
		_vrTechnicalSpec_XCGPart5.setXCG01622(XCG01622);
	}

	/**
	* Sets the xcg01623 of this vr technical spec_xcg part5.
	*
	* @param XCG01623 the xcg01623 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01623(java.lang.String XCG01623) {
		_vrTechnicalSpec_XCGPart5.setXCG01623(XCG01623);
	}

	/**
	* Sets the xcg01624 of this vr technical spec_xcg part5.
	*
	* @param XCG01624 the xcg01624 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01624(java.lang.String XCG01624) {
		_vrTechnicalSpec_XCGPart5.setXCG01624(XCG01624);
	}

	/**
	* Sets the xcg01625 of this vr technical spec_xcg part5.
	*
	* @param XCG01625 the xcg01625 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01625(java.lang.String XCG01625) {
		_vrTechnicalSpec_XCGPart5.setXCG01625(XCG01625);
	}

	/**
	* Sets the xcg01626 of this vr technical spec_xcg part5.
	*
	* @param XCG01626 the xcg01626 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01626(java.lang.String XCG01626) {
		_vrTechnicalSpec_XCGPart5.setXCG01626(XCG01626);
	}

	/**
	* Sets the xcg01627 of this vr technical spec_xcg part5.
	*
	* @param XCG01627 the xcg01627 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01627(java.lang.String XCG01627) {
		_vrTechnicalSpec_XCGPart5.setXCG01627(XCG01627);
	}

	/**
	* Sets the xcg01628 of this vr technical spec_xcg part5.
	*
	* @param XCG01628 the xcg01628 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01628(java.lang.String XCG01628) {
		_vrTechnicalSpec_XCGPart5.setXCG01628(XCG01628);
	}

	/**
	* Sets the xcg01630 of this vr technical spec_xcg part5.
	*
	* @param XCG01630 the xcg01630 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01630(java.lang.String XCG01630) {
		_vrTechnicalSpec_XCGPart5.setXCG01630(XCG01630);
	}

	/**
	* Sets the xcg01631 of this vr technical spec_xcg part5.
	*
	* @param XCG01631 the xcg01631 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01631(java.lang.String XCG01631) {
		_vrTechnicalSpec_XCGPart5.setXCG01631(XCG01631);
	}

	/**
	* Sets the xcg01632 of this vr technical spec_xcg part5.
	*
	* @param XCG01632 the xcg01632 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01632(java.lang.String XCG01632) {
		_vrTechnicalSpec_XCGPart5.setXCG01632(XCG01632);
	}

	/**
	* Sets the xcg01633 of this vr technical spec_xcg part5.
	*
	* @param XCG01633 the xcg01633 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01633(java.lang.String XCG01633) {
		_vrTechnicalSpec_XCGPart5.setXCG01633(XCG01633);
	}

	/**
	* Sets the xcg01634 of this vr technical spec_xcg part5.
	*
	* @param XCG01634 the xcg01634 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01634(java.lang.String XCG01634) {
		_vrTechnicalSpec_XCGPart5.setXCG01634(XCG01634);
	}

	/**
	* Sets the xcg01635 of this vr technical spec_xcg part5.
	*
	* @param XCG01635 the xcg01635 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01635(java.lang.String XCG01635) {
		_vrTechnicalSpec_XCGPart5.setXCG01635(XCG01635);
	}

	/**
	* Sets the xcg01636 of this vr technical spec_xcg part5.
	*
	* @param XCG01636 the xcg01636 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01636(java.lang.String XCG01636) {
		_vrTechnicalSpec_XCGPart5.setXCG01636(XCG01636);
	}

	/**
	* Sets the xcg01637 of this vr technical spec_xcg part5.
	*
	* @param XCG01637 the xcg01637 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01637(java.lang.String XCG01637) {
		_vrTechnicalSpec_XCGPart5.setXCG01637(XCG01637);
	}

	/**
	* Sets the xcg01638 of this vr technical spec_xcg part5.
	*
	* @param XCG01638 the xcg01638 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01638(java.lang.String XCG01638) {
		_vrTechnicalSpec_XCGPart5.setXCG01638(XCG01638);
	}

	/**
	* Sets the xcg01639 of this vr technical spec_xcg part5.
	*
	* @param XCG01639 the xcg01639 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01639(java.lang.String XCG01639) {
		_vrTechnicalSpec_XCGPart5.setXCG01639(XCG01639);
	}

	/**
	* Sets the xcg01640 of this vr technical spec_xcg part5.
	*
	* @param XCG01640 the xcg01640 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01640(java.lang.String XCG01640) {
		_vrTechnicalSpec_XCGPart5.setXCG01640(XCG01640);
	}

	/**
	* Sets the xcg01641 of this vr technical spec_xcg part5.
	*
	* @param XCG01641 the xcg01641 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01641(java.lang.String XCG01641) {
		_vrTechnicalSpec_XCGPart5.setXCG01641(XCG01641);
	}

	/**
	* Sets the xcg01642 of this vr technical spec_xcg part5.
	*
	* @param XCG01642 the xcg01642 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01642(java.lang.String XCG01642) {
		_vrTechnicalSpec_XCGPart5.setXCG01642(XCG01642);
	}

	/**
	* Sets the xcg01643 of this vr technical spec_xcg part5.
	*
	* @param XCG01643 the xcg01643 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01643(java.lang.String XCG01643) {
		_vrTechnicalSpec_XCGPart5.setXCG01643(XCG01643);
	}

	/**
	* Sets the xcg01644 of this vr technical spec_xcg part5.
	*
	* @param XCG01644 the xcg01644 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01644(java.lang.String XCG01644) {
		_vrTechnicalSpec_XCGPart5.setXCG01644(XCG01644);
	}

	/**
	* Sets the xcg01645 of this vr technical spec_xcg part5.
	*
	* @param XCG01645 the xcg01645 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01645(java.lang.String XCG01645) {
		_vrTechnicalSpec_XCGPart5.setXCG01645(XCG01645);
	}

	/**
	* Sets the xcg01646 of this vr technical spec_xcg part5.
	*
	* @param XCG01646 the xcg01646 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01646(java.lang.String XCG01646) {
		_vrTechnicalSpec_XCGPart5.setXCG01646(XCG01646);
	}

	/**
	* Sets the xcg01647 of this vr technical spec_xcg part5.
	*
	* @param XCG01647 the xcg01647 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01647(java.lang.String XCG01647) {
		_vrTechnicalSpec_XCGPart5.setXCG01647(XCG01647);
	}

	/**
	* Sets the xcg01648 of this vr technical spec_xcg part5.
	*
	* @param XCG01648 the xcg01648 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01648(java.lang.String XCG01648) {
		_vrTechnicalSpec_XCGPart5.setXCG01648(XCG01648);
	}

	/**
	* Sets the xcg01649 of this vr technical spec_xcg part5.
	*
	* @param XCG01649 the xcg01649 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01649(java.lang.String XCG01649) {
		_vrTechnicalSpec_XCGPart5.setXCG01649(XCG01649);
	}

	/**
	* Sets the xcg01650 of this vr technical spec_xcg part5.
	*
	* @param XCG01650 the xcg01650 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01650(java.lang.String XCG01650) {
		_vrTechnicalSpec_XCGPart5.setXCG01650(XCG01650);
	}

	/**
	* Sets the xcg01651 of this vr technical spec_xcg part5.
	*
	* @param XCG01651 the xcg01651 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01651(java.lang.String XCG01651) {
		_vrTechnicalSpec_XCGPart5.setXCG01651(XCG01651);
	}

	/**
	* Sets the xcg01652 of this vr technical spec_xcg part5.
	*
	* @param XCG01652 the xcg01652 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01652(java.lang.String XCG01652) {
		_vrTechnicalSpec_XCGPart5.setXCG01652(XCG01652);
	}

	/**
	* Sets the xcg01653 of this vr technical spec_xcg part5.
	*
	* @param XCG01653 the xcg01653 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01653(java.lang.String XCG01653) {
		_vrTechnicalSpec_XCGPart5.setXCG01653(XCG01653);
	}

	/**
	* Sets the xcg01654 of this vr technical spec_xcg part5.
	*
	* @param XCG01654 the xcg01654 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01654(java.lang.String XCG01654) {
		_vrTechnicalSpec_XCGPart5.setXCG01654(XCG01654);
	}

	/**
	* Sets the xcg01655 of this vr technical spec_xcg part5.
	*
	* @param XCG01655 the xcg01655 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01655(java.lang.String XCG01655) {
		_vrTechnicalSpec_XCGPart5.setXCG01655(XCG01655);
	}

	/**
	* Sets the xcg01656 of this vr technical spec_xcg part5.
	*
	* @param XCG01656 the xcg01656 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01656(java.lang.String XCG01656) {
		_vrTechnicalSpec_XCGPart5.setXCG01656(XCG01656);
	}

	/**
	* Sets the xcg01657 of this vr technical spec_xcg part5.
	*
	* @param XCG01657 the xcg01657 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01657(java.lang.String XCG01657) {
		_vrTechnicalSpec_XCGPart5.setXCG01657(XCG01657);
	}

	/**
	* Sets the xcg01658 of this vr technical spec_xcg part5.
	*
	* @param XCG01658 the xcg01658 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01658(java.lang.String XCG01658) {
		_vrTechnicalSpec_XCGPart5.setXCG01658(XCG01658);
	}

	/**
	* Sets the xcg01659 of this vr technical spec_xcg part5.
	*
	* @param XCG01659 the xcg01659 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01659(java.lang.String XCG01659) {
		_vrTechnicalSpec_XCGPart5.setXCG01659(XCG01659);
	}

	/**
	* Sets the xcg01660 of this vr technical spec_xcg part5.
	*
	* @param XCG01660 the xcg01660 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01660(java.lang.String XCG01660) {
		_vrTechnicalSpec_XCGPart5.setXCG01660(XCG01660);
	}

	/**
	* Sets the xcg01661 of this vr technical spec_xcg part5.
	*
	* @param XCG01661 the xcg01661 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01661(java.lang.String XCG01661) {
		_vrTechnicalSpec_XCGPart5.setXCG01661(XCG01661);
	}

	/**
	* Sets the xcg01662 of this vr technical spec_xcg part5.
	*
	* @param XCG01662 the xcg01662 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01662(java.lang.String XCG01662) {
		_vrTechnicalSpec_XCGPart5.setXCG01662(XCG01662);
	}

	/**
	* Sets the xcg01663 of this vr technical spec_xcg part5.
	*
	* @param XCG01663 the xcg01663 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01663(java.lang.String XCG01663) {
		_vrTechnicalSpec_XCGPart5.setXCG01663(XCG01663);
	}

	/**
	* Sets the xcg01664 of this vr technical spec_xcg part5.
	*
	* @param XCG01664 the xcg01664 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01664(java.lang.String XCG01664) {
		_vrTechnicalSpec_XCGPart5.setXCG01664(XCG01664);
	}

	/**
	* Sets the xcg01665 of this vr technical spec_xcg part5.
	*
	* @param XCG01665 the xcg01665 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01665(java.lang.String XCG01665) {
		_vrTechnicalSpec_XCGPart5.setXCG01665(XCG01665);
	}

	/**
	* Sets the xcg01666 of this vr technical spec_xcg part5.
	*
	* @param XCG01666 the xcg01666 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01666(java.lang.String XCG01666) {
		_vrTechnicalSpec_XCGPart5.setXCG01666(XCG01666);
	}

	/**
	* Sets the xcg01667 of this vr technical spec_xcg part5.
	*
	* @param XCG01667 the xcg01667 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01667(java.lang.String XCG01667) {
		_vrTechnicalSpec_XCGPart5.setXCG01667(XCG01667);
	}

	/**
	* Sets the xcg01668 of this vr technical spec_xcg part5.
	*
	* @param XCG01668 the xcg01668 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01668(java.lang.String XCG01668) {
		_vrTechnicalSpec_XCGPart5.setXCG01668(XCG01668);
	}

	/**
	* Sets the xcg01669 of this vr technical spec_xcg part5.
	*
	* @param XCG01669 the xcg01669 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01669(java.lang.String XCG01669) {
		_vrTechnicalSpec_XCGPart5.setXCG01669(XCG01669);
	}

	/**
	* Sets the xcg01670 of this vr technical spec_xcg part5.
	*
	* @param XCG01670 the xcg01670 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01670(java.lang.String XCG01670) {
		_vrTechnicalSpec_XCGPart5.setXCG01670(XCG01670);
	}

	/**
	* Sets the xcg01671 of this vr technical spec_xcg part5.
	*
	* @param XCG01671 the xcg01671 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01671(java.lang.String XCG01671) {
		_vrTechnicalSpec_XCGPart5.setXCG01671(XCG01671);
	}

	/**
	* Sets the xcg01672 of this vr technical spec_xcg part5.
	*
	* @param XCG01672 the xcg01672 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01672(java.lang.String XCG01672) {
		_vrTechnicalSpec_XCGPart5.setXCG01672(XCG01672);
	}

	/**
	* Sets the xcg01673 of this vr technical spec_xcg part5.
	*
	* @param XCG01673 the xcg01673 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01673(java.lang.String XCG01673) {
		_vrTechnicalSpec_XCGPart5.setXCG01673(XCG01673);
	}

	/**
	* Sets the xcg01674 of this vr technical spec_xcg part5.
	*
	* @param XCG01674 the xcg01674 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01674(java.lang.String XCG01674) {
		_vrTechnicalSpec_XCGPart5.setXCG01674(XCG01674);
	}

	/**
	* Sets the xcg01675 of this vr technical spec_xcg part5.
	*
	* @param XCG01675 the xcg01675 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01675(java.lang.String XCG01675) {
		_vrTechnicalSpec_XCGPart5.setXCG01675(XCG01675);
	}

	/**
	* Sets the xcg01676 of this vr technical spec_xcg part5.
	*
	* @param XCG01676 the xcg01676 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01676(java.lang.String XCG01676) {
		_vrTechnicalSpec_XCGPart5.setXCG01676(XCG01676);
	}

	/**
	* Sets the xcg01677 of this vr technical spec_xcg part5.
	*
	* @param XCG01677 the xcg01677 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01677(java.lang.String XCG01677) {
		_vrTechnicalSpec_XCGPart5.setXCG01677(XCG01677);
	}

	/**
	* Sets the xcg01678 of this vr technical spec_xcg part5.
	*
	* @param XCG01678 the xcg01678 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01678(java.lang.String XCG01678) {
		_vrTechnicalSpec_XCGPart5.setXCG01678(XCG01678);
	}

	/**
	* Sets the xcg01679 of this vr technical spec_xcg part5.
	*
	* @param XCG01679 the xcg01679 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01679(java.lang.String XCG01679) {
		_vrTechnicalSpec_XCGPart5.setXCG01679(XCG01679);
	}

	/**
	* Sets the xcg01680 of this vr technical spec_xcg part5.
	*
	* @param XCG01680 the xcg01680 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01680(java.lang.String XCG01680) {
		_vrTechnicalSpec_XCGPart5.setXCG01680(XCG01680);
	}

	/**
	* Sets the xcg01681 of this vr technical spec_xcg part5.
	*
	* @param XCG01681 the xcg01681 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01681(java.lang.String XCG01681) {
		_vrTechnicalSpec_XCGPart5.setXCG01681(XCG01681);
	}

	/**
	* Sets the xcg01682 of this vr technical spec_xcg part5.
	*
	* @param XCG01682 the xcg01682 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01682(java.lang.String XCG01682) {
		_vrTechnicalSpec_XCGPart5.setXCG01682(XCG01682);
	}

	/**
	* Sets the xcg01683 of this vr technical spec_xcg part5.
	*
	* @param XCG01683 the xcg01683 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01683(java.lang.String XCG01683) {
		_vrTechnicalSpec_XCGPart5.setXCG01683(XCG01683);
	}

	/**
	* Sets the xcg01684 of this vr technical spec_xcg part5.
	*
	* @param XCG01684 the xcg01684 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01684(java.lang.String XCG01684) {
		_vrTechnicalSpec_XCGPart5.setXCG01684(XCG01684);
	}

	/**
	* Sets the xcg01685 of this vr technical spec_xcg part5.
	*
	* @param XCG01685 the xcg01685 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01685(java.lang.String XCG01685) {
		_vrTechnicalSpec_XCGPart5.setXCG01685(XCG01685);
	}

	/**
	* Sets the xcg01686 of this vr technical spec_xcg part5.
	*
	* @param XCG01686 the xcg01686 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01686(java.lang.String XCG01686) {
		_vrTechnicalSpec_XCGPart5.setXCG01686(XCG01686);
	}

	/**
	* Sets the xcg01687 of this vr technical spec_xcg part5.
	*
	* @param XCG01687 the xcg01687 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01687(java.lang.String XCG01687) {
		_vrTechnicalSpec_XCGPart5.setXCG01687(XCG01687);
	}

	/**
	* Sets the xcg01688 of this vr technical spec_xcg part5.
	*
	* @param XCG01688 the xcg01688 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01688(java.lang.String XCG01688) {
		_vrTechnicalSpec_XCGPart5.setXCG01688(XCG01688);
	}

	/**
	* Sets the xcg01689 of this vr technical spec_xcg part5.
	*
	* @param XCG01689 the xcg01689 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01689(java.lang.String XCG01689) {
		_vrTechnicalSpec_XCGPart5.setXCG01689(XCG01689);
	}

	/**
	* Sets the xcg01690 of this vr technical spec_xcg part5.
	*
	* @param XCG01690 the xcg01690 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01690(java.lang.String XCG01690) {
		_vrTechnicalSpec_XCGPart5.setXCG01690(XCG01690);
	}

	/**
	* Sets the xcg01691 of this vr technical spec_xcg part5.
	*
	* @param XCG01691 the xcg01691 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01691(java.lang.String XCG01691) {
		_vrTechnicalSpec_XCGPart5.setXCG01691(XCG01691);
	}

	/**
	* Sets the xcg01692 of this vr technical spec_xcg part5.
	*
	* @param XCG01692 the xcg01692 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01692(java.lang.String XCG01692) {
		_vrTechnicalSpec_XCGPart5.setXCG01692(XCG01692);
	}

	/**
	* Sets the xcg01693 of this vr technical spec_xcg part5.
	*
	* @param XCG01693 the xcg01693 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01693(java.lang.String XCG01693) {
		_vrTechnicalSpec_XCGPart5.setXCG01693(XCG01693);
	}

	/**
	* Sets the xcg01694 of this vr technical spec_xcg part5.
	*
	* @param XCG01694 the xcg01694 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01694(java.lang.String XCG01694) {
		_vrTechnicalSpec_XCGPart5.setXCG01694(XCG01694);
	}

	/**
	* Sets the xcg01695 of this vr technical spec_xcg part5.
	*
	* @param XCG01695 the xcg01695 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01695(java.lang.String XCG01695) {
		_vrTechnicalSpec_XCGPart5.setXCG01695(XCG01695);
	}

	/**
	* Sets the xcg01696 of this vr technical spec_xcg part5.
	*
	* @param XCG01696 the xcg01696 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01696(java.lang.String XCG01696) {
		_vrTechnicalSpec_XCGPart5.setXCG01696(XCG01696);
	}

	/**
	* Sets the xcg01697 of this vr technical spec_xcg part5.
	*
	* @param XCG01697 the xcg01697 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01697(java.lang.String XCG01697) {
		_vrTechnicalSpec_XCGPart5.setXCG01697(XCG01697);
	}

	/**
	* Sets the xcg01698 of this vr technical spec_xcg part5.
	*
	* @param XCG01698 the xcg01698 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01698(java.lang.String XCG01698) {
		_vrTechnicalSpec_XCGPart5.setXCG01698(XCG01698);
	}

	/**
	* Sets the xcg01699 of this vr technical spec_xcg part5.
	*
	* @param XCG01699 the xcg01699 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01699(java.lang.String XCG01699) {
		_vrTechnicalSpec_XCGPart5.setXCG01699(XCG01699);
	}

	/**
	* Sets the xcg01700 of this vr technical spec_xcg part5.
	*
	* @param XCG01700 the xcg01700 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01700(java.lang.String XCG01700) {
		_vrTechnicalSpec_XCGPart5.setXCG01700(XCG01700);
	}

	/**
	* Sets the xcg01701 of this vr technical spec_xcg part5.
	*
	* @param XCG01701 the xcg01701 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01701(java.lang.String XCG01701) {
		_vrTechnicalSpec_XCGPart5.setXCG01701(XCG01701);
	}

	/**
	* Sets the xcg01702 of this vr technical spec_xcg part5.
	*
	* @param XCG01702 the xcg01702 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01702(java.lang.String XCG01702) {
		_vrTechnicalSpec_XCGPart5.setXCG01702(XCG01702);
	}

	/**
	* Sets the xcg01703 of this vr technical spec_xcg part5.
	*
	* @param XCG01703 the xcg01703 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01703(java.lang.String XCG01703) {
		_vrTechnicalSpec_XCGPart5.setXCG01703(XCG01703);
	}

	/**
	* Sets the xcg01704 of this vr technical spec_xcg part5.
	*
	* @param XCG01704 the xcg01704 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01704(java.lang.String XCG01704) {
		_vrTechnicalSpec_XCGPart5.setXCG01704(XCG01704);
	}

	/**
	* Sets the xcg01705 of this vr technical spec_xcg part5.
	*
	* @param XCG01705 the xcg01705 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01705(java.lang.String XCG01705) {
		_vrTechnicalSpec_XCGPart5.setXCG01705(XCG01705);
	}

	/**
	* Sets the xcg01706 of this vr technical spec_xcg part5.
	*
	* @param XCG01706 the xcg01706 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01706(java.lang.String XCG01706) {
		_vrTechnicalSpec_XCGPart5.setXCG01706(XCG01706);
	}

	/**
	* Sets the xcg01707 of this vr technical spec_xcg part5.
	*
	* @param XCG01707 the xcg01707 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01707(java.lang.String XCG01707) {
		_vrTechnicalSpec_XCGPart5.setXCG01707(XCG01707);
	}

	/**
	* Sets the xcg01708 of this vr technical spec_xcg part5.
	*
	* @param XCG01708 the xcg01708 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01708(java.lang.String XCG01708) {
		_vrTechnicalSpec_XCGPart5.setXCG01708(XCG01708);
	}

	/**
	* Sets the xcg01709 of this vr technical spec_xcg part5.
	*
	* @param XCG01709 the xcg01709 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01709(java.lang.String XCG01709) {
		_vrTechnicalSpec_XCGPart5.setXCG01709(XCG01709);
	}

	/**
	* Sets the xcg01710 of this vr technical spec_xcg part5.
	*
	* @param XCG01710 the xcg01710 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01710(java.lang.String XCG01710) {
		_vrTechnicalSpec_XCGPart5.setXCG01710(XCG01710);
	}

	/**
	* Sets the xcg01711 of this vr technical spec_xcg part5.
	*
	* @param XCG01711 the xcg01711 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01711(java.lang.String XCG01711) {
		_vrTechnicalSpec_XCGPart5.setXCG01711(XCG01711);
	}

	/**
	* Sets the xcg01712 of this vr technical spec_xcg part5.
	*
	* @param XCG01712 the xcg01712 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01712(java.lang.String XCG01712) {
		_vrTechnicalSpec_XCGPart5.setXCG01712(XCG01712);
	}

	/**
	* Sets the xcg01713 of this vr technical spec_xcg part5.
	*
	* @param XCG01713 the xcg01713 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01713(java.lang.String XCG01713) {
		_vrTechnicalSpec_XCGPart5.setXCG01713(XCG01713);
	}

	/**
	* Sets the xcg01714 of this vr technical spec_xcg part5.
	*
	* @param XCG01714 the xcg01714 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01714(java.lang.String XCG01714) {
		_vrTechnicalSpec_XCGPart5.setXCG01714(XCG01714);
	}

	/**
	* Sets the xcg01715 of this vr technical spec_xcg part5.
	*
	* @param XCG01715 the xcg01715 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01715(java.lang.String XCG01715) {
		_vrTechnicalSpec_XCGPart5.setXCG01715(XCG01715);
	}

	/**
	* Sets the xcg01716 of this vr technical spec_xcg part5.
	*
	* @param XCG01716 the xcg01716 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01716(java.lang.String XCG01716) {
		_vrTechnicalSpec_XCGPart5.setXCG01716(XCG01716);
	}

	/**
	* Sets the xcg01717 of this vr technical spec_xcg part5.
	*
	* @param XCG01717 the xcg01717 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01717(java.lang.String XCG01717) {
		_vrTechnicalSpec_XCGPart5.setXCG01717(XCG01717);
	}

	/**
	* Sets the xcg01718 of this vr technical spec_xcg part5.
	*
	* @param XCG01718 the xcg01718 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01718(java.lang.String XCG01718) {
		_vrTechnicalSpec_XCGPart5.setXCG01718(XCG01718);
	}

	/**
	* Sets the xcg01719 of this vr technical spec_xcg part5.
	*
	* @param XCG01719 the xcg01719 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01719(java.lang.String XCG01719) {
		_vrTechnicalSpec_XCGPart5.setXCG01719(XCG01719);
	}

	/**
	* Sets the xcg01720 of this vr technical spec_xcg part5.
	*
	* @param XCG01720 the xcg01720 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01720(java.lang.String XCG01720) {
		_vrTechnicalSpec_XCGPart5.setXCG01720(XCG01720);
	}

	/**
	* Sets the xcg01721 of this vr technical spec_xcg part5.
	*
	* @param XCG01721 the xcg01721 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01721(java.lang.String XCG01721) {
		_vrTechnicalSpec_XCGPart5.setXCG01721(XCG01721);
	}

	/**
	* Sets the xcg01722 of this vr technical spec_xcg part5.
	*
	* @param XCG01722 the xcg01722 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01722(java.lang.String XCG01722) {
		_vrTechnicalSpec_XCGPart5.setXCG01722(XCG01722);
	}

	/**
	* Sets the xcg01723 of this vr technical spec_xcg part5.
	*
	* @param XCG01723 the xcg01723 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01723(java.lang.String XCG01723) {
		_vrTechnicalSpec_XCGPart5.setXCG01723(XCG01723);
	}

	/**
	* Sets the xcg01724 of this vr technical spec_xcg part5.
	*
	* @param XCG01724 the xcg01724 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01724(java.lang.String XCG01724) {
		_vrTechnicalSpec_XCGPart5.setXCG01724(XCG01724);
	}

	/**
	* Sets the xcg01725 of this vr technical spec_xcg part5.
	*
	* @param XCG01725 the xcg01725 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01725(java.lang.String XCG01725) {
		_vrTechnicalSpec_XCGPart5.setXCG01725(XCG01725);
	}

	/**
	* Sets the xcg01726 of this vr technical spec_xcg part5.
	*
	* @param XCG01726 the xcg01726 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01726(java.lang.String XCG01726) {
		_vrTechnicalSpec_XCGPart5.setXCG01726(XCG01726);
	}

	/**
	* Sets the xcg01727 of this vr technical spec_xcg part5.
	*
	* @param XCG01727 the xcg01727 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01727(java.lang.String XCG01727) {
		_vrTechnicalSpec_XCGPart5.setXCG01727(XCG01727);
	}

	/**
	* Sets the xcg01728 of this vr technical spec_xcg part5.
	*
	* @param XCG01728 the xcg01728 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01728(java.lang.String XCG01728) {
		_vrTechnicalSpec_XCGPart5.setXCG01728(XCG01728);
	}

	/**
	* Sets the xcg01729 of this vr technical spec_xcg part5.
	*
	* @param XCG01729 the xcg01729 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01729(java.lang.String XCG01729) {
		_vrTechnicalSpec_XCGPart5.setXCG01729(XCG01729);
	}

	/**
	* Sets the xcg01730 of this vr technical spec_xcg part5.
	*
	* @param XCG01730 the xcg01730 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01730(java.lang.String XCG01730) {
		_vrTechnicalSpec_XCGPart5.setXCG01730(XCG01730);
	}

	/**
	* Sets the xcg01731 of this vr technical spec_xcg part5.
	*
	* @param XCG01731 the xcg01731 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01731(java.lang.String XCG01731) {
		_vrTechnicalSpec_XCGPart5.setXCG01731(XCG01731);
	}

	/**
	* Sets the xcg01732 of this vr technical spec_xcg part5.
	*
	* @param XCG01732 the xcg01732 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01732(java.lang.String XCG01732) {
		_vrTechnicalSpec_XCGPart5.setXCG01732(XCG01732);
	}

	/**
	* Sets the xcg01733 of this vr technical spec_xcg part5.
	*
	* @param XCG01733 the xcg01733 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01733(java.lang.String XCG01733) {
		_vrTechnicalSpec_XCGPart5.setXCG01733(XCG01733);
	}

	/**
	* Sets the xcg01734 of this vr technical spec_xcg part5.
	*
	* @param XCG01734 the xcg01734 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01734(java.lang.String XCG01734) {
		_vrTechnicalSpec_XCGPart5.setXCG01734(XCG01734);
	}

	/**
	* Sets the xcg01735 of this vr technical spec_xcg part5.
	*
	* @param XCG01735 the xcg01735 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01735(java.lang.String XCG01735) {
		_vrTechnicalSpec_XCGPart5.setXCG01735(XCG01735);
	}

	/**
	* Sets the xcg01736 of this vr technical spec_xcg part5.
	*
	* @param XCG01736 the xcg01736 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01736(java.lang.String XCG01736) {
		_vrTechnicalSpec_XCGPart5.setXCG01736(XCG01736);
	}

	/**
	* Sets the xcg01737 of this vr technical spec_xcg part5.
	*
	* @param XCG01737 the xcg01737 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01737(java.lang.String XCG01737) {
		_vrTechnicalSpec_XCGPart5.setXCG01737(XCG01737);
	}

	/**
	* Sets the xcg01738 of this vr technical spec_xcg part5.
	*
	* @param XCG01738 the xcg01738 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01738(java.lang.String XCG01738) {
		_vrTechnicalSpec_XCGPart5.setXCG01738(XCG01738);
	}

	/**
	* Sets the xcg01739 of this vr technical spec_xcg part5.
	*
	* @param XCG01739 the xcg01739 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01739(java.lang.String XCG01739) {
		_vrTechnicalSpec_XCGPart5.setXCG01739(XCG01739);
	}

	/**
	* Sets the xcg01740 of this vr technical spec_xcg part5.
	*
	* @param XCG01740 the xcg01740 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01740(java.lang.String XCG01740) {
		_vrTechnicalSpec_XCGPart5.setXCG01740(XCG01740);
	}

	/**
	* Sets the xcg01741 of this vr technical spec_xcg part5.
	*
	* @param XCG01741 the xcg01741 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01741(java.lang.String XCG01741) {
		_vrTechnicalSpec_XCGPart5.setXCG01741(XCG01741);
	}

	/**
	* Sets the xcg01742 of this vr technical spec_xcg part5.
	*
	* @param XCG01742 the xcg01742 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01742(java.lang.String XCG01742) {
		_vrTechnicalSpec_XCGPart5.setXCG01742(XCG01742);
	}

	/**
	* Sets the xcg01744 of this vr technical spec_xcg part5.
	*
	* @param XCG01744 the xcg01744 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01744(java.lang.String XCG01744) {
		_vrTechnicalSpec_XCGPart5.setXCG01744(XCG01744);
	}

	/**
	* Sets the xcg01745 of this vr technical spec_xcg part5.
	*
	* @param XCG01745 the xcg01745 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01745(java.lang.String XCG01745) {
		_vrTechnicalSpec_XCGPart5.setXCG01745(XCG01745);
	}

	/**
	* Sets the xcg01746 of this vr technical spec_xcg part5.
	*
	* @param XCG01746 the xcg01746 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01746(java.lang.String XCG01746) {
		_vrTechnicalSpec_XCGPart5.setXCG01746(XCG01746);
	}

	/**
	* Sets the xcg01747 of this vr technical spec_xcg part5.
	*
	* @param XCG01747 the xcg01747 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01747(java.lang.String XCG01747) {
		_vrTechnicalSpec_XCGPart5.setXCG01747(XCG01747);
	}

	/**
	* Sets the xcg01748 of this vr technical spec_xcg part5.
	*
	* @param XCG01748 the xcg01748 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01748(java.lang.String XCG01748) {
		_vrTechnicalSpec_XCGPart5.setXCG01748(XCG01748);
	}

	/**
	* Sets the xcg01749 of this vr technical spec_xcg part5.
	*
	* @param XCG01749 the xcg01749 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01749(java.lang.String XCG01749) {
		_vrTechnicalSpec_XCGPart5.setXCG01749(XCG01749);
	}

	/**
	* Sets the xcg01750 of this vr technical spec_xcg part5.
	*
	* @param XCG01750 the xcg01750 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01750(java.lang.String XCG01750) {
		_vrTechnicalSpec_XCGPart5.setXCG01750(XCG01750);
	}

	/**
	* Sets the xcg01751 of this vr technical spec_xcg part5.
	*
	* @param XCG01751 the xcg01751 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01751(java.lang.String XCG01751) {
		_vrTechnicalSpec_XCGPart5.setXCG01751(XCG01751);
	}

	/**
	* Sets the xcg01752 of this vr technical spec_xcg part5.
	*
	* @param XCG01752 the xcg01752 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01752(java.lang.String XCG01752) {
		_vrTechnicalSpec_XCGPart5.setXCG01752(XCG01752);
	}

	/**
	* Sets the xcg01753 of this vr technical spec_xcg part5.
	*
	* @param XCG01753 the xcg01753 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01753(java.lang.String XCG01753) {
		_vrTechnicalSpec_XCGPart5.setXCG01753(XCG01753);
	}

	/**
	* Sets the xcg01754 of this vr technical spec_xcg part5.
	*
	* @param XCG01754 the xcg01754 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01754(java.lang.String XCG01754) {
		_vrTechnicalSpec_XCGPart5.setXCG01754(XCG01754);
	}

	/**
	* Sets the xcg01756 of this vr technical spec_xcg part5.
	*
	* @param XCG01756 the xcg01756 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01756(java.lang.String XCG01756) {
		_vrTechnicalSpec_XCGPart5.setXCG01756(XCG01756);
	}

	/**
	* Sets the xcg01923 of this vr technical spec_xcg part5.
	*
	* @param XCG01923 the xcg01923 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01923(java.lang.String XCG01923) {
		_vrTechnicalSpec_XCGPart5.setXCG01923(XCG01923);
	}

	/**
	* Sets the xcg01924 of this vr technical spec_xcg part5.
	*
	* @param XCG01924 the xcg01924 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01924(java.lang.String XCG01924) {
		_vrTechnicalSpec_XCGPart5.setXCG01924(XCG01924);
	}

	/**
	* Sets the xcg01925 of this vr technical spec_xcg part5.
	*
	* @param XCG01925 the xcg01925 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01925(java.lang.String XCG01925) {
		_vrTechnicalSpec_XCGPart5.setXCG01925(XCG01925);
	}

	/**
	* Sets the xcg01926 of this vr technical spec_xcg part5.
	*
	* @param XCG01926 the xcg01926 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01926(java.lang.String XCG01926) {
		_vrTechnicalSpec_XCGPart5.setXCG01926(XCG01926);
	}

	/**
	* Sets the xcg01928 of this vr technical spec_xcg part5.
	*
	* @param XCG01928 the xcg01928 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01928(java.lang.String XCG01928) {
		_vrTechnicalSpec_XCGPart5.setXCG01928(XCG01928);
	}

	/**
	* Sets the xcg01929 of this vr technical spec_xcg part5.
	*
	* @param XCG01929 the xcg01929 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01929(java.lang.String XCG01929) {
		_vrTechnicalSpec_XCGPart5.setXCG01929(XCG01929);
	}

	/**
	* Sets the xcg01930 of this vr technical spec_xcg part5.
	*
	* @param XCG01930 the xcg01930 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01930(java.lang.String XCG01930) {
		_vrTechnicalSpec_XCGPart5.setXCG01930(XCG01930);
	}

	/**
	* Sets the xcg01931 of this vr technical spec_xcg part5.
	*
	* @param XCG01931 the xcg01931 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01931(java.lang.String XCG01931) {
		_vrTechnicalSpec_XCGPart5.setXCG01931(XCG01931);
	}

	/**
	* Sets the xcg01932 of this vr technical spec_xcg part5.
	*
	* @param XCG01932 the xcg01932 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01932(java.lang.String XCG01932) {
		_vrTechnicalSpec_XCGPart5.setXCG01932(XCG01932);
	}

	/**
	* Sets the xcg01933 of this vr technical spec_xcg part5.
	*
	* @param XCG01933 the xcg01933 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01933(java.lang.String XCG01933) {
		_vrTechnicalSpec_XCGPart5.setXCG01933(XCG01933);
	}

	/**
	* Sets the xcg01934 of this vr technical spec_xcg part5.
	*
	* @param XCG01934 the xcg01934 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01934(java.lang.String XCG01934) {
		_vrTechnicalSpec_XCGPart5.setXCG01934(XCG01934);
	}

	/**
	* Sets the xcg01935 of this vr technical spec_xcg part5.
	*
	* @param XCG01935 the xcg01935 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01935(java.lang.String XCG01935) {
		_vrTechnicalSpec_XCGPart5.setXCG01935(XCG01935);
	}

	/**
	* Sets the xcg01936 of this vr technical spec_xcg part5.
	*
	* @param XCG01936 the xcg01936 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01936(java.lang.String XCG01936) {
		_vrTechnicalSpec_XCGPart5.setXCG01936(XCG01936);
	}

	/**
	* Sets the xcg01937 of this vr technical spec_xcg part5.
	*
	* @param XCG01937 the xcg01937 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01937(java.lang.String XCG01937) {
		_vrTechnicalSpec_XCGPart5.setXCG01937(XCG01937);
	}

	/**
	* Sets the xcg01938 of this vr technical spec_xcg part5.
	*
	* @param XCG01938 the xcg01938 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01938(java.lang.String XCG01938) {
		_vrTechnicalSpec_XCGPart5.setXCG01938(XCG01938);
	}

	/**
	* Sets the xcg01939 of this vr technical spec_xcg part5.
	*
	* @param XCG01939 the xcg01939 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01939(java.lang.String XCG01939) {
		_vrTechnicalSpec_XCGPart5.setXCG01939(XCG01939);
	}

	/**
	* Sets the xcg01940 of this vr technical spec_xcg part5.
	*
	* @param XCG01940 the xcg01940 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01940(java.lang.String XCG01940) {
		_vrTechnicalSpec_XCGPart5.setXCG01940(XCG01940);
	}

	/**
	* Sets the xcg01941 of this vr technical spec_xcg part5.
	*
	* @param XCG01941 the xcg01941 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01941(java.lang.String XCG01941) {
		_vrTechnicalSpec_XCGPart5.setXCG01941(XCG01941);
	}

	/**
	* Sets the xcg01942 of this vr technical spec_xcg part5.
	*
	* @param XCG01942 the xcg01942 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01942(java.lang.String XCG01942) {
		_vrTechnicalSpec_XCGPart5.setXCG01942(XCG01942);
	}

	/**
	* Sets the xcg01943 of this vr technical spec_xcg part5.
	*
	* @param XCG01943 the xcg01943 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01943(java.lang.String XCG01943) {
		_vrTechnicalSpec_XCGPart5.setXCG01943(XCG01943);
	}

	/**
	* Sets the xcg01944 of this vr technical spec_xcg part5.
	*
	* @param XCG01944 the xcg01944 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01944(java.lang.String XCG01944) {
		_vrTechnicalSpec_XCGPart5.setXCG01944(XCG01944);
	}

	/**
	* Sets the xcg01945 of this vr technical spec_xcg part5.
	*
	* @param XCG01945 the xcg01945 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01945(java.lang.String XCG01945) {
		_vrTechnicalSpec_XCGPart5.setXCG01945(XCG01945);
	}

	/**
	* Sets the xcg01946 of this vr technical spec_xcg part5.
	*
	* @param XCG01946 the xcg01946 of this vr technical spec_xcg part5
	*/
	@Override
	public void setXCG01946(java.lang.String XCG01946) {
		_vrTechnicalSpec_XCGPart5.setXCG01946(XCG01946);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGPart5Wrapper)) {
			return false;
		}

		VRTechnicalSpec_XCGPart5Wrapper vrTechnicalSpec_XCGPart5Wrapper = (VRTechnicalSpec_XCGPart5Wrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XCGPart5,
					vrTechnicalSpec_XCGPart5Wrapper._vrTechnicalSpec_XCGPart5)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XCGPart5 getWrappedModel() {
		return _vrTechnicalSpec_XCGPart5;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XCGPart5.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XCGPart5.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XCGPart5.resetOriginalValues();
	}

	private final VRTechnicalSpec_XCGPart5 _vrTechnicalSpec_XCGPart5;
}