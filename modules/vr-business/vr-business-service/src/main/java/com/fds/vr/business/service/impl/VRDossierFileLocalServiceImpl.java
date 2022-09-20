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

import com.fds.vr.business.exception.NoSuchVRDossierFileException;
import com.fds.vr.business.model.VRDossierFile;
import com.fds.vr.business.service.base.VRDossierFileLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr dossier file local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRDossierFileLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRDossierFileLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRDossierFileLocalServiceUtil
 */
@ProviderType
public class VRDossierFileLocalServiceImpl
	extends VRDossierFileLocalServiceBaseImpl {
	
	private static final Log _log = LogFactoryUtil.getLog(VRDossierFileLocalServiceImpl.class);
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRDossierFileLocalServiceUtil} to access the vr dossier file local service.
	 */
	public VRDossierFile getByDeliverableCode(String deliverableCode) {
		try {
			return vrDossierFilePersistence.findByDE_CODE(deliverableCode);
		} catch (Exception e) {
			return null;
		}
	}
	
	public VRDossierFile getByDossierFileId(long dossierFileId) {
		try {
			return vrDossierFilePersistence.fetchByDossierFileId(dossierFileId, false);
		} catch (Exception e) {
			return null;
		}
	}
	
	public VRDossierFile getDossierFileByDID_FTNO_First(long dossierId, String fileTemplateNo, boolean removed,
			OrderByComparator orderByComparator) {
		try {
			return vrDossierFilePersistence.findByDID_FTNO_First(dossierId, fileTemplateNo, removed, orderByComparator);
		} catch (NoSuchVRDossierFileException e) {
			_log.error(e);
			return null;
		}
	}
	
	public VRDossierFile getDossierFileByDID_DPNO(long dossierId, String dossierPartNo, boolean removed) {
		VRDossierFile vrDossierFile = null;
		List<VRDossierFile> vrDossierFiles = vrDossierFilePersistence.findByDID_DPNO(dossierId, dossierPartNo, removed);
		if(vrDossierFiles != null && !vrDossierFiles.isEmpty()) {
			vrDossierFile = vrDossierFiles.get(0);
		}
		return vrDossierFile;
	}
	
	/*
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrDossierFileFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrDossierFileFinder.countData(sql);
	}
	*/
	public static final String CLASS_NAME = VRDossierFile.class.getName();
}