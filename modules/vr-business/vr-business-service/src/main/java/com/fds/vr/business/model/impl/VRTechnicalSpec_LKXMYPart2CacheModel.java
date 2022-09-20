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

import com.fds.vr.business.model.VRTechnicalSpec_LKXMYPart2;

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
 * The cache model class for representing VRTechnicalSpec_LKXMYPart2 in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_LKXMYPart2
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_LKXMYPart2CacheModel implements CacheModel<VRTechnicalSpec_LKXMYPart2>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_LKXMYPart2CacheModel)) {
			return false;
		}

		VRTechnicalSpec_LKXMYPart2CacheModel vrTechnicalSpec_LKXMYPart2CacheModel =
			(VRTechnicalSpec_LKXMYPart2CacheModel)obj;

		if (id == vrTechnicalSpec_LKXMYPart2CacheModel.id) {
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
		StringBundler sb = new StringBundler(231);

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
		sb.append(", LKXMY0507=");
		sb.append(LKXMY0507);
		sb.append(", LKXMY0508=");
		sb.append(LKXMY0508);
		sb.append(", LKXMY0509=");
		sb.append(LKXMY0509);
		sb.append(", LKXMY0510=");
		sb.append(LKXMY0510);
		sb.append(", LKXMY0511=");
		sb.append(LKXMY0511);
		sb.append(", LKXMY0512=");
		sb.append(LKXMY0512);
		sb.append(", LKXMY0513=");
		sb.append(LKXMY0513);
		sb.append(", LKXMY0514=");
		sb.append(LKXMY0514);
		sb.append(", LKXMY0515=");
		sb.append(LKXMY0515);
		sb.append(", LKXMY0301=");
		sb.append(LKXMY0301);
		sb.append(", LKXMY0302=");
		sb.append(LKXMY0302);
		sb.append(", LKXMY0303=");
		sb.append(LKXMY0303);
		sb.append(", LKXMY0304=");
		sb.append(LKXMY0304);
		sb.append(", LKXMY0305=");
		sb.append(LKXMY0305);
		sb.append(", LKXMY0306=");
		sb.append(LKXMY0306);
		sb.append(", LKXMY0307=");
		sb.append(LKXMY0307);
		sb.append(", LKXMY0308=");
		sb.append(LKXMY0308);
		sb.append(", LKXMY0309=");
		sb.append(LKXMY0309);
		sb.append(", LKXMY0310=");
		sb.append(LKXMY0310);
		sb.append(", LKXMY0311=");
		sb.append(LKXMY0311);
		sb.append(", LKXMY0312=");
		sb.append(LKXMY0312);
		sb.append(", LKXMY0313=");
		sb.append(LKXMY0313);
		sb.append(", LKXMY0314=");
		sb.append(LKXMY0314);
		sb.append(", LKXMY0607=");
		sb.append(LKXMY0607);
		sb.append(", LKXMY0608=");
		sb.append(LKXMY0608);
		sb.append(", LKXMY0609=");
		sb.append(LKXMY0609);
		sb.append(", LKXMY0610=");
		sb.append(LKXMY0610);
		sb.append(", LKXMY0611=");
		sb.append(LKXMY0611);
		sb.append(", LKXMY0612=");
		sb.append(LKXMY0612);
		sb.append(", LKXMY0613=");
		sb.append(LKXMY0613);
		sb.append(", LKXMY0614=");
		sb.append(LKXMY0614);
		sb.append(", LKXMY0615=");
		sb.append(LKXMY0615);
		sb.append(", LKXMY0616=");
		sb.append(LKXMY0616);
		sb.append(", LKXMY0617=");
		sb.append(LKXMY0617);
		sb.append(", LKXMY0618=");
		sb.append(LKXMY0618);
		sb.append(", LKXMY0619=");
		sb.append(LKXMY0619);
		sb.append(", LKXMY0906=");
		sb.append(LKXMY0906);
		sb.append(", LKXMY0907=");
		sb.append(LKXMY0907);
		sb.append(", LKXMY0908=");
		sb.append(LKXMY0908);
		sb.append(", LKXMY0909=");
		sb.append(LKXMY0909);
		sb.append(", LKXMY0910=");
		sb.append(LKXMY0910);
		sb.append(", LKXMY0911=");
		sb.append(LKXMY0911);
		sb.append(", LKXMY0912=");
		sb.append(LKXMY0912);
		sb.append(", LKXMY0913=");
		sb.append(LKXMY0913);
		sb.append(", LKXMY0914=");
		sb.append(LKXMY0914);
		sb.append(", LKXMY0915=");
		sb.append(LKXMY0915);
		sb.append(", LKXMY0916=");
		sb.append(LKXMY0916);
		sb.append(", LKXMY0917=");
		sb.append(LKXMY0917);
		sb.append(", LKXMY0918=");
		sb.append(LKXMY0918);
		sb.append(", LKXMY1007=");
		sb.append(LKXMY1007);
		sb.append(", LKXMY1008=");
		sb.append(LKXMY1008);
		sb.append(", LKXMY1009=");
		sb.append(LKXMY1009);
		sb.append(", LKXMY1010=");
		sb.append(LKXMY1010);
		sb.append(", LKXMY1011=");
		sb.append(LKXMY1011);
		sb.append(", LKXMY1012=");
		sb.append(LKXMY1012);
		sb.append(", LKXMY1013=");
		sb.append(LKXMY1013);
		sb.append(", LKXMY1014=");
		sb.append(LKXMY1014);
		sb.append(", LKXMY1015=");
		sb.append(LKXMY1015);
		sb.append(", LKXMY0807=");
		sb.append(LKXMY0807);
		sb.append(", LKXMY0808=");
		sb.append(LKXMY0808);
		sb.append(", LKXMY0809=");
		sb.append(LKXMY0809);
		sb.append(", LKXMY0810=");
		sb.append(LKXMY0810);
		sb.append(", LKXMY0811=");
		sb.append(LKXMY0811);
		sb.append(", LKXMY0812=");
		sb.append(LKXMY0812);
		sb.append(", LKXMY0813=");
		sb.append(LKXMY0813);
		sb.append(", LKXMY0801=");
		sb.append(LKXMY0801);
		sb.append(", LKXMY0802=");
		sb.append(LKXMY0802);
		sb.append(", LKXMY0803=");
		sb.append(LKXMY0803);
		sb.append(", LKXMY0804=");
		sb.append(LKXMY0804);
		sb.append(", LKXMY0805=");
		sb.append(LKXMY0805);
		sb.append(", BBLKXMY001=");
		sb.append(BBLKXMY001);
		sb.append(", BBLKXMY002=");
		sb.append(BBLKXMY002);
		sb.append(", BBLKXMY003=");
		sb.append(BBLKXMY003);
		sb.append(", BBLKXMY004=");
		sb.append(BBLKXMY004);
		sb.append(", BBLKXMY005=");
		sb.append(BBLKXMY005);
		sb.append(", BBLKXMY006=");
		sb.append(BBLKXMY006);
		sb.append(", BBLKXMY007=");
		sb.append(BBLKXMY007);
		sb.append(", BBLKXMY008=");
		sb.append(BBLKXMY008);
		sb.append(", BBLKXMY009=");
		sb.append(BBLKXMY009);
		sb.append(", BBLKXMY010=");
		sb.append(BBLKXMY010);
		sb.append(", BBLKXMY011=");
		sb.append(BBLKXMY011);
		sb.append(", BBLKXMY012=");
		sb.append(BBLKXMY012);
		sb.append(", BBLKXMY013=");
		sb.append(BBLKXMY013);
		sb.append(", BBLKXMY014=");
		sb.append(BBLKXMY014);
		sb.append(", BBLKXMY015=");
		sb.append(BBLKXMY015);
		sb.append(", BBLKXMY016=");
		sb.append(BBLKXMY016);
		sb.append(", BBLKXMY017=");
		sb.append(BBLKXMY017);
		sb.append(", BBLKXMY018=");
		sb.append(BBLKXMY018);
		sb.append(", BBLKXMY019=");
		sb.append(BBLKXMY019);
		sb.append(", BBLKXMY020=");
		sb.append(BBLKXMY020);
		sb.append(", BBLKXMY021=");
		sb.append(BBLKXMY021);
		sb.append(", BBLKXMY022=");
		sb.append(BBLKXMY022);
		sb.append(", BBLKXMY023=");
		sb.append(BBLKXMY023);
		sb.append(", BBLKXMY024=");
		sb.append(BBLKXMY024);
		sb.append(", BBLKXMY025=");
		sb.append(BBLKXMY025);
		sb.append(", BBLKXMY026=");
		sb.append(BBLKXMY026);
		sb.append(", BBLKXMY027=");
		sb.append(BBLKXMY027);
		sb.append(", BBLKXMY028=");
		sb.append(BBLKXMY028);
		sb.append(", BBLKXMY029=");
		sb.append(BBLKXMY029);
		sb.append(", BBLKXMY030=");
		sb.append(BBLKXMY030);
		sb.append(", BBLKXMY031=");
		sb.append(BBLKXMY031);
		sb.append(", BBLKXMY032=");
		sb.append(BBLKXMY032);
		sb.append(", BBLKXMY033=");
		sb.append(BBLKXMY033);
		sb.append(", BBLKXMY034=");
		sb.append(BBLKXMY034);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_LKXMYPart2 toEntityModel() {
		VRTechnicalSpec_LKXMYPart2Impl vrTechnicalSpec_LKXMYPart2Impl = new VRTechnicalSpec_LKXMYPart2Impl();

		vrTechnicalSpec_LKXMYPart2Impl.setId(id);
		vrTechnicalSpec_LKXMYPart2Impl.setMtCore(mtCore);
		vrTechnicalSpec_LKXMYPart2Impl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_LKXMYPart2Impl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_LKXMYPart2Impl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (LKXMY0507 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0507(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0507(LKXMY0507);
		}

		if (LKXMY0508 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0508(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0508(LKXMY0508);
		}

		if (LKXMY0509 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0509(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0509(LKXMY0509);
		}

		if (LKXMY0510 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0510(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0510(LKXMY0510);
		}

		if (LKXMY0511 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0511(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0511(LKXMY0511);
		}

		if (LKXMY0512 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0512(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0512(LKXMY0512);
		}

		if (LKXMY0513 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0513(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0513(LKXMY0513);
		}

		if (LKXMY0514 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0514(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0514(LKXMY0514);
		}

		if (LKXMY0515 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0515(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0515(LKXMY0515);
		}

		if (LKXMY0301 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0301(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0301(LKXMY0301);
		}

		if (LKXMY0302 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0302(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0302(LKXMY0302);
		}

		if (LKXMY0303 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0303(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0303(LKXMY0303);
		}

		if (LKXMY0304 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0304(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0304(LKXMY0304);
		}

		if (LKXMY0305 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0305(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0305(LKXMY0305);
		}

		if (LKXMY0306 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0306(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0306(LKXMY0306);
		}

		if (LKXMY0307 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0307(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0307(LKXMY0307);
		}

		if (LKXMY0308 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0308(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0308(LKXMY0308);
		}

		if (LKXMY0309 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0309(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0309(LKXMY0309);
		}

		if (LKXMY0310 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0310(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0310(LKXMY0310);
		}

		if (LKXMY0311 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0311(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0311(LKXMY0311);
		}

		if (LKXMY0312 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0312(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0312(LKXMY0312);
		}

		if (LKXMY0313 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0313(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0313(LKXMY0313);
		}

		if (LKXMY0314 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0314(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0314(LKXMY0314);
		}

		if (LKXMY0607 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0607(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0607(LKXMY0607);
		}

		if (LKXMY0608 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0608(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0608(LKXMY0608);
		}

		if (LKXMY0609 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0609(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0609(LKXMY0609);
		}

		if (LKXMY0610 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0610(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0610(LKXMY0610);
		}

		if (LKXMY0611 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0611(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0611(LKXMY0611);
		}

		if (LKXMY0612 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0612(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0612(LKXMY0612);
		}

		if (LKXMY0613 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0613(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0613(LKXMY0613);
		}

		if (LKXMY0614 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0614(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0614(LKXMY0614);
		}

		if (LKXMY0615 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0615(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0615(LKXMY0615);
		}

		if (LKXMY0616 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0616(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0616(LKXMY0616);
		}

		if (LKXMY0617 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0617(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0617(LKXMY0617);
		}

		if (LKXMY0618 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0618(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0618(LKXMY0618);
		}

		if (LKXMY0619 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0619(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0619(LKXMY0619);
		}

		if (LKXMY0906 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0906(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0906(LKXMY0906);
		}

		if (LKXMY0907 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0907(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0907(LKXMY0907);
		}

		if (LKXMY0908 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0908(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0908(LKXMY0908);
		}

		if (LKXMY0909 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0909(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0909(LKXMY0909);
		}

		if (LKXMY0910 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0910(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0910(LKXMY0910);
		}

		if (LKXMY0911 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0911(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0911(LKXMY0911);
		}

		if (LKXMY0912 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0912(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0912(LKXMY0912);
		}

		if (LKXMY0913 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0913(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0913(LKXMY0913);
		}

		if (LKXMY0914 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0914(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0914(LKXMY0914);
		}

		if (LKXMY0915 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0915(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0915(LKXMY0915);
		}

		if (LKXMY0916 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0916(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0916(LKXMY0916);
		}

		if (LKXMY0917 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0917(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0917(LKXMY0917);
		}

		if (LKXMY0918 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0918(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0918(LKXMY0918);
		}

		if (LKXMY1007 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1007(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1007(LKXMY1007);
		}

		if (LKXMY1008 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1008(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1008(LKXMY1008);
		}

		if (LKXMY1009 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1009(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1009(LKXMY1009);
		}

		if (LKXMY1010 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1010(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1010(LKXMY1010);
		}

		if (LKXMY1011 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1011(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1011(LKXMY1011);
		}

		if (LKXMY1012 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1012(LKXMY1012);
		}

		if (LKXMY1013 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1013(LKXMY1013);
		}

		if (LKXMY1014 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1014(LKXMY1014);
		}

		if (LKXMY1015 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1015(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY1015(LKXMY1015);
		}

		if (LKXMY0807 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0807(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0807(LKXMY0807);
		}

		if (LKXMY0808 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0808(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0808(LKXMY0808);
		}

		if (LKXMY0809 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0809(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0809(LKXMY0809);
		}

		if (LKXMY0810 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0810(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0810(LKXMY0810);
		}

		if (LKXMY0811 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0811(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0811(LKXMY0811);
		}

		if (LKXMY0812 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0812(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0812(LKXMY0812);
		}

		if (LKXMY0813 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0813(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0813(LKXMY0813);
		}

		if (LKXMY0801 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0801(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0801(LKXMY0801);
		}

		if (LKXMY0802 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0802(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0802(LKXMY0802);
		}

		if (LKXMY0803 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0803(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0803(LKXMY0803);
		}

		if (LKXMY0804 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0804(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0804(LKXMY0804);
		}

		if (LKXMY0805 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0805(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setLKXMY0805(LKXMY0805);
		}

		if (BBLKXMY001 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY001(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY001(BBLKXMY001);
		}

		if (BBLKXMY002 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY002(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY002(BBLKXMY002);
		}

		if (BBLKXMY003 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY003(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY003(BBLKXMY003);
		}

		if (BBLKXMY004 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY004(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY004(BBLKXMY004);
		}

		if (BBLKXMY005 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY005(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY005(BBLKXMY005);
		}

		if (BBLKXMY006 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY006(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY006(BBLKXMY006);
		}

		if (BBLKXMY007 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY007(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY007(BBLKXMY007);
		}

		if (BBLKXMY008 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY008(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY008(BBLKXMY008);
		}

		if (BBLKXMY009 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY009(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY009(BBLKXMY009);
		}

		if (BBLKXMY010 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY010(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY010(BBLKXMY010);
		}

		if (BBLKXMY011 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY011(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY011(BBLKXMY011);
		}

		if (BBLKXMY012 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY012(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY012(BBLKXMY012);
		}

		if (BBLKXMY013 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY013(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY013(BBLKXMY013);
		}

		if (BBLKXMY014 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY014(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY014(BBLKXMY014);
		}

		if (BBLKXMY015 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY015(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY015(BBLKXMY015);
		}

		if (BBLKXMY016 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY016(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY016(BBLKXMY016);
		}

		if (BBLKXMY017 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY017(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY017(BBLKXMY017);
		}

		if (BBLKXMY018 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY018(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY018(BBLKXMY018);
		}

		if (BBLKXMY019 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY019(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY019(BBLKXMY019);
		}

		if (BBLKXMY020 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY020(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY020(BBLKXMY020);
		}

		if (BBLKXMY021 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY021(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY021(BBLKXMY021);
		}

		if (BBLKXMY022 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY022(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY022(BBLKXMY022);
		}

		if (BBLKXMY023 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY023(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY023(BBLKXMY023);
		}

		if (BBLKXMY024 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY024(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY024(BBLKXMY024);
		}

		if (BBLKXMY025 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY025(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY025(BBLKXMY025);
		}

		if (BBLKXMY026 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY026(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY026(BBLKXMY026);
		}

		if (BBLKXMY027 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY027(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY027(BBLKXMY027);
		}

		if (BBLKXMY028 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY028(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY028(BBLKXMY028);
		}

		if (BBLKXMY029 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY029(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY029(BBLKXMY029);
		}

		if (BBLKXMY030 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY030(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY030(BBLKXMY030);
		}

		if (BBLKXMY031 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY031(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY031(BBLKXMY031);
		}

		if (BBLKXMY032 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY032(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY032(BBLKXMY032);
		}

		if (BBLKXMY033 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY033(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY033(BBLKXMY033);
		}

		if (BBLKXMY034 == null) {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY034(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setBBLKXMY034(BBLKXMY034);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_LKXMYPart2Impl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_LKXMYPart2Impl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_LKXMYPart2Impl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_LKXMYPart2Impl.resetOriginalValues();

		return vrTechnicalSpec_LKXMYPart2Impl;
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
		LKXMY0507 = objectInput.readUTF();
		LKXMY0508 = objectInput.readUTF();
		LKXMY0509 = objectInput.readUTF();
		LKXMY0510 = objectInput.readUTF();
		LKXMY0511 = objectInput.readUTF();
		LKXMY0512 = objectInput.readUTF();
		LKXMY0513 = objectInput.readUTF();
		LKXMY0514 = objectInput.readUTF();
		LKXMY0515 = objectInput.readUTF();
		LKXMY0301 = objectInput.readUTF();
		LKXMY0302 = objectInput.readUTF();
		LKXMY0303 = objectInput.readUTF();
		LKXMY0304 = objectInput.readUTF();
		LKXMY0305 = objectInput.readUTF();
		LKXMY0306 = objectInput.readUTF();
		LKXMY0307 = objectInput.readUTF();
		LKXMY0308 = objectInput.readUTF();
		LKXMY0309 = objectInput.readUTF();
		LKXMY0310 = objectInput.readUTF();
		LKXMY0311 = objectInput.readUTF();
		LKXMY0312 = objectInput.readUTF();
		LKXMY0313 = objectInput.readUTF();
		LKXMY0314 = objectInput.readUTF();
		LKXMY0607 = objectInput.readUTF();
		LKXMY0608 = objectInput.readUTF();
		LKXMY0609 = objectInput.readUTF();
		LKXMY0610 = objectInput.readUTF();
		LKXMY0611 = objectInput.readUTF();
		LKXMY0612 = objectInput.readUTF();
		LKXMY0613 = objectInput.readUTF();
		LKXMY0614 = objectInput.readUTF();
		LKXMY0615 = objectInput.readUTF();
		LKXMY0616 = objectInput.readUTF();
		LKXMY0617 = objectInput.readUTF();
		LKXMY0618 = objectInput.readUTF();
		LKXMY0619 = objectInput.readUTF();
		LKXMY0906 = objectInput.readUTF();
		LKXMY0907 = objectInput.readUTF();
		LKXMY0908 = objectInput.readUTF();
		LKXMY0909 = objectInput.readUTF();
		LKXMY0910 = objectInput.readUTF();
		LKXMY0911 = objectInput.readUTF();
		LKXMY0912 = objectInput.readUTF();
		LKXMY0913 = objectInput.readUTF();
		LKXMY0914 = objectInput.readUTF();
		LKXMY0915 = objectInput.readUTF();
		LKXMY0916 = objectInput.readUTF();
		LKXMY0917 = objectInput.readUTF();
		LKXMY0918 = objectInput.readUTF();
		LKXMY1007 = objectInput.readUTF();
		LKXMY1008 = objectInput.readUTF();
		LKXMY1009 = objectInput.readUTF();
		LKXMY1010 = objectInput.readUTF();
		LKXMY1011 = objectInput.readUTF();
		LKXMY1012 = objectInput.readUTF();
		LKXMY1013 = objectInput.readUTF();
		LKXMY1014 = objectInput.readUTF();
		LKXMY1015 = objectInput.readUTF();
		LKXMY0807 = objectInput.readUTF();
		LKXMY0808 = objectInput.readUTF();
		LKXMY0809 = objectInput.readUTF();
		LKXMY0810 = objectInput.readUTF();
		LKXMY0811 = objectInput.readUTF();
		LKXMY0812 = objectInput.readUTF();
		LKXMY0813 = objectInput.readUTF();
		LKXMY0801 = objectInput.readUTF();
		LKXMY0802 = objectInput.readUTF();
		LKXMY0803 = objectInput.readUTF();
		LKXMY0804 = objectInput.readUTF();
		LKXMY0805 = objectInput.readUTF();
		BBLKXMY001 = objectInput.readUTF();
		BBLKXMY002 = objectInput.readUTF();
		BBLKXMY003 = objectInput.readUTF();
		BBLKXMY004 = objectInput.readUTF();
		BBLKXMY005 = objectInput.readUTF();
		BBLKXMY006 = objectInput.readUTF();
		BBLKXMY007 = objectInput.readUTF();
		BBLKXMY008 = objectInput.readUTF();
		BBLKXMY009 = objectInput.readUTF();
		BBLKXMY010 = objectInput.readUTF();
		BBLKXMY011 = objectInput.readUTF();
		BBLKXMY012 = objectInput.readUTF();
		BBLKXMY013 = objectInput.readUTF();
		BBLKXMY014 = objectInput.readUTF();
		BBLKXMY015 = objectInput.readUTF();
		BBLKXMY016 = objectInput.readUTF();
		BBLKXMY017 = objectInput.readUTF();
		BBLKXMY018 = objectInput.readUTF();
		BBLKXMY019 = objectInput.readUTF();
		BBLKXMY020 = objectInput.readUTF();
		BBLKXMY021 = objectInput.readUTF();
		BBLKXMY022 = objectInput.readUTF();
		BBLKXMY023 = objectInput.readUTF();
		BBLKXMY024 = objectInput.readUTF();
		BBLKXMY025 = objectInput.readUTF();
		BBLKXMY026 = objectInput.readUTF();
		BBLKXMY027 = objectInput.readUTF();
		BBLKXMY028 = objectInput.readUTF();
		BBLKXMY029 = objectInput.readUTF();
		BBLKXMY030 = objectInput.readUTF();
		BBLKXMY031 = objectInput.readUTF();
		BBLKXMY032 = objectInput.readUTF();
		BBLKXMY033 = objectInput.readUTF();
		BBLKXMY034 = objectInput.readUTF();
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

		if (LKXMY0507 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0507);
		}

		if (LKXMY0508 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0508);
		}

		if (LKXMY0509 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0509);
		}

		if (LKXMY0510 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0510);
		}

		if (LKXMY0511 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0511);
		}

		if (LKXMY0512 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0512);
		}

		if (LKXMY0513 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0513);
		}

		if (LKXMY0514 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0514);
		}

		if (LKXMY0515 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0515);
		}

		if (LKXMY0301 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0301);
		}

		if (LKXMY0302 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0302);
		}

		if (LKXMY0303 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0303);
		}

		if (LKXMY0304 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0304);
		}

		if (LKXMY0305 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0305);
		}

		if (LKXMY0306 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0306);
		}

		if (LKXMY0307 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0307);
		}

		if (LKXMY0308 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0308);
		}

		if (LKXMY0309 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0309);
		}

		if (LKXMY0310 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0310);
		}

		if (LKXMY0311 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0311);
		}

		if (LKXMY0312 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0312);
		}

		if (LKXMY0313 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0313);
		}

		if (LKXMY0314 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0314);
		}

		if (LKXMY0607 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0607);
		}

		if (LKXMY0608 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0608);
		}

		if (LKXMY0609 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0609);
		}

		if (LKXMY0610 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0610);
		}

		if (LKXMY0611 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0611);
		}

		if (LKXMY0612 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0612);
		}

		if (LKXMY0613 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0613);
		}

		if (LKXMY0614 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0614);
		}

		if (LKXMY0615 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0615);
		}

		if (LKXMY0616 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0616);
		}

		if (LKXMY0617 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0617);
		}

		if (LKXMY0618 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0618);
		}

		if (LKXMY0619 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0619);
		}

		if (LKXMY0906 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0906);
		}

		if (LKXMY0907 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0907);
		}

		if (LKXMY0908 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0908);
		}

		if (LKXMY0909 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0909);
		}

		if (LKXMY0910 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0910);
		}

		if (LKXMY0911 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0911);
		}

		if (LKXMY0912 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0912);
		}

		if (LKXMY0913 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0913);
		}

		if (LKXMY0914 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0914);
		}

		if (LKXMY0915 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0915);
		}

		if (LKXMY0916 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0916);
		}

		if (LKXMY0917 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0917);
		}

		if (LKXMY0918 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0918);
		}

		if (LKXMY1007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1007);
		}

		if (LKXMY1008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1008);
		}

		if (LKXMY1009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1009);
		}

		if (LKXMY1010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1010);
		}

		if (LKXMY1011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1011);
		}

		if (LKXMY1012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1012);
		}

		if (LKXMY1013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1013);
		}

		if (LKXMY1014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1014);
		}

		if (LKXMY1015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY1015);
		}

		if (LKXMY0807 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0807);
		}

		if (LKXMY0808 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0808);
		}

		if (LKXMY0809 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0809);
		}

		if (LKXMY0810 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0810);
		}

		if (LKXMY0811 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0811);
		}

		if (LKXMY0812 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0812);
		}

		if (LKXMY0813 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0813);
		}

		if (LKXMY0801 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0801);
		}

		if (LKXMY0802 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0802);
		}

		if (LKXMY0803 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0803);
		}

		if (LKXMY0804 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0804);
		}

		if (LKXMY0805 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LKXMY0805);
		}

		if (BBLKXMY001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY001);
		}

		if (BBLKXMY002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY002);
		}

		if (BBLKXMY003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY003);
		}

		if (BBLKXMY004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY004);
		}

		if (BBLKXMY005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY005);
		}

		if (BBLKXMY006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY006);
		}

		if (BBLKXMY007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY007);
		}

		if (BBLKXMY008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY008);
		}

		if (BBLKXMY009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY009);
		}

		if (BBLKXMY010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY010);
		}

		if (BBLKXMY011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY011);
		}

		if (BBLKXMY012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY012);
		}

		if (BBLKXMY013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY013);
		}

		if (BBLKXMY014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY014);
		}

		if (BBLKXMY015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY015);
		}

		if (BBLKXMY016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY016);
		}

		if (BBLKXMY017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY017);
		}

		if (BBLKXMY018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY018);
		}

		if (BBLKXMY019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY019);
		}

		if (BBLKXMY020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY020);
		}

		if (BBLKXMY021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY021);
		}

		if (BBLKXMY022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY022);
		}

		if (BBLKXMY023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY023);
		}

		if (BBLKXMY024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY024);
		}

		if (BBLKXMY025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY025);
		}

		if (BBLKXMY026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY026);
		}

		if (BBLKXMY027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY027);
		}

		if (BBLKXMY028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY028);
		}

		if (BBLKXMY029 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY029);
		}

		if (BBLKXMY030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY030);
		}

		if (BBLKXMY031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY031);
		}

		if (BBLKXMY032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY032);
		}

		if (BBLKXMY033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY033);
		}

		if (BBLKXMY034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BBLKXMY034);
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
	public String LKXMY0507;
	public String LKXMY0508;
	public String LKXMY0509;
	public String LKXMY0510;
	public String LKXMY0511;
	public String LKXMY0512;
	public String LKXMY0513;
	public String LKXMY0514;
	public String LKXMY0515;
	public String LKXMY0301;
	public String LKXMY0302;
	public String LKXMY0303;
	public String LKXMY0304;
	public String LKXMY0305;
	public String LKXMY0306;
	public String LKXMY0307;
	public String LKXMY0308;
	public String LKXMY0309;
	public String LKXMY0310;
	public String LKXMY0311;
	public String LKXMY0312;
	public String LKXMY0313;
	public String LKXMY0314;
	public String LKXMY0607;
	public String LKXMY0608;
	public String LKXMY0609;
	public String LKXMY0610;
	public String LKXMY0611;
	public String LKXMY0612;
	public String LKXMY0613;
	public String LKXMY0614;
	public String LKXMY0615;
	public String LKXMY0616;
	public String LKXMY0617;
	public String LKXMY0618;
	public String LKXMY0619;
	public String LKXMY0906;
	public String LKXMY0907;
	public String LKXMY0908;
	public String LKXMY0909;
	public String LKXMY0910;
	public String LKXMY0911;
	public String LKXMY0912;
	public String LKXMY0913;
	public String LKXMY0914;
	public String LKXMY0915;
	public String LKXMY0916;
	public String LKXMY0917;
	public String LKXMY0918;
	public String LKXMY1007;
	public String LKXMY1008;
	public String LKXMY1009;
	public String LKXMY1010;
	public String LKXMY1011;
	public String LKXMY1012;
	public String LKXMY1013;
	public String LKXMY1014;
	public String LKXMY1015;
	public String LKXMY0807;
	public String LKXMY0808;
	public String LKXMY0809;
	public String LKXMY0810;
	public String LKXMY0811;
	public String LKXMY0812;
	public String LKXMY0813;
	public String LKXMY0801;
	public String LKXMY0802;
	public String LKXMY0803;
	public String LKXMY0804;
	public String LKXMY0805;
	public String BBLKXMY001;
	public String BBLKXMY002;
	public String BBLKXMY003;
	public String BBLKXMY004;
	public String BBLKXMY005;
	public String BBLKXMY006;
	public String BBLKXMY007;
	public String BBLKXMY008;
	public String BBLKXMY009;
	public String BBLKXMY010;
	public String BBLKXMY011;
	public String BBLKXMY012;
	public String BBLKXMY013;
	public String BBLKXMY014;
	public String BBLKXMY015;
	public String BBLKXMY016;
	public String BBLKXMY017;
	public String BBLKXMY018;
	public String BBLKXMY019;
	public String BBLKXMY020;
	public String BBLKXMY021;
	public String BBLKXMY022;
	public String BBLKXMY023;
	public String BBLKXMY024;
	public String BBLKXMY025;
	public String BBLKXMY026;
	public String BBLKXMY027;
	public String BBLKXMY028;
	public String BBLKXMY029;
	public String BBLKXMY030;
	public String BBLKXMY031;
	public String BBLKXMY032;
	public String BBLKXMY033;
	public String BBLKXMY034;
	public long modifyDate;
	public long syncDate;
}