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
public class VRTechnicalSpec_XCNSoap implements Serializable {
	public static VRTechnicalSpec_XCNSoap toSoapModel(VRTechnicalSpec_XCN model) {
		VRTechnicalSpec_XCNSoap soapModel = new VRTechnicalSpec_XCNSoap();

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
		soapModel.setXCN01001(model.getXCN01001());
		soapModel.setXCN01002(model.getXCN01002());
		soapModel.setXCN01003(model.getXCN01003());
		soapModel.setXCN01004(model.getXCN01004());
		soapModel.setXCN01005(model.getXCN01005());
		soapModel.setXCN01006(model.getXCN01006());
		soapModel.setXCN01007(model.getXCN01007());
		soapModel.setXCN01008(model.getXCN01008());
		soapModel.setXCN01009(model.getXCN01009());
		soapModel.setXCN01010(model.getXCN01010());
		soapModel.setXCN01011(model.getXCN01011());
		soapModel.setXCN01012(model.getXCN01012());
		soapModel.setXCN01013(model.getXCN01013());
		soapModel.setXCN01014(model.getXCN01014());
		soapModel.setXCN01016(model.getXCN01016());
		soapModel.setXCN01017(model.getXCN01017());
		soapModel.setXCN01019(model.getXCN01019());
		soapModel.setXCN01020(model.getXCN01020());
		soapModel.setXCN01021(model.getXCN01021());
		soapModel.setXCN01022(model.getXCN01022());
		soapModel.setXCN01024(model.getXCN01024());
		soapModel.setXCN01025(model.getXCN01025());
		soapModel.setXCN01026(model.getXCN01026());
		soapModel.setXCN01027(model.getXCN01027());
		soapModel.setXCN01028(model.getXCN01028());
		soapModel.setXCN01030(model.getXCN01030());
		soapModel.setXCN01031(model.getXCN01031());
		soapModel.setXCN01032(model.getXCN01032());
		soapModel.setXCN01033(model.getXCN01033());
		soapModel.setXCN01034(model.getXCN01034());
		soapModel.setXCN01035(model.getXCN01035());
		soapModel.setXCN01036(model.getXCN01036());
		soapModel.setXCN01037(model.getXCN01037());
		soapModel.setXCN01038(model.getXCN01038());
		soapModel.setXCN01039(model.getXCN01039());
		soapModel.setXCN01040(model.getXCN01040());
		soapModel.setXCN01041(model.getXCN01041());
		soapModel.setXCN01042(model.getXCN01042());
		soapModel.setXCN01043(model.getXCN01043());
		soapModel.setXCN01044(model.getXCN01044());
		soapModel.setXCN01045(model.getXCN01045());
		soapModel.setXCN01046(model.getXCN01046());
		soapModel.setXCN01047(model.getXCN01047());
		soapModel.setXCN01049(model.getXCN01049());
		soapModel.setXCN01050(model.getXCN01050());
		soapModel.setXCN01051(model.getXCN01051());
		soapModel.setXCN01052(model.getXCN01052());
		soapModel.setXCN01053(model.getXCN01053());
		soapModel.setXCN01054(model.getXCN01054());
		soapModel.setXCN01055(model.getXCN01055());
		soapModel.setXCN01056(model.getXCN01056());
		soapModel.setXCN01057(model.getXCN01057());
		soapModel.setXCN01058(model.getXCN01058());
		soapModel.setXCN01059(model.getXCN01059());
		soapModel.setXCN01060(model.getXCN01060());
		soapModel.setXCN01062(model.getXCN01062());
		soapModel.setXCN01063(model.getXCN01063());
		soapModel.setXCN01064(model.getXCN01064());
		soapModel.setXCN01065(model.getXCN01065());
		soapModel.setXCN01066(model.getXCN01066());
		soapModel.setXCN01067(model.getXCN01067());
		soapModel.setXCN01068(model.getXCN01068());
		soapModel.setXCN01069(model.getXCN01069());
		soapModel.setXCN01100(model.getXCN01100());
		soapModel.setXCN01101(model.getXCN01101());
		soapModel.setXCN01102(model.getXCN01102());
		soapModel.setXCN01103(model.getXCN01103());
		soapModel.setXCN01104(model.getXCN01104());
		soapModel.setXCN01105(model.getXCN01105());
		soapModel.setXCN01106(model.getXCN01106());
		soapModel.setXCN01107(model.getXCN01107());
		soapModel.setXCN01108(model.getXCN01108());
		soapModel.setXCN01109(model.getXCN01109());
		soapModel.setXCN01110(model.getXCN01110());
		soapModel.setXCN01111(model.getXCN01111());
		soapModel.setXCN01112(model.getXCN01112());
		soapModel.setXCN01113(model.getXCN01113());
		soapModel.setXCN01114(model.getXCN01114());
		soapModel.setXCN01115(model.getXCN01115());
		soapModel.setXCN01116(model.getXCN01116());
		soapModel.setXCN01117(model.getXCN01117());
		soapModel.setXCN01118(model.getXCN01118());
		soapModel.setXCN01119(model.getXCN01119());
		soapModel.setXCN01120(model.getXCN01120());
		soapModel.setXCN01121(model.getXCN01121());
		soapModel.setXCN01122(model.getXCN01122());
		soapModel.setXCN01123(model.getXCN01123());
		soapModel.setXCN01124(model.getXCN01124());
		soapModel.setXCN01125(model.getXCN01125());
		soapModel.setXCN01126(model.getXCN01126());
		soapModel.setXCN01127(model.getXCN01127());
		soapModel.setXCN01128(model.getXCN01128());
		soapModel.setXCN01129(model.getXCN01129());
		soapModel.setXCN01130(model.getXCN01130());
		soapModel.setXCN01131(model.getXCN01131());
		soapModel.setXCN01132(model.getXCN01132());
		soapModel.setXCN01133(model.getXCN01133());
		soapModel.setXCN01134(model.getXCN01134());
		soapModel.setXCN01135(model.getXCN01135());
		soapModel.setXCN01136(model.getXCN01136());
		soapModel.setXCN01137(model.getXCN01137());
		soapModel.setXCN01138(model.getXCN01138());
		soapModel.setXCN01139(model.getXCN01139());
		soapModel.setXCN01140(model.getXCN01140());
		soapModel.setXCN01141(model.getXCN01141());
		soapModel.setXCN01142(model.getXCN01142());
		soapModel.setXCN01143(model.getXCN01143());
		soapModel.setXCN01144(model.getXCN01144());
		soapModel.setXCN01145(model.getXCN01145());
		soapModel.setXCN01146(model.getXCN01146());
		soapModel.setXCN01147(model.getXCN01147());
		soapModel.setXCN01148(model.getXCN01148());
		soapModel.setXCN01149(model.getXCN01149());
		soapModel.setXCN01150(model.getXCN01150());
		soapModel.setXCN01151(model.getXCN01151());
		soapModel.setXCN01152(model.getXCN01152());
		soapModel.setXCN01153(model.getXCN01153());
		soapModel.setXCN01154(model.getXCN01154());
		soapModel.setXCN01155(model.getXCN01155());
		soapModel.setXCN01156(model.getXCN01156());
		soapModel.setXCN01157(model.getXCN01157());
		soapModel.setXCN01158(model.getXCN01158());
		soapModel.setXCN01159(model.getXCN01159());
		soapModel.setXCN01160(model.getXCN01160());
		soapModel.setXCN01161(model.getXCN01161());
		soapModel.setXCN01162(model.getXCN01162());
		soapModel.setXCN01163(model.getXCN01163());
		soapModel.setXCN01164(model.getXCN01164());
		soapModel.setXCN01165(model.getXCN01165());
		soapModel.setXCN01166(model.getXCN01166());
		soapModel.setXCN01167(model.getXCN01167());
		soapModel.setXCN01168(model.getXCN01168());
		soapModel.setXCN01169(model.getXCN01169());
		soapModel.setXCN01170(model.getXCN01170());
		soapModel.setXCN01171(model.getXCN01171());
		soapModel.setXCN01172(model.getXCN01172());
		soapModel.setXCN01173(model.getXCN01173());
		soapModel.setXCN01174(model.getXCN01174());
		soapModel.setXCN01175(model.getXCN01175());
		soapModel.setXCN01176(model.getXCN01176());
		soapModel.setXCN01177(model.getXCN01177());
		soapModel.setXCN01178(model.getXCN01178());
		soapModel.setXCN01179(model.getXCN01179());
		soapModel.setXCN01180(model.getXCN01180());
		soapModel.setXCN01181(model.getXCN01181());
		soapModel.setXCN01182(model.getXCN01182());
		soapModel.setXCN01183(model.getXCN01183());
		soapModel.setXCN01184(model.getXCN01184());
		soapModel.setXCN01185(model.getXCN01185());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRTechnicalSpec_XCNSoap[] toSoapModels(
		VRTechnicalSpec_XCN[] models) {
		VRTechnicalSpec_XCNSoap[] soapModels = new VRTechnicalSpec_XCNSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCNSoap[][] toSoapModels(
		VRTechnicalSpec_XCN[][] models) {
		VRTechnicalSpec_XCNSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRTechnicalSpec_XCNSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRTechnicalSpec_XCNSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCNSoap[] toSoapModels(
		List<VRTechnicalSpec_XCN> models) {
		List<VRTechnicalSpec_XCNSoap> soapModels = new ArrayList<VRTechnicalSpec_XCNSoap>(models.size());

		for (VRTechnicalSpec_XCN model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRTechnicalSpec_XCNSoap[soapModels.size()]);
	}

	public VRTechnicalSpec_XCNSoap() {
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

	public String getXCN01001() {
		return _XCN01001;
	}

	public void setXCN01001(String XCN01001) {
		_XCN01001 = XCN01001;
	}

	public String getXCN01002() {
		return _XCN01002;
	}

	public void setXCN01002(String XCN01002) {
		_XCN01002 = XCN01002;
	}

	public String getXCN01003() {
		return _XCN01003;
	}

	public void setXCN01003(String XCN01003) {
		_XCN01003 = XCN01003;
	}

	public String getXCN01004() {
		return _XCN01004;
	}

	public void setXCN01004(String XCN01004) {
		_XCN01004 = XCN01004;
	}

	public String getXCN01005() {
		return _XCN01005;
	}

	public void setXCN01005(String XCN01005) {
		_XCN01005 = XCN01005;
	}

	public String getXCN01006() {
		return _XCN01006;
	}

	public void setXCN01006(String XCN01006) {
		_XCN01006 = XCN01006;
	}

	public String getXCN01007() {
		return _XCN01007;
	}

	public void setXCN01007(String XCN01007) {
		_XCN01007 = XCN01007;
	}

	public String getXCN01008() {
		return _XCN01008;
	}

	public void setXCN01008(String XCN01008) {
		_XCN01008 = XCN01008;
	}

	public String getXCN01009() {
		return _XCN01009;
	}

	public void setXCN01009(String XCN01009) {
		_XCN01009 = XCN01009;
	}

	public String getXCN01010() {
		return _XCN01010;
	}

	public void setXCN01010(String XCN01010) {
		_XCN01010 = XCN01010;
	}

	public String getXCN01011() {
		return _XCN01011;
	}

	public void setXCN01011(String XCN01011) {
		_XCN01011 = XCN01011;
	}

	public String getXCN01012() {
		return _XCN01012;
	}

	public void setXCN01012(String XCN01012) {
		_XCN01012 = XCN01012;
	}

	public String getXCN01013() {
		return _XCN01013;
	}

	public void setXCN01013(String XCN01013) {
		_XCN01013 = XCN01013;
	}

	public String getXCN01014() {
		return _XCN01014;
	}

	public void setXCN01014(String XCN01014) {
		_XCN01014 = XCN01014;
	}

	public String getXCN01016() {
		return _XCN01016;
	}

	public void setXCN01016(String XCN01016) {
		_XCN01016 = XCN01016;
	}

	public String getXCN01017() {
		return _XCN01017;
	}

	public void setXCN01017(String XCN01017) {
		_XCN01017 = XCN01017;
	}

	public String getXCN01019() {
		return _XCN01019;
	}

	public void setXCN01019(String XCN01019) {
		_XCN01019 = XCN01019;
	}

	public String getXCN01020() {
		return _XCN01020;
	}

	public void setXCN01020(String XCN01020) {
		_XCN01020 = XCN01020;
	}

	public String getXCN01021() {
		return _XCN01021;
	}

	public void setXCN01021(String XCN01021) {
		_XCN01021 = XCN01021;
	}

	public String getXCN01022() {
		return _XCN01022;
	}

	public void setXCN01022(String XCN01022) {
		_XCN01022 = XCN01022;
	}

	public String getXCN01024() {
		return _XCN01024;
	}

	public void setXCN01024(String XCN01024) {
		_XCN01024 = XCN01024;
	}

	public String getXCN01025() {
		return _XCN01025;
	}

	public void setXCN01025(String XCN01025) {
		_XCN01025 = XCN01025;
	}

	public String getXCN01026() {
		return _XCN01026;
	}

	public void setXCN01026(String XCN01026) {
		_XCN01026 = XCN01026;
	}

	public String getXCN01027() {
		return _XCN01027;
	}

	public void setXCN01027(String XCN01027) {
		_XCN01027 = XCN01027;
	}

	public String getXCN01028() {
		return _XCN01028;
	}

	public void setXCN01028(String XCN01028) {
		_XCN01028 = XCN01028;
	}

	public String getXCN01030() {
		return _XCN01030;
	}

	public void setXCN01030(String XCN01030) {
		_XCN01030 = XCN01030;
	}

	public String getXCN01031() {
		return _XCN01031;
	}

	public void setXCN01031(String XCN01031) {
		_XCN01031 = XCN01031;
	}

	public String getXCN01032() {
		return _XCN01032;
	}

	public void setXCN01032(String XCN01032) {
		_XCN01032 = XCN01032;
	}

	public String getXCN01033() {
		return _XCN01033;
	}

	public void setXCN01033(String XCN01033) {
		_XCN01033 = XCN01033;
	}

	public String getXCN01034() {
		return _XCN01034;
	}

	public void setXCN01034(String XCN01034) {
		_XCN01034 = XCN01034;
	}

	public String getXCN01035() {
		return _XCN01035;
	}

	public void setXCN01035(String XCN01035) {
		_XCN01035 = XCN01035;
	}

	public String getXCN01036() {
		return _XCN01036;
	}

	public void setXCN01036(String XCN01036) {
		_XCN01036 = XCN01036;
	}

	public String getXCN01037() {
		return _XCN01037;
	}

	public void setXCN01037(String XCN01037) {
		_XCN01037 = XCN01037;
	}

	public String getXCN01038() {
		return _XCN01038;
	}

	public void setXCN01038(String XCN01038) {
		_XCN01038 = XCN01038;
	}

	public String getXCN01039() {
		return _XCN01039;
	}

	public void setXCN01039(String XCN01039) {
		_XCN01039 = XCN01039;
	}

	public String getXCN01040() {
		return _XCN01040;
	}

	public void setXCN01040(String XCN01040) {
		_XCN01040 = XCN01040;
	}

	public String getXCN01041() {
		return _XCN01041;
	}

	public void setXCN01041(String XCN01041) {
		_XCN01041 = XCN01041;
	}

	public String getXCN01042() {
		return _XCN01042;
	}

	public void setXCN01042(String XCN01042) {
		_XCN01042 = XCN01042;
	}

	public String getXCN01043() {
		return _XCN01043;
	}

	public void setXCN01043(String XCN01043) {
		_XCN01043 = XCN01043;
	}

	public String getXCN01044() {
		return _XCN01044;
	}

	public void setXCN01044(String XCN01044) {
		_XCN01044 = XCN01044;
	}

	public String getXCN01045() {
		return _XCN01045;
	}

	public void setXCN01045(String XCN01045) {
		_XCN01045 = XCN01045;
	}

	public String getXCN01046() {
		return _XCN01046;
	}

	public void setXCN01046(String XCN01046) {
		_XCN01046 = XCN01046;
	}

	public String getXCN01047() {
		return _XCN01047;
	}

	public void setXCN01047(String XCN01047) {
		_XCN01047 = XCN01047;
	}

	public String getXCN01049() {
		return _XCN01049;
	}

	public void setXCN01049(String XCN01049) {
		_XCN01049 = XCN01049;
	}

	public String getXCN01050() {
		return _XCN01050;
	}

	public void setXCN01050(String XCN01050) {
		_XCN01050 = XCN01050;
	}

	public String getXCN01051() {
		return _XCN01051;
	}

	public void setXCN01051(String XCN01051) {
		_XCN01051 = XCN01051;
	}

	public String getXCN01052() {
		return _XCN01052;
	}

	public void setXCN01052(String XCN01052) {
		_XCN01052 = XCN01052;
	}

	public String getXCN01053() {
		return _XCN01053;
	}

	public void setXCN01053(String XCN01053) {
		_XCN01053 = XCN01053;
	}

	public String getXCN01054() {
		return _XCN01054;
	}

	public void setXCN01054(String XCN01054) {
		_XCN01054 = XCN01054;
	}

	public String getXCN01055() {
		return _XCN01055;
	}

	public void setXCN01055(String XCN01055) {
		_XCN01055 = XCN01055;
	}

	public String getXCN01056() {
		return _XCN01056;
	}

	public void setXCN01056(String XCN01056) {
		_XCN01056 = XCN01056;
	}

	public String getXCN01057() {
		return _XCN01057;
	}

	public void setXCN01057(String XCN01057) {
		_XCN01057 = XCN01057;
	}

	public String getXCN01058() {
		return _XCN01058;
	}

	public void setXCN01058(String XCN01058) {
		_XCN01058 = XCN01058;
	}

	public String getXCN01059() {
		return _XCN01059;
	}

	public void setXCN01059(String XCN01059) {
		_XCN01059 = XCN01059;
	}

	public String getXCN01060() {
		return _XCN01060;
	}

	public void setXCN01060(String XCN01060) {
		_XCN01060 = XCN01060;
	}

	public String getXCN01062() {
		return _XCN01062;
	}

	public void setXCN01062(String XCN01062) {
		_XCN01062 = XCN01062;
	}

	public String getXCN01063() {
		return _XCN01063;
	}

	public void setXCN01063(String XCN01063) {
		_XCN01063 = XCN01063;
	}

	public String getXCN01064() {
		return _XCN01064;
	}

	public void setXCN01064(String XCN01064) {
		_XCN01064 = XCN01064;
	}

	public String getXCN01065() {
		return _XCN01065;
	}

	public void setXCN01065(String XCN01065) {
		_XCN01065 = XCN01065;
	}

	public String getXCN01066() {
		return _XCN01066;
	}

	public void setXCN01066(String XCN01066) {
		_XCN01066 = XCN01066;
	}

	public String getXCN01067() {
		return _XCN01067;
	}

	public void setXCN01067(String XCN01067) {
		_XCN01067 = XCN01067;
	}

	public String getXCN01068() {
		return _XCN01068;
	}

	public void setXCN01068(String XCN01068) {
		_XCN01068 = XCN01068;
	}

	public String getXCN01069() {
		return _XCN01069;
	}

	public void setXCN01069(String XCN01069) {
		_XCN01069 = XCN01069;
	}

	public String getXCN01100() {
		return _XCN01100;
	}

	public void setXCN01100(String XCN01100) {
		_XCN01100 = XCN01100;
	}

	public String getXCN01101() {
		return _XCN01101;
	}

	public void setXCN01101(String XCN01101) {
		_XCN01101 = XCN01101;
	}

	public String getXCN01102() {
		return _XCN01102;
	}

	public void setXCN01102(String XCN01102) {
		_XCN01102 = XCN01102;
	}

	public String getXCN01103() {
		return _XCN01103;
	}

	public void setXCN01103(String XCN01103) {
		_XCN01103 = XCN01103;
	}

	public String getXCN01104() {
		return _XCN01104;
	}

	public void setXCN01104(String XCN01104) {
		_XCN01104 = XCN01104;
	}

	public String getXCN01105() {
		return _XCN01105;
	}

	public void setXCN01105(String XCN01105) {
		_XCN01105 = XCN01105;
	}

	public String getXCN01106() {
		return _XCN01106;
	}

	public void setXCN01106(String XCN01106) {
		_XCN01106 = XCN01106;
	}

	public String getXCN01107() {
		return _XCN01107;
	}

	public void setXCN01107(String XCN01107) {
		_XCN01107 = XCN01107;
	}

	public String getXCN01108() {
		return _XCN01108;
	}

	public void setXCN01108(String XCN01108) {
		_XCN01108 = XCN01108;
	}

	public String getXCN01109() {
		return _XCN01109;
	}

	public void setXCN01109(String XCN01109) {
		_XCN01109 = XCN01109;
	}

	public String getXCN01110() {
		return _XCN01110;
	}

	public void setXCN01110(String XCN01110) {
		_XCN01110 = XCN01110;
	}

	public String getXCN01111() {
		return _XCN01111;
	}

	public void setXCN01111(String XCN01111) {
		_XCN01111 = XCN01111;
	}

	public String getXCN01112() {
		return _XCN01112;
	}

	public void setXCN01112(String XCN01112) {
		_XCN01112 = XCN01112;
	}

	public String getXCN01113() {
		return _XCN01113;
	}

	public void setXCN01113(String XCN01113) {
		_XCN01113 = XCN01113;
	}

	public String getXCN01114() {
		return _XCN01114;
	}

	public void setXCN01114(String XCN01114) {
		_XCN01114 = XCN01114;
	}

	public String getXCN01115() {
		return _XCN01115;
	}

	public void setXCN01115(String XCN01115) {
		_XCN01115 = XCN01115;
	}

	public String getXCN01116() {
		return _XCN01116;
	}

	public void setXCN01116(String XCN01116) {
		_XCN01116 = XCN01116;
	}

	public String getXCN01117() {
		return _XCN01117;
	}

	public void setXCN01117(String XCN01117) {
		_XCN01117 = XCN01117;
	}

	public String getXCN01118() {
		return _XCN01118;
	}

	public void setXCN01118(String XCN01118) {
		_XCN01118 = XCN01118;
	}

	public String getXCN01119() {
		return _XCN01119;
	}

	public void setXCN01119(String XCN01119) {
		_XCN01119 = XCN01119;
	}

	public String getXCN01120() {
		return _XCN01120;
	}

	public void setXCN01120(String XCN01120) {
		_XCN01120 = XCN01120;
	}

	public String getXCN01121() {
		return _XCN01121;
	}

	public void setXCN01121(String XCN01121) {
		_XCN01121 = XCN01121;
	}

	public String getXCN01122() {
		return _XCN01122;
	}

	public void setXCN01122(String XCN01122) {
		_XCN01122 = XCN01122;
	}

	public String getXCN01123() {
		return _XCN01123;
	}

	public void setXCN01123(String XCN01123) {
		_XCN01123 = XCN01123;
	}

	public String getXCN01124() {
		return _XCN01124;
	}

	public void setXCN01124(String XCN01124) {
		_XCN01124 = XCN01124;
	}

	public String getXCN01125() {
		return _XCN01125;
	}

	public void setXCN01125(String XCN01125) {
		_XCN01125 = XCN01125;
	}

	public String getXCN01126() {
		return _XCN01126;
	}

	public void setXCN01126(String XCN01126) {
		_XCN01126 = XCN01126;
	}

	public String getXCN01127() {
		return _XCN01127;
	}

	public void setXCN01127(String XCN01127) {
		_XCN01127 = XCN01127;
	}

	public String getXCN01128() {
		return _XCN01128;
	}

	public void setXCN01128(String XCN01128) {
		_XCN01128 = XCN01128;
	}

	public String getXCN01129() {
		return _XCN01129;
	}

	public void setXCN01129(String XCN01129) {
		_XCN01129 = XCN01129;
	}

	public String getXCN01130() {
		return _XCN01130;
	}

	public void setXCN01130(String XCN01130) {
		_XCN01130 = XCN01130;
	}

	public String getXCN01131() {
		return _XCN01131;
	}

	public void setXCN01131(String XCN01131) {
		_XCN01131 = XCN01131;
	}

	public String getXCN01132() {
		return _XCN01132;
	}

	public void setXCN01132(String XCN01132) {
		_XCN01132 = XCN01132;
	}

	public String getXCN01133() {
		return _XCN01133;
	}

	public void setXCN01133(String XCN01133) {
		_XCN01133 = XCN01133;
	}

	public String getXCN01134() {
		return _XCN01134;
	}

	public void setXCN01134(String XCN01134) {
		_XCN01134 = XCN01134;
	}

	public String getXCN01135() {
		return _XCN01135;
	}

	public void setXCN01135(String XCN01135) {
		_XCN01135 = XCN01135;
	}

	public String getXCN01136() {
		return _XCN01136;
	}

	public void setXCN01136(String XCN01136) {
		_XCN01136 = XCN01136;
	}

	public String getXCN01137() {
		return _XCN01137;
	}

	public void setXCN01137(String XCN01137) {
		_XCN01137 = XCN01137;
	}

	public String getXCN01138() {
		return _XCN01138;
	}

	public void setXCN01138(String XCN01138) {
		_XCN01138 = XCN01138;
	}

	public String getXCN01139() {
		return _XCN01139;
	}

	public void setXCN01139(String XCN01139) {
		_XCN01139 = XCN01139;
	}

	public String getXCN01140() {
		return _XCN01140;
	}

	public void setXCN01140(String XCN01140) {
		_XCN01140 = XCN01140;
	}

	public String getXCN01141() {
		return _XCN01141;
	}

	public void setXCN01141(String XCN01141) {
		_XCN01141 = XCN01141;
	}

	public String getXCN01142() {
		return _XCN01142;
	}

	public void setXCN01142(String XCN01142) {
		_XCN01142 = XCN01142;
	}

	public String getXCN01143() {
		return _XCN01143;
	}

	public void setXCN01143(String XCN01143) {
		_XCN01143 = XCN01143;
	}

	public String getXCN01144() {
		return _XCN01144;
	}

	public void setXCN01144(String XCN01144) {
		_XCN01144 = XCN01144;
	}

	public String getXCN01145() {
		return _XCN01145;
	}

	public void setXCN01145(String XCN01145) {
		_XCN01145 = XCN01145;
	}

	public String getXCN01146() {
		return _XCN01146;
	}

	public void setXCN01146(String XCN01146) {
		_XCN01146 = XCN01146;
	}

	public String getXCN01147() {
		return _XCN01147;
	}

	public void setXCN01147(String XCN01147) {
		_XCN01147 = XCN01147;
	}

	public String getXCN01148() {
		return _XCN01148;
	}

	public void setXCN01148(String XCN01148) {
		_XCN01148 = XCN01148;
	}

	public String getXCN01149() {
		return _XCN01149;
	}

	public void setXCN01149(String XCN01149) {
		_XCN01149 = XCN01149;
	}

	public String getXCN01150() {
		return _XCN01150;
	}

	public void setXCN01150(String XCN01150) {
		_XCN01150 = XCN01150;
	}

	public String getXCN01151() {
		return _XCN01151;
	}

	public void setXCN01151(String XCN01151) {
		_XCN01151 = XCN01151;
	}

	public String getXCN01152() {
		return _XCN01152;
	}

	public void setXCN01152(String XCN01152) {
		_XCN01152 = XCN01152;
	}

	public String getXCN01153() {
		return _XCN01153;
	}

	public void setXCN01153(String XCN01153) {
		_XCN01153 = XCN01153;
	}

	public String getXCN01154() {
		return _XCN01154;
	}

	public void setXCN01154(String XCN01154) {
		_XCN01154 = XCN01154;
	}

	public String getXCN01155() {
		return _XCN01155;
	}

	public void setXCN01155(String XCN01155) {
		_XCN01155 = XCN01155;
	}

	public String getXCN01156() {
		return _XCN01156;
	}

	public void setXCN01156(String XCN01156) {
		_XCN01156 = XCN01156;
	}

	public String getXCN01157() {
		return _XCN01157;
	}

	public void setXCN01157(String XCN01157) {
		_XCN01157 = XCN01157;
	}

	public String getXCN01158() {
		return _XCN01158;
	}

	public void setXCN01158(String XCN01158) {
		_XCN01158 = XCN01158;
	}

	public String getXCN01159() {
		return _XCN01159;
	}

	public void setXCN01159(String XCN01159) {
		_XCN01159 = XCN01159;
	}

	public String getXCN01160() {
		return _XCN01160;
	}

	public void setXCN01160(String XCN01160) {
		_XCN01160 = XCN01160;
	}

	public String getXCN01161() {
		return _XCN01161;
	}

	public void setXCN01161(String XCN01161) {
		_XCN01161 = XCN01161;
	}

	public String getXCN01162() {
		return _XCN01162;
	}

	public void setXCN01162(String XCN01162) {
		_XCN01162 = XCN01162;
	}

	public String getXCN01163() {
		return _XCN01163;
	}

	public void setXCN01163(String XCN01163) {
		_XCN01163 = XCN01163;
	}

	public String getXCN01164() {
		return _XCN01164;
	}

	public void setXCN01164(String XCN01164) {
		_XCN01164 = XCN01164;
	}

	public String getXCN01165() {
		return _XCN01165;
	}

	public void setXCN01165(String XCN01165) {
		_XCN01165 = XCN01165;
	}

	public String getXCN01166() {
		return _XCN01166;
	}

	public void setXCN01166(String XCN01166) {
		_XCN01166 = XCN01166;
	}

	public String getXCN01167() {
		return _XCN01167;
	}

	public void setXCN01167(String XCN01167) {
		_XCN01167 = XCN01167;
	}

	public String getXCN01168() {
		return _XCN01168;
	}

	public void setXCN01168(String XCN01168) {
		_XCN01168 = XCN01168;
	}

	public String getXCN01169() {
		return _XCN01169;
	}

	public void setXCN01169(String XCN01169) {
		_XCN01169 = XCN01169;
	}

	public String getXCN01170() {
		return _XCN01170;
	}

	public void setXCN01170(String XCN01170) {
		_XCN01170 = XCN01170;
	}

	public String getXCN01171() {
		return _XCN01171;
	}

	public void setXCN01171(String XCN01171) {
		_XCN01171 = XCN01171;
	}

	public String getXCN01172() {
		return _XCN01172;
	}

	public void setXCN01172(String XCN01172) {
		_XCN01172 = XCN01172;
	}

	public String getXCN01173() {
		return _XCN01173;
	}

	public void setXCN01173(String XCN01173) {
		_XCN01173 = XCN01173;
	}

	public String getXCN01174() {
		return _XCN01174;
	}

	public void setXCN01174(String XCN01174) {
		_XCN01174 = XCN01174;
	}

	public String getXCN01175() {
		return _XCN01175;
	}

	public void setXCN01175(String XCN01175) {
		_XCN01175 = XCN01175;
	}

	public String getXCN01176() {
		return _XCN01176;
	}

	public void setXCN01176(String XCN01176) {
		_XCN01176 = XCN01176;
	}

	public String getXCN01177() {
		return _XCN01177;
	}

	public void setXCN01177(String XCN01177) {
		_XCN01177 = XCN01177;
	}

	public String getXCN01178() {
		return _XCN01178;
	}

	public void setXCN01178(String XCN01178) {
		_XCN01178 = XCN01178;
	}

	public String getXCN01179() {
		return _XCN01179;
	}

	public void setXCN01179(String XCN01179) {
		_XCN01179 = XCN01179;
	}

	public String getXCN01180() {
		return _XCN01180;
	}

	public void setXCN01180(String XCN01180) {
		_XCN01180 = XCN01180;
	}

	public String getXCN01181() {
		return _XCN01181;
	}

	public void setXCN01181(String XCN01181) {
		_XCN01181 = XCN01181;
	}

	public String getXCN01182() {
		return _XCN01182;
	}

	public void setXCN01182(String XCN01182) {
		_XCN01182 = XCN01182;
	}

	public String getXCN01183() {
		return _XCN01183;
	}

	public void setXCN01183(String XCN01183) {
		_XCN01183 = XCN01183;
	}

	public String getXCN01184() {
		return _XCN01184;
	}

	public void setXCN01184(String XCN01184) {
		_XCN01184 = XCN01184;
	}

	public String getXCN01185() {
		return _XCN01185;
	}

	public void setXCN01185(String XCN01185) {
		_XCN01185 = XCN01185;
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
	private String _XCN01001;
	private String _XCN01002;
	private String _XCN01003;
	private String _XCN01004;
	private String _XCN01005;
	private String _XCN01006;
	private String _XCN01007;
	private String _XCN01008;
	private String _XCN01009;
	private String _XCN01010;
	private String _XCN01011;
	private String _XCN01012;
	private String _XCN01013;
	private String _XCN01014;
	private String _XCN01016;
	private String _XCN01017;
	private String _XCN01019;
	private String _XCN01020;
	private String _XCN01021;
	private String _XCN01022;
	private String _XCN01024;
	private String _XCN01025;
	private String _XCN01026;
	private String _XCN01027;
	private String _XCN01028;
	private String _XCN01030;
	private String _XCN01031;
	private String _XCN01032;
	private String _XCN01033;
	private String _XCN01034;
	private String _XCN01035;
	private String _XCN01036;
	private String _XCN01037;
	private String _XCN01038;
	private String _XCN01039;
	private String _XCN01040;
	private String _XCN01041;
	private String _XCN01042;
	private String _XCN01043;
	private String _XCN01044;
	private String _XCN01045;
	private String _XCN01046;
	private String _XCN01047;
	private String _XCN01049;
	private String _XCN01050;
	private String _XCN01051;
	private String _XCN01052;
	private String _XCN01053;
	private String _XCN01054;
	private String _XCN01055;
	private String _XCN01056;
	private String _XCN01057;
	private String _XCN01058;
	private String _XCN01059;
	private String _XCN01060;
	private String _XCN01062;
	private String _XCN01063;
	private String _XCN01064;
	private String _XCN01065;
	private String _XCN01066;
	private String _XCN01067;
	private String _XCN01068;
	private String _XCN01069;
	private String _XCN01100;
	private String _XCN01101;
	private String _XCN01102;
	private String _XCN01103;
	private String _XCN01104;
	private String _XCN01105;
	private String _XCN01106;
	private String _XCN01107;
	private String _XCN01108;
	private String _XCN01109;
	private String _XCN01110;
	private String _XCN01111;
	private String _XCN01112;
	private String _XCN01113;
	private String _XCN01114;
	private String _XCN01115;
	private String _XCN01116;
	private String _XCN01117;
	private String _XCN01118;
	private String _XCN01119;
	private String _XCN01120;
	private String _XCN01121;
	private String _XCN01122;
	private String _XCN01123;
	private String _XCN01124;
	private String _XCN01125;
	private String _XCN01126;
	private String _XCN01127;
	private String _XCN01128;
	private String _XCN01129;
	private String _XCN01130;
	private String _XCN01131;
	private String _XCN01132;
	private String _XCN01133;
	private String _XCN01134;
	private String _XCN01135;
	private String _XCN01136;
	private String _XCN01137;
	private String _XCN01138;
	private String _XCN01139;
	private String _XCN01140;
	private String _XCN01141;
	private String _XCN01142;
	private String _XCN01143;
	private String _XCN01144;
	private String _XCN01145;
	private String _XCN01146;
	private String _XCN01147;
	private String _XCN01148;
	private String _XCN01149;
	private String _XCN01150;
	private String _XCN01151;
	private String _XCN01152;
	private String _XCN01153;
	private String _XCN01154;
	private String _XCN01155;
	private String _XCN01156;
	private String _XCN01157;
	private String _XCN01158;
	private String _XCN01159;
	private String _XCN01160;
	private String _XCN01161;
	private String _XCN01162;
	private String _XCN01163;
	private String _XCN01164;
	private String _XCN01165;
	private String _XCN01166;
	private String _XCN01167;
	private String _XCN01168;
	private String _XCN01169;
	private String _XCN01170;
	private String _XCN01171;
	private String _XCN01172;
	private String _XCN01173;
	private String _XCN01174;
	private String _XCN01175;
	private String _XCN01176;
	private String _XCN01177;
	private String _XCN01178;
	private String _XCN01179;
	private String _XCN01180;
	private String _XCN01181;
	private String _XCN01182;
	private String _XCN01183;
	private String _XCN01184;
	private String _XCN01185;
	private Date _modifyDate;
	private Date _syncDate;
}