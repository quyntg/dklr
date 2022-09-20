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
 * This class is a wrapper for {@link VRTechnicalSpec_LKXCG}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_LKXCG
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_LKXCGWrapper implements VRTechnicalSpec_LKXCG,
	ModelWrapper<VRTechnicalSpec_LKXCG> {
	public VRTechnicalSpec_LKXCGWrapper(
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG) {
		_vrTechnicalSpec_LKXCG = vrTechnicalSpec_LKXCG;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_LKXCG.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_LKXCG.class.getName();
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
		attributes.put("XCG01001", getXCG01001());
		attributes.put("XCG01002", getXCG01002());
		attributes.put("XCG01003", getXCG01003());
		attributes.put("XCG01004", getXCG01004());
		attributes.put("XCG01005", getXCG01005());
		attributes.put("XCG01006", getXCG01006());
		attributes.put("XCG01007", getXCG01007());
		attributes.put("XCG01008", getXCG01008());
		attributes.put("XCG01009", getXCG01009());
		attributes.put("XCG01010", getXCG01010());
		attributes.put("XCG01011", getXCG01011());
		attributes.put("XCG01012", getXCG01012());
		attributes.put("XCG01013", getXCG01013());
		attributes.put("XCG01014", getXCG01014());
		attributes.put("XCG01016", getXCG01016());
		attributes.put("XCG01017", getXCG01017());
		attributes.put("XCG01019", getXCG01019());
		attributes.put("XCG01020", getXCG01020());
		attributes.put("XCG01021", getXCG01021());
		attributes.put("XCG01022", getXCG01022());
		attributes.put("XCG01024", getXCG01024());
		attributes.put("XCG01025", getXCG01025());
		attributes.put("XCG01026", getXCG01026());
		attributes.put("XCG01027", getXCG01027());
		attributes.put("XCG01028", getXCG01028());
		attributes.put("XCG01030", getXCG01030());
		attributes.put("XCG01031", getXCG01031());
		attributes.put("XCG01032", getXCG01032());
		attributes.put("XCG01033", getXCG01033());
		attributes.put("XCG01034", getXCG01034());
		attributes.put("XCG01035", getXCG01035());
		attributes.put("XCG01036", getXCG01036());
		attributes.put("XCG01037", getXCG01037());
		attributes.put("XCG01038", getXCG01038());
		attributes.put("XCG01039", getXCG01039());
		attributes.put("XCG01040", getXCG01040());
		attributes.put("XCG01041", getXCG01041());
		attributes.put("XCG01042", getXCG01042());
		attributes.put("XCG01043", getXCG01043());
		attributes.put("XCG01044", getXCG01044());
		attributes.put("XCG01045", getXCG01045());
		attributes.put("XCG01046", getXCG01046());
		attributes.put("XCG01047", getXCG01047());
		attributes.put("XCG01049", getXCG01049());
		attributes.put("XCG01050", getXCG01050());
		attributes.put("XCG01051", getXCG01051());
		attributes.put("XCG01052", getXCG01052());
		attributes.put("XCG01053", getXCG01053());
		attributes.put("XCG01054", getXCG01054());
		attributes.put("XCG01055", getXCG01055());
		attributes.put("XCG01056", getXCG01056());
		attributes.put("XCG01057", getXCG01057());
		attributes.put("XCG01058", getXCG01058());
		attributes.put("XCG01059", getXCG01059());
		attributes.put("XCG01060", getXCG01060());
		attributes.put("XCG01062", getXCG01062());
		attributes.put("XCG01063", getXCG01063());
		attributes.put("XCG01064", getXCG01064());
		attributes.put("XCG01065", getXCG01065());
		attributes.put("XCG01066", getXCG01066());
		attributes.put("XCG01067", getXCG01067());
		attributes.put("XCG01068", getXCG01068());
		attributes.put("XCG01069", getXCG01069());
		attributes.put("LKXCG0407", getLKXCG0407());
		attributes.put("LKXCG0408", getLKXCG0408());
		attributes.put("LKXCG0409", getLKXCG0409());
		attributes.put("LKXCG0410", getLKXCG0410());
		attributes.put("LKXCG0411", getLKXCG0411());
		attributes.put("LKXCG0412", getLKXCG0412());
		attributes.put("LKXCG0413", getLKXCG0413());
		attributes.put("LKXCG0414", getLKXCG0414());
		attributes.put("LKXCG0415", getLKXCG0415());
		attributes.put("LKXCG0416", getLKXCG0416());
		attributes.put("LKXCG0507", getLKXCG0507());
		attributes.put("LKXCG0508", getLKXCG0508());
		attributes.put("LKXCG0509", getLKXCG0509());
		attributes.put("LKXCG0510", getLKXCG0510());
		attributes.put("LKXCG0511", getLKXCG0511());
		attributes.put("LKXCG0512", getLKXCG0512());
		attributes.put("LKXCG0708", getLKXCG0708());
		attributes.put("LKXCG0709", getLKXCG0709());
		attributes.put("LKXCG0710", getLKXCG0710());
		attributes.put("LKXCG0711", getLKXCG0711());
		attributes.put("LKXCG0713", getLKXCG0713());
		attributes.put("LKXCG0714", getLKXCG0714());
		attributes.put("LKXCG0715", getLKXCG0715());
		attributes.put("LKXCG0716", getLKXCG0716());
		attributes.put("LKXCG0717", getLKXCG0717());
		attributes.put("LKXCG0718", getLKXCG0718());
		attributes.put("LKXCG0719", getLKXCG0719());
		attributes.put("LKXCG0720", getLKXCG0720());
		attributes.put("LKXCG0721", getLKXCG0721());
		attributes.put("LKXCG0722", getLKXCG0722());
		attributes.put("LKXCG0723", getLKXCG0723());
		attributes.put("LKXCG0724", getLKXCG0724());
		attributes.put("LKXCG0725", getLKXCG0725());
		attributes.put("LKXCG0726", getLKXCG0726());
		attributes.put("LKXCG0727", getLKXCG0727());
		attributes.put("LKXCG0728", getLKXCG0728());
		attributes.put("LKXCG0606", getLKXCG0606());
		attributes.put("LKXCG0607", getLKXCG0607());
		attributes.put("LKXCG0608", getLKXCG0608());
		attributes.put("LKXCG0609", getLKXCG0609());
		attributes.put("LKXCG0610", getLKXCG0610());
		attributes.put("LKXCG0611", getLKXCG0611());
		attributes.put("LKXCG0612", getLKXCG0612());
		attributes.put("LKXCG0613", getLKXCG0613());
		attributes.put("LKXCG0614", getLKXCG0614());
		attributes.put("LKXCG0615", getLKXCG0615());
		attributes.put("LKXCG0616", getLKXCG0616());
		attributes.put("LKXCG0620", getLKXCG0620());
		attributes.put("LKXCG0807", getLKXCG0807());
		attributes.put("LKXCG0808", getLKXCG0808());
		attributes.put("LKXCG0809", getLKXCG0809());
		attributes.put("LKXCG0810", getLKXCG0810());
		attributes.put("LKXCG0812", getLKXCG0812());
		attributes.put("LKXCG0813", getLKXCG0813());
		attributes.put("LKXCG0814", getLKXCG0814());
		attributes.put("LKXCG0815", getLKXCG0815());
		attributes.put("LKXCG0816", getLKXCG0816());
		attributes.put("LKXCG0817", getLKXCG0817());
		attributes.put("LKXCG0818", getLKXCG0818());
		attributes.put("LKXCG0819", getLKXCG0819());
		attributes.put("LKXCG0820", getLKXCG0820());
		attributes.put("LKXCG0907", getLKXCG0907());
		attributes.put("LKXCG0908", getLKXCG0908());
		attributes.put("LKXCG0909", getLKXCG0909());
		attributes.put("LKXCG0910", getLKXCG0910());
		attributes.put("LKXCG0911", getLKXCG0911());
		attributes.put("LKXCG0912", getLKXCG0912());
		attributes.put("LKXCG0913", getLKXCG0913());
		attributes.put("LKXCG0914", getLKXCG0914());
		attributes.put("BBLKXCG001", getBBLKXCG001());
		attributes.put("BBLKXCG002", getBBLKXCG002());
		attributes.put("BBLKXCG003", getBBLKXCG003());
		attributes.put("BBLKXCG004", getBBLKXCG004());
		attributes.put("BBLKXCG005", getBBLKXCG005());
		attributes.put("BBLKXCG006", getBBLKXCG006());
		attributes.put("BBLKXCG007", getBBLKXCG007());
		attributes.put("BBLKXCG008", getBBLKXCG008());
		attributes.put("BBLKXCG009", getBBLKXCG009());
		attributes.put("BBLKXCG010", getBBLKXCG010());
		attributes.put("BBLKXCG011", getBBLKXCG011());
		attributes.put("BBLKXCG012", getBBLKXCG012());
		attributes.put("BBLKXCG013", getBBLKXCG013());
		attributes.put("BBLKXCG014", getBBLKXCG014());
		attributes.put("BBLKXCG015", getBBLKXCG015());
		attributes.put("BBLKXCG016", getBBLKXCG016());
		attributes.put("BBLKXCG017", getBBLKXCG017());
		attributes.put("BBLKXCG018", getBBLKXCG018());
		attributes.put("BBLKXCG019", getBBLKXCG019());
		attributes.put("BBLKXCG020", getBBLKXCG020());
		attributes.put("BBLKXCG021", getBBLKXCG021());
		attributes.put("BBLKXCG022", getBBLKXCG022());
		attributes.put("BBLKXCG023", getBBLKXCG023());
		attributes.put("BBLKXCG024", getBBLKXCG024());
		attributes.put("BBLKXCG025", getBBLKXCG025());
		attributes.put("BBLKXCG026", getBBLKXCG026());
		attributes.put("BBLKXCG027", getBBLKXCG027());
		attributes.put("BBLKXCG028", getBBLKXCG028());
		attributes.put("BBLKXCG029", getBBLKXCG029());
		attributes.put("BBLKXCG030", getBBLKXCG030());
		attributes.put("BBLKXCG031", getBBLKXCG031());
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

		String XCG01001 = (String)attributes.get("XCG01001");

		if (XCG01001 != null) {
			setXCG01001(XCG01001);
		}

		String XCG01002 = (String)attributes.get("XCG01002");

		if (XCG01002 != null) {
			setXCG01002(XCG01002);
		}

		String XCG01003 = (String)attributes.get("XCG01003");

		if (XCG01003 != null) {
			setXCG01003(XCG01003);
		}

		String XCG01004 = (String)attributes.get("XCG01004");

		if (XCG01004 != null) {
			setXCG01004(XCG01004);
		}

		String XCG01005 = (String)attributes.get("XCG01005");

		if (XCG01005 != null) {
			setXCG01005(XCG01005);
		}

		String XCG01006 = (String)attributes.get("XCG01006");

		if (XCG01006 != null) {
			setXCG01006(XCG01006);
		}

		String XCG01007 = (String)attributes.get("XCG01007");

		if (XCG01007 != null) {
			setXCG01007(XCG01007);
		}

		String XCG01008 = (String)attributes.get("XCG01008");

		if (XCG01008 != null) {
			setXCG01008(XCG01008);
		}

		String XCG01009 = (String)attributes.get("XCG01009");

		if (XCG01009 != null) {
			setXCG01009(XCG01009);
		}

		String XCG01010 = (String)attributes.get("XCG01010");

		if (XCG01010 != null) {
			setXCG01010(XCG01010);
		}

		String XCG01011 = (String)attributes.get("XCG01011");

		if (XCG01011 != null) {
			setXCG01011(XCG01011);
		}

		String XCG01012 = (String)attributes.get("XCG01012");

		if (XCG01012 != null) {
			setXCG01012(XCG01012);
		}

		String XCG01013 = (String)attributes.get("XCG01013");

		if (XCG01013 != null) {
			setXCG01013(XCG01013);
		}

		String XCG01014 = (String)attributes.get("XCG01014");

		if (XCG01014 != null) {
			setXCG01014(XCG01014);
		}

		String XCG01016 = (String)attributes.get("XCG01016");

		if (XCG01016 != null) {
			setXCG01016(XCG01016);
		}

		String XCG01017 = (String)attributes.get("XCG01017");

		if (XCG01017 != null) {
			setXCG01017(XCG01017);
		}

		String XCG01019 = (String)attributes.get("XCG01019");

		if (XCG01019 != null) {
			setXCG01019(XCG01019);
		}

		String XCG01020 = (String)attributes.get("XCG01020");

		if (XCG01020 != null) {
			setXCG01020(XCG01020);
		}

		String XCG01021 = (String)attributes.get("XCG01021");

		if (XCG01021 != null) {
			setXCG01021(XCG01021);
		}

		String XCG01022 = (String)attributes.get("XCG01022");

		if (XCG01022 != null) {
			setXCG01022(XCG01022);
		}

		String XCG01024 = (String)attributes.get("XCG01024");

		if (XCG01024 != null) {
			setXCG01024(XCG01024);
		}

		String XCG01025 = (String)attributes.get("XCG01025");

		if (XCG01025 != null) {
			setXCG01025(XCG01025);
		}

		String XCG01026 = (String)attributes.get("XCG01026");

		if (XCG01026 != null) {
			setXCG01026(XCG01026);
		}

		String XCG01027 = (String)attributes.get("XCG01027");

		if (XCG01027 != null) {
			setXCG01027(XCG01027);
		}

		String XCG01028 = (String)attributes.get("XCG01028");

		if (XCG01028 != null) {
			setXCG01028(XCG01028);
		}

		String XCG01030 = (String)attributes.get("XCG01030");

		if (XCG01030 != null) {
			setXCG01030(XCG01030);
		}

		String XCG01031 = (String)attributes.get("XCG01031");

		if (XCG01031 != null) {
			setXCG01031(XCG01031);
		}

		String XCG01032 = (String)attributes.get("XCG01032");

		if (XCG01032 != null) {
			setXCG01032(XCG01032);
		}

		String XCG01033 = (String)attributes.get("XCG01033");

		if (XCG01033 != null) {
			setXCG01033(XCG01033);
		}

		String XCG01034 = (String)attributes.get("XCG01034");

		if (XCG01034 != null) {
			setXCG01034(XCG01034);
		}

		String XCG01035 = (String)attributes.get("XCG01035");

		if (XCG01035 != null) {
			setXCG01035(XCG01035);
		}

		String XCG01036 = (String)attributes.get("XCG01036");

		if (XCG01036 != null) {
			setXCG01036(XCG01036);
		}

		String XCG01037 = (String)attributes.get("XCG01037");

		if (XCG01037 != null) {
			setXCG01037(XCG01037);
		}

		String XCG01038 = (String)attributes.get("XCG01038");

		if (XCG01038 != null) {
			setXCG01038(XCG01038);
		}

		String XCG01039 = (String)attributes.get("XCG01039");

		if (XCG01039 != null) {
			setXCG01039(XCG01039);
		}

		String XCG01040 = (String)attributes.get("XCG01040");

		if (XCG01040 != null) {
			setXCG01040(XCG01040);
		}

		String XCG01041 = (String)attributes.get("XCG01041");

		if (XCG01041 != null) {
			setXCG01041(XCG01041);
		}

		String XCG01042 = (String)attributes.get("XCG01042");

		if (XCG01042 != null) {
			setXCG01042(XCG01042);
		}

		String XCG01043 = (String)attributes.get("XCG01043");

		if (XCG01043 != null) {
			setXCG01043(XCG01043);
		}

		String XCG01044 = (String)attributes.get("XCG01044");

		if (XCG01044 != null) {
			setXCG01044(XCG01044);
		}

		String XCG01045 = (String)attributes.get("XCG01045");

		if (XCG01045 != null) {
			setXCG01045(XCG01045);
		}

		String XCG01046 = (String)attributes.get("XCG01046");

		if (XCG01046 != null) {
			setXCG01046(XCG01046);
		}

		String XCG01047 = (String)attributes.get("XCG01047");

		if (XCG01047 != null) {
			setXCG01047(XCG01047);
		}

		String XCG01049 = (String)attributes.get("XCG01049");

		if (XCG01049 != null) {
			setXCG01049(XCG01049);
		}

		String XCG01050 = (String)attributes.get("XCG01050");

		if (XCG01050 != null) {
			setXCG01050(XCG01050);
		}

		String XCG01051 = (String)attributes.get("XCG01051");

		if (XCG01051 != null) {
			setXCG01051(XCG01051);
		}

		String XCG01052 = (String)attributes.get("XCG01052");

		if (XCG01052 != null) {
			setXCG01052(XCG01052);
		}

		String XCG01053 = (String)attributes.get("XCG01053");

		if (XCG01053 != null) {
			setXCG01053(XCG01053);
		}

		String XCG01054 = (String)attributes.get("XCG01054");

		if (XCG01054 != null) {
			setXCG01054(XCG01054);
		}

		String XCG01055 = (String)attributes.get("XCG01055");

		if (XCG01055 != null) {
			setXCG01055(XCG01055);
		}

		String XCG01056 = (String)attributes.get("XCG01056");

		if (XCG01056 != null) {
			setXCG01056(XCG01056);
		}

		String XCG01057 = (String)attributes.get("XCG01057");

		if (XCG01057 != null) {
			setXCG01057(XCG01057);
		}

		String XCG01058 = (String)attributes.get("XCG01058");

		if (XCG01058 != null) {
			setXCG01058(XCG01058);
		}

		String XCG01059 = (String)attributes.get("XCG01059");

		if (XCG01059 != null) {
			setXCG01059(XCG01059);
		}

		String XCG01060 = (String)attributes.get("XCG01060");

		if (XCG01060 != null) {
			setXCG01060(XCG01060);
		}

		String XCG01062 = (String)attributes.get("XCG01062");

		if (XCG01062 != null) {
			setXCG01062(XCG01062);
		}

		String XCG01063 = (String)attributes.get("XCG01063");

		if (XCG01063 != null) {
			setXCG01063(XCG01063);
		}

		String XCG01064 = (String)attributes.get("XCG01064");

		if (XCG01064 != null) {
			setXCG01064(XCG01064);
		}

		String XCG01065 = (String)attributes.get("XCG01065");

		if (XCG01065 != null) {
			setXCG01065(XCG01065);
		}

		String XCG01066 = (String)attributes.get("XCG01066");

		if (XCG01066 != null) {
			setXCG01066(XCG01066);
		}

		String XCG01067 = (String)attributes.get("XCG01067");

		if (XCG01067 != null) {
			setXCG01067(XCG01067);
		}

		String XCG01068 = (String)attributes.get("XCG01068");

		if (XCG01068 != null) {
			setXCG01068(XCG01068);
		}

		String XCG01069 = (String)attributes.get("XCG01069");

		if (XCG01069 != null) {
			setXCG01069(XCG01069);
		}

		String LKXCG0407 = (String)attributes.get("LKXCG0407");

		if (LKXCG0407 != null) {
			setLKXCG0407(LKXCG0407);
		}

		String LKXCG0408 = (String)attributes.get("LKXCG0408");

		if (LKXCG0408 != null) {
			setLKXCG0408(LKXCG0408);
		}

		String LKXCG0409 = (String)attributes.get("LKXCG0409");

		if (LKXCG0409 != null) {
			setLKXCG0409(LKXCG0409);
		}

		String LKXCG0410 = (String)attributes.get("LKXCG0410");

		if (LKXCG0410 != null) {
			setLKXCG0410(LKXCG0410);
		}

		String LKXCG0411 = (String)attributes.get("LKXCG0411");

		if (LKXCG0411 != null) {
			setLKXCG0411(LKXCG0411);
		}

		String LKXCG0412 = (String)attributes.get("LKXCG0412");

		if (LKXCG0412 != null) {
			setLKXCG0412(LKXCG0412);
		}

		String LKXCG0413 = (String)attributes.get("LKXCG0413");

		if (LKXCG0413 != null) {
			setLKXCG0413(LKXCG0413);
		}

		String LKXCG0414 = (String)attributes.get("LKXCG0414");

		if (LKXCG0414 != null) {
			setLKXCG0414(LKXCG0414);
		}

		String LKXCG0415 = (String)attributes.get("LKXCG0415");

		if (LKXCG0415 != null) {
			setLKXCG0415(LKXCG0415);
		}

		String LKXCG0416 = (String)attributes.get("LKXCG0416");

		if (LKXCG0416 != null) {
			setLKXCG0416(LKXCG0416);
		}

		String LKXCG0507 = (String)attributes.get("LKXCG0507");

		if (LKXCG0507 != null) {
			setLKXCG0507(LKXCG0507);
		}

		String LKXCG0508 = (String)attributes.get("LKXCG0508");

		if (LKXCG0508 != null) {
			setLKXCG0508(LKXCG0508);
		}

		String LKXCG0509 = (String)attributes.get("LKXCG0509");

		if (LKXCG0509 != null) {
			setLKXCG0509(LKXCG0509);
		}

		String LKXCG0510 = (String)attributes.get("LKXCG0510");

		if (LKXCG0510 != null) {
			setLKXCG0510(LKXCG0510);
		}

		String LKXCG0511 = (String)attributes.get("LKXCG0511");

		if (LKXCG0511 != null) {
			setLKXCG0511(LKXCG0511);
		}

		String LKXCG0512 = (String)attributes.get("LKXCG0512");

		if (LKXCG0512 != null) {
			setLKXCG0512(LKXCG0512);
		}

		String LKXCG0708 = (String)attributes.get("LKXCG0708");

		if (LKXCG0708 != null) {
			setLKXCG0708(LKXCG0708);
		}

		String LKXCG0709 = (String)attributes.get("LKXCG0709");

		if (LKXCG0709 != null) {
			setLKXCG0709(LKXCG0709);
		}

		String LKXCG0710 = (String)attributes.get("LKXCG0710");

		if (LKXCG0710 != null) {
			setLKXCG0710(LKXCG0710);
		}

		String LKXCG0711 = (String)attributes.get("LKXCG0711");

		if (LKXCG0711 != null) {
			setLKXCG0711(LKXCG0711);
		}

		String LKXCG0713 = (String)attributes.get("LKXCG0713");

		if (LKXCG0713 != null) {
			setLKXCG0713(LKXCG0713);
		}

		String LKXCG0714 = (String)attributes.get("LKXCG0714");

		if (LKXCG0714 != null) {
			setLKXCG0714(LKXCG0714);
		}

		String LKXCG0715 = (String)attributes.get("LKXCG0715");

		if (LKXCG0715 != null) {
			setLKXCG0715(LKXCG0715);
		}

		String LKXCG0716 = (String)attributes.get("LKXCG0716");

		if (LKXCG0716 != null) {
			setLKXCG0716(LKXCG0716);
		}

		String LKXCG0717 = (String)attributes.get("LKXCG0717");

		if (LKXCG0717 != null) {
			setLKXCG0717(LKXCG0717);
		}

		String LKXCG0718 = (String)attributes.get("LKXCG0718");

		if (LKXCG0718 != null) {
			setLKXCG0718(LKXCG0718);
		}

		String LKXCG0719 = (String)attributes.get("LKXCG0719");

		if (LKXCG0719 != null) {
			setLKXCG0719(LKXCG0719);
		}

		String LKXCG0720 = (String)attributes.get("LKXCG0720");

		if (LKXCG0720 != null) {
			setLKXCG0720(LKXCG0720);
		}

		String LKXCG0721 = (String)attributes.get("LKXCG0721");

		if (LKXCG0721 != null) {
			setLKXCG0721(LKXCG0721);
		}

		String LKXCG0722 = (String)attributes.get("LKXCG0722");

		if (LKXCG0722 != null) {
			setLKXCG0722(LKXCG0722);
		}

		String LKXCG0723 = (String)attributes.get("LKXCG0723");

		if (LKXCG0723 != null) {
			setLKXCG0723(LKXCG0723);
		}

		String LKXCG0724 = (String)attributes.get("LKXCG0724");

		if (LKXCG0724 != null) {
			setLKXCG0724(LKXCG0724);
		}

		String LKXCG0725 = (String)attributes.get("LKXCG0725");

		if (LKXCG0725 != null) {
			setLKXCG0725(LKXCG0725);
		}

		String LKXCG0726 = (String)attributes.get("LKXCG0726");

		if (LKXCG0726 != null) {
			setLKXCG0726(LKXCG0726);
		}

		String LKXCG0727 = (String)attributes.get("LKXCG0727");

		if (LKXCG0727 != null) {
			setLKXCG0727(LKXCG0727);
		}

		String LKXCG0728 = (String)attributes.get("LKXCG0728");

		if (LKXCG0728 != null) {
			setLKXCG0728(LKXCG0728);
		}

		String LKXCG0606 = (String)attributes.get("LKXCG0606");

		if (LKXCG0606 != null) {
			setLKXCG0606(LKXCG0606);
		}

		String LKXCG0607 = (String)attributes.get("LKXCG0607");

		if (LKXCG0607 != null) {
			setLKXCG0607(LKXCG0607);
		}

		String LKXCG0608 = (String)attributes.get("LKXCG0608");

		if (LKXCG0608 != null) {
			setLKXCG0608(LKXCG0608);
		}

		String LKXCG0609 = (String)attributes.get("LKXCG0609");

		if (LKXCG0609 != null) {
			setLKXCG0609(LKXCG0609);
		}

		String LKXCG0610 = (String)attributes.get("LKXCG0610");

		if (LKXCG0610 != null) {
			setLKXCG0610(LKXCG0610);
		}

		String LKXCG0611 = (String)attributes.get("LKXCG0611");

		if (LKXCG0611 != null) {
			setLKXCG0611(LKXCG0611);
		}

		String LKXCG0612 = (String)attributes.get("LKXCG0612");

		if (LKXCG0612 != null) {
			setLKXCG0612(LKXCG0612);
		}

		String LKXCG0613 = (String)attributes.get("LKXCG0613");

		if (LKXCG0613 != null) {
			setLKXCG0613(LKXCG0613);
		}

		String LKXCG0614 = (String)attributes.get("LKXCG0614");

		if (LKXCG0614 != null) {
			setLKXCG0614(LKXCG0614);
		}

		String LKXCG0615 = (String)attributes.get("LKXCG0615");

		if (LKXCG0615 != null) {
			setLKXCG0615(LKXCG0615);
		}

		String LKXCG0616 = (String)attributes.get("LKXCG0616");

		if (LKXCG0616 != null) {
			setLKXCG0616(LKXCG0616);
		}

		String LKXCG0620 = (String)attributes.get("LKXCG0620");

		if (LKXCG0620 != null) {
			setLKXCG0620(LKXCG0620);
		}

		String LKXCG0807 = (String)attributes.get("LKXCG0807");

		if (LKXCG0807 != null) {
			setLKXCG0807(LKXCG0807);
		}

		String LKXCG0808 = (String)attributes.get("LKXCG0808");

		if (LKXCG0808 != null) {
			setLKXCG0808(LKXCG0808);
		}

		String LKXCG0809 = (String)attributes.get("LKXCG0809");

		if (LKXCG0809 != null) {
			setLKXCG0809(LKXCG0809);
		}

		String LKXCG0810 = (String)attributes.get("LKXCG0810");

		if (LKXCG0810 != null) {
			setLKXCG0810(LKXCG0810);
		}

		String LKXCG0812 = (String)attributes.get("LKXCG0812");

		if (LKXCG0812 != null) {
			setLKXCG0812(LKXCG0812);
		}

		String LKXCG0813 = (String)attributes.get("LKXCG0813");

		if (LKXCG0813 != null) {
			setLKXCG0813(LKXCG0813);
		}

		String LKXCG0814 = (String)attributes.get("LKXCG0814");

		if (LKXCG0814 != null) {
			setLKXCG0814(LKXCG0814);
		}

		String LKXCG0815 = (String)attributes.get("LKXCG0815");

		if (LKXCG0815 != null) {
			setLKXCG0815(LKXCG0815);
		}

		String LKXCG0816 = (String)attributes.get("LKXCG0816");

		if (LKXCG0816 != null) {
			setLKXCG0816(LKXCG0816);
		}

		String LKXCG0817 = (String)attributes.get("LKXCG0817");

		if (LKXCG0817 != null) {
			setLKXCG0817(LKXCG0817);
		}

		String LKXCG0818 = (String)attributes.get("LKXCG0818");

		if (LKXCG0818 != null) {
			setLKXCG0818(LKXCG0818);
		}

		String LKXCG0819 = (String)attributes.get("LKXCG0819");

		if (LKXCG0819 != null) {
			setLKXCG0819(LKXCG0819);
		}

		String LKXCG0820 = (String)attributes.get("LKXCG0820");

		if (LKXCG0820 != null) {
			setLKXCG0820(LKXCG0820);
		}

		String LKXCG0907 = (String)attributes.get("LKXCG0907");

		if (LKXCG0907 != null) {
			setLKXCG0907(LKXCG0907);
		}

		String LKXCG0908 = (String)attributes.get("LKXCG0908");

		if (LKXCG0908 != null) {
			setLKXCG0908(LKXCG0908);
		}

		String LKXCG0909 = (String)attributes.get("LKXCG0909");

		if (LKXCG0909 != null) {
			setLKXCG0909(LKXCG0909);
		}

		String LKXCG0910 = (String)attributes.get("LKXCG0910");

		if (LKXCG0910 != null) {
			setLKXCG0910(LKXCG0910);
		}

		String LKXCG0911 = (String)attributes.get("LKXCG0911");

		if (LKXCG0911 != null) {
			setLKXCG0911(LKXCG0911);
		}

		String LKXCG0912 = (String)attributes.get("LKXCG0912");

		if (LKXCG0912 != null) {
			setLKXCG0912(LKXCG0912);
		}

		String LKXCG0913 = (String)attributes.get("LKXCG0913");

		if (LKXCG0913 != null) {
			setLKXCG0913(LKXCG0913);
		}

		String LKXCG0914 = (String)attributes.get("LKXCG0914");

		if (LKXCG0914 != null) {
			setLKXCG0914(LKXCG0914);
		}

		String BBLKXCG001 = (String)attributes.get("BBLKXCG001");

		if (BBLKXCG001 != null) {
			setBBLKXCG001(BBLKXCG001);
		}

		String BBLKXCG002 = (String)attributes.get("BBLKXCG002");

		if (BBLKXCG002 != null) {
			setBBLKXCG002(BBLKXCG002);
		}

		String BBLKXCG003 = (String)attributes.get("BBLKXCG003");

		if (BBLKXCG003 != null) {
			setBBLKXCG003(BBLKXCG003);
		}

		String BBLKXCG004 = (String)attributes.get("BBLKXCG004");

		if (BBLKXCG004 != null) {
			setBBLKXCG004(BBLKXCG004);
		}

		String BBLKXCG005 = (String)attributes.get("BBLKXCG005");

		if (BBLKXCG005 != null) {
			setBBLKXCG005(BBLKXCG005);
		}

		String BBLKXCG006 = (String)attributes.get("BBLKXCG006");

		if (BBLKXCG006 != null) {
			setBBLKXCG006(BBLKXCG006);
		}

		String BBLKXCG007 = (String)attributes.get("BBLKXCG007");

		if (BBLKXCG007 != null) {
			setBBLKXCG007(BBLKXCG007);
		}

		String BBLKXCG008 = (String)attributes.get("BBLKXCG008");

		if (BBLKXCG008 != null) {
			setBBLKXCG008(BBLKXCG008);
		}

		String BBLKXCG009 = (String)attributes.get("BBLKXCG009");

		if (BBLKXCG009 != null) {
			setBBLKXCG009(BBLKXCG009);
		}

		String BBLKXCG010 = (String)attributes.get("BBLKXCG010");

		if (BBLKXCG010 != null) {
			setBBLKXCG010(BBLKXCG010);
		}

		String BBLKXCG011 = (String)attributes.get("BBLKXCG011");

		if (BBLKXCG011 != null) {
			setBBLKXCG011(BBLKXCG011);
		}

		String BBLKXCG012 = (String)attributes.get("BBLKXCG012");

		if (BBLKXCG012 != null) {
			setBBLKXCG012(BBLKXCG012);
		}

		String BBLKXCG013 = (String)attributes.get("BBLKXCG013");

		if (BBLKXCG013 != null) {
			setBBLKXCG013(BBLKXCG013);
		}

		String BBLKXCG014 = (String)attributes.get("BBLKXCG014");

		if (BBLKXCG014 != null) {
			setBBLKXCG014(BBLKXCG014);
		}

		String BBLKXCG015 = (String)attributes.get("BBLKXCG015");

		if (BBLKXCG015 != null) {
			setBBLKXCG015(BBLKXCG015);
		}

		String BBLKXCG016 = (String)attributes.get("BBLKXCG016");

		if (BBLKXCG016 != null) {
			setBBLKXCG016(BBLKXCG016);
		}

		String BBLKXCG017 = (String)attributes.get("BBLKXCG017");

		if (BBLKXCG017 != null) {
			setBBLKXCG017(BBLKXCG017);
		}

		String BBLKXCG018 = (String)attributes.get("BBLKXCG018");

		if (BBLKXCG018 != null) {
			setBBLKXCG018(BBLKXCG018);
		}

		String BBLKXCG019 = (String)attributes.get("BBLKXCG019");

		if (BBLKXCG019 != null) {
			setBBLKXCG019(BBLKXCG019);
		}

		String BBLKXCG020 = (String)attributes.get("BBLKXCG020");

		if (BBLKXCG020 != null) {
			setBBLKXCG020(BBLKXCG020);
		}

		String BBLKXCG021 = (String)attributes.get("BBLKXCG021");

		if (BBLKXCG021 != null) {
			setBBLKXCG021(BBLKXCG021);
		}

		String BBLKXCG022 = (String)attributes.get("BBLKXCG022");

		if (BBLKXCG022 != null) {
			setBBLKXCG022(BBLKXCG022);
		}

		String BBLKXCG023 = (String)attributes.get("BBLKXCG023");

		if (BBLKXCG023 != null) {
			setBBLKXCG023(BBLKXCG023);
		}

		String BBLKXCG024 = (String)attributes.get("BBLKXCG024");

		if (BBLKXCG024 != null) {
			setBBLKXCG024(BBLKXCG024);
		}

		String BBLKXCG025 = (String)attributes.get("BBLKXCG025");

		if (BBLKXCG025 != null) {
			setBBLKXCG025(BBLKXCG025);
		}

		String BBLKXCG026 = (String)attributes.get("BBLKXCG026");

		if (BBLKXCG026 != null) {
			setBBLKXCG026(BBLKXCG026);
		}

		String BBLKXCG027 = (String)attributes.get("BBLKXCG027");

		if (BBLKXCG027 != null) {
			setBBLKXCG027(BBLKXCG027);
		}

		String BBLKXCG028 = (String)attributes.get("BBLKXCG028");

		if (BBLKXCG028 != null) {
			setBBLKXCG028(BBLKXCG028);
		}

		String BBLKXCG029 = (String)attributes.get("BBLKXCG029");

		if (BBLKXCG029 != null) {
			setBBLKXCG029(BBLKXCG029);
		}

		String BBLKXCG030 = (String)attributes.get("BBLKXCG030");

		if (BBLKXCG030 != null) {
			setBBLKXCG030(BBLKXCG030);
		}

		String BBLKXCG031 = (String)attributes.get("BBLKXCG031");

		if (BBLKXCG031 != null) {
			setBBLKXCG031(BBLKXCG031);
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
	public VRTechnicalSpec_LKXCG toEscapedModel() {
		return new VRTechnicalSpec_LKXCGWrapper(_vrTechnicalSpec_LKXCG.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_LKXCG toUnescapedModel() {
		return new VRTechnicalSpec_LKXCGWrapper(_vrTechnicalSpec_LKXCG.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_LKXCG.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_LKXCG.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_LKXCG.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_LKXCG.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_LKXCG> toCacheModel() {
		return _vrTechnicalSpec_LKXCG.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG) {
		return _vrTechnicalSpec_LKXCG.compareTo(vrTechnicalSpec_LKXCG);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_LKXCG.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_LKXCG.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_LKXCGWrapper((VRTechnicalSpec_LKXCG)_vrTechnicalSpec_LKXCG.clone());
	}

	/**
	* Returns the bblkxcg001 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg001 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG001() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG001();
	}

	/**
	* Returns the bblkxcg002 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg002 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG002() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG002();
	}

	/**
	* Returns the bblkxcg003 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg003 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG003() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG003();
	}

	/**
	* Returns the bblkxcg004 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg004 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG004() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG004();
	}

	/**
	* Returns the bblkxcg005 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg005 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG005() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG005();
	}

	/**
	* Returns the bblkxcg006 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg006 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG006() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG006();
	}

	/**
	* Returns the bblkxcg007 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg007 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG007() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG007();
	}

	/**
	* Returns the bblkxcg008 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg008 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG008() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG008();
	}

	/**
	* Returns the bblkxcg009 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg009 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG009() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG009();
	}

	/**
	* Returns the bblkxcg010 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg010 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG010() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG010();
	}

	/**
	* Returns the bblkxcg011 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg011 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG011() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG011();
	}

	/**
	* Returns the bblkxcg012 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg012 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG012() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG012();
	}

	/**
	* Returns the bblkxcg013 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg013 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG013() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG013();
	}

	/**
	* Returns the bblkxcg014 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg014 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG014() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG014();
	}

	/**
	* Returns the bblkxcg015 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg015 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG015() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG015();
	}

	/**
	* Returns the bblkxcg016 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg016 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG016() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG016();
	}

	/**
	* Returns the bblkxcg017 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg017 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG017() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG017();
	}

	/**
	* Returns the bblkxcg018 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg018 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG018() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG018();
	}

	/**
	* Returns the bblkxcg019 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg019 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG019() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG019();
	}

	/**
	* Returns the bblkxcg020 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg020 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG020() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG020();
	}

	/**
	* Returns the bblkxcg021 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg021 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG021() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG021();
	}

	/**
	* Returns the bblkxcg022 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg022 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG022() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG022();
	}

	/**
	* Returns the bblkxcg023 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg023 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG023() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG023();
	}

	/**
	* Returns the bblkxcg024 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg024 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG024() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG024();
	}

	/**
	* Returns the bblkxcg025 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg025 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG025() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG025();
	}

	/**
	* Returns the bblkxcg026 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg026 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG026() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG026();
	}

	/**
	* Returns the bblkxcg027 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg027 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG027() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG027();
	}

	/**
	* Returns the bblkxcg028 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg028 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG028() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG028();
	}

	/**
	* Returns the bblkxcg029 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg029 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG029() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG029();
	}

	/**
	* Returns the bblkxcg030 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg030 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG030() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG030();
	}

	/**
	* Returns the bblkxcg031 of this vr technical spec_lkxcg.
	*
	* @return the bblkxcg031 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getBBLKXCG031() {
		return _vrTechnicalSpec_LKXCG.getBBLKXCG031();
	}

	/**
	* Returns the deliverable code of this vr technical spec_lkxcg.
	*
	* @return the deliverable code of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_LKXCG.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_lkxcg.
	*
	* @return the dossier ID ctn of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_LKXCG.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_lkxcg.
	*
	* @return the dossier no of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_LKXCG.getDossierNo();
	}

	/**
	* Returns the lkxcg0407 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0407 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0407() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0407();
	}

	/**
	* Returns the lkxcg0408 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0408 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0408() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0408();
	}

	/**
	* Returns the lkxcg0409 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0409 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0409() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0409();
	}

	/**
	* Returns the lkxcg0410 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0410 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0410() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0410();
	}

	/**
	* Returns the lkxcg0411 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0411 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0411() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0411();
	}

	/**
	* Returns the lkxcg0412 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0412 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0412() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0412();
	}

	/**
	* Returns the lkxcg0413 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0413 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0413() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0413();
	}

	/**
	* Returns the lkxcg0414 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0414 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0414() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0414();
	}

	/**
	* Returns the lkxcg0415 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0415 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0415() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0415();
	}

	/**
	* Returns the lkxcg0416 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0416 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0416() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0416();
	}

	/**
	* Returns the lkxcg0507 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0507 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0507() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0507();
	}

	/**
	* Returns the lkxcg0508 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0508 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0508() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0508();
	}

	/**
	* Returns the lkxcg0509 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0509 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0509() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0509();
	}

	/**
	* Returns the lkxcg0510 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0510 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0510() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0510();
	}

	/**
	* Returns the lkxcg0511 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0511 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0511() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0511();
	}

	/**
	* Returns the lkxcg0512 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0512 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0512() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0512();
	}

	/**
	* Returns the lkxcg0606 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0606 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0606() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0606();
	}

	/**
	* Returns the lkxcg0607 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0607 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0607() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0607();
	}

	/**
	* Returns the lkxcg0608 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0608 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0608() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0608();
	}

	/**
	* Returns the lkxcg0609 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0609 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0609() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0609();
	}

	/**
	* Returns the lkxcg0610 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0610 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0610() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0610();
	}

	/**
	* Returns the lkxcg0611 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0611 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0611() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0611();
	}

	/**
	* Returns the lkxcg0612 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0612 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0612() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0612();
	}

	/**
	* Returns the lkxcg0613 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0613 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0613() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0613();
	}

	/**
	* Returns the lkxcg0614 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0614 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0614() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0614();
	}

	/**
	* Returns the lkxcg0615 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0615 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0615() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0615();
	}

	/**
	* Returns the lkxcg0616 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0616 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0616() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0616();
	}

	/**
	* Returns the lkxcg0620 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0620 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0620() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0620();
	}

	/**
	* Returns the lkxcg0708 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0708 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0708() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0708();
	}

	/**
	* Returns the lkxcg0709 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0709 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0709() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0709();
	}

	/**
	* Returns the lkxcg0710 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0710 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0710() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0710();
	}

	/**
	* Returns the lkxcg0711 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0711 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0711() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0711();
	}

	/**
	* Returns the lkxcg0713 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0713 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0713() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0713();
	}

	/**
	* Returns the lkxcg0714 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0714 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0714() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0714();
	}

	/**
	* Returns the lkxcg0715 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0715 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0715() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0715();
	}

	/**
	* Returns the lkxcg0716 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0716 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0716() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0716();
	}

	/**
	* Returns the lkxcg0717 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0717 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0717() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0717();
	}

	/**
	* Returns the lkxcg0718 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0718 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0718() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0718();
	}

	/**
	* Returns the lkxcg0719 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0719 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0719() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0719();
	}

	/**
	* Returns the lkxcg0720 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0720 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0720() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0720();
	}

	/**
	* Returns the lkxcg0721 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0721 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0721() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0721();
	}

	/**
	* Returns the lkxcg0722 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0722 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0722() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0722();
	}

	/**
	* Returns the lkxcg0723 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0723 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0723() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0723();
	}

	/**
	* Returns the lkxcg0724 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0724 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0724() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0724();
	}

	/**
	* Returns the lkxcg0725 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0725 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0725() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0725();
	}

	/**
	* Returns the lkxcg0726 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0726 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0726() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0726();
	}

	/**
	* Returns the lkxcg0727 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0727 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0727() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0727();
	}

	/**
	* Returns the lkxcg0728 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0728 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0728() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0728();
	}

	/**
	* Returns the lkxcg0807 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0807 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0807() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0807();
	}

	/**
	* Returns the lkxcg0808 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0808 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0808() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0808();
	}

	/**
	* Returns the lkxcg0809 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0809 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0809() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0809();
	}

	/**
	* Returns the lkxcg0810 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0810 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0810() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0810();
	}

	/**
	* Returns the lkxcg0812 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0812 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0812() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0812();
	}

	/**
	* Returns the lkxcg0813 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0813 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0813() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0813();
	}

	/**
	* Returns the lkxcg0814 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0814 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0814() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0814();
	}

	/**
	* Returns the lkxcg0815 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0815 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0815() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0815();
	}

	/**
	* Returns the lkxcg0816 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0816 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0816() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0816();
	}

	/**
	* Returns the lkxcg0817 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0817 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0817() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0817();
	}

	/**
	* Returns the lkxcg0818 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0818 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0818() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0818();
	}

	/**
	* Returns the lkxcg0819 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0819 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0819() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0819();
	}

	/**
	* Returns the lkxcg0820 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0820 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0820() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0820();
	}

	/**
	* Returns the lkxcg0907 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0907 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0907() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0907();
	}

	/**
	* Returns the lkxcg0908 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0908 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0908() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0908();
	}

	/**
	* Returns the lkxcg0909 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0909 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0909() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0909();
	}

	/**
	* Returns the lkxcg0910 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0910 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0910() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0910();
	}

	/**
	* Returns the lkxcg0911 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0911 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0911() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0911();
	}

	/**
	* Returns the lkxcg0912 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0912 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0912() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0912();
	}

	/**
	* Returns the lkxcg0913 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0913 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0913() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0913();
	}

	/**
	* Returns the lkxcg0914 of this vr technical spec_lkxcg.
	*
	* @return the lkxcg0914 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getLKXCG0914() {
		return _vrTechnicalSpec_LKXCG.getLKXCG0914();
	}

	/**
	* Returns the reference uid of this vr technical spec_lkxcg.
	*
	* @return the reference uid of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_LKXCG.getReferenceUid();
	}

	/**
	* Returns the xcg01001 of this vr technical spec_lkxcg.
	*
	* @return the xcg01001 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01001() {
		return _vrTechnicalSpec_LKXCG.getXCG01001();
	}

	/**
	* Returns the xcg01002 of this vr technical spec_lkxcg.
	*
	* @return the xcg01002 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01002() {
		return _vrTechnicalSpec_LKXCG.getXCG01002();
	}

	/**
	* Returns the xcg01003 of this vr technical spec_lkxcg.
	*
	* @return the xcg01003 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01003() {
		return _vrTechnicalSpec_LKXCG.getXCG01003();
	}

	/**
	* Returns the xcg01004 of this vr technical spec_lkxcg.
	*
	* @return the xcg01004 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01004() {
		return _vrTechnicalSpec_LKXCG.getXCG01004();
	}

	/**
	* Returns the xcg01005 of this vr technical spec_lkxcg.
	*
	* @return the xcg01005 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01005() {
		return _vrTechnicalSpec_LKXCG.getXCG01005();
	}

	/**
	* Returns the xcg01006 of this vr technical spec_lkxcg.
	*
	* @return the xcg01006 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01006() {
		return _vrTechnicalSpec_LKXCG.getXCG01006();
	}

	/**
	* Returns the xcg01007 of this vr technical spec_lkxcg.
	*
	* @return the xcg01007 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01007() {
		return _vrTechnicalSpec_LKXCG.getXCG01007();
	}

	/**
	* Returns the xcg01008 of this vr technical spec_lkxcg.
	*
	* @return the xcg01008 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01008() {
		return _vrTechnicalSpec_LKXCG.getXCG01008();
	}

	/**
	* Returns the xcg01009 of this vr technical spec_lkxcg.
	*
	* @return the xcg01009 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01009() {
		return _vrTechnicalSpec_LKXCG.getXCG01009();
	}

	/**
	* Returns the xcg01010 of this vr technical spec_lkxcg.
	*
	* @return the xcg01010 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01010() {
		return _vrTechnicalSpec_LKXCG.getXCG01010();
	}

	/**
	* Returns the xcg01011 of this vr technical spec_lkxcg.
	*
	* @return the xcg01011 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01011() {
		return _vrTechnicalSpec_LKXCG.getXCG01011();
	}

	/**
	* Returns the xcg01012 of this vr technical spec_lkxcg.
	*
	* @return the xcg01012 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01012() {
		return _vrTechnicalSpec_LKXCG.getXCG01012();
	}

	/**
	* Returns the xcg01013 of this vr technical spec_lkxcg.
	*
	* @return the xcg01013 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01013() {
		return _vrTechnicalSpec_LKXCG.getXCG01013();
	}

	/**
	* Returns the xcg01014 of this vr technical spec_lkxcg.
	*
	* @return the xcg01014 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01014() {
		return _vrTechnicalSpec_LKXCG.getXCG01014();
	}

	/**
	* Returns the xcg01016 of this vr technical spec_lkxcg.
	*
	* @return the xcg01016 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01016() {
		return _vrTechnicalSpec_LKXCG.getXCG01016();
	}

	/**
	* Returns the xcg01017 of this vr technical spec_lkxcg.
	*
	* @return the xcg01017 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01017() {
		return _vrTechnicalSpec_LKXCG.getXCG01017();
	}

	/**
	* Returns the xcg01019 of this vr technical spec_lkxcg.
	*
	* @return the xcg01019 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01019() {
		return _vrTechnicalSpec_LKXCG.getXCG01019();
	}

	/**
	* Returns the xcg01020 of this vr technical spec_lkxcg.
	*
	* @return the xcg01020 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01020() {
		return _vrTechnicalSpec_LKXCG.getXCG01020();
	}

	/**
	* Returns the xcg01021 of this vr technical spec_lkxcg.
	*
	* @return the xcg01021 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01021() {
		return _vrTechnicalSpec_LKXCG.getXCG01021();
	}

	/**
	* Returns the xcg01022 of this vr technical spec_lkxcg.
	*
	* @return the xcg01022 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01022() {
		return _vrTechnicalSpec_LKXCG.getXCG01022();
	}

	/**
	* Returns the xcg01024 of this vr technical spec_lkxcg.
	*
	* @return the xcg01024 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01024() {
		return _vrTechnicalSpec_LKXCG.getXCG01024();
	}

	/**
	* Returns the xcg01025 of this vr technical spec_lkxcg.
	*
	* @return the xcg01025 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01025() {
		return _vrTechnicalSpec_LKXCG.getXCG01025();
	}

	/**
	* Returns the xcg01026 of this vr technical spec_lkxcg.
	*
	* @return the xcg01026 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01026() {
		return _vrTechnicalSpec_LKXCG.getXCG01026();
	}

	/**
	* Returns the xcg01027 of this vr technical spec_lkxcg.
	*
	* @return the xcg01027 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01027() {
		return _vrTechnicalSpec_LKXCG.getXCG01027();
	}

	/**
	* Returns the xcg01028 of this vr technical spec_lkxcg.
	*
	* @return the xcg01028 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01028() {
		return _vrTechnicalSpec_LKXCG.getXCG01028();
	}

	/**
	* Returns the xcg01030 of this vr technical spec_lkxcg.
	*
	* @return the xcg01030 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01030() {
		return _vrTechnicalSpec_LKXCG.getXCG01030();
	}

	/**
	* Returns the xcg01031 of this vr technical spec_lkxcg.
	*
	* @return the xcg01031 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01031() {
		return _vrTechnicalSpec_LKXCG.getXCG01031();
	}

	/**
	* Returns the xcg01032 of this vr technical spec_lkxcg.
	*
	* @return the xcg01032 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01032() {
		return _vrTechnicalSpec_LKXCG.getXCG01032();
	}

	/**
	* Returns the xcg01033 of this vr technical spec_lkxcg.
	*
	* @return the xcg01033 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01033() {
		return _vrTechnicalSpec_LKXCG.getXCG01033();
	}

	/**
	* Returns the xcg01034 of this vr technical spec_lkxcg.
	*
	* @return the xcg01034 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01034() {
		return _vrTechnicalSpec_LKXCG.getXCG01034();
	}

	/**
	* Returns the xcg01035 of this vr technical spec_lkxcg.
	*
	* @return the xcg01035 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01035() {
		return _vrTechnicalSpec_LKXCG.getXCG01035();
	}

	/**
	* Returns the xcg01036 of this vr technical spec_lkxcg.
	*
	* @return the xcg01036 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01036() {
		return _vrTechnicalSpec_LKXCG.getXCG01036();
	}

	/**
	* Returns the xcg01037 of this vr technical spec_lkxcg.
	*
	* @return the xcg01037 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01037() {
		return _vrTechnicalSpec_LKXCG.getXCG01037();
	}

	/**
	* Returns the xcg01038 of this vr technical spec_lkxcg.
	*
	* @return the xcg01038 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01038() {
		return _vrTechnicalSpec_LKXCG.getXCG01038();
	}

	/**
	* Returns the xcg01039 of this vr technical spec_lkxcg.
	*
	* @return the xcg01039 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01039() {
		return _vrTechnicalSpec_LKXCG.getXCG01039();
	}

	/**
	* Returns the xcg01040 of this vr technical spec_lkxcg.
	*
	* @return the xcg01040 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01040() {
		return _vrTechnicalSpec_LKXCG.getXCG01040();
	}

	/**
	* Returns the xcg01041 of this vr technical spec_lkxcg.
	*
	* @return the xcg01041 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01041() {
		return _vrTechnicalSpec_LKXCG.getXCG01041();
	}

	/**
	* Returns the xcg01042 of this vr technical spec_lkxcg.
	*
	* @return the xcg01042 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01042() {
		return _vrTechnicalSpec_LKXCG.getXCG01042();
	}

	/**
	* Returns the xcg01043 of this vr technical spec_lkxcg.
	*
	* @return the xcg01043 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01043() {
		return _vrTechnicalSpec_LKXCG.getXCG01043();
	}

	/**
	* Returns the xcg01044 of this vr technical spec_lkxcg.
	*
	* @return the xcg01044 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01044() {
		return _vrTechnicalSpec_LKXCG.getXCG01044();
	}

	/**
	* Returns the xcg01045 of this vr technical spec_lkxcg.
	*
	* @return the xcg01045 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01045() {
		return _vrTechnicalSpec_LKXCG.getXCG01045();
	}

	/**
	* Returns the xcg01046 of this vr technical spec_lkxcg.
	*
	* @return the xcg01046 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01046() {
		return _vrTechnicalSpec_LKXCG.getXCG01046();
	}

	/**
	* Returns the xcg01047 of this vr technical spec_lkxcg.
	*
	* @return the xcg01047 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01047() {
		return _vrTechnicalSpec_LKXCG.getXCG01047();
	}

	/**
	* Returns the xcg01049 of this vr technical spec_lkxcg.
	*
	* @return the xcg01049 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01049() {
		return _vrTechnicalSpec_LKXCG.getXCG01049();
	}

	/**
	* Returns the xcg01050 of this vr technical spec_lkxcg.
	*
	* @return the xcg01050 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01050() {
		return _vrTechnicalSpec_LKXCG.getXCG01050();
	}

	/**
	* Returns the xcg01051 of this vr technical spec_lkxcg.
	*
	* @return the xcg01051 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01051() {
		return _vrTechnicalSpec_LKXCG.getXCG01051();
	}

	/**
	* Returns the xcg01052 of this vr technical spec_lkxcg.
	*
	* @return the xcg01052 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01052() {
		return _vrTechnicalSpec_LKXCG.getXCG01052();
	}

	/**
	* Returns the xcg01053 of this vr technical spec_lkxcg.
	*
	* @return the xcg01053 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01053() {
		return _vrTechnicalSpec_LKXCG.getXCG01053();
	}

	/**
	* Returns the xcg01054 of this vr technical spec_lkxcg.
	*
	* @return the xcg01054 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01054() {
		return _vrTechnicalSpec_LKXCG.getXCG01054();
	}

	/**
	* Returns the xcg01055 of this vr technical spec_lkxcg.
	*
	* @return the xcg01055 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01055() {
		return _vrTechnicalSpec_LKXCG.getXCG01055();
	}

	/**
	* Returns the xcg01056 of this vr technical spec_lkxcg.
	*
	* @return the xcg01056 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01056() {
		return _vrTechnicalSpec_LKXCG.getXCG01056();
	}

	/**
	* Returns the xcg01057 of this vr technical spec_lkxcg.
	*
	* @return the xcg01057 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01057() {
		return _vrTechnicalSpec_LKXCG.getXCG01057();
	}

	/**
	* Returns the xcg01058 of this vr technical spec_lkxcg.
	*
	* @return the xcg01058 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01058() {
		return _vrTechnicalSpec_LKXCG.getXCG01058();
	}

	/**
	* Returns the xcg01059 of this vr technical spec_lkxcg.
	*
	* @return the xcg01059 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01059() {
		return _vrTechnicalSpec_LKXCG.getXCG01059();
	}

	/**
	* Returns the xcg01060 of this vr technical spec_lkxcg.
	*
	* @return the xcg01060 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01060() {
		return _vrTechnicalSpec_LKXCG.getXCG01060();
	}

	/**
	* Returns the xcg01062 of this vr technical spec_lkxcg.
	*
	* @return the xcg01062 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01062() {
		return _vrTechnicalSpec_LKXCG.getXCG01062();
	}

	/**
	* Returns the xcg01063 of this vr technical spec_lkxcg.
	*
	* @return the xcg01063 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01063() {
		return _vrTechnicalSpec_LKXCG.getXCG01063();
	}

	/**
	* Returns the xcg01064 of this vr technical spec_lkxcg.
	*
	* @return the xcg01064 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01064() {
		return _vrTechnicalSpec_LKXCG.getXCG01064();
	}

	/**
	* Returns the xcg01065 of this vr technical spec_lkxcg.
	*
	* @return the xcg01065 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01065() {
		return _vrTechnicalSpec_LKXCG.getXCG01065();
	}

	/**
	* Returns the xcg01066 of this vr technical spec_lkxcg.
	*
	* @return the xcg01066 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01066() {
		return _vrTechnicalSpec_LKXCG.getXCG01066();
	}

	/**
	* Returns the xcg01067 of this vr technical spec_lkxcg.
	*
	* @return the xcg01067 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01067() {
		return _vrTechnicalSpec_LKXCG.getXCG01067();
	}

	/**
	* Returns the xcg01068 of this vr technical spec_lkxcg.
	*
	* @return the xcg01068 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01068() {
		return _vrTechnicalSpec_LKXCG.getXCG01068();
	}

	/**
	* Returns the xcg01069 of this vr technical spec_lkxcg.
	*
	* @return the xcg01069 of this vr technical spec_lkxcg
	*/
	@Override
	public java.lang.String getXCG01069() {
		return _vrTechnicalSpec_LKXCG.getXCG01069();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_LKXCG.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_LKXCG.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_lkxcg.
	*
	* @return the modify date of this vr technical spec_lkxcg
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_LKXCG.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_lkxcg.
	*
	* @return the sync date of this vr technical spec_lkxcg
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_LKXCG.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_lkxcg.
	*
	* @return the convert assemble ID of this vr technical spec_lkxcg
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_LKXCG.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_lkxcg.
	*
	* @return the dossier ID of this vr technical spec_lkxcg
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_LKXCG.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_lkxcg.
	*
	* @return the ID of this vr technical spec_lkxcg
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_LKXCG.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_lkxcg.
	*
	* @return the mt core of this vr technical spec_lkxcg
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_LKXCG.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_lkxcg.
	*
	* @return the primary key of this vr technical spec_lkxcg
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_LKXCG.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_lkxcg.
	*
	* @return the vehicle type certificate ID of this vr technical spec_lkxcg
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_LKXCG.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_LKXCG.persist();
	}

	/**
	* Sets the bblkxcg001 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG001 the bblkxcg001 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG001(java.lang.String BBLKXCG001) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG001(BBLKXCG001);
	}

	/**
	* Sets the bblkxcg002 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG002 the bblkxcg002 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG002(java.lang.String BBLKXCG002) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG002(BBLKXCG002);
	}

	/**
	* Sets the bblkxcg003 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG003 the bblkxcg003 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG003(java.lang.String BBLKXCG003) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG003(BBLKXCG003);
	}

	/**
	* Sets the bblkxcg004 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG004 the bblkxcg004 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG004(java.lang.String BBLKXCG004) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG004(BBLKXCG004);
	}

	/**
	* Sets the bblkxcg005 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG005 the bblkxcg005 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG005(java.lang.String BBLKXCG005) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG005(BBLKXCG005);
	}

	/**
	* Sets the bblkxcg006 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG006 the bblkxcg006 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG006(java.lang.String BBLKXCG006) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG006(BBLKXCG006);
	}

	/**
	* Sets the bblkxcg007 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG007 the bblkxcg007 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG007(java.lang.String BBLKXCG007) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG007(BBLKXCG007);
	}

	/**
	* Sets the bblkxcg008 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG008 the bblkxcg008 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG008(java.lang.String BBLKXCG008) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG008(BBLKXCG008);
	}

	/**
	* Sets the bblkxcg009 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG009 the bblkxcg009 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG009(java.lang.String BBLKXCG009) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG009(BBLKXCG009);
	}

	/**
	* Sets the bblkxcg010 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG010 the bblkxcg010 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG010(java.lang.String BBLKXCG010) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG010(BBLKXCG010);
	}

	/**
	* Sets the bblkxcg011 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG011 the bblkxcg011 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG011(java.lang.String BBLKXCG011) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG011(BBLKXCG011);
	}

	/**
	* Sets the bblkxcg012 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG012 the bblkxcg012 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG012(java.lang.String BBLKXCG012) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG012(BBLKXCG012);
	}

	/**
	* Sets the bblkxcg013 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG013 the bblkxcg013 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG013(java.lang.String BBLKXCG013) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG013(BBLKXCG013);
	}

	/**
	* Sets the bblkxcg014 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG014 the bblkxcg014 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG014(java.lang.String BBLKXCG014) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG014(BBLKXCG014);
	}

	/**
	* Sets the bblkxcg015 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG015 the bblkxcg015 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG015(java.lang.String BBLKXCG015) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG015(BBLKXCG015);
	}

	/**
	* Sets the bblkxcg016 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG016 the bblkxcg016 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG016(java.lang.String BBLKXCG016) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG016(BBLKXCG016);
	}

	/**
	* Sets the bblkxcg017 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG017 the bblkxcg017 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG017(java.lang.String BBLKXCG017) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG017(BBLKXCG017);
	}

	/**
	* Sets the bblkxcg018 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG018 the bblkxcg018 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG018(java.lang.String BBLKXCG018) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG018(BBLKXCG018);
	}

	/**
	* Sets the bblkxcg019 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG019 the bblkxcg019 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG019(java.lang.String BBLKXCG019) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG019(BBLKXCG019);
	}

	/**
	* Sets the bblkxcg020 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG020 the bblkxcg020 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG020(java.lang.String BBLKXCG020) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG020(BBLKXCG020);
	}

	/**
	* Sets the bblkxcg021 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG021 the bblkxcg021 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG021(java.lang.String BBLKXCG021) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG021(BBLKXCG021);
	}

	/**
	* Sets the bblkxcg022 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG022 the bblkxcg022 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG022(java.lang.String BBLKXCG022) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG022(BBLKXCG022);
	}

	/**
	* Sets the bblkxcg023 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG023 the bblkxcg023 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG023(java.lang.String BBLKXCG023) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG023(BBLKXCG023);
	}

	/**
	* Sets the bblkxcg024 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG024 the bblkxcg024 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG024(java.lang.String BBLKXCG024) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG024(BBLKXCG024);
	}

	/**
	* Sets the bblkxcg025 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG025 the bblkxcg025 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG025(java.lang.String BBLKXCG025) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG025(BBLKXCG025);
	}

	/**
	* Sets the bblkxcg026 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG026 the bblkxcg026 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG026(java.lang.String BBLKXCG026) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG026(BBLKXCG026);
	}

	/**
	* Sets the bblkxcg027 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG027 the bblkxcg027 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG027(java.lang.String BBLKXCG027) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG027(BBLKXCG027);
	}

	/**
	* Sets the bblkxcg028 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG028 the bblkxcg028 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG028(java.lang.String BBLKXCG028) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG028(BBLKXCG028);
	}

	/**
	* Sets the bblkxcg029 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG029 the bblkxcg029 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG029(java.lang.String BBLKXCG029) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG029(BBLKXCG029);
	}

	/**
	* Sets the bblkxcg030 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG030 the bblkxcg030 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG030(java.lang.String BBLKXCG030) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG030(BBLKXCG030);
	}

	/**
	* Sets the bblkxcg031 of this vr technical spec_lkxcg.
	*
	* @param BBLKXCG031 the bblkxcg031 of this vr technical spec_lkxcg
	*/
	@Override
	public void setBBLKXCG031(java.lang.String BBLKXCG031) {
		_vrTechnicalSpec_LKXCG.setBBLKXCG031(BBLKXCG031);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_LKXCG.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_lkxcg.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_lkxcg
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_LKXCG.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_lkxcg.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_lkxcg
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_LKXCG.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_lkxcg.
	*
	* @param dossierId the dossier ID of this vr technical spec_lkxcg
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_LKXCG.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_lkxcg.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_lkxcg
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_LKXCG.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_lkxcg.
	*
	* @param dossierNo the dossier no of this vr technical spec_lkxcg
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_LKXCG.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_LKXCG.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_LKXCG.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_LKXCG.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_lkxcg.
	*
	* @param id the ID of this vr technical spec_lkxcg
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_LKXCG.setId(id);
	}

	/**
	* Sets the lkxcg0407 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0407 the lkxcg0407 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0407(java.lang.String LKXCG0407) {
		_vrTechnicalSpec_LKXCG.setLKXCG0407(LKXCG0407);
	}

	/**
	* Sets the lkxcg0408 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0408 the lkxcg0408 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0408(java.lang.String LKXCG0408) {
		_vrTechnicalSpec_LKXCG.setLKXCG0408(LKXCG0408);
	}

	/**
	* Sets the lkxcg0409 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0409 the lkxcg0409 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0409(java.lang.String LKXCG0409) {
		_vrTechnicalSpec_LKXCG.setLKXCG0409(LKXCG0409);
	}

	/**
	* Sets the lkxcg0410 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0410 the lkxcg0410 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0410(java.lang.String LKXCG0410) {
		_vrTechnicalSpec_LKXCG.setLKXCG0410(LKXCG0410);
	}

	/**
	* Sets the lkxcg0411 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0411 the lkxcg0411 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0411(java.lang.String LKXCG0411) {
		_vrTechnicalSpec_LKXCG.setLKXCG0411(LKXCG0411);
	}

	/**
	* Sets the lkxcg0412 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0412 the lkxcg0412 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0412(java.lang.String LKXCG0412) {
		_vrTechnicalSpec_LKXCG.setLKXCG0412(LKXCG0412);
	}

	/**
	* Sets the lkxcg0413 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0413 the lkxcg0413 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0413(java.lang.String LKXCG0413) {
		_vrTechnicalSpec_LKXCG.setLKXCG0413(LKXCG0413);
	}

	/**
	* Sets the lkxcg0414 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0414 the lkxcg0414 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0414(java.lang.String LKXCG0414) {
		_vrTechnicalSpec_LKXCG.setLKXCG0414(LKXCG0414);
	}

	/**
	* Sets the lkxcg0415 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0415 the lkxcg0415 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0415(java.lang.String LKXCG0415) {
		_vrTechnicalSpec_LKXCG.setLKXCG0415(LKXCG0415);
	}

	/**
	* Sets the lkxcg0416 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0416 the lkxcg0416 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0416(java.lang.String LKXCG0416) {
		_vrTechnicalSpec_LKXCG.setLKXCG0416(LKXCG0416);
	}

	/**
	* Sets the lkxcg0507 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0507 the lkxcg0507 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0507(java.lang.String LKXCG0507) {
		_vrTechnicalSpec_LKXCG.setLKXCG0507(LKXCG0507);
	}

	/**
	* Sets the lkxcg0508 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0508 the lkxcg0508 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0508(java.lang.String LKXCG0508) {
		_vrTechnicalSpec_LKXCG.setLKXCG0508(LKXCG0508);
	}

	/**
	* Sets the lkxcg0509 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0509 the lkxcg0509 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0509(java.lang.String LKXCG0509) {
		_vrTechnicalSpec_LKXCG.setLKXCG0509(LKXCG0509);
	}

	/**
	* Sets the lkxcg0510 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0510 the lkxcg0510 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0510(java.lang.String LKXCG0510) {
		_vrTechnicalSpec_LKXCG.setLKXCG0510(LKXCG0510);
	}

	/**
	* Sets the lkxcg0511 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0511 the lkxcg0511 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0511(java.lang.String LKXCG0511) {
		_vrTechnicalSpec_LKXCG.setLKXCG0511(LKXCG0511);
	}

	/**
	* Sets the lkxcg0512 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0512 the lkxcg0512 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0512(java.lang.String LKXCG0512) {
		_vrTechnicalSpec_LKXCG.setLKXCG0512(LKXCG0512);
	}

	/**
	* Sets the lkxcg0606 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0606 the lkxcg0606 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0606(java.lang.String LKXCG0606) {
		_vrTechnicalSpec_LKXCG.setLKXCG0606(LKXCG0606);
	}

	/**
	* Sets the lkxcg0607 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0607 the lkxcg0607 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0607(java.lang.String LKXCG0607) {
		_vrTechnicalSpec_LKXCG.setLKXCG0607(LKXCG0607);
	}

	/**
	* Sets the lkxcg0608 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0608 the lkxcg0608 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0608(java.lang.String LKXCG0608) {
		_vrTechnicalSpec_LKXCG.setLKXCG0608(LKXCG0608);
	}

	/**
	* Sets the lkxcg0609 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0609 the lkxcg0609 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0609(java.lang.String LKXCG0609) {
		_vrTechnicalSpec_LKXCG.setLKXCG0609(LKXCG0609);
	}

	/**
	* Sets the lkxcg0610 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0610 the lkxcg0610 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0610(java.lang.String LKXCG0610) {
		_vrTechnicalSpec_LKXCG.setLKXCG0610(LKXCG0610);
	}

	/**
	* Sets the lkxcg0611 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0611 the lkxcg0611 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0611(java.lang.String LKXCG0611) {
		_vrTechnicalSpec_LKXCG.setLKXCG0611(LKXCG0611);
	}

	/**
	* Sets the lkxcg0612 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0612 the lkxcg0612 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0612(java.lang.String LKXCG0612) {
		_vrTechnicalSpec_LKXCG.setLKXCG0612(LKXCG0612);
	}

	/**
	* Sets the lkxcg0613 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0613 the lkxcg0613 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0613(java.lang.String LKXCG0613) {
		_vrTechnicalSpec_LKXCG.setLKXCG0613(LKXCG0613);
	}

	/**
	* Sets the lkxcg0614 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0614 the lkxcg0614 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0614(java.lang.String LKXCG0614) {
		_vrTechnicalSpec_LKXCG.setLKXCG0614(LKXCG0614);
	}

	/**
	* Sets the lkxcg0615 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0615 the lkxcg0615 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0615(java.lang.String LKXCG0615) {
		_vrTechnicalSpec_LKXCG.setLKXCG0615(LKXCG0615);
	}

	/**
	* Sets the lkxcg0616 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0616 the lkxcg0616 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0616(java.lang.String LKXCG0616) {
		_vrTechnicalSpec_LKXCG.setLKXCG0616(LKXCG0616);
	}

	/**
	* Sets the lkxcg0620 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0620 the lkxcg0620 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0620(java.lang.String LKXCG0620) {
		_vrTechnicalSpec_LKXCG.setLKXCG0620(LKXCG0620);
	}

	/**
	* Sets the lkxcg0708 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0708 the lkxcg0708 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0708(java.lang.String LKXCG0708) {
		_vrTechnicalSpec_LKXCG.setLKXCG0708(LKXCG0708);
	}

	/**
	* Sets the lkxcg0709 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0709 the lkxcg0709 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0709(java.lang.String LKXCG0709) {
		_vrTechnicalSpec_LKXCG.setLKXCG0709(LKXCG0709);
	}

	/**
	* Sets the lkxcg0710 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0710 the lkxcg0710 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0710(java.lang.String LKXCG0710) {
		_vrTechnicalSpec_LKXCG.setLKXCG0710(LKXCG0710);
	}

	/**
	* Sets the lkxcg0711 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0711 the lkxcg0711 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0711(java.lang.String LKXCG0711) {
		_vrTechnicalSpec_LKXCG.setLKXCG0711(LKXCG0711);
	}

	/**
	* Sets the lkxcg0713 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0713 the lkxcg0713 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0713(java.lang.String LKXCG0713) {
		_vrTechnicalSpec_LKXCG.setLKXCG0713(LKXCG0713);
	}

	/**
	* Sets the lkxcg0714 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0714 the lkxcg0714 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0714(java.lang.String LKXCG0714) {
		_vrTechnicalSpec_LKXCG.setLKXCG0714(LKXCG0714);
	}

	/**
	* Sets the lkxcg0715 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0715 the lkxcg0715 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0715(java.lang.String LKXCG0715) {
		_vrTechnicalSpec_LKXCG.setLKXCG0715(LKXCG0715);
	}

	/**
	* Sets the lkxcg0716 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0716 the lkxcg0716 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0716(java.lang.String LKXCG0716) {
		_vrTechnicalSpec_LKXCG.setLKXCG0716(LKXCG0716);
	}

	/**
	* Sets the lkxcg0717 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0717 the lkxcg0717 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0717(java.lang.String LKXCG0717) {
		_vrTechnicalSpec_LKXCG.setLKXCG0717(LKXCG0717);
	}

	/**
	* Sets the lkxcg0718 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0718 the lkxcg0718 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0718(java.lang.String LKXCG0718) {
		_vrTechnicalSpec_LKXCG.setLKXCG0718(LKXCG0718);
	}

	/**
	* Sets the lkxcg0719 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0719 the lkxcg0719 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0719(java.lang.String LKXCG0719) {
		_vrTechnicalSpec_LKXCG.setLKXCG0719(LKXCG0719);
	}

	/**
	* Sets the lkxcg0720 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0720 the lkxcg0720 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0720(java.lang.String LKXCG0720) {
		_vrTechnicalSpec_LKXCG.setLKXCG0720(LKXCG0720);
	}

	/**
	* Sets the lkxcg0721 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0721 the lkxcg0721 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0721(java.lang.String LKXCG0721) {
		_vrTechnicalSpec_LKXCG.setLKXCG0721(LKXCG0721);
	}

	/**
	* Sets the lkxcg0722 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0722 the lkxcg0722 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0722(java.lang.String LKXCG0722) {
		_vrTechnicalSpec_LKXCG.setLKXCG0722(LKXCG0722);
	}

	/**
	* Sets the lkxcg0723 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0723 the lkxcg0723 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0723(java.lang.String LKXCG0723) {
		_vrTechnicalSpec_LKXCG.setLKXCG0723(LKXCG0723);
	}

	/**
	* Sets the lkxcg0724 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0724 the lkxcg0724 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0724(java.lang.String LKXCG0724) {
		_vrTechnicalSpec_LKXCG.setLKXCG0724(LKXCG0724);
	}

	/**
	* Sets the lkxcg0725 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0725 the lkxcg0725 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0725(java.lang.String LKXCG0725) {
		_vrTechnicalSpec_LKXCG.setLKXCG0725(LKXCG0725);
	}

	/**
	* Sets the lkxcg0726 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0726 the lkxcg0726 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0726(java.lang.String LKXCG0726) {
		_vrTechnicalSpec_LKXCG.setLKXCG0726(LKXCG0726);
	}

	/**
	* Sets the lkxcg0727 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0727 the lkxcg0727 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0727(java.lang.String LKXCG0727) {
		_vrTechnicalSpec_LKXCG.setLKXCG0727(LKXCG0727);
	}

	/**
	* Sets the lkxcg0728 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0728 the lkxcg0728 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0728(java.lang.String LKXCG0728) {
		_vrTechnicalSpec_LKXCG.setLKXCG0728(LKXCG0728);
	}

	/**
	* Sets the lkxcg0807 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0807 the lkxcg0807 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0807(java.lang.String LKXCG0807) {
		_vrTechnicalSpec_LKXCG.setLKXCG0807(LKXCG0807);
	}

	/**
	* Sets the lkxcg0808 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0808 the lkxcg0808 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0808(java.lang.String LKXCG0808) {
		_vrTechnicalSpec_LKXCG.setLKXCG0808(LKXCG0808);
	}

	/**
	* Sets the lkxcg0809 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0809 the lkxcg0809 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0809(java.lang.String LKXCG0809) {
		_vrTechnicalSpec_LKXCG.setLKXCG0809(LKXCG0809);
	}

	/**
	* Sets the lkxcg0810 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0810 the lkxcg0810 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0810(java.lang.String LKXCG0810) {
		_vrTechnicalSpec_LKXCG.setLKXCG0810(LKXCG0810);
	}

	/**
	* Sets the lkxcg0812 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0812 the lkxcg0812 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0812(java.lang.String LKXCG0812) {
		_vrTechnicalSpec_LKXCG.setLKXCG0812(LKXCG0812);
	}

	/**
	* Sets the lkxcg0813 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0813 the lkxcg0813 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0813(java.lang.String LKXCG0813) {
		_vrTechnicalSpec_LKXCG.setLKXCG0813(LKXCG0813);
	}

	/**
	* Sets the lkxcg0814 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0814 the lkxcg0814 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0814(java.lang.String LKXCG0814) {
		_vrTechnicalSpec_LKXCG.setLKXCG0814(LKXCG0814);
	}

	/**
	* Sets the lkxcg0815 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0815 the lkxcg0815 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0815(java.lang.String LKXCG0815) {
		_vrTechnicalSpec_LKXCG.setLKXCG0815(LKXCG0815);
	}

	/**
	* Sets the lkxcg0816 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0816 the lkxcg0816 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0816(java.lang.String LKXCG0816) {
		_vrTechnicalSpec_LKXCG.setLKXCG0816(LKXCG0816);
	}

	/**
	* Sets the lkxcg0817 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0817 the lkxcg0817 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0817(java.lang.String LKXCG0817) {
		_vrTechnicalSpec_LKXCG.setLKXCG0817(LKXCG0817);
	}

	/**
	* Sets the lkxcg0818 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0818 the lkxcg0818 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0818(java.lang.String LKXCG0818) {
		_vrTechnicalSpec_LKXCG.setLKXCG0818(LKXCG0818);
	}

	/**
	* Sets the lkxcg0819 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0819 the lkxcg0819 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0819(java.lang.String LKXCG0819) {
		_vrTechnicalSpec_LKXCG.setLKXCG0819(LKXCG0819);
	}

	/**
	* Sets the lkxcg0820 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0820 the lkxcg0820 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0820(java.lang.String LKXCG0820) {
		_vrTechnicalSpec_LKXCG.setLKXCG0820(LKXCG0820);
	}

	/**
	* Sets the lkxcg0907 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0907 the lkxcg0907 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0907(java.lang.String LKXCG0907) {
		_vrTechnicalSpec_LKXCG.setLKXCG0907(LKXCG0907);
	}

	/**
	* Sets the lkxcg0908 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0908 the lkxcg0908 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0908(java.lang.String LKXCG0908) {
		_vrTechnicalSpec_LKXCG.setLKXCG0908(LKXCG0908);
	}

	/**
	* Sets the lkxcg0909 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0909 the lkxcg0909 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0909(java.lang.String LKXCG0909) {
		_vrTechnicalSpec_LKXCG.setLKXCG0909(LKXCG0909);
	}

	/**
	* Sets the lkxcg0910 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0910 the lkxcg0910 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0910(java.lang.String LKXCG0910) {
		_vrTechnicalSpec_LKXCG.setLKXCG0910(LKXCG0910);
	}

	/**
	* Sets the lkxcg0911 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0911 the lkxcg0911 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0911(java.lang.String LKXCG0911) {
		_vrTechnicalSpec_LKXCG.setLKXCG0911(LKXCG0911);
	}

	/**
	* Sets the lkxcg0912 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0912 the lkxcg0912 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0912(java.lang.String LKXCG0912) {
		_vrTechnicalSpec_LKXCG.setLKXCG0912(LKXCG0912);
	}

	/**
	* Sets the lkxcg0913 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0913 the lkxcg0913 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0913(java.lang.String LKXCG0913) {
		_vrTechnicalSpec_LKXCG.setLKXCG0913(LKXCG0913);
	}

	/**
	* Sets the lkxcg0914 of this vr technical spec_lkxcg.
	*
	* @param LKXCG0914 the lkxcg0914 of this vr technical spec_lkxcg
	*/
	@Override
	public void setLKXCG0914(java.lang.String LKXCG0914) {
		_vrTechnicalSpec_LKXCG.setLKXCG0914(LKXCG0914);
	}

	/**
	* Sets the modify date of this vr technical spec_lkxcg.
	*
	* @param modifyDate the modify date of this vr technical spec_lkxcg
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_LKXCG.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_lkxcg.
	*
	* @param mtCore the mt core of this vr technical spec_lkxcg
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_LKXCG.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_LKXCG.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_lkxcg.
	*
	* @param primaryKey the primary key of this vr technical spec_lkxcg
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_LKXCG.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_LKXCG.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_lkxcg.
	*
	* @param referenceUid the reference uid of this vr technical spec_lkxcg
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_LKXCG.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_lkxcg.
	*
	* @param syncDate the sync date of this vr technical spec_lkxcg
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_LKXCG.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_lkxcg.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_lkxcg
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_LKXCG.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xcg01001 of this vr technical spec_lkxcg.
	*
	* @param XCG01001 the xcg01001 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01001(java.lang.String XCG01001) {
		_vrTechnicalSpec_LKXCG.setXCG01001(XCG01001);
	}

	/**
	* Sets the xcg01002 of this vr technical spec_lkxcg.
	*
	* @param XCG01002 the xcg01002 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01002(java.lang.String XCG01002) {
		_vrTechnicalSpec_LKXCG.setXCG01002(XCG01002);
	}

	/**
	* Sets the xcg01003 of this vr technical spec_lkxcg.
	*
	* @param XCG01003 the xcg01003 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01003(java.lang.String XCG01003) {
		_vrTechnicalSpec_LKXCG.setXCG01003(XCG01003);
	}

	/**
	* Sets the xcg01004 of this vr technical spec_lkxcg.
	*
	* @param XCG01004 the xcg01004 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01004(java.lang.String XCG01004) {
		_vrTechnicalSpec_LKXCG.setXCG01004(XCG01004);
	}

	/**
	* Sets the xcg01005 of this vr technical spec_lkxcg.
	*
	* @param XCG01005 the xcg01005 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01005(java.lang.String XCG01005) {
		_vrTechnicalSpec_LKXCG.setXCG01005(XCG01005);
	}

	/**
	* Sets the xcg01006 of this vr technical spec_lkxcg.
	*
	* @param XCG01006 the xcg01006 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01006(java.lang.String XCG01006) {
		_vrTechnicalSpec_LKXCG.setXCG01006(XCG01006);
	}

	/**
	* Sets the xcg01007 of this vr technical spec_lkxcg.
	*
	* @param XCG01007 the xcg01007 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01007(java.lang.String XCG01007) {
		_vrTechnicalSpec_LKXCG.setXCG01007(XCG01007);
	}

	/**
	* Sets the xcg01008 of this vr technical spec_lkxcg.
	*
	* @param XCG01008 the xcg01008 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01008(java.lang.String XCG01008) {
		_vrTechnicalSpec_LKXCG.setXCG01008(XCG01008);
	}

	/**
	* Sets the xcg01009 of this vr technical spec_lkxcg.
	*
	* @param XCG01009 the xcg01009 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01009(java.lang.String XCG01009) {
		_vrTechnicalSpec_LKXCG.setXCG01009(XCG01009);
	}

	/**
	* Sets the xcg01010 of this vr technical spec_lkxcg.
	*
	* @param XCG01010 the xcg01010 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01010(java.lang.String XCG01010) {
		_vrTechnicalSpec_LKXCG.setXCG01010(XCG01010);
	}

	/**
	* Sets the xcg01011 of this vr technical spec_lkxcg.
	*
	* @param XCG01011 the xcg01011 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01011(java.lang.String XCG01011) {
		_vrTechnicalSpec_LKXCG.setXCG01011(XCG01011);
	}

	/**
	* Sets the xcg01012 of this vr technical spec_lkxcg.
	*
	* @param XCG01012 the xcg01012 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01012(java.lang.String XCG01012) {
		_vrTechnicalSpec_LKXCG.setXCG01012(XCG01012);
	}

	/**
	* Sets the xcg01013 of this vr technical spec_lkxcg.
	*
	* @param XCG01013 the xcg01013 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01013(java.lang.String XCG01013) {
		_vrTechnicalSpec_LKXCG.setXCG01013(XCG01013);
	}

	/**
	* Sets the xcg01014 of this vr technical spec_lkxcg.
	*
	* @param XCG01014 the xcg01014 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01014(java.lang.String XCG01014) {
		_vrTechnicalSpec_LKXCG.setXCG01014(XCG01014);
	}

	/**
	* Sets the xcg01016 of this vr technical spec_lkxcg.
	*
	* @param XCG01016 the xcg01016 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01016(java.lang.String XCG01016) {
		_vrTechnicalSpec_LKXCG.setXCG01016(XCG01016);
	}

	/**
	* Sets the xcg01017 of this vr technical spec_lkxcg.
	*
	* @param XCG01017 the xcg01017 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01017(java.lang.String XCG01017) {
		_vrTechnicalSpec_LKXCG.setXCG01017(XCG01017);
	}

	/**
	* Sets the xcg01019 of this vr technical spec_lkxcg.
	*
	* @param XCG01019 the xcg01019 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01019(java.lang.String XCG01019) {
		_vrTechnicalSpec_LKXCG.setXCG01019(XCG01019);
	}

	/**
	* Sets the xcg01020 of this vr technical spec_lkxcg.
	*
	* @param XCG01020 the xcg01020 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01020(java.lang.String XCG01020) {
		_vrTechnicalSpec_LKXCG.setXCG01020(XCG01020);
	}

	/**
	* Sets the xcg01021 of this vr technical spec_lkxcg.
	*
	* @param XCG01021 the xcg01021 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01021(java.lang.String XCG01021) {
		_vrTechnicalSpec_LKXCG.setXCG01021(XCG01021);
	}

	/**
	* Sets the xcg01022 of this vr technical spec_lkxcg.
	*
	* @param XCG01022 the xcg01022 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01022(java.lang.String XCG01022) {
		_vrTechnicalSpec_LKXCG.setXCG01022(XCG01022);
	}

	/**
	* Sets the xcg01024 of this vr technical spec_lkxcg.
	*
	* @param XCG01024 the xcg01024 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01024(java.lang.String XCG01024) {
		_vrTechnicalSpec_LKXCG.setXCG01024(XCG01024);
	}

	/**
	* Sets the xcg01025 of this vr technical spec_lkxcg.
	*
	* @param XCG01025 the xcg01025 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01025(java.lang.String XCG01025) {
		_vrTechnicalSpec_LKXCG.setXCG01025(XCG01025);
	}

	/**
	* Sets the xcg01026 of this vr technical spec_lkxcg.
	*
	* @param XCG01026 the xcg01026 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01026(java.lang.String XCG01026) {
		_vrTechnicalSpec_LKXCG.setXCG01026(XCG01026);
	}

	/**
	* Sets the xcg01027 of this vr technical spec_lkxcg.
	*
	* @param XCG01027 the xcg01027 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01027(java.lang.String XCG01027) {
		_vrTechnicalSpec_LKXCG.setXCG01027(XCG01027);
	}

	/**
	* Sets the xcg01028 of this vr technical spec_lkxcg.
	*
	* @param XCG01028 the xcg01028 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01028(java.lang.String XCG01028) {
		_vrTechnicalSpec_LKXCG.setXCG01028(XCG01028);
	}

	/**
	* Sets the xcg01030 of this vr technical spec_lkxcg.
	*
	* @param XCG01030 the xcg01030 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01030(java.lang.String XCG01030) {
		_vrTechnicalSpec_LKXCG.setXCG01030(XCG01030);
	}

	/**
	* Sets the xcg01031 of this vr technical spec_lkxcg.
	*
	* @param XCG01031 the xcg01031 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01031(java.lang.String XCG01031) {
		_vrTechnicalSpec_LKXCG.setXCG01031(XCG01031);
	}

	/**
	* Sets the xcg01032 of this vr technical spec_lkxcg.
	*
	* @param XCG01032 the xcg01032 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01032(java.lang.String XCG01032) {
		_vrTechnicalSpec_LKXCG.setXCG01032(XCG01032);
	}

	/**
	* Sets the xcg01033 of this vr technical spec_lkxcg.
	*
	* @param XCG01033 the xcg01033 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01033(java.lang.String XCG01033) {
		_vrTechnicalSpec_LKXCG.setXCG01033(XCG01033);
	}

	/**
	* Sets the xcg01034 of this vr technical spec_lkxcg.
	*
	* @param XCG01034 the xcg01034 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01034(java.lang.String XCG01034) {
		_vrTechnicalSpec_LKXCG.setXCG01034(XCG01034);
	}

	/**
	* Sets the xcg01035 of this vr technical spec_lkxcg.
	*
	* @param XCG01035 the xcg01035 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01035(java.lang.String XCG01035) {
		_vrTechnicalSpec_LKXCG.setXCG01035(XCG01035);
	}

	/**
	* Sets the xcg01036 of this vr technical spec_lkxcg.
	*
	* @param XCG01036 the xcg01036 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01036(java.lang.String XCG01036) {
		_vrTechnicalSpec_LKXCG.setXCG01036(XCG01036);
	}

	/**
	* Sets the xcg01037 of this vr technical spec_lkxcg.
	*
	* @param XCG01037 the xcg01037 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01037(java.lang.String XCG01037) {
		_vrTechnicalSpec_LKXCG.setXCG01037(XCG01037);
	}

	/**
	* Sets the xcg01038 of this vr technical spec_lkxcg.
	*
	* @param XCG01038 the xcg01038 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01038(java.lang.String XCG01038) {
		_vrTechnicalSpec_LKXCG.setXCG01038(XCG01038);
	}

	/**
	* Sets the xcg01039 of this vr technical spec_lkxcg.
	*
	* @param XCG01039 the xcg01039 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01039(java.lang.String XCG01039) {
		_vrTechnicalSpec_LKXCG.setXCG01039(XCG01039);
	}

	/**
	* Sets the xcg01040 of this vr technical spec_lkxcg.
	*
	* @param XCG01040 the xcg01040 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01040(java.lang.String XCG01040) {
		_vrTechnicalSpec_LKXCG.setXCG01040(XCG01040);
	}

	/**
	* Sets the xcg01041 of this vr technical spec_lkxcg.
	*
	* @param XCG01041 the xcg01041 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01041(java.lang.String XCG01041) {
		_vrTechnicalSpec_LKXCG.setXCG01041(XCG01041);
	}

	/**
	* Sets the xcg01042 of this vr technical spec_lkxcg.
	*
	* @param XCG01042 the xcg01042 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01042(java.lang.String XCG01042) {
		_vrTechnicalSpec_LKXCG.setXCG01042(XCG01042);
	}

	/**
	* Sets the xcg01043 of this vr technical spec_lkxcg.
	*
	* @param XCG01043 the xcg01043 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01043(java.lang.String XCG01043) {
		_vrTechnicalSpec_LKXCG.setXCG01043(XCG01043);
	}

	/**
	* Sets the xcg01044 of this vr technical spec_lkxcg.
	*
	* @param XCG01044 the xcg01044 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01044(java.lang.String XCG01044) {
		_vrTechnicalSpec_LKXCG.setXCG01044(XCG01044);
	}

	/**
	* Sets the xcg01045 of this vr technical spec_lkxcg.
	*
	* @param XCG01045 the xcg01045 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01045(java.lang.String XCG01045) {
		_vrTechnicalSpec_LKXCG.setXCG01045(XCG01045);
	}

	/**
	* Sets the xcg01046 of this vr technical spec_lkxcg.
	*
	* @param XCG01046 the xcg01046 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01046(java.lang.String XCG01046) {
		_vrTechnicalSpec_LKXCG.setXCG01046(XCG01046);
	}

	/**
	* Sets the xcg01047 of this vr technical spec_lkxcg.
	*
	* @param XCG01047 the xcg01047 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01047(java.lang.String XCG01047) {
		_vrTechnicalSpec_LKXCG.setXCG01047(XCG01047);
	}

	/**
	* Sets the xcg01049 of this vr technical spec_lkxcg.
	*
	* @param XCG01049 the xcg01049 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01049(java.lang.String XCG01049) {
		_vrTechnicalSpec_LKXCG.setXCG01049(XCG01049);
	}

	/**
	* Sets the xcg01050 of this vr technical spec_lkxcg.
	*
	* @param XCG01050 the xcg01050 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01050(java.lang.String XCG01050) {
		_vrTechnicalSpec_LKXCG.setXCG01050(XCG01050);
	}

	/**
	* Sets the xcg01051 of this vr technical spec_lkxcg.
	*
	* @param XCG01051 the xcg01051 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01051(java.lang.String XCG01051) {
		_vrTechnicalSpec_LKXCG.setXCG01051(XCG01051);
	}

	/**
	* Sets the xcg01052 of this vr technical spec_lkxcg.
	*
	* @param XCG01052 the xcg01052 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01052(java.lang.String XCG01052) {
		_vrTechnicalSpec_LKXCG.setXCG01052(XCG01052);
	}

	/**
	* Sets the xcg01053 of this vr technical spec_lkxcg.
	*
	* @param XCG01053 the xcg01053 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01053(java.lang.String XCG01053) {
		_vrTechnicalSpec_LKXCG.setXCG01053(XCG01053);
	}

	/**
	* Sets the xcg01054 of this vr technical spec_lkxcg.
	*
	* @param XCG01054 the xcg01054 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01054(java.lang.String XCG01054) {
		_vrTechnicalSpec_LKXCG.setXCG01054(XCG01054);
	}

	/**
	* Sets the xcg01055 of this vr technical spec_lkxcg.
	*
	* @param XCG01055 the xcg01055 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01055(java.lang.String XCG01055) {
		_vrTechnicalSpec_LKXCG.setXCG01055(XCG01055);
	}

	/**
	* Sets the xcg01056 of this vr technical spec_lkxcg.
	*
	* @param XCG01056 the xcg01056 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01056(java.lang.String XCG01056) {
		_vrTechnicalSpec_LKXCG.setXCG01056(XCG01056);
	}

	/**
	* Sets the xcg01057 of this vr technical spec_lkxcg.
	*
	* @param XCG01057 the xcg01057 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01057(java.lang.String XCG01057) {
		_vrTechnicalSpec_LKXCG.setXCG01057(XCG01057);
	}

	/**
	* Sets the xcg01058 of this vr technical spec_lkxcg.
	*
	* @param XCG01058 the xcg01058 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01058(java.lang.String XCG01058) {
		_vrTechnicalSpec_LKXCG.setXCG01058(XCG01058);
	}

	/**
	* Sets the xcg01059 of this vr technical spec_lkxcg.
	*
	* @param XCG01059 the xcg01059 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01059(java.lang.String XCG01059) {
		_vrTechnicalSpec_LKXCG.setXCG01059(XCG01059);
	}

	/**
	* Sets the xcg01060 of this vr technical spec_lkxcg.
	*
	* @param XCG01060 the xcg01060 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01060(java.lang.String XCG01060) {
		_vrTechnicalSpec_LKXCG.setXCG01060(XCG01060);
	}

	/**
	* Sets the xcg01062 of this vr technical spec_lkxcg.
	*
	* @param XCG01062 the xcg01062 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01062(java.lang.String XCG01062) {
		_vrTechnicalSpec_LKXCG.setXCG01062(XCG01062);
	}

	/**
	* Sets the xcg01063 of this vr technical spec_lkxcg.
	*
	* @param XCG01063 the xcg01063 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01063(java.lang.String XCG01063) {
		_vrTechnicalSpec_LKXCG.setXCG01063(XCG01063);
	}

	/**
	* Sets the xcg01064 of this vr technical spec_lkxcg.
	*
	* @param XCG01064 the xcg01064 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01064(java.lang.String XCG01064) {
		_vrTechnicalSpec_LKXCG.setXCG01064(XCG01064);
	}

	/**
	* Sets the xcg01065 of this vr technical spec_lkxcg.
	*
	* @param XCG01065 the xcg01065 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01065(java.lang.String XCG01065) {
		_vrTechnicalSpec_LKXCG.setXCG01065(XCG01065);
	}

	/**
	* Sets the xcg01066 of this vr technical spec_lkxcg.
	*
	* @param XCG01066 the xcg01066 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01066(java.lang.String XCG01066) {
		_vrTechnicalSpec_LKXCG.setXCG01066(XCG01066);
	}

	/**
	* Sets the xcg01067 of this vr technical spec_lkxcg.
	*
	* @param XCG01067 the xcg01067 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01067(java.lang.String XCG01067) {
		_vrTechnicalSpec_LKXCG.setXCG01067(XCG01067);
	}

	/**
	* Sets the xcg01068 of this vr technical spec_lkxcg.
	*
	* @param XCG01068 the xcg01068 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01068(java.lang.String XCG01068) {
		_vrTechnicalSpec_LKXCG.setXCG01068(XCG01068);
	}

	/**
	* Sets the xcg01069 of this vr technical spec_lkxcg.
	*
	* @param XCG01069 the xcg01069 of this vr technical spec_lkxcg
	*/
	@Override
	public void setXCG01069(java.lang.String XCG01069) {
		_vrTechnicalSpec_LKXCG.setXCG01069(XCG01069);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_LKXCGWrapper)) {
			return false;
		}

		VRTechnicalSpec_LKXCGWrapper vrTechnicalSpec_LKXCGWrapper = (VRTechnicalSpec_LKXCGWrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_LKXCG,
					vrTechnicalSpec_LKXCGWrapper._vrTechnicalSpec_LKXCG)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_LKXCG getWrappedModel() {
		return _vrTechnicalSpec_LKXCG;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_LKXCG.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_LKXCG.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_LKXCG.resetOriginalValues();
	}

	private final VRTechnicalSpec_LKXCG _vrTechnicalSpec_LKXCG;
}