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

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRCOPReportRepository;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VRCOPReportRepository in entity cache.
 *
 * @author LamTV
 * @see VRCOPReportRepository
 * @generated
 */
@ProviderType
public class VRCOPReportRepositoryCacheModel implements CacheModel<VRCOPReportRepository>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPReportRepositoryCacheModel)) {
			return false;
		}

		VRCOPReportRepositoryCacheModel vrcopReportRepositoryCacheModel = (VRCOPReportRepositoryCacheModel)obj;

		if (id == vrcopReportRepositoryCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(249);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", applicantProfileId=");
		sb.append(applicantProfileId);
		sb.append(", applicantCode=");
		sb.append(applicantCode);
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", applicantAddress=");
		sb.append(applicantAddress);
		sb.append(", overseasManufacturerCode=");
		sb.append(overseasManufacturerCode);
		sb.append(", overseasManufacturerName=");
		sb.append(overseasManufacturerName);
		sb.append(", overseasManufacturerAddress=");
		sb.append(overseasManufacturerAddress);
		sb.append(", productionPlantId=");
		sb.append(productionPlantId);
		sb.append(", productionPlantCode=");
		sb.append(productionPlantCode);
		sb.append(", productionPlantName=");
		sb.append(productionPlantName);
		sb.append(", productionPlantAddress=");
		sb.append(productionPlantAddress);
		sb.append(", copReportNo=");
		sb.append(copReportNo);
		sb.append(", copReportStatus=");
		sb.append(copReportStatus);
		sb.append(", copReportType=");
		sb.append(copReportType);
		sb.append(", copReportMetadata=");
		sb.append(copReportMetadata);
		sb.append(", copReportSignName=");
		sb.append(copReportSignName);
		sb.append(", copReportSignTitle=");
		sb.append(copReportSignTitle);
		sb.append(", copReportSignPlace=");
		sb.append(copReportSignPlace);
		sb.append(", copReportDate=");
		sb.append(copReportDate);
		sb.append(", copReportApprovedDate=");
		sb.append(copReportApprovedDate);
		sb.append(", copReportExpiredDate=");
		sb.append(copReportExpiredDate);
		sb.append(", COPFileEntryId=");
		sb.append(COPFileEntryId);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append(", importerManufacturerCode=");
		sb.append(importerManufacturerCode);
		sb.append(", importerManufacturerName=");
		sb.append(importerManufacturerName);
		sb.append(", importerManufacturerAddress=");
		sb.append(importerManufacturerAddress);
		sb.append(", markupDomesticsManufacturer=");
		sb.append(markupDomesticsManufacturer);
		sb.append(", markupImporter=");
		sb.append(markupImporter);
		sb.append(", copClassification=");
		sb.append(copClassification);
		sb.append(", productClassificationDescription=");
		sb.append(productClassificationDescription);
		sb.append(", totalPointA=");
		sb.append(totalPointA);
		sb.append(", totalPointB=");
		sb.append(totalPointB);
		sb.append(", totalPointC=");
		sb.append(totalPointC);
		sb.append(", copNonConformity=");
		sb.append(copNonConformity);
		sb.append(", inspectionRecordNo=");
		sb.append(inspectionRecordNo);
		sb.append(", inspectionRecordDate=");
		sb.append(inspectionRecordDate);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", inspectorId=");
		sb.append(inspectorId);
		sb.append(", inspectionSite=");
		sb.append(inspectionSite);
		sb.append(", inspectionDateFrom=");
		sb.append(inspectionDateFrom);
		sb.append(", inspectionDateTo=");
		sb.append(inspectionDateTo);
		sb.append(", subInspector=");
		sb.append(subInspector);
		sb.append(", description=");
		sb.append(description);
		sb.append(", applicantRepresentative=");
		sb.append(applicantRepresentative);
		sb.append(", applicantRepresentativeTitle=");
		sb.append(applicantRepresentativeTitle);
		sb.append(", inspectionRecordFileEntryId=");
		sb.append(inspectionRecordFileEntryId);
		sb.append(", copReportRefNo=");
		sb.append(copReportRefNo);
		sb.append(", copReportRefDate=");
		sb.append(copReportRefDate);
		sb.append(", copReportPreviousNo=");
		sb.append(copReportPreviousNo);
		sb.append(", copReportPreviousDate=");
		sb.append(copReportPreviousDate);
		sb.append(", expiredStatus=");
		sb.append(expiredStatus);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierIdCTN=");
		sb.append(dossierIdCTN);
		sb.append(", dossierNo=");
		sb.append(dossierNo);
		sb.append(", applicantEmail=");
		sb.append(applicantEmail);
		sb.append(", applicantPhone=");
		sb.append(applicantPhone);
		sb.append(", applicantTelNo=");
		sb.append(applicantTelNo);
		sb.append(", applicantFax=");
		sb.append(applicantFax);
		sb.append(", applicantContactName=");
		sb.append(applicantContactName);
		sb.append(", applicantContactEmail=");
		sb.append(applicantContactEmail);
		sb.append(", applicantContactPhone=");
		sb.append(applicantContactPhone);
		sb.append(", applicantContactTelNo=");
		sb.append(applicantContactTelNo);
		sb.append(", applicantBusinessType=");
		sb.append(applicantBusinessType);
		sb.append(", markupDesigner=");
		sb.append(markupDesigner);
		sb.append(", markupOverseasManufacturer=");
		sb.append(markupOverseasManufacturer);
		sb.append(", markupMaintainer=");
		sb.append(markupMaintainer);
		sb.append(", importerDomesticSite=");
		sb.append(importerDomesticSite);
		sb.append(", siteOfNationality=");
		sb.append(siteOfNationality);
		sb.append(", siteOfNationalityCode=");
		sb.append(siteOfNationalityCode);
		sb.append(", siteOfRegion=");
		sb.append(siteOfRegion);
		sb.append(", siteOfRegionCode=");
		sb.append(siteOfRegionCode);
		sb.append(", siteOfCity=");
		sb.append(siteOfCity);
		sb.append(", siteOfCityCode=");
		sb.append(siteOfCityCode);
		sb.append(", manufacturerRepresentative=");
		sb.append(manufacturerRepresentative);
		sb.append(", manufacturerRepresentativeTitle=");
		sb.append(manufacturerRepresentativeTitle);
		sb.append(", manufacturerEmail=");
		sb.append(manufacturerEmail);
		sb.append(", manufacturerPhone=");
		sb.append(manufacturerPhone);
		sb.append(", manufacturerFax=");
		sb.append(manufacturerFax);
		sb.append(", productionPlantEmail=");
		sb.append(productionPlantEmail);
		sb.append(", productionPlantWebsite=");
		sb.append(productionPlantWebsite);
		sb.append(", productionPlantRepresentative=");
		sb.append(productionPlantRepresentative);
		sb.append(", productionPlantRepresentativeTitle=");
		sb.append(productionPlantRepresentativeTitle);
		sb.append(", corporationName=");
		sb.append(corporationName);
		sb.append(", inspectorContactCode=");
		sb.append(inspectorContactCode);
		sb.append(", inspectorName=");
		sb.append(inspectorName);
		sb.append(", inspectoRendorSementDate=");
		sb.append(inspectoRendorSementDate);
		sb.append(", inspectorDeadline=");
		sb.append(inspectorDeadline);
		sb.append(", resolvedStatus=");
		sb.append(resolvedStatus);
		sb.append(", numberOfNonConformity=");
		sb.append(numberOfNonConformity);
		sb.append(", numberOfResolved=");
		sb.append(numberOfResolved);
		sb.append(", observationDescription=");
		sb.append(observationDescription);
		sb.append(", inspectionAuditCycle=");
		sb.append(inspectionAuditCycle);
		sb.append(", inspectionNote=");
		sb.append(inspectionNote);
		sb.append(", productionConformityChecking=");
		sb.append(productionConformityChecking);
		sb.append(", productionStampChecking=");
		sb.append(productionStampChecking);
		sb.append(", testingEquipmentChecking=");
		sb.append(testingEquipmentChecking);
		sb.append(", productionPlantClassification=");
		sb.append(productionPlantClassification);
		sb.append(", actualCapacity=");
		sb.append(actualCapacity);
		sb.append(", maxCapacity=");
		sb.append(maxCapacity);
		sb.append(", averageCapacity=");
		sb.append(averageCapacity);
		sb.append(", totalEmployee=");
		sb.append(totalEmployee);
		sb.append(", totalWorker=");
		sb.append(totalWorker);
		sb.append(", totalManager=");
		sb.append(totalManager);
		sb.append(", totalTechnical=");
		sb.append(totalTechnical);
		sb.append(", totalQaEmployee=");
		sb.append(totalQaEmployee);
		sb.append(", totalSquareMeter=");
		sb.append(totalSquareMeter);
		sb.append(", wareHouseSquare=");
		sb.append(wareHouseSquare);
		sb.append(", officeSquare=");
		sb.append(officeSquare);
		sb.append(", productionSquare=");
		sb.append(productionSquare);
		sb.append(", machiningArea=");
		sb.append(machiningArea);
		sb.append(", weldingArea=");
		sb.append(weldingArea);
		sb.append(", paintingArea=");
		sb.append(paintingArea);
		sb.append(", productionAssembleArea=");
		sb.append(productionAssembleArea);
		sb.append(", finishProductArea=");
		sb.append(finishProductArea);
		sb.append(", testingArea=");
		sb.append(testingArea);
		sb.append(", selfEquipment=");
		sb.append(selfEquipment);
		sb.append(", contractEquipment=");
		sb.append(contractEquipment);
		sb.append(", circularNo=");
		sb.append(circularNo);
		sb.append(", circularDate=");
		sb.append(circularDate);
		sb.append(", circularNo2=");
		sb.append(circularNo2);
		sb.append(", circularDate2=");
		sb.append(circularDate2);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCOPReportRepository toEntityModel() {
		VRCOPReportRepositoryImpl vrcopReportRepositoryImpl = new VRCOPReportRepositoryImpl();

		vrcopReportRepositoryImpl.setId(id);
		vrcopReportRepositoryImpl.setMtCore(mtCore);
		vrcopReportRepositoryImpl.setApplicantProfileId(applicantProfileId);

		if (applicantCode == null) {
			vrcopReportRepositoryImpl.setApplicantCode(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantCode(applicantCode);
		}

		if (applicantName == null) {
			vrcopReportRepositoryImpl.setApplicantName(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantName(applicantName);
		}

		if (applicantAddress == null) {
			vrcopReportRepositoryImpl.setApplicantAddress(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantAddress(applicantAddress);
		}

		if (overseasManufacturerCode == null) {
			vrcopReportRepositoryImpl.setOverseasManufacturerCode(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setOverseasManufacturerCode(overseasManufacturerCode);
		}

		if (overseasManufacturerName == null) {
			vrcopReportRepositoryImpl.setOverseasManufacturerName(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setOverseasManufacturerName(overseasManufacturerName);
		}

		if (overseasManufacturerAddress == null) {
			vrcopReportRepositoryImpl.setOverseasManufacturerAddress(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setOverseasManufacturerAddress(overseasManufacturerAddress);
		}

		vrcopReportRepositoryImpl.setProductionPlantId(productionPlantId);

		if (productionPlantCode == null) {
			vrcopReportRepositoryImpl.setProductionPlantCode(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionPlantCode(productionPlantCode);
		}

		if (productionPlantName == null) {
			vrcopReportRepositoryImpl.setProductionPlantName(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionPlantName(productionPlantName);
		}

		if (productionPlantAddress == null) {
			vrcopReportRepositoryImpl.setProductionPlantAddress(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionPlantAddress(productionPlantAddress);
		}

		if (copReportNo == null) {
			vrcopReportRepositoryImpl.setCopReportNo(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportNo(copReportNo);
		}

		if (copReportStatus == null) {
			vrcopReportRepositoryImpl.setCopReportStatus(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportStatus(copReportStatus);
		}

		if (copReportType == null) {
			vrcopReportRepositoryImpl.setCopReportType(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportType(copReportType);
		}

		if (copReportMetadata == null) {
			vrcopReportRepositoryImpl.setCopReportMetadata(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportMetadata(copReportMetadata);
		}

		if (copReportSignName == null) {
			vrcopReportRepositoryImpl.setCopReportSignName(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportSignName(copReportSignName);
		}

		if (copReportSignTitle == null) {
			vrcopReportRepositoryImpl.setCopReportSignTitle(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportSignTitle(copReportSignTitle);
		}

		if (copReportSignPlace == null) {
			vrcopReportRepositoryImpl.setCopReportSignPlace(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportSignPlace(copReportSignPlace);
		}

		if (copReportDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCopReportDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportDate(new Date(copReportDate));
		}

		if (copReportApprovedDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCopReportApprovedDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportApprovedDate(new Date(
					copReportApprovedDate));
		}

		if (copReportExpiredDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCopReportExpiredDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportExpiredDate(new Date(
					copReportExpiredDate));
		}

		vrcopReportRepositoryImpl.setCOPFileEntryId(COPFileEntryId);

		if (modifyDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setModifyDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setSyncDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setSyncDate(new Date(syncDate));
		}

		if (importerManufacturerCode == null) {
			vrcopReportRepositoryImpl.setImporterManufacturerCode(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setImporterManufacturerCode(importerManufacturerCode);
		}

		if (importerManufacturerName == null) {
			vrcopReportRepositoryImpl.setImporterManufacturerName(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setImporterManufacturerName(importerManufacturerName);
		}

		if (importerManufacturerAddress == null) {
			vrcopReportRepositoryImpl.setImporterManufacturerAddress(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setImporterManufacturerAddress(importerManufacturerAddress);
		}

		if (markupDomesticsManufacturer == null) {
			vrcopReportRepositoryImpl.setMarkupDomesticsManufacturer(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setMarkupDomesticsManufacturer(markupDomesticsManufacturer);
		}

		if (markupImporter == null) {
			vrcopReportRepositoryImpl.setMarkupImporter(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setMarkupImporter(markupImporter);
		}

		if (copClassification == null) {
			vrcopReportRepositoryImpl.setCopClassification(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopClassification(copClassification);
		}

		if (productClassificationDescription == null) {
			vrcopReportRepositoryImpl.setProductClassificationDescription(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductClassificationDescription(productClassificationDescription);
		}

		vrcopReportRepositoryImpl.setTotalPointA(totalPointA);
		vrcopReportRepositoryImpl.setTotalPointB(totalPointB);
		vrcopReportRepositoryImpl.setTotalPointC(totalPointC);

		if (copNonConformity == null) {
			vrcopReportRepositoryImpl.setCopNonConformity(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopNonConformity(copNonConformity);
		}

		if (inspectionRecordNo == null) {
			vrcopReportRepositoryImpl.setInspectionRecordNo(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setInspectionRecordNo(inspectionRecordNo);
		}

		if (inspectionRecordDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setInspectionRecordDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setInspectionRecordDate(new Date(
					inspectionRecordDate));
		}

		vrcopReportRepositoryImpl.setCorporationId(corporationId);
		vrcopReportRepositoryImpl.setInspectorId(inspectorId);

		if (inspectionSite == null) {
			vrcopReportRepositoryImpl.setInspectionSite(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setInspectionSite(inspectionSite);
		}

		if (inspectionDateFrom == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setInspectionDateFrom(null);
		}
		else {
			vrcopReportRepositoryImpl.setInspectionDateFrom(new Date(
					inspectionDateFrom));
		}

		if (inspectionDateTo == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setInspectionDateTo(null);
		}
		else {
			vrcopReportRepositoryImpl.setInspectionDateTo(new Date(
					inspectionDateTo));
		}

		if (subInspector == null) {
			vrcopReportRepositoryImpl.setSubInspector(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setSubInspector(subInspector);
		}

		if (description == null) {
			vrcopReportRepositoryImpl.setDescription(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setDescription(description);
		}

		if (applicantRepresentative == null) {
			vrcopReportRepositoryImpl.setApplicantRepresentative(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantRepresentative(applicantRepresentative);
		}

		if (applicantRepresentativeTitle == null) {
			vrcopReportRepositoryImpl.setApplicantRepresentativeTitle(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
		}

		vrcopReportRepositoryImpl.setInspectionRecordFileEntryId(inspectionRecordFileEntryId);

		if (copReportRefNo == null) {
			vrcopReportRepositoryImpl.setCopReportRefNo(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportRefNo(copReportRefNo);
		}

		if (copReportRefDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCopReportRefDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportRefDate(new Date(
					copReportRefDate));
		}

		if (copReportPreviousNo == null) {
			vrcopReportRepositoryImpl.setCopReportPreviousNo(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportPreviousNo(copReportPreviousNo);
		}

		if (copReportPreviousDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCopReportPreviousDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportPreviousDate(new Date(
					copReportPreviousDate));
		}

		if (expiredStatus == null) {
			vrcopReportRepositoryImpl.setExpiredStatus(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setExpiredStatus(expiredStatus);
		}

		vrcopReportRepositoryImpl.setDossierId(dossierId);

		if (dossierIdCTN == null) {
			vrcopReportRepositoryImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (dossierNo == null) {
			vrcopReportRepositoryImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setDossierNo(dossierNo);
		}

		if (applicantEmail == null) {
			vrcopReportRepositoryImpl.setApplicantEmail(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantEmail(applicantEmail);
		}

		if (applicantPhone == null) {
			vrcopReportRepositoryImpl.setApplicantPhone(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantPhone(applicantPhone);
		}

		if (applicantTelNo == null) {
			vrcopReportRepositoryImpl.setApplicantTelNo(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantTelNo(applicantTelNo);
		}

		if (applicantFax == null) {
			vrcopReportRepositoryImpl.setApplicantFax(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantFax(applicantFax);
		}

		if (applicantContactName == null) {
			vrcopReportRepositoryImpl.setApplicantContactName(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantContactName(applicantContactName);
		}

		if (applicantContactEmail == null) {
			vrcopReportRepositoryImpl.setApplicantContactEmail(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantContactEmail(applicantContactEmail);
		}

		if (applicantContactPhone == null) {
			vrcopReportRepositoryImpl.setApplicantContactPhone(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantContactPhone(applicantContactPhone);
		}

		if (applicantContactTelNo == null) {
			vrcopReportRepositoryImpl.setApplicantContactTelNo(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantContactTelNo(applicantContactTelNo);
		}

		if (applicantBusinessType == null) {
			vrcopReportRepositoryImpl.setApplicantBusinessType(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantBusinessType(applicantBusinessType);
		}

		if (markupDesigner == null) {
			vrcopReportRepositoryImpl.setMarkupDesigner(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setMarkupDesigner(markupDesigner);
		}

		if (markupOverseasManufacturer == null) {
			vrcopReportRepositoryImpl.setMarkupOverseasManufacturer(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setMarkupOverseasManufacturer(markupOverseasManufacturer);
		}

		if (markupMaintainer == null) {
			vrcopReportRepositoryImpl.setMarkupMaintainer(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setMarkupMaintainer(markupMaintainer);
		}

		if (importerDomesticSite == null) {
			vrcopReportRepositoryImpl.setImporterDomesticSite(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setImporterDomesticSite(importerDomesticSite);
		}

		if (siteOfNationality == null) {
			vrcopReportRepositoryImpl.setSiteOfNationality(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setSiteOfNationality(siteOfNationality);
		}

		if (siteOfNationalityCode == null) {
			vrcopReportRepositoryImpl.setSiteOfNationalityCode(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setSiteOfNationalityCode(siteOfNationalityCode);
		}

		if (siteOfRegion == null) {
			vrcopReportRepositoryImpl.setSiteOfRegion(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setSiteOfRegion(siteOfRegion);
		}

		if (siteOfRegionCode == null) {
			vrcopReportRepositoryImpl.setSiteOfRegionCode(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setSiteOfRegionCode(siteOfRegionCode);
		}

		if (siteOfCity == null) {
			vrcopReportRepositoryImpl.setSiteOfCity(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setSiteOfCity(siteOfCity);
		}

		if (siteOfCityCode == null) {
			vrcopReportRepositoryImpl.setSiteOfCityCode(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setSiteOfCityCode(siteOfCityCode);
		}

		if (manufacturerRepresentative == null) {
			vrcopReportRepositoryImpl.setManufacturerRepresentative(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setManufacturerRepresentative(manufacturerRepresentative);
		}

		if (manufacturerRepresentativeTitle == null) {
			vrcopReportRepositoryImpl.setManufacturerRepresentativeTitle(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setManufacturerRepresentativeTitle(manufacturerRepresentativeTitle);
		}

		if (manufacturerEmail == null) {
			vrcopReportRepositoryImpl.setManufacturerEmail(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setManufacturerEmail(manufacturerEmail);
		}

		if (manufacturerPhone == null) {
			vrcopReportRepositoryImpl.setManufacturerPhone(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setManufacturerPhone(manufacturerPhone);
		}

		if (manufacturerFax == null) {
			vrcopReportRepositoryImpl.setManufacturerFax(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setManufacturerFax(manufacturerFax);
		}

		if (productionPlantEmail == null) {
			vrcopReportRepositoryImpl.setProductionPlantEmail(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionPlantEmail(productionPlantEmail);
		}

		if (productionPlantWebsite == null) {
			vrcopReportRepositoryImpl.setProductionPlantWebsite(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionPlantWebsite(productionPlantWebsite);
		}

		if (productionPlantRepresentative == null) {
			vrcopReportRepositoryImpl.setProductionPlantRepresentative(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionPlantRepresentative(productionPlantRepresentative);
		}

		if (productionPlantRepresentativeTitle == null) {
			vrcopReportRepositoryImpl.setProductionPlantRepresentativeTitle(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionPlantRepresentativeTitle(productionPlantRepresentativeTitle);
		}

		if (corporationName == null) {
			vrcopReportRepositoryImpl.setCorporationName(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCorporationName(corporationName);
		}

		if (inspectorContactCode == null) {
			vrcopReportRepositoryImpl.setInspectorContactCode(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setInspectorContactCode(inspectorContactCode);
		}

		if (inspectorName == null) {
			vrcopReportRepositoryImpl.setInspectorName(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setInspectorName(inspectorName);
		}

		if (inspectoRendorSementDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setInspectoRendorSementDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setInspectoRendorSementDate(new Date(
					inspectoRendorSementDate));
		}

		if (inspectorDeadline == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setInspectorDeadline(null);
		}
		else {
			vrcopReportRepositoryImpl.setInspectorDeadline(new Date(
					inspectorDeadline));
		}

		if (resolvedStatus == null) {
			vrcopReportRepositoryImpl.setResolvedStatus(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setResolvedStatus(resolvedStatus);
		}

		vrcopReportRepositoryImpl.setNumberOfNonConformity(numberOfNonConformity);
		vrcopReportRepositoryImpl.setNumberOfResolved(numberOfResolved);

		if (observationDescription == null) {
			vrcopReportRepositoryImpl.setObservationDescription(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setObservationDescription(observationDescription);
		}

		if (inspectionAuditCycle == null) {
			vrcopReportRepositoryImpl.setInspectionAuditCycle(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setInspectionAuditCycle(inspectionAuditCycle);
		}

		if (inspectionNote == null) {
			vrcopReportRepositoryImpl.setInspectionNote(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setInspectionNote(inspectionNote);
		}

		if (productionConformityChecking == null) {
			vrcopReportRepositoryImpl.setProductionConformityChecking(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionConformityChecking(productionConformityChecking);
		}

		if (productionStampChecking == null) {
			vrcopReportRepositoryImpl.setProductionStampChecking(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionStampChecking(productionStampChecking);
		}

		if (testingEquipmentChecking == null) {
			vrcopReportRepositoryImpl.setTestingEquipmentChecking(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setTestingEquipmentChecking(testingEquipmentChecking);
		}

		if (productionPlantClassification == null) {
			vrcopReportRepositoryImpl.setProductionPlantClassification(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionPlantClassification(productionPlantClassification);
		}

		if (actualCapacity == null) {
			vrcopReportRepositoryImpl.setActualCapacity(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setActualCapacity(actualCapacity);
		}

		if (maxCapacity == null) {
			vrcopReportRepositoryImpl.setMaxCapacity(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setMaxCapacity(maxCapacity);
		}

		if (averageCapacity == null) {
			vrcopReportRepositoryImpl.setAverageCapacity(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setAverageCapacity(averageCapacity);
		}

		if (totalEmployee == null) {
			vrcopReportRepositoryImpl.setTotalEmployee(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setTotalEmployee(totalEmployee);
		}

		if (totalWorker == null) {
			vrcopReportRepositoryImpl.setTotalWorker(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setTotalWorker(totalWorker);
		}

		if (totalManager == null) {
			vrcopReportRepositoryImpl.setTotalManager(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setTotalManager(totalManager);
		}

		if (totalTechnical == null) {
			vrcopReportRepositoryImpl.setTotalTechnical(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setTotalTechnical(totalTechnical);
		}

		if (totalQaEmployee == null) {
			vrcopReportRepositoryImpl.setTotalQaEmployee(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setTotalQaEmployee(totalQaEmployee);
		}

		if (totalSquareMeter == null) {
			vrcopReportRepositoryImpl.setTotalSquareMeter(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setTotalSquareMeter(totalSquareMeter);
		}

		if (wareHouseSquare == null) {
			vrcopReportRepositoryImpl.setWareHouseSquare(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setWareHouseSquare(wareHouseSquare);
		}

		if (officeSquare == null) {
			vrcopReportRepositoryImpl.setOfficeSquare(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setOfficeSquare(officeSquare);
		}

		if (productionSquare == null) {
			vrcopReportRepositoryImpl.setProductionSquare(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionSquare(productionSquare);
		}

		if (machiningArea == null) {
			vrcopReportRepositoryImpl.setMachiningArea(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setMachiningArea(machiningArea);
		}

		if (weldingArea == null) {
			vrcopReportRepositoryImpl.setWeldingArea(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setWeldingArea(weldingArea);
		}

		if (paintingArea == null) {
			vrcopReportRepositoryImpl.setPaintingArea(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setPaintingArea(paintingArea);
		}

		if (productionAssembleArea == null) {
			vrcopReportRepositoryImpl.setProductionAssembleArea(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionAssembleArea(productionAssembleArea);
		}

		if (finishProductArea == null) {
			vrcopReportRepositoryImpl.setFinishProductArea(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setFinishProductArea(finishProductArea);
		}

		if (testingArea == null) {
			vrcopReportRepositoryImpl.setTestingArea(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setTestingArea(testingArea);
		}

		if (selfEquipment == null) {
			vrcopReportRepositoryImpl.setSelfEquipment(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setSelfEquipment(selfEquipment);
		}

		if (contractEquipment == null) {
			vrcopReportRepositoryImpl.setContractEquipment(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setContractEquipment(contractEquipment);
		}

		if (circularNo == null) {
			vrcopReportRepositoryImpl.setCircularNo(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCircularNo(circularNo);
		}

		if (circularDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCircularDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setCircularDate(new Date(circularDate));
		}

		if (circularNo2 == null) {
			vrcopReportRepositoryImpl.setCircularNo2(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCircularNo2(circularNo2);
		}

		if (circularDate2 == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCircularDate2(null);
		}
		else {
			vrcopReportRepositoryImpl.setCircularDate2(new Date(circularDate2));
		}

		vrcopReportRepositoryImpl.resetOriginalValues();

		return vrcopReportRepositoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		applicantProfileId = objectInput.readLong();
		applicantCode = objectInput.readUTF();
		applicantName = objectInput.readUTF();
		applicantAddress = objectInput.readUTF();
		overseasManufacturerCode = objectInput.readUTF();
		overseasManufacturerName = objectInput.readUTF();
		overseasManufacturerAddress = objectInput.readUTF();

		productionPlantId = objectInput.readLong();
		productionPlantCode = objectInput.readUTF();
		productionPlantName = objectInput.readUTF();
		productionPlantAddress = objectInput.readUTF();
		copReportNo = objectInput.readUTF();
		copReportStatus = objectInput.readUTF();
		copReportType = objectInput.readUTF();
		copReportMetadata = objectInput.readUTF();
		copReportSignName = objectInput.readUTF();
		copReportSignTitle = objectInput.readUTF();
		copReportSignPlace = objectInput.readUTF();
		copReportDate = objectInput.readLong();
		copReportApprovedDate = objectInput.readLong();
		copReportExpiredDate = objectInput.readLong();

		COPFileEntryId = objectInput.readLong();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
		importerManufacturerCode = objectInput.readUTF();
		importerManufacturerName = objectInput.readUTF();
		importerManufacturerAddress = objectInput.readUTF();
		markupDomesticsManufacturer = objectInput.readUTF();
		markupImporter = objectInput.readUTF();
		copClassification = objectInput.readUTF();
		productClassificationDescription = objectInput.readUTF();

		totalPointA = objectInput.readInt();

		totalPointB = objectInput.readInt();

		totalPointC = objectInput.readInt();
		copNonConformity = objectInput.readUTF();
		inspectionRecordNo = objectInput.readUTF();
		inspectionRecordDate = objectInput.readLong();

		corporationId = objectInput.readLong();

		inspectorId = objectInput.readLong();
		inspectionSite = objectInput.readUTF();
		inspectionDateFrom = objectInput.readLong();
		inspectionDateTo = objectInput.readLong();
		subInspector = objectInput.readUTF();
		description = objectInput.readUTF();
		applicantRepresentative = objectInput.readUTF();
		applicantRepresentativeTitle = objectInput.readUTF();

		inspectionRecordFileEntryId = objectInput.readLong();
		copReportRefNo = objectInput.readUTF();
		copReportRefDate = objectInput.readLong();
		copReportPreviousNo = objectInput.readUTF();
		copReportPreviousDate = objectInput.readLong();
		expiredStatus = objectInput.readUTF();

		dossierId = objectInput.readLong();
		dossierIdCTN = objectInput.readUTF();
		dossierNo = objectInput.readUTF();
		applicantEmail = objectInput.readUTF();
		applicantPhone = objectInput.readUTF();
		applicantTelNo = objectInput.readUTF();
		applicantFax = objectInput.readUTF();
		applicantContactName = objectInput.readUTF();
		applicantContactEmail = objectInput.readUTF();
		applicantContactPhone = objectInput.readUTF();
		applicantContactTelNo = objectInput.readUTF();
		applicantBusinessType = objectInput.readUTF();
		markupDesigner = objectInput.readUTF();
		markupOverseasManufacturer = objectInput.readUTF();
		markupMaintainer = objectInput.readUTF();
		importerDomesticSite = objectInput.readUTF();
		siteOfNationality = objectInput.readUTF();
		siteOfNationalityCode = objectInput.readUTF();
		siteOfRegion = objectInput.readUTF();
		siteOfRegionCode = objectInput.readUTF();
		siteOfCity = objectInput.readUTF();
		siteOfCityCode = objectInput.readUTF();
		manufacturerRepresentative = objectInput.readUTF();
		manufacturerRepresentativeTitle = objectInput.readUTF();
		manufacturerEmail = objectInput.readUTF();
		manufacturerPhone = objectInput.readUTF();
		manufacturerFax = objectInput.readUTF();
		productionPlantEmail = objectInput.readUTF();
		productionPlantWebsite = objectInput.readUTF();
		productionPlantRepresentative = objectInput.readUTF();
		productionPlantRepresentativeTitle = objectInput.readUTF();
		corporationName = objectInput.readUTF();
		inspectorContactCode = objectInput.readUTF();
		inspectorName = objectInput.readUTF();
		inspectoRendorSementDate = objectInput.readLong();
		inspectorDeadline = objectInput.readLong();
		resolvedStatus = objectInput.readUTF();

		numberOfNonConformity = objectInput.readInt();

		numberOfResolved = objectInput.readInt();
		observationDescription = objectInput.readUTF();
		inspectionAuditCycle = objectInput.readUTF();
		inspectionNote = objectInput.readUTF();
		productionConformityChecking = objectInput.readUTF();
		productionStampChecking = objectInput.readUTF();
		testingEquipmentChecking = objectInput.readUTF();
		productionPlantClassification = objectInput.readUTF();
		actualCapacity = objectInput.readUTF();
		maxCapacity = objectInput.readUTF();
		averageCapacity = objectInput.readUTF();
		totalEmployee = objectInput.readUTF();
		totalWorker = objectInput.readUTF();
		totalManager = objectInput.readUTF();
		totalTechnical = objectInput.readUTF();
		totalQaEmployee = objectInput.readUTF();
		totalSquareMeter = objectInput.readUTF();
		wareHouseSquare = objectInput.readUTF();
		officeSquare = objectInput.readUTF();
		productionSquare = objectInput.readUTF();
		machiningArea = objectInput.readUTF();
		weldingArea = objectInput.readUTF();
		paintingArea = objectInput.readUTF();
		productionAssembleArea = objectInput.readUTF();
		finishProductArea = objectInput.readUTF();
		testingArea = objectInput.readUTF();
		selfEquipment = objectInput.readUTF();
		contractEquipment = objectInput.readUTF();
		circularNo = objectInput.readUTF();
		circularDate = objectInput.readLong();
		circularNo2 = objectInput.readUTF();
		circularDate2 = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(applicantProfileId);

		if (applicantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantCode);
		}

		if (applicantName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantName);
		}

		if (applicantAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantAddress);
		}

		if (overseasManufacturerCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(overseasManufacturerCode);
		}

		if (overseasManufacturerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(overseasManufacturerName);
		}

		if (overseasManufacturerAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(overseasManufacturerAddress);
		}

		objectOutput.writeLong(productionPlantId);

		if (productionPlantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantCode);
		}

		if (productionPlantName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantName);
		}

		if (productionPlantAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantAddress);
		}

		if (copReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportNo);
		}

		if (copReportStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportStatus);
		}

		if (copReportType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportType);
		}

		if (copReportMetadata == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportMetadata);
		}

		if (copReportSignName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportSignName);
		}

		if (copReportSignTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportSignTitle);
		}

		if (copReportSignPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportSignPlace);
		}

		objectOutput.writeLong(copReportDate);
		objectOutput.writeLong(copReportApprovedDate);
		objectOutput.writeLong(copReportExpiredDate);

		objectOutput.writeLong(COPFileEntryId);
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);

		if (importerManufacturerCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerManufacturerCode);
		}

		if (importerManufacturerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerManufacturerName);
		}

		if (importerManufacturerAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerManufacturerAddress);
		}

		if (markupDomesticsManufacturer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupDomesticsManufacturer);
		}

		if (markupImporter == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupImporter);
		}

		if (copClassification == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copClassification);
		}

		if (productClassificationDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productClassificationDescription);
		}

		objectOutput.writeInt(totalPointA);

		objectOutput.writeInt(totalPointB);

		objectOutput.writeInt(totalPointC);

		if (copNonConformity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copNonConformity);
		}

		if (inspectionRecordNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionRecordNo);
		}

		objectOutput.writeLong(inspectionRecordDate);

		objectOutput.writeLong(corporationId);

		objectOutput.writeLong(inspectorId);

		if (inspectionSite == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionSite);
		}

		objectOutput.writeLong(inspectionDateFrom);
		objectOutput.writeLong(inspectionDateTo);

		if (subInspector == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subInspector);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (applicantRepresentative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantRepresentative);
		}

		if (applicantRepresentativeTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantRepresentativeTitle);
		}

		objectOutput.writeLong(inspectionRecordFileEntryId);

		if (copReportRefNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportRefNo);
		}

		objectOutput.writeLong(copReportRefDate);

		if (copReportPreviousNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportPreviousNo);
		}

		objectOutput.writeLong(copReportPreviousDate);

		if (expiredStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(expiredStatus);
		}

		objectOutput.writeLong(dossierId);

		if (dossierIdCTN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierIdCTN);
		}

		if (dossierNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierNo);
		}

		if (applicantEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantEmail);
		}

		if (applicantPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantPhone);
		}

		if (applicantTelNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantTelNo);
		}

		if (applicantFax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantFax);
		}

		if (applicantContactName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantContactName);
		}

		if (applicantContactEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantContactEmail);
		}

		if (applicantContactPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantContactPhone);
		}

		if (applicantContactTelNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantContactTelNo);
		}

		if (applicantBusinessType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantBusinessType);
		}

		if (markupDesigner == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupDesigner);
		}

		if (markupOverseasManufacturer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupOverseasManufacturer);
		}

		if (markupMaintainer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupMaintainer);
		}

		if (importerDomesticSite == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerDomesticSite);
		}

		if (siteOfNationality == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(siteOfNationality);
		}

		if (siteOfNationalityCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(siteOfNationalityCode);
		}

		if (siteOfRegion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(siteOfRegion);
		}

		if (siteOfRegionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(siteOfRegionCode);
		}

		if (siteOfCity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(siteOfCity);
		}

		if (siteOfCityCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(siteOfCityCode);
		}

		if (manufacturerRepresentative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturerRepresentative);
		}

		if (manufacturerRepresentativeTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturerRepresentativeTitle);
		}

		if (manufacturerEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturerEmail);
		}

		if (manufacturerPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturerPhone);
		}

		if (manufacturerFax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturerFax);
		}

		if (productionPlantEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantEmail);
		}

		if (productionPlantWebsite == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantWebsite);
		}

		if (productionPlantRepresentative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantRepresentative);
		}

		if (productionPlantRepresentativeTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantRepresentativeTitle);
		}

		if (corporationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationName);
		}

		if (inspectorContactCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorContactCode);
		}

		if (inspectorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorName);
		}

		objectOutput.writeLong(inspectoRendorSementDate);
		objectOutput.writeLong(inspectorDeadline);

		if (resolvedStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(resolvedStatus);
		}

		objectOutput.writeInt(numberOfNonConformity);

		objectOutput.writeInt(numberOfResolved);

		if (observationDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(observationDescription);
		}

		if (inspectionAuditCycle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionAuditCycle);
		}

		if (inspectionNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionNote);
		}

		if (productionConformityChecking == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionConformityChecking);
		}

		if (productionStampChecking == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionStampChecking);
		}

		if (testingEquipmentChecking == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(testingEquipmentChecking);
		}

		if (productionPlantClassification == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantClassification);
		}

		if (actualCapacity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actualCapacity);
		}

		if (maxCapacity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maxCapacity);
		}

		if (averageCapacity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(averageCapacity);
		}

		if (totalEmployee == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(totalEmployee);
		}

		if (totalWorker == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(totalWorker);
		}

		if (totalManager == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(totalManager);
		}

		if (totalTechnical == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(totalTechnical);
		}

		if (totalQaEmployee == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(totalQaEmployee);
		}

		if (totalSquareMeter == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(totalSquareMeter);
		}

		if (wareHouseSquare == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wareHouseSquare);
		}

		if (officeSquare == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(officeSquare);
		}

		if (productionSquare == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionSquare);
		}

		if (machiningArea == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(machiningArea);
		}

		if (weldingArea == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(weldingArea);
		}

		if (paintingArea == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(paintingArea);
		}

		if (productionAssembleArea == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionAssembleArea);
		}

		if (finishProductArea == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(finishProductArea);
		}

		if (testingArea == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(testingArea);
		}

		if (selfEquipment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(selfEquipment);
		}

		if (contractEquipment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contractEquipment);
		}

		if (circularNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(circularNo);
		}

		objectOutput.writeLong(circularDate);

		if (circularNo2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(circularNo2);
		}

		objectOutput.writeLong(circularDate2);
	}

	public long id;
	public long mtCore;
	public long applicantProfileId;
	public String applicantCode;
	public String applicantName;
	public String applicantAddress;
	public String overseasManufacturerCode;
	public String overseasManufacturerName;
	public String overseasManufacturerAddress;
	public long productionPlantId;
	public String productionPlantCode;
	public String productionPlantName;
	public String productionPlantAddress;
	public String copReportNo;
	public String copReportStatus;
	public String copReportType;
	public String copReportMetadata;
	public String copReportSignName;
	public String copReportSignTitle;
	public String copReportSignPlace;
	public long copReportDate;
	public long copReportApprovedDate;
	public long copReportExpiredDate;
	public long COPFileEntryId;
	public long modifyDate;
	public long syncDate;
	public String importerManufacturerCode;
	public String importerManufacturerName;
	public String importerManufacturerAddress;
	public String markupDomesticsManufacturer;
	public String markupImporter;
	public String copClassification;
	public String productClassificationDescription;
	public int totalPointA;
	public int totalPointB;
	public int totalPointC;
	public String copNonConformity;
	public String inspectionRecordNo;
	public long inspectionRecordDate;
	public long corporationId;
	public long inspectorId;
	public String inspectionSite;
	public long inspectionDateFrom;
	public long inspectionDateTo;
	public String subInspector;
	public String description;
	public String applicantRepresentative;
	public String applicantRepresentativeTitle;
	public long inspectionRecordFileEntryId;
	public String copReportRefNo;
	public long copReportRefDate;
	public String copReportPreviousNo;
	public long copReportPreviousDate;
	public String expiredStatus;
	public long dossierId;
	public String dossierIdCTN;
	public String dossierNo;
	public String applicantEmail;
	public String applicantPhone;
	public String applicantTelNo;
	public String applicantFax;
	public String applicantContactName;
	public String applicantContactEmail;
	public String applicantContactPhone;
	public String applicantContactTelNo;
	public String applicantBusinessType;
	public String markupDesigner;
	public String markupOverseasManufacturer;
	public String markupMaintainer;
	public String importerDomesticSite;
	public String siteOfNationality;
	public String siteOfNationalityCode;
	public String siteOfRegion;
	public String siteOfRegionCode;
	public String siteOfCity;
	public String siteOfCityCode;
	public String manufacturerRepresentative;
	public String manufacturerRepresentativeTitle;
	public String manufacturerEmail;
	public String manufacturerPhone;
	public String manufacturerFax;
	public String productionPlantEmail;
	public String productionPlantWebsite;
	public String productionPlantRepresentative;
	public String productionPlantRepresentativeTitle;
	public String corporationName;
	public String inspectorContactCode;
	public String inspectorName;
	public long inspectoRendorSementDate;
	public long inspectorDeadline;
	public String resolvedStatus;
	public int numberOfNonConformity;
	public int numberOfResolved;
	public String observationDescription;
	public String inspectionAuditCycle;
	public String inspectionNote;
	public String productionConformityChecking;
	public String productionStampChecking;
	public String testingEquipmentChecking;
	public String productionPlantClassification;
	public String actualCapacity;
	public String maxCapacity;
	public String averageCapacity;
	public String totalEmployee;
	public String totalWorker;
	public String totalManager;
	public String totalTechnical;
	public String totalQaEmployee;
	public String totalSquareMeter;
	public String wareHouseSquare;
	public String officeSquare;
	public String productionSquare;
	public String machiningArea;
	public String weldingArea;
	public String paintingArea;
	public String productionAssembleArea;
	public String finishProductArea;
	public String testingArea;
	public String selfEquipment;
	public String contractEquipment;
	public String circularNo;
	public long circularDate;
	public String circularNo2;
	public long circularDate2;
}