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
public class VRTechnicalSpec_LKXCGSoap implements Serializable {
	public static VRTechnicalSpec_LKXCGSoap toSoapModel(
		VRTechnicalSpec_LKXCG model) {
		VRTechnicalSpec_LKXCGSoap soapModel = new VRTechnicalSpec_LKXCGSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setConvertAssembleId(model.getConvertAssembleId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setReferenceUid(model.getReferenceUid());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDeliverableCode(model.getDeliverableCode());
		soapModel.setVehicleTypeCertificateId(model.getVehicleTypeCertificateId());
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
		soapModel.setLKXCG0407(model.getLKXCG0407());
		soapModel.setLKXCG0408(model.getLKXCG0408());
		soapModel.setLKXCG0409(model.getLKXCG0409());
		soapModel.setLKXCG0410(model.getLKXCG0410());
		soapModel.setLKXCG0411(model.getLKXCG0411());
		soapModel.setLKXCG0412(model.getLKXCG0412());
		soapModel.setLKXCG0413(model.getLKXCG0413());
		soapModel.setLKXCG0414(model.getLKXCG0414());
		soapModel.setLKXCG0415(model.getLKXCG0415());
		soapModel.setLKXCG0416(model.getLKXCG0416());
		soapModel.setLKXCG0507(model.getLKXCG0507());
		soapModel.setLKXCG0508(model.getLKXCG0508());
		soapModel.setLKXCG0509(model.getLKXCG0509());
		soapModel.setLKXCG0510(model.getLKXCG0510());
		soapModel.setLKXCG0511(model.getLKXCG0511());
		soapModel.setLKXCG0512(model.getLKXCG0512());
		soapModel.setLKXCG0708(model.getLKXCG0708());
		soapModel.setLKXCG0709(model.getLKXCG0709());
		soapModel.setLKXCG0710(model.getLKXCG0710());
		soapModel.setLKXCG0711(model.getLKXCG0711());
		soapModel.setLKXCG0713(model.getLKXCG0713());
		soapModel.setLKXCG0714(model.getLKXCG0714());
		soapModel.setLKXCG0715(model.getLKXCG0715());
		soapModel.setLKXCG0716(model.getLKXCG0716());
		soapModel.setLKXCG0717(model.getLKXCG0717());
		soapModel.setLKXCG0718(model.getLKXCG0718());
		soapModel.setLKXCG0719(model.getLKXCG0719());
		soapModel.setLKXCG0720(model.getLKXCG0720());
		soapModel.setLKXCG0721(model.getLKXCG0721());
		soapModel.setLKXCG0722(model.getLKXCG0722());
		soapModel.setLKXCG0723(model.getLKXCG0723());
		soapModel.setLKXCG0724(model.getLKXCG0724());
		soapModel.setLKXCG0725(model.getLKXCG0725());
		soapModel.setLKXCG0726(model.getLKXCG0726());
		soapModel.setLKXCG0727(model.getLKXCG0727());
		soapModel.setLKXCG0728(model.getLKXCG0728());
		soapModel.setLKXCG0606(model.getLKXCG0606());
		soapModel.setLKXCG0607(model.getLKXCG0607());
		soapModel.setLKXCG0608(model.getLKXCG0608());
		soapModel.setLKXCG0609(model.getLKXCG0609());
		soapModel.setLKXCG0610(model.getLKXCG0610());
		soapModel.setLKXCG0611(model.getLKXCG0611());
		soapModel.setLKXCG0612(model.getLKXCG0612());
		soapModel.setLKXCG0613(model.getLKXCG0613());
		soapModel.setLKXCG0614(model.getLKXCG0614());
		soapModel.setLKXCG0615(model.getLKXCG0615());
		soapModel.setLKXCG0616(model.getLKXCG0616());
		soapModel.setLKXCG0620(model.getLKXCG0620());
		soapModel.setLKXCG0807(model.getLKXCG0807());
		soapModel.setLKXCG0808(model.getLKXCG0808());
		soapModel.setLKXCG0809(model.getLKXCG0809());
		soapModel.setLKXCG0810(model.getLKXCG0810());
		soapModel.setLKXCG0812(model.getLKXCG0812());
		soapModel.setLKXCG0813(model.getLKXCG0813());
		soapModel.setLKXCG0814(model.getLKXCG0814());
		soapModel.setLKXCG0815(model.getLKXCG0815());
		soapModel.setLKXCG0816(model.getLKXCG0816());
		soapModel.setLKXCG0817(model.getLKXCG0817());
		soapModel.setLKXCG0818(model.getLKXCG0818());
		soapModel.setLKXCG0819(model.getLKXCG0819());
		soapModel.setLKXCG0820(model.getLKXCG0820());
		soapModel.setLKXCG0907(model.getLKXCG0907());
		soapModel.setLKXCG0908(model.getLKXCG0908());
		soapModel.setLKXCG0909(model.getLKXCG0909());
		soapModel.setLKXCG0910(model.getLKXCG0910());
		soapModel.setLKXCG0911(model.getLKXCG0911());
		soapModel.setLKXCG0912(model.getLKXCG0912());
		soapModel.setLKXCG0913(model.getLKXCG0913());
		soapModel.setLKXCG0914(model.getLKXCG0914());
		soapModel.setBBLKXCG001(model.getBBLKXCG001());
		soapModel.setBBLKXCG002(model.getBBLKXCG002());
		soapModel.setBBLKXCG003(model.getBBLKXCG003());
		soapModel.setBBLKXCG004(model.getBBLKXCG004());
		soapModel.setBBLKXCG005(model.getBBLKXCG005());
		soapModel.setBBLKXCG006(model.getBBLKXCG006());
		soapModel.setBBLKXCG007(model.getBBLKXCG007());
		soapModel.setBBLKXCG008(model.getBBLKXCG008());
		soapModel.setBBLKXCG009(model.getBBLKXCG009());
		soapModel.setBBLKXCG010(model.getBBLKXCG010());
		soapModel.setBBLKXCG011(model.getBBLKXCG011());
		soapModel.setBBLKXCG012(model.getBBLKXCG012());
		soapModel.setBBLKXCG013(model.getBBLKXCG013());
		soapModel.setBBLKXCG014(model.getBBLKXCG014());
		soapModel.setBBLKXCG015(model.getBBLKXCG015());
		soapModel.setBBLKXCG016(model.getBBLKXCG016());
		soapModel.setBBLKXCG017(model.getBBLKXCG017());
		soapModel.setBBLKXCG018(model.getBBLKXCG018());
		soapModel.setBBLKXCG019(model.getBBLKXCG019());
		soapModel.setBBLKXCG020(model.getBBLKXCG020());
		soapModel.setBBLKXCG021(model.getBBLKXCG021());
		soapModel.setBBLKXCG022(model.getBBLKXCG022());
		soapModel.setBBLKXCG023(model.getBBLKXCG023());
		soapModel.setBBLKXCG024(model.getBBLKXCG024());
		soapModel.setBBLKXCG025(model.getBBLKXCG025());
		soapModel.setBBLKXCG026(model.getBBLKXCG026());
		soapModel.setBBLKXCG027(model.getBBLKXCG027());
		soapModel.setBBLKXCG028(model.getBBLKXCG028());
		soapModel.setBBLKXCG029(model.getBBLKXCG029());
		soapModel.setBBLKXCG030(model.getBBLKXCG030());
		soapModel.setBBLKXCG031(model.getBBLKXCG031());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRTechnicalSpec_LKXCGSoap[] toSoapModels(
		VRTechnicalSpec_LKXCG[] models) {
		VRTechnicalSpec_LKXCGSoap[] soapModels = new VRTechnicalSpec_LKXCGSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_LKXCGSoap[][] toSoapModels(
		VRTechnicalSpec_LKXCG[][] models) {
		VRTechnicalSpec_LKXCGSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRTechnicalSpec_LKXCGSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRTechnicalSpec_LKXCGSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_LKXCGSoap[] toSoapModels(
		List<VRTechnicalSpec_LKXCG> models) {
		List<VRTechnicalSpec_LKXCGSoap> soapModels = new ArrayList<VRTechnicalSpec_LKXCGSoap>(models.size());

		for (VRTechnicalSpec_LKXCG model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRTechnicalSpec_LKXCGSoap[soapModels.size()]);
	}

	public VRTechnicalSpec_LKXCGSoap() {
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

	public String getLKXCG0407() {
		return _LKXCG0407;
	}

	public void setLKXCG0407(String LKXCG0407) {
		_LKXCG0407 = LKXCG0407;
	}

	public String getLKXCG0408() {
		return _LKXCG0408;
	}

	public void setLKXCG0408(String LKXCG0408) {
		_LKXCG0408 = LKXCG0408;
	}

	public String getLKXCG0409() {
		return _LKXCG0409;
	}

	public void setLKXCG0409(String LKXCG0409) {
		_LKXCG0409 = LKXCG0409;
	}

	public String getLKXCG0410() {
		return _LKXCG0410;
	}

	public void setLKXCG0410(String LKXCG0410) {
		_LKXCG0410 = LKXCG0410;
	}

	public String getLKXCG0411() {
		return _LKXCG0411;
	}

	public void setLKXCG0411(String LKXCG0411) {
		_LKXCG0411 = LKXCG0411;
	}

	public String getLKXCG0412() {
		return _LKXCG0412;
	}

	public void setLKXCG0412(String LKXCG0412) {
		_LKXCG0412 = LKXCG0412;
	}

	public String getLKXCG0413() {
		return _LKXCG0413;
	}

	public void setLKXCG0413(String LKXCG0413) {
		_LKXCG0413 = LKXCG0413;
	}

	public String getLKXCG0414() {
		return _LKXCG0414;
	}

	public void setLKXCG0414(String LKXCG0414) {
		_LKXCG0414 = LKXCG0414;
	}

	public String getLKXCG0415() {
		return _LKXCG0415;
	}

	public void setLKXCG0415(String LKXCG0415) {
		_LKXCG0415 = LKXCG0415;
	}

	public String getLKXCG0416() {
		return _LKXCG0416;
	}

	public void setLKXCG0416(String LKXCG0416) {
		_LKXCG0416 = LKXCG0416;
	}

	public String getLKXCG0507() {
		return _LKXCG0507;
	}

	public void setLKXCG0507(String LKXCG0507) {
		_LKXCG0507 = LKXCG0507;
	}

	public String getLKXCG0508() {
		return _LKXCG0508;
	}

	public void setLKXCG0508(String LKXCG0508) {
		_LKXCG0508 = LKXCG0508;
	}

	public String getLKXCG0509() {
		return _LKXCG0509;
	}

	public void setLKXCG0509(String LKXCG0509) {
		_LKXCG0509 = LKXCG0509;
	}

	public String getLKXCG0510() {
		return _LKXCG0510;
	}

	public void setLKXCG0510(String LKXCG0510) {
		_LKXCG0510 = LKXCG0510;
	}

	public String getLKXCG0511() {
		return _LKXCG0511;
	}

	public void setLKXCG0511(String LKXCG0511) {
		_LKXCG0511 = LKXCG0511;
	}

	public String getLKXCG0512() {
		return _LKXCG0512;
	}

	public void setLKXCG0512(String LKXCG0512) {
		_LKXCG0512 = LKXCG0512;
	}

	public String getLKXCG0708() {
		return _LKXCG0708;
	}

	public void setLKXCG0708(String LKXCG0708) {
		_LKXCG0708 = LKXCG0708;
	}

	public String getLKXCG0709() {
		return _LKXCG0709;
	}

	public void setLKXCG0709(String LKXCG0709) {
		_LKXCG0709 = LKXCG0709;
	}

	public String getLKXCG0710() {
		return _LKXCG0710;
	}

	public void setLKXCG0710(String LKXCG0710) {
		_LKXCG0710 = LKXCG0710;
	}

	public String getLKXCG0711() {
		return _LKXCG0711;
	}

	public void setLKXCG0711(String LKXCG0711) {
		_LKXCG0711 = LKXCG0711;
	}

	public String getLKXCG0713() {
		return _LKXCG0713;
	}

	public void setLKXCG0713(String LKXCG0713) {
		_LKXCG0713 = LKXCG0713;
	}

	public String getLKXCG0714() {
		return _LKXCG0714;
	}

	public void setLKXCG0714(String LKXCG0714) {
		_LKXCG0714 = LKXCG0714;
	}

	public String getLKXCG0715() {
		return _LKXCG0715;
	}

	public void setLKXCG0715(String LKXCG0715) {
		_LKXCG0715 = LKXCG0715;
	}

	public String getLKXCG0716() {
		return _LKXCG0716;
	}

	public void setLKXCG0716(String LKXCG0716) {
		_LKXCG0716 = LKXCG0716;
	}

	public String getLKXCG0717() {
		return _LKXCG0717;
	}

	public void setLKXCG0717(String LKXCG0717) {
		_LKXCG0717 = LKXCG0717;
	}

	public String getLKXCG0718() {
		return _LKXCG0718;
	}

	public void setLKXCG0718(String LKXCG0718) {
		_LKXCG0718 = LKXCG0718;
	}

	public String getLKXCG0719() {
		return _LKXCG0719;
	}

	public void setLKXCG0719(String LKXCG0719) {
		_LKXCG0719 = LKXCG0719;
	}

	public String getLKXCG0720() {
		return _LKXCG0720;
	}

	public void setLKXCG0720(String LKXCG0720) {
		_LKXCG0720 = LKXCG0720;
	}

	public String getLKXCG0721() {
		return _LKXCG0721;
	}

	public void setLKXCG0721(String LKXCG0721) {
		_LKXCG0721 = LKXCG0721;
	}

	public String getLKXCG0722() {
		return _LKXCG0722;
	}

	public void setLKXCG0722(String LKXCG0722) {
		_LKXCG0722 = LKXCG0722;
	}

	public String getLKXCG0723() {
		return _LKXCG0723;
	}

	public void setLKXCG0723(String LKXCG0723) {
		_LKXCG0723 = LKXCG0723;
	}

	public String getLKXCG0724() {
		return _LKXCG0724;
	}

	public void setLKXCG0724(String LKXCG0724) {
		_LKXCG0724 = LKXCG0724;
	}

	public String getLKXCG0725() {
		return _LKXCG0725;
	}

	public void setLKXCG0725(String LKXCG0725) {
		_LKXCG0725 = LKXCG0725;
	}

	public String getLKXCG0726() {
		return _LKXCG0726;
	}

	public void setLKXCG0726(String LKXCG0726) {
		_LKXCG0726 = LKXCG0726;
	}

	public String getLKXCG0727() {
		return _LKXCG0727;
	}

	public void setLKXCG0727(String LKXCG0727) {
		_LKXCG0727 = LKXCG0727;
	}

	public String getLKXCG0728() {
		return _LKXCG0728;
	}

	public void setLKXCG0728(String LKXCG0728) {
		_LKXCG0728 = LKXCG0728;
	}

	public String getLKXCG0606() {
		return _LKXCG0606;
	}

	public void setLKXCG0606(String LKXCG0606) {
		_LKXCG0606 = LKXCG0606;
	}

	public String getLKXCG0607() {
		return _LKXCG0607;
	}

	public void setLKXCG0607(String LKXCG0607) {
		_LKXCG0607 = LKXCG0607;
	}

	public String getLKXCG0608() {
		return _LKXCG0608;
	}

	public void setLKXCG0608(String LKXCG0608) {
		_LKXCG0608 = LKXCG0608;
	}

	public String getLKXCG0609() {
		return _LKXCG0609;
	}

	public void setLKXCG0609(String LKXCG0609) {
		_LKXCG0609 = LKXCG0609;
	}

	public String getLKXCG0610() {
		return _LKXCG0610;
	}

	public void setLKXCG0610(String LKXCG0610) {
		_LKXCG0610 = LKXCG0610;
	}

	public String getLKXCG0611() {
		return _LKXCG0611;
	}

	public void setLKXCG0611(String LKXCG0611) {
		_LKXCG0611 = LKXCG0611;
	}

	public String getLKXCG0612() {
		return _LKXCG0612;
	}

	public void setLKXCG0612(String LKXCG0612) {
		_LKXCG0612 = LKXCG0612;
	}

	public String getLKXCG0613() {
		return _LKXCG0613;
	}

	public void setLKXCG0613(String LKXCG0613) {
		_LKXCG0613 = LKXCG0613;
	}

	public String getLKXCG0614() {
		return _LKXCG0614;
	}

	public void setLKXCG0614(String LKXCG0614) {
		_LKXCG0614 = LKXCG0614;
	}

	public String getLKXCG0615() {
		return _LKXCG0615;
	}

	public void setLKXCG0615(String LKXCG0615) {
		_LKXCG0615 = LKXCG0615;
	}

	public String getLKXCG0616() {
		return _LKXCG0616;
	}

	public void setLKXCG0616(String LKXCG0616) {
		_LKXCG0616 = LKXCG0616;
	}

	public String getLKXCG0620() {
		return _LKXCG0620;
	}

	public void setLKXCG0620(String LKXCG0620) {
		_LKXCG0620 = LKXCG0620;
	}

	public String getLKXCG0807() {
		return _LKXCG0807;
	}

	public void setLKXCG0807(String LKXCG0807) {
		_LKXCG0807 = LKXCG0807;
	}

	public String getLKXCG0808() {
		return _LKXCG0808;
	}

	public void setLKXCG0808(String LKXCG0808) {
		_LKXCG0808 = LKXCG0808;
	}

	public String getLKXCG0809() {
		return _LKXCG0809;
	}

	public void setLKXCG0809(String LKXCG0809) {
		_LKXCG0809 = LKXCG0809;
	}

	public String getLKXCG0810() {
		return _LKXCG0810;
	}

	public void setLKXCG0810(String LKXCG0810) {
		_LKXCG0810 = LKXCG0810;
	}

	public String getLKXCG0812() {
		return _LKXCG0812;
	}

	public void setLKXCG0812(String LKXCG0812) {
		_LKXCG0812 = LKXCG0812;
	}

	public String getLKXCG0813() {
		return _LKXCG0813;
	}

	public void setLKXCG0813(String LKXCG0813) {
		_LKXCG0813 = LKXCG0813;
	}

	public String getLKXCG0814() {
		return _LKXCG0814;
	}

	public void setLKXCG0814(String LKXCG0814) {
		_LKXCG0814 = LKXCG0814;
	}

	public String getLKXCG0815() {
		return _LKXCG0815;
	}

	public void setLKXCG0815(String LKXCG0815) {
		_LKXCG0815 = LKXCG0815;
	}

	public String getLKXCG0816() {
		return _LKXCG0816;
	}

	public void setLKXCG0816(String LKXCG0816) {
		_LKXCG0816 = LKXCG0816;
	}

	public String getLKXCG0817() {
		return _LKXCG0817;
	}

	public void setLKXCG0817(String LKXCG0817) {
		_LKXCG0817 = LKXCG0817;
	}

	public String getLKXCG0818() {
		return _LKXCG0818;
	}

	public void setLKXCG0818(String LKXCG0818) {
		_LKXCG0818 = LKXCG0818;
	}

	public String getLKXCG0819() {
		return _LKXCG0819;
	}

	public void setLKXCG0819(String LKXCG0819) {
		_LKXCG0819 = LKXCG0819;
	}

	public String getLKXCG0820() {
		return _LKXCG0820;
	}

	public void setLKXCG0820(String LKXCG0820) {
		_LKXCG0820 = LKXCG0820;
	}

	public String getLKXCG0907() {
		return _LKXCG0907;
	}

	public void setLKXCG0907(String LKXCG0907) {
		_LKXCG0907 = LKXCG0907;
	}

	public String getLKXCG0908() {
		return _LKXCG0908;
	}

	public void setLKXCG0908(String LKXCG0908) {
		_LKXCG0908 = LKXCG0908;
	}

	public String getLKXCG0909() {
		return _LKXCG0909;
	}

	public void setLKXCG0909(String LKXCG0909) {
		_LKXCG0909 = LKXCG0909;
	}

	public String getLKXCG0910() {
		return _LKXCG0910;
	}

	public void setLKXCG0910(String LKXCG0910) {
		_LKXCG0910 = LKXCG0910;
	}

	public String getLKXCG0911() {
		return _LKXCG0911;
	}

	public void setLKXCG0911(String LKXCG0911) {
		_LKXCG0911 = LKXCG0911;
	}

	public String getLKXCG0912() {
		return _LKXCG0912;
	}

	public void setLKXCG0912(String LKXCG0912) {
		_LKXCG0912 = LKXCG0912;
	}

	public String getLKXCG0913() {
		return _LKXCG0913;
	}

	public void setLKXCG0913(String LKXCG0913) {
		_LKXCG0913 = LKXCG0913;
	}

	public String getLKXCG0914() {
		return _LKXCG0914;
	}

	public void setLKXCG0914(String LKXCG0914) {
		_LKXCG0914 = LKXCG0914;
	}

	public String getBBLKXCG001() {
		return _BBLKXCG001;
	}

	public void setBBLKXCG001(String BBLKXCG001) {
		_BBLKXCG001 = BBLKXCG001;
	}

	public String getBBLKXCG002() {
		return _BBLKXCG002;
	}

	public void setBBLKXCG002(String BBLKXCG002) {
		_BBLKXCG002 = BBLKXCG002;
	}

	public String getBBLKXCG003() {
		return _BBLKXCG003;
	}

	public void setBBLKXCG003(String BBLKXCG003) {
		_BBLKXCG003 = BBLKXCG003;
	}

	public String getBBLKXCG004() {
		return _BBLKXCG004;
	}

	public void setBBLKXCG004(String BBLKXCG004) {
		_BBLKXCG004 = BBLKXCG004;
	}

	public String getBBLKXCG005() {
		return _BBLKXCG005;
	}

	public void setBBLKXCG005(String BBLKXCG005) {
		_BBLKXCG005 = BBLKXCG005;
	}

	public String getBBLKXCG006() {
		return _BBLKXCG006;
	}

	public void setBBLKXCG006(String BBLKXCG006) {
		_BBLKXCG006 = BBLKXCG006;
	}

	public String getBBLKXCG007() {
		return _BBLKXCG007;
	}

	public void setBBLKXCG007(String BBLKXCG007) {
		_BBLKXCG007 = BBLKXCG007;
	}

	public String getBBLKXCG008() {
		return _BBLKXCG008;
	}

	public void setBBLKXCG008(String BBLKXCG008) {
		_BBLKXCG008 = BBLKXCG008;
	}

	public String getBBLKXCG009() {
		return _BBLKXCG009;
	}

	public void setBBLKXCG009(String BBLKXCG009) {
		_BBLKXCG009 = BBLKXCG009;
	}

	public String getBBLKXCG010() {
		return _BBLKXCG010;
	}

	public void setBBLKXCG010(String BBLKXCG010) {
		_BBLKXCG010 = BBLKXCG010;
	}

	public String getBBLKXCG011() {
		return _BBLKXCG011;
	}

	public void setBBLKXCG011(String BBLKXCG011) {
		_BBLKXCG011 = BBLKXCG011;
	}

	public String getBBLKXCG012() {
		return _BBLKXCG012;
	}

	public void setBBLKXCG012(String BBLKXCG012) {
		_BBLKXCG012 = BBLKXCG012;
	}

	public String getBBLKXCG013() {
		return _BBLKXCG013;
	}

	public void setBBLKXCG013(String BBLKXCG013) {
		_BBLKXCG013 = BBLKXCG013;
	}

	public String getBBLKXCG014() {
		return _BBLKXCG014;
	}

	public void setBBLKXCG014(String BBLKXCG014) {
		_BBLKXCG014 = BBLKXCG014;
	}

	public String getBBLKXCG015() {
		return _BBLKXCG015;
	}

	public void setBBLKXCG015(String BBLKXCG015) {
		_BBLKXCG015 = BBLKXCG015;
	}

	public String getBBLKXCG016() {
		return _BBLKXCG016;
	}

	public void setBBLKXCG016(String BBLKXCG016) {
		_BBLKXCG016 = BBLKXCG016;
	}

	public String getBBLKXCG017() {
		return _BBLKXCG017;
	}

	public void setBBLKXCG017(String BBLKXCG017) {
		_BBLKXCG017 = BBLKXCG017;
	}

	public String getBBLKXCG018() {
		return _BBLKXCG018;
	}

	public void setBBLKXCG018(String BBLKXCG018) {
		_BBLKXCG018 = BBLKXCG018;
	}

	public String getBBLKXCG019() {
		return _BBLKXCG019;
	}

	public void setBBLKXCG019(String BBLKXCG019) {
		_BBLKXCG019 = BBLKXCG019;
	}

	public String getBBLKXCG020() {
		return _BBLKXCG020;
	}

	public void setBBLKXCG020(String BBLKXCG020) {
		_BBLKXCG020 = BBLKXCG020;
	}

	public String getBBLKXCG021() {
		return _BBLKXCG021;
	}

	public void setBBLKXCG021(String BBLKXCG021) {
		_BBLKXCG021 = BBLKXCG021;
	}

	public String getBBLKXCG022() {
		return _BBLKXCG022;
	}

	public void setBBLKXCG022(String BBLKXCG022) {
		_BBLKXCG022 = BBLKXCG022;
	}

	public String getBBLKXCG023() {
		return _BBLKXCG023;
	}

	public void setBBLKXCG023(String BBLKXCG023) {
		_BBLKXCG023 = BBLKXCG023;
	}

	public String getBBLKXCG024() {
		return _BBLKXCG024;
	}

	public void setBBLKXCG024(String BBLKXCG024) {
		_BBLKXCG024 = BBLKXCG024;
	}

	public String getBBLKXCG025() {
		return _BBLKXCG025;
	}

	public void setBBLKXCG025(String BBLKXCG025) {
		_BBLKXCG025 = BBLKXCG025;
	}

	public String getBBLKXCG026() {
		return _BBLKXCG026;
	}

	public void setBBLKXCG026(String BBLKXCG026) {
		_BBLKXCG026 = BBLKXCG026;
	}

	public String getBBLKXCG027() {
		return _BBLKXCG027;
	}

	public void setBBLKXCG027(String BBLKXCG027) {
		_BBLKXCG027 = BBLKXCG027;
	}

	public String getBBLKXCG028() {
		return _BBLKXCG028;
	}

	public void setBBLKXCG028(String BBLKXCG028) {
		_BBLKXCG028 = BBLKXCG028;
	}

	public String getBBLKXCG029() {
		return _BBLKXCG029;
	}

	public void setBBLKXCG029(String BBLKXCG029) {
		_BBLKXCG029 = BBLKXCG029;
	}

	public String getBBLKXCG030() {
		return _BBLKXCG030;
	}

	public void setBBLKXCG030(String BBLKXCG030) {
		_BBLKXCG030 = BBLKXCG030;
	}

	public String getBBLKXCG031() {
		return _BBLKXCG031;
	}

	public void setBBLKXCG031(String BBLKXCG031) {
		_BBLKXCG031 = BBLKXCG031;
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
	private String _LKXCG0407;
	private String _LKXCG0408;
	private String _LKXCG0409;
	private String _LKXCG0410;
	private String _LKXCG0411;
	private String _LKXCG0412;
	private String _LKXCG0413;
	private String _LKXCG0414;
	private String _LKXCG0415;
	private String _LKXCG0416;
	private String _LKXCG0507;
	private String _LKXCG0508;
	private String _LKXCG0509;
	private String _LKXCG0510;
	private String _LKXCG0511;
	private String _LKXCG0512;
	private String _LKXCG0708;
	private String _LKXCG0709;
	private String _LKXCG0710;
	private String _LKXCG0711;
	private String _LKXCG0713;
	private String _LKXCG0714;
	private String _LKXCG0715;
	private String _LKXCG0716;
	private String _LKXCG0717;
	private String _LKXCG0718;
	private String _LKXCG0719;
	private String _LKXCG0720;
	private String _LKXCG0721;
	private String _LKXCG0722;
	private String _LKXCG0723;
	private String _LKXCG0724;
	private String _LKXCG0725;
	private String _LKXCG0726;
	private String _LKXCG0727;
	private String _LKXCG0728;
	private String _LKXCG0606;
	private String _LKXCG0607;
	private String _LKXCG0608;
	private String _LKXCG0609;
	private String _LKXCG0610;
	private String _LKXCG0611;
	private String _LKXCG0612;
	private String _LKXCG0613;
	private String _LKXCG0614;
	private String _LKXCG0615;
	private String _LKXCG0616;
	private String _LKXCG0620;
	private String _LKXCG0807;
	private String _LKXCG0808;
	private String _LKXCG0809;
	private String _LKXCG0810;
	private String _LKXCG0812;
	private String _LKXCG0813;
	private String _LKXCG0814;
	private String _LKXCG0815;
	private String _LKXCG0816;
	private String _LKXCG0817;
	private String _LKXCG0818;
	private String _LKXCG0819;
	private String _LKXCG0820;
	private String _LKXCG0907;
	private String _LKXCG0908;
	private String _LKXCG0909;
	private String _LKXCG0910;
	private String _LKXCG0911;
	private String _LKXCG0912;
	private String _LKXCG0913;
	private String _LKXCG0914;
	private String _BBLKXCG001;
	private String _BBLKXCG002;
	private String _BBLKXCG003;
	private String _BBLKXCG004;
	private String _BBLKXCG005;
	private String _BBLKXCG006;
	private String _BBLKXCG007;
	private String _BBLKXCG008;
	private String _BBLKXCG009;
	private String _BBLKXCG010;
	private String _BBLKXCG011;
	private String _BBLKXCG012;
	private String _BBLKXCG013;
	private String _BBLKXCG014;
	private String _BBLKXCG015;
	private String _BBLKXCG016;
	private String _BBLKXCG017;
	private String _BBLKXCG018;
	private String _BBLKXCG019;
	private String _BBLKXCG020;
	private String _BBLKXCG021;
	private String _BBLKXCG022;
	private String _BBLKXCG023;
	private String _BBLKXCG024;
	private String _BBLKXCG025;
	private String _BBLKXCG026;
	private String _BBLKXCG027;
	private String _BBLKXCG028;
	private String _BBLKXCG029;
	private String _BBLKXCG030;
	private String _BBLKXCG031;
	private Date _modifyDate;
	private Date _syncDate;
}