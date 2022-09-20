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

import com.fds.vr.business.model.VRTechnicalSpec_XCGPart6;

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
 * The cache model class for representing VRTechnicalSpec_XCGPart6 in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart6
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart6CacheModel implements CacheModel<VRTechnicalSpec_XCGPart6>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGPart6CacheModel)) {
			return false;
		}

		VRTechnicalSpec_XCGPart6CacheModel vrTechnicalSpec_XCGPart6CacheModel = (VRTechnicalSpec_XCGPart6CacheModel)obj;

		if (id == vrTechnicalSpec_XCGPart6CacheModel.id) {
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
		StringBundler sb = new StringBundler(379);

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
		sb.append(", XCG01757=");
		sb.append(XCG01757);
		sb.append(", XCG01758=");
		sb.append(XCG01758);
		sb.append(", XCG01759=");
		sb.append(XCG01759);
		sb.append(", XCG01948=");
		sb.append(XCG01948);
		sb.append(", XCG01760=");
		sb.append(XCG01760);
		sb.append(", XCG01949=");
		sb.append(XCG01949);
		sb.append(", XCG01761=");
		sb.append(XCG01761);
		sb.append(", XCG01950=");
		sb.append(XCG01950);
		sb.append(", XCG01762=");
		sb.append(XCG01762);
		sb.append(", XCG01951=");
		sb.append(XCG01951);
		sb.append(", XCG01763=");
		sb.append(XCG01763);
		sb.append(", XCG01952=");
		sb.append(XCG01952);
		sb.append(", XCG01764=");
		sb.append(XCG01764);
		sb.append(", XCG01953=");
		sb.append(XCG01953);
		sb.append(", XCG01765=");
		sb.append(XCG01765);
		sb.append(", XCG01954=");
		sb.append(XCG01954);
		sb.append(", XCG01766=");
		sb.append(XCG01766);
		sb.append(", XCG01955=");
		sb.append(XCG01955);
		sb.append(", XCG01767=");
		sb.append(XCG01767);
		sb.append(", XCG01956=");
		sb.append(XCG01956);
		sb.append(", XCG01768=");
		sb.append(XCG01768);
		sb.append(", XCG01957=");
		sb.append(XCG01957);
		sb.append(", XCG01769=");
		sb.append(XCG01769);
		sb.append(", XCG01958=");
		sb.append(XCG01958);
		sb.append(", XCG01770=");
		sb.append(XCG01770);
		sb.append(", XCG01771=");
		sb.append(XCG01771);
		sb.append(", XCG01959=");
		sb.append(XCG01959);
		sb.append(", XCG01772=");
		sb.append(XCG01772);
		sb.append(", XCG01773=");
		sb.append(XCG01773);
		sb.append(", XCG01774=");
		sb.append(XCG01774);
		sb.append(", XCG01775=");
		sb.append(XCG01775);
		sb.append(", XCG01776=");
		sb.append(XCG01776);
		sb.append(", XCG01777=");
		sb.append(XCG01777);
		sb.append(", XCG01778=");
		sb.append(XCG01778);
		sb.append(", XCG01779=");
		sb.append(XCG01779);
		sb.append(", XCG01780=");
		sb.append(XCG01780);
		sb.append(", XCG01781=");
		sb.append(XCG01781);
		sb.append(", XCG01783=");
		sb.append(XCG01783);
		sb.append(", XCG01785=");
		sb.append(XCG01785);
		sb.append(", XCG01786=");
		sb.append(XCG01786);
		sb.append(", XCG01787=");
		sb.append(XCG01787);
		sb.append(", XCG01788=");
		sb.append(XCG01788);
		sb.append(", XCG01789=");
		sb.append(XCG01789);
		sb.append(", XCG01790=");
		sb.append(XCG01790);
		sb.append(", XCG01791=");
		sb.append(XCG01791);
		sb.append(", XCG01792=");
		sb.append(XCG01792);
		sb.append(", XCG01793=");
		sb.append(XCG01793);
		sb.append(", XCG01794=");
		sb.append(XCG01794);
		sb.append(", XCG01795=");
		sb.append(XCG01795);
		sb.append(", XCG01796=");
		sb.append(XCG01796);
		sb.append(", XCG01797=");
		sb.append(XCG01797);
		sb.append(", XCG01798=");
		sb.append(XCG01798);
		sb.append(", XCG01799=");
		sb.append(XCG01799);
		sb.append(", XCG01801=");
		sb.append(XCG01801);
		sb.append(", XCG01802=");
		sb.append(XCG01802);
		sb.append(", XCG01803=");
		sb.append(XCG01803);
		sb.append(", XCG01804=");
		sb.append(XCG01804);
		sb.append(", XCG01805=");
		sb.append(XCG01805);
		sb.append(", XCG01806=");
		sb.append(XCG01806);
		sb.append(", XCG01807=");
		sb.append(XCG01807);
		sb.append(", XCG01808=");
		sb.append(XCG01808);
		sb.append(", XCG01809=");
		sb.append(XCG01809);
		sb.append(", XCG01810=");
		sb.append(XCG01810);
		sb.append(", XCG01811=");
		sb.append(XCG01811);
		sb.append(", XCG01812=");
		sb.append(XCG01812);
		sb.append(", XCG01813=");
		sb.append(XCG01813);
		sb.append(", XCG01814=");
		sb.append(XCG01814);
		sb.append(", TDTKXCG001=");
		sb.append(TDTKXCG001);
		sb.append(", TDTKXCG002=");
		sb.append(TDTKXCG002);
		sb.append(", TDTKXCG003=");
		sb.append(TDTKXCG003);
		sb.append(", TDTKXCG004=");
		sb.append(TDTKXCG004);
		sb.append(", TDTKXCG005=");
		sb.append(TDTKXCG005);
		sb.append(", TDTKXCG006=");
		sb.append(TDTKXCG006);
		sb.append(", TDTKXCG007=");
		sb.append(TDTKXCG007);
		sb.append(", TDTKXCG008=");
		sb.append(TDTKXCG008);
		sb.append(", TDTKXCG009=");
		sb.append(TDTKXCG009);
		sb.append(", TDTKXCG010=");
		sb.append(TDTKXCG010);
		sb.append(", TDTKXCG011=");
		sb.append(TDTKXCG011);
		sb.append(", TDTKXCG012=");
		sb.append(TDTKXCG012);
		sb.append(", TDTKXCG013=");
		sb.append(TDTKXCG013);
		sb.append(", TDTKXCG014=");
		sb.append(TDTKXCG014);
		sb.append(", TDTKXCG015=");
		sb.append(TDTKXCG015);
		sb.append(", TDTKXCG016=");
		sb.append(TDTKXCG016);
		sb.append(", TDTKXCG017=");
		sb.append(TDTKXCG017);
		sb.append(", TDTKXCG018=");
		sb.append(TDTKXCG018);
		sb.append(", TDTKXCG019=");
		sb.append(TDTKXCG019);
		sb.append(", TDTKXCG020=");
		sb.append(TDTKXCG020);
		sb.append(", TDTKXCG021=");
		sb.append(TDTKXCG021);
		sb.append(", TDTKXCG022=");
		sb.append(TDTKXCG022);
		sb.append(", TDTKXCG023=");
		sb.append(TDTKXCG023);
		sb.append(", TDTKXCG024=");
		sb.append(TDTKXCG024);
		sb.append(", TDTKXCG025=");
		sb.append(TDTKXCG025);
		sb.append(", TDTKXCG026=");
		sb.append(TDTKXCG026);
		sb.append(", TDTKXCG027=");
		sb.append(TDTKXCG027);
		sb.append(", TDTKXCG028=");
		sb.append(TDTKXCG028);
		sb.append(", TDTKXCG029=");
		sb.append(TDTKXCG029);
		sb.append(", TDTKXCG030=");
		sb.append(TDTKXCG030);
		sb.append(", TDTKXCG031=");
		sb.append(TDTKXCG031);
		sb.append(", TDTKXCG032=");
		sb.append(TDTKXCG032);
		sb.append(", TDTKXCG033=");
		sb.append(TDTKXCG033);
		sb.append(", TDTKXCG034=");
		sb.append(TDTKXCG034);
		sb.append(", TDTKXCG035=");
		sb.append(TDTKXCG035);
		sb.append(", TDTKXCG036=");
		sb.append(TDTKXCG036);
		sb.append(", BBCNCLKLXCG01=");
		sb.append(BBCNCLKLXCG01);
		sb.append(", BBCNCLKLXCG02=");
		sb.append(BBCNCLKLXCG02);
		sb.append(", BBCNCLKLXCG03=");
		sb.append(BBCNCLKLXCG03);
		sb.append(", BBCNCLKLXCG04=");
		sb.append(BBCNCLKLXCG04);
		sb.append(", BBCNCLKLXCG05=");
		sb.append(BBCNCLKLXCG05);
		sb.append(", BBCNCLKLXCG06=");
		sb.append(BBCNCLKLXCG06);
		sb.append(", BBCNCLKLXCG07=");
		sb.append(BBCNCLKLXCG07);
		sb.append(", BBCNCLKLXCG08=");
		sb.append(BBCNCLKLXCG08);
		sb.append(", BBCNCLKLXCG09=");
		sb.append(BBCNCLKLXCG09);
		sb.append(", BBCNCLKLXCG10=");
		sb.append(BBCNCLKLXCG10);
		sb.append(", BBCNCLKLXCG11=");
		sb.append(BBCNCLKLXCG11);
		sb.append(", BBCNCLKLXCG12=");
		sb.append(BBCNCLKLXCG12);
		sb.append(", BBCNCLKLXCG13=");
		sb.append(BBCNCLKLXCG13);
		sb.append(", BBCNCLKLXCG14=");
		sb.append(BBCNCLKLXCG14);
		sb.append(", BBCNCLKLXCG15=");
		sb.append(BBCNCLKLXCG15);
		sb.append(", BBCNCLKLXCG16=");
		sb.append(BBCNCLKLXCG16);
		sb.append(", BBCNCLKLXCG17=");
		sb.append(BBCNCLKLXCG17);
		sb.append(", BBCNCLKLXCG18=");
		sb.append(BBCNCLKLXCG18);
		sb.append(", BBCNCLKLXCG19=");
		sb.append(BBCNCLKLXCG19);
		sb.append(", BBCNCLKLXCG20=");
		sb.append(BBCNCLKLXCG20);
		sb.append(", BBCNCLKLXCG21=");
		sb.append(BBCNCLKLXCG21);
		sb.append(", BBCNCLKLXCG22=");
		sb.append(BBCNCLKLXCG22);
		sb.append(", BBCNCLKLXCG23=");
		sb.append(BBCNCLKLXCG23);
		sb.append(", BBCNCLKLXCG24=");
		sb.append(BBCNCLKLXCG24);
		sb.append(", BBCNCLKLXCG26=");
		sb.append(BBCNCLKLXCG26);
		sb.append(", BBCNCLKLXCG27=");
		sb.append(BBCNCLKLXCG27);
		sb.append(", BBCNCLKLXCG28=");
		sb.append(BBCNCLKLXCG28);
		sb.append(", BBCNCLKLXCG29=");
		sb.append(BBCNCLKLXCG29);
		sb.append(", BBCNCLKLXCG30=");
		sb.append(BBCNCLKLXCG30);
		sb.append(", BBCNCLKLXCG31=");
		sb.append(BBCNCLKLXCG31);
		sb.append(", BBCNCLKLXCG33=");
		sb.append(BBCNCLKLXCG33);
		sb.append(", BBCNCLKLXCG34=");
		sb.append(BBCNCLKLXCG34);
		sb.append(", BBCNCLKLXCG35=");
		sb.append(BBCNCLKLXCG35);
		sb.append(", BBCNCLKLXCG36=");
		sb.append(BBCNCLKLXCG36);
		sb.append(", BBCNCLKLXCG38=");
		sb.append(BBCNCLKLXCG38);
		sb.append(", BBCNCLKLXCG39=");
		sb.append(BBCNCLKLXCG39);
		sb.append(", BBCNCLKLXCG40=");
		sb.append(BBCNCLKLXCG40);
		sb.append(", BBCNCLKLXCG42=");
		sb.append(BBCNCLKLXCG42);
		sb.append(", BBCNCLKLXCG43=");
		sb.append(BBCNCLKLXCG43);
		sb.append(", BBCNCLKLXCG44=");
		sb.append(BBCNCLKLXCG44);
		sb.append(", BBCNCLKLXCG45=");
		sb.append(BBCNCLKLXCG45);
		sb.append(", BBCNCLKLXCG46=");
		sb.append(BBCNCLKLXCG46);
		sb.append(", BBCNCLKLXCG47=");
		sb.append(BBCNCLKLXCG47);
		sb.append(", BBCNCLKLXCG48=");
		sb.append(BBCNCLKLXCG48);
		sb.append(", BBCNCLKLXCG49=");
		sb.append(BBCNCLKLXCG49);
		sb.append(", BBCNCLKLXCG50=");
		sb.append(BBCNCLKLXCG50);
		sb.append(", BBCNCLKLXCG51=");
		sb.append(BBCNCLKLXCG51);
		sb.append(", BBCNCLKLXCG52=");
		sb.append(BBCNCLKLXCG52);
		sb.append(", BBCNCLKLXCG53=");
		sb.append(BBCNCLKLXCG53);
		sb.append(", BBCNCLKLXCG54=");
		sb.append(BBCNCLKLXCG54);
		sb.append(", BBKTSPMXCG001=");
		sb.append(BBKTSPMXCG001);
		sb.append(", BBKTSPMXCG002=");
		sb.append(BBKTSPMXCG002);
		sb.append(", BBKTSPMXCG003=");
		sb.append(BBKTSPMXCG003);
		sb.append(", BBKTSPMXCG004=");
		sb.append(BBKTSPMXCG004);
		sb.append(", BBKTSPMXCG005=");
		sb.append(BBKTSPMXCG005);
		sb.append(", BBKTSPMXCG006=");
		sb.append(BBKTSPMXCG006);
		sb.append(", BBKTSPMXCG007=");
		sb.append(BBKTSPMXCG007);
		sb.append(", BBKTSPMXCG008=");
		sb.append(BBKTSPMXCG008);
		sb.append(", BBKTSPMXCG009=");
		sb.append(BBKTSPMXCG009);
		sb.append(", BBKTSPMXCG010=");
		sb.append(BBKTSPMXCG010);
		sb.append(", BBKTSPMXCG011=");
		sb.append(BBKTSPMXCG011);
		sb.append(", BBKTSPMXCG012=");
		sb.append(BBKTSPMXCG012);
		sb.append(", BBKTSPMXCG013=");
		sb.append(BBKTSPMXCG013);
		sb.append(", BBKTSPMXCG014=");
		sb.append(BBKTSPMXCG014);
		sb.append(", BBKTSPMXCG015=");
		sb.append(BBKTSPMXCG015);
		sb.append(", BBKTSPMXCG016=");
		sb.append(BBKTSPMXCG016);
		sb.append(", BBKTSPMXCG017=");
		sb.append(BBKTSPMXCG017);
		sb.append(", BBKTSPMXCG018=");
		sb.append(BBKTSPMXCG018);
		sb.append(", BBKTSPMXCG019=");
		sb.append(BBKTSPMXCG019);
		sb.append(", BBKTSPMXCG020=");
		sb.append(BBKTSPMXCG020);
		sb.append(", BBKTSPMXCG021=");
		sb.append(BBKTSPMXCG021);
		sb.append(", BBKTSPMXCG022=");
		sb.append(BBKTSPMXCG022);
		sb.append(", BBKTSPMXCG023=");
		sb.append(BBKTSPMXCG023);
		sb.append(", BBKTSPMXCG024=");
		sb.append(BBKTSPMXCG024);
		sb.append(", BBKTSPMXCG025=");
		sb.append(BBKTSPMXCG025);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XCGPart6 toEntityModel() {
		VRTechnicalSpec_XCGPart6Impl vrTechnicalSpec_XCGPart6Impl = new VRTechnicalSpec_XCGPart6Impl();

		vrTechnicalSpec_XCGPart6Impl.setId(id);
		vrTechnicalSpec_XCGPart6Impl.setMtCore(mtCore);
		vrTechnicalSpec_XCGPart6Impl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XCGPart6Impl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XCGPart6Impl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XCGPart6Impl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XCGPart6Impl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XCGPart6Impl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XCGPart6Impl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XCG01757 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01757(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01757(XCG01757);
		}

		if (XCG01758 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01758(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01758(XCG01758);
		}

		if (XCG01759 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01759(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01759(XCG01759);
		}

		if (XCG01948 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01948(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01948(XCG01948);
		}

		if (XCG01760 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01760(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01760(XCG01760);
		}

		if (XCG01949 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01949(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01949(XCG01949);
		}

		if (XCG01761 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01761(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01761(XCG01761);
		}

		if (XCG01950 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01950(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01950(XCG01950);
		}

		if (XCG01762 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01762(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01762(XCG01762);
		}

		if (XCG01951 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01951(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01951(XCG01951);
		}

		if (XCG01763 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01763(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01763(XCG01763);
		}

		if (XCG01952 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01952(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01952(XCG01952);
		}

		if (XCG01764 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01764(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01764(XCG01764);
		}

		if (XCG01953 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01953(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01953(XCG01953);
		}

		if (XCG01765 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01765(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01765(XCG01765);
		}

		if (XCG01954 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01954(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01954(XCG01954);
		}

		if (XCG01766 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01766(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01766(XCG01766);
		}

		if (XCG01955 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01955(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01955(XCG01955);
		}

		if (XCG01767 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01767(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01767(XCG01767);
		}

		if (XCG01956 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01956(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01956(XCG01956);
		}

		if (XCG01768 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01768(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01768(XCG01768);
		}

		if (XCG01957 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01957(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01957(XCG01957);
		}

		if (XCG01769 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01769(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01769(XCG01769);
		}

		if (XCG01958 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01958(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01958(XCG01958);
		}

		if (XCG01770 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01770(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01770(XCG01770);
		}

		if (XCG01771 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01771(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01771(XCG01771);
		}

		if (XCG01959 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01959(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01959(XCG01959);
		}

		if (XCG01772 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01772(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01772(XCG01772);
		}

		if (XCG01773 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01773(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01773(XCG01773);
		}

		if (XCG01774 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01774(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01774(XCG01774);
		}

		if (XCG01775 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01775(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01775(XCG01775);
		}

		if (XCG01776 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01776(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01776(XCG01776);
		}

		if (XCG01777 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01777(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01777(XCG01777);
		}

		if (XCG01778 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01778(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01778(XCG01778);
		}

		if (XCG01779 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01779(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01779(XCG01779);
		}

		if (XCG01780 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01780(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01780(XCG01780);
		}

		if (XCG01781 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01781(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01781(XCG01781);
		}

		if (XCG01783 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01783(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01783(XCG01783);
		}

		if (XCG01785 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01785(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01785(XCG01785);
		}

		if (XCG01786 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01786(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01786(XCG01786);
		}

		if (XCG01787 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01787(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01787(XCG01787);
		}

		if (XCG01788 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01788(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01788(XCG01788);
		}

		if (XCG01789 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01789(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01789(XCG01789);
		}

		if (XCG01790 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01790(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01790(XCG01790);
		}

		if (XCG01791 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01791(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01791(XCG01791);
		}

		if (XCG01792 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01792(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01792(XCG01792);
		}

		if (XCG01793 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01793(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01793(XCG01793);
		}

		if (XCG01794 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01794(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01794(XCG01794);
		}

		if (XCG01795 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01795(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01795(XCG01795);
		}

		if (XCG01796 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01796(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01796(XCG01796);
		}

		if (XCG01797 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01797(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01797(XCG01797);
		}

		if (XCG01798 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01798(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01798(XCG01798);
		}

		if (XCG01799 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01799(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01799(XCG01799);
		}

		if (XCG01801 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01801(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01801(XCG01801);
		}

		if (XCG01802 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01802(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01802(XCG01802);
		}

		if (XCG01803 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01803(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01803(XCG01803);
		}

		if (XCG01804 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01804(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01804(XCG01804);
		}

		if (XCG01805 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01805(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01805(XCG01805);
		}

		if (XCG01806 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01806(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01806(XCG01806);
		}

		if (XCG01807 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01807(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01807(XCG01807);
		}

		if (XCG01808 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01808(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01808(XCG01808);
		}

		if (XCG01809 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01809(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01809(XCG01809);
		}

		if (XCG01810 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01810(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01810(XCG01810);
		}

		if (XCG01811 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01811(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01811(XCG01811);
		}

		if (XCG01812 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01812(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01812(XCG01812);
		}

		if (XCG01813 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01813(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01813(XCG01813);
		}

		if (XCG01814 == null) {
			vrTechnicalSpec_XCGPart6Impl.setXCG01814(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setXCG01814(XCG01814);
		}

		if (TDTKXCG001 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG001(TDTKXCG001);
		}

		if (TDTKXCG002 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG002(TDTKXCG002);
		}

		if (TDTKXCG003 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG003(TDTKXCG003);
		}

		if (TDTKXCG004 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG004(TDTKXCG004);
		}

		if (TDTKXCG005 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG005(TDTKXCG005);
		}

		if (TDTKXCG006 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG006(TDTKXCG006);
		}

		if (TDTKXCG007 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG007(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG007(TDTKXCG007);
		}

		if (TDTKXCG008 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG008(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG008(TDTKXCG008);
		}

		if (TDTKXCG009 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG009(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG009(TDTKXCG009);
		}

		if (TDTKXCG010 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG010(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG010(TDTKXCG010);
		}

		if (TDTKXCG011 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG011(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG011(TDTKXCG011);
		}

		if (TDTKXCG012 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG012(TDTKXCG012);
		}

		if (TDTKXCG013 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG013(TDTKXCG013);
		}

		if (TDTKXCG014 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG014(TDTKXCG014);
		}

		if (TDTKXCG015 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG015(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG015(TDTKXCG015);
		}

		if (TDTKXCG016 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG016(TDTKXCG016);
		}

		if (TDTKXCG017 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG017(TDTKXCG017);
		}

		if (TDTKXCG018 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG018(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG018(TDTKXCG018);
		}

		if (TDTKXCG019 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG019(TDTKXCG019);
		}

		if (TDTKXCG020 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG020(TDTKXCG020);
		}

		if (TDTKXCG021 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG021(TDTKXCG021);
		}

		if (TDTKXCG022 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG022(TDTKXCG022);
		}

		if (TDTKXCG023 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG023(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG023(TDTKXCG023);
		}

		if (TDTKXCG024 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG024(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG024(TDTKXCG024);
		}

		if (TDTKXCG025 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG025(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG025(TDTKXCG025);
		}

		if (TDTKXCG026 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG026(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG026(TDTKXCG026);
		}

		if (TDTKXCG027 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG027(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG027(TDTKXCG027);
		}

		if (TDTKXCG028 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG028(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG028(TDTKXCG028);
		}

		if (TDTKXCG029 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG029(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG029(TDTKXCG029);
		}

		if (TDTKXCG030 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG030(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG030(TDTKXCG030);
		}

		if (TDTKXCG031 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG031(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG031(TDTKXCG031);
		}

		if (TDTKXCG032 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG032(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG032(TDTKXCG032);
		}

		if (TDTKXCG033 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG033(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG033(TDTKXCG033);
		}

		if (TDTKXCG034 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG034(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG034(TDTKXCG034);
		}

		if (TDTKXCG035 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG035(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG035(TDTKXCG035);
		}

		if (TDTKXCG036 == null) {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG036(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setTDTKXCG036(TDTKXCG036);
		}

		if (BBCNCLKLXCG01 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG01(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG01(BBCNCLKLXCG01);
		}

		if (BBCNCLKLXCG02 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG02(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG02(BBCNCLKLXCG02);
		}

		if (BBCNCLKLXCG03 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG03(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG03(BBCNCLKLXCG03);
		}

		if (BBCNCLKLXCG04 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG04(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG04(BBCNCLKLXCG04);
		}

		if (BBCNCLKLXCG05 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG05(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG05(BBCNCLKLXCG05);
		}

		if (BBCNCLKLXCG06 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG06(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG06(BBCNCLKLXCG06);
		}

		if (BBCNCLKLXCG07 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG07(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG07(BBCNCLKLXCG07);
		}

		if (BBCNCLKLXCG08 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG08(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG08(BBCNCLKLXCG08);
		}

		if (BBCNCLKLXCG09 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG09(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG09(BBCNCLKLXCG09);
		}

		if (BBCNCLKLXCG10 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG10(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG10(BBCNCLKLXCG10);
		}

		if (BBCNCLKLXCG11 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG11(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG11(BBCNCLKLXCG11);
		}

		if (BBCNCLKLXCG12 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG12(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG12(BBCNCLKLXCG12);
		}

		if (BBCNCLKLXCG13 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG13(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG13(BBCNCLKLXCG13);
		}

		if (BBCNCLKLXCG14 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG14(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG14(BBCNCLKLXCG14);
		}

		if (BBCNCLKLXCG15 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG15(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG15(BBCNCLKLXCG15);
		}

		if (BBCNCLKLXCG16 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG16(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG16(BBCNCLKLXCG16);
		}

		if (BBCNCLKLXCG17 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG17(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG17(BBCNCLKLXCG17);
		}

		if (BBCNCLKLXCG18 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG18(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG18(BBCNCLKLXCG18);
		}

		if (BBCNCLKLXCG19 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG19(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG19(BBCNCLKLXCG19);
		}

		if (BBCNCLKLXCG20 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG20(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG20(BBCNCLKLXCG20);
		}

		if (BBCNCLKLXCG21 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG21(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG21(BBCNCLKLXCG21);
		}

		if (BBCNCLKLXCG22 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG22(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG22(BBCNCLKLXCG22);
		}

		if (BBCNCLKLXCG23 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG23(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG23(BBCNCLKLXCG23);
		}

		if (BBCNCLKLXCG24 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG24(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG24(BBCNCLKLXCG24);
		}

		if (BBCNCLKLXCG26 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG26(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG26(BBCNCLKLXCG26);
		}

		if (BBCNCLKLXCG27 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG27(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG27(BBCNCLKLXCG27);
		}

		if (BBCNCLKLXCG28 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG28(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG28(BBCNCLKLXCG28);
		}

		if (BBCNCLKLXCG29 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG29(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG29(BBCNCLKLXCG29);
		}

		if (BBCNCLKLXCG30 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG30(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG30(BBCNCLKLXCG30);
		}

		if (BBCNCLKLXCG31 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG31(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG31(BBCNCLKLXCG31);
		}

		if (BBCNCLKLXCG33 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG33(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG33(BBCNCLKLXCG33);
		}

		if (BBCNCLKLXCG34 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG34(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG34(BBCNCLKLXCG34);
		}

		if (BBCNCLKLXCG35 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG35(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG35(BBCNCLKLXCG35);
		}

		if (BBCNCLKLXCG36 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG36(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG36(BBCNCLKLXCG36);
		}

		if (BBCNCLKLXCG38 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG38(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG38(BBCNCLKLXCG38);
		}

		if (BBCNCLKLXCG39 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG39(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG39(BBCNCLKLXCG39);
		}

		if (BBCNCLKLXCG40 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG40(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG40(BBCNCLKLXCG40);
		}

		if (BBCNCLKLXCG42 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG42(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG42(BBCNCLKLXCG42);
		}

		if (BBCNCLKLXCG43 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG43(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG43(BBCNCLKLXCG43);
		}

		if (BBCNCLKLXCG44 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG44(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG44(BBCNCLKLXCG44);
		}

		if (BBCNCLKLXCG45 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG45(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG45(BBCNCLKLXCG45);
		}

		if (BBCNCLKLXCG46 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG46(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG46(BBCNCLKLXCG46);
		}

		if (BBCNCLKLXCG47 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG47(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG47(BBCNCLKLXCG47);
		}

		if (BBCNCLKLXCG48 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG48(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG48(BBCNCLKLXCG48);
		}

		if (BBCNCLKLXCG49 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG49(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG49(BBCNCLKLXCG49);
		}

		if (BBCNCLKLXCG50 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG50(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG50(BBCNCLKLXCG50);
		}

		if (BBCNCLKLXCG51 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG51(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG51(BBCNCLKLXCG51);
		}

		if (BBCNCLKLXCG52 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG52(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG52(BBCNCLKLXCG52);
		}

		if (BBCNCLKLXCG53 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG53(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG53(BBCNCLKLXCG53);
		}

		if (BBCNCLKLXCG54 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG54(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG54(BBCNCLKLXCG54);
		}

		if (BBKTSPMXCG001 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG001(BBKTSPMXCG001);
		}

		if (BBKTSPMXCG002 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG002(BBKTSPMXCG002);
		}

		if (BBKTSPMXCG003 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG003(BBKTSPMXCG003);
		}

		if (BBKTSPMXCG004 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG004(BBKTSPMXCG004);
		}

		if (BBKTSPMXCG005 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG005(BBKTSPMXCG005);
		}

		if (BBKTSPMXCG006 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG006(BBKTSPMXCG006);
		}

		if (BBKTSPMXCG007 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG007(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG007(BBKTSPMXCG007);
		}

		if (BBKTSPMXCG008 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG008(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG008(BBKTSPMXCG008);
		}

		if (BBKTSPMXCG009 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG009(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG009(BBKTSPMXCG009);
		}

		if (BBKTSPMXCG010 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG010(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG010(BBKTSPMXCG010);
		}

		if (BBKTSPMXCG011 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG011(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG011(BBKTSPMXCG011);
		}

		if (BBKTSPMXCG012 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG012(BBKTSPMXCG012);
		}

		if (BBKTSPMXCG013 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG013(BBKTSPMXCG013);
		}

		if (BBKTSPMXCG014 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG014(BBKTSPMXCG014);
		}

		if (BBKTSPMXCG015 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG015(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG015(BBKTSPMXCG015);
		}

		if (BBKTSPMXCG016 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG016(BBKTSPMXCG016);
		}

		if (BBKTSPMXCG017 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG017(BBKTSPMXCG017);
		}

		if (BBKTSPMXCG018 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG018(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG018(BBKTSPMXCG018);
		}

		if (BBKTSPMXCG019 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG019(BBKTSPMXCG019);
		}

		if (BBKTSPMXCG020 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG020(BBKTSPMXCG020);
		}

		if (BBKTSPMXCG021 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG021(BBKTSPMXCG021);
		}

		if (BBKTSPMXCG022 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG022(BBKTSPMXCG022);
		}

		if (BBKTSPMXCG023 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG023(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG023(BBKTSPMXCG023);
		}

		if (BBKTSPMXCG024 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG024(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG024(BBKTSPMXCG024);
		}

		if (BBKTSPMXCG025 == null) {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG025(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG025(BBKTSPMXCG025);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCGPart6Impl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCGPart6Impl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XCGPart6Impl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XCGPart6Impl.resetOriginalValues();

		return vrTechnicalSpec_XCGPart6Impl;
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
		XCG01757 = objectInput.readUTF();
		XCG01758 = objectInput.readUTF();
		XCG01759 = objectInput.readUTF();
		XCG01948 = objectInput.readUTF();
		XCG01760 = objectInput.readUTF();
		XCG01949 = objectInput.readUTF();
		XCG01761 = objectInput.readUTF();
		XCG01950 = objectInput.readUTF();
		XCG01762 = objectInput.readUTF();
		XCG01951 = objectInput.readUTF();
		XCG01763 = objectInput.readUTF();
		XCG01952 = objectInput.readUTF();
		XCG01764 = objectInput.readUTF();
		XCG01953 = objectInput.readUTF();
		XCG01765 = objectInput.readUTF();
		XCG01954 = objectInput.readUTF();
		XCG01766 = objectInput.readUTF();
		XCG01955 = objectInput.readUTF();
		XCG01767 = objectInput.readUTF();
		XCG01956 = objectInput.readUTF();
		XCG01768 = objectInput.readUTF();
		XCG01957 = objectInput.readUTF();
		XCG01769 = objectInput.readUTF();
		XCG01958 = objectInput.readUTF();
		XCG01770 = objectInput.readUTF();
		XCG01771 = objectInput.readUTF();
		XCG01959 = objectInput.readUTF();
		XCG01772 = objectInput.readUTF();
		XCG01773 = objectInput.readUTF();
		XCG01774 = objectInput.readUTF();
		XCG01775 = objectInput.readUTF();
		XCG01776 = objectInput.readUTF();
		XCG01777 = objectInput.readUTF();
		XCG01778 = objectInput.readUTF();
		XCG01779 = objectInput.readUTF();
		XCG01780 = objectInput.readUTF();
		XCG01781 = objectInput.readUTF();
		XCG01783 = objectInput.readUTF();
		XCG01785 = objectInput.readUTF();
		XCG01786 = objectInput.readUTF();
		XCG01787 = objectInput.readUTF();
		XCG01788 = objectInput.readUTF();
		XCG01789 = objectInput.readUTF();
		XCG01790 = objectInput.readUTF();
		XCG01791 = objectInput.readUTF();
		XCG01792 = objectInput.readUTF();
		XCG01793 = objectInput.readUTF();
		XCG01794 = objectInput.readUTF();
		XCG01795 = objectInput.readUTF();
		XCG01796 = objectInput.readUTF();
		XCG01797 = objectInput.readUTF();
		XCG01798 = objectInput.readUTF();
		XCG01799 = objectInput.readUTF();
		XCG01801 = objectInput.readUTF();
		XCG01802 = objectInput.readUTF();
		XCG01803 = objectInput.readUTF();
		XCG01804 = objectInput.readUTF();
		XCG01805 = objectInput.readUTF();
		XCG01806 = objectInput.readUTF();
		XCG01807 = objectInput.readUTF();
		XCG01808 = objectInput.readUTF();
		XCG01809 = objectInput.readUTF();
		XCG01810 = objectInput.readUTF();
		XCG01811 = objectInput.readUTF();
		XCG01812 = objectInput.readUTF();
		XCG01813 = objectInput.readUTF();
		XCG01814 = objectInput.readUTF();
		TDTKXCG001 = objectInput.readUTF();
		TDTKXCG002 = objectInput.readUTF();
		TDTKXCG003 = objectInput.readUTF();
		TDTKXCG004 = objectInput.readUTF();
		TDTKXCG005 = objectInput.readUTF();
		TDTKXCG006 = objectInput.readUTF();
		TDTKXCG007 = objectInput.readUTF();
		TDTKXCG008 = objectInput.readUTF();
		TDTKXCG009 = objectInput.readUTF();
		TDTKXCG010 = objectInput.readUTF();
		TDTKXCG011 = objectInput.readUTF();
		TDTKXCG012 = objectInput.readUTF();
		TDTKXCG013 = objectInput.readUTF();
		TDTKXCG014 = objectInput.readUTF();
		TDTKXCG015 = objectInput.readUTF();
		TDTKXCG016 = objectInput.readUTF();
		TDTKXCG017 = objectInput.readUTF();
		TDTKXCG018 = objectInput.readUTF();
		TDTKXCG019 = objectInput.readUTF();
		TDTKXCG020 = objectInput.readUTF();
		TDTKXCG021 = objectInput.readUTF();
		TDTKXCG022 = objectInput.readUTF();
		TDTKXCG023 = objectInput.readUTF();
		TDTKXCG024 = objectInput.readUTF();
		TDTKXCG025 = objectInput.readUTF();
		TDTKXCG026 = objectInput.readUTF();
		TDTKXCG027 = objectInput.readUTF();
		TDTKXCG028 = objectInput.readUTF();
		TDTKXCG029 = objectInput.readUTF();
		TDTKXCG030 = objectInput.readUTF();
		TDTKXCG031 = objectInput.readUTF();
		TDTKXCG032 = objectInput.readUTF();
		TDTKXCG033 = objectInput.readUTF();
		TDTKXCG034 = objectInput.readUTF();
		TDTKXCG035 = objectInput.readUTF();
		TDTKXCG036 = objectInput.readUTF();
		BBCNCLKLXCG01 = objectInput.readUTF();
		BBCNCLKLXCG02 = objectInput.readUTF();
		BBCNCLKLXCG03 = objectInput.readUTF();
		BBCNCLKLXCG04 = objectInput.readUTF();
		BBCNCLKLXCG05 = objectInput.readUTF();
		BBCNCLKLXCG06 = objectInput.readUTF();
		BBCNCLKLXCG07 = objectInput.readUTF();
		BBCNCLKLXCG08 = objectInput.readUTF();
		BBCNCLKLXCG09 = objectInput.readUTF();
		BBCNCLKLXCG10 = objectInput.readUTF();
		BBCNCLKLXCG11 = objectInput.readUTF();
		BBCNCLKLXCG12 = objectInput.readUTF();
		BBCNCLKLXCG13 = objectInput.readUTF();
		BBCNCLKLXCG14 = objectInput.readUTF();
		BBCNCLKLXCG15 = objectInput.readUTF();
		BBCNCLKLXCG16 = objectInput.readUTF();
		BBCNCLKLXCG17 = objectInput.readUTF();
		BBCNCLKLXCG18 = objectInput.readUTF();
		BBCNCLKLXCG19 = objectInput.readUTF();
		BBCNCLKLXCG20 = objectInput.readUTF();
		BBCNCLKLXCG21 = objectInput.readUTF();
		BBCNCLKLXCG22 = objectInput.readUTF();
		BBCNCLKLXCG23 = objectInput.readUTF();
		BBCNCLKLXCG24 = objectInput.readUTF();
		BBCNCLKLXCG26 = objectInput.readUTF();
		BBCNCLKLXCG27 = objectInput.readUTF();
		BBCNCLKLXCG28 = objectInput.readUTF();
		BBCNCLKLXCG29 = objectInput.readUTF();
		BBCNCLKLXCG30 = objectInput.readUTF();
		BBCNCLKLXCG31 = objectInput.readUTF();
		BBCNCLKLXCG33 = objectInput.readUTF();
		BBCNCLKLXCG34 = objectInput.readUTF();
		BBCNCLKLXCG35 = objectInput.readUTF();
		BBCNCLKLXCG36 = objectInput.readUTF();
		BBCNCLKLXCG38 = objectInput.readUTF();
		BBCNCLKLXCG39 = objectInput.readUTF();
		BBCNCLKLXCG40 = objectInput.readUTF();
		BBCNCLKLXCG42 = objectInput.readUTF();
		BBCNCLKLXCG43 = objectInput.readUTF();
		BBCNCLKLXCG44 = objectInput.readUTF();
		BBCNCLKLXCG45 = objectInput.readUTF();
		BBCNCLKLXCG46 = objectInput.readUTF();
		BBCNCLKLXCG47 = objectInput.readUTF();
		BBCNCLKLXCG48 = objectInput.readUTF();
		BBCNCLKLXCG49 = objectInput.readUTF();
		BBCNCLKLXCG50 = objectInput.readUTF();
		BBCNCLKLXCG51 = objectInput.readUTF();
		BBCNCLKLXCG52 = objectInput.readUTF();
		BBCNCLKLXCG53 = objectInput.readUTF();
		BBCNCLKLXCG54 = objectInput.readUTF();
		BBKTSPMXCG001 = objectInput.readUTF();
		BBKTSPMXCG002 = objectInput.readUTF();
		BBKTSPMXCG003 = objectInput.readUTF();
		BBKTSPMXCG004 = objectInput.readUTF();
		BBKTSPMXCG005 = objectInput.readUTF();
		BBKTSPMXCG006 = objectInput.readUTF();
		BBKTSPMXCG007 = objectInput.readUTF();
		BBKTSPMXCG008 = objectInput.readUTF();
		BBKTSPMXCG009 = objectInput.readUTF();
		BBKTSPMXCG010 = objectInput.readUTF();
		BBKTSPMXCG011 = objectInput.readUTF();
		BBKTSPMXCG012 = objectInput.readUTF();
		BBKTSPMXCG013 = objectInput.readUTF();
		BBKTSPMXCG014 = objectInput.readUTF();
		BBKTSPMXCG015 = objectInput.readUTF();
		BBKTSPMXCG016 = objectInput.readUTF();
		BBKTSPMXCG017 = objectInput.readUTF();
		BBKTSPMXCG018 = objectInput.readUTF();
		BBKTSPMXCG019 = objectInput.readUTF();
		BBKTSPMXCG020 = objectInput.readUTF();
		BBKTSPMXCG021 = objectInput.readUTF();
		BBKTSPMXCG022 = objectInput.readUTF();
		BBKTSPMXCG023 = objectInput.readUTF();
		BBKTSPMXCG024 = objectInput.readUTF();
		BBKTSPMXCG025 = objectInput.readUTF();
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

		if (XCG01757 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01757);
		}

		if (XCG01758 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01758);
		}

		if (XCG01759 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01759);
		}

		if (XCG01948 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01948);
		}

		if (XCG01760 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01760);
		}

		if (XCG01949 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01949);
		}

		if (XCG01761 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01761);
		}

		if (XCG01950 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01950);
		}

		if (XCG01762 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01762);
		}

		if (XCG01951 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01951);
		}

		if (XCG01763 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01763);
		}

		if (XCG01952 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01952);
		}

		if (XCG01764 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01764);
		}

		if (XCG01953 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01953);
		}

		if (XCG01765 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01765);
		}

		if (XCG01954 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01954);
		}

		if (XCG01766 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01766);
		}

		if (XCG01955 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01955);
		}

		if (XCG01767 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01767);
		}

		if (XCG01956 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01956);
		}

		if (XCG01768 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01768);
		}

		if (XCG01957 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01957);
		}

		if (XCG01769 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01769);
		}

		if (XCG01958 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01958);
		}

		if (XCG01770 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01770);
		}

		if (XCG01771 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01771);
		}

		if (XCG01959 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01959);
		}

		if (XCG01772 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01772);
		}

		if (XCG01773 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01773);
		}

		if (XCG01774 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01774);
		}

		if (XCG01775 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01775);
		}

		if (XCG01776 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01776);
		}

		if (XCG01777 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01777);
		}

		if (XCG01778 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01778);
		}

		if (XCG01779 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01779);
		}

		if (XCG01780 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01780);
		}

		if (XCG01781 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01781);
		}

		if (XCG01783 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01783);
		}

		if (XCG01785 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01785);
		}

		if (XCG01786 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01786);
		}

		if (XCG01787 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01787);
		}

		if (XCG01788 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01788);
		}

		if (XCG01789 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01789);
		}

		if (XCG01790 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01790);
		}

		if (XCG01791 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01791);
		}

		if (XCG01792 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01792);
		}

		if (XCG01793 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01793);
		}

		if (XCG01794 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01794);
		}

		if (XCG01795 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01795);
		}

		if (XCG01796 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01796);
		}

		if (XCG01797 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01797);
		}

		if (XCG01798 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01798);
		}

		if (XCG01799 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01799);
		}

		if (XCG01801 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01801);
		}

		if (XCG01802 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01802);
		}

		if (XCG01803 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01803);
		}

		if (XCG01804 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01804);
		}

		if (XCG01805 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01805);
		}

		if (XCG01806 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01806);
		}

		if (XCG01807 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01807);
		}

		if (XCG01808 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01808);
		}

		if (XCG01809 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01809);
		}

		if (XCG01810 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01810);
		}

		if (XCG01811 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01811);
		}

		if (XCG01812 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01812);
		}

		if (XCG01813 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01813);
		}

		if (XCG01814 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01814);
		}

		if (TDTKXCG001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG001);
		}

		if (TDTKXCG002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG002);
		}

		if (TDTKXCG003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG003);
		}

		if (TDTKXCG004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG004);
		}

		if (TDTKXCG005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG005);
		}

		if (TDTKXCG006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG006);
		}

		if (TDTKXCG007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG007);
		}

		if (TDTKXCG008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG008);
		}

		if (TDTKXCG009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG009);
		}

		if (TDTKXCG010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG010);
		}

		if (TDTKXCG011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG011);
		}

		if (TDTKXCG012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG012);
		}

		if (TDTKXCG013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG013);
		}

		if (TDTKXCG014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG014);
		}

		if (TDTKXCG015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG015);
		}

		if (TDTKXCG016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG016);
		}

		if (TDTKXCG017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG017);
		}

		if (TDTKXCG018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG018);
		}

		if (TDTKXCG019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG019);
		}

		if (TDTKXCG020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG020);
		}

		if (TDTKXCG021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG021);
		}

		if (TDTKXCG022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG022);
		}

		if (TDTKXCG023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG023);
		}

		if (TDTKXCG024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG024);
		}

		if (TDTKXCG025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG025);
		}

		if (TDTKXCG026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG026);
		}

		if (TDTKXCG027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG027);
		}

		if (TDTKXCG028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG028);
		}

		if (TDTKXCG029 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG029);
		}

		if (TDTKXCG030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG030);
		}

		if (TDTKXCG031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG031);
		}

		if (TDTKXCG032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG032);
		}

		if (TDTKXCG033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG033);
		}

		if (TDTKXCG034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG034);
		}

		if (TDTKXCG035 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG035);
		}

		if (TDTKXCG036 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TDTKXCG036);
		}

		if (BBCNCLKLXCG01 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG01);
		}

		if (BBCNCLKLXCG02 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG02);
		}

		if (BBCNCLKLXCG03 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG03);
		}

		if (BBCNCLKLXCG04 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG04);
		}

		if (BBCNCLKLXCG05 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG05);
		}

		if (BBCNCLKLXCG06 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG06);
		}

		if (BBCNCLKLXCG07 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG07);
		}

		if (BBCNCLKLXCG08 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG08);
		}

		if (BBCNCLKLXCG09 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG09);
		}

		if (BBCNCLKLXCG10 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG10);
		}

		if (BBCNCLKLXCG11 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG11);
		}

		if (BBCNCLKLXCG12 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG12);
		}

		if (BBCNCLKLXCG13 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG13);
		}

		if (BBCNCLKLXCG14 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG14);
		}

		if (BBCNCLKLXCG15 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG15);
		}

		if (BBCNCLKLXCG16 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG16);
		}

		if (BBCNCLKLXCG17 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG17);
		}

		if (BBCNCLKLXCG18 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG18);
		}

		if (BBCNCLKLXCG19 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG19);
		}

		if (BBCNCLKLXCG20 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG20);
		}

		if (BBCNCLKLXCG21 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG21);
		}

		if (BBCNCLKLXCG22 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG22);
		}

		if (BBCNCLKLXCG23 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG23);
		}

		if (BBCNCLKLXCG24 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG24);
		}

		if (BBCNCLKLXCG26 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG26);
		}

		if (BBCNCLKLXCG27 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG27);
		}

		if (BBCNCLKLXCG28 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG28);
		}

		if (BBCNCLKLXCG29 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG29);
		}

		if (BBCNCLKLXCG30 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG30);
		}

		if (BBCNCLKLXCG31 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG31);
		}

		if (BBCNCLKLXCG33 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG33);
		}

		if (BBCNCLKLXCG34 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG34);
		}

		if (BBCNCLKLXCG35 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG35);
		}

		if (BBCNCLKLXCG36 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG36);
		}

		if (BBCNCLKLXCG38 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG38);
		}

		if (BBCNCLKLXCG39 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG39);
		}

		if (BBCNCLKLXCG40 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG40);
		}

		if (BBCNCLKLXCG42 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG42);
		}

		if (BBCNCLKLXCG43 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG43);
		}

		if (BBCNCLKLXCG44 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG44);
		}

		if (BBCNCLKLXCG45 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG45);
		}

		if (BBCNCLKLXCG46 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG46);
		}

		if (BBCNCLKLXCG47 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG47);
		}

		if (BBCNCLKLXCG48 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG48);
		}

		if (BBCNCLKLXCG49 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG49);
		}

		if (BBCNCLKLXCG50 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG50);
		}

		if (BBCNCLKLXCG51 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG51);
		}

		if (BBCNCLKLXCG52 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG52);
		}

		if (BBCNCLKLXCG53 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG53);
		}

		if (BBCNCLKLXCG54 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBCNCLKLXCG54);
		}

		if (BBKTSPMXCG001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG001);
		}

		if (BBKTSPMXCG002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG002);
		}

		if (BBKTSPMXCG003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG003);
		}

		if (BBKTSPMXCG004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG004);
		}

		if (BBKTSPMXCG005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG005);
		}

		if (BBKTSPMXCG006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG006);
		}

		if (BBKTSPMXCG007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG007);
		}

		if (BBKTSPMXCG008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG008);
		}

		if (BBKTSPMXCG009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG009);
		}

		if (BBKTSPMXCG010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG010);
		}

		if (BBKTSPMXCG011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG011);
		}

		if (BBKTSPMXCG012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG012);
		}

		if (BBKTSPMXCG013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG013);
		}

		if (BBKTSPMXCG014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG014);
		}

		if (BBKTSPMXCG015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG015);
		}

		if (BBKTSPMXCG016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG016);
		}

		if (BBKTSPMXCG017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG017);
		}

		if (BBKTSPMXCG018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG018);
		}

		if (BBKTSPMXCG019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG019);
		}

		if (BBKTSPMXCG020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG020);
		}

		if (BBKTSPMXCG021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG021);
		}

		if (BBKTSPMXCG022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG022);
		}

		if (BBKTSPMXCG023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG023);
		}

		if (BBKTSPMXCG024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG024);
		}

		if (BBKTSPMXCG025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBKTSPMXCG025);
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
	public String XCG01757;
	public String XCG01758;
	public String XCG01759;
	public String XCG01948;
	public String XCG01760;
	public String XCG01949;
	public String XCG01761;
	public String XCG01950;
	public String XCG01762;
	public String XCG01951;
	public String XCG01763;
	public String XCG01952;
	public String XCG01764;
	public String XCG01953;
	public String XCG01765;
	public String XCG01954;
	public String XCG01766;
	public String XCG01955;
	public String XCG01767;
	public String XCG01956;
	public String XCG01768;
	public String XCG01957;
	public String XCG01769;
	public String XCG01958;
	public String XCG01770;
	public String XCG01771;
	public String XCG01959;
	public String XCG01772;
	public String XCG01773;
	public String XCG01774;
	public String XCG01775;
	public String XCG01776;
	public String XCG01777;
	public String XCG01778;
	public String XCG01779;
	public String XCG01780;
	public String XCG01781;
	public String XCG01783;
	public String XCG01785;
	public String XCG01786;
	public String XCG01787;
	public String XCG01788;
	public String XCG01789;
	public String XCG01790;
	public String XCG01791;
	public String XCG01792;
	public String XCG01793;
	public String XCG01794;
	public String XCG01795;
	public String XCG01796;
	public String XCG01797;
	public String XCG01798;
	public String XCG01799;
	public String XCG01801;
	public String XCG01802;
	public String XCG01803;
	public String XCG01804;
	public String XCG01805;
	public String XCG01806;
	public String XCG01807;
	public String XCG01808;
	public String XCG01809;
	public String XCG01810;
	public String XCG01811;
	public String XCG01812;
	public String XCG01813;
	public String XCG01814;
	public String TDTKXCG001;
	public String TDTKXCG002;
	public String TDTKXCG003;
	public String TDTKXCG004;
	public String TDTKXCG005;
	public String TDTKXCG006;
	public String TDTKXCG007;
	public String TDTKXCG008;
	public String TDTKXCG009;
	public String TDTKXCG010;
	public String TDTKXCG011;
	public String TDTKXCG012;
	public String TDTKXCG013;
	public String TDTKXCG014;
	public String TDTKXCG015;
	public String TDTKXCG016;
	public String TDTKXCG017;
	public String TDTKXCG018;
	public String TDTKXCG019;
	public String TDTKXCG020;
	public String TDTKXCG021;
	public String TDTKXCG022;
	public String TDTKXCG023;
	public String TDTKXCG024;
	public String TDTKXCG025;
	public String TDTKXCG026;
	public String TDTKXCG027;
	public String TDTKXCG028;
	public String TDTKXCG029;
	public String TDTKXCG030;
	public String TDTKXCG031;
	public String TDTKXCG032;
	public String TDTKXCG033;
	public String TDTKXCG034;
	public String TDTKXCG035;
	public String TDTKXCG036;
	public String BBCNCLKLXCG01;
	public String BBCNCLKLXCG02;
	public String BBCNCLKLXCG03;
	public String BBCNCLKLXCG04;
	public String BBCNCLKLXCG05;
	public String BBCNCLKLXCG06;
	public String BBCNCLKLXCG07;
	public String BBCNCLKLXCG08;
	public String BBCNCLKLXCG09;
	public String BBCNCLKLXCG10;
	public String BBCNCLKLXCG11;
	public String BBCNCLKLXCG12;
	public String BBCNCLKLXCG13;
	public String BBCNCLKLXCG14;
	public String BBCNCLKLXCG15;
	public String BBCNCLKLXCG16;
	public String BBCNCLKLXCG17;
	public String BBCNCLKLXCG18;
	public String BBCNCLKLXCG19;
	public String BBCNCLKLXCG20;
	public String BBCNCLKLXCG21;
	public String BBCNCLKLXCG22;
	public String BBCNCLKLXCG23;
	public String BBCNCLKLXCG24;
	public String BBCNCLKLXCG26;
	public String BBCNCLKLXCG27;
	public String BBCNCLKLXCG28;
	public String BBCNCLKLXCG29;
	public String BBCNCLKLXCG30;
	public String BBCNCLKLXCG31;
	public String BBCNCLKLXCG33;
	public String BBCNCLKLXCG34;
	public String BBCNCLKLXCG35;
	public String BBCNCLKLXCG36;
	public String BBCNCLKLXCG38;
	public String BBCNCLKLXCG39;
	public String BBCNCLKLXCG40;
	public String BBCNCLKLXCG42;
	public String BBCNCLKLXCG43;
	public String BBCNCLKLXCG44;
	public String BBCNCLKLXCG45;
	public String BBCNCLKLXCG46;
	public String BBCNCLKLXCG47;
	public String BBCNCLKLXCG48;
	public String BBCNCLKLXCG49;
	public String BBCNCLKLXCG50;
	public String BBCNCLKLXCG51;
	public String BBCNCLKLXCG52;
	public String BBCNCLKLXCG53;
	public String BBCNCLKLXCG54;
	public String BBKTSPMXCG001;
	public String BBKTSPMXCG002;
	public String BBKTSPMXCG003;
	public String BBKTSPMXCG004;
	public String BBKTSPMXCG005;
	public String BBKTSPMXCG006;
	public String BBKTSPMXCG007;
	public String BBKTSPMXCG008;
	public String BBKTSPMXCG009;
	public String BBKTSPMXCG010;
	public String BBKTSPMXCG011;
	public String BBKTSPMXCG012;
	public String BBKTSPMXCG013;
	public String BBKTSPMXCG014;
	public String BBKTSPMXCG015;
	public String BBKTSPMXCG016;
	public String BBKTSPMXCG017;
	public String BBKTSPMXCG018;
	public String BBKTSPMXCG019;
	public String BBKTSPMXCG020;
	public String BBKTSPMXCG021;
	public String BBKTSPMXCG022;
	public String BBKTSPMXCG023;
	public String BBKTSPMXCG024;
	public String BBKTSPMXCG025;
	public long modifyDate;
	public long syncDate;
}