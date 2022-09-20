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
public class VRTechnicalSpec_XCGPart6Soap implements Serializable {
	public static VRTechnicalSpec_XCGPart6Soap toSoapModel(
		VRTechnicalSpec_XCGPart6 model) {
		VRTechnicalSpec_XCGPart6Soap soapModel = new VRTechnicalSpec_XCGPart6Soap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setConvertAssembleId(model.getConvertAssembleId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setReferenceUid(model.getReferenceUid());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDeliverableCode(model.getDeliverableCode());
		soapModel.setVehicleTypeCertificateId(model.getVehicleTypeCertificateId());
		soapModel.setXCG01757(model.getXCG01757());
		soapModel.setXCG01758(model.getXCG01758());
		soapModel.setXCG01759(model.getXCG01759());
		soapModel.setXCG01948(model.getXCG01948());
		soapModel.setXCG01760(model.getXCG01760());
		soapModel.setXCG01949(model.getXCG01949());
		soapModel.setXCG01761(model.getXCG01761());
		soapModel.setXCG01950(model.getXCG01950());
		soapModel.setXCG01762(model.getXCG01762());
		soapModel.setXCG01951(model.getXCG01951());
		soapModel.setXCG01763(model.getXCG01763());
		soapModel.setXCG01952(model.getXCG01952());
		soapModel.setXCG01764(model.getXCG01764());
		soapModel.setXCG01953(model.getXCG01953());
		soapModel.setXCG01765(model.getXCG01765());
		soapModel.setXCG01954(model.getXCG01954());
		soapModel.setXCG01766(model.getXCG01766());
		soapModel.setXCG01955(model.getXCG01955());
		soapModel.setXCG01767(model.getXCG01767());
		soapModel.setXCG01956(model.getXCG01956());
		soapModel.setXCG01768(model.getXCG01768());
		soapModel.setXCG01957(model.getXCG01957());
		soapModel.setXCG01769(model.getXCG01769());
		soapModel.setXCG01958(model.getXCG01958());
		soapModel.setXCG01770(model.getXCG01770());
		soapModel.setXCG01771(model.getXCG01771());
		soapModel.setXCG01959(model.getXCG01959());
		soapModel.setXCG01772(model.getXCG01772());
		soapModel.setXCG01773(model.getXCG01773());
		soapModel.setXCG01774(model.getXCG01774());
		soapModel.setXCG01775(model.getXCG01775());
		soapModel.setXCG01776(model.getXCG01776());
		soapModel.setXCG01777(model.getXCG01777());
		soapModel.setXCG01778(model.getXCG01778());
		soapModel.setXCG01779(model.getXCG01779());
		soapModel.setXCG01780(model.getXCG01780());
		soapModel.setXCG01781(model.getXCG01781());
		soapModel.setXCG01783(model.getXCG01783());
		soapModel.setXCG01785(model.getXCG01785());
		soapModel.setXCG01786(model.getXCG01786());
		soapModel.setXCG01787(model.getXCG01787());
		soapModel.setXCG01788(model.getXCG01788());
		soapModel.setXCG01789(model.getXCG01789());
		soapModel.setXCG01790(model.getXCG01790());
		soapModel.setXCG01791(model.getXCG01791());
		soapModel.setXCG01792(model.getXCG01792());
		soapModel.setXCG01793(model.getXCG01793());
		soapModel.setXCG01794(model.getXCG01794());
		soapModel.setXCG01795(model.getXCG01795());
		soapModel.setXCG01796(model.getXCG01796());
		soapModel.setXCG01797(model.getXCG01797());
		soapModel.setXCG01798(model.getXCG01798());
		soapModel.setXCG01799(model.getXCG01799());
		soapModel.setXCG01801(model.getXCG01801());
		soapModel.setXCG01802(model.getXCG01802());
		soapModel.setXCG01803(model.getXCG01803());
		soapModel.setXCG01804(model.getXCG01804());
		soapModel.setXCG01805(model.getXCG01805());
		soapModel.setXCG01806(model.getXCG01806());
		soapModel.setXCG01807(model.getXCG01807());
		soapModel.setXCG01808(model.getXCG01808());
		soapModel.setXCG01809(model.getXCG01809());
		soapModel.setXCG01810(model.getXCG01810());
		soapModel.setXCG01811(model.getXCG01811());
		soapModel.setXCG01812(model.getXCG01812());
		soapModel.setXCG01813(model.getXCG01813());
		soapModel.setXCG01814(model.getXCG01814());
		soapModel.setTDTKXCG001(model.getTDTKXCG001());
		soapModel.setTDTKXCG002(model.getTDTKXCG002());
		soapModel.setTDTKXCG003(model.getTDTKXCG003());
		soapModel.setTDTKXCG004(model.getTDTKXCG004());
		soapModel.setTDTKXCG005(model.getTDTKXCG005());
		soapModel.setTDTKXCG006(model.getTDTKXCG006());
		soapModel.setTDTKXCG007(model.getTDTKXCG007());
		soapModel.setTDTKXCG008(model.getTDTKXCG008());
		soapModel.setTDTKXCG009(model.getTDTKXCG009());
		soapModel.setTDTKXCG010(model.getTDTKXCG010());
		soapModel.setTDTKXCG011(model.getTDTKXCG011());
		soapModel.setTDTKXCG012(model.getTDTKXCG012());
		soapModel.setTDTKXCG013(model.getTDTKXCG013());
		soapModel.setTDTKXCG014(model.getTDTKXCG014());
		soapModel.setTDTKXCG015(model.getTDTKXCG015());
		soapModel.setTDTKXCG016(model.getTDTKXCG016());
		soapModel.setTDTKXCG017(model.getTDTKXCG017());
		soapModel.setTDTKXCG018(model.getTDTKXCG018());
		soapModel.setTDTKXCG019(model.getTDTKXCG019());
		soapModel.setTDTKXCG020(model.getTDTKXCG020());
		soapModel.setTDTKXCG021(model.getTDTKXCG021());
		soapModel.setTDTKXCG022(model.getTDTKXCG022());
		soapModel.setTDTKXCG023(model.getTDTKXCG023());
		soapModel.setTDTKXCG024(model.getTDTKXCG024());
		soapModel.setTDTKXCG025(model.getTDTKXCG025());
		soapModel.setTDTKXCG026(model.getTDTKXCG026());
		soapModel.setTDTKXCG027(model.getTDTKXCG027());
		soapModel.setTDTKXCG028(model.getTDTKXCG028());
		soapModel.setTDTKXCG029(model.getTDTKXCG029());
		soapModel.setTDTKXCG030(model.getTDTKXCG030());
		soapModel.setTDTKXCG031(model.getTDTKXCG031());
		soapModel.setTDTKXCG032(model.getTDTKXCG032());
		soapModel.setTDTKXCG033(model.getTDTKXCG033());
		soapModel.setTDTKXCG034(model.getTDTKXCG034());
		soapModel.setTDTKXCG035(model.getTDTKXCG035());
		soapModel.setTDTKXCG036(model.getTDTKXCG036());
		soapModel.setBBCNCLKLXCG01(model.getBBCNCLKLXCG01());
		soapModel.setBBCNCLKLXCG02(model.getBBCNCLKLXCG02());
		soapModel.setBBCNCLKLXCG03(model.getBBCNCLKLXCG03());
		soapModel.setBBCNCLKLXCG04(model.getBBCNCLKLXCG04());
		soapModel.setBBCNCLKLXCG05(model.getBBCNCLKLXCG05());
		soapModel.setBBCNCLKLXCG06(model.getBBCNCLKLXCG06());
		soapModel.setBBCNCLKLXCG07(model.getBBCNCLKLXCG07());
		soapModel.setBBCNCLKLXCG08(model.getBBCNCLKLXCG08());
		soapModel.setBBCNCLKLXCG09(model.getBBCNCLKLXCG09());
		soapModel.setBBCNCLKLXCG10(model.getBBCNCLKLXCG10());
		soapModel.setBBCNCLKLXCG11(model.getBBCNCLKLXCG11());
		soapModel.setBBCNCLKLXCG12(model.getBBCNCLKLXCG12());
		soapModel.setBBCNCLKLXCG13(model.getBBCNCLKLXCG13());
		soapModel.setBBCNCLKLXCG14(model.getBBCNCLKLXCG14());
		soapModel.setBBCNCLKLXCG15(model.getBBCNCLKLXCG15());
		soapModel.setBBCNCLKLXCG16(model.getBBCNCLKLXCG16());
		soapModel.setBBCNCLKLXCG17(model.getBBCNCLKLXCG17());
		soapModel.setBBCNCLKLXCG18(model.getBBCNCLKLXCG18());
		soapModel.setBBCNCLKLXCG19(model.getBBCNCLKLXCG19());
		soapModel.setBBCNCLKLXCG20(model.getBBCNCLKLXCG20());
		soapModel.setBBCNCLKLXCG21(model.getBBCNCLKLXCG21());
		soapModel.setBBCNCLKLXCG22(model.getBBCNCLKLXCG22());
		soapModel.setBBCNCLKLXCG23(model.getBBCNCLKLXCG23());
		soapModel.setBBCNCLKLXCG24(model.getBBCNCLKLXCG24());
		soapModel.setBBCNCLKLXCG26(model.getBBCNCLKLXCG26());
		soapModel.setBBCNCLKLXCG27(model.getBBCNCLKLXCG27());
		soapModel.setBBCNCLKLXCG28(model.getBBCNCLKLXCG28());
		soapModel.setBBCNCLKLXCG29(model.getBBCNCLKLXCG29());
		soapModel.setBBCNCLKLXCG30(model.getBBCNCLKLXCG30());
		soapModel.setBBCNCLKLXCG31(model.getBBCNCLKLXCG31());
		soapModel.setBBCNCLKLXCG33(model.getBBCNCLKLXCG33());
		soapModel.setBBCNCLKLXCG34(model.getBBCNCLKLXCG34());
		soapModel.setBBCNCLKLXCG35(model.getBBCNCLKLXCG35());
		soapModel.setBBCNCLKLXCG36(model.getBBCNCLKLXCG36());
		soapModel.setBBCNCLKLXCG38(model.getBBCNCLKLXCG38());
		soapModel.setBBCNCLKLXCG39(model.getBBCNCLKLXCG39());
		soapModel.setBBCNCLKLXCG40(model.getBBCNCLKLXCG40());
		soapModel.setBBCNCLKLXCG42(model.getBBCNCLKLXCG42());
		soapModel.setBBCNCLKLXCG43(model.getBBCNCLKLXCG43());
		soapModel.setBBCNCLKLXCG44(model.getBBCNCLKLXCG44());
		soapModel.setBBCNCLKLXCG45(model.getBBCNCLKLXCG45());
		soapModel.setBBCNCLKLXCG46(model.getBBCNCLKLXCG46());
		soapModel.setBBCNCLKLXCG47(model.getBBCNCLKLXCG47());
		soapModel.setBBCNCLKLXCG48(model.getBBCNCLKLXCG48());
		soapModel.setBBCNCLKLXCG49(model.getBBCNCLKLXCG49());
		soapModel.setBBCNCLKLXCG50(model.getBBCNCLKLXCG50());
		soapModel.setBBCNCLKLXCG51(model.getBBCNCLKLXCG51());
		soapModel.setBBCNCLKLXCG52(model.getBBCNCLKLXCG52());
		soapModel.setBBCNCLKLXCG53(model.getBBCNCLKLXCG53());
		soapModel.setBBCNCLKLXCG54(model.getBBCNCLKLXCG54());
		soapModel.setBBKTSPMXCG001(model.getBBKTSPMXCG001());
		soapModel.setBBKTSPMXCG002(model.getBBKTSPMXCG002());
		soapModel.setBBKTSPMXCG003(model.getBBKTSPMXCG003());
		soapModel.setBBKTSPMXCG004(model.getBBKTSPMXCG004());
		soapModel.setBBKTSPMXCG005(model.getBBKTSPMXCG005());
		soapModel.setBBKTSPMXCG006(model.getBBKTSPMXCG006());
		soapModel.setBBKTSPMXCG007(model.getBBKTSPMXCG007());
		soapModel.setBBKTSPMXCG008(model.getBBKTSPMXCG008());
		soapModel.setBBKTSPMXCG009(model.getBBKTSPMXCG009());
		soapModel.setBBKTSPMXCG010(model.getBBKTSPMXCG010());
		soapModel.setBBKTSPMXCG011(model.getBBKTSPMXCG011());
		soapModel.setBBKTSPMXCG012(model.getBBKTSPMXCG012());
		soapModel.setBBKTSPMXCG013(model.getBBKTSPMXCG013());
		soapModel.setBBKTSPMXCG014(model.getBBKTSPMXCG014());
		soapModel.setBBKTSPMXCG015(model.getBBKTSPMXCG015());
		soapModel.setBBKTSPMXCG016(model.getBBKTSPMXCG016());
		soapModel.setBBKTSPMXCG017(model.getBBKTSPMXCG017());
		soapModel.setBBKTSPMXCG018(model.getBBKTSPMXCG018());
		soapModel.setBBKTSPMXCG019(model.getBBKTSPMXCG019());
		soapModel.setBBKTSPMXCG020(model.getBBKTSPMXCG020());
		soapModel.setBBKTSPMXCG021(model.getBBKTSPMXCG021());
		soapModel.setBBKTSPMXCG022(model.getBBKTSPMXCG022());
		soapModel.setBBKTSPMXCG023(model.getBBKTSPMXCG023());
		soapModel.setBBKTSPMXCG024(model.getBBKTSPMXCG024());
		soapModel.setBBKTSPMXCG025(model.getBBKTSPMXCG025());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRTechnicalSpec_XCGPart6Soap[] toSoapModels(
		VRTechnicalSpec_XCGPart6[] models) {
		VRTechnicalSpec_XCGPart6Soap[] soapModels = new VRTechnicalSpec_XCGPart6Soap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCGPart6Soap[][] toSoapModels(
		VRTechnicalSpec_XCGPart6[][] models) {
		VRTechnicalSpec_XCGPart6Soap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRTechnicalSpec_XCGPart6Soap[models.length][models[0].length];
		}
		else {
			soapModels = new VRTechnicalSpec_XCGPart6Soap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCGPart6Soap[] toSoapModels(
		List<VRTechnicalSpec_XCGPart6> models) {
		List<VRTechnicalSpec_XCGPart6Soap> soapModels = new ArrayList<VRTechnicalSpec_XCGPart6Soap>(models.size());

		for (VRTechnicalSpec_XCGPart6 model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRTechnicalSpec_XCGPart6Soap[soapModels.size()]);
	}

	public VRTechnicalSpec_XCGPart6Soap() {
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

	public String getXCG01757() {
		return _XCG01757;
	}

	public void setXCG01757(String XCG01757) {
		_XCG01757 = XCG01757;
	}

	public String getXCG01758() {
		return _XCG01758;
	}

	public void setXCG01758(String XCG01758) {
		_XCG01758 = XCG01758;
	}

	public String getXCG01759() {
		return _XCG01759;
	}

	public void setXCG01759(String XCG01759) {
		_XCG01759 = XCG01759;
	}

	public String getXCG01948() {
		return _XCG01948;
	}

	public void setXCG01948(String XCG01948) {
		_XCG01948 = XCG01948;
	}

	public String getXCG01760() {
		return _XCG01760;
	}

	public void setXCG01760(String XCG01760) {
		_XCG01760 = XCG01760;
	}

	public String getXCG01949() {
		return _XCG01949;
	}

	public void setXCG01949(String XCG01949) {
		_XCG01949 = XCG01949;
	}

	public String getXCG01761() {
		return _XCG01761;
	}

	public void setXCG01761(String XCG01761) {
		_XCG01761 = XCG01761;
	}

	public String getXCG01950() {
		return _XCG01950;
	}

	public void setXCG01950(String XCG01950) {
		_XCG01950 = XCG01950;
	}

	public String getXCG01762() {
		return _XCG01762;
	}

	public void setXCG01762(String XCG01762) {
		_XCG01762 = XCG01762;
	}

	public String getXCG01951() {
		return _XCG01951;
	}

	public void setXCG01951(String XCG01951) {
		_XCG01951 = XCG01951;
	}

	public String getXCG01763() {
		return _XCG01763;
	}

	public void setXCG01763(String XCG01763) {
		_XCG01763 = XCG01763;
	}

	public String getXCG01952() {
		return _XCG01952;
	}

	public void setXCG01952(String XCG01952) {
		_XCG01952 = XCG01952;
	}

	public String getXCG01764() {
		return _XCG01764;
	}

	public void setXCG01764(String XCG01764) {
		_XCG01764 = XCG01764;
	}

	public String getXCG01953() {
		return _XCG01953;
	}

	public void setXCG01953(String XCG01953) {
		_XCG01953 = XCG01953;
	}

	public String getXCG01765() {
		return _XCG01765;
	}

	public void setXCG01765(String XCG01765) {
		_XCG01765 = XCG01765;
	}

	public String getXCG01954() {
		return _XCG01954;
	}

	public void setXCG01954(String XCG01954) {
		_XCG01954 = XCG01954;
	}

	public String getXCG01766() {
		return _XCG01766;
	}

	public void setXCG01766(String XCG01766) {
		_XCG01766 = XCG01766;
	}

	public String getXCG01955() {
		return _XCG01955;
	}

	public void setXCG01955(String XCG01955) {
		_XCG01955 = XCG01955;
	}

	public String getXCG01767() {
		return _XCG01767;
	}

	public void setXCG01767(String XCG01767) {
		_XCG01767 = XCG01767;
	}

	public String getXCG01956() {
		return _XCG01956;
	}

	public void setXCG01956(String XCG01956) {
		_XCG01956 = XCG01956;
	}

	public String getXCG01768() {
		return _XCG01768;
	}

	public void setXCG01768(String XCG01768) {
		_XCG01768 = XCG01768;
	}

	public String getXCG01957() {
		return _XCG01957;
	}

	public void setXCG01957(String XCG01957) {
		_XCG01957 = XCG01957;
	}

	public String getXCG01769() {
		return _XCG01769;
	}

	public void setXCG01769(String XCG01769) {
		_XCG01769 = XCG01769;
	}

	public String getXCG01958() {
		return _XCG01958;
	}

	public void setXCG01958(String XCG01958) {
		_XCG01958 = XCG01958;
	}

	public String getXCG01770() {
		return _XCG01770;
	}

	public void setXCG01770(String XCG01770) {
		_XCG01770 = XCG01770;
	}

	public String getXCG01771() {
		return _XCG01771;
	}

	public void setXCG01771(String XCG01771) {
		_XCG01771 = XCG01771;
	}

	public String getXCG01959() {
		return _XCG01959;
	}

	public void setXCG01959(String XCG01959) {
		_XCG01959 = XCG01959;
	}

	public String getXCG01772() {
		return _XCG01772;
	}

	public void setXCG01772(String XCG01772) {
		_XCG01772 = XCG01772;
	}

	public String getXCG01773() {
		return _XCG01773;
	}

	public void setXCG01773(String XCG01773) {
		_XCG01773 = XCG01773;
	}

	public String getXCG01774() {
		return _XCG01774;
	}

	public void setXCG01774(String XCG01774) {
		_XCG01774 = XCG01774;
	}

	public String getXCG01775() {
		return _XCG01775;
	}

	public void setXCG01775(String XCG01775) {
		_XCG01775 = XCG01775;
	}

	public String getXCG01776() {
		return _XCG01776;
	}

	public void setXCG01776(String XCG01776) {
		_XCG01776 = XCG01776;
	}

	public String getXCG01777() {
		return _XCG01777;
	}

	public void setXCG01777(String XCG01777) {
		_XCG01777 = XCG01777;
	}

	public String getXCG01778() {
		return _XCG01778;
	}

	public void setXCG01778(String XCG01778) {
		_XCG01778 = XCG01778;
	}

	public String getXCG01779() {
		return _XCG01779;
	}

	public void setXCG01779(String XCG01779) {
		_XCG01779 = XCG01779;
	}

	public String getXCG01780() {
		return _XCG01780;
	}

	public void setXCG01780(String XCG01780) {
		_XCG01780 = XCG01780;
	}

	public String getXCG01781() {
		return _XCG01781;
	}

	public void setXCG01781(String XCG01781) {
		_XCG01781 = XCG01781;
	}

	public String getXCG01783() {
		return _XCG01783;
	}

	public void setXCG01783(String XCG01783) {
		_XCG01783 = XCG01783;
	}

	public String getXCG01785() {
		return _XCG01785;
	}

	public void setXCG01785(String XCG01785) {
		_XCG01785 = XCG01785;
	}

	public String getXCG01786() {
		return _XCG01786;
	}

	public void setXCG01786(String XCG01786) {
		_XCG01786 = XCG01786;
	}

	public String getXCG01787() {
		return _XCG01787;
	}

	public void setXCG01787(String XCG01787) {
		_XCG01787 = XCG01787;
	}

	public String getXCG01788() {
		return _XCG01788;
	}

	public void setXCG01788(String XCG01788) {
		_XCG01788 = XCG01788;
	}

	public String getXCG01789() {
		return _XCG01789;
	}

	public void setXCG01789(String XCG01789) {
		_XCG01789 = XCG01789;
	}

	public String getXCG01790() {
		return _XCG01790;
	}

	public void setXCG01790(String XCG01790) {
		_XCG01790 = XCG01790;
	}

	public String getXCG01791() {
		return _XCG01791;
	}

	public void setXCG01791(String XCG01791) {
		_XCG01791 = XCG01791;
	}

	public String getXCG01792() {
		return _XCG01792;
	}

	public void setXCG01792(String XCG01792) {
		_XCG01792 = XCG01792;
	}

	public String getXCG01793() {
		return _XCG01793;
	}

	public void setXCG01793(String XCG01793) {
		_XCG01793 = XCG01793;
	}

	public String getXCG01794() {
		return _XCG01794;
	}

	public void setXCG01794(String XCG01794) {
		_XCG01794 = XCG01794;
	}

	public String getXCG01795() {
		return _XCG01795;
	}

	public void setXCG01795(String XCG01795) {
		_XCG01795 = XCG01795;
	}

	public String getXCG01796() {
		return _XCG01796;
	}

	public void setXCG01796(String XCG01796) {
		_XCG01796 = XCG01796;
	}

	public String getXCG01797() {
		return _XCG01797;
	}

	public void setXCG01797(String XCG01797) {
		_XCG01797 = XCG01797;
	}

	public String getXCG01798() {
		return _XCG01798;
	}

	public void setXCG01798(String XCG01798) {
		_XCG01798 = XCG01798;
	}

	public String getXCG01799() {
		return _XCG01799;
	}

	public void setXCG01799(String XCG01799) {
		_XCG01799 = XCG01799;
	}

	public String getXCG01801() {
		return _XCG01801;
	}

	public void setXCG01801(String XCG01801) {
		_XCG01801 = XCG01801;
	}

	public String getXCG01802() {
		return _XCG01802;
	}

	public void setXCG01802(String XCG01802) {
		_XCG01802 = XCG01802;
	}

	public String getXCG01803() {
		return _XCG01803;
	}

	public void setXCG01803(String XCG01803) {
		_XCG01803 = XCG01803;
	}

	public String getXCG01804() {
		return _XCG01804;
	}

	public void setXCG01804(String XCG01804) {
		_XCG01804 = XCG01804;
	}

	public String getXCG01805() {
		return _XCG01805;
	}

	public void setXCG01805(String XCG01805) {
		_XCG01805 = XCG01805;
	}

	public String getXCG01806() {
		return _XCG01806;
	}

	public void setXCG01806(String XCG01806) {
		_XCG01806 = XCG01806;
	}

	public String getXCG01807() {
		return _XCG01807;
	}

	public void setXCG01807(String XCG01807) {
		_XCG01807 = XCG01807;
	}

	public String getXCG01808() {
		return _XCG01808;
	}

	public void setXCG01808(String XCG01808) {
		_XCG01808 = XCG01808;
	}

	public String getXCG01809() {
		return _XCG01809;
	}

	public void setXCG01809(String XCG01809) {
		_XCG01809 = XCG01809;
	}

	public String getXCG01810() {
		return _XCG01810;
	}

	public void setXCG01810(String XCG01810) {
		_XCG01810 = XCG01810;
	}

	public String getXCG01811() {
		return _XCG01811;
	}

	public void setXCG01811(String XCG01811) {
		_XCG01811 = XCG01811;
	}

	public String getXCG01812() {
		return _XCG01812;
	}

	public void setXCG01812(String XCG01812) {
		_XCG01812 = XCG01812;
	}

	public String getXCG01813() {
		return _XCG01813;
	}

	public void setXCG01813(String XCG01813) {
		_XCG01813 = XCG01813;
	}

	public String getXCG01814() {
		return _XCG01814;
	}

	public void setXCG01814(String XCG01814) {
		_XCG01814 = XCG01814;
	}

	public String getTDTKXCG001() {
		return _TDTKXCG001;
	}

	public void setTDTKXCG001(String TDTKXCG001) {
		_TDTKXCG001 = TDTKXCG001;
	}

	public String getTDTKXCG002() {
		return _TDTKXCG002;
	}

	public void setTDTKXCG002(String TDTKXCG002) {
		_TDTKXCG002 = TDTKXCG002;
	}

	public String getTDTKXCG003() {
		return _TDTKXCG003;
	}

	public void setTDTKXCG003(String TDTKXCG003) {
		_TDTKXCG003 = TDTKXCG003;
	}

	public String getTDTKXCG004() {
		return _TDTKXCG004;
	}

	public void setTDTKXCG004(String TDTKXCG004) {
		_TDTKXCG004 = TDTKXCG004;
	}

	public String getTDTKXCG005() {
		return _TDTKXCG005;
	}

	public void setTDTKXCG005(String TDTKXCG005) {
		_TDTKXCG005 = TDTKXCG005;
	}

	public String getTDTKXCG006() {
		return _TDTKXCG006;
	}

	public void setTDTKXCG006(String TDTKXCG006) {
		_TDTKXCG006 = TDTKXCG006;
	}

	public String getTDTKXCG007() {
		return _TDTKXCG007;
	}

	public void setTDTKXCG007(String TDTKXCG007) {
		_TDTKXCG007 = TDTKXCG007;
	}

	public String getTDTKXCG008() {
		return _TDTKXCG008;
	}

	public void setTDTKXCG008(String TDTKXCG008) {
		_TDTKXCG008 = TDTKXCG008;
	}

	public String getTDTKXCG009() {
		return _TDTKXCG009;
	}

	public void setTDTKXCG009(String TDTKXCG009) {
		_TDTKXCG009 = TDTKXCG009;
	}

	public String getTDTKXCG010() {
		return _TDTKXCG010;
	}

	public void setTDTKXCG010(String TDTKXCG010) {
		_TDTKXCG010 = TDTKXCG010;
	}

	public String getTDTKXCG011() {
		return _TDTKXCG011;
	}

	public void setTDTKXCG011(String TDTKXCG011) {
		_TDTKXCG011 = TDTKXCG011;
	}

	public String getTDTKXCG012() {
		return _TDTKXCG012;
	}

	public void setTDTKXCG012(String TDTKXCG012) {
		_TDTKXCG012 = TDTKXCG012;
	}

	public String getTDTKXCG013() {
		return _TDTKXCG013;
	}

	public void setTDTKXCG013(String TDTKXCG013) {
		_TDTKXCG013 = TDTKXCG013;
	}

	public String getTDTKXCG014() {
		return _TDTKXCG014;
	}

	public void setTDTKXCG014(String TDTKXCG014) {
		_TDTKXCG014 = TDTKXCG014;
	}

	public String getTDTKXCG015() {
		return _TDTKXCG015;
	}

	public void setTDTKXCG015(String TDTKXCG015) {
		_TDTKXCG015 = TDTKXCG015;
	}

	public String getTDTKXCG016() {
		return _TDTKXCG016;
	}

	public void setTDTKXCG016(String TDTKXCG016) {
		_TDTKXCG016 = TDTKXCG016;
	}

	public String getTDTKXCG017() {
		return _TDTKXCG017;
	}

	public void setTDTKXCG017(String TDTKXCG017) {
		_TDTKXCG017 = TDTKXCG017;
	}

	public String getTDTKXCG018() {
		return _TDTKXCG018;
	}

	public void setTDTKXCG018(String TDTKXCG018) {
		_TDTKXCG018 = TDTKXCG018;
	}

	public String getTDTKXCG019() {
		return _TDTKXCG019;
	}

	public void setTDTKXCG019(String TDTKXCG019) {
		_TDTKXCG019 = TDTKXCG019;
	}

	public String getTDTKXCG020() {
		return _TDTKXCG020;
	}

	public void setTDTKXCG020(String TDTKXCG020) {
		_TDTKXCG020 = TDTKXCG020;
	}

	public String getTDTKXCG021() {
		return _TDTKXCG021;
	}

	public void setTDTKXCG021(String TDTKXCG021) {
		_TDTKXCG021 = TDTKXCG021;
	}

	public String getTDTKXCG022() {
		return _TDTKXCG022;
	}

	public void setTDTKXCG022(String TDTKXCG022) {
		_TDTKXCG022 = TDTKXCG022;
	}

	public String getTDTKXCG023() {
		return _TDTKXCG023;
	}

	public void setTDTKXCG023(String TDTKXCG023) {
		_TDTKXCG023 = TDTKXCG023;
	}

	public String getTDTKXCG024() {
		return _TDTKXCG024;
	}

	public void setTDTKXCG024(String TDTKXCG024) {
		_TDTKXCG024 = TDTKXCG024;
	}

	public String getTDTKXCG025() {
		return _TDTKXCG025;
	}

	public void setTDTKXCG025(String TDTKXCG025) {
		_TDTKXCG025 = TDTKXCG025;
	}

	public String getTDTKXCG026() {
		return _TDTKXCG026;
	}

	public void setTDTKXCG026(String TDTKXCG026) {
		_TDTKXCG026 = TDTKXCG026;
	}

	public String getTDTKXCG027() {
		return _TDTKXCG027;
	}

	public void setTDTKXCG027(String TDTKXCG027) {
		_TDTKXCG027 = TDTKXCG027;
	}

	public String getTDTKXCG028() {
		return _TDTKXCG028;
	}

	public void setTDTKXCG028(String TDTKXCG028) {
		_TDTKXCG028 = TDTKXCG028;
	}

	public String getTDTKXCG029() {
		return _TDTKXCG029;
	}

	public void setTDTKXCG029(String TDTKXCG029) {
		_TDTKXCG029 = TDTKXCG029;
	}

	public String getTDTKXCG030() {
		return _TDTKXCG030;
	}

	public void setTDTKXCG030(String TDTKXCG030) {
		_TDTKXCG030 = TDTKXCG030;
	}

	public String getTDTKXCG031() {
		return _TDTKXCG031;
	}

	public void setTDTKXCG031(String TDTKXCG031) {
		_TDTKXCG031 = TDTKXCG031;
	}

	public String getTDTKXCG032() {
		return _TDTKXCG032;
	}

	public void setTDTKXCG032(String TDTKXCG032) {
		_TDTKXCG032 = TDTKXCG032;
	}

	public String getTDTKXCG033() {
		return _TDTKXCG033;
	}

	public void setTDTKXCG033(String TDTKXCG033) {
		_TDTKXCG033 = TDTKXCG033;
	}

	public String getTDTKXCG034() {
		return _TDTKXCG034;
	}

	public void setTDTKXCG034(String TDTKXCG034) {
		_TDTKXCG034 = TDTKXCG034;
	}

	public String getTDTKXCG035() {
		return _TDTKXCG035;
	}

	public void setTDTKXCG035(String TDTKXCG035) {
		_TDTKXCG035 = TDTKXCG035;
	}

	public String getTDTKXCG036() {
		return _TDTKXCG036;
	}

	public void setTDTKXCG036(String TDTKXCG036) {
		_TDTKXCG036 = TDTKXCG036;
	}

	public String getBBCNCLKLXCG01() {
		return _BBCNCLKLXCG01;
	}

	public void setBBCNCLKLXCG01(String BBCNCLKLXCG01) {
		_BBCNCLKLXCG01 = BBCNCLKLXCG01;
	}

	public String getBBCNCLKLXCG02() {
		return _BBCNCLKLXCG02;
	}

	public void setBBCNCLKLXCG02(String BBCNCLKLXCG02) {
		_BBCNCLKLXCG02 = BBCNCLKLXCG02;
	}

	public String getBBCNCLKLXCG03() {
		return _BBCNCLKLXCG03;
	}

	public void setBBCNCLKLXCG03(String BBCNCLKLXCG03) {
		_BBCNCLKLXCG03 = BBCNCLKLXCG03;
	}

	public String getBBCNCLKLXCG04() {
		return _BBCNCLKLXCG04;
	}

	public void setBBCNCLKLXCG04(String BBCNCLKLXCG04) {
		_BBCNCLKLXCG04 = BBCNCLKLXCG04;
	}

	public String getBBCNCLKLXCG05() {
		return _BBCNCLKLXCG05;
	}

	public void setBBCNCLKLXCG05(String BBCNCLKLXCG05) {
		_BBCNCLKLXCG05 = BBCNCLKLXCG05;
	}

	public String getBBCNCLKLXCG06() {
		return _BBCNCLKLXCG06;
	}

	public void setBBCNCLKLXCG06(String BBCNCLKLXCG06) {
		_BBCNCLKLXCG06 = BBCNCLKLXCG06;
	}

	public String getBBCNCLKLXCG07() {
		return _BBCNCLKLXCG07;
	}

	public void setBBCNCLKLXCG07(String BBCNCLKLXCG07) {
		_BBCNCLKLXCG07 = BBCNCLKLXCG07;
	}

	public String getBBCNCLKLXCG08() {
		return _BBCNCLKLXCG08;
	}

	public void setBBCNCLKLXCG08(String BBCNCLKLXCG08) {
		_BBCNCLKLXCG08 = BBCNCLKLXCG08;
	}

	public String getBBCNCLKLXCG09() {
		return _BBCNCLKLXCG09;
	}

	public void setBBCNCLKLXCG09(String BBCNCLKLXCG09) {
		_BBCNCLKLXCG09 = BBCNCLKLXCG09;
	}

	public String getBBCNCLKLXCG10() {
		return _BBCNCLKLXCG10;
	}

	public void setBBCNCLKLXCG10(String BBCNCLKLXCG10) {
		_BBCNCLKLXCG10 = BBCNCLKLXCG10;
	}

	public String getBBCNCLKLXCG11() {
		return _BBCNCLKLXCG11;
	}

	public void setBBCNCLKLXCG11(String BBCNCLKLXCG11) {
		_BBCNCLKLXCG11 = BBCNCLKLXCG11;
	}

	public String getBBCNCLKLXCG12() {
		return _BBCNCLKLXCG12;
	}

	public void setBBCNCLKLXCG12(String BBCNCLKLXCG12) {
		_BBCNCLKLXCG12 = BBCNCLKLXCG12;
	}

	public String getBBCNCLKLXCG13() {
		return _BBCNCLKLXCG13;
	}

	public void setBBCNCLKLXCG13(String BBCNCLKLXCG13) {
		_BBCNCLKLXCG13 = BBCNCLKLXCG13;
	}

	public String getBBCNCLKLXCG14() {
		return _BBCNCLKLXCG14;
	}

	public void setBBCNCLKLXCG14(String BBCNCLKLXCG14) {
		_BBCNCLKLXCG14 = BBCNCLKLXCG14;
	}

	public String getBBCNCLKLXCG15() {
		return _BBCNCLKLXCG15;
	}

	public void setBBCNCLKLXCG15(String BBCNCLKLXCG15) {
		_BBCNCLKLXCG15 = BBCNCLKLXCG15;
	}

	public String getBBCNCLKLXCG16() {
		return _BBCNCLKLXCG16;
	}

	public void setBBCNCLKLXCG16(String BBCNCLKLXCG16) {
		_BBCNCLKLXCG16 = BBCNCLKLXCG16;
	}

	public String getBBCNCLKLXCG17() {
		return _BBCNCLKLXCG17;
	}

	public void setBBCNCLKLXCG17(String BBCNCLKLXCG17) {
		_BBCNCLKLXCG17 = BBCNCLKLXCG17;
	}

	public String getBBCNCLKLXCG18() {
		return _BBCNCLKLXCG18;
	}

	public void setBBCNCLKLXCG18(String BBCNCLKLXCG18) {
		_BBCNCLKLXCG18 = BBCNCLKLXCG18;
	}

	public String getBBCNCLKLXCG19() {
		return _BBCNCLKLXCG19;
	}

	public void setBBCNCLKLXCG19(String BBCNCLKLXCG19) {
		_BBCNCLKLXCG19 = BBCNCLKLXCG19;
	}

	public String getBBCNCLKLXCG20() {
		return _BBCNCLKLXCG20;
	}

	public void setBBCNCLKLXCG20(String BBCNCLKLXCG20) {
		_BBCNCLKLXCG20 = BBCNCLKLXCG20;
	}

	public String getBBCNCLKLXCG21() {
		return _BBCNCLKLXCG21;
	}

	public void setBBCNCLKLXCG21(String BBCNCLKLXCG21) {
		_BBCNCLKLXCG21 = BBCNCLKLXCG21;
	}

	public String getBBCNCLKLXCG22() {
		return _BBCNCLKLXCG22;
	}

	public void setBBCNCLKLXCG22(String BBCNCLKLXCG22) {
		_BBCNCLKLXCG22 = BBCNCLKLXCG22;
	}

	public String getBBCNCLKLXCG23() {
		return _BBCNCLKLXCG23;
	}

	public void setBBCNCLKLXCG23(String BBCNCLKLXCG23) {
		_BBCNCLKLXCG23 = BBCNCLKLXCG23;
	}

	public String getBBCNCLKLXCG24() {
		return _BBCNCLKLXCG24;
	}

	public void setBBCNCLKLXCG24(String BBCNCLKLXCG24) {
		_BBCNCLKLXCG24 = BBCNCLKLXCG24;
	}

	public String getBBCNCLKLXCG26() {
		return _BBCNCLKLXCG26;
	}

	public void setBBCNCLKLXCG26(String BBCNCLKLXCG26) {
		_BBCNCLKLXCG26 = BBCNCLKLXCG26;
	}

	public String getBBCNCLKLXCG27() {
		return _BBCNCLKLXCG27;
	}

	public void setBBCNCLKLXCG27(String BBCNCLKLXCG27) {
		_BBCNCLKLXCG27 = BBCNCLKLXCG27;
	}

	public String getBBCNCLKLXCG28() {
		return _BBCNCLKLXCG28;
	}

	public void setBBCNCLKLXCG28(String BBCNCLKLXCG28) {
		_BBCNCLKLXCG28 = BBCNCLKLXCG28;
	}

	public String getBBCNCLKLXCG29() {
		return _BBCNCLKLXCG29;
	}

	public void setBBCNCLKLXCG29(String BBCNCLKLXCG29) {
		_BBCNCLKLXCG29 = BBCNCLKLXCG29;
	}

	public String getBBCNCLKLXCG30() {
		return _BBCNCLKLXCG30;
	}

	public void setBBCNCLKLXCG30(String BBCNCLKLXCG30) {
		_BBCNCLKLXCG30 = BBCNCLKLXCG30;
	}

	public String getBBCNCLKLXCG31() {
		return _BBCNCLKLXCG31;
	}

	public void setBBCNCLKLXCG31(String BBCNCLKLXCG31) {
		_BBCNCLKLXCG31 = BBCNCLKLXCG31;
	}

	public String getBBCNCLKLXCG33() {
		return _BBCNCLKLXCG33;
	}

	public void setBBCNCLKLXCG33(String BBCNCLKLXCG33) {
		_BBCNCLKLXCG33 = BBCNCLKLXCG33;
	}

	public String getBBCNCLKLXCG34() {
		return _BBCNCLKLXCG34;
	}

	public void setBBCNCLKLXCG34(String BBCNCLKLXCG34) {
		_BBCNCLKLXCG34 = BBCNCLKLXCG34;
	}

	public String getBBCNCLKLXCG35() {
		return _BBCNCLKLXCG35;
	}

	public void setBBCNCLKLXCG35(String BBCNCLKLXCG35) {
		_BBCNCLKLXCG35 = BBCNCLKLXCG35;
	}

	public String getBBCNCLKLXCG36() {
		return _BBCNCLKLXCG36;
	}

	public void setBBCNCLKLXCG36(String BBCNCLKLXCG36) {
		_BBCNCLKLXCG36 = BBCNCLKLXCG36;
	}

	public String getBBCNCLKLXCG38() {
		return _BBCNCLKLXCG38;
	}

	public void setBBCNCLKLXCG38(String BBCNCLKLXCG38) {
		_BBCNCLKLXCG38 = BBCNCLKLXCG38;
	}

	public String getBBCNCLKLXCG39() {
		return _BBCNCLKLXCG39;
	}

	public void setBBCNCLKLXCG39(String BBCNCLKLXCG39) {
		_BBCNCLKLXCG39 = BBCNCLKLXCG39;
	}

	public String getBBCNCLKLXCG40() {
		return _BBCNCLKLXCG40;
	}

	public void setBBCNCLKLXCG40(String BBCNCLKLXCG40) {
		_BBCNCLKLXCG40 = BBCNCLKLXCG40;
	}

	public String getBBCNCLKLXCG42() {
		return _BBCNCLKLXCG42;
	}

	public void setBBCNCLKLXCG42(String BBCNCLKLXCG42) {
		_BBCNCLKLXCG42 = BBCNCLKLXCG42;
	}

	public String getBBCNCLKLXCG43() {
		return _BBCNCLKLXCG43;
	}

	public void setBBCNCLKLXCG43(String BBCNCLKLXCG43) {
		_BBCNCLKLXCG43 = BBCNCLKLXCG43;
	}

	public String getBBCNCLKLXCG44() {
		return _BBCNCLKLXCG44;
	}

	public void setBBCNCLKLXCG44(String BBCNCLKLXCG44) {
		_BBCNCLKLXCG44 = BBCNCLKLXCG44;
	}

	public String getBBCNCLKLXCG45() {
		return _BBCNCLKLXCG45;
	}

	public void setBBCNCLKLXCG45(String BBCNCLKLXCG45) {
		_BBCNCLKLXCG45 = BBCNCLKLXCG45;
	}

	public String getBBCNCLKLXCG46() {
		return _BBCNCLKLXCG46;
	}

	public void setBBCNCLKLXCG46(String BBCNCLKLXCG46) {
		_BBCNCLKLXCG46 = BBCNCLKLXCG46;
	}

	public String getBBCNCLKLXCG47() {
		return _BBCNCLKLXCG47;
	}

	public void setBBCNCLKLXCG47(String BBCNCLKLXCG47) {
		_BBCNCLKLXCG47 = BBCNCLKLXCG47;
	}

	public String getBBCNCLKLXCG48() {
		return _BBCNCLKLXCG48;
	}

	public void setBBCNCLKLXCG48(String BBCNCLKLXCG48) {
		_BBCNCLKLXCG48 = BBCNCLKLXCG48;
	}

	public String getBBCNCLKLXCG49() {
		return _BBCNCLKLXCG49;
	}

	public void setBBCNCLKLXCG49(String BBCNCLKLXCG49) {
		_BBCNCLKLXCG49 = BBCNCLKLXCG49;
	}

	public String getBBCNCLKLXCG50() {
		return _BBCNCLKLXCG50;
	}

	public void setBBCNCLKLXCG50(String BBCNCLKLXCG50) {
		_BBCNCLKLXCG50 = BBCNCLKLXCG50;
	}

	public String getBBCNCLKLXCG51() {
		return _BBCNCLKLXCG51;
	}

	public void setBBCNCLKLXCG51(String BBCNCLKLXCG51) {
		_BBCNCLKLXCG51 = BBCNCLKLXCG51;
	}

	public String getBBCNCLKLXCG52() {
		return _BBCNCLKLXCG52;
	}

	public void setBBCNCLKLXCG52(String BBCNCLKLXCG52) {
		_BBCNCLKLXCG52 = BBCNCLKLXCG52;
	}

	public String getBBCNCLKLXCG53() {
		return _BBCNCLKLXCG53;
	}

	public void setBBCNCLKLXCG53(String BBCNCLKLXCG53) {
		_BBCNCLKLXCG53 = BBCNCLKLXCG53;
	}

	public String getBBCNCLKLXCG54() {
		return _BBCNCLKLXCG54;
	}

	public void setBBCNCLKLXCG54(String BBCNCLKLXCG54) {
		_BBCNCLKLXCG54 = BBCNCLKLXCG54;
	}

	public String getBBKTSPMXCG001() {
		return _BBKTSPMXCG001;
	}

	public void setBBKTSPMXCG001(String BBKTSPMXCG001) {
		_BBKTSPMXCG001 = BBKTSPMXCG001;
	}

	public String getBBKTSPMXCG002() {
		return _BBKTSPMXCG002;
	}

	public void setBBKTSPMXCG002(String BBKTSPMXCG002) {
		_BBKTSPMXCG002 = BBKTSPMXCG002;
	}

	public String getBBKTSPMXCG003() {
		return _BBKTSPMXCG003;
	}

	public void setBBKTSPMXCG003(String BBKTSPMXCG003) {
		_BBKTSPMXCG003 = BBKTSPMXCG003;
	}

	public String getBBKTSPMXCG004() {
		return _BBKTSPMXCG004;
	}

	public void setBBKTSPMXCG004(String BBKTSPMXCG004) {
		_BBKTSPMXCG004 = BBKTSPMXCG004;
	}

	public String getBBKTSPMXCG005() {
		return _BBKTSPMXCG005;
	}

	public void setBBKTSPMXCG005(String BBKTSPMXCG005) {
		_BBKTSPMXCG005 = BBKTSPMXCG005;
	}

	public String getBBKTSPMXCG006() {
		return _BBKTSPMXCG006;
	}

	public void setBBKTSPMXCG006(String BBKTSPMXCG006) {
		_BBKTSPMXCG006 = BBKTSPMXCG006;
	}

	public String getBBKTSPMXCG007() {
		return _BBKTSPMXCG007;
	}

	public void setBBKTSPMXCG007(String BBKTSPMXCG007) {
		_BBKTSPMXCG007 = BBKTSPMXCG007;
	}

	public String getBBKTSPMXCG008() {
		return _BBKTSPMXCG008;
	}

	public void setBBKTSPMXCG008(String BBKTSPMXCG008) {
		_BBKTSPMXCG008 = BBKTSPMXCG008;
	}

	public String getBBKTSPMXCG009() {
		return _BBKTSPMXCG009;
	}

	public void setBBKTSPMXCG009(String BBKTSPMXCG009) {
		_BBKTSPMXCG009 = BBKTSPMXCG009;
	}

	public String getBBKTSPMXCG010() {
		return _BBKTSPMXCG010;
	}

	public void setBBKTSPMXCG010(String BBKTSPMXCG010) {
		_BBKTSPMXCG010 = BBKTSPMXCG010;
	}

	public String getBBKTSPMXCG011() {
		return _BBKTSPMXCG011;
	}

	public void setBBKTSPMXCG011(String BBKTSPMXCG011) {
		_BBKTSPMXCG011 = BBKTSPMXCG011;
	}

	public String getBBKTSPMXCG012() {
		return _BBKTSPMXCG012;
	}

	public void setBBKTSPMXCG012(String BBKTSPMXCG012) {
		_BBKTSPMXCG012 = BBKTSPMXCG012;
	}

	public String getBBKTSPMXCG013() {
		return _BBKTSPMXCG013;
	}

	public void setBBKTSPMXCG013(String BBKTSPMXCG013) {
		_BBKTSPMXCG013 = BBKTSPMXCG013;
	}

	public String getBBKTSPMXCG014() {
		return _BBKTSPMXCG014;
	}

	public void setBBKTSPMXCG014(String BBKTSPMXCG014) {
		_BBKTSPMXCG014 = BBKTSPMXCG014;
	}

	public String getBBKTSPMXCG015() {
		return _BBKTSPMXCG015;
	}

	public void setBBKTSPMXCG015(String BBKTSPMXCG015) {
		_BBKTSPMXCG015 = BBKTSPMXCG015;
	}

	public String getBBKTSPMXCG016() {
		return _BBKTSPMXCG016;
	}

	public void setBBKTSPMXCG016(String BBKTSPMXCG016) {
		_BBKTSPMXCG016 = BBKTSPMXCG016;
	}

	public String getBBKTSPMXCG017() {
		return _BBKTSPMXCG017;
	}

	public void setBBKTSPMXCG017(String BBKTSPMXCG017) {
		_BBKTSPMXCG017 = BBKTSPMXCG017;
	}

	public String getBBKTSPMXCG018() {
		return _BBKTSPMXCG018;
	}

	public void setBBKTSPMXCG018(String BBKTSPMXCG018) {
		_BBKTSPMXCG018 = BBKTSPMXCG018;
	}

	public String getBBKTSPMXCG019() {
		return _BBKTSPMXCG019;
	}

	public void setBBKTSPMXCG019(String BBKTSPMXCG019) {
		_BBKTSPMXCG019 = BBKTSPMXCG019;
	}

	public String getBBKTSPMXCG020() {
		return _BBKTSPMXCG020;
	}

	public void setBBKTSPMXCG020(String BBKTSPMXCG020) {
		_BBKTSPMXCG020 = BBKTSPMXCG020;
	}

	public String getBBKTSPMXCG021() {
		return _BBKTSPMXCG021;
	}

	public void setBBKTSPMXCG021(String BBKTSPMXCG021) {
		_BBKTSPMXCG021 = BBKTSPMXCG021;
	}

	public String getBBKTSPMXCG022() {
		return _BBKTSPMXCG022;
	}

	public void setBBKTSPMXCG022(String BBKTSPMXCG022) {
		_BBKTSPMXCG022 = BBKTSPMXCG022;
	}

	public String getBBKTSPMXCG023() {
		return _BBKTSPMXCG023;
	}

	public void setBBKTSPMXCG023(String BBKTSPMXCG023) {
		_BBKTSPMXCG023 = BBKTSPMXCG023;
	}

	public String getBBKTSPMXCG024() {
		return _BBKTSPMXCG024;
	}

	public void setBBKTSPMXCG024(String BBKTSPMXCG024) {
		_BBKTSPMXCG024 = BBKTSPMXCG024;
	}

	public String getBBKTSPMXCG025() {
		return _BBKTSPMXCG025;
	}

	public void setBBKTSPMXCG025(String BBKTSPMXCG025) {
		_BBKTSPMXCG025 = BBKTSPMXCG025;
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
	private String _XCG01757;
	private String _XCG01758;
	private String _XCG01759;
	private String _XCG01948;
	private String _XCG01760;
	private String _XCG01949;
	private String _XCG01761;
	private String _XCG01950;
	private String _XCG01762;
	private String _XCG01951;
	private String _XCG01763;
	private String _XCG01952;
	private String _XCG01764;
	private String _XCG01953;
	private String _XCG01765;
	private String _XCG01954;
	private String _XCG01766;
	private String _XCG01955;
	private String _XCG01767;
	private String _XCG01956;
	private String _XCG01768;
	private String _XCG01957;
	private String _XCG01769;
	private String _XCG01958;
	private String _XCG01770;
	private String _XCG01771;
	private String _XCG01959;
	private String _XCG01772;
	private String _XCG01773;
	private String _XCG01774;
	private String _XCG01775;
	private String _XCG01776;
	private String _XCG01777;
	private String _XCG01778;
	private String _XCG01779;
	private String _XCG01780;
	private String _XCG01781;
	private String _XCG01783;
	private String _XCG01785;
	private String _XCG01786;
	private String _XCG01787;
	private String _XCG01788;
	private String _XCG01789;
	private String _XCG01790;
	private String _XCG01791;
	private String _XCG01792;
	private String _XCG01793;
	private String _XCG01794;
	private String _XCG01795;
	private String _XCG01796;
	private String _XCG01797;
	private String _XCG01798;
	private String _XCG01799;
	private String _XCG01801;
	private String _XCG01802;
	private String _XCG01803;
	private String _XCG01804;
	private String _XCG01805;
	private String _XCG01806;
	private String _XCG01807;
	private String _XCG01808;
	private String _XCG01809;
	private String _XCG01810;
	private String _XCG01811;
	private String _XCG01812;
	private String _XCG01813;
	private String _XCG01814;
	private String _TDTKXCG001;
	private String _TDTKXCG002;
	private String _TDTKXCG003;
	private String _TDTKXCG004;
	private String _TDTKXCG005;
	private String _TDTKXCG006;
	private String _TDTKXCG007;
	private String _TDTKXCG008;
	private String _TDTKXCG009;
	private String _TDTKXCG010;
	private String _TDTKXCG011;
	private String _TDTKXCG012;
	private String _TDTKXCG013;
	private String _TDTKXCG014;
	private String _TDTKXCG015;
	private String _TDTKXCG016;
	private String _TDTKXCG017;
	private String _TDTKXCG018;
	private String _TDTKXCG019;
	private String _TDTKXCG020;
	private String _TDTKXCG021;
	private String _TDTKXCG022;
	private String _TDTKXCG023;
	private String _TDTKXCG024;
	private String _TDTKXCG025;
	private String _TDTKXCG026;
	private String _TDTKXCG027;
	private String _TDTKXCG028;
	private String _TDTKXCG029;
	private String _TDTKXCG030;
	private String _TDTKXCG031;
	private String _TDTKXCG032;
	private String _TDTKXCG033;
	private String _TDTKXCG034;
	private String _TDTKXCG035;
	private String _TDTKXCG036;
	private String _BBCNCLKLXCG01;
	private String _BBCNCLKLXCG02;
	private String _BBCNCLKLXCG03;
	private String _BBCNCLKLXCG04;
	private String _BBCNCLKLXCG05;
	private String _BBCNCLKLXCG06;
	private String _BBCNCLKLXCG07;
	private String _BBCNCLKLXCG08;
	private String _BBCNCLKLXCG09;
	private String _BBCNCLKLXCG10;
	private String _BBCNCLKLXCG11;
	private String _BBCNCLKLXCG12;
	private String _BBCNCLKLXCG13;
	private String _BBCNCLKLXCG14;
	private String _BBCNCLKLXCG15;
	private String _BBCNCLKLXCG16;
	private String _BBCNCLKLXCG17;
	private String _BBCNCLKLXCG18;
	private String _BBCNCLKLXCG19;
	private String _BBCNCLKLXCG20;
	private String _BBCNCLKLXCG21;
	private String _BBCNCLKLXCG22;
	private String _BBCNCLKLXCG23;
	private String _BBCNCLKLXCG24;
	private String _BBCNCLKLXCG26;
	private String _BBCNCLKLXCG27;
	private String _BBCNCLKLXCG28;
	private String _BBCNCLKLXCG29;
	private String _BBCNCLKLXCG30;
	private String _BBCNCLKLXCG31;
	private String _BBCNCLKLXCG33;
	private String _BBCNCLKLXCG34;
	private String _BBCNCLKLXCG35;
	private String _BBCNCLKLXCG36;
	private String _BBCNCLKLXCG38;
	private String _BBCNCLKLXCG39;
	private String _BBCNCLKLXCG40;
	private String _BBCNCLKLXCG42;
	private String _BBCNCLKLXCG43;
	private String _BBCNCLKLXCG44;
	private String _BBCNCLKLXCG45;
	private String _BBCNCLKLXCG46;
	private String _BBCNCLKLXCG47;
	private String _BBCNCLKLXCG48;
	private String _BBCNCLKLXCG49;
	private String _BBCNCLKLXCG50;
	private String _BBCNCLKLXCG51;
	private String _BBCNCLKLXCG52;
	private String _BBCNCLKLXCG53;
	private String _BBCNCLKLXCG54;
	private String _BBKTSPMXCG001;
	private String _BBKTSPMXCG002;
	private String _BBKTSPMXCG003;
	private String _BBKTSPMXCG004;
	private String _BBKTSPMXCG005;
	private String _BBKTSPMXCG006;
	private String _BBKTSPMXCG007;
	private String _BBKTSPMXCG008;
	private String _BBKTSPMXCG009;
	private String _BBKTSPMXCG010;
	private String _BBKTSPMXCG011;
	private String _BBKTSPMXCG012;
	private String _BBKTSPMXCG013;
	private String _BBKTSPMXCG014;
	private String _BBKTSPMXCG015;
	private String _BBKTSPMXCG016;
	private String _BBKTSPMXCG017;
	private String _BBKTSPMXCG018;
	private String _BBKTSPMXCG019;
	private String _BBKTSPMXCG020;
	private String _BBKTSPMXCG021;
	private String _BBKTSPMXCG022;
	private String _BBKTSPMXCG023;
	private String _BBKTSPMXCG024;
	private String _BBKTSPMXCG025;
	private Date _modifyDate;
	private Date _syncDate;
}