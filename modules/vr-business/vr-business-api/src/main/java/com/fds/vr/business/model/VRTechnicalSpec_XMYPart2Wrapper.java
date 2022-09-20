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
 * This class is a wrapper for {@link VRTechnicalSpec_XMYPart2}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XMYPart2
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XMYPart2Wrapper implements VRTechnicalSpec_XMYPart2,
	ModelWrapper<VRTechnicalSpec_XMYPart2> {
	public VRTechnicalSpec_XMYPart2Wrapper(
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2) {
		_vrTechnicalSpec_XMYPart2 = vrTechnicalSpec_XMYPart2;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XMYPart2.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XMYPart2.class.getName();
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
		attributes.put("XMY0010", getXMY0010());
		attributes.put("XMY0011", getXMY0011());
		attributes.put("XMY0012", getXMY0012());
		attributes.put("XMY0013", getXMY0013());
		attributes.put("XMY0014", getXMY0014());
		attributes.put("XMY0015", getXMY0015());
		attributes.put("XMY0016", getXMY0016());
		attributes.put("XMY0017", getXMY0017());
		attributes.put("XMY0018", getXMY0018());
		attributes.put("XMY0019", getXMY0019());
		attributes.put("XMY0020", getXMY0020());
		attributes.put("XMY0021", getXMY0021());
		attributes.put("XMY0022", getXMY0022());
		attributes.put("XMY0023", getXMY0023());
		attributes.put("XMY0024", getXMY0024());
		attributes.put("XMY0025", getXMY0025());
		attributes.put("XMY0026", getXMY0026());
		attributes.put("XMY0027", getXMY0027());
		attributes.put("XMY0028", getXMY0028());
		attributes.put("XMY0029", getXMY0029());
		attributes.put("XMY0030", getXMY0030());
		attributes.put("XMY0031", getXMY0031());
		attributes.put("XMY0032", getXMY0032());
		attributes.put("XMY0033", getXMY0033());
		attributes.put("XMY0034", getXMY0034());
		attributes.put("XMY0036", getXMY0036());
		attributes.put("XMY0037", getXMY0037());
		attributes.put("XMY0038", getXMY0038());
		attributes.put("XMY0039", getXMY0039());
		attributes.put("XMY0040", getXMY0040());
		attributes.put("XMY0041", getXMY0041());
		attributes.put("XMY0042", getXMY0042());
		attributes.put("XMY0043", getXMY0043());
		attributes.put("XMY0044", getXMY0044());
		attributes.put("XMY0045", getXMY0045());
		attributes.put("XMY0046", getXMY0046());
		attributes.put("XMY0048", getXMY0048());
		attributes.put("XMY0049", getXMY0049());
		attributes.put("XMY0050", getXMY0050());
		attributes.put("XMY0051", getXMY0051());
		attributes.put("XMY0052", getXMY0052());
		attributes.put("XMY0053", getXMY0053());
		attributes.put("XMY0054", getXMY0054());
		attributes.put("XMY0055", getXMY0055());
		attributes.put("XMY0056", getXMY0056());
		attributes.put("XMY0057", getXMY0057());
		attributes.put("XMY0058", getXMY0058());
		attributes.put("XMY0059", getXMY0059());
		attributes.put("XMY0060", getXMY0060());
		attributes.put("XMY0061", getXMY0061());
		attributes.put("XMY0062", getXMY0062());
		attributes.put("XMY0063", getXMY0063());
		attributes.put("XMY0064", getXMY0064());
		attributes.put("XMY0065", getXMY0065());
		attributes.put("XMY0066", getXMY0066());
		attributes.put("XMY0067", getXMY0067());
		attributes.put("XMY0068", getXMY0068());
		attributes.put("XMY0070", getXMY0070());
		attributes.put("XMY0071", getXMY0071());
		attributes.put("XMY0072", getXMY0072());
		attributes.put("XMY0073", getXMY0073());
		attributes.put("XMY0074", getXMY0074());
		attributes.put("XMY0075", getXMY0075());
		attributes.put("XMY0076", getXMY0076());
		attributes.put("XMY0077", getXMY0077());
		attributes.put("XMY0078", getXMY0078());
		attributes.put("XMY0079", getXMY0079());
		attributes.put("XMY0080", getXMY0080());
		attributes.put("XMY0081", getXMY0081());
		attributes.put("XMY0082", getXMY0082());
		attributes.put("XMY0083", getXMY0083());
		attributes.put("XMY0084", getXMY0084());
		attributes.put("XMY0085", getXMY0085());
		attributes.put("XMY0086", getXMY0086());
		attributes.put("XMY0087", getXMY0087());
		attributes.put("XMY0088", getXMY0088());
		attributes.put("XMY0089", getXMY0089());
		attributes.put("XMY0090", getXMY0090());
		attributes.put("XMY0091", getXMY0091());
		attributes.put("XMY0092", getXMY0092());
		attributes.put("XMY0093", getXMY0093());
		attributes.put("XMY0094", getXMY0094());
		attributes.put("XMY0095", getXMY0095());
		attributes.put("XMY0096", getXMY0096());
		attributes.put("XMY0097", getXMY0097());
		attributes.put("XMY0098", getXMY0098());
		attributes.put("XMY0099", getXMY0099());
		attributes.put("XMY0100", getXMY0100());
		attributes.put("XMY0101", getXMY0101());
		attributes.put("XMY0102", getXMY0102());
		attributes.put("XMY0103", getXMY0103());
		attributes.put("XMY0104", getXMY0104());
		attributes.put("XMY0105", getXMY0105());
		attributes.put("XMY0106", getXMY0106());
		attributes.put("XMY0107", getXMY0107());
		attributes.put("XMY0108", getXMY0108());
		attributes.put("XMY0109", getXMY0109());
		attributes.put("XMY0110", getXMY0110());
		attributes.put("XMY0111", getXMY0111());
		attributes.put("XMY0112", getXMY0112());
		attributes.put("XMY0113", getXMY0113());
		attributes.put("XMY0114", getXMY0114());
		attributes.put("XMY0115", getXMY0115());
		attributes.put("XMY0116", getXMY0116());
		attributes.put("XMY0117", getXMY0117());
		attributes.put("XMY0118", getXMY0118());
		attributes.put("XMY0119", getXMY0119());
		attributes.put("XMY0120", getXMY0120());
		attributes.put("XMY0121", getXMY0121());
		attributes.put("XMY0122", getXMY0122());
		attributes.put("XMY0123", getXMY0123());
		attributes.put("XMY0124", getXMY0124());
		attributes.put("XMY0125", getXMY0125());
		attributes.put("XMY0126", getXMY0126());
		attributes.put("XMY0127", getXMY0127());
		attributes.put("XMY0128", getXMY0128());
		attributes.put("XMY0129", getXMY0129());
		attributes.put("XMY0130", getXMY0130());
		attributes.put("XMY0131", getXMY0131());
		attributes.put("XMY0132", getXMY0132());
		attributes.put("XMY0133", getXMY0133());
		attributes.put("XMY0134", getXMY0134());
		attributes.put("XMY0135", getXMY0135());
		attributes.put("XMY0136", getXMY0136());
		attributes.put("XMY0137", getXMY0137());
		attributes.put("XMY0138", getXMY0138());
		attributes.put("XMY0139", getXMY0139());
		attributes.put("XMY0140", getXMY0140());
		attributes.put("XMY0141", getXMY0141());
		attributes.put("XMY0142", getXMY0142());
		attributes.put("XMY0143", getXMY0143());
		attributes.put("XMY0144", getXMY0144());
		attributes.put("XMY0145", getXMY0145());
		attributes.put("XMY0146", getXMY0146());
		attributes.put("XMY0147", getXMY0147());
		attributes.put("XMY0148", getXMY0148());
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

		String XMY0010 = (String)attributes.get("XMY0010");

		if (XMY0010 != null) {
			setXMY0010(XMY0010);
		}

		String XMY0011 = (String)attributes.get("XMY0011");

		if (XMY0011 != null) {
			setXMY0011(XMY0011);
		}

		String XMY0012 = (String)attributes.get("XMY0012");

		if (XMY0012 != null) {
			setXMY0012(XMY0012);
		}

		String XMY0013 = (String)attributes.get("XMY0013");

		if (XMY0013 != null) {
			setXMY0013(XMY0013);
		}

		String XMY0014 = (String)attributes.get("XMY0014");

		if (XMY0014 != null) {
			setXMY0014(XMY0014);
		}

		String XMY0015 = (String)attributes.get("XMY0015");

		if (XMY0015 != null) {
			setXMY0015(XMY0015);
		}

		String XMY0016 = (String)attributes.get("XMY0016");

		if (XMY0016 != null) {
			setXMY0016(XMY0016);
		}

		String XMY0017 = (String)attributes.get("XMY0017");

		if (XMY0017 != null) {
			setXMY0017(XMY0017);
		}

		String XMY0018 = (String)attributes.get("XMY0018");

		if (XMY0018 != null) {
			setXMY0018(XMY0018);
		}

		String XMY0019 = (String)attributes.get("XMY0019");

		if (XMY0019 != null) {
			setXMY0019(XMY0019);
		}

		String XMY0020 = (String)attributes.get("XMY0020");

		if (XMY0020 != null) {
			setXMY0020(XMY0020);
		}

		String XMY0021 = (String)attributes.get("XMY0021");

		if (XMY0021 != null) {
			setXMY0021(XMY0021);
		}

		String XMY0022 = (String)attributes.get("XMY0022");

		if (XMY0022 != null) {
			setXMY0022(XMY0022);
		}

		String XMY0023 = (String)attributes.get("XMY0023");

		if (XMY0023 != null) {
			setXMY0023(XMY0023);
		}

		String XMY0024 = (String)attributes.get("XMY0024");

		if (XMY0024 != null) {
			setXMY0024(XMY0024);
		}

		String XMY0025 = (String)attributes.get("XMY0025");

		if (XMY0025 != null) {
			setXMY0025(XMY0025);
		}

		String XMY0026 = (String)attributes.get("XMY0026");

		if (XMY0026 != null) {
			setXMY0026(XMY0026);
		}

		String XMY0027 = (String)attributes.get("XMY0027");

		if (XMY0027 != null) {
			setXMY0027(XMY0027);
		}

		String XMY0028 = (String)attributes.get("XMY0028");

		if (XMY0028 != null) {
			setXMY0028(XMY0028);
		}

		String XMY0029 = (String)attributes.get("XMY0029");

		if (XMY0029 != null) {
			setXMY0029(XMY0029);
		}

		String XMY0030 = (String)attributes.get("XMY0030");

		if (XMY0030 != null) {
			setXMY0030(XMY0030);
		}

		String XMY0031 = (String)attributes.get("XMY0031");

		if (XMY0031 != null) {
			setXMY0031(XMY0031);
		}

		String XMY0032 = (String)attributes.get("XMY0032");

		if (XMY0032 != null) {
			setXMY0032(XMY0032);
		}

		String XMY0033 = (String)attributes.get("XMY0033");

		if (XMY0033 != null) {
			setXMY0033(XMY0033);
		}

		String XMY0034 = (String)attributes.get("XMY0034");

		if (XMY0034 != null) {
			setXMY0034(XMY0034);
		}

		String XMY0036 = (String)attributes.get("XMY0036");

		if (XMY0036 != null) {
			setXMY0036(XMY0036);
		}

		String XMY0037 = (String)attributes.get("XMY0037");

		if (XMY0037 != null) {
			setXMY0037(XMY0037);
		}

		String XMY0038 = (String)attributes.get("XMY0038");

		if (XMY0038 != null) {
			setXMY0038(XMY0038);
		}

		String XMY0039 = (String)attributes.get("XMY0039");

		if (XMY0039 != null) {
			setXMY0039(XMY0039);
		}

		String XMY0040 = (String)attributes.get("XMY0040");

		if (XMY0040 != null) {
			setXMY0040(XMY0040);
		}

		String XMY0041 = (String)attributes.get("XMY0041");

		if (XMY0041 != null) {
			setXMY0041(XMY0041);
		}

		String XMY0042 = (String)attributes.get("XMY0042");

		if (XMY0042 != null) {
			setXMY0042(XMY0042);
		}

		String XMY0043 = (String)attributes.get("XMY0043");

		if (XMY0043 != null) {
			setXMY0043(XMY0043);
		}

		String XMY0044 = (String)attributes.get("XMY0044");

		if (XMY0044 != null) {
			setXMY0044(XMY0044);
		}

		String XMY0045 = (String)attributes.get("XMY0045");

		if (XMY0045 != null) {
			setXMY0045(XMY0045);
		}

		String XMY0046 = (String)attributes.get("XMY0046");

		if (XMY0046 != null) {
			setXMY0046(XMY0046);
		}

		String XMY0048 = (String)attributes.get("XMY0048");

		if (XMY0048 != null) {
			setXMY0048(XMY0048);
		}

		String XMY0049 = (String)attributes.get("XMY0049");

		if (XMY0049 != null) {
			setXMY0049(XMY0049);
		}

		String XMY0050 = (String)attributes.get("XMY0050");

		if (XMY0050 != null) {
			setXMY0050(XMY0050);
		}

		String XMY0051 = (String)attributes.get("XMY0051");

		if (XMY0051 != null) {
			setXMY0051(XMY0051);
		}

		String XMY0052 = (String)attributes.get("XMY0052");

		if (XMY0052 != null) {
			setXMY0052(XMY0052);
		}

		String XMY0053 = (String)attributes.get("XMY0053");

		if (XMY0053 != null) {
			setXMY0053(XMY0053);
		}

		String XMY0054 = (String)attributes.get("XMY0054");

		if (XMY0054 != null) {
			setXMY0054(XMY0054);
		}

		String XMY0055 = (String)attributes.get("XMY0055");

		if (XMY0055 != null) {
			setXMY0055(XMY0055);
		}

		String XMY0056 = (String)attributes.get("XMY0056");

		if (XMY0056 != null) {
			setXMY0056(XMY0056);
		}

		String XMY0057 = (String)attributes.get("XMY0057");

		if (XMY0057 != null) {
			setXMY0057(XMY0057);
		}

		String XMY0058 = (String)attributes.get("XMY0058");

		if (XMY0058 != null) {
			setXMY0058(XMY0058);
		}

		String XMY0059 = (String)attributes.get("XMY0059");

		if (XMY0059 != null) {
			setXMY0059(XMY0059);
		}

		String XMY0060 = (String)attributes.get("XMY0060");

		if (XMY0060 != null) {
			setXMY0060(XMY0060);
		}

		String XMY0061 = (String)attributes.get("XMY0061");

		if (XMY0061 != null) {
			setXMY0061(XMY0061);
		}

		String XMY0062 = (String)attributes.get("XMY0062");

		if (XMY0062 != null) {
			setXMY0062(XMY0062);
		}

		String XMY0063 = (String)attributes.get("XMY0063");

		if (XMY0063 != null) {
			setXMY0063(XMY0063);
		}

		String XMY0064 = (String)attributes.get("XMY0064");

		if (XMY0064 != null) {
			setXMY0064(XMY0064);
		}

		String XMY0065 = (String)attributes.get("XMY0065");

		if (XMY0065 != null) {
			setXMY0065(XMY0065);
		}

		String XMY0066 = (String)attributes.get("XMY0066");

		if (XMY0066 != null) {
			setXMY0066(XMY0066);
		}

		String XMY0067 = (String)attributes.get("XMY0067");

		if (XMY0067 != null) {
			setXMY0067(XMY0067);
		}

		String XMY0068 = (String)attributes.get("XMY0068");

		if (XMY0068 != null) {
			setXMY0068(XMY0068);
		}

		String XMY0070 = (String)attributes.get("XMY0070");

		if (XMY0070 != null) {
			setXMY0070(XMY0070);
		}

		String XMY0071 = (String)attributes.get("XMY0071");

		if (XMY0071 != null) {
			setXMY0071(XMY0071);
		}

		String XMY0072 = (String)attributes.get("XMY0072");

		if (XMY0072 != null) {
			setXMY0072(XMY0072);
		}

		String XMY0073 = (String)attributes.get("XMY0073");

		if (XMY0073 != null) {
			setXMY0073(XMY0073);
		}

		String XMY0074 = (String)attributes.get("XMY0074");

		if (XMY0074 != null) {
			setXMY0074(XMY0074);
		}

		String XMY0075 = (String)attributes.get("XMY0075");

		if (XMY0075 != null) {
			setXMY0075(XMY0075);
		}

		String XMY0076 = (String)attributes.get("XMY0076");

		if (XMY0076 != null) {
			setXMY0076(XMY0076);
		}

		String XMY0077 = (String)attributes.get("XMY0077");

		if (XMY0077 != null) {
			setXMY0077(XMY0077);
		}

		String XMY0078 = (String)attributes.get("XMY0078");

		if (XMY0078 != null) {
			setXMY0078(XMY0078);
		}

		String XMY0079 = (String)attributes.get("XMY0079");

		if (XMY0079 != null) {
			setXMY0079(XMY0079);
		}

		String XMY0080 = (String)attributes.get("XMY0080");

		if (XMY0080 != null) {
			setXMY0080(XMY0080);
		}

		String XMY0081 = (String)attributes.get("XMY0081");

		if (XMY0081 != null) {
			setXMY0081(XMY0081);
		}

		String XMY0082 = (String)attributes.get("XMY0082");

		if (XMY0082 != null) {
			setXMY0082(XMY0082);
		}

		String XMY0083 = (String)attributes.get("XMY0083");

		if (XMY0083 != null) {
			setXMY0083(XMY0083);
		}

		String XMY0084 = (String)attributes.get("XMY0084");

		if (XMY0084 != null) {
			setXMY0084(XMY0084);
		}

		String XMY0085 = (String)attributes.get("XMY0085");

		if (XMY0085 != null) {
			setXMY0085(XMY0085);
		}

		String XMY0086 = (String)attributes.get("XMY0086");

		if (XMY0086 != null) {
			setXMY0086(XMY0086);
		}

		String XMY0087 = (String)attributes.get("XMY0087");

		if (XMY0087 != null) {
			setXMY0087(XMY0087);
		}

		String XMY0088 = (String)attributes.get("XMY0088");

		if (XMY0088 != null) {
			setXMY0088(XMY0088);
		}

		String XMY0089 = (String)attributes.get("XMY0089");

		if (XMY0089 != null) {
			setXMY0089(XMY0089);
		}

		String XMY0090 = (String)attributes.get("XMY0090");

		if (XMY0090 != null) {
			setXMY0090(XMY0090);
		}

		String XMY0091 = (String)attributes.get("XMY0091");

		if (XMY0091 != null) {
			setXMY0091(XMY0091);
		}

		String XMY0092 = (String)attributes.get("XMY0092");

		if (XMY0092 != null) {
			setXMY0092(XMY0092);
		}

		String XMY0093 = (String)attributes.get("XMY0093");

		if (XMY0093 != null) {
			setXMY0093(XMY0093);
		}

		String XMY0094 = (String)attributes.get("XMY0094");

		if (XMY0094 != null) {
			setXMY0094(XMY0094);
		}

		String XMY0095 = (String)attributes.get("XMY0095");

		if (XMY0095 != null) {
			setXMY0095(XMY0095);
		}

		String XMY0096 = (String)attributes.get("XMY0096");

		if (XMY0096 != null) {
			setXMY0096(XMY0096);
		}

		String XMY0097 = (String)attributes.get("XMY0097");

		if (XMY0097 != null) {
			setXMY0097(XMY0097);
		}

		String XMY0098 = (String)attributes.get("XMY0098");

		if (XMY0098 != null) {
			setXMY0098(XMY0098);
		}

		String XMY0099 = (String)attributes.get("XMY0099");

		if (XMY0099 != null) {
			setXMY0099(XMY0099);
		}

		String XMY0100 = (String)attributes.get("XMY0100");

		if (XMY0100 != null) {
			setXMY0100(XMY0100);
		}

		String XMY0101 = (String)attributes.get("XMY0101");

		if (XMY0101 != null) {
			setXMY0101(XMY0101);
		}

		String XMY0102 = (String)attributes.get("XMY0102");

		if (XMY0102 != null) {
			setXMY0102(XMY0102);
		}

		String XMY0103 = (String)attributes.get("XMY0103");

		if (XMY0103 != null) {
			setXMY0103(XMY0103);
		}

		String XMY0104 = (String)attributes.get("XMY0104");

		if (XMY0104 != null) {
			setXMY0104(XMY0104);
		}

		String XMY0105 = (String)attributes.get("XMY0105");

		if (XMY0105 != null) {
			setXMY0105(XMY0105);
		}

		String XMY0106 = (String)attributes.get("XMY0106");

		if (XMY0106 != null) {
			setXMY0106(XMY0106);
		}

		String XMY0107 = (String)attributes.get("XMY0107");

		if (XMY0107 != null) {
			setXMY0107(XMY0107);
		}

		String XMY0108 = (String)attributes.get("XMY0108");

		if (XMY0108 != null) {
			setXMY0108(XMY0108);
		}

		String XMY0109 = (String)attributes.get("XMY0109");

		if (XMY0109 != null) {
			setXMY0109(XMY0109);
		}

		String XMY0110 = (String)attributes.get("XMY0110");

		if (XMY0110 != null) {
			setXMY0110(XMY0110);
		}

		String XMY0111 = (String)attributes.get("XMY0111");

		if (XMY0111 != null) {
			setXMY0111(XMY0111);
		}

		String XMY0112 = (String)attributes.get("XMY0112");

		if (XMY0112 != null) {
			setXMY0112(XMY0112);
		}

		String XMY0113 = (String)attributes.get("XMY0113");

		if (XMY0113 != null) {
			setXMY0113(XMY0113);
		}

		String XMY0114 = (String)attributes.get("XMY0114");

		if (XMY0114 != null) {
			setXMY0114(XMY0114);
		}

		String XMY0115 = (String)attributes.get("XMY0115");

		if (XMY0115 != null) {
			setXMY0115(XMY0115);
		}

		String XMY0116 = (String)attributes.get("XMY0116");

		if (XMY0116 != null) {
			setXMY0116(XMY0116);
		}

		String XMY0117 = (String)attributes.get("XMY0117");

		if (XMY0117 != null) {
			setXMY0117(XMY0117);
		}

		String XMY0118 = (String)attributes.get("XMY0118");

		if (XMY0118 != null) {
			setXMY0118(XMY0118);
		}

		String XMY0119 = (String)attributes.get("XMY0119");

		if (XMY0119 != null) {
			setXMY0119(XMY0119);
		}

		String XMY0120 = (String)attributes.get("XMY0120");

		if (XMY0120 != null) {
			setXMY0120(XMY0120);
		}

		String XMY0121 = (String)attributes.get("XMY0121");

		if (XMY0121 != null) {
			setXMY0121(XMY0121);
		}

		String XMY0122 = (String)attributes.get("XMY0122");

		if (XMY0122 != null) {
			setXMY0122(XMY0122);
		}

		String XMY0123 = (String)attributes.get("XMY0123");

		if (XMY0123 != null) {
			setXMY0123(XMY0123);
		}

		String XMY0124 = (String)attributes.get("XMY0124");

		if (XMY0124 != null) {
			setXMY0124(XMY0124);
		}

		String XMY0125 = (String)attributes.get("XMY0125");

		if (XMY0125 != null) {
			setXMY0125(XMY0125);
		}

		String XMY0126 = (String)attributes.get("XMY0126");

		if (XMY0126 != null) {
			setXMY0126(XMY0126);
		}

		String XMY0127 = (String)attributes.get("XMY0127");

		if (XMY0127 != null) {
			setXMY0127(XMY0127);
		}

		String XMY0128 = (String)attributes.get("XMY0128");

		if (XMY0128 != null) {
			setXMY0128(XMY0128);
		}

		String XMY0129 = (String)attributes.get("XMY0129");

		if (XMY0129 != null) {
			setXMY0129(XMY0129);
		}

		String XMY0130 = (String)attributes.get("XMY0130");

		if (XMY0130 != null) {
			setXMY0130(XMY0130);
		}

		String XMY0131 = (String)attributes.get("XMY0131");

		if (XMY0131 != null) {
			setXMY0131(XMY0131);
		}

		String XMY0132 = (String)attributes.get("XMY0132");

		if (XMY0132 != null) {
			setXMY0132(XMY0132);
		}

		String XMY0133 = (String)attributes.get("XMY0133");

		if (XMY0133 != null) {
			setXMY0133(XMY0133);
		}

		String XMY0134 = (String)attributes.get("XMY0134");

		if (XMY0134 != null) {
			setXMY0134(XMY0134);
		}

		String XMY0135 = (String)attributes.get("XMY0135");

		if (XMY0135 != null) {
			setXMY0135(XMY0135);
		}

		String XMY0136 = (String)attributes.get("XMY0136");

		if (XMY0136 != null) {
			setXMY0136(XMY0136);
		}

		String XMY0137 = (String)attributes.get("XMY0137");

		if (XMY0137 != null) {
			setXMY0137(XMY0137);
		}

		String XMY0138 = (String)attributes.get("XMY0138");

		if (XMY0138 != null) {
			setXMY0138(XMY0138);
		}

		String XMY0139 = (String)attributes.get("XMY0139");

		if (XMY0139 != null) {
			setXMY0139(XMY0139);
		}

		String XMY0140 = (String)attributes.get("XMY0140");

		if (XMY0140 != null) {
			setXMY0140(XMY0140);
		}

		String XMY0141 = (String)attributes.get("XMY0141");

		if (XMY0141 != null) {
			setXMY0141(XMY0141);
		}

		String XMY0142 = (String)attributes.get("XMY0142");

		if (XMY0142 != null) {
			setXMY0142(XMY0142);
		}

		String XMY0143 = (String)attributes.get("XMY0143");

		if (XMY0143 != null) {
			setXMY0143(XMY0143);
		}

		String XMY0144 = (String)attributes.get("XMY0144");

		if (XMY0144 != null) {
			setXMY0144(XMY0144);
		}

		String XMY0145 = (String)attributes.get("XMY0145");

		if (XMY0145 != null) {
			setXMY0145(XMY0145);
		}

		String XMY0146 = (String)attributes.get("XMY0146");

		if (XMY0146 != null) {
			setXMY0146(XMY0146);
		}

		String XMY0147 = (String)attributes.get("XMY0147");

		if (XMY0147 != null) {
			setXMY0147(XMY0147);
		}

		String XMY0148 = (String)attributes.get("XMY0148");

		if (XMY0148 != null) {
			setXMY0148(XMY0148);
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
	public VRTechnicalSpec_XMYPart2 toEscapedModel() {
		return new VRTechnicalSpec_XMYPart2Wrapper(_vrTechnicalSpec_XMYPart2.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XMYPart2 toUnescapedModel() {
		return new VRTechnicalSpec_XMYPart2Wrapper(_vrTechnicalSpec_XMYPart2.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XMYPart2.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XMYPart2.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XMYPart2.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XMYPart2.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XMYPart2> toCacheModel() {
		return _vrTechnicalSpec_XMYPart2.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2) {
		return _vrTechnicalSpec_XMYPart2.compareTo(vrTechnicalSpec_XMYPart2);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XMYPart2.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XMYPart2.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XMYPart2Wrapper((VRTechnicalSpec_XMYPart2)_vrTechnicalSpec_XMYPart2.clone());
	}

	/**
	* Returns the deliverable code of this vr technical spec_xmy part2.
	*
	* @return the deliverable code of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XMYPart2.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xmy part2.
	*
	* @return the dossier ID ctn of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XMYPart2.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xmy part2.
	*
	* @return the dossier no of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XMYPart2.getDossierNo();
	}

	/**
	* Returns the reference uid of this vr technical spec_xmy part2.
	*
	* @return the reference uid of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XMYPart2.getReferenceUid();
	}

	/**
	* Returns the xmy0010 of this vr technical spec_xmy part2.
	*
	* @return the xmy0010 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0010() {
		return _vrTechnicalSpec_XMYPart2.getXMY0010();
	}

	/**
	* Returns the xmy0011 of this vr technical spec_xmy part2.
	*
	* @return the xmy0011 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0011() {
		return _vrTechnicalSpec_XMYPart2.getXMY0011();
	}

	/**
	* Returns the xmy0012 of this vr technical spec_xmy part2.
	*
	* @return the xmy0012 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0012() {
		return _vrTechnicalSpec_XMYPart2.getXMY0012();
	}

	/**
	* Returns the xmy0013 of this vr technical spec_xmy part2.
	*
	* @return the xmy0013 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0013() {
		return _vrTechnicalSpec_XMYPart2.getXMY0013();
	}

	/**
	* Returns the xmy0014 of this vr technical spec_xmy part2.
	*
	* @return the xmy0014 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0014() {
		return _vrTechnicalSpec_XMYPart2.getXMY0014();
	}

	/**
	* Returns the xmy0015 of this vr technical spec_xmy part2.
	*
	* @return the xmy0015 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0015() {
		return _vrTechnicalSpec_XMYPart2.getXMY0015();
	}

	/**
	* Returns the xmy0016 of this vr technical spec_xmy part2.
	*
	* @return the xmy0016 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0016() {
		return _vrTechnicalSpec_XMYPart2.getXMY0016();
	}

	/**
	* Returns the xmy0017 of this vr technical spec_xmy part2.
	*
	* @return the xmy0017 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0017() {
		return _vrTechnicalSpec_XMYPart2.getXMY0017();
	}

	/**
	* Returns the xmy0018 of this vr technical spec_xmy part2.
	*
	* @return the xmy0018 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0018() {
		return _vrTechnicalSpec_XMYPart2.getXMY0018();
	}

	/**
	* Returns the xmy0019 of this vr technical spec_xmy part2.
	*
	* @return the xmy0019 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0019() {
		return _vrTechnicalSpec_XMYPart2.getXMY0019();
	}

	/**
	* Returns the xmy0020 of this vr technical spec_xmy part2.
	*
	* @return the xmy0020 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0020() {
		return _vrTechnicalSpec_XMYPart2.getXMY0020();
	}

	/**
	* Returns the xmy0021 of this vr technical spec_xmy part2.
	*
	* @return the xmy0021 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0021() {
		return _vrTechnicalSpec_XMYPart2.getXMY0021();
	}

	/**
	* Returns the xmy0022 of this vr technical spec_xmy part2.
	*
	* @return the xmy0022 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0022() {
		return _vrTechnicalSpec_XMYPart2.getXMY0022();
	}

	/**
	* Returns the xmy0023 of this vr technical spec_xmy part2.
	*
	* @return the xmy0023 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0023() {
		return _vrTechnicalSpec_XMYPart2.getXMY0023();
	}

	/**
	* Returns the xmy0024 of this vr technical spec_xmy part2.
	*
	* @return the xmy0024 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0024() {
		return _vrTechnicalSpec_XMYPart2.getXMY0024();
	}

	/**
	* Returns the xmy0025 of this vr technical spec_xmy part2.
	*
	* @return the xmy0025 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0025() {
		return _vrTechnicalSpec_XMYPart2.getXMY0025();
	}

	/**
	* Returns the xmy0026 of this vr technical spec_xmy part2.
	*
	* @return the xmy0026 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0026() {
		return _vrTechnicalSpec_XMYPart2.getXMY0026();
	}

	/**
	* Returns the xmy0027 of this vr technical spec_xmy part2.
	*
	* @return the xmy0027 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0027() {
		return _vrTechnicalSpec_XMYPart2.getXMY0027();
	}

	/**
	* Returns the xmy0028 of this vr technical spec_xmy part2.
	*
	* @return the xmy0028 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0028() {
		return _vrTechnicalSpec_XMYPart2.getXMY0028();
	}

	/**
	* Returns the xmy0029 of this vr technical spec_xmy part2.
	*
	* @return the xmy0029 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0029() {
		return _vrTechnicalSpec_XMYPart2.getXMY0029();
	}

	/**
	* Returns the xmy0030 of this vr technical spec_xmy part2.
	*
	* @return the xmy0030 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0030() {
		return _vrTechnicalSpec_XMYPart2.getXMY0030();
	}

	/**
	* Returns the xmy0031 of this vr technical spec_xmy part2.
	*
	* @return the xmy0031 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0031() {
		return _vrTechnicalSpec_XMYPart2.getXMY0031();
	}

	/**
	* Returns the xmy0032 of this vr technical spec_xmy part2.
	*
	* @return the xmy0032 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0032() {
		return _vrTechnicalSpec_XMYPart2.getXMY0032();
	}

	/**
	* Returns the xmy0033 of this vr technical spec_xmy part2.
	*
	* @return the xmy0033 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0033() {
		return _vrTechnicalSpec_XMYPart2.getXMY0033();
	}

	/**
	* Returns the xmy0034 of this vr technical spec_xmy part2.
	*
	* @return the xmy0034 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0034() {
		return _vrTechnicalSpec_XMYPart2.getXMY0034();
	}

	/**
	* Returns the xmy0036 of this vr technical spec_xmy part2.
	*
	* @return the xmy0036 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0036() {
		return _vrTechnicalSpec_XMYPart2.getXMY0036();
	}

	/**
	* Returns the xmy0037 of this vr technical spec_xmy part2.
	*
	* @return the xmy0037 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0037() {
		return _vrTechnicalSpec_XMYPart2.getXMY0037();
	}

	/**
	* Returns the xmy0038 of this vr technical spec_xmy part2.
	*
	* @return the xmy0038 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0038() {
		return _vrTechnicalSpec_XMYPart2.getXMY0038();
	}

	/**
	* Returns the xmy0039 of this vr technical spec_xmy part2.
	*
	* @return the xmy0039 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0039() {
		return _vrTechnicalSpec_XMYPart2.getXMY0039();
	}

	/**
	* Returns the xmy0040 of this vr technical spec_xmy part2.
	*
	* @return the xmy0040 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0040() {
		return _vrTechnicalSpec_XMYPart2.getXMY0040();
	}

	/**
	* Returns the xmy0041 of this vr technical spec_xmy part2.
	*
	* @return the xmy0041 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0041() {
		return _vrTechnicalSpec_XMYPart2.getXMY0041();
	}

	/**
	* Returns the xmy0042 of this vr technical spec_xmy part2.
	*
	* @return the xmy0042 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0042() {
		return _vrTechnicalSpec_XMYPart2.getXMY0042();
	}

	/**
	* Returns the xmy0043 of this vr technical spec_xmy part2.
	*
	* @return the xmy0043 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0043() {
		return _vrTechnicalSpec_XMYPart2.getXMY0043();
	}

	/**
	* Returns the xmy0044 of this vr technical spec_xmy part2.
	*
	* @return the xmy0044 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0044() {
		return _vrTechnicalSpec_XMYPart2.getXMY0044();
	}

	/**
	* Returns the xmy0045 of this vr technical spec_xmy part2.
	*
	* @return the xmy0045 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0045() {
		return _vrTechnicalSpec_XMYPart2.getXMY0045();
	}

	/**
	* Returns the xmy0046 of this vr technical spec_xmy part2.
	*
	* @return the xmy0046 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0046() {
		return _vrTechnicalSpec_XMYPart2.getXMY0046();
	}

	/**
	* Returns the xmy0048 of this vr technical spec_xmy part2.
	*
	* @return the xmy0048 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0048() {
		return _vrTechnicalSpec_XMYPart2.getXMY0048();
	}

	/**
	* Returns the xmy0049 of this vr technical spec_xmy part2.
	*
	* @return the xmy0049 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0049() {
		return _vrTechnicalSpec_XMYPart2.getXMY0049();
	}

	/**
	* Returns the xmy0050 of this vr technical spec_xmy part2.
	*
	* @return the xmy0050 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0050() {
		return _vrTechnicalSpec_XMYPart2.getXMY0050();
	}

	/**
	* Returns the xmy0051 of this vr technical spec_xmy part2.
	*
	* @return the xmy0051 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0051() {
		return _vrTechnicalSpec_XMYPart2.getXMY0051();
	}

	/**
	* Returns the xmy0052 of this vr technical spec_xmy part2.
	*
	* @return the xmy0052 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0052() {
		return _vrTechnicalSpec_XMYPart2.getXMY0052();
	}

	/**
	* Returns the xmy0053 of this vr technical spec_xmy part2.
	*
	* @return the xmy0053 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0053() {
		return _vrTechnicalSpec_XMYPart2.getXMY0053();
	}

	/**
	* Returns the xmy0054 of this vr technical spec_xmy part2.
	*
	* @return the xmy0054 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0054() {
		return _vrTechnicalSpec_XMYPart2.getXMY0054();
	}

	/**
	* Returns the xmy0055 of this vr technical spec_xmy part2.
	*
	* @return the xmy0055 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0055() {
		return _vrTechnicalSpec_XMYPart2.getXMY0055();
	}

	/**
	* Returns the xmy0056 of this vr technical spec_xmy part2.
	*
	* @return the xmy0056 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0056() {
		return _vrTechnicalSpec_XMYPart2.getXMY0056();
	}

	/**
	* Returns the xmy0057 of this vr technical spec_xmy part2.
	*
	* @return the xmy0057 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0057() {
		return _vrTechnicalSpec_XMYPart2.getXMY0057();
	}

	/**
	* Returns the xmy0058 of this vr technical spec_xmy part2.
	*
	* @return the xmy0058 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0058() {
		return _vrTechnicalSpec_XMYPart2.getXMY0058();
	}

	/**
	* Returns the xmy0059 of this vr technical spec_xmy part2.
	*
	* @return the xmy0059 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0059() {
		return _vrTechnicalSpec_XMYPart2.getXMY0059();
	}

	/**
	* Returns the xmy0060 of this vr technical spec_xmy part2.
	*
	* @return the xmy0060 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0060() {
		return _vrTechnicalSpec_XMYPart2.getXMY0060();
	}

	/**
	* Returns the xmy0061 of this vr technical spec_xmy part2.
	*
	* @return the xmy0061 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0061() {
		return _vrTechnicalSpec_XMYPart2.getXMY0061();
	}

	/**
	* Returns the xmy0062 of this vr technical spec_xmy part2.
	*
	* @return the xmy0062 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0062() {
		return _vrTechnicalSpec_XMYPart2.getXMY0062();
	}

	/**
	* Returns the xmy0063 of this vr technical spec_xmy part2.
	*
	* @return the xmy0063 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0063() {
		return _vrTechnicalSpec_XMYPart2.getXMY0063();
	}

	/**
	* Returns the xmy0064 of this vr technical spec_xmy part2.
	*
	* @return the xmy0064 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0064() {
		return _vrTechnicalSpec_XMYPart2.getXMY0064();
	}

	/**
	* Returns the xmy0065 of this vr technical spec_xmy part2.
	*
	* @return the xmy0065 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0065() {
		return _vrTechnicalSpec_XMYPart2.getXMY0065();
	}

	/**
	* Returns the xmy0066 of this vr technical spec_xmy part2.
	*
	* @return the xmy0066 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0066() {
		return _vrTechnicalSpec_XMYPart2.getXMY0066();
	}

	/**
	* Returns the xmy0067 of this vr technical spec_xmy part2.
	*
	* @return the xmy0067 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0067() {
		return _vrTechnicalSpec_XMYPart2.getXMY0067();
	}

	/**
	* Returns the xmy0068 of this vr technical spec_xmy part2.
	*
	* @return the xmy0068 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0068() {
		return _vrTechnicalSpec_XMYPart2.getXMY0068();
	}

	/**
	* Returns the xmy0070 of this vr technical spec_xmy part2.
	*
	* @return the xmy0070 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0070() {
		return _vrTechnicalSpec_XMYPart2.getXMY0070();
	}

	/**
	* Returns the xmy0071 of this vr technical spec_xmy part2.
	*
	* @return the xmy0071 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0071() {
		return _vrTechnicalSpec_XMYPart2.getXMY0071();
	}

	/**
	* Returns the xmy0072 of this vr technical spec_xmy part2.
	*
	* @return the xmy0072 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0072() {
		return _vrTechnicalSpec_XMYPart2.getXMY0072();
	}

	/**
	* Returns the xmy0073 of this vr technical spec_xmy part2.
	*
	* @return the xmy0073 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0073() {
		return _vrTechnicalSpec_XMYPart2.getXMY0073();
	}

	/**
	* Returns the xmy0074 of this vr technical spec_xmy part2.
	*
	* @return the xmy0074 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0074() {
		return _vrTechnicalSpec_XMYPart2.getXMY0074();
	}

	/**
	* Returns the xmy0075 of this vr technical spec_xmy part2.
	*
	* @return the xmy0075 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0075() {
		return _vrTechnicalSpec_XMYPart2.getXMY0075();
	}

	/**
	* Returns the xmy0076 of this vr technical spec_xmy part2.
	*
	* @return the xmy0076 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0076() {
		return _vrTechnicalSpec_XMYPart2.getXMY0076();
	}

	/**
	* Returns the xmy0077 of this vr technical spec_xmy part2.
	*
	* @return the xmy0077 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0077() {
		return _vrTechnicalSpec_XMYPart2.getXMY0077();
	}

	/**
	* Returns the xmy0078 of this vr technical spec_xmy part2.
	*
	* @return the xmy0078 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0078() {
		return _vrTechnicalSpec_XMYPart2.getXMY0078();
	}

	/**
	* Returns the xmy0079 of this vr technical spec_xmy part2.
	*
	* @return the xmy0079 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0079() {
		return _vrTechnicalSpec_XMYPart2.getXMY0079();
	}

	/**
	* Returns the xmy0080 of this vr technical spec_xmy part2.
	*
	* @return the xmy0080 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0080() {
		return _vrTechnicalSpec_XMYPart2.getXMY0080();
	}

	/**
	* Returns the xmy0081 of this vr technical spec_xmy part2.
	*
	* @return the xmy0081 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0081() {
		return _vrTechnicalSpec_XMYPart2.getXMY0081();
	}

	/**
	* Returns the xmy0082 of this vr technical spec_xmy part2.
	*
	* @return the xmy0082 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0082() {
		return _vrTechnicalSpec_XMYPart2.getXMY0082();
	}

	/**
	* Returns the xmy0083 of this vr technical spec_xmy part2.
	*
	* @return the xmy0083 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0083() {
		return _vrTechnicalSpec_XMYPart2.getXMY0083();
	}

	/**
	* Returns the xmy0084 of this vr technical spec_xmy part2.
	*
	* @return the xmy0084 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0084() {
		return _vrTechnicalSpec_XMYPart2.getXMY0084();
	}

	/**
	* Returns the xmy0085 of this vr technical spec_xmy part2.
	*
	* @return the xmy0085 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0085() {
		return _vrTechnicalSpec_XMYPart2.getXMY0085();
	}

	/**
	* Returns the xmy0086 of this vr technical spec_xmy part2.
	*
	* @return the xmy0086 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0086() {
		return _vrTechnicalSpec_XMYPart2.getXMY0086();
	}

	/**
	* Returns the xmy0087 of this vr technical spec_xmy part2.
	*
	* @return the xmy0087 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0087() {
		return _vrTechnicalSpec_XMYPart2.getXMY0087();
	}

	/**
	* Returns the xmy0088 of this vr technical spec_xmy part2.
	*
	* @return the xmy0088 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0088() {
		return _vrTechnicalSpec_XMYPart2.getXMY0088();
	}

	/**
	* Returns the xmy0089 of this vr technical spec_xmy part2.
	*
	* @return the xmy0089 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0089() {
		return _vrTechnicalSpec_XMYPart2.getXMY0089();
	}

	/**
	* Returns the xmy0090 of this vr technical spec_xmy part2.
	*
	* @return the xmy0090 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0090() {
		return _vrTechnicalSpec_XMYPart2.getXMY0090();
	}

	/**
	* Returns the xmy0091 of this vr technical spec_xmy part2.
	*
	* @return the xmy0091 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0091() {
		return _vrTechnicalSpec_XMYPart2.getXMY0091();
	}

	/**
	* Returns the xmy0092 of this vr technical spec_xmy part2.
	*
	* @return the xmy0092 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0092() {
		return _vrTechnicalSpec_XMYPart2.getXMY0092();
	}

	/**
	* Returns the xmy0093 of this vr technical spec_xmy part2.
	*
	* @return the xmy0093 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0093() {
		return _vrTechnicalSpec_XMYPart2.getXMY0093();
	}

	/**
	* Returns the xmy0094 of this vr technical spec_xmy part2.
	*
	* @return the xmy0094 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0094() {
		return _vrTechnicalSpec_XMYPart2.getXMY0094();
	}

	/**
	* Returns the xmy0095 of this vr technical spec_xmy part2.
	*
	* @return the xmy0095 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0095() {
		return _vrTechnicalSpec_XMYPart2.getXMY0095();
	}

	/**
	* Returns the xmy0096 of this vr technical spec_xmy part2.
	*
	* @return the xmy0096 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0096() {
		return _vrTechnicalSpec_XMYPart2.getXMY0096();
	}

	/**
	* Returns the xmy0097 of this vr technical spec_xmy part2.
	*
	* @return the xmy0097 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0097() {
		return _vrTechnicalSpec_XMYPart2.getXMY0097();
	}

	/**
	* Returns the xmy0098 of this vr technical spec_xmy part2.
	*
	* @return the xmy0098 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0098() {
		return _vrTechnicalSpec_XMYPart2.getXMY0098();
	}

	/**
	* Returns the xmy0099 of this vr technical spec_xmy part2.
	*
	* @return the xmy0099 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0099() {
		return _vrTechnicalSpec_XMYPart2.getXMY0099();
	}

	/**
	* Returns the xmy0100 of this vr technical spec_xmy part2.
	*
	* @return the xmy0100 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0100() {
		return _vrTechnicalSpec_XMYPart2.getXMY0100();
	}

	/**
	* Returns the xmy0101 of this vr technical spec_xmy part2.
	*
	* @return the xmy0101 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0101() {
		return _vrTechnicalSpec_XMYPart2.getXMY0101();
	}

	/**
	* Returns the xmy0102 of this vr technical spec_xmy part2.
	*
	* @return the xmy0102 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0102() {
		return _vrTechnicalSpec_XMYPart2.getXMY0102();
	}

	/**
	* Returns the xmy0103 of this vr technical spec_xmy part2.
	*
	* @return the xmy0103 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0103() {
		return _vrTechnicalSpec_XMYPart2.getXMY0103();
	}

	/**
	* Returns the xmy0104 of this vr technical spec_xmy part2.
	*
	* @return the xmy0104 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0104() {
		return _vrTechnicalSpec_XMYPart2.getXMY0104();
	}

	/**
	* Returns the xmy0105 of this vr technical spec_xmy part2.
	*
	* @return the xmy0105 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0105() {
		return _vrTechnicalSpec_XMYPart2.getXMY0105();
	}

	/**
	* Returns the xmy0106 of this vr technical spec_xmy part2.
	*
	* @return the xmy0106 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0106() {
		return _vrTechnicalSpec_XMYPart2.getXMY0106();
	}

	/**
	* Returns the xmy0107 of this vr technical spec_xmy part2.
	*
	* @return the xmy0107 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0107() {
		return _vrTechnicalSpec_XMYPart2.getXMY0107();
	}

	/**
	* Returns the xmy0108 of this vr technical spec_xmy part2.
	*
	* @return the xmy0108 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0108() {
		return _vrTechnicalSpec_XMYPart2.getXMY0108();
	}

	/**
	* Returns the xmy0109 of this vr technical spec_xmy part2.
	*
	* @return the xmy0109 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0109() {
		return _vrTechnicalSpec_XMYPart2.getXMY0109();
	}

	/**
	* Returns the xmy0110 of this vr technical spec_xmy part2.
	*
	* @return the xmy0110 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0110() {
		return _vrTechnicalSpec_XMYPart2.getXMY0110();
	}

	/**
	* Returns the xmy0111 of this vr technical spec_xmy part2.
	*
	* @return the xmy0111 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0111() {
		return _vrTechnicalSpec_XMYPart2.getXMY0111();
	}

	/**
	* Returns the xmy0112 of this vr technical spec_xmy part2.
	*
	* @return the xmy0112 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0112() {
		return _vrTechnicalSpec_XMYPart2.getXMY0112();
	}

	/**
	* Returns the xmy0113 of this vr technical spec_xmy part2.
	*
	* @return the xmy0113 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0113() {
		return _vrTechnicalSpec_XMYPart2.getXMY0113();
	}

	/**
	* Returns the xmy0114 of this vr technical spec_xmy part2.
	*
	* @return the xmy0114 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0114() {
		return _vrTechnicalSpec_XMYPart2.getXMY0114();
	}

	/**
	* Returns the xmy0115 of this vr technical spec_xmy part2.
	*
	* @return the xmy0115 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0115() {
		return _vrTechnicalSpec_XMYPart2.getXMY0115();
	}

	/**
	* Returns the xmy0116 of this vr technical spec_xmy part2.
	*
	* @return the xmy0116 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0116() {
		return _vrTechnicalSpec_XMYPart2.getXMY0116();
	}

	/**
	* Returns the xmy0117 of this vr technical spec_xmy part2.
	*
	* @return the xmy0117 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0117() {
		return _vrTechnicalSpec_XMYPart2.getXMY0117();
	}

	/**
	* Returns the xmy0118 of this vr technical spec_xmy part2.
	*
	* @return the xmy0118 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0118() {
		return _vrTechnicalSpec_XMYPart2.getXMY0118();
	}

	/**
	* Returns the xmy0119 of this vr technical spec_xmy part2.
	*
	* @return the xmy0119 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0119() {
		return _vrTechnicalSpec_XMYPart2.getXMY0119();
	}

	/**
	* Returns the xmy0120 of this vr technical spec_xmy part2.
	*
	* @return the xmy0120 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0120() {
		return _vrTechnicalSpec_XMYPart2.getXMY0120();
	}

	/**
	* Returns the xmy0121 of this vr technical spec_xmy part2.
	*
	* @return the xmy0121 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0121() {
		return _vrTechnicalSpec_XMYPart2.getXMY0121();
	}

	/**
	* Returns the xmy0122 of this vr technical spec_xmy part2.
	*
	* @return the xmy0122 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0122() {
		return _vrTechnicalSpec_XMYPart2.getXMY0122();
	}

	/**
	* Returns the xmy0123 of this vr technical spec_xmy part2.
	*
	* @return the xmy0123 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0123() {
		return _vrTechnicalSpec_XMYPart2.getXMY0123();
	}

	/**
	* Returns the xmy0124 of this vr technical spec_xmy part2.
	*
	* @return the xmy0124 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0124() {
		return _vrTechnicalSpec_XMYPart2.getXMY0124();
	}

	/**
	* Returns the xmy0125 of this vr technical spec_xmy part2.
	*
	* @return the xmy0125 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0125() {
		return _vrTechnicalSpec_XMYPart2.getXMY0125();
	}

	/**
	* Returns the xmy0126 of this vr technical spec_xmy part2.
	*
	* @return the xmy0126 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0126() {
		return _vrTechnicalSpec_XMYPart2.getXMY0126();
	}

	/**
	* Returns the xmy0127 of this vr technical spec_xmy part2.
	*
	* @return the xmy0127 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0127() {
		return _vrTechnicalSpec_XMYPart2.getXMY0127();
	}

	/**
	* Returns the xmy0128 of this vr technical spec_xmy part2.
	*
	* @return the xmy0128 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0128() {
		return _vrTechnicalSpec_XMYPart2.getXMY0128();
	}

	/**
	* Returns the xmy0129 of this vr technical spec_xmy part2.
	*
	* @return the xmy0129 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0129() {
		return _vrTechnicalSpec_XMYPart2.getXMY0129();
	}

	/**
	* Returns the xmy0130 of this vr technical spec_xmy part2.
	*
	* @return the xmy0130 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0130() {
		return _vrTechnicalSpec_XMYPart2.getXMY0130();
	}

	/**
	* Returns the xmy0131 of this vr technical spec_xmy part2.
	*
	* @return the xmy0131 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0131() {
		return _vrTechnicalSpec_XMYPart2.getXMY0131();
	}

	/**
	* Returns the xmy0132 of this vr technical spec_xmy part2.
	*
	* @return the xmy0132 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0132() {
		return _vrTechnicalSpec_XMYPart2.getXMY0132();
	}

	/**
	* Returns the xmy0133 of this vr technical spec_xmy part2.
	*
	* @return the xmy0133 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0133() {
		return _vrTechnicalSpec_XMYPart2.getXMY0133();
	}

	/**
	* Returns the xmy0134 of this vr technical spec_xmy part2.
	*
	* @return the xmy0134 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0134() {
		return _vrTechnicalSpec_XMYPart2.getXMY0134();
	}

	/**
	* Returns the xmy0135 of this vr technical spec_xmy part2.
	*
	* @return the xmy0135 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0135() {
		return _vrTechnicalSpec_XMYPart2.getXMY0135();
	}

	/**
	* Returns the xmy0136 of this vr technical spec_xmy part2.
	*
	* @return the xmy0136 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0136() {
		return _vrTechnicalSpec_XMYPart2.getXMY0136();
	}

	/**
	* Returns the xmy0137 of this vr technical spec_xmy part2.
	*
	* @return the xmy0137 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0137() {
		return _vrTechnicalSpec_XMYPart2.getXMY0137();
	}

	/**
	* Returns the xmy0138 of this vr technical spec_xmy part2.
	*
	* @return the xmy0138 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0138() {
		return _vrTechnicalSpec_XMYPart2.getXMY0138();
	}

	/**
	* Returns the xmy0139 of this vr technical spec_xmy part2.
	*
	* @return the xmy0139 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0139() {
		return _vrTechnicalSpec_XMYPart2.getXMY0139();
	}

	/**
	* Returns the xmy0140 of this vr technical spec_xmy part2.
	*
	* @return the xmy0140 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0140() {
		return _vrTechnicalSpec_XMYPart2.getXMY0140();
	}

	/**
	* Returns the xmy0141 of this vr technical spec_xmy part2.
	*
	* @return the xmy0141 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0141() {
		return _vrTechnicalSpec_XMYPart2.getXMY0141();
	}

	/**
	* Returns the xmy0142 of this vr technical spec_xmy part2.
	*
	* @return the xmy0142 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0142() {
		return _vrTechnicalSpec_XMYPart2.getXMY0142();
	}

	/**
	* Returns the xmy0143 of this vr technical spec_xmy part2.
	*
	* @return the xmy0143 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0143() {
		return _vrTechnicalSpec_XMYPart2.getXMY0143();
	}

	/**
	* Returns the xmy0144 of this vr technical spec_xmy part2.
	*
	* @return the xmy0144 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0144() {
		return _vrTechnicalSpec_XMYPart2.getXMY0144();
	}

	/**
	* Returns the xmy0145 of this vr technical spec_xmy part2.
	*
	* @return the xmy0145 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0145() {
		return _vrTechnicalSpec_XMYPart2.getXMY0145();
	}

	/**
	* Returns the xmy0146 of this vr technical spec_xmy part2.
	*
	* @return the xmy0146 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0146() {
		return _vrTechnicalSpec_XMYPart2.getXMY0146();
	}

	/**
	* Returns the xmy0147 of this vr technical spec_xmy part2.
	*
	* @return the xmy0147 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0147() {
		return _vrTechnicalSpec_XMYPart2.getXMY0147();
	}

	/**
	* Returns the xmy0148 of this vr technical spec_xmy part2.
	*
	* @return the xmy0148 of this vr technical spec_xmy part2
	*/
	@Override
	public java.lang.String getXMY0148() {
		return _vrTechnicalSpec_XMYPart2.getXMY0148();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XMYPart2.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XMYPart2.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xmy part2.
	*
	* @return the modify date of this vr technical spec_xmy part2
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XMYPart2.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xmy part2.
	*
	* @return the sync date of this vr technical spec_xmy part2
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XMYPart2.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xmy part2.
	*
	* @return the convert assemble ID of this vr technical spec_xmy part2
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XMYPart2.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xmy part2.
	*
	* @return the dossier ID of this vr technical spec_xmy part2
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XMYPart2.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xmy part2.
	*
	* @return the ID of this vr technical spec_xmy part2
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XMYPart2.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xmy part2.
	*
	* @return the mt core of this vr technical spec_xmy part2
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XMYPart2.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xmy part2.
	*
	* @return the primary key of this vr technical spec_xmy part2
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XMYPart2.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xmy part2.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xmy part2
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XMYPart2.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XMYPart2.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XMYPart2.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xmy part2.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xmy part2
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XMYPart2.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xmy part2.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xmy part2
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XMYPart2.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xmy part2.
	*
	* @param dossierId the dossier ID of this vr technical spec_xmy part2
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XMYPart2.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xmy part2.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xmy part2
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XMYPart2.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xmy part2.
	*
	* @param dossierNo the dossier no of this vr technical spec_xmy part2
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XMYPart2.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XMYPart2.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XMYPart2.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XMYPart2.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xmy part2.
	*
	* @param id the ID of this vr technical spec_xmy part2
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XMYPart2.setId(id);
	}

	/**
	* Sets the modify date of this vr technical spec_xmy part2.
	*
	* @param modifyDate the modify date of this vr technical spec_xmy part2
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XMYPart2.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xmy part2.
	*
	* @param mtCore the mt core of this vr technical spec_xmy part2
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XMYPart2.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XMYPart2.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xmy part2.
	*
	* @param primaryKey the primary key of this vr technical spec_xmy part2
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XMYPart2.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XMYPart2.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xmy part2.
	*
	* @param referenceUid the reference uid of this vr technical spec_xmy part2
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XMYPart2.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xmy part2.
	*
	* @param syncDate the sync date of this vr technical spec_xmy part2
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XMYPart2.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xmy part2.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xmy part2
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XMYPart2.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xmy0010 of this vr technical spec_xmy part2.
	*
	* @param XMY0010 the xmy0010 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0010(java.lang.String XMY0010) {
		_vrTechnicalSpec_XMYPart2.setXMY0010(XMY0010);
	}

	/**
	* Sets the xmy0011 of this vr technical spec_xmy part2.
	*
	* @param XMY0011 the xmy0011 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0011(java.lang.String XMY0011) {
		_vrTechnicalSpec_XMYPart2.setXMY0011(XMY0011);
	}

	/**
	* Sets the xmy0012 of this vr technical spec_xmy part2.
	*
	* @param XMY0012 the xmy0012 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0012(java.lang.String XMY0012) {
		_vrTechnicalSpec_XMYPart2.setXMY0012(XMY0012);
	}

	/**
	* Sets the xmy0013 of this vr technical spec_xmy part2.
	*
	* @param XMY0013 the xmy0013 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0013(java.lang.String XMY0013) {
		_vrTechnicalSpec_XMYPart2.setXMY0013(XMY0013);
	}

	/**
	* Sets the xmy0014 of this vr technical spec_xmy part2.
	*
	* @param XMY0014 the xmy0014 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0014(java.lang.String XMY0014) {
		_vrTechnicalSpec_XMYPart2.setXMY0014(XMY0014);
	}

	/**
	* Sets the xmy0015 of this vr technical spec_xmy part2.
	*
	* @param XMY0015 the xmy0015 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0015(java.lang.String XMY0015) {
		_vrTechnicalSpec_XMYPart2.setXMY0015(XMY0015);
	}

	/**
	* Sets the xmy0016 of this vr technical spec_xmy part2.
	*
	* @param XMY0016 the xmy0016 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0016(java.lang.String XMY0016) {
		_vrTechnicalSpec_XMYPart2.setXMY0016(XMY0016);
	}

	/**
	* Sets the xmy0017 of this vr technical spec_xmy part2.
	*
	* @param XMY0017 the xmy0017 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0017(java.lang.String XMY0017) {
		_vrTechnicalSpec_XMYPart2.setXMY0017(XMY0017);
	}

	/**
	* Sets the xmy0018 of this vr technical spec_xmy part2.
	*
	* @param XMY0018 the xmy0018 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0018(java.lang.String XMY0018) {
		_vrTechnicalSpec_XMYPart2.setXMY0018(XMY0018);
	}

	/**
	* Sets the xmy0019 of this vr technical spec_xmy part2.
	*
	* @param XMY0019 the xmy0019 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0019(java.lang.String XMY0019) {
		_vrTechnicalSpec_XMYPart2.setXMY0019(XMY0019);
	}

	/**
	* Sets the xmy0020 of this vr technical spec_xmy part2.
	*
	* @param XMY0020 the xmy0020 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0020(java.lang.String XMY0020) {
		_vrTechnicalSpec_XMYPart2.setXMY0020(XMY0020);
	}

	/**
	* Sets the xmy0021 of this vr technical spec_xmy part2.
	*
	* @param XMY0021 the xmy0021 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0021(java.lang.String XMY0021) {
		_vrTechnicalSpec_XMYPart2.setXMY0021(XMY0021);
	}

	/**
	* Sets the xmy0022 of this vr technical spec_xmy part2.
	*
	* @param XMY0022 the xmy0022 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0022(java.lang.String XMY0022) {
		_vrTechnicalSpec_XMYPart2.setXMY0022(XMY0022);
	}

	/**
	* Sets the xmy0023 of this vr technical spec_xmy part2.
	*
	* @param XMY0023 the xmy0023 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0023(java.lang.String XMY0023) {
		_vrTechnicalSpec_XMYPart2.setXMY0023(XMY0023);
	}

	/**
	* Sets the xmy0024 of this vr technical spec_xmy part2.
	*
	* @param XMY0024 the xmy0024 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0024(java.lang.String XMY0024) {
		_vrTechnicalSpec_XMYPart2.setXMY0024(XMY0024);
	}

	/**
	* Sets the xmy0025 of this vr technical spec_xmy part2.
	*
	* @param XMY0025 the xmy0025 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0025(java.lang.String XMY0025) {
		_vrTechnicalSpec_XMYPart2.setXMY0025(XMY0025);
	}

	/**
	* Sets the xmy0026 of this vr technical spec_xmy part2.
	*
	* @param XMY0026 the xmy0026 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0026(java.lang.String XMY0026) {
		_vrTechnicalSpec_XMYPart2.setXMY0026(XMY0026);
	}

	/**
	* Sets the xmy0027 of this vr technical spec_xmy part2.
	*
	* @param XMY0027 the xmy0027 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0027(java.lang.String XMY0027) {
		_vrTechnicalSpec_XMYPart2.setXMY0027(XMY0027);
	}

	/**
	* Sets the xmy0028 of this vr technical spec_xmy part2.
	*
	* @param XMY0028 the xmy0028 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0028(java.lang.String XMY0028) {
		_vrTechnicalSpec_XMYPart2.setXMY0028(XMY0028);
	}

	/**
	* Sets the xmy0029 of this vr technical spec_xmy part2.
	*
	* @param XMY0029 the xmy0029 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0029(java.lang.String XMY0029) {
		_vrTechnicalSpec_XMYPart2.setXMY0029(XMY0029);
	}

	/**
	* Sets the xmy0030 of this vr technical spec_xmy part2.
	*
	* @param XMY0030 the xmy0030 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0030(java.lang.String XMY0030) {
		_vrTechnicalSpec_XMYPart2.setXMY0030(XMY0030);
	}

	/**
	* Sets the xmy0031 of this vr technical spec_xmy part2.
	*
	* @param XMY0031 the xmy0031 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0031(java.lang.String XMY0031) {
		_vrTechnicalSpec_XMYPart2.setXMY0031(XMY0031);
	}

	/**
	* Sets the xmy0032 of this vr technical spec_xmy part2.
	*
	* @param XMY0032 the xmy0032 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0032(java.lang.String XMY0032) {
		_vrTechnicalSpec_XMYPart2.setXMY0032(XMY0032);
	}

	/**
	* Sets the xmy0033 of this vr technical spec_xmy part2.
	*
	* @param XMY0033 the xmy0033 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0033(java.lang.String XMY0033) {
		_vrTechnicalSpec_XMYPart2.setXMY0033(XMY0033);
	}

	/**
	* Sets the xmy0034 of this vr technical spec_xmy part2.
	*
	* @param XMY0034 the xmy0034 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0034(java.lang.String XMY0034) {
		_vrTechnicalSpec_XMYPart2.setXMY0034(XMY0034);
	}

	/**
	* Sets the xmy0036 of this vr technical spec_xmy part2.
	*
	* @param XMY0036 the xmy0036 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0036(java.lang.String XMY0036) {
		_vrTechnicalSpec_XMYPart2.setXMY0036(XMY0036);
	}

	/**
	* Sets the xmy0037 of this vr technical spec_xmy part2.
	*
	* @param XMY0037 the xmy0037 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0037(java.lang.String XMY0037) {
		_vrTechnicalSpec_XMYPart2.setXMY0037(XMY0037);
	}

	/**
	* Sets the xmy0038 of this vr technical spec_xmy part2.
	*
	* @param XMY0038 the xmy0038 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0038(java.lang.String XMY0038) {
		_vrTechnicalSpec_XMYPart2.setXMY0038(XMY0038);
	}

	/**
	* Sets the xmy0039 of this vr technical spec_xmy part2.
	*
	* @param XMY0039 the xmy0039 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0039(java.lang.String XMY0039) {
		_vrTechnicalSpec_XMYPart2.setXMY0039(XMY0039);
	}

	/**
	* Sets the xmy0040 of this vr technical spec_xmy part2.
	*
	* @param XMY0040 the xmy0040 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0040(java.lang.String XMY0040) {
		_vrTechnicalSpec_XMYPart2.setXMY0040(XMY0040);
	}

	/**
	* Sets the xmy0041 of this vr technical spec_xmy part2.
	*
	* @param XMY0041 the xmy0041 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0041(java.lang.String XMY0041) {
		_vrTechnicalSpec_XMYPart2.setXMY0041(XMY0041);
	}

	/**
	* Sets the xmy0042 of this vr technical spec_xmy part2.
	*
	* @param XMY0042 the xmy0042 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0042(java.lang.String XMY0042) {
		_vrTechnicalSpec_XMYPart2.setXMY0042(XMY0042);
	}

	/**
	* Sets the xmy0043 of this vr technical spec_xmy part2.
	*
	* @param XMY0043 the xmy0043 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0043(java.lang.String XMY0043) {
		_vrTechnicalSpec_XMYPart2.setXMY0043(XMY0043);
	}

	/**
	* Sets the xmy0044 of this vr technical spec_xmy part2.
	*
	* @param XMY0044 the xmy0044 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0044(java.lang.String XMY0044) {
		_vrTechnicalSpec_XMYPart2.setXMY0044(XMY0044);
	}

	/**
	* Sets the xmy0045 of this vr technical spec_xmy part2.
	*
	* @param XMY0045 the xmy0045 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0045(java.lang.String XMY0045) {
		_vrTechnicalSpec_XMYPart2.setXMY0045(XMY0045);
	}

	/**
	* Sets the xmy0046 of this vr technical spec_xmy part2.
	*
	* @param XMY0046 the xmy0046 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0046(java.lang.String XMY0046) {
		_vrTechnicalSpec_XMYPart2.setXMY0046(XMY0046);
	}

	/**
	* Sets the xmy0048 of this vr technical spec_xmy part2.
	*
	* @param XMY0048 the xmy0048 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0048(java.lang.String XMY0048) {
		_vrTechnicalSpec_XMYPart2.setXMY0048(XMY0048);
	}

	/**
	* Sets the xmy0049 of this vr technical spec_xmy part2.
	*
	* @param XMY0049 the xmy0049 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0049(java.lang.String XMY0049) {
		_vrTechnicalSpec_XMYPart2.setXMY0049(XMY0049);
	}

	/**
	* Sets the xmy0050 of this vr technical spec_xmy part2.
	*
	* @param XMY0050 the xmy0050 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0050(java.lang.String XMY0050) {
		_vrTechnicalSpec_XMYPart2.setXMY0050(XMY0050);
	}

	/**
	* Sets the xmy0051 of this vr technical spec_xmy part2.
	*
	* @param XMY0051 the xmy0051 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0051(java.lang.String XMY0051) {
		_vrTechnicalSpec_XMYPart2.setXMY0051(XMY0051);
	}

	/**
	* Sets the xmy0052 of this vr technical spec_xmy part2.
	*
	* @param XMY0052 the xmy0052 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0052(java.lang.String XMY0052) {
		_vrTechnicalSpec_XMYPart2.setXMY0052(XMY0052);
	}

	/**
	* Sets the xmy0053 of this vr technical spec_xmy part2.
	*
	* @param XMY0053 the xmy0053 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0053(java.lang.String XMY0053) {
		_vrTechnicalSpec_XMYPart2.setXMY0053(XMY0053);
	}

	/**
	* Sets the xmy0054 of this vr technical spec_xmy part2.
	*
	* @param XMY0054 the xmy0054 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0054(java.lang.String XMY0054) {
		_vrTechnicalSpec_XMYPart2.setXMY0054(XMY0054);
	}

	/**
	* Sets the xmy0055 of this vr technical spec_xmy part2.
	*
	* @param XMY0055 the xmy0055 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0055(java.lang.String XMY0055) {
		_vrTechnicalSpec_XMYPart2.setXMY0055(XMY0055);
	}

	/**
	* Sets the xmy0056 of this vr technical spec_xmy part2.
	*
	* @param XMY0056 the xmy0056 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0056(java.lang.String XMY0056) {
		_vrTechnicalSpec_XMYPart2.setXMY0056(XMY0056);
	}

	/**
	* Sets the xmy0057 of this vr technical spec_xmy part2.
	*
	* @param XMY0057 the xmy0057 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0057(java.lang.String XMY0057) {
		_vrTechnicalSpec_XMYPart2.setXMY0057(XMY0057);
	}

	/**
	* Sets the xmy0058 of this vr technical spec_xmy part2.
	*
	* @param XMY0058 the xmy0058 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0058(java.lang.String XMY0058) {
		_vrTechnicalSpec_XMYPart2.setXMY0058(XMY0058);
	}

	/**
	* Sets the xmy0059 of this vr technical spec_xmy part2.
	*
	* @param XMY0059 the xmy0059 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0059(java.lang.String XMY0059) {
		_vrTechnicalSpec_XMYPart2.setXMY0059(XMY0059);
	}

	/**
	* Sets the xmy0060 of this vr technical spec_xmy part2.
	*
	* @param XMY0060 the xmy0060 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0060(java.lang.String XMY0060) {
		_vrTechnicalSpec_XMYPart2.setXMY0060(XMY0060);
	}

	/**
	* Sets the xmy0061 of this vr technical spec_xmy part2.
	*
	* @param XMY0061 the xmy0061 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0061(java.lang.String XMY0061) {
		_vrTechnicalSpec_XMYPart2.setXMY0061(XMY0061);
	}

	/**
	* Sets the xmy0062 of this vr technical spec_xmy part2.
	*
	* @param XMY0062 the xmy0062 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0062(java.lang.String XMY0062) {
		_vrTechnicalSpec_XMYPart2.setXMY0062(XMY0062);
	}

	/**
	* Sets the xmy0063 of this vr technical spec_xmy part2.
	*
	* @param XMY0063 the xmy0063 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0063(java.lang.String XMY0063) {
		_vrTechnicalSpec_XMYPart2.setXMY0063(XMY0063);
	}

	/**
	* Sets the xmy0064 of this vr technical spec_xmy part2.
	*
	* @param XMY0064 the xmy0064 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0064(java.lang.String XMY0064) {
		_vrTechnicalSpec_XMYPart2.setXMY0064(XMY0064);
	}

	/**
	* Sets the xmy0065 of this vr technical spec_xmy part2.
	*
	* @param XMY0065 the xmy0065 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0065(java.lang.String XMY0065) {
		_vrTechnicalSpec_XMYPart2.setXMY0065(XMY0065);
	}

	/**
	* Sets the xmy0066 of this vr technical spec_xmy part2.
	*
	* @param XMY0066 the xmy0066 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0066(java.lang.String XMY0066) {
		_vrTechnicalSpec_XMYPart2.setXMY0066(XMY0066);
	}

	/**
	* Sets the xmy0067 of this vr technical spec_xmy part2.
	*
	* @param XMY0067 the xmy0067 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0067(java.lang.String XMY0067) {
		_vrTechnicalSpec_XMYPart2.setXMY0067(XMY0067);
	}

	/**
	* Sets the xmy0068 of this vr technical spec_xmy part2.
	*
	* @param XMY0068 the xmy0068 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0068(java.lang.String XMY0068) {
		_vrTechnicalSpec_XMYPart2.setXMY0068(XMY0068);
	}

	/**
	* Sets the xmy0070 of this vr technical spec_xmy part2.
	*
	* @param XMY0070 the xmy0070 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0070(java.lang.String XMY0070) {
		_vrTechnicalSpec_XMYPart2.setXMY0070(XMY0070);
	}

	/**
	* Sets the xmy0071 of this vr technical spec_xmy part2.
	*
	* @param XMY0071 the xmy0071 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0071(java.lang.String XMY0071) {
		_vrTechnicalSpec_XMYPart2.setXMY0071(XMY0071);
	}

	/**
	* Sets the xmy0072 of this vr technical spec_xmy part2.
	*
	* @param XMY0072 the xmy0072 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0072(java.lang.String XMY0072) {
		_vrTechnicalSpec_XMYPart2.setXMY0072(XMY0072);
	}

	/**
	* Sets the xmy0073 of this vr technical spec_xmy part2.
	*
	* @param XMY0073 the xmy0073 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0073(java.lang.String XMY0073) {
		_vrTechnicalSpec_XMYPart2.setXMY0073(XMY0073);
	}

	/**
	* Sets the xmy0074 of this vr technical spec_xmy part2.
	*
	* @param XMY0074 the xmy0074 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0074(java.lang.String XMY0074) {
		_vrTechnicalSpec_XMYPart2.setXMY0074(XMY0074);
	}

	/**
	* Sets the xmy0075 of this vr technical spec_xmy part2.
	*
	* @param XMY0075 the xmy0075 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0075(java.lang.String XMY0075) {
		_vrTechnicalSpec_XMYPart2.setXMY0075(XMY0075);
	}

	/**
	* Sets the xmy0076 of this vr technical spec_xmy part2.
	*
	* @param XMY0076 the xmy0076 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0076(java.lang.String XMY0076) {
		_vrTechnicalSpec_XMYPart2.setXMY0076(XMY0076);
	}

	/**
	* Sets the xmy0077 of this vr technical spec_xmy part2.
	*
	* @param XMY0077 the xmy0077 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0077(java.lang.String XMY0077) {
		_vrTechnicalSpec_XMYPart2.setXMY0077(XMY0077);
	}

	/**
	* Sets the xmy0078 of this vr technical spec_xmy part2.
	*
	* @param XMY0078 the xmy0078 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0078(java.lang.String XMY0078) {
		_vrTechnicalSpec_XMYPart2.setXMY0078(XMY0078);
	}

	/**
	* Sets the xmy0079 of this vr technical spec_xmy part2.
	*
	* @param XMY0079 the xmy0079 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0079(java.lang.String XMY0079) {
		_vrTechnicalSpec_XMYPart2.setXMY0079(XMY0079);
	}

	/**
	* Sets the xmy0080 of this vr technical spec_xmy part2.
	*
	* @param XMY0080 the xmy0080 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0080(java.lang.String XMY0080) {
		_vrTechnicalSpec_XMYPart2.setXMY0080(XMY0080);
	}

	/**
	* Sets the xmy0081 of this vr technical spec_xmy part2.
	*
	* @param XMY0081 the xmy0081 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0081(java.lang.String XMY0081) {
		_vrTechnicalSpec_XMYPart2.setXMY0081(XMY0081);
	}

	/**
	* Sets the xmy0082 of this vr technical spec_xmy part2.
	*
	* @param XMY0082 the xmy0082 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0082(java.lang.String XMY0082) {
		_vrTechnicalSpec_XMYPart2.setXMY0082(XMY0082);
	}

	/**
	* Sets the xmy0083 of this vr technical spec_xmy part2.
	*
	* @param XMY0083 the xmy0083 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0083(java.lang.String XMY0083) {
		_vrTechnicalSpec_XMYPart2.setXMY0083(XMY0083);
	}

	/**
	* Sets the xmy0084 of this vr technical spec_xmy part2.
	*
	* @param XMY0084 the xmy0084 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0084(java.lang.String XMY0084) {
		_vrTechnicalSpec_XMYPart2.setXMY0084(XMY0084);
	}

	/**
	* Sets the xmy0085 of this vr technical spec_xmy part2.
	*
	* @param XMY0085 the xmy0085 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0085(java.lang.String XMY0085) {
		_vrTechnicalSpec_XMYPart2.setXMY0085(XMY0085);
	}

	/**
	* Sets the xmy0086 of this vr technical spec_xmy part2.
	*
	* @param XMY0086 the xmy0086 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0086(java.lang.String XMY0086) {
		_vrTechnicalSpec_XMYPart2.setXMY0086(XMY0086);
	}

	/**
	* Sets the xmy0087 of this vr technical spec_xmy part2.
	*
	* @param XMY0087 the xmy0087 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0087(java.lang.String XMY0087) {
		_vrTechnicalSpec_XMYPart2.setXMY0087(XMY0087);
	}

	/**
	* Sets the xmy0088 of this vr technical spec_xmy part2.
	*
	* @param XMY0088 the xmy0088 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0088(java.lang.String XMY0088) {
		_vrTechnicalSpec_XMYPart2.setXMY0088(XMY0088);
	}

	/**
	* Sets the xmy0089 of this vr technical spec_xmy part2.
	*
	* @param XMY0089 the xmy0089 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0089(java.lang.String XMY0089) {
		_vrTechnicalSpec_XMYPart2.setXMY0089(XMY0089);
	}

	/**
	* Sets the xmy0090 of this vr technical spec_xmy part2.
	*
	* @param XMY0090 the xmy0090 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0090(java.lang.String XMY0090) {
		_vrTechnicalSpec_XMYPart2.setXMY0090(XMY0090);
	}

	/**
	* Sets the xmy0091 of this vr technical spec_xmy part2.
	*
	* @param XMY0091 the xmy0091 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0091(java.lang.String XMY0091) {
		_vrTechnicalSpec_XMYPart2.setXMY0091(XMY0091);
	}

	/**
	* Sets the xmy0092 of this vr technical spec_xmy part2.
	*
	* @param XMY0092 the xmy0092 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0092(java.lang.String XMY0092) {
		_vrTechnicalSpec_XMYPart2.setXMY0092(XMY0092);
	}

	/**
	* Sets the xmy0093 of this vr technical spec_xmy part2.
	*
	* @param XMY0093 the xmy0093 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0093(java.lang.String XMY0093) {
		_vrTechnicalSpec_XMYPart2.setXMY0093(XMY0093);
	}

	/**
	* Sets the xmy0094 of this vr technical spec_xmy part2.
	*
	* @param XMY0094 the xmy0094 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0094(java.lang.String XMY0094) {
		_vrTechnicalSpec_XMYPart2.setXMY0094(XMY0094);
	}

	/**
	* Sets the xmy0095 of this vr technical spec_xmy part2.
	*
	* @param XMY0095 the xmy0095 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0095(java.lang.String XMY0095) {
		_vrTechnicalSpec_XMYPart2.setXMY0095(XMY0095);
	}

	/**
	* Sets the xmy0096 of this vr technical spec_xmy part2.
	*
	* @param XMY0096 the xmy0096 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0096(java.lang.String XMY0096) {
		_vrTechnicalSpec_XMYPart2.setXMY0096(XMY0096);
	}

	/**
	* Sets the xmy0097 of this vr technical spec_xmy part2.
	*
	* @param XMY0097 the xmy0097 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0097(java.lang.String XMY0097) {
		_vrTechnicalSpec_XMYPart2.setXMY0097(XMY0097);
	}

	/**
	* Sets the xmy0098 of this vr technical spec_xmy part2.
	*
	* @param XMY0098 the xmy0098 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0098(java.lang.String XMY0098) {
		_vrTechnicalSpec_XMYPart2.setXMY0098(XMY0098);
	}

	/**
	* Sets the xmy0099 of this vr technical spec_xmy part2.
	*
	* @param XMY0099 the xmy0099 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0099(java.lang.String XMY0099) {
		_vrTechnicalSpec_XMYPart2.setXMY0099(XMY0099);
	}

	/**
	* Sets the xmy0100 of this vr technical spec_xmy part2.
	*
	* @param XMY0100 the xmy0100 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0100(java.lang.String XMY0100) {
		_vrTechnicalSpec_XMYPart2.setXMY0100(XMY0100);
	}

	/**
	* Sets the xmy0101 of this vr technical spec_xmy part2.
	*
	* @param XMY0101 the xmy0101 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0101(java.lang.String XMY0101) {
		_vrTechnicalSpec_XMYPart2.setXMY0101(XMY0101);
	}

	/**
	* Sets the xmy0102 of this vr technical spec_xmy part2.
	*
	* @param XMY0102 the xmy0102 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0102(java.lang.String XMY0102) {
		_vrTechnicalSpec_XMYPart2.setXMY0102(XMY0102);
	}

	/**
	* Sets the xmy0103 of this vr technical spec_xmy part2.
	*
	* @param XMY0103 the xmy0103 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0103(java.lang.String XMY0103) {
		_vrTechnicalSpec_XMYPart2.setXMY0103(XMY0103);
	}

	/**
	* Sets the xmy0104 of this vr technical spec_xmy part2.
	*
	* @param XMY0104 the xmy0104 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0104(java.lang.String XMY0104) {
		_vrTechnicalSpec_XMYPart2.setXMY0104(XMY0104);
	}

	/**
	* Sets the xmy0105 of this vr technical spec_xmy part2.
	*
	* @param XMY0105 the xmy0105 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0105(java.lang.String XMY0105) {
		_vrTechnicalSpec_XMYPart2.setXMY0105(XMY0105);
	}

	/**
	* Sets the xmy0106 of this vr technical spec_xmy part2.
	*
	* @param XMY0106 the xmy0106 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0106(java.lang.String XMY0106) {
		_vrTechnicalSpec_XMYPart2.setXMY0106(XMY0106);
	}

	/**
	* Sets the xmy0107 of this vr technical spec_xmy part2.
	*
	* @param XMY0107 the xmy0107 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0107(java.lang.String XMY0107) {
		_vrTechnicalSpec_XMYPart2.setXMY0107(XMY0107);
	}

	/**
	* Sets the xmy0108 of this vr technical spec_xmy part2.
	*
	* @param XMY0108 the xmy0108 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0108(java.lang.String XMY0108) {
		_vrTechnicalSpec_XMYPart2.setXMY0108(XMY0108);
	}

	/**
	* Sets the xmy0109 of this vr technical spec_xmy part2.
	*
	* @param XMY0109 the xmy0109 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0109(java.lang.String XMY0109) {
		_vrTechnicalSpec_XMYPart2.setXMY0109(XMY0109);
	}

	/**
	* Sets the xmy0110 of this vr technical spec_xmy part2.
	*
	* @param XMY0110 the xmy0110 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0110(java.lang.String XMY0110) {
		_vrTechnicalSpec_XMYPart2.setXMY0110(XMY0110);
	}

	/**
	* Sets the xmy0111 of this vr technical spec_xmy part2.
	*
	* @param XMY0111 the xmy0111 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0111(java.lang.String XMY0111) {
		_vrTechnicalSpec_XMYPart2.setXMY0111(XMY0111);
	}

	/**
	* Sets the xmy0112 of this vr technical spec_xmy part2.
	*
	* @param XMY0112 the xmy0112 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0112(java.lang.String XMY0112) {
		_vrTechnicalSpec_XMYPart2.setXMY0112(XMY0112);
	}

	/**
	* Sets the xmy0113 of this vr technical spec_xmy part2.
	*
	* @param XMY0113 the xmy0113 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0113(java.lang.String XMY0113) {
		_vrTechnicalSpec_XMYPart2.setXMY0113(XMY0113);
	}

	/**
	* Sets the xmy0114 of this vr technical spec_xmy part2.
	*
	* @param XMY0114 the xmy0114 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0114(java.lang.String XMY0114) {
		_vrTechnicalSpec_XMYPart2.setXMY0114(XMY0114);
	}

	/**
	* Sets the xmy0115 of this vr technical spec_xmy part2.
	*
	* @param XMY0115 the xmy0115 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0115(java.lang.String XMY0115) {
		_vrTechnicalSpec_XMYPart2.setXMY0115(XMY0115);
	}

	/**
	* Sets the xmy0116 of this vr technical spec_xmy part2.
	*
	* @param XMY0116 the xmy0116 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0116(java.lang.String XMY0116) {
		_vrTechnicalSpec_XMYPart2.setXMY0116(XMY0116);
	}

	/**
	* Sets the xmy0117 of this vr technical spec_xmy part2.
	*
	* @param XMY0117 the xmy0117 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0117(java.lang.String XMY0117) {
		_vrTechnicalSpec_XMYPart2.setXMY0117(XMY0117);
	}

	/**
	* Sets the xmy0118 of this vr technical spec_xmy part2.
	*
	* @param XMY0118 the xmy0118 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0118(java.lang.String XMY0118) {
		_vrTechnicalSpec_XMYPart2.setXMY0118(XMY0118);
	}

	/**
	* Sets the xmy0119 of this vr technical spec_xmy part2.
	*
	* @param XMY0119 the xmy0119 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0119(java.lang.String XMY0119) {
		_vrTechnicalSpec_XMYPart2.setXMY0119(XMY0119);
	}

	/**
	* Sets the xmy0120 of this vr technical spec_xmy part2.
	*
	* @param XMY0120 the xmy0120 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0120(java.lang.String XMY0120) {
		_vrTechnicalSpec_XMYPart2.setXMY0120(XMY0120);
	}

	/**
	* Sets the xmy0121 of this vr technical spec_xmy part2.
	*
	* @param XMY0121 the xmy0121 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0121(java.lang.String XMY0121) {
		_vrTechnicalSpec_XMYPart2.setXMY0121(XMY0121);
	}

	/**
	* Sets the xmy0122 of this vr technical spec_xmy part2.
	*
	* @param XMY0122 the xmy0122 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0122(java.lang.String XMY0122) {
		_vrTechnicalSpec_XMYPart2.setXMY0122(XMY0122);
	}

	/**
	* Sets the xmy0123 of this vr technical spec_xmy part2.
	*
	* @param XMY0123 the xmy0123 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0123(java.lang.String XMY0123) {
		_vrTechnicalSpec_XMYPart2.setXMY0123(XMY0123);
	}

	/**
	* Sets the xmy0124 of this vr technical spec_xmy part2.
	*
	* @param XMY0124 the xmy0124 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0124(java.lang.String XMY0124) {
		_vrTechnicalSpec_XMYPart2.setXMY0124(XMY0124);
	}

	/**
	* Sets the xmy0125 of this vr technical spec_xmy part2.
	*
	* @param XMY0125 the xmy0125 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0125(java.lang.String XMY0125) {
		_vrTechnicalSpec_XMYPart2.setXMY0125(XMY0125);
	}

	/**
	* Sets the xmy0126 of this vr technical spec_xmy part2.
	*
	* @param XMY0126 the xmy0126 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0126(java.lang.String XMY0126) {
		_vrTechnicalSpec_XMYPart2.setXMY0126(XMY0126);
	}

	/**
	* Sets the xmy0127 of this vr technical spec_xmy part2.
	*
	* @param XMY0127 the xmy0127 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0127(java.lang.String XMY0127) {
		_vrTechnicalSpec_XMYPart2.setXMY0127(XMY0127);
	}

	/**
	* Sets the xmy0128 of this vr technical spec_xmy part2.
	*
	* @param XMY0128 the xmy0128 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0128(java.lang.String XMY0128) {
		_vrTechnicalSpec_XMYPart2.setXMY0128(XMY0128);
	}

	/**
	* Sets the xmy0129 of this vr technical spec_xmy part2.
	*
	* @param XMY0129 the xmy0129 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0129(java.lang.String XMY0129) {
		_vrTechnicalSpec_XMYPart2.setXMY0129(XMY0129);
	}

	/**
	* Sets the xmy0130 of this vr technical spec_xmy part2.
	*
	* @param XMY0130 the xmy0130 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0130(java.lang.String XMY0130) {
		_vrTechnicalSpec_XMYPart2.setXMY0130(XMY0130);
	}

	/**
	* Sets the xmy0131 of this vr technical spec_xmy part2.
	*
	* @param XMY0131 the xmy0131 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0131(java.lang.String XMY0131) {
		_vrTechnicalSpec_XMYPart2.setXMY0131(XMY0131);
	}

	/**
	* Sets the xmy0132 of this vr technical spec_xmy part2.
	*
	* @param XMY0132 the xmy0132 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0132(java.lang.String XMY0132) {
		_vrTechnicalSpec_XMYPart2.setXMY0132(XMY0132);
	}

	/**
	* Sets the xmy0133 of this vr technical spec_xmy part2.
	*
	* @param XMY0133 the xmy0133 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0133(java.lang.String XMY0133) {
		_vrTechnicalSpec_XMYPart2.setXMY0133(XMY0133);
	}

	/**
	* Sets the xmy0134 of this vr technical spec_xmy part2.
	*
	* @param XMY0134 the xmy0134 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0134(java.lang.String XMY0134) {
		_vrTechnicalSpec_XMYPart2.setXMY0134(XMY0134);
	}

	/**
	* Sets the xmy0135 of this vr technical spec_xmy part2.
	*
	* @param XMY0135 the xmy0135 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0135(java.lang.String XMY0135) {
		_vrTechnicalSpec_XMYPart2.setXMY0135(XMY0135);
	}

	/**
	* Sets the xmy0136 of this vr technical spec_xmy part2.
	*
	* @param XMY0136 the xmy0136 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0136(java.lang.String XMY0136) {
		_vrTechnicalSpec_XMYPart2.setXMY0136(XMY0136);
	}

	/**
	* Sets the xmy0137 of this vr technical spec_xmy part2.
	*
	* @param XMY0137 the xmy0137 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0137(java.lang.String XMY0137) {
		_vrTechnicalSpec_XMYPart2.setXMY0137(XMY0137);
	}

	/**
	* Sets the xmy0138 of this vr technical spec_xmy part2.
	*
	* @param XMY0138 the xmy0138 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0138(java.lang.String XMY0138) {
		_vrTechnicalSpec_XMYPart2.setXMY0138(XMY0138);
	}

	/**
	* Sets the xmy0139 of this vr technical spec_xmy part2.
	*
	* @param XMY0139 the xmy0139 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0139(java.lang.String XMY0139) {
		_vrTechnicalSpec_XMYPart2.setXMY0139(XMY0139);
	}

	/**
	* Sets the xmy0140 of this vr technical spec_xmy part2.
	*
	* @param XMY0140 the xmy0140 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0140(java.lang.String XMY0140) {
		_vrTechnicalSpec_XMYPart2.setXMY0140(XMY0140);
	}

	/**
	* Sets the xmy0141 of this vr technical spec_xmy part2.
	*
	* @param XMY0141 the xmy0141 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0141(java.lang.String XMY0141) {
		_vrTechnicalSpec_XMYPart2.setXMY0141(XMY0141);
	}

	/**
	* Sets the xmy0142 of this vr technical spec_xmy part2.
	*
	* @param XMY0142 the xmy0142 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0142(java.lang.String XMY0142) {
		_vrTechnicalSpec_XMYPart2.setXMY0142(XMY0142);
	}

	/**
	* Sets the xmy0143 of this vr technical spec_xmy part2.
	*
	* @param XMY0143 the xmy0143 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0143(java.lang.String XMY0143) {
		_vrTechnicalSpec_XMYPart2.setXMY0143(XMY0143);
	}

	/**
	* Sets the xmy0144 of this vr technical spec_xmy part2.
	*
	* @param XMY0144 the xmy0144 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0144(java.lang.String XMY0144) {
		_vrTechnicalSpec_XMYPart2.setXMY0144(XMY0144);
	}

	/**
	* Sets the xmy0145 of this vr technical spec_xmy part2.
	*
	* @param XMY0145 the xmy0145 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0145(java.lang.String XMY0145) {
		_vrTechnicalSpec_XMYPart2.setXMY0145(XMY0145);
	}

	/**
	* Sets the xmy0146 of this vr technical spec_xmy part2.
	*
	* @param XMY0146 the xmy0146 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0146(java.lang.String XMY0146) {
		_vrTechnicalSpec_XMYPart2.setXMY0146(XMY0146);
	}

	/**
	* Sets the xmy0147 of this vr technical spec_xmy part2.
	*
	* @param XMY0147 the xmy0147 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0147(java.lang.String XMY0147) {
		_vrTechnicalSpec_XMYPart2.setXMY0147(XMY0147);
	}

	/**
	* Sets the xmy0148 of this vr technical spec_xmy part2.
	*
	* @param XMY0148 the xmy0148 of this vr technical spec_xmy part2
	*/
	@Override
	public void setXMY0148(java.lang.String XMY0148) {
		_vrTechnicalSpec_XMYPart2.setXMY0148(XMY0148);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XMYPart2Wrapper)) {
			return false;
		}

		VRTechnicalSpec_XMYPart2Wrapper vrTechnicalSpec_XMYPart2Wrapper = (VRTechnicalSpec_XMYPart2Wrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XMYPart2,
					vrTechnicalSpec_XMYPart2Wrapper._vrTechnicalSpec_XMYPart2)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XMYPart2 getWrappedModel() {
		return _vrTechnicalSpec_XMYPart2;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XMYPart2.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XMYPart2.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XMYPart2.resetOriginalValues();
	}

	private final VRTechnicalSpec_XMYPart2 _vrTechnicalSpec_XMYPart2;
}