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
import com.fds.vr.business.model.VRIssueInspectionRecord;
import com.fds.vr.business.service.base.VRIssueInspectionRecordLocalServiceBaseImpl;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr issue inspection record local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRIssueInspectionRecordLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRIssueInspectionRecordLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRIssueInspectionRecordLocalServiceUtil
 */
@ProviderType
public class VRIssueInspectionRecordLocalServiceImpl extends VRIssueInspectionRecordLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRIssueInspectionRecordLocalServiceUtil} to
	 * access the vr issue inspection record local service.
	 */

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

	public List<VRIssueInspectionRecord> findByDossierId(long dossierId, int start, int end) {
		return vrIssueInspectionRecordPersistence.findBydossierId(dossierId, start, end);
	}

	public List<VRIssueInspectionRecord> findByIssueId(long issueId, int start, int end) {
		return vrIssueInspectionRecordPersistence.findByissueId(issueId, start, end);
	}

	public List<VRIssueInspectionRecord> findByVehicleTypeCertificateId(long vehicleTypeCertificateId, int start,
			int end) {
		return vrIssueInspectionRecordPersistence.findBycertificateId(vehicleTypeCertificateId, start, end);
	}

	public List<VRIssueInspectionRecord> updateVRIssueInspectionRecord(JSONObject objectData, long dossierId) {

		VRDossier dossier = vrDossierLocalService.fetchVRDossier(dossierId);
		VRDossier dossier_CTN = vrDossierLocalService.getByRef(55217L, dossier.getReferenceUid());
		vrIssueInspectionRecordPersistence.removeBydossierId(dossier_CTN.getDossierId());
		
		Date now = new Date();

		List<VRIssueInspectionRecord> vrIssueInspectionRecords = new ArrayList<VRIssueInspectionRecord>();

//		for (int i = 0; i < jsonData.length(); i++) {
//			JSONObject objectData = jsonData.getJSONObject(i);
			long vrIssueInspectionRecordId = counterLocalService.increment(VRIssueInspectionRecord.class.getName());
			VRIssueInspectionRecord object = vrIssueInspectionRecordPersistence.create(vrIssueInspectionRecordId);

			object.setMtCore(objectData.getLong("mtCore"));
			object.setIssueId(objectData.getLong("issueId"));
			object.setDossierId(dossier_CTN.getDossierId());
			object.setCertificateId(objectData.getLong("certificateId"));
			object.setTotalQuantity(objectData.getInt("totalQuantity"));
			object.setPostReview(objectData.getString("postReview"));
			object.setPostReviewRecordNo(objectData.getString("postReviewRecordNo"));
			object.setPostReviewRecordDate(parseStringToDate(objectData.getString("postReviewRecordDate")));
			object.setCorporationId(objectData.getLong("corporationId"));
			object.setInspectorCode(objectData.getString("inspectorCode"));
			object.setInspectorName(objectData.getString("inspectorName"));
			object.setLeaderName(objectData.getString("leaderName"));
			object.setIssueCorporationId(objectData.getLong("issueCorporationId"));
			object.setVerifyCorporationId(objectData.getLong("verifyCorporationId"));
			object.setInspectorId(objectData.getLong("inspectorId"));
			object.setIssueInspectorId(objectData.getLong("issueInspectorId"));
			object.setVerifyInspectorId(objectData.getLong("verifyInspectorId"));
			object.setDigitalIssueStatus(objectData.getString("digitalIssueStatus"));
			object.setValidRemarks(objectData.getString("validRemarks"));
			object.setValidInspectionNote(objectData.getString("validInspectionNote"));
			object.setDocumentFileEntryid(objectData.getLong("documentFileEntryId"));
			object.setModifyDate(now);
			object.setSyncDate(now);

			object = vrIssueInspectionRecordPersistence.update(object);
			if (object != null) {
				vrIssueInspectionRecords.add(object);
			}
//		}
		return vrIssueInspectionRecords;
	}
}