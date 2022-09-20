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

package com.fds.vr.business.service.persistence.impl;

import com.fds.vr.business.model.VRVehicleEquipment;
import com.fds.vr.business.service.persistence.VRVehicleEquipmentPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author LamTV
 * @generated
 */
public class VRVehicleEquipmentFinderBaseImpl extends BasePersistenceImpl<VRVehicleEquipment> {
	@Override
	public Set<String> getBadColumnNames() {
		return getVRVehicleEquipmentPersistence().getBadColumnNames();
	}

	/**
	 * Returns the vr vehicle equipment persistence.
	 *
	 * @return the vr vehicle equipment persistence
	 */
	public VRVehicleEquipmentPersistence getVRVehicleEquipmentPersistence() {
		return vrVehicleEquipmentPersistence;
	}

	/**
	 * Sets the vr vehicle equipment persistence.
	 *
	 * @param vrVehicleEquipmentPersistence the vr vehicle equipment persistence
	 */
	public void setVRVehicleEquipmentPersistence(
		VRVehicleEquipmentPersistence vrVehicleEquipmentPersistence) {
		this.vrVehicleEquipmentPersistence = vrVehicleEquipmentPersistence;
	}

	@BeanReference(type = VRVehicleEquipmentPersistence.class)
	protected VRVehicleEquipmentPersistence vrVehicleEquipmentPersistence;
}