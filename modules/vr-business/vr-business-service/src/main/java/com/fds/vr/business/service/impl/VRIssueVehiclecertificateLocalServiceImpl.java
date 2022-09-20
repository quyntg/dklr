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

import com.fds.vr.business.model.VRIssueEquipmentCertificate;
import com.fds.vr.business.model.VRIssueVehiclecertificate;
import com.fds.vr.business.model.VRVehicleRecord;
import com.fds.vr.business.model.impl.VRIssueEquipmentCertificateModelImpl;
import com.fds.vr.business.model.impl.VRIssueVehiclecertificateModelImpl;
import com.fds.vr.business.model.impl.VRVehicleRecordModelImpl;
import com.fds.vr.business.service.base.VRIssueVehiclecertificateLocalServiceBaseImpl;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr issue vehiclecertificate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRIssueVehiclecertificateLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRIssueVehiclecertificateLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRIssueVehiclecertificateLocalServiceUtil
 */
@ProviderType
public class VRIssueVehiclecertificateLocalServiceImpl extends VRIssueVehiclecertificateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRIssueVehiclecertificateLocalServiceUtil} to
	 * access the vr issue vehiclecertificate local service.
	 */
	public List<VRIssueVehiclecertificate> findBydossierId(long mtCore, long dossierId)
			throws PortalException, SystemException {
		try {
			return vrIssueVehiclecertificatePersistence.findBydossierId(mtCore, dossierId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRIssueVehiclecertificate>();
	}

	public void deleteBydossierId(long mtCore, long dossierId) {
		vrIssueVehiclecertificatePersistence.removeBydossierId(mtCore, dossierId);
	}

	public List<VRIssueVehiclecertificate> findByIssueId_MtCore(long mtCore, long issueId, int start, int end)
			throws PortalException, SystemException {
		try {
			return vrIssueVehiclecertificatePersistence.findByissueId_MtCore(mtCore, issueId, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRIssueVehiclecertificate>();
	}

	public List<VRIssueVehiclecertificate> findByIssueId(long issueId, int start, int end) {
		return vrIssueVehiclecertificatePersistence.findByissueId(issueId, start, end);
	}

	public List<VRIssueVehiclecertificate> findBycertificateId(long mtCore, long dossierId, long certificateId)
			throws PortalException, SystemException {
		try {
			return vrIssueVehiclecertificatePersistence.findBycertificateId(mtCore, dossierId, certificateId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRIssueVehiclecertificate>();
	}

	public VRIssueVehiclecertificate updateVRIssueVehicleCertificate(Map<String, String> mapValue, int mtCore) {

		long idVRIssueCert = CounterLocalServiceUtil.increment(VRIssueVehiclecertificate.class.getName());
		VRIssueVehiclecertificate object = vrIssueVehiclecertificatePersistence.create(idVRIssueCert);

		// create objVRIssue
		object.setModifyDate(new Date());
		object.setSyncDate(new Date());

		object.setMtCore(mtCore);
		object.setDossierId(GetterUtil.getLong(mapValue.get("dossierId")));
		object.setIssueId(GetterUtil.getLong(mapValue.get("issueId")));
		object.setCertificateId(GetterUtil.getLong(mapValue.get("certificateId")));
		object.setVehiclePrice(GetterUtil.getLong(mapValue.get("vehiclePrice")));
		object.setTotalQuantity(GetterUtil.getLong(mapValue.get("totalQuantity")));
		object.setUnitPrice(GetterUtil.getLong(mapValue.get("unitPrice")));
		object.setCertificateRecordNo(mapValue.get("certificaterecordno"));
		object.setProductionExamReportNo(mapValue.get("productionExamReportNo"));
		object.setTotalProduct(GetterUtil.getInteger(mapValue.get("totalProduct")));

		return vrIssueVehiclecertificatePersistence.update(object);
	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrIssueVehiclecertificateFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start,
				end);
	}

	public long counData(String sql) throws SystemException {

		return vrIssueVehiclecertificateFinder.countData(sql);
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
			return null;
		}
	}

	public JSONObject adminProcess(JSONArray arrayData, long issueId, long dossierId, long mtCore, String issueType)
			throws Exception {
		vrIssueVehiclecertificatePersistence.removeBydossierId(mtCore, dossierId);

		JSONObject result = JSONFactoryUtil.createJSONObject();

		Date now = new Date();
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);
			long issueVehiclecertificateId = counterLocalService.increment(VRIssueVehiclecertificate.class.getName());
			VRIssueVehiclecertificate object = vrIssueVehiclecertificatePersistence.create(issueVehiclecertificateId);

			object.setMtCore(mtCore);
			object.setIssueId(issueId);
			object.setDossierId(dossierId);
			object.setCertificateId(objectData.getLong("certificateId"));
			object.setVehiclePrice(objectData.getLong("vehiclePrice"));
			object.setTotalQuantity(objectData.getLong("totalQuantity"));
			object.setUnitPrice(objectData.getLong("unitPrice"));
			object.setTotalProduct(objectData.getInt("totalProduct"));
			object.setCertificateRecordNo(objectData.getString("certificateRecordNo"));
			object.setCertificateRecordDate(parseStringToDate(objectData.getString("certificateRecordDate")));
			object.setProductionExamReportNo(objectData.getString("productionExamReportNo"));
			object.setModifyDate(now);
			object.setSyncDate(now);

			object = vrIssueVehiclecertificatePersistence.update(object);

			JSONArray vehicleRecords = JSONFactoryUtil.createJSONArray(objectData.getString("vr_VehicleRecord"));
			List<VRVehicleRecord> vrVehicleRecords = vrVehicleRecordLocalService.adminProcess(vehicleRecords, dossierId,
					issueId, mtCore, object.getPrimaryKey(), issueType);

			JSONArray issueEquipmentCertificates = JSONFactoryUtil
					.createJSONArray(objectData.getString("vr_Issue_EquipmentCertificate"));
			List<VRIssueEquipmentCertificate> vrIssueEquipmentCertificates = vrIssueEquipmentCertificateLocalService
					.adminProcess(issueEquipmentCertificates, issueId, dossierId, mtCore, object.getPrimaryKey());

			JSONObject jVRIssueVehiclecertificate = BusinessUtil.object2Json_originColumnName(object,
					VRIssueVehiclecertificateModelImpl.class, StringPool.BLANK);

			JSONArray arrayVRVehicleRecord = JSONFactoryUtil.createJSONArray();
			JSONArray arrayVRIssueEquipmentCertificate = JSONFactoryUtil.createJSONArray();
			for (VRVehicleRecord vrVehicleRecord : vrVehicleRecords) {
				try {
					JSONObject obj = BusinessUtil.object2Json_originColumnName(vrVehicleRecord,
							VRVehicleRecordModelImpl.class, StringPool.BLANK);
					arrayVRVehicleRecord.put(obj);
				} catch (Exception e) {
				}
			}

			for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : vrIssueEquipmentCertificates) {
				try {
					JSONObject obj = BusinessUtil.object2Json_originColumnName(vrIssueEquipmentCertificate,
							VRIssueEquipmentCertificateModelImpl.class, StringPool.BLANK);
					arrayVRIssueEquipmentCertificate.put(obj);
				} catch (Exception e) {
				}
			}

			jVRIssueVehiclecertificate.put("vr_VehicleRecord", arrayVRVehicleRecord);
			jVRIssueVehiclecertificate.put("vr_Issue_EquipmentCertificate", arrayVRIssueEquipmentCertificate);

			result.put("vr_Issue_VehicleCertificate", jVRIssueVehiclecertificate);
		}
		return result;
	}

	private Log _log = LogFactoryUtil.getLog(VRIssueVehiclecertificateLocalServiceImpl.class);

}