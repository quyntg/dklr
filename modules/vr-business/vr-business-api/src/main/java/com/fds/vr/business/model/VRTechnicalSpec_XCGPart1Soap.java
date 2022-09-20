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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart1Soap implements Serializable {
	public static VRTechnicalSpec_XCGPart1Soap toSoapModel(
		VRTechnicalSpec_XCGPart1 model) {
		VRTechnicalSpec_XCGPart1Soap soapModel = new VRTechnicalSpec_XCGPart1Soap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setConvertAssembleId(model.getConvertAssembleId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setReferenceUid(model.getReferenceUid());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDeliverableCode(model.getDeliverableCode());
		soapModel.setVehicleTypeCertificateId(model.getVehicleTypeCertificateId());
		soapModel.setLoai_dong_co(model.getLoai_dong_co());
		soapModel.setXCG01001(model.getXCG01001());
		soapModel.setXCG01002(model.getXCG01002());
		soapModel.setXCG01003(model.getXCG01003());
		soapModel.setXCG01004(model.getXCG01004());
		soapModel.setXCG01005(model.getXCG01005());
		soapModel.setXCG01006(model.getXCG01006());
		soapModel.setXCG01007(model.getXCG01007());
		soapModel.setXCG01008(model.getXCG01008());
		soapModel.setXCG01009(model.getXCG01009());
		soapModel.setXCG01010(model.getXCG01010());
		soapModel.setXCG01011(model.getXCG01011());
		soapModel.setXCG01012(model.getXCG01012());
		soapModel.setXCG01013(model.getXCG01013());
		soapModel.setXCG01014(model.getXCG01014());
		soapModel.setXCG01016(model.getXCG01016());
		soapModel.setXCG01017(model.getXCG01017());
		soapModel.setXCG01019(model.getXCG01019());
		soapModel.setXCG01020(model.getXCG01020());
		soapModel.setXCG01021(model.getXCG01021());
		soapModel.setXCG01022(model.getXCG01022());
		soapModel.setXCG01024(model.getXCG01024());
		soapModel.setXCG01025(model.getXCG01025());
		soapModel.setXCG01026(model.getXCG01026());
		soapModel.setXCG01027(model.getXCG01027());
		soapModel.setXCG01028(model.getXCG01028());
		soapModel.setXCG01030(model.getXCG01030());
		soapModel.setXCG01031(model.getXCG01031());
		soapModel.setXCG01032(model.getXCG01032());
		soapModel.setXCG01033(model.getXCG01033());
		soapModel.setXCG01034(model.getXCG01034());
		soapModel.setXCG01035(model.getXCG01035());
		soapModel.setXCG01036(model.getXCG01036());
		soapModel.setXCG01037(model.getXCG01037());
		soapModel.setXCG01038(model.getXCG01038());
		soapModel.setXCG01039(model.getXCG01039());
		soapModel.setXCG01040(model.getXCG01040());
		soapModel.setXCG01041(model.getXCG01041());
		soapModel.setXCG01042(model.getXCG01042());
		soapModel.setXCG01043(model.getXCG01043());
		soapModel.setXCG01044(model.getXCG01044());
		soapModel.setXCG01045(model.getXCG01045());
		soapModel.setXCG01046(model.getXCG01046());
		soapModel.setXCG01047(model.getXCG01047());
		soapModel.setXCG01049(model.getXCG01049());
		soapModel.setXCG01050(model.getXCG01050());
		soapModel.setXCG01051(model.getXCG01051());
		soapModel.setXCG01052(model.getXCG01052());
		soapModel.setXCG01053(model.getXCG01053());
		soapModel.setXCG01054(model.getXCG01054());
		soapModel.setXCG01055(model.getXCG01055());
		soapModel.setXCG01056(model.getXCG01056());
		soapModel.setXCG01057(model.getXCG01057());
		soapModel.setXCG01058(model.getXCG01058());
		soapModel.setXCG01059(model.getXCG01059());
		soapModel.setXCG01060(model.getXCG01060());
		soapModel.setXCG01062(model.getXCG01062());
		soapModel.setXCG01063(model.getXCG01063());
		soapModel.setXCG01064(model.getXCG01064());
		soapModel.setXCG01065(model.getXCG01065());
		soapModel.setXCG01066(model.getXCG01066());
		soapModel.setXCG01067(model.getXCG01067());
		soapModel.setXCG01068(model.getXCG01068());
		soapModel.setXCG01069(model.getXCG01069());
		soapModel.setXCG01070(model.getXCG01070());
		soapModel.setXCG01072(model.getXCG01072());
		soapModel.setXCG01073(model.getXCG01073());
		soapModel.setXCG01074(model.getXCG01074());
		soapModel.setXCG01075(model.getXCG01075());
		soapModel.setXCG01076(model.getXCG01076());
		soapModel.setXCG01077(model.getXCG01077());
		soapModel.setXCG01078(model.getXCG01078());
		soapModel.setXCG01079(model.getXCG01079());
		soapModel.setXCG01080(model.getXCG01080());
		soapModel.setXCG01081(model.getXCG01081());
		soapModel.setXCG01082(model.getXCG01082());
		soapModel.setXCG01083(model.getXCG01083());
		soapModel.setXCG01084(model.getXCG01084());
		soapModel.setXCG01085(model.getXCG01085());
		soapModel.setXCG01086(model.getXCG01086());
		soapModel.setXCG01087(model.getXCG01087());
		soapModel.setXCG01088(model.getXCG01088());
		soapModel.setXCG01089(model.getXCG01089());
		soapModel.setXCG01090(model.getXCG01090());
		soapModel.setXCG01091(model.getXCG01091());
		soapModel.setXCG01092(model.getXCG01092());
		soapModel.setXCG01093(model.getXCG01093());
		soapModel.setXCG01094(model.getXCG01094());
		soapModel.setXCG01095(model.getXCG01095());
		soapModel.setXCG01096(model.getXCG01096());
		soapModel.setXCG01097(model.getXCG01097());
		soapModel.setXCG01098(model.getXCG01098());
		soapModel.setXCG01099(model.getXCG01099());
		soapModel.setXCG01100(model.getXCG01100());
		soapModel.setXCG01101(model.getXCG01101());
		soapModel.setXCG01102(model.getXCG01102());
		soapModel.setXCG01103(model.getXCG01103());
		soapModel.setXCG01104(model.getXCG01104());
		soapModel.setXCG01105(model.getXCG01105());
		soapModel.setXCG01106(model.getXCG01106());
		soapModel.setXCG01107(model.getXCG01107());
		soapModel.setXCG01108(model.getXCG01108());
		soapModel.setXCG01109(model.getXCG01109());
		soapModel.setXCG01110(model.getXCG01110());
		soapModel.setXCG01111(model.getXCG01111());
		soapModel.setXCG01112(model.getXCG01112());
		soapModel.setXCG01113(model.getXCG01113());
		soapModel.setXCG01114(model.getXCG01114());
		soapModel.setXCG01115(model.getXCG01115());
		soapModel.setXCG01116(model.getXCG01116());
		soapModel.setXCG01117(model.getXCG01117());
		soapModel.setXCG01118(model.getXCG01118());
		soapModel.setXCG01119(model.getXCG01119());
		soapModel.setXCG01120(model.getXCG01120());
		soapModel.setXCG01121(model.getXCG01121());
		soapModel.setXCG01122(model.getXCG01122());
		soapModel.setXCG01123(model.getXCG01123());
		soapModel.setXCG01124(model.getXCG01124());
		soapModel.setXCG01125(model.getXCG01125());
		soapModel.setXCG01126(model.getXCG01126());
		soapModel.setXCG01127(model.getXCG01127());
		soapModel.setXCG01128(model.getXCG01128());
		soapModel.setXCG01129(model.getXCG01129());
		soapModel.setXCG01130(model.getXCG01130());
		soapModel.setXCG01131(model.getXCG01131());
		soapModel.setXCG01132(model.getXCG01132());
		soapModel.setXCG01133(model.getXCG01133());
		soapModel.setXCG01134(model.getXCG01134());
		soapModel.setXCG01135(model.getXCG01135());
		soapModel.setXCG01136(model.getXCG01136());
		soapModel.setXCG01137(model.getXCG01137());
		soapModel.setXCG01138(model.getXCG01138());
		soapModel.setXCG01139(model.getXCG01139());
		soapModel.setXCG01140(model.getXCG01140());
		soapModel.setXCG01141(model.getXCG01141());
		soapModel.setXCG01142(model.getXCG01142());
		soapModel.setXCG01143(model.getXCG01143());
		soapModel.setXCG01144(model.getXCG01144());
		soapModel.setXCG01145(model.getXCG01145());
		soapModel.setXCG01146(model.getXCG01146());
		soapModel.setXCG01147(model.getXCG01147());
		soapModel.setXCG01148(model.getXCG01148());
		soapModel.setXCG01149(model.getXCG01149());
		soapModel.setXCG01150(model.getXCG01150());
		soapModel.setXCG01151(model.getXCG01151());
		soapModel.setXCG01152(model.getXCG01152());
		soapModel.setXCG01153(model.getXCG01153());
		soapModel.setXCG01154(model.getXCG01154());
		soapModel.setXCG01155(model.getXCG01155());
		soapModel.setXCG01156(model.getXCG01156());
		soapModel.setXCG01157(model.getXCG01157());
		soapModel.setXCG01158(model.getXCG01158());
		soapModel.setXCG01159(model.getXCG01159());
		soapModel.setXCG01160(model.getXCG01160());
		soapModel.setXCG01161(model.getXCG01161());
		soapModel.setXCG01162(model.getXCG01162());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRTechnicalSpec_XCGPart1Soap[] toSoapModels(
		VRTechnicalSpec_XCGPart1[] models) {
		VRTechnicalSpec_XCGPart1Soap[] soapModels = new VRTechnicalSpec_XCGPart1Soap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCGPart1Soap[][] toSoapModels(
		VRTechnicalSpec_XCGPart1[][] models) {
		VRTechnicalSpec_XCGPart1Soap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRTechnicalSpec_XCGPart1Soap[models.length][models[0].length];
		}
		else {
			soapModels = new VRTechnicalSpec_XCGPart1Soap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCGPart1Soap[] toSoapModels(
		List<VRTechnicalSpec_XCGPart1> models) {
		List<VRTechnicalSpec_XCGPart1Soap> soapModels = new ArrayList<VRTechnicalSpec_XCGPart1Soap>(models.size());

		for (VRTechnicalSpec_XCGPart1 model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRTechnicalSpec_XCGPart1Soap[soapModels.size()]);
	}

	public VRTechnicalSpec_XCGPart1Soap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getMtCore() {
		return _mtCore;
	}

	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	public long getConvertAssembleId() {
		return _convertAssembleId;
	}

	public void setConvertAssembleId(long convertAssembleId) {
		_convertAssembleId = convertAssembleId;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getDossierNo() {
		return _dossierNo;
	}

	public void setDossierNo(String dossierNo) {
		_dossierNo = dossierNo;
	}

	public String getReferenceUid() {
		return _referenceUid;
	}

	public void setReferenceUid(String referenceUid) {
		_referenceUid = referenceUid;
	}

	public String getDossierIdCTN() {
		return _dossierIdCTN;
	}

	public void setDossierIdCTN(String dossierIdCTN) {
		_dossierIdCTN = dossierIdCTN;
	}

	public String getDeliverableCode() {
		return _deliverableCode;
	}

	public void setDeliverableCode(String deliverableCode) {
		_deliverableCode = deliverableCode;
	}

	public long getVehicleTypeCertificateId() {
		return _vehicleTypeCertificateId;
	}

	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vehicleTypeCertificateId = vehicleTypeCertificateId;
	}

	public String getLoai_dong_co() {
		return _loai_dong_co;
	}

	public void setLoai_dong_co(String loai_dong_co) {
		_loai_dong_co = loai_dong_co;
	}

	public String getXCG01001() {
		return _XCG01001;
	}

	public void setXCG01001(String XCG01001) {
		_XCG01001 = XCG01001;
	}

	public String getXCG01002() {
		return _XCG01002;
	}

	public void setXCG01002(String XCG01002) {
		_XCG01002 = XCG01002;
	}

	public String getXCG01003() {
		return _XCG01003;
	}

	public void setXCG01003(String XCG01003) {
		_XCG01003 = XCG01003;
	}

	public String getXCG01004() {
		return _XCG01004;
	}

	public void setXCG01004(String XCG01004) {
		_XCG01004 = XCG01004;
	}

	public String getXCG01005() {
		return _XCG01005;
	}

	public void setXCG01005(String XCG01005) {
		_XCG01005 = XCG01005;
	}

	public String getXCG01006() {
		return _XCG01006;
	}

	public void setXCG01006(String XCG01006) {
		_XCG01006 = XCG01006;
	}

	public String getXCG01007() {
		return _XCG01007;
	}

	public void setXCG01007(String XCG01007) {
		_XCG01007 = XCG01007;
	}

	public String getXCG01008() {
		return _XCG01008;
	}

	public void setXCG01008(String XCG01008) {
		_XCG01008 = XCG01008;
	}

	public String getXCG01009() {
		return _XCG01009;
	}

	public void setXCG01009(String XCG01009) {
		_XCG01009 = XCG01009;
	}

	public String getXCG01010() {
		return _XCG01010;
	}

	public void setXCG01010(String XCG01010) {
		_XCG01010 = XCG01010;
	}

	public String getXCG01011() {
		return _XCG01011;
	}

	public void setXCG01011(String XCG01011) {
		_XCG01011 = XCG01011;
	}

	public String getXCG01012() {
		return _XCG01012;
	}

	public void setXCG01012(String XCG01012) {
		_XCG01012 = XCG01012;
	}

	public String getXCG01013() {
		return _XCG01013;
	}

	public void setXCG01013(String XCG01013) {
		_XCG01013 = XCG01013;
	}

	public String getXCG01014() {
		return _XCG01014;
	}

	public void setXCG01014(String XCG01014) {
		_XCG01014 = XCG01014;
	}

	public String getXCG01016() {
		return _XCG01016;
	}

	public void setXCG01016(String XCG01016) {
		_XCG01016 = XCG01016;
	}

	public String getXCG01017() {
		return _XCG01017;
	}

	public void setXCG01017(String XCG01017) {
		_XCG01017 = XCG01017;
	}

	public String getXCG01019() {
		return _XCG01019;
	}

	public void setXCG01019(String XCG01019) {
		_XCG01019 = XCG01019;
	}

	public String getXCG01020() {
		return _XCG01020;
	}

	public void setXCG01020(String XCG01020) {
		_XCG01020 = XCG01020;
	}

	public String getXCG01021() {
		return _XCG01021;
	}

	public void setXCG01021(String XCG01021) {
		_XCG01021 = XCG01021;
	}

	public String getXCG01022() {
		return _XCG01022;
	}

	public void setXCG01022(String XCG01022) {
		_XCG01022 = XCG01022;
	}

	public String getXCG01024() {
		return _XCG01024;
	}

	public void setXCG01024(String XCG01024) {
		_XCG01024 = XCG01024;
	}

	public String getXCG01025() {
		return _XCG01025;
	}

	public void setXCG01025(String XCG01025) {
		_XCG01025 = XCG01025;
	}

	public String getXCG01026() {
		return _XCG01026;
	}

	public void setXCG01026(String XCG01026) {
		_XCG01026 = XCG01026;
	}

	public String getXCG01027() {
		return _XCG01027;
	}

	public void setXCG01027(String XCG01027) {
		_XCG01027 = XCG01027;
	}

	public String getXCG01028() {
		return _XCG01028;
	}

	public void setXCG01028(String XCG01028) {
		_XCG01028 = XCG01028;
	}

	public String getXCG01030() {
		return _XCG01030;
	}

	public void setXCG01030(String XCG01030) {
		_XCG01030 = XCG01030;
	}

	public String getXCG01031() {
		return _XCG01031;
	}

	public void setXCG01031(String XCG01031) {
		_XCG01031 = XCG01031;
	}

	public String getXCG01032() {
		return _XCG01032;
	}

	public void setXCG01032(String XCG01032) {
		_XCG01032 = XCG01032;
	}

	public String getXCG01033() {
		return _XCG01033;
	}

	public void setXCG01033(String XCG01033) {
		_XCG01033 = XCG01033;
	}

	public String getXCG01034() {
		return _XCG01034;
	}

	public void setXCG01034(String XCG01034) {
		_XCG01034 = XCG01034;
	}

	public String getXCG01035() {
		return _XCG01035;
	}

	public void setXCG01035(String XCG01035) {
		_XCG01035 = XCG01035;
	}

	public String getXCG01036() {
		return _XCG01036;
	}

	public void setXCG01036(String XCG01036) {
		_XCG01036 = XCG01036;
	}

	public String getXCG01037() {
		return _XCG01037;
	}

	public void setXCG01037(String XCG01037) {
		_XCG01037 = XCG01037;
	}

	public String getXCG01038() {
		return _XCG01038;
	}

	public void setXCG01038(String XCG01038) {
		_XCG01038 = XCG01038;
	}

	public String getXCG01039() {
		return _XCG01039;
	}

	public void setXCG01039(String XCG01039) {
		_XCG01039 = XCG01039;
	}

	public String getXCG01040() {
		return _XCG01040;
	}

	public void setXCG01040(String XCG01040) {
		_XCG01040 = XCG01040;
	}

	public String getXCG01041() {
		return _XCG01041;
	}

	public void setXCG01041(String XCG01041) {
		_XCG01041 = XCG01041;
	}

	public String getXCG01042() {
		return _XCG01042;
	}

	public void setXCG01042(String XCG01042) {
		_XCG01042 = XCG01042;
	}

	public String getXCG01043() {
		return _XCG01043;
	}

	public void setXCG01043(String XCG01043) {
		_XCG01043 = XCG01043;
	}

	public String getXCG01044() {
		return _XCG01044;
	}

	public void setXCG01044(String XCG01044) {
		_XCG01044 = XCG01044;
	}

	public String getXCG01045() {
		return _XCG01045;
	}

	public void setXCG01045(String XCG01045) {
		_XCG01045 = XCG01045;
	}

	public String getXCG01046() {
		return _XCG01046;
	}

	public void setXCG01046(String XCG01046) {
		_XCG01046 = XCG01046;
	}

	public String getXCG01047() {
		return _XCG01047;
	}

	public void setXCG01047(String XCG01047) {
		_XCG01047 = XCG01047;
	}

	public String getXCG01049() {
		return _XCG01049;
	}

	public void setXCG01049(String XCG01049) {
		_XCG01049 = XCG01049;
	}

	public String getXCG01050() {
		return _XCG01050;
	}

	public void setXCG01050(String XCG01050) {
		_XCG01050 = XCG01050;
	}

	public String getXCG01051() {
		return _XCG01051;
	}

	public void setXCG01051(String XCG01051) {
		_XCG01051 = XCG01051;
	}

	public String getXCG01052() {
		return _XCG01052;
	}

	public void setXCG01052(String XCG01052) {
		_XCG01052 = XCG01052;
	}

	public String getXCG01053() {
		return _XCG01053;
	}

	public void setXCG01053(String XCG01053) {
		_XCG01053 = XCG01053;
	}

	public String getXCG01054() {
		return _XCG01054;
	}

	public void setXCG01054(String XCG01054) {
		_XCG01054 = XCG01054;
	}

	public String getXCG01055() {
		return _XCG01055;
	}

	public void setXCG01055(String XCG01055) {
		_XCG01055 = XCG01055;
	}

	public String getXCG01056() {
		return _XCG01056;
	}

	public void setXCG01056(String XCG01056) {
		_XCG01056 = XCG01056;
	}

	public String getXCG01057() {
		return _XCG01057;
	}

	public void setXCG01057(String XCG01057) {
		_XCG01057 = XCG01057;
	}

	public String getXCG01058() {
		return _XCG01058;
	}

	public void setXCG01058(String XCG01058) {
		_XCG01058 = XCG01058;
	}

	public String getXCG01059() {
		return _XCG01059;
	}

	public void setXCG01059(String XCG01059) {
		_XCG01059 = XCG01059;
	}

	public String getXCG01060() {
		return _XCG01060;
	}

	public void setXCG01060(String XCG01060) {
		_XCG01060 = XCG01060;
	}

	public String getXCG01062() {
		return _XCG01062;
	}

	public void setXCG01062(String XCG01062) {
		_XCG01062 = XCG01062;
	}

	public String getXCG01063() {
		return _XCG01063;
	}

	public void setXCG01063(String XCG01063) {
		_XCG01063 = XCG01063;
	}

	public String getXCG01064() {
		return _XCG01064;
	}

	public void setXCG01064(String XCG01064) {
		_XCG01064 = XCG01064;
	}

	public String getXCG01065() {
		return _XCG01065;
	}

	public void setXCG01065(String XCG01065) {
		_XCG01065 = XCG01065;
	}

	public String getXCG01066() {
		return _XCG01066;
	}

	public void setXCG01066(String XCG01066) {
		_XCG01066 = XCG01066;
	}

	public String getXCG01067() {
		return _XCG01067;
	}

	public void setXCG01067(String XCG01067) {
		_XCG01067 = XCG01067;
	}

	public String getXCG01068() {
		return _XCG01068;
	}

	public void setXCG01068(String XCG01068) {
		_XCG01068 = XCG01068;
	}

	public String getXCG01069() {
		return _XCG01069;
	}

	public void setXCG01069(String XCG01069) {
		_XCG01069 = XCG01069;
	}

	public String getXCG01070() {
		return _XCG01070;
	}

	public void setXCG01070(String XCG01070) {
		_XCG01070 = XCG01070;
	}

	public String getXCG01072() {
		return _XCG01072;
	}

	public void setXCG01072(String XCG01072) {
		_XCG01072 = XCG01072;
	}

	public String getXCG01073() {
		return _XCG01073;
	}

	public void setXCG01073(String XCG01073) {
		_XCG01073 = XCG01073;
	}

	public String getXCG01074() {
		return _XCG01074;
	}

	public void setXCG01074(String XCG01074) {
		_XCG01074 = XCG01074;
	}

	public String getXCG01075() {
		return _XCG01075;
	}

	public void setXCG01075(String XCG01075) {
		_XCG01075 = XCG01075;
	}

	public String getXCG01076() {
		return _XCG01076;
	}

	public void setXCG01076(String XCG01076) {
		_XCG01076 = XCG01076;
	}

	public String getXCG01077() {
		return _XCG01077;
	}

	public void setXCG01077(String XCG01077) {
		_XCG01077 = XCG01077;
	}

	public String getXCG01078() {
		return _XCG01078;
	}

	public void setXCG01078(String XCG01078) {
		_XCG01078 = XCG01078;
	}

	public String getXCG01079() {
		return _XCG01079;
	}

	public void setXCG01079(String XCG01079) {
		_XCG01079 = XCG01079;
	}

	public String getXCG01080() {
		return _XCG01080;
	}

	public void setXCG01080(String XCG01080) {
		_XCG01080 = XCG01080;
	}

	public String getXCG01081() {
		return _XCG01081;
	}

	public void setXCG01081(String XCG01081) {
		_XCG01081 = XCG01081;
	}

	public String getXCG01082() {
		return _XCG01082;
	}

	public void setXCG01082(String XCG01082) {
		_XCG01082 = XCG01082;
	}

	public String getXCG01083() {
		return _XCG01083;
	}

	public void setXCG01083(String XCG01083) {
		_XCG01083 = XCG01083;
	}

	public String getXCG01084() {
		return _XCG01084;
	}

	public void setXCG01084(String XCG01084) {
		_XCG01084 = XCG01084;
	}

	public String getXCG01085() {
		return _XCG01085;
	}

	public void setXCG01085(String XCG01085) {
		_XCG01085 = XCG01085;
	}

	public String getXCG01086() {
		return _XCG01086;
	}

	public void setXCG01086(String XCG01086) {
		_XCG01086 = XCG01086;
	}

	public String getXCG01087() {
		return _XCG01087;
	}

	public void setXCG01087(String XCG01087) {
		_XCG01087 = XCG01087;
	}

	public String getXCG01088() {
		return _XCG01088;
	}

	public void setXCG01088(String XCG01088) {
		_XCG01088 = XCG01088;
	}

	public String getXCG01089() {
		return _XCG01089;
	}

	public void setXCG01089(String XCG01089) {
		_XCG01089 = XCG01089;
	}

	public String getXCG01090() {
		return _XCG01090;
	}

	public void setXCG01090(String XCG01090) {
		_XCG01090 = XCG01090;
	}

	public String getXCG01091() {
		return _XCG01091;
	}

	public void setXCG01091(String XCG01091) {
		_XCG01091 = XCG01091;
	}

	public String getXCG01092() {
		return _XCG01092;
	}

	public void setXCG01092(String XCG01092) {
		_XCG01092 = XCG01092;
	}

	public String getXCG01093() {
		return _XCG01093;
	}

	public void setXCG01093(String XCG01093) {
		_XCG01093 = XCG01093;
	}

	public String getXCG01094() {
		return _XCG01094;
	}

	public void setXCG01094(String XCG01094) {
		_XCG01094 = XCG01094;
	}

	public String getXCG01095() {
		return _XCG01095;
	}

	public void setXCG01095(String XCG01095) {
		_XCG01095 = XCG01095;
	}

	public String getXCG01096() {
		return _XCG01096;
	}

	public void setXCG01096(String XCG01096) {
		_XCG01096 = XCG01096;
	}

	public String getXCG01097() {
		return _XCG01097;
	}

	public void setXCG01097(String XCG01097) {
		_XCG01097 = XCG01097;
	}

	public String getXCG01098() {
		return _XCG01098;
	}

	public void setXCG01098(String XCG01098) {
		_XCG01098 = XCG01098;
	}

	public String getXCG01099() {
		return _XCG01099;
	}

	public void setXCG01099(String XCG01099) {
		_XCG01099 = XCG01099;
	}

	public String getXCG01100() {
		return _XCG01100;
	}

	public void setXCG01100(String XCG01100) {
		_XCG01100 = XCG01100;
	}

	public String getXCG01101() {
		return _XCG01101;
	}

	public void setXCG01101(String XCG01101) {
		_XCG01101 = XCG01101;
	}

	public String getXCG01102() {
		return _XCG01102;
	}

	public void setXCG01102(String XCG01102) {
		_XCG01102 = XCG01102;
	}

	public String getXCG01103() {
		return _XCG01103;
	}

	public void setXCG01103(String XCG01103) {
		_XCG01103 = XCG01103;
	}

	public String getXCG01104() {
		return _XCG01104;
	}

	public void setXCG01104(String XCG01104) {
		_XCG01104 = XCG01104;
	}

	public String getXCG01105() {
		return _XCG01105;
	}

	public void setXCG01105(String XCG01105) {
		_XCG01105 = XCG01105;
	}

	public String getXCG01106() {
		return _XCG01106;
	}

	public void setXCG01106(String XCG01106) {
		_XCG01106 = XCG01106;
	}

	public String getXCG01107() {
		return _XCG01107;
	}

	public void setXCG01107(String XCG01107) {
		_XCG01107 = XCG01107;
	}

	public String getXCG01108() {
		return _XCG01108;
	}

	public void setXCG01108(String XCG01108) {
		_XCG01108 = XCG01108;
	}

	public String getXCG01109() {
		return _XCG01109;
	}

	public void setXCG01109(String XCG01109) {
		_XCG01109 = XCG01109;
	}

	public String getXCG01110() {
		return _XCG01110;
	}

	public void setXCG01110(String XCG01110) {
		_XCG01110 = XCG01110;
	}

	public String getXCG01111() {
		return _XCG01111;
	}

	public void setXCG01111(String XCG01111) {
		_XCG01111 = XCG01111;
	}

	public String getXCG01112() {
		return _XCG01112;
	}

	public void setXCG01112(String XCG01112) {
		_XCG01112 = XCG01112;
	}

	public String getXCG01113() {
		return _XCG01113;
	}

	public void setXCG01113(String XCG01113) {
		_XCG01113 = XCG01113;
	}

	public String getXCG01114() {
		return _XCG01114;
	}

	public void setXCG01114(String XCG01114) {
		_XCG01114 = XCG01114;
	}

	public String getXCG01115() {
		return _XCG01115;
	}

	public void setXCG01115(String XCG01115) {
		_XCG01115 = XCG01115;
	}

	public String getXCG01116() {
		return _XCG01116;
	}

	public void setXCG01116(String XCG01116) {
		_XCG01116 = XCG01116;
	}

	public String getXCG01117() {
		return _XCG01117;
	}

	public void setXCG01117(String XCG01117) {
		_XCG01117 = XCG01117;
	}

	public String getXCG01118() {
		return _XCG01118;
	}

	public void setXCG01118(String XCG01118) {
		_XCG01118 = XCG01118;
	}

	public String getXCG01119() {
		return _XCG01119;
	}

	public void setXCG01119(String XCG01119) {
		_XCG01119 = XCG01119;
	}

	public String getXCG01120() {
		return _XCG01120;
	}

	public void setXCG01120(String XCG01120) {
		_XCG01120 = XCG01120;
	}

	public String getXCG01121() {
		return _XCG01121;
	}

	public void setXCG01121(String XCG01121) {
		_XCG01121 = XCG01121;
	}

	public String getXCG01122() {
		return _XCG01122;
	}

	public void setXCG01122(String XCG01122) {
		_XCG01122 = XCG01122;
	}

	public String getXCG01123() {
		return _XCG01123;
	}

	public void setXCG01123(String XCG01123) {
		_XCG01123 = XCG01123;
	}

	public String getXCG01124() {
		return _XCG01124;
	}

	public void setXCG01124(String XCG01124) {
		_XCG01124 = XCG01124;
	}

	public String getXCG01125() {
		return _XCG01125;
	}

	public void setXCG01125(String XCG01125) {
		_XCG01125 = XCG01125;
	}

	public String getXCG01126() {
		return _XCG01126;
	}

	public void setXCG01126(String XCG01126) {
		_XCG01126 = XCG01126;
	}

	public String getXCG01127() {
		return _XCG01127;
	}

	public void setXCG01127(String XCG01127) {
		_XCG01127 = XCG01127;
	}

	public String getXCG01128() {
		return _XCG01128;
	}

	public void setXCG01128(String XCG01128) {
		_XCG01128 = XCG01128;
	}

	public String getXCG01129() {
		return _XCG01129;
	}

	public void setXCG01129(String XCG01129) {
		_XCG01129 = XCG01129;
	}

	public String getXCG01130() {
		return _XCG01130;
	}

	public void setXCG01130(String XCG01130) {
		_XCG01130 = XCG01130;
	}

	public String getXCG01131() {
		return _XCG01131;
	}

	public void setXCG01131(String XCG01131) {
		_XCG01131 = XCG01131;
	}

	public String getXCG01132() {
		return _XCG01132;
	}

	public void setXCG01132(String XCG01132) {
		_XCG01132 = XCG01132;
	}

	public String getXCG01133() {
		return _XCG01133;
	}

	public void setXCG01133(String XCG01133) {
		_XCG01133 = XCG01133;
	}

	public String getXCG01134() {
		return _XCG01134;
	}

	public void setXCG01134(String XCG01134) {
		_XCG01134 = XCG01134;
	}

	public String getXCG01135() {
		return _XCG01135;
	}

	public void setXCG01135(String XCG01135) {
		_XCG01135 = XCG01135;
	}

	public String getXCG01136() {
		return _XCG01136;
	}

	public void setXCG01136(String XCG01136) {
		_XCG01136 = XCG01136;
	}

	public String getXCG01137() {
		return _XCG01137;
	}

	public void setXCG01137(String XCG01137) {
		_XCG01137 = XCG01137;
	}

	public String getXCG01138() {
		return _XCG01138;
	}

	public void setXCG01138(String XCG01138) {
		_XCG01138 = XCG01138;
	}

	public String getXCG01139() {
		return _XCG01139;
	}

	public void setXCG01139(String XCG01139) {
		_XCG01139 = XCG01139;
	}

	public String getXCG01140() {
		return _XCG01140;
	}

	public void setXCG01140(String XCG01140) {
		_XCG01140 = XCG01140;
	}

	public String getXCG01141() {
		return _XCG01141;
	}

	public void setXCG01141(String XCG01141) {
		_XCG01141 = XCG01141;
	}

	public String getXCG01142() {
		return _XCG01142;
	}

	public void setXCG01142(String XCG01142) {
		_XCG01142 = XCG01142;
	}

	public String getXCG01143() {
		return _XCG01143;
	}

	public void setXCG01143(String XCG01143) {
		_XCG01143 = XCG01143;
	}

	public String getXCG01144() {
		return _XCG01144;
	}

	public void setXCG01144(String XCG01144) {
		_XCG01144 = XCG01144;
	}

	public String getXCG01145() {
		return _XCG01145;
	}

	public void setXCG01145(String XCG01145) {
		_XCG01145 = XCG01145;
	}

	public String getXCG01146() {
		return _XCG01146;
	}

	public void setXCG01146(String XCG01146) {
		_XCG01146 = XCG01146;
	}

	public String getXCG01147() {
		return _XCG01147;
	}

	public void setXCG01147(String XCG01147) {
		_XCG01147 = XCG01147;
	}

	public String getXCG01148() {
		return _XCG01148;
	}

	public void setXCG01148(String XCG01148) {
		_XCG01148 = XCG01148;
	}

	public String getXCG01149() {
		return _XCG01149;
	}

	public void setXCG01149(String XCG01149) {
		_XCG01149 = XCG01149;
	}

	public String getXCG01150() {
		return _XCG01150;
	}

	public void setXCG01150(String XCG01150) {
		_XCG01150 = XCG01150;
	}

	public String getXCG01151() {
		return _XCG01151;
	}

	public void setXCG01151(String XCG01151) {
		_XCG01151 = XCG01151;
	}

	public String getXCG01152() {
		return _XCG01152;
	}

	public void setXCG01152(String XCG01152) {
		_XCG01152 = XCG01152;
	}

	public String getXCG01153() {
		return _XCG01153;
	}

	public void setXCG01153(String XCG01153) {
		_XCG01153 = XCG01153;
	}

	public String getXCG01154() {
		return _XCG01154;
	}

	public void setXCG01154(String XCG01154) {
		_XCG01154 = XCG01154;
	}

	public String getXCG01155() {
		return _XCG01155;
	}

	public void setXCG01155(String XCG01155) {
		_XCG01155 = XCG01155;
	}

	public String getXCG01156() {
		return _XCG01156;
	}

	public void setXCG01156(String XCG01156) {
		_XCG01156 = XCG01156;
	}

	public String getXCG01157() {
		return _XCG01157;
	}

	public void setXCG01157(String XCG01157) {
		_XCG01157 = XCG01157;
	}

	public String getXCG01158() {
		return _XCG01158;
	}

	public void setXCG01158(String XCG01158) {
		_XCG01158 = XCG01158;
	}

	public String getXCG01159() {
		return _XCG01159;
	}

	public void setXCG01159(String XCG01159) {
		_XCG01159 = XCG01159;
	}

	public String getXCG01160() {
		return _XCG01160;
	}

	public void setXCG01160(String XCG01160) {
		_XCG01160 = XCG01160;
	}

	public String getXCG01161() {
		return _XCG01161;
	}

	public void setXCG01161(String XCG01161) {
		_XCG01161 = XCG01161;
	}

	public String getXCG01162() {
		return _XCG01162;
	}

	public void setXCG01162(String XCG01162) {
		_XCG01162 = XCG01162;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private long _mtCore;
	private long _convertAssembleId;
	private long _dossierId;
	private String _dossierNo;
	private String _referenceUid;
	private String _dossierIdCTN;
	private String _deliverableCode;
	private long _vehicleTypeCertificateId;
	private String _loai_dong_co;
	private String _XCG01001;
	private String _XCG01002;
	private String _XCG01003;
	private String _XCG01004;
	private String _XCG01005;
	private String _XCG01006;
	private String _XCG01007;
	private String _XCG01008;
	private String _XCG01009;
	private String _XCG01010;
	private String _XCG01011;
	private String _XCG01012;
	private String _XCG01013;
	private String _XCG01014;
	private String _XCG01016;
	private String _XCG01017;
	private String _XCG01019;
	private String _XCG01020;
	private String _XCG01021;
	private String _XCG01022;
	private String _XCG01024;
	private String _XCG01025;
	private String _XCG01026;
	private String _XCG01027;
	private String _XCG01028;
	private String _XCG01030;
	private String _XCG01031;
	private String _XCG01032;
	private String _XCG01033;
	private String _XCG01034;
	private String _XCG01035;
	private String _XCG01036;
	private String _XCG01037;
	private String _XCG01038;
	private String _XCG01039;
	private String _XCG01040;
	private String _XCG01041;
	private String _XCG01042;
	private String _XCG01043;
	private String _XCG01044;
	private String _XCG01045;
	private String _XCG01046;
	private String _XCG01047;
	private String _XCG01049;
	private String _XCG01050;
	private String _XCG01051;
	private String _XCG01052;
	private String _XCG01053;
	private String _XCG01054;
	private String _XCG01055;
	private String _XCG01056;
	private String _XCG01057;
	private String _XCG01058;
	private String _XCG01059;
	private String _XCG01060;
	private String _XCG01062;
	private String _XCG01063;
	private String _XCG01064;
	private String _XCG01065;
	private String _XCG01066;
	private String _XCG01067;
	private String _XCG01068;
	private String _XCG01069;
	private String _XCG01070;
	private String _XCG01072;
	private String _XCG01073;
	private String _XCG01074;
	private String _XCG01075;
	private String _XCG01076;
	private String _XCG01077;
	private String _XCG01078;
	private String _XCG01079;
	private String _XCG01080;
	private String _XCG01081;
	private String _XCG01082;
	private String _XCG01083;
	private String _XCG01084;
	private String _XCG01085;
	private String _XCG01086;
	private String _XCG01087;
	private String _XCG01088;
	private String _XCG01089;
	private String _XCG01090;
	private String _XCG01091;
	private String _XCG01092;
	private String _XCG01093;
	private String _XCG01094;
	private String _XCG01095;
	private String _XCG01096;
	private String _XCG01097;
	private String _XCG01098;
	private String _XCG01099;
	private String _XCG01100;
	private String _XCG01101;
	private String _XCG01102;
	private String _XCG01103;
	private String _XCG01104;
	private String _XCG01105;
	private String _XCG01106;
	private String _XCG01107;
	private String _XCG01108;
	private String _XCG01109;
	private String _XCG01110;
	private String _XCG01111;
	private String _XCG01112;
	private String _XCG01113;
	private String _XCG01114;
	private String _XCG01115;
	private String _XCG01116;
	private String _XCG01117;
	private String _XCG01118;
	private String _XCG01119;
	private String _XCG01120;
	private String _XCG01121;
	private String _XCG01122;
	private String _XCG01123;
	private String _XCG01124;
	private String _XCG01125;
	private String _XCG01126;
	private String _XCG01127;
	private String _XCG01128;
	private String _XCG01129;
	private String _XCG01130;
	private String _XCG01131;
	private String _XCG01132;
	private String _XCG01133;
	private String _XCG01134;
	private String _XCG01135;
	private String _XCG01136;
	private String _XCG01137;
	private String _XCG01138;
	private String _XCG01139;
	private String _XCG01140;
	private String _XCG01141;
	private String _XCG01142;
	private String _XCG01143;
	private String _XCG01144;
	private String _XCG01145;
	private String _XCG01146;
	private String _XCG01147;
	private String _XCG01148;
	private String _XCG01149;
	private String _XCG01150;
	private String _XCG01151;
	private String _XCG01152;
	private String _XCG01153;
	private String _XCG01154;
	private String _XCG01155;
	private String _XCG01156;
	private String _XCG01157;
	private String _XCG01158;
	private String _XCG01159;
	private String _XCG01160;
	private String _XCG01161;
	private String _XCG01162;
	private Date _modifyDate;
	private Date _syncDate;
}