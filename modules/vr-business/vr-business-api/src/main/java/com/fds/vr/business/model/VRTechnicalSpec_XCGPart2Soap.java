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
public class VRTechnicalSpec_XCGPart2Soap implements Serializable {
	public static VRTechnicalSpec_XCGPart2Soap toSoapModel(
		VRTechnicalSpec_XCGPart2 model) {
		VRTechnicalSpec_XCGPart2Soap soapModel = new VRTechnicalSpec_XCGPart2Soap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setConvertAssembleId(model.getConvertAssembleId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setReferenceUid(model.getReferenceUid());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDeliverableCode(model.getDeliverableCode());
		soapModel.setVehicleTypeCertificateId(model.getVehicleTypeCertificateId());
		soapModel.setXCG01163(model.getXCG01163());
		soapModel.setXCG01164(model.getXCG01164());
		soapModel.setXCG01165(model.getXCG01165());
		soapModel.setXCG01166(model.getXCG01166());
		soapModel.setXCG01167(model.getXCG01167());
		soapModel.setXCG01169(model.getXCG01169());
		soapModel.setXCG01170(model.getXCG01170());
		soapModel.setXCG01171(model.getXCG01171());
		soapModel.setXCG01172(model.getXCG01172());
		soapModel.setXCG01173(model.getXCG01173());
		soapModel.setXCG01174(model.getXCG01174());
		soapModel.setXCG01175(model.getXCG01175());
		soapModel.setXCG01176(model.getXCG01176());
		soapModel.setXCG01177(model.getXCG01177());
		soapModel.setXCG01178(model.getXCG01178());
		soapModel.setXCG01179(model.getXCG01179());
		soapModel.setXCG01180(model.getXCG01180());
		soapModel.setXCG01181(model.getXCG01181());
		soapModel.setXCG01182(model.getXCG01182());
		soapModel.setXCG01183(model.getXCG01183());
		soapModel.setXCG01184(model.getXCG01184());
		soapModel.setXCG01185(model.getXCG01185());
		soapModel.setXCG01186(model.getXCG01186());
		soapModel.setXCG01187(model.getXCG01187());
		soapModel.setXCG01188(model.getXCG01188());
		soapModel.setXCG01189(model.getXCG01189());
		soapModel.setXCG01190(model.getXCG01190());
		soapModel.setXCG01191(model.getXCG01191());
		soapModel.setXCG01192(model.getXCG01192());
		soapModel.setXCG01193(model.getXCG01193());
		soapModel.setXCG01194(model.getXCG01194());
		soapModel.setXCG01195(model.getXCG01195());
		soapModel.setXCG01196(model.getXCG01196());
		soapModel.setXCG01197(model.getXCG01197());
		soapModel.setXCG01198(model.getXCG01198());
		soapModel.setXCG01199(model.getXCG01199());
		soapModel.setXCG01200(model.getXCG01200());
		soapModel.setXCG01202(model.getXCG01202());
		soapModel.setXCG01203(model.getXCG01203());
		soapModel.setXCG01204(model.getXCG01204());
		soapModel.setXCG01205(model.getXCG01205());
		soapModel.setXCG01206(model.getXCG01206());
		soapModel.setXCG01207(model.getXCG01207());
		soapModel.setXCG01208(model.getXCG01208());
		soapModel.setXCG01209(model.getXCG01209());
		soapModel.setXCG01210(model.getXCG01210());
		soapModel.setXCG01212(model.getXCG01212());
		soapModel.setXCG01213(model.getXCG01213());
		soapModel.setXCG01214(model.getXCG01214());
		soapModel.setXCG01215(model.getXCG01215());
		soapModel.setXCG01216(model.getXCG01216());
		soapModel.setXCG01217(model.getXCG01217());
		soapModel.setXCG01218(model.getXCG01218());
		soapModel.setXCG01219(model.getXCG01219());
		soapModel.setXCG01220(model.getXCG01220());
		soapModel.setXCG01221(model.getXCG01221());
		soapModel.setXCG01222(model.getXCG01222());
		soapModel.setXCG01223(model.getXCG01223());
		soapModel.setXCG01224(model.getXCG01224());
		soapModel.setXCG01225(model.getXCG01225());
		soapModel.setXCG01226(model.getXCG01226());
		soapModel.setXCG01228(model.getXCG01228());
		soapModel.setXCG01230(model.getXCG01230());
		soapModel.setXCG01231(model.getXCG01231());
		soapModel.setXCG01232(model.getXCG01232());
		soapModel.setXCG01234(model.getXCG01234());
		soapModel.setXCG01236(model.getXCG01236());
		soapModel.setXCG01237(model.getXCG01237());
		soapModel.setXCG01229(model.getXCG01229());
		soapModel.setXCG01238(model.getXCG01238());
		soapModel.setXCG01239(model.getXCG01239());
		soapModel.setXCG01240(model.getXCG01240());
		soapModel.setXCG01241(model.getXCG01241());
		soapModel.setXCG01242(model.getXCG01242());
		soapModel.setXCG01243(model.getXCG01243());
		soapModel.setXCG01235(model.getXCG01235());
		soapModel.setXCG01244(model.getXCG01244());
		soapModel.setXCG01245(model.getXCG01245());
		soapModel.setXCG01246(model.getXCG01246());
		soapModel.setXCG01247(model.getXCG01247());
		soapModel.setXCG01248(model.getXCG01248());
		soapModel.setXCG01249(model.getXCG01249());
		soapModel.setXCG11248(model.getXCG11248());
		soapModel.setXCG11249(model.getXCG11249());
		soapModel.setXCG01250(model.getXCG01250());
		soapModel.setXCG01251(model.getXCG01251());
		soapModel.setXCG01252(model.getXCG01252());
		soapModel.setXCG01253(model.getXCG01253());
		soapModel.setXCG01255(model.getXCG01255());
		soapModel.setXCG01256(model.getXCG01256());
		soapModel.setXCG01257(model.getXCG01257());
		soapModel.setXCG01258(model.getXCG01258());
		soapModel.setXCG01259(model.getXCG01259());
		soapModel.setXCG01260(model.getXCG01260());
		soapModel.setXCG01261(model.getXCG01261());
		soapModel.setXCG01262(model.getXCG01262());
		soapModel.setXCG11253(model.getXCG11253());
		soapModel.setXCG01263(model.getXCG01263());
		soapModel.setXCG01264(model.getXCG01264());
		soapModel.setXCG01265(model.getXCG01265());
		soapModel.setXCG01266(model.getXCG01266());
		soapModel.setXCG01901(model.getXCG01901());
		soapModel.setXCG01267(model.getXCG01267());
		soapModel.setXCG01902(model.getXCG01902());
		soapModel.setXCG01268(model.getXCG01268());
		soapModel.setXCG01269(model.getXCG01269());
		soapModel.setXCG01903(model.getXCG01903());
		soapModel.setXCG01270(model.getXCG01270());
		soapModel.setXCG01271(model.getXCG01271());
		soapModel.setXCG01273(model.getXCG01273());
		soapModel.setXCG01274(model.getXCG01274());
		soapModel.setXCG01275(model.getXCG01275());
		soapModel.setXCG01276(model.getXCG01276());
		soapModel.setXCG01277(model.getXCG01277());
		soapModel.setXCG01278(model.getXCG01278());
		soapModel.setXCG01279(model.getXCG01279());
		soapModel.setXCG01280(model.getXCG01280());
		soapModel.setXCG01281(model.getXCG01281());
		soapModel.setXCG01282(model.getXCG01282());
		soapModel.setXCG01283(model.getXCG01283());
		soapModel.setXCG01284(model.getXCG01284());
		soapModel.setXCG01285(model.getXCG01285());
		soapModel.setXCG01286(model.getXCG01286());
		soapModel.setXCG01287(model.getXCG01287());
		soapModel.setXCG01288(model.getXCG01288());
		soapModel.setXCG01289(model.getXCG01289());
		soapModel.setXCG01290(model.getXCG01290());
		soapModel.setXCG01291(model.getXCG01291());
		soapModel.setXCG01292(model.getXCG01292());
		soapModel.setXCG01293(model.getXCG01293());
		soapModel.setXCG01294(model.getXCG01294());
		soapModel.setXCG01295(model.getXCG01295());
		soapModel.setXCG01296(model.getXCG01296());
		soapModel.setXCG01297(model.getXCG01297());
		soapModel.setXCG01298(model.getXCG01298());
		soapModel.setXCG01300(model.getXCG01300());
		soapModel.setXCG01301(model.getXCG01301());
		soapModel.setXCG01302(model.getXCG01302());
		soapModel.setXCG01303(model.getXCG01303());
		soapModel.setXCG01304(model.getXCG01304());
		soapModel.setXCG01305(model.getXCG01305());
		soapModel.setXCG01306(model.getXCG01306());
		soapModel.setXCG01307(model.getXCG01307());
		soapModel.setXCG01308(model.getXCG01308());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRTechnicalSpec_XCGPart2Soap[] toSoapModels(
		VRTechnicalSpec_XCGPart2[] models) {
		VRTechnicalSpec_XCGPart2Soap[] soapModels = new VRTechnicalSpec_XCGPart2Soap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCGPart2Soap[][] toSoapModels(
		VRTechnicalSpec_XCGPart2[][] models) {
		VRTechnicalSpec_XCGPart2Soap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRTechnicalSpec_XCGPart2Soap[models.length][models[0].length];
		}
		else {
			soapModels = new VRTechnicalSpec_XCGPart2Soap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCGPart2Soap[] toSoapModels(
		List<VRTechnicalSpec_XCGPart2> models) {
		List<VRTechnicalSpec_XCGPart2Soap> soapModels = new ArrayList<VRTechnicalSpec_XCGPart2Soap>(models.size());

		for (VRTechnicalSpec_XCGPart2 model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRTechnicalSpec_XCGPart2Soap[soapModels.size()]);
	}

	public VRTechnicalSpec_XCGPart2Soap() {
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

	public String getXCG01163() {
		return _XCG01163;
	}

	public void setXCG01163(String XCG01163) {
		_XCG01163 = XCG01163;
	}

	public String getXCG01164() {
		return _XCG01164;
	}

	public void setXCG01164(String XCG01164) {
		_XCG01164 = XCG01164;
	}

	public String getXCG01165() {
		return _XCG01165;
	}

	public void setXCG01165(String XCG01165) {
		_XCG01165 = XCG01165;
	}

	public String getXCG01166() {
		return _XCG01166;
	}

	public void setXCG01166(String XCG01166) {
		_XCG01166 = XCG01166;
	}

	public String getXCG01167() {
		return _XCG01167;
	}

	public void setXCG01167(String XCG01167) {
		_XCG01167 = XCG01167;
	}

	public String getXCG01169() {
		return _XCG01169;
	}

	public void setXCG01169(String XCG01169) {
		_XCG01169 = XCG01169;
	}

	public String getXCG01170() {
		return _XCG01170;
	}

	public void setXCG01170(String XCG01170) {
		_XCG01170 = XCG01170;
	}

	public String getXCG01171() {
		return _XCG01171;
	}

	public void setXCG01171(String XCG01171) {
		_XCG01171 = XCG01171;
	}

	public String getXCG01172() {
		return _XCG01172;
	}

	public void setXCG01172(String XCG01172) {
		_XCG01172 = XCG01172;
	}

	public String getXCG01173() {
		return _XCG01173;
	}

	public void setXCG01173(String XCG01173) {
		_XCG01173 = XCG01173;
	}

	public String getXCG01174() {
		return _XCG01174;
	}

	public void setXCG01174(String XCG01174) {
		_XCG01174 = XCG01174;
	}

	public String getXCG01175() {
		return _XCG01175;
	}

	public void setXCG01175(String XCG01175) {
		_XCG01175 = XCG01175;
	}

	public String getXCG01176() {
		return _XCG01176;
	}

	public void setXCG01176(String XCG01176) {
		_XCG01176 = XCG01176;
	}

	public String getXCG01177() {
		return _XCG01177;
	}

	public void setXCG01177(String XCG01177) {
		_XCG01177 = XCG01177;
	}

	public String getXCG01178() {
		return _XCG01178;
	}

	public void setXCG01178(String XCG01178) {
		_XCG01178 = XCG01178;
	}

	public String getXCG01179() {
		return _XCG01179;
	}

	public void setXCG01179(String XCG01179) {
		_XCG01179 = XCG01179;
	}

	public String getXCG01180() {
		return _XCG01180;
	}

	public void setXCG01180(String XCG01180) {
		_XCG01180 = XCG01180;
	}

	public String getXCG01181() {
		return _XCG01181;
	}

	public void setXCG01181(String XCG01181) {
		_XCG01181 = XCG01181;
	}

	public String getXCG01182() {
		return _XCG01182;
	}

	public void setXCG01182(String XCG01182) {
		_XCG01182 = XCG01182;
	}

	public String getXCG01183() {
		return _XCG01183;
	}

	public void setXCG01183(String XCG01183) {
		_XCG01183 = XCG01183;
	}

	public String getXCG01184() {
		return _XCG01184;
	}

	public void setXCG01184(String XCG01184) {
		_XCG01184 = XCG01184;
	}

	public String getXCG01185() {
		return _XCG01185;
	}

	public void setXCG01185(String XCG01185) {
		_XCG01185 = XCG01185;
	}

	public String getXCG01186() {
		return _XCG01186;
	}

	public void setXCG01186(String XCG01186) {
		_XCG01186 = XCG01186;
	}

	public String getXCG01187() {
		return _XCG01187;
	}

	public void setXCG01187(String XCG01187) {
		_XCG01187 = XCG01187;
	}

	public String getXCG01188() {
		return _XCG01188;
	}

	public void setXCG01188(String XCG01188) {
		_XCG01188 = XCG01188;
	}

	public String getXCG01189() {
		return _XCG01189;
	}

	public void setXCG01189(String XCG01189) {
		_XCG01189 = XCG01189;
	}

	public String getXCG01190() {
		return _XCG01190;
	}

	public void setXCG01190(String XCG01190) {
		_XCG01190 = XCG01190;
	}

	public String getXCG01191() {
		return _XCG01191;
	}

	public void setXCG01191(String XCG01191) {
		_XCG01191 = XCG01191;
	}

	public String getXCG01192() {
		return _XCG01192;
	}

	public void setXCG01192(String XCG01192) {
		_XCG01192 = XCG01192;
	}

	public String getXCG01193() {
		return _XCG01193;
	}

	public void setXCG01193(String XCG01193) {
		_XCG01193 = XCG01193;
	}

	public String getXCG01194() {
		return _XCG01194;
	}

	public void setXCG01194(String XCG01194) {
		_XCG01194 = XCG01194;
	}

	public String getXCG01195() {
		return _XCG01195;
	}

	public void setXCG01195(String XCG01195) {
		_XCG01195 = XCG01195;
	}

	public String getXCG01196() {
		return _XCG01196;
	}

	public void setXCG01196(String XCG01196) {
		_XCG01196 = XCG01196;
	}

	public String getXCG01197() {
		return _XCG01197;
	}

	public void setXCG01197(String XCG01197) {
		_XCG01197 = XCG01197;
	}

	public String getXCG01198() {
		return _XCG01198;
	}

	public void setXCG01198(String XCG01198) {
		_XCG01198 = XCG01198;
	}

	public String getXCG01199() {
		return _XCG01199;
	}

	public void setXCG01199(String XCG01199) {
		_XCG01199 = XCG01199;
	}

	public String getXCG01200() {
		return _XCG01200;
	}

	public void setXCG01200(String XCG01200) {
		_XCG01200 = XCG01200;
	}

	public String getXCG01202() {
		return _XCG01202;
	}

	public void setXCG01202(String XCG01202) {
		_XCG01202 = XCG01202;
	}

	public String getXCG01203() {
		return _XCG01203;
	}

	public void setXCG01203(String XCG01203) {
		_XCG01203 = XCG01203;
	}

	public String getXCG01204() {
		return _XCG01204;
	}

	public void setXCG01204(String XCG01204) {
		_XCG01204 = XCG01204;
	}

	public String getXCG01205() {
		return _XCG01205;
	}

	public void setXCG01205(String XCG01205) {
		_XCG01205 = XCG01205;
	}

	public String getXCG01206() {
		return _XCG01206;
	}

	public void setXCG01206(String XCG01206) {
		_XCG01206 = XCG01206;
	}

	public String getXCG01207() {
		return _XCG01207;
	}

	public void setXCG01207(String XCG01207) {
		_XCG01207 = XCG01207;
	}

	public String getXCG01208() {
		return _XCG01208;
	}

	public void setXCG01208(String XCG01208) {
		_XCG01208 = XCG01208;
	}

	public String getXCG01209() {
		return _XCG01209;
	}

	public void setXCG01209(String XCG01209) {
		_XCG01209 = XCG01209;
	}

	public String getXCG01210() {
		return _XCG01210;
	}

	public void setXCG01210(String XCG01210) {
		_XCG01210 = XCG01210;
	}

	public String getXCG01212() {
		return _XCG01212;
	}

	public void setXCG01212(String XCG01212) {
		_XCG01212 = XCG01212;
	}

	public String getXCG01213() {
		return _XCG01213;
	}

	public void setXCG01213(String XCG01213) {
		_XCG01213 = XCG01213;
	}

	public String getXCG01214() {
		return _XCG01214;
	}

	public void setXCG01214(String XCG01214) {
		_XCG01214 = XCG01214;
	}

	public String getXCG01215() {
		return _XCG01215;
	}

	public void setXCG01215(String XCG01215) {
		_XCG01215 = XCG01215;
	}

	public String getXCG01216() {
		return _XCG01216;
	}

	public void setXCG01216(String XCG01216) {
		_XCG01216 = XCG01216;
	}

	public String getXCG01217() {
		return _XCG01217;
	}

	public void setXCG01217(String XCG01217) {
		_XCG01217 = XCG01217;
	}

	public String getXCG01218() {
		return _XCG01218;
	}

	public void setXCG01218(String XCG01218) {
		_XCG01218 = XCG01218;
	}

	public String getXCG01219() {
		return _XCG01219;
	}

	public void setXCG01219(String XCG01219) {
		_XCG01219 = XCG01219;
	}

	public String getXCG01220() {
		return _XCG01220;
	}

	public void setXCG01220(String XCG01220) {
		_XCG01220 = XCG01220;
	}

	public String getXCG01221() {
		return _XCG01221;
	}

	public void setXCG01221(String XCG01221) {
		_XCG01221 = XCG01221;
	}

	public String getXCG01222() {
		return _XCG01222;
	}

	public void setXCG01222(String XCG01222) {
		_XCG01222 = XCG01222;
	}

	public String getXCG01223() {
		return _XCG01223;
	}

	public void setXCG01223(String XCG01223) {
		_XCG01223 = XCG01223;
	}

	public String getXCG01224() {
		return _XCG01224;
	}

	public void setXCG01224(String XCG01224) {
		_XCG01224 = XCG01224;
	}

	public String getXCG01225() {
		return _XCG01225;
	}

	public void setXCG01225(String XCG01225) {
		_XCG01225 = XCG01225;
	}

	public String getXCG01226() {
		return _XCG01226;
	}

	public void setXCG01226(String XCG01226) {
		_XCG01226 = XCG01226;
	}

	public String getXCG01228() {
		return _XCG01228;
	}

	public void setXCG01228(String XCG01228) {
		_XCG01228 = XCG01228;
	}

	public String getXCG01230() {
		return _XCG01230;
	}

	public void setXCG01230(String XCG01230) {
		_XCG01230 = XCG01230;
	}

	public String getXCG01231() {
		return _XCG01231;
	}

	public void setXCG01231(String XCG01231) {
		_XCG01231 = XCG01231;
	}

	public String getXCG01232() {
		return _XCG01232;
	}

	public void setXCG01232(String XCG01232) {
		_XCG01232 = XCG01232;
	}

	public String getXCG01234() {
		return _XCG01234;
	}

	public void setXCG01234(String XCG01234) {
		_XCG01234 = XCG01234;
	}

	public String getXCG01236() {
		return _XCG01236;
	}

	public void setXCG01236(String XCG01236) {
		_XCG01236 = XCG01236;
	}

	public String getXCG01237() {
		return _XCG01237;
	}

	public void setXCG01237(String XCG01237) {
		_XCG01237 = XCG01237;
	}

	public String getXCG01229() {
		return _XCG01229;
	}

	public void setXCG01229(String XCG01229) {
		_XCG01229 = XCG01229;
	}

	public String getXCG01238() {
		return _XCG01238;
	}

	public void setXCG01238(String XCG01238) {
		_XCG01238 = XCG01238;
	}

	public String getXCG01239() {
		return _XCG01239;
	}

	public void setXCG01239(String XCG01239) {
		_XCG01239 = XCG01239;
	}

	public String getXCG01240() {
		return _XCG01240;
	}

	public void setXCG01240(String XCG01240) {
		_XCG01240 = XCG01240;
	}

	public String getXCG01241() {
		return _XCG01241;
	}

	public void setXCG01241(String XCG01241) {
		_XCG01241 = XCG01241;
	}

	public String getXCG01242() {
		return _XCG01242;
	}

	public void setXCG01242(String XCG01242) {
		_XCG01242 = XCG01242;
	}

	public String getXCG01243() {
		return _XCG01243;
	}

	public void setXCG01243(String XCG01243) {
		_XCG01243 = XCG01243;
	}

	public String getXCG01235() {
		return _XCG01235;
	}

	public void setXCG01235(String XCG01235) {
		_XCG01235 = XCG01235;
	}

	public String getXCG01244() {
		return _XCG01244;
	}

	public void setXCG01244(String XCG01244) {
		_XCG01244 = XCG01244;
	}

	public String getXCG01245() {
		return _XCG01245;
	}

	public void setXCG01245(String XCG01245) {
		_XCG01245 = XCG01245;
	}

	public String getXCG01246() {
		return _XCG01246;
	}

	public void setXCG01246(String XCG01246) {
		_XCG01246 = XCG01246;
	}

	public String getXCG01247() {
		return _XCG01247;
	}

	public void setXCG01247(String XCG01247) {
		_XCG01247 = XCG01247;
	}

	public String getXCG01248() {
		return _XCG01248;
	}

	public void setXCG01248(String XCG01248) {
		_XCG01248 = XCG01248;
	}

	public String getXCG01249() {
		return _XCG01249;
	}

	public void setXCG01249(String XCG01249) {
		_XCG01249 = XCG01249;
	}

	public String getXCG11248() {
		return _XCG11248;
	}

	public void setXCG11248(String XCG11248) {
		_XCG11248 = XCG11248;
	}

	public String getXCG11249() {
		return _XCG11249;
	}

	public void setXCG11249(String XCG11249) {
		_XCG11249 = XCG11249;
	}

	public String getXCG01250() {
		return _XCG01250;
	}

	public void setXCG01250(String XCG01250) {
		_XCG01250 = XCG01250;
	}

	public String getXCG01251() {
		return _XCG01251;
	}

	public void setXCG01251(String XCG01251) {
		_XCG01251 = XCG01251;
	}

	public String getXCG01252() {
		return _XCG01252;
	}

	public void setXCG01252(String XCG01252) {
		_XCG01252 = XCG01252;
	}

	public String getXCG01253() {
		return _XCG01253;
	}

	public void setXCG01253(String XCG01253) {
		_XCG01253 = XCG01253;
	}

	public String getXCG01255() {
		return _XCG01255;
	}

	public void setXCG01255(String XCG01255) {
		_XCG01255 = XCG01255;
	}

	public String getXCG01256() {
		return _XCG01256;
	}

	public void setXCG01256(String XCG01256) {
		_XCG01256 = XCG01256;
	}

	public String getXCG01257() {
		return _XCG01257;
	}

	public void setXCG01257(String XCG01257) {
		_XCG01257 = XCG01257;
	}

	public String getXCG01258() {
		return _XCG01258;
	}

	public void setXCG01258(String XCG01258) {
		_XCG01258 = XCG01258;
	}

	public String getXCG01259() {
		return _XCG01259;
	}

	public void setXCG01259(String XCG01259) {
		_XCG01259 = XCG01259;
	}

	public String getXCG01260() {
		return _XCG01260;
	}

	public void setXCG01260(String XCG01260) {
		_XCG01260 = XCG01260;
	}

	public String getXCG01261() {
		return _XCG01261;
	}

	public void setXCG01261(String XCG01261) {
		_XCG01261 = XCG01261;
	}

	public String getXCG01262() {
		return _XCG01262;
	}

	public void setXCG01262(String XCG01262) {
		_XCG01262 = XCG01262;
	}

	public String getXCG11253() {
		return _XCG11253;
	}

	public void setXCG11253(String XCG11253) {
		_XCG11253 = XCG11253;
	}

	public String getXCG01263() {
		return _XCG01263;
	}

	public void setXCG01263(String XCG01263) {
		_XCG01263 = XCG01263;
	}

	public String getXCG01264() {
		return _XCG01264;
	}

	public void setXCG01264(String XCG01264) {
		_XCG01264 = XCG01264;
	}

	public String getXCG01265() {
		return _XCG01265;
	}

	public void setXCG01265(String XCG01265) {
		_XCG01265 = XCG01265;
	}

	public String getXCG01266() {
		return _XCG01266;
	}

	public void setXCG01266(String XCG01266) {
		_XCG01266 = XCG01266;
	}

	public String getXCG01901() {
		return _XCG01901;
	}

	public void setXCG01901(String XCG01901) {
		_XCG01901 = XCG01901;
	}

	public String getXCG01267() {
		return _XCG01267;
	}

	public void setXCG01267(String XCG01267) {
		_XCG01267 = XCG01267;
	}

	public String getXCG01902() {
		return _XCG01902;
	}

	public void setXCG01902(String XCG01902) {
		_XCG01902 = XCG01902;
	}

	public String getXCG01268() {
		return _XCG01268;
	}

	public void setXCG01268(String XCG01268) {
		_XCG01268 = XCG01268;
	}

	public String getXCG01269() {
		return _XCG01269;
	}

	public void setXCG01269(String XCG01269) {
		_XCG01269 = XCG01269;
	}

	public String getXCG01903() {
		return _XCG01903;
	}

	public void setXCG01903(String XCG01903) {
		_XCG01903 = XCG01903;
	}

	public String getXCG01270() {
		return _XCG01270;
	}

	public void setXCG01270(String XCG01270) {
		_XCG01270 = XCG01270;
	}

	public String getXCG01271() {
		return _XCG01271;
	}

	public void setXCG01271(String XCG01271) {
		_XCG01271 = XCG01271;
	}

	public String getXCG01273() {
		return _XCG01273;
	}

	public void setXCG01273(String XCG01273) {
		_XCG01273 = XCG01273;
	}

	public String getXCG01274() {
		return _XCG01274;
	}

	public void setXCG01274(String XCG01274) {
		_XCG01274 = XCG01274;
	}

	public String getXCG01275() {
		return _XCG01275;
	}

	public void setXCG01275(String XCG01275) {
		_XCG01275 = XCG01275;
	}

	public String getXCG01276() {
		return _XCG01276;
	}

	public void setXCG01276(String XCG01276) {
		_XCG01276 = XCG01276;
	}

	public String getXCG01277() {
		return _XCG01277;
	}

	public void setXCG01277(String XCG01277) {
		_XCG01277 = XCG01277;
	}

	public String getXCG01278() {
		return _XCG01278;
	}

	public void setXCG01278(String XCG01278) {
		_XCG01278 = XCG01278;
	}

	public String getXCG01279() {
		return _XCG01279;
	}

	public void setXCG01279(String XCG01279) {
		_XCG01279 = XCG01279;
	}

	public String getXCG01280() {
		return _XCG01280;
	}

	public void setXCG01280(String XCG01280) {
		_XCG01280 = XCG01280;
	}

	public String getXCG01281() {
		return _XCG01281;
	}

	public void setXCG01281(String XCG01281) {
		_XCG01281 = XCG01281;
	}

	public String getXCG01282() {
		return _XCG01282;
	}

	public void setXCG01282(String XCG01282) {
		_XCG01282 = XCG01282;
	}

	public String getXCG01283() {
		return _XCG01283;
	}

	public void setXCG01283(String XCG01283) {
		_XCG01283 = XCG01283;
	}

	public String getXCG01284() {
		return _XCG01284;
	}

	public void setXCG01284(String XCG01284) {
		_XCG01284 = XCG01284;
	}

	public String getXCG01285() {
		return _XCG01285;
	}

	public void setXCG01285(String XCG01285) {
		_XCG01285 = XCG01285;
	}

	public String getXCG01286() {
		return _XCG01286;
	}

	public void setXCG01286(String XCG01286) {
		_XCG01286 = XCG01286;
	}

	public String getXCG01287() {
		return _XCG01287;
	}

	public void setXCG01287(String XCG01287) {
		_XCG01287 = XCG01287;
	}

	public String getXCG01288() {
		return _XCG01288;
	}

	public void setXCG01288(String XCG01288) {
		_XCG01288 = XCG01288;
	}

	public String getXCG01289() {
		return _XCG01289;
	}

	public void setXCG01289(String XCG01289) {
		_XCG01289 = XCG01289;
	}

	public String getXCG01290() {
		return _XCG01290;
	}

	public void setXCG01290(String XCG01290) {
		_XCG01290 = XCG01290;
	}

	public String getXCG01291() {
		return _XCG01291;
	}

	public void setXCG01291(String XCG01291) {
		_XCG01291 = XCG01291;
	}

	public String getXCG01292() {
		return _XCG01292;
	}

	public void setXCG01292(String XCG01292) {
		_XCG01292 = XCG01292;
	}

	public String getXCG01293() {
		return _XCG01293;
	}

	public void setXCG01293(String XCG01293) {
		_XCG01293 = XCG01293;
	}

	public String getXCG01294() {
		return _XCG01294;
	}

	public void setXCG01294(String XCG01294) {
		_XCG01294 = XCG01294;
	}

	public String getXCG01295() {
		return _XCG01295;
	}

	public void setXCG01295(String XCG01295) {
		_XCG01295 = XCG01295;
	}

	public String getXCG01296() {
		return _XCG01296;
	}

	public void setXCG01296(String XCG01296) {
		_XCG01296 = XCG01296;
	}

	public String getXCG01297() {
		return _XCG01297;
	}

	public void setXCG01297(String XCG01297) {
		_XCG01297 = XCG01297;
	}

	public String getXCG01298() {
		return _XCG01298;
	}

	public void setXCG01298(String XCG01298) {
		_XCG01298 = XCG01298;
	}

	public String getXCG01300() {
		return _XCG01300;
	}

	public void setXCG01300(String XCG01300) {
		_XCG01300 = XCG01300;
	}

	public String getXCG01301() {
		return _XCG01301;
	}

	public void setXCG01301(String XCG01301) {
		_XCG01301 = XCG01301;
	}

	public String getXCG01302() {
		return _XCG01302;
	}

	public void setXCG01302(String XCG01302) {
		_XCG01302 = XCG01302;
	}

	public String getXCG01303() {
		return _XCG01303;
	}

	public void setXCG01303(String XCG01303) {
		_XCG01303 = XCG01303;
	}

	public String getXCG01304() {
		return _XCG01304;
	}

	public void setXCG01304(String XCG01304) {
		_XCG01304 = XCG01304;
	}

	public String getXCG01305() {
		return _XCG01305;
	}

	public void setXCG01305(String XCG01305) {
		_XCG01305 = XCG01305;
	}

	public String getXCG01306() {
		return _XCG01306;
	}

	public void setXCG01306(String XCG01306) {
		_XCG01306 = XCG01306;
	}

	public String getXCG01307() {
		return _XCG01307;
	}

	public void setXCG01307(String XCG01307) {
		_XCG01307 = XCG01307;
	}

	public String getXCG01308() {
		return _XCG01308;
	}

	public void setXCG01308(String XCG01308) {
		_XCG01308 = XCG01308;
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
	private String _XCG01163;
	private String _XCG01164;
	private String _XCG01165;
	private String _XCG01166;
	private String _XCG01167;
	private String _XCG01169;
	private String _XCG01170;
	private String _XCG01171;
	private String _XCG01172;
	private String _XCG01173;
	private String _XCG01174;
	private String _XCG01175;
	private String _XCG01176;
	private String _XCG01177;
	private String _XCG01178;
	private String _XCG01179;
	private String _XCG01180;
	private String _XCG01181;
	private String _XCG01182;
	private String _XCG01183;
	private String _XCG01184;
	private String _XCG01185;
	private String _XCG01186;
	private String _XCG01187;
	private String _XCG01188;
	private String _XCG01189;
	private String _XCG01190;
	private String _XCG01191;
	private String _XCG01192;
	private String _XCG01193;
	private String _XCG01194;
	private String _XCG01195;
	private String _XCG01196;
	private String _XCG01197;
	private String _XCG01198;
	private String _XCG01199;
	private String _XCG01200;
	private String _XCG01202;
	private String _XCG01203;
	private String _XCG01204;
	private String _XCG01205;
	private String _XCG01206;
	private String _XCG01207;
	private String _XCG01208;
	private String _XCG01209;
	private String _XCG01210;
	private String _XCG01212;
	private String _XCG01213;
	private String _XCG01214;
	private String _XCG01215;
	private String _XCG01216;
	private String _XCG01217;
	private String _XCG01218;
	private String _XCG01219;
	private String _XCG01220;
	private String _XCG01221;
	private String _XCG01222;
	private String _XCG01223;
	private String _XCG01224;
	private String _XCG01225;
	private String _XCG01226;
	private String _XCG01228;
	private String _XCG01230;
	private String _XCG01231;
	private String _XCG01232;
	private String _XCG01234;
	private String _XCG01236;
	private String _XCG01237;
	private String _XCG01229;
	private String _XCG01238;
	private String _XCG01239;
	private String _XCG01240;
	private String _XCG01241;
	private String _XCG01242;
	private String _XCG01243;
	private String _XCG01235;
	private String _XCG01244;
	private String _XCG01245;
	private String _XCG01246;
	private String _XCG01247;
	private String _XCG01248;
	private String _XCG01249;
	private String _XCG11248;
	private String _XCG11249;
	private String _XCG01250;
	private String _XCG01251;
	private String _XCG01252;
	private String _XCG01253;
	private String _XCG01255;
	private String _XCG01256;
	private String _XCG01257;
	private String _XCG01258;
	private String _XCG01259;
	private String _XCG01260;
	private String _XCG01261;
	private String _XCG01262;
	private String _XCG11253;
	private String _XCG01263;
	private String _XCG01264;
	private String _XCG01265;
	private String _XCG01266;
	private String _XCG01901;
	private String _XCG01267;
	private String _XCG01902;
	private String _XCG01268;
	private String _XCG01269;
	private String _XCG01903;
	private String _XCG01270;
	private String _XCG01271;
	private String _XCG01273;
	private String _XCG01274;
	private String _XCG01275;
	private String _XCG01276;
	private String _XCG01277;
	private String _XCG01278;
	private String _XCG01279;
	private String _XCG01280;
	private String _XCG01281;
	private String _XCG01282;
	private String _XCG01283;
	private String _XCG01284;
	private String _XCG01285;
	private String _XCG01286;
	private String _XCG01287;
	private String _XCG01288;
	private String _XCG01289;
	private String _XCG01290;
	private String _XCG01291;
	private String _XCG01292;
	private String _XCG01293;
	private String _XCG01294;
	private String _XCG01295;
	private String _XCG01296;
	private String _XCG01297;
	private String _XCG01298;
	private String _XCG01300;
	private String _XCG01301;
	private String _XCG01302;
	private String _XCG01303;
	private String _XCG01304;
	private String _XCG01305;
	private String _XCG01306;
	private String _XCG01307;
	private String _XCG01308;
	private Date _modifyDate;
	private Date _syncDate;
}