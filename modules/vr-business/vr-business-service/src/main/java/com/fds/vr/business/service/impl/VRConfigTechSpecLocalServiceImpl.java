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

import java.util.ArrayList;
import java.util.List;

import com.fds.vr.business.model.VRConfigTechSpec;
import com.fds.vr.business.service.base.VRConfigTechSpecLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * The implementation of the vr config tech spec local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRConfigTechSpecLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRConfigTechSpecLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRConfigTechSpecLocalServiceUtil
 */
@ProviderType
public class VRConfigTechSpecLocalServiceImpl
	extends VRConfigTechSpecLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRConfigTechSpecLocalServiceUtil} to access the vr config tech spec local service.
	 */
	
	public List<VRConfigTechSpec> getByVCMD(String vehicleClass,
			String module) {
		try {
			return vrConfigTechSpecPersistence.findByVC_MD(vehicleClass, module);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRConfigTechSpec>(); 
	}
	
	public List<VRConfigTechSpec> getByVCCTSC(String vehicleClass,
			String vehicleType, String specCategory) throws PortalException,
			SystemException {
		try {
			return vrConfigTechSpecPersistence.findByVC_VT_SC(vehicleClass,
					vehicleType, specCategory);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRConfigTechSpec>(); 
	}
	
	public List<VRConfigTechSpec> getByVCCTSCMD(String vehicleClass,
			String vehicleType, String specCategory, String module) throws PortalException,
			SystemException {
		return vrConfigTechSpecPersistence.findByVC_VT_SC_MD(vehicleClass,
				vehicleType, specCategory, module);
	}
	
	public List<VRConfigTechSpec> getByVCCTSC(String vehicleClass,
			String[] vehicleTypes, String specCategory) throws PortalException,
			SystemException {
		try {
			return vrConfigTechSpecPersistence.findByVC_VT_SC(vehicleClass,
					vehicleTypes, specCategory);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRConfigTechSpec>(); 
	}

	public List<VRConfigTechSpec> getByVCSC(String vehicleClass,
			String specCategory) throws PortalException, SystemException {
		try {
			return vrConfigTechSpecPersistence.findByVC_SC(vehicleClass,
					specCategory);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRConfigTechSpec>(); 
	}
	
	public List<VRConfigTechSpec> getByVCSC(String vehicleClass,
			String specCategory, String module) throws PortalException, SystemException {
		try {
			return vrConfigTechSpecPersistence.findByVC_SC_MD(vehicleClass,
					specCategory, module);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRConfigTechSpec>(); 
	}
	
	public List<VRConfigTechSpec> getByVCSC_(String vehicleClass,
			String specCategory, String module) throws PortalException, SystemException {
		try {
			return vrConfigTechSpecPersistence.findByVC_SC_MD(vehicleClass,
					specCategory, module);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRConfigTechSpec>(); 
	}
	
	/*
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrConfigTechSpecFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrConfigTechSpecFinder.countData(sql);
	}
	*/
	
	Log _log = LogFactoryUtil.getLog(VRConfigTechSpecLocalServiceImpl.class);
}
