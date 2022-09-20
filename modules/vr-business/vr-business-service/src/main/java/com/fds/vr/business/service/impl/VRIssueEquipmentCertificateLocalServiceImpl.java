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
import com.fds.vr.business.service.base.VRIssueEquipmentCertificateLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr issue equipment certificate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRIssueEquipmentCertificateLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRIssueEquipmentCertificateLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRIssueEquipmentCertificateLocalServiceUtil
 */
@ProviderType
public class VRIssueEquipmentCertificateLocalServiceImpl extends VRIssueEquipmentCertificateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRIssueEquipmentCertificateLocalServiceUtil} to
	 * access the vr issue equipment certificate local service.
	 */

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrIssueEquipmentCertificateFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName,
				start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrIssueEquipmentCertificateFinder.countData(sql);
	}

	public List<VRIssueEquipmentCertificate> findByDossierId_MtCore(long dossierId, long mtCore, int start, int end) {
		return vrIssueEquipmentCertificatePersistence.findBydossierID_MtCore(dossierId, mtCore, start, end);
	}

	public List<VRIssueEquipmentCertificate> findByIssueId(long issueId, int start, int end) {
		return vrIssueEquipmentCertificatePersistence.findByissueId(issueId, start, end);
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

	public List<VRIssueEquipmentCertificate> adminProcess(JSONArray arrayData, long issueId, long dossierId,
			long mtCore, long issueVehicleCertificateId) {
		vrIssueEquipmentCertificatePersistence.removeBydossierID_MtCore(dossierId, mtCore);
		List<VRIssueEquipmentCertificate> result = new ArrayList<VRIssueEquipmentCertificate>();
		Date now = new Date();
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);
			long issueEquipmentCertificateId = counterLocalService
					.increment(VRIssueEquipmentCertificate.class.getName());
			VRIssueEquipmentCertificate object = vrIssueEquipmentCertificatePersistence
					.create(issueEquipmentCertificateId);

			object.setMtCore(mtCore);
			object.setDossierId(dossierId);
			object.setIssueId(issueId);
			object.setIssueVehicleCertificateId(issueVehicleCertificateId);
			object.setVehicleCertificateRecordDate(parseStringToDate(objectData.getString("vehicleCertificateRecordDate")));
			object.setVehicleCertificateRecordNo(objectData.getString("vehicleCertificateRecordNo"));
			object.setEquipmentName(objectData.getString("equipmentName"));
			object.setEquipmentType(objectData.getString("equipmentType"));
			object.setEquipmentCertificateType(objectData.getString("equipmentCertificateType"));
			object.setEquipmentDocumentNo(objectData.getString("equipmentDocumentNo"));
			object.setEquipmentCertificateRecordNo(objectData.getString("equipmentCertificateRecordNo"));
			object.setEquipmentCertificateRecordDate(parseStringToDate(objectData.getString("equipmentCertificateRecordDate")));
			object.setEquipmentExamRecordNo(objectData.getString("equipmentExamRecordNo"));
			object.setEquipmentCertificateRecordId(objectData.getInt("EquipmentCertificateRecordId"));
			object.setTotalQuantity(objectData.getInt("TotalQuantity"));
			object.setTotalProductUsed(objectData.getInt("TotalProductUsed"));
			object.setTotalInUse(objectData.getInt("TotalInUse"));
			object.setTotalNotUsed(objectData.getInt("TotalNotUsed"));
			object.setApplicantNo(objectData.getString("applicantNo"));
			object.setApplicantName(objectData.getString("applicantName"));
			object.setApplicantAddress(objectData.getString("applicantAddress"));
			object.setProductionPlantName(objectData.getString("productionPlantName"));
			object.setProductionPlantAddress(objectData.getString("productionPlantAddress"));
			object.setModifyDate(now);
			object.setSyncDate(now);

			object = vrIssueEquipmentCertificatePersistence.update(object);
			if (object != null) {
				result.add(object);
			}
		}

		return result;
	}
}