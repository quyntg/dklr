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

import com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentMarkupException;
import com.fds.vr.business.model.VRProductionPlantEquipmentMarkup;
import com.fds.vr.business.service.base.VRProductionPlantEquipmentMarkupLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr production plant equipment markup local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRProductionPlantEquipmentMarkupLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantEquipmentMarkupLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRProductionPlantEquipmentMarkupLocalServiceUtil
 */
@ProviderType
public class VRProductionPlantEquipmentMarkupLocalServiceImpl
		extends VRProductionPlantEquipmentMarkupLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRProductionPlantEquipmentMarkupLocalServiceUtil} to access the vr production plant equipment markup local service.
	 */

	public VRProductionPlantEquipmentMarkup createVRProductionPlantEquipmentMarkup(
			VRProductionPlantEquipmentMarkup object) throws SystemException {

		long id = counterLocalService.increment(VRProductionPlantEquipmentMarkup.class.getName());

		object.setId(id);

		return vrProductionPlantEquipmentMarkupPersistence.update(object);
	}
	
	public VRProductionPlantEquipmentMarkup deleteVRProductionPlantEquipmentMarkup(long id) throws NoSuchVRProductionPlantEquipmentMarkupException {
		return vrProductionPlantEquipmentMarkupPersistence.remove(id);
	}

	public VRProductionPlantEquipmentMarkup updateVRProductionPlantEquipmentMarkup(
			VRProductionPlantEquipmentMarkup object) throws SystemException {

		return vrProductionPlantEquipmentMarkupPersistence.update(object);
	}

	public List<VRProductionPlantEquipmentMarkup> findByproductionPlantEquipmentId(long productionPlantEquipmentId) {
		return vrProductionPlantEquipmentMarkupPersistence.findByproductionPlantEquipmentId(productionPlantEquipmentId);
	}
}