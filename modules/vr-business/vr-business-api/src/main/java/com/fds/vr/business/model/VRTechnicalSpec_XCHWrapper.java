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
 * This class is a wrapper for {@link VRTechnicalSpec_XCH}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCH
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCHWrapper implements VRTechnicalSpec_XCH,
	ModelWrapper<VRTechnicalSpec_XCH> {
	public VRTechnicalSpec_XCHWrapper(VRTechnicalSpec_XCH vrTechnicalSpec_XCH) {
		_vrTechnicalSpec_XCH = vrTechnicalSpec_XCH;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XCH.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XCH.class.getName();
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
		attributes.put("XCH01001", getXCH01001());
		attributes.put("XCH01002", getXCH01002());
		attributes.put("XCH01003", getXCH01003());
		attributes.put("XCH01004", getXCH01004());
		attributes.put("XCH01005", getXCH01005());
		attributes.put("XCH01006", getXCH01006());
		attributes.put("XCH01007", getXCH01007());
		attributes.put("XCH01008", getXCH01008());
		attributes.put("XCH01009", getXCH01009());
		attributes.put("XCH01010", getXCH01010());
		attributes.put("XCH01011", getXCH01011());
		attributes.put("XCH01012", getXCH01012());
		attributes.put("XCH01013", getXCH01013());
		attributes.put("XCH01014", getXCH01014());
		attributes.put("XCH01016", getXCH01016());
		attributes.put("XCH01017", getXCH01017());
		attributes.put("XCH01019", getXCH01019());
		attributes.put("XCH01020", getXCH01020());
		attributes.put("XCH01021", getXCH01021());
		attributes.put("XCH01022", getXCH01022());
		attributes.put("XCH01024", getXCH01024());
		attributes.put("XCH01025", getXCH01025());
		attributes.put("XCH01026", getXCH01026());
		attributes.put("XCH01027", getXCH01027());
		attributes.put("XCH01028", getXCH01028());
		attributes.put("XCH01030", getXCH01030());
		attributes.put("XCH01031", getXCH01031());
		attributes.put("XCH01032", getXCH01032());
		attributes.put("XCH01033", getXCH01033());
		attributes.put("XCH01034", getXCH01034());
		attributes.put("XCH01035", getXCH01035());
		attributes.put("XCH01036", getXCH01036());
		attributes.put("XCH01037", getXCH01037());
		attributes.put("XCH01038", getXCH01038());
		attributes.put("XCH01039", getXCH01039());
		attributes.put("XCH01040", getXCH01040());
		attributes.put("XCH01041", getXCH01041());
		attributes.put("XCH01042", getXCH01042());
		attributes.put("XCH01043", getXCH01043());
		attributes.put("XCH01044", getXCH01044());
		attributes.put("XCH01045", getXCH01045());
		attributes.put("XCH01046", getXCH01046());
		attributes.put("XCH01047", getXCH01047());
		attributes.put("XCH01049", getXCH01049());
		attributes.put("XCH01050", getXCH01050());
		attributes.put("XCH01051", getXCH01051());
		attributes.put("XCH01052", getXCH01052());
		attributes.put("XCH01053", getXCH01053());
		attributes.put("XCH01054", getXCH01054());
		attributes.put("XCH01055", getXCH01055());
		attributes.put("XCH01056", getXCH01056());
		attributes.put("XCH01057", getXCH01057());
		attributes.put("XCH01058", getXCH01058());
		attributes.put("XCH01059", getXCH01059());
		attributes.put("XCH01060", getXCH01060());
		attributes.put("XCH01062", getXCH01062());
		attributes.put("XCH01063", getXCH01063());
		attributes.put("XCH01064", getXCH01064());
		attributes.put("XCH01065", getXCH01065());
		attributes.put("XCH01066", getXCH01066());
		attributes.put("XCH01067", getXCH01067());
		attributes.put("XCH01068", getXCH01068());
		attributes.put("XCH01069", getXCH01069());
		attributes.put("XCH01100", getXCH01100());
		attributes.put("XCH01101", getXCH01101());
		attributes.put("XCH01102", getXCH01102());
		attributes.put("XCH01103", getXCH01103());
		attributes.put("XCH01104", getXCH01104());
		attributes.put("XCH01105", getXCH01105());
		attributes.put("XCH01106", getXCH01106());
		attributes.put("XCH01107", getXCH01107());
		attributes.put("XCH01108", getXCH01108());
		attributes.put("XCH01109", getXCH01109());
		attributes.put("XCH01110", getXCH01110());
		attributes.put("XCH01111", getXCH01111());
		attributes.put("XCH01112", getXCH01112());
		attributes.put("XCH01113", getXCH01113());
		attributes.put("XCH01114", getXCH01114());
		attributes.put("XCH01115", getXCH01115());
		attributes.put("XCH01116", getXCH01116());
		attributes.put("XCH01117", getXCH01117());
		attributes.put("XCH01118", getXCH01118());
		attributes.put("XCH01119", getXCH01119());
		attributes.put("XCH01120", getXCH01120());
		attributes.put("XCH01121", getXCH01121());
		attributes.put("XCH01122", getXCH01122());
		attributes.put("XCH01123", getXCH01123());
		attributes.put("XCH01124", getXCH01124());
		attributes.put("XCH01125", getXCH01125());
		attributes.put("XCH01126", getXCH01126());
		attributes.put("XCH01127", getXCH01127());
		attributes.put("XCH01128", getXCH01128());
		attributes.put("XCH01129", getXCH01129());
		attributes.put("XCH01130", getXCH01130());
		attributes.put("XCH01131", getXCH01131());
		attributes.put("XCH01132", getXCH01132());
		attributes.put("XCH01133", getXCH01133());
		attributes.put("XCH01134", getXCH01134());
		attributes.put("XCH01135", getXCH01135());
		attributes.put("XCH01136", getXCH01136());
		attributes.put("XCH01137", getXCH01137());
		attributes.put("XCH01138", getXCH01138());
		attributes.put("XCH01139", getXCH01139());
		attributes.put("XCH01140", getXCH01140());
		attributes.put("XCH01141", getXCH01141());
		attributes.put("XCH01142", getXCH01142());
		attributes.put("XCH01143", getXCH01143());
		attributes.put("XCH01144", getXCH01144());
		attributes.put("XCH01145", getXCH01145());
		attributes.put("XCH01146", getXCH01146());
		attributes.put("XCH01147", getXCH01147());
		attributes.put("XCH01148", getXCH01148());
		attributes.put("XCH01149", getXCH01149());
		attributes.put("XCH01150", getXCH01150());
		attributes.put("XCH01151", getXCH01151());
		attributes.put("XCH01152", getXCH01152());
		attributes.put("XCH01153", getXCH01153());
		attributes.put("XCH01154", getXCH01154());
		attributes.put("XCH01155", getXCH01155());
		attributes.put("XCH01156", getXCH01156());
		attributes.put("XCH01157", getXCH01157());
		attributes.put("XCH01158", getXCH01158());
		attributes.put("XCH01159", getXCH01159());
		attributes.put("XCH01160", getXCH01160());
		attributes.put("XCH01161", getXCH01161());
		attributes.put("XCH01162", getXCH01162());
		attributes.put("XCH01163", getXCH01163());
		attributes.put("XCH01164", getXCH01164());
		attributes.put("XCH01165", getXCH01165());
		attributes.put("XCH01166", getXCH01166());
		attributes.put("XCH01167", getXCH01167());
		attributes.put("XCH01168", getXCH01168());
		attributes.put("XCH01169", getXCH01169());
		attributes.put("XCH01170", getXCH01170());
		attributes.put("XCH01171", getXCH01171());
		attributes.put("XCH01172", getXCH01172());
		attributes.put("XCH01173", getXCH01173());
		attributes.put("XCH01174", getXCH01174());
		attributes.put("XCH01175", getXCH01175());
		attributes.put("XCH01176", getXCH01176());
		attributes.put("XCH01177", getXCH01177());
		attributes.put("XCH01178", getXCH01178());
		attributes.put("XCH01179", getXCH01179());
		attributes.put("XCH01180", getXCH01180());
		attributes.put("XCH01181", getXCH01181());
		attributes.put("XCH01182", getXCH01182());
		attributes.put("XCH01183", getXCH01183());
		attributes.put("XCH01184", getXCH01184());
		attributes.put("XCH01185", getXCH01185());
		attributes.put("XCH01186", getXCH01186());
		attributes.put("XCH01187", getXCH01187());
		attributes.put("XCH01188", getXCH01188());
		attributes.put("XCH01189", getXCH01189());
		attributes.put("XCH01190", getXCH01190());
		attributes.put("XCH01191", getXCH01191());
		attributes.put("XCH01192", getXCH01192());
		attributes.put("XCH01193", getXCH01193());
		attributes.put("XCH01194", getXCH01194());
		attributes.put("XCH01195", getXCH01195());
		attributes.put("XCH01196", getXCH01196());
		attributes.put("XCH01197", getXCH01197());
		attributes.put("XCH01198", getXCH01198());
		attributes.put("XCH01199", getXCH01199());
		attributes.put("XCH01200", getXCH01200());
		attributes.put("XCH01201", getXCH01201());
		attributes.put("XCH01202", getXCH01202());
		attributes.put("XCH01203", getXCH01203());
		attributes.put("XCH01204", getXCH01204());
		attributes.put("XCH01205", getXCH01205());
		attributes.put("XCH01206", getXCH01206());
		attributes.put("XCH01207", getXCH01207());
		attributes.put("XCH01208", getXCH01208());
		attributes.put("XCH01209", getXCH01209());
		attributes.put("XCH01210", getXCH01210());
		attributes.put("XCH01211", getXCH01211());
		attributes.put("XCH01212", getXCH01212());
		attributes.put("XCH01213", getXCH01213());
		attributes.put("XCH01214", getXCH01214());
		attributes.put("XCH01215", getXCH01215());
		attributes.put("XCH01216", getXCH01216());
		attributes.put("XCH01217", getXCH01217());
		attributes.put("XCH01218", getXCH01218());
		attributes.put("XCH01219", getXCH01219());
		attributes.put("XCH01220", getXCH01220());
		attributes.put("XCH01221", getXCH01221());
		attributes.put("XCH01222", getXCH01222());
		attributes.put("XCH01223", getXCH01223());
		attributes.put("XCH01224", getXCH01224());
		attributes.put("XCH01225", getXCH01225());
		attributes.put("XCH01226", getXCH01226());
		attributes.put("XCH01227", getXCH01227());
		attributes.put("XCH01228", getXCH01228());
		attributes.put("XCH01229", getXCH01229());
		attributes.put("XCH01230", getXCH01230());
		attributes.put("XCH01231", getXCH01231());
		attributes.put("XCH01232", getXCH01232());
		attributes.put("XCH01233", getXCH01233());
		attributes.put("XCH01234", getXCH01234());
		attributes.put("XCH01235", getXCH01235());
		attributes.put("XCH01236", getXCH01236());
		attributes.put("XCH01237", getXCH01237());
		attributes.put("XCH01238", getXCH01238());
		attributes.put("XCH01239", getXCH01239());
		attributes.put("XCH01240", getXCH01240());
		attributes.put("XCH01241", getXCH01241());
		attributes.put("XCH01242", getXCH01242());
		attributes.put("XCH01243", getXCH01243());
		attributes.put("XCH01244", getXCH01244());
		attributes.put("XCH01245", getXCH01245());
		attributes.put("XCH01246", getXCH01246());
		attributes.put("XCH01247", getXCH01247());
		attributes.put("XCH01248", getXCH01248());
		attributes.put("XCH01249", getXCH01249());
		attributes.put("XCH01250", getXCH01250());
		attributes.put("XCH01251", getXCH01251());
		attributes.put("XCH01252", getXCH01252());
		attributes.put("XCH01253", getXCH01253());
		attributes.put("XCH01254", getXCH01254());
		attributes.put("XCH01255", getXCH01255());
		attributes.put("XCH01256", getXCH01256());
		attributes.put("XCH01257", getXCH01257());
		attributes.put("XCH01258", getXCH01258());
		attributes.put("XCH01259", getXCH01259());
		attributes.put("XCH01260", getXCH01260());
		attributes.put("XCH01261", getXCH01261());
		attributes.put("XCH01262", getXCH01262());
		attributes.put("XCH01263", getXCH01263());
		attributes.put("XCH01264", getXCH01264());
		attributes.put("XCH01265", getXCH01265());
		attributes.put("XCH01266", getXCH01266());
		attributes.put("XCH01267", getXCH01267());
		attributes.put("XCH01268", getXCH01268());
		attributes.put("XCH01269", getXCH01269());
		attributes.put("XCH01270", getXCH01270());
		attributes.put("XCH01271", getXCH01271());
		attributes.put("XCH01272", getXCH01272());
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

		String XCH01001 = (String)attributes.get("XCH01001");

		if (XCH01001 != null) {
			setXCH01001(XCH01001);
		}

		String XCH01002 = (String)attributes.get("XCH01002");

		if (XCH01002 != null) {
			setXCH01002(XCH01002);
		}

		String XCH01003 = (String)attributes.get("XCH01003");

		if (XCH01003 != null) {
			setXCH01003(XCH01003);
		}

		String XCH01004 = (String)attributes.get("XCH01004");

		if (XCH01004 != null) {
			setXCH01004(XCH01004);
		}

		String XCH01005 = (String)attributes.get("XCH01005");

		if (XCH01005 != null) {
			setXCH01005(XCH01005);
		}

		String XCH01006 = (String)attributes.get("XCH01006");

		if (XCH01006 != null) {
			setXCH01006(XCH01006);
		}

		String XCH01007 = (String)attributes.get("XCH01007");

		if (XCH01007 != null) {
			setXCH01007(XCH01007);
		}

		String XCH01008 = (String)attributes.get("XCH01008");

		if (XCH01008 != null) {
			setXCH01008(XCH01008);
		}

		String XCH01009 = (String)attributes.get("XCH01009");

		if (XCH01009 != null) {
			setXCH01009(XCH01009);
		}

		String XCH01010 = (String)attributes.get("XCH01010");

		if (XCH01010 != null) {
			setXCH01010(XCH01010);
		}

		String XCH01011 = (String)attributes.get("XCH01011");

		if (XCH01011 != null) {
			setXCH01011(XCH01011);
		}

		String XCH01012 = (String)attributes.get("XCH01012");

		if (XCH01012 != null) {
			setXCH01012(XCH01012);
		}

		String XCH01013 = (String)attributes.get("XCH01013");

		if (XCH01013 != null) {
			setXCH01013(XCH01013);
		}

		String XCH01014 = (String)attributes.get("XCH01014");

		if (XCH01014 != null) {
			setXCH01014(XCH01014);
		}

		String XCH01016 = (String)attributes.get("XCH01016");

		if (XCH01016 != null) {
			setXCH01016(XCH01016);
		}

		String XCH01017 = (String)attributes.get("XCH01017");

		if (XCH01017 != null) {
			setXCH01017(XCH01017);
		}

		String XCH01019 = (String)attributes.get("XCH01019");

		if (XCH01019 != null) {
			setXCH01019(XCH01019);
		}

		String XCH01020 = (String)attributes.get("XCH01020");

		if (XCH01020 != null) {
			setXCH01020(XCH01020);
		}

		String XCH01021 = (String)attributes.get("XCH01021");

		if (XCH01021 != null) {
			setXCH01021(XCH01021);
		}

		String XCH01022 = (String)attributes.get("XCH01022");

		if (XCH01022 != null) {
			setXCH01022(XCH01022);
		}

		String XCH01024 = (String)attributes.get("XCH01024");

		if (XCH01024 != null) {
			setXCH01024(XCH01024);
		}

		String XCH01025 = (String)attributes.get("XCH01025");

		if (XCH01025 != null) {
			setXCH01025(XCH01025);
		}

		String XCH01026 = (String)attributes.get("XCH01026");

		if (XCH01026 != null) {
			setXCH01026(XCH01026);
		}

		String XCH01027 = (String)attributes.get("XCH01027");

		if (XCH01027 != null) {
			setXCH01027(XCH01027);
		}

		String XCH01028 = (String)attributes.get("XCH01028");

		if (XCH01028 != null) {
			setXCH01028(XCH01028);
		}

		String XCH01030 = (String)attributes.get("XCH01030");

		if (XCH01030 != null) {
			setXCH01030(XCH01030);
		}

		String XCH01031 = (String)attributes.get("XCH01031");

		if (XCH01031 != null) {
			setXCH01031(XCH01031);
		}

		String XCH01032 = (String)attributes.get("XCH01032");

		if (XCH01032 != null) {
			setXCH01032(XCH01032);
		}

		String XCH01033 = (String)attributes.get("XCH01033");

		if (XCH01033 != null) {
			setXCH01033(XCH01033);
		}

		String XCH01034 = (String)attributes.get("XCH01034");

		if (XCH01034 != null) {
			setXCH01034(XCH01034);
		}

		String XCH01035 = (String)attributes.get("XCH01035");

		if (XCH01035 != null) {
			setXCH01035(XCH01035);
		}

		String XCH01036 = (String)attributes.get("XCH01036");

		if (XCH01036 != null) {
			setXCH01036(XCH01036);
		}

		String XCH01037 = (String)attributes.get("XCH01037");

		if (XCH01037 != null) {
			setXCH01037(XCH01037);
		}

		String XCH01038 = (String)attributes.get("XCH01038");

		if (XCH01038 != null) {
			setXCH01038(XCH01038);
		}

		String XCH01039 = (String)attributes.get("XCH01039");

		if (XCH01039 != null) {
			setXCH01039(XCH01039);
		}

		String XCH01040 = (String)attributes.get("XCH01040");

		if (XCH01040 != null) {
			setXCH01040(XCH01040);
		}

		String XCH01041 = (String)attributes.get("XCH01041");

		if (XCH01041 != null) {
			setXCH01041(XCH01041);
		}

		String XCH01042 = (String)attributes.get("XCH01042");

		if (XCH01042 != null) {
			setXCH01042(XCH01042);
		}

		String XCH01043 = (String)attributes.get("XCH01043");

		if (XCH01043 != null) {
			setXCH01043(XCH01043);
		}

		String XCH01044 = (String)attributes.get("XCH01044");

		if (XCH01044 != null) {
			setXCH01044(XCH01044);
		}

		String XCH01045 = (String)attributes.get("XCH01045");

		if (XCH01045 != null) {
			setXCH01045(XCH01045);
		}

		String XCH01046 = (String)attributes.get("XCH01046");

		if (XCH01046 != null) {
			setXCH01046(XCH01046);
		}

		String XCH01047 = (String)attributes.get("XCH01047");

		if (XCH01047 != null) {
			setXCH01047(XCH01047);
		}

		String XCH01049 = (String)attributes.get("XCH01049");

		if (XCH01049 != null) {
			setXCH01049(XCH01049);
		}

		String XCH01050 = (String)attributes.get("XCH01050");

		if (XCH01050 != null) {
			setXCH01050(XCH01050);
		}

		String XCH01051 = (String)attributes.get("XCH01051");

		if (XCH01051 != null) {
			setXCH01051(XCH01051);
		}

		String XCH01052 = (String)attributes.get("XCH01052");

		if (XCH01052 != null) {
			setXCH01052(XCH01052);
		}

		String XCH01053 = (String)attributes.get("XCH01053");

		if (XCH01053 != null) {
			setXCH01053(XCH01053);
		}

		String XCH01054 = (String)attributes.get("XCH01054");

		if (XCH01054 != null) {
			setXCH01054(XCH01054);
		}

		String XCH01055 = (String)attributes.get("XCH01055");

		if (XCH01055 != null) {
			setXCH01055(XCH01055);
		}

		String XCH01056 = (String)attributes.get("XCH01056");

		if (XCH01056 != null) {
			setXCH01056(XCH01056);
		}

		String XCH01057 = (String)attributes.get("XCH01057");

		if (XCH01057 != null) {
			setXCH01057(XCH01057);
		}

		String XCH01058 = (String)attributes.get("XCH01058");

		if (XCH01058 != null) {
			setXCH01058(XCH01058);
		}

		String XCH01059 = (String)attributes.get("XCH01059");

		if (XCH01059 != null) {
			setXCH01059(XCH01059);
		}

		String XCH01060 = (String)attributes.get("XCH01060");

		if (XCH01060 != null) {
			setXCH01060(XCH01060);
		}

		String XCH01062 = (String)attributes.get("XCH01062");

		if (XCH01062 != null) {
			setXCH01062(XCH01062);
		}

		String XCH01063 = (String)attributes.get("XCH01063");

		if (XCH01063 != null) {
			setXCH01063(XCH01063);
		}

		String XCH01064 = (String)attributes.get("XCH01064");

		if (XCH01064 != null) {
			setXCH01064(XCH01064);
		}

		String XCH01065 = (String)attributes.get("XCH01065");

		if (XCH01065 != null) {
			setXCH01065(XCH01065);
		}

		String XCH01066 = (String)attributes.get("XCH01066");

		if (XCH01066 != null) {
			setXCH01066(XCH01066);
		}

		String XCH01067 = (String)attributes.get("XCH01067");

		if (XCH01067 != null) {
			setXCH01067(XCH01067);
		}

		String XCH01068 = (String)attributes.get("XCH01068");

		if (XCH01068 != null) {
			setXCH01068(XCH01068);
		}

		String XCH01069 = (String)attributes.get("XCH01069");

		if (XCH01069 != null) {
			setXCH01069(XCH01069);
		}

		String XCH01100 = (String)attributes.get("XCH01100");

		if (XCH01100 != null) {
			setXCH01100(XCH01100);
		}

		String XCH01101 = (String)attributes.get("XCH01101");

		if (XCH01101 != null) {
			setXCH01101(XCH01101);
		}

		String XCH01102 = (String)attributes.get("XCH01102");

		if (XCH01102 != null) {
			setXCH01102(XCH01102);
		}

		String XCH01103 = (String)attributes.get("XCH01103");

		if (XCH01103 != null) {
			setXCH01103(XCH01103);
		}

		String XCH01104 = (String)attributes.get("XCH01104");

		if (XCH01104 != null) {
			setXCH01104(XCH01104);
		}

		String XCH01105 = (String)attributes.get("XCH01105");

		if (XCH01105 != null) {
			setXCH01105(XCH01105);
		}

		String XCH01106 = (String)attributes.get("XCH01106");

		if (XCH01106 != null) {
			setXCH01106(XCH01106);
		}

		String XCH01107 = (String)attributes.get("XCH01107");

		if (XCH01107 != null) {
			setXCH01107(XCH01107);
		}

		String XCH01108 = (String)attributes.get("XCH01108");

		if (XCH01108 != null) {
			setXCH01108(XCH01108);
		}

		String XCH01109 = (String)attributes.get("XCH01109");

		if (XCH01109 != null) {
			setXCH01109(XCH01109);
		}

		String XCH01110 = (String)attributes.get("XCH01110");

		if (XCH01110 != null) {
			setXCH01110(XCH01110);
		}

		String XCH01111 = (String)attributes.get("XCH01111");

		if (XCH01111 != null) {
			setXCH01111(XCH01111);
		}

		String XCH01112 = (String)attributes.get("XCH01112");

		if (XCH01112 != null) {
			setXCH01112(XCH01112);
		}

		String XCH01113 = (String)attributes.get("XCH01113");

		if (XCH01113 != null) {
			setXCH01113(XCH01113);
		}

		String XCH01114 = (String)attributes.get("XCH01114");

		if (XCH01114 != null) {
			setXCH01114(XCH01114);
		}

		String XCH01115 = (String)attributes.get("XCH01115");

		if (XCH01115 != null) {
			setXCH01115(XCH01115);
		}

		String XCH01116 = (String)attributes.get("XCH01116");

		if (XCH01116 != null) {
			setXCH01116(XCH01116);
		}

		String XCH01117 = (String)attributes.get("XCH01117");

		if (XCH01117 != null) {
			setXCH01117(XCH01117);
		}

		String XCH01118 = (String)attributes.get("XCH01118");

		if (XCH01118 != null) {
			setXCH01118(XCH01118);
		}

		String XCH01119 = (String)attributes.get("XCH01119");

		if (XCH01119 != null) {
			setXCH01119(XCH01119);
		}

		String XCH01120 = (String)attributes.get("XCH01120");

		if (XCH01120 != null) {
			setXCH01120(XCH01120);
		}

		String XCH01121 = (String)attributes.get("XCH01121");

		if (XCH01121 != null) {
			setXCH01121(XCH01121);
		}

		String XCH01122 = (String)attributes.get("XCH01122");

		if (XCH01122 != null) {
			setXCH01122(XCH01122);
		}

		String XCH01123 = (String)attributes.get("XCH01123");

		if (XCH01123 != null) {
			setXCH01123(XCH01123);
		}

		String XCH01124 = (String)attributes.get("XCH01124");

		if (XCH01124 != null) {
			setXCH01124(XCH01124);
		}

		String XCH01125 = (String)attributes.get("XCH01125");

		if (XCH01125 != null) {
			setXCH01125(XCH01125);
		}

		String XCH01126 = (String)attributes.get("XCH01126");

		if (XCH01126 != null) {
			setXCH01126(XCH01126);
		}

		String XCH01127 = (String)attributes.get("XCH01127");

		if (XCH01127 != null) {
			setXCH01127(XCH01127);
		}

		String XCH01128 = (String)attributes.get("XCH01128");

		if (XCH01128 != null) {
			setXCH01128(XCH01128);
		}

		String XCH01129 = (String)attributes.get("XCH01129");

		if (XCH01129 != null) {
			setXCH01129(XCH01129);
		}

		String XCH01130 = (String)attributes.get("XCH01130");

		if (XCH01130 != null) {
			setXCH01130(XCH01130);
		}

		String XCH01131 = (String)attributes.get("XCH01131");

		if (XCH01131 != null) {
			setXCH01131(XCH01131);
		}

		String XCH01132 = (String)attributes.get("XCH01132");

		if (XCH01132 != null) {
			setXCH01132(XCH01132);
		}

		String XCH01133 = (String)attributes.get("XCH01133");

		if (XCH01133 != null) {
			setXCH01133(XCH01133);
		}

		String XCH01134 = (String)attributes.get("XCH01134");

		if (XCH01134 != null) {
			setXCH01134(XCH01134);
		}

		String XCH01135 = (String)attributes.get("XCH01135");

		if (XCH01135 != null) {
			setXCH01135(XCH01135);
		}

		String XCH01136 = (String)attributes.get("XCH01136");

		if (XCH01136 != null) {
			setXCH01136(XCH01136);
		}

		String XCH01137 = (String)attributes.get("XCH01137");

		if (XCH01137 != null) {
			setXCH01137(XCH01137);
		}

		String XCH01138 = (String)attributes.get("XCH01138");

		if (XCH01138 != null) {
			setXCH01138(XCH01138);
		}

		String XCH01139 = (String)attributes.get("XCH01139");

		if (XCH01139 != null) {
			setXCH01139(XCH01139);
		}

		String XCH01140 = (String)attributes.get("XCH01140");

		if (XCH01140 != null) {
			setXCH01140(XCH01140);
		}

		String XCH01141 = (String)attributes.get("XCH01141");

		if (XCH01141 != null) {
			setXCH01141(XCH01141);
		}

		String XCH01142 = (String)attributes.get("XCH01142");

		if (XCH01142 != null) {
			setXCH01142(XCH01142);
		}

		String XCH01143 = (String)attributes.get("XCH01143");

		if (XCH01143 != null) {
			setXCH01143(XCH01143);
		}

		String XCH01144 = (String)attributes.get("XCH01144");

		if (XCH01144 != null) {
			setXCH01144(XCH01144);
		}

		String XCH01145 = (String)attributes.get("XCH01145");

		if (XCH01145 != null) {
			setXCH01145(XCH01145);
		}

		String XCH01146 = (String)attributes.get("XCH01146");

		if (XCH01146 != null) {
			setXCH01146(XCH01146);
		}

		String XCH01147 = (String)attributes.get("XCH01147");

		if (XCH01147 != null) {
			setXCH01147(XCH01147);
		}

		String XCH01148 = (String)attributes.get("XCH01148");

		if (XCH01148 != null) {
			setXCH01148(XCH01148);
		}

		String XCH01149 = (String)attributes.get("XCH01149");

		if (XCH01149 != null) {
			setXCH01149(XCH01149);
		}

		String XCH01150 = (String)attributes.get("XCH01150");

		if (XCH01150 != null) {
			setXCH01150(XCH01150);
		}

		String XCH01151 = (String)attributes.get("XCH01151");

		if (XCH01151 != null) {
			setXCH01151(XCH01151);
		}

		String XCH01152 = (String)attributes.get("XCH01152");

		if (XCH01152 != null) {
			setXCH01152(XCH01152);
		}

		String XCH01153 = (String)attributes.get("XCH01153");

		if (XCH01153 != null) {
			setXCH01153(XCH01153);
		}

		String XCH01154 = (String)attributes.get("XCH01154");

		if (XCH01154 != null) {
			setXCH01154(XCH01154);
		}

		String XCH01155 = (String)attributes.get("XCH01155");

		if (XCH01155 != null) {
			setXCH01155(XCH01155);
		}

		String XCH01156 = (String)attributes.get("XCH01156");

		if (XCH01156 != null) {
			setXCH01156(XCH01156);
		}

		String XCH01157 = (String)attributes.get("XCH01157");

		if (XCH01157 != null) {
			setXCH01157(XCH01157);
		}

		String XCH01158 = (String)attributes.get("XCH01158");

		if (XCH01158 != null) {
			setXCH01158(XCH01158);
		}

		String XCH01159 = (String)attributes.get("XCH01159");

		if (XCH01159 != null) {
			setXCH01159(XCH01159);
		}

		String XCH01160 = (String)attributes.get("XCH01160");

		if (XCH01160 != null) {
			setXCH01160(XCH01160);
		}

		String XCH01161 = (String)attributes.get("XCH01161");

		if (XCH01161 != null) {
			setXCH01161(XCH01161);
		}

		String XCH01162 = (String)attributes.get("XCH01162");

		if (XCH01162 != null) {
			setXCH01162(XCH01162);
		}

		String XCH01163 = (String)attributes.get("XCH01163");

		if (XCH01163 != null) {
			setXCH01163(XCH01163);
		}

		String XCH01164 = (String)attributes.get("XCH01164");

		if (XCH01164 != null) {
			setXCH01164(XCH01164);
		}

		String XCH01165 = (String)attributes.get("XCH01165");

		if (XCH01165 != null) {
			setXCH01165(XCH01165);
		}

		String XCH01166 = (String)attributes.get("XCH01166");

		if (XCH01166 != null) {
			setXCH01166(XCH01166);
		}

		String XCH01167 = (String)attributes.get("XCH01167");

		if (XCH01167 != null) {
			setXCH01167(XCH01167);
		}

		String XCH01168 = (String)attributes.get("XCH01168");

		if (XCH01168 != null) {
			setXCH01168(XCH01168);
		}

		String XCH01169 = (String)attributes.get("XCH01169");

		if (XCH01169 != null) {
			setXCH01169(XCH01169);
		}

		String XCH01170 = (String)attributes.get("XCH01170");

		if (XCH01170 != null) {
			setXCH01170(XCH01170);
		}

		String XCH01171 = (String)attributes.get("XCH01171");

		if (XCH01171 != null) {
			setXCH01171(XCH01171);
		}

		String XCH01172 = (String)attributes.get("XCH01172");

		if (XCH01172 != null) {
			setXCH01172(XCH01172);
		}

		String XCH01173 = (String)attributes.get("XCH01173");

		if (XCH01173 != null) {
			setXCH01173(XCH01173);
		}

		String XCH01174 = (String)attributes.get("XCH01174");

		if (XCH01174 != null) {
			setXCH01174(XCH01174);
		}

		String XCH01175 = (String)attributes.get("XCH01175");

		if (XCH01175 != null) {
			setXCH01175(XCH01175);
		}

		String XCH01176 = (String)attributes.get("XCH01176");

		if (XCH01176 != null) {
			setXCH01176(XCH01176);
		}

		String XCH01177 = (String)attributes.get("XCH01177");

		if (XCH01177 != null) {
			setXCH01177(XCH01177);
		}

		String XCH01178 = (String)attributes.get("XCH01178");

		if (XCH01178 != null) {
			setXCH01178(XCH01178);
		}

		String XCH01179 = (String)attributes.get("XCH01179");

		if (XCH01179 != null) {
			setXCH01179(XCH01179);
		}

		String XCH01180 = (String)attributes.get("XCH01180");

		if (XCH01180 != null) {
			setXCH01180(XCH01180);
		}

		String XCH01181 = (String)attributes.get("XCH01181");

		if (XCH01181 != null) {
			setXCH01181(XCH01181);
		}

		String XCH01182 = (String)attributes.get("XCH01182");

		if (XCH01182 != null) {
			setXCH01182(XCH01182);
		}

		String XCH01183 = (String)attributes.get("XCH01183");

		if (XCH01183 != null) {
			setXCH01183(XCH01183);
		}

		String XCH01184 = (String)attributes.get("XCH01184");

		if (XCH01184 != null) {
			setXCH01184(XCH01184);
		}

		String XCH01185 = (String)attributes.get("XCH01185");

		if (XCH01185 != null) {
			setXCH01185(XCH01185);
		}

		String XCH01186 = (String)attributes.get("XCH01186");

		if (XCH01186 != null) {
			setXCH01186(XCH01186);
		}

		String XCH01187 = (String)attributes.get("XCH01187");

		if (XCH01187 != null) {
			setXCH01187(XCH01187);
		}

		String XCH01188 = (String)attributes.get("XCH01188");

		if (XCH01188 != null) {
			setXCH01188(XCH01188);
		}

		String XCH01189 = (String)attributes.get("XCH01189");

		if (XCH01189 != null) {
			setXCH01189(XCH01189);
		}

		String XCH01190 = (String)attributes.get("XCH01190");

		if (XCH01190 != null) {
			setXCH01190(XCH01190);
		}

		String XCH01191 = (String)attributes.get("XCH01191");

		if (XCH01191 != null) {
			setXCH01191(XCH01191);
		}

		String XCH01192 = (String)attributes.get("XCH01192");

		if (XCH01192 != null) {
			setXCH01192(XCH01192);
		}

		String XCH01193 = (String)attributes.get("XCH01193");

		if (XCH01193 != null) {
			setXCH01193(XCH01193);
		}

		String XCH01194 = (String)attributes.get("XCH01194");

		if (XCH01194 != null) {
			setXCH01194(XCH01194);
		}

		String XCH01195 = (String)attributes.get("XCH01195");

		if (XCH01195 != null) {
			setXCH01195(XCH01195);
		}

		String XCH01196 = (String)attributes.get("XCH01196");

		if (XCH01196 != null) {
			setXCH01196(XCH01196);
		}

		String XCH01197 = (String)attributes.get("XCH01197");

		if (XCH01197 != null) {
			setXCH01197(XCH01197);
		}

		String XCH01198 = (String)attributes.get("XCH01198");

		if (XCH01198 != null) {
			setXCH01198(XCH01198);
		}

		String XCH01199 = (String)attributes.get("XCH01199");

		if (XCH01199 != null) {
			setXCH01199(XCH01199);
		}

		String XCH01200 = (String)attributes.get("XCH01200");

		if (XCH01200 != null) {
			setXCH01200(XCH01200);
		}

		String XCH01201 = (String)attributes.get("XCH01201");

		if (XCH01201 != null) {
			setXCH01201(XCH01201);
		}

		String XCH01202 = (String)attributes.get("XCH01202");

		if (XCH01202 != null) {
			setXCH01202(XCH01202);
		}

		String XCH01203 = (String)attributes.get("XCH01203");

		if (XCH01203 != null) {
			setXCH01203(XCH01203);
		}

		String XCH01204 = (String)attributes.get("XCH01204");

		if (XCH01204 != null) {
			setXCH01204(XCH01204);
		}

		String XCH01205 = (String)attributes.get("XCH01205");

		if (XCH01205 != null) {
			setXCH01205(XCH01205);
		}

		String XCH01206 = (String)attributes.get("XCH01206");

		if (XCH01206 != null) {
			setXCH01206(XCH01206);
		}

		String XCH01207 = (String)attributes.get("XCH01207");

		if (XCH01207 != null) {
			setXCH01207(XCH01207);
		}

		String XCH01208 = (String)attributes.get("XCH01208");

		if (XCH01208 != null) {
			setXCH01208(XCH01208);
		}

		String XCH01209 = (String)attributes.get("XCH01209");

		if (XCH01209 != null) {
			setXCH01209(XCH01209);
		}

		String XCH01210 = (String)attributes.get("XCH01210");

		if (XCH01210 != null) {
			setXCH01210(XCH01210);
		}

		String XCH01211 = (String)attributes.get("XCH01211");

		if (XCH01211 != null) {
			setXCH01211(XCH01211);
		}

		String XCH01212 = (String)attributes.get("XCH01212");

		if (XCH01212 != null) {
			setXCH01212(XCH01212);
		}

		String XCH01213 = (String)attributes.get("XCH01213");

		if (XCH01213 != null) {
			setXCH01213(XCH01213);
		}

		String XCH01214 = (String)attributes.get("XCH01214");

		if (XCH01214 != null) {
			setXCH01214(XCH01214);
		}

		String XCH01215 = (String)attributes.get("XCH01215");

		if (XCH01215 != null) {
			setXCH01215(XCH01215);
		}

		String XCH01216 = (String)attributes.get("XCH01216");

		if (XCH01216 != null) {
			setXCH01216(XCH01216);
		}

		String XCH01217 = (String)attributes.get("XCH01217");

		if (XCH01217 != null) {
			setXCH01217(XCH01217);
		}

		String XCH01218 = (String)attributes.get("XCH01218");

		if (XCH01218 != null) {
			setXCH01218(XCH01218);
		}

		String XCH01219 = (String)attributes.get("XCH01219");

		if (XCH01219 != null) {
			setXCH01219(XCH01219);
		}

		String XCH01220 = (String)attributes.get("XCH01220");

		if (XCH01220 != null) {
			setXCH01220(XCH01220);
		}

		String XCH01221 = (String)attributes.get("XCH01221");

		if (XCH01221 != null) {
			setXCH01221(XCH01221);
		}

		String XCH01222 = (String)attributes.get("XCH01222");

		if (XCH01222 != null) {
			setXCH01222(XCH01222);
		}

		String XCH01223 = (String)attributes.get("XCH01223");

		if (XCH01223 != null) {
			setXCH01223(XCH01223);
		}

		String XCH01224 = (String)attributes.get("XCH01224");

		if (XCH01224 != null) {
			setXCH01224(XCH01224);
		}

		String XCH01225 = (String)attributes.get("XCH01225");

		if (XCH01225 != null) {
			setXCH01225(XCH01225);
		}

		String XCH01226 = (String)attributes.get("XCH01226");

		if (XCH01226 != null) {
			setXCH01226(XCH01226);
		}

		String XCH01227 = (String)attributes.get("XCH01227");

		if (XCH01227 != null) {
			setXCH01227(XCH01227);
		}

		String XCH01228 = (String)attributes.get("XCH01228");

		if (XCH01228 != null) {
			setXCH01228(XCH01228);
		}

		String XCH01229 = (String)attributes.get("XCH01229");

		if (XCH01229 != null) {
			setXCH01229(XCH01229);
		}

		String XCH01230 = (String)attributes.get("XCH01230");

		if (XCH01230 != null) {
			setXCH01230(XCH01230);
		}

		String XCH01231 = (String)attributes.get("XCH01231");

		if (XCH01231 != null) {
			setXCH01231(XCH01231);
		}

		String XCH01232 = (String)attributes.get("XCH01232");

		if (XCH01232 != null) {
			setXCH01232(XCH01232);
		}

		String XCH01233 = (String)attributes.get("XCH01233");

		if (XCH01233 != null) {
			setXCH01233(XCH01233);
		}

		String XCH01234 = (String)attributes.get("XCH01234");

		if (XCH01234 != null) {
			setXCH01234(XCH01234);
		}

		String XCH01235 = (String)attributes.get("XCH01235");

		if (XCH01235 != null) {
			setXCH01235(XCH01235);
		}

		String XCH01236 = (String)attributes.get("XCH01236");

		if (XCH01236 != null) {
			setXCH01236(XCH01236);
		}

		String XCH01237 = (String)attributes.get("XCH01237");

		if (XCH01237 != null) {
			setXCH01237(XCH01237);
		}

		String XCH01238 = (String)attributes.get("XCH01238");

		if (XCH01238 != null) {
			setXCH01238(XCH01238);
		}

		String XCH01239 = (String)attributes.get("XCH01239");

		if (XCH01239 != null) {
			setXCH01239(XCH01239);
		}

		String XCH01240 = (String)attributes.get("XCH01240");

		if (XCH01240 != null) {
			setXCH01240(XCH01240);
		}

		String XCH01241 = (String)attributes.get("XCH01241");

		if (XCH01241 != null) {
			setXCH01241(XCH01241);
		}

		String XCH01242 = (String)attributes.get("XCH01242");

		if (XCH01242 != null) {
			setXCH01242(XCH01242);
		}

		String XCH01243 = (String)attributes.get("XCH01243");

		if (XCH01243 != null) {
			setXCH01243(XCH01243);
		}

		String XCH01244 = (String)attributes.get("XCH01244");

		if (XCH01244 != null) {
			setXCH01244(XCH01244);
		}

		String XCH01245 = (String)attributes.get("XCH01245");

		if (XCH01245 != null) {
			setXCH01245(XCH01245);
		}

		String XCH01246 = (String)attributes.get("XCH01246");

		if (XCH01246 != null) {
			setXCH01246(XCH01246);
		}

		String XCH01247 = (String)attributes.get("XCH01247");

		if (XCH01247 != null) {
			setXCH01247(XCH01247);
		}

		String XCH01248 = (String)attributes.get("XCH01248");

		if (XCH01248 != null) {
			setXCH01248(XCH01248);
		}

		String XCH01249 = (String)attributes.get("XCH01249");

		if (XCH01249 != null) {
			setXCH01249(XCH01249);
		}

		String XCH01250 = (String)attributes.get("XCH01250");

		if (XCH01250 != null) {
			setXCH01250(XCH01250);
		}

		String XCH01251 = (String)attributes.get("XCH01251");

		if (XCH01251 != null) {
			setXCH01251(XCH01251);
		}

		String XCH01252 = (String)attributes.get("XCH01252");

		if (XCH01252 != null) {
			setXCH01252(XCH01252);
		}

		String XCH01253 = (String)attributes.get("XCH01253");

		if (XCH01253 != null) {
			setXCH01253(XCH01253);
		}

		String XCH01254 = (String)attributes.get("XCH01254");

		if (XCH01254 != null) {
			setXCH01254(XCH01254);
		}

		String XCH01255 = (String)attributes.get("XCH01255");

		if (XCH01255 != null) {
			setXCH01255(XCH01255);
		}

		String XCH01256 = (String)attributes.get("XCH01256");

		if (XCH01256 != null) {
			setXCH01256(XCH01256);
		}

		String XCH01257 = (String)attributes.get("XCH01257");

		if (XCH01257 != null) {
			setXCH01257(XCH01257);
		}

		String XCH01258 = (String)attributes.get("XCH01258");

		if (XCH01258 != null) {
			setXCH01258(XCH01258);
		}

		String XCH01259 = (String)attributes.get("XCH01259");

		if (XCH01259 != null) {
			setXCH01259(XCH01259);
		}

		String XCH01260 = (String)attributes.get("XCH01260");

		if (XCH01260 != null) {
			setXCH01260(XCH01260);
		}

		String XCH01261 = (String)attributes.get("XCH01261");

		if (XCH01261 != null) {
			setXCH01261(XCH01261);
		}

		String XCH01262 = (String)attributes.get("XCH01262");

		if (XCH01262 != null) {
			setXCH01262(XCH01262);
		}

		String XCH01263 = (String)attributes.get("XCH01263");

		if (XCH01263 != null) {
			setXCH01263(XCH01263);
		}

		String XCH01264 = (String)attributes.get("XCH01264");

		if (XCH01264 != null) {
			setXCH01264(XCH01264);
		}

		String XCH01265 = (String)attributes.get("XCH01265");

		if (XCH01265 != null) {
			setXCH01265(XCH01265);
		}

		String XCH01266 = (String)attributes.get("XCH01266");

		if (XCH01266 != null) {
			setXCH01266(XCH01266);
		}

		String XCH01267 = (String)attributes.get("XCH01267");

		if (XCH01267 != null) {
			setXCH01267(XCH01267);
		}

		String XCH01268 = (String)attributes.get("XCH01268");

		if (XCH01268 != null) {
			setXCH01268(XCH01268);
		}

		String XCH01269 = (String)attributes.get("XCH01269");

		if (XCH01269 != null) {
			setXCH01269(XCH01269);
		}

		String XCH01270 = (String)attributes.get("XCH01270");

		if (XCH01270 != null) {
			setXCH01270(XCH01270);
		}

		String XCH01271 = (String)attributes.get("XCH01271");

		if (XCH01271 != null) {
			setXCH01271(XCH01271);
		}

		String XCH01272 = (String)attributes.get("XCH01272");

		if (XCH01272 != null) {
			setXCH01272(XCH01272);
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
	public VRTechnicalSpec_XCH toEscapedModel() {
		return new VRTechnicalSpec_XCHWrapper(_vrTechnicalSpec_XCH.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XCH toUnescapedModel() {
		return new VRTechnicalSpec_XCHWrapper(_vrTechnicalSpec_XCH.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XCH.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XCH.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XCH.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XCH.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XCH> toCacheModel() {
		return _vrTechnicalSpec_XCH.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XCH vrTechnicalSpec_XCH) {
		return _vrTechnicalSpec_XCH.compareTo(vrTechnicalSpec_XCH);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XCH.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XCH.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XCHWrapper((VRTechnicalSpec_XCH)_vrTechnicalSpec_XCH.clone());
	}

	/**
	* Returns the deliverable code of this vr technical spec_xch.
	*
	* @return the deliverable code of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XCH.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xch.
	*
	* @return the dossier ID ctn of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XCH.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xch.
	*
	* @return the dossier no of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XCH.getDossierNo();
	}

	/**
	* Returns the reference uid of this vr technical spec_xch.
	*
	* @return the reference uid of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XCH.getReferenceUid();
	}

	/**
	* Returns the xch01001 of this vr technical spec_xch.
	*
	* @return the xch01001 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01001() {
		return _vrTechnicalSpec_XCH.getXCH01001();
	}

	/**
	* Returns the xch01002 of this vr technical spec_xch.
	*
	* @return the xch01002 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01002() {
		return _vrTechnicalSpec_XCH.getXCH01002();
	}

	/**
	* Returns the xch01003 of this vr technical spec_xch.
	*
	* @return the xch01003 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01003() {
		return _vrTechnicalSpec_XCH.getXCH01003();
	}

	/**
	* Returns the xch01004 of this vr technical spec_xch.
	*
	* @return the xch01004 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01004() {
		return _vrTechnicalSpec_XCH.getXCH01004();
	}

	/**
	* Returns the xch01005 of this vr technical spec_xch.
	*
	* @return the xch01005 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01005() {
		return _vrTechnicalSpec_XCH.getXCH01005();
	}

	/**
	* Returns the xch01006 of this vr technical spec_xch.
	*
	* @return the xch01006 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01006() {
		return _vrTechnicalSpec_XCH.getXCH01006();
	}

	/**
	* Returns the xch01007 of this vr technical spec_xch.
	*
	* @return the xch01007 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01007() {
		return _vrTechnicalSpec_XCH.getXCH01007();
	}

	/**
	* Returns the xch01008 of this vr technical spec_xch.
	*
	* @return the xch01008 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01008() {
		return _vrTechnicalSpec_XCH.getXCH01008();
	}

	/**
	* Returns the xch01009 of this vr technical spec_xch.
	*
	* @return the xch01009 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01009() {
		return _vrTechnicalSpec_XCH.getXCH01009();
	}

	/**
	* Returns the xch01010 of this vr technical spec_xch.
	*
	* @return the xch01010 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01010() {
		return _vrTechnicalSpec_XCH.getXCH01010();
	}

	/**
	* Returns the xch01011 of this vr technical spec_xch.
	*
	* @return the xch01011 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01011() {
		return _vrTechnicalSpec_XCH.getXCH01011();
	}

	/**
	* Returns the xch01012 of this vr technical spec_xch.
	*
	* @return the xch01012 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01012() {
		return _vrTechnicalSpec_XCH.getXCH01012();
	}

	/**
	* Returns the xch01013 of this vr technical spec_xch.
	*
	* @return the xch01013 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01013() {
		return _vrTechnicalSpec_XCH.getXCH01013();
	}

	/**
	* Returns the xch01014 of this vr technical spec_xch.
	*
	* @return the xch01014 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01014() {
		return _vrTechnicalSpec_XCH.getXCH01014();
	}

	/**
	* Returns the xch01016 of this vr technical spec_xch.
	*
	* @return the xch01016 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01016() {
		return _vrTechnicalSpec_XCH.getXCH01016();
	}

	/**
	* Returns the xch01017 of this vr technical spec_xch.
	*
	* @return the xch01017 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01017() {
		return _vrTechnicalSpec_XCH.getXCH01017();
	}

	/**
	* Returns the xch01019 of this vr technical spec_xch.
	*
	* @return the xch01019 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01019() {
		return _vrTechnicalSpec_XCH.getXCH01019();
	}

	/**
	* Returns the xch01020 of this vr technical spec_xch.
	*
	* @return the xch01020 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01020() {
		return _vrTechnicalSpec_XCH.getXCH01020();
	}

	/**
	* Returns the xch01021 of this vr technical spec_xch.
	*
	* @return the xch01021 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01021() {
		return _vrTechnicalSpec_XCH.getXCH01021();
	}

	/**
	* Returns the xch01022 of this vr technical spec_xch.
	*
	* @return the xch01022 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01022() {
		return _vrTechnicalSpec_XCH.getXCH01022();
	}

	/**
	* Returns the xch01024 of this vr technical spec_xch.
	*
	* @return the xch01024 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01024() {
		return _vrTechnicalSpec_XCH.getXCH01024();
	}

	/**
	* Returns the xch01025 of this vr technical spec_xch.
	*
	* @return the xch01025 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01025() {
		return _vrTechnicalSpec_XCH.getXCH01025();
	}

	/**
	* Returns the xch01026 of this vr technical spec_xch.
	*
	* @return the xch01026 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01026() {
		return _vrTechnicalSpec_XCH.getXCH01026();
	}

	/**
	* Returns the xch01027 of this vr technical spec_xch.
	*
	* @return the xch01027 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01027() {
		return _vrTechnicalSpec_XCH.getXCH01027();
	}

	/**
	* Returns the xch01028 of this vr technical spec_xch.
	*
	* @return the xch01028 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01028() {
		return _vrTechnicalSpec_XCH.getXCH01028();
	}

	/**
	* Returns the xch01030 of this vr technical spec_xch.
	*
	* @return the xch01030 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01030() {
		return _vrTechnicalSpec_XCH.getXCH01030();
	}

	/**
	* Returns the xch01031 of this vr technical spec_xch.
	*
	* @return the xch01031 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01031() {
		return _vrTechnicalSpec_XCH.getXCH01031();
	}

	/**
	* Returns the xch01032 of this vr technical spec_xch.
	*
	* @return the xch01032 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01032() {
		return _vrTechnicalSpec_XCH.getXCH01032();
	}

	/**
	* Returns the xch01033 of this vr technical spec_xch.
	*
	* @return the xch01033 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01033() {
		return _vrTechnicalSpec_XCH.getXCH01033();
	}

	/**
	* Returns the xch01034 of this vr technical spec_xch.
	*
	* @return the xch01034 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01034() {
		return _vrTechnicalSpec_XCH.getXCH01034();
	}

	/**
	* Returns the xch01035 of this vr technical spec_xch.
	*
	* @return the xch01035 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01035() {
		return _vrTechnicalSpec_XCH.getXCH01035();
	}

	/**
	* Returns the xch01036 of this vr technical spec_xch.
	*
	* @return the xch01036 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01036() {
		return _vrTechnicalSpec_XCH.getXCH01036();
	}

	/**
	* Returns the xch01037 of this vr technical spec_xch.
	*
	* @return the xch01037 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01037() {
		return _vrTechnicalSpec_XCH.getXCH01037();
	}

	/**
	* Returns the xch01038 of this vr technical spec_xch.
	*
	* @return the xch01038 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01038() {
		return _vrTechnicalSpec_XCH.getXCH01038();
	}

	/**
	* Returns the xch01039 of this vr technical spec_xch.
	*
	* @return the xch01039 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01039() {
		return _vrTechnicalSpec_XCH.getXCH01039();
	}

	/**
	* Returns the xch01040 of this vr technical spec_xch.
	*
	* @return the xch01040 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01040() {
		return _vrTechnicalSpec_XCH.getXCH01040();
	}

	/**
	* Returns the xch01041 of this vr technical spec_xch.
	*
	* @return the xch01041 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01041() {
		return _vrTechnicalSpec_XCH.getXCH01041();
	}

	/**
	* Returns the xch01042 of this vr technical spec_xch.
	*
	* @return the xch01042 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01042() {
		return _vrTechnicalSpec_XCH.getXCH01042();
	}

	/**
	* Returns the xch01043 of this vr technical spec_xch.
	*
	* @return the xch01043 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01043() {
		return _vrTechnicalSpec_XCH.getXCH01043();
	}

	/**
	* Returns the xch01044 of this vr technical spec_xch.
	*
	* @return the xch01044 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01044() {
		return _vrTechnicalSpec_XCH.getXCH01044();
	}

	/**
	* Returns the xch01045 of this vr technical spec_xch.
	*
	* @return the xch01045 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01045() {
		return _vrTechnicalSpec_XCH.getXCH01045();
	}

	/**
	* Returns the xch01046 of this vr technical spec_xch.
	*
	* @return the xch01046 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01046() {
		return _vrTechnicalSpec_XCH.getXCH01046();
	}

	/**
	* Returns the xch01047 of this vr technical spec_xch.
	*
	* @return the xch01047 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01047() {
		return _vrTechnicalSpec_XCH.getXCH01047();
	}

	/**
	* Returns the xch01049 of this vr technical spec_xch.
	*
	* @return the xch01049 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01049() {
		return _vrTechnicalSpec_XCH.getXCH01049();
	}

	/**
	* Returns the xch01050 of this vr technical spec_xch.
	*
	* @return the xch01050 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01050() {
		return _vrTechnicalSpec_XCH.getXCH01050();
	}

	/**
	* Returns the xch01051 of this vr technical spec_xch.
	*
	* @return the xch01051 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01051() {
		return _vrTechnicalSpec_XCH.getXCH01051();
	}

	/**
	* Returns the xch01052 of this vr technical spec_xch.
	*
	* @return the xch01052 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01052() {
		return _vrTechnicalSpec_XCH.getXCH01052();
	}

	/**
	* Returns the xch01053 of this vr technical spec_xch.
	*
	* @return the xch01053 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01053() {
		return _vrTechnicalSpec_XCH.getXCH01053();
	}

	/**
	* Returns the xch01054 of this vr technical spec_xch.
	*
	* @return the xch01054 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01054() {
		return _vrTechnicalSpec_XCH.getXCH01054();
	}

	/**
	* Returns the xch01055 of this vr technical spec_xch.
	*
	* @return the xch01055 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01055() {
		return _vrTechnicalSpec_XCH.getXCH01055();
	}

	/**
	* Returns the xch01056 of this vr technical spec_xch.
	*
	* @return the xch01056 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01056() {
		return _vrTechnicalSpec_XCH.getXCH01056();
	}

	/**
	* Returns the xch01057 of this vr technical spec_xch.
	*
	* @return the xch01057 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01057() {
		return _vrTechnicalSpec_XCH.getXCH01057();
	}

	/**
	* Returns the xch01058 of this vr technical spec_xch.
	*
	* @return the xch01058 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01058() {
		return _vrTechnicalSpec_XCH.getXCH01058();
	}

	/**
	* Returns the xch01059 of this vr technical spec_xch.
	*
	* @return the xch01059 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01059() {
		return _vrTechnicalSpec_XCH.getXCH01059();
	}

	/**
	* Returns the xch01060 of this vr technical spec_xch.
	*
	* @return the xch01060 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01060() {
		return _vrTechnicalSpec_XCH.getXCH01060();
	}

	/**
	* Returns the xch01062 of this vr technical spec_xch.
	*
	* @return the xch01062 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01062() {
		return _vrTechnicalSpec_XCH.getXCH01062();
	}

	/**
	* Returns the xch01063 of this vr technical spec_xch.
	*
	* @return the xch01063 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01063() {
		return _vrTechnicalSpec_XCH.getXCH01063();
	}

	/**
	* Returns the xch01064 of this vr technical spec_xch.
	*
	* @return the xch01064 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01064() {
		return _vrTechnicalSpec_XCH.getXCH01064();
	}

	/**
	* Returns the xch01065 of this vr technical spec_xch.
	*
	* @return the xch01065 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01065() {
		return _vrTechnicalSpec_XCH.getXCH01065();
	}

	/**
	* Returns the xch01066 of this vr technical spec_xch.
	*
	* @return the xch01066 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01066() {
		return _vrTechnicalSpec_XCH.getXCH01066();
	}

	/**
	* Returns the xch01067 of this vr technical spec_xch.
	*
	* @return the xch01067 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01067() {
		return _vrTechnicalSpec_XCH.getXCH01067();
	}

	/**
	* Returns the xch01068 of this vr technical spec_xch.
	*
	* @return the xch01068 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01068() {
		return _vrTechnicalSpec_XCH.getXCH01068();
	}

	/**
	* Returns the xch01069 of this vr technical spec_xch.
	*
	* @return the xch01069 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01069() {
		return _vrTechnicalSpec_XCH.getXCH01069();
	}

	/**
	* Returns the xch01100 of this vr technical spec_xch.
	*
	* @return the xch01100 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01100() {
		return _vrTechnicalSpec_XCH.getXCH01100();
	}

	/**
	* Returns the xch01101 of this vr technical spec_xch.
	*
	* @return the xch01101 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01101() {
		return _vrTechnicalSpec_XCH.getXCH01101();
	}

	/**
	* Returns the xch01102 of this vr technical spec_xch.
	*
	* @return the xch01102 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01102() {
		return _vrTechnicalSpec_XCH.getXCH01102();
	}

	/**
	* Returns the xch01103 of this vr technical spec_xch.
	*
	* @return the xch01103 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01103() {
		return _vrTechnicalSpec_XCH.getXCH01103();
	}

	/**
	* Returns the xch01104 of this vr technical spec_xch.
	*
	* @return the xch01104 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01104() {
		return _vrTechnicalSpec_XCH.getXCH01104();
	}

	/**
	* Returns the xch01105 of this vr technical spec_xch.
	*
	* @return the xch01105 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01105() {
		return _vrTechnicalSpec_XCH.getXCH01105();
	}

	/**
	* Returns the xch01106 of this vr technical spec_xch.
	*
	* @return the xch01106 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01106() {
		return _vrTechnicalSpec_XCH.getXCH01106();
	}

	/**
	* Returns the xch01107 of this vr technical spec_xch.
	*
	* @return the xch01107 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01107() {
		return _vrTechnicalSpec_XCH.getXCH01107();
	}

	/**
	* Returns the xch01108 of this vr technical spec_xch.
	*
	* @return the xch01108 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01108() {
		return _vrTechnicalSpec_XCH.getXCH01108();
	}

	/**
	* Returns the xch01109 of this vr technical spec_xch.
	*
	* @return the xch01109 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01109() {
		return _vrTechnicalSpec_XCH.getXCH01109();
	}

	/**
	* Returns the xch01110 of this vr technical spec_xch.
	*
	* @return the xch01110 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01110() {
		return _vrTechnicalSpec_XCH.getXCH01110();
	}

	/**
	* Returns the xch01111 of this vr technical spec_xch.
	*
	* @return the xch01111 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01111() {
		return _vrTechnicalSpec_XCH.getXCH01111();
	}

	/**
	* Returns the xch01112 of this vr technical spec_xch.
	*
	* @return the xch01112 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01112() {
		return _vrTechnicalSpec_XCH.getXCH01112();
	}

	/**
	* Returns the xch01113 of this vr technical spec_xch.
	*
	* @return the xch01113 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01113() {
		return _vrTechnicalSpec_XCH.getXCH01113();
	}

	/**
	* Returns the xch01114 of this vr technical spec_xch.
	*
	* @return the xch01114 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01114() {
		return _vrTechnicalSpec_XCH.getXCH01114();
	}

	/**
	* Returns the xch01115 of this vr technical spec_xch.
	*
	* @return the xch01115 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01115() {
		return _vrTechnicalSpec_XCH.getXCH01115();
	}

	/**
	* Returns the xch01116 of this vr technical spec_xch.
	*
	* @return the xch01116 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01116() {
		return _vrTechnicalSpec_XCH.getXCH01116();
	}

	/**
	* Returns the xch01117 of this vr technical spec_xch.
	*
	* @return the xch01117 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01117() {
		return _vrTechnicalSpec_XCH.getXCH01117();
	}

	/**
	* Returns the xch01118 of this vr technical spec_xch.
	*
	* @return the xch01118 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01118() {
		return _vrTechnicalSpec_XCH.getXCH01118();
	}

	/**
	* Returns the xch01119 of this vr technical spec_xch.
	*
	* @return the xch01119 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01119() {
		return _vrTechnicalSpec_XCH.getXCH01119();
	}

	/**
	* Returns the xch01120 of this vr technical spec_xch.
	*
	* @return the xch01120 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01120() {
		return _vrTechnicalSpec_XCH.getXCH01120();
	}

	/**
	* Returns the xch01121 of this vr technical spec_xch.
	*
	* @return the xch01121 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01121() {
		return _vrTechnicalSpec_XCH.getXCH01121();
	}

	/**
	* Returns the xch01122 of this vr technical spec_xch.
	*
	* @return the xch01122 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01122() {
		return _vrTechnicalSpec_XCH.getXCH01122();
	}

	/**
	* Returns the xch01123 of this vr technical spec_xch.
	*
	* @return the xch01123 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01123() {
		return _vrTechnicalSpec_XCH.getXCH01123();
	}

	/**
	* Returns the xch01124 of this vr technical spec_xch.
	*
	* @return the xch01124 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01124() {
		return _vrTechnicalSpec_XCH.getXCH01124();
	}

	/**
	* Returns the xch01125 of this vr technical spec_xch.
	*
	* @return the xch01125 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01125() {
		return _vrTechnicalSpec_XCH.getXCH01125();
	}

	/**
	* Returns the xch01126 of this vr technical spec_xch.
	*
	* @return the xch01126 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01126() {
		return _vrTechnicalSpec_XCH.getXCH01126();
	}

	/**
	* Returns the xch01127 of this vr technical spec_xch.
	*
	* @return the xch01127 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01127() {
		return _vrTechnicalSpec_XCH.getXCH01127();
	}

	/**
	* Returns the xch01128 of this vr technical spec_xch.
	*
	* @return the xch01128 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01128() {
		return _vrTechnicalSpec_XCH.getXCH01128();
	}

	/**
	* Returns the xch01129 of this vr technical spec_xch.
	*
	* @return the xch01129 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01129() {
		return _vrTechnicalSpec_XCH.getXCH01129();
	}

	/**
	* Returns the xch01130 of this vr technical spec_xch.
	*
	* @return the xch01130 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01130() {
		return _vrTechnicalSpec_XCH.getXCH01130();
	}

	/**
	* Returns the xch01131 of this vr technical spec_xch.
	*
	* @return the xch01131 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01131() {
		return _vrTechnicalSpec_XCH.getXCH01131();
	}

	/**
	* Returns the xch01132 of this vr technical spec_xch.
	*
	* @return the xch01132 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01132() {
		return _vrTechnicalSpec_XCH.getXCH01132();
	}

	/**
	* Returns the xch01133 of this vr technical spec_xch.
	*
	* @return the xch01133 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01133() {
		return _vrTechnicalSpec_XCH.getXCH01133();
	}

	/**
	* Returns the xch01134 of this vr technical spec_xch.
	*
	* @return the xch01134 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01134() {
		return _vrTechnicalSpec_XCH.getXCH01134();
	}

	/**
	* Returns the xch01135 of this vr technical spec_xch.
	*
	* @return the xch01135 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01135() {
		return _vrTechnicalSpec_XCH.getXCH01135();
	}

	/**
	* Returns the xch01136 of this vr technical spec_xch.
	*
	* @return the xch01136 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01136() {
		return _vrTechnicalSpec_XCH.getXCH01136();
	}

	/**
	* Returns the xch01137 of this vr technical spec_xch.
	*
	* @return the xch01137 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01137() {
		return _vrTechnicalSpec_XCH.getXCH01137();
	}

	/**
	* Returns the xch01138 of this vr technical spec_xch.
	*
	* @return the xch01138 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01138() {
		return _vrTechnicalSpec_XCH.getXCH01138();
	}

	/**
	* Returns the xch01139 of this vr technical spec_xch.
	*
	* @return the xch01139 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01139() {
		return _vrTechnicalSpec_XCH.getXCH01139();
	}

	/**
	* Returns the xch01140 of this vr technical spec_xch.
	*
	* @return the xch01140 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01140() {
		return _vrTechnicalSpec_XCH.getXCH01140();
	}

	/**
	* Returns the xch01141 of this vr technical spec_xch.
	*
	* @return the xch01141 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01141() {
		return _vrTechnicalSpec_XCH.getXCH01141();
	}

	/**
	* Returns the xch01142 of this vr technical spec_xch.
	*
	* @return the xch01142 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01142() {
		return _vrTechnicalSpec_XCH.getXCH01142();
	}

	/**
	* Returns the xch01143 of this vr technical spec_xch.
	*
	* @return the xch01143 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01143() {
		return _vrTechnicalSpec_XCH.getXCH01143();
	}

	/**
	* Returns the xch01144 of this vr technical spec_xch.
	*
	* @return the xch01144 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01144() {
		return _vrTechnicalSpec_XCH.getXCH01144();
	}

	/**
	* Returns the xch01145 of this vr technical spec_xch.
	*
	* @return the xch01145 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01145() {
		return _vrTechnicalSpec_XCH.getXCH01145();
	}

	/**
	* Returns the xch01146 of this vr technical spec_xch.
	*
	* @return the xch01146 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01146() {
		return _vrTechnicalSpec_XCH.getXCH01146();
	}

	/**
	* Returns the xch01147 of this vr technical spec_xch.
	*
	* @return the xch01147 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01147() {
		return _vrTechnicalSpec_XCH.getXCH01147();
	}

	/**
	* Returns the xch01148 of this vr technical spec_xch.
	*
	* @return the xch01148 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01148() {
		return _vrTechnicalSpec_XCH.getXCH01148();
	}

	/**
	* Returns the xch01149 of this vr technical spec_xch.
	*
	* @return the xch01149 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01149() {
		return _vrTechnicalSpec_XCH.getXCH01149();
	}

	/**
	* Returns the xch01150 of this vr technical spec_xch.
	*
	* @return the xch01150 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01150() {
		return _vrTechnicalSpec_XCH.getXCH01150();
	}

	/**
	* Returns the xch01151 of this vr technical spec_xch.
	*
	* @return the xch01151 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01151() {
		return _vrTechnicalSpec_XCH.getXCH01151();
	}

	/**
	* Returns the xch01152 of this vr technical spec_xch.
	*
	* @return the xch01152 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01152() {
		return _vrTechnicalSpec_XCH.getXCH01152();
	}

	/**
	* Returns the xch01153 of this vr technical spec_xch.
	*
	* @return the xch01153 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01153() {
		return _vrTechnicalSpec_XCH.getXCH01153();
	}

	/**
	* Returns the xch01154 of this vr technical spec_xch.
	*
	* @return the xch01154 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01154() {
		return _vrTechnicalSpec_XCH.getXCH01154();
	}

	/**
	* Returns the xch01155 of this vr technical spec_xch.
	*
	* @return the xch01155 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01155() {
		return _vrTechnicalSpec_XCH.getXCH01155();
	}

	/**
	* Returns the xch01156 of this vr technical spec_xch.
	*
	* @return the xch01156 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01156() {
		return _vrTechnicalSpec_XCH.getXCH01156();
	}

	/**
	* Returns the xch01157 of this vr technical spec_xch.
	*
	* @return the xch01157 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01157() {
		return _vrTechnicalSpec_XCH.getXCH01157();
	}

	/**
	* Returns the xch01158 of this vr technical spec_xch.
	*
	* @return the xch01158 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01158() {
		return _vrTechnicalSpec_XCH.getXCH01158();
	}

	/**
	* Returns the xch01159 of this vr technical spec_xch.
	*
	* @return the xch01159 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01159() {
		return _vrTechnicalSpec_XCH.getXCH01159();
	}

	/**
	* Returns the xch01160 of this vr technical spec_xch.
	*
	* @return the xch01160 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01160() {
		return _vrTechnicalSpec_XCH.getXCH01160();
	}

	/**
	* Returns the xch01161 of this vr technical spec_xch.
	*
	* @return the xch01161 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01161() {
		return _vrTechnicalSpec_XCH.getXCH01161();
	}

	/**
	* Returns the xch01162 of this vr technical spec_xch.
	*
	* @return the xch01162 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01162() {
		return _vrTechnicalSpec_XCH.getXCH01162();
	}

	/**
	* Returns the xch01163 of this vr technical spec_xch.
	*
	* @return the xch01163 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01163() {
		return _vrTechnicalSpec_XCH.getXCH01163();
	}

	/**
	* Returns the xch01164 of this vr technical spec_xch.
	*
	* @return the xch01164 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01164() {
		return _vrTechnicalSpec_XCH.getXCH01164();
	}

	/**
	* Returns the xch01165 of this vr technical spec_xch.
	*
	* @return the xch01165 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01165() {
		return _vrTechnicalSpec_XCH.getXCH01165();
	}

	/**
	* Returns the xch01166 of this vr technical spec_xch.
	*
	* @return the xch01166 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01166() {
		return _vrTechnicalSpec_XCH.getXCH01166();
	}

	/**
	* Returns the xch01167 of this vr technical spec_xch.
	*
	* @return the xch01167 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01167() {
		return _vrTechnicalSpec_XCH.getXCH01167();
	}

	/**
	* Returns the xch01168 of this vr technical spec_xch.
	*
	* @return the xch01168 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01168() {
		return _vrTechnicalSpec_XCH.getXCH01168();
	}

	/**
	* Returns the xch01169 of this vr technical spec_xch.
	*
	* @return the xch01169 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01169() {
		return _vrTechnicalSpec_XCH.getXCH01169();
	}

	/**
	* Returns the xch01170 of this vr technical spec_xch.
	*
	* @return the xch01170 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01170() {
		return _vrTechnicalSpec_XCH.getXCH01170();
	}

	/**
	* Returns the xch01171 of this vr technical spec_xch.
	*
	* @return the xch01171 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01171() {
		return _vrTechnicalSpec_XCH.getXCH01171();
	}

	/**
	* Returns the xch01172 of this vr technical spec_xch.
	*
	* @return the xch01172 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01172() {
		return _vrTechnicalSpec_XCH.getXCH01172();
	}

	/**
	* Returns the xch01173 of this vr technical spec_xch.
	*
	* @return the xch01173 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01173() {
		return _vrTechnicalSpec_XCH.getXCH01173();
	}

	/**
	* Returns the xch01174 of this vr technical spec_xch.
	*
	* @return the xch01174 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01174() {
		return _vrTechnicalSpec_XCH.getXCH01174();
	}

	/**
	* Returns the xch01175 of this vr technical spec_xch.
	*
	* @return the xch01175 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01175() {
		return _vrTechnicalSpec_XCH.getXCH01175();
	}

	/**
	* Returns the xch01176 of this vr technical spec_xch.
	*
	* @return the xch01176 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01176() {
		return _vrTechnicalSpec_XCH.getXCH01176();
	}

	/**
	* Returns the xch01177 of this vr technical spec_xch.
	*
	* @return the xch01177 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01177() {
		return _vrTechnicalSpec_XCH.getXCH01177();
	}

	/**
	* Returns the xch01178 of this vr technical spec_xch.
	*
	* @return the xch01178 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01178() {
		return _vrTechnicalSpec_XCH.getXCH01178();
	}

	/**
	* Returns the xch01179 of this vr technical spec_xch.
	*
	* @return the xch01179 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01179() {
		return _vrTechnicalSpec_XCH.getXCH01179();
	}

	/**
	* Returns the xch01180 of this vr technical spec_xch.
	*
	* @return the xch01180 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01180() {
		return _vrTechnicalSpec_XCH.getXCH01180();
	}

	/**
	* Returns the xch01181 of this vr technical spec_xch.
	*
	* @return the xch01181 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01181() {
		return _vrTechnicalSpec_XCH.getXCH01181();
	}

	/**
	* Returns the xch01182 of this vr technical spec_xch.
	*
	* @return the xch01182 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01182() {
		return _vrTechnicalSpec_XCH.getXCH01182();
	}

	/**
	* Returns the xch01183 of this vr technical spec_xch.
	*
	* @return the xch01183 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01183() {
		return _vrTechnicalSpec_XCH.getXCH01183();
	}

	/**
	* Returns the xch01184 of this vr technical spec_xch.
	*
	* @return the xch01184 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01184() {
		return _vrTechnicalSpec_XCH.getXCH01184();
	}

	/**
	* Returns the xch01185 of this vr technical spec_xch.
	*
	* @return the xch01185 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01185() {
		return _vrTechnicalSpec_XCH.getXCH01185();
	}

	/**
	* Returns the xch01186 of this vr technical spec_xch.
	*
	* @return the xch01186 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01186() {
		return _vrTechnicalSpec_XCH.getXCH01186();
	}

	/**
	* Returns the xch01187 of this vr technical spec_xch.
	*
	* @return the xch01187 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01187() {
		return _vrTechnicalSpec_XCH.getXCH01187();
	}

	/**
	* Returns the xch01188 of this vr technical spec_xch.
	*
	* @return the xch01188 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01188() {
		return _vrTechnicalSpec_XCH.getXCH01188();
	}

	/**
	* Returns the xch01189 of this vr technical spec_xch.
	*
	* @return the xch01189 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01189() {
		return _vrTechnicalSpec_XCH.getXCH01189();
	}

	/**
	* Returns the xch01190 of this vr technical spec_xch.
	*
	* @return the xch01190 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01190() {
		return _vrTechnicalSpec_XCH.getXCH01190();
	}

	/**
	* Returns the xch01191 of this vr technical spec_xch.
	*
	* @return the xch01191 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01191() {
		return _vrTechnicalSpec_XCH.getXCH01191();
	}

	/**
	* Returns the xch01192 of this vr technical spec_xch.
	*
	* @return the xch01192 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01192() {
		return _vrTechnicalSpec_XCH.getXCH01192();
	}

	/**
	* Returns the xch01193 of this vr technical spec_xch.
	*
	* @return the xch01193 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01193() {
		return _vrTechnicalSpec_XCH.getXCH01193();
	}

	/**
	* Returns the xch01194 of this vr technical spec_xch.
	*
	* @return the xch01194 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01194() {
		return _vrTechnicalSpec_XCH.getXCH01194();
	}

	/**
	* Returns the xch01195 of this vr technical spec_xch.
	*
	* @return the xch01195 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01195() {
		return _vrTechnicalSpec_XCH.getXCH01195();
	}

	/**
	* Returns the xch01196 of this vr technical spec_xch.
	*
	* @return the xch01196 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01196() {
		return _vrTechnicalSpec_XCH.getXCH01196();
	}

	/**
	* Returns the xch01197 of this vr technical spec_xch.
	*
	* @return the xch01197 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01197() {
		return _vrTechnicalSpec_XCH.getXCH01197();
	}

	/**
	* Returns the xch01198 of this vr technical spec_xch.
	*
	* @return the xch01198 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01198() {
		return _vrTechnicalSpec_XCH.getXCH01198();
	}

	/**
	* Returns the xch01199 of this vr technical spec_xch.
	*
	* @return the xch01199 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01199() {
		return _vrTechnicalSpec_XCH.getXCH01199();
	}

	/**
	* Returns the xch01200 of this vr technical spec_xch.
	*
	* @return the xch01200 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01200() {
		return _vrTechnicalSpec_XCH.getXCH01200();
	}

	/**
	* Returns the xch01201 of this vr technical spec_xch.
	*
	* @return the xch01201 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01201() {
		return _vrTechnicalSpec_XCH.getXCH01201();
	}

	/**
	* Returns the xch01202 of this vr technical spec_xch.
	*
	* @return the xch01202 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01202() {
		return _vrTechnicalSpec_XCH.getXCH01202();
	}

	/**
	* Returns the xch01203 of this vr technical spec_xch.
	*
	* @return the xch01203 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01203() {
		return _vrTechnicalSpec_XCH.getXCH01203();
	}

	/**
	* Returns the xch01204 of this vr technical spec_xch.
	*
	* @return the xch01204 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01204() {
		return _vrTechnicalSpec_XCH.getXCH01204();
	}

	/**
	* Returns the xch01205 of this vr technical spec_xch.
	*
	* @return the xch01205 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01205() {
		return _vrTechnicalSpec_XCH.getXCH01205();
	}

	/**
	* Returns the xch01206 of this vr technical spec_xch.
	*
	* @return the xch01206 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01206() {
		return _vrTechnicalSpec_XCH.getXCH01206();
	}

	/**
	* Returns the xch01207 of this vr technical spec_xch.
	*
	* @return the xch01207 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01207() {
		return _vrTechnicalSpec_XCH.getXCH01207();
	}

	/**
	* Returns the xch01208 of this vr technical spec_xch.
	*
	* @return the xch01208 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01208() {
		return _vrTechnicalSpec_XCH.getXCH01208();
	}

	/**
	* Returns the xch01209 of this vr technical spec_xch.
	*
	* @return the xch01209 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01209() {
		return _vrTechnicalSpec_XCH.getXCH01209();
	}

	/**
	* Returns the xch01210 of this vr technical spec_xch.
	*
	* @return the xch01210 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01210() {
		return _vrTechnicalSpec_XCH.getXCH01210();
	}

	/**
	* Returns the xch01211 of this vr technical spec_xch.
	*
	* @return the xch01211 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01211() {
		return _vrTechnicalSpec_XCH.getXCH01211();
	}

	/**
	* Returns the xch01212 of this vr technical spec_xch.
	*
	* @return the xch01212 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01212() {
		return _vrTechnicalSpec_XCH.getXCH01212();
	}

	/**
	* Returns the xch01213 of this vr technical spec_xch.
	*
	* @return the xch01213 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01213() {
		return _vrTechnicalSpec_XCH.getXCH01213();
	}

	/**
	* Returns the xch01214 of this vr technical spec_xch.
	*
	* @return the xch01214 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01214() {
		return _vrTechnicalSpec_XCH.getXCH01214();
	}

	/**
	* Returns the xch01215 of this vr technical spec_xch.
	*
	* @return the xch01215 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01215() {
		return _vrTechnicalSpec_XCH.getXCH01215();
	}

	/**
	* Returns the xch01216 of this vr technical spec_xch.
	*
	* @return the xch01216 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01216() {
		return _vrTechnicalSpec_XCH.getXCH01216();
	}

	/**
	* Returns the xch01217 of this vr technical spec_xch.
	*
	* @return the xch01217 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01217() {
		return _vrTechnicalSpec_XCH.getXCH01217();
	}

	/**
	* Returns the xch01218 of this vr technical spec_xch.
	*
	* @return the xch01218 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01218() {
		return _vrTechnicalSpec_XCH.getXCH01218();
	}

	/**
	* Returns the xch01219 of this vr technical spec_xch.
	*
	* @return the xch01219 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01219() {
		return _vrTechnicalSpec_XCH.getXCH01219();
	}

	/**
	* Returns the xch01220 of this vr technical spec_xch.
	*
	* @return the xch01220 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01220() {
		return _vrTechnicalSpec_XCH.getXCH01220();
	}

	/**
	* Returns the xch01221 of this vr technical spec_xch.
	*
	* @return the xch01221 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01221() {
		return _vrTechnicalSpec_XCH.getXCH01221();
	}

	/**
	* Returns the xch01222 of this vr technical spec_xch.
	*
	* @return the xch01222 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01222() {
		return _vrTechnicalSpec_XCH.getXCH01222();
	}

	/**
	* Returns the xch01223 of this vr technical spec_xch.
	*
	* @return the xch01223 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01223() {
		return _vrTechnicalSpec_XCH.getXCH01223();
	}

	/**
	* Returns the xch01224 of this vr technical spec_xch.
	*
	* @return the xch01224 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01224() {
		return _vrTechnicalSpec_XCH.getXCH01224();
	}

	/**
	* Returns the xch01225 of this vr technical spec_xch.
	*
	* @return the xch01225 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01225() {
		return _vrTechnicalSpec_XCH.getXCH01225();
	}

	/**
	* Returns the xch01226 of this vr technical spec_xch.
	*
	* @return the xch01226 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01226() {
		return _vrTechnicalSpec_XCH.getXCH01226();
	}

	/**
	* Returns the xch01227 of this vr technical spec_xch.
	*
	* @return the xch01227 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01227() {
		return _vrTechnicalSpec_XCH.getXCH01227();
	}

	/**
	* Returns the xch01228 of this vr technical spec_xch.
	*
	* @return the xch01228 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01228() {
		return _vrTechnicalSpec_XCH.getXCH01228();
	}

	/**
	* Returns the xch01229 of this vr technical spec_xch.
	*
	* @return the xch01229 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01229() {
		return _vrTechnicalSpec_XCH.getXCH01229();
	}

	/**
	* Returns the xch01230 of this vr technical spec_xch.
	*
	* @return the xch01230 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01230() {
		return _vrTechnicalSpec_XCH.getXCH01230();
	}

	/**
	* Returns the xch01231 of this vr technical spec_xch.
	*
	* @return the xch01231 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01231() {
		return _vrTechnicalSpec_XCH.getXCH01231();
	}

	/**
	* Returns the xch01232 of this vr technical spec_xch.
	*
	* @return the xch01232 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01232() {
		return _vrTechnicalSpec_XCH.getXCH01232();
	}

	/**
	* Returns the xch01233 of this vr technical spec_xch.
	*
	* @return the xch01233 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01233() {
		return _vrTechnicalSpec_XCH.getXCH01233();
	}

	/**
	* Returns the xch01234 of this vr technical spec_xch.
	*
	* @return the xch01234 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01234() {
		return _vrTechnicalSpec_XCH.getXCH01234();
	}

	/**
	* Returns the xch01235 of this vr technical spec_xch.
	*
	* @return the xch01235 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01235() {
		return _vrTechnicalSpec_XCH.getXCH01235();
	}

	/**
	* Returns the xch01236 of this vr technical spec_xch.
	*
	* @return the xch01236 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01236() {
		return _vrTechnicalSpec_XCH.getXCH01236();
	}

	/**
	* Returns the xch01237 of this vr technical spec_xch.
	*
	* @return the xch01237 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01237() {
		return _vrTechnicalSpec_XCH.getXCH01237();
	}

	/**
	* Returns the xch01238 of this vr technical spec_xch.
	*
	* @return the xch01238 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01238() {
		return _vrTechnicalSpec_XCH.getXCH01238();
	}

	/**
	* Returns the xch01239 of this vr technical spec_xch.
	*
	* @return the xch01239 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01239() {
		return _vrTechnicalSpec_XCH.getXCH01239();
	}

	/**
	* Returns the xch01240 of this vr technical spec_xch.
	*
	* @return the xch01240 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01240() {
		return _vrTechnicalSpec_XCH.getXCH01240();
	}

	/**
	* Returns the xch01241 of this vr technical spec_xch.
	*
	* @return the xch01241 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01241() {
		return _vrTechnicalSpec_XCH.getXCH01241();
	}

	/**
	* Returns the xch01242 of this vr technical spec_xch.
	*
	* @return the xch01242 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01242() {
		return _vrTechnicalSpec_XCH.getXCH01242();
	}

	/**
	* Returns the xch01243 of this vr technical spec_xch.
	*
	* @return the xch01243 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01243() {
		return _vrTechnicalSpec_XCH.getXCH01243();
	}

	/**
	* Returns the xch01244 of this vr technical spec_xch.
	*
	* @return the xch01244 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01244() {
		return _vrTechnicalSpec_XCH.getXCH01244();
	}

	/**
	* Returns the xch01245 of this vr technical spec_xch.
	*
	* @return the xch01245 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01245() {
		return _vrTechnicalSpec_XCH.getXCH01245();
	}

	/**
	* Returns the xch01246 of this vr technical spec_xch.
	*
	* @return the xch01246 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01246() {
		return _vrTechnicalSpec_XCH.getXCH01246();
	}

	/**
	* Returns the xch01247 of this vr technical spec_xch.
	*
	* @return the xch01247 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01247() {
		return _vrTechnicalSpec_XCH.getXCH01247();
	}

	/**
	* Returns the xch01248 of this vr technical spec_xch.
	*
	* @return the xch01248 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01248() {
		return _vrTechnicalSpec_XCH.getXCH01248();
	}

	/**
	* Returns the xch01249 of this vr technical spec_xch.
	*
	* @return the xch01249 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01249() {
		return _vrTechnicalSpec_XCH.getXCH01249();
	}

	/**
	* Returns the xch01250 of this vr technical spec_xch.
	*
	* @return the xch01250 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01250() {
		return _vrTechnicalSpec_XCH.getXCH01250();
	}

	/**
	* Returns the xch01251 of this vr technical spec_xch.
	*
	* @return the xch01251 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01251() {
		return _vrTechnicalSpec_XCH.getXCH01251();
	}

	/**
	* Returns the xch01252 of this vr technical spec_xch.
	*
	* @return the xch01252 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01252() {
		return _vrTechnicalSpec_XCH.getXCH01252();
	}

	/**
	* Returns the xch01253 of this vr technical spec_xch.
	*
	* @return the xch01253 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01253() {
		return _vrTechnicalSpec_XCH.getXCH01253();
	}

	/**
	* Returns the xch01254 of this vr technical spec_xch.
	*
	* @return the xch01254 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01254() {
		return _vrTechnicalSpec_XCH.getXCH01254();
	}

	/**
	* Returns the xch01255 of this vr technical spec_xch.
	*
	* @return the xch01255 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01255() {
		return _vrTechnicalSpec_XCH.getXCH01255();
	}

	/**
	* Returns the xch01256 of this vr technical spec_xch.
	*
	* @return the xch01256 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01256() {
		return _vrTechnicalSpec_XCH.getXCH01256();
	}

	/**
	* Returns the xch01257 of this vr technical spec_xch.
	*
	* @return the xch01257 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01257() {
		return _vrTechnicalSpec_XCH.getXCH01257();
	}

	/**
	* Returns the xch01258 of this vr technical spec_xch.
	*
	* @return the xch01258 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01258() {
		return _vrTechnicalSpec_XCH.getXCH01258();
	}

	/**
	* Returns the xch01259 of this vr technical spec_xch.
	*
	* @return the xch01259 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01259() {
		return _vrTechnicalSpec_XCH.getXCH01259();
	}

	/**
	* Returns the xch01260 of this vr technical spec_xch.
	*
	* @return the xch01260 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01260() {
		return _vrTechnicalSpec_XCH.getXCH01260();
	}

	/**
	* Returns the xch01261 of this vr technical spec_xch.
	*
	* @return the xch01261 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01261() {
		return _vrTechnicalSpec_XCH.getXCH01261();
	}

	/**
	* Returns the xch01262 of this vr technical spec_xch.
	*
	* @return the xch01262 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01262() {
		return _vrTechnicalSpec_XCH.getXCH01262();
	}

	/**
	* Returns the xch01263 of this vr technical spec_xch.
	*
	* @return the xch01263 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01263() {
		return _vrTechnicalSpec_XCH.getXCH01263();
	}

	/**
	* Returns the xch01264 of this vr technical spec_xch.
	*
	* @return the xch01264 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01264() {
		return _vrTechnicalSpec_XCH.getXCH01264();
	}

	/**
	* Returns the xch01265 of this vr technical spec_xch.
	*
	* @return the xch01265 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01265() {
		return _vrTechnicalSpec_XCH.getXCH01265();
	}

	/**
	* Returns the xch01266 of this vr technical spec_xch.
	*
	* @return the xch01266 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01266() {
		return _vrTechnicalSpec_XCH.getXCH01266();
	}

	/**
	* Returns the xch01267 of this vr technical spec_xch.
	*
	* @return the xch01267 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01267() {
		return _vrTechnicalSpec_XCH.getXCH01267();
	}

	/**
	* Returns the xch01268 of this vr technical spec_xch.
	*
	* @return the xch01268 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01268() {
		return _vrTechnicalSpec_XCH.getXCH01268();
	}

	/**
	* Returns the xch01269 of this vr technical spec_xch.
	*
	* @return the xch01269 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01269() {
		return _vrTechnicalSpec_XCH.getXCH01269();
	}

	/**
	* Returns the xch01270 of this vr technical spec_xch.
	*
	* @return the xch01270 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01270() {
		return _vrTechnicalSpec_XCH.getXCH01270();
	}

	/**
	* Returns the xch01271 of this vr technical spec_xch.
	*
	* @return the xch01271 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01271() {
		return _vrTechnicalSpec_XCH.getXCH01271();
	}

	/**
	* Returns the xch01272 of this vr technical spec_xch.
	*
	* @return the xch01272 of this vr technical spec_xch
	*/
	@Override
	public java.lang.String getXCH01272() {
		return _vrTechnicalSpec_XCH.getXCH01272();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XCH.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XCH.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xch.
	*
	* @return the modify date of this vr technical spec_xch
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XCH.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xch.
	*
	* @return the sync date of this vr technical spec_xch
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XCH.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xch.
	*
	* @return the convert assemble ID of this vr technical spec_xch
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XCH.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xch.
	*
	* @return the dossier ID of this vr technical spec_xch
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XCH.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xch.
	*
	* @return the ID of this vr technical spec_xch
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XCH.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xch.
	*
	* @return the mt core of this vr technical spec_xch
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XCH.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xch.
	*
	* @return the primary key of this vr technical spec_xch
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XCH.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xch.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xch
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XCH.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XCH.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XCH.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xch.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xch
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XCH.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xch.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xch
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XCH.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xch.
	*
	* @param dossierId the dossier ID of this vr technical spec_xch
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XCH.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xch.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xch
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XCH.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xch.
	*
	* @param dossierNo the dossier no of this vr technical spec_xch
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XCH.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XCH.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XCH.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XCH.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xch.
	*
	* @param id the ID of this vr technical spec_xch
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XCH.setId(id);
	}

	/**
	* Sets the modify date of this vr technical spec_xch.
	*
	* @param modifyDate the modify date of this vr technical spec_xch
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XCH.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xch.
	*
	* @param mtCore the mt core of this vr technical spec_xch
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XCH.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XCH.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xch.
	*
	* @param primaryKey the primary key of this vr technical spec_xch
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XCH.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XCH.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xch.
	*
	* @param referenceUid the reference uid of this vr technical spec_xch
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XCH.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xch.
	*
	* @param syncDate the sync date of this vr technical spec_xch
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XCH.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xch.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xch
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XCH.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xch01001 of this vr technical spec_xch.
	*
	* @param XCH01001 the xch01001 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01001(java.lang.String XCH01001) {
		_vrTechnicalSpec_XCH.setXCH01001(XCH01001);
	}

	/**
	* Sets the xch01002 of this vr technical spec_xch.
	*
	* @param XCH01002 the xch01002 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01002(java.lang.String XCH01002) {
		_vrTechnicalSpec_XCH.setXCH01002(XCH01002);
	}

	/**
	* Sets the xch01003 of this vr technical spec_xch.
	*
	* @param XCH01003 the xch01003 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01003(java.lang.String XCH01003) {
		_vrTechnicalSpec_XCH.setXCH01003(XCH01003);
	}

	/**
	* Sets the xch01004 of this vr technical spec_xch.
	*
	* @param XCH01004 the xch01004 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01004(java.lang.String XCH01004) {
		_vrTechnicalSpec_XCH.setXCH01004(XCH01004);
	}

	/**
	* Sets the xch01005 of this vr technical spec_xch.
	*
	* @param XCH01005 the xch01005 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01005(java.lang.String XCH01005) {
		_vrTechnicalSpec_XCH.setXCH01005(XCH01005);
	}

	/**
	* Sets the xch01006 of this vr technical spec_xch.
	*
	* @param XCH01006 the xch01006 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01006(java.lang.String XCH01006) {
		_vrTechnicalSpec_XCH.setXCH01006(XCH01006);
	}

	/**
	* Sets the xch01007 of this vr technical spec_xch.
	*
	* @param XCH01007 the xch01007 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01007(java.lang.String XCH01007) {
		_vrTechnicalSpec_XCH.setXCH01007(XCH01007);
	}

	/**
	* Sets the xch01008 of this vr technical spec_xch.
	*
	* @param XCH01008 the xch01008 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01008(java.lang.String XCH01008) {
		_vrTechnicalSpec_XCH.setXCH01008(XCH01008);
	}

	/**
	* Sets the xch01009 of this vr technical spec_xch.
	*
	* @param XCH01009 the xch01009 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01009(java.lang.String XCH01009) {
		_vrTechnicalSpec_XCH.setXCH01009(XCH01009);
	}

	/**
	* Sets the xch01010 of this vr technical spec_xch.
	*
	* @param XCH01010 the xch01010 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01010(java.lang.String XCH01010) {
		_vrTechnicalSpec_XCH.setXCH01010(XCH01010);
	}

	/**
	* Sets the xch01011 of this vr technical spec_xch.
	*
	* @param XCH01011 the xch01011 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01011(java.lang.String XCH01011) {
		_vrTechnicalSpec_XCH.setXCH01011(XCH01011);
	}

	/**
	* Sets the xch01012 of this vr technical spec_xch.
	*
	* @param XCH01012 the xch01012 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01012(java.lang.String XCH01012) {
		_vrTechnicalSpec_XCH.setXCH01012(XCH01012);
	}

	/**
	* Sets the xch01013 of this vr technical spec_xch.
	*
	* @param XCH01013 the xch01013 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01013(java.lang.String XCH01013) {
		_vrTechnicalSpec_XCH.setXCH01013(XCH01013);
	}

	/**
	* Sets the xch01014 of this vr technical spec_xch.
	*
	* @param XCH01014 the xch01014 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01014(java.lang.String XCH01014) {
		_vrTechnicalSpec_XCH.setXCH01014(XCH01014);
	}

	/**
	* Sets the xch01016 of this vr technical spec_xch.
	*
	* @param XCH01016 the xch01016 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01016(java.lang.String XCH01016) {
		_vrTechnicalSpec_XCH.setXCH01016(XCH01016);
	}

	/**
	* Sets the xch01017 of this vr technical spec_xch.
	*
	* @param XCH01017 the xch01017 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01017(java.lang.String XCH01017) {
		_vrTechnicalSpec_XCH.setXCH01017(XCH01017);
	}

	/**
	* Sets the xch01019 of this vr technical spec_xch.
	*
	* @param XCH01019 the xch01019 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01019(java.lang.String XCH01019) {
		_vrTechnicalSpec_XCH.setXCH01019(XCH01019);
	}

	/**
	* Sets the xch01020 of this vr technical spec_xch.
	*
	* @param XCH01020 the xch01020 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01020(java.lang.String XCH01020) {
		_vrTechnicalSpec_XCH.setXCH01020(XCH01020);
	}

	/**
	* Sets the xch01021 of this vr technical spec_xch.
	*
	* @param XCH01021 the xch01021 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01021(java.lang.String XCH01021) {
		_vrTechnicalSpec_XCH.setXCH01021(XCH01021);
	}

	/**
	* Sets the xch01022 of this vr technical spec_xch.
	*
	* @param XCH01022 the xch01022 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01022(java.lang.String XCH01022) {
		_vrTechnicalSpec_XCH.setXCH01022(XCH01022);
	}

	/**
	* Sets the xch01024 of this vr technical spec_xch.
	*
	* @param XCH01024 the xch01024 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01024(java.lang.String XCH01024) {
		_vrTechnicalSpec_XCH.setXCH01024(XCH01024);
	}

	/**
	* Sets the xch01025 of this vr technical spec_xch.
	*
	* @param XCH01025 the xch01025 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01025(java.lang.String XCH01025) {
		_vrTechnicalSpec_XCH.setXCH01025(XCH01025);
	}

	/**
	* Sets the xch01026 of this vr technical spec_xch.
	*
	* @param XCH01026 the xch01026 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01026(java.lang.String XCH01026) {
		_vrTechnicalSpec_XCH.setXCH01026(XCH01026);
	}

	/**
	* Sets the xch01027 of this vr technical spec_xch.
	*
	* @param XCH01027 the xch01027 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01027(java.lang.String XCH01027) {
		_vrTechnicalSpec_XCH.setXCH01027(XCH01027);
	}

	/**
	* Sets the xch01028 of this vr technical spec_xch.
	*
	* @param XCH01028 the xch01028 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01028(java.lang.String XCH01028) {
		_vrTechnicalSpec_XCH.setXCH01028(XCH01028);
	}

	/**
	* Sets the xch01030 of this vr technical spec_xch.
	*
	* @param XCH01030 the xch01030 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01030(java.lang.String XCH01030) {
		_vrTechnicalSpec_XCH.setXCH01030(XCH01030);
	}

	/**
	* Sets the xch01031 of this vr technical spec_xch.
	*
	* @param XCH01031 the xch01031 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01031(java.lang.String XCH01031) {
		_vrTechnicalSpec_XCH.setXCH01031(XCH01031);
	}

	/**
	* Sets the xch01032 of this vr technical spec_xch.
	*
	* @param XCH01032 the xch01032 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01032(java.lang.String XCH01032) {
		_vrTechnicalSpec_XCH.setXCH01032(XCH01032);
	}

	/**
	* Sets the xch01033 of this vr technical spec_xch.
	*
	* @param XCH01033 the xch01033 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01033(java.lang.String XCH01033) {
		_vrTechnicalSpec_XCH.setXCH01033(XCH01033);
	}

	/**
	* Sets the xch01034 of this vr technical spec_xch.
	*
	* @param XCH01034 the xch01034 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01034(java.lang.String XCH01034) {
		_vrTechnicalSpec_XCH.setXCH01034(XCH01034);
	}

	/**
	* Sets the xch01035 of this vr technical spec_xch.
	*
	* @param XCH01035 the xch01035 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01035(java.lang.String XCH01035) {
		_vrTechnicalSpec_XCH.setXCH01035(XCH01035);
	}

	/**
	* Sets the xch01036 of this vr technical spec_xch.
	*
	* @param XCH01036 the xch01036 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01036(java.lang.String XCH01036) {
		_vrTechnicalSpec_XCH.setXCH01036(XCH01036);
	}

	/**
	* Sets the xch01037 of this vr technical spec_xch.
	*
	* @param XCH01037 the xch01037 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01037(java.lang.String XCH01037) {
		_vrTechnicalSpec_XCH.setXCH01037(XCH01037);
	}

	/**
	* Sets the xch01038 of this vr technical spec_xch.
	*
	* @param XCH01038 the xch01038 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01038(java.lang.String XCH01038) {
		_vrTechnicalSpec_XCH.setXCH01038(XCH01038);
	}

	/**
	* Sets the xch01039 of this vr technical spec_xch.
	*
	* @param XCH01039 the xch01039 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01039(java.lang.String XCH01039) {
		_vrTechnicalSpec_XCH.setXCH01039(XCH01039);
	}

	/**
	* Sets the xch01040 of this vr technical spec_xch.
	*
	* @param XCH01040 the xch01040 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01040(java.lang.String XCH01040) {
		_vrTechnicalSpec_XCH.setXCH01040(XCH01040);
	}

	/**
	* Sets the xch01041 of this vr technical spec_xch.
	*
	* @param XCH01041 the xch01041 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01041(java.lang.String XCH01041) {
		_vrTechnicalSpec_XCH.setXCH01041(XCH01041);
	}

	/**
	* Sets the xch01042 of this vr technical spec_xch.
	*
	* @param XCH01042 the xch01042 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01042(java.lang.String XCH01042) {
		_vrTechnicalSpec_XCH.setXCH01042(XCH01042);
	}

	/**
	* Sets the xch01043 of this vr technical spec_xch.
	*
	* @param XCH01043 the xch01043 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01043(java.lang.String XCH01043) {
		_vrTechnicalSpec_XCH.setXCH01043(XCH01043);
	}

	/**
	* Sets the xch01044 of this vr technical spec_xch.
	*
	* @param XCH01044 the xch01044 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01044(java.lang.String XCH01044) {
		_vrTechnicalSpec_XCH.setXCH01044(XCH01044);
	}

	/**
	* Sets the xch01045 of this vr technical spec_xch.
	*
	* @param XCH01045 the xch01045 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01045(java.lang.String XCH01045) {
		_vrTechnicalSpec_XCH.setXCH01045(XCH01045);
	}

	/**
	* Sets the xch01046 of this vr technical spec_xch.
	*
	* @param XCH01046 the xch01046 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01046(java.lang.String XCH01046) {
		_vrTechnicalSpec_XCH.setXCH01046(XCH01046);
	}

	/**
	* Sets the xch01047 of this vr technical spec_xch.
	*
	* @param XCH01047 the xch01047 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01047(java.lang.String XCH01047) {
		_vrTechnicalSpec_XCH.setXCH01047(XCH01047);
	}

	/**
	* Sets the xch01049 of this vr technical spec_xch.
	*
	* @param XCH01049 the xch01049 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01049(java.lang.String XCH01049) {
		_vrTechnicalSpec_XCH.setXCH01049(XCH01049);
	}

	/**
	* Sets the xch01050 of this vr technical spec_xch.
	*
	* @param XCH01050 the xch01050 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01050(java.lang.String XCH01050) {
		_vrTechnicalSpec_XCH.setXCH01050(XCH01050);
	}

	/**
	* Sets the xch01051 of this vr technical spec_xch.
	*
	* @param XCH01051 the xch01051 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01051(java.lang.String XCH01051) {
		_vrTechnicalSpec_XCH.setXCH01051(XCH01051);
	}

	/**
	* Sets the xch01052 of this vr technical spec_xch.
	*
	* @param XCH01052 the xch01052 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01052(java.lang.String XCH01052) {
		_vrTechnicalSpec_XCH.setXCH01052(XCH01052);
	}

	/**
	* Sets the xch01053 of this vr technical spec_xch.
	*
	* @param XCH01053 the xch01053 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01053(java.lang.String XCH01053) {
		_vrTechnicalSpec_XCH.setXCH01053(XCH01053);
	}

	/**
	* Sets the xch01054 of this vr technical spec_xch.
	*
	* @param XCH01054 the xch01054 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01054(java.lang.String XCH01054) {
		_vrTechnicalSpec_XCH.setXCH01054(XCH01054);
	}

	/**
	* Sets the xch01055 of this vr technical spec_xch.
	*
	* @param XCH01055 the xch01055 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01055(java.lang.String XCH01055) {
		_vrTechnicalSpec_XCH.setXCH01055(XCH01055);
	}

	/**
	* Sets the xch01056 of this vr technical spec_xch.
	*
	* @param XCH01056 the xch01056 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01056(java.lang.String XCH01056) {
		_vrTechnicalSpec_XCH.setXCH01056(XCH01056);
	}

	/**
	* Sets the xch01057 of this vr technical spec_xch.
	*
	* @param XCH01057 the xch01057 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01057(java.lang.String XCH01057) {
		_vrTechnicalSpec_XCH.setXCH01057(XCH01057);
	}

	/**
	* Sets the xch01058 of this vr technical spec_xch.
	*
	* @param XCH01058 the xch01058 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01058(java.lang.String XCH01058) {
		_vrTechnicalSpec_XCH.setXCH01058(XCH01058);
	}

	/**
	* Sets the xch01059 of this vr technical spec_xch.
	*
	* @param XCH01059 the xch01059 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01059(java.lang.String XCH01059) {
		_vrTechnicalSpec_XCH.setXCH01059(XCH01059);
	}

	/**
	* Sets the xch01060 of this vr technical spec_xch.
	*
	* @param XCH01060 the xch01060 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01060(java.lang.String XCH01060) {
		_vrTechnicalSpec_XCH.setXCH01060(XCH01060);
	}

	/**
	* Sets the xch01062 of this vr technical spec_xch.
	*
	* @param XCH01062 the xch01062 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01062(java.lang.String XCH01062) {
		_vrTechnicalSpec_XCH.setXCH01062(XCH01062);
	}

	/**
	* Sets the xch01063 of this vr technical spec_xch.
	*
	* @param XCH01063 the xch01063 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01063(java.lang.String XCH01063) {
		_vrTechnicalSpec_XCH.setXCH01063(XCH01063);
	}

	/**
	* Sets the xch01064 of this vr technical spec_xch.
	*
	* @param XCH01064 the xch01064 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01064(java.lang.String XCH01064) {
		_vrTechnicalSpec_XCH.setXCH01064(XCH01064);
	}

	/**
	* Sets the xch01065 of this vr technical spec_xch.
	*
	* @param XCH01065 the xch01065 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01065(java.lang.String XCH01065) {
		_vrTechnicalSpec_XCH.setXCH01065(XCH01065);
	}

	/**
	* Sets the xch01066 of this vr technical spec_xch.
	*
	* @param XCH01066 the xch01066 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01066(java.lang.String XCH01066) {
		_vrTechnicalSpec_XCH.setXCH01066(XCH01066);
	}

	/**
	* Sets the xch01067 of this vr technical spec_xch.
	*
	* @param XCH01067 the xch01067 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01067(java.lang.String XCH01067) {
		_vrTechnicalSpec_XCH.setXCH01067(XCH01067);
	}

	/**
	* Sets the xch01068 of this vr technical spec_xch.
	*
	* @param XCH01068 the xch01068 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01068(java.lang.String XCH01068) {
		_vrTechnicalSpec_XCH.setXCH01068(XCH01068);
	}

	/**
	* Sets the xch01069 of this vr technical spec_xch.
	*
	* @param XCH01069 the xch01069 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01069(java.lang.String XCH01069) {
		_vrTechnicalSpec_XCH.setXCH01069(XCH01069);
	}

	/**
	* Sets the xch01100 of this vr technical spec_xch.
	*
	* @param XCH01100 the xch01100 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01100(java.lang.String XCH01100) {
		_vrTechnicalSpec_XCH.setXCH01100(XCH01100);
	}

	/**
	* Sets the xch01101 of this vr technical spec_xch.
	*
	* @param XCH01101 the xch01101 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01101(java.lang.String XCH01101) {
		_vrTechnicalSpec_XCH.setXCH01101(XCH01101);
	}

	/**
	* Sets the xch01102 of this vr technical spec_xch.
	*
	* @param XCH01102 the xch01102 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01102(java.lang.String XCH01102) {
		_vrTechnicalSpec_XCH.setXCH01102(XCH01102);
	}

	/**
	* Sets the xch01103 of this vr technical spec_xch.
	*
	* @param XCH01103 the xch01103 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01103(java.lang.String XCH01103) {
		_vrTechnicalSpec_XCH.setXCH01103(XCH01103);
	}

	/**
	* Sets the xch01104 of this vr technical spec_xch.
	*
	* @param XCH01104 the xch01104 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01104(java.lang.String XCH01104) {
		_vrTechnicalSpec_XCH.setXCH01104(XCH01104);
	}

	/**
	* Sets the xch01105 of this vr technical spec_xch.
	*
	* @param XCH01105 the xch01105 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01105(java.lang.String XCH01105) {
		_vrTechnicalSpec_XCH.setXCH01105(XCH01105);
	}

	/**
	* Sets the xch01106 of this vr technical spec_xch.
	*
	* @param XCH01106 the xch01106 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01106(java.lang.String XCH01106) {
		_vrTechnicalSpec_XCH.setXCH01106(XCH01106);
	}

	/**
	* Sets the xch01107 of this vr technical spec_xch.
	*
	* @param XCH01107 the xch01107 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01107(java.lang.String XCH01107) {
		_vrTechnicalSpec_XCH.setXCH01107(XCH01107);
	}

	/**
	* Sets the xch01108 of this vr technical spec_xch.
	*
	* @param XCH01108 the xch01108 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01108(java.lang.String XCH01108) {
		_vrTechnicalSpec_XCH.setXCH01108(XCH01108);
	}

	/**
	* Sets the xch01109 of this vr technical spec_xch.
	*
	* @param XCH01109 the xch01109 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01109(java.lang.String XCH01109) {
		_vrTechnicalSpec_XCH.setXCH01109(XCH01109);
	}

	/**
	* Sets the xch01110 of this vr technical spec_xch.
	*
	* @param XCH01110 the xch01110 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01110(java.lang.String XCH01110) {
		_vrTechnicalSpec_XCH.setXCH01110(XCH01110);
	}

	/**
	* Sets the xch01111 of this vr technical spec_xch.
	*
	* @param XCH01111 the xch01111 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01111(java.lang.String XCH01111) {
		_vrTechnicalSpec_XCH.setXCH01111(XCH01111);
	}

	/**
	* Sets the xch01112 of this vr technical spec_xch.
	*
	* @param XCH01112 the xch01112 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01112(java.lang.String XCH01112) {
		_vrTechnicalSpec_XCH.setXCH01112(XCH01112);
	}

	/**
	* Sets the xch01113 of this vr technical spec_xch.
	*
	* @param XCH01113 the xch01113 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01113(java.lang.String XCH01113) {
		_vrTechnicalSpec_XCH.setXCH01113(XCH01113);
	}

	/**
	* Sets the xch01114 of this vr technical spec_xch.
	*
	* @param XCH01114 the xch01114 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01114(java.lang.String XCH01114) {
		_vrTechnicalSpec_XCH.setXCH01114(XCH01114);
	}

	/**
	* Sets the xch01115 of this vr technical spec_xch.
	*
	* @param XCH01115 the xch01115 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01115(java.lang.String XCH01115) {
		_vrTechnicalSpec_XCH.setXCH01115(XCH01115);
	}

	/**
	* Sets the xch01116 of this vr technical spec_xch.
	*
	* @param XCH01116 the xch01116 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01116(java.lang.String XCH01116) {
		_vrTechnicalSpec_XCH.setXCH01116(XCH01116);
	}

	/**
	* Sets the xch01117 of this vr technical spec_xch.
	*
	* @param XCH01117 the xch01117 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01117(java.lang.String XCH01117) {
		_vrTechnicalSpec_XCH.setXCH01117(XCH01117);
	}

	/**
	* Sets the xch01118 of this vr technical spec_xch.
	*
	* @param XCH01118 the xch01118 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01118(java.lang.String XCH01118) {
		_vrTechnicalSpec_XCH.setXCH01118(XCH01118);
	}

	/**
	* Sets the xch01119 of this vr technical spec_xch.
	*
	* @param XCH01119 the xch01119 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01119(java.lang.String XCH01119) {
		_vrTechnicalSpec_XCH.setXCH01119(XCH01119);
	}

	/**
	* Sets the xch01120 of this vr technical spec_xch.
	*
	* @param XCH01120 the xch01120 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01120(java.lang.String XCH01120) {
		_vrTechnicalSpec_XCH.setXCH01120(XCH01120);
	}

	/**
	* Sets the xch01121 of this vr technical spec_xch.
	*
	* @param XCH01121 the xch01121 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01121(java.lang.String XCH01121) {
		_vrTechnicalSpec_XCH.setXCH01121(XCH01121);
	}

	/**
	* Sets the xch01122 of this vr technical spec_xch.
	*
	* @param XCH01122 the xch01122 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01122(java.lang.String XCH01122) {
		_vrTechnicalSpec_XCH.setXCH01122(XCH01122);
	}

	/**
	* Sets the xch01123 of this vr technical spec_xch.
	*
	* @param XCH01123 the xch01123 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01123(java.lang.String XCH01123) {
		_vrTechnicalSpec_XCH.setXCH01123(XCH01123);
	}

	/**
	* Sets the xch01124 of this vr technical spec_xch.
	*
	* @param XCH01124 the xch01124 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01124(java.lang.String XCH01124) {
		_vrTechnicalSpec_XCH.setXCH01124(XCH01124);
	}

	/**
	* Sets the xch01125 of this vr technical spec_xch.
	*
	* @param XCH01125 the xch01125 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01125(java.lang.String XCH01125) {
		_vrTechnicalSpec_XCH.setXCH01125(XCH01125);
	}

	/**
	* Sets the xch01126 of this vr technical spec_xch.
	*
	* @param XCH01126 the xch01126 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01126(java.lang.String XCH01126) {
		_vrTechnicalSpec_XCH.setXCH01126(XCH01126);
	}

	/**
	* Sets the xch01127 of this vr technical spec_xch.
	*
	* @param XCH01127 the xch01127 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01127(java.lang.String XCH01127) {
		_vrTechnicalSpec_XCH.setXCH01127(XCH01127);
	}

	/**
	* Sets the xch01128 of this vr technical spec_xch.
	*
	* @param XCH01128 the xch01128 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01128(java.lang.String XCH01128) {
		_vrTechnicalSpec_XCH.setXCH01128(XCH01128);
	}

	/**
	* Sets the xch01129 of this vr technical spec_xch.
	*
	* @param XCH01129 the xch01129 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01129(java.lang.String XCH01129) {
		_vrTechnicalSpec_XCH.setXCH01129(XCH01129);
	}

	/**
	* Sets the xch01130 of this vr technical spec_xch.
	*
	* @param XCH01130 the xch01130 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01130(java.lang.String XCH01130) {
		_vrTechnicalSpec_XCH.setXCH01130(XCH01130);
	}

	/**
	* Sets the xch01131 of this vr technical spec_xch.
	*
	* @param XCH01131 the xch01131 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01131(java.lang.String XCH01131) {
		_vrTechnicalSpec_XCH.setXCH01131(XCH01131);
	}

	/**
	* Sets the xch01132 of this vr technical spec_xch.
	*
	* @param XCH01132 the xch01132 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01132(java.lang.String XCH01132) {
		_vrTechnicalSpec_XCH.setXCH01132(XCH01132);
	}

	/**
	* Sets the xch01133 of this vr technical spec_xch.
	*
	* @param XCH01133 the xch01133 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01133(java.lang.String XCH01133) {
		_vrTechnicalSpec_XCH.setXCH01133(XCH01133);
	}

	/**
	* Sets the xch01134 of this vr technical spec_xch.
	*
	* @param XCH01134 the xch01134 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01134(java.lang.String XCH01134) {
		_vrTechnicalSpec_XCH.setXCH01134(XCH01134);
	}

	/**
	* Sets the xch01135 of this vr technical spec_xch.
	*
	* @param XCH01135 the xch01135 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01135(java.lang.String XCH01135) {
		_vrTechnicalSpec_XCH.setXCH01135(XCH01135);
	}

	/**
	* Sets the xch01136 of this vr technical spec_xch.
	*
	* @param XCH01136 the xch01136 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01136(java.lang.String XCH01136) {
		_vrTechnicalSpec_XCH.setXCH01136(XCH01136);
	}

	/**
	* Sets the xch01137 of this vr technical spec_xch.
	*
	* @param XCH01137 the xch01137 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01137(java.lang.String XCH01137) {
		_vrTechnicalSpec_XCH.setXCH01137(XCH01137);
	}

	/**
	* Sets the xch01138 of this vr technical spec_xch.
	*
	* @param XCH01138 the xch01138 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01138(java.lang.String XCH01138) {
		_vrTechnicalSpec_XCH.setXCH01138(XCH01138);
	}

	/**
	* Sets the xch01139 of this vr technical spec_xch.
	*
	* @param XCH01139 the xch01139 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01139(java.lang.String XCH01139) {
		_vrTechnicalSpec_XCH.setXCH01139(XCH01139);
	}

	/**
	* Sets the xch01140 of this vr technical spec_xch.
	*
	* @param XCH01140 the xch01140 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01140(java.lang.String XCH01140) {
		_vrTechnicalSpec_XCH.setXCH01140(XCH01140);
	}

	/**
	* Sets the xch01141 of this vr technical spec_xch.
	*
	* @param XCH01141 the xch01141 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01141(java.lang.String XCH01141) {
		_vrTechnicalSpec_XCH.setXCH01141(XCH01141);
	}

	/**
	* Sets the xch01142 of this vr technical spec_xch.
	*
	* @param XCH01142 the xch01142 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01142(java.lang.String XCH01142) {
		_vrTechnicalSpec_XCH.setXCH01142(XCH01142);
	}

	/**
	* Sets the xch01143 of this vr technical spec_xch.
	*
	* @param XCH01143 the xch01143 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01143(java.lang.String XCH01143) {
		_vrTechnicalSpec_XCH.setXCH01143(XCH01143);
	}

	/**
	* Sets the xch01144 of this vr technical spec_xch.
	*
	* @param XCH01144 the xch01144 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01144(java.lang.String XCH01144) {
		_vrTechnicalSpec_XCH.setXCH01144(XCH01144);
	}

	/**
	* Sets the xch01145 of this vr technical spec_xch.
	*
	* @param XCH01145 the xch01145 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01145(java.lang.String XCH01145) {
		_vrTechnicalSpec_XCH.setXCH01145(XCH01145);
	}

	/**
	* Sets the xch01146 of this vr technical spec_xch.
	*
	* @param XCH01146 the xch01146 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01146(java.lang.String XCH01146) {
		_vrTechnicalSpec_XCH.setXCH01146(XCH01146);
	}

	/**
	* Sets the xch01147 of this vr technical spec_xch.
	*
	* @param XCH01147 the xch01147 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01147(java.lang.String XCH01147) {
		_vrTechnicalSpec_XCH.setXCH01147(XCH01147);
	}

	/**
	* Sets the xch01148 of this vr technical spec_xch.
	*
	* @param XCH01148 the xch01148 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01148(java.lang.String XCH01148) {
		_vrTechnicalSpec_XCH.setXCH01148(XCH01148);
	}

	/**
	* Sets the xch01149 of this vr technical spec_xch.
	*
	* @param XCH01149 the xch01149 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01149(java.lang.String XCH01149) {
		_vrTechnicalSpec_XCH.setXCH01149(XCH01149);
	}

	/**
	* Sets the xch01150 of this vr technical spec_xch.
	*
	* @param XCH01150 the xch01150 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01150(java.lang.String XCH01150) {
		_vrTechnicalSpec_XCH.setXCH01150(XCH01150);
	}

	/**
	* Sets the xch01151 of this vr technical spec_xch.
	*
	* @param XCH01151 the xch01151 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01151(java.lang.String XCH01151) {
		_vrTechnicalSpec_XCH.setXCH01151(XCH01151);
	}

	/**
	* Sets the xch01152 of this vr technical spec_xch.
	*
	* @param XCH01152 the xch01152 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01152(java.lang.String XCH01152) {
		_vrTechnicalSpec_XCH.setXCH01152(XCH01152);
	}

	/**
	* Sets the xch01153 of this vr technical spec_xch.
	*
	* @param XCH01153 the xch01153 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01153(java.lang.String XCH01153) {
		_vrTechnicalSpec_XCH.setXCH01153(XCH01153);
	}

	/**
	* Sets the xch01154 of this vr technical spec_xch.
	*
	* @param XCH01154 the xch01154 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01154(java.lang.String XCH01154) {
		_vrTechnicalSpec_XCH.setXCH01154(XCH01154);
	}

	/**
	* Sets the xch01155 of this vr technical spec_xch.
	*
	* @param XCH01155 the xch01155 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01155(java.lang.String XCH01155) {
		_vrTechnicalSpec_XCH.setXCH01155(XCH01155);
	}

	/**
	* Sets the xch01156 of this vr technical spec_xch.
	*
	* @param XCH01156 the xch01156 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01156(java.lang.String XCH01156) {
		_vrTechnicalSpec_XCH.setXCH01156(XCH01156);
	}

	/**
	* Sets the xch01157 of this vr technical spec_xch.
	*
	* @param XCH01157 the xch01157 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01157(java.lang.String XCH01157) {
		_vrTechnicalSpec_XCH.setXCH01157(XCH01157);
	}

	/**
	* Sets the xch01158 of this vr technical spec_xch.
	*
	* @param XCH01158 the xch01158 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01158(java.lang.String XCH01158) {
		_vrTechnicalSpec_XCH.setXCH01158(XCH01158);
	}

	/**
	* Sets the xch01159 of this vr technical spec_xch.
	*
	* @param XCH01159 the xch01159 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01159(java.lang.String XCH01159) {
		_vrTechnicalSpec_XCH.setXCH01159(XCH01159);
	}

	/**
	* Sets the xch01160 of this vr technical spec_xch.
	*
	* @param XCH01160 the xch01160 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01160(java.lang.String XCH01160) {
		_vrTechnicalSpec_XCH.setXCH01160(XCH01160);
	}

	/**
	* Sets the xch01161 of this vr technical spec_xch.
	*
	* @param XCH01161 the xch01161 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01161(java.lang.String XCH01161) {
		_vrTechnicalSpec_XCH.setXCH01161(XCH01161);
	}

	/**
	* Sets the xch01162 of this vr technical spec_xch.
	*
	* @param XCH01162 the xch01162 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01162(java.lang.String XCH01162) {
		_vrTechnicalSpec_XCH.setXCH01162(XCH01162);
	}

	/**
	* Sets the xch01163 of this vr technical spec_xch.
	*
	* @param XCH01163 the xch01163 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01163(java.lang.String XCH01163) {
		_vrTechnicalSpec_XCH.setXCH01163(XCH01163);
	}

	/**
	* Sets the xch01164 of this vr technical spec_xch.
	*
	* @param XCH01164 the xch01164 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01164(java.lang.String XCH01164) {
		_vrTechnicalSpec_XCH.setXCH01164(XCH01164);
	}

	/**
	* Sets the xch01165 of this vr technical spec_xch.
	*
	* @param XCH01165 the xch01165 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01165(java.lang.String XCH01165) {
		_vrTechnicalSpec_XCH.setXCH01165(XCH01165);
	}

	/**
	* Sets the xch01166 of this vr technical spec_xch.
	*
	* @param XCH01166 the xch01166 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01166(java.lang.String XCH01166) {
		_vrTechnicalSpec_XCH.setXCH01166(XCH01166);
	}

	/**
	* Sets the xch01167 of this vr technical spec_xch.
	*
	* @param XCH01167 the xch01167 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01167(java.lang.String XCH01167) {
		_vrTechnicalSpec_XCH.setXCH01167(XCH01167);
	}

	/**
	* Sets the xch01168 of this vr technical spec_xch.
	*
	* @param XCH01168 the xch01168 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01168(java.lang.String XCH01168) {
		_vrTechnicalSpec_XCH.setXCH01168(XCH01168);
	}

	/**
	* Sets the xch01169 of this vr technical spec_xch.
	*
	* @param XCH01169 the xch01169 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01169(java.lang.String XCH01169) {
		_vrTechnicalSpec_XCH.setXCH01169(XCH01169);
	}

	/**
	* Sets the xch01170 of this vr technical spec_xch.
	*
	* @param XCH01170 the xch01170 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01170(java.lang.String XCH01170) {
		_vrTechnicalSpec_XCH.setXCH01170(XCH01170);
	}

	/**
	* Sets the xch01171 of this vr technical spec_xch.
	*
	* @param XCH01171 the xch01171 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01171(java.lang.String XCH01171) {
		_vrTechnicalSpec_XCH.setXCH01171(XCH01171);
	}

	/**
	* Sets the xch01172 of this vr technical spec_xch.
	*
	* @param XCH01172 the xch01172 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01172(java.lang.String XCH01172) {
		_vrTechnicalSpec_XCH.setXCH01172(XCH01172);
	}

	/**
	* Sets the xch01173 of this vr technical spec_xch.
	*
	* @param XCH01173 the xch01173 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01173(java.lang.String XCH01173) {
		_vrTechnicalSpec_XCH.setXCH01173(XCH01173);
	}

	/**
	* Sets the xch01174 of this vr technical spec_xch.
	*
	* @param XCH01174 the xch01174 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01174(java.lang.String XCH01174) {
		_vrTechnicalSpec_XCH.setXCH01174(XCH01174);
	}

	/**
	* Sets the xch01175 of this vr technical spec_xch.
	*
	* @param XCH01175 the xch01175 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01175(java.lang.String XCH01175) {
		_vrTechnicalSpec_XCH.setXCH01175(XCH01175);
	}

	/**
	* Sets the xch01176 of this vr technical spec_xch.
	*
	* @param XCH01176 the xch01176 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01176(java.lang.String XCH01176) {
		_vrTechnicalSpec_XCH.setXCH01176(XCH01176);
	}

	/**
	* Sets the xch01177 of this vr technical spec_xch.
	*
	* @param XCH01177 the xch01177 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01177(java.lang.String XCH01177) {
		_vrTechnicalSpec_XCH.setXCH01177(XCH01177);
	}

	/**
	* Sets the xch01178 of this vr technical spec_xch.
	*
	* @param XCH01178 the xch01178 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01178(java.lang.String XCH01178) {
		_vrTechnicalSpec_XCH.setXCH01178(XCH01178);
	}

	/**
	* Sets the xch01179 of this vr technical spec_xch.
	*
	* @param XCH01179 the xch01179 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01179(java.lang.String XCH01179) {
		_vrTechnicalSpec_XCH.setXCH01179(XCH01179);
	}

	/**
	* Sets the xch01180 of this vr technical spec_xch.
	*
	* @param XCH01180 the xch01180 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01180(java.lang.String XCH01180) {
		_vrTechnicalSpec_XCH.setXCH01180(XCH01180);
	}

	/**
	* Sets the xch01181 of this vr technical spec_xch.
	*
	* @param XCH01181 the xch01181 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01181(java.lang.String XCH01181) {
		_vrTechnicalSpec_XCH.setXCH01181(XCH01181);
	}

	/**
	* Sets the xch01182 of this vr technical spec_xch.
	*
	* @param XCH01182 the xch01182 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01182(java.lang.String XCH01182) {
		_vrTechnicalSpec_XCH.setXCH01182(XCH01182);
	}

	/**
	* Sets the xch01183 of this vr technical spec_xch.
	*
	* @param XCH01183 the xch01183 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01183(java.lang.String XCH01183) {
		_vrTechnicalSpec_XCH.setXCH01183(XCH01183);
	}

	/**
	* Sets the xch01184 of this vr technical spec_xch.
	*
	* @param XCH01184 the xch01184 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01184(java.lang.String XCH01184) {
		_vrTechnicalSpec_XCH.setXCH01184(XCH01184);
	}

	/**
	* Sets the xch01185 of this vr technical spec_xch.
	*
	* @param XCH01185 the xch01185 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01185(java.lang.String XCH01185) {
		_vrTechnicalSpec_XCH.setXCH01185(XCH01185);
	}

	/**
	* Sets the xch01186 of this vr technical spec_xch.
	*
	* @param XCH01186 the xch01186 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01186(java.lang.String XCH01186) {
		_vrTechnicalSpec_XCH.setXCH01186(XCH01186);
	}

	/**
	* Sets the xch01187 of this vr technical spec_xch.
	*
	* @param XCH01187 the xch01187 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01187(java.lang.String XCH01187) {
		_vrTechnicalSpec_XCH.setXCH01187(XCH01187);
	}

	/**
	* Sets the xch01188 of this vr technical spec_xch.
	*
	* @param XCH01188 the xch01188 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01188(java.lang.String XCH01188) {
		_vrTechnicalSpec_XCH.setXCH01188(XCH01188);
	}

	/**
	* Sets the xch01189 of this vr technical spec_xch.
	*
	* @param XCH01189 the xch01189 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01189(java.lang.String XCH01189) {
		_vrTechnicalSpec_XCH.setXCH01189(XCH01189);
	}

	/**
	* Sets the xch01190 of this vr technical spec_xch.
	*
	* @param XCH01190 the xch01190 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01190(java.lang.String XCH01190) {
		_vrTechnicalSpec_XCH.setXCH01190(XCH01190);
	}

	/**
	* Sets the xch01191 of this vr technical spec_xch.
	*
	* @param XCH01191 the xch01191 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01191(java.lang.String XCH01191) {
		_vrTechnicalSpec_XCH.setXCH01191(XCH01191);
	}

	/**
	* Sets the xch01192 of this vr technical spec_xch.
	*
	* @param XCH01192 the xch01192 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01192(java.lang.String XCH01192) {
		_vrTechnicalSpec_XCH.setXCH01192(XCH01192);
	}

	/**
	* Sets the xch01193 of this vr technical spec_xch.
	*
	* @param XCH01193 the xch01193 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01193(java.lang.String XCH01193) {
		_vrTechnicalSpec_XCH.setXCH01193(XCH01193);
	}

	/**
	* Sets the xch01194 of this vr technical spec_xch.
	*
	* @param XCH01194 the xch01194 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01194(java.lang.String XCH01194) {
		_vrTechnicalSpec_XCH.setXCH01194(XCH01194);
	}

	/**
	* Sets the xch01195 of this vr technical spec_xch.
	*
	* @param XCH01195 the xch01195 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01195(java.lang.String XCH01195) {
		_vrTechnicalSpec_XCH.setXCH01195(XCH01195);
	}

	/**
	* Sets the xch01196 of this vr technical spec_xch.
	*
	* @param XCH01196 the xch01196 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01196(java.lang.String XCH01196) {
		_vrTechnicalSpec_XCH.setXCH01196(XCH01196);
	}

	/**
	* Sets the xch01197 of this vr technical spec_xch.
	*
	* @param XCH01197 the xch01197 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01197(java.lang.String XCH01197) {
		_vrTechnicalSpec_XCH.setXCH01197(XCH01197);
	}

	/**
	* Sets the xch01198 of this vr technical spec_xch.
	*
	* @param XCH01198 the xch01198 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01198(java.lang.String XCH01198) {
		_vrTechnicalSpec_XCH.setXCH01198(XCH01198);
	}

	/**
	* Sets the xch01199 of this vr technical spec_xch.
	*
	* @param XCH01199 the xch01199 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01199(java.lang.String XCH01199) {
		_vrTechnicalSpec_XCH.setXCH01199(XCH01199);
	}

	/**
	* Sets the xch01200 of this vr technical spec_xch.
	*
	* @param XCH01200 the xch01200 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01200(java.lang.String XCH01200) {
		_vrTechnicalSpec_XCH.setXCH01200(XCH01200);
	}

	/**
	* Sets the xch01201 of this vr technical spec_xch.
	*
	* @param XCH01201 the xch01201 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01201(java.lang.String XCH01201) {
		_vrTechnicalSpec_XCH.setXCH01201(XCH01201);
	}

	/**
	* Sets the xch01202 of this vr technical spec_xch.
	*
	* @param XCH01202 the xch01202 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01202(java.lang.String XCH01202) {
		_vrTechnicalSpec_XCH.setXCH01202(XCH01202);
	}

	/**
	* Sets the xch01203 of this vr technical spec_xch.
	*
	* @param XCH01203 the xch01203 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01203(java.lang.String XCH01203) {
		_vrTechnicalSpec_XCH.setXCH01203(XCH01203);
	}

	/**
	* Sets the xch01204 of this vr technical spec_xch.
	*
	* @param XCH01204 the xch01204 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01204(java.lang.String XCH01204) {
		_vrTechnicalSpec_XCH.setXCH01204(XCH01204);
	}

	/**
	* Sets the xch01205 of this vr technical spec_xch.
	*
	* @param XCH01205 the xch01205 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01205(java.lang.String XCH01205) {
		_vrTechnicalSpec_XCH.setXCH01205(XCH01205);
	}

	/**
	* Sets the xch01206 of this vr technical spec_xch.
	*
	* @param XCH01206 the xch01206 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01206(java.lang.String XCH01206) {
		_vrTechnicalSpec_XCH.setXCH01206(XCH01206);
	}

	/**
	* Sets the xch01207 of this vr technical spec_xch.
	*
	* @param XCH01207 the xch01207 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01207(java.lang.String XCH01207) {
		_vrTechnicalSpec_XCH.setXCH01207(XCH01207);
	}

	/**
	* Sets the xch01208 of this vr technical spec_xch.
	*
	* @param XCH01208 the xch01208 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01208(java.lang.String XCH01208) {
		_vrTechnicalSpec_XCH.setXCH01208(XCH01208);
	}

	/**
	* Sets the xch01209 of this vr technical spec_xch.
	*
	* @param XCH01209 the xch01209 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01209(java.lang.String XCH01209) {
		_vrTechnicalSpec_XCH.setXCH01209(XCH01209);
	}

	/**
	* Sets the xch01210 of this vr technical spec_xch.
	*
	* @param XCH01210 the xch01210 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01210(java.lang.String XCH01210) {
		_vrTechnicalSpec_XCH.setXCH01210(XCH01210);
	}

	/**
	* Sets the xch01211 of this vr technical spec_xch.
	*
	* @param XCH01211 the xch01211 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01211(java.lang.String XCH01211) {
		_vrTechnicalSpec_XCH.setXCH01211(XCH01211);
	}

	/**
	* Sets the xch01212 of this vr technical spec_xch.
	*
	* @param XCH01212 the xch01212 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01212(java.lang.String XCH01212) {
		_vrTechnicalSpec_XCH.setXCH01212(XCH01212);
	}

	/**
	* Sets the xch01213 of this vr technical spec_xch.
	*
	* @param XCH01213 the xch01213 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01213(java.lang.String XCH01213) {
		_vrTechnicalSpec_XCH.setXCH01213(XCH01213);
	}

	/**
	* Sets the xch01214 of this vr technical spec_xch.
	*
	* @param XCH01214 the xch01214 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01214(java.lang.String XCH01214) {
		_vrTechnicalSpec_XCH.setXCH01214(XCH01214);
	}

	/**
	* Sets the xch01215 of this vr technical spec_xch.
	*
	* @param XCH01215 the xch01215 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01215(java.lang.String XCH01215) {
		_vrTechnicalSpec_XCH.setXCH01215(XCH01215);
	}

	/**
	* Sets the xch01216 of this vr technical spec_xch.
	*
	* @param XCH01216 the xch01216 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01216(java.lang.String XCH01216) {
		_vrTechnicalSpec_XCH.setXCH01216(XCH01216);
	}

	/**
	* Sets the xch01217 of this vr technical spec_xch.
	*
	* @param XCH01217 the xch01217 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01217(java.lang.String XCH01217) {
		_vrTechnicalSpec_XCH.setXCH01217(XCH01217);
	}

	/**
	* Sets the xch01218 of this vr technical spec_xch.
	*
	* @param XCH01218 the xch01218 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01218(java.lang.String XCH01218) {
		_vrTechnicalSpec_XCH.setXCH01218(XCH01218);
	}

	/**
	* Sets the xch01219 of this vr technical spec_xch.
	*
	* @param XCH01219 the xch01219 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01219(java.lang.String XCH01219) {
		_vrTechnicalSpec_XCH.setXCH01219(XCH01219);
	}

	/**
	* Sets the xch01220 of this vr technical spec_xch.
	*
	* @param XCH01220 the xch01220 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01220(java.lang.String XCH01220) {
		_vrTechnicalSpec_XCH.setXCH01220(XCH01220);
	}

	/**
	* Sets the xch01221 of this vr technical spec_xch.
	*
	* @param XCH01221 the xch01221 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01221(java.lang.String XCH01221) {
		_vrTechnicalSpec_XCH.setXCH01221(XCH01221);
	}

	/**
	* Sets the xch01222 of this vr technical spec_xch.
	*
	* @param XCH01222 the xch01222 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01222(java.lang.String XCH01222) {
		_vrTechnicalSpec_XCH.setXCH01222(XCH01222);
	}

	/**
	* Sets the xch01223 of this vr technical spec_xch.
	*
	* @param XCH01223 the xch01223 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01223(java.lang.String XCH01223) {
		_vrTechnicalSpec_XCH.setXCH01223(XCH01223);
	}

	/**
	* Sets the xch01224 of this vr technical spec_xch.
	*
	* @param XCH01224 the xch01224 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01224(java.lang.String XCH01224) {
		_vrTechnicalSpec_XCH.setXCH01224(XCH01224);
	}

	/**
	* Sets the xch01225 of this vr technical spec_xch.
	*
	* @param XCH01225 the xch01225 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01225(java.lang.String XCH01225) {
		_vrTechnicalSpec_XCH.setXCH01225(XCH01225);
	}

	/**
	* Sets the xch01226 of this vr technical spec_xch.
	*
	* @param XCH01226 the xch01226 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01226(java.lang.String XCH01226) {
		_vrTechnicalSpec_XCH.setXCH01226(XCH01226);
	}

	/**
	* Sets the xch01227 of this vr technical spec_xch.
	*
	* @param XCH01227 the xch01227 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01227(java.lang.String XCH01227) {
		_vrTechnicalSpec_XCH.setXCH01227(XCH01227);
	}

	/**
	* Sets the xch01228 of this vr technical spec_xch.
	*
	* @param XCH01228 the xch01228 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01228(java.lang.String XCH01228) {
		_vrTechnicalSpec_XCH.setXCH01228(XCH01228);
	}

	/**
	* Sets the xch01229 of this vr technical spec_xch.
	*
	* @param XCH01229 the xch01229 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01229(java.lang.String XCH01229) {
		_vrTechnicalSpec_XCH.setXCH01229(XCH01229);
	}

	/**
	* Sets the xch01230 of this vr technical spec_xch.
	*
	* @param XCH01230 the xch01230 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01230(java.lang.String XCH01230) {
		_vrTechnicalSpec_XCH.setXCH01230(XCH01230);
	}

	/**
	* Sets the xch01231 of this vr technical spec_xch.
	*
	* @param XCH01231 the xch01231 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01231(java.lang.String XCH01231) {
		_vrTechnicalSpec_XCH.setXCH01231(XCH01231);
	}

	/**
	* Sets the xch01232 of this vr technical spec_xch.
	*
	* @param XCH01232 the xch01232 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01232(java.lang.String XCH01232) {
		_vrTechnicalSpec_XCH.setXCH01232(XCH01232);
	}

	/**
	* Sets the xch01233 of this vr technical spec_xch.
	*
	* @param XCH01233 the xch01233 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01233(java.lang.String XCH01233) {
		_vrTechnicalSpec_XCH.setXCH01233(XCH01233);
	}

	/**
	* Sets the xch01234 of this vr technical spec_xch.
	*
	* @param XCH01234 the xch01234 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01234(java.lang.String XCH01234) {
		_vrTechnicalSpec_XCH.setXCH01234(XCH01234);
	}

	/**
	* Sets the xch01235 of this vr technical spec_xch.
	*
	* @param XCH01235 the xch01235 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01235(java.lang.String XCH01235) {
		_vrTechnicalSpec_XCH.setXCH01235(XCH01235);
	}

	/**
	* Sets the xch01236 of this vr technical spec_xch.
	*
	* @param XCH01236 the xch01236 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01236(java.lang.String XCH01236) {
		_vrTechnicalSpec_XCH.setXCH01236(XCH01236);
	}

	/**
	* Sets the xch01237 of this vr technical spec_xch.
	*
	* @param XCH01237 the xch01237 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01237(java.lang.String XCH01237) {
		_vrTechnicalSpec_XCH.setXCH01237(XCH01237);
	}

	/**
	* Sets the xch01238 of this vr technical spec_xch.
	*
	* @param XCH01238 the xch01238 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01238(java.lang.String XCH01238) {
		_vrTechnicalSpec_XCH.setXCH01238(XCH01238);
	}

	/**
	* Sets the xch01239 of this vr technical spec_xch.
	*
	* @param XCH01239 the xch01239 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01239(java.lang.String XCH01239) {
		_vrTechnicalSpec_XCH.setXCH01239(XCH01239);
	}

	/**
	* Sets the xch01240 of this vr technical spec_xch.
	*
	* @param XCH01240 the xch01240 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01240(java.lang.String XCH01240) {
		_vrTechnicalSpec_XCH.setXCH01240(XCH01240);
	}

	/**
	* Sets the xch01241 of this vr technical spec_xch.
	*
	* @param XCH01241 the xch01241 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01241(java.lang.String XCH01241) {
		_vrTechnicalSpec_XCH.setXCH01241(XCH01241);
	}

	/**
	* Sets the xch01242 of this vr technical spec_xch.
	*
	* @param XCH01242 the xch01242 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01242(java.lang.String XCH01242) {
		_vrTechnicalSpec_XCH.setXCH01242(XCH01242);
	}

	/**
	* Sets the xch01243 of this vr technical spec_xch.
	*
	* @param XCH01243 the xch01243 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01243(java.lang.String XCH01243) {
		_vrTechnicalSpec_XCH.setXCH01243(XCH01243);
	}

	/**
	* Sets the xch01244 of this vr technical spec_xch.
	*
	* @param XCH01244 the xch01244 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01244(java.lang.String XCH01244) {
		_vrTechnicalSpec_XCH.setXCH01244(XCH01244);
	}

	/**
	* Sets the xch01245 of this vr technical spec_xch.
	*
	* @param XCH01245 the xch01245 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01245(java.lang.String XCH01245) {
		_vrTechnicalSpec_XCH.setXCH01245(XCH01245);
	}

	/**
	* Sets the xch01246 of this vr technical spec_xch.
	*
	* @param XCH01246 the xch01246 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01246(java.lang.String XCH01246) {
		_vrTechnicalSpec_XCH.setXCH01246(XCH01246);
	}

	/**
	* Sets the xch01247 of this vr technical spec_xch.
	*
	* @param XCH01247 the xch01247 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01247(java.lang.String XCH01247) {
		_vrTechnicalSpec_XCH.setXCH01247(XCH01247);
	}

	/**
	* Sets the xch01248 of this vr technical spec_xch.
	*
	* @param XCH01248 the xch01248 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01248(java.lang.String XCH01248) {
		_vrTechnicalSpec_XCH.setXCH01248(XCH01248);
	}

	/**
	* Sets the xch01249 of this vr technical spec_xch.
	*
	* @param XCH01249 the xch01249 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01249(java.lang.String XCH01249) {
		_vrTechnicalSpec_XCH.setXCH01249(XCH01249);
	}

	/**
	* Sets the xch01250 of this vr technical spec_xch.
	*
	* @param XCH01250 the xch01250 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01250(java.lang.String XCH01250) {
		_vrTechnicalSpec_XCH.setXCH01250(XCH01250);
	}

	/**
	* Sets the xch01251 of this vr technical spec_xch.
	*
	* @param XCH01251 the xch01251 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01251(java.lang.String XCH01251) {
		_vrTechnicalSpec_XCH.setXCH01251(XCH01251);
	}

	/**
	* Sets the xch01252 of this vr technical spec_xch.
	*
	* @param XCH01252 the xch01252 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01252(java.lang.String XCH01252) {
		_vrTechnicalSpec_XCH.setXCH01252(XCH01252);
	}

	/**
	* Sets the xch01253 of this vr technical spec_xch.
	*
	* @param XCH01253 the xch01253 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01253(java.lang.String XCH01253) {
		_vrTechnicalSpec_XCH.setXCH01253(XCH01253);
	}

	/**
	* Sets the xch01254 of this vr technical spec_xch.
	*
	* @param XCH01254 the xch01254 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01254(java.lang.String XCH01254) {
		_vrTechnicalSpec_XCH.setXCH01254(XCH01254);
	}

	/**
	* Sets the xch01255 of this vr technical spec_xch.
	*
	* @param XCH01255 the xch01255 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01255(java.lang.String XCH01255) {
		_vrTechnicalSpec_XCH.setXCH01255(XCH01255);
	}

	/**
	* Sets the xch01256 of this vr technical spec_xch.
	*
	* @param XCH01256 the xch01256 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01256(java.lang.String XCH01256) {
		_vrTechnicalSpec_XCH.setXCH01256(XCH01256);
	}

	/**
	* Sets the xch01257 of this vr technical spec_xch.
	*
	* @param XCH01257 the xch01257 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01257(java.lang.String XCH01257) {
		_vrTechnicalSpec_XCH.setXCH01257(XCH01257);
	}

	/**
	* Sets the xch01258 of this vr technical spec_xch.
	*
	* @param XCH01258 the xch01258 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01258(java.lang.String XCH01258) {
		_vrTechnicalSpec_XCH.setXCH01258(XCH01258);
	}

	/**
	* Sets the xch01259 of this vr technical spec_xch.
	*
	* @param XCH01259 the xch01259 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01259(java.lang.String XCH01259) {
		_vrTechnicalSpec_XCH.setXCH01259(XCH01259);
	}

	/**
	* Sets the xch01260 of this vr technical spec_xch.
	*
	* @param XCH01260 the xch01260 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01260(java.lang.String XCH01260) {
		_vrTechnicalSpec_XCH.setXCH01260(XCH01260);
	}

	/**
	* Sets the xch01261 of this vr technical spec_xch.
	*
	* @param XCH01261 the xch01261 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01261(java.lang.String XCH01261) {
		_vrTechnicalSpec_XCH.setXCH01261(XCH01261);
	}

	/**
	* Sets the xch01262 of this vr technical spec_xch.
	*
	* @param XCH01262 the xch01262 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01262(java.lang.String XCH01262) {
		_vrTechnicalSpec_XCH.setXCH01262(XCH01262);
	}

	/**
	* Sets the xch01263 of this vr technical spec_xch.
	*
	* @param XCH01263 the xch01263 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01263(java.lang.String XCH01263) {
		_vrTechnicalSpec_XCH.setXCH01263(XCH01263);
	}

	/**
	* Sets the xch01264 of this vr technical spec_xch.
	*
	* @param XCH01264 the xch01264 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01264(java.lang.String XCH01264) {
		_vrTechnicalSpec_XCH.setXCH01264(XCH01264);
	}

	/**
	* Sets the xch01265 of this vr technical spec_xch.
	*
	* @param XCH01265 the xch01265 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01265(java.lang.String XCH01265) {
		_vrTechnicalSpec_XCH.setXCH01265(XCH01265);
	}

	/**
	* Sets the xch01266 of this vr technical spec_xch.
	*
	* @param XCH01266 the xch01266 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01266(java.lang.String XCH01266) {
		_vrTechnicalSpec_XCH.setXCH01266(XCH01266);
	}

	/**
	* Sets the xch01267 of this vr technical spec_xch.
	*
	* @param XCH01267 the xch01267 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01267(java.lang.String XCH01267) {
		_vrTechnicalSpec_XCH.setXCH01267(XCH01267);
	}

	/**
	* Sets the xch01268 of this vr technical spec_xch.
	*
	* @param XCH01268 the xch01268 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01268(java.lang.String XCH01268) {
		_vrTechnicalSpec_XCH.setXCH01268(XCH01268);
	}

	/**
	* Sets the xch01269 of this vr technical spec_xch.
	*
	* @param XCH01269 the xch01269 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01269(java.lang.String XCH01269) {
		_vrTechnicalSpec_XCH.setXCH01269(XCH01269);
	}

	/**
	* Sets the xch01270 of this vr technical spec_xch.
	*
	* @param XCH01270 the xch01270 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01270(java.lang.String XCH01270) {
		_vrTechnicalSpec_XCH.setXCH01270(XCH01270);
	}

	/**
	* Sets the xch01271 of this vr technical spec_xch.
	*
	* @param XCH01271 the xch01271 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01271(java.lang.String XCH01271) {
		_vrTechnicalSpec_XCH.setXCH01271(XCH01271);
	}

	/**
	* Sets the xch01272 of this vr technical spec_xch.
	*
	* @param XCH01272 the xch01272 of this vr technical spec_xch
	*/
	@Override
	public void setXCH01272(java.lang.String XCH01272) {
		_vrTechnicalSpec_XCH.setXCH01272(XCH01272);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCHWrapper)) {
			return false;
		}

		VRTechnicalSpec_XCHWrapper vrTechnicalSpec_XCHWrapper = (VRTechnicalSpec_XCHWrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XCH,
					vrTechnicalSpec_XCHWrapper._vrTechnicalSpec_XCH)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XCH getWrappedModel() {
		return _vrTechnicalSpec_XCH;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XCH.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XCH.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XCH.resetOriginalValues();
	}

	private final VRTechnicalSpec_XCH _vrTechnicalSpec_XCH;
}