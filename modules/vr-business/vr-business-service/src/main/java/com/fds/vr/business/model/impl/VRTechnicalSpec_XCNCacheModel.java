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

import com.fds.vr.business.model.VRTechnicalSpec_XCN;

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
 * The cache model class for representing VRTechnicalSpec_XCN in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCN
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCNCacheModel implements CacheModel<VRTechnicalSpec_XCN>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCNCacheModel)) {
			return false;
		}

		VRTechnicalSpec_XCNCacheModel vrTechnicalSpec_XCNCacheModel = (VRTechnicalSpec_XCNCacheModel)obj;

		if (id == vrTechnicalSpec_XCNCacheModel.id) {
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
		StringBundler sb = new StringBundler(323);

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
		sb.append(", XCN01001=");
		sb.append(XCN01001);
		sb.append(", XCN01002=");
		sb.append(XCN01002);
		sb.append(", XCN01003=");
		sb.append(XCN01003);
		sb.append(", XCN01004=");
		sb.append(XCN01004);
		sb.append(", XCN01005=");
		sb.append(XCN01005);
		sb.append(", XCN01006=");
		sb.append(XCN01006);
		sb.append(", XCN01007=");
		sb.append(XCN01007);
		sb.append(", XCN01008=");
		sb.append(XCN01008);
		sb.append(", XCN01009=");
		sb.append(XCN01009);
		sb.append(", XCN01010=");
		sb.append(XCN01010);
		sb.append(", XCN01011=");
		sb.append(XCN01011);
		sb.append(", XCN01012=");
		sb.append(XCN01012);
		sb.append(", XCN01013=");
		sb.append(XCN01013);
		sb.append(", XCN01014=");
		sb.append(XCN01014);
		sb.append(", XCN01016=");
		sb.append(XCN01016);
		sb.append(", XCN01017=");
		sb.append(XCN01017);
		sb.append(", XCN01019=");
		sb.append(XCN01019);
		sb.append(", XCN01020=");
		sb.append(XCN01020);
		sb.append(", XCN01021=");
		sb.append(XCN01021);
		sb.append(", XCN01022=");
		sb.append(XCN01022);
		sb.append(", XCN01024=");
		sb.append(XCN01024);
		sb.append(", XCN01025=");
		sb.append(XCN01025);
		sb.append(", XCN01026=");
		sb.append(XCN01026);
		sb.append(", XCN01027=");
		sb.append(XCN01027);
		sb.append(", XCN01028=");
		sb.append(XCN01028);
		sb.append(", XCN01030=");
		sb.append(XCN01030);
		sb.append(", XCN01031=");
		sb.append(XCN01031);
		sb.append(", XCN01032=");
		sb.append(XCN01032);
		sb.append(", XCN01033=");
		sb.append(XCN01033);
		sb.append(", XCN01034=");
		sb.append(XCN01034);
		sb.append(", XCN01035=");
		sb.append(XCN01035);
		sb.append(", XCN01036=");
		sb.append(XCN01036);
		sb.append(", XCN01037=");
		sb.append(XCN01037);
		sb.append(", XCN01038=");
		sb.append(XCN01038);
		sb.append(", XCN01039=");
		sb.append(XCN01039);
		sb.append(", XCN01040=");
		sb.append(XCN01040);
		sb.append(", XCN01041=");
		sb.append(XCN01041);
		sb.append(", XCN01042=");
		sb.append(XCN01042);
		sb.append(", XCN01043=");
		sb.append(XCN01043);
		sb.append(", XCN01044=");
		sb.append(XCN01044);
		sb.append(", XCN01045=");
		sb.append(XCN01045);
		sb.append(", XCN01046=");
		sb.append(XCN01046);
		sb.append(", XCN01047=");
		sb.append(XCN01047);
		sb.append(", XCN01049=");
		sb.append(XCN01049);
		sb.append(", XCN01050=");
		sb.append(XCN01050);
		sb.append(", XCN01051=");
		sb.append(XCN01051);
		sb.append(", XCN01052=");
		sb.append(XCN01052);
		sb.append(", XCN01053=");
		sb.append(XCN01053);
		sb.append(", XCN01054=");
		sb.append(XCN01054);
		sb.append(", XCN01055=");
		sb.append(XCN01055);
		sb.append(", XCN01056=");
		sb.append(XCN01056);
		sb.append(", XCN01057=");
		sb.append(XCN01057);
		sb.append(", XCN01058=");
		sb.append(XCN01058);
		sb.append(", XCN01059=");
		sb.append(XCN01059);
		sb.append(", XCN01060=");
		sb.append(XCN01060);
		sb.append(", XCN01062=");
		sb.append(XCN01062);
		sb.append(", XCN01063=");
		sb.append(XCN01063);
		sb.append(", XCN01064=");
		sb.append(XCN01064);
		sb.append(", XCN01065=");
		sb.append(XCN01065);
		sb.append(", XCN01066=");
		sb.append(XCN01066);
		sb.append(", XCN01067=");
		sb.append(XCN01067);
		sb.append(", XCN01068=");
		sb.append(XCN01068);
		sb.append(", XCN01069=");
		sb.append(XCN01069);
		sb.append(", XCN01100=");
		sb.append(XCN01100);
		sb.append(", XCN01101=");
		sb.append(XCN01101);
		sb.append(", XCN01102=");
		sb.append(XCN01102);
		sb.append(", XCN01103=");
		sb.append(XCN01103);
		sb.append(", XCN01104=");
		sb.append(XCN01104);
		sb.append(", XCN01105=");
		sb.append(XCN01105);
		sb.append(", XCN01106=");
		sb.append(XCN01106);
		sb.append(", XCN01107=");
		sb.append(XCN01107);
		sb.append(", XCN01108=");
		sb.append(XCN01108);
		sb.append(", XCN01109=");
		sb.append(XCN01109);
		sb.append(", XCN01110=");
		sb.append(XCN01110);
		sb.append(", XCN01111=");
		sb.append(XCN01111);
		sb.append(", XCN01112=");
		sb.append(XCN01112);
		sb.append(", XCN01113=");
		sb.append(XCN01113);
		sb.append(", XCN01114=");
		sb.append(XCN01114);
		sb.append(", XCN01115=");
		sb.append(XCN01115);
		sb.append(", XCN01116=");
		sb.append(XCN01116);
		sb.append(", XCN01117=");
		sb.append(XCN01117);
		sb.append(", XCN01118=");
		sb.append(XCN01118);
		sb.append(", XCN01119=");
		sb.append(XCN01119);
		sb.append(", XCN01120=");
		sb.append(XCN01120);
		sb.append(", XCN01121=");
		sb.append(XCN01121);
		sb.append(", XCN01122=");
		sb.append(XCN01122);
		sb.append(", XCN01123=");
		sb.append(XCN01123);
		sb.append(", XCN01124=");
		sb.append(XCN01124);
		sb.append(", XCN01125=");
		sb.append(XCN01125);
		sb.append(", XCN01126=");
		sb.append(XCN01126);
		sb.append(", XCN01127=");
		sb.append(XCN01127);
		sb.append(", XCN01128=");
		sb.append(XCN01128);
		sb.append(", XCN01129=");
		sb.append(XCN01129);
		sb.append(", XCN01130=");
		sb.append(XCN01130);
		sb.append(", XCN01131=");
		sb.append(XCN01131);
		sb.append(", XCN01132=");
		sb.append(XCN01132);
		sb.append(", XCN01133=");
		sb.append(XCN01133);
		sb.append(", XCN01134=");
		sb.append(XCN01134);
		sb.append(", XCN01135=");
		sb.append(XCN01135);
		sb.append(", XCN01136=");
		sb.append(XCN01136);
		sb.append(", XCN01137=");
		sb.append(XCN01137);
		sb.append(", XCN01138=");
		sb.append(XCN01138);
		sb.append(", XCN01139=");
		sb.append(XCN01139);
		sb.append(", XCN01140=");
		sb.append(XCN01140);
		sb.append(", XCN01141=");
		sb.append(XCN01141);
		sb.append(", XCN01142=");
		sb.append(XCN01142);
		sb.append(", XCN01143=");
		sb.append(XCN01143);
		sb.append(", XCN01144=");
		sb.append(XCN01144);
		sb.append(", XCN01145=");
		sb.append(XCN01145);
		sb.append(", XCN01146=");
		sb.append(XCN01146);
		sb.append(", XCN01147=");
		sb.append(XCN01147);
		sb.append(", XCN01148=");
		sb.append(XCN01148);
		sb.append(", XCN01149=");
		sb.append(XCN01149);
		sb.append(", XCN01150=");
		sb.append(XCN01150);
		sb.append(", XCN01151=");
		sb.append(XCN01151);
		sb.append(", XCN01152=");
		sb.append(XCN01152);
		sb.append(", XCN01153=");
		sb.append(XCN01153);
		sb.append(", XCN01154=");
		sb.append(XCN01154);
		sb.append(", XCN01155=");
		sb.append(XCN01155);
		sb.append(", XCN01156=");
		sb.append(XCN01156);
		sb.append(", XCN01157=");
		sb.append(XCN01157);
		sb.append(", XCN01158=");
		sb.append(XCN01158);
		sb.append(", XCN01159=");
		sb.append(XCN01159);
		sb.append(", XCN01160=");
		sb.append(XCN01160);
		sb.append(", XCN01161=");
		sb.append(XCN01161);
		sb.append(", XCN01162=");
		sb.append(XCN01162);
		sb.append(", XCN01163=");
		sb.append(XCN01163);
		sb.append(", XCN01164=");
		sb.append(XCN01164);
		sb.append(", XCN01165=");
		sb.append(XCN01165);
		sb.append(", XCN01166=");
		sb.append(XCN01166);
		sb.append(", XCN01167=");
		sb.append(XCN01167);
		sb.append(", XCN01168=");
		sb.append(XCN01168);
		sb.append(", XCN01169=");
		sb.append(XCN01169);
		sb.append(", XCN01170=");
		sb.append(XCN01170);
		sb.append(", XCN01171=");
		sb.append(XCN01171);
		sb.append(", XCN01172=");
		sb.append(XCN01172);
		sb.append(", XCN01173=");
		sb.append(XCN01173);
		sb.append(", XCN01174=");
		sb.append(XCN01174);
		sb.append(", XCN01175=");
		sb.append(XCN01175);
		sb.append(", XCN01176=");
		sb.append(XCN01176);
		sb.append(", XCN01177=");
		sb.append(XCN01177);
		sb.append(", XCN01178=");
		sb.append(XCN01178);
		sb.append(", XCN01179=");
		sb.append(XCN01179);
		sb.append(", XCN01180=");
		sb.append(XCN01180);
		sb.append(", XCN01181=");
		sb.append(XCN01181);
		sb.append(", XCN01182=");
		sb.append(XCN01182);
		sb.append(", XCN01183=");
		sb.append(XCN01183);
		sb.append(", XCN01184=");
		sb.append(XCN01184);
		sb.append(", XCN01185=");
		sb.append(XCN01185);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XCN toEntityModel() {
		VRTechnicalSpec_XCNImpl vrTechnicalSpec_XCNImpl = new VRTechnicalSpec_XCNImpl();

		vrTechnicalSpec_XCNImpl.setId(id);
		vrTechnicalSpec_XCNImpl.setMtCore(mtCore);
		vrTechnicalSpec_XCNImpl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XCNImpl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XCNImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XCNImpl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XCNImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XCNImpl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XCNImpl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (loai_dong_co == null) {
			vrTechnicalSpec_XCNImpl.setLoai_dong_co(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setLoai_dong_co(loai_dong_co);
		}

		if (XCN01001 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01001(XCN01001);
		}

		if (XCN01002 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01002(XCN01002);
		}

		if (XCN01003 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01003(XCN01003);
		}

		if (XCN01004 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01004(XCN01004);
		}

		if (XCN01005 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01005(XCN01005);
		}

		if (XCN01006 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01006(XCN01006);
		}

		if (XCN01007 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01007(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01007(XCN01007);
		}

		if (XCN01008 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01008(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01008(XCN01008);
		}

		if (XCN01009 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01009(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01009(XCN01009);
		}

		if (XCN01010 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01010(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01010(XCN01010);
		}

		if (XCN01011 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01011(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01011(XCN01011);
		}

		if (XCN01012 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01012(XCN01012);
		}

		if (XCN01013 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01013(XCN01013);
		}

		if (XCN01014 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01014(XCN01014);
		}

		if (XCN01016 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01016(XCN01016);
		}

		if (XCN01017 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01017(XCN01017);
		}

		if (XCN01019 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01019(XCN01019);
		}

		if (XCN01020 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01020(XCN01020);
		}

		if (XCN01021 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01021(XCN01021);
		}

		if (XCN01022 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01022(XCN01022);
		}

		if (XCN01024 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01024(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01024(XCN01024);
		}

		if (XCN01025 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01025(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01025(XCN01025);
		}

		if (XCN01026 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01026(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01026(XCN01026);
		}

		if (XCN01027 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01027(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01027(XCN01027);
		}

		if (XCN01028 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01028(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01028(XCN01028);
		}

		if (XCN01030 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01030(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01030(XCN01030);
		}

		if (XCN01031 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01031(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01031(XCN01031);
		}

		if (XCN01032 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01032(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01032(XCN01032);
		}

		if (XCN01033 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01033(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01033(XCN01033);
		}

		if (XCN01034 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01034(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01034(XCN01034);
		}

		if (XCN01035 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01035(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01035(XCN01035);
		}

		if (XCN01036 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01036(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01036(XCN01036);
		}

		if (XCN01037 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01037(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01037(XCN01037);
		}

		if (XCN01038 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01038(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01038(XCN01038);
		}

		if (XCN01039 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01039(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01039(XCN01039);
		}

		if (XCN01040 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01040(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01040(XCN01040);
		}

		if (XCN01041 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01041(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01041(XCN01041);
		}

		if (XCN01042 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01042(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01042(XCN01042);
		}

		if (XCN01043 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01043(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01043(XCN01043);
		}

		if (XCN01044 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01044(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01044(XCN01044);
		}

		if (XCN01045 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01045(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01045(XCN01045);
		}

		if (XCN01046 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01046(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01046(XCN01046);
		}

		if (XCN01047 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01047(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01047(XCN01047);
		}

		if (XCN01049 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01049(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01049(XCN01049);
		}

		if (XCN01050 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01050(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01050(XCN01050);
		}

		if (XCN01051 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01051(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01051(XCN01051);
		}

		if (XCN01052 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01052(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01052(XCN01052);
		}

		if (XCN01053 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01053(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01053(XCN01053);
		}

		if (XCN01054 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01054(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01054(XCN01054);
		}

		if (XCN01055 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01055(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01055(XCN01055);
		}

		if (XCN01056 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01056(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01056(XCN01056);
		}

		if (XCN01057 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01057(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01057(XCN01057);
		}

		if (XCN01058 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01058(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01058(XCN01058);
		}

		if (XCN01059 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01059(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01059(XCN01059);
		}

		if (XCN01060 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01060(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01060(XCN01060);
		}

		if (XCN01062 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01062(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01062(XCN01062);
		}

		if (XCN01063 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01063(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01063(XCN01063);
		}

		if (XCN01064 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01064(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01064(XCN01064);
		}

		if (XCN01065 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01065(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01065(XCN01065);
		}

		if (XCN01066 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01066(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01066(XCN01066);
		}

		if (XCN01067 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01067(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01067(XCN01067);
		}

		if (XCN01068 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01068(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01068(XCN01068);
		}

		if (XCN01069 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01069(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01069(XCN01069);
		}

		if (XCN01100 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01100(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01100(XCN01100);
		}

		if (XCN01101 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01101(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01101(XCN01101);
		}

		if (XCN01102 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01102(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01102(XCN01102);
		}

		if (XCN01103 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01103(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01103(XCN01103);
		}

		if (XCN01104 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01104(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01104(XCN01104);
		}

		if (XCN01105 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01105(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01105(XCN01105);
		}

		if (XCN01106 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01106(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01106(XCN01106);
		}

		if (XCN01107 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01107(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01107(XCN01107);
		}

		if (XCN01108 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01108(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01108(XCN01108);
		}

		if (XCN01109 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01109(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01109(XCN01109);
		}

		if (XCN01110 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01110(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01110(XCN01110);
		}

		if (XCN01111 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01111(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01111(XCN01111);
		}

		if (XCN01112 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01112(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01112(XCN01112);
		}

		if (XCN01113 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01113(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01113(XCN01113);
		}

		if (XCN01114 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01114(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01114(XCN01114);
		}

		if (XCN01115 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01115(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01115(XCN01115);
		}

		if (XCN01116 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01116(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01116(XCN01116);
		}

		if (XCN01117 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01117(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01117(XCN01117);
		}

		if (XCN01118 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01118(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01118(XCN01118);
		}

		if (XCN01119 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01119(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01119(XCN01119);
		}

		if (XCN01120 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01120(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01120(XCN01120);
		}

		if (XCN01121 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01121(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01121(XCN01121);
		}

		if (XCN01122 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01122(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01122(XCN01122);
		}

		if (XCN01123 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01123(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01123(XCN01123);
		}

		if (XCN01124 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01124(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01124(XCN01124);
		}

		if (XCN01125 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01125(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01125(XCN01125);
		}

		if (XCN01126 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01126(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01126(XCN01126);
		}

		if (XCN01127 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01127(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01127(XCN01127);
		}

		if (XCN01128 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01128(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01128(XCN01128);
		}

		if (XCN01129 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01129(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01129(XCN01129);
		}

		if (XCN01130 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01130(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01130(XCN01130);
		}

		if (XCN01131 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01131(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01131(XCN01131);
		}

		if (XCN01132 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01132(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01132(XCN01132);
		}

		if (XCN01133 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01133(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01133(XCN01133);
		}

		if (XCN01134 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01134(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01134(XCN01134);
		}

		if (XCN01135 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01135(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01135(XCN01135);
		}

		if (XCN01136 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01136(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01136(XCN01136);
		}

		if (XCN01137 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01137(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01137(XCN01137);
		}

		if (XCN01138 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01138(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01138(XCN01138);
		}

		if (XCN01139 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01139(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01139(XCN01139);
		}

		if (XCN01140 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01140(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01140(XCN01140);
		}

		if (XCN01141 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01141(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01141(XCN01141);
		}

		if (XCN01142 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01142(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01142(XCN01142);
		}

		if (XCN01143 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01143(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01143(XCN01143);
		}

		if (XCN01144 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01144(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01144(XCN01144);
		}

		if (XCN01145 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01145(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01145(XCN01145);
		}

		if (XCN01146 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01146(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01146(XCN01146);
		}

		if (XCN01147 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01147(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01147(XCN01147);
		}

		if (XCN01148 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01148(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01148(XCN01148);
		}

		if (XCN01149 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01149(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01149(XCN01149);
		}

		if (XCN01150 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01150(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01150(XCN01150);
		}

		if (XCN01151 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01151(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01151(XCN01151);
		}

		if (XCN01152 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01152(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01152(XCN01152);
		}

		if (XCN01153 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01153(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01153(XCN01153);
		}

		if (XCN01154 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01154(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01154(XCN01154);
		}

		if (XCN01155 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01155(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01155(XCN01155);
		}

		if (XCN01156 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01156(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01156(XCN01156);
		}

		if (XCN01157 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01157(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01157(XCN01157);
		}

		if (XCN01158 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01158(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01158(XCN01158);
		}

		if (XCN01159 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01159(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01159(XCN01159);
		}

		if (XCN01160 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01160(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01160(XCN01160);
		}

		if (XCN01161 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01161(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01161(XCN01161);
		}

		if (XCN01162 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01162(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01162(XCN01162);
		}

		if (XCN01163 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01163(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01163(XCN01163);
		}

		if (XCN01164 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01164(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01164(XCN01164);
		}

		if (XCN01165 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01165(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01165(XCN01165);
		}

		if (XCN01166 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01166(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01166(XCN01166);
		}

		if (XCN01167 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01167(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01167(XCN01167);
		}

		if (XCN01168 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01168(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01168(XCN01168);
		}

		if (XCN01169 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01169(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01169(XCN01169);
		}

		if (XCN01170 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01170(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01170(XCN01170);
		}

		if (XCN01171 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01171(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01171(XCN01171);
		}

		if (XCN01172 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01172(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01172(XCN01172);
		}

		if (XCN01173 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01173(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01173(XCN01173);
		}

		if (XCN01174 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01174(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01174(XCN01174);
		}

		if (XCN01175 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01175(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01175(XCN01175);
		}

		if (XCN01176 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01176(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01176(XCN01176);
		}

		if (XCN01177 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01177(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01177(XCN01177);
		}

		if (XCN01178 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01178(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01178(XCN01178);
		}

		if (XCN01179 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01179(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01179(XCN01179);
		}

		if (XCN01180 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01180(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01180(XCN01180);
		}

		if (XCN01181 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01181(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01181(XCN01181);
		}

		if (XCN01182 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01182(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01182(XCN01182);
		}

		if (XCN01183 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01183(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01183(XCN01183);
		}

		if (XCN01184 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01184(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01184(XCN01184);
		}

		if (XCN01185 == null) {
			vrTechnicalSpec_XCNImpl.setXCN01185(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCNImpl.setXCN01185(XCN01185);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCNImpl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XCNImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCNImpl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XCNImpl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XCNImpl.resetOriginalValues();

		return vrTechnicalSpec_XCNImpl;
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
		XCN01001 = objectInput.readUTF();
		XCN01002 = objectInput.readUTF();
		XCN01003 = objectInput.readUTF();
		XCN01004 = objectInput.readUTF();
		XCN01005 = objectInput.readUTF();
		XCN01006 = objectInput.readUTF();
		XCN01007 = objectInput.readUTF();
		XCN01008 = objectInput.readUTF();
		XCN01009 = objectInput.readUTF();
		XCN01010 = objectInput.readUTF();
		XCN01011 = objectInput.readUTF();
		XCN01012 = objectInput.readUTF();
		XCN01013 = objectInput.readUTF();
		XCN01014 = objectInput.readUTF();
		XCN01016 = objectInput.readUTF();
		XCN01017 = objectInput.readUTF();
		XCN01019 = objectInput.readUTF();
		XCN01020 = objectInput.readUTF();
		XCN01021 = objectInput.readUTF();
		XCN01022 = objectInput.readUTF();
		XCN01024 = objectInput.readUTF();
		XCN01025 = objectInput.readUTF();
		XCN01026 = objectInput.readUTF();
		XCN01027 = objectInput.readUTF();
		XCN01028 = objectInput.readUTF();
		XCN01030 = objectInput.readUTF();
		XCN01031 = objectInput.readUTF();
		XCN01032 = objectInput.readUTF();
		XCN01033 = objectInput.readUTF();
		XCN01034 = objectInput.readUTF();
		XCN01035 = objectInput.readUTF();
		XCN01036 = objectInput.readUTF();
		XCN01037 = objectInput.readUTF();
		XCN01038 = objectInput.readUTF();
		XCN01039 = objectInput.readUTF();
		XCN01040 = objectInput.readUTF();
		XCN01041 = objectInput.readUTF();
		XCN01042 = objectInput.readUTF();
		XCN01043 = objectInput.readUTF();
		XCN01044 = objectInput.readUTF();
		XCN01045 = objectInput.readUTF();
		XCN01046 = objectInput.readUTF();
		XCN01047 = objectInput.readUTF();
		XCN01049 = objectInput.readUTF();
		XCN01050 = objectInput.readUTF();
		XCN01051 = objectInput.readUTF();
		XCN01052 = objectInput.readUTF();
		XCN01053 = objectInput.readUTF();
		XCN01054 = objectInput.readUTF();
		XCN01055 = objectInput.readUTF();
		XCN01056 = objectInput.readUTF();
		XCN01057 = objectInput.readUTF();
		XCN01058 = objectInput.readUTF();
		XCN01059 = objectInput.readUTF();
		XCN01060 = objectInput.readUTF();
		XCN01062 = objectInput.readUTF();
		XCN01063 = objectInput.readUTF();
		XCN01064 = objectInput.readUTF();
		XCN01065 = objectInput.readUTF();
		XCN01066 = objectInput.readUTF();
		XCN01067 = objectInput.readUTF();
		XCN01068 = objectInput.readUTF();
		XCN01069 = objectInput.readUTF();
		XCN01100 = objectInput.readUTF();
		XCN01101 = objectInput.readUTF();
		XCN01102 = objectInput.readUTF();
		XCN01103 = objectInput.readUTF();
		XCN01104 = objectInput.readUTF();
		XCN01105 = objectInput.readUTF();
		XCN01106 = objectInput.readUTF();
		XCN01107 = objectInput.readUTF();
		XCN01108 = objectInput.readUTF();
		XCN01109 = objectInput.readUTF();
		XCN01110 = objectInput.readUTF();
		XCN01111 = objectInput.readUTF();
		XCN01112 = objectInput.readUTF();
		XCN01113 = objectInput.readUTF();
		XCN01114 = objectInput.readUTF();
		XCN01115 = objectInput.readUTF();
		XCN01116 = objectInput.readUTF();
		XCN01117 = objectInput.readUTF();
		XCN01118 = objectInput.readUTF();
		XCN01119 = objectInput.readUTF();
		XCN01120 = objectInput.readUTF();
		XCN01121 = objectInput.readUTF();
		XCN01122 = objectInput.readUTF();
		XCN01123 = objectInput.readUTF();
		XCN01124 = objectInput.readUTF();
		XCN01125 = objectInput.readUTF();
		XCN01126 = objectInput.readUTF();
		XCN01127 = objectInput.readUTF();
		XCN01128 = objectInput.readUTF();
		XCN01129 = objectInput.readUTF();
		XCN01130 = objectInput.readUTF();
		XCN01131 = objectInput.readUTF();
		XCN01132 = objectInput.readUTF();
		XCN01133 = objectInput.readUTF();
		XCN01134 = objectInput.readUTF();
		XCN01135 = objectInput.readUTF();
		XCN01136 = objectInput.readUTF();
		XCN01137 = objectInput.readUTF();
		XCN01138 = objectInput.readUTF();
		XCN01139 = objectInput.readUTF();
		XCN01140 = objectInput.readUTF();
		XCN01141 = objectInput.readUTF();
		XCN01142 = objectInput.readUTF();
		XCN01143 = objectInput.readUTF();
		XCN01144 = objectInput.readUTF();
		XCN01145 = objectInput.readUTF();
		XCN01146 = objectInput.readUTF();
		XCN01147 = objectInput.readUTF();
		XCN01148 = objectInput.readUTF();
		XCN01149 = objectInput.readUTF();
		XCN01150 = objectInput.readUTF();
		XCN01151 = objectInput.readUTF();
		XCN01152 = objectInput.readUTF();
		XCN01153 = objectInput.readUTF();
		XCN01154 = objectInput.readUTF();
		XCN01155 = objectInput.readUTF();
		XCN01156 = objectInput.readUTF();
		XCN01157 = objectInput.readUTF();
		XCN01158 = objectInput.readUTF();
		XCN01159 = objectInput.readUTF();
		XCN01160 = objectInput.readUTF();
		XCN01161 = objectInput.readUTF();
		XCN01162 = objectInput.readUTF();
		XCN01163 = objectInput.readUTF();
		XCN01164 = objectInput.readUTF();
		XCN01165 = objectInput.readUTF();
		XCN01166 = objectInput.readUTF();
		XCN01167 = objectInput.readUTF();
		XCN01168 = objectInput.readUTF();
		XCN01169 = objectInput.readUTF();
		XCN01170 = objectInput.readUTF();
		XCN01171 = objectInput.readUTF();
		XCN01172 = objectInput.readUTF();
		XCN01173 = objectInput.readUTF();
		XCN01174 = objectInput.readUTF();
		XCN01175 = objectInput.readUTF();
		XCN01176 = objectInput.readUTF();
		XCN01177 = objectInput.readUTF();
		XCN01178 = objectInput.readUTF();
		XCN01179 = objectInput.readUTF();
		XCN01180 = objectInput.readUTF();
		XCN01181 = objectInput.readUTF();
		XCN01182 = objectInput.readUTF();
		XCN01183 = objectInput.readUTF();
		XCN01184 = objectInput.readUTF();
		XCN01185 = objectInput.readUTF();
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

		if (XCN01001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01001);
		}

		if (XCN01002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01002);
		}

		if (XCN01003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01003);
		}

		if (XCN01004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01004);
		}

		if (XCN01005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01005);
		}

		if (XCN01006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01006);
		}

		if (XCN01007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01007);
		}

		if (XCN01008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01008);
		}

		if (XCN01009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01009);
		}

		if (XCN01010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01010);
		}

		if (XCN01011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01011);
		}

		if (XCN01012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01012);
		}

		if (XCN01013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01013);
		}

		if (XCN01014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01014);
		}

		if (XCN01016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01016);
		}

		if (XCN01017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01017);
		}

		if (XCN01019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01019);
		}

		if (XCN01020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01020);
		}

		if (XCN01021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01021);
		}

		if (XCN01022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01022);
		}

		if (XCN01024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01024);
		}

		if (XCN01025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01025);
		}

		if (XCN01026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01026);
		}

		if (XCN01027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01027);
		}

		if (XCN01028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01028);
		}

		if (XCN01030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01030);
		}

		if (XCN01031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01031);
		}

		if (XCN01032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01032);
		}

		if (XCN01033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01033);
		}

		if (XCN01034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01034);
		}

		if (XCN01035 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01035);
		}

		if (XCN01036 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01036);
		}

		if (XCN01037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01037);
		}

		if (XCN01038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01038);
		}

		if (XCN01039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01039);
		}

		if (XCN01040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01040);
		}

		if (XCN01041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01041);
		}

		if (XCN01042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01042);
		}

		if (XCN01043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01043);
		}

		if (XCN01044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01044);
		}

		if (XCN01045 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01045);
		}

		if (XCN01046 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01046);
		}

		if (XCN01047 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01047);
		}

		if (XCN01049 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01049);
		}

		if (XCN01050 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01050);
		}

		if (XCN01051 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01051);
		}

		if (XCN01052 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01052);
		}

		if (XCN01053 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01053);
		}

		if (XCN01054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01054);
		}

		if (XCN01055 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01055);
		}

		if (XCN01056 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01056);
		}

		if (XCN01057 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01057);
		}

		if (XCN01058 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01058);
		}

		if (XCN01059 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01059);
		}

		if (XCN01060 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01060);
		}

		if (XCN01062 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01062);
		}

		if (XCN01063 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01063);
		}

		if (XCN01064 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01064);
		}

		if (XCN01065 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01065);
		}

		if (XCN01066 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01066);
		}

		if (XCN01067 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01067);
		}

		if (XCN01068 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01068);
		}

		if (XCN01069 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01069);
		}

		if (XCN01100 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01100);
		}

		if (XCN01101 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01101);
		}

		if (XCN01102 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01102);
		}

		if (XCN01103 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01103);
		}

		if (XCN01104 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01104);
		}

		if (XCN01105 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01105);
		}

		if (XCN01106 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01106);
		}

		if (XCN01107 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01107);
		}

		if (XCN01108 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01108);
		}

		if (XCN01109 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01109);
		}

		if (XCN01110 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01110);
		}

		if (XCN01111 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01111);
		}

		if (XCN01112 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01112);
		}

		if (XCN01113 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01113);
		}

		if (XCN01114 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01114);
		}

		if (XCN01115 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01115);
		}

		if (XCN01116 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01116);
		}

		if (XCN01117 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01117);
		}

		if (XCN01118 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01118);
		}

		if (XCN01119 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01119);
		}

		if (XCN01120 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01120);
		}

		if (XCN01121 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01121);
		}

		if (XCN01122 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01122);
		}

		if (XCN01123 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01123);
		}

		if (XCN01124 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01124);
		}

		if (XCN01125 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01125);
		}

		if (XCN01126 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01126);
		}

		if (XCN01127 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01127);
		}

		if (XCN01128 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01128);
		}

		if (XCN01129 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01129);
		}

		if (XCN01130 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01130);
		}

		if (XCN01131 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01131);
		}

		if (XCN01132 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01132);
		}

		if (XCN01133 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01133);
		}

		if (XCN01134 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01134);
		}

		if (XCN01135 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01135);
		}

		if (XCN01136 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01136);
		}

		if (XCN01137 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01137);
		}

		if (XCN01138 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01138);
		}

		if (XCN01139 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01139);
		}

		if (XCN01140 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01140);
		}

		if (XCN01141 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01141);
		}

		if (XCN01142 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01142);
		}

		if (XCN01143 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01143);
		}

		if (XCN01144 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01144);
		}

		if (XCN01145 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01145);
		}

		if (XCN01146 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01146);
		}

		if (XCN01147 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01147);
		}

		if (XCN01148 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01148);
		}

		if (XCN01149 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01149);
		}

		if (XCN01150 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01150);
		}

		if (XCN01151 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01151);
		}

		if (XCN01152 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01152);
		}

		if (XCN01153 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01153);
		}

		if (XCN01154 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01154);
		}

		if (XCN01155 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01155);
		}

		if (XCN01156 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01156);
		}

		if (XCN01157 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01157);
		}

		if (XCN01158 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01158);
		}

		if (XCN01159 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01159);
		}

		if (XCN01160 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01160);
		}

		if (XCN01161 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01161);
		}

		if (XCN01162 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01162);
		}

		if (XCN01163 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01163);
		}

		if (XCN01164 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01164);
		}

		if (XCN01165 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01165);
		}

		if (XCN01166 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01166);
		}

		if (XCN01167 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01167);
		}

		if (XCN01168 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01168);
		}

		if (XCN01169 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01169);
		}

		if (XCN01170 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01170);
		}

		if (XCN01171 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01171);
		}

		if (XCN01172 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01172);
		}

		if (XCN01173 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01173);
		}

		if (XCN01174 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01174);
		}

		if (XCN01175 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01175);
		}

		if (XCN01176 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01176);
		}

		if (XCN01177 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01177);
		}

		if (XCN01178 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01178);
		}

		if (XCN01179 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01179);
		}

		if (XCN01180 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01180);
		}

		if (XCN01181 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01181);
		}

		if (XCN01182 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01182);
		}

		if (XCN01183 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01183);
		}

		if (XCN01184 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01184);
		}

		if (XCN01185 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCN01185);
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
	public String XCN01001;
	public String XCN01002;
	public String XCN01003;
	public String XCN01004;
	public String XCN01005;
	public String XCN01006;
	public String XCN01007;
	public String XCN01008;
	public String XCN01009;
	public String XCN01010;
	public String XCN01011;
	public String XCN01012;
	public String XCN01013;
	public String XCN01014;
	public String XCN01016;
	public String XCN01017;
	public String XCN01019;
	public String XCN01020;
	public String XCN01021;
	public String XCN01022;
	public String XCN01024;
	public String XCN01025;
	public String XCN01026;
	public String XCN01027;
	public String XCN01028;
	public String XCN01030;
	public String XCN01031;
	public String XCN01032;
	public String XCN01033;
	public String XCN01034;
	public String XCN01035;
	public String XCN01036;
	public String XCN01037;
	public String XCN01038;
	public String XCN01039;
	public String XCN01040;
	public String XCN01041;
	public String XCN01042;
	public String XCN01043;
	public String XCN01044;
	public String XCN01045;
	public String XCN01046;
	public String XCN01047;
	public String XCN01049;
	public String XCN01050;
	public String XCN01051;
	public String XCN01052;
	public String XCN01053;
	public String XCN01054;
	public String XCN01055;
	public String XCN01056;
	public String XCN01057;
	public String XCN01058;
	public String XCN01059;
	public String XCN01060;
	public String XCN01062;
	public String XCN01063;
	public String XCN01064;
	public String XCN01065;
	public String XCN01066;
	public String XCN01067;
	public String XCN01068;
	public String XCN01069;
	public String XCN01100;
	public String XCN01101;
	public String XCN01102;
	public String XCN01103;
	public String XCN01104;
	public String XCN01105;
	public String XCN01106;
	public String XCN01107;
	public String XCN01108;
	public String XCN01109;
	public String XCN01110;
	public String XCN01111;
	public String XCN01112;
	public String XCN01113;
	public String XCN01114;
	public String XCN01115;
	public String XCN01116;
	public String XCN01117;
	public String XCN01118;
	public String XCN01119;
	public String XCN01120;
	public String XCN01121;
	public String XCN01122;
	public String XCN01123;
	public String XCN01124;
	public String XCN01125;
	public String XCN01126;
	public String XCN01127;
	public String XCN01128;
	public String XCN01129;
	public String XCN01130;
	public String XCN01131;
	public String XCN01132;
	public String XCN01133;
	public String XCN01134;
	public String XCN01135;
	public String XCN01136;
	public String XCN01137;
	public String XCN01138;
	public String XCN01139;
	public String XCN01140;
	public String XCN01141;
	public String XCN01142;
	public String XCN01143;
	public String XCN01144;
	public String XCN01145;
	public String XCN01146;
	public String XCN01147;
	public String XCN01148;
	public String XCN01149;
	public String XCN01150;
	public String XCN01151;
	public String XCN01152;
	public String XCN01153;
	public String XCN01154;
	public String XCN01155;
	public String XCN01156;
	public String XCN01157;
	public String XCN01158;
	public String XCN01159;
	public String XCN01160;
	public String XCN01161;
	public String XCN01162;
	public String XCN01163;
	public String XCN01164;
	public String XCN01165;
	public String XCN01166;
	public String XCN01167;
	public String XCN01168;
	public String XCN01169;
	public String XCN01170;
	public String XCN01171;
	public String XCN01172;
	public String XCN01173;
	public String XCN01174;
	public String XCN01175;
	public String XCN01176;
	public String XCN01177;
	public String XCN01178;
	public String XCN01179;
	public String XCN01180;
	public String XCN01181;
	public String XCN01182;
	public String XCN01183;
	public String XCN01184;
	public String XCN01185;
	public long modifyDate;
	public long syncDate;
}