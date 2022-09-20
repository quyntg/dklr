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

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRCOPReportRepository}.
 * </p>
 *
 * @author LamTV
 * @see VRCOPReportRepository
 * @generated
 */
@ProviderType
public class VRCOPReportRepositoryWrapper implements VRCOPReportRepository,
	ModelWrapper<VRCOPReportRepository> {
	public VRCOPReportRepositoryWrapper(
		VRCOPReportRepository vrcopReportRepository) {
		_vrcopReportRepository = vrcopReportRepository;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCOPReportRepository.class;
	}

	@Override
	public String getModelClassName() {
		return VRCOPReportRepository.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("applicantProfileId", getApplicantProfileId());
		attributes.put("applicantCode", getApplicantCode());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("overseasManufacturerCode", getOverseasManufacturerCode());
		attributes.put("overseasManufacturerName", getOverseasManufacturerName());
		attributes.put("overseasManufacturerAddress",
			getOverseasManufacturerAddress());
		attributes.put("productionPlantId", getProductionPlantId());
		attributes.put("productionPlantCode", getProductionPlantCode());
		attributes.put("productionPlantName", getProductionPlantName());
		attributes.put("productionPlantAddress", getProductionPlantAddress());
		attributes.put("copReportNo", getCopReportNo());
		attributes.put("copReportStatus", getCopReportStatus());
		attributes.put("copReportType", getCopReportType());
		attributes.put("copReportMetadata", getCopReportMetadata());
		attributes.put("copReportSignName", getCopReportSignName());
		attributes.put("copReportSignTitle", getCopReportSignTitle());
		attributes.put("copReportSignPlace", getCopReportSignPlace());
		attributes.put("copReportDate", getCopReportDate());
		attributes.put("copReportApprovedDate", getCopReportApprovedDate());
		attributes.put("copReportExpiredDate", getCopReportExpiredDate());
		attributes.put("COPFileEntryId", getCOPFileEntryId());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());
		attributes.put("importerManufacturerCode", getImporterManufacturerCode());
		attributes.put("importerManufacturerName", getImporterManufacturerName());
		attributes.put("importerManufacturerAddress",
			getImporterManufacturerAddress());
		attributes.put("markupDomesticsManufacturer",
			getMarkupDomesticsManufacturer());
		attributes.put("markupImporter", getMarkupImporter());
		attributes.put("copClassification", getCopClassification());
		attributes.put("productClassificationDescription",
			getProductClassificationDescription());
		attributes.put("totalPointA", getTotalPointA());
		attributes.put("totalPointB", getTotalPointB());
		attributes.put("totalPointC", getTotalPointC());
		attributes.put("copNonConformity", getCopNonConformity());
		attributes.put("inspectionRecordNo", getInspectionRecordNo());
		attributes.put("inspectionRecordDate", getInspectionRecordDate());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("inspectionSite", getInspectionSite());
		attributes.put("inspectionDateFrom", getInspectionDateFrom());
		attributes.put("inspectionDateTo", getInspectionDateTo());
		attributes.put("subInspector", getSubInspector());
		attributes.put("description", getDescription());
		attributes.put("applicantRepresentative", getApplicantRepresentative());
		attributes.put("applicantRepresentativeTitle",
			getApplicantRepresentativeTitle());
		attributes.put("inspectionRecordFileEntryId",
			getInspectionRecordFileEntryId());
		attributes.put("copReportRefNo", getCopReportRefNo());
		attributes.put("copReportRefDate", getCopReportRefDate());
		attributes.put("copReportPreviousNo", getCopReportPreviousNo());
		attributes.put("copReportPreviousDate", getCopReportPreviousDate());
		attributes.put("expiredStatus", getExpiredStatus());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("dossierNo", getDossierNo());
		attributes.put("applicantEmail", getApplicantEmail());
		attributes.put("applicantPhone", getApplicantPhone());
		attributes.put("applicantTelNo", getApplicantTelNo());
		attributes.put("applicantFax", getApplicantFax());
		attributes.put("applicantContactName", getApplicantContactName());
		attributes.put("applicantContactEmail", getApplicantContactEmail());
		attributes.put("applicantContactPhone", getApplicantContactPhone());
		attributes.put("applicantContactTelNo", getApplicantContactTelNo());
		attributes.put("applicantBusinessType", getApplicantBusinessType());
		attributes.put("markupDesigner", getMarkupDesigner());
		attributes.put("markupOverseasManufacturer",
			getMarkupOverseasManufacturer());
		attributes.put("markupMaintainer", getMarkupMaintainer());
		attributes.put("importerDomesticSite", getImporterDomesticSite());
		attributes.put("siteOfNationality", getSiteOfNationality());
		attributes.put("siteOfNationalityCode", getSiteOfNationalityCode());
		attributes.put("siteOfRegion", getSiteOfRegion());
		attributes.put("siteOfRegionCode", getSiteOfRegionCode());
		attributes.put("siteOfCity", getSiteOfCity());
		attributes.put("siteOfCityCode", getSiteOfCityCode());
		attributes.put("manufacturerRepresentative",
			getManufacturerRepresentative());
		attributes.put("manufacturerRepresentativeTitle",
			getManufacturerRepresentativeTitle());
		attributes.put("manufacturerEmail", getManufacturerEmail());
		attributes.put("manufacturerPhone", getManufacturerPhone());
		attributes.put("manufacturerFax", getManufacturerFax());
		attributes.put("productionPlantEmail", getProductionPlantEmail());
		attributes.put("productionPlantWebsite", getProductionPlantWebsite());
		attributes.put("productionPlantRepresentative",
			getProductionPlantRepresentative());
		attributes.put("productionPlantRepresentativeTitle",
			getProductionPlantRepresentativeTitle());
		attributes.put("corporationName", getCorporationName());
		attributes.put("inspectorContactCode", getInspectorContactCode());
		attributes.put("inspectorName", getInspectorName());
		attributes.put("inspectoRendorSementDate", getInspectoRendorSementDate());
		attributes.put("inspectorDeadline", getInspectorDeadline());
		attributes.put("resolvedStatus", getResolvedStatus());
		attributes.put("numberOfNonConformity", getNumberOfNonConformity());
		attributes.put("numberOfResolved", getNumberOfResolved());
		attributes.put("observationDescription", getObservationDescription());
		attributes.put("inspectionAuditCycle", getInspectionAuditCycle());
		attributes.put("inspectionNote", getInspectionNote());
		attributes.put("productionConformityChecking",
			getProductionConformityChecking());
		attributes.put("productionStampChecking", getProductionStampChecking());
		attributes.put("testingEquipmentChecking", getTestingEquipmentChecking());
		attributes.put("productionPlantClassification",
			getProductionPlantClassification());
		attributes.put("actualCapacity", getActualCapacity());
		attributes.put("maxCapacity", getMaxCapacity());
		attributes.put("averageCapacity", getAverageCapacity());
		attributes.put("totalEmployee", getTotalEmployee());
		attributes.put("totalWorker", getTotalWorker());
		attributes.put("totalManager", getTotalManager());
		attributes.put("totalTechnical", getTotalTechnical());
		attributes.put("totalQaEmployee", getTotalQaEmployee());
		attributes.put("totalSquareMeter", getTotalSquareMeter());
		attributes.put("wareHouseSquare", getWareHouseSquare());
		attributes.put("officeSquare", getOfficeSquare());
		attributes.put("productionSquare", getProductionSquare());
		attributes.put("machiningArea", getMachiningArea());
		attributes.put("weldingArea", getWeldingArea());
		attributes.put("paintingArea", getPaintingArea());
		attributes.put("productionAssembleArea", getProductionAssembleArea());
		attributes.put("finishProductArea", getFinishProductArea());
		attributes.put("testingArea", getTestingArea());
		attributes.put("selfEquipment", getSelfEquipment());
		attributes.put("contractEquipment", getContractEquipment());
		attributes.put("circularNo", getCircularNo());
		attributes.put("circularDate", getCircularDate());
		attributes.put("circularNo2", getCircularNo2());
		attributes.put("circularDate2", getCircularDate2());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long applicantProfileId = (Long)attributes.get("applicantProfileId");

		if (applicantProfileId != null) {
			setApplicantProfileId(applicantProfileId);
		}

		String applicantCode = (String)attributes.get("applicantCode");

		if (applicantCode != null) {
			setApplicantCode(applicantCode);
		}

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		String overseasManufacturerCode = (String)attributes.get(
				"overseasManufacturerCode");

		if (overseasManufacturerCode != null) {
			setOverseasManufacturerCode(overseasManufacturerCode);
		}

		String overseasManufacturerName = (String)attributes.get(
				"overseasManufacturerName");

		if (overseasManufacturerName != null) {
			setOverseasManufacturerName(overseasManufacturerName);
		}

		String overseasManufacturerAddress = (String)attributes.get(
				"overseasManufacturerAddress");

		if (overseasManufacturerAddress != null) {
			setOverseasManufacturerAddress(overseasManufacturerAddress);
		}

		Long productionPlantId = (Long)attributes.get("productionPlantId");

		if (productionPlantId != null) {
			setProductionPlantId(productionPlantId);
		}

		String productionPlantCode = (String)attributes.get(
				"productionPlantCode");

		if (productionPlantCode != null) {
			setProductionPlantCode(productionPlantCode);
		}

		String productionPlantName = (String)attributes.get(
				"productionPlantName");

		if (productionPlantName != null) {
			setProductionPlantName(productionPlantName);
		}

		String productionPlantAddress = (String)attributes.get(
				"productionPlantAddress");

		if (productionPlantAddress != null) {
			setProductionPlantAddress(productionPlantAddress);
		}

		String copReportNo = (String)attributes.get("copReportNo");

		if (copReportNo != null) {
			setCopReportNo(copReportNo);
		}

		String copReportStatus = (String)attributes.get("copReportStatus");

		if (copReportStatus != null) {
			setCopReportStatus(copReportStatus);
		}

		String copReportType = (String)attributes.get("copReportType");

		if (copReportType != null) {
			setCopReportType(copReportType);
		}

		String copReportMetadata = (String)attributes.get("copReportMetadata");

		if (copReportMetadata != null) {
			setCopReportMetadata(copReportMetadata);
		}

		String copReportSignName = (String)attributes.get("copReportSignName");

		if (copReportSignName != null) {
			setCopReportSignName(copReportSignName);
		}

		String copReportSignTitle = (String)attributes.get("copReportSignTitle");

		if (copReportSignTitle != null) {
			setCopReportSignTitle(copReportSignTitle);
		}

		String copReportSignPlace = (String)attributes.get("copReportSignPlace");

		if (copReportSignPlace != null) {
			setCopReportSignPlace(copReportSignPlace);
		}

		Date copReportDate = (Date)attributes.get("copReportDate");

		if (copReportDate != null) {
			setCopReportDate(copReportDate);
		}

		Date copReportApprovedDate = (Date)attributes.get(
				"copReportApprovedDate");

		if (copReportApprovedDate != null) {
			setCopReportApprovedDate(copReportApprovedDate);
		}

		Date copReportExpiredDate = (Date)attributes.get("copReportExpiredDate");

		if (copReportExpiredDate != null) {
			setCopReportExpiredDate(copReportExpiredDate);
		}

		Long COPFileEntryId = (Long)attributes.get("COPFileEntryId");

		if (COPFileEntryId != null) {
			setCOPFileEntryId(COPFileEntryId);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}

		String importerManufacturerCode = (String)attributes.get(
				"importerManufacturerCode");

		if (importerManufacturerCode != null) {
			setImporterManufacturerCode(importerManufacturerCode);
		}

		String importerManufacturerName = (String)attributes.get(
				"importerManufacturerName");

		if (importerManufacturerName != null) {
			setImporterManufacturerName(importerManufacturerName);
		}

		String importerManufacturerAddress = (String)attributes.get(
				"importerManufacturerAddress");

		if (importerManufacturerAddress != null) {
			setImporterManufacturerAddress(importerManufacturerAddress);
		}

		String markupDomesticsManufacturer = (String)attributes.get(
				"markupDomesticsManufacturer");

		if (markupDomesticsManufacturer != null) {
			setMarkupDomesticsManufacturer(markupDomesticsManufacturer);
		}

		String markupImporter = (String)attributes.get("markupImporter");

		if (markupImporter != null) {
			setMarkupImporter(markupImporter);
		}

		String copClassification = (String)attributes.get("copClassification");

		if (copClassification != null) {
			setCopClassification(copClassification);
		}

		String productClassificationDescription = (String)attributes.get(
				"productClassificationDescription");

		if (productClassificationDescription != null) {
			setProductClassificationDescription(productClassificationDescription);
		}

		Integer totalPointA = (Integer)attributes.get("totalPointA");

		if (totalPointA != null) {
			setTotalPointA(totalPointA);
		}

		Integer totalPointB = (Integer)attributes.get("totalPointB");

		if (totalPointB != null) {
			setTotalPointB(totalPointB);
		}

		Integer totalPointC = (Integer)attributes.get("totalPointC");

		if (totalPointC != null) {
			setTotalPointC(totalPointC);
		}

		String copNonConformity = (String)attributes.get("copNonConformity");

		if (copNonConformity != null) {
			setCopNonConformity(copNonConformity);
		}

		String inspectionRecordNo = (String)attributes.get("inspectionRecordNo");

		if (inspectionRecordNo != null) {
			setInspectionRecordNo(inspectionRecordNo);
		}

		Date inspectionRecordDate = (Date)attributes.get("inspectionRecordDate");

		if (inspectionRecordDate != null) {
			setInspectionRecordDate(inspectionRecordDate);
		}

		Long corporationId = (Long)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		String inspectionSite = (String)attributes.get("inspectionSite");

		if (inspectionSite != null) {
			setInspectionSite(inspectionSite);
		}

		Date inspectionDateFrom = (Date)attributes.get("inspectionDateFrom");

		if (inspectionDateFrom != null) {
			setInspectionDateFrom(inspectionDateFrom);
		}

		Date inspectionDateTo = (Date)attributes.get("inspectionDateTo");

		if (inspectionDateTo != null) {
			setInspectionDateTo(inspectionDateTo);
		}

		String subInspector = (String)attributes.get("subInspector");

		if (subInspector != null) {
			setSubInspector(subInspector);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String applicantRepresentative = (String)attributes.get(
				"applicantRepresentative");

		if (applicantRepresentative != null) {
			setApplicantRepresentative(applicantRepresentative);
		}

		String applicantRepresentativeTitle = (String)attributes.get(
				"applicantRepresentativeTitle");

		if (applicantRepresentativeTitle != null) {
			setApplicantRepresentativeTitle(applicantRepresentativeTitle);
		}

		Long inspectionRecordFileEntryId = (Long)attributes.get(
				"inspectionRecordFileEntryId");

		if (inspectionRecordFileEntryId != null) {
			setInspectionRecordFileEntryId(inspectionRecordFileEntryId);
		}

		String copReportRefNo = (String)attributes.get("copReportRefNo");

		if (copReportRefNo != null) {
			setCopReportRefNo(copReportRefNo);
		}

		Date copReportRefDate = (Date)attributes.get("copReportRefDate");

		if (copReportRefDate != null) {
			setCopReportRefDate(copReportRefDate);
		}

		String copReportPreviousNo = (String)attributes.get(
				"copReportPreviousNo");

		if (copReportPreviousNo != null) {
			setCopReportPreviousNo(copReportPreviousNo);
		}

		Date copReportPreviousDate = (Date)attributes.get(
				"copReportPreviousDate");

		if (copReportPreviousDate != null) {
			setCopReportPreviousDate(copReportPreviousDate);
		}

		String expiredStatus = (String)attributes.get("expiredStatus");

		if (expiredStatus != null) {
			setExpiredStatus(expiredStatus);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String dossierIdCTN = (String)attributes.get("dossierIdCTN");

		if (dossierIdCTN != null) {
			setDossierIdCTN(dossierIdCTN);
		}

		String dossierNo = (String)attributes.get("dossierNo");

		if (dossierNo != null) {
			setDossierNo(dossierNo);
		}

		String applicantEmail = (String)attributes.get("applicantEmail");

		if (applicantEmail != null) {
			setApplicantEmail(applicantEmail);
		}

		String applicantPhone = (String)attributes.get("applicantPhone");

		if (applicantPhone != null) {
			setApplicantPhone(applicantPhone);
		}

		String applicantTelNo = (String)attributes.get("applicantTelNo");

		if (applicantTelNo != null) {
			setApplicantTelNo(applicantTelNo);
		}

		String applicantFax = (String)attributes.get("applicantFax");

		if (applicantFax != null) {
			setApplicantFax(applicantFax);
		}

		String applicantContactName = (String)attributes.get(
				"applicantContactName");

		if (applicantContactName != null) {
			setApplicantContactName(applicantContactName);
		}

		String applicantContactEmail = (String)attributes.get(
				"applicantContactEmail");

		if (applicantContactEmail != null) {
			setApplicantContactEmail(applicantContactEmail);
		}

		String applicantContactPhone = (String)attributes.get(
				"applicantContactPhone");

		if (applicantContactPhone != null) {
			setApplicantContactPhone(applicantContactPhone);
		}

		String applicantContactTelNo = (String)attributes.get(
				"applicantContactTelNo");

		if (applicantContactTelNo != null) {
			setApplicantContactTelNo(applicantContactTelNo);
		}

		String applicantBusinessType = (String)attributes.get(
				"applicantBusinessType");

		if (applicantBusinessType != null) {
			setApplicantBusinessType(applicantBusinessType);
		}

		String markupDesigner = (String)attributes.get("markupDesigner");

		if (markupDesigner != null) {
			setMarkupDesigner(markupDesigner);
		}

		String markupOverseasManufacturer = (String)attributes.get(
				"markupOverseasManufacturer");

		if (markupOverseasManufacturer != null) {
			setMarkupOverseasManufacturer(markupOverseasManufacturer);
		}

		String markupMaintainer = (String)attributes.get("markupMaintainer");

		if (markupMaintainer != null) {
			setMarkupMaintainer(markupMaintainer);
		}

		String importerDomesticSite = (String)attributes.get(
				"importerDomesticSite");

		if (importerDomesticSite != null) {
			setImporterDomesticSite(importerDomesticSite);
		}

		String siteOfNationality = (String)attributes.get("siteOfNationality");

		if (siteOfNationality != null) {
			setSiteOfNationality(siteOfNationality);
		}

		String siteOfNationalityCode = (String)attributes.get(
				"siteOfNationalityCode");

		if (siteOfNationalityCode != null) {
			setSiteOfNationalityCode(siteOfNationalityCode);
		}

		String siteOfRegion = (String)attributes.get("siteOfRegion");

		if (siteOfRegion != null) {
			setSiteOfRegion(siteOfRegion);
		}

		String siteOfRegionCode = (String)attributes.get("siteOfRegionCode");

		if (siteOfRegionCode != null) {
			setSiteOfRegionCode(siteOfRegionCode);
		}

		String siteOfCity = (String)attributes.get("siteOfCity");

		if (siteOfCity != null) {
			setSiteOfCity(siteOfCity);
		}

		String siteOfCityCode = (String)attributes.get("siteOfCityCode");

		if (siteOfCityCode != null) {
			setSiteOfCityCode(siteOfCityCode);
		}

		String manufacturerRepresentative = (String)attributes.get(
				"manufacturerRepresentative");

		if (manufacturerRepresentative != null) {
			setManufacturerRepresentative(manufacturerRepresentative);
		}

		String manufacturerRepresentativeTitle = (String)attributes.get(
				"manufacturerRepresentativeTitle");

		if (manufacturerRepresentativeTitle != null) {
			setManufacturerRepresentativeTitle(manufacturerRepresentativeTitle);
		}

		String manufacturerEmail = (String)attributes.get("manufacturerEmail");

		if (manufacturerEmail != null) {
			setManufacturerEmail(manufacturerEmail);
		}

		String manufacturerPhone = (String)attributes.get("manufacturerPhone");

		if (manufacturerPhone != null) {
			setManufacturerPhone(manufacturerPhone);
		}

		String manufacturerFax = (String)attributes.get("manufacturerFax");

		if (manufacturerFax != null) {
			setManufacturerFax(manufacturerFax);
		}

		String productionPlantEmail = (String)attributes.get(
				"productionPlantEmail");

		if (productionPlantEmail != null) {
			setProductionPlantEmail(productionPlantEmail);
		}

		String productionPlantWebsite = (String)attributes.get(
				"productionPlantWebsite");

		if (productionPlantWebsite != null) {
			setProductionPlantWebsite(productionPlantWebsite);
		}

		String productionPlantRepresentative = (String)attributes.get(
				"productionPlantRepresentative");

		if (productionPlantRepresentative != null) {
			setProductionPlantRepresentative(productionPlantRepresentative);
		}

		String productionPlantRepresentativeTitle = (String)attributes.get(
				"productionPlantRepresentativeTitle");

		if (productionPlantRepresentativeTitle != null) {
			setProductionPlantRepresentativeTitle(productionPlantRepresentativeTitle);
		}

		String corporationName = (String)attributes.get("corporationName");

		if (corporationName != null) {
			setCorporationName(corporationName);
		}

		String inspectorContactCode = (String)attributes.get(
				"inspectorContactCode");

		if (inspectorContactCode != null) {
			setInspectorContactCode(inspectorContactCode);
		}

		String inspectorName = (String)attributes.get("inspectorName");

		if (inspectorName != null) {
			setInspectorName(inspectorName);
		}

		Date inspectoRendorSementDate = (Date)attributes.get(
				"inspectoRendorSementDate");

		if (inspectoRendorSementDate != null) {
			setInspectoRendorSementDate(inspectoRendorSementDate);
		}

		Date inspectorDeadline = (Date)attributes.get("inspectorDeadline");

		if (inspectorDeadline != null) {
			setInspectorDeadline(inspectorDeadline);
		}

		String resolvedStatus = (String)attributes.get("resolvedStatus");

		if (resolvedStatus != null) {
			setResolvedStatus(resolvedStatus);
		}

		Integer numberOfNonConformity = (Integer)attributes.get(
				"numberOfNonConformity");

		if (numberOfNonConformity != null) {
			setNumberOfNonConformity(numberOfNonConformity);
		}

		Integer numberOfResolved = (Integer)attributes.get("numberOfResolved");

		if (numberOfResolved != null) {
			setNumberOfResolved(numberOfResolved);
		}

		String observationDescription = (String)attributes.get(
				"observationDescription");

		if (observationDescription != null) {
			setObservationDescription(observationDescription);
		}

		String inspectionAuditCycle = (String)attributes.get(
				"inspectionAuditCycle");

		if (inspectionAuditCycle != null) {
			setInspectionAuditCycle(inspectionAuditCycle);
		}

		String inspectionNote = (String)attributes.get("inspectionNote");

		if (inspectionNote != null) {
			setInspectionNote(inspectionNote);
		}

		String productionConformityChecking = (String)attributes.get(
				"productionConformityChecking");

		if (productionConformityChecking != null) {
			setProductionConformityChecking(productionConformityChecking);
		}

		String productionStampChecking = (String)attributes.get(
				"productionStampChecking");

		if (productionStampChecking != null) {
			setProductionStampChecking(productionStampChecking);
		}

		String testingEquipmentChecking = (String)attributes.get(
				"testingEquipmentChecking");

		if (testingEquipmentChecking != null) {
			setTestingEquipmentChecking(testingEquipmentChecking);
		}

		String productionPlantClassification = (String)attributes.get(
				"productionPlantClassification");

		if (productionPlantClassification != null) {
			setProductionPlantClassification(productionPlantClassification);
		}

		String actualCapacity = (String)attributes.get("actualCapacity");

		if (actualCapacity != null) {
			setActualCapacity(actualCapacity);
		}

		String maxCapacity = (String)attributes.get("maxCapacity");

		if (maxCapacity != null) {
			setMaxCapacity(maxCapacity);
		}

		String averageCapacity = (String)attributes.get("averageCapacity");

		if (averageCapacity != null) {
			setAverageCapacity(averageCapacity);
		}

		String totalEmployee = (String)attributes.get("totalEmployee");

		if (totalEmployee != null) {
			setTotalEmployee(totalEmployee);
		}

		String totalWorker = (String)attributes.get("totalWorker");

		if (totalWorker != null) {
			setTotalWorker(totalWorker);
		}

		String totalManager = (String)attributes.get("totalManager");

		if (totalManager != null) {
			setTotalManager(totalManager);
		}

		String totalTechnical = (String)attributes.get("totalTechnical");

		if (totalTechnical != null) {
			setTotalTechnical(totalTechnical);
		}

		String totalQaEmployee = (String)attributes.get("totalQaEmployee");

		if (totalQaEmployee != null) {
			setTotalQaEmployee(totalQaEmployee);
		}

		String totalSquareMeter = (String)attributes.get("totalSquareMeter");

		if (totalSquareMeter != null) {
			setTotalSquareMeter(totalSquareMeter);
		}

		String wareHouseSquare = (String)attributes.get("wareHouseSquare");

		if (wareHouseSquare != null) {
			setWareHouseSquare(wareHouseSquare);
		}

		String officeSquare = (String)attributes.get("officeSquare");

		if (officeSquare != null) {
			setOfficeSquare(officeSquare);
		}

		String productionSquare = (String)attributes.get("productionSquare");

		if (productionSquare != null) {
			setProductionSquare(productionSquare);
		}

		String machiningArea = (String)attributes.get("machiningArea");

		if (machiningArea != null) {
			setMachiningArea(machiningArea);
		}

		String weldingArea = (String)attributes.get("weldingArea");

		if (weldingArea != null) {
			setWeldingArea(weldingArea);
		}

		String paintingArea = (String)attributes.get("paintingArea");

		if (paintingArea != null) {
			setPaintingArea(paintingArea);
		}

		String productionAssembleArea = (String)attributes.get(
				"productionAssembleArea");

		if (productionAssembleArea != null) {
			setProductionAssembleArea(productionAssembleArea);
		}

		String finishProductArea = (String)attributes.get("finishProductArea");

		if (finishProductArea != null) {
			setFinishProductArea(finishProductArea);
		}

		String testingArea = (String)attributes.get("testingArea");

		if (testingArea != null) {
			setTestingArea(testingArea);
		}

		String selfEquipment = (String)attributes.get("selfEquipment");

		if (selfEquipment != null) {
			setSelfEquipment(selfEquipment);
		}

		String contractEquipment = (String)attributes.get("contractEquipment");

		if (contractEquipment != null) {
			setContractEquipment(contractEquipment);
		}

		String circularNo = (String)attributes.get("circularNo");

		if (circularNo != null) {
			setCircularNo(circularNo);
		}

		Date circularDate = (Date)attributes.get("circularDate");

		if (circularDate != null) {
			setCircularDate(circularDate);
		}

		String circularNo2 = (String)attributes.get("circularNo2");

		if (circularNo2 != null) {
			setCircularNo2(circularNo2);
		}

		Date circularDate2 = (Date)attributes.get("circularDate2");

		if (circularDate2 != null) {
			setCircularDate2(circularDate2);
		}
	}

	@Override
	public VRCOPReportRepository toEscapedModel() {
		return new VRCOPReportRepositoryWrapper(_vrcopReportRepository.toEscapedModel());
	}

	@Override
	public VRCOPReportRepository toUnescapedModel() {
		return new VRCOPReportRepositoryWrapper(_vrcopReportRepository.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrcopReportRepository.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrcopReportRepository.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrcopReportRepository.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrcopReportRepository.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCOPReportRepository> toCacheModel() {
		return _vrcopReportRepository.toCacheModel();
	}

	@Override
	public int compareTo(VRCOPReportRepository vrcopReportRepository) {
		return _vrcopReportRepository.compareTo(vrcopReportRepository);
	}

	/**
	* Returns the number of non conformity of this vrcop report repository.
	*
	* @return the number of non conformity of this vrcop report repository
	*/
	@Override
	public int getNumberOfNonConformity() {
		return _vrcopReportRepository.getNumberOfNonConformity();
	}

	/**
	* Returns the number of resolved of this vrcop report repository.
	*
	* @return the number of resolved of this vrcop report repository
	*/
	@Override
	public int getNumberOfResolved() {
		return _vrcopReportRepository.getNumberOfResolved();
	}

	/**
	* Returns the total point a of this vrcop report repository.
	*
	* @return the total point a of this vrcop report repository
	*/
	@Override
	public int getTotalPointA() {
		return _vrcopReportRepository.getTotalPointA();
	}

	/**
	* Returns the total point b of this vrcop report repository.
	*
	* @return the total point b of this vrcop report repository
	*/
	@Override
	public int getTotalPointB() {
		return _vrcopReportRepository.getTotalPointB();
	}

	/**
	* Returns the total point c of this vrcop report repository.
	*
	* @return the total point c of this vrcop report repository
	*/
	@Override
	public int getTotalPointC() {
		return _vrcopReportRepository.getTotalPointC();
	}

	@Override
	public int hashCode() {
		return _vrcopReportRepository.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrcopReportRepository.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCOPReportRepositoryWrapper((VRCOPReportRepository)_vrcopReportRepository.clone());
	}

	/**
	* Returns the actual capacity of this vrcop report repository.
	*
	* @return the actual capacity of this vrcop report repository
	*/
	@Override
	public java.lang.String getActualCapacity() {
		return _vrcopReportRepository.getActualCapacity();
	}

	/**
	* Returns the applicant address of this vrcop report repository.
	*
	* @return the applicant address of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantAddress() {
		return _vrcopReportRepository.getApplicantAddress();
	}

	/**
	* Returns the applicant business type of this vrcop report repository.
	*
	* @return the applicant business type of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantBusinessType() {
		return _vrcopReportRepository.getApplicantBusinessType();
	}

	/**
	* Returns the applicant code of this vrcop report repository.
	*
	* @return the applicant code of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantCode() {
		return _vrcopReportRepository.getApplicantCode();
	}

	/**
	* Returns the applicant contact email of this vrcop report repository.
	*
	* @return the applicant contact email of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantContactEmail() {
		return _vrcopReportRepository.getApplicantContactEmail();
	}

	/**
	* Returns the applicant contact name of this vrcop report repository.
	*
	* @return the applicant contact name of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantContactName() {
		return _vrcopReportRepository.getApplicantContactName();
	}

	/**
	* Returns the applicant contact phone of this vrcop report repository.
	*
	* @return the applicant contact phone of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantContactPhone() {
		return _vrcopReportRepository.getApplicantContactPhone();
	}

	/**
	* Returns the applicant contact tel no of this vrcop report repository.
	*
	* @return the applicant contact tel no of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantContactTelNo() {
		return _vrcopReportRepository.getApplicantContactTelNo();
	}

	/**
	* Returns the applicant email of this vrcop report repository.
	*
	* @return the applicant email of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantEmail() {
		return _vrcopReportRepository.getApplicantEmail();
	}

	/**
	* Returns the applicant fax of this vrcop report repository.
	*
	* @return the applicant fax of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantFax() {
		return _vrcopReportRepository.getApplicantFax();
	}

	/**
	* Returns the applicant name of this vrcop report repository.
	*
	* @return the applicant name of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _vrcopReportRepository.getApplicantName();
	}

	/**
	* Returns the applicant phone of this vrcop report repository.
	*
	* @return the applicant phone of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantPhone() {
		return _vrcopReportRepository.getApplicantPhone();
	}

	/**
	* Returns the applicant representative of this vrcop report repository.
	*
	* @return the applicant representative of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantRepresentative() {
		return _vrcopReportRepository.getApplicantRepresentative();
	}

	/**
	* Returns the applicant representative title of this vrcop report repository.
	*
	* @return the applicant representative title of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantRepresentativeTitle() {
		return _vrcopReportRepository.getApplicantRepresentativeTitle();
	}

	/**
	* Returns the applicant tel no of this vrcop report repository.
	*
	* @return the applicant tel no of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantTelNo() {
		return _vrcopReportRepository.getApplicantTelNo();
	}

	/**
	* Returns the average capacity of this vrcop report repository.
	*
	* @return the average capacity of this vrcop report repository
	*/
	@Override
	public java.lang.String getAverageCapacity() {
		return _vrcopReportRepository.getAverageCapacity();
	}

	/**
	* Returns the circular no of this vrcop report repository.
	*
	* @return the circular no of this vrcop report repository
	*/
	@Override
	public java.lang.String getCircularNo() {
		return _vrcopReportRepository.getCircularNo();
	}

	/**
	* Returns the circular no2 of this vrcop report repository.
	*
	* @return the circular no2 of this vrcop report repository
	*/
	@Override
	public java.lang.String getCircularNo2() {
		return _vrcopReportRepository.getCircularNo2();
	}

	/**
	* Returns the contract equipment of this vrcop report repository.
	*
	* @return the contract equipment of this vrcop report repository
	*/
	@Override
	public java.lang.String getContractEquipment() {
		return _vrcopReportRepository.getContractEquipment();
	}

	/**
	* Returns the cop classification of this vrcop report repository.
	*
	* @return the cop classification of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopClassification() {
		return _vrcopReportRepository.getCopClassification();
	}

	/**
	* Returns the cop non conformity of this vrcop report repository.
	*
	* @return the cop non conformity of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopNonConformity() {
		return _vrcopReportRepository.getCopNonConformity();
	}

	/**
	* Returns the cop report metadata of this vrcop report repository.
	*
	* @return the cop report metadata of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportMetadata() {
		return _vrcopReportRepository.getCopReportMetadata();
	}

	/**
	* Returns the cop report no of this vrcop report repository.
	*
	* @return the cop report no of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportNo() {
		return _vrcopReportRepository.getCopReportNo();
	}

	/**
	* Returns the cop report previous no of this vrcop report repository.
	*
	* @return the cop report previous no of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportPreviousNo() {
		return _vrcopReportRepository.getCopReportPreviousNo();
	}

	/**
	* Returns the cop report ref no of this vrcop report repository.
	*
	* @return the cop report ref no of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportRefNo() {
		return _vrcopReportRepository.getCopReportRefNo();
	}

	/**
	* Returns the cop report sign name of this vrcop report repository.
	*
	* @return the cop report sign name of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportSignName() {
		return _vrcopReportRepository.getCopReportSignName();
	}

	/**
	* Returns the cop report sign place of this vrcop report repository.
	*
	* @return the cop report sign place of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportSignPlace() {
		return _vrcopReportRepository.getCopReportSignPlace();
	}

	/**
	* Returns the cop report sign title of this vrcop report repository.
	*
	* @return the cop report sign title of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportSignTitle() {
		return _vrcopReportRepository.getCopReportSignTitle();
	}

	/**
	* Returns the cop report status of this vrcop report repository.
	*
	* @return the cop report status of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportStatus() {
		return _vrcopReportRepository.getCopReportStatus();
	}

	/**
	* Returns the cop report type of this vrcop report repository.
	*
	* @return the cop report type of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportType() {
		return _vrcopReportRepository.getCopReportType();
	}

	/**
	* Returns the corporation name of this vrcop report repository.
	*
	* @return the corporation name of this vrcop report repository
	*/
	@Override
	public java.lang.String getCorporationName() {
		return _vrcopReportRepository.getCorporationName();
	}

	/**
	* Returns the description of this vrcop report repository.
	*
	* @return the description of this vrcop report repository
	*/
	@Override
	public java.lang.String getDescription() {
		return _vrcopReportRepository.getDescription();
	}

	/**
	* Returns the dossier ID ctn of this vrcop report repository.
	*
	* @return the dossier ID ctn of this vrcop report repository
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrcopReportRepository.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vrcop report repository.
	*
	* @return the dossier no of this vrcop report repository
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrcopReportRepository.getDossierNo();
	}

	/**
	* Returns the expired status of this vrcop report repository.
	*
	* @return the expired status of this vrcop report repository
	*/
	@Override
	public java.lang.String getExpiredStatus() {
		return _vrcopReportRepository.getExpiredStatus();
	}

	/**
	* Returns the finish product area of this vrcop report repository.
	*
	* @return the finish product area of this vrcop report repository
	*/
	@Override
	public java.lang.String getFinishProductArea() {
		return _vrcopReportRepository.getFinishProductArea();
	}

	/**
	* Returns the importer domestic site of this vrcop report repository.
	*
	* @return the importer domestic site of this vrcop report repository
	*/
	@Override
	public java.lang.String getImporterDomesticSite() {
		return _vrcopReportRepository.getImporterDomesticSite();
	}

	/**
	* Returns the importer manufacturer address of this vrcop report repository.
	*
	* @return the importer manufacturer address of this vrcop report repository
	*/
	@Override
	public java.lang.String getImporterManufacturerAddress() {
		return _vrcopReportRepository.getImporterManufacturerAddress();
	}

	/**
	* Returns the importer manufacturer code of this vrcop report repository.
	*
	* @return the importer manufacturer code of this vrcop report repository
	*/
	@Override
	public java.lang.String getImporterManufacturerCode() {
		return _vrcopReportRepository.getImporterManufacturerCode();
	}

	/**
	* Returns the importer manufacturer name of this vrcop report repository.
	*
	* @return the importer manufacturer name of this vrcop report repository
	*/
	@Override
	public java.lang.String getImporterManufacturerName() {
		return _vrcopReportRepository.getImporterManufacturerName();
	}

	/**
	* Returns the inspection audit cycle of this vrcop report repository.
	*
	* @return the inspection audit cycle of this vrcop report repository
	*/
	@Override
	public java.lang.String getInspectionAuditCycle() {
		return _vrcopReportRepository.getInspectionAuditCycle();
	}

	/**
	* Returns the inspection note of this vrcop report repository.
	*
	* @return the inspection note of this vrcop report repository
	*/
	@Override
	public java.lang.String getInspectionNote() {
		return _vrcopReportRepository.getInspectionNote();
	}

	/**
	* Returns the inspection record no of this vrcop report repository.
	*
	* @return the inspection record no of this vrcop report repository
	*/
	@Override
	public java.lang.String getInspectionRecordNo() {
		return _vrcopReportRepository.getInspectionRecordNo();
	}

	/**
	* Returns the inspection site of this vrcop report repository.
	*
	* @return the inspection site of this vrcop report repository
	*/
	@Override
	public java.lang.String getInspectionSite() {
		return _vrcopReportRepository.getInspectionSite();
	}

	/**
	* Returns the inspector contact code of this vrcop report repository.
	*
	* @return the inspector contact code of this vrcop report repository
	*/
	@Override
	public java.lang.String getInspectorContactCode() {
		return _vrcopReportRepository.getInspectorContactCode();
	}

	/**
	* Returns the inspector name of this vrcop report repository.
	*
	* @return the inspector name of this vrcop report repository
	*/
	@Override
	public java.lang.String getInspectorName() {
		return _vrcopReportRepository.getInspectorName();
	}

	/**
	* Returns the machining area of this vrcop report repository.
	*
	* @return the machining area of this vrcop report repository
	*/
	@Override
	public java.lang.String getMachiningArea() {
		return _vrcopReportRepository.getMachiningArea();
	}

	/**
	* Returns the manufacturer email of this vrcop report repository.
	*
	* @return the manufacturer email of this vrcop report repository
	*/
	@Override
	public java.lang.String getManufacturerEmail() {
		return _vrcopReportRepository.getManufacturerEmail();
	}

	/**
	* Returns the manufacturer fax of this vrcop report repository.
	*
	* @return the manufacturer fax of this vrcop report repository
	*/
	@Override
	public java.lang.String getManufacturerFax() {
		return _vrcopReportRepository.getManufacturerFax();
	}

	/**
	* Returns the manufacturer phone of this vrcop report repository.
	*
	* @return the manufacturer phone of this vrcop report repository
	*/
	@Override
	public java.lang.String getManufacturerPhone() {
		return _vrcopReportRepository.getManufacturerPhone();
	}

	/**
	* Returns the manufacturer representative of this vrcop report repository.
	*
	* @return the manufacturer representative of this vrcop report repository
	*/
	@Override
	public java.lang.String getManufacturerRepresentative() {
		return _vrcopReportRepository.getManufacturerRepresentative();
	}

	/**
	* Returns the manufacturer representative title of this vrcop report repository.
	*
	* @return the manufacturer representative title of this vrcop report repository
	*/
	@Override
	public java.lang.String getManufacturerRepresentativeTitle() {
		return _vrcopReportRepository.getManufacturerRepresentativeTitle();
	}

	/**
	* Returns the markup designer of this vrcop report repository.
	*
	* @return the markup designer of this vrcop report repository
	*/
	@Override
	public java.lang.String getMarkupDesigner() {
		return _vrcopReportRepository.getMarkupDesigner();
	}

	/**
	* Returns the markup domestics manufacturer of this vrcop report repository.
	*
	* @return the markup domestics manufacturer of this vrcop report repository
	*/
	@Override
	public java.lang.String getMarkupDomesticsManufacturer() {
		return _vrcopReportRepository.getMarkupDomesticsManufacturer();
	}

	/**
	* Returns the markup importer of this vrcop report repository.
	*
	* @return the markup importer of this vrcop report repository
	*/
	@Override
	public java.lang.String getMarkupImporter() {
		return _vrcopReportRepository.getMarkupImporter();
	}

	/**
	* Returns the markup maintainer of this vrcop report repository.
	*
	* @return the markup maintainer of this vrcop report repository
	*/
	@Override
	public java.lang.String getMarkupMaintainer() {
		return _vrcopReportRepository.getMarkupMaintainer();
	}

	/**
	* Returns the markup overseas manufacturer of this vrcop report repository.
	*
	* @return the markup overseas manufacturer of this vrcop report repository
	*/
	@Override
	public java.lang.String getMarkupOverseasManufacturer() {
		return _vrcopReportRepository.getMarkupOverseasManufacturer();
	}

	/**
	* Returns the max capacity of this vrcop report repository.
	*
	* @return the max capacity of this vrcop report repository
	*/
	@Override
	public java.lang.String getMaxCapacity() {
		return _vrcopReportRepository.getMaxCapacity();
	}

	/**
	* Returns the observation description of this vrcop report repository.
	*
	* @return the observation description of this vrcop report repository
	*/
	@Override
	public java.lang.String getObservationDescription() {
		return _vrcopReportRepository.getObservationDescription();
	}

	/**
	* Returns the office square of this vrcop report repository.
	*
	* @return the office square of this vrcop report repository
	*/
	@Override
	public java.lang.String getOfficeSquare() {
		return _vrcopReportRepository.getOfficeSquare();
	}

	/**
	* Returns the overseas manufacturer address of this vrcop report repository.
	*
	* @return the overseas manufacturer address of this vrcop report repository
	*/
	@Override
	public java.lang.String getOverseasManufacturerAddress() {
		return _vrcopReportRepository.getOverseasManufacturerAddress();
	}

	/**
	* Returns the overseas manufacturer code of this vrcop report repository.
	*
	* @return the overseas manufacturer code of this vrcop report repository
	*/
	@Override
	public java.lang.String getOverseasManufacturerCode() {
		return _vrcopReportRepository.getOverseasManufacturerCode();
	}

	/**
	* Returns the overseas manufacturer name of this vrcop report repository.
	*
	* @return the overseas manufacturer name of this vrcop report repository
	*/
	@Override
	public java.lang.String getOverseasManufacturerName() {
		return _vrcopReportRepository.getOverseasManufacturerName();
	}

	/**
	* Returns the painting area of this vrcop report repository.
	*
	* @return the painting area of this vrcop report repository
	*/
	@Override
	public java.lang.String getPaintingArea() {
		return _vrcopReportRepository.getPaintingArea();
	}

	/**
	* Returns the product classification description of this vrcop report repository.
	*
	* @return the product classification description of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductClassificationDescription() {
		return _vrcopReportRepository.getProductClassificationDescription();
	}

	/**
	* Returns the production assemble area of this vrcop report repository.
	*
	* @return the production assemble area of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionAssembleArea() {
		return _vrcopReportRepository.getProductionAssembleArea();
	}

	/**
	* Returns the production conformity checking of this vrcop report repository.
	*
	* @return the production conformity checking of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionConformityChecking() {
		return _vrcopReportRepository.getProductionConformityChecking();
	}

	/**
	* Returns the production plant address of this vrcop report repository.
	*
	* @return the production plant address of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionPlantAddress() {
		return _vrcopReportRepository.getProductionPlantAddress();
	}

	/**
	* Returns the production plant classification of this vrcop report repository.
	*
	* @return the production plant classification of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionPlantClassification() {
		return _vrcopReportRepository.getProductionPlantClassification();
	}

	/**
	* Returns the production plant code of this vrcop report repository.
	*
	* @return the production plant code of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrcopReportRepository.getProductionPlantCode();
	}

	/**
	* Returns the production plant email of this vrcop report repository.
	*
	* @return the production plant email of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionPlantEmail() {
		return _vrcopReportRepository.getProductionPlantEmail();
	}

	/**
	* Returns the production plant name of this vrcop report repository.
	*
	* @return the production plant name of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionPlantName() {
		return _vrcopReportRepository.getProductionPlantName();
	}

	/**
	* Returns the production plant representative of this vrcop report repository.
	*
	* @return the production plant representative of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionPlantRepresentative() {
		return _vrcopReportRepository.getProductionPlantRepresentative();
	}

	/**
	* Returns the production plant representative title of this vrcop report repository.
	*
	* @return the production plant representative title of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionPlantRepresentativeTitle() {
		return _vrcopReportRepository.getProductionPlantRepresentativeTitle();
	}

	/**
	* Returns the production plant website of this vrcop report repository.
	*
	* @return the production plant website of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionPlantWebsite() {
		return _vrcopReportRepository.getProductionPlantWebsite();
	}

	/**
	* Returns the production square of this vrcop report repository.
	*
	* @return the production square of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionSquare() {
		return _vrcopReportRepository.getProductionSquare();
	}

	/**
	* Returns the production stamp checking of this vrcop report repository.
	*
	* @return the production stamp checking of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionStampChecking() {
		return _vrcopReportRepository.getProductionStampChecking();
	}

	/**
	* Returns the resolved status of this vrcop report repository.
	*
	* @return the resolved status of this vrcop report repository
	*/
	@Override
	public java.lang.String getResolvedStatus() {
		return _vrcopReportRepository.getResolvedStatus();
	}

	/**
	* Returns the self equipment of this vrcop report repository.
	*
	* @return the self equipment of this vrcop report repository
	*/
	@Override
	public java.lang.String getSelfEquipment() {
		return _vrcopReportRepository.getSelfEquipment();
	}

	/**
	* Returns the site of city of this vrcop report repository.
	*
	* @return the site of city of this vrcop report repository
	*/
	@Override
	public java.lang.String getSiteOfCity() {
		return _vrcopReportRepository.getSiteOfCity();
	}

	/**
	* Returns the site of city code of this vrcop report repository.
	*
	* @return the site of city code of this vrcop report repository
	*/
	@Override
	public java.lang.String getSiteOfCityCode() {
		return _vrcopReportRepository.getSiteOfCityCode();
	}

	/**
	* Returns the site of nationality of this vrcop report repository.
	*
	* @return the site of nationality of this vrcop report repository
	*/
	@Override
	public java.lang.String getSiteOfNationality() {
		return _vrcopReportRepository.getSiteOfNationality();
	}

	/**
	* Returns the site of nationality code of this vrcop report repository.
	*
	* @return the site of nationality code of this vrcop report repository
	*/
	@Override
	public java.lang.String getSiteOfNationalityCode() {
		return _vrcopReportRepository.getSiteOfNationalityCode();
	}

	/**
	* Returns the site of region of this vrcop report repository.
	*
	* @return the site of region of this vrcop report repository
	*/
	@Override
	public java.lang.String getSiteOfRegion() {
		return _vrcopReportRepository.getSiteOfRegion();
	}

	/**
	* Returns the site of region code of this vrcop report repository.
	*
	* @return the site of region code of this vrcop report repository
	*/
	@Override
	public java.lang.String getSiteOfRegionCode() {
		return _vrcopReportRepository.getSiteOfRegionCode();
	}

	/**
	* Returns the sub inspector of this vrcop report repository.
	*
	* @return the sub inspector of this vrcop report repository
	*/
	@Override
	public java.lang.String getSubInspector() {
		return _vrcopReportRepository.getSubInspector();
	}

	/**
	* Returns the testing area of this vrcop report repository.
	*
	* @return the testing area of this vrcop report repository
	*/
	@Override
	public java.lang.String getTestingArea() {
		return _vrcopReportRepository.getTestingArea();
	}

	/**
	* Returns the testing equipment checking of this vrcop report repository.
	*
	* @return the testing equipment checking of this vrcop report repository
	*/
	@Override
	public java.lang.String getTestingEquipmentChecking() {
		return _vrcopReportRepository.getTestingEquipmentChecking();
	}

	/**
	* Returns the total employee of this vrcop report repository.
	*
	* @return the total employee of this vrcop report repository
	*/
	@Override
	public java.lang.String getTotalEmployee() {
		return _vrcopReportRepository.getTotalEmployee();
	}

	/**
	* Returns the total manager of this vrcop report repository.
	*
	* @return the total manager of this vrcop report repository
	*/
	@Override
	public java.lang.String getTotalManager() {
		return _vrcopReportRepository.getTotalManager();
	}

	/**
	* Returns the total qa employee of this vrcop report repository.
	*
	* @return the total qa employee of this vrcop report repository
	*/
	@Override
	public java.lang.String getTotalQaEmployee() {
		return _vrcopReportRepository.getTotalQaEmployee();
	}

	/**
	* Returns the total square meter of this vrcop report repository.
	*
	* @return the total square meter of this vrcop report repository
	*/
	@Override
	public java.lang.String getTotalSquareMeter() {
		return _vrcopReportRepository.getTotalSquareMeter();
	}

	/**
	* Returns the total technical of this vrcop report repository.
	*
	* @return the total technical of this vrcop report repository
	*/
	@Override
	public java.lang.String getTotalTechnical() {
		return _vrcopReportRepository.getTotalTechnical();
	}

	/**
	* Returns the total worker of this vrcop report repository.
	*
	* @return the total worker of this vrcop report repository
	*/
	@Override
	public java.lang.String getTotalWorker() {
		return _vrcopReportRepository.getTotalWorker();
	}

	/**
	* Returns the ware house square of this vrcop report repository.
	*
	* @return the ware house square of this vrcop report repository
	*/
	@Override
	public java.lang.String getWareHouseSquare() {
		return _vrcopReportRepository.getWareHouseSquare();
	}

	/**
	* Returns the welding area of this vrcop report repository.
	*
	* @return the welding area of this vrcop report repository
	*/
	@Override
	public java.lang.String getWeldingArea() {
		return _vrcopReportRepository.getWeldingArea();
	}

	@Override
	public java.lang.String toString() {
		return _vrcopReportRepository.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrcopReportRepository.toXmlString();
	}

	/**
	* Returns the circular date of this vrcop report repository.
	*
	* @return the circular date of this vrcop report repository
	*/
	@Override
	public Date getCircularDate() {
		return _vrcopReportRepository.getCircularDate();
	}

	/**
	* Returns the circular date2 of this vrcop report repository.
	*
	* @return the circular date2 of this vrcop report repository
	*/
	@Override
	public Date getCircularDate2() {
		return _vrcopReportRepository.getCircularDate2();
	}

	/**
	* Returns the cop report approved date of this vrcop report repository.
	*
	* @return the cop report approved date of this vrcop report repository
	*/
	@Override
	public Date getCopReportApprovedDate() {
		return _vrcopReportRepository.getCopReportApprovedDate();
	}

	/**
	* Returns the cop report date of this vrcop report repository.
	*
	* @return the cop report date of this vrcop report repository
	*/
	@Override
	public Date getCopReportDate() {
		return _vrcopReportRepository.getCopReportDate();
	}

	/**
	* Returns the cop report expired date of this vrcop report repository.
	*
	* @return the cop report expired date of this vrcop report repository
	*/
	@Override
	public Date getCopReportExpiredDate() {
		return _vrcopReportRepository.getCopReportExpiredDate();
	}

	/**
	* Returns the cop report previous date of this vrcop report repository.
	*
	* @return the cop report previous date of this vrcop report repository
	*/
	@Override
	public Date getCopReportPreviousDate() {
		return _vrcopReportRepository.getCopReportPreviousDate();
	}

	/**
	* Returns the cop report ref date of this vrcop report repository.
	*
	* @return the cop report ref date of this vrcop report repository
	*/
	@Override
	public Date getCopReportRefDate() {
		return _vrcopReportRepository.getCopReportRefDate();
	}

	/**
	* Returns the inspection date from of this vrcop report repository.
	*
	* @return the inspection date from of this vrcop report repository
	*/
	@Override
	public Date getInspectionDateFrom() {
		return _vrcopReportRepository.getInspectionDateFrom();
	}

	/**
	* Returns the inspection date to of this vrcop report repository.
	*
	* @return the inspection date to of this vrcop report repository
	*/
	@Override
	public Date getInspectionDateTo() {
		return _vrcopReportRepository.getInspectionDateTo();
	}

	/**
	* Returns the inspection record date of this vrcop report repository.
	*
	* @return the inspection record date of this vrcop report repository
	*/
	@Override
	public Date getInspectionRecordDate() {
		return _vrcopReportRepository.getInspectionRecordDate();
	}

	/**
	* Returns the inspecto rendor sement date of this vrcop report repository.
	*
	* @return the inspecto rendor sement date of this vrcop report repository
	*/
	@Override
	public Date getInspectoRendorSementDate() {
		return _vrcopReportRepository.getInspectoRendorSementDate();
	}

	/**
	* Returns the inspector deadline of this vrcop report repository.
	*
	* @return the inspector deadline of this vrcop report repository
	*/
	@Override
	public Date getInspectorDeadline() {
		return _vrcopReportRepository.getInspectorDeadline();
	}

	/**
	* Returns the modify date of this vrcop report repository.
	*
	* @return the modify date of this vrcop report repository
	*/
	@Override
	public Date getModifyDate() {
		return _vrcopReportRepository.getModifyDate();
	}

	/**
	* Returns the sync date of this vrcop report repository.
	*
	* @return the sync date of this vrcop report repository
	*/
	@Override
	public Date getSyncDate() {
		return _vrcopReportRepository.getSyncDate();
	}

	/**
	* Returns the applicant profile ID of this vrcop report repository.
	*
	* @return the applicant profile ID of this vrcop report repository
	*/
	@Override
	public long getApplicantProfileId() {
		return _vrcopReportRepository.getApplicantProfileId();
	}

	/**
	* Returns the cop file entry ID of this vrcop report repository.
	*
	* @return the cop file entry ID of this vrcop report repository
	*/
	@Override
	public long getCOPFileEntryId() {
		return _vrcopReportRepository.getCOPFileEntryId();
	}

	/**
	* Returns the corporation ID of this vrcop report repository.
	*
	* @return the corporation ID of this vrcop report repository
	*/
	@Override
	public long getCorporationId() {
		return _vrcopReportRepository.getCorporationId();
	}

	/**
	* Returns the dossier ID of this vrcop report repository.
	*
	* @return the dossier ID of this vrcop report repository
	*/
	@Override
	public long getDossierId() {
		return _vrcopReportRepository.getDossierId();
	}

	/**
	* Returns the ID of this vrcop report repository.
	*
	* @return the ID of this vrcop report repository
	*/
	@Override
	public long getId() {
		return _vrcopReportRepository.getId();
	}

	/**
	* Returns the inspection record file entry ID of this vrcop report repository.
	*
	* @return the inspection record file entry ID of this vrcop report repository
	*/
	@Override
	public long getInspectionRecordFileEntryId() {
		return _vrcopReportRepository.getInspectionRecordFileEntryId();
	}

	/**
	* Returns the inspector ID of this vrcop report repository.
	*
	* @return the inspector ID of this vrcop report repository
	*/
	@Override
	public long getInspectorId() {
		return _vrcopReportRepository.getInspectorId();
	}

	/**
	* Returns the mt core of this vrcop report repository.
	*
	* @return the mt core of this vrcop report repository
	*/
	@Override
	public long getMtCore() {
		return _vrcopReportRepository.getMtCore();
	}

	/**
	* Returns the primary key of this vrcop report repository.
	*
	* @return the primary key of this vrcop report repository
	*/
	@Override
	public long getPrimaryKey() {
		return _vrcopReportRepository.getPrimaryKey();
	}

	/**
	* Returns the production plant ID of this vrcop report repository.
	*
	* @return the production plant ID of this vrcop report repository
	*/
	@Override
	public long getProductionPlantId() {
		return _vrcopReportRepository.getProductionPlantId();
	}

	@Override
	public void persist() {
		_vrcopReportRepository.persist();
	}

	/**
	* Sets the actual capacity of this vrcop report repository.
	*
	* @param actualCapacity the actual capacity of this vrcop report repository
	*/
	@Override
	public void setActualCapacity(java.lang.String actualCapacity) {
		_vrcopReportRepository.setActualCapacity(actualCapacity);
	}

	/**
	* Sets the applicant address of this vrcop report repository.
	*
	* @param applicantAddress the applicant address of this vrcop report repository
	*/
	@Override
	public void setApplicantAddress(java.lang.String applicantAddress) {
		_vrcopReportRepository.setApplicantAddress(applicantAddress);
	}

	/**
	* Sets the applicant business type of this vrcop report repository.
	*
	* @param applicantBusinessType the applicant business type of this vrcop report repository
	*/
	@Override
	public void setApplicantBusinessType(java.lang.String applicantBusinessType) {
		_vrcopReportRepository.setApplicantBusinessType(applicantBusinessType);
	}

	/**
	* Sets the applicant code of this vrcop report repository.
	*
	* @param applicantCode the applicant code of this vrcop report repository
	*/
	@Override
	public void setApplicantCode(java.lang.String applicantCode) {
		_vrcopReportRepository.setApplicantCode(applicantCode);
	}

	/**
	* Sets the applicant contact email of this vrcop report repository.
	*
	* @param applicantContactEmail the applicant contact email of this vrcop report repository
	*/
	@Override
	public void setApplicantContactEmail(java.lang.String applicantContactEmail) {
		_vrcopReportRepository.setApplicantContactEmail(applicantContactEmail);
	}

	/**
	* Sets the applicant contact name of this vrcop report repository.
	*
	* @param applicantContactName the applicant contact name of this vrcop report repository
	*/
	@Override
	public void setApplicantContactName(java.lang.String applicantContactName) {
		_vrcopReportRepository.setApplicantContactName(applicantContactName);
	}

	/**
	* Sets the applicant contact phone of this vrcop report repository.
	*
	* @param applicantContactPhone the applicant contact phone of this vrcop report repository
	*/
	@Override
	public void setApplicantContactPhone(java.lang.String applicantContactPhone) {
		_vrcopReportRepository.setApplicantContactPhone(applicantContactPhone);
	}

	/**
	* Sets the applicant contact tel no of this vrcop report repository.
	*
	* @param applicantContactTelNo the applicant contact tel no of this vrcop report repository
	*/
	@Override
	public void setApplicantContactTelNo(java.lang.String applicantContactTelNo) {
		_vrcopReportRepository.setApplicantContactTelNo(applicantContactTelNo);
	}

	/**
	* Sets the applicant email of this vrcop report repository.
	*
	* @param applicantEmail the applicant email of this vrcop report repository
	*/
	@Override
	public void setApplicantEmail(java.lang.String applicantEmail) {
		_vrcopReportRepository.setApplicantEmail(applicantEmail);
	}

	/**
	* Sets the applicant fax of this vrcop report repository.
	*
	* @param applicantFax the applicant fax of this vrcop report repository
	*/
	@Override
	public void setApplicantFax(java.lang.String applicantFax) {
		_vrcopReportRepository.setApplicantFax(applicantFax);
	}

	/**
	* Sets the applicant name of this vrcop report repository.
	*
	* @param applicantName the applicant name of this vrcop report repository
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_vrcopReportRepository.setApplicantName(applicantName);
	}

	/**
	* Sets the applicant phone of this vrcop report repository.
	*
	* @param applicantPhone the applicant phone of this vrcop report repository
	*/
	@Override
	public void setApplicantPhone(java.lang.String applicantPhone) {
		_vrcopReportRepository.setApplicantPhone(applicantPhone);
	}

	/**
	* Sets the applicant profile ID of this vrcop report repository.
	*
	* @param applicantProfileId the applicant profile ID of this vrcop report repository
	*/
	@Override
	public void setApplicantProfileId(long applicantProfileId) {
		_vrcopReportRepository.setApplicantProfileId(applicantProfileId);
	}

	/**
	* Sets the applicant representative of this vrcop report repository.
	*
	* @param applicantRepresentative the applicant representative of this vrcop report repository
	*/
	@Override
	public void setApplicantRepresentative(
		java.lang.String applicantRepresentative) {
		_vrcopReportRepository.setApplicantRepresentative(applicantRepresentative);
	}

	/**
	* Sets the applicant representative title of this vrcop report repository.
	*
	* @param applicantRepresentativeTitle the applicant representative title of this vrcop report repository
	*/
	@Override
	public void setApplicantRepresentativeTitle(
		java.lang.String applicantRepresentativeTitle) {
		_vrcopReportRepository.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
	}

	/**
	* Sets the applicant tel no of this vrcop report repository.
	*
	* @param applicantTelNo the applicant tel no of this vrcop report repository
	*/
	@Override
	public void setApplicantTelNo(java.lang.String applicantTelNo) {
		_vrcopReportRepository.setApplicantTelNo(applicantTelNo);
	}

	/**
	* Sets the average capacity of this vrcop report repository.
	*
	* @param averageCapacity the average capacity of this vrcop report repository
	*/
	@Override
	public void setAverageCapacity(java.lang.String averageCapacity) {
		_vrcopReportRepository.setAverageCapacity(averageCapacity);
	}

	/**
	* Sets the cop file entry ID of this vrcop report repository.
	*
	* @param COPFileEntryId the cop file entry ID of this vrcop report repository
	*/
	@Override
	public void setCOPFileEntryId(long COPFileEntryId) {
		_vrcopReportRepository.setCOPFileEntryId(COPFileEntryId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrcopReportRepository.setCachedModel(cachedModel);
	}

	/**
	* Sets the circular date of this vrcop report repository.
	*
	* @param circularDate the circular date of this vrcop report repository
	*/
	@Override
	public void setCircularDate(Date circularDate) {
		_vrcopReportRepository.setCircularDate(circularDate);
	}

	/**
	* Sets the circular date2 of this vrcop report repository.
	*
	* @param circularDate2 the circular date2 of this vrcop report repository
	*/
	@Override
	public void setCircularDate2(Date circularDate2) {
		_vrcopReportRepository.setCircularDate2(circularDate2);
	}

	/**
	* Sets the circular no of this vrcop report repository.
	*
	* @param circularNo the circular no of this vrcop report repository
	*/
	@Override
	public void setCircularNo(java.lang.String circularNo) {
		_vrcopReportRepository.setCircularNo(circularNo);
	}

	/**
	* Sets the circular no2 of this vrcop report repository.
	*
	* @param circularNo2 the circular no2 of this vrcop report repository
	*/
	@Override
	public void setCircularNo2(java.lang.String circularNo2) {
		_vrcopReportRepository.setCircularNo2(circularNo2);
	}

	/**
	* Sets the contract equipment of this vrcop report repository.
	*
	* @param contractEquipment the contract equipment of this vrcop report repository
	*/
	@Override
	public void setContractEquipment(java.lang.String contractEquipment) {
		_vrcopReportRepository.setContractEquipment(contractEquipment);
	}

	/**
	* Sets the cop classification of this vrcop report repository.
	*
	* @param copClassification the cop classification of this vrcop report repository
	*/
	@Override
	public void setCopClassification(java.lang.String copClassification) {
		_vrcopReportRepository.setCopClassification(copClassification);
	}

	/**
	* Sets the cop non conformity of this vrcop report repository.
	*
	* @param copNonConformity the cop non conformity of this vrcop report repository
	*/
	@Override
	public void setCopNonConformity(java.lang.String copNonConformity) {
		_vrcopReportRepository.setCopNonConformity(copNonConformity);
	}

	/**
	* Sets the cop report approved date of this vrcop report repository.
	*
	* @param copReportApprovedDate the cop report approved date of this vrcop report repository
	*/
	@Override
	public void setCopReportApprovedDate(Date copReportApprovedDate) {
		_vrcopReportRepository.setCopReportApprovedDate(copReportApprovedDate);
	}

	/**
	* Sets the cop report date of this vrcop report repository.
	*
	* @param copReportDate the cop report date of this vrcop report repository
	*/
	@Override
	public void setCopReportDate(Date copReportDate) {
		_vrcopReportRepository.setCopReportDate(copReportDate);
	}

	/**
	* Sets the cop report expired date of this vrcop report repository.
	*
	* @param copReportExpiredDate the cop report expired date of this vrcop report repository
	*/
	@Override
	public void setCopReportExpiredDate(Date copReportExpiredDate) {
		_vrcopReportRepository.setCopReportExpiredDate(copReportExpiredDate);
	}

	/**
	* Sets the cop report metadata of this vrcop report repository.
	*
	* @param copReportMetadata the cop report metadata of this vrcop report repository
	*/
	@Override
	public void setCopReportMetadata(java.lang.String copReportMetadata) {
		_vrcopReportRepository.setCopReportMetadata(copReportMetadata);
	}

	/**
	* Sets the cop report no of this vrcop report repository.
	*
	* @param copReportNo the cop report no of this vrcop report repository
	*/
	@Override
	public void setCopReportNo(java.lang.String copReportNo) {
		_vrcopReportRepository.setCopReportNo(copReportNo);
	}

	/**
	* Sets the cop report previous date of this vrcop report repository.
	*
	* @param copReportPreviousDate the cop report previous date of this vrcop report repository
	*/
	@Override
	public void setCopReportPreviousDate(Date copReportPreviousDate) {
		_vrcopReportRepository.setCopReportPreviousDate(copReportPreviousDate);
	}

	/**
	* Sets the cop report previous no of this vrcop report repository.
	*
	* @param copReportPreviousNo the cop report previous no of this vrcop report repository
	*/
	@Override
	public void setCopReportPreviousNo(java.lang.String copReportPreviousNo) {
		_vrcopReportRepository.setCopReportPreviousNo(copReportPreviousNo);
	}

	/**
	* Sets the cop report ref date of this vrcop report repository.
	*
	* @param copReportRefDate the cop report ref date of this vrcop report repository
	*/
	@Override
	public void setCopReportRefDate(Date copReportRefDate) {
		_vrcopReportRepository.setCopReportRefDate(copReportRefDate);
	}

	/**
	* Sets the cop report ref no of this vrcop report repository.
	*
	* @param copReportRefNo the cop report ref no of this vrcop report repository
	*/
	@Override
	public void setCopReportRefNo(java.lang.String copReportRefNo) {
		_vrcopReportRepository.setCopReportRefNo(copReportRefNo);
	}

	/**
	* Sets the cop report sign name of this vrcop report repository.
	*
	* @param copReportSignName the cop report sign name of this vrcop report repository
	*/
	@Override
	public void setCopReportSignName(java.lang.String copReportSignName) {
		_vrcopReportRepository.setCopReportSignName(copReportSignName);
	}

	/**
	* Sets the cop report sign place of this vrcop report repository.
	*
	* @param copReportSignPlace the cop report sign place of this vrcop report repository
	*/
	@Override
	public void setCopReportSignPlace(java.lang.String copReportSignPlace) {
		_vrcopReportRepository.setCopReportSignPlace(copReportSignPlace);
	}

	/**
	* Sets the cop report sign title of this vrcop report repository.
	*
	* @param copReportSignTitle the cop report sign title of this vrcop report repository
	*/
	@Override
	public void setCopReportSignTitle(java.lang.String copReportSignTitle) {
		_vrcopReportRepository.setCopReportSignTitle(copReportSignTitle);
	}

	/**
	* Sets the cop report status of this vrcop report repository.
	*
	* @param copReportStatus the cop report status of this vrcop report repository
	*/
	@Override
	public void setCopReportStatus(java.lang.String copReportStatus) {
		_vrcopReportRepository.setCopReportStatus(copReportStatus);
	}

	/**
	* Sets the cop report type of this vrcop report repository.
	*
	* @param copReportType the cop report type of this vrcop report repository
	*/
	@Override
	public void setCopReportType(java.lang.String copReportType) {
		_vrcopReportRepository.setCopReportType(copReportType);
	}

	/**
	* Sets the corporation ID of this vrcop report repository.
	*
	* @param corporationId the corporation ID of this vrcop report repository
	*/
	@Override
	public void setCorporationId(long corporationId) {
		_vrcopReportRepository.setCorporationId(corporationId);
	}

	/**
	* Sets the corporation name of this vrcop report repository.
	*
	* @param corporationName the corporation name of this vrcop report repository
	*/
	@Override
	public void setCorporationName(java.lang.String corporationName) {
		_vrcopReportRepository.setCorporationName(corporationName);
	}

	/**
	* Sets the description of this vrcop report repository.
	*
	* @param description the description of this vrcop report repository
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vrcopReportRepository.setDescription(description);
	}

	/**
	* Sets the dossier ID of this vrcop report repository.
	*
	* @param dossierId the dossier ID of this vrcop report repository
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrcopReportRepository.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vrcop report repository.
	*
	* @param dossierIdCTN the dossier ID ctn of this vrcop report repository
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrcopReportRepository.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vrcop report repository.
	*
	* @param dossierNo the dossier no of this vrcop report repository
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrcopReportRepository.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrcopReportRepository.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrcopReportRepository.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrcopReportRepository.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expired status of this vrcop report repository.
	*
	* @param expiredStatus the expired status of this vrcop report repository
	*/
	@Override
	public void setExpiredStatus(java.lang.String expiredStatus) {
		_vrcopReportRepository.setExpiredStatus(expiredStatus);
	}

	/**
	* Sets the finish product area of this vrcop report repository.
	*
	* @param finishProductArea the finish product area of this vrcop report repository
	*/
	@Override
	public void setFinishProductArea(java.lang.String finishProductArea) {
		_vrcopReportRepository.setFinishProductArea(finishProductArea);
	}

	/**
	* Sets the ID of this vrcop report repository.
	*
	* @param id the ID of this vrcop report repository
	*/
	@Override
	public void setId(long id) {
		_vrcopReportRepository.setId(id);
	}

	/**
	* Sets the importer domestic site of this vrcop report repository.
	*
	* @param importerDomesticSite the importer domestic site of this vrcop report repository
	*/
	@Override
	public void setImporterDomesticSite(java.lang.String importerDomesticSite) {
		_vrcopReportRepository.setImporterDomesticSite(importerDomesticSite);
	}

	/**
	* Sets the importer manufacturer address of this vrcop report repository.
	*
	* @param importerManufacturerAddress the importer manufacturer address of this vrcop report repository
	*/
	@Override
	public void setImporterManufacturerAddress(
		java.lang.String importerManufacturerAddress) {
		_vrcopReportRepository.setImporterManufacturerAddress(importerManufacturerAddress);
	}

	/**
	* Sets the importer manufacturer code of this vrcop report repository.
	*
	* @param importerManufacturerCode the importer manufacturer code of this vrcop report repository
	*/
	@Override
	public void setImporterManufacturerCode(
		java.lang.String importerManufacturerCode) {
		_vrcopReportRepository.setImporterManufacturerCode(importerManufacturerCode);
	}

	/**
	* Sets the importer manufacturer name of this vrcop report repository.
	*
	* @param importerManufacturerName the importer manufacturer name of this vrcop report repository
	*/
	@Override
	public void setImporterManufacturerName(
		java.lang.String importerManufacturerName) {
		_vrcopReportRepository.setImporterManufacturerName(importerManufacturerName);
	}

	/**
	* Sets the inspection audit cycle of this vrcop report repository.
	*
	* @param inspectionAuditCycle the inspection audit cycle of this vrcop report repository
	*/
	@Override
	public void setInspectionAuditCycle(java.lang.String inspectionAuditCycle) {
		_vrcopReportRepository.setInspectionAuditCycle(inspectionAuditCycle);
	}

	/**
	* Sets the inspection date from of this vrcop report repository.
	*
	* @param inspectionDateFrom the inspection date from of this vrcop report repository
	*/
	@Override
	public void setInspectionDateFrom(Date inspectionDateFrom) {
		_vrcopReportRepository.setInspectionDateFrom(inspectionDateFrom);
	}

	/**
	* Sets the inspection date to of this vrcop report repository.
	*
	* @param inspectionDateTo the inspection date to of this vrcop report repository
	*/
	@Override
	public void setInspectionDateTo(Date inspectionDateTo) {
		_vrcopReportRepository.setInspectionDateTo(inspectionDateTo);
	}

	/**
	* Sets the inspection note of this vrcop report repository.
	*
	* @param inspectionNote the inspection note of this vrcop report repository
	*/
	@Override
	public void setInspectionNote(java.lang.String inspectionNote) {
		_vrcopReportRepository.setInspectionNote(inspectionNote);
	}

	/**
	* Sets the inspection record date of this vrcop report repository.
	*
	* @param inspectionRecordDate the inspection record date of this vrcop report repository
	*/
	@Override
	public void setInspectionRecordDate(Date inspectionRecordDate) {
		_vrcopReportRepository.setInspectionRecordDate(inspectionRecordDate);
	}

	/**
	* Sets the inspection record file entry ID of this vrcop report repository.
	*
	* @param inspectionRecordFileEntryId the inspection record file entry ID of this vrcop report repository
	*/
	@Override
	public void setInspectionRecordFileEntryId(long inspectionRecordFileEntryId) {
		_vrcopReportRepository.setInspectionRecordFileEntryId(inspectionRecordFileEntryId);
	}

	/**
	* Sets the inspection record no of this vrcop report repository.
	*
	* @param inspectionRecordNo the inspection record no of this vrcop report repository
	*/
	@Override
	public void setInspectionRecordNo(java.lang.String inspectionRecordNo) {
		_vrcopReportRepository.setInspectionRecordNo(inspectionRecordNo);
	}

	/**
	* Sets the inspection site of this vrcop report repository.
	*
	* @param inspectionSite the inspection site of this vrcop report repository
	*/
	@Override
	public void setInspectionSite(java.lang.String inspectionSite) {
		_vrcopReportRepository.setInspectionSite(inspectionSite);
	}

	/**
	* Sets the inspecto rendor sement date of this vrcop report repository.
	*
	* @param inspectoRendorSementDate the inspecto rendor sement date of this vrcop report repository
	*/
	@Override
	public void setInspectoRendorSementDate(Date inspectoRendorSementDate) {
		_vrcopReportRepository.setInspectoRendorSementDate(inspectoRendorSementDate);
	}

	/**
	* Sets the inspector contact code of this vrcop report repository.
	*
	* @param inspectorContactCode the inspector contact code of this vrcop report repository
	*/
	@Override
	public void setInspectorContactCode(java.lang.String inspectorContactCode) {
		_vrcopReportRepository.setInspectorContactCode(inspectorContactCode);
	}

	/**
	* Sets the inspector deadline of this vrcop report repository.
	*
	* @param inspectorDeadline the inspector deadline of this vrcop report repository
	*/
	@Override
	public void setInspectorDeadline(Date inspectorDeadline) {
		_vrcopReportRepository.setInspectorDeadline(inspectorDeadline);
	}

	/**
	* Sets the inspector ID of this vrcop report repository.
	*
	* @param inspectorId the inspector ID of this vrcop report repository
	*/
	@Override
	public void setInspectorId(long inspectorId) {
		_vrcopReportRepository.setInspectorId(inspectorId);
	}

	/**
	* Sets the inspector name of this vrcop report repository.
	*
	* @param inspectorName the inspector name of this vrcop report repository
	*/
	@Override
	public void setInspectorName(java.lang.String inspectorName) {
		_vrcopReportRepository.setInspectorName(inspectorName);
	}

	/**
	* Sets the machining area of this vrcop report repository.
	*
	* @param machiningArea the machining area of this vrcop report repository
	*/
	@Override
	public void setMachiningArea(java.lang.String machiningArea) {
		_vrcopReportRepository.setMachiningArea(machiningArea);
	}

	/**
	* Sets the manufacturer email of this vrcop report repository.
	*
	* @param manufacturerEmail the manufacturer email of this vrcop report repository
	*/
	@Override
	public void setManufacturerEmail(java.lang.String manufacturerEmail) {
		_vrcopReportRepository.setManufacturerEmail(manufacturerEmail);
	}

	/**
	* Sets the manufacturer fax of this vrcop report repository.
	*
	* @param manufacturerFax the manufacturer fax of this vrcop report repository
	*/
	@Override
	public void setManufacturerFax(java.lang.String manufacturerFax) {
		_vrcopReportRepository.setManufacturerFax(manufacturerFax);
	}

	/**
	* Sets the manufacturer phone of this vrcop report repository.
	*
	* @param manufacturerPhone the manufacturer phone of this vrcop report repository
	*/
	@Override
	public void setManufacturerPhone(java.lang.String manufacturerPhone) {
		_vrcopReportRepository.setManufacturerPhone(manufacturerPhone);
	}

	/**
	* Sets the manufacturer representative of this vrcop report repository.
	*
	* @param manufacturerRepresentative the manufacturer representative of this vrcop report repository
	*/
	@Override
	public void setManufacturerRepresentative(
		java.lang.String manufacturerRepresentative) {
		_vrcopReportRepository.setManufacturerRepresentative(manufacturerRepresentative);
	}

	/**
	* Sets the manufacturer representative title of this vrcop report repository.
	*
	* @param manufacturerRepresentativeTitle the manufacturer representative title of this vrcop report repository
	*/
	@Override
	public void setManufacturerRepresentativeTitle(
		java.lang.String manufacturerRepresentativeTitle) {
		_vrcopReportRepository.setManufacturerRepresentativeTitle(manufacturerRepresentativeTitle);
	}

	/**
	* Sets the markup designer of this vrcop report repository.
	*
	* @param markupDesigner the markup designer of this vrcop report repository
	*/
	@Override
	public void setMarkupDesigner(java.lang.String markupDesigner) {
		_vrcopReportRepository.setMarkupDesigner(markupDesigner);
	}

	/**
	* Sets the markup domestics manufacturer of this vrcop report repository.
	*
	* @param markupDomesticsManufacturer the markup domestics manufacturer of this vrcop report repository
	*/
	@Override
	public void setMarkupDomesticsManufacturer(
		java.lang.String markupDomesticsManufacturer) {
		_vrcopReportRepository.setMarkupDomesticsManufacturer(markupDomesticsManufacturer);
	}

	/**
	* Sets the markup importer of this vrcop report repository.
	*
	* @param markupImporter the markup importer of this vrcop report repository
	*/
	@Override
	public void setMarkupImporter(java.lang.String markupImporter) {
		_vrcopReportRepository.setMarkupImporter(markupImporter);
	}

	/**
	* Sets the markup maintainer of this vrcop report repository.
	*
	* @param markupMaintainer the markup maintainer of this vrcop report repository
	*/
	@Override
	public void setMarkupMaintainer(java.lang.String markupMaintainer) {
		_vrcopReportRepository.setMarkupMaintainer(markupMaintainer);
	}

	/**
	* Sets the markup overseas manufacturer of this vrcop report repository.
	*
	* @param markupOverseasManufacturer the markup overseas manufacturer of this vrcop report repository
	*/
	@Override
	public void setMarkupOverseasManufacturer(
		java.lang.String markupOverseasManufacturer) {
		_vrcopReportRepository.setMarkupOverseasManufacturer(markupOverseasManufacturer);
	}

	/**
	* Sets the max capacity of this vrcop report repository.
	*
	* @param maxCapacity the max capacity of this vrcop report repository
	*/
	@Override
	public void setMaxCapacity(java.lang.String maxCapacity) {
		_vrcopReportRepository.setMaxCapacity(maxCapacity);
	}

	/**
	* Sets the modify date of this vrcop report repository.
	*
	* @param modifyDate the modify date of this vrcop report repository
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrcopReportRepository.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vrcop report repository.
	*
	* @param mtCore the mt core of this vrcop report repository
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrcopReportRepository.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrcopReportRepository.setNew(n);
	}

	/**
	* Sets the number of non conformity of this vrcop report repository.
	*
	* @param numberOfNonConformity the number of non conformity of this vrcop report repository
	*/
	@Override
	public void setNumberOfNonConformity(int numberOfNonConformity) {
		_vrcopReportRepository.setNumberOfNonConformity(numberOfNonConformity);
	}

	/**
	* Sets the number of resolved of this vrcop report repository.
	*
	* @param numberOfResolved the number of resolved of this vrcop report repository
	*/
	@Override
	public void setNumberOfResolved(int numberOfResolved) {
		_vrcopReportRepository.setNumberOfResolved(numberOfResolved);
	}

	/**
	* Sets the observation description of this vrcop report repository.
	*
	* @param observationDescription the observation description of this vrcop report repository
	*/
	@Override
	public void setObservationDescription(
		java.lang.String observationDescription) {
		_vrcopReportRepository.setObservationDescription(observationDescription);
	}

	/**
	* Sets the office square of this vrcop report repository.
	*
	* @param officeSquare the office square of this vrcop report repository
	*/
	@Override
	public void setOfficeSquare(java.lang.String officeSquare) {
		_vrcopReportRepository.setOfficeSquare(officeSquare);
	}

	/**
	* Sets the overseas manufacturer address of this vrcop report repository.
	*
	* @param overseasManufacturerAddress the overseas manufacturer address of this vrcop report repository
	*/
	@Override
	public void setOverseasManufacturerAddress(
		java.lang.String overseasManufacturerAddress) {
		_vrcopReportRepository.setOverseasManufacturerAddress(overseasManufacturerAddress);
	}

	/**
	* Sets the overseas manufacturer code of this vrcop report repository.
	*
	* @param overseasManufacturerCode the overseas manufacturer code of this vrcop report repository
	*/
	@Override
	public void setOverseasManufacturerCode(
		java.lang.String overseasManufacturerCode) {
		_vrcopReportRepository.setOverseasManufacturerCode(overseasManufacturerCode);
	}

	/**
	* Sets the overseas manufacturer name of this vrcop report repository.
	*
	* @param overseasManufacturerName the overseas manufacturer name of this vrcop report repository
	*/
	@Override
	public void setOverseasManufacturerName(
		java.lang.String overseasManufacturerName) {
		_vrcopReportRepository.setOverseasManufacturerName(overseasManufacturerName);
	}

	/**
	* Sets the painting area of this vrcop report repository.
	*
	* @param paintingArea the painting area of this vrcop report repository
	*/
	@Override
	public void setPaintingArea(java.lang.String paintingArea) {
		_vrcopReportRepository.setPaintingArea(paintingArea);
	}

	/**
	* Sets the primary key of this vrcop report repository.
	*
	* @param primaryKey the primary key of this vrcop report repository
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrcopReportRepository.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrcopReportRepository.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product classification description of this vrcop report repository.
	*
	* @param productClassificationDescription the product classification description of this vrcop report repository
	*/
	@Override
	public void setProductClassificationDescription(
		java.lang.String productClassificationDescription) {
		_vrcopReportRepository.setProductClassificationDescription(productClassificationDescription);
	}

	/**
	* Sets the production assemble area of this vrcop report repository.
	*
	* @param productionAssembleArea the production assemble area of this vrcop report repository
	*/
	@Override
	public void setProductionAssembleArea(
		java.lang.String productionAssembleArea) {
		_vrcopReportRepository.setProductionAssembleArea(productionAssembleArea);
	}

	/**
	* Sets the production conformity checking of this vrcop report repository.
	*
	* @param productionConformityChecking the production conformity checking of this vrcop report repository
	*/
	@Override
	public void setProductionConformityChecking(
		java.lang.String productionConformityChecking) {
		_vrcopReportRepository.setProductionConformityChecking(productionConformityChecking);
	}

	/**
	* Sets the production plant address of this vrcop report repository.
	*
	* @param productionPlantAddress the production plant address of this vrcop report repository
	*/
	@Override
	public void setProductionPlantAddress(
		java.lang.String productionPlantAddress) {
		_vrcopReportRepository.setProductionPlantAddress(productionPlantAddress);
	}

	/**
	* Sets the production plant classification of this vrcop report repository.
	*
	* @param productionPlantClassification the production plant classification of this vrcop report repository
	*/
	@Override
	public void setProductionPlantClassification(
		java.lang.String productionPlantClassification) {
		_vrcopReportRepository.setProductionPlantClassification(productionPlantClassification);
	}

	/**
	* Sets the production plant code of this vrcop report repository.
	*
	* @param productionPlantCode the production plant code of this vrcop report repository
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrcopReportRepository.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the production plant email of this vrcop report repository.
	*
	* @param productionPlantEmail the production plant email of this vrcop report repository
	*/
	@Override
	public void setProductionPlantEmail(java.lang.String productionPlantEmail) {
		_vrcopReportRepository.setProductionPlantEmail(productionPlantEmail);
	}

	/**
	* Sets the production plant ID of this vrcop report repository.
	*
	* @param productionPlantId the production plant ID of this vrcop report repository
	*/
	@Override
	public void setProductionPlantId(long productionPlantId) {
		_vrcopReportRepository.setProductionPlantId(productionPlantId);
	}

	/**
	* Sets the production plant name of this vrcop report repository.
	*
	* @param productionPlantName the production plant name of this vrcop report repository
	*/
	@Override
	public void setProductionPlantName(java.lang.String productionPlantName) {
		_vrcopReportRepository.setProductionPlantName(productionPlantName);
	}

	/**
	* Sets the production plant representative of this vrcop report repository.
	*
	* @param productionPlantRepresentative the production plant representative of this vrcop report repository
	*/
	@Override
	public void setProductionPlantRepresentative(
		java.lang.String productionPlantRepresentative) {
		_vrcopReportRepository.setProductionPlantRepresentative(productionPlantRepresentative);
	}

	/**
	* Sets the production plant representative title of this vrcop report repository.
	*
	* @param productionPlantRepresentativeTitle the production plant representative title of this vrcop report repository
	*/
	@Override
	public void setProductionPlantRepresentativeTitle(
		java.lang.String productionPlantRepresentativeTitle) {
		_vrcopReportRepository.setProductionPlantRepresentativeTitle(productionPlantRepresentativeTitle);
	}

	/**
	* Sets the production plant website of this vrcop report repository.
	*
	* @param productionPlantWebsite the production plant website of this vrcop report repository
	*/
	@Override
	public void setProductionPlantWebsite(
		java.lang.String productionPlantWebsite) {
		_vrcopReportRepository.setProductionPlantWebsite(productionPlantWebsite);
	}

	/**
	* Sets the production square of this vrcop report repository.
	*
	* @param productionSquare the production square of this vrcop report repository
	*/
	@Override
	public void setProductionSquare(java.lang.String productionSquare) {
		_vrcopReportRepository.setProductionSquare(productionSquare);
	}

	/**
	* Sets the production stamp checking of this vrcop report repository.
	*
	* @param productionStampChecking the production stamp checking of this vrcop report repository
	*/
	@Override
	public void setProductionStampChecking(
		java.lang.String productionStampChecking) {
		_vrcopReportRepository.setProductionStampChecking(productionStampChecking);
	}

	/**
	* Sets the resolved status of this vrcop report repository.
	*
	* @param resolvedStatus the resolved status of this vrcop report repository
	*/
	@Override
	public void setResolvedStatus(java.lang.String resolvedStatus) {
		_vrcopReportRepository.setResolvedStatus(resolvedStatus);
	}

	/**
	* Sets the self equipment of this vrcop report repository.
	*
	* @param selfEquipment the self equipment of this vrcop report repository
	*/
	@Override
	public void setSelfEquipment(java.lang.String selfEquipment) {
		_vrcopReportRepository.setSelfEquipment(selfEquipment);
	}

	/**
	* Sets the site of city of this vrcop report repository.
	*
	* @param siteOfCity the site of city of this vrcop report repository
	*/
	@Override
	public void setSiteOfCity(java.lang.String siteOfCity) {
		_vrcopReportRepository.setSiteOfCity(siteOfCity);
	}

	/**
	* Sets the site of city code of this vrcop report repository.
	*
	* @param siteOfCityCode the site of city code of this vrcop report repository
	*/
	@Override
	public void setSiteOfCityCode(java.lang.String siteOfCityCode) {
		_vrcopReportRepository.setSiteOfCityCode(siteOfCityCode);
	}

	/**
	* Sets the site of nationality of this vrcop report repository.
	*
	* @param siteOfNationality the site of nationality of this vrcop report repository
	*/
	@Override
	public void setSiteOfNationality(java.lang.String siteOfNationality) {
		_vrcopReportRepository.setSiteOfNationality(siteOfNationality);
	}

	/**
	* Sets the site of nationality code of this vrcop report repository.
	*
	* @param siteOfNationalityCode the site of nationality code of this vrcop report repository
	*/
	@Override
	public void setSiteOfNationalityCode(java.lang.String siteOfNationalityCode) {
		_vrcopReportRepository.setSiteOfNationalityCode(siteOfNationalityCode);
	}

	/**
	* Sets the site of region of this vrcop report repository.
	*
	* @param siteOfRegion the site of region of this vrcop report repository
	*/
	@Override
	public void setSiteOfRegion(java.lang.String siteOfRegion) {
		_vrcopReportRepository.setSiteOfRegion(siteOfRegion);
	}

	/**
	* Sets the site of region code of this vrcop report repository.
	*
	* @param siteOfRegionCode the site of region code of this vrcop report repository
	*/
	@Override
	public void setSiteOfRegionCode(java.lang.String siteOfRegionCode) {
		_vrcopReportRepository.setSiteOfRegionCode(siteOfRegionCode);
	}

	/**
	* Sets the sub inspector of this vrcop report repository.
	*
	* @param subInspector the sub inspector of this vrcop report repository
	*/
	@Override
	public void setSubInspector(java.lang.String subInspector) {
		_vrcopReportRepository.setSubInspector(subInspector);
	}

	/**
	* Sets the sync date of this vrcop report repository.
	*
	* @param syncDate the sync date of this vrcop report repository
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrcopReportRepository.setSyncDate(syncDate);
	}

	/**
	* Sets the testing area of this vrcop report repository.
	*
	* @param testingArea the testing area of this vrcop report repository
	*/
	@Override
	public void setTestingArea(java.lang.String testingArea) {
		_vrcopReportRepository.setTestingArea(testingArea);
	}

	/**
	* Sets the testing equipment checking of this vrcop report repository.
	*
	* @param testingEquipmentChecking the testing equipment checking of this vrcop report repository
	*/
	@Override
	public void setTestingEquipmentChecking(
		java.lang.String testingEquipmentChecking) {
		_vrcopReportRepository.setTestingEquipmentChecking(testingEquipmentChecking);
	}

	/**
	* Sets the total employee of this vrcop report repository.
	*
	* @param totalEmployee the total employee of this vrcop report repository
	*/
	@Override
	public void setTotalEmployee(java.lang.String totalEmployee) {
		_vrcopReportRepository.setTotalEmployee(totalEmployee);
	}

	/**
	* Sets the total manager of this vrcop report repository.
	*
	* @param totalManager the total manager of this vrcop report repository
	*/
	@Override
	public void setTotalManager(java.lang.String totalManager) {
		_vrcopReportRepository.setTotalManager(totalManager);
	}

	/**
	* Sets the total point a of this vrcop report repository.
	*
	* @param totalPointA the total point a of this vrcop report repository
	*/
	@Override
	public void setTotalPointA(int totalPointA) {
		_vrcopReportRepository.setTotalPointA(totalPointA);
	}

	/**
	* Sets the total point b of this vrcop report repository.
	*
	* @param totalPointB the total point b of this vrcop report repository
	*/
	@Override
	public void setTotalPointB(int totalPointB) {
		_vrcopReportRepository.setTotalPointB(totalPointB);
	}

	/**
	* Sets the total point c of this vrcop report repository.
	*
	* @param totalPointC the total point c of this vrcop report repository
	*/
	@Override
	public void setTotalPointC(int totalPointC) {
		_vrcopReportRepository.setTotalPointC(totalPointC);
	}

	/**
	* Sets the total qa employee of this vrcop report repository.
	*
	* @param totalQaEmployee the total qa employee of this vrcop report repository
	*/
	@Override
	public void setTotalQaEmployee(java.lang.String totalQaEmployee) {
		_vrcopReportRepository.setTotalQaEmployee(totalQaEmployee);
	}

	/**
	* Sets the total square meter of this vrcop report repository.
	*
	* @param totalSquareMeter the total square meter of this vrcop report repository
	*/
	@Override
	public void setTotalSquareMeter(java.lang.String totalSquareMeter) {
		_vrcopReportRepository.setTotalSquareMeter(totalSquareMeter);
	}

	/**
	* Sets the total technical of this vrcop report repository.
	*
	* @param totalTechnical the total technical of this vrcop report repository
	*/
	@Override
	public void setTotalTechnical(java.lang.String totalTechnical) {
		_vrcopReportRepository.setTotalTechnical(totalTechnical);
	}

	/**
	* Sets the total worker of this vrcop report repository.
	*
	* @param totalWorker the total worker of this vrcop report repository
	*/
	@Override
	public void setTotalWorker(java.lang.String totalWorker) {
		_vrcopReportRepository.setTotalWorker(totalWorker);
	}

	/**
	* Sets the ware house square of this vrcop report repository.
	*
	* @param wareHouseSquare the ware house square of this vrcop report repository
	*/
	@Override
	public void setWareHouseSquare(java.lang.String wareHouseSquare) {
		_vrcopReportRepository.setWareHouseSquare(wareHouseSquare);
	}

	/**
	* Sets the welding area of this vrcop report repository.
	*
	* @param weldingArea the welding area of this vrcop report repository
	*/
	@Override
	public void setWeldingArea(java.lang.String weldingArea) {
		_vrcopReportRepository.setWeldingArea(weldingArea);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPReportRepositoryWrapper)) {
			return false;
		}

		VRCOPReportRepositoryWrapper vrcopReportRepositoryWrapper = (VRCOPReportRepositoryWrapper)obj;

		if (Objects.equals(_vrcopReportRepository,
					vrcopReportRepositoryWrapper._vrcopReportRepository)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCOPReportRepository getWrappedModel() {
		return _vrcopReportRepository;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrcopReportRepository.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrcopReportRepository.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrcopReportRepository.resetOriginalValues();
	}

	private final VRCOPReportRepository _vrcopReportRepository;
}