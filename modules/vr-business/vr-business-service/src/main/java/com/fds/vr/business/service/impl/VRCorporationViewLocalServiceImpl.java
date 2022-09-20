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
import com.fds.vr.business.model.VRCorporationView;
import com.fds.vr.business.service.base.VRCorporationViewLocalServiceBaseImpl;

/**
 * The implementation of the vr corporation view local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRCorporationViewLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRCorporationViewLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRCorporationViewLocalServiceUtil
 */
@ProviderType
public class VRCorporationViewLocalServiceImpl
	extends VRCorporationViewLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRCorporationViewLocalServiceUtil} to access the vr corporation view local service.
	 */
	
	public List<VRCorporationView> findByInspectorId(long inspectorId) throws PortalException, SystemException {
		try {
			return vrCorporationViewPersistence.findByInspectorId(inspectorId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCorporationView>();
		
	}


	public List<VRCorporationView> findByCorporationId(String corporationId) throws PortalException, SystemException {
		try {
			return vrCorporationViewPersistence.findByCorporationId(corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCorporationView>();
		
	}
	
	public List<VRCorporationView> findByInspectorIdCorporationId(String corporationId, long inspectorId) throws PortalException, SystemException {
		try {
			return vrCorporationViewPersistence.findByInspectorIdCorporationId(corporationId, inspectorId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCorporationView>();
		
	}
	
	public List<VRCorporationView> findByIsLeader(int isLeader) throws PortalException, SystemException {
		try {
			return vrCorporationViewPersistence.findByIsLeader(isLeader);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCorporationView>();
		
	}
	
	public VRCorporationView findByInspectorIdCorporationIdIsLeader(String corporationId, long inspectorId, int isLeader) throws PortalException, SystemException {
		try {
			return vrCorporationViewPersistence.findByInspectorIdCorporationIdIsLeader(inspectorId, corporationId, isLeader);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
		
	}
	
	public VRCorporationView findByCorporationIdAndIsLeader(String corporationId, int isLeader) throws PortalException, SystemException {
		try {
			return vrCorporationViewPersistence.findByCorporationIdAndIsLeader(corporationId, isLeader);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
		
	}
	
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrCorporationViewFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrCorporationViewFinder.countData(sql);
	}
	
	private Log _log = LogFactoryUtil.getLog(VRRPDossierStatisticsLocalServiceImpl.class);
}