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

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRTechnicalSpec_XCGPart4;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VRTechnicalSpec_XCGPart4 in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart4
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart4CacheModel implements CacheModel<VRTechnicalSpec_XCGPart4>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGPart4CacheModel)) {
			return false;
		}

		VRTechnicalSpec_XCGPart4CacheModel vrTechnicalSpec_XCGPart4CacheModel = (VRTechnicalSpec_XCGPart4CacheModel)obj;

		if (id == vrTechnicalSpec_XCGPart4CacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(261);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", convertAssembleId=");
		sb.append(convertAssembleId);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierNo=");
		sb.append(dossierNo);
		sb.append(", referenceUid=");
		sb.append(referenceUid);
		sb.append(", dossierIdCTN=");
		sb.append(dossierIdCTN);
		sb.append(", deliverableCode=");
		sb.append(deliverableCode);
		sb.append(", vehicleTypeCertificateId=");
		sb.append(vehicleTypeCertificateId);
		sb.append(", XCG01496=");
		sb.append(XCG01496);
		sb.append(", XCG01497=");
		sb.append(XCG01497);
		sb.append(", XCG01498=");
		sb.append(XCG01498);
		sb.append(", XCG01499=");
		sb.append(XCG01499);
		sb.append(", XCG01500=");
		sb.append(XCG01500);
		sb.append(", XCG01501=");
		sb.append(XCG01501);
		sb.append(", XCG01502=");
		sb.append(XCG01502);
		sb.append(", XCG01503=");
		sb.append(XCG01503);
		sb.append(", XCG01504=");
		sb.append(XCG01504);
		sb.append(", XCG01505=");
		sb.append(XCG01505);
		sb.append(", XCG01506=");
		sb.append(XCG01506);
		sb.append(", XCG01507=");
		sb.append(XCG01507);
		sb.append(", XCG01508=");
		sb.append(XCG01508);
		sb.append(", XCG01509=");
		sb.append(XCG01509);
		sb.append(", XCG01510=");
		sb.append(XCG01510);
		sb.append(", XCG01512=");
		sb.append(XCG01512);
		sb.append(", XCG01513=");
		sb.append(XCG01513);
		sb.append(", XCG01514=");
		sb.append(XCG01514);
		sb.append(", XCG01515=");
		sb.append(XCG01515);
		sb.append(", XCG01516=");
		sb.append(XCG01516);
		sb.append(", XCG01517=");
		sb.append(XCG01517);
		sb.append(", XCG01518=");
		sb.append(XCG01518);
		sb.append(", XCG01519=");
		sb.append(XCG01519);
		sb.append(", XCG01520=");
		sb.append(XCG01520);
		sb.append(", XCG01521=");
		sb.append(XCG01521);
		sb.append(", XCG01522=");
		sb.append(XCG01522);
		sb.append(", XCG01523=");
		sb.append(XCG01523);
		sb.append(", XCG01524=");
		sb.append(XCG01524);
		sb.append(", XCG01525=");
		sb.append(XCG01525);
		sb.append(", XCG01526=");
		sb.append(XCG01526);
		sb.append(", XCG01527=");
		sb.append(XCG01527);
		sb.append(", XCG01528=");
		sb.append(XCG01528);
		sb.append(", XCG01529=");
		sb.append(XCG01529);
		sb.append(", XCG01530=");
		sb.append(XCG01530);
		sb.append(", XCG01531=");
		sb.append(XCG01531);
		sb.append(", XCG01904=");
		sb.append(XCG01904);
		sb.append(", XCG01533=");
		sb.append(XCG01533);
		sb.append(", XCG01905=");
		sb.append(XCG01905);
		sb.append(", XCG01534=");
		sb.append(XCG01534);
		sb.append(", XCG01906=");
		sb.append(XCG01906);
		sb.append(", XCG01535=");
		sb.append(XCG01535);
		sb.append(", XCG01907=");
		sb.append(XCG01907);
		sb.append(", XCG01536=");
		sb.append(XCG01536);
		sb.append(", XCG01908=");
		sb.append(XCG01908);
		sb.append(", XCG01537=");
		sb.append(XCG01537);
		sb.append(", XCG01909=");
		sb.append(XCG01909);
		sb.append(", XCG01538=");
		sb.append(XCG01538);
		sb.append(", XCG01910=");
		sb.append(XCG01910);
		sb.append(", XCG01539=");
		sb.append(XCG01539);
		sb.append(", XCG11535=");
		sb.append(XCG11535);
		sb.append(", XCG01541=");
		sb.append(XCG01541);
		sb.append(", XCG01542=");
		sb.append(XCG01542);
		sb.append(", XCG01911=");
		sb.append(XCG01911);
		sb.append(", XCG01543=");
		sb.append(XCG01543);
		sb.append(", XCG01912=");
		sb.append(XCG01912);
		sb.append(", XCG01544=");
		sb.append(XCG01544);
		sb.append(", XCG01545=");
		sb.append(XCG01545);
		sb.append(", XCG01546=");
		sb.append(XCG01546);
		sb.append(", XCG01547=");
		sb.append(XCG01547);
		sb.append(", XCG01548=");
		sb.append(XCG01548);
		sb.append(", XCG01913=");
		sb.append(XCG01913);
		sb.append(", XCG01549=");
		sb.append(XCG01549);
		sb.append(", XCG01914=");
		sb.append(XCG01914);
		sb.append(", XCG01550=");
		sb.append(XCG01550);
		sb.append(", XCG01551=");
		sb.append(XCG01551);
		sb.append(", XCG01552=");
		sb.append(XCG01552);
		sb.append(", XCG01553=");
		sb.append(XCG01553);
		sb.append(", XCG01554=");
		sb.append(XCG01554);
		sb.append(", XCG01915=");
		sb.append(XCG01915);
		sb.append(", XCG01555=");
		sb.append(XCG01555);
		sb.append(", XCG01556=");
		sb.append(XCG01556);
		sb.append(", XCG01557=");
		sb.append(XCG01557);
		sb.append(", XCG01558=");
		sb.append(XCG01558);
		sb.append(", XCG01559=");
		sb.append(XCG01559);
		sb.append(", XCG01560=");
		sb.append(XCG01560);
		sb.append(", XCG01561=");
		sb.append(XCG01561);
		sb.append(", XCG01916=");
		sb.append(XCG01916);
		sb.append(", XCG01562=");
		sb.append(XCG01562);
		sb.append(", XCG01917=");
		sb.append(XCG01917);
		sb.append(", XCG01563=");
		sb.append(XCG01563);
		sb.append(", XCG01918=");
		sb.append(XCG01918);
		sb.append(", XCG01564=");
		sb.append(XCG01564);
		sb.append(", XCG01565=");
		sb.append(XCG01565);
		sb.append(", XCG01566=");
		sb.append(XCG01566);
		sb.append(", XCG01567=");
		sb.append(XCG01567);
		sb.append(", XCG01568=");
		sb.append(XCG01568);
		sb.append(", XCG01919=");
		sb.append(XCG01919);
		sb.append(", XCG01569=");
		sb.append(XCG01569);
		sb.append(", XCG01570=");
		sb.append(XCG01570);
		sb.append(", XCG01571=");
		sb.append(XCG01571);
		sb.append(", XCG01572=");
		sb.append(XCG01572);
		sb.append(", XCG01920=");
		sb.append(XCG01920);
		sb.append(", XCG01573=");
		sb.append(XCG01573);
		sb.append(", XCG01921=");
		sb.append(XCG01921);
		sb.append(", XCG01574=");
		sb.append(XCG01574);
		sb.append(", XCG01922=");
		sb.append(XCG01922);
		sb.append(", XCG01575=");
		sb.append(XCG01575);
		sb.append(", XCG01576=");
		sb.append(XCG01576);
		sb.append(", XCG01577=");
		sb.append(XCG01577);
		sb.append(", XCG01578=");
		sb.append(XCG01578);
		sb.append(", XCG01579=");
		sb.append(XCG01579);
		sb.append(", XCG01580=");
		sb.append(XCG01580);
		sb.append(", XCG01581=");
		sb.append(XCG01581);
		sb.append(", XCG01582=");
		sb.append(XCG01582);
		sb.append(", XCG01583=");
		sb.append(XCG01583);
		sb.append(", XCG01584=");
		sb.append(XCG01584);
		sb.append(", XCG01585=");
		sb.append(XCG01585);
		sb.append(", XCG01586=");
		sb.append(XCG01586);
		sb.append(", XCG01587=");
		sb.append(XCG01587);
		sb.append(", XCG01588=");
		sb.append(XCG01588);
		sb.append(", XCG01589=");
		sb.append(XCG01589);
		sb.append(", XCG01590=");
		sb.append(XCG01590);
		sb.append(", XCG01591=");
		sb.append(XCG01591);
		sb.append(", XCG01592=");
		sb.append(XCG01592);
		sb.append(", XCG01593=");
		sb.append(XCG01593);
		sb.append(", XCG01594=");
		sb.append(XCG01594);
		sb.append(", XCG01595=");
		sb.append(XCG01595);
		sb.append(", XCG01596=");
		sb.append(XCG01596);
		sb.append(", XCG01597=");
		sb.append(XCG01597);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XCGPart4 toEntityModel() {
		VRTechnicalSpec_XCGPart4Impl vrTechnicalSpec_XCGPart4Impl = new VRTechnicalSpec_XCGPart4Impl();

		vrTechnicalSpec_XCGPart4Impl.setId(id);
		vrTechnicalSpec_XCGPart4Impl.setMtCore(mtCore);
		vrTechnicalSpec_XCGPart4Impl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XCGPart4Impl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XCGPart4Impl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XCGPart4Impl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XCGPart4Impl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XCGPart4Impl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XCGPart4Impl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XCG01496 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01496(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01496(XCG01496);
		}

		if (XCG01497 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01497(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01497(XCG01497);
		}

		if (XCG01498 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01498(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01498(XCG01498);
		}

		if (XCG01499 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01499(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01499(XCG01499);
		}

		if (XCG01500 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01500(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01500(XCG01500);
		}

		if (XCG01501 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01501(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01501(XCG01501);
		}

		if (XCG01502 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01502(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01502(XCG01502);
		}

		if (XCG01503 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01503(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01503(XCG01503);
		}

		if (XCG01504 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01504(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01504(XCG01504);
		}

		if (XCG01505 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01505(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01505(XCG01505);
		}

		if (XCG01506 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01506(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01506(XCG01506);
		}

		if (XCG01507 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01507(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01507(XCG01507);
		}

		if (XCG01508 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01508(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01508(XCG01508);
		}

		if (XCG01509 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01509(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01509(XCG01509);
		}

		if (XCG01510 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01510(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01510(XCG01510);
		}

		if (XCG01512 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01512(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01512(XCG01512);
		}

		if (XCG01513 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01513(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01513(XCG01513);
		}

		if (XCG01514 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01514(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01514(XCG01514);
		}

		if (XCG01515 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01515(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01515(XCG01515);
		}

		if (XCG01516 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01516(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01516(XCG01516);
		}

		if (XCG01517 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01517(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01517(XCG01517);
		}

		if (XCG01518 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01518(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01518(XCG01518);
		}

		if (XCG01519 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01519(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01519(XCG01519);
		}

		if (XCG01520 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01520(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01520(XCG01520);
		}

		if (XCG01521 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01521(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01521(XCG01521);
		}

		if (XCG01522 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01522(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01522(XCG01522);
		}

		if (XCG01523 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01523(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01523(XCG01523);
		}

		if (XCG01524 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01524(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01524(XCG01524);
		}

		if (XCG01525 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01525(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01525(XCG01525);
		}

		if (XCG01526 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01526(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01526(XCG01526);
		}

		if (XCG01527 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01527(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01527(XCG01527);
		}

		if (XCG01528 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01528(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01528(XCG01528);
		}

		if (XCG01529 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01529(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01529(XCG01529);
		}

		if (XCG01530 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01530(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01530(XCG01530);
		}

		if (XCG01531 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01531(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01531(XCG01531);
		}

		if (XCG01904 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01904(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01904(XCG01904);
		}

		if (XCG01533 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01533(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01533(XCG01533);
		}

		if (XCG01905 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01905(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01905(XCG01905);
		}

		if (XCG01534 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01534(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01534(XCG01534);
		}

		if (XCG01906 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01906(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01906(XCG01906);
		}

		if (XCG01535 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01535(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01535(XCG01535);
		}

		if (XCG01907 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01907(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01907(XCG01907);
		}

		if (XCG01536 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01536(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01536(XCG01536);
		}

		if (XCG01908 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01908(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01908(XCG01908);
		}

		if (XCG01537 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01537(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01537(XCG01537);
		}

		if (XCG01909 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01909(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01909(XCG01909);
		}

		if (XCG01538 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01538(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01538(XCG01538);
		}

		if (XCG01910 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01910(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01910(XCG01910);
		}

		if (XCG01539 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01539(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01539(XCG01539);
		}

		if (XCG11535 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG11535(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG11535(XCG11535);
		}

		if (XCG01541 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01541(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01541(XCG01541);
		}

		if (XCG01542 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01542(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01542(XCG01542);
		}

		if (XCG01911 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01911(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01911(XCG01911);
		}

		if (XCG01543 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01543(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01543(XCG01543);
		}

		if (XCG01912 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01912(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01912(XCG01912);
		}

		if (XCG01544 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01544(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01544(XCG01544);
		}

		if (XCG01545 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01545(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01545(XCG01545);
		}

		if (XCG01546 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01546(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01546(XCG01546);
		}

		if (XCG01547 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01547(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01547(XCG01547);
		}

		if (XCG01548 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01548(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01548(XCG01548);
		}

		if (XCG01913 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01913(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01913(XCG01913);
		}

		if (XCG01549 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01549(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01549(XCG01549);
		}

		if (XCG01914 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01914(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01914(XCG01914);
		}

		if (XCG01550 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01550(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01550(XCG01550);
		}

		if (XCG01551 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01551(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01551(XCG01551);
		}

		if (XCG01552 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01552(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01552(XCG01552);
		}

		if (XCG01553 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01553(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01553(XCG01553);
		}

		if (XCG01554 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01554(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01554(XCG01554);
		}

		if (XCG01915 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01915(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01915(XCG01915);
		}

		if (XCG01555 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01555(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01555(XCG01555);
		}

		if (XCG01556 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01556(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01556(XCG01556);
		}

		if (XCG01557 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01557(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01557(XCG01557);
		}

		if (XCG01558 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01558(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01558(XCG01558);
		}

		if (XCG01559 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01559(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01559(XCG01559);
		}

		if (XCG01560 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01560(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01560(XCG01560);
		}

		if (XCG01561 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01561(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01561(XCG01561);
		}

		if (XCG01916 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01916(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01916(XCG01916);
		}

		if (XCG01562 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01562(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01562(XCG01562);
		}

		if (XCG01917 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01917(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01917(XCG01917);
		}

		if (XCG01563 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01563(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01563(XCG01563);
		}

		if (XCG01918 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01918(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01918(XCG01918);
		}

		if (XCG01564 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01564(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01564(XCG01564);
		}

		if (XCG01565 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01565(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01565(XCG01565);
		}

		if (XCG01566 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01566(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01566(XCG01566);
		}

		if (XCG01567 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01567(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01567(XCG01567);
		}

		if (XCG01568 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01568(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01568(XCG01568);
		}

		if (XCG01919 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01919(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01919(XCG01919);
		}

		if (XCG01569 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01569(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01569(XCG01569);
		}

		if (XCG01570 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01570(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01570(XCG01570);
		}

		if (XCG01571 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01571(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01571(XCG01571);
		}

		if (XCG01572 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01572(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01572(XCG01572);
		}

		if (XCG01920 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01920(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01920(XCG01920);
		}

		if (XCG01573 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01573(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01573(XCG01573);
		}

		if (XCG01921 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01921(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01921(XCG01921);
		}

		if (XCG01574 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01574(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01574(XCG01574);
		}

		if (XCG01922 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01922(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01922(XCG01922);
		}

		if (XCG01575 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01575(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01575(XCG01575);
		}

		if (XCG01576 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01576(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01576(XCG01576);
		}

		if (XCG01577 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01577(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01577(XCG01577);
		}

		if (XCG01578 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01578(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01578(XCG01578);
		}

		if (XCG01579 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01579(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01579(XCG01579);
		}

		if (XCG01580 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01580(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01580(XCG01580);
		}

		if (XCG01581 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01581(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01581(XCG01581);
		}

		if (XCG01582 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01582(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01582(XCG01582);
		}

		if (XCG01583 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01583(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01583(XCG01583);
		}

		if (XCG01584 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01584(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01584(XCG01584);
		}

		if (XCG01585 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01585(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01585(XCG01585);
		}

		if (XCG01586 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01586(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01586(XCG01586);
		}

		if (XCG01587 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01587(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01587(XCG01587);
		}

		if (XCG01588 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01588(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01588(XCG01588);
		}

		if (XCG01589 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01589(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01589(XCG01589);
		}

		if (XCG01590 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01590(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01590(XCG01590);
		}

		if (XCG01591 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01591(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01591(XCG01591);
		}

		if (XCG01592 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01592(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01592(XCG01592);
		}

		if (XCG01593 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01593(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01593(XCG01593);
		}

		if (XCG01594 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01594(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01594(XCG01594);
		}

		if (XCG01595 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01595(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01595(XCG01595);
		}

		if (XCG01596 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01596(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01596(XCG01596);
		}

		if (XCG01597 == null) {
			vrTechnicalSpec_XCGPart4Impl.setXCG01597(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setXCG01597(XCG01597);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCGPart4Impl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCGPart4Impl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XCGPart4Impl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XCGPart4Impl.resetOriginalValues();

		return vrTechnicalSpec_XCGPart4Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		convertAssembleId = objectInput.readLong();

		dossierId = objectInput.readLong();
		dossierNo = objectInput.readUTF();
		referenceUid = objectInput.readUTF();
		dossierIdCTN = objectInput.readUTF();
		deliverableCode = objectInput.readUTF();

		vehicleTypeCertificateId = objectInput.readLong();
		XCG01496 = objectInput.readUTF();
		XCG01497 = objectInput.readUTF();
		XCG01498 = objectInput.readUTF();
		XCG01499 = objectInput.readUTF();
		XCG01500 = objectInput.readUTF();
		XCG01501 = objectInput.readUTF();
		XCG01502 = objectInput.readUTF();
		XCG01503 = objectInput.readUTF();
		XCG01504 = objectInput.readUTF();
		XCG01505 = objectInput.readUTF();
		XCG01506 = objectInput.readUTF();
		XCG01507 = objectInput.readUTF();
		XCG01508 = objectInput.readUTF();
		XCG01509 = objectInput.readUTF();
		XCG01510 = objectInput.readUTF();
		XCG01512 = objectInput.readUTF();
		XCG01513 = objectInput.readUTF();
		XCG01514 = objectInput.readUTF();
		XCG01515 = objectInput.readUTF();
		XCG01516 = objectInput.readUTF();
		XCG01517 = objectInput.readUTF();
		XCG01518 = objectInput.readUTF();
		XCG01519 = objectInput.readUTF();
		XCG01520 = objectInput.readUTF();
		XCG01521 = objectInput.readUTF();
		XCG01522 = objectInput.readUTF();
		XCG01523 = objectInput.readUTF();
		XCG01524 = objectInput.readUTF();
		XCG01525 = objectInput.readUTF();
		XCG01526 = objectInput.readUTF();
		XCG01527 = objectInput.readUTF();
		XCG01528 = objectInput.readUTF();
		XCG01529 = objectInput.readUTF();
		XCG01530 = objectInput.readUTF();
		XCG01531 = objectInput.readUTF();
		XCG01904 = objectInput.readUTF();
		XCG01533 = objectInput.readUTF();
		XCG01905 = objectInput.readUTF();
		XCG01534 = objectInput.readUTF();
		XCG01906 = objectInput.readUTF();
		XCG01535 = objectInput.readUTF();
		XCG01907 = objectInput.readUTF();
		XCG01536 = objectInput.readUTF();
		XCG01908 = objectInput.readUTF();
		XCG01537 = objectInput.readUTF();
		XCG01909 = objectInput.readUTF();
		XCG01538 = objectInput.readUTF();
		XCG01910 = objectInput.readUTF();
		XCG01539 = objectInput.readUTF();
		XCG11535 = objectInput.readUTF();
		XCG01541 = objectInput.readUTF();
		XCG01542 = objectInput.readUTF();
		XCG01911 = objectInput.readUTF();
		XCG01543 = objectInput.readUTF();
		XCG01912 = objectInput.readUTF();
		XCG01544 = objectInput.readUTF();
		XCG01545 = objectInput.readUTF();
		XCG01546 = objectInput.readUTF();
		XCG01547 = objectInput.readUTF();
		XCG01548 = objectInput.readUTF();
		XCG01913 = objectInput.readUTF();
		XCG01549 = objectInput.readUTF();
		XCG01914 = objectInput.readUTF();
		XCG01550 = objectInput.readUTF();
		XCG01551 = objectInput.readUTF();
		XCG01552 = objectInput.readUTF();
		XCG01553 = objectInput.readUTF();
		XCG01554 = objectInput.readUTF();
		XCG01915 = objectInput.readUTF();
		XCG01555 = objectInput.readUTF();
		XCG01556 = objectInput.readUTF();
		XCG01557 = objectInput.readUTF();
		XCG01558 = objectInput.readUTF();
		XCG01559 = objectInput.readUTF();
		XCG01560 = objectInput.readUTF();
		XCG01561 = objectInput.readUTF();
		XCG01916 = objectInput.readUTF();
		XCG01562 = objectInput.readUTF();
		XCG01917 = objectInput.readUTF();
		XCG01563 = objectInput.readUTF();
		XCG01918 = objectInput.readUTF();
		XCG01564 = objectInput.readUTF();
		XCG01565 = objectInput.readUTF();
		XCG01566 = objectInput.readUTF();
		XCG01567 = objectInput.readUTF();
		XCG01568 = objectInput.readUTF();
		XCG01919 = objectInput.readUTF();
		XCG01569 = objectInput.readUTF();
		XCG01570 = objectInput.readUTF();
		XCG01571 = objectInput.readUTF();
		XCG01572 = objectInput.readUTF();
		XCG01920 = objectInput.readUTF();
		XCG01573 = objectInput.readUTF();
		XCG01921 = objectInput.readUTF();
		XCG01574 = objectInput.readUTF();
		XCG01922 = objectInput.readUTF();
		XCG01575 = objectInput.readUTF();
		XCG01576 = objectInput.readUTF();
		XCG01577 = objectInput.readUTF();
		XCG01578 = objectInput.readUTF();
		XCG01579 = objectInput.readUTF();
		XCG01580 = objectInput.readUTF();
		XCG01581 = objectInput.readUTF();
		XCG01582 = objectInput.readUTF();
		XCG01583 = objectInput.readUTF();
		XCG01584 = objectInput.readUTF();
		XCG01585 = objectInput.readUTF();
		XCG01586 = objectInput.readUTF();
		XCG01587 = objectInput.readUTF();
		XCG01588 = objectInput.readUTF();
		XCG01589 = objectInput.readUTF();
		XCG01590 = objectInput.readUTF();
		XCG01591 = objectInput.readUTF();
		XCG01592 = objectInput.readUTF();
		XCG01593 = objectInput.readUTF();
		XCG01594 = objectInput.readUTF();
		XCG01595 = objectInput.readUTF();
		XCG01596 = objectInput.readUTF();
		XCG01597 = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(convertAssembleId);

		objectOutput.writeLong(dossierId);

		if (dossierNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierNo);
		}

		if (referenceUid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(referenceUid);
		}

		if (dossierIdCTN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierIdCTN);
		}

		if (deliverableCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(deliverableCode);
		}

		objectOutput.writeLong(vehicleTypeCertificateId);

		if (XCG01496 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01496);
		}

		if (XCG01497 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01497);
		}

		if (XCG01498 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01498);
		}

		if (XCG01499 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01499);
		}

		if (XCG01500 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01500);
		}

		if (XCG01501 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01501);
		}

		if (XCG01502 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01502);
		}

		if (XCG01503 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01503);
		}

		if (XCG01504 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01504);
		}

		if (XCG01505 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01505);
		}

		if (XCG01506 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01506);
		}

		if (XCG01507 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01507);
		}

		if (XCG01508 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01508);
		}

		if (XCG01509 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01509);
		}

		if (XCG01510 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01510);
		}

		if (XCG01512 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01512);
		}

		if (XCG01513 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01513);
		}

		if (XCG01514 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01514);
		}

		if (XCG01515 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01515);
		}

		if (XCG01516 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01516);
		}

		if (XCG01517 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01517);
		}

		if (XCG01518 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01518);
		}

		if (XCG01519 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01519);
		}

		if (XCG01520 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01520);
		}

		if (XCG01521 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01521);
		}

		if (XCG01522 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01522);
		}

		if (XCG01523 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01523);
		}

		if (XCG01524 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01524);
		}

		if (XCG01525 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01525);
		}

		if (XCG01526 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01526);
		}

		if (XCG01527 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01527);
		}

		if (XCG01528 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01528);
		}

		if (XCG01529 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01529);
		}

		if (XCG01530 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01530);
		}

		if (XCG01531 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01531);
		}

		if (XCG01904 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01904);
		}

		if (XCG01533 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01533);
		}

		if (XCG01905 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01905);
		}

		if (XCG01534 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01534);
		}

		if (XCG01906 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01906);
		}

		if (XCG01535 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01535);
		}

		if (XCG01907 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01907);
		}

		if (XCG01536 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01536);
		}

		if (XCG01908 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01908);
		}

		if (XCG01537 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01537);
		}

		if (XCG01909 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01909);
		}

		if (XCG01538 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01538);
		}

		if (XCG01910 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01910);
		}

		if (XCG01539 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01539);
		}

		if (XCG11535 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG11535);
		}

		if (XCG01541 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01541);
		}

		if (XCG01542 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01542);
		}

		if (XCG01911 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01911);
		}

		if (XCG01543 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01543);
		}

		if (XCG01912 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01912);
		}

		if (XCG01544 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01544);
		}

		if (XCG01545 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01545);
		}

		if (XCG01546 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01546);
		}

		if (XCG01547 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01547);
		}

		if (XCG01548 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01548);
		}

		if (XCG01913 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01913);
		}

		if (XCG01549 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01549);
		}

		if (XCG01914 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01914);
		}

		if (XCG01550 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01550);
		}

		if (XCG01551 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01551);
		}

		if (XCG01552 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01552);
		}

		if (XCG01553 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01553);
		}

		if (XCG01554 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01554);
		}

		if (XCG01915 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01915);
		}

		if (XCG01555 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01555);
		}

		if (XCG01556 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01556);
		}

		if (XCG01557 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01557);
		}

		if (XCG01558 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01558);
		}

		if (XCG01559 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01559);
		}

		if (XCG01560 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01560);
		}

		if (XCG01561 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01561);
		}

		if (XCG01916 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01916);
		}

		if (XCG01562 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01562);
		}

		if (XCG01917 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01917);
		}

		if (XCG01563 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01563);
		}

		if (XCG01918 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01918);
		}

		if (XCG01564 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01564);
		}

		if (XCG01565 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01565);
		}

		if (XCG01566 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01566);
		}

		if (XCG01567 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01567);
		}

		if (XCG01568 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01568);
		}

		if (XCG01919 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01919);
		}

		if (XCG01569 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01569);
		}

		if (XCG01570 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01570);
		}

		if (XCG01571 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01571);
		}

		if (XCG01572 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01572);
		}

		if (XCG01920 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01920);
		}

		if (XCG01573 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01573);
		}

		if (XCG01921 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01921);
		}

		if (XCG01574 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01574);
		}

		if (XCG01922 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01922);
		}

		if (XCG01575 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01575);
		}

		if (XCG01576 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01576);
		}

		if (XCG01577 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01577);
		}

		if (XCG01578 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01578);
		}

		if (XCG01579 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01579);
		}

		if (XCG01580 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01580);
		}

		if (XCG01581 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01581);
		}

		if (XCG01582 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01582);
		}

		if (XCG01583 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01583);
		}

		if (XCG01584 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01584);
		}

		if (XCG01585 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01585);
		}

		if (XCG01586 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01586);
		}

		if (XCG01587 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01587);
		}

		if (XCG01588 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01588);
		}

		if (XCG01589 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01589);
		}

		if (XCG01590 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01590);
		}

		if (XCG01591 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01591);
		}

		if (XCG01592 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01592);
		}

		if (XCG01593 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01593);
		}

		if (XCG01594 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01594);
		}

		if (XCG01595 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01595);
		}

		if (XCG01596 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01596);
		}

		if (XCG01597 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01597);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public long convertAssembleId;
	public long dossierId;
	public String dossierNo;
	public String referenceUid;
	public String dossierIdCTN;
	public String deliverableCode;
	public long vehicleTypeCertificateId;
	public String XCG01496;
	public String XCG01497;
	public String XCG01498;
	public String XCG01499;
	public String XCG01500;
	public String XCG01501;
	public String XCG01502;
	public String XCG01503;
	public String XCG01504;
	public String XCG01505;
	public String XCG01506;
	public String XCG01507;
	public String XCG01508;
	public String XCG01509;
	public String XCG01510;
	public String XCG01512;
	public String XCG01513;
	public String XCG01514;
	public String XCG01515;
	public String XCG01516;
	public String XCG01517;
	public String XCG01518;
	public String XCG01519;
	public String XCG01520;
	public String XCG01521;
	public String XCG01522;
	public String XCG01523;
	public String XCG01524;
	public String XCG01525;
	public String XCG01526;
	public String XCG01527;
	public String XCG01528;
	public String XCG01529;
	public String XCG01530;
	public String XCG01531;
	public String XCG01904;
	public String XCG01533;
	public String XCG01905;
	public String XCG01534;
	public String XCG01906;
	public String XCG01535;
	public String XCG01907;
	public String XCG01536;
	public String XCG01908;
	public String XCG01537;
	public String XCG01909;
	public String XCG01538;
	public String XCG01910;
	public String XCG01539;
	public String XCG11535;
	public String XCG01541;
	public String XCG01542;
	public String XCG01911;
	public String XCG01543;
	public String XCG01912;
	public String XCG01544;
	public String XCG01545;
	public String XCG01546;
	public String XCG01547;
	public String XCG01548;
	public String XCG01913;
	public String XCG01549;
	public String XCG01914;
	public String XCG01550;
	public String XCG01551;
	public String XCG01552;
	public String XCG01553;
	public String XCG01554;
	public String XCG01915;
	public String XCG01555;
	public String XCG01556;
	public String XCG01557;
	public String XCG01558;
	public String XCG01559;
	public String XCG01560;
	public String XCG01561;
	public String XCG01916;
	public String XCG01562;
	public String XCG01917;
	public String XCG01563;
	public String XCG01918;
	public String XCG01564;
	public String XCG01565;
	public String XCG01566;
	public String XCG01567;
	public String XCG01568;
	public String XCG01919;
	public String XCG01569;
	public String XCG01570;
	public String XCG01571;
	public String XCG01572;
	public String XCG01920;
	public String XCG01573;
	public String XCG01921;
	public String XCG01574;
	public String XCG01922;
	public String XCG01575;
	public String XCG01576;
	public String XCG01577;
	public String XCG01578;
	public String XCG01579;
	public String XCG01580;
	public String XCG01581;
	public String XCG01582;
	public String XCG01583;
	public String XCG01584;
	public String XCG01585;
	public String XCG01586;
	public String XCG01587;
	public String XCG01588;
	public String XCG01589;
	public String XCG01590;
	public String XCG01591;
	public String XCG01592;
	public String XCG01593;
	public String XCG01594;
	public String XCG01595;
	public String XCG01596;
	public String XCG01597;
	public long modifyDate;
	public long syncDate;
}