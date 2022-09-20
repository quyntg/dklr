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

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRTechnicalSpec_XCGPart6}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart6
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart6Wrapper implements VRTechnicalSpec_XCGPart6,
	ModelWrapper<VRTechnicalSpec_XCGPart6> {
	public VRTechnicalSpec_XCGPart6Wrapper(
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6) {
		_vrTechnicalSpec_XCGPart6 = vrTechnicalSpec_XCGPart6;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XCGPart6.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XCGPart6.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("convertAssembleId", getConvertAssembleId());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierNo", getDossierNo());
		attributes.put("referenceUid", getReferenceUid());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("deliverableCode", getDeliverableCode());
		attributes.put("vehicleTypeCertificateId", getVehicleTypeCertificateId());
		attributes.put("XCG01757", getXCG01757());
		attributes.put("XCG01758", getXCG01758());
		attributes.put("XCG01759", getXCG01759());
		attributes.put("XCG01948", getXCG01948());
		attributes.put("XCG01760", getXCG01760());
		attributes.put("XCG01949", getXCG01949());
		attributes.put("XCG01761", getXCG01761());
		attributes.put("XCG01950", getXCG01950());
		attributes.put("XCG01762", getXCG01762());
		attributes.put("XCG01951", getXCG01951());
		attributes.put("XCG01763", getXCG01763());
		attributes.put("XCG01952", getXCG01952());
		attributes.put("XCG01764", getXCG01764());
		attributes.put("XCG01953", getXCG01953());
		attributes.put("XCG01765", getXCG01765());
		attributes.put("XCG01954", getXCG01954());
		attributes.put("XCG01766", getXCG01766());
		attributes.put("XCG01955", getXCG01955());
		attributes.put("XCG01767", getXCG01767());
		attributes.put("XCG01956", getXCG01956());
		attributes.put("XCG01768", getXCG01768());
		attributes.put("XCG01957", getXCG01957());
		attributes.put("XCG01769", getXCG01769());
		attributes.put("XCG01958", getXCG01958());
		attributes.put("XCG01770", getXCG01770());
		attributes.put("XCG01771", getXCG01771());
		attributes.put("XCG01959", getXCG01959());
		attributes.put("XCG01772", getXCG01772());
		attributes.put("XCG01773", getXCG01773());
		attributes.put("XCG01774", getXCG01774());
		attributes.put("XCG01775", getXCG01775());
		attributes.put("XCG01776", getXCG01776());
		attributes.put("XCG01777", getXCG01777());
		attributes.put("XCG01778", getXCG01778());
		attributes.put("XCG01779", getXCG01779());
		attributes.put("XCG01780", getXCG01780());
		attributes.put("XCG01781", getXCG01781());
		attributes.put("XCG01783", getXCG01783());
		attributes.put("XCG01785", getXCG01785());
		attributes.put("XCG01786", getXCG01786());
		attributes.put("XCG01787", getXCG01787());
		attributes.put("XCG01788", getXCG01788());
		attributes.put("XCG01789", getXCG01789());
		attributes.put("XCG01790", getXCG01790());
		attributes.put("XCG01791", getXCG01791());
		attributes.put("XCG01792", getXCG01792());
		attributes.put("XCG01793", getXCG01793());
		attributes.put("XCG01794", getXCG01794());
		attributes.put("XCG01795", getXCG01795());
		attributes.put("XCG01796", getXCG01796());
		attributes.put("XCG01797", getXCG01797());
		attributes.put("XCG01798", getXCG01798());
		attributes.put("XCG01799", getXCG01799());
		attributes.put("XCG01801", getXCG01801());
		attributes.put("XCG01802", getXCG01802());
		attributes.put("XCG01803", getXCG01803());
		attributes.put("XCG01804", getXCG01804());
		attributes.put("XCG01805", getXCG01805());
		attributes.put("XCG01806", getXCG01806());
		attributes.put("XCG01807", getXCG01807());
		attributes.put("XCG01808", getXCG01808());
		attributes.put("XCG01809", getXCG01809());
		attributes.put("XCG01810", getXCG01810());
		attributes.put("XCG01811", getXCG01811());
		attributes.put("XCG01812", getXCG01812());
		attributes.put("XCG01813", getXCG01813());
		attributes.put("XCG01814", getXCG01814());
		attributes.put("TDTKXCG001", getTDTKXCG001());
		attributes.put("TDTKXCG002", getTDTKXCG002());
		attributes.put("TDTKXCG003", getTDTKXCG003());
		attributes.put("TDTKXCG004", getTDTKXCG004());
		attributes.put("TDTKXCG005", getTDTKXCG005());
		attributes.put("TDTKXCG006", getTDTKXCG006());
		attributes.put("TDTKXCG007", getTDTKXCG007());
		attributes.put("TDTKXCG008", getTDTKXCG008());
		attributes.put("TDTKXCG009", getTDTKXCG009());
		attributes.put("TDTKXCG010", getTDTKXCG010());
		attributes.put("TDTKXCG011", getTDTKXCG011());
		attributes.put("TDTKXCG012", getTDTKXCG012());
		attributes.put("TDTKXCG013", getTDTKXCG013());
		attributes.put("TDTKXCG014", getTDTKXCG014());
		attributes.put("TDTKXCG015", getTDTKXCG015());
		attributes.put("TDTKXCG016", getTDTKXCG016());
		attributes.put("TDTKXCG017", getTDTKXCG017());
		attributes.put("TDTKXCG018", getTDTKXCG018());
		attributes.put("TDTKXCG019", getTDTKXCG019());
		attributes.put("TDTKXCG020", getTDTKXCG020());
		attributes.put("TDTKXCG021", getTDTKXCG021());
		attributes.put("TDTKXCG022", getTDTKXCG022());
		attributes.put("TDTKXCG023", getTDTKXCG023());
		attributes.put("TDTKXCG024", getTDTKXCG024());
		attributes.put("TDTKXCG025", getTDTKXCG025());
		attributes.put("TDTKXCG026", getTDTKXCG026());
		attributes.put("TDTKXCG027", getTDTKXCG027());
		attributes.put("TDTKXCG028", getTDTKXCG028());
		attributes.put("TDTKXCG029", getTDTKXCG029());
		attributes.put("TDTKXCG030", getTDTKXCG030());
		attributes.put("TDTKXCG031", getTDTKXCG031());
		attributes.put("TDTKXCG032", getTDTKXCG032());
		attributes.put("TDTKXCG033", getTDTKXCG033());
		attributes.put("TDTKXCG034", getTDTKXCG034());
		attributes.put("TDTKXCG035", getTDTKXCG035());
		attributes.put("TDTKXCG036", getTDTKXCG036());
		attributes.put("BBCNCLKLXCG01", getBBCNCLKLXCG01());
		attributes.put("BBCNCLKLXCG02", getBBCNCLKLXCG02());
		attributes.put("BBCNCLKLXCG03", getBBCNCLKLXCG03());
		attributes.put("BBCNCLKLXCG04", getBBCNCLKLXCG04());
		attributes.put("BBCNCLKLXCG05", getBBCNCLKLXCG05());
		attributes.put("BBCNCLKLXCG06", getBBCNCLKLXCG06());
		attributes.put("BBCNCLKLXCG07", getBBCNCLKLXCG07());
		attributes.put("BBCNCLKLXCG08", getBBCNCLKLXCG08());
		attributes.put("BBCNCLKLXCG09", getBBCNCLKLXCG09());
		attributes.put("BBCNCLKLXCG10", getBBCNCLKLXCG10());
		attributes.put("BBCNCLKLXCG11", getBBCNCLKLXCG11());
		attributes.put("BBCNCLKLXCG12", getBBCNCLKLXCG12());
		attributes.put("BBCNCLKLXCG13", getBBCNCLKLXCG13());
		attributes.put("BBCNCLKLXCG14", getBBCNCLKLXCG14());
		attributes.put("BBCNCLKLXCG15", getBBCNCLKLXCG15());
		attributes.put("BBCNCLKLXCG16", getBBCNCLKLXCG16());
		attributes.put("BBCNCLKLXCG17", getBBCNCLKLXCG17());
		attributes.put("BBCNCLKLXCG18", getBBCNCLKLXCG18());
		attributes.put("BBCNCLKLXCG19", getBBCNCLKLXCG19());
		attributes.put("BBCNCLKLXCG20", getBBCNCLKLXCG20());
		attributes.put("BBCNCLKLXCG21", getBBCNCLKLXCG21());
		attributes.put("BBCNCLKLXCG22", getBBCNCLKLXCG22());
		attributes.put("BBCNCLKLXCG23", getBBCNCLKLXCG23());
		attributes.put("BBCNCLKLXCG24", getBBCNCLKLXCG24());
		attributes.put("BBCNCLKLXCG26", getBBCNCLKLXCG26());
		attributes.put("BBCNCLKLXCG27", getBBCNCLKLXCG27());
		attributes.put("BBCNCLKLXCG28", getBBCNCLKLXCG28());
		attributes.put("BBCNCLKLXCG29", getBBCNCLKLXCG29());
		attributes.put("BBCNCLKLXCG30", getBBCNCLKLXCG30());
		attributes.put("BBCNCLKLXCG31", getBBCNCLKLXCG31());
		attributes.put("BBCNCLKLXCG33", getBBCNCLKLXCG33());
		attributes.put("BBCNCLKLXCG34", getBBCNCLKLXCG34());
		attributes.put("BBCNCLKLXCG35", getBBCNCLKLXCG35());
		attributes.put("BBCNCLKLXCG36", getBBCNCLKLXCG36());
		attributes.put("BBCNCLKLXCG38", getBBCNCLKLXCG38());
		attributes.put("BBCNCLKLXCG39", getBBCNCLKLXCG39());
		attributes.put("BBCNCLKLXCG40", getBBCNCLKLXCG40());
		attributes.put("BBCNCLKLXCG42", getBBCNCLKLXCG42());
		attributes.put("BBCNCLKLXCG43", getBBCNCLKLXCG43());
		attributes.put("BBCNCLKLXCG44", getBBCNCLKLXCG44());
		attributes.put("BBCNCLKLXCG45", getBBCNCLKLXCG45());
		attributes.put("BBCNCLKLXCG46", getBBCNCLKLXCG46());
		attributes.put("BBCNCLKLXCG47", getBBCNCLKLXCG47());
		attributes.put("BBCNCLKLXCG48", getBBCNCLKLXCG48());
		attributes.put("BBCNCLKLXCG49", getBBCNCLKLXCG49());
		attributes.put("BBCNCLKLXCG50", getBBCNCLKLXCG50());
		attributes.put("BBCNCLKLXCG51", getBBCNCLKLXCG51());
		attributes.put("BBCNCLKLXCG52", getBBCNCLKLXCG52());
		attributes.put("BBCNCLKLXCG53", getBBCNCLKLXCG53());
		attributes.put("BBCNCLKLXCG54", getBBCNCLKLXCG54());
		attributes.put("BBKTSPMXCG001", getBBKTSPMXCG001());
		attributes.put("BBKTSPMXCG002", getBBKTSPMXCG002());
		attributes.put("BBKTSPMXCG003", getBBKTSPMXCG003());
		attributes.put("BBKTSPMXCG004", getBBKTSPMXCG004());
		attributes.put("BBKTSPMXCG005", getBBKTSPMXCG005());
		attributes.put("BBKTSPMXCG006", getBBKTSPMXCG006());
		attributes.put("BBKTSPMXCG007", getBBKTSPMXCG007());
		attributes.put("BBKTSPMXCG008", getBBKTSPMXCG008());
		attributes.put("BBKTSPMXCG009", getBBKTSPMXCG009());
		attributes.put("BBKTSPMXCG010", getBBKTSPMXCG010());
		attributes.put("BBKTSPMXCG011", getBBKTSPMXCG011());
		attributes.put("BBKTSPMXCG012", getBBKTSPMXCG012());
		attributes.put("BBKTSPMXCG013", getBBKTSPMXCG013());
		attributes.put("BBKTSPMXCG014", getBBKTSPMXCG014());
		attributes.put("BBKTSPMXCG015", getBBKTSPMXCG015());
		attributes.put("BBKTSPMXCG016", getBBKTSPMXCG016());
		attributes.put("BBKTSPMXCG017", getBBKTSPMXCG017());
		attributes.put("BBKTSPMXCG018", getBBKTSPMXCG018());
		attributes.put("BBKTSPMXCG019", getBBKTSPMXCG019());
		attributes.put("BBKTSPMXCG020", getBBKTSPMXCG020());
		attributes.put("BBKTSPMXCG021", getBBKTSPMXCG021());
		attributes.put("BBKTSPMXCG022", getBBKTSPMXCG022());
		attributes.put("BBKTSPMXCG023", getBBKTSPMXCG023());
		attributes.put("BBKTSPMXCG024", getBBKTSPMXCG024());
		attributes.put("BBKTSPMXCG025", getBBKTSPMXCG025());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long convertAssembleId = (Long)attributes.get("convertAssembleId");

		if (convertAssembleId != null) {
			setConvertAssembleId(convertAssembleId);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String dossierNo = (String)attributes.get("dossierNo");

		if (dossierNo != null) {
			setDossierNo(dossierNo);
		}

		String referenceUid = (String)attributes.get("referenceUid");

		if (referenceUid != null) {
			setReferenceUid(referenceUid);
		}

		String dossierIdCTN = (String)attributes.get("dossierIdCTN");

		if (dossierIdCTN != null) {
			setDossierIdCTN(dossierIdCTN);
		}

		String deliverableCode = (String)attributes.get("deliverableCode");

		if (deliverableCode != null) {
			setDeliverableCode(deliverableCode);
		}

		Long vehicleTypeCertificateId = (Long)attributes.get(
				"vehicleTypeCertificateId");

		if (vehicleTypeCertificateId != null) {
			setVehicleTypeCertificateId(vehicleTypeCertificateId);
		}

		String XCG01757 = (String)attributes.get("XCG01757");

		if (XCG01757 != null) {
			setXCG01757(XCG01757);
		}

		String XCG01758 = (String)attributes.get("XCG01758");

		if (XCG01758 != null) {
			setXCG01758(XCG01758);
		}

		String XCG01759 = (String)attributes.get("XCG01759");

		if (XCG01759 != null) {
			setXCG01759(XCG01759);
		}

		String XCG01948 = (String)attributes.get("XCG01948");

		if (XCG01948 != null) {
			setXCG01948(XCG01948);
		}

		String XCG01760 = (String)attributes.get("XCG01760");

		if (XCG01760 != null) {
			setXCG01760(XCG01760);
		}

		String XCG01949 = (String)attributes.get("XCG01949");

		if (XCG01949 != null) {
			setXCG01949(XCG01949);
		}

		String XCG01761 = (String)attributes.get("XCG01761");

		if (XCG01761 != null) {
			setXCG01761(XCG01761);
		}

		String XCG01950 = (String)attributes.get("XCG01950");

		if (XCG01950 != null) {
			setXCG01950(XCG01950);
		}

		String XCG01762 = (String)attributes.get("XCG01762");

		if (XCG01762 != null) {
			setXCG01762(XCG01762);
		}

		String XCG01951 = (String)attributes.get("XCG01951");

		if (XCG01951 != null) {
			setXCG01951(XCG01951);
		}

		String XCG01763 = (String)attributes.get("XCG01763");

		if (XCG01763 != null) {
			setXCG01763(XCG01763);
		}

		String XCG01952 = (String)attributes.get("XCG01952");

		if (XCG01952 != null) {
			setXCG01952(XCG01952);
		}

		String XCG01764 = (String)attributes.get("XCG01764");

		if (XCG01764 != null) {
			setXCG01764(XCG01764);
		}

		String XCG01953 = (String)attributes.get("XCG01953");

		if (XCG01953 != null) {
			setXCG01953(XCG01953);
		}

		String XCG01765 = (String)attributes.get("XCG01765");

		if (XCG01765 != null) {
			setXCG01765(XCG01765);
		}

		String XCG01954 = (String)attributes.get("XCG01954");

		if (XCG01954 != null) {
			setXCG01954(XCG01954);
		}

		String XCG01766 = (String)attributes.get("XCG01766");

		if (XCG01766 != null) {
			setXCG01766(XCG01766);
		}

		String XCG01955 = (String)attributes.get("XCG01955");

		if (XCG01955 != null) {
			setXCG01955(XCG01955);
		}

		String XCG01767 = (String)attributes.get("XCG01767");

		if (XCG01767 != null) {
			setXCG01767(XCG01767);
		}

		String XCG01956 = (String)attributes.get("XCG01956");

		if (XCG01956 != null) {
			setXCG01956(XCG01956);
		}

		String XCG01768 = (String)attributes.get("XCG01768");

		if (XCG01768 != null) {
			setXCG01768(XCG01768);
		}

		String XCG01957 = (String)attributes.get("XCG01957");

		if (XCG01957 != null) {
			setXCG01957(XCG01957);
		}

		String XCG01769 = (String)attributes.get("XCG01769");

		if (XCG01769 != null) {
			setXCG01769(XCG01769);
		}

		String XCG01958 = (String)attributes.get("XCG01958");

		if (XCG01958 != null) {
			setXCG01958(XCG01958);
		}

		String XCG01770 = (String)attributes.get("XCG01770");

		if (XCG01770 != null) {
			setXCG01770(XCG01770);
		}

		String XCG01771 = (String)attributes.get("XCG01771");

		if (XCG01771 != null) {
			setXCG01771(XCG01771);
		}

		String XCG01959 = (String)attributes.get("XCG01959");

		if (XCG01959 != null) {
			setXCG01959(XCG01959);
		}

		String XCG01772 = (String)attributes.get("XCG01772");

		if (XCG01772 != null) {
			setXCG01772(XCG01772);
		}

		String XCG01773 = (String)attributes.get("XCG01773");

		if (XCG01773 != null) {
			setXCG01773(XCG01773);
		}

		String XCG01774 = (String)attributes.get("XCG01774");

		if (XCG01774 != null) {
			setXCG01774(XCG01774);
		}

		String XCG01775 = (String)attributes.get("XCG01775");

		if (XCG01775 != null) {
			setXCG01775(XCG01775);
		}

		String XCG01776 = (String)attributes.get("XCG01776");

		if (XCG01776 != null) {
			setXCG01776(XCG01776);
		}

		String XCG01777 = (String)attributes.get("XCG01777");

		if (XCG01777 != null) {
			setXCG01777(XCG01777);
		}

		String XCG01778 = (String)attributes.get("XCG01778");

		if (XCG01778 != null) {
			setXCG01778(XCG01778);
		}

		String XCG01779 = (String)attributes.get("XCG01779");

		if (XCG01779 != null) {
			setXCG01779(XCG01779);
		}

		String XCG01780 = (String)attributes.get("XCG01780");

		if (XCG01780 != null) {
			setXCG01780(XCG01780);
		}

		String XCG01781 = (String)attributes.get("XCG01781");

		if (XCG01781 != null) {
			setXCG01781(XCG01781);
		}

		String XCG01783 = (String)attributes.get("XCG01783");

		if (XCG01783 != null) {
			setXCG01783(XCG01783);
		}

		String XCG01785 = (String)attributes.get("XCG01785");

		if (XCG01785 != null) {
			setXCG01785(XCG01785);
		}

		String XCG01786 = (String)attributes.get("XCG01786");

		if (XCG01786 != null) {
			setXCG01786(XCG01786);
		}

		String XCG01787 = (String)attributes.get("XCG01787");

		if (XCG01787 != null) {
			setXCG01787(XCG01787);
		}

		String XCG01788 = (String)attributes.get("XCG01788");

		if (XCG01788 != null) {
			setXCG01788(XCG01788);
		}

		String XCG01789 = (String)attributes.get("XCG01789");

		if (XCG01789 != null) {
			setXCG01789(XCG01789);
		}

		String XCG01790 = (String)attributes.get("XCG01790");

		if (XCG01790 != null) {
			setXCG01790(XCG01790);
		}

		String XCG01791 = (String)attributes.get("XCG01791");

		if (XCG01791 != null) {
			setXCG01791(XCG01791);
		}

		String XCG01792 = (String)attributes.get("XCG01792");

		if (XCG01792 != null) {
			setXCG01792(XCG01792);
		}

		String XCG01793 = (String)attributes.get("XCG01793");

		if (XCG01793 != null) {
			setXCG01793(XCG01793);
		}

		String XCG01794 = (String)attributes.get("XCG01794");

		if (XCG01794 != null) {
			setXCG01794(XCG01794);
		}

		String XCG01795 = (String)attributes.get("XCG01795");

		if (XCG01795 != null) {
			setXCG01795(XCG01795);
		}

		String XCG01796 = (String)attributes.get("XCG01796");

		if (XCG01796 != null) {
			setXCG01796(XCG01796);
		}

		String XCG01797 = (String)attributes.get("XCG01797");

		if (XCG01797 != null) {
			setXCG01797(XCG01797);
		}

		String XCG01798 = (String)attributes.get("XCG01798");

		if (XCG01798 != null) {
			setXCG01798(XCG01798);
		}

		String XCG01799 = (String)attributes.get("XCG01799");

		if (XCG01799 != null) {
			setXCG01799(XCG01799);
		}

		String XCG01801 = (String)attributes.get("XCG01801");

		if (XCG01801 != null) {
			setXCG01801(XCG01801);
		}

		String XCG01802 = (String)attributes.get("XCG01802");

		if (XCG01802 != null) {
			setXCG01802(XCG01802);
		}

		String XCG01803 = (String)attributes.get("XCG01803");

		if (XCG01803 != null) {
			setXCG01803(XCG01803);
		}

		String XCG01804 = (String)attributes.get("XCG01804");

		if (XCG01804 != null) {
			setXCG01804(XCG01804);
		}

		String XCG01805 = (String)attributes.get("XCG01805");

		if (XCG01805 != null) {
			setXCG01805(XCG01805);
		}

		String XCG01806 = (String)attributes.get("XCG01806");

		if (XCG01806 != null) {
			setXCG01806(XCG01806);
		}

		String XCG01807 = (String)attributes.get("XCG01807");

		if (XCG01807 != null) {
			setXCG01807(XCG01807);
		}

		String XCG01808 = (String)attributes.get("XCG01808");

		if (XCG01808 != null) {
			setXCG01808(XCG01808);
		}

		String XCG01809 = (String)attributes.get("XCG01809");

		if (XCG01809 != null) {
			setXCG01809(XCG01809);
		}

		String XCG01810 = (String)attributes.get("XCG01810");

		if (XCG01810 != null) {
			setXCG01810(XCG01810);
		}

		String XCG01811 = (String)attributes.get("XCG01811");

		if (XCG01811 != null) {
			setXCG01811(XCG01811);
		}

		String XCG01812 = (String)attributes.get("XCG01812");

		if (XCG01812 != null) {
			setXCG01812(XCG01812);
		}

		String XCG01813 = (String)attributes.get("XCG01813");

		if (XCG01813 != null) {
			setXCG01813(XCG01813);
		}

		String XCG01814 = (String)attributes.get("XCG01814");

		if (XCG01814 != null) {
			setXCG01814(XCG01814);
		}

		String TDTKXCG001 = (String)attributes.get("TDTKXCG001");

		if (TDTKXCG001 != null) {
			setTDTKXCG001(TDTKXCG001);
		}

		String TDTKXCG002 = (String)attributes.get("TDTKXCG002");

		if (TDTKXCG002 != null) {
			setTDTKXCG002(TDTKXCG002);
		}

		String TDTKXCG003 = (String)attributes.get("TDTKXCG003");

		if (TDTKXCG003 != null) {
			setTDTKXCG003(TDTKXCG003);
		}

		String TDTKXCG004 = (String)attributes.get("TDTKXCG004");

		if (TDTKXCG004 != null) {
			setTDTKXCG004(TDTKXCG004);
		}

		String TDTKXCG005 = (String)attributes.get("TDTKXCG005");

		if (TDTKXCG005 != null) {
			setTDTKXCG005(TDTKXCG005);
		}

		String TDTKXCG006 = (String)attributes.get("TDTKXCG006");

		if (TDTKXCG006 != null) {
			setTDTKXCG006(TDTKXCG006);
		}

		String TDTKXCG007 = (String)attributes.get("TDTKXCG007");

		if (TDTKXCG007 != null) {
			setTDTKXCG007(TDTKXCG007);
		}

		String TDTKXCG008 = (String)attributes.get("TDTKXCG008");

		if (TDTKXCG008 != null) {
			setTDTKXCG008(TDTKXCG008);
		}

		String TDTKXCG009 = (String)attributes.get("TDTKXCG009");

		if (TDTKXCG009 != null) {
			setTDTKXCG009(TDTKXCG009);
		}

		String TDTKXCG010 = (String)attributes.get("TDTKXCG010");

		if (TDTKXCG010 != null) {
			setTDTKXCG010(TDTKXCG010);
		}

		String TDTKXCG011 = (String)attributes.get("TDTKXCG011");

		if (TDTKXCG011 != null) {
			setTDTKXCG011(TDTKXCG011);
		}

		String TDTKXCG012 = (String)attributes.get("TDTKXCG012");

		if (TDTKXCG012 != null) {
			setTDTKXCG012(TDTKXCG012);
		}

		String TDTKXCG013 = (String)attributes.get("TDTKXCG013");

		if (TDTKXCG013 != null) {
			setTDTKXCG013(TDTKXCG013);
		}

		String TDTKXCG014 = (String)attributes.get("TDTKXCG014");

		if (TDTKXCG014 != null) {
			setTDTKXCG014(TDTKXCG014);
		}

		String TDTKXCG015 = (String)attributes.get("TDTKXCG015");

		if (TDTKXCG015 != null) {
			setTDTKXCG015(TDTKXCG015);
		}

		String TDTKXCG016 = (String)attributes.get("TDTKXCG016");

		if (TDTKXCG016 != null) {
			setTDTKXCG016(TDTKXCG016);
		}

		String TDTKXCG017 = (String)attributes.get("TDTKXCG017");

		if (TDTKXCG017 != null) {
			setTDTKXCG017(TDTKXCG017);
		}

		String TDTKXCG018 = (String)attributes.get("TDTKXCG018");

		if (TDTKXCG018 != null) {
			setTDTKXCG018(TDTKXCG018);
		}

		String TDTKXCG019 = (String)attributes.get("TDTKXCG019");

		if (TDTKXCG019 != null) {
			setTDTKXCG019(TDTKXCG019);
		}

		String TDTKXCG020 = (String)attributes.get("TDTKXCG020");

		if (TDTKXCG020 != null) {
			setTDTKXCG020(TDTKXCG020);
		}

		String TDTKXCG021 = (String)attributes.get("TDTKXCG021");

		if (TDTKXCG021 != null) {
			setTDTKXCG021(TDTKXCG021);
		}

		String TDTKXCG022 = (String)attributes.get("TDTKXCG022");

		if (TDTKXCG022 != null) {
			setTDTKXCG022(TDTKXCG022);
		}

		String TDTKXCG023 = (String)attributes.get("TDTKXCG023");

		if (TDTKXCG023 != null) {
			setTDTKXCG023(TDTKXCG023);
		}

		String TDTKXCG024 = (String)attributes.get("TDTKXCG024");

		if (TDTKXCG024 != null) {
			setTDTKXCG024(TDTKXCG024);
		}

		String TDTKXCG025 = (String)attributes.get("TDTKXCG025");

		if (TDTKXCG025 != null) {
			setTDTKXCG025(TDTKXCG025);
		}

		String TDTKXCG026 = (String)attributes.get("TDTKXCG026");

		if (TDTKXCG026 != null) {
			setTDTKXCG026(TDTKXCG026);
		}

		String TDTKXCG027 = (String)attributes.get("TDTKXCG027");

		if (TDTKXCG027 != null) {
			setTDTKXCG027(TDTKXCG027);
		}

		String TDTKXCG028 = (String)attributes.get("TDTKXCG028");

		if (TDTKXCG028 != null) {
			setTDTKXCG028(TDTKXCG028);
		}

		String TDTKXCG029 = (String)attributes.get("TDTKXCG029");

		if (TDTKXCG029 != null) {
			setTDTKXCG029(TDTKXCG029);
		}

		String TDTKXCG030 = (String)attributes.get("TDTKXCG030");

		if (TDTKXCG030 != null) {
			setTDTKXCG030(TDTKXCG030);
		}

		String TDTKXCG031 = (String)attributes.get("TDTKXCG031");

		if (TDTKXCG031 != null) {
			setTDTKXCG031(TDTKXCG031);
		}

		String TDTKXCG032 = (String)attributes.get("TDTKXCG032");

		if (TDTKXCG032 != null) {
			setTDTKXCG032(TDTKXCG032);
		}

		String TDTKXCG033 = (String)attributes.get("TDTKXCG033");

		if (TDTKXCG033 != null) {
			setTDTKXCG033(TDTKXCG033);
		}

		String TDTKXCG034 = (String)attributes.get("TDTKXCG034");

		if (TDTKXCG034 != null) {
			setTDTKXCG034(TDTKXCG034);
		}

		String TDTKXCG035 = (String)attributes.get("TDTKXCG035");

		if (TDTKXCG035 != null) {
			setTDTKXCG035(TDTKXCG035);
		}

		String TDTKXCG036 = (String)attributes.get("TDTKXCG036");

		if (TDTKXCG036 != null) {
			setTDTKXCG036(TDTKXCG036);
		}

		String BBCNCLKLXCG01 = (String)attributes.get("BBCNCLKLXCG01");

		if (BBCNCLKLXCG01 != null) {
			setBBCNCLKLXCG01(BBCNCLKLXCG01);
		}

		String BBCNCLKLXCG02 = (String)attributes.get("BBCNCLKLXCG02");

		if (BBCNCLKLXCG02 != null) {
			setBBCNCLKLXCG02(BBCNCLKLXCG02);
		}

		String BBCNCLKLXCG03 = (String)attributes.get("BBCNCLKLXCG03");

		if (BBCNCLKLXCG03 != null) {
			setBBCNCLKLXCG03(BBCNCLKLXCG03);
		}

		String BBCNCLKLXCG04 = (String)attributes.get("BBCNCLKLXCG04");

		if (BBCNCLKLXCG04 != null) {
			setBBCNCLKLXCG04(BBCNCLKLXCG04);
		}

		String BBCNCLKLXCG05 = (String)attributes.get("BBCNCLKLXCG05");

		if (BBCNCLKLXCG05 != null) {
			setBBCNCLKLXCG05(BBCNCLKLXCG05);
		}

		String BBCNCLKLXCG06 = (String)attributes.get("BBCNCLKLXCG06");

		if (BBCNCLKLXCG06 != null) {
			setBBCNCLKLXCG06(BBCNCLKLXCG06);
		}

		String BBCNCLKLXCG07 = (String)attributes.get("BBCNCLKLXCG07");

		if (BBCNCLKLXCG07 != null) {
			setBBCNCLKLXCG07(BBCNCLKLXCG07);
		}

		String BBCNCLKLXCG08 = (String)attributes.get("BBCNCLKLXCG08");

		if (BBCNCLKLXCG08 != null) {
			setBBCNCLKLXCG08(BBCNCLKLXCG08);
		}

		String BBCNCLKLXCG09 = (String)attributes.get("BBCNCLKLXCG09");

		if (BBCNCLKLXCG09 != null) {
			setBBCNCLKLXCG09(BBCNCLKLXCG09);
		}

		String BBCNCLKLXCG10 = (String)attributes.get("BBCNCLKLXCG10");

		if (BBCNCLKLXCG10 != null) {
			setBBCNCLKLXCG10(BBCNCLKLXCG10);
		}

		String BBCNCLKLXCG11 = (String)attributes.get("BBCNCLKLXCG11");

		if (BBCNCLKLXCG11 != null) {
			setBBCNCLKLXCG11(BBCNCLKLXCG11);
		}

		String BBCNCLKLXCG12 = (String)attributes.get("BBCNCLKLXCG12");

		if (BBCNCLKLXCG12 != null) {
			setBBCNCLKLXCG12(BBCNCLKLXCG12);
		}

		String BBCNCLKLXCG13 = (String)attributes.get("BBCNCLKLXCG13");

		if (BBCNCLKLXCG13 != null) {
			setBBCNCLKLXCG13(BBCNCLKLXCG13);
		}

		String BBCNCLKLXCG14 = (String)attributes.get("BBCNCLKLXCG14");

		if (BBCNCLKLXCG14 != null) {
			setBBCNCLKLXCG14(BBCNCLKLXCG14);
		}

		String BBCNCLKLXCG15 = (String)attributes.get("BBCNCLKLXCG15");

		if (BBCNCLKLXCG15 != null) {
			setBBCNCLKLXCG15(BBCNCLKLXCG15);
		}

		String BBCNCLKLXCG16 = (String)attributes.get("BBCNCLKLXCG16");

		if (BBCNCLKLXCG16 != null) {
			setBBCNCLKLXCG16(BBCNCLKLXCG16);
		}

		String BBCNCLKLXCG17 = (String)attributes.get("BBCNCLKLXCG17");

		if (BBCNCLKLXCG17 != null) {
			setBBCNCLKLXCG17(BBCNCLKLXCG17);
		}

		String BBCNCLKLXCG18 = (String)attributes.get("BBCNCLKLXCG18");

		if (BBCNCLKLXCG18 != null) {
			setBBCNCLKLXCG18(BBCNCLKLXCG18);
		}

		String BBCNCLKLXCG19 = (String)attributes.get("BBCNCLKLXCG19");

		if (BBCNCLKLXCG19 != null) {
			setBBCNCLKLXCG19(BBCNCLKLXCG19);
		}

		String BBCNCLKLXCG20 = (String)attributes.get("BBCNCLKLXCG20");

		if (BBCNCLKLXCG20 != null) {
			setBBCNCLKLXCG20(BBCNCLKLXCG20);
		}

		String BBCNCLKLXCG21 = (String)attributes.get("BBCNCLKLXCG21");

		if (BBCNCLKLXCG21 != null) {
			setBBCNCLKLXCG21(BBCNCLKLXCG21);
		}

		String BBCNCLKLXCG22 = (String)attributes.get("BBCNCLKLXCG22");

		if (BBCNCLKLXCG22 != null) {
			setBBCNCLKLXCG22(BBCNCLKLXCG22);
		}

		String BBCNCLKLXCG23 = (String)attributes.get("BBCNCLKLXCG23");

		if (BBCNCLKLXCG23 != null) {
			setBBCNCLKLXCG23(BBCNCLKLXCG23);
		}

		String BBCNCLKLXCG24 = (String)attributes.get("BBCNCLKLXCG24");

		if (BBCNCLKLXCG24 != null) {
			setBBCNCLKLXCG24(BBCNCLKLXCG24);
		}

		String BBCNCLKLXCG26 = (String)attributes.get("BBCNCLKLXCG26");

		if (BBCNCLKLXCG26 != null) {
			setBBCNCLKLXCG26(BBCNCLKLXCG26);
		}

		String BBCNCLKLXCG27 = (String)attributes.get("BBCNCLKLXCG27");

		if (BBCNCLKLXCG27 != null) {
			setBBCNCLKLXCG27(BBCNCLKLXCG27);
		}

		String BBCNCLKLXCG28 = (String)attributes.get("BBCNCLKLXCG28");

		if (BBCNCLKLXCG28 != null) {
			setBBCNCLKLXCG28(BBCNCLKLXCG28);
		}

		String BBCNCLKLXCG29 = (String)attributes.get("BBCNCLKLXCG29");

		if (BBCNCLKLXCG29 != null) {
			setBBCNCLKLXCG29(BBCNCLKLXCG29);
		}

		String BBCNCLKLXCG30 = (String)attributes.get("BBCNCLKLXCG30");

		if (BBCNCLKLXCG30 != null) {
			setBBCNCLKLXCG30(BBCNCLKLXCG30);
		}

		String BBCNCLKLXCG31 = (String)attributes.get("BBCNCLKLXCG31");

		if (BBCNCLKLXCG31 != null) {
			setBBCNCLKLXCG31(BBCNCLKLXCG31);
		}

		String BBCNCLKLXCG33 = (String)attributes.get("BBCNCLKLXCG33");

		if (BBCNCLKLXCG33 != null) {
			setBBCNCLKLXCG33(BBCNCLKLXCG33);
		}

		String BBCNCLKLXCG34 = (String)attributes.get("BBCNCLKLXCG34");

		if (BBCNCLKLXCG34 != null) {
			setBBCNCLKLXCG34(BBCNCLKLXCG34);
		}

		String BBCNCLKLXCG35 = (String)attributes.get("BBCNCLKLXCG35");

		if (BBCNCLKLXCG35 != null) {
			setBBCNCLKLXCG35(BBCNCLKLXCG35);
		}

		String BBCNCLKLXCG36 = (String)attributes.get("BBCNCLKLXCG36");

		if (BBCNCLKLXCG36 != null) {
			setBBCNCLKLXCG36(BBCNCLKLXCG36);
		}

		String BBCNCLKLXCG38 = (String)attributes.get("BBCNCLKLXCG38");

		if (BBCNCLKLXCG38 != null) {
			setBBCNCLKLXCG38(BBCNCLKLXCG38);
		}

		String BBCNCLKLXCG39 = (String)attributes.get("BBCNCLKLXCG39");

		if (BBCNCLKLXCG39 != null) {
			setBBCNCLKLXCG39(BBCNCLKLXCG39);
		}

		String BBCNCLKLXCG40 = (String)attributes.get("BBCNCLKLXCG40");

		if (BBCNCLKLXCG40 != null) {
			setBBCNCLKLXCG40(BBCNCLKLXCG40);
		}

		String BBCNCLKLXCG42 = (String)attributes.get("BBCNCLKLXCG42");

		if (BBCNCLKLXCG42 != null) {
			setBBCNCLKLXCG42(BBCNCLKLXCG42);
		}

		String BBCNCLKLXCG43 = (String)attributes.get("BBCNCLKLXCG43");

		if (BBCNCLKLXCG43 != null) {
			setBBCNCLKLXCG43(BBCNCLKLXCG43);
		}

		String BBCNCLKLXCG44 = (String)attributes.get("BBCNCLKLXCG44");

		if (BBCNCLKLXCG44 != null) {
			setBBCNCLKLXCG44(BBCNCLKLXCG44);
		}

		String BBCNCLKLXCG45 = (String)attributes.get("BBCNCLKLXCG45");

		if (BBCNCLKLXCG45 != null) {
			setBBCNCLKLXCG45(BBCNCLKLXCG45);
		}

		String BBCNCLKLXCG46 = (String)attributes.get("BBCNCLKLXCG46");

		if (BBCNCLKLXCG46 != null) {
			setBBCNCLKLXCG46(BBCNCLKLXCG46);
		}

		String BBCNCLKLXCG47 = (String)attributes.get("BBCNCLKLXCG47");

		if (BBCNCLKLXCG47 != null) {
			setBBCNCLKLXCG47(BBCNCLKLXCG47);
		}

		String BBCNCLKLXCG48 = (String)attributes.get("BBCNCLKLXCG48");

		if (BBCNCLKLXCG48 != null) {
			setBBCNCLKLXCG48(BBCNCLKLXCG48);
		}

		String BBCNCLKLXCG49 = (String)attributes.get("BBCNCLKLXCG49");

		if (BBCNCLKLXCG49 != null) {
			setBBCNCLKLXCG49(BBCNCLKLXCG49);
		}

		String BBCNCLKLXCG50 = (String)attributes.get("BBCNCLKLXCG50");

		if (BBCNCLKLXCG50 != null) {
			setBBCNCLKLXCG50(BBCNCLKLXCG50);
		}

		String BBCNCLKLXCG51 = (String)attributes.get("BBCNCLKLXCG51");

		if (BBCNCLKLXCG51 != null) {
			setBBCNCLKLXCG51(BBCNCLKLXCG51);
		}

		String BBCNCLKLXCG52 = (String)attributes.get("BBCNCLKLXCG52");

		if (BBCNCLKLXCG52 != null) {
			setBBCNCLKLXCG52(BBCNCLKLXCG52);
		}

		String BBCNCLKLXCG53 = (String)attributes.get("BBCNCLKLXCG53");

		if (BBCNCLKLXCG53 != null) {
			setBBCNCLKLXCG53(BBCNCLKLXCG53);
		}

		String BBCNCLKLXCG54 = (String)attributes.get("BBCNCLKLXCG54");

		if (BBCNCLKLXCG54 != null) {
			setBBCNCLKLXCG54(BBCNCLKLXCG54);
		}

		String BBKTSPMXCG001 = (String)attributes.get("BBKTSPMXCG001");

		if (BBKTSPMXCG001 != null) {
			setBBKTSPMXCG001(BBKTSPMXCG001);
		}

		String BBKTSPMXCG002 = (String)attributes.get("BBKTSPMXCG002");

		if (BBKTSPMXCG002 != null) {
			setBBKTSPMXCG002(BBKTSPMXCG002);
		}

		String BBKTSPMXCG003 = (String)attributes.get("BBKTSPMXCG003");

		if (BBKTSPMXCG003 != null) {
			setBBKTSPMXCG003(BBKTSPMXCG003);
		}

		String BBKTSPMXCG004 = (String)attributes.get("BBKTSPMXCG004");

		if (BBKTSPMXCG004 != null) {
			setBBKTSPMXCG004(BBKTSPMXCG004);
		}

		String BBKTSPMXCG005 = (String)attributes.get("BBKTSPMXCG005");

		if (BBKTSPMXCG005 != null) {
			setBBKTSPMXCG005(BBKTSPMXCG005);
		}

		String BBKTSPMXCG006 = (String)attributes.get("BBKTSPMXCG006");

		if (BBKTSPMXCG006 != null) {
			setBBKTSPMXCG006(BBKTSPMXCG006);
		}

		String BBKTSPMXCG007 = (String)attributes.get("BBKTSPMXCG007");

		if (BBKTSPMXCG007 != null) {
			setBBKTSPMXCG007(BBKTSPMXCG007);
		}

		String BBKTSPMXCG008 = (String)attributes.get("BBKTSPMXCG008");

		if (BBKTSPMXCG008 != null) {
			setBBKTSPMXCG008(BBKTSPMXCG008);
		}

		String BBKTSPMXCG009 = (String)attributes.get("BBKTSPMXCG009");

		if (BBKTSPMXCG009 != null) {
			setBBKTSPMXCG009(BBKTSPMXCG009);
		}

		String BBKTSPMXCG010 = (String)attributes.get("BBKTSPMXCG010");

		if (BBKTSPMXCG010 != null) {
			setBBKTSPMXCG010(BBKTSPMXCG010);
		}

		String BBKTSPMXCG011 = (String)attributes.get("BBKTSPMXCG011");

		if (BBKTSPMXCG011 != null) {
			setBBKTSPMXCG011(BBKTSPMXCG011);
		}

		String BBKTSPMXCG012 = (String)attributes.get("BBKTSPMXCG012");

		if (BBKTSPMXCG012 != null) {
			setBBKTSPMXCG012(BBKTSPMXCG012);
		}

		String BBKTSPMXCG013 = (String)attributes.get("BBKTSPMXCG013");

		if (BBKTSPMXCG013 != null) {
			setBBKTSPMXCG013(BBKTSPMXCG013);
		}

		String BBKTSPMXCG014 = (String)attributes.get("BBKTSPMXCG014");

		if (BBKTSPMXCG014 != null) {
			setBBKTSPMXCG014(BBKTSPMXCG014);
		}

		String BBKTSPMXCG015 = (String)attributes.get("BBKTSPMXCG015");

		if (BBKTSPMXCG015 != null) {
			setBBKTSPMXCG015(BBKTSPMXCG015);
		}

		String BBKTSPMXCG016 = (String)attributes.get("BBKTSPMXCG016");

		if (BBKTSPMXCG016 != null) {
			setBBKTSPMXCG016(BBKTSPMXCG016);
		}

		String BBKTSPMXCG017 = (String)attributes.get("BBKTSPMXCG017");

		if (BBKTSPMXCG017 != null) {
			setBBKTSPMXCG017(BBKTSPMXCG017);
		}

		String BBKTSPMXCG018 = (String)attributes.get("BBKTSPMXCG018");

		if (BBKTSPMXCG018 != null) {
			setBBKTSPMXCG018(BBKTSPMXCG018);
		}

		String BBKTSPMXCG019 = (String)attributes.get("BBKTSPMXCG019");

		if (BBKTSPMXCG019 != null) {
			setBBKTSPMXCG019(BBKTSPMXCG019);
		}

		String BBKTSPMXCG020 = (String)attributes.get("BBKTSPMXCG020");

		if (BBKTSPMXCG020 != null) {
			setBBKTSPMXCG020(BBKTSPMXCG020);
		}

		String BBKTSPMXCG021 = (String)attributes.get("BBKTSPMXCG021");

		if (BBKTSPMXCG021 != null) {
			setBBKTSPMXCG021(BBKTSPMXCG021);
		}

		String BBKTSPMXCG022 = (String)attributes.get("BBKTSPMXCG022");

		if (BBKTSPMXCG022 != null) {
			setBBKTSPMXCG022(BBKTSPMXCG022);
		}

		String BBKTSPMXCG023 = (String)attributes.get("BBKTSPMXCG023");

		if (BBKTSPMXCG023 != null) {
			setBBKTSPMXCG023(BBKTSPMXCG023);
		}

		String BBKTSPMXCG024 = (String)attributes.get("BBKTSPMXCG024");

		if (BBKTSPMXCG024 != null) {
			setBBKTSPMXCG024(BBKTSPMXCG024);
		}

		String BBKTSPMXCG025 = (String)attributes.get("BBKTSPMXCG025");

		if (BBKTSPMXCG025 != null) {
			setBBKTSPMXCG025(BBKTSPMXCG025);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public VRTechnicalSpec_XCGPart6 toEscapedModel() {
		return new VRTechnicalSpec_XCGPart6Wrapper(_vrTechnicalSpec_XCGPart6.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XCGPart6 toUnescapedModel() {
		return new VRTechnicalSpec_XCGPart6Wrapper(_vrTechnicalSpec_XCGPart6.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XCGPart6.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XCGPart6.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XCGPart6.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XCGPart6.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XCGPart6> toCacheModel() {
		return _vrTechnicalSpec_XCGPart6.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6) {
		return _vrTechnicalSpec_XCGPart6.compareTo(vrTechnicalSpec_XCGPart6);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XCGPart6.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XCGPart6.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XCGPart6Wrapper((VRTechnicalSpec_XCGPart6)_vrTechnicalSpec_XCGPart6.clone());
	}

	/**
	* Returns the bbcnclklxcg01 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg01 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG01() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG01();
	}

	/**
	* Returns the bbcnclklxcg02 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg02 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG02() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG02();
	}

	/**
	* Returns the bbcnclklxcg03 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg03 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG03() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG03();
	}

	/**
	* Returns the bbcnclklxcg04 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg04 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG04() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG04();
	}

	/**
	* Returns the bbcnclklxcg05 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg05 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG05() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG05();
	}

	/**
	* Returns the bbcnclklxcg06 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg06 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG06() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG06();
	}

	/**
	* Returns the bbcnclklxcg07 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg07 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG07() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG07();
	}

	/**
	* Returns the bbcnclklxcg08 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg08 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG08() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG08();
	}

	/**
	* Returns the bbcnclklxcg09 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg09 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG09() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG09();
	}

	/**
	* Returns the bbcnclklxcg10 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg10 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG10() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG10();
	}

	/**
	* Returns the bbcnclklxcg11 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg11 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG11() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG11();
	}

	/**
	* Returns the bbcnclklxcg12 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg12 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG12() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG12();
	}

	/**
	* Returns the bbcnclklxcg13 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg13 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG13() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG13();
	}

	/**
	* Returns the bbcnclklxcg14 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg14 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG14() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG14();
	}

	/**
	* Returns the bbcnclklxcg15 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg15 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG15() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG15();
	}

	/**
	* Returns the bbcnclklxcg16 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg16 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG16() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG16();
	}

	/**
	* Returns the bbcnclklxcg17 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg17 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG17() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG17();
	}

	/**
	* Returns the bbcnclklxcg18 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg18 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG18() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG18();
	}

	/**
	* Returns the bbcnclklxcg19 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg19 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG19() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG19();
	}

	/**
	* Returns the bbcnclklxcg20 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg20 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG20() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG20();
	}

	/**
	* Returns the bbcnclklxcg21 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg21 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG21() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG21();
	}

	/**
	* Returns the bbcnclklxcg22 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg22 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG22() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG22();
	}

	/**
	* Returns the bbcnclklxcg23 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg23 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG23() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG23();
	}

	/**
	* Returns the bbcnclklxcg24 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg24 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG24() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG24();
	}

	/**
	* Returns the bbcnclklxcg26 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg26 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG26() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG26();
	}

	/**
	* Returns the bbcnclklxcg27 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg27 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG27() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG27();
	}

	/**
	* Returns the bbcnclklxcg28 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg28 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG28() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG28();
	}

	/**
	* Returns the bbcnclklxcg29 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg29 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG29() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG29();
	}

	/**
	* Returns the bbcnclklxcg30 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg30 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG30() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG30();
	}

	/**
	* Returns the bbcnclklxcg31 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg31 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG31() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG31();
	}

	/**
	* Returns the bbcnclklxcg33 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg33 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG33() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG33();
	}

	/**
	* Returns the bbcnclklxcg34 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg34 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG34() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG34();
	}

	/**
	* Returns the bbcnclklxcg35 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg35 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG35() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG35();
	}

	/**
	* Returns the bbcnclklxcg36 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg36 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG36() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG36();
	}

	/**
	* Returns the bbcnclklxcg38 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg38 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG38() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG38();
	}

	/**
	* Returns the bbcnclklxcg39 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg39 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG39() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG39();
	}

	/**
	* Returns the bbcnclklxcg40 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg40 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG40() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG40();
	}

	/**
	* Returns the bbcnclklxcg42 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg42 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG42() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG42();
	}

	/**
	* Returns the bbcnclklxcg43 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg43 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG43() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG43();
	}

	/**
	* Returns the bbcnclklxcg44 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg44 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG44() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG44();
	}

	/**
	* Returns the bbcnclklxcg45 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg45 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG45() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG45();
	}

	/**
	* Returns the bbcnclklxcg46 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg46 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG46() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG46();
	}

	/**
	* Returns the bbcnclklxcg47 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg47 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG47() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG47();
	}

	/**
	* Returns the bbcnclklxcg48 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg48 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG48() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG48();
	}

	/**
	* Returns the bbcnclklxcg49 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg49 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG49() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG49();
	}

	/**
	* Returns the bbcnclklxcg50 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg50 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG50() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG50();
	}

	/**
	* Returns the bbcnclklxcg51 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg51 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG51() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG51();
	}

	/**
	* Returns the bbcnclklxcg52 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg52 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG52() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG52();
	}

	/**
	* Returns the bbcnclklxcg53 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg53 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG53() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG53();
	}

	/**
	* Returns the bbcnclklxcg54 of this vr technical spec_xcg part6.
	*
	* @return the bbcnclklxcg54 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG54() {
		return _vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG54();
	}

	/**
	* Returns the bbktspmxcg001 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg001 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG001() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG001();
	}

	/**
	* Returns the bbktspmxcg002 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg002 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG002() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG002();
	}

	/**
	* Returns the bbktspmxcg003 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg003 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG003() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG003();
	}

	/**
	* Returns the bbktspmxcg004 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg004 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG004() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG004();
	}

	/**
	* Returns the bbktspmxcg005 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg005 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG005() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG005();
	}

	/**
	* Returns the bbktspmxcg006 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg006 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG006() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG006();
	}

	/**
	* Returns the bbktspmxcg007 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg007 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG007() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG007();
	}

	/**
	* Returns the bbktspmxcg008 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg008 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG008() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG008();
	}

	/**
	* Returns the bbktspmxcg009 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg009 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG009() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG009();
	}

	/**
	* Returns the bbktspmxcg010 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg010 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG010() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG010();
	}

	/**
	* Returns the bbktspmxcg011 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg011 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG011() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG011();
	}

	/**
	* Returns the bbktspmxcg012 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg012 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG012() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG012();
	}

	/**
	* Returns the bbktspmxcg013 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg013 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG013() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG013();
	}

	/**
	* Returns the bbktspmxcg014 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg014 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG014() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG014();
	}

	/**
	* Returns the bbktspmxcg015 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg015 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG015() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG015();
	}

	/**
	* Returns the bbktspmxcg016 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg016 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG016() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG016();
	}

	/**
	* Returns the bbktspmxcg017 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg017 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG017() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG017();
	}

	/**
	* Returns the bbktspmxcg018 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg018 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG018() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG018();
	}

	/**
	* Returns the bbktspmxcg019 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg019 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG019() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG019();
	}

	/**
	* Returns the bbktspmxcg020 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg020 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG020() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG020();
	}

	/**
	* Returns the bbktspmxcg021 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg021 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG021() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG021();
	}

	/**
	* Returns the bbktspmxcg022 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg022 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG022() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG022();
	}

	/**
	* Returns the bbktspmxcg023 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg023 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG023() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG023();
	}

	/**
	* Returns the bbktspmxcg024 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg024 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG024() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG024();
	}

	/**
	* Returns the bbktspmxcg025 of this vr technical spec_xcg part6.
	*
	* @return the bbktspmxcg025 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getBBKTSPMXCG025() {
		return _vrTechnicalSpec_XCGPart6.getBBKTSPMXCG025();
	}

	/**
	* Returns the deliverable code of this vr technical spec_xcg part6.
	*
	* @return the deliverable code of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XCGPart6.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xcg part6.
	*
	* @return the dossier ID ctn of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XCGPart6.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xcg part6.
	*
	* @return the dossier no of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XCGPart6.getDossierNo();
	}

	/**
	* Returns the reference uid of this vr technical spec_xcg part6.
	*
	* @return the reference uid of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XCGPart6.getReferenceUid();
	}

	/**
	* Returns the tdtkxcg001 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg001 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG001() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG001();
	}

	/**
	* Returns the tdtkxcg002 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg002 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG002() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG002();
	}

	/**
	* Returns the tdtkxcg003 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg003 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG003() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG003();
	}

	/**
	* Returns the tdtkxcg004 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg004 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG004() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG004();
	}

	/**
	* Returns the tdtkxcg005 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg005 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG005() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG005();
	}

	/**
	* Returns the tdtkxcg006 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg006 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG006() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG006();
	}

	/**
	* Returns the tdtkxcg007 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg007 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG007() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG007();
	}

	/**
	* Returns the tdtkxcg008 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg008 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG008() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG008();
	}

	/**
	* Returns the tdtkxcg009 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg009 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG009() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG009();
	}

	/**
	* Returns the tdtkxcg010 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg010 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG010() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG010();
	}

	/**
	* Returns the tdtkxcg011 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg011 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG011() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG011();
	}

	/**
	* Returns the tdtkxcg012 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg012 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG012() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG012();
	}

	/**
	* Returns the tdtkxcg013 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg013 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG013() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG013();
	}

	/**
	* Returns the tdtkxcg014 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg014 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG014() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG014();
	}

	/**
	* Returns the tdtkxcg015 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg015 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG015() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG015();
	}

	/**
	* Returns the tdtkxcg016 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg016 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG016() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG016();
	}

	/**
	* Returns the tdtkxcg017 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg017 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG017() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG017();
	}

	/**
	* Returns the tdtkxcg018 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg018 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG018() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG018();
	}

	/**
	* Returns the tdtkxcg019 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg019 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG019() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG019();
	}

	/**
	* Returns the tdtkxcg020 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg020 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG020() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG020();
	}

	/**
	* Returns the tdtkxcg021 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg021 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG021() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG021();
	}

	/**
	* Returns the tdtkxcg022 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg022 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG022() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG022();
	}

	/**
	* Returns the tdtkxcg023 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg023 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG023() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG023();
	}

	/**
	* Returns the tdtkxcg024 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg024 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG024() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG024();
	}

	/**
	* Returns the tdtkxcg025 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg025 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG025() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG025();
	}

	/**
	* Returns the tdtkxcg026 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg026 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG026() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG026();
	}

	/**
	* Returns the tdtkxcg027 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg027 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG027() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG027();
	}

	/**
	* Returns the tdtkxcg028 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg028 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG028() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG028();
	}

	/**
	* Returns the tdtkxcg029 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg029 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG029() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG029();
	}

	/**
	* Returns the tdtkxcg030 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg030 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG030() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG030();
	}

	/**
	* Returns the tdtkxcg031 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg031 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG031() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG031();
	}

	/**
	* Returns the tdtkxcg032 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg032 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG032() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG032();
	}

	/**
	* Returns the tdtkxcg033 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg033 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG033() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG033();
	}

	/**
	* Returns the tdtkxcg034 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg034 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG034() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG034();
	}

	/**
	* Returns the tdtkxcg035 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg035 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG035() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG035();
	}

	/**
	* Returns the tdtkxcg036 of this vr technical spec_xcg part6.
	*
	* @return the tdtkxcg036 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getTDTKXCG036() {
		return _vrTechnicalSpec_XCGPart6.getTDTKXCG036();
	}

	/**
	* Returns the xcg01757 of this vr technical spec_xcg part6.
	*
	* @return the xcg01757 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01757() {
		return _vrTechnicalSpec_XCGPart6.getXCG01757();
	}

	/**
	* Returns the xcg01758 of this vr technical spec_xcg part6.
	*
	* @return the xcg01758 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01758() {
		return _vrTechnicalSpec_XCGPart6.getXCG01758();
	}

	/**
	* Returns the xcg01759 of this vr technical spec_xcg part6.
	*
	* @return the xcg01759 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01759() {
		return _vrTechnicalSpec_XCGPart6.getXCG01759();
	}

	/**
	* Returns the xcg01760 of this vr technical spec_xcg part6.
	*
	* @return the xcg01760 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01760() {
		return _vrTechnicalSpec_XCGPart6.getXCG01760();
	}

	/**
	* Returns the xcg01761 of this vr technical spec_xcg part6.
	*
	* @return the xcg01761 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01761() {
		return _vrTechnicalSpec_XCGPart6.getXCG01761();
	}

	/**
	* Returns the xcg01762 of this vr technical spec_xcg part6.
	*
	* @return the xcg01762 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01762() {
		return _vrTechnicalSpec_XCGPart6.getXCG01762();
	}

	/**
	* Returns the xcg01763 of this vr technical spec_xcg part6.
	*
	* @return the xcg01763 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01763() {
		return _vrTechnicalSpec_XCGPart6.getXCG01763();
	}

	/**
	* Returns the xcg01764 of this vr technical spec_xcg part6.
	*
	* @return the xcg01764 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01764() {
		return _vrTechnicalSpec_XCGPart6.getXCG01764();
	}

	/**
	* Returns the xcg01765 of this vr technical spec_xcg part6.
	*
	* @return the xcg01765 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01765() {
		return _vrTechnicalSpec_XCGPart6.getXCG01765();
	}

	/**
	* Returns the xcg01766 of this vr technical spec_xcg part6.
	*
	* @return the xcg01766 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01766() {
		return _vrTechnicalSpec_XCGPart6.getXCG01766();
	}

	/**
	* Returns the xcg01767 of this vr technical spec_xcg part6.
	*
	* @return the xcg01767 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01767() {
		return _vrTechnicalSpec_XCGPart6.getXCG01767();
	}

	/**
	* Returns the xcg01768 of this vr technical spec_xcg part6.
	*
	* @return the xcg01768 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01768() {
		return _vrTechnicalSpec_XCGPart6.getXCG01768();
	}

	/**
	* Returns the xcg01769 of this vr technical spec_xcg part6.
	*
	* @return the xcg01769 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01769() {
		return _vrTechnicalSpec_XCGPart6.getXCG01769();
	}

	/**
	* Returns the xcg01770 of this vr technical spec_xcg part6.
	*
	* @return the xcg01770 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01770() {
		return _vrTechnicalSpec_XCGPart6.getXCG01770();
	}

	/**
	* Returns the xcg01771 of this vr technical spec_xcg part6.
	*
	* @return the xcg01771 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01771() {
		return _vrTechnicalSpec_XCGPart6.getXCG01771();
	}

	/**
	* Returns the xcg01772 of this vr technical spec_xcg part6.
	*
	* @return the xcg01772 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01772() {
		return _vrTechnicalSpec_XCGPart6.getXCG01772();
	}

	/**
	* Returns the xcg01773 of this vr technical spec_xcg part6.
	*
	* @return the xcg01773 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01773() {
		return _vrTechnicalSpec_XCGPart6.getXCG01773();
	}

	/**
	* Returns the xcg01774 of this vr technical spec_xcg part6.
	*
	* @return the xcg01774 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01774() {
		return _vrTechnicalSpec_XCGPart6.getXCG01774();
	}

	/**
	* Returns the xcg01775 of this vr technical spec_xcg part6.
	*
	* @return the xcg01775 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01775() {
		return _vrTechnicalSpec_XCGPart6.getXCG01775();
	}

	/**
	* Returns the xcg01776 of this vr technical spec_xcg part6.
	*
	* @return the xcg01776 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01776() {
		return _vrTechnicalSpec_XCGPart6.getXCG01776();
	}

	/**
	* Returns the xcg01777 of this vr technical spec_xcg part6.
	*
	* @return the xcg01777 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01777() {
		return _vrTechnicalSpec_XCGPart6.getXCG01777();
	}

	/**
	* Returns the xcg01778 of this vr technical spec_xcg part6.
	*
	* @return the xcg01778 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01778() {
		return _vrTechnicalSpec_XCGPart6.getXCG01778();
	}

	/**
	* Returns the xcg01779 of this vr technical spec_xcg part6.
	*
	* @return the xcg01779 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01779() {
		return _vrTechnicalSpec_XCGPart6.getXCG01779();
	}

	/**
	* Returns the xcg01780 of this vr technical spec_xcg part6.
	*
	* @return the xcg01780 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01780() {
		return _vrTechnicalSpec_XCGPart6.getXCG01780();
	}

	/**
	* Returns the xcg01781 of this vr technical spec_xcg part6.
	*
	* @return the xcg01781 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01781() {
		return _vrTechnicalSpec_XCGPart6.getXCG01781();
	}

	/**
	* Returns the xcg01783 of this vr technical spec_xcg part6.
	*
	* @return the xcg01783 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01783() {
		return _vrTechnicalSpec_XCGPart6.getXCG01783();
	}

	/**
	* Returns the xcg01785 of this vr technical spec_xcg part6.
	*
	* @return the xcg01785 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01785() {
		return _vrTechnicalSpec_XCGPart6.getXCG01785();
	}

	/**
	* Returns the xcg01786 of this vr technical spec_xcg part6.
	*
	* @return the xcg01786 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01786() {
		return _vrTechnicalSpec_XCGPart6.getXCG01786();
	}

	/**
	* Returns the xcg01787 of this vr technical spec_xcg part6.
	*
	* @return the xcg01787 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01787() {
		return _vrTechnicalSpec_XCGPart6.getXCG01787();
	}

	/**
	* Returns the xcg01788 of this vr technical spec_xcg part6.
	*
	* @return the xcg01788 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01788() {
		return _vrTechnicalSpec_XCGPart6.getXCG01788();
	}

	/**
	* Returns the xcg01789 of this vr technical spec_xcg part6.
	*
	* @return the xcg01789 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01789() {
		return _vrTechnicalSpec_XCGPart6.getXCG01789();
	}

	/**
	* Returns the xcg01790 of this vr technical spec_xcg part6.
	*
	* @return the xcg01790 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01790() {
		return _vrTechnicalSpec_XCGPart6.getXCG01790();
	}

	/**
	* Returns the xcg01791 of this vr technical spec_xcg part6.
	*
	* @return the xcg01791 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01791() {
		return _vrTechnicalSpec_XCGPart6.getXCG01791();
	}

	/**
	* Returns the xcg01792 of this vr technical spec_xcg part6.
	*
	* @return the xcg01792 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01792() {
		return _vrTechnicalSpec_XCGPart6.getXCG01792();
	}

	/**
	* Returns the xcg01793 of this vr technical spec_xcg part6.
	*
	* @return the xcg01793 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01793() {
		return _vrTechnicalSpec_XCGPart6.getXCG01793();
	}

	/**
	* Returns the xcg01794 of this vr technical spec_xcg part6.
	*
	* @return the xcg01794 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01794() {
		return _vrTechnicalSpec_XCGPart6.getXCG01794();
	}

	/**
	* Returns the xcg01795 of this vr technical spec_xcg part6.
	*
	* @return the xcg01795 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01795() {
		return _vrTechnicalSpec_XCGPart6.getXCG01795();
	}

	/**
	* Returns the xcg01796 of this vr technical spec_xcg part6.
	*
	* @return the xcg01796 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01796() {
		return _vrTechnicalSpec_XCGPart6.getXCG01796();
	}

	/**
	* Returns the xcg01797 of this vr technical spec_xcg part6.
	*
	* @return the xcg01797 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01797() {
		return _vrTechnicalSpec_XCGPart6.getXCG01797();
	}

	/**
	* Returns the xcg01798 of this vr technical spec_xcg part6.
	*
	* @return the xcg01798 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01798() {
		return _vrTechnicalSpec_XCGPart6.getXCG01798();
	}

	/**
	* Returns the xcg01799 of this vr technical spec_xcg part6.
	*
	* @return the xcg01799 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01799() {
		return _vrTechnicalSpec_XCGPart6.getXCG01799();
	}

	/**
	* Returns the xcg01801 of this vr technical spec_xcg part6.
	*
	* @return the xcg01801 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01801() {
		return _vrTechnicalSpec_XCGPart6.getXCG01801();
	}

	/**
	* Returns the xcg01802 of this vr technical spec_xcg part6.
	*
	* @return the xcg01802 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01802() {
		return _vrTechnicalSpec_XCGPart6.getXCG01802();
	}

	/**
	* Returns the xcg01803 of this vr technical spec_xcg part6.
	*
	* @return the xcg01803 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01803() {
		return _vrTechnicalSpec_XCGPart6.getXCG01803();
	}

	/**
	* Returns the xcg01804 of this vr technical spec_xcg part6.
	*
	* @return the xcg01804 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01804() {
		return _vrTechnicalSpec_XCGPart6.getXCG01804();
	}

	/**
	* Returns the xcg01805 of this vr technical spec_xcg part6.
	*
	* @return the xcg01805 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01805() {
		return _vrTechnicalSpec_XCGPart6.getXCG01805();
	}

	/**
	* Returns the xcg01806 of this vr technical spec_xcg part6.
	*
	* @return the xcg01806 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01806() {
		return _vrTechnicalSpec_XCGPart6.getXCG01806();
	}

	/**
	* Returns the xcg01807 of this vr technical spec_xcg part6.
	*
	* @return the xcg01807 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01807() {
		return _vrTechnicalSpec_XCGPart6.getXCG01807();
	}

	/**
	* Returns the xcg01808 of this vr technical spec_xcg part6.
	*
	* @return the xcg01808 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01808() {
		return _vrTechnicalSpec_XCGPart6.getXCG01808();
	}

	/**
	* Returns the xcg01809 of this vr technical spec_xcg part6.
	*
	* @return the xcg01809 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01809() {
		return _vrTechnicalSpec_XCGPart6.getXCG01809();
	}

	/**
	* Returns the xcg01810 of this vr technical spec_xcg part6.
	*
	* @return the xcg01810 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01810() {
		return _vrTechnicalSpec_XCGPart6.getXCG01810();
	}

	/**
	* Returns the xcg01811 of this vr technical spec_xcg part6.
	*
	* @return the xcg01811 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01811() {
		return _vrTechnicalSpec_XCGPart6.getXCG01811();
	}

	/**
	* Returns the xcg01812 of this vr technical spec_xcg part6.
	*
	* @return the xcg01812 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01812() {
		return _vrTechnicalSpec_XCGPart6.getXCG01812();
	}

	/**
	* Returns the xcg01813 of this vr technical spec_xcg part6.
	*
	* @return the xcg01813 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01813() {
		return _vrTechnicalSpec_XCGPart6.getXCG01813();
	}

	/**
	* Returns the xcg01814 of this vr technical spec_xcg part6.
	*
	* @return the xcg01814 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01814() {
		return _vrTechnicalSpec_XCGPart6.getXCG01814();
	}

	/**
	* Returns the xcg01948 of this vr technical spec_xcg part6.
	*
	* @return the xcg01948 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01948() {
		return _vrTechnicalSpec_XCGPart6.getXCG01948();
	}

	/**
	* Returns the xcg01949 of this vr technical spec_xcg part6.
	*
	* @return the xcg01949 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01949() {
		return _vrTechnicalSpec_XCGPart6.getXCG01949();
	}

	/**
	* Returns the xcg01950 of this vr technical spec_xcg part6.
	*
	* @return the xcg01950 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01950() {
		return _vrTechnicalSpec_XCGPart6.getXCG01950();
	}

	/**
	* Returns the xcg01951 of this vr technical spec_xcg part6.
	*
	* @return the xcg01951 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01951() {
		return _vrTechnicalSpec_XCGPart6.getXCG01951();
	}

	/**
	* Returns the xcg01952 of this vr technical spec_xcg part6.
	*
	* @return the xcg01952 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01952() {
		return _vrTechnicalSpec_XCGPart6.getXCG01952();
	}

	/**
	* Returns the xcg01953 of this vr technical spec_xcg part6.
	*
	* @return the xcg01953 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01953() {
		return _vrTechnicalSpec_XCGPart6.getXCG01953();
	}

	/**
	* Returns the xcg01954 of this vr technical spec_xcg part6.
	*
	* @return the xcg01954 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01954() {
		return _vrTechnicalSpec_XCGPart6.getXCG01954();
	}

	/**
	* Returns the xcg01955 of this vr technical spec_xcg part6.
	*
	* @return the xcg01955 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01955() {
		return _vrTechnicalSpec_XCGPart6.getXCG01955();
	}

	/**
	* Returns the xcg01956 of this vr technical spec_xcg part6.
	*
	* @return the xcg01956 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01956() {
		return _vrTechnicalSpec_XCGPart6.getXCG01956();
	}

	/**
	* Returns the xcg01957 of this vr technical spec_xcg part6.
	*
	* @return the xcg01957 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01957() {
		return _vrTechnicalSpec_XCGPart6.getXCG01957();
	}

	/**
	* Returns the xcg01958 of this vr technical spec_xcg part6.
	*
	* @return the xcg01958 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01958() {
		return _vrTechnicalSpec_XCGPart6.getXCG01958();
	}

	/**
	* Returns the xcg01959 of this vr technical spec_xcg part6.
	*
	* @return the xcg01959 of this vr technical spec_xcg part6
	*/
	@Override
	public java.lang.String getXCG01959() {
		return _vrTechnicalSpec_XCGPart6.getXCG01959();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XCGPart6.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XCGPart6.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xcg part6.
	*
	* @return the modify date of this vr technical spec_xcg part6
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XCGPart6.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xcg part6.
	*
	* @return the sync date of this vr technical spec_xcg part6
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XCGPart6.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xcg part6.
	*
	* @return the convert assemble ID of this vr technical spec_xcg part6
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XCGPart6.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xcg part6.
	*
	* @return the dossier ID of this vr technical spec_xcg part6
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XCGPart6.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xcg part6.
	*
	* @return the ID of this vr technical spec_xcg part6
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XCGPart6.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xcg part6.
	*
	* @return the mt core of this vr technical spec_xcg part6
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XCGPart6.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xcg part6.
	*
	* @return the primary key of this vr technical spec_xcg part6
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XCGPart6.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xcg part6.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xcg part6
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XCGPart6.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XCGPart6.persist();
	}

	/**
	* Sets the bbcnclklxcg01 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG01 the bbcnclklxcg01 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG01(java.lang.String BBCNCLKLXCG01) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG01(BBCNCLKLXCG01);
	}

	/**
	* Sets the bbcnclklxcg02 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG02 the bbcnclklxcg02 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG02(java.lang.String BBCNCLKLXCG02) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG02(BBCNCLKLXCG02);
	}

	/**
	* Sets the bbcnclklxcg03 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG03 the bbcnclklxcg03 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG03(java.lang.String BBCNCLKLXCG03) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG03(BBCNCLKLXCG03);
	}

	/**
	* Sets the bbcnclklxcg04 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG04 the bbcnclklxcg04 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG04(java.lang.String BBCNCLKLXCG04) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG04(BBCNCLKLXCG04);
	}

	/**
	* Sets the bbcnclklxcg05 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG05 the bbcnclklxcg05 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG05(java.lang.String BBCNCLKLXCG05) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG05(BBCNCLKLXCG05);
	}

	/**
	* Sets the bbcnclklxcg06 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG06 the bbcnclklxcg06 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG06(java.lang.String BBCNCLKLXCG06) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG06(BBCNCLKLXCG06);
	}

	/**
	* Sets the bbcnclklxcg07 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG07 the bbcnclklxcg07 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG07(java.lang.String BBCNCLKLXCG07) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG07(BBCNCLKLXCG07);
	}

	/**
	* Sets the bbcnclklxcg08 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG08 the bbcnclklxcg08 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG08(java.lang.String BBCNCLKLXCG08) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG08(BBCNCLKLXCG08);
	}

	/**
	* Sets the bbcnclklxcg09 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG09 the bbcnclklxcg09 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG09(java.lang.String BBCNCLKLXCG09) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG09(BBCNCLKLXCG09);
	}

	/**
	* Sets the bbcnclklxcg10 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG10 the bbcnclklxcg10 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG10(java.lang.String BBCNCLKLXCG10) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG10(BBCNCLKLXCG10);
	}

	/**
	* Sets the bbcnclklxcg11 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG11 the bbcnclklxcg11 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG11(java.lang.String BBCNCLKLXCG11) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG11(BBCNCLKLXCG11);
	}

	/**
	* Sets the bbcnclklxcg12 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG12 the bbcnclklxcg12 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG12(java.lang.String BBCNCLKLXCG12) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG12(BBCNCLKLXCG12);
	}

	/**
	* Sets the bbcnclklxcg13 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG13 the bbcnclklxcg13 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG13(java.lang.String BBCNCLKLXCG13) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG13(BBCNCLKLXCG13);
	}

	/**
	* Sets the bbcnclklxcg14 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG14 the bbcnclklxcg14 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG14(java.lang.String BBCNCLKLXCG14) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG14(BBCNCLKLXCG14);
	}

	/**
	* Sets the bbcnclklxcg15 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG15 the bbcnclklxcg15 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG15(java.lang.String BBCNCLKLXCG15) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG15(BBCNCLKLXCG15);
	}

	/**
	* Sets the bbcnclklxcg16 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG16 the bbcnclklxcg16 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG16(java.lang.String BBCNCLKLXCG16) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG16(BBCNCLKLXCG16);
	}

	/**
	* Sets the bbcnclklxcg17 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG17 the bbcnclklxcg17 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG17(java.lang.String BBCNCLKLXCG17) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG17(BBCNCLKLXCG17);
	}

	/**
	* Sets the bbcnclklxcg18 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG18 the bbcnclklxcg18 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG18(java.lang.String BBCNCLKLXCG18) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG18(BBCNCLKLXCG18);
	}

	/**
	* Sets the bbcnclklxcg19 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG19 the bbcnclklxcg19 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG19(java.lang.String BBCNCLKLXCG19) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG19(BBCNCLKLXCG19);
	}

	/**
	* Sets the bbcnclklxcg20 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG20 the bbcnclklxcg20 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG20(java.lang.String BBCNCLKLXCG20) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG20(BBCNCLKLXCG20);
	}

	/**
	* Sets the bbcnclklxcg21 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG21 the bbcnclklxcg21 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG21(java.lang.String BBCNCLKLXCG21) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG21(BBCNCLKLXCG21);
	}

	/**
	* Sets the bbcnclklxcg22 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG22 the bbcnclklxcg22 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG22(java.lang.String BBCNCLKLXCG22) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG22(BBCNCLKLXCG22);
	}

	/**
	* Sets the bbcnclklxcg23 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG23 the bbcnclklxcg23 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG23(java.lang.String BBCNCLKLXCG23) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG23(BBCNCLKLXCG23);
	}

	/**
	* Sets the bbcnclklxcg24 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG24 the bbcnclklxcg24 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG24(java.lang.String BBCNCLKLXCG24) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG24(BBCNCLKLXCG24);
	}

	/**
	* Sets the bbcnclklxcg26 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG26 the bbcnclklxcg26 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG26(java.lang.String BBCNCLKLXCG26) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG26(BBCNCLKLXCG26);
	}

	/**
	* Sets the bbcnclklxcg27 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG27 the bbcnclklxcg27 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG27(java.lang.String BBCNCLKLXCG27) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG27(BBCNCLKLXCG27);
	}

	/**
	* Sets the bbcnclklxcg28 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG28 the bbcnclklxcg28 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG28(java.lang.String BBCNCLKLXCG28) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG28(BBCNCLKLXCG28);
	}

	/**
	* Sets the bbcnclklxcg29 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG29 the bbcnclklxcg29 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG29(java.lang.String BBCNCLKLXCG29) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG29(BBCNCLKLXCG29);
	}

	/**
	* Sets the bbcnclklxcg30 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG30 the bbcnclklxcg30 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG30(java.lang.String BBCNCLKLXCG30) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG30(BBCNCLKLXCG30);
	}

	/**
	* Sets the bbcnclklxcg31 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG31 the bbcnclklxcg31 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG31(java.lang.String BBCNCLKLXCG31) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG31(BBCNCLKLXCG31);
	}

	/**
	* Sets the bbcnclklxcg33 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG33 the bbcnclklxcg33 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG33(java.lang.String BBCNCLKLXCG33) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG33(BBCNCLKLXCG33);
	}

	/**
	* Sets the bbcnclklxcg34 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG34 the bbcnclklxcg34 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG34(java.lang.String BBCNCLKLXCG34) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG34(BBCNCLKLXCG34);
	}

	/**
	* Sets the bbcnclklxcg35 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG35 the bbcnclklxcg35 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG35(java.lang.String BBCNCLKLXCG35) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG35(BBCNCLKLXCG35);
	}

	/**
	* Sets the bbcnclklxcg36 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG36 the bbcnclklxcg36 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG36(java.lang.String BBCNCLKLXCG36) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG36(BBCNCLKLXCG36);
	}

	/**
	* Sets the bbcnclklxcg38 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG38 the bbcnclklxcg38 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG38(java.lang.String BBCNCLKLXCG38) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG38(BBCNCLKLXCG38);
	}

	/**
	* Sets the bbcnclklxcg39 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG39 the bbcnclklxcg39 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG39(java.lang.String BBCNCLKLXCG39) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG39(BBCNCLKLXCG39);
	}

	/**
	* Sets the bbcnclklxcg40 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG40 the bbcnclklxcg40 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG40(java.lang.String BBCNCLKLXCG40) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG40(BBCNCLKLXCG40);
	}

	/**
	* Sets the bbcnclklxcg42 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG42 the bbcnclklxcg42 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG42(java.lang.String BBCNCLKLXCG42) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG42(BBCNCLKLXCG42);
	}

	/**
	* Sets the bbcnclklxcg43 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG43 the bbcnclklxcg43 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG43(java.lang.String BBCNCLKLXCG43) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG43(BBCNCLKLXCG43);
	}

	/**
	* Sets the bbcnclklxcg44 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG44 the bbcnclklxcg44 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG44(java.lang.String BBCNCLKLXCG44) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG44(BBCNCLKLXCG44);
	}

	/**
	* Sets the bbcnclklxcg45 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG45 the bbcnclklxcg45 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG45(java.lang.String BBCNCLKLXCG45) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG45(BBCNCLKLXCG45);
	}

	/**
	* Sets the bbcnclklxcg46 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG46 the bbcnclklxcg46 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG46(java.lang.String BBCNCLKLXCG46) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG46(BBCNCLKLXCG46);
	}

	/**
	* Sets the bbcnclklxcg47 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG47 the bbcnclklxcg47 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG47(java.lang.String BBCNCLKLXCG47) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG47(BBCNCLKLXCG47);
	}

	/**
	* Sets the bbcnclklxcg48 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG48 the bbcnclklxcg48 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG48(java.lang.String BBCNCLKLXCG48) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG48(BBCNCLKLXCG48);
	}

	/**
	* Sets the bbcnclklxcg49 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG49 the bbcnclklxcg49 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG49(java.lang.String BBCNCLKLXCG49) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG49(BBCNCLKLXCG49);
	}

	/**
	* Sets the bbcnclklxcg50 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG50 the bbcnclklxcg50 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG50(java.lang.String BBCNCLKLXCG50) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG50(BBCNCLKLXCG50);
	}

	/**
	* Sets the bbcnclklxcg51 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG51 the bbcnclklxcg51 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG51(java.lang.String BBCNCLKLXCG51) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG51(BBCNCLKLXCG51);
	}

	/**
	* Sets the bbcnclklxcg52 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG52 the bbcnclklxcg52 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG52(java.lang.String BBCNCLKLXCG52) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG52(BBCNCLKLXCG52);
	}

	/**
	* Sets the bbcnclklxcg53 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG53 the bbcnclklxcg53 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG53(java.lang.String BBCNCLKLXCG53) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG53(BBCNCLKLXCG53);
	}

	/**
	* Sets the bbcnclklxcg54 of this vr technical spec_xcg part6.
	*
	* @param BBCNCLKLXCG54 the bbcnclklxcg54 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBCNCLKLXCG54(java.lang.String BBCNCLKLXCG54) {
		_vrTechnicalSpec_XCGPart6.setBBCNCLKLXCG54(BBCNCLKLXCG54);
	}

	/**
	* Sets the bbktspmxcg001 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG001 the bbktspmxcg001 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG001(java.lang.String BBKTSPMXCG001) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG001(BBKTSPMXCG001);
	}

	/**
	* Sets the bbktspmxcg002 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG002 the bbktspmxcg002 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG002(java.lang.String BBKTSPMXCG002) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG002(BBKTSPMXCG002);
	}

	/**
	* Sets the bbktspmxcg003 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG003 the bbktspmxcg003 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG003(java.lang.String BBKTSPMXCG003) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG003(BBKTSPMXCG003);
	}

	/**
	* Sets the bbktspmxcg004 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG004 the bbktspmxcg004 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG004(java.lang.String BBKTSPMXCG004) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG004(BBKTSPMXCG004);
	}

	/**
	* Sets the bbktspmxcg005 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG005 the bbktspmxcg005 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG005(java.lang.String BBKTSPMXCG005) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG005(BBKTSPMXCG005);
	}

	/**
	* Sets the bbktspmxcg006 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG006 the bbktspmxcg006 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG006(java.lang.String BBKTSPMXCG006) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG006(BBKTSPMXCG006);
	}

	/**
	* Sets the bbktspmxcg007 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG007 the bbktspmxcg007 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG007(java.lang.String BBKTSPMXCG007) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG007(BBKTSPMXCG007);
	}

	/**
	* Sets the bbktspmxcg008 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG008 the bbktspmxcg008 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG008(java.lang.String BBKTSPMXCG008) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG008(BBKTSPMXCG008);
	}

	/**
	* Sets the bbktspmxcg009 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG009 the bbktspmxcg009 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG009(java.lang.String BBKTSPMXCG009) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG009(BBKTSPMXCG009);
	}

	/**
	* Sets the bbktspmxcg010 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG010 the bbktspmxcg010 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG010(java.lang.String BBKTSPMXCG010) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG010(BBKTSPMXCG010);
	}

	/**
	* Sets the bbktspmxcg011 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG011 the bbktspmxcg011 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG011(java.lang.String BBKTSPMXCG011) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG011(BBKTSPMXCG011);
	}

	/**
	* Sets the bbktspmxcg012 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG012 the bbktspmxcg012 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG012(java.lang.String BBKTSPMXCG012) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG012(BBKTSPMXCG012);
	}

	/**
	* Sets the bbktspmxcg013 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG013 the bbktspmxcg013 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG013(java.lang.String BBKTSPMXCG013) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG013(BBKTSPMXCG013);
	}

	/**
	* Sets the bbktspmxcg014 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG014 the bbktspmxcg014 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG014(java.lang.String BBKTSPMXCG014) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG014(BBKTSPMXCG014);
	}

	/**
	* Sets the bbktspmxcg015 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG015 the bbktspmxcg015 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG015(java.lang.String BBKTSPMXCG015) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG015(BBKTSPMXCG015);
	}

	/**
	* Sets the bbktspmxcg016 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG016 the bbktspmxcg016 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG016(java.lang.String BBKTSPMXCG016) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG016(BBKTSPMXCG016);
	}

	/**
	* Sets the bbktspmxcg017 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG017 the bbktspmxcg017 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG017(java.lang.String BBKTSPMXCG017) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG017(BBKTSPMXCG017);
	}

	/**
	* Sets the bbktspmxcg018 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG018 the bbktspmxcg018 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG018(java.lang.String BBKTSPMXCG018) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG018(BBKTSPMXCG018);
	}

	/**
	* Sets the bbktspmxcg019 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG019 the bbktspmxcg019 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG019(java.lang.String BBKTSPMXCG019) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG019(BBKTSPMXCG019);
	}

	/**
	* Sets the bbktspmxcg020 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG020 the bbktspmxcg020 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG020(java.lang.String BBKTSPMXCG020) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG020(BBKTSPMXCG020);
	}

	/**
	* Sets the bbktspmxcg021 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG021 the bbktspmxcg021 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG021(java.lang.String BBKTSPMXCG021) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG021(BBKTSPMXCG021);
	}

	/**
	* Sets the bbktspmxcg022 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG022 the bbktspmxcg022 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG022(java.lang.String BBKTSPMXCG022) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG022(BBKTSPMXCG022);
	}

	/**
	* Sets the bbktspmxcg023 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG023 the bbktspmxcg023 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG023(java.lang.String BBKTSPMXCG023) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG023(BBKTSPMXCG023);
	}

	/**
	* Sets the bbktspmxcg024 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG024 the bbktspmxcg024 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG024(java.lang.String BBKTSPMXCG024) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG024(BBKTSPMXCG024);
	}

	/**
	* Sets the bbktspmxcg025 of this vr technical spec_xcg part6.
	*
	* @param BBKTSPMXCG025 the bbktspmxcg025 of this vr technical spec_xcg part6
	*/
	@Override
	public void setBBKTSPMXCG025(java.lang.String BBKTSPMXCG025) {
		_vrTechnicalSpec_XCGPart6.setBBKTSPMXCG025(BBKTSPMXCG025);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XCGPart6.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xcg part6.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xcg part6
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XCGPart6.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xcg part6.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xcg part6
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XCGPart6.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xcg part6.
	*
	* @param dossierId the dossier ID of this vr technical spec_xcg part6
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XCGPart6.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xcg part6.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xcg part6
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XCGPart6.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xcg part6.
	*
	* @param dossierNo the dossier no of this vr technical spec_xcg part6
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XCGPart6.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XCGPart6.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XCGPart6.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XCGPart6.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xcg part6.
	*
	* @param id the ID of this vr technical spec_xcg part6
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XCGPart6.setId(id);
	}

	/**
	* Sets the modify date of this vr technical spec_xcg part6.
	*
	* @param modifyDate the modify date of this vr technical spec_xcg part6
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XCGPart6.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xcg part6.
	*
	* @param mtCore the mt core of this vr technical spec_xcg part6
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XCGPart6.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XCGPart6.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xcg part6.
	*
	* @param primaryKey the primary key of this vr technical spec_xcg part6
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XCGPart6.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XCGPart6.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xcg part6.
	*
	* @param referenceUid the reference uid of this vr technical spec_xcg part6
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XCGPart6.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xcg part6.
	*
	* @param syncDate the sync date of this vr technical spec_xcg part6
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XCGPart6.setSyncDate(syncDate);
	}

	/**
	* Sets the tdtkxcg001 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG001 the tdtkxcg001 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG001(java.lang.String TDTKXCG001) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG001(TDTKXCG001);
	}

	/**
	* Sets the tdtkxcg002 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG002 the tdtkxcg002 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG002(java.lang.String TDTKXCG002) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG002(TDTKXCG002);
	}

	/**
	* Sets the tdtkxcg003 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG003 the tdtkxcg003 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG003(java.lang.String TDTKXCG003) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG003(TDTKXCG003);
	}

	/**
	* Sets the tdtkxcg004 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG004 the tdtkxcg004 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG004(java.lang.String TDTKXCG004) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG004(TDTKXCG004);
	}

	/**
	* Sets the tdtkxcg005 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG005 the tdtkxcg005 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG005(java.lang.String TDTKXCG005) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG005(TDTKXCG005);
	}

	/**
	* Sets the tdtkxcg006 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG006 the tdtkxcg006 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG006(java.lang.String TDTKXCG006) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG006(TDTKXCG006);
	}

	/**
	* Sets the tdtkxcg007 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG007 the tdtkxcg007 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG007(java.lang.String TDTKXCG007) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG007(TDTKXCG007);
	}

	/**
	* Sets the tdtkxcg008 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG008 the tdtkxcg008 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG008(java.lang.String TDTKXCG008) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG008(TDTKXCG008);
	}

	/**
	* Sets the tdtkxcg009 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG009 the tdtkxcg009 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG009(java.lang.String TDTKXCG009) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG009(TDTKXCG009);
	}

	/**
	* Sets the tdtkxcg010 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG010 the tdtkxcg010 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG010(java.lang.String TDTKXCG010) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG010(TDTKXCG010);
	}

	/**
	* Sets the tdtkxcg011 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG011 the tdtkxcg011 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG011(java.lang.String TDTKXCG011) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG011(TDTKXCG011);
	}

	/**
	* Sets the tdtkxcg012 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG012 the tdtkxcg012 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG012(java.lang.String TDTKXCG012) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG012(TDTKXCG012);
	}

	/**
	* Sets the tdtkxcg013 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG013 the tdtkxcg013 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG013(java.lang.String TDTKXCG013) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG013(TDTKXCG013);
	}

	/**
	* Sets the tdtkxcg014 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG014 the tdtkxcg014 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG014(java.lang.String TDTKXCG014) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG014(TDTKXCG014);
	}

	/**
	* Sets the tdtkxcg015 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG015 the tdtkxcg015 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG015(java.lang.String TDTKXCG015) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG015(TDTKXCG015);
	}

	/**
	* Sets the tdtkxcg016 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG016 the tdtkxcg016 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG016(java.lang.String TDTKXCG016) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG016(TDTKXCG016);
	}

	/**
	* Sets the tdtkxcg017 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG017 the tdtkxcg017 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG017(java.lang.String TDTKXCG017) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG017(TDTKXCG017);
	}

	/**
	* Sets the tdtkxcg018 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG018 the tdtkxcg018 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG018(java.lang.String TDTKXCG018) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG018(TDTKXCG018);
	}

	/**
	* Sets the tdtkxcg019 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG019 the tdtkxcg019 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG019(java.lang.String TDTKXCG019) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG019(TDTKXCG019);
	}

	/**
	* Sets the tdtkxcg020 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG020 the tdtkxcg020 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG020(java.lang.String TDTKXCG020) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG020(TDTKXCG020);
	}

	/**
	* Sets the tdtkxcg021 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG021 the tdtkxcg021 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG021(java.lang.String TDTKXCG021) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG021(TDTKXCG021);
	}

	/**
	* Sets the tdtkxcg022 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG022 the tdtkxcg022 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG022(java.lang.String TDTKXCG022) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG022(TDTKXCG022);
	}

	/**
	* Sets the tdtkxcg023 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG023 the tdtkxcg023 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG023(java.lang.String TDTKXCG023) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG023(TDTKXCG023);
	}

	/**
	* Sets the tdtkxcg024 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG024 the tdtkxcg024 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG024(java.lang.String TDTKXCG024) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG024(TDTKXCG024);
	}

	/**
	* Sets the tdtkxcg025 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG025 the tdtkxcg025 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG025(java.lang.String TDTKXCG025) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG025(TDTKXCG025);
	}

	/**
	* Sets the tdtkxcg026 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG026 the tdtkxcg026 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG026(java.lang.String TDTKXCG026) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG026(TDTKXCG026);
	}

	/**
	* Sets the tdtkxcg027 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG027 the tdtkxcg027 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG027(java.lang.String TDTKXCG027) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG027(TDTKXCG027);
	}

	/**
	* Sets the tdtkxcg028 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG028 the tdtkxcg028 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG028(java.lang.String TDTKXCG028) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG028(TDTKXCG028);
	}

	/**
	* Sets the tdtkxcg029 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG029 the tdtkxcg029 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG029(java.lang.String TDTKXCG029) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG029(TDTKXCG029);
	}

	/**
	* Sets the tdtkxcg030 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG030 the tdtkxcg030 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG030(java.lang.String TDTKXCG030) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG030(TDTKXCG030);
	}

	/**
	* Sets the tdtkxcg031 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG031 the tdtkxcg031 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG031(java.lang.String TDTKXCG031) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG031(TDTKXCG031);
	}

	/**
	* Sets the tdtkxcg032 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG032 the tdtkxcg032 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG032(java.lang.String TDTKXCG032) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG032(TDTKXCG032);
	}

	/**
	* Sets the tdtkxcg033 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG033 the tdtkxcg033 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG033(java.lang.String TDTKXCG033) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG033(TDTKXCG033);
	}

	/**
	* Sets the tdtkxcg034 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG034 the tdtkxcg034 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG034(java.lang.String TDTKXCG034) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG034(TDTKXCG034);
	}

	/**
	* Sets the tdtkxcg035 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG035 the tdtkxcg035 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG035(java.lang.String TDTKXCG035) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG035(TDTKXCG035);
	}

	/**
	* Sets the tdtkxcg036 of this vr technical spec_xcg part6.
	*
	* @param TDTKXCG036 the tdtkxcg036 of this vr technical spec_xcg part6
	*/
	@Override
	public void setTDTKXCG036(java.lang.String TDTKXCG036) {
		_vrTechnicalSpec_XCGPart6.setTDTKXCG036(TDTKXCG036);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xcg part6.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xcg part6
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XCGPart6.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xcg01757 of this vr technical spec_xcg part6.
	*
	* @param XCG01757 the xcg01757 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01757(java.lang.String XCG01757) {
		_vrTechnicalSpec_XCGPart6.setXCG01757(XCG01757);
	}

	/**
	* Sets the xcg01758 of this vr technical spec_xcg part6.
	*
	* @param XCG01758 the xcg01758 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01758(java.lang.String XCG01758) {
		_vrTechnicalSpec_XCGPart6.setXCG01758(XCG01758);
	}

	/**
	* Sets the xcg01759 of this vr technical spec_xcg part6.
	*
	* @param XCG01759 the xcg01759 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01759(java.lang.String XCG01759) {
		_vrTechnicalSpec_XCGPart6.setXCG01759(XCG01759);
	}

	/**
	* Sets the xcg01760 of this vr technical spec_xcg part6.
	*
	* @param XCG01760 the xcg01760 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01760(java.lang.String XCG01760) {
		_vrTechnicalSpec_XCGPart6.setXCG01760(XCG01760);
	}

	/**
	* Sets the xcg01761 of this vr technical spec_xcg part6.
	*
	* @param XCG01761 the xcg01761 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01761(java.lang.String XCG01761) {
		_vrTechnicalSpec_XCGPart6.setXCG01761(XCG01761);
	}

	/**
	* Sets the xcg01762 of this vr technical spec_xcg part6.
	*
	* @param XCG01762 the xcg01762 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01762(java.lang.String XCG01762) {
		_vrTechnicalSpec_XCGPart6.setXCG01762(XCG01762);
	}

	/**
	* Sets the xcg01763 of this vr technical spec_xcg part6.
	*
	* @param XCG01763 the xcg01763 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01763(java.lang.String XCG01763) {
		_vrTechnicalSpec_XCGPart6.setXCG01763(XCG01763);
	}

	/**
	* Sets the xcg01764 of this vr technical spec_xcg part6.
	*
	* @param XCG01764 the xcg01764 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01764(java.lang.String XCG01764) {
		_vrTechnicalSpec_XCGPart6.setXCG01764(XCG01764);
	}

	/**
	* Sets the xcg01765 of this vr technical spec_xcg part6.
	*
	* @param XCG01765 the xcg01765 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01765(java.lang.String XCG01765) {
		_vrTechnicalSpec_XCGPart6.setXCG01765(XCG01765);
	}

	/**
	* Sets the xcg01766 of this vr technical spec_xcg part6.
	*
	* @param XCG01766 the xcg01766 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01766(java.lang.String XCG01766) {
		_vrTechnicalSpec_XCGPart6.setXCG01766(XCG01766);
	}

	/**
	* Sets the xcg01767 of this vr technical spec_xcg part6.
	*
	* @param XCG01767 the xcg01767 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01767(java.lang.String XCG01767) {
		_vrTechnicalSpec_XCGPart6.setXCG01767(XCG01767);
	}

	/**
	* Sets the xcg01768 of this vr technical spec_xcg part6.
	*
	* @param XCG01768 the xcg01768 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01768(java.lang.String XCG01768) {
		_vrTechnicalSpec_XCGPart6.setXCG01768(XCG01768);
	}

	/**
	* Sets the xcg01769 of this vr technical spec_xcg part6.
	*
	* @param XCG01769 the xcg01769 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01769(java.lang.String XCG01769) {
		_vrTechnicalSpec_XCGPart6.setXCG01769(XCG01769);
	}

	/**
	* Sets the xcg01770 of this vr technical spec_xcg part6.
	*
	* @param XCG01770 the xcg01770 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01770(java.lang.String XCG01770) {
		_vrTechnicalSpec_XCGPart6.setXCG01770(XCG01770);
	}

	/**
	* Sets the xcg01771 of this vr technical spec_xcg part6.
	*
	* @param XCG01771 the xcg01771 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01771(java.lang.String XCG01771) {
		_vrTechnicalSpec_XCGPart6.setXCG01771(XCG01771);
	}

	/**
	* Sets the xcg01772 of this vr technical spec_xcg part6.
	*
	* @param XCG01772 the xcg01772 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01772(java.lang.String XCG01772) {
		_vrTechnicalSpec_XCGPart6.setXCG01772(XCG01772);
	}

	/**
	* Sets the xcg01773 of this vr technical spec_xcg part6.
	*
	* @param XCG01773 the xcg01773 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01773(java.lang.String XCG01773) {
		_vrTechnicalSpec_XCGPart6.setXCG01773(XCG01773);
	}

	/**
	* Sets the xcg01774 of this vr technical spec_xcg part6.
	*
	* @param XCG01774 the xcg01774 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01774(java.lang.String XCG01774) {
		_vrTechnicalSpec_XCGPart6.setXCG01774(XCG01774);
	}

	/**
	* Sets the xcg01775 of this vr technical spec_xcg part6.
	*
	* @param XCG01775 the xcg01775 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01775(java.lang.String XCG01775) {
		_vrTechnicalSpec_XCGPart6.setXCG01775(XCG01775);
	}

	/**
	* Sets the xcg01776 of this vr technical spec_xcg part6.
	*
	* @param XCG01776 the xcg01776 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01776(java.lang.String XCG01776) {
		_vrTechnicalSpec_XCGPart6.setXCG01776(XCG01776);
	}

	/**
	* Sets the xcg01777 of this vr technical spec_xcg part6.
	*
	* @param XCG01777 the xcg01777 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01777(java.lang.String XCG01777) {
		_vrTechnicalSpec_XCGPart6.setXCG01777(XCG01777);
	}

	/**
	* Sets the xcg01778 of this vr technical spec_xcg part6.
	*
	* @param XCG01778 the xcg01778 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01778(java.lang.String XCG01778) {
		_vrTechnicalSpec_XCGPart6.setXCG01778(XCG01778);
	}

	/**
	* Sets the xcg01779 of this vr technical spec_xcg part6.
	*
	* @param XCG01779 the xcg01779 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01779(java.lang.String XCG01779) {
		_vrTechnicalSpec_XCGPart6.setXCG01779(XCG01779);
	}

	/**
	* Sets the xcg01780 of this vr technical spec_xcg part6.
	*
	* @param XCG01780 the xcg01780 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01780(java.lang.String XCG01780) {
		_vrTechnicalSpec_XCGPart6.setXCG01780(XCG01780);
	}

	/**
	* Sets the xcg01781 of this vr technical spec_xcg part6.
	*
	* @param XCG01781 the xcg01781 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01781(java.lang.String XCG01781) {
		_vrTechnicalSpec_XCGPart6.setXCG01781(XCG01781);
	}

	/**
	* Sets the xcg01783 of this vr technical spec_xcg part6.
	*
	* @param XCG01783 the xcg01783 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01783(java.lang.String XCG01783) {
		_vrTechnicalSpec_XCGPart6.setXCG01783(XCG01783);
	}

	/**
	* Sets the xcg01785 of this vr technical spec_xcg part6.
	*
	* @param XCG01785 the xcg01785 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01785(java.lang.String XCG01785) {
		_vrTechnicalSpec_XCGPart6.setXCG01785(XCG01785);
	}

	/**
	* Sets the xcg01786 of this vr technical spec_xcg part6.
	*
	* @param XCG01786 the xcg01786 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01786(java.lang.String XCG01786) {
		_vrTechnicalSpec_XCGPart6.setXCG01786(XCG01786);
	}

	/**
	* Sets the xcg01787 of this vr technical spec_xcg part6.
	*
	* @param XCG01787 the xcg01787 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01787(java.lang.String XCG01787) {
		_vrTechnicalSpec_XCGPart6.setXCG01787(XCG01787);
	}

	/**
	* Sets the xcg01788 of this vr technical spec_xcg part6.
	*
	* @param XCG01788 the xcg01788 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01788(java.lang.String XCG01788) {
		_vrTechnicalSpec_XCGPart6.setXCG01788(XCG01788);
	}

	/**
	* Sets the xcg01789 of this vr technical spec_xcg part6.
	*
	* @param XCG01789 the xcg01789 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01789(java.lang.String XCG01789) {
		_vrTechnicalSpec_XCGPart6.setXCG01789(XCG01789);
	}

	/**
	* Sets the xcg01790 of this vr technical spec_xcg part6.
	*
	* @param XCG01790 the xcg01790 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01790(java.lang.String XCG01790) {
		_vrTechnicalSpec_XCGPart6.setXCG01790(XCG01790);
	}

	/**
	* Sets the xcg01791 of this vr technical spec_xcg part6.
	*
	* @param XCG01791 the xcg01791 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01791(java.lang.String XCG01791) {
		_vrTechnicalSpec_XCGPart6.setXCG01791(XCG01791);
	}

	/**
	* Sets the xcg01792 of this vr technical spec_xcg part6.
	*
	* @param XCG01792 the xcg01792 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01792(java.lang.String XCG01792) {
		_vrTechnicalSpec_XCGPart6.setXCG01792(XCG01792);
	}

	/**
	* Sets the xcg01793 of this vr technical spec_xcg part6.
	*
	* @param XCG01793 the xcg01793 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01793(java.lang.String XCG01793) {
		_vrTechnicalSpec_XCGPart6.setXCG01793(XCG01793);
	}

	/**
	* Sets the xcg01794 of this vr technical spec_xcg part6.
	*
	* @param XCG01794 the xcg01794 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01794(java.lang.String XCG01794) {
		_vrTechnicalSpec_XCGPart6.setXCG01794(XCG01794);
	}

	/**
	* Sets the xcg01795 of this vr technical spec_xcg part6.
	*
	* @param XCG01795 the xcg01795 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01795(java.lang.String XCG01795) {
		_vrTechnicalSpec_XCGPart6.setXCG01795(XCG01795);
	}

	/**
	* Sets the xcg01796 of this vr technical spec_xcg part6.
	*
	* @param XCG01796 the xcg01796 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01796(java.lang.String XCG01796) {
		_vrTechnicalSpec_XCGPart6.setXCG01796(XCG01796);
	}

	/**
	* Sets the xcg01797 of this vr technical spec_xcg part6.
	*
	* @param XCG01797 the xcg01797 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01797(java.lang.String XCG01797) {
		_vrTechnicalSpec_XCGPart6.setXCG01797(XCG01797);
	}

	/**
	* Sets the xcg01798 of this vr technical spec_xcg part6.
	*
	* @param XCG01798 the xcg01798 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01798(java.lang.String XCG01798) {
		_vrTechnicalSpec_XCGPart6.setXCG01798(XCG01798);
	}

	/**
	* Sets the xcg01799 of this vr technical spec_xcg part6.
	*
	* @param XCG01799 the xcg01799 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01799(java.lang.String XCG01799) {
		_vrTechnicalSpec_XCGPart6.setXCG01799(XCG01799);
	}

	/**
	* Sets the xcg01801 of this vr technical spec_xcg part6.
	*
	* @param XCG01801 the xcg01801 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01801(java.lang.String XCG01801) {
		_vrTechnicalSpec_XCGPart6.setXCG01801(XCG01801);
	}

	/**
	* Sets the xcg01802 of this vr technical spec_xcg part6.
	*
	* @param XCG01802 the xcg01802 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01802(java.lang.String XCG01802) {
		_vrTechnicalSpec_XCGPart6.setXCG01802(XCG01802);
	}

	/**
	* Sets the xcg01803 of this vr technical spec_xcg part6.
	*
	* @param XCG01803 the xcg01803 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01803(java.lang.String XCG01803) {
		_vrTechnicalSpec_XCGPart6.setXCG01803(XCG01803);
	}

	/**
	* Sets the xcg01804 of this vr technical spec_xcg part6.
	*
	* @param XCG01804 the xcg01804 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01804(java.lang.String XCG01804) {
		_vrTechnicalSpec_XCGPart6.setXCG01804(XCG01804);
	}

	/**
	* Sets the xcg01805 of this vr technical spec_xcg part6.
	*
	* @param XCG01805 the xcg01805 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01805(java.lang.String XCG01805) {
		_vrTechnicalSpec_XCGPart6.setXCG01805(XCG01805);
	}

	/**
	* Sets the xcg01806 of this vr technical spec_xcg part6.
	*
	* @param XCG01806 the xcg01806 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01806(java.lang.String XCG01806) {
		_vrTechnicalSpec_XCGPart6.setXCG01806(XCG01806);
	}

	/**
	* Sets the xcg01807 of this vr technical spec_xcg part6.
	*
	* @param XCG01807 the xcg01807 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01807(java.lang.String XCG01807) {
		_vrTechnicalSpec_XCGPart6.setXCG01807(XCG01807);
	}

	/**
	* Sets the xcg01808 of this vr technical spec_xcg part6.
	*
	* @param XCG01808 the xcg01808 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01808(java.lang.String XCG01808) {
		_vrTechnicalSpec_XCGPart6.setXCG01808(XCG01808);
	}

	/**
	* Sets the xcg01809 of this vr technical spec_xcg part6.
	*
	* @param XCG01809 the xcg01809 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01809(java.lang.String XCG01809) {
		_vrTechnicalSpec_XCGPart6.setXCG01809(XCG01809);
	}

	/**
	* Sets the xcg01810 of this vr technical spec_xcg part6.
	*
	* @param XCG01810 the xcg01810 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01810(java.lang.String XCG01810) {
		_vrTechnicalSpec_XCGPart6.setXCG01810(XCG01810);
	}

	/**
	* Sets the xcg01811 of this vr technical spec_xcg part6.
	*
	* @param XCG01811 the xcg01811 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01811(java.lang.String XCG01811) {
		_vrTechnicalSpec_XCGPart6.setXCG01811(XCG01811);
	}

	/**
	* Sets the xcg01812 of this vr technical spec_xcg part6.
	*
	* @param XCG01812 the xcg01812 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01812(java.lang.String XCG01812) {
		_vrTechnicalSpec_XCGPart6.setXCG01812(XCG01812);
	}

	/**
	* Sets the xcg01813 of this vr technical spec_xcg part6.
	*
	* @param XCG01813 the xcg01813 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01813(java.lang.String XCG01813) {
		_vrTechnicalSpec_XCGPart6.setXCG01813(XCG01813);
	}

	/**
	* Sets the xcg01814 of this vr technical spec_xcg part6.
	*
	* @param XCG01814 the xcg01814 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01814(java.lang.String XCG01814) {
		_vrTechnicalSpec_XCGPart6.setXCG01814(XCG01814);
	}

	/**
	* Sets the xcg01948 of this vr technical spec_xcg part6.
	*
	* @param XCG01948 the xcg01948 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01948(java.lang.String XCG01948) {
		_vrTechnicalSpec_XCGPart6.setXCG01948(XCG01948);
	}

	/**
	* Sets the xcg01949 of this vr technical spec_xcg part6.
	*
	* @param XCG01949 the xcg01949 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01949(java.lang.String XCG01949) {
		_vrTechnicalSpec_XCGPart6.setXCG01949(XCG01949);
	}

	/**
	* Sets the xcg01950 of this vr technical spec_xcg part6.
	*
	* @param XCG01950 the xcg01950 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01950(java.lang.String XCG01950) {
		_vrTechnicalSpec_XCGPart6.setXCG01950(XCG01950);
	}

	/**
	* Sets the xcg01951 of this vr technical spec_xcg part6.
	*
	* @param XCG01951 the xcg01951 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01951(java.lang.String XCG01951) {
		_vrTechnicalSpec_XCGPart6.setXCG01951(XCG01951);
	}

	/**
	* Sets the xcg01952 of this vr technical spec_xcg part6.
	*
	* @param XCG01952 the xcg01952 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01952(java.lang.String XCG01952) {
		_vrTechnicalSpec_XCGPart6.setXCG01952(XCG01952);
	}

	/**
	* Sets the xcg01953 of this vr technical spec_xcg part6.
	*
	* @param XCG01953 the xcg01953 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01953(java.lang.String XCG01953) {
		_vrTechnicalSpec_XCGPart6.setXCG01953(XCG01953);
	}

	/**
	* Sets the xcg01954 of this vr technical spec_xcg part6.
	*
	* @param XCG01954 the xcg01954 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01954(java.lang.String XCG01954) {
		_vrTechnicalSpec_XCGPart6.setXCG01954(XCG01954);
	}

	/**
	* Sets the xcg01955 of this vr technical spec_xcg part6.
	*
	* @param XCG01955 the xcg01955 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01955(java.lang.String XCG01955) {
		_vrTechnicalSpec_XCGPart6.setXCG01955(XCG01955);
	}

	/**
	* Sets the xcg01956 of this vr technical spec_xcg part6.
	*
	* @param XCG01956 the xcg01956 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01956(java.lang.String XCG01956) {
		_vrTechnicalSpec_XCGPart6.setXCG01956(XCG01956);
	}

	/**
	* Sets the xcg01957 of this vr technical spec_xcg part6.
	*
	* @param XCG01957 the xcg01957 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01957(java.lang.String XCG01957) {
		_vrTechnicalSpec_XCGPart6.setXCG01957(XCG01957);
	}

	/**
	* Sets the xcg01958 of this vr technical spec_xcg part6.
	*
	* @param XCG01958 the xcg01958 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01958(java.lang.String XCG01958) {
		_vrTechnicalSpec_XCGPart6.setXCG01958(XCG01958);
	}

	/**
	* Sets the xcg01959 of this vr technical spec_xcg part6.
	*
	* @param XCG01959 the xcg01959 of this vr technical spec_xcg part6
	*/
	@Override
	public void setXCG01959(java.lang.String XCG01959) {
		_vrTechnicalSpec_XCGPart6.setXCG01959(XCG01959);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGPart6Wrapper)) {
			return false;
		}

		VRTechnicalSpec_XCGPart6Wrapper vrTechnicalSpec_XCGPart6Wrapper = (VRTechnicalSpec_XCGPart6Wrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XCGPart6,
					vrTechnicalSpec_XCGPart6Wrapper._vrTechnicalSpec_XCGPart6)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XCGPart6 getWrappedModel() {
		return _vrTechnicalSpec_XCGPart6;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XCGPart6.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XCGPart6.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XCGPart6.resetOriginalValues();
	}

	private final VRTechnicalSpec_XCGPart6 _vrTechnicalSpec_XCGPart6;
}