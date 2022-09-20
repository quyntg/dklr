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
public class VRTechnicalSpec_XCGPart4Soap implements Serializable {
	public static VRTechnicalSpec_XCGPart4Soap toSoapModel(
		VRTechnicalSpec_XCGPart4 model) {
		VRTechnicalSpec_XCGPart4Soap soapModel = new VRTechnicalSpec_XCGPart4Soap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setConvertAssembleId(model.getConvertAssembleId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setReferenceUid(model.getReferenceUid());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDeliverableCode(model.getDeliverableCode());
		soapModel.setVehicleTypeCertificateId(model.getVehicleTypeCertificateId());
		soapModel.setXCG01496(model.getXCG01496());
		soapModel.setXCG01497(model.getXCG01497());
		soapModel.setXCG01498(model.getXCG01498());
		soapModel.setXCG01499(model.getXCG01499());
		soapModel.setXCG01500(model.getXCG01500());
		soapModel.setXCG01501(model.getXCG01501());
		soapModel.setXCG01502(model.getXCG01502());
		soapModel.setXCG01503(model.getXCG01503());
		soapModel.setXCG01504(model.getXCG01504());
		soapModel.setXCG01505(model.getXCG01505());
		soapModel.setXCG01506(model.getXCG01506());
		soapModel.setXCG01507(model.getXCG01507());
		soapModel.setXCG01508(model.getXCG01508());
		soapModel.setXCG01509(model.getXCG01509());
		soapModel.setXCG01510(model.getXCG01510());
		soapModel.setXCG01512(model.getXCG01512());
		soapModel.setXCG01513(model.getXCG01513());
		soapModel.setXCG01514(model.getXCG01514());
		soapModel.setXCG01515(model.getXCG01515());
		soapModel.setXCG01516(model.getXCG01516());
		soapModel.setXCG01517(model.getXCG01517());
		soapModel.setXCG01518(model.getXCG01518());
		soapModel.setXCG01519(model.getXCG01519());
		soapModel.setXCG01520(model.getXCG01520());
		soapModel.setXCG01521(model.getXCG01521());
		soapModel.setXCG01522(model.getXCG01522());
		soapModel.setXCG01523(model.getXCG01523());
		soapModel.setXCG01524(model.getXCG01524());
		soapModel.setXCG01525(model.getXCG01525());
		soapModel.setXCG01526(model.getXCG01526());
		soapModel.setXCG01527(model.getXCG01527());
		soapModel.setXCG01528(model.getXCG01528());
		soapModel.setXCG01529(model.getXCG01529());
		soapModel.setXCG01530(model.getXCG01530());
		soapModel.setXCG01531(model.getXCG01531());
		soapModel.setXCG01904(model.getXCG01904());
		soapModel.setXCG01533(model.getXCG01533());
		soapModel.setXCG01905(model.getXCG01905());
		soapModel.setXCG01534(model.getXCG01534());
		soapModel.setXCG01906(model.getXCG01906());
		soapModel.setXCG01535(model.getXCG01535());
		soapModel.setXCG01907(model.getXCG01907());
		soapModel.setXCG01536(model.getXCG01536());
		soapModel.setXCG01908(model.getXCG01908());
		soapModel.setXCG01537(model.getXCG01537());
		soapModel.setXCG01909(model.getXCG01909());
		soapModel.setXCG01538(model.getXCG01538());
		soapModel.setXCG01910(model.getXCG01910());
		soapModel.setXCG01539(model.getXCG01539());
		soapModel.setXCG11535(model.getXCG11535());
		soapModel.setXCG01541(model.getXCG01541());
		soapModel.setXCG01542(model.getXCG01542());
		soapModel.setXCG01911(model.getXCG01911());
		soapModel.setXCG01543(model.getXCG01543());
		soapModel.setXCG01912(model.getXCG01912());
		soapModel.setXCG01544(model.getXCG01544());
		soapModel.setXCG01545(model.getXCG01545());
		soapModel.setXCG01546(model.getXCG01546());
		soapModel.setXCG01547(model.getXCG01547());
		soapModel.setXCG01548(model.getXCG01548());
		soapModel.setXCG01913(model.getXCG01913());
		soapModel.setXCG01549(model.getXCG01549());
		soapModel.setXCG01914(model.getXCG01914());
		soapModel.setXCG01550(model.getXCG01550());
		soapModel.setXCG01551(model.getXCG01551());
		soapModel.setXCG01552(model.getXCG01552());
		soapModel.setXCG01553(model.getXCG01553());
		soapModel.setXCG01554(model.getXCG01554());
		soapModel.setXCG01915(model.getXCG01915());
		soapModel.setXCG01555(model.getXCG01555());
		soapModel.setXCG01556(model.getXCG01556());
		soapModel.setXCG01557(model.getXCG01557());
		soapModel.setXCG01558(model.getXCG01558());
		soapModel.setXCG01559(model.getXCG01559());
		soapModel.setXCG01560(model.getXCG01560());
		soapModel.setXCG01561(model.getXCG01561());
		soapModel.setXCG01916(model.getXCG01916());
		soapModel.setXCG01562(model.getXCG01562());
		soapModel.setXCG01917(model.getXCG01917());
		soapModel.setXCG01563(model.getXCG01563());
		soapModel.setXCG01918(model.getXCG01918());
		soapModel.setXCG01564(model.getXCG01564());
		soapModel.setXCG01565(model.getXCG01565());
		soapModel.setXCG01566(model.getXCG01566());
		soapModel.setXCG01567(model.getXCG01567());
		soapModel.setXCG01568(model.getXCG01568());
		soapModel.setXCG01919(model.getXCG01919());
		soapModel.setXCG01569(model.getXCG01569());
		soapModel.setXCG01570(model.getXCG01570());
		soapModel.setXCG01571(model.getXCG01571());
		soapModel.setXCG01572(model.getXCG01572());
		soapModel.setXCG01920(model.getXCG01920());
		soapModel.setXCG01573(model.getXCG01573());
		soapModel.setXCG01921(model.getXCG01921());
		soapModel.setXCG01574(model.getXCG01574());
		soapModel.setXCG01922(model.getXCG01922());
		soapModel.setXCG01575(model.getXCG01575());
		soapModel.setXCG01576(model.getXCG01576());
		soapModel.setXCG01577(model.getXCG01577());
		soapModel.setXCG01578(model.getXCG01578());
		soapModel.setXCG01579(model.getXCG01579());
		soapModel.setXCG01580(model.getXCG01580());
		soapModel.setXCG01581(model.getXCG01581());
		soapModel.setXCG01582(model.getXCG01582());
		soapModel.setXCG01583(model.getXCG01583());
		soapModel.setXCG01584(model.getXCG01584());
		soapModel.setXCG01585(model.getXCG01585());
		soapModel.setXCG01586(model.getXCG01586());
		soapModel.setXCG01587(model.getXCG01587());
		soapModel.setXCG01588(model.getXCG01588());
		soapModel.setXCG01589(model.getXCG01589());
		soapModel.setXCG01590(model.getXCG01590());
		soapModel.setXCG01591(model.getXCG01591());
		soapModel.setXCG01592(model.getXCG01592());
		soapModel.setXCG01593(model.getXCG01593());
		soapModel.setXCG01594(model.getXCG01594());
		soapModel.setXCG01595(model.getXCG01595());
		soapModel.setXCG01596(model.getXCG01596());
		soapModel.setXCG01597(model.getXCG01597());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRTechnicalSpec_XCGPart4Soap[] toSoapModels(
		VRTechnicalSpec_XCGPart4[] models) {
		VRTechnicalSpec_XCGPart4Soap[] soapModels = new VRTechnicalSpec_XCGPart4Soap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCGPart4Soap[][] toSoapModels(
		VRTechnicalSpec_XCGPart4[][] models) {
		VRTechnicalSpec_XCGPart4Soap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRTechnicalSpec_XCGPart4Soap[models.length][models[0].length];
		}
		else {
			soapModels = new VRTechnicalSpec_XCGPart4Soap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCGPart4Soap[] toSoapModels(
		List<VRTechnicalSpec_XCGPart4> models) {
		List<VRTechnicalSpec_XCGPart4Soap> soapModels = new ArrayList<VRTechnicalSpec_XCGPart4Soap>(models.size());

		for (VRTechnicalSpec_XCGPart4 model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRTechnicalSpec_XCGPart4Soap[soapModels.size()]);
	}

	public VRTechnicalSpec_XCGPart4Soap() {
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

	public String getXCG01496() {
		return _XCG01496;
	}

	public void setXCG01496(String XCG01496) {
		_XCG01496 = XCG01496;
	}

	public String getXCG01497() {
		return _XCG01497;
	}

	public void setXCG01497(String XCG01497) {
		_XCG01497 = XCG01497;
	}

	public String getXCG01498() {
		return _XCG01498;
	}

	public void setXCG01498(String XCG01498) {
		_XCG01498 = XCG01498;
	}

	public String getXCG01499() {
		return _XCG01499;
	}

	public void setXCG01499(String XCG01499) {
		_XCG01499 = XCG01499;
	}

	public String getXCG01500() {
		return _XCG01500;
	}

	public void setXCG01500(String XCG01500) {
		_XCG01500 = XCG01500;
	}

	public String getXCG01501() {
		return _XCG01501;
	}

	public void setXCG01501(String XCG01501) {
		_XCG01501 = XCG01501;
	}

	public String getXCG01502() {
		return _XCG01502;
	}

	public void setXCG01502(String XCG01502) {
		_XCG01502 = XCG01502;
	}

	public String getXCG01503() {
		return _XCG01503;
	}

	public void setXCG01503(String XCG01503) {
		_XCG01503 = XCG01503;
	}

	public String getXCG01504() {
		return _XCG01504;
	}

	public void setXCG01504(String XCG01504) {
		_XCG01504 = XCG01504;
	}

	public String getXCG01505() {
		return _XCG01505;
	}

	public void setXCG01505(String XCG01505) {
		_XCG01505 = XCG01505;
	}

	public String getXCG01506() {
		return _XCG01506;
	}

	public void setXCG01506(String XCG01506) {
		_XCG01506 = XCG01506;
	}

	public String getXCG01507() {
		return _XCG01507;
	}

	public void setXCG01507(String XCG01507) {
		_XCG01507 = XCG01507;
	}

	public String getXCG01508() {
		return _XCG01508;
	}

	public void setXCG01508(String XCG01508) {
		_XCG01508 = XCG01508;
	}

	public String getXCG01509() {
		return _XCG01509;
	}

	public void setXCG01509(String XCG01509) {
		_XCG01509 = XCG01509;
	}

	public String getXCG01510() {
		return _XCG01510;
	}

	public void setXCG01510(String XCG01510) {
		_XCG01510 = XCG01510;
	}

	public String getXCG01512() {
		return _XCG01512;
	}

	public void setXCG01512(String XCG01512) {
		_XCG01512 = XCG01512;
	}

	public String getXCG01513() {
		return _XCG01513;
	}

	public void setXCG01513(String XCG01513) {
		_XCG01513 = XCG01513;
	}

	public String getXCG01514() {
		return _XCG01514;
	}

	public void setXCG01514(String XCG01514) {
		_XCG01514 = XCG01514;
	}

	public String getXCG01515() {
		return _XCG01515;
	}

	public void setXCG01515(String XCG01515) {
		_XCG01515 = XCG01515;
	}

	public String getXCG01516() {
		return _XCG01516;
	}

	public void setXCG01516(String XCG01516) {
		_XCG01516 = XCG01516;
	}

	public String getXCG01517() {
		return _XCG01517;
	}

	public void setXCG01517(String XCG01517) {
		_XCG01517 = XCG01517;
	}

	public String getXCG01518() {
		return _XCG01518;
	}

	public void setXCG01518(String XCG01518) {
		_XCG01518 = XCG01518;
	}

	public String getXCG01519() {
		return _XCG01519;
	}

	public void setXCG01519(String XCG01519) {
		_XCG01519 = XCG01519;
	}

	public String getXCG01520() {
		return _XCG01520;
	}

	public void setXCG01520(String XCG01520) {
		_XCG01520 = XCG01520;
	}

	public String getXCG01521() {
		return _XCG01521;
	}

	public void setXCG01521(String XCG01521) {
		_XCG01521 = XCG01521;
	}

	public String getXCG01522() {
		return _XCG01522;
	}

	public void setXCG01522(String XCG01522) {
		_XCG01522 = XCG01522;
	}

	public String getXCG01523() {
		return _XCG01523;
	}

	public void setXCG01523(String XCG01523) {
		_XCG01523 = XCG01523;
	}

	public String getXCG01524() {
		return _XCG01524;
	}

	public void setXCG01524(String XCG01524) {
		_XCG01524 = XCG01524;
	}

	public String getXCG01525() {
		return _XCG01525;
	}

	public void setXCG01525(String XCG01525) {
		_XCG01525 = XCG01525;
	}

	public String getXCG01526() {
		return _XCG01526;
	}

	public void setXCG01526(String XCG01526) {
		_XCG01526 = XCG01526;
	}

	public String getXCG01527() {
		return _XCG01527;
	}

	public void setXCG01527(String XCG01527) {
		_XCG01527 = XCG01527;
	}

	public String getXCG01528() {
		return _XCG01528;
	}

	public void setXCG01528(String XCG01528) {
		_XCG01528 = XCG01528;
	}

	public String getXCG01529() {
		return _XCG01529;
	}

	public void setXCG01529(String XCG01529) {
		_XCG01529 = XCG01529;
	}

	public String getXCG01530() {
		return _XCG01530;
	}

	public void setXCG01530(String XCG01530) {
		_XCG01530 = XCG01530;
	}

	public String getXCG01531() {
		return _XCG01531;
	}

	public void setXCG01531(String XCG01531) {
		_XCG01531 = XCG01531;
	}

	public String getXCG01904() {
		return _XCG01904;
	}

	public void setXCG01904(String XCG01904) {
		_XCG01904 = XCG01904;
	}

	public String getXCG01533() {
		return _XCG01533;
	}

	public void setXCG01533(String XCG01533) {
		_XCG01533 = XCG01533;
	}

	public String getXCG01905() {
		return _XCG01905;
	}

	public void setXCG01905(String XCG01905) {
		_XCG01905 = XCG01905;
	}

	public String getXCG01534() {
		return _XCG01534;
	}

	public void setXCG01534(String XCG01534) {
		_XCG01534 = XCG01534;
	}

	public String getXCG01906() {
		return _XCG01906;
	}

	public void setXCG01906(String XCG01906) {
		_XCG01906 = XCG01906;
	}

	public String getXCG01535() {
		return _XCG01535;
	}

	public void setXCG01535(String XCG01535) {
		_XCG01535 = XCG01535;
	}

	public String getXCG01907() {
		return _XCG01907;
	}

	public void setXCG01907(String XCG01907) {
		_XCG01907 = XCG01907;
	}

	public String getXCG01536() {
		return _XCG01536;
	}

	public void setXCG01536(String XCG01536) {
		_XCG01536 = XCG01536;
	}

	public String getXCG01908() {
		return _XCG01908;
	}

	public void setXCG01908(String XCG01908) {
		_XCG01908 = XCG01908;
	}

	public String getXCG01537() {
		return _XCG01537;
	}

	public void setXCG01537(String XCG01537) {
		_XCG01537 = XCG01537;
	}

	public String getXCG01909() {
		return _XCG01909;
	}

	public void setXCG01909(String XCG01909) {
		_XCG01909 = XCG01909;
	}

	public String getXCG01538() {
		return _XCG01538;
	}

	public void setXCG01538(String XCG01538) {
		_XCG01538 = XCG01538;
	}

	public String getXCG01910() {
		return _XCG01910;
	}

	public void setXCG01910(String XCG01910) {
		_XCG01910 = XCG01910;
	}

	public String getXCG01539() {
		return _XCG01539;
	}

	public void setXCG01539(String XCG01539) {
		_XCG01539 = XCG01539;
	}

	public String getXCG11535() {
		return _XCG11535;
	}

	public void setXCG11535(String XCG11535) {
		_XCG11535 = XCG11535;
	}

	public String getXCG01541() {
		return _XCG01541;
	}

	public void setXCG01541(String XCG01541) {
		_XCG01541 = XCG01541;
	}

	public String getXCG01542() {
		return _XCG01542;
	}

	public void setXCG01542(String XCG01542) {
		_XCG01542 = XCG01542;
	}

	public String getXCG01911() {
		return _XCG01911;
	}

	public void setXCG01911(String XCG01911) {
		_XCG01911 = XCG01911;
	}

	public String getXCG01543() {
		return _XCG01543;
	}

	public void setXCG01543(String XCG01543) {
		_XCG01543 = XCG01543;
	}

	public String getXCG01912() {
		return _XCG01912;
	}

	public void setXCG01912(String XCG01912) {
		_XCG01912 = XCG01912;
	}

	public String getXCG01544() {
		return _XCG01544;
	}

	public void setXCG01544(String XCG01544) {
		_XCG01544 = XCG01544;
	}

	public String getXCG01545() {
		return _XCG01545;
	}

	public void setXCG01545(String XCG01545) {
		_XCG01545 = XCG01545;
	}

	public String getXCG01546() {
		return _XCG01546;
	}

	public void setXCG01546(String XCG01546) {
		_XCG01546 = XCG01546;
	}

	public String getXCG01547() {
		return _XCG01547;
	}

	public void setXCG01547(String XCG01547) {
		_XCG01547 = XCG01547;
	}

	public String getXCG01548() {
		return _XCG01548;
	}

	public void setXCG01548(String XCG01548) {
		_XCG01548 = XCG01548;
	}

	public String getXCG01913() {
		return _XCG01913;
	}

	public void setXCG01913(String XCG01913) {
		_XCG01913 = XCG01913;
	}

	public String getXCG01549() {
		return _XCG01549;
	}

	public void setXCG01549(String XCG01549) {
		_XCG01549 = XCG01549;
	}

	public String getXCG01914() {
		return _XCG01914;
	}

	public void setXCG01914(String XCG01914) {
		_XCG01914 = XCG01914;
	}

	public String getXCG01550() {
		return _XCG01550;
	}

	public void setXCG01550(String XCG01550) {
		_XCG01550 = XCG01550;
	}

	public String getXCG01551() {
		return _XCG01551;
	}

	public void setXCG01551(String XCG01551) {
		_XCG01551 = XCG01551;
	}

	public String getXCG01552() {
		return _XCG01552;
	}

	public void setXCG01552(String XCG01552) {
		_XCG01552 = XCG01552;
	}

	public String getXCG01553() {
		return _XCG01553;
	}

	public void setXCG01553(String XCG01553) {
		_XCG01553 = XCG01553;
	}

	public String getXCG01554() {
		return _XCG01554;
	}

	public void setXCG01554(String XCG01554) {
		_XCG01554 = XCG01554;
	}

	public String getXCG01915() {
		return _XCG01915;
	}

	public void setXCG01915(String XCG01915) {
		_XCG01915 = XCG01915;
	}

	public String getXCG01555() {
		return _XCG01555;
	}

	public void setXCG01555(String XCG01555) {
		_XCG01555 = XCG01555;
	}

	public String getXCG01556() {
		return _XCG01556;
	}

	public void setXCG01556(String XCG01556) {
		_XCG01556 = XCG01556;
	}

	public String getXCG01557() {
		return _XCG01557;
	}

	public void setXCG01557(String XCG01557) {
		_XCG01557 = XCG01557;
	}

	public String getXCG01558() {
		return _XCG01558;
	}

	public void setXCG01558(String XCG01558) {
		_XCG01558 = XCG01558;
	}

	public String getXCG01559() {
		return _XCG01559;
	}

	public void setXCG01559(String XCG01559) {
		_XCG01559 = XCG01559;
	}

	public String getXCG01560() {
		return _XCG01560;
	}

	public void setXCG01560(String XCG01560) {
		_XCG01560 = XCG01560;
	}

	public String getXCG01561() {
		return _XCG01561;
	}

	public void setXCG01561(String XCG01561) {
		_XCG01561 = XCG01561;
	}

	public String getXCG01916() {
		return _XCG01916;
	}

	public void setXCG01916(String XCG01916) {
		_XCG01916 = XCG01916;
	}

	public String getXCG01562() {
		return _XCG01562;
	}

	public void setXCG01562(String XCG01562) {
		_XCG01562 = XCG01562;
	}

	public String getXCG01917() {
		return _XCG01917;
	}

	public void setXCG01917(String XCG01917) {
		_XCG01917 = XCG01917;
	}

	public String getXCG01563() {
		return _XCG01563;
	}

	public void setXCG01563(String XCG01563) {
		_XCG01563 = XCG01563;
	}

	public String getXCG01918() {
		return _XCG01918;
	}

	public void setXCG01918(String XCG01918) {
		_XCG01918 = XCG01918;
	}

	public String getXCG01564() {
		return _XCG01564;
	}

	public void setXCG01564(String XCG01564) {
		_XCG01564 = XCG01564;
	}

	public String getXCG01565() {
		return _XCG01565;
	}

	public void setXCG01565(String XCG01565) {
		_XCG01565 = XCG01565;
	}

	public String getXCG01566() {
		return _XCG01566;
	}

	public void setXCG01566(String XCG01566) {
		_XCG01566 = XCG01566;
	}

	public String getXCG01567() {
		return _XCG01567;
	}

	public void setXCG01567(String XCG01567) {
		_XCG01567 = XCG01567;
	}

	public String getXCG01568() {
		return _XCG01568;
	}

	public void setXCG01568(String XCG01568) {
		_XCG01568 = XCG01568;
	}

	public String getXCG01919() {
		return _XCG01919;
	}

	public void setXCG01919(String XCG01919) {
		_XCG01919 = XCG01919;
	}

	public String getXCG01569() {
		return _XCG01569;
	}

	public void setXCG01569(String XCG01569) {
		_XCG01569 = XCG01569;
	}

	public String getXCG01570() {
		return _XCG01570;
	}

	public void setXCG01570(String XCG01570) {
		_XCG01570 = XCG01570;
	}

	public String getXCG01571() {
		return _XCG01571;
	}

	public void setXCG01571(String XCG01571) {
		_XCG01571 = XCG01571;
	}

	public String getXCG01572() {
		return _XCG01572;
	}

	public void setXCG01572(String XCG01572) {
		_XCG01572 = XCG01572;
	}

	public String getXCG01920() {
		return _XCG01920;
	}

	public void setXCG01920(String XCG01920) {
		_XCG01920 = XCG01920;
	}

	public String getXCG01573() {
		return _XCG01573;
	}

	public void setXCG01573(String XCG01573) {
		_XCG01573 = XCG01573;
	}

	public String getXCG01921() {
		return _XCG01921;
	}

	public void setXCG01921(String XCG01921) {
		_XCG01921 = XCG01921;
	}

	public String getXCG01574() {
		return _XCG01574;
	}

	public void setXCG01574(String XCG01574) {
		_XCG01574 = XCG01574;
	}

	public String getXCG01922() {
		return _XCG01922;
	}

	public void setXCG01922(String XCG01922) {
		_XCG01922 = XCG01922;
	}

	public String getXCG01575() {
		return _XCG01575;
	}

	public void setXCG01575(String XCG01575) {
		_XCG01575 = XCG01575;
	}

	public String getXCG01576() {
		return _XCG01576;
	}

	public void setXCG01576(String XCG01576) {
		_XCG01576 = XCG01576;
	}

	public String getXCG01577() {
		return _XCG01577;
	}

	public void setXCG01577(String XCG01577) {
		_XCG01577 = XCG01577;
	}

	public String getXCG01578() {
		return _XCG01578;
	}

	public void setXCG01578(String XCG01578) {
		_XCG01578 = XCG01578;
	}

	public String getXCG01579() {
		return _XCG01579;
	}

	public void setXCG01579(String XCG01579) {
		_XCG01579 = XCG01579;
	}

	public String getXCG01580() {
		return _XCG01580;
	}

	public void setXCG01580(String XCG01580) {
		_XCG01580 = XCG01580;
	}

	public String getXCG01581() {
		return _XCG01581;
	}

	public void setXCG01581(String XCG01581) {
		_XCG01581 = XCG01581;
	}

	public String getXCG01582() {
		return _XCG01582;
	}

	public void setXCG01582(String XCG01582) {
		_XCG01582 = XCG01582;
	}

	public String getXCG01583() {
		return _XCG01583;
	}

	public void setXCG01583(String XCG01583) {
		_XCG01583 = XCG01583;
	}

	public String getXCG01584() {
		return _XCG01584;
	}

	public void setXCG01584(String XCG01584) {
		_XCG01584 = XCG01584;
	}

	public String getXCG01585() {
		return _XCG01585;
	}

	public void setXCG01585(String XCG01585) {
		_XCG01585 = XCG01585;
	}

	public String getXCG01586() {
		return _XCG01586;
	}

	public void setXCG01586(String XCG01586) {
		_XCG01586 = XCG01586;
	}

	public String getXCG01587() {
		return _XCG01587;
	}

	public void setXCG01587(String XCG01587) {
		_XCG01587 = XCG01587;
	}

	public String getXCG01588() {
		return _XCG01588;
	}

	public void setXCG01588(String XCG01588) {
		_XCG01588 = XCG01588;
	}

	public String getXCG01589() {
		return _XCG01589;
	}

	public void setXCG01589(String XCG01589) {
		_XCG01589 = XCG01589;
	}

	public String getXCG01590() {
		return _XCG01590;
	}

	public void setXCG01590(String XCG01590) {
		_XCG01590 = XCG01590;
	}

	public String getXCG01591() {
		return _XCG01591;
	}

	public void setXCG01591(String XCG01591) {
		_XCG01591 = XCG01591;
	}

	public String getXCG01592() {
		return _XCG01592;
	}

	public void setXCG01592(String XCG01592) {
		_XCG01592 = XCG01592;
	}

	public String getXCG01593() {
		return _XCG01593;
	}

	public void setXCG01593(String XCG01593) {
		_XCG01593 = XCG01593;
	}

	public String getXCG01594() {
		return _XCG01594;
	}

	public void setXCG01594(String XCG01594) {
		_XCG01594 = XCG01594;
	}

	public String getXCG01595() {
		return _XCG01595;
	}

	public void setXCG01595(String XCG01595) {
		_XCG01595 = XCG01595;
	}

	public String getXCG01596() {
		return _XCG01596;
	}

	public void setXCG01596(String XCG01596) {
		_XCG01596 = XCG01596;
	}

	public String getXCG01597() {
		return _XCG01597;
	}

	public void setXCG01597(String XCG01597) {
		_XCG01597 = XCG01597;
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
	private String _XCG01496;
	private String _XCG01497;
	private String _XCG01498;
	private String _XCG01499;
	private String _XCG01500;
	private String _XCG01501;
	private String _XCG01502;
	private String _XCG01503;
	private String _XCG01504;
	private String _XCG01505;
	private String _XCG01506;
	private String _XCG01507;
	private String _XCG01508;
	private String _XCG01509;
	private String _XCG01510;
	private String _XCG01512;
	private String _XCG01513;
	private String _XCG01514;
	private String _XCG01515;
	private String _XCG01516;
	private String _XCG01517;
	private String _XCG01518;
	private String _XCG01519;
	private String _XCG01520;
	private String _XCG01521;
	private String _XCG01522;
	private String _XCG01523;
	private String _XCG01524;
	private String _XCG01525;
	private String _XCG01526;
	private String _XCG01527;
	private String _XCG01528;
	private String _XCG01529;
	private String _XCG01530;
	private String _XCG01531;
	private String _XCG01904;
	private String _XCG01533;
	private String _XCG01905;
	private String _XCG01534;
	private String _XCG01906;
	private String _XCG01535;
	private String _XCG01907;
	private String _XCG01536;
	private String _XCG01908;
	private String _XCG01537;
	private String _XCG01909;
	private String _XCG01538;
	private String _XCG01910;
	private String _XCG01539;
	private String _XCG11535;
	private String _XCG01541;
	private String _XCG01542;
	private String _XCG01911;
	private String _XCG01543;
	private String _XCG01912;
	private String _XCG01544;
	private String _XCG01545;
	private String _XCG01546;
	private String _XCG01547;
	private String _XCG01548;
	private String _XCG01913;
	private String _XCG01549;
	private String _XCG01914;
	private String _XCG01550;
	private String _XCG01551;
	private String _XCG01552;
	private String _XCG01553;
	private String _XCG01554;
	private String _XCG01915;
	private String _XCG01555;
	private String _XCG01556;
	private String _XCG01557;
	private String _XCG01558;
	private String _XCG01559;
	private String _XCG01560;
	private String _XCG01561;
	private String _XCG01916;
	private String _XCG01562;
	private String _XCG01917;
	private String _XCG01563;
	private String _XCG01918;
	private String _XCG01564;
	private String _XCG01565;
	private String _XCG01566;
	private String _XCG01567;
	private String _XCG01568;
	private String _XCG01919;
	private String _XCG01569;
	private String _XCG01570;
	private String _XCG01571;
	private String _XCG01572;
	private String _XCG01920;
	private String _XCG01573;
	private String _XCG01921;
	private String _XCG01574;
	private String _XCG01922;
	private String _XCG01575;
	private String _XCG01576;
	private String _XCG01577;
	private String _XCG01578;
	private String _XCG01579;
	private String _XCG01580;
	private String _XCG01581;
	private String _XCG01582;
	private String _XCG01583;
	private String _XCG01584;
	private String _XCG01585;
	private String _XCG01586;
	private String _XCG01587;
	private String _XCG01588;
	private String _XCG01589;
	private String _XCG01590;
	private String _XCG01591;
	private String _XCG01592;
	private String _XCG01593;
	private String _XCG01594;
	private String _XCG01595;
	private String _XCG01596;
	private String _XCG01597;
	private Date _modifyDate;
	private Date _syncDate;
}