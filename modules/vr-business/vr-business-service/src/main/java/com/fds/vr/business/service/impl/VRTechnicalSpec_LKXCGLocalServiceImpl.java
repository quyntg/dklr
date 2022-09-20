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

import com.fds.vr.business.model.VRTechnicalSpec_LKXCG;
import com.fds.vr.business.model.impl.VRTechnicalSpec_LKXCGModelImpl;
import com.fds.vr.business.service.base.VRTechnicalSpec_LKXCGLocalServiceBaseImpl;
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
 * The implementation of the vr technical spec_lkxcg local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRTechnicalSpec_LKXCGLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_LKXCGLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRTechnicalSpec_LKXCGLocalServiceUtil
 */
@ProviderType
public class VRTechnicalSpec_LKXCGLocalServiceImpl extends VRTechnicalSpec_LKXCGLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRTechnicalSpec_LKXCGLocalServiceUtil} to access
	 * the vr technical spec_lkxcg local service.
	 */

	public List<VRTechnicalSpec_LKXCG> findByDossierId(long dossierId, int start, int end) {
		return vrTechnicalSpec_LKXCGPersistence.findBy_DossierId(dossierId, start, end);
	}

	public List<VRTechnicalSpec_LKXCG> findByConvertAssembleId(long convertAssembleId) throws SystemException {
		try {
			return vrTechnicalSpec_LKXCGPersistence.findByConvertAssembleId(convertAssembleId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXCG>();

	}

	public List<VRTechnicalSpec_LKXCG> findByVehicleCertificateId(long vehicleCertificateId, int start, int end) {
		return vrTechnicalSpec_LKXCGPersistence.findByvehicleTypeCertificateId(vehicleCertificateId, start, end);
	}

	public List<VRTechnicalSpec_LKXCG> findByReferenceUid(String referenceUid) throws SystemException {
		try {
			return vrTechnicalSpec_LKXCGPersistence.findByReferenceUid(referenceUid);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXCG>();

	}

	public List<VRTechnicalSpec_LKXCG> findByDossierNo(String dossierNo, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_LKXCGPersistence.findByDossierNo(dossierNo, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXCG>();

	}

	public List<VRTechnicalSpec_LKXCG> findByDossierId(long dossierId, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_LKXCGPersistence.findByDossierId(dossierId, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXCG>();

	}

	public List<VRTechnicalSpec_LKXCG> findByDossierIdCTN(String dossierIdCTN) throws SystemException {
		try {
			return vrTechnicalSpec_LKXCGPersistence.findByDossierIdCTN(dossierIdCTN);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXCG>();

	}

	public List<VRTechnicalSpec_LKXCG> findByDeliverableCode(String deliverableCode) throws SystemException {
		try {
			return vrTechnicalSpec_LKXCGPersistence.findByDeliverableCode(deliverableCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXCG>();

	}
	/*
	 * public JSONArray findData(String sql, List<String> columnNames, List<String>
	 * dataTypes, Class<?> modelClazz, String modelClassName, int start, int end)
	 * throws SystemException {
	 * 
	 * return vrTechnicalSpec_LKXCGFinder.findData(sql, columnNames, dataTypes,
	 * modelClazz, modelClassName, start, end); }
	 * 
	 * public long counData(String sql) throws SystemException {
	 * 
	 * return vrTechnicalSpec_LKXCGFinder.countData(sql); }
	 */

	public JSONArray adminProcessData(JSONArray arrayData, long dossierId, long mtCore, long vehicleTypeCertificateId) {
		JSONArray array = JSONFactoryUtil.createJSONArray();

		vrTechnicalSpec_LKXCGPersistence.removeByDossierId(dossierId, mtCore);

		Date now = new Date();
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);
			VRTechnicalSpec_LKXCG object = null;
			long id = counterLocalService.increment(VRTechnicalSpec_LKXCG.class.getName());
			object = vrTechnicalSpec_LKXCGPersistence.create(id);

			object.setVehicleTypeCertificateId(vehicleTypeCertificateId);
			object.setModifyDate(now);
			object.setSyncDate(now);
			object.setMtCore(objectData.getLong("mtCore"));
			object.setConvertAssembleId(objectData.getLong("convertAssembleId"));
			object.setDossierId(objectData.getLong("dossierId"));
			object.setDossierNo(objectData.getString("dossierNo"));
			object.setReferenceUid(objectData.getString("ReferenceUid"));
			object.setDossierIdCTN(objectData.getString("DossierIdCTN"));
			object.setDeliverableCode(objectData.getString("DeliverableCode"));
			object.setXCG01001(objectData.getString("XCG01001"));
			object.setXCG01002(objectData.getString("XCG01002"));
			object.setXCG01003(objectData.getString("XCG01003"));
			object.setXCG01004(objectData.getString("XCG01004"));
			object.setXCG01005(objectData.getString("XCG01005"));
			object.setXCG01006(objectData.getString("XCG01006"));
			object.setXCG01007(objectData.getString("XCG01007"));
			object.setXCG01008(objectData.getString("XCG01008"));
			object.setXCG01009(objectData.getString("XCG01009"));
			object.setXCG01010(objectData.getString("XCG01010"));
			object.setXCG01011(objectData.getString("XCG01011"));
			object.setXCG01012(objectData.getString("XCG01012"));
			object.setXCG01013(objectData.getString("XCG01013"));
			object.setXCG01014(objectData.getString("XCG01014"));
			object.setXCG01016(objectData.getString("XCG01016"));
			object.setXCG01017(objectData.getString("XCG01017"));
			object.setXCG01019(objectData.getString("XCG01019"));
			object.setXCG01020(objectData.getString("XCG01020"));
			object.setXCG01021(objectData.getString("XCG01021"));
			object.setXCG01022(objectData.getString("XCG01022"));
			object.setXCG01024(objectData.getString("XCG01024"));
			object.setXCG01025(objectData.getString("XCG01025"));
			object.setXCG01026(objectData.getString("XCG01026"));
			object.setXCG01027(objectData.getString("XCG01027"));
			object.setXCG01028(objectData.getString("XCG01028"));
			object.setXCG01030(objectData.getString("XCG01030"));
			object.setXCG01031(objectData.getString("XCG01031"));
			object.setXCG01032(objectData.getString("XCG01032"));
			object.setXCG01033(objectData.getString("XCG01033"));
			object.setXCG01034(objectData.getString("XCG01034"));
			object.setXCG01035(objectData.getString("XCG01035"));
			object.setXCG01036(objectData.getString("XCG01036"));
			object.setXCG01037(objectData.getString("XCG01037"));
			object.setXCG01038(objectData.getString("XCG01038"));
			object.setXCG01039(objectData.getString("XCG01039"));
			object.setXCG01040(objectData.getString("XCG01040"));
			object.setXCG01041(objectData.getString("XCG01041"));
			object.setXCG01042(objectData.getString("XCG01042"));
			object.setXCG01043(objectData.getString("XCG01043"));
			object.setXCG01044(objectData.getString("XCG01044"));
			object.setXCG01045(objectData.getString("XCG01045"));
			object.setXCG01046(objectData.getString("XCG01046"));
			object.setXCG01047(objectData.getString("XCG01047"));
			object.setXCG01049(objectData.getString("XCG01049"));
			object.setXCG01050(objectData.getString("XCG01050"));
			object.setXCG01051(objectData.getString("XCG01051"));
			object.setXCG01052(objectData.getString("XCG01052"));
			object.setXCG01053(objectData.getString("XCG01053"));
			object.setXCG01054(objectData.getString("XCG01054"));
			object.setXCG01055(objectData.getString("XCG01055"));
			object.setXCG01056(objectData.getString("XCG01056"));
			object.setXCG01057(objectData.getString("XCG01057"));
			object.setXCG01058(objectData.getString("XCG01058"));
			object.setXCG01059(objectData.getString("XCG01059"));
			object.setXCG01060(objectData.getString("XCG01060"));
			object.setXCG01062(objectData.getString("XCG01062"));
			object.setXCG01063(objectData.getString("XCG01063"));
			object.setXCG01064(objectData.getString("XCG01064"));
			object.setXCG01065(objectData.getString("XCG01065"));
			object.setXCG01066(objectData.getString("XCG01066"));
			object.setXCG01067(objectData.getString("XCG01067"));
			object.setXCG01068(objectData.getString("XCG01068"));
			object.setXCG01069(objectData.getString("XCG01069"));
			object.setLKXCG0407(objectData.getString("LKXCG0407"));
			object.setLKXCG0408(objectData.getString("LKXCG0408"));
			object.setLKXCG0409(objectData.getString("LKXCG0409"));
			object.setLKXCG0410(objectData.getString("LKXCG0410"));
			object.setLKXCG0411(objectData.getString("LKXCG0411"));
			object.setLKXCG0412(objectData.getString("LKXCG0412"));
			object.setLKXCG0413(objectData.getString("LKXCG0413"));
			object.setLKXCG0414(objectData.getString("LKXCG0414"));
			object.setLKXCG0415(objectData.getString("LKXCG0415"));
			object.setLKXCG0416(objectData.getString("LKXCG0416"));
			object.setLKXCG0507(objectData.getString("LKXCG0507"));
			object.setLKXCG0508(objectData.getString("LKXCG0508"));
			object.setLKXCG0509(objectData.getString("LKXCG0509"));
			object.setLKXCG0510(objectData.getString("LKXCG0510"));
			object.setLKXCG0511(objectData.getString("LKXCG0511"));
			object.setLKXCG0512(objectData.getString("LKXCG0512"));
			object.setLKXCG0708(objectData.getString("LKXCG0708"));
			object.setLKXCG0709(objectData.getString("LKXCG0709"));
			object.setLKXCG0710(objectData.getString("LKXCG0710"));
			object.setLKXCG0711(objectData.getString("LKXCG0711"));
			object.setLKXCG0713(objectData.getString("LKXCG0713"));
			object.setLKXCG0714(objectData.getString("LKXCG0714"));
			object.setLKXCG0715(objectData.getString("LKXCG0715"));
			object.setLKXCG0716(objectData.getString("LKXCG0716"));
			object.setLKXCG0717(objectData.getString("LKXCG0717"));
			object.setLKXCG0718(objectData.getString("LKXCG0718"));
			object.setLKXCG0719(objectData.getString("LKXCG0719"));
			object.setLKXCG0720(objectData.getString("LKXCG0720"));
			object.setLKXCG0721(objectData.getString("LKXCG0721"));
			object.setLKXCG0722(objectData.getString("LKXCG0722"));
			object.setLKXCG0723(objectData.getString("LKXCG0723"));
			object.setLKXCG0724(objectData.getString("LKXCG0724"));
			object.setLKXCG0725(objectData.getString("LKXCG0725"));
			object.setLKXCG0726(objectData.getString("LKXCG0726"));
			object.setLKXCG0727(objectData.getString("LKXCG0727"));
			object.setLKXCG0728(objectData.getString("LKXCG0728"));
			object.setLKXCG0606(objectData.getString("LKXCG0606"));
			object.setLKXCG0607(objectData.getString("LKXCG0607"));
			object.setLKXCG0608(objectData.getString("LKXCG0608"));
			object.setLKXCG0609(objectData.getString("LKXCG0609"));
			object.setLKXCG0610(objectData.getString("LKXCG0610"));
			object.setLKXCG0611(objectData.getString("LKXCG0611"));
			object.setLKXCG0612(objectData.getString("LKXCG0612"));
			object.setLKXCG0613(objectData.getString("LKXCG0613"));
			object.setLKXCG0614(objectData.getString("LKXCG0614"));
			object.setLKXCG0615(objectData.getString("LKXCG0615"));
			object.setLKXCG0616(objectData.getString("LKXCG0616"));
			object.setLKXCG0620(objectData.getString("LKXCG0620"));
			object.setLKXCG0807(objectData.getString("LKXCG0807"));
			object.setLKXCG0808(objectData.getString("LKXCG0808"));
			object.setLKXCG0809(objectData.getString("LKXCG0809"));
			object.setLKXCG0810(objectData.getString("LKXCG0810"));
			object.setLKXCG0812(objectData.getString("LKXCG0812"));
			object.setLKXCG0813(objectData.getString("LKXCG0813"));
			object.setLKXCG0814(objectData.getString("LKXCG0814"));
			object.setLKXCG0815(objectData.getString("LKXCG0815"));
			object.setLKXCG0816(objectData.getString("LKXCG0816"));
			object.setLKXCG0817(objectData.getString("LKXCG0817"));
			object.setLKXCG0818(objectData.getString("LKXCG0818"));
			object.setLKXCG0819(objectData.getString("LKXCG0819"));
			object.setLKXCG0820(objectData.getString("LKXCG0820"));
			object.setLKXCG0907(objectData.getString("LKXCG0907"));
			object.setLKXCG0908(objectData.getString("LKXCG0908"));
			object.setLKXCG0909(objectData.getString("LKXCG0909"));
			object.setLKXCG0910(objectData.getString("LKXCG0910"));
			object.setLKXCG0911(objectData.getString("LKXCG0911"));
			object.setLKXCG0912(objectData.getString("LKXCG0912"));
			object.setLKXCG0913(objectData.getString("LKXCG0913"));
			object.setLKXCG0914(objectData.getString("LKXCG0914"));
			object.setBBLKXCG001(objectData.getString("BBLKXCG001"));
			object.setBBLKXCG002(objectData.getString("BBLKXCG002"));
			object.setBBLKXCG003(objectData.getString("BBLKXCG003"));
			object.setBBLKXCG004(objectData.getString("BBLKXCG004"));
			object.setBBLKXCG005(objectData.getString("BBLKXCG005"));
			object.setBBLKXCG006(objectData.getString("BBLKXCG006"));
			object.setBBLKXCG007(objectData.getString("BBLKXCG007"));
			object.setBBLKXCG008(objectData.getString("BBLKXCG008"));
			object.setBBLKXCG009(objectData.getString("BBLKXCG009"));
			object.setBBLKXCG010(objectData.getString("BBLKXCG010"));
			object.setBBLKXCG011(objectData.getString("BBLKXCG011"));
			object.setBBLKXCG012(objectData.getString("BBLKXCG012"));
			object.setBBLKXCG013(objectData.getString("BBLKXCG013"));
			object.setBBLKXCG014(objectData.getString("BBLKXCG014"));
			object.setBBLKXCG015(objectData.getString("BBLKXCG015"));
			object.setBBLKXCG016(objectData.getString("BBLKXCG016"));
			object.setBBLKXCG017(objectData.getString("BBLKXCG017"));
			object.setBBLKXCG018(objectData.getString("BBLKXCG018"));
			object.setBBLKXCG019(objectData.getString("BBLKXCG019"));
			object.setBBLKXCG020(objectData.getString("BBLKXCG020"));
			object.setBBLKXCG021(objectData.getString("BBLKXCG021"));
			object.setBBLKXCG022(objectData.getString("BBLKXCG022"));
			object.setBBLKXCG023(objectData.getString("BBLKXCG023"));
			object.setBBLKXCG024(objectData.getString("BBLKXCG024"));
			object.setBBLKXCG025(objectData.getString("BBLKXCG025"));
			object.setBBLKXCG026(objectData.getString("BBLKXCG026"));
			object.setBBLKXCG027(objectData.getString("BBLKXCG027"));
			object.setBBLKXCG028(objectData.getString("BBLKXCG028"));
			object.setBBLKXCG029(objectData.getString("BBLKXCG029"));
			object.setBBLKXCG030(objectData.getString("BBLKXCG030"));

			object = vrTechnicalSpec_LKXCGPersistence.update(object);
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(object, VRTechnicalSpec_LKXCGModelImpl.class,
						StringPool.BLANK);
				array.put(obj);
			} catch (JSONException e) {
			}
		}

		return array;
	}

	private Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_LKXCGLocalServiceImpl.class);

}