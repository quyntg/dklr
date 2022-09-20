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

import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRCOPProductType;
import com.fds.vr.business.model.impl.VRCOPProductTypeImpl;
import com.fds.vr.business.model.impl.VRCOPProductTypeModelImpl;
import com.fds.vr.business.service.base.VRCOPProductTypeLocalServiceBaseImpl;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;
import java.util.Map;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vrcop product type local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRCOPProductTypeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRCOPProductTypeLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRCOPProductTypeLocalServiceUtil
 */
@ProviderType
public class VRCOPProductTypeLocalServiceImpl extends VRCOPProductTypeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRCOPProductTypeLocalServiceUtil} to access the
	 * vrcop product type local service.
	 */
	public List<VRCOPProductType> findBycopReportRepositoryID_MtCore(long mtCore, long copReportRepositoryID, int start,
			int end) {
		return vrcopProductTypePersistence.findBycopReportRepositoryID(mtCore, copReportRepositoryID, start, end);
	}

	public List<VRCOPProductType> findBycopReportNo_MtCore(long mtCore, String copReportNo, int start, int end) {
		return vrcopProductTypePersistence.findBycopReportNo(mtCore, copReportNo, start, end);
	}

	public VRCOPProductType updateCOPProductType(Map<String, String> mapValues, int mtCore) {

		Date now = new Date();

		long vrCOPProductTypeId = counterLocalService.increment(VRCOPProductType.class.getName());

		VRCOPProductType object = vrcopProductTypePersistence.create(vrCOPProductTypeId);

		/// Add audit fields
		object.setSyncDate(now);
		object.setModifyDate(now);

		// Add other fields
		object.setMtCore(mtCore);
		object.setCopReportRepositoryID(Long.valueOf(mapValues.get("copReportRepositoryId")));
		object.setCopReportNo(mapValues.get("copReportNo"));
		object.setSequenceNo(Long.valueOf(mapValues.get("sequenceNo")));
		object.setVehicleClass(mapValues.get("vehicleClass"));
		object.setVehicleTypeCode(mapValues.get("vehicleTypeCode"));
		object.setVehicleTypeDescription(mapValues.get("vehicleTypeDescription"));
		object.setProductClassificationCode(mapValues.get("productClassificationCode"));
		object.setProductClassificationDescription(mapValues.get("productClassificationDescription"));
		object.setTrademarkName(mapValues.get("trademarkName"));
		object.setCommercialName(mapValues.get("commercialName"));
		object.setModelCode(mapValues.get("modelCode"));
		object.setDesignSymbolNo(mapValues.get("designSymbolNo"));

		return vrcopProductTypePersistence.update(object);
	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrcopProductTypeFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrcopProductTypeFinder.countData(sql);
	}

	public JSONArray getByCOPReportNo(long mtCore, String COPReportNo) throws SystemException, PortalException {

		JSONArray result = JSONFactoryUtil.createJSONArray();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		List<VRCOPProductType> dataList = findBycopReportNo_MtCore(mtCore, COPReportNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS);

		for (VRCOPProductType data : dataList) {

			jsonObject = JSONFactoryUtil.createJSONObject();

			jsonObject = ActionUtil.object2Json(data, VRCOPProductTypeImpl.class, StringPool.BLANK);

			if (Validator.isNotNull(jsonObject)) {
				result.put(jsonObject);
			}
		}
		return result;
	}

	public JSONArray adminProcessData(JSONArray arrayData, long mtCore, long vrcopReportRepositoryId, long dossierId,
			String dossierIdCTN, String dossierNo) {

		JSONArray array = JSONFactoryUtil.createJSONArray();

		vrcopProductTypePersistence.removeBycopDossierId(dossierId);

		Date now = new Date();

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);

			VRCOPProductType object = null;

			long id = counterLocalService.increment(VRCOPProductType.class.getName());

			object = vrcopProductTypePersistence.create(id);

			object.setModifyDate(now);
			object.setMtCore(objectData.getLong("mtCore"));

			object.setCopReportRepositoryID(vrcopReportRepositoryId);
			object.setCopReportNo(objectData.getString("copReportNo"));
			object.setSequenceNo(objectData.getLong("sequenceNo"));
			object.setVehicleClass(objectData.getString("vehicleClass"));
			object.setVehicleTypeCode(objectData.getString("vehicleTypeCode"));
			object.setVehicleTypeDescription(objectData.getString("vehicleTypeDescription"));
			object.setSyncDate(now);
			object.setProductClassificationCode(objectData.getString("productClassificationCode"));
			object.setProductClassificationDescription(objectData.getString("productClassificationDescription"));
			object.setTrademarkName(objectData.getString("trademarkName"));
			object.setCommercialName(objectData.getString("commercialName"));
			object.setModelCode(objectData.getString("modelCode"));
			object.setDesignSymbolNo(objectData.getString("designSymbolNo"));
			object.setRemarks(objectData.getString("remarks"));

			object.setDossierId(dossierId);
			object.setDossierIdCTN(dossierIdCTN);
			object.setDossierNo(dossierNo);

			vrcopProductTypePersistence.update(object);
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(object, VRCOPProductTypeModelImpl.class,
						StringPool.BLANK);
				array.put(obj);
			} catch (JSONException e) {
			}
		}

		return array;
	}

	private Log _log = LogFactoryUtil.getLog(VRCOPProductTypeLocalServiceImpl.class);
}