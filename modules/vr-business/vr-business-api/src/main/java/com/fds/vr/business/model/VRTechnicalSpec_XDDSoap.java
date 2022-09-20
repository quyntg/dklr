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
public class VRTechnicalSpec_XDDSoap implements Serializable {
	public static VRTechnicalSpec_XDDSoap toSoapModel(VRTechnicalSpec_XDD model) {
		VRTechnicalSpec_XDDSoap soapModel = new VRTechnicalSpec_XDDSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setConvertAssembleId(model.getConvertAssembleId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setReferenceUid(model.getReferenceUid());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDeliverableCode(model.getDeliverableCode());
		soapModel.setVehicleTypeCertificateId(model.getVehicleTypeCertificateId());
		soapModel.setXDD01001(model.getXDD01001());
		soapModel.setXDD01002(model.getXDD01002());
		soapModel.setXDD01003(model.getXDD01003());
		soapModel.setXDD01004(model.getXDD01004());
		soapModel.setXDD01005(model.getXDD01005());
		soapModel.setXDD01006(model.getXDD01006());
		soapModel.setXDD01007(model.getXDD01007());
		soapModel.setXDD01008(model.getXDD01008());
		soapModel.setXDD01009(model.getXDD01009());
		soapModel.setXDD01010(model.getXDD01010());
		soapModel.setXDD01011(model.getXDD01011());
		soapModel.setXDD01012(model.getXDD01012());
		soapModel.setXDD01013(model.getXDD01013());
		soapModel.setXDD01014(model.getXDD01014());
		soapModel.setXDD01016(model.getXDD01016());
		soapModel.setXDD01017(model.getXDD01017());
		soapModel.setXDD01019(model.getXDD01019());
		soapModel.setXDD01020(model.getXDD01020());
		soapModel.setXDD01021(model.getXDD01021());
		soapModel.setXDD01022(model.getXDD01022());
		soapModel.setXDD01024(model.getXDD01024());
		soapModel.setXDD01025(model.getXDD01025());
		soapModel.setXDD01026(model.getXDD01026());
		soapModel.setXDD01027(model.getXDD01027());
		soapModel.setXDD01028(model.getXDD01028());
		soapModel.setXDD01030(model.getXDD01030());
		soapModel.setXDD01031(model.getXDD01031());
		soapModel.setXDD01032(model.getXDD01032());
		soapModel.setXDD01033(model.getXDD01033());
		soapModel.setXDD01034(model.getXDD01034());
		soapModel.setXDD01035(model.getXDD01035());
		soapModel.setXDD01036(model.getXDD01036());
		soapModel.setXDD01037(model.getXDD01037());
		soapModel.setXDD01038(model.getXDD01038());
		soapModel.setXDD01039(model.getXDD01039());
		soapModel.setXDD01040(model.getXDD01040());
		soapModel.setXDD01041(model.getXDD01041());
		soapModel.setXDD01042(model.getXDD01042());
		soapModel.setXDD01043(model.getXDD01043());
		soapModel.setXDD01044(model.getXDD01044());
		soapModel.setXDD01045(model.getXDD01045());
		soapModel.setXDD01046(model.getXDD01046());
		soapModel.setXDD01047(model.getXDD01047());
		soapModel.setXDD01049(model.getXDD01049());
		soapModel.setXDD01050(model.getXDD01050());
		soapModel.setXDD01051(model.getXDD01051());
		soapModel.setXDD01052(model.getXDD01052());
		soapModel.setXDD01053(model.getXDD01053());
		soapModel.setXDD01054(model.getXDD01054());
		soapModel.setXDD01055(model.getXDD01055());
		soapModel.setXDD01056(model.getXDD01056());
		soapModel.setXDD01057(model.getXDD01057());
		soapModel.setXDD01058(model.getXDD01058());
		soapModel.setXDD01059(model.getXDD01059());
		soapModel.setXDD01060(model.getXDD01060());
		soapModel.setXDD0076(model.getXDD0076());
		soapModel.setXDD0077(model.getXDD0077());
		soapModel.setXDD0078(model.getXDD0078());
		soapModel.setXDD0079(model.getXDD0079());
		soapModel.setXDD0080(model.getXDD0080());
		soapModel.setXDD0081(model.getXDD0081());
		soapModel.setXDD0082(model.getXDD0082());
		soapModel.setXDD0083(model.getXDD0083());
		soapModel.setXDD0084(model.getXDD0084());
		soapModel.setXDD0085(model.getXDD0085());
		soapModel.setXDD0086(model.getXDD0086());
		soapModel.setXDD0087(model.getXDD0087());
		soapModel.setXDD0088(model.getXDD0088());
		soapModel.setXDD0089(model.getXDD0089());
		soapModel.setXDD0090(model.getXDD0090());
		soapModel.setXDD0091(model.getXDD0091());
		soapModel.setXDD0092(model.getXDD0092());
		soapModel.setXDD0093(model.getXDD0093());
		soapModel.setXDD0094(model.getXDD0094());
		soapModel.setXDD0095(model.getXDD0095());
		soapModel.setXDD0096(model.getXDD0096());
		soapModel.setXDD0097(model.getXDD0097());
		soapModel.setXDD0098(model.getXDD0098());
		soapModel.setXDD0099(model.getXDD0099());
		soapModel.setXDD0100(model.getXDD0100());
		soapModel.setXDD0101(model.getXDD0101());
		soapModel.setXDD0102(model.getXDD0102());
		soapModel.setXDD0103(model.getXDD0103());
		soapModel.setXDD0104(model.getXDD0104());
		soapModel.setXDD0105(model.getXDD0105());
		soapModel.setXDD0106(model.getXDD0106());
		soapModel.setXDD0107(model.getXDD0107());
		soapModel.setXDD0108(model.getXDD0108());
		soapModel.setXDD0109(model.getXDD0109());
		soapModel.setXDD0110(model.getXDD0110());
		soapModel.setXDD0111(model.getXDD0111());
		soapModel.setXDD0112(model.getXDD0112());
		soapModel.setXDD0113(model.getXDD0113());
		soapModel.setXDD0114(model.getXDD0114());
		soapModel.setXDD0115(model.getXDD0115());
		soapModel.setXDD0116(model.getXDD0116());
		soapModel.setXDD0117(model.getXDD0117());
		soapModel.setXDD0118(model.getXDD0118());
		soapModel.setXDD0119(model.getXDD0119());
		soapModel.setXDD0120(model.getXDD0120());
		soapModel.setXDD0121(model.getXDD0121());
		soapModel.setXDD0122(model.getXDD0122());
		soapModel.setXDD0123(model.getXDD0123());
		soapModel.setXDD0124(model.getXDD0124());
		soapModel.setXDD0125(model.getXDD0125());
		soapModel.setXDD0126(model.getXDD0126());
		soapModel.setXDD0127(model.getXDD0127());
		soapModel.setXDD0128(model.getXDD0128());
		soapModel.setXDD0129(model.getXDD0129());
		soapModel.setXDD0130(model.getXDD0130());
		soapModel.setXDD0131(model.getXDD0131());
		soapModel.setXDD0132(model.getXDD0132());
		soapModel.setXDD0133(model.getXDD0133());
		soapModel.setXDD0134(model.getXDD0134());
		soapModel.setXDD0135(model.getXDD0135());
		soapModel.setXDD0136(model.getXDD0136());
		soapModel.setXDD0137(model.getXDD0137());
		soapModel.setXDD0138(model.getXDD0138());
		soapModel.setXDD0139(model.getXDD0139());
		soapModel.setXDD0140(model.getXDD0140());
		soapModel.setXDD0141(model.getXDD0141());
		soapModel.setXDD0142(model.getXDD0142());
		soapModel.setXDD0143(model.getXDD0143());
		soapModel.setXDD0144(model.getXDD0144());
		soapModel.setXDD0145(model.getXDD0145());
		soapModel.setXDD0146(model.getXDD0146());
		soapModel.setXDD0147(model.getXDD0147());
		soapModel.setXDD0148(model.getXDD0148());
		soapModel.setXDD0149(model.getXDD0149());
		soapModel.setXDD0150(model.getXDD0150());
		soapModel.setXDD0151(model.getXDD0151());
		soapModel.setXDD0152(model.getXDD0152());
		soapModel.setXDD0153(model.getXDD0153());
		soapModel.setXDD0154(model.getXDD0154());
		soapModel.setXDD0155(model.getXDD0155());
		soapModel.setXDD0156(model.getXDD0156());
		soapModel.setXDD0157(model.getXDD0157());
		soapModel.setXDD0158(model.getXDD0158());
		soapModel.setXDD0159(model.getXDD0159());
		soapModel.setXDD0160(model.getXDD0160());
		soapModel.setXDD0161(model.getXDD0161());
		soapModel.setBBCNCLKLXDD001(model.getBBCNCLKLXDD001());
		soapModel.setBBCNCLKLXDD002(model.getBBCNCLKLXDD002());
		soapModel.setBBCNCLKLXDD003(model.getBBCNCLKLXDD003());
		soapModel.setBBCNCLKLXDD004(model.getBBCNCLKLXDD004());
		soapModel.setBBCNCLKLXDD005(model.getBBCNCLKLXDD005());
		soapModel.setBBCNCLKLXDD006(model.getBBCNCLKLXDD006());
		soapModel.setBBCNCLKLXDD007(model.getBBCNCLKLXDD007());
		soapModel.setBBCNCLKLXDD008(model.getBBCNCLKLXDD008());
		soapModel.setBBCNCLKLXDD009(model.getBBCNCLKLXDD009());
		soapModel.setBBCNCLKLXDD010(model.getBBCNCLKLXDD010());
		soapModel.setBBCNCLKLXDD011(model.getBBCNCLKLXDD011());
		soapModel.setBBCNCLKLXDD012(model.getBBCNCLKLXDD012());
		soapModel.setBBCNCLKLXDD013(model.getBBCNCLKLXDD013());
		soapModel.setBBCNCLKLXDD014(model.getBBCNCLKLXDD014());
		soapModel.setBBCNCLKLXDD015(model.getBBCNCLKLXDD015());
		soapModel.setBBCNCLKLXDD016(model.getBBCNCLKLXDD016());
		soapModel.setBBCNCLKLXDD019(model.getBBCNCLKLXDD019());
		soapModel.setBBCNCLKLXDD017(model.getBBCNCLKLXDD017());
		soapModel.setBBCNCLKLXDD020(model.getBBCNCLKLXDD020());
		soapModel.setBBCNCLKLXDD018(model.getBBCNCLKLXDD018());
		soapModel.setBBCNCLKLXDD021(model.getBBCNCLKLXDD021());
		soapModel.setBBCNCLKLXDD022(model.getBBCNCLKLXDD022());
		soapModel.setBBCNCLKLXDD023(model.getBBCNCLKLXDD023());
		soapModel.setBBCNCLKLXDD024(model.getBBCNCLKLXDD024());
		soapModel.setBBCNCLKLXDD025(model.getBBCNCLKLXDD025());
		soapModel.setBBCNCLKLXDD026(model.getBBCNCLKLXDD026());
		soapModel.setBBCNCLKLXDD027(model.getBBCNCLKLXDD027());
		soapModel.setBBCNCLKLXDD028(model.getBBCNCLKLXDD028());
		soapModel.setBBCNCLKLXDD029(model.getBBCNCLKLXDD029());
		soapModel.setBBCNCLKLXDD031(model.getBBCNCLKLXDD031());
		soapModel.setBBCNCLKLXDD032(model.getBBCNCLKLXDD032());
		soapModel.setBBCNCLKLXDD033(model.getBBCNCLKLXDD033());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRTechnicalSpec_XDDSoap[] toSoapModels(
		VRTechnicalSpec_XDD[] models) {
		VRTechnicalSpec_XDDSoap[] soapModels = new VRTechnicalSpec_XDDSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XDDSoap[][] toSoapModels(
		VRTechnicalSpec_XDD[][] models) {
		VRTechnicalSpec_XDDSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRTechnicalSpec_XDDSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRTechnicalSpec_XDDSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XDDSoap[] toSoapModels(
		List<VRTechnicalSpec_XDD> models) {
		List<VRTechnicalSpec_XDDSoap> soapModels = new ArrayList<VRTechnicalSpec_XDDSoap>(models.size());

		for (VRTechnicalSpec_XDD model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRTechnicalSpec_XDDSoap[soapModels.size()]);
	}

	public VRTechnicalSpec_XDDSoap() {
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

	public String getXDD01001() {
		return _XDD01001;
	}

	public void setXDD01001(String XDD01001) {
		_XDD01001 = XDD01001;
	}

	public String getXDD01002() {
		return _XDD01002;
	}

	public void setXDD01002(String XDD01002) {
		_XDD01002 = XDD01002;
	}

	public String getXDD01003() {
		return _XDD01003;
	}

	public void setXDD01003(String XDD01003) {
		_XDD01003 = XDD01003;
	}

	public String getXDD01004() {
		return _XDD01004;
	}

	public void setXDD01004(String XDD01004) {
		_XDD01004 = XDD01004;
	}

	public String getXDD01005() {
		return _XDD01005;
	}

	public void setXDD01005(String XDD01005) {
		_XDD01005 = XDD01005;
	}

	public String getXDD01006() {
		return _XDD01006;
	}

	public void setXDD01006(String XDD01006) {
		_XDD01006 = XDD01006;
	}

	public String getXDD01007() {
		return _XDD01007;
	}

	public void setXDD01007(String XDD01007) {
		_XDD01007 = XDD01007;
	}

	public String getXDD01008() {
		return _XDD01008;
	}

	public void setXDD01008(String XDD01008) {
		_XDD01008 = XDD01008;
	}

	public String getXDD01009() {
		return _XDD01009;
	}

	public void setXDD01009(String XDD01009) {
		_XDD01009 = XDD01009;
	}

	public String getXDD01010() {
		return _XDD01010;
	}

	public void setXDD01010(String XDD01010) {
		_XDD01010 = XDD01010;
	}

	public String getXDD01011() {
		return _XDD01011;
	}

	public void setXDD01011(String XDD01011) {
		_XDD01011 = XDD01011;
	}

	public String getXDD01012() {
		return _XDD01012;
	}

	public void setXDD01012(String XDD01012) {
		_XDD01012 = XDD01012;
	}

	public String getXDD01013() {
		return _XDD01013;
	}

	public void setXDD01013(String XDD01013) {
		_XDD01013 = XDD01013;
	}

	public String getXDD01014() {
		return _XDD01014;
	}

	public void setXDD01014(String XDD01014) {
		_XDD01014 = XDD01014;
	}

	public String getXDD01016() {
		return _XDD01016;
	}

	public void setXDD01016(String XDD01016) {
		_XDD01016 = XDD01016;
	}

	public String getXDD01017() {
		return _XDD01017;
	}

	public void setXDD01017(String XDD01017) {
		_XDD01017 = XDD01017;
	}

	public String getXDD01019() {
		return _XDD01019;
	}

	public void setXDD01019(String XDD01019) {
		_XDD01019 = XDD01019;
	}

	public String getXDD01020() {
		return _XDD01020;
	}

	public void setXDD01020(String XDD01020) {
		_XDD01020 = XDD01020;
	}

	public String getXDD01021() {
		return _XDD01021;
	}

	public void setXDD01021(String XDD01021) {
		_XDD01021 = XDD01021;
	}

	public String getXDD01022() {
		return _XDD01022;
	}

	public void setXDD01022(String XDD01022) {
		_XDD01022 = XDD01022;
	}

	public String getXDD01024() {
		return _XDD01024;
	}

	public void setXDD01024(String XDD01024) {
		_XDD01024 = XDD01024;
	}

	public String getXDD01025() {
		return _XDD01025;
	}

	public void setXDD01025(String XDD01025) {
		_XDD01025 = XDD01025;
	}

	public String getXDD01026() {
		return _XDD01026;
	}

	public void setXDD01026(String XDD01026) {
		_XDD01026 = XDD01026;
	}

	public String getXDD01027() {
		return _XDD01027;
	}

	public void setXDD01027(String XDD01027) {
		_XDD01027 = XDD01027;
	}

	public String getXDD01028() {
		return _XDD01028;
	}

	public void setXDD01028(String XDD01028) {
		_XDD01028 = XDD01028;
	}

	public String getXDD01030() {
		return _XDD01030;
	}

	public void setXDD01030(String XDD01030) {
		_XDD01030 = XDD01030;
	}

	public String getXDD01031() {
		return _XDD01031;
	}

	public void setXDD01031(String XDD01031) {
		_XDD01031 = XDD01031;
	}

	public String getXDD01032() {
		return _XDD01032;
	}

	public void setXDD01032(String XDD01032) {
		_XDD01032 = XDD01032;
	}

	public String getXDD01033() {
		return _XDD01033;
	}

	public void setXDD01033(String XDD01033) {
		_XDD01033 = XDD01033;
	}

	public String getXDD01034() {
		return _XDD01034;
	}

	public void setXDD01034(String XDD01034) {
		_XDD01034 = XDD01034;
	}

	public String getXDD01035() {
		return _XDD01035;
	}

	public void setXDD01035(String XDD01035) {
		_XDD01035 = XDD01035;
	}

	public String getXDD01036() {
		return _XDD01036;
	}

	public void setXDD01036(String XDD01036) {
		_XDD01036 = XDD01036;
	}

	public String getXDD01037() {
		return _XDD01037;
	}

	public void setXDD01037(String XDD01037) {
		_XDD01037 = XDD01037;
	}

	public String getXDD01038() {
		return _XDD01038;
	}

	public void setXDD01038(String XDD01038) {
		_XDD01038 = XDD01038;
	}

	public String getXDD01039() {
		return _XDD01039;
	}

	public void setXDD01039(String XDD01039) {
		_XDD01039 = XDD01039;
	}

	public String getXDD01040() {
		return _XDD01040;
	}

	public void setXDD01040(String XDD01040) {
		_XDD01040 = XDD01040;
	}

	public String getXDD01041() {
		return _XDD01041;
	}

	public void setXDD01041(String XDD01041) {
		_XDD01041 = XDD01041;
	}

	public String getXDD01042() {
		return _XDD01042;
	}

	public void setXDD01042(String XDD01042) {
		_XDD01042 = XDD01042;
	}

	public String getXDD01043() {
		return _XDD01043;
	}

	public void setXDD01043(String XDD01043) {
		_XDD01043 = XDD01043;
	}

	public String getXDD01044() {
		return _XDD01044;
	}

	public void setXDD01044(String XDD01044) {
		_XDD01044 = XDD01044;
	}

	public String getXDD01045() {
		return _XDD01045;
	}

	public void setXDD01045(String XDD01045) {
		_XDD01045 = XDD01045;
	}

	public String getXDD01046() {
		return _XDD01046;
	}

	public void setXDD01046(String XDD01046) {
		_XDD01046 = XDD01046;
	}

	public String getXDD01047() {
		return _XDD01047;
	}

	public void setXDD01047(String XDD01047) {
		_XDD01047 = XDD01047;
	}

	public String getXDD01049() {
		return _XDD01049;
	}

	public void setXDD01049(String XDD01049) {
		_XDD01049 = XDD01049;
	}

	public String getXDD01050() {
		return _XDD01050;
	}

	public void setXDD01050(String XDD01050) {
		_XDD01050 = XDD01050;
	}

	public String getXDD01051() {
		return _XDD01051;
	}

	public void setXDD01051(String XDD01051) {
		_XDD01051 = XDD01051;
	}

	public String getXDD01052() {
		return _XDD01052;
	}

	public void setXDD01052(String XDD01052) {
		_XDD01052 = XDD01052;
	}

	public String getXDD01053() {
		return _XDD01053;
	}

	public void setXDD01053(String XDD01053) {
		_XDD01053 = XDD01053;
	}

	public String getXDD01054() {
		return _XDD01054;
	}

	public void setXDD01054(String XDD01054) {
		_XDD01054 = XDD01054;
	}

	public String getXDD01055() {
		return _XDD01055;
	}

	public void setXDD01055(String XDD01055) {
		_XDD01055 = XDD01055;
	}

	public String getXDD01056() {
		return _XDD01056;
	}

	public void setXDD01056(String XDD01056) {
		_XDD01056 = XDD01056;
	}

	public String getXDD01057() {
		return _XDD01057;
	}

	public void setXDD01057(String XDD01057) {
		_XDD01057 = XDD01057;
	}

	public String getXDD01058() {
		return _XDD01058;
	}

	public void setXDD01058(String XDD01058) {
		_XDD01058 = XDD01058;
	}

	public String getXDD01059() {
		return _XDD01059;
	}

	public void setXDD01059(String XDD01059) {
		_XDD01059 = XDD01059;
	}

	public String getXDD01060() {
		return _XDD01060;
	}

	public void setXDD01060(String XDD01060) {
		_XDD01060 = XDD01060;
	}

	public String getXDD0076() {
		return _XDD0076;
	}

	public void setXDD0076(String XDD0076) {
		_XDD0076 = XDD0076;
	}

	public String getXDD0077() {
		return _XDD0077;
	}

	public void setXDD0077(String XDD0077) {
		_XDD0077 = XDD0077;
	}

	public String getXDD0078() {
		return _XDD0078;
	}

	public void setXDD0078(String XDD0078) {
		_XDD0078 = XDD0078;
	}

	public String getXDD0079() {
		return _XDD0079;
	}

	public void setXDD0079(String XDD0079) {
		_XDD0079 = XDD0079;
	}

	public String getXDD0080() {
		return _XDD0080;
	}

	public void setXDD0080(String XDD0080) {
		_XDD0080 = XDD0080;
	}

	public String getXDD0081() {
		return _XDD0081;
	}

	public void setXDD0081(String XDD0081) {
		_XDD0081 = XDD0081;
	}

	public String getXDD0082() {
		return _XDD0082;
	}

	public void setXDD0082(String XDD0082) {
		_XDD0082 = XDD0082;
	}

	public String getXDD0083() {
		return _XDD0083;
	}

	public void setXDD0083(String XDD0083) {
		_XDD0083 = XDD0083;
	}

	public String getXDD0084() {
		return _XDD0084;
	}

	public void setXDD0084(String XDD0084) {
		_XDD0084 = XDD0084;
	}

	public String getXDD0085() {
		return _XDD0085;
	}

	public void setXDD0085(String XDD0085) {
		_XDD0085 = XDD0085;
	}

	public String getXDD0086() {
		return _XDD0086;
	}

	public void setXDD0086(String XDD0086) {
		_XDD0086 = XDD0086;
	}

	public String getXDD0087() {
		return _XDD0087;
	}

	public void setXDD0087(String XDD0087) {
		_XDD0087 = XDD0087;
	}

	public String getXDD0088() {
		return _XDD0088;
	}

	public void setXDD0088(String XDD0088) {
		_XDD0088 = XDD0088;
	}

	public String getXDD0089() {
		return _XDD0089;
	}

	public void setXDD0089(String XDD0089) {
		_XDD0089 = XDD0089;
	}

	public String getXDD0090() {
		return _XDD0090;
	}

	public void setXDD0090(String XDD0090) {
		_XDD0090 = XDD0090;
	}

	public String getXDD0091() {
		return _XDD0091;
	}

	public void setXDD0091(String XDD0091) {
		_XDD0091 = XDD0091;
	}

	public String getXDD0092() {
		return _XDD0092;
	}

	public void setXDD0092(String XDD0092) {
		_XDD0092 = XDD0092;
	}

	public String getXDD0093() {
		return _XDD0093;
	}

	public void setXDD0093(String XDD0093) {
		_XDD0093 = XDD0093;
	}

	public String getXDD0094() {
		return _XDD0094;
	}

	public void setXDD0094(String XDD0094) {
		_XDD0094 = XDD0094;
	}

	public String getXDD0095() {
		return _XDD0095;
	}

	public void setXDD0095(String XDD0095) {
		_XDD0095 = XDD0095;
	}

	public String getXDD0096() {
		return _XDD0096;
	}

	public void setXDD0096(String XDD0096) {
		_XDD0096 = XDD0096;
	}

	public String getXDD0097() {
		return _XDD0097;
	}

	public void setXDD0097(String XDD0097) {
		_XDD0097 = XDD0097;
	}

	public String getXDD0098() {
		return _XDD0098;
	}

	public void setXDD0098(String XDD0098) {
		_XDD0098 = XDD0098;
	}

	public String getXDD0099() {
		return _XDD0099;
	}

	public void setXDD0099(String XDD0099) {
		_XDD0099 = XDD0099;
	}

	public String getXDD0100() {
		return _XDD0100;
	}

	public void setXDD0100(String XDD0100) {
		_XDD0100 = XDD0100;
	}

	public String getXDD0101() {
		return _XDD0101;
	}

	public void setXDD0101(String XDD0101) {
		_XDD0101 = XDD0101;
	}

	public String getXDD0102() {
		return _XDD0102;
	}

	public void setXDD0102(String XDD0102) {
		_XDD0102 = XDD0102;
	}

	public String getXDD0103() {
		return _XDD0103;
	}

	public void setXDD0103(String XDD0103) {
		_XDD0103 = XDD0103;
	}

	public String getXDD0104() {
		return _XDD0104;
	}

	public void setXDD0104(String XDD0104) {
		_XDD0104 = XDD0104;
	}

	public String getXDD0105() {
		return _XDD0105;
	}

	public void setXDD0105(String XDD0105) {
		_XDD0105 = XDD0105;
	}

	public String getXDD0106() {
		return _XDD0106;
	}

	public void setXDD0106(String XDD0106) {
		_XDD0106 = XDD0106;
	}

	public String getXDD0107() {
		return _XDD0107;
	}

	public void setXDD0107(String XDD0107) {
		_XDD0107 = XDD0107;
	}

	public String getXDD0108() {
		return _XDD0108;
	}

	public void setXDD0108(String XDD0108) {
		_XDD0108 = XDD0108;
	}

	public String getXDD0109() {
		return _XDD0109;
	}

	public void setXDD0109(String XDD0109) {
		_XDD0109 = XDD0109;
	}

	public String getXDD0110() {
		return _XDD0110;
	}

	public void setXDD0110(String XDD0110) {
		_XDD0110 = XDD0110;
	}

	public String getXDD0111() {
		return _XDD0111;
	}

	public void setXDD0111(String XDD0111) {
		_XDD0111 = XDD0111;
	}

	public String getXDD0112() {
		return _XDD0112;
	}

	public void setXDD0112(String XDD0112) {
		_XDD0112 = XDD0112;
	}

	public String getXDD0113() {
		return _XDD0113;
	}

	public void setXDD0113(String XDD0113) {
		_XDD0113 = XDD0113;
	}

	public String getXDD0114() {
		return _XDD0114;
	}

	public void setXDD0114(String XDD0114) {
		_XDD0114 = XDD0114;
	}

	public String getXDD0115() {
		return _XDD0115;
	}

	public void setXDD0115(String XDD0115) {
		_XDD0115 = XDD0115;
	}

	public String getXDD0116() {
		return _XDD0116;
	}

	public void setXDD0116(String XDD0116) {
		_XDD0116 = XDD0116;
	}

	public String getXDD0117() {
		return _XDD0117;
	}

	public void setXDD0117(String XDD0117) {
		_XDD0117 = XDD0117;
	}

	public String getXDD0118() {
		return _XDD0118;
	}

	public void setXDD0118(String XDD0118) {
		_XDD0118 = XDD0118;
	}

	public String getXDD0119() {
		return _XDD0119;
	}

	public void setXDD0119(String XDD0119) {
		_XDD0119 = XDD0119;
	}

	public String getXDD0120() {
		return _XDD0120;
	}

	public void setXDD0120(String XDD0120) {
		_XDD0120 = XDD0120;
	}

	public String getXDD0121() {
		return _XDD0121;
	}

	public void setXDD0121(String XDD0121) {
		_XDD0121 = XDD0121;
	}

	public String getXDD0122() {
		return _XDD0122;
	}

	public void setXDD0122(String XDD0122) {
		_XDD0122 = XDD0122;
	}

	public String getXDD0123() {
		return _XDD0123;
	}

	public void setXDD0123(String XDD0123) {
		_XDD0123 = XDD0123;
	}

	public String getXDD0124() {
		return _XDD0124;
	}

	public void setXDD0124(String XDD0124) {
		_XDD0124 = XDD0124;
	}

	public String getXDD0125() {
		return _XDD0125;
	}

	public void setXDD0125(String XDD0125) {
		_XDD0125 = XDD0125;
	}

	public String getXDD0126() {
		return _XDD0126;
	}

	public void setXDD0126(String XDD0126) {
		_XDD0126 = XDD0126;
	}

	public String getXDD0127() {
		return _XDD0127;
	}

	public void setXDD0127(String XDD0127) {
		_XDD0127 = XDD0127;
	}

	public String getXDD0128() {
		return _XDD0128;
	}

	public void setXDD0128(String XDD0128) {
		_XDD0128 = XDD0128;
	}

	public String getXDD0129() {
		return _XDD0129;
	}

	public void setXDD0129(String XDD0129) {
		_XDD0129 = XDD0129;
	}

	public String getXDD0130() {
		return _XDD0130;
	}

	public void setXDD0130(String XDD0130) {
		_XDD0130 = XDD0130;
	}

	public String getXDD0131() {
		return _XDD0131;
	}

	public void setXDD0131(String XDD0131) {
		_XDD0131 = XDD0131;
	}

	public String getXDD0132() {
		return _XDD0132;
	}

	public void setXDD0132(String XDD0132) {
		_XDD0132 = XDD0132;
	}

	public String getXDD0133() {
		return _XDD0133;
	}

	public void setXDD0133(String XDD0133) {
		_XDD0133 = XDD0133;
	}

	public String getXDD0134() {
		return _XDD0134;
	}

	public void setXDD0134(String XDD0134) {
		_XDD0134 = XDD0134;
	}

	public String getXDD0135() {
		return _XDD0135;
	}

	public void setXDD0135(String XDD0135) {
		_XDD0135 = XDD0135;
	}

	public String getXDD0136() {
		return _XDD0136;
	}

	public void setXDD0136(String XDD0136) {
		_XDD0136 = XDD0136;
	}

	public String getXDD0137() {
		return _XDD0137;
	}

	public void setXDD0137(String XDD0137) {
		_XDD0137 = XDD0137;
	}

	public String getXDD0138() {
		return _XDD0138;
	}

	public void setXDD0138(String XDD0138) {
		_XDD0138 = XDD0138;
	}

	public String getXDD0139() {
		return _XDD0139;
	}

	public void setXDD0139(String XDD0139) {
		_XDD0139 = XDD0139;
	}

	public String getXDD0140() {
		return _XDD0140;
	}

	public void setXDD0140(String XDD0140) {
		_XDD0140 = XDD0140;
	}

	public String getXDD0141() {
		return _XDD0141;
	}

	public void setXDD0141(String XDD0141) {
		_XDD0141 = XDD0141;
	}

	public String getXDD0142() {
		return _XDD0142;
	}

	public void setXDD0142(String XDD0142) {
		_XDD0142 = XDD0142;
	}

	public String getXDD0143() {
		return _XDD0143;
	}

	public void setXDD0143(String XDD0143) {
		_XDD0143 = XDD0143;
	}

	public String getXDD0144() {
		return _XDD0144;
	}

	public void setXDD0144(String XDD0144) {
		_XDD0144 = XDD0144;
	}

	public String getXDD0145() {
		return _XDD0145;
	}

	public void setXDD0145(String XDD0145) {
		_XDD0145 = XDD0145;
	}

	public String getXDD0146() {
		return _XDD0146;
	}

	public void setXDD0146(String XDD0146) {
		_XDD0146 = XDD0146;
	}

	public String getXDD0147() {
		return _XDD0147;
	}

	public void setXDD0147(String XDD0147) {
		_XDD0147 = XDD0147;
	}

	public String getXDD0148() {
		return _XDD0148;
	}

	public void setXDD0148(String XDD0148) {
		_XDD0148 = XDD0148;
	}

	public String getXDD0149() {
		return _XDD0149;
	}

	public void setXDD0149(String XDD0149) {
		_XDD0149 = XDD0149;
	}

	public String getXDD0150() {
		return _XDD0150;
	}

	public void setXDD0150(String XDD0150) {
		_XDD0150 = XDD0150;
	}

	public String getXDD0151() {
		return _XDD0151;
	}

	public void setXDD0151(String XDD0151) {
		_XDD0151 = XDD0151;
	}

	public String getXDD0152() {
		return _XDD0152;
	}

	public void setXDD0152(String XDD0152) {
		_XDD0152 = XDD0152;
	}

	public String getXDD0153() {
		return _XDD0153;
	}

	public void setXDD0153(String XDD0153) {
		_XDD0153 = XDD0153;
	}

	public String getXDD0154() {
		return _XDD0154;
	}

	public void setXDD0154(String XDD0154) {
		_XDD0154 = XDD0154;
	}

	public String getXDD0155() {
		return _XDD0155;
	}

	public void setXDD0155(String XDD0155) {
		_XDD0155 = XDD0155;
	}

	public String getXDD0156() {
		return _XDD0156;
	}

	public void setXDD0156(String XDD0156) {
		_XDD0156 = XDD0156;
	}

	public String getXDD0157() {
		return _XDD0157;
	}

	public void setXDD0157(String XDD0157) {
		_XDD0157 = XDD0157;
	}

	public String getXDD0158() {
		return _XDD0158;
	}

	public void setXDD0158(String XDD0158) {
		_XDD0158 = XDD0158;
	}

	public String getXDD0159() {
		return _XDD0159;
	}

	public void setXDD0159(String XDD0159) {
		_XDD0159 = XDD0159;
	}

	public String getXDD0160() {
		return _XDD0160;
	}

	public void setXDD0160(String XDD0160) {
		_XDD0160 = XDD0160;
	}

	public String getXDD0161() {
		return _XDD0161;
	}

	public void setXDD0161(String XDD0161) {
		_XDD0161 = XDD0161;
	}

	public String getBBCNCLKLXDD001() {
		return _BBCNCLKLXDD001;
	}

	public void setBBCNCLKLXDD001(String BBCNCLKLXDD001) {
		_BBCNCLKLXDD001 = BBCNCLKLXDD001;
	}

	public String getBBCNCLKLXDD002() {
		return _BBCNCLKLXDD002;
	}

	public void setBBCNCLKLXDD002(String BBCNCLKLXDD002) {
		_BBCNCLKLXDD002 = BBCNCLKLXDD002;
	}

	public String getBBCNCLKLXDD003() {
		return _BBCNCLKLXDD003;
	}

	public void setBBCNCLKLXDD003(String BBCNCLKLXDD003) {
		_BBCNCLKLXDD003 = BBCNCLKLXDD003;
	}

	public String getBBCNCLKLXDD004() {
		return _BBCNCLKLXDD004;
	}

	public void setBBCNCLKLXDD004(String BBCNCLKLXDD004) {
		_BBCNCLKLXDD004 = BBCNCLKLXDD004;
	}

	public String getBBCNCLKLXDD005() {
		return _BBCNCLKLXDD005;
	}

	public void setBBCNCLKLXDD005(String BBCNCLKLXDD005) {
		_BBCNCLKLXDD005 = BBCNCLKLXDD005;
	}

	public String getBBCNCLKLXDD006() {
		return _BBCNCLKLXDD006;
	}

	public void setBBCNCLKLXDD006(String BBCNCLKLXDD006) {
		_BBCNCLKLXDD006 = BBCNCLKLXDD006;
	}

	public String getBBCNCLKLXDD007() {
		return _BBCNCLKLXDD007;
	}

	public void setBBCNCLKLXDD007(String BBCNCLKLXDD007) {
		_BBCNCLKLXDD007 = BBCNCLKLXDD007;
	}

	public String getBBCNCLKLXDD008() {
		return _BBCNCLKLXDD008;
	}

	public void setBBCNCLKLXDD008(String BBCNCLKLXDD008) {
		_BBCNCLKLXDD008 = BBCNCLKLXDD008;
	}

	public String getBBCNCLKLXDD009() {
		return _BBCNCLKLXDD009;
	}

	public void setBBCNCLKLXDD009(String BBCNCLKLXDD009) {
		_BBCNCLKLXDD009 = BBCNCLKLXDD009;
	}

	public String getBBCNCLKLXDD010() {
		return _BBCNCLKLXDD010;
	}

	public void setBBCNCLKLXDD010(String BBCNCLKLXDD010) {
		_BBCNCLKLXDD010 = BBCNCLKLXDD010;
	}

	public String getBBCNCLKLXDD011() {
		return _BBCNCLKLXDD011;
	}

	public void setBBCNCLKLXDD011(String BBCNCLKLXDD011) {
		_BBCNCLKLXDD011 = BBCNCLKLXDD011;
	}

	public String getBBCNCLKLXDD012() {
		return _BBCNCLKLXDD012;
	}

	public void setBBCNCLKLXDD012(String BBCNCLKLXDD012) {
		_BBCNCLKLXDD012 = BBCNCLKLXDD012;
	}

	public String getBBCNCLKLXDD013() {
		return _BBCNCLKLXDD013;
	}

	public void setBBCNCLKLXDD013(String BBCNCLKLXDD013) {
		_BBCNCLKLXDD013 = BBCNCLKLXDD013;
	}

	public String getBBCNCLKLXDD014() {
		return _BBCNCLKLXDD014;
	}

	public void setBBCNCLKLXDD014(String BBCNCLKLXDD014) {
		_BBCNCLKLXDD014 = BBCNCLKLXDD014;
	}

	public String getBBCNCLKLXDD015() {
		return _BBCNCLKLXDD015;
	}

	public void setBBCNCLKLXDD015(String BBCNCLKLXDD015) {
		_BBCNCLKLXDD015 = BBCNCLKLXDD015;
	}

	public String getBBCNCLKLXDD016() {
		return _BBCNCLKLXDD016;
	}

	public void setBBCNCLKLXDD016(String BBCNCLKLXDD016) {
		_BBCNCLKLXDD016 = BBCNCLKLXDD016;
	}

	public String getBBCNCLKLXDD019() {
		return _BBCNCLKLXDD019;
	}

	public void setBBCNCLKLXDD019(String BBCNCLKLXDD019) {
		_BBCNCLKLXDD019 = BBCNCLKLXDD019;
	}

	public String getBBCNCLKLXDD017() {
		return _BBCNCLKLXDD017;
	}

	public void setBBCNCLKLXDD017(String BBCNCLKLXDD017) {
		_BBCNCLKLXDD017 = BBCNCLKLXDD017;
	}

	public String getBBCNCLKLXDD020() {
		return _BBCNCLKLXDD020;
	}

	public void setBBCNCLKLXDD020(String BBCNCLKLXDD020) {
		_BBCNCLKLXDD020 = BBCNCLKLXDD020;
	}

	public String getBBCNCLKLXDD018() {
		return _BBCNCLKLXDD018;
	}

	public void setBBCNCLKLXDD018(String BBCNCLKLXDD018) {
		_BBCNCLKLXDD018 = BBCNCLKLXDD018;
	}

	public String getBBCNCLKLXDD021() {
		return _BBCNCLKLXDD021;
	}

	public void setBBCNCLKLXDD021(String BBCNCLKLXDD021) {
		_BBCNCLKLXDD021 = BBCNCLKLXDD021;
	}

	public String getBBCNCLKLXDD022() {
		return _BBCNCLKLXDD022;
	}

	public void setBBCNCLKLXDD022(String BBCNCLKLXDD022) {
		_BBCNCLKLXDD022 = BBCNCLKLXDD022;
	}

	public String getBBCNCLKLXDD023() {
		return _BBCNCLKLXDD023;
	}

	public void setBBCNCLKLXDD023(String BBCNCLKLXDD023) {
		_BBCNCLKLXDD023 = BBCNCLKLXDD023;
	}

	public String getBBCNCLKLXDD024() {
		return _BBCNCLKLXDD024;
	}

	public void setBBCNCLKLXDD024(String BBCNCLKLXDD024) {
		_BBCNCLKLXDD024 = BBCNCLKLXDD024;
	}

	public String getBBCNCLKLXDD025() {
		return _BBCNCLKLXDD025;
	}

	public void setBBCNCLKLXDD025(String BBCNCLKLXDD025) {
		_BBCNCLKLXDD025 = BBCNCLKLXDD025;
	}

	public String getBBCNCLKLXDD026() {
		return _BBCNCLKLXDD026;
	}

	public void setBBCNCLKLXDD026(String BBCNCLKLXDD026) {
		_BBCNCLKLXDD026 = BBCNCLKLXDD026;
	}

	public String getBBCNCLKLXDD027() {
		return _BBCNCLKLXDD027;
	}

	public void setBBCNCLKLXDD027(String BBCNCLKLXDD027) {
		_BBCNCLKLXDD027 = BBCNCLKLXDD027;
	}

	public String getBBCNCLKLXDD028() {
		return _BBCNCLKLXDD028;
	}

	public void setBBCNCLKLXDD028(String BBCNCLKLXDD028) {
		_BBCNCLKLXDD028 = BBCNCLKLXDD028;
	}

	public String getBBCNCLKLXDD029() {
		return _BBCNCLKLXDD029;
	}

	public void setBBCNCLKLXDD029(String BBCNCLKLXDD029) {
		_BBCNCLKLXDD029 = BBCNCLKLXDD029;
	}

	public String getBBCNCLKLXDD031() {
		return _BBCNCLKLXDD031;
	}

	public void setBBCNCLKLXDD031(String BBCNCLKLXDD031) {
		_BBCNCLKLXDD031 = BBCNCLKLXDD031;
	}

	public String getBBCNCLKLXDD032() {
		return _BBCNCLKLXDD032;
	}

	public void setBBCNCLKLXDD032(String BBCNCLKLXDD032) {
		_BBCNCLKLXDD032 = BBCNCLKLXDD032;
	}

	public String getBBCNCLKLXDD033() {
		return _BBCNCLKLXDD033;
	}

	public void setBBCNCLKLXDD033(String BBCNCLKLXDD033) {
		_BBCNCLKLXDD033 = BBCNCLKLXDD033;
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
	private String _XDD01001;
	private String _XDD01002;
	private String _XDD01003;
	private String _XDD01004;
	private String _XDD01005;
	private String _XDD01006;
	private String _XDD01007;
	private String _XDD01008;
	private String _XDD01009;
	private String _XDD01010;
	private String _XDD01011;
	private String _XDD01012;
	private String _XDD01013;
	private String _XDD01014;
	private String _XDD01016;
	private String _XDD01017;
	private String _XDD01019;
	private String _XDD01020;
	private String _XDD01021;
	private String _XDD01022;
	private String _XDD01024;
	private String _XDD01025;
	private String _XDD01026;
	private String _XDD01027;
	private String _XDD01028;
	private String _XDD01030;
	private String _XDD01031;
	private String _XDD01032;
	private String _XDD01033;
	private String _XDD01034;
	private String _XDD01035;
	private String _XDD01036;
	private String _XDD01037;
	private String _XDD01038;
	private String _XDD01039;
	private String _XDD01040;
	private String _XDD01041;
	private String _XDD01042;
	private String _XDD01043;
	private String _XDD01044;
	private String _XDD01045;
	private String _XDD01046;
	private String _XDD01047;
	private String _XDD01049;
	private String _XDD01050;
	private String _XDD01051;
	private String _XDD01052;
	private String _XDD01053;
	private String _XDD01054;
	private String _XDD01055;
	private String _XDD01056;
	private String _XDD01057;
	private String _XDD01058;
	private String _XDD01059;
	private String _XDD01060;
	private String _XDD0076;
	private String _XDD0077;
	private String _XDD0078;
	private String _XDD0079;
	private String _XDD0080;
	private String _XDD0081;
	private String _XDD0082;
	private String _XDD0083;
	private String _XDD0084;
	private String _XDD0085;
	private String _XDD0086;
	private String _XDD0087;
	private String _XDD0088;
	private String _XDD0089;
	private String _XDD0090;
	private String _XDD0091;
	private String _XDD0092;
	private String _XDD0093;
	private String _XDD0094;
	private String _XDD0095;
	private String _XDD0096;
	private String _XDD0097;
	private String _XDD0098;
	private String _XDD0099;
	private String _XDD0100;
	private String _XDD0101;
	private String _XDD0102;
	private String _XDD0103;
	private String _XDD0104;
	private String _XDD0105;
	private String _XDD0106;
	private String _XDD0107;
	private String _XDD0108;
	private String _XDD0109;
	private String _XDD0110;
	private String _XDD0111;
	private String _XDD0112;
	private String _XDD0113;
	private String _XDD0114;
	private String _XDD0115;
	private String _XDD0116;
	private String _XDD0117;
	private String _XDD0118;
	private String _XDD0119;
	private String _XDD0120;
	private String _XDD0121;
	private String _XDD0122;
	private String _XDD0123;
	private String _XDD0124;
	private String _XDD0125;
	private String _XDD0126;
	private String _XDD0127;
	private String _XDD0128;
	private String _XDD0129;
	private String _XDD0130;
	private String _XDD0131;
	private String _XDD0132;
	private String _XDD0133;
	private String _XDD0134;
	private String _XDD0135;
	private String _XDD0136;
	private String _XDD0137;
	private String _XDD0138;
	private String _XDD0139;
	private String _XDD0140;
	private String _XDD0141;
	private String _XDD0142;
	private String _XDD0143;
	private String _XDD0144;
	private String _XDD0145;
	private String _XDD0146;
	private String _XDD0147;
	private String _XDD0148;
	private String _XDD0149;
	private String _XDD0150;
	private String _XDD0151;
	private String _XDD0152;
	private String _XDD0153;
	private String _XDD0154;
	private String _XDD0155;
	private String _XDD0156;
	private String _XDD0157;
	private String _XDD0158;
	private String _XDD0159;
	private String _XDD0160;
	private String _XDD0161;
	private String _BBCNCLKLXDD001;
	private String _BBCNCLKLXDD002;
	private String _BBCNCLKLXDD003;
	private String _BBCNCLKLXDD004;
	private String _BBCNCLKLXDD005;
	private String _BBCNCLKLXDD006;
	private String _BBCNCLKLXDD007;
	private String _BBCNCLKLXDD008;
	private String _BBCNCLKLXDD009;
	private String _BBCNCLKLXDD010;
	private String _BBCNCLKLXDD011;
	private String _BBCNCLKLXDD012;
	private String _BBCNCLKLXDD013;
	private String _BBCNCLKLXDD014;
	private String _BBCNCLKLXDD015;
	private String _BBCNCLKLXDD016;
	private String _BBCNCLKLXDD019;
	private String _BBCNCLKLXDD017;
	private String _BBCNCLKLXDD020;
	private String _BBCNCLKLXDD018;
	private String _BBCNCLKLXDD021;
	private String _BBCNCLKLXDD022;
	private String _BBCNCLKLXDD023;
	private String _BBCNCLKLXDD024;
	private String _BBCNCLKLXDD025;
	private String _BBCNCLKLXDD026;
	private String _BBCNCLKLXDD027;
	private String _BBCNCLKLXDD028;
	private String _BBCNCLKLXDD029;
	private String _BBCNCLKLXDD031;
	private String _BBCNCLKLXDD032;
	private String _BBCNCLKLXDD033;
	private Date _modifyDate;
	private Date _syncDate;
}