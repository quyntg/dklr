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

import com.fds.vr.business.model.VRTechnicalSpec_XCGPart5;

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
 * The cache model class for representing VRTechnicalSpec_XCGPart5 in entity cache.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart5
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart5CacheModel implements CacheModel<VRTechnicalSpec_XCGPart5>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGPart5CacheModel)) {
			return false;
		}

		VRTechnicalSpec_XCGPart5CacheModel vrTechnicalSpec_XCGPart5CacheModel = (VRTechnicalSpec_XCGPart5CacheModel)obj;

		if (id == vrTechnicalSpec_XCGPart5CacheModel.id) {
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
		StringBundler sb = new StringBundler(381);

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
		sb.append(", XCG01598=");
		sb.append(XCG01598);
		sb.append(", XCG01599=");
		sb.append(XCG01599);
		sb.append(", XCG01600=");
		sb.append(XCG01600);
		sb.append(", XCG01601=");
		sb.append(XCG01601);
		sb.append(", XCG01602=");
		sb.append(XCG01602);
		sb.append(", XCG01603=");
		sb.append(XCG01603);
		sb.append(", XCG01923=");
		sb.append(XCG01923);
		sb.append(", XCG01604=");
		sb.append(XCG01604);
		sb.append(", XCG01924=");
		sb.append(XCG01924);
		sb.append(", XCG01605=");
		sb.append(XCG01605);
		sb.append(", XCG01606=");
		sb.append(XCG01606);
		sb.append(", XCG01607=");
		sb.append(XCG01607);
		sb.append(", XCG01608=");
		sb.append(XCG01608);
		sb.append(", XCG01609=");
		sb.append(XCG01609);
		sb.append(", XCG01925=");
		sb.append(XCG01925);
		sb.append(", XCG01610=");
		sb.append(XCG01610);
		sb.append(", XCG01926=");
		sb.append(XCG01926);
		sb.append(", XCG01611=");
		sb.append(XCG01611);
		sb.append(", XCG01612=");
		sb.append(XCG01612);
		sb.append(", XCG01928=");
		sb.append(XCG01928);
		sb.append(", XCG01613=");
		sb.append(XCG01613);
		sb.append(", XCG01929=");
		sb.append(XCG01929);
		sb.append(", XCG01614=");
		sb.append(XCG01614);
		sb.append(", XCG01930=");
		sb.append(XCG01930);
		sb.append(", XCG01615=");
		sb.append(XCG01615);
		sb.append(", XCG01931=");
		sb.append(XCG01931);
		sb.append(", XCG01616=");
		sb.append(XCG01616);
		sb.append(", XCG01932=");
		sb.append(XCG01932);
		sb.append(", XCG01617=");
		sb.append(XCG01617);
		sb.append(", XCG01933=");
		sb.append(XCG01933);
		sb.append(", XCG01618=");
		sb.append(XCG01618);
		sb.append(", XCG01934=");
		sb.append(XCG01934);
		sb.append(", XCG01619=");
		sb.append(XCG01619);
		sb.append(", XCG01935=");
		sb.append(XCG01935);
		sb.append(", XCG01620=");
		sb.append(XCG01620);
		sb.append(", XCG01936=");
		sb.append(XCG01936);
		sb.append(", XCG01621=");
		sb.append(XCG01621);
		sb.append(", XCG01937=");
		sb.append(XCG01937);
		sb.append(", XCG01622=");
		sb.append(XCG01622);
		sb.append(", XCG01938=");
		sb.append(XCG01938);
		sb.append(", XCG01623=");
		sb.append(XCG01623);
		sb.append(", XCG01939=");
		sb.append(XCG01939);
		sb.append(", XCG01624=");
		sb.append(XCG01624);
		sb.append(", XCG01940=");
		sb.append(XCG01940);
		sb.append(", XCG01625=");
		sb.append(XCG01625);
		sb.append(", XCG01941=");
		sb.append(XCG01941);
		sb.append(", XCG01626=");
		sb.append(XCG01626);
		sb.append(", XCG01942=");
		sb.append(XCG01942);
		sb.append(", XCG01627=");
		sb.append(XCG01627);
		sb.append(", XCG01943=");
		sb.append(XCG01943);
		sb.append(", XCG01628=");
		sb.append(XCG01628);
		sb.append(", XCG01944=");
		sb.append(XCG01944);
		sb.append(", XCG01630=");
		sb.append(XCG01630);
		sb.append(", XCG01631=");
		sb.append(XCG01631);
		sb.append(", XCG01632=");
		sb.append(XCG01632);
		sb.append(", XCG01633=");
		sb.append(XCG01633);
		sb.append(", XCG01634=");
		sb.append(XCG01634);
		sb.append(", XCG01635=");
		sb.append(XCG01635);
		sb.append(", XCG01636=");
		sb.append(XCG01636);
		sb.append(", XCG01637=");
		sb.append(XCG01637);
		sb.append(", XCG01638=");
		sb.append(XCG01638);
		sb.append(", XCG01639=");
		sb.append(XCG01639);
		sb.append(", XCG01640=");
		sb.append(XCG01640);
		sb.append(", XCG01641=");
		sb.append(XCG01641);
		sb.append(", XCG01642=");
		sb.append(XCG01642);
		sb.append(", XCG01643=");
		sb.append(XCG01643);
		sb.append(", XCG01644=");
		sb.append(XCG01644);
		sb.append(", XCG01645=");
		sb.append(XCG01645);
		sb.append(", XCG01646=");
		sb.append(XCG01646);
		sb.append(", XCG01647=");
		sb.append(XCG01647);
		sb.append(", XCG01648=");
		sb.append(XCG01648);
		sb.append(", XCG01649=");
		sb.append(XCG01649);
		sb.append(", XCG01650=");
		sb.append(XCG01650);
		sb.append(", XCG01651=");
		sb.append(XCG01651);
		sb.append(", XCG01652=");
		sb.append(XCG01652);
		sb.append(", XCG01653=");
		sb.append(XCG01653);
		sb.append(", XCG01654=");
		sb.append(XCG01654);
		sb.append(", XCG01655=");
		sb.append(XCG01655);
		sb.append(", XCG01656=");
		sb.append(XCG01656);
		sb.append(", XCG01657=");
		sb.append(XCG01657);
		sb.append(", XCG01658=");
		sb.append(XCG01658);
		sb.append(", XCG01659=");
		sb.append(XCG01659);
		sb.append(", XCG01660=");
		sb.append(XCG01660);
		sb.append(", XCG01661=");
		sb.append(XCG01661);
		sb.append(", XCG01662=");
		sb.append(XCG01662);
		sb.append(", XCG01663=");
		sb.append(XCG01663);
		sb.append(", XCG01664=");
		sb.append(XCG01664);
		sb.append(", XCG01665=");
		sb.append(XCG01665);
		sb.append(", XCG01666=");
		sb.append(XCG01666);
		sb.append(", XCG01667=");
		sb.append(XCG01667);
		sb.append(", XCG01668=");
		sb.append(XCG01668);
		sb.append(", XCG01669=");
		sb.append(XCG01669);
		sb.append(", XCG01670=");
		sb.append(XCG01670);
		sb.append(", XCG01671=");
		sb.append(XCG01671);
		sb.append(", XCG01672=");
		sb.append(XCG01672);
		sb.append(", XCG01673=");
		sb.append(XCG01673);
		sb.append(", XCG01674=");
		sb.append(XCG01674);
		sb.append(", XCG01675=");
		sb.append(XCG01675);
		sb.append(", XCG01676=");
		sb.append(XCG01676);
		sb.append(", XCG01677=");
		sb.append(XCG01677);
		sb.append(", XCG01678=");
		sb.append(XCG01678);
		sb.append(", XCG01679=");
		sb.append(XCG01679);
		sb.append(", XCG01680=");
		sb.append(XCG01680);
		sb.append(", XCG01681=");
		sb.append(XCG01681);
		sb.append(", XCG01682=");
		sb.append(XCG01682);
		sb.append(", XCG01683=");
		sb.append(XCG01683);
		sb.append(", XCG01684=");
		sb.append(XCG01684);
		sb.append(", XCG01685=");
		sb.append(XCG01685);
		sb.append(", XCG01686=");
		sb.append(XCG01686);
		sb.append(", XCG01687=");
		sb.append(XCG01687);
		sb.append(", XCG01688=");
		sb.append(XCG01688);
		sb.append(", XCG01689=");
		sb.append(XCG01689);
		sb.append(", XCG01690=");
		sb.append(XCG01690);
		sb.append(", XCG01691=");
		sb.append(XCG01691);
		sb.append(", XCG01692=");
		sb.append(XCG01692);
		sb.append(", XCG01693=");
		sb.append(XCG01693);
		sb.append(", XCG01694=");
		sb.append(XCG01694);
		sb.append(", XCG01695=");
		sb.append(XCG01695);
		sb.append(", XCG01696=");
		sb.append(XCG01696);
		sb.append(", XCG01697=");
		sb.append(XCG01697);
		sb.append(", XCG01698=");
		sb.append(XCG01698);
		sb.append(", XCG01699=");
		sb.append(XCG01699);
		sb.append(", XCG01700=");
		sb.append(XCG01700);
		sb.append(", XCG01701=");
		sb.append(XCG01701);
		sb.append(", XCG01702=");
		sb.append(XCG01702);
		sb.append(", XCG01703=");
		sb.append(XCG01703);
		sb.append(", XCG01704=");
		sb.append(XCG01704);
		sb.append(", XCG01705=");
		sb.append(XCG01705);
		sb.append(", XCG01706=");
		sb.append(XCG01706);
		sb.append(", XCG01707=");
		sb.append(XCG01707);
		sb.append(", XCG01708=");
		sb.append(XCG01708);
		sb.append(", XCG01709=");
		sb.append(XCG01709);
		sb.append(", XCG01710=");
		sb.append(XCG01710);
		sb.append(", XCG01711=");
		sb.append(XCG01711);
		sb.append(", XCG01712=");
		sb.append(XCG01712);
		sb.append(", XCG01713=");
		sb.append(XCG01713);
		sb.append(", XCG01714=");
		sb.append(XCG01714);
		sb.append(", XCG01715=");
		sb.append(XCG01715);
		sb.append(", XCG01716=");
		sb.append(XCG01716);
		sb.append(", XCG01717=");
		sb.append(XCG01717);
		sb.append(", XCG01718=");
		sb.append(XCG01718);
		sb.append(", XCG01719=");
		sb.append(XCG01719);
		sb.append(", XCG01720=");
		sb.append(XCG01720);
		sb.append(", XCG01721=");
		sb.append(XCG01721);
		sb.append(", XCG01722=");
		sb.append(XCG01722);
		sb.append(", XCG01723=");
		sb.append(XCG01723);
		sb.append(", XCG01724=");
		sb.append(XCG01724);
		sb.append(", XCG01725=");
		sb.append(XCG01725);
		sb.append(", XCG01726=");
		sb.append(XCG01726);
		sb.append(", XCG01727=");
		sb.append(XCG01727);
		sb.append(", XCG01728=");
		sb.append(XCG01728);
		sb.append(", XCG01729=");
		sb.append(XCG01729);
		sb.append(", XCG01730=");
		sb.append(XCG01730);
		sb.append(", XCG01731=");
		sb.append(XCG01731);
		sb.append(", XCG01732=");
		sb.append(XCG01732);
		sb.append(", XCG01733=");
		sb.append(XCG01733);
		sb.append(", XCG01734=");
		sb.append(XCG01734);
		sb.append(", XCG01735=");
		sb.append(XCG01735);
		sb.append(", XCG01736=");
		sb.append(XCG01736);
		sb.append(", XCG01737=");
		sb.append(XCG01737);
		sb.append(", XCG01738=");
		sb.append(XCG01738);
		sb.append(", XCG01739=");
		sb.append(XCG01739);
		sb.append(", XCG01740=");
		sb.append(XCG01740);
		sb.append(", XCG01741=");
		sb.append(XCG01741);
		sb.append(", XCG01742=");
		sb.append(XCG01742);
		sb.append(", XCG01744=");
		sb.append(XCG01744);
		sb.append(", XCG01745=");
		sb.append(XCG01745);
		sb.append(", XCG01746=");
		sb.append(XCG01746);
		sb.append(", XCG01747=");
		sb.append(XCG01747);
		sb.append(", XCG01748=");
		sb.append(XCG01748);
		sb.append(", XCG01749=");
		sb.append(XCG01749);
		sb.append(", XCG01945=");
		sb.append(XCG01945);
		sb.append(", XCG01750=");
		sb.append(XCG01750);
		sb.append(", XCG01946=");
		sb.append(XCG01946);
		sb.append(", XCG01751=");
		sb.append(XCG01751);
		sb.append(", XCG01752=");
		sb.append(XCG01752);
		sb.append(", XCG01753=");
		sb.append(XCG01753);
		sb.append(", XCG01754=");
		sb.append(XCG01754);
		sb.append(", XCG01756=");
		sb.append(XCG01756);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRTechnicalSpec_XCGPart5 toEntityModel() {
		VRTechnicalSpec_XCGPart5Impl vrTechnicalSpec_XCGPart5Impl = new VRTechnicalSpec_XCGPart5Impl();

		vrTechnicalSpec_XCGPart5Impl.setId(id);
		vrTechnicalSpec_XCGPart5Impl.setMtCore(mtCore);
		vrTechnicalSpec_XCGPart5Impl.setConvertAssembleId(convertAssembleId);
		vrTechnicalSpec_XCGPart5Impl.setDossierId(dossierId);

		if (dossierNo == null) {
			vrTechnicalSpec_XCGPart5Impl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setDossierNo(dossierNo);
		}

		if (referenceUid == null) {
			vrTechnicalSpec_XCGPart5Impl.setReferenceUid(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setReferenceUid(referenceUid);
		}

		if (dossierIdCTN == null) {
			vrTechnicalSpec_XCGPart5Impl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setDossierIdCTN(dossierIdCTN);
		}

		if (deliverableCode == null) {
			vrTechnicalSpec_XCGPart5Impl.setDeliverableCode(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setDeliverableCode(deliverableCode);
		}

		vrTechnicalSpec_XCGPart5Impl.setVehicleTypeCertificateId(vehicleTypeCertificateId);

		if (XCG01598 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01598(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01598(XCG01598);
		}

		if (XCG01599 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01599(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01599(XCG01599);
		}

		if (XCG01600 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01600(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01600(XCG01600);
		}

		if (XCG01601 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01601(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01601(XCG01601);
		}

		if (XCG01602 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01602(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01602(XCG01602);
		}

		if (XCG01603 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01603(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01603(XCG01603);
		}

		if (XCG01923 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01923(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01923(XCG01923);
		}

		if (XCG01604 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01604(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01604(XCG01604);
		}

		if (XCG01924 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01924(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01924(XCG01924);
		}

		if (XCG01605 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01605(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01605(XCG01605);
		}

		if (XCG01606 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01606(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01606(XCG01606);
		}

		if (XCG01607 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01607(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01607(XCG01607);
		}

		if (XCG01608 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01608(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01608(XCG01608);
		}

		if (XCG01609 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01609(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01609(XCG01609);
		}

		if (XCG01925 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01925(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01925(XCG01925);
		}

		if (XCG01610 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01610(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01610(XCG01610);
		}

		if (XCG01926 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01926(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01926(XCG01926);
		}

		if (XCG01611 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01611(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01611(XCG01611);
		}

		if (XCG01612 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01612(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01612(XCG01612);
		}

		if (XCG01928 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01928(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01928(XCG01928);
		}

		if (XCG01613 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01613(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01613(XCG01613);
		}

		if (XCG01929 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01929(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01929(XCG01929);
		}

		if (XCG01614 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01614(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01614(XCG01614);
		}

		if (XCG01930 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01930(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01930(XCG01930);
		}

		if (XCG01615 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01615(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01615(XCG01615);
		}

		if (XCG01931 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01931(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01931(XCG01931);
		}

		if (XCG01616 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01616(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01616(XCG01616);
		}

		if (XCG01932 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01932(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01932(XCG01932);
		}

		if (XCG01617 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01617(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01617(XCG01617);
		}

		if (XCG01933 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01933(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01933(XCG01933);
		}

		if (XCG01618 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01618(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01618(XCG01618);
		}

		if (XCG01934 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01934(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01934(XCG01934);
		}

		if (XCG01619 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01619(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01619(XCG01619);
		}

		if (XCG01935 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01935(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01935(XCG01935);
		}

		if (XCG01620 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01620(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01620(XCG01620);
		}

		if (XCG01936 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01936(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01936(XCG01936);
		}

		if (XCG01621 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01621(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01621(XCG01621);
		}

		if (XCG01937 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01937(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01937(XCG01937);
		}

		if (XCG01622 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01622(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01622(XCG01622);
		}

		if (XCG01938 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01938(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01938(XCG01938);
		}

		if (XCG01623 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01623(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01623(XCG01623);
		}

		if (XCG01939 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01939(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01939(XCG01939);
		}

		if (XCG01624 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01624(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01624(XCG01624);
		}

		if (XCG01940 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01940(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01940(XCG01940);
		}

		if (XCG01625 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01625(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01625(XCG01625);
		}

		if (XCG01941 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01941(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01941(XCG01941);
		}

		if (XCG01626 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01626(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01626(XCG01626);
		}

		if (XCG01942 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01942(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01942(XCG01942);
		}

		if (XCG01627 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01627(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01627(XCG01627);
		}

		if (XCG01943 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01943(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01943(XCG01943);
		}

		if (XCG01628 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01628(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01628(XCG01628);
		}

		if (XCG01944 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01944(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01944(XCG01944);
		}

		if (XCG01630 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01630(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01630(XCG01630);
		}

		if (XCG01631 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01631(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01631(XCG01631);
		}

		if (XCG01632 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01632(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01632(XCG01632);
		}

		if (XCG01633 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01633(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01633(XCG01633);
		}

		if (XCG01634 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01634(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01634(XCG01634);
		}

		if (XCG01635 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01635(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01635(XCG01635);
		}

		if (XCG01636 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01636(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01636(XCG01636);
		}

		if (XCG01637 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01637(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01637(XCG01637);
		}

		if (XCG01638 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01638(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01638(XCG01638);
		}

		if (XCG01639 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01639(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01639(XCG01639);
		}

		if (XCG01640 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01640(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01640(XCG01640);
		}

		if (XCG01641 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01641(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01641(XCG01641);
		}

		if (XCG01642 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01642(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01642(XCG01642);
		}

		if (XCG01643 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01643(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01643(XCG01643);
		}

		if (XCG01644 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01644(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01644(XCG01644);
		}

		if (XCG01645 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01645(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01645(XCG01645);
		}

		if (XCG01646 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01646(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01646(XCG01646);
		}

		if (XCG01647 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01647(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01647(XCG01647);
		}

		if (XCG01648 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01648(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01648(XCG01648);
		}

		if (XCG01649 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01649(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01649(XCG01649);
		}

		if (XCG01650 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01650(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01650(XCG01650);
		}

		if (XCG01651 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01651(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01651(XCG01651);
		}

		if (XCG01652 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01652(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01652(XCG01652);
		}

		if (XCG01653 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01653(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01653(XCG01653);
		}

		if (XCG01654 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01654(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01654(XCG01654);
		}

		if (XCG01655 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01655(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01655(XCG01655);
		}

		if (XCG01656 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01656(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01656(XCG01656);
		}

		if (XCG01657 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01657(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01657(XCG01657);
		}

		if (XCG01658 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01658(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01658(XCG01658);
		}

		if (XCG01659 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01659(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01659(XCG01659);
		}

		if (XCG01660 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01660(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01660(XCG01660);
		}

		if (XCG01661 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01661(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01661(XCG01661);
		}

		if (XCG01662 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01662(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01662(XCG01662);
		}

		if (XCG01663 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01663(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01663(XCG01663);
		}

		if (XCG01664 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01664(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01664(XCG01664);
		}

		if (XCG01665 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01665(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01665(XCG01665);
		}

		if (XCG01666 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01666(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01666(XCG01666);
		}

		if (XCG01667 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01667(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01667(XCG01667);
		}

		if (XCG01668 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01668(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01668(XCG01668);
		}

		if (XCG01669 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01669(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01669(XCG01669);
		}

		if (XCG01670 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01670(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01670(XCG01670);
		}

		if (XCG01671 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01671(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01671(XCG01671);
		}

		if (XCG01672 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01672(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01672(XCG01672);
		}

		if (XCG01673 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01673(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01673(XCG01673);
		}

		if (XCG01674 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01674(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01674(XCG01674);
		}

		if (XCG01675 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01675(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01675(XCG01675);
		}

		if (XCG01676 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01676(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01676(XCG01676);
		}

		if (XCG01677 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01677(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01677(XCG01677);
		}

		if (XCG01678 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01678(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01678(XCG01678);
		}

		if (XCG01679 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01679(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01679(XCG01679);
		}

		if (XCG01680 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01680(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01680(XCG01680);
		}

		if (XCG01681 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01681(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01681(XCG01681);
		}

		if (XCG01682 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01682(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01682(XCG01682);
		}

		if (XCG01683 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01683(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01683(XCG01683);
		}

		if (XCG01684 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01684(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01684(XCG01684);
		}

		if (XCG01685 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01685(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01685(XCG01685);
		}

		if (XCG01686 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01686(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01686(XCG01686);
		}

		if (XCG01687 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01687(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01687(XCG01687);
		}

		if (XCG01688 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01688(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01688(XCG01688);
		}

		if (XCG01689 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01689(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01689(XCG01689);
		}

		if (XCG01690 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01690(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01690(XCG01690);
		}

		if (XCG01691 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01691(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01691(XCG01691);
		}

		if (XCG01692 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01692(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01692(XCG01692);
		}

		if (XCG01693 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01693(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01693(XCG01693);
		}

		if (XCG01694 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01694(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01694(XCG01694);
		}

		if (XCG01695 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01695(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01695(XCG01695);
		}

		if (XCG01696 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01696(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01696(XCG01696);
		}

		if (XCG01697 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01697(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01697(XCG01697);
		}

		if (XCG01698 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01698(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01698(XCG01698);
		}

		if (XCG01699 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01699(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01699(XCG01699);
		}

		if (XCG01700 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01700(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01700(XCG01700);
		}

		if (XCG01701 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01701(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01701(XCG01701);
		}

		if (XCG01702 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01702(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01702(XCG01702);
		}

		if (XCG01703 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01703(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01703(XCG01703);
		}

		if (XCG01704 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01704(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01704(XCG01704);
		}

		if (XCG01705 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01705(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01705(XCG01705);
		}

		if (XCG01706 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01706(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01706(XCG01706);
		}

		if (XCG01707 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01707(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01707(XCG01707);
		}

		if (XCG01708 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01708(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01708(XCG01708);
		}

		if (XCG01709 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01709(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01709(XCG01709);
		}

		if (XCG01710 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01710(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01710(XCG01710);
		}

		if (XCG01711 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01711(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01711(XCG01711);
		}

		if (XCG01712 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01712(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01712(XCG01712);
		}

		if (XCG01713 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01713(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01713(XCG01713);
		}

		if (XCG01714 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01714(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01714(XCG01714);
		}

		if (XCG01715 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01715(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01715(XCG01715);
		}

		if (XCG01716 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01716(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01716(XCG01716);
		}

		if (XCG01717 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01717(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01717(XCG01717);
		}

		if (XCG01718 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01718(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01718(XCG01718);
		}

		if (XCG01719 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01719(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01719(XCG01719);
		}

		if (XCG01720 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01720(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01720(XCG01720);
		}

		if (XCG01721 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01721(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01721(XCG01721);
		}

		if (XCG01722 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01722(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01722(XCG01722);
		}

		if (XCG01723 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01723(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01723(XCG01723);
		}

		if (XCG01724 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01724(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01724(XCG01724);
		}

		if (XCG01725 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01725(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01725(XCG01725);
		}

		if (XCG01726 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01726(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01726(XCG01726);
		}

		if (XCG01727 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01727(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01727(XCG01727);
		}

		if (XCG01728 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01728(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01728(XCG01728);
		}

		if (XCG01729 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01729(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01729(XCG01729);
		}

		if (XCG01730 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01730(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01730(XCG01730);
		}

		if (XCG01731 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01731(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01731(XCG01731);
		}

		if (XCG01732 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01732(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01732(XCG01732);
		}

		if (XCG01733 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01733(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01733(XCG01733);
		}

		if (XCG01734 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01734(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01734(XCG01734);
		}

		if (XCG01735 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01735(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01735(XCG01735);
		}

		if (XCG01736 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01736(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01736(XCG01736);
		}

		if (XCG01737 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01737(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01737(XCG01737);
		}

		if (XCG01738 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01738(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01738(XCG01738);
		}

		if (XCG01739 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01739(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01739(XCG01739);
		}

		if (XCG01740 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01740(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01740(XCG01740);
		}

		if (XCG01741 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01741(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01741(XCG01741);
		}

		if (XCG01742 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01742(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01742(XCG01742);
		}

		if (XCG01744 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01744(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01744(XCG01744);
		}

		if (XCG01745 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01745(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01745(XCG01745);
		}

		if (XCG01746 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01746(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01746(XCG01746);
		}

		if (XCG01747 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01747(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01747(XCG01747);
		}

		if (XCG01748 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01748(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01748(XCG01748);
		}

		if (XCG01749 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01749(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01749(XCG01749);
		}

		if (XCG01945 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01945(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01945(XCG01945);
		}

		if (XCG01750 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01750(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01750(XCG01750);
		}

		if (XCG01946 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01946(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01946(XCG01946);
		}

		if (XCG01751 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01751(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01751(XCG01751);
		}

		if (XCG01752 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01752(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01752(XCG01752);
		}

		if (XCG01753 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01753(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01753(XCG01753);
		}

		if (XCG01754 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01754(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01754(XCG01754);
		}

		if (XCG01756 == null) {
			vrTechnicalSpec_XCGPart5Impl.setXCG01756(StringPool.BLANK);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setXCG01756(XCG01756);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCGPart5Impl.setModifyDate(null);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrTechnicalSpec_XCGPart5Impl.setSyncDate(null);
		}
		else {
			vrTechnicalSpec_XCGPart5Impl.setSyncDate(new Date(syncDate));
		}

		vrTechnicalSpec_XCGPart5Impl.resetOriginalValues();

		return vrTechnicalSpec_XCGPart5Impl;
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
		XCG01598 = objectInput.readUTF();
		XCG01599 = objectInput.readUTF();
		XCG01600 = objectInput.readUTF();
		XCG01601 = objectInput.readUTF();
		XCG01602 = objectInput.readUTF();
		XCG01603 = objectInput.readUTF();
		XCG01923 = objectInput.readUTF();
		XCG01604 = objectInput.readUTF();
		XCG01924 = objectInput.readUTF();
		XCG01605 = objectInput.readUTF();
		XCG01606 = objectInput.readUTF();
		XCG01607 = objectInput.readUTF();
		XCG01608 = objectInput.readUTF();
		XCG01609 = objectInput.readUTF();
		XCG01925 = objectInput.readUTF();
		XCG01610 = objectInput.readUTF();
		XCG01926 = objectInput.readUTF();
		XCG01611 = objectInput.readUTF();
		XCG01612 = objectInput.readUTF();
		XCG01928 = objectInput.readUTF();
		XCG01613 = objectInput.readUTF();
		XCG01929 = objectInput.readUTF();
		XCG01614 = objectInput.readUTF();
		XCG01930 = objectInput.readUTF();
		XCG01615 = objectInput.readUTF();
		XCG01931 = objectInput.readUTF();
		XCG01616 = objectInput.readUTF();
		XCG01932 = objectInput.readUTF();
		XCG01617 = objectInput.readUTF();
		XCG01933 = objectInput.readUTF();
		XCG01618 = objectInput.readUTF();
		XCG01934 = objectInput.readUTF();
		XCG01619 = objectInput.readUTF();
		XCG01935 = objectInput.readUTF();
		XCG01620 = objectInput.readUTF();
		XCG01936 = objectInput.readUTF();
		XCG01621 = objectInput.readUTF();
		XCG01937 = objectInput.readUTF();
		XCG01622 = objectInput.readUTF();
		XCG01938 = objectInput.readUTF();
		XCG01623 = objectInput.readUTF();
		XCG01939 = objectInput.readUTF();
		XCG01624 = objectInput.readUTF();
		XCG01940 = objectInput.readUTF();
		XCG01625 = objectInput.readUTF();
		XCG01941 = objectInput.readUTF();
		XCG01626 = objectInput.readUTF();
		XCG01942 = objectInput.readUTF();
		XCG01627 = objectInput.readUTF();
		XCG01943 = objectInput.readUTF();
		XCG01628 = objectInput.readUTF();
		XCG01944 = objectInput.readUTF();
		XCG01630 = objectInput.readUTF();
		XCG01631 = objectInput.readUTF();
		XCG01632 = objectInput.readUTF();
		XCG01633 = objectInput.readUTF();
		XCG01634 = objectInput.readUTF();
		XCG01635 = objectInput.readUTF();
		XCG01636 = objectInput.readUTF();
		XCG01637 = objectInput.readUTF();
		XCG01638 = objectInput.readUTF();
		XCG01639 = objectInput.readUTF();
		XCG01640 = objectInput.readUTF();
		XCG01641 = objectInput.readUTF();
		XCG01642 = objectInput.readUTF();
		XCG01643 = objectInput.readUTF();
		XCG01644 = objectInput.readUTF();
		XCG01645 = objectInput.readUTF();
		XCG01646 = objectInput.readUTF();
		XCG01647 = objectInput.readUTF();
		XCG01648 = objectInput.readUTF();
		XCG01649 = objectInput.readUTF();
		XCG01650 = objectInput.readUTF();
		XCG01651 = objectInput.readUTF();
		XCG01652 = objectInput.readUTF();
		XCG01653 = objectInput.readUTF();
		XCG01654 = objectInput.readUTF();
		XCG01655 = objectInput.readUTF();
		XCG01656 = objectInput.readUTF();
		XCG01657 = objectInput.readUTF();
		XCG01658 = objectInput.readUTF();
		XCG01659 = objectInput.readUTF();
		XCG01660 = objectInput.readUTF();
		XCG01661 = objectInput.readUTF();
		XCG01662 = objectInput.readUTF();
		XCG01663 = objectInput.readUTF();
		XCG01664 = objectInput.readUTF();
		XCG01665 = objectInput.readUTF();
		XCG01666 = objectInput.readUTF();
		XCG01667 = objectInput.readUTF();
		XCG01668 = objectInput.readUTF();
		XCG01669 = objectInput.readUTF();
		XCG01670 = objectInput.readUTF();
		XCG01671 = objectInput.readUTF();
		XCG01672 = objectInput.readUTF();
		XCG01673 = objectInput.readUTF();
		XCG01674 = objectInput.readUTF();
		XCG01675 = objectInput.readUTF();
		XCG01676 = objectInput.readUTF();
		XCG01677 = objectInput.readUTF();
		XCG01678 = objectInput.readUTF();
		XCG01679 = objectInput.readUTF();
		XCG01680 = objectInput.readUTF();
		XCG01681 = objectInput.readUTF();
		XCG01682 = objectInput.readUTF();
		XCG01683 = objectInput.readUTF();
		XCG01684 = objectInput.readUTF();
		XCG01685 = objectInput.readUTF();
		XCG01686 = objectInput.readUTF();
		XCG01687 = objectInput.readUTF();
		XCG01688 = objectInput.readUTF();
		XCG01689 = objectInput.readUTF();
		XCG01690 = objectInput.readUTF();
		XCG01691 = objectInput.readUTF();
		XCG01692 = objectInput.readUTF();
		XCG01693 = objectInput.readUTF();
		XCG01694 = objectInput.readUTF();
		XCG01695 = objectInput.readUTF();
		XCG01696 = objectInput.readUTF();
		XCG01697 = objectInput.readUTF();
		XCG01698 = objectInput.readUTF();
		XCG01699 = objectInput.readUTF();
		XCG01700 = objectInput.readUTF();
		XCG01701 = objectInput.readUTF();
		XCG01702 = objectInput.readUTF();
		XCG01703 = objectInput.readUTF();
		XCG01704 = objectInput.readUTF();
		XCG01705 = objectInput.readUTF();
		XCG01706 = objectInput.readUTF();
		XCG01707 = objectInput.readUTF();
		XCG01708 = objectInput.readUTF();
		XCG01709 = objectInput.readUTF();
		XCG01710 = objectInput.readUTF();
		XCG01711 = objectInput.readUTF();
		XCG01712 = objectInput.readUTF();
		XCG01713 = objectInput.readUTF();
		XCG01714 = objectInput.readUTF();
		XCG01715 = objectInput.readUTF();
		XCG01716 = objectInput.readUTF();
		XCG01717 = objectInput.readUTF();
		XCG01718 = objectInput.readUTF();
		XCG01719 = objectInput.readUTF();
		XCG01720 = objectInput.readUTF();
		XCG01721 = objectInput.readUTF();
		XCG01722 = objectInput.readUTF();
		XCG01723 = objectInput.readUTF();
		XCG01724 = objectInput.readUTF();
		XCG01725 = objectInput.readUTF();
		XCG01726 = objectInput.readUTF();
		XCG01727 = objectInput.readUTF();
		XCG01728 = objectInput.readUTF();
		XCG01729 = objectInput.readUTF();
		XCG01730 = objectInput.readUTF();
		XCG01731 = objectInput.readUTF();
		XCG01732 = objectInput.readUTF();
		XCG01733 = objectInput.readUTF();
		XCG01734 = objectInput.readUTF();
		XCG01735 = objectInput.readUTF();
		XCG01736 = objectInput.readUTF();
		XCG01737 = objectInput.readUTF();
		XCG01738 = objectInput.readUTF();
		XCG01739 = objectInput.readUTF();
		XCG01740 = objectInput.readUTF();
		XCG01741 = objectInput.readUTF();
		XCG01742 = objectInput.readUTF();
		XCG01744 = objectInput.readUTF();
		XCG01745 = objectInput.readUTF();
		XCG01746 = objectInput.readUTF();
		XCG01747 = objectInput.readUTF();
		XCG01748 = objectInput.readUTF();
		XCG01749 = objectInput.readUTF();
		XCG01945 = objectInput.readUTF();
		XCG01750 = objectInput.readUTF();
		XCG01946 = objectInput.readUTF();
		XCG01751 = objectInput.readUTF();
		XCG01752 = objectInput.readUTF();
		XCG01753 = objectInput.readUTF();
		XCG01754 = objectInput.readUTF();
		XCG01756 = objectInput.readUTF();
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

		if (XCG01598 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01598);
		}

		if (XCG01599 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01599);
		}

		if (XCG01600 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01600);
		}

		if (XCG01601 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01601);
		}

		if (XCG01602 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01602);
		}

		if (XCG01603 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01603);
		}

		if (XCG01923 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01923);
		}

		if (XCG01604 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01604);
		}

		if (XCG01924 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01924);
		}

		if (XCG01605 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01605);
		}

		if (XCG01606 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01606);
		}

		if (XCG01607 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01607);
		}

		if (XCG01608 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01608);
		}

		if (XCG01609 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01609);
		}

		if (XCG01925 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01925);
		}

		if (XCG01610 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01610);
		}

		if (XCG01926 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01926);
		}

		if (XCG01611 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01611);
		}

		if (XCG01612 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01612);
		}

		if (XCG01928 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01928);
		}

		if (XCG01613 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01613);
		}

		if (XCG01929 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01929);
		}

		if (XCG01614 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01614);
		}

		if (XCG01930 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01930);
		}

		if (XCG01615 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01615);
		}

		if (XCG01931 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01931);
		}

		if (XCG01616 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01616);
		}

		if (XCG01932 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01932);
		}

		if (XCG01617 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01617);
		}

		if (XCG01933 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01933);
		}

		if (XCG01618 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01618);
		}

		if (XCG01934 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01934);
		}

		if (XCG01619 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01619);
		}

		if (XCG01935 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01935);
		}

		if (XCG01620 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01620);
		}

		if (XCG01936 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01936);
		}

		if (XCG01621 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01621);
		}

		if (XCG01937 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01937);
		}

		if (XCG01622 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01622);
		}

		if (XCG01938 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01938);
		}

		if (XCG01623 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01623);
		}

		if (XCG01939 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01939);
		}

		if (XCG01624 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01624);
		}

		if (XCG01940 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01940);
		}

		if (XCG01625 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01625);
		}

		if (XCG01941 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01941);
		}

		if (XCG01626 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01626);
		}

		if (XCG01942 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01942);
		}

		if (XCG01627 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01627);
		}

		if (XCG01943 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01943);
		}

		if (XCG01628 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01628);
		}

		if (XCG01944 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01944);
		}

		if (XCG01630 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01630);
		}

		if (XCG01631 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01631);
		}

		if (XCG01632 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01632);
		}

		if (XCG01633 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01633);
		}

		if (XCG01634 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01634);
		}

		if (XCG01635 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01635);
		}

		if (XCG01636 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01636);
		}

		if (XCG01637 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01637);
		}

		if (XCG01638 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01638);
		}

		if (XCG01639 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01639);
		}

		if (XCG01640 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01640);
		}

		if (XCG01641 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01641);
		}

		if (XCG01642 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01642);
		}

		if (XCG01643 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01643);
		}

		if (XCG01644 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01644);
		}

		if (XCG01645 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01645);
		}

		if (XCG01646 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01646);
		}

		if (XCG01647 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01647);
		}

		if (XCG01648 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01648);
		}

		if (XCG01649 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01649);
		}

		if (XCG01650 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01650);
		}

		if (XCG01651 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01651);
		}

		if (XCG01652 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01652);
		}

		if (XCG01653 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01653);
		}

		if (XCG01654 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01654);
		}

		if (XCG01655 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01655);
		}

		if (XCG01656 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01656);
		}

		if (XCG01657 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01657);
		}

		if (XCG01658 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01658);
		}

		if (XCG01659 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01659);
		}

		if (XCG01660 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01660);
		}

		if (XCG01661 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01661);
		}

		if (XCG01662 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01662);
		}

		if (XCG01663 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01663);
		}

		if (XCG01664 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01664);
		}

		if (XCG01665 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01665);
		}

		if (XCG01666 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01666);
		}

		if (XCG01667 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01667);
		}

		if (XCG01668 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01668);
		}

		if (XCG01669 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01669);
		}

		if (XCG01670 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01670);
		}

		if (XCG01671 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01671);
		}

		if (XCG01672 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01672);
		}

		if (XCG01673 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01673);
		}

		if (XCG01674 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01674);
		}

		if (XCG01675 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01675);
		}

		if (XCG01676 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01676);
		}

		if (XCG01677 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01677);
		}

		if (XCG01678 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01678);
		}

		if (XCG01679 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01679);
		}

		if (XCG01680 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01680);
		}

		if (XCG01681 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01681);
		}

		if (XCG01682 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01682);
		}

		if (XCG01683 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01683);
		}

		if (XCG01684 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01684);
		}

		if (XCG01685 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01685);
		}

		if (XCG01686 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01686);
		}

		if (XCG01687 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01687);
		}

		if (XCG01688 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01688);
		}

		if (XCG01689 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01689);
		}

		if (XCG01690 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01690);
		}

		if (XCG01691 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01691);
		}

		if (XCG01692 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01692);
		}

		if (XCG01693 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01693);
		}

		if (XCG01694 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01694);
		}

		if (XCG01695 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01695);
		}

		if (XCG01696 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01696);
		}

		if (XCG01697 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01697);
		}

		if (XCG01698 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01698);
		}

		if (XCG01699 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01699);
		}

		if (XCG01700 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01700);
		}

		if (XCG01701 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01701);
		}

		if (XCG01702 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01702);
		}

		if (XCG01703 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01703);
		}

		if (XCG01704 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01704);
		}

		if (XCG01705 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01705);
		}

		if (XCG01706 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01706);
		}

		if (XCG01707 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01707);
		}

		if (XCG01708 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01708);
		}

		if (XCG01709 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01709);
		}

		if (XCG01710 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01710);
		}

		if (XCG01711 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01711);
		}

		if (XCG01712 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01712);
		}

		if (XCG01713 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01713);
		}

		if (XCG01714 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01714);
		}

		if (XCG01715 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01715);
		}

		if (XCG01716 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01716);
		}

		if (XCG01717 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01717);
		}

		if (XCG01718 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01718);
		}

		if (XCG01719 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01719);
		}

		if (XCG01720 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01720);
		}

		if (XCG01721 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01721);
		}

		if (XCG01722 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01722);
		}

		if (XCG01723 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01723);
		}

		if (XCG01724 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01724);
		}

		if (XCG01725 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01725);
		}

		if (XCG01726 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01726);
		}

		if (XCG01727 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01727);
		}

		if (XCG01728 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01728);
		}

		if (XCG01729 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01729);
		}

		if (XCG01730 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01730);
		}

		if (XCG01731 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01731);
		}

		if (XCG01732 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01732);
		}

		if (XCG01733 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01733);
		}

		if (XCG01734 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01734);
		}

		if (XCG01735 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01735);
		}

		if (XCG01736 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01736);
		}

		if (XCG01737 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01737);
		}

		if (XCG01738 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01738);
		}

		if (XCG01739 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01739);
		}

		if (XCG01740 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01740);
		}

		if (XCG01741 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01741);
		}

		if (XCG01742 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01742);
		}

		if (XCG01744 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01744);
		}

		if (XCG01745 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01745);
		}

		if (XCG01746 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01746);
		}

		if (XCG01747 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01747);
		}

		if (XCG01748 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01748);
		}

		if (XCG01749 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01749);
		}

		if (XCG01945 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01945);
		}

		if (XCG01750 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01750);
		}

		if (XCG01946 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01946);
		}

		if (XCG01751 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01751);
		}

		if (XCG01752 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01752);
		}

		if (XCG01753 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01753);
		}

		if (XCG01754 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01754);
		}

		if (XCG01756 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG01756);
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
	public String XCG01598;
	public String XCG01599;
	public String XCG01600;
	public String XCG01601;
	public String XCG01602;
	public String XCG01603;
	public String XCG01923;
	public String XCG01604;
	public String XCG01924;
	public String XCG01605;
	public String XCG01606;
	public String XCG01607;
	public String XCG01608;
	public String XCG01609;
	public String XCG01925;
	public String XCG01610;
	public String XCG01926;
	public String XCG01611;
	public String XCG01612;
	public String XCG01928;
	public String XCG01613;
	public String XCG01929;
	public String XCG01614;
	public String XCG01930;
	public String XCG01615;
	public String XCG01931;
	public String XCG01616;
	public String XCG01932;
	public String XCG01617;
	public String XCG01933;
	public String XCG01618;
	public String XCG01934;
	public String XCG01619;
	public String XCG01935;
	public String XCG01620;
	public String XCG01936;
	public String XCG01621;
	public String XCG01937;
	public String XCG01622;
	public String XCG01938;
	public String XCG01623;
	public String XCG01939;
	public String XCG01624;
	public String XCG01940;
	public String XCG01625;
	public String XCG01941;
	public String XCG01626;
	public String XCG01942;
	public String XCG01627;
	public String XCG01943;
	public String XCG01628;
	public String XCG01944;
	public String XCG01630;
	public String XCG01631;
	public String XCG01632;
	public String XCG01633;
	public String XCG01634;
	public String XCG01635;
	public String XCG01636;
	public String XCG01637;
	public String XCG01638;
	public String XCG01639;
	public String XCG01640;
	public String XCG01641;
	public String XCG01642;
	public String XCG01643;
	public String XCG01644;
	public String XCG01645;
	public String XCG01646;
	public String XCG01647;
	public String XCG01648;
	public String XCG01649;
	public String XCG01650;
	public String XCG01651;
	public String XCG01652;
	public String XCG01653;
	public String XCG01654;
	public String XCG01655;
	public String XCG01656;
	public String XCG01657;
	public String XCG01658;
	public String XCG01659;
	public String XCG01660;
	public String XCG01661;
	public String XCG01662;
	public String XCG01663;
	public String XCG01664;
	public String XCG01665;
	public String XCG01666;
	public String XCG01667;
	public String XCG01668;
	public String XCG01669;
	public String XCG01670;
	public String XCG01671;
	public String XCG01672;
	public String XCG01673;
	public String XCG01674;
	public String XCG01675;
	public String XCG01676;
	public String XCG01677;
	public String XCG01678;
	public String XCG01679;
	public String XCG01680;
	public String XCG01681;
	public String XCG01682;
	public String XCG01683;
	public String XCG01684;
	public String XCG01685;
	public String XCG01686;
	public String XCG01687;
	public String XCG01688;
	public String XCG01689;
	public String XCG01690;
	public String XCG01691;
	public String XCG01692;
	public String XCG01693;
	public String XCG01694;
	public String XCG01695;
	public String XCG01696;
	public String XCG01697;
	public String XCG01698;
	public String XCG01699;
	public String XCG01700;
	public String XCG01701;
	public String XCG01702;
	public String XCG01703;
	public String XCG01704;
	public String XCG01705;
	public String XCG01706;
	public String XCG01707;
	public String XCG01708;
	public String XCG01709;
	public String XCG01710;
	public String XCG01711;
	public String XCG01712;
	public String XCG01713;
	public String XCG01714;
	public String XCG01715;
	public String XCG01716;
	public String XCG01717;
	public String XCG01718;
	public String XCG01719;
	public String XCG01720;
	public String XCG01721;
	public String XCG01722;
	public String XCG01723;
	public String XCG01724;
	public String XCG01725;
	public String XCG01726;
	public String XCG01727;
	public String XCG01728;
	public String XCG01729;
	public String XCG01730;
	public String XCG01731;
	public String XCG01732;
	public String XCG01733;
	public String XCG01734;
	public String XCG01735;
	public String XCG01736;
	public String XCG01737;
	public String XCG01738;
	public String XCG01739;
	public String XCG01740;
	public String XCG01741;
	public String XCG01742;
	public String XCG01744;
	public String XCG01745;
	public String XCG01746;
	public String XCG01747;
	public String XCG01748;
	public String XCG01749;
	public String XCG01945;
	public String XCG01750;
	public String XCG01946;
	public String XCG01751;
	public String XCG01752;
	public String XCG01753;
	public String XCG01754;
	public String XCG01756;
	public long modifyDate;
	public long syncDate;
}