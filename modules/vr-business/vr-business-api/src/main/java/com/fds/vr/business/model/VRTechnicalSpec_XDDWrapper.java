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
 * This class is a wrapper for {@link VRTechnicalSpec_XDD}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XDD
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XDDWrapper implements VRTechnicalSpec_XDD,
	ModelWrapper<VRTechnicalSpec_XDD> {
	public VRTechnicalSpec_XDDWrapper(VRTechnicalSpec_XDD vrTechnicalSpec_XDD) {
		_vrTechnicalSpec_XDD = vrTechnicalSpec_XDD;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XDD.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XDD.class.getName();
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
		attributes.put("XDD01001", getXDD01001());
		attributes.put("XDD01002", getXDD01002());
		attributes.put("XDD01003", getXDD01003());
		attributes.put("XDD01004", getXDD01004());
		attributes.put("XDD01005", getXDD01005());
		attributes.put("XDD01006", getXDD01006());
		attributes.put("XDD01007", getXDD01007());
		attributes.put("XDD01008", getXDD01008());
		attributes.put("XDD01009", getXDD01009());
		attributes.put("XDD01010", getXDD01010());
		attributes.put("XDD01011", getXDD01011());
		attributes.put("XDD01012", getXDD01012());
		attributes.put("XDD01013", getXDD01013());
		attributes.put("XDD01014", getXDD01014());
		attributes.put("XDD01016", getXDD01016());
		attributes.put("XDD01017", getXDD01017());
		attributes.put("XDD01019", getXDD01019());
		attributes.put("XDD01020", getXDD01020());
		attributes.put("XDD01021", getXDD01021());
		attributes.put("XDD01022", getXDD01022());
		attributes.put("XDD01024", getXDD01024());
		attributes.put("XDD01025", getXDD01025());
		attributes.put("XDD01026", getXDD01026());
		attributes.put("XDD01027", getXDD01027());
		attributes.put("XDD01028", getXDD01028());
		attributes.put("XDD01030", getXDD01030());
		attributes.put("XDD01031", getXDD01031());
		attributes.put("XDD01032", getXDD01032());
		attributes.put("XDD01033", getXDD01033());
		attributes.put("XDD01034", getXDD01034());
		attributes.put("XDD01035", getXDD01035());
		attributes.put("XDD01036", getXDD01036());
		attributes.put("XDD01037", getXDD01037());
		attributes.put("XDD01038", getXDD01038());
		attributes.put("XDD01039", getXDD01039());
		attributes.put("XDD01040", getXDD01040());
		attributes.put("XDD01041", getXDD01041());
		attributes.put("XDD01042", getXDD01042());
		attributes.put("XDD01043", getXDD01043());
		attributes.put("XDD01044", getXDD01044());
		attributes.put("XDD01045", getXDD01045());
		attributes.put("XDD01046", getXDD01046());
		attributes.put("XDD01047", getXDD01047());
		attributes.put("XDD01049", getXDD01049());
		attributes.put("XDD01050", getXDD01050());
		attributes.put("XDD01051", getXDD01051());
		attributes.put("XDD01052", getXDD01052());
		attributes.put("XDD01053", getXDD01053());
		attributes.put("XDD01054", getXDD01054());
		attributes.put("XDD01055", getXDD01055());
		attributes.put("XDD01056", getXDD01056());
		attributes.put("XDD01057", getXDD01057());
		attributes.put("XDD01058", getXDD01058());
		attributes.put("XDD01059", getXDD01059());
		attributes.put("XDD01060", getXDD01060());
		attributes.put("XDD0076", getXDD0076());
		attributes.put("XDD0077", getXDD0077());
		attributes.put("XDD0078", getXDD0078());
		attributes.put("XDD0079", getXDD0079());
		attributes.put("XDD0080", getXDD0080());
		attributes.put("XDD0081", getXDD0081());
		attributes.put("XDD0082", getXDD0082());
		attributes.put("XDD0083", getXDD0083());
		attributes.put("XDD0084", getXDD0084());
		attributes.put("XDD0085", getXDD0085());
		attributes.put("XDD0086", getXDD0086());
		attributes.put("XDD0087", getXDD0087());
		attributes.put("XDD0088", getXDD0088());
		attributes.put("XDD0089", getXDD0089());
		attributes.put("XDD0090", getXDD0090());
		attributes.put("XDD0091", getXDD0091());
		attributes.put("XDD0092", getXDD0092());
		attributes.put("XDD0093", getXDD0093());
		attributes.put("XDD0094", getXDD0094());
		attributes.put("XDD0095", getXDD0095());
		attributes.put("XDD0096", getXDD0096());
		attributes.put("XDD0097", getXDD0097());
		attributes.put("XDD0098", getXDD0098());
		attributes.put("XDD0099", getXDD0099());
		attributes.put("XDD0100", getXDD0100());
		attributes.put("XDD0101", getXDD0101());
		attributes.put("XDD0102", getXDD0102());
		attributes.put("XDD0103", getXDD0103());
		attributes.put("XDD0104", getXDD0104());
		attributes.put("XDD0105", getXDD0105());
		attributes.put("XDD0106", getXDD0106());
		attributes.put("XDD0107", getXDD0107());
		attributes.put("XDD0108", getXDD0108());
		attributes.put("XDD0109", getXDD0109());
		attributes.put("XDD0110", getXDD0110());
		attributes.put("XDD0111", getXDD0111());
		attributes.put("XDD0112", getXDD0112());
		attributes.put("XDD0113", getXDD0113());
		attributes.put("XDD0114", getXDD0114());
		attributes.put("XDD0115", getXDD0115());
		attributes.put("XDD0116", getXDD0116());
		attributes.put("XDD0117", getXDD0117());
		attributes.put("XDD0118", getXDD0118());
		attributes.put("XDD0119", getXDD0119());
		attributes.put("XDD0120", getXDD0120());
		attributes.put("XDD0121", getXDD0121());
		attributes.put("XDD0122", getXDD0122());
		attributes.put("XDD0123", getXDD0123());
		attributes.put("XDD0124", getXDD0124());
		attributes.put("XDD0125", getXDD0125());
		attributes.put("XDD0126", getXDD0126());
		attributes.put("XDD0127", getXDD0127());
		attributes.put("XDD0128", getXDD0128());
		attributes.put("XDD0129", getXDD0129());
		attributes.put("XDD0130", getXDD0130());
		attributes.put("XDD0131", getXDD0131());
		attributes.put("XDD0132", getXDD0132());
		attributes.put("XDD0133", getXDD0133());
		attributes.put("XDD0134", getXDD0134());
		attributes.put("XDD0135", getXDD0135());
		attributes.put("XDD0136", getXDD0136());
		attributes.put("XDD0137", getXDD0137());
		attributes.put("XDD0138", getXDD0138());
		attributes.put("XDD0139", getXDD0139());
		attributes.put("XDD0140", getXDD0140());
		attributes.put("XDD0141", getXDD0141());
		attributes.put("XDD0142", getXDD0142());
		attributes.put("XDD0143", getXDD0143());
		attributes.put("XDD0144", getXDD0144());
		attributes.put("XDD0145", getXDD0145());
		attributes.put("XDD0146", getXDD0146());
		attributes.put("XDD0147", getXDD0147());
		attributes.put("XDD0148", getXDD0148());
		attributes.put("XDD0149", getXDD0149());
		attributes.put("XDD0150", getXDD0150());
		attributes.put("XDD0151", getXDD0151());
		attributes.put("XDD0152", getXDD0152());
		attributes.put("XDD0153", getXDD0153());
		attributes.put("XDD0154", getXDD0154());
		attributes.put("XDD0155", getXDD0155());
		attributes.put("XDD0156", getXDD0156());
		attributes.put("XDD0157", getXDD0157());
		attributes.put("XDD0158", getXDD0158());
		attributes.put("XDD0159", getXDD0159());
		attributes.put("XDD0160", getXDD0160());
		attributes.put("XDD0161", getXDD0161());
		attributes.put("BBCNCLKLXDD001", getBBCNCLKLXDD001());
		attributes.put("BBCNCLKLXDD002", getBBCNCLKLXDD002());
		attributes.put("BBCNCLKLXDD003", getBBCNCLKLXDD003());
		attributes.put("BBCNCLKLXDD004", getBBCNCLKLXDD004());
		attributes.put("BBCNCLKLXDD005", getBBCNCLKLXDD005());
		attributes.put("BBCNCLKLXDD006", getBBCNCLKLXDD006());
		attributes.put("BBCNCLKLXDD007", getBBCNCLKLXDD007());
		attributes.put("BBCNCLKLXDD008", getBBCNCLKLXDD008());
		attributes.put("BBCNCLKLXDD009", getBBCNCLKLXDD009());
		attributes.put("BBCNCLKLXDD010", getBBCNCLKLXDD010());
		attributes.put("BBCNCLKLXDD011", getBBCNCLKLXDD011());
		attributes.put("BBCNCLKLXDD012", getBBCNCLKLXDD012());
		attributes.put("BBCNCLKLXDD013", getBBCNCLKLXDD013());
		attributes.put("BBCNCLKLXDD014", getBBCNCLKLXDD014());
		attributes.put("BBCNCLKLXDD015", getBBCNCLKLXDD015());
		attributes.put("BBCNCLKLXDD016", getBBCNCLKLXDD016());
		attributes.put("BBCNCLKLXDD019", getBBCNCLKLXDD019());
		attributes.put("BBCNCLKLXDD017", getBBCNCLKLXDD017());
		attributes.put("BBCNCLKLXDD020", getBBCNCLKLXDD020());
		attributes.put("BBCNCLKLXDD018", getBBCNCLKLXDD018());
		attributes.put("BBCNCLKLXDD021", getBBCNCLKLXDD021());
		attributes.put("BBCNCLKLXDD022", getBBCNCLKLXDD022());
		attributes.put("BBCNCLKLXDD023", getBBCNCLKLXDD023());
		attributes.put("BBCNCLKLXDD024", getBBCNCLKLXDD024());
		attributes.put("BBCNCLKLXDD025", getBBCNCLKLXDD025());
		attributes.put("BBCNCLKLXDD026", getBBCNCLKLXDD026());
		attributes.put("BBCNCLKLXDD027", getBBCNCLKLXDD027());
		attributes.put("BBCNCLKLXDD028", getBBCNCLKLXDD028());
		attributes.put("BBCNCLKLXDD029", getBBCNCLKLXDD029());
		attributes.put("BBCNCLKLXDD031", getBBCNCLKLXDD031());
		attributes.put("BBCNCLKLXDD032", getBBCNCLKLXDD032());
		attributes.put("BBCNCLKLXDD033", getBBCNCLKLXDD033());
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

		String XDD01001 = (String)attributes.get("XDD01001");

		if (XDD01001 != null) {
			setXDD01001(XDD01001);
		}

		String XDD01002 = (String)attributes.get("XDD01002");

		if (XDD01002 != null) {
			setXDD01002(XDD01002);
		}

		String XDD01003 = (String)attributes.get("XDD01003");

		if (XDD01003 != null) {
			setXDD01003(XDD01003);
		}

		String XDD01004 = (String)attributes.get("XDD01004");

		if (XDD01004 != null) {
			setXDD01004(XDD01004);
		}

		String XDD01005 = (String)attributes.get("XDD01005");

		if (XDD01005 != null) {
			setXDD01005(XDD01005);
		}

		String XDD01006 = (String)attributes.get("XDD01006");

		if (XDD01006 != null) {
			setXDD01006(XDD01006);
		}

		String XDD01007 = (String)attributes.get("XDD01007");

		if (XDD01007 != null) {
			setXDD01007(XDD01007);
		}

		String XDD01008 = (String)attributes.get("XDD01008");

		if (XDD01008 != null) {
			setXDD01008(XDD01008);
		}

		String XDD01009 = (String)attributes.get("XDD01009");

		if (XDD01009 != null) {
			setXDD01009(XDD01009);
		}

		String XDD01010 = (String)attributes.get("XDD01010");

		if (XDD01010 != null) {
			setXDD01010(XDD01010);
		}

		String XDD01011 = (String)attributes.get("XDD01011");

		if (XDD01011 != null) {
			setXDD01011(XDD01011);
		}

		String XDD01012 = (String)attributes.get("XDD01012");

		if (XDD01012 != null) {
			setXDD01012(XDD01012);
		}

		String XDD01013 = (String)attributes.get("XDD01013");

		if (XDD01013 != null) {
			setXDD01013(XDD01013);
		}

		String XDD01014 = (String)attributes.get("XDD01014");

		if (XDD01014 != null) {
			setXDD01014(XDD01014);
		}

		String XDD01016 = (String)attributes.get("XDD01016");

		if (XDD01016 != null) {
			setXDD01016(XDD01016);
		}

		String XDD01017 = (String)attributes.get("XDD01017");

		if (XDD01017 != null) {
			setXDD01017(XDD01017);
		}

		String XDD01019 = (String)attributes.get("XDD01019");

		if (XDD01019 != null) {
			setXDD01019(XDD01019);
		}

		String XDD01020 = (String)attributes.get("XDD01020");

		if (XDD01020 != null) {
			setXDD01020(XDD01020);
		}

		String XDD01021 = (String)attributes.get("XDD01021");

		if (XDD01021 != null) {
			setXDD01021(XDD01021);
		}

		String XDD01022 = (String)attributes.get("XDD01022");

		if (XDD01022 != null) {
			setXDD01022(XDD01022);
		}

		String XDD01024 = (String)attributes.get("XDD01024");

		if (XDD01024 != null) {
			setXDD01024(XDD01024);
		}

		String XDD01025 = (String)attributes.get("XDD01025");

		if (XDD01025 != null) {
			setXDD01025(XDD01025);
		}

		String XDD01026 = (String)attributes.get("XDD01026");

		if (XDD01026 != null) {
			setXDD01026(XDD01026);
		}

		String XDD01027 = (String)attributes.get("XDD01027");

		if (XDD01027 != null) {
			setXDD01027(XDD01027);
		}

		String XDD01028 = (String)attributes.get("XDD01028");

		if (XDD01028 != null) {
			setXDD01028(XDD01028);
		}

		String XDD01030 = (String)attributes.get("XDD01030");

		if (XDD01030 != null) {
			setXDD01030(XDD01030);
		}

		String XDD01031 = (String)attributes.get("XDD01031");

		if (XDD01031 != null) {
			setXDD01031(XDD01031);
		}

		String XDD01032 = (String)attributes.get("XDD01032");

		if (XDD01032 != null) {
			setXDD01032(XDD01032);
		}

		String XDD01033 = (String)attributes.get("XDD01033");

		if (XDD01033 != null) {
			setXDD01033(XDD01033);
		}

		String XDD01034 = (String)attributes.get("XDD01034");

		if (XDD01034 != null) {
			setXDD01034(XDD01034);
		}

		String XDD01035 = (String)attributes.get("XDD01035");

		if (XDD01035 != null) {
			setXDD01035(XDD01035);
		}

		String XDD01036 = (String)attributes.get("XDD01036");

		if (XDD01036 != null) {
			setXDD01036(XDD01036);
		}

		String XDD01037 = (String)attributes.get("XDD01037");

		if (XDD01037 != null) {
			setXDD01037(XDD01037);
		}

		String XDD01038 = (String)attributes.get("XDD01038");

		if (XDD01038 != null) {
			setXDD01038(XDD01038);
		}

		String XDD01039 = (String)attributes.get("XDD01039");

		if (XDD01039 != null) {
			setXDD01039(XDD01039);
		}

		String XDD01040 = (String)attributes.get("XDD01040");

		if (XDD01040 != null) {
			setXDD01040(XDD01040);
		}

		String XDD01041 = (String)attributes.get("XDD01041");

		if (XDD01041 != null) {
			setXDD01041(XDD01041);
		}

		String XDD01042 = (String)attributes.get("XDD01042");

		if (XDD01042 != null) {
			setXDD01042(XDD01042);
		}

		String XDD01043 = (String)attributes.get("XDD01043");

		if (XDD01043 != null) {
			setXDD01043(XDD01043);
		}

		String XDD01044 = (String)attributes.get("XDD01044");

		if (XDD01044 != null) {
			setXDD01044(XDD01044);
		}

		String XDD01045 = (String)attributes.get("XDD01045");

		if (XDD01045 != null) {
			setXDD01045(XDD01045);
		}

		String XDD01046 = (String)attributes.get("XDD01046");

		if (XDD01046 != null) {
			setXDD01046(XDD01046);
		}

		String XDD01047 = (String)attributes.get("XDD01047");

		if (XDD01047 != null) {
			setXDD01047(XDD01047);
		}

		String XDD01049 = (String)attributes.get("XDD01049");

		if (XDD01049 != null) {
			setXDD01049(XDD01049);
		}

		String XDD01050 = (String)attributes.get("XDD01050");

		if (XDD01050 != null) {
			setXDD01050(XDD01050);
		}

		String XDD01051 = (String)attributes.get("XDD01051");

		if (XDD01051 != null) {
			setXDD01051(XDD01051);
		}

		String XDD01052 = (String)attributes.get("XDD01052");

		if (XDD01052 != null) {
			setXDD01052(XDD01052);
		}

		String XDD01053 = (String)attributes.get("XDD01053");

		if (XDD01053 != null) {
			setXDD01053(XDD01053);
		}

		String XDD01054 = (String)attributes.get("XDD01054");

		if (XDD01054 != null) {
			setXDD01054(XDD01054);
		}

		String XDD01055 = (String)attributes.get("XDD01055");

		if (XDD01055 != null) {
			setXDD01055(XDD01055);
		}

		String XDD01056 = (String)attributes.get("XDD01056");

		if (XDD01056 != null) {
			setXDD01056(XDD01056);
		}

		String XDD01057 = (String)attributes.get("XDD01057");

		if (XDD01057 != null) {
			setXDD01057(XDD01057);
		}

		String XDD01058 = (String)attributes.get("XDD01058");

		if (XDD01058 != null) {
			setXDD01058(XDD01058);
		}

		String XDD01059 = (String)attributes.get("XDD01059");

		if (XDD01059 != null) {
			setXDD01059(XDD01059);
		}

		String XDD01060 = (String)attributes.get("XDD01060");

		if (XDD01060 != null) {
			setXDD01060(XDD01060);
		}

		String XDD0076 = (String)attributes.get("XDD0076");

		if (XDD0076 != null) {
			setXDD0076(XDD0076);
		}

		String XDD0077 = (String)attributes.get("XDD0077");

		if (XDD0077 != null) {
			setXDD0077(XDD0077);
		}

		String XDD0078 = (String)attributes.get("XDD0078");

		if (XDD0078 != null) {
			setXDD0078(XDD0078);
		}

		String XDD0079 = (String)attributes.get("XDD0079");

		if (XDD0079 != null) {
			setXDD0079(XDD0079);
		}

		String XDD0080 = (String)attributes.get("XDD0080");

		if (XDD0080 != null) {
			setXDD0080(XDD0080);
		}

		String XDD0081 = (String)attributes.get("XDD0081");

		if (XDD0081 != null) {
			setXDD0081(XDD0081);
		}

		String XDD0082 = (String)attributes.get("XDD0082");

		if (XDD0082 != null) {
			setXDD0082(XDD0082);
		}

		String XDD0083 = (String)attributes.get("XDD0083");

		if (XDD0083 != null) {
			setXDD0083(XDD0083);
		}

		String XDD0084 = (String)attributes.get("XDD0084");

		if (XDD0084 != null) {
			setXDD0084(XDD0084);
		}

		String XDD0085 = (String)attributes.get("XDD0085");

		if (XDD0085 != null) {
			setXDD0085(XDD0085);
		}

		String XDD0086 = (String)attributes.get("XDD0086");

		if (XDD0086 != null) {
			setXDD0086(XDD0086);
		}

		String XDD0087 = (String)attributes.get("XDD0087");

		if (XDD0087 != null) {
			setXDD0087(XDD0087);
		}

		String XDD0088 = (String)attributes.get("XDD0088");

		if (XDD0088 != null) {
			setXDD0088(XDD0088);
		}

		String XDD0089 = (String)attributes.get("XDD0089");

		if (XDD0089 != null) {
			setXDD0089(XDD0089);
		}

		String XDD0090 = (String)attributes.get("XDD0090");

		if (XDD0090 != null) {
			setXDD0090(XDD0090);
		}

		String XDD0091 = (String)attributes.get("XDD0091");

		if (XDD0091 != null) {
			setXDD0091(XDD0091);
		}

		String XDD0092 = (String)attributes.get("XDD0092");

		if (XDD0092 != null) {
			setXDD0092(XDD0092);
		}

		String XDD0093 = (String)attributes.get("XDD0093");

		if (XDD0093 != null) {
			setXDD0093(XDD0093);
		}

		String XDD0094 = (String)attributes.get("XDD0094");

		if (XDD0094 != null) {
			setXDD0094(XDD0094);
		}

		String XDD0095 = (String)attributes.get("XDD0095");

		if (XDD0095 != null) {
			setXDD0095(XDD0095);
		}

		String XDD0096 = (String)attributes.get("XDD0096");

		if (XDD0096 != null) {
			setXDD0096(XDD0096);
		}

		String XDD0097 = (String)attributes.get("XDD0097");

		if (XDD0097 != null) {
			setXDD0097(XDD0097);
		}

		String XDD0098 = (String)attributes.get("XDD0098");

		if (XDD0098 != null) {
			setXDD0098(XDD0098);
		}

		String XDD0099 = (String)attributes.get("XDD0099");

		if (XDD0099 != null) {
			setXDD0099(XDD0099);
		}

		String XDD0100 = (String)attributes.get("XDD0100");

		if (XDD0100 != null) {
			setXDD0100(XDD0100);
		}

		String XDD0101 = (String)attributes.get("XDD0101");

		if (XDD0101 != null) {
			setXDD0101(XDD0101);
		}

		String XDD0102 = (String)attributes.get("XDD0102");

		if (XDD0102 != null) {
			setXDD0102(XDD0102);
		}

		String XDD0103 = (String)attributes.get("XDD0103");

		if (XDD0103 != null) {
			setXDD0103(XDD0103);
		}

		String XDD0104 = (String)attributes.get("XDD0104");

		if (XDD0104 != null) {
			setXDD0104(XDD0104);
		}

		String XDD0105 = (String)attributes.get("XDD0105");

		if (XDD0105 != null) {
			setXDD0105(XDD0105);
		}

		String XDD0106 = (String)attributes.get("XDD0106");

		if (XDD0106 != null) {
			setXDD0106(XDD0106);
		}

		String XDD0107 = (String)attributes.get("XDD0107");

		if (XDD0107 != null) {
			setXDD0107(XDD0107);
		}

		String XDD0108 = (String)attributes.get("XDD0108");

		if (XDD0108 != null) {
			setXDD0108(XDD0108);
		}

		String XDD0109 = (String)attributes.get("XDD0109");

		if (XDD0109 != null) {
			setXDD0109(XDD0109);
		}

		String XDD0110 = (String)attributes.get("XDD0110");

		if (XDD0110 != null) {
			setXDD0110(XDD0110);
		}

		String XDD0111 = (String)attributes.get("XDD0111");

		if (XDD0111 != null) {
			setXDD0111(XDD0111);
		}

		String XDD0112 = (String)attributes.get("XDD0112");

		if (XDD0112 != null) {
			setXDD0112(XDD0112);
		}

		String XDD0113 = (String)attributes.get("XDD0113");

		if (XDD0113 != null) {
			setXDD0113(XDD0113);
		}

		String XDD0114 = (String)attributes.get("XDD0114");

		if (XDD0114 != null) {
			setXDD0114(XDD0114);
		}

		String XDD0115 = (String)attributes.get("XDD0115");

		if (XDD0115 != null) {
			setXDD0115(XDD0115);
		}

		String XDD0116 = (String)attributes.get("XDD0116");

		if (XDD0116 != null) {
			setXDD0116(XDD0116);
		}

		String XDD0117 = (String)attributes.get("XDD0117");

		if (XDD0117 != null) {
			setXDD0117(XDD0117);
		}

		String XDD0118 = (String)attributes.get("XDD0118");

		if (XDD0118 != null) {
			setXDD0118(XDD0118);
		}

		String XDD0119 = (String)attributes.get("XDD0119");

		if (XDD0119 != null) {
			setXDD0119(XDD0119);
		}

		String XDD0120 = (String)attributes.get("XDD0120");

		if (XDD0120 != null) {
			setXDD0120(XDD0120);
		}

		String XDD0121 = (String)attributes.get("XDD0121");

		if (XDD0121 != null) {
			setXDD0121(XDD0121);
		}

		String XDD0122 = (String)attributes.get("XDD0122");

		if (XDD0122 != null) {
			setXDD0122(XDD0122);
		}

		String XDD0123 = (String)attributes.get("XDD0123");

		if (XDD0123 != null) {
			setXDD0123(XDD0123);
		}

		String XDD0124 = (String)attributes.get("XDD0124");

		if (XDD0124 != null) {
			setXDD0124(XDD0124);
		}

		String XDD0125 = (String)attributes.get("XDD0125");

		if (XDD0125 != null) {
			setXDD0125(XDD0125);
		}

		String XDD0126 = (String)attributes.get("XDD0126");

		if (XDD0126 != null) {
			setXDD0126(XDD0126);
		}

		String XDD0127 = (String)attributes.get("XDD0127");

		if (XDD0127 != null) {
			setXDD0127(XDD0127);
		}

		String XDD0128 = (String)attributes.get("XDD0128");

		if (XDD0128 != null) {
			setXDD0128(XDD0128);
		}

		String XDD0129 = (String)attributes.get("XDD0129");

		if (XDD0129 != null) {
			setXDD0129(XDD0129);
		}

		String XDD0130 = (String)attributes.get("XDD0130");

		if (XDD0130 != null) {
			setXDD0130(XDD0130);
		}

		String XDD0131 = (String)attributes.get("XDD0131");

		if (XDD0131 != null) {
			setXDD0131(XDD0131);
		}

		String XDD0132 = (String)attributes.get("XDD0132");

		if (XDD0132 != null) {
			setXDD0132(XDD0132);
		}

		String XDD0133 = (String)attributes.get("XDD0133");

		if (XDD0133 != null) {
			setXDD0133(XDD0133);
		}

		String XDD0134 = (String)attributes.get("XDD0134");

		if (XDD0134 != null) {
			setXDD0134(XDD0134);
		}

		String XDD0135 = (String)attributes.get("XDD0135");

		if (XDD0135 != null) {
			setXDD0135(XDD0135);
		}

		String XDD0136 = (String)attributes.get("XDD0136");

		if (XDD0136 != null) {
			setXDD0136(XDD0136);
		}

		String XDD0137 = (String)attributes.get("XDD0137");

		if (XDD0137 != null) {
			setXDD0137(XDD0137);
		}

		String XDD0138 = (String)attributes.get("XDD0138");

		if (XDD0138 != null) {
			setXDD0138(XDD0138);
		}

		String XDD0139 = (String)attributes.get("XDD0139");

		if (XDD0139 != null) {
			setXDD0139(XDD0139);
		}

		String XDD0140 = (String)attributes.get("XDD0140");

		if (XDD0140 != null) {
			setXDD0140(XDD0140);
		}

		String XDD0141 = (String)attributes.get("XDD0141");

		if (XDD0141 != null) {
			setXDD0141(XDD0141);
		}

		String XDD0142 = (String)attributes.get("XDD0142");

		if (XDD0142 != null) {
			setXDD0142(XDD0142);
		}

		String XDD0143 = (String)attributes.get("XDD0143");

		if (XDD0143 != null) {
			setXDD0143(XDD0143);
		}

		String XDD0144 = (String)attributes.get("XDD0144");

		if (XDD0144 != null) {
			setXDD0144(XDD0144);
		}

		String XDD0145 = (String)attributes.get("XDD0145");

		if (XDD0145 != null) {
			setXDD0145(XDD0145);
		}

		String XDD0146 = (String)attributes.get("XDD0146");

		if (XDD0146 != null) {
			setXDD0146(XDD0146);
		}

		String XDD0147 = (String)attributes.get("XDD0147");

		if (XDD0147 != null) {
			setXDD0147(XDD0147);
		}

		String XDD0148 = (String)attributes.get("XDD0148");

		if (XDD0148 != null) {
			setXDD0148(XDD0148);
		}

		String XDD0149 = (String)attributes.get("XDD0149");

		if (XDD0149 != null) {
			setXDD0149(XDD0149);
		}

		String XDD0150 = (String)attributes.get("XDD0150");

		if (XDD0150 != null) {
			setXDD0150(XDD0150);
		}

		String XDD0151 = (String)attributes.get("XDD0151");

		if (XDD0151 != null) {
			setXDD0151(XDD0151);
		}

		String XDD0152 = (String)attributes.get("XDD0152");

		if (XDD0152 != null) {
			setXDD0152(XDD0152);
		}

		String XDD0153 = (String)attributes.get("XDD0153");

		if (XDD0153 != null) {
			setXDD0153(XDD0153);
		}

		String XDD0154 = (String)attributes.get("XDD0154");

		if (XDD0154 != null) {
			setXDD0154(XDD0154);
		}

		String XDD0155 = (String)attributes.get("XDD0155");

		if (XDD0155 != null) {
			setXDD0155(XDD0155);
		}

		String XDD0156 = (String)attributes.get("XDD0156");

		if (XDD0156 != null) {
			setXDD0156(XDD0156);
		}

		String XDD0157 = (String)attributes.get("XDD0157");

		if (XDD0157 != null) {
			setXDD0157(XDD0157);
		}

		String XDD0158 = (String)attributes.get("XDD0158");

		if (XDD0158 != null) {
			setXDD0158(XDD0158);
		}

		String XDD0159 = (String)attributes.get("XDD0159");

		if (XDD0159 != null) {
			setXDD0159(XDD0159);
		}

		String XDD0160 = (String)attributes.get("XDD0160");

		if (XDD0160 != null) {
			setXDD0160(XDD0160);
		}

		String XDD0161 = (String)attributes.get("XDD0161");

		if (XDD0161 != null) {
			setXDD0161(XDD0161);
		}

		String BBCNCLKLXDD001 = (String)attributes.get("BBCNCLKLXDD001");

		if (BBCNCLKLXDD001 != null) {
			setBBCNCLKLXDD001(BBCNCLKLXDD001);
		}

		String BBCNCLKLXDD002 = (String)attributes.get("BBCNCLKLXDD002");

		if (BBCNCLKLXDD002 != null) {
			setBBCNCLKLXDD002(BBCNCLKLXDD002);
		}

		String BBCNCLKLXDD003 = (String)attributes.get("BBCNCLKLXDD003");

		if (BBCNCLKLXDD003 != null) {
			setBBCNCLKLXDD003(BBCNCLKLXDD003);
		}

		String BBCNCLKLXDD004 = (String)attributes.get("BBCNCLKLXDD004");

		if (BBCNCLKLXDD004 != null) {
			setBBCNCLKLXDD004(BBCNCLKLXDD004);
		}

		String BBCNCLKLXDD005 = (String)attributes.get("BBCNCLKLXDD005");

		if (BBCNCLKLXDD005 != null) {
			setBBCNCLKLXDD005(BBCNCLKLXDD005);
		}

		String BBCNCLKLXDD006 = (String)attributes.get("BBCNCLKLXDD006");

		if (BBCNCLKLXDD006 != null) {
			setBBCNCLKLXDD006(BBCNCLKLXDD006);
		}

		String BBCNCLKLXDD007 = (String)attributes.get("BBCNCLKLXDD007");

		if (BBCNCLKLXDD007 != null) {
			setBBCNCLKLXDD007(BBCNCLKLXDD007);
		}

		String BBCNCLKLXDD008 = (String)attributes.get("BBCNCLKLXDD008");

		if (BBCNCLKLXDD008 != null) {
			setBBCNCLKLXDD008(BBCNCLKLXDD008);
		}

		String BBCNCLKLXDD009 = (String)attributes.get("BBCNCLKLXDD009");

		if (BBCNCLKLXDD009 != null) {
			setBBCNCLKLXDD009(BBCNCLKLXDD009);
		}

		String BBCNCLKLXDD010 = (String)attributes.get("BBCNCLKLXDD010");

		if (BBCNCLKLXDD010 != null) {
			setBBCNCLKLXDD010(BBCNCLKLXDD010);
		}

		String BBCNCLKLXDD011 = (String)attributes.get("BBCNCLKLXDD011");

		if (BBCNCLKLXDD011 != null) {
			setBBCNCLKLXDD011(BBCNCLKLXDD011);
		}

		String BBCNCLKLXDD012 = (String)attributes.get("BBCNCLKLXDD012");

		if (BBCNCLKLXDD012 != null) {
			setBBCNCLKLXDD012(BBCNCLKLXDD012);
		}

		String BBCNCLKLXDD013 = (String)attributes.get("BBCNCLKLXDD013");

		if (BBCNCLKLXDD013 != null) {
			setBBCNCLKLXDD013(BBCNCLKLXDD013);
		}

		String BBCNCLKLXDD014 = (String)attributes.get("BBCNCLKLXDD014");

		if (BBCNCLKLXDD014 != null) {
			setBBCNCLKLXDD014(BBCNCLKLXDD014);
		}

		String BBCNCLKLXDD015 = (String)attributes.get("BBCNCLKLXDD015");

		if (BBCNCLKLXDD015 != null) {
			setBBCNCLKLXDD015(BBCNCLKLXDD015);
		}

		String BBCNCLKLXDD016 = (String)attributes.get("BBCNCLKLXDD016");

		if (BBCNCLKLXDD016 != null) {
			setBBCNCLKLXDD016(BBCNCLKLXDD016);
		}

		String BBCNCLKLXDD019 = (String)attributes.get("BBCNCLKLXDD019");

		if (BBCNCLKLXDD019 != null) {
			setBBCNCLKLXDD019(BBCNCLKLXDD019);
		}

		String BBCNCLKLXDD017 = (String)attributes.get("BBCNCLKLXDD017");

		if (BBCNCLKLXDD017 != null) {
			setBBCNCLKLXDD017(BBCNCLKLXDD017);
		}

		String BBCNCLKLXDD020 = (String)attributes.get("BBCNCLKLXDD020");

		if (BBCNCLKLXDD020 != null) {
			setBBCNCLKLXDD020(BBCNCLKLXDD020);
		}

		String BBCNCLKLXDD018 = (String)attributes.get("BBCNCLKLXDD018");

		if (BBCNCLKLXDD018 != null) {
			setBBCNCLKLXDD018(BBCNCLKLXDD018);
		}

		String BBCNCLKLXDD021 = (String)attributes.get("BBCNCLKLXDD021");

		if (BBCNCLKLXDD021 != null) {
			setBBCNCLKLXDD021(BBCNCLKLXDD021);
		}

		String BBCNCLKLXDD022 = (String)attributes.get("BBCNCLKLXDD022");

		if (BBCNCLKLXDD022 != null) {
			setBBCNCLKLXDD022(BBCNCLKLXDD022);
		}

		String BBCNCLKLXDD023 = (String)attributes.get("BBCNCLKLXDD023");

		if (BBCNCLKLXDD023 != null) {
			setBBCNCLKLXDD023(BBCNCLKLXDD023);
		}

		String BBCNCLKLXDD024 = (String)attributes.get("BBCNCLKLXDD024");

		if (BBCNCLKLXDD024 != null) {
			setBBCNCLKLXDD024(BBCNCLKLXDD024);
		}

		String BBCNCLKLXDD025 = (String)attributes.get("BBCNCLKLXDD025");

		if (BBCNCLKLXDD025 != null) {
			setBBCNCLKLXDD025(BBCNCLKLXDD025);
		}

		String BBCNCLKLXDD026 = (String)attributes.get("BBCNCLKLXDD026");

		if (BBCNCLKLXDD026 != null) {
			setBBCNCLKLXDD026(BBCNCLKLXDD026);
		}

		String BBCNCLKLXDD027 = (String)attributes.get("BBCNCLKLXDD027");

		if (BBCNCLKLXDD027 != null) {
			setBBCNCLKLXDD027(BBCNCLKLXDD027);
		}

		String BBCNCLKLXDD028 = (String)attributes.get("BBCNCLKLXDD028");

		if (BBCNCLKLXDD028 != null) {
			setBBCNCLKLXDD028(BBCNCLKLXDD028);
		}

		String BBCNCLKLXDD029 = (String)attributes.get("BBCNCLKLXDD029");

		if (BBCNCLKLXDD029 != null) {
			setBBCNCLKLXDD029(BBCNCLKLXDD029);
		}

		String BBCNCLKLXDD031 = (String)attributes.get("BBCNCLKLXDD031");

		if (BBCNCLKLXDD031 != null) {
			setBBCNCLKLXDD031(BBCNCLKLXDD031);
		}

		String BBCNCLKLXDD032 = (String)attributes.get("BBCNCLKLXDD032");

		if (BBCNCLKLXDD032 != null) {
			setBBCNCLKLXDD032(BBCNCLKLXDD032);
		}

		String BBCNCLKLXDD033 = (String)attributes.get("BBCNCLKLXDD033");

		if (BBCNCLKLXDD033 != null) {
			setBBCNCLKLXDD033(BBCNCLKLXDD033);
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
	public VRTechnicalSpec_XDD toEscapedModel() {
		return new VRTechnicalSpec_XDDWrapper(_vrTechnicalSpec_XDD.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XDD toUnescapedModel() {
		return new VRTechnicalSpec_XDDWrapper(_vrTechnicalSpec_XDD.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XDD.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XDD.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XDD.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XDD.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XDD> toCacheModel() {
		return _vrTechnicalSpec_XDD.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XDD vrTechnicalSpec_XDD) {
		return _vrTechnicalSpec_XDD.compareTo(vrTechnicalSpec_XDD);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XDD.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XDD.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XDDWrapper((VRTechnicalSpec_XDD)_vrTechnicalSpec_XDD.clone());
	}

	/**
	* Returns the bbcnclklxdd001 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd001 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD001() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD001();
	}

	/**
	* Returns the bbcnclklxdd002 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd002 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD002() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD002();
	}

	/**
	* Returns the bbcnclklxdd003 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd003 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD003() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD003();
	}

	/**
	* Returns the bbcnclklxdd004 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd004 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD004() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD004();
	}

	/**
	* Returns the bbcnclklxdd005 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd005 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD005() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD005();
	}

	/**
	* Returns the bbcnclklxdd006 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd006 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD006() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD006();
	}

	/**
	* Returns the bbcnclklxdd007 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd007 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD007() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD007();
	}

	/**
	* Returns the bbcnclklxdd008 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd008 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD008() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD008();
	}

	/**
	* Returns the bbcnclklxdd009 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd009 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD009() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD009();
	}

	/**
	* Returns the bbcnclklxdd010 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd010 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD010() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD010();
	}

	/**
	* Returns the bbcnclklxdd011 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd011 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD011() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD011();
	}

	/**
	* Returns the bbcnclklxdd012 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd012 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD012() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD012();
	}

	/**
	* Returns the bbcnclklxdd013 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd013 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD013() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD013();
	}

	/**
	* Returns the bbcnclklxdd014 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd014 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD014() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD014();
	}

	/**
	* Returns the bbcnclklxdd015 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd015 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD015() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD015();
	}

	/**
	* Returns the bbcnclklxdd016 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd016 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD016() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD016();
	}

	/**
	* Returns the bbcnclklxdd017 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd017 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD017() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD017();
	}

	/**
	* Returns the bbcnclklxdd018 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd018 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD018() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD018();
	}

	/**
	* Returns the bbcnclklxdd019 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd019 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD019() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD019();
	}

	/**
	* Returns the bbcnclklxdd020 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd020 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD020() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD020();
	}

	/**
	* Returns the bbcnclklxdd021 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd021 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD021() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD021();
	}

	/**
	* Returns the bbcnclklxdd022 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd022 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD022() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD022();
	}

	/**
	* Returns the bbcnclklxdd023 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd023 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD023() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD023();
	}

	/**
	* Returns the bbcnclklxdd024 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd024 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD024() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD024();
	}

	/**
	* Returns the bbcnclklxdd025 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd025 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD025() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD025();
	}

	/**
	* Returns the bbcnclklxdd026 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd026 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD026() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD026();
	}

	/**
	* Returns the bbcnclklxdd027 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd027 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD027() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD027();
	}

	/**
	* Returns the bbcnclklxdd028 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd028 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD028() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD028();
	}

	/**
	* Returns the bbcnclklxdd029 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd029 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD029() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD029();
	}

	/**
	* Returns the bbcnclklxdd031 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd031 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD031() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD031();
	}

	/**
	* Returns the bbcnclklxdd032 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd032 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD032() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD032();
	}

	/**
	* Returns the bbcnclklxdd033 of this vr technical spec_xdd.
	*
	* @return the bbcnclklxdd033 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD033() {
		return _vrTechnicalSpec_XDD.getBBCNCLKLXDD033();
	}

	/**
	* Returns the deliverable code of this vr technical spec_xdd.
	*
	* @return the deliverable code of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XDD.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xdd.
	*
	* @return the dossier ID ctn of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XDD.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xdd.
	*
	* @return the dossier no of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XDD.getDossierNo();
	}

	/**
	* Returns the reference uid of this vr technical spec_xdd.
	*
	* @return the reference uid of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XDD.getReferenceUid();
	}

	/**
	* Returns the xdd0076 of this vr technical spec_xdd.
	*
	* @return the xdd0076 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0076() {
		return _vrTechnicalSpec_XDD.getXDD0076();
	}

	/**
	* Returns the xdd0077 of this vr technical spec_xdd.
	*
	* @return the xdd0077 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0077() {
		return _vrTechnicalSpec_XDD.getXDD0077();
	}

	/**
	* Returns the xdd0078 of this vr technical spec_xdd.
	*
	* @return the xdd0078 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0078() {
		return _vrTechnicalSpec_XDD.getXDD0078();
	}

	/**
	* Returns the xdd0079 of this vr technical spec_xdd.
	*
	* @return the xdd0079 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0079() {
		return _vrTechnicalSpec_XDD.getXDD0079();
	}

	/**
	* Returns the xdd0080 of this vr technical spec_xdd.
	*
	* @return the xdd0080 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0080() {
		return _vrTechnicalSpec_XDD.getXDD0080();
	}

	/**
	* Returns the xdd0081 of this vr technical spec_xdd.
	*
	* @return the xdd0081 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0081() {
		return _vrTechnicalSpec_XDD.getXDD0081();
	}

	/**
	* Returns the xdd0082 of this vr technical spec_xdd.
	*
	* @return the xdd0082 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0082() {
		return _vrTechnicalSpec_XDD.getXDD0082();
	}

	/**
	* Returns the xdd0083 of this vr technical spec_xdd.
	*
	* @return the xdd0083 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0083() {
		return _vrTechnicalSpec_XDD.getXDD0083();
	}

	/**
	* Returns the xdd0084 of this vr technical spec_xdd.
	*
	* @return the xdd0084 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0084() {
		return _vrTechnicalSpec_XDD.getXDD0084();
	}

	/**
	* Returns the xdd0085 of this vr technical spec_xdd.
	*
	* @return the xdd0085 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0085() {
		return _vrTechnicalSpec_XDD.getXDD0085();
	}

	/**
	* Returns the xdd0086 of this vr technical spec_xdd.
	*
	* @return the xdd0086 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0086() {
		return _vrTechnicalSpec_XDD.getXDD0086();
	}

	/**
	* Returns the xdd0087 of this vr technical spec_xdd.
	*
	* @return the xdd0087 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0087() {
		return _vrTechnicalSpec_XDD.getXDD0087();
	}

	/**
	* Returns the xdd0088 of this vr technical spec_xdd.
	*
	* @return the xdd0088 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0088() {
		return _vrTechnicalSpec_XDD.getXDD0088();
	}

	/**
	* Returns the xdd0089 of this vr technical spec_xdd.
	*
	* @return the xdd0089 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0089() {
		return _vrTechnicalSpec_XDD.getXDD0089();
	}

	/**
	* Returns the xdd0090 of this vr technical spec_xdd.
	*
	* @return the xdd0090 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0090() {
		return _vrTechnicalSpec_XDD.getXDD0090();
	}

	/**
	* Returns the xdd0091 of this vr technical spec_xdd.
	*
	* @return the xdd0091 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0091() {
		return _vrTechnicalSpec_XDD.getXDD0091();
	}

	/**
	* Returns the xdd0092 of this vr technical spec_xdd.
	*
	* @return the xdd0092 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0092() {
		return _vrTechnicalSpec_XDD.getXDD0092();
	}

	/**
	* Returns the xdd0093 of this vr technical spec_xdd.
	*
	* @return the xdd0093 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0093() {
		return _vrTechnicalSpec_XDD.getXDD0093();
	}

	/**
	* Returns the xdd0094 of this vr technical spec_xdd.
	*
	* @return the xdd0094 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0094() {
		return _vrTechnicalSpec_XDD.getXDD0094();
	}

	/**
	* Returns the xdd0095 of this vr technical spec_xdd.
	*
	* @return the xdd0095 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0095() {
		return _vrTechnicalSpec_XDD.getXDD0095();
	}

	/**
	* Returns the xdd0096 of this vr technical spec_xdd.
	*
	* @return the xdd0096 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0096() {
		return _vrTechnicalSpec_XDD.getXDD0096();
	}

	/**
	* Returns the xdd0097 of this vr technical spec_xdd.
	*
	* @return the xdd0097 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0097() {
		return _vrTechnicalSpec_XDD.getXDD0097();
	}

	/**
	* Returns the xdd0098 of this vr technical spec_xdd.
	*
	* @return the xdd0098 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0098() {
		return _vrTechnicalSpec_XDD.getXDD0098();
	}

	/**
	* Returns the xdd0099 of this vr technical spec_xdd.
	*
	* @return the xdd0099 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0099() {
		return _vrTechnicalSpec_XDD.getXDD0099();
	}

	/**
	* Returns the xdd0100 of this vr technical spec_xdd.
	*
	* @return the xdd0100 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0100() {
		return _vrTechnicalSpec_XDD.getXDD0100();
	}

	/**
	* Returns the xdd01001 of this vr technical spec_xdd.
	*
	* @return the xdd01001 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01001() {
		return _vrTechnicalSpec_XDD.getXDD01001();
	}

	/**
	* Returns the xdd01002 of this vr technical spec_xdd.
	*
	* @return the xdd01002 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01002() {
		return _vrTechnicalSpec_XDD.getXDD01002();
	}

	/**
	* Returns the xdd01003 of this vr technical spec_xdd.
	*
	* @return the xdd01003 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01003() {
		return _vrTechnicalSpec_XDD.getXDD01003();
	}

	/**
	* Returns the xdd01004 of this vr technical spec_xdd.
	*
	* @return the xdd01004 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01004() {
		return _vrTechnicalSpec_XDD.getXDD01004();
	}

	/**
	* Returns the xdd01005 of this vr technical spec_xdd.
	*
	* @return the xdd01005 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01005() {
		return _vrTechnicalSpec_XDD.getXDD01005();
	}

	/**
	* Returns the xdd01006 of this vr technical spec_xdd.
	*
	* @return the xdd01006 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01006() {
		return _vrTechnicalSpec_XDD.getXDD01006();
	}

	/**
	* Returns the xdd01007 of this vr technical spec_xdd.
	*
	* @return the xdd01007 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01007() {
		return _vrTechnicalSpec_XDD.getXDD01007();
	}

	/**
	* Returns the xdd01008 of this vr technical spec_xdd.
	*
	* @return the xdd01008 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01008() {
		return _vrTechnicalSpec_XDD.getXDD01008();
	}

	/**
	* Returns the xdd01009 of this vr technical spec_xdd.
	*
	* @return the xdd01009 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01009() {
		return _vrTechnicalSpec_XDD.getXDD01009();
	}

	/**
	* Returns the xdd0101 of this vr technical spec_xdd.
	*
	* @return the xdd0101 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0101() {
		return _vrTechnicalSpec_XDD.getXDD0101();
	}

	/**
	* Returns the xdd01010 of this vr technical spec_xdd.
	*
	* @return the xdd01010 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01010() {
		return _vrTechnicalSpec_XDD.getXDD01010();
	}

	/**
	* Returns the xdd01011 of this vr technical spec_xdd.
	*
	* @return the xdd01011 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01011() {
		return _vrTechnicalSpec_XDD.getXDD01011();
	}

	/**
	* Returns the xdd01012 of this vr technical spec_xdd.
	*
	* @return the xdd01012 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01012() {
		return _vrTechnicalSpec_XDD.getXDD01012();
	}

	/**
	* Returns the xdd01013 of this vr technical spec_xdd.
	*
	* @return the xdd01013 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01013() {
		return _vrTechnicalSpec_XDD.getXDD01013();
	}

	/**
	* Returns the xdd01014 of this vr technical spec_xdd.
	*
	* @return the xdd01014 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01014() {
		return _vrTechnicalSpec_XDD.getXDD01014();
	}

	/**
	* Returns the xdd01016 of this vr technical spec_xdd.
	*
	* @return the xdd01016 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01016() {
		return _vrTechnicalSpec_XDD.getXDD01016();
	}

	/**
	* Returns the xdd01017 of this vr technical spec_xdd.
	*
	* @return the xdd01017 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01017() {
		return _vrTechnicalSpec_XDD.getXDD01017();
	}

	/**
	* Returns the xdd01019 of this vr technical spec_xdd.
	*
	* @return the xdd01019 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01019() {
		return _vrTechnicalSpec_XDD.getXDD01019();
	}

	/**
	* Returns the xdd0102 of this vr technical spec_xdd.
	*
	* @return the xdd0102 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0102() {
		return _vrTechnicalSpec_XDD.getXDD0102();
	}

	/**
	* Returns the xdd01020 of this vr technical spec_xdd.
	*
	* @return the xdd01020 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01020() {
		return _vrTechnicalSpec_XDD.getXDD01020();
	}

	/**
	* Returns the xdd01021 of this vr technical spec_xdd.
	*
	* @return the xdd01021 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01021() {
		return _vrTechnicalSpec_XDD.getXDD01021();
	}

	/**
	* Returns the xdd01022 of this vr technical spec_xdd.
	*
	* @return the xdd01022 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01022() {
		return _vrTechnicalSpec_XDD.getXDD01022();
	}

	/**
	* Returns the xdd01024 of this vr technical spec_xdd.
	*
	* @return the xdd01024 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01024() {
		return _vrTechnicalSpec_XDD.getXDD01024();
	}

	/**
	* Returns the xdd01025 of this vr technical spec_xdd.
	*
	* @return the xdd01025 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01025() {
		return _vrTechnicalSpec_XDD.getXDD01025();
	}

	/**
	* Returns the xdd01026 of this vr technical spec_xdd.
	*
	* @return the xdd01026 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01026() {
		return _vrTechnicalSpec_XDD.getXDD01026();
	}

	/**
	* Returns the xdd01027 of this vr technical spec_xdd.
	*
	* @return the xdd01027 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01027() {
		return _vrTechnicalSpec_XDD.getXDD01027();
	}

	/**
	* Returns the xdd01028 of this vr technical spec_xdd.
	*
	* @return the xdd01028 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01028() {
		return _vrTechnicalSpec_XDD.getXDD01028();
	}

	/**
	* Returns the xdd0103 of this vr technical spec_xdd.
	*
	* @return the xdd0103 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0103() {
		return _vrTechnicalSpec_XDD.getXDD0103();
	}

	/**
	* Returns the xdd01030 of this vr technical spec_xdd.
	*
	* @return the xdd01030 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01030() {
		return _vrTechnicalSpec_XDD.getXDD01030();
	}

	/**
	* Returns the xdd01031 of this vr technical spec_xdd.
	*
	* @return the xdd01031 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01031() {
		return _vrTechnicalSpec_XDD.getXDD01031();
	}

	/**
	* Returns the xdd01032 of this vr technical spec_xdd.
	*
	* @return the xdd01032 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01032() {
		return _vrTechnicalSpec_XDD.getXDD01032();
	}

	/**
	* Returns the xdd01033 of this vr technical spec_xdd.
	*
	* @return the xdd01033 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01033() {
		return _vrTechnicalSpec_XDD.getXDD01033();
	}

	/**
	* Returns the xdd01034 of this vr technical spec_xdd.
	*
	* @return the xdd01034 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01034() {
		return _vrTechnicalSpec_XDD.getXDD01034();
	}

	/**
	* Returns the xdd01035 of this vr technical spec_xdd.
	*
	* @return the xdd01035 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01035() {
		return _vrTechnicalSpec_XDD.getXDD01035();
	}

	/**
	* Returns the xdd01036 of this vr technical spec_xdd.
	*
	* @return the xdd01036 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01036() {
		return _vrTechnicalSpec_XDD.getXDD01036();
	}

	/**
	* Returns the xdd01037 of this vr technical spec_xdd.
	*
	* @return the xdd01037 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01037() {
		return _vrTechnicalSpec_XDD.getXDD01037();
	}

	/**
	* Returns the xdd01038 of this vr technical spec_xdd.
	*
	* @return the xdd01038 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01038() {
		return _vrTechnicalSpec_XDD.getXDD01038();
	}

	/**
	* Returns the xdd01039 of this vr technical spec_xdd.
	*
	* @return the xdd01039 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01039() {
		return _vrTechnicalSpec_XDD.getXDD01039();
	}

	/**
	* Returns the xdd0104 of this vr technical spec_xdd.
	*
	* @return the xdd0104 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0104() {
		return _vrTechnicalSpec_XDD.getXDD0104();
	}

	/**
	* Returns the xdd01040 of this vr technical spec_xdd.
	*
	* @return the xdd01040 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01040() {
		return _vrTechnicalSpec_XDD.getXDD01040();
	}

	/**
	* Returns the xdd01041 of this vr technical spec_xdd.
	*
	* @return the xdd01041 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01041() {
		return _vrTechnicalSpec_XDD.getXDD01041();
	}

	/**
	* Returns the xdd01042 of this vr technical spec_xdd.
	*
	* @return the xdd01042 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01042() {
		return _vrTechnicalSpec_XDD.getXDD01042();
	}

	/**
	* Returns the xdd01043 of this vr technical spec_xdd.
	*
	* @return the xdd01043 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01043() {
		return _vrTechnicalSpec_XDD.getXDD01043();
	}

	/**
	* Returns the xdd01044 of this vr technical spec_xdd.
	*
	* @return the xdd01044 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01044() {
		return _vrTechnicalSpec_XDD.getXDD01044();
	}

	/**
	* Returns the xdd01045 of this vr technical spec_xdd.
	*
	* @return the xdd01045 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01045() {
		return _vrTechnicalSpec_XDD.getXDD01045();
	}

	/**
	* Returns the xdd01046 of this vr technical spec_xdd.
	*
	* @return the xdd01046 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01046() {
		return _vrTechnicalSpec_XDD.getXDD01046();
	}

	/**
	* Returns the xdd01047 of this vr technical spec_xdd.
	*
	* @return the xdd01047 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01047() {
		return _vrTechnicalSpec_XDD.getXDD01047();
	}

	/**
	* Returns the xdd01049 of this vr technical spec_xdd.
	*
	* @return the xdd01049 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01049() {
		return _vrTechnicalSpec_XDD.getXDD01049();
	}

	/**
	* Returns the xdd0105 of this vr technical spec_xdd.
	*
	* @return the xdd0105 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0105() {
		return _vrTechnicalSpec_XDD.getXDD0105();
	}

	/**
	* Returns the xdd01050 of this vr technical spec_xdd.
	*
	* @return the xdd01050 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01050() {
		return _vrTechnicalSpec_XDD.getXDD01050();
	}

	/**
	* Returns the xdd01051 of this vr technical spec_xdd.
	*
	* @return the xdd01051 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01051() {
		return _vrTechnicalSpec_XDD.getXDD01051();
	}

	/**
	* Returns the xdd01052 of this vr technical spec_xdd.
	*
	* @return the xdd01052 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01052() {
		return _vrTechnicalSpec_XDD.getXDD01052();
	}

	/**
	* Returns the xdd01053 of this vr technical spec_xdd.
	*
	* @return the xdd01053 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01053() {
		return _vrTechnicalSpec_XDD.getXDD01053();
	}

	/**
	* Returns the xdd01054 of this vr technical spec_xdd.
	*
	* @return the xdd01054 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01054() {
		return _vrTechnicalSpec_XDD.getXDD01054();
	}

	/**
	* Returns the xdd01055 of this vr technical spec_xdd.
	*
	* @return the xdd01055 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01055() {
		return _vrTechnicalSpec_XDD.getXDD01055();
	}

	/**
	* Returns the xdd01056 of this vr technical spec_xdd.
	*
	* @return the xdd01056 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01056() {
		return _vrTechnicalSpec_XDD.getXDD01056();
	}

	/**
	* Returns the xdd01057 of this vr technical spec_xdd.
	*
	* @return the xdd01057 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01057() {
		return _vrTechnicalSpec_XDD.getXDD01057();
	}

	/**
	* Returns the xdd01058 of this vr technical spec_xdd.
	*
	* @return the xdd01058 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01058() {
		return _vrTechnicalSpec_XDD.getXDD01058();
	}

	/**
	* Returns the xdd01059 of this vr technical spec_xdd.
	*
	* @return the xdd01059 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01059() {
		return _vrTechnicalSpec_XDD.getXDD01059();
	}

	/**
	* Returns the xdd0106 of this vr technical spec_xdd.
	*
	* @return the xdd0106 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0106() {
		return _vrTechnicalSpec_XDD.getXDD0106();
	}

	/**
	* Returns the xdd01060 of this vr technical spec_xdd.
	*
	* @return the xdd01060 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD01060() {
		return _vrTechnicalSpec_XDD.getXDD01060();
	}

	/**
	* Returns the xdd0107 of this vr technical spec_xdd.
	*
	* @return the xdd0107 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0107() {
		return _vrTechnicalSpec_XDD.getXDD0107();
	}

	/**
	* Returns the xdd0108 of this vr technical spec_xdd.
	*
	* @return the xdd0108 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0108() {
		return _vrTechnicalSpec_XDD.getXDD0108();
	}

	/**
	* Returns the xdd0109 of this vr technical spec_xdd.
	*
	* @return the xdd0109 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0109() {
		return _vrTechnicalSpec_XDD.getXDD0109();
	}

	/**
	* Returns the xdd0110 of this vr technical spec_xdd.
	*
	* @return the xdd0110 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0110() {
		return _vrTechnicalSpec_XDD.getXDD0110();
	}

	/**
	* Returns the xdd0111 of this vr technical spec_xdd.
	*
	* @return the xdd0111 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0111() {
		return _vrTechnicalSpec_XDD.getXDD0111();
	}

	/**
	* Returns the xdd0112 of this vr technical spec_xdd.
	*
	* @return the xdd0112 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0112() {
		return _vrTechnicalSpec_XDD.getXDD0112();
	}

	/**
	* Returns the xdd0113 of this vr technical spec_xdd.
	*
	* @return the xdd0113 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0113() {
		return _vrTechnicalSpec_XDD.getXDD0113();
	}

	/**
	* Returns the xdd0114 of this vr technical spec_xdd.
	*
	* @return the xdd0114 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0114() {
		return _vrTechnicalSpec_XDD.getXDD0114();
	}

	/**
	* Returns the xdd0115 of this vr technical spec_xdd.
	*
	* @return the xdd0115 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0115() {
		return _vrTechnicalSpec_XDD.getXDD0115();
	}

	/**
	* Returns the xdd0116 of this vr technical spec_xdd.
	*
	* @return the xdd0116 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0116() {
		return _vrTechnicalSpec_XDD.getXDD0116();
	}

	/**
	* Returns the xdd0117 of this vr technical spec_xdd.
	*
	* @return the xdd0117 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0117() {
		return _vrTechnicalSpec_XDD.getXDD0117();
	}

	/**
	* Returns the xdd0118 of this vr technical spec_xdd.
	*
	* @return the xdd0118 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0118() {
		return _vrTechnicalSpec_XDD.getXDD0118();
	}

	/**
	* Returns the xdd0119 of this vr technical spec_xdd.
	*
	* @return the xdd0119 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0119() {
		return _vrTechnicalSpec_XDD.getXDD0119();
	}

	/**
	* Returns the xdd0120 of this vr technical spec_xdd.
	*
	* @return the xdd0120 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0120() {
		return _vrTechnicalSpec_XDD.getXDD0120();
	}

	/**
	* Returns the xdd0121 of this vr technical spec_xdd.
	*
	* @return the xdd0121 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0121() {
		return _vrTechnicalSpec_XDD.getXDD0121();
	}

	/**
	* Returns the xdd0122 of this vr technical spec_xdd.
	*
	* @return the xdd0122 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0122() {
		return _vrTechnicalSpec_XDD.getXDD0122();
	}

	/**
	* Returns the xdd0123 of this vr technical spec_xdd.
	*
	* @return the xdd0123 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0123() {
		return _vrTechnicalSpec_XDD.getXDD0123();
	}

	/**
	* Returns the xdd0124 of this vr technical spec_xdd.
	*
	* @return the xdd0124 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0124() {
		return _vrTechnicalSpec_XDD.getXDD0124();
	}

	/**
	* Returns the xdd0125 of this vr technical spec_xdd.
	*
	* @return the xdd0125 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0125() {
		return _vrTechnicalSpec_XDD.getXDD0125();
	}

	/**
	* Returns the xdd0126 of this vr technical spec_xdd.
	*
	* @return the xdd0126 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0126() {
		return _vrTechnicalSpec_XDD.getXDD0126();
	}

	/**
	* Returns the xdd0127 of this vr technical spec_xdd.
	*
	* @return the xdd0127 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0127() {
		return _vrTechnicalSpec_XDD.getXDD0127();
	}

	/**
	* Returns the xdd0128 of this vr technical spec_xdd.
	*
	* @return the xdd0128 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0128() {
		return _vrTechnicalSpec_XDD.getXDD0128();
	}

	/**
	* Returns the xdd0129 of this vr technical spec_xdd.
	*
	* @return the xdd0129 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0129() {
		return _vrTechnicalSpec_XDD.getXDD0129();
	}

	/**
	* Returns the xdd0130 of this vr technical spec_xdd.
	*
	* @return the xdd0130 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0130() {
		return _vrTechnicalSpec_XDD.getXDD0130();
	}

	/**
	* Returns the xdd0131 of this vr technical spec_xdd.
	*
	* @return the xdd0131 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0131() {
		return _vrTechnicalSpec_XDD.getXDD0131();
	}

	/**
	* Returns the xdd0132 of this vr technical spec_xdd.
	*
	* @return the xdd0132 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0132() {
		return _vrTechnicalSpec_XDD.getXDD0132();
	}

	/**
	* Returns the xdd0133 of this vr technical spec_xdd.
	*
	* @return the xdd0133 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0133() {
		return _vrTechnicalSpec_XDD.getXDD0133();
	}

	/**
	* Returns the xdd0134 of this vr technical spec_xdd.
	*
	* @return the xdd0134 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0134() {
		return _vrTechnicalSpec_XDD.getXDD0134();
	}

	/**
	* Returns the xdd0135 of this vr technical spec_xdd.
	*
	* @return the xdd0135 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0135() {
		return _vrTechnicalSpec_XDD.getXDD0135();
	}

	/**
	* Returns the xdd0136 of this vr technical spec_xdd.
	*
	* @return the xdd0136 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0136() {
		return _vrTechnicalSpec_XDD.getXDD0136();
	}

	/**
	* Returns the xdd0137 of this vr technical spec_xdd.
	*
	* @return the xdd0137 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0137() {
		return _vrTechnicalSpec_XDD.getXDD0137();
	}

	/**
	* Returns the xdd0138 of this vr technical spec_xdd.
	*
	* @return the xdd0138 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0138() {
		return _vrTechnicalSpec_XDD.getXDD0138();
	}

	/**
	* Returns the xdd0139 of this vr technical spec_xdd.
	*
	* @return the xdd0139 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0139() {
		return _vrTechnicalSpec_XDD.getXDD0139();
	}

	/**
	* Returns the xdd0140 of this vr technical spec_xdd.
	*
	* @return the xdd0140 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0140() {
		return _vrTechnicalSpec_XDD.getXDD0140();
	}

	/**
	* Returns the xdd0141 of this vr technical spec_xdd.
	*
	* @return the xdd0141 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0141() {
		return _vrTechnicalSpec_XDD.getXDD0141();
	}

	/**
	* Returns the xdd0142 of this vr technical spec_xdd.
	*
	* @return the xdd0142 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0142() {
		return _vrTechnicalSpec_XDD.getXDD0142();
	}

	/**
	* Returns the xdd0143 of this vr technical spec_xdd.
	*
	* @return the xdd0143 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0143() {
		return _vrTechnicalSpec_XDD.getXDD0143();
	}

	/**
	* Returns the xdd0144 of this vr technical spec_xdd.
	*
	* @return the xdd0144 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0144() {
		return _vrTechnicalSpec_XDD.getXDD0144();
	}

	/**
	* Returns the xdd0145 of this vr technical spec_xdd.
	*
	* @return the xdd0145 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0145() {
		return _vrTechnicalSpec_XDD.getXDD0145();
	}

	/**
	* Returns the xdd0146 of this vr technical spec_xdd.
	*
	* @return the xdd0146 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0146() {
		return _vrTechnicalSpec_XDD.getXDD0146();
	}

	/**
	* Returns the xdd0147 of this vr technical spec_xdd.
	*
	* @return the xdd0147 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0147() {
		return _vrTechnicalSpec_XDD.getXDD0147();
	}

	/**
	* Returns the xdd0148 of this vr technical spec_xdd.
	*
	* @return the xdd0148 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0148() {
		return _vrTechnicalSpec_XDD.getXDD0148();
	}

	/**
	* Returns the xdd0149 of this vr technical spec_xdd.
	*
	* @return the xdd0149 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0149() {
		return _vrTechnicalSpec_XDD.getXDD0149();
	}

	/**
	* Returns the xdd0150 of this vr technical spec_xdd.
	*
	* @return the xdd0150 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0150() {
		return _vrTechnicalSpec_XDD.getXDD0150();
	}

	/**
	* Returns the xdd0151 of this vr technical spec_xdd.
	*
	* @return the xdd0151 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0151() {
		return _vrTechnicalSpec_XDD.getXDD0151();
	}

	/**
	* Returns the xdd0152 of this vr technical spec_xdd.
	*
	* @return the xdd0152 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0152() {
		return _vrTechnicalSpec_XDD.getXDD0152();
	}

	/**
	* Returns the xdd0153 of this vr technical spec_xdd.
	*
	* @return the xdd0153 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0153() {
		return _vrTechnicalSpec_XDD.getXDD0153();
	}

	/**
	* Returns the xdd0154 of this vr technical spec_xdd.
	*
	* @return the xdd0154 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0154() {
		return _vrTechnicalSpec_XDD.getXDD0154();
	}

	/**
	* Returns the xdd0155 of this vr technical spec_xdd.
	*
	* @return the xdd0155 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0155() {
		return _vrTechnicalSpec_XDD.getXDD0155();
	}

	/**
	* Returns the xdd0156 of this vr technical spec_xdd.
	*
	* @return the xdd0156 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0156() {
		return _vrTechnicalSpec_XDD.getXDD0156();
	}

	/**
	* Returns the xdd0157 of this vr technical spec_xdd.
	*
	* @return the xdd0157 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0157() {
		return _vrTechnicalSpec_XDD.getXDD0157();
	}

	/**
	* Returns the xdd0158 of this vr technical spec_xdd.
	*
	* @return the xdd0158 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0158() {
		return _vrTechnicalSpec_XDD.getXDD0158();
	}

	/**
	* Returns the xdd0159 of this vr technical spec_xdd.
	*
	* @return the xdd0159 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0159() {
		return _vrTechnicalSpec_XDD.getXDD0159();
	}

	/**
	* Returns the xdd0160 of this vr technical spec_xdd.
	*
	* @return the xdd0160 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0160() {
		return _vrTechnicalSpec_XDD.getXDD0160();
	}

	/**
	* Returns the xdd0161 of this vr technical spec_xdd.
	*
	* @return the xdd0161 of this vr technical spec_xdd
	*/
	@Override
	public java.lang.String getXDD0161() {
		return _vrTechnicalSpec_XDD.getXDD0161();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XDD.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XDD.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xdd.
	*
	* @return the modify date of this vr technical spec_xdd
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XDD.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xdd.
	*
	* @return the sync date of this vr technical spec_xdd
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XDD.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xdd.
	*
	* @return the convert assemble ID of this vr technical spec_xdd
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XDD.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xdd.
	*
	* @return the dossier ID of this vr technical spec_xdd
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XDD.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xdd.
	*
	* @return the ID of this vr technical spec_xdd
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XDD.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xdd.
	*
	* @return the mt core of this vr technical spec_xdd
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XDD.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xdd.
	*
	* @return the primary key of this vr technical spec_xdd
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XDD.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xdd.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xdd
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XDD.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XDD.persist();
	}

	/**
	* Sets the bbcnclklxdd001 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD001 the bbcnclklxdd001 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD001(java.lang.String BBCNCLKLXDD001) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD001(BBCNCLKLXDD001);
	}

	/**
	* Sets the bbcnclklxdd002 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD002 the bbcnclklxdd002 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD002(java.lang.String BBCNCLKLXDD002) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD002(BBCNCLKLXDD002);
	}

	/**
	* Sets the bbcnclklxdd003 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD003 the bbcnclklxdd003 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD003(java.lang.String BBCNCLKLXDD003) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD003(BBCNCLKLXDD003);
	}

	/**
	* Sets the bbcnclklxdd004 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD004 the bbcnclklxdd004 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD004(java.lang.String BBCNCLKLXDD004) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD004(BBCNCLKLXDD004);
	}

	/**
	* Sets the bbcnclklxdd005 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD005 the bbcnclklxdd005 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD005(java.lang.String BBCNCLKLXDD005) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD005(BBCNCLKLXDD005);
	}

	/**
	* Sets the bbcnclklxdd006 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD006 the bbcnclklxdd006 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD006(java.lang.String BBCNCLKLXDD006) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD006(BBCNCLKLXDD006);
	}

	/**
	* Sets the bbcnclklxdd007 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD007 the bbcnclklxdd007 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD007(java.lang.String BBCNCLKLXDD007) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD007(BBCNCLKLXDD007);
	}

	/**
	* Sets the bbcnclklxdd008 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD008 the bbcnclklxdd008 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD008(java.lang.String BBCNCLKLXDD008) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD008(BBCNCLKLXDD008);
	}

	/**
	* Sets the bbcnclklxdd009 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD009 the bbcnclklxdd009 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD009(java.lang.String BBCNCLKLXDD009) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD009(BBCNCLKLXDD009);
	}

	/**
	* Sets the bbcnclklxdd010 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD010 the bbcnclklxdd010 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD010(java.lang.String BBCNCLKLXDD010) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD010(BBCNCLKLXDD010);
	}

	/**
	* Sets the bbcnclklxdd011 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD011 the bbcnclklxdd011 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD011(java.lang.String BBCNCLKLXDD011) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD011(BBCNCLKLXDD011);
	}

	/**
	* Sets the bbcnclklxdd012 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD012 the bbcnclklxdd012 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD012(java.lang.String BBCNCLKLXDD012) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD012(BBCNCLKLXDD012);
	}

	/**
	* Sets the bbcnclklxdd013 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD013 the bbcnclklxdd013 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD013(java.lang.String BBCNCLKLXDD013) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD013(BBCNCLKLXDD013);
	}

	/**
	* Sets the bbcnclklxdd014 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD014 the bbcnclklxdd014 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD014(java.lang.String BBCNCLKLXDD014) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD014(BBCNCLKLXDD014);
	}

	/**
	* Sets the bbcnclklxdd015 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD015 the bbcnclklxdd015 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD015(java.lang.String BBCNCLKLXDD015) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD015(BBCNCLKLXDD015);
	}

	/**
	* Sets the bbcnclklxdd016 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD016 the bbcnclklxdd016 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD016(java.lang.String BBCNCLKLXDD016) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD016(BBCNCLKLXDD016);
	}

	/**
	* Sets the bbcnclklxdd017 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD017 the bbcnclklxdd017 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD017(java.lang.String BBCNCLKLXDD017) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD017(BBCNCLKLXDD017);
	}

	/**
	* Sets the bbcnclklxdd018 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD018 the bbcnclklxdd018 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD018(java.lang.String BBCNCLKLXDD018) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD018(BBCNCLKLXDD018);
	}

	/**
	* Sets the bbcnclklxdd019 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD019 the bbcnclklxdd019 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD019(java.lang.String BBCNCLKLXDD019) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD019(BBCNCLKLXDD019);
	}

	/**
	* Sets the bbcnclklxdd020 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD020 the bbcnclklxdd020 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD020(java.lang.String BBCNCLKLXDD020) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD020(BBCNCLKLXDD020);
	}

	/**
	* Sets the bbcnclklxdd021 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD021 the bbcnclklxdd021 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD021(java.lang.String BBCNCLKLXDD021) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD021(BBCNCLKLXDD021);
	}

	/**
	* Sets the bbcnclklxdd022 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD022 the bbcnclklxdd022 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD022(java.lang.String BBCNCLKLXDD022) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD022(BBCNCLKLXDD022);
	}

	/**
	* Sets the bbcnclklxdd023 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD023 the bbcnclklxdd023 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD023(java.lang.String BBCNCLKLXDD023) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD023(BBCNCLKLXDD023);
	}

	/**
	* Sets the bbcnclklxdd024 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD024 the bbcnclklxdd024 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD024(java.lang.String BBCNCLKLXDD024) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD024(BBCNCLKLXDD024);
	}

	/**
	* Sets the bbcnclklxdd025 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD025 the bbcnclklxdd025 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD025(java.lang.String BBCNCLKLXDD025) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD025(BBCNCLKLXDD025);
	}

	/**
	* Sets the bbcnclklxdd026 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD026 the bbcnclklxdd026 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD026(java.lang.String BBCNCLKLXDD026) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD026(BBCNCLKLXDD026);
	}

	/**
	* Sets the bbcnclklxdd027 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD027 the bbcnclklxdd027 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD027(java.lang.String BBCNCLKLXDD027) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD027(BBCNCLKLXDD027);
	}

	/**
	* Sets the bbcnclklxdd028 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD028 the bbcnclklxdd028 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD028(java.lang.String BBCNCLKLXDD028) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD028(BBCNCLKLXDD028);
	}

	/**
	* Sets the bbcnclklxdd029 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD029 the bbcnclklxdd029 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD029(java.lang.String BBCNCLKLXDD029) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD029(BBCNCLKLXDD029);
	}

	/**
	* Sets the bbcnclklxdd031 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD031 the bbcnclklxdd031 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD031(java.lang.String BBCNCLKLXDD031) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD031(BBCNCLKLXDD031);
	}

	/**
	* Sets the bbcnclklxdd032 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD032 the bbcnclklxdd032 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD032(java.lang.String BBCNCLKLXDD032) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD032(BBCNCLKLXDD032);
	}

	/**
	* Sets the bbcnclklxdd033 of this vr technical spec_xdd.
	*
	* @param BBCNCLKLXDD033 the bbcnclklxdd033 of this vr technical spec_xdd
	*/
	@Override
	public void setBBCNCLKLXDD033(java.lang.String BBCNCLKLXDD033) {
		_vrTechnicalSpec_XDD.setBBCNCLKLXDD033(BBCNCLKLXDD033);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XDD.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xdd.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xdd
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XDD.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xdd.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xdd
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XDD.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xdd.
	*
	* @param dossierId the dossier ID of this vr technical spec_xdd
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XDD.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xdd.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xdd
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XDD.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xdd.
	*
	* @param dossierNo the dossier no of this vr technical spec_xdd
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XDD.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XDD.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XDD.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XDD.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xdd.
	*
	* @param id the ID of this vr technical spec_xdd
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XDD.setId(id);
	}

	/**
	* Sets the modify date of this vr technical spec_xdd.
	*
	* @param modifyDate the modify date of this vr technical spec_xdd
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XDD.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xdd.
	*
	* @param mtCore the mt core of this vr technical spec_xdd
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XDD.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XDD.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xdd.
	*
	* @param primaryKey the primary key of this vr technical spec_xdd
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XDD.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XDD.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xdd.
	*
	* @param referenceUid the reference uid of this vr technical spec_xdd
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XDD.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xdd.
	*
	* @param syncDate the sync date of this vr technical spec_xdd
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XDD.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xdd.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xdd
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XDD.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xdd0076 of this vr technical spec_xdd.
	*
	* @param XDD0076 the xdd0076 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0076(java.lang.String XDD0076) {
		_vrTechnicalSpec_XDD.setXDD0076(XDD0076);
	}

	/**
	* Sets the xdd0077 of this vr technical spec_xdd.
	*
	* @param XDD0077 the xdd0077 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0077(java.lang.String XDD0077) {
		_vrTechnicalSpec_XDD.setXDD0077(XDD0077);
	}

	/**
	* Sets the xdd0078 of this vr technical spec_xdd.
	*
	* @param XDD0078 the xdd0078 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0078(java.lang.String XDD0078) {
		_vrTechnicalSpec_XDD.setXDD0078(XDD0078);
	}

	/**
	* Sets the xdd0079 of this vr technical spec_xdd.
	*
	* @param XDD0079 the xdd0079 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0079(java.lang.String XDD0079) {
		_vrTechnicalSpec_XDD.setXDD0079(XDD0079);
	}

	/**
	* Sets the xdd0080 of this vr technical spec_xdd.
	*
	* @param XDD0080 the xdd0080 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0080(java.lang.String XDD0080) {
		_vrTechnicalSpec_XDD.setXDD0080(XDD0080);
	}

	/**
	* Sets the xdd0081 of this vr technical spec_xdd.
	*
	* @param XDD0081 the xdd0081 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0081(java.lang.String XDD0081) {
		_vrTechnicalSpec_XDD.setXDD0081(XDD0081);
	}

	/**
	* Sets the xdd0082 of this vr technical spec_xdd.
	*
	* @param XDD0082 the xdd0082 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0082(java.lang.String XDD0082) {
		_vrTechnicalSpec_XDD.setXDD0082(XDD0082);
	}

	/**
	* Sets the xdd0083 of this vr technical spec_xdd.
	*
	* @param XDD0083 the xdd0083 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0083(java.lang.String XDD0083) {
		_vrTechnicalSpec_XDD.setXDD0083(XDD0083);
	}

	/**
	* Sets the xdd0084 of this vr technical spec_xdd.
	*
	* @param XDD0084 the xdd0084 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0084(java.lang.String XDD0084) {
		_vrTechnicalSpec_XDD.setXDD0084(XDD0084);
	}

	/**
	* Sets the xdd0085 of this vr technical spec_xdd.
	*
	* @param XDD0085 the xdd0085 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0085(java.lang.String XDD0085) {
		_vrTechnicalSpec_XDD.setXDD0085(XDD0085);
	}

	/**
	* Sets the xdd0086 of this vr technical spec_xdd.
	*
	* @param XDD0086 the xdd0086 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0086(java.lang.String XDD0086) {
		_vrTechnicalSpec_XDD.setXDD0086(XDD0086);
	}

	/**
	* Sets the xdd0087 of this vr technical spec_xdd.
	*
	* @param XDD0087 the xdd0087 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0087(java.lang.String XDD0087) {
		_vrTechnicalSpec_XDD.setXDD0087(XDD0087);
	}

	/**
	* Sets the xdd0088 of this vr technical spec_xdd.
	*
	* @param XDD0088 the xdd0088 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0088(java.lang.String XDD0088) {
		_vrTechnicalSpec_XDD.setXDD0088(XDD0088);
	}

	/**
	* Sets the xdd0089 of this vr technical spec_xdd.
	*
	* @param XDD0089 the xdd0089 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0089(java.lang.String XDD0089) {
		_vrTechnicalSpec_XDD.setXDD0089(XDD0089);
	}

	/**
	* Sets the xdd0090 of this vr technical spec_xdd.
	*
	* @param XDD0090 the xdd0090 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0090(java.lang.String XDD0090) {
		_vrTechnicalSpec_XDD.setXDD0090(XDD0090);
	}

	/**
	* Sets the xdd0091 of this vr technical spec_xdd.
	*
	* @param XDD0091 the xdd0091 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0091(java.lang.String XDD0091) {
		_vrTechnicalSpec_XDD.setXDD0091(XDD0091);
	}

	/**
	* Sets the xdd0092 of this vr technical spec_xdd.
	*
	* @param XDD0092 the xdd0092 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0092(java.lang.String XDD0092) {
		_vrTechnicalSpec_XDD.setXDD0092(XDD0092);
	}

	/**
	* Sets the xdd0093 of this vr technical spec_xdd.
	*
	* @param XDD0093 the xdd0093 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0093(java.lang.String XDD0093) {
		_vrTechnicalSpec_XDD.setXDD0093(XDD0093);
	}

	/**
	* Sets the xdd0094 of this vr technical spec_xdd.
	*
	* @param XDD0094 the xdd0094 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0094(java.lang.String XDD0094) {
		_vrTechnicalSpec_XDD.setXDD0094(XDD0094);
	}

	/**
	* Sets the xdd0095 of this vr technical spec_xdd.
	*
	* @param XDD0095 the xdd0095 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0095(java.lang.String XDD0095) {
		_vrTechnicalSpec_XDD.setXDD0095(XDD0095);
	}

	/**
	* Sets the xdd0096 of this vr technical spec_xdd.
	*
	* @param XDD0096 the xdd0096 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0096(java.lang.String XDD0096) {
		_vrTechnicalSpec_XDD.setXDD0096(XDD0096);
	}

	/**
	* Sets the xdd0097 of this vr technical spec_xdd.
	*
	* @param XDD0097 the xdd0097 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0097(java.lang.String XDD0097) {
		_vrTechnicalSpec_XDD.setXDD0097(XDD0097);
	}

	/**
	* Sets the xdd0098 of this vr technical spec_xdd.
	*
	* @param XDD0098 the xdd0098 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0098(java.lang.String XDD0098) {
		_vrTechnicalSpec_XDD.setXDD0098(XDD0098);
	}

	/**
	* Sets the xdd0099 of this vr technical spec_xdd.
	*
	* @param XDD0099 the xdd0099 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0099(java.lang.String XDD0099) {
		_vrTechnicalSpec_XDD.setXDD0099(XDD0099);
	}

	/**
	* Sets the xdd0100 of this vr technical spec_xdd.
	*
	* @param XDD0100 the xdd0100 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0100(java.lang.String XDD0100) {
		_vrTechnicalSpec_XDD.setXDD0100(XDD0100);
	}

	/**
	* Sets the xdd01001 of this vr technical spec_xdd.
	*
	* @param XDD01001 the xdd01001 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01001(java.lang.String XDD01001) {
		_vrTechnicalSpec_XDD.setXDD01001(XDD01001);
	}

	/**
	* Sets the xdd01002 of this vr technical spec_xdd.
	*
	* @param XDD01002 the xdd01002 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01002(java.lang.String XDD01002) {
		_vrTechnicalSpec_XDD.setXDD01002(XDD01002);
	}

	/**
	* Sets the xdd01003 of this vr technical spec_xdd.
	*
	* @param XDD01003 the xdd01003 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01003(java.lang.String XDD01003) {
		_vrTechnicalSpec_XDD.setXDD01003(XDD01003);
	}

	/**
	* Sets the xdd01004 of this vr technical spec_xdd.
	*
	* @param XDD01004 the xdd01004 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01004(java.lang.String XDD01004) {
		_vrTechnicalSpec_XDD.setXDD01004(XDD01004);
	}

	/**
	* Sets the xdd01005 of this vr technical spec_xdd.
	*
	* @param XDD01005 the xdd01005 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01005(java.lang.String XDD01005) {
		_vrTechnicalSpec_XDD.setXDD01005(XDD01005);
	}

	/**
	* Sets the xdd01006 of this vr technical spec_xdd.
	*
	* @param XDD01006 the xdd01006 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01006(java.lang.String XDD01006) {
		_vrTechnicalSpec_XDD.setXDD01006(XDD01006);
	}

	/**
	* Sets the xdd01007 of this vr technical spec_xdd.
	*
	* @param XDD01007 the xdd01007 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01007(java.lang.String XDD01007) {
		_vrTechnicalSpec_XDD.setXDD01007(XDD01007);
	}

	/**
	* Sets the xdd01008 of this vr technical spec_xdd.
	*
	* @param XDD01008 the xdd01008 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01008(java.lang.String XDD01008) {
		_vrTechnicalSpec_XDD.setXDD01008(XDD01008);
	}

	/**
	* Sets the xdd01009 of this vr technical spec_xdd.
	*
	* @param XDD01009 the xdd01009 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01009(java.lang.String XDD01009) {
		_vrTechnicalSpec_XDD.setXDD01009(XDD01009);
	}

	/**
	* Sets the xdd0101 of this vr technical spec_xdd.
	*
	* @param XDD0101 the xdd0101 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0101(java.lang.String XDD0101) {
		_vrTechnicalSpec_XDD.setXDD0101(XDD0101);
	}

	/**
	* Sets the xdd01010 of this vr technical spec_xdd.
	*
	* @param XDD01010 the xdd01010 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01010(java.lang.String XDD01010) {
		_vrTechnicalSpec_XDD.setXDD01010(XDD01010);
	}

	/**
	* Sets the xdd01011 of this vr technical spec_xdd.
	*
	* @param XDD01011 the xdd01011 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01011(java.lang.String XDD01011) {
		_vrTechnicalSpec_XDD.setXDD01011(XDD01011);
	}

	/**
	* Sets the xdd01012 of this vr technical spec_xdd.
	*
	* @param XDD01012 the xdd01012 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01012(java.lang.String XDD01012) {
		_vrTechnicalSpec_XDD.setXDD01012(XDD01012);
	}

	/**
	* Sets the xdd01013 of this vr technical spec_xdd.
	*
	* @param XDD01013 the xdd01013 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01013(java.lang.String XDD01013) {
		_vrTechnicalSpec_XDD.setXDD01013(XDD01013);
	}

	/**
	* Sets the xdd01014 of this vr technical spec_xdd.
	*
	* @param XDD01014 the xdd01014 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01014(java.lang.String XDD01014) {
		_vrTechnicalSpec_XDD.setXDD01014(XDD01014);
	}

	/**
	* Sets the xdd01016 of this vr technical spec_xdd.
	*
	* @param XDD01016 the xdd01016 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01016(java.lang.String XDD01016) {
		_vrTechnicalSpec_XDD.setXDD01016(XDD01016);
	}

	/**
	* Sets the xdd01017 of this vr technical spec_xdd.
	*
	* @param XDD01017 the xdd01017 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01017(java.lang.String XDD01017) {
		_vrTechnicalSpec_XDD.setXDD01017(XDD01017);
	}

	/**
	* Sets the xdd01019 of this vr technical spec_xdd.
	*
	* @param XDD01019 the xdd01019 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01019(java.lang.String XDD01019) {
		_vrTechnicalSpec_XDD.setXDD01019(XDD01019);
	}

	/**
	* Sets the xdd0102 of this vr technical spec_xdd.
	*
	* @param XDD0102 the xdd0102 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0102(java.lang.String XDD0102) {
		_vrTechnicalSpec_XDD.setXDD0102(XDD0102);
	}

	/**
	* Sets the xdd01020 of this vr technical spec_xdd.
	*
	* @param XDD01020 the xdd01020 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01020(java.lang.String XDD01020) {
		_vrTechnicalSpec_XDD.setXDD01020(XDD01020);
	}

	/**
	* Sets the xdd01021 of this vr technical spec_xdd.
	*
	* @param XDD01021 the xdd01021 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01021(java.lang.String XDD01021) {
		_vrTechnicalSpec_XDD.setXDD01021(XDD01021);
	}

	/**
	* Sets the xdd01022 of this vr technical spec_xdd.
	*
	* @param XDD01022 the xdd01022 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01022(java.lang.String XDD01022) {
		_vrTechnicalSpec_XDD.setXDD01022(XDD01022);
	}

	/**
	* Sets the xdd01024 of this vr technical spec_xdd.
	*
	* @param XDD01024 the xdd01024 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01024(java.lang.String XDD01024) {
		_vrTechnicalSpec_XDD.setXDD01024(XDD01024);
	}

	/**
	* Sets the xdd01025 of this vr technical spec_xdd.
	*
	* @param XDD01025 the xdd01025 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01025(java.lang.String XDD01025) {
		_vrTechnicalSpec_XDD.setXDD01025(XDD01025);
	}

	/**
	* Sets the xdd01026 of this vr technical spec_xdd.
	*
	* @param XDD01026 the xdd01026 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01026(java.lang.String XDD01026) {
		_vrTechnicalSpec_XDD.setXDD01026(XDD01026);
	}

	/**
	* Sets the xdd01027 of this vr technical spec_xdd.
	*
	* @param XDD01027 the xdd01027 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01027(java.lang.String XDD01027) {
		_vrTechnicalSpec_XDD.setXDD01027(XDD01027);
	}

	/**
	* Sets the xdd01028 of this vr technical spec_xdd.
	*
	* @param XDD01028 the xdd01028 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01028(java.lang.String XDD01028) {
		_vrTechnicalSpec_XDD.setXDD01028(XDD01028);
	}

	/**
	* Sets the xdd0103 of this vr technical spec_xdd.
	*
	* @param XDD0103 the xdd0103 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0103(java.lang.String XDD0103) {
		_vrTechnicalSpec_XDD.setXDD0103(XDD0103);
	}

	/**
	* Sets the xdd01030 of this vr technical spec_xdd.
	*
	* @param XDD01030 the xdd01030 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01030(java.lang.String XDD01030) {
		_vrTechnicalSpec_XDD.setXDD01030(XDD01030);
	}

	/**
	* Sets the xdd01031 of this vr technical spec_xdd.
	*
	* @param XDD01031 the xdd01031 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01031(java.lang.String XDD01031) {
		_vrTechnicalSpec_XDD.setXDD01031(XDD01031);
	}

	/**
	* Sets the xdd01032 of this vr technical spec_xdd.
	*
	* @param XDD01032 the xdd01032 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01032(java.lang.String XDD01032) {
		_vrTechnicalSpec_XDD.setXDD01032(XDD01032);
	}

	/**
	* Sets the xdd01033 of this vr technical spec_xdd.
	*
	* @param XDD01033 the xdd01033 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01033(java.lang.String XDD01033) {
		_vrTechnicalSpec_XDD.setXDD01033(XDD01033);
	}

	/**
	* Sets the xdd01034 of this vr technical spec_xdd.
	*
	* @param XDD01034 the xdd01034 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01034(java.lang.String XDD01034) {
		_vrTechnicalSpec_XDD.setXDD01034(XDD01034);
	}

	/**
	* Sets the xdd01035 of this vr technical spec_xdd.
	*
	* @param XDD01035 the xdd01035 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01035(java.lang.String XDD01035) {
		_vrTechnicalSpec_XDD.setXDD01035(XDD01035);
	}

	/**
	* Sets the xdd01036 of this vr technical spec_xdd.
	*
	* @param XDD01036 the xdd01036 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01036(java.lang.String XDD01036) {
		_vrTechnicalSpec_XDD.setXDD01036(XDD01036);
	}

	/**
	* Sets the xdd01037 of this vr technical spec_xdd.
	*
	* @param XDD01037 the xdd01037 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01037(java.lang.String XDD01037) {
		_vrTechnicalSpec_XDD.setXDD01037(XDD01037);
	}

	/**
	* Sets the xdd01038 of this vr technical spec_xdd.
	*
	* @param XDD01038 the xdd01038 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01038(java.lang.String XDD01038) {
		_vrTechnicalSpec_XDD.setXDD01038(XDD01038);
	}

	/**
	* Sets the xdd01039 of this vr technical spec_xdd.
	*
	* @param XDD01039 the xdd01039 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01039(java.lang.String XDD01039) {
		_vrTechnicalSpec_XDD.setXDD01039(XDD01039);
	}

	/**
	* Sets the xdd0104 of this vr technical spec_xdd.
	*
	* @param XDD0104 the xdd0104 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0104(java.lang.String XDD0104) {
		_vrTechnicalSpec_XDD.setXDD0104(XDD0104);
	}

	/**
	* Sets the xdd01040 of this vr technical spec_xdd.
	*
	* @param XDD01040 the xdd01040 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01040(java.lang.String XDD01040) {
		_vrTechnicalSpec_XDD.setXDD01040(XDD01040);
	}

	/**
	* Sets the xdd01041 of this vr technical spec_xdd.
	*
	* @param XDD01041 the xdd01041 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01041(java.lang.String XDD01041) {
		_vrTechnicalSpec_XDD.setXDD01041(XDD01041);
	}

	/**
	* Sets the xdd01042 of this vr technical spec_xdd.
	*
	* @param XDD01042 the xdd01042 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01042(java.lang.String XDD01042) {
		_vrTechnicalSpec_XDD.setXDD01042(XDD01042);
	}

	/**
	* Sets the xdd01043 of this vr technical spec_xdd.
	*
	* @param XDD01043 the xdd01043 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01043(java.lang.String XDD01043) {
		_vrTechnicalSpec_XDD.setXDD01043(XDD01043);
	}

	/**
	* Sets the xdd01044 of this vr technical spec_xdd.
	*
	* @param XDD01044 the xdd01044 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01044(java.lang.String XDD01044) {
		_vrTechnicalSpec_XDD.setXDD01044(XDD01044);
	}

	/**
	* Sets the xdd01045 of this vr technical spec_xdd.
	*
	* @param XDD01045 the xdd01045 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01045(java.lang.String XDD01045) {
		_vrTechnicalSpec_XDD.setXDD01045(XDD01045);
	}

	/**
	* Sets the xdd01046 of this vr technical spec_xdd.
	*
	* @param XDD01046 the xdd01046 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01046(java.lang.String XDD01046) {
		_vrTechnicalSpec_XDD.setXDD01046(XDD01046);
	}

	/**
	* Sets the xdd01047 of this vr technical spec_xdd.
	*
	* @param XDD01047 the xdd01047 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01047(java.lang.String XDD01047) {
		_vrTechnicalSpec_XDD.setXDD01047(XDD01047);
	}

	/**
	* Sets the xdd01049 of this vr technical spec_xdd.
	*
	* @param XDD01049 the xdd01049 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01049(java.lang.String XDD01049) {
		_vrTechnicalSpec_XDD.setXDD01049(XDD01049);
	}

	/**
	* Sets the xdd0105 of this vr technical spec_xdd.
	*
	* @param XDD0105 the xdd0105 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0105(java.lang.String XDD0105) {
		_vrTechnicalSpec_XDD.setXDD0105(XDD0105);
	}

	/**
	* Sets the xdd01050 of this vr technical spec_xdd.
	*
	* @param XDD01050 the xdd01050 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01050(java.lang.String XDD01050) {
		_vrTechnicalSpec_XDD.setXDD01050(XDD01050);
	}

	/**
	* Sets the xdd01051 of this vr technical spec_xdd.
	*
	* @param XDD01051 the xdd01051 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01051(java.lang.String XDD01051) {
		_vrTechnicalSpec_XDD.setXDD01051(XDD01051);
	}

	/**
	* Sets the xdd01052 of this vr technical spec_xdd.
	*
	* @param XDD01052 the xdd01052 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01052(java.lang.String XDD01052) {
		_vrTechnicalSpec_XDD.setXDD01052(XDD01052);
	}

	/**
	* Sets the xdd01053 of this vr technical spec_xdd.
	*
	* @param XDD01053 the xdd01053 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01053(java.lang.String XDD01053) {
		_vrTechnicalSpec_XDD.setXDD01053(XDD01053);
	}

	/**
	* Sets the xdd01054 of this vr technical spec_xdd.
	*
	* @param XDD01054 the xdd01054 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01054(java.lang.String XDD01054) {
		_vrTechnicalSpec_XDD.setXDD01054(XDD01054);
	}

	/**
	* Sets the xdd01055 of this vr technical spec_xdd.
	*
	* @param XDD01055 the xdd01055 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01055(java.lang.String XDD01055) {
		_vrTechnicalSpec_XDD.setXDD01055(XDD01055);
	}

	/**
	* Sets the xdd01056 of this vr technical spec_xdd.
	*
	* @param XDD01056 the xdd01056 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01056(java.lang.String XDD01056) {
		_vrTechnicalSpec_XDD.setXDD01056(XDD01056);
	}

	/**
	* Sets the xdd01057 of this vr technical spec_xdd.
	*
	* @param XDD01057 the xdd01057 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01057(java.lang.String XDD01057) {
		_vrTechnicalSpec_XDD.setXDD01057(XDD01057);
	}

	/**
	* Sets the xdd01058 of this vr technical spec_xdd.
	*
	* @param XDD01058 the xdd01058 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01058(java.lang.String XDD01058) {
		_vrTechnicalSpec_XDD.setXDD01058(XDD01058);
	}

	/**
	* Sets the xdd01059 of this vr technical spec_xdd.
	*
	* @param XDD01059 the xdd01059 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01059(java.lang.String XDD01059) {
		_vrTechnicalSpec_XDD.setXDD01059(XDD01059);
	}

	/**
	* Sets the xdd0106 of this vr technical spec_xdd.
	*
	* @param XDD0106 the xdd0106 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0106(java.lang.String XDD0106) {
		_vrTechnicalSpec_XDD.setXDD0106(XDD0106);
	}

	/**
	* Sets the xdd01060 of this vr technical spec_xdd.
	*
	* @param XDD01060 the xdd01060 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD01060(java.lang.String XDD01060) {
		_vrTechnicalSpec_XDD.setXDD01060(XDD01060);
	}

	/**
	* Sets the xdd0107 of this vr technical spec_xdd.
	*
	* @param XDD0107 the xdd0107 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0107(java.lang.String XDD0107) {
		_vrTechnicalSpec_XDD.setXDD0107(XDD0107);
	}

	/**
	* Sets the xdd0108 of this vr technical spec_xdd.
	*
	* @param XDD0108 the xdd0108 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0108(java.lang.String XDD0108) {
		_vrTechnicalSpec_XDD.setXDD0108(XDD0108);
	}

	/**
	* Sets the xdd0109 of this vr technical spec_xdd.
	*
	* @param XDD0109 the xdd0109 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0109(java.lang.String XDD0109) {
		_vrTechnicalSpec_XDD.setXDD0109(XDD0109);
	}

	/**
	* Sets the xdd0110 of this vr technical spec_xdd.
	*
	* @param XDD0110 the xdd0110 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0110(java.lang.String XDD0110) {
		_vrTechnicalSpec_XDD.setXDD0110(XDD0110);
	}

	/**
	* Sets the xdd0111 of this vr technical spec_xdd.
	*
	* @param XDD0111 the xdd0111 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0111(java.lang.String XDD0111) {
		_vrTechnicalSpec_XDD.setXDD0111(XDD0111);
	}

	/**
	* Sets the xdd0112 of this vr technical spec_xdd.
	*
	* @param XDD0112 the xdd0112 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0112(java.lang.String XDD0112) {
		_vrTechnicalSpec_XDD.setXDD0112(XDD0112);
	}

	/**
	* Sets the xdd0113 of this vr technical spec_xdd.
	*
	* @param XDD0113 the xdd0113 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0113(java.lang.String XDD0113) {
		_vrTechnicalSpec_XDD.setXDD0113(XDD0113);
	}

	/**
	* Sets the xdd0114 of this vr technical spec_xdd.
	*
	* @param XDD0114 the xdd0114 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0114(java.lang.String XDD0114) {
		_vrTechnicalSpec_XDD.setXDD0114(XDD0114);
	}

	/**
	* Sets the xdd0115 of this vr technical spec_xdd.
	*
	* @param XDD0115 the xdd0115 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0115(java.lang.String XDD0115) {
		_vrTechnicalSpec_XDD.setXDD0115(XDD0115);
	}

	/**
	* Sets the xdd0116 of this vr technical spec_xdd.
	*
	* @param XDD0116 the xdd0116 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0116(java.lang.String XDD0116) {
		_vrTechnicalSpec_XDD.setXDD0116(XDD0116);
	}

	/**
	* Sets the xdd0117 of this vr technical spec_xdd.
	*
	* @param XDD0117 the xdd0117 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0117(java.lang.String XDD0117) {
		_vrTechnicalSpec_XDD.setXDD0117(XDD0117);
	}

	/**
	* Sets the xdd0118 of this vr technical spec_xdd.
	*
	* @param XDD0118 the xdd0118 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0118(java.lang.String XDD0118) {
		_vrTechnicalSpec_XDD.setXDD0118(XDD0118);
	}

	/**
	* Sets the xdd0119 of this vr technical spec_xdd.
	*
	* @param XDD0119 the xdd0119 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0119(java.lang.String XDD0119) {
		_vrTechnicalSpec_XDD.setXDD0119(XDD0119);
	}

	/**
	* Sets the xdd0120 of this vr technical spec_xdd.
	*
	* @param XDD0120 the xdd0120 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0120(java.lang.String XDD0120) {
		_vrTechnicalSpec_XDD.setXDD0120(XDD0120);
	}

	/**
	* Sets the xdd0121 of this vr technical spec_xdd.
	*
	* @param XDD0121 the xdd0121 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0121(java.lang.String XDD0121) {
		_vrTechnicalSpec_XDD.setXDD0121(XDD0121);
	}

	/**
	* Sets the xdd0122 of this vr technical spec_xdd.
	*
	* @param XDD0122 the xdd0122 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0122(java.lang.String XDD0122) {
		_vrTechnicalSpec_XDD.setXDD0122(XDD0122);
	}

	/**
	* Sets the xdd0123 of this vr technical spec_xdd.
	*
	* @param XDD0123 the xdd0123 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0123(java.lang.String XDD0123) {
		_vrTechnicalSpec_XDD.setXDD0123(XDD0123);
	}

	/**
	* Sets the xdd0124 of this vr technical spec_xdd.
	*
	* @param XDD0124 the xdd0124 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0124(java.lang.String XDD0124) {
		_vrTechnicalSpec_XDD.setXDD0124(XDD0124);
	}

	/**
	* Sets the xdd0125 of this vr technical spec_xdd.
	*
	* @param XDD0125 the xdd0125 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0125(java.lang.String XDD0125) {
		_vrTechnicalSpec_XDD.setXDD0125(XDD0125);
	}

	/**
	* Sets the xdd0126 of this vr technical spec_xdd.
	*
	* @param XDD0126 the xdd0126 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0126(java.lang.String XDD0126) {
		_vrTechnicalSpec_XDD.setXDD0126(XDD0126);
	}

	/**
	* Sets the xdd0127 of this vr technical spec_xdd.
	*
	* @param XDD0127 the xdd0127 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0127(java.lang.String XDD0127) {
		_vrTechnicalSpec_XDD.setXDD0127(XDD0127);
	}

	/**
	* Sets the xdd0128 of this vr technical spec_xdd.
	*
	* @param XDD0128 the xdd0128 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0128(java.lang.String XDD0128) {
		_vrTechnicalSpec_XDD.setXDD0128(XDD0128);
	}

	/**
	* Sets the xdd0129 of this vr technical spec_xdd.
	*
	* @param XDD0129 the xdd0129 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0129(java.lang.String XDD0129) {
		_vrTechnicalSpec_XDD.setXDD0129(XDD0129);
	}

	/**
	* Sets the xdd0130 of this vr technical spec_xdd.
	*
	* @param XDD0130 the xdd0130 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0130(java.lang.String XDD0130) {
		_vrTechnicalSpec_XDD.setXDD0130(XDD0130);
	}

	/**
	* Sets the xdd0131 of this vr technical spec_xdd.
	*
	* @param XDD0131 the xdd0131 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0131(java.lang.String XDD0131) {
		_vrTechnicalSpec_XDD.setXDD0131(XDD0131);
	}

	/**
	* Sets the xdd0132 of this vr technical spec_xdd.
	*
	* @param XDD0132 the xdd0132 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0132(java.lang.String XDD0132) {
		_vrTechnicalSpec_XDD.setXDD0132(XDD0132);
	}

	/**
	* Sets the xdd0133 of this vr technical spec_xdd.
	*
	* @param XDD0133 the xdd0133 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0133(java.lang.String XDD0133) {
		_vrTechnicalSpec_XDD.setXDD0133(XDD0133);
	}

	/**
	* Sets the xdd0134 of this vr technical spec_xdd.
	*
	* @param XDD0134 the xdd0134 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0134(java.lang.String XDD0134) {
		_vrTechnicalSpec_XDD.setXDD0134(XDD0134);
	}

	/**
	* Sets the xdd0135 of this vr technical spec_xdd.
	*
	* @param XDD0135 the xdd0135 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0135(java.lang.String XDD0135) {
		_vrTechnicalSpec_XDD.setXDD0135(XDD0135);
	}

	/**
	* Sets the xdd0136 of this vr technical spec_xdd.
	*
	* @param XDD0136 the xdd0136 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0136(java.lang.String XDD0136) {
		_vrTechnicalSpec_XDD.setXDD0136(XDD0136);
	}

	/**
	* Sets the xdd0137 of this vr technical spec_xdd.
	*
	* @param XDD0137 the xdd0137 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0137(java.lang.String XDD0137) {
		_vrTechnicalSpec_XDD.setXDD0137(XDD0137);
	}

	/**
	* Sets the xdd0138 of this vr technical spec_xdd.
	*
	* @param XDD0138 the xdd0138 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0138(java.lang.String XDD0138) {
		_vrTechnicalSpec_XDD.setXDD0138(XDD0138);
	}

	/**
	* Sets the xdd0139 of this vr technical spec_xdd.
	*
	* @param XDD0139 the xdd0139 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0139(java.lang.String XDD0139) {
		_vrTechnicalSpec_XDD.setXDD0139(XDD0139);
	}

	/**
	* Sets the xdd0140 of this vr technical spec_xdd.
	*
	* @param XDD0140 the xdd0140 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0140(java.lang.String XDD0140) {
		_vrTechnicalSpec_XDD.setXDD0140(XDD0140);
	}

	/**
	* Sets the xdd0141 of this vr technical spec_xdd.
	*
	* @param XDD0141 the xdd0141 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0141(java.lang.String XDD0141) {
		_vrTechnicalSpec_XDD.setXDD0141(XDD0141);
	}

	/**
	* Sets the xdd0142 of this vr technical spec_xdd.
	*
	* @param XDD0142 the xdd0142 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0142(java.lang.String XDD0142) {
		_vrTechnicalSpec_XDD.setXDD0142(XDD0142);
	}

	/**
	* Sets the xdd0143 of this vr technical spec_xdd.
	*
	* @param XDD0143 the xdd0143 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0143(java.lang.String XDD0143) {
		_vrTechnicalSpec_XDD.setXDD0143(XDD0143);
	}

	/**
	* Sets the xdd0144 of this vr technical spec_xdd.
	*
	* @param XDD0144 the xdd0144 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0144(java.lang.String XDD0144) {
		_vrTechnicalSpec_XDD.setXDD0144(XDD0144);
	}

	/**
	* Sets the xdd0145 of this vr technical spec_xdd.
	*
	* @param XDD0145 the xdd0145 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0145(java.lang.String XDD0145) {
		_vrTechnicalSpec_XDD.setXDD0145(XDD0145);
	}

	/**
	* Sets the xdd0146 of this vr technical spec_xdd.
	*
	* @param XDD0146 the xdd0146 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0146(java.lang.String XDD0146) {
		_vrTechnicalSpec_XDD.setXDD0146(XDD0146);
	}

	/**
	* Sets the xdd0147 of this vr technical spec_xdd.
	*
	* @param XDD0147 the xdd0147 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0147(java.lang.String XDD0147) {
		_vrTechnicalSpec_XDD.setXDD0147(XDD0147);
	}

	/**
	* Sets the xdd0148 of this vr technical spec_xdd.
	*
	* @param XDD0148 the xdd0148 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0148(java.lang.String XDD0148) {
		_vrTechnicalSpec_XDD.setXDD0148(XDD0148);
	}

	/**
	* Sets the xdd0149 of this vr technical spec_xdd.
	*
	* @param XDD0149 the xdd0149 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0149(java.lang.String XDD0149) {
		_vrTechnicalSpec_XDD.setXDD0149(XDD0149);
	}

	/**
	* Sets the xdd0150 of this vr technical spec_xdd.
	*
	* @param XDD0150 the xdd0150 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0150(java.lang.String XDD0150) {
		_vrTechnicalSpec_XDD.setXDD0150(XDD0150);
	}

	/**
	* Sets the xdd0151 of this vr technical spec_xdd.
	*
	* @param XDD0151 the xdd0151 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0151(java.lang.String XDD0151) {
		_vrTechnicalSpec_XDD.setXDD0151(XDD0151);
	}

	/**
	* Sets the xdd0152 of this vr technical spec_xdd.
	*
	* @param XDD0152 the xdd0152 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0152(java.lang.String XDD0152) {
		_vrTechnicalSpec_XDD.setXDD0152(XDD0152);
	}

	/**
	* Sets the xdd0153 of this vr technical spec_xdd.
	*
	* @param XDD0153 the xdd0153 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0153(java.lang.String XDD0153) {
		_vrTechnicalSpec_XDD.setXDD0153(XDD0153);
	}

	/**
	* Sets the xdd0154 of this vr technical spec_xdd.
	*
	* @param XDD0154 the xdd0154 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0154(java.lang.String XDD0154) {
		_vrTechnicalSpec_XDD.setXDD0154(XDD0154);
	}

	/**
	* Sets the xdd0155 of this vr technical spec_xdd.
	*
	* @param XDD0155 the xdd0155 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0155(java.lang.String XDD0155) {
		_vrTechnicalSpec_XDD.setXDD0155(XDD0155);
	}

	/**
	* Sets the xdd0156 of this vr technical spec_xdd.
	*
	* @param XDD0156 the xdd0156 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0156(java.lang.String XDD0156) {
		_vrTechnicalSpec_XDD.setXDD0156(XDD0156);
	}

	/**
	* Sets the xdd0157 of this vr technical spec_xdd.
	*
	* @param XDD0157 the xdd0157 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0157(java.lang.String XDD0157) {
		_vrTechnicalSpec_XDD.setXDD0157(XDD0157);
	}

	/**
	* Sets the xdd0158 of this vr technical spec_xdd.
	*
	* @param XDD0158 the xdd0158 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0158(java.lang.String XDD0158) {
		_vrTechnicalSpec_XDD.setXDD0158(XDD0158);
	}

	/**
	* Sets the xdd0159 of this vr technical spec_xdd.
	*
	* @param XDD0159 the xdd0159 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0159(java.lang.String XDD0159) {
		_vrTechnicalSpec_XDD.setXDD0159(XDD0159);
	}

	/**
	* Sets the xdd0160 of this vr technical spec_xdd.
	*
	* @param XDD0160 the xdd0160 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0160(java.lang.String XDD0160) {
		_vrTechnicalSpec_XDD.setXDD0160(XDD0160);
	}

	/**
	* Sets the xdd0161 of this vr technical spec_xdd.
	*
	* @param XDD0161 the xdd0161 of this vr technical spec_xdd
	*/
	@Override
	public void setXDD0161(java.lang.String XDD0161) {
		_vrTechnicalSpec_XDD.setXDD0161(XDD0161);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XDDWrapper)) {
			return false;
		}

		VRTechnicalSpec_XDDWrapper vrTechnicalSpec_XDDWrapper = (VRTechnicalSpec_XDDWrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XDD,
					vrTechnicalSpec_XDDWrapper._vrTechnicalSpec_XDD)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XDD getWrappedModel() {
		return _vrTechnicalSpec_XDD;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XDD.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XDD.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XDD.resetOriginalValues();
	}

	private final VRTechnicalSpec_XDD _vrTechnicalSpec_XDD;
}