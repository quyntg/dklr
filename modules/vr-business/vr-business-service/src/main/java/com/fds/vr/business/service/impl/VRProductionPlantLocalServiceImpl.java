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

import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.service.base.VRProductionPlantLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr production plant local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRProductionPlantLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRProductionPlantLocalServiceUtil
 */
@ProviderType
public class VRProductionPlantLocalServiceImpl extends VRProductionPlantLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRProductionPlantLocalServiceUtil} to access the
	 * vr production plant local service.
	 */
	
	public List<VRProductionPlant> findByApplicantId(long applicantProfileId, int start, int end) {
		return vrProductionPlantPersistence.findByapplicantProfileId(applicantProfileId, start, end);
	}

	public VRProductionPlant updateProductionPlant(LinkedHashMap<String, String> mapValues) {

		Date now = new Date();

		long vrProductionPlantId = counterLocalService.increment(VRProductionPlant.class.getName());

		VRProductionPlant object = vrProductionPlantPersistence.create(vrProductionPlantId);

		/// Add audit fields
		object.setSyncDate(now);

		// Add other fields
		object.setMtCore(Long.valueOf(mapValues.get("")));
		object.setMappingMA_CTY(mapValues.get(""));
		object.setMappingTEN_CTY(mapValues.get(""));
		object.setMappingDIA_CHI_CTY(mapValues.get(""));
		object.setMappingMA_XUONG_LR(mapValues.get(""));
		object.setMappingTEN_XUONG_LR(mapValues.get(""));
		object.setMappingDIA_CHI_XUONG_LR(mapValues.get(""));
		object.setMappingNote(mapValues.get(""));
		object.setMappingStatus(mapValues.get(""));

		object.setProductionPlantCode(mapValues.get(""));
		object.setProductionPlantName(mapValues.get(""));
		object.setProductionPlantAddress(mapValues.get(""));
		object.setProductionPlantStateCode(mapValues.get(""));
		object.setProductionPlantStateName(mapValues.get(""));
		object.setProductionPlantProvinceCode(mapValues.get(""));
		object.setProductionPlantProvinceName(mapValues.get(""));
		object.setProductionPlantDistrictCode(mapValues.get(""));
		object.setProductionPlantDistrictName(mapValues.get(""));
		object.setProductionPlantEmail(mapValues.get(""));
		object.setProductionPlantPhone(mapValues.get(""));
		object.setProductionPlantFax(mapValues.get(""));
		object.setProductionPlantRepresentative(mapValues.get(""));
		object.setProductionPlantRepresentativeTitle(mapValues.get(""));
		object.setProductionPlantContactName(mapValues.get(""));
		object.setProductionPlantContactEmail(mapValues.get(""));
		object.setProductionPlantContactPhone(mapValues.get(""));
		object.setProductionPlantType(mapValues.get(""));
		object.setProductionPlantStatus(mapValues.get(""));
		object.setProductionPlantEmployeesNote(mapValues.get(""));
		object.setProductionPlantEquipmentsNote(mapValues.get(""));
		object.setProductionPlantProdEquipmentsNote(mapValues.get(""));
		object.setRegistrationId(Long.valueOf(mapValues.get("")));
		object.setApplicantProfileId(Long.valueOf(mapValues.get("")));
		// object.setLatestCOPReportDate(ConvertFormatDate.parseStringToDate(mapValues.get("")));
		// object.setLatestCOPReportResult(mapValues.get(""));
		// object.setNextCOPReportDate(ConvertFormatDate.parseStringToDate(mapValues.get("")));
		object.setModifyDate(ConvertFormatDate.parseStringToDate(mapValues.get("")));
		object.setSyncDate(ConvertFormatDate.parseStringToDate(mapValues.get("")));

		return vrProductionPlantPersistence.update(object);
	}

	public List<VRProductionPlant> findBymappingStatus(long mtCore, String mappingStatus) {
		return vrProductionPlantPersistence.findBymappingStatus(mtCore, mappingStatus);
	}

	public List<VRProductionPlant> findByRegistrationFormId(long mtCore, long applicantProfileId, long registrationId) {
		return vrProductionPlantPersistence.findByregistrationFormId(mtCore, applicantProfileId, registrationId);
	}

	public List<VRProductionPlant> findByproductionPlantCode(long mtCore, long applicantProfileId,
			String productionPlantCode) {
		return vrProductionPlantPersistence.findByproductionPlantCode(mtCore, applicantProfileId, productionPlantCode);
	}

	public VRProductionPlant findByproductionPlantCode(String productionPlantCode) {
		return vrProductionPlantPersistence.fetchByF_ProductionPlantCode(productionPlantCode);
	}

	public List<VRProductionPlant> findBymappingMA_XUONG_LR(long mtCore, String mappingMA_CTY,
			String mappingMA_XUONG_LR) {
		return vrProductionPlantPersistence.findBymappingMA_XUONG_LR(mtCore, mappingMA_CTY, mappingMA_XUONG_LR);
	}

	public List<VRProductionPlant> findByproductionPlantType(long mtCore, String productionPlantType) {
		return vrProductionPlantPersistence.findByproductionPlantType(mtCore, productionPlantType);
	}

	public List<VRProductionPlant> findByproductionPlantStatus(long mtCore, String productionPlantStatus) {
		return vrProductionPlantPersistence.findByproductionPlantStatus(mtCore, productionPlantStatus);
	}

	public List<VRProductionPlant> findByproductionPlantStatus_PPCode(long mtCore, long applicantProfileId,
			String productionPlantCode, String productionPlantStatus) {
		return vrProductionPlantPersistence.findByproductionPlantStatus_PPCode(mtCore, applicantProfileId,
				productionPlantCode, productionPlantStatus);
	}

	public List<VRProductionPlant> findByproductionPlantStatus_PPName(long mtCore, long applicantProfileId,
			String productionPlantName, String productionPlantStatus) {
		return vrProductionPlantPersistence.findByproductionPlantStatus_PPName(mtCore, applicantProfileId,
				productionPlantName, productionPlantStatus);
	}

	public List<VRProductionPlant> findByproductionPlantStatus_PPAddress(long mtCore, long applicantProfileId,
			String productionPlantAddress, String productionPlantStatus) {
		return vrProductionPlantPersistence.findByproductionPlantStatus_PPAddress(mtCore, applicantProfileId,
				productionPlantAddress, productionPlantStatus);
	}

	public List<VRProductionPlant> findByproductionPlantName_PPAddress(long mtCore, long applicantProfileId,
			String productionPlantName, String productionPlantAddress) {
		return vrProductionPlantPersistence.findByproductionPlantName_PPAddress(mtCore, applicantProfileId,
				productionPlantName, productionPlantAddress);
	}

	public List<VRProductionPlant> findByproductionPlantRep_PPAddress(long mtCore, long applicantProfileId,
			String productionPlantRepresentative, String productionPlantAddress) {
		return vrProductionPlantPersistence.findByproductionPlantRep_PPAddress(mtCore, applicantProfileId,
				productionPlantRepresentative, productionPlantAddress);
	}

	public List<VRProductionPlant> findByproductionPlantName(long mtCore, long applicantProfileId,
			String productionPlantName) {
		return vrProductionPlantPersistence.findByproductionPlantName(mtCore, applicantProfileId, productionPlantName);
	}

	public VRProductionPlant findByF_MT_APP_FORM_ID(long mtCore, long applicantProfileId, long registrationFormId) {
		return vrProductionPlantPersistence.fetchByF_MT_APP_FORM_ID(mtCore, applicantProfileId, registrationFormId);
	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrProductionPlantFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrProductionPlantFinder.countData(sql);
	}

	public VRProductionPlant createVRProductionPlant(VRProductionPlant object) throws SystemException {

		long id = counterLocalService.increment(VRProductionPlant.class.getName());

		object.setId(id);

		Date now = new Date();

		object.setModifyDate(now);

		return vrProductionPlantPersistence.update(object);
	}

	public VRProductionPlant updateVRProductionPlant(VRProductionPlant object) throws SystemException {

		Date now = new Date();

		object.setModifyDate(now);

		return vrProductionPlantPersistence.update(object);
	}

	public VRProductionPlant adminProcessData(JSONObject objectData, long mtCore, long applicantProfileId,
			String productionPlantCode) {
		VRProductionPlant object = null;
		if(productionPlantCode != null && !productionPlantCode.isEmpty()) {
			object = vrProductionPlantPersistence.fetchByF_ProductionPlantCode(productionPlantCode);
		}
		try {
			if (object == null) {
				long id = counterLocalService.increment(VRProductionPlant.class.getName());

				object = vrProductionPlantPersistence.create(id);

				long count = 1;
				List<VRProductionPlant> vrProductionPlants = null;
				if (applicantProfileId > 0) {
					vrProductionPlants = vrProductionPlantPersistence.findByapplicantProfileId(applicantProfileId);
					if (vrProductionPlants != null && !vrProductionPlants.isEmpty()) {
						count = vrProductionPlants.size() + 1;
					}
					productionPlantCode = applicantProfileId + StringPool.UNDERLINE + count;
				}
			}

			Date now = new Date();
			object.setModifyDate(now);
			object.setSyncDate(now);

			object.setApplicantCode(objectData.getString("applicantCode"));
			object.setMtCore(objectData.getLong("mtCore"));
			object.setMappingMA_CTY(objectData.getString("mappingMA_CTY"));
			object.setMappingTEN_CTY(objectData.getString("mappingTEN_CTY"));
			object.setMappingDIA_CHI_CTY(objectData.getString("mappingDIA_CHI_CTY"));
			object.setMappingMA_XUONG_LR(objectData.getString("mappingMA_XUONG_LR"));
			object.setMappingTEN_XUONG_LR(objectData.getString("mappingTEN_XUONG_LR"));
			object.setMappingDIA_CHI_XUONG_LR(objectData.getString("mappingDIA_CHI_XUONG_LR"));
			object.setMappingNote(objectData.getString("mappingNote"));
			object.setMappingStatus(objectData.getString("mappingStatus"));

			object.setProductionPlantCode(productionPlantCode);
			object.setProductionPlantName(objectData.getString("productionPlantName"));
			object.setProductionPlantAddress(objectData.getString("productionPlantAddress"));
			object.setProductionPlantRegion(objectData.getString("productionPlantRegion"));
			object.setProductionPlantWardCode(objectData.getString("productionPlantWardCode"));
			object.setProductionPlantWardName(objectData.getString("productionPlantWardName"));
			object.setProductionPlantStateCode(objectData.getString("productionPlantStateCode"));
			object.setProductionPlantStateName(objectData.getString("productionPlantStateName"));
			object.setProductionPlantProvinceCode(objectData.getString("productionPlantProvinceCode"));
			object.setProductionPlantProvinceName(objectData.getString("productionPlantProvinceName"));
			object.setProductionPlantDistrictCode(objectData.getString("productionPlantDistrictCode"));
			object.setProductionPlantDistrictName(objectData.getString("productionPlantDistrictName"));
			object.setProductionPlantEmail(objectData.getString("productionPlantEmail"));
			object.setProductionPlantPhone(objectData.getString("productionPlantPhone"));
			object.setProductionPlantFax(objectData.getString("productionPlantFax"));
			object.setProductionPlantWebsite(objectData.getString("productionPlantWebsite"));
			object.setProductionPlantRepresentativePhone(objectData.getString("productionPlantRepresentativePhone"));
			object.setProductionPlantRepresentative(objectData.getString("productionPlantRepresentative"));
			object.setProductionPlantRepresentativeTitle(objectData.getString("productionPlantRepresentativeTitle"));
			object.setProductionPlantContactName(objectData.getString("productionPlantContactName"));
			object.setProductionPlantContactEmail(objectData.getString("productionPlantContactEmail"));
			object.setProductionPlantContactPhone(objectData.getString("productionPlantContactPhone"));
			object.setProductionPlantType(objectData.getString("productionPlantType"));
			object.setProductionPlantStatus(objectData.getString("productionPlantStatus"));
			object.setProductionPlantEmployeesNote(objectData.getString("productionPlantEmployeesNote"));
			object.setProductionPlantEquipmentsNote(objectData.getString("productionPlantEquipmentsNote"));
			object.setProductionPlantProdEquipmentsNote(objectData.getString("productionPlantProdEquipmentsNote"));
			object.setRegistrationId(objectData.getLong("registrationId"));
			object.setApplicantProfileId(applicantProfileId);
			object.setSupplierId(objectData.getLong("supplierId"));
			object.setProductionManufacture(objectData.getString("productionManufacture"));
			object.setProductionPlantIdentityNo(objectData.getString("productionPlantIdentityNo"));
			object.setProductionPlantIdentityType(objectData.getString("productionPlantIdentityType"));
			object.setProductionPlantIdentityDescription(objectData.getString("productionPlantIdentityDescription"));
			object.setProductionPlantIdentityFileEntryId(objectData.getLong("productionPlantIdentityFileEntryId"));
			object.setProductionIdentityFileName(objectData.getString("productionIdentityFileName"));
			object.setProductionIdentityFileEntryId(objectData.getLong("productionIdentityFileEntryId"));
			object.setApplicantCode(objectData.getString("applicantCode"));
			object.setSupplierName(objectData.getString("supplierName"));
			object.setSupplierAddress(objectData.getString("supplierAddress"));
			object.setCorporationCode(objectData.getString("corporationCode"));
			object.setCorporationName(objectData.getString("corporationName"));
			object.setCorporationAddress(objectData.getString("corporationAddress"));
			object.setProductionPlantMetadata(objectData.getString("productionPlantMetadata"));

			object = vrProductionPlantPersistence.update(object);

		} catch (Exception e) {
			_log.error(e);
			return null;
		}

		return object;
	}

	private static final Log _log = LogFactoryUtil.getLog(VRProductionPlantLocalServiceImpl.class);

}