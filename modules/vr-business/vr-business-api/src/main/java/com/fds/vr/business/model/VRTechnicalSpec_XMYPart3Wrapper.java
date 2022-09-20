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
 * This class is a wrapper for {@link VRTechnicalSpec_XMYPart3}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XMYPart3
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XMYPart3Wrapper implements VRTechnicalSpec_XMYPart3,
	ModelWrapper<VRTechnicalSpec_XMYPart3> {
	public VRTechnicalSpec_XMYPart3Wrapper(
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3) {
		_vrTechnicalSpec_XMYPart3 = vrTechnicalSpec_XMYPart3;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XMYPart3.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XMYPart3.class.getName();
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
		attributes.put("XMY0149", getXMY0149());
		attributes.put("XMY0150", getXMY0150());
		attributes.put("XMY0151", getXMY0151());
		attributes.put("XMY0152", getXMY0152());
		attributes.put("XMY0153", getXMY0153());
		attributes.put("XMY0154", getXMY0154());
		attributes.put("XMY0155", getXMY0155());
		attributes.put("XMY0156", getXMY0156());
		attributes.put("XMY0157", getXMY0157());
		attributes.put("XMY0158", getXMY0158());
		attributes.put("XMY0159", getXMY0159());
		attributes.put("XMY0160", getXMY0160());
		attributes.put("XMY0161", getXMY0161());
		attributes.put("XMY0162", getXMY0162());
		attributes.put("XMY0163", getXMY0163());
		attributes.put("XMY0164", getXMY0164());
		attributes.put("XMY0165", getXMY0165());
		attributes.put("XMY0166", getXMY0166());
		attributes.put("XMY0167", getXMY0167());
		attributes.put("XMY0168", getXMY0168());
		attributes.put("XMY0169", getXMY0169());
		attributes.put("XMY0170", getXMY0170());
		attributes.put("XMY0171", getXMY0171());
		attributes.put("XMY0172", getXMY0172());
		attributes.put("XMY0173", getXMY0173());
		attributes.put("XMY0174", getXMY0174());
		attributes.put("XMY0175", getXMY0175());
		attributes.put("XMY0176", getXMY0176());
		attributes.put("XMY0177", getXMY0177());
		attributes.put("XMY0178", getXMY0178());
		attributes.put("XMY0179", getXMY0179());
		attributes.put("XMY0180", getXMY0180());
		attributes.put("XMY0181", getXMY0181());
		attributes.put("XMY0182", getXMY0182());
		attributes.put("XMY0183", getXMY0183());
		attributes.put("XMY0184", getXMY0184());
		attributes.put("XMY0185", getXMY0185());
		attributes.put("XMY0186", getXMY0186());
		attributes.put("XMY0187", getXMY0187());
		attributes.put("XMY0188", getXMY0188());
		attributes.put("XMY0189", getXMY0189());
		attributes.put("XMY0190", getXMY0190());
		attributes.put("XMY0191", getXMY0191());
		attributes.put("XMY0192", getXMY0192());
		attributes.put("XMY0193", getXMY0193());
		attributes.put("XMY0194", getXMY0194());
		attributes.put("XMY0195", getXMY0195());
		attributes.put("XMY0196", getXMY0196());
		attributes.put("XMY0197", getXMY0197());
		attributes.put("XMY0198", getXMY0198());
		attributes.put("XMY0199", getXMY0199());
		attributes.put("XMY0200", getXMY0200());
		attributes.put("XMY0201", getXMY0201());
		attributes.put("XMY0202", getXMY0202());
		attributes.put("XMY0203", getXMY0203());
		attributes.put("XMY0204", getXMY0204());
		attributes.put("XMY0205", getXMY0205());
		attributes.put("XMY0207", getXMY0207());
		attributes.put("XMY0208", getXMY0208());
		attributes.put("XMY0209", getXMY0209());
		attributes.put("XMY0210", getXMY0210());
		attributes.put("XMY0211", getXMY0211());
		attributes.put("XMY0212", getXMY0212());
		attributes.put("XMY0213", getXMY0213());
		attributes.put("XMY0214", getXMY0214());
		attributes.put("XMY0215", getXMY0215());
		attributes.put("XMY0216", getXMY0216());
		attributes.put("XMY0217", getXMY0217());
		attributes.put("XMY0218", getXMY0218());
		attributes.put("XMY0219", getXMY0219());
		attributes.put("XMY0220", getXMY0220());
		attributes.put("XMY0221", getXMY0221());
		attributes.put("XMY0222", getXMY0222());
		attributes.put("XMY0223", getXMY0223());
		attributes.put("XMY0224", getXMY0224());
		attributes.put("XMY0225", getXMY0225());
		attributes.put("XMY0226", getXMY0226());
		attributes.put("XMY0227", getXMY0227());
		attributes.put("XMY0228", getXMY0228());
		attributes.put("XMY0229", getXMY0229());
		attributes.put("XMY0230", getXMY0230());
		attributes.put("XMY0231", getXMY0231());
		attributes.put("XMY0232", getXMY0232());
		attributes.put("XMY0233", getXMY0233());
		attributes.put("XMY0234", getXMY0234());
		attributes.put("XMY0235", getXMY0235());
		attributes.put("XMY0236", getXMY0236());
		attributes.put("XMY0237", getXMY0237());
		attributes.put("XMY0238", getXMY0238());
		attributes.put("XMY0239", getXMY0239());
		attributes.put("XMY0240", getXMY0240());
		attributes.put("XMY0241", getXMY0241());
		attributes.put("XMY0242", getXMY0242());
		attributes.put("XMY0243", getXMY0243());
		attributes.put("XMY0244", getXMY0244());
		attributes.put("XMY0245", getXMY0245());
		attributes.put("XMY0246", getXMY0246());
		attributes.put("XMY0247", getXMY0247());
		attributes.put("XMY0248", getXMY0248());
		attributes.put("XMY0249", getXMY0249());
		attributes.put("XMY0250", getXMY0250());
		attributes.put("XMY0251", getXMY0251());
		attributes.put("XMY0252", getXMY0252());
		attributes.put("XMY0253", getXMY0253());
		attributes.put("XMY0254", getXMY0254());
		attributes.put("XMY0255", getXMY0255());
		attributes.put("XMY0256", getXMY0256());
		attributes.put("XMY0257", getXMY0257());
		attributes.put("XMY0258", getXMY0258());
		attributes.put("XMY0259", getXMY0259());
		attributes.put("XMY0260", getXMY0260());
		attributes.put("XMY0261", getXMY0261());
		attributes.put("XMY0262", getXMY0262());
		attributes.put("XMY0263", getXMY0263());
		attributes.put("XMY0264", getXMY0264());
		attributes.put("BBCNCLKLXMY001", getBBCNCLKLXMY001());
		attributes.put("BBCNCLKLXMY002", getBBCNCLKLXMY002());
		attributes.put("BBCNCLKLXMY003", getBBCNCLKLXMY003());
		attributes.put("BBCNCLKLXMY004", getBBCNCLKLXMY004());
		attributes.put("BBCNCLKLXMY005", getBBCNCLKLXMY005());
		attributes.put("BBCNCLKLXMY006", getBBCNCLKLXMY006());
		attributes.put("BBCNCLKLXMY012", getBBCNCLKLXMY012());
		attributes.put("BBCNCLKLXMY013", getBBCNCLKLXMY013());
		attributes.put("BBCNCLKLXMY014", getBBCNCLKLXMY014());
		attributes.put("BBCNCLKLXMY015", getBBCNCLKLXMY015());
		attributes.put("BBCNCLKLXMY016", getBBCNCLKLXMY016());
		attributes.put("BBCNCLKLXMY017", getBBCNCLKLXMY017());
		attributes.put("BBCNCLKLXMY018", getBBCNCLKLXMY018());
		attributes.put("BBCNCLKLXMY019", getBBCNCLKLXMY019());
		attributes.put("BBCNCLKLXMY020", getBBCNCLKLXMY020());
		attributes.put("BBCNCLKLXMY021", getBBCNCLKLXMY021());
		attributes.put("BBCNCLKLXMY022", getBBCNCLKLXMY022());
		attributes.put("BBCNCLKLXMY024", getBBCNCLKLXMY024());
		attributes.put("BBCNCLKLXMY026", getBBCNCLKLXMY026());
		attributes.put("BBCNCLKLXMY027", getBBCNCLKLXMY027());
		attributes.put("BBCNCLKLXMY028", getBBCNCLKLXMY028());
		attributes.put("BBCNCLKLXMY029", getBBCNCLKLXMY029());
		attributes.put("BBCNCLKLXMY033", getBBCNCLKLXMY033());
		attributes.put("BBCNCLKLXMY034", getBBCNCLKLXMY034());
		attributes.put("BBCNCLKLXMY037", getBBCNCLKLXMY037());
		attributes.put("BBCNCLKLXMY038", getBBCNCLKLXMY038());
		attributes.put("BBCNCLKLXMY039", getBBCNCLKLXMY039());
		attributes.put("BBCNCLKLXMY040", getBBCNCLKLXMY040());
		attributes.put("BBCNCLKLXMY041", getBBCNCLKLXMY041());
		attributes.put("BBCNCLKLXMY042", getBBCNCLKLXMY042());
		attributes.put("BBCNCLKLXMY043", getBBCNCLKLXMY043());
		attributes.put("BBCNCLKLXMY044", getBBCNCLKLXMY044());
		attributes.put("BBCNCLKLXMY045", getBBCNCLKLXMY045());
		attributes.put("BBCNCLKLXDD030", getBBCNCLKLXDD030());
		attributes.put("BBCNCLKLXMY046", getBBCNCLKLXMY046());
		attributes.put("BBCNCLKLXMY047", getBBCNCLKLXMY047());
		attributes.put("BBCNCLKLXMY053", getBBCNCLKLXMY053());
		attributes.put("BBCNCLKLXMY054", getBBCNCLKLXMY054());
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

		String XMY0149 = (String)attributes.get("XMY0149");

		if (XMY0149 != null) {
			setXMY0149(XMY0149);
		}

		String XMY0150 = (String)attributes.get("XMY0150");

		if (XMY0150 != null) {
			setXMY0150(XMY0150);
		}

		String XMY0151 = (String)attributes.get("XMY0151");

		if (XMY0151 != null) {
			setXMY0151(XMY0151);
		}

		String XMY0152 = (String)attributes.get("XMY0152");

		if (XMY0152 != null) {
			setXMY0152(XMY0152);
		}

		String XMY0153 = (String)attributes.get("XMY0153");

		if (XMY0153 != null) {
			setXMY0153(XMY0153);
		}

		String XMY0154 = (String)attributes.get("XMY0154");

		if (XMY0154 != null) {
			setXMY0154(XMY0154);
		}

		String XMY0155 = (String)attributes.get("XMY0155");

		if (XMY0155 != null) {
			setXMY0155(XMY0155);
		}

		String XMY0156 = (String)attributes.get("XMY0156");

		if (XMY0156 != null) {
			setXMY0156(XMY0156);
		}

		String XMY0157 = (String)attributes.get("XMY0157");

		if (XMY0157 != null) {
			setXMY0157(XMY0157);
		}

		String XMY0158 = (String)attributes.get("XMY0158");

		if (XMY0158 != null) {
			setXMY0158(XMY0158);
		}

		String XMY0159 = (String)attributes.get("XMY0159");

		if (XMY0159 != null) {
			setXMY0159(XMY0159);
		}

		String XMY0160 = (String)attributes.get("XMY0160");

		if (XMY0160 != null) {
			setXMY0160(XMY0160);
		}

		String XMY0161 = (String)attributes.get("XMY0161");

		if (XMY0161 != null) {
			setXMY0161(XMY0161);
		}

		String XMY0162 = (String)attributes.get("XMY0162");

		if (XMY0162 != null) {
			setXMY0162(XMY0162);
		}

		String XMY0163 = (String)attributes.get("XMY0163");

		if (XMY0163 != null) {
			setXMY0163(XMY0163);
		}

		String XMY0164 = (String)attributes.get("XMY0164");

		if (XMY0164 != null) {
			setXMY0164(XMY0164);
		}

		String XMY0165 = (String)attributes.get("XMY0165");

		if (XMY0165 != null) {
			setXMY0165(XMY0165);
		}

		String XMY0166 = (String)attributes.get("XMY0166");

		if (XMY0166 != null) {
			setXMY0166(XMY0166);
		}

		String XMY0167 = (String)attributes.get("XMY0167");

		if (XMY0167 != null) {
			setXMY0167(XMY0167);
		}

		String XMY0168 = (String)attributes.get("XMY0168");

		if (XMY0168 != null) {
			setXMY0168(XMY0168);
		}

		String XMY0169 = (String)attributes.get("XMY0169");

		if (XMY0169 != null) {
			setXMY0169(XMY0169);
		}

		String XMY0170 = (String)attributes.get("XMY0170");

		if (XMY0170 != null) {
			setXMY0170(XMY0170);
		}

		String XMY0171 = (String)attributes.get("XMY0171");

		if (XMY0171 != null) {
			setXMY0171(XMY0171);
		}

		String XMY0172 = (String)attributes.get("XMY0172");

		if (XMY0172 != null) {
			setXMY0172(XMY0172);
		}

		String XMY0173 = (String)attributes.get("XMY0173");

		if (XMY0173 != null) {
			setXMY0173(XMY0173);
		}

		String XMY0174 = (String)attributes.get("XMY0174");

		if (XMY0174 != null) {
			setXMY0174(XMY0174);
		}

		String XMY0175 = (String)attributes.get("XMY0175");

		if (XMY0175 != null) {
			setXMY0175(XMY0175);
		}

		String XMY0176 = (String)attributes.get("XMY0176");

		if (XMY0176 != null) {
			setXMY0176(XMY0176);
		}

		String XMY0177 = (String)attributes.get("XMY0177");

		if (XMY0177 != null) {
			setXMY0177(XMY0177);
		}

		String XMY0178 = (String)attributes.get("XMY0178");

		if (XMY0178 != null) {
			setXMY0178(XMY0178);
		}

		String XMY0179 = (String)attributes.get("XMY0179");

		if (XMY0179 != null) {
			setXMY0179(XMY0179);
		}

		String XMY0180 = (String)attributes.get("XMY0180");

		if (XMY0180 != null) {
			setXMY0180(XMY0180);
		}

		String XMY0181 = (String)attributes.get("XMY0181");

		if (XMY0181 != null) {
			setXMY0181(XMY0181);
		}

		String XMY0182 = (String)attributes.get("XMY0182");

		if (XMY0182 != null) {
			setXMY0182(XMY0182);
		}

		String XMY0183 = (String)attributes.get("XMY0183");

		if (XMY0183 != null) {
			setXMY0183(XMY0183);
		}

		String XMY0184 = (String)attributes.get("XMY0184");

		if (XMY0184 != null) {
			setXMY0184(XMY0184);
		}

		String XMY0185 = (String)attributes.get("XMY0185");

		if (XMY0185 != null) {
			setXMY0185(XMY0185);
		}

		String XMY0186 = (String)attributes.get("XMY0186");

		if (XMY0186 != null) {
			setXMY0186(XMY0186);
		}

		String XMY0187 = (String)attributes.get("XMY0187");

		if (XMY0187 != null) {
			setXMY0187(XMY0187);
		}

		String XMY0188 = (String)attributes.get("XMY0188");

		if (XMY0188 != null) {
			setXMY0188(XMY0188);
		}

		String XMY0189 = (String)attributes.get("XMY0189");

		if (XMY0189 != null) {
			setXMY0189(XMY0189);
		}

		String XMY0190 = (String)attributes.get("XMY0190");

		if (XMY0190 != null) {
			setXMY0190(XMY0190);
		}

		String XMY0191 = (String)attributes.get("XMY0191");

		if (XMY0191 != null) {
			setXMY0191(XMY0191);
		}

		String XMY0192 = (String)attributes.get("XMY0192");

		if (XMY0192 != null) {
			setXMY0192(XMY0192);
		}

		String XMY0193 = (String)attributes.get("XMY0193");

		if (XMY0193 != null) {
			setXMY0193(XMY0193);
		}

		String XMY0194 = (String)attributes.get("XMY0194");

		if (XMY0194 != null) {
			setXMY0194(XMY0194);
		}

		String XMY0195 = (String)attributes.get("XMY0195");

		if (XMY0195 != null) {
			setXMY0195(XMY0195);
		}

		String XMY0196 = (String)attributes.get("XMY0196");

		if (XMY0196 != null) {
			setXMY0196(XMY0196);
		}

		String XMY0197 = (String)attributes.get("XMY0197");

		if (XMY0197 != null) {
			setXMY0197(XMY0197);
		}

		String XMY0198 = (String)attributes.get("XMY0198");

		if (XMY0198 != null) {
			setXMY0198(XMY0198);
		}

		String XMY0199 = (String)attributes.get("XMY0199");

		if (XMY0199 != null) {
			setXMY0199(XMY0199);
		}

		String XMY0200 = (String)attributes.get("XMY0200");

		if (XMY0200 != null) {
			setXMY0200(XMY0200);
		}

		String XMY0201 = (String)attributes.get("XMY0201");

		if (XMY0201 != null) {
			setXMY0201(XMY0201);
		}

		String XMY0202 = (String)attributes.get("XMY0202");

		if (XMY0202 != null) {
			setXMY0202(XMY0202);
		}

		String XMY0203 = (String)attributes.get("XMY0203");

		if (XMY0203 != null) {
			setXMY0203(XMY0203);
		}

		String XMY0204 = (String)attributes.get("XMY0204");

		if (XMY0204 != null) {
			setXMY0204(XMY0204);
		}

		String XMY0205 = (String)attributes.get("XMY0205");

		if (XMY0205 != null) {
			setXMY0205(XMY0205);
		}

		String XMY0207 = (String)attributes.get("XMY0207");

		if (XMY0207 != null) {
			setXMY0207(XMY0207);
		}

		String XMY0208 = (String)attributes.get("XMY0208");

		if (XMY0208 != null) {
			setXMY0208(XMY0208);
		}

		String XMY0209 = (String)attributes.get("XMY0209");

		if (XMY0209 != null) {
			setXMY0209(XMY0209);
		}

		String XMY0210 = (String)attributes.get("XMY0210");

		if (XMY0210 != null) {
			setXMY0210(XMY0210);
		}

		String XMY0211 = (String)attributes.get("XMY0211");

		if (XMY0211 != null) {
			setXMY0211(XMY0211);
		}

		String XMY0212 = (String)attributes.get("XMY0212");

		if (XMY0212 != null) {
			setXMY0212(XMY0212);
		}

		String XMY0213 = (String)attributes.get("XMY0213");

		if (XMY0213 != null) {
			setXMY0213(XMY0213);
		}

		String XMY0214 = (String)attributes.get("XMY0214");

		if (XMY0214 != null) {
			setXMY0214(XMY0214);
		}

		String XMY0215 = (String)attributes.get("XMY0215");

		if (XMY0215 != null) {
			setXMY0215(XMY0215);
		}

		String XMY0216 = (String)attributes.get("XMY0216");

		if (XMY0216 != null) {
			setXMY0216(XMY0216);
		}

		String XMY0217 = (String)attributes.get("XMY0217");

		if (XMY0217 != null) {
			setXMY0217(XMY0217);
		}

		String XMY0218 = (String)attributes.get("XMY0218");

		if (XMY0218 != null) {
			setXMY0218(XMY0218);
		}

		String XMY0219 = (String)attributes.get("XMY0219");

		if (XMY0219 != null) {
			setXMY0219(XMY0219);
		}

		String XMY0220 = (String)attributes.get("XMY0220");

		if (XMY0220 != null) {
			setXMY0220(XMY0220);
		}

		String XMY0221 = (String)attributes.get("XMY0221");

		if (XMY0221 != null) {
			setXMY0221(XMY0221);
		}

		String XMY0222 = (String)attributes.get("XMY0222");

		if (XMY0222 != null) {
			setXMY0222(XMY0222);
		}

		String XMY0223 = (String)attributes.get("XMY0223");

		if (XMY0223 != null) {
			setXMY0223(XMY0223);
		}

		String XMY0224 = (String)attributes.get("XMY0224");

		if (XMY0224 != null) {
			setXMY0224(XMY0224);
		}

		String XMY0225 = (String)attributes.get("XMY0225");

		if (XMY0225 != null) {
			setXMY0225(XMY0225);
		}

		String XMY0226 = (String)attributes.get("XMY0226");

		if (XMY0226 != null) {
			setXMY0226(XMY0226);
		}

		String XMY0227 = (String)attributes.get("XMY0227");

		if (XMY0227 != null) {
			setXMY0227(XMY0227);
		}

		String XMY0228 = (String)attributes.get("XMY0228");

		if (XMY0228 != null) {
			setXMY0228(XMY0228);
		}

		String XMY0229 = (String)attributes.get("XMY0229");

		if (XMY0229 != null) {
			setXMY0229(XMY0229);
		}

		String XMY0230 = (String)attributes.get("XMY0230");

		if (XMY0230 != null) {
			setXMY0230(XMY0230);
		}

		String XMY0231 = (String)attributes.get("XMY0231");

		if (XMY0231 != null) {
			setXMY0231(XMY0231);
		}

		String XMY0232 = (String)attributes.get("XMY0232");

		if (XMY0232 != null) {
			setXMY0232(XMY0232);
		}

		String XMY0233 = (String)attributes.get("XMY0233");

		if (XMY0233 != null) {
			setXMY0233(XMY0233);
		}

		String XMY0234 = (String)attributes.get("XMY0234");

		if (XMY0234 != null) {
			setXMY0234(XMY0234);
		}

		String XMY0235 = (String)attributes.get("XMY0235");

		if (XMY0235 != null) {
			setXMY0235(XMY0235);
		}

		String XMY0236 = (String)attributes.get("XMY0236");

		if (XMY0236 != null) {
			setXMY0236(XMY0236);
		}

		String XMY0237 = (String)attributes.get("XMY0237");

		if (XMY0237 != null) {
			setXMY0237(XMY0237);
		}

		String XMY0238 = (String)attributes.get("XMY0238");

		if (XMY0238 != null) {
			setXMY0238(XMY0238);
		}

		String XMY0239 = (String)attributes.get("XMY0239");

		if (XMY0239 != null) {
			setXMY0239(XMY0239);
		}

		String XMY0240 = (String)attributes.get("XMY0240");

		if (XMY0240 != null) {
			setXMY0240(XMY0240);
		}

		String XMY0241 = (String)attributes.get("XMY0241");

		if (XMY0241 != null) {
			setXMY0241(XMY0241);
		}

		String XMY0242 = (String)attributes.get("XMY0242");

		if (XMY0242 != null) {
			setXMY0242(XMY0242);
		}

		String XMY0243 = (String)attributes.get("XMY0243");

		if (XMY0243 != null) {
			setXMY0243(XMY0243);
		}

		String XMY0244 = (String)attributes.get("XMY0244");

		if (XMY0244 != null) {
			setXMY0244(XMY0244);
		}

		String XMY0245 = (String)attributes.get("XMY0245");

		if (XMY0245 != null) {
			setXMY0245(XMY0245);
		}

		String XMY0246 = (String)attributes.get("XMY0246");

		if (XMY0246 != null) {
			setXMY0246(XMY0246);
		}

		String XMY0247 = (String)attributes.get("XMY0247");

		if (XMY0247 != null) {
			setXMY0247(XMY0247);
		}

		String XMY0248 = (String)attributes.get("XMY0248");

		if (XMY0248 != null) {
			setXMY0248(XMY0248);
		}

		String XMY0249 = (String)attributes.get("XMY0249");

		if (XMY0249 != null) {
			setXMY0249(XMY0249);
		}

		String XMY0250 = (String)attributes.get("XMY0250");

		if (XMY0250 != null) {
			setXMY0250(XMY0250);
		}

		String XMY0251 = (String)attributes.get("XMY0251");

		if (XMY0251 != null) {
			setXMY0251(XMY0251);
		}

		String XMY0252 = (String)attributes.get("XMY0252");

		if (XMY0252 != null) {
			setXMY0252(XMY0252);
		}

		String XMY0253 = (String)attributes.get("XMY0253");

		if (XMY0253 != null) {
			setXMY0253(XMY0253);
		}

		String XMY0254 = (String)attributes.get("XMY0254");

		if (XMY0254 != null) {
			setXMY0254(XMY0254);
		}

		String XMY0255 = (String)attributes.get("XMY0255");

		if (XMY0255 != null) {
			setXMY0255(XMY0255);
		}

		String XMY0256 = (String)attributes.get("XMY0256");

		if (XMY0256 != null) {
			setXMY0256(XMY0256);
		}

		String XMY0257 = (String)attributes.get("XMY0257");

		if (XMY0257 != null) {
			setXMY0257(XMY0257);
		}

		String XMY0258 = (String)attributes.get("XMY0258");

		if (XMY0258 != null) {
			setXMY0258(XMY0258);
		}

		String XMY0259 = (String)attributes.get("XMY0259");

		if (XMY0259 != null) {
			setXMY0259(XMY0259);
		}

		String XMY0260 = (String)attributes.get("XMY0260");

		if (XMY0260 != null) {
			setXMY0260(XMY0260);
		}

		String XMY0261 = (String)attributes.get("XMY0261");

		if (XMY0261 != null) {
			setXMY0261(XMY0261);
		}

		String XMY0262 = (String)attributes.get("XMY0262");

		if (XMY0262 != null) {
			setXMY0262(XMY0262);
		}

		String XMY0263 = (String)attributes.get("XMY0263");

		if (XMY0263 != null) {
			setXMY0263(XMY0263);
		}

		String XMY0264 = (String)attributes.get("XMY0264");

		if (XMY0264 != null) {
			setXMY0264(XMY0264);
		}

		String BBCNCLKLXMY001 = (String)attributes.get("BBCNCLKLXMY001");

		if (BBCNCLKLXMY001 != null) {
			setBBCNCLKLXMY001(BBCNCLKLXMY001);
		}

		String BBCNCLKLXMY002 = (String)attributes.get("BBCNCLKLXMY002");

		if (BBCNCLKLXMY002 != null) {
			setBBCNCLKLXMY002(BBCNCLKLXMY002);
		}

		String BBCNCLKLXMY003 = (String)attributes.get("BBCNCLKLXMY003");

		if (BBCNCLKLXMY003 != null) {
			setBBCNCLKLXMY003(BBCNCLKLXMY003);
		}

		String BBCNCLKLXMY004 = (String)attributes.get("BBCNCLKLXMY004");

		if (BBCNCLKLXMY004 != null) {
			setBBCNCLKLXMY004(BBCNCLKLXMY004);
		}

		String BBCNCLKLXMY005 = (String)attributes.get("BBCNCLKLXMY005");

		if (BBCNCLKLXMY005 != null) {
			setBBCNCLKLXMY005(BBCNCLKLXMY005);
		}

		String BBCNCLKLXMY006 = (String)attributes.get("BBCNCLKLXMY006");

		if (BBCNCLKLXMY006 != null) {
			setBBCNCLKLXMY006(BBCNCLKLXMY006);
		}

		String BBCNCLKLXMY012 = (String)attributes.get("BBCNCLKLXMY012");

		if (BBCNCLKLXMY012 != null) {
			setBBCNCLKLXMY012(BBCNCLKLXMY012);
		}

		String BBCNCLKLXMY013 = (String)attributes.get("BBCNCLKLXMY013");

		if (BBCNCLKLXMY013 != null) {
			setBBCNCLKLXMY013(BBCNCLKLXMY013);
		}

		String BBCNCLKLXMY014 = (String)attributes.get("BBCNCLKLXMY014");

		if (BBCNCLKLXMY014 != null) {
			setBBCNCLKLXMY014(BBCNCLKLXMY014);
		}

		String BBCNCLKLXMY015 = (String)attributes.get("BBCNCLKLXMY015");

		if (BBCNCLKLXMY015 != null) {
			setBBCNCLKLXMY015(BBCNCLKLXMY015);
		}

		String BBCNCLKLXMY016 = (String)attributes.get("BBCNCLKLXMY016");

		if (BBCNCLKLXMY016 != null) {
			setBBCNCLKLXMY016(BBCNCLKLXMY016);
		}

		String BBCNCLKLXMY017 = (String)attributes.get("BBCNCLKLXMY017");

		if (BBCNCLKLXMY017 != null) {
			setBBCNCLKLXMY017(BBCNCLKLXMY017);
		}

		String BBCNCLKLXMY018 = (String)attributes.get("BBCNCLKLXMY018");

		if (BBCNCLKLXMY018 != null) {
			setBBCNCLKLXMY018(BBCNCLKLXMY018);
		}

		String BBCNCLKLXMY019 = (String)attributes.get("BBCNCLKLXMY019");

		if (BBCNCLKLXMY019 != null) {
			setBBCNCLKLXMY019(BBCNCLKLXMY019);
		}

		String BBCNCLKLXMY020 = (String)attributes.get("BBCNCLKLXMY020");

		if (BBCNCLKLXMY020 != null) {
			setBBCNCLKLXMY020(BBCNCLKLXMY020);
		}

		String BBCNCLKLXMY021 = (String)attributes.get("BBCNCLKLXMY021");

		if (BBCNCLKLXMY021 != null) {
			setBBCNCLKLXMY021(BBCNCLKLXMY021);
		}

		String BBCNCLKLXMY022 = (String)attributes.get("BBCNCLKLXMY022");

		if (BBCNCLKLXMY022 != null) {
			setBBCNCLKLXMY022(BBCNCLKLXMY022);
		}

		String BBCNCLKLXMY024 = (String)attributes.get("BBCNCLKLXMY024");

		if (BBCNCLKLXMY024 != null) {
			setBBCNCLKLXMY024(BBCNCLKLXMY024);
		}

		String BBCNCLKLXMY026 = (String)attributes.get("BBCNCLKLXMY026");

		if (BBCNCLKLXMY026 != null) {
			setBBCNCLKLXMY026(BBCNCLKLXMY026);
		}

		String BBCNCLKLXMY027 = (String)attributes.get("BBCNCLKLXMY027");

		if (BBCNCLKLXMY027 != null) {
			setBBCNCLKLXMY027(BBCNCLKLXMY027);
		}

		String BBCNCLKLXMY028 = (String)attributes.get("BBCNCLKLXMY028");

		if (BBCNCLKLXMY028 != null) {
			setBBCNCLKLXMY028(BBCNCLKLXMY028);
		}

		String BBCNCLKLXMY029 = (String)attributes.get("BBCNCLKLXMY029");

		if (BBCNCLKLXMY029 != null) {
			setBBCNCLKLXMY029(BBCNCLKLXMY029);
		}

		String BBCNCLKLXMY033 = (String)attributes.get("BBCNCLKLXMY033");

		if (BBCNCLKLXMY033 != null) {
			setBBCNCLKLXMY033(BBCNCLKLXMY033);
		}

		String BBCNCLKLXMY034 = (String)attributes.get("BBCNCLKLXMY034");

		if (BBCNCLKLXMY034 != null) {
			setBBCNCLKLXMY034(BBCNCLKLXMY034);
		}

		String BBCNCLKLXMY037 = (String)attributes.get("BBCNCLKLXMY037");

		if (BBCNCLKLXMY037 != null) {
			setBBCNCLKLXMY037(BBCNCLKLXMY037);
		}

		String BBCNCLKLXMY038 = (String)attributes.get("BBCNCLKLXMY038");

		if (BBCNCLKLXMY038 != null) {
			setBBCNCLKLXMY038(BBCNCLKLXMY038);
		}

		String BBCNCLKLXMY039 = (String)attributes.get("BBCNCLKLXMY039");

		if (BBCNCLKLXMY039 != null) {
			setBBCNCLKLXMY039(BBCNCLKLXMY039);
		}

		String BBCNCLKLXMY040 = (String)attributes.get("BBCNCLKLXMY040");

		if (BBCNCLKLXMY040 != null) {
			setBBCNCLKLXMY040(BBCNCLKLXMY040);
		}

		String BBCNCLKLXMY041 = (String)attributes.get("BBCNCLKLXMY041");

		if (BBCNCLKLXMY041 != null) {
			setBBCNCLKLXMY041(BBCNCLKLXMY041);
		}

		String BBCNCLKLXMY042 = (String)attributes.get("BBCNCLKLXMY042");

		if (BBCNCLKLXMY042 != null) {
			setBBCNCLKLXMY042(BBCNCLKLXMY042);
		}

		String BBCNCLKLXMY043 = (String)attributes.get("BBCNCLKLXMY043");

		if (BBCNCLKLXMY043 != null) {
			setBBCNCLKLXMY043(BBCNCLKLXMY043);
		}

		String BBCNCLKLXMY044 = (String)attributes.get("BBCNCLKLXMY044");

		if (BBCNCLKLXMY044 != null) {
			setBBCNCLKLXMY044(BBCNCLKLXMY044);
		}

		String BBCNCLKLXMY045 = (String)attributes.get("BBCNCLKLXMY045");

		if (BBCNCLKLXMY045 != null) {
			setBBCNCLKLXMY045(BBCNCLKLXMY045);
		}

		String BBCNCLKLXDD030 = (String)attributes.get("BBCNCLKLXDD030");

		if (BBCNCLKLXDD030 != null) {
			setBBCNCLKLXDD030(BBCNCLKLXDD030);
		}

		String BBCNCLKLXMY046 = (String)attributes.get("BBCNCLKLXMY046");

		if (BBCNCLKLXMY046 != null) {
			setBBCNCLKLXMY046(BBCNCLKLXMY046);
		}

		String BBCNCLKLXMY047 = (String)attributes.get("BBCNCLKLXMY047");

		if (BBCNCLKLXMY047 != null) {
			setBBCNCLKLXMY047(BBCNCLKLXMY047);
		}

		String BBCNCLKLXMY053 = (String)attributes.get("BBCNCLKLXMY053");

		if (BBCNCLKLXMY053 != null) {
			setBBCNCLKLXMY053(BBCNCLKLXMY053);
		}

		String BBCNCLKLXMY054 = (String)attributes.get("BBCNCLKLXMY054");

		if (BBCNCLKLXMY054 != null) {
			setBBCNCLKLXMY054(BBCNCLKLXMY054);
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
	public VRTechnicalSpec_XMYPart3 toEscapedModel() {
		return new VRTechnicalSpec_XMYPart3Wrapper(_vrTechnicalSpec_XMYPart3.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XMYPart3 toUnescapedModel() {
		return new VRTechnicalSpec_XMYPart3Wrapper(_vrTechnicalSpec_XMYPart3.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XMYPart3.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XMYPart3.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XMYPart3.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XMYPart3.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XMYPart3> toCacheModel() {
		return _vrTechnicalSpec_XMYPart3.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3) {
		return _vrTechnicalSpec_XMYPart3.compareTo(vrTechnicalSpec_XMYPart3);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XMYPart3.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XMYPart3.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XMYPart3Wrapper((VRTechnicalSpec_XMYPart3)_vrTechnicalSpec_XMYPart3.clone());
	}

	/**
	* Returns the bbcnclklxdd030 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxdd030 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXDD030() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXDD030();
	}

	/**
	* Returns the bbcnclklxmy001 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy001 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY001() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY001();
	}

	/**
	* Returns the bbcnclklxmy002 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy002 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY002() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY002();
	}

	/**
	* Returns the bbcnclklxmy003 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy003 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY003() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY003();
	}

	/**
	* Returns the bbcnclklxmy004 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy004 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY004() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY004();
	}

	/**
	* Returns the bbcnclklxmy005 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy005 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY005() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY005();
	}

	/**
	* Returns the bbcnclklxmy006 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy006 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY006() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY006();
	}

	/**
	* Returns the bbcnclklxmy012 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy012 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY012() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY012();
	}

	/**
	* Returns the bbcnclklxmy013 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy013 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY013() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY013();
	}

	/**
	* Returns the bbcnclklxmy014 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy014 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY014() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY014();
	}

	/**
	* Returns the bbcnclklxmy015 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy015 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY015() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY015();
	}

	/**
	* Returns the bbcnclklxmy016 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy016 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY016() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY016();
	}

	/**
	* Returns the bbcnclklxmy017 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy017 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY017() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY017();
	}

	/**
	* Returns the bbcnclklxmy018 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy018 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY018() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY018();
	}

	/**
	* Returns the bbcnclklxmy019 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy019 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY019() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY019();
	}

	/**
	* Returns the bbcnclklxmy020 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy020 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY020() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY020();
	}

	/**
	* Returns the bbcnclklxmy021 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy021 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY021() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY021();
	}

	/**
	* Returns the bbcnclklxmy022 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy022 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY022() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY022();
	}

	/**
	* Returns the bbcnclklxmy024 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy024 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY024() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY024();
	}

	/**
	* Returns the bbcnclklxmy026 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy026 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY026() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY026();
	}

	/**
	* Returns the bbcnclklxmy027 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy027 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY027() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY027();
	}

	/**
	* Returns the bbcnclklxmy028 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy028 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY028() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY028();
	}

	/**
	* Returns the bbcnclklxmy029 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy029 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY029() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY029();
	}

	/**
	* Returns the bbcnclklxmy033 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy033 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY033() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY033();
	}

	/**
	* Returns the bbcnclklxmy034 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy034 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY034() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY034();
	}

	/**
	* Returns the bbcnclklxmy037 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy037 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY037() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY037();
	}

	/**
	* Returns the bbcnclklxmy038 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy038 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY038() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY038();
	}

	/**
	* Returns the bbcnclklxmy039 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy039 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY039() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY039();
	}

	/**
	* Returns the bbcnclklxmy040 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy040 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY040() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY040();
	}

	/**
	* Returns the bbcnclklxmy041 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy041 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY041() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY041();
	}

	/**
	* Returns the bbcnclklxmy042 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy042 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY042() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY042();
	}

	/**
	* Returns the bbcnclklxmy043 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy043 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY043() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY043();
	}

	/**
	* Returns the bbcnclklxmy044 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy044 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY044() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY044();
	}

	/**
	* Returns the bbcnclklxmy045 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy045 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY045() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY045();
	}

	/**
	* Returns the bbcnclklxmy046 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy046 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY046() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY046();
	}

	/**
	* Returns the bbcnclklxmy047 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy047 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY047() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY047();
	}

	/**
	* Returns the bbcnclklxmy053 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy053 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY053() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY053();
	}

	/**
	* Returns the bbcnclklxmy054 of this vr technical spec_xmy part3.
	*
	* @return the bbcnclklxmy054 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getBBCNCLKLXMY054() {
		return _vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY054();
	}

	/**
	* Returns the deliverable code of this vr technical spec_xmy part3.
	*
	* @return the deliverable code of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XMYPart3.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xmy part3.
	*
	* @return the dossier ID ctn of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XMYPart3.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xmy part3.
	*
	* @return the dossier no of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XMYPart3.getDossierNo();
	}

	/**
	* Returns the reference uid of this vr technical spec_xmy part3.
	*
	* @return the reference uid of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XMYPart3.getReferenceUid();
	}

	/**
	* Returns the xmy0149 of this vr technical spec_xmy part3.
	*
	* @return the xmy0149 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0149() {
		return _vrTechnicalSpec_XMYPart3.getXMY0149();
	}

	/**
	* Returns the xmy0150 of this vr technical spec_xmy part3.
	*
	* @return the xmy0150 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0150() {
		return _vrTechnicalSpec_XMYPart3.getXMY0150();
	}

	/**
	* Returns the xmy0151 of this vr technical spec_xmy part3.
	*
	* @return the xmy0151 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0151() {
		return _vrTechnicalSpec_XMYPart3.getXMY0151();
	}

	/**
	* Returns the xmy0152 of this vr technical spec_xmy part3.
	*
	* @return the xmy0152 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0152() {
		return _vrTechnicalSpec_XMYPart3.getXMY0152();
	}

	/**
	* Returns the xmy0153 of this vr technical spec_xmy part3.
	*
	* @return the xmy0153 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0153() {
		return _vrTechnicalSpec_XMYPart3.getXMY0153();
	}

	/**
	* Returns the xmy0154 of this vr technical spec_xmy part3.
	*
	* @return the xmy0154 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0154() {
		return _vrTechnicalSpec_XMYPart3.getXMY0154();
	}

	/**
	* Returns the xmy0155 of this vr technical spec_xmy part3.
	*
	* @return the xmy0155 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0155() {
		return _vrTechnicalSpec_XMYPart3.getXMY0155();
	}

	/**
	* Returns the xmy0156 of this vr technical spec_xmy part3.
	*
	* @return the xmy0156 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0156() {
		return _vrTechnicalSpec_XMYPart3.getXMY0156();
	}

	/**
	* Returns the xmy0157 of this vr technical spec_xmy part3.
	*
	* @return the xmy0157 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0157() {
		return _vrTechnicalSpec_XMYPart3.getXMY0157();
	}

	/**
	* Returns the xmy0158 of this vr technical spec_xmy part3.
	*
	* @return the xmy0158 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0158() {
		return _vrTechnicalSpec_XMYPart3.getXMY0158();
	}

	/**
	* Returns the xmy0159 of this vr technical spec_xmy part3.
	*
	* @return the xmy0159 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0159() {
		return _vrTechnicalSpec_XMYPart3.getXMY0159();
	}

	/**
	* Returns the xmy0160 of this vr technical spec_xmy part3.
	*
	* @return the xmy0160 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0160() {
		return _vrTechnicalSpec_XMYPart3.getXMY0160();
	}

	/**
	* Returns the xmy0161 of this vr technical spec_xmy part3.
	*
	* @return the xmy0161 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0161() {
		return _vrTechnicalSpec_XMYPart3.getXMY0161();
	}

	/**
	* Returns the xmy0162 of this vr technical spec_xmy part3.
	*
	* @return the xmy0162 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0162() {
		return _vrTechnicalSpec_XMYPart3.getXMY0162();
	}

	/**
	* Returns the xmy0163 of this vr technical spec_xmy part3.
	*
	* @return the xmy0163 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0163() {
		return _vrTechnicalSpec_XMYPart3.getXMY0163();
	}

	/**
	* Returns the xmy0164 of this vr technical spec_xmy part3.
	*
	* @return the xmy0164 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0164() {
		return _vrTechnicalSpec_XMYPart3.getXMY0164();
	}

	/**
	* Returns the xmy0165 of this vr technical spec_xmy part3.
	*
	* @return the xmy0165 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0165() {
		return _vrTechnicalSpec_XMYPart3.getXMY0165();
	}

	/**
	* Returns the xmy0166 of this vr technical spec_xmy part3.
	*
	* @return the xmy0166 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0166() {
		return _vrTechnicalSpec_XMYPart3.getXMY0166();
	}

	/**
	* Returns the xmy0167 of this vr technical spec_xmy part3.
	*
	* @return the xmy0167 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0167() {
		return _vrTechnicalSpec_XMYPart3.getXMY0167();
	}

	/**
	* Returns the xmy0168 of this vr technical spec_xmy part3.
	*
	* @return the xmy0168 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0168() {
		return _vrTechnicalSpec_XMYPart3.getXMY0168();
	}

	/**
	* Returns the xmy0169 of this vr technical spec_xmy part3.
	*
	* @return the xmy0169 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0169() {
		return _vrTechnicalSpec_XMYPart3.getXMY0169();
	}

	/**
	* Returns the xmy0170 of this vr technical spec_xmy part3.
	*
	* @return the xmy0170 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0170() {
		return _vrTechnicalSpec_XMYPart3.getXMY0170();
	}

	/**
	* Returns the xmy0171 of this vr technical spec_xmy part3.
	*
	* @return the xmy0171 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0171() {
		return _vrTechnicalSpec_XMYPart3.getXMY0171();
	}

	/**
	* Returns the xmy0172 of this vr technical spec_xmy part3.
	*
	* @return the xmy0172 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0172() {
		return _vrTechnicalSpec_XMYPart3.getXMY0172();
	}

	/**
	* Returns the xmy0173 of this vr technical spec_xmy part3.
	*
	* @return the xmy0173 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0173() {
		return _vrTechnicalSpec_XMYPart3.getXMY0173();
	}

	/**
	* Returns the xmy0174 of this vr technical spec_xmy part3.
	*
	* @return the xmy0174 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0174() {
		return _vrTechnicalSpec_XMYPart3.getXMY0174();
	}

	/**
	* Returns the xmy0175 of this vr technical spec_xmy part3.
	*
	* @return the xmy0175 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0175() {
		return _vrTechnicalSpec_XMYPart3.getXMY0175();
	}

	/**
	* Returns the xmy0176 of this vr technical spec_xmy part3.
	*
	* @return the xmy0176 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0176() {
		return _vrTechnicalSpec_XMYPart3.getXMY0176();
	}

	/**
	* Returns the xmy0177 of this vr technical spec_xmy part3.
	*
	* @return the xmy0177 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0177() {
		return _vrTechnicalSpec_XMYPart3.getXMY0177();
	}

	/**
	* Returns the xmy0178 of this vr technical spec_xmy part3.
	*
	* @return the xmy0178 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0178() {
		return _vrTechnicalSpec_XMYPart3.getXMY0178();
	}

	/**
	* Returns the xmy0179 of this vr technical spec_xmy part3.
	*
	* @return the xmy0179 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0179() {
		return _vrTechnicalSpec_XMYPart3.getXMY0179();
	}

	/**
	* Returns the xmy0180 of this vr technical spec_xmy part3.
	*
	* @return the xmy0180 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0180() {
		return _vrTechnicalSpec_XMYPart3.getXMY0180();
	}

	/**
	* Returns the xmy0181 of this vr technical spec_xmy part3.
	*
	* @return the xmy0181 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0181() {
		return _vrTechnicalSpec_XMYPart3.getXMY0181();
	}

	/**
	* Returns the xmy0182 of this vr technical spec_xmy part3.
	*
	* @return the xmy0182 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0182() {
		return _vrTechnicalSpec_XMYPart3.getXMY0182();
	}

	/**
	* Returns the xmy0183 of this vr technical spec_xmy part3.
	*
	* @return the xmy0183 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0183() {
		return _vrTechnicalSpec_XMYPart3.getXMY0183();
	}

	/**
	* Returns the xmy0184 of this vr technical spec_xmy part3.
	*
	* @return the xmy0184 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0184() {
		return _vrTechnicalSpec_XMYPart3.getXMY0184();
	}

	/**
	* Returns the xmy0185 of this vr technical spec_xmy part3.
	*
	* @return the xmy0185 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0185() {
		return _vrTechnicalSpec_XMYPart3.getXMY0185();
	}

	/**
	* Returns the xmy0186 of this vr technical spec_xmy part3.
	*
	* @return the xmy0186 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0186() {
		return _vrTechnicalSpec_XMYPart3.getXMY0186();
	}

	/**
	* Returns the xmy0187 of this vr technical spec_xmy part3.
	*
	* @return the xmy0187 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0187() {
		return _vrTechnicalSpec_XMYPart3.getXMY0187();
	}

	/**
	* Returns the xmy0188 of this vr technical spec_xmy part3.
	*
	* @return the xmy0188 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0188() {
		return _vrTechnicalSpec_XMYPart3.getXMY0188();
	}

	/**
	* Returns the xmy0189 of this vr technical spec_xmy part3.
	*
	* @return the xmy0189 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0189() {
		return _vrTechnicalSpec_XMYPart3.getXMY0189();
	}

	/**
	* Returns the xmy0190 of this vr technical spec_xmy part3.
	*
	* @return the xmy0190 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0190() {
		return _vrTechnicalSpec_XMYPart3.getXMY0190();
	}

	/**
	* Returns the xmy0191 of this vr technical spec_xmy part3.
	*
	* @return the xmy0191 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0191() {
		return _vrTechnicalSpec_XMYPart3.getXMY0191();
	}

	/**
	* Returns the xmy0192 of this vr technical spec_xmy part3.
	*
	* @return the xmy0192 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0192() {
		return _vrTechnicalSpec_XMYPart3.getXMY0192();
	}

	/**
	* Returns the xmy0193 of this vr technical spec_xmy part3.
	*
	* @return the xmy0193 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0193() {
		return _vrTechnicalSpec_XMYPart3.getXMY0193();
	}

	/**
	* Returns the xmy0194 of this vr technical spec_xmy part3.
	*
	* @return the xmy0194 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0194() {
		return _vrTechnicalSpec_XMYPart3.getXMY0194();
	}

	/**
	* Returns the xmy0195 of this vr technical spec_xmy part3.
	*
	* @return the xmy0195 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0195() {
		return _vrTechnicalSpec_XMYPart3.getXMY0195();
	}

	/**
	* Returns the xmy0196 of this vr technical spec_xmy part3.
	*
	* @return the xmy0196 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0196() {
		return _vrTechnicalSpec_XMYPart3.getXMY0196();
	}

	/**
	* Returns the xmy0197 of this vr technical spec_xmy part3.
	*
	* @return the xmy0197 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0197() {
		return _vrTechnicalSpec_XMYPart3.getXMY0197();
	}

	/**
	* Returns the xmy0198 of this vr technical spec_xmy part3.
	*
	* @return the xmy0198 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0198() {
		return _vrTechnicalSpec_XMYPart3.getXMY0198();
	}

	/**
	* Returns the xmy0199 of this vr technical spec_xmy part3.
	*
	* @return the xmy0199 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0199() {
		return _vrTechnicalSpec_XMYPart3.getXMY0199();
	}

	/**
	* Returns the xmy0200 of this vr technical spec_xmy part3.
	*
	* @return the xmy0200 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0200() {
		return _vrTechnicalSpec_XMYPart3.getXMY0200();
	}

	/**
	* Returns the xmy0201 of this vr technical spec_xmy part3.
	*
	* @return the xmy0201 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0201() {
		return _vrTechnicalSpec_XMYPart3.getXMY0201();
	}

	/**
	* Returns the xmy0202 of this vr technical spec_xmy part3.
	*
	* @return the xmy0202 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0202() {
		return _vrTechnicalSpec_XMYPart3.getXMY0202();
	}

	/**
	* Returns the xmy0203 of this vr technical spec_xmy part3.
	*
	* @return the xmy0203 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0203() {
		return _vrTechnicalSpec_XMYPart3.getXMY0203();
	}

	/**
	* Returns the xmy0204 of this vr technical spec_xmy part3.
	*
	* @return the xmy0204 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0204() {
		return _vrTechnicalSpec_XMYPart3.getXMY0204();
	}

	/**
	* Returns the xmy0205 of this vr technical spec_xmy part3.
	*
	* @return the xmy0205 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0205() {
		return _vrTechnicalSpec_XMYPart3.getXMY0205();
	}

	/**
	* Returns the xmy0207 of this vr technical spec_xmy part3.
	*
	* @return the xmy0207 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0207() {
		return _vrTechnicalSpec_XMYPart3.getXMY0207();
	}

	/**
	* Returns the xmy0208 of this vr technical spec_xmy part3.
	*
	* @return the xmy0208 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0208() {
		return _vrTechnicalSpec_XMYPart3.getXMY0208();
	}

	/**
	* Returns the xmy0209 of this vr technical spec_xmy part3.
	*
	* @return the xmy0209 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0209() {
		return _vrTechnicalSpec_XMYPart3.getXMY0209();
	}

	/**
	* Returns the xmy0210 of this vr technical spec_xmy part3.
	*
	* @return the xmy0210 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0210() {
		return _vrTechnicalSpec_XMYPart3.getXMY0210();
	}

	/**
	* Returns the xmy0211 of this vr technical spec_xmy part3.
	*
	* @return the xmy0211 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0211() {
		return _vrTechnicalSpec_XMYPart3.getXMY0211();
	}

	/**
	* Returns the xmy0212 of this vr technical spec_xmy part3.
	*
	* @return the xmy0212 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0212() {
		return _vrTechnicalSpec_XMYPart3.getXMY0212();
	}

	/**
	* Returns the xmy0213 of this vr technical spec_xmy part3.
	*
	* @return the xmy0213 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0213() {
		return _vrTechnicalSpec_XMYPart3.getXMY0213();
	}

	/**
	* Returns the xmy0214 of this vr technical spec_xmy part3.
	*
	* @return the xmy0214 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0214() {
		return _vrTechnicalSpec_XMYPart3.getXMY0214();
	}

	/**
	* Returns the xmy0215 of this vr technical spec_xmy part3.
	*
	* @return the xmy0215 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0215() {
		return _vrTechnicalSpec_XMYPart3.getXMY0215();
	}

	/**
	* Returns the xmy0216 of this vr technical spec_xmy part3.
	*
	* @return the xmy0216 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0216() {
		return _vrTechnicalSpec_XMYPart3.getXMY0216();
	}

	/**
	* Returns the xmy0217 of this vr technical spec_xmy part3.
	*
	* @return the xmy0217 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0217() {
		return _vrTechnicalSpec_XMYPart3.getXMY0217();
	}

	/**
	* Returns the xmy0218 of this vr technical spec_xmy part3.
	*
	* @return the xmy0218 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0218() {
		return _vrTechnicalSpec_XMYPart3.getXMY0218();
	}

	/**
	* Returns the xmy0219 of this vr technical spec_xmy part3.
	*
	* @return the xmy0219 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0219() {
		return _vrTechnicalSpec_XMYPart3.getXMY0219();
	}

	/**
	* Returns the xmy0220 of this vr technical spec_xmy part3.
	*
	* @return the xmy0220 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0220() {
		return _vrTechnicalSpec_XMYPart3.getXMY0220();
	}

	/**
	* Returns the xmy0221 of this vr technical spec_xmy part3.
	*
	* @return the xmy0221 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0221() {
		return _vrTechnicalSpec_XMYPart3.getXMY0221();
	}

	/**
	* Returns the xmy0222 of this vr technical spec_xmy part3.
	*
	* @return the xmy0222 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0222() {
		return _vrTechnicalSpec_XMYPart3.getXMY0222();
	}

	/**
	* Returns the xmy0223 of this vr technical spec_xmy part3.
	*
	* @return the xmy0223 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0223() {
		return _vrTechnicalSpec_XMYPart3.getXMY0223();
	}

	/**
	* Returns the xmy0224 of this vr technical spec_xmy part3.
	*
	* @return the xmy0224 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0224() {
		return _vrTechnicalSpec_XMYPart3.getXMY0224();
	}

	/**
	* Returns the xmy0225 of this vr technical spec_xmy part3.
	*
	* @return the xmy0225 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0225() {
		return _vrTechnicalSpec_XMYPart3.getXMY0225();
	}

	/**
	* Returns the xmy0226 of this vr technical spec_xmy part3.
	*
	* @return the xmy0226 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0226() {
		return _vrTechnicalSpec_XMYPart3.getXMY0226();
	}

	/**
	* Returns the xmy0227 of this vr technical spec_xmy part3.
	*
	* @return the xmy0227 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0227() {
		return _vrTechnicalSpec_XMYPart3.getXMY0227();
	}

	/**
	* Returns the xmy0228 of this vr technical spec_xmy part3.
	*
	* @return the xmy0228 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0228() {
		return _vrTechnicalSpec_XMYPart3.getXMY0228();
	}

	/**
	* Returns the xmy0229 of this vr technical spec_xmy part3.
	*
	* @return the xmy0229 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0229() {
		return _vrTechnicalSpec_XMYPart3.getXMY0229();
	}

	/**
	* Returns the xmy0230 of this vr technical spec_xmy part3.
	*
	* @return the xmy0230 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0230() {
		return _vrTechnicalSpec_XMYPart3.getXMY0230();
	}

	/**
	* Returns the xmy0231 of this vr technical spec_xmy part3.
	*
	* @return the xmy0231 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0231() {
		return _vrTechnicalSpec_XMYPart3.getXMY0231();
	}

	/**
	* Returns the xmy0232 of this vr technical spec_xmy part3.
	*
	* @return the xmy0232 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0232() {
		return _vrTechnicalSpec_XMYPart3.getXMY0232();
	}

	/**
	* Returns the xmy0233 of this vr technical spec_xmy part3.
	*
	* @return the xmy0233 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0233() {
		return _vrTechnicalSpec_XMYPart3.getXMY0233();
	}

	/**
	* Returns the xmy0234 of this vr technical spec_xmy part3.
	*
	* @return the xmy0234 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0234() {
		return _vrTechnicalSpec_XMYPart3.getXMY0234();
	}

	/**
	* Returns the xmy0235 of this vr technical spec_xmy part3.
	*
	* @return the xmy0235 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0235() {
		return _vrTechnicalSpec_XMYPart3.getXMY0235();
	}

	/**
	* Returns the xmy0236 of this vr technical spec_xmy part3.
	*
	* @return the xmy0236 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0236() {
		return _vrTechnicalSpec_XMYPart3.getXMY0236();
	}

	/**
	* Returns the xmy0237 of this vr technical spec_xmy part3.
	*
	* @return the xmy0237 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0237() {
		return _vrTechnicalSpec_XMYPart3.getXMY0237();
	}

	/**
	* Returns the xmy0238 of this vr technical spec_xmy part3.
	*
	* @return the xmy0238 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0238() {
		return _vrTechnicalSpec_XMYPart3.getXMY0238();
	}

	/**
	* Returns the xmy0239 of this vr technical spec_xmy part3.
	*
	* @return the xmy0239 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0239() {
		return _vrTechnicalSpec_XMYPart3.getXMY0239();
	}

	/**
	* Returns the xmy0240 of this vr technical spec_xmy part3.
	*
	* @return the xmy0240 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0240() {
		return _vrTechnicalSpec_XMYPart3.getXMY0240();
	}

	/**
	* Returns the xmy0241 of this vr technical spec_xmy part3.
	*
	* @return the xmy0241 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0241() {
		return _vrTechnicalSpec_XMYPart3.getXMY0241();
	}

	/**
	* Returns the xmy0242 of this vr technical spec_xmy part3.
	*
	* @return the xmy0242 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0242() {
		return _vrTechnicalSpec_XMYPart3.getXMY0242();
	}

	/**
	* Returns the xmy0243 of this vr technical spec_xmy part3.
	*
	* @return the xmy0243 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0243() {
		return _vrTechnicalSpec_XMYPart3.getXMY0243();
	}

	/**
	* Returns the xmy0244 of this vr technical spec_xmy part3.
	*
	* @return the xmy0244 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0244() {
		return _vrTechnicalSpec_XMYPart3.getXMY0244();
	}

	/**
	* Returns the xmy0245 of this vr technical spec_xmy part3.
	*
	* @return the xmy0245 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0245() {
		return _vrTechnicalSpec_XMYPart3.getXMY0245();
	}

	/**
	* Returns the xmy0246 of this vr technical spec_xmy part3.
	*
	* @return the xmy0246 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0246() {
		return _vrTechnicalSpec_XMYPart3.getXMY0246();
	}

	/**
	* Returns the xmy0247 of this vr technical spec_xmy part3.
	*
	* @return the xmy0247 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0247() {
		return _vrTechnicalSpec_XMYPart3.getXMY0247();
	}

	/**
	* Returns the xmy0248 of this vr technical spec_xmy part3.
	*
	* @return the xmy0248 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0248() {
		return _vrTechnicalSpec_XMYPart3.getXMY0248();
	}

	/**
	* Returns the xmy0249 of this vr technical spec_xmy part3.
	*
	* @return the xmy0249 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0249() {
		return _vrTechnicalSpec_XMYPart3.getXMY0249();
	}

	/**
	* Returns the xmy0250 of this vr technical spec_xmy part3.
	*
	* @return the xmy0250 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0250() {
		return _vrTechnicalSpec_XMYPart3.getXMY0250();
	}

	/**
	* Returns the xmy0251 of this vr technical spec_xmy part3.
	*
	* @return the xmy0251 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0251() {
		return _vrTechnicalSpec_XMYPart3.getXMY0251();
	}

	/**
	* Returns the xmy0252 of this vr technical spec_xmy part3.
	*
	* @return the xmy0252 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0252() {
		return _vrTechnicalSpec_XMYPart3.getXMY0252();
	}

	/**
	* Returns the xmy0253 of this vr technical spec_xmy part3.
	*
	* @return the xmy0253 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0253() {
		return _vrTechnicalSpec_XMYPart3.getXMY0253();
	}

	/**
	* Returns the xmy0254 of this vr technical spec_xmy part3.
	*
	* @return the xmy0254 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0254() {
		return _vrTechnicalSpec_XMYPart3.getXMY0254();
	}

	/**
	* Returns the xmy0255 of this vr technical spec_xmy part3.
	*
	* @return the xmy0255 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0255() {
		return _vrTechnicalSpec_XMYPart3.getXMY0255();
	}

	/**
	* Returns the xmy0256 of this vr technical spec_xmy part3.
	*
	* @return the xmy0256 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0256() {
		return _vrTechnicalSpec_XMYPart3.getXMY0256();
	}

	/**
	* Returns the xmy0257 of this vr technical spec_xmy part3.
	*
	* @return the xmy0257 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0257() {
		return _vrTechnicalSpec_XMYPart3.getXMY0257();
	}

	/**
	* Returns the xmy0258 of this vr technical spec_xmy part3.
	*
	* @return the xmy0258 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0258() {
		return _vrTechnicalSpec_XMYPart3.getXMY0258();
	}

	/**
	* Returns the xmy0259 of this vr technical spec_xmy part3.
	*
	* @return the xmy0259 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0259() {
		return _vrTechnicalSpec_XMYPart3.getXMY0259();
	}

	/**
	* Returns the xmy0260 of this vr technical spec_xmy part3.
	*
	* @return the xmy0260 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0260() {
		return _vrTechnicalSpec_XMYPart3.getXMY0260();
	}

	/**
	* Returns the xmy0261 of this vr technical spec_xmy part3.
	*
	* @return the xmy0261 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0261() {
		return _vrTechnicalSpec_XMYPart3.getXMY0261();
	}

	/**
	* Returns the xmy0262 of this vr technical spec_xmy part3.
	*
	* @return the xmy0262 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0262() {
		return _vrTechnicalSpec_XMYPart3.getXMY0262();
	}

	/**
	* Returns the xmy0263 of this vr technical spec_xmy part3.
	*
	* @return the xmy0263 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0263() {
		return _vrTechnicalSpec_XMYPart3.getXMY0263();
	}

	/**
	* Returns the xmy0264 of this vr technical spec_xmy part3.
	*
	* @return the xmy0264 of this vr technical spec_xmy part3
	*/
	@Override
	public java.lang.String getXMY0264() {
		return _vrTechnicalSpec_XMYPart3.getXMY0264();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XMYPart3.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XMYPart3.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xmy part3.
	*
	* @return the modify date of this vr technical spec_xmy part3
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XMYPart3.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xmy part3.
	*
	* @return the sync date of this vr technical spec_xmy part3
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XMYPart3.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xmy part3.
	*
	* @return the convert assemble ID of this vr technical spec_xmy part3
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XMYPart3.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xmy part3.
	*
	* @return the dossier ID of this vr technical spec_xmy part3
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XMYPart3.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xmy part3.
	*
	* @return the ID of this vr technical spec_xmy part3
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XMYPart3.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xmy part3.
	*
	* @return the mt core of this vr technical spec_xmy part3
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XMYPart3.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xmy part3.
	*
	* @return the primary key of this vr technical spec_xmy part3
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XMYPart3.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xmy part3.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xmy part3
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XMYPart3.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XMYPart3.persist();
	}

	/**
	* Sets the bbcnclklxdd030 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXDD030 the bbcnclklxdd030 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXDD030(java.lang.String BBCNCLKLXDD030) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXDD030(BBCNCLKLXDD030);
	}

	/**
	* Sets the bbcnclklxmy001 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY001 the bbcnclklxmy001 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY001(java.lang.String BBCNCLKLXMY001) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY001(BBCNCLKLXMY001);
	}

	/**
	* Sets the bbcnclklxmy002 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY002 the bbcnclklxmy002 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY002(java.lang.String BBCNCLKLXMY002) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY002(BBCNCLKLXMY002);
	}

	/**
	* Sets the bbcnclklxmy003 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY003 the bbcnclklxmy003 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY003(java.lang.String BBCNCLKLXMY003) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY003(BBCNCLKLXMY003);
	}

	/**
	* Sets the bbcnclklxmy004 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY004 the bbcnclklxmy004 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY004(java.lang.String BBCNCLKLXMY004) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY004(BBCNCLKLXMY004);
	}

	/**
	* Sets the bbcnclklxmy005 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY005 the bbcnclklxmy005 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY005(java.lang.String BBCNCLKLXMY005) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY005(BBCNCLKLXMY005);
	}

	/**
	* Sets the bbcnclklxmy006 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY006 the bbcnclklxmy006 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY006(java.lang.String BBCNCLKLXMY006) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY006(BBCNCLKLXMY006);
	}

	/**
	* Sets the bbcnclklxmy012 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY012 the bbcnclklxmy012 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY012(java.lang.String BBCNCLKLXMY012) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY012(BBCNCLKLXMY012);
	}

	/**
	* Sets the bbcnclklxmy013 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY013 the bbcnclklxmy013 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY013(java.lang.String BBCNCLKLXMY013) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY013(BBCNCLKLXMY013);
	}

	/**
	* Sets the bbcnclklxmy014 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY014 the bbcnclklxmy014 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY014(java.lang.String BBCNCLKLXMY014) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY014(BBCNCLKLXMY014);
	}

	/**
	* Sets the bbcnclklxmy015 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY015 the bbcnclklxmy015 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY015(java.lang.String BBCNCLKLXMY015) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY015(BBCNCLKLXMY015);
	}

	/**
	* Sets the bbcnclklxmy016 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY016 the bbcnclklxmy016 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY016(java.lang.String BBCNCLKLXMY016) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY016(BBCNCLKLXMY016);
	}

	/**
	* Sets the bbcnclklxmy017 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY017 the bbcnclklxmy017 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY017(java.lang.String BBCNCLKLXMY017) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY017(BBCNCLKLXMY017);
	}

	/**
	* Sets the bbcnclklxmy018 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY018 the bbcnclklxmy018 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY018(java.lang.String BBCNCLKLXMY018) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY018(BBCNCLKLXMY018);
	}

	/**
	* Sets the bbcnclklxmy019 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY019 the bbcnclklxmy019 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY019(java.lang.String BBCNCLKLXMY019) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY019(BBCNCLKLXMY019);
	}

	/**
	* Sets the bbcnclklxmy020 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY020 the bbcnclklxmy020 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY020(java.lang.String BBCNCLKLXMY020) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY020(BBCNCLKLXMY020);
	}

	/**
	* Sets the bbcnclklxmy021 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY021 the bbcnclklxmy021 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY021(java.lang.String BBCNCLKLXMY021) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY021(BBCNCLKLXMY021);
	}

	/**
	* Sets the bbcnclklxmy022 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY022 the bbcnclklxmy022 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY022(java.lang.String BBCNCLKLXMY022) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY022(BBCNCLKLXMY022);
	}

	/**
	* Sets the bbcnclklxmy024 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY024 the bbcnclklxmy024 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY024(java.lang.String BBCNCLKLXMY024) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY024(BBCNCLKLXMY024);
	}

	/**
	* Sets the bbcnclklxmy026 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY026 the bbcnclklxmy026 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY026(java.lang.String BBCNCLKLXMY026) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY026(BBCNCLKLXMY026);
	}

	/**
	* Sets the bbcnclklxmy027 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY027 the bbcnclklxmy027 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY027(java.lang.String BBCNCLKLXMY027) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY027(BBCNCLKLXMY027);
	}

	/**
	* Sets the bbcnclklxmy028 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY028 the bbcnclklxmy028 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY028(java.lang.String BBCNCLKLXMY028) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY028(BBCNCLKLXMY028);
	}

	/**
	* Sets the bbcnclklxmy029 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY029 the bbcnclklxmy029 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY029(java.lang.String BBCNCLKLXMY029) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY029(BBCNCLKLXMY029);
	}

	/**
	* Sets the bbcnclklxmy033 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY033 the bbcnclklxmy033 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY033(java.lang.String BBCNCLKLXMY033) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY033(BBCNCLKLXMY033);
	}

	/**
	* Sets the bbcnclklxmy034 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY034 the bbcnclklxmy034 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY034(java.lang.String BBCNCLKLXMY034) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY034(BBCNCLKLXMY034);
	}

	/**
	* Sets the bbcnclklxmy037 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY037 the bbcnclklxmy037 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY037(java.lang.String BBCNCLKLXMY037) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY037(BBCNCLKLXMY037);
	}

	/**
	* Sets the bbcnclklxmy038 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY038 the bbcnclklxmy038 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY038(java.lang.String BBCNCLKLXMY038) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY038(BBCNCLKLXMY038);
	}

	/**
	* Sets the bbcnclklxmy039 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY039 the bbcnclklxmy039 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY039(java.lang.String BBCNCLKLXMY039) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY039(BBCNCLKLXMY039);
	}

	/**
	* Sets the bbcnclklxmy040 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY040 the bbcnclklxmy040 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY040(java.lang.String BBCNCLKLXMY040) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY040(BBCNCLKLXMY040);
	}

	/**
	* Sets the bbcnclklxmy041 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY041 the bbcnclklxmy041 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY041(java.lang.String BBCNCLKLXMY041) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY041(BBCNCLKLXMY041);
	}

	/**
	* Sets the bbcnclklxmy042 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY042 the bbcnclklxmy042 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY042(java.lang.String BBCNCLKLXMY042) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY042(BBCNCLKLXMY042);
	}

	/**
	* Sets the bbcnclklxmy043 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY043 the bbcnclklxmy043 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY043(java.lang.String BBCNCLKLXMY043) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY043(BBCNCLKLXMY043);
	}

	/**
	* Sets the bbcnclklxmy044 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY044 the bbcnclklxmy044 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY044(java.lang.String BBCNCLKLXMY044) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY044(BBCNCLKLXMY044);
	}

	/**
	* Sets the bbcnclklxmy045 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY045 the bbcnclklxmy045 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY045(java.lang.String BBCNCLKLXMY045) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY045(BBCNCLKLXMY045);
	}

	/**
	* Sets the bbcnclklxmy046 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY046 the bbcnclklxmy046 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY046(java.lang.String BBCNCLKLXMY046) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY046(BBCNCLKLXMY046);
	}

	/**
	* Sets the bbcnclklxmy047 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY047 the bbcnclklxmy047 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY047(java.lang.String BBCNCLKLXMY047) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY047(BBCNCLKLXMY047);
	}

	/**
	* Sets the bbcnclklxmy053 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY053 the bbcnclklxmy053 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY053(java.lang.String BBCNCLKLXMY053) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY053(BBCNCLKLXMY053);
	}

	/**
	* Sets the bbcnclklxmy054 of this vr technical spec_xmy part3.
	*
	* @param BBCNCLKLXMY054 the bbcnclklxmy054 of this vr technical spec_xmy part3
	*/
	@Override
	public void setBBCNCLKLXMY054(java.lang.String BBCNCLKLXMY054) {
		_vrTechnicalSpec_XMYPart3.setBBCNCLKLXMY054(BBCNCLKLXMY054);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XMYPart3.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xmy part3.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xmy part3
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XMYPart3.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xmy part3.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xmy part3
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XMYPart3.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xmy part3.
	*
	* @param dossierId the dossier ID of this vr technical spec_xmy part3
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XMYPart3.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xmy part3.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xmy part3
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XMYPart3.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xmy part3.
	*
	* @param dossierNo the dossier no of this vr technical spec_xmy part3
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XMYPart3.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XMYPart3.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XMYPart3.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XMYPart3.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xmy part3.
	*
	* @param id the ID of this vr technical spec_xmy part3
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XMYPart3.setId(id);
	}

	/**
	* Sets the modify date of this vr technical spec_xmy part3.
	*
	* @param modifyDate the modify date of this vr technical spec_xmy part3
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XMYPart3.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xmy part3.
	*
	* @param mtCore the mt core of this vr technical spec_xmy part3
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XMYPart3.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XMYPart3.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xmy part3.
	*
	* @param primaryKey the primary key of this vr technical spec_xmy part3
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XMYPart3.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XMYPart3.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xmy part3.
	*
	* @param referenceUid the reference uid of this vr technical spec_xmy part3
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XMYPart3.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xmy part3.
	*
	* @param syncDate the sync date of this vr technical spec_xmy part3
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XMYPart3.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xmy part3.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xmy part3
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XMYPart3.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xmy0149 of this vr technical spec_xmy part3.
	*
	* @param XMY0149 the xmy0149 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0149(java.lang.String XMY0149) {
		_vrTechnicalSpec_XMYPart3.setXMY0149(XMY0149);
	}

	/**
	* Sets the xmy0150 of this vr technical spec_xmy part3.
	*
	* @param XMY0150 the xmy0150 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0150(java.lang.String XMY0150) {
		_vrTechnicalSpec_XMYPart3.setXMY0150(XMY0150);
	}

	/**
	* Sets the xmy0151 of this vr technical spec_xmy part3.
	*
	* @param XMY0151 the xmy0151 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0151(java.lang.String XMY0151) {
		_vrTechnicalSpec_XMYPart3.setXMY0151(XMY0151);
	}

	/**
	* Sets the xmy0152 of this vr technical spec_xmy part3.
	*
	* @param XMY0152 the xmy0152 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0152(java.lang.String XMY0152) {
		_vrTechnicalSpec_XMYPart3.setXMY0152(XMY0152);
	}

	/**
	* Sets the xmy0153 of this vr technical spec_xmy part3.
	*
	* @param XMY0153 the xmy0153 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0153(java.lang.String XMY0153) {
		_vrTechnicalSpec_XMYPart3.setXMY0153(XMY0153);
	}

	/**
	* Sets the xmy0154 of this vr technical spec_xmy part3.
	*
	* @param XMY0154 the xmy0154 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0154(java.lang.String XMY0154) {
		_vrTechnicalSpec_XMYPart3.setXMY0154(XMY0154);
	}

	/**
	* Sets the xmy0155 of this vr technical spec_xmy part3.
	*
	* @param XMY0155 the xmy0155 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0155(java.lang.String XMY0155) {
		_vrTechnicalSpec_XMYPart3.setXMY0155(XMY0155);
	}

	/**
	* Sets the xmy0156 of this vr technical spec_xmy part3.
	*
	* @param XMY0156 the xmy0156 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0156(java.lang.String XMY0156) {
		_vrTechnicalSpec_XMYPart3.setXMY0156(XMY0156);
	}

	/**
	* Sets the xmy0157 of this vr technical spec_xmy part3.
	*
	* @param XMY0157 the xmy0157 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0157(java.lang.String XMY0157) {
		_vrTechnicalSpec_XMYPart3.setXMY0157(XMY0157);
	}

	/**
	* Sets the xmy0158 of this vr technical spec_xmy part3.
	*
	* @param XMY0158 the xmy0158 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0158(java.lang.String XMY0158) {
		_vrTechnicalSpec_XMYPart3.setXMY0158(XMY0158);
	}

	/**
	* Sets the xmy0159 of this vr technical spec_xmy part3.
	*
	* @param XMY0159 the xmy0159 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0159(java.lang.String XMY0159) {
		_vrTechnicalSpec_XMYPart3.setXMY0159(XMY0159);
	}

	/**
	* Sets the xmy0160 of this vr technical spec_xmy part3.
	*
	* @param XMY0160 the xmy0160 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0160(java.lang.String XMY0160) {
		_vrTechnicalSpec_XMYPart3.setXMY0160(XMY0160);
	}

	/**
	* Sets the xmy0161 of this vr technical spec_xmy part3.
	*
	* @param XMY0161 the xmy0161 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0161(java.lang.String XMY0161) {
		_vrTechnicalSpec_XMYPart3.setXMY0161(XMY0161);
	}

	/**
	* Sets the xmy0162 of this vr technical spec_xmy part3.
	*
	* @param XMY0162 the xmy0162 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0162(java.lang.String XMY0162) {
		_vrTechnicalSpec_XMYPart3.setXMY0162(XMY0162);
	}

	/**
	* Sets the xmy0163 of this vr technical spec_xmy part3.
	*
	* @param XMY0163 the xmy0163 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0163(java.lang.String XMY0163) {
		_vrTechnicalSpec_XMYPart3.setXMY0163(XMY0163);
	}

	/**
	* Sets the xmy0164 of this vr technical spec_xmy part3.
	*
	* @param XMY0164 the xmy0164 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0164(java.lang.String XMY0164) {
		_vrTechnicalSpec_XMYPart3.setXMY0164(XMY0164);
	}

	/**
	* Sets the xmy0165 of this vr technical spec_xmy part3.
	*
	* @param XMY0165 the xmy0165 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0165(java.lang.String XMY0165) {
		_vrTechnicalSpec_XMYPart3.setXMY0165(XMY0165);
	}

	/**
	* Sets the xmy0166 of this vr technical spec_xmy part3.
	*
	* @param XMY0166 the xmy0166 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0166(java.lang.String XMY0166) {
		_vrTechnicalSpec_XMYPart3.setXMY0166(XMY0166);
	}

	/**
	* Sets the xmy0167 of this vr technical spec_xmy part3.
	*
	* @param XMY0167 the xmy0167 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0167(java.lang.String XMY0167) {
		_vrTechnicalSpec_XMYPart3.setXMY0167(XMY0167);
	}

	/**
	* Sets the xmy0168 of this vr technical spec_xmy part3.
	*
	* @param XMY0168 the xmy0168 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0168(java.lang.String XMY0168) {
		_vrTechnicalSpec_XMYPart3.setXMY0168(XMY0168);
	}

	/**
	* Sets the xmy0169 of this vr technical spec_xmy part3.
	*
	* @param XMY0169 the xmy0169 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0169(java.lang.String XMY0169) {
		_vrTechnicalSpec_XMYPart3.setXMY0169(XMY0169);
	}

	/**
	* Sets the xmy0170 of this vr technical spec_xmy part3.
	*
	* @param XMY0170 the xmy0170 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0170(java.lang.String XMY0170) {
		_vrTechnicalSpec_XMYPart3.setXMY0170(XMY0170);
	}

	/**
	* Sets the xmy0171 of this vr technical spec_xmy part3.
	*
	* @param XMY0171 the xmy0171 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0171(java.lang.String XMY0171) {
		_vrTechnicalSpec_XMYPart3.setXMY0171(XMY0171);
	}

	/**
	* Sets the xmy0172 of this vr technical spec_xmy part3.
	*
	* @param XMY0172 the xmy0172 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0172(java.lang.String XMY0172) {
		_vrTechnicalSpec_XMYPart3.setXMY0172(XMY0172);
	}

	/**
	* Sets the xmy0173 of this vr technical spec_xmy part3.
	*
	* @param XMY0173 the xmy0173 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0173(java.lang.String XMY0173) {
		_vrTechnicalSpec_XMYPart3.setXMY0173(XMY0173);
	}

	/**
	* Sets the xmy0174 of this vr technical spec_xmy part3.
	*
	* @param XMY0174 the xmy0174 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0174(java.lang.String XMY0174) {
		_vrTechnicalSpec_XMYPart3.setXMY0174(XMY0174);
	}

	/**
	* Sets the xmy0175 of this vr technical spec_xmy part3.
	*
	* @param XMY0175 the xmy0175 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0175(java.lang.String XMY0175) {
		_vrTechnicalSpec_XMYPart3.setXMY0175(XMY0175);
	}

	/**
	* Sets the xmy0176 of this vr technical spec_xmy part3.
	*
	* @param XMY0176 the xmy0176 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0176(java.lang.String XMY0176) {
		_vrTechnicalSpec_XMYPart3.setXMY0176(XMY0176);
	}

	/**
	* Sets the xmy0177 of this vr technical spec_xmy part3.
	*
	* @param XMY0177 the xmy0177 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0177(java.lang.String XMY0177) {
		_vrTechnicalSpec_XMYPart3.setXMY0177(XMY0177);
	}

	/**
	* Sets the xmy0178 of this vr technical spec_xmy part3.
	*
	* @param XMY0178 the xmy0178 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0178(java.lang.String XMY0178) {
		_vrTechnicalSpec_XMYPart3.setXMY0178(XMY0178);
	}

	/**
	* Sets the xmy0179 of this vr technical spec_xmy part3.
	*
	* @param XMY0179 the xmy0179 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0179(java.lang.String XMY0179) {
		_vrTechnicalSpec_XMYPart3.setXMY0179(XMY0179);
	}

	/**
	* Sets the xmy0180 of this vr technical spec_xmy part3.
	*
	* @param XMY0180 the xmy0180 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0180(java.lang.String XMY0180) {
		_vrTechnicalSpec_XMYPart3.setXMY0180(XMY0180);
	}

	/**
	* Sets the xmy0181 of this vr technical spec_xmy part3.
	*
	* @param XMY0181 the xmy0181 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0181(java.lang.String XMY0181) {
		_vrTechnicalSpec_XMYPart3.setXMY0181(XMY0181);
	}

	/**
	* Sets the xmy0182 of this vr technical spec_xmy part3.
	*
	* @param XMY0182 the xmy0182 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0182(java.lang.String XMY0182) {
		_vrTechnicalSpec_XMYPart3.setXMY0182(XMY0182);
	}

	/**
	* Sets the xmy0183 of this vr technical spec_xmy part3.
	*
	* @param XMY0183 the xmy0183 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0183(java.lang.String XMY0183) {
		_vrTechnicalSpec_XMYPart3.setXMY0183(XMY0183);
	}

	/**
	* Sets the xmy0184 of this vr technical spec_xmy part3.
	*
	* @param XMY0184 the xmy0184 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0184(java.lang.String XMY0184) {
		_vrTechnicalSpec_XMYPart3.setXMY0184(XMY0184);
	}

	/**
	* Sets the xmy0185 of this vr technical spec_xmy part3.
	*
	* @param XMY0185 the xmy0185 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0185(java.lang.String XMY0185) {
		_vrTechnicalSpec_XMYPart3.setXMY0185(XMY0185);
	}

	/**
	* Sets the xmy0186 of this vr technical spec_xmy part3.
	*
	* @param XMY0186 the xmy0186 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0186(java.lang.String XMY0186) {
		_vrTechnicalSpec_XMYPart3.setXMY0186(XMY0186);
	}

	/**
	* Sets the xmy0187 of this vr technical spec_xmy part3.
	*
	* @param XMY0187 the xmy0187 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0187(java.lang.String XMY0187) {
		_vrTechnicalSpec_XMYPart3.setXMY0187(XMY0187);
	}

	/**
	* Sets the xmy0188 of this vr technical spec_xmy part3.
	*
	* @param XMY0188 the xmy0188 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0188(java.lang.String XMY0188) {
		_vrTechnicalSpec_XMYPart3.setXMY0188(XMY0188);
	}

	/**
	* Sets the xmy0189 of this vr technical spec_xmy part3.
	*
	* @param XMY0189 the xmy0189 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0189(java.lang.String XMY0189) {
		_vrTechnicalSpec_XMYPart3.setXMY0189(XMY0189);
	}

	/**
	* Sets the xmy0190 of this vr technical spec_xmy part3.
	*
	* @param XMY0190 the xmy0190 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0190(java.lang.String XMY0190) {
		_vrTechnicalSpec_XMYPart3.setXMY0190(XMY0190);
	}

	/**
	* Sets the xmy0191 of this vr technical spec_xmy part3.
	*
	* @param XMY0191 the xmy0191 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0191(java.lang.String XMY0191) {
		_vrTechnicalSpec_XMYPart3.setXMY0191(XMY0191);
	}

	/**
	* Sets the xmy0192 of this vr technical spec_xmy part3.
	*
	* @param XMY0192 the xmy0192 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0192(java.lang.String XMY0192) {
		_vrTechnicalSpec_XMYPart3.setXMY0192(XMY0192);
	}

	/**
	* Sets the xmy0193 of this vr technical spec_xmy part3.
	*
	* @param XMY0193 the xmy0193 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0193(java.lang.String XMY0193) {
		_vrTechnicalSpec_XMYPart3.setXMY0193(XMY0193);
	}

	/**
	* Sets the xmy0194 of this vr technical spec_xmy part3.
	*
	* @param XMY0194 the xmy0194 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0194(java.lang.String XMY0194) {
		_vrTechnicalSpec_XMYPart3.setXMY0194(XMY0194);
	}

	/**
	* Sets the xmy0195 of this vr technical spec_xmy part3.
	*
	* @param XMY0195 the xmy0195 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0195(java.lang.String XMY0195) {
		_vrTechnicalSpec_XMYPart3.setXMY0195(XMY0195);
	}

	/**
	* Sets the xmy0196 of this vr technical spec_xmy part3.
	*
	* @param XMY0196 the xmy0196 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0196(java.lang.String XMY0196) {
		_vrTechnicalSpec_XMYPart3.setXMY0196(XMY0196);
	}

	/**
	* Sets the xmy0197 of this vr technical spec_xmy part3.
	*
	* @param XMY0197 the xmy0197 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0197(java.lang.String XMY0197) {
		_vrTechnicalSpec_XMYPart3.setXMY0197(XMY0197);
	}

	/**
	* Sets the xmy0198 of this vr technical spec_xmy part3.
	*
	* @param XMY0198 the xmy0198 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0198(java.lang.String XMY0198) {
		_vrTechnicalSpec_XMYPart3.setXMY0198(XMY0198);
	}

	/**
	* Sets the xmy0199 of this vr technical spec_xmy part3.
	*
	* @param XMY0199 the xmy0199 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0199(java.lang.String XMY0199) {
		_vrTechnicalSpec_XMYPart3.setXMY0199(XMY0199);
	}

	/**
	* Sets the xmy0200 of this vr technical spec_xmy part3.
	*
	* @param XMY0200 the xmy0200 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0200(java.lang.String XMY0200) {
		_vrTechnicalSpec_XMYPart3.setXMY0200(XMY0200);
	}

	/**
	* Sets the xmy0201 of this vr technical spec_xmy part3.
	*
	* @param XMY0201 the xmy0201 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0201(java.lang.String XMY0201) {
		_vrTechnicalSpec_XMYPart3.setXMY0201(XMY0201);
	}

	/**
	* Sets the xmy0202 of this vr technical spec_xmy part3.
	*
	* @param XMY0202 the xmy0202 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0202(java.lang.String XMY0202) {
		_vrTechnicalSpec_XMYPart3.setXMY0202(XMY0202);
	}

	/**
	* Sets the xmy0203 of this vr technical spec_xmy part3.
	*
	* @param XMY0203 the xmy0203 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0203(java.lang.String XMY0203) {
		_vrTechnicalSpec_XMYPart3.setXMY0203(XMY0203);
	}

	/**
	* Sets the xmy0204 of this vr technical spec_xmy part3.
	*
	* @param XMY0204 the xmy0204 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0204(java.lang.String XMY0204) {
		_vrTechnicalSpec_XMYPart3.setXMY0204(XMY0204);
	}

	/**
	* Sets the xmy0205 of this vr technical spec_xmy part3.
	*
	* @param XMY0205 the xmy0205 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0205(java.lang.String XMY0205) {
		_vrTechnicalSpec_XMYPart3.setXMY0205(XMY0205);
	}

	/**
	* Sets the xmy0207 of this vr technical spec_xmy part3.
	*
	* @param XMY0207 the xmy0207 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0207(java.lang.String XMY0207) {
		_vrTechnicalSpec_XMYPart3.setXMY0207(XMY0207);
	}

	/**
	* Sets the xmy0208 of this vr technical spec_xmy part3.
	*
	* @param XMY0208 the xmy0208 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0208(java.lang.String XMY0208) {
		_vrTechnicalSpec_XMYPart3.setXMY0208(XMY0208);
	}

	/**
	* Sets the xmy0209 of this vr technical spec_xmy part3.
	*
	* @param XMY0209 the xmy0209 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0209(java.lang.String XMY0209) {
		_vrTechnicalSpec_XMYPart3.setXMY0209(XMY0209);
	}

	/**
	* Sets the xmy0210 of this vr technical spec_xmy part3.
	*
	* @param XMY0210 the xmy0210 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0210(java.lang.String XMY0210) {
		_vrTechnicalSpec_XMYPart3.setXMY0210(XMY0210);
	}

	/**
	* Sets the xmy0211 of this vr technical spec_xmy part3.
	*
	* @param XMY0211 the xmy0211 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0211(java.lang.String XMY0211) {
		_vrTechnicalSpec_XMYPart3.setXMY0211(XMY0211);
	}

	/**
	* Sets the xmy0212 of this vr technical spec_xmy part3.
	*
	* @param XMY0212 the xmy0212 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0212(java.lang.String XMY0212) {
		_vrTechnicalSpec_XMYPart3.setXMY0212(XMY0212);
	}

	/**
	* Sets the xmy0213 of this vr technical spec_xmy part3.
	*
	* @param XMY0213 the xmy0213 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0213(java.lang.String XMY0213) {
		_vrTechnicalSpec_XMYPart3.setXMY0213(XMY0213);
	}

	/**
	* Sets the xmy0214 of this vr technical spec_xmy part3.
	*
	* @param XMY0214 the xmy0214 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0214(java.lang.String XMY0214) {
		_vrTechnicalSpec_XMYPart3.setXMY0214(XMY0214);
	}

	/**
	* Sets the xmy0215 of this vr technical spec_xmy part3.
	*
	* @param XMY0215 the xmy0215 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0215(java.lang.String XMY0215) {
		_vrTechnicalSpec_XMYPart3.setXMY0215(XMY0215);
	}

	/**
	* Sets the xmy0216 of this vr technical spec_xmy part3.
	*
	* @param XMY0216 the xmy0216 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0216(java.lang.String XMY0216) {
		_vrTechnicalSpec_XMYPart3.setXMY0216(XMY0216);
	}

	/**
	* Sets the xmy0217 of this vr technical spec_xmy part3.
	*
	* @param XMY0217 the xmy0217 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0217(java.lang.String XMY0217) {
		_vrTechnicalSpec_XMYPart3.setXMY0217(XMY0217);
	}

	/**
	* Sets the xmy0218 of this vr technical spec_xmy part3.
	*
	* @param XMY0218 the xmy0218 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0218(java.lang.String XMY0218) {
		_vrTechnicalSpec_XMYPart3.setXMY0218(XMY0218);
	}

	/**
	* Sets the xmy0219 of this vr technical spec_xmy part3.
	*
	* @param XMY0219 the xmy0219 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0219(java.lang.String XMY0219) {
		_vrTechnicalSpec_XMYPart3.setXMY0219(XMY0219);
	}

	/**
	* Sets the xmy0220 of this vr technical spec_xmy part3.
	*
	* @param XMY0220 the xmy0220 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0220(java.lang.String XMY0220) {
		_vrTechnicalSpec_XMYPart3.setXMY0220(XMY0220);
	}

	/**
	* Sets the xmy0221 of this vr technical spec_xmy part3.
	*
	* @param XMY0221 the xmy0221 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0221(java.lang.String XMY0221) {
		_vrTechnicalSpec_XMYPart3.setXMY0221(XMY0221);
	}

	/**
	* Sets the xmy0222 of this vr technical spec_xmy part3.
	*
	* @param XMY0222 the xmy0222 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0222(java.lang.String XMY0222) {
		_vrTechnicalSpec_XMYPart3.setXMY0222(XMY0222);
	}

	/**
	* Sets the xmy0223 of this vr technical spec_xmy part3.
	*
	* @param XMY0223 the xmy0223 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0223(java.lang.String XMY0223) {
		_vrTechnicalSpec_XMYPart3.setXMY0223(XMY0223);
	}

	/**
	* Sets the xmy0224 of this vr technical spec_xmy part3.
	*
	* @param XMY0224 the xmy0224 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0224(java.lang.String XMY0224) {
		_vrTechnicalSpec_XMYPart3.setXMY0224(XMY0224);
	}

	/**
	* Sets the xmy0225 of this vr technical spec_xmy part3.
	*
	* @param XMY0225 the xmy0225 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0225(java.lang.String XMY0225) {
		_vrTechnicalSpec_XMYPart3.setXMY0225(XMY0225);
	}

	/**
	* Sets the xmy0226 of this vr technical spec_xmy part3.
	*
	* @param XMY0226 the xmy0226 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0226(java.lang.String XMY0226) {
		_vrTechnicalSpec_XMYPart3.setXMY0226(XMY0226);
	}

	/**
	* Sets the xmy0227 of this vr technical spec_xmy part3.
	*
	* @param XMY0227 the xmy0227 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0227(java.lang.String XMY0227) {
		_vrTechnicalSpec_XMYPart3.setXMY0227(XMY0227);
	}

	/**
	* Sets the xmy0228 of this vr technical spec_xmy part3.
	*
	* @param XMY0228 the xmy0228 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0228(java.lang.String XMY0228) {
		_vrTechnicalSpec_XMYPart3.setXMY0228(XMY0228);
	}

	/**
	* Sets the xmy0229 of this vr technical spec_xmy part3.
	*
	* @param XMY0229 the xmy0229 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0229(java.lang.String XMY0229) {
		_vrTechnicalSpec_XMYPart3.setXMY0229(XMY0229);
	}

	/**
	* Sets the xmy0230 of this vr technical spec_xmy part3.
	*
	* @param XMY0230 the xmy0230 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0230(java.lang.String XMY0230) {
		_vrTechnicalSpec_XMYPart3.setXMY0230(XMY0230);
	}

	/**
	* Sets the xmy0231 of this vr technical spec_xmy part3.
	*
	* @param XMY0231 the xmy0231 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0231(java.lang.String XMY0231) {
		_vrTechnicalSpec_XMYPart3.setXMY0231(XMY0231);
	}

	/**
	* Sets the xmy0232 of this vr technical spec_xmy part3.
	*
	* @param XMY0232 the xmy0232 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0232(java.lang.String XMY0232) {
		_vrTechnicalSpec_XMYPart3.setXMY0232(XMY0232);
	}

	/**
	* Sets the xmy0233 of this vr technical spec_xmy part3.
	*
	* @param XMY0233 the xmy0233 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0233(java.lang.String XMY0233) {
		_vrTechnicalSpec_XMYPart3.setXMY0233(XMY0233);
	}

	/**
	* Sets the xmy0234 of this vr technical spec_xmy part3.
	*
	* @param XMY0234 the xmy0234 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0234(java.lang.String XMY0234) {
		_vrTechnicalSpec_XMYPart3.setXMY0234(XMY0234);
	}

	/**
	* Sets the xmy0235 of this vr technical spec_xmy part3.
	*
	* @param XMY0235 the xmy0235 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0235(java.lang.String XMY0235) {
		_vrTechnicalSpec_XMYPart3.setXMY0235(XMY0235);
	}

	/**
	* Sets the xmy0236 of this vr technical spec_xmy part3.
	*
	* @param XMY0236 the xmy0236 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0236(java.lang.String XMY0236) {
		_vrTechnicalSpec_XMYPart3.setXMY0236(XMY0236);
	}

	/**
	* Sets the xmy0237 of this vr technical spec_xmy part3.
	*
	* @param XMY0237 the xmy0237 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0237(java.lang.String XMY0237) {
		_vrTechnicalSpec_XMYPart3.setXMY0237(XMY0237);
	}

	/**
	* Sets the xmy0238 of this vr technical spec_xmy part3.
	*
	* @param XMY0238 the xmy0238 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0238(java.lang.String XMY0238) {
		_vrTechnicalSpec_XMYPart3.setXMY0238(XMY0238);
	}

	/**
	* Sets the xmy0239 of this vr technical spec_xmy part3.
	*
	* @param XMY0239 the xmy0239 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0239(java.lang.String XMY0239) {
		_vrTechnicalSpec_XMYPart3.setXMY0239(XMY0239);
	}

	/**
	* Sets the xmy0240 of this vr technical spec_xmy part3.
	*
	* @param XMY0240 the xmy0240 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0240(java.lang.String XMY0240) {
		_vrTechnicalSpec_XMYPart3.setXMY0240(XMY0240);
	}

	/**
	* Sets the xmy0241 of this vr technical spec_xmy part3.
	*
	* @param XMY0241 the xmy0241 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0241(java.lang.String XMY0241) {
		_vrTechnicalSpec_XMYPart3.setXMY0241(XMY0241);
	}

	/**
	* Sets the xmy0242 of this vr technical spec_xmy part3.
	*
	* @param XMY0242 the xmy0242 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0242(java.lang.String XMY0242) {
		_vrTechnicalSpec_XMYPart3.setXMY0242(XMY0242);
	}

	/**
	* Sets the xmy0243 of this vr technical spec_xmy part3.
	*
	* @param XMY0243 the xmy0243 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0243(java.lang.String XMY0243) {
		_vrTechnicalSpec_XMYPart3.setXMY0243(XMY0243);
	}

	/**
	* Sets the xmy0244 of this vr technical spec_xmy part3.
	*
	* @param XMY0244 the xmy0244 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0244(java.lang.String XMY0244) {
		_vrTechnicalSpec_XMYPart3.setXMY0244(XMY0244);
	}

	/**
	* Sets the xmy0245 of this vr technical spec_xmy part3.
	*
	* @param XMY0245 the xmy0245 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0245(java.lang.String XMY0245) {
		_vrTechnicalSpec_XMYPart3.setXMY0245(XMY0245);
	}

	/**
	* Sets the xmy0246 of this vr technical spec_xmy part3.
	*
	* @param XMY0246 the xmy0246 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0246(java.lang.String XMY0246) {
		_vrTechnicalSpec_XMYPart3.setXMY0246(XMY0246);
	}

	/**
	* Sets the xmy0247 of this vr technical spec_xmy part3.
	*
	* @param XMY0247 the xmy0247 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0247(java.lang.String XMY0247) {
		_vrTechnicalSpec_XMYPart3.setXMY0247(XMY0247);
	}

	/**
	* Sets the xmy0248 of this vr technical spec_xmy part3.
	*
	* @param XMY0248 the xmy0248 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0248(java.lang.String XMY0248) {
		_vrTechnicalSpec_XMYPart3.setXMY0248(XMY0248);
	}

	/**
	* Sets the xmy0249 of this vr technical spec_xmy part3.
	*
	* @param XMY0249 the xmy0249 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0249(java.lang.String XMY0249) {
		_vrTechnicalSpec_XMYPart3.setXMY0249(XMY0249);
	}

	/**
	* Sets the xmy0250 of this vr technical spec_xmy part3.
	*
	* @param XMY0250 the xmy0250 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0250(java.lang.String XMY0250) {
		_vrTechnicalSpec_XMYPart3.setXMY0250(XMY0250);
	}

	/**
	* Sets the xmy0251 of this vr technical spec_xmy part3.
	*
	* @param XMY0251 the xmy0251 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0251(java.lang.String XMY0251) {
		_vrTechnicalSpec_XMYPart3.setXMY0251(XMY0251);
	}

	/**
	* Sets the xmy0252 of this vr technical spec_xmy part3.
	*
	* @param XMY0252 the xmy0252 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0252(java.lang.String XMY0252) {
		_vrTechnicalSpec_XMYPart3.setXMY0252(XMY0252);
	}

	/**
	* Sets the xmy0253 of this vr technical spec_xmy part3.
	*
	* @param XMY0253 the xmy0253 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0253(java.lang.String XMY0253) {
		_vrTechnicalSpec_XMYPart3.setXMY0253(XMY0253);
	}

	/**
	* Sets the xmy0254 of this vr technical spec_xmy part3.
	*
	* @param XMY0254 the xmy0254 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0254(java.lang.String XMY0254) {
		_vrTechnicalSpec_XMYPart3.setXMY0254(XMY0254);
	}

	/**
	* Sets the xmy0255 of this vr technical spec_xmy part3.
	*
	* @param XMY0255 the xmy0255 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0255(java.lang.String XMY0255) {
		_vrTechnicalSpec_XMYPart3.setXMY0255(XMY0255);
	}

	/**
	* Sets the xmy0256 of this vr technical spec_xmy part3.
	*
	* @param XMY0256 the xmy0256 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0256(java.lang.String XMY0256) {
		_vrTechnicalSpec_XMYPart3.setXMY0256(XMY0256);
	}

	/**
	* Sets the xmy0257 of this vr technical spec_xmy part3.
	*
	* @param XMY0257 the xmy0257 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0257(java.lang.String XMY0257) {
		_vrTechnicalSpec_XMYPart3.setXMY0257(XMY0257);
	}

	/**
	* Sets the xmy0258 of this vr technical spec_xmy part3.
	*
	* @param XMY0258 the xmy0258 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0258(java.lang.String XMY0258) {
		_vrTechnicalSpec_XMYPart3.setXMY0258(XMY0258);
	}

	/**
	* Sets the xmy0259 of this vr technical spec_xmy part3.
	*
	* @param XMY0259 the xmy0259 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0259(java.lang.String XMY0259) {
		_vrTechnicalSpec_XMYPart3.setXMY0259(XMY0259);
	}

	/**
	* Sets the xmy0260 of this vr technical spec_xmy part3.
	*
	* @param XMY0260 the xmy0260 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0260(java.lang.String XMY0260) {
		_vrTechnicalSpec_XMYPart3.setXMY0260(XMY0260);
	}

	/**
	* Sets the xmy0261 of this vr technical spec_xmy part3.
	*
	* @param XMY0261 the xmy0261 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0261(java.lang.String XMY0261) {
		_vrTechnicalSpec_XMYPart3.setXMY0261(XMY0261);
	}

	/**
	* Sets the xmy0262 of this vr technical spec_xmy part3.
	*
	* @param XMY0262 the xmy0262 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0262(java.lang.String XMY0262) {
		_vrTechnicalSpec_XMYPart3.setXMY0262(XMY0262);
	}

	/**
	* Sets the xmy0263 of this vr technical spec_xmy part3.
	*
	* @param XMY0263 the xmy0263 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0263(java.lang.String XMY0263) {
		_vrTechnicalSpec_XMYPart3.setXMY0263(XMY0263);
	}

	/**
	* Sets the xmy0264 of this vr technical spec_xmy part3.
	*
	* @param XMY0264 the xmy0264 of this vr technical spec_xmy part3
	*/
	@Override
	public void setXMY0264(java.lang.String XMY0264) {
		_vrTechnicalSpec_XMYPart3.setXMY0264(XMY0264);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XMYPart3Wrapper)) {
			return false;
		}

		VRTechnicalSpec_XMYPart3Wrapper vrTechnicalSpec_XMYPart3Wrapper = (VRTechnicalSpec_XMYPart3Wrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XMYPart3,
					vrTechnicalSpec_XMYPart3Wrapper._vrTechnicalSpec_XMYPart3)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XMYPart3 getWrappedModel() {
		return _vrTechnicalSpec_XMYPart3;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XMYPart3.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XMYPart3.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XMYPart3.resetOriginalValues();
	}

	private final VRTechnicalSpec_XMYPart3 _vrTechnicalSpec_XMYPart3;
}