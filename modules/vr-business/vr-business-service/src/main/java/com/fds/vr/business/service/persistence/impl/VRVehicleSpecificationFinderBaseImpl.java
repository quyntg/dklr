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

import com.fds.vr.business.model.VRVehicleSpecification;
import com.fds.vr.business.service.persistence.VRVehicleSpecificationPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author LamTV
 * @generated
 */
public class VRVehicleSpecificationFinderBaseImpl extends BasePersistenceImpl<VRVehicleSpecification> {
	@Override
	public Set<String> getBadColumnNames() {
		return getVRVehicleSpecificationPersistence().getBadColumnNames();
	}

	/**
	 * Returns the vr vehicle specification persistence.
	 *
	 * @return the vr vehicle specification persistence
	 */
	public VRVehicleSpecificationPersistence getVRVehicleSpecificationPersistence() {
		return vrVehicleSpecificationPersistence;
	}

	/**
	 * Sets the vr vehicle specification persistence.
	 *
	 * @param vrVehicleSpecificationPersistence the vr vehicle specification persistence
	 */
	public void setVRVehicleSpecificationPersistence(
		VRVehicleSpecificationPersistence vrVehicleSpecificationPersistence) {
		this.vrVehicleSpecificationPersistence = vrVehicleSpecificationPersistence;
	}

	@BeanReference(type = VRVehicleSpecificationPersistence.class)
	protected VRVehicleSpecificationPersistence vrVehicleSpecificationPersistence;
}