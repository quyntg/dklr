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

import com.fds.vr.business.model.VRCorporationView;
import com.fds.vr.business.service.persistence.VRCorporationViewPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author LamTV
 * @generated
 */
public class VRCorporationViewFinderBaseImpl extends BasePersistenceImpl<VRCorporationView> {
	@Override
	public Set<String> getBadColumnNames() {
		return getVRCorporationViewPersistence().getBadColumnNames();
	}

	/**
	 * Returns the vr corporation view persistence.
	 *
	 * @return the vr corporation view persistence
	 */
	public VRCorporationViewPersistence getVRCorporationViewPersistence() {
		return vrCorporationViewPersistence;
	}

	/**
	 * Sets the vr corporation view persistence.
	 *
	 * @param vrCorporationViewPersistence the vr corporation view persistence
	 */
	public void setVRCorporationViewPersistence(
		VRCorporationViewPersistence vrCorporationViewPersistence) {
		this.vrCorporationViewPersistence = vrCorporationViewPersistence;
	}

	@BeanReference(type = VRCorporationViewPersistence.class)
	protected VRCorporationViewPersistence vrCorporationViewPersistence;
}