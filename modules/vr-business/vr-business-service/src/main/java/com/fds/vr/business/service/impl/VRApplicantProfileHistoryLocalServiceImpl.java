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
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.fds.vr.business.model.VRApplicantProfileHistory;
import com.fds.vr.business.service.base.VRApplicantProfileHistoryLocalServiceBaseImpl;

/**
 * The implementation of the vr applicant profile history local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRApplicantProfileHistoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRApplicantProfileHistoryLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRApplicantProfileHistoryLocalServiceUtil
 */
@ProviderType
public class VRApplicantProfileHistoryLocalServiceImpl
	extends VRApplicantProfileHistoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRApplicantProfileHistoryLocalServiceUtil} to access the vr applicant profile history local service.
	 */
	
	public List<VRApplicantProfileHistory> findBymappingStatus(long mtCore, String mappingStatus)  throws SystemException {
		try {
			return vrApplicantProfileHistoryPersistence.findBymappingStatus(mtCore, mappingStatus);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRApplicantProfileHistory>();
		
	}
	
	public List<VRApplicantProfileHistory> findByapplicantCode(long mtCore, String applicantCode)  throws SystemException {
		try {
			return vrApplicantProfileHistoryPersistence.findByapplicantCode(mtCore, applicantCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRApplicantProfileHistory>();
		
	}

	public List<VRApplicantProfileHistory> findBymappingMA_CTY(long mtCore, String mappingMA_CTY)  throws SystemException {
		try {
			return vrApplicantProfileHistoryPersistence.findBymappingMA_CTY(mtCore, mappingMA_CTY);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRApplicantProfileHistory>();
		
	}

	public List<VRApplicantProfileHistory> findBymappingTEN_CTY(long mtCore, String mappingTEN_CTY)  throws SystemException {
		try {
			return vrApplicantProfileHistoryPersistence.findBymappingTEN_CTY(mtCore, mappingTEN_CTY);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRApplicantProfileHistory>();
		
	}

	public List<VRApplicantProfileHistory> findByapplicantRegion(long mtCore, String applicantRegion) throws SystemException {
		try {
			return vrApplicantProfileHistoryPersistence.findByapplicantRegion(mtCore, applicantRegion);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRApplicantProfileHistory>();
		
	}

	public List<VRApplicantProfileHistory> findByapplicantCity(long mtCore, String applicantCity) throws SystemException {
		try {
			return vrApplicantProfileHistoryPersistence.findByapplicantCity(mtCore, applicantCity);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRApplicantProfileHistory>();
		
	}

	public List<VRApplicantProfileHistory> findByapplicantStatus(long mtCore, String applicantStatus) throws SystemException {
		try {
			return vrApplicantProfileHistoryPersistence.findByapplicantStatus(mtCore, applicantStatus);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRApplicantProfileHistory>();
		
	}
	
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrApplicantProfileHistoryFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrApplicantProfileHistoryFinder.countData(sql);
	}
	
	private Log _log = LogFactoryUtil.getLog(VRApplicantProfileHistoryLocalServiceImpl.class);
}