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
 * This class is a wrapper for {@link VRTechnicalSpec_XCN}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCN
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCNWrapper implements VRTechnicalSpec_XCN,
	ModelWrapper<VRTechnicalSpec_XCN> {
	public VRTechnicalSpec_XCNWrapper(VRTechnicalSpec_XCN vrTechnicalSpec_XCN) {
		_vrTechnicalSpec_XCN = vrTechnicalSpec_XCN;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XCN.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XCN.class.getName();
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
		attributes.put("XCN01001", getXCN01001());
		attributes.put("XCN01002", getXCN01002());
		attributes.put("XCN01003", getXCN01003());
		attributes.put("XCN01004", getXCN01004());
		attributes.put("XCN01005", getXCN01005());
		attributes.put("XCN01006", getXCN01006());
		attributes.put("XCN01007", getXCN01007());
		attributes.put("XCN01008", getXCN01008());
		attributes.put("XCN01009", getXCN01009());
		attributes.put("XCN01010", getXCN01010());
		attributes.put("XCN01011", getXCN01011());
		attributes.put("XCN01012", getXCN01012());
		attributes.put("XCN01013", getXCN01013());
		attributes.put("XCN01014", getXCN01014());
		attributes.put("XCN01016", getXCN01016());
		attributes.put("XCN01017", getXCN01017());
		attributes.put("XCN01019", getXCN01019());
		attributes.put("XCN01020", getXCN01020());
		attributes.put("XCN01021", getXCN01021());
		attributes.put("XCN01022", getXCN01022());
		attributes.put("XCN01024", getXCN01024());
		attributes.put("XCN01025", getXCN01025());
		attributes.put("XCN01026", getXCN01026());
		attributes.put("XCN01027", getXCN01027());
		attributes.put("XCN01028", getXCN01028());
		attributes.put("XCN01030", getXCN01030());
		attributes.put("XCN01031", getXCN01031());
		attributes.put("XCN01032", getXCN01032());
		attributes.put("XCN01033", getXCN01033());
		attributes.put("XCN01034", getXCN01034());
		attributes.put("XCN01035", getXCN01035());
		attributes.put("XCN01036", getXCN01036());
		attributes.put("XCN01037", getXCN01037());
		attributes.put("XCN01038", getXCN01038());
		attributes.put("XCN01039", getXCN01039());
		attributes.put("XCN01040", getXCN01040());
		attributes.put("XCN01041", getXCN01041());
		attributes.put("XCN01042", getXCN01042());
		attributes.put("XCN01043", getXCN01043());
		attributes.put("XCN01044", getXCN01044());
		attributes.put("XCN01045", getXCN01045());
		attributes.put("XCN01046", getXCN01046());
		attributes.put("XCN01047", getXCN01047());
		attributes.put("XCN01049", getXCN01049());
		attributes.put("XCN01050", getXCN01050());
		attributes.put("XCN01051", getXCN01051());
		attributes.put("XCN01052", getXCN01052());
		attributes.put("XCN01053", getXCN01053());
		attributes.put("XCN01054", getXCN01054());
		attributes.put("XCN01055", getXCN01055());
		attributes.put("XCN01056", getXCN01056());
		attributes.put("XCN01057", getXCN01057());
		attributes.put("XCN01058", getXCN01058());
		attributes.put("XCN01059", getXCN01059());
		attributes.put("XCN01060", getXCN01060());
		attributes.put("XCN01062", getXCN01062());
		attributes.put("XCN01063", getXCN01063());
		attributes.put("XCN01064", getXCN01064());
		attributes.put("XCN01065", getXCN01065());
		attributes.put("XCN01066", getXCN01066());
		attributes.put("XCN01067", getXCN01067());
		attributes.put("XCN01068", getXCN01068());
		attributes.put("XCN01069", getXCN01069());
		attributes.put("XCN01100", getXCN01100());
		attributes.put("XCN01101", getXCN01101());
		attributes.put("XCN01102", getXCN01102());
		attributes.put("XCN01103", getXCN01103());
		attributes.put("XCN01104", getXCN01104());
		attributes.put("XCN01105", getXCN01105());
		attributes.put("XCN01106", getXCN01106());
		attributes.put("XCN01107", getXCN01107());
		attributes.put("XCN01108", getXCN01108());
		attributes.put("XCN01109", getXCN01109());
		attributes.put("XCN01110", getXCN01110());
		attributes.put("XCN01111", getXCN01111());
		attributes.put("XCN01112", getXCN01112());
		attributes.put("XCN01113", getXCN01113());
		attributes.put("XCN01114", getXCN01114());
		attributes.put("XCN01115", getXCN01115());
		attributes.put("XCN01116", getXCN01116());
		attributes.put("XCN01117", getXCN01117());
		attributes.put("XCN01118", getXCN01118());
		attributes.put("XCN01119", getXCN01119());
		attributes.put("XCN01120", getXCN01120());
		attributes.put("XCN01121", getXCN01121());
		attributes.put("XCN01122", getXCN01122());
		attributes.put("XCN01123", getXCN01123());
		attributes.put("XCN01124", getXCN01124());
		attributes.put("XCN01125", getXCN01125());
		attributes.put("XCN01126", getXCN01126());
		attributes.put("XCN01127", getXCN01127());
		attributes.put("XCN01128", getXCN01128());
		attributes.put("XCN01129", getXCN01129());
		attributes.put("XCN01130", getXCN01130());
		attributes.put("XCN01131", getXCN01131());
		attributes.put("XCN01132", getXCN01132());
		attributes.put("XCN01133", getXCN01133());
		attributes.put("XCN01134", getXCN01134());
		attributes.put("XCN01135", getXCN01135());
		attributes.put("XCN01136", getXCN01136());
		attributes.put("XCN01137", getXCN01137());
		attributes.put("XCN01138", getXCN01138());
		attributes.put("XCN01139", getXCN01139());
		attributes.put("XCN01140", getXCN01140());
		attributes.put("XCN01141", getXCN01141());
		attributes.put("XCN01142", getXCN01142());
		attributes.put("XCN01143", getXCN01143());
		attributes.put("XCN01144", getXCN01144());
		attributes.put("XCN01145", getXCN01145());
		attributes.put("XCN01146", getXCN01146());
		attributes.put("XCN01147", getXCN01147());
		attributes.put("XCN01148", getXCN01148());
		attributes.put("XCN01149", getXCN01149());
		attributes.put("XCN01150", getXCN01150());
		attributes.put("XCN01151", getXCN01151());
		attributes.put("XCN01152", getXCN01152());
		attributes.put("XCN01153", getXCN01153());
		attributes.put("XCN01154", getXCN01154());
		attributes.put("XCN01155", getXCN01155());
		attributes.put("XCN01156", getXCN01156());
		attributes.put("XCN01157", getXCN01157());
		attributes.put("XCN01158", getXCN01158());
		attributes.put("XCN01159", getXCN01159());
		attributes.put("XCN01160", getXCN01160());
		attributes.put("XCN01161", getXCN01161());
		attributes.put("XCN01162", getXCN01162());
		attributes.put("XCN01163", getXCN01163());
		attributes.put("XCN01164", getXCN01164());
		attributes.put("XCN01165", getXCN01165());
		attributes.put("XCN01166", getXCN01166());
		attributes.put("XCN01167", getXCN01167());
		attributes.put("XCN01168", getXCN01168());
		attributes.put("XCN01169", getXCN01169());
		attributes.put("XCN01170", getXCN01170());
		attributes.put("XCN01171", getXCN01171());
		attributes.put("XCN01172", getXCN01172());
		attributes.put("XCN01173", getXCN01173());
		attributes.put("XCN01174", getXCN01174());
		attributes.put("XCN01175", getXCN01175());
		attributes.put("XCN01176", getXCN01176());
		attributes.put("XCN01177", getXCN01177());
		attributes.put("XCN01178", getXCN01178());
		attributes.put("XCN01179", getXCN01179());
		attributes.put("XCN01180", getXCN01180());
		attributes.put("XCN01181", getXCN01181());
		attributes.put("XCN01182", getXCN01182());
		attributes.put("XCN01183", getXCN01183());
		attributes.put("XCN01184", getXCN01184());
		attributes.put("XCN01185", getXCN01185());
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

		String XCN01001 = (String)attributes.get("XCN01001");

		if (XCN01001 != null) {
			setXCN01001(XCN01001);
		}

		String XCN01002 = (String)attributes.get("XCN01002");

		if (XCN01002 != null) {
			setXCN01002(XCN01002);
		}

		String XCN01003 = (String)attributes.get("XCN01003");

		if (XCN01003 != null) {
			setXCN01003(XCN01003);
		}

		String XCN01004 = (String)attributes.get("XCN01004");

		if (XCN01004 != null) {
			setXCN01004(XCN01004);
		}

		String XCN01005 = (String)attributes.get("XCN01005");

		if (XCN01005 != null) {
			setXCN01005(XCN01005);
		}

		String XCN01006 = (String)attributes.get("XCN01006");

		if (XCN01006 != null) {
			setXCN01006(XCN01006);
		}

		String XCN01007 = (String)attributes.get("XCN01007");

		if (XCN01007 != null) {
			setXCN01007(XCN01007);
		}

		String XCN01008 = (String)attributes.get("XCN01008");

		if (XCN01008 != null) {
			setXCN01008(XCN01008);
		}

		String XCN01009 = (String)attributes.get("XCN01009");

		if (XCN01009 != null) {
			setXCN01009(XCN01009);
		}

		String XCN01010 = (String)attributes.get("XCN01010");

		if (XCN01010 != null) {
			setXCN01010(XCN01010);
		}

		String XCN01011 = (String)attributes.get("XCN01011");

		if (XCN01011 != null) {
			setXCN01011(XCN01011);
		}

		String XCN01012 = (String)attributes.get("XCN01012");

		if (XCN01012 != null) {
			setXCN01012(XCN01012);
		}

		String XCN01013 = (String)attributes.get("XCN01013");

		if (XCN01013 != null) {
			setXCN01013(XCN01013);
		}

		String XCN01014 = (String)attributes.get("XCN01014");

		if (XCN01014 != null) {
			setXCN01014(XCN01014);
		}

		String XCN01016 = (String)attributes.get("XCN01016");

		if (XCN01016 != null) {
			setXCN01016(XCN01016);
		}

		String XCN01017 = (String)attributes.get("XCN01017");

		if (XCN01017 != null) {
			setXCN01017(XCN01017);
		}

		String XCN01019 = (String)attributes.get("XCN01019");

		if (XCN01019 != null) {
			setXCN01019(XCN01019);
		}

		String XCN01020 = (String)attributes.get("XCN01020");

		if (XCN01020 != null) {
			setXCN01020(XCN01020);
		}

		String XCN01021 = (String)attributes.get("XCN01021");

		if (XCN01021 != null) {
			setXCN01021(XCN01021);
		}

		String XCN01022 = (String)attributes.get("XCN01022");

		if (XCN01022 != null) {
			setXCN01022(XCN01022);
		}

		String XCN01024 = (String)attributes.get("XCN01024");

		if (XCN01024 != null) {
			setXCN01024(XCN01024);
		}

		String XCN01025 = (String)attributes.get("XCN01025");

		if (XCN01025 != null) {
			setXCN01025(XCN01025);
		}

		String XCN01026 = (String)attributes.get("XCN01026");

		if (XCN01026 != null) {
			setXCN01026(XCN01026);
		}

		String XCN01027 = (String)attributes.get("XCN01027");

		if (XCN01027 != null) {
			setXCN01027(XCN01027);
		}

		String XCN01028 = (String)attributes.get("XCN01028");

		if (XCN01028 != null) {
			setXCN01028(XCN01028);
		}

		String XCN01030 = (String)attributes.get("XCN01030");

		if (XCN01030 != null) {
			setXCN01030(XCN01030);
		}

		String XCN01031 = (String)attributes.get("XCN01031");

		if (XCN01031 != null) {
			setXCN01031(XCN01031);
		}

		String XCN01032 = (String)attributes.get("XCN01032");

		if (XCN01032 != null) {
			setXCN01032(XCN01032);
		}

		String XCN01033 = (String)attributes.get("XCN01033");

		if (XCN01033 != null) {
			setXCN01033(XCN01033);
		}

		String XCN01034 = (String)attributes.get("XCN01034");

		if (XCN01034 != null) {
			setXCN01034(XCN01034);
		}

		String XCN01035 = (String)attributes.get("XCN01035");

		if (XCN01035 != null) {
			setXCN01035(XCN01035);
		}

		String XCN01036 = (String)attributes.get("XCN01036");

		if (XCN01036 != null) {
			setXCN01036(XCN01036);
		}

		String XCN01037 = (String)attributes.get("XCN01037");

		if (XCN01037 != null) {
			setXCN01037(XCN01037);
		}

		String XCN01038 = (String)attributes.get("XCN01038");

		if (XCN01038 != null) {
			setXCN01038(XCN01038);
		}

		String XCN01039 = (String)attributes.get("XCN01039");

		if (XCN01039 != null) {
			setXCN01039(XCN01039);
		}

		String XCN01040 = (String)attributes.get("XCN01040");

		if (XCN01040 != null) {
			setXCN01040(XCN01040);
		}

		String XCN01041 = (String)attributes.get("XCN01041");

		if (XCN01041 != null) {
			setXCN01041(XCN01041);
		}

		String XCN01042 = (String)attributes.get("XCN01042");

		if (XCN01042 != null) {
			setXCN01042(XCN01042);
		}

		String XCN01043 = (String)attributes.get("XCN01043");

		if (XCN01043 != null) {
			setXCN01043(XCN01043);
		}

		String XCN01044 = (String)attributes.get("XCN01044");

		if (XCN01044 != null) {
			setXCN01044(XCN01044);
		}

		String XCN01045 = (String)attributes.get("XCN01045");

		if (XCN01045 != null) {
			setXCN01045(XCN01045);
		}

		String XCN01046 = (String)attributes.get("XCN01046");

		if (XCN01046 != null) {
			setXCN01046(XCN01046);
		}

		String XCN01047 = (String)attributes.get("XCN01047");

		if (XCN01047 != null) {
			setXCN01047(XCN01047);
		}

		String XCN01049 = (String)attributes.get("XCN01049");

		if (XCN01049 != null) {
			setXCN01049(XCN01049);
		}

		String XCN01050 = (String)attributes.get("XCN01050");

		if (XCN01050 != null) {
			setXCN01050(XCN01050);
		}

		String XCN01051 = (String)attributes.get("XCN01051");

		if (XCN01051 != null) {
			setXCN01051(XCN01051);
		}

		String XCN01052 = (String)attributes.get("XCN01052");

		if (XCN01052 != null) {
			setXCN01052(XCN01052);
		}

		String XCN01053 = (String)attributes.get("XCN01053");

		if (XCN01053 != null) {
			setXCN01053(XCN01053);
		}

		String XCN01054 = (String)attributes.get("XCN01054");

		if (XCN01054 != null) {
			setXCN01054(XCN01054);
		}

		String XCN01055 = (String)attributes.get("XCN01055");

		if (XCN01055 != null) {
			setXCN01055(XCN01055);
		}

		String XCN01056 = (String)attributes.get("XCN01056");

		if (XCN01056 != null) {
			setXCN01056(XCN01056);
		}

		String XCN01057 = (String)attributes.get("XCN01057");

		if (XCN01057 != null) {
			setXCN01057(XCN01057);
		}

		String XCN01058 = (String)attributes.get("XCN01058");

		if (XCN01058 != null) {
			setXCN01058(XCN01058);
		}

		String XCN01059 = (String)attributes.get("XCN01059");

		if (XCN01059 != null) {
			setXCN01059(XCN01059);
		}

		String XCN01060 = (String)attributes.get("XCN01060");

		if (XCN01060 != null) {
			setXCN01060(XCN01060);
		}

		String XCN01062 = (String)attributes.get("XCN01062");

		if (XCN01062 != null) {
			setXCN01062(XCN01062);
		}

		String XCN01063 = (String)attributes.get("XCN01063");

		if (XCN01063 != null) {
			setXCN01063(XCN01063);
		}

		String XCN01064 = (String)attributes.get("XCN01064");

		if (XCN01064 != null) {
			setXCN01064(XCN01064);
		}

		String XCN01065 = (String)attributes.get("XCN01065");

		if (XCN01065 != null) {
			setXCN01065(XCN01065);
		}

		String XCN01066 = (String)attributes.get("XCN01066");

		if (XCN01066 != null) {
			setXCN01066(XCN01066);
		}

		String XCN01067 = (String)attributes.get("XCN01067");

		if (XCN01067 != null) {
			setXCN01067(XCN01067);
		}

		String XCN01068 = (String)attributes.get("XCN01068");

		if (XCN01068 != null) {
			setXCN01068(XCN01068);
		}

		String XCN01069 = (String)attributes.get("XCN01069");

		if (XCN01069 != null) {
			setXCN01069(XCN01069);
		}

		String XCN01100 = (String)attributes.get("XCN01100");

		if (XCN01100 != null) {
			setXCN01100(XCN01100);
		}

		String XCN01101 = (String)attributes.get("XCN01101");

		if (XCN01101 != null) {
			setXCN01101(XCN01101);
		}

		String XCN01102 = (String)attributes.get("XCN01102");

		if (XCN01102 != null) {
			setXCN01102(XCN01102);
		}

		String XCN01103 = (String)attributes.get("XCN01103");

		if (XCN01103 != null) {
			setXCN01103(XCN01103);
		}

		String XCN01104 = (String)attributes.get("XCN01104");

		if (XCN01104 != null) {
			setXCN01104(XCN01104);
		}

		String XCN01105 = (String)attributes.get("XCN01105");

		if (XCN01105 != null) {
			setXCN01105(XCN01105);
		}

		String XCN01106 = (String)attributes.get("XCN01106");

		if (XCN01106 != null) {
			setXCN01106(XCN01106);
		}

		String XCN01107 = (String)attributes.get("XCN01107");

		if (XCN01107 != null) {
			setXCN01107(XCN01107);
		}

		String XCN01108 = (String)attributes.get("XCN01108");

		if (XCN01108 != null) {
			setXCN01108(XCN01108);
		}

		String XCN01109 = (String)attributes.get("XCN01109");

		if (XCN01109 != null) {
			setXCN01109(XCN01109);
		}

		String XCN01110 = (String)attributes.get("XCN01110");

		if (XCN01110 != null) {
			setXCN01110(XCN01110);
		}

		String XCN01111 = (String)attributes.get("XCN01111");

		if (XCN01111 != null) {
			setXCN01111(XCN01111);
		}

		String XCN01112 = (String)attributes.get("XCN01112");

		if (XCN01112 != null) {
			setXCN01112(XCN01112);
		}

		String XCN01113 = (String)attributes.get("XCN01113");

		if (XCN01113 != null) {
			setXCN01113(XCN01113);
		}

		String XCN01114 = (String)attributes.get("XCN01114");

		if (XCN01114 != null) {
			setXCN01114(XCN01114);
		}

		String XCN01115 = (String)attributes.get("XCN01115");

		if (XCN01115 != null) {
			setXCN01115(XCN01115);
		}

		String XCN01116 = (String)attributes.get("XCN01116");

		if (XCN01116 != null) {
			setXCN01116(XCN01116);
		}

		String XCN01117 = (String)attributes.get("XCN01117");

		if (XCN01117 != null) {
			setXCN01117(XCN01117);
		}

		String XCN01118 = (String)attributes.get("XCN01118");

		if (XCN01118 != null) {
			setXCN01118(XCN01118);
		}

		String XCN01119 = (String)attributes.get("XCN01119");

		if (XCN01119 != null) {
			setXCN01119(XCN01119);
		}

		String XCN01120 = (String)attributes.get("XCN01120");

		if (XCN01120 != null) {
			setXCN01120(XCN01120);
		}

		String XCN01121 = (String)attributes.get("XCN01121");

		if (XCN01121 != null) {
			setXCN01121(XCN01121);
		}

		String XCN01122 = (String)attributes.get("XCN01122");

		if (XCN01122 != null) {
			setXCN01122(XCN01122);
		}

		String XCN01123 = (String)attributes.get("XCN01123");

		if (XCN01123 != null) {
			setXCN01123(XCN01123);
		}

		String XCN01124 = (String)attributes.get("XCN01124");

		if (XCN01124 != null) {
			setXCN01124(XCN01124);
		}

		String XCN01125 = (String)attributes.get("XCN01125");

		if (XCN01125 != null) {
			setXCN01125(XCN01125);
		}

		String XCN01126 = (String)attributes.get("XCN01126");

		if (XCN01126 != null) {
			setXCN01126(XCN01126);
		}

		String XCN01127 = (String)attributes.get("XCN01127");

		if (XCN01127 != null) {
			setXCN01127(XCN01127);
		}

		String XCN01128 = (String)attributes.get("XCN01128");

		if (XCN01128 != null) {
			setXCN01128(XCN01128);
		}

		String XCN01129 = (String)attributes.get("XCN01129");

		if (XCN01129 != null) {
			setXCN01129(XCN01129);
		}

		String XCN01130 = (String)attributes.get("XCN01130");

		if (XCN01130 != null) {
			setXCN01130(XCN01130);
		}

		String XCN01131 = (String)attributes.get("XCN01131");

		if (XCN01131 != null) {
			setXCN01131(XCN01131);
		}

		String XCN01132 = (String)attributes.get("XCN01132");

		if (XCN01132 != null) {
			setXCN01132(XCN01132);
		}

		String XCN01133 = (String)attributes.get("XCN01133");

		if (XCN01133 != null) {
			setXCN01133(XCN01133);
		}

		String XCN01134 = (String)attributes.get("XCN01134");

		if (XCN01134 != null) {
			setXCN01134(XCN01134);
		}

		String XCN01135 = (String)attributes.get("XCN01135");

		if (XCN01135 != null) {
			setXCN01135(XCN01135);
		}

		String XCN01136 = (String)attributes.get("XCN01136");

		if (XCN01136 != null) {
			setXCN01136(XCN01136);
		}

		String XCN01137 = (String)attributes.get("XCN01137");

		if (XCN01137 != null) {
			setXCN01137(XCN01137);
		}

		String XCN01138 = (String)attributes.get("XCN01138");

		if (XCN01138 != null) {
			setXCN01138(XCN01138);
		}

		String XCN01139 = (String)attributes.get("XCN01139");

		if (XCN01139 != null) {
			setXCN01139(XCN01139);
		}

		String XCN01140 = (String)attributes.get("XCN01140");

		if (XCN01140 != null) {
			setXCN01140(XCN01140);
		}

		String XCN01141 = (String)attributes.get("XCN01141");

		if (XCN01141 != null) {
			setXCN01141(XCN01141);
		}

		String XCN01142 = (String)attributes.get("XCN01142");

		if (XCN01142 != null) {
			setXCN01142(XCN01142);
		}

		String XCN01143 = (String)attributes.get("XCN01143");

		if (XCN01143 != null) {
			setXCN01143(XCN01143);
		}

		String XCN01144 = (String)attributes.get("XCN01144");

		if (XCN01144 != null) {
			setXCN01144(XCN01144);
		}

		String XCN01145 = (String)attributes.get("XCN01145");

		if (XCN01145 != null) {
			setXCN01145(XCN01145);
		}

		String XCN01146 = (String)attributes.get("XCN01146");

		if (XCN01146 != null) {
			setXCN01146(XCN01146);
		}

		String XCN01147 = (String)attributes.get("XCN01147");

		if (XCN01147 != null) {
			setXCN01147(XCN01147);
		}

		String XCN01148 = (String)attributes.get("XCN01148");

		if (XCN01148 != null) {
			setXCN01148(XCN01148);
		}

		String XCN01149 = (String)attributes.get("XCN01149");

		if (XCN01149 != null) {
			setXCN01149(XCN01149);
		}

		String XCN01150 = (String)attributes.get("XCN01150");

		if (XCN01150 != null) {
			setXCN01150(XCN01150);
		}

		String XCN01151 = (String)attributes.get("XCN01151");

		if (XCN01151 != null) {
			setXCN01151(XCN01151);
		}

		String XCN01152 = (String)attributes.get("XCN01152");

		if (XCN01152 != null) {
			setXCN01152(XCN01152);
		}

		String XCN01153 = (String)attributes.get("XCN01153");

		if (XCN01153 != null) {
			setXCN01153(XCN01153);
		}

		String XCN01154 = (String)attributes.get("XCN01154");

		if (XCN01154 != null) {
			setXCN01154(XCN01154);
		}

		String XCN01155 = (String)attributes.get("XCN01155");

		if (XCN01155 != null) {
			setXCN01155(XCN01155);
		}

		String XCN01156 = (String)attributes.get("XCN01156");

		if (XCN01156 != null) {
			setXCN01156(XCN01156);
		}

		String XCN01157 = (String)attributes.get("XCN01157");

		if (XCN01157 != null) {
			setXCN01157(XCN01157);
		}

		String XCN01158 = (String)attributes.get("XCN01158");

		if (XCN01158 != null) {
			setXCN01158(XCN01158);
		}

		String XCN01159 = (String)attributes.get("XCN01159");

		if (XCN01159 != null) {
			setXCN01159(XCN01159);
		}

		String XCN01160 = (String)attributes.get("XCN01160");

		if (XCN01160 != null) {
			setXCN01160(XCN01160);
		}

		String XCN01161 = (String)attributes.get("XCN01161");

		if (XCN01161 != null) {
			setXCN01161(XCN01161);
		}

		String XCN01162 = (String)attributes.get("XCN01162");

		if (XCN01162 != null) {
			setXCN01162(XCN01162);
		}

		String XCN01163 = (String)attributes.get("XCN01163");

		if (XCN01163 != null) {
			setXCN01163(XCN01163);
		}

		String XCN01164 = (String)attributes.get("XCN01164");

		if (XCN01164 != null) {
			setXCN01164(XCN01164);
		}

		String XCN01165 = (String)attributes.get("XCN01165");

		if (XCN01165 != null) {
			setXCN01165(XCN01165);
		}

		String XCN01166 = (String)attributes.get("XCN01166");

		if (XCN01166 != null) {
			setXCN01166(XCN01166);
		}

		String XCN01167 = (String)attributes.get("XCN01167");

		if (XCN01167 != null) {
			setXCN01167(XCN01167);
		}

		String XCN01168 = (String)attributes.get("XCN01168");

		if (XCN01168 != null) {
			setXCN01168(XCN01168);
		}

		String XCN01169 = (String)attributes.get("XCN01169");

		if (XCN01169 != null) {
			setXCN01169(XCN01169);
		}

		String XCN01170 = (String)attributes.get("XCN01170");

		if (XCN01170 != null) {
			setXCN01170(XCN01170);
		}

		String XCN01171 = (String)attributes.get("XCN01171");

		if (XCN01171 != null) {
			setXCN01171(XCN01171);
		}

		String XCN01172 = (String)attributes.get("XCN01172");

		if (XCN01172 != null) {
			setXCN01172(XCN01172);
		}

		String XCN01173 = (String)attributes.get("XCN01173");

		if (XCN01173 != null) {
			setXCN01173(XCN01173);
		}

		String XCN01174 = (String)attributes.get("XCN01174");

		if (XCN01174 != null) {
			setXCN01174(XCN01174);
		}

		String XCN01175 = (String)attributes.get("XCN01175");

		if (XCN01175 != null) {
			setXCN01175(XCN01175);
		}

		String XCN01176 = (String)attributes.get("XCN01176");

		if (XCN01176 != null) {
			setXCN01176(XCN01176);
		}

		String XCN01177 = (String)attributes.get("XCN01177");

		if (XCN01177 != null) {
			setXCN01177(XCN01177);
		}

		String XCN01178 = (String)attributes.get("XCN01178");

		if (XCN01178 != null) {
			setXCN01178(XCN01178);
		}

		String XCN01179 = (String)attributes.get("XCN01179");

		if (XCN01179 != null) {
			setXCN01179(XCN01179);
		}

		String XCN01180 = (String)attributes.get("XCN01180");

		if (XCN01180 != null) {
			setXCN01180(XCN01180);
		}

		String XCN01181 = (String)attributes.get("XCN01181");

		if (XCN01181 != null) {
			setXCN01181(XCN01181);
		}

		String XCN01182 = (String)attributes.get("XCN01182");

		if (XCN01182 != null) {
			setXCN01182(XCN01182);
		}

		String XCN01183 = (String)attributes.get("XCN01183");

		if (XCN01183 != null) {
			setXCN01183(XCN01183);
		}

		String XCN01184 = (String)attributes.get("XCN01184");

		if (XCN01184 != null) {
			setXCN01184(XCN01184);
		}

		String XCN01185 = (String)attributes.get("XCN01185");

		if (XCN01185 != null) {
			setXCN01185(XCN01185);
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
	public VRTechnicalSpec_XCN toEscapedModel() {
		return new VRTechnicalSpec_XCNWrapper(_vrTechnicalSpec_XCN.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XCN toUnescapedModel() {
		return new VRTechnicalSpec_XCNWrapper(_vrTechnicalSpec_XCN.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XCN.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XCN.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XCN.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XCN.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XCN> toCacheModel() {
		return _vrTechnicalSpec_XCN.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XCN vrTechnicalSpec_XCN) {
		return _vrTechnicalSpec_XCN.compareTo(vrTechnicalSpec_XCN);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XCN.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XCN.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XCNWrapper((VRTechnicalSpec_XCN)_vrTechnicalSpec_XCN.clone());
	}

	/**
	* Returns the deliverable code of this vr technical spec_xcn.
	*
	* @return the deliverable code of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XCN.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xcn.
	*
	* @return the dossier ID ctn of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XCN.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xcn.
	*
	* @return the dossier no of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XCN.getDossierNo();
	}

	/**
	* Returns the loai_dong_co of this vr technical spec_xcn.
	*
	* @return the loai_dong_co of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getLoai_dong_co() {
		return _vrTechnicalSpec_XCN.getLoai_dong_co();
	}

	/**
	* Returns the reference uid of this vr technical spec_xcn.
	*
	* @return the reference uid of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XCN.getReferenceUid();
	}

	/**
	* Returns the xcn01001 of this vr technical spec_xcn.
	*
	* @return the xcn01001 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01001() {
		return _vrTechnicalSpec_XCN.getXCN01001();
	}

	/**
	* Returns the xcn01002 of this vr technical spec_xcn.
	*
	* @return the xcn01002 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01002() {
		return _vrTechnicalSpec_XCN.getXCN01002();
	}

	/**
	* Returns the xcn01003 of this vr technical spec_xcn.
	*
	* @return the xcn01003 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01003() {
		return _vrTechnicalSpec_XCN.getXCN01003();
	}

	/**
	* Returns the xcn01004 of this vr technical spec_xcn.
	*
	* @return the xcn01004 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01004() {
		return _vrTechnicalSpec_XCN.getXCN01004();
	}

	/**
	* Returns the xcn01005 of this vr technical spec_xcn.
	*
	* @return the xcn01005 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01005() {
		return _vrTechnicalSpec_XCN.getXCN01005();
	}

	/**
	* Returns the xcn01006 of this vr technical spec_xcn.
	*
	* @return the xcn01006 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01006() {
		return _vrTechnicalSpec_XCN.getXCN01006();
	}

	/**
	* Returns the xcn01007 of this vr technical spec_xcn.
	*
	* @return the xcn01007 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01007() {
		return _vrTechnicalSpec_XCN.getXCN01007();
	}

	/**
	* Returns the xcn01008 of this vr technical spec_xcn.
	*
	* @return the xcn01008 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01008() {
		return _vrTechnicalSpec_XCN.getXCN01008();
	}

	/**
	* Returns the xcn01009 of this vr technical spec_xcn.
	*
	* @return the xcn01009 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01009() {
		return _vrTechnicalSpec_XCN.getXCN01009();
	}

	/**
	* Returns the xcn01010 of this vr technical spec_xcn.
	*
	* @return the xcn01010 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01010() {
		return _vrTechnicalSpec_XCN.getXCN01010();
	}

	/**
	* Returns the xcn01011 of this vr technical spec_xcn.
	*
	* @return the xcn01011 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01011() {
		return _vrTechnicalSpec_XCN.getXCN01011();
	}

	/**
	* Returns the xcn01012 of this vr technical spec_xcn.
	*
	* @return the xcn01012 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01012() {
		return _vrTechnicalSpec_XCN.getXCN01012();
	}

	/**
	* Returns the xcn01013 of this vr technical spec_xcn.
	*
	* @return the xcn01013 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01013() {
		return _vrTechnicalSpec_XCN.getXCN01013();
	}

	/**
	* Returns the xcn01014 of this vr technical spec_xcn.
	*
	* @return the xcn01014 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01014() {
		return _vrTechnicalSpec_XCN.getXCN01014();
	}

	/**
	* Returns the xcn01016 of this vr technical spec_xcn.
	*
	* @return the xcn01016 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01016() {
		return _vrTechnicalSpec_XCN.getXCN01016();
	}

	/**
	* Returns the xcn01017 of this vr technical spec_xcn.
	*
	* @return the xcn01017 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01017() {
		return _vrTechnicalSpec_XCN.getXCN01017();
	}

	/**
	* Returns the xcn01019 of this vr technical spec_xcn.
	*
	* @return the xcn01019 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01019() {
		return _vrTechnicalSpec_XCN.getXCN01019();
	}

	/**
	* Returns the xcn01020 of this vr technical spec_xcn.
	*
	* @return the xcn01020 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01020() {
		return _vrTechnicalSpec_XCN.getXCN01020();
	}

	/**
	* Returns the xcn01021 of this vr technical spec_xcn.
	*
	* @return the xcn01021 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01021() {
		return _vrTechnicalSpec_XCN.getXCN01021();
	}

	/**
	* Returns the xcn01022 of this vr technical spec_xcn.
	*
	* @return the xcn01022 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01022() {
		return _vrTechnicalSpec_XCN.getXCN01022();
	}

	/**
	* Returns the xcn01024 of this vr technical spec_xcn.
	*
	* @return the xcn01024 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01024() {
		return _vrTechnicalSpec_XCN.getXCN01024();
	}

	/**
	* Returns the xcn01025 of this vr technical spec_xcn.
	*
	* @return the xcn01025 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01025() {
		return _vrTechnicalSpec_XCN.getXCN01025();
	}

	/**
	* Returns the xcn01026 of this vr technical spec_xcn.
	*
	* @return the xcn01026 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01026() {
		return _vrTechnicalSpec_XCN.getXCN01026();
	}

	/**
	* Returns the xcn01027 of this vr technical spec_xcn.
	*
	* @return the xcn01027 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01027() {
		return _vrTechnicalSpec_XCN.getXCN01027();
	}

	/**
	* Returns the xcn01028 of this vr technical spec_xcn.
	*
	* @return the xcn01028 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01028() {
		return _vrTechnicalSpec_XCN.getXCN01028();
	}

	/**
	* Returns the xcn01030 of this vr technical spec_xcn.
	*
	* @return the xcn01030 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01030() {
		return _vrTechnicalSpec_XCN.getXCN01030();
	}

	/**
	* Returns the xcn01031 of this vr technical spec_xcn.
	*
	* @return the xcn01031 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01031() {
		return _vrTechnicalSpec_XCN.getXCN01031();
	}

	/**
	* Returns the xcn01032 of this vr technical spec_xcn.
	*
	* @return the xcn01032 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01032() {
		return _vrTechnicalSpec_XCN.getXCN01032();
	}

	/**
	* Returns the xcn01033 of this vr technical spec_xcn.
	*
	* @return the xcn01033 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01033() {
		return _vrTechnicalSpec_XCN.getXCN01033();
	}

	/**
	* Returns the xcn01034 of this vr technical spec_xcn.
	*
	* @return the xcn01034 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01034() {
		return _vrTechnicalSpec_XCN.getXCN01034();
	}

	/**
	* Returns the xcn01035 of this vr technical spec_xcn.
	*
	* @return the xcn01035 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01035() {
		return _vrTechnicalSpec_XCN.getXCN01035();
	}

	/**
	* Returns the xcn01036 of this vr technical spec_xcn.
	*
	* @return the xcn01036 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01036() {
		return _vrTechnicalSpec_XCN.getXCN01036();
	}

	/**
	* Returns the xcn01037 of this vr technical spec_xcn.
	*
	* @return the xcn01037 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01037() {
		return _vrTechnicalSpec_XCN.getXCN01037();
	}

	/**
	* Returns the xcn01038 of this vr technical spec_xcn.
	*
	* @return the xcn01038 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01038() {
		return _vrTechnicalSpec_XCN.getXCN01038();
	}

	/**
	* Returns the xcn01039 of this vr technical spec_xcn.
	*
	* @return the xcn01039 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01039() {
		return _vrTechnicalSpec_XCN.getXCN01039();
	}

	/**
	* Returns the xcn01040 of this vr technical spec_xcn.
	*
	* @return the xcn01040 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01040() {
		return _vrTechnicalSpec_XCN.getXCN01040();
	}

	/**
	* Returns the xcn01041 of this vr technical spec_xcn.
	*
	* @return the xcn01041 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01041() {
		return _vrTechnicalSpec_XCN.getXCN01041();
	}

	/**
	* Returns the xcn01042 of this vr technical spec_xcn.
	*
	* @return the xcn01042 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01042() {
		return _vrTechnicalSpec_XCN.getXCN01042();
	}

	/**
	* Returns the xcn01043 of this vr technical spec_xcn.
	*
	* @return the xcn01043 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01043() {
		return _vrTechnicalSpec_XCN.getXCN01043();
	}

	/**
	* Returns the xcn01044 of this vr technical spec_xcn.
	*
	* @return the xcn01044 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01044() {
		return _vrTechnicalSpec_XCN.getXCN01044();
	}

	/**
	* Returns the xcn01045 of this vr technical spec_xcn.
	*
	* @return the xcn01045 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01045() {
		return _vrTechnicalSpec_XCN.getXCN01045();
	}

	/**
	* Returns the xcn01046 of this vr technical spec_xcn.
	*
	* @return the xcn01046 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01046() {
		return _vrTechnicalSpec_XCN.getXCN01046();
	}

	/**
	* Returns the xcn01047 of this vr technical spec_xcn.
	*
	* @return the xcn01047 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01047() {
		return _vrTechnicalSpec_XCN.getXCN01047();
	}

	/**
	* Returns the xcn01049 of this vr technical spec_xcn.
	*
	* @return the xcn01049 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01049() {
		return _vrTechnicalSpec_XCN.getXCN01049();
	}

	/**
	* Returns the xcn01050 of this vr technical spec_xcn.
	*
	* @return the xcn01050 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01050() {
		return _vrTechnicalSpec_XCN.getXCN01050();
	}

	/**
	* Returns the xcn01051 of this vr technical spec_xcn.
	*
	* @return the xcn01051 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01051() {
		return _vrTechnicalSpec_XCN.getXCN01051();
	}

	/**
	* Returns the xcn01052 of this vr technical spec_xcn.
	*
	* @return the xcn01052 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01052() {
		return _vrTechnicalSpec_XCN.getXCN01052();
	}

	/**
	* Returns the xcn01053 of this vr technical spec_xcn.
	*
	* @return the xcn01053 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01053() {
		return _vrTechnicalSpec_XCN.getXCN01053();
	}

	/**
	* Returns the xcn01054 of this vr technical spec_xcn.
	*
	* @return the xcn01054 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01054() {
		return _vrTechnicalSpec_XCN.getXCN01054();
	}

	/**
	* Returns the xcn01055 of this vr technical spec_xcn.
	*
	* @return the xcn01055 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01055() {
		return _vrTechnicalSpec_XCN.getXCN01055();
	}

	/**
	* Returns the xcn01056 of this vr technical spec_xcn.
	*
	* @return the xcn01056 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01056() {
		return _vrTechnicalSpec_XCN.getXCN01056();
	}

	/**
	* Returns the xcn01057 of this vr technical spec_xcn.
	*
	* @return the xcn01057 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01057() {
		return _vrTechnicalSpec_XCN.getXCN01057();
	}

	/**
	* Returns the xcn01058 of this vr technical spec_xcn.
	*
	* @return the xcn01058 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01058() {
		return _vrTechnicalSpec_XCN.getXCN01058();
	}

	/**
	* Returns the xcn01059 of this vr technical spec_xcn.
	*
	* @return the xcn01059 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01059() {
		return _vrTechnicalSpec_XCN.getXCN01059();
	}

	/**
	* Returns the xcn01060 of this vr technical spec_xcn.
	*
	* @return the xcn01060 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01060() {
		return _vrTechnicalSpec_XCN.getXCN01060();
	}

	/**
	* Returns the xcn01062 of this vr technical spec_xcn.
	*
	* @return the xcn01062 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01062() {
		return _vrTechnicalSpec_XCN.getXCN01062();
	}

	/**
	* Returns the xcn01063 of this vr technical spec_xcn.
	*
	* @return the xcn01063 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01063() {
		return _vrTechnicalSpec_XCN.getXCN01063();
	}

	/**
	* Returns the xcn01064 of this vr technical spec_xcn.
	*
	* @return the xcn01064 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01064() {
		return _vrTechnicalSpec_XCN.getXCN01064();
	}

	/**
	* Returns the xcn01065 of this vr technical spec_xcn.
	*
	* @return the xcn01065 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01065() {
		return _vrTechnicalSpec_XCN.getXCN01065();
	}

	/**
	* Returns the xcn01066 of this vr technical spec_xcn.
	*
	* @return the xcn01066 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01066() {
		return _vrTechnicalSpec_XCN.getXCN01066();
	}

	/**
	* Returns the xcn01067 of this vr technical spec_xcn.
	*
	* @return the xcn01067 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01067() {
		return _vrTechnicalSpec_XCN.getXCN01067();
	}

	/**
	* Returns the xcn01068 of this vr technical spec_xcn.
	*
	* @return the xcn01068 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01068() {
		return _vrTechnicalSpec_XCN.getXCN01068();
	}

	/**
	* Returns the xcn01069 of this vr technical spec_xcn.
	*
	* @return the xcn01069 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01069() {
		return _vrTechnicalSpec_XCN.getXCN01069();
	}

	/**
	* Returns the xcn01100 of this vr technical spec_xcn.
	*
	* @return the xcn01100 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01100() {
		return _vrTechnicalSpec_XCN.getXCN01100();
	}

	/**
	* Returns the xcn01101 of this vr technical spec_xcn.
	*
	* @return the xcn01101 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01101() {
		return _vrTechnicalSpec_XCN.getXCN01101();
	}

	/**
	* Returns the xcn01102 of this vr technical spec_xcn.
	*
	* @return the xcn01102 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01102() {
		return _vrTechnicalSpec_XCN.getXCN01102();
	}

	/**
	* Returns the xcn01103 of this vr technical spec_xcn.
	*
	* @return the xcn01103 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01103() {
		return _vrTechnicalSpec_XCN.getXCN01103();
	}

	/**
	* Returns the xcn01104 of this vr technical spec_xcn.
	*
	* @return the xcn01104 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01104() {
		return _vrTechnicalSpec_XCN.getXCN01104();
	}

	/**
	* Returns the xcn01105 of this vr technical spec_xcn.
	*
	* @return the xcn01105 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01105() {
		return _vrTechnicalSpec_XCN.getXCN01105();
	}

	/**
	* Returns the xcn01106 of this vr technical spec_xcn.
	*
	* @return the xcn01106 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01106() {
		return _vrTechnicalSpec_XCN.getXCN01106();
	}

	/**
	* Returns the xcn01107 of this vr technical spec_xcn.
	*
	* @return the xcn01107 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01107() {
		return _vrTechnicalSpec_XCN.getXCN01107();
	}

	/**
	* Returns the xcn01108 of this vr technical spec_xcn.
	*
	* @return the xcn01108 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01108() {
		return _vrTechnicalSpec_XCN.getXCN01108();
	}

	/**
	* Returns the xcn01109 of this vr technical spec_xcn.
	*
	* @return the xcn01109 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01109() {
		return _vrTechnicalSpec_XCN.getXCN01109();
	}

	/**
	* Returns the xcn01110 of this vr technical spec_xcn.
	*
	* @return the xcn01110 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01110() {
		return _vrTechnicalSpec_XCN.getXCN01110();
	}

	/**
	* Returns the xcn01111 of this vr technical spec_xcn.
	*
	* @return the xcn01111 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01111() {
		return _vrTechnicalSpec_XCN.getXCN01111();
	}

	/**
	* Returns the xcn01112 of this vr technical spec_xcn.
	*
	* @return the xcn01112 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01112() {
		return _vrTechnicalSpec_XCN.getXCN01112();
	}

	/**
	* Returns the xcn01113 of this vr technical spec_xcn.
	*
	* @return the xcn01113 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01113() {
		return _vrTechnicalSpec_XCN.getXCN01113();
	}

	/**
	* Returns the xcn01114 of this vr technical spec_xcn.
	*
	* @return the xcn01114 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01114() {
		return _vrTechnicalSpec_XCN.getXCN01114();
	}

	/**
	* Returns the xcn01115 of this vr technical spec_xcn.
	*
	* @return the xcn01115 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01115() {
		return _vrTechnicalSpec_XCN.getXCN01115();
	}

	/**
	* Returns the xcn01116 of this vr technical spec_xcn.
	*
	* @return the xcn01116 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01116() {
		return _vrTechnicalSpec_XCN.getXCN01116();
	}

	/**
	* Returns the xcn01117 of this vr technical spec_xcn.
	*
	* @return the xcn01117 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01117() {
		return _vrTechnicalSpec_XCN.getXCN01117();
	}

	/**
	* Returns the xcn01118 of this vr technical spec_xcn.
	*
	* @return the xcn01118 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01118() {
		return _vrTechnicalSpec_XCN.getXCN01118();
	}

	/**
	* Returns the xcn01119 of this vr technical spec_xcn.
	*
	* @return the xcn01119 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01119() {
		return _vrTechnicalSpec_XCN.getXCN01119();
	}

	/**
	* Returns the xcn01120 of this vr technical spec_xcn.
	*
	* @return the xcn01120 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01120() {
		return _vrTechnicalSpec_XCN.getXCN01120();
	}

	/**
	* Returns the xcn01121 of this vr technical spec_xcn.
	*
	* @return the xcn01121 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01121() {
		return _vrTechnicalSpec_XCN.getXCN01121();
	}

	/**
	* Returns the xcn01122 of this vr technical spec_xcn.
	*
	* @return the xcn01122 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01122() {
		return _vrTechnicalSpec_XCN.getXCN01122();
	}

	/**
	* Returns the xcn01123 of this vr technical spec_xcn.
	*
	* @return the xcn01123 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01123() {
		return _vrTechnicalSpec_XCN.getXCN01123();
	}

	/**
	* Returns the xcn01124 of this vr technical spec_xcn.
	*
	* @return the xcn01124 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01124() {
		return _vrTechnicalSpec_XCN.getXCN01124();
	}

	/**
	* Returns the xcn01125 of this vr technical spec_xcn.
	*
	* @return the xcn01125 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01125() {
		return _vrTechnicalSpec_XCN.getXCN01125();
	}

	/**
	* Returns the xcn01126 of this vr technical spec_xcn.
	*
	* @return the xcn01126 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01126() {
		return _vrTechnicalSpec_XCN.getXCN01126();
	}

	/**
	* Returns the xcn01127 of this vr technical spec_xcn.
	*
	* @return the xcn01127 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01127() {
		return _vrTechnicalSpec_XCN.getXCN01127();
	}

	/**
	* Returns the xcn01128 of this vr technical spec_xcn.
	*
	* @return the xcn01128 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01128() {
		return _vrTechnicalSpec_XCN.getXCN01128();
	}

	/**
	* Returns the xcn01129 of this vr technical spec_xcn.
	*
	* @return the xcn01129 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01129() {
		return _vrTechnicalSpec_XCN.getXCN01129();
	}

	/**
	* Returns the xcn01130 of this vr technical spec_xcn.
	*
	* @return the xcn01130 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01130() {
		return _vrTechnicalSpec_XCN.getXCN01130();
	}

	/**
	* Returns the xcn01131 of this vr technical spec_xcn.
	*
	* @return the xcn01131 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01131() {
		return _vrTechnicalSpec_XCN.getXCN01131();
	}

	/**
	* Returns the xcn01132 of this vr technical spec_xcn.
	*
	* @return the xcn01132 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01132() {
		return _vrTechnicalSpec_XCN.getXCN01132();
	}

	/**
	* Returns the xcn01133 of this vr technical spec_xcn.
	*
	* @return the xcn01133 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01133() {
		return _vrTechnicalSpec_XCN.getXCN01133();
	}

	/**
	* Returns the xcn01134 of this vr technical spec_xcn.
	*
	* @return the xcn01134 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01134() {
		return _vrTechnicalSpec_XCN.getXCN01134();
	}

	/**
	* Returns the xcn01135 of this vr technical spec_xcn.
	*
	* @return the xcn01135 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01135() {
		return _vrTechnicalSpec_XCN.getXCN01135();
	}

	/**
	* Returns the xcn01136 of this vr technical spec_xcn.
	*
	* @return the xcn01136 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01136() {
		return _vrTechnicalSpec_XCN.getXCN01136();
	}

	/**
	* Returns the xcn01137 of this vr technical spec_xcn.
	*
	* @return the xcn01137 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01137() {
		return _vrTechnicalSpec_XCN.getXCN01137();
	}

	/**
	* Returns the xcn01138 of this vr technical spec_xcn.
	*
	* @return the xcn01138 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01138() {
		return _vrTechnicalSpec_XCN.getXCN01138();
	}

	/**
	* Returns the xcn01139 of this vr technical spec_xcn.
	*
	* @return the xcn01139 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01139() {
		return _vrTechnicalSpec_XCN.getXCN01139();
	}

	/**
	* Returns the xcn01140 of this vr technical spec_xcn.
	*
	* @return the xcn01140 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01140() {
		return _vrTechnicalSpec_XCN.getXCN01140();
	}

	/**
	* Returns the xcn01141 of this vr technical spec_xcn.
	*
	* @return the xcn01141 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01141() {
		return _vrTechnicalSpec_XCN.getXCN01141();
	}

	/**
	* Returns the xcn01142 of this vr technical spec_xcn.
	*
	* @return the xcn01142 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01142() {
		return _vrTechnicalSpec_XCN.getXCN01142();
	}

	/**
	* Returns the xcn01143 of this vr technical spec_xcn.
	*
	* @return the xcn01143 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01143() {
		return _vrTechnicalSpec_XCN.getXCN01143();
	}

	/**
	* Returns the xcn01144 of this vr technical spec_xcn.
	*
	* @return the xcn01144 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01144() {
		return _vrTechnicalSpec_XCN.getXCN01144();
	}

	/**
	* Returns the xcn01145 of this vr technical spec_xcn.
	*
	* @return the xcn01145 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01145() {
		return _vrTechnicalSpec_XCN.getXCN01145();
	}

	/**
	* Returns the xcn01146 of this vr technical spec_xcn.
	*
	* @return the xcn01146 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01146() {
		return _vrTechnicalSpec_XCN.getXCN01146();
	}

	/**
	* Returns the xcn01147 of this vr technical spec_xcn.
	*
	* @return the xcn01147 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01147() {
		return _vrTechnicalSpec_XCN.getXCN01147();
	}

	/**
	* Returns the xcn01148 of this vr technical spec_xcn.
	*
	* @return the xcn01148 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01148() {
		return _vrTechnicalSpec_XCN.getXCN01148();
	}

	/**
	* Returns the xcn01149 of this vr technical spec_xcn.
	*
	* @return the xcn01149 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01149() {
		return _vrTechnicalSpec_XCN.getXCN01149();
	}

	/**
	* Returns the xcn01150 of this vr technical spec_xcn.
	*
	* @return the xcn01150 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01150() {
		return _vrTechnicalSpec_XCN.getXCN01150();
	}

	/**
	* Returns the xcn01151 of this vr technical spec_xcn.
	*
	* @return the xcn01151 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01151() {
		return _vrTechnicalSpec_XCN.getXCN01151();
	}

	/**
	* Returns the xcn01152 of this vr technical spec_xcn.
	*
	* @return the xcn01152 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01152() {
		return _vrTechnicalSpec_XCN.getXCN01152();
	}

	/**
	* Returns the xcn01153 of this vr technical spec_xcn.
	*
	* @return the xcn01153 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01153() {
		return _vrTechnicalSpec_XCN.getXCN01153();
	}

	/**
	* Returns the xcn01154 of this vr technical spec_xcn.
	*
	* @return the xcn01154 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01154() {
		return _vrTechnicalSpec_XCN.getXCN01154();
	}

	/**
	* Returns the xcn01155 of this vr technical spec_xcn.
	*
	* @return the xcn01155 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01155() {
		return _vrTechnicalSpec_XCN.getXCN01155();
	}

	/**
	* Returns the xcn01156 of this vr technical spec_xcn.
	*
	* @return the xcn01156 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01156() {
		return _vrTechnicalSpec_XCN.getXCN01156();
	}

	/**
	* Returns the xcn01157 of this vr technical spec_xcn.
	*
	* @return the xcn01157 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01157() {
		return _vrTechnicalSpec_XCN.getXCN01157();
	}

	/**
	* Returns the xcn01158 of this vr technical spec_xcn.
	*
	* @return the xcn01158 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01158() {
		return _vrTechnicalSpec_XCN.getXCN01158();
	}

	/**
	* Returns the xcn01159 of this vr technical spec_xcn.
	*
	* @return the xcn01159 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01159() {
		return _vrTechnicalSpec_XCN.getXCN01159();
	}

	/**
	* Returns the xcn01160 of this vr technical spec_xcn.
	*
	* @return the xcn01160 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01160() {
		return _vrTechnicalSpec_XCN.getXCN01160();
	}

	/**
	* Returns the xcn01161 of this vr technical spec_xcn.
	*
	* @return the xcn01161 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01161() {
		return _vrTechnicalSpec_XCN.getXCN01161();
	}

	/**
	* Returns the xcn01162 of this vr technical spec_xcn.
	*
	* @return the xcn01162 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01162() {
		return _vrTechnicalSpec_XCN.getXCN01162();
	}

	/**
	* Returns the xcn01163 of this vr technical spec_xcn.
	*
	* @return the xcn01163 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01163() {
		return _vrTechnicalSpec_XCN.getXCN01163();
	}

	/**
	* Returns the xcn01164 of this vr technical spec_xcn.
	*
	* @return the xcn01164 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01164() {
		return _vrTechnicalSpec_XCN.getXCN01164();
	}

	/**
	* Returns the xcn01165 of this vr technical spec_xcn.
	*
	* @return the xcn01165 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01165() {
		return _vrTechnicalSpec_XCN.getXCN01165();
	}

	/**
	* Returns the xcn01166 of this vr technical spec_xcn.
	*
	* @return the xcn01166 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01166() {
		return _vrTechnicalSpec_XCN.getXCN01166();
	}

	/**
	* Returns the xcn01167 of this vr technical spec_xcn.
	*
	* @return the xcn01167 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01167() {
		return _vrTechnicalSpec_XCN.getXCN01167();
	}

	/**
	* Returns the xcn01168 of this vr technical spec_xcn.
	*
	* @return the xcn01168 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01168() {
		return _vrTechnicalSpec_XCN.getXCN01168();
	}

	/**
	* Returns the xcn01169 of this vr technical spec_xcn.
	*
	* @return the xcn01169 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01169() {
		return _vrTechnicalSpec_XCN.getXCN01169();
	}

	/**
	* Returns the xcn01170 of this vr technical spec_xcn.
	*
	* @return the xcn01170 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01170() {
		return _vrTechnicalSpec_XCN.getXCN01170();
	}

	/**
	* Returns the xcn01171 of this vr technical spec_xcn.
	*
	* @return the xcn01171 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01171() {
		return _vrTechnicalSpec_XCN.getXCN01171();
	}

	/**
	* Returns the xcn01172 of this vr technical spec_xcn.
	*
	* @return the xcn01172 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01172() {
		return _vrTechnicalSpec_XCN.getXCN01172();
	}

	/**
	* Returns the xcn01173 of this vr technical spec_xcn.
	*
	* @return the xcn01173 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01173() {
		return _vrTechnicalSpec_XCN.getXCN01173();
	}

	/**
	* Returns the xcn01174 of this vr technical spec_xcn.
	*
	* @return the xcn01174 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01174() {
		return _vrTechnicalSpec_XCN.getXCN01174();
	}

	/**
	* Returns the xcn01175 of this vr technical spec_xcn.
	*
	* @return the xcn01175 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01175() {
		return _vrTechnicalSpec_XCN.getXCN01175();
	}

	/**
	* Returns the xcn01176 of this vr technical spec_xcn.
	*
	* @return the xcn01176 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01176() {
		return _vrTechnicalSpec_XCN.getXCN01176();
	}

	/**
	* Returns the xcn01177 of this vr technical spec_xcn.
	*
	* @return the xcn01177 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01177() {
		return _vrTechnicalSpec_XCN.getXCN01177();
	}

	/**
	* Returns the xcn01178 of this vr technical spec_xcn.
	*
	* @return the xcn01178 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01178() {
		return _vrTechnicalSpec_XCN.getXCN01178();
	}

	/**
	* Returns the xcn01179 of this vr technical spec_xcn.
	*
	* @return the xcn01179 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01179() {
		return _vrTechnicalSpec_XCN.getXCN01179();
	}

	/**
	* Returns the xcn01180 of this vr technical spec_xcn.
	*
	* @return the xcn01180 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01180() {
		return _vrTechnicalSpec_XCN.getXCN01180();
	}

	/**
	* Returns the xcn01181 of this vr technical spec_xcn.
	*
	* @return the xcn01181 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01181() {
		return _vrTechnicalSpec_XCN.getXCN01181();
	}

	/**
	* Returns the xcn01182 of this vr technical spec_xcn.
	*
	* @return the xcn01182 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01182() {
		return _vrTechnicalSpec_XCN.getXCN01182();
	}

	/**
	* Returns the xcn01183 of this vr technical spec_xcn.
	*
	* @return the xcn01183 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01183() {
		return _vrTechnicalSpec_XCN.getXCN01183();
	}

	/**
	* Returns the xcn01184 of this vr technical spec_xcn.
	*
	* @return the xcn01184 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01184() {
		return _vrTechnicalSpec_XCN.getXCN01184();
	}

	/**
	* Returns the xcn01185 of this vr technical spec_xcn.
	*
	* @return the xcn01185 of this vr technical spec_xcn
	*/
	@Override
	public java.lang.String getXCN01185() {
		return _vrTechnicalSpec_XCN.getXCN01185();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XCN.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XCN.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xcn.
	*
	* @return the modify date of this vr technical spec_xcn
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XCN.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xcn.
	*
	* @return the sync date of this vr technical spec_xcn
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XCN.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xcn.
	*
	* @return the convert assemble ID of this vr technical spec_xcn
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XCN.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xcn.
	*
	* @return the dossier ID of this vr technical spec_xcn
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XCN.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xcn.
	*
	* @return the ID of this vr technical spec_xcn
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XCN.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xcn.
	*
	* @return the mt core of this vr technical spec_xcn
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XCN.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xcn.
	*
	* @return the primary key of this vr technical spec_xcn
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XCN.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xcn.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xcn
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XCN.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XCN.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XCN.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xcn.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xcn
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XCN.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xcn.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xcn
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XCN.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xcn.
	*
	* @param dossierId the dossier ID of this vr technical spec_xcn
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XCN.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xcn.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xcn
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XCN.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xcn.
	*
	* @param dossierNo the dossier no of this vr technical spec_xcn
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XCN.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XCN.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XCN.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XCN.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xcn.
	*
	* @param id the ID of this vr technical spec_xcn
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XCN.setId(id);
	}

	/**
	* Sets the loai_dong_co of this vr technical spec_xcn.
	*
	* @param loai_dong_co the loai_dong_co of this vr technical spec_xcn
	*/
	@Override
	public void setLoai_dong_co(java.lang.String loai_dong_co) {
		_vrTechnicalSpec_XCN.setLoai_dong_co(loai_dong_co);
	}

	/**
	* Sets the modify date of this vr technical spec_xcn.
	*
	* @param modifyDate the modify date of this vr technical spec_xcn
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XCN.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xcn.
	*
	* @param mtCore the mt core of this vr technical spec_xcn
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XCN.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XCN.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xcn.
	*
	* @param primaryKey the primary key of this vr technical spec_xcn
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XCN.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XCN.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xcn.
	*
	* @param referenceUid the reference uid of this vr technical spec_xcn
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XCN.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xcn.
	*
	* @param syncDate the sync date of this vr technical spec_xcn
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XCN.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xcn.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xcn
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XCN.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xcn01001 of this vr technical spec_xcn.
	*
	* @param XCN01001 the xcn01001 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01001(java.lang.String XCN01001) {
		_vrTechnicalSpec_XCN.setXCN01001(XCN01001);
	}

	/**
	* Sets the xcn01002 of this vr technical spec_xcn.
	*
	* @param XCN01002 the xcn01002 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01002(java.lang.String XCN01002) {
		_vrTechnicalSpec_XCN.setXCN01002(XCN01002);
	}

	/**
	* Sets the xcn01003 of this vr technical spec_xcn.
	*
	* @param XCN01003 the xcn01003 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01003(java.lang.String XCN01003) {
		_vrTechnicalSpec_XCN.setXCN01003(XCN01003);
	}

	/**
	* Sets the xcn01004 of this vr technical spec_xcn.
	*
	* @param XCN01004 the xcn01004 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01004(java.lang.String XCN01004) {
		_vrTechnicalSpec_XCN.setXCN01004(XCN01004);
	}

	/**
	* Sets the xcn01005 of this vr technical spec_xcn.
	*
	* @param XCN01005 the xcn01005 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01005(java.lang.String XCN01005) {
		_vrTechnicalSpec_XCN.setXCN01005(XCN01005);
	}

	/**
	* Sets the xcn01006 of this vr technical spec_xcn.
	*
	* @param XCN01006 the xcn01006 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01006(java.lang.String XCN01006) {
		_vrTechnicalSpec_XCN.setXCN01006(XCN01006);
	}

	/**
	* Sets the xcn01007 of this vr technical spec_xcn.
	*
	* @param XCN01007 the xcn01007 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01007(java.lang.String XCN01007) {
		_vrTechnicalSpec_XCN.setXCN01007(XCN01007);
	}

	/**
	* Sets the xcn01008 of this vr technical spec_xcn.
	*
	* @param XCN01008 the xcn01008 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01008(java.lang.String XCN01008) {
		_vrTechnicalSpec_XCN.setXCN01008(XCN01008);
	}

	/**
	* Sets the xcn01009 of this vr technical spec_xcn.
	*
	* @param XCN01009 the xcn01009 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01009(java.lang.String XCN01009) {
		_vrTechnicalSpec_XCN.setXCN01009(XCN01009);
	}

	/**
	* Sets the xcn01010 of this vr technical spec_xcn.
	*
	* @param XCN01010 the xcn01010 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01010(java.lang.String XCN01010) {
		_vrTechnicalSpec_XCN.setXCN01010(XCN01010);
	}

	/**
	* Sets the xcn01011 of this vr technical spec_xcn.
	*
	* @param XCN01011 the xcn01011 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01011(java.lang.String XCN01011) {
		_vrTechnicalSpec_XCN.setXCN01011(XCN01011);
	}

	/**
	* Sets the xcn01012 of this vr technical spec_xcn.
	*
	* @param XCN01012 the xcn01012 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01012(java.lang.String XCN01012) {
		_vrTechnicalSpec_XCN.setXCN01012(XCN01012);
	}

	/**
	* Sets the xcn01013 of this vr technical spec_xcn.
	*
	* @param XCN01013 the xcn01013 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01013(java.lang.String XCN01013) {
		_vrTechnicalSpec_XCN.setXCN01013(XCN01013);
	}

	/**
	* Sets the xcn01014 of this vr technical spec_xcn.
	*
	* @param XCN01014 the xcn01014 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01014(java.lang.String XCN01014) {
		_vrTechnicalSpec_XCN.setXCN01014(XCN01014);
	}

	/**
	* Sets the xcn01016 of this vr technical spec_xcn.
	*
	* @param XCN01016 the xcn01016 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01016(java.lang.String XCN01016) {
		_vrTechnicalSpec_XCN.setXCN01016(XCN01016);
	}

	/**
	* Sets the xcn01017 of this vr technical spec_xcn.
	*
	* @param XCN01017 the xcn01017 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01017(java.lang.String XCN01017) {
		_vrTechnicalSpec_XCN.setXCN01017(XCN01017);
	}

	/**
	* Sets the xcn01019 of this vr technical spec_xcn.
	*
	* @param XCN01019 the xcn01019 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01019(java.lang.String XCN01019) {
		_vrTechnicalSpec_XCN.setXCN01019(XCN01019);
	}

	/**
	* Sets the xcn01020 of this vr technical spec_xcn.
	*
	* @param XCN01020 the xcn01020 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01020(java.lang.String XCN01020) {
		_vrTechnicalSpec_XCN.setXCN01020(XCN01020);
	}

	/**
	* Sets the xcn01021 of this vr technical spec_xcn.
	*
	* @param XCN01021 the xcn01021 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01021(java.lang.String XCN01021) {
		_vrTechnicalSpec_XCN.setXCN01021(XCN01021);
	}

	/**
	* Sets the xcn01022 of this vr technical spec_xcn.
	*
	* @param XCN01022 the xcn01022 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01022(java.lang.String XCN01022) {
		_vrTechnicalSpec_XCN.setXCN01022(XCN01022);
	}

	/**
	* Sets the xcn01024 of this vr technical spec_xcn.
	*
	* @param XCN01024 the xcn01024 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01024(java.lang.String XCN01024) {
		_vrTechnicalSpec_XCN.setXCN01024(XCN01024);
	}

	/**
	* Sets the xcn01025 of this vr technical spec_xcn.
	*
	* @param XCN01025 the xcn01025 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01025(java.lang.String XCN01025) {
		_vrTechnicalSpec_XCN.setXCN01025(XCN01025);
	}

	/**
	* Sets the xcn01026 of this vr technical spec_xcn.
	*
	* @param XCN01026 the xcn01026 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01026(java.lang.String XCN01026) {
		_vrTechnicalSpec_XCN.setXCN01026(XCN01026);
	}

	/**
	* Sets the xcn01027 of this vr technical spec_xcn.
	*
	* @param XCN01027 the xcn01027 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01027(java.lang.String XCN01027) {
		_vrTechnicalSpec_XCN.setXCN01027(XCN01027);
	}

	/**
	* Sets the xcn01028 of this vr technical spec_xcn.
	*
	* @param XCN01028 the xcn01028 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01028(java.lang.String XCN01028) {
		_vrTechnicalSpec_XCN.setXCN01028(XCN01028);
	}

	/**
	* Sets the xcn01030 of this vr technical spec_xcn.
	*
	* @param XCN01030 the xcn01030 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01030(java.lang.String XCN01030) {
		_vrTechnicalSpec_XCN.setXCN01030(XCN01030);
	}

	/**
	* Sets the xcn01031 of this vr technical spec_xcn.
	*
	* @param XCN01031 the xcn01031 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01031(java.lang.String XCN01031) {
		_vrTechnicalSpec_XCN.setXCN01031(XCN01031);
	}

	/**
	* Sets the xcn01032 of this vr technical spec_xcn.
	*
	* @param XCN01032 the xcn01032 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01032(java.lang.String XCN01032) {
		_vrTechnicalSpec_XCN.setXCN01032(XCN01032);
	}

	/**
	* Sets the xcn01033 of this vr technical spec_xcn.
	*
	* @param XCN01033 the xcn01033 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01033(java.lang.String XCN01033) {
		_vrTechnicalSpec_XCN.setXCN01033(XCN01033);
	}

	/**
	* Sets the xcn01034 of this vr technical spec_xcn.
	*
	* @param XCN01034 the xcn01034 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01034(java.lang.String XCN01034) {
		_vrTechnicalSpec_XCN.setXCN01034(XCN01034);
	}

	/**
	* Sets the xcn01035 of this vr technical spec_xcn.
	*
	* @param XCN01035 the xcn01035 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01035(java.lang.String XCN01035) {
		_vrTechnicalSpec_XCN.setXCN01035(XCN01035);
	}

	/**
	* Sets the xcn01036 of this vr technical spec_xcn.
	*
	* @param XCN01036 the xcn01036 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01036(java.lang.String XCN01036) {
		_vrTechnicalSpec_XCN.setXCN01036(XCN01036);
	}

	/**
	* Sets the xcn01037 of this vr technical spec_xcn.
	*
	* @param XCN01037 the xcn01037 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01037(java.lang.String XCN01037) {
		_vrTechnicalSpec_XCN.setXCN01037(XCN01037);
	}

	/**
	* Sets the xcn01038 of this vr technical spec_xcn.
	*
	* @param XCN01038 the xcn01038 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01038(java.lang.String XCN01038) {
		_vrTechnicalSpec_XCN.setXCN01038(XCN01038);
	}

	/**
	* Sets the xcn01039 of this vr technical spec_xcn.
	*
	* @param XCN01039 the xcn01039 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01039(java.lang.String XCN01039) {
		_vrTechnicalSpec_XCN.setXCN01039(XCN01039);
	}

	/**
	* Sets the xcn01040 of this vr technical spec_xcn.
	*
	* @param XCN01040 the xcn01040 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01040(java.lang.String XCN01040) {
		_vrTechnicalSpec_XCN.setXCN01040(XCN01040);
	}

	/**
	* Sets the xcn01041 of this vr technical spec_xcn.
	*
	* @param XCN01041 the xcn01041 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01041(java.lang.String XCN01041) {
		_vrTechnicalSpec_XCN.setXCN01041(XCN01041);
	}

	/**
	* Sets the xcn01042 of this vr technical spec_xcn.
	*
	* @param XCN01042 the xcn01042 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01042(java.lang.String XCN01042) {
		_vrTechnicalSpec_XCN.setXCN01042(XCN01042);
	}

	/**
	* Sets the xcn01043 of this vr technical spec_xcn.
	*
	* @param XCN01043 the xcn01043 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01043(java.lang.String XCN01043) {
		_vrTechnicalSpec_XCN.setXCN01043(XCN01043);
	}

	/**
	* Sets the xcn01044 of this vr technical spec_xcn.
	*
	* @param XCN01044 the xcn01044 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01044(java.lang.String XCN01044) {
		_vrTechnicalSpec_XCN.setXCN01044(XCN01044);
	}

	/**
	* Sets the xcn01045 of this vr technical spec_xcn.
	*
	* @param XCN01045 the xcn01045 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01045(java.lang.String XCN01045) {
		_vrTechnicalSpec_XCN.setXCN01045(XCN01045);
	}

	/**
	* Sets the xcn01046 of this vr technical spec_xcn.
	*
	* @param XCN01046 the xcn01046 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01046(java.lang.String XCN01046) {
		_vrTechnicalSpec_XCN.setXCN01046(XCN01046);
	}

	/**
	* Sets the xcn01047 of this vr technical spec_xcn.
	*
	* @param XCN01047 the xcn01047 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01047(java.lang.String XCN01047) {
		_vrTechnicalSpec_XCN.setXCN01047(XCN01047);
	}

	/**
	* Sets the xcn01049 of this vr technical spec_xcn.
	*
	* @param XCN01049 the xcn01049 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01049(java.lang.String XCN01049) {
		_vrTechnicalSpec_XCN.setXCN01049(XCN01049);
	}

	/**
	* Sets the xcn01050 of this vr technical spec_xcn.
	*
	* @param XCN01050 the xcn01050 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01050(java.lang.String XCN01050) {
		_vrTechnicalSpec_XCN.setXCN01050(XCN01050);
	}

	/**
	* Sets the xcn01051 of this vr technical spec_xcn.
	*
	* @param XCN01051 the xcn01051 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01051(java.lang.String XCN01051) {
		_vrTechnicalSpec_XCN.setXCN01051(XCN01051);
	}

	/**
	* Sets the xcn01052 of this vr technical spec_xcn.
	*
	* @param XCN01052 the xcn01052 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01052(java.lang.String XCN01052) {
		_vrTechnicalSpec_XCN.setXCN01052(XCN01052);
	}

	/**
	* Sets the xcn01053 of this vr technical spec_xcn.
	*
	* @param XCN01053 the xcn01053 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01053(java.lang.String XCN01053) {
		_vrTechnicalSpec_XCN.setXCN01053(XCN01053);
	}

	/**
	* Sets the xcn01054 of this vr technical spec_xcn.
	*
	* @param XCN01054 the xcn01054 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01054(java.lang.String XCN01054) {
		_vrTechnicalSpec_XCN.setXCN01054(XCN01054);
	}

	/**
	* Sets the xcn01055 of this vr technical spec_xcn.
	*
	* @param XCN01055 the xcn01055 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01055(java.lang.String XCN01055) {
		_vrTechnicalSpec_XCN.setXCN01055(XCN01055);
	}

	/**
	* Sets the xcn01056 of this vr technical spec_xcn.
	*
	* @param XCN01056 the xcn01056 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01056(java.lang.String XCN01056) {
		_vrTechnicalSpec_XCN.setXCN01056(XCN01056);
	}

	/**
	* Sets the xcn01057 of this vr technical spec_xcn.
	*
	* @param XCN01057 the xcn01057 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01057(java.lang.String XCN01057) {
		_vrTechnicalSpec_XCN.setXCN01057(XCN01057);
	}

	/**
	* Sets the xcn01058 of this vr technical spec_xcn.
	*
	* @param XCN01058 the xcn01058 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01058(java.lang.String XCN01058) {
		_vrTechnicalSpec_XCN.setXCN01058(XCN01058);
	}

	/**
	* Sets the xcn01059 of this vr technical spec_xcn.
	*
	* @param XCN01059 the xcn01059 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01059(java.lang.String XCN01059) {
		_vrTechnicalSpec_XCN.setXCN01059(XCN01059);
	}

	/**
	* Sets the xcn01060 of this vr technical spec_xcn.
	*
	* @param XCN01060 the xcn01060 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01060(java.lang.String XCN01060) {
		_vrTechnicalSpec_XCN.setXCN01060(XCN01060);
	}

	/**
	* Sets the xcn01062 of this vr technical spec_xcn.
	*
	* @param XCN01062 the xcn01062 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01062(java.lang.String XCN01062) {
		_vrTechnicalSpec_XCN.setXCN01062(XCN01062);
	}

	/**
	* Sets the xcn01063 of this vr technical spec_xcn.
	*
	* @param XCN01063 the xcn01063 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01063(java.lang.String XCN01063) {
		_vrTechnicalSpec_XCN.setXCN01063(XCN01063);
	}

	/**
	* Sets the xcn01064 of this vr technical spec_xcn.
	*
	* @param XCN01064 the xcn01064 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01064(java.lang.String XCN01064) {
		_vrTechnicalSpec_XCN.setXCN01064(XCN01064);
	}

	/**
	* Sets the xcn01065 of this vr technical spec_xcn.
	*
	* @param XCN01065 the xcn01065 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01065(java.lang.String XCN01065) {
		_vrTechnicalSpec_XCN.setXCN01065(XCN01065);
	}

	/**
	* Sets the xcn01066 of this vr technical spec_xcn.
	*
	* @param XCN01066 the xcn01066 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01066(java.lang.String XCN01066) {
		_vrTechnicalSpec_XCN.setXCN01066(XCN01066);
	}

	/**
	* Sets the xcn01067 of this vr technical spec_xcn.
	*
	* @param XCN01067 the xcn01067 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01067(java.lang.String XCN01067) {
		_vrTechnicalSpec_XCN.setXCN01067(XCN01067);
	}

	/**
	* Sets the xcn01068 of this vr technical spec_xcn.
	*
	* @param XCN01068 the xcn01068 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01068(java.lang.String XCN01068) {
		_vrTechnicalSpec_XCN.setXCN01068(XCN01068);
	}

	/**
	* Sets the xcn01069 of this vr technical spec_xcn.
	*
	* @param XCN01069 the xcn01069 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01069(java.lang.String XCN01069) {
		_vrTechnicalSpec_XCN.setXCN01069(XCN01069);
	}

	/**
	* Sets the xcn01100 of this vr technical spec_xcn.
	*
	* @param XCN01100 the xcn01100 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01100(java.lang.String XCN01100) {
		_vrTechnicalSpec_XCN.setXCN01100(XCN01100);
	}

	/**
	* Sets the xcn01101 of this vr technical spec_xcn.
	*
	* @param XCN01101 the xcn01101 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01101(java.lang.String XCN01101) {
		_vrTechnicalSpec_XCN.setXCN01101(XCN01101);
	}

	/**
	* Sets the xcn01102 of this vr technical spec_xcn.
	*
	* @param XCN01102 the xcn01102 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01102(java.lang.String XCN01102) {
		_vrTechnicalSpec_XCN.setXCN01102(XCN01102);
	}

	/**
	* Sets the xcn01103 of this vr technical spec_xcn.
	*
	* @param XCN01103 the xcn01103 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01103(java.lang.String XCN01103) {
		_vrTechnicalSpec_XCN.setXCN01103(XCN01103);
	}

	/**
	* Sets the xcn01104 of this vr technical spec_xcn.
	*
	* @param XCN01104 the xcn01104 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01104(java.lang.String XCN01104) {
		_vrTechnicalSpec_XCN.setXCN01104(XCN01104);
	}

	/**
	* Sets the xcn01105 of this vr technical spec_xcn.
	*
	* @param XCN01105 the xcn01105 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01105(java.lang.String XCN01105) {
		_vrTechnicalSpec_XCN.setXCN01105(XCN01105);
	}

	/**
	* Sets the xcn01106 of this vr technical spec_xcn.
	*
	* @param XCN01106 the xcn01106 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01106(java.lang.String XCN01106) {
		_vrTechnicalSpec_XCN.setXCN01106(XCN01106);
	}

	/**
	* Sets the xcn01107 of this vr technical spec_xcn.
	*
	* @param XCN01107 the xcn01107 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01107(java.lang.String XCN01107) {
		_vrTechnicalSpec_XCN.setXCN01107(XCN01107);
	}

	/**
	* Sets the xcn01108 of this vr technical spec_xcn.
	*
	* @param XCN01108 the xcn01108 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01108(java.lang.String XCN01108) {
		_vrTechnicalSpec_XCN.setXCN01108(XCN01108);
	}

	/**
	* Sets the xcn01109 of this vr technical spec_xcn.
	*
	* @param XCN01109 the xcn01109 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01109(java.lang.String XCN01109) {
		_vrTechnicalSpec_XCN.setXCN01109(XCN01109);
	}

	/**
	* Sets the xcn01110 of this vr technical spec_xcn.
	*
	* @param XCN01110 the xcn01110 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01110(java.lang.String XCN01110) {
		_vrTechnicalSpec_XCN.setXCN01110(XCN01110);
	}

	/**
	* Sets the xcn01111 of this vr technical spec_xcn.
	*
	* @param XCN01111 the xcn01111 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01111(java.lang.String XCN01111) {
		_vrTechnicalSpec_XCN.setXCN01111(XCN01111);
	}

	/**
	* Sets the xcn01112 of this vr technical spec_xcn.
	*
	* @param XCN01112 the xcn01112 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01112(java.lang.String XCN01112) {
		_vrTechnicalSpec_XCN.setXCN01112(XCN01112);
	}

	/**
	* Sets the xcn01113 of this vr technical spec_xcn.
	*
	* @param XCN01113 the xcn01113 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01113(java.lang.String XCN01113) {
		_vrTechnicalSpec_XCN.setXCN01113(XCN01113);
	}

	/**
	* Sets the xcn01114 of this vr technical spec_xcn.
	*
	* @param XCN01114 the xcn01114 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01114(java.lang.String XCN01114) {
		_vrTechnicalSpec_XCN.setXCN01114(XCN01114);
	}

	/**
	* Sets the xcn01115 of this vr technical spec_xcn.
	*
	* @param XCN01115 the xcn01115 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01115(java.lang.String XCN01115) {
		_vrTechnicalSpec_XCN.setXCN01115(XCN01115);
	}

	/**
	* Sets the xcn01116 of this vr technical spec_xcn.
	*
	* @param XCN01116 the xcn01116 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01116(java.lang.String XCN01116) {
		_vrTechnicalSpec_XCN.setXCN01116(XCN01116);
	}

	/**
	* Sets the xcn01117 of this vr technical spec_xcn.
	*
	* @param XCN01117 the xcn01117 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01117(java.lang.String XCN01117) {
		_vrTechnicalSpec_XCN.setXCN01117(XCN01117);
	}

	/**
	* Sets the xcn01118 of this vr technical spec_xcn.
	*
	* @param XCN01118 the xcn01118 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01118(java.lang.String XCN01118) {
		_vrTechnicalSpec_XCN.setXCN01118(XCN01118);
	}

	/**
	* Sets the xcn01119 of this vr technical spec_xcn.
	*
	* @param XCN01119 the xcn01119 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01119(java.lang.String XCN01119) {
		_vrTechnicalSpec_XCN.setXCN01119(XCN01119);
	}

	/**
	* Sets the xcn01120 of this vr technical spec_xcn.
	*
	* @param XCN01120 the xcn01120 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01120(java.lang.String XCN01120) {
		_vrTechnicalSpec_XCN.setXCN01120(XCN01120);
	}

	/**
	* Sets the xcn01121 of this vr technical spec_xcn.
	*
	* @param XCN01121 the xcn01121 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01121(java.lang.String XCN01121) {
		_vrTechnicalSpec_XCN.setXCN01121(XCN01121);
	}

	/**
	* Sets the xcn01122 of this vr technical spec_xcn.
	*
	* @param XCN01122 the xcn01122 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01122(java.lang.String XCN01122) {
		_vrTechnicalSpec_XCN.setXCN01122(XCN01122);
	}

	/**
	* Sets the xcn01123 of this vr technical spec_xcn.
	*
	* @param XCN01123 the xcn01123 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01123(java.lang.String XCN01123) {
		_vrTechnicalSpec_XCN.setXCN01123(XCN01123);
	}

	/**
	* Sets the xcn01124 of this vr technical spec_xcn.
	*
	* @param XCN01124 the xcn01124 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01124(java.lang.String XCN01124) {
		_vrTechnicalSpec_XCN.setXCN01124(XCN01124);
	}

	/**
	* Sets the xcn01125 of this vr technical spec_xcn.
	*
	* @param XCN01125 the xcn01125 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01125(java.lang.String XCN01125) {
		_vrTechnicalSpec_XCN.setXCN01125(XCN01125);
	}

	/**
	* Sets the xcn01126 of this vr technical spec_xcn.
	*
	* @param XCN01126 the xcn01126 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01126(java.lang.String XCN01126) {
		_vrTechnicalSpec_XCN.setXCN01126(XCN01126);
	}

	/**
	* Sets the xcn01127 of this vr technical spec_xcn.
	*
	* @param XCN01127 the xcn01127 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01127(java.lang.String XCN01127) {
		_vrTechnicalSpec_XCN.setXCN01127(XCN01127);
	}

	/**
	* Sets the xcn01128 of this vr technical spec_xcn.
	*
	* @param XCN01128 the xcn01128 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01128(java.lang.String XCN01128) {
		_vrTechnicalSpec_XCN.setXCN01128(XCN01128);
	}

	/**
	* Sets the xcn01129 of this vr technical spec_xcn.
	*
	* @param XCN01129 the xcn01129 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01129(java.lang.String XCN01129) {
		_vrTechnicalSpec_XCN.setXCN01129(XCN01129);
	}

	/**
	* Sets the xcn01130 of this vr technical spec_xcn.
	*
	* @param XCN01130 the xcn01130 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01130(java.lang.String XCN01130) {
		_vrTechnicalSpec_XCN.setXCN01130(XCN01130);
	}

	/**
	* Sets the xcn01131 of this vr technical spec_xcn.
	*
	* @param XCN01131 the xcn01131 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01131(java.lang.String XCN01131) {
		_vrTechnicalSpec_XCN.setXCN01131(XCN01131);
	}

	/**
	* Sets the xcn01132 of this vr technical spec_xcn.
	*
	* @param XCN01132 the xcn01132 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01132(java.lang.String XCN01132) {
		_vrTechnicalSpec_XCN.setXCN01132(XCN01132);
	}

	/**
	* Sets the xcn01133 of this vr technical spec_xcn.
	*
	* @param XCN01133 the xcn01133 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01133(java.lang.String XCN01133) {
		_vrTechnicalSpec_XCN.setXCN01133(XCN01133);
	}

	/**
	* Sets the xcn01134 of this vr technical spec_xcn.
	*
	* @param XCN01134 the xcn01134 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01134(java.lang.String XCN01134) {
		_vrTechnicalSpec_XCN.setXCN01134(XCN01134);
	}

	/**
	* Sets the xcn01135 of this vr technical spec_xcn.
	*
	* @param XCN01135 the xcn01135 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01135(java.lang.String XCN01135) {
		_vrTechnicalSpec_XCN.setXCN01135(XCN01135);
	}

	/**
	* Sets the xcn01136 of this vr technical spec_xcn.
	*
	* @param XCN01136 the xcn01136 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01136(java.lang.String XCN01136) {
		_vrTechnicalSpec_XCN.setXCN01136(XCN01136);
	}

	/**
	* Sets the xcn01137 of this vr technical spec_xcn.
	*
	* @param XCN01137 the xcn01137 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01137(java.lang.String XCN01137) {
		_vrTechnicalSpec_XCN.setXCN01137(XCN01137);
	}

	/**
	* Sets the xcn01138 of this vr technical spec_xcn.
	*
	* @param XCN01138 the xcn01138 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01138(java.lang.String XCN01138) {
		_vrTechnicalSpec_XCN.setXCN01138(XCN01138);
	}

	/**
	* Sets the xcn01139 of this vr technical spec_xcn.
	*
	* @param XCN01139 the xcn01139 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01139(java.lang.String XCN01139) {
		_vrTechnicalSpec_XCN.setXCN01139(XCN01139);
	}

	/**
	* Sets the xcn01140 of this vr technical spec_xcn.
	*
	* @param XCN01140 the xcn01140 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01140(java.lang.String XCN01140) {
		_vrTechnicalSpec_XCN.setXCN01140(XCN01140);
	}

	/**
	* Sets the xcn01141 of this vr technical spec_xcn.
	*
	* @param XCN01141 the xcn01141 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01141(java.lang.String XCN01141) {
		_vrTechnicalSpec_XCN.setXCN01141(XCN01141);
	}

	/**
	* Sets the xcn01142 of this vr technical spec_xcn.
	*
	* @param XCN01142 the xcn01142 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01142(java.lang.String XCN01142) {
		_vrTechnicalSpec_XCN.setXCN01142(XCN01142);
	}

	/**
	* Sets the xcn01143 of this vr technical spec_xcn.
	*
	* @param XCN01143 the xcn01143 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01143(java.lang.String XCN01143) {
		_vrTechnicalSpec_XCN.setXCN01143(XCN01143);
	}

	/**
	* Sets the xcn01144 of this vr technical spec_xcn.
	*
	* @param XCN01144 the xcn01144 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01144(java.lang.String XCN01144) {
		_vrTechnicalSpec_XCN.setXCN01144(XCN01144);
	}

	/**
	* Sets the xcn01145 of this vr technical spec_xcn.
	*
	* @param XCN01145 the xcn01145 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01145(java.lang.String XCN01145) {
		_vrTechnicalSpec_XCN.setXCN01145(XCN01145);
	}

	/**
	* Sets the xcn01146 of this vr technical spec_xcn.
	*
	* @param XCN01146 the xcn01146 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01146(java.lang.String XCN01146) {
		_vrTechnicalSpec_XCN.setXCN01146(XCN01146);
	}

	/**
	* Sets the xcn01147 of this vr technical spec_xcn.
	*
	* @param XCN01147 the xcn01147 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01147(java.lang.String XCN01147) {
		_vrTechnicalSpec_XCN.setXCN01147(XCN01147);
	}

	/**
	* Sets the xcn01148 of this vr technical spec_xcn.
	*
	* @param XCN01148 the xcn01148 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01148(java.lang.String XCN01148) {
		_vrTechnicalSpec_XCN.setXCN01148(XCN01148);
	}

	/**
	* Sets the xcn01149 of this vr technical spec_xcn.
	*
	* @param XCN01149 the xcn01149 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01149(java.lang.String XCN01149) {
		_vrTechnicalSpec_XCN.setXCN01149(XCN01149);
	}

	/**
	* Sets the xcn01150 of this vr technical spec_xcn.
	*
	* @param XCN01150 the xcn01150 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01150(java.lang.String XCN01150) {
		_vrTechnicalSpec_XCN.setXCN01150(XCN01150);
	}

	/**
	* Sets the xcn01151 of this vr technical spec_xcn.
	*
	* @param XCN01151 the xcn01151 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01151(java.lang.String XCN01151) {
		_vrTechnicalSpec_XCN.setXCN01151(XCN01151);
	}

	/**
	* Sets the xcn01152 of this vr technical spec_xcn.
	*
	* @param XCN01152 the xcn01152 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01152(java.lang.String XCN01152) {
		_vrTechnicalSpec_XCN.setXCN01152(XCN01152);
	}

	/**
	* Sets the xcn01153 of this vr technical spec_xcn.
	*
	* @param XCN01153 the xcn01153 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01153(java.lang.String XCN01153) {
		_vrTechnicalSpec_XCN.setXCN01153(XCN01153);
	}

	/**
	* Sets the xcn01154 of this vr technical spec_xcn.
	*
	* @param XCN01154 the xcn01154 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01154(java.lang.String XCN01154) {
		_vrTechnicalSpec_XCN.setXCN01154(XCN01154);
	}

	/**
	* Sets the xcn01155 of this vr technical spec_xcn.
	*
	* @param XCN01155 the xcn01155 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01155(java.lang.String XCN01155) {
		_vrTechnicalSpec_XCN.setXCN01155(XCN01155);
	}

	/**
	* Sets the xcn01156 of this vr technical spec_xcn.
	*
	* @param XCN01156 the xcn01156 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01156(java.lang.String XCN01156) {
		_vrTechnicalSpec_XCN.setXCN01156(XCN01156);
	}

	/**
	* Sets the xcn01157 of this vr technical spec_xcn.
	*
	* @param XCN01157 the xcn01157 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01157(java.lang.String XCN01157) {
		_vrTechnicalSpec_XCN.setXCN01157(XCN01157);
	}

	/**
	* Sets the xcn01158 of this vr technical spec_xcn.
	*
	* @param XCN01158 the xcn01158 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01158(java.lang.String XCN01158) {
		_vrTechnicalSpec_XCN.setXCN01158(XCN01158);
	}

	/**
	* Sets the xcn01159 of this vr technical spec_xcn.
	*
	* @param XCN01159 the xcn01159 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01159(java.lang.String XCN01159) {
		_vrTechnicalSpec_XCN.setXCN01159(XCN01159);
	}

	/**
	* Sets the xcn01160 of this vr technical spec_xcn.
	*
	* @param XCN01160 the xcn01160 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01160(java.lang.String XCN01160) {
		_vrTechnicalSpec_XCN.setXCN01160(XCN01160);
	}

	/**
	* Sets the xcn01161 of this vr technical spec_xcn.
	*
	* @param XCN01161 the xcn01161 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01161(java.lang.String XCN01161) {
		_vrTechnicalSpec_XCN.setXCN01161(XCN01161);
	}

	/**
	* Sets the xcn01162 of this vr technical spec_xcn.
	*
	* @param XCN01162 the xcn01162 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01162(java.lang.String XCN01162) {
		_vrTechnicalSpec_XCN.setXCN01162(XCN01162);
	}

	/**
	* Sets the xcn01163 of this vr technical spec_xcn.
	*
	* @param XCN01163 the xcn01163 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01163(java.lang.String XCN01163) {
		_vrTechnicalSpec_XCN.setXCN01163(XCN01163);
	}

	/**
	* Sets the xcn01164 of this vr technical spec_xcn.
	*
	* @param XCN01164 the xcn01164 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01164(java.lang.String XCN01164) {
		_vrTechnicalSpec_XCN.setXCN01164(XCN01164);
	}

	/**
	* Sets the xcn01165 of this vr technical spec_xcn.
	*
	* @param XCN01165 the xcn01165 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01165(java.lang.String XCN01165) {
		_vrTechnicalSpec_XCN.setXCN01165(XCN01165);
	}

	/**
	* Sets the xcn01166 of this vr technical spec_xcn.
	*
	* @param XCN01166 the xcn01166 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01166(java.lang.String XCN01166) {
		_vrTechnicalSpec_XCN.setXCN01166(XCN01166);
	}

	/**
	* Sets the xcn01167 of this vr technical spec_xcn.
	*
	* @param XCN01167 the xcn01167 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01167(java.lang.String XCN01167) {
		_vrTechnicalSpec_XCN.setXCN01167(XCN01167);
	}

	/**
	* Sets the xcn01168 of this vr technical spec_xcn.
	*
	* @param XCN01168 the xcn01168 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01168(java.lang.String XCN01168) {
		_vrTechnicalSpec_XCN.setXCN01168(XCN01168);
	}

	/**
	* Sets the xcn01169 of this vr technical spec_xcn.
	*
	* @param XCN01169 the xcn01169 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01169(java.lang.String XCN01169) {
		_vrTechnicalSpec_XCN.setXCN01169(XCN01169);
	}

	/**
	* Sets the xcn01170 of this vr technical spec_xcn.
	*
	* @param XCN01170 the xcn01170 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01170(java.lang.String XCN01170) {
		_vrTechnicalSpec_XCN.setXCN01170(XCN01170);
	}

	/**
	* Sets the xcn01171 of this vr technical spec_xcn.
	*
	* @param XCN01171 the xcn01171 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01171(java.lang.String XCN01171) {
		_vrTechnicalSpec_XCN.setXCN01171(XCN01171);
	}

	/**
	* Sets the xcn01172 of this vr technical spec_xcn.
	*
	* @param XCN01172 the xcn01172 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01172(java.lang.String XCN01172) {
		_vrTechnicalSpec_XCN.setXCN01172(XCN01172);
	}

	/**
	* Sets the xcn01173 of this vr technical spec_xcn.
	*
	* @param XCN01173 the xcn01173 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01173(java.lang.String XCN01173) {
		_vrTechnicalSpec_XCN.setXCN01173(XCN01173);
	}

	/**
	* Sets the xcn01174 of this vr technical spec_xcn.
	*
	* @param XCN01174 the xcn01174 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01174(java.lang.String XCN01174) {
		_vrTechnicalSpec_XCN.setXCN01174(XCN01174);
	}

	/**
	* Sets the xcn01175 of this vr technical spec_xcn.
	*
	* @param XCN01175 the xcn01175 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01175(java.lang.String XCN01175) {
		_vrTechnicalSpec_XCN.setXCN01175(XCN01175);
	}

	/**
	* Sets the xcn01176 of this vr technical spec_xcn.
	*
	* @param XCN01176 the xcn01176 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01176(java.lang.String XCN01176) {
		_vrTechnicalSpec_XCN.setXCN01176(XCN01176);
	}

	/**
	* Sets the xcn01177 of this vr technical spec_xcn.
	*
	* @param XCN01177 the xcn01177 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01177(java.lang.String XCN01177) {
		_vrTechnicalSpec_XCN.setXCN01177(XCN01177);
	}

	/**
	* Sets the xcn01178 of this vr technical spec_xcn.
	*
	* @param XCN01178 the xcn01178 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01178(java.lang.String XCN01178) {
		_vrTechnicalSpec_XCN.setXCN01178(XCN01178);
	}

	/**
	* Sets the xcn01179 of this vr technical spec_xcn.
	*
	* @param XCN01179 the xcn01179 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01179(java.lang.String XCN01179) {
		_vrTechnicalSpec_XCN.setXCN01179(XCN01179);
	}

	/**
	* Sets the xcn01180 of this vr technical spec_xcn.
	*
	* @param XCN01180 the xcn01180 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01180(java.lang.String XCN01180) {
		_vrTechnicalSpec_XCN.setXCN01180(XCN01180);
	}

	/**
	* Sets the xcn01181 of this vr technical spec_xcn.
	*
	* @param XCN01181 the xcn01181 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01181(java.lang.String XCN01181) {
		_vrTechnicalSpec_XCN.setXCN01181(XCN01181);
	}

	/**
	* Sets the xcn01182 of this vr technical spec_xcn.
	*
	* @param XCN01182 the xcn01182 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01182(java.lang.String XCN01182) {
		_vrTechnicalSpec_XCN.setXCN01182(XCN01182);
	}

	/**
	* Sets the xcn01183 of this vr technical spec_xcn.
	*
	* @param XCN01183 the xcn01183 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01183(java.lang.String XCN01183) {
		_vrTechnicalSpec_XCN.setXCN01183(XCN01183);
	}

	/**
	* Sets the xcn01184 of this vr technical spec_xcn.
	*
	* @param XCN01184 the xcn01184 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01184(java.lang.String XCN01184) {
		_vrTechnicalSpec_XCN.setXCN01184(XCN01184);
	}

	/**
	* Sets the xcn01185 of this vr technical spec_xcn.
	*
	* @param XCN01185 the xcn01185 of this vr technical spec_xcn
	*/
	@Override
	public void setXCN01185(java.lang.String XCN01185) {
		_vrTechnicalSpec_XCN.setXCN01185(XCN01185);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCNWrapper)) {
			return false;
		}

		VRTechnicalSpec_XCNWrapper vrTechnicalSpec_XCNWrapper = (VRTechnicalSpec_XCNWrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XCN,
					vrTechnicalSpec_XCNWrapper._vrTechnicalSpec_XCN)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XCN getWrappedModel() {
		return _vrTechnicalSpec_XCN;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XCN.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XCN.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XCN.resetOriginalValues();
	}

	private final VRTechnicalSpec_XCN _vrTechnicalSpec_XCN;
}