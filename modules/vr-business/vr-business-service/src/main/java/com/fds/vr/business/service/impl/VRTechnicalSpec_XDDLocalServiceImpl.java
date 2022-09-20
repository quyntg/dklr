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

import com.fds.vr.business.model.VRTechnicalSpec_XDD;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XDDModelImpl;
import com.fds.vr.business.service.base.VRTechnicalSpec_XDDLocalServiceBaseImpl;
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
 * The implementation of the vr technical spec_xdd local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRTechnicalSpec_XDDLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XDDLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRTechnicalSpec_XDDLocalServiceUtil
 */
@ProviderType
public class VRTechnicalSpec_XDDLocalServiceImpl extends VRTechnicalSpec_XDDLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRTechnicalSpec_XDDLocalServiceUtil} to access
	 * the vr technical spec_xdd local service.
	 */

	public List<VRTechnicalSpec_XDD> findByVehicleCertificateId(long vehicleCertificateId, int start, int end) {
		return vrTechnicalSpec_XDDPersistence.findByvehicleTypeCertificateId(vehicleCertificateId, start, end);
	}

	public List<VRTechnicalSpec_XDD> findByDossierId(long dossierId, int start, int end) {
		return vrTechnicalSpec_XDDPersistence.findBy_DossierId(dossierId, start, end);
	}

	public List<VRTechnicalSpec_XDD> findByConvertAssembleId(long convertAssembleId) throws SystemException {
		try {
			return vrTechnicalSpec_XDDPersistence.findByConvertAssembleId(convertAssembleId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XDD>();

	}

	public List<VRTechnicalSpec_XDD> findByReferenceUid(String referenceUid) throws SystemException {
		try {
			return vrTechnicalSpec_XDDPersistence.findByReferenceUid(referenceUid);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XDD>();

	}

	public List<VRTechnicalSpec_XDD> findByDossierNo(String dossierNo, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_XDDPersistence.findByDossierNo(dossierNo, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XDD>();

	}

	public List<VRTechnicalSpec_XDD> findByDossierId(long dossierId, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_XDDPersistence.findByDossierId(dossierId, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XDD>();

	}

	public List<VRTechnicalSpec_XDD> findByDossierIdCTN(String dossierIdCTN) throws SystemException {
		try {
			return vrTechnicalSpec_XDDPersistence.findByDossierIdCTN(dossierIdCTN);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XDD>();

	}

	public List<VRTechnicalSpec_XDD> findByDeliverableCode(String deliverableCode) throws SystemException {
		try {
			return vrTechnicalSpec_XDDPersistence.findByDeliverableCode(deliverableCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_XDD>();

	}

	public JSONArray adminProcessData(JSONArray arrayData, long dossierId, long mtCore, long vehicleTypeCertificateId) {
		JSONArray array = JSONFactoryUtil.createJSONArray();

		vrTechnicalSpec_XDDPersistence.removeByDossierId(dossierId, mtCore);

		Date now = new Date();

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);
			VRTechnicalSpec_XDD object = null;

			long id = counterLocalService.increment(VRTechnicalSpec_XDD.class.getName());
			object = vrTechnicalSpec_XDDPersistence.create(id);

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
			object.setXDD01001(objectData.getString("XDD01001"));
			object.setXDD01002(objectData.getString("XDD01002"));
			object.setXDD01003(objectData.getString("XDD01003"));
			object.setXDD01004(objectData.getString("XDD01004"));
			object.setXDD01005(objectData.getString("XDD01005"));
			object.setXDD01006(objectData.getString("XDD01006"));
			object.setXDD01007(objectData.getString("XDD01007"));
			object.setXDD01008(objectData.getString("XDD01008"));
			object.setXDD01009(objectData.getString("XDD01009"));
			object.setXDD01010(objectData.getString("XDD01010"));
			object.setXDD01011(objectData.getString("XDD01011"));
			object.setXDD01012(objectData.getString("XDD01012"));
			object.setXDD01013(objectData.getString("XDD01013"));
			object.setXDD01014(objectData.getString("XDD01014"));
			object.setXDD01016(objectData.getString("XDD01016"));
			object.setXDD01017(objectData.getString("XDD01017"));
			object.setXDD01019(objectData.getString("XDD01019"));
			object.setXDD01020(objectData.getString("XDD01020"));
			object.setXDD01021(objectData.getString("XDD01021"));
			object.setXDD01022(objectData.getString("XDD01022"));
			object.setXDD01024(objectData.getString("XDD01024"));
			object.setXDD01025(objectData.getString("XDD01025"));
			object.setXDD01026(objectData.getString("XDD01026"));
			object.setXDD01027(objectData.getString("XDD01027"));
			object.setXDD01028(objectData.getString("XDD01028"));
			object.setXDD01030(objectData.getString("XDD01030"));
			object.setXDD01031(objectData.getString("XDD01031"));
			object.setXDD01032(objectData.getString("XDD01032"));
			object.setXDD01033(objectData.getString("XDD01033"));
			object.setXDD01034(objectData.getString("XDD01034"));
			object.setXDD01035(objectData.getString("XDD01035"));
			object.setXDD01036(objectData.getString("XDD01036"));
			object.setXDD01037(objectData.getString("XDD01037"));
			object.setXDD01038(objectData.getString("XDD01038"));
			object.setXDD01039(objectData.getString("XDD01039"));
			object.setXDD01040(objectData.getString("XDD01040"));
			object.setXDD01041(objectData.getString("XDD01041"));
			object.setXDD01042(objectData.getString("XDD01042"));
			object.setXDD01043(objectData.getString("XDD01043"));
			object.setXDD01044(objectData.getString("XDD01044"));
			object.setXDD01045(objectData.getString("XDD01045"));
			object.setXDD01046(objectData.getString("XDD01046"));
			object.setXDD01047(objectData.getString("XDD01047"));
			object.setXDD01049(objectData.getString("XDD01049"));
			object.setXDD01050(objectData.getString("XDD01050"));
			object.setXDD01051(objectData.getString("XDD01051"));
			object.setXDD01052(objectData.getString("XDD01052"));
			object.setXDD01053(objectData.getString("XDD01053"));
			object.setXDD01054(objectData.getString("XDD01054"));
			object.setXDD01055(objectData.getString("XDD01055"));
			object.setXDD01056(objectData.getString("XDD01056"));
			object.setXDD01057(objectData.getString("XDD01057"));
			object.setXDD01058(objectData.getString("XDD01058"));
			object.setXDD01059(objectData.getString("XDD01059"));
			object.setXDD01060(objectData.getString("XDD01060"));
			object.setXDD0076(objectData.getString("XDD0076"));
			object.setXDD0077(objectData.getString("XDD0077"));
			object.setXDD0078(objectData.getString("XDD0078"));
			object.setXDD0079(objectData.getString("XDD0079"));
			object.setXDD0080(objectData.getString("XDD0080"));
			object.setXDD0081(objectData.getString("XDD0081"));
			object.setXDD0082(objectData.getString("XDD0082"));
			object.setXDD0083(objectData.getString("XDD0083"));
			object.setXDD0084(objectData.getString("XDD0084"));
			object.setXDD0085(objectData.getString("XDD0085"));
			object.setXDD0086(objectData.getString("XDD0086"));
			object.setXDD0087(objectData.getString("XDD0087"));
			object.setXDD0088(objectData.getString("XDD0088"));
			object.setXDD0089(objectData.getString("XDD0089"));
			object.setXDD0090(objectData.getString("XDD0090"));
			object.setXDD0091(objectData.getString("XDD0091"));
			object.setXDD0092(objectData.getString("XDD0092"));
			object.setXDD0093(objectData.getString("XDD0093"));
			object.setXDD0094(objectData.getString("XDD0094"));
			object.setXDD0095(objectData.getString("XDD0095"));
			object.setXDD0096(objectData.getString("XDD0096"));
			object.setXDD0097(objectData.getString("XDD0097"));
			object.setXDD0098(objectData.getString("XDD0098"));
			object.setXDD0099(objectData.getString("XDD0099"));
			object.setXDD0100(objectData.getString("XDD0100"));
			object.setXDD0101(objectData.getString("XDD0101"));
			object.setXDD0102(objectData.getString("XDD0102"));
			object.setXDD0103(objectData.getString("XDD0103"));
			object.setXDD0104(objectData.getString("XDD0104"));
			object.setXDD0105(objectData.getString("XDD0105"));
			object.setXDD0106(objectData.getString("XDD0106"));
			object.setXDD0107(objectData.getString("XDD0107"));
			object.setXDD0108(objectData.getString("XDD0108"));
			object.setXDD0109(objectData.getString("XDD0109"));
			object.setXDD0110(objectData.getString("XDD0110"));
			object.setXDD0111(objectData.getString("XDD0111"));
			object.setXDD0112(objectData.getString("XDD0112"));
			object.setXDD0113(objectData.getString("XDD0113"));
			object.setXDD0114(objectData.getString("XDD0114"));
			object.setXDD0115(objectData.getString("XDD0115"));
			object.setXDD0116(objectData.getString("XDD0116"));
			object.setXDD0117(objectData.getString("XDD0117"));
			object.setXDD0118(objectData.getString("XDD0118"));
			object.setXDD0119(objectData.getString("XDD0119"));
			object.setXDD0120(objectData.getString("XDD0120"));
			object.setXDD0121(objectData.getString("XDD0121"));
			object.setXDD0122(objectData.getString("XDD0122"));
			object.setXDD0123(objectData.getString("XDD0123"));
			object.setXDD0124(objectData.getString("XDD0124"));
			object.setXDD0125(objectData.getString("XDD0125"));
			object.setXDD0126(objectData.getString("XDD0126"));
			object.setXDD0127(objectData.getString("XDD0127"));
			object.setXDD0128(objectData.getString("XDD0128"));
			object.setXDD0129(objectData.getString("XDD0129"));
			object.setXDD0130(objectData.getString("XDD0130"));
			object.setXDD0131(objectData.getString("XDD0131"));
			object.setXDD0132(objectData.getString("XDD0132"));
			object.setXDD0133(objectData.getString("XDD0133"));
			object.setXDD0134(objectData.getString("XDD0134"));
			object.setXDD0135(objectData.getString("XDD0135"));
			object.setXDD0136(objectData.getString("XDD0136"));
			object.setXDD0137(objectData.getString("XDD0137"));
			object.setXDD0138(objectData.getString("XDD0138"));
			object.setXDD0139(objectData.getString("XDD0139"));
			object.setXDD0140(objectData.getString("XDD0140"));
			object.setXDD0141(objectData.getString("XDD0141"));
			object.setXDD0142(objectData.getString("XDD0142"));
			object.setXDD0143(objectData.getString("XDD0143"));
			object.setXDD0144(objectData.getString("XDD0144"));
			object.setXDD0145(objectData.getString("XDD0145"));
			object.setXDD0146(objectData.getString("XDD0146"));
			object.setXDD0147(objectData.getString("XDD0147"));
			object.setXDD0148(objectData.getString("XDD0148"));
			object.setXDD0149(objectData.getString("XDD0149"));
			object.setXDD0150(objectData.getString("XDD0150"));
			object.setXDD0151(objectData.getString("XDD0151"));
			object.setXDD0152(objectData.getString("XDD0152"));
			object.setXDD0153(objectData.getString("XDD0153"));
			object.setXDD0154(objectData.getString("XDD0154"));
			object.setXDD0155(objectData.getString("XDD0155"));
			object.setXDD0156(objectData.getString("XDD0156"));
			object.setXDD0157(objectData.getString("XDD0157"));
			object.setXDD0158(objectData.getString("XDD0158"));
			object.setXDD0159(objectData.getString("XDD0159"));
			object.setXDD0160(objectData.getString("XDD0160"));
			object.setXDD0161(objectData.getString("XDD0161"));
			object.setBBCNCLKLXDD001(objectData.getString("BBCNCLKLXDD001"));
			object.setBBCNCLKLXDD002(objectData.getString("BBCNCLKLXDD002"));
			object.setBBCNCLKLXDD003(objectData.getString("BBCNCLKLXDD003"));
			object.setBBCNCLKLXDD004(objectData.getString("BBCNCLKLXDD004"));
			object.setBBCNCLKLXDD005(objectData.getString("BBCNCLKLXDD005"));
			object.setBBCNCLKLXDD006(objectData.getString("BBCNCLKLXDD006"));
			object.setBBCNCLKLXDD007(objectData.getString("BBCNCLKLXDD007"));
			object.setBBCNCLKLXDD008(objectData.getString("BBCNCLKLXDD008"));
			object.setBBCNCLKLXDD009(objectData.getString("BBCNCLKLXDD009"));
			object.setBBCNCLKLXDD010(objectData.getString("BBCNCLKLXDD010"));
			object.setBBCNCLKLXDD011(objectData.getString("BBCNCLKLXDD011"));
			object.setBBCNCLKLXDD012(objectData.getString("BBCNCLKLXDD012"));
			object.setBBCNCLKLXDD013(objectData.getString("BBCNCLKLXDD013"));
			object.setBBCNCLKLXDD014(objectData.getString("BBCNCLKLXDD014"));
			object.setBBCNCLKLXDD015(objectData.getString("BBCNCLKLXDD015"));
			object.setBBCNCLKLXDD016(objectData.getString("BBCNCLKLXDD016"));
			object.setBBCNCLKLXDD019(objectData.getString("BBCNCLKLXDD019"));
			object.setBBCNCLKLXDD017(objectData.getString("BBCNCLKLXDD017"));
			object.setBBCNCLKLXDD020(objectData.getString("BBCNCLKLXDD020"));
			object.setBBCNCLKLXDD018(objectData.getString("BBCNCLKLXDD018"));
			object.setBBCNCLKLXDD021(objectData.getString("BBCNCLKLXDD021"));
			object.setBBCNCLKLXDD022(objectData.getString("BBCNCLKLXDD022"));
			object.setBBCNCLKLXDD023(objectData.getString("BBCNCLKLXDD023"));
			object.setBBCNCLKLXDD024(objectData.getString("BBCNCLKLXDD024"));
			object.setBBCNCLKLXDD025(objectData.getString("BBCNCLKLXDD025"));
			object.setBBCNCLKLXDD026(objectData.getString("BBCNCLKLXDD026"));
			object.setBBCNCLKLXDD027(objectData.getString("BBCNCLKLXDD027"));
			object.setBBCNCLKLXDD028(objectData.getString("BBCNCLKLXDD028"));
			object.setBBCNCLKLXDD029(objectData.getString("BBCNCLKLXDD029"));
			object.setBBCNCLKLXDD031(objectData.getString("BBCNCLKLXDD031"));
			object.setBBCNCLKLXDD032(objectData.getString("BBCNCLKLXDD032"));
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(object, VRTechnicalSpec_XDDModelImpl.class,
						StringPool.BLANK);
				array.put(obj);
			} catch (JSONException e) {
			}
		}

		return array;
	}

	private Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XDDLocalServiceImpl.class);
}