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
public class VRTechnicalSpec_XCHSoap implements Serializable {
	public static VRTechnicalSpec_XCHSoap toSoapModel(VRTechnicalSpec_XCH model) {
		VRTechnicalSpec_XCHSoap soapModel = new VRTechnicalSpec_XCHSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setConvertAssembleId(model.getConvertAssembleId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setReferenceUid(model.getReferenceUid());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDeliverableCode(model.getDeliverableCode());
		soapModel.setVehicleTypeCertificateId(model.getVehicleTypeCertificateId());
		soapModel.setXCH01001(model.getXCH01001());
		soapModel.setXCH01002(model.getXCH01002());
		soapModel.setXCH01003(model.getXCH01003());
		soapModel.setXCH01004(model.getXCH01004());
		soapModel.setXCH01005(model.getXCH01005());
		soapModel.setXCH01006(model.getXCH01006());
		soapModel.setXCH01007(model.getXCH01007());
		soapModel.setXCH01008(model.getXCH01008());
		soapModel.setXCH01009(model.getXCH01009());
		soapModel.setXCH01010(model.getXCH01010());
		soapModel.setXCH01011(model.getXCH01011());
		soapModel.setXCH01012(model.getXCH01012());
		soapModel.setXCH01013(model.getXCH01013());
		soapModel.setXCH01014(model.getXCH01014());
		soapModel.setXCH01016(model.getXCH01016());
		soapModel.setXCH01017(model.getXCH01017());
		soapModel.setXCH01019(model.getXCH01019());
		soapModel.setXCH01020(model.getXCH01020());
		soapModel.setXCH01021(model.getXCH01021());
		soapModel.setXCH01022(model.getXCH01022());
		soapModel.setXCH01024(model.getXCH01024());
		soapModel.setXCH01025(model.getXCH01025());
		soapModel.setXCH01026(model.getXCH01026());
		soapModel.setXCH01027(model.getXCH01027());
		soapModel.setXCH01028(model.getXCH01028());
		soapModel.setXCH01030(model.getXCH01030());
		soapModel.setXCH01031(model.getXCH01031());
		soapModel.setXCH01032(model.getXCH01032());
		soapModel.setXCH01033(model.getXCH01033());
		soapModel.setXCH01034(model.getXCH01034());
		soapModel.setXCH01035(model.getXCH01035());
		soapModel.setXCH01036(model.getXCH01036());
		soapModel.setXCH01037(model.getXCH01037());
		soapModel.setXCH01038(model.getXCH01038());
		soapModel.setXCH01039(model.getXCH01039());
		soapModel.setXCH01040(model.getXCH01040());
		soapModel.setXCH01041(model.getXCH01041());
		soapModel.setXCH01042(model.getXCH01042());
		soapModel.setXCH01043(model.getXCH01043());
		soapModel.setXCH01044(model.getXCH01044());
		soapModel.setXCH01045(model.getXCH01045());
		soapModel.setXCH01046(model.getXCH01046());
		soapModel.setXCH01047(model.getXCH01047());
		soapModel.setXCH01049(model.getXCH01049());
		soapModel.setXCH01050(model.getXCH01050());
		soapModel.setXCH01051(model.getXCH01051());
		soapModel.setXCH01052(model.getXCH01052());
		soapModel.setXCH01053(model.getXCH01053());
		soapModel.setXCH01054(model.getXCH01054());
		soapModel.setXCH01055(model.getXCH01055());
		soapModel.setXCH01056(model.getXCH01056());
		soapModel.setXCH01057(model.getXCH01057());
		soapModel.setXCH01058(model.getXCH01058());
		soapModel.setXCH01059(model.getXCH01059());
		soapModel.setXCH01060(model.getXCH01060());
		soapModel.setXCH01062(model.getXCH01062());
		soapModel.setXCH01063(model.getXCH01063());
		soapModel.setXCH01064(model.getXCH01064());
		soapModel.setXCH01065(model.getXCH01065());
		soapModel.setXCH01066(model.getXCH01066());
		soapModel.setXCH01067(model.getXCH01067());
		soapModel.setXCH01068(model.getXCH01068());
		soapModel.setXCH01069(model.getXCH01069());
		soapModel.setXCH01100(model.getXCH01100());
		soapModel.setXCH01101(model.getXCH01101());
		soapModel.setXCH01102(model.getXCH01102());
		soapModel.setXCH01103(model.getXCH01103());
		soapModel.setXCH01104(model.getXCH01104());
		soapModel.setXCH01105(model.getXCH01105());
		soapModel.setXCH01106(model.getXCH01106());
		soapModel.setXCH01107(model.getXCH01107());
		soapModel.setXCH01108(model.getXCH01108());
		soapModel.setXCH01109(model.getXCH01109());
		soapModel.setXCH01110(model.getXCH01110());
		soapModel.setXCH01111(model.getXCH01111());
		soapModel.setXCH01112(model.getXCH01112());
		soapModel.setXCH01113(model.getXCH01113());
		soapModel.setXCH01114(model.getXCH01114());
		soapModel.setXCH01115(model.getXCH01115());
		soapModel.setXCH01116(model.getXCH01116());
		soapModel.setXCH01117(model.getXCH01117());
		soapModel.setXCH01118(model.getXCH01118());
		soapModel.setXCH01119(model.getXCH01119());
		soapModel.setXCH01120(model.getXCH01120());
		soapModel.setXCH01121(model.getXCH01121());
		soapModel.setXCH01122(model.getXCH01122());
		soapModel.setXCH01123(model.getXCH01123());
		soapModel.setXCH01124(model.getXCH01124());
		soapModel.setXCH01125(model.getXCH01125());
		soapModel.setXCH01126(model.getXCH01126());
		soapModel.setXCH01127(model.getXCH01127());
		soapModel.setXCH01128(model.getXCH01128());
		soapModel.setXCH01129(model.getXCH01129());
		soapModel.setXCH01130(model.getXCH01130());
		soapModel.setXCH01131(model.getXCH01131());
		soapModel.setXCH01132(model.getXCH01132());
		soapModel.setXCH01133(model.getXCH01133());
		soapModel.setXCH01134(model.getXCH01134());
		soapModel.setXCH01135(model.getXCH01135());
		soapModel.setXCH01136(model.getXCH01136());
		soapModel.setXCH01137(model.getXCH01137());
		soapModel.setXCH01138(model.getXCH01138());
		soapModel.setXCH01139(model.getXCH01139());
		soapModel.setXCH01140(model.getXCH01140());
		soapModel.setXCH01141(model.getXCH01141());
		soapModel.setXCH01142(model.getXCH01142());
		soapModel.setXCH01143(model.getXCH01143());
		soapModel.setXCH01144(model.getXCH01144());
		soapModel.setXCH01145(model.getXCH01145());
		soapModel.setXCH01146(model.getXCH01146());
		soapModel.setXCH01147(model.getXCH01147());
		soapModel.setXCH01148(model.getXCH01148());
		soapModel.setXCH01149(model.getXCH01149());
		soapModel.setXCH01150(model.getXCH01150());
		soapModel.setXCH01151(model.getXCH01151());
		soapModel.setXCH01152(model.getXCH01152());
		soapModel.setXCH01153(model.getXCH01153());
		soapModel.setXCH01154(model.getXCH01154());
		soapModel.setXCH01155(model.getXCH01155());
		soapModel.setXCH01156(model.getXCH01156());
		soapModel.setXCH01157(model.getXCH01157());
		soapModel.setXCH01158(model.getXCH01158());
		soapModel.setXCH01159(model.getXCH01159());
		soapModel.setXCH01160(model.getXCH01160());
		soapModel.setXCH01161(model.getXCH01161());
		soapModel.setXCH01162(model.getXCH01162());
		soapModel.setXCH01163(model.getXCH01163());
		soapModel.setXCH01164(model.getXCH01164());
		soapModel.setXCH01165(model.getXCH01165());
		soapModel.setXCH01166(model.getXCH01166());
		soapModel.setXCH01167(model.getXCH01167());
		soapModel.setXCH01168(model.getXCH01168());
		soapModel.setXCH01169(model.getXCH01169());
		soapModel.setXCH01170(model.getXCH01170());
		soapModel.setXCH01171(model.getXCH01171());
		soapModel.setXCH01172(model.getXCH01172());
		soapModel.setXCH01173(model.getXCH01173());
		soapModel.setXCH01174(model.getXCH01174());
		soapModel.setXCH01175(model.getXCH01175());
		soapModel.setXCH01176(model.getXCH01176());
		soapModel.setXCH01177(model.getXCH01177());
		soapModel.setXCH01178(model.getXCH01178());
		soapModel.setXCH01179(model.getXCH01179());
		soapModel.setXCH01180(model.getXCH01180());
		soapModel.setXCH01181(model.getXCH01181());
		soapModel.setXCH01182(model.getXCH01182());
		soapModel.setXCH01183(model.getXCH01183());
		soapModel.setXCH01184(model.getXCH01184());
		soapModel.setXCH01185(model.getXCH01185());
		soapModel.setXCH01186(model.getXCH01186());
		soapModel.setXCH01187(model.getXCH01187());
		soapModel.setXCH01188(model.getXCH01188());
		soapModel.setXCH01189(model.getXCH01189());
		soapModel.setXCH01190(model.getXCH01190());
		soapModel.setXCH01191(model.getXCH01191());
		soapModel.setXCH01192(model.getXCH01192());
		soapModel.setXCH01193(model.getXCH01193());
		soapModel.setXCH01194(model.getXCH01194());
		soapModel.setXCH01195(model.getXCH01195());
		soapModel.setXCH01196(model.getXCH01196());
		soapModel.setXCH01197(model.getXCH01197());
		soapModel.setXCH01198(model.getXCH01198());
		soapModel.setXCH01199(model.getXCH01199());
		soapModel.setXCH01200(model.getXCH01200());
		soapModel.setXCH01201(model.getXCH01201());
		soapModel.setXCH01202(model.getXCH01202());
		soapModel.setXCH01203(model.getXCH01203());
		soapModel.setXCH01204(model.getXCH01204());
		soapModel.setXCH01205(model.getXCH01205());
		soapModel.setXCH01206(model.getXCH01206());
		soapModel.setXCH01207(model.getXCH01207());
		soapModel.setXCH01208(model.getXCH01208());
		soapModel.setXCH01209(model.getXCH01209());
		soapModel.setXCH01210(model.getXCH01210());
		soapModel.setXCH01211(model.getXCH01211());
		soapModel.setXCH01212(model.getXCH01212());
		soapModel.setXCH01213(model.getXCH01213());
		soapModel.setXCH01214(model.getXCH01214());
		soapModel.setXCH01215(model.getXCH01215());
		soapModel.setXCH01216(model.getXCH01216());
		soapModel.setXCH01217(model.getXCH01217());
		soapModel.setXCH01218(model.getXCH01218());
		soapModel.setXCH01219(model.getXCH01219());
		soapModel.setXCH01220(model.getXCH01220());
		soapModel.setXCH01221(model.getXCH01221());
		soapModel.setXCH01222(model.getXCH01222());
		soapModel.setXCH01223(model.getXCH01223());
		soapModel.setXCH01224(model.getXCH01224());
		soapModel.setXCH01225(model.getXCH01225());
		soapModel.setXCH01226(model.getXCH01226());
		soapModel.setXCH01227(model.getXCH01227());
		soapModel.setXCH01228(model.getXCH01228());
		soapModel.setXCH01229(model.getXCH01229());
		soapModel.setXCH01230(model.getXCH01230());
		soapModel.setXCH01231(model.getXCH01231());
		soapModel.setXCH01232(model.getXCH01232());
		soapModel.setXCH01233(model.getXCH01233());
		soapModel.setXCH01234(model.getXCH01234());
		soapModel.setXCH01235(model.getXCH01235());
		soapModel.setXCH01236(model.getXCH01236());
		soapModel.setXCH01237(model.getXCH01237());
		soapModel.setXCH01238(model.getXCH01238());
		soapModel.setXCH01239(model.getXCH01239());
		soapModel.setXCH01240(model.getXCH01240());
		soapModel.setXCH01241(model.getXCH01241());
		soapModel.setXCH01242(model.getXCH01242());
		soapModel.setXCH01243(model.getXCH01243());
		soapModel.setXCH01244(model.getXCH01244());
		soapModel.setXCH01245(model.getXCH01245());
		soapModel.setXCH01246(model.getXCH01246());
		soapModel.setXCH01247(model.getXCH01247());
		soapModel.setXCH01248(model.getXCH01248());
		soapModel.setXCH01249(model.getXCH01249());
		soapModel.setXCH01250(model.getXCH01250());
		soapModel.setXCH01251(model.getXCH01251());
		soapModel.setXCH01252(model.getXCH01252());
		soapModel.setXCH01253(model.getXCH01253());
		soapModel.setXCH01254(model.getXCH01254());
		soapModel.setXCH01255(model.getXCH01255());
		soapModel.setXCH01256(model.getXCH01256());
		soapModel.setXCH01257(model.getXCH01257());
		soapModel.setXCH01258(model.getXCH01258());
		soapModel.setXCH01259(model.getXCH01259());
		soapModel.setXCH01260(model.getXCH01260());
		soapModel.setXCH01261(model.getXCH01261());
		soapModel.setXCH01262(model.getXCH01262());
		soapModel.setXCH01263(model.getXCH01263());
		soapModel.setXCH01264(model.getXCH01264());
		soapModel.setXCH01265(model.getXCH01265());
		soapModel.setXCH01266(model.getXCH01266());
		soapModel.setXCH01267(model.getXCH01267());
		soapModel.setXCH01268(model.getXCH01268());
		soapModel.setXCH01269(model.getXCH01269());
		soapModel.setXCH01270(model.getXCH01270());
		soapModel.setXCH01271(model.getXCH01271());
		soapModel.setXCH01272(model.getXCH01272());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRTechnicalSpec_XCHSoap[] toSoapModels(
		VRTechnicalSpec_XCH[] models) {
		VRTechnicalSpec_XCHSoap[] soapModels = new VRTechnicalSpec_XCHSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCHSoap[][] toSoapModels(
		VRTechnicalSpec_XCH[][] models) {
		VRTechnicalSpec_XCHSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRTechnicalSpec_XCHSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRTechnicalSpec_XCHSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCHSoap[] toSoapModels(
		List<VRTechnicalSpec_XCH> models) {
		List<VRTechnicalSpec_XCHSoap> soapModels = new ArrayList<VRTechnicalSpec_XCHSoap>(models.size());

		for (VRTechnicalSpec_XCH model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRTechnicalSpec_XCHSoap[soapModels.size()]);
	}

	public VRTechnicalSpec_XCHSoap() {
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

	public String getXCH01001() {
		return _XCH01001;
	}

	public void setXCH01001(String XCH01001) {
		_XCH01001 = XCH01001;
	}

	public String getXCH01002() {
		return _XCH01002;
	}

	public void setXCH01002(String XCH01002) {
		_XCH01002 = XCH01002;
	}

	public String getXCH01003() {
		return _XCH01003;
	}

	public void setXCH01003(String XCH01003) {
		_XCH01003 = XCH01003;
	}

	public String getXCH01004() {
		return _XCH01004;
	}

	public void setXCH01004(String XCH01004) {
		_XCH01004 = XCH01004;
	}

	public String getXCH01005() {
		return _XCH01005;
	}

	public void setXCH01005(String XCH01005) {
		_XCH01005 = XCH01005;
	}

	public String getXCH01006() {
		return _XCH01006;
	}

	public void setXCH01006(String XCH01006) {
		_XCH01006 = XCH01006;
	}

	public String getXCH01007() {
		return _XCH01007;
	}

	public void setXCH01007(String XCH01007) {
		_XCH01007 = XCH01007;
	}

	public String getXCH01008() {
		return _XCH01008;
	}

	public void setXCH01008(String XCH01008) {
		_XCH01008 = XCH01008;
	}

	public String getXCH01009() {
		return _XCH01009;
	}

	public void setXCH01009(String XCH01009) {
		_XCH01009 = XCH01009;
	}

	public String getXCH01010() {
		return _XCH01010;
	}

	public void setXCH01010(String XCH01010) {
		_XCH01010 = XCH01010;
	}

	public String getXCH01011() {
		return _XCH01011;
	}

	public void setXCH01011(String XCH01011) {
		_XCH01011 = XCH01011;
	}

	public String getXCH01012() {
		return _XCH01012;
	}

	public void setXCH01012(String XCH01012) {
		_XCH01012 = XCH01012;
	}

	public String getXCH01013() {
		return _XCH01013;
	}

	public void setXCH01013(String XCH01013) {
		_XCH01013 = XCH01013;
	}

	public String getXCH01014() {
		return _XCH01014;
	}

	public void setXCH01014(String XCH01014) {
		_XCH01014 = XCH01014;
	}

	public String getXCH01016() {
		return _XCH01016;
	}

	public void setXCH01016(String XCH01016) {
		_XCH01016 = XCH01016;
	}

	public String getXCH01017() {
		return _XCH01017;
	}

	public void setXCH01017(String XCH01017) {
		_XCH01017 = XCH01017;
	}

	public String getXCH01019() {
		return _XCH01019;
	}

	public void setXCH01019(String XCH01019) {
		_XCH01019 = XCH01019;
	}

	public String getXCH01020() {
		return _XCH01020;
	}

	public void setXCH01020(String XCH01020) {
		_XCH01020 = XCH01020;
	}

	public String getXCH01021() {
		return _XCH01021;
	}

	public void setXCH01021(String XCH01021) {
		_XCH01021 = XCH01021;
	}

	public String getXCH01022() {
		return _XCH01022;
	}

	public void setXCH01022(String XCH01022) {
		_XCH01022 = XCH01022;
	}

	public String getXCH01024() {
		return _XCH01024;
	}

	public void setXCH01024(String XCH01024) {
		_XCH01024 = XCH01024;
	}

	public String getXCH01025() {
		return _XCH01025;
	}

	public void setXCH01025(String XCH01025) {
		_XCH01025 = XCH01025;
	}

	public String getXCH01026() {
		return _XCH01026;
	}

	public void setXCH01026(String XCH01026) {
		_XCH01026 = XCH01026;
	}

	public String getXCH01027() {
		return _XCH01027;
	}

	public void setXCH01027(String XCH01027) {
		_XCH01027 = XCH01027;
	}

	public String getXCH01028() {
		return _XCH01028;
	}

	public void setXCH01028(String XCH01028) {
		_XCH01028 = XCH01028;
	}

	public String getXCH01030() {
		return _XCH01030;
	}

	public void setXCH01030(String XCH01030) {
		_XCH01030 = XCH01030;
	}

	public String getXCH01031() {
		return _XCH01031;
	}

	public void setXCH01031(String XCH01031) {
		_XCH01031 = XCH01031;
	}

	public String getXCH01032() {
		return _XCH01032;
	}

	public void setXCH01032(String XCH01032) {
		_XCH01032 = XCH01032;
	}

	public String getXCH01033() {
		return _XCH01033;
	}

	public void setXCH01033(String XCH01033) {
		_XCH01033 = XCH01033;
	}

	public String getXCH01034() {
		return _XCH01034;
	}

	public void setXCH01034(String XCH01034) {
		_XCH01034 = XCH01034;
	}

	public String getXCH01035() {
		return _XCH01035;
	}

	public void setXCH01035(String XCH01035) {
		_XCH01035 = XCH01035;
	}

	public String getXCH01036() {
		return _XCH01036;
	}

	public void setXCH01036(String XCH01036) {
		_XCH01036 = XCH01036;
	}

	public String getXCH01037() {
		return _XCH01037;
	}

	public void setXCH01037(String XCH01037) {
		_XCH01037 = XCH01037;
	}

	public String getXCH01038() {
		return _XCH01038;
	}

	public void setXCH01038(String XCH01038) {
		_XCH01038 = XCH01038;
	}

	public String getXCH01039() {
		return _XCH01039;
	}

	public void setXCH01039(String XCH01039) {
		_XCH01039 = XCH01039;
	}

	public String getXCH01040() {
		return _XCH01040;
	}

	public void setXCH01040(String XCH01040) {
		_XCH01040 = XCH01040;
	}

	public String getXCH01041() {
		return _XCH01041;
	}

	public void setXCH01041(String XCH01041) {
		_XCH01041 = XCH01041;
	}

	public String getXCH01042() {
		return _XCH01042;
	}

	public void setXCH01042(String XCH01042) {
		_XCH01042 = XCH01042;
	}

	public String getXCH01043() {
		return _XCH01043;
	}

	public void setXCH01043(String XCH01043) {
		_XCH01043 = XCH01043;
	}

	public String getXCH01044() {
		return _XCH01044;
	}

	public void setXCH01044(String XCH01044) {
		_XCH01044 = XCH01044;
	}

	public String getXCH01045() {
		return _XCH01045;
	}

	public void setXCH01045(String XCH01045) {
		_XCH01045 = XCH01045;
	}

	public String getXCH01046() {
		return _XCH01046;
	}

	public void setXCH01046(String XCH01046) {
		_XCH01046 = XCH01046;
	}

	public String getXCH01047() {
		return _XCH01047;
	}

	public void setXCH01047(String XCH01047) {
		_XCH01047 = XCH01047;
	}

	public String getXCH01049() {
		return _XCH01049;
	}

	public void setXCH01049(String XCH01049) {
		_XCH01049 = XCH01049;
	}

	public String getXCH01050() {
		return _XCH01050;
	}

	public void setXCH01050(String XCH01050) {
		_XCH01050 = XCH01050;
	}

	public String getXCH01051() {
		return _XCH01051;
	}

	public void setXCH01051(String XCH01051) {
		_XCH01051 = XCH01051;
	}

	public String getXCH01052() {
		return _XCH01052;
	}

	public void setXCH01052(String XCH01052) {
		_XCH01052 = XCH01052;
	}

	public String getXCH01053() {
		return _XCH01053;
	}

	public void setXCH01053(String XCH01053) {
		_XCH01053 = XCH01053;
	}

	public String getXCH01054() {
		return _XCH01054;
	}

	public void setXCH01054(String XCH01054) {
		_XCH01054 = XCH01054;
	}

	public String getXCH01055() {
		return _XCH01055;
	}

	public void setXCH01055(String XCH01055) {
		_XCH01055 = XCH01055;
	}

	public String getXCH01056() {
		return _XCH01056;
	}

	public void setXCH01056(String XCH01056) {
		_XCH01056 = XCH01056;
	}

	public String getXCH01057() {
		return _XCH01057;
	}

	public void setXCH01057(String XCH01057) {
		_XCH01057 = XCH01057;
	}

	public String getXCH01058() {
		return _XCH01058;
	}

	public void setXCH01058(String XCH01058) {
		_XCH01058 = XCH01058;
	}

	public String getXCH01059() {
		return _XCH01059;
	}

	public void setXCH01059(String XCH01059) {
		_XCH01059 = XCH01059;
	}

	public String getXCH01060() {
		return _XCH01060;
	}

	public void setXCH01060(String XCH01060) {
		_XCH01060 = XCH01060;
	}

	public String getXCH01062() {
		return _XCH01062;
	}

	public void setXCH01062(String XCH01062) {
		_XCH01062 = XCH01062;
	}

	public String getXCH01063() {
		return _XCH01063;
	}

	public void setXCH01063(String XCH01063) {
		_XCH01063 = XCH01063;
	}

	public String getXCH01064() {
		return _XCH01064;
	}

	public void setXCH01064(String XCH01064) {
		_XCH01064 = XCH01064;
	}

	public String getXCH01065() {
		return _XCH01065;
	}

	public void setXCH01065(String XCH01065) {
		_XCH01065 = XCH01065;
	}

	public String getXCH01066() {
		return _XCH01066;
	}

	public void setXCH01066(String XCH01066) {
		_XCH01066 = XCH01066;
	}

	public String getXCH01067() {
		return _XCH01067;
	}

	public void setXCH01067(String XCH01067) {
		_XCH01067 = XCH01067;
	}

	public String getXCH01068() {
		return _XCH01068;
	}

	public void setXCH01068(String XCH01068) {
		_XCH01068 = XCH01068;
	}

	public String getXCH01069() {
		return _XCH01069;
	}

	public void setXCH01069(String XCH01069) {
		_XCH01069 = XCH01069;
	}

	public String getXCH01100() {
		return _XCH01100;
	}

	public void setXCH01100(String XCH01100) {
		_XCH01100 = XCH01100;
	}

	public String getXCH01101() {
		return _XCH01101;
	}

	public void setXCH01101(String XCH01101) {
		_XCH01101 = XCH01101;
	}

	public String getXCH01102() {
		return _XCH01102;
	}

	public void setXCH01102(String XCH01102) {
		_XCH01102 = XCH01102;
	}

	public String getXCH01103() {
		return _XCH01103;
	}

	public void setXCH01103(String XCH01103) {
		_XCH01103 = XCH01103;
	}

	public String getXCH01104() {
		return _XCH01104;
	}

	public void setXCH01104(String XCH01104) {
		_XCH01104 = XCH01104;
	}

	public String getXCH01105() {
		return _XCH01105;
	}

	public void setXCH01105(String XCH01105) {
		_XCH01105 = XCH01105;
	}

	public String getXCH01106() {
		return _XCH01106;
	}

	public void setXCH01106(String XCH01106) {
		_XCH01106 = XCH01106;
	}

	public String getXCH01107() {
		return _XCH01107;
	}

	public void setXCH01107(String XCH01107) {
		_XCH01107 = XCH01107;
	}

	public String getXCH01108() {
		return _XCH01108;
	}

	public void setXCH01108(String XCH01108) {
		_XCH01108 = XCH01108;
	}

	public String getXCH01109() {
		return _XCH01109;
	}

	public void setXCH01109(String XCH01109) {
		_XCH01109 = XCH01109;
	}

	public String getXCH01110() {
		return _XCH01110;
	}

	public void setXCH01110(String XCH01110) {
		_XCH01110 = XCH01110;
	}

	public String getXCH01111() {
		return _XCH01111;
	}

	public void setXCH01111(String XCH01111) {
		_XCH01111 = XCH01111;
	}

	public String getXCH01112() {
		return _XCH01112;
	}

	public void setXCH01112(String XCH01112) {
		_XCH01112 = XCH01112;
	}

	public String getXCH01113() {
		return _XCH01113;
	}

	public void setXCH01113(String XCH01113) {
		_XCH01113 = XCH01113;
	}

	public String getXCH01114() {
		return _XCH01114;
	}

	public void setXCH01114(String XCH01114) {
		_XCH01114 = XCH01114;
	}

	public String getXCH01115() {
		return _XCH01115;
	}

	public void setXCH01115(String XCH01115) {
		_XCH01115 = XCH01115;
	}

	public String getXCH01116() {
		return _XCH01116;
	}

	public void setXCH01116(String XCH01116) {
		_XCH01116 = XCH01116;
	}

	public String getXCH01117() {
		return _XCH01117;
	}

	public void setXCH01117(String XCH01117) {
		_XCH01117 = XCH01117;
	}

	public String getXCH01118() {
		return _XCH01118;
	}

	public void setXCH01118(String XCH01118) {
		_XCH01118 = XCH01118;
	}

	public String getXCH01119() {
		return _XCH01119;
	}

	public void setXCH01119(String XCH01119) {
		_XCH01119 = XCH01119;
	}

	public String getXCH01120() {
		return _XCH01120;
	}

	public void setXCH01120(String XCH01120) {
		_XCH01120 = XCH01120;
	}

	public String getXCH01121() {
		return _XCH01121;
	}

	public void setXCH01121(String XCH01121) {
		_XCH01121 = XCH01121;
	}

	public String getXCH01122() {
		return _XCH01122;
	}

	public void setXCH01122(String XCH01122) {
		_XCH01122 = XCH01122;
	}

	public String getXCH01123() {
		return _XCH01123;
	}

	public void setXCH01123(String XCH01123) {
		_XCH01123 = XCH01123;
	}

	public String getXCH01124() {
		return _XCH01124;
	}

	public void setXCH01124(String XCH01124) {
		_XCH01124 = XCH01124;
	}

	public String getXCH01125() {
		return _XCH01125;
	}

	public void setXCH01125(String XCH01125) {
		_XCH01125 = XCH01125;
	}

	public String getXCH01126() {
		return _XCH01126;
	}

	public void setXCH01126(String XCH01126) {
		_XCH01126 = XCH01126;
	}

	public String getXCH01127() {
		return _XCH01127;
	}

	public void setXCH01127(String XCH01127) {
		_XCH01127 = XCH01127;
	}

	public String getXCH01128() {
		return _XCH01128;
	}

	public void setXCH01128(String XCH01128) {
		_XCH01128 = XCH01128;
	}

	public String getXCH01129() {
		return _XCH01129;
	}

	public void setXCH01129(String XCH01129) {
		_XCH01129 = XCH01129;
	}

	public String getXCH01130() {
		return _XCH01130;
	}

	public void setXCH01130(String XCH01130) {
		_XCH01130 = XCH01130;
	}

	public String getXCH01131() {
		return _XCH01131;
	}

	public void setXCH01131(String XCH01131) {
		_XCH01131 = XCH01131;
	}

	public String getXCH01132() {
		return _XCH01132;
	}

	public void setXCH01132(String XCH01132) {
		_XCH01132 = XCH01132;
	}

	public String getXCH01133() {
		return _XCH01133;
	}

	public void setXCH01133(String XCH01133) {
		_XCH01133 = XCH01133;
	}

	public String getXCH01134() {
		return _XCH01134;
	}

	public void setXCH01134(String XCH01134) {
		_XCH01134 = XCH01134;
	}

	public String getXCH01135() {
		return _XCH01135;
	}

	public void setXCH01135(String XCH01135) {
		_XCH01135 = XCH01135;
	}

	public String getXCH01136() {
		return _XCH01136;
	}

	public void setXCH01136(String XCH01136) {
		_XCH01136 = XCH01136;
	}

	public String getXCH01137() {
		return _XCH01137;
	}

	public void setXCH01137(String XCH01137) {
		_XCH01137 = XCH01137;
	}

	public String getXCH01138() {
		return _XCH01138;
	}

	public void setXCH01138(String XCH01138) {
		_XCH01138 = XCH01138;
	}

	public String getXCH01139() {
		return _XCH01139;
	}

	public void setXCH01139(String XCH01139) {
		_XCH01139 = XCH01139;
	}

	public String getXCH01140() {
		return _XCH01140;
	}

	public void setXCH01140(String XCH01140) {
		_XCH01140 = XCH01140;
	}

	public String getXCH01141() {
		return _XCH01141;
	}

	public void setXCH01141(String XCH01141) {
		_XCH01141 = XCH01141;
	}

	public String getXCH01142() {
		return _XCH01142;
	}

	public void setXCH01142(String XCH01142) {
		_XCH01142 = XCH01142;
	}

	public String getXCH01143() {
		return _XCH01143;
	}

	public void setXCH01143(String XCH01143) {
		_XCH01143 = XCH01143;
	}

	public String getXCH01144() {
		return _XCH01144;
	}

	public void setXCH01144(String XCH01144) {
		_XCH01144 = XCH01144;
	}

	public String getXCH01145() {
		return _XCH01145;
	}

	public void setXCH01145(String XCH01145) {
		_XCH01145 = XCH01145;
	}

	public String getXCH01146() {
		return _XCH01146;
	}

	public void setXCH01146(String XCH01146) {
		_XCH01146 = XCH01146;
	}

	public String getXCH01147() {
		return _XCH01147;
	}

	public void setXCH01147(String XCH01147) {
		_XCH01147 = XCH01147;
	}

	public String getXCH01148() {
		return _XCH01148;
	}

	public void setXCH01148(String XCH01148) {
		_XCH01148 = XCH01148;
	}

	public String getXCH01149() {
		return _XCH01149;
	}

	public void setXCH01149(String XCH01149) {
		_XCH01149 = XCH01149;
	}

	public String getXCH01150() {
		return _XCH01150;
	}

	public void setXCH01150(String XCH01150) {
		_XCH01150 = XCH01150;
	}

	public String getXCH01151() {
		return _XCH01151;
	}

	public void setXCH01151(String XCH01151) {
		_XCH01151 = XCH01151;
	}

	public String getXCH01152() {
		return _XCH01152;
	}

	public void setXCH01152(String XCH01152) {
		_XCH01152 = XCH01152;
	}

	public String getXCH01153() {
		return _XCH01153;
	}

	public void setXCH01153(String XCH01153) {
		_XCH01153 = XCH01153;
	}

	public String getXCH01154() {
		return _XCH01154;
	}

	public void setXCH01154(String XCH01154) {
		_XCH01154 = XCH01154;
	}

	public String getXCH01155() {
		return _XCH01155;
	}

	public void setXCH01155(String XCH01155) {
		_XCH01155 = XCH01155;
	}

	public String getXCH01156() {
		return _XCH01156;
	}

	public void setXCH01156(String XCH01156) {
		_XCH01156 = XCH01156;
	}

	public String getXCH01157() {
		return _XCH01157;
	}

	public void setXCH01157(String XCH01157) {
		_XCH01157 = XCH01157;
	}

	public String getXCH01158() {
		return _XCH01158;
	}

	public void setXCH01158(String XCH01158) {
		_XCH01158 = XCH01158;
	}

	public String getXCH01159() {
		return _XCH01159;
	}

	public void setXCH01159(String XCH01159) {
		_XCH01159 = XCH01159;
	}

	public String getXCH01160() {
		return _XCH01160;
	}

	public void setXCH01160(String XCH01160) {
		_XCH01160 = XCH01160;
	}

	public String getXCH01161() {
		return _XCH01161;
	}

	public void setXCH01161(String XCH01161) {
		_XCH01161 = XCH01161;
	}

	public String getXCH01162() {
		return _XCH01162;
	}

	public void setXCH01162(String XCH01162) {
		_XCH01162 = XCH01162;
	}

	public String getXCH01163() {
		return _XCH01163;
	}

	public void setXCH01163(String XCH01163) {
		_XCH01163 = XCH01163;
	}

	public String getXCH01164() {
		return _XCH01164;
	}

	public void setXCH01164(String XCH01164) {
		_XCH01164 = XCH01164;
	}

	public String getXCH01165() {
		return _XCH01165;
	}

	public void setXCH01165(String XCH01165) {
		_XCH01165 = XCH01165;
	}

	public String getXCH01166() {
		return _XCH01166;
	}

	public void setXCH01166(String XCH01166) {
		_XCH01166 = XCH01166;
	}

	public String getXCH01167() {
		return _XCH01167;
	}

	public void setXCH01167(String XCH01167) {
		_XCH01167 = XCH01167;
	}

	public String getXCH01168() {
		return _XCH01168;
	}

	public void setXCH01168(String XCH01168) {
		_XCH01168 = XCH01168;
	}

	public String getXCH01169() {
		return _XCH01169;
	}

	public void setXCH01169(String XCH01169) {
		_XCH01169 = XCH01169;
	}

	public String getXCH01170() {
		return _XCH01170;
	}

	public void setXCH01170(String XCH01170) {
		_XCH01170 = XCH01170;
	}

	public String getXCH01171() {
		return _XCH01171;
	}

	public void setXCH01171(String XCH01171) {
		_XCH01171 = XCH01171;
	}

	public String getXCH01172() {
		return _XCH01172;
	}

	public void setXCH01172(String XCH01172) {
		_XCH01172 = XCH01172;
	}

	public String getXCH01173() {
		return _XCH01173;
	}

	public void setXCH01173(String XCH01173) {
		_XCH01173 = XCH01173;
	}

	public String getXCH01174() {
		return _XCH01174;
	}

	public void setXCH01174(String XCH01174) {
		_XCH01174 = XCH01174;
	}

	public String getXCH01175() {
		return _XCH01175;
	}

	public void setXCH01175(String XCH01175) {
		_XCH01175 = XCH01175;
	}

	public String getXCH01176() {
		return _XCH01176;
	}

	public void setXCH01176(String XCH01176) {
		_XCH01176 = XCH01176;
	}

	public String getXCH01177() {
		return _XCH01177;
	}

	public void setXCH01177(String XCH01177) {
		_XCH01177 = XCH01177;
	}

	public String getXCH01178() {
		return _XCH01178;
	}

	public void setXCH01178(String XCH01178) {
		_XCH01178 = XCH01178;
	}

	public String getXCH01179() {
		return _XCH01179;
	}

	public void setXCH01179(String XCH01179) {
		_XCH01179 = XCH01179;
	}

	public String getXCH01180() {
		return _XCH01180;
	}

	public void setXCH01180(String XCH01180) {
		_XCH01180 = XCH01180;
	}

	public String getXCH01181() {
		return _XCH01181;
	}

	public void setXCH01181(String XCH01181) {
		_XCH01181 = XCH01181;
	}

	public String getXCH01182() {
		return _XCH01182;
	}

	public void setXCH01182(String XCH01182) {
		_XCH01182 = XCH01182;
	}

	public String getXCH01183() {
		return _XCH01183;
	}

	public void setXCH01183(String XCH01183) {
		_XCH01183 = XCH01183;
	}

	public String getXCH01184() {
		return _XCH01184;
	}

	public void setXCH01184(String XCH01184) {
		_XCH01184 = XCH01184;
	}

	public String getXCH01185() {
		return _XCH01185;
	}

	public void setXCH01185(String XCH01185) {
		_XCH01185 = XCH01185;
	}

	public String getXCH01186() {
		return _XCH01186;
	}

	public void setXCH01186(String XCH01186) {
		_XCH01186 = XCH01186;
	}

	public String getXCH01187() {
		return _XCH01187;
	}

	public void setXCH01187(String XCH01187) {
		_XCH01187 = XCH01187;
	}

	public String getXCH01188() {
		return _XCH01188;
	}

	public void setXCH01188(String XCH01188) {
		_XCH01188 = XCH01188;
	}

	public String getXCH01189() {
		return _XCH01189;
	}

	public void setXCH01189(String XCH01189) {
		_XCH01189 = XCH01189;
	}

	public String getXCH01190() {
		return _XCH01190;
	}

	public void setXCH01190(String XCH01190) {
		_XCH01190 = XCH01190;
	}

	public String getXCH01191() {
		return _XCH01191;
	}

	public void setXCH01191(String XCH01191) {
		_XCH01191 = XCH01191;
	}

	public String getXCH01192() {
		return _XCH01192;
	}

	public void setXCH01192(String XCH01192) {
		_XCH01192 = XCH01192;
	}

	public String getXCH01193() {
		return _XCH01193;
	}

	public void setXCH01193(String XCH01193) {
		_XCH01193 = XCH01193;
	}

	public String getXCH01194() {
		return _XCH01194;
	}

	public void setXCH01194(String XCH01194) {
		_XCH01194 = XCH01194;
	}

	public String getXCH01195() {
		return _XCH01195;
	}

	public void setXCH01195(String XCH01195) {
		_XCH01195 = XCH01195;
	}

	public String getXCH01196() {
		return _XCH01196;
	}

	public void setXCH01196(String XCH01196) {
		_XCH01196 = XCH01196;
	}

	public String getXCH01197() {
		return _XCH01197;
	}

	public void setXCH01197(String XCH01197) {
		_XCH01197 = XCH01197;
	}

	public String getXCH01198() {
		return _XCH01198;
	}

	public void setXCH01198(String XCH01198) {
		_XCH01198 = XCH01198;
	}

	public String getXCH01199() {
		return _XCH01199;
	}

	public void setXCH01199(String XCH01199) {
		_XCH01199 = XCH01199;
	}

	public String getXCH01200() {
		return _XCH01200;
	}

	public void setXCH01200(String XCH01200) {
		_XCH01200 = XCH01200;
	}

	public String getXCH01201() {
		return _XCH01201;
	}

	public void setXCH01201(String XCH01201) {
		_XCH01201 = XCH01201;
	}

	public String getXCH01202() {
		return _XCH01202;
	}

	public void setXCH01202(String XCH01202) {
		_XCH01202 = XCH01202;
	}

	public String getXCH01203() {
		return _XCH01203;
	}

	public void setXCH01203(String XCH01203) {
		_XCH01203 = XCH01203;
	}

	public String getXCH01204() {
		return _XCH01204;
	}

	public void setXCH01204(String XCH01204) {
		_XCH01204 = XCH01204;
	}

	public String getXCH01205() {
		return _XCH01205;
	}

	public void setXCH01205(String XCH01205) {
		_XCH01205 = XCH01205;
	}

	public String getXCH01206() {
		return _XCH01206;
	}

	public void setXCH01206(String XCH01206) {
		_XCH01206 = XCH01206;
	}

	public String getXCH01207() {
		return _XCH01207;
	}

	public void setXCH01207(String XCH01207) {
		_XCH01207 = XCH01207;
	}

	public String getXCH01208() {
		return _XCH01208;
	}

	public void setXCH01208(String XCH01208) {
		_XCH01208 = XCH01208;
	}

	public String getXCH01209() {
		return _XCH01209;
	}

	public void setXCH01209(String XCH01209) {
		_XCH01209 = XCH01209;
	}

	public String getXCH01210() {
		return _XCH01210;
	}

	public void setXCH01210(String XCH01210) {
		_XCH01210 = XCH01210;
	}

	public String getXCH01211() {
		return _XCH01211;
	}

	public void setXCH01211(String XCH01211) {
		_XCH01211 = XCH01211;
	}

	public String getXCH01212() {
		return _XCH01212;
	}

	public void setXCH01212(String XCH01212) {
		_XCH01212 = XCH01212;
	}

	public String getXCH01213() {
		return _XCH01213;
	}

	public void setXCH01213(String XCH01213) {
		_XCH01213 = XCH01213;
	}

	public String getXCH01214() {
		return _XCH01214;
	}

	public void setXCH01214(String XCH01214) {
		_XCH01214 = XCH01214;
	}

	public String getXCH01215() {
		return _XCH01215;
	}

	public void setXCH01215(String XCH01215) {
		_XCH01215 = XCH01215;
	}

	public String getXCH01216() {
		return _XCH01216;
	}

	public void setXCH01216(String XCH01216) {
		_XCH01216 = XCH01216;
	}

	public String getXCH01217() {
		return _XCH01217;
	}

	public void setXCH01217(String XCH01217) {
		_XCH01217 = XCH01217;
	}

	public String getXCH01218() {
		return _XCH01218;
	}

	public void setXCH01218(String XCH01218) {
		_XCH01218 = XCH01218;
	}

	public String getXCH01219() {
		return _XCH01219;
	}

	public void setXCH01219(String XCH01219) {
		_XCH01219 = XCH01219;
	}

	public String getXCH01220() {
		return _XCH01220;
	}

	public void setXCH01220(String XCH01220) {
		_XCH01220 = XCH01220;
	}

	public String getXCH01221() {
		return _XCH01221;
	}

	public void setXCH01221(String XCH01221) {
		_XCH01221 = XCH01221;
	}

	public String getXCH01222() {
		return _XCH01222;
	}

	public void setXCH01222(String XCH01222) {
		_XCH01222 = XCH01222;
	}

	public String getXCH01223() {
		return _XCH01223;
	}

	public void setXCH01223(String XCH01223) {
		_XCH01223 = XCH01223;
	}

	public String getXCH01224() {
		return _XCH01224;
	}

	public void setXCH01224(String XCH01224) {
		_XCH01224 = XCH01224;
	}

	public String getXCH01225() {
		return _XCH01225;
	}

	public void setXCH01225(String XCH01225) {
		_XCH01225 = XCH01225;
	}

	public String getXCH01226() {
		return _XCH01226;
	}

	public void setXCH01226(String XCH01226) {
		_XCH01226 = XCH01226;
	}

	public String getXCH01227() {
		return _XCH01227;
	}

	public void setXCH01227(String XCH01227) {
		_XCH01227 = XCH01227;
	}

	public String getXCH01228() {
		return _XCH01228;
	}

	public void setXCH01228(String XCH01228) {
		_XCH01228 = XCH01228;
	}

	public String getXCH01229() {
		return _XCH01229;
	}

	public void setXCH01229(String XCH01229) {
		_XCH01229 = XCH01229;
	}

	public String getXCH01230() {
		return _XCH01230;
	}

	public void setXCH01230(String XCH01230) {
		_XCH01230 = XCH01230;
	}

	public String getXCH01231() {
		return _XCH01231;
	}

	public void setXCH01231(String XCH01231) {
		_XCH01231 = XCH01231;
	}

	public String getXCH01232() {
		return _XCH01232;
	}

	public void setXCH01232(String XCH01232) {
		_XCH01232 = XCH01232;
	}

	public String getXCH01233() {
		return _XCH01233;
	}

	public void setXCH01233(String XCH01233) {
		_XCH01233 = XCH01233;
	}

	public String getXCH01234() {
		return _XCH01234;
	}

	public void setXCH01234(String XCH01234) {
		_XCH01234 = XCH01234;
	}

	public String getXCH01235() {
		return _XCH01235;
	}

	public void setXCH01235(String XCH01235) {
		_XCH01235 = XCH01235;
	}

	public String getXCH01236() {
		return _XCH01236;
	}

	public void setXCH01236(String XCH01236) {
		_XCH01236 = XCH01236;
	}

	public String getXCH01237() {
		return _XCH01237;
	}

	public void setXCH01237(String XCH01237) {
		_XCH01237 = XCH01237;
	}

	public String getXCH01238() {
		return _XCH01238;
	}

	public void setXCH01238(String XCH01238) {
		_XCH01238 = XCH01238;
	}

	public String getXCH01239() {
		return _XCH01239;
	}

	public void setXCH01239(String XCH01239) {
		_XCH01239 = XCH01239;
	}

	public String getXCH01240() {
		return _XCH01240;
	}

	public void setXCH01240(String XCH01240) {
		_XCH01240 = XCH01240;
	}

	public String getXCH01241() {
		return _XCH01241;
	}

	public void setXCH01241(String XCH01241) {
		_XCH01241 = XCH01241;
	}

	public String getXCH01242() {
		return _XCH01242;
	}

	public void setXCH01242(String XCH01242) {
		_XCH01242 = XCH01242;
	}

	public String getXCH01243() {
		return _XCH01243;
	}

	public void setXCH01243(String XCH01243) {
		_XCH01243 = XCH01243;
	}

	public String getXCH01244() {
		return _XCH01244;
	}

	public void setXCH01244(String XCH01244) {
		_XCH01244 = XCH01244;
	}

	public String getXCH01245() {
		return _XCH01245;
	}

	public void setXCH01245(String XCH01245) {
		_XCH01245 = XCH01245;
	}

	public String getXCH01246() {
		return _XCH01246;
	}

	public void setXCH01246(String XCH01246) {
		_XCH01246 = XCH01246;
	}

	public String getXCH01247() {
		return _XCH01247;
	}

	public void setXCH01247(String XCH01247) {
		_XCH01247 = XCH01247;
	}

	public String getXCH01248() {
		return _XCH01248;
	}

	public void setXCH01248(String XCH01248) {
		_XCH01248 = XCH01248;
	}

	public String getXCH01249() {
		return _XCH01249;
	}

	public void setXCH01249(String XCH01249) {
		_XCH01249 = XCH01249;
	}

	public String getXCH01250() {
		return _XCH01250;
	}

	public void setXCH01250(String XCH01250) {
		_XCH01250 = XCH01250;
	}

	public String getXCH01251() {
		return _XCH01251;
	}

	public void setXCH01251(String XCH01251) {
		_XCH01251 = XCH01251;
	}

	public String getXCH01252() {
		return _XCH01252;
	}

	public void setXCH01252(String XCH01252) {
		_XCH01252 = XCH01252;
	}

	public String getXCH01253() {
		return _XCH01253;
	}

	public void setXCH01253(String XCH01253) {
		_XCH01253 = XCH01253;
	}

	public String getXCH01254() {
		return _XCH01254;
	}

	public void setXCH01254(String XCH01254) {
		_XCH01254 = XCH01254;
	}

	public String getXCH01255() {
		return _XCH01255;
	}

	public void setXCH01255(String XCH01255) {
		_XCH01255 = XCH01255;
	}

	public String getXCH01256() {
		return _XCH01256;
	}

	public void setXCH01256(String XCH01256) {
		_XCH01256 = XCH01256;
	}

	public String getXCH01257() {
		return _XCH01257;
	}

	public void setXCH01257(String XCH01257) {
		_XCH01257 = XCH01257;
	}

	public String getXCH01258() {
		return _XCH01258;
	}

	public void setXCH01258(String XCH01258) {
		_XCH01258 = XCH01258;
	}

	public String getXCH01259() {
		return _XCH01259;
	}

	public void setXCH01259(String XCH01259) {
		_XCH01259 = XCH01259;
	}

	public String getXCH01260() {
		return _XCH01260;
	}

	public void setXCH01260(String XCH01260) {
		_XCH01260 = XCH01260;
	}

	public String getXCH01261() {
		return _XCH01261;
	}

	public void setXCH01261(String XCH01261) {
		_XCH01261 = XCH01261;
	}

	public String getXCH01262() {
		return _XCH01262;
	}

	public void setXCH01262(String XCH01262) {
		_XCH01262 = XCH01262;
	}

	public String getXCH01263() {
		return _XCH01263;
	}

	public void setXCH01263(String XCH01263) {
		_XCH01263 = XCH01263;
	}

	public String getXCH01264() {
		return _XCH01264;
	}

	public void setXCH01264(String XCH01264) {
		_XCH01264 = XCH01264;
	}

	public String getXCH01265() {
		return _XCH01265;
	}

	public void setXCH01265(String XCH01265) {
		_XCH01265 = XCH01265;
	}

	public String getXCH01266() {
		return _XCH01266;
	}

	public void setXCH01266(String XCH01266) {
		_XCH01266 = XCH01266;
	}

	public String getXCH01267() {
		return _XCH01267;
	}

	public void setXCH01267(String XCH01267) {
		_XCH01267 = XCH01267;
	}

	public String getXCH01268() {
		return _XCH01268;
	}

	public void setXCH01268(String XCH01268) {
		_XCH01268 = XCH01268;
	}

	public String getXCH01269() {
		return _XCH01269;
	}

	public void setXCH01269(String XCH01269) {
		_XCH01269 = XCH01269;
	}

	public String getXCH01270() {
		return _XCH01270;
	}

	public void setXCH01270(String XCH01270) {
		_XCH01270 = XCH01270;
	}

	public String getXCH01271() {
		return _XCH01271;
	}

	public void setXCH01271(String XCH01271) {
		_XCH01271 = XCH01271;
	}

	public String getXCH01272() {
		return _XCH01272;
	}

	public void setXCH01272(String XCH01272) {
		_XCH01272 = XCH01272;
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
	private String _XCH01001;
	private String _XCH01002;
	private String _XCH01003;
	private String _XCH01004;
	private String _XCH01005;
	private String _XCH01006;
	private String _XCH01007;
	private String _XCH01008;
	private String _XCH01009;
	private String _XCH01010;
	private String _XCH01011;
	private String _XCH01012;
	private String _XCH01013;
	private String _XCH01014;
	private String _XCH01016;
	private String _XCH01017;
	private String _XCH01019;
	private String _XCH01020;
	private String _XCH01021;
	private String _XCH01022;
	private String _XCH01024;
	private String _XCH01025;
	private String _XCH01026;
	private String _XCH01027;
	private String _XCH01028;
	private String _XCH01030;
	private String _XCH01031;
	private String _XCH01032;
	private String _XCH01033;
	private String _XCH01034;
	private String _XCH01035;
	private String _XCH01036;
	private String _XCH01037;
	private String _XCH01038;
	private String _XCH01039;
	private String _XCH01040;
	private String _XCH01041;
	private String _XCH01042;
	private String _XCH01043;
	private String _XCH01044;
	private String _XCH01045;
	private String _XCH01046;
	private String _XCH01047;
	private String _XCH01049;
	private String _XCH01050;
	private String _XCH01051;
	private String _XCH01052;
	private String _XCH01053;
	private String _XCH01054;
	private String _XCH01055;
	private String _XCH01056;
	private String _XCH01057;
	private String _XCH01058;
	private String _XCH01059;
	private String _XCH01060;
	private String _XCH01062;
	private String _XCH01063;
	private String _XCH01064;
	private String _XCH01065;
	private String _XCH01066;
	private String _XCH01067;
	private String _XCH01068;
	private String _XCH01069;
	private String _XCH01100;
	private String _XCH01101;
	private String _XCH01102;
	private String _XCH01103;
	private String _XCH01104;
	private String _XCH01105;
	private String _XCH01106;
	private String _XCH01107;
	private String _XCH01108;
	private String _XCH01109;
	private String _XCH01110;
	private String _XCH01111;
	private String _XCH01112;
	private String _XCH01113;
	private String _XCH01114;
	private String _XCH01115;
	private String _XCH01116;
	private String _XCH01117;
	private String _XCH01118;
	private String _XCH01119;
	private String _XCH01120;
	private String _XCH01121;
	private String _XCH01122;
	private String _XCH01123;
	private String _XCH01124;
	private String _XCH01125;
	private String _XCH01126;
	private String _XCH01127;
	private String _XCH01128;
	private String _XCH01129;
	private String _XCH01130;
	private String _XCH01131;
	private String _XCH01132;
	private String _XCH01133;
	private String _XCH01134;
	private String _XCH01135;
	private String _XCH01136;
	private String _XCH01137;
	private String _XCH01138;
	private String _XCH01139;
	private String _XCH01140;
	private String _XCH01141;
	private String _XCH01142;
	private String _XCH01143;
	private String _XCH01144;
	private String _XCH01145;
	private String _XCH01146;
	private String _XCH01147;
	private String _XCH01148;
	private String _XCH01149;
	private String _XCH01150;
	private String _XCH01151;
	private String _XCH01152;
	private String _XCH01153;
	private String _XCH01154;
	private String _XCH01155;
	private String _XCH01156;
	private String _XCH01157;
	private String _XCH01158;
	private String _XCH01159;
	private String _XCH01160;
	private String _XCH01161;
	private String _XCH01162;
	private String _XCH01163;
	private String _XCH01164;
	private String _XCH01165;
	private String _XCH01166;
	private String _XCH01167;
	private String _XCH01168;
	private String _XCH01169;
	private String _XCH01170;
	private String _XCH01171;
	private String _XCH01172;
	private String _XCH01173;
	private String _XCH01174;
	private String _XCH01175;
	private String _XCH01176;
	private String _XCH01177;
	private String _XCH01178;
	private String _XCH01179;
	private String _XCH01180;
	private String _XCH01181;
	private String _XCH01182;
	private String _XCH01183;
	private String _XCH01184;
	private String _XCH01185;
	private String _XCH01186;
	private String _XCH01187;
	private String _XCH01188;
	private String _XCH01189;
	private String _XCH01190;
	private String _XCH01191;
	private String _XCH01192;
	private String _XCH01193;
	private String _XCH01194;
	private String _XCH01195;
	private String _XCH01196;
	private String _XCH01197;
	private String _XCH01198;
	private String _XCH01199;
	private String _XCH01200;
	private String _XCH01201;
	private String _XCH01202;
	private String _XCH01203;
	private String _XCH01204;
	private String _XCH01205;
	private String _XCH01206;
	private String _XCH01207;
	private String _XCH01208;
	private String _XCH01209;
	private String _XCH01210;
	private String _XCH01211;
	private String _XCH01212;
	private String _XCH01213;
	private String _XCH01214;
	private String _XCH01215;
	private String _XCH01216;
	private String _XCH01217;
	private String _XCH01218;
	private String _XCH01219;
	private String _XCH01220;
	private String _XCH01221;
	private String _XCH01222;
	private String _XCH01223;
	private String _XCH01224;
	private String _XCH01225;
	private String _XCH01226;
	private String _XCH01227;
	private String _XCH01228;
	private String _XCH01229;
	private String _XCH01230;
	private String _XCH01231;
	private String _XCH01232;
	private String _XCH01233;
	private String _XCH01234;
	private String _XCH01235;
	private String _XCH01236;
	private String _XCH01237;
	private String _XCH01238;
	private String _XCH01239;
	private String _XCH01240;
	private String _XCH01241;
	private String _XCH01242;
	private String _XCH01243;
	private String _XCH01244;
	private String _XCH01245;
	private String _XCH01246;
	private String _XCH01247;
	private String _XCH01248;
	private String _XCH01249;
	private String _XCH01250;
	private String _XCH01251;
	private String _XCH01252;
	private String _XCH01253;
	private String _XCH01254;
	private String _XCH01255;
	private String _XCH01256;
	private String _XCH01257;
	private String _XCH01258;
	private String _XCH01259;
	private String _XCH01260;
	private String _XCH01261;
	private String _XCH01262;
	private String _XCH01263;
	private String _XCH01264;
	private String _XCH01265;
	private String _XCH01266;
	private String _XCH01267;
	private String _XCH01268;
	private String _XCH01269;
	private String _XCH01270;
	private String _XCH01271;
	private String _XCH01272;
	private Date _modifyDate;
	private Date _syncDate;
}