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

import com.fds.vr.business.model.VRTechnicalSpec_XMY;

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
 * The cache model class for representing VRTechnicalSpec_XMY in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XMY
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XMYCacheModel implements CacheModel<VRTechnicalSpec_XMY>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XMYCacheModel)) {
			return false;
		}

		VRTechnicalSpec_XMYCacheModel vrTechnicalSpec_XMYCacheModel = (VRTechnicalSpec_XMYCacheModel)obj;

		if (id == vrTechnicalSpec_XMYCacheModel.id) {
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
		StringBundler sb = new StringBundler(367);

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
		sb.append(", XMY01001=");
		sb.append(XMY01001);
		sb.append(", XMY01002=");
		sb.append(XMY01002);
		sb.append(", XMY01003=");
		sb.append(XMY01003);
		sb.append(", XMY01004=");
		sb.append(XMY01004);
		sb.append(", XMY01005=");
		sb.append(XMY01005);
		sb.append(", XMY01006=");
		sb.append(XMY01006);
		sb.append(", XMY01007=");
		sb.append(XMY01007);
		sb.append(", XMY01008=");
		sb.append(XMY01008);
		sb.append(", XMY01009=");
		sb.append(XMY01009);
		sb.append(", XMY01010=");
		sb.append(XMY01010);
		sb.append(", XMY01011=");
		sb.append(XMY01011);
		sb.append(", XMY01012=");
		sb.append(XMY01012);
		sb.append(", XMY01013=");
		sb.append(XMY01013);
		sb.append(", XMY01014=");
		sb.append(XMY01014);
		sb.append(", XMY01016=");
		sb.append(XMY01016);
		sb.append(", XMY01017=");
		sb.append(XMY01017);
		sb.append(", XMY01019=");
		sb.append(XMY01019);
		sb.append(", XMY01020=");
		sb.append(XMY01020);
		sb.append(", XMY01021=");
		sb.append(XMY01021);
		sb.append(", XMY01022=");
		sb.append(XMY01022);
		sb.append(", XMY01030=");
		sb.append(XMY01030);
		sb.append(", XMY01031=");
		sb.append(XMY01031);
		sb.append(", XMY01032=");
		sb.append(XMY01032);
		sb.append(", XMY01033=");
		sb.append(XMY01033);
		sb.append(", XMY01034=");
		sb.append(XMY01034);
		sb.append(", XMY01035=");
		sb.append(XMY01035);
		sb.append(", XMY01036=");
		sb.append(XMY01036);
		sb.append(", XMY01037=");
		sb.append(XMY01037);
		sb.append(", XMY01038=");
		sb.append(XMY01038);
		sb.append(", XMY01039=");
		sb.append(XMY01039);
		sb.append(", XMY01040=");
		sb.append(XMY01040);
		sb.append(", XMY01041=");
		sb.append(XMY01041);
		sb.append(", XMY01042=");
		sb.append(XMY01042);
		sb.append(", XMY01043=");
		sb.append(XMY01043);
		sb.append(", XMY01044=");
		sb.append(XMY01044);
		sb.append(", XMY01045=");
		sb.append(XMY01045);
		sb.append(", XMY01046=");
		sb.append(XMY01046);
		sb.append(", XMY01047=");
		sb.append(XMY01047);
		sb.append(", XMY01050=");
		sb.append(XMY01050);
		sb.append(", XMY01051=");
		sb.append(XMY01051);
		sb.append(", XMY01052=");
		sb.append(XMY01052);
		sb.append(", XMY01053=");
		sb.append(XMY01053);
		sb.append(", XMY01054=");
		sb.append(XMY01054);
		sb.append(", XMY01055=");
		sb.append(XMY01055);
		sb.append(", XMY01056=");
		sb.append(XMY01056);
		sb.append(", XMY01057=");
		sb.append(XMY01057);
		sb.append(", XMY01058=");
		sb.append(XMY01058);
		sb.append(", XMY01059=");
		sb.append(XMY01059);
		sb.append(", XMY01060=");
		sb.append(XMY01060);
		sb.append(", XMY01062=");
		sb.append(XMY01062);
		sb.append(", XMY01063=");
		sb.append(XMY01063);
		sb.append(", XMY01064=");
		sb.append(XMY01064);
		sb.append(", XMY01065=");
		sb.append(XMY01065);
		sb.append(", XMY01670=");
		sb.append(XMY01670);
		sb.append(", XMY01671=");
		sb.append(XMY01671);
		sb.append(", XMY01672=");
		sb.append(XMY01672);
		sb.append(", XMY01673=");
		sb.append(XMY01673);
		sb.append(", XMY01674=");
		sb.append(XMY01674);
		sb.append(", XMY01675=");
		sb.append(XMY01675);
		sb.append(", XMY01676=");
		sb.append(XMY01676);
		sb.append(", XMY01677=");
		sb.append(XMY01677);
		sb.append(", XMY01678=");
		sb.append(XMY01678);
		sb.append(", XMY01679=");
		sb.append(XMY01679);
		sb.append(", XMY01680=");
		sb.append(XMY01680);
		sb.append(", XMY01681=");
		sb.append(XMY01681);
		sb.append(", XMY01682=");
		sb.append(XMY01682);
		sb.append(", XMY01683=");
		sb.append(XMY01683);
		sb.append(", XMY01684=");
		sb.append(XMY01684);
		sb.append(", XMY01685=");
		sb.append(XMY01685);
		sb.append(", XMY01686=");
		sb.append(XMY01686);
		sb.append(", XMY01687=");
		sb.append(XMY01687);
		sb.append(", XMY01688=");
		sb.append(XMY01688);
		sb.append(", XMY01689=");
		sb.append(XMY01689);
		sb.append(", XMY01690=");
		sb.append(XMY01690);
		sb.append(", XMY01691=");
		sb.append(XMY01691);
		sb.append(", XMY01692=");
		sb.append(XMY01692);
		sb.append(", XMY01693=");
		sb.append(XMY01693);
		sb.append(", XMY01694=");
		sb.append(XMY01694);
		sb.append(", XMY01695=");
		sb.append(XMY01695);
		sb.append(", XMY01696=");
		sb.append(XMY01696);
		sb.append(", XMY01697=");
		sb.append(XMY01697);
		sb.append(", XMY01698=");
		sb.append(XMY01698);
		sb.append(", XMY01699=");
		sb.append(XMY01699);
		sb.append(", XMY01700=");
		sb.append(XMY01700);
		sb.append(", XMY01701=");
		sb.append(XMY01701);
		sb.append(", XMY01702=");
		sb.append(XMY01702);
		sb.append(", XMY01703=");
		sb.append(XMY01703);
		sb.append(", XMY01704=");
		sb.append(XMY01704);
		sb.append(", XMY01705=");
		sb.append(XMY01705);
		sb.append(", XMY01706=");
		sb.append(XMY01706);
		sb.append(", XMY01707=");
		sb.append(XMY01707);
		sb.append(", XMY01708=");
		sb.append(XMY01708);
		sb.append(", XMY01709=");
		sb.append(XMY01709);
		sb.append(", XMY01710=");
		sb.append(XMY01710);
		sb.append(", XMY01711=");
		sb.append(XMY01711);
		sb.append(", XMY01712=");
		sb.append(XMY01712);
		sb.append(", XMY01713=");
		sb.append(XMY01713);
		sb.append(", XMY01714=");
		sb.append(XMY01714);
		sb.append(", XMY01715=");
		sb.append(XMY01715);
		sb.append(", XMY01716=");
		sb.append(XMY01716);
		sb.append(", XMY01717=");
		sb.append(XMY01717);
		sb.append(", XMY01718=");
		sb.append(XMY01718);
		sb.append(", XMY01719=");
		sb.append(XMY01719);
		sb.append(", XMY01720=");
		sb.append(XMY01720);
		sb.append(", XMY01721=");
		sb.append(XMY01721);
		sb.append(", XMY01722=");
		sb.append(XMY01722);
		sb.append(", XMY01723=");
		sb.append(XMY01723);
		sb.append(", XMY01724=");
		sb.append(XMY01724);
		sb.append(", XMY01725=");
		sb.append(XMY01725);
		sb.append(", XMY01726=");
		sb.append(XMY01726);
		sb.append(", XMY01729=");
		sb.append(XMY01729);
		sb.append(", XMY01730=");
		sb.append(XMY01730);
		sb.append(", XMY01731=");
		sb.append(XMY01731);
		sb.append(", XMY01732=");
		sb.append(XMY01732);
		sb.append(", XMY01733=");
		sb.append(XMY01733);
		sb.append(", XMY01734=");
		sb.append(XMY01734);
		sb.append(", XMY01735=");
		sb.append(XMY01735);
		sb.append(", XMY01736=");
		sb.append(XMY01736);
		sb.append(", XMY01737=");
		sb.append(XMY01737);
		sb.append(", XMY01738=");
		sb.append(XMY01738);
		sb.append(", XMY01739=");
		sb.append(XMY01739);
		sb.append(", XMY01740=");
		sb.append(XMY01740);
		sb.append(", XMY01741=");
		sb.append(XMY01741);
		sb.append(", XMY01742=");
		sb.append(XMY01742);
		sb.append(", XMY01744=");
		sb.append(XMY01744);
		sb.append(", XMY01745=");
		sb.append(XMY01745);
		sb.append(", XMY01746=");
		sb.append(XMY01746);
		sb.append(", XMY01747=");
		sb.append(XMY01747);
		sb.append(", XMY01748=");
		sb.append(XMY01748);
		sb.append(", XMY01749=");
		sb.append(XMY01749);
		sb.append(", XMY01758=");
		sb.append(XMY01758);
		sb.append(", XMY01759=");
		sb.append(XMY01759);
		sb.append(", XMY01760=");
		sb.append(XMY01760);
		sb.append(", XMY01761=");
		sb.append(XMY01761);
		sb.append(", XMY01762=");
		sb.append(XMY01762);
		sb.append(", XMY01763=");
		sb.append(XMY01763);
		sb.append(", XMY01764=");
		sb.append(XMY01764);
		sb.append(", XMY01779=");
		sb.append(XMY01779);
		sb.append(", XMY01780=");
		sb.append(XMY01780);
		sb.append(", XMY01781=");
		sb.append(XMY01781);
		sb.append(", XMY01782=");
		sb.append(XMY01782);
		sb.append(", XMY01783=");
		sb.append(XMY01783);
		sb.append(", XMY01785=");
		sb.append(XMY01785);
		sb.append(", XMY01786=");
		sb.append(XMY01786);
		sb.append(", XMY01787=");
		sb.append(XMY01787);
		sb.append(", XMY01788=");
		sb.append(XMY01788);
		sb.append(", XMY01789=");
		sb.append(XMY01789);
		sb.append(", XMY01790=");
		sb.append(XMY01790);
		sb.append(", XMY01791=");
		sb.append(XMY01791);
		sb.append(", XMY01792=");
		sb.append(XMY01792);
		sb.append(", XMY01793=");
		sb.append(XMY01793);
		sb.append(", XMY01794=");
		sb.append(XMY01794);
		sb.append(", XMY01795=");
		sb.append(XMY01795);
		sb.append(", XMY01796=");
		sb.append(XMY01796);
		sb.append(", XMY01797=");
		sb.append(XMY01797);
		sb.append(", XMY01798=");
		sb.append(XMY01798);
		sb.append(", XMY01799=");
		sb.append(XMY01799);
		sb.append(", XMY01800=");
		sb.append(XMY01800);
		sb.append(", XMY01801=");
		sb.append(XMY01801);
		sb.append(", XMY01802=");
		sb.append(XMY01802);
		sb.append(", XMY01804=");
		sb.append(XMY01804);
		sb.append(", XMY01805=");
		sb.append(XMY01805);
		sb.append(", XMY01806=");
		sb.append(XMY01806);
		sb.append(", XMY01807=");
		sb.append(XMY01807);
		sb.append(", XMY01808=");
		sb.append(XMY01808);
		sb.append(", XMY01809=");
		sb.append(XMY01809);
		sb.append(", XMY01810=");
		sb.append(XMY01810);
		sb.append(", XMY01811=");
		sb.append(XMY01811);
		sb.append(", XMY01812=");
		sb.append(XMY01812);
		sb.append(", XMY01813=");
		sb.append(XMY01813);
		sb.append(", XMY01814=");
		sb.append(XMY01814);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XMY toEntityModel() {
		VRTechnicalSpec_XMYImpl vrTechnicalSpec_XMYImpl = new VRTechnicalSpec_XMYImpl();

		vrTechnicalSpec_XMYImpl.setId(id);
		vrTechnicalSpec_XMYImpl.setMtCore(mtCore);
		vrTechnicalSpec_XMYImpl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XMYImpl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XMYImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XMYImpl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XMYImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XMYImpl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XMYImpl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (loai_dong_co == null) {
			vrTechnicalSpec_XMYImpl.setLoai_dong_co(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setLoai_dong_co(loai_dong_co);
		}

		if (XMY01001 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01001(XMY01001);
		}

		if (XMY01002 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01002(XMY01002);
		}

		if (XMY01003 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01003(XMY01003);
		}

		if (XMY01004 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01004(XMY01004);
		}

		if (XMY01005 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01005(XMY01005);
		}

		if (XMY01006 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01006(XMY01006);
		}

		if (XMY01007 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01007(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01007(XMY01007);
		}

		if (XMY01008 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01008(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01008(XMY01008);
		}

		if (XMY01009 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01009(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01009(XMY01009);
		}

		if (XMY01010 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01010(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01010(XMY01010);
		}

		if (XMY01011 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01011(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01011(XMY01011);
		}

		if (XMY01012 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01012(XMY01012);
		}

		if (XMY01013 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01013(XMY01013);
		}

		if (XMY01014 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01014(XMY01014);
		}

		if (XMY01016 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01016(XMY01016);
		}

		if (XMY01017 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01017(XMY01017);
		}

		if (XMY01019 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01019(XMY01019);
		}

		if (XMY01020 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01020(XMY01020);
		}

		if (XMY01021 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01021(XMY01021);
		}

		if (XMY01022 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01022(XMY01022);
		}

		if (XMY01030 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01030(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01030(XMY01030);
		}

		if (XMY01031 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01031(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01031(XMY01031);
		}

		if (XMY01032 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01032(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01032(XMY01032);
		}

		if (XMY01033 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01033(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01033(XMY01033);
		}

		if (XMY01034 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01034(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01034(XMY01034);
		}

		if (XMY01035 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01035(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01035(XMY01035);
		}

		if (XMY01036 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01036(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01036(XMY01036);
		}

		if (XMY01037 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01037(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01037(XMY01037);
		}

		if (XMY01038 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01038(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01038(XMY01038);
		}

		if (XMY01039 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01039(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01039(XMY01039);
		}

		if (XMY01040 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01040(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01040(XMY01040);
		}

		if (XMY01041 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01041(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01041(XMY01041);
		}

		if (XMY01042 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01042(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01042(XMY01042);
		}

		if (XMY01043 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01043(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01043(XMY01043);
		}

		if (XMY01044 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01044(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01044(XMY01044);
		}

		if (XMY01045 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01045(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01045(XMY01045);
		}

		if (XMY01046 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01046(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01046(XMY01046);
		}

		if (XMY01047 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01047(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01047(XMY01047);
		}

		if (XMY01050 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01050(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01050(XMY01050);
		}

		if (XMY01051 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01051(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01051(XMY01051);
		}

		if (XMY01052 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01052(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01052(XMY01052);
		}

		if (XMY01053 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01053(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01053(XMY01053);
		}

		if (XMY01054 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01054(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01054(XMY01054);
		}

		if (XMY01055 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01055(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01055(XMY01055);
		}

		if (XMY01056 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01056(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01056(XMY01056);
		}

		if (XMY01057 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01057(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01057(XMY01057);
		}

		if (XMY01058 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01058(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01058(XMY01058);
		}

		if (XMY01059 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01059(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01059(XMY01059);
		}

		if (XMY01060 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01060(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01060(XMY01060);
		}

		if (XMY01062 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01062(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01062(XMY01062);
		}

		if (XMY01063 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01063(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01063(XMY01063);
		}

		if (XMY01064 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01064(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01064(XMY01064);
		}

		if (XMY01065 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01065(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01065(XMY01065);
		}

		if (XMY01670 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01670(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01670(XMY01670);
		}

		if (XMY01671 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01671(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01671(XMY01671);
		}

		if (XMY01672 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01672(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01672(XMY01672);
		}

		if (XMY01673 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01673(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01673(XMY01673);
		}

		if (XMY01674 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01674(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01674(XMY01674);
		}

		if (XMY01675 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01675(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01675(XMY01675);
		}

		if (XMY01676 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01676(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01676(XMY01676);
		}

		if (XMY01677 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01677(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01677(XMY01677);
		}

		if (XMY01678 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01678(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01678(XMY01678);
		}

		if (XMY01679 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01679(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01679(XMY01679);
		}

		if (XMY01680 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01680(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01680(XMY01680);
		}

		if (XMY01681 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01681(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01681(XMY01681);
		}

		if (XMY01682 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01682(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01682(XMY01682);
		}

		if (XMY01683 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01683(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01683(XMY01683);
		}

		if (XMY01684 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01684(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01684(XMY01684);
		}

		if (XMY01685 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01685(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01685(XMY01685);
		}

		if (XMY01686 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01686(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01686(XMY01686);
		}

		if (XMY01687 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01687(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01687(XMY01687);
		}

		if (XMY01688 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01688(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01688(XMY01688);
		}

		if (XMY01689 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01689(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01689(XMY01689);
		}

		if (XMY01690 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01690(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01690(XMY01690);
		}

		if (XMY01691 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01691(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01691(XMY01691);
		}

		if (XMY01692 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01692(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01692(XMY01692);
		}

		if (XMY01693 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01693(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01693(XMY01693);
		}

		if (XMY01694 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01694(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01694(XMY01694);
		}

		if (XMY01695 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01695(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01695(XMY01695);
		}

		if (XMY01696 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01696(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01696(XMY01696);
		}

		if (XMY01697 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01697(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01697(XMY01697);
		}

		if (XMY01698 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01698(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01698(XMY01698);
		}

		if (XMY01699 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01699(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01699(XMY01699);
		}

		if (XMY01700 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01700(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01700(XMY01700);
		}

		if (XMY01701 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01701(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01701(XMY01701);
		}

		if (XMY01702 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01702(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01702(XMY01702);
		}

		if (XMY01703 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01703(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01703(XMY01703);
		}

		if (XMY01704 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01704(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01704(XMY01704);
		}

		if (XMY01705 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01705(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01705(XMY01705);
		}

		if (XMY01706 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01706(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01706(XMY01706);
		}

		if (XMY01707 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01707(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01707(XMY01707);
		}

		if (XMY01708 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01708(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01708(XMY01708);
		}

		if (XMY01709 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01709(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01709(XMY01709);
		}

		if (XMY01710 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01710(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01710(XMY01710);
		}

		if (XMY01711 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01711(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01711(XMY01711);
		}

		if (XMY01712 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01712(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01712(XMY01712);
		}

		if (XMY01713 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01713(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01713(XMY01713);
		}

		if (XMY01714 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01714(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01714(XMY01714);
		}

		if (XMY01715 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01715(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01715(XMY01715);
		}

		if (XMY01716 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01716(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01716(XMY01716);
		}

		if (XMY01717 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01717(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01717(XMY01717);
		}

		if (XMY01718 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01718(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01718(XMY01718);
		}

		if (XMY01719 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01719(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01719(XMY01719);
		}

		if (XMY01720 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01720(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01720(XMY01720);
		}

		if (XMY01721 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01721(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01721(XMY01721);
		}

		if (XMY01722 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01722(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01722(XMY01722);
		}

		if (XMY01723 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01723(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01723(XMY01723);
		}

		if (XMY01724 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01724(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01724(XMY01724);
		}

		if (XMY01725 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01725(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01725(XMY01725);
		}

		if (XMY01726 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01726(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01726(XMY01726);
		}

		if (XMY01729 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01729(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01729(XMY01729);
		}

		if (XMY01730 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01730(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01730(XMY01730);
		}

		if (XMY01731 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01731(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01731(XMY01731);
		}

		if (XMY01732 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01732(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01732(XMY01732);
		}

		if (XMY01733 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01733(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01733(XMY01733);
		}

		if (XMY01734 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01734(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01734(XMY01734);
		}

		if (XMY01735 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01735(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01735(XMY01735);
		}

		if (XMY01736 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01736(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01736(XMY01736);
		}

		if (XMY01737 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01737(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01737(XMY01737);
		}

		if (XMY01738 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01738(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01738(XMY01738);
		}

		if (XMY01739 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01739(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01739(XMY01739);
		}

		if (XMY01740 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01740(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01740(XMY01740);
		}

		if (XMY01741 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01741(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01741(XMY01741);
		}

		if (XMY01742 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01742(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01742(XMY01742);
		}

		if (XMY01744 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01744(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01744(XMY01744);
		}

		if (XMY01745 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01745(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01745(XMY01745);
		}

		if (XMY01746 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01746(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01746(XMY01746);
		}

		if (XMY01747 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01747(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01747(XMY01747);
		}

		if (XMY01748 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01748(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01748(XMY01748);
		}

		if (XMY01749 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01749(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01749(XMY01749);
		}

		if (XMY01758 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01758(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01758(XMY01758);
		}

		if (XMY01759 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01759(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01759(XMY01759);
		}

		if (XMY01760 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01760(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01760(XMY01760);
		}

		if (XMY01761 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01761(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01761(XMY01761);
		}

		if (XMY01762 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01762(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01762(XMY01762);
		}

		if (XMY01763 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01763(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01763(XMY01763);
		}

		if (XMY01764 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01764(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01764(XMY01764);
		}

		if (XMY01779 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01779(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01779(XMY01779);
		}

		if (XMY01780 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01780(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01780(XMY01780);
		}

		if (XMY01781 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01781(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01781(XMY01781);
		}

		if (XMY01782 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01782(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01782(XMY01782);
		}

		if (XMY01783 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01783(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01783(XMY01783);
		}

		if (XMY01785 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01785(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01785(XMY01785);
		}

		if (XMY01786 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01786(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01786(XMY01786);
		}

		if (XMY01787 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01787(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01787(XMY01787);
		}

		if (XMY01788 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01788(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01788(XMY01788);
		}

		if (XMY01789 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01789(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01789(XMY01789);
		}

		if (XMY01790 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01790(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01790(XMY01790);
		}

		if (XMY01791 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01791(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01791(XMY01791);
		}

		if (XMY01792 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01792(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01792(XMY01792);
		}

		if (XMY01793 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01793(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01793(XMY01793);
		}

		if (XMY01794 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01794(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01794(XMY01794);
		}

		if (XMY01795 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01795(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01795(XMY01795);
		}

		if (XMY01796 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01796(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01796(XMY01796);
		}

		if (XMY01797 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01797(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01797(XMY01797);
		}

		if (XMY01798 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01798(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01798(XMY01798);
		}

		if (XMY01799 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01799(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01799(XMY01799);
		}

		if (XMY01800 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01800(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01800(XMY01800);
		}

		if (XMY01801 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01801(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01801(XMY01801);
		}

		if (XMY01802 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01802(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01802(XMY01802);
		}

		if (XMY01804 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01804(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01804(XMY01804);
		}

		if (XMY01805 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01805(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01805(XMY01805);
		}

		if (XMY01806 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01806(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01806(XMY01806);
		}

		if (XMY01807 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01807(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01807(XMY01807);
		}

		if (XMY01808 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01808(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01808(XMY01808);
		}

		if (XMY01809 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01809(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01809(XMY01809);
		}

		if (XMY01810 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01810(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01810(XMY01810);
		}

		if (XMY01811 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01811(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01811(XMY01811);
		}

		if (XMY01812 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01812(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01812(XMY01812);
		}

		if (XMY01813 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01813(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01813(XMY01813);
		}

		if (XMY01814 == null) {
			vrTechnicalSpec_XMYImpl.setXMY01814(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XMYImpl.setXMY01814(XMY01814);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XMYImpl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XMYImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XMYImpl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XMYImpl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XMYImpl.resetOriginalValues();

		return vrTechnicalSpec_XMYImpl;
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
		XMY01001 = objectInput.readUTF();
		XMY01002 = objectInput.readUTF();
		XMY01003 = objectInput.readUTF();
		XMY01004 = objectInput.readUTF();
		XMY01005 = objectInput.readUTF();
		XMY01006 = objectInput.readUTF();
		XMY01007 = objectInput.readUTF();
		XMY01008 = objectInput.readUTF();
		XMY01009 = objectInput.readUTF();
		XMY01010 = objectInput.readUTF();
		XMY01011 = objectInput.readUTF();
		XMY01012 = objectInput.readUTF();
		XMY01013 = objectInput.readUTF();
		XMY01014 = objectInput.readUTF();
		XMY01016 = objectInput.readUTF();
		XMY01017 = objectInput.readUTF();
		XMY01019 = objectInput.readUTF();
		XMY01020 = objectInput.readUTF();
		XMY01021 = objectInput.readUTF();
		XMY01022 = objectInput.readUTF();
		XMY01030 = objectInput.readUTF();
		XMY01031 = objectInput.readUTF();
		XMY01032 = objectInput.readUTF();
		XMY01033 = objectInput.readUTF();
		XMY01034 = objectInput.readUTF();
		XMY01035 = objectInput.readUTF();
		XMY01036 = objectInput.readUTF();
		XMY01037 = objectInput.readUTF();
		XMY01038 = objectInput.readUTF();
		XMY01039 = objectInput.readUTF();
		XMY01040 = objectInput.readUTF();
		XMY01041 = objectInput.readUTF();
		XMY01042 = objectInput.readUTF();
		XMY01043 = objectInput.readUTF();
		XMY01044 = objectInput.readUTF();
		XMY01045 = objectInput.readUTF();
		XMY01046 = objectInput.readUTF();
		XMY01047 = objectInput.readUTF();
		XMY01050 = objectInput.readUTF();
		XMY01051 = objectInput.readUTF();
		XMY01052 = objectInput.readUTF();
		XMY01053 = objectInput.readUTF();
		XMY01054 = objectInput.readUTF();
		XMY01055 = objectInput.readUTF();
		XMY01056 = objectInput.readUTF();
		XMY01057 = objectInput.readUTF();
		XMY01058 = objectInput.readUTF();
		XMY01059 = objectInput.readUTF();
		XMY01060 = objectInput.readUTF();
		XMY01062 = objectInput.readUTF();
		XMY01063 = objectInput.readUTF();
		XMY01064 = objectInput.readUTF();
		XMY01065 = objectInput.readUTF();
		XMY01670 = objectInput.readUTF();
		XMY01671 = objectInput.readUTF();
		XMY01672 = objectInput.readUTF();
		XMY01673 = objectInput.readUTF();
		XMY01674 = objectInput.readUTF();
		XMY01675 = objectInput.readUTF();
		XMY01676 = objectInput.readUTF();
		XMY01677 = objectInput.readUTF();
		XMY01678 = objectInput.readUTF();
		XMY01679 = objectInput.readUTF();
		XMY01680 = objectInput.readUTF();
		XMY01681 = objectInput.readUTF();
		XMY01682 = objectInput.readUTF();
		XMY01683 = objectInput.readUTF();
		XMY01684 = objectInput.readUTF();
		XMY01685 = objectInput.readUTF();
		XMY01686 = objectInput.readUTF();
		XMY01687 = objectInput.readUTF();
		XMY01688 = objectInput.readUTF();
		XMY01689 = objectInput.readUTF();
		XMY01690 = objectInput.readUTF();
		XMY01691 = objectInput.readUTF();
		XMY01692 = objectInput.readUTF();
		XMY01693 = objectInput.readUTF();
		XMY01694 = objectInput.readUTF();
		XMY01695 = objectInput.readUTF();
		XMY01696 = objectInput.readUTF();
		XMY01697 = objectInput.readUTF();
		XMY01698 = objectInput.readUTF();
		XMY01699 = objectInput.readUTF();
		XMY01700 = objectInput.readUTF();
		XMY01701 = objectInput.readUTF();
		XMY01702 = objectInput.readUTF();
		XMY01703 = objectInput.readUTF();
		XMY01704 = objectInput.readUTF();
		XMY01705 = objectInput.readUTF();
		XMY01706 = objectInput.readUTF();
		XMY01707 = objectInput.readUTF();
		XMY01708 = objectInput.readUTF();
		XMY01709 = objectInput.readUTF();
		XMY01710 = objectInput.readUTF();
		XMY01711 = objectInput.readUTF();
		XMY01712 = objectInput.readUTF();
		XMY01713 = objectInput.readUTF();
		XMY01714 = objectInput.readUTF();
		XMY01715 = objectInput.readUTF();
		XMY01716 = objectInput.readUTF();
		XMY01717 = objectInput.readUTF();
		XMY01718 = objectInput.readUTF();
		XMY01719 = objectInput.readUTF();
		XMY01720 = objectInput.readUTF();
		XMY01721 = objectInput.readUTF();
		XMY01722 = objectInput.readUTF();
		XMY01723 = objectInput.readUTF();
		XMY01724 = objectInput.readUTF();
		XMY01725 = objectInput.readUTF();
		XMY01726 = objectInput.readUTF();
		XMY01729 = objectInput.readUTF();
		XMY01730 = objectInput.readUTF();
		XMY01731 = objectInput.readUTF();
		XMY01732 = objectInput.readUTF();
		XMY01733 = objectInput.readUTF();
		XMY01734 = objectInput.readUTF();
		XMY01735 = objectInput.readUTF();
		XMY01736 = objectInput.readUTF();
		XMY01737 = objectInput.readUTF();
		XMY01738 = objectInput.readUTF();
		XMY01739 = objectInput.readUTF();
		XMY01740 = objectInput.readUTF();
		XMY01741 = objectInput.readUTF();
		XMY01742 = objectInput.readUTF();
		XMY01744 = objectInput.readUTF();
		XMY01745 = objectInput.readUTF();
		XMY01746 = objectInput.readUTF();
		XMY01747 = objectInput.readUTF();
		XMY01748 = objectInput.readUTF();
		XMY01749 = objectInput.readUTF();
		XMY01758 = objectInput.readUTF();
		XMY01759 = objectInput.readUTF();
		XMY01760 = objectInput.readUTF();
		XMY01761 = objectInput.readUTF();
		XMY01762 = objectInput.readUTF();
		XMY01763 = objectInput.readUTF();
		XMY01764 = objectInput.readUTF();
		XMY01779 = objectInput.readUTF();
		XMY01780 = objectInput.readUTF();
		XMY01781 = objectInput.readUTF();
		XMY01782 = objectInput.readUTF();
		XMY01783 = objectInput.readUTF();
		XMY01785 = objectInput.readUTF();
		XMY01786 = objectInput.readUTF();
		XMY01787 = objectInput.readUTF();
		XMY01788 = objectInput.readUTF();
		XMY01789 = objectInput.readUTF();
		XMY01790 = objectInput.readUTF();
		XMY01791 = objectInput.readUTF();
		XMY01792 = objectInput.readUTF();
		XMY01793 = objectInput.readUTF();
		XMY01794 = objectInput.readUTF();
		XMY01795 = objectInput.readUTF();
		XMY01796 = objectInput.readUTF();
		XMY01797 = objectInput.readUTF();
		XMY01798 = objectInput.readUTF();
		XMY01799 = objectInput.readUTF();
		XMY01800 = objectInput.readUTF();
		XMY01801 = objectInput.readUTF();
		XMY01802 = objectInput.readUTF();
		XMY01804 = objectInput.readUTF();
		XMY01805 = objectInput.readUTF();
		XMY01806 = objectInput.readUTF();
		XMY01807 = objectInput.readUTF();
		XMY01808 = objectInput.readUTF();
		XMY01809 = objectInput.readUTF();
		XMY01810 = objectInput.readUTF();
		XMY01811 = objectInput.readUTF();
		XMY01812 = objectInput.readUTF();
		XMY01813 = objectInput.readUTF();
		XMY01814 = objectInput.readUTF();
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

		if (XMY01001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01001);
		}

		if (XMY01002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01002);
		}

		if (XMY01003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01003);
		}

		if (XMY01004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01004);
		}

		if (XMY01005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01005);
		}

		if (XMY01006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01006);
		}

		if (XMY01007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01007);
		}

		if (XMY01008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01008);
		}

		if (XMY01009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01009);
		}

		if (XMY01010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01010);
		}

		if (XMY01011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01011);
		}

		if (XMY01012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01012);
		}

		if (XMY01013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01013);
		}

		if (XMY01014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01014);
		}

		if (XMY01016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01016);
		}

		if (XMY01017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01017);
		}

		if (XMY01019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01019);
		}

		if (XMY01020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01020);
		}

		if (XMY01021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01021);
		}

		if (XMY01022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01022);
		}

		if (XMY01030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01030);
		}

		if (XMY01031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01031);
		}

		if (XMY01032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01032);
		}

		if (XMY01033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01033);
		}

		if (XMY01034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01034);
		}

		if (XMY01035 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01035);
		}

		if (XMY01036 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01036);
		}

		if (XMY01037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01037);
		}

		if (XMY01038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01038);
		}

		if (XMY01039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01039);
		}

		if (XMY01040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01040);
		}

		if (XMY01041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01041);
		}

		if (XMY01042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01042);
		}

		if (XMY01043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01043);
		}

		if (XMY01044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01044);
		}

		if (XMY01045 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01045);
		}

		if (XMY01046 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01046);
		}

		if (XMY01047 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01047);
		}

		if (XMY01050 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01050);
		}

		if (XMY01051 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01051);
		}

		if (XMY01052 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01052);
		}

		if (XMY01053 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01053);
		}

		if (XMY01054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01054);
		}

		if (XMY01055 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01055);
		}

		if (XMY01056 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01056);
		}

		if (XMY01057 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01057);
		}

		if (XMY01058 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01058);
		}

		if (XMY01059 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01059);
		}

		if (XMY01060 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01060);
		}

		if (XMY01062 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01062);
		}

		if (XMY01063 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01063);
		}

		if (XMY01064 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01064);
		}

		if (XMY01065 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01065);
		}

		if (XMY01670 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01670);
		}

		if (XMY01671 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01671);
		}

		if (XMY01672 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01672);
		}

		if (XMY01673 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01673);
		}

		if (XMY01674 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01674);
		}

		if (XMY01675 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01675);
		}

		if (XMY01676 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01676);
		}

		if (XMY01677 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01677);
		}

		if (XMY01678 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01678);
		}

		if (XMY01679 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01679);
		}

		if (XMY01680 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01680);
		}

		if (XMY01681 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01681);
		}

		if (XMY01682 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01682);
		}

		if (XMY01683 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01683);
		}

		if (XMY01684 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01684);
		}

		if (XMY01685 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01685);
		}

		if (XMY01686 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01686);
		}

		if (XMY01687 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01687);
		}

		if (XMY01688 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01688);
		}

		if (XMY01689 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01689);
		}

		if (XMY01690 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01690);
		}

		if (XMY01691 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01691);
		}

		if (XMY01692 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01692);
		}

		if (XMY01693 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01693);
		}

		if (XMY01694 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01694);
		}

		if (XMY01695 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01695);
		}

		if (XMY01696 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01696);
		}

		if (XMY01697 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01697);
		}

		if (XMY01698 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01698);
		}

		if (XMY01699 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01699);
		}

		if (XMY01700 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01700);
		}

		if (XMY01701 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01701);
		}

		if (XMY01702 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01702);
		}

		if (XMY01703 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01703);
		}

		if (XMY01704 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01704);
		}

		if (XMY01705 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01705);
		}

		if (XMY01706 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01706);
		}

		if (XMY01707 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01707);
		}

		if (XMY01708 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01708);
		}

		if (XMY01709 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01709);
		}

		if (XMY01710 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01710);
		}

		if (XMY01711 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01711);
		}

		if (XMY01712 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01712);
		}

		if (XMY01713 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01713);
		}

		if (XMY01714 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01714);
		}

		if (XMY01715 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01715);
		}

		if (XMY01716 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01716);
		}

		if (XMY01717 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01717);
		}

		if (XMY01718 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01718);
		}

		if (XMY01719 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01719);
		}

		if (XMY01720 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01720);
		}

		if (XMY01721 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01721);
		}

		if (XMY01722 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01722);
		}

		if (XMY01723 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01723);
		}

		if (XMY01724 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01724);
		}

		if (XMY01725 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01725);
		}

		if (XMY01726 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01726);
		}

		if (XMY01729 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01729);
		}

		if (XMY01730 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01730);
		}

		if (XMY01731 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01731);
		}

		if (XMY01732 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01732);
		}

		if (XMY01733 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01733);
		}

		if (XMY01734 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01734);
		}

		if (XMY01735 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01735);
		}

		if (XMY01736 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01736);
		}

		if (XMY01737 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01737);
		}

		if (XMY01738 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01738);
		}

		if (XMY01739 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01739);
		}

		if (XMY01740 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01740);
		}

		if (XMY01741 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01741);
		}

		if (XMY01742 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01742);
		}

		if (XMY01744 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01744);
		}

		if (XMY01745 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01745);
		}

		if (XMY01746 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01746);
		}

		if (XMY01747 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01747);
		}

		if (XMY01748 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01748);
		}

		if (XMY01749 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01749);
		}

		if (XMY01758 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01758);
		}

		if (XMY01759 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01759);
		}

		if (XMY01760 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01760);
		}

		if (XMY01761 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01761);
		}

		if (XMY01762 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01762);
		}

		if (XMY01763 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01763);
		}

		if (XMY01764 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01764);
		}

		if (XMY01779 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01779);
		}

		if (XMY01780 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01780);
		}

		if (XMY01781 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01781);
		}

		if (XMY01782 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01782);
		}

		if (XMY01783 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01783);
		}

		if (XMY01785 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01785);
		}

		if (XMY01786 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01786);
		}

		if (XMY01787 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01787);
		}

		if (XMY01788 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01788);
		}

		if (XMY01789 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01789);
		}

		if (XMY01790 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01790);
		}

		if (XMY01791 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01791);
		}

		if (XMY01792 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01792);
		}

		if (XMY01793 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01793);
		}

		if (XMY01794 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01794);
		}

		if (XMY01795 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01795);
		}

		if (XMY01796 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01796);
		}

		if (XMY01797 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01797);
		}

		if (XMY01798 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01798);
		}

		if (XMY01799 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01799);
		}

		if (XMY01800 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01800);
		}

		if (XMY01801 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01801);
		}

		if (XMY01802 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01802);
		}

		if (XMY01804 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01804);
		}

		if (XMY01805 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01805);
		}

		if (XMY01806 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01806);
		}

		if (XMY01807 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01807);
		}

		if (XMY01808 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01808);
		}

		if (XMY01809 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01809);
		}

		if (XMY01810 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01810);
		}

		if (XMY01811 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01811);
		}

		if (XMY01812 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01812);
		}

		if (XMY01813 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01813);
		}

		if (XMY01814 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY01814);
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
	public String XMY01001;
	public String XMY01002;
	public String XMY01003;
	public String XMY01004;
	public String XMY01005;
	public String XMY01006;
	public String XMY01007;
	public String XMY01008;
	public String XMY01009;
	public String XMY01010;
	public String XMY01011;
	public String XMY01012;
	public String XMY01013;
	public String XMY01014;
	public String XMY01016;
	public String XMY01017;
	public String XMY01019;
	public String XMY01020;
	public String XMY01021;
	public String XMY01022;
	public String XMY01030;
	public String XMY01031;
	public String XMY01032;
	public String XMY01033;
	public String XMY01034;
	public String XMY01035;
	public String XMY01036;
	public String XMY01037;
	public String XMY01038;
	public String XMY01039;
	public String XMY01040;
	public String XMY01041;
	public String XMY01042;
	public String XMY01043;
	public String XMY01044;
	public String XMY01045;
	public String XMY01046;
	public String XMY01047;
	public String XMY01050;
	public String XMY01051;
	public String XMY01052;
	public String XMY01053;
	public String XMY01054;
	public String XMY01055;
	public String XMY01056;
	public String XMY01057;
	public String XMY01058;
	public String XMY01059;
	public String XMY01060;
	public String XMY01062;
	public String XMY01063;
	public String XMY01064;
	public String XMY01065;
	public String XMY01670;
	public String XMY01671;
	public String XMY01672;
	public String XMY01673;
	public String XMY01674;
	public String XMY01675;
	public String XMY01676;
	public String XMY01677;
	public String XMY01678;
	public String XMY01679;
	public String XMY01680;
	public String XMY01681;
	public String XMY01682;
	public String XMY01683;
	public String XMY01684;
	public String XMY01685;
	public String XMY01686;
	public String XMY01687;
	public String XMY01688;
	public String XMY01689;
	public String XMY01690;
	public String XMY01691;
	public String XMY01692;
	public String XMY01693;
	public String XMY01694;
	public String XMY01695;
	public String XMY01696;
	public String XMY01697;
	public String XMY01698;
	public String XMY01699;
	public String XMY01700;
	public String XMY01701;
	public String XMY01702;
	public String XMY01703;
	public String XMY01704;
	public String XMY01705;
	public String XMY01706;
	public String XMY01707;
	public String XMY01708;
	public String XMY01709;
	public String XMY01710;
	public String XMY01711;
	public String XMY01712;
	public String XMY01713;
	public String XMY01714;
	public String XMY01715;
	public String XMY01716;
	public String XMY01717;
	public String XMY01718;
	public String XMY01719;
	public String XMY01720;
	public String XMY01721;
	public String XMY01722;
	public String XMY01723;
	public String XMY01724;
	public String XMY01725;
	public String XMY01726;
	public String XMY01729;
	public String XMY01730;
	public String XMY01731;
	public String XMY01732;
	public String XMY01733;
	public String XMY01734;
	public String XMY01735;
	public String XMY01736;
	public String XMY01737;
	public String XMY01738;
	public String XMY01739;
	public String XMY01740;
	public String XMY01741;
	public String XMY01742;
	public String XMY01744;
	public String XMY01745;
	public String XMY01746;
	public String XMY01747;
	public String XMY01748;
	public String XMY01749;
	public String XMY01758;
	public String XMY01759;
	public String XMY01760;
	public String XMY01761;
	public String XMY01762;
	public String XMY01763;
	public String XMY01764;
	public String XMY01779;
	public String XMY01780;
	public String XMY01781;
	public String XMY01782;
	public String XMY01783;
	public String XMY01785;
	public String XMY01786;
	public String XMY01787;
	public String XMY01788;
	public String XMY01789;
	public String XMY01790;
	public String XMY01791;
	public String XMY01792;
	public String XMY01793;
	public String XMY01794;
	public String XMY01795;
	public String XMY01796;
	public String XMY01797;
	public String XMY01798;
	public String XMY01799;
	public String XMY01800;
	public String XMY01801;
	public String XMY01802;
	public String XMY01804;
	public String XMY01805;
	public String XMY01806;
	public String XMY01807;
	public String XMY01808;
	public String XMY01809;
	public String XMY01810;
	public String XMY01811;
	public String XMY01812;
	public String XMY01813;
	public String XMY01814;
	public long modifyDate;
	public long syncDate;
}