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
 * This class is a wrapper for {@link VRTechnicalSpec_LKXMYPart2}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_LKXMYPart2
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_LKXMYPart2Wrapper
	implements VRTechnicalSpec_LKXMYPart2,
		ModelWrapper<VRTechnicalSpec_LKXMYPart2> {
	public VRTechnicalSpec_LKXMYPart2Wrapper(
		VRTechnicalSpec_LKXMYPart2 vrTechnicalSpec_LKXMYPart2) {
		_vrTechnicalSpec_LKXMYPart2 = vrTechnicalSpec_LKXMYPart2;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_LKXMYPart2.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_LKXMYPart2.class.getName();
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
		attributes.put("LKXMY0507", getLKXMY0507());
		attributes.put("LKXMY0508", getLKXMY0508());
		attributes.put("LKXMY0509", getLKXMY0509());
		attributes.put("LKXMY0510", getLKXMY0510());
		attributes.put("LKXMY0511", getLKXMY0511());
		attributes.put("LKXMY0512", getLKXMY0512());
		attributes.put("LKXMY0513", getLKXMY0513());
		attributes.put("LKXMY0514", getLKXMY0514());
		attributes.put("LKXMY0515", getLKXMY0515());
		attributes.put("LKXMY0301", getLKXMY0301());
		attributes.put("LKXMY0302", getLKXMY0302());
		attributes.put("LKXMY0303", getLKXMY0303());
		attributes.put("LKXMY0304", getLKXMY0304());
		attributes.put("LKXMY0305", getLKXMY0305());
		attributes.put("LKXMY0306", getLKXMY0306());
		attributes.put("LKXMY0307", getLKXMY0307());
		attributes.put("LKXMY0308", getLKXMY0308());
		attributes.put("LKXMY0309", getLKXMY0309());
		attributes.put("LKXMY0310", getLKXMY0310());
		attributes.put("LKXMY0311", getLKXMY0311());
		attributes.put("LKXMY0312", getLKXMY0312());
		attributes.put("LKXMY0313", getLKXMY0313());
		attributes.put("LKXMY0314", getLKXMY0314());
		attributes.put("LKXMY0607", getLKXMY0607());
		attributes.put("LKXMY0608", getLKXMY0608());
		attributes.put("LKXMY0609", getLKXMY0609());
		attributes.put("LKXMY0610", getLKXMY0610());
		attributes.put("LKXMY0611", getLKXMY0611());
		attributes.put("LKXMY0612", getLKXMY0612());
		attributes.put("LKXMY0613", getLKXMY0613());
		attributes.put("LKXMY0614", getLKXMY0614());
		attributes.put("LKXMY0615", getLKXMY0615());
		attributes.put("LKXMY0616", getLKXMY0616());
		attributes.put("LKXMY0617", getLKXMY0617());
		attributes.put("LKXMY0618", getLKXMY0618());
		attributes.put("LKXMY0619", getLKXMY0619());
		attributes.put("LKXMY0906", getLKXMY0906());
		attributes.put("LKXMY0907", getLKXMY0907());
		attributes.put("LKXMY0908", getLKXMY0908());
		attributes.put("LKXMY0909", getLKXMY0909());
		attributes.put("LKXMY0910", getLKXMY0910());
		attributes.put("LKXMY0911", getLKXMY0911());
		attributes.put("LKXMY0912", getLKXMY0912());
		attributes.put("LKXMY0913", getLKXMY0913());
		attributes.put("LKXMY0914", getLKXMY0914());
		attributes.put("LKXMY0915", getLKXMY0915());
		attributes.put("LKXMY0916", getLKXMY0916());
		attributes.put("LKXMY0917", getLKXMY0917());
		attributes.put("LKXMY0918", getLKXMY0918());
		attributes.put("LKXMY1007", getLKXMY1007());
		attributes.put("LKXMY1008", getLKXMY1008());
		attributes.put("LKXMY1009", getLKXMY1009());
		attributes.put("LKXMY1010", getLKXMY1010());
		attributes.put("LKXMY1011", getLKXMY1011());
		attributes.put("LKXMY1012", getLKXMY1012());
		attributes.put("LKXMY1013", getLKXMY1013());
		attributes.put("LKXMY1014", getLKXMY1014());
		attributes.put("LKXMY1015", getLKXMY1015());
		attributes.put("LKXMY0807", getLKXMY0807());
		attributes.put("LKXMY0808", getLKXMY0808());
		attributes.put("LKXMY0809", getLKXMY0809());
		attributes.put("LKXMY0810", getLKXMY0810());
		attributes.put("LKXMY0811", getLKXMY0811());
		attributes.put("LKXMY0812", getLKXMY0812());
		attributes.put("LKXMY0813", getLKXMY0813());
		attributes.put("LKXMY0801", getLKXMY0801());
		attributes.put("LKXMY0802", getLKXMY0802());
		attributes.put("LKXMY0803", getLKXMY0803());
		attributes.put("LKXMY0804", getLKXMY0804());
		attributes.put("LKXMY0805", getLKXMY0805());
		attributes.put("BBLKXMY001", getBBLKXMY001());
		attributes.put("BBLKXMY002", getBBLKXMY002());
		attributes.put("BBLKXMY003", getBBLKXMY003());
		attributes.put("BBLKXMY004", getBBLKXMY004());
		attributes.put("BBLKXMY005", getBBLKXMY005());
		attributes.put("BBLKXMY006", getBBLKXMY006());
		attributes.put("BBLKXMY007", getBBLKXMY007());
		attributes.put("BBLKXMY008", getBBLKXMY008());
		attributes.put("BBLKXMY009", getBBLKXMY009());
		attributes.put("BBLKXMY010", getBBLKXMY010());
		attributes.put("BBLKXMY011", getBBLKXMY011());
		attributes.put("BBLKXMY012", getBBLKXMY012());
		attributes.put("BBLKXMY013", getBBLKXMY013());
		attributes.put("BBLKXMY014", getBBLKXMY014());
		attributes.put("BBLKXMY015", getBBLKXMY015());
		attributes.put("BBLKXMY016", getBBLKXMY016());
		attributes.put("BBLKXMY017", getBBLKXMY017());
		attributes.put("BBLKXMY018", getBBLKXMY018());
		attributes.put("BBLKXMY019", getBBLKXMY019());
		attributes.put("BBLKXMY020", getBBLKXMY020());
		attributes.put("BBLKXMY021", getBBLKXMY021());
		attributes.put("BBLKXMY022", getBBLKXMY022());
		attributes.put("BBLKXMY023", getBBLKXMY023());
		attributes.put("BBLKXMY024", getBBLKXMY024());
		attributes.put("BBLKXMY025", getBBLKXMY025());
		attributes.put("BBLKXMY026", getBBLKXMY026());
		attributes.put("BBLKXMY027", getBBLKXMY027());
		attributes.put("BBLKXMY028", getBBLKXMY028());
		attributes.put("BBLKXMY029", getBBLKXMY029());
		attributes.put("BBLKXMY030", getBBLKXMY030());
		attributes.put("BBLKXMY031", getBBLKXMY031());
		attributes.put("BBLKXMY032", getBBLKXMY032());
		attributes.put("BBLKXMY033", getBBLKXMY033());
		attributes.put("BBLKXMY034", getBBLKXMY034());
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

		String LKXMY0507 = (String)attributes.get("LKXMY0507");

		if (LKXMY0507 != null) {
			setLKXMY0507(LKXMY0507);
		}

		String LKXMY0508 = (String)attributes.get("LKXMY0508");

		if (LKXMY0508 != null) {
			setLKXMY0508(LKXMY0508);
		}

		String LKXMY0509 = (String)attributes.get("LKXMY0509");

		if (LKXMY0509 != null) {
			setLKXMY0509(LKXMY0509);
		}

		String LKXMY0510 = (String)attributes.get("LKXMY0510");

		if (LKXMY0510 != null) {
			setLKXMY0510(LKXMY0510);
		}

		String LKXMY0511 = (String)attributes.get("LKXMY0511");

		if (LKXMY0511 != null) {
			setLKXMY0511(LKXMY0511);
		}

		String LKXMY0512 = (String)attributes.get("LKXMY0512");

		if (LKXMY0512 != null) {
			setLKXMY0512(LKXMY0512);
		}

		String LKXMY0513 = (String)attributes.get("LKXMY0513");

		if (LKXMY0513 != null) {
			setLKXMY0513(LKXMY0513);
		}

		String LKXMY0514 = (String)attributes.get("LKXMY0514");

		if (LKXMY0514 != null) {
			setLKXMY0514(LKXMY0514);
		}

		String LKXMY0515 = (String)attributes.get("LKXMY0515");

		if (LKXMY0515 != null) {
			setLKXMY0515(LKXMY0515);
		}

		String LKXMY0301 = (String)attributes.get("LKXMY0301");

		if (LKXMY0301 != null) {
			setLKXMY0301(LKXMY0301);
		}

		String LKXMY0302 = (String)attributes.get("LKXMY0302");

		if (LKXMY0302 != null) {
			setLKXMY0302(LKXMY0302);
		}

		String LKXMY0303 = (String)attributes.get("LKXMY0303");

		if (LKXMY0303 != null) {
			setLKXMY0303(LKXMY0303);
		}

		String LKXMY0304 = (String)attributes.get("LKXMY0304");

		if (LKXMY0304 != null) {
			setLKXMY0304(LKXMY0304);
		}

		String LKXMY0305 = (String)attributes.get("LKXMY0305");

		if (LKXMY0305 != null) {
			setLKXMY0305(LKXMY0305);
		}

		String LKXMY0306 = (String)attributes.get("LKXMY0306");

		if (LKXMY0306 != null) {
			setLKXMY0306(LKXMY0306);
		}

		String LKXMY0307 = (String)attributes.get("LKXMY0307");

		if (LKXMY0307 != null) {
			setLKXMY0307(LKXMY0307);
		}

		String LKXMY0308 = (String)attributes.get("LKXMY0308");

		if (LKXMY0308 != null) {
			setLKXMY0308(LKXMY0308);
		}

		String LKXMY0309 = (String)attributes.get("LKXMY0309");

		if (LKXMY0309 != null) {
			setLKXMY0309(LKXMY0309);
		}

		String LKXMY0310 = (String)attributes.get("LKXMY0310");

		if (LKXMY0310 != null) {
			setLKXMY0310(LKXMY0310);
		}

		String LKXMY0311 = (String)attributes.get("LKXMY0311");

		if (LKXMY0311 != null) {
			setLKXMY0311(LKXMY0311);
		}

		String LKXMY0312 = (String)attributes.get("LKXMY0312");

		if (LKXMY0312 != null) {
			setLKXMY0312(LKXMY0312);
		}

		String LKXMY0313 = (String)attributes.get("LKXMY0313");

		if (LKXMY0313 != null) {
			setLKXMY0313(LKXMY0313);
		}

		String LKXMY0314 = (String)attributes.get("LKXMY0314");

		if (LKXMY0314 != null) {
			setLKXMY0314(LKXMY0314);
		}

		String LKXMY0607 = (String)attributes.get("LKXMY0607");

		if (LKXMY0607 != null) {
			setLKXMY0607(LKXMY0607);
		}

		String LKXMY0608 = (String)attributes.get("LKXMY0608");

		if (LKXMY0608 != null) {
			setLKXMY0608(LKXMY0608);
		}

		String LKXMY0609 = (String)attributes.get("LKXMY0609");

		if (LKXMY0609 != null) {
			setLKXMY0609(LKXMY0609);
		}

		String LKXMY0610 = (String)attributes.get("LKXMY0610");

		if (LKXMY0610 != null) {
			setLKXMY0610(LKXMY0610);
		}

		String LKXMY0611 = (String)attributes.get("LKXMY0611");

		if (LKXMY0611 != null) {
			setLKXMY0611(LKXMY0611);
		}

		String LKXMY0612 = (String)attributes.get("LKXMY0612");

		if (LKXMY0612 != null) {
			setLKXMY0612(LKXMY0612);
		}

		String LKXMY0613 = (String)attributes.get("LKXMY0613");

		if (LKXMY0613 != null) {
			setLKXMY0613(LKXMY0613);
		}

		String LKXMY0614 = (String)attributes.get("LKXMY0614");

		if (LKXMY0614 != null) {
			setLKXMY0614(LKXMY0614);
		}

		String LKXMY0615 = (String)attributes.get("LKXMY0615");

		if (LKXMY0615 != null) {
			setLKXMY0615(LKXMY0615);
		}

		String LKXMY0616 = (String)attributes.get("LKXMY0616");

		if (LKXMY0616 != null) {
			setLKXMY0616(LKXMY0616);
		}

		String LKXMY0617 = (String)attributes.get("LKXMY0617");

		if (LKXMY0617 != null) {
			setLKXMY0617(LKXMY0617);
		}

		String LKXMY0618 = (String)attributes.get("LKXMY0618");

		if (LKXMY0618 != null) {
			setLKXMY0618(LKXMY0618);
		}

		String LKXMY0619 = (String)attributes.get("LKXMY0619");

		if (LKXMY0619 != null) {
			setLKXMY0619(LKXMY0619);
		}

		String LKXMY0906 = (String)attributes.get("LKXMY0906");

		if (LKXMY0906 != null) {
			setLKXMY0906(LKXMY0906);
		}

		String LKXMY0907 = (String)attributes.get("LKXMY0907");

		if (LKXMY0907 != null) {
			setLKXMY0907(LKXMY0907);
		}

		String LKXMY0908 = (String)attributes.get("LKXMY0908");

		if (LKXMY0908 != null) {
			setLKXMY0908(LKXMY0908);
		}

		String LKXMY0909 = (String)attributes.get("LKXMY0909");

		if (LKXMY0909 != null) {
			setLKXMY0909(LKXMY0909);
		}

		String LKXMY0910 = (String)attributes.get("LKXMY0910");

		if (LKXMY0910 != null) {
			setLKXMY0910(LKXMY0910);
		}

		String LKXMY0911 = (String)attributes.get("LKXMY0911");

		if (LKXMY0911 != null) {
			setLKXMY0911(LKXMY0911);
		}

		String LKXMY0912 = (String)attributes.get("LKXMY0912");

		if (LKXMY0912 != null) {
			setLKXMY0912(LKXMY0912);
		}

		String LKXMY0913 = (String)attributes.get("LKXMY0913");

		if (LKXMY0913 != null) {
			setLKXMY0913(LKXMY0913);
		}

		String LKXMY0914 = (String)attributes.get("LKXMY0914");

		if (LKXMY0914 != null) {
			setLKXMY0914(LKXMY0914);
		}

		String LKXMY0915 = (String)attributes.get("LKXMY0915");

		if (LKXMY0915 != null) {
			setLKXMY0915(LKXMY0915);
		}

		String LKXMY0916 = (String)attributes.get("LKXMY0916");

		if (LKXMY0916 != null) {
			setLKXMY0916(LKXMY0916);
		}

		String LKXMY0917 = (String)attributes.get("LKXMY0917");

		if (LKXMY0917 != null) {
			setLKXMY0917(LKXMY0917);
		}

		String LKXMY0918 = (String)attributes.get("LKXMY0918");

		if (LKXMY0918 != null) {
			setLKXMY0918(LKXMY0918);
		}

		String LKXMY1007 = (String)attributes.get("LKXMY1007");

		if (LKXMY1007 != null) {
			setLKXMY1007(LKXMY1007);
		}

		String LKXMY1008 = (String)attributes.get("LKXMY1008");

		if (LKXMY1008 != null) {
			setLKXMY1008(LKXMY1008);
		}

		String LKXMY1009 = (String)attributes.get("LKXMY1009");

		if (LKXMY1009 != null) {
			setLKXMY1009(LKXMY1009);
		}

		String LKXMY1010 = (String)attributes.get("LKXMY1010");

		if (LKXMY1010 != null) {
			setLKXMY1010(LKXMY1010);
		}

		String LKXMY1011 = (String)attributes.get("LKXMY1011");

		if (LKXMY1011 != null) {
			setLKXMY1011(LKXMY1011);
		}

		String LKXMY1012 = (String)attributes.get("LKXMY1012");

		if (LKXMY1012 != null) {
			setLKXMY1012(LKXMY1012);
		}

		String LKXMY1013 = (String)attributes.get("LKXMY1013");

		if (LKXMY1013 != null) {
			setLKXMY1013(LKXMY1013);
		}

		String LKXMY1014 = (String)attributes.get("LKXMY1014");

		if (LKXMY1014 != null) {
			setLKXMY1014(LKXMY1014);
		}

		String LKXMY1015 = (String)attributes.get("LKXMY1015");

		if (LKXMY1015 != null) {
			setLKXMY1015(LKXMY1015);
		}

		String LKXMY0807 = (String)attributes.get("LKXMY0807");

		if (LKXMY0807 != null) {
			setLKXMY0807(LKXMY0807);
		}

		String LKXMY0808 = (String)attributes.get("LKXMY0808");

		if (LKXMY0808 != null) {
			setLKXMY0808(LKXMY0808);
		}

		String LKXMY0809 = (String)attributes.get("LKXMY0809");

		if (LKXMY0809 != null) {
			setLKXMY0809(LKXMY0809);
		}

		String LKXMY0810 = (String)attributes.get("LKXMY0810");

		if (LKXMY0810 != null) {
			setLKXMY0810(LKXMY0810);
		}

		String LKXMY0811 = (String)attributes.get("LKXMY0811");

		if (LKXMY0811 != null) {
			setLKXMY0811(LKXMY0811);
		}

		String LKXMY0812 = (String)attributes.get("LKXMY0812");

		if (LKXMY0812 != null) {
			setLKXMY0812(LKXMY0812);
		}

		String LKXMY0813 = (String)attributes.get("LKXMY0813");

		if (LKXMY0813 != null) {
			setLKXMY0813(LKXMY0813);
		}

		String LKXMY0801 = (String)attributes.get("LKXMY0801");

		if (LKXMY0801 != null) {
			setLKXMY0801(LKXMY0801);
		}

		String LKXMY0802 = (String)attributes.get("LKXMY0802");

		if (LKXMY0802 != null) {
			setLKXMY0802(LKXMY0802);
		}

		String LKXMY0803 = (String)attributes.get("LKXMY0803");

		if (LKXMY0803 != null) {
			setLKXMY0803(LKXMY0803);
		}

		String LKXMY0804 = (String)attributes.get("LKXMY0804");

		if (LKXMY0804 != null) {
			setLKXMY0804(LKXMY0804);
		}

		String LKXMY0805 = (String)attributes.get("LKXMY0805");

		if (LKXMY0805 != null) {
			setLKXMY0805(LKXMY0805);
		}

		String BBLKXMY001 = (String)attributes.get("BBLKXMY001");

		if (BBLKXMY001 != null) {
			setBBLKXMY001(BBLKXMY001);
		}

		String BBLKXMY002 = (String)attributes.get("BBLKXMY002");

		if (BBLKXMY002 != null) {
			setBBLKXMY002(BBLKXMY002);
		}

		String BBLKXMY003 = (String)attributes.get("BBLKXMY003");

		if (BBLKXMY003 != null) {
			setBBLKXMY003(BBLKXMY003);
		}

		String BBLKXMY004 = (String)attributes.get("BBLKXMY004");

		if (BBLKXMY004 != null) {
			setBBLKXMY004(BBLKXMY004);
		}

		String BBLKXMY005 = (String)attributes.get("BBLKXMY005");

		if (BBLKXMY005 != null) {
			setBBLKXMY005(BBLKXMY005);
		}

		String BBLKXMY006 = (String)attributes.get("BBLKXMY006");

		if (BBLKXMY006 != null) {
			setBBLKXMY006(BBLKXMY006);
		}

		String BBLKXMY007 = (String)attributes.get("BBLKXMY007");

		if (BBLKXMY007 != null) {
			setBBLKXMY007(BBLKXMY007);
		}

		String BBLKXMY008 = (String)attributes.get("BBLKXMY008");

		if (BBLKXMY008 != null) {
			setBBLKXMY008(BBLKXMY008);
		}

		String BBLKXMY009 = (String)attributes.get("BBLKXMY009");

		if (BBLKXMY009 != null) {
			setBBLKXMY009(BBLKXMY009);
		}

		String BBLKXMY010 = (String)attributes.get("BBLKXMY010");

		if (BBLKXMY010 != null) {
			setBBLKXMY010(BBLKXMY010);
		}

		String BBLKXMY011 = (String)attributes.get("BBLKXMY011");

		if (BBLKXMY011 != null) {
			setBBLKXMY011(BBLKXMY011);
		}

		String BBLKXMY012 = (String)attributes.get("BBLKXMY012");

		if (BBLKXMY012 != null) {
			setBBLKXMY012(BBLKXMY012);
		}

		String BBLKXMY013 = (String)attributes.get("BBLKXMY013");

		if (BBLKXMY013 != null) {
			setBBLKXMY013(BBLKXMY013);
		}

		String BBLKXMY014 = (String)attributes.get("BBLKXMY014");

		if (BBLKXMY014 != null) {
			setBBLKXMY014(BBLKXMY014);
		}

		String BBLKXMY015 = (String)attributes.get("BBLKXMY015");

		if (BBLKXMY015 != null) {
			setBBLKXMY015(BBLKXMY015);
		}

		String BBLKXMY016 = (String)attributes.get("BBLKXMY016");

		if (BBLKXMY016 != null) {
			setBBLKXMY016(BBLKXMY016);
		}

		String BBLKXMY017 = (String)attributes.get("BBLKXMY017");

		if (BBLKXMY017 != null) {
			setBBLKXMY017(BBLKXMY017);
		}

		String BBLKXMY018 = (String)attributes.get("BBLKXMY018");

		if (BBLKXMY018 != null) {
			setBBLKXMY018(BBLKXMY018);
		}

		String BBLKXMY019 = (String)attributes.get("BBLKXMY019");

		if (BBLKXMY019 != null) {
			setBBLKXMY019(BBLKXMY019);
		}

		String BBLKXMY020 = (String)attributes.get("BBLKXMY020");

		if (BBLKXMY020 != null) {
			setBBLKXMY020(BBLKXMY020);
		}

		String BBLKXMY021 = (String)attributes.get("BBLKXMY021");

		if (BBLKXMY021 != null) {
			setBBLKXMY021(BBLKXMY021);
		}

		String BBLKXMY022 = (String)attributes.get("BBLKXMY022");

		if (BBLKXMY022 != null) {
			setBBLKXMY022(BBLKXMY022);
		}

		String BBLKXMY023 = (String)attributes.get("BBLKXMY023");

		if (BBLKXMY023 != null) {
			setBBLKXMY023(BBLKXMY023);
		}

		String BBLKXMY024 = (String)attributes.get("BBLKXMY024");

		if (BBLKXMY024 != null) {
			setBBLKXMY024(BBLKXMY024);
		}

		String BBLKXMY025 = (String)attributes.get("BBLKXMY025");

		if (BBLKXMY025 != null) {
			setBBLKXMY025(BBLKXMY025);
		}

		String BBLKXMY026 = (String)attributes.get("BBLKXMY026");

		if (BBLKXMY026 != null) {
			setBBLKXMY026(BBLKXMY026);
		}

		String BBLKXMY027 = (String)attributes.get("BBLKXMY027");

		if (BBLKXMY027 != null) {
			setBBLKXMY027(BBLKXMY027);
		}

		String BBLKXMY028 = (String)attributes.get("BBLKXMY028");

		if (BBLKXMY028 != null) {
			setBBLKXMY028(BBLKXMY028);
		}

		String BBLKXMY029 = (String)attributes.get("BBLKXMY029");

		if (BBLKXMY029 != null) {
			setBBLKXMY029(BBLKXMY029);
		}

		String BBLKXMY030 = (String)attributes.get("BBLKXMY030");

		if (BBLKXMY030 != null) {
			setBBLKXMY030(BBLKXMY030);
		}

		String BBLKXMY031 = (String)attributes.get("BBLKXMY031");

		if (BBLKXMY031 != null) {
			setBBLKXMY031(BBLKXMY031);
		}

		String BBLKXMY032 = (String)attributes.get("BBLKXMY032");

		if (BBLKXMY032 != null) {
			setBBLKXMY032(BBLKXMY032);
		}

		String BBLKXMY033 = (String)attributes.get("BBLKXMY033");

		if (BBLKXMY033 != null) {
			setBBLKXMY033(BBLKXMY033);
		}

		String BBLKXMY034 = (String)attributes.get("BBLKXMY034");

		if (BBLKXMY034 != null) {
			setBBLKXMY034(BBLKXMY034);
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
	public VRTechnicalSpec_LKXMYPart2 toEscapedModel() {
		return new VRTechnicalSpec_LKXMYPart2Wrapper(_vrTechnicalSpec_LKXMYPart2.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_LKXMYPart2 toUnescapedModel() {
		return new VRTechnicalSpec_LKXMYPart2Wrapper(_vrTechnicalSpec_LKXMYPart2.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_LKXMYPart2.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_LKXMYPart2.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_LKXMYPart2.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_LKXMYPart2.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_LKXMYPart2> toCacheModel() {
		return _vrTechnicalSpec_LKXMYPart2.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_LKXMYPart2 vrTechnicalSpec_LKXMYPart2) {
		return _vrTechnicalSpec_LKXMYPart2.compareTo(vrTechnicalSpec_LKXMYPart2);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_LKXMYPart2.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_LKXMYPart2.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_LKXMYPart2Wrapper((VRTechnicalSpec_LKXMYPart2)_vrTechnicalSpec_LKXMYPart2.clone());
	}

	/**
	* Returns the bblkxmy001 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy001 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY001() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY001();
	}

	/**
	* Returns the bblkxmy002 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy002 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY002() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY002();
	}

	/**
	* Returns the bblkxmy003 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy003 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY003() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY003();
	}

	/**
	* Returns the bblkxmy004 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy004 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY004() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY004();
	}

	/**
	* Returns the bblkxmy005 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy005 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY005() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY005();
	}

	/**
	* Returns the bblkxmy006 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy006 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY006() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY006();
	}

	/**
	* Returns the bblkxmy007 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy007 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY007() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY007();
	}

	/**
	* Returns the bblkxmy008 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy008 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY008() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY008();
	}

	/**
	* Returns the bblkxmy009 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy009 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY009() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY009();
	}

	/**
	* Returns the bblkxmy010 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy010 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY010() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY010();
	}

	/**
	* Returns the bblkxmy011 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy011 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY011() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY011();
	}

	/**
	* Returns the bblkxmy012 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy012 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY012() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY012();
	}

	/**
	* Returns the bblkxmy013 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy013 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY013() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY013();
	}

	/**
	* Returns the bblkxmy014 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy014 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY014() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY014();
	}

	/**
	* Returns the bblkxmy015 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy015 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY015() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY015();
	}

	/**
	* Returns the bblkxmy016 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy016 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY016() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY016();
	}

	/**
	* Returns the bblkxmy017 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy017 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY017() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY017();
	}

	/**
	* Returns the bblkxmy018 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy018 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY018() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY018();
	}

	/**
	* Returns the bblkxmy019 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy019 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY019() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY019();
	}

	/**
	* Returns the bblkxmy020 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy020 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY020() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY020();
	}

	/**
	* Returns the bblkxmy021 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy021 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY021() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY021();
	}

	/**
	* Returns the bblkxmy022 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy022 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY022() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY022();
	}

	/**
	* Returns the bblkxmy023 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy023 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY023() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY023();
	}

	/**
	* Returns the bblkxmy024 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy024 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY024() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY024();
	}

	/**
	* Returns the bblkxmy025 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy025 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY025() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY025();
	}

	/**
	* Returns the bblkxmy026 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy026 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY026() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY026();
	}

	/**
	* Returns the bblkxmy027 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy027 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY027() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY027();
	}

	/**
	* Returns the bblkxmy028 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy028 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY028() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY028();
	}

	/**
	* Returns the bblkxmy029 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy029 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY029() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY029();
	}

	/**
	* Returns the bblkxmy030 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy030 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY030() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY030();
	}

	/**
	* Returns the bblkxmy031 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy031 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY031() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY031();
	}

	/**
	* Returns the bblkxmy032 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy032 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY032() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY032();
	}

	/**
	* Returns the bblkxmy033 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy033 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY033() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY033();
	}

	/**
	* Returns the bblkxmy034 of this vr technical spec_lkxmy part2.
	*
	* @return the bblkxmy034 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getBBLKXMY034() {
		return _vrTechnicalSpec_LKXMYPart2.getBBLKXMY034();
	}

	/**
	* Returns the deliverable code of this vr technical spec_lkxmy part2.
	*
	* @return the deliverable code of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_LKXMYPart2.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_lkxmy part2.
	*
	* @return the dossier ID ctn of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_LKXMYPart2.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_lkxmy part2.
	*
	* @return the dossier no of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_LKXMYPart2.getDossierNo();
	}

	/**
	* Returns the lkxmy0301 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0301 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0301() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0301();
	}

	/**
	* Returns the lkxmy0302 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0302 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0302() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0302();
	}

	/**
	* Returns the lkxmy0303 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0303 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0303() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0303();
	}

	/**
	* Returns the lkxmy0304 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0304 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0304() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0304();
	}

	/**
	* Returns the lkxmy0305 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0305 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0305() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0305();
	}

	/**
	* Returns the lkxmy0306 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0306 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0306() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0306();
	}

	/**
	* Returns the lkxmy0307 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0307 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0307() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0307();
	}

	/**
	* Returns the lkxmy0308 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0308 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0308() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0308();
	}

	/**
	* Returns the lkxmy0309 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0309 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0309() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0309();
	}

	/**
	* Returns the lkxmy0310 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0310 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0310() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0310();
	}

	/**
	* Returns the lkxmy0311 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0311 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0311() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0311();
	}

	/**
	* Returns the lkxmy0312 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0312 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0312() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0312();
	}

	/**
	* Returns the lkxmy0313 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0313 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0313() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0313();
	}

	/**
	* Returns the lkxmy0314 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0314 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0314() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0314();
	}

	/**
	* Returns the lkxmy0507 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0507 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0507() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0507();
	}

	/**
	* Returns the lkxmy0508 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0508 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0508() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0508();
	}

	/**
	* Returns the lkxmy0509 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0509 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0509() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0509();
	}

	/**
	* Returns the lkxmy0510 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0510 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0510() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0510();
	}

	/**
	* Returns the lkxmy0511 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0511 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0511() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0511();
	}

	/**
	* Returns the lkxmy0512 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0512 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0512() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0512();
	}

	/**
	* Returns the lkxmy0513 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0513 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0513() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0513();
	}

	/**
	* Returns the lkxmy0514 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0514 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0514() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0514();
	}

	/**
	* Returns the lkxmy0515 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0515 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0515() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0515();
	}

	/**
	* Returns the lkxmy0607 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0607 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0607() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0607();
	}

	/**
	* Returns the lkxmy0608 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0608 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0608() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0608();
	}

	/**
	* Returns the lkxmy0609 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0609 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0609() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0609();
	}

	/**
	* Returns the lkxmy0610 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0610 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0610() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0610();
	}

	/**
	* Returns the lkxmy0611 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0611 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0611() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0611();
	}

	/**
	* Returns the lkxmy0612 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0612 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0612() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0612();
	}

	/**
	* Returns the lkxmy0613 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0613 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0613() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0613();
	}

	/**
	* Returns the lkxmy0614 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0614 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0614() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0614();
	}

	/**
	* Returns the lkxmy0615 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0615 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0615() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0615();
	}

	/**
	* Returns the lkxmy0616 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0616 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0616() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0616();
	}

	/**
	* Returns the lkxmy0617 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0617 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0617() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0617();
	}

	/**
	* Returns the lkxmy0618 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0618 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0618() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0618();
	}

	/**
	* Returns the lkxmy0619 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0619 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0619() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0619();
	}

	/**
	* Returns the lkxmy0801 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0801 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0801() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0801();
	}

	/**
	* Returns the lkxmy0802 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0802 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0802() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0802();
	}

	/**
	* Returns the lkxmy0803 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0803 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0803() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0803();
	}

	/**
	* Returns the lkxmy0804 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0804 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0804() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0804();
	}

	/**
	* Returns the lkxmy0805 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0805 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0805() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0805();
	}

	/**
	* Returns the lkxmy0807 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0807 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0807() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0807();
	}

	/**
	* Returns the lkxmy0808 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0808 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0808() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0808();
	}

	/**
	* Returns the lkxmy0809 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0809 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0809() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0809();
	}

	/**
	* Returns the lkxmy0810 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0810 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0810() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0810();
	}

	/**
	* Returns the lkxmy0811 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0811 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0811() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0811();
	}

	/**
	* Returns the lkxmy0812 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0812 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0812() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0812();
	}

	/**
	* Returns the lkxmy0813 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0813 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0813() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0813();
	}

	/**
	* Returns the lkxmy0906 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0906 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0906() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0906();
	}

	/**
	* Returns the lkxmy0907 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0907 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0907() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0907();
	}

	/**
	* Returns the lkxmy0908 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0908 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0908() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0908();
	}

	/**
	* Returns the lkxmy0909 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0909 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0909() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0909();
	}

	/**
	* Returns the lkxmy0910 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0910 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0910() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0910();
	}

	/**
	* Returns the lkxmy0911 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0911 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0911() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0911();
	}

	/**
	* Returns the lkxmy0912 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0912 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0912() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0912();
	}

	/**
	* Returns the lkxmy0913 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0913 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0913() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0913();
	}

	/**
	* Returns the lkxmy0914 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0914 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0914() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0914();
	}

	/**
	* Returns the lkxmy0915 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0915 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0915() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0915();
	}

	/**
	* Returns the lkxmy0916 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0916 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0916() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0916();
	}

	/**
	* Returns the lkxmy0917 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0917 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0917() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0917();
	}

	/**
	* Returns the lkxmy0918 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy0918 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY0918() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY0918();
	}

	/**
	* Returns the lkxmy1007 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy1007 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY1007() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY1007();
	}

	/**
	* Returns the lkxmy1008 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy1008 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY1008() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY1008();
	}

	/**
	* Returns the lkxmy1009 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy1009 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY1009() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY1009();
	}

	/**
	* Returns the lkxmy1010 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy1010 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY1010() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY1010();
	}

	/**
	* Returns the lkxmy1011 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy1011 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY1011() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY1011();
	}

	/**
	* Returns the lkxmy1012 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy1012 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY1012() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY1012();
	}

	/**
	* Returns the lkxmy1013 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy1013 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY1013() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY1013();
	}

	/**
	* Returns the lkxmy1014 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy1014 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY1014() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY1014();
	}

	/**
	* Returns the lkxmy1015 of this vr technical spec_lkxmy part2.
	*
	* @return the lkxmy1015 of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getLKXMY1015() {
		return _vrTechnicalSpec_LKXMYPart2.getLKXMY1015();
	}

	/**
	* Returns the reference uid of this vr technical spec_lkxmy part2.
	*
	* @return the reference uid of this vr technical spec_lkxmy part2
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_LKXMYPart2.getReferenceUid();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_LKXMYPart2.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_LKXMYPart2.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_lkxmy part2.
	*
	* @return the modify date of this vr technical spec_lkxmy part2
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_LKXMYPart2.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_lkxmy part2.
	*
	* @return the sync date of this vr technical spec_lkxmy part2
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_LKXMYPart2.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_lkxmy part2.
	*
	* @return the convert assemble ID of this vr technical spec_lkxmy part2
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_LKXMYPart2.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_lkxmy part2.
	*
	* @return the dossier ID of this vr technical spec_lkxmy part2
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_LKXMYPart2.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_lkxmy part2.
	*
	* @return the ID of this vr technical spec_lkxmy part2
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_LKXMYPart2.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_lkxmy part2.
	*
	* @return the mt core of this vr technical spec_lkxmy part2
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_LKXMYPart2.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_lkxmy part2.
	*
	* @return the primary key of this vr technical spec_lkxmy part2
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_LKXMYPart2.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_lkxmy part2.
	*
	* @return the vehicle type certificate ID of this vr technical spec_lkxmy part2
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_LKXMYPart2.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_LKXMYPart2.persist();
	}

	/**
	* Sets the bblkxmy001 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY001 the bblkxmy001 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY001(java.lang.String BBLKXMY001) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY001(BBLKXMY001);
	}

	/**
	* Sets the bblkxmy002 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY002 the bblkxmy002 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY002(java.lang.String BBLKXMY002) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY002(BBLKXMY002);
	}

	/**
	* Sets the bblkxmy003 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY003 the bblkxmy003 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY003(java.lang.String BBLKXMY003) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY003(BBLKXMY003);
	}

	/**
	* Sets the bblkxmy004 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY004 the bblkxmy004 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY004(java.lang.String BBLKXMY004) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY004(BBLKXMY004);
	}

	/**
	* Sets the bblkxmy005 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY005 the bblkxmy005 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY005(java.lang.String BBLKXMY005) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY005(BBLKXMY005);
	}

	/**
	* Sets the bblkxmy006 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY006 the bblkxmy006 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY006(java.lang.String BBLKXMY006) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY006(BBLKXMY006);
	}

	/**
	* Sets the bblkxmy007 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY007 the bblkxmy007 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY007(java.lang.String BBLKXMY007) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY007(BBLKXMY007);
	}

	/**
	* Sets the bblkxmy008 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY008 the bblkxmy008 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY008(java.lang.String BBLKXMY008) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY008(BBLKXMY008);
	}

	/**
	* Sets the bblkxmy009 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY009 the bblkxmy009 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY009(java.lang.String BBLKXMY009) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY009(BBLKXMY009);
	}

	/**
	* Sets the bblkxmy010 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY010 the bblkxmy010 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY010(java.lang.String BBLKXMY010) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY010(BBLKXMY010);
	}

	/**
	* Sets the bblkxmy011 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY011 the bblkxmy011 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY011(java.lang.String BBLKXMY011) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY011(BBLKXMY011);
	}

	/**
	* Sets the bblkxmy012 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY012 the bblkxmy012 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY012(java.lang.String BBLKXMY012) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY012(BBLKXMY012);
	}

	/**
	* Sets the bblkxmy013 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY013 the bblkxmy013 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY013(java.lang.String BBLKXMY013) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY013(BBLKXMY013);
	}

	/**
	* Sets the bblkxmy014 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY014 the bblkxmy014 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY014(java.lang.String BBLKXMY014) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY014(BBLKXMY014);
	}

	/**
	* Sets the bblkxmy015 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY015 the bblkxmy015 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY015(java.lang.String BBLKXMY015) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY015(BBLKXMY015);
	}

	/**
	* Sets the bblkxmy016 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY016 the bblkxmy016 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY016(java.lang.String BBLKXMY016) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY016(BBLKXMY016);
	}

	/**
	* Sets the bblkxmy017 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY017 the bblkxmy017 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY017(java.lang.String BBLKXMY017) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY017(BBLKXMY017);
	}

	/**
	* Sets the bblkxmy018 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY018 the bblkxmy018 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY018(java.lang.String BBLKXMY018) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY018(BBLKXMY018);
	}

	/**
	* Sets the bblkxmy019 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY019 the bblkxmy019 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY019(java.lang.String BBLKXMY019) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY019(BBLKXMY019);
	}

	/**
	* Sets the bblkxmy020 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY020 the bblkxmy020 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY020(java.lang.String BBLKXMY020) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY020(BBLKXMY020);
	}

	/**
	* Sets the bblkxmy021 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY021 the bblkxmy021 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY021(java.lang.String BBLKXMY021) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY021(BBLKXMY021);
	}

	/**
	* Sets the bblkxmy022 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY022 the bblkxmy022 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY022(java.lang.String BBLKXMY022) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY022(BBLKXMY022);
	}

	/**
	* Sets the bblkxmy023 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY023 the bblkxmy023 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY023(java.lang.String BBLKXMY023) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY023(BBLKXMY023);
	}

	/**
	* Sets the bblkxmy024 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY024 the bblkxmy024 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY024(java.lang.String BBLKXMY024) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY024(BBLKXMY024);
	}

	/**
	* Sets the bblkxmy025 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY025 the bblkxmy025 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY025(java.lang.String BBLKXMY025) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY025(BBLKXMY025);
	}

	/**
	* Sets the bblkxmy026 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY026 the bblkxmy026 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY026(java.lang.String BBLKXMY026) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY026(BBLKXMY026);
	}

	/**
	* Sets the bblkxmy027 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY027 the bblkxmy027 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY027(java.lang.String BBLKXMY027) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY027(BBLKXMY027);
	}

	/**
	* Sets the bblkxmy028 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY028 the bblkxmy028 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY028(java.lang.String BBLKXMY028) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY028(BBLKXMY028);
	}

	/**
	* Sets the bblkxmy029 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY029 the bblkxmy029 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY029(java.lang.String BBLKXMY029) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY029(BBLKXMY029);
	}

	/**
	* Sets the bblkxmy030 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY030 the bblkxmy030 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY030(java.lang.String BBLKXMY030) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY030(BBLKXMY030);
	}

	/**
	* Sets the bblkxmy031 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY031 the bblkxmy031 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY031(java.lang.String BBLKXMY031) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY031(BBLKXMY031);
	}

	/**
	* Sets the bblkxmy032 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY032 the bblkxmy032 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY032(java.lang.String BBLKXMY032) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY032(BBLKXMY032);
	}

	/**
	* Sets the bblkxmy033 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY033 the bblkxmy033 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY033(java.lang.String BBLKXMY033) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY033(BBLKXMY033);
	}

	/**
	* Sets the bblkxmy034 of this vr technical spec_lkxmy part2.
	*
	* @param BBLKXMY034 the bblkxmy034 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setBBLKXMY034(java.lang.String BBLKXMY034) {
		_vrTechnicalSpec_LKXMYPart2.setBBLKXMY034(BBLKXMY034);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_LKXMYPart2.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_lkxmy part2.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_LKXMYPart2.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_lkxmy part2.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_LKXMYPart2.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_lkxmy part2.
	*
	* @param dossierId the dossier ID of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_LKXMYPart2.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_lkxmy part2.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_LKXMYPart2.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_lkxmy part2.
	*
	* @param dossierNo the dossier no of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_LKXMYPart2.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_LKXMYPart2.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_LKXMYPart2.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_LKXMYPart2.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_lkxmy part2.
	*
	* @param id the ID of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_LKXMYPart2.setId(id);
	}

	/**
	* Sets the lkxmy0301 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0301 the lkxmy0301 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0301(java.lang.String LKXMY0301) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0301(LKXMY0301);
	}

	/**
	* Sets the lkxmy0302 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0302 the lkxmy0302 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0302(java.lang.String LKXMY0302) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0302(LKXMY0302);
	}

	/**
	* Sets the lkxmy0303 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0303 the lkxmy0303 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0303(java.lang.String LKXMY0303) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0303(LKXMY0303);
	}

	/**
	* Sets the lkxmy0304 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0304 the lkxmy0304 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0304(java.lang.String LKXMY0304) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0304(LKXMY0304);
	}

	/**
	* Sets the lkxmy0305 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0305 the lkxmy0305 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0305(java.lang.String LKXMY0305) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0305(LKXMY0305);
	}

	/**
	* Sets the lkxmy0306 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0306 the lkxmy0306 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0306(java.lang.String LKXMY0306) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0306(LKXMY0306);
	}

	/**
	* Sets the lkxmy0307 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0307 the lkxmy0307 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0307(java.lang.String LKXMY0307) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0307(LKXMY0307);
	}

	/**
	* Sets the lkxmy0308 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0308 the lkxmy0308 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0308(java.lang.String LKXMY0308) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0308(LKXMY0308);
	}

	/**
	* Sets the lkxmy0309 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0309 the lkxmy0309 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0309(java.lang.String LKXMY0309) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0309(LKXMY0309);
	}

	/**
	* Sets the lkxmy0310 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0310 the lkxmy0310 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0310(java.lang.String LKXMY0310) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0310(LKXMY0310);
	}

	/**
	* Sets the lkxmy0311 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0311 the lkxmy0311 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0311(java.lang.String LKXMY0311) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0311(LKXMY0311);
	}

	/**
	* Sets the lkxmy0312 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0312 the lkxmy0312 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0312(java.lang.String LKXMY0312) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0312(LKXMY0312);
	}

	/**
	* Sets the lkxmy0313 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0313 the lkxmy0313 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0313(java.lang.String LKXMY0313) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0313(LKXMY0313);
	}

	/**
	* Sets the lkxmy0314 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0314 the lkxmy0314 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0314(java.lang.String LKXMY0314) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0314(LKXMY0314);
	}

	/**
	* Sets the lkxmy0507 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0507 the lkxmy0507 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0507(java.lang.String LKXMY0507) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0507(LKXMY0507);
	}

	/**
	* Sets the lkxmy0508 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0508 the lkxmy0508 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0508(java.lang.String LKXMY0508) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0508(LKXMY0508);
	}

	/**
	* Sets the lkxmy0509 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0509 the lkxmy0509 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0509(java.lang.String LKXMY0509) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0509(LKXMY0509);
	}

	/**
	* Sets the lkxmy0510 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0510 the lkxmy0510 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0510(java.lang.String LKXMY0510) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0510(LKXMY0510);
	}

	/**
	* Sets the lkxmy0511 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0511 the lkxmy0511 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0511(java.lang.String LKXMY0511) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0511(LKXMY0511);
	}

	/**
	* Sets the lkxmy0512 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0512 the lkxmy0512 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0512(java.lang.String LKXMY0512) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0512(LKXMY0512);
	}

	/**
	* Sets the lkxmy0513 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0513 the lkxmy0513 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0513(java.lang.String LKXMY0513) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0513(LKXMY0513);
	}

	/**
	* Sets the lkxmy0514 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0514 the lkxmy0514 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0514(java.lang.String LKXMY0514) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0514(LKXMY0514);
	}

	/**
	* Sets the lkxmy0515 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0515 the lkxmy0515 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0515(java.lang.String LKXMY0515) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0515(LKXMY0515);
	}

	/**
	* Sets the lkxmy0607 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0607 the lkxmy0607 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0607(java.lang.String LKXMY0607) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0607(LKXMY0607);
	}

	/**
	* Sets the lkxmy0608 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0608 the lkxmy0608 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0608(java.lang.String LKXMY0608) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0608(LKXMY0608);
	}

	/**
	* Sets the lkxmy0609 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0609 the lkxmy0609 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0609(java.lang.String LKXMY0609) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0609(LKXMY0609);
	}

	/**
	* Sets the lkxmy0610 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0610 the lkxmy0610 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0610(java.lang.String LKXMY0610) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0610(LKXMY0610);
	}

	/**
	* Sets the lkxmy0611 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0611 the lkxmy0611 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0611(java.lang.String LKXMY0611) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0611(LKXMY0611);
	}

	/**
	* Sets the lkxmy0612 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0612 the lkxmy0612 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0612(java.lang.String LKXMY0612) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0612(LKXMY0612);
	}

	/**
	* Sets the lkxmy0613 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0613 the lkxmy0613 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0613(java.lang.String LKXMY0613) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0613(LKXMY0613);
	}

	/**
	* Sets the lkxmy0614 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0614 the lkxmy0614 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0614(java.lang.String LKXMY0614) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0614(LKXMY0614);
	}

	/**
	* Sets the lkxmy0615 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0615 the lkxmy0615 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0615(java.lang.String LKXMY0615) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0615(LKXMY0615);
	}

	/**
	* Sets the lkxmy0616 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0616 the lkxmy0616 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0616(java.lang.String LKXMY0616) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0616(LKXMY0616);
	}

	/**
	* Sets the lkxmy0617 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0617 the lkxmy0617 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0617(java.lang.String LKXMY0617) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0617(LKXMY0617);
	}

	/**
	* Sets the lkxmy0618 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0618 the lkxmy0618 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0618(java.lang.String LKXMY0618) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0618(LKXMY0618);
	}

	/**
	* Sets the lkxmy0619 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0619 the lkxmy0619 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0619(java.lang.String LKXMY0619) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0619(LKXMY0619);
	}

	/**
	* Sets the lkxmy0801 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0801 the lkxmy0801 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0801(java.lang.String LKXMY0801) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0801(LKXMY0801);
	}

	/**
	* Sets the lkxmy0802 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0802 the lkxmy0802 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0802(java.lang.String LKXMY0802) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0802(LKXMY0802);
	}

	/**
	* Sets the lkxmy0803 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0803 the lkxmy0803 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0803(java.lang.String LKXMY0803) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0803(LKXMY0803);
	}

	/**
	* Sets the lkxmy0804 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0804 the lkxmy0804 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0804(java.lang.String LKXMY0804) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0804(LKXMY0804);
	}

	/**
	* Sets the lkxmy0805 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0805 the lkxmy0805 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0805(java.lang.String LKXMY0805) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0805(LKXMY0805);
	}

	/**
	* Sets the lkxmy0807 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0807 the lkxmy0807 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0807(java.lang.String LKXMY0807) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0807(LKXMY0807);
	}

	/**
	* Sets the lkxmy0808 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0808 the lkxmy0808 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0808(java.lang.String LKXMY0808) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0808(LKXMY0808);
	}

	/**
	* Sets the lkxmy0809 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0809 the lkxmy0809 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0809(java.lang.String LKXMY0809) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0809(LKXMY0809);
	}

	/**
	* Sets the lkxmy0810 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0810 the lkxmy0810 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0810(java.lang.String LKXMY0810) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0810(LKXMY0810);
	}

	/**
	* Sets the lkxmy0811 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0811 the lkxmy0811 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0811(java.lang.String LKXMY0811) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0811(LKXMY0811);
	}

	/**
	* Sets the lkxmy0812 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0812 the lkxmy0812 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0812(java.lang.String LKXMY0812) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0812(LKXMY0812);
	}

	/**
	* Sets the lkxmy0813 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0813 the lkxmy0813 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0813(java.lang.String LKXMY0813) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0813(LKXMY0813);
	}

	/**
	* Sets the lkxmy0906 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0906 the lkxmy0906 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0906(java.lang.String LKXMY0906) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0906(LKXMY0906);
	}

	/**
	* Sets the lkxmy0907 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0907 the lkxmy0907 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0907(java.lang.String LKXMY0907) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0907(LKXMY0907);
	}

	/**
	* Sets the lkxmy0908 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0908 the lkxmy0908 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0908(java.lang.String LKXMY0908) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0908(LKXMY0908);
	}

	/**
	* Sets the lkxmy0909 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0909 the lkxmy0909 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0909(java.lang.String LKXMY0909) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0909(LKXMY0909);
	}

	/**
	* Sets the lkxmy0910 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0910 the lkxmy0910 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0910(java.lang.String LKXMY0910) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0910(LKXMY0910);
	}

	/**
	* Sets the lkxmy0911 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0911 the lkxmy0911 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0911(java.lang.String LKXMY0911) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0911(LKXMY0911);
	}

	/**
	* Sets the lkxmy0912 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0912 the lkxmy0912 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0912(java.lang.String LKXMY0912) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0912(LKXMY0912);
	}

	/**
	* Sets the lkxmy0913 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0913 the lkxmy0913 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0913(java.lang.String LKXMY0913) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0913(LKXMY0913);
	}

	/**
	* Sets the lkxmy0914 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0914 the lkxmy0914 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0914(java.lang.String LKXMY0914) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0914(LKXMY0914);
	}

	/**
	* Sets the lkxmy0915 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0915 the lkxmy0915 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0915(java.lang.String LKXMY0915) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0915(LKXMY0915);
	}

	/**
	* Sets the lkxmy0916 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0916 the lkxmy0916 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0916(java.lang.String LKXMY0916) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0916(LKXMY0916);
	}

	/**
	* Sets the lkxmy0917 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0917 the lkxmy0917 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0917(java.lang.String LKXMY0917) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0917(LKXMY0917);
	}

	/**
	* Sets the lkxmy0918 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY0918 the lkxmy0918 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY0918(java.lang.String LKXMY0918) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY0918(LKXMY0918);
	}

	/**
	* Sets the lkxmy1007 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY1007 the lkxmy1007 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY1007(java.lang.String LKXMY1007) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY1007(LKXMY1007);
	}

	/**
	* Sets the lkxmy1008 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY1008 the lkxmy1008 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY1008(java.lang.String LKXMY1008) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY1008(LKXMY1008);
	}

	/**
	* Sets the lkxmy1009 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY1009 the lkxmy1009 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY1009(java.lang.String LKXMY1009) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY1009(LKXMY1009);
	}

	/**
	* Sets the lkxmy1010 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY1010 the lkxmy1010 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY1010(java.lang.String LKXMY1010) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY1010(LKXMY1010);
	}

	/**
	* Sets the lkxmy1011 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY1011 the lkxmy1011 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY1011(java.lang.String LKXMY1011) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY1011(LKXMY1011);
	}

	/**
	* Sets the lkxmy1012 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY1012 the lkxmy1012 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY1012(java.lang.String LKXMY1012) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY1012(LKXMY1012);
	}

	/**
	* Sets the lkxmy1013 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY1013 the lkxmy1013 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY1013(java.lang.String LKXMY1013) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY1013(LKXMY1013);
	}

	/**
	* Sets the lkxmy1014 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY1014 the lkxmy1014 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY1014(java.lang.String LKXMY1014) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY1014(LKXMY1014);
	}

	/**
	* Sets the lkxmy1015 of this vr technical spec_lkxmy part2.
	*
	* @param LKXMY1015 the lkxmy1015 of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setLKXMY1015(java.lang.String LKXMY1015) {
		_vrTechnicalSpec_LKXMYPart2.setLKXMY1015(LKXMY1015);
	}

	/**
	* Sets the modify date of this vr technical spec_lkxmy part2.
	*
	* @param modifyDate the modify date of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_LKXMYPart2.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_lkxmy part2.
	*
	* @param mtCore the mt core of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_LKXMYPart2.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_LKXMYPart2.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_lkxmy part2.
	*
	* @param primaryKey the primary key of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_LKXMYPart2.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_LKXMYPart2.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_lkxmy part2.
	*
	* @param referenceUid the reference uid of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_LKXMYPart2.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_lkxmy part2.
	*
	* @param syncDate the sync date of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_LKXMYPart2.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_lkxmy part2.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_lkxmy part2
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_LKXMYPart2.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_LKXMYPart2Wrapper)) {
			return false;
		}

		VRTechnicalSpec_LKXMYPart2Wrapper vrTechnicalSpec_LKXMYPart2Wrapper = (VRTechnicalSpec_LKXMYPart2Wrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_LKXMYPart2,
					vrTechnicalSpec_LKXMYPart2Wrapper._vrTechnicalSpec_LKXMYPart2)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_LKXMYPart2 getWrappedModel() {
		return _vrTechnicalSpec_LKXMYPart2;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_LKXMYPart2.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_LKXMYPart2.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_LKXMYPart2.resetOriginalValues();
	}

	private final VRTechnicalSpec_LKXMYPart2 _vrTechnicalSpec_LKXMYPart2;
}