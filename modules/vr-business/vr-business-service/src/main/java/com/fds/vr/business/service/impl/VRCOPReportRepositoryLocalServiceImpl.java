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

import com.fds.vr.business.action.VRCOPReportRepositoryAction;
import com.fds.vr.business.action.impl.VRCOPReportRepositoryActionImpl;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.VRCOPProdEquipment;
import com.fds.vr.business.model.VRCOPProductType;
import com.fds.vr.business.model.VRCOPProductionPlantEmployee;
import com.fds.vr.business.model.VRCOPProductionPlantEquipment;
import com.fds.vr.business.model.VRCOPReportAttach;
import com.fds.vr.business.model.VRCOPReportRepository;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.impl.VRCOPReportRepositoryImpl;
import com.fds.vr.business.model.impl.VRCOPReportRepositoryModelImpl;
import com.fds.vr.business.service.base.VRCOPReportRepositoryLocalServiceBaseImpl;
import com.fds.vr.service.util.APIDateTimeUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vrcop report repository local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRCOPReportRepositoryLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRCOPReportRepositoryLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRCOPReportRepositoryLocalServiceUtil
 */
@ProviderType
public class VRCOPReportRepositoryLocalServiceImpl extends VRCOPReportRepositoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRCOPReportRepositoryLocalServiceUtil} to access
	 * the vrcop report repository local service.
	 */

	public VRCOPReportRepository updateVRCOPReportRepository(VRCOPReportRepository vrcopReportRepository,
			Company company) {
		Date now = new Date();

		vrcopReportRepository.setModifyDate(now);
		vrcopReportRepository = vrcopReportRepositoryPersistence.updateImpl(vrcopReportRepository);
		if (vrcopReportRepository != null) {
			VRCOPReportRepositoryAction action = new VRCOPReportRepositoryActionImpl();
			action.indexing(vrcopReportRepository, company);
		}
		return vrcopReportRepository;
	}

	public List<VRCOPReportRepository> findBycopReportStatus(long mtCore, String copReportStatus)
			throws PortalException, SystemException {
		try {
			return vrcopReportRepositoryPersistence.findBycopReportStatus(mtCore, copReportStatus);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPReportRepository>();

	}

	public VRCOPReportRepository findBycopReportNo(long mtCore, String copReportNo)
			throws PortalException, SystemException {
		try {
			return vrcopReportRepositoryPersistence.findBycopReportNo(mtCore, copReportNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;

	}

	public List<VRCOPReportRepository> findByapplicantProfileId(long mtCore, long applicantProfileId)
			throws PortalException, SystemException {
		try {
			return vrcopReportRepositoryPersistence.findByapplicantProfileId(mtCore, applicantProfileId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPReportRepository>();

	}

	public List<VRCOPReportRepository> findByproductionPlantCode(long mtCore, long applicantProfileId,
			String productionPlantCode) throws PortalException, SystemException {
		try {
			return vrcopReportRepositoryPersistence.findByproductionPlantCode(mtCore, applicantProfileId,
					productionPlantCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPReportRepository>();

	}

	public List<VRCOPReportRepository> findByproductionPlantName(long mtCore, long applicantProfileId,
			String productionPlantName, String productionPlantAddress) throws PortalException, SystemException {
		try {
			return vrcopReportRepositoryPersistence.findByproductionPlantName(mtCore, applicantProfileId,
					productionPlantName, productionPlantAddress);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPReportRepository>();

	}

	public VRCOPReportRepository updateCOPReportRepository(Map<String, String> mapValues, int mtCore) {

		Date now = new Date();

		long vrCOPReportRepositoryId = counterLocalService.increment(VRCOPReportRepository.class.getName());

		VRCOPReportRepository object = vrcopReportRepositoryPersistence.create(vrCOPReportRepositoryId);

		/// Add audit fields
		object.setSyncDate(now);
		object.setModifyDate(now);

		// Add other fields
		object.setMtCore(mtCore);
		object.setApplicantProfileId(Long.valueOf(mapValues.get("applicantProfileId")));
		object.setApplicantName(mapValues.get("applicantName"));
		object.setApplicantAddress(mapValues.get("applicantAddress"));
		object.setOverseasManufacturerCode(mapValues.get("overseasManufacturerCode"));
		object.setOverseasManufacturerName(mapValues.get("overseasManufacturerName"));
		object.setOverseasManufacturerAddress(mapValues.get("overseasManufacturerAddress"));
		System.out.println("productionPlantId: " + mapValues.get("productionPlantId"));
		object.setProductionPlantId(Long.valueOf(mapValues.get("productionPlantId")));
		object.setProductionPlantCode(mapValues.get("productionPlantCode"));
		object.setProductionPlantName(mapValues.get("productionPlantName"));
		object.setProductionPlantAddress(mapValues.get("productionPlantAddress"));
		object.setCopReportNo(mapValues.get("copReportNo"));
		object.setCopReportStatus(mapValues.get("copReportStatus"));
		object.setCopReportType(mapValues.get("copReportType"));
		object.setCopReportMetadata(mapValues.get("copReportMetadata"));
		object.setCopReportSignName(mapValues.get("copReportSignName"));
		object.setCopReportSignTitle(mapValues.get("copReportSignTitle"));
		object.setCopReportSignPlace(mapValues.get("copReportSignPlace"));
		object.setCopReportDate(ConvertFormatDate.parseStringToDate(mapValues.get("copReportDate")));
		object.setCopReportApprovedDate(ConvertFormatDate.parseStringToDate(mapValues.get("copReportApprovedDate")));
		object.setCopReportExpiredDate(ConvertFormatDate.parseStringToDate(mapValues.get("copReportExpiredDate")));

		return vrcopReportRepositoryPersistence.update(object);
	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrcopReportRepositoryFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start,
				end);
	}

	public long counData(String sql) throws SystemException {

		return vrcopReportRepositoryFinder.countData(sql);
	}

	public JSONObject getByCOPReportNo(long mtCore, String COPReportNo) throws SystemException, PortalException {

		JSONObject result = JSONFactoryUtil.createJSONObject();

		VRCOPReportRepository vrCOPReportRepository = findBycopReportNo(mtCore, COPReportNo);

		result = ActionUtil.object2Json(vrCOPReportRepository, VRCOPReportRepositoryImpl.class, StringPool.BLANK);

		return result;
	}

	public VRCOPReportRepository findByDossierId_MTCore(long dossierId, long mtCore) {
		return vrcopReportRepositoryPersistence.fetchByDosierId_MtCore(dossierId, mtCore);
	}

	public JSONObject adminProcessData(JSONObject objectData, JSONArray arrayVRCOPProductionPlantEmployee,
			JSONArray arrayVRCOPProductionPlantEquipment, JSONArray arrayVRCOPProdEquipment,
			JSONArray arrayVRCOPProductType, JSONArray arrayVRCOPReportAttach) {
		VRCOPReportRepository object = null;

		object = vrcopReportRepositoryPersistence.fetchByDosierId_MtCore(objectData.getLong("dossierId"),
				objectData.getLong("mtCore"));

		if (object == null) {
			long vrCOPReportRepositoryId = counterLocalService.increment(VRCOPReportRepository.class.getName());

			object = vrcopReportRepositoryPersistence.create(vrCOPReportRepositoryId);
		}

		Date now = new Date();

		object.setModifyDate(now);
		object.setSyncDate(now);

		VRApplicantProfile vrApplicantProfile = vrApplicantProfileLocalService
				.findByApplicantCode(objectData.getString("applicantCode"));

		object.setMtCore(objectData.getLong("mtCore"));
		object.setApplicantProfileId(vrApplicantProfile.getPrimaryKey());
		object.setApplicantCode(vrApplicantProfile.getApplicantCode());
		object.setApplicantName(vrApplicantProfile.getApplicantName());
		object.setApplicantAddress(vrApplicantProfile.getApplicantAddress());
		object.setApplicantRepresentativeTitle(vrApplicantProfile.getApplicantRepresentativeTitle());
		object.setApplicantRepresentative(vrApplicantProfile.getApplicantRepresentative());
		object.setMarkupDomesticsManufacturer(vrApplicantProfile.getMarkupDomesticsManufacturer());
		object.setMarkupImporter(vrApplicantProfile.getMarkupImporter());
		object.setApplicantEmail(vrApplicantProfile.getApplicantEmail());
		object.setApplicantPhone(vrApplicantProfile.getApplicantPhone());
		// object.setApplicantTelNo();
		object.setApplicantFax(vrApplicantProfile.getApplicantFax());
		object.setApplicantContactName(vrApplicantProfile.getApplicantContactName());
		object.setApplicantContactEmail(vrApplicantProfile.getApplicantContactEmail());
		object.setApplicantContactPhone(vrApplicantProfile.getApplicantContactPhone());
		// object.setApplicantContactTelNo();
		object.setApplicantBusinessType(vrApplicantProfile.getApplicantBusinessType());
		object.setMarkupDesigner(vrApplicantProfile.getMarkupDesigner());
		object.setMarkupOverseasManufacturer(vrApplicantProfile.getMarkupOverseasManufacturer());
		object.setMarkupMaintainer(vrApplicantProfile.getMarkupMaintainer());
		// object.setImporterDomesticSite(vrApplicantProfile.getI);

		VRProductionPlant vrProductionPlant = vrProductionPlantPersistence
				.fetchByF_ProductionPlantCode(objectData.getString("productionPlantCode"));
		if (objectData.getString("area").equals("TN")) {
			object.setProductionPlantId(vrProductionPlant.getPrimaryKey());
			object.setProductionPlantCode(vrProductionPlant.getProductionPlantCode());
			object.setProductionPlantName(vrProductionPlant.getProductionPlantName());
			object.setProductionPlantAddress(vrProductionPlant.getProductionPlantAddress());
			object.setProductionPlantEmail(vrProductionPlant.getProductionPlantEmail());
			object.setProductionPlantWebsite(objectData.getString("productionPlantWebsite"));
			object.setProductionPlantRepresentative(vrProductionPlant.getProductionPlantRepresentative());
			object.setProductionPlantRepresentativeTitle(vrProductionPlant.getProductionPlantRepresentativeTitle());
		} else if (objectData.getString("area").equals("NN")) {
			object.setOverseasManufacturerCode(vrProductionPlant.getProductionPlantCode());
			object.setOverseasManufacturerName(vrProductionPlant.getProductionPlantName());
			object.setOverseasManufacturerAddress(vrProductionPlant.getProductionPlantAddress());
			object.setManufacturerRepresentative(vrProductionPlant.getProductionPlantRepresentative());
			object.setManufacturerRepresentativeTitle(vrProductionPlant.getProductionPlantRepresentativeTitle());
			object.setManufacturerEmail(vrProductionPlant.getProductionPlantEmail());
			object.setManufacturerPhone(vrProductionPlant.getProductionPlantPhone());
			object.setManufacturerFax(vrProductionPlant.getProductionPlantFax());
		}

		object.setCopReportNo(objectData.getString("copReportNo"));
		object.setCopReportStatus(objectData.getString("copReportStatus"));
		object.setCopReportType(objectData.getString("copReportType"));
		object.setCopReportMetadata(objectData.getString("copReportMetadata"));
		// object.setCopReportSignName(objectData.getString("copReportSignName"));
		// object.setCopReportSignTitle(objectData.getString("copReportSignTitle"));
		// object.setCopReportSignPlace(objectData.getString("copReportSignPlace"));
		object.setCopReportDate(APIDateTimeUtil.parseStringToDate(objectData.getString("copReportDate")));
		object.setCopReportApprovedDate(
				APIDateTimeUtil.parseStringToDate(objectData.getString("copReportApprovedDate")));
		object.setCopReportExpiredDate(APIDateTimeUtil.parseStringToDate(objectData.getString("copReportExpiredDate")));
		object.setInspectionRecordDate(APIDateTimeUtil.parseStringToDate(objectData.getString("inspectionRecordDate")));
		object.setInspectionDateFrom(APIDateTimeUtil.parseStringToDate(objectData.getString("inspectionDateFrom")));
		object.setInspectionDateTo(APIDateTimeUtil.parseStringToDate(objectData.getString("inspectionDateTo")));
		object.setCopReportRefDate(APIDateTimeUtil.parseStringToDate(objectData.getString("copReportRefDate")));
		object.setCopReportPreviousDate(
				APIDateTimeUtil.parseStringToDate(objectData.getString("copReportPreviousDate")));

		object.setCOPFileEntryId(objectData.getLong("COPFileEntryId"));
		object.setCopClassification(objectData.getString("copClassification"));
		object.setProductClassificationDescription(objectData.getString("productClassificationDescription"));
		object.setTotalPointA(objectData.getInt("totalPointA"));
		object.setTotalPointB(objectData.getInt("totalPointB"));
		object.setTotalPointC(objectData.getInt("totalPointC"));
		object.setCopNonConformity(objectData.getString("copNonConformity"));
		object.setInspectionRecordNo(objectData.getString("inspectionRecordNo"));
		// object.setCorporationId(objectData.getLong("corporationId"));
		// object.setInspectorId(objectData.getLong("inspectorId"));
		object.setInspectionSite(objectData.getString("inspectionSite"));
		object.setSubInspector(objectData.getString("subInspector"));
		object.setDescription(objectData.getString("description"));
		object.setInspectionRecordFileEntryId(objectData.getLong("inspectionRecordFileEntryId"));
		object.setCopReportRefNo(objectData.getString("copReportRefNo"));
		object.setCopReportPreviousNo(objectData.getString("copReportPreviousNo"));
		object.setExpiredStatus(objectData.getString("expiredStatus"));
		object.setDossierId(objectData.getLong("dossierId"));
		object.setDossierIdCTN(objectData.getString("dossierIdCTN"));
		object.setDossierNo(objectData.getString("dossierNo"));

		object.setSiteOfNationality(objectData.getString("siteOfNationality"));
		object.setSiteOfNationalityCode(objectData.getString("siteOfNationalityCode"));
		object.setSiteOfRegion(objectData.getString("siteOfRegion"));
		object.setSiteOfRegionCode(objectData.getString("siteOfRegionCode"));
		object.setSiteOfCity(objectData.getString("siteOfCity"));
		object.setSiteOfCityCode(objectData.getString("siteOfCityCode"));
		object.setCorporationName(objectData.getString("corporationName"));
		object.setInspectorContactCode(objectData.getString("inspectorContactCode"));
		object.setInspectorName(objectData.getString("inspectorName"));
		object.setInspectoRendorSementDate(
				APIDateTimeUtil.parseStringToDate(objectData.getString("inspectoRendorSementDate")));
		object.setInspectorDeadline(APIDateTimeUtil.parseStringToDate(objectData.getString("inspectorDeadline")));
		object.setResolvedStatus(objectData.getString("resolvedStatus"));
		object.setNumberOfNonConformity(objectData.getInt("numberOfNonConformity"));
		object.setNumberOfResolved(objectData.getInt("numberOfResolved"));
		object.setObservationDescription(objectData.getString("observationDescription"));
		object.setInspectionAuditCycle(objectData.getString("inspectionAuditCycle"));
		object.setInspectionNote(objectData.getString("inspectionNote"));
		object.setProductionConformityChecking(objectData.getString("productionConformityChecking"));
		object.setProductionStampChecking(objectData.getString("productionStampChecking"));
		object.setTestingEquipmentChecking(objectData.getString("testingEquipmentChecking"));
		object.setProductionPlantClassification(objectData.getString("productionPlantClassification"));
		object.setActualCapacity(objectData.getString("actualCapacity"));
		object.setMaxCapacity(objectData.getString("maxCapacity"));
		object.setAverageCapacity(objectData.getString("averageCapacity"));
		object.setTotalEmployee(objectData.getString("totalEmployee"));
		object.setTotalWorker(objectData.getString("totalWorker"));
		object.setTotalManager(objectData.getString("totalManager"));
		object.setTotalTechnical(objectData.getString("totalTechnical"));
		object.setTotalQaEmployee(objectData.getString("totalQaEmployee"));
		object.setTotalSquareMeter(objectData.getString("totalSquareMeter"));
		object.setWareHouseSquare(objectData.getString("wareHouseSquare"));
		object.setOfficeSquare(objectData.getString("officeSquare"));
		object.setProductionSquare(objectData.getString("productionSquare"));
		object.setMachiningArea(objectData.getString("machiningArea"));
		object.setWeldingArea(objectData.getString("weldingArea"));
		object.setPaintingArea(objectData.getString("paintingArea"));
		object.setProductionAssembleArea(objectData.getString("productionAssembleArea"));
		object.setFinishProductArea(objectData.getString("finishProductArea"));
		object.setTestingArea(objectData.getString("testingArea"));
		object.setSelfEquipment(objectData.getString("selfEquipment"));
		object.setContractEquipment(objectData.getString("contractEquipment"));
		object.setCircularNo(objectData.getString("circularNo"));
		object.setCircularDate(APIDateTimeUtil.parseStringToDate(objectData.getString("circularDate")));
		object.setCircularNo2(objectData.getString("circularNo2"));
		object.setCircularDate2(APIDateTimeUtil.parseStringToDate(objectData.getString("circularDate2")));

		object = vrcopReportRepositoryPersistence.update(object);

		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			JSONObject jReportRepository = BusinessUtil.object2Json_originColumnName(object,
					VRCOPReportRepositoryModelImpl.class, StringPool.BLANK);
			result.put("vr_COPReportRepository", jReportRepository);
		} catch (JSONException e) {
		}

		if (arrayVRCOPProductionPlantEmployee != null) {
			JSONArray arrayEmployee = vrcopProductionPlantEmployeeLocalService.adminProcessData(
					arrayVRCOPProductionPlantEmployee, object.getMtCore(), object.getPrimaryKey(),
					object.getDossierId(), object.getDossierIdCTN(), object.getDossierNo());
			result.put("vr_ProductionPlantEmployee", arrayEmployee);
		}
		if (arrayVRCOPProdEquipment != null) {
			JSONArray arrayEquipment = vrcopProductionPlantEquipmentLocalService.adminProcessData(
					arrayVRCOPProdEquipment, object.getMtCore(), object.getPrimaryKey(), object.getDossierId(),
					object.getDossierIdCTN(), object.getDossierNo());
			result.put("vr_ProductionPlantEquipment", arrayEquipment);
		}
		if (arrayVRCOPProdEquipment != null) {
			JSONArray prodEqipment = vrcopProdEquipmentLocalService.adminProcessData(arrayVRCOPProdEquipment,
					object.getMtCore(), object.getPrimaryKey(), object.getDossierId(), object.getDossierIdCTN(),
					object.getDossierNo());
			result.put("vr_ProductionPlantProdEquipment", prodEqipment);
		}
		if (arrayVRCOPProductType != null) {
			JSONArray productType = vrcopProductTypeLocalService.adminProcessData(arrayVRCOPProductType,
					object.getMtCore(), object.getPrimaryKey(), object.getDossierId(), object.getDossierIdCTN(),
					object.getDossierNo());
			result.put("vr_ProductType", productType);
		}
		if (arrayVRCOPReportAttach != null) {
			JSONArray reportAttach = vrcopReportAttachLocalService.adminProcessData(arrayVRCOPReportAttach,
					object.getMtCore(), object.getPrimaryKey(), object.getDossierId(), object.getDossierIdCTN(),
					object.getDossierNo());
			result.put("vr_COPReport_attach", reportAttach);
		}

		return result;
	}

	public List<VRCOPReportRepository> findByMtCore_ProductionPlantCode_COPClassification(long mtCore,
			String productionPlantCode, String copClassification, int start, int end) {
		OrderByComparator<VRCOPReportRepository> orderByComparator = OrderByComparatorFactoryUtil
				.create("vr_copreportrepository", "id", "desc");
		return vrcopReportRepositoryPersistence.findByproductionPlantCode_copClassification(mtCore, productionPlantCode,
				copClassification, start, end, orderByComparator);
	}

	public List<VRCOPProductionPlantEmployee> findVRCOPProductionPlantEmployeesByDossierId(long dossierId, long mtCore,
			int start, int end) {
		return vrcopProductionPlantEmployeePersistence.findBycopDossierId(dossierId, start, end);
	}

	public List<VRCOPProductionPlantEquipment> findVRCOPProductionPlantEquipmentsByDossierId(long dossierId,
			long mtCore, int start, int end) {
		return vrcopProductionPlantEquipmentPersistence.findBycopDossierId(dossierId, start, end);
	}

	public List<VRCOPProdEquipment> findVRCOPProdEquipmentsByDossierId(long dossierId, long mtCore, int start,
			int end) {
		return vrcopProdEquipmentPersistence.findBycopDossierId(dossierId, start, end);
	}

	public List<VRCOPProductType> findVRCOPProductTypesByDossierId(long dossierId, long mtCore, int start, int end) {
		return vrcopProductTypePersistence.findBycopDossierId(dossierId, start, end);
	}

	public List<VRCOPReportAttach> findVRCOPReportAttachsByDossierId(long dossierId, long mtCore, int start, int end) {
		return vrcopReportAttachPersistence.findBycopDossierId(dossierId, start, end);
	}

	private Log _log = LogFactoryUtil.getLog(VRCOPReportRepositoryLocalServiceImpl.class);
}