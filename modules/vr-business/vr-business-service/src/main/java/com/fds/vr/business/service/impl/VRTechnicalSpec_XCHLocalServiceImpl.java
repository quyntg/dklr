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

package com.fds.vr.business.service.impl;

import com.fds.vr.business.model.VRTechnicalSpec_XCH;
import com.fds.vr.business.model.VRTechnicalSpec_XCHPart2;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCHModelImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCHPart2ModelImpl;
import com.fds.vr.business.service.base.VRTechnicalSpec_XCHLocalServiceBaseImpl;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr technical spec_xch local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRTechnicalSpec_XCHLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCHLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRTechnicalSpec_XCHLocalServiceUtil
 */
@ProviderType
public class VRTechnicalSpec_XCHLocalServiceImpl extends VRTechnicalSpec_XCHLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRTechnicalSpec_XCHLocalServiceUtil} to access
	 * the vr technical spec_xch local service.
	 */

	public List<VRTechnicalSpec_XCH> findByVehicleCertificateId(long vehicleCertificateId, int start, int end) {
		return vrTechnicalSpec_XCHPersistence.findByvehicleTypeCertificateId(vehicleCertificateId, start, end);
	}

	public List<VRTechnicalSpec_XCH> findByDossierId(long dossierId, int start, int end) {
		return vrTechnicalSpec_XCHPersistence.findBy_DossierId(dossierId, start, end);
	}

	public List<VRTechnicalSpec_XCH> findByConvertAssembleId(long convertAssembleId) throws SystemException {
		try {
			return vrTechnicalSpec_XCHPersistence.findByConvertAssembleId(convertAssembleId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCH>();

	}

	public List<VRTechnicalSpec_XCH> findByReferenceUid(String referenceUid) throws SystemException {
		try {
			return vrTechnicalSpec_XCHPersistence.findByReferenceUid(referenceUid);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCH>();

	}

	public List<VRTechnicalSpec_XCH> findByDossierNo(String dossierNo, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_XCHPersistence.findByDossierNo(dossierNo, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCH>();

	}

	public List<VRTechnicalSpec_XCH> findByDossierId(long dossierId, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_XCHPersistence.findByDossierId(dossierId, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCH>();

	}

	public List<VRTechnicalSpec_XCH> findByDossierIdCTN(String dossierIdCTN) throws SystemException {
		try {
			return vrTechnicalSpec_XCHPersistence.findByDossierIdCTN(dossierIdCTN);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCH>();

	}

	public List<VRTechnicalSpec_XCH> findByDeliverableCode(String deliverableCode) throws SystemException {
		try {
			return vrTechnicalSpec_XCHPersistence.findByDeliverableCode(deliverableCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCH>();

	}

	public JSONArray adminProcessData(JSONArray arrayData, long dossierId, long mtCore, long vehicleTypeCertificateId) {
		JSONArray array = JSONFactoryUtil.createJSONArray();
		vrTechnicalSpec_XCHPersistence.removeByDossierId(dossierId, mtCore);
		vrTechnicalSpec_XCHPart2Persistence.removeByDossierId(dossierId, mtCore);
		Date now = new Date();

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);
			VRTechnicalSpec_XCH object = null;

			long id = counterLocalService.increment(VRTechnicalSpec_XCH.class.getName());
			object = vrTechnicalSpec_XCHPersistence.create(id);

			object.setVehicleTypeCertificateId(vehicleTypeCertificateId);
			object.setModifyDate(now);
			object.setSyncDate(now);
			object.setMtCore(objectData.getLong("mtCore"));
			object.setConvertAssembleId(objectData.getLong("convertAssembleId"));
			object.setDossierId(objectData.getLong("dossierId"));
			object.setDossierNo(objectData.getString("dossierNo"));
			object.setReferenceUid(objectData.getString("referenceUid"));
			object.setDossierIdCTN(objectData.getString("dossierIdCTN"));
			object.setDeliverableCode(objectData.getString("deliverableCode"));
			object.setXCH01001(objectData.getString("XCH01001"));
			object.setXCH01002(objectData.getString("XCH01002"));
			object.setXCH01003(objectData.getString("XCH01003"));
			object.setXCH01004(objectData.getString("XCH01004"));
			object.setXCH01005(objectData.getString("XCH01005"));
			object.setXCH01006(objectData.getString("XCH01006"));
			object.setXCH01007(objectData.getString("XCH01007"));
			object.setXCH01008(objectData.getString("XCH01008"));
			object.setXCH01009(objectData.getString("XCH01009"));
			object.setXCH01010(objectData.getString("XCH01010"));
			object.setXCH01011(objectData.getString("XCH01011"));
			object.setXCH01012(objectData.getString("XCH01012"));
			object.setXCH01013(objectData.getString("XCH01013"));
			object.setXCH01014(objectData.getString("XCH01014"));
			object.setXCH01016(objectData.getString("XCH01016"));
			object.setXCH01017(objectData.getString("XCH01017"));
			object.setXCH01019(objectData.getString("XCH01019"));
			object.setXCH01020(objectData.getString("XCH01020"));
			object.setXCH01021(objectData.getString("XCH01021"));
			object.setXCH01022(objectData.getString("XCH01022"));
			object.setXCH01024(objectData.getString("XCH01024"));
			object.setXCH01025(objectData.getString("XCH01025"));
			object.setXCH01026(objectData.getString("XCH01026"));
			object.setXCH01027(objectData.getString("XCH01027"));
			object.setXCH01028(objectData.getString("XCH01028"));
			object.setXCH01030(objectData.getString("XCH01030"));
			object.setXCH01031(objectData.getString("XCH01031"));
			object.setXCH01032(objectData.getString("XCH01032"));
			object.setXCH01033(objectData.getString("XCH01033"));
			object.setXCH01034(objectData.getString("XCH01034"));
			object.setXCH01035(objectData.getString("XCH01035"));
			object.setXCH01036(objectData.getString("XCH01036"));
			object.setXCH01037(objectData.getString("XCH01037"));
			object.setXCH01038(objectData.getString("XCH01038"));
			object.setXCH01039(objectData.getString("XCH01039"));
			object.setXCH01040(objectData.getString("XCH01040"));
			object.setXCH01041(objectData.getString("XCH01041"));
			object.setXCH01042(objectData.getString("XCH01042"));
			object.setXCH01043(objectData.getString("XCH01043"));
			object.setXCH01044(objectData.getString("XCH01044"));
			object.setXCH01045(objectData.getString("XCH01045"));
			object.setXCH01046(objectData.getString("XCH01046"));
			object.setXCH01047(objectData.getString("XCH01047"));
			object.setXCH01049(objectData.getString("XCH01049"));
			object.setXCH01050(objectData.getString("XCH01050"));
			object.setXCH01051(objectData.getString("XCH01051"));
			object.setXCH01052(objectData.getString("XCH01052"));
			object.setXCH01053(objectData.getString("XCH01053"));
			object.setXCH01054(objectData.getString("XCH01054"));
			object.setXCH01055(objectData.getString("XCH01055"));
			object.setXCH01056(objectData.getString("XCH01056"));
			object.setXCH01057(objectData.getString("XCH01057"));
			object.setXCH01058(objectData.getString("XCH01058"));
			object.setXCH01059(objectData.getString("XCH01059"));
			object.setXCH01060(objectData.getString("XCH01060"));
			object.setXCH01062(objectData.getString("XCH01062"));
			object.setXCH01063(objectData.getString("XCH01063"));
			object.setXCH01064(objectData.getString("XCH01064"));
			object.setXCH01065(objectData.getString("XCH01065"));
			object.setXCH01066(objectData.getString("XCH01066"));
			object.setXCH01067(objectData.getString("XCH01067"));
			object.setXCH01068(objectData.getString("XCH01068"));
			object.setXCH01069(objectData.getString("XCH01069"));
			object.setXCH01100(objectData.getString("XCH01100"));
			object.setXCH01101(objectData.getString("XCH01101"));
			object.setXCH01102(objectData.getString("XCH01102"));
			object.setXCH01103(objectData.getString("XCH01103"));
			object.setXCH01104(objectData.getString("XCH01104"));
			object.setXCH01105(objectData.getString("XCH01105"));
			object.setXCH01106(objectData.getString("XCH01106"));
			object.setXCH01107(objectData.getString("XCH01107"));
			object.setXCH01108(objectData.getString("XCH01108"));
			object.setXCH01109(objectData.getString("XCH01109"));
			object.setXCH01110(objectData.getString("XCH01110"));
			object.setXCH01111(objectData.getString("XCH01111"));
			object.setXCH01112(objectData.getString("XCH01112"));
			object.setXCH01113(objectData.getString("XCH01113"));
			object.setXCH01114(objectData.getString("XCH01114"));
			object.setXCH01115(objectData.getString("XCH01115"));
			object.setXCH01116(objectData.getString("XCH01116"));
			object.setXCH01117(objectData.getString("XCH01117"));
			object.setXCH01118(objectData.getString("XCH01118"));
			object.setXCH01119(objectData.getString("XCH01119"));
			object.setXCH01120(objectData.getString("XCH01120"));
			object.setXCH01121(objectData.getString("XCH01121"));
			object.setXCH01122(objectData.getString("XCH01122"));
			object.setXCH01123(objectData.getString("XCH01123"));
			object.setXCH01124(objectData.getString("XCH01124"));
			object.setXCH01125(objectData.getString("XCH01125"));
			object.setXCH01126(objectData.getString("XCH01126"));
			object.setXCH01127(objectData.getString("XCH01127"));
			object.setXCH01128(objectData.getString("XCH01128"));
			object.setXCH01129(objectData.getString("XCH01129"));
			object.setXCH01130(objectData.getString("XCH01130"));
			object.setXCH01131(objectData.getString("XCH01131"));
			object.setXCH01132(objectData.getString("XCH01132"));
			object.setXCH01133(objectData.getString("XCH01133"));
			object.setXCH01134(objectData.getString("XCH01134"));
			object.setXCH01135(objectData.getString("XCH01135"));
			object.setXCH01136(objectData.getString("XCH01136"));
			object.setXCH01137(objectData.getString("XCH01137"));
			object.setXCH01138(objectData.getString("XCH01138"));
			object.setXCH01139(objectData.getString("XCH01139"));
			object.setXCH01140(objectData.getString("XCH01140"));
			object.setXCH01141(objectData.getString("XCH01141"));
			object.setXCH01142(objectData.getString("XCH01142"));
			object.setXCH01143(objectData.getString("XCH01143"));
			object.setXCH01144(objectData.getString("XCH01144"));
			object.setXCH01145(objectData.getString("XCH01145"));
			object.setXCH01146(objectData.getString("XCH01146"));
			object.setXCH01147(objectData.getString("XCH01147"));
			object.setXCH01148(objectData.getString("XCH01148"));
			object.setXCH01149(objectData.getString("XCH01149"));
			object.setXCH01150(objectData.getString("XCH01150"));
			object.setXCH01151(objectData.getString("XCH01151"));
			object.setXCH01152(objectData.getString("XCH01152"));
			object.setXCH01153(objectData.getString("XCH01153"));
			object.setXCH01154(objectData.getString("XCH01154"));
			object.setXCH01155(objectData.getString("XCH01155"));
			object.setXCH01156(objectData.getString("XCH01156"));
			object.setXCH01157(objectData.getString("XCH01157"));
			object.setXCH01158(objectData.getString("XCH01158"));
			object.setXCH01159(objectData.getString("XCH01159"));
			object.setXCH01160(objectData.getString("XCH01160"));
			object.setXCH01161(objectData.getString("XCH01161"));
			object.setXCH01162(objectData.getString("XCH01162"));
			object.setXCH01163(objectData.getString("XCH01163"));
			object.setXCH01164(objectData.getString("XCH01164"));
			object.setXCH01165(objectData.getString("XCH01165"));
			object.setXCH01166(objectData.getString("XCH01166"));
			object.setXCH01167(objectData.getString("XCH01167"));
			object.setXCH01168(objectData.getString("XCH01168"));
			object.setXCH01169(objectData.getString("XCH01169"));
			object.setXCH01170(objectData.getString("XCH01170"));
			object.setXCH01171(objectData.getString("XCH01171"));
			object.setXCH01172(objectData.getString("XCH01172"));
			object.setXCH01173(objectData.getString("XCH01173"));
			object.setXCH01174(objectData.getString("XCH01174"));
			object.setXCH01175(objectData.getString("XCH01175"));
			object.setXCH01176(objectData.getString("XCH01176"));
			object.setXCH01177(objectData.getString("XCH01177"));
			object.setXCH01178(objectData.getString("XCH01178"));
			object.setXCH01179(objectData.getString("XCH01179"));
			object.setXCH01180(objectData.getString("XCH01180"));
			object.setXCH01181(objectData.getString("XCH01181"));
			object.setXCH01182(objectData.getString("XCH01182"));
			object.setXCH01183(objectData.getString("XCH01183"));
			object.setXCH01184(objectData.getString("XCH01184"));
			object.setXCH01185(objectData.getString("XCH01185"));
			object.setXCH01186(objectData.getString("XCH01186"));
			object.setXCH01187(objectData.getString("XCH01187"));
			object.setXCH01188(objectData.getString("XCH01188"));
			object.setXCH01189(objectData.getString("XCH01189"));
			object.setXCH01190(objectData.getString("XCH01190"));
			object.setXCH01191(objectData.getString("XCH01191"));
			object.setXCH01192(objectData.getString("XCH01192"));
			object.setXCH01193(objectData.getString("XCH01193"));
			object.setXCH01194(objectData.getString("XCH01194"));
			object.setXCH01195(objectData.getString("XCH01195"));
			object.setXCH01196(objectData.getString("XCH01196"));
			object.setXCH01197(objectData.getString("XCH01197"));
			object.setXCH01198(objectData.getString("XCH01198"));
			object.setXCH01199(objectData.getString("XCH01199"));
			object.setXCH01200(objectData.getString("XCH01200"));
			object.setXCH01201(objectData.getString("XCH01201"));
			object.setXCH01202(objectData.getString("XCH01202"));
			object.setXCH01203(objectData.getString("XCH01203"));
			object.setXCH01204(objectData.getString("XCH01204"));
			object.setXCH01205(objectData.getString("XCH01205"));
			object.setXCH01206(objectData.getString("XCH01206"));
			object.setXCH01207(objectData.getString("XCH01207"));
			object.setXCH01208(objectData.getString("XCH01208"));
			object.setXCH01209(objectData.getString("XCH01209"));
			object.setXCH01210(objectData.getString("XCH01210"));
			object.setXCH01211(objectData.getString("XCH01211"));
			object.setXCH01212(objectData.getString("XCH01212"));
			object.setXCH01213(objectData.getString("XCH01213"));
			object.setXCH01214(objectData.getString("XCH01214"));
			object.setXCH01215(objectData.getString("XCH01215"));
			object.setXCH01216(objectData.getString("XCH01216"));
			object.setXCH01217(objectData.getString("XCH01217"));
			object.setXCH01218(objectData.getString("XCH01218"));
			object.setXCH01219(objectData.getString("XCH01219"));
			object.setXCH01220(objectData.getString("XCH01220"));
			object.setXCH01221(objectData.getString("XCH01221"));
			object.setXCH01222(objectData.getString("XCH01222"));
			object.setXCH01223(objectData.getString("XCH01223"));
			object.setXCH01224(objectData.getString("XCH01224"));
			object.setXCH01225(objectData.getString("XCH01225"));
			object.setXCH01226(objectData.getString("XCH01226"));
			object.setXCH01227(objectData.getString("XCH01227"));
			object.setXCH01228(objectData.getString("XCH01228"));
			object.setXCH01229(objectData.getString("XCH01229"));
			object.setXCH01230(objectData.getString("XCH01230"));
			object.setXCH01231(objectData.getString("XCH01231"));
			object.setXCH01232(objectData.getString("XCH01232"));
			object.setXCH01233(objectData.getString("XCH01233"));
			object.setXCH01234(objectData.getString("XCH01234"));
			object.setXCH01235(objectData.getString("XCH01235"));
			object.setXCH01236(objectData.getString("XCH01236"));
			object.setXCH01237(objectData.getString("XCH01237"));
			object.setXCH01238(objectData.getString("XCH01238"));
			object.setXCH01239(objectData.getString("XCH01239"));
			object.setXCH01240(objectData.getString("XCH01240"));
			object.setXCH01241(objectData.getString("XCH01241"));
			object.setXCH01242(objectData.getString("XCH01242"));
			object.setXCH01243(objectData.getString("XCH01243"));
			object.setXCH01244(objectData.getString("XCH01244"));
			object.setXCH01245(objectData.getString("XCH01245"));
			object.setXCH01246(objectData.getString("XCH01246"));
			object.setXCH01247(objectData.getString("XCH01247"));
			object.setXCH01248(objectData.getString("XCH01248"));
			object.setXCH01249(objectData.getString("XCH01249"));
			object.setXCH01250(objectData.getString("XCH01250"));
			object.setXCH01251(objectData.getString("XCH01251"));
			object.setXCH01252(objectData.getString("XCH01252"));
			object.setXCH01253(objectData.getString("XCH01253"));
			object.setXCH01254(objectData.getString("XCH01254"));
			object.setXCH01255(objectData.getString("XCH01255"));
			object.setXCH01256(objectData.getString("XCH01256"));
			object.setXCH01257(objectData.getString("XCH01257"));
			object.setXCH01258(objectData.getString("XCH01258"));
			object.setXCH01259(objectData.getString("XCH01259"));
			object.setXCH01260(objectData.getString("XCH01260"));
			object.setXCH01261(objectData.getString("XCH01261"));
			object.setXCH01262(objectData.getString("XCH01262"));
			object.setXCH01263(objectData.getString("XCH01263"));
			object.setXCH01264(objectData.getString("XCH01264"));
			object.setXCH01265(objectData.getString("XCH01265"));
			object.setXCH01266(objectData.getString("XCH01266"));
			object.setXCH01267(objectData.getString("XCH01267"));
			object.setXCH01268(objectData.getString("XCH01268"));
			object.setXCH01269(objectData.getString("XCH01269"));
			object.setXCH01270(objectData.getString("XCH01270"));
			object.setXCH01271(objectData.getString("XCH01271"));
			object.setXCH01272(objectData.getString("XCH01272"));

			object = vrTechnicalSpec_XCHPersistence.update(object);
			JSONObject obj_part1 = null;
			try {
				obj_part1 = BusinessUtil.object2Json_originColumnName(object, VRTechnicalSpec_XCHModelImpl.class,
						StringPool.BLANK);
			} catch (JSONException e) {
			}

			VRTechnicalSpec_XCHPart2 objectPart2 = null;
			objectPart2 = vrTechnicalSpec_XCHPart2Persistence.fetchByPrimaryKey(object.getPrimaryKey());
			objectPart2.setMtCore(objectData.getLong("mtCore"));
			objectPart2.setConvertAssembleId(objectData.getLong("convertAssembleId"));
			objectPart2.setDossierId(objectData.getLong("dossierId"));
			objectPart2.setDossierNo(objectData.getString("dossierNo"));
			objectPart2.setReferenceUid(objectData.getString("referenceUid"));
			objectPart2.setDossierIdCTN(objectData.getString("dossierIdCTN"));
			objectPart2.setDeliverableCode(objectData.getString("deliverableCode"));
			objectPart2.setXCH01273(objectData.getString("XCH01273"));
			objectPart2.setXCH01274(objectData.getString("XCH01274"));
			objectPart2.setXCH01275(objectData.getString("XCH01275"));
			objectPart2.setXCH01276(objectData.getString("XCH01276"));
			objectPart2.setXCH01277(objectData.getString("XCH01277"));
			objectPart2.setXCH01278(objectData.getString("XCH01278"));
			objectPart2.setXCH01279(objectData.getString("XCH01279"));
			objectPart2.setXCH01280(objectData.getString("XCH01280"));
			objectPart2.setXCH01281(objectData.getString("XCH01281"));
			objectPart2.setXCH01282(objectData.getString("XCH01282"));
			objectPart2.setXCH01283(objectData.getString("XCH01283"));
			objectPart2.setXCH01284(objectData.getString("XCH01284"));
			objectPart2.setXCH01285(objectData.getString("XCH01285"));
			objectPart2.setXCH01286(objectData.getString("XCH01286"));
			objectPart2.setXCH01287(objectData.getString("XCH01287"));
			objectPart2.setXCH01288(objectData.getString("XCH01288"));
			objectPart2.setXCH01289(objectData.getString("XCH01289"));
			objectPart2.setXCH01290(objectData.getString("XCH01290"));
			objectPart2.setXCH01291(objectData.getString("XCH01291"));
			objectPart2.setXCH01292(objectData.getString("XCH01292"));
			objectPart2.setXCH01293(objectData.getString("XCH01293"));
			objectPart2.setXCH01294(objectData.getString("XCH01294"));
			objectPart2.setXCH01295(objectData.getString("XCH01295"));
			objectPart2.setXCH01296(objectData.getString("XCH01296"));
			objectPart2.setXCH01297(objectData.getString("XCH01297"));
			objectPart2.setXCH01298(objectData.getString("XCH01298"));
			objectPart2.setXCH01299(objectData.getString("XCH01299"));
			objectPart2.setXCH01300(objectData.getString("XCH01300"));
			objectPart2.setXCH01301(objectData.getString("XCH01301"));
			objectPart2.setXCH01302(objectData.getString("XCH01302"));
			objectPart2.setXCH01303(objectData.getString("XCH01303"));
			objectPart2.setXCH01304(objectData.getString("XCH01304"));
			objectPart2.setXCH01305(objectData.getString("XCH01305"));
			objectPart2.setXCH01306(objectData.getString("XCH01306"));
			objectPart2.setXCH01307(objectData.getString("XCH01307"));
			objectPart2.setXCH01308(objectData.getString("XCH01308"));
			objectPart2.setXCH01309(objectData.getString("XCH01309"));
			objectPart2.setXCH01310(objectData.getString("XCH01310"));
			objectPart2.setXCH01311(objectData.getString("XCH01311"));
			objectPart2.setXCH01312(objectData.getString("XCH01312"));
			objectPart2.setXCH01313(objectData.getString("XCH01313"));
			objectPart2.setXCH01314(objectData.getString("XCH01314"));
			objectPart2.setXCH01315(objectData.getString("XCH01315"));
			objectPart2.setXCH01316(objectData.getString("XCH01316"));
			objectPart2.setXCH01317(objectData.getString("XCH01317"));
			objectPart2.setXCH01318(objectData.getString("XCH01318"));
			objectPart2.setXCH01319(objectData.getString("XCH01319"));
			objectPart2.setXCH01320(objectData.getString("XCH01320"));
			objectPart2.setXCH01321(objectData.getString("XCH01321"));
			objectPart2.setXCH01322(objectData.getString("XCH01322"));
			objectPart2.setXCH01323(objectData.getString("XCH01323"));
			objectPart2.setXCH01324(objectData.getString("XCH01324"));
			objectPart2.setXCH01325(objectData.getString("XCH01325"));
			objectPart2.setXCH01326(objectData.getString("XCH01326"));
			objectPart2.setXCH01327(objectData.getString("XCH01327"));
			objectPart2.setXCH01328(objectData.getString("XCH01328"));
			objectPart2.setXCH01329(objectData.getString("XCH01329"));
			objectPart2.setXCH01330(objectData.getString("XCH01330"));
			objectPart2.setXCH01331(objectData.getString("XCH01331"));
			objectPart2.setXCH01332(objectData.getString("XCH01332"));
			objectPart2.setXCH01333(objectData.getString("XCH01333"));
			objectPart2.setXCH01334(objectData.getString("XCH01334"));
			objectPart2.setXCH01335(objectData.getString("XCH01335"));
			objectPart2.setXCH01336(objectData.getString("XCH01336"));
			objectPart2.setXCH01337(objectData.getString("XCH01337"));
			objectPart2.setXCH01338(objectData.getString("XCH01338"));
			objectPart2.setXCH01339(objectData.getString("XCH01339"));
			objectPart2.setXCH01340(objectData.getString("XCH01340"));
			objectPart2.setXCH01341(objectData.getString("XCH01341"));
			objectPart2.setXCH01342(objectData.getString("XCH01342"));
			objectPart2.setXCH01343(objectData.getString("XCH01343"));
			objectPart2.setXCH01344(objectData.getString("XCH01344"));
			objectPart2.setXCH01345(objectData.getString("XCH01345"));
			objectPart2.setXCH01346(objectData.getString("XCH01346"));
			objectPart2.setXCH01347(objectData.getString("XCH01347"));
			objectPart2.setXCH01348(objectData.getString("XCH01348"));
			objectPart2.setXCH01349(objectData.getString("XCH01349"));
			objectPart2.setXCH01350(objectData.getString("XCH01350"));
			objectPart2.setXCH01351(objectData.getString("XCH01351"));
			objectPart2.setXCH01352(objectData.getString("XCH01352"));
			objectPart2.setXCH01353(objectData.getString("XCH01353"));
			objectPart2.setXCH01354(objectData.getString("XCH01354"));
			objectPart2.setXCH01355(objectData.getString("XCH01355"));
			objectPart2.setXCH01356(objectData.getString("XCH01356"));
			objectPart2.setXCH01357(objectData.getString("XCH01357"));
			objectPart2.setXCH01358(objectData.getString("XCH01358"));
			objectPart2.setXCH01359(objectData.getString("XCH01359"));
			objectPart2.setXCH01360(objectData.getString("XCH01360"));
			objectPart2.setXCH01361(objectData.getString("XCH01361"));
			objectPart2.setXCH01362(objectData.getString("XCH01362"));
			objectPart2.setXCH01363(objectData.getString("XCH01363"));
			objectPart2.setXCH01364(objectData.getString("XCH01364"));
			objectPart2.setXCH01365(objectData.getString("XCH01365"));
			objectPart2.setXCH01366(objectData.getString("XCH01366"));
			objectPart2.setXCH01367(objectData.getString("XCH01367"));
			objectPart2.setXCH01368(objectData.getString("XCH01368"));
			objectPart2.setXCH01369(objectData.getString("XCH01369"));
			objectPart2.setXCH01370(objectData.getString("XCH01370"));
			objectPart2.setXCH01371(objectData.getString("XCH01371"));
			objectPart2.setXCH01372(objectData.getString("XCH01372"));
			objectPart2.setXCH01373(objectData.getString("XCH01373"));
			objectPart2.setXCH01374(objectData.getString("XCH01374"));
			objectPart2.setXCH01375(objectData.getString("XCH01375"));
			objectPart2.setXCH01376(objectData.getString("XCH01376"));
			objectPart2.setXCH01377(objectData.getString("XCH01377"));
			objectPart2.setXCH01378(objectData.getString("XCH01378"));
			objectPart2.setXCH01379(objectData.getString("XCH01379"));
			objectPart2.setXCH01380(objectData.getString("XCH01380"));
			objectPart2.setXCH01381(objectData.getString("XCH01381"));
			objectPart2.setXCH01382(objectData.getString("XCH01382"));
			objectPart2.setXCH01383(objectData.getString("XCH01383"));
			objectPart2.setXCH01384(objectData.getString("XCH01384"));
			objectPart2.setXCH01385(objectData.getString("XCH01385"));
			objectPart2.setXCH01386(objectData.getString("XCH01386"));
			objectPart2.setXCH01387(objectData.getString("XCH01387"));
			objectPart2.setXCH01388(objectData.getString("XCH01388"));
			objectPart2.setXCH01389(objectData.getString("XCH01389"));
			objectPart2.setXCH01390(objectData.getString("XCH01390"));
			objectPart2.setXCH01391(objectData.getString("XCH01391"));
			objectPart2.setXCH01392(objectData.getString("XCH01392"));
			objectPart2.setXCH01393(objectData.getString("XCH01393"));
			objectPart2.setXCH01394(objectData.getString("XCH01394"));
			objectPart2.setXCH01395(objectData.getString("XCH01395"));
			objectPart2.setXCH01396(objectData.getString("XCH01396"));
			objectPart2.setXCH01397(objectData.getString("XCH01397"));
			objectPart2.setXCH01398(objectData.getString("XCH01398"));
			objectPart2.setXCH01399(objectData.getString("XCH01399"));
			objectPart2.setXCH01400(objectData.getString("XCH01400"));
			objectPart2.setXCH01401(objectData.getString("XCH01401"));
			objectPart2.setXCH01402(objectData.getString("XCH01402"));
			objectPart2.setXCH01403(objectData.getString("XCH01403"));
			objectPart2.setXCH01404(objectData.getString("XCH01404"));
			objectPart2.setXCH01405(objectData.getString("XCH01405"));
			objectPart2.setXCH01406(objectData.getString("XCH01406"));
			objectPart2.setXCH01407(objectData.getString("XCH01407"));
			objectPart2.setXCH01408(objectData.getString("XCH01408"));
			objectPart2.setXCH01409(objectData.getString("XCH01409"));
			objectPart2.setXCH01410(objectData.getString("XCH01410"));
			objectPart2.setXCH01411(objectData.getString("XCH01411"));
			objectPart2.setXCH01412(objectData.getString("XCH01412"));
			objectPart2.setXCH01413(objectData.getString("XCH01413"));
			objectPart2.setXCH01414(objectData.getString("XCH01414"));
			objectPart2.setXCH01415(objectData.getString("XCH01415"));
			objectPart2.setXCH01416(objectData.getString("XCH01416"));
			objectPart2.setXCH01417(objectData.getString("XCH01417"));
			objectPart2.setXCH01418(objectData.getString("XCH01418"));
			objectPart2.setXCH01419(objectData.getString("XCH01419"));
			objectPart2.setXCH01420(objectData.getString("XCH01420"));
			objectPart2.setXCH01421(objectData.getString("XCH01421"));
			objectPart2.setXCH01422(objectData.getString("XCH01422"));
			objectPart2.setXCH01423(objectData.getString("XCH01423"));
			objectPart2.setXCH01424(objectData.getString("XCH01424"));
			objectPart2.setXCH01425(objectData.getString("XCH01425"));
			objectPart2.setXCH01426(objectData.getString("XCH01426"));
			objectPart2.setXCH01427(objectData.getString("XCH01427"));
			objectPart2.setXCH01428(objectData.getString("XCH01428"));
			objectPart2.setXCH01429(objectData.getString("XCH01429"));
			objectPart2.setXCH01430(objectData.getString("XCH01430"));
			objectPart2.setXCH01431(objectData.getString("XCH01431"));
			objectPart2.setXCH01432(objectData.getString("XCH01432"));
			objectPart2.setXCH01433(objectData.getString("XCH01433"));
			objectPart2.setXCH01434(objectData.getString("XCH01434"));
			objectPart2.setXCH01435(objectData.getString("XCH01435"));
			objectPart2.setXCH01436(objectData.getString("XCH01436"));
			objectPart2.setXCH01437(objectData.getString("XCH01437"));
			objectPart2.setXCH01438(objectData.getString("XCH01438"));
			objectPart2.setXCH01439(objectData.getString("XCH01439"));
			objectPart2.setXCH01440(objectData.getString("XCH01440"));
			objectPart2.setXCH01441(objectData.getString("XCH01441"));
			objectPart2.setXCH01442(objectData.getString("XCH01442"));
			objectPart2.setXCH01443(objectData.getString("XCH01443"));
			objectPart2.setXCH01444(objectData.getString("XCH01444"));
			objectPart2.setXCH01445(objectData.getString("XCH01445"));
			objectPart2.setBBCNCLKLXCH001(objectData.getString("BBCNCLKLXCH001"));
			objectPart2.setBBCNCLKLXCH002(objectData.getString("BBCNCLKLXCH002"));
			objectPart2.setBBCNCLKLXCH003(objectData.getString("BBCNCLKLXCH003"));
			objectPart2.setBBCNCLKLXCH004(objectData.getString("BBCNCLKLXCH004"));
			objectPart2.setBBCNCLKLXCH005(objectData.getString("BBCNCLKLXCH005"));
			objectPart2.setBBCNCLKLXCH006(objectData.getString("BBCNCLKLXCH006"));
			objectPart2.setBBCNCLKLXCH012(objectData.getString("BBCNCLKLXCH012"));
			objectPart2.setBBCNCLKLXCH013(objectData.getString("BBCNCLKLXCH013"));
			objectPart2.setBBCNCLKLXCH014(objectData.getString("BBCNCLKLXCH014"));
			objectPart2.setBBCNCLKLXCH015(objectData.getString("BBCNCLKLXCH015"));
			objectPart2.setBBCNCLKLXCH016(objectData.getString("BBCNCLKLXCH016"));
			objectPart2.setBBCNCLKLXCH017(objectData.getString("BBCNCLKLXCH017"));
			objectPart2.setBBCNCLKLXCH018(objectData.getString("BBCNCLKLXCH018"));
			objectPart2.setBBCNCLKLXCH019(objectData.getString("BBCNCLKLXCH019"));
			objectPart2.setBBCNCLKLXCH020(objectData.getString("BBCNCLKLXCH020"));
			objectPart2.setBBCNCLKLXCH021(objectData.getString("BBCNCLKLXCH021"));
			objectPart2.setBBCNCLKLXCH022(objectData.getString("BBCNCLKLXCH022"));
			objectPart2.setBBCNCLKLXCH023(objectData.getString("BBCNCLKLXCH023"));
			objectPart2.setBBCNCLKLXCH026(objectData.getString("BBCNCLKLXCH026"));
			objectPart2.setBBCNCLKLXCH027(objectData.getString("BBCNCLKLXCH027"));
			objectPart2.setBBCNCLKLXCH028(objectData.getString("BBCNCLKLXCH028"));
			objectPart2.setBBCNCLKLXCH033(objectData.getString("BBCNCLKLXCH033"));
			objectPart2.setBBCNCLKLXCH034(objectData.getString("BBCNCLKLXCH034"));
			objectPart2.setBBCNCLKLXCH037(objectData.getString("BBCNCLKLXCH037"));
			objectPart2.setBBCNCLKLXCH038(objectData.getString("BBCNCLKLXCH038"));
			objectPart2.setBBCNCLKLXCH039(objectData.getString("BBCNCLKLXCH039"));
			objectPart2.setBBCNCLKLXCH040(objectData.getString("BBCNCLKLXCH040"));
			objectPart2.setBBCNCLKLXCH041(objectData.getString("BBCNCLKLXCH041"));
			objectPart2.setBBCNCLKLXCH042(objectData.getString("BBCNCLKLXCH042"));
			objectPart2.setBBCNCLKLXCH043(objectData.getString("BBCNCLKLXCH043"));
			objectPart2.setBBCNCLKLXCH044(objectData.getString("BBCNCLKLXCH044"));
			objectPart2.setBBCNCLKLXCH045(objectData.getString("BBCNCLKLXCH045"));
			objectPart2.setBBCNCLKLXCH046(objectData.getString("BBCNCLKLXCH046"));
			objectPart2.setBBCNCLKLXCH047(objectData.getString("BBCNCLKLXCH047"));
			objectPart2.setBBCNCLKLXCH053(objectData.getString("BBCNCLKLXCH053"));

			objectPart2 = vrTechnicalSpec_XCHPart2Persistence.update(objectPart2);
			JSONObject obj_part2 = null;
			try {
				obj_part2 = BusinessUtil.object2Json_originColumnName(objectPart2,
						VRTechnicalSpec_XCHPart2ModelImpl.class, StringPool.BLANK);
			} catch (JSONException e) {
			}

			JSONObject obj = mergeJSON(obj_part1, obj_part2);
			array.put(obj);
		}

		return array;
	}

	private JSONObject mergeJSON(JSONObject... jsonObject) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		for (JSONObject obj : jsonObject) {
			obj.keys().forEachRemaining(key -> {
				result.put(key, obj.get(key));
			});
		}
		return result;
	}

	private Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XCHLocalServiceImpl.class);
}