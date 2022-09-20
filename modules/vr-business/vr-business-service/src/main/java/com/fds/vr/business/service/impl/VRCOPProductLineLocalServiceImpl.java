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
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.VRCOPProductLine;
import com.fds.vr.business.model.VRCOPReportAttach;
import com.fds.vr.business.service.base.VRCOPProductLineLocalServiceBaseImpl;

/**
 * The implementation of the vrcop product line local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRCOPProductLineLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRCOPProductLineLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRCOPProductLineLocalServiceUtil
 */
@ProviderType
public class VRCOPProductLineLocalServiceImpl
	extends VRCOPProductLineLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRCOPProductLineLocalServiceUtil} to access the vrcop product line local service.
	 */
	
	public List<VRCOPProductLine> findBycopReportRepositoryID(long mtCore, long copReportRepositoryID) throws PortalException, SystemException {
		try {
			return vrcopProductLinePersistence.findBycopReportRepositoryID(mtCore, copReportRepositoryID);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPProductLine>();
		
	}


	public List<VRCOPProductLine> findBycopReportNo(long mtCore, String copReportNo) throws PortalException, SystemException {
		try {
			return vrcopProductLinePersistence.findBycopReportNo(mtCore, copReportNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPProductLine>();
		
	}

	public VRCOPProductLine updateCOPProductLine(LinkedHashMap<String, String> mapValues) {
		
		Date now = new Date();

		long vrCOPProductLineId = counterLocalService.increment(VRCOPProductLine.class.getName());

		VRCOPProductLine object = vrcopProductLinePersistence.create(vrCOPProductLineId);

		/// Add audit fields
		object.setSyncDate(now);

		// Add other fields
		object.setMtCore(Long.valueOf(mapValues.get("")));
		object.setCopReportRepositoryID(Long.valueOf(mapValues.get("")));
		object.setCopReportNo(mapValues.get(""));
		object.setCopProductTypeID(Long.valueOf(mapValues.get("")));
		object.setSequenceNo(Long.valueOf(mapValues.get("")));
		object.setTrademark(mapValues.get(""));
		object.setTrademarkName(mapValues.get(""));
		object.setCommercialName(mapValues.get(""));
		object.setModelCode(mapValues.get(""));
		object.setDesignSymbolNo(mapValues.get(""));

		object.setModifyDate(ConvertFormatDate.parseStringToDate(mapValues.get("")));

		return vrcopProductLinePersistence.update(object);
	}
	/*
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return  vrcopProductLineFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrcopProductLineFinder.countData(sql);
	}

	*/
	
	public JSONArray getByCOPReportNo(long mtcore,String COPReportNo) throws SystemException, PortalException{
		
		JSONArray result = JSONFactoryUtil.createJSONArray();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		
		List<VRCOPProductLine> dataList = findBycopReportNo(mtcore,COPReportNo);
		
		for(VRCOPProductLine data:dataList) {
			
			jsonObject = JSONFactoryUtil.createJSONObject();
			
			jsonObject = ActionUtil.object2Json(data, VRCOPProductLine.class, "vr_copproductline");
			
			if(Validator.isNotNull(jsonObject)) {
				result.put(jsonObject);
			}
		}
		return result;
	}
		
	private Log _log = LogFactoryUtil.getLog(VRCOPProductLineLocalServiceImpl.class);
}