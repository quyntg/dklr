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
import com.liferay.portal.kernel.exception.SystemException;
import com.fds.vr.business.model.VRCorporationInspector;
import com.fds.vr.business.service.base.VRCorporationInspectorLocalServiceBaseImpl;

/**
 * The implementation of the vr corporation inspector local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRCorporationInspectorLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRCorporationInspectorLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRCorporationInspectorLocalServiceUtil
 */
@ProviderType
public class VRCorporationInspectorLocalServiceImpl
	extends VRCorporationInspectorLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRCorporationInspectorLocalServiceUtil} to access the vr corporation inspector local service.
	 */
	
	public VRCorporationInspector findByInspectorId(long inspectorid) throws PortalException, SystemException {
		try {
			return vrCorporationInspectorPersistence.findByInspectorId(inspectorid);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
		
	}


	public List<VRCorporationInspector> findByInspectorcode(String inspectorcode) throws PortalException, SystemException {
		try {
			return vrCorporationInspectorPersistence.findByInspectorcode(inspectorcode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCorporationInspector>();
		
	}
	
	public List<VRCorporationInspector> findByCorporationId(String corporationId) throws PortalException, SystemException {
		try {
			return vrCorporationInspectorPersistence.findByCorporationId(corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCorporationInspector>();
		
	}
	
	public List<VRCorporationInspector> findByTeamId(long teamId) throws PortalException, SystemException {
		try {
			return vrCorporationInspectorPersistence.findByTeamId(teamId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCorporationInspector>();
		
	}
	
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrCorporationInspectorFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrCorporationInspectorFinder.countData(sql);
	}
	
	private Log _log = LogFactoryUtil.getLog(VRCorporationInspectorLocalServiceImpl.class);
}