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

import com.fds.vr.business.model.VRTrackchanges;
import com.fds.vr.business.service.base.VRTrackchangesLocalServiceBaseImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr trackchanges local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRTrackchangesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author ddung
 * @see VRTrackchangesLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRTrackchangesLocalServiceUtil
 */
@ProviderType
public class VRTrackchangesLocalServiceImpl extends VRTrackchangesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRTrackchangesLocalServiceUtil} to access the vr
	 * trackchanges local service.
	 */

	private static final Log _log = LogFactoryUtil.getLog(VRTrackchangesLocalServiceImpl.class);

	public VRTrackchanges updateVRTrackchanges(long id, String applicantCode, String productionPlantCode,
			long dossierId, String dossierIdCTN, String dossierNo, String contentType, String contentFileTemplate,
			long fileEntryId, Date syncDate, ServiceContext serviceContext) {

		long userId = serviceContext.getUserId();
		// long groupId = serviceContext.getScopeGroupId();

		VRTrackchanges vrTrackchanges = vrTrackchangesPersistence.fetchByPrimaryKey(id);

		Date now = new Date();
		if (vrTrackchanges == null) {
			id = counterLocalService.increment(VRTrackchanges.class.getName());
			vrTrackchanges = vrTrackchangesPersistence.create(id);
			vrTrackchanges.setCreatedDate(now);
			vrTrackchanges.setPreviousContentFileEntryId(fileEntryId);
			vrTrackchanges.setNextContentFileEntryId(fileEntryId);
		} else {
			long nextContentFileEntryId = vrTrackchanges.getNextContentFileEntryId();
			vrTrackchanges.setPreviousContentFileEntryId(nextContentFileEntryId);
			vrTrackchanges.setNextContentFileEntryId(fileEntryId);
		}
		vrTrackchanges.setApplicantCode(applicantCode);
		vrTrackchanges.setProductionPlantCode(productionPlantCode);
		if (dossierId > 0) {
			vrTrackchanges.setDossierId(dossierId);
		}
		if (Validator.isNotNull(dossierIdCTN)) {
			vrTrackchanges.setDossierIdCTN(dossierIdCTN);
		}
		vrTrackchanges.setDossierNo(dossierNo);
		vrTrackchanges.setContentType(contentType);
		if (syncDate == null) {
			vrTrackchanges.setSyncDate(now);
		}
		vrTrackchanges.setModifyUserId(userId);
		vrTrackchanges.setModifyDate(now);
		vrTrackchanges.setContentFileTemplate(contentFileTemplate);

		vrTrackchanges = vrTrackchangesPersistence.update(vrTrackchanges);
		return vrTrackchanges;
	}

	public VRTrackchanges findByApplicantCode(String applicantCode) {
		return vrTrackchangesPersistence.fetchByF_ApplicantCode(applicantCode);
	}

	public VRTrackchanges findByDossierIdCTN_ContentFileTemplate(String dossierIdCTN, String contentFileTemplate) {
		return vrTrackchangesPersistence.fetchByF_dossierIdCTN_ContentFileTemplate(dossierIdCTN, contentFileTemplate);
	}

	public VRTrackchanges findByProductionPlantCode(String productionPlantCode) {
		return vrTrackchangesPersistence.fetchByF_ProductionPlantCode(productionPlantCode);
	}

	public VRTrackchanges findByDossierId_ContentFileTemplate(long dossierId, String contentFileTemplate) {
		return vrTrackchangesPersistence.fetchByF_DossierId_ContentFileTemplate(dossierId, contentFileTemplate);
	}

	public List<VRTrackchanges> findByContentType(String contentType, int start, int end) {
		return vrTrackchangesPersistence.findByF_ContentType(contentType, start, end);
	}
}