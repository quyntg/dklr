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

import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.service.persistence.VRVehicleTypeCertificatePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author LamTV
 * @generated
 */
public class VRVehicleTypeCertificateFinderBaseImpl extends BasePersistenceImpl<VRVehicleTypeCertificate> {
	/**
	 * Returns the vr vehicle type certificate persistence.
	 *
	 * @return the vr vehicle type certificate persistence
	 */
	public VRVehicleTypeCertificatePersistence getVRVehicleTypeCertificatePersistence() {
		return vrVehicleTypeCertificatePersistence;
	}

	/**
	 * Sets the vr vehicle type certificate persistence.
	 *
	 * @param vrVehicleTypeCertificatePersistence the vr vehicle type certificate persistence
	 */
	public void setVRVehicleTypeCertificatePersistence(
		VRVehicleTypeCertificatePersistence vrVehicleTypeCertificatePersistence) {
		this.vrVehicleTypeCertificatePersistence = vrVehicleTypeCertificatePersistence;
	}

	@BeanReference(type = VRVehicleTypeCertificatePersistence.class)
	protected VRVehicleTypeCertificatePersistence vrVehicleTypeCertificatePersistence;
}