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

import com.fds.vr.business.model.VRTechnicalSpec_XCN;
import com.fds.vr.business.model.VRTechnicalSpec_XCNPart2;
import com.fds.vr.business.model.VRTechnicalSpec_XCNPart3;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCNModelImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCNPart2ModelImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCNPart3ModelImpl;
import com.fds.vr.business.service.base.VRTechnicalSpec_XCNLocalServiceBaseImpl;
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
 * The implementation of the vr technical spec_xcn local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRTechnicalSpec_XCNLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCNLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRTechnicalSpec_XCNLocalServiceUtil
 */
@ProviderType
public class VRTechnicalSpec_XCNLocalServiceImpl extends VRTechnicalSpec_XCNLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRTechnicalSpec_XCNLocalServiceUtil} to access
	 * the vr technical spec_xcn local service.
	 */

	public List<VRTechnicalSpec_XCN> findByVehicleCertificateId(long vehicleCertificateId, int start, int end) {
		return vrTechnicalSpec_XCNPersistence.findByvehicleTypeCertificateId(vehicleCertificateId, start, end);
	}

	public List<VRTechnicalSpec_XCN> findBy_DossierId(long dossierId, int start, int end) {
		return vrTechnicalSpec_XCNPersistence.findBy_DossierId(dossierId, start, end);
	}

	public List<VRTechnicalSpec_XCN> findByConvertAssembleId(long convertAssembleId) throws SystemException {
		try {
			return vrTechnicalSpec_XCNPersistence.findByConvertAssembleId(convertAssembleId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCN>();

	}

	public List<VRTechnicalSpec_XCN> findByReferenceUid(String referenceUid) throws SystemException {
		try {
			return vrTechnicalSpec_XCNPersistence.findByReferenceUid(referenceUid);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCN>();

	}

	public List<VRTechnicalSpec_XCN> findByDossierNo(String dossierNo, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_XCNPersistence.findByDossierNo(dossierNo, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCN>();

	}

	public List<VRTechnicalSpec_XCN> findByDossierId(long dossierId, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_XCNPersistence.findByDossierId(dossierId, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCN>();

	}

	public List<VRTechnicalSpec_XCN> findByDossierIdCTN(String dossierIdCTN) throws SystemException {
		try {
			return vrTechnicalSpec_XCNPersistence.findByDossierIdCTN(dossierIdCTN);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCN>();

	}

	public List<VRTechnicalSpec_XCN> findByDeliverableCode(String deliverableCode) throws SystemException {
		try {
			return vrTechnicalSpec_XCNPersistence.findByDeliverableCode(deliverableCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCN>();

	}

	public JSONArray adminProcessData(JSONArray arrayData, long dossierId, long mtCore, long vehicleTypeCertificateId) {
		JSONArray array = JSONFactoryUtil.createJSONArray();

		vrTechnicalSpec_XCNPersistence.removeByDossierId(dossierId, mtCore);
		vrTechnicalSpec_XCNPart2Persistence.removeByDossierId(dossierId, mtCore);
		Date now = new Date();

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);
			VRTechnicalSpec_XCN object = null;

			long id = counterLocalService.increment(VRTechnicalSpec_XCN.class.getName());
			object = vrTechnicalSpec_XCNPersistence.create(id);

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
			object.setLoai_dong_co(objectData.getString("loai_dong_co"));
			object.setXCN01001(objectData.getString("XCN01001"));
			object.setXCN01002(objectData.getString("XCN01002"));
			object.setXCN01003(objectData.getString("XCN01003"));
			object.setXCN01004(objectData.getString("XCN01004"));
			object.setXCN01005(objectData.getString("XCN01005"));
			object.setXCN01006(objectData.getString("XCN01006"));
			object.setXCN01007(objectData.getString("XCN01007"));
			object.setXCN01008(objectData.getString("XCN01008"));
			object.setXCN01009(objectData.getString("XCN01009"));
			object.setXCN01010(objectData.getString("XCN01010"));
			object.setXCN01011(objectData.getString("XCN01011"));
			object.setXCN01012(objectData.getString("XCN01012"));
			object.setXCN01013(objectData.getString("XCN01013"));
			object.setXCN01014(objectData.getString("XCN01014"));
			object.setXCN01016(objectData.getString("XCN01016"));
			object.setXCN01017(objectData.getString("XCN01017"));
			object.setXCN01019(objectData.getString("XCN01019"));
			object.setXCN01020(objectData.getString("XCN01020"));
			object.setXCN01021(objectData.getString("XCN01021"));
			object.setXCN01022(objectData.getString("XCN01022"));
			object.setXCN01024(objectData.getString("XCN01024"));
			object.setXCN01025(objectData.getString("XCN01025"));
			object.setXCN01026(objectData.getString("XCN01026"));
			object.setXCN01027(objectData.getString("XCN01027"));
			object.setXCN01028(objectData.getString("XCN01028"));
			object.setXCN01030(objectData.getString("XCN01030"));
			object.setXCN01031(objectData.getString("XCN01031"));
			object.setXCN01032(objectData.getString("XCN01032"));
			object.setXCN01033(objectData.getString("XCN01033"));
			object.setXCN01034(objectData.getString("XCN01034"));
			object.setXCN01035(objectData.getString("XCN01035"));
			object.setXCN01036(objectData.getString("XCN01036"));
			object.setXCN01037(objectData.getString("XCN01037"));
			object.setXCN01038(objectData.getString("XCN01038"));
			object.setXCN01039(objectData.getString("XCN01039"));
			object.setXCN01040(objectData.getString("XCN01040"));
			object.setXCN01041(objectData.getString("XCN01041"));
			object.setXCN01042(objectData.getString("XCN01042"));
			object.setXCN01043(objectData.getString("XCN01043"));
			object.setXCN01044(objectData.getString("XCN01044"));
			object.setXCN01045(objectData.getString("XCN01045"));
			object.setXCN01046(objectData.getString("XCN01046"));
			object.setXCN01047(objectData.getString("XCN01047"));
			object.setXCN01049(objectData.getString("XCN01049"));
			object.setXCN01050(objectData.getString("XCN01050"));
			object.setXCN01051(objectData.getString("XCN01051"));
			object.setXCN01052(objectData.getString("XCN01052"));
			object.setXCN01053(objectData.getString("XCN01053"));
			object.setXCN01054(objectData.getString("XCN01054"));
			object.setXCN01055(objectData.getString("XCN01055"));
			object.setXCN01056(objectData.getString("XCN01056"));
			object.setXCN01057(objectData.getString("XCN01057"));
			object.setXCN01058(objectData.getString("XCN01058"));
			object.setXCN01059(objectData.getString("XCN01059"));
			object.setXCN01060(objectData.getString("XCN01060"));
			object.setXCN01062(objectData.getString("XCN01062"));
			object.setXCN01063(objectData.getString("XCN01063"));
			object.setXCN01064(objectData.getString("XCN01064"));
			object.setXCN01065(objectData.getString("XCN01065"));
			object.setXCN01066(objectData.getString("XCN01066"));
			object.setXCN01067(objectData.getString("XCN01067"));
			object.setXCN01068(objectData.getString("XCN01068"));
			object.setXCN01069(objectData.getString("XCN01069"));
			object.setXCN01100(objectData.getString("XCN01100"));
			object.setXCN01101(objectData.getString("XCN01101"));
			object.setXCN01102(objectData.getString("XCN01102"));
			object.setXCN01103(objectData.getString("XCN01103"));
			object.setXCN01104(objectData.getString("XCN01104"));
			object.setXCN01105(objectData.getString("XCN01105"));
			object.setXCN01106(objectData.getString("XCN01106"));
			object.setXCN01107(objectData.getString("XCN01107"));
			object.setXCN01108(objectData.getString("XCN01108"));
			object.setXCN01109(objectData.getString("XCN01109"));
			object.setXCN01110(objectData.getString("XCN01110"));
			object.setXCN01111(objectData.getString("XCN01111"));
			object.setXCN01112(objectData.getString("XCN01112"));
			object.setXCN01113(objectData.getString("XCN01113"));
			object.setXCN01114(objectData.getString("XCN01114"));
			object.setXCN01115(objectData.getString("XCN01115"));
			object.setXCN01116(objectData.getString("XCN01116"));
			object.setXCN01117(objectData.getString("XCN01117"));
			object.setXCN01118(objectData.getString("XCN01118"));
			object.setXCN01119(objectData.getString("XCN01119"));
			object.setXCN01120(objectData.getString("XCN01120"));
			object.setXCN01121(objectData.getString("XCN01121"));
			object.setXCN01122(objectData.getString("XCN01122"));
			object.setXCN01123(objectData.getString("XCN01123"));
			object.setXCN01124(objectData.getString("XCN01124"));
			object.setXCN01125(objectData.getString("XCN01125"));
			object.setXCN01126(objectData.getString("XCN01126"));
			object.setXCN01127(objectData.getString("XCN01127"));
			object.setXCN01128(objectData.getString("XCN01128"));
			object.setXCN01129(objectData.getString("XCN01129"));
			object.setXCN01130(objectData.getString("XCN01130"));
			object.setXCN01131(objectData.getString("XCN01131"));
			object.setXCN01132(objectData.getString("XCN01132"));
			object.setXCN01133(objectData.getString("XCN01133"));
			object.setXCN01134(objectData.getString("XCN01134"));
			object.setXCN01135(objectData.getString("XCN01135"));
			object.setXCN01136(objectData.getString("XCN01136"));
			object.setXCN01137(objectData.getString("XCN01137"));
			object.setXCN01138(objectData.getString("XCN01138"));
			object.setXCN01139(objectData.getString("XCN01139"));
			object.setXCN01140(objectData.getString("XCN01140"));
			object.setXCN01141(objectData.getString("XCN01141"));
			object.setXCN01142(objectData.getString("XCN01142"));
			object.setXCN01143(objectData.getString("XCN01143"));
			object.setXCN01144(objectData.getString("XCN01144"));
			object.setXCN01145(objectData.getString("XCN01145"));
			object.setXCN01146(objectData.getString("XCN01146"));
			object.setXCN01147(objectData.getString("XCN01147"));
			object.setXCN01148(objectData.getString("XCN01148"));
			object.setXCN01149(objectData.getString("XCN01149"));
			object.setXCN01150(objectData.getString("XCN01150"));
			object.setXCN01151(objectData.getString("XCN01151"));
			object.setXCN01152(objectData.getString("XCN01152"));
			object.setXCN01153(objectData.getString("XCN01153"));
			object.setXCN01154(objectData.getString("XCN01154"));
			object.setXCN01155(objectData.getString("XCN01155"));
			object.setXCN01156(objectData.getString("XCN01156"));
			object.setXCN01157(objectData.getString("XCN01157"));
			object.setXCN01158(objectData.getString("XCN01158"));
			object.setXCN01159(objectData.getString("XCN01159"));
			object.setXCN01160(objectData.getString("XCN01160"));
			object.setXCN01161(objectData.getString("XCN01161"));
			object.setXCN01162(objectData.getString("XCN01162"));
			object.setXCN01163(objectData.getString("XCN01163"));
			object.setXCN01164(objectData.getString("XCN01164"));
			object.setXCN01165(objectData.getString("XCN01165"));
			object.setXCN01166(objectData.getString("XCN01166"));
			object.setXCN01167(objectData.getString("XCN01167"));
			object.setXCN01168(objectData.getString("XCN01168"));
			object.setXCN01169(objectData.getString("XCN01169"));
			object.setXCN01170(objectData.getString("XCN01170"));
			object.setXCN01171(objectData.getString("XCN01171"));
			object.setXCN01172(objectData.getString("XCN01172"));
			object.setXCN01173(objectData.getString("XCN01173"));
			object.setXCN01174(objectData.getString("XCN01174"));
			object.setXCN01175(objectData.getString("XCN01175"));
			object.setXCN01176(objectData.getString("XCN01176"));
			object.setXCN01177(objectData.getString("XCN01177"));
			object.setXCN01178(objectData.getString("XCN01178"));
			object.setXCN01179(objectData.getString("XCN01179"));
			object.setXCN01180(objectData.getString("XCN01180"));
			object.setXCN01181(objectData.getString("XCN01181"));
			object.setXCN01182(objectData.getString("XCN01182"));
			object.setXCN01183(objectData.getString("XCN01183"));
			object.setXCN01184(objectData.getString("XCN01184"));
			object.setXCN01185(objectData.getString("XCN01185"));

			object = vrTechnicalSpec_XCNPersistence.update(object);
			JSONObject obj_part1 = null;
			try {
				obj_part1 = BusinessUtil.object2Json_originColumnName(object, VRTechnicalSpec_XCNModelImpl.class,
						StringPool.BLANK);
			} catch (JSONException e) {
			}

			VRTechnicalSpec_XCNPart2 objectPart2 = null;
			objectPart2 = vrTechnicalSpec_XCNPart2Persistence.fetchByPrimaryKey(object.getPrimaryKey());

			objectPart2.setMtCore(objectData.getLong("mtCore"));
			objectPart2.setConvertAssembleId(objectData.getLong("convertAssembleId"));
			objectPart2.setDossierId(objectData.getLong("dossierId"));
			objectPart2.setDossierNo(objectData.getString("dossierNo"));
			objectPart2.setReferenceUid(objectData.getString("referenceUid"));
			objectPart2.setDossierIdCTN(objectData.getString("dossierIdCTN"));
			objectPart2.setDeliverableCode(objectData.getString("deliverableCode"));
			objectPart2.setXCN01186(objectData.getString("XCN01186"));
			objectPart2.setXCN01187(objectData.getString("XCN01187"));
			objectPart2.setXCN01188(objectData.getString("XCN01188"));
			objectPart2.setXCN01189(objectData.getString("XCN01189"));
			objectPart2.setXCN01190(objectData.getString("XCN01190"));
			objectPart2.setXCN01191(objectData.getString("XCN01191"));
			objectPart2.setXCN01192(objectData.getString("XCN01192"));
			objectPart2.setXCN01193(objectData.getString("XCN01193"));
			objectPart2.setXCN01194(objectData.getString("XCN01194"));
			objectPart2.setXCN01195(objectData.getString("XCN01195"));
			objectPart2.setXCN01196(objectData.getString("XCN01196"));
			objectPart2.setXCN01197(objectData.getString("XCN01197"));
			objectPart2.setXCN01198(objectData.getString("XCN01198"));
			objectPart2.setXCN01199(objectData.getString("XCN01199"));
			objectPart2.setXCN01200(objectData.getString("XCN01200"));
			objectPart2.setXCN01201(objectData.getString("XCN01201"));
			objectPart2.setXCN01202(objectData.getString("XCN01202"));
			objectPart2.setXCN01203(objectData.getString("XCN01203"));
			objectPart2.setXCN01204(objectData.getString("XCN01204"));
			objectPart2.setXCN01205(objectData.getString("XCN01205"));
			objectPart2.setXCN01206(objectData.getString("XCN01206"));
			objectPart2.setXCN01207(objectData.getString("XCN01207"));
			objectPart2.setXCN01208(objectData.getString("XCN01208"));
			objectPart2.setXCN01209(objectData.getString("XCN01209"));
			objectPart2.setXCN01210(objectData.getString("XCN01210"));
			objectPart2.setXCN01211(objectData.getString("XCN01211"));
			objectPart2.setXCN01212(objectData.getString("XCN01212"));
			objectPart2.setXCN01213(objectData.getString("XCN01213"));
			objectPart2.setXCN01214(objectData.getString("XCN01214"));
			objectPart2.setXCN01215(objectData.getString("XCN01215"));
			objectPart2.setXCN01216(objectData.getString("XCN01216"));
			objectPart2.setXCN01217(objectData.getString("XCN01217"));
			objectPart2.setXCN01218(objectData.getString("XCN01218"));
			objectPart2.setXCN01219(objectData.getString("XCN01219"));
			objectPart2.setXCN01220(objectData.getString("XCN01220"));
			objectPart2.setXCN01221(objectData.getString("XCN01221"));
			objectPart2.setXCN01222(objectData.getString("XCN01222"));
			objectPart2.setXCN01223(objectData.getString("XCN01223"));
			objectPart2.setXCN01224(objectData.getString("XCN01224"));
			objectPart2.setXCN01225(objectData.getString("XCN01225"));
			objectPart2.setXCN01226(objectData.getString("XCN01226"));
			objectPart2.setXCN01227(objectData.getString("XCN01227"));
			objectPart2.setXCN01228(objectData.getString("XCN01228"));
			objectPart2.setXCN01229(objectData.getString("XCN01229"));
			objectPart2.setXCN01230(objectData.getString("XCN01230"));
			objectPart2.setXCN01231(objectData.getString("XCN01231"));
			objectPart2.setXCN01232(objectData.getString("XCN01232"));
			objectPart2.setXCN01233(objectData.getString("XCN01233"));
			objectPart2.setXCN01234(objectData.getString("XCN01234"));
			objectPart2.setXCN01235(objectData.getString("XCN01235"));
			objectPart2.setXCN01236(objectData.getString("XCN01236"));
			objectPart2.setXCN01237(objectData.getString("XCN01237"));
			objectPart2.setXCN01238(objectData.getString("XCN01238"));
			objectPart2.setXCN01239(objectData.getString("XCN01239"));
			objectPart2.setXCN01240(objectData.getString("XCN01240"));
			objectPart2.setXCN01241(objectData.getString("XCN01241"));
			objectPart2.setXCN01242(objectData.getString("XCN01242"));
			objectPart2.setXCN01243(objectData.getString("XCN01243"));
			objectPart2.setXCN01244(objectData.getString("XCN01244"));
			objectPart2.setXCN01245(objectData.getString("XCN01245"));
			objectPart2.setXCN01246(objectData.getString("XCN01246"));
			objectPart2.setXCN01247(objectData.getString("XCN01247"));
			objectPart2.setXCN01248(objectData.getString("XCN01248"));
			objectPart2.setXCN01249(objectData.getString("XCN01249"));
			objectPart2.setXCN01250(objectData.getString("XCN01250"));
			objectPart2.setXCN01251(objectData.getString("XCN01251"));
			objectPart2.setXCN01252(objectData.getString("XCN01252"));
			objectPart2.setXCN01253(objectData.getString("XCN01253"));
			objectPart2.setXCN01254(objectData.getString("XCN01254"));
			objectPart2.setXCN01255(objectData.getString("XCN01255"));
			objectPart2.setXCN01256(objectData.getString("XCN01256"));
			objectPart2.setXCN01257(objectData.getString("XCN01257"));
			objectPart2.setXCN01258(objectData.getString("XCN01258"));
			objectPart2.setXCN01259(objectData.getString("XCN01259"));
			objectPart2.setXCN01260(objectData.getString("XCN01260"));
			objectPart2.setXCN01261(objectData.getString("XCN01261"));
			objectPart2.setXCN01262(objectData.getString("XCN01262"));
			objectPart2.setXCN01263(objectData.getString("XCN01263"));
			objectPart2.setXCN01264(objectData.getString("XCN01264"));
			objectPart2.setXCN01265(objectData.getString("XCN01265"));
			objectPart2.setXCN01266(objectData.getString("XCN01266"));
			objectPart2.setXCN01267(objectData.getString("XCN01267"));
			objectPart2.setXCN01268(objectData.getString("XCN01268"));
			objectPart2.setXCN01269(objectData.getString("XCN01269"));
			objectPart2.setXCN01270(objectData.getString("XCN01270"));
			objectPart2.setXCN01271(objectData.getString("XCN01271"));
			objectPart2.setXCN01272(objectData.getString("XCN01272"));
			objectPart2.setXCN01273(objectData.getString("XCN01273"));
			objectPart2.setXCN01274(objectData.getString("XCN01274"));
			objectPart2.setXCN01275(objectData.getString("XCN01275"));
			objectPart2.setXCN01276(objectData.getString("XCN01276"));
			objectPart2.setXCN01277(objectData.getString("XCN01277"));
			objectPart2.setXCN01278(objectData.getString("XCN01278"));
			objectPart2.setXCN01279(objectData.getString("XCN01279"));
			objectPart2.setXCN01280(objectData.getString("XCN01280"));
			objectPart2.setXCN01281(objectData.getString("XCN01281"));
			objectPart2.setXCN01282(objectData.getString("XCN01282"));
			objectPart2.setXCN01283(objectData.getString("XCN01283"));
			objectPart2.setXCN01284(objectData.getString("XCN01284"));
			objectPart2.setXCN01285(objectData.getString("XCN01285"));
			objectPart2.setXCN01286(objectData.getString("XCN01286"));
			objectPart2.setXCN01287(objectData.getString("XCN01287"));
			objectPart2.setXCN01288(objectData.getString("XCN01288"));
			objectPart2.setXCN01289(objectData.getString("XCN01289"));
			objectPart2.setXCN01290(objectData.getString("XCN01290"));
			objectPart2.setXCN01291(objectData.getString("XCN01291"));
			objectPart2.setXCN01292(objectData.getString("XCN01292"));
			objectPart2.setXCN01293(objectData.getString("XCN01293"));
			objectPart2.setXCN01294(objectData.getString("XCN01294"));
			objectPart2.setXCN01295(objectData.getString("XCN01295"));
			objectPart2.setXCN01296(objectData.getString("XCN01296"));
			objectPart2.setXCN01297(objectData.getString("XCN01297"));
			objectPart2.setXCN01298(objectData.getString("XCN01298"));
			objectPart2.setXCN01299(objectData.getString("XCN01299"));
			objectPart2.setXCN01300(objectData.getString("XCN01300"));
			objectPart2.setXCN01301(objectData.getString("XCN01301"));
			objectPart2.setXCN01302(objectData.getString("XCN01302"));
			objectPart2.setXCN01303(objectData.getString("XCN01303"));
			objectPart2.setXCN01304(objectData.getString("XCN01304"));
			objectPart2.setXCN01305(objectData.getString("XCN01305"));
			objectPart2.setXCN01306(objectData.getString("XCN01306"));
			objectPart2.setXCN01307(objectData.getString("XCN01307"));
			objectPart2.setXCN01308(objectData.getString("XCN01308"));
			objectPart2.setXCN01309(objectData.getString("XCN01309"));
			objectPart2.setXCN01310(objectData.getString("XCN01310"));
			objectPart2.setXCN01311(objectData.getString("XCN01311"));
			objectPart2.setXCN01312(objectData.getString("XCN01312"));
			objectPart2.setXCN01313(objectData.getString("XCN01313"));
			objectPart2.setXCN01314(objectData.getString("XCN01314"));
			objectPart2.setXCN01315(objectData.getString("XCN01315"));
			objectPart2.setXCN01316(objectData.getString("XCN01316"));
			objectPart2.setXCN01317(objectData.getString("XCN01317"));
			objectPart2.setXCN01318(objectData.getString("XCN01318"));
			objectPart2.setXCN01319(objectData.getString("XCN01319"));
			objectPart2.setXCN01320(objectData.getString("XCN01320"));
			objectPart2.setXCN01321(objectData.getString("XCN01321"));
			objectPart2.setXCN01322(objectData.getString("XCN01322"));
			objectPart2.setXCN01323(objectData.getString("XCN01323"));
			objectPart2.setXCN01324(objectData.getString("XCN01324"));
			objectPart2.setXCN01325(objectData.getString("XCN01325"));
			objectPart2.setXCN01326(objectData.getString("XCN01326"));
			objectPart2.setXCN01327(objectData.getString("XCN01327"));
			objectPart2.setXCN01328(objectData.getString("XCN01328"));
			objectPart2.setXCN01329(objectData.getString("XCN01329"));
			objectPart2.setXCN01330(objectData.getString("XCN01330"));
			objectPart2.setXCN01331(objectData.getString("XCN01331"));
			objectPart2.setXCN01332(objectData.getString("XCN01332"));
			objectPart2.setXCN01333(objectData.getString("XCN01333"));
			objectPart2.setXCN01334(objectData.getString("XCN01334"));
			objectPart2.setXCN01335(objectData.getString("XCN01335"));

			objectPart2 = vrTechnicalSpec_XCNPart2Persistence.update(objectPart2);
			JSONObject obj_part2 = null;
			try {
				obj_part2 = BusinessUtil.object2Json_originColumnName(objectPart2,
						VRTechnicalSpec_XCNPart2ModelImpl.class, StringPool.BLANK);
			} catch (JSONException e) {
			}

			VRTechnicalSpec_XCNPart3 objectPart3 = null;
			objectPart3 = vrTechnicalSpec_XCNPart3Persistence.fetchByPrimaryKey(object.getPrimaryKey());

			objectPart2.setMtCore(objectData.getLong("mtCore"));
			objectPart2.setConvertAssembleId(objectData.getLong("convertAssembleId"));
			objectPart2.setDossierId(objectData.getLong("dossierId"));
			objectPart2.setDossierNo(objectData.getString("dossierNo"));
			objectPart2.setReferenceUid(objectData.getString("referenceUid"));
			objectPart2.setDossierIdCTN(objectData.getString("dossierIdCTN"));
			objectPart2.setDeliverableCode(objectData.getString("deliverableCode"));
			objectPart3.setXCN01336(objectData.getString("XCN01336"));
			objectPart3.setXCN01337(objectData.getString("XCN01337"));
			objectPart3.setXCN01338(objectData.getString("XCN01338"));
			objectPart3.setXCN01339(objectData.getString("XCN01339"));
			objectPart3.setXCN01340(objectData.getString("XCN01340"));
			objectPart3.setXCN01341(objectData.getString("XCN01341"));
			objectPart3.setXCN01342(objectData.getString("XCN01342"));
			objectPart3.setXCN01343(objectData.getString("XCN01343"));
			objectPart3.setXCN01344(objectData.getString("XCN01344"));
			objectPart3.setXCN01345(objectData.getString("XCN01345"));
			objectPart3.setXCN01346(objectData.getString("XCN01346"));
			objectPart3.setXCN01347(objectData.getString("XCN01347"));
			objectPart3.setXCN01348(objectData.getString("XCN01348"));
			objectPart3.setXCN01349(objectData.getString("XCN01349"));
			objectPart3.setXCN01350(objectData.getString("XCN01350"));
			objectPart3.setXCN01351(objectData.getString("XCN01351"));
			objectPart3.setXCN01352(objectData.getString("XCN01352"));
			objectPart3.setXCN01353(objectData.getString("XCN01353"));
			objectPart3.setXCN01354(objectData.getString("XCN01354"));
			objectPart3.setXCN01355(objectData.getString("XCN01355"));
			objectPart3.setXCN01356(objectData.getString("XCN01356"));
			objectPart3.setXCN01357(objectData.getString("XCN01357"));
			objectPart3.setXCN01358(objectData.getString("XCN01358"));
			objectPart3.setXCN01359(objectData.getString("XCN01359"));
			objectPart3.setXCN01360(objectData.getString("XCN01360"));
			objectPart3.setXCN01361(objectData.getString("XCN01361"));
			objectPart3.setXCN01362(objectData.getString("XCN01362"));
			objectPart3.setXCN01363(objectData.getString("XCN01363"));
			objectPart3.setXCN01364(objectData.getString("XCN01364"));
			objectPart3.setXCN01365(objectData.getString("XCN01365"));
			objectPart3.setXCN01366(objectData.getString("XCN01366"));
			objectPart3.setXCN01367(objectData.getString("XCN01367"));
			objectPart3.setXCN01368(objectData.getString("XCN01368"));
			objectPart3.setXCN01369(objectData.getString("XCN01369"));
			objectPart3.setXCN01370(objectData.getString("XCN01370"));
			objectPart3.setXCN01371(objectData.getString("XCN01371"));
			objectPart3.setXCN01372(objectData.getString("XCN01372"));
			objectPart3.setXCN01373(objectData.getString("XCN01373"));
			objectPart3.setXCN01374(objectData.getString("XCN01374"));
			objectPart3.setXCN01375(objectData.getString("XCN01375"));
			objectPart3.setXCN01376(objectData.getString("XCN01376"));
			objectPart3.setXCN01377(objectData.getString("XCN01377"));
			objectPart3.setXCN01378(objectData.getString("XCN01378"));
			objectPart3.setXCN01379(objectData.getString("XCN01379"));
			objectPart3.setXCN01380(objectData.getString("XCN01380"));
			objectPart3.setXCN01381(objectData.getString("XCN01381"));
			objectPart3.setXCN01382(objectData.getString("XCN01382"));
			objectPart3.setXCN01383(objectData.getString("XCN01383"));
			objectPart3.setXCN01384(objectData.getString("XCN01384"));
			objectPart3.setXCN01385(objectData.getString("XCN01385"));
			objectPart3.setXCN01386(objectData.getString("XCN01386"));
			objectPart3.setXCN01387(objectData.getString("XCN01387"));
			objectPart3.setXCN01388(objectData.getString("XCN01388"));
			objectPart3.setXCN01389(objectData.getString("XCN01389"));
			objectPart3.setXCN01390(objectData.getString("XCN01390"));
			objectPart3.setXCN01391(objectData.getString("XCN01391"));
			objectPart3.setXCN01392(objectData.getString("XCN01392"));
			objectPart3.setXCN01393(objectData.getString("XCN01393"));
			objectPart3.setXCN01394(objectData.getString("XCN01394"));
			objectPart3.setXCN01395(objectData.getString("XCN01395"));
			objectPart3.setXCN01396(objectData.getString("XCN01396"));
			objectPart3.setXCN01397(objectData.getString("XCN01397"));
			objectPart3.setXCN01398(objectData.getString("XCN01398"));
			objectPart3.setXCN01399(objectData.getString("XCN01399"));
			objectPart3.setXCN01400(objectData.getString("XCN01400"));
			objectPart3.setXCN01401(objectData.getString("XCN01401"));
			objectPart3.setXCN01402(objectData.getString("XCN01402"));
			objectPart3.setXCN01403(objectData.getString("XCN01403"));
			objectPart3.setXCN01404(objectData.getString("XCN01404"));
			objectPart3.setXCN01405(objectData.getString("XCN01405"));
			objectPart3.setXCN01406(objectData.getString("XCN01406"));
			objectPart3.setXCN01407(objectData.getString("XCN01407"));
			objectPart3.setXCN01408(objectData.getString("XCN01408"));
			objectPart3.setXCN01409(objectData.getString("XCN01409"));
			objectPart3.setXCN01410(objectData.getString("XCN01410"));
			objectPart3.setXCN01411(objectData.getString("XCN01411"));
			objectPart3.setXCN01412(objectData.getString("XCN01412"));
			objectPart3.setXCN01413(objectData.getString("XCN01413"));
			objectPart3.setXCN01414(objectData.getString("XCN01414"));
			objectPart3.setXCN01415(objectData.getString("XCN01415"));
			objectPart3.setXCN01416(objectData.getString("XCN01416"));
			objectPart3.setXCN01417(objectData.getString("XCN01417"));
			objectPart3.setXCN01418(objectData.getString("XCN01418"));
			objectPart3.setXCN01419(objectData.getString("XCN01419"));
			objectPart3.setXCN01420(objectData.getString("XCN01420"));
			objectPart3.setXCN01421(objectData.getString("XCN01421"));
			objectPart3.setXCN01422(objectData.getString("XCN01422"));
			objectPart3.setXCN01423(objectData.getString("XCN01423"));
			objectPart3.setXCN01424(objectData.getString("XCN01424"));
			objectPart3.setXCN01425(objectData.getString("XCN01425"));
			objectPart3.setXCN01426(objectData.getString("XCN01426"));
			objectPart3.setXCN01427(objectData.getString("XCN01427"));
			objectPart3.setXCN01428(objectData.getString("XCN01428"));
			objectPart3.setXCN01429(objectData.getString("XCN01429"));
			objectPart3.setXCN01430(objectData.getString("XCN01430"));
			objectPart3.setXCN01431(objectData.getString("XCN01431"));
			objectPart3.setXCN01432(objectData.getString("XCN01432"));
			objectPart3.setXCN01433(objectData.getString("XCN01433"));
			objectPart3.setXCN01434(objectData.getString("XCN01434"));
			objectPart3.setXCN01435(objectData.getString("XCN01435"));
			objectPart3.setXCN01436(objectData.getString("XCN01436"));
			objectPart3.setXCN01437(objectData.getString("XCN01437"));
			objectPart3.setBBCNCLKLXCN001(objectData.getString("BBCNCLKLXCN001"));
			objectPart3.setBBCNCLKLXCN002(objectData.getString("BBCNCLKLXCN002"));
			objectPart3.setBBCNCLKLXCN003(objectData.getString("BBCNCLKLXCN003"));
			objectPart3.setBBCNCLKLXCN004(objectData.getString("BBCNCLKLXCN004"));
			objectPart3.setBBCNCLKLXCN005(objectData.getString("BBCNCLKLXCN005"));
			objectPart3.setBBCNCLKLXCN006(objectData.getString("BBCNCLKLXCN006"));
			objectPart3.setBBCNCLKLXCN012(objectData.getString("BBCNCLKLXCN012"));
			objectPart3.setBBCNCLKLXCN013(objectData.getString("BBCNCLKLXCN013"));
			objectPart3.setBBCNCLKLXCN014(objectData.getString("BBCNCLKLXCN014"));
			objectPart3.setBBCNCLKLXCN015(objectData.getString("BBCNCLKLXCN015"));
			objectPart3.setBBCNCLKLXCN016(objectData.getString("BBCNCLKLXCN016"));
			objectPart3.setBBCNCLKLXCN017(objectData.getString("BBCNCLKLXCN017"));
			objectPart3.setBBCNCLKLXCN018(objectData.getString("BBCNCLKLXCN018"));
			objectPart3.setBBCNCLKLXCN019(objectData.getString("BBCNCLKLXCN019"));
			objectPart3.setBBCNCLKLXCN020(objectData.getString("BBCNCLKLXCN020"));
			objectPart3.setBBCNCLKLXCN021(objectData.getString("BBCNCLKLXCN021"));
			objectPart3.setBBCNCLKLXCN022(objectData.getString("BBCNCLKLXCN022"));
			objectPart3.setBBCNCLKLXCN026(objectData.getString("BBCNCLKLXCN026"));
			objectPart3.setBBCNCLKLXCN027(objectData.getString("BBCNCLKLXCN027"));
			objectPart3.setBBCNCLKLXCN028(objectData.getString("BBCNCLKLXCN028"));
			objectPart3.setBBCNCLKLXCN033(objectData.getString("BBCNCLKLXCN033"));
			objectPart3.setBBCNCLKLXCN034(objectData.getString("BBCNCLKLXCN034"));
			objectPart3.setBBCNCLKLXCN037(objectData.getString("BBCNCLKLXCN037"));
			objectPart3.setBBCNCLKLXCN038(objectData.getString("BBCNCLKLXCN038"));
			objectPart3.setBBCNCLKLXCN039(objectData.getString("BBCNCLKLXCN039"));
			objectPart3.setBBCNCLKLXCN040(objectData.getString("BBCNCLKLXCN040"));
			objectPart3.setBBCNCLKLXCN041(objectData.getString("BBCNCLKLXCN041"));
			objectPart3.setBBCNCLKLXCN042(objectData.getString("BBCNCLKLXCN042"));
			objectPart3.setBBCNCLKLXCN043(objectData.getString("BBCNCLKLXCN043"));
			objectPart3.setBBCNCLKLXCN044(objectData.getString("BBCNCLKLXCN044"));
			objectPart3.setBBCNCLKLXCN045(objectData.getString("BBCNCLKLXCN045"));
			objectPart3.setBBCNCLKLXCN046(objectData.getString("BBCNCLKLXCN046"));
			objectPart3.setBBCNCLKLXCN047(objectData.getString("BBCNCLKLXCN047"));
			objectPart3.setBBCNCLKLXCN053(objectData.getString("BBCNCLKLXCN053"));
			objectPart3.setBBCNCLKLXCN054(objectData.getString("BBCNCLKLXCN054"));
			objectPart3.setBBKTSPMXCN001(objectData.getString("BBKTSPMXCN001"));
			objectPart3.setBBKTSPMXCN002(objectData.getString("BBKTSPMXCN002"));
			objectPart3.setBBKTSPMXCN003(objectData.getString("BBKTSPMXCN003"));
			objectPart3.setBBKTSPMXCN004(objectData.getString("BBKTSPMXCN004"));
			objectPart3.setBBKTSPMXCN005(objectData.getString("BBKTSPMXCN005"));
			objectPart3.setBBKTSPMXCN006(objectData.getString("BBKTSPMXCN006"));
			objectPart3.setBBKTSPMXCN007(objectData.getString("BBKTSPMXCN007"));
			objectPart3.setBBKTSPMXCN008(objectData.getString("BBKTSPMXCN008"));
			objectPart3.setBBKTSPMXCN009(objectData.getString("BBKTSPMXCN009"));
			objectPart3.setBBKTSPMXCN012(objectData.getString("BBKTSPMXCN012"));
			objectPart3.setBBKTSPMXCN013(objectData.getString("BBKTSPMXCN013"));
			objectPart3.setBBKTSPMXCN014(objectData.getString("BBKTSPMXCN014"));
			objectPart3.setBBKTSPMXCN015(objectData.getString("BBKTSPMXCN015"));
			objectPart3.setBBKTSPMXCN016(objectData.getString("BBKTSPMXCN016"));
			objectPart3.setBBKTSPMXCN017(objectData.getString("BBKTSPMXCN017"));
			objectPart3.setBBKTSPMXCN018(objectData.getString("BBKTSPMXCN018"));
			objectPart3.setBBKTSPMXCN019(objectData.getString("BBKTSPMXCN019"));
			objectPart3.setBBKTSPMXCN020(objectData.getString("BBKTSPMXCN020"));
			objectPart3.setBBKTSPMXCN021(objectData.getString("BBKTSPMXCN021"));
			objectPart3.setBBKTSPMXCN022(objectData.getString("BBKTSPMXCN022"));
			objectPart3.setBBKTSPMXCN023(objectData.getString("BBKTSPMXCN023"));
			objectPart3.setBBKTSPMXCN024(objectData.getString("BBKTSPMXCN024"));

			objectPart3 = vrTechnicalSpec_XCNPart3Persistence.update(objectPart3);
			JSONObject obj_part3 = null;
			try {
				obj_part3 = BusinessUtil.object2Json_originColumnName(objectPart3,
						VRTechnicalSpec_XCNPart3ModelImpl.class, StringPool.BLANK);
			} catch (JSONException e) {
			}

			JSONObject obj = mergeJSON(obj_part1, obj_part2, obj_part3);
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

	private Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XCNLocalServiceImpl.class);
}