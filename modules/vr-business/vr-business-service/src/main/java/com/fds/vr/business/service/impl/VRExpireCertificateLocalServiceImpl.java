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

import com.fds.vr.business.model.VRExpireCertificate;
import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.service.base.VRExpireCertificateLocalServiceBaseImpl;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr expire certificate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRExpireCertificateLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRExpireCertificateLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRExpireCertificateLocalServiceUtil
 */
@ProviderType
public class VRExpireCertificateLocalServiceImpl extends VRExpireCertificateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRExpireCertificateLocalServiceUtil} to access
	 * the vr expire certificate local service.
	 */

	public List<VRExpireCertificate> findByDossierStatus(String dossierStatus, int start, int end) {
		return vrExpireCertificatePersistence.findByF_dossierStatus(dossierStatus, start, end);
	}

	public VRExpireCertificate findByDossierId(long dossierId) {
		return vrExpireCertificatePersistence.fetchBydossierId(dossierId);
	}

	public VRExpireCertificate findByVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		return vrExpireCertificatePersistence.fetchByF_vehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	public VRExpireCertificate updateVRExpireCertificate(long id, long mtCore, long convertAssembleId,
			long validDossierId, String validDossierIdCTN, String validDossierNo, long vehicleTypeCertificateId,
			long dossierId, String dossierIdCTN, String dossierNo, String dossierStatus, Date previousExpireDate,
			String certificateRecordNo, Date certificateRecordDate, Date certificateRecordExpireDate, int expiredStatus,
			String vehicleClass, String certifiedVehicleType, String certifiedVehicleTypeDescription,
			String certifiedTrademark, String certifiedTrademarkName, String certifiedCommercialName,
			String certifiedModelCode, String productionCountry, String safetytestReportNo, Date safetytestReportDate,
			String emissionTestReportNo, Date emissionTestReportDate, String commonSafetyStandard,
			String commonSafetyDescription, String emissionStandard, String emissionDescription,
			String othertestReportNo, Date othertestReportDate, String copReportNo, Date copReportDate,
			Date copReportExpireDate, String validRequestNo, Date validRequestDate, String validInspectionRecordNo,
			Date validInspectionRecordDate, long validCorporationId, long validInspectorId, String validInspectorName,
			String validRemarks, String validInspectionNote, long deliverableFileEntryId, long documentFileEntryId,
			Date syncDate, String typeUpdate, Company company) {

		VRExpireCertificate vrExpireCertificate = vrExpireCertificatePersistence.fetchByPrimaryKey(id);

		if (vrExpireCertificate == null) {
			// Co roi thi khong them nua
			if (typeUpdate.equalsIgnoreCase("suggest")) {
				VRExpireCertificate isVRExpireCertificate = vrExpireCertificatePersistence.fetchBydossierId(dossierId);
				if (isVRExpireCertificate != null) {
					return isVRExpireCertificate;
				}
			}

			id = counterLocalService.increment(VRExpireCertificate.class.getName());

			vrExpireCertificate = vrExpireCertificatePersistence.create(id);
		}

		Date now = new Date();
		
		vrExpireCertificate.setModifyDate(now);
		vrExpireCertificate.setSyncDate(now);
		if (mtCore > 0) {
			vrExpireCertificate.setMtCore(mtCore);
		}
		if (convertAssembleId > 0) {
			vrExpireCertificate.setConvertAssembleId(convertAssembleId);
		}
		if (validDossierId > 0) {
			vrExpireCertificate.setValidDossierId(validDossierId);
		}
		if (Validator.isNotNull(validDossierIdCTN)) {
			vrExpireCertificate.setValidDossierIdCTN(validDossierIdCTN);
		}
		if (Validator.isNotNull(validDossierNo)) {
			vrExpireCertificate.setValidDossierNo(validDossierNo);
		}
		if (vehicleTypeCertificateId > 0) {
			vrExpireCertificate.setVehicleTypeCertificateId(vehicleTypeCertificateId);
		}
		if (dossierId > 0) {
			vrExpireCertificate.setDossierId(dossierId);
		}
		if (Validator.isNotNull(dossierIdCTN)) {
			vrExpireCertificate.setDossierIdCTN(dossierIdCTN);
		}
		if (Validator.isNotNull(dossierNo)) {
			vrExpireCertificate.setDossierNo(dossierNo);
		}
		if (Validator.isNotNull(dossierStatus)) {
			vrExpireCertificate.setDossierStatus(dossierStatus);
		}
		if (Validator.isNotNull(previousExpireDate)) {
			vrExpireCertificate.setPreviousExpireDate(previousExpireDate);
		}
		if (Validator.isNotNull(certificateRecordNo)) {
			vrExpireCertificate.setCertificateRecordNo(certificateRecordNo);
		}
		if (Validator.isNotNull(certificateRecordDate)) {
			vrExpireCertificate.setCertificateRecordDate(certificateRecordDate);
		}
		if (Validator.isNotNull(certificateRecordExpireDate)) {
			vrExpireCertificate.setCertificateRecordExpireDate(certificateRecordExpireDate);
		}
		if (expiredStatus > 0) {
			vrExpireCertificate.setExpiredStatus(expiredStatus);
		}
		if (Validator.isNotNull(vehicleClass)) {
			vrExpireCertificate.setVehicleClass(vehicleClass);
		}
		if (Validator.isNotNull(certifiedVehicleType)) {
			vrExpireCertificate.setCertifiedVehicleType(certifiedVehicleType);
		}
		if (Validator.isNotNull(certifiedVehicleTypeDescription)) {
			vrExpireCertificate.setCertifiedVehicleTypeDescription(certifiedVehicleTypeDescription);
		}
		if (Validator.isNotNull(certifiedTrademark)) {
			vrExpireCertificate.setCertifiedTrademark(certifiedTrademark);
		}
		if (Validator.isNotNull(certifiedTrademarkName)) {
			vrExpireCertificate.setCertifiedTrademarkName(certifiedTrademarkName);
		}
		if (Validator.isNotNull(certifiedCommercialName)) {
			vrExpireCertificate.setCertifiedCommercialName(certifiedCommercialName);
		}
		if (Validator.isNotNull(certifiedModelCode)) {
			vrExpireCertificate.setCertifiedModelCode(certifiedModelCode);
		}
		if (Validator.isNotNull(productionCountry)) {
			vrExpireCertificate.setProductionCountry(productionCountry);
		}
		if (Validator.isNotNull(safetytestReportNo)) {
			vrExpireCertificate.setSafetytestReportNo(safetytestReportNo);
		}
		if (Validator.isNotNull(safetytestReportDate)) {
			vrExpireCertificate.setSafetytestReportDate(safetytestReportDate);
		}
		if (Validator.isNotNull(emissionTestReportNo)) {
			vrExpireCertificate.setEmissionTestReportNo(emissionTestReportNo);
		}
		if (Validator.isNotNull(emissionTestReportDate)) {
			vrExpireCertificate.setEmissionTestReportDate(emissionTestReportDate);
		}
		if (Validator.isNotNull(commonSafetyStandard)) {
			vrExpireCertificate.setCommonSafetyStandard(commonSafetyStandard);
		}
		if (Validator.isNotNull(commonSafetyDescription)) {
			vrExpireCertificate.setCommonSafetyDescription(commonSafetyDescription);
		}
		if (Validator.isNotNull(emissionStandard)) {
			vrExpireCertificate.setEmissionStandard(emissionStandard);
		}
		if (Validator.isNotNull(emissionDescription)) {
			vrExpireCertificate.setEmissionDescription(emissionDescription);
		}
		if (Validator.isNotNull(othertestReportNo)) {
			vrExpireCertificate.setOthertestReportNo(othertestReportNo);
		}
		if (Validator.isNotNull(othertestReportDate)) {
			vrExpireCertificate.setOthertestReportDate(othertestReportDate);
		}
		if (Validator.isNotNull(copReportNo)) {
			vrExpireCertificate.setCopReportNo(copReportNo);
		}
		if (Validator.isNotNull(copReportDate)) {
			vrExpireCertificate.setCopReportDate(copReportDate);
		}
		if (Validator.isNotNull(copReportExpireDate)) {
			vrExpireCertificate.setCopReportExpireDate(copReportExpireDate);
		}
		if (Validator.isNotNull(validRequestNo)) {
			vrExpireCertificate.setValidRequestNo(validRequestNo);
		}
		if (Validator.isNotNull(validRequestDate)) {
			vrExpireCertificate.setValidRequestDate(validRequestDate);
		}
		if (Validator.isNotNull(validInspectionRecordNo)) {
			vrExpireCertificate.setValidInspectionRecordNo(validInspectionRecordNo);
		}
		if (Validator.isNotNull(validInspectionRecordDate)) {
			vrExpireCertificate.setValidInspectionRecordDate(validInspectionRecordDate);
		}
		if (validCorporationId > 0) {
			vrExpireCertificate.setValidCorporationId(validCorporationId);
		}
		if (validInspectorId > 0) {
			vrExpireCertificate.setValidInspectorId(validInspectorId);
		}
		if (Validator.isNotNull(validInspectorName)) {
			vrExpireCertificate.setValidInspectorName(validInspectorName);
		}
		if (Validator.isNotNull(validRemarks)) {
			vrExpireCertificate.setValidRemarks(validRemarks);
		}
		if (Validator.isNotNull(validInspectionNote)) {
			vrExpireCertificate.setValidInspectionNote(validInspectionNote);
		}
		if (deliverableFileEntryId > 0) {
			vrExpireCertificate.setDeliverableFileEntryId(deliverableFileEntryId);
		}
		if (documentFileEntryId > 0) {
			vrExpireCertificate.setDocumentFileEntryId(documentFileEntryId);
		}
		
		vrExpireCertificate = vrExpireCertificatePersistence.update(vrExpireCertificate);

		if (typeUpdate.equalsIgnoreCase("confirm")) {
			//update expiredStatus for VRVehicleTypeCertificate
			VRVehicleTypeCertificate vrVehicleTypeCertificate = vrVehicleTypeCertificateLocalService
					.fetchVRVehicleTypeCertificate(vrExpireCertificate.getVehicleTypeCertificateId());
			vrVehicleTypeCertificate.setExpiredStatus("1");
			vrVehicleTypeCertificateLocalService.updateVRVehicleTypeCertificate(vrVehicleTypeCertificate, company);
		}

		return vrExpireCertificate;
	}
}