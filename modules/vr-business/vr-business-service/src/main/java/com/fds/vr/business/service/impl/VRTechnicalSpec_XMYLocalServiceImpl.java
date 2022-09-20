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

import com.fds.vr.business.model.VRTechnicalSpec_XMY;
import com.fds.vr.business.model.VRTechnicalSpec_XMYPart2;
import com.fds.vr.business.model.VRTechnicalSpec_XMYPart3;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XMYModelImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XMYPart2ModelImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XMYPart3ModelImpl;
import com.fds.vr.business.service.base.VRTechnicalSpec_XMYLocalServiceBaseImpl;
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
 * The implementation of the vr technical spec_xmy local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRTechnicalSpec_XMYLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XMYLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRTechnicalSpec_XMYLocalServiceUtil
 */
@ProviderType
public class VRTechnicalSpec_XMYLocalServiceImpl extends VRTechnicalSpec_XMYLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRTechnicalSpec_XMYLocalServiceUtil} to access
	 * the vr technical spec_xmy local service.
	 */

	public List<VRTechnicalSpec_XMY> findByVehicleCertificateId(long vehicleCertificateId, int start, int end) {
		return vrTechnicalSpec_XMYPersistence.findByvehicleTypeCertificateId(vehicleCertificateId, start, end);
	}

	public List<VRTechnicalSpec_XMY> findByDossierId(long dossierId, int start, int end) {
		return vrTechnicalSpec_XMYPersistence.findBy_DossierId(dossierId, start, end);
	}

	public List<VRTechnicalSpec_XMY> findByConvertAssembleId(long convertAssembleId) throws SystemException {
		try {
			return vrTechnicalSpec_XMYPersistence.findByConvertAssembleId(convertAssembleId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XMY>();

	}

	public List<VRTechnicalSpec_XMY> findByReferenceUid(String referenceUid) throws SystemException {
		try {
			return vrTechnicalSpec_XMYPersistence.findByReferenceUid(referenceUid);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XMY>();

	}

	public List<VRTechnicalSpec_XMY> findByDossierNo(String dossierNo, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_XMYPersistence.findByDossierNo(dossierNo, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XMY>();

	}

	public List<VRTechnicalSpec_XMY> findByDossierId(long dossierId, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_XMYPersistence.findByDossierId(dossierId, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XMY>();

	}

	public List<VRTechnicalSpec_XMY> findByDossierIdCTN(String dossierIdCTN) throws SystemException {
		try {
			return vrTechnicalSpec_XMYPersistence.findByDossierIdCTN(dossierIdCTN);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XMY>();

	}

	public List<VRTechnicalSpec_XMY> findByDeliverableCode(String deliverableCode) throws SystemException {
		try {
			return vrTechnicalSpec_XMYPersistence.findByDeliverableCode(deliverableCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XMY>();
	}

	public JSONArray adminProcessData(JSONArray arrayData, long dossierId, long mtCore, long vehicleTypeCertificateId) {
		JSONArray array = JSONFactoryUtil.createJSONArray();
		vrTechnicalSpec_XMYPersistence.removeByDossierId(dossierId, mtCore);
		vrTechnicalSpec_XMYPart2Persistence.removeByDossierId(dossierId, mtCore);
		vrTechnicalSpec_XMYPart3Persistence.removeByDossierId(dossierId, mtCore);
		Date now = new Date();

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);

			VRTechnicalSpec_XMY object = null;
			long id = counterLocalService.increment(VRTechnicalSpec_XMY.class.getName());
			object = vrTechnicalSpec_XMYPersistence.create(id);

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
			object.setXMY01001(objectData.getString("XMY01001"));
			object.setXMY01002(objectData.getString("XMY01002"));
			object.setXMY01003(objectData.getString("XMY01003"));
			object.setXMY01004(objectData.getString("XMY01004"));
			object.setXMY01005(objectData.getString("XMY01005"));
			object.setXMY01006(objectData.getString("XMY01006"));
			object.setXMY01007(objectData.getString("XMY01007"));
			object.setXMY01008(objectData.getString("XMY01008"));
			object.setXMY01009(objectData.getString("XMY01009"));
			object.setXMY01010(objectData.getString("XMY01010"));
			object.setXMY01011(objectData.getString("XMY01011"));
			object.setXMY01012(objectData.getString("XMY01012"));
			object.setXMY01013(objectData.getString("XMY01013"));
			object.setXMY01014(objectData.getString("XMY01014"));
			object.setXMY01016(objectData.getString("XMY01016"));
			object.setXMY01017(objectData.getString("XMY01017"));
			object.setXMY01019(objectData.getString("XMY01019"));
			object.setXMY01020(objectData.getString("XMY01020"));
			object.setXMY01021(objectData.getString("XMY01021"));
			object.setXMY01022(objectData.getString("XMY01022"));
			object.setXMY01030(objectData.getString("XMY01030"));
			object.setXMY01031(objectData.getString("XMY01031"));
			object.setXMY01032(objectData.getString("XMY01032"));
			object.setXMY01033(objectData.getString("XMY01033"));
			object.setXMY01034(objectData.getString("XMY01034"));
			object.setXMY01035(objectData.getString("XMY01035"));
			object.setXMY01036(objectData.getString("XMY01036"));
			object.setXMY01037(objectData.getString("XMY01037"));
			object.setXMY01038(objectData.getString("XMY01038"));
			object.setXMY01039(objectData.getString("XMY01039"));
			object.setXMY01040(objectData.getString("XMY01040"));
			object.setXMY01041(objectData.getString("XMY01041"));
			object.setXMY01042(objectData.getString("XMY01042"));
			object.setXMY01043(objectData.getString("XMY01043"));
			object.setXMY01044(objectData.getString("XMY01044"));
			object.setXMY01045(objectData.getString("XMY01045"));
			object.setXMY01046(objectData.getString("XMY01046"));
			object.setXMY01047(objectData.getString("XMY01047"));
			object.setXMY01050(objectData.getString("XMY01050"));
			object.setXMY01051(objectData.getString("XMY01051"));
			object.setXMY01052(objectData.getString("XMY01052"));
			object.setXMY01053(objectData.getString("XMY01053"));
			object.setXMY01054(objectData.getString("XMY01054"));
			object.setXMY01055(objectData.getString("XMY01055"));
			object.setXMY01056(objectData.getString("XMY01056"));
			object.setXMY01057(objectData.getString("XMY01057"));
			object.setXMY01058(objectData.getString("XMY01058"));
			object.setXMY01059(objectData.getString("XMY01059"));
			object.setXMY01060(objectData.getString("XMY01060"));
			object.setXMY01062(objectData.getString("XMY01062"));
			object.setXMY01063(objectData.getString("XMY01063"));
			object.setXMY01064(objectData.getString("XMY01064"));
			object.setXMY01065(objectData.getString("XMY01065"));
			object.setXMY01670(objectData.getString("XMY01670"));
			object.setXMY01671(objectData.getString("XMY01671"));
			object.setXMY01672(objectData.getString("XMY01672"));
			object.setXMY01673(objectData.getString("XMY01673"));
			object.setXMY01674(objectData.getString("XMY01674"));
			object.setXMY01675(objectData.getString("XMY01675"));
			object.setXMY01676(objectData.getString("XMY01676"));
			object.setXMY01677(objectData.getString("XMY01677"));
			object.setXMY01678(objectData.getString("XMY01678"));
			object.setXMY01679(objectData.getString("XMY01679"));
			object.setXMY01680(objectData.getString("XMY01680"));
			object.setXMY01681(objectData.getString("XMY01681"));
			object.setXMY01682(objectData.getString("XMY01682"));
			object.setXMY01683(objectData.getString("XMY01683"));
			object.setXMY01684(objectData.getString("XMY01684"));
			object.setXMY01685(objectData.getString("XMY01685"));
			object.setXMY01686(objectData.getString("XMY01686"));
			object.setXMY01687(objectData.getString("XMY01687"));
			object.setXMY01688(objectData.getString("XMY01688"));
			object.setXMY01689(objectData.getString("XMY01689"));
			object.setXMY01690(objectData.getString("XMY01690"));
			object.setXMY01691(objectData.getString("XMY01691"));
			object.setXMY01692(objectData.getString("XMY01692"));
			object.setXMY01693(objectData.getString("XMY01693"));
			object.setXMY01694(objectData.getString("XMY01694"));
			object.setXMY01695(objectData.getString("XMY01695"));
			object.setXMY01696(objectData.getString("XMY01696"));
			object.setXMY01697(objectData.getString("XMY01697"));
			object.setXMY01698(objectData.getString("XMY01698"));
			object.setXMY01699(objectData.getString("XMY01699"));
			object.setXMY01700(objectData.getString("XMY01700"));
			object.setXMY01701(objectData.getString("XMY01701"));
			object.setXMY01702(objectData.getString("XMY01702"));
			object.setXMY01703(objectData.getString("XMY01703"));
			object.setXMY01704(objectData.getString("XMY01704"));
			object.setXMY01705(objectData.getString("XMY01705"));
			object.setXMY01706(objectData.getString("XMY01706"));
			object.setXMY01707(objectData.getString("XMY01707"));
			object.setXMY01708(objectData.getString("XMY01708"));
			object.setXMY01709(objectData.getString("XMY01709"));
			object.setXMY01710(objectData.getString("XMY01710"));
			object.setXMY01711(objectData.getString("XMY01711"));
			object.setXMY01712(objectData.getString("XMY01712"));
			object.setXMY01713(objectData.getString("XMY01713"));
			object.setXMY01714(objectData.getString("XMY01714"));
			object.setXMY01715(objectData.getString("XMY01715"));
			object.setXMY01716(objectData.getString("XMY01716"));
			object.setXMY01717(objectData.getString("XMY01717"));
			object.setXMY01718(objectData.getString("XMY01718"));
			object.setXMY01719(objectData.getString("XMY01719"));
			object.setXMY01720(objectData.getString("XMY01720"));
			object.setXMY01721(objectData.getString("XMY01721"));
			object.setXMY01722(objectData.getString("XMY01722"));
			object.setXMY01723(objectData.getString("XMY01723"));
			object.setXMY01724(objectData.getString("XMY01724"));
			object.setXMY01725(objectData.getString("XMY01725"));
			object.setXMY01726(objectData.getString("XMY01726"));
			object.setXMY01729(objectData.getString("XMY01729"));
			object.setXMY01730(objectData.getString("XMY01730"));
			object.setXMY01731(objectData.getString("XMY01731"));
			object.setXMY01732(objectData.getString("XMY01732"));
			object.setXMY01733(objectData.getString("XMY01733"));
			object.setXMY01734(objectData.getString("XMY01734"));
			object.setXMY01735(objectData.getString("XMY01735"));
			object.setXMY01736(objectData.getString("XMY01736"));
			object.setXMY01737(objectData.getString("XMY01737"));
			object.setXMY01738(objectData.getString("XMY01738"));
			object.setXMY01739(objectData.getString("XMY01739"));
			object.setXMY01740(objectData.getString("XMY01740"));
			object.setXMY01741(objectData.getString("XMY01741"));
			object.setXMY01742(objectData.getString("XMY01742"));
			object.setXMY01744(objectData.getString("XMY01744"));
			object.setXMY01745(objectData.getString("XMY01745"));
			object.setXMY01746(objectData.getString("XMY01746"));
			object.setXMY01747(objectData.getString("XMY01747"));
			object.setXMY01748(objectData.getString("XMY01748"));
			object.setXMY01749(objectData.getString("XMY01749"));
			object.setXMY01758(objectData.getString("XMY01758"));
			object.setXMY01759(objectData.getString("XMY01759"));
			object.setXMY01760(objectData.getString("XMY01760"));
			object.setXMY01761(objectData.getString("XMY01761"));
			object.setXMY01762(objectData.getString("XMY01762"));
			object.setXMY01763(objectData.getString("XMY01763"));
			object.setXMY01764(objectData.getString("XMY01764"));
			object.setXMY01779(objectData.getString("XMY01779"));
			object.setXMY01780(objectData.getString("XMY01780"));
			object.setXMY01781(objectData.getString("XMY01781"));
			object.setXMY01782(objectData.getString("XMY01782"));
			object.setXMY01783(objectData.getString("XMY01783"));
			object.setXMY01785(objectData.getString("XMY01785"));
			object.setXMY01786(objectData.getString("XMY01786"));
			object.setXMY01787(objectData.getString("XMY01787"));
			object.setXMY01788(objectData.getString("XMY01788"));
			object.setXMY01789(objectData.getString("XMY01789"));
			object.setXMY01790(objectData.getString("XMY01790"));
			object.setXMY01791(objectData.getString("XMY01791"));
			object.setXMY01792(objectData.getString("XMY01792"));
			object.setXMY01793(objectData.getString("XMY01793"));
			object.setXMY01794(objectData.getString("XMY01794"));
			object.setXMY01795(objectData.getString("XMY01795"));
			object.setXMY01796(objectData.getString("XMY01796"));
			object.setXMY01797(objectData.getString("XMY01797"));
			object.setXMY01798(objectData.getString("XMY01798"));
			object.setXMY01799(objectData.getString("XMY01799"));
			object.setXMY01800(objectData.getString("XMY01800"));
			object.setXMY01801(objectData.getString("XMY01801"));
			object.setXMY01802(objectData.getString("XMY01802"));
			object.setXMY01804(objectData.getString("XMY01804"));
			object.setXMY01805(objectData.getString("XMY01805"));
			object.setXMY01806(objectData.getString("XMY01806"));
			object.setXMY01807(objectData.getString("XMY01807"));
			object.setXMY01808(objectData.getString("XMY01808"));
			object.setXMY01809(objectData.getString("XMY01809"));
			object.setXMY01810(objectData.getString("XMY01810"));
			object.setXMY01811(objectData.getString("XMY01811"));
			object.setXMY01812(objectData.getString("XMY01812"));
			object.setXMY01813(objectData.getString("XMY01813"));
			object.setXMY01814(objectData.getString("XMY01814"));

			object = vrTechnicalSpec_XMYPersistence.update(object);
			JSONObject obj_part1 = null;
			try {
				obj_part1 = BusinessUtil.object2Json_originColumnName(object, VRTechnicalSpec_XMYModelImpl.class,
						StringPool.BLANK);
			} catch (JSONException e1) {
			}

			VRTechnicalSpec_XMYPart2 objectPart2 = null;
			objectPart2 = vrTechnicalSpec_XMYPart2Persistence.fetchByPrimaryKey(object.getPrimaryKey());

			objectPart2.setMtCore(objectData.getLong("mtCore"));
			objectPart2.setConvertAssembleId(objectData.getLong("convertAssembleId"));
			objectPart2.setDossierId(objectData.getLong("dossierId"));
			objectPart2.setDossierNo(objectData.getString("dossierNo"));
			objectPart2.setReferenceUid(objectData.getString("referenceUid"));
			objectPart2.setDossierIdCTN(objectData.getString("dossierIdCTN"));
			objectPart2.setDeliverableCode(objectData.getString("deliverableCode"));
			objectPart2.setXMY0010(objectData.getString("XMY0010"));
			objectPart2.setXMY0011(objectData.getString("XMY0011"));
			objectPart2.setXMY0012(objectData.getString("XMY0012"));
			objectPart2.setXMY0013(objectData.getString("XMY0013"));
			objectPart2.setXMY0014(objectData.getString("XMY0014"));
			objectPart2.setXMY0015(objectData.getString("XMY0015"));
			objectPart2.setXMY0016(objectData.getString("XMY0016"));
			objectPart2.setXMY0017(objectData.getString("XMY0017"));
			objectPart2.setXMY0018(objectData.getString("XMY0018"));
			objectPart2.setXMY0019(objectData.getString("XMY0019"));
			objectPart2.setXMY0020(objectData.getString("XMY0020"));
			objectPart2.setXMY0021(objectData.getString("XMY0021"));
			objectPart2.setXMY0022(objectData.getString("XMY0022"));
			objectPart2.setXMY0023(objectData.getString("XMY0023"));
			objectPart2.setXMY0024(objectData.getString("XMY0024"));
			objectPart2.setXMY0025(objectData.getString("XMY0025"));
			objectPart2.setXMY0026(objectData.getString("XMY0026"));
			objectPart2.setXMY0027(objectData.getString("XMY0027"));
			objectPart2.setXMY0028(objectData.getString("XMY0028"));
			objectPart2.setXMY0029(objectData.getString("XMY0029"));
			objectPart2.setXMY0030(objectData.getString("XMY0030"));
			objectPart2.setXMY0031(objectData.getString("XMY0031"));
			objectPart2.setXMY0032(objectData.getString("XMY0032"));
			objectPart2.setXMY0033(objectData.getString("XMY0033"));
			objectPart2.setXMY0034(objectData.getString("XMY0034"));
			objectPart2.setXMY0036(objectData.getString("XMY0036"));
			objectPart2.setXMY0037(objectData.getString("XMY0037"));
			objectPart2.setXMY0038(objectData.getString("XMY0038"));
			objectPart2.setXMY0039(objectData.getString("XMY0039"));
			objectPart2.setXMY0040(objectData.getString("XMY0040"));
			objectPart2.setXMY0041(objectData.getString("XMY0041"));
			objectPart2.setXMY0042(objectData.getString("XMY0042"));
			objectPart2.setXMY0043(objectData.getString("XMY0043"));
			objectPart2.setXMY0044(objectData.getString("XMY0044"));
			objectPart2.setXMY0045(objectData.getString("XMY0045"));
			objectPart2.setXMY0046(objectData.getString("XMY0046"));
			objectPart2.setXMY0048(objectData.getString("XMY0048"));
			objectPart2.setXMY0049(objectData.getString("XMY0049"));
			objectPart2.setXMY0050(objectData.getString("XMY0050"));
			objectPart2.setXMY0051(objectData.getString("XMY0051"));
			objectPart2.setXMY0052(objectData.getString("XMY0052"));
			objectPart2.setXMY0053(objectData.getString("XMY0053"));
			objectPart2.setXMY0054(objectData.getString("XMY0054"));
			objectPart2.setXMY0055(objectData.getString("XMY0055"));
			objectPart2.setXMY0056(objectData.getString("XMY0056"));
			objectPart2.setXMY0057(objectData.getString("XMY0057"));
			objectPart2.setXMY0058(objectData.getString("XMY0058"));
			objectPart2.setXMY0059(objectData.getString("XMY0059"));
			objectPart2.setXMY0060(objectData.getString("XMY0060"));
			objectPart2.setXMY0061(objectData.getString("XMY0061"));
			objectPart2.setXMY0062(objectData.getString("XMY0062"));
			objectPart2.setXMY0063(objectData.getString("XMY0063"));
			objectPart2.setXMY0064(objectData.getString("XMY0064"));
			objectPart2.setXMY0065(objectData.getString("XMY0065"));
			objectPart2.setXMY0066(objectData.getString("XMY0066"));
			objectPart2.setXMY0067(objectData.getString("XMY0067"));
			objectPart2.setXMY0068(objectData.getString("XMY0068"));
			objectPart2.setXMY0070(objectData.getString("XMY0070"));
			objectPart2.setXMY0071(objectData.getString("XMY0071"));
			objectPart2.setXMY0072(objectData.getString("XMY0072"));
			objectPart2.setXMY0073(objectData.getString("XMY0073"));
			objectPart2.setXMY0074(objectData.getString("XMY0074"));
			objectPart2.setXMY0075(objectData.getString("XMY0075"));
			objectPart2.setXMY0076(objectData.getString("XMY0076"));
			objectPart2.setXMY0077(objectData.getString("XMY0077"));
			objectPart2.setXMY0078(objectData.getString("XMY0078"));
			objectPart2.setXMY0079(objectData.getString("XMY0079"));
			objectPart2.setXMY0080(objectData.getString("XMY0080"));
			objectPart2.setXMY0081(objectData.getString("XMY0081"));
			objectPart2.setXMY0082(objectData.getString("XMY0082"));
			objectPart2.setXMY0083(objectData.getString("XMY0083"));
			objectPart2.setXMY0084(objectData.getString("XMY0084"));
			objectPart2.setXMY0085(objectData.getString("XMY0085"));
			objectPart2.setXMY0086(objectData.getString("XMY0086"));
			objectPart2.setXMY0087(objectData.getString("XMY0087"));
			objectPart2.setXMY0088(objectData.getString("XMY0088"));
			objectPart2.setXMY0089(objectData.getString("XMY0089"));
			objectPart2.setXMY0090(objectData.getString("XMY0090"));
			objectPart2.setXMY0091(objectData.getString("XMY0091"));
			objectPart2.setXMY0092(objectData.getString("XMY0092"));
			objectPart2.setXMY0093(objectData.getString("XMY0093"));
			objectPart2.setXMY0094(objectData.getString("XMY0094"));
			objectPart2.setXMY0095(objectData.getString("XMY0095"));
			objectPart2.setXMY0096(objectData.getString("XMY0096"));
			objectPart2.setXMY0097(objectData.getString("XMY0097"));
			objectPart2.setXMY0098(objectData.getString("XMY0098"));
			objectPart2.setXMY0099(objectData.getString("XMY0099"));
			objectPart2.setXMY0100(objectData.getString("XMY0100"));
			objectPart2.setXMY0101(objectData.getString("XMY0101"));
			objectPart2.setXMY0102(objectData.getString("XMY0102"));
			objectPart2.setXMY0103(objectData.getString("XMY0103"));
			objectPart2.setXMY0104(objectData.getString("XMY0104"));
			objectPart2.setXMY0105(objectData.getString("XMY0105"));
			objectPart2.setXMY0106(objectData.getString("XMY0106"));
			objectPart2.setXMY0107(objectData.getString("XMY0107"));
			objectPart2.setXMY0108(objectData.getString("XMY0108"));
			objectPart2.setXMY0109(objectData.getString("XMY0109"));
			objectPart2.setXMY0110(objectData.getString("XMY0110"));
			objectPart2.setXMY0111(objectData.getString("XMY0111"));
			objectPart2.setXMY0112(objectData.getString("XMY0112"));
			objectPart2.setXMY0113(objectData.getString("XMY0113"));
			objectPart2.setXMY0114(objectData.getString("XMY0114"));
			objectPart2.setXMY0115(objectData.getString("XMY0115"));
			objectPart2.setXMY0116(objectData.getString("XMY0116"));
			objectPart2.setXMY0117(objectData.getString("XMY0117"));
			objectPart2.setXMY0118(objectData.getString("XMY0118"));
			objectPart2.setXMY0119(objectData.getString("XMY0119"));
			objectPart2.setXMY0120(objectData.getString("XMY0120"));
			objectPart2.setXMY0121(objectData.getString("XMY0121"));
			objectPart2.setXMY0122(objectData.getString("XMY0122"));
			objectPart2.setXMY0123(objectData.getString("XMY0123"));
			objectPart2.setXMY0124(objectData.getString("XMY0124"));
			objectPart2.setXMY0125(objectData.getString("XMY0125"));
			objectPart2.setXMY0126(objectData.getString("XMY0126"));
			objectPart2.setXMY0127(objectData.getString("XMY0127"));
			objectPart2.setXMY0128(objectData.getString("XMY0128"));
			objectPart2.setXMY0129(objectData.getString("XMY0129"));
			objectPart2.setXMY0130(objectData.getString("XMY0130"));
			objectPart2.setXMY0131(objectData.getString("XMY0131"));
			objectPart2.setXMY0132(objectData.getString("XMY0132"));
			objectPart2.setXMY0133(objectData.getString("XMY0133"));
			objectPart2.setXMY0134(objectData.getString("XMY0134"));
			objectPart2.setXMY0135(objectData.getString("XMY0135"));
			objectPart2.setXMY0136(objectData.getString("XMY0136"));
			objectPart2.setXMY0137(objectData.getString("XMY0137"));
			objectPart2.setXMY0138(objectData.getString("XMY0138"));
			objectPart2.setXMY0139(objectData.getString("XMY0139"));
			objectPart2.setXMY0140(objectData.getString("XMY0140"));
			objectPart2.setXMY0141(objectData.getString("XMY0141"));
			objectPart2.setXMY0142(objectData.getString("XMY0142"));
			objectPart2.setXMY0143(objectData.getString("XMY0143"));
			objectPart2.setXMY0144(objectData.getString("XMY0144"));
			objectPart2.setXMY0145(objectData.getString("XMY0145"));
			objectPart2.setXMY0146(objectData.getString("XMY0146"));
			objectPart2.setXMY0147(objectData.getString("XMY0147"));
			objectPart2.setXMY0148(objectData.getString("XMY0148"));

			objectPart2 = vrTechnicalSpec_XMYPart2Persistence.update(objectPart2);
			JSONObject obj_part2 = null;
			try {
				obj_part2 = BusinessUtil.object2Json_originColumnName(objectPart2,
						VRTechnicalSpec_XMYPart2ModelImpl.class, StringPool.BLANK);
			} catch (JSONException e) {
			}

			VRTechnicalSpec_XMYPart3 objectPart3 = null;
			objectPart3 = vrTechnicalSpec_XMYPart3Persistence.fetchByPrimaryKey(object.getPrimaryKey());

			objectPart3.setMtCore(objectData.getLong("mtCore"));
			objectPart3.setConvertAssembleId(objectData.getLong("convertAssembleId"));
			objectPart3.setDossierId(objectData.getLong("dossierId"));
			objectPart3.setDossierNo(objectData.getString("dossierNo"));
			objectPart3.setReferenceUid(objectData.getString("referenceUid"));
			objectPart3.setDossierIdCTN(objectData.getString("dossierIdCTN"));
			objectPart3.setDeliverableCode(objectData.getString("deliverableCode"));
			objectPart3.setXMY0149(objectData.getString("XMY0149"));
			objectPart3.setXMY0150(objectData.getString("XMY0150"));
			objectPart3.setXMY0151(objectData.getString("XMY0151"));
			objectPart3.setXMY0152(objectData.getString("XMY0152"));
			objectPart3.setXMY0153(objectData.getString("XMY0153"));
			objectPart3.setXMY0154(objectData.getString("XMY0154"));
			objectPart3.setXMY0155(objectData.getString("XMY0155"));
			objectPart3.setXMY0156(objectData.getString("XMY0156"));
			objectPart3.setXMY0157(objectData.getString("XMY0157"));
			objectPart3.setXMY0158(objectData.getString("XMY0158"));
			objectPart3.setXMY0159(objectData.getString("XMY0159"));
			objectPart3.setXMY0160(objectData.getString("XMY0160"));
			objectPart3.setXMY0161(objectData.getString("XMY0161"));
			objectPart3.setXMY0162(objectData.getString("XMY0162"));
			objectPart3.setXMY0163(objectData.getString("XMY0163"));
			objectPart3.setXMY0164(objectData.getString("XMY0164"));
			objectPart3.setXMY0165(objectData.getString("XMY0165"));
			objectPart3.setXMY0166(objectData.getString("XMY0166"));
			objectPart3.setXMY0167(objectData.getString("XMY0167"));
			objectPart3.setXMY0168(objectData.getString("XMY0168"));
			objectPart3.setXMY0169(objectData.getString("XMY0169"));
			objectPart3.setXMY0170(objectData.getString("XMY0170"));
			objectPart3.setXMY0171(objectData.getString("XMY0171"));
			objectPart3.setXMY0172(objectData.getString("XMY0172"));
			objectPart3.setXMY0173(objectData.getString("XMY0173"));
			objectPart3.setXMY0174(objectData.getString("XMY0174"));
			objectPart3.setXMY0175(objectData.getString("XMY0175"));
			objectPart3.setXMY0176(objectData.getString("XMY0176"));
			objectPart3.setXMY0177(objectData.getString("XMY0177"));
			objectPart3.setXMY0178(objectData.getString("XMY0178"));
			objectPart3.setXMY0179(objectData.getString("XMY0179"));
			objectPart3.setXMY0180(objectData.getString("XMY0180"));
			objectPart3.setXMY0181(objectData.getString("XMY0181"));
			objectPart3.setXMY0182(objectData.getString("XMY0182"));
			objectPart3.setXMY0183(objectData.getString("XMY0183"));
			objectPart3.setXMY0184(objectData.getString("XMY0184"));
			objectPart3.setXMY0185(objectData.getString("XMY0185"));
			objectPart3.setXMY0186(objectData.getString("XMY0186"));
			objectPart3.setXMY0187(objectData.getString("XMY0187"));
			objectPart3.setXMY0188(objectData.getString("XMY0188"));
			objectPart3.setXMY0189(objectData.getString("XMY0189"));
			objectPart3.setXMY0190(objectData.getString("XMY0190"));
			objectPart3.setXMY0191(objectData.getString("XMY0191"));
			objectPart3.setXMY0192(objectData.getString("XMY0192"));
			objectPart3.setXMY0193(objectData.getString("XMY0193"));
			objectPart3.setXMY0194(objectData.getString("XMY0194"));
			objectPart3.setXMY0195(objectData.getString("XMY0195"));
			objectPart3.setXMY0196(objectData.getString("XMY0196"));
			objectPart3.setXMY0197(objectData.getString("XMY0197"));
			objectPart3.setXMY0198(objectData.getString("XMY0198"));
			objectPart3.setXMY0199(objectData.getString("XMY0199"));
			objectPart3.setXMY0200(objectData.getString("XMY0200"));
			objectPart3.setXMY0201(objectData.getString("XMY0201"));
			objectPart3.setXMY0202(objectData.getString("XMY0202"));
			objectPart3.setXMY0203(objectData.getString("XMY0203"));
			objectPart3.setXMY0204(objectData.getString("XMY0204"));
			objectPart3.setXMY0205(objectData.getString("XMY0205"));
			objectPart3.setXMY0207(objectData.getString("XMY0207"));
			objectPart3.setXMY0208(objectData.getString("XMY0208"));
			objectPart3.setXMY0209(objectData.getString("XMY0209"));
			objectPart3.setXMY0210(objectData.getString("XMY0210"));
			objectPart3.setXMY0211(objectData.getString("XMY0211"));
			objectPart3.setXMY0212(objectData.getString("XMY0212"));
			objectPart3.setXMY0213(objectData.getString("XMY0213"));
			objectPart3.setXMY0214(objectData.getString("XMY0214"));
			objectPart3.setXMY0215(objectData.getString("XMY0215"));
			objectPart3.setXMY0216(objectData.getString("XMY0216"));
			objectPart3.setXMY0217(objectData.getString("XMY0217"));
			objectPart3.setXMY0218(objectData.getString("XMY0218"));
			objectPart3.setXMY0219(objectData.getString("XMY0219"));
			objectPart3.setXMY0220(objectData.getString("XMY0220"));
			objectPart3.setXMY0221(objectData.getString("XMY0221"));
			objectPart3.setXMY0222(objectData.getString("XMY0222"));
			objectPart3.setXMY0223(objectData.getString("XMY0223"));
			objectPart3.setXMY0224(objectData.getString("XMY0224"));
			objectPart3.setXMY0225(objectData.getString("XMY0225"));
			objectPart3.setXMY0226(objectData.getString("XMY0226"));
			objectPart3.setXMY0227(objectData.getString("XMY0227"));
			objectPart3.setXMY0228(objectData.getString("XMY0228"));
			objectPart3.setXMY0229(objectData.getString("XMY0229"));
			objectPart3.setXMY0230(objectData.getString("XMY0230"));
			objectPart3.setXMY0231(objectData.getString("XMY0231"));
			objectPart3.setXMY0232(objectData.getString("XMY0232"));
			objectPart3.setXMY0233(objectData.getString("XMY0233"));
			objectPart3.setXMY0234(objectData.getString("XMY0234"));
			objectPart3.setXMY0235(objectData.getString("XMY0235"));
			objectPart3.setXMY0236(objectData.getString("XMY0236"));
			objectPart3.setXMY0237(objectData.getString("XMY0237"));
			objectPart3.setXMY0238(objectData.getString("XMY0238"));
			objectPart3.setXMY0239(objectData.getString("XMY0239"));
			objectPart3.setXMY0240(objectData.getString("XMY0240"));
			objectPart3.setXMY0241(objectData.getString("XMY0241"));
			objectPart3.setXMY0242(objectData.getString("XMY0242"));
			objectPart3.setXMY0243(objectData.getString("XMY0243"));
			objectPart3.setXMY0244(objectData.getString("XMY0244"));
			objectPart3.setXMY0245(objectData.getString("XMY0245"));
			objectPart3.setXMY0246(objectData.getString("XMY0246"));
			objectPart3.setXMY0247(objectData.getString("XMY0247"));
			objectPart3.setXMY0248(objectData.getString("XMY0248"));
			objectPart3.setXMY0249(objectData.getString("XMY0249"));
			objectPart3.setXMY0250(objectData.getString("XMY0250"));
			objectPart3.setXMY0251(objectData.getString("XMY0251"));
			objectPart3.setXMY0252(objectData.getString("XMY0252"));
			objectPart3.setXMY0253(objectData.getString("XMY0253"));
			objectPart3.setXMY0254(objectData.getString("XMY0254"));
			objectPart3.setXMY0255(objectData.getString("XMY0255"));
			objectPart3.setXMY0256(objectData.getString("XMY0256"));
			objectPart3.setXMY0257(objectData.getString("XMY0257"));
			objectPart3.setXMY0258(objectData.getString("XMY0258"));
			objectPart3.setXMY0259(objectData.getString("XMY0259"));
			objectPart3.setXMY0260(objectData.getString("XMY0260"));
			objectPart3.setXMY0261(objectData.getString("XMY0261"));
			objectPart3.setXMY0262(objectData.getString("XMY0262"));
			objectPart3.setXMY0263(objectData.getString("XMY0263"));
			objectPart3.setXMY0264(objectData.getString("XMY0264"));
			objectPart3.setBBCNCLKLXMY001(objectData.getString("BBCNCLKLXMY001"));
			objectPart3.setBBCNCLKLXMY002(objectData.getString("BBCNCLKLXMY002"));
			objectPart3.setBBCNCLKLXMY003(objectData.getString("BBCNCLKLXMY003"));
			objectPart3.setBBCNCLKLXMY004(objectData.getString("BBCNCLKLXMY004"));
			objectPart3.setBBCNCLKLXMY005(objectData.getString("BBCNCLKLXMY005"));
			objectPart3.setBBCNCLKLXMY006(objectData.getString("BBCNCLKLXMY006"));
			objectPart3.setBBCNCLKLXMY012(objectData.getString("BBCNCLKLXMY012"));
			objectPart3.setBBCNCLKLXMY013(objectData.getString("BBCNCLKLXMY013"));
			objectPart3.setBBCNCLKLXMY014(objectData.getString("BBCNCLKLXMY014"));
			objectPart3.setBBCNCLKLXMY015(objectData.getString("BBCNCLKLXMY015"));
			objectPart3.setBBCNCLKLXMY016(objectData.getString("BBCNCLKLXMY016"));
			objectPart3.setBBCNCLKLXMY017(objectData.getString("BBCNCLKLXMY017"));
			objectPart3.setBBCNCLKLXMY018(objectData.getString("BBCNCLKLXMY018"));
			objectPart3.setBBCNCLKLXMY019(objectData.getString("BBCNCLKLXMY019"));
			objectPart3.setBBCNCLKLXMY020(objectData.getString("BBCNCLKLXMY020"));
			objectPart3.setBBCNCLKLXMY021(objectData.getString("BBCNCLKLXMY021"));
			objectPart3.setBBCNCLKLXMY022(objectData.getString("BBCNCLKLXMY022"));
			objectPart3.setBBCNCLKLXMY024(objectData.getString("BBCNCLKLXMY024"));
			objectPart3.setBBCNCLKLXMY026(objectData.getString("BBCNCLKLXMY026"));
			objectPart3.setBBCNCLKLXMY027(objectData.getString("BBCNCLKLXMY027"));
			objectPart3.setBBCNCLKLXMY028(objectData.getString("BBCNCLKLXMY028"));
			objectPart3.setBBCNCLKLXMY029(objectData.getString("BBCNCLKLXMY029"));
			objectPart3.setBBCNCLKLXMY033(objectData.getString("BBCNCLKLXMY033"));
			objectPart3.setBBCNCLKLXMY034(objectData.getString("BBCNCLKLXMY034"));
			objectPart3.setBBCNCLKLXMY037(objectData.getString("BBCNCLKLXMY037"));
			objectPart3.setBBCNCLKLXMY038(objectData.getString("BBCNCLKLXMY038"));
			objectPart3.setBBCNCLKLXMY039(objectData.getString("BBCNCLKLXMY039"));
			objectPart3.setBBCNCLKLXMY040(objectData.getString("BBCNCLKLXMY040"));
			objectPart3.setBBCNCLKLXMY041(objectData.getString("BBCNCLKLXMY041"));
			objectPart3.setBBCNCLKLXMY042(objectData.getString("BBCNCLKLXMY042"));
			objectPart3.setBBCNCLKLXMY043(objectData.getString("BBCNCLKLXMY043"));
			objectPart3.setBBCNCLKLXMY044(objectData.getString("BBCNCLKLXMY044"));
			objectPart3.setBBCNCLKLXMY045(objectData.getString("BBCNCLKLXMY045"));
			objectPart3.setBBCNCLKLXDD030(objectData.getString("BBCNCLKLXDD030"));
			objectPart3.setBBCNCLKLXMY046(objectData.getString("BBCNCLKLXMY046"));
			objectPart3.setBBCNCLKLXMY047(objectData.getString("BBCNCLKLXMY047"));
			objectPart3.setBBCNCLKLXMY053(objectData.getString("BBCNCLKLXMY053"));

			objectPart3 = vrTechnicalSpec_XMYPart3Persistence.update(objectPart3);
			JSONObject obj_part3 = null;
			try {
				obj_part3 = BusinessUtil.object2Json_originColumnName(objectPart3,
						VRTechnicalSpec_XMYPart3ModelImpl.class, StringPool.BLANK);
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

	private Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XMYLocalServiceImpl.class);
}