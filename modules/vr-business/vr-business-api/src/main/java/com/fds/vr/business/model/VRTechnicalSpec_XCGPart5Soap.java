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
public class VRTechnicalSpec_XCGPart5Soap implements Serializable {
	public static VRTechnicalSpec_XCGPart5Soap toSoapModel(
		VRTechnicalSpec_XCGPart5 model) {
		VRTechnicalSpec_XCGPart5Soap soapModel = new VRTechnicalSpec_XCGPart5Soap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setConvertAssembleId(model.getConvertAssembleId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setReferenceUid(model.getReferenceUid());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDeliverableCode(model.getDeliverableCode());
		soapModel.setVehicleTypeCertificateId(model.getVehicleTypeCertificateId());
		soapModel.setXCG01598(model.getXCG01598());
		soapModel.setXCG01599(model.getXCG01599());
		soapModel.setXCG01600(model.getXCG01600());
		soapModel.setXCG01601(model.getXCG01601());
		soapModel.setXCG01602(model.getXCG01602());
		soapModel.setXCG01603(model.getXCG01603());
		soapModel.setXCG01923(model.getXCG01923());
		soapModel.setXCG01604(model.getXCG01604());
		soapModel.setXCG01924(model.getXCG01924());
		soapModel.setXCG01605(model.getXCG01605());
		soapModel.setXCG01606(model.getXCG01606());
		soapModel.setXCG01607(model.getXCG01607());
		soapModel.setXCG01608(model.getXCG01608());
		soapModel.setXCG01609(model.getXCG01609());
		soapModel.setXCG01925(model.getXCG01925());
		soapModel.setXCG01610(model.getXCG01610());
		soapModel.setXCG01926(model.getXCG01926());
		soapModel.setXCG01611(model.getXCG01611());
		soapModel.setXCG01612(model.getXCG01612());
		soapModel.setXCG01928(model.getXCG01928());
		soapModel.setXCG01613(model.getXCG01613());
		soapModel.setXCG01929(model.getXCG01929());
		soapModel.setXCG01614(model.getXCG01614());
		soapModel.setXCG01930(model.getXCG01930());
		soapModel.setXCG01615(model.getXCG01615());
		soapModel.setXCG01931(model.getXCG01931());
		soapModel.setXCG01616(model.getXCG01616());
		soapModel.setXCG01932(model.getXCG01932());
		soapModel.setXCG01617(model.getXCG01617());
		soapModel.setXCG01933(model.getXCG01933());
		soapModel.setXCG01618(model.getXCG01618());
		soapModel.setXCG01934(model.getXCG01934());
		soapModel.setXCG01619(model.getXCG01619());
		soapModel.setXCG01935(model.getXCG01935());
		soapModel.setXCG01620(model.getXCG01620());
		soapModel.setXCG01936(model.getXCG01936());
		soapModel.setXCG01621(model.getXCG01621());
		soapModel.setXCG01937(model.getXCG01937());
		soapModel.setXCG01622(model.getXCG01622());
		soapModel.setXCG01938(model.getXCG01938());
		soapModel.setXCG01623(model.getXCG01623());
		soapModel.setXCG01939(model.getXCG01939());
		soapModel.setXCG01624(model.getXCG01624());
		soapModel.setXCG01940(model.getXCG01940());
		soapModel.setXCG01625(model.getXCG01625());
		soapModel.setXCG01941(model.getXCG01941());
		soapModel.setXCG01626(model.getXCG01626());
		soapModel.setXCG01942(model.getXCG01942());
		soapModel.setXCG01627(model.getXCG01627());
		soapModel.setXCG01943(model.getXCG01943());
		soapModel.setXCG01628(model.getXCG01628());
		soapModel.setXCG01944(model.getXCG01944());
		soapModel.setXCG01630(model.getXCG01630());
		soapModel.setXCG01631(model.getXCG01631());
		soapModel.setXCG01632(model.getXCG01632());
		soapModel.setXCG01633(model.getXCG01633());
		soapModel.setXCG01634(model.getXCG01634());
		soapModel.setXCG01635(model.getXCG01635());
		soapModel.setXCG01636(model.getXCG01636());
		soapModel.setXCG01637(model.getXCG01637());
		soapModel.setXCG01638(model.getXCG01638());
		soapModel.setXCG01639(model.getXCG01639());
		soapModel.setXCG01640(model.getXCG01640());
		soapModel.setXCG01641(model.getXCG01641());
		soapModel.setXCG01642(model.getXCG01642());
		soapModel.setXCG01643(model.getXCG01643());
		soapModel.setXCG01644(model.getXCG01644());
		soapModel.setXCG01645(model.getXCG01645());
		soapModel.setXCG01646(model.getXCG01646());
		soapModel.setXCG01647(model.getXCG01647());
		soapModel.setXCG01648(model.getXCG01648());
		soapModel.setXCG01649(model.getXCG01649());
		soapModel.setXCG01650(model.getXCG01650());
		soapModel.setXCG01651(model.getXCG01651());
		soapModel.setXCG01652(model.getXCG01652());
		soapModel.setXCG01653(model.getXCG01653());
		soapModel.setXCG01654(model.getXCG01654());
		soapModel.setXCG01655(model.getXCG01655());
		soapModel.setXCG01656(model.getXCG01656());
		soapModel.setXCG01657(model.getXCG01657());
		soapModel.setXCG01658(model.getXCG01658());
		soapModel.setXCG01659(model.getXCG01659());
		soapModel.setXCG01660(model.getXCG01660());
		soapModel.setXCG01661(model.getXCG01661());
		soapModel.setXCG01662(model.getXCG01662());
		soapModel.setXCG01663(model.getXCG01663());
		soapModel.setXCG01664(model.getXCG01664());
		soapModel.setXCG01665(model.getXCG01665());
		soapModel.setXCG01666(model.getXCG01666());
		soapModel.setXCG01667(model.getXCG01667());
		soapModel.setXCG01668(model.getXCG01668());
		soapModel.setXCG01669(model.getXCG01669());
		soapModel.setXCG01670(model.getXCG01670());
		soapModel.setXCG01671(model.getXCG01671());
		soapModel.setXCG01672(model.getXCG01672());
		soapModel.setXCG01673(model.getXCG01673());
		soapModel.setXCG01674(model.getXCG01674());
		soapModel.setXCG01675(model.getXCG01675());
		soapModel.setXCG01676(model.getXCG01676());
		soapModel.setXCG01677(model.getXCG01677());
		soapModel.setXCG01678(model.getXCG01678());
		soapModel.setXCG01679(model.getXCG01679());
		soapModel.setXCG01680(model.getXCG01680());
		soapModel.setXCG01681(model.getXCG01681());
		soapModel.setXCG01682(model.getXCG01682());
		soapModel.setXCG01683(model.getXCG01683());
		soapModel.setXCG01684(model.getXCG01684());
		soapModel.setXCG01685(model.getXCG01685());
		soapModel.setXCG01686(model.getXCG01686());
		soapModel.setXCG01687(model.getXCG01687());
		soapModel.setXCG01688(model.getXCG01688());
		soapModel.setXCG01689(model.getXCG01689());
		soapModel.setXCG01690(model.getXCG01690());
		soapModel.setXCG01691(model.getXCG01691());
		soapModel.setXCG01692(model.getXCG01692());
		soapModel.setXCG01693(model.getXCG01693());
		soapModel.setXCG01694(model.getXCG01694());
		soapModel.setXCG01695(model.getXCG01695());
		soapModel.setXCG01696(model.getXCG01696());
		soapModel.setXCG01697(model.getXCG01697());
		soapModel.setXCG01698(model.getXCG01698());
		soapModel.setXCG01699(model.getXCG01699());
		soapModel.setXCG01700(model.getXCG01700());
		soapModel.setXCG01701(model.getXCG01701());
		soapModel.setXCG01702(model.getXCG01702());
		soapModel.setXCG01703(model.getXCG01703());
		soapModel.setXCG01704(model.getXCG01704());
		soapModel.setXCG01705(model.getXCG01705());
		soapModel.setXCG01706(model.getXCG01706());
		soapModel.setXCG01707(model.getXCG01707());
		soapModel.setXCG01708(model.getXCG01708());
		soapModel.setXCG01709(model.getXCG01709());
		soapModel.setXCG01710(model.getXCG01710());
		soapModel.setXCG01711(model.getXCG01711());
		soapModel.setXCG01712(model.getXCG01712());
		soapModel.setXCG01713(model.getXCG01713());
		soapModel.setXCG01714(model.getXCG01714());
		soapModel.setXCG01715(model.getXCG01715());
		soapModel.setXCG01716(model.getXCG01716());
		soapModel.setXCG01717(model.getXCG01717());
		soapModel.setXCG01718(model.getXCG01718());
		soapModel.setXCG01719(model.getXCG01719());
		soapModel.setXCG01720(model.getXCG01720());
		soapModel.setXCG01721(model.getXCG01721());
		soapModel.setXCG01722(model.getXCG01722());
		soapModel.setXCG01723(model.getXCG01723());
		soapModel.setXCG01724(model.getXCG01724());
		soapModel.setXCG01725(model.getXCG01725());
		soapModel.setXCG01726(model.getXCG01726());
		soapModel.setXCG01727(model.getXCG01727());
		soapModel.setXCG01728(model.getXCG01728());
		soapModel.setXCG01729(model.getXCG01729());
		soapModel.setXCG01730(model.getXCG01730());
		soapModel.setXCG01731(model.getXCG01731());
		soapModel.setXCG01732(model.getXCG01732());
		soapModel.setXCG01733(model.getXCG01733());
		soapModel.setXCG01734(model.getXCG01734());
		soapModel.setXCG01735(model.getXCG01735());
		soapModel.setXCG01736(model.getXCG01736());
		soapModel.setXCG01737(model.getXCG01737());
		soapModel.setXCG01738(model.getXCG01738());
		soapModel.setXCG01739(model.getXCG01739());
		soapModel.setXCG01740(model.getXCG01740());
		soapModel.setXCG01741(model.getXCG01741());
		soapModel.setXCG01742(model.getXCG01742());
		soapModel.setXCG01744(model.getXCG01744());
		soapModel.setXCG01745(model.getXCG01745());
		soapModel.setXCG01746(model.getXCG01746());
		soapModel.setXCG01747(model.getXCG01747());
		soapModel.setXCG01748(model.getXCG01748());
		soapModel.setXCG01749(model.getXCG01749());
		soapModel.setXCG01945(model.getXCG01945());
		soapModel.setXCG01750(model.getXCG01750());
		soapModel.setXCG01946(model.getXCG01946());
		soapModel.setXCG01751(model.getXCG01751());
		soapModel.setXCG01752(model.getXCG01752());
		soapModel.setXCG01753(model.getXCG01753());
		soapModel.setXCG01754(model.getXCG01754());
		soapModel.setXCG01756(model.getXCG01756());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRTechnicalSpec_XCGPart5Soap[] toSoapModels(
		VRTechnicalSpec_XCGPart5[] models) {
		VRTechnicalSpec_XCGPart5Soap[] soapModels = new VRTechnicalSpec_XCGPart5Soap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCGPart5Soap[][] toSoapModels(
		VRTechnicalSpec_XCGPart5[][] models) {
		VRTechnicalSpec_XCGPart5Soap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRTechnicalSpec_XCGPart5Soap[models.length][models[0].length];
		}
		else {
			soapModels = new VRTechnicalSpec_XCGPart5Soap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCGPart5Soap[] toSoapModels(
		List<VRTechnicalSpec_XCGPart5> models) {
		List<VRTechnicalSpec_XCGPart5Soap> soapModels = new ArrayList<VRTechnicalSpec_XCGPart5Soap>(models.size());

		for (VRTechnicalSpec_XCGPart5 model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRTechnicalSpec_XCGPart5Soap[soapModels.size()]);
	}

	public VRTechnicalSpec_XCGPart5Soap() {
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

	public String getXCG01598() {
		return _XCG01598;
	}

	public void setXCG01598(String XCG01598) {
		_XCG01598 = XCG01598;
	}

	public String getXCG01599() {
		return _XCG01599;
	}

	public void setXCG01599(String XCG01599) {
		_XCG01599 = XCG01599;
	}

	public String getXCG01600() {
		return _XCG01600;
	}

	public void setXCG01600(String XCG01600) {
		_XCG01600 = XCG01600;
	}

	public String getXCG01601() {
		return _XCG01601;
	}

	public void setXCG01601(String XCG01601) {
		_XCG01601 = XCG01601;
	}

	public String getXCG01602() {
		return _XCG01602;
	}

	public void setXCG01602(String XCG01602) {
		_XCG01602 = XCG01602;
	}

	public String getXCG01603() {
		return _XCG01603;
	}

	public void setXCG01603(String XCG01603) {
		_XCG01603 = XCG01603;
	}

	public String getXCG01923() {
		return _XCG01923;
	}

	public void setXCG01923(String XCG01923) {
		_XCG01923 = XCG01923;
	}

	public String getXCG01604() {
		return _XCG01604;
	}

	public void setXCG01604(String XCG01604) {
		_XCG01604 = XCG01604;
	}

	public String getXCG01924() {
		return _XCG01924;
	}

	public void setXCG01924(String XCG01924) {
		_XCG01924 = XCG01924;
	}

	public String getXCG01605() {
		return _XCG01605;
	}

	public void setXCG01605(String XCG01605) {
		_XCG01605 = XCG01605;
	}

	public String getXCG01606() {
		return _XCG01606;
	}

	public void setXCG01606(String XCG01606) {
		_XCG01606 = XCG01606;
	}

	public String getXCG01607() {
		return _XCG01607;
	}

	public void setXCG01607(String XCG01607) {
		_XCG01607 = XCG01607;
	}

	public String getXCG01608() {
		return _XCG01608;
	}

	public void setXCG01608(String XCG01608) {
		_XCG01608 = XCG01608;
	}

	public String getXCG01609() {
		return _XCG01609;
	}

	public void setXCG01609(String XCG01609) {
		_XCG01609 = XCG01609;
	}

	public String getXCG01925() {
		return _XCG01925;
	}

	public void setXCG01925(String XCG01925) {
		_XCG01925 = XCG01925;
	}

	public String getXCG01610() {
		return _XCG01610;
	}

	public void setXCG01610(String XCG01610) {
		_XCG01610 = XCG01610;
	}

	public String getXCG01926() {
		return _XCG01926;
	}

	public void setXCG01926(String XCG01926) {
		_XCG01926 = XCG01926;
	}

	public String getXCG01611() {
		return _XCG01611;
	}

	public void setXCG01611(String XCG01611) {
		_XCG01611 = XCG01611;
	}

	public String getXCG01612() {
		return _XCG01612;
	}

	public void setXCG01612(String XCG01612) {
		_XCG01612 = XCG01612;
	}

	public String getXCG01928() {
		return _XCG01928;
	}

	public void setXCG01928(String XCG01928) {
		_XCG01928 = XCG01928;
	}

	public String getXCG01613() {
		return _XCG01613;
	}

	public void setXCG01613(String XCG01613) {
		_XCG01613 = XCG01613;
	}

	public String getXCG01929() {
		return _XCG01929;
	}

	public void setXCG01929(String XCG01929) {
		_XCG01929 = XCG01929;
	}

	public String getXCG01614() {
		return _XCG01614;
	}

	public void setXCG01614(String XCG01614) {
		_XCG01614 = XCG01614;
	}

	public String getXCG01930() {
		return _XCG01930;
	}

	public void setXCG01930(String XCG01930) {
		_XCG01930 = XCG01930;
	}

	public String getXCG01615() {
		return _XCG01615;
	}

	public void setXCG01615(String XCG01615) {
		_XCG01615 = XCG01615;
	}

	public String getXCG01931() {
		return _XCG01931;
	}

	public void setXCG01931(String XCG01931) {
		_XCG01931 = XCG01931;
	}

	public String getXCG01616() {
		return _XCG01616;
	}

	public void setXCG01616(String XCG01616) {
		_XCG01616 = XCG01616;
	}

	public String getXCG01932() {
		return _XCG01932;
	}

	public void setXCG01932(String XCG01932) {
		_XCG01932 = XCG01932;
	}

	public String getXCG01617() {
		return _XCG01617;
	}

	public void setXCG01617(String XCG01617) {
		_XCG01617 = XCG01617;
	}

	public String getXCG01933() {
		return _XCG01933;
	}

	public void setXCG01933(String XCG01933) {
		_XCG01933 = XCG01933;
	}

	public String getXCG01618() {
		return _XCG01618;
	}

	public void setXCG01618(String XCG01618) {
		_XCG01618 = XCG01618;
	}

	public String getXCG01934() {
		return _XCG01934;
	}

	public void setXCG01934(String XCG01934) {
		_XCG01934 = XCG01934;
	}

	public String getXCG01619() {
		return _XCG01619;
	}

	public void setXCG01619(String XCG01619) {
		_XCG01619 = XCG01619;
	}

	public String getXCG01935() {
		return _XCG01935;
	}

	public void setXCG01935(String XCG01935) {
		_XCG01935 = XCG01935;
	}

	public String getXCG01620() {
		return _XCG01620;
	}

	public void setXCG01620(String XCG01620) {
		_XCG01620 = XCG01620;
	}

	public String getXCG01936() {
		return _XCG01936;
	}

	public void setXCG01936(String XCG01936) {
		_XCG01936 = XCG01936;
	}

	public String getXCG01621() {
		return _XCG01621;
	}

	public void setXCG01621(String XCG01621) {
		_XCG01621 = XCG01621;
	}

	public String getXCG01937() {
		return _XCG01937;
	}

	public void setXCG01937(String XCG01937) {
		_XCG01937 = XCG01937;
	}

	public String getXCG01622() {
		return _XCG01622;
	}

	public void setXCG01622(String XCG01622) {
		_XCG01622 = XCG01622;
	}

	public String getXCG01938() {
		return _XCG01938;
	}

	public void setXCG01938(String XCG01938) {
		_XCG01938 = XCG01938;
	}

	public String getXCG01623() {
		return _XCG01623;
	}

	public void setXCG01623(String XCG01623) {
		_XCG01623 = XCG01623;
	}

	public String getXCG01939() {
		return _XCG01939;
	}

	public void setXCG01939(String XCG01939) {
		_XCG01939 = XCG01939;
	}

	public String getXCG01624() {
		return _XCG01624;
	}

	public void setXCG01624(String XCG01624) {
		_XCG01624 = XCG01624;
	}

	public String getXCG01940() {
		return _XCG01940;
	}

	public void setXCG01940(String XCG01940) {
		_XCG01940 = XCG01940;
	}

	public String getXCG01625() {
		return _XCG01625;
	}

	public void setXCG01625(String XCG01625) {
		_XCG01625 = XCG01625;
	}

	public String getXCG01941() {
		return _XCG01941;
	}

	public void setXCG01941(String XCG01941) {
		_XCG01941 = XCG01941;
	}

	public String getXCG01626() {
		return _XCG01626;
	}

	public void setXCG01626(String XCG01626) {
		_XCG01626 = XCG01626;
	}

	public String getXCG01942() {
		return _XCG01942;
	}

	public void setXCG01942(String XCG01942) {
		_XCG01942 = XCG01942;
	}

	public String getXCG01627() {
		return _XCG01627;
	}

	public void setXCG01627(String XCG01627) {
		_XCG01627 = XCG01627;
	}

	public String getXCG01943() {
		return _XCG01943;
	}

	public void setXCG01943(String XCG01943) {
		_XCG01943 = XCG01943;
	}

	public String getXCG01628() {
		return _XCG01628;
	}

	public void setXCG01628(String XCG01628) {
		_XCG01628 = XCG01628;
	}

	public String getXCG01944() {
		return _XCG01944;
	}

	public void setXCG01944(String XCG01944) {
		_XCG01944 = XCG01944;
	}

	public String getXCG01630() {
		return _XCG01630;
	}

	public void setXCG01630(String XCG01630) {
		_XCG01630 = XCG01630;
	}

	public String getXCG01631() {
		return _XCG01631;
	}

	public void setXCG01631(String XCG01631) {
		_XCG01631 = XCG01631;
	}

	public String getXCG01632() {
		return _XCG01632;
	}

	public void setXCG01632(String XCG01632) {
		_XCG01632 = XCG01632;
	}

	public String getXCG01633() {
		return _XCG01633;
	}

	public void setXCG01633(String XCG01633) {
		_XCG01633 = XCG01633;
	}

	public String getXCG01634() {
		return _XCG01634;
	}

	public void setXCG01634(String XCG01634) {
		_XCG01634 = XCG01634;
	}

	public String getXCG01635() {
		return _XCG01635;
	}

	public void setXCG01635(String XCG01635) {
		_XCG01635 = XCG01635;
	}

	public String getXCG01636() {
		return _XCG01636;
	}

	public void setXCG01636(String XCG01636) {
		_XCG01636 = XCG01636;
	}

	public String getXCG01637() {
		return _XCG01637;
	}

	public void setXCG01637(String XCG01637) {
		_XCG01637 = XCG01637;
	}

	public String getXCG01638() {
		return _XCG01638;
	}

	public void setXCG01638(String XCG01638) {
		_XCG01638 = XCG01638;
	}

	public String getXCG01639() {
		return _XCG01639;
	}

	public void setXCG01639(String XCG01639) {
		_XCG01639 = XCG01639;
	}

	public String getXCG01640() {
		return _XCG01640;
	}

	public void setXCG01640(String XCG01640) {
		_XCG01640 = XCG01640;
	}

	public String getXCG01641() {
		return _XCG01641;
	}

	public void setXCG01641(String XCG01641) {
		_XCG01641 = XCG01641;
	}

	public String getXCG01642() {
		return _XCG01642;
	}

	public void setXCG01642(String XCG01642) {
		_XCG01642 = XCG01642;
	}

	public String getXCG01643() {
		return _XCG01643;
	}

	public void setXCG01643(String XCG01643) {
		_XCG01643 = XCG01643;
	}

	public String getXCG01644() {
		return _XCG01644;
	}

	public void setXCG01644(String XCG01644) {
		_XCG01644 = XCG01644;
	}

	public String getXCG01645() {
		return _XCG01645;
	}

	public void setXCG01645(String XCG01645) {
		_XCG01645 = XCG01645;
	}

	public String getXCG01646() {
		return _XCG01646;
	}

	public void setXCG01646(String XCG01646) {
		_XCG01646 = XCG01646;
	}

	public String getXCG01647() {
		return _XCG01647;
	}

	public void setXCG01647(String XCG01647) {
		_XCG01647 = XCG01647;
	}

	public String getXCG01648() {
		return _XCG01648;
	}

	public void setXCG01648(String XCG01648) {
		_XCG01648 = XCG01648;
	}

	public String getXCG01649() {
		return _XCG01649;
	}

	public void setXCG01649(String XCG01649) {
		_XCG01649 = XCG01649;
	}

	public String getXCG01650() {
		return _XCG01650;
	}

	public void setXCG01650(String XCG01650) {
		_XCG01650 = XCG01650;
	}

	public String getXCG01651() {
		return _XCG01651;
	}

	public void setXCG01651(String XCG01651) {
		_XCG01651 = XCG01651;
	}

	public String getXCG01652() {
		return _XCG01652;
	}

	public void setXCG01652(String XCG01652) {
		_XCG01652 = XCG01652;
	}

	public String getXCG01653() {
		return _XCG01653;
	}

	public void setXCG01653(String XCG01653) {
		_XCG01653 = XCG01653;
	}

	public String getXCG01654() {
		return _XCG01654;
	}

	public void setXCG01654(String XCG01654) {
		_XCG01654 = XCG01654;
	}

	public String getXCG01655() {
		return _XCG01655;
	}

	public void setXCG01655(String XCG01655) {
		_XCG01655 = XCG01655;
	}

	public String getXCG01656() {
		return _XCG01656;
	}

	public void setXCG01656(String XCG01656) {
		_XCG01656 = XCG01656;
	}

	public String getXCG01657() {
		return _XCG01657;
	}

	public void setXCG01657(String XCG01657) {
		_XCG01657 = XCG01657;
	}

	public String getXCG01658() {
		return _XCG01658;
	}

	public void setXCG01658(String XCG01658) {
		_XCG01658 = XCG01658;
	}

	public String getXCG01659() {
		return _XCG01659;
	}

	public void setXCG01659(String XCG01659) {
		_XCG01659 = XCG01659;
	}

	public String getXCG01660() {
		return _XCG01660;
	}

	public void setXCG01660(String XCG01660) {
		_XCG01660 = XCG01660;
	}

	public String getXCG01661() {
		return _XCG01661;
	}

	public void setXCG01661(String XCG01661) {
		_XCG01661 = XCG01661;
	}

	public String getXCG01662() {
		return _XCG01662;
	}

	public void setXCG01662(String XCG01662) {
		_XCG01662 = XCG01662;
	}

	public String getXCG01663() {
		return _XCG01663;
	}

	public void setXCG01663(String XCG01663) {
		_XCG01663 = XCG01663;
	}

	public String getXCG01664() {
		return _XCG01664;
	}

	public void setXCG01664(String XCG01664) {
		_XCG01664 = XCG01664;
	}

	public String getXCG01665() {
		return _XCG01665;
	}

	public void setXCG01665(String XCG01665) {
		_XCG01665 = XCG01665;
	}

	public String getXCG01666() {
		return _XCG01666;
	}

	public void setXCG01666(String XCG01666) {
		_XCG01666 = XCG01666;
	}

	public String getXCG01667() {
		return _XCG01667;
	}

	public void setXCG01667(String XCG01667) {
		_XCG01667 = XCG01667;
	}

	public String getXCG01668() {
		return _XCG01668;
	}

	public void setXCG01668(String XCG01668) {
		_XCG01668 = XCG01668;
	}

	public String getXCG01669() {
		return _XCG01669;
	}

	public void setXCG01669(String XCG01669) {
		_XCG01669 = XCG01669;
	}

	public String getXCG01670() {
		return _XCG01670;
	}

	public void setXCG01670(String XCG01670) {
		_XCG01670 = XCG01670;
	}

	public String getXCG01671() {
		return _XCG01671;
	}

	public void setXCG01671(String XCG01671) {
		_XCG01671 = XCG01671;
	}

	public String getXCG01672() {
		return _XCG01672;
	}

	public void setXCG01672(String XCG01672) {
		_XCG01672 = XCG01672;
	}

	public String getXCG01673() {
		return _XCG01673;
	}

	public void setXCG01673(String XCG01673) {
		_XCG01673 = XCG01673;
	}

	public String getXCG01674() {
		return _XCG01674;
	}

	public void setXCG01674(String XCG01674) {
		_XCG01674 = XCG01674;
	}

	public String getXCG01675() {
		return _XCG01675;
	}

	public void setXCG01675(String XCG01675) {
		_XCG01675 = XCG01675;
	}

	public String getXCG01676() {
		return _XCG01676;
	}

	public void setXCG01676(String XCG01676) {
		_XCG01676 = XCG01676;
	}

	public String getXCG01677() {
		return _XCG01677;
	}

	public void setXCG01677(String XCG01677) {
		_XCG01677 = XCG01677;
	}

	public String getXCG01678() {
		return _XCG01678;
	}

	public void setXCG01678(String XCG01678) {
		_XCG01678 = XCG01678;
	}

	public String getXCG01679() {
		return _XCG01679;
	}

	public void setXCG01679(String XCG01679) {
		_XCG01679 = XCG01679;
	}

	public String getXCG01680() {
		return _XCG01680;
	}

	public void setXCG01680(String XCG01680) {
		_XCG01680 = XCG01680;
	}

	public String getXCG01681() {
		return _XCG01681;
	}

	public void setXCG01681(String XCG01681) {
		_XCG01681 = XCG01681;
	}

	public String getXCG01682() {
		return _XCG01682;
	}

	public void setXCG01682(String XCG01682) {
		_XCG01682 = XCG01682;
	}

	public String getXCG01683() {
		return _XCG01683;
	}

	public void setXCG01683(String XCG01683) {
		_XCG01683 = XCG01683;
	}

	public String getXCG01684() {
		return _XCG01684;
	}

	public void setXCG01684(String XCG01684) {
		_XCG01684 = XCG01684;
	}

	public String getXCG01685() {
		return _XCG01685;
	}

	public void setXCG01685(String XCG01685) {
		_XCG01685 = XCG01685;
	}

	public String getXCG01686() {
		return _XCG01686;
	}

	public void setXCG01686(String XCG01686) {
		_XCG01686 = XCG01686;
	}

	public String getXCG01687() {
		return _XCG01687;
	}

	public void setXCG01687(String XCG01687) {
		_XCG01687 = XCG01687;
	}

	public String getXCG01688() {
		return _XCG01688;
	}

	public void setXCG01688(String XCG01688) {
		_XCG01688 = XCG01688;
	}

	public String getXCG01689() {
		return _XCG01689;
	}

	public void setXCG01689(String XCG01689) {
		_XCG01689 = XCG01689;
	}

	public String getXCG01690() {
		return _XCG01690;
	}

	public void setXCG01690(String XCG01690) {
		_XCG01690 = XCG01690;
	}

	public String getXCG01691() {
		return _XCG01691;
	}

	public void setXCG01691(String XCG01691) {
		_XCG01691 = XCG01691;
	}

	public String getXCG01692() {
		return _XCG01692;
	}

	public void setXCG01692(String XCG01692) {
		_XCG01692 = XCG01692;
	}

	public String getXCG01693() {
		return _XCG01693;
	}

	public void setXCG01693(String XCG01693) {
		_XCG01693 = XCG01693;
	}

	public String getXCG01694() {
		return _XCG01694;
	}

	public void setXCG01694(String XCG01694) {
		_XCG01694 = XCG01694;
	}

	public String getXCG01695() {
		return _XCG01695;
	}

	public void setXCG01695(String XCG01695) {
		_XCG01695 = XCG01695;
	}

	public String getXCG01696() {
		return _XCG01696;
	}

	public void setXCG01696(String XCG01696) {
		_XCG01696 = XCG01696;
	}

	public String getXCG01697() {
		return _XCG01697;
	}

	public void setXCG01697(String XCG01697) {
		_XCG01697 = XCG01697;
	}

	public String getXCG01698() {
		return _XCG01698;
	}

	public void setXCG01698(String XCG01698) {
		_XCG01698 = XCG01698;
	}

	public String getXCG01699() {
		return _XCG01699;
	}

	public void setXCG01699(String XCG01699) {
		_XCG01699 = XCG01699;
	}

	public String getXCG01700() {
		return _XCG01700;
	}

	public void setXCG01700(String XCG01700) {
		_XCG01700 = XCG01700;
	}

	public String getXCG01701() {
		return _XCG01701;
	}

	public void setXCG01701(String XCG01701) {
		_XCG01701 = XCG01701;
	}

	public String getXCG01702() {
		return _XCG01702;
	}

	public void setXCG01702(String XCG01702) {
		_XCG01702 = XCG01702;
	}

	public String getXCG01703() {
		return _XCG01703;
	}

	public void setXCG01703(String XCG01703) {
		_XCG01703 = XCG01703;
	}

	public String getXCG01704() {
		return _XCG01704;
	}

	public void setXCG01704(String XCG01704) {
		_XCG01704 = XCG01704;
	}

	public String getXCG01705() {
		return _XCG01705;
	}

	public void setXCG01705(String XCG01705) {
		_XCG01705 = XCG01705;
	}

	public String getXCG01706() {
		return _XCG01706;
	}

	public void setXCG01706(String XCG01706) {
		_XCG01706 = XCG01706;
	}

	public String getXCG01707() {
		return _XCG01707;
	}

	public void setXCG01707(String XCG01707) {
		_XCG01707 = XCG01707;
	}

	public String getXCG01708() {
		return _XCG01708;
	}

	public void setXCG01708(String XCG01708) {
		_XCG01708 = XCG01708;
	}

	public String getXCG01709() {
		return _XCG01709;
	}

	public void setXCG01709(String XCG01709) {
		_XCG01709 = XCG01709;
	}

	public String getXCG01710() {
		return _XCG01710;
	}

	public void setXCG01710(String XCG01710) {
		_XCG01710 = XCG01710;
	}

	public String getXCG01711() {
		return _XCG01711;
	}

	public void setXCG01711(String XCG01711) {
		_XCG01711 = XCG01711;
	}

	public String getXCG01712() {
		return _XCG01712;
	}

	public void setXCG01712(String XCG01712) {
		_XCG01712 = XCG01712;
	}

	public String getXCG01713() {
		return _XCG01713;
	}

	public void setXCG01713(String XCG01713) {
		_XCG01713 = XCG01713;
	}

	public String getXCG01714() {
		return _XCG01714;
	}

	public void setXCG01714(String XCG01714) {
		_XCG01714 = XCG01714;
	}

	public String getXCG01715() {
		return _XCG01715;
	}

	public void setXCG01715(String XCG01715) {
		_XCG01715 = XCG01715;
	}

	public String getXCG01716() {
		return _XCG01716;
	}

	public void setXCG01716(String XCG01716) {
		_XCG01716 = XCG01716;
	}

	public String getXCG01717() {
		return _XCG01717;
	}

	public void setXCG01717(String XCG01717) {
		_XCG01717 = XCG01717;
	}

	public String getXCG01718() {
		return _XCG01718;
	}

	public void setXCG01718(String XCG01718) {
		_XCG01718 = XCG01718;
	}

	public String getXCG01719() {
		return _XCG01719;
	}

	public void setXCG01719(String XCG01719) {
		_XCG01719 = XCG01719;
	}

	public String getXCG01720() {
		return _XCG01720;
	}

	public void setXCG01720(String XCG01720) {
		_XCG01720 = XCG01720;
	}

	public String getXCG01721() {
		return _XCG01721;
	}

	public void setXCG01721(String XCG01721) {
		_XCG01721 = XCG01721;
	}

	public String getXCG01722() {
		return _XCG01722;
	}

	public void setXCG01722(String XCG01722) {
		_XCG01722 = XCG01722;
	}

	public String getXCG01723() {
		return _XCG01723;
	}

	public void setXCG01723(String XCG01723) {
		_XCG01723 = XCG01723;
	}

	public String getXCG01724() {
		return _XCG01724;
	}

	public void setXCG01724(String XCG01724) {
		_XCG01724 = XCG01724;
	}

	public String getXCG01725() {
		return _XCG01725;
	}

	public void setXCG01725(String XCG01725) {
		_XCG01725 = XCG01725;
	}

	public String getXCG01726() {
		return _XCG01726;
	}

	public void setXCG01726(String XCG01726) {
		_XCG01726 = XCG01726;
	}

	public String getXCG01727() {
		return _XCG01727;
	}

	public void setXCG01727(String XCG01727) {
		_XCG01727 = XCG01727;
	}

	public String getXCG01728() {
		return _XCG01728;
	}

	public void setXCG01728(String XCG01728) {
		_XCG01728 = XCG01728;
	}

	public String getXCG01729() {
		return _XCG01729;
	}

	public void setXCG01729(String XCG01729) {
		_XCG01729 = XCG01729;
	}

	public String getXCG01730() {
		return _XCG01730;
	}

	public void setXCG01730(String XCG01730) {
		_XCG01730 = XCG01730;
	}

	public String getXCG01731() {
		return _XCG01731;
	}

	public void setXCG01731(String XCG01731) {
		_XCG01731 = XCG01731;
	}

	public String getXCG01732() {
		return _XCG01732;
	}

	public void setXCG01732(String XCG01732) {
		_XCG01732 = XCG01732;
	}

	public String getXCG01733() {
		return _XCG01733;
	}

	public void setXCG01733(String XCG01733) {
		_XCG01733 = XCG01733;
	}

	public String getXCG01734() {
		return _XCG01734;
	}

	public void setXCG01734(String XCG01734) {
		_XCG01734 = XCG01734;
	}

	public String getXCG01735() {
		return _XCG01735;
	}

	public void setXCG01735(String XCG01735) {
		_XCG01735 = XCG01735;
	}

	public String getXCG01736() {
		return _XCG01736;
	}

	public void setXCG01736(String XCG01736) {
		_XCG01736 = XCG01736;
	}

	public String getXCG01737() {
		return _XCG01737;
	}

	public void setXCG01737(String XCG01737) {
		_XCG01737 = XCG01737;
	}

	public String getXCG01738() {
		return _XCG01738;
	}

	public void setXCG01738(String XCG01738) {
		_XCG01738 = XCG01738;
	}

	public String getXCG01739() {
		return _XCG01739;
	}

	public void setXCG01739(String XCG01739) {
		_XCG01739 = XCG01739;
	}

	public String getXCG01740() {
		return _XCG01740;
	}

	public void setXCG01740(String XCG01740) {
		_XCG01740 = XCG01740;
	}

	public String getXCG01741() {
		return _XCG01741;
	}

	public void setXCG01741(String XCG01741) {
		_XCG01741 = XCG01741;
	}

	public String getXCG01742() {
		return _XCG01742;
	}

	public void setXCG01742(String XCG01742) {
		_XCG01742 = XCG01742;
	}

	public String getXCG01744() {
		return _XCG01744;
	}

	public void setXCG01744(String XCG01744) {
		_XCG01744 = XCG01744;
	}

	public String getXCG01745() {
		return _XCG01745;
	}

	public void setXCG01745(String XCG01745) {
		_XCG01745 = XCG01745;
	}

	public String getXCG01746() {
		return _XCG01746;
	}

	public void setXCG01746(String XCG01746) {
		_XCG01746 = XCG01746;
	}

	public String getXCG01747() {
		return _XCG01747;
	}

	public void setXCG01747(String XCG01747) {
		_XCG01747 = XCG01747;
	}

	public String getXCG01748() {
		return _XCG01748;
	}

	public void setXCG01748(String XCG01748) {
		_XCG01748 = XCG01748;
	}

	public String getXCG01749() {
		return _XCG01749;
	}

	public void setXCG01749(String XCG01749) {
		_XCG01749 = XCG01749;
	}

	public String getXCG01945() {
		return _XCG01945;
	}

	public void setXCG01945(String XCG01945) {
		_XCG01945 = XCG01945;
	}

	public String getXCG01750() {
		return _XCG01750;
	}

	public void setXCG01750(String XCG01750) {
		_XCG01750 = XCG01750;
	}

	public String getXCG01946() {
		return _XCG01946;
	}

	public void setXCG01946(String XCG01946) {
		_XCG01946 = XCG01946;
	}

	public String getXCG01751() {
		return _XCG01751;
	}

	public void setXCG01751(String XCG01751) {
		_XCG01751 = XCG01751;
	}

	public String getXCG01752() {
		return _XCG01752;
	}

	public void setXCG01752(String XCG01752) {
		_XCG01752 = XCG01752;
	}

	public String getXCG01753() {
		return _XCG01753;
	}

	public void setXCG01753(String XCG01753) {
		_XCG01753 = XCG01753;
	}

	public String getXCG01754() {
		return _XCG01754;
	}

	public void setXCG01754(String XCG01754) {
		_XCG01754 = XCG01754;
	}

	public String getXCG01756() {
		return _XCG01756;
	}

	public void setXCG01756(String XCG01756) {
		_XCG01756 = XCG01756;
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
	private String _XCG01598;
	private String _XCG01599;
	private String _XCG01600;
	private String _XCG01601;
	private String _XCG01602;
	private String _XCG01603;
	private String _XCG01923;
	private String _XCG01604;
	private String _XCG01924;
	private String _XCG01605;
	private String _XCG01606;
	private String _XCG01607;
	private String _XCG01608;
	private String _XCG01609;
	private String _XCG01925;
	private String _XCG01610;
	private String _XCG01926;
	private String _XCG01611;
	private String _XCG01612;
	private String _XCG01928;
	private String _XCG01613;
	private String _XCG01929;
	private String _XCG01614;
	private String _XCG01930;
	private String _XCG01615;
	private String _XCG01931;
	private String _XCG01616;
	private String _XCG01932;
	private String _XCG01617;
	private String _XCG01933;
	private String _XCG01618;
	private String _XCG01934;
	private String _XCG01619;
	private String _XCG01935;
	private String _XCG01620;
	private String _XCG01936;
	private String _XCG01621;
	private String _XCG01937;
	private String _XCG01622;
	private String _XCG01938;
	private String _XCG01623;
	private String _XCG01939;
	private String _XCG01624;
	private String _XCG01940;
	private String _XCG01625;
	private String _XCG01941;
	private String _XCG01626;
	private String _XCG01942;
	private String _XCG01627;
	private String _XCG01943;
	private String _XCG01628;
	private String _XCG01944;
	private String _XCG01630;
	private String _XCG01631;
	private String _XCG01632;
	private String _XCG01633;
	private String _XCG01634;
	private String _XCG01635;
	private String _XCG01636;
	private String _XCG01637;
	private String _XCG01638;
	private String _XCG01639;
	private String _XCG01640;
	private String _XCG01641;
	private String _XCG01642;
	private String _XCG01643;
	private String _XCG01644;
	private String _XCG01645;
	private String _XCG01646;
	private String _XCG01647;
	private String _XCG01648;
	private String _XCG01649;
	private String _XCG01650;
	private String _XCG01651;
	private String _XCG01652;
	private String _XCG01653;
	private String _XCG01654;
	private String _XCG01655;
	private String _XCG01656;
	private String _XCG01657;
	private String _XCG01658;
	private String _XCG01659;
	private String _XCG01660;
	private String _XCG01661;
	private String _XCG01662;
	private String _XCG01663;
	private String _XCG01664;
	private String _XCG01665;
	private String _XCG01666;
	private String _XCG01667;
	private String _XCG01668;
	private String _XCG01669;
	private String _XCG01670;
	private String _XCG01671;
	private String _XCG01672;
	private String _XCG01673;
	private String _XCG01674;
	private String _XCG01675;
	private String _XCG01676;
	private String _XCG01677;
	private String _XCG01678;
	private String _XCG01679;
	private String _XCG01680;
	private String _XCG01681;
	private String _XCG01682;
	private String _XCG01683;
	private String _XCG01684;
	private String _XCG01685;
	private String _XCG01686;
	private String _XCG01687;
	private String _XCG01688;
	private String _XCG01689;
	private String _XCG01690;
	private String _XCG01691;
	private String _XCG01692;
	private String _XCG01693;
	private String _XCG01694;
	private String _XCG01695;
	private String _XCG01696;
	private String _XCG01697;
	private String _XCG01698;
	private String _XCG01699;
	private String _XCG01700;
	private String _XCG01701;
	private String _XCG01702;
	private String _XCG01703;
	private String _XCG01704;
	private String _XCG01705;
	private String _XCG01706;
	private String _XCG01707;
	private String _XCG01708;
	private String _XCG01709;
	private String _XCG01710;
	private String _XCG01711;
	private String _XCG01712;
	private String _XCG01713;
	private String _XCG01714;
	private String _XCG01715;
	private String _XCG01716;
	private String _XCG01717;
	private String _XCG01718;
	private String _XCG01719;
	private String _XCG01720;
	private String _XCG01721;
	private String _XCG01722;
	private String _XCG01723;
	private String _XCG01724;
	private String _XCG01725;
	private String _XCG01726;
	private String _XCG01727;
	private String _XCG01728;
	private String _XCG01729;
	private String _XCG01730;
	private String _XCG01731;
	private String _XCG01732;
	private String _XCG01733;
	private String _XCG01734;
	private String _XCG01735;
	private String _XCG01736;
	private String _XCG01737;
	private String _XCG01738;
	private String _XCG01739;
	private String _XCG01740;
	private String _XCG01741;
	private String _XCG01742;
	private String _XCG01744;
	private String _XCG01745;
	private String _XCG01746;
	private String _XCG01747;
	private String _XCG01748;
	private String _XCG01749;
	private String _XCG01945;
	private String _XCG01750;
	private String _XCG01946;
	private String _XCG01751;
	private String _XCG01752;
	private String _XCG01753;
	private String _XCG01754;
	private String _XCG01756;
	private Date _modifyDate;
	private Date _syncDate;
}