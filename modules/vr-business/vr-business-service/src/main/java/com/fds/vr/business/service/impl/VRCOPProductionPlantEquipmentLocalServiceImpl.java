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
import com.fds.vr.business.model.VRCOPProductionPlantEquipment;
import com.fds.vr.business.model.VRCOPReportRepository;
import com.fds.vr.business.model.impl.VRCOPProductionPlantEquipmentImpl;
import com.fds.vr.business.model.impl.VRCOPProductionPlantEquipmentModelImpl;
import com.fds.vr.business.service.base.VRCOPProductionPlantEquipmentLocalServiceBaseImpl;
import com.fds.vr.service.util.APIDateTimeUtil;
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
 * The implementation of the vrcop production plant equipment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRCOPProductionPlantEquipmentLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRCOPProductionPlantEquipmentLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRCOPProductionPlantEquipmentLocalServiceUtil
 */
@ProviderType
public class VRCOPProductionPlantEquipmentLocalServiceImpl extends VRCOPProductionPlantEquipmentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRCOPProductionPlantEquipmentLocalServiceUtil} to
	 * access the vrcop production plant equipment local service.
	 */
	public List<VRCOPProductionPlantEquipment> findBycopReportRepositoryID_MtCore(long mtCore,
			long copReportRepositoryID, int start, int end) {
		return vrcopProductionPlantEquipmentPersistence.findBycopReportRepositoryID(mtCore, copReportRepositoryID,
				start, end);
	}

	public List<VRCOPProductionPlantEquipment> findByDossierId_MtCore(long mtCore, long dossierId, int start, int end) {
		return vrcopProductionPlantEquipmentPersistence.findByDossierId_MtCore(dossierId, mtCore, start, end);
	}

	public List<VRCOPProductionPlantEquipment> findBycopReportNo_MtCore(long mtCore, String copReportNo, int start,
			int end) {
		return vrcopProductionPlantEquipmentPersistence.findBycopReportNo(mtCore, copReportNo, start, end);
	}

	public VRCOPProductionPlantEquipment updateCOPProductionPlantEquipment(Map<String, String> mapValues, int mtCore) {

		Date now = new Date();

		long vrCOPProductionPlantEquipmentId = counterLocalService
				.increment(VRCOPProductionPlantEquipment.class.getName());

		VRCOPProductionPlantEquipment object = vrcopProductionPlantEquipmentPersistence
				.create(vrCOPProductionPlantEquipmentId);

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
		// object.setDesignSymbolNo(mapValues.get("designSymbolNo"));
		object.setProductionCountryCode(mapValues.get("productionCountryCode"));
		object.setEquipmentStatus(mapValues.get("equipmentStatus"));
		object.setNotes(mapValues.get("notes"));

		return vrcopProductionPlantEquipmentPersistence.update(object);
	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrcopProductionPlantEquipmentFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName,
				start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrcopProductionPlantEquipmentFinder.countData(sql);
	}

	public JSONArray getByCOPReportNo(long mtCore, String COPReportNo) throws SystemException, PortalException {

		JSONArray result = JSONFactoryUtil.createJSONArray();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		List<VRCOPProductionPlantEquipment> dataList = findBycopReportNo_MtCore(mtCore, COPReportNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS);

		for (VRCOPProductionPlantEquipment data : dataList) {

			jsonObject = JSONFactoryUtil.createJSONObject();

			jsonObject = ActionUtil.object2Json(data, VRCOPProductionPlantEquipmentImpl.class, StringPool.BLANK);

			if (Validator.isNotNull(jsonObject)) {
				result.put(jsonObject);
			}
		}
		return result;
	}

	public VRCOPProductionPlantEquipment updateVRCOPProductionPlantEquipment(long vrcopProductionPlantEquipmentId,
			long mtCore, Date syncDate, long vrcopReportRepositoryId, String copReportNo, int sequenceNo,
			String equipmentCode, String equipmentName, String equipmentType, String trademark, String trademarkName,
			String commercialName, String modelCode, String productionCountryCode, String equipmentStatus,
			Date expireDate, String notes, String equipmentSerialNo, String productionYear, String registrationYear,
			long markupXCG, long markupXCGNK, long markupSMRM, long markupXCH, long markupXCN, long markupXMY,
			long markupXDD, int testingResult, String description, String inspectionRecordNumber,
			Date inspectionRecordDate, Date expiredDate, int expiredStatus, String stampTestingNo, long dossierId,
			String dossierIdCTN, String dossierNo, long productionPlantId, String productionPlantCode) {

		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = vrcopProductionPlantEquipmentPersistence
				.fetchByPrimaryKey(vrcopProductionPlantEquipmentId);

		if (vrcopProductionPlantEquipment == null) {
			vrcopProductionPlantEquipmentId = counterLocalService
					.increment(VRCOPProductionPlantEquipment.class.getName());

			vrcopProductionPlantEquipment = vrcopProductionPlantEquipmentPersistence
					.create(vrcopProductionPlantEquipmentId);
		}

		Date now = new Date();
		vrcopProductionPlantEquipment.setModifyDate(now);
		vrcopProductionPlantEquipment.setMtCore(mtCore);
		vrcopProductionPlantEquipment.setDossierId(dossierId);
		vrcopProductionPlantEquipment.setCopReportRepositoryID(vrcopReportRepositoryId);
		if (syncDate != null) {
			vrcopProductionPlantEquipment.setSyncDate(syncDate);
		}
		if (copReportNo != null) {
			vrcopProductionPlantEquipment.setCopReportNo(copReportNo);
		}
		vrcopProductionPlantEquipment.setSequenceNo(sequenceNo);
		if (equipmentCode != null) {
			vrcopProductionPlantEquipment.setEquipmentCode(equipmentCode);
		}
		if (equipmentName != null) {
			vrcopProductionPlantEquipment.setEquipmentName(equipmentName);
		}
		if (equipmentType != null) {
			vrcopProductionPlantEquipment.setEquipmentType(equipmentType);
		}
		if (trademark != null) {
			vrcopProductionPlantEquipment.setTrademark(trademark);
		}
		if (trademarkName != null) {
			vrcopProductionPlantEquipment.setTrademarkName(trademarkName);
		}
		if (commercialName != null) {
			vrcopProductionPlantEquipment.setCommercialName(commercialName);
		}
		if (modelCode != null) {
			vrcopProductionPlantEquipment.setModelCode(modelCode);
		}
		if (productionCountryCode != null) {
			vrcopProductionPlantEquipment.setProductionCountryCode(productionCountryCode);
		}
		if (equipmentStatus != null) {
			vrcopProductionPlantEquipment.setEquipmentStatus(equipmentStatus);
		}
		if (expireDate != null) {
			vrcopProductionPlantEquipment.setSyncDate(expireDate);
		}
		if (notes != null) {
			vrcopProductionPlantEquipment.setNotes(notes);
		}
		if (equipmentSerialNo != null) {
			vrcopProductionPlantEquipment.setEquipmentSerialNo(equipmentSerialNo);
		}
		if (productionYear != null) {
			vrcopProductionPlantEquipment.setProductionYear(productionYear);
		}
		if (registrationYear != null) {
			vrcopProductionPlantEquipment.setRegistrationYear(registrationYear);
		}
		if (markupXCG >= 0) {
			vrcopProductionPlantEquipment.setMarkupXCG(markupXCG);
		}
		if (markupXCGNK >= 0) {
			vrcopProductionPlantEquipment.setMarkupXCGNK(markupXCGNK);
		}
		if (markupSMRM >= 0) {
			vrcopProductionPlantEquipment.setMarkupSMRM(markupSMRM);
		}
		if (markupXCH >= 0) {
			vrcopProductionPlantEquipment.setMarkupXCH(markupXCH);
		}
		if (markupXCN >= 0) {
			vrcopProductionPlantEquipment.setMarkupXCN(markupXCN);
		}
		if (markupXMY >= 0) {
			vrcopProductionPlantEquipment.setMarkupXMY(markupXMY);
		}
		if (markupXDD >= 0) {
			vrcopProductionPlantEquipment.setMarkupXDD(markupXDD);
		}
		if (testingResult >= 0) {
			vrcopProductionPlantEquipment.setTestingResult(testingResult);
		}
		if (description != null) {
			vrcopProductionPlantEquipment.setDescription(description);
		}
		if (inspectionRecordNumber != null) {
			vrcopProductionPlantEquipment.setInspectionRecordNumber(inspectionRecordNumber);
		}
		if (inspectionRecordDate != null) {
			vrcopProductionPlantEquipment.setInspectionRecordDate(inspectionRecordDate);
		}
		if (expiredDate != null) {
			vrcopProductionPlantEquipment.setExpiredDate(expiredDate);
		}
		if (expiredStatus >= 0) {
			vrcopProductionPlantEquipment.setExpiredStatus(expiredStatus);
		}
		if (stampTestingNo != null) {
			vrcopProductionPlantEquipment.setStampTestingNo(stampTestingNo);
		}
		if (dossierIdCTN != null) {
			vrcopProductionPlantEquipment.setDossierIdCTN(dossierIdCTN);
		}
		if (dossierNo != null) {
			vrcopProductionPlantEquipment.setDossierNo(dossierNo);
		}
		if (productionPlantId > 0) {
			vrcopProductionPlantEquipment.setProductionPlantId(productionPlantId);
		}
		if (productionPlantCode != null) {
			vrcopProductionPlantEquipment.setProductionPlantCode(productionPlantCode);
		}

		return vrcopProductionPlantEquipmentPersistence.update(vrcopProductionPlantEquipment);
	}

	public JSONArray adminProcessData(JSONArray arrayData, long mtCore, long vrcopReportRepositoryId, long dossierId,
			String dossierIdCTN, String dossierNo) {

		JSONArray array = JSONFactoryUtil.createJSONArray();

		VRCOPReportRepository vrcopReportRepository = vrcopReportRepositoryPersistence
				.fetchByPrimaryKey(vrcopReportRepositoryId);

		Date now = new Date();

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);

			VRCOPProductionPlantEquipment object = vrcopProductionPlantEquipmentLocalService
					.updateVRCOPProductionPlantEquipment(objectData.getLong("vrcopProductionPlantEquipmentId"), mtCore,
							now, vrcopReportRepositoryId, objectData.getString("copReportNo"), i + 1,
							objectData.getString("equipmentCode"), objectData.getString("equipmentName"),
							objectData.getString("equipmentType"), objectData.getString("trademark"),
							objectData.getString("trademarkName"), objectData.getString("commercialName"),
							objectData.getString("modelCode"), objectData.getString("productionCountryCode"),
							objectData.getString("equipmentStatus"),
							APIDateTimeUtil.parseStringToDate(objectData.getString("expireDate")),
							objectData.getString("notes"), objectData.getString("equipmentSerialNo"),
							objectData.getString("productionYear"), objectData.getString("registrationYear"),
							objectData.getLong("markupXCG"), objectData.getLong("markupXCGNK"),
							objectData.getLong("markupSMRM"), objectData.getLong("markupXCH"),
							objectData.getLong("markupXCN"), objectData.getLong("markupXMY"),
							objectData.getLong("markupXDD"), objectData.getInt("testingResult"),
							objectData.getString("description"), objectData.getString("inspectionRecordNumber"),
							APIDateTimeUtil.parseStringToDate(objectData.getString("inspectionRecordDate")),
							APIDateTimeUtil.parseStringToDate(objectData.getString("expiredDate")),
							objectData.getInt("expiredStatus"), objectData.getString("stampTestingNo"), dossierId,
							dossierIdCTN, dossierNo, vrcopReportRepository.getProductionPlantId(),
							vrcopReportRepository.getProductionPlantCode());
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(object,
						VRCOPProductionPlantEquipmentModelImpl.class, StringPool.BLANK);
				array.put(obj);
			} catch (JSONException e) {
			}
		}

		return array;
	}

	private Log _log = LogFactoryUtil.getLog(VRCOPProductionPlantEquipmentLocalServiceImpl.class);
}