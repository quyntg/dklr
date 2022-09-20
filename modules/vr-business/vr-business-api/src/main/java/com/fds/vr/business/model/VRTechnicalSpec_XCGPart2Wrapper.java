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
 * This class is a wrapper for {@link VRTechnicalSpec_XCGPart2}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart2
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart2Wrapper implements VRTechnicalSpec_XCGPart2,
	ModelWrapper<VRTechnicalSpec_XCGPart2> {
	public VRTechnicalSpec_XCGPart2Wrapper(
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2) {
		_vrTechnicalSpec_XCGPart2 = vrTechnicalSpec_XCGPart2;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XCGPart2.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XCGPart2.class.getName();
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
		attributes.put("XCG01163", getXCG01163());
		attributes.put("XCG01164", getXCG01164());
		attributes.put("XCG01165", getXCG01165());
		attributes.put("XCG01166", getXCG01166());
		attributes.put("XCG01167", getXCG01167());
		attributes.put("XCG01169", getXCG01169());
		attributes.put("XCG01170", getXCG01170());
		attributes.put("XCG01171", getXCG01171());
		attributes.put("XCG01172", getXCG01172());
		attributes.put("XCG01173", getXCG01173());
		attributes.put("XCG01174", getXCG01174());
		attributes.put("XCG01175", getXCG01175());
		attributes.put("XCG01176", getXCG01176());
		attributes.put("XCG01177", getXCG01177());
		attributes.put("XCG01178", getXCG01178());
		attributes.put("XCG01179", getXCG01179());
		attributes.put("XCG01180", getXCG01180());
		attributes.put("XCG01181", getXCG01181());
		attributes.put("XCG01182", getXCG01182());
		attributes.put("XCG01183", getXCG01183());
		attributes.put("XCG01184", getXCG01184());
		attributes.put("XCG01185", getXCG01185());
		attributes.put("XCG01186", getXCG01186());
		attributes.put("XCG01187", getXCG01187());
		attributes.put("XCG01188", getXCG01188());
		attributes.put("XCG01189", getXCG01189());
		attributes.put("XCG01190", getXCG01190());
		attributes.put("XCG01191", getXCG01191());
		attributes.put("XCG01192", getXCG01192());
		attributes.put("XCG01193", getXCG01193());
		attributes.put("XCG01194", getXCG01194());
		attributes.put("XCG01195", getXCG01195());
		attributes.put("XCG01196", getXCG01196());
		attributes.put("XCG01197", getXCG01197());
		attributes.put("XCG01198", getXCG01198());
		attributes.put("XCG01199", getXCG01199());
		attributes.put("XCG01200", getXCG01200());
		attributes.put("XCG01202", getXCG01202());
		attributes.put("XCG01203", getXCG01203());
		attributes.put("XCG01204", getXCG01204());
		attributes.put("XCG01205", getXCG01205());
		attributes.put("XCG01206", getXCG01206());
		attributes.put("XCG01207", getXCG01207());
		attributes.put("XCG01208", getXCG01208());
		attributes.put("XCG01209", getXCG01209());
		attributes.put("XCG01210", getXCG01210());
		attributes.put("XCG01212", getXCG01212());
		attributes.put("XCG01213", getXCG01213());
		attributes.put("XCG01214", getXCG01214());
		attributes.put("XCG01215", getXCG01215());
		attributes.put("XCG01216", getXCG01216());
		attributes.put("XCG01217", getXCG01217());
		attributes.put("XCG01218", getXCG01218());
		attributes.put("XCG01219", getXCG01219());
		attributes.put("XCG01220", getXCG01220());
		attributes.put("XCG01221", getXCG01221());
		attributes.put("XCG01222", getXCG01222());
		attributes.put("XCG01223", getXCG01223());
		attributes.put("XCG01224", getXCG01224());
		attributes.put("XCG01225", getXCG01225());
		attributes.put("XCG01226", getXCG01226());
		attributes.put("XCG01228", getXCG01228());
		attributes.put("XCG01230", getXCG01230());
		attributes.put("XCG01231", getXCG01231());
		attributes.put("XCG01232", getXCG01232());
		attributes.put("XCG01234", getXCG01234());
		attributes.put("XCG01236", getXCG01236());
		attributes.put("XCG01237", getXCG01237());
		attributes.put("XCG01229", getXCG01229());
		attributes.put("XCG01238", getXCG01238());
		attributes.put("XCG01239", getXCG01239());
		attributes.put("XCG01240", getXCG01240());
		attributes.put("XCG01241", getXCG01241());
		attributes.put("XCG01242", getXCG01242());
		attributes.put("XCG01243", getXCG01243());
		attributes.put("XCG01235", getXCG01235());
		attributes.put("XCG01244", getXCG01244());
		attributes.put("XCG01245", getXCG01245());
		attributes.put("XCG01246", getXCG01246());
		attributes.put("XCG01247", getXCG01247());
		attributes.put("XCG01248", getXCG01248());
		attributes.put("XCG01249", getXCG01249());
		attributes.put("XCG11248", getXCG11248());
		attributes.put("XCG11249", getXCG11249());
		attributes.put("XCG01250", getXCG01250());
		attributes.put("XCG01251", getXCG01251());
		attributes.put("XCG01252", getXCG01252());
		attributes.put("XCG01253", getXCG01253());
		attributes.put("XCG01255", getXCG01255());
		attributes.put("XCG01256", getXCG01256());
		attributes.put("XCG01257", getXCG01257());
		attributes.put("XCG01258", getXCG01258());
		attributes.put("XCG01259", getXCG01259());
		attributes.put("XCG01260", getXCG01260());
		attributes.put("XCG01261", getXCG01261());
		attributes.put("XCG01262", getXCG01262());
		attributes.put("XCG11253", getXCG11253());
		attributes.put("XCG01263", getXCG01263());
		attributes.put("XCG01264", getXCG01264());
		attributes.put("XCG01265", getXCG01265());
		attributes.put("XCG01266", getXCG01266());
		attributes.put("XCG01901", getXCG01901());
		attributes.put("XCG01267", getXCG01267());
		attributes.put("XCG01902", getXCG01902());
		attributes.put("XCG01268", getXCG01268());
		attributes.put("XCG01269", getXCG01269());
		attributes.put("XCG01903", getXCG01903());
		attributes.put("XCG01270", getXCG01270());
		attributes.put("XCG01271", getXCG01271());
		attributes.put("XCG01273", getXCG01273());
		attributes.put("XCG01274", getXCG01274());
		attributes.put("XCG01275", getXCG01275());
		attributes.put("XCG01276", getXCG01276());
		attributes.put("XCG01277", getXCG01277());
		attributes.put("XCG01278", getXCG01278());
		attributes.put("XCG01279", getXCG01279());
		attributes.put("XCG01280", getXCG01280());
		attributes.put("XCG01281", getXCG01281());
		attributes.put("XCG01282", getXCG01282());
		attributes.put("XCG01283", getXCG01283());
		attributes.put("XCG01284", getXCG01284());
		attributes.put("XCG01285", getXCG01285());
		attributes.put("XCG01286", getXCG01286());
		attributes.put("XCG01287", getXCG01287());
		attributes.put("XCG01288", getXCG01288());
		attributes.put("XCG01289", getXCG01289());
		attributes.put("XCG01290", getXCG01290());
		attributes.put("XCG01291", getXCG01291());
		attributes.put("XCG01292", getXCG01292());
		attributes.put("XCG01293", getXCG01293());
		attributes.put("XCG01294", getXCG01294());
		attributes.put("XCG01295", getXCG01295());
		attributes.put("XCG01296", getXCG01296());
		attributes.put("XCG01297", getXCG01297());
		attributes.put("XCG01298", getXCG01298());
		attributes.put("XCG01300", getXCG01300());
		attributes.put("XCG01301", getXCG01301());
		attributes.put("XCG01302", getXCG01302());
		attributes.put("XCG01303", getXCG01303());
		attributes.put("XCG01304", getXCG01304());
		attributes.put("XCG01305", getXCG01305());
		attributes.put("XCG01306", getXCG01306());
		attributes.put("XCG01307", getXCG01307());
		attributes.put("XCG01308", getXCG01308());
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

		String XCG01163 = (String)attributes.get("XCG01163");

		if (XCG01163 != null) {
			setXCG01163(XCG01163);
		}

		String XCG01164 = (String)attributes.get("XCG01164");

		if (XCG01164 != null) {
			setXCG01164(XCG01164);
		}

		String XCG01165 = (String)attributes.get("XCG01165");

		if (XCG01165 != null) {
			setXCG01165(XCG01165);
		}

		String XCG01166 = (String)attributes.get("XCG01166");

		if (XCG01166 != null) {
			setXCG01166(XCG01166);
		}

		String XCG01167 = (String)attributes.get("XCG01167");

		if (XCG01167 != null) {
			setXCG01167(XCG01167);
		}

		String XCG01169 = (String)attributes.get("XCG01169");

		if (XCG01169 != null) {
			setXCG01169(XCG01169);
		}

		String XCG01170 = (String)attributes.get("XCG01170");

		if (XCG01170 != null) {
			setXCG01170(XCG01170);
		}

		String XCG01171 = (String)attributes.get("XCG01171");

		if (XCG01171 != null) {
			setXCG01171(XCG01171);
		}

		String XCG01172 = (String)attributes.get("XCG01172");

		if (XCG01172 != null) {
			setXCG01172(XCG01172);
		}

		String XCG01173 = (String)attributes.get("XCG01173");

		if (XCG01173 != null) {
			setXCG01173(XCG01173);
		}

		String XCG01174 = (String)attributes.get("XCG01174");

		if (XCG01174 != null) {
			setXCG01174(XCG01174);
		}

		String XCG01175 = (String)attributes.get("XCG01175");

		if (XCG01175 != null) {
			setXCG01175(XCG01175);
		}

		String XCG01176 = (String)attributes.get("XCG01176");

		if (XCG01176 != null) {
			setXCG01176(XCG01176);
		}

		String XCG01177 = (String)attributes.get("XCG01177");

		if (XCG01177 != null) {
			setXCG01177(XCG01177);
		}

		String XCG01178 = (String)attributes.get("XCG01178");

		if (XCG01178 != null) {
			setXCG01178(XCG01178);
		}

		String XCG01179 = (String)attributes.get("XCG01179");

		if (XCG01179 != null) {
			setXCG01179(XCG01179);
		}

		String XCG01180 = (String)attributes.get("XCG01180");

		if (XCG01180 != null) {
			setXCG01180(XCG01180);
		}

		String XCG01181 = (String)attributes.get("XCG01181");

		if (XCG01181 != null) {
			setXCG01181(XCG01181);
		}

		String XCG01182 = (String)attributes.get("XCG01182");

		if (XCG01182 != null) {
			setXCG01182(XCG01182);
		}

		String XCG01183 = (String)attributes.get("XCG01183");

		if (XCG01183 != null) {
			setXCG01183(XCG01183);
		}

		String XCG01184 = (String)attributes.get("XCG01184");

		if (XCG01184 != null) {
			setXCG01184(XCG01184);
		}

		String XCG01185 = (String)attributes.get("XCG01185");

		if (XCG01185 != null) {
			setXCG01185(XCG01185);
		}

		String XCG01186 = (String)attributes.get("XCG01186");

		if (XCG01186 != null) {
			setXCG01186(XCG01186);
		}

		String XCG01187 = (String)attributes.get("XCG01187");

		if (XCG01187 != null) {
			setXCG01187(XCG01187);
		}

		String XCG01188 = (String)attributes.get("XCG01188");

		if (XCG01188 != null) {
			setXCG01188(XCG01188);
		}

		String XCG01189 = (String)attributes.get("XCG01189");

		if (XCG01189 != null) {
			setXCG01189(XCG01189);
		}

		String XCG01190 = (String)attributes.get("XCG01190");

		if (XCG01190 != null) {
			setXCG01190(XCG01190);
		}

		String XCG01191 = (String)attributes.get("XCG01191");

		if (XCG01191 != null) {
			setXCG01191(XCG01191);
		}

		String XCG01192 = (String)attributes.get("XCG01192");

		if (XCG01192 != null) {
			setXCG01192(XCG01192);
		}

		String XCG01193 = (String)attributes.get("XCG01193");

		if (XCG01193 != null) {
			setXCG01193(XCG01193);
		}

		String XCG01194 = (String)attributes.get("XCG01194");

		if (XCG01194 != null) {
			setXCG01194(XCG01194);
		}

		String XCG01195 = (String)attributes.get("XCG01195");

		if (XCG01195 != null) {
			setXCG01195(XCG01195);
		}

		String XCG01196 = (String)attributes.get("XCG01196");

		if (XCG01196 != null) {
			setXCG01196(XCG01196);
		}

		String XCG01197 = (String)attributes.get("XCG01197");

		if (XCG01197 != null) {
			setXCG01197(XCG01197);
		}

		String XCG01198 = (String)attributes.get("XCG01198");

		if (XCG01198 != null) {
			setXCG01198(XCG01198);
		}

		String XCG01199 = (String)attributes.get("XCG01199");

		if (XCG01199 != null) {
			setXCG01199(XCG01199);
		}

		String XCG01200 = (String)attributes.get("XCG01200");

		if (XCG01200 != null) {
			setXCG01200(XCG01200);
		}

		String XCG01202 = (String)attributes.get("XCG01202");

		if (XCG01202 != null) {
			setXCG01202(XCG01202);
		}

		String XCG01203 = (String)attributes.get("XCG01203");

		if (XCG01203 != null) {
			setXCG01203(XCG01203);
		}

		String XCG01204 = (String)attributes.get("XCG01204");

		if (XCG01204 != null) {
			setXCG01204(XCG01204);
		}

		String XCG01205 = (String)attributes.get("XCG01205");

		if (XCG01205 != null) {
			setXCG01205(XCG01205);
		}

		String XCG01206 = (String)attributes.get("XCG01206");

		if (XCG01206 != null) {
			setXCG01206(XCG01206);
		}

		String XCG01207 = (String)attributes.get("XCG01207");

		if (XCG01207 != null) {
			setXCG01207(XCG01207);
		}

		String XCG01208 = (String)attributes.get("XCG01208");

		if (XCG01208 != null) {
			setXCG01208(XCG01208);
		}

		String XCG01209 = (String)attributes.get("XCG01209");

		if (XCG01209 != null) {
			setXCG01209(XCG01209);
		}

		String XCG01210 = (String)attributes.get("XCG01210");

		if (XCG01210 != null) {
			setXCG01210(XCG01210);
		}

		String XCG01212 = (String)attributes.get("XCG01212");

		if (XCG01212 != null) {
			setXCG01212(XCG01212);
		}

		String XCG01213 = (String)attributes.get("XCG01213");

		if (XCG01213 != null) {
			setXCG01213(XCG01213);
		}

		String XCG01214 = (String)attributes.get("XCG01214");

		if (XCG01214 != null) {
			setXCG01214(XCG01214);
		}

		String XCG01215 = (String)attributes.get("XCG01215");

		if (XCG01215 != null) {
			setXCG01215(XCG01215);
		}

		String XCG01216 = (String)attributes.get("XCG01216");

		if (XCG01216 != null) {
			setXCG01216(XCG01216);
		}

		String XCG01217 = (String)attributes.get("XCG01217");

		if (XCG01217 != null) {
			setXCG01217(XCG01217);
		}

		String XCG01218 = (String)attributes.get("XCG01218");

		if (XCG01218 != null) {
			setXCG01218(XCG01218);
		}

		String XCG01219 = (String)attributes.get("XCG01219");

		if (XCG01219 != null) {
			setXCG01219(XCG01219);
		}

		String XCG01220 = (String)attributes.get("XCG01220");

		if (XCG01220 != null) {
			setXCG01220(XCG01220);
		}

		String XCG01221 = (String)attributes.get("XCG01221");

		if (XCG01221 != null) {
			setXCG01221(XCG01221);
		}

		String XCG01222 = (String)attributes.get("XCG01222");

		if (XCG01222 != null) {
			setXCG01222(XCG01222);
		}

		String XCG01223 = (String)attributes.get("XCG01223");

		if (XCG01223 != null) {
			setXCG01223(XCG01223);
		}

		String XCG01224 = (String)attributes.get("XCG01224");

		if (XCG01224 != null) {
			setXCG01224(XCG01224);
		}

		String XCG01225 = (String)attributes.get("XCG01225");

		if (XCG01225 != null) {
			setXCG01225(XCG01225);
		}

		String XCG01226 = (String)attributes.get("XCG01226");

		if (XCG01226 != null) {
			setXCG01226(XCG01226);
		}

		String XCG01228 = (String)attributes.get("XCG01228");

		if (XCG01228 != null) {
			setXCG01228(XCG01228);
		}

		String XCG01230 = (String)attributes.get("XCG01230");

		if (XCG01230 != null) {
			setXCG01230(XCG01230);
		}

		String XCG01231 = (String)attributes.get("XCG01231");

		if (XCG01231 != null) {
			setXCG01231(XCG01231);
		}

		String XCG01232 = (String)attributes.get("XCG01232");

		if (XCG01232 != null) {
			setXCG01232(XCG01232);
		}

		String XCG01234 = (String)attributes.get("XCG01234");

		if (XCG01234 != null) {
			setXCG01234(XCG01234);
		}

		String XCG01236 = (String)attributes.get("XCG01236");

		if (XCG01236 != null) {
			setXCG01236(XCG01236);
		}

		String XCG01237 = (String)attributes.get("XCG01237");

		if (XCG01237 != null) {
			setXCG01237(XCG01237);
		}

		String XCG01229 = (String)attributes.get("XCG01229");

		if (XCG01229 != null) {
			setXCG01229(XCG01229);
		}

		String XCG01238 = (String)attributes.get("XCG01238");

		if (XCG01238 != null) {
			setXCG01238(XCG01238);
		}

		String XCG01239 = (String)attributes.get("XCG01239");

		if (XCG01239 != null) {
			setXCG01239(XCG01239);
		}

		String XCG01240 = (String)attributes.get("XCG01240");

		if (XCG01240 != null) {
			setXCG01240(XCG01240);
		}

		String XCG01241 = (String)attributes.get("XCG01241");

		if (XCG01241 != null) {
			setXCG01241(XCG01241);
		}

		String XCG01242 = (String)attributes.get("XCG01242");

		if (XCG01242 != null) {
			setXCG01242(XCG01242);
		}

		String XCG01243 = (String)attributes.get("XCG01243");

		if (XCG01243 != null) {
			setXCG01243(XCG01243);
		}

		String XCG01235 = (String)attributes.get("XCG01235");

		if (XCG01235 != null) {
			setXCG01235(XCG01235);
		}

		String XCG01244 = (String)attributes.get("XCG01244");

		if (XCG01244 != null) {
			setXCG01244(XCG01244);
		}

		String XCG01245 = (String)attributes.get("XCG01245");

		if (XCG01245 != null) {
			setXCG01245(XCG01245);
		}

		String XCG01246 = (String)attributes.get("XCG01246");

		if (XCG01246 != null) {
			setXCG01246(XCG01246);
		}

		String XCG01247 = (String)attributes.get("XCG01247");

		if (XCG01247 != null) {
			setXCG01247(XCG01247);
		}

		String XCG01248 = (String)attributes.get("XCG01248");

		if (XCG01248 != null) {
			setXCG01248(XCG01248);
		}

		String XCG01249 = (String)attributes.get("XCG01249");

		if (XCG01249 != null) {
			setXCG01249(XCG01249);
		}

		String XCG11248 = (String)attributes.get("XCG11248");

		if (XCG11248 != null) {
			setXCG11248(XCG11248);
		}

		String XCG11249 = (String)attributes.get("XCG11249");

		if (XCG11249 != null) {
			setXCG11249(XCG11249);
		}

		String XCG01250 = (String)attributes.get("XCG01250");

		if (XCG01250 != null) {
			setXCG01250(XCG01250);
		}

		String XCG01251 = (String)attributes.get("XCG01251");

		if (XCG01251 != null) {
			setXCG01251(XCG01251);
		}

		String XCG01252 = (String)attributes.get("XCG01252");

		if (XCG01252 != null) {
			setXCG01252(XCG01252);
		}

		String XCG01253 = (String)attributes.get("XCG01253");

		if (XCG01253 != null) {
			setXCG01253(XCG01253);
		}

		String XCG01255 = (String)attributes.get("XCG01255");

		if (XCG01255 != null) {
			setXCG01255(XCG01255);
		}

		String XCG01256 = (String)attributes.get("XCG01256");

		if (XCG01256 != null) {
			setXCG01256(XCG01256);
		}

		String XCG01257 = (String)attributes.get("XCG01257");

		if (XCG01257 != null) {
			setXCG01257(XCG01257);
		}

		String XCG01258 = (String)attributes.get("XCG01258");

		if (XCG01258 != null) {
			setXCG01258(XCG01258);
		}

		String XCG01259 = (String)attributes.get("XCG01259");

		if (XCG01259 != null) {
			setXCG01259(XCG01259);
		}

		String XCG01260 = (String)attributes.get("XCG01260");

		if (XCG01260 != null) {
			setXCG01260(XCG01260);
		}

		String XCG01261 = (String)attributes.get("XCG01261");

		if (XCG01261 != null) {
			setXCG01261(XCG01261);
		}

		String XCG01262 = (String)attributes.get("XCG01262");

		if (XCG01262 != null) {
			setXCG01262(XCG01262);
		}

		String XCG11253 = (String)attributes.get("XCG11253");

		if (XCG11253 != null) {
			setXCG11253(XCG11253);
		}

		String XCG01263 = (String)attributes.get("XCG01263");

		if (XCG01263 != null) {
			setXCG01263(XCG01263);
		}

		String XCG01264 = (String)attributes.get("XCG01264");

		if (XCG01264 != null) {
			setXCG01264(XCG01264);
		}

		String XCG01265 = (String)attributes.get("XCG01265");

		if (XCG01265 != null) {
			setXCG01265(XCG01265);
		}

		String XCG01266 = (String)attributes.get("XCG01266");

		if (XCG01266 != null) {
			setXCG01266(XCG01266);
		}

		String XCG01901 = (String)attributes.get("XCG01901");

		if (XCG01901 != null) {
			setXCG01901(XCG01901);
		}

		String XCG01267 = (String)attributes.get("XCG01267");

		if (XCG01267 != null) {
			setXCG01267(XCG01267);
		}

		String XCG01902 = (String)attributes.get("XCG01902");

		if (XCG01902 != null) {
			setXCG01902(XCG01902);
		}

		String XCG01268 = (String)attributes.get("XCG01268");

		if (XCG01268 != null) {
			setXCG01268(XCG01268);
		}

		String XCG01269 = (String)attributes.get("XCG01269");

		if (XCG01269 != null) {
			setXCG01269(XCG01269);
		}

		String XCG01903 = (String)attributes.get("XCG01903");

		if (XCG01903 != null) {
			setXCG01903(XCG01903);
		}

		String XCG01270 = (String)attributes.get("XCG01270");

		if (XCG01270 != null) {
			setXCG01270(XCG01270);
		}

		String XCG01271 = (String)attributes.get("XCG01271");

		if (XCG01271 != null) {
			setXCG01271(XCG01271);
		}

		String XCG01273 = (String)attributes.get("XCG01273");

		if (XCG01273 != null) {
			setXCG01273(XCG01273);
		}

		String XCG01274 = (String)attributes.get("XCG01274");

		if (XCG01274 != null) {
			setXCG01274(XCG01274);
		}

		String XCG01275 = (String)attributes.get("XCG01275");

		if (XCG01275 != null) {
			setXCG01275(XCG01275);
		}

		String XCG01276 = (String)attributes.get("XCG01276");

		if (XCG01276 != null) {
			setXCG01276(XCG01276);
		}

		String XCG01277 = (String)attributes.get("XCG01277");

		if (XCG01277 != null) {
			setXCG01277(XCG01277);
		}

		String XCG01278 = (String)attributes.get("XCG01278");

		if (XCG01278 != null) {
			setXCG01278(XCG01278);
		}

		String XCG01279 = (String)attributes.get("XCG01279");

		if (XCG01279 != null) {
			setXCG01279(XCG01279);
		}

		String XCG01280 = (String)attributes.get("XCG01280");

		if (XCG01280 != null) {
			setXCG01280(XCG01280);
		}

		String XCG01281 = (String)attributes.get("XCG01281");

		if (XCG01281 != null) {
			setXCG01281(XCG01281);
		}

		String XCG01282 = (String)attributes.get("XCG01282");

		if (XCG01282 != null) {
			setXCG01282(XCG01282);
		}

		String XCG01283 = (String)attributes.get("XCG01283");

		if (XCG01283 != null) {
			setXCG01283(XCG01283);
		}

		String XCG01284 = (String)attributes.get("XCG01284");

		if (XCG01284 != null) {
			setXCG01284(XCG01284);
		}

		String XCG01285 = (String)attributes.get("XCG01285");

		if (XCG01285 != null) {
			setXCG01285(XCG01285);
		}

		String XCG01286 = (String)attributes.get("XCG01286");

		if (XCG01286 != null) {
			setXCG01286(XCG01286);
		}

		String XCG01287 = (String)attributes.get("XCG01287");

		if (XCG01287 != null) {
			setXCG01287(XCG01287);
		}

		String XCG01288 = (String)attributes.get("XCG01288");

		if (XCG01288 != null) {
			setXCG01288(XCG01288);
		}

		String XCG01289 = (String)attributes.get("XCG01289");

		if (XCG01289 != null) {
			setXCG01289(XCG01289);
		}

		String XCG01290 = (String)attributes.get("XCG01290");

		if (XCG01290 != null) {
			setXCG01290(XCG01290);
		}

		String XCG01291 = (String)attributes.get("XCG01291");

		if (XCG01291 != null) {
			setXCG01291(XCG01291);
		}

		String XCG01292 = (String)attributes.get("XCG01292");

		if (XCG01292 != null) {
			setXCG01292(XCG01292);
		}

		String XCG01293 = (String)attributes.get("XCG01293");

		if (XCG01293 != null) {
			setXCG01293(XCG01293);
		}

		String XCG01294 = (String)attributes.get("XCG01294");

		if (XCG01294 != null) {
			setXCG01294(XCG01294);
		}

		String XCG01295 = (String)attributes.get("XCG01295");

		if (XCG01295 != null) {
			setXCG01295(XCG01295);
		}

		String XCG01296 = (String)attributes.get("XCG01296");

		if (XCG01296 != null) {
			setXCG01296(XCG01296);
		}

		String XCG01297 = (String)attributes.get("XCG01297");

		if (XCG01297 != null) {
			setXCG01297(XCG01297);
		}

		String XCG01298 = (String)attributes.get("XCG01298");

		if (XCG01298 != null) {
			setXCG01298(XCG01298);
		}

		String XCG01300 = (String)attributes.get("XCG01300");

		if (XCG01300 != null) {
			setXCG01300(XCG01300);
		}

		String XCG01301 = (String)attributes.get("XCG01301");

		if (XCG01301 != null) {
			setXCG01301(XCG01301);
		}

		String XCG01302 = (String)attributes.get("XCG01302");

		if (XCG01302 != null) {
			setXCG01302(XCG01302);
		}

		String XCG01303 = (String)attributes.get("XCG01303");

		if (XCG01303 != null) {
			setXCG01303(XCG01303);
		}

		String XCG01304 = (String)attributes.get("XCG01304");

		if (XCG01304 != null) {
			setXCG01304(XCG01304);
		}

		String XCG01305 = (String)attributes.get("XCG01305");

		if (XCG01305 != null) {
			setXCG01305(XCG01305);
		}

		String XCG01306 = (String)attributes.get("XCG01306");

		if (XCG01306 != null) {
			setXCG01306(XCG01306);
		}

		String XCG01307 = (String)attributes.get("XCG01307");

		if (XCG01307 != null) {
			setXCG01307(XCG01307);
		}

		String XCG01308 = (String)attributes.get("XCG01308");

		if (XCG01308 != null) {
			setXCG01308(XCG01308);
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
	public VRTechnicalSpec_XCGPart2 toEscapedModel() {
		return new VRTechnicalSpec_XCGPart2Wrapper(_vrTechnicalSpec_XCGPart2.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XCGPart2 toUnescapedModel() {
		return new VRTechnicalSpec_XCGPart2Wrapper(_vrTechnicalSpec_XCGPart2.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XCGPart2.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XCGPart2.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XCGPart2.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XCGPart2.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XCGPart2> toCacheModel() {
		return _vrTechnicalSpec_XCGPart2.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2) {
		return _vrTechnicalSpec_XCGPart2.compareTo(vrTechnicalSpec_XCGPart2);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XCGPart2.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XCGPart2.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XCGPart2Wrapper((VRTechnicalSpec_XCGPart2)_vrTechnicalSpec_XCGPart2.clone());
	}

	/**
	* Returns the deliverable code of this vr technical spec_xcg part2.
	*
	* @return the deliverable code of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XCGPart2.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xcg part2.
	*
	* @return the dossier ID ctn of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XCGPart2.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xcg part2.
	*
	* @return the dossier no of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XCGPart2.getDossierNo();
	}

	/**
	* Returns the reference uid of this vr technical spec_xcg part2.
	*
	* @return the reference uid of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XCGPart2.getReferenceUid();
	}

	/**
	* Returns the xcg01163 of this vr technical spec_xcg part2.
	*
	* @return the xcg01163 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01163() {
		return _vrTechnicalSpec_XCGPart2.getXCG01163();
	}

	/**
	* Returns the xcg01164 of this vr technical spec_xcg part2.
	*
	* @return the xcg01164 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01164() {
		return _vrTechnicalSpec_XCGPart2.getXCG01164();
	}

	/**
	* Returns the xcg01165 of this vr technical spec_xcg part2.
	*
	* @return the xcg01165 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01165() {
		return _vrTechnicalSpec_XCGPart2.getXCG01165();
	}

	/**
	* Returns the xcg01166 of this vr technical spec_xcg part2.
	*
	* @return the xcg01166 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01166() {
		return _vrTechnicalSpec_XCGPart2.getXCG01166();
	}

	/**
	* Returns the xcg01167 of this vr technical spec_xcg part2.
	*
	* @return the xcg01167 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01167() {
		return _vrTechnicalSpec_XCGPart2.getXCG01167();
	}

	/**
	* Returns the xcg01169 of this vr technical spec_xcg part2.
	*
	* @return the xcg01169 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01169() {
		return _vrTechnicalSpec_XCGPart2.getXCG01169();
	}

	/**
	* Returns the xcg01170 of this vr technical spec_xcg part2.
	*
	* @return the xcg01170 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01170() {
		return _vrTechnicalSpec_XCGPart2.getXCG01170();
	}

	/**
	* Returns the xcg01171 of this vr technical spec_xcg part2.
	*
	* @return the xcg01171 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01171() {
		return _vrTechnicalSpec_XCGPart2.getXCG01171();
	}

	/**
	* Returns the xcg01172 of this vr technical spec_xcg part2.
	*
	* @return the xcg01172 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01172() {
		return _vrTechnicalSpec_XCGPart2.getXCG01172();
	}

	/**
	* Returns the xcg01173 of this vr technical spec_xcg part2.
	*
	* @return the xcg01173 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01173() {
		return _vrTechnicalSpec_XCGPart2.getXCG01173();
	}

	/**
	* Returns the xcg01174 of this vr technical spec_xcg part2.
	*
	* @return the xcg01174 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01174() {
		return _vrTechnicalSpec_XCGPart2.getXCG01174();
	}

	/**
	* Returns the xcg01175 of this vr technical spec_xcg part2.
	*
	* @return the xcg01175 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01175() {
		return _vrTechnicalSpec_XCGPart2.getXCG01175();
	}

	/**
	* Returns the xcg01176 of this vr technical spec_xcg part2.
	*
	* @return the xcg01176 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01176() {
		return _vrTechnicalSpec_XCGPart2.getXCG01176();
	}

	/**
	* Returns the xcg01177 of this vr technical spec_xcg part2.
	*
	* @return the xcg01177 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01177() {
		return _vrTechnicalSpec_XCGPart2.getXCG01177();
	}

	/**
	* Returns the xcg01178 of this vr technical spec_xcg part2.
	*
	* @return the xcg01178 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01178() {
		return _vrTechnicalSpec_XCGPart2.getXCG01178();
	}

	/**
	* Returns the xcg01179 of this vr technical spec_xcg part2.
	*
	* @return the xcg01179 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01179() {
		return _vrTechnicalSpec_XCGPart2.getXCG01179();
	}

	/**
	* Returns the xcg01180 of this vr technical spec_xcg part2.
	*
	* @return the xcg01180 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01180() {
		return _vrTechnicalSpec_XCGPart2.getXCG01180();
	}

	/**
	* Returns the xcg01181 of this vr technical spec_xcg part2.
	*
	* @return the xcg01181 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01181() {
		return _vrTechnicalSpec_XCGPart2.getXCG01181();
	}

	/**
	* Returns the xcg01182 of this vr technical spec_xcg part2.
	*
	* @return the xcg01182 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01182() {
		return _vrTechnicalSpec_XCGPart2.getXCG01182();
	}

	/**
	* Returns the xcg01183 of this vr technical spec_xcg part2.
	*
	* @return the xcg01183 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01183() {
		return _vrTechnicalSpec_XCGPart2.getXCG01183();
	}

	/**
	* Returns the xcg01184 of this vr technical spec_xcg part2.
	*
	* @return the xcg01184 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01184() {
		return _vrTechnicalSpec_XCGPart2.getXCG01184();
	}

	/**
	* Returns the xcg01185 of this vr technical spec_xcg part2.
	*
	* @return the xcg01185 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01185() {
		return _vrTechnicalSpec_XCGPart2.getXCG01185();
	}

	/**
	* Returns the xcg01186 of this vr technical spec_xcg part2.
	*
	* @return the xcg01186 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01186() {
		return _vrTechnicalSpec_XCGPart2.getXCG01186();
	}

	/**
	* Returns the xcg01187 of this vr technical spec_xcg part2.
	*
	* @return the xcg01187 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01187() {
		return _vrTechnicalSpec_XCGPart2.getXCG01187();
	}

	/**
	* Returns the xcg01188 of this vr technical spec_xcg part2.
	*
	* @return the xcg01188 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01188() {
		return _vrTechnicalSpec_XCGPart2.getXCG01188();
	}

	/**
	* Returns the xcg01189 of this vr technical spec_xcg part2.
	*
	* @return the xcg01189 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01189() {
		return _vrTechnicalSpec_XCGPart2.getXCG01189();
	}

	/**
	* Returns the xcg01190 of this vr technical spec_xcg part2.
	*
	* @return the xcg01190 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01190() {
		return _vrTechnicalSpec_XCGPart2.getXCG01190();
	}

	/**
	* Returns the xcg01191 of this vr technical spec_xcg part2.
	*
	* @return the xcg01191 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01191() {
		return _vrTechnicalSpec_XCGPart2.getXCG01191();
	}

	/**
	* Returns the xcg01192 of this vr technical spec_xcg part2.
	*
	* @return the xcg01192 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01192() {
		return _vrTechnicalSpec_XCGPart2.getXCG01192();
	}

	/**
	* Returns the xcg01193 of this vr technical spec_xcg part2.
	*
	* @return the xcg01193 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01193() {
		return _vrTechnicalSpec_XCGPart2.getXCG01193();
	}

	/**
	* Returns the xcg01194 of this vr technical spec_xcg part2.
	*
	* @return the xcg01194 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01194() {
		return _vrTechnicalSpec_XCGPart2.getXCG01194();
	}

	/**
	* Returns the xcg01195 of this vr technical spec_xcg part2.
	*
	* @return the xcg01195 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01195() {
		return _vrTechnicalSpec_XCGPart2.getXCG01195();
	}

	/**
	* Returns the xcg01196 of this vr technical spec_xcg part2.
	*
	* @return the xcg01196 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01196() {
		return _vrTechnicalSpec_XCGPart2.getXCG01196();
	}

	/**
	* Returns the xcg01197 of this vr technical spec_xcg part2.
	*
	* @return the xcg01197 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01197() {
		return _vrTechnicalSpec_XCGPart2.getXCG01197();
	}

	/**
	* Returns the xcg01198 of this vr technical spec_xcg part2.
	*
	* @return the xcg01198 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01198() {
		return _vrTechnicalSpec_XCGPart2.getXCG01198();
	}

	/**
	* Returns the xcg01199 of this vr technical spec_xcg part2.
	*
	* @return the xcg01199 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01199() {
		return _vrTechnicalSpec_XCGPart2.getXCG01199();
	}

	/**
	* Returns the xcg01200 of this vr technical spec_xcg part2.
	*
	* @return the xcg01200 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01200() {
		return _vrTechnicalSpec_XCGPart2.getXCG01200();
	}

	/**
	* Returns the xcg01202 of this vr technical spec_xcg part2.
	*
	* @return the xcg01202 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01202() {
		return _vrTechnicalSpec_XCGPart2.getXCG01202();
	}

	/**
	* Returns the xcg01203 of this vr technical spec_xcg part2.
	*
	* @return the xcg01203 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01203() {
		return _vrTechnicalSpec_XCGPart2.getXCG01203();
	}

	/**
	* Returns the xcg01204 of this vr technical spec_xcg part2.
	*
	* @return the xcg01204 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01204() {
		return _vrTechnicalSpec_XCGPart2.getXCG01204();
	}

	/**
	* Returns the xcg01205 of this vr technical spec_xcg part2.
	*
	* @return the xcg01205 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01205() {
		return _vrTechnicalSpec_XCGPart2.getXCG01205();
	}

	/**
	* Returns the xcg01206 of this vr technical spec_xcg part2.
	*
	* @return the xcg01206 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01206() {
		return _vrTechnicalSpec_XCGPart2.getXCG01206();
	}

	/**
	* Returns the xcg01207 of this vr technical spec_xcg part2.
	*
	* @return the xcg01207 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01207() {
		return _vrTechnicalSpec_XCGPart2.getXCG01207();
	}

	/**
	* Returns the xcg01208 of this vr technical spec_xcg part2.
	*
	* @return the xcg01208 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01208() {
		return _vrTechnicalSpec_XCGPart2.getXCG01208();
	}

	/**
	* Returns the xcg01209 of this vr technical spec_xcg part2.
	*
	* @return the xcg01209 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01209() {
		return _vrTechnicalSpec_XCGPart2.getXCG01209();
	}

	/**
	* Returns the xcg01210 of this vr technical spec_xcg part2.
	*
	* @return the xcg01210 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01210() {
		return _vrTechnicalSpec_XCGPart2.getXCG01210();
	}

	/**
	* Returns the xcg01212 of this vr technical spec_xcg part2.
	*
	* @return the xcg01212 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01212() {
		return _vrTechnicalSpec_XCGPart2.getXCG01212();
	}

	/**
	* Returns the xcg01213 of this vr technical spec_xcg part2.
	*
	* @return the xcg01213 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01213() {
		return _vrTechnicalSpec_XCGPart2.getXCG01213();
	}

	/**
	* Returns the xcg01214 of this vr technical spec_xcg part2.
	*
	* @return the xcg01214 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01214() {
		return _vrTechnicalSpec_XCGPart2.getXCG01214();
	}

	/**
	* Returns the xcg01215 of this vr technical spec_xcg part2.
	*
	* @return the xcg01215 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01215() {
		return _vrTechnicalSpec_XCGPart2.getXCG01215();
	}

	/**
	* Returns the xcg01216 of this vr technical spec_xcg part2.
	*
	* @return the xcg01216 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01216() {
		return _vrTechnicalSpec_XCGPart2.getXCG01216();
	}

	/**
	* Returns the xcg01217 of this vr technical spec_xcg part2.
	*
	* @return the xcg01217 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01217() {
		return _vrTechnicalSpec_XCGPart2.getXCG01217();
	}

	/**
	* Returns the xcg01218 of this vr technical spec_xcg part2.
	*
	* @return the xcg01218 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01218() {
		return _vrTechnicalSpec_XCGPart2.getXCG01218();
	}

	/**
	* Returns the xcg01219 of this vr technical spec_xcg part2.
	*
	* @return the xcg01219 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01219() {
		return _vrTechnicalSpec_XCGPart2.getXCG01219();
	}

	/**
	* Returns the xcg01220 of this vr technical spec_xcg part2.
	*
	* @return the xcg01220 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01220() {
		return _vrTechnicalSpec_XCGPart2.getXCG01220();
	}

	/**
	* Returns the xcg01221 of this vr technical spec_xcg part2.
	*
	* @return the xcg01221 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01221() {
		return _vrTechnicalSpec_XCGPart2.getXCG01221();
	}

	/**
	* Returns the xcg01222 of this vr technical spec_xcg part2.
	*
	* @return the xcg01222 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01222() {
		return _vrTechnicalSpec_XCGPart2.getXCG01222();
	}

	/**
	* Returns the xcg01223 of this vr technical spec_xcg part2.
	*
	* @return the xcg01223 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01223() {
		return _vrTechnicalSpec_XCGPart2.getXCG01223();
	}

	/**
	* Returns the xcg01224 of this vr technical spec_xcg part2.
	*
	* @return the xcg01224 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01224() {
		return _vrTechnicalSpec_XCGPart2.getXCG01224();
	}

	/**
	* Returns the xcg01225 of this vr technical spec_xcg part2.
	*
	* @return the xcg01225 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01225() {
		return _vrTechnicalSpec_XCGPart2.getXCG01225();
	}

	/**
	* Returns the xcg01226 of this vr technical spec_xcg part2.
	*
	* @return the xcg01226 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01226() {
		return _vrTechnicalSpec_XCGPart2.getXCG01226();
	}

	/**
	* Returns the xcg01228 of this vr technical spec_xcg part2.
	*
	* @return the xcg01228 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01228() {
		return _vrTechnicalSpec_XCGPart2.getXCG01228();
	}

	/**
	* Returns the xcg01229 of this vr technical spec_xcg part2.
	*
	* @return the xcg01229 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01229() {
		return _vrTechnicalSpec_XCGPart2.getXCG01229();
	}

	/**
	* Returns the xcg01230 of this vr technical spec_xcg part2.
	*
	* @return the xcg01230 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01230() {
		return _vrTechnicalSpec_XCGPart2.getXCG01230();
	}

	/**
	* Returns the xcg01231 of this vr technical spec_xcg part2.
	*
	* @return the xcg01231 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01231() {
		return _vrTechnicalSpec_XCGPart2.getXCG01231();
	}

	/**
	* Returns the xcg01232 of this vr technical spec_xcg part2.
	*
	* @return the xcg01232 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01232() {
		return _vrTechnicalSpec_XCGPart2.getXCG01232();
	}

	/**
	* Returns the xcg01234 of this vr technical spec_xcg part2.
	*
	* @return the xcg01234 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01234() {
		return _vrTechnicalSpec_XCGPart2.getXCG01234();
	}

	/**
	* Returns the xcg01235 of this vr technical spec_xcg part2.
	*
	* @return the xcg01235 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01235() {
		return _vrTechnicalSpec_XCGPart2.getXCG01235();
	}

	/**
	* Returns the xcg01236 of this vr technical spec_xcg part2.
	*
	* @return the xcg01236 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01236() {
		return _vrTechnicalSpec_XCGPart2.getXCG01236();
	}

	/**
	* Returns the xcg01237 of this vr technical spec_xcg part2.
	*
	* @return the xcg01237 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01237() {
		return _vrTechnicalSpec_XCGPart2.getXCG01237();
	}

	/**
	* Returns the xcg01238 of this vr technical spec_xcg part2.
	*
	* @return the xcg01238 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01238() {
		return _vrTechnicalSpec_XCGPart2.getXCG01238();
	}

	/**
	* Returns the xcg01239 of this vr technical spec_xcg part2.
	*
	* @return the xcg01239 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01239() {
		return _vrTechnicalSpec_XCGPart2.getXCG01239();
	}

	/**
	* Returns the xcg01240 of this vr technical spec_xcg part2.
	*
	* @return the xcg01240 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01240() {
		return _vrTechnicalSpec_XCGPart2.getXCG01240();
	}

	/**
	* Returns the xcg01241 of this vr technical spec_xcg part2.
	*
	* @return the xcg01241 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01241() {
		return _vrTechnicalSpec_XCGPart2.getXCG01241();
	}

	/**
	* Returns the xcg01242 of this vr technical spec_xcg part2.
	*
	* @return the xcg01242 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01242() {
		return _vrTechnicalSpec_XCGPart2.getXCG01242();
	}

	/**
	* Returns the xcg01243 of this vr technical spec_xcg part2.
	*
	* @return the xcg01243 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01243() {
		return _vrTechnicalSpec_XCGPart2.getXCG01243();
	}

	/**
	* Returns the xcg01244 of this vr technical spec_xcg part2.
	*
	* @return the xcg01244 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01244() {
		return _vrTechnicalSpec_XCGPart2.getXCG01244();
	}

	/**
	* Returns the xcg01245 of this vr technical spec_xcg part2.
	*
	* @return the xcg01245 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01245() {
		return _vrTechnicalSpec_XCGPart2.getXCG01245();
	}

	/**
	* Returns the xcg01246 of this vr technical spec_xcg part2.
	*
	* @return the xcg01246 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01246() {
		return _vrTechnicalSpec_XCGPart2.getXCG01246();
	}

	/**
	* Returns the xcg01247 of this vr technical spec_xcg part2.
	*
	* @return the xcg01247 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01247() {
		return _vrTechnicalSpec_XCGPart2.getXCG01247();
	}

	/**
	* Returns the xcg01248 of this vr technical spec_xcg part2.
	*
	* @return the xcg01248 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01248() {
		return _vrTechnicalSpec_XCGPart2.getXCG01248();
	}

	/**
	* Returns the xcg01249 of this vr technical spec_xcg part2.
	*
	* @return the xcg01249 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01249() {
		return _vrTechnicalSpec_XCGPart2.getXCG01249();
	}

	/**
	* Returns the xcg01250 of this vr technical spec_xcg part2.
	*
	* @return the xcg01250 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01250() {
		return _vrTechnicalSpec_XCGPart2.getXCG01250();
	}

	/**
	* Returns the xcg01251 of this vr technical spec_xcg part2.
	*
	* @return the xcg01251 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01251() {
		return _vrTechnicalSpec_XCGPart2.getXCG01251();
	}

	/**
	* Returns the xcg01252 of this vr technical spec_xcg part2.
	*
	* @return the xcg01252 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01252() {
		return _vrTechnicalSpec_XCGPart2.getXCG01252();
	}

	/**
	* Returns the xcg01253 of this vr technical spec_xcg part2.
	*
	* @return the xcg01253 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01253() {
		return _vrTechnicalSpec_XCGPart2.getXCG01253();
	}

	/**
	* Returns the xcg01255 of this vr technical spec_xcg part2.
	*
	* @return the xcg01255 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01255() {
		return _vrTechnicalSpec_XCGPart2.getXCG01255();
	}

	/**
	* Returns the xcg01256 of this vr technical spec_xcg part2.
	*
	* @return the xcg01256 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01256() {
		return _vrTechnicalSpec_XCGPart2.getXCG01256();
	}

	/**
	* Returns the xcg01257 of this vr technical spec_xcg part2.
	*
	* @return the xcg01257 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01257() {
		return _vrTechnicalSpec_XCGPart2.getXCG01257();
	}

	/**
	* Returns the xcg01258 of this vr technical spec_xcg part2.
	*
	* @return the xcg01258 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01258() {
		return _vrTechnicalSpec_XCGPart2.getXCG01258();
	}

	/**
	* Returns the xcg01259 of this vr technical spec_xcg part2.
	*
	* @return the xcg01259 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01259() {
		return _vrTechnicalSpec_XCGPart2.getXCG01259();
	}

	/**
	* Returns the xcg01260 of this vr technical spec_xcg part2.
	*
	* @return the xcg01260 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01260() {
		return _vrTechnicalSpec_XCGPart2.getXCG01260();
	}

	/**
	* Returns the xcg01261 of this vr technical spec_xcg part2.
	*
	* @return the xcg01261 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01261() {
		return _vrTechnicalSpec_XCGPart2.getXCG01261();
	}

	/**
	* Returns the xcg01262 of this vr technical spec_xcg part2.
	*
	* @return the xcg01262 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01262() {
		return _vrTechnicalSpec_XCGPart2.getXCG01262();
	}

	/**
	* Returns the xcg01263 of this vr technical spec_xcg part2.
	*
	* @return the xcg01263 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01263() {
		return _vrTechnicalSpec_XCGPart2.getXCG01263();
	}

	/**
	* Returns the xcg01264 of this vr technical spec_xcg part2.
	*
	* @return the xcg01264 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01264() {
		return _vrTechnicalSpec_XCGPart2.getXCG01264();
	}

	/**
	* Returns the xcg01265 of this vr technical spec_xcg part2.
	*
	* @return the xcg01265 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01265() {
		return _vrTechnicalSpec_XCGPart2.getXCG01265();
	}

	/**
	* Returns the xcg01266 of this vr technical spec_xcg part2.
	*
	* @return the xcg01266 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01266() {
		return _vrTechnicalSpec_XCGPart2.getXCG01266();
	}

	/**
	* Returns the xcg01267 of this vr technical spec_xcg part2.
	*
	* @return the xcg01267 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01267() {
		return _vrTechnicalSpec_XCGPart2.getXCG01267();
	}

	/**
	* Returns the xcg01268 of this vr technical spec_xcg part2.
	*
	* @return the xcg01268 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01268() {
		return _vrTechnicalSpec_XCGPart2.getXCG01268();
	}

	/**
	* Returns the xcg01269 of this vr technical spec_xcg part2.
	*
	* @return the xcg01269 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01269() {
		return _vrTechnicalSpec_XCGPart2.getXCG01269();
	}

	/**
	* Returns the xcg01270 of this vr technical spec_xcg part2.
	*
	* @return the xcg01270 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01270() {
		return _vrTechnicalSpec_XCGPart2.getXCG01270();
	}

	/**
	* Returns the xcg01271 of this vr technical spec_xcg part2.
	*
	* @return the xcg01271 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01271() {
		return _vrTechnicalSpec_XCGPart2.getXCG01271();
	}

	/**
	* Returns the xcg01273 of this vr technical spec_xcg part2.
	*
	* @return the xcg01273 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01273() {
		return _vrTechnicalSpec_XCGPart2.getXCG01273();
	}

	/**
	* Returns the xcg01274 of this vr technical spec_xcg part2.
	*
	* @return the xcg01274 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01274() {
		return _vrTechnicalSpec_XCGPart2.getXCG01274();
	}

	/**
	* Returns the xcg01275 of this vr technical spec_xcg part2.
	*
	* @return the xcg01275 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01275() {
		return _vrTechnicalSpec_XCGPart2.getXCG01275();
	}

	/**
	* Returns the xcg01276 of this vr technical spec_xcg part2.
	*
	* @return the xcg01276 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01276() {
		return _vrTechnicalSpec_XCGPart2.getXCG01276();
	}

	/**
	* Returns the xcg01277 of this vr technical spec_xcg part2.
	*
	* @return the xcg01277 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01277() {
		return _vrTechnicalSpec_XCGPart2.getXCG01277();
	}

	/**
	* Returns the xcg01278 of this vr technical spec_xcg part2.
	*
	* @return the xcg01278 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01278() {
		return _vrTechnicalSpec_XCGPart2.getXCG01278();
	}

	/**
	* Returns the xcg01279 of this vr technical spec_xcg part2.
	*
	* @return the xcg01279 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01279() {
		return _vrTechnicalSpec_XCGPart2.getXCG01279();
	}

	/**
	* Returns the xcg01280 of this vr technical spec_xcg part2.
	*
	* @return the xcg01280 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01280() {
		return _vrTechnicalSpec_XCGPart2.getXCG01280();
	}

	/**
	* Returns the xcg01281 of this vr technical spec_xcg part2.
	*
	* @return the xcg01281 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01281() {
		return _vrTechnicalSpec_XCGPart2.getXCG01281();
	}

	/**
	* Returns the xcg01282 of this vr technical spec_xcg part2.
	*
	* @return the xcg01282 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01282() {
		return _vrTechnicalSpec_XCGPart2.getXCG01282();
	}

	/**
	* Returns the xcg01283 of this vr technical spec_xcg part2.
	*
	* @return the xcg01283 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01283() {
		return _vrTechnicalSpec_XCGPart2.getXCG01283();
	}

	/**
	* Returns the xcg01284 of this vr technical spec_xcg part2.
	*
	* @return the xcg01284 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01284() {
		return _vrTechnicalSpec_XCGPart2.getXCG01284();
	}

	/**
	* Returns the xcg01285 of this vr technical spec_xcg part2.
	*
	* @return the xcg01285 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01285() {
		return _vrTechnicalSpec_XCGPart2.getXCG01285();
	}

	/**
	* Returns the xcg01286 of this vr technical spec_xcg part2.
	*
	* @return the xcg01286 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01286() {
		return _vrTechnicalSpec_XCGPart2.getXCG01286();
	}

	/**
	* Returns the xcg01287 of this vr technical spec_xcg part2.
	*
	* @return the xcg01287 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01287() {
		return _vrTechnicalSpec_XCGPart2.getXCG01287();
	}

	/**
	* Returns the xcg01288 of this vr technical spec_xcg part2.
	*
	* @return the xcg01288 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01288() {
		return _vrTechnicalSpec_XCGPart2.getXCG01288();
	}

	/**
	* Returns the xcg01289 of this vr technical spec_xcg part2.
	*
	* @return the xcg01289 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01289() {
		return _vrTechnicalSpec_XCGPart2.getXCG01289();
	}

	/**
	* Returns the xcg01290 of this vr technical spec_xcg part2.
	*
	* @return the xcg01290 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01290() {
		return _vrTechnicalSpec_XCGPart2.getXCG01290();
	}

	/**
	* Returns the xcg01291 of this vr technical spec_xcg part2.
	*
	* @return the xcg01291 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01291() {
		return _vrTechnicalSpec_XCGPart2.getXCG01291();
	}

	/**
	* Returns the xcg01292 of this vr technical spec_xcg part2.
	*
	* @return the xcg01292 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01292() {
		return _vrTechnicalSpec_XCGPart2.getXCG01292();
	}

	/**
	* Returns the xcg01293 of this vr technical spec_xcg part2.
	*
	* @return the xcg01293 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01293() {
		return _vrTechnicalSpec_XCGPart2.getXCG01293();
	}

	/**
	* Returns the xcg01294 of this vr technical spec_xcg part2.
	*
	* @return the xcg01294 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01294() {
		return _vrTechnicalSpec_XCGPart2.getXCG01294();
	}

	/**
	* Returns the xcg01295 of this vr technical spec_xcg part2.
	*
	* @return the xcg01295 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01295() {
		return _vrTechnicalSpec_XCGPart2.getXCG01295();
	}

	/**
	* Returns the xcg01296 of this vr technical spec_xcg part2.
	*
	* @return the xcg01296 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01296() {
		return _vrTechnicalSpec_XCGPart2.getXCG01296();
	}

	/**
	* Returns the xcg01297 of this vr technical spec_xcg part2.
	*
	* @return the xcg01297 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01297() {
		return _vrTechnicalSpec_XCGPart2.getXCG01297();
	}

	/**
	* Returns the xcg01298 of this vr technical spec_xcg part2.
	*
	* @return the xcg01298 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01298() {
		return _vrTechnicalSpec_XCGPart2.getXCG01298();
	}

	/**
	* Returns the xcg01300 of this vr technical spec_xcg part2.
	*
	* @return the xcg01300 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01300() {
		return _vrTechnicalSpec_XCGPart2.getXCG01300();
	}

	/**
	* Returns the xcg01301 of this vr technical spec_xcg part2.
	*
	* @return the xcg01301 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01301() {
		return _vrTechnicalSpec_XCGPart2.getXCG01301();
	}

	/**
	* Returns the xcg01302 of this vr technical spec_xcg part2.
	*
	* @return the xcg01302 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01302() {
		return _vrTechnicalSpec_XCGPart2.getXCG01302();
	}

	/**
	* Returns the xcg01303 of this vr technical spec_xcg part2.
	*
	* @return the xcg01303 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01303() {
		return _vrTechnicalSpec_XCGPart2.getXCG01303();
	}

	/**
	* Returns the xcg01304 of this vr technical spec_xcg part2.
	*
	* @return the xcg01304 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01304() {
		return _vrTechnicalSpec_XCGPart2.getXCG01304();
	}

	/**
	* Returns the xcg01305 of this vr technical spec_xcg part2.
	*
	* @return the xcg01305 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01305() {
		return _vrTechnicalSpec_XCGPart2.getXCG01305();
	}

	/**
	* Returns the xcg01306 of this vr technical spec_xcg part2.
	*
	* @return the xcg01306 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01306() {
		return _vrTechnicalSpec_XCGPart2.getXCG01306();
	}

	/**
	* Returns the xcg01307 of this vr technical spec_xcg part2.
	*
	* @return the xcg01307 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01307() {
		return _vrTechnicalSpec_XCGPart2.getXCG01307();
	}

	/**
	* Returns the xcg01308 of this vr technical spec_xcg part2.
	*
	* @return the xcg01308 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01308() {
		return _vrTechnicalSpec_XCGPart2.getXCG01308();
	}

	/**
	* Returns the xcg01901 of this vr technical spec_xcg part2.
	*
	* @return the xcg01901 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01901() {
		return _vrTechnicalSpec_XCGPart2.getXCG01901();
	}

	/**
	* Returns the xcg01902 of this vr technical spec_xcg part2.
	*
	* @return the xcg01902 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01902() {
		return _vrTechnicalSpec_XCGPart2.getXCG01902();
	}

	/**
	* Returns the xcg01903 of this vr technical spec_xcg part2.
	*
	* @return the xcg01903 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG01903() {
		return _vrTechnicalSpec_XCGPart2.getXCG01903();
	}

	/**
	* Returns the xcg11248 of this vr technical spec_xcg part2.
	*
	* @return the xcg11248 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG11248() {
		return _vrTechnicalSpec_XCGPart2.getXCG11248();
	}

	/**
	* Returns the xcg11249 of this vr technical spec_xcg part2.
	*
	* @return the xcg11249 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG11249() {
		return _vrTechnicalSpec_XCGPart2.getXCG11249();
	}

	/**
	* Returns the xcg11253 of this vr technical spec_xcg part2.
	*
	* @return the xcg11253 of this vr technical spec_xcg part2
	*/
	@Override
	public java.lang.String getXCG11253() {
		return _vrTechnicalSpec_XCGPart2.getXCG11253();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XCGPart2.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XCGPart2.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xcg part2.
	*
	* @return the modify date of this vr technical spec_xcg part2
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XCGPart2.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xcg part2.
	*
	* @return the sync date of this vr technical spec_xcg part2
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XCGPart2.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xcg part2.
	*
	* @return the convert assemble ID of this vr technical spec_xcg part2
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XCGPart2.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xcg part2.
	*
	* @return the dossier ID of this vr technical spec_xcg part2
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XCGPart2.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xcg part2.
	*
	* @return the ID of this vr technical spec_xcg part2
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XCGPart2.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xcg part2.
	*
	* @return the mt core of this vr technical spec_xcg part2
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XCGPart2.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xcg part2.
	*
	* @return the primary key of this vr technical spec_xcg part2
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XCGPart2.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xcg part2.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xcg part2
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XCGPart2.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XCGPart2.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XCGPart2.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xcg part2.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xcg part2
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XCGPart2.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xcg part2.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xcg part2
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XCGPart2.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xcg part2.
	*
	* @param dossierId the dossier ID of this vr technical spec_xcg part2
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XCGPart2.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xcg part2.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xcg part2
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XCGPart2.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xcg part2.
	*
	* @param dossierNo the dossier no of this vr technical spec_xcg part2
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XCGPart2.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XCGPart2.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XCGPart2.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XCGPart2.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xcg part2.
	*
	* @param id the ID of this vr technical spec_xcg part2
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XCGPart2.setId(id);
	}

	/**
	* Sets the modify date of this vr technical spec_xcg part2.
	*
	* @param modifyDate the modify date of this vr technical spec_xcg part2
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XCGPart2.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xcg part2.
	*
	* @param mtCore the mt core of this vr technical spec_xcg part2
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XCGPart2.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XCGPart2.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xcg part2.
	*
	* @param primaryKey the primary key of this vr technical spec_xcg part2
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XCGPart2.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XCGPart2.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xcg part2.
	*
	* @param referenceUid the reference uid of this vr technical spec_xcg part2
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XCGPart2.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xcg part2.
	*
	* @param syncDate the sync date of this vr technical spec_xcg part2
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XCGPart2.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xcg part2.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xcg part2
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XCGPart2.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xcg01163 of this vr technical spec_xcg part2.
	*
	* @param XCG01163 the xcg01163 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01163(java.lang.String XCG01163) {
		_vrTechnicalSpec_XCGPart2.setXCG01163(XCG01163);
	}

	/**
	* Sets the xcg01164 of this vr technical spec_xcg part2.
	*
	* @param XCG01164 the xcg01164 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01164(java.lang.String XCG01164) {
		_vrTechnicalSpec_XCGPart2.setXCG01164(XCG01164);
	}

	/**
	* Sets the xcg01165 of this vr technical spec_xcg part2.
	*
	* @param XCG01165 the xcg01165 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01165(java.lang.String XCG01165) {
		_vrTechnicalSpec_XCGPart2.setXCG01165(XCG01165);
	}

	/**
	* Sets the xcg01166 of this vr technical spec_xcg part2.
	*
	* @param XCG01166 the xcg01166 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01166(java.lang.String XCG01166) {
		_vrTechnicalSpec_XCGPart2.setXCG01166(XCG01166);
	}

	/**
	* Sets the xcg01167 of this vr technical spec_xcg part2.
	*
	* @param XCG01167 the xcg01167 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01167(java.lang.String XCG01167) {
		_vrTechnicalSpec_XCGPart2.setXCG01167(XCG01167);
	}

	/**
	* Sets the xcg01169 of this vr technical spec_xcg part2.
	*
	* @param XCG01169 the xcg01169 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01169(java.lang.String XCG01169) {
		_vrTechnicalSpec_XCGPart2.setXCG01169(XCG01169);
	}

	/**
	* Sets the xcg01170 of this vr technical spec_xcg part2.
	*
	* @param XCG01170 the xcg01170 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01170(java.lang.String XCG01170) {
		_vrTechnicalSpec_XCGPart2.setXCG01170(XCG01170);
	}

	/**
	* Sets the xcg01171 of this vr technical spec_xcg part2.
	*
	* @param XCG01171 the xcg01171 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01171(java.lang.String XCG01171) {
		_vrTechnicalSpec_XCGPart2.setXCG01171(XCG01171);
	}

	/**
	* Sets the xcg01172 of this vr technical spec_xcg part2.
	*
	* @param XCG01172 the xcg01172 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01172(java.lang.String XCG01172) {
		_vrTechnicalSpec_XCGPart2.setXCG01172(XCG01172);
	}

	/**
	* Sets the xcg01173 of this vr technical spec_xcg part2.
	*
	* @param XCG01173 the xcg01173 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01173(java.lang.String XCG01173) {
		_vrTechnicalSpec_XCGPart2.setXCG01173(XCG01173);
	}

	/**
	* Sets the xcg01174 of this vr technical spec_xcg part2.
	*
	* @param XCG01174 the xcg01174 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01174(java.lang.String XCG01174) {
		_vrTechnicalSpec_XCGPart2.setXCG01174(XCG01174);
	}

	/**
	* Sets the xcg01175 of this vr technical spec_xcg part2.
	*
	* @param XCG01175 the xcg01175 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01175(java.lang.String XCG01175) {
		_vrTechnicalSpec_XCGPart2.setXCG01175(XCG01175);
	}

	/**
	* Sets the xcg01176 of this vr technical spec_xcg part2.
	*
	* @param XCG01176 the xcg01176 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01176(java.lang.String XCG01176) {
		_vrTechnicalSpec_XCGPart2.setXCG01176(XCG01176);
	}

	/**
	* Sets the xcg01177 of this vr technical spec_xcg part2.
	*
	* @param XCG01177 the xcg01177 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01177(java.lang.String XCG01177) {
		_vrTechnicalSpec_XCGPart2.setXCG01177(XCG01177);
	}

	/**
	* Sets the xcg01178 of this vr technical spec_xcg part2.
	*
	* @param XCG01178 the xcg01178 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01178(java.lang.String XCG01178) {
		_vrTechnicalSpec_XCGPart2.setXCG01178(XCG01178);
	}

	/**
	* Sets the xcg01179 of this vr technical spec_xcg part2.
	*
	* @param XCG01179 the xcg01179 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01179(java.lang.String XCG01179) {
		_vrTechnicalSpec_XCGPart2.setXCG01179(XCG01179);
	}

	/**
	* Sets the xcg01180 of this vr technical spec_xcg part2.
	*
	* @param XCG01180 the xcg01180 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01180(java.lang.String XCG01180) {
		_vrTechnicalSpec_XCGPart2.setXCG01180(XCG01180);
	}

	/**
	* Sets the xcg01181 of this vr technical spec_xcg part2.
	*
	* @param XCG01181 the xcg01181 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01181(java.lang.String XCG01181) {
		_vrTechnicalSpec_XCGPart2.setXCG01181(XCG01181);
	}

	/**
	* Sets the xcg01182 of this vr technical spec_xcg part2.
	*
	* @param XCG01182 the xcg01182 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01182(java.lang.String XCG01182) {
		_vrTechnicalSpec_XCGPart2.setXCG01182(XCG01182);
	}

	/**
	* Sets the xcg01183 of this vr technical spec_xcg part2.
	*
	* @param XCG01183 the xcg01183 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01183(java.lang.String XCG01183) {
		_vrTechnicalSpec_XCGPart2.setXCG01183(XCG01183);
	}

	/**
	* Sets the xcg01184 of this vr technical spec_xcg part2.
	*
	* @param XCG01184 the xcg01184 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01184(java.lang.String XCG01184) {
		_vrTechnicalSpec_XCGPart2.setXCG01184(XCG01184);
	}

	/**
	* Sets the xcg01185 of this vr technical spec_xcg part2.
	*
	* @param XCG01185 the xcg01185 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01185(java.lang.String XCG01185) {
		_vrTechnicalSpec_XCGPart2.setXCG01185(XCG01185);
	}

	/**
	* Sets the xcg01186 of this vr technical spec_xcg part2.
	*
	* @param XCG01186 the xcg01186 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01186(java.lang.String XCG01186) {
		_vrTechnicalSpec_XCGPart2.setXCG01186(XCG01186);
	}

	/**
	* Sets the xcg01187 of this vr technical spec_xcg part2.
	*
	* @param XCG01187 the xcg01187 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01187(java.lang.String XCG01187) {
		_vrTechnicalSpec_XCGPart2.setXCG01187(XCG01187);
	}

	/**
	* Sets the xcg01188 of this vr technical spec_xcg part2.
	*
	* @param XCG01188 the xcg01188 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01188(java.lang.String XCG01188) {
		_vrTechnicalSpec_XCGPart2.setXCG01188(XCG01188);
	}

	/**
	* Sets the xcg01189 of this vr technical spec_xcg part2.
	*
	* @param XCG01189 the xcg01189 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01189(java.lang.String XCG01189) {
		_vrTechnicalSpec_XCGPart2.setXCG01189(XCG01189);
	}

	/**
	* Sets the xcg01190 of this vr technical spec_xcg part2.
	*
	* @param XCG01190 the xcg01190 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01190(java.lang.String XCG01190) {
		_vrTechnicalSpec_XCGPart2.setXCG01190(XCG01190);
	}

	/**
	* Sets the xcg01191 of this vr technical spec_xcg part2.
	*
	* @param XCG01191 the xcg01191 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01191(java.lang.String XCG01191) {
		_vrTechnicalSpec_XCGPart2.setXCG01191(XCG01191);
	}

	/**
	* Sets the xcg01192 of this vr technical spec_xcg part2.
	*
	* @param XCG01192 the xcg01192 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01192(java.lang.String XCG01192) {
		_vrTechnicalSpec_XCGPart2.setXCG01192(XCG01192);
	}

	/**
	* Sets the xcg01193 of this vr technical spec_xcg part2.
	*
	* @param XCG01193 the xcg01193 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01193(java.lang.String XCG01193) {
		_vrTechnicalSpec_XCGPart2.setXCG01193(XCG01193);
	}

	/**
	* Sets the xcg01194 of this vr technical spec_xcg part2.
	*
	* @param XCG01194 the xcg01194 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01194(java.lang.String XCG01194) {
		_vrTechnicalSpec_XCGPart2.setXCG01194(XCG01194);
	}

	/**
	* Sets the xcg01195 of this vr technical spec_xcg part2.
	*
	* @param XCG01195 the xcg01195 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01195(java.lang.String XCG01195) {
		_vrTechnicalSpec_XCGPart2.setXCG01195(XCG01195);
	}

	/**
	* Sets the xcg01196 of this vr technical spec_xcg part2.
	*
	* @param XCG01196 the xcg01196 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01196(java.lang.String XCG01196) {
		_vrTechnicalSpec_XCGPart2.setXCG01196(XCG01196);
	}

	/**
	* Sets the xcg01197 of this vr technical spec_xcg part2.
	*
	* @param XCG01197 the xcg01197 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01197(java.lang.String XCG01197) {
		_vrTechnicalSpec_XCGPart2.setXCG01197(XCG01197);
	}

	/**
	* Sets the xcg01198 of this vr technical spec_xcg part2.
	*
	* @param XCG01198 the xcg01198 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01198(java.lang.String XCG01198) {
		_vrTechnicalSpec_XCGPart2.setXCG01198(XCG01198);
	}

	/**
	* Sets the xcg01199 of this vr technical spec_xcg part2.
	*
	* @param XCG01199 the xcg01199 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01199(java.lang.String XCG01199) {
		_vrTechnicalSpec_XCGPart2.setXCG01199(XCG01199);
	}

	/**
	* Sets the xcg01200 of this vr technical spec_xcg part2.
	*
	* @param XCG01200 the xcg01200 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01200(java.lang.String XCG01200) {
		_vrTechnicalSpec_XCGPart2.setXCG01200(XCG01200);
	}

	/**
	* Sets the xcg01202 of this vr technical spec_xcg part2.
	*
	* @param XCG01202 the xcg01202 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01202(java.lang.String XCG01202) {
		_vrTechnicalSpec_XCGPart2.setXCG01202(XCG01202);
	}

	/**
	* Sets the xcg01203 of this vr technical spec_xcg part2.
	*
	* @param XCG01203 the xcg01203 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01203(java.lang.String XCG01203) {
		_vrTechnicalSpec_XCGPart2.setXCG01203(XCG01203);
	}

	/**
	* Sets the xcg01204 of this vr technical spec_xcg part2.
	*
	* @param XCG01204 the xcg01204 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01204(java.lang.String XCG01204) {
		_vrTechnicalSpec_XCGPart2.setXCG01204(XCG01204);
	}

	/**
	* Sets the xcg01205 of this vr technical spec_xcg part2.
	*
	* @param XCG01205 the xcg01205 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01205(java.lang.String XCG01205) {
		_vrTechnicalSpec_XCGPart2.setXCG01205(XCG01205);
	}

	/**
	* Sets the xcg01206 of this vr technical spec_xcg part2.
	*
	* @param XCG01206 the xcg01206 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01206(java.lang.String XCG01206) {
		_vrTechnicalSpec_XCGPart2.setXCG01206(XCG01206);
	}

	/**
	* Sets the xcg01207 of this vr technical spec_xcg part2.
	*
	* @param XCG01207 the xcg01207 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01207(java.lang.String XCG01207) {
		_vrTechnicalSpec_XCGPart2.setXCG01207(XCG01207);
	}

	/**
	* Sets the xcg01208 of this vr technical spec_xcg part2.
	*
	* @param XCG01208 the xcg01208 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01208(java.lang.String XCG01208) {
		_vrTechnicalSpec_XCGPart2.setXCG01208(XCG01208);
	}

	/**
	* Sets the xcg01209 of this vr technical spec_xcg part2.
	*
	* @param XCG01209 the xcg01209 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01209(java.lang.String XCG01209) {
		_vrTechnicalSpec_XCGPart2.setXCG01209(XCG01209);
	}

	/**
	* Sets the xcg01210 of this vr technical spec_xcg part2.
	*
	* @param XCG01210 the xcg01210 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01210(java.lang.String XCG01210) {
		_vrTechnicalSpec_XCGPart2.setXCG01210(XCG01210);
	}

	/**
	* Sets the xcg01212 of this vr technical spec_xcg part2.
	*
	* @param XCG01212 the xcg01212 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01212(java.lang.String XCG01212) {
		_vrTechnicalSpec_XCGPart2.setXCG01212(XCG01212);
	}

	/**
	* Sets the xcg01213 of this vr technical spec_xcg part2.
	*
	* @param XCG01213 the xcg01213 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01213(java.lang.String XCG01213) {
		_vrTechnicalSpec_XCGPart2.setXCG01213(XCG01213);
	}

	/**
	* Sets the xcg01214 of this vr technical spec_xcg part2.
	*
	* @param XCG01214 the xcg01214 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01214(java.lang.String XCG01214) {
		_vrTechnicalSpec_XCGPart2.setXCG01214(XCG01214);
	}

	/**
	* Sets the xcg01215 of this vr technical spec_xcg part2.
	*
	* @param XCG01215 the xcg01215 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01215(java.lang.String XCG01215) {
		_vrTechnicalSpec_XCGPart2.setXCG01215(XCG01215);
	}

	/**
	* Sets the xcg01216 of this vr technical spec_xcg part2.
	*
	* @param XCG01216 the xcg01216 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01216(java.lang.String XCG01216) {
		_vrTechnicalSpec_XCGPart2.setXCG01216(XCG01216);
	}

	/**
	* Sets the xcg01217 of this vr technical spec_xcg part2.
	*
	* @param XCG01217 the xcg01217 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01217(java.lang.String XCG01217) {
		_vrTechnicalSpec_XCGPart2.setXCG01217(XCG01217);
	}

	/**
	* Sets the xcg01218 of this vr technical spec_xcg part2.
	*
	* @param XCG01218 the xcg01218 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01218(java.lang.String XCG01218) {
		_vrTechnicalSpec_XCGPart2.setXCG01218(XCG01218);
	}

	/**
	* Sets the xcg01219 of this vr technical spec_xcg part2.
	*
	* @param XCG01219 the xcg01219 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01219(java.lang.String XCG01219) {
		_vrTechnicalSpec_XCGPart2.setXCG01219(XCG01219);
	}

	/**
	* Sets the xcg01220 of this vr technical spec_xcg part2.
	*
	* @param XCG01220 the xcg01220 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01220(java.lang.String XCG01220) {
		_vrTechnicalSpec_XCGPart2.setXCG01220(XCG01220);
	}

	/**
	* Sets the xcg01221 of this vr technical spec_xcg part2.
	*
	* @param XCG01221 the xcg01221 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01221(java.lang.String XCG01221) {
		_vrTechnicalSpec_XCGPart2.setXCG01221(XCG01221);
	}

	/**
	* Sets the xcg01222 of this vr technical spec_xcg part2.
	*
	* @param XCG01222 the xcg01222 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01222(java.lang.String XCG01222) {
		_vrTechnicalSpec_XCGPart2.setXCG01222(XCG01222);
	}

	/**
	* Sets the xcg01223 of this vr technical spec_xcg part2.
	*
	* @param XCG01223 the xcg01223 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01223(java.lang.String XCG01223) {
		_vrTechnicalSpec_XCGPart2.setXCG01223(XCG01223);
	}

	/**
	* Sets the xcg01224 of this vr technical spec_xcg part2.
	*
	* @param XCG01224 the xcg01224 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01224(java.lang.String XCG01224) {
		_vrTechnicalSpec_XCGPart2.setXCG01224(XCG01224);
	}

	/**
	* Sets the xcg01225 of this vr technical spec_xcg part2.
	*
	* @param XCG01225 the xcg01225 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01225(java.lang.String XCG01225) {
		_vrTechnicalSpec_XCGPart2.setXCG01225(XCG01225);
	}

	/**
	* Sets the xcg01226 of this vr technical spec_xcg part2.
	*
	* @param XCG01226 the xcg01226 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01226(java.lang.String XCG01226) {
		_vrTechnicalSpec_XCGPart2.setXCG01226(XCG01226);
	}

	/**
	* Sets the xcg01228 of this vr technical spec_xcg part2.
	*
	* @param XCG01228 the xcg01228 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01228(java.lang.String XCG01228) {
		_vrTechnicalSpec_XCGPart2.setXCG01228(XCG01228);
	}

	/**
	* Sets the xcg01229 of this vr technical spec_xcg part2.
	*
	* @param XCG01229 the xcg01229 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01229(java.lang.String XCG01229) {
		_vrTechnicalSpec_XCGPart2.setXCG01229(XCG01229);
	}

	/**
	* Sets the xcg01230 of this vr technical spec_xcg part2.
	*
	* @param XCG01230 the xcg01230 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01230(java.lang.String XCG01230) {
		_vrTechnicalSpec_XCGPart2.setXCG01230(XCG01230);
	}

	/**
	* Sets the xcg01231 of this vr technical spec_xcg part2.
	*
	* @param XCG01231 the xcg01231 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01231(java.lang.String XCG01231) {
		_vrTechnicalSpec_XCGPart2.setXCG01231(XCG01231);
	}

	/**
	* Sets the xcg01232 of this vr technical spec_xcg part2.
	*
	* @param XCG01232 the xcg01232 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01232(java.lang.String XCG01232) {
		_vrTechnicalSpec_XCGPart2.setXCG01232(XCG01232);
	}

	/**
	* Sets the xcg01234 of this vr technical spec_xcg part2.
	*
	* @param XCG01234 the xcg01234 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01234(java.lang.String XCG01234) {
		_vrTechnicalSpec_XCGPart2.setXCG01234(XCG01234);
	}

	/**
	* Sets the xcg01235 of this vr technical spec_xcg part2.
	*
	* @param XCG01235 the xcg01235 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01235(java.lang.String XCG01235) {
		_vrTechnicalSpec_XCGPart2.setXCG01235(XCG01235);
	}

	/**
	* Sets the xcg01236 of this vr technical spec_xcg part2.
	*
	* @param XCG01236 the xcg01236 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01236(java.lang.String XCG01236) {
		_vrTechnicalSpec_XCGPart2.setXCG01236(XCG01236);
	}

	/**
	* Sets the xcg01237 of this vr technical spec_xcg part2.
	*
	* @param XCG01237 the xcg01237 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01237(java.lang.String XCG01237) {
		_vrTechnicalSpec_XCGPart2.setXCG01237(XCG01237);
	}

	/**
	* Sets the xcg01238 of this vr technical spec_xcg part2.
	*
	* @param XCG01238 the xcg01238 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01238(java.lang.String XCG01238) {
		_vrTechnicalSpec_XCGPart2.setXCG01238(XCG01238);
	}

	/**
	* Sets the xcg01239 of this vr technical spec_xcg part2.
	*
	* @param XCG01239 the xcg01239 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01239(java.lang.String XCG01239) {
		_vrTechnicalSpec_XCGPart2.setXCG01239(XCG01239);
	}

	/**
	* Sets the xcg01240 of this vr technical spec_xcg part2.
	*
	* @param XCG01240 the xcg01240 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01240(java.lang.String XCG01240) {
		_vrTechnicalSpec_XCGPart2.setXCG01240(XCG01240);
	}

	/**
	* Sets the xcg01241 of this vr technical spec_xcg part2.
	*
	* @param XCG01241 the xcg01241 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01241(java.lang.String XCG01241) {
		_vrTechnicalSpec_XCGPart2.setXCG01241(XCG01241);
	}

	/**
	* Sets the xcg01242 of this vr technical spec_xcg part2.
	*
	* @param XCG01242 the xcg01242 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01242(java.lang.String XCG01242) {
		_vrTechnicalSpec_XCGPart2.setXCG01242(XCG01242);
	}

	/**
	* Sets the xcg01243 of this vr technical spec_xcg part2.
	*
	* @param XCG01243 the xcg01243 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01243(java.lang.String XCG01243) {
		_vrTechnicalSpec_XCGPart2.setXCG01243(XCG01243);
	}

	/**
	* Sets the xcg01244 of this vr technical spec_xcg part2.
	*
	* @param XCG01244 the xcg01244 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01244(java.lang.String XCG01244) {
		_vrTechnicalSpec_XCGPart2.setXCG01244(XCG01244);
	}

	/**
	* Sets the xcg01245 of this vr technical spec_xcg part2.
	*
	* @param XCG01245 the xcg01245 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01245(java.lang.String XCG01245) {
		_vrTechnicalSpec_XCGPart2.setXCG01245(XCG01245);
	}

	/**
	* Sets the xcg01246 of this vr technical spec_xcg part2.
	*
	* @param XCG01246 the xcg01246 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01246(java.lang.String XCG01246) {
		_vrTechnicalSpec_XCGPart2.setXCG01246(XCG01246);
	}

	/**
	* Sets the xcg01247 of this vr technical spec_xcg part2.
	*
	* @param XCG01247 the xcg01247 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01247(java.lang.String XCG01247) {
		_vrTechnicalSpec_XCGPart2.setXCG01247(XCG01247);
	}

	/**
	* Sets the xcg01248 of this vr technical spec_xcg part2.
	*
	* @param XCG01248 the xcg01248 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01248(java.lang.String XCG01248) {
		_vrTechnicalSpec_XCGPart2.setXCG01248(XCG01248);
	}

	/**
	* Sets the xcg01249 of this vr technical spec_xcg part2.
	*
	* @param XCG01249 the xcg01249 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01249(java.lang.String XCG01249) {
		_vrTechnicalSpec_XCGPart2.setXCG01249(XCG01249);
	}

	/**
	* Sets the xcg01250 of this vr technical spec_xcg part2.
	*
	* @param XCG01250 the xcg01250 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01250(java.lang.String XCG01250) {
		_vrTechnicalSpec_XCGPart2.setXCG01250(XCG01250);
	}

	/**
	* Sets the xcg01251 of this vr technical spec_xcg part2.
	*
	* @param XCG01251 the xcg01251 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01251(java.lang.String XCG01251) {
		_vrTechnicalSpec_XCGPart2.setXCG01251(XCG01251);
	}

	/**
	* Sets the xcg01252 of this vr technical spec_xcg part2.
	*
	* @param XCG01252 the xcg01252 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01252(java.lang.String XCG01252) {
		_vrTechnicalSpec_XCGPart2.setXCG01252(XCG01252);
	}

	/**
	* Sets the xcg01253 of this vr technical spec_xcg part2.
	*
	* @param XCG01253 the xcg01253 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01253(java.lang.String XCG01253) {
		_vrTechnicalSpec_XCGPart2.setXCG01253(XCG01253);
	}

	/**
	* Sets the xcg01255 of this vr technical spec_xcg part2.
	*
	* @param XCG01255 the xcg01255 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01255(java.lang.String XCG01255) {
		_vrTechnicalSpec_XCGPart2.setXCG01255(XCG01255);
	}

	/**
	* Sets the xcg01256 of this vr technical spec_xcg part2.
	*
	* @param XCG01256 the xcg01256 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01256(java.lang.String XCG01256) {
		_vrTechnicalSpec_XCGPart2.setXCG01256(XCG01256);
	}

	/**
	* Sets the xcg01257 of this vr technical spec_xcg part2.
	*
	* @param XCG01257 the xcg01257 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01257(java.lang.String XCG01257) {
		_vrTechnicalSpec_XCGPart2.setXCG01257(XCG01257);
	}

	/**
	* Sets the xcg01258 of this vr technical spec_xcg part2.
	*
	* @param XCG01258 the xcg01258 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01258(java.lang.String XCG01258) {
		_vrTechnicalSpec_XCGPart2.setXCG01258(XCG01258);
	}

	/**
	* Sets the xcg01259 of this vr technical spec_xcg part2.
	*
	* @param XCG01259 the xcg01259 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01259(java.lang.String XCG01259) {
		_vrTechnicalSpec_XCGPart2.setXCG01259(XCG01259);
	}

	/**
	* Sets the xcg01260 of this vr technical spec_xcg part2.
	*
	* @param XCG01260 the xcg01260 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01260(java.lang.String XCG01260) {
		_vrTechnicalSpec_XCGPart2.setXCG01260(XCG01260);
	}

	/**
	* Sets the xcg01261 of this vr technical spec_xcg part2.
	*
	* @param XCG01261 the xcg01261 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01261(java.lang.String XCG01261) {
		_vrTechnicalSpec_XCGPart2.setXCG01261(XCG01261);
	}

	/**
	* Sets the xcg01262 of this vr technical spec_xcg part2.
	*
	* @param XCG01262 the xcg01262 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01262(java.lang.String XCG01262) {
		_vrTechnicalSpec_XCGPart2.setXCG01262(XCG01262);
	}

	/**
	* Sets the xcg01263 of this vr technical spec_xcg part2.
	*
	* @param XCG01263 the xcg01263 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01263(java.lang.String XCG01263) {
		_vrTechnicalSpec_XCGPart2.setXCG01263(XCG01263);
	}

	/**
	* Sets the xcg01264 of this vr technical spec_xcg part2.
	*
	* @param XCG01264 the xcg01264 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01264(java.lang.String XCG01264) {
		_vrTechnicalSpec_XCGPart2.setXCG01264(XCG01264);
	}

	/**
	* Sets the xcg01265 of this vr technical spec_xcg part2.
	*
	* @param XCG01265 the xcg01265 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01265(java.lang.String XCG01265) {
		_vrTechnicalSpec_XCGPart2.setXCG01265(XCG01265);
	}

	/**
	* Sets the xcg01266 of this vr technical spec_xcg part2.
	*
	* @param XCG01266 the xcg01266 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01266(java.lang.String XCG01266) {
		_vrTechnicalSpec_XCGPart2.setXCG01266(XCG01266);
	}

	/**
	* Sets the xcg01267 of this vr technical spec_xcg part2.
	*
	* @param XCG01267 the xcg01267 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01267(java.lang.String XCG01267) {
		_vrTechnicalSpec_XCGPart2.setXCG01267(XCG01267);
	}

	/**
	* Sets the xcg01268 of this vr technical spec_xcg part2.
	*
	* @param XCG01268 the xcg01268 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01268(java.lang.String XCG01268) {
		_vrTechnicalSpec_XCGPart2.setXCG01268(XCG01268);
	}

	/**
	* Sets the xcg01269 of this vr technical spec_xcg part2.
	*
	* @param XCG01269 the xcg01269 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01269(java.lang.String XCG01269) {
		_vrTechnicalSpec_XCGPart2.setXCG01269(XCG01269);
	}

	/**
	* Sets the xcg01270 of this vr technical spec_xcg part2.
	*
	* @param XCG01270 the xcg01270 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01270(java.lang.String XCG01270) {
		_vrTechnicalSpec_XCGPart2.setXCG01270(XCG01270);
	}

	/**
	* Sets the xcg01271 of this vr technical spec_xcg part2.
	*
	* @param XCG01271 the xcg01271 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01271(java.lang.String XCG01271) {
		_vrTechnicalSpec_XCGPart2.setXCG01271(XCG01271);
	}

	/**
	* Sets the xcg01273 of this vr technical spec_xcg part2.
	*
	* @param XCG01273 the xcg01273 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01273(java.lang.String XCG01273) {
		_vrTechnicalSpec_XCGPart2.setXCG01273(XCG01273);
	}

	/**
	* Sets the xcg01274 of this vr technical spec_xcg part2.
	*
	* @param XCG01274 the xcg01274 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01274(java.lang.String XCG01274) {
		_vrTechnicalSpec_XCGPart2.setXCG01274(XCG01274);
	}

	/**
	* Sets the xcg01275 of this vr technical spec_xcg part2.
	*
	* @param XCG01275 the xcg01275 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01275(java.lang.String XCG01275) {
		_vrTechnicalSpec_XCGPart2.setXCG01275(XCG01275);
	}

	/**
	* Sets the xcg01276 of this vr technical spec_xcg part2.
	*
	* @param XCG01276 the xcg01276 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01276(java.lang.String XCG01276) {
		_vrTechnicalSpec_XCGPart2.setXCG01276(XCG01276);
	}

	/**
	* Sets the xcg01277 of this vr technical spec_xcg part2.
	*
	* @param XCG01277 the xcg01277 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01277(java.lang.String XCG01277) {
		_vrTechnicalSpec_XCGPart2.setXCG01277(XCG01277);
	}

	/**
	* Sets the xcg01278 of this vr technical spec_xcg part2.
	*
	* @param XCG01278 the xcg01278 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01278(java.lang.String XCG01278) {
		_vrTechnicalSpec_XCGPart2.setXCG01278(XCG01278);
	}

	/**
	* Sets the xcg01279 of this vr technical spec_xcg part2.
	*
	* @param XCG01279 the xcg01279 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01279(java.lang.String XCG01279) {
		_vrTechnicalSpec_XCGPart2.setXCG01279(XCG01279);
	}

	/**
	* Sets the xcg01280 of this vr technical spec_xcg part2.
	*
	* @param XCG01280 the xcg01280 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01280(java.lang.String XCG01280) {
		_vrTechnicalSpec_XCGPart2.setXCG01280(XCG01280);
	}

	/**
	* Sets the xcg01281 of this vr technical spec_xcg part2.
	*
	* @param XCG01281 the xcg01281 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01281(java.lang.String XCG01281) {
		_vrTechnicalSpec_XCGPart2.setXCG01281(XCG01281);
	}

	/**
	* Sets the xcg01282 of this vr technical spec_xcg part2.
	*
	* @param XCG01282 the xcg01282 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01282(java.lang.String XCG01282) {
		_vrTechnicalSpec_XCGPart2.setXCG01282(XCG01282);
	}

	/**
	* Sets the xcg01283 of this vr technical spec_xcg part2.
	*
	* @param XCG01283 the xcg01283 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01283(java.lang.String XCG01283) {
		_vrTechnicalSpec_XCGPart2.setXCG01283(XCG01283);
	}

	/**
	* Sets the xcg01284 of this vr technical spec_xcg part2.
	*
	* @param XCG01284 the xcg01284 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01284(java.lang.String XCG01284) {
		_vrTechnicalSpec_XCGPart2.setXCG01284(XCG01284);
	}

	/**
	* Sets the xcg01285 of this vr technical spec_xcg part2.
	*
	* @param XCG01285 the xcg01285 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01285(java.lang.String XCG01285) {
		_vrTechnicalSpec_XCGPart2.setXCG01285(XCG01285);
	}

	/**
	* Sets the xcg01286 of this vr technical spec_xcg part2.
	*
	* @param XCG01286 the xcg01286 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01286(java.lang.String XCG01286) {
		_vrTechnicalSpec_XCGPart2.setXCG01286(XCG01286);
	}

	/**
	* Sets the xcg01287 of this vr technical spec_xcg part2.
	*
	* @param XCG01287 the xcg01287 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01287(java.lang.String XCG01287) {
		_vrTechnicalSpec_XCGPart2.setXCG01287(XCG01287);
	}

	/**
	* Sets the xcg01288 of this vr technical spec_xcg part2.
	*
	* @param XCG01288 the xcg01288 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01288(java.lang.String XCG01288) {
		_vrTechnicalSpec_XCGPart2.setXCG01288(XCG01288);
	}

	/**
	* Sets the xcg01289 of this vr technical spec_xcg part2.
	*
	* @param XCG01289 the xcg01289 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01289(java.lang.String XCG01289) {
		_vrTechnicalSpec_XCGPart2.setXCG01289(XCG01289);
	}

	/**
	* Sets the xcg01290 of this vr technical spec_xcg part2.
	*
	* @param XCG01290 the xcg01290 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01290(java.lang.String XCG01290) {
		_vrTechnicalSpec_XCGPart2.setXCG01290(XCG01290);
	}

	/**
	* Sets the xcg01291 of this vr technical spec_xcg part2.
	*
	* @param XCG01291 the xcg01291 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01291(java.lang.String XCG01291) {
		_vrTechnicalSpec_XCGPart2.setXCG01291(XCG01291);
	}

	/**
	* Sets the xcg01292 of this vr technical spec_xcg part2.
	*
	* @param XCG01292 the xcg01292 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01292(java.lang.String XCG01292) {
		_vrTechnicalSpec_XCGPart2.setXCG01292(XCG01292);
	}

	/**
	* Sets the xcg01293 of this vr technical spec_xcg part2.
	*
	* @param XCG01293 the xcg01293 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01293(java.lang.String XCG01293) {
		_vrTechnicalSpec_XCGPart2.setXCG01293(XCG01293);
	}

	/**
	* Sets the xcg01294 of this vr technical spec_xcg part2.
	*
	* @param XCG01294 the xcg01294 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01294(java.lang.String XCG01294) {
		_vrTechnicalSpec_XCGPart2.setXCG01294(XCG01294);
	}

	/**
	* Sets the xcg01295 of this vr technical spec_xcg part2.
	*
	* @param XCG01295 the xcg01295 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01295(java.lang.String XCG01295) {
		_vrTechnicalSpec_XCGPart2.setXCG01295(XCG01295);
	}

	/**
	* Sets the xcg01296 of this vr technical spec_xcg part2.
	*
	* @param XCG01296 the xcg01296 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01296(java.lang.String XCG01296) {
		_vrTechnicalSpec_XCGPart2.setXCG01296(XCG01296);
	}

	/**
	* Sets the xcg01297 of this vr technical spec_xcg part2.
	*
	* @param XCG01297 the xcg01297 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01297(java.lang.String XCG01297) {
		_vrTechnicalSpec_XCGPart2.setXCG01297(XCG01297);
	}

	/**
	* Sets the xcg01298 of this vr technical spec_xcg part2.
	*
	* @param XCG01298 the xcg01298 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01298(java.lang.String XCG01298) {
		_vrTechnicalSpec_XCGPart2.setXCG01298(XCG01298);
	}

	/**
	* Sets the xcg01300 of this vr technical spec_xcg part2.
	*
	* @param XCG01300 the xcg01300 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01300(java.lang.String XCG01300) {
		_vrTechnicalSpec_XCGPart2.setXCG01300(XCG01300);
	}

	/**
	* Sets the xcg01301 of this vr technical spec_xcg part2.
	*
	* @param XCG01301 the xcg01301 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01301(java.lang.String XCG01301) {
		_vrTechnicalSpec_XCGPart2.setXCG01301(XCG01301);
	}

	/**
	* Sets the xcg01302 of this vr technical spec_xcg part2.
	*
	* @param XCG01302 the xcg01302 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01302(java.lang.String XCG01302) {
		_vrTechnicalSpec_XCGPart2.setXCG01302(XCG01302);
	}

	/**
	* Sets the xcg01303 of this vr technical spec_xcg part2.
	*
	* @param XCG01303 the xcg01303 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01303(java.lang.String XCG01303) {
		_vrTechnicalSpec_XCGPart2.setXCG01303(XCG01303);
	}

	/**
	* Sets the xcg01304 of this vr technical spec_xcg part2.
	*
	* @param XCG01304 the xcg01304 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01304(java.lang.String XCG01304) {
		_vrTechnicalSpec_XCGPart2.setXCG01304(XCG01304);
	}

	/**
	* Sets the xcg01305 of this vr technical spec_xcg part2.
	*
	* @param XCG01305 the xcg01305 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01305(java.lang.String XCG01305) {
		_vrTechnicalSpec_XCGPart2.setXCG01305(XCG01305);
	}

	/**
	* Sets the xcg01306 of this vr technical spec_xcg part2.
	*
	* @param XCG01306 the xcg01306 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01306(java.lang.String XCG01306) {
		_vrTechnicalSpec_XCGPart2.setXCG01306(XCG01306);
	}

	/**
	* Sets the xcg01307 of this vr technical spec_xcg part2.
	*
	* @param XCG01307 the xcg01307 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01307(java.lang.String XCG01307) {
		_vrTechnicalSpec_XCGPart2.setXCG01307(XCG01307);
	}

	/**
	* Sets the xcg01308 of this vr technical spec_xcg part2.
	*
	* @param XCG01308 the xcg01308 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01308(java.lang.String XCG01308) {
		_vrTechnicalSpec_XCGPart2.setXCG01308(XCG01308);
	}

	/**
	* Sets the xcg01901 of this vr technical spec_xcg part2.
	*
	* @param XCG01901 the xcg01901 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01901(java.lang.String XCG01901) {
		_vrTechnicalSpec_XCGPart2.setXCG01901(XCG01901);
	}

	/**
	* Sets the xcg01902 of this vr technical spec_xcg part2.
	*
	* @param XCG01902 the xcg01902 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01902(java.lang.String XCG01902) {
		_vrTechnicalSpec_XCGPart2.setXCG01902(XCG01902);
	}

	/**
	* Sets the xcg01903 of this vr technical spec_xcg part2.
	*
	* @param XCG01903 the xcg01903 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG01903(java.lang.String XCG01903) {
		_vrTechnicalSpec_XCGPart2.setXCG01903(XCG01903);
	}

	/**
	* Sets the xcg11248 of this vr technical spec_xcg part2.
	*
	* @param XCG11248 the xcg11248 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG11248(java.lang.String XCG11248) {
		_vrTechnicalSpec_XCGPart2.setXCG11248(XCG11248);
	}

	/**
	* Sets the xcg11249 of this vr technical spec_xcg part2.
	*
	* @param XCG11249 the xcg11249 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG11249(java.lang.String XCG11249) {
		_vrTechnicalSpec_XCGPart2.setXCG11249(XCG11249);
	}

	/**
	* Sets the xcg11253 of this vr technical spec_xcg part2.
	*
	* @param XCG11253 the xcg11253 of this vr technical spec_xcg part2
	*/
	@Override
	public void setXCG11253(java.lang.String XCG11253) {
		_vrTechnicalSpec_XCGPart2.setXCG11253(XCG11253);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGPart2Wrapper)) {
			return false;
		}

		VRTechnicalSpec_XCGPart2Wrapper vrTechnicalSpec_XCGPart2Wrapper = (VRTechnicalSpec_XCGPart2Wrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XCGPart2,
					vrTechnicalSpec_XCGPart2Wrapper._vrTechnicalSpec_XCGPart2)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XCGPart2 getWrappedModel() {
		return _vrTechnicalSpec_XCGPart2;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XCGPart2.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XCGPart2.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XCGPart2.resetOriginalValues();
	}

	private final VRTechnicalSpec_XCGPart2 _vrTechnicalSpec_XCGPart2;
}