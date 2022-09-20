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

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import com.fds.vr.business.model.VRDossierFile;
import com.fds.vr.business.model.VRTechnicalSpec_LKXCG;
import com.fds.vr.business.model.VRTechnicalSpec_LKXMY;
import com.fds.vr.business.model.VRTechnicalSpec_LKXMYPart2;
import com.fds.vr.business.model.VRTechnicalSpec_XCG;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart1;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart2;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart3;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart4;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart5;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart6;
import com.fds.vr.business.model.VRTechnicalSpec_XCH;
import com.fds.vr.business.model.VRTechnicalSpec_XCHPart2;
import com.fds.vr.business.model.VRTechnicalSpec_XCN;
import com.fds.vr.business.model.VRTechnicalSpec_XCNPart2;
import com.fds.vr.business.model.VRTechnicalSpec_XCNPart3;
import com.fds.vr.business.model.VRTechnicalSpec_XDD;
import com.fds.vr.business.model.VRTechnicalSpec_XMY;
import com.fds.vr.business.model.VRTechnicalSpec_XMYPart2;
import com.fds.vr.business.model.VRTechnicalSpec_XMYPart3;
import com.fds.vr.business.model.VRVehicleSpecification;
import com.fds.vr.business.model.impl.VRTechnicalSpec_LKXCGImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_LKXMYImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_LKXMYPart2Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart1Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart2Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart3Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart4Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart5Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart6Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCHImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCHPart2Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCNImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCNPart2Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCNPart3Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XDDImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XMYImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XMYPart2Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XMYPart3Impl;
import com.fds.vr.business.model.impl.VRVehicleSpecificationModelImpl;
import com.fds.vr.business.service.VRTechnicalSpec_LKXCGLocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_LKXMYLocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_LKXMYPart2LocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XCGLocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XCGPart1LocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XCGPart2LocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XCGPart3LocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XCGPart4LocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XCGPart5LocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XCGPart6LocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XCHLocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XCHPart2LocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XCNLocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XCNPart2LocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XCNPart3LocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XDDLocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XMYLocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XMYPart2LocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XMYPart3LocalServiceUtil;
import com.fds.vr.business.service.base.VRVehicleSpecificationLocalServiceBaseImpl;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr vehicle specification local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRVehicleSpecificationLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRVehicleSpecificationLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRVehicleSpecificationLocalServiceUtil
 */
