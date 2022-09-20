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
import com.fds.vr.business.model.VRCOPProdEquipment;
import com.fds.vr.business.model.impl.VRCOPProdEquipmentImpl;
import com.fds.vr.business.model.impl.VRCOPProdEquipmentModelImpl;
import com.fds.vr.business.service.base.VRCOPProdEquipmentLocalServiceBaseImpl;
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
 * The implementation of the vrcop prod equipment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRCOPProdEquipmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRCOPProdEquipmentLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRCOPProdEquipmentLocalServiceUtil
 */
@ProviderType
public class VRCOPProdEquipmentLocalServiceImpl extends VRCOPProdEquipmentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRCOPProdEquipmentLocalServiceUtil} to access the
	 * vrcop prod equipment local service.
	 */
	public List<VRCOPProdEquipment> findBycopReportRepositoryID_MtCore(long mtCore, long copReportRepositoryID,
			int start, int end) {
		return vrcopProdEquipmentPersistence.findBycopReportRepositoryID(mtCore, copReportRepositoryID, start, end);
	}

	public List<VRCOPProdEquipment> findBycopReportNo_MtCore(long mtCore, String copReportNo, int start, int end) {
		return vrcopProdEquipmentPersistence.findBycopReportNo(mtCore, copReportNo, start, end);
	}

	public VRCOPProdEquipment updateCOPProdEquipment(Map<String, String> mapValues, int mtCore) {

		Date now = new Date();

		long vrCOPProdEquipmentId = counterLocalService.increment(VRCOPProdEquipment.class.getName());

		VRCOPProdEquipment object = vrcopProdEquipmentPersistence.create(vrCOPProdEquipmentId);

		/// Add audit fields
		object.setSyncDate(now);
		object.setModifyDate(now);

		// Add other fields
		object.setMtCore(mtCore);
		object.setCopReportRepositoryID(Long.valueOf(mapValues.get("copReportRepositoryId")));
		object.setCopReportNo(mapValues.get("copReportNo"));
		object.setSequenceNo(Long.valueOf(mapValues.get("sequenceNo")));
		object.setEquipmentCode(mapValues.get("equipmentCode"));
		object.setEquipmentName(mapValues.get("equipmentName"));
		object.setEquipmentType(mapValues.get("equipmentType"));
		object.setTrademark(mapValues.get("trademark"));
		object.setTrademarkName(mapValues.get("trademarkName"));
		object.setCommercialName(mapValues.get("commercialName"));
		object.setModelCode(mapValues.get("modelCode"));
		object.setDesignSymbolNo(mapValues.get("designSymbolNo"));
		object.setProductionCountryCode(mapValues.get("productionCountryCode"));
		object.setEquipmentStatus(mapValues.get("equipmentStatus"));
		object.setNotes(mapValues.get("notes"));

		return vrcopProdEquipmentPersistence.update(object);
	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrcopProdEquipmentFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrcopProdEquipmentFinder.countData(sql);
	}

	public JSONArray getByCOPReportNo(long mtCore, String COPReportNo) throws SystemException, PortalException {

		JSONArray result = JSONFactoryUtil.createJSONArray();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		List<VRCOPProdEquipment> dataList = findBycopReportNo_MtCore(mtCore, COPReportNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS);

		for (VRCOPProdEquipment data : dataList) {

			jsonObject = JSONFactoryUtil.createJSONObject();

			jsonObject = ActionUtil.object2Json(data, VRCOPProdEquipmentImpl.class, StringPool.BLANK);

			if (Validator.isNotNull(jsonObject)) {
				result.put(jsonObject);
			}
		}
		return result;
	}

	public JSONArray adminProcessData(JSONArray arrayData, long mtCore, long vrcopReportRepositoryId, long dossierId,
			String dossierIdCTN, String dossierNo) {

		JSONArray array = JSONFactoryUtil.createJSONArray();

		vrcopProdEquipmentPersistence.removeBycopDossierId(dossierId);

		Date now = new Date();

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);

			VRCOPProdEquipment object = null;

			long id = counterLocalService.increment(VRCOPProdEquipment.class.getName());

			object = vrcopProdEquipmentPersistence.create(id);

			object.setModifyDate(now);
			object.setMtCore(mtCore);
			object.setSyncDate(now);
			object.setCopReportRepositoryID(vrcopReportRepositoryId);
			object.setCopReportNo(objectData.getString("copReportNo"));
			object.setSequenceNo(objectData.getLong("sequenceNo"));
			object.setEquipmentCode(objectData.getString("equipmentCode"));
			object.setEquipmentName(objectData.getString("equipmentName"));
			object.setEquipmentType(objectData.getString("equipmentType"));
			object.setTrademark(objectData.getString("trademark"));
			object.setTrademarkName(objectData.getString("trademarkName"));
			object.setCommercialName(objectData.getString("commercialName"));
			object.setModelCode(objectData.getString("modelCode"));
			object.setProductionCountryCode(objectData.getString("productionCountryCode"));
			object.setEquipmentStatus(objectData.getString("equipmentStatus"));
			object.setNotes(objectData.getString("notes"));
			object.setDesignSymbolNo(objectData.getString("designSymbolNo"));
			object.setQuantity(objectData.getInt("quantity"));

			object.setDossierId(dossierId);
			object.setDossierIdCTN(dossierIdCTN);
			object.setDossierNo(dossierNo);

			vrcopProdEquipmentPersistence.update(object);
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(object, VRCOPProdEquipmentModelImpl.class,
						StringPool.BLANK);
				array.put(obj);
			} catch (JSONException e) {
			}
		}

		return array;
	}

	private Log _log = LogFactoryUtil.getLog(VRCOPProdEquipmentLocalServiceImpl.class);
}