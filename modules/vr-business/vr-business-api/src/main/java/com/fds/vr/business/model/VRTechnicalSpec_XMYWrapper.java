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
 * This class is a wrapper for {@link VRTechnicalSpec_XMY}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XMY
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XMYWrapper implements VRTechnicalSpec_XMY,
	ModelWrapper<VRTechnicalSpec_XMY> {
	public VRTechnicalSpec_XMYWrapper(VRTechnicalSpec_XMY vrTechnicalSpec_XMY) {
		_vrTechnicalSpec_XMY = vrTechnicalSpec_XMY;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XMY.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XMY.class.getName();
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
		attributes.put("XMY01670", getXMY01670());
		attributes.put("XMY01671", getXMY01671());
		attributes.put("XMY01672", getXMY01672());
		attributes.put("XMY01673", getXMY01673());
		attributes.put("XMY01674", getXMY01674());
		attributes.put("XMY01675", getXMY01675());
		attributes.put("XMY01676", getXMY01676());
		attributes.put("XMY01677", getXMY01677());
		attributes.put("XMY01678", getXMY01678());
		attributes.put("XMY01679", getXMY01679());
		attributes.put("XMY01680", getXMY01680());
		attributes.put("XMY01681", getXMY01681());
		attributes.put("XMY01682", getXMY01682());
		attributes.put("XMY01683", getXMY01683());
		attributes.put("XMY01684", getXMY01684());
		attributes.put("XMY01685", getXMY01685());
		attributes.put("XMY01686", getXMY01686());
		attributes.put("XMY01687", getXMY01687());
		attributes.put("XMY01688", getXMY01688());
		attributes.put("XMY01689", getXMY01689());
		attributes.put("XMY01690", getXMY01690());
		attributes.put("XMY01691", getXMY01691());
		attributes.put("XMY01692", getXMY01692());
		attributes.put("XMY01693", getXMY01693());
		attributes.put("XMY01694", getXMY01694());
		attributes.put("XMY01695", getXMY01695());
		attributes.put("XMY01696", getXMY01696());
		attributes.put("XMY01697", getXMY01697());
		attributes.put("XMY01698", getXMY01698());
		attributes.put("XMY01699", getXMY01699());
		attributes.put("XMY01700", getXMY01700());
		attributes.put("XMY01701", getXMY01701());
		attributes.put("XMY01702", getXMY01702());
		attributes.put("XMY01703", getXMY01703());
		attributes.put("XMY01704", getXMY01704());
		attributes.put("XMY01705", getXMY01705());
		attributes.put("XMY01706", getXMY01706());
		attributes.put("XMY01707", getXMY01707());
		attributes.put("XMY01708", getXMY01708());
		attributes.put("XMY01709", getXMY01709());
		attributes.put("XMY01710", getXMY01710());
		attributes.put("XMY01711", getXMY01711());
		attributes.put("XMY01712", getXMY01712());
		attributes.put("XMY01713", getXMY01713());
		attributes.put("XMY01714", getXMY01714());
		attributes.put("XMY01715", getXMY01715());
		attributes.put("XMY01716", getXMY01716());
		attributes.put("XMY01717", getXMY01717());
		attributes.put("XMY01718", getXMY01718());
		attributes.put("XMY01719", getXMY01719());
		attributes.put("XMY01720", getXMY01720());
		attributes.put("XMY01721", getXMY01721());
		attributes.put("XMY01722", getXMY01722());
		attributes.put("XMY01723", getXMY01723());
		attributes.put("XMY01724", getXMY01724());
		attributes.put("XMY01725", getXMY01725());
		attributes.put("XMY01726", getXMY01726());
		attributes.put("XMY01729", getXMY01729());
		attributes.put("XMY01730", getXMY01730());
		attributes.put("XMY01731", getXMY01731());
		attributes.put("XMY01732", getXMY01732());
		attributes.put("XMY01733", getXMY01733());
		attributes.put("XMY01734", getXMY01734());
		attributes.put("XMY01735", getXMY01735());
		attributes.put("XMY01736", getXMY01736());
		attributes.put("XMY01737", getXMY01737());
		attributes.put("XMY01738", getXMY01738());
		attributes.put("XMY01739", getXMY01739());
		attributes.put("XMY01740", getXMY01740());
		attributes.put("XMY01741", getXMY01741());
		attributes.put("XMY01742", getXMY01742());
		attributes.put("XMY01744", getXMY01744());
		attributes.put("XMY01745", getXMY01745());
		attributes.put("XMY01746", getXMY01746());
		attributes.put("XMY01747", getXMY01747());
		attributes.put("XMY01748", getXMY01748());
		attributes.put("XMY01749", getXMY01749());
		attributes.put("XMY01758", getXMY01758());
		attributes.put("XMY01759", getXMY01759());
		attributes.put("XMY01760", getXMY01760());
		attributes.put("XMY01761", getXMY01761());
		attributes.put("XMY01762", getXMY01762());
		attributes.put("XMY01763", getXMY01763());
		attributes.put("XMY01764", getXMY01764());
		attributes.put("XMY01779", getXMY01779());
		attributes.put("XMY01780", getXMY01780());
		attributes.put("XMY01781", getXMY01781());
		attributes.put("XMY01782", getXMY01782());
		attributes.put("XMY01783", getXMY01783());
		attributes.put("XMY01785", getXMY01785());
		attributes.put("XMY01786", getXMY01786());
		attributes.put("XMY01787", getXMY01787());
		attributes.put("XMY01788", getXMY01788());
		attributes.put("XMY01789", getXMY01789());
		attributes.put("XMY01790", getXMY01790());
		attributes.put("XMY01791", getXMY01791());
		attributes.put("XMY01792", getXMY01792());
		attributes.put("XMY01793", getXMY01793());
		attributes.put("XMY01794", getXMY01794());
		attributes.put("XMY01795", getXMY01795());
		attributes.put("XMY01796", getXMY01796());
		attributes.put("XMY01797", getXMY01797());
		attributes.put("XMY01798", getXMY01798());
		attributes.put("XMY01799", getXMY01799());
		attributes.put("XMY01800", getXMY01800());
		attributes.put("XMY01801", getXMY01801());
		attributes.put("XMY01802", getXMY01802());
		attributes.put("XMY01804", getXMY01804());
		attributes.put("XMY01805", getXMY01805());
		attributes.put("XMY01806", getXMY01806());
		attributes.put("XMY01807", getXMY01807());
		attributes.put("XMY01808", getXMY01808());
		attributes.put("XMY01809", getXMY01809());
		attributes.put("XMY01810", getXMY01810());
		attributes.put("XMY01811", getXMY01811());
		attributes.put("XMY01812", getXMY01812());
		attributes.put("XMY01813", getXMY01813());
		attributes.put("XMY01814", getXMY01814());
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

		String XMY01670 = (String)attributes.get("XMY01670");

		if (XMY01670 != null) {
			setXMY01670(XMY01670);
		}

		String XMY01671 = (String)attributes.get("XMY01671");

		if (XMY01671 != null) {
			setXMY01671(XMY01671);
		}

		String XMY01672 = (String)attributes.get("XMY01672");

		if (XMY01672 != null) {
			setXMY01672(XMY01672);
		}

		String XMY01673 = (String)attributes.get("XMY01673");

		if (XMY01673 != null) {
			setXMY01673(XMY01673);
		}

		String XMY01674 = (String)attributes.get("XMY01674");

		if (XMY01674 != null) {
			setXMY01674(XMY01674);
		}

		String XMY01675 = (String)attributes.get("XMY01675");

		if (XMY01675 != null) {
			setXMY01675(XMY01675);
		}

		String XMY01676 = (String)attributes.get("XMY01676");

		if (XMY01676 != null) {
			setXMY01676(XMY01676);
		}

		String XMY01677 = (String)attributes.get("XMY01677");

		if (XMY01677 != null) {
			setXMY01677(XMY01677);
		}

		String XMY01678 = (String)attributes.get("XMY01678");

		if (XMY01678 != null) {
			setXMY01678(XMY01678);
		}

		String XMY01679 = (String)attributes.get("XMY01679");

		if (XMY01679 != null) {
			setXMY01679(XMY01679);
		}

		String XMY01680 = (String)attributes.get("XMY01680");

		if (XMY01680 != null) {
			setXMY01680(XMY01680);
		}

		String XMY01681 = (String)attributes.get("XMY01681");

		if (XMY01681 != null) {
			setXMY01681(XMY01681);
		}

		String XMY01682 = (String)attributes.get("XMY01682");

		if (XMY01682 != null) {
			setXMY01682(XMY01682);
		}

		String XMY01683 = (String)attributes.get("XMY01683");

		if (XMY01683 != null) {
			setXMY01683(XMY01683);
		}

		String XMY01684 = (String)attributes.get("XMY01684");

		if (XMY01684 != null) {
			setXMY01684(XMY01684);
		}

		String XMY01685 = (String)attributes.get("XMY01685");

		if (XMY01685 != null) {
			setXMY01685(XMY01685);
		}

		String XMY01686 = (String)attributes.get("XMY01686");

		if (XMY01686 != null) {
			setXMY01686(XMY01686);
		}

		String XMY01687 = (String)attributes.get("XMY01687");

		if (XMY01687 != null) {
			setXMY01687(XMY01687);
		}

		String XMY01688 = (String)attributes.get("XMY01688");

		if (XMY01688 != null) {
			setXMY01688(XMY01688);
		}

		String XMY01689 = (String)attributes.get("XMY01689");

		if (XMY01689 != null) {
			setXMY01689(XMY01689);
		}

		String XMY01690 = (String)attributes.get("XMY01690");

		if (XMY01690 != null) {
			setXMY01690(XMY01690);
		}

		String XMY01691 = (String)attributes.get("XMY01691");

		if (XMY01691 != null) {
			setXMY01691(XMY01691);
		}

		String XMY01692 = (String)attributes.get("XMY01692");

		if (XMY01692 != null) {
			setXMY01692(XMY01692);
		}

		String XMY01693 = (String)attributes.get("XMY01693");

		if (XMY01693 != null) {
			setXMY01693(XMY01693);
		}

		String XMY01694 = (String)attributes.get("XMY01694");

		if (XMY01694 != null) {
			setXMY01694(XMY01694);
		}

		String XMY01695 = (String)attributes.get("XMY01695");

		if (XMY01695 != null) {
			setXMY01695(XMY01695);
		}

		String XMY01696 = (String)attributes.get("XMY01696");

		if (XMY01696 != null) {
			setXMY01696(XMY01696);
		}

		String XMY01697 = (String)attributes.get("XMY01697");

		if (XMY01697 != null) {
			setXMY01697(XMY01697);
		}

		String XMY01698 = (String)attributes.get("XMY01698");

		if (XMY01698 != null) {
			setXMY01698(XMY01698);
		}

		String XMY01699 = (String)attributes.get("XMY01699");

		if (XMY01699 != null) {
			setXMY01699(XMY01699);
		}

		String XMY01700 = (String)attributes.get("XMY01700");

		if (XMY01700 != null) {
			setXMY01700(XMY01700);
		}

		String XMY01701 = (String)attributes.get("XMY01701");

		if (XMY01701 != null) {
			setXMY01701(XMY01701);
		}

		String XMY01702 = (String)attributes.get("XMY01702");

		if (XMY01702 != null) {
			setXMY01702(XMY01702);
		}

		String XMY01703 = (String)attributes.get("XMY01703");

		if (XMY01703 != null) {
			setXMY01703(XMY01703);
		}

		String XMY01704 = (String)attributes.get("XMY01704");

		if (XMY01704 != null) {
			setXMY01704(XMY01704);
		}

		String XMY01705 = (String)attributes.get("XMY01705");

		if (XMY01705 != null) {
			setXMY01705(XMY01705);
		}

		String XMY01706 = (String)attributes.get("XMY01706");

		if (XMY01706 != null) {
			setXMY01706(XMY01706);
		}

		String XMY01707 = (String)attributes.get("XMY01707");

		if (XMY01707 != null) {
			setXMY01707(XMY01707);
		}

		String XMY01708 = (String)attributes.get("XMY01708");

		if (XMY01708 != null) {
			setXMY01708(XMY01708);
		}

		String XMY01709 = (String)attributes.get("XMY01709");

		if (XMY01709 != null) {
			setXMY01709(XMY01709);
		}

		String XMY01710 = (String)attributes.get("XMY01710");

		if (XMY01710 != null) {
			setXMY01710(XMY01710);
		}

		String XMY01711 = (String)attributes.get("XMY01711");

		if (XMY01711 != null) {
			setXMY01711(XMY01711);
		}

		String XMY01712 = (String)attributes.get("XMY01712");

		if (XMY01712 != null) {
			setXMY01712(XMY01712);
		}

		String XMY01713 = (String)attributes.get("XMY01713");

		if (XMY01713 != null) {
			setXMY01713(XMY01713);
		}

		String XMY01714 = (String)attributes.get("XMY01714");

		if (XMY01714 != null) {
			setXMY01714(XMY01714);
		}

		String XMY01715 = (String)attributes.get("XMY01715");

		if (XMY01715 != null) {
			setXMY01715(XMY01715);
		}

		String XMY01716 = (String)attributes.get("XMY01716");

		if (XMY01716 != null) {
			setXMY01716(XMY01716);
		}

		String XMY01717 = (String)attributes.get("XMY01717");

		if (XMY01717 != null) {
			setXMY01717(XMY01717);
		}

		String XMY01718 = (String)attributes.get("XMY01718");

		if (XMY01718 != null) {
			setXMY01718(XMY01718);
		}

		String XMY01719 = (String)attributes.get("XMY01719");

		if (XMY01719 != null) {
			setXMY01719(XMY01719);
		}

		String XMY01720 = (String)attributes.get("XMY01720");

		if (XMY01720 != null) {
			setXMY01720(XMY01720);
		}

		String XMY01721 = (String)attributes.get("XMY01721");

		if (XMY01721 != null) {
			setXMY01721(XMY01721);
		}

		String XMY01722 = (String)attributes.get("XMY01722");

		if (XMY01722 != null) {
			setXMY01722(XMY01722);
		}

		String XMY01723 = (String)attributes.get("XMY01723");

		if (XMY01723 != null) {
			setXMY01723(XMY01723);
		}

		String XMY01724 = (String)attributes.get("XMY01724");

		if (XMY01724 != null) {
			setXMY01724(XMY01724);
		}

		String XMY01725 = (String)attributes.get("XMY01725");

		if (XMY01725 != null) {
			setXMY01725(XMY01725);
		}

		String XMY01726 = (String)attributes.get("XMY01726");

		if (XMY01726 != null) {
			setXMY01726(XMY01726);
		}

		String XMY01729 = (String)attributes.get("XMY01729");

		if (XMY01729 != null) {
			setXMY01729(XMY01729);
		}

		String XMY01730 = (String)attributes.get("XMY01730");

		if (XMY01730 != null) {
			setXMY01730(XMY01730);
		}

		String XMY01731 = (String)attributes.get("XMY01731");

		if (XMY01731 != null) {
			setXMY01731(XMY01731);
		}

		String XMY01732 = (String)attributes.get("XMY01732");

		if (XMY01732 != null) {
			setXMY01732(XMY01732);
		}

		String XMY01733 = (String)attributes.get("XMY01733");

		if (XMY01733 != null) {
			setXMY01733(XMY01733);
		}

		String XMY01734 = (String)attributes.get("XMY01734");

		if (XMY01734 != null) {
			setXMY01734(XMY01734);
		}

		String XMY01735 = (String)attributes.get("XMY01735");

		if (XMY01735 != null) {
			setXMY01735(XMY01735);
		}

		String XMY01736 = (String)attributes.get("XMY01736");

		if (XMY01736 != null) {
			setXMY01736(XMY01736);
		}

		String XMY01737 = (String)attributes.get("XMY01737");

		if (XMY01737 != null) {
			setXMY01737(XMY01737);
		}

		String XMY01738 = (String)attributes.get("XMY01738");

		if (XMY01738 != null) {
			setXMY01738(XMY01738);
		}

		String XMY01739 = (String)attributes.get("XMY01739");

		if (XMY01739 != null) {
			setXMY01739(XMY01739);
		}

		String XMY01740 = (String)attributes.get("XMY01740");

		if (XMY01740 != null) {
			setXMY01740(XMY01740);
		}

		String XMY01741 = (String)attributes.get("XMY01741");

		if (XMY01741 != null) {
			setXMY01741(XMY01741);
		}

		String XMY01742 = (String)attributes.get("XMY01742");

		if (XMY01742 != null) {
			setXMY01742(XMY01742);
		}

		String XMY01744 = (String)attributes.get("XMY01744");

		if (XMY01744 != null) {
			setXMY01744(XMY01744);
		}

		String XMY01745 = (String)attributes.get("XMY01745");

		if (XMY01745 != null) {
			setXMY01745(XMY01745);
		}

		String XMY01746 = (String)attributes.get("XMY01746");

		if (XMY01746 != null) {
			setXMY01746(XMY01746);
		}

		String XMY01747 = (String)attributes.get("XMY01747");

		if (XMY01747 != null) {
			setXMY01747(XMY01747);
		}

		String XMY01748 = (String)attributes.get("XMY01748");

		if (XMY01748 != null) {
			setXMY01748(XMY01748);
		}

		String XMY01749 = (String)attributes.get("XMY01749");

		if (XMY01749 != null) {
			setXMY01749(XMY01749);
		}

		String XMY01758 = (String)attributes.get("XMY01758");

		if (XMY01758 != null) {
			setXMY01758(XMY01758);
		}

		String XMY01759 = (String)attributes.get("XMY01759");

		if (XMY01759 != null) {
			setXMY01759(XMY01759);
		}

		String XMY01760 = (String)attributes.get("XMY01760");

		if (XMY01760 != null) {
			setXMY01760(XMY01760);
		}

		String XMY01761 = (String)attributes.get("XMY01761");

		if (XMY01761 != null) {
			setXMY01761(XMY01761);
		}

		String XMY01762 = (String)attributes.get("XMY01762");

		if (XMY01762 != null) {
			setXMY01762(XMY01762);
		}

		String XMY01763 = (String)attributes.get("XMY01763");

		if (XMY01763 != null) {
			setXMY01763(XMY01763);
		}

		String XMY01764 = (String)attributes.get("XMY01764");

		if (XMY01764 != null) {
			setXMY01764(XMY01764);
		}

		String XMY01779 = (String)attributes.get("XMY01779");

		if (XMY01779 != null) {
			setXMY01779(XMY01779);
		}

		String XMY01780 = (String)attributes.get("XMY01780");

		if (XMY01780 != null) {
			setXMY01780(XMY01780);
		}

		String XMY01781 = (String)attributes.get("XMY01781");

		if (XMY01781 != null) {
			setXMY01781(XMY01781);
		}

		String XMY01782 = (String)attributes.get("XMY01782");

		if (XMY01782 != null) {
			setXMY01782(XMY01782);
		}

		String XMY01783 = (String)attributes.get("XMY01783");

		if (XMY01783 != null) {
			setXMY01783(XMY01783);
		}

		String XMY01785 = (String)attributes.get("XMY01785");

		if (XMY01785 != null) {
			setXMY01785(XMY01785);
		}

		String XMY01786 = (String)attributes.get("XMY01786");

		if (XMY01786 != null) {
			setXMY01786(XMY01786);
		}

		String XMY01787 = (String)attributes.get("XMY01787");

		if (XMY01787 != null) {
			setXMY01787(XMY01787);
		}

		String XMY01788 = (String)attributes.get("XMY01788");

		if (XMY01788 != null) {
			setXMY01788(XMY01788);
		}

		String XMY01789 = (String)attributes.get("XMY01789");

		if (XMY01789 != null) {
			setXMY01789(XMY01789);
		}

		String XMY01790 = (String)attributes.get("XMY01790");

		if (XMY01790 != null) {
			setXMY01790(XMY01790);
		}

		String XMY01791 = (String)attributes.get("XMY01791");

		if (XMY01791 != null) {
			setXMY01791(XMY01791);
		}

		String XMY01792 = (String)attributes.get("XMY01792");

		if (XMY01792 != null) {
			setXMY01792(XMY01792);
		}

		String XMY01793 = (String)attributes.get("XMY01793");

		if (XMY01793 != null) {
			setXMY01793(XMY01793);
		}

		String XMY01794 = (String)attributes.get("XMY01794");

		if (XMY01794 != null) {
			setXMY01794(XMY01794);
		}

		String XMY01795 = (String)attributes.get("XMY01795");

		if (XMY01795 != null) {
			setXMY01795(XMY01795);
		}

		String XMY01796 = (String)attributes.get("XMY01796");

		if (XMY01796 != null) {
			setXMY01796(XMY01796);
		}

		String XMY01797 = (String)attributes.get("XMY01797");

		if (XMY01797 != null) {
			setXMY01797(XMY01797);
		}

		String XMY01798 = (String)attributes.get("XMY01798");

		if (XMY01798 != null) {
			setXMY01798(XMY01798);
		}

		String XMY01799 = (String)attributes.get("XMY01799");

		if (XMY01799 != null) {
			setXMY01799(XMY01799);
		}

		String XMY01800 = (String)attributes.get("XMY01800");

		if (XMY01800 != null) {
			setXMY01800(XMY01800);
		}

		String XMY01801 = (String)attributes.get("XMY01801");

		if (XMY01801 != null) {
			setXMY01801(XMY01801);
		}

		String XMY01802 = (String)attributes.get("XMY01802");

		if (XMY01802 != null) {
			setXMY01802(XMY01802);
		}

		String XMY01804 = (String)attributes.get("XMY01804");

		if (XMY01804 != null) {
			setXMY01804(XMY01804);
		}

		String XMY01805 = (String)attributes.get("XMY01805");

		if (XMY01805 != null) {
			setXMY01805(XMY01805);
		}

		String XMY01806 = (String)attributes.get("XMY01806");

		if (XMY01806 != null) {
			setXMY01806(XMY01806);
		}

		String XMY01807 = (String)attributes.get("XMY01807");

		if (XMY01807 != null) {
			setXMY01807(XMY01807);
		}

		String XMY01808 = (String)attributes.get("XMY01808");

		if (XMY01808 != null) {
			setXMY01808(XMY01808);
		}

		String XMY01809 = (String)attributes.get("XMY01809");

		if (XMY01809 != null) {
			setXMY01809(XMY01809);
		}

		String XMY01810 = (String)attributes.get("XMY01810");

		if (XMY01810 != null) {
			setXMY01810(XMY01810);
		}

		String XMY01811 = (String)attributes.get("XMY01811");

		if (XMY01811 != null) {
			setXMY01811(XMY01811);
		}

		String XMY01812 = (String)attributes.get("XMY01812");

		if (XMY01812 != null) {
			setXMY01812(XMY01812);
		}

		String XMY01813 = (String)attributes.get("XMY01813");

		if (XMY01813 != null) {
			setXMY01813(XMY01813);
		}

		String XMY01814 = (String)attributes.get("XMY01814");

		if (XMY01814 != null) {
			setXMY01814(XMY01814);
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
	public VRTechnicalSpec_XMY toEscapedModel() {
		return new VRTechnicalSpec_XMYWrapper(_vrTechnicalSpec_XMY.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XMY toUnescapedModel() {
		return new VRTechnicalSpec_XMYWrapper(_vrTechnicalSpec_XMY.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XMY.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XMY.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XMY.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XMY.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XMY> toCacheModel() {
		return _vrTechnicalSpec_XMY.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XMY vrTechnicalSpec_XMY) {
		return _vrTechnicalSpec_XMY.compareTo(vrTechnicalSpec_XMY);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XMY.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XMY.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XMYWrapper((VRTechnicalSpec_XMY)_vrTechnicalSpec_XMY.clone());
	}

	/**
	* Returns the deliverable code of this vr technical spec_xmy.
	*
	* @return the deliverable code of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XMY.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xmy.
	*
	* @return the dossier ID ctn of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XMY.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xmy.
	*
	* @return the dossier no of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XMY.getDossierNo();
	}

	/**
	* Returns the loai_dong_co of this vr technical spec_xmy.
	*
	* @return the loai_dong_co of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getLoai_dong_co() {
		return _vrTechnicalSpec_XMY.getLoai_dong_co();
	}

	/**
	* Returns the reference uid of this vr technical spec_xmy.
	*
	* @return the reference uid of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XMY.getReferenceUid();
	}

	/**
	* Returns the xmy01001 of this vr technical spec_xmy.
	*
	* @return the xmy01001 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01001() {
		return _vrTechnicalSpec_XMY.getXMY01001();
	}

	/**
	* Returns the xmy01002 of this vr technical spec_xmy.
	*
	* @return the xmy01002 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01002() {
		return _vrTechnicalSpec_XMY.getXMY01002();
	}

	/**
	* Returns the xmy01003 of this vr technical spec_xmy.
	*
	* @return the xmy01003 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01003() {
		return _vrTechnicalSpec_XMY.getXMY01003();
	}

	/**
	* Returns the xmy01004 of this vr technical spec_xmy.
	*
	* @return the xmy01004 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01004() {
		return _vrTechnicalSpec_XMY.getXMY01004();
	}

	/**
	* Returns the xmy01005 of this vr technical spec_xmy.
	*
	* @return the xmy01005 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01005() {
		return _vrTechnicalSpec_XMY.getXMY01005();
	}

	/**
	* Returns the xmy01006 of this vr technical spec_xmy.
	*
	* @return the xmy01006 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01006() {
		return _vrTechnicalSpec_XMY.getXMY01006();
	}

	/**
	* Returns the xmy01007 of this vr technical spec_xmy.
	*
	* @return the xmy01007 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01007() {
		return _vrTechnicalSpec_XMY.getXMY01007();
	}

	/**
	* Returns the xmy01008 of this vr technical spec_xmy.
	*
	* @return the xmy01008 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01008() {
		return _vrTechnicalSpec_XMY.getXMY01008();
	}

	/**
	* Returns the xmy01009 of this vr technical spec_xmy.
	*
	* @return the xmy01009 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01009() {
		return _vrTechnicalSpec_XMY.getXMY01009();
	}

	/**
	* Returns the xmy01010 of this vr technical spec_xmy.
	*
	* @return the xmy01010 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01010() {
		return _vrTechnicalSpec_XMY.getXMY01010();
	}

	/**
	* Returns the xmy01011 of this vr technical spec_xmy.
	*
	* @return the xmy01011 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01011() {
		return _vrTechnicalSpec_XMY.getXMY01011();
	}

	/**
	* Returns the xmy01012 of this vr technical spec_xmy.
	*
	* @return the xmy01012 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01012() {
		return _vrTechnicalSpec_XMY.getXMY01012();
	}

	/**
	* Returns the xmy01013 of this vr technical spec_xmy.
	*
	* @return the xmy01013 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01013() {
		return _vrTechnicalSpec_XMY.getXMY01013();
	}

	/**
	* Returns the xmy01014 of this vr technical spec_xmy.
	*
	* @return the xmy01014 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01014() {
		return _vrTechnicalSpec_XMY.getXMY01014();
	}

	/**
	* Returns the xmy01016 of this vr technical spec_xmy.
	*
	* @return the xmy01016 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01016() {
		return _vrTechnicalSpec_XMY.getXMY01016();
	}

	/**
	* Returns the xmy01017 of this vr technical spec_xmy.
	*
	* @return the xmy01017 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01017() {
		return _vrTechnicalSpec_XMY.getXMY01017();
	}

	/**
	* Returns the xmy01019 of this vr technical spec_xmy.
	*
	* @return the xmy01019 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01019() {
		return _vrTechnicalSpec_XMY.getXMY01019();
	}

	/**
	* Returns the xmy01020 of this vr technical spec_xmy.
	*
	* @return the xmy01020 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01020() {
		return _vrTechnicalSpec_XMY.getXMY01020();
	}

	/**
	* Returns the xmy01021 of this vr technical spec_xmy.
	*
	* @return the xmy01021 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01021() {
		return _vrTechnicalSpec_XMY.getXMY01021();
	}

	/**
	* Returns the xmy01022 of this vr technical spec_xmy.
	*
	* @return the xmy01022 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01022() {
		return _vrTechnicalSpec_XMY.getXMY01022();
	}

	/**
	* Returns the xmy01030 of this vr technical spec_xmy.
	*
	* @return the xmy01030 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01030() {
		return _vrTechnicalSpec_XMY.getXMY01030();
	}

	/**
	* Returns the xmy01031 of this vr technical spec_xmy.
	*
	* @return the xmy01031 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01031() {
		return _vrTechnicalSpec_XMY.getXMY01031();
	}

	/**
	* Returns the xmy01032 of this vr technical spec_xmy.
	*
	* @return the xmy01032 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01032() {
		return _vrTechnicalSpec_XMY.getXMY01032();
	}

	/**
	* Returns the xmy01033 of this vr technical spec_xmy.
	*
	* @return the xmy01033 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01033() {
		return _vrTechnicalSpec_XMY.getXMY01033();
	}

	/**
	* Returns the xmy01034 of this vr technical spec_xmy.
	*
	* @return the xmy01034 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01034() {
		return _vrTechnicalSpec_XMY.getXMY01034();
	}

	/**
	* Returns the xmy01035 of this vr technical spec_xmy.
	*
	* @return the xmy01035 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01035() {
		return _vrTechnicalSpec_XMY.getXMY01035();
	}

	/**
	* Returns the xmy01036 of this vr technical spec_xmy.
	*
	* @return the xmy01036 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01036() {
		return _vrTechnicalSpec_XMY.getXMY01036();
	}

	/**
	* Returns the xmy01037 of this vr technical spec_xmy.
	*
	* @return the xmy01037 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01037() {
		return _vrTechnicalSpec_XMY.getXMY01037();
	}

	/**
	* Returns the xmy01038 of this vr technical spec_xmy.
	*
	* @return the xmy01038 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01038() {
		return _vrTechnicalSpec_XMY.getXMY01038();
	}

	/**
	* Returns the xmy01039 of this vr technical spec_xmy.
	*
	* @return the xmy01039 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01039() {
		return _vrTechnicalSpec_XMY.getXMY01039();
	}

	/**
	* Returns the xmy01040 of this vr technical spec_xmy.
	*
	* @return the xmy01040 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01040() {
		return _vrTechnicalSpec_XMY.getXMY01040();
	}

	/**
	* Returns the xmy01041 of this vr technical spec_xmy.
	*
	* @return the xmy01041 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01041() {
		return _vrTechnicalSpec_XMY.getXMY01041();
	}

	/**
	* Returns the xmy01042 of this vr technical spec_xmy.
	*
	* @return the xmy01042 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01042() {
		return _vrTechnicalSpec_XMY.getXMY01042();
	}

	/**
	* Returns the xmy01043 of this vr technical spec_xmy.
	*
	* @return the xmy01043 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01043() {
		return _vrTechnicalSpec_XMY.getXMY01043();
	}

	/**
	* Returns the xmy01044 of this vr technical spec_xmy.
	*
	* @return the xmy01044 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01044() {
		return _vrTechnicalSpec_XMY.getXMY01044();
	}

	/**
	* Returns the xmy01045 of this vr technical spec_xmy.
	*
	* @return the xmy01045 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01045() {
		return _vrTechnicalSpec_XMY.getXMY01045();
	}

	/**
	* Returns the xmy01046 of this vr technical spec_xmy.
	*
	* @return the xmy01046 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01046() {
		return _vrTechnicalSpec_XMY.getXMY01046();
	}

	/**
	* Returns the xmy01047 of this vr technical spec_xmy.
	*
	* @return the xmy01047 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01047() {
		return _vrTechnicalSpec_XMY.getXMY01047();
	}

	/**
	* Returns the xmy01050 of this vr technical spec_xmy.
	*
	* @return the xmy01050 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01050() {
		return _vrTechnicalSpec_XMY.getXMY01050();
	}

	/**
	* Returns the xmy01051 of this vr technical spec_xmy.
	*
	* @return the xmy01051 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01051() {
		return _vrTechnicalSpec_XMY.getXMY01051();
	}

	/**
	* Returns the xmy01052 of this vr technical spec_xmy.
	*
	* @return the xmy01052 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01052() {
		return _vrTechnicalSpec_XMY.getXMY01052();
	}

	/**
	* Returns the xmy01053 of this vr technical spec_xmy.
	*
	* @return the xmy01053 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01053() {
		return _vrTechnicalSpec_XMY.getXMY01053();
	}

	/**
	* Returns the xmy01054 of this vr technical spec_xmy.
	*
	* @return the xmy01054 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01054() {
		return _vrTechnicalSpec_XMY.getXMY01054();
	}

	/**
	* Returns the xmy01055 of this vr technical spec_xmy.
	*
	* @return the xmy01055 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01055() {
		return _vrTechnicalSpec_XMY.getXMY01055();
	}

	/**
	* Returns the xmy01056 of this vr technical spec_xmy.
	*
	* @return the xmy01056 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01056() {
		return _vrTechnicalSpec_XMY.getXMY01056();
	}

	/**
	* Returns the xmy01057 of this vr technical spec_xmy.
	*
	* @return the xmy01057 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01057() {
		return _vrTechnicalSpec_XMY.getXMY01057();
	}

	/**
	* Returns the xmy01058 of this vr technical spec_xmy.
	*
	* @return the xmy01058 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01058() {
		return _vrTechnicalSpec_XMY.getXMY01058();
	}

	/**
	* Returns the xmy01059 of this vr technical spec_xmy.
	*
	* @return the xmy01059 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01059() {
		return _vrTechnicalSpec_XMY.getXMY01059();
	}

	/**
	* Returns the xmy01060 of this vr technical spec_xmy.
	*
	* @return the xmy01060 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01060() {
		return _vrTechnicalSpec_XMY.getXMY01060();
	}

	/**
	* Returns the xmy01062 of this vr technical spec_xmy.
	*
	* @return the xmy01062 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01062() {
		return _vrTechnicalSpec_XMY.getXMY01062();
	}

	/**
	* Returns the xmy01063 of this vr technical spec_xmy.
	*
	* @return the xmy01063 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01063() {
		return _vrTechnicalSpec_XMY.getXMY01063();
	}

	/**
	* Returns the xmy01064 of this vr technical spec_xmy.
	*
	* @return the xmy01064 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01064() {
		return _vrTechnicalSpec_XMY.getXMY01064();
	}

	/**
	* Returns the xmy01065 of this vr technical spec_xmy.
	*
	* @return the xmy01065 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01065() {
		return _vrTechnicalSpec_XMY.getXMY01065();
	}

	/**
	* Returns the xmy01670 of this vr technical spec_xmy.
	*
	* @return the xmy01670 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01670() {
		return _vrTechnicalSpec_XMY.getXMY01670();
	}

	/**
	* Returns the xmy01671 of this vr technical spec_xmy.
	*
	* @return the xmy01671 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01671() {
		return _vrTechnicalSpec_XMY.getXMY01671();
	}

	/**
	* Returns the xmy01672 of this vr technical spec_xmy.
	*
	* @return the xmy01672 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01672() {
		return _vrTechnicalSpec_XMY.getXMY01672();
	}

	/**
	* Returns the xmy01673 of this vr technical spec_xmy.
	*
	* @return the xmy01673 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01673() {
		return _vrTechnicalSpec_XMY.getXMY01673();
	}

	/**
	* Returns the xmy01674 of this vr technical spec_xmy.
	*
	* @return the xmy01674 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01674() {
		return _vrTechnicalSpec_XMY.getXMY01674();
	}

	/**
	* Returns the xmy01675 of this vr technical spec_xmy.
	*
	* @return the xmy01675 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01675() {
		return _vrTechnicalSpec_XMY.getXMY01675();
	}

	/**
	* Returns the xmy01676 of this vr technical spec_xmy.
	*
	* @return the xmy01676 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01676() {
		return _vrTechnicalSpec_XMY.getXMY01676();
	}

	/**
	* Returns the xmy01677 of this vr technical spec_xmy.
	*
	* @return the xmy01677 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01677() {
		return _vrTechnicalSpec_XMY.getXMY01677();
	}

	/**
	* Returns the xmy01678 of this vr technical spec_xmy.
	*
	* @return the xmy01678 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01678() {
		return _vrTechnicalSpec_XMY.getXMY01678();
	}

	/**
	* Returns the xmy01679 of this vr technical spec_xmy.
	*
	* @return the xmy01679 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01679() {
		return _vrTechnicalSpec_XMY.getXMY01679();
	}

	/**
	* Returns the xmy01680 of this vr technical spec_xmy.
	*
	* @return the xmy01680 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01680() {
		return _vrTechnicalSpec_XMY.getXMY01680();
	}

	/**
	* Returns the xmy01681 of this vr technical spec_xmy.
	*
	* @return the xmy01681 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01681() {
		return _vrTechnicalSpec_XMY.getXMY01681();
	}

	/**
	* Returns the xmy01682 of this vr technical spec_xmy.
	*
	* @return the xmy01682 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01682() {
		return _vrTechnicalSpec_XMY.getXMY01682();
	}

	/**
	* Returns the xmy01683 of this vr technical spec_xmy.
	*
	* @return the xmy01683 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01683() {
		return _vrTechnicalSpec_XMY.getXMY01683();
	}

	/**
	* Returns the xmy01684 of this vr technical spec_xmy.
	*
	* @return the xmy01684 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01684() {
		return _vrTechnicalSpec_XMY.getXMY01684();
	}

	/**
	* Returns the xmy01685 of this vr technical spec_xmy.
	*
	* @return the xmy01685 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01685() {
		return _vrTechnicalSpec_XMY.getXMY01685();
	}

	/**
	* Returns the xmy01686 of this vr technical spec_xmy.
	*
	* @return the xmy01686 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01686() {
		return _vrTechnicalSpec_XMY.getXMY01686();
	}

	/**
	* Returns the xmy01687 of this vr technical spec_xmy.
	*
	* @return the xmy01687 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01687() {
		return _vrTechnicalSpec_XMY.getXMY01687();
	}

	/**
	* Returns the xmy01688 of this vr technical spec_xmy.
	*
	* @return the xmy01688 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01688() {
		return _vrTechnicalSpec_XMY.getXMY01688();
	}

	/**
	* Returns the xmy01689 of this vr technical spec_xmy.
	*
	* @return the xmy01689 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01689() {
		return _vrTechnicalSpec_XMY.getXMY01689();
	}

	/**
	* Returns the xmy01690 of this vr technical spec_xmy.
	*
	* @return the xmy01690 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01690() {
		return _vrTechnicalSpec_XMY.getXMY01690();
	}

	/**
	* Returns the xmy01691 of this vr technical spec_xmy.
	*
	* @return the xmy01691 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01691() {
		return _vrTechnicalSpec_XMY.getXMY01691();
	}

	/**
	* Returns the xmy01692 of this vr technical spec_xmy.
	*
	* @return the xmy01692 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01692() {
		return _vrTechnicalSpec_XMY.getXMY01692();
	}

	/**
	* Returns the xmy01693 of this vr technical spec_xmy.
	*
	* @return the xmy01693 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01693() {
		return _vrTechnicalSpec_XMY.getXMY01693();
	}

	/**
	* Returns the xmy01694 of this vr technical spec_xmy.
	*
	* @return the xmy01694 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01694() {
		return _vrTechnicalSpec_XMY.getXMY01694();
	}

	/**
	* Returns the xmy01695 of this vr technical spec_xmy.
	*
	* @return the xmy01695 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01695() {
		return _vrTechnicalSpec_XMY.getXMY01695();
	}

	/**
	* Returns the xmy01696 of this vr technical spec_xmy.
	*
	* @return the xmy01696 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01696() {
		return _vrTechnicalSpec_XMY.getXMY01696();
	}

	/**
	* Returns the xmy01697 of this vr technical spec_xmy.
	*
	* @return the xmy01697 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01697() {
		return _vrTechnicalSpec_XMY.getXMY01697();
	}

	/**
	* Returns the xmy01698 of this vr technical spec_xmy.
	*
	* @return the xmy01698 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01698() {
		return _vrTechnicalSpec_XMY.getXMY01698();
	}

	/**
	* Returns the xmy01699 of this vr technical spec_xmy.
	*
	* @return the xmy01699 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01699() {
		return _vrTechnicalSpec_XMY.getXMY01699();
	}

	/**
	* Returns the xmy01700 of this vr technical spec_xmy.
	*
	* @return the xmy01700 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01700() {
		return _vrTechnicalSpec_XMY.getXMY01700();
	}

	/**
	* Returns the xmy01701 of this vr technical spec_xmy.
	*
	* @return the xmy01701 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01701() {
		return _vrTechnicalSpec_XMY.getXMY01701();
	}

	/**
	* Returns the xmy01702 of this vr technical spec_xmy.
	*
	* @return the xmy01702 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01702() {
		return _vrTechnicalSpec_XMY.getXMY01702();
	}

	/**
	* Returns the xmy01703 of this vr technical spec_xmy.
	*
	* @return the xmy01703 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01703() {
		return _vrTechnicalSpec_XMY.getXMY01703();
	}

	/**
	* Returns the xmy01704 of this vr technical spec_xmy.
	*
	* @return the xmy01704 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01704() {
		return _vrTechnicalSpec_XMY.getXMY01704();
	}

	/**
	* Returns the xmy01705 of this vr technical spec_xmy.
	*
	* @return the xmy01705 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01705() {
		return _vrTechnicalSpec_XMY.getXMY01705();
	}

	/**
	* Returns the xmy01706 of this vr technical spec_xmy.
	*
	* @return the xmy01706 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01706() {
		return _vrTechnicalSpec_XMY.getXMY01706();
	}

	/**
	* Returns the xmy01707 of this vr technical spec_xmy.
	*
	* @return the xmy01707 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01707() {
		return _vrTechnicalSpec_XMY.getXMY01707();
	}

	/**
	* Returns the xmy01708 of this vr technical spec_xmy.
	*
	* @return the xmy01708 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01708() {
		return _vrTechnicalSpec_XMY.getXMY01708();
	}

	/**
	* Returns the xmy01709 of this vr technical spec_xmy.
	*
	* @return the xmy01709 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01709() {
		return _vrTechnicalSpec_XMY.getXMY01709();
	}

	/**
	* Returns the xmy01710 of this vr technical spec_xmy.
	*
	* @return the xmy01710 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01710() {
		return _vrTechnicalSpec_XMY.getXMY01710();
	}

	/**
	* Returns the xmy01711 of this vr technical spec_xmy.
	*
	* @return the xmy01711 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01711() {
		return _vrTechnicalSpec_XMY.getXMY01711();
	}

	/**
	* Returns the xmy01712 of this vr technical spec_xmy.
	*
	* @return the xmy01712 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01712() {
		return _vrTechnicalSpec_XMY.getXMY01712();
	}

	/**
	* Returns the xmy01713 of this vr technical spec_xmy.
	*
	* @return the xmy01713 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01713() {
		return _vrTechnicalSpec_XMY.getXMY01713();
	}

	/**
	* Returns the xmy01714 of this vr technical spec_xmy.
	*
	* @return the xmy01714 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01714() {
		return _vrTechnicalSpec_XMY.getXMY01714();
	}

	/**
	* Returns the xmy01715 of this vr technical spec_xmy.
	*
	* @return the xmy01715 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01715() {
		return _vrTechnicalSpec_XMY.getXMY01715();
	}

	/**
	* Returns the xmy01716 of this vr technical spec_xmy.
	*
	* @return the xmy01716 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01716() {
		return _vrTechnicalSpec_XMY.getXMY01716();
	}

	/**
	* Returns the xmy01717 of this vr technical spec_xmy.
	*
	* @return the xmy01717 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01717() {
		return _vrTechnicalSpec_XMY.getXMY01717();
	}

	/**
	* Returns the xmy01718 of this vr technical spec_xmy.
	*
	* @return the xmy01718 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01718() {
		return _vrTechnicalSpec_XMY.getXMY01718();
	}

	/**
	* Returns the xmy01719 of this vr technical spec_xmy.
	*
	* @return the xmy01719 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01719() {
		return _vrTechnicalSpec_XMY.getXMY01719();
	}

	/**
	* Returns the xmy01720 of this vr technical spec_xmy.
	*
	* @return the xmy01720 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01720() {
		return _vrTechnicalSpec_XMY.getXMY01720();
	}

	/**
	* Returns the xmy01721 of this vr technical spec_xmy.
	*
	* @return the xmy01721 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01721() {
		return _vrTechnicalSpec_XMY.getXMY01721();
	}

	/**
	* Returns the xmy01722 of this vr technical spec_xmy.
	*
	* @return the xmy01722 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01722() {
		return _vrTechnicalSpec_XMY.getXMY01722();
	}

	/**
	* Returns the xmy01723 of this vr technical spec_xmy.
	*
	* @return the xmy01723 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01723() {
		return _vrTechnicalSpec_XMY.getXMY01723();
	}

	/**
	* Returns the xmy01724 of this vr technical spec_xmy.
	*
	* @return the xmy01724 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01724() {
		return _vrTechnicalSpec_XMY.getXMY01724();
	}

	/**
	* Returns the xmy01725 of this vr technical spec_xmy.
	*
	* @return the xmy01725 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01725() {
		return _vrTechnicalSpec_XMY.getXMY01725();
	}

	/**
	* Returns the xmy01726 of this vr technical spec_xmy.
	*
	* @return the xmy01726 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01726() {
		return _vrTechnicalSpec_XMY.getXMY01726();
	}

	/**
	* Returns the xmy01729 of this vr technical spec_xmy.
	*
	* @return the xmy01729 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01729() {
		return _vrTechnicalSpec_XMY.getXMY01729();
	}

	/**
	* Returns the xmy01730 of this vr technical spec_xmy.
	*
	* @return the xmy01730 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01730() {
		return _vrTechnicalSpec_XMY.getXMY01730();
	}

	/**
	* Returns the xmy01731 of this vr technical spec_xmy.
	*
	* @return the xmy01731 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01731() {
		return _vrTechnicalSpec_XMY.getXMY01731();
	}

	/**
	* Returns the xmy01732 of this vr technical spec_xmy.
	*
	* @return the xmy01732 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01732() {
		return _vrTechnicalSpec_XMY.getXMY01732();
	}

	/**
	* Returns the xmy01733 of this vr technical spec_xmy.
	*
	* @return the xmy01733 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01733() {
		return _vrTechnicalSpec_XMY.getXMY01733();
	}

	/**
	* Returns the xmy01734 of this vr technical spec_xmy.
	*
	* @return the xmy01734 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01734() {
		return _vrTechnicalSpec_XMY.getXMY01734();
	}

	/**
	* Returns the xmy01735 of this vr technical spec_xmy.
	*
	* @return the xmy01735 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01735() {
		return _vrTechnicalSpec_XMY.getXMY01735();
	}

	/**
	* Returns the xmy01736 of this vr technical spec_xmy.
	*
	* @return the xmy01736 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01736() {
		return _vrTechnicalSpec_XMY.getXMY01736();
	}

	/**
	* Returns the xmy01737 of this vr technical spec_xmy.
	*
	* @return the xmy01737 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01737() {
		return _vrTechnicalSpec_XMY.getXMY01737();
	}

	/**
	* Returns the xmy01738 of this vr technical spec_xmy.
	*
	* @return the xmy01738 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01738() {
		return _vrTechnicalSpec_XMY.getXMY01738();
	}

	/**
	* Returns the xmy01739 of this vr technical spec_xmy.
	*
	* @return the xmy01739 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01739() {
		return _vrTechnicalSpec_XMY.getXMY01739();
	}

	/**
	* Returns the xmy01740 of this vr technical spec_xmy.
	*
	* @return the xmy01740 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01740() {
		return _vrTechnicalSpec_XMY.getXMY01740();
	}

	/**
	* Returns the xmy01741 of this vr technical spec_xmy.
	*
	* @return the xmy01741 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01741() {
		return _vrTechnicalSpec_XMY.getXMY01741();
	}

	/**
	* Returns the xmy01742 of this vr technical spec_xmy.
	*
	* @return the xmy01742 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01742() {
		return _vrTechnicalSpec_XMY.getXMY01742();
	}

	/**
	* Returns the xmy01744 of this vr technical spec_xmy.
	*
	* @return the xmy01744 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01744() {
		return _vrTechnicalSpec_XMY.getXMY01744();
	}

	/**
	* Returns the xmy01745 of this vr technical spec_xmy.
	*
	* @return the xmy01745 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01745() {
		return _vrTechnicalSpec_XMY.getXMY01745();
	}

	/**
	* Returns the xmy01746 of this vr technical spec_xmy.
	*
	* @return the xmy01746 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01746() {
		return _vrTechnicalSpec_XMY.getXMY01746();
	}

	/**
	* Returns the xmy01747 of this vr technical spec_xmy.
	*
	* @return the xmy01747 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01747() {
		return _vrTechnicalSpec_XMY.getXMY01747();
	}

	/**
	* Returns the xmy01748 of this vr technical spec_xmy.
	*
	* @return the xmy01748 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01748() {
		return _vrTechnicalSpec_XMY.getXMY01748();
	}

	/**
	* Returns the xmy01749 of this vr technical spec_xmy.
	*
	* @return the xmy01749 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01749() {
		return _vrTechnicalSpec_XMY.getXMY01749();
	}

	/**
	* Returns the xmy01758 of this vr technical spec_xmy.
	*
	* @return the xmy01758 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01758() {
		return _vrTechnicalSpec_XMY.getXMY01758();
	}

	/**
	* Returns the xmy01759 of this vr technical spec_xmy.
	*
	* @return the xmy01759 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01759() {
		return _vrTechnicalSpec_XMY.getXMY01759();
	}

	/**
	* Returns the xmy01760 of this vr technical spec_xmy.
	*
	* @return the xmy01760 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01760() {
		return _vrTechnicalSpec_XMY.getXMY01760();
	}

	/**
	* Returns the xmy01761 of this vr technical spec_xmy.
	*
	* @return the xmy01761 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01761() {
		return _vrTechnicalSpec_XMY.getXMY01761();
	}

	/**
	* Returns the xmy01762 of this vr technical spec_xmy.
	*
	* @return the xmy01762 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01762() {
		return _vrTechnicalSpec_XMY.getXMY01762();
	}

	/**
	* Returns the xmy01763 of this vr technical spec_xmy.
	*
	* @return the xmy01763 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01763() {
		return _vrTechnicalSpec_XMY.getXMY01763();
	}

	/**
	* Returns the xmy01764 of this vr technical spec_xmy.
	*
	* @return the xmy01764 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01764() {
		return _vrTechnicalSpec_XMY.getXMY01764();
	}

	/**
	* Returns the xmy01779 of this vr technical spec_xmy.
	*
	* @return the xmy01779 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01779() {
		return _vrTechnicalSpec_XMY.getXMY01779();
	}

	/**
	* Returns the xmy01780 of this vr technical spec_xmy.
	*
	* @return the xmy01780 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01780() {
		return _vrTechnicalSpec_XMY.getXMY01780();
	}

	/**
	* Returns the xmy01781 of this vr technical spec_xmy.
	*
	* @return the xmy01781 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01781() {
		return _vrTechnicalSpec_XMY.getXMY01781();
	}

	/**
	* Returns the xmy01782 of this vr technical spec_xmy.
	*
	* @return the xmy01782 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01782() {
		return _vrTechnicalSpec_XMY.getXMY01782();
	}

	/**
	* Returns the xmy01783 of this vr technical spec_xmy.
	*
	* @return the xmy01783 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01783() {
		return _vrTechnicalSpec_XMY.getXMY01783();
	}

	/**
	* Returns the xmy01785 of this vr technical spec_xmy.
	*
	* @return the xmy01785 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01785() {
		return _vrTechnicalSpec_XMY.getXMY01785();
	}

	/**
	* Returns the xmy01786 of this vr technical spec_xmy.
	*
	* @return the xmy01786 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01786() {
		return _vrTechnicalSpec_XMY.getXMY01786();
	}

	/**
	* Returns the xmy01787 of this vr technical spec_xmy.
	*
	* @return the xmy01787 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01787() {
		return _vrTechnicalSpec_XMY.getXMY01787();
	}

	/**
	* Returns the xmy01788 of this vr technical spec_xmy.
	*
	* @return the xmy01788 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01788() {
		return _vrTechnicalSpec_XMY.getXMY01788();
	}

	/**
	* Returns the xmy01789 of this vr technical spec_xmy.
	*
	* @return the xmy01789 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01789() {
		return _vrTechnicalSpec_XMY.getXMY01789();
	}

	/**
	* Returns the xmy01790 of this vr technical spec_xmy.
	*
	* @return the xmy01790 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01790() {
		return _vrTechnicalSpec_XMY.getXMY01790();
	}

	/**
	* Returns the xmy01791 of this vr technical spec_xmy.
	*
	* @return the xmy01791 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01791() {
		return _vrTechnicalSpec_XMY.getXMY01791();
	}

	/**
	* Returns the xmy01792 of this vr technical spec_xmy.
	*
	* @return the xmy01792 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01792() {
		return _vrTechnicalSpec_XMY.getXMY01792();
	}

	/**
	* Returns the xmy01793 of this vr technical spec_xmy.
	*
	* @return the xmy01793 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01793() {
		return _vrTechnicalSpec_XMY.getXMY01793();
	}

	/**
	* Returns the xmy01794 of this vr technical spec_xmy.
	*
	* @return the xmy01794 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01794() {
		return _vrTechnicalSpec_XMY.getXMY01794();
	}

	/**
	* Returns the xmy01795 of this vr technical spec_xmy.
	*
	* @return the xmy01795 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01795() {
		return _vrTechnicalSpec_XMY.getXMY01795();
	}

	/**
	* Returns the xmy01796 of this vr technical spec_xmy.
	*
	* @return the xmy01796 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01796() {
		return _vrTechnicalSpec_XMY.getXMY01796();
	}

	/**
	* Returns the xmy01797 of this vr technical spec_xmy.
	*
	* @return the xmy01797 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01797() {
		return _vrTechnicalSpec_XMY.getXMY01797();
	}

	/**
	* Returns the xmy01798 of this vr technical spec_xmy.
	*
	* @return the xmy01798 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01798() {
		return _vrTechnicalSpec_XMY.getXMY01798();
	}

	/**
	* Returns the xmy01799 of this vr technical spec_xmy.
	*
	* @return the xmy01799 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01799() {
		return _vrTechnicalSpec_XMY.getXMY01799();
	}

	/**
	* Returns the xmy01800 of this vr technical spec_xmy.
	*
	* @return the xmy01800 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01800() {
		return _vrTechnicalSpec_XMY.getXMY01800();
	}

	/**
	* Returns the xmy01801 of this vr technical spec_xmy.
	*
	* @return the xmy01801 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01801() {
		return _vrTechnicalSpec_XMY.getXMY01801();
	}

	/**
	* Returns the xmy01802 of this vr technical spec_xmy.
	*
	* @return the xmy01802 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01802() {
		return _vrTechnicalSpec_XMY.getXMY01802();
	}

	/**
	* Returns the xmy01804 of this vr technical spec_xmy.
	*
	* @return the xmy01804 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01804() {
		return _vrTechnicalSpec_XMY.getXMY01804();
	}

	/**
	* Returns the xmy01805 of this vr technical spec_xmy.
	*
	* @return the xmy01805 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01805() {
		return _vrTechnicalSpec_XMY.getXMY01805();
	}

	/**
	* Returns the xmy01806 of this vr technical spec_xmy.
	*
	* @return the xmy01806 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01806() {
		return _vrTechnicalSpec_XMY.getXMY01806();
	}

	/**
	* Returns the xmy01807 of this vr technical spec_xmy.
	*
	* @return the xmy01807 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01807() {
		return _vrTechnicalSpec_XMY.getXMY01807();
	}

	/**
	* Returns the xmy01808 of this vr technical spec_xmy.
	*
	* @return the xmy01808 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01808() {
		return _vrTechnicalSpec_XMY.getXMY01808();
	}

	/**
	* Returns the xmy01809 of this vr technical spec_xmy.
	*
	* @return the xmy01809 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01809() {
		return _vrTechnicalSpec_XMY.getXMY01809();
	}

	/**
	* Returns the xmy01810 of this vr technical spec_xmy.
	*
	* @return the xmy01810 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01810() {
		return _vrTechnicalSpec_XMY.getXMY01810();
	}

	/**
	* Returns the xmy01811 of this vr technical spec_xmy.
	*
	* @return the xmy01811 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01811() {
		return _vrTechnicalSpec_XMY.getXMY01811();
	}

	/**
	* Returns the xmy01812 of this vr technical spec_xmy.
	*
	* @return the xmy01812 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01812() {
		return _vrTechnicalSpec_XMY.getXMY01812();
	}

	/**
	* Returns the xmy01813 of this vr technical spec_xmy.
	*
	* @return the xmy01813 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01813() {
		return _vrTechnicalSpec_XMY.getXMY01813();
	}

	/**
	* Returns the xmy01814 of this vr technical spec_xmy.
	*
	* @return the xmy01814 of this vr technical spec_xmy
	*/
	@Override
	public java.lang.String getXMY01814() {
		return _vrTechnicalSpec_XMY.getXMY01814();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XMY.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XMY.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xmy.
	*
	* @return the modify date of this vr technical spec_xmy
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XMY.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xmy.
	*
	* @return the sync date of this vr technical spec_xmy
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XMY.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xmy.
	*
	* @return the convert assemble ID of this vr technical spec_xmy
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XMY.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xmy.
	*
	* @return the dossier ID of this vr technical spec_xmy
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XMY.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xmy.
	*
	* @return the ID of this vr technical spec_xmy
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XMY.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xmy.
	*
	* @return the mt core of this vr technical spec_xmy
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XMY.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xmy.
	*
	* @return the primary key of this vr technical spec_xmy
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XMY.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xmy.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xmy
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XMY.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XMY.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XMY.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xmy.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xmy
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XMY.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xmy.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xmy
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XMY.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xmy.
	*
	* @param dossierId the dossier ID of this vr technical spec_xmy
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XMY.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xmy.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xmy
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XMY.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xmy.
	*
	* @param dossierNo the dossier no of this vr technical spec_xmy
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XMY.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XMY.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XMY.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XMY.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xmy.
	*
	* @param id the ID of this vr technical spec_xmy
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XMY.setId(id);
	}

	/**
	* Sets the loai_dong_co of this vr technical spec_xmy.
	*
	* @param loai_dong_co the loai_dong_co of this vr technical spec_xmy
	*/
	@Override
	public void setLoai_dong_co(java.lang.String loai_dong_co) {
		_vrTechnicalSpec_XMY.setLoai_dong_co(loai_dong_co);
	}

	/**
	* Sets the modify date of this vr technical spec_xmy.
	*
	* @param modifyDate the modify date of this vr technical spec_xmy
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XMY.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xmy.
	*
	* @param mtCore the mt core of this vr technical spec_xmy
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XMY.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XMY.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xmy.
	*
	* @param primaryKey the primary key of this vr technical spec_xmy
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XMY.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XMY.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xmy.
	*
	* @param referenceUid the reference uid of this vr technical spec_xmy
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XMY.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xmy.
	*
	* @param syncDate the sync date of this vr technical spec_xmy
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XMY.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xmy.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xmy
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XMY.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xmy01001 of this vr technical spec_xmy.
	*
	* @param XMY01001 the xmy01001 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01001(java.lang.String XMY01001) {
		_vrTechnicalSpec_XMY.setXMY01001(XMY01001);
	}

	/**
	* Sets the xmy01002 of this vr technical spec_xmy.
	*
	* @param XMY01002 the xmy01002 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01002(java.lang.String XMY01002) {
		_vrTechnicalSpec_XMY.setXMY01002(XMY01002);
	}

	/**
	* Sets the xmy01003 of this vr technical spec_xmy.
	*
	* @param XMY01003 the xmy01003 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01003(java.lang.String XMY01003) {
		_vrTechnicalSpec_XMY.setXMY01003(XMY01003);
	}

	/**
	* Sets the xmy01004 of this vr technical spec_xmy.
	*
	* @param XMY01004 the xmy01004 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01004(java.lang.String XMY01004) {
		_vrTechnicalSpec_XMY.setXMY01004(XMY01004);
	}

	/**
	* Sets the xmy01005 of this vr technical spec_xmy.
	*
	* @param XMY01005 the xmy01005 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01005(java.lang.String XMY01005) {
		_vrTechnicalSpec_XMY.setXMY01005(XMY01005);
	}

	/**
	* Sets the xmy01006 of this vr technical spec_xmy.
	*
	* @param XMY01006 the xmy01006 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01006(java.lang.String XMY01006) {
		_vrTechnicalSpec_XMY.setXMY01006(XMY01006);
	}

	/**
	* Sets the xmy01007 of this vr technical spec_xmy.
	*
	* @param XMY01007 the xmy01007 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01007(java.lang.String XMY01007) {
		_vrTechnicalSpec_XMY.setXMY01007(XMY01007);
	}

	/**
	* Sets the xmy01008 of this vr technical spec_xmy.
	*
	* @param XMY01008 the xmy01008 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01008(java.lang.String XMY01008) {
		_vrTechnicalSpec_XMY.setXMY01008(XMY01008);
	}

	/**
	* Sets the xmy01009 of this vr technical spec_xmy.
	*
	* @param XMY01009 the xmy01009 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01009(java.lang.String XMY01009) {
		_vrTechnicalSpec_XMY.setXMY01009(XMY01009);
	}

	/**
	* Sets the xmy01010 of this vr technical spec_xmy.
	*
	* @param XMY01010 the xmy01010 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01010(java.lang.String XMY01010) {
		_vrTechnicalSpec_XMY.setXMY01010(XMY01010);
	}

	/**
	* Sets the xmy01011 of this vr technical spec_xmy.
	*
	* @param XMY01011 the xmy01011 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01011(java.lang.String XMY01011) {
		_vrTechnicalSpec_XMY.setXMY01011(XMY01011);
	}

	/**
	* Sets the xmy01012 of this vr technical spec_xmy.
	*
	* @param XMY01012 the xmy01012 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01012(java.lang.String XMY01012) {
		_vrTechnicalSpec_XMY.setXMY01012(XMY01012);
	}

	/**
	* Sets the xmy01013 of this vr technical spec_xmy.
	*
	* @param XMY01013 the xmy01013 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01013(java.lang.String XMY01013) {
		_vrTechnicalSpec_XMY.setXMY01013(XMY01013);
	}

	/**
	* Sets the xmy01014 of this vr technical spec_xmy.
	*
	* @param XMY01014 the xmy01014 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01014(java.lang.String XMY01014) {
		_vrTechnicalSpec_XMY.setXMY01014(XMY01014);
	}

	/**
	* Sets the xmy01016 of this vr technical spec_xmy.
	*
	* @param XMY01016 the xmy01016 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01016(java.lang.String XMY01016) {
		_vrTechnicalSpec_XMY.setXMY01016(XMY01016);
	}

	/**
	* Sets the xmy01017 of this vr technical spec_xmy.
	*
	* @param XMY01017 the xmy01017 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01017(java.lang.String XMY01017) {
		_vrTechnicalSpec_XMY.setXMY01017(XMY01017);
	}

	/**
	* Sets the xmy01019 of this vr technical spec_xmy.
	*
	* @param XMY01019 the xmy01019 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01019(java.lang.String XMY01019) {
		_vrTechnicalSpec_XMY.setXMY01019(XMY01019);
	}

	/**
	* Sets the xmy01020 of this vr technical spec_xmy.
	*
	* @param XMY01020 the xmy01020 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01020(java.lang.String XMY01020) {
		_vrTechnicalSpec_XMY.setXMY01020(XMY01020);
	}

	/**
	* Sets the xmy01021 of this vr technical spec_xmy.
	*
	* @param XMY01021 the xmy01021 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01021(java.lang.String XMY01021) {
		_vrTechnicalSpec_XMY.setXMY01021(XMY01021);
	}

	/**
	* Sets the xmy01022 of this vr technical spec_xmy.
	*
	* @param XMY01022 the xmy01022 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01022(java.lang.String XMY01022) {
		_vrTechnicalSpec_XMY.setXMY01022(XMY01022);
	}

	/**
	* Sets the xmy01030 of this vr technical spec_xmy.
	*
	* @param XMY01030 the xmy01030 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01030(java.lang.String XMY01030) {
		_vrTechnicalSpec_XMY.setXMY01030(XMY01030);
	}

	/**
	* Sets the xmy01031 of this vr technical spec_xmy.
	*
	* @param XMY01031 the xmy01031 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01031(java.lang.String XMY01031) {
		_vrTechnicalSpec_XMY.setXMY01031(XMY01031);
	}

	/**
	* Sets the xmy01032 of this vr technical spec_xmy.
	*
	* @param XMY01032 the xmy01032 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01032(java.lang.String XMY01032) {
		_vrTechnicalSpec_XMY.setXMY01032(XMY01032);
	}

	/**
	* Sets the xmy01033 of this vr technical spec_xmy.
	*
	* @param XMY01033 the xmy01033 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01033(java.lang.String XMY01033) {
		_vrTechnicalSpec_XMY.setXMY01033(XMY01033);
	}

	/**
	* Sets the xmy01034 of this vr technical spec_xmy.
	*
	* @param XMY01034 the xmy01034 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01034(java.lang.String XMY01034) {
		_vrTechnicalSpec_XMY.setXMY01034(XMY01034);
	}

	/**
	* Sets the xmy01035 of this vr technical spec_xmy.
	*
	* @param XMY01035 the xmy01035 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01035(java.lang.String XMY01035) {
		_vrTechnicalSpec_XMY.setXMY01035(XMY01035);
	}

	/**
	* Sets the xmy01036 of this vr technical spec_xmy.
	*
	* @param XMY01036 the xmy01036 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01036(java.lang.String XMY01036) {
		_vrTechnicalSpec_XMY.setXMY01036(XMY01036);
	}

	/**
	* Sets the xmy01037 of this vr technical spec_xmy.
	*
	* @param XMY01037 the xmy01037 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01037(java.lang.String XMY01037) {
		_vrTechnicalSpec_XMY.setXMY01037(XMY01037);
	}

	/**
	* Sets the xmy01038 of this vr technical spec_xmy.
	*
	* @param XMY01038 the xmy01038 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01038(java.lang.String XMY01038) {
		_vrTechnicalSpec_XMY.setXMY01038(XMY01038);
	}

	/**
	* Sets the xmy01039 of this vr technical spec_xmy.
	*
	* @param XMY01039 the xmy01039 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01039(java.lang.String XMY01039) {
		_vrTechnicalSpec_XMY.setXMY01039(XMY01039);
	}

	/**
	* Sets the xmy01040 of this vr technical spec_xmy.
	*
	* @param XMY01040 the xmy01040 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01040(java.lang.String XMY01040) {
		_vrTechnicalSpec_XMY.setXMY01040(XMY01040);
	}

	/**
	* Sets the xmy01041 of this vr technical spec_xmy.
	*
	* @param XMY01041 the xmy01041 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01041(java.lang.String XMY01041) {
		_vrTechnicalSpec_XMY.setXMY01041(XMY01041);
	}

	/**
	* Sets the xmy01042 of this vr technical spec_xmy.
	*
	* @param XMY01042 the xmy01042 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01042(java.lang.String XMY01042) {
		_vrTechnicalSpec_XMY.setXMY01042(XMY01042);
	}

	/**
	* Sets the xmy01043 of this vr technical spec_xmy.
	*
	* @param XMY01043 the xmy01043 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01043(java.lang.String XMY01043) {
		_vrTechnicalSpec_XMY.setXMY01043(XMY01043);
	}

	/**
	* Sets the xmy01044 of this vr technical spec_xmy.
	*
	* @param XMY01044 the xmy01044 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01044(java.lang.String XMY01044) {
		_vrTechnicalSpec_XMY.setXMY01044(XMY01044);
	}

	/**
	* Sets the xmy01045 of this vr technical spec_xmy.
	*
	* @param XMY01045 the xmy01045 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01045(java.lang.String XMY01045) {
		_vrTechnicalSpec_XMY.setXMY01045(XMY01045);
	}

	/**
	* Sets the xmy01046 of this vr technical spec_xmy.
	*
	* @param XMY01046 the xmy01046 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01046(java.lang.String XMY01046) {
		_vrTechnicalSpec_XMY.setXMY01046(XMY01046);
	}

	/**
	* Sets the xmy01047 of this vr technical spec_xmy.
	*
	* @param XMY01047 the xmy01047 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01047(java.lang.String XMY01047) {
		_vrTechnicalSpec_XMY.setXMY01047(XMY01047);
	}

	/**
	* Sets the xmy01050 of this vr technical spec_xmy.
	*
	* @param XMY01050 the xmy01050 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01050(java.lang.String XMY01050) {
		_vrTechnicalSpec_XMY.setXMY01050(XMY01050);
	}

	/**
	* Sets the xmy01051 of this vr technical spec_xmy.
	*
	* @param XMY01051 the xmy01051 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01051(java.lang.String XMY01051) {
		_vrTechnicalSpec_XMY.setXMY01051(XMY01051);
	}

	/**
	* Sets the xmy01052 of this vr technical spec_xmy.
	*
	* @param XMY01052 the xmy01052 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01052(java.lang.String XMY01052) {
		_vrTechnicalSpec_XMY.setXMY01052(XMY01052);
	}

	/**
	* Sets the xmy01053 of this vr technical spec_xmy.
	*
	* @param XMY01053 the xmy01053 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01053(java.lang.String XMY01053) {
		_vrTechnicalSpec_XMY.setXMY01053(XMY01053);
	}

	/**
	* Sets the xmy01054 of this vr technical spec_xmy.
	*
	* @param XMY01054 the xmy01054 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01054(java.lang.String XMY01054) {
		_vrTechnicalSpec_XMY.setXMY01054(XMY01054);
	}

	/**
	* Sets the xmy01055 of this vr technical spec_xmy.
	*
	* @param XMY01055 the xmy01055 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01055(java.lang.String XMY01055) {
		_vrTechnicalSpec_XMY.setXMY01055(XMY01055);
	}

	/**
	* Sets the xmy01056 of this vr technical spec_xmy.
	*
	* @param XMY01056 the xmy01056 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01056(java.lang.String XMY01056) {
		_vrTechnicalSpec_XMY.setXMY01056(XMY01056);
	}

	/**
	* Sets the xmy01057 of this vr technical spec_xmy.
	*
	* @param XMY01057 the xmy01057 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01057(java.lang.String XMY01057) {
		_vrTechnicalSpec_XMY.setXMY01057(XMY01057);
	}

	/**
	* Sets the xmy01058 of this vr technical spec_xmy.
	*
	* @param XMY01058 the xmy01058 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01058(java.lang.String XMY01058) {
		_vrTechnicalSpec_XMY.setXMY01058(XMY01058);
	}

	/**
	* Sets the xmy01059 of this vr technical spec_xmy.
	*
	* @param XMY01059 the xmy01059 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01059(java.lang.String XMY01059) {
		_vrTechnicalSpec_XMY.setXMY01059(XMY01059);
	}

	/**
	* Sets the xmy01060 of this vr technical spec_xmy.
	*
	* @param XMY01060 the xmy01060 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01060(java.lang.String XMY01060) {
		_vrTechnicalSpec_XMY.setXMY01060(XMY01060);
	}

	/**
	* Sets the xmy01062 of this vr technical spec_xmy.
	*
	* @param XMY01062 the xmy01062 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01062(java.lang.String XMY01062) {
		_vrTechnicalSpec_XMY.setXMY01062(XMY01062);
	}

	/**
	* Sets the xmy01063 of this vr technical spec_xmy.
	*
	* @param XMY01063 the xmy01063 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01063(java.lang.String XMY01063) {
		_vrTechnicalSpec_XMY.setXMY01063(XMY01063);
	}

	/**
	* Sets the xmy01064 of this vr technical spec_xmy.
	*
	* @param XMY01064 the xmy01064 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01064(java.lang.String XMY01064) {
		_vrTechnicalSpec_XMY.setXMY01064(XMY01064);
	}

	/**
	* Sets the xmy01065 of this vr technical spec_xmy.
	*
	* @param XMY01065 the xmy01065 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01065(java.lang.String XMY01065) {
		_vrTechnicalSpec_XMY.setXMY01065(XMY01065);
	}

	/**
	* Sets the xmy01670 of this vr technical spec_xmy.
	*
	* @param XMY01670 the xmy01670 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01670(java.lang.String XMY01670) {
		_vrTechnicalSpec_XMY.setXMY01670(XMY01670);
	}

	/**
	* Sets the xmy01671 of this vr technical spec_xmy.
	*
	* @param XMY01671 the xmy01671 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01671(java.lang.String XMY01671) {
		_vrTechnicalSpec_XMY.setXMY01671(XMY01671);
	}

	/**
	* Sets the xmy01672 of this vr technical spec_xmy.
	*
	* @param XMY01672 the xmy01672 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01672(java.lang.String XMY01672) {
		_vrTechnicalSpec_XMY.setXMY01672(XMY01672);
	}

	/**
	* Sets the xmy01673 of this vr technical spec_xmy.
	*
	* @param XMY01673 the xmy01673 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01673(java.lang.String XMY01673) {
		_vrTechnicalSpec_XMY.setXMY01673(XMY01673);
	}

	/**
	* Sets the xmy01674 of this vr technical spec_xmy.
	*
	* @param XMY01674 the xmy01674 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01674(java.lang.String XMY01674) {
		_vrTechnicalSpec_XMY.setXMY01674(XMY01674);
	}

	/**
	* Sets the xmy01675 of this vr technical spec_xmy.
	*
	* @param XMY01675 the xmy01675 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01675(java.lang.String XMY01675) {
		_vrTechnicalSpec_XMY.setXMY01675(XMY01675);
	}

	/**
	* Sets the xmy01676 of this vr technical spec_xmy.
	*
	* @param XMY01676 the xmy01676 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01676(java.lang.String XMY01676) {
		_vrTechnicalSpec_XMY.setXMY01676(XMY01676);
	}

	/**
	* Sets the xmy01677 of this vr technical spec_xmy.
	*
	* @param XMY01677 the xmy01677 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01677(java.lang.String XMY01677) {
		_vrTechnicalSpec_XMY.setXMY01677(XMY01677);
	}

	/**
	* Sets the xmy01678 of this vr technical spec_xmy.
	*
	* @param XMY01678 the xmy01678 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01678(java.lang.String XMY01678) {
		_vrTechnicalSpec_XMY.setXMY01678(XMY01678);
	}

	/**
	* Sets the xmy01679 of this vr technical spec_xmy.
	*
	* @param XMY01679 the xmy01679 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01679(java.lang.String XMY01679) {
		_vrTechnicalSpec_XMY.setXMY01679(XMY01679);
	}

	/**
	* Sets the xmy01680 of this vr technical spec_xmy.
	*
	* @param XMY01680 the xmy01680 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01680(java.lang.String XMY01680) {
		_vrTechnicalSpec_XMY.setXMY01680(XMY01680);
	}

	/**
	* Sets the xmy01681 of this vr technical spec_xmy.
	*
	* @param XMY01681 the xmy01681 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01681(java.lang.String XMY01681) {
		_vrTechnicalSpec_XMY.setXMY01681(XMY01681);
	}

	/**
	* Sets the xmy01682 of this vr technical spec_xmy.
	*
	* @param XMY01682 the xmy01682 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01682(java.lang.String XMY01682) {
		_vrTechnicalSpec_XMY.setXMY01682(XMY01682);
	}

	/**
	* Sets the xmy01683 of this vr technical spec_xmy.
	*
	* @param XMY01683 the xmy01683 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01683(java.lang.String XMY01683) {
		_vrTechnicalSpec_XMY.setXMY01683(XMY01683);
	}

	/**
	* Sets the xmy01684 of this vr technical spec_xmy.
	*
	* @param XMY01684 the xmy01684 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01684(java.lang.String XMY01684) {
		_vrTechnicalSpec_XMY.setXMY01684(XMY01684);
	}

	/**
	* Sets the xmy01685 of this vr technical spec_xmy.
	*
	* @param XMY01685 the xmy01685 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01685(java.lang.String XMY01685) {
		_vrTechnicalSpec_XMY.setXMY01685(XMY01685);
	}

	/**
	* Sets the xmy01686 of this vr technical spec_xmy.
	*
	* @param XMY01686 the xmy01686 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01686(java.lang.String XMY01686) {
		_vrTechnicalSpec_XMY.setXMY01686(XMY01686);
	}

	/**
	* Sets the xmy01687 of this vr technical spec_xmy.
	*
	* @param XMY01687 the xmy01687 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01687(java.lang.String XMY01687) {
		_vrTechnicalSpec_XMY.setXMY01687(XMY01687);
	}

	/**
	* Sets the xmy01688 of this vr technical spec_xmy.
	*
	* @param XMY01688 the xmy01688 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01688(java.lang.String XMY01688) {
		_vrTechnicalSpec_XMY.setXMY01688(XMY01688);
	}

	/**
	* Sets the xmy01689 of this vr technical spec_xmy.
	*
	* @param XMY01689 the xmy01689 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01689(java.lang.String XMY01689) {
		_vrTechnicalSpec_XMY.setXMY01689(XMY01689);
	}

	/**
	* Sets the xmy01690 of this vr technical spec_xmy.
	*
	* @param XMY01690 the xmy01690 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01690(java.lang.String XMY01690) {
		_vrTechnicalSpec_XMY.setXMY01690(XMY01690);
	}

	/**
	* Sets the xmy01691 of this vr technical spec_xmy.
	*
	* @param XMY01691 the xmy01691 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01691(java.lang.String XMY01691) {
		_vrTechnicalSpec_XMY.setXMY01691(XMY01691);
	}

	/**
	* Sets the xmy01692 of this vr technical spec_xmy.
	*
	* @param XMY01692 the xmy01692 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01692(java.lang.String XMY01692) {
		_vrTechnicalSpec_XMY.setXMY01692(XMY01692);
	}

	/**
	* Sets the xmy01693 of this vr technical spec_xmy.
	*
	* @param XMY01693 the xmy01693 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01693(java.lang.String XMY01693) {
		_vrTechnicalSpec_XMY.setXMY01693(XMY01693);
	}

	/**
	* Sets the xmy01694 of this vr technical spec_xmy.
	*
	* @param XMY01694 the xmy01694 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01694(java.lang.String XMY01694) {
		_vrTechnicalSpec_XMY.setXMY01694(XMY01694);
	}

	/**
	* Sets the xmy01695 of this vr technical spec_xmy.
	*
	* @param XMY01695 the xmy01695 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01695(java.lang.String XMY01695) {
		_vrTechnicalSpec_XMY.setXMY01695(XMY01695);
	}

	/**
	* Sets the xmy01696 of this vr technical spec_xmy.
	*
	* @param XMY01696 the xmy01696 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01696(java.lang.String XMY01696) {
		_vrTechnicalSpec_XMY.setXMY01696(XMY01696);
	}

	/**
	* Sets the xmy01697 of this vr technical spec_xmy.
	*
	* @param XMY01697 the xmy01697 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01697(java.lang.String XMY01697) {
		_vrTechnicalSpec_XMY.setXMY01697(XMY01697);
	}

	/**
	* Sets the xmy01698 of this vr technical spec_xmy.
	*
	* @param XMY01698 the xmy01698 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01698(java.lang.String XMY01698) {
		_vrTechnicalSpec_XMY.setXMY01698(XMY01698);
	}

	/**
	* Sets the xmy01699 of this vr technical spec_xmy.
	*
	* @param XMY01699 the xmy01699 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01699(java.lang.String XMY01699) {
		_vrTechnicalSpec_XMY.setXMY01699(XMY01699);
	}

	/**
	* Sets the xmy01700 of this vr technical spec_xmy.
	*
	* @param XMY01700 the xmy01700 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01700(java.lang.String XMY01700) {
		_vrTechnicalSpec_XMY.setXMY01700(XMY01700);
	}

	/**
	* Sets the xmy01701 of this vr technical spec_xmy.
	*
	* @param XMY01701 the xmy01701 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01701(java.lang.String XMY01701) {
		_vrTechnicalSpec_XMY.setXMY01701(XMY01701);
	}

	/**
	* Sets the xmy01702 of this vr technical spec_xmy.
	*
	* @param XMY01702 the xmy01702 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01702(java.lang.String XMY01702) {
		_vrTechnicalSpec_XMY.setXMY01702(XMY01702);
	}

	/**
	* Sets the xmy01703 of this vr technical spec_xmy.
	*
	* @param XMY01703 the xmy01703 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01703(java.lang.String XMY01703) {
		_vrTechnicalSpec_XMY.setXMY01703(XMY01703);
	}

	/**
	* Sets the xmy01704 of this vr technical spec_xmy.
	*
	* @param XMY01704 the xmy01704 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01704(java.lang.String XMY01704) {
		_vrTechnicalSpec_XMY.setXMY01704(XMY01704);
	}

	/**
	* Sets the xmy01705 of this vr technical spec_xmy.
	*
	* @param XMY01705 the xmy01705 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01705(java.lang.String XMY01705) {
		_vrTechnicalSpec_XMY.setXMY01705(XMY01705);
	}

	/**
	* Sets the xmy01706 of this vr technical spec_xmy.
	*
	* @param XMY01706 the xmy01706 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01706(java.lang.String XMY01706) {
		_vrTechnicalSpec_XMY.setXMY01706(XMY01706);
	}

	/**
	* Sets the xmy01707 of this vr technical spec_xmy.
	*
	* @param XMY01707 the xmy01707 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01707(java.lang.String XMY01707) {
		_vrTechnicalSpec_XMY.setXMY01707(XMY01707);
	}

	/**
	* Sets the xmy01708 of this vr technical spec_xmy.
	*
	* @param XMY01708 the xmy01708 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01708(java.lang.String XMY01708) {
		_vrTechnicalSpec_XMY.setXMY01708(XMY01708);
	}

	/**
	* Sets the xmy01709 of this vr technical spec_xmy.
	*
	* @param XMY01709 the xmy01709 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01709(java.lang.String XMY01709) {
		_vrTechnicalSpec_XMY.setXMY01709(XMY01709);
	}

	/**
	* Sets the xmy01710 of this vr technical spec_xmy.
	*
	* @param XMY01710 the xmy01710 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01710(java.lang.String XMY01710) {
		_vrTechnicalSpec_XMY.setXMY01710(XMY01710);
	}

	/**
	* Sets the xmy01711 of this vr technical spec_xmy.
	*
	* @param XMY01711 the xmy01711 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01711(java.lang.String XMY01711) {
		_vrTechnicalSpec_XMY.setXMY01711(XMY01711);
	}

	/**
	* Sets the xmy01712 of this vr technical spec_xmy.
	*
	* @param XMY01712 the xmy01712 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01712(java.lang.String XMY01712) {
		_vrTechnicalSpec_XMY.setXMY01712(XMY01712);
	}

	/**
	* Sets the xmy01713 of this vr technical spec_xmy.
	*
	* @param XMY01713 the xmy01713 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01713(java.lang.String XMY01713) {
		_vrTechnicalSpec_XMY.setXMY01713(XMY01713);
	}

	/**
	* Sets the xmy01714 of this vr technical spec_xmy.
	*
	* @param XMY01714 the xmy01714 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01714(java.lang.String XMY01714) {
		_vrTechnicalSpec_XMY.setXMY01714(XMY01714);
	}

	/**
	* Sets the xmy01715 of this vr technical spec_xmy.
	*
	* @param XMY01715 the xmy01715 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01715(java.lang.String XMY01715) {
		_vrTechnicalSpec_XMY.setXMY01715(XMY01715);
	}

	/**
	* Sets the xmy01716 of this vr technical spec_xmy.
	*
	* @param XMY01716 the xmy01716 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01716(java.lang.String XMY01716) {
		_vrTechnicalSpec_XMY.setXMY01716(XMY01716);
	}

	/**
	* Sets the xmy01717 of this vr technical spec_xmy.
	*
	* @param XMY01717 the xmy01717 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01717(java.lang.String XMY01717) {
		_vrTechnicalSpec_XMY.setXMY01717(XMY01717);
	}

	/**
	* Sets the xmy01718 of this vr technical spec_xmy.
	*
	* @param XMY01718 the xmy01718 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01718(java.lang.String XMY01718) {
		_vrTechnicalSpec_XMY.setXMY01718(XMY01718);
	}

	/**
	* Sets the xmy01719 of this vr technical spec_xmy.
	*
	* @param XMY01719 the xmy01719 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01719(java.lang.String XMY01719) {
		_vrTechnicalSpec_XMY.setXMY01719(XMY01719);
	}

	/**
	* Sets the xmy01720 of this vr technical spec_xmy.
	*
	* @param XMY01720 the xmy01720 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01720(java.lang.String XMY01720) {
		_vrTechnicalSpec_XMY.setXMY01720(XMY01720);
	}

	/**
	* Sets the xmy01721 of this vr technical spec_xmy.
	*
	* @param XMY01721 the xmy01721 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01721(java.lang.String XMY01721) {
		_vrTechnicalSpec_XMY.setXMY01721(XMY01721);
	}

	/**
	* Sets the xmy01722 of this vr technical spec_xmy.
	*
	* @param XMY01722 the xmy01722 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01722(java.lang.String XMY01722) {
		_vrTechnicalSpec_XMY.setXMY01722(XMY01722);
	}

	/**
	* Sets the xmy01723 of this vr technical spec_xmy.
	*
	* @param XMY01723 the xmy01723 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01723(java.lang.String XMY01723) {
		_vrTechnicalSpec_XMY.setXMY01723(XMY01723);
	}

	/**
	* Sets the xmy01724 of this vr technical spec_xmy.
	*
	* @param XMY01724 the xmy01724 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01724(java.lang.String XMY01724) {
		_vrTechnicalSpec_XMY.setXMY01724(XMY01724);
	}

	/**
	* Sets the xmy01725 of this vr technical spec_xmy.
	*
	* @param XMY01725 the xmy01725 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01725(java.lang.String XMY01725) {
		_vrTechnicalSpec_XMY.setXMY01725(XMY01725);
	}

	/**
	* Sets the xmy01726 of this vr technical spec_xmy.
	*
	* @param XMY01726 the xmy01726 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01726(java.lang.String XMY01726) {
		_vrTechnicalSpec_XMY.setXMY01726(XMY01726);
	}

	/**
	* Sets the xmy01729 of this vr technical spec_xmy.
	*
	* @param XMY01729 the xmy01729 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01729(java.lang.String XMY01729) {
		_vrTechnicalSpec_XMY.setXMY01729(XMY01729);
	}

	/**
	* Sets the xmy01730 of this vr technical spec_xmy.
	*
	* @param XMY01730 the xmy01730 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01730(java.lang.String XMY01730) {
		_vrTechnicalSpec_XMY.setXMY01730(XMY01730);
	}

	/**
	* Sets the xmy01731 of this vr technical spec_xmy.
	*
	* @param XMY01731 the xmy01731 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01731(java.lang.String XMY01731) {
		_vrTechnicalSpec_XMY.setXMY01731(XMY01731);
	}

	/**
	* Sets the xmy01732 of this vr technical spec_xmy.
	*
	* @param XMY01732 the xmy01732 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01732(java.lang.String XMY01732) {
		_vrTechnicalSpec_XMY.setXMY01732(XMY01732);
	}

	/**
	* Sets the xmy01733 of this vr technical spec_xmy.
	*
	* @param XMY01733 the xmy01733 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01733(java.lang.String XMY01733) {
		_vrTechnicalSpec_XMY.setXMY01733(XMY01733);
	}

	/**
	* Sets the xmy01734 of this vr technical spec_xmy.
	*
	* @param XMY01734 the xmy01734 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01734(java.lang.String XMY01734) {
		_vrTechnicalSpec_XMY.setXMY01734(XMY01734);
	}

	/**
	* Sets the xmy01735 of this vr technical spec_xmy.
	*
	* @param XMY01735 the xmy01735 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01735(java.lang.String XMY01735) {
		_vrTechnicalSpec_XMY.setXMY01735(XMY01735);
	}

	/**
	* Sets the xmy01736 of this vr technical spec_xmy.
	*
	* @param XMY01736 the xmy01736 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01736(java.lang.String XMY01736) {
		_vrTechnicalSpec_XMY.setXMY01736(XMY01736);
	}

	/**
	* Sets the xmy01737 of this vr technical spec_xmy.
	*
	* @param XMY01737 the xmy01737 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01737(java.lang.String XMY01737) {
		_vrTechnicalSpec_XMY.setXMY01737(XMY01737);
	}

	/**
	* Sets the xmy01738 of this vr technical spec_xmy.
	*
	* @param XMY01738 the xmy01738 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01738(java.lang.String XMY01738) {
		_vrTechnicalSpec_XMY.setXMY01738(XMY01738);
	}

	/**
	* Sets the xmy01739 of this vr technical spec_xmy.
	*
	* @param XMY01739 the xmy01739 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01739(java.lang.String XMY01739) {
		_vrTechnicalSpec_XMY.setXMY01739(XMY01739);
	}

	/**
	* Sets the xmy01740 of this vr technical spec_xmy.
	*
	* @param XMY01740 the xmy01740 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01740(java.lang.String XMY01740) {
		_vrTechnicalSpec_XMY.setXMY01740(XMY01740);
	}

	/**
	* Sets the xmy01741 of this vr technical spec_xmy.
	*
	* @param XMY01741 the xmy01741 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01741(java.lang.String XMY01741) {
		_vrTechnicalSpec_XMY.setXMY01741(XMY01741);
	}

	/**
	* Sets the xmy01742 of this vr technical spec_xmy.
	*
	* @param XMY01742 the xmy01742 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01742(java.lang.String XMY01742) {
		_vrTechnicalSpec_XMY.setXMY01742(XMY01742);
	}

	/**
	* Sets the xmy01744 of this vr technical spec_xmy.
	*
	* @param XMY01744 the xmy01744 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01744(java.lang.String XMY01744) {
		_vrTechnicalSpec_XMY.setXMY01744(XMY01744);
	}

	/**
	* Sets the xmy01745 of this vr technical spec_xmy.
	*
	* @param XMY01745 the xmy01745 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01745(java.lang.String XMY01745) {
		_vrTechnicalSpec_XMY.setXMY01745(XMY01745);
	}

	/**
	* Sets the xmy01746 of this vr technical spec_xmy.
	*
	* @param XMY01746 the xmy01746 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01746(java.lang.String XMY01746) {
		_vrTechnicalSpec_XMY.setXMY01746(XMY01746);
	}

	/**
	* Sets the xmy01747 of this vr technical spec_xmy.
	*
	* @param XMY01747 the xmy01747 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01747(java.lang.String XMY01747) {
		_vrTechnicalSpec_XMY.setXMY01747(XMY01747);
	}

	/**
	* Sets the xmy01748 of this vr technical spec_xmy.
	*
	* @param XMY01748 the xmy01748 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01748(java.lang.String XMY01748) {
		_vrTechnicalSpec_XMY.setXMY01748(XMY01748);
	}

	/**
	* Sets the xmy01749 of this vr technical spec_xmy.
	*
	* @param XMY01749 the xmy01749 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01749(java.lang.String XMY01749) {
		_vrTechnicalSpec_XMY.setXMY01749(XMY01749);
	}

	/**
	* Sets the xmy01758 of this vr technical spec_xmy.
	*
	* @param XMY01758 the xmy01758 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01758(java.lang.String XMY01758) {
		_vrTechnicalSpec_XMY.setXMY01758(XMY01758);
	}

	/**
	* Sets the xmy01759 of this vr technical spec_xmy.
	*
	* @param XMY01759 the xmy01759 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01759(java.lang.String XMY01759) {
		_vrTechnicalSpec_XMY.setXMY01759(XMY01759);
	}

	/**
	* Sets the xmy01760 of this vr technical spec_xmy.
	*
	* @param XMY01760 the xmy01760 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01760(java.lang.String XMY01760) {
		_vrTechnicalSpec_XMY.setXMY01760(XMY01760);
	}

	/**
	* Sets the xmy01761 of this vr technical spec_xmy.
	*
	* @param XMY01761 the xmy01761 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01761(java.lang.String XMY01761) {
		_vrTechnicalSpec_XMY.setXMY01761(XMY01761);
	}

	/**
	* Sets the xmy01762 of this vr technical spec_xmy.
	*
	* @param XMY01762 the xmy01762 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01762(java.lang.String XMY01762) {
		_vrTechnicalSpec_XMY.setXMY01762(XMY01762);
	}

	/**
	* Sets the xmy01763 of this vr technical spec_xmy.
	*
	* @param XMY01763 the xmy01763 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01763(java.lang.String XMY01763) {
		_vrTechnicalSpec_XMY.setXMY01763(XMY01763);
	}

	/**
	* Sets the xmy01764 of this vr technical spec_xmy.
	*
	* @param XMY01764 the xmy01764 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01764(java.lang.String XMY01764) {
		_vrTechnicalSpec_XMY.setXMY01764(XMY01764);
	}

	/**
	* Sets the xmy01779 of this vr technical spec_xmy.
	*
	* @param XMY01779 the xmy01779 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01779(java.lang.String XMY01779) {
		_vrTechnicalSpec_XMY.setXMY01779(XMY01779);
	}

	/**
	* Sets the xmy01780 of this vr technical spec_xmy.
	*
	* @param XMY01780 the xmy01780 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01780(java.lang.String XMY01780) {
		_vrTechnicalSpec_XMY.setXMY01780(XMY01780);
	}

	/**
	* Sets the xmy01781 of this vr technical spec_xmy.
	*
	* @param XMY01781 the xmy01781 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01781(java.lang.String XMY01781) {
		_vrTechnicalSpec_XMY.setXMY01781(XMY01781);
	}

	/**
	* Sets the xmy01782 of this vr technical spec_xmy.
	*
	* @param XMY01782 the xmy01782 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01782(java.lang.String XMY01782) {
		_vrTechnicalSpec_XMY.setXMY01782(XMY01782);
	}

	/**
	* Sets the xmy01783 of this vr technical spec_xmy.
	*
	* @param XMY01783 the xmy01783 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01783(java.lang.String XMY01783) {
		_vrTechnicalSpec_XMY.setXMY01783(XMY01783);
	}

	/**
	* Sets the xmy01785 of this vr technical spec_xmy.
	*
	* @param XMY01785 the xmy01785 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01785(java.lang.String XMY01785) {
		_vrTechnicalSpec_XMY.setXMY01785(XMY01785);
	}

	/**
	* Sets the xmy01786 of this vr technical spec_xmy.
	*
	* @param XMY01786 the xmy01786 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01786(java.lang.String XMY01786) {
		_vrTechnicalSpec_XMY.setXMY01786(XMY01786);
	}

	/**
	* Sets the xmy01787 of this vr technical spec_xmy.
	*
	* @param XMY01787 the xmy01787 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01787(java.lang.String XMY01787) {
		_vrTechnicalSpec_XMY.setXMY01787(XMY01787);
	}

	/**
	* Sets the xmy01788 of this vr technical spec_xmy.
	*
	* @param XMY01788 the xmy01788 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01788(java.lang.String XMY01788) {
		_vrTechnicalSpec_XMY.setXMY01788(XMY01788);
	}

	/**
	* Sets the xmy01789 of this vr technical spec_xmy.
	*
	* @param XMY01789 the xmy01789 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01789(java.lang.String XMY01789) {
		_vrTechnicalSpec_XMY.setXMY01789(XMY01789);
	}

	/**
	* Sets the xmy01790 of this vr technical spec_xmy.
	*
	* @param XMY01790 the xmy01790 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01790(java.lang.String XMY01790) {
		_vrTechnicalSpec_XMY.setXMY01790(XMY01790);
	}

	/**
	* Sets the xmy01791 of this vr technical spec_xmy.
	*
	* @param XMY01791 the xmy01791 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01791(java.lang.String XMY01791) {
		_vrTechnicalSpec_XMY.setXMY01791(XMY01791);
	}

	/**
	* Sets the xmy01792 of this vr technical spec_xmy.
	*
	* @param XMY01792 the xmy01792 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01792(java.lang.String XMY01792) {
		_vrTechnicalSpec_XMY.setXMY01792(XMY01792);
	}

	/**
	* Sets the xmy01793 of this vr technical spec_xmy.
	*
	* @param XMY01793 the xmy01793 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01793(java.lang.String XMY01793) {
		_vrTechnicalSpec_XMY.setXMY01793(XMY01793);
	}

	/**
	* Sets the xmy01794 of this vr technical spec_xmy.
	*
	* @param XMY01794 the xmy01794 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01794(java.lang.String XMY01794) {
		_vrTechnicalSpec_XMY.setXMY01794(XMY01794);
	}

	/**
	* Sets the xmy01795 of this vr technical spec_xmy.
	*
	* @param XMY01795 the xmy01795 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01795(java.lang.String XMY01795) {
		_vrTechnicalSpec_XMY.setXMY01795(XMY01795);
	}

	/**
	* Sets the xmy01796 of this vr technical spec_xmy.
	*
	* @param XMY01796 the xmy01796 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01796(java.lang.String XMY01796) {
		_vrTechnicalSpec_XMY.setXMY01796(XMY01796);
	}

	/**
	* Sets the xmy01797 of this vr technical spec_xmy.
	*
	* @param XMY01797 the xmy01797 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01797(java.lang.String XMY01797) {
		_vrTechnicalSpec_XMY.setXMY01797(XMY01797);
	}

	/**
	* Sets the xmy01798 of this vr technical spec_xmy.
	*
	* @param XMY01798 the xmy01798 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01798(java.lang.String XMY01798) {
		_vrTechnicalSpec_XMY.setXMY01798(XMY01798);
	}

	/**
	* Sets the xmy01799 of this vr technical spec_xmy.
	*
	* @param XMY01799 the xmy01799 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01799(java.lang.String XMY01799) {
		_vrTechnicalSpec_XMY.setXMY01799(XMY01799);
	}

	/**
	* Sets the xmy01800 of this vr technical spec_xmy.
	*
	* @param XMY01800 the xmy01800 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01800(java.lang.String XMY01800) {
		_vrTechnicalSpec_XMY.setXMY01800(XMY01800);
	}

	/**
	* Sets the xmy01801 of this vr technical spec_xmy.
	*
	* @param XMY01801 the xmy01801 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01801(java.lang.String XMY01801) {
		_vrTechnicalSpec_XMY.setXMY01801(XMY01801);
	}

	/**
	* Sets the xmy01802 of this vr technical spec_xmy.
	*
	* @param XMY01802 the xmy01802 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01802(java.lang.String XMY01802) {
		_vrTechnicalSpec_XMY.setXMY01802(XMY01802);
	}

	/**
	* Sets the xmy01804 of this vr technical spec_xmy.
	*
	* @param XMY01804 the xmy01804 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01804(java.lang.String XMY01804) {
		_vrTechnicalSpec_XMY.setXMY01804(XMY01804);
	}

	/**
	* Sets the xmy01805 of this vr technical spec_xmy.
	*
	* @param XMY01805 the xmy01805 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01805(java.lang.String XMY01805) {
		_vrTechnicalSpec_XMY.setXMY01805(XMY01805);
	}

	/**
	* Sets the xmy01806 of this vr technical spec_xmy.
	*
	* @param XMY01806 the xmy01806 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01806(java.lang.String XMY01806) {
		_vrTechnicalSpec_XMY.setXMY01806(XMY01806);
	}

	/**
	* Sets the xmy01807 of this vr technical spec_xmy.
	*
	* @param XMY01807 the xmy01807 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01807(java.lang.String XMY01807) {
		_vrTechnicalSpec_XMY.setXMY01807(XMY01807);
	}

	/**
	* Sets the xmy01808 of this vr technical spec_xmy.
	*
	* @param XMY01808 the xmy01808 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01808(java.lang.String XMY01808) {
		_vrTechnicalSpec_XMY.setXMY01808(XMY01808);
	}

	/**
	* Sets the xmy01809 of this vr technical spec_xmy.
	*
	* @param XMY01809 the xmy01809 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01809(java.lang.String XMY01809) {
		_vrTechnicalSpec_XMY.setXMY01809(XMY01809);
	}

	/**
	* Sets the xmy01810 of this vr technical spec_xmy.
	*
	* @param XMY01810 the xmy01810 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01810(java.lang.String XMY01810) {
		_vrTechnicalSpec_XMY.setXMY01810(XMY01810);
	}

	/**
	* Sets the xmy01811 of this vr technical spec_xmy.
	*
	* @param XMY01811 the xmy01811 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01811(java.lang.String XMY01811) {
		_vrTechnicalSpec_XMY.setXMY01811(XMY01811);
	}

	/**
	* Sets the xmy01812 of this vr technical spec_xmy.
	*
	* @param XMY01812 the xmy01812 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01812(java.lang.String XMY01812) {
		_vrTechnicalSpec_XMY.setXMY01812(XMY01812);
	}

	/**
	* Sets the xmy01813 of this vr technical spec_xmy.
	*
	* @param XMY01813 the xmy01813 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01813(java.lang.String XMY01813) {
		_vrTechnicalSpec_XMY.setXMY01813(XMY01813);
	}

	/**
	* Sets the xmy01814 of this vr technical spec_xmy.
	*
	* @param XMY01814 the xmy01814 of this vr technical spec_xmy
	*/
	@Override
	public void setXMY01814(java.lang.String XMY01814) {
		_vrTechnicalSpec_XMY.setXMY01814(XMY01814);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XMYWrapper)) {
			return false;
		}

		VRTechnicalSpec_XMYWrapper vrTechnicalSpec_XMYWrapper = (VRTechnicalSpec_XMYWrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XMY,
					vrTechnicalSpec_XMYWrapper._vrTechnicalSpec_XMY)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XMY getWrappedModel() {
		return _vrTechnicalSpec_XMY;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XMY.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XMY.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XMY.resetOriginalValues();
	}

	private final VRTechnicalSpec_XMY _vrTechnicalSpec_XMY;
}