@ProviderType
public class VRVehicleSpecificationLocalServiceImpl extends VRVehicleSpecificationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRVehicleSpecificationLocalServiceUtil} to access
	 * the vr vehicle specification local service.
	 */

	public List<VRVehicleSpecification> findByDossierId(long dossierId, int start, int end) {
		return vrVehicleSpecificationPersistence.findBydossierId(dossierId, start, end);
	}

	public VRVehicleSpecification findByCode(long vehiceTypeId, String specificationCode) {
		return vrVehicleSpecificationPersistence.fetchBySC_VCID(vehiceTypeId, specificationCode);
	}

	public List<VRVehicleSpecification> findByVehicleCertificateId(long vehicleCertificateId) {
		return vrVehicleSpecificationPersistence.findByVehicleCertificateId(vehicleCertificateId);
	}

	public List<VRVehicleSpecification> findByDeliverableCode(String deliverableCode)
			throws PortalException, SystemException {
		try {
			return vrVehicleSpecificationPersistence.findByDeliverableCode(deliverableCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleSpecification>();

	}

	public VRVehicleSpecification updateVehicleSpecification(LinkedHashMap<String, String> mapValues,
			long vrVehicleTypeCertificateId, Date modifiedDate, VRDossierFile dossierFile) {

		Date now = new Date();

		long vrVehicleSpecificationId = counterLocalService.increment(VRVehicleSpecification.class.getName());

		VRVehicleSpecification object = vrVehicleSpecificationPersistence.create(vrVehicleSpecificationId);

		/// Add audit fields
		object.setSyncDate(now);

		// Add other fields
		// TODO
		object.setVehicleCertificateId(vrVehicleTypeCertificateId);
		object.setSpecificationCode(mapValues.get(""));
		object.setSpecificationName(mapValues.get(""));
		object.setSpecificationValue(mapValues.get(""));
		object.setSpecificationValueDescription(mapValues.get(""));
		// TODO
		object.setSequenceNo(GetterUtil.getLong(mapValues.get("")));
		object.setSpecificationBasicUnit(mapValues.get(""));
		object.setSpecificationStandard(mapValues.get(""));
		object.setSpecificationGroup(mapValues.get(""));
		object.setSpecificationDataCollectionID(mapValues.get(""));
		object.setSpecificationResult(mapValues.get(""));
		object.setModifyDate(modifiedDate);
		object.setSyncDate(new Date());

		return vrVehicleSpecificationPersistence.update(object);
	}

	public void updateVRTechnicalSpec_LKXCG(String strChungChi, long vrVehicleTypeCertificateId, long dossierId,
			String dossierIdCTN, String dossierNo, Date modifyDate, String deliverableCode) {

		String prefixSpecificationCode = "bb_";
		String specificationValue = StringPool.BLANK;
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_LKXCG> lstTechnicalSpec = VRTechnicalSpec_LKXCGLocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_LKXCG technicalspecification = new VRTechnicalSpec_LKXCGImpl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				technicalspecification.setId(CounterLocalServiceUtil.increment(VRTechnicalSpec_LKXCG.class.getName()));

				isnew = true;
			}
			technicalspecification.setMtCore(1);
			technicalspecification.setModifyDate(modifyDate);
			technicalspecification.setSyncDate(new Date());
			technicalspecification.setDeliverableCode(deliverableCode);
			technicalspecification.setDossierId(dossierId);
			technicalspecification.setDossierIdCTN(dossierIdCTN);
			technicalspecification.setDossierNo(dossierNo);
			technicalspecification.setReferenceUid(vrVehicleTypeCertificateId + "");
			technicalspecification.setConvertAssembleId(vrVehicleTypeCertificateId);

			/// SET
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01007");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01007(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01008");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01008(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01009");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01009(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01010");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01010(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01011");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01011(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01024");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01024(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01025");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01025(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01026");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01026(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01027");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01027(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01028");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01028(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01030");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01030(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01031");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01031(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01032");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01032(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01033");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01033(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01034");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01034(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01035");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01035(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01036");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01036(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01037");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01037(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01038");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01038(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01039");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01039(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01040");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01040(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01041");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01041(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01042");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01042(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01043");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01043(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01044");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01044(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01045");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01045(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01046");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01046(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01047");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01047(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01049");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01049(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01050");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01050(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01051");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01051(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01052");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01052(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01053");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01053(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01054");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01054(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01055");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01055(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01056");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01056(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01057");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01057(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01058");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01058(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01059");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01059(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01060");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01060(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01062");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01062(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01063");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01063(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01064");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01064(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01065");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01065(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01066");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01066(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01067");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01067(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01068");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01068(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01069");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01069(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0407");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0407(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0408");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0408(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0409");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0409(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0410");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0410(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0411");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0411(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0412");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0412(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0413");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0413(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0414");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0414(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0415");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0415(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0416");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0416(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0507");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0507(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0508");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0508(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0509");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0509(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0510");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0510(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0511");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0511(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0512");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0512(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0708");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0708(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0709");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0709(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0710");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0710(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0711");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0711(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0713");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0713(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0714");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0714(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0715");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0715(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0716");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0716(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0717");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0717(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0718");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0718(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0719");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0719(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0720");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0720(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0721");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0721(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0722");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0722(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0723");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0723(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0724");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0724(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0725");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0725(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0726");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0726(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0727");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0727(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0728");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0728(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0606");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0606(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0607");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0607(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0608");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0608(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0609");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0609(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0610");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0610(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0611");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0611(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0612");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0612(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0613");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0613(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0614");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0614(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0615");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0615(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0616");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0616(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0620");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0620(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0807");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0807(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0808");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0808(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0809");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0809(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0810");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0810(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0812");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0812(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0813");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0813(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0814");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0814(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0815");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0815(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0816");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0816(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0817");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0817(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0818");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0818(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0819");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0819(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0820");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0820(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0907");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0907(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0908");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0908(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0909");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0909(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0910");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0910(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0911");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0911(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0912");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0912(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0913");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0913(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXCG0914");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXCG0914(specificationValue);
			}

			prefixSpecificationCode = "kl_";
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG007");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG007(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG008");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG008(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG009");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG009(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG010");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG010(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG011");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG011(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG015");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG015(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG018");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG018(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG023");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG023(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG024");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG024(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG025");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG025(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG026");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG026(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG027");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG027(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG028");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG028(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG029");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG029(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG030");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG030(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXCG031");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXCG031(specificationValue);
			}

			if (isnew) {
				VRTechnicalSpec_LKXCGLocalServiceUtil.addVRTechnicalSpec_LKXCG(technicalspecification);

			} else {
				VRTechnicalSpec_LKXCGLocalServiceUtil.updateVRTechnicalSpec_LKXCG(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec");

		}

	}

	public void updateVRTechnicalSpec_LKXMY(String strChungChi, long vrVehicleTypeCertificateId, long dossierId,
			String dossierIdCTN, String dossierNo, Date modifyDate, String deliverableCode) {
		String prefixSpecificationCode = "bb_";
		String specificationValue = StringPool.BLANK;

		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_LKXMY> lstTechnicalSpec = VRTechnicalSpec_LKXMYLocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_LKXMY technicalspecification = new VRTechnicalSpec_LKXMYImpl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				technicalspecification.setId(CounterLocalServiceUtil.increment(VRTechnicalSpec_LKXMY.class.getName()));

				isnew = true;
			}
			technicalspecification.setMtCore(1);
			technicalspecification.setModifyDate(modifyDate);
			technicalspecification.setSyncDate(new Date());
			technicalspecification.setDeliverableCode(deliverableCode);
			technicalspecification.setDossierId(dossierId);
			technicalspecification.setDossierIdCTN(dossierIdCTN);
			technicalspecification.setDossierNo(dossierNo);
			technicalspecification.setReferenceUid(vrVehicleTypeCertificateId + "");
			technicalspecification.setConvertAssembleId(vrVehicleTypeCertificateId);

			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01007");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01007(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01008");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01008(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01009");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01009(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01010");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01010(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01011");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01011(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01030");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01030(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01031");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01031(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01032");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01032(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01033");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01033(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01034");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01034(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01035");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01035(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01036");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01036(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01037");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01037(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01038");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01038(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01039");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01039(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01040");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01040(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01041");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01041(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01042");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01042(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01043");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01043(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01044");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01044(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01045");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01045(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01046");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01046(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01047");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01047(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01050");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01050(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01051");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01051(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01052");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01052(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01053");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01053(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01054");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01054(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01055");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01055(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01056");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01056(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01057");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01057(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01058");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01058(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01059");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01059(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01060");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01060(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01062");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01062(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01063");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01063(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01064");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01064(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01065");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01065(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY01050");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY01050(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY01051");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY01051(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY01052");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY01052(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY01053");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY01053(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY01026");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY01026(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0401");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0401(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0402");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0402(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0403");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0403(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0404");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0404(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0405");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0405(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0406");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0406(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1307");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1307(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1308");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1308(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1309");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1309(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1310");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1310(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1311");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1311(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1312");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1312(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1207");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1207(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1208");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1208(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1209");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1209(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1210");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1210(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1211");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1211(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0201");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0201(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0202");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0202(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0203");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0203(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0204");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0204(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0205");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0205(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0206");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0206(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0207");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0207(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0208");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0208(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0209");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0209(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0210");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0210(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0211");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0211(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0212");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0212(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0213");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0213(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0214");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0214(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0215");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0215(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0216");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0216(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0217");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0217(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0218");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0218(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0219");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0219(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0040");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0040(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0041");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0041(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0042");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0042(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0043");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0043(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0044");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0044(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0045");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0045(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0046");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0046(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0048");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0048(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0049");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0049(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0050");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0050(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0051");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0051(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0052");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0052(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0054");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0054(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0055");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0055(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0056");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0056(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0057");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0057(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0058");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0058(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0059");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0059(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0060");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0060(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0061");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0061(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0062");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0062(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0063");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0063(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0109");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0109(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0110");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0110(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0111");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0111(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0112");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0112(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0113");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0113(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0114");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0114(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0115");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0115(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0116");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0116(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0117");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0117(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0118");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0118(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0119");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0119(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0120");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0120(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0121");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0121(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0122");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0122(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0123");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0123(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0124");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0124(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0125");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0125(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0126");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0126(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0127");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0127(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0128");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0128(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0129");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0129(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0130");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0130(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0131");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0131(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0064");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0064(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0132");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0132(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0133");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0133(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0134");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0134(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0135");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0135(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0136");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0136(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0137");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0137(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0138");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0138(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0139");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0139(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0140");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0140(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0066");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0066(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0141");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0141(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0142");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0142(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0143");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0143(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0144");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0144(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0145");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0145(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0146");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0146(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0147");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0147(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0148");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0148(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0149");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0149(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0150");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0150(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0153");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0153(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0154");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0154(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0155");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0155(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0156");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0156(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0157");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0157(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0158");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0158(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0159");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0159(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0160");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0160(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0151");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0151(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0161");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0161(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0162");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0162(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0163");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0163(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0164");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0164(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0165");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0165(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0166");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0166(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0167");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0167(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0168");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0168(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0169");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0169(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0170");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0170(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0171");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0171(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0172");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0172(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0173");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0173(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0174");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0174(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0175");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0175(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0176");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0176(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0177");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0177(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0178");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0178(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0179");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0179(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0407");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0407(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0408");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0408(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0409");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0409(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0410");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0410(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0412");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0412(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0413");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0413(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0414");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0414(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0415");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0415(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0416");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0416(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0417");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0417(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0418");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0418(specificationValue);
			}

			if (isnew) {
				VRTechnicalSpec_LKXMYLocalServiceUtil.addVRTechnicalSpec_LKXMY(technicalspecification);

			} else {
				VRTechnicalSpec_LKXMYLocalServiceUtil.updateVRTechnicalSpec_LKXMY(technicalspecification);

			}

		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  updateVRTechnicalSpec_LKXMY");

		}

		prefixSpecificationCode = "bb_";
		specificationValue = StringPool.BLANK;
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_LKXMYPart2> lstTechnicalSpec = VRTechnicalSpec_LKXMYPart2LocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_LKXMYPart2 technicalspecification = new VRTechnicalSpec_LKXMYPart2Impl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				isnew = true;
			}

			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0507");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0507(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0508");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0508(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0509");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0509(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0510");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0510(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0511");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0511(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0512");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0512(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0513");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0513(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0514");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0514(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0515");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0515(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0301");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0301(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0302");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0302(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0303");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0303(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0304");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0304(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0305");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0305(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0306");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0306(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0307");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0307(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0308");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0308(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0309");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0309(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0310");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0310(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0311");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0311(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0312");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0312(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0313");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0313(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0314");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0314(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0607");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0607(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0608");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0608(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0609");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0609(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0610");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0610(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0611");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0611(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0612");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0612(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0613");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0613(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0614");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0614(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0615");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0615(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0616");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0616(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0617");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0617(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0618");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0618(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0619");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0619(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0906");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0906(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0907");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0907(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0908");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0908(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0909");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0909(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0910");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0910(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0911");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0911(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0912");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0912(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0913");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0913(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0914");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0914(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0915");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0915(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0916");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0916(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0917");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0917(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0918");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0918(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1007");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1007(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1008");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1008(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1009");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1009(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1010");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1010(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1011");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1011(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY1015");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY1015(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0807");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0807(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0808");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0808(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0809");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0809(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0810");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0810(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0811");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0811(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0812");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0812(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0813");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0813(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0801");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0801(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0802");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0802(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0803");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0803(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0804");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0804(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "LKXMY0805");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLKXMY0805(specificationValue);
			}

			prefixSpecificationCode = "kl_";
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY007");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY007(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY008");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY008(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY009");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY009(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY010");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY010(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY011");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY011(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY015");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY015(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY018");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY018(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY023");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY023(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY024");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY024(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY025");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY025(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY026");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY026(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY027");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY027(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY028");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY028(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY029");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY029(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY030");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY030(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY031");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY031(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY032");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY032(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY033");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY033(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBLKXMY034");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBLKXMY034(specificationValue);
			}

			if (!isnew) {
				VRTechnicalSpec_LKXMYPart2LocalServiceUtil.updateVRTechnicalSpec_LKXMYPart2(technicalspecification);
			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec updateVRTechnicalSpec_LKXMYPart2");
		}

	}

	public void updateVRTechnicalSpec_XCG(String strChungChi, long vrVehicleTypeCertificateId, long dossierId,
			String dossierIdCTN, String dossierNo, Date modifyDate, String deliverableCode) {
		String prefixSpecificationCode = "bb_";
		String specificationValue = StringPool.BLANK;

		try {
//			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XCG> lstTechnicalSpec = VRTechnicalSpec_XCGLocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XCG technicalspecification = new VRTechnicalSpec_XCGImpl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				technicalspecification.setId(CounterLocalServiceUtil.increment(VRTechnicalSpec_XCG.class.getName()));

				isnew = true;
			}
			technicalspecification.setMtCore(1);
			technicalspecification.setModifyDate(modifyDate);
			technicalspecification.setSyncDate(new Date());
			technicalspecification.setDeliverableCode(deliverableCode);
			technicalspecification.setDossierId(dossierId);
			technicalspecification.setDossierIdCTN(dossierIdCTN);
			technicalspecification.setDossierNo(dossierNo);
			technicalspecification.setReferenceUid(vrVehicleTypeCertificateId + "");
			technicalspecification.setConvertAssembleId(vrVehicleTypeCertificateId);

			if (isnew) {
				VRTechnicalSpec_XCGLocalServiceUtil.addVRTechnicalSpec_XCG(technicalspecification);

			} else {
				VRTechnicalSpec_XCGLocalServiceUtil.updateVRTechnicalSpec_XCG(technicalspecification);

			}
		} catch (Exception e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  updateVRTechnicalSpec_XCG");

		}

		prefixSpecificationCode = "bb_";
		specificationValue = StringPool.BLANK;
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XCGPart1> lstTechnicalSpec = VRTechnicalSpec_XCGPart1LocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XCGPart1 technicalspecification = new VRTechnicalSpec_XCGPart1Impl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				isnew = true;
			}

			specificationValue = objChungChi.getString("loai_dong_co");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLoai_dong_co(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01007");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01007(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01008");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01008(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01009");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01009(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01010");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01010(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01011");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01011(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01024");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01024(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01025");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01025(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01026");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01026(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01027");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01027(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01028");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01028(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01030");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01030(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01031");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01031(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01032");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01032(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01033");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01033(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01034");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01034(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01035");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01035(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01036");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01036(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01037");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01037(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01038");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01038(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01039");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01039(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01040");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01040(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01041");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01041(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01042");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01042(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01043");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01043(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01044");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01044(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01045");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01045(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01046");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01046(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01047");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01047(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01049");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01049(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01050");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01050(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01051");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01051(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01052");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01052(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01053");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01053(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01054");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01054(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01055");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01055(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01056");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01056(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01057");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01057(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01058");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01058(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01059");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01059(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01060");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01060(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01062");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01062(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01063");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01063(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01064");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01064(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01065");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01065(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01066");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01066(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01067");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01067(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01068");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01068(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01069");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01069(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01070");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01070(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01072");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01072(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01073");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01073(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01074");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01074(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01075");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01075(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01076");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01076(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01077");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01077(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01078");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01078(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01079");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01079(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01080");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01080(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01081");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01081(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01082");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01082(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01083");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01083(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01084");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01084(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01085");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01085(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01086");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01086(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01087");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01087(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01088");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01088(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01089");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01089(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01090");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01090(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01091");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01091(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01092");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01092(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01093");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01093(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01094");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01094(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01095");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01095(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01096");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01096(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01097");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01097(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01098");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01098(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01099");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01099(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01100");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01100(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01101");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01101(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01102");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01102(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01103");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01103(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01104");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01104(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01105");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01105(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01106");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01106(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01107");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01107(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01108");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01108(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01109");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01109(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01110");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01110(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01111");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01111(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01112");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01112(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01113");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01113(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01114");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01114(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01115");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01115(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01116");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01116(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01117");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01117(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01118");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01118(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01119");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01119(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01120");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01120(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01121");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01121(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01122");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01122(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01123");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01123(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01124");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01124(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01125");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01125(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01126");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01126(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01127");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01127(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01128");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01128(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01129");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01129(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01130");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01130(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01131");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01131(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01132");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01132(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01133");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01133(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01134");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01134(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01135");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01135(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01136");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01136(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01137");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01137(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01138");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01138(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01139");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01139(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01140");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01140(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01141");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01141(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01142");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01142(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01143");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01143(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01144");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01144(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01145");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01145(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01146");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01146(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01147");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01147(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01148");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01148(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01149");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01149(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01150");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01150(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01151");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01151(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01152");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01152(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01153");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01153(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01154");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01154(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01155");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01155(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01156");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01156(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01157");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01157(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01158");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01158(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01159");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01159(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01160");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01160(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01161");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01161(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01162");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01162(specificationValue);
			}

			if (!isnew) {
				VRTechnicalSpec_XCGPart1LocalServiceUtil.updateVRTechnicalSpec_XCGPart1(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  updateVRTechnicalSpec_XCGPart1");

		}

		prefixSpecificationCode = "bb_";
		specificationValue = StringPool.BLANK;
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XCGPart2> lstTechnicalSpec = VRTechnicalSpec_XCGPart2LocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XCGPart2 technicalspecification = new VRTechnicalSpec_XCGPart2Impl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				isnew = true;
			}

			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01163");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01163(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01164");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01164(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01165");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01165(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01166");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01166(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01167");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01167(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01169");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01169(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01170");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01170(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01171");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01171(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01172");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01172(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01173");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01173(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01174");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01174(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01175");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01175(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01176");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01176(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01177");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01177(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01178");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01178(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01179");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01179(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01180");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01180(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01181");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01181(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01182");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01182(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01183");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01183(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01184");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01184(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01185");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01185(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01186");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01186(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01187");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01187(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01188");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01188(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01189");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01189(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01190");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01190(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01191");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01191(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01192");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01192(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01193");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01193(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01194");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01194(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01195");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01195(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01196");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01196(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01197");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01197(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01198");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01198(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01199");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01199(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01200");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01200(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01202");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01202(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01203");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01203(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01204");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01204(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01205");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01205(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01206");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01206(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01207");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01207(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01208");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01208(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01209");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01209(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01210");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01210(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01212");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01212(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01213");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01213(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01214");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01214(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01215");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01215(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01216");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01216(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01217");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01217(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01218");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01218(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01219");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01219(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01220");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01220(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01221");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01221(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01222");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01222(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01223");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01223(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01224");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01224(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01225");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01225(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01226");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01226(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01228");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01228(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01230");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01230(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01231");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01231(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01232");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01232(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01234");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01234(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01236");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01236(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01237");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01237(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01229");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01229(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01238");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01238(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01239");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01239(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01240");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01240(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01241");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01241(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01242");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01242(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01243");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01243(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01235");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01235(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01244");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01244(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01245");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01245(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01246");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01246(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01247");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01247(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01248");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01248(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01249");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01249(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG11248");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG11248(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG11249");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG11249(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01250");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01250(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01251");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01251(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01252");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01252(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01253");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01253(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01255");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01255(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01256");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01256(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01257");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01257(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01258");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01258(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01259");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01259(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01260");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01260(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01261");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01261(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01262");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01262(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG11253");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG11253(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01263");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01263(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01264");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01264(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01265");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01265(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01266");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01266(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01901");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01901(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01267");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01267(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01902");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01902(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01268");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01268(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01269");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01269(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01903");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01903(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01270");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01270(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01271");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01271(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01273");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01273(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01274");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01274(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01275");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01275(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01276");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01276(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01277");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01277(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01278");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01278(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01279");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01279(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01280");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01280(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01281");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01281(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01282");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01282(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01283");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01283(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01284");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01284(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01285");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01285(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01286");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01286(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01287");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01287(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01288");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01288(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01289");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01289(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01290");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01290(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01291");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01291(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01292");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01292(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01293");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01293(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01294");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01294(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01295");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01295(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01296");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01296(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01297");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01297(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01298");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01298(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01300");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01300(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01301");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01301(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01302");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01302(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01303");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01303(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01304");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01304(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01305");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01305(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01306");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01306(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01307");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01307(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01308");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01308(specificationValue);
			}

			if (!isnew) {
				VRTechnicalSpec_XCGPart2LocalServiceUtil.updateVRTechnicalSpec_XCGPart2(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  updateVRTechnicalSpec_XCGPart2");

		}

		prefixSpecificationCode = "bb_";
		specificationValue = StringPool.BLANK;
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XCGPart3> lstTechnicalSpec = VRTechnicalSpec_XCGPart3LocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XCGPart3 technicalspecification = new VRTechnicalSpec_XCGPart3Impl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				isnew = true;
			}

			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01310");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01310(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01311");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01311(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01312");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01312(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01313");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01313(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01314");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01314(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01315");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01315(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01316");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01316(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01317");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01317(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01318");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01318(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01319");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01319(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01320");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01320(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01321");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01321(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01322");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01322(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01323");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01323(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01324");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01324(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01325");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01325(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01326");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01326(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01327");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01327(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01328");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01328(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01330");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01330(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01331");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01331(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01332");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01332(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01333");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01333(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01334");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01334(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01335");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01335(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01336");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01336(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01337");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01337(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01338");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01338(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01339");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01339(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01340");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01340(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01341");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01341(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01342");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01342(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01343");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01343(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01344");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01344(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01345");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01345(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01346");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01346(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01347");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01347(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01348");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01348(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01349");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01349(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01350");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01350(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01351");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01351(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01352");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01352(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01353");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01353(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01354");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01354(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01355");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01355(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01356");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01356(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01357");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01357(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01358");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01358(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01359");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01359(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01360");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01360(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01361");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01361(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01362");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01362(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01363");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01363(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01364");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01364(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01365");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01365(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01366");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01366(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01367");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01367(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01368");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01368(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01369");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01369(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01370");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01370(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01371");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01371(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01372");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01372(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01373");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01373(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01374");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01374(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01375");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01375(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01376");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01376(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01377");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01377(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01378");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01378(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01379");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01379(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01381");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01381(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01382");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01382(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01383");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01383(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01384");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01384(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01385");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01385(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01386");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01386(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01387");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01387(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01388");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01388(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01389");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01389(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01390");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01390(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01391");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01391(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01392");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01392(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01393");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01393(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01394");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01394(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01395");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01395(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01396");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01396(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01397");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01397(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01398");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01398(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01399");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01399(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01400");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01400(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01402");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01402(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01403");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01403(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01404");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01404(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01405");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01405(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01406");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01406(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01407");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01407(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01408");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01408(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01409");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01409(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01410");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01410(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01411");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01411(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01412");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01412(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01413");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01413(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01414");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01414(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01415");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01415(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01416");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01416(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01417");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01417(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01418");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01418(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01419");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01419(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01420");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01420(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01421");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01421(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01422");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01422(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01423");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01423(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01424");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01424(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01425");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01425(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01426");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01426(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01427");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01427(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01428");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01428(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01437");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01437(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01429");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01429(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01430");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01430(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01431");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01431(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01432");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01432(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01433");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01433(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01434");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01434(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01435");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01435(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01436");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01436(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01439");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01439(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01440");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01440(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01441");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01441(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01442");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01442(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01443");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01443(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01445");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01445(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01446");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01446(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01447");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01447(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01448");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01448(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01449");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01449(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01450");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01450(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01451");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01451(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01452");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01452(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01453");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01453(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01454");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01454(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01455");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01455(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01456");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01456(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01457");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01457(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01458");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01458(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01459");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01459(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01460");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01460(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01461");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01461(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01462");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01462(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01463");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01463(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01464");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01464(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01465");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01465(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01466");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01466(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01467");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01467(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01468");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01468(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01469");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01469(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01470");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01470(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01471");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01471(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01472");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01472(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01473");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01473(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01474");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01474(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01475");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01475(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01476");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01476(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01477");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01477(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01478");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01478(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01479");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01479(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01480");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01480(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01481");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01481(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01482");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01482(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01483");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01483(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01484");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01484(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01485");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01485(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01486");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01486(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01487");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01487(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01488");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01488(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01489");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01489(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01490");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01490(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01491");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01491(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01492");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01492(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01493");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01493(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01494");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01494(specificationValue);
			}

			if (!isnew) {
				VRTechnicalSpec_XCGPart3LocalServiceUtil.updateVRTechnicalSpec_XCGPart3(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  updateVRTechnicalSpec_XCGPart3");

		}

		prefixSpecificationCode = "bb_";
		specificationValue = StringPool.BLANK;
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XCGPart4> lstTechnicalSpec = VRTechnicalSpec_XCGPart4LocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XCGPart4 technicalspecification = new VRTechnicalSpec_XCGPart4Impl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				isnew = true;
			}

			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01496");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01496(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01497");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01497(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01498");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01498(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01499");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01499(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01500");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01500(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01501");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01501(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01502");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01502(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01503");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01503(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01504");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01504(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01505");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01505(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01506");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01506(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01507");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01507(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01508");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01508(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01509");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01509(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01510");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01510(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01512");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01512(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01513");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01513(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01514");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01514(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01515");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01515(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01516");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01516(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01517");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01517(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01518");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01518(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01519");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01519(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01520");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01520(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01521");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01521(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01522");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01522(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01523");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01523(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01524");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01524(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01525");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01525(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01526");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01526(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01527");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01527(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01528");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01528(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01529");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01529(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01530");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01530(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01531");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01531(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01904");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01904(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01533");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01533(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01905");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01905(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01534");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01534(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01906");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01906(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01535");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01535(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01907");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01907(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01536");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01536(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01908");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01908(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01537");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01537(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01909");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01909(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01538");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01538(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01910");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01910(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01539");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01539(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG11535");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG11535(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01541");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01541(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01542");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01542(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01911");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01911(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01543");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01543(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01912");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01912(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01544");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01544(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01545");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01545(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01546");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01546(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01547");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01547(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01548");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01548(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01913");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01913(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01549");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01549(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01914");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01914(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01550");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01550(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01551");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01551(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01552");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01552(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01553");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01553(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01554");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01554(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01915");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01915(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01555");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01555(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01556");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01556(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01557");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01557(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01558");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01558(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01559");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01559(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01560");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01560(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01561");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01561(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01916");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01916(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01562");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01562(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01917");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01917(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01563");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01563(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01918");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01918(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01564");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01564(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01565");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01565(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01566");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01566(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01567");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01567(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01568");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01568(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01919");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01919(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01569");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01569(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01570");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01570(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01571");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01571(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01572");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01572(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01920");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01920(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01573");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01573(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01921");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01921(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01574");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01574(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01922");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01922(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01575");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01575(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01576");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01576(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01577");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01577(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01578");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01578(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01579");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01579(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01580");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01580(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01581");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01581(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01582");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01582(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01583");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01583(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01584");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01584(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01585");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01585(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01586");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01586(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01587");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01587(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01588");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01588(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01589");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01589(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01590");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01590(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01591");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01591(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01592");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01592(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01593");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01593(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01594");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01594(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01595");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01595(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01596");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01596(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01597");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01597(specificationValue);
			}

			if (!isnew) {
				VRTechnicalSpec_XCGPart4LocalServiceUtil.updateVRTechnicalSpec_XCGPart4(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  updateVRTechnicalSpec_XCGPart4");

		}

		prefixSpecificationCode = "bb_";
		specificationValue = StringPool.BLANK;
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XCGPart5> lstTechnicalSpec = VRTechnicalSpec_XCGPart5LocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XCGPart5 technicalspecification = new VRTechnicalSpec_XCGPart5Impl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				isnew = true;
			}

			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01598");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01598(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01599");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01599(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01600");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01600(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01601");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01601(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01602");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01602(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01603");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01603(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01923");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01923(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01604");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01604(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01924");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01924(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01605");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01605(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01606");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01606(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01607");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01607(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01608");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01608(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01609");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01609(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01925");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01925(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01610");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01610(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01926");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01926(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01611");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01611(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01612");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01612(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01928");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01928(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01613");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01613(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01929");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01929(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01614");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01614(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01930");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01930(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01615");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01615(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01931");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01931(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01616");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01616(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01932");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01932(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01617");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01617(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01933");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01933(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01618");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01618(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01934");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01934(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01619");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01619(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01935");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01935(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01620");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01620(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01936");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01936(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01621");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01621(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01937");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01937(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01622");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01622(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01938");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01938(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01623");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01623(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01939");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01939(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01624");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01624(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01940");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01940(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01625");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01625(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01941");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01941(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01626");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01626(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01942");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01942(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01627");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01627(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01943");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01943(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01628");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01628(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01944");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01944(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01630");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01630(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01631");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01631(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01632");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01632(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01633");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01633(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01634");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01634(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01635");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01635(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01636");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01636(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01637");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01637(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01638");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01638(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01639");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01639(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01640");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01640(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01641");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01641(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01642");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01642(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01643");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01643(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01644");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01644(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01645");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01645(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01646");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01646(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01647");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01647(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01648");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01648(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01649");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01649(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01650");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01650(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01651");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01651(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01652");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01652(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01653");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01653(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01654");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01654(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01655");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01655(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01656");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01656(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01657");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01657(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01658");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01658(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01659");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01659(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01660");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01660(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01661");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01661(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01662");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01662(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01663");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01663(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01664");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01664(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01665");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01665(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01666");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01666(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01667");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01667(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01668");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01668(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01669");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01669(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01670");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01670(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01671");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01671(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01672");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01672(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01673");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01673(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01674");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01674(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01675");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01675(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01676");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01676(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01677");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01677(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01678");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01678(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01679");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01679(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01680");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01680(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01681");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01681(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01682");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01682(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01683");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01683(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01684");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01684(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01685");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01685(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01686");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01686(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01687");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01687(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01688");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01688(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01689");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01689(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01690");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01690(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01691");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01691(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01692");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01692(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01693");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01693(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01694");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01694(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01695");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01695(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01696");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01696(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01697");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01697(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01698");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01698(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01699");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01699(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01700");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01700(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01701");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01701(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01702");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01702(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01703");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01703(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01704");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01704(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01705");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01705(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01706");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01706(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01707");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01707(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01708");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01708(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01709");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01709(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01710");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01710(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01711");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01711(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01712");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01712(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01713");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01713(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01714");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01714(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01715");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01715(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01716");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01716(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01717");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01717(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01718");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01718(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01719");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01719(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01720");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01720(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01721");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01721(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01722");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01722(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01723");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01723(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01724");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01724(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01725");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01725(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01726");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01726(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01727");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01727(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01728");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01728(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01729");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01729(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01730");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01730(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01731");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01731(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01732");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01732(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01733");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01733(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01734");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01734(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01735");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01735(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01736");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01736(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01737");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01737(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01738");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01738(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01739");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01739(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01740");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01740(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01741");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01741(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01742");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01742(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01744");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01744(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01745");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01745(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01746");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01746(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01747");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01747(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01748");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01748(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01749");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01749(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01945");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01945(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01750");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01750(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01946");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01946(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01751");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01751(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01752");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01752(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01753");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01753(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01754");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01754(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01756");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01756(specificationValue);
			}

			if (!isnew) {
				VRTechnicalSpec_XCGPart5LocalServiceUtil.updateVRTechnicalSpec_XCGPart5(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  updateVRTechnicalSpec_XCGPart5");

		}

		prefixSpecificationCode = "bb_";
		specificationValue = StringPool.BLANK;
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XCGPart6> lstTechnicalSpec = VRTechnicalSpec_XCGPart6LocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XCGPart6 technicalspecification = new VRTechnicalSpec_XCGPart6Impl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				isnew = true;
			}

			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01757");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01757(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01758");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01758(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01759");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01759(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01948");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01948(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01760");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01760(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01949");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01949(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01761");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01761(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01950");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01950(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01762");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01762(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01951");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01951(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01763");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01763(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01952");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01952(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01764");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01764(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01953");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01953(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01765");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01765(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01954");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01954(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01766");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01766(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01955");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01955(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01767");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01767(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01956");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01956(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01768");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01768(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01957");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01957(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01769");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01769(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01958");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01958(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01770");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01770(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01771");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01771(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01959");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01959(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01772");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01772(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01773");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01773(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01774");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01774(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01775");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01775(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01776");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01776(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01777");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01777(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01778");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01778(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01779");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01779(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01780");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01780(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01781");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01781(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01783");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01783(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01785");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01785(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01786");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01786(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01787");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01787(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01788");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01788(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01789");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01789(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01790");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01790(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01791");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01791(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01792");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01792(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01793");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01793(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01794");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01794(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01795");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01795(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01796");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01796(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01797");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01797(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01798");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01798(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01799");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01799(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01801");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01801(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01802");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01802(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01803");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01803(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01804");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01804(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01805");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01805(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01806");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01806(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01807");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01807(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01808");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01808(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01809");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01809(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01810");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01810(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01811");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01811(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01812");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01812(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01813");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01813(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCG01814");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCG01814(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG007");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG007(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG008");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG008(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG009");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG009(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG010");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG010(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG011");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG011(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG015");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG015(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG018");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG018(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG023");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG023(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG024");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG024(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG025");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG025(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG026");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG026(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG027");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG027(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG028");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG028(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG029");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG029(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG030");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG030(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG031");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG031(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG032");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG032(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG033");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG033(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG034");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG034(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG035");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG035(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "TDTKXCG036");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setTDTKXCG036(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG01");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG01(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG02");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG02(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG03");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG03(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG04");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG04(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG05");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG05(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG06");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG06(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG07");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG07(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG08");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG08(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG09");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG09(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG10");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG10(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG11");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG11(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG12");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG12(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG13");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG13(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG14");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG14(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG15");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG15(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG16");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG16(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG17");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG17(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG18");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG18(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG19");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG19(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG20");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG20(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG21");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG21(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG22");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG22(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG23");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG23(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG24");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG24(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG26");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG26(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG27");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG27(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG28");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG28(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG29");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG29(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG30");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG30(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG31");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG31(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG33");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG33(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG34");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG34(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG35");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG35(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG36");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG36(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG38");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG38(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG39");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG39(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG40");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG40(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG42");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG42(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG43");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG43(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG44");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG44(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG45");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG45(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG46");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG46(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG47");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG47(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG48");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG48(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG49");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG49(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG50");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG50(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG51");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG51(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG52");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG52(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG53");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG53(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCG54");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCG54(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG007");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG007(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG008");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG008(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG009");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG009(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG010");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG010(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG011");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG011(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG015");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG015(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG018");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG018(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG023");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG023(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG024");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG024(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCG025");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCG025(specificationValue);
			}

			if (!isnew) {
				VRTechnicalSpec_XCGPart6LocalServiceUtil.updateVRTechnicalSpec_XCGPart6(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  updateVRTechnicalSpec_XCGPart6");

		}

	}

	public void updateVRTechnicalSpec_XMY(String strChungChi, long vrVehicleTypeCertificateId, long dossierId,
			String dossierIdCTN, String dossierNo, Date modifyDate, String deliverableCode) {
		String prefixSpecificationCode = "bb_";
		String specificationValue = StringPool.BLANK;

		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XMY> lstTechnicalSpec = VRTechnicalSpec_XMYLocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XMY technicalspecification = new VRTechnicalSpec_XMYImpl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				technicalspecification.setId(CounterLocalServiceUtil.increment(VRTechnicalSpec_XMY.class.getName()));

				isnew = true;
			}
			technicalspecification.setMtCore(1);
			technicalspecification.setModifyDate(modifyDate);
			technicalspecification.setSyncDate(new Date());
			technicalspecification.setDeliverableCode(deliverableCode);
			technicalspecification.setDossierId(dossierId);
			technicalspecification.setDossierIdCTN(dossierIdCTN);
			technicalspecification.setDossierNo(dossierNo);
			technicalspecification.setReferenceUid(vrVehicleTypeCertificateId + "");
			technicalspecification.setConvertAssembleId(vrVehicleTypeCertificateId);

			specificationValue = objChungChi.getString("loai_dong_co");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLoai_dong_co(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01007");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01007(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01008");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01008(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01009");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01009(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01010");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01010(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01011");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01011(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01030");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01030(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01031");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01031(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01032");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01032(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01033");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01033(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01034");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01034(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01035");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01035(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01036");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01036(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01037");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01037(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01038");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01038(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01039");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01039(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01040");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01040(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01041");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01041(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01042");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01042(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01043");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01043(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01044");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01044(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01045");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01045(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01046");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01046(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01047");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01047(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01050");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01050(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01051");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01051(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01052");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01052(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01053");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01053(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01054");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01054(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01055");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01055(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01056");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01056(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01057");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01057(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01058");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01058(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01059");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01059(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01060");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01060(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01062");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01062(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01063");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01063(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01064");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01064(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01065");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01065(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01670");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01670(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01671");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01671(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01672");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01672(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01673");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01673(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01674");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01674(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01675");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01675(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01676");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01676(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01677");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01677(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01678");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01678(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01679");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01679(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01680");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01680(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01681");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01681(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01682");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01682(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01683");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01683(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01684");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01684(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01685");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01685(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01686");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01686(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01687");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01687(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01688");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01688(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01689");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01689(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01690");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01690(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01691");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01691(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01692");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01692(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01693");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01693(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01694");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01694(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01695");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01695(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01696");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01696(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01697");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01697(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01698");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01698(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01699");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01699(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01700");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01700(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01701");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01701(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01702");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01702(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01703");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01703(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01704");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01704(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01705");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01705(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01706");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01706(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01707");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01707(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01708");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01708(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01709");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01709(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01710");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01710(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01711");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01711(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01712");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01712(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01713");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01713(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01714");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01714(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01715");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01715(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01716");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01716(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01717");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01717(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01718");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01718(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01719");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01719(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01720");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01720(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01721");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01721(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01722");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01722(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01723");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01723(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01724");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01724(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01725");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01725(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01726");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01726(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01729");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01729(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01730");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01730(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01731");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01731(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01732");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01732(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01733");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01733(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01734");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01734(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01735");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01735(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01736");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01736(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01737");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01737(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01738");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01738(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01739");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01739(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01740");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01740(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01741");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01741(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01742");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01742(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01744");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01744(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01745");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01745(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01746");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01746(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01747");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01747(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01748");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01748(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01749");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01749(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01758");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01758(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01759");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01759(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01760");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01760(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01761");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01761(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01762");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01762(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01763");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01763(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01764");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01764(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01779");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01779(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01780");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01780(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01781");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01781(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01782");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01782(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01783");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01783(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01785");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01785(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01786");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01786(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01787");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01787(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01788");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01788(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01789");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01789(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01790");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01790(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01791");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01791(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01792");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01792(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01793");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01793(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01794");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01794(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01795");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01795(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01796");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01796(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01797");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01797(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01798");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01798(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01799");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01799(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01800");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01800(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01801");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01801(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01802");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01802(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01804");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01804(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01805");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01805(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01806");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01806(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01807");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01807(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01808");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01808(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01809");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01809(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01810");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01810(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01811");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01811(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01812");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01812(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01813");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01813(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY01814");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY01814(specificationValue);
			}

			if (isnew) {
				VRTechnicalSpec_XMYLocalServiceUtil.addVRTechnicalSpec_XMY(technicalspecification);

			} else {
				VRTechnicalSpec_XMYLocalServiceUtil.updateVRTechnicalSpec_XMY(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  updateVRTechnicalSpec_XMY");

		}

		prefixSpecificationCode = "bb_";
		specificationValue = StringPool.BLANK;
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XMYPart2> lstTechnicalSpec = VRTechnicalSpec_XMYPart2LocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XMYPart2 technicalspecification = new VRTechnicalSpec_XMYPart2Impl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				isnew = true;
			}

			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0010");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0010(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0011");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0011(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0015");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0015(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0018");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0018(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0023");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0023(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0024");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0024(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0025");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0025(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0026");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0026(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0027");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0027(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0028");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0028(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0029");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0029(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0030");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0030(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0031");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0031(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0032");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0032(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0033");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0033(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0034");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0034(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0036");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0036(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0037");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0037(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0038");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0038(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0039");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0039(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0040");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0040(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0041");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0041(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0042");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0042(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0043");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0043(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0044");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0044(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0045");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0045(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0046");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0046(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0048");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0048(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0049");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0049(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0050");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0050(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0051");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0051(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0052");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0052(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0053");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0053(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0054");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0054(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0055");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0055(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0056");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0056(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0057");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0057(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0058");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0058(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0059");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0059(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0060");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0060(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0061");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0061(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0062");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0062(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0063");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0063(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0064");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0064(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0065");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0065(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0066");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0066(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0067");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0067(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0068");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0068(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0070");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0070(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0071");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0071(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0072");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0072(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0073");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0073(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0074");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0074(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0075");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0075(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0076");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0076(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0077");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0077(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0078");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0078(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0079");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0079(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0080");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0080(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0081");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0081(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0082");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0082(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0083");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0083(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0084");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0084(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0085");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0085(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0086");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0086(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0087");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0087(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0088");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0088(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0089");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0089(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0090");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0090(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0091");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0091(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0092");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0092(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0093");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0093(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0094");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0094(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0095");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0095(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0096");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0096(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0097");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0097(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0098");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0098(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0099");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0099(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0100");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0100(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0101");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0101(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0102");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0102(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0103");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0103(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0104");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0104(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0105");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0105(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0106");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0106(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0107");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0107(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0108");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0108(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0109");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0109(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0110");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0110(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0111");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0111(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0112");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0112(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0113");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0113(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0114");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0114(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0115");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0115(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0116");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0116(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0117");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0117(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0118");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0118(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0119");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0119(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0120");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0120(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0121");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0121(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0122");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0122(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0123");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0123(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0124");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0124(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0125");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0125(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0126");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0126(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0127");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0127(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0128");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0128(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0129");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0129(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0130");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0130(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0131");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0131(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0132");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0132(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0133");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0133(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0134");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0134(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0135");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0135(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0136");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0136(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0137");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0137(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0138");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0138(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0139");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0139(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0140");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0140(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0141");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0141(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0142");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0142(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0143");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0143(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0144");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0144(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0145");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0145(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0146");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0146(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0147");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0147(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0148");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0148(specificationValue);
			}

			if (!isnew) {
				VRTechnicalSpec_XMYPart2LocalServiceUtil.updateVRTechnicalSpec_XMYPart2(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  VRTechnicalSpec_XMYPart2");

		}

		prefixSpecificationCode = "bb_";
		specificationValue = StringPool.BLANK;
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XMYPart3> lstTechnicalSpec = VRTechnicalSpec_XMYPart3LocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XMYPart3 technicalspecification = new VRTechnicalSpec_XMYPart3Impl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				isnew = true;
			}

			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0149");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0149(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0150");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0150(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0151");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0151(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0152");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0152(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0153");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0153(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0154");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0154(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0155");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0155(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0156");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0156(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0157");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0157(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0158");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0158(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0159");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0159(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0160");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0160(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0161");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0161(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0162");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0162(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0163");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0163(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0164");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0164(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0165");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0165(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0166");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0166(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0167");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0167(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0168");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0168(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0169");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0169(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0170");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0170(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0171");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0171(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0172");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0172(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0173");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0173(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0174");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0174(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0175");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0175(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0176");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0176(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0177");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0177(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0178");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0178(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0179");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0179(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0180");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0180(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0181");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0181(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0182");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0182(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0183");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0183(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0184");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0184(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0185");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0185(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0186");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0186(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0187");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0187(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0188");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0188(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0189");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0189(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0190");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0190(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0191");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0191(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0192");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0192(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0193");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0193(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0194");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0194(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0195");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0195(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0196");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0196(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0197");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0197(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0198");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0198(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0199");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0199(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0200");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0200(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0201");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0201(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0202");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0202(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0203");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0203(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0204");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0204(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0205");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0205(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0207");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0207(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0208");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0208(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0209");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0209(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0210");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0210(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0211");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0211(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0212");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0212(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0213");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0213(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0214");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0214(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0215");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0215(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0216");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0216(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0217");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0217(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0218");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0218(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0219");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0219(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0220");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0220(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0221");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0221(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0222");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0222(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0223");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0223(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0224");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0224(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0225");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0225(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0226");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0226(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0227");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0227(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0228");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0228(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0229");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0229(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0230");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0230(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0231");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0231(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0232");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0232(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0233");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0233(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0234");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0234(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0235");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0235(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0236");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0236(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0237");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0237(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0238");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0238(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0239");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0239(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0240");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0240(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0241");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0241(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0242");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0242(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0243");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0243(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0244");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0244(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0245");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0245(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0246");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0246(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0247");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0247(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0248");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0248(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0249");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0249(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0250");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0250(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0251");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0251(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0252");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0252(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0253");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0253(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0254");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0254(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0255");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0255(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0256");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0256(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0257");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0257(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0258");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0258(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0259");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0259(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0260");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0260(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0261");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0261(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0262");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0262(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0263");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0263(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XMY0264");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXMY0264(specificationValue);
			}

			prefixSpecificationCode = "kl_";
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY015");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY015(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY018");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY018(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY024");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY024(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY026");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY026(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY027");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY027(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY028");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY028(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY029");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY029(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY033");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY033(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY034");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY034(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY037");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY037(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY038");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY038(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY039");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY039(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY040");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY040(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY041");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY041(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY042");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY042(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY043");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY043(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY044");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY044(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY045");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY045(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD030");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD030(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY046");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY046(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY047");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY047(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY053");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY053(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXMY054");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXMY054(specificationValue);
			}

			if (!isnew) {
				VRTechnicalSpec_XMYPart3LocalServiceUtil.updateVRTechnicalSpec_XMYPart3(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  VRTechnicalSpec_XMYPart3");

		}
	}

	public void updateVRTechnicalSpec_XDD(String strChungChi, long vrVehicleTypeCertificateId, long dossierId,
			String dossierIdCTN, String dossierNo, Date modifyDate, String deliverableCode) {
		String prefixSpecificationCode = "bb_";
		String specificationValue = StringPool.BLANK;

		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XDD> lstTechnicalSpec = VRTechnicalSpec_XDDLocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XDD technicalspecification = new VRTechnicalSpec_XDDImpl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				technicalspecification.setId(CounterLocalServiceUtil.increment(VRTechnicalSpec_XDD.class.getName()));

				isnew = true;
			}
			technicalspecification.setMtCore(1);
			technicalspecification.setModifyDate(modifyDate);
			technicalspecification.setSyncDate(new Date());
			technicalspecification.setDeliverableCode(deliverableCode);
			technicalspecification.setDossierId(dossierId);
			technicalspecification.setDossierIdCTN(dossierIdCTN);
			technicalspecification.setDossierNo(dossierNo);
			technicalspecification.setReferenceUid(vrVehicleTypeCertificateId + "");
			technicalspecification.setConvertAssembleId(vrVehicleTypeCertificateId);

			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01007");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01007(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01008");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01008(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01009");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01009(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01010");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01010(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01011");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01011(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01024");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01024(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01025");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01025(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01026");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01026(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01027");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01027(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01028");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01028(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01030");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01030(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01031");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01031(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01032");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01032(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01033");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01033(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01034");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01034(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01035");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01035(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01036");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01036(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01037");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01037(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01038");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01038(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01039");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01039(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01040");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01040(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01041");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01041(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01042");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01042(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01043");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01043(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01044");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01044(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01045");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01045(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01046");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01046(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01047");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01047(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01049");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01049(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01050");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01050(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01051");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01051(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01052");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01052(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01053");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01053(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01054");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01054(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01055");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01055(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01056");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01056(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01057");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01057(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01058");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01058(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01059");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01059(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD01060");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD01060(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0076");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0076(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0077");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0077(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0078");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0078(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0079");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0079(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0080");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0080(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0081");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0081(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0082");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0082(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0083");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0083(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0084");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0084(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0085");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0085(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0086");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0086(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0087");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0087(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0088");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0088(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0089");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0089(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0090");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0090(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0091");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0091(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0092");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0092(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0093");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0093(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0094");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0094(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0095");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0095(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0096");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0096(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0097");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0097(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0098");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0098(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0099");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0099(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0100");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0100(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0101");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0101(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0102");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0102(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0103");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0103(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0104");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0104(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0105");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0105(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0106");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0106(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0107");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0107(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0108");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0108(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0109");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0109(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0110");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0110(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0111");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0111(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0112");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0112(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0113");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0113(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0114");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0114(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0115");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0115(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0116");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0116(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0117");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0117(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0118");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0118(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0119");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0119(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0120");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0120(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0121");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0121(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0122");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0122(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0123");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0123(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0124");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0124(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0125");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0125(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0126");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0126(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0127");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0127(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0128");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0128(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0129");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0129(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0130");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0130(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0131");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0131(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0132");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0132(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0133");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0133(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0134");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0134(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0135");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0135(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0136");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0136(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0137");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0137(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0138");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0138(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0139");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0139(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0140");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0140(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0141");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0141(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0142");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0142(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0143");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0143(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0144");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0144(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0145");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0145(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0146");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0146(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0147");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0147(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0148");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0148(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0149");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0149(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0150");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0150(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0151");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0151(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0152");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0152(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0153");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0153(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0154");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0154(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0155");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0155(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0156");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0156(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0157");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0157(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0158");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0158(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0159");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0159(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0160");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0160(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XDD0161");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXDD0161(specificationValue);
			}

			prefixSpecificationCode = "kl_";
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD007");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD007(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD008");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD008(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD009");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD009(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD010");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD010(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD011");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD011(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD015");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD015(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD018");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD018(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD023");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD023(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD024");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD024(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD025");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD025(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD026");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD026(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD027");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD027(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD028");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD028(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD029");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD029(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD031");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD031(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD032");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD032(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXDD033");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXDD033(specificationValue);
			}

			if (isnew) {
				VRTechnicalSpec_XDDLocalServiceUtil.addVRTechnicalSpec_XDD(technicalspecification);

			} else {
				VRTechnicalSpec_XDDLocalServiceUtil.updateVRTechnicalSpec_XDD(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  VRTechnicalSpec_XDD");

		}
	}

	public void updateVRTechnicalSpec_XCN(String strChungChi, long vrVehicleTypeCertificateId, long dossierId,
			String dossierIdCTN, String dossierNo, Date modifyDate, String deliverableCode) {
		String prefixSpecificationCode = "bb_";
		String specificationValue = StringPool.BLANK;

		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XCN> lstTechnicalSpec = VRTechnicalSpec_XCNLocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XCN technicalspecification = new VRTechnicalSpec_XCNImpl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				technicalspecification.setId(CounterLocalServiceUtil.increment(VRTechnicalSpec_XCN.class.getName()));

				isnew = true;
			}
			technicalspecification.setMtCore(1);
			technicalspecification.setModifyDate(modifyDate);
			technicalspecification.setSyncDate(new Date());
			technicalspecification.setDeliverableCode(deliverableCode);
			technicalspecification.setDossierId(dossierId);
			technicalspecification.setDossierIdCTN(dossierIdCTN);
			technicalspecification.setDossierNo(dossierNo);
			technicalspecification.setReferenceUid(vrVehicleTypeCertificateId + "");
			technicalspecification.setConvertAssembleId(vrVehicleTypeCertificateId);

			specificationValue = objChungChi.getString("loai_dong_co");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setLoai_dong_co(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01007");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01007(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01008");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01008(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01009");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01009(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01010");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01010(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01011");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01011(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01024");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01024(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01025");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01025(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01026");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01026(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01027");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01027(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01028");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01028(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01030");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01030(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01031");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01031(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01032");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01032(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01033");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01033(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01034");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01034(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01035");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01035(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01036");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01036(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01037");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01037(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01038");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01038(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01039");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01039(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01040");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01040(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01041");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01041(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01042");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01042(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01043");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01043(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01044");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01044(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01045");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01045(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01046");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01046(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01047");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01047(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01049");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01049(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01050");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01050(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01051");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01051(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01052");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01052(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01053");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01053(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01054");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01054(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01055");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01055(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01056");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01056(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01057");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01057(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01058");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01058(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01059");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01059(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01060");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01060(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01062");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01062(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01063");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01063(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01064");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01064(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01065");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01065(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01066");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01066(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01067");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01067(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01068");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01068(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01069");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01069(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01100");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01100(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01101");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01101(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01102");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01102(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01103");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01103(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01104");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01104(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01105");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01105(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01106");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01106(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01107");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01107(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01108");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01108(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01109");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01109(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01110");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01110(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01111");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01111(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01112");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01112(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01113");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01113(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01114");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01114(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01115");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01115(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01116");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01116(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01117");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01117(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01118");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01118(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01119");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01119(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01120");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01120(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01121");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01121(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01122");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01122(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01123");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01123(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01124");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01124(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01125");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01125(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01126");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01126(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01127");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01127(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01128");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01128(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01129");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01129(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01130");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01130(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01131");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01131(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01132");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01132(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01133");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01133(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01134");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01134(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01135");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01135(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01136");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01136(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01137");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01137(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01138");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01138(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01139");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01139(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01140");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01140(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01141");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01141(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01142");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01142(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01143");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01143(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01144");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01144(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01145");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01145(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01146");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01146(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01147");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01147(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01148");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01148(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01149");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01149(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01150");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01150(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01151");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01151(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01152");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01152(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01153");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01153(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01154");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01154(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01155");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01155(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01156");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01156(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01157");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01157(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01158");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01158(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01159");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01159(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01160");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01160(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01161");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01161(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01162");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01162(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01163");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01163(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01164");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01164(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01165");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01165(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01166");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01166(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01167");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01167(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01168");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01168(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01169");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01169(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01170");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01170(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01171");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01171(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01172");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01172(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01173");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01173(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01174");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01174(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01175");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01175(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01176");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01176(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01177");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01177(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01178");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01178(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01179");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01179(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01180");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01180(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01181");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01181(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01182");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01182(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01183");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01183(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01184");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01184(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01185");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01185(specificationValue);
			}

			if (isnew) {
				VRTechnicalSpec_XCNLocalServiceUtil.addVRTechnicalSpec_XCN(technicalspecification);

			} else {
				VRTechnicalSpec_XCNLocalServiceUtil.updateVRTechnicalSpec_XCN(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec");

		}

		prefixSpecificationCode = "bb_";
		specificationValue = StringPool.BLANK;
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XCNPart2> lstTechnicalSpec = VRTechnicalSpec_XCNPart2LocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XCNPart2 technicalspecification = new VRTechnicalSpec_XCNPart2Impl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				isnew = true;
			}

			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01186");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01186(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01187");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01187(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01188");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01188(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01189");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01189(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01190");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01190(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01191");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01191(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01192");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01192(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01193");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01193(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01194");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01194(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01195");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01195(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01196");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01196(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01197");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01197(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01198");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01198(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01199");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01199(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01200");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01200(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01201");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01201(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01202");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01202(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01203");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01203(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01204");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01204(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01205");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01205(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01206");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01206(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01207");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01207(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01208");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01208(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01209");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01209(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01210");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01210(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01211");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01211(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01212");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01212(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01213");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01213(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01214");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01214(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01215");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01215(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01216");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01216(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01217");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01217(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01218");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01218(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01219");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01219(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01220");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01220(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01221");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01221(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01222");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01222(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01223");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01223(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01224");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01224(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01225");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01225(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01226");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01226(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01227");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01227(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01228");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01228(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01229");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01229(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01230");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01230(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01231");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01231(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01232");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01232(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01233");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01233(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01234");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01234(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01235");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01235(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01236");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01236(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01237");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01237(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01238");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01238(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01239");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01239(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01240");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01240(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01241");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01241(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01242");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01242(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01243");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01243(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01244");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01244(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01245");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01245(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01246");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01246(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01247");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01247(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01248");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01248(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01249");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01249(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01250");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01250(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01251");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01251(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01252");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01252(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01253");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01253(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01254");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01254(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01255");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01255(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01256");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01256(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01257");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01257(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01258");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01258(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01259");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01259(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01260");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01260(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01261");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01261(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01262");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01262(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01263");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01263(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01264");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01264(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01265");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01265(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01266");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01266(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01267");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01267(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01268");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01268(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01269");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01269(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01270");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01270(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01271");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01271(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01272");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01272(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01273");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01273(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01274");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01274(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01275");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01275(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01276");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01276(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01277");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01277(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01278");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01278(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01279");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01279(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01280");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01280(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01281");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01281(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01282");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01282(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01283");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01283(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01284");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01284(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01285");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01285(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01286");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01286(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01287");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01287(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01288");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01288(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01289");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01289(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01290");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01290(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01291");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01291(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01292");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01292(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01293");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01293(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01294");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01294(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01295");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01295(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01296");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01296(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01297");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01297(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01298");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01298(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01299");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01299(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01300");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01300(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01301");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01301(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01302");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01302(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01303");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01303(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01304");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01304(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01305");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01305(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01306");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01306(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01307");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01307(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01308");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01308(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01309");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01309(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01310");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01310(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01311");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01311(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01312");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01312(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01313");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01313(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01314");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01314(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01315");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01315(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01316");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01316(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01317");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01317(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01318");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01318(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01319");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01319(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01320");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01320(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01321");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01321(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01322");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01322(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01323");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01323(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01324");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01324(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01325");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01325(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01326");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01326(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01327");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01327(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01328");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01328(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01329");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01329(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01330");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01330(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01331");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01331(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01332");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01332(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01333");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01333(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01334");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01334(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01335");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01335(specificationValue);
			}

			if (!isnew) {
				VRTechnicalSpec_XCNPart2LocalServiceUtil.updateVRTechnicalSpec_XCNPart2(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  VRTechnicalSpec_XCNPart2");

		}

		prefixSpecificationCode = "bb_";
		specificationValue = StringPool.BLANK;
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XCNPart3> lstTechnicalSpec = VRTechnicalSpec_XCNPart3LocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XCNPart3 technicalspecification = new VRTechnicalSpec_XCNPart3Impl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				isnew = true;
			}

			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01336");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01336(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01337");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01337(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01338");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01338(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01339");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01339(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01340");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01340(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01341");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01341(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01342");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01342(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01343");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01343(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01344");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01344(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01345");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01345(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01346");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01346(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01347");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01347(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01348");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01348(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01349");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01349(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01350");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01350(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01351");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01351(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01352");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01352(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01353");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01353(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01354");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01354(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01355");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01355(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01356");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01356(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01357");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01357(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01358");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01358(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01359");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01359(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01360");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01360(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01361");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01361(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01362");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01362(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01363");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01363(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01364");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01364(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01365");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01365(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01366");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01366(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01367");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01367(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01368");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01368(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01369");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01369(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01370");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01370(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01371");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01371(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01372");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01372(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01373");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01373(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01374");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01374(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01375");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01375(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01376");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01376(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01377");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01377(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01378");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01378(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01379");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01379(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01380");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01380(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01381");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01381(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01382");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01382(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01383");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01383(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01384");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01384(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01385");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01385(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01386");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01386(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01387");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01387(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01388");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01388(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01389");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01389(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01390");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01390(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01391");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01391(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01392");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01392(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01393");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01393(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01394");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01394(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01395");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01395(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01396");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01396(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01397");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01397(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01398");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01398(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01399");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01399(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01400");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01400(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01401");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01401(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01402");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01402(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01403");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01403(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01404");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01404(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01405");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01405(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01406");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01406(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01407");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01407(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01408");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01408(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01409");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01409(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01410");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01410(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01411");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01411(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01412");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01412(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01413");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01413(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01414");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01414(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01415");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01415(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01416");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01416(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01417");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01417(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01418");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01418(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01419");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01419(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01420");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01420(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01421");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01421(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01422");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01422(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01423");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01423(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01424");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01424(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01425");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01425(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01426");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01426(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01427");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01427(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01428");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01428(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01429");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01429(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01430");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01430(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01431");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01431(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01432");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01432(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01433");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01433(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01434");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01434(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01435");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01435(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01436");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01436(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCN01437");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCN01437(specificationValue);
			}

			prefixSpecificationCode = "kl_";
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN015");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN015(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN018");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN018(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN026");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN026(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN027");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN027(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN028");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN028(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN033");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN033(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN034");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN034(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN037");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN037(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN038");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN038(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN039");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN039(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN040");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN040(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN041");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN041(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN042");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN042(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN043");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN043(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN044");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN044(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN045");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN045(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN046");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN046(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN047");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN047(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN053");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN053(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCN054");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCN054(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN007");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN007(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN008");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN008(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN009");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN009(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN015");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN015(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN018");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN018(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN023");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN023(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN024");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN024(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBKTSPMXCN025");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBKTSPMXCN025(specificationValue);
			}

			if (!isnew) {
				VRTechnicalSpec_XCNPart3LocalServiceUtil.updateVRTechnicalSpec_XCNPart3(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  VRTechnicalSpec_XCNPart3");

		}

	}

	public void updateVRTechnicalSpec_XCH(String strChungChi, long vrVehicleTypeCertificateId, long dossierId,
			String dossierIdCTN, String dossierNo, Date modifyDate, String deliverableCode) {
		String prefixSpecificationCode = "bb_";
		String specificationValue = StringPool.BLANK;

		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XCH> lstTechnicalSpec = VRTechnicalSpec_XCHLocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XCH technicalspecification = new VRTechnicalSpec_XCHImpl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				technicalspecification.setId(CounterLocalServiceUtil.increment(VRTechnicalSpec_XCH.class.getName()));

				isnew = true;
			}
			technicalspecification.setMtCore(1);
			technicalspecification.setModifyDate(modifyDate);
			technicalspecification.setSyncDate(new Date());
			technicalspecification.setDeliverableCode(deliverableCode);
			technicalspecification.setDossierId(dossierId);
			technicalspecification.setDossierIdCTN(dossierIdCTN);
			technicalspecification.setDossierNo(dossierNo);
			technicalspecification.setReferenceUid(vrVehicleTypeCertificateId + "");
			technicalspecification.setConvertAssembleId(vrVehicleTypeCertificateId);

			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01007");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01007(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01008");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01008(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01009");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01009(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01010");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01010(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01011");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01011(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01024");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01024(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01025");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01025(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01026");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01026(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01027");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01027(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01028");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01028(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01030");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01030(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01031");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01031(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01032");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01032(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01033");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01033(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01034");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01034(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01035");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01035(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01036");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01036(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01037");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01037(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01038");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01038(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01039");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01039(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01040");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01040(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01041");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01041(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01042");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01042(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01043");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01043(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01044");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01044(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01045");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01045(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01046");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01046(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01047");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01047(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01049");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01049(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01050");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01050(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01051");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01051(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01052");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01052(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01053");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01053(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01054");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01054(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01055");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01055(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01056");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01056(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01057");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01057(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01058");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01058(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01059");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01059(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01060");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01060(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01062");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01062(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01063");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01063(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01064");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01064(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01065");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01065(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01066");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01066(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01067");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01067(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01068");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01068(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01069");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01069(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01100");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01100(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01101");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01101(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01102");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01102(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01103");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01103(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01104");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01104(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01105");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01105(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01106");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01106(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01107");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01107(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01108");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01108(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01109");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01109(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01110");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01110(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01111");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01111(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01112");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01112(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01113");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01113(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01114");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01114(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01115");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01115(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01116");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01116(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01117");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01117(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01118");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01118(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01119");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01119(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01120");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01120(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01121");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01121(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01122");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01122(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01123");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01123(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01124");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01124(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01125");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01125(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01126");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01126(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01127");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01127(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01128");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01128(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01129");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01129(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01130");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01130(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01131");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01131(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01132");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01132(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01133");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01133(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01134");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01134(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01135");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01135(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01136");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01136(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01137");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01137(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01138");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01138(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01139");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01139(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01140");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01140(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01141");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01141(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01142");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01142(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01143");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01143(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01144");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01144(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01145");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01145(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01146");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01146(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01147");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01147(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01148");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01148(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01149");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01149(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01150");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01150(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01151");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01151(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01152");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01152(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01153");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01153(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01154");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01154(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01155");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01155(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01156");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01156(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01157");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01157(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01158");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01158(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01159");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01159(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01160");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01160(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01161");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01161(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01162");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01162(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01163");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01163(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01164");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01164(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01165");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01165(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01166");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01166(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01167");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01167(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01168");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01168(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01169");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01169(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01170");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01170(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01171");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01171(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01172");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01172(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01173");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01173(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01174");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01174(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01175");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01175(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01176");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01176(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01177");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01177(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01178");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01178(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01179");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01179(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01180");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01180(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01181");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01181(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01182");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01182(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01183");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01183(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01184");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01184(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01185");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01185(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01186");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01186(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01187");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01187(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01188");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01188(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01189");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01189(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01190");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01190(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01191");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01191(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01192");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01192(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01193");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01193(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01194");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01194(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01195");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01195(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01196");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01196(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01197");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01197(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01198");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01198(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01199");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01199(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01200");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01200(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01201");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01201(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01202");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01202(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01203");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01203(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01204");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01204(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01205");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01205(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01206");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01206(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01207");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01207(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01208");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01208(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01209");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01209(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01210");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01210(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01211");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01211(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01212");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01212(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01213");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01213(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01214");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01214(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01215");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01215(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01216");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01216(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01217");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01217(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01218");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01218(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01219");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01219(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01220");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01220(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01221");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01221(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01222");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01222(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01223");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01223(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01224");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01224(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01225");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01225(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01226");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01226(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01227");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01227(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01228");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01228(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01229");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01229(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01230");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01230(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01231");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01231(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01232");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01232(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01233");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01233(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01234");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01234(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01235");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01235(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01236");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01236(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01237");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01237(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01238");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01238(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01239");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01239(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01240");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01240(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01241");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01241(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01242");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01242(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01243");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01243(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01244");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01244(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01245");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01245(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01246");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01246(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01247");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01247(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01248");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01248(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01249");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01249(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01250");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01250(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01251");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01251(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01252");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01252(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01253");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01253(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01254");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01254(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01255");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01255(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01256");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01256(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01257");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01257(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01258");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01258(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01259");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01259(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01260");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01260(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01261");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01261(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01262");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01262(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01263");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01263(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01264");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01264(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01265");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01265(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01266");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01266(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01267");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01267(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01268");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01268(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01269");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01269(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01270");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01270(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01271");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01271(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01272");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01272(specificationValue);
			}

			if (isnew) {
				VRTechnicalSpec_XCHLocalServiceUtil.addVRTechnicalSpec_XCH(technicalspecification);

			} else {
				VRTechnicalSpec_XCHLocalServiceUtil.updateVRTechnicalSpec_XCH(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec");

		}

		prefixSpecificationCode = "kl_";
		specificationValue = StringPool.BLANK;
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);

			List<VRTechnicalSpec_XCHPart2> lstTechnicalSpec = VRTechnicalSpec_XCHPart2LocalServiceUtil
					.findByDeliverableCode(deliverableCode);
			VRTechnicalSpec_XCHPart2 technicalspecification = new VRTechnicalSpec_XCHPart2Impl();

			boolean isnew = false;

			if (Validator.isNotNull(lstTechnicalSpec) && lstTechnicalSpec.size() > 0) {
				technicalspecification = lstTechnicalSpec.get(0);
			} else {
				isnew = true;
			}

			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01273");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01273(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01274");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01274(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01275");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01275(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01276");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01276(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01277");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01277(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01278");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01278(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01279");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01279(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01280");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01280(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01281");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01281(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01282");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01282(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01283");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01283(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01284");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01284(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01285");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01285(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01286");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01286(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01287");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01287(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01288");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01288(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01289");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01289(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01290");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01290(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01291");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01291(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01292");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01292(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01293");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01293(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01294");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01294(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01295");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01295(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01296");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01296(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01297");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01297(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01298");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01298(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01299");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01299(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01300");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01300(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01301");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01301(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01302");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01302(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01303");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01303(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01304");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01304(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01305");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01305(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01306");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01306(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01307");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01307(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01308");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01308(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01309");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01309(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01310");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01310(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01311");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01311(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01312");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01312(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01313");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01313(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01314");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01314(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01315");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01315(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01316");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01316(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01317");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01317(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01318");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01318(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01319");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01319(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01320");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01320(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01321");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01321(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01322");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01322(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01323");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01323(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01324");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01324(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01325");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01325(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01326");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01326(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01327");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01327(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01328");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01328(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01329");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01329(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01330");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01330(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01331");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01331(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01332");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01332(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01333");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01333(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01334");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01334(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01335");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01335(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01336");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01336(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01337");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01337(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01338");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01338(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01339");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01339(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01340");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01340(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01341");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01341(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01342");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01342(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01343");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01343(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01344");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01344(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01345");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01345(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01346");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01346(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01347");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01347(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01348");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01348(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01349");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01349(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01350");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01350(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01351");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01351(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01352");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01352(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01353");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01353(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01354");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01354(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01355");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01355(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01356");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01356(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01357");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01357(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01358");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01358(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01359");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01359(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01360");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01360(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01361");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01361(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01362");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01362(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01363");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01363(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01364");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01364(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01365");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01365(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01366");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01366(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01367");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01367(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01368");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01368(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01369");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01369(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01370");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01370(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01371");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01371(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01372");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01372(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01373");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01373(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01374");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01374(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01375");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01375(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01376");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01376(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01377");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01377(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01378");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01378(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01379");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01379(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01380");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01380(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01381");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01381(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01382");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01382(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01383");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01383(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01384");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01384(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01385");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01385(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01386");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01386(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01387");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01387(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01388");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01388(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01389");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01389(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01390");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01390(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01391");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01391(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01392");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01392(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01393");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01393(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01394");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01394(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01395");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01395(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01396");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01396(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01397");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01397(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01398");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01398(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01399");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01399(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01400");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01400(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01401");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01401(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01402");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01402(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01403");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01403(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01404");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01404(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01405");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01405(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01406");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01406(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01407");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01407(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01408");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01408(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01409");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01409(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01410");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01410(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01411");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01411(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01412");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01412(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01413");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01413(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01414");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01414(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01415");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01415(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01416");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01416(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01417");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01417(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01418");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01418(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01419");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01419(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01420");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01420(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01421");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01421(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01422");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01422(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01423");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01423(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01424");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01424(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01425");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01425(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01426");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01426(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01427");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01427(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01428");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01428(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01429");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01429(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01430");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01430(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01431");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01431(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01432");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01432(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01433");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01433(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01434");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01434(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01435");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01435(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01436");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01436(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01437");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01437(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01438");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01438(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01439");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01439(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01440");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01440(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01441");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01441(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01442");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01442(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01443");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01443(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01444");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01444(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "XCH01445");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setXCH01445(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH001");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH001(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH002");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH002(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH003");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH003(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH004");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH004(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH005");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH005(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH006");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH006(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH012");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH012(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH013");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH013(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH014");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH014(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH015");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH015(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH016");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH016(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH017");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH017(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH018");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH018(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH019");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH019(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH020");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH020(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH021");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH021(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH022");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH022(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH023");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH023(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH026");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH026(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH027");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH027(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH028");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH028(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH033");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH033(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH034");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH034(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH037");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH037(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH038");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH038(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH039");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH039(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH040");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH040(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH041");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH041(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH042");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH042(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH043");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH043(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH044");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH044(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH045");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH045(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH046");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH046(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH047");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH047(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH053");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH053(specificationValue);
			}
			specificationValue = objChungChi.getString(prefixSpecificationCode + "BBCNCLKLXCH054");
			if (Validator.isNotNull(specificationValue)) {
				technicalspecification.setBBCNCLKLXCH054(specificationValue);
			}

			if (!isnew) {
				VRTechnicalSpec_XCHPart2LocalServiceUtil.updateVRTechnicalSpec_XCHPart2(technicalspecification);

			}
		} catch (JSONException e) {
			_log.error("**ERROR** CANNOT CREATE/UPDATE updateVRTechnicalSpec  VRTechnicalSpec_XCHPart2");

		}

	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrVehicleSpecificationFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start,
				end);
	}

	public long counData(String sql) throws SystemException {

		return vrVehicleSpecificationFinder.countData(sql);
	}

	public JSONArray adminProcessData(JSONArray arrayData, long dossierId, long vehicleTypeCertificateId) {
		JSONArray array = JSONFactoryUtil.createJSONArray();
		vrVehicleSpecificationPersistence.removeBydossierId(dossierId);

		Date now = new Date();

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);

			VRVehicleSpecification object = null;

			long id = counterLocalService.increment(VRVehicleSpecification.class.getName());
			object = vrVehicleSpecificationPersistence.create(id);

			object.setSyncDate(now);

			// Add other fields
			// TODO
			object.setVehicleCertificateId(vehicleTypeCertificateId);
			object.setDossierId(objectData.getLong("dossierId"));
			object.setDossierNo(objectData.getString("dossierNo"));
			object.setDossierIdCTN(objectData.getString("dossierIdCTN"));
			object.setSpecificationCode(objectData.getString("specificationCode"));
			object.setSpecificationName(objectData.getString("specificationName"));
			object.setSpecificationValue(objectData.getString("specificationValue"));
			object.setSpecificationValueDescription(objectData.getString("specificationValueDescription"));
			// TODO
			object.setSequenceNo(objectData.getLong("sequenceNo"));
			object.setSpecificationBasicUnit(objectData.getString("specificationBasicUnit"));
			object.setSpecificationStandard(objectData.getString("specificationStandard"));
			object.setSpecificationGroup(objectData.getString("specificationGroup"));
			object.setSpecificationDataCollectionID(objectData.getString("specificationDataCollectionID"));
			object.setSpecificationResult(objectData.getString("specificationResult"));
			object.setModifyDate(now);
			object.setSyncDate(now);

			object = vrVehicleSpecificationPersistence.update(object);
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(object,
						VRVehicleSpecificationModelImpl.class, StringPool.BLANK);
				array.put(obj);
			} catch (JSONException e) {
			}
		}
		return array;
	}

	private Log _log = LogFactoryUtil.getLog(VRVehicleSpecificationLocalServiceImpl.class);
}