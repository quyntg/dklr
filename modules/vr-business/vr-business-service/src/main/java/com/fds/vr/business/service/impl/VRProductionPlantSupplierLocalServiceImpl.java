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

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.VRProductionPlantSupplier;
import com.fds.vr.business.service.base.VRProductionPlantSupplierLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr production plant supplier local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRProductionPlantSupplierLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantSupplierLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRProductionPlantSupplierLocalServiceUtil
 */
@ProviderType
public class VRProductionPlantSupplierLocalServiceImpl
	extends VRProductionPlantSupplierLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRProductionPlantSupplierLocalServiceUtil} to access the vr production plant supplier local service.
	 */

	public VRProductionPlantSupplier updateProductionPlantSupplier(LinkedHashMap<String, String> mapValues) {
		
		Date now = new Date();

		long vrProductionPlantSupplierId = counterLocalService.increment(VRProductionPlantSupplier.class.getName());

		VRProductionPlantSupplier object = vrProductionPlantSupplierPersistence.create(vrProductionPlantSupplierId);

		/// Add audit fields
		object.setSyncDate(now);

		// Add other fields
		object.setMtCore(Long.valueOf(mapValues.get("")));
		object.setCorporationCode(mapValues.get(""));
		object.setCorporationName(mapValues.get(""));
		object.setCorporationAddress(mapValues.get(""));


		object.setModifyDate(ConvertFormatDate.parseStringToDate(mapValues.get("")));

		return vrProductionPlantSupplierPersistence.update(object);
	}
	

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrProductionPlantSupplierFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrProductionPlantSupplierFinder.countData(sql);
	}
	
	public List<VRProductionPlantSupplier> adminProcessData(JSONArray arrayData, String productionPlantCode) {

		List<VRProductionPlantSupplier> vrProductionPlantSuppliers = new ArrayList<VRProductionPlantSupplier>();
		
		VRProductionPlant vrProductionPlant = vrProductionPlantLocalService.findByproductionPlantCode(productionPlantCode);
		try {
			vrProductionPlantSupplierPersistence.removeByproductionPlantCode(productionPlantCode);
			
			for (int i = 0; i < arrayData.length(); i++) {
				JSONObject objectData = arrayData.getJSONObject(i);
				
				VRProductionPlantSupplier object = null;

				long id = counterLocalService.increment(VRProductionPlantSupplier.class.getName());

				object = vrProductionPlantSupplierPersistence.create(id);

				object.setModifyDate(new Date());
				object.setMtCore(objectData.getLong("mtCore"));
				if (!"".equals(objectData.getString("syncDate"))) {
					object.setSyncDate(new Date(objectData.getString("syncDate")));
				}
				object.setCorporationCode(objectData.getString("corporationCode"));
				object.setCorporationName(objectData.getString("corporationName"));
				object.setCorporationAddress(objectData.getString("corporationAddress"));
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantId(vrProductionPlant.getPrimaryKey());
				object.setApplicantProfileId(vrProductionPlant.getApplicantProfileId());
				object.setApplicantCode(vrProductionPlant.getApplicantCode());
				object.setSupplierId(objectData.getLong("supplierId"));
				object.setSupplierName(objectData.getString("supplierName"));
				object.setSupplierAddress(objectData.getString("supplierAddress"));
				
				object = vrProductionPlantSupplierPersistence.update(object);
				
				vrProductionPlantSuppliers.add(object);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
		return vrProductionPlantSuppliers;
	}
	
}