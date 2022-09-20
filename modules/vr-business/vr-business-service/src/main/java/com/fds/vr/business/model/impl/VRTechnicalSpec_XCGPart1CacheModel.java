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

import com.fds.vr.business.model.VRTechnicalSpec_XCGPart1;

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
 * The cache model class for representing VRTechnicalSpec_XCGPart1 in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart1
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart1CacheModel implements CacheModel<VRTechnicalSpec_XCGPart1>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGPart1CacheModel)) {
			return false;
		}

		VRTechnicalSpec_XCGPart1CacheModel vrTechnicalSpec_XCGPart1CacheModel = (VRTechnicalSpec_XCGPart1CacheModel)obj;

		if (id == vrTechnicalSpec_XCGPart1CacheModel.id) {
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
		StringBundler sb = new StringBundler(335);

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
		sb.append(", loai_dong_co=");
		sb.append(loai_dong_co);
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
		sb.append(", XCG01070=");
		sb.append(XCG01070);
		sb.append(", XCG01072=");
		sb.append(XCG01072);
		sb.append(", XCG01073=");
		sb.append(XCG01073);
		sb.append(", XCG01074=");
		sb.append(XCG01074);
		sb.append(", XCG01075=");
		sb.append(XCG01075);
		sb.append(", XCG01076=");
		sb.append(XCG01076);
		sb.append(", XCG01077=");
		sb.append(XCG01077);
		sb.append(", XCG01078=");
		sb.append(XCG01078);
		sb.append(", XCG01079=");
		sb.append(XCG01079);
		sb.append(", XCG01080=");
		sb.append(XCG01080);
		sb.append(", XCG01081=");
		sb.append(XCG01081);
		sb.append(", XCG01082=");
		sb.append(XCG01082);
		sb.append(", XCG01083=");
		sb.append(XCG01083);
		sb.append(", XCG01084=");
		sb.append(XCG01084);
		sb.append(", XCG01085=");
		sb.append(XCG01085);
		sb.append(", XCG01086=");
		sb.append(XCG01086);
		sb.append(", XCG01087=");
		sb.append(XCG01087);
		sb.append(", XCG01088=");
		sb.append(XCG01088);
		sb.append(", XCG01089=");
		sb.append(XCG01089);
		sb.append(", XCG01090=");
		sb.append(XCG01090);
		sb.append(", XCG01091=");
		sb.append(XCG01091);
		sb.append(", XCG01092=");
		sb.append(XCG01092);
		sb.append(", XCG01093=");
		sb.append(XCG01093);
		sb.append(", XCG01094=");
		sb.append(XCG01094);
		sb.append(", XCG01095=");
		sb.append(XCG01095);
		sb.append(", XCG01096=");
		sb.append(XCG01096);
		sb.append(", XCG01097=");
		sb.append(XCG01097);
		sb.append(", XCG01098=");
		sb.append(XCG01098);
		sb.append(", XCG01099=");
		sb.append(XCG01099);
		sb.append(", XCG01100=");
		sb.append(XCG01100);
		sb.append(", XCG01101=");
		sb.append(XCG01101);
		sb.append(", XCG01102=");
		sb.append(XCG01102);
		sb.append(", XCG01103=");
		sb.append(XCG01103);
		sb.append(", XCG01104=");
		sb.append(XCG01104);
		sb.append(", XCG01105=");
		sb.append(XCG01105);
		sb.append(", XCG01106=");
		sb.append(XCG01106);
		sb.append(", XCG01107=");
		sb.append(XCG01107);
		sb.append(", XCG01108=");
		sb.append(XCG01108);
		sb.append(", XCG01109=");
		sb.append(XCG01109);
		sb.append(", XCG01110=");
		sb.append(XCG01110);
		sb.append(", XCG01111=");
		sb.append(XCG01111);
		sb.append(", XCG01112=");
		sb.append(XCG01112);
		sb.append(", XCG01113=");
		sb.append(XCG01113);
		sb.append(", XCG01114=");
		sb.append(XCG01114);
		sb.append(", XCG01115=");
		sb.append(XCG01115);
		sb.append(", XCG01116=");
		sb.append(XCG01116);
		sb.append(", XCG01117=");
		sb.append(XCG01117);
		sb.append(", XCG01118=");
		sb.append(XCG01118);
		sb.append(", XCG01119=");
		sb.append(XCG01119);
		sb.append(", XCG01120=");
		sb.append(XCG01120);
		sb.append(", XCG01121=");
		sb.append(XCG01121);
		sb.append(", XCG01122=");
		sb.append(XCG01122);
		sb.append(", XCG01123=");
		sb.append(XCG01123);
		sb.append(", XCG01124=");
		sb.append(XCG01124);
		sb.append(", XCG01125=");
		sb.append(XCG01125);
		sb.append(", XCG01126=");
		sb.append(XCG01126);
		sb.append(", XCG01127=");
		sb.append(XCG01127);
		sb.append(", XCG01128=");
		sb.append(XCG01128);
		sb.append(", XCG01129=");
		sb.append(XCG01129);
		sb.append(", XCG01130=");
		sb.append(XCG01130);
		sb.append(", XCG01131=");
		sb.append(XCG01131);
		sb.append(", XCG01132=");
		sb.append(XCG01132);
		sb.append(", XCG01133=");
		sb.append(XCG01133);
		sb.append(", XCG01134=");
		sb.append(XCG01134);
		sb.append(", XCG01135=");
		sb.append(XCG01135);
		sb.append(", XCG01136=");
		sb.append(XCG01136);
		sb.append(", XCG01137=");
		sb.append(XCG01137);
		sb.append(", XCG01138=");
		sb.append(XCG01138);
		sb.append(", XCG01139=");
		sb.append(XCG01139);
		sb.append(", XCG01140=");
		sb.append(XCG01140);
		sb.append(", XCG01141=");
		sb.append(XCG01141);
		sb.append(", XCG01142=");
		sb.append(XCG01142);
		sb.append(", XCG01143=");
		sb.append(XCG01143);
		sb.append(", XCG01144=");
		sb.append(XCG01144);
		sb.append(", XCG01145=");
		sb.append(XCG01145);
		sb.append(", XCG01146=");
		sb.append(XCG01146);
		sb.append(", XCG01147=");
		sb.append(XCG01147);
		sb.append(", XCG01148=");
		sb.append(XCG01148);
		sb.append(", XCG01149=");
		sb.append(XCG01149);
		sb.append(", XCG01150=");
		sb.append(XCG01150);
		sb.append(", XCG01151=");
		sb.append(XCG01151);
		sb.append(", XCG01152=");
		sb.append(XCG01152);
		sb.append(", XCG01153=");
		sb.append(XCG01153);
		sb.append(", XCG01154=");
		sb.append(XCG01154);
		sb.append(", XCG01155=");
		sb.append(XCG01155);
		sb.append(", XCG01156=");
		sb.append(XCG01156);
		sb.append(", XCG01157=");
		sb.append(XCG01157);
		sb.append(", XCG01158=");
		sb.append(XCG01158);
		sb.append(", XCG01159=");
		sb.append(XCG01159);
		sb.append(", XCG01160=");
		sb.append(XCG01160);
		sb.append(", XCG01161=");
		sb.append(XCG01161);
		sb.append(", XCG01162=");
		sb.append(XCG01162);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XCGPart1 toEntityModel() {
		VRTechnicalSpec_XCGPart1Impl vrTechnicalSpec_XCGPart1Impl = new VRTechnicalSpec_XCGPart1Impl();

		vrTechnicalSpec_XCGPart1Impl.setId(id);
		vrTechnicalSpec_XCGPart1Impl.setMtCore(mtCore);
		vrTechnicalSpec_XCGPart1Impl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XCGPart1Impl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XCGPart1Impl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XCGPart1Impl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XCGPart1Impl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XCGPart1Impl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XCGPart1Impl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (loai_dong_co == null) {
			vrTechnicalSpec_XCGPart1Impl.setLoai_dong_co(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setLoai_dong_co(loai_dong_co);
		}

		if (XCG01001 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01001(XCG01001);
		}

		if (XCG01002 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01002(XCG01002);
		}

		if (XCG01003 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01003(XCG01003);
		}

		if (XCG01004 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01004(XCG01004);
		}

		if (XCG01005 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01005(XCG01005);
		}

		if (XCG01006 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01006(XCG01006);
		}

		if (XCG01007 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01007(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01007(XCG01007);
		}

		if (XCG01008 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01008(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01008(XCG01008);
		}

		if (XCG01009 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01009(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01009(XCG01009);
		}

		if (XCG01010 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01010(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01010(XCG01010);
		}

		if (XCG01011 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01011(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01011(XCG01011);
		}

		if (XCG01012 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01012(XCG01012);
		}

		if (XCG01013 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01013(XCG01013);
		}

		if (XCG01014 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01014(XCG01014);
		}

		if (XCG01016 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01016(XCG01016);
		}

		if (XCG01017 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01017(XCG01017);
		}

		if (XCG01019 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01019(XCG01019);
		}

		if (XCG01020 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01020(XCG01020);
		}

		if (XCG01021 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01021(XCG01021);
		}

		if (XCG01022 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01022(XCG01022);
		}

		if (XCG01024 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01024(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01024(XCG01024);
		}

		if (XCG01025 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01025(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01025(XCG01025);
		}

		if (XCG01026 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01026(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01026(XCG01026);
		}

		if (XCG01027 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01027(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01027(XCG01027);
		}

		if (XCG01028 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01028(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01028(XCG01028);
		}

		if (XCG01030 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01030(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01030(XCG01030);
		}

		if (XCG01031 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01031(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01031(XCG01031);
		}

		if (XCG01032 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01032(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01032(XCG01032);
		}

		if (XCG01033 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01033(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01033(XCG01033);
		}

		if (XCG01034 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01034(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01034(XCG01034);
		}

		if (XCG01035 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01035(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01035(XCG01035);
		}

		if (XCG01036 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01036(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01036(XCG01036);
		}

		if (XCG01037 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01037(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01037(XCG01037);
		}

		if (XCG01038 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01038(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01038(XCG01038);
		}

		if (XCG01039 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01039(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01039(XCG01039);
		}

		if (XCG01040 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01040(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01040(XCG01040);
		}

		if (XCG01041 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01041(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01041(XCG01041);
		}

		if (XCG01042 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01042(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01042(XCG01042);
		}

		if (XCG01043 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01043(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01043(XCG01043);
		}

		if (XCG01044 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01044(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01044(XCG01044);
		}

		if (XCG01045 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01045(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01045(XCG01045);
		}

		if (XCG01046 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01046(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01046(XCG01046);
		}

		if (XCG01047 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01047(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01047(XCG01047);
		}

		if (XCG01049 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01049(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01049(XCG01049);
		}

		if (XCG01050 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01050(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01050(XCG01050);
		}

		if (XCG01051 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01051(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01051(XCG01051);
		}

		if (XCG01052 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01052(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01052(XCG01052);
		}

		if (XCG01053 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01053(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01053(XCG01053);
		}

		if (XCG01054 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01054(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01054(XCG01054);
		}

		if (XCG01055 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01055(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01055(XCG01055);
		}

		if (XCG01056 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01056(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01056(XCG01056);
		}

		if (XCG01057 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01057(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01057(XCG01057);
		}

		if (XCG01058 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01058(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01058(XCG01058);
		}

		if (XCG01059 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01059(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01059(XCG01059);
		}

		if (XCG01060 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01060(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01060(XCG01060);
		}

		if (XCG01062 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01062(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01062(XCG01062);
		}

		if (XCG01063 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01063(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01063(XCG01063);
		}

		if (XCG01064 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01064(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01064(XCG01064);
		}

		if (XCG01065 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01065(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01065(XCG01065);
		}

		if (XCG01066 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01066(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01066(XCG01066);
		}

		if (XCG01067 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01067(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01067(XCG01067);
		}

		if (XCG01068 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01068(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01068(XCG01068);
		}

		if (XCG01069 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01069(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01069(XCG01069);
		}

		if (XCG01070 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01070(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01070(XCG01070);
		}

		if (XCG01072 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01072(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01072(XCG01072);
		}

		if (XCG01073 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01073(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01073(XCG01073);
		}

		if (XCG01074 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01074(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01074(XCG01074);
		}

		if (XCG01075 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01075(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01075(XCG01075);
		}

		if (XCG01076 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01076(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01076(XCG01076);
		}

		if (XCG01077 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01077(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01077(XCG01077);
		}

		if (XCG01078 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01078(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01078(XCG01078);
		}

		if (XCG01079 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01079(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01079(XCG01079);
		}

		if (XCG01080 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01080(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01080(XCG01080);
		}

		if (XCG01081 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01081(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01081(XCG01081);
		}

		if (XCG01082 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01082(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01082(XCG01082);
		}

		if (XCG01083 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01083(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01083(XCG01083);
		}

		if (XCG01084 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01084(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01084(XCG01084);
		}

		if (XCG01085 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01085(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01085(XCG01085);
		}

		if (XCG01086 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01086(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01086(XCG01086);
		}

		if (XCG01087 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01087(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01087(XCG01087);
		}

		if (XCG01088 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01088(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01088(XCG01088);
		}

		if (XCG01089 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01089(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01089(XCG01089);
		}

		if (XCG01090 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01090(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01090(XCG01090);
		}

		if (XCG01091 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01091(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01091(XCG01091);
		}

		if (XCG01092 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01092(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01092(XCG01092);
		}

		if (XCG01093 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01093(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01093(XCG01093);
		}

		if (XCG01094 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01094(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01094(XCG01094);
		}

		if (XCG01095 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01095(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01095(XCG01095);
		}

		if (XCG01096 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01096(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01096(XCG01096);
		}

		if (XCG01097 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01097(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01097(XCG01097);
		}

		if (XCG01098 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01098(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01098(XCG01098);
		}

		if (XCG01099 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01099(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01099(XCG01099);
		}

		if (XCG01100 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01100(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01100(XCG01100);
		}

		if (XCG01101 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01101(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01101(XCG01101);
		}

		if (XCG01102 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01102(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01102(XCG01102);
		}

		if (XCG01103 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01103(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01103(XCG01103);
		}

		if (XCG01104 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01104(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01104(XCG01104);
		}

		if (XCG01105 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01105(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01105(XCG01105);
		}

		if (XCG01106 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01106(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01106(XCG01106);
		}

		if (XCG01107 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01107(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01107(XCG01107);
		}

		if (XCG01108 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01108(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01108(XCG01108);
		}

		if (XCG01109 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01109(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01109(XCG01109);
		}

		if (XCG01110 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01110(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01110(XCG01110);
		}

		if (XCG01111 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01111(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01111(XCG01111);
		}

		if (XCG01112 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01112(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01112(XCG01112);
		}

		if (XCG01113 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01113(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01113(XCG01113);
		}

		if (XCG01114 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01114(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01114(XCG01114);
		}

		if (XCG01115 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01115(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01115(XCG01115);
		}

		if (XCG01116 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01116(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01116(XCG01116);
		}

		if (XCG01117 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01117(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01117(XCG01117);
		}

		if (XCG01118 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01118(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01118(XCG01118);
		}

		if (XCG01119 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01119(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01119(XCG01119);
		}

		if (XCG01120 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01120(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01120(XCG01120);
		}

		if (XCG01121 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01121(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01121(XCG01121);
		}

		if (XCG01122 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01122(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01122(XCG01122);
		}

		if (XCG01123 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01123(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01123(XCG01123);
		}

		if (XCG01124 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01124(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01124(XCG01124);
		}

		if (XCG01125 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01125(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01125(XCG01125);
		}

		if (XCG01126 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01126(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01126(XCG01126);
		}

		if (XCG01127 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01127(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01127(XCG01127);
		}

		if (XCG01128 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01128(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01128(XCG01128);
		}

		if (XCG01129 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01129(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01129(XCG01129);
		}

		if (XCG01130 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01130(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01130(XCG01130);
		}

		if (XCG01131 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01131(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01131(XCG01131);
		}

		if (XCG01132 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01132(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01132(XCG01132);
		}

		if (XCG01133 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01133(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01133(XCG01133);
		}

		if (XCG01134 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01134(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01134(XCG01134);
		}

		if (XCG01135 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01135(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01135(XCG01135);
		}

		if (XCG01136 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01136(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01136(XCG01136);
		}

		if (XCG01137 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01137(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01137(XCG01137);
		}

		if (XCG01138 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01138(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01138(XCG01138);
		}

		if (XCG01139 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01139(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01139(XCG01139);
		}

		if (XCG01140 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01140(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01140(XCG01140);
		}

		if (XCG01141 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01141(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01141(XCG01141);
		}

		if (XCG01142 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01142(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01142(XCG01142);
		}

		if (XCG01143 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01143(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01143(XCG01143);
		}

		if (XCG01144 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01144(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01144(XCG01144);
		}

		if (XCG01145 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01145(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01145(XCG01145);
		}

		if (XCG01146 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01146(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01146(XCG01146);
		}

		if (XCG01147 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01147(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01147(XCG01147);
		}

		if (XCG01148 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01148(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01148(XCG01148);
		}

		if (XCG01149 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01149(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01149(XCG01149);
		}

		if (XCG01150 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01150(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01150(XCG01150);
		}

		if (XCG01151 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01151(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01151(XCG01151);
		}

		if (XCG01152 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01152(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01152(XCG01152);
		}

		if (XCG01153 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01153(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01153(XCG01153);
		}

		if (XCG01154 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01154(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01154(XCG01154);
		}

		if (XCG01155 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01155(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01155(XCG01155);
		}

		if (XCG01156 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01156(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01156(XCG01156);
		}

		if (XCG01157 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01157(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01157(XCG01157);
		}

		if (XCG01158 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01158(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01158(XCG01158);
		}

		if (XCG01159 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01159(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01159(XCG01159);
		}

		if (XCG01160 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01160(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01160(XCG01160);
		}

		if (XCG01161 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01161(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01161(XCG01161);
		}

		if (XCG01162 == null) {
			vrTechnicalSpec_XCGPart1Impl.setXCG01162(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setXCG01162(XCG01162);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCGPart1Impl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCGPart1Impl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XCGPart1Impl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XCGPart1Impl.resetOriginalValues();

		return vrTechnicalSpec_XCGPart1Impl;
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
		loai_dong_co = objectInput.readUTF();
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
		XCG01070 = objectInput.readUTF();
		XCG01072 = objectInput.readUTF();
		XCG01073 = objectInput.readUTF();
		XCG01074 = objectInput.readUTF();
		XCG01075 = objectInput.readUTF();
		XCG01076 = objectInput.readUTF();
		XCG01077 = objectInput.readUTF();
		XCG01078 = objectInput.readUTF();
		XCG01079 = objectInput.readUTF();
		XCG01080 = objectInput.readUTF();
		XCG01081 = objectInput.readUTF();
		XCG01082 = objectInput.readUTF();
		XCG01083 = objectInput.readUTF();
		XCG01084 = objectInput.readUTF();
		XCG01085 = objectInput.readUTF();
		XCG01086 = objectInput.readUTF();
		XCG01087 = objectInput.readUTF();
		XCG01088 = objectInput.readUTF();
		XCG01089 = objectInput.readUTF();
		XCG01090 = objectInput.readUTF();
		XCG01091 = objectInput.readUTF();
		XCG01092 = objectInput.readUTF();
		XCG01093 = objectInput.readUTF();
		XCG01094 = objectInput.readUTF();
		XCG01095 = objectInput.readUTF();
		XCG01096 = objectInput.readUTF();
		XCG01097 = objectInput.readUTF();
		XCG01098 = objectInput.readUTF();
		XCG01099 = objectInput.readUTF();
		XCG01100 = objectInput.readUTF();
		XCG01101 = objectInput.readUTF();
		XCG01102 = objectInput.readUTF();
		XCG01103 = objectInput.readUTF();
		XCG01104 = objectInput.readUTF();
		XCG01105 = objectInput.readUTF();
		XCG01106 = objectInput.readUTF();
		XCG01107 = objectInput.readUTF();
		XCG01108 = objectInput.readUTF();
		XCG01109 = objectInput.readUTF();
		XCG01110 = objectInput.readUTF();
		XCG01111 = objectInput.readUTF();
		XCG01112 = objectInput.readUTF();
		XCG01113 = objectInput.readUTF();
		XCG01114 = objectInput.readUTF();
		XCG01115 = objectInput.readUTF();
		XCG01116 = objectInput.readUTF();
		XCG01117 = objectInput.readUTF();
		XCG01118 = objectInput.readUTF();
		XCG01119 = objectInput.readUTF();
		XCG01120 = objectInput.readUTF();
		XCG01121 = objectInput.readUTF();
		XCG01122 = objectInput.readUTF();
		XCG01123 = objectInput.readUTF();
		XCG01124 = objectInput.readUTF();
		XCG01125 = objectInput.readUTF();
		XCG01126 = objectInput.readUTF();
		XCG01127 = objectInput.readUTF();
		XCG01128 = objectInput.readUTF();
		XCG01129 = objectInput.readUTF();
		XCG01130 = objectInput.readUTF();
		XCG01131 = objectInput.readUTF();
		XCG01132 = objectInput.readUTF();
		XCG01133 = objectInput.readUTF();
		XCG01134 = objectInput.readUTF();
		XCG01135 = objectInput.readUTF();
		XCG01136 = objectInput.readUTF();
		XCG01137 = objectInput.readUTF();
		XCG01138 = objectInput.readUTF();
		XCG01139 = objectInput.readUTF();
		XCG01140 = objectInput.readUTF();
		XCG01141 = objectInput.readUTF();
		XCG01142 = objectInput.readUTF();
		XCG01143 = objectInput.readUTF();
		XCG01144 = objectInput.readUTF();
		XCG01145 = objectInput.readUTF();
		XCG01146 = objectInput.readUTF();
		XCG01147 = objectInput.readUTF();
		XCG01148 = objectInput.readUTF();
		XCG01149 = objectInput.readUTF();
		XCG01150 = objectInput.readUTF();
		XCG01151 = objectInput.readUTF();
		XCG01152 = objectInput.readUTF();
		XCG01153 = objectInput.readUTF();
		XCG01154 = objectInput.readUTF();
		XCG01155 = objectInput.readUTF();
		XCG01156 = objectInput.readUTF();
		XCG01157 = objectInput.readUTF();
		XCG01158 = objectInput.readUTF();
		XCG01159 = objectInput.readUTF();
		XCG01160 = objectInput.readUTF();
		XCG01161 = objectInput.readUTF();
		XCG01162 = objectInput.readUTF();
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

		if (loai_dong_co == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loai_dong_co);
		}

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

		if (XCG01070 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01070);
		}

		if (XCG01072 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01072);
		}

		if (XCG01073 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01073);
		}

		if (XCG01074 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01074);
		}

		if (XCG01075 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01075);
		}

		if (XCG01076 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01076);
		}

		if (XCG01077 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01077);
		}

		if (XCG01078 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01078);
		}

		if (XCG01079 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01079);
		}

		if (XCG01080 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01080);
		}

		if (XCG01081 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01081);
		}

		if (XCG01082 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01082);
		}

		if (XCG01083 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01083);
		}

		if (XCG01084 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01084);
		}

		if (XCG01085 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01085);
		}

		if (XCG01086 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01086);
		}

		if (XCG01087 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01087);
		}

		if (XCG01088 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01088);
		}

		if (XCG01089 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01089);
		}

		if (XCG01090 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01090);
		}

		if (XCG01091 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01091);
		}

		if (XCG01092 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01092);
		}

		if (XCG01093 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01093);
		}

		if (XCG01094 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01094);
		}

		if (XCG01095 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01095);
		}

		if (XCG01096 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01096);
		}

		if (XCG01097 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01097);
		}

		if (XCG01098 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01098);
		}

		if (XCG01099 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01099);
		}

		if (XCG01100 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01100);
		}

		if (XCG01101 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01101);
		}

		if (XCG01102 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01102);
		}

		if (XCG01103 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01103);
		}

		if (XCG01104 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01104);
		}

		if (XCG01105 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01105);
		}

		if (XCG01106 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01106);
		}

		if (XCG01107 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01107);
		}

		if (XCG01108 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01108);
		}

		if (XCG01109 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01109);
		}

		if (XCG01110 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01110);
		}

		if (XCG01111 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01111);
		}

		if (XCG01112 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01112);
		}

		if (XCG01113 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01113);
		}

		if (XCG01114 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01114);
		}

		if (XCG01115 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01115);
		}

		if (XCG01116 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01116);
		}

		if (XCG01117 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01117);
		}

		if (XCG01118 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01118);
		}

		if (XCG01119 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01119);
		}

		if (XCG01120 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01120);
		}

		if (XCG01121 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01121);
		}

		if (XCG01122 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01122);
		}

		if (XCG01123 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01123);
		}

		if (XCG01124 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01124);
		}

		if (XCG01125 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01125);
		}

		if (XCG01126 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01126);
		}

		if (XCG01127 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01127);
		}

		if (XCG01128 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01128);
		}

		if (XCG01129 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01129);
		}

		if (XCG01130 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01130);
		}

		if (XCG01131 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01131);
		}

		if (XCG01132 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01132);
		}

		if (XCG01133 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01133);
		}

		if (XCG01134 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01134);
		}

		if (XCG01135 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01135);
		}

		if (XCG01136 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01136);
		}

		if (XCG01137 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01137);
		}

		if (XCG01138 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01138);
		}

		if (XCG01139 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01139);
		}

		if (XCG01140 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01140);
		}

		if (XCG01141 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01141);
		}

		if (XCG01142 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01142);
		}

		if (XCG01143 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01143);
		}

		if (XCG01144 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01144);
		}

		if (XCG01145 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01145);
		}

		if (XCG01146 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01146);
		}

		if (XCG01147 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01147);
		}

		if (XCG01148 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01148);
		}

		if (XCG01149 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01149);
		}

		if (XCG01150 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01150);
		}

		if (XCG01151 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01151);
		}

		if (XCG01152 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01152);
		}

		if (XCG01153 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01153);
		}

		if (XCG01154 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01154);
		}

		if (XCG01155 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01155);
		}

		if (XCG01156 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01156);
		}

		if (XCG01157 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01157);
		}

		if (XCG01158 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01158);
		}

		if (XCG01159 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01159);
		}

		if (XCG01160 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01160);
		}

		if (XCG01161 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01161);
		}

		if (XCG01162 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01162);
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
	public String loai_dong_co;
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
	public String XCG01070;
	public String XCG01072;
	public String XCG01073;
	public String XCG01074;
	public String XCG01075;
	public String XCG01076;
	public String XCG01077;
	public String XCG01078;
	public String XCG01079;
	public String XCG01080;
	public String XCG01081;
	public String XCG01082;
	public String XCG01083;
	public String XCG01084;
	public String XCG01085;
	public String XCG01086;
	public String XCG01087;
	public String XCG01088;
	public String XCG01089;
	public String XCG01090;
	public String XCG01091;
	public String XCG01092;
	public String XCG01093;
	public String XCG01094;
	public String XCG01095;
	public String XCG01096;
	public String XCG01097;
	public String XCG01098;
	public String XCG01099;
	public String XCG01100;
	public String XCG01101;
	public String XCG01102;
	public String XCG01103;
	public String XCG01104;
	public String XCG01105;
	public String XCG01106;
	public String XCG01107;
	public String XCG01108;
	public String XCG01109;
	public String XCG01110;
	public String XCG01111;
	public String XCG01112;
	public String XCG01113;
	public String XCG01114;
	public String XCG01115;
	public String XCG01116;
	public String XCG01117;
	public String XCG01118;
	public String XCG01119;
	public String XCG01120;
	public String XCG01121;
	public String XCG01122;
	public String XCG01123;
	public String XCG01124;
	public String XCG01125;
	public String XCG01126;
	public String XCG01127;
	public String XCG01128;
	public String XCG01129;
	public String XCG01130;
	public String XCG01131;
	public String XCG01132;
	public String XCG01133;
	public String XCG01134;
	public String XCG01135;
	public String XCG01136;
	public String XCG01137;
	public String XCG01138;
	public String XCG01139;
	public String XCG01140;
	public String XCG01141;
	public String XCG01142;
	public String XCG01143;
	public String XCG01144;
	public String XCG01145;
	public String XCG01146;
	public String XCG01147;
	public String XCG01148;
	public String XCG01149;
	public String XCG01150;
	public String XCG01151;
	public String XCG01152;
	public String XCG01153;
	public String XCG01154;
	public String XCG01155;
	public String XCG01156;
	public String XCG01157;
	public String XCG01158;
	public String XCG01159;
	public String XCG01160;
	public String XCG01161;
	public String XCG01162;
	public long modifyDate;
	public long syncDate;
}