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
 * This class is a wrapper for {@link VRTechnicalSpec_XCNPart2}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCNPart2
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCNPart2Wrapper implements VRTechnicalSpec_XCNPart2,
	ModelWrapper<VRTechnicalSpec_XCNPart2> {
	public VRTechnicalSpec_XCNPart2Wrapper(
		VRTechnicalSpec_XCNPart2 vrTechnicalSpec_XCNPart2) {
		_vrTechnicalSpec_XCNPart2 = vrTechnicalSpec_XCNPart2;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XCNPart2.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XCNPart2.class.getName();
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
		attributes.put("XCN01186", getXCN01186());
		attributes.put("XCN01187", getXCN01187());
		attributes.put("XCN01188", getXCN01188());
		attributes.put("XCN01189", getXCN01189());
		attributes.put("XCN01190", getXCN01190());
		attributes.put("XCN01191", getXCN01191());
		attributes.put("XCN01192", getXCN01192());
		attributes.put("XCN01193", getXCN01193());
		attributes.put("XCN01194", getXCN01194());
		attributes.put("XCN01195", getXCN01195());
		attributes.put("XCN01196", getXCN01196());
		attributes.put("XCN01197", getXCN01197());
		attributes.put("XCN01198", getXCN01198());
		attributes.put("XCN01199", getXCN01199());
		attributes.put("XCN01200", getXCN01200());
		attributes.put("XCN01201", getXCN01201());
		attributes.put("XCN01202", getXCN01202());
		attributes.put("XCN01203", getXCN01203());
		attributes.put("XCN01204", getXCN01204());
		attributes.put("XCN01205", getXCN01205());
		attributes.put("XCN01206", getXCN01206());
		attributes.put("XCN01207", getXCN01207());
		attributes.put("XCN01208", getXCN01208());
		attributes.put("XCN01209", getXCN01209());
		attributes.put("XCN01210", getXCN01210());
		attributes.put("XCN01211", getXCN01211());
		attributes.put("XCN01212", getXCN01212());
		attributes.put("XCN01213", getXCN01213());
		attributes.put("XCN01214", getXCN01214());
		attributes.put("XCN01215", getXCN01215());
		attributes.put("XCN01216", getXCN01216());
		attributes.put("XCN01217", getXCN01217());
		attributes.put("XCN01218", getXCN01218());
		attributes.put("XCN01219", getXCN01219());
		attributes.put("XCN01220", getXCN01220());
		attributes.put("XCN01221", getXCN01221());
		attributes.put("XCN01222", getXCN01222());
		attributes.put("XCN01223", getXCN01223());
		attributes.put("XCN01224", getXCN01224());
		attributes.put("XCN01225", getXCN01225());
		attributes.put("XCN01226", getXCN01226());
		attributes.put("XCN01227", getXCN01227());
		attributes.put("XCN01228", getXCN01228());
		attributes.put("XCN01229", getXCN01229());
		attributes.put("XCN01230", getXCN01230());
		attributes.put("XCN01231", getXCN01231());
		attributes.put("XCN01232", getXCN01232());
		attributes.put("XCN01233", getXCN01233());
		attributes.put("XCN01234", getXCN01234());
		attributes.put("XCN01235", getXCN01235());
		attributes.put("XCN01236", getXCN01236());
		attributes.put("XCN01237", getXCN01237());
		attributes.put("XCN01238", getXCN01238());
		attributes.put("XCN01239", getXCN01239());
		attributes.put("XCN01240", getXCN01240());
		attributes.put("XCN01241", getXCN01241());
		attributes.put("XCN01242", getXCN01242());
		attributes.put("XCN01243", getXCN01243());
		attributes.put("XCN01244", getXCN01244());
		attributes.put("XCN01245", getXCN01245());
		attributes.put("XCN01246", getXCN01246());
		attributes.put("XCN01247", getXCN01247());
		attributes.put("XCN01248", getXCN01248());
		attributes.put("XCN01249", getXCN01249());
		attributes.put("XCN01250", getXCN01250());
		attributes.put("XCN01251", getXCN01251());
		attributes.put("XCN01252", getXCN01252());
		attributes.put("XCN01253", getXCN01253());
		attributes.put("XCN01254", getXCN01254());
		attributes.put("XCN01255", getXCN01255());
		attributes.put("XCN01256", getXCN01256());
		attributes.put("XCN01257", getXCN01257());
		attributes.put("XCN01258", getXCN01258());
		attributes.put("XCN01259", getXCN01259());
		attributes.put("XCN01260", getXCN01260());
		attributes.put("XCN01261", getXCN01261());
		attributes.put("XCN01262", getXCN01262());
		attributes.put("XCN01263", getXCN01263());
		attributes.put("XCN01264", getXCN01264());
		attributes.put("XCN01265", getXCN01265());
		attributes.put("XCN01266", getXCN01266());
		attributes.put("XCN01267", getXCN01267());
		attributes.put("XCN01268", getXCN01268());
		attributes.put("XCN01269", getXCN01269());
		attributes.put("XCN01270", getXCN01270());
		attributes.put("XCN01271", getXCN01271());
		attributes.put("XCN01272", getXCN01272());
		attributes.put("XCN01273", getXCN01273());
		attributes.put("XCN01274", getXCN01274());
		attributes.put("XCN01275", getXCN01275());
		attributes.put("XCN01276", getXCN01276());
		attributes.put("XCN01277", getXCN01277());
		attributes.put("XCN01278", getXCN01278());
		attributes.put("XCN01279", getXCN01279());
		attributes.put("XCN01280", getXCN01280());
		attributes.put("XCN01281", getXCN01281());
		attributes.put("XCN01282", getXCN01282());
		attributes.put("XCN01283", getXCN01283());
		attributes.put("XCN01284", getXCN01284());
		attributes.put("XCN01285", getXCN01285());
		attributes.put("XCN01286", getXCN01286());
		attributes.put("XCN01287", getXCN01287());
		attributes.put("XCN01288", getXCN01288());
		attributes.put("XCN01289", getXCN01289());
		attributes.put("XCN01290", getXCN01290());
		attributes.put("XCN01291", getXCN01291());
		attributes.put("XCN01292", getXCN01292());
		attributes.put("XCN01293", getXCN01293());
		attributes.put("XCN01294", getXCN01294());
		attributes.put("XCN01295", getXCN01295());
		attributes.put("XCN01296", getXCN01296());
		attributes.put("XCN01297", getXCN01297());
		attributes.put("XCN01298", getXCN01298());
		attributes.put("XCN01299", getXCN01299());
		attributes.put("XCN01300", getXCN01300());
		attributes.put("XCN01301", getXCN01301());
		attributes.put("XCN01302", getXCN01302());
		attributes.put("XCN01303", getXCN01303());
		attributes.put("XCN01304", getXCN01304());
		attributes.put("XCN01305", getXCN01305());
		attributes.put("XCN01306", getXCN01306());
		attributes.put("XCN01307", getXCN01307());
		attributes.put("XCN01308", getXCN01308());
		attributes.put("XCN01309", getXCN01309());
		attributes.put("XCN01310", getXCN01310());
		attributes.put("XCN01311", getXCN01311());
		attributes.put("XCN01312", getXCN01312());
		attributes.put("XCN01313", getXCN01313());
		attributes.put("XCN01314", getXCN01314());
		attributes.put("XCN01315", getXCN01315());
		attributes.put("XCN01316", getXCN01316());
		attributes.put("XCN01317", getXCN01317());
		attributes.put("XCN01318", getXCN01318());
		attributes.put("XCN01319", getXCN01319());
		attributes.put("XCN01320", getXCN01320());
		attributes.put("XCN01321", getXCN01321());
		attributes.put("XCN01322", getXCN01322());
		attributes.put("XCN01323", getXCN01323());
		attributes.put("XCN01324", getXCN01324());
		attributes.put("XCN01325", getXCN01325());
		attributes.put("XCN01326", getXCN01326());
		attributes.put("XCN01327", getXCN01327());
		attributes.put("XCN01328", getXCN01328());
		attributes.put("XCN01329", getXCN01329());
		attributes.put("XCN01330", getXCN01330());
		attributes.put("XCN01331", getXCN01331());
		attributes.put("XCN01332", getXCN01332());
		attributes.put("XCN01333", getXCN01333());
		attributes.put("XCN01334", getXCN01334());
		attributes.put("XCN01335", getXCN01335());
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

		String XCN01186 = (String)attributes.get("XCN01186");

		if (XCN01186 != null) {
			setXCN01186(XCN01186);
		}

		String XCN01187 = (String)attributes.get("XCN01187");

		if (XCN01187 != null) {
			setXCN01187(XCN01187);
		}

		String XCN01188 = (String)attributes.get("XCN01188");

		if (XCN01188 != null) {
			setXCN01188(XCN01188);
		}

		String XCN01189 = (String)attributes.get("XCN01189");

		if (XCN01189 != null) {
			setXCN01189(XCN01189);
		}

		String XCN01190 = (String)attributes.get("XCN01190");

		if (XCN01190 != null) {
			setXCN01190(XCN01190);
		}

		String XCN01191 = (String)attributes.get("XCN01191");

		if (XCN01191 != null) {
			setXCN01191(XCN01191);
		}

		String XCN01192 = (String)attributes.get("XCN01192");

		if (XCN01192 != null) {
			setXCN01192(XCN01192);
		}

		String XCN01193 = (String)attributes.get("XCN01193");

		if (XCN01193 != null) {
			setXCN01193(XCN01193);
		}

		String XCN01194 = (String)attributes.get("XCN01194");

		if (XCN01194 != null) {
			setXCN01194(XCN01194);
		}

		String XCN01195 = (String)attributes.get("XCN01195");

		if (XCN01195 != null) {
			setXCN01195(XCN01195);
		}

		String XCN01196 = (String)attributes.get("XCN01196");

		if (XCN01196 != null) {
			setXCN01196(XCN01196);
		}

		String XCN01197 = (String)attributes.get("XCN01197");

		if (XCN01197 != null) {
			setXCN01197(XCN01197);
		}

		String XCN01198 = (String)attributes.get("XCN01198");

		if (XCN01198 != null) {
			setXCN01198(XCN01198);
		}

		String XCN01199 = (String)attributes.get("XCN01199");

		if (XCN01199 != null) {
			setXCN01199(XCN01199);
		}

		String XCN01200 = (String)attributes.get("XCN01200");

		if (XCN01200 != null) {
			setXCN01200(XCN01200);
		}

		String XCN01201 = (String)attributes.get("XCN01201");

		if (XCN01201 != null) {
			setXCN01201(XCN01201);
		}

		String XCN01202 = (String)attributes.get("XCN01202");

		if (XCN01202 != null) {
			setXCN01202(XCN01202);
		}

		String XCN01203 = (String)attributes.get("XCN01203");

		if (XCN01203 != null) {
			setXCN01203(XCN01203);
		}

		String XCN01204 = (String)attributes.get("XCN01204");

		if (XCN01204 != null) {
			setXCN01204(XCN01204);
		}

		String XCN01205 = (String)attributes.get("XCN01205");

		if (XCN01205 != null) {
			setXCN01205(XCN01205);
		}

		String XCN01206 = (String)attributes.get("XCN01206");

		if (XCN01206 != null) {
			setXCN01206(XCN01206);
		}

		String XCN01207 = (String)attributes.get("XCN01207");

		if (XCN01207 != null) {
			setXCN01207(XCN01207);
		}

		String XCN01208 = (String)attributes.get("XCN01208");

		if (XCN01208 != null) {
			setXCN01208(XCN01208);
		}

		String XCN01209 = (String)attributes.get("XCN01209");

		if (XCN01209 != null) {
			setXCN01209(XCN01209);
		}

		String XCN01210 = (String)attributes.get("XCN01210");

		if (XCN01210 != null) {
			setXCN01210(XCN01210);
		}

		String XCN01211 = (String)attributes.get("XCN01211");

		if (XCN01211 != null) {
			setXCN01211(XCN01211);
		}

		String XCN01212 = (String)attributes.get("XCN01212");

		if (XCN01212 != null) {
			setXCN01212(XCN01212);
		}

		String XCN01213 = (String)attributes.get("XCN01213");

		if (XCN01213 != null) {
			setXCN01213(XCN01213);
		}

		String XCN01214 = (String)attributes.get("XCN01214");

		if (XCN01214 != null) {
			setXCN01214(XCN01214);
		}

		String XCN01215 = (String)attributes.get("XCN01215");

		if (XCN01215 != null) {
			setXCN01215(XCN01215);
		}

		String XCN01216 = (String)attributes.get("XCN01216");

		if (XCN01216 != null) {
			setXCN01216(XCN01216);
		}

		String XCN01217 = (String)attributes.get("XCN01217");

		if (XCN01217 != null) {
			setXCN01217(XCN01217);
		}

		String XCN01218 = (String)attributes.get("XCN01218");

		if (XCN01218 != null) {
			setXCN01218(XCN01218);
		}

		String XCN01219 = (String)attributes.get("XCN01219");

		if (XCN01219 != null) {
			setXCN01219(XCN01219);
		}

		String XCN01220 = (String)attributes.get("XCN01220");

		if (XCN01220 != null) {
			setXCN01220(XCN01220);
		}

		String XCN01221 = (String)attributes.get("XCN01221");

		if (XCN01221 != null) {
			setXCN01221(XCN01221);
		}

		String XCN01222 = (String)attributes.get("XCN01222");

		if (XCN01222 != null) {
			setXCN01222(XCN01222);
		}

		String XCN01223 = (String)attributes.get("XCN01223");

		if (XCN01223 != null) {
			setXCN01223(XCN01223);
		}

		String XCN01224 = (String)attributes.get("XCN01224");

		if (XCN01224 != null) {
			setXCN01224(XCN01224);
		}

		String XCN01225 = (String)attributes.get("XCN01225");

		if (XCN01225 != null) {
			setXCN01225(XCN01225);
		}

		String XCN01226 = (String)attributes.get("XCN01226");

		if (XCN01226 != null) {
			setXCN01226(XCN01226);
		}

		String XCN01227 = (String)attributes.get("XCN01227");

		if (XCN01227 != null) {
			setXCN01227(XCN01227);
		}

		String XCN01228 = (String)attributes.get("XCN01228");

		if (XCN01228 != null) {
			setXCN01228(XCN01228);
		}

		String XCN01229 = (String)attributes.get("XCN01229");

		if (XCN01229 != null) {
			setXCN01229(XCN01229);
		}

		String XCN01230 = (String)attributes.get("XCN01230");

		if (XCN01230 != null) {
			setXCN01230(XCN01230);
		}

		String XCN01231 = (String)attributes.get("XCN01231");

		if (XCN01231 != null) {
			setXCN01231(XCN01231);
		}

		String XCN01232 = (String)attributes.get("XCN01232");

		if (XCN01232 != null) {
			setXCN01232(XCN01232);
		}

		String XCN01233 = (String)attributes.get("XCN01233");

		if (XCN01233 != null) {
			setXCN01233(XCN01233);
		}

		String XCN01234 = (String)attributes.get("XCN01234");

		if (XCN01234 != null) {
			setXCN01234(XCN01234);
		}

		String XCN01235 = (String)attributes.get("XCN01235");

		if (XCN01235 != null) {
			setXCN01235(XCN01235);
		}

		String XCN01236 = (String)attributes.get("XCN01236");

		if (XCN01236 != null) {
			setXCN01236(XCN01236);
		}

		String XCN01237 = (String)attributes.get("XCN01237");

		if (XCN01237 != null) {
			setXCN01237(XCN01237);
		}

		String XCN01238 = (String)attributes.get("XCN01238");

		if (XCN01238 != null) {
			setXCN01238(XCN01238);
		}

		String XCN01239 = (String)attributes.get("XCN01239");

		if (XCN01239 != null) {
			setXCN01239(XCN01239);
		}

		String XCN01240 = (String)attributes.get("XCN01240");

		if (XCN01240 != null) {
			setXCN01240(XCN01240);
		}

		String XCN01241 = (String)attributes.get("XCN01241");

		if (XCN01241 != null) {
			setXCN01241(XCN01241);
		}

		String XCN01242 = (String)attributes.get("XCN01242");

		if (XCN01242 != null) {
			setXCN01242(XCN01242);
		}

		String XCN01243 = (String)attributes.get("XCN01243");

		if (XCN01243 != null) {
			setXCN01243(XCN01243);
		}

		String XCN01244 = (String)attributes.get("XCN01244");

		if (XCN01244 != null) {
			setXCN01244(XCN01244);
		}

		String XCN01245 = (String)attributes.get("XCN01245");

		if (XCN01245 != null) {
			setXCN01245(XCN01245);
		}

		String XCN01246 = (String)attributes.get("XCN01246");

		if (XCN01246 != null) {
			setXCN01246(XCN01246);
		}

		String XCN01247 = (String)attributes.get("XCN01247");

		if (XCN01247 != null) {
			setXCN01247(XCN01247);
		}

		String XCN01248 = (String)attributes.get("XCN01248");

		if (XCN01248 != null) {
			setXCN01248(XCN01248);
		}

		String XCN01249 = (String)attributes.get("XCN01249");

		if (XCN01249 != null) {
			setXCN01249(XCN01249);
		}

		String XCN01250 = (String)attributes.get("XCN01250");

		if (XCN01250 != null) {
			setXCN01250(XCN01250);
		}

		String XCN01251 = (String)attributes.get("XCN01251");

		if (XCN01251 != null) {
			setXCN01251(XCN01251);
		}

		String XCN01252 = (String)attributes.get("XCN01252");

		if (XCN01252 != null) {
			setXCN01252(XCN01252);
		}

		String XCN01253 = (String)attributes.get("XCN01253");

		if (XCN01253 != null) {
			setXCN01253(XCN01253);
		}

		String XCN01254 = (String)attributes.get("XCN01254");

		if (XCN01254 != null) {
			setXCN01254(XCN01254);
		}

		String XCN01255 = (String)attributes.get("XCN01255");

		if (XCN01255 != null) {
			setXCN01255(XCN01255);
		}

		String XCN01256 = (String)attributes.get("XCN01256");

		if (XCN01256 != null) {
			setXCN01256(XCN01256);
		}

		String XCN01257 = (String)attributes.get("XCN01257");

		if (XCN01257 != null) {
			setXCN01257(XCN01257);
		}

		String XCN01258 = (String)attributes.get("XCN01258");

		if (XCN01258 != null) {
			setXCN01258(XCN01258);
		}

		String XCN01259 = (String)attributes.get("XCN01259");

		if (XCN01259 != null) {
			setXCN01259(XCN01259);
		}

		String XCN01260 = (String)attributes.get("XCN01260");

		if (XCN01260 != null) {
			setXCN01260(XCN01260);
		}

		String XCN01261 = (String)attributes.get("XCN01261");

		if (XCN01261 != null) {
			setXCN01261(XCN01261);
		}

		String XCN01262 = (String)attributes.get("XCN01262");

		if (XCN01262 != null) {
			setXCN01262(XCN01262);
		}

		String XCN01263 = (String)attributes.get("XCN01263");

		if (XCN01263 != null) {
			setXCN01263(XCN01263);
		}

		String XCN01264 = (String)attributes.get("XCN01264");

		if (XCN01264 != null) {
			setXCN01264(XCN01264);
		}

		String XCN01265 = (String)attributes.get("XCN01265");

		if (XCN01265 != null) {
			setXCN01265(XCN01265);
		}

		String XCN01266 = (String)attributes.get("XCN01266");

		if (XCN01266 != null) {
			setXCN01266(XCN01266);
		}

		String XCN01267 = (String)attributes.get("XCN01267");

		if (XCN01267 != null) {
			setXCN01267(XCN01267);
		}

		String XCN01268 = (String)attributes.get("XCN01268");

		if (XCN01268 != null) {
			setXCN01268(XCN01268);
		}

		String XCN01269 = (String)attributes.get("XCN01269");

		if (XCN01269 != null) {
			setXCN01269(XCN01269);
		}

		String XCN01270 = (String)attributes.get("XCN01270");

		if (XCN01270 != null) {
			setXCN01270(XCN01270);
		}

		String XCN01271 = (String)attributes.get("XCN01271");

		if (XCN01271 != null) {
			setXCN01271(XCN01271);
		}

		String XCN01272 = (String)attributes.get("XCN01272");

		if (XCN01272 != null) {
			setXCN01272(XCN01272);
		}

		String XCN01273 = (String)attributes.get("XCN01273");

		if (XCN01273 != null) {
			setXCN01273(XCN01273);
		}

		String XCN01274 = (String)attributes.get("XCN01274");

		if (XCN01274 != null) {
			setXCN01274(XCN01274);
		}

		String XCN01275 = (String)attributes.get("XCN01275");

		if (XCN01275 != null) {
			setXCN01275(XCN01275);
		}

		String XCN01276 = (String)attributes.get("XCN01276");

		if (XCN01276 != null) {
			setXCN01276(XCN01276);
		}

		String XCN01277 = (String)attributes.get("XCN01277");

		if (XCN01277 != null) {
			setXCN01277(XCN01277);
		}

		String XCN01278 = (String)attributes.get("XCN01278");

		if (XCN01278 != null) {
			setXCN01278(XCN01278);
		}

		String XCN01279 = (String)attributes.get("XCN01279");

		if (XCN01279 != null) {
			setXCN01279(XCN01279);
		}

		String XCN01280 = (String)attributes.get("XCN01280");

		if (XCN01280 != null) {
			setXCN01280(XCN01280);
		}

		String XCN01281 = (String)attributes.get("XCN01281");

		if (XCN01281 != null) {
			setXCN01281(XCN01281);
		}

		String XCN01282 = (String)attributes.get("XCN01282");

		if (XCN01282 != null) {
			setXCN01282(XCN01282);
		}

		String XCN01283 = (String)attributes.get("XCN01283");

		if (XCN01283 != null) {
			setXCN01283(XCN01283);
		}

		String XCN01284 = (String)attributes.get("XCN01284");

		if (XCN01284 != null) {
			setXCN01284(XCN01284);
		}

		String XCN01285 = (String)attributes.get("XCN01285");

		if (XCN01285 != null) {
			setXCN01285(XCN01285);
		}

		String XCN01286 = (String)attributes.get("XCN01286");

		if (XCN01286 != null) {
			setXCN01286(XCN01286);
		}

		String XCN01287 = (String)attributes.get("XCN01287");

		if (XCN01287 != null) {
			setXCN01287(XCN01287);
		}

		String XCN01288 = (String)attributes.get("XCN01288");

		if (XCN01288 != null) {
			setXCN01288(XCN01288);
		}

		String XCN01289 = (String)attributes.get("XCN01289");

		if (XCN01289 != null) {
			setXCN01289(XCN01289);
		}

		String XCN01290 = (String)attributes.get("XCN01290");

		if (XCN01290 != null) {
			setXCN01290(XCN01290);
		}

		String XCN01291 = (String)attributes.get("XCN01291");

		if (XCN01291 != null) {
			setXCN01291(XCN01291);
		}

		String XCN01292 = (String)attributes.get("XCN01292");

		if (XCN01292 != null) {
			setXCN01292(XCN01292);
		}

		String XCN01293 = (String)attributes.get("XCN01293");

		if (XCN01293 != null) {
			setXCN01293(XCN01293);
		}

		String XCN01294 = (String)attributes.get("XCN01294");

		if (XCN01294 != null) {
			setXCN01294(XCN01294);
		}

		String XCN01295 = (String)attributes.get("XCN01295");

		if (XCN01295 != null) {
			setXCN01295(XCN01295);
		}

		String XCN01296 = (String)attributes.get("XCN01296");

		if (XCN01296 != null) {
			setXCN01296(XCN01296);
		}

		String XCN01297 = (String)attributes.get("XCN01297");

		if (XCN01297 != null) {
			setXCN01297(XCN01297);
		}

		String XCN01298 = (String)attributes.get("XCN01298");

		if (XCN01298 != null) {
			setXCN01298(XCN01298);
		}

		String XCN01299 = (String)attributes.get("XCN01299");

		if (XCN01299 != null) {
			setXCN01299(XCN01299);
		}

		String XCN01300 = (String)attributes.get("XCN01300");

		if (XCN01300 != null) {
			setXCN01300(XCN01300);
		}

		String XCN01301 = (String)attributes.get("XCN01301");

		if (XCN01301 != null) {
			setXCN01301(XCN01301);
		}

		String XCN01302 = (String)attributes.get("XCN01302");

		if (XCN01302 != null) {
			setXCN01302(XCN01302);
		}

		String XCN01303 = (String)attributes.get("XCN01303");

		if (XCN01303 != null) {
			setXCN01303(XCN01303);
		}

		String XCN01304 = (String)attributes.get("XCN01304");

		if (XCN01304 != null) {
			setXCN01304(XCN01304);
		}

		String XCN01305 = (String)attributes.get("XCN01305");

		if (XCN01305 != null) {
			setXCN01305(XCN01305);
		}

		String XCN01306 = (String)attributes.get("XCN01306");

		if (XCN01306 != null) {
			setXCN01306(XCN01306);
		}

		String XCN01307 = (String)attributes.get("XCN01307");

		if (XCN01307 != null) {
			setXCN01307(XCN01307);
		}

		String XCN01308 = (String)attributes.get("XCN01308");

		if (XCN01308 != null) {
			setXCN01308(XCN01308);
		}

		String XCN01309 = (String)attributes.get("XCN01309");

		if (XCN01309 != null) {
			setXCN01309(XCN01309);
		}

		String XCN01310 = (String)attributes.get("XCN01310");

		if (XCN01310 != null) {
			setXCN01310(XCN01310);
		}

		String XCN01311 = (String)attributes.get("XCN01311");

		if (XCN01311 != null) {
			setXCN01311(XCN01311);
		}

		String XCN01312 = (String)attributes.get("XCN01312");

		if (XCN01312 != null) {
			setXCN01312(XCN01312);
		}

		String XCN01313 = (String)attributes.get("XCN01313");

		if (XCN01313 != null) {
			setXCN01313(XCN01313);
		}

		String XCN01314 = (String)attributes.get("XCN01314");

		if (XCN01314 != null) {
			setXCN01314(XCN01314);
		}

		String XCN01315 = (String)attributes.get("XCN01315");

		if (XCN01315 != null) {
			setXCN01315(XCN01315);
		}

		String XCN01316 = (String)attributes.get("XCN01316");

		if (XCN01316 != null) {
			setXCN01316(XCN01316);
		}

		String XCN01317 = (String)attributes.get("XCN01317");

		if (XCN01317 != null) {
			setXCN01317(XCN01317);
		}

		String XCN01318 = (String)attributes.get("XCN01318");

		if (XCN01318 != null) {
			setXCN01318(XCN01318);
		}

		String XCN01319 = (String)attributes.get("XCN01319");

		if (XCN01319 != null) {
			setXCN01319(XCN01319);
		}

		String XCN01320 = (String)attributes.get("XCN01320");

		if (XCN01320 != null) {
			setXCN01320(XCN01320);
		}

		String XCN01321 = (String)attributes.get("XCN01321");

		if (XCN01321 != null) {
			setXCN01321(XCN01321);
		}

		String XCN01322 = (String)attributes.get("XCN01322");

		if (XCN01322 != null) {
			setXCN01322(XCN01322);
		}

		String XCN01323 = (String)attributes.get("XCN01323");

		if (XCN01323 != null) {
			setXCN01323(XCN01323);
		}

		String XCN01324 = (String)attributes.get("XCN01324");

		if (XCN01324 != null) {
			setXCN01324(XCN01324);
		}

		String XCN01325 = (String)attributes.get("XCN01325");

		if (XCN01325 != null) {
			setXCN01325(XCN01325);
		}

		String XCN01326 = (String)attributes.get("XCN01326");

		if (XCN01326 != null) {
			setXCN01326(XCN01326);
		}

		String XCN01327 = (String)attributes.get("XCN01327");

		if (XCN01327 != null) {
			setXCN01327(XCN01327);
		}

		String XCN01328 = (String)attributes.get("XCN01328");

		if (XCN01328 != null) {
			setXCN01328(XCN01328);
		}

		String XCN01329 = (String)attributes.get("XCN01329");

		if (XCN01329 != null) {
			setXCN01329(XCN01329);
		}

		String XCN01330 = (String)attributes.get("XCN01330");

		if (XCN01330 != null) {
			setXCN01330(XCN01330);
		}

		String XCN01331 = (String)attributes.get("XCN01331");

		if (XCN01331 != null) {
			setXCN01331(XCN01331);
		}

		String XCN01332 = (String)attributes.get("XCN01332");

		if (XCN01332 != null) {
			setXCN01332(XCN01332);
		}

		String XCN01333 = (String)attributes.get("XCN01333");

		if (XCN01333 != null) {
			setXCN01333(XCN01333);
		}

		String XCN01334 = (String)attributes.get("XCN01334");

		if (XCN01334 != null) {
			setXCN01334(XCN01334);
		}

		String XCN01335 = (String)attributes.get("XCN01335");

		if (XCN01335 != null) {
			setXCN01335(XCN01335);
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
	public VRTechnicalSpec_XCNPart2 toEscapedModel() {
		return new VRTechnicalSpec_XCNPart2Wrapper(_vrTechnicalSpec_XCNPart2.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XCNPart2 toUnescapedModel() {
		return new VRTechnicalSpec_XCNPart2Wrapper(_vrTechnicalSpec_XCNPart2.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XCNPart2.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XCNPart2.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XCNPart2.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XCNPart2.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XCNPart2> toCacheModel() {
		return _vrTechnicalSpec_XCNPart2.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XCNPart2 vrTechnicalSpec_XCNPart2) {
		return _vrTechnicalSpec_XCNPart2.compareTo(vrTechnicalSpec_XCNPart2);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XCNPart2.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XCNPart2.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XCNPart2Wrapper((VRTechnicalSpec_XCNPart2)_vrTechnicalSpec_XCNPart2.clone());
	}

	/**
	* Returns the deliverable code of this vr technical spec_xcn part2.
	*
	* @return the deliverable code of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XCNPart2.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xcn part2.
	*
	* @return the dossier ID ctn of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XCNPart2.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xcn part2.
	*
	* @return the dossier no of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XCNPart2.getDossierNo();
	}

	/**
	* Returns the reference uid of this vr technical spec_xcn part2.
	*
	* @return the reference uid of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XCNPart2.getReferenceUid();
	}

	/**
	* Returns the xcn01186 of this vr technical spec_xcn part2.
	*
	* @return the xcn01186 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01186() {
		return _vrTechnicalSpec_XCNPart2.getXCN01186();
	}

	/**
	* Returns the xcn01187 of this vr technical spec_xcn part2.
	*
	* @return the xcn01187 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01187() {
		return _vrTechnicalSpec_XCNPart2.getXCN01187();
	}

	/**
	* Returns the xcn01188 of this vr technical spec_xcn part2.
	*
	* @return the xcn01188 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01188() {
		return _vrTechnicalSpec_XCNPart2.getXCN01188();
	}

	/**
	* Returns the xcn01189 of this vr technical spec_xcn part2.
	*
	* @return the xcn01189 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01189() {
		return _vrTechnicalSpec_XCNPart2.getXCN01189();
	}

	/**
	* Returns the xcn01190 of this vr technical spec_xcn part2.
	*
	* @return the xcn01190 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01190() {
		return _vrTechnicalSpec_XCNPart2.getXCN01190();
	}

	/**
	* Returns the xcn01191 of this vr technical spec_xcn part2.
	*
	* @return the xcn01191 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01191() {
		return _vrTechnicalSpec_XCNPart2.getXCN01191();
	}

	/**
	* Returns the xcn01192 of this vr technical spec_xcn part2.
	*
	* @return the xcn01192 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01192() {
		return _vrTechnicalSpec_XCNPart2.getXCN01192();
	}

	/**
	* Returns the xcn01193 of this vr technical spec_xcn part2.
	*
	* @return the xcn01193 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01193() {
		return _vrTechnicalSpec_XCNPart2.getXCN01193();
	}

	/**
	* Returns the xcn01194 of this vr technical spec_xcn part2.
	*
	* @return the xcn01194 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01194() {
		return _vrTechnicalSpec_XCNPart2.getXCN01194();
	}

	/**
	* Returns the xcn01195 of this vr technical spec_xcn part2.
	*
	* @return the xcn01195 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01195() {
		return _vrTechnicalSpec_XCNPart2.getXCN01195();
	}

	/**
	* Returns the xcn01196 of this vr technical spec_xcn part2.
	*
	* @return the xcn01196 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01196() {
		return _vrTechnicalSpec_XCNPart2.getXCN01196();
	}

	/**
	* Returns the xcn01197 of this vr technical spec_xcn part2.
	*
	* @return the xcn01197 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01197() {
		return _vrTechnicalSpec_XCNPart2.getXCN01197();
	}

	/**
	* Returns the xcn01198 of this vr technical spec_xcn part2.
	*
	* @return the xcn01198 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01198() {
		return _vrTechnicalSpec_XCNPart2.getXCN01198();
	}

	/**
	* Returns the xcn01199 of this vr technical spec_xcn part2.
	*
	* @return the xcn01199 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01199() {
		return _vrTechnicalSpec_XCNPart2.getXCN01199();
	}

	/**
	* Returns the xcn01200 of this vr technical spec_xcn part2.
	*
	* @return the xcn01200 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01200() {
		return _vrTechnicalSpec_XCNPart2.getXCN01200();
	}

	/**
	* Returns the xcn01201 of this vr technical spec_xcn part2.
	*
	* @return the xcn01201 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01201() {
		return _vrTechnicalSpec_XCNPart2.getXCN01201();
	}

	/**
	* Returns the xcn01202 of this vr technical spec_xcn part2.
	*
	* @return the xcn01202 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01202() {
		return _vrTechnicalSpec_XCNPart2.getXCN01202();
	}

	/**
	* Returns the xcn01203 of this vr technical spec_xcn part2.
	*
	* @return the xcn01203 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01203() {
		return _vrTechnicalSpec_XCNPart2.getXCN01203();
	}

	/**
	* Returns the xcn01204 of this vr technical spec_xcn part2.
	*
	* @return the xcn01204 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01204() {
		return _vrTechnicalSpec_XCNPart2.getXCN01204();
	}

	/**
	* Returns the xcn01205 of this vr technical spec_xcn part2.
	*
	* @return the xcn01205 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01205() {
		return _vrTechnicalSpec_XCNPart2.getXCN01205();
	}

	/**
	* Returns the xcn01206 of this vr technical spec_xcn part2.
	*
	* @return the xcn01206 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01206() {
		return _vrTechnicalSpec_XCNPart2.getXCN01206();
	}

	/**
	* Returns the xcn01207 of this vr technical spec_xcn part2.
	*
	* @return the xcn01207 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01207() {
		return _vrTechnicalSpec_XCNPart2.getXCN01207();
	}

	/**
	* Returns the xcn01208 of this vr technical spec_xcn part2.
	*
	* @return the xcn01208 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01208() {
		return _vrTechnicalSpec_XCNPart2.getXCN01208();
	}

	/**
	* Returns the xcn01209 of this vr technical spec_xcn part2.
	*
	* @return the xcn01209 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01209() {
		return _vrTechnicalSpec_XCNPart2.getXCN01209();
	}

	/**
	* Returns the xcn01210 of this vr technical spec_xcn part2.
	*
	* @return the xcn01210 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01210() {
		return _vrTechnicalSpec_XCNPart2.getXCN01210();
	}

	/**
	* Returns the xcn01211 of this vr technical spec_xcn part2.
	*
	* @return the xcn01211 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01211() {
		return _vrTechnicalSpec_XCNPart2.getXCN01211();
	}

	/**
	* Returns the xcn01212 of this vr technical spec_xcn part2.
	*
	* @return the xcn01212 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01212() {
		return _vrTechnicalSpec_XCNPart2.getXCN01212();
	}

	/**
	* Returns the xcn01213 of this vr technical spec_xcn part2.
	*
	* @return the xcn01213 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01213() {
		return _vrTechnicalSpec_XCNPart2.getXCN01213();
	}

	/**
	* Returns the xcn01214 of this vr technical spec_xcn part2.
	*
	* @return the xcn01214 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01214() {
		return _vrTechnicalSpec_XCNPart2.getXCN01214();
	}

	/**
	* Returns the xcn01215 of this vr technical spec_xcn part2.
	*
	* @return the xcn01215 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01215() {
		return _vrTechnicalSpec_XCNPart2.getXCN01215();
	}

	/**
	* Returns the xcn01216 of this vr technical spec_xcn part2.
	*
	* @return the xcn01216 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01216() {
		return _vrTechnicalSpec_XCNPart2.getXCN01216();
	}

	/**
	* Returns the xcn01217 of this vr technical spec_xcn part2.
	*
	* @return the xcn01217 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01217() {
		return _vrTechnicalSpec_XCNPart2.getXCN01217();
	}

	/**
	* Returns the xcn01218 of this vr technical spec_xcn part2.
	*
	* @return the xcn01218 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01218() {
		return _vrTechnicalSpec_XCNPart2.getXCN01218();
	}

	/**
	* Returns the xcn01219 of this vr technical spec_xcn part2.
	*
	* @return the xcn01219 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01219() {
		return _vrTechnicalSpec_XCNPart2.getXCN01219();
	}

	/**
	* Returns the xcn01220 of this vr technical spec_xcn part2.
	*
	* @return the xcn01220 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01220() {
		return _vrTechnicalSpec_XCNPart2.getXCN01220();
	}

	/**
	* Returns the xcn01221 of this vr technical spec_xcn part2.
	*
	* @return the xcn01221 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01221() {
		return _vrTechnicalSpec_XCNPart2.getXCN01221();
	}

	/**
	* Returns the xcn01222 of this vr technical spec_xcn part2.
	*
	* @return the xcn01222 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01222() {
		return _vrTechnicalSpec_XCNPart2.getXCN01222();
	}

	/**
	* Returns the xcn01223 of this vr technical spec_xcn part2.
	*
	* @return the xcn01223 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01223() {
		return _vrTechnicalSpec_XCNPart2.getXCN01223();
	}

	/**
	* Returns the xcn01224 of this vr technical spec_xcn part2.
	*
	* @return the xcn01224 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01224() {
		return _vrTechnicalSpec_XCNPart2.getXCN01224();
	}

	/**
	* Returns the xcn01225 of this vr technical spec_xcn part2.
	*
	* @return the xcn01225 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01225() {
		return _vrTechnicalSpec_XCNPart2.getXCN01225();
	}

	/**
	* Returns the xcn01226 of this vr technical spec_xcn part2.
	*
	* @return the xcn01226 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01226() {
		return _vrTechnicalSpec_XCNPart2.getXCN01226();
	}

	/**
	* Returns the xcn01227 of this vr technical spec_xcn part2.
	*
	* @return the xcn01227 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01227() {
		return _vrTechnicalSpec_XCNPart2.getXCN01227();
	}

	/**
	* Returns the xcn01228 of this vr technical spec_xcn part2.
	*
	* @return the xcn01228 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01228() {
		return _vrTechnicalSpec_XCNPart2.getXCN01228();
	}

	/**
	* Returns the xcn01229 of this vr technical spec_xcn part2.
	*
	* @return the xcn01229 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01229() {
		return _vrTechnicalSpec_XCNPart2.getXCN01229();
	}

	/**
	* Returns the xcn01230 of this vr technical spec_xcn part2.
	*
	* @return the xcn01230 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01230() {
		return _vrTechnicalSpec_XCNPart2.getXCN01230();
	}

	/**
	* Returns the xcn01231 of this vr technical spec_xcn part2.
	*
	* @return the xcn01231 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01231() {
		return _vrTechnicalSpec_XCNPart2.getXCN01231();
	}

	/**
	* Returns the xcn01232 of this vr technical spec_xcn part2.
	*
	* @return the xcn01232 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01232() {
		return _vrTechnicalSpec_XCNPart2.getXCN01232();
	}

	/**
	* Returns the xcn01233 of this vr technical spec_xcn part2.
	*
	* @return the xcn01233 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01233() {
		return _vrTechnicalSpec_XCNPart2.getXCN01233();
	}

	/**
	* Returns the xcn01234 of this vr technical spec_xcn part2.
	*
	* @return the xcn01234 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01234() {
		return _vrTechnicalSpec_XCNPart2.getXCN01234();
	}

	/**
	* Returns the xcn01235 of this vr technical spec_xcn part2.
	*
	* @return the xcn01235 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01235() {
		return _vrTechnicalSpec_XCNPart2.getXCN01235();
	}

	/**
	* Returns the xcn01236 of this vr technical spec_xcn part2.
	*
	* @return the xcn01236 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01236() {
		return _vrTechnicalSpec_XCNPart2.getXCN01236();
	}

	/**
	* Returns the xcn01237 of this vr technical spec_xcn part2.
	*
	* @return the xcn01237 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01237() {
		return _vrTechnicalSpec_XCNPart2.getXCN01237();
	}

	/**
	* Returns the xcn01238 of this vr technical spec_xcn part2.
	*
	* @return the xcn01238 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01238() {
		return _vrTechnicalSpec_XCNPart2.getXCN01238();
	}

	/**
	* Returns the xcn01239 of this vr technical spec_xcn part2.
	*
	* @return the xcn01239 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01239() {
		return _vrTechnicalSpec_XCNPart2.getXCN01239();
	}

	/**
	* Returns the xcn01240 of this vr technical spec_xcn part2.
	*
	* @return the xcn01240 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01240() {
		return _vrTechnicalSpec_XCNPart2.getXCN01240();
	}

	/**
	* Returns the xcn01241 of this vr technical spec_xcn part2.
	*
	* @return the xcn01241 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01241() {
		return _vrTechnicalSpec_XCNPart2.getXCN01241();
	}

	/**
	* Returns the xcn01242 of this vr technical spec_xcn part2.
	*
	* @return the xcn01242 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01242() {
		return _vrTechnicalSpec_XCNPart2.getXCN01242();
	}

	/**
	* Returns the xcn01243 of this vr technical spec_xcn part2.
	*
	* @return the xcn01243 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01243() {
		return _vrTechnicalSpec_XCNPart2.getXCN01243();
	}

	/**
	* Returns the xcn01244 of this vr technical spec_xcn part2.
	*
	* @return the xcn01244 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01244() {
		return _vrTechnicalSpec_XCNPart2.getXCN01244();
	}

	/**
	* Returns the xcn01245 of this vr technical spec_xcn part2.
	*
	* @return the xcn01245 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01245() {
		return _vrTechnicalSpec_XCNPart2.getXCN01245();
	}

	/**
	* Returns the xcn01246 of this vr technical spec_xcn part2.
	*
	* @return the xcn01246 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01246() {
		return _vrTechnicalSpec_XCNPart2.getXCN01246();
	}

	/**
	* Returns the xcn01247 of this vr technical spec_xcn part2.
	*
	* @return the xcn01247 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01247() {
		return _vrTechnicalSpec_XCNPart2.getXCN01247();
	}

	/**
	* Returns the xcn01248 of this vr technical spec_xcn part2.
	*
	* @return the xcn01248 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01248() {
		return _vrTechnicalSpec_XCNPart2.getXCN01248();
	}

	/**
	* Returns the xcn01249 of this vr technical spec_xcn part2.
	*
	* @return the xcn01249 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01249() {
		return _vrTechnicalSpec_XCNPart2.getXCN01249();
	}

	/**
	* Returns the xcn01250 of this vr technical spec_xcn part2.
	*
	* @return the xcn01250 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01250() {
		return _vrTechnicalSpec_XCNPart2.getXCN01250();
	}

	/**
	* Returns the xcn01251 of this vr technical spec_xcn part2.
	*
	* @return the xcn01251 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01251() {
		return _vrTechnicalSpec_XCNPart2.getXCN01251();
	}

	/**
	* Returns the xcn01252 of this vr technical spec_xcn part2.
	*
	* @return the xcn01252 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01252() {
		return _vrTechnicalSpec_XCNPart2.getXCN01252();
	}

	/**
	* Returns the xcn01253 of this vr technical spec_xcn part2.
	*
	* @return the xcn01253 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01253() {
		return _vrTechnicalSpec_XCNPart2.getXCN01253();
	}

	/**
	* Returns the xcn01254 of this vr technical spec_xcn part2.
	*
	* @return the xcn01254 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01254() {
		return _vrTechnicalSpec_XCNPart2.getXCN01254();
	}

	/**
	* Returns the xcn01255 of this vr technical spec_xcn part2.
	*
	* @return the xcn01255 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01255() {
		return _vrTechnicalSpec_XCNPart2.getXCN01255();
	}

	/**
	* Returns the xcn01256 of this vr technical spec_xcn part2.
	*
	* @return the xcn01256 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01256() {
		return _vrTechnicalSpec_XCNPart2.getXCN01256();
	}

	/**
	* Returns the xcn01257 of this vr technical spec_xcn part2.
	*
	* @return the xcn01257 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01257() {
		return _vrTechnicalSpec_XCNPart2.getXCN01257();
	}

	/**
	* Returns the xcn01258 of this vr technical spec_xcn part2.
	*
	* @return the xcn01258 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01258() {
		return _vrTechnicalSpec_XCNPart2.getXCN01258();
	}

	/**
	* Returns the xcn01259 of this vr technical spec_xcn part2.
	*
	* @return the xcn01259 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01259() {
		return _vrTechnicalSpec_XCNPart2.getXCN01259();
	}

	/**
	* Returns the xcn01260 of this vr technical spec_xcn part2.
	*
	* @return the xcn01260 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01260() {
		return _vrTechnicalSpec_XCNPart2.getXCN01260();
	}

	/**
	* Returns the xcn01261 of this vr technical spec_xcn part2.
	*
	* @return the xcn01261 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01261() {
		return _vrTechnicalSpec_XCNPart2.getXCN01261();
	}

	/**
	* Returns the xcn01262 of this vr technical spec_xcn part2.
	*
	* @return the xcn01262 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01262() {
		return _vrTechnicalSpec_XCNPart2.getXCN01262();
	}

	/**
	* Returns the xcn01263 of this vr technical spec_xcn part2.
	*
	* @return the xcn01263 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01263() {
		return _vrTechnicalSpec_XCNPart2.getXCN01263();
	}

	/**
	* Returns the xcn01264 of this vr technical spec_xcn part2.
	*
	* @return the xcn01264 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01264() {
		return _vrTechnicalSpec_XCNPart2.getXCN01264();
	}

	/**
	* Returns the xcn01265 of this vr technical spec_xcn part2.
	*
	* @return the xcn01265 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01265() {
		return _vrTechnicalSpec_XCNPart2.getXCN01265();
	}

	/**
	* Returns the xcn01266 of this vr technical spec_xcn part2.
	*
	* @return the xcn01266 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01266() {
		return _vrTechnicalSpec_XCNPart2.getXCN01266();
	}

	/**
	* Returns the xcn01267 of this vr technical spec_xcn part2.
	*
	* @return the xcn01267 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01267() {
		return _vrTechnicalSpec_XCNPart2.getXCN01267();
	}

	/**
	* Returns the xcn01268 of this vr technical spec_xcn part2.
	*
	* @return the xcn01268 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01268() {
		return _vrTechnicalSpec_XCNPart2.getXCN01268();
	}

	/**
	* Returns the xcn01269 of this vr technical spec_xcn part2.
	*
	* @return the xcn01269 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01269() {
		return _vrTechnicalSpec_XCNPart2.getXCN01269();
	}

	/**
	* Returns the xcn01270 of this vr technical spec_xcn part2.
	*
	* @return the xcn01270 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01270() {
		return _vrTechnicalSpec_XCNPart2.getXCN01270();
	}

	/**
	* Returns the xcn01271 of this vr technical spec_xcn part2.
	*
	* @return the xcn01271 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01271() {
		return _vrTechnicalSpec_XCNPart2.getXCN01271();
	}

	/**
	* Returns the xcn01272 of this vr technical spec_xcn part2.
	*
	* @return the xcn01272 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01272() {
		return _vrTechnicalSpec_XCNPart2.getXCN01272();
	}

	/**
	* Returns the xcn01273 of this vr technical spec_xcn part2.
	*
	* @return the xcn01273 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01273() {
		return _vrTechnicalSpec_XCNPart2.getXCN01273();
	}

	/**
	* Returns the xcn01274 of this vr technical spec_xcn part2.
	*
	* @return the xcn01274 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01274() {
		return _vrTechnicalSpec_XCNPart2.getXCN01274();
	}

	/**
	* Returns the xcn01275 of this vr technical spec_xcn part2.
	*
	* @return the xcn01275 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01275() {
		return _vrTechnicalSpec_XCNPart2.getXCN01275();
	}

	/**
	* Returns the xcn01276 of this vr technical spec_xcn part2.
	*
	* @return the xcn01276 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01276() {
		return _vrTechnicalSpec_XCNPart2.getXCN01276();
	}

	/**
	* Returns the xcn01277 of this vr technical spec_xcn part2.
	*
	* @return the xcn01277 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01277() {
		return _vrTechnicalSpec_XCNPart2.getXCN01277();
	}

	/**
	* Returns the xcn01278 of this vr technical spec_xcn part2.
	*
	* @return the xcn01278 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01278() {
		return _vrTechnicalSpec_XCNPart2.getXCN01278();
	}

	/**
	* Returns the xcn01279 of this vr technical spec_xcn part2.
	*
	* @return the xcn01279 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01279() {
		return _vrTechnicalSpec_XCNPart2.getXCN01279();
	}

	/**
	* Returns the xcn01280 of this vr technical spec_xcn part2.
	*
	* @return the xcn01280 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01280() {
		return _vrTechnicalSpec_XCNPart2.getXCN01280();
	}

	/**
	* Returns the xcn01281 of this vr technical spec_xcn part2.
	*
	* @return the xcn01281 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01281() {
		return _vrTechnicalSpec_XCNPart2.getXCN01281();
	}

	/**
	* Returns the xcn01282 of this vr technical spec_xcn part2.
	*
	* @return the xcn01282 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01282() {
		return _vrTechnicalSpec_XCNPart2.getXCN01282();
	}

	/**
	* Returns the xcn01283 of this vr technical spec_xcn part2.
	*
	* @return the xcn01283 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01283() {
		return _vrTechnicalSpec_XCNPart2.getXCN01283();
	}

	/**
	* Returns the xcn01284 of this vr technical spec_xcn part2.
	*
	* @return the xcn01284 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01284() {
		return _vrTechnicalSpec_XCNPart2.getXCN01284();
	}

	/**
	* Returns the xcn01285 of this vr technical spec_xcn part2.
	*
	* @return the xcn01285 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01285() {
		return _vrTechnicalSpec_XCNPart2.getXCN01285();
	}

	/**
	* Returns the xcn01286 of this vr technical spec_xcn part2.
	*
	* @return the xcn01286 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01286() {
		return _vrTechnicalSpec_XCNPart2.getXCN01286();
	}

	/**
	* Returns the xcn01287 of this vr technical spec_xcn part2.
	*
	* @return the xcn01287 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01287() {
		return _vrTechnicalSpec_XCNPart2.getXCN01287();
	}

	/**
	* Returns the xcn01288 of this vr technical spec_xcn part2.
	*
	* @return the xcn01288 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01288() {
		return _vrTechnicalSpec_XCNPart2.getXCN01288();
	}

	/**
	* Returns the xcn01289 of this vr technical spec_xcn part2.
	*
	* @return the xcn01289 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01289() {
		return _vrTechnicalSpec_XCNPart2.getXCN01289();
	}

	/**
	* Returns the xcn01290 of this vr technical spec_xcn part2.
	*
	* @return the xcn01290 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01290() {
		return _vrTechnicalSpec_XCNPart2.getXCN01290();
	}

	/**
	* Returns the xcn01291 of this vr technical spec_xcn part2.
	*
	* @return the xcn01291 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01291() {
		return _vrTechnicalSpec_XCNPart2.getXCN01291();
	}

	/**
	* Returns the xcn01292 of this vr technical spec_xcn part2.
	*
	* @return the xcn01292 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01292() {
		return _vrTechnicalSpec_XCNPart2.getXCN01292();
	}

	/**
	* Returns the xcn01293 of this vr technical spec_xcn part2.
	*
	* @return the xcn01293 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01293() {
		return _vrTechnicalSpec_XCNPart2.getXCN01293();
	}

	/**
	* Returns the xcn01294 of this vr technical spec_xcn part2.
	*
	* @return the xcn01294 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01294() {
		return _vrTechnicalSpec_XCNPart2.getXCN01294();
	}

	/**
	* Returns the xcn01295 of this vr technical spec_xcn part2.
	*
	* @return the xcn01295 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01295() {
		return _vrTechnicalSpec_XCNPart2.getXCN01295();
	}

	/**
	* Returns the xcn01296 of this vr technical spec_xcn part2.
	*
	* @return the xcn01296 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01296() {
		return _vrTechnicalSpec_XCNPart2.getXCN01296();
	}

	/**
	* Returns the xcn01297 of this vr technical spec_xcn part2.
	*
	* @return the xcn01297 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01297() {
		return _vrTechnicalSpec_XCNPart2.getXCN01297();
	}

	/**
	* Returns the xcn01298 of this vr technical spec_xcn part2.
	*
	* @return the xcn01298 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01298() {
		return _vrTechnicalSpec_XCNPart2.getXCN01298();
	}

	/**
	* Returns the xcn01299 of this vr technical spec_xcn part2.
	*
	* @return the xcn01299 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01299() {
		return _vrTechnicalSpec_XCNPart2.getXCN01299();
	}

	/**
	* Returns the xcn01300 of this vr technical spec_xcn part2.
	*
	* @return the xcn01300 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01300() {
		return _vrTechnicalSpec_XCNPart2.getXCN01300();
	}

	/**
	* Returns the xcn01301 of this vr technical spec_xcn part2.
	*
	* @return the xcn01301 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01301() {
		return _vrTechnicalSpec_XCNPart2.getXCN01301();
	}

	/**
	* Returns the xcn01302 of this vr technical spec_xcn part2.
	*
	* @return the xcn01302 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01302() {
		return _vrTechnicalSpec_XCNPart2.getXCN01302();
	}

	/**
	* Returns the xcn01303 of this vr technical spec_xcn part2.
	*
	* @return the xcn01303 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01303() {
		return _vrTechnicalSpec_XCNPart2.getXCN01303();
	}

	/**
	* Returns the xcn01304 of this vr technical spec_xcn part2.
	*
	* @return the xcn01304 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01304() {
		return _vrTechnicalSpec_XCNPart2.getXCN01304();
	}

	/**
	* Returns the xcn01305 of this vr technical spec_xcn part2.
	*
	* @return the xcn01305 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01305() {
		return _vrTechnicalSpec_XCNPart2.getXCN01305();
	}

	/**
	* Returns the xcn01306 of this vr technical spec_xcn part2.
	*
	* @return the xcn01306 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01306() {
		return _vrTechnicalSpec_XCNPart2.getXCN01306();
	}

	/**
	* Returns the xcn01307 of this vr technical spec_xcn part2.
	*
	* @return the xcn01307 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01307() {
		return _vrTechnicalSpec_XCNPart2.getXCN01307();
	}

	/**
	* Returns the xcn01308 of this vr technical spec_xcn part2.
	*
	* @return the xcn01308 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01308() {
		return _vrTechnicalSpec_XCNPart2.getXCN01308();
	}

	/**
	* Returns the xcn01309 of this vr technical spec_xcn part2.
	*
	* @return the xcn01309 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01309() {
		return _vrTechnicalSpec_XCNPart2.getXCN01309();
	}

	/**
	* Returns the xcn01310 of this vr technical spec_xcn part2.
	*
	* @return the xcn01310 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01310() {
		return _vrTechnicalSpec_XCNPart2.getXCN01310();
	}

	/**
	* Returns the xcn01311 of this vr technical spec_xcn part2.
	*
	* @return the xcn01311 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01311() {
		return _vrTechnicalSpec_XCNPart2.getXCN01311();
	}

	/**
	* Returns the xcn01312 of this vr technical spec_xcn part2.
	*
	* @return the xcn01312 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01312() {
		return _vrTechnicalSpec_XCNPart2.getXCN01312();
	}

	/**
	* Returns the xcn01313 of this vr technical spec_xcn part2.
	*
	* @return the xcn01313 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01313() {
		return _vrTechnicalSpec_XCNPart2.getXCN01313();
	}

	/**
	* Returns the xcn01314 of this vr technical spec_xcn part2.
	*
	* @return the xcn01314 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01314() {
		return _vrTechnicalSpec_XCNPart2.getXCN01314();
	}

	/**
	* Returns the xcn01315 of this vr technical spec_xcn part2.
	*
	* @return the xcn01315 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01315() {
		return _vrTechnicalSpec_XCNPart2.getXCN01315();
	}

	/**
	* Returns the xcn01316 of this vr technical spec_xcn part2.
	*
	* @return the xcn01316 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01316() {
		return _vrTechnicalSpec_XCNPart2.getXCN01316();
	}

	/**
	* Returns the xcn01317 of this vr technical spec_xcn part2.
	*
	* @return the xcn01317 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01317() {
		return _vrTechnicalSpec_XCNPart2.getXCN01317();
	}

	/**
	* Returns the xcn01318 of this vr technical spec_xcn part2.
	*
	* @return the xcn01318 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01318() {
		return _vrTechnicalSpec_XCNPart2.getXCN01318();
	}

	/**
	* Returns the xcn01319 of this vr technical spec_xcn part2.
	*
	* @return the xcn01319 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01319() {
		return _vrTechnicalSpec_XCNPart2.getXCN01319();
	}

	/**
	* Returns the xcn01320 of this vr technical spec_xcn part2.
	*
	* @return the xcn01320 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01320() {
		return _vrTechnicalSpec_XCNPart2.getXCN01320();
	}

	/**
	* Returns the xcn01321 of this vr technical spec_xcn part2.
	*
	* @return the xcn01321 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01321() {
		return _vrTechnicalSpec_XCNPart2.getXCN01321();
	}

	/**
	* Returns the xcn01322 of this vr technical spec_xcn part2.
	*
	* @return the xcn01322 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01322() {
		return _vrTechnicalSpec_XCNPart2.getXCN01322();
	}

	/**
	* Returns the xcn01323 of this vr technical spec_xcn part2.
	*
	* @return the xcn01323 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01323() {
		return _vrTechnicalSpec_XCNPart2.getXCN01323();
	}

	/**
	* Returns the xcn01324 of this vr technical spec_xcn part2.
	*
	* @return the xcn01324 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01324() {
		return _vrTechnicalSpec_XCNPart2.getXCN01324();
	}

	/**
	* Returns the xcn01325 of this vr technical spec_xcn part2.
	*
	* @return the xcn01325 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01325() {
		return _vrTechnicalSpec_XCNPart2.getXCN01325();
	}

	/**
	* Returns the xcn01326 of this vr technical spec_xcn part2.
	*
	* @return the xcn01326 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01326() {
		return _vrTechnicalSpec_XCNPart2.getXCN01326();
	}

	/**
	* Returns the xcn01327 of this vr technical spec_xcn part2.
	*
	* @return the xcn01327 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01327() {
		return _vrTechnicalSpec_XCNPart2.getXCN01327();
	}

	/**
	* Returns the xcn01328 of this vr technical spec_xcn part2.
	*
	* @return the xcn01328 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01328() {
		return _vrTechnicalSpec_XCNPart2.getXCN01328();
	}

	/**
	* Returns the xcn01329 of this vr technical spec_xcn part2.
	*
	* @return the xcn01329 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01329() {
		return _vrTechnicalSpec_XCNPart2.getXCN01329();
	}

	/**
	* Returns the xcn01330 of this vr technical spec_xcn part2.
	*
	* @return the xcn01330 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01330() {
		return _vrTechnicalSpec_XCNPart2.getXCN01330();
	}

	/**
	* Returns the xcn01331 of this vr technical spec_xcn part2.
	*
	* @return the xcn01331 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01331() {
		return _vrTechnicalSpec_XCNPart2.getXCN01331();
	}

	/**
	* Returns the xcn01332 of this vr technical spec_xcn part2.
	*
	* @return the xcn01332 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01332() {
		return _vrTechnicalSpec_XCNPart2.getXCN01332();
	}

	/**
	* Returns the xcn01333 of this vr technical spec_xcn part2.
	*
	* @return the xcn01333 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01333() {
		return _vrTechnicalSpec_XCNPart2.getXCN01333();
	}

	/**
	* Returns the xcn01334 of this vr technical spec_xcn part2.
	*
	* @return the xcn01334 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01334() {
		return _vrTechnicalSpec_XCNPart2.getXCN01334();
	}

	/**
	* Returns the xcn01335 of this vr technical spec_xcn part2.
	*
	* @return the xcn01335 of this vr technical spec_xcn part2
	*/
	@Override
	public java.lang.String getXCN01335() {
		return _vrTechnicalSpec_XCNPart2.getXCN01335();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XCNPart2.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XCNPart2.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xcn part2.
	*
	* @return the modify date of this vr technical spec_xcn part2
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XCNPart2.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xcn part2.
	*
	* @return the sync date of this vr technical spec_xcn part2
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XCNPart2.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xcn part2.
	*
	* @return the convert assemble ID of this vr technical spec_xcn part2
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XCNPart2.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xcn part2.
	*
	* @return the dossier ID of this vr technical spec_xcn part2
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XCNPart2.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xcn part2.
	*
	* @return the ID of this vr technical spec_xcn part2
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XCNPart2.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xcn part2.
	*
	* @return the mt core of this vr technical spec_xcn part2
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XCNPart2.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xcn part2.
	*
	* @return the primary key of this vr technical spec_xcn part2
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XCNPart2.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xcn part2.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xcn part2
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XCNPart2.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XCNPart2.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XCNPart2.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xcn part2.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xcn part2
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XCNPart2.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xcn part2.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xcn part2
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XCNPart2.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xcn part2.
	*
	* @param dossierId the dossier ID of this vr technical spec_xcn part2
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XCNPart2.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xcn part2.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xcn part2
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XCNPart2.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xcn part2.
	*
	* @param dossierNo the dossier no of this vr technical spec_xcn part2
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XCNPart2.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XCNPart2.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XCNPart2.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XCNPart2.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xcn part2.
	*
	* @param id the ID of this vr technical spec_xcn part2
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XCNPart2.setId(id);
	}

	/**
	* Sets the modify date of this vr technical spec_xcn part2.
	*
	* @param modifyDate the modify date of this vr technical spec_xcn part2
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XCNPart2.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xcn part2.
	*
	* @param mtCore the mt core of this vr technical spec_xcn part2
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XCNPart2.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XCNPart2.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xcn part2.
	*
	* @param primaryKey the primary key of this vr technical spec_xcn part2
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XCNPart2.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XCNPart2.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xcn part2.
	*
	* @param referenceUid the reference uid of this vr technical spec_xcn part2
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XCNPart2.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xcn part2.
	*
	* @param syncDate the sync date of this vr technical spec_xcn part2
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XCNPart2.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xcn part2.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xcn part2
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XCNPart2.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xcn01186 of this vr technical spec_xcn part2.
	*
	* @param XCN01186 the xcn01186 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01186(java.lang.String XCN01186) {
		_vrTechnicalSpec_XCNPart2.setXCN01186(XCN01186);
	}

	/**
	* Sets the xcn01187 of this vr technical spec_xcn part2.
	*
	* @param XCN01187 the xcn01187 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01187(java.lang.String XCN01187) {
		_vrTechnicalSpec_XCNPart2.setXCN01187(XCN01187);
	}

	/**
	* Sets the xcn01188 of this vr technical spec_xcn part2.
	*
	* @param XCN01188 the xcn01188 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01188(java.lang.String XCN01188) {
		_vrTechnicalSpec_XCNPart2.setXCN01188(XCN01188);
	}

	/**
	* Sets the xcn01189 of this vr technical spec_xcn part2.
	*
	* @param XCN01189 the xcn01189 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01189(java.lang.String XCN01189) {
		_vrTechnicalSpec_XCNPart2.setXCN01189(XCN01189);
	}

	/**
	* Sets the xcn01190 of this vr technical spec_xcn part2.
	*
	* @param XCN01190 the xcn01190 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01190(java.lang.String XCN01190) {
		_vrTechnicalSpec_XCNPart2.setXCN01190(XCN01190);
	}

	/**
	* Sets the xcn01191 of this vr technical spec_xcn part2.
	*
	* @param XCN01191 the xcn01191 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01191(java.lang.String XCN01191) {
		_vrTechnicalSpec_XCNPart2.setXCN01191(XCN01191);
	}

	/**
	* Sets the xcn01192 of this vr technical spec_xcn part2.
	*
	* @param XCN01192 the xcn01192 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01192(java.lang.String XCN01192) {
		_vrTechnicalSpec_XCNPart2.setXCN01192(XCN01192);
	}

	/**
	* Sets the xcn01193 of this vr technical spec_xcn part2.
	*
	* @param XCN01193 the xcn01193 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01193(java.lang.String XCN01193) {
		_vrTechnicalSpec_XCNPart2.setXCN01193(XCN01193);
	}

	/**
	* Sets the xcn01194 of this vr technical spec_xcn part2.
	*
	* @param XCN01194 the xcn01194 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01194(java.lang.String XCN01194) {
		_vrTechnicalSpec_XCNPart2.setXCN01194(XCN01194);
	}

	/**
	* Sets the xcn01195 of this vr technical spec_xcn part2.
	*
	* @param XCN01195 the xcn01195 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01195(java.lang.String XCN01195) {
		_vrTechnicalSpec_XCNPart2.setXCN01195(XCN01195);
	}

	/**
	* Sets the xcn01196 of this vr technical spec_xcn part2.
	*
	* @param XCN01196 the xcn01196 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01196(java.lang.String XCN01196) {
		_vrTechnicalSpec_XCNPart2.setXCN01196(XCN01196);
	}

	/**
	* Sets the xcn01197 of this vr technical spec_xcn part2.
	*
	* @param XCN01197 the xcn01197 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01197(java.lang.String XCN01197) {
		_vrTechnicalSpec_XCNPart2.setXCN01197(XCN01197);
	}

	/**
	* Sets the xcn01198 of this vr technical spec_xcn part2.
	*
	* @param XCN01198 the xcn01198 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01198(java.lang.String XCN01198) {
		_vrTechnicalSpec_XCNPart2.setXCN01198(XCN01198);
	}

	/**
	* Sets the xcn01199 of this vr technical spec_xcn part2.
	*
	* @param XCN01199 the xcn01199 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01199(java.lang.String XCN01199) {
		_vrTechnicalSpec_XCNPart2.setXCN01199(XCN01199);
	}

	/**
	* Sets the xcn01200 of this vr technical spec_xcn part2.
	*
	* @param XCN01200 the xcn01200 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01200(java.lang.String XCN01200) {
		_vrTechnicalSpec_XCNPart2.setXCN01200(XCN01200);
	}

	/**
	* Sets the xcn01201 of this vr technical spec_xcn part2.
	*
	* @param XCN01201 the xcn01201 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01201(java.lang.String XCN01201) {
		_vrTechnicalSpec_XCNPart2.setXCN01201(XCN01201);
	}

	/**
	* Sets the xcn01202 of this vr technical spec_xcn part2.
	*
	* @param XCN01202 the xcn01202 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01202(java.lang.String XCN01202) {
		_vrTechnicalSpec_XCNPart2.setXCN01202(XCN01202);
	}

	/**
	* Sets the xcn01203 of this vr technical spec_xcn part2.
	*
	* @param XCN01203 the xcn01203 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01203(java.lang.String XCN01203) {
		_vrTechnicalSpec_XCNPart2.setXCN01203(XCN01203);
	}

	/**
	* Sets the xcn01204 of this vr technical spec_xcn part2.
	*
	* @param XCN01204 the xcn01204 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01204(java.lang.String XCN01204) {
		_vrTechnicalSpec_XCNPart2.setXCN01204(XCN01204);
	}

	/**
	* Sets the xcn01205 of this vr technical spec_xcn part2.
	*
	* @param XCN01205 the xcn01205 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01205(java.lang.String XCN01205) {
		_vrTechnicalSpec_XCNPart2.setXCN01205(XCN01205);
	}

	/**
	* Sets the xcn01206 of this vr technical spec_xcn part2.
	*
	* @param XCN01206 the xcn01206 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01206(java.lang.String XCN01206) {
		_vrTechnicalSpec_XCNPart2.setXCN01206(XCN01206);
	}

	/**
	* Sets the xcn01207 of this vr technical spec_xcn part2.
	*
	* @param XCN01207 the xcn01207 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01207(java.lang.String XCN01207) {
		_vrTechnicalSpec_XCNPart2.setXCN01207(XCN01207);
	}

	/**
	* Sets the xcn01208 of this vr technical spec_xcn part2.
	*
	* @param XCN01208 the xcn01208 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01208(java.lang.String XCN01208) {
		_vrTechnicalSpec_XCNPart2.setXCN01208(XCN01208);
	}

	/**
	* Sets the xcn01209 of this vr technical spec_xcn part2.
	*
	* @param XCN01209 the xcn01209 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01209(java.lang.String XCN01209) {
		_vrTechnicalSpec_XCNPart2.setXCN01209(XCN01209);
	}

	/**
	* Sets the xcn01210 of this vr technical spec_xcn part2.
	*
	* @param XCN01210 the xcn01210 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01210(java.lang.String XCN01210) {
		_vrTechnicalSpec_XCNPart2.setXCN01210(XCN01210);
	}

	/**
	* Sets the xcn01211 of this vr technical spec_xcn part2.
	*
	* @param XCN01211 the xcn01211 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01211(java.lang.String XCN01211) {
		_vrTechnicalSpec_XCNPart2.setXCN01211(XCN01211);
	}

	/**
	* Sets the xcn01212 of this vr technical spec_xcn part2.
	*
	* @param XCN01212 the xcn01212 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01212(java.lang.String XCN01212) {
		_vrTechnicalSpec_XCNPart2.setXCN01212(XCN01212);
	}

	/**
	* Sets the xcn01213 of this vr technical spec_xcn part2.
	*
	* @param XCN01213 the xcn01213 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01213(java.lang.String XCN01213) {
		_vrTechnicalSpec_XCNPart2.setXCN01213(XCN01213);
	}

	/**
	* Sets the xcn01214 of this vr technical spec_xcn part2.
	*
	* @param XCN01214 the xcn01214 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01214(java.lang.String XCN01214) {
		_vrTechnicalSpec_XCNPart2.setXCN01214(XCN01214);
	}

	/**
	* Sets the xcn01215 of this vr technical spec_xcn part2.
	*
	* @param XCN01215 the xcn01215 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01215(java.lang.String XCN01215) {
		_vrTechnicalSpec_XCNPart2.setXCN01215(XCN01215);
	}

	/**
	* Sets the xcn01216 of this vr technical spec_xcn part2.
	*
	* @param XCN01216 the xcn01216 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01216(java.lang.String XCN01216) {
		_vrTechnicalSpec_XCNPart2.setXCN01216(XCN01216);
	}

	/**
	* Sets the xcn01217 of this vr technical spec_xcn part2.
	*
	* @param XCN01217 the xcn01217 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01217(java.lang.String XCN01217) {
		_vrTechnicalSpec_XCNPart2.setXCN01217(XCN01217);
	}

	/**
	* Sets the xcn01218 of this vr technical spec_xcn part2.
	*
	* @param XCN01218 the xcn01218 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01218(java.lang.String XCN01218) {
		_vrTechnicalSpec_XCNPart2.setXCN01218(XCN01218);
	}

	/**
	* Sets the xcn01219 of this vr technical spec_xcn part2.
	*
	* @param XCN01219 the xcn01219 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01219(java.lang.String XCN01219) {
		_vrTechnicalSpec_XCNPart2.setXCN01219(XCN01219);
	}

	/**
	* Sets the xcn01220 of this vr technical spec_xcn part2.
	*
	* @param XCN01220 the xcn01220 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01220(java.lang.String XCN01220) {
		_vrTechnicalSpec_XCNPart2.setXCN01220(XCN01220);
	}

	/**
	* Sets the xcn01221 of this vr technical spec_xcn part2.
	*
	* @param XCN01221 the xcn01221 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01221(java.lang.String XCN01221) {
		_vrTechnicalSpec_XCNPart2.setXCN01221(XCN01221);
	}

	/**
	* Sets the xcn01222 of this vr technical spec_xcn part2.
	*
	* @param XCN01222 the xcn01222 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01222(java.lang.String XCN01222) {
		_vrTechnicalSpec_XCNPart2.setXCN01222(XCN01222);
	}

	/**
	* Sets the xcn01223 of this vr technical spec_xcn part2.
	*
	* @param XCN01223 the xcn01223 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01223(java.lang.String XCN01223) {
		_vrTechnicalSpec_XCNPart2.setXCN01223(XCN01223);
	}

	/**
	* Sets the xcn01224 of this vr technical spec_xcn part2.
	*
	* @param XCN01224 the xcn01224 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01224(java.lang.String XCN01224) {
		_vrTechnicalSpec_XCNPart2.setXCN01224(XCN01224);
	}

	/**
	* Sets the xcn01225 of this vr technical spec_xcn part2.
	*
	* @param XCN01225 the xcn01225 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01225(java.lang.String XCN01225) {
		_vrTechnicalSpec_XCNPart2.setXCN01225(XCN01225);
	}

	/**
	* Sets the xcn01226 of this vr technical spec_xcn part2.
	*
	* @param XCN01226 the xcn01226 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01226(java.lang.String XCN01226) {
		_vrTechnicalSpec_XCNPart2.setXCN01226(XCN01226);
	}

	/**
	* Sets the xcn01227 of this vr technical spec_xcn part2.
	*
	* @param XCN01227 the xcn01227 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01227(java.lang.String XCN01227) {
		_vrTechnicalSpec_XCNPart2.setXCN01227(XCN01227);
	}

	/**
	* Sets the xcn01228 of this vr technical spec_xcn part2.
	*
	* @param XCN01228 the xcn01228 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01228(java.lang.String XCN01228) {
		_vrTechnicalSpec_XCNPart2.setXCN01228(XCN01228);
	}

	/**
	* Sets the xcn01229 of this vr technical spec_xcn part2.
	*
	* @param XCN01229 the xcn01229 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01229(java.lang.String XCN01229) {
		_vrTechnicalSpec_XCNPart2.setXCN01229(XCN01229);
	}

	/**
	* Sets the xcn01230 of this vr technical spec_xcn part2.
	*
	* @param XCN01230 the xcn01230 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01230(java.lang.String XCN01230) {
		_vrTechnicalSpec_XCNPart2.setXCN01230(XCN01230);
	}

	/**
	* Sets the xcn01231 of this vr technical spec_xcn part2.
	*
	* @param XCN01231 the xcn01231 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01231(java.lang.String XCN01231) {
		_vrTechnicalSpec_XCNPart2.setXCN01231(XCN01231);
	}

	/**
	* Sets the xcn01232 of this vr technical spec_xcn part2.
	*
	* @param XCN01232 the xcn01232 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01232(java.lang.String XCN01232) {
		_vrTechnicalSpec_XCNPart2.setXCN01232(XCN01232);
	}

	/**
	* Sets the xcn01233 of this vr technical spec_xcn part2.
	*
	* @param XCN01233 the xcn01233 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01233(java.lang.String XCN01233) {
		_vrTechnicalSpec_XCNPart2.setXCN01233(XCN01233);
	}

	/**
	* Sets the xcn01234 of this vr technical spec_xcn part2.
	*
	* @param XCN01234 the xcn01234 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01234(java.lang.String XCN01234) {
		_vrTechnicalSpec_XCNPart2.setXCN01234(XCN01234);
	}

	/**
	* Sets the xcn01235 of this vr technical spec_xcn part2.
	*
	* @param XCN01235 the xcn01235 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01235(java.lang.String XCN01235) {
		_vrTechnicalSpec_XCNPart2.setXCN01235(XCN01235);
	}

	/**
	* Sets the xcn01236 of this vr technical spec_xcn part2.
	*
	* @param XCN01236 the xcn01236 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01236(java.lang.String XCN01236) {
		_vrTechnicalSpec_XCNPart2.setXCN01236(XCN01236);
	}

	/**
	* Sets the xcn01237 of this vr technical spec_xcn part2.
	*
	* @param XCN01237 the xcn01237 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01237(java.lang.String XCN01237) {
		_vrTechnicalSpec_XCNPart2.setXCN01237(XCN01237);
	}

	/**
	* Sets the xcn01238 of this vr technical spec_xcn part2.
	*
	* @param XCN01238 the xcn01238 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01238(java.lang.String XCN01238) {
		_vrTechnicalSpec_XCNPart2.setXCN01238(XCN01238);
	}

	/**
	* Sets the xcn01239 of this vr technical spec_xcn part2.
	*
	* @param XCN01239 the xcn01239 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01239(java.lang.String XCN01239) {
		_vrTechnicalSpec_XCNPart2.setXCN01239(XCN01239);
	}

	/**
	* Sets the xcn01240 of this vr technical spec_xcn part2.
	*
	* @param XCN01240 the xcn01240 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01240(java.lang.String XCN01240) {
		_vrTechnicalSpec_XCNPart2.setXCN01240(XCN01240);
	}

	/**
	* Sets the xcn01241 of this vr technical spec_xcn part2.
	*
	* @param XCN01241 the xcn01241 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01241(java.lang.String XCN01241) {
		_vrTechnicalSpec_XCNPart2.setXCN01241(XCN01241);
	}

	/**
	* Sets the xcn01242 of this vr technical spec_xcn part2.
	*
	* @param XCN01242 the xcn01242 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01242(java.lang.String XCN01242) {
		_vrTechnicalSpec_XCNPart2.setXCN01242(XCN01242);
	}

	/**
	* Sets the xcn01243 of this vr technical spec_xcn part2.
	*
	* @param XCN01243 the xcn01243 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01243(java.lang.String XCN01243) {
		_vrTechnicalSpec_XCNPart2.setXCN01243(XCN01243);
	}

	/**
	* Sets the xcn01244 of this vr technical spec_xcn part2.
	*
	* @param XCN01244 the xcn01244 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01244(java.lang.String XCN01244) {
		_vrTechnicalSpec_XCNPart2.setXCN01244(XCN01244);
	}

	/**
	* Sets the xcn01245 of this vr technical spec_xcn part2.
	*
	* @param XCN01245 the xcn01245 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01245(java.lang.String XCN01245) {
		_vrTechnicalSpec_XCNPart2.setXCN01245(XCN01245);
	}

	/**
	* Sets the xcn01246 of this vr technical spec_xcn part2.
	*
	* @param XCN01246 the xcn01246 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01246(java.lang.String XCN01246) {
		_vrTechnicalSpec_XCNPart2.setXCN01246(XCN01246);
	}

	/**
	* Sets the xcn01247 of this vr technical spec_xcn part2.
	*
	* @param XCN01247 the xcn01247 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01247(java.lang.String XCN01247) {
		_vrTechnicalSpec_XCNPart2.setXCN01247(XCN01247);
	}

	/**
	* Sets the xcn01248 of this vr technical spec_xcn part2.
	*
	* @param XCN01248 the xcn01248 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01248(java.lang.String XCN01248) {
		_vrTechnicalSpec_XCNPart2.setXCN01248(XCN01248);
	}

	/**
	* Sets the xcn01249 of this vr technical spec_xcn part2.
	*
	* @param XCN01249 the xcn01249 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01249(java.lang.String XCN01249) {
		_vrTechnicalSpec_XCNPart2.setXCN01249(XCN01249);
	}

	/**
	* Sets the xcn01250 of this vr technical spec_xcn part2.
	*
	* @param XCN01250 the xcn01250 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01250(java.lang.String XCN01250) {
		_vrTechnicalSpec_XCNPart2.setXCN01250(XCN01250);
	}

	/**
	* Sets the xcn01251 of this vr technical spec_xcn part2.
	*
	* @param XCN01251 the xcn01251 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01251(java.lang.String XCN01251) {
		_vrTechnicalSpec_XCNPart2.setXCN01251(XCN01251);
	}

	/**
	* Sets the xcn01252 of this vr technical spec_xcn part2.
	*
	* @param XCN01252 the xcn01252 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01252(java.lang.String XCN01252) {
		_vrTechnicalSpec_XCNPart2.setXCN01252(XCN01252);
	}

	/**
	* Sets the xcn01253 of this vr technical spec_xcn part2.
	*
	* @param XCN01253 the xcn01253 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01253(java.lang.String XCN01253) {
		_vrTechnicalSpec_XCNPart2.setXCN01253(XCN01253);
	}

	/**
	* Sets the xcn01254 of this vr technical spec_xcn part2.
	*
	* @param XCN01254 the xcn01254 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01254(java.lang.String XCN01254) {
		_vrTechnicalSpec_XCNPart2.setXCN01254(XCN01254);
	}

	/**
	* Sets the xcn01255 of this vr technical spec_xcn part2.
	*
	* @param XCN01255 the xcn01255 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01255(java.lang.String XCN01255) {
		_vrTechnicalSpec_XCNPart2.setXCN01255(XCN01255);
	}

	/**
	* Sets the xcn01256 of this vr technical spec_xcn part2.
	*
	* @param XCN01256 the xcn01256 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01256(java.lang.String XCN01256) {
		_vrTechnicalSpec_XCNPart2.setXCN01256(XCN01256);
	}

	/**
	* Sets the xcn01257 of this vr technical spec_xcn part2.
	*
	* @param XCN01257 the xcn01257 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01257(java.lang.String XCN01257) {
		_vrTechnicalSpec_XCNPart2.setXCN01257(XCN01257);
	}

	/**
	* Sets the xcn01258 of this vr technical spec_xcn part2.
	*
	* @param XCN01258 the xcn01258 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01258(java.lang.String XCN01258) {
		_vrTechnicalSpec_XCNPart2.setXCN01258(XCN01258);
	}

	/**
	* Sets the xcn01259 of this vr technical spec_xcn part2.
	*
	* @param XCN01259 the xcn01259 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01259(java.lang.String XCN01259) {
		_vrTechnicalSpec_XCNPart2.setXCN01259(XCN01259);
	}

	/**
	* Sets the xcn01260 of this vr technical spec_xcn part2.
	*
	* @param XCN01260 the xcn01260 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01260(java.lang.String XCN01260) {
		_vrTechnicalSpec_XCNPart2.setXCN01260(XCN01260);
	}

	/**
	* Sets the xcn01261 of this vr technical spec_xcn part2.
	*
	* @param XCN01261 the xcn01261 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01261(java.lang.String XCN01261) {
		_vrTechnicalSpec_XCNPart2.setXCN01261(XCN01261);
	}

	/**
	* Sets the xcn01262 of this vr technical spec_xcn part2.
	*
	* @param XCN01262 the xcn01262 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01262(java.lang.String XCN01262) {
		_vrTechnicalSpec_XCNPart2.setXCN01262(XCN01262);
	}

	/**
	* Sets the xcn01263 of this vr technical spec_xcn part2.
	*
	* @param XCN01263 the xcn01263 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01263(java.lang.String XCN01263) {
		_vrTechnicalSpec_XCNPart2.setXCN01263(XCN01263);
	}

	/**
	* Sets the xcn01264 of this vr technical spec_xcn part2.
	*
	* @param XCN01264 the xcn01264 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01264(java.lang.String XCN01264) {
		_vrTechnicalSpec_XCNPart2.setXCN01264(XCN01264);
	}

	/**
	* Sets the xcn01265 of this vr technical spec_xcn part2.
	*
	* @param XCN01265 the xcn01265 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01265(java.lang.String XCN01265) {
		_vrTechnicalSpec_XCNPart2.setXCN01265(XCN01265);
	}

	/**
	* Sets the xcn01266 of this vr technical spec_xcn part2.
	*
	* @param XCN01266 the xcn01266 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01266(java.lang.String XCN01266) {
		_vrTechnicalSpec_XCNPart2.setXCN01266(XCN01266);
	}

	/**
	* Sets the xcn01267 of this vr technical spec_xcn part2.
	*
	* @param XCN01267 the xcn01267 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01267(java.lang.String XCN01267) {
		_vrTechnicalSpec_XCNPart2.setXCN01267(XCN01267);
	}

	/**
	* Sets the xcn01268 of this vr technical spec_xcn part2.
	*
	* @param XCN01268 the xcn01268 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01268(java.lang.String XCN01268) {
		_vrTechnicalSpec_XCNPart2.setXCN01268(XCN01268);
	}

	/**
	* Sets the xcn01269 of this vr technical spec_xcn part2.
	*
	* @param XCN01269 the xcn01269 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01269(java.lang.String XCN01269) {
		_vrTechnicalSpec_XCNPart2.setXCN01269(XCN01269);
	}

	/**
	* Sets the xcn01270 of this vr technical spec_xcn part2.
	*
	* @param XCN01270 the xcn01270 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01270(java.lang.String XCN01270) {
		_vrTechnicalSpec_XCNPart2.setXCN01270(XCN01270);
	}

	/**
	* Sets the xcn01271 of this vr technical spec_xcn part2.
	*
	* @param XCN01271 the xcn01271 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01271(java.lang.String XCN01271) {
		_vrTechnicalSpec_XCNPart2.setXCN01271(XCN01271);
	}

	/**
	* Sets the xcn01272 of this vr technical spec_xcn part2.
	*
	* @param XCN01272 the xcn01272 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01272(java.lang.String XCN01272) {
		_vrTechnicalSpec_XCNPart2.setXCN01272(XCN01272);
	}

	/**
	* Sets the xcn01273 of this vr technical spec_xcn part2.
	*
	* @param XCN01273 the xcn01273 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01273(java.lang.String XCN01273) {
		_vrTechnicalSpec_XCNPart2.setXCN01273(XCN01273);
	}

	/**
	* Sets the xcn01274 of this vr technical spec_xcn part2.
	*
	* @param XCN01274 the xcn01274 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01274(java.lang.String XCN01274) {
		_vrTechnicalSpec_XCNPart2.setXCN01274(XCN01274);
	}

	/**
	* Sets the xcn01275 of this vr technical spec_xcn part2.
	*
	* @param XCN01275 the xcn01275 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01275(java.lang.String XCN01275) {
		_vrTechnicalSpec_XCNPart2.setXCN01275(XCN01275);
	}

	/**
	* Sets the xcn01276 of this vr technical spec_xcn part2.
	*
	* @param XCN01276 the xcn01276 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01276(java.lang.String XCN01276) {
		_vrTechnicalSpec_XCNPart2.setXCN01276(XCN01276);
	}

	/**
	* Sets the xcn01277 of this vr technical spec_xcn part2.
	*
	* @param XCN01277 the xcn01277 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01277(java.lang.String XCN01277) {
		_vrTechnicalSpec_XCNPart2.setXCN01277(XCN01277);
	}

	/**
	* Sets the xcn01278 of this vr technical spec_xcn part2.
	*
	* @param XCN01278 the xcn01278 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01278(java.lang.String XCN01278) {
		_vrTechnicalSpec_XCNPart2.setXCN01278(XCN01278);
	}

	/**
	* Sets the xcn01279 of this vr technical spec_xcn part2.
	*
	* @param XCN01279 the xcn01279 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01279(java.lang.String XCN01279) {
		_vrTechnicalSpec_XCNPart2.setXCN01279(XCN01279);
	}

	/**
	* Sets the xcn01280 of this vr technical spec_xcn part2.
	*
	* @param XCN01280 the xcn01280 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01280(java.lang.String XCN01280) {
		_vrTechnicalSpec_XCNPart2.setXCN01280(XCN01280);
	}

	/**
	* Sets the xcn01281 of this vr technical spec_xcn part2.
	*
	* @param XCN01281 the xcn01281 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01281(java.lang.String XCN01281) {
		_vrTechnicalSpec_XCNPart2.setXCN01281(XCN01281);
	}

	/**
	* Sets the xcn01282 of this vr technical spec_xcn part2.
	*
	* @param XCN01282 the xcn01282 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01282(java.lang.String XCN01282) {
		_vrTechnicalSpec_XCNPart2.setXCN01282(XCN01282);
	}

	/**
	* Sets the xcn01283 of this vr technical spec_xcn part2.
	*
	* @param XCN01283 the xcn01283 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01283(java.lang.String XCN01283) {
		_vrTechnicalSpec_XCNPart2.setXCN01283(XCN01283);
	}

	/**
	* Sets the xcn01284 of this vr technical spec_xcn part2.
	*
	* @param XCN01284 the xcn01284 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01284(java.lang.String XCN01284) {
		_vrTechnicalSpec_XCNPart2.setXCN01284(XCN01284);
	}

	/**
	* Sets the xcn01285 of this vr technical spec_xcn part2.
	*
	* @param XCN01285 the xcn01285 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01285(java.lang.String XCN01285) {
		_vrTechnicalSpec_XCNPart2.setXCN01285(XCN01285);
	}

	/**
	* Sets the xcn01286 of this vr technical spec_xcn part2.
	*
	* @param XCN01286 the xcn01286 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01286(java.lang.String XCN01286) {
		_vrTechnicalSpec_XCNPart2.setXCN01286(XCN01286);
	}

	/**
	* Sets the xcn01287 of this vr technical spec_xcn part2.
	*
	* @param XCN01287 the xcn01287 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01287(java.lang.String XCN01287) {
		_vrTechnicalSpec_XCNPart2.setXCN01287(XCN01287);
	}

	/**
	* Sets the xcn01288 of this vr technical spec_xcn part2.
	*
	* @param XCN01288 the xcn01288 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01288(java.lang.String XCN01288) {
		_vrTechnicalSpec_XCNPart2.setXCN01288(XCN01288);
	}

	/**
	* Sets the xcn01289 of this vr technical spec_xcn part2.
	*
	* @param XCN01289 the xcn01289 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01289(java.lang.String XCN01289) {
		_vrTechnicalSpec_XCNPart2.setXCN01289(XCN01289);
	}

	/**
	* Sets the xcn01290 of this vr technical spec_xcn part2.
	*
	* @param XCN01290 the xcn01290 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01290(java.lang.String XCN01290) {
		_vrTechnicalSpec_XCNPart2.setXCN01290(XCN01290);
	}

	/**
	* Sets the xcn01291 of this vr technical spec_xcn part2.
	*
	* @param XCN01291 the xcn01291 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01291(java.lang.String XCN01291) {
		_vrTechnicalSpec_XCNPart2.setXCN01291(XCN01291);
	}

	/**
	* Sets the xcn01292 of this vr technical spec_xcn part2.
	*
	* @param XCN01292 the xcn01292 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01292(java.lang.String XCN01292) {
		_vrTechnicalSpec_XCNPart2.setXCN01292(XCN01292);
	}

	/**
	* Sets the xcn01293 of this vr technical spec_xcn part2.
	*
	* @param XCN01293 the xcn01293 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01293(java.lang.String XCN01293) {
		_vrTechnicalSpec_XCNPart2.setXCN01293(XCN01293);
	}

	/**
	* Sets the xcn01294 of this vr technical spec_xcn part2.
	*
	* @param XCN01294 the xcn01294 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01294(java.lang.String XCN01294) {
		_vrTechnicalSpec_XCNPart2.setXCN01294(XCN01294);
	}

	/**
	* Sets the xcn01295 of this vr technical spec_xcn part2.
	*
	* @param XCN01295 the xcn01295 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01295(java.lang.String XCN01295) {
		_vrTechnicalSpec_XCNPart2.setXCN01295(XCN01295);
	}

	/**
	* Sets the xcn01296 of this vr technical spec_xcn part2.
	*
	* @param XCN01296 the xcn01296 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01296(java.lang.String XCN01296) {
		_vrTechnicalSpec_XCNPart2.setXCN01296(XCN01296);
	}

	/**
	* Sets the xcn01297 of this vr technical spec_xcn part2.
	*
	* @param XCN01297 the xcn01297 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01297(java.lang.String XCN01297) {
		_vrTechnicalSpec_XCNPart2.setXCN01297(XCN01297);
	}

	/**
	* Sets the xcn01298 of this vr technical spec_xcn part2.
	*
	* @param XCN01298 the xcn01298 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01298(java.lang.String XCN01298) {
		_vrTechnicalSpec_XCNPart2.setXCN01298(XCN01298);
	}

	/**
	* Sets the xcn01299 of this vr technical spec_xcn part2.
	*
	* @param XCN01299 the xcn01299 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01299(java.lang.String XCN01299) {
		_vrTechnicalSpec_XCNPart2.setXCN01299(XCN01299);
	}

	/**
	* Sets the xcn01300 of this vr technical spec_xcn part2.
	*
	* @param XCN01300 the xcn01300 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01300(java.lang.String XCN01300) {
		_vrTechnicalSpec_XCNPart2.setXCN01300(XCN01300);
	}

	/**
	* Sets the xcn01301 of this vr technical spec_xcn part2.
	*
	* @param XCN01301 the xcn01301 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01301(java.lang.String XCN01301) {
		_vrTechnicalSpec_XCNPart2.setXCN01301(XCN01301);
	}

	/**
	* Sets the xcn01302 of this vr technical spec_xcn part2.
	*
	* @param XCN01302 the xcn01302 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01302(java.lang.String XCN01302) {
		_vrTechnicalSpec_XCNPart2.setXCN01302(XCN01302);
	}

	/**
	* Sets the xcn01303 of this vr technical spec_xcn part2.
	*
	* @param XCN01303 the xcn01303 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01303(java.lang.String XCN01303) {
		_vrTechnicalSpec_XCNPart2.setXCN01303(XCN01303);
	}

	/**
	* Sets the xcn01304 of this vr technical spec_xcn part2.
	*
	* @param XCN01304 the xcn01304 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01304(java.lang.String XCN01304) {
		_vrTechnicalSpec_XCNPart2.setXCN01304(XCN01304);
	}

	/**
	* Sets the xcn01305 of this vr technical spec_xcn part2.
	*
	* @param XCN01305 the xcn01305 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01305(java.lang.String XCN01305) {
		_vrTechnicalSpec_XCNPart2.setXCN01305(XCN01305);
	}

	/**
	* Sets the xcn01306 of this vr technical spec_xcn part2.
	*
	* @param XCN01306 the xcn01306 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01306(java.lang.String XCN01306) {
		_vrTechnicalSpec_XCNPart2.setXCN01306(XCN01306);
	}

	/**
	* Sets the xcn01307 of this vr technical spec_xcn part2.
	*
	* @param XCN01307 the xcn01307 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01307(java.lang.String XCN01307) {
		_vrTechnicalSpec_XCNPart2.setXCN01307(XCN01307);
	}

	/**
	* Sets the xcn01308 of this vr technical spec_xcn part2.
	*
	* @param XCN01308 the xcn01308 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01308(java.lang.String XCN01308) {
		_vrTechnicalSpec_XCNPart2.setXCN01308(XCN01308);
	}

	/**
	* Sets the xcn01309 of this vr technical spec_xcn part2.
	*
	* @param XCN01309 the xcn01309 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01309(java.lang.String XCN01309) {
		_vrTechnicalSpec_XCNPart2.setXCN01309(XCN01309);
	}

	/**
	* Sets the xcn01310 of this vr technical spec_xcn part2.
	*
	* @param XCN01310 the xcn01310 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01310(java.lang.String XCN01310) {
		_vrTechnicalSpec_XCNPart2.setXCN01310(XCN01310);
	}

	/**
	* Sets the xcn01311 of this vr technical spec_xcn part2.
	*
	* @param XCN01311 the xcn01311 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01311(java.lang.String XCN01311) {
		_vrTechnicalSpec_XCNPart2.setXCN01311(XCN01311);
	}

	/**
	* Sets the xcn01312 of this vr technical spec_xcn part2.
	*
	* @param XCN01312 the xcn01312 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01312(java.lang.String XCN01312) {
		_vrTechnicalSpec_XCNPart2.setXCN01312(XCN01312);
	}

	/**
	* Sets the xcn01313 of this vr technical spec_xcn part2.
	*
	* @param XCN01313 the xcn01313 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01313(java.lang.String XCN01313) {
		_vrTechnicalSpec_XCNPart2.setXCN01313(XCN01313);
	}

	/**
	* Sets the xcn01314 of this vr technical spec_xcn part2.
	*
	* @param XCN01314 the xcn01314 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01314(java.lang.String XCN01314) {
		_vrTechnicalSpec_XCNPart2.setXCN01314(XCN01314);
	}

	/**
	* Sets the xcn01315 of this vr technical spec_xcn part2.
	*
	* @param XCN01315 the xcn01315 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01315(java.lang.String XCN01315) {
		_vrTechnicalSpec_XCNPart2.setXCN01315(XCN01315);
	}

	/**
	* Sets the xcn01316 of this vr technical spec_xcn part2.
	*
	* @param XCN01316 the xcn01316 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01316(java.lang.String XCN01316) {
		_vrTechnicalSpec_XCNPart2.setXCN01316(XCN01316);
	}

	/**
	* Sets the xcn01317 of this vr technical spec_xcn part2.
	*
	* @param XCN01317 the xcn01317 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01317(java.lang.String XCN01317) {
		_vrTechnicalSpec_XCNPart2.setXCN01317(XCN01317);
	}

	/**
	* Sets the xcn01318 of this vr technical spec_xcn part2.
	*
	* @param XCN01318 the xcn01318 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01318(java.lang.String XCN01318) {
		_vrTechnicalSpec_XCNPart2.setXCN01318(XCN01318);
	}

	/**
	* Sets the xcn01319 of this vr technical spec_xcn part2.
	*
	* @param XCN01319 the xcn01319 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01319(java.lang.String XCN01319) {
		_vrTechnicalSpec_XCNPart2.setXCN01319(XCN01319);
	}

	/**
	* Sets the xcn01320 of this vr technical spec_xcn part2.
	*
	* @param XCN01320 the xcn01320 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01320(java.lang.String XCN01320) {
		_vrTechnicalSpec_XCNPart2.setXCN01320(XCN01320);
	}

	/**
	* Sets the xcn01321 of this vr technical spec_xcn part2.
	*
	* @param XCN01321 the xcn01321 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01321(java.lang.String XCN01321) {
		_vrTechnicalSpec_XCNPart2.setXCN01321(XCN01321);
	}

	/**
	* Sets the xcn01322 of this vr technical spec_xcn part2.
	*
	* @param XCN01322 the xcn01322 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01322(java.lang.String XCN01322) {
		_vrTechnicalSpec_XCNPart2.setXCN01322(XCN01322);
	}

	/**
	* Sets the xcn01323 of this vr technical spec_xcn part2.
	*
	* @param XCN01323 the xcn01323 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01323(java.lang.String XCN01323) {
		_vrTechnicalSpec_XCNPart2.setXCN01323(XCN01323);
	}

	/**
	* Sets the xcn01324 of this vr technical spec_xcn part2.
	*
	* @param XCN01324 the xcn01324 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01324(java.lang.String XCN01324) {
		_vrTechnicalSpec_XCNPart2.setXCN01324(XCN01324);
	}

	/**
	* Sets the xcn01325 of this vr technical spec_xcn part2.
	*
	* @param XCN01325 the xcn01325 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01325(java.lang.String XCN01325) {
		_vrTechnicalSpec_XCNPart2.setXCN01325(XCN01325);
	}

	/**
	* Sets the xcn01326 of this vr technical spec_xcn part2.
	*
	* @param XCN01326 the xcn01326 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01326(java.lang.String XCN01326) {
		_vrTechnicalSpec_XCNPart2.setXCN01326(XCN01326);
	}

	/**
	* Sets the xcn01327 of this vr technical spec_xcn part2.
	*
	* @param XCN01327 the xcn01327 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01327(java.lang.String XCN01327) {
		_vrTechnicalSpec_XCNPart2.setXCN01327(XCN01327);
	}

	/**
	* Sets the xcn01328 of this vr technical spec_xcn part2.
	*
	* @param XCN01328 the xcn01328 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01328(java.lang.String XCN01328) {
		_vrTechnicalSpec_XCNPart2.setXCN01328(XCN01328);
	}

	/**
	* Sets the xcn01329 of this vr technical spec_xcn part2.
	*
	* @param XCN01329 the xcn01329 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01329(java.lang.String XCN01329) {
		_vrTechnicalSpec_XCNPart2.setXCN01329(XCN01329);
	}

	/**
	* Sets the xcn01330 of this vr technical spec_xcn part2.
	*
	* @param XCN01330 the xcn01330 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01330(java.lang.String XCN01330) {
		_vrTechnicalSpec_XCNPart2.setXCN01330(XCN01330);
	}

	/**
	* Sets the xcn01331 of this vr technical spec_xcn part2.
	*
	* @param XCN01331 the xcn01331 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01331(java.lang.String XCN01331) {
		_vrTechnicalSpec_XCNPart2.setXCN01331(XCN01331);
	}

	/**
	* Sets the xcn01332 of this vr technical spec_xcn part2.
	*
	* @param XCN01332 the xcn01332 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01332(java.lang.String XCN01332) {
		_vrTechnicalSpec_XCNPart2.setXCN01332(XCN01332);
	}

	/**
	* Sets the xcn01333 of this vr technical spec_xcn part2.
	*
	* @param XCN01333 the xcn01333 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01333(java.lang.String XCN01333) {
		_vrTechnicalSpec_XCNPart2.setXCN01333(XCN01333);
	}

	/**
	* Sets the xcn01334 of this vr technical spec_xcn part2.
	*
	* @param XCN01334 the xcn01334 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01334(java.lang.String XCN01334) {
		_vrTechnicalSpec_XCNPart2.setXCN01334(XCN01334);
	}

	/**
	* Sets the xcn01335 of this vr technical spec_xcn part2.
	*
	* @param XCN01335 the xcn01335 of this vr technical spec_xcn part2
	*/
	@Override
	public void setXCN01335(java.lang.String XCN01335) {
		_vrTechnicalSpec_XCNPart2.setXCN01335(XCN01335);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCNPart2Wrapper)) {
			return false;
		}

		VRTechnicalSpec_XCNPart2Wrapper vrTechnicalSpec_XCNPart2Wrapper = (VRTechnicalSpec_XCNPart2Wrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XCNPart2,
					vrTechnicalSpec_XCNPart2Wrapper._vrTechnicalSpec_XCNPart2)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XCNPart2 getWrappedModel() {
		return _vrTechnicalSpec_XCNPart2;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XCNPart2.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XCNPart2.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XCNPart2.resetOriginalValues();
	}

	private final VRTechnicalSpec_XCNPart2 _vrTechnicalSpec_XCNPart2;
}