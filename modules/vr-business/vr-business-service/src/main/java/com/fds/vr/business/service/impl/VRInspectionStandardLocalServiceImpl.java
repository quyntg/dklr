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

import com.fds.vr.business.model.VRDossier;
import com.fds.vr.business.model.VRDossierFile;
import com.fds.vr.business.model.VRInspectionStandard;
import com.fds.vr.business.model.VRRegistration;
import com.fds.vr.business.model.impl.VRInspectionStandardModelImpl;
import com.fds.vr.business.service.base.VRInspectionStandardLocalServiceBaseImpl;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr inspection standard local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRInspectionStandardLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRInspectionStandardLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRInspectionStandardLocalServiceUtil
 */
@ProviderType
public class VRInspectionStandardLocalServiceImpl extends VRInspectionStandardLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRInspectionStandardLocalServiceUtil} to access
	 * the vr inspection standard local service.
	 */

	public List<VRInspectionStandard> findByDossierId(long dossierId, int start, int end) {
		return vrInspectionStandardPersistence.findBydossierId(dossierId, start, end);
	}

	public VRInspectionStandard updateInspectionStandard(LinkedHashMap<String, String> mapValues,
			long vrVehicleCertificateId, Date modifiedDate, VRRegistration registration, VRDossierFile dossierFile) {

		Date now = new Date();

		long vrInspectionStandardId = counterLocalService.increment(VRInspectionStandard.class.getName());

		VRInspectionStandard object = vrInspectionStandardPersistence.create(vrInspectionStandardId);

		/// Add audit fields
		object.setSyncDate(now);
		object.setModifyDate(modifiedDate);

		// Add other fields
		object.setVehicleCertificateId(vrVehicleCertificateId);
		// TODO

		return vrInspectionStandardPersistence.update(object);
	}

	public List<VRInspectionStandard> findByvehicleCertificateId(long vehicleCertificateId, long markupstatus)
			throws PortalException, SystemException {
		try {
			return vrInspectionStandardPersistence.findByvehicleCertificateId(vehicleCertificateId, markupstatus);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRInspectionStandard>();

	}

	public List<VRInspectionStandard> findByVehicleCertificateId(long vehicleCertificateId, int start, int end) {
		return vrInspectionStandardPersistence.findByF_vehicleCertificateId(vehicleCertificateId, start, end);
	}

	public List<VRInspectionStandard> findByDeliverableCode(String deliverableCode)
			throws PortalException, SystemException {
		try {
			return vrInspectionStandardPersistence.findByDeliverableCode(deliverableCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRInspectionStandard>();

	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrInspectionStandardFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrInspectionStandardFinder.countData(sql);
	}

	public JSONArray adminProcessData(JSONArray arrayData, long dossierId, long vehicleTypeCertificateId) {
		JSONArray array = JSONFactoryUtil.createJSONArray();
		vrInspectionStandardPersistence.removeBydossierId(dossierId);

		VRDossier dossier = vrDossierPersistence.fetchByPrimaryKey(dossierId);
		Date now = new Date();
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);

			VRInspectionStandard object = null;
			long id = counterLocalService.increment(VRInspectionStandard.class.getName());
			object = vrInspectionStandardPersistence.create(id);
//				List<DictItem> dictItems = DictItemLocalServiceUtil.findByF_dictCollectionId(objectData.getLong("dictCollectionId"));
//				Date circularDate = null;
//				if (dictItems != null && !dictItems.isEmpty()) {
//					dictItems.parallelStream().forEach(dictItem -> {
//						if (dictItem.getItemName().equalsIgnoreCase(objectData.getString("circularNo"))) {
//							
//							break;
//						}
//					});
//				}

			object.setVehicleCertificateId(vehicleTypeCertificateId);
			object.setDeliverableCode(objectData.getString("deliverableCode"));
			object.setSequenceNo(objectData.getLong("sequenceNo"));
			object.setCirculardate(parseStringToDate(objectData.getString("circularDate")));
			object.setCircularno(objectData.getString("circularNo"));
			object.setMarkupstatus(objectData.getLong("markupStatus"));
			object.setModule(objectData.getString("module"));

			object.setDossierId(dossier.getDossierId());
			object.setDossierNo(dossier.getDossierNo());
			object.setDossierIdCTN(objectData.getString("dossierIdCTN"));
			object.setModifyDate(now);
			object.setSyncDate(now);

			object = vrInspectionStandardPersistence.update(object);
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(object, VRInspectionStandardModelImpl.class,
						StringPool.BLANK);
				array.put(obj);
			} catch (JSONException e) {
			}
		}

		return array;
	}

	private final String PATTERN_DATE = "dd-MM-yyyy HH:mm:ss";
	private final String PATTERN_DATE_2 = "dd/MM/yyyy HH:mm:ss";
	private final String PATTERN_DATE_3 = "dd/MM/yyyy";

	private Date parseStringToDate(String strDate) {

		try {
			SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE);
			return df.parse(strDate);
		} catch (ParseException e) {

			try {
				SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE_2);
				return df.parse(strDate);
			} catch (Exception e2) {
				try {
					SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE_3);
					return df.parse(strDate);
				} catch (Exception e3) {

				}
			}

			// _log.error(e);
			return null;
		}

	}

	private Log _log = LogFactoryUtil.getLog(VRInspectionStandardLocalServiceImpl.class);
}