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

import com.fds.vr.business.model.VRTechnicalSpec_XCG;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart1;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart2;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart3;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart4;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart5;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart6;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGModelImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart2ModelImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart3ModelImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart4ModelImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart5ModelImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart6ModelImpl;
import com.fds.vr.business.service.base.VRTechnicalSpec_XCGLocalServiceBaseImpl;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
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
 * The implementation of the vr technical spec_xcg local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRTechnicalSpec_XCGLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRTechnicalSpec_XCGLocalServiceUtil
 */
@ProviderType
public class VRTechnicalSpec_XCGLocalServiceImpl extends VRTechnicalSpec_XCGLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRTechnicalSpec_XCGLocalServiceUtil} to access
	 * the vr technical spec_xcg local service.
	 */
	public List<VRTechnicalSpec_XCG> findByVehicleCertificateId(long vehiclerCertificateId, int start, int end) {
		return vrTechnicalSpec_XCGPersistence.findByvehicleTypeCertificateId(vehiclerCertificateId, start, end);
	}

	public List<VRTechnicalSpec_XCG> findByDossierId(long dossierId, int start, int end) {
		return vrTechnicalSpec_XCGPersistence.findBy_DossierId(dossierId, start, end);
	}

	public List<VRTechnicalSpec_XCG> findByConvertAssembleId(long convertAssembleId) throws SystemException {
		try {
			return vrTechnicalSpec_XCGPersistence.findByConvertAssembleId(convertAssembleId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCG>();

	}

	public List<VRTechnicalSpec_XCG> findByReferenceUid(String referenceUid) throws SystemException {
		try {
			return vrTechnicalSpec_XCGPersistence.findByReferenceUid(referenceUid);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCG>();

	}

	public List<VRTechnicalSpec_XCG> findByDossierNo(String dossierNo, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_XCGPersistence.findByDossierNo(dossierNo, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCG>();

	}

	public List<VRTechnicalSpec_XCG> findByDossierId(long dossierId, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_XCGPersistence.findByDossierId(dossierId, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCG>();

	}

	public List<VRTechnicalSpec_XCG> findByDossierIdCTN(String dossierIdCTN) throws SystemException {
		try {
			return vrTechnicalSpec_XCGPersistence.findByDossierIdCTN(dossierIdCTN);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCG>();

	}

	public List<VRTechnicalSpec_XCG> findByDeliverableCode(String deliverableCode) throws SystemException {
		try {
			return vrTechnicalSpec_XCGPersistence.findByDeliverableCode(deliverableCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XCG>();

	}

	public JSONArray adminProcessData(JSONArray arrayData, long dossierId, long mtCore, long vehicleTypeCertificateId) {
		JSONArray array = JSONFactoryUtil.createJSONArray();

		try {
			vrTechnicalSpec_XCGPersistence.removeByDossierId(dossierId, mtCore);
			vrTechnicalSpec_XCGPart1Persistence.removeByDossierId(dossierId, mtCore);
			vrTechnicalSpec_XCGPart2Persistence.removeByDossierId(dossierId, mtCore);
			vrTechnicalSpec_XCGPart3Persistence.removeByDossierId(dossierId, mtCore);
			vrTechnicalSpec_XCGPart4Persistence.removeByDossierId(dossierId, mtCore);
			vrTechnicalSpec_XCGPart5Persistence.removeByDossierId(dossierId, mtCore);
			vrTechnicalSpec_XCGPart6Persistence.removeByDossierId(dossierId, mtCore);

			Date now = new Date();
			for (int i = 0; i < arrayData.length(); i++) {
				JSONObject objectData = arrayData.getJSONObject(i);
				VRTechnicalSpec_XCG object = null;
				long id = counterLocalService.increment(VRTechnicalSpec_XCG.class.getName());
				object = vrTechnicalSpec_XCGPersistence.create(id);

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
				object.setXCG01070(objectData.getString("XCG01070"));
				object.setXCG01072(objectData.getString("XCG01072"));
				object.setXCG01083(objectData.getString("XCG01083"));
				object.setXCG01084(objectData.getString("XCG01084"));
				object.setXCG01085(objectData.getString("XCG01085"));
				object.setXCG01086(objectData.getString("XCG01086"));
				object.setXCG01087(objectData.getString("XCG01087"));
				object.setXCG01088(objectData.getString("XCG01088"));
				object.setXCG01090(objectData.getString("XCG01090"));
				object.setXCG01091(objectData.getString("XCG01091"));
				object.setXCG01092(objectData.getString("XCG01092"));
				object.setXCG01123(objectData.getString("XCG01123"));
				object.setXCG01124(objectData.getString("XCG01124"));
				object.setXCG01125(objectData.getString("XCG01125"));
				object.setXCG01156(objectData.getString("XCG01156"));
				object.setXCG01157(objectData.getString("XCG01157"));
				object.setXCG01163(objectData.getString("XCG01163"));
				object.setXCG01169(objectData.getString("XCG01169"));
				object.setXCG01170(objectData.getString("XCG01170"));
				object.setXCG01171(objectData.getString("XCG01171"));
				object.setXCG01172(objectData.getString("XCG01172"));
				object.setXCG01173(objectData.getString("XCG01173"));
				object.setXCG01182(objectData.getString("XCG01182"));
				object.setXCG01183(objectData.getString("XCG01183"));
				object.setXCG01192(objectData.getString("XCG01192"));

				object = vrTechnicalSpec_XCGPersistence.update(object);
				JSONObject obj_part0 = BusinessUtil.object2Json_originColumnName(object,
						VRTechnicalSpec_XCGModelImpl.class, StringPool.BLANK);

				VRTechnicalSpec_XCGPart1 objectPart1 = null;
				objectPart1 = vrTechnicalSpec_XCGPart1Persistence.findByPrimaryKey(object.getPrimaryKey());
				objectPart1.setMtCore(objectData.getLong("mtCore"));
				objectPart1.setConvertAssembleId(objectData.getLong("convertAssembleId"));
				objectPart1.setDossierId(objectData.getLong("dossierId"));
				objectPart1.setDossierNo(objectData.getString("dossierNo"));
				objectPart1.setReferenceUid(objectData.getString("referenceUid"));
				objectPart1.setDossierIdCTN(objectData.getString("dossierIdCTN"));
				objectPart1.setDeliverableCode(objectData.getString("deliverableCode"));
				objectPart1.setVehicleTypeCertificateId(objectData.getLong("vehicleTypeCertificateId"));
				objectPart1.setLoai_dong_co(objectData.getString("loai_dong_co"));
				objectPart1.setXCG01001(objectData.getString("XCG01001"));
				objectPart1.setXCG01002(objectData.getString("XCG01002"));
				objectPart1.setXCG01003(objectData.getString("XCG01003"));
				objectPart1.setXCG01004(objectData.getString("XCG01004"));
				objectPart1.setXCG01005(objectData.getString("XCG01005"));
				objectPart1.setXCG01006(objectData.getString("XCG01006"));
				objectPart1.setXCG01007(objectData.getString("XCG01007"));
				objectPart1.setXCG01008(objectData.getString("XCG01008"));
				objectPart1.setXCG01009(objectData.getString("XCG01009"));
				objectPart1.setXCG01010(objectData.getString("XCG01010"));
				objectPart1.setXCG01011(objectData.getString("XCG01011"));
				objectPart1.setXCG01012(objectData.getString("XCG01012"));
				objectPart1.setXCG01013(objectData.getString("XCG01013"));
				objectPart1.setXCG01014(objectData.getString("XCG01014"));
				objectPart1.setXCG01016(objectData.getString("XCG01016"));
				objectPart1.setXCG01017(objectData.getString("XCG01017"));
				objectPart1.setXCG01019(objectData.getString("XCG01019"));
				objectPart1.setXCG01020(objectData.getString("XCG01020"));
				objectPart1.setXCG01021(objectData.getString("XCG01021"));
				objectPart1.setXCG01022(objectData.getString("XCG01022"));
				objectPart1.setXCG01024(objectData.getString("XCG01024"));
				objectPart1.setXCG01025(objectData.getString("XCG01025"));
				objectPart1.setXCG01026(objectData.getString("XCG01026"));
				objectPart1.setXCG01027(objectData.getString("XCG01027"));
				objectPart1.setXCG01028(objectData.getString("XCG01028"));
				objectPart1.setXCG01030(objectData.getString("XCG01030"));
				objectPart1.setXCG01031(objectData.getString("XCG01031"));
				objectPart1.setXCG01032(objectData.getString("XCG01032"));
				objectPart1.setXCG01033(objectData.getString("XCG01033"));
				objectPart1.setXCG01034(objectData.getString("XCG01034"));
				objectPart1.setXCG01035(objectData.getString("XCG01035"));
				objectPart1.setXCG01036(objectData.getString("XCG01036"));
				objectPart1.setXCG01037(objectData.getString("XCG01037"));
				objectPart1.setXCG01038(objectData.getString("XCG01038"));
				objectPart1.setXCG01039(objectData.getString("XCG01039"));
				objectPart1.setXCG01040(objectData.getString("XCG01040"));
				objectPart1.setXCG01041(objectData.getString("XCG01041"));
				objectPart1.setXCG01042(objectData.getString("XCG01042"));
				objectPart1.setXCG01043(objectData.getString("XCG01043"));
				objectPart1.setXCG01044(objectData.getString("XCG01044"));
				objectPart1.setXCG01045(objectData.getString("XCG01045"));
				objectPart1.setXCG01046(objectData.getString("XCG01046"));
				objectPart1.setXCG01047(objectData.getString("XCG01047"));
				objectPart1.setXCG01049(objectData.getString("XCG01049"));
				objectPart1.setXCG01050(objectData.getString("XCG01050"));
				objectPart1.setXCG01051(objectData.getString("XCG01051"));
				objectPart1.setXCG01052(objectData.getString("XCG01052"));
				objectPart1.setXCG01053(objectData.getString("XCG01053"));
				objectPart1.setXCG01054(objectData.getString("XCG01054"));
				objectPart1.setXCG01055(objectData.getString("XCG01055"));
				objectPart1.setXCG01056(objectData.getString("XCG01056"));
				objectPart1.setXCG01057(objectData.getString("XCG01057"));
				objectPart1.setXCG01058(objectData.getString("XCG01058"));
				objectPart1.setXCG01059(objectData.getString("XCG01059"));
				objectPart1.setXCG01060(objectData.getString("XCG01060"));
				objectPart1.setXCG01062(objectData.getString("XCG01062"));
				objectPart1.setXCG01063(objectData.getString("XCG01063"));
				objectPart1.setXCG01064(objectData.getString("XCG01064"));
				objectPart1.setXCG01065(objectData.getString("XCG01065"));
				objectPart1.setXCG01066(objectData.getString("XCG01066"));
				objectPart1.setXCG01067(objectData.getString("XCG01067"));
				objectPart1.setXCG01068(objectData.getString("XCG01068"));
				objectPart1.setXCG01069(objectData.getString("XCG01069"));
				objectPart1.setXCG01070(objectData.getString("XCG01070"));
				objectPart1.setXCG01072(objectData.getString("XCG01072"));
				objectPart1.setXCG01073(objectData.getString("XCG01073"));
				objectPart1.setXCG01074(objectData.getString("XCG01074"));
				objectPart1.setXCG01075(objectData.getString("XCG01075"));
				objectPart1.setXCG01076(objectData.getString("XCG01076"));
				objectPart1.setXCG01077(objectData.getString("XCG01077"));
				objectPart1.setXCG01078(objectData.getString("XCG01078"));
				objectPart1.setXCG01079(objectData.getString("XCG01079"));
				objectPart1.setXCG01080(objectData.getString("XCG01080"));
				objectPart1.setXCG01081(objectData.getString("XCG01081"));
				objectPart1.setXCG01082(objectData.getString("XCG01082"));
				objectPart1.setXCG01083(objectData.getString("XCG01083"));
				objectPart1.setXCG01084(objectData.getString("XCG01084"));
				objectPart1.setXCG01085(objectData.getString("XCG01085"));
				objectPart1.setXCG01086(objectData.getString("XCG01086"));
				objectPart1.setXCG01087(objectData.getString("XCG01087"));
				objectPart1.setXCG01088(objectData.getString("XCG01088"));
				objectPart1.setXCG01089(objectData.getString("XCG01089"));
				objectPart1.setXCG01090(objectData.getString("XCG01090"));
				objectPart1.setXCG01091(objectData.getString("XCG01091"));
				objectPart1.setXCG01092(objectData.getString("XCG01092"));
				objectPart1.setXCG01093(objectData.getString("XCG01093"));
				objectPart1.setXCG01094(objectData.getString("XCG01094"));
				objectPart1.setXCG01095(objectData.getString("XCG01095"));
				objectPart1.setXCG01096(objectData.getString("XCG01096"));
				objectPart1.setXCG01097(objectData.getString("XCG01097"));
				objectPart1.setXCG01098(objectData.getString("XCG01098"));
				objectPart1.setXCG01099(objectData.getString("XCG01099"));
				objectPart1.setXCG01100(objectData.getString("XCG01100"));
				objectPart1.setXCG01101(objectData.getString("XCG01101"));
				objectPart1.setXCG01102(objectData.getString("XCG01102"));
				objectPart1.setXCG01103(objectData.getString("XCG01103"));
				objectPart1.setXCG01104(objectData.getString("XCG01104"));
				objectPart1.setXCG01105(objectData.getString("XCG01105"));
				objectPart1.setXCG01106(objectData.getString("XCG01106"));
				objectPart1.setXCG01107(objectData.getString("XCG01107"));
				objectPart1.setXCG01108(objectData.getString("XCG01108"));
				objectPart1.setXCG01109(objectData.getString("XCG01109"));
				objectPart1.setXCG01110(objectData.getString("XCG01110"));
				objectPart1.setXCG01111(objectData.getString("XCG01111"));
				objectPart1.setXCG01112(objectData.getString("XCG01112"));
				objectPart1.setXCG01113(objectData.getString("XCG01113"));
				objectPart1.setXCG01114(objectData.getString("XCG01114"));
				objectPart1.setXCG01115(objectData.getString("XCG01115"));
				objectPart1.setXCG01116(objectData.getString("XCG01116"));
				objectPart1.setXCG01117(objectData.getString("XCG01117"));
				objectPart1.setXCG01118(objectData.getString("XCG01118"));
				objectPart1.setXCG01119(objectData.getString("XCG01119"));
				objectPart1.setXCG01120(objectData.getString("XCG01120"));
				objectPart1.setXCG01121(objectData.getString("XCG01121"));
				objectPart1.setXCG01122(objectData.getString("XCG01122"));
				objectPart1.setXCG01123(objectData.getString("XCG01123"));
				objectPart1.setXCG01124(objectData.getString("XCG01124"));
				objectPart1.setXCG01125(objectData.getString("XCG01125"));
				objectPart1.setXCG01126(objectData.getString("XCG01126"));
				objectPart1.setXCG01127(objectData.getString("XCG01127"));
				objectPart1.setXCG01128(objectData.getString("XCG01128"));
				objectPart1.setXCG01129(objectData.getString("XCG01129"));
				objectPart1.setXCG01130(objectData.getString("XCG01130"));
				objectPart1.setXCG01131(objectData.getString("XCG01131"));
				objectPart1.setXCG01132(objectData.getString("XCG01132"));
				objectPart1.setXCG01133(objectData.getString("XCG01133"));
				objectPart1.setXCG01134(objectData.getString("XCG01134"));
				objectPart1.setXCG01135(objectData.getString("XCG01135"));
				objectPart1.setXCG01136(objectData.getString("XCG01136"));
				objectPart1.setXCG01137(objectData.getString("XCG01137"));
				objectPart1.setXCG01138(objectData.getString("XCG01138"));
				objectPart1.setXCG01139(objectData.getString("XCG01139"));
				objectPart1.setXCG01140(objectData.getString("XCG01140"));
				objectPart1.setXCG01141(objectData.getString("XCG01141"));
				objectPart1.setXCG01142(objectData.getString("XCG01142"));
				objectPart1.setXCG01143(objectData.getString("XCG01143"));
				objectPart1.setXCG01144(objectData.getString("XCG01144"));
				objectPart1.setXCG01145(objectData.getString("XCG01145"));
				objectPart1.setXCG01146(objectData.getString("XCG01146"));
				objectPart1.setXCG01147(objectData.getString("XCG01147"));
				objectPart1.setXCG01148(objectData.getString("XCG01148"));
				objectPart1.setXCG01149(objectData.getString("XCG01149"));
				objectPart1.setXCG01150(objectData.getString("XCG01150"));
				objectPart1.setXCG01151(objectData.getString("XCG01151"));
				objectPart1.setXCG01152(objectData.getString("XCG01152"));
				objectPart1.setXCG01153(objectData.getString("XCG01153"));
				objectPart1.setXCG01154(objectData.getString("XCG01154"));
				objectPart1.setXCG01155(objectData.getString("XCG01155"));
				objectPart1.setXCG01156(objectData.getString("XCG01156"));
				objectPart1.setXCG01157(objectData.getString("XCG01157"));
				objectPart1.setXCG01158(objectData.getString("XCG01158"));
				objectPart1.setXCG01159(objectData.getString("XCG01159"));
				objectPart1.setXCG01160(objectData.getString("XCG01160"));
				objectPart1.setXCG01161(objectData.getString("XCG01161"));
				objectPart1.setXCG01162(objectData.getString("XCG01162"));

				objectPart1 = vrTechnicalSpec_XCGPart1Persistence.update(objectPart1);
				JSONObject obj_part1 = BusinessUtil.object2Json_originColumnName(objectPart1,
						VRTechnicalSpec_XCGPart2ModelImpl.class, StringPool.BLANK);

				VRTechnicalSpec_XCGPart2 objectPart2 = null;
				objectPart2 = vrTechnicalSpec_XCGPart2Persistence.findByPrimaryKey(object.getPrimaryKey());

				objectPart2.setModifyDate(now);
				objectPart2.setSyncDate(now);
				objectPart2.setMtCore(objectData.getLong("mtCore"));
				objectPart2.setConvertAssembleId(objectData.getLong("convertAssembleId"));
				objectPart2.setDossierId(objectData.getLong("dossierId"));
				objectPart2.setDossierNo(objectData.getString("dossierNo"));
				objectPart2.setReferenceUid(objectData.getString("referenceUid"));
				objectPart2.setDossierIdCTN(objectData.getString("dossierIdCTN"));
				objectPart2.setDeliverableCode(objectData.getString("deliverableCode"));
				objectPart2.setXCG01164(objectData.getString("XCG01164"));
				objectPart2.setXCG01165(objectData.getString("XCG01165"));
				objectPart2.setXCG01166(objectData.getString("XCG01166"));
				objectPart2.setXCG01167(objectData.getString("XCG01167"));
				objectPart2.setXCG01174(objectData.getString("XCG01174"));
				objectPart2.setXCG01175(objectData.getString("XCG01175"));
				objectPart2.setXCG01176(objectData.getString("XCG01176"));
				objectPart2.setXCG01177(objectData.getString("XCG01177"));
				objectPart2.setXCG01178(objectData.getString("XCG01178"));
				objectPart2.setXCG01179(objectData.getString("XCG01179"));
				objectPart2.setXCG01180(objectData.getString("XCG01180"));
				objectPart2.setXCG01181(objectData.getString("XCG01181"));
				objectPart2.setXCG01184(objectData.getString("XCG01184"));
				objectPart2.setXCG01185(objectData.getString("XCG01185"));
				objectPart2.setXCG01186(objectData.getString("XCG01186"));
				objectPart2.setXCG01187(objectData.getString("XCG01187"));
				objectPart2.setXCG01188(objectData.getString("XCG01188"));
				objectPart2.setXCG01189(objectData.getString("XCG01189"));
				objectPart2.setXCG01190(objectData.getString("XCG01190"));
				objectPart2.setXCG01191(objectData.getString("XCG01191"));
				objectPart2.setXCG01193(objectData.getString("XCG01193"));
				objectPart2.setXCG01194(objectData.getString("XCG01194"));
				objectPart2.setXCG01195(objectData.getString("XCG01195"));
				objectPart2.setXCG01196(objectData.getString("XCG01196"));
				objectPart2.setXCG01197(objectData.getString("XCG01197"));
				objectPart2.setXCG01198(objectData.getString("XCG01198"));
				objectPart2.setXCG01199(objectData.getString("XCG01199"));
				objectPart2.setXCG01200(objectData.getString("XCG01200"));
				objectPart2.setXCG01202(objectData.getString("XCG01202"));
				objectPart2.setXCG01203(objectData.getString("XCG01203"));
				objectPart2.setXCG01204(objectData.getString("XCG01204"));
				objectPart2.setXCG01205(objectData.getString("XCG01205"));
				objectPart2.setXCG01206(objectData.getString("XCG01206"));
				objectPart2.setXCG01207(objectData.getString("XCG01207"));
				objectPart2.setXCG01208(objectData.getString("XCG01208"));
				objectPart2.setXCG01209(objectData.getString("XCG01209"));
				objectPart2.setXCG01210(objectData.getString("XCG01210"));
				objectPart2.setXCG01212(objectData.getString("XCG01212"));
				objectPart2.setXCG01213(objectData.getString("XCG01213"));
				objectPart2.setXCG01214(objectData.getString("XCG01214"));
				objectPart2.setXCG01215(objectData.getString("XCG01215"));
				objectPart2.setXCG01216(objectData.getString("XCG01216"));
				objectPart2.setXCG01217(objectData.getString("XCG01217"));
				objectPart2.setXCG01218(objectData.getString("XCG01218"));
				objectPart2.setXCG01219(objectData.getString("XCG01219"));
				objectPart2.setXCG01220(objectData.getString("XCG01220"));
				objectPart2.setXCG01221(objectData.getString("XCG01221"));
				objectPart2.setXCG01222(objectData.getString("XCG01222"));
				objectPart2.setXCG01223(objectData.getString("XCG01223"));
				objectPart2.setXCG01224(objectData.getString("XCG01224"));
				objectPart2.setXCG01225(objectData.getString("XCG01225"));
				objectPart2.setXCG01226(objectData.getString("XCG01226"));
				objectPart2.setXCG01228(objectData.getString("XCG01228"));
				objectPart2.setXCG01230(objectData.getString("XCG01230"));
				objectPart2.setXCG01231(objectData.getString("XCG01231"));
				objectPart2.setXCG01232(objectData.getString("XCG01232"));
				objectPart2.setXCG01234(objectData.getString("XCG01234"));
				objectPart2.setXCG01236(objectData.getString("XCG01236"));
				objectPart2.setXCG01237(objectData.getString("XCG01237"));
				objectPart2.setXCG01229(objectData.getString("XCG01229"));
				objectPart2.setXCG01238(objectData.getString("XCG01238"));
				objectPart2.setXCG01239(objectData.getString("XCG01239"));
				objectPart2.setXCG01240(objectData.getString("XCG01240"));
				objectPart2.setXCG01241(objectData.getString("XCG01241"));
				objectPart2.setXCG01242(objectData.getString("XCG01242"));
				objectPart2.setXCG01243(objectData.getString("XCG01243"));
				objectPart2.setXCG01235(objectData.getString("XCG01235"));
				objectPart2.setXCG01244(objectData.getString("XCG01244"));
				objectPart2.setXCG01245(objectData.getString("XCG01245"));
				objectPart2.setXCG01246(objectData.getString("XCG01246"));
				objectPart2.setXCG01247(objectData.getString("XCG01247"));
				objectPart2.setXCG01248(objectData.getString("XCG01248"));
				objectPart2.setXCG01249(objectData.getString("XCG01249"));
				objectPart2.setXCG11248(objectData.getString("XCG11248"));
				objectPart2.setXCG11249(objectData.getString("XCG11249"));
				objectPart2.setXCG01250(objectData.getString("XCG01250"));
				objectPart2.setXCG01251(objectData.getString("XCG01251"));
				objectPart2.setXCG01252(objectData.getString("XCG01252"));
				objectPart2.setXCG01253(objectData.getString("XCG01253"));
				objectPart2.setXCG01255(objectData.getString("XCG01255"));
				objectPart2.setXCG01256(objectData.getString("XCG01256"));
				objectPart2.setXCG01257(objectData.getString("XCG01257"));
				objectPart2.setXCG01258(objectData.getString("XCG01258"));
				objectPart2.setXCG01259(objectData.getString("XCG01259"));
				objectPart2.setXCG01260(objectData.getString("XCG01260"));
				objectPart2.setXCG01261(objectData.getString("XCG01261"));
				objectPart2.setXCG01262(objectData.getString("XCG01262"));
				objectPart2.setXCG11253(objectData.getString("XCG11253"));
				objectPart2.setXCG01263(objectData.getString("XCG01263"));
				objectPart2.setXCG01264(objectData.getString("XCG01264"));
				objectPart2.setXCG01265(objectData.getString("XCG01265"));
				objectPart2.setXCG01266(objectData.getString("XCG01266"));
				objectPart2.setXCG01901(objectData.getString("XCG01901"));
				objectPart2.setXCG01267(objectData.getString("XCG01267"));
				objectPart2.setXCG01902(objectData.getString("XCG01902"));
				objectPart2.setXCG01268(objectData.getString("XCG01268"));
				objectPart2.setXCG01269(objectData.getString("XCG01269"));
				objectPart2.setXCG01903(objectData.getString("XCG01903"));
				objectPart2.setXCG01270(objectData.getString("XCG01270"));
				objectPart2.setXCG01271(objectData.getString("XCG01271"));
				objectPart2.setXCG01273(objectData.getString("XCG01273"));
				objectPart2.setXCG01274(objectData.getString("XCG01274"));
				objectPart2.setXCG01275(objectData.getString("XCG01275"));
				objectPart2.setXCG01276(objectData.getString("XCG01276"));
				objectPart2.setXCG01277(objectData.getString("XCG01277"));
				objectPart2.setXCG01278(objectData.getString("XCG01278"));
				objectPart2.setXCG01279(objectData.getString("XCG01279"));
				objectPart2.setXCG01280(objectData.getString("XCG01280"));
				objectPart2.setXCG01281(objectData.getString("XCG01281"));
				objectPart2.setXCG01282(objectData.getString("XCG01282"));
				objectPart2.setXCG01283(objectData.getString("XCG01283"));
				objectPart2.setXCG01284(objectData.getString("XCG01284"));
				objectPart2.setXCG01285(objectData.getString("XCG01285"));
				objectPart2.setXCG01286(objectData.getString("XCG01286"));
				objectPart2.setXCG01287(objectData.getString("XCG01287"));
				objectPart2.setXCG01288(objectData.getString("XCG01288"));
				objectPart2.setXCG01289(objectData.getString("XCG01289"));
				objectPart2.setXCG01290(objectData.getString("XCG01290"));
				objectPart2.setXCG01291(objectData.getString("XCG01291"));
				objectPart2.setXCG01292(objectData.getString("XCG01292"));
				objectPart2.setXCG01293(objectData.getString("XCG01293"));
				objectPart2.setXCG01294(objectData.getString("XCG01294"));
				objectPart2.setXCG01295(objectData.getString("XCG01295"));
				objectPart2.setXCG01296(objectData.getString("XCG01296"));
				objectPart2.setXCG01297(objectData.getString("XCG01297"));
				objectPart2.setXCG01298(objectData.getString("XCG01298"));
				objectPart2.setXCG01300(objectData.getString("XCG01300"));
				objectPart2.setXCG01301(objectData.getString("XCG01301"));
				objectPart2.setXCG01302(objectData.getString("XCG01302"));
				objectPart2.setXCG01303(objectData.getString("XCG01303"));
				objectPart2.setXCG01304(objectData.getString("XCG01304"));
				objectPart2.setXCG01305(objectData.getString("XCG01305"));
				objectPart2.setXCG01306(objectData.getString("XCG01306"));
				objectPart2.setXCG01307(objectData.getString("XCG01307"));
				objectPart2.setXCG01308(objectData.getString("XCG01308"));

				objectPart2 = vrTechnicalSpec_XCGPart2Persistence.update(objectPart2);
				JSONObject obj_part2 = BusinessUtil.object2Json_originColumnName(objectPart2,
						VRTechnicalSpec_XCGPart2ModelImpl.class, StringPool.BLANK);

				VRTechnicalSpec_XCGPart3 objectPart3 = null;
				objectPart3 = vrTechnicalSpec_XCGPart3Persistence.findByPrimaryKey(object.getPrimaryKey());

				objectPart3.setModifyDate(now);
				objectPart3.setSyncDate(now);
				objectPart3.setMtCore(objectData.getLong("mtCore"));
				objectPart3.setConvertAssembleId(objectData.getLong("convertAssembleId"));
				objectPart3.setDossierId(objectData.getLong("dossierId"));
				objectPart3.setDossierNo(objectData.getString("dossierNo"));
				objectPart3.setReferenceUid(objectData.getString("referenceUid"));
				objectPart3.setDossierIdCTN(objectData.getString("dossierIdCTN"));
				objectPart3.setDeliverableCode(objectData.getString("deliverableCode"));
				objectPart3.setXCG01310(objectData.getString("XCG01310"));
				objectPart3.setXCG01311(objectData.getString("XCG01311"));
				objectPart3.setXCG01312(objectData.getString("XCG01312"));
				objectPart3.setXCG01313(objectData.getString("XCG01313"));
				objectPart3.setXCG01314(objectData.getString("XCG01314"));
				objectPart3.setXCG01315(objectData.getString("XCG01315"));
				objectPart3.setXCG01316(objectData.getString("XCG01316"));
				objectPart3.setXCG01317(objectData.getString("XCG01317"));
				objectPart3.setXCG01318(objectData.getString("XCG01318"));
				objectPart3.setXCG01319(objectData.getString("XCG01319"));
				objectPart3.setXCG01320(objectData.getString("XCG01320"));
				objectPart3.setXCG01321(objectData.getString("XCG01321"));
				objectPart3.setXCG01322(objectData.getString("XCG01322"));
				objectPart3.setXCG01323(objectData.getString("XCG01323"));
				objectPart3.setXCG01324(objectData.getString("XCG01324"));
				objectPart3.setXCG01325(objectData.getString("XCG01325"));
				objectPart3.setXCG01326(objectData.getString("XCG01326"));
				objectPart3.setXCG01327(objectData.getString("XCG01327"));
				objectPart3.setXCG01328(objectData.getString("XCG01328"));
				objectPart3.setXCG01330(objectData.getString("XCG01330"));
				objectPart3.setXCG01331(objectData.getString("XCG01331"));
				objectPart3.setXCG01332(objectData.getString("XCG01332"));
				objectPart3.setXCG01333(objectData.getString("XCG01333"));
				objectPart3.setXCG01334(objectData.getString("XCG01334"));
				objectPart3.setXCG01335(objectData.getString("XCG01335"));
				objectPart3.setXCG01336(objectData.getString("XCG01336"));
				objectPart3.setXCG01337(objectData.getString("XCG01337"));
				objectPart3.setXCG01338(objectData.getString("XCG01338"));
				objectPart3.setXCG01339(objectData.getString("XCG01339"));
				objectPart3.setXCG01340(objectData.getString("XCG01340"));
				objectPart3.setXCG01341(objectData.getString("XCG01341"));
				objectPart3.setXCG01342(objectData.getString("XCG01342"));
				objectPart3.setXCG01343(objectData.getString("XCG01343"));
				objectPart3.setXCG01344(objectData.getString("XCG01344"));
				objectPart3.setXCG01345(objectData.getString("XCG01345"));
				objectPart3.setXCG01346(objectData.getString("XCG01346"));
				objectPart3.setXCG01347(objectData.getString("XCG01347"));
				objectPart3.setXCG01348(objectData.getString("XCG01348"));
				objectPart3.setXCG01349(objectData.getString("XCG01349"));
				objectPart3.setXCG01350(objectData.getString("XCG01350"));
				objectPart3.setXCG01351(objectData.getString("XCG01351"));
				objectPart3.setXCG01352(objectData.getString("XCG01352"));
				objectPart3.setXCG01353(objectData.getString("XCG01353"));
				objectPart3.setXCG01354(objectData.getString("XCG01354"));
				objectPart3.setXCG01355(objectData.getString("XCG01355"));
				objectPart3.setXCG01356(objectData.getString("XCG01356"));
				objectPart3.setXCG01357(objectData.getString("XCG01357"));
				objectPart3.setXCG01358(objectData.getString("XCG01358"));
				objectPart3.setXCG01359(objectData.getString("XCG01359"));
				objectPart3.setXCG01360(objectData.getString("XCG01360"));
				objectPart3.setXCG01361(objectData.getString("XCG01361"));
				objectPart3.setXCG01362(objectData.getString("XCG01362"));
				objectPart3.setXCG01363(objectData.getString("XCG01363"));
				objectPart3.setXCG01364(objectData.getString("XCG01364"));
				objectPart3.setXCG01365(objectData.getString("XCG01365"));
				objectPart3.setXCG01366(objectData.getString("XCG01366"));
				objectPart3.setXCG01367(objectData.getString("XCG01367"));
				objectPart3.setXCG01368(objectData.getString("XCG01368"));
				objectPart3.setXCG01369(objectData.getString("XCG01369"));
				objectPart3.setXCG01370(objectData.getString("XCG01370"));
				objectPart3.setXCG01371(objectData.getString("XCG01371"));
				objectPart3.setXCG01372(objectData.getString("XCG01372"));
				objectPart3.setXCG01373(objectData.getString("XCG01373"));
				objectPart3.setXCG01374(objectData.getString("XCG01374"));
				objectPart3.setXCG01375(objectData.getString("XCG01375"));
				objectPart3.setXCG01376(objectData.getString("XCG01376"));
				objectPart3.setXCG01377(objectData.getString("XCG01377"));
				objectPart3.setXCG01378(objectData.getString("XCG01378"));
				objectPart3.setXCG01379(objectData.getString("XCG01379"));
				objectPart3.setXCG01381(objectData.getString("XCG01381"));
				objectPart3.setXCG01382(objectData.getString("XCG01382"));
				objectPart3.setXCG01383(objectData.getString("XCG01383"));
				objectPart3.setXCG01384(objectData.getString("XCG01384"));
				objectPart3.setXCG01385(objectData.getString("XCG01385"));
				objectPart3.setXCG01386(objectData.getString("XCG01386"));
				objectPart3.setXCG01387(objectData.getString("XCG01387"));
				objectPart3.setXCG01388(objectData.getString("XCG01388"));
				objectPart3.setXCG01389(objectData.getString("XCG01389"));
				objectPart3.setXCG01390(objectData.getString("XCG01390"));
				objectPart3.setXCG01391(objectData.getString("XCG01391"));
				objectPart3.setXCG01392(objectData.getString("XCG01392"));
				objectPart3.setXCG01393(objectData.getString("XCG01393"));
				objectPart3.setXCG01394(objectData.getString("XCG01394"));
				objectPart3.setXCG01395(objectData.getString("XCG01395"));
				objectPart3.setXCG01396(objectData.getString("XCG01396"));
				objectPart3.setXCG01397(objectData.getString("XCG01397"));
				objectPart3.setXCG01398(objectData.getString("XCG01398"));
				objectPart3.setXCG01399(objectData.getString("XCG01399"));
				objectPart3.setXCG01400(objectData.getString("XCG01400"));
				objectPart3.setXCG01402(objectData.getString("XCG01402"));
				objectPart3.setXCG01403(objectData.getString("XCG01403"));
				objectPart3.setXCG01404(objectData.getString("XCG01404"));
				objectPart3.setXCG01405(objectData.getString("XCG01405"));
				objectPart3.setXCG01406(objectData.getString("XCG01406"));
				objectPart3.setXCG01407(objectData.getString("XCG01407"));
				objectPart3.setXCG01408(objectData.getString("XCG01408"));
				objectPart3.setXCG01409(objectData.getString("XCG01409"));
				objectPart3.setXCG01410(objectData.getString("XCG01410"));
				objectPart3.setXCG01411(objectData.getString("XCG01411"));
				objectPart3.setXCG01412(objectData.getString("XCG01412"));
				objectPart3.setXCG01413(objectData.getString("XCG01413"));
				objectPart3.setXCG01414(objectData.getString("XCG01414"));
				objectPart3.setXCG01415(objectData.getString("XCG01415"));
				objectPart3.setXCG01416(objectData.getString("XCG01416"));
				objectPart3.setXCG01417(objectData.getString("XCG01417"));
				objectPart3.setXCG01418(objectData.getString("XCG01418"));
				objectPart3.setXCG01419(objectData.getString("XCG01419"));
				objectPart3.setXCG01420(objectData.getString("XCG01420"));
				objectPart3.setXCG01421(objectData.getString("XCG01421"));
				objectPart3.setXCG01422(objectData.getString("XCG01422"));
				objectPart3.setXCG01423(objectData.getString("XCG01423"));
				objectPart3.setXCG01424(objectData.getString("XCG01424"));
				objectPart3.setXCG01425(objectData.getString("XCG01425"));
				objectPart3.setXCG01426(objectData.getString("XCG01426"));
				objectPart3.setXCG01427(objectData.getString("XCG01427"));
				objectPart3.setXCG01428(objectData.getString("XCG01428"));
				objectPart3.setXCG01437(objectData.getString("XCG01437"));
				objectPart3.setXCG01429(objectData.getString("XCG01429"));
				objectPart3.setXCG01430(objectData.getString("XCG01430"));
				objectPart3.setXCG01431(objectData.getString("XCG01431"));
				objectPart3.setXCG01432(objectData.getString("XCG01432"));
				objectPart3.setXCG01433(objectData.getString("XCG01433"));
				objectPart3.setXCG01434(objectData.getString("XCG01434"));
				objectPart3.setXCG01435(objectData.getString("XCG01435"));
				objectPart3.setXCG01436(objectData.getString("XCG01436"));
				objectPart3.setXCG01439(objectData.getString("XCG01439"));
				objectPart3.setXCG01440(objectData.getString("XCG01440"));
				objectPart3.setXCG01441(objectData.getString("XCG01441"));
				objectPart3.setXCG01442(objectData.getString("XCG01442"));
				objectPart3.setXCG01443(objectData.getString("XCG01443"));
				objectPart3.setXCG01445(objectData.getString("XCG01445"));
				objectPart3.setXCG01446(objectData.getString("XCG01446"));
				objectPart3.setXCG01447(objectData.getString("XCG01447"));
				objectPart3.setXCG01448(objectData.getString("XCG01448"));
				objectPart3.setXCG01449(objectData.getString("XCG01449"));
				objectPart3.setXCG01450(objectData.getString("XCG01450"));
				objectPart3.setXCG01451(objectData.getString("XCG01451"));
				objectPart3.setXCG01452(objectData.getString("XCG01452"));
				objectPart3.setXCG01453(objectData.getString("XCG01453"));
				objectPart3.setXCG01454(objectData.getString("XCG01454"));
				objectPart3.setXCG01455(objectData.getString("XCG01455"));
				objectPart3.setXCG01456(objectData.getString("XCG01456"));
				objectPart3.setXCG01457(objectData.getString("XCG01457"));
				objectPart3.setXCG01458(objectData.getString("XCG01458"));
				objectPart3.setXCG01459(objectData.getString("XCG01459"));
				objectPart3.setXCG01460(objectData.getString("XCG01460"));
				objectPart3.setXCG01461(objectData.getString("XCG01461"));
				objectPart3.setXCG01462(objectData.getString("XCG01462"));
				objectPart3.setXCG01463(objectData.getString("XCG01463"));
				objectPart3.setXCG01464(objectData.getString("XCG01464"));
				objectPart3.setXCG01465(objectData.getString("XCG01465"));
				objectPart3.setXCG01466(objectData.getString("XCG01466"));
				objectPart3.setXCG01467(objectData.getString("XCG01467"));
				objectPart3.setXCG01468(objectData.getString("XCG01468"));
				objectPart3.setXCG01469(objectData.getString("XCG01469"));
				objectPart3.setXCG01470(objectData.getString("XCG01470"));
				objectPart3.setXCG01471(objectData.getString("XCG01471"));
				objectPart3.setXCG01472(objectData.getString("XCG01472"));
				objectPart3.setXCG01473(objectData.getString("XCG01473"));
				objectPart3.setXCG01474(objectData.getString("XCG01474"));
				objectPart3.setXCG01475(objectData.getString("XCG01475"));
				objectPart3.setXCG01476(objectData.getString("XCG01476"));
				objectPart3.setXCG01477(objectData.getString("XCG01477"));
				objectPart3.setXCG01478(objectData.getString("XCG01478"));
				objectPart3.setXCG01479(objectData.getString("XCG01479"));
				objectPart3.setXCG01480(objectData.getString("XCG01480"));
				objectPart3.setXCG01481(objectData.getString("XCG01481"));
				objectPart3.setXCG01482(objectData.getString("XCG01482"));
				objectPart3.setXCG01483(objectData.getString("XCG01483"));
				objectPart3.setXCG01484(objectData.getString("XCG01484"));
				objectPart3.setXCG01485(objectData.getString("XCG01485"));
				objectPart3.setXCG01486(objectData.getString("XCG01486"));
				objectPart3.setXCG01487(objectData.getString("XCG01487"));
				objectPart3.setXCG01488(objectData.getString("XCG01488"));
				objectPart3.setXCG01489(objectData.getString("XCG01489"));
				objectPart3.setXCG01490(objectData.getString("XCG01490"));
				objectPart3.setXCG01491(objectData.getString("XCG01491"));
				objectPart3.setXCG01492(objectData.getString("XCG01492"));
				objectPart3.setXCG01493(objectData.getString("XCG01493"));
				objectPart3.setXCG01494(objectData.getString("XCG01494"));

				objectPart3 = vrTechnicalSpec_XCGPart3Persistence.update(objectPart3);
				JSONObject obj_part3 = BusinessUtil.object2Json_originColumnName(objectPart3,
						VRTechnicalSpec_XCGPart3ModelImpl.class, StringPool.BLANK);

				VRTechnicalSpec_XCGPart4 objectPart4 = null;
				objectPart4 = vrTechnicalSpec_XCGPart4Persistence.findByPrimaryKey(object.getPrimaryKey());

				objectPart4.setModifyDate(now);
				objectPart4.setSyncDate(now);
				objectPart4.setMtCore(objectData.getLong("mtCore"));
				objectPart4.setConvertAssembleId(objectData.getLong("convertAssembleId"));
				objectPart4.setDossierId(objectData.getLong("dossierId"));
				objectPart4.setDossierNo(objectData.getString("dossierNo"));
				objectPart4.setReferenceUid(objectData.getString("referenceUid"));
				objectPart4.setDossierIdCTN(objectData.getString("dossierIdCTN"));
				objectPart4.setDeliverableCode(objectData.getString("deliverableCode"));
				objectPart4.setXCG01496(objectData.getString("XCG01496"));
				objectPart4.setXCG01497(objectData.getString("XCG01497"));
				objectPart4.setXCG01498(objectData.getString("XCG01498"));
				objectPart4.setXCG01499(objectData.getString("XCG01499"));
				objectPart4.setXCG01500(objectData.getString("XCG01500"));
				objectPart4.setXCG01501(objectData.getString("XCG01501"));
				objectPart4.setXCG01502(objectData.getString("XCG01502"));
				objectPart4.setXCG01503(objectData.getString("XCG01503"));
				objectPart4.setXCG01504(objectData.getString("XCG01504"));
				objectPart4.setXCG01505(objectData.getString("XCG01505"));
				objectPart4.setXCG01506(objectData.getString("XCG01506"));
				objectPart4.setXCG01507(objectData.getString("XCG01507"));
				objectPart4.setXCG01508(objectData.getString("XCG01508"));
				objectPart4.setXCG01509(objectData.getString("XCG01509"));
				objectPart4.setXCG01510(objectData.getString("XCG01510"));
				objectPart4.setXCG01512(objectData.getString("XCG01512"));
				objectPart4.setXCG01513(objectData.getString("XCG01513"));
				objectPart4.setXCG01514(objectData.getString("XCG01514"));
				objectPart4.setXCG01515(objectData.getString("XCG01515"));
				objectPart4.setXCG01516(objectData.getString("XCG01516"));
				objectPart4.setXCG01517(objectData.getString("XCG01517"));
				objectPart4.setXCG01518(objectData.getString("XCG01518"));
				objectPart4.setXCG01519(objectData.getString("XCG01519"));
				objectPart4.setXCG01520(objectData.getString("XCG01520"));
				objectPart4.setXCG01521(objectData.getString("XCG01521"));
				objectPart4.setXCG01522(objectData.getString("XCG01522"));
				objectPart4.setXCG01523(objectData.getString("XCG01523"));
				objectPart4.setXCG01524(objectData.getString("XCG01524"));
				objectPart4.setXCG01525(objectData.getString("XCG01525"));
				objectPart4.setXCG01526(objectData.getString("XCG01526"));
				objectPart4.setXCG01527(objectData.getString("XCG01527"));
				objectPart4.setXCG01528(objectData.getString("XCG01528"));
				objectPart4.setXCG01529(objectData.getString("XCG01529"));
				objectPart4.setXCG01530(objectData.getString("XCG01530"));
				objectPart4.setXCG01531(objectData.getString("XCG01531"));
				objectPart4.setXCG01904(objectData.getString("XCG01904"));
				objectPart4.setXCG01533(objectData.getString("XCG01533"));
				objectPart4.setXCG01905(objectData.getString("XCG01905"));
				objectPart4.setXCG01534(objectData.getString("XCG01534"));
				objectPart4.setXCG01906(objectData.getString("XCG01906"));
				objectPart4.setXCG01535(objectData.getString("XCG01535"));
				objectPart4.setXCG01907(objectData.getString("XCG01907"));
				objectPart4.setXCG01536(objectData.getString("XCG01536"));
				objectPart4.setXCG01908(objectData.getString("XCG01908"));
				objectPart4.setXCG01537(objectData.getString("XCG01537"));
				objectPart4.setXCG01909(objectData.getString("XCG01909"));
				objectPart4.setXCG01538(objectData.getString("XCG01538"));
				objectPart4.setXCG01910(objectData.getString("XCG01910"));
				objectPart4.setXCG01539(objectData.getString("XCG01539"));
				objectPart4.setXCG11535(objectData.getString("XCG11535"));
				objectPart4.setXCG01541(objectData.getString("XCG01541"));
				objectPart4.setXCG01542(objectData.getString("XCG01542"));
				objectPart4.setXCG01911(objectData.getString("XCG01911"));
				objectPart4.setXCG01543(objectData.getString("XCG01543"));
				objectPart4.setXCG01912(objectData.getString("XCG01912"));
				objectPart4.setXCG01544(objectData.getString("XCG01544"));
				objectPart4.setXCG01545(objectData.getString("XCG01545"));
				objectPart4.setXCG01546(objectData.getString("XCG01546"));
				objectPart4.setXCG01547(objectData.getString("XCG01547"));
				objectPart4.setXCG01548(objectData.getString("XCG01548"));
				objectPart4.setXCG01913(objectData.getString("XCG01913"));
				objectPart4.setXCG01549(objectData.getString("XCG01549"));
				objectPart4.setXCG01914(objectData.getString("XCG01914"));
				objectPart4.setXCG01550(objectData.getString("XCG01550"));
				objectPart4.setXCG01551(objectData.getString("XCG01551"));
				objectPart4.setXCG01552(objectData.getString("XCG01552"));
				objectPart4.setXCG01553(objectData.getString("XCG01553"));
				objectPart4.setXCG01554(objectData.getString("XCG01554"));
				objectPart4.setXCG01915(objectData.getString("XCG01915"));
				objectPart4.setXCG01555(objectData.getString("XCG01555"));
				objectPart4.setXCG01556(objectData.getString("XCG01556"));
				objectPart4.setXCG01557(objectData.getString("XCG01557"));
				objectPart4.setXCG01558(objectData.getString("XCG01558"));
				objectPart4.setXCG01559(objectData.getString("XCG01559"));
				objectPart4.setXCG01560(objectData.getString("XCG01560"));
				objectPart4.setXCG01561(objectData.getString("XCG01561"));
				objectPart4.setXCG01916(objectData.getString("XCG01916"));
				objectPart4.setXCG01562(objectData.getString("XCG01562"));
				objectPart4.setXCG01917(objectData.getString("XCG01917"));
				objectPart4.setXCG01563(objectData.getString("XCG01563"));
				objectPart4.setXCG01918(objectData.getString("XCG01918"));
				objectPart4.setXCG01564(objectData.getString("XCG01564"));
				objectPart4.setXCG01565(objectData.getString("XCG01565"));
				objectPart4.setXCG01566(objectData.getString("XCG01566"));
				objectPart4.setXCG01567(objectData.getString("XCG01567"));
				objectPart4.setXCG01568(objectData.getString("XCG01568"));
				objectPart4.setXCG01919(objectData.getString("XCG01919"));
				objectPart4.setXCG01569(objectData.getString("XCG01569"));
				objectPart4.setXCG01570(objectData.getString("XCG01570"));
				objectPart4.setXCG01571(objectData.getString("XCG01571"));
				objectPart4.setXCG01572(objectData.getString("XCG01572"));
				objectPart4.setXCG01920(objectData.getString("XCG01920"));
				objectPart4.setXCG01573(objectData.getString("XCG01573"));
				objectPart4.setXCG01921(objectData.getString("XCG01921"));
				objectPart4.setXCG01574(objectData.getString("XCG01574"));
				objectPart4.setXCG01922(objectData.getString("XCG01922"));
				objectPart4.setXCG01575(objectData.getString("XCG01575"));
				objectPart4.setXCG01576(objectData.getString("XCG01576"));
				objectPart4.setXCG01577(objectData.getString("XCG01577"));
				objectPart4.setXCG01578(objectData.getString("XCG01578"));
				objectPart4.setXCG01579(objectData.getString("XCG01579"));
				objectPart4.setXCG01580(objectData.getString("XCG01580"));
				objectPart4.setXCG01581(objectData.getString("XCG01581"));
				objectPart4.setXCG01582(objectData.getString("XCG01582"));
				objectPart4.setXCG01583(objectData.getString("XCG01583"));
				objectPart4.setXCG01584(objectData.getString("XCG01584"));
				objectPart4.setXCG01585(objectData.getString("XCG01585"));
				objectPart4.setXCG01586(objectData.getString("XCG01586"));
				objectPart4.setXCG01587(objectData.getString("XCG01587"));
				objectPart4.setXCG01588(objectData.getString("XCG01588"));
				objectPart4.setXCG01589(objectData.getString("XCG01589"));
				objectPart4.setXCG01590(objectData.getString("XCG01590"));
				objectPart4.setXCG01591(objectData.getString("XCG01591"));
				objectPart4.setXCG01592(objectData.getString("XCG01592"));
				objectPart4.setXCG01593(objectData.getString("XCG01593"));
				objectPart4.setXCG01594(objectData.getString("XCG01594"));
				objectPart4.setXCG01595(objectData.getString("XCG01595"));
				objectPart4.setXCG01596(objectData.getString("XCG01596"));
				objectPart4.setXCG01597(objectData.getString("XCG01597"));

				objectPart4 = vrTechnicalSpec_XCGPart4Persistence.update(objectPart4);
				JSONObject obj_part4 = BusinessUtil.object2Json_originColumnName(objectPart4,
						VRTechnicalSpec_XCGPart4ModelImpl.class, StringPool.BLANK);

				VRTechnicalSpec_XCGPart5 objectPart5 = null;
				objectPart5 = vrTechnicalSpec_XCGPart5Persistence.findByPrimaryKey(object.getPrimaryKey());

				objectPart5.setModifyDate(now);
				objectPart5.setSyncDate(now);
				objectPart5.setMtCore(objectData.getLong("mtCore"));
				objectPart5.setConvertAssembleId(objectData.getLong("convertAssembleId"));
				objectPart5.setDossierId(objectData.getLong("dossierId"));
				objectPart5.setDossierNo(objectData.getString("dossierNo"));
				objectPart5.setReferenceUid(objectData.getString("referenceUid"));
				objectPart5.setDossierIdCTN(objectData.getString("dossierIdCTN"));
				objectPart5.setDeliverableCode(objectData.getString("deliverableCode"));
				objectPart5.setXCG01598(objectData.getString("XCG01598"));
				objectPart5.setXCG01599(objectData.getString("XCG01599"));
				objectPart5.setXCG01600(objectData.getString("XCG01600"));
				objectPart5.setXCG01601(objectData.getString("XCG01601"));
				objectPart5.setXCG01602(objectData.getString("XCG01602"));
				objectPart5.setXCG01603(objectData.getString("XCG01603"));
				objectPart5.setXCG01923(objectData.getString("XCG01923"));
				objectPart5.setXCG01604(objectData.getString("XCG01604"));
				objectPart5.setXCG01924(objectData.getString("XCG01924"));
				objectPart5.setXCG01605(objectData.getString("XCG01605"));
				objectPart5.setXCG01606(objectData.getString("XCG01606"));
				objectPart5.setXCG01607(objectData.getString("XCG01607"));
				objectPart5.setXCG01608(objectData.getString("XCG01608"));
				objectPart5.setXCG01609(objectData.getString("XCG01609"));
				objectPart5.setXCG01925(objectData.getString("XCG01925"));
				objectPart5.setXCG01610(objectData.getString("XCG01610"));
				objectPart5.setXCG01926(objectData.getString("XCG01926"));
				objectPart5.setXCG01611(objectData.getString("XCG01611"));
				objectPart5.setXCG01612(objectData.getString("XCG01612"));
				objectPart5.setXCG01928(objectData.getString("XCG01928"));
				objectPart5.setXCG01613(objectData.getString("XCG01613"));
				objectPart5.setXCG01929(objectData.getString("XCG01929"));
				objectPart5.setXCG01614(objectData.getString("XCG01614"));
				objectPart5.setXCG01930(objectData.getString("XCG01930"));
				objectPart5.setXCG01615(objectData.getString("XCG01615"));
				objectPart5.setXCG01931(objectData.getString("XCG01931"));
				objectPart5.setXCG01616(objectData.getString("XCG01616"));
				objectPart5.setXCG01932(objectData.getString("XCG01932"));
				objectPart5.setXCG01617(objectData.getString("XCG01617"));
				objectPart5.setXCG01933(objectData.getString("XCG01933"));
				objectPart5.setXCG01618(objectData.getString("XCG01618"));
				objectPart5.setXCG01934(objectData.getString("XCG01934"));
				objectPart5.setXCG01619(objectData.getString("XCG01619"));
				objectPart5.setXCG01935(objectData.getString("XCG01935"));
				objectPart5.setXCG01620(objectData.getString("XCG01620"));
				objectPart5.setXCG01936(objectData.getString("XCG01936"));
				objectPart5.setXCG01621(objectData.getString("XCG01621"));
				objectPart5.setXCG01937(objectData.getString("XCG01937"));
				objectPart5.setXCG01622(objectData.getString("XCG01622"));
				objectPart5.setXCG01938(objectData.getString("XCG01938"));
				objectPart5.setXCG01623(objectData.getString("XCG01623"));
				objectPart5.setXCG01939(objectData.getString("XCG01939"));
				objectPart5.setXCG01624(objectData.getString("XCG01624"));
				objectPart5.setXCG01940(objectData.getString("XCG01940"));
				objectPart5.setXCG01625(objectData.getString("XCG01625"));
				objectPart5.setXCG01941(objectData.getString("XCG01941"));
				objectPart5.setXCG01626(objectData.getString("XCG01626"));
				objectPart5.setXCG01942(objectData.getString("XCG01942"));
				objectPart5.setXCG01627(objectData.getString("XCG01627"));
				objectPart5.setXCG01943(objectData.getString("XCG01943"));
				objectPart5.setXCG01628(objectData.getString("XCG01628"));
				objectPart5.setXCG01944(objectData.getString("XCG01944"));
				objectPart5.setXCG01630(objectData.getString("XCG01630"));
				objectPart5.setXCG01631(objectData.getString("XCG01631"));
				objectPart5.setXCG01632(objectData.getString("XCG01632"));
				objectPart5.setXCG01633(objectData.getString("XCG01633"));
				objectPart5.setXCG01634(objectData.getString("XCG01634"));
				objectPart5.setXCG01635(objectData.getString("XCG01635"));
				objectPart5.setXCG01636(objectData.getString("XCG01636"));
				objectPart5.setXCG01637(objectData.getString("XCG01637"));
				objectPart5.setXCG01638(objectData.getString("XCG01638"));
				objectPart5.setXCG01639(objectData.getString("XCG01639"));
				objectPart5.setXCG01640(objectData.getString("XCG01640"));
				objectPart5.setXCG01641(objectData.getString("XCG01641"));
				objectPart5.setXCG01642(objectData.getString("XCG01642"));
				objectPart5.setXCG01643(objectData.getString("XCG01643"));
				objectPart5.setXCG01644(objectData.getString("XCG01644"));
				objectPart5.setXCG01645(objectData.getString("XCG01645"));
				objectPart5.setXCG01646(objectData.getString("XCG01646"));
				objectPart5.setXCG01647(objectData.getString("XCG01647"));
				objectPart5.setXCG01648(objectData.getString("XCG01648"));
				objectPart5.setXCG01649(objectData.getString("XCG01649"));
				objectPart5.setXCG01650(objectData.getString("XCG01650"));
				objectPart5.setXCG01651(objectData.getString("XCG01651"));
				objectPart5.setXCG01652(objectData.getString("XCG01652"));
				objectPart5.setXCG01653(objectData.getString("XCG01653"));
				objectPart5.setXCG01654(objectData.getString("XCG01654"));
				objectPart5.setXCG01655(objectData.getString("XCG01655"));
				objectPart5.setXCG01656(objectData.getString("XCG01656"));
				objectPart5.setXCG01657(objectData.getString("XCG01657"));
				objectPart5.setXCG01658(objectData.getString("XCG01658"));
				objectPart5.setXCG01659(objectData.getString("XCG01659"));
				objectPart5.setXCG01660(objectData.getString("XCG01660"));
				objectPart5.setXCG01661(objectData.getString("XCG01661"));
				objectPart5.setXCG01662(objectData.getString("XCG01662"));
				objectPart5.setXCG01663(objectData.getString("XCG01663"));
				objectPart5.setXCG01664(objectData.getString("XCG01664"));
				objectPart5.setXCG01665(objectData.getString("XCG01665"));
				objectPart5.setXCG01666(objectData.getString("XCG01666"));
				objectPart5.setXCG01667(objectData.getString("XCG01667"));
				objectPart5.setXCG01668(objectData.getString("XCG01668"));
				objectPart5.setXCG01669(objectData.getString("XCG01669"));
				objectPart5.setXCG01670(objectData.getString("XCG01670"));
				objectPart5.setXCG01671(objectData.getString("XCG01671"));
				objectPart5.setXCG01672(objectData.getString("XCG01672"));
				objectPart5.setXCG01673(objectData.getString("XCG01673"));
				objectPart5.setXCG01674(objectData.getString("XCG01674"));
				objectPart5.setXCG01675(objectData.getString("XCG01675"));
				objectPart5.setXCG01676(objectData.getString("XCG01676"));
				objectPart5.setXCG01677(objectData.getString("XCG01677"));
				objectPart5.setXCG01678(objectData.getString("XCG01678"));
				objectPart5.setXCG01679(objectData.getString("XCG01679"));
				objectPart5.setXCG01680(objectData.getString("XCG01680"));
				objectPart5.setXCG01681(objectData.getString("XCG01681"));
				objectPart5.setXCG01682(objectData.getString("XCG01682"));
				objectPart5.setXCG01683(objectData.getString("XCG01683"));
				objectPart5.setXCG01684(objectData.getString("XCG01684"));
				objectPart5.setXCG01685(objectData.getString("XCG01685"));
				objectPart5.setXCG01686(objectData.getString("XCG01686"));
				objectPart5.setXCG01687(objectData.getString("XCG01687"));
				objectPart5.setXCG01688(objectData.getString("XCG01688"));
				objectPart5.setXCG01689(objectData.getString("XCG01689"));
				objectPart5.setXCG01690(objectData.getString("XCG01690"));
				objectPart5.setXCG01691(objectData.getString("XCG01691"));
				objectPart5.setXCG01692(objectData.getString("XCG01692"));
				objectPart5.setXCG01693(objectData.getString("XCG01693"));
				objectPart5.setXCG01694(objectData.getString("XCG01694"));
				objectPart5.setXCG01695(objectData.getString("XCG01695"));
				objectPart5.setXCG01696(objectData.getString("XCG01696"));
				objectPart5.setXCG01697(objectData.getString("XCG01697"));
				objectPart5.setXCG01698(objectData.getString("XCG01698"));
				objectPart5.setXCG01699(objectData.getString("XCG01699"));
				objectPart5.setXCG01700(objectData.getString("XCG01700"));
				objectPart5.setXCG01701(objectData.getString("XCG01701"));
				objectPart5.setXCG01702(objectData.getString("XCG01702"));
				objectPart5.setXCG01703(objectData.getString("XCG01703"));
				objectPart5.setXCG01704(objectData.getString("XCG01704"));
				objectPart5.setXCG01705(objectData.getString("XCG01705"));
				objectPart5.setXCG01706(objectData.getString("XCG01706"));
				objectPart5.setXCG01707(objectData.getString("XCG01707"));
				objectPart5.setXCG01708(objectData.getString("XCG01708"));
				objectPart5.setXCG01709(objectData.getString("XCG01709"));
				objectPart5.setXCG01710(objectData.getString("XCG01710"));
				objectPart5.setXCG01711(objectData.getString("XCG01711"));
				objectPart5.setXCG01712(objectData.getString("XCG01712"));
				objectPart5.setXCG01713(objectData.getString("XCG01713"));
				objectPart5.setXCG01714(objectData.getString("XCG01714"));
				objectPart5.setXCG01715(objectData.getString("XCG01715"));
				objectPart5.setXCG01716(objectData.getString("XCG01716"));
				objectPart5.setXCG01717(objectData.getString("XCG01717"));
				objectPart5.setXCG01718(objectData.getString("XCG01718"));
				objectPart5.setXCG01719(objectData.getString("XCG01719"));
				objectPart5.setXCG01720(objectData.getString("XCG01720"));
				objectPart5.setXCG01721(objectData.getString("XCG01721"));
				objectPart5.setXCG01722(objectData.getString("XCG01722"));
				objectPart5.setXCG01723(objectData.getString("XCG01723"));
				objectPart5.setXCG01724(objectData.getString("XCG01724"));
				objectPart5.setXCG01725(objectData.getString("XCG01725"));
				objectPart5.setXCG01726(objectData.getString("XCG01726"));
				objectPart5.setXCG01727(objectData.getString("XCG01727"));
				objectPart5.setXCG01728(objectData.getString("XCG01728"));
				objectPart5.setXCG01729(objectData.getString("XCG01729"));
				objectPart5.setXCG01730(objectData.getString("XCG01730"));
				objectPart5.setXCG01731(objectData.getString("XCG01731"));
				objectPart5.setXCG01732(objectData.getString("XCG01732"));
				objectPart5.setXCG01733(objectData.getString("XCG01733"));
				objectPart5.setXCG01734(objectData.getString("XCG01734"));
				objectPart5.setXCG01735(objectData.getString("XCG01735"));
				objectPart5.setXCG01736(objectData.getString("XCG01736"));
				objectPart5.setXCG01737(objectData.getString("XCG01737"));
				objectPart5.setXCG01738(objectData.getString("XCG01738"));
				objectPart5.setXCG01739(objectData.getString("XCG01739"));
				objectPart5.setXCG01740(objectData.getString("XCG01740"));
				objectPart5.setXCG01741(objectData.getString("XCG01741"));
				objectPart5.setXCG01742(objectData.getString("XCG01742"));
				objectPart5.setXCG01744(objectData.getString("XCG01744"));
				objectPart5.setXCG01745(objectData.getString("XCG01745"));
				objectPart5.setXCG01746(objectData.getString("XCG01746"));
				objectPart5.setXCG01747(objectData.getString("XCG01747"));
				objectPart5.setXCG01748(objectData.getString("XCG01748"));
				objectPart5.setXCG01749(objectData.getString("XCG01749"));
				objectPart5.setXCG01945(objectData.getString("XCG01945"));
				objectPart5.setXCG01750(objectData.getString("XCG01750"));
				objectPart5.setXCG01946(objectData.getString("XCG01946"));
				objectPart5.setXCG01751(objectData.getString("XCG01751"));
				objectPart5.setXCG01752(objectData.getString("XCG01752"));
				objectPart5.setXCG01753(objectData.getString("XCG01753"));
				objectPart5.setXCG01754(objectData.getString("XCG01754"));
				objectPart5.setXCG01756(objectData.getString("XCG01756"));

				objectPart5 = vrTechnicalSpec_XCGPart5Persistence.update(objectPart5);
				JSONObject obj_part5 = BusinessUtil.object2Json_originColumnName(objectPart5,
						VRTechnicalSpec_XCGPart5ModelImpl.class, StringPool.BLANK);

				VRTechnicalSpec_XCGPart6 objectPart6 = null;
				objectPart6 = vrTechnicalSpec_XCGPart6Persistence.findByPrimaryKey(object.getPrimaryKey());

				objectPart6.setModifyDate(now);
				objectPart6.setSyncDate(now);
				objectPart6.setMtCore(objectData.getLong("mtCore"));
				objectPart6.setConvertAssembleId(objectData.getLong("convertAssembleId"));
				objectPart6.setDossierId(objectData.getLong("dossierId"));
				objectPart6.setDossierNo(objectData.getString("dossierNo"));
				objectPart6.setReferenceUid(objectData.getString("referenceUid"));
				objectPart6.setDossierIdCTN(objectData.getString("dossierIdCTN"));
				objectPart6.setDeliverableCode(objectData.getString("deliverableCode"));

				objectPart6.setXCG01757(objectData.getString("XCG01757"));
				objectPart6.setXCG01758(objectData.getString("XCG01758"));

				objectPart6.setXCG01759(objectData.getString("XCG01759"));
				objectPart6.setXCG01948(objectData.getString("XCG01948"));
				objectPart6.setXCG01760(objectData.getString("XCG01760"));
				objectPart6.setXCG01949(objectData.getString("XCG01949"));
				objectPart6.setXCG01761(objectData.getString("XCG01761"));
				objectPart6.setXCG01950(objectData.getString("XCG01950"));
				objectPart6.setXCG01762(objectData.getString("XCG01762"));
				objectPart6.setXCG01951(objectData.getString("XCG01951"));
				objectPart6.setXCG01763(objectData.getString("XCG01763"));
				objectPart6.setXCG01952(objectData.getString("XCG01952"));
				objectPart6.setXCG01764(objectData.getString("XCG01764"));
				objectPart6.setXCG01953(objectData.getString("XCG01953"));
				objectPart6.setXCG01765(objectData.getString("XCG01765"));
				objectPart6.setXCG01954(objectData.getString("XCG01954"));
				objectPart6.setXCG01766(objectData.getString("XCG01766"));
				objectPart6.setXCG01955(objectData.getString("XCG01955"));
				objectPart6.setXCG01767(objectData.getString("XCG01767"));
				objectPart6.setXCG01956(objectData.getString("XCG01956"));
				objectPart6.setXCG01768(objectData.getString("XCG01768"));

				objectPart6.setXCG01957(objectData.getString("XCG01957"));
				objectPart6.setXCG01769(objectData.getString("XCG01769"));
				objectPart6.setXCG01958(objectData.getString("XCG01958"));
				objectPart6.setXCG01770(objectData.getString("XCG01770"));
				objectPart6.setXCG01771(objectData.getString("XCG01771"));
				objectPart6.setXCG01959(objectData.getString("XCG01959"));
				objectPart6.setXCG01772(objectData.getString("XCG01772"));
				objectPart6.setXCG01773(objectData.getString("XCG01773"));
				objectPart6.setXCG01774(objectData.getString("XCG01774"));
				objectPart6.setXCG01775(objectData.getString("XCG01775"));
				objectPart6.setXCG01776(objectData.getString("XCG01776"));
				objectPart6.setXCG01777(objectData.getString("XCG01777"));
				objectPart6.setXCG01778(objectData.getString("XCG01778"));
				objectPart6.setXCG01779(objectData.getString("XCG01779"));
				objectPart6.setXCG01780(objectData.getString("XCG01780"));
				objectPart6.setXCG01781(objectData.getString("XCG01781"));
				objectPart6.setXCG01783(objectData.getString("XCG01783"));
				objectPart6.setXCG01785(objectData.getString("XCG01785"));
				objectPart6.setXCG01786(objectData.getString("XCG01786"));
				objectPart6.setXCG01787(objectData.getString("XCG01787"));
				objectPart6.setXCG01788(objectData.getString("XCG01788"));
				objectPart6.setXCG01789(objectData.getString("XCG01789"));
				objectPart6.setXCG01790(objectData.getString("XCG01790"));
				objectPart6.setXCG01791(objectData.getString("XCG01791"));
				objectPart6.setXCG01792(objectData.getString("XCG01792"));
				objectPart6.setXCG01793(objectData.getString("XCG01793"));
				objectPart6.setXCG01794(objectData.getString("XCG01794"));
				objectPart6.setXCG01795(objectData.getString("XCG01795"));
				objectPart6.setXCG01796(objectData.getString("XCG01796"));
				objectPart6.setXCG01797(objectData.getString("XCG01797"));
				objectPart6.setXCG01798(objectData.getString("XCG01798"));
				objectPart6.setXCG01799(objectData.getString("XCG01799"));
				objectPart6.setXCG01801(objectData.getString("XCG01801"));
				objectPart6.setXCG01802(objectData.getString("XCG01802"));
				objectPart6.setXCG01803(objectData.getString("XCG01803"));
				objectPart6.setXCG01804(objectData.getString("XCG01804"));
				objectPart6.setXCG01805(objectData.getString("XCG01805"));
				objectPart6.setXCG01806(objectData.getString("XCG01806"));
				objectPart6.setXCG01807(objectData.getString("XCG01807"));
				objectPart6.setXCG01808(objectData.getString("XCG01808"));
				objectPart6.setXCG01809(objectData.getString("XCG01809"));
				objectPart6.setXCG01810(objectData.getString("XCG01810"));
				objectPart6.setXCG01811(objectData.getString("XCG01811"));
				objectPart6.setXCG01812(objectData.getString("XCG01812"));
				objectPart6.setXCG01813(objectData.getString("XCG01813"));
				objectPart6.setXCG01814(objectData.getString("XCG01814"));
				objectPart6.setTDTKXCG001(objectData.getString("TDTKXCG001"));
				objectPart6.setTDTKXCG002(objectData.getString("TDTKXCG002"));
				objectPart6.setTDTKXCG003(objectData.getString("TDTKXCG003"));
				objectPart6.setTDTKXCG004(objectData.getString("TDTKXCG004"));
				objectPart6.setTDTKXCG005(objectData.getString("TDTKXCG005"));
				objectPart6.setTDTKXCG006(objectData.getString("TDTKXCG006"));
				objectPart6.setTDTKXCG007(objectData.getString("TDTKXCG007"));
				objectPart6.setTDTKXCG008(objectData.getString("TDTKXCG008"));
				objectPart6.setTDTKXCG009(objectData.getString("TDTKXCG009"));
				objectPart6.setTDTKXCG010(objectData.getString("TDTKXCG010"));
				objectPart6.setTDTKXCG011(objectData.getString("TDTKXCG011"));
				objectPart6.setTDTKXCG012(objectData.getString("TDTKXCG012"));
				objectPart6.setTDTKXCG013(objectData.getString("TDTKXCG013"));
				objectPart6.setTDTKXCG014(objectData.getString("TDTKXCG014"));
				objectPart6.setTDTKXCG015(objectData.getString("TDTKXCG015"));
				objectPart6.setTDTKXCG016(objectData.getString("TDTKXCG016"));
				objectPart6.setTDTKXCG017(objectData.getString("TDTKXCG017"));
				objectPart6.setTDTKXCG018(objectData.getString("TDTKXCG018"));
				objectPart6.setTDTKXCG019(objectData.getString("TDTKXCG019"));
				objectPart6.setTDTKXCG020(objectData.getString("TDTKXCG020"));
				objectPart6.setTDTKXCG021(objectData.getString("TDTKXCG021"));
				objectPart6.setTDTKXCG022(objectData.getString("TDTKXCG022"));
				objectPart6.setTDTKXCG023(objectData.getString("TDTKXCG023"));
				objectPart6.setTDTKXCG024(objectData.getString("TDTKXCG024"));
				objectPart6.setTDTKXCG025(objectData.getString("TDTKXCG025"));
				objectPart6.setTDTKXCG026(objectData.getString("TDTKXCG026"));
				objectPart6.setTDTKXCG027(objectData.getString("TDTKXCG027"));
				objectPart6.setTDTKXCG028(objectData.getString("TDTKXCG028"));
				objectPart6.setTDTKXCG029(objectData.getString("TDTKXCG029"));
				objectPart6.setTDTKXCG030(objectData.getString("TDTKXCG030"));
				objectPart6.setTDTKXCG031(objectData.getString("TDTKXCG031"));
				objectPart6.setTDTKXCG032(objectData.getString("TDTKXCG032"));
				objectPart6.setTDTKXCG033(objectData.getString("TDTKXCG033"));

				objectPart6.setTDTKXCG034(objectData.getString("TDTKXCG034"));
				objectPart6.setTDTKXCG035(objectData.getString("TDTKXCG035"));

				objectPart6.setTDTKXCG036(objectData.getString("TDTKXCG036"));
				objectPart6.setBBCNCLKLXCG01(objectData.getString("BBCNCLKLXCG01"));
				objectPart6.setBBCNCLKLXCG02(objectData.getString("BBCNCLKLXCG02"));
				objectPart6.setBBCNCLKLXCG03(objectData.getString("BBCNCLKLXCG03"));
				objectPart6.setBBCNCLKLXCG04(objectData.getString("BBCNCLKLXCG04"));
				objectPart6.setBBCNCLKLXCG05(objectData.getString("BBCNCLKLXCG05"));
				objectPart6.setBBCNCLKLXCG06(objectData.getString("BBCNCLKLXCG06"));
				objectPart6.setBBCNCLKLXCG07(objectData.getString("BBCNCLKLXCG07"));
				objectPart6.setBBCNCLKLXCG08(objectData.getString("BBCNCLKLXCG08"));
				objectPart6.setBBCNCLKLXCG09(objectData.getString("BBCNCLKLXCG09"));
				objectPart6.setBBCNCLKLXCG10(objectData.getString("BBCNCLKLXCG10"));
				objectPart6.setBBCNCLKLXCG11(objectData.getString("BBCNCLKLXCG11"));
				objectPart6.setBBCNCLKLXCG12(objectData.getString("BBCNCLKLXCG12"));
				objectPart6.setBBCNCLKLXCG13(objectData.getString("BBCNCLKLXCG13"));
				objectPart6.setBBCNCLKLXCG14(objectData.getString("BBCNCLKLXCG14"));
				objectPart6.setBBCNCLKLXCG15(objectData.getString("BBCNCLKLXCG15"));
				objectPart6.setBBCNCLKLXCG16(objectData.getString("BBCNCLKLXCG16"));
				objectPart6.setBBCNCLKLXCG17(objectData.getString("BBCNCLKLXCG17"));
				objectPart6.setBBCNCLKLXCG18(objectData.getString("BBCNCLKLXCG18"));

				objectPart6.setBBCNCLKLXCG19(objectData.getString("BBCNCLKLXCG19"));
				objectPart6.setBBCNCLKLXCG20(objectData.getString("BBCNCLKLXCG20"));
				objectPart6.setBBCNCLKLXCG21(objectData.getString("BBCNCLKLXCG21"));
				objectPart6.setBBCNCLKLXCG22(objectData.getString("BBCNCLKLXCG22"));
				objectPart6.setBBCNCLKLXCG23(objectData.getString("BBCNCLKLXCG23"));
				objectPart6.setBBCNCLKLXCG24(objectData.getString("BBCNCLKLXCG24"));
				objectPart6.setBBCNCLKLXCG26(objectData.getString("BBCNCLKLXCG26"));
				objectPart6.setBBCNCLKLXCG27(objectData.getString("BBCNCLKLXCG27"));
				objectPart6.setBBCNCLKLXCG28(objectData.getString("BBCNCLKLXCG28"));
				objectPart6.setBBCNCLKLXCG29(objectData.getString("BBCNCLKLXCG29"));
				objectPart6.setBBCNCLKLXCG30(objectData.getString("BBCNCLKLXCG30"));
				objectPart6.setBBCNCLKLXCG31(objectData.getString("BBCNCLKLXCG31"));
				objectPart6.setBBCNCLKLXCG33(objectData.getString("BBCNCLKLXCG33"));
				objectPart6.setBBCNCLKLXCG34(objectData.getString("BBCNCLKLXCG34"));
				objectPart6.setBBCNCLKLXCG35(objectData.getString("BBCNCLKLXCG35"));
				objectPart6.setBBCNCLKLXCG36(objectData.getString("BBCNCLKLXCG36"));
				objectPart6.setBBCNCLKLXCG38(objectData.getString("BBCNCLKLXCG38"));
				objectPart6.setBBCNCLKLXCG39(objectData.getString("BBCNCLKLXCG39"));
				objectPart6.setBBCNCLKLXCG40(objectData.getString("BBCNCLKLXCG40"));
				objectPart6.setBBCNCLKLXCG42(objectData.getString("BBCNCLKLXCG42"));
				objectPart6.setBBCNCLKLXCG43(objectData.getString("BBCNCLKLXCG43"));
				objectPart6.setBBCNCLKLXCG44(objectData.getString("BBCNCLKLXCG44"));
				objectPart6.setBBCNCLKLXCG45(objectData.getString("BBCNCLKLXCG45"));
				objectPart6.setBBCNCLKLXCG46(objectData.getString("BBCNCLKLXCG46"));
				objectPart6.setBBCNCLKLXCG47(objectData.getString("BBCNCLKLXCG47"));
				objectPart6.setBBCNCLKLXCG48(objectData.getString("BBCNCLKLXCG48"));
				objectPart6.setBBCNCLKLXCG49(objectData.getString("BBCNCLKLXCG49"));
				objectPart6.setBBCNCLKLXCG50(objectData.getString("BBCNCLKLXCG50"));
				objectPart6.setBBCNCLKLXCG51(objectData.getString("BBCNCLKLXCG51"));
				objectPart6.setBBCNCLKLXCG52(objectData.getString("BBCNCLKLXCG52"));
				objectPart6.setBBCNCLKLXCG53(objectData.getString("BBCNCLKLXCG53"));
				objectPart6.setBBCNCLKLXCG54(objectData.getString("BBCNCLKLXCG54"));
				objectPart6.setBBKTSPMXCG001(objectData.getString("BBKTSPMXCG001"));
				objectPart6.setBBKTSPMXCG002(objectData.getString("BBKTSPMXCG002"));
				objectPart6.setBBKTSPMXCG003(objectData.getString("BBKTSPMXCG003"));
				objectPart6.setBBKTSPMXCG004(objectData.getString("BBKTSPMXCG004"));
				objectPart6.setBBKTSPMXCG005(objectData.getString("BBKTSPMXCG005"));
				objectPart6.setBBKTSPMXCG006(objectData.getString("BBKTSPMXCG006"));
				objectPart6.setBBKTSPMXCG007(objectData.getString("BBKTSPMXCG007"));
				objectPart6.setBBKTSPMXCG008(objectData.getString("BBKTSPMXCG008"));
				objectPart6.setBBKTSPMXCG009(objectData.getString("BBKTSPMXCG009"));
				objectPart6.setBBKTSPMXCG010(objectData.getString("BBKTSPMXCG010"));
				objectPart6.setBBKTSPMXCG011(objectData.getString("BBKTSPMXCG011"));
				objectPart6.setBBKTSPMXCG012(objectData.getString("BBKTSPMXCG012"));
				objectPart6.setBBKTSPMXCG013(objectData.getString("BBKTSPMXCG013"));
				objectPart6.setBBKTSPMXCG014(objectData.getString("BBKTSPMXCG014"));
				objectPart6.setBBKTSPMXCG015(objectData.getString("BBKTSPMXCG015"));
				objectPart6.setBBKTSPMXCG016(objectData.getString("BBKTSPMXCG016"));
				objectPart6.setBBKTSPMXCG017(objectData.getString("BBKTSPMXCG017"));
				objectPart6.setBBKTSPMXCG018(objectData.getString("BBKTSPMXCG018"));
				objectPart6.setBBKTSPMXCG019(objectData.getString("BBKTSPMXCG019"));
				objectPart6.setBBKTSPMXCG020(objectData.getString("BBKTSPMXCG020"));
				objectPart6.setBBKTSPMXCG021(objectData.getString("BBKTSPMXCG021"));
				objectPart6.setBBKTSPMXCG022(objectData.getString("BBKTSPMXCG022"));
				objectPart6.setBBKTSPMXCG023(objectData.getString("BBKTSPMXCG023"));
				objectPart6.setBBKTSPMXCG024(objectData.getString("BBKTSPMXCG024"));

				objectPart6 = vrTechnicalSpec_XCGPart6Persistence.update(objectPart6);
				JSONObject obj_part6 = BusinessUtil.object2Json_originColumnName(objectPart6,
						VRTechnicalSpec_XCGPart6ModelImpl.class, StringPool.BLANK);

				JSONObject obj = mergeJSON(obj_part0, obj_part1, obj_part2, obj_part3, obj_part4, obj_part5, obj_part6);
				array.put(obj);
			}
		} catch (Exception e) {
			_log.error(e);
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

	private Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XCGLocalServiceImpl.class);
}