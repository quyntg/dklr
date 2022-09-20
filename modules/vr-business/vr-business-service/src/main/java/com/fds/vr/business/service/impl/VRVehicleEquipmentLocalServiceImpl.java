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

import com.fds.vr.business.model.VRVehicleEquipment;
import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.service.base.VRVehicleEquipmentLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr vehicle equipment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRVehicleEquipmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRVehicleEquipmentLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRVehicleEquipmentLocalServiceUtil
 */
@ProviderType
public class VRVehicleEquipmentLocalServiceImpl extends VRVehicleEquipmentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRVehicleEquipmentLocalServiceUtil} to access the
	 * vr vehicle equipment local service.
	 */

	public List<VRVehicleEquipment> findByDossierId(long dossierId, int start, int end) {
		return vrVehicleEquipmentPersistence.findBydossierId(dossierId, start, end);
	}

	public List<VRVehicleEquipment> findByVehicleCertificateId(long vehicleCertificateId, int start, int end) {
		return vrVehicleEquipmentPersistence.findByF_vehicleTypeCertificateId(vehicleCertificateId, start, end);
	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrVehicleEquipmentFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrVehicleEquipmentFinder.countData(sql);
	}

	public List<VRVehicleEquipment> adminProcessData(JSONArray arrayData, long dossierId, long mtCore) {
		List<VRVehicleEquipment> vrVehicleEquipments = new ArrayList<VRVehicleEquipment>();
		try {
			vrVehicleEquipmentPersistence.removeBydossierId(dossierId);
		} catch (Exception e) {
			//_log.error(e);
		}
		
		Date now = new Date();

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);

			VRVehicleEquipment object = null;

			long id = counterLocalService.increment(VRVehicleEquipment.class.getName());
			object = vrVehicleEquipmentPersistence.create(id);
			
			VRVehicleTypeCertificate vrVehicleTypeCertificateByDossierId = vrVehicleTypeCertificateLocalService
					.findByDossierId_MtCore(dossierId, mtCore);
			
			int isMandatory = objectData.getInt("isMandatory");
			object.setIsMandatory(isMandatory);
			object.setSyncDate(now);
			if (isMandatory == 1) {
				long certificateRecordId = objectData.getLong("certificateRecordID");
				VRVehicleTypeCertificate vrVehicleTypeCertificate = vrVehicleTypeCertificateLocalService
						.fetchVRVehicleTypeCertificate(certificateRecordId);
				if (vrVehicleTypeCertificate != null) {
					object.setVehicleTypeCertificateId(Validator.isNotNull(vrVehicleTypeCertificateByDossierId) ? vrVehicleTypeCertificateByDossierId.getPrimaryKey() : 0);
					object.setCertificateRecordId(vrVehicleTypeCertificate.getPrimaryKey());
					object.setDossierId(dossierId);
					object.setDossierNo(vrVehicleTypeCertificate.getDossierNo());
					object.setDossierIdCTN(objectData.getString("dossierIdCTN"));
					object.setModifyDate(now);
					object.setIsMandatory(objectData.getInt("isMandatory"));
					object.setSequenceNo(objectData.getLong("sequenceNo"));
					object.setCertificateRecordNo(vrVehicleTypeCertificate.getCertificateRecordNo());
					object.setCertificateRecordDate(vrVehicleTypeCertificate.getCertificateRecordDate());
					object.setCertificateRecordExpireDate(vrVehicleTypeCertificate.getCertificateRecordExpireDate());
					object.setExpiredStatus(Integer.valueOf(vrVehicleTypeCertificate.getExpiredStatus()));
					object.setVehicleClass(vrVehicleTypeCertificate.getVehicleClass());
					object.setEquipmentCode(objectData.getString("equipmentCode"));
					object.setEquipmentName(objectData.getString("equipmentName"));
					object.setCertifiedVehicleType(vrVehicleTypeCertificate.getCertifiedVehicleType());
					object.setCertifiedVehicleTypeDescription(
							vrVehicleTypeCertificate.getCertifiedVehicleTypeDescription());
					object.setCertifiedTrademark(vrVehicleTypeCertificate.getCertifiedTrademark());
					object.setCertifiedTrademarkName(vrVehicleTypeCertificate.getCertifiedTrademarkName());
					object.setCertifiedCommercialName(vrVehicleTypeCertificate.getCertifiedCommercialName());
					object.setCertifiedModelCode(vrVehicleTypeCertificate.getCertifiedModelCode());
					object.setProductionCountry(vrVehicleTypeCertificate.getProductionCountry());
					object.setOriginalCode(objectData.getString("originalCode"));
					object.setOriginalName(objectData.getString("originalName"));
					object.setProductionName(vrVehicleTypeCertificate.getProductionPlantName());
					object.setProductionAddress(vrVehicleTypeCertificate.getProductionPlantAddress());
					object.setManufacturerName(vrVehicleTypeCertificate.getManufacturerName());
					object.setManufacturerAddress(vrVehicleTypeCertificate.getManufacturerAddress());
					object.setSafetytestReportNo(vrVehicleTypeCertificate.getSafetyTestReportNo());
					object.setSafetytestReportDate(vrVehicleTypeCertificate.getSafetyTestReportDate());
					object.setEmissionTestReportNo(vrVehicleTypeCertificate.getEmissionTestReportNo());
					object.setEmissionTestReportDate(vrVehicleTypeCertificate.getEmissionTestReportDate());
					object.setCommonSafetyStandard(vrVehicleTypeCertificate.getCommonSafetyStandard());
					object.setCommonSafetyDescription(vrVehicleTypeCertificate.getCommonSafetyDescription());
					object.setEmissionStandard(vrVehicleTypeCertificate.getEmissionStandard());
					object.setEmissionDescription(vrVehicleTypeCertificate.getEmissionDescription());
					object.setOthertestReportNo(vrVehicleTypeCertificate.getOtherTestReportNo());
					object.setOthertestReportDate(vrVehicleTypeCertificate.getOtherTestReportDate());
					object.setCopReportNo(vrVehicleTypeCertificate.getCopReportNo());
					object.setCopReportDate(vrVehicleTypeCertificate.getCopReportDate());
					object.setCopReportExpireDate(vrVehicleTypeCertificate.getCopReportExpireDate());
				}
			} else {
				object.setVehicleTypeCertificateId(Validator.isNotNull(vrVehicleTypeCertificateByDossierId) ? vrVehicleTypeCertificateByDossierId.getPrimaryKey() : 0);
				object.setCertificateRecordId(objectData.getLong("certificateRecordId"));
				object.setDossierId(dossierId);
				object.setDossierNo(objectData.getString("dossierNo"));
				object.setDossierIdCTN(objectData.getString("dossierIdCTN"));
				object.setModifyDate(now);
				object.setDossierIdCTN(objectData.getString("dossierIdCTN"));
				object.setSequenceNo(objectData.getLong("sequenceNo"));
				object.setCertificateRecordNo(objectData.getString("certificateRecordNo"));
				object.setCertificateRecordDate(parseStringToDate(objectData.getString("certificateRecordDate")));
				object.setCertificateRecordExpireDate(
						parseStringToDate(objectData.getString("certificateRecordExpireDate")));
				object.setExpiredStatus(objectData.getInt("expiredStatus"));
				object.setVehicleClass(objectData.getString("vehicleClass"));
				object.setEquipmentCode(objectData.getString("equipmentCode"));
				object.setEquipmentName(objectData.getString("equipmentName"));
				object.setCertifiedVehicleType(objectData.getString("certifiedVehicleType"));
				object.setCertifiedVehicleTypeDescription(objectData.getString("certifiedVehicleTypeDescription"));
				object.setCertifiedTrademark(objectData.getString("certifiedTrademark"));
				object.setCertifiedTrademarkName(objectData.getString("certifiedTrademarkName"));
				object.setCertifiedCommercialName(objectData.getString("certifiedCommercialName"));
				object.setCertifiedModelCode(objectData.getString("certifiedModelCode"));
				object.setProductionCountry(objectData.getString("productionCountry"));
				object.setOriginalCode(objectData.getString("originalCode"));
				object.setOriginalName(objectData.getString("originalName"));
				object.setProductionName(objectData.getString("productionName"));
				object.setProductionAddress(objectData.getString("productionAddress"));
				object.setManufacturerName(objectData.getString("manufacturerName"));
				object.setManufacturerAddress(objectData.getString("manufacturerAddress"));
				object.setSafetytestReportNo(objectData.getString("safetytestReportNo"));
				object.setSafetytestReportDate(parseStringToDate(objectData.getString("safetytestReportDate")));
				object.setEmissionTestReportNo(objectData.getString("emissionTestReportNo"));
				object.setEmissionTestReportDate(parseStringToDate(objectData.getString("emissionTestReportDate")));
				object.setCommonSafetyStandard(objectData.getString("commonSafetyStandard"));
				object.setCommonSafetyDescription(objectData.getString("commonSafetyDescription"));
				object.setEmissionStandard(objectData.getString("emissionStandard"));
				object.setEmissionDescription(objectData.getString("emissionDescription"));
				object.setOthertestReportNo(objectData.getString("otherTestReportNo"));
				object.setOthertestReportDate(parseStringToDate(objectData.getString("otherTestReportDate")));
				object.setCopReportNo(objectData.getString("copReportNo"));
				object.setCopReportDate(parseStringToDate(objectData.getString("copReportDate")));
				object.setCopReportExpireDate(parseStringToDate(objectData.getString("copReportExpireDate")));
			}

			object = vrVehicleEquipmentPersistence.update(object);

			vrVehicleEquipments.add(object);
		}

		return vrVehicleEquipments;
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

	private static final Log _log = LogFactoryUtil.getLog(VRVehicleEquipmentLocalServiceImpl.class);
}