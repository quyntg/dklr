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

import com.fds.vr.business.model.VRProductionClassification;
import com.fds.vr.business.model.impl.VRProductionClassificationImpl;
import com.fds.vr.business.service.base.VRProductionClassificationLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr production classification local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRProductionClassificationLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRProductionClassificationLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRProductionClassificationLocalServiceUtil
 */
@ProviderType
public class VRProductionClassificationLocalServiceImpl extends VRProductionClassificationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRProductionClassificationLocalServiceUtil} to
	 * access the vr production classification local service.
	 */

	public List<VRProductionClassification> findByProductionPlantCode(String productionPlantCode) {
		return vrProductionClassificationPersistence.findByPPC(productionPlantCode);
	}

	public VRProductionClassification updateVRProductionClassification(Map<String, String> mapValues, int mtCore) {

		Date now = new Date();
		VRProductionClassification object = new VRProductionClassificationImpl();

		long productionClassificationId = Long.valueOf(mapValues.get("productionClassificationId"));

		if (productionClassificationId <= 0) {

			productionClassificationId = counterLocalService.increment(VRProductionClassification.class.getName());

			object = vrProductionClassificationPersistence.create(productionClassificationId);
		}

		/// Add audit fields
		object.setSyncDate(now);
		object.setModifyDate(now);

		// Add other fields
		object.setMtCore(mtCore);
		object.setApplicantProfileId(Long.valueOf(mapValues.get("applicantProfileId")));
		object.setApplicantCode(mapValues.get("applicantCode"));
		object.setProductionPlantId(Long.valueOf(mapValues.get("productionPlantId")));
		object.setProductionPlantCode(mapValues.get("productionPlantCode"));
		object.setSequenceNo(Integer.valueOf(mapValues.get("sequenceNo")));
		object.setProductClassificationCode(mapValues.get("productClassificationCode"));
		object.setProductClassificationDescription(mapValues.get("productClassificationDescription"));
		object.setClassificationMode(mapValues.get("classificationMode"));
		object.setRemarks(mapValues.get("remarks"));
		object.setStatus(mapValues.get("status"));
		// object.setSyncDate(ConvertFormatDate.parseStringToDate(mapValues.get("syncDate")));

		object.setProductionPlantCode(mapValues.get("productionPlantCode"));

		return vrProductionClassificationPersistence.update(object);
	}

	public VRProductionClassification createVRProductionClassification(VRProductionClassification object)
			throws SystemException {

		long id = counterLocalService.increment(VRProductionClassification.class.getName());

		object.setId(id);

		Date now = new Date();

		object.setModifyDate(now);

		return vrProductionClassificationPersistence.update(object);
	}

	public VRProductionClassification updateVRProductionClassification(VRProductionClassification object)
			throws SystemException {

		Date now = new Date();

		object.setModifyDate(now);

		return vrProductionClassificationPersistence.update(object);
	}
	
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrProductionClassificationFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrProductionClassificationFinder.countData(sql);
	}
	
	public List<VRProductionClassification> adminProcessData(JSONArray arrayData, String productionPlantCode) {

		List<VRProductionClassification> vrProductionClassifications = new ArrayList<VRProductionClassification>();
		
		try {
			vrProductionClassificationPersistence.removeByPPC(productionPlantCode);
			
			for (int i = 0; i < arrayData.length(); i++) {
				JSONObject objectData = arrayData.getJSONObject(i);
				
				VRProductionClassification object = null;

				long id = counterLocalService.increment(VRProductionClassification.class.getName());

				object = vrProductionClassificationPersistence.create(id);

				object.setModifyDate(new Date());
				object.setMtCore(objectData.getLong("mtCore"));
				if (!"".equals(objectData.getString("syncDate"))) {
					object.setSyncDate(new Date(objectData.getString("syncDate")));
				}
				object.setSequenceNo(objectData.getInt("sequenceNo"));
				object.setClassificationMode(objectData.getString("classificationMode"));
				object.setRemarks(objectData.getString("remarks"));
				object.setStatus(objectData.getString("status"));
				object.setProductClassificationCode(objectData.getString("productClassificationCode"));
				object.setProductClassificationDescription(objectData.getString("productClassificationDescription"));
				object.setApplicantProfileId(objectData.getLong("applicantProfileId"));
				object.setProductionPlantId(objectData.getLong("productionPlantId"));
				object.setProductionPlantCode(productionPlantCode);

				object = vrProductionClassificationPersistence.update(object);
				
				vrProductionClassifications.add(object);
			}
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
		
		return vrProductionClassifications;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(VRProductionClassificationLocalServiceImpl.class);
}