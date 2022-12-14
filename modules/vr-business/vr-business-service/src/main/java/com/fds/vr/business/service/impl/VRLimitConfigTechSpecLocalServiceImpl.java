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

import com.fds.vr.business.model.VRLimitConfigTechSpec;
import com.fds.vr.business.service.base.VRLimitConfigTechSpecLocalServiceBaseImpl;


/**
 * The implementation of the vr limit config tech spec local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRLimitConfigTechSpecLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRLimitConfigTechSpecLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRLimitConfigTechSpecLocalServiceUtil
 */
@ProviderType
public class VRLimitConfigTechSpecLocalServiceImpl
	extends VRLimitConfigTechSpecLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRLimitConfigTechSpecLocalServiceUtil} to access the vr limit config tech spec local service.
	 */
	
	public List<VRLimitConfigTechSpec> getLimitConfigs(String vehicleType,
			String markupSMRM, long searchingDriveConfig)
			throws PortalException, SystemException {
		return vrLimitConfigTechSpecPersistence.findByVT_MU_DC(vehicleType, markupSMRM, searchingDriveConfig);
	}
	
	/*
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrLimitConfigTechSpecFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrLimitConfigTechSpecFinder.countData(sql);
	}
	*/
}