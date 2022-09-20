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

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRHistoryProfile;
import com.fds.vr.business.service.base.VRHistoryProfileLocalServiceBaseImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the vr history profile local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRHistoryProfileLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author ddung
 * @see VRHistoryProfileLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRHistoryProfileLocalServiceUtil
 */
@ProviderType
public class VRHistoryProfileLocalServiceImpl extends VRHistoryProfileLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRHistoryProfileLocalServiceUtil} to access the
	 * vr history profile local service.
	 */
	public VRHistoryProfile updateVRHistoryProfile(long id, String applicantCode, String productionPlantCode,
			long dossierId, String dossierIdCTN, String dossierNo, String contentType, String contentFileTemplate,
			long jsonFileEntryId, long pdfFileEntryId, Date syncDate, ServiceContext serviceContext) {
		long userId = serviceContext.getUserId();
		//long groupId = serviceContext.getScopeGroupId();

		VRHistoryProfile vrHistoryProfile = vrHistoryProfilePersistence.fetchByPrimaryKey(id);

		Date now = new Date();
		if (vrHistoryProfile == null) {
			id = counterLocalService.increment(VRHistoryProfile.class.getName());
			vrHistoryProfile = vrHistoryProfilePersistence.create(id);
			vrHistoryProfile.setCreatedDate(now);
		}
		vrHistoryProfile.setApplicantCode(applicantCode);
		vrHistoryProfile.setProductionPlantCode(productionPlantCode);
		if(dossierId > 0) {
			vrHistoryProfile.setDossierId(dossierId);
		}
		vrHistoryProfile.setDossierIdCTN(dossierIdCTN);
		vrHistoryProfile.setDossierNo(dossierNo);
		vrHistoryProfile.setContentType(contentType);
		if (syncDate == null) {
			vrHistoryProfile.setSyncDate(now);
		}
		vrHistoryProfile.setModifyUserId(userId);
		vrHistoryProfile.setContentFileTemplate(contentFileTemplate);
		vrHistoryProfile.setContentjsonFileEntryId(jsonFileEntryId);
		vrHistoryProfile.setContentFileEntryId(pdfFileEntryId);

		vrHistoryProfile = vrHistoryProfilePersistence.update(vrHistoryProfile);
		return vrHistoryProfile;
	}

	public List<VRHistoryProfile> findByApplicantCode(String applicantCode, int start, int end) {
		return vrHistoryProfilePersistence.findByF_ApplicantCode(applicantCode, start, end);
	}

	public List<VRHistoryProfile> findByProductionPlantCode(String productionPlantCode, int start, int end) {
		return vrHistoryProfilePersistence.findByF_ProductionPlantCode(productionPlantCode, start, end);
	}

	public List<VRHistoryProfile> findByDossierId(long dossierId, int start, int end) {
		OrderByComparator<VRHistoryProfile> orderByComparator = OrderByComparatorFactoryUtil
				.create("vr_history_profile", "createDate", "desc");

		return vrHistoryProfilePersistence.findByF_DossierId(dossierId, start, end, orderByComparator);
	}
	
	public List<VRHistoryProfile> findByDossierIdCTN(String dossierIdCTN, int start, int end) {
		return vrHistoryProfilePersistence.findByF_dossierIdCTN(dossierIdCTN, start, end);
	}

	public List<VRHistoryProfile> findVRHitoryProfiles(String applicantCode, String productionPlantCode, long dossierId,
			String dossierIdCTN, String dossierNo, String contentType, String contentFileTemplate, int start, int end) {
		return vrHistoryProfileFinder.findVRHitoryProfiles(applicantCode, productionPlantCode, dossierId, dossierIdCTN,
				dossierNo, contentType, contentFileTemplate, start, end);
	}

	public List<VRHistoryProfile> findByContentType(String contentType, int start, int end) {
		return vrHistoryProfilePersistence.findByF_ContentType(contentType, start, end);
	}
	
	public void deleteByDossierIdCTN_contentFileTemplate(String dossierIdCTN, String contentFileTemplate) {
		_log.info("====> deleteByDossierIdCTN_contentFileTemplate");
		vrHistoryProfilePersistence.removeByF_dossierIdCTN_contentFileTemplate(dossierIdCTN, contentFileTemplate);
	}
	
	private static final Log _log = LogFactoryUtil.getLog(VRHistoryProfileLocalServiceImpl.class);
}