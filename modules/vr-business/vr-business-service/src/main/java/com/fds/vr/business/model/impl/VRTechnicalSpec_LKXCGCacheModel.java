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

import com.fds.vr.business.model.VRTechnicalSpec_LKXCG;

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
 * The cache model class for representing VRTechnicalSpec_LKXCG in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_LKXCG
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_LKXCGCacheModel implements CacheModel<VRTechnicalSpec_LKXCG>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_LKXCGCacheModel)) {
			return false;
		}

		VRTechnicalSpec_LKXCGCacheModel vrTechnicalSpec_LKXCGCacheModel = (VRTechnicalSpec_LKXCGCacheModel)obj;

		if (id == vrTechnicalSpec_LKXCGCacheModel.id) {
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
		StringBundler sb = new StringBundler(349);

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
		sb.append(", XCG01001=");
		sb.append(XCG01001);
		sb.append(", XCG01002=");
		sb.append(XCG01002);
		sb.append(", XCG01003=");
		sb.append(XCG01003);
		sb.append(", XCG01004=");
		sb.append(XCG01004);
		sb.append(", XCG01005=");
		sb.append(XCG01005);
		sb.append(", XCG01006=");
		sb.append(XCG01006);
		sb.append(", XCG01007=");
		sb.append(XCG01007);
		sb.append(", XCG01008=");
		sb.append(XCG01008);
		sb.append(", XCG01009=");
		sb.append(XCG01009);
		sb.append(", XCG01010=");
		sb.append(XCG01010);
		sb.append(", XCG01011=");
		sb.append(XCG01011);
		sb.append(", XCG01012=");
		sb.append(XCG01012);
		sb.append(", XCG01013=");
		sb.append(XCG01013);
		sb.append(", XCG01014=");
		sb.append(XCG01014);
		sb.append(", XCG01016=");
		sb.append(XCG01016);
		sb.append(", XCG01017=");
		sb.append(XCG01017);
		sb.append(", XCG01019=");
		sb.append(XCG01019);
		sb.append(", XCG01020=");
		sb.append(XCG01020);
		sb.append(", XCG01021=");
		sb.append(XCG01021);
		sb.append(", XCG01022=");
		sb.append(XCG01022);
		sb.append(", XCG01024=");
		sb.append(XCG01024);
		sb.append(", XCG01025=");
		sb.append(XCG01025);
		sb.append(", XCG01026=");
		sb.append(XCG01026);
		sb.append(", XCG01027=");
		sb.append(XCG01027);
		sb.append(", XCG01028=");
		sb.append(XCG01028);
		sb.append(", XCG01030=");
		sb.append(XCG01030);
		sb.append(", XCG01031=");
		sb.append(XCG01031);
		sb.append(", XCG01032=");
		sb.append(XCG01032);
		sb.append(", XCG01033=");
		sb.append(XCG01033);
		sb.append(", XCG01034=");
		sb.append(XCG01034);
		sb.append(", XCG01035=");
		sb.append(XCG01035);
		sb.append(", XCG01036=");
		sb.append(XCG01036);
		sb.append(", XCG01037=");
		sb.append(XCG01037);
		sb.append(", XCG01038=");
		sb.append(XCG01038);
		sb.append(", XCG01039=");
		sb.append(XCG01039);
		sb.append(", XCG01040=");
		sb.append(XCG01040);
		sb.append(", XCG01041=");
		sb.append(XCG01041);
		sb.append(", XCG01042=");
		sb.append(XCG01042);
		sb.append(", XCG01043=");
		sb.append(XCG01043);
		sb.append(", XCG01044=");
		sb.append(XCG01044);
		sb.append(", XCG01045=");
		sb.append(XCG01045);
		sb.append(", XCG01046=");
		sb.append(XCG01046);
		sb.append(", XCG01047=");
		sb.append(XCG01047);
		sb.append(", XCG01049=");
		sb.append(XCG01049);
		sb.append(", XCG01050=");
		sb.append(XCG01050);
		sb.append(", XCG01051=");
		sb.append(XCG01051);
		sb.append(", XCG01052=");
		sb.append(XCG01052);
		sb.append(", XCG01053=");
		sb.append(XCG01053);
		sb.append(", XCG01054=");
		sb.append(XCG01054);
		sb.append(", XCG01055=");
		sb.append(XCG01055);
		sb.append(", XCG01056=");
		sb.append(XCG01056);
		sb.append(", XCG01057=");
		sb.append(XCG01057);
		sb.append(", XCG01058=");
		sb.append(XCG01058);
		sb.append(", XCG01059=");
		sb.append(XCG01059);
		sb.append(", XCG01060=");
		sb.append(XCG01060);
		sb.append(", XCG01062=");
		sb.append(XCG01062);
		sb.append(", XCG01063=");
		sb.append(XCG01063);
		sb.append(", XCG01064=");
		sb.append(XCG01064);
		sb.append(", XCG01065=");
		sb.append(XCG01065);
		sb.append(", XCG01066=");
		sb.append(XCG01066);
		sb.append(", XCG01067=");
		sb.append(XCG01067);
		sb.append(", XCG01068=");
		sb.append(XCG01068);
		sb.append(", XCG01069=");
		sb.append(XCG01069);
		sb.append(", LKXCG0407=");
		sb.append(LKXCG0407);
		sb.append(", LKXCG0408=");
		sb.append(LKXCG0408);
		sb.append(", LKXCG0409=");
		sb.append(LKXCG0409);
		sb.append(", LKXCG0410=");
		sb.append(LKXCG0410);
		sb.append(", LKXCG0411=");
		sb.append(LKXCG0411);
		sb.append(", LKXCG0412=");
		sb.append(LKXCG0412);
		sb.append(", LKXCG0413=");
		sb.append(LKXCG0413);
		sb.append(", LKXCG0414=");
		sb.append(LKXCG0414);
		sb.append(", LKXCG0415=");
		sb.append(LKXCG0415);
		sb.append(", LKXCG0416=");
		sb.append(LKXCG0416);
		sb.append(", LKXCG0507=");
		sb.append(LKXCG0507);
		sb.append(", LKXCG0508=");
		sb.append(LKXCG0508);
		sb.append(", LKXCG0509=");
		sb.append(LKXCG0509);
		sb.append(", LKXCG0510=");
		sb.append(LKXCG0510);
		sb.append(", LKXCG0511=");
		sb.append(LKXCG0511);
		sb.append(", LKXCG0512=");
		sb.append(LKXCG0512);
		sb.append(", LKXCG0708=");
		sb.append(LKXCG0708);
		sb.append(", LKXCG0709=");
		sb.append(LKXCG0709);
		sb.append(", LKXCG0710=");
		sb.append(LKXCG0710);
		sb.append(", LKXCG0711=");
		sb.append(LKXCG0711);
		sb.append(", LKXCG0713=");
		sb.append(LKXCG0713);
		sb.append(", LKXCG0714=");
		sb.append(LKXCG0714);
		sb.append(", LKXCG0715=");
		sb.append(LKXCG0715);
		sb.append(", LKXCG0716=");
		sb.append(LKXCG0716);
		sb.append(", LKXCG0717=");
		sb.append(LKXCG0717);
		sb.append(", LKXCG0718=");
		sb.append(LKXCG0718);
		sb.append(", LKXCG0719=");
		sb.append(LKXCG0719);
		sb.append(", LKXCG0720=");
		sb.append(LKXCG0720);
		sb.append(", LKXCG0721=");
		sb.append(LKXCG0721);
		sb.append(", LKXCG0722=");
		sb.append(LKXCG0722);
		sb.append(", LKXCG0723=");
		sb.append(LKXCG0723);
		sb.append(", LKXCG0724=");
		sb.append(LKXCG0724);
		sb.append(", LKXCG0725=");
		sb.append(LKXCG0725);
		sb.append(", LKXCG0726=");
		sb.append(LKXCG0726);
		sb.append(", LKXCG0727=");
		sb.append(LKXCG0727);
		sb.append(", LKXCG0728=");
		sb.append(LKXCG0728);
		sb.append(", LKXCG0606=");
		sb.append(LKXCG0606);
		sb.append(", LKXCG0607=");
		sb.append(LKXCG0607);
		sb.append(", LKXCG0608=");
		sb.append(LKXCG0608);
		sb.append(", LKXCG0609=");
		sb.append(LKXCG0609);
		sb.append(", LKXCG0610=");
		sb.append(LKXCG0610);
		sb.append(", LKXCG0611=");
		sb.append(LKXCG0611);
		sb.append(", LKXCG0612=");
		sb.append(LKXCG0612);
		sb.append(", LKXCG0613=");
		sb.append(LKXCG0613);
		sb.append(", LKXCG0614=");
		sb.append(LKXCG0614);
		sb.append(", LKXCG0615=");
		sb.append(LKXCG0615);
		sb.append(", LKXCG0616=");
		sb.append(LKXCG0616);
		sb.append(", LKXCG0620=");
		sb.append(LKXCG0620);
		sb.append(", LKXCG0807=");
		sb.append(LKXCG0807);
		sb.append(", LKXCG0808=");
		sb.append(LKXCG0808);
		sb.append(", LKXCG0809=");
		sb.append(LKXCG0809);
		sb.append(", LKXCG0810=");
		sb.append(LKXCG0810);
		sb.append(", LKXCG0812=");
		sb.append(LKXCG0812);
		sb.append(", LKXCG0813=");
		sb.append(LKXCG0813);
		sb.append(", LKXCG0814=");
		sb.append(LKXCG0814);
		sb.append(", LKXCG0815=");
		sb.append(LKXCG0815);
		sb.append(", LKXCG0816=");
		sb.append(LKXCG0816);
		sb.append(", LKXCG0817=");
		sb.append(LKXCG0817);
		sb.append(", LKXCG0818=");
		sb.append(LKXCG0818);
		sb.append(", LKXCG0819=");
		sb.append(LKXCG0819);
		sb.append(", LKXCG0820=");
		sb.append(LKXCG0820);
		sb.append(", LKXCG0907=");
		sb.append(LKXCG0907);
		sb.append(", LKXCG0908=");
		sb.append(LKXCG0908);
		sb.append(", LKXCG0909=");
		sb.append(LKXCG0909);
		sb.append(", LKXCG0910=");
		sb.append(LKXCG0910);
		sb.append(", LKXCG0911=");
		sb.append(LKXCG0911);
		sb.append(", LKXCG0912=");
		sb.append(LKXCG0912);
		sb.append(", LKXCG0913=");
		sb.append(LKXCG0913);
		sb.append(", LKXCG0914=");
		sb.append(LKXCG0914);
		sb.append(", BBLKXCG001=");
		sb.append(BBLKXCG001);
		sb.append(", BBLKXCG002=");
		sb.append(BBLKXCG002);
		sb.append(", BBLKXCG003=");
		sb.append(BBLKXCG003);
		sb.append(", BBLKXCG004=");
		sb.append(BBLKXCG004);
		sb.append(", BBLKXCG005=");
		sb.append(BBLKXCG005);
		sb.append(", BBLKXCG006=");
		sb.append(BBLKXCG006);
		sb.append(", BBLKXCG007=");
		sb.append(BBLKXCG007);
		sb.append(", BBLKXCG008=");
		sb.append(BBLKXCG008);
		sb.append(", BBLKXCG009=");
		sb.append(BBLKXCG009);
		sb.append(", BBLKXCG010=");
		sb.append(BBLKXCG010);
		sb.append(", BBLKXCG011=");
		sb.append(BBLKXCG011);
		sb.append(", BBLKXCG012=");
		sb.append(BBLKXCG012);
		sb.append(", BBLKXCG013=");
		sb.append(BBLKXCG013);
		sb.append(", BBLKXCG014=");
		sb.append(BBLKXCG014);
		sb.append(", BBLKXCG015=");
		sb.append(BBLKXCG015);
		sb.append(", BBLKXCG016=");
		sb.append(BBLKXCG016);
		sb.append(", BBLKXCG017=");
		sb.append(BBLKXCG017);
		sb.append(", BBLKXCG018=");
		sb.append(BBLKXCG018);
		sb.append(", BBLKXCG019=");
		sb.append(BBLKXCG019);
		sb.append(", BBLKXCG020=");
		sb.append(BBLKXCG020);
		sb.append(", BBLKXCG021=");
		sb.append(BBLKXCG021);
		sb.append(", BBLKXCG022=");
		sb.append(BBLKXCG022);
		sb.append(", BBLKXCG023=");
		sb.append(BBLKXCG023);
		sb.append(", BBLKXCG024=");
		sb.append(BBLKXCG024);
		sb.append(", BBLKXCG025=");
		sb.append(BBLKXCG025);
		sb.append(", BBLKXCG026=");
		sb.append(BBLKXCG026);
		sb.append(", BBLKXCG027=");
		sb.append(BBLKXCG027);
		sb.append(", BBLKXCG028=");
		sb.append(BBLKXCG028);
		sb.append(", BBLKXCG029=");
		sb.append(BBLKXCG029);
		sb.append(", BBLKXCG030=");
		sb.append(BBLKXCG030);
		sb.append(", BBLKXCG031=");
		sb.append(BBLKXCG031);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_LKXCG toEntityModel() {
		VRTechnicalSpec_LKXCGImpl vrTechnicalSpec_LKXCGImpl = new VRTechnicalSpec_LKXCGImpl();

		vrTechnicalSpec_LKXCGImpl.setId(id);
		vrTechnicalSpec_LKXCGImpl.setMtCore(mtCore);
		vrTechnicalSpec_LKXCGImpl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_LKXCGImpl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_LKXCGImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_LKXCGImpl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_LKXCGImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_LKXCGImpl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_LKXCGImpl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XCG01001 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01001(XCG01001);
		}

		if (XCG01002 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01002(XCG01002);
		}

		if (XCG01003 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01003(XCG01003);
		}

		if (XCG01004 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01004(XCG01004);
		}

		if (XCG01005 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01005(XCG01005);
		}

		if (XCG01006 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01006(XCG01006);
		}

		if (XCG01007 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01007(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01007(XCG01007);
		}

		if (XCG01008 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01008(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01008(XCG01008);
		}

		if (XCG01009 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01009(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01009(XCG01009);
		}

		if (XCG01010 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01010(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01010(XCG01010);
		}

		if (XCG01011 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01011(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01011(XCG01011);
		}

		if (XCG01012 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01012(XCG01012);
		}

		if (XCG01013 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01013(XCG01013);
		}

		if (XCG01014 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01014(XCG01014);
		}

		if (XCG01016 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01016(XCG01016);
		}

		if (XCG01017 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01017(XCG01017);
		}

		if (XCG01019 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01019(XCG01019);
		}

		if (XCG01020 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01020(XCG01020);
		}

		if (XCG01021 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01021(XCG01021);
		}

		if (XCG01022 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01022(XCG01022);
		}

		if (XCG01024 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01024(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01024(XCG01024);
		}

		if (XCG01025 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01025(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01025(XCG01025);
		}

		if (XCG01026 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01026(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01026(XCG01026);
		}

		if (XCG01027 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01027(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01027(XCG01027);
		}

		if (XCG01028 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01028(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01028(XCG01028);
		}

		if (XCG01030 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01030(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01030(XCG01030);
		}

		if (XCG01031 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01031(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01031(XCG01031);
		}

		if (XCG01032 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01032(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01032(XCG01032);
		}

		if (XCG01033 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01033(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01033(XCG01033);
		}

		if (XCG01034 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01034(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01034(XCG01034);
		}

		if (XCG01035 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01035(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01035(XCG01035);
		}

		if (XCG01036 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01036(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01036(XCG01036);
		}

		if (XCG01037 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01037(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01037(XCG01037);
		}

		if (XCG01038 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01038(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01038(XCG01038);
		}

		if (XCG01039 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01039(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01039(XCG01039);
		}

		if (XCG01040 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01040(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01040(XCG01040);
		}

		if (XCG01041 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01041(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01041(XCG01041);
		}

		if (XCG01042 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01042(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01042(XCG01042);
		}

		if (XCG01043 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01043(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01043(XCG01043);
		}

		if (XCG01044 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01044(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01044(XCG01044);
		}

		if (XCG01045 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01045(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01045(XCG01045);
		}

		if (XCG01046 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01046(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01046(XCG01046);
		}

		if (XCG01047 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01047(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01047(XCG01047);
		}

		if (XCG01049 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01049(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01049(XCG01049);
		}

		if (XCG01050 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01050(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01050(XCG01050);
		}

		if (XCG01051 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01051(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01051(XCG01051);
		}

		if (XCG01052 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01052(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01052(XCG01052);
		}

		if (XCG01053 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01053(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01053(XCG01053);
		}

		if (XCG01054 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01054(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01054(XCG01054);
		}

		if (XCG01055 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01055(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01055(XCG01055);
		}

		if (XCG01056 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01056(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01056(XCG01056);
		}

		if (XCG01057 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01057(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01057(XCG01057);
		}

		if (XCG01058 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01058(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01058(XCG01058);
		}

		if (XCG01059 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01059(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01059(XCG01059);
		}

		if (XCG01060 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01060(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01060(XCG01060);
		}

		if (XCG01062 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01062(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01062(XCG01062);
		}

		if (XCG01063 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01063(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01063(XCG01063);
		}

		if (XCG01064 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01064(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01064(XCG01064);
		}

		if (XCG01065 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01065(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01065(XCG01065);
		}

		if (XCG01066 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01066(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01066(XCG01066);
		}

		if (XCG01067 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01067(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01067(XCG01067);
		}

		if (XCG01068 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01068(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01068(XCG01068);
		}

		if (XCG01069 == null) {
			vrTechnicalSpec_LKXCGImpl.setXCG01069(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setXCG01069(XCG01069);
		}

		if (LKXCG0407 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0407(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0407(LKXCG0407);
		}

		if (LKXCG0408 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0408(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0408(LKXCG0408);
		}

		if (LKXCG0409 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0409(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0409(LKXCG0409);
		}

		if (LKXCG0410 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0410(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0410(LKXCG0410);
		}

		if (LKXCG0411 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0411(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0411(LKXCG0411);
		}

		if (LKXCG0412 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0412(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0412(LKXCG0412);
		}

		if (LKXCG0413 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0413(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0413(LKXCG0413);
		}

		if (LKXCG0414 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0414(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0414(LKXCG0414);
		}

		if (LKXCG0415 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0415(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0415(LKXCG0415);
		}

		if (LKXCG0416 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0416(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0416(LKXCG0416);
		}

		if (LKXCG0507 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0507(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0507(LKXCG0507);
		}

		if (LKXCG0508 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0508(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0508(LKXCG0508);
		}

		if (LKXCG0509 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0509(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0509(LKXCG0509);
		}

		if (LKXCG0510 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0510(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0510(LKXCG0510);
		}

		if (LKXCG0511 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0511(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0511(LKXCG0511);
		}

		if (LKXCG0512 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0512(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0512(LKXCG0512);
		}

		if (LKXCG0708 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0708(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0708(LKXCG0708);
		}

		if (LKXCG0709 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0709(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0709(LKXCG0709);
		}

		if (LKXCG0710 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0710(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0710(LKXCG0710);
		}

		if (LKXCG0711 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0711(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0711(LKXCG0711);
		}

		if (LKXCG0713 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0713(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0713(LKXCG0713);
		}

		if (LKXCG0714 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0714(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0714(LKXCG0714);
		}

		if (LKXCG0715 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0715(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0715(LKXCG0715);
		}

		if (LKXCG0716 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0716(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0716(LKXCG0716);
		}

		if (LKXCG0717 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0717(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0717(LKXCG0717);
		}

		if (LKXCG0718 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0718(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0718(LKXCG0718);
		}

		if (LKXCG0719 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0719(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0719(LKXCG0719);
		}

		if (LKXCG0720 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0720(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0720(LKXCG0720);
		}

		if (LKXCG0721 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0721(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0721(LKXCG0721);
		}

		if (LKXCG0722 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0722(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0722(LKXCG0722);
		}

		if (LKXCG0723 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0723(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0723(LKXCG0723);
		}

		if (LKXCG0724 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0724(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0724(LKXCG0724);
		}

		if (LKXCG0725 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0725(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0725(LKXCG0725);
		}

		if (LKXCG0726 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0726(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0726(LKXCG0726);
		}

		if (LKXCG0727 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0727(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0727(LKXCG0727);
		}

		if (LKXCG0728 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0728(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0728(LKXCG0728);
		}

		if (LKXCG0606 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0606(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0606(LKXCG0606);
		}

		if (LKXCG0607 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0607(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0607(LKXCG0607);
		}

		if (LKXCG0608 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0608(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0608(LKXCG0608);
		}

		if (LKXCG0609 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0609(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0609(LKXCG0609);
		}

		if (LKXCG0610 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0610(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0610(LKXCG0610);
		}

		if (LKXCG0611 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0611(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0611(LKXCG0611);
		}

		if (LKXCG0612 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0612(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0612(LKXCG0612);
		}

		if (LKXCG0613 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0613(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0613(LKXCG0613);
		}

		if (LKXCG0614 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0614(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0614(LKXCG0614);
		}

		if (LKXCG0615 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0615(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0615(LKXCG0615);
		}

		if (LKXCG0616 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0616(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0616(LKXCG0616);
		}

		if (LKXCG0620 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0620(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0620(LKXCG0620);
		}

		if (LKXCG0807 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0807(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0807(LKXCG0807);
		}

		if (LKXCG0808 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0808(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0808(LKXCG0808);
		}

		if (LKXCG0809 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0809(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0809(LKXCG0809);
		}

		if (LKXCG0810 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0810(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0810(LKXCG0810);
		}

		if (LKXCG0812 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0812(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0812(LKXCG0812);
		}

		if (LKXCG0813 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0813(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0813(LKXCG0813);
		}

		if (LKXCG0814 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0814(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0814(LKXCG0814);
		}

		if (LKXCG0815 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0815(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0815(LKXCG0815);
		}

		if (LKXCG0816 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0816(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0816(LKXCG0816);
		}

		if (LKXCG0817 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0817(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0817(LKXCG0817);
		}

		if (LKXCG0818 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0818(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0818(LKXCG0818);
		}

		if (LKXCG0819 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0819(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0819(LKXCG0819);
		}

		if (LKXCG0820 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0820(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0820(LKXCG0820);
		}

		if (LKXCG0907 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0907(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0907(LKXCG0907);
		}

		if (LKXCG0908 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0908(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0908(LKXCG0908);
		}

		if (LKXCG0909 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0909(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0909(LKXCG0909);
		}

		if (LKXCG0910 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0910(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0910(LKXCG0910);
		}

		if (LKXCG0911 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0911(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0911(LKXCG0911);
		}

		if (LKXCG0912 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0912(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0912(LKXCG0912);
		}

		if (LKXCG0913 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0913(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0913(LKXCG0913);
		}

		if (LKXCG0914 == null) {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0914(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setLKXCG0914(LKXCG0914);
		}

		if (BBLKXCG001 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG001(BBLKXCG001);
		}

		if (BBLKXCG002 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG002(BBLKXCG002);
		}

		if (BBLKXCG003 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG003(BBLKXCG003);
		}

		if (BBLKXCG004 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG004(BBLKXCG004);
		}

		if (BBLKXCG005 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG005(BBLKXCG005);
		}

		if (BBLKXCG006 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG006(BBLKXCG006);
		}

		if (BBLKXCG007 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG007(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG007(BBLKXCG007);
		}

		if (BBLKXCG008 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG008(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG008(BBLKXCG008);
		}

		if (BBLKXCG009 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG009(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG009(BBLKXCG009);
		}

		if (BBLKXCG010 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG010(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG010(BBLKXCG010);
		}

		if (BBLKXCG011 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG011(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG011(BBLKXCG011);
		}

		if (BBLKXCG012 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG012(BBLKXCG012);
		}

		if (BBLKXCG013 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG013(BBLKXCG013);
		}

		if (BBLKXCG014 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG014(BBLKXCG014);
		}

		if (BBLKXCG015 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG015(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG015(BBLKXCG015);
		}

		if (BBLKXCG016 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG016(BBLKXCG016);
		}

		if (BBLKXCG017 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG017(BBLKXCG017);
		}

		if (BBLKXCG018 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG018(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG018(BBLKXCG018);
		}

		if (BBLKXCG019 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG019(BBLKXCG019);
		}

		if (BBLKXCG020 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG020(BBLKXCG020);
		}

		if (BBLKXCG021 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG021(BBLKXCG021);
		}

		if (BBLKXCG022 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG022(BBLKXCG022);
		}

		if (BBLKXCG023 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG023(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG023(BBLKXCG023);
		}

		if (BBLKXCG024 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG024(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG024(BBLKXCG024);
		}

		if (BBLKXCG025 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG025(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG025(BBLKXCG025);
		}

		if (BBLKXCG026 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG026(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG026(BBLKXCG026);
		}

		if (BBLKXCG027 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG027(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG027(BBLKXCG027);
		}

		if (BBLKXCG028 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG028(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG028(BBLKXCG028);
		}

		if (BBLKXCG029 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG029(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG029(BBLKXCG029);
		}

		if (BBLKXCG030 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG030(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG030(BBLKXCG030);
		}

		if (BBLKXCG031 == null) {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG031(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setBBLKXCG031(BBLKXCG031);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_LKXCGImpl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_LKXCGImpl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_LKXCGImpl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_LKXCGImpl.resetOriginalValues();

		return vrTechnicalSpec_LKXCGImpl;
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
		XCG01001 = objectInput.readUTF();
		XCG01002 = objectInput.readUTF();
		XCG01003 = objectInput.readUTF();
		XCG01004 = objectInput.readUTF();
		XCG01005 = objectInput.readUTF();
		XCG01006 = objectInput.readUTF();
		XCG01007 = objectInput.readUTF();
		XCG01008 = objectInput.readUTF();
		XCG01009 = objectInput.readUTF();
		XCG01010 = objectInput.readUTF();
		XCG01011 = objectInput.readUTF();
		XCG01012 = objectInput.readUTF();
		XCG01013 = objectInput.readUTF();
		XCG01014 = objectInput.readUTF();
		XCG01016 = objectInput.readUTF();
		XCG01017 = objectInput.readUTF();
		XCG01019 = objectInput.readUTF();
		XCG01020 = objectInput.readUTF();
		XCG01021 = objectInput.readUTF();
		XCG01022 = objectInput.readUTF();
		XCG01024 = objectInput.readUTF();
		XCG01025 = objectInput.readUTF();
		XCG01026 = objectInput.readUTF();
		XCG01027 = objectInput.readUTF();
		XCG01028 = objectInput.readUTF();
		XCG01030 = objectInput.readUTF();
		XCG01031 = objectInput.readUTF();
		XCG01032 = objectInput.readUTF();
		XCG01033 = objectInput.readUTF();
		XCG01034 = objectInput.readUTF();
		XCG01035 = objectInput.readUTF();
		XCG01036 = objectInput.readUTF();
		XCG01037 = objectInput.readUTF();
		XCG01038 = objectInput.readUTF();
		XCG01039 = objectInput.readUTF();
		XCG01040 = objectInput.readUTF();
		XCG01041 = objectInput.readUTF();
		XCG01042 = objectInput.readUTF();
		XCG01043 = objectInput.readUTF();
		XCG01044 = objectInput.readUTF();
		XCG01045 = objectInput.readUTF();
		XCG01046 = objectInput.readUTF();
		XCG01047 = objectInput.readUTF();
		XCG01049 = objectInput.readUTF();
		XCG01050 = objectInput.readUTF();
		XCG01051 = objectInput.readUTF();
		XCG01052 = objectInput.readUTF();
		XCG01053 = objectInput.readUTF();
		XCG01054 = objectInput.readUTF();
		XCG01055 = objectInput.readUTF();
		XCG01056 = objectInput.readUTF();
		XCG01057 = objectInput.readUTF();
		XCG01058 = objectInput.readUTF();
		XCG01059 = objectInput.readUTF();
		XCG01060 = objectInput.readUTF();
		XCG01062 = objectInput.readUTF();
		XCG01063 = objectInput.readUTF();
		XCG01064 = objectInput.readUTF();
		XCG01065 = objectInput.readUTF();
		XCG01066 = objectInput.readUTF();
		XCG01067 = objectInput.readUTF();
		XCG01068 = objectInput.readUTF();
		XCG01069 = objectInput.readUTF();
		LKXCG0407 = objectInput.readUTF();
		LKXCG0408 = objectInput.readUTF();
		LKXCG0409 = objectInput.readUTF();
		LKXCG0410 = objectInput.readUTF();
		LKXCG0411 = objectInput.readUTF();
		LKXCG0412 = objectInput.readUTF();
		LKXCG0413 = objectInput.readUTF();
		LKXCG0414 = objectInput.readUTF();
		LKXCG0415 = objectInput.readUTF();
		LKXCG0416 = objectInput.readUTF();
		LKXCG0507 = objectInput.readUTF();
		LKXCG0508 = objectInput.readUTF();
		LKXCG0509 = objectInput.readUTF();
		LKXCG0510 = objectInput.readUTF();
		LKXCG0511 = objectInput.readUTF();
		LKXCG0512 = objectInput.readUTF();
		LKXCG0708 = objectInput.readUTF();
		LKXCG0709 = objectInput.readUTF();
		LKXCG0710 = objectInput.readUTF();
		LKXCG0711 = objectInput.readUTF();
		LKXCG0713 = objectInput.readUTF();
		LKXCG0714 = objectInput.readUTF();
		LKXCG0715 = objectInput.readUTF();
		LKXCG0716 = objectInput.readUTF();
		LKXCG0717 = objectInput.readUTF();
		LKXCG0718 = objectInput.readUTF();
		LKXCG0719 = objectInput.readUTF();
		LKXCG0720 = objectInput.readUTF();
		LKXCG0721 = objectInput.readUTF();
		LKXCG0722 = objectInput.readUTF();
		LKXCG0723 = objectInput.readUTF();
		LKXCG0724 = objectInput.readUTF();
		LKXCG0725 = objectInput.readUTF();
		LKXCG0726 = objectInput.readUTF();
		LKXCG0727 = objectInput.readUTF();
		LKXCG0728 = objectInput.readUTF();
		LKXCG0606 = objectInput.readUTF();
		LKXCG0607 = objectInput.readUTF();
		LKXCG0608 = objectInput.readUTF();
		LKXCG0609 = objectInput.readUTF();
		LKXCG0610 = objectInput.readUTF();
		LKXCG0611 = objectInput.readUTF();
		LKXCG0612 = objectInput.readUTF();
		LKXCG0613 = objectInput.readUTF();
		LKXCG0614 = objectInput.readUTF();
		LKXCG0615 = objectInput.readUTF();
		LKXCG0616 = objectInput.readUTF();
		LKXCG0620 = objectInput.readUTF();
		LKXCG0807 = objectInput.readUTF();
		LKXCG0808 = objectInput.readUTF();
		LKXCG0809 = objectInput.readUTF();
		LKXCG0810 = objectInput.readUTF();
		LKXCG0812 = objectInput.readUTF();
		LKXCG0813 = objectInput.readUTF();
		LKXCG0814 = objectInput.readUTF();
		LKXCG0815 = objectInput.readUTF();
		LKXCG0816 = objectInput.readUTF();
		LKXCG0817 = objectInput.readUTF();
		LKXCG0818 = objectInput.readUTF();
		LKXCG0819 = objectInput.readUTF();
		LKXCG0820 = objectInput.readUTF();
		LKXCG0907 = objectInput.readUTF();
		LKXCG0908 = objectInput.readUTF();
		LKXCG0909 = objectInput.readUTF();
		LKXCG0910 = objectInput.readUTF();
		LKXCG0911 = objectInput.readUTF();
		LKXCG0912 = objectInput.readUTF();
		LKXCG0913 = objectInput.readUTF();
		LKXCG0914 = objectInput.readUTF();
		BBLKXCG001 = objectInput.readUTF();
		BBLKXCG002 = objectInput.readUTF();
		BBLKXCG003 = objectInput.readUTF();
		BBLKXCG004 = objectInput.readUTF();
		BBLKXCG005 = objectInput.readUTF();
		BBLKXCG006 = objectInput.readUTF();
		BBLKXCG007 = objectInput.readUTF();
		BBLKXCG008 = objectInput.readUTF();
		BBLKXCG009 = objectInput.readUTF();
		BBLKXCG010 = objectInput.readUTF();
		BBLKXCG011 = objectInput.readUTF();
		BBLKXCG012 = objectInput.readUTF();
		BBLKXCG013 = objectInput.readUTF();
		BBLKXCG014 = objectInput.readUTF();
		BBLKXCG015 = objectInput.readUTF();
		BBLKXCG016 = objectInput.readUTF();
		BBLKXCG017 = objectInput.readUTF();
		BBLKXCG018 = objectInput.readUTF();
		BBLKXCG019 = objectInput.readUTF();
		BBLKXCG020 = objectInput.readUTF();
		BBLKXCG021 = objectInput.readUTF();
		BBLKXCG022 = objectInput.readUTF();
		BBLKXCG023 = objectInput.readUTF();
		BBLKXCG024 = objectInput.readUTF();
		BBLKXCG025 = objectInput.readUTF();
		BBLKXCG026 = objectInput.readUTF();
		BBLKXCG027 = objectInput.readUTF();
		BBLKXCG028 = objectInput.readUTF();
		BBLKXCG029 = objectInput.readUTF();
		BBLKXCG030 = objectInput.readUTF();
		BBLKXCG031 = objectInput.readUTF();
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

		if (XCG01001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01001);
		}

		if (XCG01002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01002);
		}

		if (XCG01003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01003);
		}

		if (XCG01004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01004);
		}

		if (XCG01005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01005);
		}

		if (XCG01006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01006);
		}

		if (XCG01007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01007);
		}

		if (XCG01008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01008);
		}

		if (XCG01009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01009);
		}

		if (XCG01010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01010);
		}

		if (XCG01011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01011);
		}

		if (XCG01012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01012);
		}

		if (XCG01013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01013);
		}

		if (XCG01014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01014);
		}

		if (XCG01016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01016);
		}

		if (XCG01017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01017);
		}

		if (XCG01019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01019);
		}

		if (XCG01020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01020);
		}

		if (XCG01021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01021);
		}

		if (XCG01022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01022);
		}

		if (XCG01024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01024);
		}

		if (XCG01025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01025);
		}

		if (XCG01026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01026);
		}

		if (XCG01027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01027);
		}

		if (XCG01028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01028);
		}

		if (XCG01030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01030);
		}

		if (XCG01031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01031);
		}

		if (XCG01032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01032);
		}

		if (XCG01033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01033);
		}

		if (XCG01034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01034);
		}

		if (XCG01035 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01035);
		}

		if (XCG01036 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01036);
		}

		if (XCG01037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01037);
		}

		if (XCG01038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01038);
		}

		if (XCG01039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01039);
		}

		if (XCG01040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01040);
		}

		if (XCG01041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01041);
		}

		if (XCG01042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01042);
		}

		if (XCG01043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01043);
		}

		if (XCG01044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01044);
		}

		if (XCG01045 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01045);
		}

		if (XCG01046 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01046);
		}

		if (XCG01047 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01047);
		}

		if (XCG01049 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01049);
		}

		if (XCG01050 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01050);
		}

		if (XCG01051 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01051);
		}

		if (XCG01052 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01052);
		}

		if (XCG01053 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01053);
		}

		if (XCG01054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01054);
		}

		if (XCG01055 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01055);
		}

		if (XCG01056 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01056);
		}

		if (XCG01057 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01057);
		}

		if (XCG01058 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01058);
		}

		if (XCG01059 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01059);
		}

		if (XCG01060 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01060);
		}

		if (XCG01062 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01062);
		}

		if (XCG01063 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01063);
		}

		if (XCG01064 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01064);
		}

		if (XCG01065 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01065);
		}

		if (XCG01066 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01066);
		}

		if (XCG01067 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01067);
		}

		if (XCG01068 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01068);
		}

		if (XCG01069 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01069);
		}

		if (LKXCG0407 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0407);
		}

		if (LKXCG0408 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0408);
		}

		if (LKXCG0409 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0409);
		}

		if (LKXCG0410 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0410);
		}

		if (LKXCG0411 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0411);
		}

		if (LKXCG0412 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0412);
		}

		if (LKXCG0413 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0413);
		}

		if (LKXCG0414 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0414);
		}

		if (LKXCG0415 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0415);
		}

		if (LKXCG0416 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0416);
		}

		if (LKXCG0507 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0507);
		}

		if (LKXCG0508 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0508);
		}

		if (LKXCG0509 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0509);
		}

		if (LKXCG0510 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0510);
		}

		if (LKXCG0511 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0511);
		}

		if (LKXCG0512 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0512);
		}

		if (LKXCG0708 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0708);
		}

		if (LKXCG0709 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0709);
		}

		if (LKXCG0710 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0710);
		}

		if (LKXCG0711 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0711);
		}

		if (LKXCG0713 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0713);
		}

		if (LKXCG0714 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0714);
		}

		if (LKXCG0715 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0715);
		}

		if (LKXCG0716 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0716);
		}

		if (LKXCG0717 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0717);
		}

		if (LKXCG0718 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0718);
		}

		if (LKXCG0719 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0719);
		}

		if (LKXCG0720 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0720);
		}

		if (LKXCG0721 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0721);
		}

		if (LKXCG0722 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0722);
		}

		if (LKXCG0723 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0723);
		}

		if (LKXCG0724 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0724);
		}

		if (LKXCG0725 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0725);
		}

		if (LKXCG0726 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0726);
		}

		if (LKXCG0727 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0727);
		}

		if (LKXCG0728 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0728);
		}

		if (LKXCG0606 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0606);
		}

		if (LKXCG0607 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0607);
		}

		if (LKXCG0608 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0608);
		}

		if (LKXCG0609 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0609);
		}

		if (LKXCG0610 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0610);
		}

		if (LKXCG0611 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0611);
		}

		if (LKXCG0612 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0612);
		}

		if (LKXCG0613 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0613);
		}

		if (LKXCG0614 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0614);
		}

		if (LKXCG0615 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0615);
		}

		if (LKXCG0616 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0616);
		}

		if (LKXCG0620 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0620);
		}

		if (LKXCG0807 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0807);
		}

		if (LKXCG0808 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0808);
		}

		if (LKXCG0809 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0809);
		}

		if (LKXCG0810 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0810);
		}

		if (LKXCG0812 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0812);
		}

		if (LKXCG0813 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0813);
		}

		if (LKXCG0814 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0814);
		}

		if (LKXCG0815 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0815);
		}

		if (LKXCG0816 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0816);
		}

		if (LKXCG0817 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0817);
		}

		if (LKXCG0818 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0818);
		}

		if (LKXCG0819 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0819);
		}

		if (LKXCG0820 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0820);
		}

		if (LKXCG0907 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0907);
		}

		if (LKXCG0908 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0908);
		}

		if (LKXCG0909 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0909);
		}

		if (LKXCG0910 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0910);
		}

		if (LKXCG0911 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0911);
		}

		if (LKXCG0912 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0912);
		}

		if (LKXCG0913 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0913);
		}

		if (LKXCG0914 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXCG0914);
		}

		if (BBLKXCG001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG001);
		}

		if (BBLKXCG002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG002);
		}

		if (BBLKXCG003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG003);
		}

		if (BBLKXCG004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG004);
		}

		if (BBLKXCG005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG005);
		}

		if (BBLKXCG006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG006);
		}

		if (BBLKXCG007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG007);
		}

		if (BBLKXCG008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG008);
		}

		if (BBLKXCG009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG009);
		}

		if (BBLKXCG010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG010);
		}

		if (BBLKXCG011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG011);
		}

		if (BBLKXCG012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG012);
		}

		if (BBLKXCG013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG013);
		}

		if (BBLKXCG014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG014);
		}

		if (BBLKXCG015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG015);
		}

		if (BBLKXCG016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG016);
		}

		if (BBLKXCG017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG017);
		}

		if (BBLKXCG018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG018);
		}

		if (BBLKXCG019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG019);
		}

		if (BBLKXCG020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG020);
		}

		if (BBLKXCG021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG021);
		}

		if (BBLKXCG022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG022);
		}

		if (BBLKXCG023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG023);
		}

		if (BBLKXCG024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG024);
		}

		if (BBLKXCG025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG025);
		}

		if (BBLKXCG026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG026);
		}

		if (BBLKXCG027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG027);
		}

		if (BBLKXCG028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG028);
		}

		if (BBLKXCG029 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG029);
		}

		if (BBLKXCG030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG030);
		}

		if (BBLKXCG031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXCG031);
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
	public String XCG01001;
	public String XCG01002;
	public String XCG01003;
	public String XCG01004;
	public String XCG01005;
	public String XCG01006;
	public String XCG01007;
	public String XCG01008;
	public String XCG01009;
	public String XCG01010;
	public String XCG01011;
	public String XCG01012;
	public String XCG01013;
	public String XCG01014;
	public String XCG01016;
	public String XCG01017;
	public String XCG01019;
	public String XCG01020;
	public String XCG01021;
	public String XCG01022;
	public String XCG01024;
	public String XCG01025;
	public String XCG01026;
	public String XCG01027;
	public String XCG01028;
	public String XCG01030;
	public String XCG01031;
	public String XCG01032;
	public String XCG01033;
	public String XCG01034;
	public String XCG01035;
	public String XCG01036;
	public String XCG01037;
	public String XCG01038;
	public String XCG01039;
	public String XCG01040;
	public String XCG01041;
	public String XCG01042;
	public String XCG01043;
	public String XCG01044;
	public String XCG01045;
	public String XCG01046;
	public String XCG01047;
	public String XCG01049;
	public String XCG01050;
	public String XCG01051;
	public String XCG01052;
	public String XCG01053;
	public String XCG01054;
	public String XCG01055;
	public String XCG01056;
	public String XCG01057;
	public String XCG01058;
	public String XCG01059;
	public String XCG01060;
	public String XCG01062;
	public String XCG01063;
	public String XCG01064;
	public String XCG01065;
	public String XCG01066;
	public String XCG01067;
	public String XCG01068;
	public String XCG01069;
	public String LKXCG0407;
	public String LKXCG0408;
	public String LKXCG0409;
	public String LKXCG0410;
	public String LKXCG0411;
	public String LKXCG0412;
	public String LKXCG0413;
	public String LKXCG0414;
	public String LKXCG0415;
	public String LKXCG0416;
	public String LKXCG0507;
	public String LKXCG0508;
	public String LKXCG0509;
	public String LKXCG0510;
	public String LKXCG0511;
	public String LKXCG0512;
	public String LKXCG0708;
	public String LKXCG0709;
	public String LKXCG0710;
	public String LKXCG0711;
	public String LKXCG0713;
	public String LKXCG0714;
	public String LKXCG0715;
	public String LKXCG0716;
	public String LKXCG0717;
	public String LKXCG0718;
	public String LKXCG0719;
	public String LKXCG0720;
	public String LKXCG0721;
	public String LKXCG0722;
	public String LKXCG0723;
	public String LKXCG0724;
	public String LKXCG0725;
	public String LKXCG0726;
	public String LKXCG0727;
	public String LKXCG0728;
	public String LKXCG0606;
	public String LKXCG0607;
	public String LKXCG0608;
	public String LKXCG0609;
	public String LKXCG0610;
	public String LKXCG0611;
	public String LKXCG0612;
	public String LKXCG0613;
	public String LKXCG0614;
	public String LKXCG0615;
	public String LKXCG0616;
	public String LKXCG0620;
	public String LKXCG0807;
	public String LKXCG0808;
	public String LKXCG0809;
	public String LKXCG0810;
	public String LKXCG0812;
	public String LKXCG0813;
	public String LKXCG0814;
	public String LKXCG0815;
	public String LKXCG0816;
	public String LKXCG0817;
	public String LKXCG0818;
	public String LKXCG0819;
	public String LKXCG0820;
	public String LKXCG0907;
	public String LKXCG0908;
	public String LKXCG0909;
	public String LKXCG0910;
	public String LKXCG0911;
	public String LKXCG0912;
	public String LKXCG0913;
	public String LKXCG0914;
	public String BBLKXCG001;
	public String BBLKXCG002;
	public String BBLKXCG003;
	public String BBLKXCG004;
	public String BBLKXCG005;
	public String BBLKXCG006;
	public String BBLKXCG007;
	public String BBLKXCG008;
	public String BBLKXCG009;
	public String BBLKXCG010;
	public String BBLKXCG011;
	public String BBLKXCG012;
	public String BBLKXCG013;
	public String BBLKXCG014;
	public String BBLKXCG015;
	public String BBLKXCG016;
	public String BBLKXCG017;
	public String BBLKXCG018;
	public String BBLKXCG019;
	public String BBLKXCG020;
	public String BBLKXCG021;
	public String BBLKXCG022;
	public String BBLKXCG023;
	public String BBLKXCG024;
	public String BBLKXCG025;
	public String BBLKXCG026;
	public String BBLKXCG027;
	public String BBLKXCG028;
	public String BBLKXCG029;
	public String BBLKXCG030;
	public String BBLKXCG031;
	public long modifyDate;
	public long syncDate;
}