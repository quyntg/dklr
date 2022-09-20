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
public class VRTechnicalSpec_LKXMYSoap implements Serializable {
	public static VRTechnicalSpec_LKXMYSoap toSoapModel(
		VRTechnicalSpec_LKXMY model) {
		VRTechnicalSpec_LKXMYSoap soapModel = new VRTechnicalSpec_LKXMYSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setConvertAssembleId(model.getConvertAssembleId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setReferenceUid(model.getReferenceUid());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDeliverableCode(model.getDeliverableCode());
		soapModel.setVehicleTypeCertificateId(model.getVehicleTypeCertificateId());
		soapModel.setXMY01001(model.getXMY01001());
		soapModel.setXMY01002(model.getXMY01002());
		soapModel.setXMY01003(model.getXMY01003());
		soapModel.setXMY01004(model.getXMY01004());
		soapModel.setXMY01005(model.getXMY01005());
		soapModel.setXMY01006(model.getXMY01006());
		soapModel.setXMY01007(model.getXMY01007());
		soapModel.setXMY01008(model.getXMY01008());
		soapModel.setXMY01009(model.getXMY01009());
		soapModel.setXMY01010(model.getXMY01010());
		soapModel.setXMY01011(model.getXMY01011());
		soapModel.setXMY01012(model.getXMY01012());
		soapModel.setXMY01013(model.getXMY01013());
		soapModel.setXMY01014(model.getXMY01014());
		soapModel.setXMY01016(model.getXMY01016());
		soapModel.setXMY01017(model.getXMY01017());
		soapModel.setXMY01019(model.getXMY01019());
		soapModel.setXMY01020(model.getXMY01020());
		soapModel.setXMY01021(model.getXMY01021());
		soapModel.setXMY01022(model.getXMY01022());
		soapModel.setXMY01030(model.getXMY01030());
		soapModel.setXMY01031(model.getXMY01031());
		soapModel.setXMY01032(model.getXMY01032());
		soapModel.setXMY01033(model.getXMY01033());
		soapModel.setXMY01034(model.getXMY01034());
		soapModel.setXMY01035(model.getXMY01035());
		soapModel.setXMY01036(model.getXMY01036());
		soapModel.setXMY01037(model.getXMY01037());
		soapModel.setXMY01038(model.getXMY01038());
		soapModel.setXMY01039(model.getXMY01039());
		soapModel.setXMY01040(model.getXMY01040());
		soapModel.setXMY01041(model.getXMY01041());
		soapModel.setXMY01042(model.getXMY01042());
		soapModel.setXMY01043(model.getXMY01043());
		soapModel.setXMY01044(model.getXMY01044());
		soapModel.setXMY01045(model.getXMY01045());
		soapModel.setXMY01046(model.getXMY01046());
		soapModel.setXMY01047(model.getXMY01047());
		soapModel.setXMY01050(model.getXMY01050());
		soapModel.setXMY01051(model.getXMY01051());
		soapModel.setXMY01052(model.getXMY01052());
		soapModel.setXMY01053(model.getXMY01053());
		soapModel.setXMY01054(model.getXMY01054());
		soapModel.setXMY01055(model.getXMY01055());
		soapModel.setXMY01056(model.getXMY01056());
		soapModel.setXMY01057(model.getXMY01057());
		soapModel.setXMY01058(model.getXMY01058());
		soapModel.setXMY01059(model.getXMY01059());
		soapModel.setXMY01060(model.getXMY01060());
		soapModel.setXMY01062(model.getXMY01062());
		soapModel.setXMY01063(model.getXMY01063());
		soapModel.setXMY01064(model.getXMY01064());
		soapModel.setXMY01065(model.getXMY01065());
		soapModel.setLKXMY01050(model.getLKXMY01050());
		soapModel.setLKXMY01051(model.getLKXMY01051());
		soapModel.setLKXMY01052(model.getLKXMY01052());
		soapModel.setLKXMY01053(model.getLKXMY01053());
		soapModel.setLKXMY01026(model.getLKXMY01026());
		soapModel.setLKXMY0401(model.getLKXMY0401());
		soapModel.setLKXMY0402(model.getLKXMY0402());
		soapModel.setLKXMY0403(model.getLKXMY0403());
		soapModel.setLKXMY0404(model.getLKXMY0404());
		soapModel.setLKXMY0405(model.getLKXMY0405());
		soapModel.setLKXMY0406(model.getLKXMY0406());
		soapModel.setLKXMY1307(model.getLKXMY1307());
		soapModel.setLKXMY1308(model.getLKXMY1308());
		soapModel.setLKXMY1309(model.getLKXMY1309());
		soapModel.setLKXMY1310(model.getLKXMY1310());
		soapModel.setLKXMY1311(model.getLKXMY1311());
		soapModel.setLKXMY1312(model.getLKXMY1312());
		soapModel.setLKXMY1207(model.getLKXMY1207());
		soapModel.setLKXMY1208(model.getLKXMY1208());
		soapModel.setLKXMY1209(model.getLKXMY1209());
		soapModel.setLKXMY1210(model.getLKXMY1210());
		soapModel.setLKXMY1211(model.getLKXMY1211());
		soapModel.setLKXMY0201(model.getLKXMY0201());
		soapModel.setLKXMY0202(model.getLKXMY0202());
		soapModel.setLKXMY0203(model.getLKXMY0203());
		soapModel.setLKXMY0204(model.getLKXMY0204());
		soapModel.setLKXMY0205(model.getLKXMY0205());
		soapModel.setLKXMY0206(model.getLKXMY0206());
		soapModel.setLKXMY0207(model.getLKXMY0207());
		soapModel.setLKXMY0208(model.getLKXMY0208());
		soapModel.setLKXMY0209(model.getLKXMY0209());
		soapModel.setLKXMY0210(model.getLKXMY0210());
		soapModel.setLKXMY0211(model.getLKXMY0211());
		soapModel.setLKXMY0212(model.getLKXMY0212());
		soapModel.setLKXMY0213(model.getLKXMY0213());
		soapModel.setLKXMY0214(model.getLKXMY0214());
		soapModel.setLKXMY0215(model.getLKXMY0215());
		soapModel.setLKXMY0216(model.getLKXMY0216());
		soapModel.setLKXMY0217(model.getLKXMY0217());
		soapModel.setLKXMY0218(model.getLKXMY0218());
		soapModel.setLKXMY0219(model.getLKXMY0219());
		soapModel.setLKXMY0040(model.getLKXMY0040());
		soapModel.setLKXMY0041(model.getLKXMY0041());
		soapModel.setLKXMY0042(model.getLKXMY0042());
		soapModel.setLKXMY0043(model.getLKXMY0043());
		soapModel.setLKXMY0044(model.getLKXMY0044());
		soapModel.setLKXMY0045(model.getLKXMY0045());
		soapModel.setLKXMY0046(model.getLKXMY0046());
		soapModel.setLKXMY0048(model.getLKXMY0048());
		soapModel.setLKXMY0049(model.getLKXMY0049());
		soapModel.setLKXMY0050(model.getLKXMY0050());
		soapModel.setLKXMY0051(model.getLKXMY0051());
		soapModel.setLKXMY0052(model.getLKXMY0052());
		soapModel.setLKXMY0054(model.getLKXMY0054());
		soapModel.setLKXMY0055(model.getLKXMY0055());
		soapModel.setLKXMY0056(model.getLKXMY0056());
		soapModel.setLKXMY0057(model.getLKXMY0057());
		soapModel.setLKXMY0058(model.getLKXMY0058());
		soapModel.setLKXMY0059(model.getLKXMY0059());
		soapModel.setLKXMY0060(model.getLKXMY0060());
		soapModel.setLKXMY0061(model.getLKXMY0061());
		soapModel.setLKXMY0062(model.getLKXMY0062());
		soapModel.setLKXMY0063(model.getLKXMY0063());
		soapModel.setLKXMY0109(model.getLKXMY0109());
		soapModel.setLKXMY0110(model.getLKXMY0110());
		soapModel.setLKXMY0111(model.getLKXMY0111());
		soapModel.setLKXMY0112(model.getLKXMY0112());
		soapModel.setLKXMY0113(model.getLKXMY0113());
		soapModel.setLKXMY0114(model.getLKXMY0114());
		soapModel.setLKXMY0115(model.getLKXMY0115());
		soapModel.setLKXMY0116(model.getLKXMY0116());
		soapModel.setLKXMY0117(model.getLKXMY0117());
		soapModel.setLKXMY0118(model.getLKXMY0118());
		soapModel.setLKXMY0119(model.getLKXMY0119());
		soapModel.setLKXMY0120(model.getLKXMY0120());
		soapModel.setLKXMY0121(model.getLKXMY0121());
		soapModel.setLKXMY0122(model.getLKXMY0122());
		soapModel.setLKXMY0123(model.getLKXMY0123());
		soapModel.setLKXMY0124(model.getLKXMY0124());
		soapModel.setLKXMY0125(model.getLKXMY0125());
		soapModel.setLKXMY0126(model.getLKXMY0126());
		soapModel.setLKXMY0127(model.getLKXMY0127());
		soapModel.setLKXMY0128(model.getLKXMY0128());
		soapModel.setLKXMY0129(model.getLKXMY0129());
		soapModel.setLKXMY0130(model.getLKXMY0130());
		soapModel.setLKXMY0131(model.getLKXMY0131());
		soapModel.setLKXMY0064(model.getLKXMY0064());
		soapModel.setLKXMY0132(model.getLKXMY0132());
		soapModel.setLKXMY0133(model.getLKXMY0133());
		soapModel.setLKXMY0134(model.getLKXMY0134());
		soapModel.setLKXMY0135(model.getLKXMY0135());
		soapModel.setLKXMY0136(model.getLKXMY0136());
		soapModel.setLKXMY0137(model.getLKXMY0137());
		soapModel.setLKXMY0138(model.getLKXMY0138());
		soapModel.setLKXMY0139(model.getLKXMY0139());
		soapModel.setLKXMY0140(model.getLKXMY0140());
		soapModel.setLKXMY0066(model.getLKXMY0066());
		soapModel.setLKXMY0141(model.getLKXMY0141());
		soapModel.setLKXMY0142(model.getLKXMY0142());
		soapModel.setLKXMY0143(model.getLKXMY0143());
		soapModel.setLKXMY0144(model.getLKXMY0144());
		soapModel.setLKXMY0145(model.getLKXMY0145());
		soapModel.setLKXMY0146(model.getLKXMY0146());
		soapModel.setLKXMY0147(model.getLKXMY0147());
		soapModel.setLKXMY0148(model.getLKXMY0148());
		soapModel.setLKXMY0149(model.getLKXMY0149());
		soapModel.setLKXMY0150(model.getLKXMY0150());
		soapModel.setLKXMY0153(model.getLKXMY0153());
		soapModel.setLKXMY0154(model.getLKXMY0154());
		soapModel.setLKXMY0155(model.getLKXMY0155());
		soapModel.setLKXMY0156(model.getLKXMY0156());
		soapModel.setLKXMY0157(model.getLKXMY0157());
		soapModel.setLKXMY0158(model.getLKXMY0158());
		soapModel.setLKXMY0159(model.getLKXMY0159());
		soapModel.setLKXMY0160(model.getLKXMY0160());
		soapModel.setLKXMY0151(model.getLKXMY0151());
		soapModel.setLKXMY0161(model.getLKXMY0161());
		soapModel.setLKXMY0162(model.getLKXMY0162());
		soapModel.setLKXMY0163(model.getLKXMY0163());
		soapModel.setLKXMY0164(model.getLKXMY0164());
		soapModel.setLKXMY0165(model.getLKXMY0165());
		soapModel.setLKXMY0166(model.getLKXMY0166());
		soapModel.setLKXMY0167(model.getLKXMY0167());
		soapModel.setLKXMY0168(model.getLKXMY0168());
		soapModel.setLKXMY0169(model.getLKXMY0169());
		soapModel.setLKXMY0170(model.getLKXMY0170());
		soapModel.setLKXMY0171(model.getLKXMY0171());
		soapModel.setLKXMY0172(model.getLKXMY0172());
		soapModel.setLKXMY0173(model.getLKXMY0173());
		soapModel.setLKXMY0174(model.getLKXMY0174());
		soapModel.setLKXMY0175(model.getLKXMY0175());
		soapModel.setLKXMY0176(model.getLKXMY0176());
		soapModel.setLKXMY0177(model.getLKXMY0177());
		soapModel.setLKXMY0178(model.getLKXMY0178());
		soapModel.setLKXMY0179(model.getLKXMY0179());
		soapModel.setLKXMY0407(model.getLKXMY0407());
		soapModel.setLKXMY0408(model.getLKXMY0408());
		soapModel.setLKXMY0409(model.getLKXMY0409());
		soapModel.setLKXMY0410(model.getLKXMY0410());
		soapModel.setLKXMY0412(model.getLKXMY0412());
		soapModel.setLKXMY0413(model.getLKXMY0413());
		soapModel.setLKXMY0414(model.getLKXMY0414());
		soapModel.setLKXMY0415(model.getLKXMY0415());
		soapModel.setLKXMY0416(model.getLKXMY0416());
		soapModel.setLKXMY0417(model.getLKXMY0417());
		soapModel.setLKXMY0418(model.getLKXMY0418());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRTechnicalSpec_LKXMYSoap[] toSoapModels(
		VRTechnicalSpec_LKXMY[] models) {
		VRTechnicalSpec_LKXMYSoap[] soapModels = new VRTechnicalSpec_LKXMYSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_LKXMYSoap[][] toSoapModels(
		VRTechnicalSpec_LKXMY[][] models) {
		VRTechnicalSpec_LKXMYSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRTechnicalSpec_LKXMYSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRTechnicalSpec_LKXMYSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_LKXMYSoap[] toSoapModels(
		List<VRTechnicalSpec_LKXMY> models) {
		List<VRTechnicalSpec_LKXMYSoap> soapModels = new ArrayList<VRTechnicalSpec_LKXMYSoap>(models.size());

		for (VRTechnicalSpec_LKXMY model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRTechnicalSpec_LKXMYSoap[soapModels.size()]);
	}

	public VRTechnicalSpec_LKXMYSoap() {
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

	public String getXMY01001() {
		return _XMY01001;
	}

	public void setXMY01001(String XMY01001) {
		_XMY01001 = XMY01001;
	}

	public String getXMY01002() {
		return _XMY01002;
	}

	public void setXMY01002(String XMY01002) {
		_XMY01002 = XMY01002;
	}

	public String getXMY01003() {
		return _XMY01003;
	}

	public void setXMY01003(String XMY01003) {
		_XMY01003 = XMY01003;
	}

	public String getXMY01004() {
		return _XMY01004;
	}

	public void setXMY01004(String XMY01004) {
		_XMY01004 = XMY01004;
	}

	public String getXMY01005() {
		return _XMY01005;
	}

	public void setXMY01005(String XMY01005) {
		_XMY01005 = XMY01005;
	}

	public String getXMY01006() {
		return _XMY01006;
	}

	public void setXMY01006(String XMY01006) {
		_XMY01006 = XMY01006;
	}

	public String getXMY01007() {
		return _XMY01007;
	}

	public void setXMY01007(String XMY01007) {
		_XMY01007 = XMY01007;
	}

	public String getXMY01008() {
		return _XMY01008;
	}

	public void setXMY01008(String XMY01008) {
		_XMY01008 = XMY01008;
	}

	public String getXMY01009() {
		return _XMY01009;
	}

	public void setXMY01009(String XMY01009) {
		_XMY01009 = XMY01009;
	}

	public String getXMY01010() {
		return _XMY01010;
	}

	public void setXMY01010(String XMY01010) {
		_XMY01010 = XMY01010;
	}

	public String getXMY01011() {
		return _XMY01011;
	}

	public void setXMY01011(String XMY01011) {
		_XMY01011 = XMY01011;
	}

	public String getXMY01012() {
		return _XMY01012;
	}

	public void setXMY01012(String XMY01012) {
		_XMY01012 = XMY01012;
	}

	public String getXMY01013() {
		return _XMY01013;
	}

	public void setXMY01013(String XMY01013) {
		_XMY01013 = XMY01013;
	}

	public String getXMY01014() {
		return _XMY01014;
	}

	public void setXMY01014(String XMY01014) {
		_XMY01014 = XMY01014;
	}

	public String getXMY01016() {
		return _XMY01016;
	}

	public void setXMY01016(String XMY01016) {
		_XMY01016 = XMY01016;
	}

	public String getXMY01017() {
		return _XMY01017;
	}

	public void setXMY01017(String XMY01017) {
		_XMY01017 = XMY01017;
	}

	public String getXMY01019() {
		return _XMY01019;
	}

	public void setXMY01019(String XMY01019) {
		_XMY01019 = XMY01019;
	}

	public String getXMY01020() {
		return _XMY01020;
	}

	public void setXMY01020(String XMY01020) {
		_XMY01020 = XMY01020;
	}

	public String getXMY01021() {
		return _XMY01021;
	}

	public void setXMY01021(String XMY01021) {
		_XMY01021 = XMY01021;
	}

	public String getXMY01022() {
		return _XMY01022;
	}

	public void setXMY01022(String XMY01022) {
		_XMY01022 = XMY01022;
	}

	public String getXMY01030() {
		return _XMY01030;
	}

	public void setXMY01030(String XMY01030) {
		_XMY01030 = XMY01030;
	}

	public String getXMY01031() {
		return _XMY01031;
	}

	public void setXMY01031(String XMY01031) {
		_XMY01031 = XMY01031;
	}

	public String getXMY01032() {
		return _XMY01032;
	}

	public void setXMY01032(String XMY01032) {
		_XMY01032 = XMY01032;
	}

	public String getXMY01033() {
		return _XMY01033;
	}

	public void setXMY01033(String XMY01033) {
		_XMY01033 = XMY01033;
	}

	public String getXMY01034() {
		return _XMY01034;
	}

	public void setXMY01034(String XMY01034) {
		_XMY01034 = XMY01034;
	}

	public String getXMY01035() {
		return _XMY01035;
	}

	public void setXMY01035(String XMY01035) {
		_XMY01035 = XMY01035;
	}

	public String getXMY01036() {
		return _XMY01036;
	}

	public void setXMY01036(String XMY01036) {
		_XMY01036 = XMY01036;
	}

	public String getXMY01037() {
		return _XMY01037;
	}

	public void setXMY01037(String XMY01037) {
		_XMY01037 = XMY01037;
	}

	public String getXMY01038() {
		return _XMY01038;
	}

	public void setXMY01038(String XMY01038) {
		_XMY01038 = XMY01038;
	}

	public String getXMY01039() {
		return _XMY01039;
	}

	public void setXMY01039(String XMY01039) {
		_XMY01039 = XMY01039;
	}

	public String getXMY01040() {
		return _XMY01040;
	}

	public void setXMY01040(String XMY01040) {
		_XMY01040 = XMY01040;
	}

	public String getXMY01041() {
		return _XMY01041;
	}

	public void setXMY01041(String XMY01041) {
		_XMY01041 = XMY01041;
	}

	public String getXMY01042() {
		return _XMY01042;
	}

	public void setXMY01042(String XMY01042) {
		_XMY01042 = XMY01042;
	}

	public String getXMY01043() {
		return _XMY01043;
	}

	public void setXMY01043(String XMY01043) {
		_XMY01043 = XMY01043;
	}

	public String getXMY01044() {
		return _XMY01044;
	}

	public void setXMY01044(String XMY01044) {
		_XMY01044 = XMY01044;
	}

	public String getXMY01045() {
		return _XMY01045;
	}

	public void setXMY01045(String XMY01045) {
		_XMY01045 = XMY01045;
	}

	public String getXMY01046() {
		return _XMY01046;
	}

	public void setXMY01046(String XMY01046) {
		_XMY01046 = XMY01046;
	}

	public String getXMY01047() {
		return _XMY01047;
	}

	public void setXMY01047(String XMY01047) {
		_XMY01047 = XMY01047;
	}

	public String getXMY01050() {
		return _XMY01050;
	}

	public void setXMY01050(String XMY01050) {
		_XMY01050 = XMY01050;
	}

	public String getXMY01051() {
		return _XMY01051;
	}

	public void setXMY01051(String XMY01051) {
		_XMY01051 = XMY01051;
	}

	public String getXMY01052() {
		return _XMY01052;
	}

	public void setXMY01052(String XMY01052) {
		_XMY01052 = XMY01052;
	}

	public String getXMY01053() {
		return _XMY01053;
	}

	public void setXMY01053(String XMY01053) {
		_XMY01053 = XMY01053;
	}

	public String getXMY01054() {
		return _XMY01054;
	}

	public void setXMY01054(String XMY01054) {
		_XMY01054 = XMY01054;
	}

	public String getXMY01055() {
		return _XMY01055;
	}

	public void setXMY01055(String XMY01055) {
		_XMY01055 = XMY01055;
	}

	public String getXMY01056() {
		return _XMY01056;
	}

	public void setXMY01056(String XMY01056) {
		_XMY01056 = XMY01056;
	}

	public String getXMY01057() {
		return _XMY01057;
	}

	public void setXMY01057(String XMY01057) {
		_XMY01057 = XMY01057;
	}

	public String getXMY01058() {
		return _XMY01058;
	}

	public void setXMY01058(String XMY01058) {
		_XMY01058 = XMY01058;
	}

	public String getXMY01059() {
		return _XMY01059;
	}

	public void setXMY01059(String XMY01059) {
		_XMY01059 = XMY01059;
	}

	public String getXMY01060() {
		return _XMY01060;
	}

	public void setXMY01060(String XMY01060) {
		_XMY01060 = XMY01060;
	}

	public String getXMY01062() {
		return _XMY01062;
	}

	public void setXMY01062(String XMY01062) {
		_XMY01062 = XMY01062;
	}

	public String getXMY01063() {
		return _XMY01063;
	}

	public void setXMY01063(String XMY01063) {
		_XMY01063 = XMY01063;
	}

	public String getXMY01064() {
		return _XMY01064;
	}

	public void setXMY01064(String XMY01064) {
		_XMY01064 = XMY01064;
	}

	public String getXMY01065() {
		return _XMY01065;
	}

	public void setXMY01065(String XMY01065) {
		_XMY01065 = XMY01065;
	}

	public String getLKXMY01050() {
		return _LKXMY01050;
	}

	public void setLKXMY01050(String LKXMY01050) {
		_LKXMY01050 = LKXMY01050;
	}

	public String getLKXMY01051() {
		return _LKXMY01051;
	}

	public void setLKXMY01051(String LKXMY01051) {
		_LKXMY01051 = LKXMY01051;
	}

	public String getLKXMY01052() {
		return _LKXMY01052;
	}

	public void setLKXMY01052(String LKXMY01052) {
		_LKXMY01052 = LKXMY01052;
	}

	public String getLKXMY01053() {
		return _LKXMY01053;
	}

	public void setLKXMY01053(String LKXMY01053) {
		_LKXMY01053 = LKXMY01053;
	}

	public String getLKXMY01026() {
		return _LKXMY01026;
	}

	public void setLKXMY01026(String LKXMY01026) {
		_LKXMY01026 = LKXMY01026;
	}

	public String getLKXMY0401() {
		return _LKXMY0401;
	}

	public void setLKXMY0401(String LKXMY0401) {
		_LKXMY0401 = LKXMY0401;
	}

	public String getLKXMY0402() {
		return _LKXMY0402;
	}

	public void setLKXMY0402(String LKXMY0402) {
		_LKXMY0402 = LKXMY0402;
	}

	public String getLKXMY0403() {
		return _LKXMY0403;
	}

	public void setLKXMY0403(String LKXMY0403) {
		_LKXMY0403 = LKXMY0403;
	}

	public String getLKXMY0404() {
		return _LKXMY0404;
	}

	public void setLKXMY0404(String LKXMY0404) {
		_LKXMY0404 = LKXMY0404;
	}

	public String getLKXMY0405() {
		return _LKXMY0405;
	}

	public void setLKXMY0405(String LKXMY0405) {
		_LKXMY0405 = LKXMY0405;
	}

	public String getLKXMY0406() {
		return _LKXMY0406;
	}

	public void setLKXMY0406(String LKXMY0406) {
		_LKXMY0406 = LKXMY0406;
	}

	public String getLKXMY1307() {
		return _LKXMY1307;
	}

	public void setLKXMY1307(String LKXMY1307) {
		_LKXMY1307 = LKXMY1307;
	}

	public String getLKXMY1308() {
		return _LKXMY1308;
	}

	public void setLKXMY1308(String LKXMY1308) {
		_LKXMY1308 = LKXMY1308;
	}

	public String getLKXMY1309() {
		return _LKXMY1309;
	}

	public void setLKXMY1309(String LKXMY1309) {
		_LKXMY1309 = LKXMY1309;
	}

	public String getLKXMY1310() {
		return _LKXMY1310;
	}

	public void setLKXMY1310(String LKXMY1310) {
		_LKXMY1310 = LKXMY1310;
	}

	public String getLKXMY1311() {
		return _LKXMY1311;
	}

	public void setLKXMY1311(String LKXMY1311) {
		_LKXMY1311 = LKXMY1311;
	}

	public String getLKXMY1312() {
		return _LKXMY1312;
	}

	public void setLKXMY1312(String LKXMY1312) {
		_LKXMY1312 = LKXMY1312;
	}

	public String getLKXMY1207() {
		return _LKXMY1207;
	}

	public void setLKXMY1207(String LKXMY1207) {
		_LKXMY1207 = LKXMY1207;
	}

	public String getLKXMY1208() {
		return _LKXMY1208;
	}

	public void setLKXMY1208(String LKXMY1208) {
		_LKXMY1208 = LKXMY1208;
	}

	public String getLKXMY1209() {
		return _LKXMY1209;
	}

	public void setLKXMY1209(String LKXMY1209) {
		_LKXMY1209 = LKXMY1209;
	}

	public String getLKXMY1210() {
		return _LKXMY1210;
	}

	public void setLKXMY1210(String LKXMY1210) {
		_LKXMY1210 = LKXMY1210;
	}

	public String getLKXMY1211() {
		return _LKXMY1211;
	}

	public void setLKXMY1211(String LKXMY1211) {
		_LKXMY1211 = LKXMY1211;
	}

	public String getLKXMY0201() {
		return _LKXMY0201;
	}

	public void setLKXMY0201(String LKXMY0201) {
		_LKXMY0201 = LKXMY0201;
	}

	public String getLKXMY0202() {
		return _LKXMY0202;
	}

	public void setLKXMY0202(String LKXMY0202) {
		_LKXMY0202 = LKXMY0202;
	}

	public String getLKXMY0203() {
		return _LKXMY0203;
	}

	public void setLKXMY0203(String LKXMY0203) {
		_LKXMY0203 = LKXMY0203;
	}

	public String getLKXMY0204() {
		return _LKXMY0204;
	}

	public void setLKXMY0204(String LKXMY0204) {
		_LKXMY0204 = LKXMY0204;
	}

	public String getLKXMY0205() {
		return _LKXMY0205;
	}

	public void setLKXMY0205(String LKXMY0205) {
		_LKXMY0205 = LKXMY0205;
	}

	public String getLKXMY0206() {
		return _LKXMY0206;
	}

	public void setLKXMY0206(String LKXMY0206) {
		_LKXMY0206 = LKXMY0206;
	}

	public String getLKXMY0207() {
		return _LKXMY0207;
	}

	public void setLKXMY0207(String LKXMY0207) {
		_LKXMY0207 = LKXMY0207;
	}

	public String getLKXMY0208() {
		return _LKXMY0208;
	}

	public void setLKXMY0208(String LKXMY0208) {
		_LKXMY0208 = LKXMY0208;
	}

	public String getLKXMY0209() {
		return _LKXMY0209;
	}

	public void setLKXMY0209(String LKXMY0209) {
		_LKXMY0209 = LKXMY0209;
	}

	public String getLKXMY0210() {
		return _LKXMY0210;
	}

	public void setLKXMY0210(String LKXMY0210) {
		_LKXMY0210 = LKXMY0210;
	}

	public String getLKXMY0211() {
		return _LKXMY0211;
	}

	public void setLKXMY0211(String LKXMY0211) {
		_LKXMY0211 = LKXMY0211;
	}

	public String getLKXMY0212() {
		return _LKXMY0212;
	}

	public void setLKXMY0212(String LKXMY0212) {
		_LKXMY0212 = LKXMY0212;
	}

	public String getLKXMY0213() {
		return _LKXMY0213;
	}

	public void setLKXMY0213(String LKXMY0213) {
		_LKXMY0213 = LKXMY0213;
	}

	public String getLKXMY0214() {
		return _LKXMY0214;
	}

	public void setLKXMY0214(String LKXMY0214) {
		_LKXMY0214 = LKXMY0214;
	}

	public String getLKXMY0215() {
		return _LKXMY0215;
	}

	public void setLKXMY0215(String LKXMY0215) {
		_LKXMY0215 = LKXMY0215;
	}

	public String getLKXMY0216() {
		return _LKXMY0216;
	}

	public void setLKXMY0216(String LKXMY0216) {
		_LKXMY0216 = LKXMY0216;
	}

	public String getLKXMY0217() {
		return _LKXMY0217;
	}

	public void setLKXMY0217(String LKXMY0217) {
		_LKXMY0217 = LKXMY0217;
	}

	public String getLKXMY0218() {
		return _LKXMY0218;
	}

	public void setLKXMY0218(String LKXMY0218) {
		_LKXMY0218 = LKXMY0218;
	}

	public String getLKXMY0219() {
		return _LKXMY0219;
	}

	public void setLKXMY0219(String LKXMY0219) {
		_LKXMY0219 = LKXMY0219;
	}

	public String getLKXMY0040() {
		return _LKXMY0040;
	}

	public void setLKXMY0040(String LKXMY0040) {
		_LKXMY0040 = LKXMY0040;
	}

	public String getLKXMY0041() {
		return _LKXMY0041;
	}

	public void setLKXMY0041(String LKXMY0041) {
		_LKXMY0041 = LKXMY0041;
	}

	public String getLKXMY0042() {
		return _LKXMY0042;
	}

	public void setLKXMY0042(String LKXMY0042) {
		_LKXMY0042 = LKXMY0042;
	}

	public String getLKXMY0043() {
		return _LKXMY0043;
	}

	public void setLKXMY0043(String LKXMY0043) {
		_LKXMY0043 = LKXMY0043;
	}

	public String getLKXMY0044() {
		return _LKXMY0044;
	}

	public void setLKXMY0044(String LKXMY0044) {
		_LKXMY0044 = LKXMY0044;
	}

	public String getLKXMY0045() {
		return _LKXMY0045;
	}

	public void setLKXMY0045(String LKXMY0045) {
		_LKXMY0045 = LKXMY0045;
	}

	public String getLKXMY0046() {
		return _LKXMY0046;
	}

	public void setLKXMY0046(String LKXMY0046) {
		_LKXMY0046 = LKXMY0046;
	}

	public String getLKXMY0048() {
		return _LKXMY0048;
	}

	public void setLKXMY0048(String LKXMY0048) {
		_LKXMY0048 = LKXMY0048;
	}

	public String getLKXMY0049() {
		return _LKXMY0049;
	}

	public void setLKXMY0049(String LKXMY0049) {
		_LKXMY0049 = LKXMY0049;
	}

	public String getLKXMY0050() {
		return _LKXMY0050;
	}

	public void setLKXMY0050(String LKXMY0050) {
		_LKXMY0050 = LKXMY0050;
	}

	public String getLKXMY0051() {
		return _LKXMY0051;
	}

	public void setLKXMY0051(String LKXMY0051) {
		_LKXMY0051 = LKXMY0051;
	}

	public String getLKXMY0052() {
		return _LKXMY0052;
	}

	public void setLKXMY0052(String LKXMY0052) {
		_LKXMY0052 = LKXMY0052;
	}

	public String getLKXMY0054() {
		return _LKXMY0054;
	}

	public void setLKXMY0054(String LKXMY0054) {
		_LKXMY0054 = LKXMY0054;
	}

	public String getLKXMY0055() {
		return _LKXMY0055;
	}

	public void setLKXMY0055(String LKXMY0055) {
		_LKXMY0055 = LKXMY0055;
	}

	public String getLKXMY0056() {
		return _LKXMY0056;
	}

	public void setLKXMY0056(String LKXMY0056) {
		_LKXMY0056 = LKXMY0056;
	}

	public String getLKXMY0057() {
		return _LKXMY0057;
	}

	public void setLKXMY0057(String LKXMY0057) {
		_LKXMY0057 = LKXMY0057;
	}

	public String getLKXMY0058() {
		return _LKXMY0058;
	}

	public void setLKXMY0058(String LKXMY0058) {
		_LKXMY0058 = LKXMY0058;
	}

	public String getLKXMY0059() {
		return _LKXMY0059;
	}

	public void setLKXMY0059(String LKXMY0059) {
		_LKXMY0059 = LKXMY0059;
	}

	public String getLKXMY0060() {
		return _LKXMY0060;
	}

	public void setLKXMY0060(String LKXMY0060) {
		_LKXMY0060 = LKXMY0060;
	}

	public String getLKXMY0061() {
		return _LKXMY0061;
	}

	public void setLKXMY0061(String LKXMY0061) {
		_LKXMY0061 = LKXMY0061;
	}

	public String getLKXMY0062() {
		return _LKXMY0062;
	}

	public void setLKXMY0062(String LKXMY0062) {
		_LKXMY0062 = LKXMY0062;
	}

	public String getLKXMY0063() {
		return _LKXMY0063;
	}

	public void setLKXMY0063(String LKXMY0063) {
		_LKXMY0063 = LKXMY0063;
	}

	public String getLKXMY0109() {
		return _LKXMY0109;
	}

	public void setLKXMY0109(String LKXMY0109) {
		_LKXMY0109 = LKXMY0109;
	}

	public String getLKXMY0110() {
		return _LKXMY0110;
	}

	public void setLKXMY0110(String LKXMY0110) {
		_LKXMY0110 = LKXMY0110;
	}

	public String getLKXMY0111() {
		return _LKXMY0111;
	}

	public void setLKXMY0111(String LKXMY0111) {
		_LKXMY0111 = LKXMY0111;
	}

	public String getLKXMY0112() {
		return _LKXMY0112;
	}

	public void setLKXMY0112(String LKXMY0112) {
		_LKXMY0112 = LKXMY0112;
	}

	public String getLKXMY0113() {
		return _LKXMY0113;
	}

	public void setLKXMY0113(String LKXMY0113) {
		_LKXMY0113 = LKXMY0113;
	}

	public String getLKXMY0114() {
		return _LKXMY0114;
	}

	public void setLKXMY0114(String LKXMY0114) {
		_LKXMY0114 = LKXMY0114;
	}

	public String getLKXMY0115() {
		return _LKXMY0115;
	}

	public void setLKXMY0115(String LKXMY0115) {
		_LKXMY0115 = LKXMY0115;
	}

	public String getLKXMY0116() {
		return _LKXMY0116;
	}

	public void setLKXMY0116(String LKXMY0116) {
		_LKXMY0116 = LKXMY0116;
	}

	public String getLKXMY0117() {
		return _LKXMY0117;
	}

	public void setLKXMY0117(String LKXMY0117) {
		_LKXMY0117 = LKXMY0117;
	}

	public String getLKXMY0118() {
		return _LKXMY0118;
	}

	public void setLKXMY0118(String LKXMY0118) {
		_LKXMY0118 = LKXMY0118;
	}

	public String getLKXMY0119() {
		return _LKXMY0119;
	}

	public void setLKXMY0119(String LKXMY0119) {
		_LKXMY0119 = LKXMY0119;
	}

	public String getLKXMY0120() {
		return _LKXMY0120;
	}

	public void setLKXMY0120(String LKXMY0120) {
		_LKXMY0120 = LKXMY0120;
	}

	public String getLKXMY0121() {
		return _LKXMY0121;
	}

	public void setLKXMY0121(String LKXMY0121) {
		_LKXMY0121 = LKXMY0121;
	}

	public String getLKXMY0122() {
		return _LKXMY0122;
	}

	public void setLKXMY0122(String LKXMY0122) {
		_LKXMY0122 = LKXMY0122;
	}

	public String getLKXMY0123() {
		return _LKXMY0123;
	}

	public void setLKXMY0123(String LKXMY0123) {
		_LKXMY0123 = LKXMY0123;
	}

	public String getLKXMY0124() {
		return _LKXMY0124;
	}

	public void setLKXMY0124(String LKXMY0124) {
		_LKXMY0124 = LKXMY0124;
	}

	public String getLKXMY0125() {
		return _LKXMY0125;
	}

	public void setLKXMY0125(String LKXMY0125) {
		_LKXMY0125 = LKXMY0125;
	}

	public String getLKXMY0126() {
		return _LKXMY0126;
	}

	public void setLKXMY0126(String LKXMY0126) {
		_LKXMY0126 = LKXMY0126;
	}

	public String getLKXMY0127() {
		return _LKXMY0127;
	}

	public void setLKXMY0127(String LKXMY0127) {
		_LKXMY0127 = LKXMY0127;
	}

	public String getLKXMY0128() {
		return _LKXMY0128;
	}

	public void setLKXMY0128(String LKXMY0128) {
		_LKXMY0128 = LKXMY0128;
	}

	public String getLKXMY0129() {
		return _LKXMY0129;
	}

	public void setLKXMY0129(String LKXMY0129) {
		_LKXMY0129 = LKXMY0129;
	}

	public String getLKXMY0130() {
		return _LKXMY0130;
	}

	public void setLKXMY0130(String LKXMY0130) {
		_LKXMY0130 = LKXMY0130;
	}

	public String getLKXMY0131() {
		return _LKXMY0131;
	}

	public void setLKXMY0131(String LKXMY0131) {
		_LKXMY0131 = LKXMY0131;
	}

	public String getLKXMY0064() {
		return _LKXMY0064;
	}

	public void setLKXMY0064(String LKXMY0064) {
		_LKXMY0064 = LKXMY0064;
	}

	public String getLKXMY0132() {
		return _LKXMY0132;
	}

	public void setLKXMY0132(String LKXMY0132) {
		_LKXMY0132 = LKXMY0132;
	}

	public String getLKXMY0133() {
		return _LKXMY0133;
	}

	public void setLKXMY0133(String LKXMY0133) {
		_LKXMY0133 = LKXMY0133;
	}

	public String getLKXMY0134() {
		return _LKXMY0134;
	}

	public void setLKXMY0134(String LKXMY0134) {
		_LKXMY0134 = LKXMY0134;
	}

	public String getLKXMY0135() {
		return _LKXMY0135;
	}

	public void setLKXMY0135(String LKXMY0135) {
		_LKXMY0135 = LKXMY0135;
	}

	public String getLKXMY0136() {
		return _LKXMY0136;
	}

	public void setLKXMY0136(String LKXMY0136) {
		_LKXMY0136 = LKXMY0136;
	}

	public String getLKXMY0137() {
		return _LKXMY0137;
	}

	public void setLKXMY0137(String LKXMY0137) {
		_LKXMY0137 = LKXMY0137;
	}

	public String getLKXMY0138() {
		return _LKXMY0138;
	}

	public void setLKXMY0138(String LKXMY0138) {
		_LKXMY0138 = LKXMY0138;
	}

	public String getLKXMY0139() {
		return _LKXMY0139;
	}

	public void setLKXMY0139(String LKXMY0139) {
		_LKXMY0139 = LKXMY0139;
	}

	public String getLKXMY0140() {
		return _LKXMY0140;
	}

	public void setLKXMY0140(String LKXMY0140) {
		_LKXMY0140 = LKXMY0140;
	}

	public String getLKXMY0066() {
		return _LKXMY0066;
	}

	public void setLKXMY0066(String LKXMY0066) {
		_LKXMY0066 = LKXMY0066;
	}

	public String getLKXMY0141() {
		return _LKXMY0141;
	}

	public void setLKXMY0141(String LKXMY0141) {
		_LKXMY0141 = LKXMY0141;
	}

	public String getLKXMY0142() {
		return _LKXMY0142;
	}

	public void setLKXMY0142(String LKXMY0142) {
		_LKXMY0142 = LKXMY0142;
	}

	public String getLKXMY0143() {
		return _LKXMY0143;
	}

	public void setLKXMY0143(String LKXMY0143) {
		_LKXMY0143 = LKXMY0143;
	}

	public String getLKXMY0144() {
		return _LKXMY0144;
	}

	public void setLKXMY0144(String LKXMY0144) {
		_LKXMY0144 = LKXMY0144;
	}

	public String getLKXMY0145() {
		return _LKXMY0145;
	}

	public void setLKXMY0145(String LKXMY0145) {
		_LKXMY0145 = LKXMY0145;
	}

	public String getLKXMY0146() {
		return _LKXMY0146;
	}

	public void setLKXMY0146(String LKXMY0146) {
		_LKXMY0146 = LKXMY0146;
	}

	public String getLKXMY0147() {
		return _LKXMY0147;
	}

	public void setLKXMY0147(String LKXMY0147) {
		_LKXMY0147 = LKXMY0147;
	}

	public String getLKXMY0148() {
		return _LKXMY0148;
	}

	public void setLKXMY0148(String LKXMY0148) {
		_LKXMY0148 = LKXMY0148;
	}

	public String getLKXMY0149() {
		return _LKXMY0149;
	}

	public void setLKXMY0149(String LKXMY0149) {
		_LKXMY0149 = LKXMY0149;
	}

	public String getLKXMY0150() {
		return _LKXMY0150;
	}

	public void setLKXMY0150(String LKXMY0150) {
		_LKXMY0150 = LKXMY0150;
	}

	public String getLKXMY0153() {
		return _LKXMY0153;
	}

	public void setLKXMY0153(String LKXMY0153) {
		_LKXMY0153 = LKXMY0153;
	}

	public String getLKXMY0154() {
		return _LKXMY0154;
	}

	public void setLKXMY0154(String LKXMY0154) {
		_LKXMY0154 = LKXMY0154;
	}

	public String getLKXMY0155() {
		return _LKXMY0155;
	}

	public void setLKXMY0155(String LKXMY0155) {
		_LKXMY0155 = LKXMY0155;
	}

	public String getLKXMY0156() {
		return _LKXMY0156;
	}

	public void setLKXMY0156(String LKXMY0156) {
		_LKXMY0156 = LKXMY0156;
	}

	public String getLKXMY0157() {
		return _LKXMY0157;
	}

	public void setLKXMY0157(String LKXMY0157) {
		_LKXMY0157 = LKXMY0157;
	}

	public String getLKXMY0158() {
		return _LKXMY0158;
	}

	public void setLKXMY0158(String LKXMY0158) {
		_LKXMY0158 = LKXMY0158;
	}

	public String getLKXMY0159() {
		return _LKXMY0159;
	}

	public void setLKXMY0159(String LKXMY0159) {
		_LKXMY0159 = LKXMY0159;
	}

	public String getLKXMY0160() {
		return _LKXMY0160;
	}

	public void setLKXMY0160(String LKXMY0160) {
		_LKXMY0160 = LKXMY0160;
	}

	public String getLKXMY0151() {
		return _LKXMY0151;
	}

	public void setLKXMY0151(String LKXMY0151) {
		_LKXMY0151 = LKXMY0151;
	}

	public String getLKXMY0161() {
		return _LKXMY0161;
	}

	public void setLKXMY0161(String LKXMY0161) {
		_LKXMY0161 = LKXMY0161;
	}

	public String getLKXMY0162() {
		return _LKXMY0162;
	}

	public void setLKXMY0162(String LKXMY0162) {
		_LKXMY0162 = LKXMY0162;
	}

	public String getLKXMY0163() {
		return _LKXMY0163;
	}

	public void setLKXMY0163(String LKXMY0163) {
		_LKXMY0163 = LKXMY0163;
	}

	public String getLKXMY0164() {
		return _LKXMY0164;
	}

	public void setLKXMY0164(String LKXMY0164) {
		_LKXMY0164 = LKXMY0164;
	}

	public String getLKXMY0165() {
		return _LKXMY0165;
	}

	public void setLKXMY0165(String LKXMY0165) {
		_LKXMY0165 = LKXMY0165;
	}

	public String getLKXMY0166() {
		return _LKXMY0166;
	}

	public void setLKXMY0166(String LKXMY0166) {
		_LKXMY0166 = LKXMY0166;
	}

	public String getLKXMY0167() {
		return _LKXMY0167;
	}

	public void setLKXMY0167(String LKXMY0167) {
		_LKXMY0167 = LKXMY0167;
	}

	public String getLKXMY0168() {
		return _LKXMY0168;
	}

	public void setLKXMY0168(String LKXMY0168) {
		_LKXMY0168 = LKXMY0168;
	}

	public String getLKXMY0169() {
		return _LKXMY0169;
	}

	public void setLKXMY0169(String LKXMY0169) {
		_LKXMY0169 = LKXMY0169;
	}

	public String getLKXMY0170() {
		return _LKXMY0170;
	}

	public void setLKXMY0170(String LKXMY0170) {
		_LKXMY0170 = LKXMY0170;
	}

	public String getLKXMY0171() {
		return _LKXMY0171;
	}

	public void setLKXMY0171(String LKXMY0171) {
		_LKXMY0171 = LKXMY0171;
	}

	public String getLKXMY0172() {
		return _LKXMY0172;
	}

	public void setLKXMY0172(String LKXMY0172) {
		_LKXMY0172 = LKXMY0172;
	}

	public String getLKXMY0173() {
		return _LKXMY0173;
	}

	public void setLKXMY0173(String LKXMY0173) {
		_LKXMY0173 = LKXMY0173;
	}

	public String getLKXMY0174() {
		return _LKXMY0174;
	}

	public void setLKXMY0174(String LKXMY0174) {
		_LKXMY0174 = LKXMY0174;
	}

	public String getLKXMY0175() {
		return _LKXMY0175;
	}

	public void setLKXMY0175(String LKXMY0175) {
		_LKXMY0175 = LKXMY0175;
	}

	public String getLKXMY0176() {
		return _LKXMY0176;
	}

	public void setLKXMY0176(String LKXMY0176) {
		_LKXMY0176 = LKXMY0176;
	}

	public String getLKXMY0177() {
		return _LKXMY0177;
	}

	public void setLKXMY0177(String LKXMY0177) {
		_LKXMY0177 = LKXMY0177;
	}

	public String getLKXMY0178() {
		return _LKXMY0178;
	}

	public void setLKXMY0178(String LKXMY0178) {
		_LKXMY0178 = LKXMY0178;
	}

	public String getLKXMY0179() {
		return _LKXMY0179;
	}

	public void setLKXMY0179(String LKXMY0179) {
		_LKXMY0179 = LKXMY0179;
	}

	public String getLKXMY0407() {
		return _LKXMY0407;
	}

	public void setLKXMY0407(String LKXMY0407) {
		_LKXMY0407 = LKXMY0407;
	}

	public String getLKXMY0408() {
		return _LKXMY0408;
	}

	public void setLKXMY0408(String LKXMY0408) {
		_LKXMY0408 = LKXMY0408;
	}

	public String getLKXMY0409() {
		return _LKXMY0409;
	}

	public void setLKXMY0409(String LKXMY0409) {
		_LKXMY0409 = LKXMY0409;
	}

	public String getLKXMY0410() {
		return _LKXMY0410;
	}

	public void setLKXMY0410(String LKXMY0410) {
		_LKXMY0410 = LKXMY0410;
	}

	public String getLKXMY0412() {
		return _LKXMY0412;
	}

	public void setLKXMY0412(String LKXMY0412) {
		_LKXMY0412 = LKXMY0412;
	}

	public String getLKXMY0413() {
		return _LKXMY0413;
	}

	public void setLKXMY0413(String LKXMY0413) {
		_LKXMY0413 = LKXMY0413;
	}

	public String getLKXMY0414() {
		return _LKXMY0414;
	}

	public void setLKXMY0414(String LKXMY0414) {
		_LKXMY0414 = LKXMY0414;
	}

	public String getLKXMY0415() {
		return _LKXMY0415;
	}

	public void setLKXMY0415(String LKXMY0415) {
		_LKXMY0415 = LKXMY0415;
	}

	public String getLKXMY0416() {
		return _LKXMY0416;
	}

	public void setLKXMY0416(String LKXMY0416) {
		_LKXMY0416 = LKXMY0416;
	}

	public String getLKXMY0417() {
		return _LKXMY0417;
	}

	public void setLKXMY0417(String LKXMY0417) {
		_LKXMY0417 = LKXMY0417;
	}

	public String getLKXMY0418() {
		return _LKXMY0418;
	}

	public void setLKXMY0418(String LKXMY0418) {
		_LKXMY0418 = LKXMY0418;
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
	private String _XMY01001;
	private String _XMY01002;
	private String _XMY01003;
	private String _XMY01004;
	private String _XMY01005;
	private String _XMY01006;
	private String _XMY01007;
	private String _XMY01008;
	private String _XMY01009;
	private String _XMY01010;
	private String _XMY01011;
	private String _XMY01012;
	private String _XMY01013;
	private String _XMY01014;
	private String _XMY01016;
	private String _XMY01017;
	private String _XMY01019;
	private String _XMY01020;
	private String _XMY01021;
	private String _XMY01022;
	private String _XMY01030;
	private String _XMY01031;
	private String _XMY01032;
	private String _XMY01033;
	private String _XMY01034;
	private String _XMY01035;
	private String _XMY01036;
	private String _XMY01037;
	private String _XMY01038;
	private String _XMY01039;
	private String _XMY01040;
	private String _XMY01041;
	private String _XMY01042;
	private String _XMY01043;
	private String _XMY01044;
	private String _XMY01045;
	private String _XMY01046;
	private String _XMY01047;
	private String _XMY01050;
	private String _XMY01051;
	private String _XMY01052;
	private String _XMY01053;
	private String _XMY01054;
	private String _XMY01055;
	private String _XMY01056;
	private String _XMY01057;
	private String _XMY01058;
	private String _XMY01059;
	private String _XMY01060;
	private String _XMY01062;
	private String _XMY01063;
	private String _XMY01064;
	private String _XMY01065;
	private String _LKXMY01050;
	private String _LKXMY01051;
	private String _LKXMY01052;
	private String _LKXMY01053;
	private String _LKXMY01026;
	private String _LKXMY0401;
	private String _LKXMY0402;
	private String _LKXMY0403;
	private String _LKXMY0404;
	private String _LKXMY0405;
	private String _LKXMY0406;
	private String _LKXMY1307;
	private String _LKXMY1308;
	private String _LKXMY1309;
	private String _LKXMY1310;
	private String _LKXMY1311;
	private String _LKXMY1312;
	private String _LKXMY1207;
	private String _LKXMY1208;
	private String _LKXMY1209;
	private String _LKXMY1210;
	private String _LKXMY1211;
	private String _LKXMY0201;
	private String _LKXMY0202;
	private String _LKXMY0203;
	private String _LKXMY0204;
	private String _LKXMY0205;
	private String _LKXMY0206;
	private String _LKXMY0207;
	private String _LKXMY0208;
	private String _LKXMY0209;
	private String _LKXMY0210;
	private String _LKXMY0211;
	private String _LKXMY0212;
	private String _LKXMY0213;
	private String _LKXMY0214;
	private String _LKXMY0215;
	private String _LKXMY0216;
	private String _LKXMY0217;
	private String _LKXMY0218;
	private String _LKXMY0219;
	private String _LKXMY0040;
	private String _LKXMY0041;
	private String _LKXMY0042;
	private String _LKXMY0043;
	private String _LKXMY0044;
	private String _LKXMY0045;
	private String _LKXMY0046;
	private String _LKXMY0048;
	private String _LKXMY0049;
	private String _LKXMY0050;
	private String _LKXMY0051;
	private String _LKXMY0052;
	private String _LKXMY0054;
	private String _LKXMY0055;
	private String _LKXMY0056;
	private String _LKXMY0057;
	private String _LKXMY0058;
	private String _LKXMY0059;
	private String _LKXMY0060;
	private String _LKXMY0061;
	private String _LKXMY0062;
	private String _LKXMY0063;
	private String _LKXMY0109;
	private String _LKXMY0110;
	private String _LKXMY0111;
	private String _LKXMY0112;
	private String _LKXMY0113;
	private String _LKXMY0114;
	private String _LKXMY0115;
	private String _LKXMY0116;
	private String _LKXMY0117;
	private String _LKXMY0118;
	private String _LKXMY0119;
	private String _LKXMY0120;
	private String _LKXMY0121;
	private String _LKXMY0122;
	private String _LKXMY0123;
	private String _LKXMY0124;
	private String _LKXMY0125;
	private String _LKXMY0126;
	private String _LKXMY0127;
	private String _LKXMY0128;
	private String _LKXMY0129;
	private String _LKXMY0130;
	private String _LKXMY0131;
	private String _LKXMY0064;
	private String _LKXMY0132;
	private String _LKXMY0133;
	private String _LKXMY0134;
	private String _LKXMY0135;
	private String _LKXMY0136;
	private String _LKXMY0137;
	private String _LKXMY0138;
	private String _LKXMY0139;
	private String _LKXMY0140;
	private String _LKXMY0066;
	private String _LKXMY0141;
	private String _LKXMY0142;
	private String _LKXMY0143;
	private String _LKXMY0144;
	private String _LKXMY0145;
	private String _LKXMY0146;
	private String _LKXMY0147;
	private String _LKXMY0148;
	private String _LKXMY0149;
	private String _LKXMY0150;
	private String _LKXMY0153;
	private String _LKXMY0154;
	private String _LKXMY0155;
	private String _LKXMY0156;
	private String _LKXMY0157;
	private String _LKXMY0158;
	private String _LKXMY0159;
	private String _LKXMY0160;
	private String _LKXMY0151;
	private String _LKXMY0161;
	private String _LKXMY0162;
	private String _LKXMY0163;
	private String _LKXMY0164;
	private String _LKXMY0165;
	private String _LKXMY0166;
	private String _LKXMY0167;
	private String _LKXMY0168;
	private String _LKXMY0169;
	private String _LKXMY0170;
	private String _LKXMY0171;
	private String _LKXMY0172;
	private String _LKXMY0173;
	private String _LKXMY0174;
	private String _LKXMY0175;
	private String _LKXMY0176;
	private String _LKXMY0177;
	private String _LKXMY0178;
	private String _LKXMY0179;
	private String _LKXMY0407;
	private String _LKXMY0408;
	private String _LKXMY0409;
	private String _LKXMY0410;
	private String _LKXMY0412;
	private String _LKXMY0413;
	private String _LKXMY0414;
	private String _LKXMY0415;
	private String _LKXMY0416;
	private String _LKXMY0417;
	private String _LKXMY0418;
	private Date _modifyDate;
	private Date _syncDate;
}