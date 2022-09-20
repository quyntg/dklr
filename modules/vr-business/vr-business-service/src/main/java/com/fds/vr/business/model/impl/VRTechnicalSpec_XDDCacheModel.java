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

import com.fds.vr.business.model.VRTechnicalSpec_XDD;

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
 * The cache model class for representing VRTechnicalSpec_XDD in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XDD
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XDDCacheModel implements CacheModel<VRTechnicalSpec_XDD>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XDDCacheModel)) {
			return false;
		}

		VRTechnicalSpec_XDDCacheModel vrTechnicalSpec_XDDCacheModel = (VRTechnicalSpec_XDDCacheModel)obj;

		if (id == vrTechnicalSpec_XDDCacheModel.id) {
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
		StringBundler sb = new StringBundler(369);

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
		sb.append(", XDD01001=");
		sb.append(XDD01001);
		sb.append(", XDD01002=");
		sb.append(XDD01002);
		sb.append(", XDD01003=");
		sb.append(XDD01003);
		sb.append(", XDD01004=");
		sb.append(XDD01004);
		sb.append(", XDD01005=");
		sb.append(XDD01005);
		sb.append(", XDD01006=");
		sb.append(XDD01006);
		sb.append(", XDD01007=");
		sb.append(XDD01007);
		sb.append(", XDD01008=");
		sb.append(XDD01008);
		sb.append(", XDD01009=");
		sb.append(XDD01009);
		sb.append(", XDD01010=");
		sb.append(XDD01010);
		sb.append(", XDD01011=");
		sb.append(XDD01011);
		sb.append(", XDD01012=");
		sb.append(XDD01012);
		sb.append(", XDD01013=");
		sb.append(XDD01013);
		sb.append(", XDD01014=");
		sb.append(XDD01014);
		sb.append(", XDD01016=");
		sb.append(XDD01016);
		sb.append(", XDD01017=");
		sb.append(XDD01017);
		sb.append(", XDD01019=");
		sb.append(XDD01019);
		sb.append(", XDD01020=");
		sb.append(XDD01020);
		sb.append(", XDD01021=");
		sb.append(XDD01021);
		sb.append(", XDD01022=");
		sb.append(XDD01022);
		sb.append(", XDD01024=");
		sb.append(XDD01024);
		sb.append(", XDD01025=");
		sb.append(XDD01025);
		sb.append(", XDD01026=");
		sb.append(XDD01026);
		sb.append(", XDD01027=");
		sb.append(XDD01027);
		sb.append(", XDD01028=");
		sb.append(XDD01028);
		sb.append(", XDD01030=");
		sb.append(XDD01030);
		sb.append(", XDD01031=");
		sb.append(XDD01031);
		sb.append(", XDD01032=");
		sb.append(XDD01032);
		sb.append(", XDD01033=");
		sb.append(XDD01033);
		sb.append(", XDD01034=");
		sb.append(XDD01034);
		sb.append(", XDD01035=");
		sb.append(XDD01035);
		sb.append(", XDD01036=");
		sb.append(XDD01036);
		sb.append(", XDD01037=");
		sb.append(XDD01037);
		sb.append(", XDD01038=");
		sb.append(XDD01038);
		sb.append(", XDD01039=");
		sb.append(XDD01039);
		sb.append(", XDD01040=");
		sb.append(XDD01040);
		sb.append(", XDD01041=");
		sb.append(XDD01041);
		sb.append(", XDD01042=");
		sb.append(XDD01042);
		sb.append(", XDD01043=");
		sb.append(XDD01043);
		sb.append(", XDD01044=");
		sb.append(XDD01044);
		sb.append(", XDD01045=");
		sb.append(XDD01045);
		sb.append(", XDD01046=");
		sb.append(XDD01046);
		sb.append(", XDD01047=");
		sb.append(XDD01047);
		sb.append(", XDD01049=");
		sb.append(XDD01049);
		sb.append(", XDD01050=");
		sb.append(XDD01050);
		sb.append(", XDD01051=");
		sb.append(XDD01051);
		sb.append(", XDD01052=");
		sb.append(XDD01052);
		sb.append(", XDD01053=");
		sb.append(XDD01053);
		sb.append(", XDD01054=");
		sb.append(XDD01054);
		sb.append(", XDD01055=");
		sb.append(XDD01055);
		sb.append(", XDD01056=");
		sb.append(XDD01056);
		sb.append(", XDD01057=");
		sb.append(XDD01057);
		sb.append(", XDD01058=");
		sb.append(XDD01058);
		sb.append(", XDD01059=");
		sb.append(XDD01059);
		sb.append(", XDD01060=");
		sb.append(XDD01060);
		sb.append(", XDD0076=");
		sb.append(XDD0076);
		sb.append(", XDD0077=");
		sb.append(XDD0077);
		sb.append(", XDD0078=");
		sb.append(XDD0078);
		sb.append(", XDD0079=");
		sb.append(XDD0079);
		sb.append(", XDD0080=");
		sb.append(XDD0080);
		sb.append(", XDD0081=");
		sb.append(XDD0081);
		sb.append(", XDD0082=");
		sb.append(XDD0082);
		sb.append(", XDD0083=");
		sb.append(XDD0083);
		sb.append(", XDD0084=");
		sb.append(XDD0084);
		sb.append(", XDD0085=");
		sb.append(XDD0085);
		sb.append(", XDD0086=");
		sb.append(XDD0086);
		sb.append(", XDD0087=");
		sb.append(XDD0087);
		sb.append(", XDD0088=");
		sb.append(XDD0088);
		sb.append(", XDD0089=");
		sb.append(XDD0089);
		sb.append(", XDD0090=");
		sb.append(XDD0090);
		sb.append(", XDD0091=");
		sb.append(XDD0091);
		sb.append(", XDD0092=");
		sb.append(XDD0092);
		sb.append(", XDD0093=");
		sb.append(XDD0093);
		sb.append(", XDD0094=");
		sb.append(XDD0094);
		sb.append(", XDD0095=");
		sb.append(XDD0095);
		sb.append(", XDD0096=");
		sb.append(XDD0096);
		sb.append(", XDD0097=");
		sb.append(XDD0097);
		sb.append(", XDD0098=");
		sb.append(XDD0098);
		sb.append(", XDD0099=");
		sb.append(XDD0099);
		sb.append(", XDD0100=");
		sb.append(XDD0100);
		sb.append(", XDD0101=");
		sb.append(XDD0101);
		sb.append(", XDD0102=");
		sb.append(XDD0102);
		sb.append(", XDD0103=");
		sb.append(XDD0103);
		sb.append(", XDD0104=");
		sb.append(XDD0104);
		sb.append(", XDD0105=");
		sb.append(XDD0105);
		sb.append(", XDD0106=");
		sb.append(XDD0106);
		sb.append(", XDD0107=");
		sb.append(XDD0107);
		sb.append(", XDD0108=");
		sb.append(XDD0108);
		sb.append(", XDD0109=");
		sb.append(XDD0109);
		sb.append(", XDD0110=");
		sb.append(XDD0110);
		sb.append(", XDD0111=");
		sb.append(XDD0111);
		sb.append(", XDD0112=");
		sb.append(XDD0112);
		sb.append(", XDD0113=");
		sb.append(XDD0113);
		sb.append(", XDD0114=");
		sb.append(XDD0114);
		sb.append(", XDD0115=");
		sb.append(XDD0115);
		sb.append(", XDD0116=");
		sb.append(XDD0116);
		sb.append(", XDD0117=");
		sb.append(XDD0117);
		sb.append(", XDD0118=");
		sb.append(XDD0118);
		sb.append(", XDD0119=");
		sb.append(XDD0119);
		sb.append(", XDD0120=");
		sb.append(XDD0120);
		sb.append(", XDD0121=");
		sb.append(XDD0121);
		sb.append(", XDD0122=");
		sb.append(XDD0122);
		sb.append(", XDD0123=");
		sb.append(XDD0123);
		sb.append(", XDD0124=");
		sb.append(XDD0124);
		sb.append(", XDD0125=");
		sb.append(XDD0125);
		sb.append(", XDD0126=");
		sb.append(XDD0126);
		sb.append(", XDD0127=");
		sb.append(XDD0127);
		sb.append(", XDD0128=");
		sb.append(XDD0128);
		sb.append(", XDD0129=");
		sb.append(XDD0129);
		sb.append(", XDD0130=");
		sb.append(XDD0130);
		sb.append(", XDD0131=");
		sb.append(XDD0131);
		sb.append(", XDD0132=");
		sb.append(XDD0132);
		sb.append(", XDD0133=");
		sb.append(XDD0133);
		sb.append(", XDD0134=");
		sb.append(XDD0134);
		sb.append(", XDD0135=");
		sb.append(XDD0135);
		sb.append(", XDD0136=");
		sb.append(XDD0136);
		sb.append(", XDD0137=");
		sb.append(XDD0137);
		sb.append(", XDD0138=");
		sb.append(XDD0138);
		sb.append(", XDD0139=");
		sb.append(XDD0139);
		sb.append(", XDD0140=");
		sb.append(XDD0140);
		sb.append(", XDD0141=");
		sb.append(XDD0141);
		sb.append(", XDD0142=");
		sb.append(XDD0142);
		sb.append(", XDD0143=");
		sb.append(XDD0143);
		sb.append(", XDD0144=");
		sb.append(XDD0144);
		sb.append(", XDD0145=");
		sb.append(XDD0145);
		sb.append(", XDD0146=");
		sb.append(XDD0146);
		sb.append(", XDD0147=");
		sb.append(XDD0147);
		sb.append(", XDD0148=");
		sb.append(XDD0148);
		sb.append(", XDD0149=");
		sb.append(XDD0149);
		sb.append(", XDD0150=");
		sb.append(XDD0150);
		sb.append(", XDD0151=");
		sb.append(XDD0151);
		sb.append(", XDD0152=");
		sb.append(XDD0152);
		sb.append(", XDD0153=");
		sb.append(XDD0153);
		sb.append(", XDD0154=");
		sb.append(XDD0154);
		sb.append(", XDD0155=");
		sb.append(XDD0155);
		sb.append(", XDD0156=");
		sb.append(XDD0156);
		sb.append(", XDD0157=");
		sb.append(XDD0157);
		sb.append(", XDD0158=");
		sb.append(XDD0158);
		sb.append(", XDD0159=");
		sb.append(XDD0159);
		sb.append(", XDD0160=");
		sb.append(XDD0160);
		sb.append(", XDD0161=");
		sb.append(XDD0161);
		sb.append(", BBCNCLKLXDD001=");
		sb.append(BBCNCLKLXDD001);
		sb.append(", BBCNCLKLXDD002=");
		sb.append(BBCNCLKLXDD002);
		sb.append(", BBCNCLKLXDD003=");
		sb.append(BBCNCLKLXDD003);
		sb.append(", BBCNCLKLXDD004=");
		sb.append(BBCNCLKLXDD004);
		sb.append(", BBCNCLKLXDD005=");
		sb.append(BBCNCLKLXDD005);
		sb.append(", BBCNCLKLXDD006=");
		sb.append(BBCNCLKLXDD006);
		sb.append(", BBCNCLKLXDD007=");
		sb.append(BBCNCLKLXDD007);
		sb.append(", BBCNCLKLXDD008=");
		sb.append(BBCNCLKLXDD008);
		sb.append(", BBCNCLKLXDD009=");
		sb.append(BBCNCLKLXDD009);
		sb.append(", BBCNCLKLXDD010=");
		sb.append(BBCNCLKLXDD010);
		sb.append(", BBCNCLKLXDD011=");
		sb.append(BBCNCLKLXDD011);
		sb.append(", BBCNCLKLXDD012=");
		sb.append(BBCNCLKLXDD012);
		sb.append(", BBCNCLKLXDD013=");
		sb.append(BBCNCLKLXDD013);
		sb.append(", BBCNCLKLXDD014=");
		sb.append(BBCNCLKLXDD014);
		sb.append(", BBCNCLKLXDD015=");
		sb.append(BBCNCLKLXDD015);
		sb.append(", BBCNCLKLXDD016=");
		sb.append(BBCNCLKLXDD016);
		sb.append(", BBCNCLKLXDD019=");
		sb.append(BBCNCLKLXDD019);
		sb.append(", BBCNCLKLXDD017=");
		sb.append(BBCNCLKLXDD017);
		sb.append(", BBCNCLKLXDD020=");
		sb.append(BBCNCLKLXDD020);
		sb.append(", BBCNCLKLXDD018=");
		sb.append(BBCNCLKLXDD018);
		sb.append(", BBCNCLKLXDD021=");
		sb.append(BBCNCLKLXDD021);
		sb.append(", BBCNCLKLXDD022=");
		sb.append(BBCNCLKLXDD022);
		sb.append(", BBCNCLKLXDD023=");
		sb.append(BBCNCLKLXDD023);
		sb.append(", BBCNCLKLXDD024=");
		sb.append(BBCNCLKLXDD024);
		sb.append(", BBCNCLKLXDD025=");
		sb.append(BBCNCLKLXDD025);
		sb.append(", BBCNCLKLXDD026=");
		sb.append(BBCNCLKLXDD026);
		sb.append(", BBCNCLKLXDD027=");
		sb.append(BBCNCLKLXDD027);
		sb.append(", BBCNCLKLXDD028=");
		sb.append(BBCNCLKLXDD028);
		sb.append(", BBCNCLKLXDD029=");
		sb.append(BBCNCLKLXDD029);
		sb.append(", BBCNCLKLXDD031=");
		sb.append(BBCNCLKLXDD031);
		sb.append(", BBCNCLKLXDD032=");
		sb.append(BBCNCLKLXDD032);
		sb.append(", BBCNCLKLXDD033=");
		sb.append(BBCNCLKLXDD033);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XDD toEntityModel() {
		VRTechnicalSpec_XDDImpl vrTechnicalSpec_XDDImpl = new VRTechnicalSpec_XDDImpl();

		vrTechnicalSpec_XDDImpl.setId(id);
		vrTechnicalSpec_XDDImpl.setMtCore(mtCore);
		vrTechnicalSpec_XDDImpl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XDDImpl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XDDImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XDDImpl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XDDImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XDDImpl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XDDImpl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XDD01001 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01001(XDD01001);
		}

		if (XDD01002 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01002(XDD01002);
		}

		if (XDD01003 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01003(XDD01003);
		}

		if (XDD01004 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01004(XDD01004);
		}

		if (XDD01005 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01005(XDD01005);
		}

		if (XDD01006 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01006(XDD01006);
		}

		if (XDD01007 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01007(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01007(XDD01007);
		}

		if (XDD01008 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01008(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01008(XDD01008);
		}

		if (XDD01009 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01009(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01009(XDD01009);
		}

		if (XDD01010 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01010(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01010(XDD01010);
		}

		if (XDD01011 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01011(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01011(XDD01011);
		}

		if (XDD01012 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01012(XDD01012);
		}

		if (XDD01013 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01013(XDD01013);
		}

		if (XDD01014 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01014(XDD01014);
		}

		if (XDD01016 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01016(XDD01016);
		}

		if (XDD01017 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01017(XDD01017);
		}

		if (XDD01019 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01019(XDD01019);
		}

		if (XDD01020 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01020(XDD01020);
		}

		if (XDD01021 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01021(XDD01021);
		}

		if (XDD01022 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01022(XDD01022);
		}

		if (XDD01024 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01024(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01024(XDD01024);
		}

		if (XDD01025 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01025(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01025(XDD01025);
		}

		if (XDD01026 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01026(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01026(XDD01026);
		}

		if (XDD01027 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01027(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01027(XDD01027);
		}

		if (XDD01028 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01028(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01028(XDD01028);
		}

		if (XDD01030 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01030(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01030(XDD01030);
		}

		if (XDD01031 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01031(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01031(XDD01031);
		}

		if (XDD01032 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01032(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01032(XDD01032);
		}

		if (XDD01033 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01033(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01033(XDD01033);
		}

		if (XDD01034 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01034(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01034(XDD01034);
		}

		if (XDD01035 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01035(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01035(XDD01035);
		}

		if (XDD01036 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01036(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01036(XDD01036);
		}

		if (XDD01037 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01037(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01037(XDD01037);
		}

		if (XDD01038 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01038(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01038(XDD01038);
		}

		if (XDD01039 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01039(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01039(XDD01039);
		}

		if (XDD01040 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01040(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01040(XDD01040);
		}

		if (XDD01041 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01041(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01041(XDD01041);
		}

		if (XDD01042 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01042(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01042(XDD01042);
		}

		if (XDD01043 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01043(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01043(XDD01043);
		}

		if (XDD01044 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01044(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01044(XDD01044);
		}

		if (XDD01045 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01045(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01045(XDD01045);
		}

		if (XDD01046 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01046(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01046(XDD01046);
		}

		if (XDD01047 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01047(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01047(XDD01047);
		}

		if (XDD01049 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01049(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01049(XDD01049);
		}

		if (XDD01050 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01050(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01050(XDD01050);
		}

		if (XDD01051 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01051(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01051(XDD01051);
		}

		if (XDD01052 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01052(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01052(XDD01052);
		}

		if (XDD01053 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01053(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01053(XDD01053);
		}

		if (XDD01054 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01054(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01054(XDD01054);
		}

		if (XDD01055 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01055(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01055(XDD01055);
		}

		if (XDD01056 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01056(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01056(XDD01056);
		}

		if (XDD01057 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01057(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01057(XDD01057);
		}

		if (XDD01058 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01058(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01058(XDD01058);
		}

		if (XDD01059 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01059(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01059(XDD01059);
		}

		if (XDD01060 == null) {
			vrTechnicalSpec_XDDImpl.setXDD01060(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD01060(XDD01060);
		}

		if (XDD0076 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0076(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0076(XDD0076);
		}

		if (XDD0077 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0077(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0077(XDD0077);
		}

		if (XDD0078 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0078(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0078(XDD0078);
		}

		if (XDD0079 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0079(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0079(XDD0079);
		}

		if (XDD0080 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0080(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0080(XDD0080);
		}

		if (XDD0081 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0081(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0081(XDD0081);
		}

		if (XDD0082 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0082(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0082(XDD0082);
		}

		if (XDD0083 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0083(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0083(XDD0083);
		}

		if (XDD0084 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0084(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0084(XDD0084);
		}

		if (XDD0085 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0085(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0085(XDD0085);
		}

		if (XDD0086 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0086(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0086(XDD0086);
		}

		if (XDD0087 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0087(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0087(XDD0087);
		}

		if (XDD0088 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0088(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0088(XDD0088);
		}

		if (XDD0089 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0089(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0089(XDD0089);
		}

		if (XDD0090 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0090(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0090(XDD0090);
		}

		if (XDD0091 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0091(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0091(XDD0091);
		}

		if (XDD0092 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0092(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0092(XDD0092);
		}

		if (XDD0093 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0093(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0093(XDD0093);
		}

		if (XDD0094 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0094(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0094(XDD0094);
		}

		if (XDD0095 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0095(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0095(XDD0095);
		}

		if (XDD0096 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0096(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0096(XDD0096);
		}

		if (XDD0097 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0097(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0097(XDD0097);
		}

		if (XDD0098 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0098(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0098(XDD0098);
		}

		if (XDD0099 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0099(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0099(XDD0099);
		}

		if (XDD0100 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0100(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0100(XDD0100);
		}

		if (XDD0101 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0101(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0101(XDD0101);
		}

		if (XDD0102 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0102(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0102(XDD0102);
		}

		if (XDD0103 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0103(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0103(XDD0103);
		}

		if (XDD0104 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0104(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0104(XDD0104);
		}

		if (XDD0105 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0105(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0105(XDD0105);
		}

		if (XDD0106 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0106(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0106(XDD0106);
		}

		if (XDD0107 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0107(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0107(XDD0107);
		}

		if (XDD0108 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0108(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0108(XDD0108);
		}

		if (XDD0109 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0109(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0109(XDD0109);
		}

		if (XDD0110 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0110(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0110(XDD0110);
		}

		if (XDD0111 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0111(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0111(XDD0111);
		}

		if (XDD0112 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0112(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0112(XDD0112);
		}

		if (XDD0113 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0113(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0113(XDD0113);
		}

		if (XDD0114 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0114(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0114(XDD0114);
		}

		if (XDD0115 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0115(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0115(XDD0115);
		}

		if (XDD0116 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0116(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0116(XDD0116);
		}

		if (XDD0117 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0117(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0117(XDD0117);
		}

		if (XDD0118 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0118(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0118(XDD0118);
		}

		if (XDD0119 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0119(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0119(XDD0119);
		}

		if (XDD0120 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0120(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0120(XDD0120);
		}

		if (XDD0121 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0121(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0121(XDD0121);
		}

		if (XDD0122 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0122(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0122(XDD0122);
		}

		if (XDD0123 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0123(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0123(XDD0123);
		}

		if (XDD0124 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0124(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0124(XDD0124);
		}

		if (XDD0125 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0125(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0125(XDD0125);
		}

		if (XDD0126 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0126(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0126(XDD0126);
		}

		if (XDD0127 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0127(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0127(XDD0127);
		}

		if (XDD0128 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0128(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0128(XDD0128);
		}

		if (XDD0129 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0129(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0129(XDD0129);
		}

		if (XDD0130 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0130(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0130(XDD0130);
		}

		if (XDD0131 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0131(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0131(XDD0131);
		}

		if (XDD0132 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0132(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0132(XDD0132);
		}

		if (XDD0133 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0133(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0133(XDD0133);
		}

		if (XDD0134 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0134(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0134(XDD0134);
		}

		if (XDD0135 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0135(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0135(XDD0135);
		}

		if (XDD0136 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0136(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0136(XDD0136);
		}

		if (XDD0137 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0137(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0137(XDD0137);
		}

		if (XDD0138 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0138(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0138(XDD0138);
		}

		if (XDD0139 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0139(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0139(XDD0139);
		}

		if (XDD0140 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0140(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0140(XDD0140);
		}

		if (XDD0141 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0141(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0141(XDD0141);
		}

		if (XDD0142 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0142(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0142(XDD0142);
		}

		if (XDD0143 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0143(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0143(XDD0143);
		}

		if (XDD0144 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0144(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0144(XDD0144);
		}

		if (XDD0145 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0145(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0145(XDD0145);
		}

		if (XDD0146 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0146(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0146(XDD0146);
		}

		if (XDD0147 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0147(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0147(XDD0147);
		}

		if (XDD0148 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0148(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0148(XDD0148);
		}

		if (XDD0149 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0149(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0149(XDD0149);
		}

		if (XDD0150 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0150(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0150(XDD0150);
		}

		if (XDD0151 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0151(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0151(XDD0151);
		}

		if (XDD0152 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0152(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0152(XDD0152);
		}

		if (XDD0153 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0153(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0153(XDD0153);
		}

		if (XDD0154 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0154(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0154(XDD0154);
		}

		if (XDD0155 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0155(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0155(XDD0155);
		}

		if (XDD0156 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0156(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0156(XDD0156);
		}

		if (XDD0157 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0157(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0157(XDD0157);
		}

		if (XDD0158 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0158(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0158(XDD0158);
		}

		if (XDD0159 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0159(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0159(XDD0159);
		}

		if (XDD0160 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0160(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0160(XDD0160);
		}

		if (XDD0161 == null) {
			vrTechnicalSpec_XDDImpl.setXDD0161(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setXDD0161(XDD0161);
		}

		if (BBCNCLKLXDD001 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD001(BBCNCLKLXDD001);
		}

		if (BBCNCLKLXDD002 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD002(BBCNCLKLXDD002);
		}

		if (BBCNCLKLXDD003 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD003(BBCNCLKLXDD003);
		}

		if (BBCNCLKLXDD004 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD004(BBCNCLKLXDD004);
		}

		if (BBCNCLKLXDD005 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD005(BBCNCLKLXDD005);
		}

		if (BBCNCLKLXDD006 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD006(BBCNCLKLXDD006);
		}

		if (BBCNCLKLXDD007 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD007(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD007(BBCNCLKLXDD007);
		}

		if (BBCNCLKLXDD008 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD008(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD008(BBCNCLKLXDD008);
		}

		if (BBCNCLKLXDD009 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD009(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD009(BBCNCLKLXDD009);
		}

		if (BBCNCLKLXDD010 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD010(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD010(BBCNCLKLXDD010);
		}

		if (BBCNCLKLXDD011 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD011(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD011(BBCNCLKLXDD011);
		}

		if (BBCNCLKLXDD012 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD012(BBCNCLKLXDD012);
		}

		if (BBCNCLKLXDD013 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD013(BBCNCLKLXDD013);
		}

		if (BBCNCLKLXDD014 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD014(BBCNCLKLXDD014);
		}

		if (BBCNCLKLXDD015 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD015(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD015(BBCNCLKLXDD015);
		}

		if (BBCNCLKLXDD016 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD016(BBCNCLKLXDD016);
		}

		if (BBCNCLKLXDD019 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD019(BBCNCLKLXDD019);
		}

		if (BBCNCLKLXDD017 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD017(BBCNCLKLXDD017);
		}

		if (BBCNCLKLXDD020 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD020(BBCNCLKLXDD020);
		}

		if (BBCNCLKLXDD018 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD018(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD018(BBCNCLKLXDD018);
		}

		if (BBCNCLKLXDD021 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD021(BBCNCLKLXDD021);
		}

		if (BBCNCLKLXDD022 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD022(BBCNCLKLXDD022);
		}

		if (BBCNCLKLXDD023 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD023(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD023(BBCNCLKLXDD023);
		}

		if (BBCNCLKLXDD024 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD024(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD024(BBCNCLKLXDD024);
		}

		if (BBCNCLKLXDD025 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD025(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD025(BBCNCLKLXDD025);
		}

		if (BBCNCLKLXDD026 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD026(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD026(BBCNCLKLXDD026);
		}

		if (BBCNCLKLXDD027 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD027(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD027(BBCNCLKLXDD027);
		}

		if (BBCNCLKLXDD028 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD028(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD028(BBCNCLKLXDD028);
		}

		if (BBCNCLKLXDD029 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD029(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD029(BBCNCLKLXDD029);
		}

		if (BBCNCLKLXDD031 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD031(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD031(BBCNCLKLXDD031);
		}

		if (BBCNCLKLXDD032 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD032(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD032(BBCNCLKLXDD032);
		}

		if (BBCNCLKLXDD033 == null) {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD033(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD033(BBCNCLKLXDD033);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XDDImpl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XDDImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XDDImpl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XDDImpl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XDDImpl.resetOriginalValues();

		return vrTechnicalSpec_XDDImpl;
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
		XDD01001 = objectInput.readUTF();
		XDD01002 = objectInput.readUTF();
		XDD01003 = objectInput.readUTF();
		XDD01004 = objectInput.readUTF();
		XDD01005 = objectInput.readUTF();
		XDD01006 = objectInput.readUTF();
		XDD01007 = objectInput.readUTF();
		XDD01008 = objectInput.readUTF();
		XDD01009 = objectInput.readUTF();
		XDD01010 = objectInput.readUTF();
		XDD01011 = objectInput.readUTF();
		XDD01012 = objectInput.readUTF();
		XDD01013 = objectInput.readUTF();
		XDD01014 = objectInput.readUTF();
		XDD01016 = objectInput.readUTF();
		XDD01017 = objectInput.readUTF();
		XDD01019 = objectInput.readUTF();
		XDD01020 = objectInput.readUTF();
		XDD01021 = objectInput.readUTF();
		XDD01022 = objectInput.readUTF();
		XDD01024 = objectInput.readUTF();
		XDD01025 = objectInput.readUTF();
		XDD01026 = objectInput.readUTF();
		XDD01027 = objectInput.readUTF();
		XDD01028 = objectInput.readUTF();
		XDD01030 = objectInput.readUTF();
		XDD01031 = objectInput.readUTF();
		XDD01032 = objectInput.readUTF();
		XDD01033 = objectInput.readUTF();
		XDD01034 = objectInput.readUTF();
		XDD01035 = objectInput.readUTF();
		XDD01036 = objectInput.readUTF();
		XDD01037 = objectInput.readUTF();
		XDD01038 = objectInput.readUTF();
		XDD01039 = objectInput.readUTF();
		XDD01040 = objectInput.readUTF();
		XDD01041 = objectInput.readUTF();
		XDD01042 = objectInput.readUTF();
		XDD01043 = objectInput.readUTF();
		XDD01044 = objectInput.readUTF();
		XDD01045 = objectInput.readUTF();
		XDD01046 = objectInput.readUTF();
		XDD01047 = objectInput.readUTF();
		XDD01049 = objectInput.readUTF();
		XDD01050 = objectInput.readUTF();
		XDD01051 = objectInput.readUTF();
		XDD01052 = objectInput.readUTF();
		XDD01053 = objectInput.readUTF();
		XDD01054 = objectInput.readUTF();
		XDD01055 = objectInput.readUTF();
		XDD01056 = objectInput.readUTF();
		XDD01057 = objectInput.readUTF();
		XDD01058 = objectInput.readUTF();
		XDD01059 = objectInput.readUTF();
		XDD01060 = objectInput.readUTF();
		XDD0076 = objectInput.readUTF();
		XDD0077 = objectInput.readUTF();
		XDD0078 = objectInput.readUTF();
		XDD0079 = objectInput.readUTF();
		XDD0080 = objectInput.readUTF();
		XDD0081 = objectInput.readUTF();
		XDD0082 = objectInput.readUTF();
		XDD0083 = objectInput.readUTF();
		XDD0084 = objectInput.readUTF();
		XDD0085 = objectInput.readUTF();
		XDD0086 = objectInput.readUTF();
		XDD0087 = objectInput.readUTF();
		XDD0088 = objectInput.readUTF();
		XDD0089 = objectInput.readUTF();
		XDD0090 = objectInput.readUTF();
		XDD0091 = objectInput.readUTF();
		XDD0092 = objectInput.readUTF();
		XDD0093 = objectInput.readUTF();
		XDD0094 = objectInput.readUTF();
		XDD0095 = objectInput.readUTF();
		XDD0096 = objectInput.readUTF();
		XDD0097 = objectInput.readUTF();
		XDD0098 = objectInput.readUTF();
		XDD0099 = objectInput.readUTF();
		XDD0100 = objectInput.readUTF();
		XDD0101 = objectInput.readUTF();
		XDD0102 = objectInput.readUTF();
		XDD0103 = objectInput.readUTF();
		XDD0104 = objectInput.readUTF();
		XDD0105 = objectInput.readUTF();
		XDD0106 = objectInput.readUTF();
		XDD0107 = objectInput.readUTF();
		XDD0108 = objectInput.readUTF();
		XDD0109 = objectInput.readUTF();
		XDD0110 = objectInput.readUTF();
		XDD0111 = objectInput.readUTF();
		XDD0112 = objectInput.readUTF();
		XDD0113 = objectInput.readUTF();
		XDD0114 = objectInput.readUTF();
		XDD0115 = objectInput.readUTF();
		XDD0116 = objectInput.readUTF();
		XDD0117 = objectInput.readUTF();
		XDD0118 = objectInput.readUTF();
		XDD0119 = objectInput.readUTF();
		XDD0120 = objectInput.readUTF();
		XDD0121 = objectInput.readUTF();
		XDD0122 = objectInput.readUTF();
		XDD0123 = objectInput.readUTF();
		XDD0124 = objectInput.readUTF();
		XDD0125 = objectInput.readUTF();
		XDD0126 = objectInput.readUTF();
		XDD0127 = objectInput.readUTF();
		XDD0128 = objectInput.readUTF();
		XDD0129 = objectInput.readUTF();
		XDD0130 = objectInput.readUTF();
		XDD0131 = objectInput.readUTF();
		XDD0132 = objectInput.readUTF();
		XDD0133 = objectInput.readUTF();
		XDD0134 = objectInput.readUTF();
		XDD0135 = objectInput.readUTF();
		XDD0136 = objectInput.readUTF();
		XDD0137 = objectInput.readUTF();
		XDD0138 = objectInput.readUTF();
		XDD0139 = objectInput.readUTF();
		XDD0140 = objectInput.readUTF();
		XDD0141 = objectInput.readUTF();
		XDD0142 = objectInput.readUTF();
		XDD0143 = objectInput.readUTF();
		XDD0144 = objectInput.readUTF();
		XDD0145 = objectInput.readUTF();
		XDD0146 = objectInput.readUTF();
		XDD0147 = objectInput.readUTF();
		XDD0148 = objectInput.readUTF();
		XDD0149 = objectInput.readUTF();
		XDD0150 = objectInput.readUTF();
		XDD0151 = objectInput.readUTF();
		XDD0152 = objectInput.readUTF();
		XDD0153 = objectInput.readUTF();
		XDD0154 = objectInput.readUTF();
		XDD0155 = objectInput.readUTF();
		XDD0156 = objectInput.readUTF();
		XDD0157 = objectInput.readUTF();
		XDD0158 = objectInput.readUTF();
		XDD0159 = objectInput.readUTF();
		XDD0160 = objectInput.readUTF();
		XDD0161 = objectInput.readUTF();
		BBCNCLKLXDD001 = objectInput.readUTF();
		BBCNCLKLXDD002 = objectInput.readUTF();
		BBCNCLKLXDD003 = objectInput.readUTF();
		BBCNCLKLXDD004 = objectInput.readUTF();
		BBCNCLKLXDD005 = objectInput.readUTF();
		BBCNCLKLXDD006 = objectInput.readUTF();
		BBCNCLKLXDD007 = objectInput.readUTF();
		BBCNCLKLXDD008 = objectInput.readUTF();
		BBCNCLKLXDD009 = objectInput.readUTF();
		BBCNCLKLXDD010 = objectInput.readUTF();
		BBCNCLKLXDD011 = objectInput.readUTF();
		BBCNCLKLXDD012 = objectInput.readUTF();
		BBCNCLKLXDD013 = objectInput.readUTF();
		BBCNCLKLXDD014 = objectInput.readUTF();
		BBCNCLKLXDD015 = objectInput.readUTF();
		BBCNCLKLXDD016 = objectInput.readUTF();
		BBCNCLKLXDD019 = objectInput.readUTF();
		BBCNCLKLXDD017 = objectInput.readUTF();
		BBCNCLKLXDD020 = objectInput.readUTF();
		BBCNCLKLXDD018 = objectInput.readUTF();
		BBCNCLKLXDD021 = objectInput.readUTF();
		BBCNCLKLXDD022 = objectInput.readUTF();
		BBCNCLKLXDD023 = objectInput.readUTF();
		BBCNCLKLXDD024 = objectInput.readUTF();
		BBCNCLKLXDD025 = objectInput.readUTF();
		BBCNCLKLXDD026 = objectInput.readUTF();
		BBCNCLKLXDD027 = objectInput.readUTF();
		BBCNCLKLXDD028 = objectInput.readUTF();
		BBCNCLKLXDD029 = objectInput.readUTF();
		BBCNCLKLXDD031 = objectInput.readUTF();
		BBCNCLKLXDD032 = objectInput.readUTF();
		BBCNCLKLXDD033 = objectInput.readUTF();
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

		if (XDD01001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01001);
		}

		if (XDD01002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01002);
		}

		if (XDD01003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01003);
		}

		if (XDD01004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01004);
		}

		if (XDD01005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01005);
		}

		if (XDD01006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01006);
		}

		if (XDD01007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01007);
		}

		if (XDD01008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01008);
		}

		if (XDD01009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01009);
		}

		if (XDD01010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01010);
		}

		if (XDD01011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01011);
		}

		if (XDD01012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01012);
		}

		if (XDD01013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01013);
		}

		if (XDD01014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01014);
		}

		if (XDD01016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01016);
		}

		if (XDD01017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01017);
		}

		if (XDD01019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01019);
		}

		if (XDD01020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01020);
		}

		if (XDD01021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01021);
		}

		if (XDD01022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01022);
		}

		if (XDD01024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01024);
		}

		if (XDD01025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01025);
		}

		if (XDD01026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01026);
		}

		if (XDD01027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01027);
		}

		if (XDD01028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01028);
		}

		if (XDD01030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01030);
		}

		if (XDD01031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01031);
		}

		if (XDD01032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01032);
		}

		if (XDD01033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01033);
		}

		if (XDD01034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01034);
		}

		if (XDD01035 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01035);
		}

		if (XDD01036 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01036);
		}

		if (XDD01037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01037);
		}

		if (XDD01038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01038);
		}

		if (XDD01039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01039);
		}

		if (XDD01040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01040);
		}

		if (XDD01041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01041);
		}

		if (XDD01042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01042);
		}

		if (XDD01043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01043);
		}

		if (XDD01044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01044);
		}

		if (XDD01045 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01045);
		}

		if (XDD01046 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01046);
		}

		if (XDD01047 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01047);
		}

		if (XDD01049 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01049);
		}

		if (XDD01050 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01050);
		}

		if (XDD01051 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01051);
		}

		if (XDD01052 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01052);
		}

		if (XDD01053 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01053);
		}

		if (XDD01054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01054);
		}

		if (XDD01055 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01055);
		}

		if (XDD01056 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01056);
		}

		if (XDD01057 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01057);
		}

		if (XDD01058 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01058);
		}

		if (XDD01059 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01059);
		}

		if (XDD01060 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD01060);
		}

		if (XDD0076 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0076);
		}

		if (XDD0077 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0077);
		}

		if (XDD0078 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0078);
		}

		if (XDD0079 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0079);
		}

		if (XDD0080 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0080);
		}

		if (XDD0081 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0081);
		}

		if (XDD0082 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0082);
		}

		if (XDD0083 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0083);
		}

		if (XDD0084 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0084);
		}

		if (XDD0085 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0085);
		}

		if (XDD0086 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0086);
		}

		if (XDD0087 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0087);
		}

		if (XDD0088 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0088);
		}

		if (XDD0089 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0089);
		}

		if (XDD0090 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0090);
		}

		if (XDD0091 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0091);
		}

		if (XDD0092 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0092);
		}

		if (XDD0093 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0093);
		}

		if (XDD0094 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0094);
		}

		if (XDD0095 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0095);
		}

		if (XDD0096 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0096);
		}

		if (XDD0097 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0097);
		}

		if (XDD0098 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0098);
		}

		if (XDD0099 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0099);
		}

		if (XDD0100 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0100);
		}

		if (XDD0101 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0101);
		}

		if (XDD0102 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0102);
		}

		if (XDD0103 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0103);
		}

		if (XDD0104 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0104);
		}

		if (XDD0105 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0105);
		}

		if (XDD0106 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0106);
		}

		if (XDD0107 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0107);
		}

		if (XDD0108 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0108);
		}

		if (XDD0109 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0109);
		}

		if (XDD0110 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0110);
		}

		if (XDD0111 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0111);
		}

		if (XDD0112 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0112);
		}

		if (XDD0113 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0113);
		}

		if (XDD0114 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0114);
		}

		if (XDD0115 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0115);
		}

		if (XDD0116 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0116);
		}

		if (XDD0117 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0117);
		}

		if (XDD0118 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0118);
		}

		if (XDD0119 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0119);
		}

		if (XDD0120 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0120);
		}

		if (XDD0121 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0121);
		}

		if (XDD0122 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0122);
		}

		if (XDD0123 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0123);
		}

		if (XDD0124 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0124);
		}

		if (XDD0125 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0125);
		}

		if (XDD0126 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0126);
		}

		if (XDD0127 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0127);
		}

		if (XDD0128 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0128);
		}

		if (XDD0129 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0129);
		}

		if (XDD0130 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0130);
		}

		if (XDD0131 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0131);
		}

		if (XDD0132 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0132);
		}

		if (XDD0133 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0133);
		}

		if (XDD0134 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0134);
		}

		if (XDD0135 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0135);
		}

		if (XDD0136 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0136);
		}

		if (XDD0137 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0137);
		}

		if (XDD0138 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0138);
		}

		if (XDD0139 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0139);
		}

		if (XDD0140 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0140);
		}

		if (XDD0141 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0141);
		}

		if (XDD0142 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0142);
		}

		if (XDD0143 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0143);
		}

		if (XDD0144 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0144);
		}

		if (XDD0145 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0145);
		}

		if (XDD0146 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0146);
		}

		if (XDD0147 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0147);
		}

		if (XDD0148 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0148);
		}

		if (XDD0149 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0149);
		}

		if (XDD0150 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0150);
		}

		if (XDD0151 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0151);
		}

		if (XDD0152 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0152);
		}

		if (XDD0153 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0153);
		}

		if (XDD0154 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0154);
		}

		if (XDD0155 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0155);
		}

		if (XDD0156 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0156);
		}

		if (XDD0157 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0157);
		}

		if (XDD0158 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0158);
		}

		if (XDD0159 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0159);
		}

		if (XDD0160 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0160);
		}

		if (XDD0161 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0161);
		}

		if (BBCNCLKLXDD001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD001);
		}

		if (BBCNCLKLXDD002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD002);
		}

		if (BBCNCLKLXDD003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD003);
		}

		if (BBCNCLKLXDD004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD004);
		}

		if (BBCNCLKLXDD005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD005);
		}

		if (BBCNCLKLXDD006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD006);
		}

		if (BBCNCLKLXDD007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD007);
		}

		if (BBCNCLKLXDD008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD008);
		}

		if (BBCNCLKLXDD009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD009);
		}

		if (BBCNCLKLXDD010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD010);
		}

		if (BBCNCLKLXDD011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD011);
		}

		if (BBCNCLKLXDD012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD012);
		}

		if (BBCNCLKLXDD013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD013);
		}

		if (BBCNCLKLXDD014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD014);
		}

		if (BBCNCLKLXDD015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD015);
		}

		if (BBCNCLKLXDD016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD016);
		}

		if (BBCNCLKLXDD019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD019);
		}

		if (BBCNCLKLXDD017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD017);
		}

		if (BBCNCLKLXDD020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD020);
		}

		if (BBCNCLKLXDD018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD018);
		}

		if (BBCNCLKLXDD021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD021);
		}

		if (BBCNCLKLXDD022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD022);
		}

		if (BBCNCLKLXDD023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD023);
		}

		if (BBCNCLKLXDD024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD024);
		}

		if (BBCNCLKLXDD025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD025);
		}

		if (BBCNCLKLXDD026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD026);
		}

		if (BBCNCLKLXDD027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD027);
		}

		if (BBCNCLKLXDD028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD028);
		}

		if (BBCNCLKLXDD029 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD029);
		}

		if (BBCNCLKLXDD031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD031);
		}

		if (BBCNCLKLXDD032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD032);
		}

		if (BBCNCLKLXDD033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXDD033);
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
	public String XDD01001;
	public String XDD01002;
	public String XDD01003;
	public String XDD01004;
	public String XDD01005;
	public String XDD01006;
	public String XDD01007;
	public String XDD01008;
	public String XDD01009;
	public String XDD01010;
	public String XDD01011;
	public String XDD01012;
	public String XDD01013;
	public String XDD01014;
	public String XDD01016;
	public String XDD01017;
	public String XDD01019;
	public String XDD01020;
	public String XDD01021;
	public String XDD01022;
	public String XDD01024;
	public String XDD01025;
	public String XDD01026;
	public String XDD01027;
	public String XDD01028;
	public String XDD01030;
	public String XDD01031;
	public String XDD01032;
	public String XDD01033;
	public String XDD01034;
	public String XDD01035;
	public String XDD01036;
	public String XDD01037;
	public String XDD01038;
	public String XDD01039;
	public String XDD01040;
	public String XDD01041;
	public String XDD01042;
	public String XDD01043;
	public String XDD01044;
	public String XDD01045;
	public String XDD01046;
	public String XDD01047;
	public String XDD01049;
	public String XDD01050;
	public String XDD01051;
	public String XDD01052;
	public String XDD01053;
	public String XDD01054;
	public String XDD01055;
	public String XDD01056;
	public String XDD01057;
	public String XDD01058;
	public String XDD01059;
	public String XDD01060;
	public String XDD0076;
	public String XDD0077;
	public String XDD0078;
	public String XDD0079;
	public String XDD0080;
	public String XDD0081;
	public String XDD0082;
	public String XDD0083;
	public String XDD0084;
	public String XDD0085;
	public String XDD0086;
	public String XDD0087;
	public String XDD0088;
	public String XDD0089;
	public String XDD0090;
	public String XDD0091;
	public String XDD0092;
	public String XDD0093;
	public String XDD0094;
	public String XDD0095;
	public String XDD0096;
	public String XDD0097;
	public String XDD0098;
	public String XDD0099;
	public String XDD0100;
	public String XDD0101;
	public String XDD0102;
	public String XDD0103;
	public String XDD0104;
	public String XDD0105;
	public String XDD0106;
	public String XDD0107;
	public String XDD0108;
	public String XDD0109;
	public String XDD0110;
	public String XDD0111;
	public String XDD0112;
	public String XDD0113;
	public String XDD0114;
	public String XDD0115;
	public String XDD0116;
	public String XDD0117;
	public String XDD0118;
	public String XDD0119;
	public String XDD0120;
	public String XDD0121;
	public String XDD0122;
	public String XDD0123;
	public String XDD0124;
	public String XDD0125;
	public String XDD0126;
	public String XDD0127;
	public String XDD0128;
	public String XDD0129;
	public String XDD0130;
	public String XDD0131;
	public String XDD0132;
	public String XDD0133;
	public String XDD0134;
	public String XDD0135;
	public String XDD0136;
	public String XDD0137;
	public String XDD0138;
	public String XDD0139;
	public String XDD0140;
	public String XDD0141;
	public String XDD0142;
	public String XDD0143;
	public String XDD0144;
	public String XDD0145;
	public String XDD0146;
	public String XDD0147;
	public String XDD0148;
	public String XDD0149;
	public String XDD0150;
	public String XDD0151;
	public String XDD0152;
	public String XDD0153;
	public String XDD0154;
	public String XDD0155;
	public String XDD0156;
	public String XDD0157;
	public String XDD0158;
	public String XDD0159;
	public String XDD0160;
	public String XDD0161;
	public String BBCNCLKLXDD001;
	public String BBCNCLKLXDD002;
	public String BBCNCLKLXDD003;
	public String BBCNCLKLXDD004;
	public String BBCNCLKLXDD005;
	public String BBCNCLKLXDD006;
	public String BBCNCLKLXDD007;
	public String BBCNCLKLXDD008;
	public String BBCNCLKLXDD009;
	public String BBCNCLKLXDD010;
	public String BBCNCLKLXDD011;
	public String BBCNCLKLXDD012;
	public String BBCNCLKLXDD013;
	public String BBCNCLKLXDD014;
	public String BBCNCLKLXDD015;
	public String BBCNCLKLXDD016;
	public String BBCNCLKLXDD019;
	public String BBCNCLKLXDD017;
	public String BBCNCLKLXDD020;
	public String BBCNCLKLXDD018;
	public String BBCNCLKLXDD021;
	public String BBCNCLKLXDD022;
	public String BBCNCLKLXDD023;
	public String BBCNCLKLXDD024;
	public String BBCNCLKLXDD025;
	public String BBCNCLKLXDD026;
	public String BBCNCLKLXDD027;
	public String BBCNCLKLXDD028;
	public String BBCNCLKLXDD029;
	public String BBCNCLKLXDD031;
	public String BBCNCLKLXDD032;
	public String BBCNCLKLXDD033;
	public long modifyDate;
	public long syncDate;
}