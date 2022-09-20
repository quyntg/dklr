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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRCOPReportRepositorySoap implements Serializable {
	public static VRCOPReportRepositorySoap toSoapModel(
		VRCOPReportRepository model) {
		VRCOPReportRepositorySoap soapModel = new VRCOPReportRepositorySoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setApplicantProfileId(model.getApplicantProfileId());
		soapModel.setApplicantCode(model.getApplicantCode());
		soapModel.setApplicantName(model.getApplicantName());
		soapModel.setApplicantAddress(model.getApplicantAddress());
		soapModel.setOverseasManufacturerCode(model.getOverseasManufacturerCode());
		soapModel.setOverseasManufacturerName(model.getOverseasManufacturerName());
		soapModel.setOverseasManufacturerAddress(model.getOverseasManufacturerAddress());
		soapModel.setProductionPlantId(model.getProductionPlantId());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());
		soapModel.setProductionPlantName(model.getProductionPlantName());
		soapModel.setProductionPlantAddress(model.getProductionPlantAddress());
		soapModel.setCopReportNo(model.getCopReportNo());
		soapModel.setCopReportStatus(model.getCopReportStatus());
		soapModel.setCopReportType(model.getCopReportType());
		soapModel.setCopReportMetadata(model.getCopReportMetadata());
		soapModel.setCopReportSignName(model.getCopReportSignName());
		soapModel.setCopReportSignTitle(model.getCopReportSignTitle());
		soapModel.setCopReportSignPlace(model.getCopReportSignPlace());
		soapModel.setCopReportDate(model.getCopReportDate());
		soapModel.setCopReportApprovedDate(model.getCopReportApprovedDate());
		soapModel.setCopReportExpiredDate(model.getCopReportExpiredDate());
		soapModel.setCOPFileEntryId(model.getCOPFileEntryId());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());
		soapModel.setImporterManufacturerCode(model.getImporterManufacturerCode());
		soapModel.setImporterManufacturerName(model.getImporterManufacturerName());
		soapModel.setImporterManufacturerAddress(model.getImporterManufacturerAddress());
		soapModel.setMarkupDomesticsManufacturer(model.getMarkupDomesticsManufacturer());
		soapModel.setMarkupImporter(model.getMarkupImporter());
		soapModel.setCopClassification(model.getCopClassification());
		soapModel.setProductClassificationDescription(model.getProductClassificationDescription());
		soapModel.setTotalPointA(model.getTotalPointA());
		soapModel.setTotalPointB(model.getTotalPointB());
		soapModel.setTotalPointC(model.getTotalPointC());
		soapModel.setCopNonConformity(model.getCopNonConformity());
		soapModel.setInspectionRecordNo(model.getInspectionRecordNo());
		soapModel.setInspectionRecordDate(model.getInspectionRecordDate());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setInspectorId(model.getInspectorId());
		soapModel.setInspectionSite(model.getInspectionSite());
		soapModel.setInspectionDateFrom(model.getInspectionDateFrom());
		soapModel.setInspectionDateTo(model.getInspectionDateTo());
		soapModel.setSubInspector(model.getSubInspector());
		soapModel.setDescription(model.getDescription());
		soapModel.setApplicantRepresentative(model.getApplicantRepresentative());
		soapModel.setApplicantRepresentativeTitle(model.getApplicantRepresentativeTitle());
		soapModel.setInspectionRecordFileEntryId(model.getInspectionRecordFileEntryId());
		soapModel.setCopReportRefNo(model.getCopReportRefNo());
		soapModel.setCopReportRefDate(model.getCopReportRefDate());
		soapModel.setCopReportPreviousNo(model.getCopReportPreviousNo());
		soapModel.setCopReportPreviousDate(model.getCopReportPreviousDate());
		soapModel.setExpiredStatus(model.getExpiredStatus());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setApplicantEmail(model.getApplicantEmail());
		soapModel.setApplicantPhone(model.getApplicantPhone());
		soapModel.setApplicantTelNo(model.getApplicantTelNo());
		soapModel.setApplicantFax(model.getApplicantFax());
		soapModel.setApplicantContactName(model.getApplicantContactName());
		soapModel.setApplicantContactEmail(model.getApplicantContactEmail());
		soapModel.setApplicantContactPhone(model.getApplicantContactPhone());
		soapModel.setApplicantContactTelNo(model.getApplicantContactTelNo());
		soapModel.setApplicantBusinessType(model.getApplicantBusinessType());
		soapModel.setMarkupDesigner(model.getMarkupDesigner());
		soapModel.setMarkupOverseasManufacturer(model.getMarkupOverseasManufacturer());
		soapModel.setMarkupMaintainer(model.getMarkupMaintainer());
		soapModel.setImporterDomesticSite(model.getImporterDomesticSite());
		soapModel.setSiteOfNationality(model.getSiteOfNationality());
		soapModel.setSiteOfNationalityCode(model.getSiteOfNationalityCode());
		soapModel.setSiteOfRegion(model.getSiteOfRegion());
		soapModel.setSiteOfRegionCode(model.getSiteOfRegionCode());
		soapModel.setSiteOfCity(model.getSiteOfCity());
		soapModel.setSiteOfCityCode(model.getSiteOfCityCode());
		soapModel.setManufacturerRepresentative(model.getManufacturerRepresentative());
		soapModel.setManufacturerRepresentativeTitle(model.getManufacturerRepresentativeTitle());
		soapModel.setManufacturerEmail(model.getManufacturerEmail());
		soapModel.setManufacturerPhone(model.getManufacturerPhone());
		soapModel.setManufacturerFax(model.getManufacturerFax());
		soapModel.setProductionPlantEmail(model.getProductionPlantEmail());
		soapModel.setProductionPlantWebsite(model.getProductionPlantWebsite());
		soapModel.setProductionPlantRepresentative(model.getProductionPlantRepresentative());
		soapModel.setProductionPlantRepresentativeTitle(model.getProductionPlantRepresentativeTitle());
		soapModel.setCorporationName(model.getCorporationName());
		soapModel.setInspectorContactCode(model.getInspectorContactCode());
		soapModel.setInspectorName(model.getInspectorName());
		soapModel.setInspectoRendorSementDate(model.getInspectoRendorSementDate());
		soapModel.setInspectorDeadline(model.getInspectorDeadline());
		soapModel.setResolvedStatus(model.getResolvedStatus());
		soapModel.setNumberOfNonConformity(model.getNumberOfNonConformity());
		soapModel.setNumberOfResolved(model.getNumberOfResolved());
		soapModel.setObservationDescription(model.getObservationDescription());
		soapModel.setInspectionAuditCycle(model.getInspectionAuditCycle());
		soapModel.setInspectionNote(model.getInspectionNote());
		soapModel.setProductionConformityChecking(model.getProductionConformityChecking());
		soapModel.setProductionStampChecking(model.getProductionStampChecking());
		soapModel.setTestingEquipmentChecking(model.getTestingEquipmentChecking());
		soapModel.setProductionPlantClassification(model.getProductionPlantClassification());
		soapModel.setActualCapacity(model.getActualCapacity());
		soapModel.setMaxCapacity(model.getMaxCapacity());
		soapModel.setAverageCapacity(model.getAverageCapacity());
		soapModel.setTotalEmployee(model.getTotalEmployee());
		soapModel.setTotalWorker(model.getTotalWorker());
		soapModel.setTotalManager(model.getTotalManager());
		soapModel.setTotalTechnical(model.getTotalTechnical());
		soapModel.setTotalQaEmployee(model.getTotalQaEmployee());
		soapModel.setTotalSquareMeter(model.getTotalSquareMeter());
		soapModel.setWareHouseSquare(model.getWareHouseSquare());
		soapModel.setOfficeSquare(model.getOfficeSquare());
		soapModel.setProductionSquare(model.getProductionSquare());
		soapModel.setMachiningArea(model.getMachiningArea());
		soapModel.setWeldingArea(model.getWeldingArea());
		soapModel.setPaintingArea(model.getPaintingArea());
		soapModel.setProductionAssembleArea(model.getProductionAssembleArea());
		soapModel.setFinishProductArea(model.getFinishProductArea());
		soapModel.setTestingArea(model.getTestingArea());
		soapModel.setSelfEquipment(model.getSelfEquipment());
		soapModel.setContractEquipment(model.getContractEquipment());
		soapModel.setCircularNo(model.getCircularNo());
		soapModel.setCircularDate(model.getCircularDate());
		soapModel.setCircularNo2(model.getCircularNo2());
		soapModel.setCircularDate2(model.getCircularDate2());

		return soapModel;
	}

	public static VRCOPReportRepositorySoap[] toSoapModels(
		VRCOPReportRepository[] models) {
		VRCOPReportRepositorySoap[] soapModels = new VRCOPReportRepositorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRCOPReportRepositorySoap[][] toSoapModels(
		VRCOPReportRepository[][] models) {
		VRCOPReportRepositorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRCOPReportRepositorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRCOPReportRepositorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRCOPReportRepositorySoap[] toSoapModels(
		List<VRCOPReportRepository> models) {
		List<VRCOPReportRepositorySoap> soapModels = new ArrayList<VRCOPReportRepositorySoap>(models.size());

		for (VRCOPReportRepository model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRCOPReportRepositorySoap[soapModels.size()]);
	}

	public VRCOPReportRepositorySoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getMtCore() {
		return _mtCore;
	}

	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	public long getApplicantProfileId() {
		return _applicantProfileId;
	}

	public void setApplicantProfileId(long applicantProfileId) {
		_applicantProfileId = applicantProfileId;
	}

	public String getApplicantCode() {
		return _applicantCode;
	}

	public void setApplicantCode(String applicantCode) {
		_applicantCode = applicantCode;
	}

	public String getApplicantName() {
		return _applicantName;
	}

	public void setApplicantName(String applicantName) {
		_applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return _applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		_applicantAddress = applicantAddress;
	}

	public String getOverseasManufacturerCode() {
		return _overseasManufacturerCode;
	}

	public void setOverseasManufacturerCode(String overseasManufacturerCode) {
		_overseasManufacturerCode = overseasManufacturerCode;
	}

	public String getOverseasManufacturerName() {
		return _overseasManufacturerName;
	}

	public void setOverseasManufacturerName(String overseasManufacturerName) {
		_overseasManufacturerName = overseasManufacturerName;
	}

	public String getOverseasManufacturerAddress() {
		return _overseasManufacturerAddress;
	}

	public void setOverseasManufacturerAddress(
		String overseasManufacturerAddress) {
		_overseasManufacturerAddress = overseasManufacturerAddress;
	}

	public long getProductionPlantId() {
		return _productionPlantId;
	}

	public void setProductionPlantId(long productionPlantId) {
		_productionPlantId = productionPlantId;
	}

	public String getProductionPlantCode() {
		return _productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		_productionPlantCode = productionPlantCode;
	}

	public String getProductionPlantName() {
		return _productionPlantName;
	}

	public void setProductionPlantName(String productionPlantName) {
		_productionPlantName = productionPlantName;
	}

	public String getProductionPlantAddress() {
		return _productionPlantAddress;
	}

	public void setProductionPlantAddress(String productionPlantAddress) {
		_productionPlantAddress = productionPlantAddress;
	}

	public String getCopReportNo() {
		return _copReportNo;
	}

	public void setCopReportNo(String copReportNo) {
		_copReportNo = copReportNo;
	}

	public String getCopReportStatus() {
		return _copReportStatus;
	}

	public void setCopReportStatus(String copReportStatus) {
		_copReportStatus = copReportStatus;
	}

	public String getCopReportType() {
		return _copReportType;
	}

	public void setCopReportType(String copReportType) {
		_copReportType = copReportType;
	}

	public String getCopReportMetadata() {
		return _copReportMetadata;
	}

	public void setCopReportMetadata(String copReportMetadata) {
		_copReportMetadata = copReportMetadata;
	}

	public String getCopReportSignName() {
		return _copReportSignName;
	}

	public void setCopReportSignName(String copReportSignName) {
		_copReportSignName = copReportSignName;
	}

	public String getCopReportSignTitle() {
		return _copReportSignTitle;
	}

	public void setCopReportSignTitle(String copReportSignTitle) {
		_copReportSignTitle = copReportSignTitle;
	}

	public String getCopReportSignPlace() {
		return _copReportSignPlace;
	}

	public void setCopReportSignPlace(String copReportSignPlace) {
		_copReportSignPlace = copReportSignPlace;
	}

	public Date getCopReportDate() {
		return _copReportDate;
	}

	public void setCopReportDate(Date copReportDate) {
		_copReportDate = copReportDate;
	}

	public Date getCopReportApprovedDate() {
		return _copReportApprovedDate;
	}

	public void setCopReportApprovedDate(Date copReportApprovedDate) {
		_copReportApprovedDate = copReportApprovedDate;
	}

	public Date getCopReportExpiredDate() {
		return _copReportExpiredDate;
	}

	public void setCopReportExpiredDate(Date copReportExpiredDate) {
		_copReportExpiredDate = copReportExpiredDate;
	}

	public long getCOPFileEntryId() {
		return _COPFileEntryId;
	}

	public void setCOPFileEntryId(long COPFileEntryId) {
		_COPFileEntryId = COPFileEntryId;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	public String getImporterManufacturerCode() {
		return _importerManufacturerCode;
	}

	public void setImporterManufacturerCode(String importerManufacturerCode) {
		_importerManufacturerCode = importerManufacturerCode;
	}

	public String getImporterManufacturerName() {
		return _importerManufacturerName;
	}

	public void setImporterManufacturerName(String importerManufacturerName) {
		_importerManufacturerName = importerManufacturerName;
	}

	public String getImporterManufacturerAddress() {
		return _importerManufacturerAddress;
	}

	public void setImporterManufacturerAddress(
		String importerManufacturerAddress) {
		_importerManufacturerAddress = importerManufacturerAddress;
	}

	public String getMarkupDomesticsManufacturer() {
		return _markupDomesticsManufacturer;
	}

	public void setMarkupDomesticsManufacturer(
		String markupDomesticsManufacturer) {
		_markupDomesticsManufacturer = markupDomesticsManufacturer;
	}

	public String getMarkupImporter() {
		return _markupImporter;
	}

	public void setMarkupImporter(String markupImporter) {
		_markupImporter = markupImporter;
	}

	public String getCopClassification() {
		return _copClassification;
	}

	public void setCopClassification(String copClassification) {
		_copClassification = copClassification;
	}

	public String getProductClassificationDescription() {
		return _productClassificationDescription;
	}

	public void setProductClassificationDescription(
		String productClassificationDescription) {
		_productClassificationDescription = productClassificationDescription;
	}

	public int getTotalPointA() {
		return _totalPointA;
	}

	public void setTotalPointA(int totalPointA) {
		_totalPointA = totalPointA;
	}

	public int getTotalPointB() {
		return _totalPointB;
	}

	public void setTotalPointB(int totalPointB) {
		_totalPointB = totalPointB;
	}

	public int getTotalPointC() {
		return _totalPointC;
	}

	public void setTotalPointC(int totalPointC) {
		_totalPointC = totalPointC;
	}

	public String getCopNonConformity() {
		return _copNonConformity;
	}

	public void setCopNonConformity(String copNonConformity) {
		_copNonConformity = copNonConformity;
	}

	public String getInspectionRecordNo() {
		return _inspectionRecordNo;
	}

	public void setInspectionRecordNo(String inspectionRecordNo) {
		_inspectionRecordNo = inspectionRecordNo;
	}

	public Date getInspectionRecordDate() {
		return _inspectionRecordDate;
	}

	public void setInspectionRecordDate(Date inspectionRecordDate) {
		_inspectionRecordDate = inspectionRecordDate;
	}

	public long getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(long corporationId) {
		_corporationId = corporationId;
	}

	public long getInspectorId() {
		return _inspectorId;
	}

	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;
	}

	public String getInspectionSite() {
		return _inspectionSite;
	}

	public void setInspectionSite(String inspectionSite) {
		_inspectionSite = inspectionSite;
	}

	public Date getInspectionDateFrom() {
		return _inspectionDateFrom;
	}

	public void setInspectionDateFrom(Date inspectionDateFrom) {
		_inspectionDateFrom = inspectionDateFrom;
	}

	public Date getInspectionDateTo() {
		return _inspectionDateTo;
	}

	public void setInspectionDateTo(Date inspectionDateTo) {
		_inspectionDateTo = inspectionDateTo;
	}

	public String getSubInspector() {
		return _subInspector;
	}

	public void setSubInspector(String subInspector) {
		_subInspector = subInspector;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getApplicantRepresentative() {
		return _applicantRepresentative;
	}

	public void setApplicantRepresentative(String applicantRepresentative) {
		_applicantRepresentative = applicantRepresentative;
	}

	public String getApplicantRepresentativeTitle() {
		return _applicantRepresentativeTitle;
	}

	public void setApplicantRepresentativeTitle(
		String applicantRepresentativeTitle) {
		_applicantRepresentativeTitle = applicantRepresentativeTitle;
	}

	public long getInspectionRecordFileEntryId() {
		return _inspectionRecordFileEntryId;
	}

	public void setInspectionRecordFileEntryId(long inspectionRecordFileEntryId) {
		_inspectionRecordFileEntryId = inspectionRecordFileEntryId;
	}

	public String getCopReportRefNo() {
		return _copReportRefNo;
	}

	public void setCopReportRefNo(String copReportRefNo) {
		_copReportRefNo = copReportRefNo;
	}

	public Date getCopReportRefDate() {
		return _copReportRefDate;
	}

	public void setCopReportRefDate(Date copReportRefDate) {
		_copReportRefDate = copReportRefDate;
	}

	public String getCopReportPreviousNo() {
		return _copReportPreviousNo;
	}

	public void setCopReportPreviousNo(String copReportPreviousNo) {
		_copReportPreviousNo = copReportPreviousNo;
	}

	public Date getCopReportPreviousDate() {
		return _copReportPreviousDate;
	}

	public void setCopReportPreviousDate(Date copReportPreviousDate) {
		_copReportPreviousDate = copReportPreviousDate;
	}

	public String getExpiredStatus() {
		return _expiredStatus;
	}

	public void setExpiredStatus(String expiredStatus) {
		_expiredStatus = expiredStatus;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getDossierIdCTN() {
		return _dossierIdCTN;
	}

	public void setDossierIdCTN(String dossierIdCTN) {
		_dossierIdCTN = dossierIdCTN;
	}

	public String getDossierNo() {
		return _dossierNo;
	}

	public void setDossierNo(String dossierNo) {
		_dossierNo = dossierNo;
	}

	public String getApplicantEmail() {
		return _applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		_applicantEmail = applicantEmail;
	}

	public String getApplicantPhone() {
		return _applicantPhone;
	}

	public void setApplicantPhone(String applicantPhone) {
		_applicantPhone = applicantPhone;
	}

	public String getApplicantTelNo() {
		return _applicantTelNo;
	}

	public void setApplicantTelNo(String applicantTelNo) {
		_applicantTelNo = applicantTelNo;
	}

	public String getApplicantFax() {
		return _applicantFax;
	}

	public void setApplicantFax(String applicantFax) {
		_applicantFax = applicantFax;
	}

	public String getApplicantContactName() {
		return _applicantContactName;
	}

	public void setApplicantContactName(String applicantContactName) {
		_applicantContactName = applicantContactName;
	}

	public String getApplicantContactEmail() {
		return _applicantContactEmail;
	}

	public void setApplicantContactEmail(String applicantContactEmail) {
		_applicantContactEmail = applicantContactEmail;
	}

	public String getApplicantContactPhone() {
		return _applicantContactPhone;
	}

	public void setApplicantContactPhone(String applicantContactPhone) {
		_applicantContactPhone = applicantContactPhone;
	}

	public String getApplicantContactTelNo() {
		return _applicantContactTelNo;
	}

	public void setApplicantContactTelNo(String applicantContactTelNo) {
		_applicantContactTelNo = applicantContactTelNo;
	}

	public String getApplicantBusinessType() {
		return _applicantBusinessType;
	}

	public void setApplicantBusinessType(String applicantBusinessType) {
		_applicantBusinessType = applicantBusinessType;
	}

	public String getMarkupDesigner() {
		return _markupDesigner;
	}

	public void setMarkupDesigner(String markupDesigner) {
		_markupDesigner = markupDesigner;
	}

	public String getMarkupOverseasManufacturer() {
		return _markupOverseasManufacturer;
	}

	public void setMarkupOverseasManufacturer(String markupOverseasManufacturer) {
		_markupOverseasManufacturer = markupOverseasManufacturer;
	}

	public String getMarkupMaintainer() {
		return _markupMaintainer;
	}

	public void setMarkupMaintainer(String markupMaintainer) {
		_markupMaintainer = markupMaintainer;
	}

	public String getImporterDomesticSite() {
		return _importerDomesticSite;
	}

	public void setImporterDomesticSite(String importerDomesticSite) {
		_importerDomesticSite = importerDomesticSite;
	}

	public String getSiteOfNationality() {
		return _siteOfNationality;
	}

	public void setSiteOfNationality(String siteOfNationality) {
		_siteOfNationality = siteOfNationality;
	}

	public String getSiteOfNationalityCode() {
		return _siteOfNationalityCode;
	}

	public void setSiteOfNationalityCode(String siteOfNationalityCode) {
		_siteOfNationalityCode = siteOfNationalityCode;
	}

	public String getSiteOfRegion() {
		return _siteOfRegion;
	}

	public void setSiteOfRegion(String siteOfRegion) {
		_siteOfRegion = siteOfRegion;
	}

	public String getSiteOfRegionCode() {
		return _siteOfRegionCode;
	}

	public void setSiteOfRegionCode(String siteOfRegionCode) {
		_siteOfRegionCode = siteOfRegionCode;
	}

	public String getSiteOfCity() {
		return _siteOfCity;
	}

	public void setSiteOfCity(String siteOfCity) {
		_siteOfCity = siteOfCity;
	}

	public String getSiteOfCityCode() {
		return _siteOfCityCode;
	}

	public void setSiteOfCityCode(String siteOfCityCode) {
		_siteOfCityCode = siteOfCityCode;
	}

	public String getManufacturerRepresentative() {
		return _manufacturerRepresentative;
	}

	public void setManufacturerRepresentative(String manufacturerRepresentative) {
		_manufacturerRepresentative = manufacturerRepresentative;
	}

	public String getManufacturerRepresentativeTitle() {
		return _manufacturerRepresentativeTitle;
	}

	public void setManufacturerRepresentativeTitle(
		String manufacturerRepresentativeTitle) {
		_manufacturerRepresentativeTitle = manufacturerRepresentativeTitle;
	}

	public String getManufacturerEmail() {
		return _manufacturerEmail;
	}

	public void setManufacturerEmail(String manufacturerEmail) {
		_manufacturerEmail = manufacturerEmail;
	}

	public String getManufacturerPhone() {
		return _manufacturerPhone;
	}

	public void setManufacturerPhone(String manufacturerPhone) {
		_manufacturerPhone = manufacturerPhone;
	}

	public String getManufacturerFax() {
		return _manufacturerFax;
	}

	public void setManufacturerFax(String manufacturerFax) {
		_manufacturerFax = manufacturerFax;
	}

	public String getProductionPlantEmail() {
		return _productionPlantEmail;
	}

	public void setProductionPlantEmail(String productionPlantEmail) {
		_productionPlantEmail = productionPlantEmail;
	}

	public String getProductionPlantWebsite() {
		return _productionPlantWebsite;
	}

	public void setProductionPlantWebsite(String productionPlantWebsite) {
		_productionPlantWebsite = productionPlantWebsite;
	}

	public String getProductionPlantRepresentative() {
		return _productionPlantRepresentative;
	}

	public void setProductionPlantRepresentative(
		String productionPlantRepresentative) {
		_productionPlantRepresentative = productionPlantRepresentative;
	}

	public String getProductionPlantRepresentativeTitle() {
		return _productionPlantRepresentativeTitle;
	}

	public void setProductionPlantRepresentativeTitle(
		String productionPlantRepresentativeTitle) {
		_productionPlantRepresentativeTitle = productionPlantRepresentativeTitle;
	}

	public String getCorporationName() {
		return _corporationName;
	}

	public void setCorporationName(String corporationName) {
		_corporationName = corporationName;
	}

	public String getInspectorContactCode() {
		return _inspectorContactCode;
	}

	public void setInspectorContactCode(String inspectorContactCode) {
		_inspectorContactCode = inspectorContactCode;
	}

	public String getInspectorName() {
		return _inspectorName;
	}

	public void setInspectorName(String inspectorName) {
		_inspectorName = inspectorName;
	}

	public Date getInspectoRendorSementDate() {
		return _inspectoRendorSementDate;
	}

	public void setInspectoRendorSementDate(Date inspectoRendorSementDate) {
		_inspectoRendorSementDate = inspectoRendorSementDate;
	}

	public Date getInspectorDeadline() {
		return _inspectorDeadline;
	}

	public void setInspectorDeadline(Date inspectorDeadline) {
		_inspectorDeadline = inspectorDeadline;
	}

	public String getResolvedStatus() {
		return _resolvedStatus;
	}

	public void setResolvedStatus(String resolvedStatus) {
		_resolvedStatus = resolvedStatus;
	}

	public int getNumberOfNonConformity() {
		return _numberOfNonConformity;
	}

	public void setNumberOfNonConformity(int numberOfNonConformity) {
		_numberOfNonConformity = numberOfNonConformity;
	}

	public int getNumberOfResolved() {
		return _numberOfResolved;
	}

	public void setNumberOfResolved(int numberOfResolved) {
		_numberOfResolved = numberOfResolved;
	}

	public String getObservationDescription() {
		return _observationDescription;
	}

	public void setObservationDescription(String observationDescription) {
		_observationDescription = observationDescription;
	}

	public String getInspectionAuditCycle() {
		return _inspectionAuditCycle;
	}

	public void setInspectionAuditCycle(String inspectionAuditCycle) {
		_inspectionAuditCycle = inspectionAuditCycle;
	}

	public String getInspectionNote() {
		return _inspectionNote;
	}

	public void setInspectionNote(String inspectionNote) {
		_inspectionNote = inspectionNote;
	}

	public String getProductionConformityChecking() {
		return _productionConformityChecking;
	}

	public void setProductionConformityChecking(
		String productionConformityChecking) {
		_productionConformityChecking = productionConformityChecking;
	}

	public String getProductionStampChecking() {
		return _productionStampChecking;
	}

	public void setProductionStampChecking(String productionStampChecking) {
		_productionStampChecking = productionStampChecking;
	}

	public String getTestingEquipmentChecking() {
		return _testingEquipmentChecking;
	}

	public void setTestingEquipmentChecking(String testingEquipmentChecking) {
		_testingEquipmentChecking = testingEquipmentChecking;
	}

	public String getProductionPlantClassification() {
		return _productionPlantClassification;
	}

	public void setProductionPlantClassification(
		String productionPlantClassification) {
		_productionPlantClassification = productionPlantClassification;
	}

	public String getActualCapacity() {
		return _actualCapacity;
	}

	public void setActualCapacity(String actualCapacity) {
		_actualCapacity = actualCapacity;
	}

	public String getMaxCapacity() {
		return _maxCapacity;
	}

	public void setMaxCapacity(String maxCapacity) {
		_maxCapacity = maxCapacity;
	}

	public String getAverageCapacity() {
		return _averageCapacity;
	}

	public void setAverageCapacity(String averageCapacity) {
		_averageCapacity = averageCapacity;
	}

	public String getTotalEmployee() {
		return _totalEmployee;
	}

	public void setTotalEmployee(String totalEmployee) {
		_totalEmployee = totalEmployee;
	}

	public String getTotalWorker() {
		return _totalWorker;
	}

	public void setTotalWorker(String totalWorker) {
		_totalWorker = totalWorker;
	}

	public String getTotalManager() {
		return _totalManager;
	}

	public void setTotalManager(String totalManager) {
		_totalManager = totalManager;
	}

	public String getTotalTechnical() {
		return _totalTechnical;
	}

	public void setTotalTechnical(String totalTechnical) {
		_totalTechnical = totalTechnical;
	}

	public String getTotalQaEmployee() {
		return _totalQaEmployee;
	}

	public void setTotalQaEmployee(String totalQaEmployee) {
		_totalQaEmployee = totalQaEmployee;
	}

	public String getTotalSquareMeter() {
		return _totalSquareMeter;
	}

	public void setTotalSquareMeter(String totalSquareMeter) {
		_totalSquareMeter = totalSquareMeter;
	}

	public String getWareHouseSquare() {
		return _wareHouseSquare;
	}

	public void setWareHouseSquare(String wareHouseSquare) {
		_wareHouseSquare = wareHouseSquare;
	}

	public String getOfficeSquare() {
		return _officeSquare;
	}

	public void setOfficeSquare(String officeSquare) {
		_officeSquare = officeSquare;
	}

	public String getProductionSquare() {
		return _productionSquare;
	}

	public void setProductionSquare(String productionSquare) {
		_productionSquare = productionSquare;
	}

	public String getMachiningArea() {
		return _machiningArea;
	}

	public void setMachiningArea(String machiningArea) {
		_machiningArea = machiningArea;
	}

	public String getWeldingArea() {
		return _weldingArea;
	}

	public void setWeldingArea(String weldingArea) {
		_weldingArea = weldingArea;
	}

	public String getPaintingArea() {
		return _paintingArea;
	}

	public void setPaintingArea(String paintingArea) {
		_paintingArea = paintingArea;
	}

	public String getProductionAssembleArea() {
		return _productionAssembleArea;
	}

	public void setProductionAssembleArea(String productionAssembleArea) {
		_productionAssembleArea = productionAssembleArea;
	}

	public String getFinishProductArea() {
		return _finishProductArea;
	}

	public void setFinishProductArea(String finishProductArea) {
		_finishProductArea = finishProductArea;
	}

	public String getTestingArea() {
		return _testingArea;
	}

	public void setTestingArea(String testingArea) {
		_testingArea = testingArea;
	}

	public String getSelfEquipment() {
		return _selfEquipment;
	}

	public void setSelfEquipment(String selfEquipment) {
		_selfEquipment = selfEquipment;
	}

	public String getContractEquipment() {
		return _contractEquipment;
	}

	public void setContractEquipment(String contractEquipment) {
		_contractEquipment = contractEquipment;
	}

	public String getCircularNo() {
		return _circularNo;
	}

	public void setCircularNo(String circularNo) {
		_circularNo = circularNo;
	}

	public Date getCircularDate() {
		return _circularDate;
	}

	public void setCircularDate(Date circularDate) {
		_circularDate = circularDate;
	}

	public String getCircularNo2() {
		return _circularNo2;
	}

	public void setCircularNo2(String circularNo2) {
		_circularNo2 = circularNo2;
	}

	public Date getCircularDate2() {
		return _circularDate2;
	}

	public void setCircularDate2(Date circularDate2) {
		_circularDate2 = circularDate2;
	}

	private long _id;
	private long _mtCore;
	private long _applicantProfileId;
	private String _applicantCode;
	private String _applicantName;
	private String _applicantAddress;
	private String _overseasManufacturerCode;
	private String _overseasManufacturerName;
	private String _overseasManufacturerAddress;
	private long _productionPlantId;
	private String _productionPlantCode;
	private String _productionPlantName;
	private String _productionPlantAddress;
	private String _copReportNo;
	private String _copReportStatus;
	private String _copReportType;
	private String _copReportMetadata;
	private String _copReportSignName;
	private String _copReportSignTitle;
	private String _copReportSignPlace;
	private Date _copReportDate;
	private Date _copReportApprovedDate;
	private Date _copReportExpiredDate;
	private long _COPFileEntryId;
	private Date _modifyDate;
	private Date _syncDate;
	private String _importerManufacturerCode;
	private String _importerManufacturerName;
	private String _importerManufacturerAddress;
	private String _markupDomesticsManufacturer;
	private String _markupImporter;
	private String _copClassification;
	private String _productClassificationDescription;
	private int _totalPointA;
	private int _totalPointB;
	private int _totalPointC;
	private String _copNonConformity;
	private String _inspectionRecordNo;
	private Date _inspectionRecordDate;
	private long _corporationId;
	private long _inspectorId;
	private String _inspectionSite;
	private Date _inspectionDateFrom;
	private Date _inspectionDateTo;
	private String _subInspector;
	private String _description;
	private String _applicantRepresentative;
	private String _applicantRepresentativeTitle;
	private long _inspectionRecordFileEntryId;
	private String _copReportRefNo;
	private Date _copReportRefDate;
	private String _copReportPreviousNo;
	private Date _copReportPreviousDate;
	private String _expiredStatus;
	private long _dossierId;
	private String _dossierIdCTN;
	private String _dossierNo;
	private String _applicantEmail;
	private String _applicantPhone;
	private String _applicantTelNo;
	private String _applicantFax;
	private String _applicantContactName;
	private String _applicantContactEmail;
	private String _applicantContactPhone;
	private String _applicantContactTelNo;
	private String _applicantBusinessType;
	private String _markupDesigner;
	private String _markupOverseasManufacturer;
	private String _markupMaintainer;
	private String _importerDomesticSite;
	private String _siteOfNationality;
	private String _siteOfNationalityCode;
	private String _siteOfRegion;
	private String _siteOfRegionCode;
	private String _siteOfCity;
	private String _siteOfCityCode;
	private String _manufacturerRepresentative;
	private String _manufacturerRepresentativeTitle;
	private String _manufacturerEmail;
	private String _manufacturerPhone;
	private String _manufacturerFax;
	private String _productionPlantEmail;
	private String _productionPlantWebsite;
	private String _productionPlantRepresentative;
	private String _productionPlantRepresentativeTitle;
	private String _corporationName;
	private String _inspectorContactCode;
	private String _inspectorName;
	private Date _inspectoRendorSementDate;
	private Date _inspectorDeadline;
	private String _resolvedStatus;
	private int _numberOfNonConformity;
	private int _numberOfResolved;
	private String _observationDescription;
	private String _inspectionAuditCycle;
	private String _inspectionNote;
	private String _productionConformityChecking;
	private String _productionStampChecking;
	private String _testingEquipmentChecking;
	private String _productionPlantClassification;
	private String _actualCapacity;
	private String _maxCapacity;
	private String _averageCapacity;
	private String _totalEmployee;
	private String _totalWorker;
	private String _totalManager;
	private String _totalTechnical;
	private String _totalQaEmployee;
	private String _totalSquareMeter;
	private String _wareHouseSquare;
	private String _officeSquare;
	private String _productionSquare;
	private String _machiningArea;
	private String _weldingArea;
	private String _paintingArea;
	private String _productionAssembleArea;
	private String _finishProductArea;
	private String _testingArea;
	private String _selfEquipment;
	private String _contractEquipment;
	private String _circularNo;
	private Date _circularDate;
	private String _circularNo2;
	private Date _circularDate2;
}