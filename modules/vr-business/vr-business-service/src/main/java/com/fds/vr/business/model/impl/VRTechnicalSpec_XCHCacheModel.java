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

import com.fds.vr.business.model.VRTechnicalSpec_XCH;

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
 * The cache model class for representing VRTechnicalSpec_XCH in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCH
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCHCacheModel implements CacheModel<VRTechnicalSpec_XCH>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCHCacheModel)) {
			return false;
		}

		VRTechnicalSpec_XCHCacheModel vrTechnicalSpec_XCHCacheModel = (VRTechnicalSpec_XCHCacheModel)obj;

		if (id == vrTechnicalSpec_XCHCacheModel.id) {
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
		StringBundler sb = new StringBundler(495);

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
		sb.append(", XCH01001=");
		sb.append(XCH01001);
		sb.append(", XCH01002=");
		sb.append(XCH01002);
		sb.append(", XCH01003=");
		sb.append(XCH01003);
		sb.append(", XCH01004=");
		sb.append(XCH01004);
		sb.append(", XCH01005=");
		sb.append(XCH01005);
		sb.append(", XCH01006=");
		sb.append(XCH01006);
		sb.append(", XCH01007=");
		sb.append(XCH01007);
		sb.append(", XCH01008=");
		sb.append(XCH01008);
		sb.append(", XCH01009=");
		sb.append(XCH01009);
		sb.append(", XCH01010=");
		sb.append(XCH01010);
		sb.append(", XCH01011=");
		sb.append(XCH01011);
		sb.append(", XCH01012=");
		sb.append(XCH01012);
		sb.append(", XCH01013=");
		sb.append(XCH01013);
		sb.append(", XCH01014=");
		sb.append(XCH01014);
		sb.append(", XCH01016=");
		sb.append(XCH01016);
		sb.append(", XCH01017=");
		sb.append(XCH01017);
		sb.append(", XCH01019=");
		sb.append(XCH01019);
		sb.append(", XCH01020=");
		sb.append(XCH01020);
		sb.append(", XCH01021=");
		sb.append(XCH01021);
		sb.append(", XCH01022=");
		sb.append(XCH01022);
		sb.append(", XCH01024=");
		sb.append(XCH01024);
		sb.append(", XCH01025=");
		sb.append(XCH01025);
		sb.append(", XCH01026=");
		sb.append(XCH01026);
		sb.append(", XCH01027=");
		sb.append(XCH01027);
		sb.append(", XCH01028=");
		sb.append(XCH01028);
		sb.append(", XCH01030=");
		sb.append(XCH01030);
		sb.append(", XCH01031=");
		sb.append(XCH01031);
		sb.append(", XCH01032=");
		sb.append(XCH01032);
		sb.append(", XCH01033=");
		sb.append(XCH01033);
		sb.append(", XCH01034=");
		sb.append(XCH01034);
		sb.append(", XCH01035=");
		sb.append(XCH01035);
		sb.append(", XCH01036=");
		sb.append(XCH01036);
		sb.append(", XCH01037=");
		sb.append(XCH01037);
		sb.append(", XCH01038=");
		sb.append(XCH01038);
		sb.append(", XCH01039=");
		sb.append(XCH01039);
		sb.append(", XCH01040=");
		sb.append(XCH01040);
		sb.append(", XCH01041=");
		sb.append(XCH01041);
		sb.append(", XCH01042=");
		sb.append(XCH01042);
		sb.append(", XCH01043=");
		sb.append(XCH01043);
		sb.append(", XCH01044=");
		sb.append(XCH01044);
		sb.append(", XCH01045=");
		sb.append(XCH01045);
		sb.append(", XCH01046=");
		sb.append(XCH01046);
		sb.append(", XCH01047=");
		sb.append(XCH01047);
		sb.append(", XCH01049=");
		sb.append(XCH01049);
		sb.append(", XCH01050=");
		sb.append(XCH01050);
		sb.append(", XCH01051=");
		sb.append(XCH01051);
		sb.append(", XCH01052=");
		sb.append(XCH01052);
		sb.append(", XCH01053=");
		sb.append(XCH01053);
		sb.append(", XCH01054=");
		sb.append(XCH01054);
		sb.append(", XCH01055=");
		sb.append(XCH01055);
		sb.append(", XCH01056=");
		sb.append(XCH01056);
		sb.append(", XCH01057=");
		sb.append(XCH01057);
		sb.append(", XCH01058=");
		sb.append(XCH01058);
		sb.append(", XCH01059=");
		sb.append(XCH01059);
		sb.append(", XCH01060=");
		sb.append(XCH01060);
		sb.append(", XCH01062=");
		sb.append(XCH01062);
		sb.append(", XCH01063=");
		sb.append(XCH01063);
		sb.append(", XCH01064=");
		sb.append(XCH01064);
		sb.append(", XCH01065=");
		sb.append(XCH01065);
		sb.append(", XCH01066=");
		sb.append(XCH01066);
		sb.append(", XCH01067=");
		sb.append(XCH01067);
		sb.append(", XCH01068=");
		sb.append(XCH01068);
		sb.append(", XCH01069=");
		sb.append(XCH01069);
		sb.append(", XCH01100=");
		sb.append(XCH01100);
		sb.append(", XCH01101=");
		sb.append(XCH01101);
		sb.append(", XCH01102=");
		sb.append(XCH01102);
		sb.append(", XCH01103=");
		sb.append(XCH01103);
		sb.append(", XCH01104=");
		sb.append(XCH01104);
		sb.append(", XCH01105=");
		sb.append(XCH01105);
		sb.append(", XCH01106=");
		sb.append(XCH01106);
		sb.append(", XCH01107=");
		sb.append(XCH01107);
		sb.append(", XCH01108=");
		sb.append(XCH01108);
		sb.append(", XCH01109=");
		sb.append(XCH01109);
		sb.append(", XCH01110=");
		sb.append(XCH01110);
		sb.append(", XCH01111=");
		sb.append(XCH01111);
		sb.append(", XCH01112=");
		sb.append(XCH01112);
		sb.append(", XCH01113=");
		sb.append(XCH01113);
		sb.append(", XCH01114=");
		sb.append(XCH01114);
		sb.append(", XCH01115=");
		sb.append(XCH01115);
		sb.append(", XCH01116=");
		sb.append(XCH01116);
		sb.append(", XCH01117=");
		sb.append(XCH01117);
		sb.append(", XCH01118=");
		sb.append(XCH01118);
		sb.append(", XCH01119=");
		sb.append(XCH01119);
		sb.append(", XCH01120=");
		sb.append(XCH01120);
		sb.append(", XCH01121=");
		sb.append(XCH01121);
		sb.append(", XCH01122=");
		sb.append(XCH01122);
		sb.append(", XCH01123=");
		sb.append(XCH01123);
		sb.append(", XCH01124=");
		sb.append(XCH01124);
		sb.append(", XCH01125=");
		sb.append(XCH01125);
		sb.append(", XCH01126=");
		sb.append(XCH01126);
		sb.append(", XCH01127=");
		sb.append(XCH01127);
		sb.append(", XCH01128=");
		sb.append(XCH01128);
		sb.append(", XCH01129=");
		sb.append(XCH01129);
		sb.append(", XCH01130=");
		sb.append(XCH01130);
		sb.append(", XCH01131=");
		sb.append(XCH01131);
		sb.append(", XCH01132=");
		sb.append(XCH01132);
		sb.append(", XCH01133=");
		sb.append(XCH01133);
		sb.append(", XCH01134=");
		sb.append(XCH01134);
		sb.append(", XCH01135=");
		sb.append(XCH01135);
		sb.append(", XCH01136=");
		sb.append(XCH01136);
		sb.append(", XCH01137=");
		sb.append(XCH01137);
		sb.append(", XCH01138=");
		sb.append(XCH01138);
		sb.append(", XCH01139=");
		sb.append(XCH01139);
		sb.append(", XCH01140=");
		sb.append(XCH01140);
		sb.append(", XCH01141=");
		sb.append(XCH01141);
		sb.append(", XCH01142=");
		sb.append(XCH01142);
		sb.append(", XCH01143=");
		sb.append(XCH01143);
		sb.append(", XCH01144=");
		sb.append(XCH01144);
		sb.append(", XCH01145=");
		sb.append(XCH01145);
		sb.append(", XCH01146=");
		sb.append(XCH01146);
		sb.append(", XCH01147=");
		sb.append(XCH01147);
		sb.append(", XCH01148=");
		sb.append(XCH01148);
		sb.append(", XCH01149=");
		sb.append(XCH01149);
		sb.append(", XCH01150=");
		sb.append(XCH01150);
		sb.append(", XCH01151=");
		sb.append(XCH01151);
		sb.append(", XCH01152=");
		sb.append(XCH01152);
		sb.append(", XCH01153=");
		sb.append(XCH01153);
		sb.append(", XCH01154=");
		sb.append(XCH01154);
		sb.append(", XCH01155=");
		sb.append(XCH01155);
		sb.append(", XCH01156=");
		sb.append(XCH01156);
		sb.append(", XCH01157=");
		sb.append(XCH01157);
		sb.append(", XCH01158=");
		sb.append(XCH01158);
		sb.append(", XCH01159=");
		sb.append(XCH01159);
		sb.append(", XCH01160=");
		sb.append(XCH01160);
		sb.append(", XCH01161=");
		sb.append(XCH01161);
		sb.append(", XCH01162=");
		sb.append(XCH01162);
		sb.append(", XCH01163=");
		sb.append(XCH01163);
		sb.append(", XCH01164=");
		sb.append(XCH01164);
		sb.append(", XCH01165=");
		sb.append(XCH01165);
		sb.append(", XCH01166=");
		sb.append(XCH01166);
		sb.append(", XCH01167=");
		sb.append(XCH01167);
		sb.append(", XCH01168=");
		sb.append(XCH01168);
		sb.append(", XCH01169=");
		sb.append(XCH01169);
		sb.append(", XCH01170=");
		sb.append(XCH01170);
		sb.append(", XCH01171=");
		sb.append(XCH01171);
		sb.append(", XCH01172=");
		sb.append(XCH01172);
		sb.append(", XCH01173=");
		sb.append(XCH01173);
		sb.append(", XCH01174=");
		sb.append(XCH01174);
		sb.append(", XCH01175=");
		sb.append(XCH01175);
		sb.append(", XCH01176=");
		sb.append(XCH01176);
		sb.append(", XCH01177=");
		sb.append(XCH01177);
		sb.append(", XCH01178=");
		sb.append(XCH01178);
		sb.append(", XCH01179=");
		sb.append(XCH01179);
		sb.append(", XCH01180=");
		sb.append(XCH01180);
		sb.append(", XCH01181=");
		sb.append(XCH01181);
		sb.append(", XCH01182=");
		sb.append(XCH01182);
		sb.append(", XCH01183=");
		sb.append(XCH01183);
		sb.append(", XCH01184=");
		sb.append(XCH01184);
		sb.append(", XCH01185=");
		sb.append(XCH01185);
		sb.append(", XCH01186=");
		sb.append(XCH01186);
		sb.append(", XCH01187=");
		sb.append(XCH01187);
		sb.append(", XCH01188=");
		sb.append(XCH01188);
		sb.append(", XCH01189=");
		sb.append(XCH01189);
		sb.append(", XCH01190=");
		sb.append(XCH01190);
		sb.append(", XCH01191=");
		sb.append(XCH01191);
		sb.append(", XCH01192=");
		sb.append(XCH01192);
		sb.append(", XCH01193=");
		sb.append(XCH01193);
		sb.append(", XCH01194=");
		sb.append(XCH01194);
		sb.append(", XCH01195=");
		sb.append(XCH01195);
		sb.append(", XCH01196=");
		sb.append(XCH01196);
		sb.append(", XCH01197=");
		sb.append(XCH01197);
		sb.append(", XCH01198=");
		sb.append(XCH01198);
		sb.append(", XCH01199=");
		sb.append(XCH01199);
		sb.append(", XCH01200=");
		sb.append(XCH01200);
		sb.append(", XCH01201=");
		sb.append(XCH01201);
		sb.append(", XCH01202=");
		sb.append(XCH01202);
		sb.append(", XCH01203=");
		sb.append(XCH01203);
		sb.append(", XCH01204=");
		sb.append(XCH01204);
		sb.append(", XCH01205=");
		sb.append(XCH01205);
		sb.append(", XCH01206=");
		sb.append(XCH01206);
		sb.append(", XCH01207=");
		sb.append(XCH01207);
		sb.append(", XCH01208=");
		sb.append(XCH01208);
		sb.append(", XCH01209=");
		sb.append(XCH01209);
		sb.append(", XCH01210=");
		sb.append(XCH01210);
		sb.append(", XCH01211=");
		sb.append(XCH01211);
		sb.append(", XCH01212=");
		sb.append(XCH01212);
		sb.append(", XCH01213=");
		sb.append(XCH01213);
		sb.append(", XCH01214=");
		sb.append(XCH01214);
		sb.append(", XCH01215=");
		sb.append(XCH01215);
		sb.append(", XCH01216=");
		sb.append(XCH01216);
		sb.append(", XCH01217=");
		sb.append(XCH01217);
		sb.append(", XCH01218=");
		sb.append(XCH01218);
		sb.append(", XCH01219=");
		sb.append(XCH01219);
		sb.append(", XCH01220=");
		sb.append(XCH01220);
		sb.append(", XCH01221=");
		sb.append(XCH01221);
		sb.append(", XCH01222=");
		sb.append(XCH01222);
		sb.append(", XCH01223=");
		sb.append(XCH01223);
		sb.append(", XCH01224=");
		sb.append(XCH01224);
		sb.append(", XCH01225=");
		sb.append(XCH01225);
		sb.append(", XCH01226=");
		sb.append(XCH01226);
		sb.append(", XCH01227=");
		sb.append(XCH01227);
		sb.append(", XCH01228=");
		sb.append(XCH01228);
		sb.append(", XCH01229=");
		sb.append(XCH01229);
		sb.append(", XCH01230=");
		sb.append(XCH01230);
		sb.append(", XCH01231=");
		sb.append(XCH01231);
		sb.append(", XCH01232=");
		sb.append(XCH01232);
		sb.append(", XCH01233=");
		sb.append(XCH01233);
		sb.append(", XCH01234=");
		sb.append(XCH01234);
		sb.append(", XCH01235=");
		sb.append(XCH01235);
		sb.append(", XCH01236=");
		sb.append(XCH01236);
		sb.append(", XCH01237=");
		sb.append(XCH01237);
		sb.append(", XCH01238=");
		sb.append(XCH01238);
		sb.append(", XCH01239=");
		sb.append(XCH01239);
		sb.append(", XCH01240=");
		sb.append(XCH01240);
		sb.append(", XCH01241=");
		sb.append(XCH01241);
		sb.append(", XCH01242=");
		sb.append(XCH01242);
		sb.append(", XCH01243=");
		sb.append(XCH01243);
		sb.append(", XCH01244=");
		sb.append(XCH01244);
		sb.append(", XCH01245=");
		sb.append(XCH01245);
		sb.append(", XCH01246=");
		sb.append(XCH01246);
		sb.append(", XCH01247=");
		sb.append(XCH01247);
		sb.append(", XCH01248=");
		sb.append(XCH01248);
		sb.append(", XCH01249=");
		sb.append(XCH01249);
		sb.append(", XCH01250=");
		sb.append(XCH01250);
		sb.append(", XCH01251=");
		sb.append(XCH01251);
		sb.append(", XCH01252=");
		sb.append(XCH01252);
		sb.append(", XCH01253=");
		sb.append(XCH01253);
		sb.append(", XCH01254=");
		sb.append(XCH01254);
		sb.append(", XCH01255=");
		sb.append(XCH01255);
		sb.append(", XCH01256=");
		sb.append(XCH01256);
		sb.append(", XCH01257=");
		sb.append(XCH01257);
		sb.append(", XCH01258=");
		sb.append(XCH01258);
		sb.append(", XCH01259=");
		sb.append(XCH01259);
		sb.append(", XCH01260=");
		sb.append(XCH01260);
		sb.append(", XCH01261=");
		sb.append(XCH01261);
		sb.append(", XCH01262=");
		sb.append(XCH01262);
		sb.append(", XCH01263=");
		sb.append(XCH01263);
		sb.append(", XCH01264=");
		sb.append(XCH01264);
		sb.append(", XCH01265=");
		sb.append(XCH01265);
		sb.append(", XCH01266=");
		sb.append(XCH01266);
		sb.append(", XCH01267=");
		sb.append(XCH01267);
		sb.append(", XCH01268=");
		sb.append(XCH01268);
		sb.append(", XCH01269=");
		sb.append(XCH01269);
		sb.append(", XCH01270=");
		sb.append(XCH01270);
		sb.append(", XCH01271=");
		sb.append(XCH01271);
		sb.append(", XCH01272=");
		sb.append(XCH01272);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XCH toEntityModel() {
		VRTechnicalSpec_XCHImpl vrTechnicalSpec_XCHImpl = new VRTechnicalSpec_XCHImpl();

		vrTechnicalSpec_XCHImpl.setId(id);
		vrTechnicalSpec_XCHImpl.setMtCore(mtCore);
		vrTechnicalSpec_XCHImpl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XCHImpl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XCHImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XCHImpl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XCHImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XCHImpl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XCHImpl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XCH01001 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01001(XCH01001);
		}

		if (XCH01002 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01002(XCH01002);
		}

		if (XCH01003 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01003(XCH01003);
		}

		if (XCH01004 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01004(XCH01004);
		}

		if (XCH01005 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01005(XCH01005);
		}

		if (XCH01006 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01006(XCH01006);
		}

		if (XCH01007 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01007(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01007(XCH01007);
		}

		if (XCH01008 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01008(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01008(XCH01008);
		}

		if (XCH01009 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01009(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01009(XCH01009);
		}

		if (XCH01010 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01010(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01010(XCH01010);
		}

		if (XCH01011 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01011(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01011(XCH01011);
		}

		if (XCH01012 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01012(XCH01012);
		}

		if (XCH01013 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01013(XCH01013);
		}

		if (XCH01014 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01014(XCH01014);
		}

		if (XCH01016 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01016(XCH01016);
		}

		if (XCH01017 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01017(XCH01017);
		}

		if (XCH01019 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01019(XCH01019);
		}

		if (XCH01020 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01020(XCH01020);
		}

		if (XCH01021 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01021(XCH01021);
		}

		if (XCH01022 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01022(XCH01022);
		}

		if (XCH01024 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01024(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01024(XCH01024);
		}

		if (XCH01025 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01025(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01025(XCH01025);
		}

		if (XCH01026 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01026(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01026(XCH01026);
		}

		if (XCH01027 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01027(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01027(XCH01027);
		}

		if (XCH01028 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01028(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01028(XCH01028);
		}

		if (XCH01030 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01030(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01030(XCH01030);
		}

		if (XCH01031 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01031(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01031(XCH01031);
		}

		if (XCH01032 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01032(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01032(XCH01032);
		}

		if (XCH01033 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01033(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01033(XCH01033);
		}

		if (XCH01034 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01034(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01034(XCH01034);
		}

		if (XCH01035 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01035(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01035(XCH01035);
		}

		if (XCH01036 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01036(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01036(XCH01036);
		}

		if (XCH01037 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01037(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01037(XCH01037);
		}

		if (XCH01038 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01038(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01038(XCH01038);
		}

		if (XCH01039 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01039(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01039(XCH01039);
		}

		if (XCH01040 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01040(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01040(XCH01040);
		}

		if (XCH01041 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01041(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01041(XCH01041);
		}

		if (XCH01042 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01042(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01042(XCH01042);
		}

		if (XCH01043 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01043(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01043(XCH01043);
		}

		if (XCH01044 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01044(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01044(XCH01044);
		}

		if (XCH01045 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01045(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01045(XCH01045);
		}

		if (XCH01046 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01046(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01046(XCH01046);
		}

		if (XCH01047 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01047(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01047(XCH01047);
		}

		if (XCH01049 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01049(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01049(XCH01049);
		}

		if (XCH01050 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01050(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01050(XCH01050);
		}

		if (XCH01051 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01051(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01051(XCH01051);
		}

		if (XCH01052 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01052(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01052(XCH01052);
		}

		if (XCH01053 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01053(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01053(XCH01053);
		}

		if (XCH01054 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01054(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01054(XCH01054);
		}

		if (XCH01055 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01055(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01055(XCH01055);
		}

		if (XCH01056 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01056(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01056(XCH01056);
		}

		if (XCH01057 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01057(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01057(XCH01057);
		}

		if (XCH01058 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01058(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01058(XCH01058);
		}

		if (XCH01059 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01059(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01059(XCH01059);
		}

		if (XCH01060 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01060(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01060(XCH01060);
		}

		if (XCH01062 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01062(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01062(XCH01062);
		}

		if (XCH01063 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01063(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01063(XCH01063);
		}

		if (XCH01064 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01064(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01064(XCH01064);
		}

		if (XCH01065 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01065(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01065(XCH01065);
		}

		if (XCH01066 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01066(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01066(XCH01066);
		}

		if (XCH01067 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01067(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01067(XCH01067);
		}

		if (XCH01068 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01068(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01068(XCH01068);
		}

		if (XCH01069 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01069(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01069(XCH01069);
		}

		if (XCH01100 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01100(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01100(XCH01100);
		}

		if (XCH01101 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01101(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01101(XCH01101);
		}

		if (XCH01102 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01102(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01102(XCH01102);
		}

		if (XCH01103 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01103(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01103(XCH01103);
		}

		if (XCH01104 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01104(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01104(XCH01104);
		}

		if (XCH01105 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01105(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01105(XCH01105);
		}

		if (XCH01106 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01106(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01106(XCH01106);
		}

		if (XCH01107 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01107(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01107(XCH01107);
		}

		if (XCH01108 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01108(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01108(XCH01108);
		}

		if (XCH01109 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01109(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01109(XCH01109);
		}

		if (XCH01110 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01110(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01110(XCH01110);
		}

		if (XCH01111 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01111(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01111(XCH01111);
		}

		if (XCH01112 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01112(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01112(XCH01112);
		}

		if (XCH01113 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01113(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01113(XCH01113);
		}

		if (XCH01114 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01114(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01114(XCH01114);
		}

		if (XCH01115 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01115(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01115(XCH01115);
		}

		if (XCH01116 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01116(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01116(XCH01116);
		}

		if (XCH01117 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01117(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01117(XCH01117);
		}

		if (XCH01118 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01118(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01118(XCH01118);
		}

		if (XCH01119 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01119(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01119(XCH01119);
		}

		if (XCH01120 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01120(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01120(XCH01120);
		}

		if (XCH01121 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01121(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01121(XCH01121);
		}

		if (XCH01122 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01122(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01122(XCH01122);
		}

		if (XCH01123 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01123(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01123(XCH01123);
		}

		if (XCH01124 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01124(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01124(XCH01124);
		}

		if (XCH01125 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01125(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01125(XCH01125);
		}

		if (XCH01126 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01126(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01126(XCH01126);
		}

		if (XCH01127 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01127(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01127(XCH01127);
		}

		if (XCH01128 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01128(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01128(XCH01128);
		}

		if (XCH01129 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01129(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01129(XCH01129);
		}

		if (XCH01130 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01130(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01130(XCH01130);
		}

		if (XCH01131 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01131(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01131(XCH01131);
		}

		if (XCH01132 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01132(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01132(XCH01132);
		}

		if (XCH01133 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01133(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01133(XCH01133);
		}

		if (XCH01134 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01134(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01134(XCH01134);
		}

		if (XCH01135 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01135(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01135(XCH01135);
		}

		if (XCH01136 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01136(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01136(XCH01136);
		}

		if (XCH01137 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01137(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01137(XCH01137);
		}

		if (XCH01138 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01138(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01138(XCH01138);
		}

		if (XCH01139 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01139(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01139(XCH01139);
		}

		if (XCH01140 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01140(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01140(XCH01140);
		}

		if (XCH01141 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01141(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01141(XCH01141);
		}

		if (XCH01142 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01142(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01142(XCH01142);
		}

		if (XCH01143 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01143(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01143(XCH01143);
		}

		if (XCH01144 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01144(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01144(XCH01144);
		}

		if (XCH01145 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01145(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01145(XCH01145);
		}

		if (XCH01146 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01146(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01146(XCH01146);
		}

		if (XCH01147 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01147(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01147(XCH01147);
		}

		if (XCH01148 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01148(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01148(XCH01148);
		}

		if (XCH01149 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01149(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01149(XCH01149);
		}

		if (XCH01150 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01150(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01150(XCH01150);
		}

		if (XCH01151 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01151(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01151(XCH01151);
		}

		if (XCH01152 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01152(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01152(XCH01152);
		}

		if (XCH01153 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01153(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01153(XCH01153);
		}

		if (XCH01154 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01154(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01154(XCH01154);
		}

		if (XCH01155 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01155(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01155(XCH01155);
		}

		if (XCH01156 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01156(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01156(XCH01156);
		}

		if (XCH01157 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01157(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01157(XCH01157);
		}

		if (XCH01158 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01158(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01158(XCH01158);
		}

		if (XCH01159 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01159(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01159(XCH01159);
		}

		if (XCH01160 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01160(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01160(XCH01160);
		}

		if (XCH01161 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01161(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01161(XCH01161);
		}

		if (XCH01162 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01162(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01162(XCH01162);
		}

		if (XCH01163 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01163(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01163(XCH01163);
		}

		if (XCH01164 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01164(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01164(XCH01164);
		}

		if (XCH01165 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01165(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01165(XCH01165);
		}

		if (XCH01166 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01166(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01166(XCH01166);
		}

		if (XCH01167 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01167(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01167(XCH01167);
		}

		if (XCH01168 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01168(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01168(XCH01168);
		}

		if (XCH01169 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01169(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01169(XCH01169);
		}

		if (XCH01170 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01170(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01170(XCH01170);
		}

		if (XCH01171 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01171(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01171(XCH01171);
		}

		if (XCH01172 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01172(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01172(XCH01172);
		}

		if (XCH01173 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01173(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01173(XCH01173);
		}

		if (XCH01174 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01174(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01174(XCH01174);
		}

		if (XCH01175 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01175(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01175(XCH01175);
		}

		if (XCH01176 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01176(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01176(XCH01176);
		}

		if (XCH01177 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01177(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01177(XCH01177);
		}

		if (XCH01178 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01178(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01178(XCH01178);
		}

		if (XCH01179 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01179(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01179(XCH01179);
		}

		if (XCH01180 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01180(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01180(XCH01180);
		}

		if (XCH01181 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01181(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01181(XCH01181);
		}

		if (XCH01182 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01182(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01182(XCH01182);
		}

		if (XCH01183 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01183(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01183(XCH01183);
		}

		if (XCH01184 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01184(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01184(XCH01184);
		}

		if (XCH01185 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01185(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01185(XCH01185);
		}

		if (XCH01186 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01186(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01186(XCH01186);
		}

		if (XCH01187 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01187(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01187(XCH01187);
		}

		if (XCH01188 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01188(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01188(XCH01188);
		}

		if (XCH01189 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01189(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01189(XCH01189);
		}

		if (XCH01190 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01190(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01190(XCH01190);
		}

		if (XCH01191 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01191(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01191(XCH01191);
		}

		if (XCH01192 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01192(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01192(XCH01192);
		}

		if (XCH01193 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01193(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01193(XCH01193);
		}

		if (XCH01194 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01194(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01194(XCH01194);
		}

		if (XCH01195 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01195(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01195(XCH01195);
		}

		if (XCH01196 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01196(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01196(XCH01196);
		}

		if (XCH01197 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01197(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01197(XCH01197);
		}

		if (XCH01198 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01198(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01198(XCH01198);
		}

		if (XCH01199 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01199(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01199(XCH01199);
		}

		if (XCH01200 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01200(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01200(XCH01200);
		}

		if (XCH01201 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01201(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01201(XCH01201);
		}

		if (XCH01202 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01202(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01202(XCH01202);
		}

		if (XCH01203 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01203(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01203(XCH01203);
		}

		if (XCH01204 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01204(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01204(XCH01204);
		}

		if (XCH01205 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01205(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01205(XCH01205);
		}

		if (XCH01206 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01206(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01206(XCH01206);
		}

		if (XCH01207 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01207(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01207(XCH01207);
		}

		if (XCH01208 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01208(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01208(XCH01208);
		}

		if (XCH01209 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01209(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01209(XCH01209);
		}

		if (XCH01210 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01210(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01210(XCH01210);
		}

		if (XCH01211 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01211(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01211(XCH01211);
		}

		if (XCH01212 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01212(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01212(XCH01212);
		}

		if (XCH01213 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01213(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01213(XCH01213);
		}

		if (XCH01214 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01214(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01214(XCH01214);
		}

		if (XCH01215 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01215(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01215(XCH01215);
		}

		if (XCH01216 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01216(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01216(XCH01216);
		}

		if (XCH01217 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01217(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01217(XCH01217);
		}

		if (XCH01218 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01218(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01218(XCH01218);
		}

		if (XCH01219 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01219(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01219(XCH01219);
		}

		if (XCH01220 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01220(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01220(XCH01220);
		}

		if (XCH01221 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01221(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01221(XCH01221);
		}

		if (XCH01222 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01222(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01222(XCH01222);
		}

		if (XCH01223 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01223(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01223(XCH01223);
		}

		if (XCH01224 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01224(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01224(XCH01224);
		}

		if (XCH01225 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01225(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01225(XCH01225);
		}

		if (XCH01226 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01226(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01226(XCH01226);
		}

		if (XCH01227 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01227(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01227(XCH01227);
		}

		if (XCH01228 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01228(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01228(XCH01228);
		}

		if (XCH01229 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01229(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01229(XCH01229);
		}

		if (XCH01230 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01230(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01230(XCH01230);
		}

		if (XCH01231 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01231(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01231(XCH01231);
		}

		if (XCH01232 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01232(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01232(XCH01232);
		}

		if (XCH01233 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01233(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01233(XCH01233);
		}

		if (XCH01234 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01234(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01234(XCH01234);
		}

		if (XCH01235 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01235(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01235(XCH01235);
		}

		if (XCH01236 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01236(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01236(XCH01236);
		}

		if (XCH01237 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01237(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01237(XCH01237);
		}

		if (XCH01238 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01238(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01238(XCH01238);
		}

		if (XCH01239 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01239(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01239(XCH01239);
		}

		if (XCH01240 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01240(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01240(XCH01240);
		}

		if (XCH01241 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01241(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01241(XCH01241);
		}

		if (XCH01242 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01242(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01242(XCH01242);
		}

		if (XCH01243 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01243(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01243(XCH01243);
		}

		if (XCH01244 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01244(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01244(XCH01244);
		}

		if (XCH01245 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01245(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01245(XCH01245);
		}

		if (XCH01246 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01246(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01246(XCH01246);
		}

		if (XCH01247 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01247(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01247(XCH01247);
		}

		if (XCH01248 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01248(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01248(XCH01248);
		}

		if (XCH01249 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01249(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01249(XCH01249);
		}

		if (XCH01250 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01250(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01250(XCH01250);
		}

		if (XCH01251 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01251(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01251(XCH01251);
		}

		if (XCH01252 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01252(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01252(XCH01252);
		}

		if (XCH01253 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01253(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01253(XCH01253);
		}

		if (XCH01254 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01254(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01254(XCH01254);
		}

		if (XCH01255 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01255(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01255(XCH01255);
		}

		if (XCH01256 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01256(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01256(XCH01256);
		}

		if (XCH01257 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01257(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01257(XCH01257);
		}

		if (XCH01258 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01258(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01258(XCH01258);
		}

		if (XCH01259 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01259(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01259(XCH01259);
		}

		if (XCH01260 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01260(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01260(XCH01260);
		}

		if (XCH01261 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01261(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01261(XCH01261);
		}

		if (XCH01262 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01262(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01262(XCH01262);
		}

		if (XCH01263 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01263(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01263(XCH01263);
		}

		if (XCH01264 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01264(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01264(XCH01264);
		}

		if (XCH01265 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01265(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01265(XCH01265);
		}

		if (XCH01266 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01266(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01266(XCH01266);
		}

		if (XCH01267 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01267(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01267(XCH01267);
		}

		if (XCH01268 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01268(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01268(XCH01268);
		}

		if (XCH01269 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01269(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01269(XCH01269);
		}

		if (XCH01270 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01270(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01270(XCH01270);
		}

		if (XCH01271 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01271(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01271(XCH01271);
		}

		if (XCH01272 == null) {
			vrTechnicalSpec_XCHImpl.setXCH01272(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCHImpl.setXCH01272(XCH01272);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCHImpl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XCHImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCHImpl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XCHImpl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XCHImpl.resetOriginalValues();

		return vrTechnicalSpec_XCHImpl;
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
		XCH01001 = objectInput.readUTF();
		XCH01002 = objectInput.readUTF();
		XCH01003 = objectInput.readUTF();
		XCH01004 = objectInput.readUTF();
		XCH01005 = objectInput.readUTF();
		XCH01006 = objectInput.readUTF();
		XCH01007 = objectInput.readUTF();
		XCH01008 = objectInput.readUTF();
		XCH01009 = objectInput.readUTF();
		XCH01010 = objectInput.readUTF();
		XCH01011 = objectInput.readUTF();
		XCH01012 = objectInput.readUTF();
		XCH01013 = objectInput.readUTF();
		XCH01014 = objectInput.readUTF();
		XCH01016 = objectInput.readUTF();
		XCH01017 = objectInput.readUTF();
		XCH01019 = objectInput.readUTF();
		XCH01020 = objectInput.readUTF();
		XCH01021 = objectInput.readUTF();
		XCH01022 = objectInput.readUTF();
		XCH01024 = objectInput.readUTF();
		XCH01025 = objectInput.readUTF();
		XCH01026 = objectInput.readUTF();
		XCH01027 = objectInput.readUTF();
		XCH01028 = objectInput.readUTF();
		XCH01030 = objectInput.readUTF();
		XCH01031 = objectInput.readUTF();
		XCH01032 = objectInput.readUTF();
		XCH01033 = objectInput.readUTF();
		XCH01034 = objectInput.readUTF();
		XCH01035 = objectInput.readUTF();
		XCH01036 = objectInput.readUTF();
		XCH01037 = objectInput.readUTF();
		XCH01038 = objectInput.readUTF();
		XCH01039 = objectInput.readUTF();
		XCH01040 = objectInput.readUTF();
		XCH01041 = objectInput.readUTF();
		XCH01042 = objectInput.readUTF();
		XCH01043 = objectInput.readUTF();
		XCH01044 = objectInput.readUTF();
		XCH01045 = objectInput.readUTF();
		XCH01046 = objectInput.readUTF();
		XCH01047 = objectInput.readUTF();
		XCH01049 = objectInput.readUTF();
		XCH01050 = objectInput.readUTF();
		XCH01051 = objectInput.readUTF();
		XCH01052 = objectInput.readUTF();
		XCH01053 = objectInput.readUTF();
		XCH01054 = objectInput.readUTF();
		XCH01055 = objectInput.readUTF();
		XCH01056 = objectInput.readUTF();
		XCH01057 = objectInput.readUTF();
		XCH01058 = objectInput.readUTF();
		XCH01059 = objectInput.readUTF();
		XCH01060 = objectInput.readUTF();
		XCH01062 = objectInput.readUTF();
		XCH01063 = objectInput.readUTF();
		XCH01064 = objectInput.readUTF();
		XCH01065 = objectInput.readUTF();
		XCH01066 = objectInput.readUTF();
		XCH01067 = objectInput.readUTF();
		XCH01068 = objectInput.readUTF();
		XCH01069 = objectInput.readUTF();
		XCH01100 = objectInput.readUTF();
		XCH01101 = objectInput.readUTF();
		XCH01102 = objectInput.readUTF();
		XCH01103 = objectInput.readUTF();
		XCH01104 = objectInput.readUTF();
		XCH01105 = objectInput.readUTF();
		XCH01106 = objectInput.readUTF();
		XCH01107 = objectInput.readUTF();
		XCH01108 = objectInput.readUTF();
		XCH01109 = objectInput.readUTF();
		XCH01110 = objectInput.readUTF();
		XCH01111 = objectInput.readUTF();
		XCH01112 = objectInput.readUTF();
		XCH01113 = objectInput.readUTF();
		XCH01114 = objectInput.readUTF();
		XCH01115 = objectInput.readUTF();
		XCH01116 = objectInput.readUTF();
		XCH01117 = objectInput.readUTF();
		XCH01118 = objectInput.readUTF();
		XCH01119 = objectInput.readUTF();
		XCH01120 = objectInput.readUTF();
		XCH01121 = objectInput.readUTF();
		XCH01122 = objectInput.readUTF();
		XCH01123 = objectInput.readUTF();
		XCH01124 = objectInput.readUTF();
		XCH01125 = objectInput.readUTF();
		XCH01126 = objectInput.readUTF();
		XCH01127 = objectInput.readUTF();
		XCH01128 = objectInput.readUTF();
		XCH01129 = objectInput.readUTF();
		XCH01130 = objectInput.readUTF();
		XCH01131 = objectInput.readUTF();
		XCH01132 = objectInput.readUTF();
		XCH01133 = objectInput.readUTF();
		XCH01134 = objectInput.readUTF();
		XCH01135 = objectInput.readUTF();
		XCH01136 = objectInput.readUTF();
		XCH01137 = objectInput.readUTF();
		XCH01138 = objectInput.readUTF();
		XCH01139 = objectInput.readUTF();
		XCH01140 = objectInput.readUTF();
		XCH01141 = objectInput.readUTF();
		XCH01142 = objectInput.readUTF();
		XCH01143 = objectInput.readUTF();
		XCH01144 = objectInput.readUTF();
		XCH01145 = objectInput.readUTF();
		XCH01146 = objectInput.readUTF();
		XCH01147 = objectInput.readUTF();
		XCH01148 = objectInput.readUTF();
		XCH01149 = objectInput.readUTF();
		XCH01150 = objectInput.readUTF();
		XCH01151 = objectInput.readUTF();
		XCH01152 = objectInput.readUTF();
		XCH01153 = objectInput.readUTF();
		XCH01154 = objectInput.readUTF();
		XCH01155 = objectInput.readUTF();
		XCH01156 = objectInput.readUTF();
		XCH01157 = objectInput.readUTF();
		XCH01158 = objectInput.readUTF();
		XCH01159 = objectInput.readUTF();
		XCH01160 = objectInput.readUTF();
		XCH01161 = objectInput.readUTF();
		XCH01162 = objectInput.readUTF();
		XCH01163 = objectInput.readUTF();
		XCH01164 = objectInput.readUTF();
		XCH01165 = objectInput.readUTF();
		XCH01166 = objectInput.readUTF();
		XCH01167 = objectInput.readUTF();
		XCH01168 = objectInput.readUTF();
		XCH01169 = objectInput.readUTF();
		XCH01170 = objectInput.readUTF();
		XCH01171 = objectInput.readUTF();
		XCH01172 = objectInput.readUTF();
		XCH01173 = objectInput.readUTF();
		XCH01174 = objectInput.readUTF();
		XCH01175 = objectInput.readUTF();
		XCH01176 = objectInput.readUTF();
		XCH01177 = objectInput.readUTF();
		XCH01178 = objectInput.readUTF();
		XCH01179 = objectInput.readUTF();
		XCH01180 = objectInput.readUTF();
		XCH01181 = objectInput.readUTF();
		XCH01182 = objectInput.readUTF();
		XCH01183 = objectInput.readUTF();
		XCH01184 = objectInput.readUTF();
		XCH01185 = objectInput.readUTF();
		XCH01186 = objectInput.readUTF();
		XCH01187 = objectInput.readUTF();
		XCH01188 = objectInput.readUTF();
		XCH01189 = objectInput.readUTF();
		XCH01190 = objectInput.readUTF();
		XCH01191 = objectInput.readUTF();
		XCH01192 = objectInput.readUTF();
		XCH01193 = objectInput.readUTF();
		XCH01194 = objectInput.readUTF();
		XCH01195 = objectInput.readUTF();
		XCH01196 = objectInput.readUTF();
		XCH01197 = objectInput.readUTF();
		XCH01198 = objectInput.readUTF();
		XCH01199 = objectInput.readUTF();
		XCH01200 = objectInput.readUTF();
		XCH01201 = objectInput.readUTF();
		XCH01202 = objectInput.readUTF();
		XCH01203 = objectInput.readUTF();
		XCH01204 = objectInput.readUTF();
		XCH01205 = objectInput.readUTF();
		XCH01206 = objectInput.readUTF();
		XCH01207 = objectInput.readUTF();
		XCH01208 = objectInput.readUTF();
		XCH01209 = objectInput.readUTF();
		XCH01210 = objectInput.readUTF();
		XCH01211 = objectInput.readUTF();
		XCH01212 = objectInput.readUTF();
		XCH01213 = objectInput.readUTF();
		XCH01214 = objectInput.readUTF();
		XCH01215 = objectInput.readUTF();
		XCH01216 = objectInput.readUTF();
		XCH01217 = objectInput.readUTF();
		XCH01218 = objectInput.readUTF();
		XCH01219 = objectInput.readUTF();
		XCH01220 = objectInput.readUTF();
		XCH01221 = objectInput.readUTF();
		XCH01222 = objectInput.readUTF();
		XCH01223 = objectInput.readUTF();
		XCH01224 = objectInput.readUTF();
		XCH01225 = objectInput.readUTF();
		XCH01226 = objectInput.readUTF();
		XCH01227 = objectInput.readUTF();
		XCH01228 = objectInput.readUTF();
		XCH01229 = objectInput.readUTF();
		XCH01230 = objectInput.readUTF();
		XCH01231 = objectInput.readUTF();
		XCH01232 = objectInput.readUTF();
		XCH01233 = objectInput.readUTF();
		XCH01234 = objectInput.readUTF();
		XCH01235 = objectInput.readUTF();
		XCH01236 = objectInput.readUTF();
		XCH01237 = objectInput.readUTF();
		XCH01238 = objectInput.readUTF();
		XCH01239 = objectInput.readUTF();
		XCH01240 = objectInput.readUTF();
		XCH01241 = objectInput.readUTF();
		XCH01242 = objectInput.readUTF();
		XCH01243 = objectInput.readUTF();
		XCH01244 = objectInput.readUTF();
		XCH01245 = objectInput.readUTF();
		XCH01246 = objectInput.readUTF();
		XCH01247 = objectInput.readUTF();
		XCH01248 = objectInput.readUTF();
		XCH01249 = objectInput.readUTF();
		XCH01250 = objectInput.readUTF();
		XCH01251 = objectInput.readUTF();
		XCH01252 = objectInput.readUTF();
		XCH01253 = objectInput.readUTF();
		XCH01254 = objectInput.readUTF();
		XCH01255 = objectInput.readUTF();
		XCH01256 = objectInput.readUTF();
		XCH01257 = objectInput.readUTF();
		XCH01258 = objectInput.readUTF();
		XCH01259 = objectInput.readUTF();
		XCH01260 = objectInput.readUTF();
		XCH01261 = objectInput.readUTF();
		XCH01262 = objectInput.readUTF();
		XCH01263 = objectInput.readUTF();
		XCH01264 = objectInput.readUTF();
		XCH01265 = objectInput.readUTF();
		XCH01266 = objectInput.readUTF();
		XCH01267 = objectInput.readUTF();
		XCH01268 = objectInput.readUTF();
		XCH01269 = objectInput.readUTF();
		XCH01270 = objectInput.readUTF();
		XCH01271 = objectInput.readUTF();
		XCH01272 = objectInput.readUTF();
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

		if (XCH01001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01001);
		}

		if (XCH01002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01002);
		}

		if (XCH01003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01003);
		}

		if (XCH01004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01004);
		}

		if (XCH01005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01005);
		}

		if (XCH01006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01006);
		}

		if (XCH01007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01007);
		}

		if (XCH01008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01008);
		}

		if (XCH01009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01009);
		}

		if (XCH01010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01010);
		}

		if (XCH01011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01011);
		}

		if (XCH01012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01012);
		}

		if (XCH01013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01013);
		}

		if (XCH01014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01014);
		}

		if (XCH01016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01016);
		}

		if (XCH01017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01017);
		}

		if (XCH01019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01019);
		}

		if (XCH01020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01020);
		}

		if (XCH01021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01021);
		}

		if (XCH01022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01022);
		}

		if (XCH01024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01024);
		}

		if (XCH01025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01025);
		}

		if (XCH01026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01026);
		}

		if (XCH01027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01027);
		}

		if (XCH01028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01028);
		}

		if (XCH01030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01030);
		}

		if (XCH01031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01031);
		}

		if (XCH01032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01032);
		}

		if (XCH01033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01033);
		}

		if (XCH01034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01034);
		}

		if (XCH01035 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01035);
		}

		if (XCH01036 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01036);
		}

		if (XCH01037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01037);
		}

		if (XCH01038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01038);
		}

		if (XCH01039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01039);
		}

		if (XCH01040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01040);
		}

		if (XCH01041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01041);
		}

		if (XCH01042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01042);
		}

		if (XCH01043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01043);
		}

		if (XCH01044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01044);
		}

		if (XCH01045 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01045);
		}

		if (XCH01046 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01046);
		}

		if (XCH01047 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01047);
		}

		if (XCH01049 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01049);
		}

		if (XCH01050 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01050);
		}

		if (XCH01051 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01051);
		}

		if (XCH01052 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01052);
		}

		if (XCH01053 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01053);
		}

		if (XCH01054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01054);
		}

		if (XCH01055 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01055);
		}

		if (XCH01056 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01056);
		}

		if (XCH01057 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01057);
		}

		if (XCH01058 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01058);
		}

		if (XCH01059 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01059);
		}

		if (XCH01060 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01060);
		}

		if (XCH01062 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01062);
		}

		if (XCH01063 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01063);
		}

		if (XCH01064 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01064);
		}

		if (XCH01065 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01065);
		}

		if (XCH01066 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01066);
		}

		if (XCH01067 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01067);
		}

		if (XCH01068 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01068);
		}

		if (XCH01069 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01069);
		}

		if (XCH01100 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01100);
		}

		if (XCH01101 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01101);
		}

		if (XCH01102 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01102);
		}

		if (XCH01103 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01103);
		}

		if (XCH01104 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01104);
		}

		if (XCH01105 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01105);
		}

		if (XCH01106 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01106);
		}

		if (XCH01107 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01107);
		}

		if (XCH01108 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01108);
		}

		if (XCH01109 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01109);
		}

		if (XCH01110 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01110);
		}

		if (XCH01111 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01111);
		}

		if (XCH01112 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01112);
		}

		if (XCH01113 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01113);
		}

		if (XCH01114 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01114);
		}

		if (XCH01115 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01115);
		}

		if (XCH01116 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01116);
		}

		if (XCH01117 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01117);
		}

		if (XCH01118 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01118);
		}

		if (XCH01119 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01119);
		}

		if (XCH01120 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01120);
		}

		if (XCH01121 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01121);
		}

		if (XCH01122 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01122);
		}

		if (XCH01123 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01123);
		}

		if (XCH01124 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01124);
		}

		if (XCH01125 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01125);
		}

		if (XCH01126 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01126);
		}

		if (XCH01127 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01127);
		}

		if (XCH01128 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01128);
		}

		if (XCH01129 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01129);
		}

		if (XCH01130 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01130);
		}

		if (XCH01131 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01131);
		}

		if (XCH01132 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01132);
		}

		if (XCH01133 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01133);
		}

		if (XCH01134 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01134);
		}

		if (XCH01135 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01135);
		}

		if (XCH01136 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01136);
		}

		if (XCH01137 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01137);
		}

		if (XCH01138 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01138);
		}

		if (XCH01139 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01139);
		}

		if (XCH01140 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01140);
		}

		if (XCH01141 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01141);
		}

		if (XCH01142 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01142);
		}

		if (XCH01143 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01143);
		}

		if (XCH01144 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01144);
		}

		if (XCH01145 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01145);
		}

		if (XCH01146 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01146);
		}

		if (XCH01147 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01147);
		}

		if (XCH01148 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01148);
		}

		if (XCH01149 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01149);
		}

		if (XCH01150 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01150);
		}

		if (XCH01151 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01151);
		}

		if (XCH01152 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01152);
		}

		if (XCH01153 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01153);
		}

		if (XCH01154 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01154);
		}

		if (XCH01155 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01155);
		}

		if (XCH01156 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01156);
		}

		if (XCH01157 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01157);
		}

		if (XCH01158 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01158);
		}

		if (XCH01159 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01159);
		}

		if (XCH01160 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01160);
		}

		if (XCH01161 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01161);
		}

		if (XCH01162 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01162);
		}

		if (XCH01163 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01163);
		}

		if (XCH01164 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01164);
		}

		if (XCH01165 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01165);
		}

		if (XCH01166 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01166);
		}

		if (XCH01167 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01167);
		}

		if (XCH01168 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01168);
		}

		if (XCH01169 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01169);
		}

		if (XCH01170 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01170);
		}

		if (XCH01171 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01171);
		}

		if (XCH01172 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01172);
		}

		if (XCH01173 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01173);
		}

		if (XCH01174 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01174);
		}

		if (XCH01175 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01175);
		}

		if (XCH01176 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01176);
		}

		if (XCH01177 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01177);
		}

		if (XCH01178 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01178);
		}

		if (XCH01179 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01179);
		}

		if (XCH01180 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01180);
		}

		if (XCH01181 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01181);
		}

		if (XCH01182 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01182);
		}

		if (XCH01183 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01183);
		}

		if (XCH01184 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01184);
		}

		if (XCH01185 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01185);
		}

		if (XCH01186 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01186);
		}

		if (XCH01187 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01187);
		}

		if (XCH01188 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01188);
		}

		if (XCH01189 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01189);
		}

		if (XCH01190 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01190);
		}

		if (XCH01191 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01191);
		}

		if (XCH01192 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01192);
		}

		if (XCH01193 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01193);
		}

		if (XCH01194 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01194);
		}

		if (XCH01195 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01195);
		}

		if (XCH01196 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01196);
		}

		if (XCH01197 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01197);
		}

		if (XCH01198 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01198);
		}

		if (XCH01199 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01199);
		}

		if (XCH01200 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01200);
		}

		if (XCH01201 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01201);
		}

		if (XCH01202 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01202);
		}

		if (XCH01203 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01203);
		}

		if (XCH01204 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01204);
		}

		if (XCH01205 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01205);
		}

		if (XCH01206 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01206);
		}

		if (XCH01207 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01207);
		}

		if (XCH01208 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01208);
		}

		if (XCH01209 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01209);
		}

		if (XCH01210 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01210);
		}

		if (XCH01211 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01211);
		}

		if (XCH01212 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01212);
		}

		if (XCH01213 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01213);
		}

		if (XCH01214 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01214);
		}

		if (XCH01215 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01215);
		}

		if (XCH01216 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01216);
		}

		if (XCH01217 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01217);
		}

		if (XCH01218 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01218);
		}

		if (XCH01219 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01219);
		}

		if (XCH01220 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01220);
		}

		if (XCH01221 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01221);
		}

		if (XCH01222 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01222);
		}

		if (XCH01223 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01223);
		}

		if (XCH01224 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01224);
		}

		if (XCH01225 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01225);
		}

		if (XCH01226 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01226);
		}

		if (XCH01227 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01227);
		}

		if (XCH01228 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01228);
		}

		if (XCH01229 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01229);
		}

		if (XCH01230 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01230);
		}

		if (XCH01231 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01231);
		}

		if (XCH01232 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01232);
		}

		if (XCH01233 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01233);
		}

		if (XCH01234 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01234);
		}

		if (XCH01235 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01235);
		}

		if (XCH01236 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01236);
		}

		if (XCH01237 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01237);
		}

		if (XCH01238 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01238);
		}

		if (XCH01239 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01239);
		}

		if (XCH01240 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01240);
		}

		if (XCH01241 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01241);
		}

		if (XCH01242 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01242);
		}

		if (XCH01243 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01243);
		}

		if (XCH01244 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01244);
		}

		if (XCH01245 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01245);
		}

		if (XCH01246 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01246);
		}

		if (XCH01247 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01247);
		}

		if (XCH01248 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01248);
		}

		if (XCH01249 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01249);
		}

		if (XCH01250 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01250);
		}

		if (XCH01251 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01251);
		}

		if (XCH01252 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01252);
		}

		if (XCH01253 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01253);
		}

		if (XCH01254 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01254);
		}

		if (XCH01255 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01255);
		}

		if (XCH01256 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01256);
		}

		if (XCH01257 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01257);
		}

		if (XCH01258 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01258);
		}

		if (XCH01259 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01259);
		}

		if (XCH01260 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01260);
		}

		if (XCH01261 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01261);
		}

		if (XCH01262 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01262);
		}

		if (XCH01263 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01263);
		}

		if (XCH01264 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01264);
		}

		if (XCH01265 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01265);
		}

		if (XCH01266 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01266);
		}

		if (XCH01267 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01267);
		}

		if (XCH01268 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01268);
		}

		if (XCH01269 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01269);
		}

		if (XCH01270 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01270);
		}

		if (XCH01271 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01271);
		}

		if (XCH01272 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCH01272);
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
	public String XCH01001;
	public String XCH01002;
	public String XCH01003;
	public String XCH01004;
	public String XCH01005;
	public String XCH01006;
	public String XCH01007;
	public String XCH01008;
	public String XCH01009;
	public String XCH01010;
	public String XCH01011;
	public String XCH01012;
	public String XCH01013;
	public String XCH01014;
	public String XCH01016;
	public String XCH01017;
	public String XCH01019;
	public String XCH01020;
	public String XCH01021;
	public String XCH01022;
	public String XCH01024;
	public String XCH01025;
	public String XCH01026;
	public String XCH01027;
	public String XCH01028;
	public String XCH01030;
	public String XCH01031;
	public String XCH01032;
	public String XCH01033;
	public String XCH01034;
	public String XCH01035;
	public String XCH01036;
	public String XCH01037;
	public String XCH01038;
	public String XCH01039;
	public String XCH01040;
	public String XCH01041;
	public String XCH01042;
	public String XCH01043;
	public String XCH01044;
	public String XCH01045;
	public String XCH01046;
	public String XCH01047;
	public String XCH01049;
	public String XCH01050;
	public String XCH01051;
	public String XCH01052;
	public String XCH01053;
	public String XCH01054;
	public String XCH01055;
	public String XCH01056;
	public String XCH01057;
	public String XCH01058;
	public String XCH01059;
	public String XCH01060;
	public String XCH01062;
	public String XCH01063;
	public String XCH01064;
	public String XCH01065;
	public String XCH01066;
	public String XCH01067;
	public String XCH01068;
	public String XCH01069;
	public String XCH01100;
	public String XCH01101;
	public String XCH01102;
	public String XCH01103;
	public String XCH01104;
	public String XCH01105;
	public String XCH01106;
	public String XCH01107;
	public String XCH01108;
	public String XCH01109;
	public String XCH01110;
	public String XCH01111;
	public String XCH01112;
	public String XCH01113;
	public String XCH01114;
	public String XCH01115;
	public String XCH01116;
	public String XCH01117;
	public String XCH01118;
	public String XCH01119;
	public String XCH01120;
	public String XCH01121;
	public String XCH01122;
	public String XCH01123;
	public String XCH01124;
	public String XCH01125;
	public String XCH01126;
	public String XCH01127;
	public String XCH01128;
	public String XCH01129;
	public String XCH01130;
	public String XCH01131;
	public String XCH01132;
	public String XCH01133;
	public String XCH01134;
	public String XCH01135;
	public String XCH01136;
	public String XCH01137;
	public String XCH01138;
	public String XCH01139;
	public String XCH01140;
	public String XCH01141;
	public String XCH01142;
	public String XCH01143;
	public String XCH01144;
	public String XCH01145;
	public String XCH01146;
	public String XCH01147;
	public String XCH01148;
	public String XCH01149;
	public String XCH01150;
	public String XCH01151;
	public String XCH01152;
	public String XCH01153;
	public String XCH01154;
	public String XCH01155;
	public String XCH01156;
	public String XCH01157;
	public String XCH01158;
	public String XCH01159;
	public String XCH01160;
	public String XCH01161;
	public String XCH01162;
	public String XCH01163;
	public String XCH01164;
	public String XCH01165;
	public String XCH01166;
	public String XCH01167;
	public String XCH01168;
	public String XCH01169;
	public String XCH01170;
	public String XCH01171;
	public String XCH01172;
	public String XCH01173;
	public String XCH01174;
	public String XCH01175;
	public String XCH01176;
	public String XCH01177;
	public String XCH01178;
	public String XCH01179;
	public String XCH01180;
	public String XCH01181;
	public String XCH01182;
	public String XCH01183;
	public String XCH01184;
	public String XCH01185;
	public String XCH01186;
	public String XCH01187;
	public String XCH01188;
	public String XCH01189;
	public String XCH01190;
	public String XCH01191;
	public String XCH01192;
	public String XCH01193;
	public String XCH01194;
	public String XCH01195;
	public String XCH01196;
	public String XCH01197;
	public String XCH01198;
	public String XCH01199;
	public String XCH01200;
	public String XCH01201;
	public String XCH01202;
	public String XCH01203;
	public String XCH01204;
	public String XCH01205;
	public String XCH01206;
	public String XCH01207;
	public String XCH01208;
	public String XCH01209;
	public String XCH01210;
	public String XCH01211;
	public String XCH01212;
	public String XCH01213;
	public String XCH01214;
	public String XCH01215;
	public String XCH01216;
	public String XCH01217;
	public String XCH01218;
	public String XCH01219;
	public String XCH01220;
	public String XCH01221;
	public String XCH01222;
	public String XCH01223;
	public String XCH01224;
	public String XCH01225;
	public String XCH01226;
	public String XCH01227;
	public String XCH01228;
	public String XCH01229;
	public String XCH01230;
	public String XCH01231;
	public String XCH01232;
	public String XCH01233;
	public String XCH01234;
	public String XCH01235;
	public String XCH01236;
	public String XCH01237;
	public String XCH01238;
	public String XCH01239;
	public String XCH01240;
	public String XCH01241;
	public String XCH01242;
	public String XCH01243;
	public String XCH01244;
	public String XCH01245;
	public String XCH01246;
	public String XCH01247;
	public String XCH01248;
	public String XCH01249;
	public String XCH01250;
	public String XCH01251;
	public String XCH01252;
	public String XCH01253;
	public String XCH01254;
	public String XCH01255;
	public String XCH01256;
	public String XCH01257;
	public String XCH01258;
	public String XCH01259;
	public String XCH01260;
	public String XCH01261;
	public String XCH01262;
	public String XCH01263;
	public String XCH01264;
	public String XCH01265;
	public String XCH01266;
	public String XCH01267;
	public String XCH01268;
	public String XCH01269;
	public String XCH01270;
	public String XCH01271;
	public String XCH01272;
	public long modifyDate;
	public long syncDate;
}