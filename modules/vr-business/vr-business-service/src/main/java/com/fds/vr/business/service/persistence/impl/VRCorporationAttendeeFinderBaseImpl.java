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

import com.fds.vr.business.model.VRCorporationAttendee;
import com.fds.vr.business.service.persistence.VRCorporationAttendeePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author LamTV
 * @generated
 */
public class VRCorporationAttendeeFinderBaseImpl extends BasePersistenceImpl<VRCorporationAttendee> {
	/**
	 * Returns the vr corporation attendee persistence.
	 *
	 * @return the vr corporation attendee persistence
	 */
	public VRCorporationAttendeePersistence getVRCorporationAttendeePersistence() {
		return vrCorporationAttendeePersistence;
	}

	/**
	 * Sets the vr corporation attendee persistence.
	 *
	 * @param vrCorporationAttendeePersistence the vr corporation attendee persistence
	 */
	public void setVRCorporationAttendeePersistence(
		VRCorporationAttendeePersistence vrCorporationAttendeePersistence) {
		this.vrCorporationAttendeePersistence = vrCorporationAttendeePersistence;
	}

	@BeanReference(type = VRCorporationAttendeePersistence.class)
	protected VRCorporationAttendeePersistence vrCorporationAttendeePersistence;
}