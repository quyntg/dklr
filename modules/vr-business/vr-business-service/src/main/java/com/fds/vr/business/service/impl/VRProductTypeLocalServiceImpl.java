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

import com.fds.vr.business.model.VRProductType;
import com.fds.vr.business.service.base.VRProductTypeLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr product type local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRProductTypeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRProductTypeLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRProductTypeLocalServiceUtil
 */
@ProviderType
public class VRProductTypeLocalServiceImpl
	extends VRProductTypeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRProductTypeLocalServiceUtil} to access the vr product type local service.
	 */
	public VRProductType updateProductType(Map<String, String> mapValues, int mtCore) {
		
		Date now = new Date();

		long vrProductTypeId = counterLocalService.increment(VRProductType.class.getName());

		VRProductType object = vrProductTypePersistence.create(vrProductTypeId);

		/// Add audit fields
		object.setSyncDate(now);
		object.setModifyDate(now);

		// Add other fields
		object.setMtCore(mtCore);
		//object.setProductPlantID(Long.valueOf(mapValues.get("productPlantId")));
		object.setSequenceNo(Long.valueOf(mapValues.get("sequenceNo")));
		object.setVehicleClass(mapValues.get("vehicleClass"));
		object.setVehicleTypeCode(mapValues.get("vehicleTypeCode"));
		object.setVehicleTypeDescription(mapValues.get("vehicleTypeDescription"));
		object.setProductClassificationCode(mapValues.get("productClassificationCode"));
		object.setProductClassificationDescription(mapValues.get("productClassificationDescription"));
		object.setTrademark(mapValues.get("trademark"));
		object.setTrademarkName(mapValues.get("trademarkName"));
		object.setCommercialName(mapValues.get("commercialName"));
		object.setModelCode(mapValues.get("modelCode"));
		object.setDesignSymbolNo(mapValues.get("designSymbolNo"));

		return vrProductTypePersistence.update(object);
	}
	
	/*
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrProductTypeFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrProductTypeFinder.countData(sql);
	}
	*/
	
	public List<VRProductType> findByProductionPlantCode_ProductClassificationCode(String productionPlantCode,String productClassificationCode){
		return vrProductTypePersistence.findByPPC_PCC(productionPlantCode,productClassificationCode);
	}
	
	public VRProductType createVRProductType(VRProductType object) throws SystemException {

		long id = counterLocalService.increment(VRProductType.class.getName());

		object.setId(id);
		
		Date now = new Date();
		
		object.setModifyDate(now);

		return vrProductTypePersistence.update(object);
	}

	public VRProductType updateVRProductType(VRProductType object) throws SystemException {

		Date now = new Date();

		object.setModifyDate(now);

		return vrProductTypePersistence.update(object);
	}
	
	public List<VRProductType> adminProcessData(JSONArray arrayData, String productionPlantCode) {

		List<VRProductType> vrProductTypes = new ArrayList<VRProductType>();
		
		try {
			vrProductTypePersistence.removeByproductionPlantCode(productionPlantCode);
			
			for (int i = 0; i < arrayData.length(); i++) {
				JSONObject objectData = arrayData.getJSONObject(i);
				
				VRProductType object = null;

				long id = counterLocalService.increment(VRProductType.class.getName());

				object = vrProductTypePersistence.create(id);

				object.setModifyDate(new Date());
				object.setMtCore(objectData.getLong("mtCore"));
				if (!"".equals(objectData.getString("syncDate"))) {
					object.setSyncDate(new Date(objectData.getString("syncDate")));
				}
				object.setSequenceNo(objectData.getLong("sequenceNo"));
				object.setVehicleClass(objectData.getString("vehicleClass"));
				object.setVehicleTypeCode(objectData.getString("vehicleTypeCode"));
				object.setVehicleTypeDescription(objectData.getString("vehicleTypeDescription"));
				object.setTrademark(objectData.getString("trademark"));
				object.setTrademarkName(objectData.getString("trademarkName"));
				object.setCommercialName(objectData.getString("commercialName"));
				object.setModelCode(objectData.getString("modelCode"));
				object.setProductClassificationCode(objectData.getString("productClassificationCode"));
				object.setProductClassificationDescription(objectData.getString("productClassificationDescription"));
				object.setDesignSymbolNo(objectData.getString("designSymbolNo"));
				object.setProductionPlantId(objectData.getLong("productionPlantId"));
				object.setProductionPlantCode(productionPlantCode);

				object = vrProductTypePersistence.update(object);
				
				vrProductTypes.add(object);
			}
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
		
		return vrProductTypes;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(VRProductTypeLocalServiceImpl.class);
	
}