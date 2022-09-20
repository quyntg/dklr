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

import com.fds.vr.business.model.VRHistoryProfile;
import com.fds.vr.business.service.persistence.VRHistoryProfilePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author LamTV
 * @generated
 */
public class VRHistoryProfileFinderBaseImpl extends BasePersistenceImpl<VRHistoryProfile> {
	/**
	 * Returns the vr history profile persistence.
	 *
	 * @return the vr history profile persistence
	 */
	public VRHistoryProfilePersistence getVRHistoryProfilePersistence() {
		return vrHistoryProfilePersistence;
	}

	/**
	 * Sets the vr history profile persistence.
	 *
	 * @param vrHistoryProfilePersistence the vr history profile persistence
	 */
	public void setVRHistoryProfilePersistence(
		VRHistoryProfilePersistence vrHistoryProfilePersistence) {
		this.vrHistoryProfilePersistence = vrHistoryProfilePersistence;
	}

	@BeanReference(type = VRHistoryProfilePersistence.class)
	protected VRHistoryProfilePersistence vrHistoryProfilePersistence;
}