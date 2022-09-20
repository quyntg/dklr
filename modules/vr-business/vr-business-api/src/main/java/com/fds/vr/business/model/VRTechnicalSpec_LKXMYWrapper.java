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
 * This class is a wrapper for {@link VRTechnicalSpec_LKXMY}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_LKXMY
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_LKXMYWrapper implements VRTechnicalSpec_LKXMY,
	ModelWrapper<VRTechnicalSpec_LKXMY> {
	public VRTechnicalSpec_LKXMYWrapper(
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY) {
		_vrTechnicalSpec_LKXMY = vrTechnicalSpec_LKXMY;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_LKXMY.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_LKXMY.class.getName();
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
		attributes.put("XMY01001", getXMY01001());
		attributes.put("XMY01002", getXMY01002());
		attributes.put("XMY01003", getXMY01003());
		attributes.put("XMY01004", getXMY01004());
		attributes.put("XMY01005", getXMY01005());
		attributes.put("XMY01006", getXMY01006());
		attributes.put("XMY01007", getXMY01007());
		attributes.put("XMY01008", getXMY01008());
		attributes.put("XMY01009", getXMY01009());
		attributes.put("XMY01010", getXMY01010());
		attributes.put("XMY01011", getXMY01011());
		attributes.put("XMY01012", getXMY01012());
		attributes.put("XMY01013", getXMY01013());
		attributes.put("XMY01014", getXMY01014());
		attributes.put("XMY01016", getXMY01016());
		attributes.put("XMY01017", getXMY01017());
		attributes.put("XMY01019", getXMY01019());
		attributes.put("XMY01020", getXMY01020());
		attributes.put("XMY01021", getXMY01021());
		attributes.put("XMY01022", getXMY01022());
		attributes.put("XMY01030", getXMY01030());
		attributes.put("XMY01031", getXMY01031());
		attributes.put("XMY01032", getXMY01032());
		attributes.put("XMY01033", getXMY01033());
		attributes.put("XMY01034", getXMY01034());
		attributes.put("XMY01035", getXMY01035());
		attributes.put("XMY01036", getXMY01036());
		attributes.put("XMY01037", getXMY01037());
		attributes.put("XMY01038", getXMY01038());
		attributes.put("XMY01039", getXMY01039());
		attributes.put("XMY01040", getXMY01040());
		attributes.put("XMY01041", getXMY01041());
		attributes.put("XMY01042", getXMY01042());
		attributes.put("XMY01043", getXMY01043());
		attributes.put("XMY01044", getXMY01044());
		attributes.put("XMY01045", getXMY01045());
		attributes.put("XMY01046", getXMY01046());
		attributes.put("XMY01047", getXMY01047());
		attributes.put("XMY01050", getXMY01050());
		attributes.put("XMY01051", getXMY01051());
		attributes.put("XMY01052", getXMY01052());
		attributes.put("XMY01053", getXMY01053());
		attributes.put("XMY01054", getXMY01054());
		attributes.put("XMY01055", getXMY01055());
		attributes.put("XMY01056", getXMY01056());
		attributes.put("XMY01057", getXMY01057());
		attributes.put("XMY01058", getXMY01058());
		attributes.put("XMY01059", getXMY01059());
		attributes.put("XMY01060", getXMY01060());
		attributes.put("XMY01062", getXMY01062());
		attributes.put("XMY01063", getXMY01063());
		attributes.put("XMY01064", getXMY01064());
		attributes.put("XMY01065", getXMY01065());
		attributes.put("LKXMY01050", getLKXMY01050());
		attributes.put("LKXMY01051", getLKXMY01051());
		attributes.put("LKXMY01052", getLKXMY01052());
		attributes.put("LKXMY01053", getLKXMY01053());
		attributes.put("LKXMY01026", getLKXMY01026());
		attributes.put("LKXMY0401", getLKXMY0401());
		attributes.put("LKXMY0402", getLKXMY0402());
		attributes.put("LKXMY0403", getLKXMY0403());
		attributes.put("LKXMY0404", getLKXMY0404());
		attributes.put("LKXMY0405", getLKXMY0405());
		attributes.put("LKXMY0406", getLKXMY0406());
		attributes.put("LKXMY1307", getLKXMY1307());
		attributes.put("LKXMY1308", getLKXMY1308());
		attributes.put("LKXMY1309", getLKXMY1309());
		attributes.put("LKXMY1310", getLKXMY1310());
		attributes.put("LKXMY1311", getLKXMY1311());
		attributes.put("LKXMY1312", getLKXMY1312());
		attributes.put("LKXMY1207", getLKXMY1207());
		attributes.put("LKXMY1208", getLKXMY1208());
		attributes.put("LKXMY1209", getLKXMY1209());
		attributes.put("LKXMY1210", getLKXMY1210());
		attributes.put("LKXMY1211", getLKXMY1211());
		attributes.put("LKXMY0201", getLKXMY0201());
		attributes.put("LKXMY0202", getLKXMY0202());
		attributes.put("LKXMY0203", getLKXMY0203());
		attributes.put("LKXMY0204", getLKXMY0204());
		attributes.put("LKXMY0205", getLKXMY0205());
		attributes.put("LKXMY0206", getLKXMY0206());
		attributes.put("LKXMY0207", getLKXMY0207());
		attributes.put("LKXMY0208", getLKXMY0208());
		attributes.put("LKXMY0209", getLKXMY0209());
		attributes.put("LKXMY0210", getLKXMY0210());
		attributes.put("LKXMY0211", getLKXMY0211());
		attributes.put("LKXMY0212", getLKXMY0212());
		attributes.put("LKXMY0213", getLKXMY0213());
		attributes.put("LKXMY0214", getLKXMY0214());
		attributes.put("LKXMY0215", getLKXMY0215());
		attributes.put("LKXMY0216", getLKXMY0216());
		attributes.put("LKXMY0217", getLKXMY0217());
		attributes.put("LKXMY0218", getLKXMY0218());
		attributes.put("LKXMY0219", getLKXMY0219());
		attributes.put("LKXMY0040", getLKXMY0040());
		attributes.put("LKXMY0041", getLKXMY0041());
		attributes.put("LKXMY0042", getLKXMY0042());
		attributes.put("LKXMY0043", getLKXMY0043());
		attributes.put("LKXMY0044", getLKXMY0044());
		attributes.put("LKXMY0045", getLKXMY0045());
		attributes.put("LKXMY0046", getLKXMY0046());
		attributes.put("LKXMY0048", getLKXMY0048());
		attributes.put("LKXMY0049", getLKXMY0049());
		attributes.put("LKXMY0050", getLKXMY0050());
		attributes.put("LKXMY0051", getLKXMY0051());
		attributes.put("LKXMY0052", getLKXMY0052());
		attributes.put("LKXMY0054", getLKXMY0054());
		attributes.put("LKXMY0055", getLKXMY0055());
		attributes.put("LKXMY0056", getLKXMY0056());
		attributes.put("LKXMY0057", getLKXMY0057());
		attributes.put("LKXMY0058", getLKXMY0058());
		attributes.put("LKXMY0059", getLKXMY0059());
		attributes.put("LKXMY0060", getLKXMY0060());
		attributes.put("LKXMY0061", getLKXMY0061());
		attributes.put("LKXMY0062", getLKXMY0062());
		attributes.put("LKXMY0063", getLKXMY0063());
		attributes.put("LKXMY0109", getLKXMY0109());
		attributes.put("LKXMY0110", getLKXMY0110());
		attributes.put("LKXMY0111", getLKXMY0111());
		attributes.put("LKXMY0112", getLKXMY0112());
		attributes.put("LKXMY0113", getLKXMY0113());
		attributes.put("LKXMY0114", getLKXMY0114());
		attributes.put("LKXMY0115", getLKXMY0115());
		attributes.put("LKXMY0116", getLKXMY0116());
		attributes.put("LKXMY0117", getLKXMY0117());
		attributes.put("LKXMY0118", getLKXMY0118());
		attributes.put("LKXMY0119", getLKXMY0119());
		attributes.put("LKXMY0120", getLKXMY0120());
		attributes.put("LKXMY0121", getLKXMY0121());
		attributes.put("LKXMY0122", getLKXMY0122());
		attributes.put("LKXMY0123", getLKXMY0123());
		attributes.put("LKXMY0124", getLKXMY0124());
		attributes.put("LKXMY0125", getLKXMY0125());
		attributes.put("LKXMY0126", getLKXMY0126());
		attributes.put("LKXMY0127", getLKXMY0127());
		attributes.put("LKXMY0128", getLKXMY0128());
		attributes.put("LKXMY0129", getLKXMY0129());
		attributes.put("LKXMY0130", getLKXMY0130());
		attributes.put("LKXMY0131", getLKXMY0131());
		attributes.put("LKXMY0064", getLKXMY0064());
		attributes.put("LKXMY0132", getLKXMY0132());
		attributes.put("LKXMY0133", getLKXMY0133());
		attributes.put("LKXMY0134", getLKXMY0134());
		attributes.put("LKXMY0135", getLKXMY0135());
		attributes.put("LKXMY0136", getLKXMY0136());
		attributes.put("LKXMY0137", getLKXMY0137());
		attributes.put("LKXMY0138", getLKXMY0138());
		attributes.put("LKXMY0139", getLKXMY0139());
		attributes.put("LKXMY0140", getLKXMY0140());
		attributes.put("LKXMY0066", getLKXMY0066());
		attributes.put("LKXMY0141", getLKXMY0141());
		attributes.put("LKXMY0142", getLKXMY0142());
		attributes.put("LKXMY0143", getLKXMY0143());
		attributes.put("LKXMY0144", getLKXMY0144());
		attributes.put("LKXMY0145", getLKXMY0145());
		attributes.put("LKXMY0146", getLKXMY0146());
		attributes.put("LKXMY0147", getLKXMY0147());
		attributes.put("LKXMY0148", getLKXMY0148());
		attributes.put("LKXMY0149", getLKXMY0149());
		attributes.put("LKXMY0150", getLKXMY0150());
		attributes.put("LKXMY0153", getLKXMY0153());
		attributes.put("LKXMY0154", getLKXMY0154());
		attributes.put("LKXMY0155", getLKXMY0155());
		attributes.put("LKXMY0156", getLKXMY0156());
		attributes.put("LKXMY0157", getLKXMY0157());
		attributes.put("LKXMY0158", getLKXMY0158());
		attributes.put("LKXMY0159", getLKXMY0159());
		attributes.put("LKXMY0160", getLKXMY0160());
		attributes.put("LKXMY0151", getLKXMY0151());
		attributes.put("LKXMY0161", getLKXMY0161());
		attributes.put("LKXMY0162", getLKXMY0162());
		attributes.put("LKXMY0163", getLKXMY0163());
		attributes.put("LKXMY0164", getLKXMY0164());
		attributes.put("LKXMY0165", getLKXMY0165());
		attributes.put("LKXMY0166", getLKXMY0166());
		attributes.put("LKXMY0167", getLKXMY0167());
		attributes.put("LKXMY0168", getLKXMY0168());
		attributes.put("LKXMY0169", getLKXMY0169());
		attributes.put("LKXMY0170", getLKXMY0170());
		attributes.put("LKXMY0171", getLKXMY0171());
		attributes.put("LKXMY0172", getLKXMY0172());
		attributes.put("LKXMY0173", getLKXMY0173());
		attributes.put("LKXMY0174", getLKXMY0174());
		attributes.put("LKXMY0175", getLKXMY0175());
		attributes.put("LKXMY0176", getLKXMY0176());
		attributes.put("LKXMY0177", getLKXMY0177());
		attributes.put("LKXMY0178", getLKXMY0178());
		attributes.put("LKXMY0179", getLKXMY0179());
		attributes.put("LKXMY0407", getLKXMY0407());
		attributes.put("LKXMY0408", getLKXMY0408());
		attributes.put("LKXMY0409", getLKXMY0409());
		attributes.put("LKXMY0410", getLKXMY0410());
		attributes.put("LKXMY0412", getLKXMY0412());
		attributes.put("LKXMY0413", getLKXMY0413());
		attributes.put("LKXMY0414", getLKXMY0414());
		attributes.put("LKXMY0415", getLKXMY0415());
		attributes.put("LKXMY0416", getLKXMY0416());
		attributes.put("LKXMY0417", getLKXMY0417());
		attributes.put("LKXMY0418", getLKXMY0418());
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

		String XMY01001 = (String)attributes.get("XMY01001");

		if (XMY01001 != null) {
			setXMY01001(XMY01001);
		}

		String XMY01002 = (String)attributes.get("XMY01002");

		if (XMY01002 != null) {
			setXMY01002(XMY01002);
		}

		String XMY01003 = (String)attributes.get("XMY01003");

		if (XMY01003 != null) {
			setXMY01003(XMY01003);
		}

		String XMY01004 = (String)attributes.get("XMY01004");

		if (XMY01004 != null) {
			setXMY01004(XMY01004);
		}

		String XMY01005 = (String)attributes.get("XMY01005");

		if (XMY01005 != null) {
			setXMY01005(XMY01005);
		}

		String XMY01006 = (String)attributes.get("XMY01006");

		if (XMY01006 != null) {
			setXMY01006(XMY01006);
		}

		String XMY01007 = (String)attributes.get("XMY01007");

		if (XMY01007 != null) {
			setXMY01007(XMY01007);
		}

		String XMY01008 = (String)attributes.get("XMY01008");

		if (XMY01008 != null) {
			setXMY01008(XMY01008);
		}

		String XMY01009 = (String)attributes.get("XMY01009");

		if (XMY01009 != null) {
			setXMY01009(XMY01009);
		}

		String XMY01010 = (String)attributes.get("XMY01010");

		if (XMY01010 != null) {
			setXMY01010(XMY01010);
		}

		String XMY01011 = (String)attributes.get("XMY01011");

		if (XMY01011 != null) {
			setXMY01011(XMY01011);
		}

		String XMY01012 = (String)attributes.get("XMY01012");

		if (XMY01012 != null) {
			setXMY01012(XMY01012);
		}

		String XMY01013 = (String)attributes.get("XMY01013");

		if (XMY01013 != null) {
			setXMY01013(XMY01013);
		}

		String XMY01014 = (String)attributes.get("XMY01014");

		if (XMY01014 != null) {
			setXMY01014(XMY01014);
		}

		String XMY01016 = (String)attributes.get("XMY01016");

		if (XMY01016 != null) {
			setXMY01016(XMY01016);
		}

		String XMY01017 = (String)attributes.get("XMY01017");

		if (XMY01017 != null) {
			setXMY01017(XMY01017);
		}

		String XMY01019 = (String)attributes.get("XMY01019");

		if (XMY01019 != null) {
			setXMY01019(XMY01019);
		}

		String XMY01020 = (String)attributes.get("XMY01020");

		if (XMY01020 != null) {
			setXMY01020(XMY01020);
		}

		String XMY01021 = (String)attributes.get("XMY01021");

		if (XMY01021 != null) {
			setXMY01021(XMY01021);
		}

		String XMY01022 = (String)attributes.get("XMY01022");

		if (XMY01022 != null) {
			setXMY01022(XMY01022);
		}

		String XMY01030 = (String)attributes.get("XMY01030");

		if (XMY01030 != null) {
			setXMY01030(XMY01030);
		}

		String XMY01031 = (String)attributes.get("XMY01031");

		if (XMY01031 != null) {
			setXMY01031(XMY01031);
		}

		String XMY01032 = (String)attributes.get("XMY01032");

		if (XMY01032 != null) {
			setXMY01032(XMY01032);
		}

		String XMY01033 = (String)attributes.get("XMY01033");

		if (XMY01033 != null) {
			setXMY01033(XMY01033);
		}

		String XMY01034 = (String)attributes.get("XMY01034");

		if (XMY01034 != null) {
			setXMY01034(XMY01034);
		}

		String XMY01035 = (String)attributes.get("XMY01035");

		if (XMY01035 != null) {
			setXMY01035(XMY01035);
		}

		String XMY01036 = (String)attributes.get("XMY01036");

		if (XMY01036 != null) {
			setXMY01036(XMY01036);
		}

		String XMY01037 = (String)attributes.get("XMY01037");

		if (XMY01037 != null) {
			setXMY01037(XMY01037);
		}

		String XMY01038 = (String)attributes.get("XMY01038");

		if (XMY01038 != null) {
			setXMY01038(XMY01038);
		}

		String XMY01039 = (String)attributes.get("XMY01039");

		if (XMY01039 != null) {
			setXMY01039(XMY01039);
		}

		String XMY01040 = (String)attributes.get("XMY01040");

		if (XMY01040 != null) {
			setXMY01040(XMY01040);
		}

		String XMY01041 = (String)attributes.get("XMY01041");

		if (XMY01041 != null) {
			setXMY01041(XMY01041);
		}

		String XMY01042 = (String)attributes.get("XMY01042");

		if (XMY01042 != null) {
			setXMY01042(XMY01042);
		}

		String XMY01043 = (String)attributes.get("XMY01043");

		if (XMY01043 != null) {
			setXMY01043(XMY01043);
		}

		String XMY01044 = (String)attributes.get("XMY01044");

		if (XMY01044 != null) {
			setXMY01044(XMY01044);
		}

		String XMY01045 = (String)attributes.get("XMY01045");

		if (XMY01045 != null) {
			setXMY01045(XMY01045);
		}

		String XMY01046 = (String)attributes.get("XMY01046");

		if (XMY01046 != null) {
			setXMY01046(XMY01046);
		}

		String XMY01047 = (String)attributes.get("XMY01047");

		if (XMY01047 != null) {
			setXMY01047(XMY01047);
		}

		String XMY01050 = (String)attributes.get("XMY01050");

		if (XMY01050 != null) {
			setXMY01050(XMY01050);
		}

		String XMY01051 = (String)attributes.get("XMY01051");

		if (XMY01051 != null) {
			setXMY01051(XMY01051);
		}

		String XMY01052 = (String)attributes.get("XMY01052");

		if (XMY01052 != null) {
			setXMY01052(XMY01052);
		}

		String XMY01053 = (String)attributes.get("XMY01053");

		if (XMY01053 != null) {
			setXMY01053(XMY01053);
		}

		String XMY01054 = (String)attributes.get("XMY01054");

		if (XMY01054 != null) {
			setXMY01054(XMY01054);
		}

		String XMY01055 = (String)attributes.get("XMY01055");

		if (XMY01055 != null) {
			setXMY01055(XMY01055);
		}

		String XMY01056 = (String)attributes.get("XMY01056");

		if (XMY01056 != null) {
			setXMY01056(XMY01056);
		}

		String XMY01057 = (String)attributes.get("XMY01057");

		if (XMY01057 != null) {
			setXMY01057(XMY01057);
		}

		String XMY01058 = (String)attributes.get("XMY01058");

		if (XMY01058 != null) {
			setXMY01058(XMY01058);
		}

		String XMY01059 = (String)attributes.get("XMY01059");

		if (XMY01059 != null) {
			setXMY01059(XMY01059);
		}

		String XMY01060 = (String)attributes.get("XMY01060");

		if (XMY01060 != null) {
			setXMY01060(XMY01060);
		}

		String XMY01062 = (String)attributes.get("XMY01062");

		if (XMY01062 != null) {
			setXMY01062(XMY01062);
		}

		String XMY01063 = (String)attributes.get("XMY01063");

		if (XMY01063 != null) {
			setXMY01063(XMY01063);
		}

		String XMY01064 = (String)attributes.get("XMY01064");

		if (XMY01064 != null) {
			setXMY01064(XMY01064);
		}

		String XMY01065 = (String)attributes.get("XMY01065");

		if (XMY01065 != null) {
			setXMY01065(XMY01065);
		}

		String LKXMY01050 = (String)attributes.get("LKXMY01050");

		if (LKXMY01050 != null) {
			setLKXMY01050(LKXMY01050);
		}

		String LKXMY01051 = (String)attributes.get("LKXMY01051");

		if (LKXMY01051 != null) {
			setLKXMY01051(LKXMY01051);
		}

		String LKXMY01052 = (String)attributes.get("LKXMY01052");

		if (LKXMY01052 != null) {
			setLKXMY01052(LKXMY01052);
		}

		String LKXMY01053 = (String)attributes.get("LKXMY01053");

		if (LKXMY01053 != null) {
			setLKXMY01053(LKXMY01053);
		}

		String LKXMY01026 = (String)attributes.get("LKXMY01026");

		if (LKXMY01026 != null) {
			setLKXMY01026(LKXMY01026);
		}

		String LKXMY0401 = (String)attributes.get("LKXMY0401");

		if (LKXMY0401 != null) {
			setLKXMY0401(LKXMY0401);
		}

		String LKXMY0402 = (String)attributes.get("LKXMY0402");

		if (LKXMY0402 != null) {
			setLKXMY0402(LKXMY0402);
		}

		String LKXMY0403 = (String)attributes.get("LKXMY0403");

		if (LKXMY0403 != null) {
			setLKXMY0403(LKXMY0403);
		}

		String LKXMY0404 = (String)attributes.get("LKXMY0404");

		if (LKXMY0404 != null) {
			setLKXMY0404(LKXMY0404);
		}

		String LKXMY0405 = (String)attributes.get("LKXMY0405");

		if (LKXMY0405 != null) {
			setLKXMY0405(LKXMY0405);
		}

		String LKXMY0406 = (String)attributes.get("LKXMY0406");

		if (LKXMY0406 != null) {
			setLKXMY0406(LKXMY0406);
		}

		String LKXMY1307 = (String)attributes.get("LKXMY1307");

		if (LKXMY1307 != null) {
			setLKXMY1307(LKXMY1307);
		}

		String LKXMY1308 = (String)attributes.get("LKXMY1308");

		if (LKXMY1308 != null) {
			setLKXMY1308(LKXMY1308);
		}

		String LKXMY1309 = (String)attributes.get("LKXMY1309");

		if (LKXMY1309 != null) {
			setLKXMY1309(LKXMY1309);
		}

		String LKXMY1310 = (String)attributes.get("LKXMY1310");

		if (LKXMY1310 != null) {
			setLKXMY1310(LKXMY1310);
		}

		String LKXMY1311 = (String)attributes.get("LKXMY1311");

		if (LKXMY1311 != null) {
			setLKXMY1311(LKXMY1311);
		}

		String LKXMY1312 = (String)attributes.get("LKXMY1312");

		if (LKXMY1312 != null) {
			setLKXMY1312(LKXMY1312);
		}

		String LKXMY1207 = (String)attributes.get("LKXMY1207");

		if (LKXMY1207 != null) {
			setLKXMY1207(LKXMY1207);
		}

		String LKXMY1208 = (String)attributes.get("LKXMY1208");

		if (LKXMY1208 != null) {
			setLKXMY1208(LKXMY1208);
		}

		String LKXMY1209 = (String)attributes.get("LKXMY1209");

		if (LKXMY1209 != null) {
			setLKXMY1209(LKXMY1209);
		}

		String LKXMY1210 = (String)attributes.get("LKXMY1210");

		if (LKXMY1210 != null) {
			setLKXMY1210(LKXMY1210);
		}

		String LKXMY1211 = (String)attributes.get("LKXMY1211");

		if (LKXMY1211 != null) {
			setLKXMY1211(LKXMY1211);
		}

		String LKXMY0201 = (String)attributes.get("LKXMY0201");

		if (LKXMY0201 != null) {
			setLKXMY0201(LKXMY0201);
		}

		String LKXMY0202 = (String)attributes.get("LKXMY0202");

		if (LKXMY0202 != null) {
			setLKXMY0202(LKXMY0202);
		}

		String LKXMY0203 = (String)attributes.get("LKXMY0203");

		if (LKXMY0203 != null) {
			setLKXMY0203(LKXMY0203);
		}

		String LKXMY0204 = (String)attributes.get("LKXMY0204");

		if (LKXMY0204 != null) {
			setLKXMY0204(LKXMY0204);
		}

		String LKXMY0205 = (String)attributes.get("LKXMY0205");

		if (LKXMY0205 != null) {
			setLKXMY0205(LKXMY0205);
		}

		String LKXMY0206 = (String)attributes.get("LKXMY0206");

		if (LKXMY0206 != null) {
			setLKXMY0206(LKXMY0206);
		}

		String LKXMY0207 = (String)attributes.get("LKXMY0207");

		if (LKXMY0207 != null) {
			setLKXMY0207(LKXMY0207);
		}

		String LKXMY0208 = (String)attributes.get("LKXMY0208");

		if (LKXMY0208 != null) {
			setLKXMY0208(LKXMY0208);
		}

		String LKXMY0209 = (String)attributes.get("LKXMY0209");

		if (LKXMY0209 != null) {
			setLKXMY0209(LKXMY0209);
		}

		String LKXMY0210 = (String)attributes.get("LKXMY0210");

		if (LKXMY0210 != null) {
			setLKXMY0210(LKXMY0210);
		}

		String LKXMY0211 = (String)attributes.get("LKXMY0211");

		if (LKXMY0211 != null) {
			setLKXMY0211(LKXMY0211);
		}

		String LKXMY0212 = (String)attributes.get("LKXMY0212");

		if (LKXMY0212 != null) {
			setLKXMY0212(LKXMY0212);
		}

		String LKXMY0213 = (String)attributes.get("LKXMY0213");

		if (LKXMY0213 != null) {
			setLKXMY0213(LKXMY0213);
		}

		String LKXMY0214 = (String)attributes.get("LKXMY0214");

		if (LKXMY0214 != null) {
			setLKXMY0214(LKXMY0214);
		}

		String LKXMY0215 = (String)attributes.get("LKXMY0215");

		if (LKXMY0215 != null) {
			setLKXMY0215(LKXMY0215);
		}

		String LKXMY0216 = (String)attributes.get("LKXMY0216");

		if (LKXMY0216 != null) {
			setLKXMY0216(LKXMY0216);
		}

		String LKXMY0217 = (String)attributes.get("LKXMY0217");

		if (LKXMY0217 != null) {
			setLKXMY0217(LKXMY0217);
		}

		String LKXMY0218 = (String)attributes.get("LKXMY0218");

		if (LKXMY0218 != null) {
			setLKXMY0218(LKXMY0218);
		}

		String LKXMY0219 = (String)attributes.get("LKXMY0219");

		if (LKXMY0219 != null) {
			setLKXMY0219(LKXMY0219);
		}

		String LKXMY0040 = (String)attributes.get("LKXMY0040");

		if (LKXMY0040 != null) {
			setLKXMY0040(LKXMY0040);
		}

		String LKXMY0041 = (String)attributes.get("LKXMY0041");

		if (LKXMY0041 != null) {
			setLKXMY0041(LKXMY0041);
		}

		String LKXMY0042 = (String)attributes.get("LKXMY0042");

		if (LKXMY0042 != null) {
			setLKXMY0042(LKXMY0042);
		}

		String LKXMY0043 = (String)attributes.get("LKXMY0043");

		if (LKXMY0043 != null) {
			setLKXMY0043(LKXMY0043);
		}

		String LKXMY0044 = (String)attributes.get("LKXMY0044");

		if (LKXMY0044 != null) {
			setLKXMY0044(LKXMY0044);
		}

		String LKXMY0045 = (String)attributes.get("LKXMY0045");

		if (LKXMY0045 != null) {
			setLKXMY0045(LKXMY0045);
		}

		String LKXMY0046 = (String)attributes.get("LKXMY0046");

		if (LKXMY0046 != null) {
			setLKXMY0046(LKXMY0046);
		}

		String LKXMY0048 = (String)attributes.get("LKXMY0048");

		if (LKXMY0048 != null) {
			setLKXMY0048(LKXMY0048);
		}

		String LKXMY0049 = (String)attributes.get("LKXMY0049");

		if (LKXMY0049 != null) {
			setLKXMY0049(LKXMY0049);
		}

		String LKXMY0050 = (String)attributes.get("LKXMY0050");

		if (LKXMY0050 != null) {
			setLKXMY0050(LKXMY0050);
		}

		String LKXMY0051 = (String)attributes.get("LKXMY0051");

		if (LKXMY0051 != null) {
			setLKXMY0051(LKXMY0051);
		}

		String LKXMY0052 = (String)attributes.get("LKXMY0052");

		if (LKXMY0052 != null) {
			setLKXMY0052(LKXMY0052);
		}

		String LKXMY0054 = (String)attributes.get("LKXMY0054");

		if (LKXMY0054 != null) {
			setLKXMY0054(LKXMY0054);
		}

		String LKXMY0055 = (String)attributes.get("LKXMY0055");

		if (LKXMY0055 != null) {
			setLKXMY0055(LKXMY0055);
		}

		String LKXMY0056 = (String)attributes.get("LKXMY0056");

		if (LKXMY0056 != null) {
			setLKXMY0056(LKXMY0056);
		}

		String LKXMY0057 = (String)attributes.get("LKXMY0057");

		if (LKXMY0057 != null) {
			setLKXMY0057(LKXMY0057);
		}

		String LKXMY0058 = (String)attributes.get("LKXMY0058");

		if (LKXMY0058 != null) {
			setLKXMY0058(LKXMY0058);
		}

		String LKXMY0059 = (String)attributes.get("LKXMY0059");

		if (LKXMY0059 != null) {
			setLKXMY0059(LKXMY0059);
		}

		String LKXMY0060 = (String)attributes.get("LKXMY0060");

		if (LKXMY0060 != null) {
			setLKXMY0060(LKXMY0060);
		}

		String LKXMY0061 = (String)attributes.get("LKXMY0061");

		if (LKXMY0061 != null) {
			setLKXMY0061(LKXMY0061);
		}

		String LKXMY0062 = (String)attributes.get("LKXMY0062");

		if (LKXMY0062 != null) {
			setLKXMY0062(LKXMY0062);
		}

		String LKXMY0063 = (String)attributes.get("LKXMY0063");

		if (LKXMY0063 != null) {
			setLKXMY0063(LKXMY0063);
		}

		String LKXMY0109 = (String)attributes.get("LKXMY0109");

		if (LKXMY0109 != null) {
			setLKXMY0109(LKXMY0109);
		}

		String LKXMY0110 = (String)attributes.get("LKXMY0110");

		if (LKXMY0110 != null) {
			setLKXMY0110(LKXMY0110);
		}

		String LKXMY0111 = (String)attributes.get("LKXMY0111");

		if (LKXMY0111 != null) {
			setLKXMY0111(LKXMY0111);
		}

		String LKXMY0112 = (String)attributes.get("LKXMY0112");

		if (LKXMY0112 != null) {
			setLKXMY0112(LKXMY0112);
		}

		String LKXMY0113 = (String)attributes.get("LKXMY0113");

		if (LKXMY0113 != null) {
			setLKXMY0113(LKXMY0113);
		}

		String LKXMY0114 = (String)attributes.get("LKXMY0114");

		if (LKXMY0114 != null) {
			setLKXMY0114(LKXMY0114);
		}

		String LKXMY0115 = (String)attributes.get("LKXMY0115");

		if (LKXMY0115 != null) {
			setLKXMY0115(LKXMY0115);
		}

		String LKXMY0116 = (String)attributes.get("LKXMY0116");

		if (LKXMY0116 != null) {
			setLKXMY0116(LKXMY0116);
		}

		String LKXMY0117 = (String)attributes.get("LKXMY0117");

		if (LKXMY0117 != null) {
			setLKXMY0117(LKXMY0117);
		}

		String LKXMY0118 = (String)attributes.get("LKXMY0118");

		if (LKXMY0118 != null) {
			setLKXMY0118(LKXMY0118);
		}

		String LKXMY0119 = (String)attributes.get("LKXMY0119");

		if (LKXMY0119 != null) {
			setLKXMY0119(LKXMY0119);
		}

		String LKXMY0120 = (String)attributes.get("LKXMY0120");

		if (LKXMY0120 != null) {
			setLKXMY0120(LKXMY0120);
		}

		String LKXMY0121 = (String)attributes.get("LKXMY0121");

		if (LKXMY0121 != null) {
			setLKXMY0121(LKXMY0121);
		}

		String LKXMY0122 = (String)attributes.get("LKXMY0122");

		if (LKXMY0122 != null) {
			setLKXMY0122(LKXMY0122);
		}

		String LKXMY0123 = (String)attributes.get("LKXMY0123");

		if (LKXMY0123 != null) {
			setLKXMY0123(LKXMY0123);
		}

		String LKXMY0124 = (String)attributes.get("LKXMY0124");

		if (LKXMY0124 != null) {
			setLKXMY0124(LKXMY0124);
		}

		String LKXMY0125 = (String)attributes.get("LKXMY0125");

		if (LKXMY0125 != null) {
			setLKXMY0125(LKXMY0125);
		}

		String LKXMY0126 = (String)attributes.get("LKXMY0126");

		if (LKXMY0126 != null) {
			setLKXMY0126(LKXMY0126);
		}

		String LKXMY0127 = (String)attributes.get("LKXMY0127");

		if (LKXMY0127 != null) {
			setLKXMY0127(LKXMY0127);
		}

		String LKXMY0128 = (String)attributes.get("LKXMY0128");

		if (LKXMY0128 != null) {
			setLKXMY0128(LKXMY0128);
		}

		String LKXMY0129 = (String)attributes.get("LKXMY0129");

		if (LKXMY0129 != null) {
			setLKXMY0129(LKXMY0129);
		}

		String LKXMY0130 = (String)attributes.get("LKXMY0130");

		if (LKXMY0130 != null) {
			setLKXMY0130(LKXMY0130);
		}

		String LKXMY0131 = (String)attributes.get("LKXMY0131");

		if (LKXMY0131 != null) {
			setLKXMY0131(LKXMY0131);
		}

		String LKXMY0064 = (String)attributes.get("LKXMY0064");

		if (LKXMY0064 != null) {
			setLKXMY0064(LKXMY0064);
		}

		String LKXMY0132 = (String)attributes.get("LKXMY0132");

		if (LKXMY0132 != null) {
			setLKXMY0132(LKXMY0132);
		}

		String LKXMY0133 = (String)attributes.get("LKXMY0133");

		if (LKXMY0133 != null) {
			setLKXMY0133(LKXMY0133);
		}

		String LKXMY0134 = (String)attributes.get("LKXMY0134");

		if (LKXMY0134 != null) {
			setLKXMY0134(LKXMY0134);
		}

		String LKXMY0135 = (String)attributes.get("LKXMY0135");

		if (LKXMY0135 != null) {
			setLKXMY0135(LKXMY0135);
		}

		String LKXMY0136 = (String)attributes.get("LKXMY0136");

		if (LKXMY0136 != null) {
			setLKXMY0136(LKXMY0136);
		}

		String LKXMY0137 = (String)attributes.get("LKXMY0137");

		if (LKXMY0137 != null) {
			setLKXMY0137(LKXMY0137);
		}

		String LKXMY0138 = (String)attributes.get("LKXMY0138");

		if (LKXMY0138 != null) {
			setLKXMY0138(LKXMY0138);
		}

		String LKXMY0139 = (String)attributes.get("LKXMY0139");

		if (LKXMY0139 != null) {
			setLKXMY0139(LKXMY0139);
		}

		String LKXMY0140 = (String)attributes.get("LKXMY0140");

		if (LKXMY0140 != null) {
			setLKXMY0140(LKXMY0140);
		}

		String LKXMY0066 = (String)attributes.get("LKXMY0066");

		if (LKXMY0066 != null) {
			setLKXMY0066(LKXMY0066);
		}

		String LKXMY0141 = (String)attributes.get("LKXMY0141");

		if (LKXMY0141 != null) {
			setLKXMY0141(LKXMY0141);
		}

		String LKXMY0142 = (String)attributes.get("LKXMY0142");

		if (LKXMY0142 != null) {
			setLKXMY0142(LKXMY0142);
		}

		String LKXMY0143 = (String)attributes.get("LKXMY0143");

		if (LKXMY0143 != null) {
			setLKXMY0143(LKXMY0143);
		}

		String LKXMY0144 = (String)attributes.get("LKXMY0144");

		if (LKXMY0144 != null) {
			setLKXMY0144(LKXMY0144);
		}

		String LKXMY0145 = (String)attributes.get("LKXMY0145");

		if (LKXMY0145 != null) {
			setLKXMY0145(LKXMY0145);
		}

		String LKXMY0146 = (String)attributes.get("LKXMY0146");

		if (LKXMY0146 != null) {
			setLKXMY0146(LKXMY0146);
		}

		String LKXMY0147 = (String)attributes.get("LKXMY0147");

		if (LKXMY0147 != null) {
			setLKXMY0147(LKXMY0147);
		}

		String LKXMY0148 = (String)attributes.get("LKXMY0148");

		if (LKXMY0148 != null) {
			setLKXMY0148(LKXMY0148);
		}

		String LKXMY0149 = (String)attributes.get("LKXMY0149");

		if (LKXMY0149 != null) {
			setLKXMY0149(LKXMY0149);
		}

		String LKXMY0150 = (String)attributes.get("LKXMY0150");

		if (LKXMY0150 != null) {
			setLKXMY0150(LKXMY0150);
		}

		String LKXMY0153 = (String)attributes.get("LKXMY0153");

		if (LKXMY0153 != null) {
			setLKXMY0153(LKXMY0153);
		}

		String LKXMY0154 = (String)attributes.get("LKXMY0154");

		if (LKXMY0154 != null) {
			setLKXMY0154(LKXMY0154);
		}

		String LKXMY0155 = (String)attributes.get("LKXMY0155");

		if (LKXMY0155 != null) {
			setLKXMY0155(LKXMY0155);
		}

		String LKXMY0156 = (String)attributes.get("LKXMY0156");

		if (LKXMY0156 != null) {
			setLKXMY0156(LKXMY0156);
		}

		String LKXMY0157 = (String)attributes.get("LKXMY0157");

		if (LKXMY0157 != null) {
			setLKXMY0157(LKXMY0157);
		}

		String LKXMY0158 = (String)attributes.get("LKXMY0158");

		if (LKXMY0158 != null) {
			setLKXMY0158(LKXMY0158);
		}

		String LKXMY0159 = (String)attributes.get("LKXMY0159");

		if (LKXMY0159 != null) {
			setLKXMY0159(LKXMY0159);
		}

		String LKXMY0160 = (String)attributes.get("LKXMY0160");

		if (LKXMY0160 != null) {
			setLKXMY0160(LKXMY0160);
		}

		String LKXMY0151 = (String)attributes.get("LKXMY0151");

		if (LKXMY0151 != null) {
			setLKXMY0151(LKXMY0151);
		}

		String LKXMY0161 = (String)attributes.get("LKXMY0161");

		if (LKXMY0161 != null) {
			setLKXMY0161(LKXMY0161);
		}

		String LKXMY0162 = (String)attributes.get("LKXMY0162");

		if (LKXMY0162 != null) {
			setLKXMY0162(LKXMY0162);
		}

		String LKXMY0163 = (String)attributes.get("LKXMY0163");

		if (LKXMY0163 != null) {
			setLKXMY0163(LKXMY0163);
		}

		String LKXMY0164 = (String)attributes.get("LKXMY0164");

		if (LKXMY0164 != null) {
			setLKXMY0164(LKXMY0164);
		}

		String LKXMY0165 = (String)attributes.get("LKXMY0165");

		if (LKXMY0165 != null) {
			setLKXMY0165(LKXMY0165);
		}

		String LKXMY0166 = (String)attributes.get("LKXMY0166");

		if (LKXMY0166 != null) {
			setLKXMY0166(LKXMY0166);
		}

		String LKXMY0167 = (String)attributes.get("LKXMY0167");

		if (LKXMY0167 != null) {
			setLKXMY0167(LKXMY0167);
		}

		String LKXMY0168 = (String)attributes.get("LKXMY0168");

		if (LKXMY0168 != null) {
			setLKXMY0168(LKXMY0168);
		}

		String LKXMY0169 = (String)attributes.get("LKXMY0169");

		if (LKXMY0169 != null) {
			setLKXMY0169(LKXMY0169);
		}

		String LKXMY0170 = (String)attributes.get("LKXMY0170");

		if (LKXMY0170 != null) {
			setLKXMY0170(LKXMY0170);
		}

		String LKXMY0171 = (String)attributes.get("LKXMY0171");

		if (LKXMY0171 != null) {
			setLKXMY0171(LKXMY0171);
		}

		String LKXMY0172 = (String)attributes.get("LKXMY0172");

		if (LKXMY0172 != null) {
			setLKXMY0172(LKXMY0172);
		}

		String LKXMY0173 = (String)attributes.get("LKXMY0173");

		if (LKXMY0173 != null) {
			setLKXMY0173(LKXMY0173);
		}

		String LKXMY0174 = (String)attributes.get("LKXMY0174");

		if (LKXMY0174 != null) {
			setLKXMY0174(LKXMY0174);
		}

		String LKXMY0175 = (String)attributes.get("LKXMY0175");

		if (LKXMY0175 != null) {
			setLKXMY0175(LKXMY0175);
		}

		String LKXMY0176 = (String)attributes.get("LKXMY0176");

		if (LKXMY0176 != null) {
			setLKXMY0176(LKXMY0176);
		}

		String LKXMY0177 = (String)attributes.get("LKXMY0177");

		if (LKXMY0177 != null) {
			setLKXMY0177(LKXMY0177);
		}

		String LKXMY0178 = (String)attributes.get("LKXMY0178");

		if (LKXMY0178 != null) {
			setLKXMY0178(LKXMY0178);
		}

		String LKXMY0179 = (String)attributes.get("LKXMY0179");

		if (LKXMY0179 != null) {
			setLKXMY0179(LKXMY0179);
		}

		String LKXMY0407 = (String)attributes.get("LKXMY0407");

		if (LKXMY0407 != null) {
			setLKXMY0407(LKXMY0407);
		}

		String LKXMY0408 = (String)attributes.get("LKXMY0408");

		if (LKXMY0408 != null) {
			setLKXMY0408(LKXMY0408);
		}

		String LKXMY0409 = (String)attributes.get("LKXMY0409");

		if (LKXMY0409 != null) {
			setLKXMY0409(LKXMY0409);
		}

		String LKXMY0410 = (String)attributes.get("LKXMY0410");

		if (LKXMY0410 != null) {
			setLKXMY0410(LKXMY0410);
		}

		String LKXMY0412 = (String)attributes.get("LKXMY0412");

		if (LKXMY0412 != null) {
			setLKXMY0412(LKXMY0412);
		}

		String LKXMY0413 = (String)attributes.get("LKXMY0413");

		if (LKXMY0413 != null) {
			setLKXMY0413(LKXMY0413);
		}

		String LKXMY0414 = (String)attributes.get("LKXMY0414");

		if (LKXMY0414 != null) {
			setLKXMY0414(LKXMY0414);
		}

		String LKXMY0415 = (String)attributes.get("LKXMY0415");

		if (LKXMY0415 != null) {
			setLKXMY0415(LKXMY0415);
		}

		String LKXMY0416 = (String)attributes.get("LKXMY0416");

		if (LKXMY0416 != null) {
			setLKXMY0416(LKXMY0416);
		}

		String LKXMY0417 = (String)attributes.get("LKXMY0417");

		if (LKXMY0417 != null) {
			setLKXMY0417(LKXMY0417);
		}

		String LKXMY0418 = (String)attributes.get("LKXMY0418");

		if (LKXMY0418 != null) {
			setLKXMY0418(LKXMY0418);
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
	public VRTechnicalSpec_LKXMY toEscapedModel() {
		return new VRTechnicalSpec_LKXMYWrapper(_vrTechnicalSpec_LKXMY.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_LKXMY toUnescapedModel() {
		return new VRTechnicalSpec_LKXMYWrapper(_vrTechnicalSpec_LKXMY.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_LKXMY.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_LKXMY.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_LKXMY.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_LKXMY.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_LKXMY> toCacheModel() {
		return _vrTechnicalSpec_LKXMY.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY) {
		return _vrTechnicalSpec_LKXMY.compareTo(vrTechnicalSpec_LKXMY);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_LKXMY.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_LKXMY.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_LKXMYWrapper((VRTechnicalSpec_LKXMY)_vrTechnicalSpec_LKXMY.clone());
	}

	/**
	* Returns the deliverable code of this vr technical spec_lkxmy.
	*
	* @return the deliverable code of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_LKXMY.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_lkxmy.
	*
	* @return the dossier ID ctn of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_LKXMY.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_lkxmy.
	*
	* @return the dossier no of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_LKXMY.getDossierNo();
	}

	/**
	* Returns the lkxmy0040 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0040 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0040() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0040();
	}

	/**
	* Returns the lkxmy0041 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0041 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0041() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0041();
	}

	/**
	* Returns the lkxmy0042 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0042 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0042() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0042();
	}

	/**
	* Returns the lkxmy0043 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0043 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0043() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0043();
	}

	/**
	* Returns the lkxmy0044 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0044 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0044() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0044();
	}

	/**
	* Returns the lkxmy0045 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0045 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0045() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0045();
	}

	/**
	* Returns the lkxmy0046 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0046 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0046() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0046();
	}

	/**
	* Returns the lkxmy0048 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0048 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0048() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0048();
	}

	/**
	* Returns the lkxmy0049 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0049 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0049() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0049();
	}

	/**
	* Returns the lkxmy0050 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0050 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0050() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0050();
	}

	/**
	* Returns the lkxmy0051 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0051 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0051() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0051();
	}

	/**
	* Returns the lkxmy0052 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0052 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0052() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0052();
	}

	/**
	* Returns the lkxmy0054 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0054 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0054() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0054();
	}

	/**
	* Returns the lkxmy0055 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0055 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0055() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0055();
	}

	/**
	* Returns the lkxmy0056 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0056 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0056() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0056();
	}

	/**
	* Returns the lkxmy0057 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0057 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0057() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0057();
	}

	/**
	* Returns the lkxmy0058 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0058 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0058() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0058();
	}

	/**
	* Returns the lkxmy0059 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0059 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0059() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0059();
	}

	/**
	* Returns the lkxmy0060 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0060 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0060() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0060();
	}

	/**
	* Returns the lkxmy0061 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0061 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0061() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0061();
	}

	/**
	* Returns the lkxmy0062 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0062 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0062() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0062();
	}

	/**
	* Returns the lkxmy0063 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0063 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0063() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0063();
	}

	/**
	* Returns the lkxmy0064 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0064 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0064() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0064();
	}

	/**
	* Returns the lkxmy0066 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0066 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0066() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0066();
	}

	/**
	* Returns the lkxmy01026 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy01026 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY01026() {
		return _vrTechnicalSpec_LKXMY.getLKXMY01026();
	}

	/**
	* Returns the lkxmy01050 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy01050 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY01050() {
		return _vrTechnicalSpec_LKXMY.getLKXMY01050();
	}

	/**
	* Returns the lkxmy01051 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy01051 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY01051() {
		return _vrTechnicalSpec_LKXMY.getLKXMY01051();
	}

	/**
	* Returns the lkxmy01052 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy01052 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY01052() {
		return _vrTechnicalSpec_LKXMY.getLKXMY01052();
	}

	/**
	* Returns the lkxmy01053 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy01053 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY01053() {
		return _vrTechnicalSpec_LKXMY.getLKXMY01053();
	}

	/**
	* Returns the lkxmy0109 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0109 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0109() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0109();
	}

	/**
	* Returns the lkxmy0110 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0110 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0110() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0110();
	}

	/**
	* Returns the lkxmy0111 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0111 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0111() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0111();
	}

	/**
	* Returns the lkxmy0112 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0112 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0112() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0112();
	}

	/**
	* Returns the lkxmy0113 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0113 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0113() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0113();
	}

	/**
	* Returns the lkxmy0114 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0114 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0114() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0114();
	}

	/**
	* Returns the lkxmy0115 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0115 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0115() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0115();
	}

	/**
	* Returns the lkxmy0116 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0116 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0116() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0116();
	}

	/**
	* Returns the lkxmy0117 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0117 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0117() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0117();
	}

	/**
	* Returns the lkxmy0118 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0118 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0118() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0118();
	}

	/**
	* Returns the lkxmy0119 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0119 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0119() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0119();
	}

	/**
	* Returns the lkxmy0120 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0120 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0120() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0120();
	}

	/**
	* Returns the lkxmy0121 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0121 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0121() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0121();
	}

	/**
	* Returns the lkxmy0122 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0122 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0122() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0122();
	}

	/**
	* Returns the lkxmy0123 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0123 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0123() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0123();
	}

	/**
	* Returns the lkxmy0124 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0124 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0124() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0124();
	}

	/**
	* Returns the lkxmy0125 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0125 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0125() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0125();
	}

	/**
	* Returns the lkxmy0126 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0126 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0126() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0126();
	}

	/**
	* Returns the lkxmy0127 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0127 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0127() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0127();
	}

	/**
	* Returns the lkxmy0128 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0128 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0128() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0128();
	}

	/**
	* Returns the lkxmy0129 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0129 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0129() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0129();
	}

	/**
	* Returns the lkxmy0130 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0130 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0130() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0130();
	}

	/**
	* Returns the lkxmy0131 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0131 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0131() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0131();
	}

	/**
	* Returns the lkxmy0132 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0132 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0132() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0132();
	}

	/**
	* Returns the lkxmy0133 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0133 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0133() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0133();
	}

	/**
	* Returns the lkxmy0134 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0134 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0134() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0134();
	}

	/**
	* Returns the lkxmy0135 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0135 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0135() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0135();
	}

	/**
	* Returns the lkxmy0136 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0136 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0136() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0136();
	}

	/**
	* Returns the lkxmy0137 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0137 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0137() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0137();
	}

	/**
	* Returns the lkxmy0138 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0138 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0138() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0138();
	}

	/**
	* Returns the lkxmy0139 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0139 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0139() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0139();
	}

	/**
	* Returns the lkxmy0140 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0140 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0140() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0140();
	}

	/**
	* Returns the lkxmy0141 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0141 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0141() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0141();
	}

	/**
	* Returns the lkxmy0142 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0142 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0142() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0142();
	}

	/**
	* Returns the lkxmy0143 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0143 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0143() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0143();
	}

	/**
	* Returns the lkxmy0144 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0144 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0144() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0144();
	}

	/**
	* Returns the lkxmy0145 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0145 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0145() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0145();
	}

	/**
	* Returns the lkxmy0146 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0146 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0146() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0146();
	}

	/**
	* Returns the lkxmy0147 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0147 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0147() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0147();
	}

	/**
	* Returns the lkxmy0148 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0148 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0148() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0148();
	}

	/**
	* Returns the lkxmy0149 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0149 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0149() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0149();
	}

	/**
	* Returns the lkxmy0150 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0150 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0150() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0150();
	}

	/**
	* Returns the lkxmy0151 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0151 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0151() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0151();
	}

	/**
	* Returns the lkxmy0153 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0153 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0153() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0153();
	}

	/**
	* Returns the lkxmy0154 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0154 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0154() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0154();
	}

	/**
	* Returns the lkxmy0155 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0155 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0155() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0155();
	}

	/**
	* Returns the lkxmy0156 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0156 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0156() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0156();
	}

	/**
	* Returns the lkxmy0157 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0157 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0157() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0157();
	}

	/**
	* Returns the lkxmy0158 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0158 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0158() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0158();
	}

	/**
	* Returns the lkxmy0159 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0159 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0159() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0159();
	}

	/**
	* Returns the lkxmy0160 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0160 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0160() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0160();
	}

	/**
	* Returns the lkxmy0161 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0161 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0161() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0161();
	}

	/**
	* Returns the lkxmy0162 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0162 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0162() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0162();
	}

	/**
	* Returns the lkxmy0163 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0163 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0163() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0163();
	}

	/**
	* Returns the lkxmy0164 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0164 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0164() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0164();
	}

	/**
	* Returns the lkxmy0165 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0165 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0165() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0165();
	}

	/**
	* Returns the lkxmy0166 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0166 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0166() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0166();
	}

	/**
	* Returns the lkxmy0167 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0167 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0167() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0167();
	}

	/**
	* Returns the lkxmy0168 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0168 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0168() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0168();
	}

	/**
	* Returns the lkxmy0169 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0169 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0169() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0169();
	}

	/**
	* Returns the lkxmy0170 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0170 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0170() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0170();
	}

	/**
	* Returns the lkxmy0171 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0171 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0171() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0171();
	}

	/**
	* Returns the lkxmy0172 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0172 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0172() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0172();
	}

	/**
	* Returns the lkxmy0173 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0173 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0173() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0173();
	}

	/**
	* Returns the lkxmy0174 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0174 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0174() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0174();
	}

	/**
	* Returns the lkxmy0175 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0175 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0175() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0175();
	}

	/**
	* Returns the lkxmy0176 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0176 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0176() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0176();
	}

	/**
	* Returns the lkxmy0177 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0177 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0177() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0177();
	}

	/**
	* Returns the lkxmy0178 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0178 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0178() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0178();
	}

	/**
	* Returns the lkxmy0179 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0179 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0179() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0179();
	}

	/**
	* Returns the lkxmy0201 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0201 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0201() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0201();
	}

	/**
	* Returns the lkxmy0202 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0202 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0202() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0202();
	}

	/**
	* Returns the lkxmy0203 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0203 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0203() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0203();
	}

	/**
	* Returns the lkxmy0204 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0204 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0204() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0204();
	}

	/**
	* Returns the lkxmy0205 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0205 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0205() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0205();
	}

	/**
	* Returns the lkxmy0206 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0206 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0206() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0206();
	}

	/**
	* Returns the lkxmy0207 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0207 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0207() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0207();
	}

	/**
	* Returns the lkxmy0208 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0208 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0208() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0208();
	}

	/**
	* Returns the lkxmy0209 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0209 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0209() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0209();
	}

	/**
	* Returns the lkxmy0210 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0210 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0210() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0210();
	}

	/**
	* Returns the lkxmy0211 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0211 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0211() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0211();
	}

	/**
	* Returns the lkxmy0212 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0212 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0212() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0212();
	}

	/**
	* Returns the lkxmy0213 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0213 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0213() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0213();
	}

	/**
	* Returns the lkxmy0214 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0214 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0214() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0214();
	}

	/**
	* Returns the lkxmy0215 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0215 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0215() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0215();
	}

	/**
	* Returns the lkxmy0216 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0216 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0216() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0216();
	}

	/**
	* Returns the lkxmy0217 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0217 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0217() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0217();
	}

	/**
	* Returns the lkxmy0218 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0218 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0218() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0218();
	}

	/**
	* Returns the lkxmy0219 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0219 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0219() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0219();
	}

	/**
	* Returns the lkxmy0401 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0401 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0401() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0401();
	}

	/**
	* Returns the lkxmy0402 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0402 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0402() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0402();
	}

	/**
	* Returns the lkxmy0403 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0403 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0403() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0403();
	}

	/**
	* Returns the lkxmy0404 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0404 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0404() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0404();
	}

	/**
	* Returns the lkxmy0405 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0405 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0405() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0405();
	}

	/**
	* Returns the lkxmy0406 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0406 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0406() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0406();
	}

	/**
	* Returns the lkxmy0407 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0407 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0407() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0407();
	}

	/**
	* Returns the lkxmy0408 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0408 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0408() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0408();
	}

	/**
	* Returns the lkxmy0409 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0409 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0409() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0409();
	}

	/**
	* Returns the lkxmy0410 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0410 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0410() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0410();
	}

	/**
	* Returns the lkxmy0412 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0412 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0412() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0412();
	}

	/**
	* Returns the lkxmy0413 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0413 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0413() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0413();
	}

	/**
	* Returns the lkxmy0414 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0414 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0414() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0414();
	}

	/**
	* Returns the lkxmy0415 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0415 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0415() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0415();
	}

	/**
	* Returns the lkxmy0416 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0416 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0416() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0416();
	}

	/**
	* Returns the lkxmy0417 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0417 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0417() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0417();
	}

	/**
	* Returns the lkxmy0418 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy0418 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY0418() {
		return _vrTechnicalSpec_LKXMY.getLKXMY0418();
	}

	/**
	* Returns the lkxmy1207 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy1207 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY1207() {
		return _vrTechnicalSpec_LKXMY.getLKXMY1207();
	}

	/**
	* Returns the lkxmy1208 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy1208 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY1208() {
		return _vrTechnicalSpec_LKXMY.getLKXMY1208();
	}

	/**
	* Returns the lkxmy1209 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy1209 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY1209() {
		return _vrTechnicalSpec_LKXMY.getLKXMY1209();
	}

	/**
	* Returns the lkxmy1210 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy1210 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY1210() {
		return _vrTechnicalSpec_LKXMY.getLKXMY1210();
	}

	/**
	* Returns the lkxmy1211 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy1211 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY1211() {
		return _vrTechnicalSpec_LKXMY.getLKXMY1211();
	}

	/**
	* Returns the lkxmy1307 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy1307 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY1307() {
		return _vrTechnicalSpec_LKXMY.getLKXMY1307();
	}

	/**
	* Returns the lkxmy1308 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy1308 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY1308() {
		return _vrTechnicalSpec_LKXMY.getLKXMY1308();
	}

	/**
	* Returns the lkxmy1309 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy1309 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY1309() {
		return _vrTechnicalSpec_LKXMY.getLKXMY1309();
	}

	/**
	* Returns the lkxmy1310 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy1310 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY1310() {
		return _vrTechnicalSpec_LKXMY.getLKXMY1310();
	}

	/**
	* Returns the lkxmy1311 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy1311 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY1311() {
		return _vrTechnicalSpec_LKXMY.getLKXMY1311();
	}

	/**
	* Returns the lkxmy1312 of this vr technical spec_lkxmy.
	*
	* @return the lkxmy1312 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getLKXMY1312() {
		return _vrTechnicalSpec_LKXMY.getLKXMY1312();
	}

	/**
	* Returns the reference uid of this vr technical spec_lkxmy.
	*
	* @return the reference uid of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_LKXMY.getReferenceUid();
	}

	/**
	* Returns the xmy01001 of this vr technical spec_lkxmy.
	*
	* @return the xmy01001 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01001() {
		return _vrTechnicalSpec_LKXMY.getXMY01001();
	}

	/**
	* Returns the xmy01002 of this vr technical spec_lkxmy.
	*
	* @return the xmy01002 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01002() {
		return _vrTechnicalSpec_LKXMY.getXMY01002();
	}

	/**
	* Returns the xmy01003 of this vr technical spec_lkxmy.
	*
	* @return the xmy01003 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01003() {
		return _vrTechnicalSpec_LKXMY.getXMY01003();
	}

	/**
	* Returns the xmy01004 of this vr technical spec_lkxmy.
	*
	* @return the xmy01004 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01004() {
		return _vrTechnicalSpec_LKXMY.getXMY01004();
	}

	/**
	* Returns the xmy01005 of this vr technical spec_lkxmy.
	*
	* @return the xmy01005 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01005() {
		return _vrTechnicalSpec_LKXMY.getXMY01005();
	}

	/**
	* Returns the xmy01006 of this vr technical spec_lkxmy.
	*
	* @return the xmy01006 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01006() {
		return _vrTechnicalSpec_LKXMY.getXMY01006();
	}

	/**
	* Returns the xmy01007 of this vr technical spec_lkxmy.
	*
	* @return the xmy01007 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01007() {
		return _vrTechnicalSpec_LKXMY.getXMY01007();
	}

	/**
	* Returns the xmy01008 of this vr technical spec_lkxmy.
	*
	* @return the xmy01008 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01008() {
		return _vrTechnicalSpec_LKXMY.getXMY01008();
	}

	/**
	* Returns the xmy01009 of this vr technical spec_lkxmy.
	*
	* @return the xmy01009 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01009() {
		return _vrTechnicalSpec_LKXMY.getXMY01009();
	}

	/**
	* Returns the xmy01010 of this vr technical spec_lkxmy.
	*
	* @return the xmy01010 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01010() {
		return _vrTechnicalSpec_LKXMY.getXMY01010();
	}

	/**
	* Returns the xmy01011 of this vr technical spec_lkxmy.
	*
	* @return the xmy01011 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01011() {
		return _vrTechnicalSpec_LKXMY.getXMY01011();
	}

	/**
	* Returns the xmy01012 of this vr technical spec_lkxmy.
	*
	* @return the xmy01012 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01012() {
		return _vrTechnicalSpec_LKXMY.getXMY01012();
	}

	/**
	* Returns the xmy01013 of this vr technical spec_lkxmy.
	*
	* @return the xmy01013 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01013() {
		return _vrTechnicalSpec_LKXMY.getXMY01013();
	}

	/**
	* Returns the xmy01014 of this vr technical spec_lkxmy.
	*
	* @return the xmy01014 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01014() {
		return _vrTechnicalSpec_LKXMY.getXMY01014();
	}

	/**
	* Returns the xmy01016 of this vr technical spec_lkxmy.
	*
	* @return the xmy01016 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01016() {
		return _vrTechnicalSpec_LKXMY.getXMY01016();
	}

	/**
	* Returns the xmy01017 of this vr technical spec_lkxmy.
	*
	* @return the xmy01017 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01017() {
		return _vrTechnicalSpec_LKXMY.getXMY01017();
	}

	/**
	* Returns the xmy01019 of this vr technical spec_lkxmy.
	*
	* @return the xmy01019 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01019() {
		return _vrTechnicalSpec_LKXMY.getXMY01019();
	}

	/**
	* Returns the xmy01020 of this vr technical spec_lkxmy.
	*
	* @return the xmy01020 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01020() {
		return _vrTechnicalSpec_LKXMY.getXMY01020();
	}

	/**
	* Returns the xmy01021 of this vr technical spec_lkxmy.
	*
	* @return the xmy01021 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01021() {
		return _vrTechnicalSpec_LKXMY.getXMY01021();
	}

	/**
	* Returns the xmy01022 of this vr technical spec_lkxmy.
	*
	* @return the xmy01022 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01022() {
		return _vrTechnicalSpec_LKXMY.getXMY01022();
	}

	/**
	* Returns the xmy01030 of this vr technical spec_lkxmy.
	*
	* @return the xmy01030 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01030() {
		return _vrTechnicalSpec_LKXMY.getXMY01030();
	}

	/**
	* Returns the xmy01031 of this vr technical spec_lkxmy.
	*
	* @return the xmy01031 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01031() {
		return _vrTechnicalSpec_LKXMY.getXMY01031();
	}

	/**
	* Returns the xmy01032 of this vr technical spec_lkxmy.
	*
	* @return the xmy01032 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01032() {
		return _vrTechnicalSpec_LKXMY.getXMY01032();
	}

	/**
	* Returns the xmy01033 of this vr technical spec_lkxmy.
	*
	* @return the xmy01033 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01033() {
		return _vrTechnicalSpec_LKXMY.getXMY01033();
	}

	/**
	* Returns the xmy01034 of this vr technical spec_lkxmy.
	*
	* @return the xmy01034 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01034() {
		return _vrTechnicalSpec_LKXMY.getXMY01034();
	}

	/**
	* Returns the xmy01035 of this vr technical spec_lkxmy.
	*
	* @return the xmy01035 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01035() {
		return _vrTechnicalSpec_LKXMY.getXMY01035();
	}

	/**
	* Returns the xmy01036 of this vr technical spec_lkxmy.
	*
	* @return the xmy01036 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01036() {
		return _vrTechnicalSpec_LKXMY.getXMY01036();
	}

	/**
	* Returns the xmy01037 of this vr technical spec_lkxmy.
	*
	* @return the xmy01037 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01037() {
		return _vrTechnicalSpec_LKXMY.getXMY01037();
	}

	/**
	* Returns the xmy01038 of this vr technical spec_lkxmy.
	*
	* @return the xmy01038 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01038() {
		return _vrTechnicalSpec_LKXMY.getXMY01038();
	}

	/**
	* Returns the xmy01039 of this vr technical spec_lkxmy.
	*
	* @return the xmy01039 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01039() {
		return _vrTechnicalSpec_LKXMY.getXMY01039();
	}

	/**
	* Returns the xmy01040 of this vr technical spec_lkxmy.
	*
	* @return the xmy01040 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01040() {
		return _vrTechnicalSpec_LKXMY.getXMY01040();
	}

	/**
	* Returns the xmy01041 of this vr technical spec_lkxmy.
	*
	* @return the xmy01041 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01041() {
		return _vrTechnicalSpec_LKXMY.getXMY01041();
	}

	/**
	* Returns the xmy01042 of this vr technical spec_lkxmy.
	*
	* @return the xmy01042 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01042() {
		return _vrTechnicalSpec_LKXMY.getXMY01042();
	}

	/**
	* Returns the xmy01043 of this vr technical spec_lkxmy.
	*
	* @return the xmy01043 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01043() {
		return _vrTechnicalSpec_LKXMY.getXMY01043();
	}

	/**
	* Returns the xmy01044 of this vr technical spec_lkxmy.
	*
	* @return the xmy01044 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01044() {
		return _vrTechnicalSpec_LKXMY.getXMY01044();
	}

	/**
	* Returns the xmy01045 of this vr technical spec_lkxmy.
	*
	* @return the xmy01045 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01045() {
		return _vrTechnicalSpec_LKXMY.getXMY01045();
	}

	/**
	* Returns the xmy01046 of this vr technical spec_lkxmy.
	*
	* @return the xmy01046 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01046() {
		return _vrTechnicalSpec_LKXMY.getXMY01046();
	}

	/**
	* Returns the xmy01047 of this vr technical spec_lkxmy.
	*
	* @return the xmy01047 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01047() {
		return _vrTechnicalSpec_LKXMY.getXMY01047();
	}

	/**
	* Returns the xmy01050 of this vr technical spec_lkxmy.
	*
	* @return the xmy01050 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01050() {
		return _vrTechnicalSpec_LKXMY.getXMY01050();
	}

	/**
	* Returns the xmy01051 of this vr technical spec_lkxmy.
	*
	* @return the xmy01051 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01051() {
		return _vrTechnicalSpec_LKXMY.getXMY01051();
	}

	/**
	* Returns the xmy01052 of this vr technical spec_lkxmy.
	*
	* @return the xmy01052 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01052() {
		return _vrTechnicalSpec_LKXMY.getXMY01052();
	}

	/**
	* Returns the xmy01053 of this vr technical spec_lkxmy.
	*
	* @return the xmy01053 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01053() {
		return _vrTechnicalSpec_LKXMY.getXMY01053();
	}

	/**
	* Returns the xmy01054 of this vr technical spec_lkxmy.
	*
	* @return the xmy01054 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01054() {
		return _vrTechnicalSpec_LKXMY.getXMY01054();
	}

	/**
	* Returns the xmy01055 of this vr technical spec_lkxmy.
	*
	* @return the xmy01055 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01055() {
		return _vrTechnicalSpec_LKXMY.getXMY01055();
	}

	/**
	* Returns the xmy01056 of this vr technical spec_lkxmy.
	*
	* @return the xmy01056 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01056() {
		return _vrTechnicalSpec_LKXMY.getXMY01056();
	}

	/**
	* Returns the xmy01057 of this vr technical spec_lkxmy.
	*
	* @return the xmy01057 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01057() {
		return _vrTechnicalSpec_LKXMY.getXMY01057();
	}

	/**
	* Returns the xmy01058 of this vr technical spec_lkxmy.
	*
	* @return the xmy01058 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01058() {
		return _vrTechnicalSpec_LKXMY.getXMY01058();
	}

	/**
	* Returns the xmy01059 of this vr technical spec_lkxmy.
	*
	* @return the xmy01059 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01059() {
		return _vrTechnicalSpec_LKXMY.getXMY01059();
	}

	/**
	* Returns the xmy01060 of this vr technical spec_lkxmy.
	*
	* @return the xmy01060 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01060() {
		return _vrTechnicalSpec_LKXMY.getXMY01060();
	}

	/**
	* Returns the xmy01062 of this vr technical spec_lkxmy.
	*
	* @return the xmy01062 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01062() {
		return _vrTechnicalSpec_LKXMY.getXMY01062();
	}

	/**
	* Returns the xmy01063 of this vr technical spec_lkxmy.
	*
	* @return the xmy01063 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01063() {
		return _vrTechnicalSpec_LKXMY.getXMY01063();
	}

	/**
	* Returns the xmy01064 of this vr technical spec_lkxmy.
	*
	* @return the xmy01064 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01064() {
		return _vrTechnicalSpec_LKXMY.getXMY01064();
	}

	/**
	* Returns the xmy01065 of this vr technical spec_lkxmy.
	*
	* @return the xmy01065 of this vr technical spec_lkxmy
	*/
	@Override
	public java.lang.String getXMY01065() {
		return _vrTechnicalSpec_LKXMY.getXMY01065();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_LKXMY.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_LKXMY.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_lkxmy.
	*
	* @return the modify date of this vr technical spec_lkxmy
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_LKXMY.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_lkxmy.
	*
	* @return the sync date of this vr technical spec_lkxmy
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_LKXMY.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_lkxmy.
	*
	* @return the convert assemble ID of this vr technical spec_lkxmy
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_LKXMY.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_lkxmy.
	*
	* @return the dossier ID of this vr technical spec_lkxmy
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_LKXMY.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_lkxmy.
	*
	* @return the ID of this vr technical spec_lkxmy
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_LKXMY.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_lkxmy.
	*
	* @return the mt core of this vr technical spec_lkxmy
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_LKXMY.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_lkxmy.
	*
	* @return the primary key of this vr technical spec_lkxmy
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_LKXMY.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_lkxmy.
	*
	* @return the vehicle type certificate ID of this vr technical spec_lkxmy
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_LKXMY.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_LKXMY.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_LKXMY.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_lkxmy.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_lkxmy
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_LKXMY.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_lkxmy.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_lkxmy
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_LKXMY.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_lkxmy.
	*
	* @param dossierId the dossier ID of this vr technical spec_lkxmy
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_LKXMY.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_lkxmy.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_lkxmy
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_LKXMY.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_lkxmy.
	*
	* @param dossierNo the dossier no of this vr technical spec_lkxmy
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_LKXMY.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_LKXMY.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_LKXMY.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_LKXMY.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_lkxmy.
	*
	* @param id the ID of this vr technical spec_lkxmy
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_LKXMY.setId(id);
	}

	/**
	* Sets the lkxmy0040 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0040 the lkxmy0040 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0040(java.lang.String LKXMY0040) {
		_vrTechnicalSpec_LKXMY.setLKXMY0040(LKXMY0040);
	}

	/**
	* Sets the lkxmy0041 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0041 the lkxmy0041 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0041(java.lang.String LKXMY0041) {
		_vrTechnicalSpec_LKXMY.setLKXMY0041(LKXMY0041);
	}

	/**
	* Sets the lkxmy0042 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0042 the lkxmy0042 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0042(java.lang.String LKXMY0042) {
		_vrTechnicalSpec_LKXMY.setLKXMY0042(LKXMY0042);
	}

	/**
	* Sets the lkxmy0043 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0043 the lkxmy0043 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0043(java.lang.String LKXMY0043) {
		_vrTechnicalSpec_LKXMY.setLKXMY0043(LKXMY0043);
	}

	/**
	* Sets the lkxmy0044 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0044 the lkxmy0044 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0044(java.lang.String LKXMY0044) {
		_vrTechnicalSpec_LKXMY.setLKXMY0044(LKXMY0044);
	}

	/**
	* Sets the lkxmy0045 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0045 the lkxmy0045 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0045(java.lang.String LKXMY0045) {
		_vrTechnicalSpec_LKXMY.setLKXMY0045(LKXMY0045);
	}

	/**
	* Sets the lkxmy0046 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0046 the lkxmy0046 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0046(java.lang.String LKXMY0046) {
		_vrTechnicalSpec_LKXMY.setLKXMY0046(LKXMY0046);
	}

	/**
	* Sets the lkxmy0048 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0048 the lkxmy0048 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0048(java.lang.String LKXMY0048) {
		_vrTechnicalSpec_LKXMY.setLKXMY0048(LKXMY0048);
	}

	/**
	* Sets the lkxmy0049 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0049 the lkxmy0049 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0049(java.lang.String LKXMY0049) {
		_vrTechnicalSpec_LKXMY.setLKXMY0049(LKXMY0049);
	}

	/**
	* Sets the lkxmy0050 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0050 the lkxmy0050 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0050(java.lang.String LKXMY0050) {
		_vrTechnicalSpec_LKXMY.setLKXMY0050(LKXMY0050);
	}

	/**
	* Sets the lkxmy0051 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0051 the lkxmy0051 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0051(java.lang.String LKXMY0051) {
		_vrTechnicalSpec_LKXMY.setLKXMY0051(LKXMY0051);
	}

	/**
	* Sets the lkxmy0052 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0052 the lkxmy0052 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0052(java.lang.String LKXMY0052) {
		_vrTechnicalSpec_LKXMY.setLKXMY0052(LKXMY0052);
	}

	/**
	* Sets the lkxmy0054 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0054 the lkxmy0054 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0054(java.lang.String LKXMY0054) {
		_vrTechnicalSpec_LKXMY.setLKXMY0054(LKXMY0054);
	}

	/**
	* Sets the lkxmy0055 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0055 the lkxmy0055 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0055(java.lang.String LKXMY0055) {
		_vrTechnicalSpec_LKXMY.setLKXMY0055(LKXMY0055);
	}

	/**
	* Sets the lkxmy0056 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0056 the lkxmy0056 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0056(java.lang.String LKXMY0056) {
		_vrTechnicalSpec_LKXMY.setLKXMY0056(LKXMY0056);
	}

	/**
	* Sets the lkxmy0057 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0057 the lkxmy0057 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0057(java.lang.String LKXMY0057) {
		_vrTechnicalSpec_LKXMY.setLKXMY0057(LKXMY0057);
	}

	/**
	* Sets the lkxmy0058 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0058 the lkxmy0058 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0058(java.lang.String LKXMY0058) {
		_vrTechnicalSpec_LKXMY.setLKXMY0058(LKXMY0058);
	}

	/**
	* Sets the lkxmy0059 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0059 the lkxmy0059 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0059(java.lang.String LKXMY0059) {
		_vrTechnicalSpec_LKXMY.setLKXMY0059(LKXMY0059);
	}

	/**
	* Sets the lkxmy0060 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0060 the lkxmy0060 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0060(java.lang.String LKXMY0060) {
		_vrTechnicalSpec_LKXMY.setLKXMY0060(LKXMY0060);
	}

	/**
	* Sets the lkxmy0061 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0061 the lkxmy0061 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0061(java.lang.String LKXMY0061) {
		_vrTechnicalSpec_LKXMY.setLKXMY0061(LKXMY0061);
	}

	/**
	* Sets the lkxmy0062 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0062 the lkxmy0062 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0062(java.lang.String LKXMY0062) {
		_vrTechnicalSpec_LKXMY.setLKXMY0062(LKXMY0062);
	}

	/**
	* Sets the lkxmy0063 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0063 the lkxmy0063 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0063(java.lang.String LKXMY0063) {
		_vrTechnicalSpec_LKXMY.setLKXMY0063(LKXMY0063);
	}

	/**
	* Sets the lkxmy0064 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0064 the lkxmy0064 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0064(java.lang.String LKXMY0064) {
		_vrTechnicalSpec_LKXMY.setLKXMY0064(LKXMY0064);
	}

	/**
	* Sets the lkxmy0066 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0066 the lkxmy0066 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0066(java.lang.String LKXMY0066) {
		_vrTechnicalSpec_LKXMY.setLKXMY0066(LKXMY0066);
	}

	/**
	* Sets the lkxmy01026 of this vr technical spec_lkxmy.
	*
	* @param LKXMY01026 the lkxmy01026 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY01026(java.lang.String LKXMY01026) {
		_vrTechnicalSpec_LKXMY.setLKXMY01026(LKXMY01026);
	}

	/**
	* Sets the lkxmy01050 of this vr technical spec_lkxmy.
	*
	* @param LKXMY01050 the lkxmy01050 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY01050(java.lang.String LKXMY01050) {
		_vrTechnicalSpec_LKXMY.setLKXMY01050(LKXMY01050);
	}

	/**
	* Sets the lkxmy01051 of this vr technical spec_lkxmy.
	*
	* @param LKXMY01051 the lkxmy01051 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY01051(java.lang.String LKXMY01051) {
		_vrTechnicalSpec_LKXMY.setLKXMY01051(LKXMY01051);
	}

	/**
	* Sets the lkxmy01052 of this vr technical spec_lkxmy.
	*
	* @param LKXMY01052 the lkxmy01052 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY01052(java.lang.String LKXMY01052) {
		_vrTechnicalSpec_LKXMY.setLKXMY01052(LKXMY01052);
	}

	/**
	* Sets the lkxmy01053 of this vr technical spec_lkxmy.
	*
	* @param LKXMY01053 the lkxmy01053 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY01053(java.lang.String LKXMY01053) {
		_vrTechnicalSpec_LKXMY.setLKXMY01053(LKXMY01053);
	}

	/**
	* Sets the lkxmy0109 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0109 the lkxmy0109 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0109(java.lang.String LKXMY0109) {
		_vrTechnicalSpec_LKXMY.setLKXMY0109(LKXMY0109);
	}

	/**
	* Sets the lkxmy0110 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0110 the lkxmy0110 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0110(java.lang.String LKXMY0110) {
		_vrTechnicalSpec_LKXMY.setLKXMY0110(LKXMY0110);
	}

	/**
	* Sets the lkxmy0111 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0111 the lkxmy0111 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0111(java.lang.String LKXMY0111) {
		_vrTechnicalSpec_LKXMY.setLKXMY0111(LKXMY0111);
	}

	/**
	* Sets the lkxmy0112 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0112 the lkxmy0112 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0112(java.lang.String LKXMY0112) {
		_vrTechnicalSpec_LKXMY.setLKXMY0112(LKXMY0112);
	}

	/**
	* Sets the lkxmy0113 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0113 the lkxmy0113 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0113(java.lang.String LKXMY0113) {
		_vrTechnicalSpec_LKXMY.setLKXMY0113(LKXMY0113);
	}

	/**
	* Sets the lkxmy0114 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0114 the lkxmy0114 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0114(java.lang.String LKXMY0114) {
		_vrTechnicalSpec_LKXMY.setLKXMY0114(LKXMY0114);
	}

	/**
	* Sets the lkxmy0115 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0115 the lkxmy0115 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0115(java.lang.String LKXMY0115) {
		_vrTechnicalSpec_LKXMY.setLKXMY0115(LKXMY0115);
	}

	/**
	* Sets the lkxmy0116 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0116 the lkxmy0116 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0116(java.lang.String LKXMY0116) {
		_vrTechnicalSpec_LKXMY.setLKXMY0116(LKXMY0116);
	}

	/**
	* Sets the lkxmy0117 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0117 the lkxmy0117 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0117(java.lang.String LKXMY0117) {
		_vrTechnicalSpec_LKXMY.setLKXMY0117(LKXMY0117);
	}

	/**
	* Sets the lkxmy0118 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0118 the lkxmy0118 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0118(java.lang.String LKXMY0118) {
		_vrTechnicalSpec_LKXMY.setLKXMY0118(LKXMY0118);
	}

	/**
	* Sets the lkxmy0119 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0119 the lkxmy0119 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0119(java.lang.String LKXMY0119) {
		_vrTechnicalSpec_LKXMY.setLKXMY0119(LKXMY0119);
	}

	/**
	* Sets the lkxmy0120 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0120 the lkxmy0120 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0120(java.lang.String LKXMY0120) {
		_vrTechnicalSpec_LKXMY.setLKXMY0120(LKXMY0120);
	}

	/**
	* Sets the lkxmy0121 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0121 the lkxmy0121 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0121(java.lang.String LKXMY0121) {
		_vrTechnicalSpec_LKXMY.setLKXMY0121(LKXMY0121);
	}

	/**
	* Sets the lkxmy0122 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0122 the lkxmy0122 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0122(java.lang.String LKXMY0122) {
		_vrTechnicalSpec_LKXMY.setLKXMY0122(LKXMY0122);
	}

	/**
	* Sets the lkxmy0123 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0123 the lkxmy0123 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0123(java.lang.String LKXMY0123) {
		_vrTechnicalSpec_LKXMY.setLKXMY0123(LKXMY0123);
	}

	/**
	* Sets the lkxmy0124 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0124 the lkxmy0124 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0124(java.lang.String LKXMY0124) {
		_vrTechnicalSpec_LKXMY.setLKXMY0124(LKXMY0124);
	}

	/**
	* Sets the lkxmy0125 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0125 the lkxmy0125 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0125(java.lang.String LKXMY0125) {
		_vrTechnicalSpec_LKXMY.setLKXMY0125(LKXMY0125);
	}

	/**
	* Sets the lkxmy0126 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0126 the lkxmy0126 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0126(java.lang.String LKXMY0126) {
		_vrTechnicalSpec_LKXMY.setLKXMY0126(LKXMY0126);
	}

	/**
	* Sets the lkxmy0127 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0127 the lkxmy0127 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0127(java.lang.String LKXMY0127) {
		_vrTechnicalSpec_LKXMY.setLKXMY0127(LKXMY0127);
	}

	/**
	* Sets the lkxmy0128 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0128 the lkxmy0128 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0128(java.lang.String LKXMY0128) {
		_vrTechnicalSpec_LKXMY.setLKXMY0128(LKXMY0128);
	}

	/**
	* Sets the lkxmy0129 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0129 the lkxmy0129 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0129(java.lang.String LKXMY0129) {
		_vrTechnicalSpec_LKXMY.setLKXMY0129(LKXMY0129);
	}

	/**
	* Sets the lkxmy0130 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0130 the lkxmy0130 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0130(java.lang.String LKXMY0130) {
		_vrTechnicalSpec_LKXMY.setLKXMY0130(LKXMY0130);
	}

	/**
	* Sets the lkxmy0131 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0131 the lkxmy0131 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0131(java.lang.String LKXMY0131) {
		_vrTechnicalSpec_LKXMY.setLKXMY0131(LKXMY0131);
	}

	/**
	* Sets the lkxmy0132 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0132 the lkxmy0132 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0132(java.lang.String LKXMY0132) {
		_vrTechnicalSpec_LKXMY.setLKXMY0132(LKXMY0132);
	}

	/**
	* Sets the lkxmy0133 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0133 the lkxmy0133 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0133(java.lang.String LKXMY0133) {
		_vrTechnicalSpec_LKXMY.setLKXMY0133(LKXMY0133);
	}

	/**
	* Sets the lkxmy0134 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0134 the lkxmy0134 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0134(java.lang.String LKXMY0134) {
		_vrTechnicalSpec_LKXMY.setLKXMY0134(LKXMY0134);
	}

	/**
	* Sets the lkxmy0135 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0135 the lkxmy0135 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0135(java.lang.String LKXMY0135) {
		_vrTechnicalSpec_LKXMY.setLKXMY0135(LKXMY0135);
	}

	/**
	* Sets the lkxmy0136 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0136 the lkxmy0136 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0136(java.lang.String LKXMY0136) {
		_vrTechnicalSpec_LKXMY.setLKXMY0136(LKXMY0136);
	}

	/**
	* Sets the lkxmy0137 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0137 the lkxmy0137 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0137(java.lang.String LKXMY0137) {
		_vrTechnicalSpec_LKXMY.setLKXMY0137(LKXMY0137);
	}

	/**
	* Sets the lkxmy0138 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0138 the lkxmy0138 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0138(java.lang.String LKXMY0138) {
		_vrTechnicalSpec_LKXMY.setLKXMY0138(LKXMY0138);
	}

	/**
	* Sets the lkxmy0139 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0139 the lkxmy0139 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0139(java.lang.String LKXMY0139) {
		_vrTechnicalSpec_LKXMY.setLKXMY0139(LKXMY0139);
	}

	/**
	* Sets the lkxmy0140 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0140 the lkxmy0140 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0140(java.lang.String LKXMY0140) {
		_vrTechnicalSpec_LKXMY.setLKXMY0140(LKXMY0140);
	}

	/**
	* Sets the lkxmy0141 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0141 the lkxmy0141 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0141(java.lang.String LKXMY0141) {
		_vrTechnicalSpec_LKXMY.setLKXMY0141(LKXMY0141);
	}

	/**
	* Sets the lkxmy0142 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0142 the lkxmy0142 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0142(java.lang.String LKXMY0142) {
		_vrTechnicalSpec_LKXMY.setLKXMY0142(LKXMY0142);
	}

	/**
	* Sets the lkxmy0143 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0143 the lkxmy0143 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0143(java.lang.String LKXMY0143) {
		_vrTechnicalSpec_LKXMY.setLKXMY0143(LKXMY0143);
	}

	/**
	* Sets the lkxmy0144 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0144 the lkxmy0144 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0144(java.lang.String LKXMY0144) {
		_vrTechnicalSpec_LKXMY.setLKXMY0144(LKXMY0144);
	}

	/**
	* Sets the lkxmy0145 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0145 the lkxmy0145 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0145(java.lang.String LKXMY0145) {
		_vrTechnicalSpec_LKXMY.setLKXMY0145(LKXMY0145);
	}

	/**
	* Sets the lkxmy0146 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0146 the lkxmy0146 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0146(java.lang.String LKXMY0146) {
		_vrTechnicalSpec_LKXMY.setLKXMY0146(LKXMY0146);
	}

	/**
	* Sets the lkxmy0147 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0147 the lkxmy0147 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0147(java.lang.String LKXMY0147) {
		_vrTechnicalSpec_LKXMY.setLKXMY0147(LKXMY0147);
	}

	/**
	* Sets the lkxmy0148 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0148 the lkxmy0148 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0148(java.lang.String LKXMY0148) {
		_vrTechnicalSpec_LKXMY.setLKXMY0148(LKXMY0148);
	}

	/**
	* Sets the lkxmy0149 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0149 the lkxmy0149 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0149(java.lang.String LKXMY0149) {
		_vrTechnicalSpec_LKXMY.setLKXMY0149(LKXMY0149);
	}

	/**
	* Sets the lkxmy0150 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0150 the lkxmy0150 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0150(java.lang.String LKXMY0150) {
		_vrTechnicalSpec_LKXMY.setLKXMY0150(LKXMY0150);
	}

	/**
	* Sets the lkxmy0151 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0151 the lkxmy0151 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0151(java.lang.String LKXMY0151) {
		_vrTechnicalSpec_LKXMY.setLKXMY0151(LKXMY0151);
	}

	/**
	* Sets the lkxmy0153 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0153 the lkxmy0153 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0153(java.lang.String LKXMY0153) {
		_vrTechnicalSpec_LKXMY.setLKXMY0153(LKXMY0153);
	}

	/**
	* Sets the lkxmy0154 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0154 the lkxmy0154 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0154(java.lang.String LKXMY0154) {
		_vrTechnicalSpec_LKXMY.setLKXMY0154(LKXMY0154);
	}

	/**
	* Sets the lkxmy0155 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0155 the lkxmy0155 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0155(java.lang.String LKXMY0155) {
		_vrTechnicalSpec_LKXMY.setLKXMY0155(LKXMY0155);
	}

	/**
	* Sets the lkxmy0156 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0156 the lkxmy0156 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0156(java.lang.String LKXMY0156) {
		_vrTechnicalSpec_LKXMY.setLKXMY0156(LKXMY0156);
	}

	/**
	* Sets the lkxmy0157 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0157 the lkxmy0157 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0157(java.lang.String LKXMY0157) {
		_vrTechnicalSpec_LKXMY.setLKXMY0157(LKXMY0157);
	}

	/**
	* Sets the lkxmy0158 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0158 the lkxmy0158 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0158(java.lang.String LKXMY0158) {
		_vrTechnicalSpec_LKXMY.setLKXMY0158(LKXMY0158);
	}

	/**
	* Sets the lkxmy0159 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0159 the lkxmy0159 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0159(java.lang.String LKXMY0159) {
		_vrTechnicalSpec_LKXMY.setLKXMY0159(LKXMY0159);
	}

	/**
	* Sets the lkxmy0160 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0160 the lkxmy0160 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0160(java.lang.String LKXMY0160) {
		_vrTechnicalSpec_LKXMY.setLKXMY0160(LKXMY0160);
	}

	/**
	* Sets the lkxmy0161 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0161 the lkxmy0161 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0161(java.lang.String LKXMY0161) {
		_vrTechnicalSpec_LKXMY.setLKXMY0161(LKXMY0161);
	}

	/**
	* Sets the lkxmy0162 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0162 the lkxmy0162 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0162(java.lang.String LKXMY0162) {
		_vrTechnicalSpec_LKXMY.setLKXMY0162(LKXMY0162);
	}

	/**
	* Sets the lkxmy0163 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0163 the lkxmy0163 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0163(java.lang.String LKXMY0163) {
		_vrTechnicalSpec_LKXMY.setLKXMY0163(LKXMY0163);
	}

	/**
	* Sets the lkxmy0164 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0164 the lkxmy0164 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0164(java.lang.String LKXMY0164) {
		_vrTechnicalSpec_LKXMY.setLKXMY0164(LKXMY0164);
	}

	/**
	* Sets the lkxmy0165 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0165 the lkxmy0165 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0165(java.lang.String LKXMY0165) {
		_vrTechnicalSpec_LKXMY.setLKXMY0165(LKXMY0165);
	}

	/**
	* Sets the lkxmy0166 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0166 the lkxmy0166 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0166(java.lang.String LKXMY0166) {
		_vrTechnicalSpec_LKXMY.setLKXMY0166(LKXMY0166);
	}

	/**
	* Sets the lkxmy0167 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0167 the lkxmy0167 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0167(java.lang.String LKXMY0167) {
		_vrTechnicalSpec_LKXMY.setLKXMY0167(LKXMY0167);
	}

	/**
	* Sets the lkxmy0168 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0168 the lkxmy0168 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0168(java.lang.String LKXMY0168) {
		_vrTechnicalSpec_LKXMY.setLKXMY0168(LKXMY0168);
	}

	/**
	* Sets the lkxmy0169 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0169 the lkxmy0169 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0169(java.lang.String LKXMY0169) {
		_vrTechnicalSpec_LKXMY.setLKXMY0169(LKXMY0169);
	}

	/**
	* Sets the lkxmy0170 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0170 the lkxmy0170 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0170(java.lang.String LKXMY0170) {
		_vrTechnicalSpec_LKXMY.setLKXMY0170(LKXMY0170);
	}

	/**
	* Sets the lkxmy0171 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0171 the lkxmy0171 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0171(java.lang.String LKXMY0171) {
		_vrTechnicalSpec_LKXMY.setLKXMY0171(LKXMY0171);
	}

	/**
	* Sets the lkxmy0172 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0172 the lkxmy0172 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0172(java.lang.String LKXMY0172) {
		_vrTechnicalSpec_LKXMY.setLKXMY0172(LKXMY0172);
	}

	/**
	* Sets the lkxmy0173 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0173 the lkxmy0173 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0173(java.lang.String LKXMY0173) {
		_vrTechnicalSpec_LKXMY.setLKXMY0173(LKXMY0173);
	}

	/**
	* Sets the lkxmy0174 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0174 the lkxmy0174 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0174(java.lang.String LKXMY0174) {
		_vrTechnicalSpec_LKXMY.setLKXMY0174(LKXMY0174);
	}

	/**
	* Sets the lkxmy0175 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0175 the lkxmy0175 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0175(java.lang.String LKXMY0175) {
		_vrTechnicalSpec_LKXMY.setLKXMY0175(LKXMY0175);
	}

	/**
	* Sets the lkxmy0176 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0176 the lkxmy0176 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0176(java.lang.String LKXMY0176) {
		_vrTechnicalSpec_LKXMY.setLKXMY0176(LKXMY0176);
	}

	/**
	* Sets the lkxmy0177 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0177 the lkxmy0177 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0177(java.lang.String LKXMY0177) {
		_vrTechnicalSpec_LKXMY.setLKXMY0177(LKXMY0177);
	}

	/**
	* Sets the lkxmy0178 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0178 the lkxmy0178 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0178(java.lang.String LKXMY0178) {
		_vrTechnicalSpec_LKXMY.setLKXMY0178(LKXMY0178);
	}

	/**
	* Sets the lkxmy0179 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0179 the lkxmy0179 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0179(java.lang.String LKXMY0179) {
		_vrTechnicalSpec_LKXMY.setLKXMY0179(LKXMY0179);
	}

	/**
	* Sets the lkxmy0201 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0201 the lkxmy0201 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0201(java.lang.String LKXMY0201) {
		_vrTechnicalSpec_LKXMY.setLKXMY0201(LKXMY0201);
	}

	/**
	* Sets the lkxmy0202 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0202 the lkxmy0202 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0202(java.lang.String LKXMY0202) {
		_vrTechnicalSpec_LKXMY.setLKXMY0202(LKXMY0202);
	}

	/**
	* Sets the lkxmy0203 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0203 the lkxmy0203 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0203(java.lang.String LKXMY0203) {
		_vrTechnicalSpec_LKXMY.setLKXMY0203(LKXMY0203);
	}

	/**
	* Sets the lkxmy0204 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0204 the lkxmy0204 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0204(java.lang.String LKXMY0204) {
		_vrTechnicalSpec_LKXMY.setLKXMY0204(LKXMY0204);
	}

	/**
	* Sets the lkxmy0205 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0205 the lkxmy0205 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0205(java.lang.String LKXMY0205) {
		_vrTechnicalSpec_LKXMY.setLKXMY0205(LKXMY0205);
	}

	/**
	* Sets the lkxmy0206 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0206 the lkxmy0206 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0206(java.lang.String LKXMY0206) {
		_vrTechnicalSpec_LKXMY.setLKXMY0206(LKXMY0206);
	}

	/**
	* Sets the lkxmy0207 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0207 the lkxmy0207 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0207(java.lang.String LKXMY0207) {
		_vrTechnicalSpec_LKXMY.setLKXMY0207(LKXMY0207);
	}

	/**
	* Sets the lkxmy0208 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0208 the lkxmy0208 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0208(java.lang.String LKXMY0208) {
		_vrTechnicalSpec_LKXMY.setLKXMY0208(LKXMY0208);
	}

	/**
	* Sets the lkxmy0209 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0209 the lkxmy0209 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0209(java.lang.String LKXMY0209) {
		_vrTechnicalSpec_LKXMY.setLKXMY0209(LKXMY0209);
	}

	/**
	* Sets the lkxmy0210 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0210 the lkxmy0210 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0210(java.lang.String LKXMY0210) {
		_vrTechnicalSpec_LKXMY.setLKXMY0210(LKXMY0210);
	}

	/**
	* Sets the lkxmy0211 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0211 the lkxmy0211 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0211(java.lang.String LKXMY0211) {
		_vrTechnicalSpec_LKXMY.setLKXMY0211(LKXMY0211);
	}

	/**
	* Sets the lkxmy0212 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0212 the lkxmy0212 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0212(java.lang.String LKXMY0212) {
		_vrTechnicalSpec_LKXMY.setLKXMY0212(LKXMY0212);
	}

	/**
	* Sets the lkxmy0213 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0213 the lkxmy0213 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0213(java.lang.String LKXMY0213) {
		_vrTechnicalSpec_LKXMY.setLKXMY0213(LKXMY0213);
	}

	/**
	* Sets the lkxmy0214 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0214 the lkxmy0214 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0214(java.lang.String LKXMY0214) {
		_vrTechnicalSpec_LKXMY.setLKXMY0214(LKXMY0214);
	}

	/**
	* Sets the lkxmy0215 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0215 the lkxmy0215 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0215(java.lang.String LKXMY0215) {
		_vrTechnicalSpec_LKXMY.setLKXMY0215(LKXMY0215);
	}

	/**
	* Sets the lkxmy0216 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0216 the lkxmy0216 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0216(java.lang.String LKXMY0216) {
		_vrTechnicalSpec_LKXMY.setLKXMY0216(LKXMY0216);
	}

	/**
	* Sets the lkxmy0217 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0217 the lkxmy0217 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0217(java.lang.String LKXMY0217) {
		_vrTechnicalSpec_LKXMY.setLKXMY0217(LKXMY0217);
	}

	/**
	* Sets the lkxmy0218 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0218 the lkxmy0218 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0218(java.lang.String LKXMY0218) {
		_vrTechnicalSpec_LKXMY.setLKXMY0218(LKXMY0218);
	}

	/**
	* Sets the lkxmy0219 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0219 the lkxmy0219 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0219(java.lang.String LKXMY0219) {
		_vrTechnicalSpec_LKXMY.setLKXMY0219(LKXMY0219);
	}

	/**
	* Sets the lkxmy0401 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0401 the lkxmy0401 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0401(java.lang.String LKXMY0401) {
		_vrTechnicalSpec_LKXMY.setLKXMY0401(LKXMY0401);
	}

	/**
	* Sets the lkxmy0402 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0402 the lkxmy0402 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0402(java.lang.String LKXMY0402) {
		_vrTechnicalSpec_LKXMY.setLKXMY0402(LKXMY0402);
	}

	/**
	* Sets the lkxmy0403 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0403 the lkxmy0403 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0403(java.lang.String LKXMY0403) {
		_vrTechnicalSpec_LKXMY.setLKXMY0403(LKXMY0403);
	}

	/**
	* Sets the lkxmy0404 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0404 the lkxmy0404 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0404(java.lang.String LKXMY0404) {
		_vrTechnicalSpec_LKXMY.setLKXMY0404(LKXMY0404);
	}

	/**
	* Sets the lkxmy0405 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0405 the lkxmy0405 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0405(java.lang.String LKXMY0405) {
		_vrTechnicalSpec_LKXMY.setLKXMY0405(LKXMY0405);
	}

	/**
	* Sets the lkxmy0406 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0406 the lkxmy0406 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0406(java.lang.String LKXMY0406) {
		_vrTechnicalSpec_LKXMY.setLKXMY0406(LKXMY0406);
	}

	/**
	* Sets the lkxmy0407 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0407 the lkxmy0407 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0407(java.lang.String LKXMY0407) {
		_vrTechnicalSpec_LKXMY.setLKXMY0407(LKXMY0407);
	}

	/**
	* Sets the lkxmy0408 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0408 the lkxmy0408 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0408(java.lang.String LKXMY0408) {
		_vrTechnicalSpec_LKXMY.setLKXMY0408(LKXMY0408);
	}

	/**
	* Sets the lkxmy0409 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0409 the lkxmy0409 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0409(java.lang.String LKXMY0409) {
		_vrTechnicalSpec_LKXMY.setLKXMY0409(LKXMY0409);
	}

	/**
	* Sets the lkxmy0410 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0410 the lkxmy0410 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0410(java.lang.String LKXMY0410) {
		_vrTechnicalSpec_LKXMY.setLKXMY0410(LKXMY0410);
	}

	/**
	* Sets the lkxmy0412 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0412 the lkxmy0412 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0412(java.lang.String LKXMY0412) {
		_vrTechnicalSpec_LKXMY.setLKXMY0412(LKXMY0412);
	}

	/**
	* Sets the lkxmy0413 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0413 the lkxmy0413 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0413(java.lang.String LKXMY0413) {
		_vrTechnicalSpec_LKXMY.setLKXMY0413(LKXMY0413);
	}

	/**
	* Sets the lkxmy0414 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0414 the lkxmy0414 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0414(java.lang.String LKXMY0414) {
		_vrTechnicalSpec_LKXMY.setLKXMY0414(LKXMY0414);
	}

	/**
	* Sets the lkxmy0415 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0415 the lkxmy0415 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0415(java.lang.String LKXMY0415) {
		_vrTechnicalSpec_LKXMY.setLKXMY0415(LKXMY0415);
	}

	/**
	* Sets the lkxmy0416 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0416 the lkxmy0416 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0416(java.lang.String LKXMY0416) {
		_vrTechnicalSpec_LKXMY.setLKXMY0416(LKXMY0416);
	}

	/**
	* Sets the lkxmy0417 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0417 the lkxmy0417 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0417(java.lang.String LKXMY0417) {
		_vrTechnicalSpec_LKXMY.setLKXMY0417(LKXMY0417);
	}

	/**
	* Sets the lkxmy0418 of this vr technical spec_lkxmy.
	*
	* @param LKXMY0418 the lkxmy0418 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY0418(java.lang.String LKXMY0418) {
		_vrTechnicalSpec_LKXMY.setLKXMY0418(LKXMY0418);
	}

	/**
	* Sets the lkxmy1207 of this vr technical spec_lkxmy.
	*
	* @param LKXMY1207 the lkxmy1207 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY1207(java.lang.String LKXMY1207) {
		_vrTechnicalSpec_LKXMY.setLKXMY1207(LKXMY1207);
	}

	/**
	* Sets the lkxmy1208 of this vr technical spec_lkxmy.
	*
	* @param LKXMY1208 the lkxmy1208 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY1208(java.lang.String LKXMY1208) {
		_vrTechnicalSpec_LKXMY.setLKXMY1208(LKXMY1208);
	}

	/**
	* Sets the lkxmy1209 of this vr technical spec_lkxmy.
	*
	* @param LKXMY1209 the lkxmy1209 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY1209(java.lang.String LKXMY1209) {
		_vrTechnicalSpec_LKXMY.setLKXMY1209(LKXMY1209);
	}

	/**
	* Sets the lkxmy1210 of this vr technical spec_lkxmy.
	*
	* @param LKXMY1210 the lkxmy1210 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY1210(java.lang.String LKXMY1210) {
		_vrTechnicalSpec_LKXMY.setLKXMY1210(LKXMY1210);
	}

	/**
	* Sets the lkxmy1211 of this vr technical spec_lkxmy.
	*
	* @param LKXMY1211 the lkxmy1211 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY1211(java.lang.String LKXMY1211) {
		_vrTechnicalSpec_LKXMY.setLKXMY1211(LKXMY1211);
	}

	/**
	* Sets the lkxmy1307 of this vr technical spec_lkxmy.
	*
	* @param LKXMY1307 the lkxmy1307 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY1307(java.lang.String LKXMY1307) {
		_vrTechnicalSpec_LKXMY.setLKXMY1307(LKXMY1307);
	}

	/**
	* Sets the lkxmy1308 of this vr technical spec_lkxmy.
	*
	* @param LKXMY1308 the lkxmy1308 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY1308(java.lang.String LKXMY1308) {
		_vrTechnicalSpec_LKXMY.setLKXMY1308(LKXMY1308);
	}

	/**
	* Sets the lkxmy1309 of this vr technical spec_lkxmy.
	*
	* @param LKXMY1309 the lkxmy1309 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY1309(java.lang.String LKXMY1309) {
		_vrTechnicalSpec_LKXMY.setLKXMY1309(LKXMY1309);
	}

	/**
	* Sets the lkxmy1310 of this vr technical spec_lkxmy.
	*
	* @param LKXMY1310 the lkxmy1310 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY1310(java.lang.String LKXMY1310) {
		_vrTechnicalSpec_LKXMY.setLKXMY1310(LKXMY1310);
	}

	/**
	* Sets the lkxmy1311 of this vr technical spec_lkxmy.
	*
	* @param LKXMY1311 the lkxmy1311 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY1311(java.lang.String LKXMY1311) {
		_vrTechnicalSpec_LKXMY.setLKXMY1311(LKXMY1311);
	}

	/**
	* Sets the lkxmy1312 of this vr technical spec_lkxmy.
	*
	* @param LKXMY1312 the lkxmy1312 of this vr technical spec_lkxmy
	*/
	@Override
	public void setLKXMY1312(java.lang.String LKXMY1312) {
		_vrTechnicalSpec_LKXMY.setLKXMY1312(LKXMY1312);
	}

	/**
	* Sets the modify date of this vr technical spec_lkxmy.
	*
	* @param modifyDate the modify date of this vr technical spec_lkxmy
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_LKXMY.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_lkxmy.
	*
	* @param mtCore the mt core of this vr technical spec_lkxmy
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_LKXMY.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_LKXMY.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_lkxmy.
	*
	* @param primaryKey the primary key of this vr technical spec_lkxmy
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_LKXMY.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_LKXMY.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_lkxmy.
	*
	* @param referenceUid the reference uid of this vr technical spec_lkxmy
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_LKXMY.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_lkxmy.
	*
	* @param syncDate the sync date of this vr technical spec_lkxmy
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_LKXMY.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_lkxmy.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_lkxmy
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_LKXMY.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xmy01001 of this vr technical spec_lkxmy.
	*
	* @param XMY01001 the xmy01001 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01001(java.lang.String XMY01001) {
		_vrTechnicalSpec_LKXMY.setXMY01001(XMY01001);
	}

	/**
	* Sets the xmy01002 of this vr technical spec_lkxmy.
	*
	* @param XMY01002 the xmy01002 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01002(java.lang.String XMY01002) {
		_vrTechnicalSpec_LKXMY.setXMY01002(XMY01002);
	}

	/**
	* Sets the xmy01003 of this vr technical spec_lkxmy.
	*
	* @param XMY01003 the xmy01003 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01003(java.lang.String XMY01003) {
		_vrTechnicalSpec_LKXMY.setXMY01003(XMY01003);
	}

	/**
	* Sets the xmy01004 of this vr technical spec_lkxmy.
	*
	* @param XMY01004 the xmy01004 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01004(java.lang.String XMY01004) {
		_vrTechnicalSpec_LKXMY.setXMY01004(XMY01004);
	}

	/**
	* Sets the xmy01005 of this vr technical spec_lkxmy.
	*
	* @param XMY01005 the xmy01005 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01005(java.lang.String XMY01005) {
		_vrTechnicalSpec_LKXMY.setXMY01005(XMY01005);
	}

	/**
	* Sets the xmy01006 of this vr technical spec_lkxmy.
	*
	* @param XMY01006 the xmy01006 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01006(java.lang.String XMY01006) {
		_vrTechnicalSpec_LKXMY.setXMY01006(XMY01006);
	}

	/**
	* Sets the xmy01007 of this vr technical spec_lkxmy.
	*
	* @param XMY01007 the xmy01007 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01007(java.lang.String XMY01007) {
		_vrTechnicalSpec_LKXMY.setXMY01007(XMY01007);
	}

	/**
	* Sets the xmy01008 of this vr technical spec_lkxmy.
	*
	* @param XMY01008 the xmy01008 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01008(java.lang.String XMY01008) {
		_vrTechnicalSpec_LKXMY.setXMY01008(XMY01008);
	}

	/**
	* Sets the xmy01009 of this vr technical spec_lkxmy.
	*
	* @param XMY01009 the xmy01009 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01009(java.lang.String XMY01009) {
		_vrTechnicalSpec_LKXMY.setXMY01009(XMY01009);
	}

	/**
	* Sets the xmy01010 of this vr technical spec_lkxmy.
	*
	* @param XMY01010 the xmy01010 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01010(java.lang.String XMY01010) {
		_vrTechnicalSpec_LKXMY.setXMY01010(XMY01010);
	}

	/**
	* Sets the xmy01011 of this vr technical spec_lkxmy.
	*
	* @param XMY01011 the xmy01011 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01011(java.lang.String XMY01011) {
		_vrTechnicalSpec_LKXMY.setXMY01011(XMY01011);
	}

	/**
	* Sets the xmy01012 of this vr technical spec_lkxmy.
	*
	* @param XMY01012 the xmy01012 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01012(java.lang.String XMY01012) {
		_vrTechnicalSpec_LKXMY.setXMY01012(XMY01012);
	}

	/**
	* Sets the xmy01013 of this vr technical spec_lkxmy.
	*
	* @param XMY01013 the xmy01013 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01013(java.lang.String XMY01013) {
		_vrTechnicalSpec_LKXMY.setXMY01013(XMY01013);
	}

	/**
	* Sets the xmy01014 of this vr technical spec_lkxmy.
	*
	* @param XMY01014 the xmy01014 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01014(java.lang.String XMY01014) {
		_vrTechnicalSpec_LKXMY.setXMY01014(XMY01014);
	}

	/**
	* Sets the xmy01016 of this vr technical spec_lkxmy.
	*
	* @param XMY01016 the xmy01016 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01016(java.lang.String XMY01016) {
		_vrTechnicalSpec_LKXMY.setXMY01016(XMY01016);
	}

	/**
	* Sets the xmy01017 of this vr technical spec_lkxmy.
	*
	* @param XMY01017 the xmy01017 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01017(java.lang.String XMY01017) {
		_vrTechnicalSpec_LKXMY.setXMY01017(XMY01017);
	}

	/**
	* Sets the xmy01019 of this vr technical spec_lkxmy.
	*
	* @param XMY01019 the xmy01019 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01019(java.lang.String XMY01019) {
		_vrTechnicalSpec_LKXMY.setXMY01019(XMY01019);
	}

	/**
	* Sets the xmy01020 of this vr technical spec_lkxmy.
	*
	* @param XMY01020 the xmy01020 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01020(java.lang.String XMY01020) {
		_vrTechnicalSpec_LKXMY.setXMY01020(XMY01020);
	}

	/**
	* Sets the xmy01021 of this vr technical spec_lkxmy.
	*
	* @param XMY01021 the xmy01021 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01021(java.lang.String XMY01021) {
		_vrTechnicalSpec_LKXMY.setXMY01021(XMY01021);
	}

	/**
	* Sets the xmy01022 of this vr technical spec_lkxmy.
	*
	* @param XMY01022 the xmy01022 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01022(java.lang.String XMY01022) {
		_vrTechnicalSpec_LKXMY.setXMY01022(XMY01022);
	}

	/**
	* Sets the xmy01030 of this vr technical spec_lkxmy.
	*
	* @param XMY01030 the xmy01030 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01030(java.lang.String XMY01030) {
		_vrTechnicalSpec_LKXMY.setXMY01030(XMY01030);
	}

	/**
	* Sets the xmy01031 of this vr technical spec_lkxmy.
	*
	* @param XMY01031 the xmy01031 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01031(java.lang.String XMY01031) {
		_vrTechnicalSpec_LKXMY.setXMY01031(XMY01031);
	}

	/**
	* Sets the xmy01032 of this vr technical spec_lkxmy.
	*
	* @param XMY01032 the xmy01032 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01032(java.lang.String XMY01032) {
		_vrTechnicalSpec_LKXMY.setXMY01032(XMY01032);
	}

	/**
	* Sets the xmy01033 of this vr technical spec_lkxmy.
	*
	* @param XMY01033 the xmy01033 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01033(java.lang.String XMY01033) {
		_vrTechnicalSpec_LKXMY.setXMY01033(XMY01033);
	}

	/**
	* Sets the xmy01034 of this vr technical spec_lkxmy.
	*
	* @param XMY01034 the xmy01034 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01034(java.lang.String XMY01034) {
		_vrTechnicalSpec_LKXMY.setXMY01034(XMY01034);
	}

	/**
	* Sets the xmy01035 of this vr technical spec_lkxmy.
	*
	* @param XMY01035 the xmy01035 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01035(java.lang.String XMY01035) {
		_vrTechnicalSpec_LKXMY.setXMY01035(XMY01035);
	}

	/**
	* Sets the xmy01036 of this vr technical spec_lkxmy.
	*
	* @param XMY01036 the xmy01036 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01036(java.lang.String XMY01036) {
		_vrTechnicalSpec_LKXMY.setXMY01036(XMY01036);
	}

	/**
	* Sets the xmy01037 of this vr technical spec_lkxmy.
	*
	* @param XMY01037 the xmy01037 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01037(java.lang.String XMY01037) {
		_vrTechnicalSpec_LKXMY.setXMY01037(XMY01037);
	}

	/**
	* Sets the xmy01038 of this vr technical spec_lkxmy.
	*
	* @param XMY01038 the xmy01038 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01038(java.lang.String XMY01038) {
		_vrTechnicalSpec_LKXMY.setXMY01038(XMY01038);
	}

	/**
	* Sets the xmy01039 of this vr technical spec_lkxmy.
	*
	* @param XMY01039 the xmy01039 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01039(java.lang.String XMY01039) {
		_vrTechnicalSpec_LKXMY.setXMY01039(XMY01039);
	}

	/**
	* Sets the xmy01040 of this vr technical spec_lkxmy.
	*
	* @param XMY01040 the xmy01040 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01040(java.lang.String XMY01040) {
		_vrTechnicalSpec_LKXMY.setXMY01040(XMY01040);
	}

	/**
	* Sets the xmy01041 of this vr technical spec_lkxmy.
	*
	* @param XMY01041 the xmy01041 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01041(java.lang.String XMY01041) {
		_vrTechnicalSpec_LKXMY.setXMY01041(XMY01041);
	}

	/**
	* Sets the xmy01042 of this vr technical spec_lkxmy.
	*
	* @param XMY01042 the xmy01042 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01042(java.lang.String XMY01042) {
		_vrTechnicalSpec_LKXMY.setXMY01042(XMY01042);
	}

	/**
	* Sets the xmy01043 of this vr technical spec_lkxmy.
	*
	* @param XMY01043 the xmy01043 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01043(java.lang.String XMY01043) {
		_vrTechnicalSpec_LKXMY.setXMY01043(XMY01043);
	}

	/**
	* Sets the xmy01044 of this vr technical spec_lkxmy.
	*
	* @param XMY01044 the xmy01044 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01044(java.lang.String XMY01044) {
		_vrTechnicalSpec_LKXMY.setXMY01044(XMY01044);
	}

	/**
	* Sets the xmy01045 of this vr technical spec_lkxmy.
	*
	* @param XMY01045 the xmy01045 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01045(java.lang.String XMY01045) {
		_vrTechnicalSpec_LKXMY.setXMY01045(XMY01045);
	}

	/**
	* Sets the xmy01046 of this vr technical spec_lkxmy.
	*
	* @param XMY01046 the xmy01046 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01046(java.lang.String XMY01046) {
		_vrTechnicalSpec_LKXMY.setXMY01046(XMY01046);
	}

	/**
	* Sets the xmy01047 of this vr technical spec_lkxmy.
	*
	* @param XMY01047 the xmy01047 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01047(java.lang.String XMY01047) {
		_vrTechnicalSpec_LKXMY.setXMY01047(XMY01047);
	}

	/**
	* Sets the xmy01050 of this vr technical spec_lkxmy.
	*
	* @param XMY01050 the xmy01050 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01050(java.lang.String XMY01050) {
		_vrTechnicalSpec_LKXMY.setXMY01050(XMY01050);
	}

	/**
	* Sets the xmy01051 of this vr technical spec_lkxmy.
	*
	* @param XMY01051 the xmy01051 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01051(java.lang.String XMY01051) {
		_vrTechnicalSpec_LKXMY.setXMY01051(XMY01051);
	}

	/**
	* Sets the xmy01052 of this vr technical spec_lkxmy.
	*
	* @param XMY01052 the xmy01052 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01052(java.lang.String XMY01052) {
		_vrTechnicalSpec_LKXMY.setXMY01052(XMY01052);
	}

	/**
	* Sets the xmy01053 of this vr technical spec_lkxmy.
	*
	* @param XMY01053 the xmy01053 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01053(java.lang.String XMY01053) {
		_vrTechnicalSpec_LKXMY.setXMY01053(XMY01053);
	}

	/**
	* Sets the xmy01054 of this vr technical spec_lkxmy.
	*
	* @param XMY01054 the xmy01054 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01054(java.lang.String XMY01054) {
		_vrTechnicalSpec_LKXMY.setXMY01054(XMY01054);
	}

	/**
	* Sets the xmy01055 of this vr technical spec_lkxmy.
	*
	* @param XMY01055 the xmy01055 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01055(java.lang.String XMY01055) {
		_vrTechnicalSpec_LKXMY.setXMY01055(XMY01055);
	}

	/**
	* Sets the xmy01056 of this vr technical spec_lkxmy.
	*
	* @param XMY01056 the xmy01056 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01056(java.lang.String XMY01056) {
		_vrTechnicalSpec_LKXMY.setXMY01056(XMY01056);
	}

	/**
	* Sets the xmy01057 of this vr technical spec_lkxmy.
	*
	* @param XMY01057 the xmy01057 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01057(java.lang.String XMY01057) {
		_vrTechnicalSpec_LKXMY.setXMY01057(XMY01057);
	}

	/**
	* Sets the xmy01058 of this vr technical spec_lkxmy.
	*
	* @param XMY01058 the xmy01058 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01058(java.lang.String XMY01058) {
		_vrTechnicalSpec_LKXMY.setXMY01058(XMY01058);
	}

	/**
	* Sets the xmy01059 of this vr technical spec_lkxmy.
	*
	* @param XMY01059 the xmy01059 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01059(java.lang.String XMY01059) {
		_vrTechnicalSpec_LKXMY.setXMY01059(XMY01059);
	}

	/**
	* Sets the xmy01060 of this vr technical spec_lkxmy.
	*
	* @param XMY01060 the xmy01060 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01060(java.lang.String XMY01060) {
		_vrTechnicalSpec_LKXMY.setXMY01060(XMY01060);
	}

	/**
	* Sets the xmy01062 of this vr technical spec_lkxmy.
	*
	* @param XMY01062 the xmy01062 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01062(java.lang.String XMY01062) {
		_vrTechnicalSpec_LKXMY.setXMY01062(XMY01062);
	}

	/**
	* Sets the xmy01063 of this vr technical spec_lkxmy.
	*
	* @param XMY01063 the xmy01063 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01063(java.lang.String XMY01063) {
		_vrTechnicalSpec_LKXMY.setXMY01063(XMY01063);
	}

	/**
	* Sets the xmy01064 of this vr technical spec_lkxmy.
	*
	* @param XMY01064 the xmy01064 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01064(java.lang.String XMY01064) {
		_vrTechnicalSpec_LKXMY.setXMY01064(XMY01064);
	}

	/**
	* Sets the xmy01065 of this vr technical spec_lkxmy.
	*
	* @param XMY01065 the xmy01065 of this vr technical spec_lkxmy
	*/
	@Override
	public void setXMY01065(java.lang.String XMY01065) {
		_vrTechnicalSpec_LKXMY.setXMY01065(XMY01065);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_LKXMYWrapper)) {
			return false;
		}

		VRTechnicalSpec_LKXMYWrapper vrTechnicalSpec_LKXMYWrapper = (VRTechnicalSpec_LKXMYWrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_LKXMY,
					vrTechnicalSpec_LKXMYWrapper._vrTechnicalSpec_LKXMY)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_LKXMY getWrappedModel() {
		return _vrTechnicalSpec_LKXMY;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_LKXMY.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_LKXMY.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_LKXMY.resetOriginalValues();
	}

	private final VRTechnicalSpec_LKXMY _vrTechnicalSpec_LKXMY;
}