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
public class VRTechnicalSpec_XMYSoap implements Serializable {
	public static VRTechnicalSpec_XMYSoap toSoapModel(VRTechnicalSpec_XMY model) {
		VRTechnicalSpec_XMYSoap soapModel = new VRTechnicalSpec_XMYSoap();

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
		soapModel.setXMY01670(model.getXMY01670());
		soapModel.setXMY01671(model.getXMY01671());
		soapModel.setXMY01672(model.getXMY01672());
		soapModel.setXMY01673(model.getXMY01673());
		soapModel.setXMY01674(model.getXMY01674());
		soapModel.setXMY01675(model.getXMY01675());
		soapModel.setXMY01676(model.getXMY01676());
		soapModel.setXMY01677(model.getXMY01677());
		soapModel.setXMY01678(model.getXMY01678());
		soapModel.setXMY01679(model.getXMY01679());
		soapModel.setXMY01680(model.getXMY01680());
		soapModel.setXMY01681(model.getXMY01681());
		soapModel.setXMY01682(model.getXMY01682());
		soapModel.setXMY01683(model.getXMY01683());
		soapModel.setXMY01684(model.getXMY01684());
		soapModel.setXMY01685(model.getXMY01685());
		soapModel.setXMY01686(model.getXMY01686());
		soapModel.setXMY01687(model.getXMY01687());
		soapModel.setXMY01688(model.getXMY01688());
		soapModel.setXMY01689(model.getXMY01689());
		soapModel.setXMY01690(model.getXMY01690());
		soapModel.setXMY01691(model.getXMY01691());
		soapModel.setXMY01692(model.getXMY01692());
		soapModel.setXMY01693(model.getXMY01693());
		soapModel.setXMY01694(model.getXMY01694());
		soapModel.setXMY01695(model.getXMY01695());
		soapModel.setXMY01696(model.getXMY01696());
		soapModel.setXMY01697(model.getXMY01697());
		soapModel.setXMY01698(model.getXMY01698());
		soapModel.setXMY01699(model.getXMY01699());
		soapModel.setXMY01700(model.getXMY01700());
		soapModel.setXMY01701(model.getXMY01701());
		soapModel.setXMY01702(model.getXMY01702());
		soapModel.setXMY01703(model.getXMY01703());
		soapModel.setXMY01704(model.getXMY01704());
		soapModel.setXMY01705(model.getXMY01705());
		soapModel.setXMY01706(model.getXMY01706());
		soapModel.setXMY01707(model.getXMY01707());
		soapModel.setXMY01708(model.getXMY01708());
		soapModel.setXMY01709(model.getXMY01709());
		soapModel.setXMY01710(model.getXMY01710());
		soapModel.setXMY01711(model.getXMY01711());
		soapModel.setXMY01712(model.getXMY01712());
		soapModel.setXMY01713(model.getXMY01713());
		soapModel.setXMY01714(model.getXMY01714());
		soapModel.setXMY01715(model.getXMY01715());
		soapModel.setXMY01716(model.getXMY01716());
		soapModel.setXMY01717(model.getXMY01717());
		soapModel.setXMY01718(model.getXMY01718());
		soapModel.setXMY01719(model.getXMY01719());
		soapModel.setXMY01720(model.getXMY01720());
		soapModel.setXMY01721(model.getXMY01721());
		soapModel.setXMY01722(model.getXMY01722());
		soapModel.setXMY01723(model.getXMY01723());
		soapModel.setXMY01724(model.getXMY01724());
		soapModel.setXMY01725(model.getXMY01725());
		soapModel.setXMY01726(model.getXMY01726());
		soapModel.setXMY01729(model.getXMY01729());
		soapModel.setXMY01730(model.getXMY01730());
		soapModel.setXMY01731(model.getXMY01731());
		soapModel.setXMY01732(model.getXMY01732());
		soapModel.setXMY01733(model.getXMY01733());
		soapModel.setXMY01734(model.getXMY01734());
		soapModel.setXMY01735(model.getXMY01735());
		soapModel.setXMY01736(model.getXMY01736());
		soapModel.setXMY01737(model.getXMY01737());
		soapModel.setXMY01738(model.getXMY01738());
		soapModel.setXMY01739(model.getXMY01739());
		soapModel.setXMY01740(model.getXMY01740());
		soapModel.setXMY01741(model.getXMY01741());
		soapModel.setXMY01742(model.getXMY01742());
		soapModel.setXMY01744(model.getXMY01744());
		soapModel.setXMY01745(model.getXMY01745());
		soapModel.setXMY01746(model.getXMY01746());
		soapModel.setXMY01747(model.getXMY01747());
		soapModel.setXMY01748(model.getXMY01748());
		soapModel.setXMY01749(model.getXMY01749());
		soapModel.setXMY01758(model.getXMY01758());
		soapModel.setXMY01759(model.getXMY01759());
		soapModel.setXMY01760(model.getXMY01760());
		soapModel.setXMY01761(model.getXMY01761());
		soapModel.setXMY01762(model.getXMY01762());
		soapModel.setXMY01763(model.getXMY01763());
		soapModel.setXMY01764(model.getXMY01764());
		soapModel.setXMY01779(model.getXMY01779());
		soapModel.setXMY01780(model.getXMY01780());
		soapModel.setXMY01781(model.getXMY01781());
		soapModel.setXMY01782(model.getXMY01782());
		soapModel.setXMY01783(model.getXMY01783());
		soapModel.setXMY01785(model.getXMY01785());
		soapModel.setXMY01786(model.getXMY01786());
		soapModel.setXMY01787(model.getXMY01787());
		soapModel.setXMY01788(model.getXMY01788());
		soapModel.setXMY01789(model.getXMY01789());
		soapModel.setXMY01790(model.getXMY01790());
		soapModel.setXMY01791(model.getXMY01791());
		soapModel.setXMY01792(model.getXMY01792());
		soapModel.setXMY01793(model.getXMY01793());
		soapModel.setXMY01794(model.getXMY01794());
		soapModel.setXMY01795(model.getXMY01795());
		soapModel.setXMY01796(model.getXMY01796());
		soapModel.setXMY01797(model.getXMY01797());
		soapModel.setXMY01798(model.getXMY01798());
		soapModel.setXMY01799(model.getXMY01799());
		soapModel.setXMY01800(model.getXMY01800());
		soapModel.setXMY01801(model.getXMY01801());
		soapModel.setXMY01802(model.getXMY01802());
		soapModel.setXMY01804(model.getXMY01804());
		soapModel.setXMY01805(model.getXMY01805());
		soapModel.setXMY01806(model.getXMY01806());
		soapModel.setXMY01807(model.getXMY01807());
		soapModel.setXMY01808(model.getXMY01808());
		soapModel.setXMY01809(model.getXMY01809());
		soapModel.setXMY01810(model.getXMY01810());
		soapModel.setXMY01811(model.getXMY01811());
		soapModel.setXMY01812(model.getXMY01812());
		soapModel.setXMY01813(model.getXMY01813());
		soapModel.setXMY01814(model.getXMY01814());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRTechnicalSpec_XMYSoap[] toSoapModels(
		VRTechnicalSpec_XMY[] models) {
		VRTechnicalSpec_XMYSoap[] soapModels = new VRTechnicalSpec_XMYSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XMYSoap[][] toSoapModels(
		VRTechnicalSpec_XMY[][] models) {
		VRTechnicalSpec_XMYSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRTechnicalSpec_XMYSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRTechnicalSpec_XMYSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XMYSoap[] toSoapModels(
		List<VRTechnicalSpec_XMY> models) {
		List<VRTechnicalSpec_XMYSoap> soapModels = new ArrayList<VRTechnicalSpec_XMYSoap>(models.size());

		for (VRTechnicalSpec_XMY model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRTechnicalSpec_XMYSoap[soapModels.size()]);
	}

	public VRTechnicalSpec_XMYSoap() {
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

	public String getXMY01670() {
		return _XMY01670;
	}

	public void setXMY01670(String XMY01670) {
		_XMY01670 = XMY01670;
	}

	public String getXMY01671() {
		return _XMY01671;
	}

	public void setXMY01671(String XMY01671) {
		_XMY01671 = XMY01671;
	}

	public String getXMY01672() {
		return _XMY01672;
	}

	public void setXMY01672(String XMY01672) {
		_XMY01672 = XMY01672;
	}

	public String getXMY01673() {
		return _XMY01673;
	}

	public void setXMY01673(String XMY01673) {
		_XMY01673 = XMY01673;
	}

	public String getXMY01674() {
		return _XMY01674;
	}

	public void setXMY01674(String XMY01674) {
		_XMY01674 = XMY01674;
	}

	public String getXMY01675() {
		return _XMY01675;
	}

	public void setXMY01675(String XMY01675) {
		_XMY01675 = XMY01675;
	}

	public String getXMY01676() {
		return _XMY01676;
	}

	public void setXMY01676(String XMY01676) {
		_XMY01676 = XMY01676;
	}

	public String getXMY01677() {
		return _XMY01677;
	}

	public void setXMY01677(String XMY01677) {
		_XMY01677 = XMY01677;
	}

	public String getXMY01678() {
		return _XMY01678;
	}

	public void setXMY01678(String XMY01678) {
		_XMY01678 = XMY01678;
	}

	public String getXMY01679() {
		return _XMY01679;
	}

	public void setXMY01679(String XMY01679) {
		_XMY01679 = XMY01679;
	}

	public String getXMY01680() {
		return _XMY01680;
	}

	public void setXMY01680(String XMY01680) {
		_XMY01680 = XMY01680;
	}

	public String getXMY01681() {
		return _XMY01681;
	}

	public void setXMY01681(String XMY01681) {
		_XMY01681 = XMY01681;
	}

	public String getXMY01682() {
		return _XMY01682;
	}

	public void setXMY01682(String XMY01682) {
		_XMY01682 = XMY01682;
	}

	public String getXMY01683() {
		return _XMY01683;
	}

	public void setXMY01683(String XMY01683) {
		_XMY01683 = XMY01683;
	}

	public String getXMY01684() {
		return _XMY01684;
	}

	public void setXMY01684(String XMY01684) {
		_XMY01684 = XMY01684;
	}

	public String getXMY01685() {
		return _XMY01685;
	}

	public void setXMY01685(String XMY01685) {
		_XMY01685 = XMY01685;
	}

	public String getXMY01686() {
		return _XMY01686;
	}

	public void setXMY01686(String XMY01686) {
		_XMY01686 = XMY01686;
	}

	public String getXMY01687() {
		return _XMY01687;
	}

	public void setXMY01687(String XMY01687) {
		_XMY01687 = XMY01687;
	}

	public String getXMY01688() {
		return _XMY01688;
	}

	public void setXMY01688(String XMY01688) {
		_XMY01688 = XMY01688;
	}

	public String getXMY01689() {
		return _XMY01689;
	}

	public void setXMY01689(String XMY01689) {
		_XMY01689 = XMY01689;
	}

	public String getXMY01690() {
		return _XMY01690;
	}

	public void setXMY01690(String XMY01690) {
		_XMY01690 = XMY01690;
	}

	public String getXMY01691() {
		return _XMY01691;
	}

	public void setXMY01691(String XMY01691) {
		_XMY01691 = XMY01691;
	}

	public String getXMY01692() {
		return _XMY01692;
	}

	public void setXMY01692(String XMY01692) {
		_XMY01692 = XMY01692;
	}

	public String getXMY01693() {
		return _XMY01693;
	}

	public void setXMY01693(String XMY01693) {
		_XMY01693 = XMY01693;
	}

	public String getXMY01694() {
		return _XMY01694;
	}

	public void setXMY01694(String XMY01694) {
		_XMY01694 = XMY01694;
	}

	public String getXMY01695() {
		return _XMY01695;
	}

	public void setXMY01695(String XMY01695) {
		_XMY01695 = XMY01695;
	}

	public String getXMY01696() {
		return _XMY01696;
	}

	public void setXMY01696(String XMY01696) {
		_XMY01696 = XMY01696;
	}

	public String getXMY01697() {
		return _XMY01697;
	}

	public void setXMY01697(String XMY01697) {
		_XMY01697 = XMY01697;
	}

	public String getXMY01698() {
		return _XMY01698;
	}

	public void setXMY01698(String XMY01698) {
		_XMY01698 = XMY01698;
	}

	public String getXMY01699() {
		return _XMY01699;
	}

	public void setXMY01699(String XMY01699) {
		_XMY01699 = XMY01699;
	}

	public String getXMY01700() {
		return _XMY01700;
	}

	public void setXMY01700(String XMY01700) {
		_XMY01700 = XMY01700;
	}

	public String getXMY01701() {
		return _XMY01701;
	}

	public void setXMY01701(String XMY01701) {
		_XMY01701 = XMY01701;
	}

	public String getXMY01702() {
		return _XMY01702;
	}

	public void setXMY01702(String XMY01702) {
		_XMY01702 = XMY01702;
	}

	public String getXMY01703() {
		return _XMY01703;
	}

	public void setXMY01703(String XMY01703) {
		_XMY01703 = XMY01703;
	}

	public String getXMY01704() {
		return _XMY01704;
	}

	public void setXMY01704(String XMY01704) {
		_XMY01704 = XMY01704;
	}

	public String getXMY01705() {
		return _XMY01705;
	}

	public void setXMY01705(String XMY01705) {
		_XMY01705 = XMY01705;
	}

	public String getXMY01706() {
		return _XMY01706;
	}

	public void setXMY01706(String XMY01706) {
		_XMY01706 = XMY01706;
	}

	public String getXMY01707() {
		return _XMY01707;
	}

	public void setXMY01707(String XMY01707) {
		_XMY01707 = XMY01707;
	}

	public String getXMY01708() {
		return _XMY01708;
	}

	public void setXMY01708(String XMY01708) {
		_XMY01708 = XMY01708;
	}

	public String getXMY01709() {
		return _XMY01709;
	}

	public void setXMY01709(String XMY01709) {
		_XMY01709 = XMY01709;
	}

	public String getXMY01710() {
		return _XMY01710;
	}

	public void setXMY01710(String XMY01710) {
		_XMY01710 = XMY01710;
	}

	public String getXMY01711() {
		return _XMY01711;
	}

	public void setXMY01711(String XMY01711) {
		_XMY01711 = XMY01711;
	}

	public String getXMY01712() {
		return _XMY01712;
	}

	public void setXMY01712(String XMY01712) {
		_XMY01712 = XMY01712;
	}

	public String getXMY01713() {
		return _XMY01713;
	}

	public void setXMY01713(String XMY01713) {
		_XMY01713 = XMY01713;
	}

	public String getXMY01714() {
		return _XMY01714;
	}

	public void setXMY01714(String XMY01714) {
		_XMY01714 = XMY01714;
	}

	public String getXMY01715() {
		return _XMY01715;
	}

	public void setXMY01715(String XMY01715) {
		_XMY01715 = XMY01715;
	}

	public String getXMY01716() {
		return _XMY01716;
	}

	public void setXMY01716(String XMY01716) {
		_XMY01716 = XMY01716;
	}

	public String getXMY01717() {
		return _XMY01717;
	}

	public void setXMY01717(String XMY01717) {
		_XMY01717 = XMY01717;
	}

	public String getXMY01718() {
		return _XMY01718;
	}

	public void setXMY01718(String XMY01718) {
		_XMY01718 = XMY01718;
	}

	public String getXMY01719() {
		return _XMY01719;
	}

	public void setXMY01719(String XMY01719) {
		_XMY01719 = XMY01719;
	}

	public String getXMY01720() {
		return _XMY01720;
	}

	public void setXMY01720(String XMY01720) {
		_XMY01720 = XMY01720;
	}

	public String getXMY01721() {
		return _XMY01721;
	}

	public void setXMY01721(String XMY01721) {
		_XMY01721 = XMY01721;
	}

	public String getXMY01722() {
		return _XMY01722;
	}

	public void setXMY01722(String XMY01722) {
		_XMY01722 = XMY01722;
	}

	public String getXMY01723() {
		return _XMY01723;
	}

	public void setXMY01723(String XMY01723) {
		_XMY01723 = XMY01723;
	}

	public String getXMY01724() {
		return _XMY01724;
	}

	public void setXMY01724(String XMY01724) {
		_XMY01724 = XMY01724;
	}

	public String getXMY01725() {
		return _XMY01725;
	}

	public void setXMY01725(String XMY01725) {
		_XMY01725 = XMY01725;
	}

	public String getXMY01726() {
		return _XMY01726;
	}

	public void setXMY01726(String XMY01726) {
		_XMY01726 = XMY01726;
	}

	public String getXMY01729() {
		return _XMY01729;
	}

	public void setXMY01729(String XMY01729) {
		_XMY01729 = XMY01729;
	}

	public String getXMY01730() {
		return _XMY01730;
	}

	public void setXMY01730(String XMY01730) {
		_XMY01730 = XMY01730;
	}

	public String getXMY01731() {
		return _XMY01731;
	}

	public void setXMY01731(String XMY01731) {
		_XMY01731 = XMY01731;
	}

	public String getXMY01732() {
		return _XMY01732;
	}

	public void setXMY01732(String XMY01732) {
		_XMY01732 = XMY01732;
	}

	public String getXMY01733() {
		return _XMY01733;
	}

	public void setXMY01733(String XMY01733) {
		_XMY01733 = XMY01733;
	}

	public String getXMY01734() {
		return _XMY01734;
	}

	public void setXMY01734(String XMY01734) {
		_XMY01734 = XMY01734;
	}

	public String getXMY01735() {
		return _XMY01735;
	}

	public void setXMY01735(String XMY01735) {
		_XMY01735 = XMY01735;
	}

	public String getXMY01736() {
		return _XMY01736;
	}

	public void setXMY01736(String XMY01736) {
		_XMY01736 = XMY01736;
	}

	public String getXMY01737() {
		return _XMY01737;
	}

	public void setXMY01737(String XMY01737) {
		_XMY01737 = XMY01737;
	}

	public String getXMY01738() {
		return _XMY01738;
	}

	public void setXMY01738(String XMY01738) {
		_XMY01738 = XMY01738;
	}

	public String getXMY01739() {
		return _XMY01739;
	}

	public void setXMY01739(String XMY01739) {
		_XMY01739 = XMY01739;
	}

	public String getXMY01740() {
		return _XMY01740;
	}

	public void setXMY01740(String XMY01740) {
		_XMY01740 = XMY01740;
	}

	public String getXMY01741() {
		return _XMY01741;
	}

	public void setXMY01741(String XMY01741) {
		_XMY01741 = XMY01741;
	}

	public String getXMY01742() {
		return _XMY01742;
	}

	public void setXMY01742(String XMY01742) {
		_XMY01742 = XMY01742;
	}

	public String getXMY01744() {
		return _XMY01744;
	}

	public void setXMY01744(String XMY01744) {
		_XMY01744 = XMY01744;
	}

	public String getXMY01745() {
		return _XMY01745;
	}

	public void setXMY01745(String XMY01745) {
		_XMY01745 = XMY01745;
	}

	public String getXMY01746() {
		return _XMY01746;
	}

	public void setXMY01746(String XMY01746) {
		_XMY01746 = XMY01746;
	}

	public String getXMY01747() {
		return _XMY01747;
	}

	public void setXMY01747(String XMY01747) {
		_XMY01747 = XMY01747;
	}

	public String getXMY01748() {
		return _XMY01748;
	}

	public void setXMY01748(String XMY01748) {
		_XMY01748 = XMY01748;
	}

	public String getXMY01749() {
		return _XMY01749;
	}

	public void setXMY01749(String XMY01749) {
		_XMY01749 = XMY01749;
	}

	public String getXMY01758() {
		return _XMY01758;
	}

	public void setXMY01758(String XMY01758) {
		_XMY01758 = XMY01758;
	}

	public String getXMY01759() {
		return _XMY01759;
	}

	public void setXMY01759(String XMY01759) {
		_XMY01759 = XMY01759;
	}

	public String getXMY01760() {
		return _XMY01760;
	}

	public void setXMY01760(String XMY01760) {
		_XMY01760 = XMY01760;
	}

	public String getXMY01761() {
		return _XMY01761;
	}

	public void setXMY01761(String XMY01761) {
		_XMY01761 = XMY01761;
	}

	public String getXMY01762() {
		return _XMY01762;
	}

	public void setXMY01762(String XMY01762) {
		_XMY01762 = XMY01762;
	}

	public String getXMY01763() {
		return _XMY01763;
	}

	public void setXMY01763(String XMY01763) {
		_XMY01763 = XMY01763;
	}

	public String getXMY01764() {
		return _XMY01764;
	}

	public void setXMY01764(String XMY01764) {
		_XMY01764 = XMY01764;
	}

	public String getXMY01779() {
		return _XMY01779;
	}

	public void setXMY01779(String XMY01779) {
		_XMY01779 = XMY01779;
	}

	public String getXMY01780() {
		return _XMY01780;
	}

	public void setXMY01780(String XMY01780) {
		_XMY01780 = XMY01780;
	}

	public String getXMY01781() {
		return _XMY01781;
	}

	public void setXMY01781(String XMY01781) {
		_XMY01781 = XMY01781;
	}

	public String getXMY01782() {
		return _XMY01782;
	}

	public void setXMY01782(String XMY01782) {
		_XMY01782 = XMY01782;
	}

	public String getXMY01783() {
		return _XMY01783;
	}

	public void setXMY01783(String XMY01783) {
		_XMY01783 = XMY01783;
	}

	public String getXMY01785() {
		return _XMY01785;
	}

	public void setXMY01785(String XMY01785) {
		_XMY01785 = XMY01785;
	}

	public String getXMY01786() {
		return _XMY01786;
	}

	public void setXMY01786(String XMY01786) {
		_XMY01786 = XMY01786;
	}

	public String getXMY01787() {
		return _XMY01787;
	}

	public void setXMY01787(String XMY01787) {
		_XMY01787 = XMY01787;
	}

	public String getXMY01788() {
		return _XMY01788;
	}

	public void setXMY01788(String XMY01788) {
		_XMY01788 = XMY01788;
	}

	public String getXMY01789() {
		return _XMY01789;
	}

	public void setXMY01789(String XMY01789) {
		_XMY01789 = XMY01789;
	}

	public String getXMY01790() {
		return _XMY01790;
	}

	public void setXMY01790(String XMY01790) {
		_XMY01790 = XMY01790;
	}

	public String getXMY01791() {
		return _XMY01791;
	}

	public void setXMY01791(String XMY01791) {
		_XMY01791 = XMY01791;
	}

	public String getXMY01792() {
		return _XMY01792;
	}

	public void setXMY01792(String XMY01792) {
		_XMY01792 = XMY01792;
	}

	public String getXMY01793() {
		return _XMY01793;
	}

	public void setXMY01793(String XMY01793) {
		_XMY01793 = XMY01793;
	}

	public String getXMY01794() {
		return _XMY01794;
	}

	public void setXMY01794(String XMY01794) {
		_XMY01794 = XMY01794;
	}

	public String getXMY01795() {
		return _XMY01795;
	}

	public void setXMY01795(String XMY01795) {
		_XMY01795 = XMY01795;
	}

	public String getXMY01796() {
		return _XMY01796;
	}

	public void setXMY01796(String XMY01796) {
		_XMY01796 = XMY01796;
	}

	public String getXMY01797() {
		return _XMY01797;
	}

	public void setXMY01797(String XMY01797) {
		_XMY01797 = XMY01797;
	}

	public String getXMY01798() {
		return _XMY01798;
	}

	public void setXMY01798(String XMY01798) {
		_XMY01798 = XMY01798;
	}

	public String getXMY01799() {
		return _XMY01799;
	}

	public void setXMY01799(String XMY01799) {
		_XMY01799 = XMY01799;
	}

	public String getXMY01800() {
		return _XMY01800;
	}

	public void setXMY01800(String XMY01800) {
		_XMY01800 = XMY01800;
	}

	public String getXMY01801() {
		return _XMY01801;
	}

	public void setXMY01801(String XMY01801) {
		_XMY01801 = XMY01801;
	}

	public String getXMY01802() {
		return _XMY01802;
	}

	public void setXMY01802(String XMY01802) {
		_XMY01802 = XMY01802;
	}

	public String getXMY01804() {
		return _XMY01804;
	}

	public void setXMY01804(String XMY01804) {
		_XMY01804 = XMY01804;
	}

	public String getXMY01805() {
		return _XMY01805;
	}

	public void setXMY01805(String XMY01805) {
		_XMY01805 = XMY01805;
	}

	public String getXMY01806() {
		return _XMY01806;
	}

	public void setXMY01806(String XMY01806) {
		_XMY01806 = XMY01806;
	}

	public String getXMY01807() {
		return _XMY01807;
	}

	public void setXMY01807(String XMY01807) {
		_XMY01807 = XMY01807;
	}

	public String getXMY01808() {
		return _XMY01808;
	}

	public void setXMY01808(String XMY01808) {
		_XMY01808 = XMY01808;
	}

	public String getXMY01809() {
		return _XMY01809;
	}

	public void setXMY01809(String XMY01809) {
		_XMY01809 = XMY01809;
	}

	public String getXMY01810() {
		return _XMY01810;
	}

	public void setXMY01810(String XMY01810) {
		_XMY01810 = XMY01810;
	}

	public String getXMY01811() {
		return _XMY01811;
	}

	public void setXMY01811(String XMY01811) {
		_XMY01811 = XMY01811;
	}

	public String getXMY01812() {
		return _XMY01812;
	}

	public void setXMY01812(String XMY01812) {
		_XMY01812 = XMY01812;
	}

	public String getXMY01813() {
		return _XMY01813;
	}

	public void setXMY01813(String XMY01813) {
		_XMY01813 = XMY01813;
	}

	public String getXMY01814() {
		return _XMY01814;
	}

	public void setXMY01814(String XMY01814) {
		_XMY01814 = XMY01814;
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
	private String _XMY01670;
	private String _XMY01671;
	private String _XMY01672;
	private String _XMY01673;
	private String _XMY01674;
	private String _XMY01675;
	private String _XMY01676;
	private String _XMY01677;
	private String _XMY01678;
	private String _XMY01679;
	private String _XMY01680;
	private String _XMY01681;
	private String _XMY01682;
	private String _XMY01683;
	private String _XMY01684;
	private String _XMY01685;
	private String _XMY01686;
	private String _XMY01687;
	private String _XMY01688;
	private String _XMY01689;
	private String _XMY01690;
	private String _XMY01691;
	private String _XMY01692;
	private String _XMY01693;
	private String _XMY01694;
	private String _XMY01695;
	private String _XMY01696;
	private String _XMY01697;
	private String _XMY01698;
	private String _XMY01699;
	private String _XMY01700;
	private String _XMY01701;
	private String _XMY01702;
	private String _XMY01703;
	private String _XMY01704;
	private String _XMY01705;
	private String _XMY01706;
	private String _XMY01707;
	private String _XMY01708;
	private String _XMY01709;
	private String _XMY01710;
	private String _XMY01711;
	private String _XMY01712;
	private String _XMY01713;
	private String _XMY01714;
	private String _XMY01715;
	private String _XMY01716;
	private String _XMY01717;
	private String _XMY01718;
	private String _XMY01719;
	private String _XMY01720;
	private String _XMY01721;
	private String _XMY01722;
	private String _XMY01723;
	private String _XMY01724;
	private String _XMY01725;
	private String _XMY01726;
	private String _XMY01729;
	private String _XMY01730;
	private String _XMY01731;
	private String _XMY01732;
	private String _XMY01733;
	private String _XMY01734;
	private String _XMY01735;
	private String _XMY01736;
	private String _XMY01737;
	private String _XMY01738;
	private String _XMY01739;
	private String _XMY01740;
	private String _XMY01741;
	private String _XMY01742;
	private String _XMY01744;
	private String _XMY01745;
	private String _XMY01746;
	private String _XMY01747;
	private String _XMY01748;
	private String _XMY01749;
	private String _XMY01758;
	private String _XMY01759;
	private String _XMY01760;
	private String _XMY01761;
	private String _XMY01762;
	private String _XMY01763;
	private String _XMY01764;
	private String _XMY01779;
	private String _XMY01780;
	private String _XMY01781;
	private String _XMY01782;
	private String _XMY01783;
	private String _XMY01785;
	private String _XMY01786;
	private String _XMY01787;
	private String _XMY01788;
	private String _XMY01789;
	private String _XMY01790;
	private String _XMY01791;
	private String _XMY01792;
	private String _XMY01793;
	private String _XMY01794;
	private String _XMY01795;
	private String _XMY01796;
	private String _XMY01797;
	private String _XMY01798;
	private String _XMY01799;
	private String _XMY01800;
	private String _XMY01801;
	private String _XMY01802;
	private String _XMY01804;
	private String _XMY01805;
	private String _XMY01806;
	private String _XMY01807;
	private String _XMY01808;
	private String _XMY01809;
	private String _XMY01810;
	private String _XMY01811;
	private String _XMY01812;
	private String _XMY01813;
	private String _XMY01814;
	private Date _modifyDate;
	private Date _syncDate;
}