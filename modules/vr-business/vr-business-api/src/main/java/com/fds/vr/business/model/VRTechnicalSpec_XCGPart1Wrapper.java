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
 * This class is a wrapper for {@link VRTechnicalSpec_XCGPart1}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart1
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart1Wrapper implements VRTechnicalSpec_XCGPart1,
	ModelWrapper<VRTechnicalSpec_XCGPart1> {
	public VRTechnicalSpec_XCGPart1Wrapper(
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1) {
		_vrTechnicalSpec_XCGPart1 = vrTechnicalSpec_XCGPart1;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XCGPart1.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XCGPart1.class.getName();
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
		attributes.put("loai_dong_co", getLoai_dong_co());
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
		attributes.put("XCG01070", getXCG01070());
		attributes.put("XCG01072", getXCG01072());
		attributes.put("XCG01073", getXCG01073());
		attributes.put("XCG01074", getXCG01074());
		attributes.put("XCG01075", getXCG01075());
		attributes.put("XCG01076", getXCG01076());
		attributes.put("XCG01077", getXCG01077());
		attributes.put("XCG01078", getXCG01078());
		attributes.put("XCG01079", getXCG01079());
		attributes.put("XCG01080", getXCG01080());
		attributes.put("XCG01081", getXCG01081());
		attributes.put("XCG01082", getXCG01082());
		attributes.put("XCG01083", getXCG01083());
		attributes.put("XCG01084", getXCG01084());
		attributes.put("XCG01085", getXCG01085());
		attributes.put("XCG01086", getXCG01086());
		attributes.put("XCG01087", getXCG01087());
		attributes.put("XCG01088", getXCG01088());
		attributes.put("XCG01089", getXCG01089());
		attributes.put("XCG01090", getXCG01090());
		attributes.put("XCG01091", getXCG01091());
		attributes.put("XCG01092", getXCG01092());
		attributes.put("XCG01093", getXCG01093());
		attributes.put("XCG01094", getXCG01094());
		attributes.put("XCG01095", getXCG01095());
		attributes.put("XCG01096", getXCG01096());
		attributes.put("XCG01097", getXCG01097());
		attributes.put("XCG01098", getXCG01098());
		attributes.put("XCG01099", getXCG01099());
		attributes.put("XCG01100", getXCG01100());
		attributes.put("XCG01101", getXCG01101());
		attributes.put("XCG01102", getXCG01102());
		attributes.put("XCG01103", getXCG01103());
		attributes.put("XCG01104", getXCG01104());
		attributes.put("XCG01105", getXCG01105());
		attributes.put("XCG01106", getXCG01106());
		attributes.put("XCG01107", getXCG01107());
		attributes.put("XCG01108", getXCG01108());
		attributes.put("XCG01109", getXCG01109());
		attributes.put("XCG01110", getXCG01110());
		attributes.put("XCG01111", getXCG01111());
		attributes.put("XCG01112", getXCG01112());
		attributes.put("XCG01113", getXCG01113());
		attributes.put("XCG01114", getXCG01114());
		attributes.put("XCG01115", getXCG01115());
		attributes.put("XCG01116", getXCG01116());
		attributes.put("XCG01117", getXCG01117());
		attributes.put("XCG01118", getXCG01118());
		attributes.put("XCG01119", getXCG01119());
		attributes.put("XCG01120", getXCG01120());
		attributes.put("XCG01121", getXCG01121());
		attributes.put("XCG01122", getXCG01122());
		attributes.put("XCG01123", getXCG01123());
		attributes.put("XCG01124", getXCG01124());
		attributes.put("XCG01125", getXCG01125());
		attributes.put("XCG01126", getXCG01126());
		attributes.put("XCG01127", getXCG01127());
		attributes.put("XCG01128", getXCG01128());
		attributes.put("XCG01129", getXCG01129());
		attributes.put("XCG01130", getXCG01130());
		attributes.put("XCG01131", getXCG01131());
		attributes.put("XCG01132", getXCG01132());
		attributes.put("XCG01133", getXCG01133());
		attributes.put("XCG01134", getXCG01134());
		attributes.put("XCG01135", getXCG01135());
		attributes.put("XCG01136", getXCG01136());
		attributes.put("XCG01137", getXCG01137());
		attributes.put("XCG01138", getXCG01138());
		attributes.put("XCG01139", getXCG01139());
		attributes.put("XCG01140", getXCG01140());
		attributes.put("XCG01141", getXCG01141());
		attributes.put("XCG01142", getXCG01142());
		attributes.put("XCG01143", getXCG01143());
		attributes.put("XCG01144", getXCG01144());
		attributes.put("XCG01145", getXCG01145());
		attributes.put("XCG01146", getXCG01146());
		attributes.put("XCG01147", getXCG01147());
		attributes.put("XCG01148", getXCG01148());
		attributes.put("XCG01149", getXCG01149());
		attributes.put("XCG01150", getXCG01150());
		attributes.put("XCG01151", getXCG01151());
		attributes.put("XCG01152", getXCG01152());
		attributes.put("XCG01153", getXCG01153());
		attributes.put("XCG01154", getXCG01154());
		attributes.put("XCG01155", getXCG01155());
		attributes.put("XCG01156", getXCG01156());
		attributes.put("XCG01157", getXCG01157());
		attributes.put("XCG01158", getXCG01158());
		attributes.put("XCG01159", getXCG01159());
		attributes.put("XCG01160", getXCG01160());
		attributes.put("XCG01161", getXCG01161());
		attributes.put("XCG01162", getXCG01162());
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

		String loai_dong_co = (String)attributes.get("loai_dong_co");

		if (loai_dong_co != null) {
			setLoai_dong_co(loai_dong_co);
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

		String XCG01070 = (String)attributes.get("XCG01070");

		if (XCG01070 != null) {
			setXCG01070(XCG01070);
		}

		String XCG01072 = (String)attributes.get("XCG01072");

		if (XCG01072 != null) {
			setXCG01072(XCG01072);
		}

		String XCG01073 = (String)attributes.get("XCG01073");

		if (XCG01073 != null) {
			setXCG01073(XCG01073);
		}

		String XCG01074 = (String)attributes.get("XCG01074");

		if (XCG01074 != null) {
			setXCG01074(XCG01074);
		}

		String XCG01075 = (String)attributes.get("XCG01075");

		if (XCG01075 != null) {
			setXCG01075(XCG01075);
		}

		String XCG01076 = (String)attributes.get("XCG01076");

		if (XCG01076 != null) {
			setXCG01076(XCG01076);
		}

		String XCG01077 = (String)attributes.get("XCG01077");

		if (XCG01077 != null) {
			setXCG01077(XCG01077);
		}

		String XCG01078 = (String)attributes.get("XCG01078");

		if (XCG01078 != null) {
			setXCG01078(XCG01078);
		}

		String XCG01079 = (String)attributes.get("XCG01079");

		if (XCG01079 != null) {
			setXCG01079(XCG01079);
		}

		String XCG01080 = (String)attributes.get("XCG01080");

		if (XCG01080 != null) {
			setXCG01080(XCG01080);
		}

		String XCG01081 = (String)attributes.get("XCG01081");

		if (XCG01081 != null) {
			setXCG01081(XCG01081);
		}

		String XCG01082 = (String)attributes.get("XCG01082");

		if (XCG01082 != null) {
			setXCG01082(XCG01082);
		}

		String XCG01083 = (String)attributes.get("XCG01083");

		if (XCG01083 != null) {
			setXCG01083(XCG01083);
		}

		String XCG01084 = (String)attributes.get("XCG01084");

		if (XCG01084 != null) {
			setXCG01084(XCG01084);
		}

		String XCG01085 = (String)attributes.get("XCG01085");

		if (XCG01085 != null) {
			setXCG01085(XCG01085);
		}

		String XCG01086 = (String)attributes.get("XCG01086");

		if (XCG01086 != null) {
			setXCG01086(XCG01086);
		}

		String XCG01087 = (String)attributes.get("XCG01087");

		if (XCG01087 != null) {
			setXCG01087(XCG01087);
		}

		String XCG01088 = (String)attributes.get("XCG01088");

		if (XCG01088 != null) {
			setXCG01088(XCG01088);
		}

		String XCG01089 = (String)attributes.get("XCG01089");

		if (XCG01089 != null) {
			setXCG01089(XCG01089);
		}

		String XCG01090 = (String)attributes.get("XCG01090");

		if (XCG01090 != null) {
			setXCG01090(XCG01090);
		}

		String XCG01091 = (String)attributes.get("XCG01091");

		if (XCG01091 != null) {
			setXCG01091(XCG01091);
		}

		String XCG01092 = (String)attributes.get("XCG01092");

		if (XCG01092 != null) {
			setXCG01092(XCG01092);
		}

		String XCG01093 = (String)attributes.get("XCG01093");

		if (XCG01093 != null) {
			setXCG01093(XCG01093);
		}

		String XCG01094 = (String)attributes.get("XCG01094");

		if (XCG01094 != null) {
			setXCG01094(XCG01094);
		}

		String XCG01095 = (String)attributes.get("XCG01095");

		if (XCG01095 != null) {
			setXCG01095(XCG01095);
		}

		String XCG01096 = (String)attributes.get("XCG01096");

		if (XCG01096 != null) {
			setXCG01096(XCG01096);
		}

		String XCG01097 = (String)attributes.get("XCG01097");

		if (XCG01097 != null) {
			setXCG01097(XCG01097);
		}

		String XCG01098 = (String)attributes.get("XCG01098");

		if (XCG01098 != null) {
			setXCG01098(XCG01098);
		}

		String XCG01099 = (String)attributes.get("XCG01099");

		if (XCG01099 != null) {
			setXCG01099(XCG01099);
		}

		String XCG01100 = (String)attributes.get("XCG01100");

		if (XCG01100 != null) {
			setXCG01100(XCG01100);
		}

		String XCG01101 = (String)attributes.get("XCG01101");

		if (XCG01101 != null) {
			setXCG01101(XCG01101);
		}

		String XCG01102 = (String)attributes.get("XCG01102");

		if (XCG01102 != null) {
			setXCG01102(XCG01102);
		}

		String XCG01103 = (String)attributes.get("XCG01103");

		if (XCG01103 != null) {
			setXCG01103(XCG01103);
		}

		String XCG01104 = (String)attributes.get("XCG01104");

		if (XCG01104 != null) {
			setXCG01104(XCG01104);
		}

		String XCG01105 = (String)attributes.get("XCG01105");

		if (XCG01105 != null) {
			setXCG01105(XCG01105);
		}

		String XCG01106 = (String)attributes.get("XCG01106");

		if (XCG01106 != null) {
			setXCG01106(XCG01106);
		}

		String XCG01107 = (String)attributes.get("XCG01107");

		if (XCG01107 != null) {
			setXCG01107(XCG01107);
		}

		String XCG01108 = (String)attributes.get("XCG01108");

		if (XCG01108 != null) {
			setXCG01108(XCG01108);
		}

		String XCG01109 = (String)attributes.get("XCG01109");

		if (XCG01109 != null) {
			setXCG01109(XCG01109);
		}

		String XCG01110 = (String)attributes.get("XCG01110");

		if (XCG01110 != null) {
			setXCG01110(XCG01110);
		}

		String XCG01111 = (String)attributes.get("XCG01111");

		if (XCG01111 != null) {
			setXCG01111(XCG01111);
		}

		String XCG01112 = (String)attributes.get("XCG01112");

		if (XCG01112 != null) {
			setXCG01112(XCG01112);
		}

		String XCG01113 = (String)attributes.get("XCG01113");

		if (XCG01113 != null) {
			setXCG01113(XCG01113);
		}

		String XCG01114 = (String)attributes.get("XCG01114");

		if (XCG01114 != null) {
			setXCG01114(XCG01114);
		}

		String XCG01115 = (String)attributes.get("XCG01115");

		if (XCG01115 != null) {
			setXCG01115(XCG01115);
		}

		String XCG01116 = (String)attributes.get("XCG01116");

		if (XCG01116 != null) {
			setXCG01116(XCG01116);
		}

		String XCG01117 = (String)attributes.get("XCG01117");

		if (XCG01117 != null) {
			setXCG01117(XCG01117);
		}

		String XCG01118 = (String)attributes.get("XCG01118");

		if (XCG01118 != null) {
			setXCG01118(XCG01118);
		}

		String XCG01119 = (String)attributes.get("XCG01119");

		if (XCG01119 != null) {
			setXCG01119(XCG01119);
		}

		String XCG01120 = (String)attributes.get("XCG01120");

		if (XCG01120 != null) {
			setXCG01120(XCG01120);
		}

		String XCG01121 = (String)attributes.get("XCG01121");

		if (XCG01121 != null) {
			setXCG01121(XCG01121);
		}

		String XCG01122 = (String)attributes.get("XCG01122");

		if (XCG01122 != null) {
			setXCG01122(XCG01122);
		}

		String XCG01123 = (String)attributes.get("XCG01123");

		if (XCG01123 != null) {
			setXCG01123(XCG01123);
		}

		String XCG01124 = (String)attributes.get("XCG01124");

		if (XCG01124 != null) {
			setXCG01124(XCG01124);
		}

		String XCG01125 = (String)attributes.get("XCG01125");

		if (XCG01125 != null) {
			setXCG01125(XCG01125);
		}

		String XCG01126 = (String)attributes.get("XCG01126");

		if (XCG01126 != null) {
			setXCG01126(XCG01126);
		}

		String XCG01127 = (String)attributes.get("XCG01127");

		if (XCG01127 != null) {
			setXCG01127(XCG01127);
		}

		String XCG01128 = (String)attributes.get("XCG01128");

		if (XCG01128 != null) {
			setXCG01128(XCG01128);
		}

		String XCG01129 = (String)attributes.get("XCG01129");

		if (XCG01129 != null) {
			setXCG01129(XCG01129);
		}

		String XCG01130 = (String)attributes.get("XCG01130");

		if (XCG01130 != null) {
			setXCG01130(XCG01130);
		}

		String XCG01131 = (String)attributes.get("XCG01131");

		if (XCG01131 != null) {
			setXCG01131(XCG01131);
		}

		String XCG01132 = (String)attributes.get("XCG01132");

		if (XCG01132 != null) {
			setXCG01132(XCG01132);
		}

		String XCG01133 = (String)attributes.get("XCG01133");

		if (XCG01133 != null) {
			setXCG01133(XCG01133);
		}

		String XCG01134 = (String)attributes.get("XCG01134");

		if (XCG01134 != null) {
			setXCG01134(XCG01134);
		}

		String XCG01135 = (String)attributes.get("XCG01135");

		if (XCG01135 != null) {
			setXCG01135(XCG01135);
		}

		String XCG01136 = (String)attributes.get("XCG01136");

		if (XCG01136 != null) {
			setXCG01136(XCG01136);
		}

		String XCG01137 = (String)attributes.get("XCG01137");

		if (XCG01137 != null) {
			setXCG01137(XCG01137);
		}

		String XCG01138 = (String)attributes.get("XCG01138");

		if (XCG01138 != null) {
			setXCG01138(XCG01138);
		}

		String XCG01139 = (String)attributes.get("XCG01139");

		if (XCG01139 != null) {
			setXCG01139(XCG01139);
		}

		String XCG01140 = (String)attributes.get("XCG01140");

		if (XCG01140 != null) {
			setXCG01140(XCG01140);
		}

		String XCG01141 = (String)attributes.get("XCG01141");

		if (XCG01141 != null) {
			setXCG01141(XCG01141);
		}

		String XCG01142 = (String)attributes.get("XCG01142");

		if (XCG01142 != null) {
			setXCG01142(XCG01142);
		}

		String XCG01143 = (String)attributes.get("XCG01143");

		if (XCG01143 != null) {
			setXCG01143(XCG01143);
		}

		String XCG01144 = (String)attributes.get("XCG01144");

		if (XCG01144 != null) {
			setXCG01144(XCG01144);
		}

		String XCG01145 = (String)attributes.get("XCG01145");

		if (XCG01145 != null) {
			setXCG01145(XCG01145);
		}

		String XCG01146 = (String)attributes.get("XCG01146");

		if (XCG01146 != null) {
			setXCG01146(XCG01146);
		}

		String XCG01147 = (String)attributes.get("XCG01147");

		if (XCG01147 != null) {
			setXCG01147(XCG01147);
		}

		String XCG01148 = (String)attributes.get("XCG01148");

		if (XCG01148 != null) {
			setXCG01148(XCG01148);
		}

		String XCG01149 = (String)attributes.get("XCG01149");

		if (XCG01149 != null) {
			setXCG01149(XCG01149);
		}

		String XCG01150 = (String)attributes.get("XCG01150");

		if (XCG01150 != null) {
			setXCG01150(XCG01150);
		}

		String XCG01151 = (String)attributes.get("XCG01151");

		if (XCG01151 != null) {
			setXCG01151(XCG01151);
		}

		String XCG01152 = (String)attributes.get("XCG01152");

		if (XCG01152 != null) {
			setXCG01152(XCG01152);
		}

		String XCG01153 = (String)attributes.get("XCG01153");

		if (XCG01153 != null) {
			setXCG01153(XCG01153);
		}

		String XCG01154 = (String)attributes.get("XCG01154");

		if (XCG01154 != null) {
			setXCG01154(XCG01154);
		}

		String XCG01155 = (String)attributes.get("XCG01155");

		if (XCG01155 != null) {
			setXCG01155(XCG01155);
		}

		String XCG01156 = (String)attributes.get("XCG01156");

		if (XCG01156 != null) {
			setXCG01156(XCG01156);
		}

		String XCG01157 = (String)attributes.get("XCG01157");

		if (XCG01157 != null) {
			setXCG01157(XCG01157);
		}

		String XCG01158 = (String)attributes.get("XCG01158");

		if (XCG01158 != null) {
			setXCG01158(XCG01158);
		}

		String XCG01159 = (String)attributes.get("XCG01159");

		if (XCG01159 != null) {
			setXCG01159(XCG01159);
		}

		String XCG01160 = (String)attributes.get("XCG01160");

		if (XCG01160 != null) {
			setXCG01160(XCG01160);
		}

		String XCG01161 = (String)attributes.get("XCG01161");

		if (XCG01161 != null) {
			setXCG01161(XCG01161);
		}

		String XCG01162 = (String)attributes.get("XCG01162");

		if (XCG01162 != null) {
			setXCG01162(XCG01162);
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
	public VRTechnicalSpec_XCGPart1 toEscapedModel() {
		return new VRTechnicalSpec_XCGPart1Wrapper(_vrTechnicalSpec_XCGPart1.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XCGPart1 toUnescapedModel() {
		return new VRTechnicalSpec_XCGPart1Wrapper(_vrTechnicalSpec_XCGPart1.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XCGPart1.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XCGPart1.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XCGPart1.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XCGPart1.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XCGPart1> toCacheModel() {
		return _vrTechnicalSpec_XCGPart1.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1) {
		return _vrTechnicalSpec_XCGPart1.compareTo(vrTechnicalSpec_XCGPart1);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XCGPart1.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XCGPart1.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XCGPart1Wrapper((VRTechnicalSpec_XCGPart1)_vrTechnicalSpec_XCGPart1.clone());
	}

	/**
	* Returns the deliverable code of this vr technical spec_xcg part1.
	*
	* @return the deliverable code of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XCGPart1.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xcg part1.
	*
	* @return the dossier ID ctn of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XCGPart1.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xcg part1.
	*
	* @return the dossier no of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XCGPart1.getDossierNo();
	}

	/**
	* Returns the loai_dong_co of this vr technical spec_xcg part1.
	*
	* @return the loai_dong_co of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getLoai_dong_co() {
		return _vrTechnicalSpec_XCGPart1.getLoai_dong_co();
	}

	/**
	* Returns the reference uid of this vr technical spec_xcg part1.
	*
	* @return the reference uid of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XCGPart1.getReferenceUid();
	}

	/**
	* Returns the xcg01001 of this vr technical spec_xcg part1.
	*
	* @return the xcg01001 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01001() {
		return _vrTechnicalSpec_XCGPart1.getXCG01001();
	}

	/**
	* Returns the xcg01002 of this vr technical spec_xcg part1.
	*
	* @return the xcg01002 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01002() {
		return _vrTechnicalSpec_XCGPart1.getXCG01002();
	}

	/**
	* Returns the xcg01003 of this vr technical spec_xcg part1.
	*
	* @return the xcg01003 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01003() {
		return _vrTechnicalSpec_XCGPart1.getXCG01003();
	}

	/**
	* Returns the xcg01004 of this vr technical spec_xcg part1.
	*
	* @return the xcg01004 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01004() {
		return _vrTechnicalSpec_XCGPart1.getXCG01004();
	}

	/**
	* Returns the xcg01005 of this vr technical spec_xcg part1.
	*
	* @return the xcg01005 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01005() {
		return _vrTechnicalSpec_XCGPart1.getXCG01005();
	}

	/**
	* Returns the xcg01006 of this vr technical spec_xcg part1.
	*
	* @return the xcg01006 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01006() {
		return _vrTechnicalSpec_XCGPart1.getXCG01006();
	}

	/**
	* Returns the xcg01007 of this vr technical spec_xcg part1.
	*
	* @return the xcg01007 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01007() {
		return _vrTechnicalSpec_XCGPart1.getXCG01007();
	}

	/**
	* Returns the xcg01008 of this vr technical spec_xcg part1.
	*
	* @return the xcg01008 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01008() {
		return _vrTechnicalSpec_XCGPart1.getXCG01008();
	}

	/**
	* Returns the xcg01009 of this vr technical spec_xcg part1.
	*
	* @return the xcg01009 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01009() {
		return _vrTechnicalSpec_XCGPart1.getXCG01009();
	}

	/**
	* Returns the xcg01010 of this vr technical spec_xcg part1.
	*
	* @return the xcg01010 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01010() {
		return _vrTechnicalSpec_XCGPart1.getXCG01010();
	}

	/**
	* Returns the xcg01011 of this vr technical spec_xcg part1.
	*
	* @return the xcg01011 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01011() {
		return _vrTechnicalSpec_XCGPart1.getXCG01011();
	}

	/**
	* Returns the xcg01012 of this vr technical spec_xcg part1.
	*
	* @return the xcg01012 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01012() {
		return _vrTechnicalSpec_XCGPart1.getXCG01012();
	}

	/**
	* Returns the xcg01013 of this vr technical spec_xcg part1.
	*
	* @return the xcg01013 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01013() {
		return _vrTechnicalSpec_XCGPart1.getXCG01013();
	}

	/**
	* Returns the xcg01014 of this vr technical spec_xcg part1.
	*
	* @return the xcg01014 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01014() {
		return _vrTechnicalSpec_XCGPart1.getXCG01014();
	}

	/**
	* Returns the xcg01016 of this vr technical spec_xcg part1.
	*
	* @return the xcg01016 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01016() {
		return _vrTechnicalSpec_XCGPart1.getXCG01016();
	}

	/**
	* Returns the xcg01017 of this vr technical spec_xcg part1.
	*
	* @return the xcg01017 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01017() {
		return _vrTechnicalSpec_XCGPart1.getXCG01017();
	}

	/**
	* Returns the xcg01019 of this vr technical spec_xcg part1.
	*
	* @return the xcg01019 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01019() {
		return _vrTechnicalSpec_XCGPart1.getXCG01019();
	}

	/**
	* Returns the xcg01020 of this vr technical spec_xcg part1.
	*
	* @return the xcg01020 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01020() {
		return _vrTechnicalSpec_XCGPart1.getXCG01020();
	}

	/**
	* Returns the xcg01021 of this vr technical spec_xcg part1.
	*
	* @return the xcg01021 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01021() {
		return _vrTechnicalSpec_XCGPart1.getXCG01021();
	}

	/**
	* Returns the xcg01022 of this vr technical spec_xcg part1.
	*
	* @return the xcg01022 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01022() {
		return _vrTechnicalSpec_XCGPart1.getXCG01022();
	}

	/**
	* Returns the xcg01024 of this vr technical spec_xcg part1.
	*
	* @return the xcg01024 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01024() {
		return _vrTechnicalSpec_XCGPart1.getXCG01024();
	}

	/**
	* Returns the xcg01025 of this vr technical spec_xcg part1.
	*
	* @return the xcg01025 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01025() {
		return _vrTechnicalSpec_XCGPart1.getXCG01025();
	}

	/**
	* Returns the xcg01026 of this vr technical spec_xcg part1.
	*
	* @return the xcg01026 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01026() {
		return _vrTechnicalSpec_XCGPart1.getXCG01026();
	}

	/**
	* Returns the xcg01027 of this vr technical spec_xcg part1.
	*
	* @return the xcg01027 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01027() {
		return _vrTechnicalSpec_XCGPart1.getXCG01027();
	}

	/**
	* Returns the xcg01028 of this vr technical spec_xcg part1.
	*
	* @return the xcg01028 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01028() {
		return _vrTechnicalSpec_XCGPart1.getXCG01028();
	}

	/**
	* Returns the xcg01030 of this vr technical spec_xcg part1.
	*
	* @return the xcg01030 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01030() {
		return _vrTechnicalSpec_XCGPart1.getXCG01030();
	}

	/**
	* Returns the xcg01031 of this vr technical spec_xcg part1.
	*
	* @return the xcg01031 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01031() {
		return _vrTechnicalSpec_XCGPart1.getXCG01031();
	}

	/**
	* Returns the xcg01032 of this vr technical spec_xcg part1.
	*
	* @return the xcg01032 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01032() {
		return _vrTechnicalSpec_XCGPart1.getXCG01032();
	}

	/**
	* Returns the xcg01033 of this vr technical spec_xcg part1.
	*
	* @return the xcg01033 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01033() {
		return _vrTechnicalSpec_XCGPart1.getXCG01033();
	}

	/**
	* Returns the xcg01034 of this vr technical spec_xcg part1.
	*
	* @return the xcg01034 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01034() {
		return _vrTechnicalSpec_XCGPart1.getXCG01034();
	}

	/**
	* Returns the xcg01035 of this vr technical spec_xcg part1.
	*
	* @return the xcg01035 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01035() {
		return _vrTechnicalSpec_XCGPart1.getXCG01035();
	}

	/**
	* Returns the xcg01036 of this vr technical spec_xcg part1.
	*
	* @return the xcg01036 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01036() {
		return _vrTechnicalSpec_XCGPart1.getXCG01036();
	}

	/**
	* Returns the xcg01037 of this vr technical spec_xcg part1.
	*
	* @return the xcg01037 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01037() {
		return _vrTechnicalSpec_XCGPart1.getXCG01037();
	}

	/**
	* Returns the xcg01038 of this vr technical spec_xcg part1.
	*
	* @return the xcg01038 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01038() {
		return _vrTechnicalSpec_XCGPart1.getXCG01038();
	}

	/**
	* Returns the xcg01039 of this vr technical spec_xcg part1.
	*
	* @return the xcg01039 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01039() {
		return _vrTechnicalSpec_XCGPart1.getXCG01039();
	}

	/**
	* Returns the xcg01040 of this vr technical spec_xcg part1.
	*
	* @return the xcg01040 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01040() {
		return _vrTechnicalSpec_XCGPart1.getXCG01040();
	}

	/**
	* Returns the xcg01041 of this vr technical spec_xcg part1.
	*
	* @return the xcg01041 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01041() {
		return _vrTechnicalSpec_XCGPart1.getXCG01041();
	}

	/**
	* Returns the xcg01042 of this vr technical spec_xcg part1.
	*
	* @return the xcg01042 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01042() {
		return _vrTechnicalSpec_XCGPart1.getXCG01042();
	}

	/**
	* Returns the xcg01043 of this vr technical spec_xcg part1.
	*
	* @return the xcg01043 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01043() {
		return _vrTechnicalSpec_XCGPart1.getXCG01043();
	}

	/**
	* Returns the xcg01044 of this vr technical spec_xcg part1.
	*
	* @return the xcg01044 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01044() {
		return _vrTechnicalSpec_XCGPart1.getXCG01044();
	}

	/**
	* Returns the xcg01045 of this vr technical spec_xcg part1.
	*
	* @return the xcg01045 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01045() {
		return _vrTechnicalSpec_XCGPart1.getXCG01045();
	}

	/**
	* Returns the xcg01046 of this vr technical spec_xcg part1.
	*
	* @return the xcg01046 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01046() {
		return _vrTechnicalSpec_XCGPart1.getXCG01046();
	}

	/**
	* Returns the xcg01047 of this vr technical spec_xcg part1.
	*
	* @return the xcg01047 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01047() {
		return _vrTechnicalSpec_XCGPart1.getXCG01047();
	}

	/**
	* Returns the xcg01049 of this vr technical spec_xcg part1.
	*
	* @return the xcg01049 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01049() {
		return _vrTechnicalSpec_XCGPart1.getXCG01049();
	}

	/**
	* Returns the xcg01050 of this vr technical spec_xcg part1.
	*
	* @return the xcg01050 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01050() {
		return _vrTechnicalSpec_XCGPart1.getXCG01050();
	}

	/**
	* Returns the xcg01051 of this vr technical spec_xcg part1.
	*
	* @return the xcg01051 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01051() {
		return _vrTechnicalSpec_XCGPart1.getXCG01051();
	}

	/**
	* Returns the xcg01052 of this vr technical spec_xcg part1.
	*
	* @return the xcg01052 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01052() {
		return _vrTechnicalSpec_XCGPart1.getXCG01052();
	}

	/**
	* Returns the xcg01053 of this vr technical spec_xcg part1.
	*
	* @return the xcg01053 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01053() {
		return _vrTechnicalSpec_XCGPart1.getXCG01053();
	}

	/**
	* Returns the xcg01054 of this vr technical spec_xcg part1.
	*
	* @return the xcg01054 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01054() {
		return _vrTechnicalSpec_XCGPart1.getXCG01054();
	}

	/**
	* Returns the xcg01055 of this vr technical spec_xcg part1.
	*
	* @return the xcg01055 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01055() {
		return _vrTechnicalSpec_XCGPart1.getXCG01055();
	}

	/**
	* Returns the xcg01056 of this vr technical spec_xcg part1.
	*
	* @return the xcg01056 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01056() {
		return _vrTechnicalSpec_XCGPart1.getXCG01056();
	}

	/**
	* Returns the xcg01057 of this vr technical spec_xcg part1.
	*
	* @return the xcg01057 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01057() {
		return _vrTechnicalSpec_XCGPart1.getXCG01057();
	}

	/**
	* Returns the xcg01058 of this vr technical spec_xcg part1.
	*
	* @return the xcg01058 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01058() {
		return _vrTechnicalSpec_XCGPart1.getXCG01058();
	}

	/**
	* Returns the xcg01059 of this vr technical spec_xcg part1.
	*
	* @return the xcg01059 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01059() {
		return _vrTechnicalSpec_XCGPart1.getXCG01059();
	}

	/**
	* Returns the xcg01060 of this vr technical spec_xcg part1.
	*
	* @return the xcg01060 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01060() {
		return _vrTechnicalSpec_XCGPart1.getXCG01060();
	}

	/**
	* Returns the xcg01062 of this vr technical spec_xcg part1.
	*
	* @return the xcg01062 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01062() {
		return _vrTechnicalSpec_XCGPart1.getXCG01062();
	}

	/**
	* Returns the xcg01063 of this vr technical spec_xcg part1.
	*
	* @return the xcg01063 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01063() {
		return _vrTechnicalSpec_XCGPart1.getXCG01063();
	}

	/**
	* Returns the xcg01064 of this vr technical spec_xcg part1.
	*
	* @return the xcg01064 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01064() {
		return _vrTechnicalSpec_XCGPart1.getXCG01064();
	}

	/**
	* Returns the xcg01065 of this vr technical spec_xcg part1.
	*
	* @return the xcg01065 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01065() {
		return _vrTechnicalSpec_XCGPart1.getXCG01065();
	}

	/**
	* Returns the xcg01066 of this vr technical spec_xcg part1.
	*
	* @return the xcg01066 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01066() {
		return _vrTechnicalSpec_XCGPart1.getXCG01066();
	}

	/**
	* Returns the xcg01067 of this vr technical spec_xcg part1.
	*
	* @return the xcg01067 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01067() {
		return _vrTechnicalSpec_XCGPart1.getXCG01067();
	}

	/**
	* Returns the xcg01068 of this vr technical spec_xcg part1.
	*
	* @return the xcg01068 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01068() {
		return _vrTechnicalSpec_XCGPart1.getXCG01068();
	}

	/**
	* Returns the xcg01069 of this vr technical spec_xcg part1.
	*
	* @return the xcg01069 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01069() {
		return _vrTechnicalSpec_XCGPart1.getXCG01069();
	}

	/**
	* Returns the xcg01070 of this vr technical spec_xcg part1.
	*
	* @return the xcg01070 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01070() {
		return _vrTechnicalSpec_XCGPart1.getXCG01070();
	}

	/**
	* Returns the xcg01072 of this vr technical spec_xcg part1.
	*
	* @return the xcg01072 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01072() {
		return _vrTechnicalSpec_XCGPart1.getXCG01072();
	}

	/**
	* Returns the xcg01073 of this vr technical spec_xcg part1.
	*
	* @return the xcg01073 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01073() {
		return _vrTechnicalSpec_XCGPart1.getXCG01073();
	}

	/**
	* Returns the xcg01074 of this vr technical spec_xcg part1.
	*
	* @return the xcg01074 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01074() {
		return _vrTechnicalSpec_XCGPart1.getXCG01074();
	}

	/**
	* Returns the xcg01075 of this vr technical spec_xcg part1.
	*
	* @return the xcg01075 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01075() {
		return _vrTechnicalSpec_XCGPart1.getXCG01075();
	}

	/**
	* Returns the xcg01076 of this vr technical spec_xcg part1.
	*
	* @return the xcg01076 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01076() {
		return _vrTechnicalSpec_XCGPart1.getXCG01076();
	}

	/**
	* Returns the xcg01077 of this vr technical spec_xcg part1.
	*
	* @return the xcg01077 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01077() {
		return _vrTechnicalSpec_XCGPart1.getXCG01077();
	}

	/**
	* Returns the xcg01078 of this vr technical spec_xcg part1.
	*
	* @return the xcg01078 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01078() {
		return _vrTechnicalSpec_XCGPart1.getXCG01078();
	}

	/**
	* Returns the xcg01079 of this vr technical spec_xcg part1.
	*
	* @return the xcg01079 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01079() {
		return _vrTechnicalSpec_XCGPart1.getXCG01079();
	}

	/**
	* Returns the xcg01080 of this vr technical spec_xcg part1.
	*
	* @return the xcg01080 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01080() {
		return _vrTechnicalSpec_XCGPart1.getXCG01080();
	}

	/**
	* Returns the xcg01081 of this vr technical spec_xcg part1.
	*
	* @return the xcg01081 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01081() {
		return _vrTechnicalSpec_XCGPart1.getXCG01081();
	}

	/**
	* Returns the xcg01082 of this vr technical spec_xcg part1.
	*
	* @return the xcg01082 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01082() {
		return _vrTechnicalSpec_XCGPart1.getXCG01082();
	}

	/**
	* Returns the xcg01083 of this vr technical spec_xcg part1.
	*
	* @return the xcg01083 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01083() {
		return _vrTechnicalSpec_XCGPart1.getXCG01083();
	}

	/**
	* Returns the xcg01084 of this vr technical spec_xcg part1.
	*
	* @return the xcg01084 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01084() {
		return _vrTechnicalSpec_XCGPart1.getXCG01084();
	}

	/**
	* Returns the xcg01085 of this vr technical spec_xcg part1.
	*
	* @return the xcg01085 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01085() {
		return _vrTechnicalSpec_XCGPart1.getXCG01085();
	}

	/**
	* Returns the xcg01086 of this vr technical spec_xcg part1.
	*
	* @return the xcg01086 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01086() {
		return _vrTechnicalSpec_XCGPart1.getXCG01086();
	}

	/**
	* Returns the xcg01087 of this vr technical spec_xcg part1.
	*
	* @return the xcg01087 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01087() {
		return _vrTechnicalSpec_XCGPart1.getXCG01087();
	}

	/**
	* Returns the xcg01088 of this vr technical spec_xcg part1.
	*
	* @return the xcg01088 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01088() {
		return _vrTechnicalSpec_XCGPart1.getXCG01088();
	}

	/**
	* Returns the xcg01089 of this vr technical spec_xcg part1.
	*
	* @return the xcg01089 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01089() {
		return _vrTechnicalSpec_XCGPart1.getXCG01089();
	}

	/**
	* Returns the xcg01090 of this vr technical spec_xcg part1.
	*
	* @return the xcg01090 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01090() {
		return _vrTechnicalSpec_XCGPart1.getXCG01090();
	}

	/**
	* Returns the xcg01091 of this vr technical spec_xcg part1.
	*
	* @return the xcg01091 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01091() {
		return _vrTechnicalSpec_XCGPart1.getXCG01091();
	}

	/**
	* Returns the xcg01092 of this vr technical spec_xcg part1.
	*
	* @return the xcg01092 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01092() {
		return _vrTechnicalSpec_XCGPart1.getXCG01092();
	}

	/**
	* Returns the xcg01093 of this vr technical spec_xcg part1.
	*
	* @return the xcg01093 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01093() {
		return _vrTechnicalSpec_XCGPart1.getXCG01093();
	}

	/**
	* Returns the xcg01094 of this vr technical spec_xcg part1.
	*
	* @return the xcg01094 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01094() {
		return _vrTechnicalSpec_XCGPart1.getXCG01094();
	}

	/**
	* Returns the xcg01095 of this vr technical spec_xcg part1.
	*
	* @return the xcg01095 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01095() {
		return _vrTechnicalSpec_XCGPart1.getXCG01095();
	}

	/**
	* Returns the xcg01096 of this vr technical spec_xcg part1.
	*
	* @return the xcg01096 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01096() {
		return _vrTechnicalSpec_XCGPart1.getXCG01096();
	}

	/**
	* Returns the xcg01097 of this vr technical spec_xcg part1.
	*
	* @return the xcg01097 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01097() {
		return _vrTechnicalSpec_XCGPart1.getXCG01097();
	}

	/**
	* Returns the xcg01098 of this vr technical spec_xcg part1.
	*
	* @return the xcg01098 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01098() {
		return _vrTechnicalSpec_XCGPart1.getXCG01098();
	}

	/**
	* Returns the xcg01099 of this vr technical spec_xcg part1.
	*
	* @return the xcg01099 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01099() {
		return _vrTechnicalSpec_XCGPart1.getXCG01099();
	}

	/**
	* Returns the xcg01100 of this vr technical spec_xcg part1.
	*
	* @return the xcg01100 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01100() {
		return _vrTechnicalSpec_XCGPart1.getXCG01100();
	}

	/**
	* Returns the xcg01101 of this vr technical spec_xcg part1.
	*
	* @return the xcg01101 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01101() {
		return _vrTechnicalSpec_XCGPart1.getXCG01101();
	}

	/**
	* Returns the xcg01102 of this vr technical spec_xcg part1.
	*
	* @return the xcg01102 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01102() {
		return _vrTechnicalSpec_XCGPart1.getXCG01102();
	}

	/**
	* Returns the xcg01103 of this vr technical spec_xcg part1.
	*
	* @return the xcg01103 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01103() {
		return _vrTechnicalSpec_XCGPart1.getXCG01103();
	}

	/**
	* Returns the xcg01104 of this vr technical spec_xcg part1.
	*
	* @return the xcg01104 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01104() {
		return _vrTechnicalSpec_XCGPart1.getXCG01104();
	}

	/**
	* Returns the xcg01105 of this vr technical spec_xcg part1.
	*
	* @return the xcg01105 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01105() {
		return _vrTechnicalSpec_XCGPart1.getXCG01105();
	}

	/**
	* Returns the xcg01106 of this vr technical spec_xcg part1.
	*
	* @return the xcg01106 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01106() {
		return _vrTechnicalSpec_XCGPart1.getXCG01106();
	}

	/**
	* Returns the xcg01107 of this vr technical spec_xcg part1.
	*
	* @return the xcg01107 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01107() {
		return _vrTechnicalSpec_XCGPart1.getXCG01107();
	}

	/**
	* Returns the xcg01108 of this vr technical spec_xcg part1.
	*
	* @return the xcg01108 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01108() {
		return _vrTechnicalSpec_XCGPart1.getXCG01108();
	}

	/**
	* Returns the xcg01109 of this vr technical spec_xcg part1.
	*
	* @return the xcg01109 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01109() {
		return _vrTechnicalSpec_XCGPart1.getXCG01109();
	}

	/**
	* Returns the xcg01110 of this vr technical spec_xcg part1.
	*
	* @return the xcg01110 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01110() {
		return _vrTechnicalSpec_XCGPart1.getXCG01110();
	}

	/**
	* Returns the xcg01111 of this vr technical spec_xcg part1.
	*
	* @return the xcg01111 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01111() {
		return _vrTechnicalSpec_XCGPart1.getXCG01111();
	}

	/**
	* Returns the xcg01112 of this vr technical spec_xcg part1.
	*
	* @return the xcg01112 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01112() {
		return _vrTechnicalSpec_XCGPart1.getXCG01112();
	}

	/**
	* Returns the xcg01113 of this vr technical spec_xcg part1.
	*
	* @return the xcg01113 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01113() {
		return _vrTechnicalSpec_XCGPart1.getXCG01113();
	}

	/**
	* Returns the xcg01114 of this vr technical spec_xcg part1.
	*
	* @return the xcg01114 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01114() {
		return _vrTechnicalSpec_XCGPart1.getXCG01114();
	}

	/**
	* Returns the xcg01115 of this vr technical spec_xcg part1.
	*
	* @return the xcg01115 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01115() {
		return _vrTechnicalSpec_XCGPart1.getXCG01115();
	}

	/**
	* Returns the xcg01116 of this vr technical spec_xcg part1.
	*
	* @return the xcg01116 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01116() {
		return _vrTechnicalSpec_XCGPart1.getXCG01116();
	}

	/**
	* Returns the xcg01117 of this vr technical spec_xcg part1.
	*
	* @return the xcg01117 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01117() {
		return _vrTechnicalSpec_XCGPart1.getXCG01117();
	}

	/**
	* Returns the xcg01118 of this vr technical spec_xcg part1.
	*
	* @return the xcg01118 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01118() {
		return _vrTechnicalSpec_XCGPart1.getXCG01118();
	}

	/**
	* Returns the xcg01119 of this vr technical spec_xcg part1.
	*
	* @return the xcg01119 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01119() {
		return _vrTechnicalSpec_XCGPart1.getXCG01119();
	}

	/**
	* Returns the xcg01120 of this vr technical spec_xcg part1.
	*
	* @return the xcg01120 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01120() {
		return _vrTechnicalSpec_XCGPart1.getXCG01120();
	}

	/**
	* Returns the xcg01121 of this vr technical spec_xcg part1.
	*
	* @return the xcg01121 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01121() {
		return _vrTechnicalSpec_XCGPart1.getXCG01121();
	}

	/**
	* Returns the xcg01122 of this vr technical spec_xcg part1.
	*
	* @return the xcg01122 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01122() {
		return _vrTechnicalSpec_XCGPart1.getXCG01122();
	}

	/**
	* Returns the xcg01123 of this vr technical spec_xcg part1.
	*
	* @return the xcg01123 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01123() {
		return _vrTechnicalSpec_XCGPart1.getXCG01123();
	}

	/**
	* Returns the xcg01124 of this vr technical spec_xcg part1.
	*
	* @return the xcg01124 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01124() {
		return _vrTechnicalSpec_XCGPart1.getXCG01124();
	}

	/**
	* Returns the xcg01125 of this vr technical spec_xcg part1.
	*
	* @return the xcg01125 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01125() {
		return _vrTechnicalSpec_XCGPart1.getXCG01125();
	}

	/**
	* Returns the xcg01126 of this vr technical spec_xcg part1.
	*
	* @return the xcg01126 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01126() {
		return _vrTechnicalSpec_XCGPart1.getXCG01126();
	}

	/**
	* Returns the xcg01127 of this vr technical spec_xcg part1.
	*
	* @return the xcg01127 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01127() {
		return _vrTechnicalSpec_XCGPart1.getXCG01127();
	}

	/**
	* Returns the xcg01128 of this vr technical spec_xcg part1.
	*
	* @return the xcg01128 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01128() {
		return _vrTechnicalSpec_XCGPart1.getXCG01128();
	}

	/**
	* Returns the xcg01129 of this vr technical spec_xcg part1.
	*
	* @return the xcg01129 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01129() {
		return _vrTechnicalSpec_XCGPart1.getXCG01129();
	}

	/**
	* Returns the xcg01130 of this vr technical spec_xcg part1.
	*
	* @return the xcg01130 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01130() {
		return _vrTechnicalSpec_XCGPart1.getXCG01130();
	}

	/**
	* Returns the xcg01131 of this vr technical spec_xcg part1.
	*
	* @return the xcg01131 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01131() {
		return _vrTechnicalSpec_XCGPart1.getXCG01131();
	}

	/**
	* Returns the xcg01132 of this vr technical spec_xcg part1.
	*
	* @return the xcg01132 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01132() {
		return _vrTechnicalSpec_XCGPart1.getXCG01132();
	}

	/**
	* Returns the xcg01133 of this vr technical spec_xcg part1.
	*
	* @return the xcg01133 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01133() {
		return _vrTechnicalSpec_XCGPart1.getXCG01133();
	}

	/**
	* Returns the xcg01134 of this vr technical spec_xcg part1.
	*
	* @return the xcg01134 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01134() {
		return _vrTechnicalSpec_XCGPart1.getXCG01134();
	}

	/**
	* Returns the xcg01135 of this vr technical spec_xcg part1.
	*
	* @return the xcg01135 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01135() {
		return _vrTechnicalSpec_XCGPart1.getXCG01135();
	}

	/**
	* Returns the xcg01136 of this vr technical spec_xcg part1.
	*
	* @return the xcg01136 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01136() {
		return _vrTechnicalSpec_XCGPart1.getXCG01136();
	}

	/**
	* Returns the xcg01137 of this vr technical spec_xcg part1.
	*
	* @return the xcg01137 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01137() {
		return _vrTechnicalSpec_XCGPart1.getXCG01137();
	}

	/**
	* Returns the xcg01138 of this vr technical spec_xcg part1.
	*
	* @return the xcg01138 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01138() {
		return _vrTechnicalSpec_XCGPart1.getXCG01138();
	}

	/**
	* Returns the xcg01139 of this vr technical spec_xcg part1.
	*
	* @return the xcg01139 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01139() {
		return _vrTechnicalSpec_XCGPart1.getXCG01139();
	}

	/**
	* Returns the xcg01140 of this vr technical spec_xcg part1.
	*
	* @return the xcg01140 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01140() {
		return _vrTechnicalSpec_XCGPart1.getXCG01140();
	}

	/**
	* Returns the xcg01141 of this vr technical spec_xcg part1.
	*
	* @return the xcg01141 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01141() {
		return _vrTechnicalSpec_XCGPart1.getXCG01141();
	}

	/**
	* Returns the xcg01142 of this vr technical spec_xcg part1.
	*
	* @return the xcg01142 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01142() {
		return _vrTechnicalSpec_XCGPart1.getXCG01142();
	}

	/**
	* Returns the xcg01143 of this vr technical spec_xcg part1.
	*
	* @return the xcg01143 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01143() {
		return _vrTechnicalSpec_XCGPart1.getXCG01143();
	}

	/**
	* Returns the xcg01144 of this vr technical spec_xcg part1.
	*
	* @return the xcg01144 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01144() {
		return _vrTechnicalSpec_XCGPart1.getXCG01144();
	}

	/**
	* Returns the xcg01145 of this vr technical spec_xcg part1.
	*
	* @return the xcg01145 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01145() {
		return _vrTechnicalSpec_XCGPart1.getXCG01145();
	}

	/**
	* Returns the xcg01146 of this vr technical spec_xcg part1.
	*
	* @return the xcg01146 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01146() {
		return _vrTechnicalSpec_XCGPart1.getXCG01146();
	}

	/**
	* Returns the xcg01147 of this vr technical spec_xcg part1.
	*
	* @return the xcg01147 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01147() {
		return _vrTechnicalSpec_XCGPart1.getXCG01147();
	}

	/**
	* Returns the xcg01148 of this vr technical spec_xcg part1.
	*
	* @return the xcg01148 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01148() {
		return _vrTechnicalSpec_XCGPart1.getXCG01148();
	}

	/**
	* Returns the xcg01149 of this vr technical spec_xcg part1.
	*
	* @return the xcg01149 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01149() {
		return _vrTechnicalSpec_XCGPart1.getXCG01149();
	}

	/**
	* Returns the xcg01150 of this vr technical spec_xcg part1.
	*
	* @return the xcg01150 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01150() {
		return _vrTechnicalSpec_XCGPart1.getXCG01150();
	}

	/**
	* Returns the xcg01151 of this vr technical spec_xcg part1.
	*
	* @return the xcg01151 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01151() {
		return _vrTechnicalSpec_XCGPart1.getXCG01151();
	}

	/**
	* Returns the xcg01152 of this vr technical spec_xcg part1.
	*
	* @return the xcg01152 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01152() {
		return _vrTechnicalSpec_XCGPart1.getXCG01152();
	}

	/**
	* Returns the xcg01153 of this vr technical spec_xcg part1.
	*
	* @return the xcg01153 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01153() {
		return _vrTechnicalSpec_XCGPart1.getXCG01153();
	}

	/**
	* Returns the xcg01154 of this vr technical spec_xcg part1.
	*
	* @return the xcg01154 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01154() {
		return _vrTechnicalSpec_XCGPart1.getXCG01154();
	}

	/**
	* Returns the xcg01155 of this vr technical spec_xcg part1.
	*
	* @return the xcg01155 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01155() {
		return _vrTechnicalSpec_XCGPart1.getXCG01155();
	}

	/**
	* Returns the xcg01156 of this vr technical spec_xcg part1.
	*
	* @return the xcg01156 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01156() {
		return _vrTechnicalSpec_XCGPart1.getXCG01156();
	}

	/**
	* Returns the xcg01157 of this vr technical spec_xcg part1.
	*
	* @return the xcg01157 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01157() {
		return _vrTechnicalSpec_XCGPart1.getXCG01157();
	}

	/**
	* Returns the xcg01158 of this vr technical spec_xcg part1.
	*
	* @return the xcg01158 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01158() {
		return _vrTechnicalSpec_XCGPart1.getXCG01158();
	}

	/**
	* Returns the xcg01159 of this vr technical spec_xcg part1.
	*
	* @return the xcg01159 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01159() {
		return _vrTechnicalSpec_XCGPart1.getXCG01159();
	}

	/**
	* Returns the xcg01160 of this vr technical spec_xcg part1.
	*
	* @return the xcg01160 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01160() {
		return _vrTechnicalSpec_XCGPart1.getXCG01160();
	}

	/**
	* Returns the xcg01161 of this vr technical spec_xcg part1.
	*
	* @return the xcg01161 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01161() {
		return _vrTechnicalSpec_XCGPart1.getXCG01161();
	}

	/**
	* Returns the xcg01162 of this vr technical spec_xcg part1.
	*
	* @return the xcg01162 of this vr technical spec_xcg part1
	*/
	@Override
	public java.lang.String getXCG01162() {
		return _vrTechnicalSpec_XCGPart1.getXCG01162();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XCGPart1.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XCGPart1.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xcg part1.
	*
	* @return the modify date of this vr technical spec_xcg part1
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XCGPart1.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xcg part1.
	*
	* @return the sync date of this vr technical spec_xcg part1
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XCGPart1.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xcg part1.
	*
	* @return the convert assemble ID of this vr technical spec_xcg part1
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XCGPart1.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xcg part1.
	*
	* @return the dossier ID of this vr technical spec_xcg part1
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XCGPart1.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xcg part1.
	*
	* @return the ID of this vr technical spec_xcg part1
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XCGPart1.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xcg part1.
	*
	* @return the mt core of this vr technical spec_xcg part1
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XCGPart1.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xcg part1.
	*
	* @return the primary key of this vr technical spec_xcg part1
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XCGPart1.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xcg part1.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xcg part1
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XCGPart1.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XCGPart1.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XCGPart1.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xcg part1.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xcg part1
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XCGPart1.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xcg part1.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xcg part1
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XCGPart1.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xcg part1.
	*
	* @param dossierId the dossier ID of this vr technical spec_xcg part1
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XCGPart1.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xcg part1.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xcg part1
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XCGPart1.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xcg part1.
	*
	* @param dossierNo the dossier no of this vr technical spec_xcg part1
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XCGPart1.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XCGPart1.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XCGPart1.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XCGPart1.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xcg part1.
	*
	* @param id the ID of this vr technical spec_xcg part1
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XCGPart1.setId(id);
	}

	/**
	* Sets the loai_dong_co of this vr technical spec_xcg part1.
	*
	* @param loai_dong_co the loai_dong_co of this vr technical spec_xcg part1
	*/
	@Override
	public void setLoai_dong_co(java.lang.String loai_dong_co) {
		_vrTechnicalSpec_XCGPart1.setLoai_dong_co(loai_dong_co);
	}

	/**
	* Sets the modify date of this vr technical spec_xcg part1.
	*
	* @param modifyDate the modify date of this vr technical spec_xcg part1
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XCGPart1.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xcg part1.
	*
	* @param mtCore the mt core of this vr technical spec_xcg part1
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XCGPart1.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XCGPart1.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xcg part1.
	*
	* @param primaryKey the primary key of this vr technical spec_xcg part1
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XCGPart1.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XCGPart1.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xcg part1.
	*
	* @param referenceUid the reference uid of this vr technical spec_xcg part1
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XCGPart1.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xcg part1.
	*
	* @param syncDate the sync date of this vr technical spec_xcg part1
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XCGPart1.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xcg part1.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xcg part1
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XCGPart1.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xcg01001 of this vr technical spec_xcg part1.
	*
	* @param XCG01001 the xcg01001 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01001(java.lang.String XCG01001) {
		_vrTechnicalSpec_XCGPart1.setXCG01001(XCG01001);
	}

	/**
	* Sets the xcg01002 of this vr technical spec_xcg part1.
	*
	* @param XCG01002 the xcg01002 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01002(java.lang.String XCG01002) {
		_vrTechnicalSpec_XCGPart1.setXCG01002(XCG01002);
	}

	/**
	* Sets the xcg01003 of this vr technical spec_xcg part1.
	*
	* @param XCG01003 the xcg01003 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01003(java.lang.String XCG01003) {
		_vrTechnicalSpec_XCGPart1.setXCG01003(XCG01003);
	}

	/**
	* Sets the xcg01004 of this vr technical spec_xcg part1.
	*
	* @param XCG01004 the xcg01004 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01004(java.lang.String XCG01004) {
		_vrTechnicalSpec_XCGPart1.setXCG01004(XCG01004);
	}

	/**
	* Sets the xcg01005 of this vr technical spec_xcg part1.
	*
	* @param XCG01005 the xcg01005 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01005(java.lang.String XCG01005) {
		_vrTechnicalSpec_XCGPart1.setXCG01005(XCG01005);
	}

	/**
	* Sets the xcg01006 of this vr technical spec_xcg part1.
	*
	* @param XCG01006 the xcg01006 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01006(java.lang.String XCG01006) {
		_vrTechnicalSpec_XCGPart1.setXCG01006(XCG01006);
	}

	/**
	* Sets the xcg01007 of this vr technical spec_xcg part1.
	*
	* @param XCG01007 the xcg01007 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01007(java.lang.String XCG01007) {
		_vrTechnicalSpec_XCGPart1.setXCG01007(XCG01007);
	}

	/**
	* Sets the xcg01008 of this vr technical spec_xcg part1.
	*
	* @param XCG01008 the xcg01008 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01008(java.lang.String XCG01008) {
		_vrTechnicalSpec_XCGPart1.setXCG01008(XCG01008);
	}

	/**
	* Sets the xcg01009 of this vr technical spec_xcg part1.
	*
	* @param XCG01009 the xcg01009 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01009(java.lang.String XCG01009) {
		_vrTechnicalSpec_XCGPart1.setXCG01009(XCG01009);
	}

	/**
	* Sets the xcg01010 of this vr technical spec_xcg part1.
	*
	* @param XCG01010 the xcg01010 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01010(java.lang.String XCG01010) {
		_vrTechnicalSpec_XCGPart1.setXCG01010(XCG01010);
	}

	/**
	* Sets the xcg01011 of this vr technical spec_xcg part1.
	*
	* @param XCG01011 the xcg01011 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01011(java.lang.String XCG01011) {
		_vrTechnicalSpec_XCGPart1.setXCG01011(XCG01011);
	}

	/**
	* Sets the xcg01012 of this vr technical spec_xcg part1.
	*
	* @param XCG01012 the xcg01012 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01012(java.lang.String XCG01012) {
		_vrTechnicalSpec_XCGPart1.setXCG01012(XCG01012);
	}

	/**
	* Sets the xcg01013 of this vr technical spec_xcg part1.
	*
	* @param XCG01013 the xcg01013 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01013(java.lang.String XCG01013) {
		_vrTechnicalSpec_XCGPart1.setXCG01013(XCG01013);
	}

	/**
	* Sets the xcg01014 of this vr technical spec_xcg part1.
	*
	* @param XCG01014 the xcg01014 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01014(java.lang.String XCG01014) {
		_vrTechnicalSpec_XCGPart1.setXCG01014(XCG01014);
	}

	/**
	* Sets the xcg01016 of this vr technical spec_xcg part1.
	*
	* @param XCG01016 the xcg01016 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01016(java.lang.String XCG01016) {
		_vrTechnicalSpec_XCGPart1.setXCG01016(XCG01016);
	}

	/**
	* Sets the xcg01017 of this vr technical spec_xcg part1.
	*
	* @param XCG01017 the xcg01017 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01017(java.lang.String XCG01017) {
		_vrTechnicalSpec_XCGPart1.setXCG01017(XCG01017);
	}

	/**
	* Sets the xcg01019 of this vr technical spec_xcg part1.
	*
	* @param XCG01019 the xcg01019 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01019(java.lang.String XCG01019) {
		_vrTechnicalSpec_XCGPart1.setXCG01019(XCG01019);
	}

	/**
	* Sets the xcg01020 of this vr technical spec_xcg part1.
	*
	* @param XCG01020 the xcg01020 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01020(java.lang.String XCG01020) {
		_vrTechnicalSpec_XCGPart1.setXCG01020(XCG01020);
	}

	/**
	* Sets the xcg01021 of this vr technical spec_xcg part1.
	*
	* @param XCG01021 the xcg01021 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01021(java.lang.String XCG01021) {
		_vrTechnicalSpec_XCGPart1.setXCG01021(XCG01021);
	}

	/**
	* Sets the xcg01022 of this vr technical spec_xcg part1.
	*
	* @param XCG01022 the xcg01022 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01022(java.lang.String XCG01022) {
		_vrTechnicalSpec_XCGPart1.setXCG01022(XCG01022);
	}

	/**
	* Sets the xcg01024 of this vr technical spec_xcg part1.
	*
	* @param XCG01024 the xcg01024 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01024(java.lang.String XCG01024) {
		_vrTechnicalSpec_XCGPart1.setXCG01024(XCG01024);
	}

	/**
	* Sets the xcg01025 of this vr technical spec_xcg part1.
	*
	* @param XCG01025 the xcg01025 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01025(java.lang.String XCG01025) {
		_vrTechnicalSpec_XCGPart1.setXCG01025(XCG01025);
	}

	/**
	* Sets the xcg01026 of this vr technical spec_xcg part1.
	*
	* @param XCG01026 the xcg01026 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01026(java.lang.String XCG01026) {
		_vrTechnicalSpec_XCGPart1.setXCG01026(XCG01026);
	}

	/**
	* Sets the xcg01027 of this vr technical spec_xcg part1.
	*
	* @param XCG01027 the xcg01027 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01027(java.lang.String XCG01027) {
		_vrTechnicalSpec_XCGPart1.setXCG01027(XCG01027);
	}

	/**
	* Sets the xcg01028 of this vr technical spec_xcg part1.
	*
	* @param XCG01028 the xcg01028 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01028(java.lang.String XCG01028) {
		_vrTechnicalSpec_XCGPart1.setXCG01028(XCG01028);
	}

	/**
	* Sets the xcg01030 of this vr technical spec_xcg part1.
	*
	* @param XCG01030 the xcg01030 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01030(java.lang.String XCG01030) {
		_vrTechnicalSpec_XCGPart1.setXCG01030(XCG01030);
	}

	/**
	* Sets the xcg01031 of this vr technical spec_xcg part1.
	*
	* @param XCG01031 the xcg01031 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01031(java.lang.String XCG01031) {
		_vrTechnicalSpec_XCGPart1.setXCG01031(XCG01031);
	}

	/**
	* Sets the xcg01032 of this vr technical spec_xcg part1.
	*
	* @param XCG01032 the xcg01032 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01032(java.lang.String XCG01032) {
		_vrTechnicalSpec_XCGPart1.setXCG01032(XCG01032);
	}

	/**
	* Sets the xcg01033 of this vr technical spec_xcg part1.
	*
	* @param XCG01033 the xcg01033 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01033(java.lang.String XCG01033) {
		_vrTechnicalSpec_XCGPart1.setXCG01033(XCG01033);
	}

	/**
	* Sets the xcg01034 of this vr technical spec_xcg part1.
	*
	* @param XCG01034 the xcg01034 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01034(java.lang.String XCG01034) {
		_vrTechnicalSpec_XCGPart1.setXCG01034(XCG01034);
	}

	/**
	* Sets the xcg01035 of this vr technical spec_xcg part1.
	*
	* @param XCG01035 the xcg01035 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01035(java.lang.String XCG01035) {
		_vrTechnicalSpec_XCGPart1.setXCG01035(XCG01035);
	}

	/**
	* Sets the xcg01036 of this vr technical spec_xcg part1.
	*
	* @param XCG01036 the xcg01036 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01036(java.lang.String XCG01036) {
		_vrTechnicalSpec_XCGPart1.setXCG01036(XCG01036);
	}

	/**
	* Sets the xcg01037 of this vr technical spec_xcg part1.
	*
	* @param XCG01037 the xcg01037 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01037(java.lang.String XCG01037) {
		_vrTechnicalSpec_XCGPart1.setXCG01037(XCG01037);
	}

	/**
	* Sets the xcg01038 of this vr technical spec_xcg part1.
	*
	* @param XCG01038 the xcg01038 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01038(java.lang.String XCG01038) {
		_vrTechnicalSpec_XCGPart1.setXCG01038(XCG01038);
	}

	/**
	* Sets the xcg01039 of this vr technical spec_xcg part1.
	*
	* @param XCG01039 the xcg01039 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01039(java.lang.String XCG01039) {
		_vrTechnicalSpec_XCGPart1.setXCG01039(XCG01039);
	}

	/**
	* Sets the xcg01040 of this vr technical spec_xcg part1.
	*
	* @param XCG01040 the xcg01040 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01040(java.lang.String XCG01040) {
		_vrTechnicalSpec_XCGPart1.setXCG01040(XCG01040);
	}

	/**
	* Sets the xcg01041 of this vr technical spec_xcg part1.
	*
	* @param XCG01041 the xcg01041 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01041(java.lang.String XCG01041) {
		_vrTechnicalSpec_XCGPart1.setXCG01041(XCG01041);
	}

	/**
	* Sets the xcg01042 of this vr technical spec_xcg part1.
	*
	* @param XCG01042 the xcg01042 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01042(java.lang.String XCG01042) {
		_vrTechnicalSpec_XCGPart1.setXCG01042(XCG01042);
	}

	/**
	* Sets the xcg01043 of this vr technical spec_xcg part1.
	*
	* @param XCG01043 the xcg01043 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01043(java.lang.String XCG01043) {
		_vrTechnicalSpec_XCGPart1.setXCG01043(XCG01043);
	}

	/**
	* Sets the xcg01044 of this vr technical spec_xcg part1.
	*
	* @param XCG01044 the xcg01044 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01044(java.lang.String XCG01044) {
		_vrTechnicalSpec_XCGPart1.setXCG01044(XCG01044);
	}

	/**
	* Sets the xcg01045 of this vr technical spec_xcg part1.
	*
	* @param XCG01045 the xcg01045 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01045(java.lang.String XCG01045) {
		_vrTechnicalSpec_XCGPart1.setXCG01045(XCG01045);
	}

	/**
	* Sets the xcg01046 of this vr technical spec_xcg part1.
	*
	* @param XCG01046 the xcg01046 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01046(java.lang.String XCG01046) {
		_vrTechnicalSpec_XCGPart1.setXCG01046(XCG01046);
	}

	/**
	* Sets the xcg01047 of this vr technical spec_xcg part1.
	*
	* @param XCG01047 the xcg01047 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01047(java.lang.String XCG01047) {
		_vrTechnicalSpec_XCGPart1.setXCG01047(XCG01047);
	}

	/**
	* Sets the xcg01049 of this vr technical spec_xcg part1.
	*
	* @param XCG01049 the xcg01049 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01049(java.lang.String XCG01049) {
		_vrTechnicalSpec_XCGPart1.setXCG01049(XCG01049);
	}

	/**
	* Sets the xcg01050 of this vr technical spec_xcg part1.
	*
	* @param XCG01050 the xcg01050 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01050(java.lang.String XCG01050) {
		_vrTechnicalSpec_XCGPart1.setXCG01050(XCG01050);
	}

	/**
	* Sets the xcg01051 of this vr technical spec_xcg part1.
	*
	* @param XCG01051 the xcg01051 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01051(java.lang.String XCG01051) {
		_vrTechnicalSpec_XCGPart1.setXCG01051(XCG01051);
	}

	/**
	* Sets the xcg01052 of this vr technical spec_xcg part1.
	*
	* @param XCG01052 the xcg01052 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01052(java.lang.String XCG01052) {
		_vrTechnicalSpec_XCGPart1.setXCG01052(XCG01052);
	}

	/**
	* Sets the xcg01053 of this vr technical spec_xcg part1.
	*
	* @param XCG01053 the xcg01053 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01053(java.lang.String XCG01053) {
		_vrTechnicalSpec_XCGPart1.setXCG01053(XCG01053);
	}

	/**
	* Sets the xcg01054 of this vr technical spec_xcg part1.
	*
	* @param XCG01054 the xcg01054 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01054(java.lang.String XCG01054) {
		_vrTechnicalSpec_XCGPart1.setXCG01054(XCG01054);
	}

	/**
	* Sets the xcg01055 of this vr technical spec_xcg part1.
	*
	* @param XCG01055 the xcg01055 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01055(java.lang.String XCG01055) {
		_vrTechnicalSpec_XCGPart1.setXCG01055(XCG01055);
	}

	/**
	* Sets the xcg01056 of this vr technical spec_xcg part1.
	*
	* @param XCG01056 the xcg01056 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01056(java.lang.String XCG01056) {
		_vrTechnicalSpec_XCGPart1.setXCG01056(XCG01056);
	}

	/**
	* Sets the xcg01057 of this vr technical spec_xcg part1.
	*
	* @param XCG01057 the xcg01057 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01057(java.lang.String XCG01057) {
		_vrTechnicalSpec_XCGPart1.setXCG01057(XCG01057);
	}

	/**
	* Sets the xcg01058 of this vr technical spec_xcg part1.
	*
	* @param XCG01058 the xcg01058 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01058(java.lang.String XCG01058) {
		_vrTechnicalSpec_XCGPart1.setXCG01058(XCG01058);
	}

	/**
	* Sets the xcg01059 of this vr technical spec_xcg part1.
	*
	* @param XCG01059 the xcg01059 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01059(java.lang.String XCG01059) {
		_vrTechnicalSpec_XCGPart1.setXCG01059(XCG01059);
	}

	/**
	* Sets the xcg01060 of this vr technical spec_xcg part1.
	*
	* @param XCG01060 the xcg01060 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01060(java.lang.String XCG01060) {
		_vrTechnicalSpec_XCGPart1.setXCG01060(XCG01060);
	}

	/**
	* Sets the xcg01062 of this vr technical spec_xcg part1.
	*
	* @param XCG01062 the xcg01062 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01062(java.lang.String XCG01062) {
		_vrTechnicalSpec_XCGPart1.setXCG01062(XCG01062);
	}

	/**
	* Sets the xcg01063 of this vr technical spec_xcg part1.
	*
	* @param XCG01063 the xcg01063 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01063(java.lang.String XCG01063) {
		_vrTechnicalSpec_XCGPart1.setXCG01063(XCG01063);
	}

	/**
	* Sets the xcg01064 of this vr technical spec_xcg part1.
	*
	* @param XCG01064 the xcg01064 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01064(java.lang.String XCG01064) {
		_vrTechnicalSpec_XCGPart1.setXCG01064(XCG01064);
	}

	/**
	* Sets the xcg01065 of this vr technical spec_xcg part1.
	*
	* @param XCG01065 the xcg01065 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01065(java.lang.String XCG01065) {
		_vrTechnicalSpec_XCGPart1.setXCG01065(XCG01065);
	}

	/**
	* Sets the xcg01066 of this vr technical spec_xcg part1.
	*
	* @param XCG01066 the xcg01066 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01066(java.lang.String XCG01066) {
		_vrTechnicalSpec_XCGPart1.setXCG01066(XCG01066);
	}

	/**
	* Sets the xcg01067 of this vr technical spec_xcg part1.
	*
	* @param XCG01067 the xcg01067 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01067(java.lang.String XCG01067) {
		_vrTechnicalSpec_XCGPart1.setXCG01067(XCG01067);
	}

	/**
	* Sets the xcg01068 of this vr technical spec_xcg part1.
	*
	* @param XCG01068 the xcg01068 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01068(java.lang.String XCG01068) {
		_vrTechnicalSpec_XCGPart1.setXCG01068(XCG01068);
	}

	/**
	* Sets the xcg01069 of this vr technical spec_xcg part1.
	*
	* @param XCG01069 the xcg01069 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01069(java.lang.String XCG01069) {
		_vrTechnicalSpec_XCGPart1.setXCG01069(XCG01069);
	}

	/**
	* Sets the xcg01070 of this vr technical spec_xcg part1.
	*
	* @param XCG01070 the xcg01070 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01070(java.lang.String XCG01070) {
		_vrTechnicalSpec_XCGPart1.setXCG01070(XCG01070);
	}

	/**
	* Sets the xcg01072 of this vr technical spec_xcg part1.
	*
	* @param XCG01072 the xcg01072 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01072(java.lang.String XCG01072) {
		_vrTechnicalSpec_XCGPart1.setXCG01072(XCG01072);
	}

	/**
	* Sets the xcg01073 of this vr technical spec_xcg part1.
	*
	* @param XCG01073 the xcg01073 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01073(java.lang.String XCG01073) {
		_vrTechnicalSpec_XCGPart1.setXCG01073(XCG01073);
	}

	/**
	* Sets the xcg01074 of this vr technical spec_xcg part1.
	*
	* @param XCG01074 the xcg01074 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01074(java.lang.String XCG01074) {
		_vrTechnicalSpec_XCGPart1.setXCG01074(XCG01074);
	}

	/**
	* Sets the xcg01075 of this vr technical spec_xcg part1.
	*
	* @param XCG01075 the xcg01075 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01075(java.lang.String XCG01075) {
		_vrTechnicalSpec_XCGPart1.setXCG01075(XCG01075);
	}

	/**
	* Sets the xcg01076 of this vr technical spec_xcg part1.
	*
	* @param XCG01076 the xcg01076 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01076(java.lang.String XCG01076) {
		_vrTechnicalSpec_XCGPart1.setXCG01076(XCG01076);
	}

	/**
	* Sets the xcg01077 of this vr technical spec_xcg part1.
	*
	* @param XCG01077 the xcg01077 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01077(java.lang.String XCG01077) {
		_vrTechnicalSpec_XCGPart1.setXCG01077(XCG01077);
	}

	/**
	* Sets the xcg01078 of this vr technical spec_xcg part1.
	*
	* @param XCG01078 the xcg01078 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01078(java.lang.String XCG01078) {
		_vrTechnicalSpec_XCGPart1.setXCG01078(XCG01078);
	}

	/**
	* Sets the xcg01079 of this vr technical spec_xcg part1.
	*
	* @param XCG01079 the xcg01079 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01079(java.lang.String XCG01079) {
		_vrTechnicalSpec_XCGPart1.setXCG01079(XCG01079);
	}

	/**
	* Sets the xcg01080 of this vr technical spec_xcg part1.
	*
	* @param XCG01080 the xcg01080 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01080(java.lang.String XCG01080) {
		_vrTechnicalSpec_XCGPart1.setXCG01080(XCG01080);
	}

	/**
	* Sets the xcg01081 of this vr technical spec_xcg part1.
	*
	* @param XCG01081 the xcg01081 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01081(java.lang.String XCG01081) {
		_vrTechnicalSpec_XCGPart1.setXCG01081(XCG01081);
	}

	/**
	* Sets the xcg01082 of this vr technical spec_xcg part1.
	*
	* @param XCG01082 the xcg01082 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01082(java.lang.String XCG01082) {
		_vrTechnicalSpec_XCGPart1.setXCG01082(XCG01082);
	}

	/**
	* Sets the xcg01083 of this vr technical spec_xcg part1.
	*
	* @param XCG01083 the xcg01083 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01083(java.lang.String XCG01083) {
		_vrTechnicalSpec_XCGPart1.setXCG01083(XCG01083);
	}

	/**
	* Sets the xcg01084 of this vr technical spec_xcg part1.
	*
	* @param XCG01084 the xcg01084 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01084(java.lang.String XCG01084) {
		_vrTechnicalSpec_XCGPart1.setXCG01084(XCG01084);
	}

	/**
	* Sets the xcg01085 of this vr technical spec_xcg part1.
	*
	* @param XCG01085 the xcg01085 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01085(java.lang.String XCG01085) {
		_vrTechnicalSpec_XCGPart1.setXCG01085(XCG01085);
	}

	/**
	* Sets the xcg01086 of this vr technical spec_xcg part1.
	*
	* @param XCG01086 the xcg01086 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01086(java.lang.String XCG01086) {
		_vrTechnicalSpec_XCGPart1.setXCG01086(XCG01086);
	}

	/**
	* Sets the xcg01087 of this vr technical spec_xcg part1.
	*
	* @param XCG01087 the xcg01087 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01087(java.lang.String XCG01087) {
		_vrTechnicalSpec_XCGPart1.setXCG01087(XCG01087);
	}

	/**
	* Sets the xcg01088 of this vr technical spec_xcg part1.
	*
	* @param XCG01088 the xcg01088 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01088(java.lang.String XCG01088) {
		_vrTechnicalSpec_XCGPart1.setXCG01088(XCG01088);
	}

	/**
	* Sets the xcg01089 of this vr technical spec_xcg part1.
	*
	* @param XCG01089 the xcg01089 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01089(java.lang.String XCG01089) {
		_vrTechnicalSpec_XCGPart1.setXCG01089(XCG01089);
	}

	/**
	* Sets the xcg01090 of this vr technical spec_xcg part1.
	*
	* @param XCG01090 the xcg01090 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01090(java.lang.String XCG01090) {
		_vrTechnicalSpec_XCGPart1.setXCG01090(XCG01090);
	}

	/**
	* Sets the xcg01091 of this vr technical spec_xcg part1.
	*
	* @param XCG01091 the xcg01091 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01091(java.lang.String XCG01091) {
		_vrTechnicalSpec_XCGPart1.setXCG01091(XCG01091);
	}

	/**
	* Sets the xcg01092 of this vr technical spec_xcg part1.
	*
	* @param XCG01092 the xcg01092 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01092(java.lang.String XCG01092) {
		_vrTechnicalSpec_XCGPart1.setXCG01092(XCG01092);
	}

	/**
	* Sets the xcg01093 of this vr technical spec_xcg part1.
	*
	* @param XCG01093 the xcg01093 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01093(java.lang.String XCG01093) {
		_vrTechnicalSpec_XCGPart1.setXCG01093(XCG01093);
	}

	/**
	* Sets the xcg01094 of this vr technical spec_xcg part1.
	*
	* @param XCG01094 the xcg01094 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01094(java.lang.String XCG01094) {
		_vrTechnicalSpec_XCGPart1.setXCG01094(XCG01094);
	}

	/**
	* Sets the xcg01095 of this vr technical spec_xcg part1.
	*
	* @param XCG01095 the xcg01095 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01095(java.lang.String XCG01095) {
		_vrTechnicalSpec_XCGPart1.setXCG01095(XCG01095);
	}

	/**
	* Sets the xcg01096 of this vr technical spec_xcg part1.
	*
	* @param XCG01096 the xcg01096 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01096(java.lang.String XCG01096) {
		_vrTechnicalSpec_XCGPart1.setXCG01096(XCG01096);
	}

	/**
	* Sets the xcg01097 of this vr technical spec_xcg part1.
	*
	* @param XCG01097 the xcg01097 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01097(java.lang.String XCG01097) {
		_vrTechnicalSpec_XCGPart1.setXCG01097(XCG01097);
	}

	/**
	* Sets the xcg01098 of this vr technical spec_xcg part1.
	*
	* @param XCG01098 the xcg01098 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01098(java.lang.String XCG01098) {
		_vrTechnicalSpec_XCGPart1.setXCG01098(XCG01098);
	}

	/**
	* Sets the xcg01099 of this vr technical spec_xcg part1.
	*
	* @param XCG01099 the xcg01099 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01099(java.lang.String XCG01099) {
		_vrTechnicalSpec_XCGPart1.setXCG01099(XCG01099);
	}

	/**
	* Sets the xcg01100 of this vr technical spec_xcg part1.
	*
	* @param XCG01100 the xcg01100 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01100(java.lang.String XCG01100) {
		_vrTechnicalSpec_XCGPart1.setXCG01100(XCG01100);
	}

	/**
	* Sets the xcg01101 of this vr technical spec_xcg part1.
	*
	* @param XCG01101 the xcg01101 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01101(java.lang.String XCG01101) {
		_vrTechnicalSpec_XCGPart1.setXCG01101(XCG01101);
	}

	/**
	* Sets the xcg01102 of this vr technical spec_xcg part1.
	*
	* @param XCG01102 the xcg01102 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01102(java.lang.String XCG01102) {
		_vrTechnicalSpec_XCGPart1.setXCG01102(XCG01102);
	}

	/**
	* Sets the xcg01103 of this vr technical spec_xcg part1.
	*
	* @param XCG01103 the xcg01103 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01103(java.lang.String XCG01103) {
		_vrTechnicalSpec_XCGPart1.setXCG01103(XCG01103);
	}

	/**
	* Sets the xcg01104 of this vr technical spec_xcg part1.
	*
	* @param XCG01104 the xcg01104 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01104(java.lang.String XCG01104) {
		_vrTechnicalSpec_XCGPart1.setXCG01104(XCG01104);
	}

	/**
	* Sets the xcg01105 of this vr technical spec_xcg part1.
	*
	* @param XCG01105 the xcg01105 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01105(java.lang.String XCG01105) {
		_vrTechnicalSpec_XCGPart1.setXCG01105(XCG01105);
	}

	/**
	* Sets the xcg01106 of this vr technical spec_xcg part1.
	*
	* @param XCG01106 the xcg01106 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01106(java.lang.String XCG01106) {
		_vrTechnicalSpec_XCGPart1.setXCG01106(XCG01106);
	}

	/**
	* Sets the xcg01107 of this vr technical spec_xcg part1.
	*
	* @param XCG01107 the xcg01107 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01107(java.lang.String XCG01107) {
		_vrTechnicalSpec_XCGPart1.setXCG01107(XCG01107);
	}

	/**
	* Sets the xcg01108 of this vr technical spec_xcg part1.
	*
	* @param XCG01108 the xcg01108 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01108(java.lang.String XCG01108) {
		_vrTechnicalSpec_XCGPart1.setXCG01108(XCG01108);
	}

	/**
	* Sets the xcg01109 of this vr technical spec_xcg part1.
	*
	* @param XCG01109 the xcg01109 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01109(java.lang.String XCG01109) {
		_vrTechnicalSpec_XCGPart1.setXCG01109(XCG01109);
	}

	/**
	* Sets the xcg01110 of this vr technical spec_xcg part1.
	*
	* @param XCG01110 the xcg01110 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01110(java.lang.String XCG01110) {
		_vrTechnicalSpec_XCGPart1.setXCG01110(XCG01110);
	}

	/**
	* Sets the xcg01111 of this vr technical spec_xcg part1.
	*
	* @param XCG01111 the xcg01111 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01111(java.lang.String XCG01111) {
		_vrTechnicalSpec_XCGPart1.setXCG01111(XCG01111);
	}

	/**
	* Sets the xcg01112 of this vr technical spec_xcg part1.
	*
	* @param XCG01112 the xcg01112 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01112(java.lang.String XCG01112) {
		_vrTechnicalSpec_XCGPart1.setXCG01112(XCG01112);
	}

	/**
	* Sets the xcg01113 of this vr technical spec_xcg part1.
	*
	* @param XCG01113 the xcg01113 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01113(java.lang.String XCG01113) {
		_vrTechnicalSpec_XCGPart1.setXCG01113(XCG01113);
	}

	/**
	* Sets the xcg01114 of this vr technical spec_xcg part1.
	*
	* @param XCG01114 the xcg01114 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01114(java.lang.String XCG01114) {
		_vrTechnicalSpec_XCGPart1.setXCG01114(XCG01114);
	}

	/**
	* Sets the xcg01115 of this vr technical spec_xcg part1.
	*
	* @param XCG01115 the xcg01115 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01115(java.lang.String XCG01115) {
		_vrTechnicalSpec_XCGPart1.setXCG01115(XCG01115);
	}

	/**
	* Sets the xcg01116 of this vr technical spec_xcg part1.
	*
	* @param XCG01116 the xcg01116 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01116(java.lang.String XCG01116) {
		_vrTechnicalSpec_XCGPart1.setXCG01116(XCG01116);
	}

	/**
	* Sets the xcg01117 of this vr technical spec_xcg part1.
	*
	* @param XCG01117 the xcg01117 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01117(java.lang.String XCG01117) {
		_vrTechnicalSpec_XCGPart1.setXCG01117(XCG01117);
	}

	/**
	* Sets the xcg01118 of this vr technical spec_xcg part1.
	*
	* @param XCG01118 the xcg01118 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01118(java.lang.String XCG01118) {
		_vrTechnicalSpec_XCGPart1.setXCG01118(XCG01118);
	}

	/**
	* Sets the xcg01119 of this vr technical spec_xcg part1.
	*
	* @param XCG01119 the xcg01119 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01119(java.lang.String XCG01119) {
		_vrTechnicalSpec_XCGPart1.setXCG01119(XCG01119);
	}

	/**
	* Sets the xcg01120 of this vr technical spec_xcg part1.
	*
	* @param XCG01120 the xcg01120 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01120(java.lang.String XCG01120) {
		_vrTechnicalSpec_XCGPart1.setXCG01120(XCG01120);
	}

	/**
	* Sets the xcg01121 of this vr technical spec_xcg part1.
	*
	* @param XCG01121 the xcg01121 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01121(java.lang.String XCG01121) {
		_vrTechnicalSpec_XCGPart1.setXCG01121(XCG01121);
	}

	/**
	* Sets the xcg01122 of this vr technical spec_xcg part1.
	*
	* @param XCG01122 the xcg01122 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01122(java.lang.String XCG01122) {
		_vrTechnicalSpec_XCGPart1.setXCG01122(XCG01122);
	}

	/**
	* Sets the xcg01123 of this vr technical spec_xcg part1.
	*
	* @param XCG01123 the xcg01123 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01123(java.lang.String XCG01123) {
		_vrTechnicalSpec_XCGPart1.setXCG01123(XCG01123);
	}

	/**
	* Sets the xcg01124 of this vr technical spec_xcg part1.
	*
	* @param XCG01124 the xcg01124 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01124(java.lang.String XCG01124) {
		_vrTechnicalSpec_XCGPart1.setXCG01124(XCG01124);
	}

	/**
	* Sets the xcg01125 of this vr technical spec_xcg part1.
	*
	* @param XCG01125 the xcg01125 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01125(java.lang.String XCG01125) {
		_vrTechnicalSpec_XCGPart1.setXCG01125(XCG01125);
	}

	/**
	* Sets the xcg01126 of this vr technical spec_xcg part1.
	*
	* @param XCG01126 the xcg01126 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01126(java.lang.String XCG01126) {
		_vrTechnicalSpec_XCGPart1.setXCG01126(XCG01126);
	}

	/**
	* Sets the xcg01127 of this vr technical spec_xcg part1.
	*
	* @param XCG01127 the xcg01127 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01127(java.lang.String XCG01127) {
		_vrTechnicalSpec_XCGPart1.setXCG01127(XCG01127);
	}

	/**
	* Sets the xcg01128 of this vr technical spec_xcg part1.
	*
	* @param XCG01128 the xcg01128 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01128(java.lang.String XCG01128) {
		_vrTechnicalSpec_XCGPart1.setXCG01128(XCG01128);
	}

	/**
	* Sets the xcg01129 of this vr technical spec_xcg part1.
	*
	* @param XCG01129 the xcg01129 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01129(java.lang.String XCG01129) {
		_vrTechnicalSpec_XCGPart1.setXCG01129(XCG01129);
	}

	/**
	* Sets the xcg01130 of this vr technical spec_xcg part1.
	*
	* @param XCG01130 the xcg01130 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01130(java.lang.String XCG01130) {
		_vrTechnicalSpec_XCGPart1.setXCG01130(XCG01130);
	}

	/**
	* Sets the xcg01131 of this vr technical spec_xcg part1.
	*
	* @param XCG01131 the xcg01131 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01131(java.lang.String XCG01131) {
		_vrTechnicalSpec_XCGPart1.setXCG01131(XCG01131);
	}

	/**
	* Sets the xcg01132 of this vr technical spec_xcg part1.
	*
	* @param XCG01132 the xcg01132 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01132(java.lang.String XCG01132) {
		_vrTechnicalSpec_XCGPart1.setXCG01132(XCG01132);
	}

	/**
	* Sets the xcg01133 of this vr technical spec_xcg part1.
	*
	* @param XCG01133 the xcg01133 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01133(java.lang.String XCG01133) {
		_vrTechnicalSpec_XCGPart1.setXCG01133(XCG01133);
	}

	/**
	* Sets the xcg01134 of this vr technical spec_xcg part1.
	*
	* @param XCG01134 the xcg01134 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01134(java.lang.String XCG01134) {
		_vrTechnicalSpec_XCGPart1.setXCG01134(XCG01134);
	}

	/**
	* Sets the xcg01135 of this vr technical spec_xcg part1.
	*
	* @param XCG01135 the xcg01135 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01135(java.lang.String XCG01135) {
		_vrTechnicalSpec_XCGPart1.setXCG01135(XCG01135);
	}

	/**
	* Sets the xcg01136 of this vr technical spec_xcg part1.
	*
	* @param XCG01136 the xcg01136 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01136(java.lang.String XCG01136) {
		_vrTechnicalSpec_XCGPart1.setXCG01136(XCG01136);
	}

	/**
	* Sets the xcg01137 of this vr technical spec_xcg part1.
	*
	* @param XCG01137 the xcg01137 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01137(java.lang.String XCG01137) {
		_vrTechnicalSpec_XCGPart1.setXCG01137(XCG01137);
	}

	/**
	* Sets the xcg01138 of this vr technical spec_xcg part1.
	*
	* @param XCG01138 the xcg01138 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01138(java.lang.String XCG01138) {
		_vrTechnicalSpec_XCGPart1.setXCG01138(XCG01138);
	}

	/**
	* Sets the xcg01139 of this vr technical spec_xcg part1.
	*
	* @param XCG01139 the xcg01139 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01139(java.lang.String XCG01139) {
		_vrTechnicalSpec_XCGPart1.setXCG01139(XCG01139);
	}

	/**
	* Sets the xcg01140 of this vr technical spec_xcg part1.
	*
	* @param XCG01140 the xcg01140 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01140(java.lang.String XCG01140) {
		_vrTechnicalSpec_XCGPart1.setXCG01140(XCG01140);
	}

	/**
	* Sets the xcg01141 of this vr technical spec_xcg part1.
	*
	* @param XCG01141 the xcg01141 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01141(java.lang.String XCG01141) {
		_vrTechnicalSpec_XCGPart1.setXCG01141(XCG01141);
	}

	/**
	* Sets the xcg01142 of this vr technical spec_xcg part1.
	*
	* @param XCG01142 the xcg01142 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01142(java.lang.String XCG01142) {
		_vrTechnicalSpec_XCGPart1.setXCG01142(XCG01142);
	}

	/**
	* Sets the xcg01143 of this vr technical spec_xcg part1.
	*
	* @param XCG01143 the xcg01143 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01143(java.lang.String XCG01143) {
		_vrTechnicalSpec_XCGPart1.setXCG01143(XCG01143);
	}

	/**
	* Sets the xcg01144 of this vr technical spec_xcg part1.
	*
	* @param XCG01144 the xcg01144 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01144(java.lang.String XCG01144) {
		_vrTechnicalSpec_XCGPart1.setXCG01144(XCG01144);
	}

	/**
	* Sets the xcg01145 of this vr technical spec_xcg part1.
	*
	* @param XCG01145 the xcg01145 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01145(java.lang.String XCG01145) {
		_vrTechnicalSpec_XCGPart1.setXCG01145(XCG01145);
	}

	/**
	* Sets the xcg01146 of this vr technical spec_xcg part1.
	*
	* @param XCG01146 the xcg01146 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01146(java.lang.String XCG01146) {
		_vrTechnicalSpec_XCGPart1.setXCG01146(XCG01146);
	}

	/**
	* Sets the xcg01147 of this vr technical spec_xcg part1.
	*
	* @param XCG01147 the xcg01147 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01147(java.lang.String XCG01147) {
		_vrTechnicalSpec_XCGPart1.setXCG01147(XCG01147);
	}

	/**
	* Sets the xcg01148 of this vr technical spec_xcg part1.
	*
	* @param XCG01148 the xcg01148 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01148(java.lang.String XCG01148) {
		_vrTechnicalSpec_XCGPart1.setXCG01148(XCG01148);
	}

	/**
	* Sets the xcg01149 of this vr technical spec_xcg part1.
	*
	* @param XCG01149 the xcg01149 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01149(java.lang.String XCG01149) {
		_vrTechnicalSpec_XCGPart1.setXCG01149(XCG01149);
	}

	/**
	* Sets the xcg01150 of this vr technical spec_xcg part1.
	*
	* @param XCG01150 the xcg01150 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01150(java.lang.String XCG01150) {
		_vrTechnicalSpec_XCGPart1.setXCG01150(XCG01150);
	}

	/**
	* Sets the xcg01151 of this vr technical spec_xcg part1.
	*
	* @param XCG01151 the xcg01151 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01151(java.lang.String XCG01151) {
		_vrTechnicalSpec_XCGPart1.setXCG01151(XCG01151);
	}

	/**
	* Sets the xcg01152 of this vr technical spec_xcg part1.
	*
	* @param XCG01152 the xcg01152 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01152(java.lang.String XCG01152) {
		_vrTechnicalSpec_XCGPart1.setXCG01152(XCG01152);
	}

	/**
	* Sets the xcg01153 of this vr technical spec_xcg part1.
	*
	* @param XCG01153 the xcg01153 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01153(java.lang.String XCG01153) {
		_vrTechnicalSpec_XCGPart1.setXCG01153(XCG01153);
	}

	/**
	* Sets the xcg01154 of this vr technical spec_xcg part1.
	*
	* @param XCG01154 the xcg01154 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01154(java.lang.String XCG01154) {
		_vrTechnicalSpec_XCGPart1.setXCG01154(XCG01154);
	}

	/**
	* Sets the xcg01155 of this vr technical spec_xcg part1.
	*
	* @param XCG01155 the xcg01155 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01155(java.lang.String XCG01155) {
		_vrTechnicalSpec_XCGPart1.setXCG01155(XCG01155);
	}

	/**
	* Sets the xcg01156 of this vr technical spec_xcg part1.
	*
	* @param XCG01156 the xcg01156 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01156(java.lang.String XCG01156) {
		_vrTechnicalSpec_XCGPart1.setXCG01156(XCG01156);
	}

	/**
	* Sets the xcg01157 of this vr technical spec_xcg part1.
	*
	* @param XCG01157 the xcg01157 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01157(java.lang.String XCG01157) {
		_vrTechnicalSpec_XCGPart1.setXCG01157(XCG01157);
	}

	/**
	* Sets the xcg01158 of this vr technical spec_xcg part1.
	*
	* @param XCG01158 the xcg01158 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01158(java.lang.String XCG01158) {
		_vrTechnicalSpec_XCGPart1.setXCG01158(XCG01158);
	}

	/**
	* Sets the xcg01159 of this vr technical spec_xcg part1.
	*
	* @param XCG01159 the xcg01159 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01159(java.lang.String XCG01159) {
		_vrTechnicalSpec_XCGPart1.setXCG01159(XCG01159);
	}

	/**
	* Sets the xcg01160 of this vr technical spec_xcg part1.
	*
	* @param XCG01160 the xcg01160 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01160(java.lang.String XCG01160) {
		_vrTechnicalSpec_XCGPart1.setXCG01160(XCG01160);
	}

	/**
	* Sets the xcg01161 of this vr technical spec_xcg part1.
	*
	* @param XCG01161 the xcg01161 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01161(java.lang.String XCG01161) {
		_vrTechnicalSpec_XCGPart1.setXCG01161(XCG01161);
	}

	/**
	* Sets the xcg01162 of this vr technical spec_xcg part1.
	*
	* @param XCG01162 the xcg01162 of this vr technical spec_xcg part1
	*/
	@Override
	public void setXCG01162(java.lang.String XCG01162) {
		_vrTechnicalSpec_XCGPart1.setXCG01162(XCG01162);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGPart1Wrapper)) {
			return false;
		}

		VRTechnicalSpec_XCGPart1Wrapper vrTechnicalSpec_XCGPart1Wrapper = (VRTechnicalSpec_XCGPart1Wrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XCGPart1,
					vrTechnicalSpec_XCGPart1Wrapper._vrTechnicalSpec_XCGPart1)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XCGPart1 getWrappedModel() {
		return _vrTechnicalSpec_XCGPart1;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XCGPart1.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XCGPart1.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XCGPart1.resetOriginalValues();
	}

	private final VRTechnicalSpec_XCGPart1 _vrTechnicalSpec_XCGPart1;
}