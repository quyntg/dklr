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

import com.fds.vr.business.model.VRTechnicalSpec_LKXMY;
import com.fds.vr.business.model.VRTechnicalSpec_LKXMYPart2;
import com.fds.vr.business.model.impl.VRTechnicalSpec_LKXMYModelImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_LKXMYPart2ModelImpl;
import com.fds.vr.business.service.base.VRTechnicalSpec_LKXMYLocalServiceBaseImpl;
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
 * The implementation of the vr technical spec_lkxmy local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRTechnicalSpec_LKXMYLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_LKXMYLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRTechnicalSpec_LKXMYLocalServiceUtil
 */
@ProviderType
public class VRTechnicalSpec_LKXMYLocalServiceImpl extends VRTechnicalSpec_LKXMYLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRTechnicalSpec_LKXMYLocalServiceUtil} to access
	 * the vr technical spec_lkxmy local service.
	 */

	public List<VRTechnicalSpec_LKXMY> findByVehicleCertificateId(long vehicleCertificateId, int start, int end) {
		return vrTechnicalSpec_LKXMYPersistence.findByvehicleTypeCertificateId(vehicleCertificateId, start, end);
	}

	public List<VRTechnicalSpec_LKXMY> findByDossierId(long dossierId, int start, int end) {
		return vrTechnicalSpec_LKXMYPersistence.findBy_DossierId(dossierId, start, end);
	}

	public List<VRTechnicalSpec_LKXMY> findByConvertAssembleId(long convertAssembleId) throws SystemException {
		try {
			return vrTechnicalSpec_LKXMYPersistence.findByConvertAssembleId(convertAssembleId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXMY>();

	}

	public List<VRTechnicalSpec_LKXMY> findByReferenceUid(String referenceUid) throws SystemException {
		try {
			return vrTechnicalSpec_LKXMYPersistence.findByReferenceUid(referenceUid);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXMY>();

	}

	public List<VRTechnicalSpec_LKXMY> findByDossierNo(String dossierNo, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_LKXMYPersistence.findByDossierNo(dossierNo, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXMY>();

	}

	public List<VRTechnicalSpec_LKXMY> findByDossierId(long dossierId, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_LKXMYPersistence.findByDossierId(dossierId, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXMY>();

	}

	public List<VRTechnicalSpec_LKXMY> findByDossierIdCTN(String dossierIdCTN) throws SystemException {
		try {
			return vrTechnicalSpec_LKXMYPersistence.findByDossierIdCTN(dossierIdCTN);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXMY>();

	}

	public List<VRTechnicalSpec_LKXMY> findByDeliverableCode(String deliverableCode) throws SystemException {
		try {
			return vrTechnicalSpec_LKXMYPersistence.findByDeliverableCode(deliverableCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXMY>();

	}

	public JSONArray adminProcessData(JSONArray arrayData, long dossierId, long mtCore, long vehicleTypeCertificateId) {
		JSONArray array = JSONFactoryUtil.createJSONArray();
		vrTechnicalSpec_LKXMYPersistence.removeByDossierId(dossierId, mtCore);
		vrTechnicalSpec_LKXMYPart2Persistence.removeByDossierId(dossierId, mtCore);

		Date now = new Date();
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);

			VRTechnicalSpec_LKXMY object = null;
			long id = counterLocalService.increment(VRTechnicalSpec_LKXMY.class.getName());
			object = vrTechnicalSpec_LKXMYPersistence.create(id);

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
			object.setLKXMY01050(objectData.getString("LKXMY01050"));
			object.setLKXMY01051(objectData.getString("LKXMY01051"));
			object.setLKXMY01052(objectData.getString("LKXMY01052"));
			object.setLKXMY01053(objectData.getString("LKXMY01053"));
			object.setLKXMY01026(objectData.getString("LKXMY01026"));
			object.setLKXMY0401(objectData.getString("LKXMY0401"));
			object.setLKXMY0402(objectData.getString("LKXMY0402"));
			object.setLKXMY0403(objectData.getString("LKXMY0403"));
			object.setLKXMY0404(objectData.getString("LKXMY0404"));
			object.setLKXMY0405(objectData.getString("LKXMY0405"));
			object.setLKXMY0406(objectData.getString("LKXMY0406"));
			object.setLKXMY1307(objectData.getString("LKXMY1307"));
			object.setLKXMY1308(objectData.getString("LKXMY1308"));
			object.setLKXMY1309(objectData.getString("LKXMY1309"));
			object.setLKXMY1310(objectData.getString("LKXMY1310"));
			object.setLKXMY1311(objectData.getString("LKXMY1311"));
			object.setLKXMY1312(objectData.getString("LKXMY1312"));
			object.setLKXMY1207(objectData.getString("LKXMY1207"));
			object.setLKXMY1208(objectData.getString("LKXMY1208"));
			object.setLKXMY1209(objectData.getString("LKXMY1209"));
			object.setLKXMY1210(objectData.getString("LKXMY1210"));
			object.setLKXMY1211(objectData.getString("LKXMY1211"));
			object.setLKXMY0201(objectData.getString("LKXMY0201"));
			object.setLKXMY0202(objectData.getString("LKXMY0202"));
			object.setLKXMY0203(objectData.getString("LKXMY0203"));
			object.setLKXMY0204(objectData.getString("LKXMY0204"));
			object.setLKXMY0205(objectData.getString("LKXMY0205"));
			object.setLKXMY0206(objectData.getString("LKXMY0206"));
			object.setLKXMY0207(objectData.getString("LKXMY0207"));
			object.setLKXMY0208(objectData.getString("LKXMY0208"));
			object.setLKXMY0209(objectData.getString("LKXMY0209"));
			object.setLKXMY0210(objectData.getString("LKXMY0210"));
			object.setLKXMY0211(objectData.getString("LKXMY0211"));
			object.setLKXMY0212(objectData.getString("LKXMY0212"));
			object.setLKXMY0213(objectData.getString("LKXMY0213"));
			object.setLKXMY0214(objectData.getString("LKXMY0214"));
			object.setLKXMY0215(objectData.getString("LKXMY0215"));
			object.setLKXMY0216(objectData.getString("LKXMY0216"));
			object.setLKXMY0217(objectData.getString("LKXMY0217"));
			object.setLKXMY0218(objectData.getString("LKXMY0218"));
			object.setLKXMY0219(objectData.getString("LKXMY0219"));
			object.setLKXMY0040(objectData.getString("LKXMY0040"));
			object.setLKXMY0041(objectData.getString("LKXMY0041"));
			object.setLKXMY0042(objectData.getString("LKXMY0042"));
			object.setLKXMY0043(objectData.getString("LKXMY0043"));
			object.setLKXMY0044(objectData.getString("LKXMY0044"));
			object.setLKXMY0045(objectData.getString("LKXMY0045"));
			object.setLKXMY0046(objectData.getString("LKXMY0046"));
			object.setLKXMY0048(objectData.getString("LKXMY0048"));
			object.setLKXMY0049(objectData.getString("LKXMY0049"));
			object.setLKXMY0050(objectData.getString("LKXMY0050"));
			object.setLKXMY0051(objectData.getString("LKXMY0051"));
			object.setLKXMY0052(objectData.getString("LKXMY0052"));
			object.setLKXMY0054(objectData.getString("LKXMY0054"));
			object.setLKXMY0055(objectData.getString("LKXMY0055"));
			object.setLKXMY0056(objectData.getString("LKXMY0056"));
			object.setLKXMY0057(objectData.getString("LKXMY0057"));
			object.setLKXMY0058(objectData.getString("LKXMY0058"));
			object.setLKXMY0059(objectData.getString("LKXMY0059"));
			object.setLKXMY0060(objectData.getString("LKXMY0060"));
			object.setLKXMY0061(objectData.getString("LKXMY0061"));
			object.setLKXMY0062(objectData.getString("LKXMY0062"));
			object.setLKXMY0063(objectData.getString("LKXMY0063"));
			object.setLKXMY0109(objectData.getString("LKXMY0109"));
			object.setLKXMY0110(objectData.getString("LKXMY0110"));
			object.setLKXMY0111(objectData.getString("LKXMY0111"));
			object.setLKXMY0112(objectData.getString("LKXMY0112"));
			object.setLKXMY0113(objectData.getString("LKXMY0113"));
			object.setLKXMY0114(objectData.getString("LKXMY0114"));
			object.setLKXMY0115(objectData.getString("LKXMY0115"));
			object.setLKXMY0116(objectData.getString("LKXMY0116"));
			object.setLKXMY0117(objectData.getString("LKXMY0117"));
			object.setLKXMY0118(objectData.getString("LKXMY0118"));
			object.setLKXMY0119(objectData.getString("LKXMY0119"));
			object.setLKXMY0120(objectData.getString("LKXMY0120"));
			object.setLKXMY0121(objectData.getString("LKXMY0121"));
			object.setLKXMY0122(objectData.getString("LKXMY0122"));
			object.setLKXMY0123(objectData.getString("LKXMY0123"));
			object.setLKXMY0124(objectData.getString("LKXMY0124"));
			object.setLKXMY0125(objectData.getString("LKXMY0125"));
			object.setLKXMY0126(objectData.getString("LKXMY0126"));
			object.setLKXMY0127(objectData.getString("LKXMY0127"));
			object.setLKXMY0128(objectData.getString("LKXMY0128"));
			object.setLKXMY0129(objectData.getString("LKXMY0129"));
			object.setLKXMY0130(objectData.getString("LKXMY0130"));
			object.setLKXMY0131(objectData.getString("LKXMY0131"));
			object.setLKXMY0064(objectData.getString("LKXMY0064"));
			object.setLKXMY0132(objectData.getString("LKXMY0132"));
			object.setLKXMY0133(objectData.getString("LKXMY0133"));
			object.setLKXMY0134(objectData.getString("LKXMY0134"));
			object.setLKXMY0135(objectData.getString("LKXMY0135"));
			object.setLKXMY0136(objectData.getString("LKXMY0136"));
			object.setLKXMY0137(objectData.getString("LKXMY0137"));
			object.setLKXMY0138(objectData.getString("LKXMY0138"));
			object.setLKXMY0139(objectData.getString("LKXMY0139"));
			object.setLKXMY0140(objectData.getString("LKXMY0140"));
			object.setLKXMY0066(objectData.getString("LKXMY0066"));
			object.setLKXMY0141(objectData.getString("LKXMY0141"));
			object.setLKXMY0142(objectData.getString("LKXMY0142"));
			object.setLKXMY0143(objectData.getString("LKXMY0143"));
			object.setLKXMY0144(objectData.getString("LKXMY0144"));
			object.setLKXMY0145(objectData.getString("LKXMY0145"));
			object.setLKXMY0146(objectData.getString("LKXMY0146"));
			object.setLKXMY0147(objectData.getString("LKXMY0147"));
			object.setLKXMY0148(objectData.getString("LKXMY0148"));
			object.setLKXMY0149(objectData.getString("LKXMY0149"));
			object.setLKXMY0150(objectData.getString("LKXMY0150"));
			object.setLKXMY0153(objectData.getString("LKXMY0153"));
			object.setLKXMY0154(objectData.getString("LKXMY0154"));
			object.setLKXMY0155(objectData.getString("LKXMY0155"));
			object.setLKXMY0156(objectData.getString("LKXMY0156"));
			object.setLKXMY0157(objectData.getString("LKXMY0157"));
			object.setLKXMY0158(objectData.getString("LKXMY0158"));
			object.setLKXMY0159(objectData.getString("LKXMY0159"));
			object.setLKXMY0160(objectData.getString("LKXMY0160"));
			object.setLKXMY0151(objectData.getString("LKXMY0151"));
			object.setLKXMY0161(objectData.getString("LKXMY0161"));
			object.setLKXMY0162(objectData.getString("LKXMY0162"));
			object.setLKXMY0163(objectData.getString("LKXMY0163"));
			object.setLKXMY0164(objectData.getString("LKXMY0164"));
			object.setLKXMY0165(objectData.getString("LKXMY0165"));
			object.setLKXMY0166(objectData.getString("LKXMY0166"));
			object.setLKXMY0167(objectData.getString("LKXMY0167"));
			object.setLKXMY0168(objectData.getString("LKXMY0168"));
			object.setLKXMY0169(objectData.getString("LKXMY0169"));
			object.setLKXMY0170(objectData.getString("LKXMY0170"));
			object.setLKXMY0171(objectData.getString("LKXMY0171"));
			object.setLKXMY0172(objectData.getString("LKXMY0172"));
			object.setLKXMY0173(objectData.getString("LKXMY0173"));
			object.setLKXMY0174(objectData.getString("LKXMY0174"));
			object.setLKXMY0175(objectData.getString("LKXMY0175"));
			object.setLKXMY0176(objectData.getString("LKXMY0176"));
			object.setLKXMY0177(objectData.getString("LKXMY0177"));
			object.setLKXMY0178(objectData.getString("LKXMY0178"));
			object.setLKXMY0179(objectData.getString("LKXMY0179"));
			object.setLKXMY0407(objectData.getString("LKXMY0407"));
			object.setLKXMY0408(objectData.getString("LKXMY0408"));
			object.setLKXMY0409(objectData.getString("LKXMY0409"));
			object.setLKXMY0410(objectData.getString("LKXMY0410"));
			object.setLKXMY0412(objectData.getString("LKXMY0412"));
			object.setLKXMY0413(objectData.getString("LKXMY0413"));
			object.setLKXMY0414(objectData.getString("LKXMY0414"));
			object.setLKXMY0415(objectData.getString("LKXMY0415"));
			object.setLKXMY0416(objectData.getString("LKXMY0416"));
			object.setLKXMY0417(objectData.getString("LKXMY0417"));
			object.setLKXMY0418(objectData.getString("LKXMY0418"));

			object = vrTechnicalSpec_LKXMYPersistence.update(object);
			JSONObject obj_part1 = null;
			try {
				obj_part1 = BusinessUtil.object2Json_originColumnName(object, VRTechnicalSpec_LKXMYModelImpl.class,
						StringPool.BLANK);
			} catch (JSONException e) {
			}

			VRTechnicalSpec_LKXMYPart2 objectPart2 = null;
			objectPart2 = vrTechnicalSpec_LKXMYPart2Persistence.fetchByPrimaryKey(object.getPrimaryKey());

			objectPart2.setLKXMY0507(objectData.getString("LKXMY0507"));
			objectPart2.setLKXMY0508(objectData.getString("LKXMY0508"));
			objectPart2.setLKXMY0509(objectData.getString("LKXMY0509"));
			objectPart2.setLKXMY0510(objectData.getString("LKXMY0510"));
			objectPart2.setLKXMY0511(objectData.getString("LKXMY0511"));
			objectPart2.setLKXMY0512(objectData.getString("LKXMY0512"));
			objectPart2.setLKXMY0513(objectData.getString("LKXMY0513"));
			objectPart2.setLKXMY0514(objectData.getString("LKXMY0514"));
			objectPart2.setLKXMY0515(objectData.getString("LKXMY0515"));
			objectPart2.setLKXMY0301(objectData.getString("LKXMY0301"));
			objectPart2.setLKXMY0302(objectData.getString("LKXMY0302"));
			objectPart2.setLKXMY0303(objectData.getString("LKXMY0303"));
			objectPart2.setLKXMY0304(objectData.getString("LKXMY0304"));
			objectPart2.setLKXMY0305(objectData.getString("LKXMY0305"));
			objectPart2.setLKXMY0306(objectData.getString("LKXMY0306"));
			objectPart2.setLKXMY0307(objectData.getString("LKXMY0307"));
			objectPart2.setLKXMY0308(objectData.getString("LKXMY0308"));
			objectPart2.setLKXMY0309(objectData.getString("LKXMY0309"));
			objectPart2.setLKXMY0310(objectData.getString("LKXMY0310"));
			objectPart2.setLKXMY0311(objectData.getString("LKXMY0311"));
			objectPart2.setLKXMY0312(objectData.getString("LKXMY0312"));
			objectPart2.setLKXMY0313(objectData.getString("LKXMY0313"));
			objectPart2.setLKXMY0314(objectData.getString("LKXMY0314"));
			objectPart2.setLKXMY0607(objectData.getString("LKXMY0607"));
			objectPart2.setLKXMY0608(objectData.getString("LKXMY0608"));
			objectPart2.setLKXMY0609(objectData.getString("LKXMY0609"));
			objectPart2.setLKXMY0610(objectData.getString("LKXMY0610"));
			objectPart2.setLKXMY0611(objectData.getString("LKXMY0611"));
			objectPart2.setLKXMY0612(objectData.getString("LKXMY0612"));
			objectPart2.setLKXMY0613(objectData.getString("LKXMY0613"));
			objectPart2.setLKXMY0614(objectData.getString("LKXMY0614"));
			objectPart2.setLKXMY0615(objectData.getString("LKXMY0615"));
			objectPart2.setLKXMY0616(objectData.getString("LKXMY0616"));
			objectPart2.setLKXMY0617(objectData.getString("LKXMY0617"));
			objectPart2.setLKXMY0618(objectData.getString("LKXMY0618"));
			objectPart2.setLKXMY0619(objectData.getString("LKXMY0619"));
			objectPart2.setLKXMY0906(objectData.getString("LKXMY0906"));
			objectPart2.setLKXMY0907(objectData.getString("LKXMY0907"));
			objectPart2.setLKXMY0908(objectData.getString("LKXMY0908"));
			objectPart2.setLKXMY0909(objectData.getString("LKXMY0909"));
			objectPart2.setLKXMY0910(objectData.getString("LKXMY0910"));
			objectPart2.setLKXMY0911(objectData.getString("LKXMY0911"));
			objectPart2.setLKXMY0912(objectData.getString("LKXMY0912"));
			objectPart2.setLKXMY0913(objectData.getString("LKXMY0913"));
			objectPart2.setLKXMY0914(objectData.getString("LKXMY0914"));
			objectPart2.setLKXMY0915(objectData.getString("LKXMY0915"));
			objectPart2.setLKXMY0916(objectData.getString("LKXMY0916"));
			objectPart2.setLKXMY0917(objectData.getString("LKXMY0917"));
			objectPart2.setLKXMY0918(objectData.getString("LKXMY0918"));
			objectPart2.setLKXMY1007(objectData.getString("LKXMY1007"));
			objectPart2.setLKXMY1008(objectData.getString("LKXMY1008"));
			objectPart2.setLKXMY1009(objectData.getString("LKXMY1009"));
			objectPart2.setLKXMY1010(objectData.getString("LKXMY1010"));
			objectPart2.setLKXMY1011(objectData.getString("LKXMY1011"));
			objectPart2.setLKXMY1012(objectData.getString("LKXMY1012"));
			objectPart2.setLKXMY1013(objectData.getString("LKXMY1013"));
			objectPart2.setLKXMY1014(objectData.getString("LKXMY1014"));
			objectPart2.setLKXMY1015(objectData.getString("LKXMY1015"));
			objectPart2.setLKXMY0807(objectData.getString("LKXMY0807"));
			objectPart2.setLKXMY0808(objectData.getString("LKXMY0808"));
			objectPart2.setLKXMY0809(objectData.getString("LKXMY0809"));
			objectPart2.setLKXMY0810(objectData.getString("LKXMY0810"));
			objectPart2.setLKXMY0811(objectData.getString("LKXMY0811"));
			objectPart2.setLKXMY0812(objectData.getString("LKXMY0812"));
			objectPart2.setLKXMY0813(objectData.getString("LKXMY0813"));
			objectPart2.setLKXMY0801(objectData.getString("LKXMY0801"));
			objectPart2.setLKXMY0802(objectData.getString("LKXMY0802"));
			objectPart2.setLKXMY0803(objectData.getString("LKXMY0803"));
			objectPart2.setLKXMY0804(objectData.getString("LKXMY0804"));
			objectPart2.setLKXMY0805(objectData.getString("LKXMY0805"));
			objectPart2.setBBLKXMY001(objectData.getString("BBLKXMY001"));
			objectPart2.setBBLKXMY002(objectData.getString("BBLKXMY002"));
			objectPart2.setBBLKXMY003(objectData.getString("BBLKXMY003"));
			objectPart2.setBBLKXMY004(objectData.getString("BBLKXMY004"));
			objectPart2.setBBLKXMY005(objectData.getString("BBLKXMY005"));
			objectPart2.setBBLKXMY006(objectData.getString("BBLKXMY006"));
			objectPart2.setBBLKXMY007(objectData.getString("BBLKXMY007"));
			objectPart2.setBBLKXMY008(objectData.getString("BBLKXMY008"));
			objectPart2.setBBLKXMY009(objectData.getString("BBLKXMY009"));
			objectPart2.setBBLKXMY010(objectData.getString("BBLKXMY010"));
			objectPart2.setBBLKXMY011(objectData.getString("BBLKXMY011"));
			objectPart2.setBBLKXMY012(objectData.getString("BBLKXMY012"));
			objectPart2.setBBLKXMY013(objectData.getString("BBLKXMY013"));
			objectPart2.setBBLKXMY014(objectData.getString("BBLKXMY014"));
			objectPart2.setBBLKXMY015(objectData.getString("BBLKXMY015"));
			objectPart2.setBBLKXMY016(objectData.getString("BBLKXMY016"));
			objectPart2.setBBLKXMY017(objectData.getString("BBLKXMY017"));
			objectPart2.setBBLKXMY018(objectData.getString("BBLKXMY018"));
			objectPart2.setBBLKXMY019(objectData.getString("BBLKXMY019"));
			objectPart2.setBBLKXMY020(objectData.getString("BBLKXMY020"));
			objectPart2.setBBLKXMY021(objectData.getString("BBLKXMY021"));
			objectPart2.setBBLKXMY022(objectData.getString("BBLKXMY022"));
			objectPart2.setBBLKXMY023(objectData.getString("BBLKXMY023"));
			objectPart2.setBBLKXMY024(objectData.getString("BBLKXMY024"));
			objectPart2.setBBLKXMY025(objectData.getString("BBLKXMY025"));
			objectPart2.setBBLKXMY026(objectData.getString("BBLKXMY026"));
			objectPart2.setBBLKXMY027(objectData.getString("BBLKXMY027"));
			objectPart2.setBBLKXMY028(objectData.getString("BBLKXMY028"));
			objectPart2.setBBLKXMY029(objectData.getString("BBLKXMY029"));
			objectPart2.setBBLKXMY030(objectData.getString("BBLKXMY030"));
			objectPart2.setBBLKXMY031(objectData.getString("BBLKXMY031"));
			objectPart2.setBBLKXMY032(objectData.getString("BBLKXMY032"));
			objectPart2.setBBLKXMY033(objectData.getString("BBLKXMY033"));

			objectPart2 = vrTechnicalSpec_LKXMYPart2Persistence.update(objectPart2);
			JSONObject obj_part2 = null;
			try {
				obj_part2 = BusinessUtil.object2Json_originColumnName(objectPart2,
						VRTechnicalSpec_LKXMYPart2ModelImpl.class, StringPool.BLANK);
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

	private Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_LKXMYLocalServiceImpl.class);
}