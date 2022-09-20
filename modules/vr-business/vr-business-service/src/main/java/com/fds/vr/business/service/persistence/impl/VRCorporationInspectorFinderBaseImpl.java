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

import com.fds.vr.business.model.VRCorporationInspector;
import com.fds.vr.business.service.persistence.VRCorporationInspectorPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author LamTV
 * @generated
 */
public class VRCorporationInspectorFinderBaseImpl extends BasePersistenceImpl<VRCorporationInspector> {
	@Override
	public Set<String> getBadColumnNames() {
		return getVRCorporationInspectorPersistence().getBadColumnNames();
	}

	/**
	 * Returns the vr corporation inspector persistence.
	 *
	 * @return the vr corporation inspector persistence
	 */
	public VRCorporationInspectorPersistence getVRCorporationInspectorPersistence() {
		return vrCorporationInspectorPersistence;
	}

	/**
	 * Sets the vr corporation inspector persistence.
	 *
	 * @param vrCorporationInspectorPersistence the vr corporation inspector persistence
	 */
	public void setVRCorporationInspectorPersistence(
		VRCorporationInspectorPersistence vrCorporationInspectorPersistence) {
		this.vrCorporationInspectorPersistence = vrCorporationInspectorPersistence;
	}

	@BeanReference(type = VRCorporationInspectorPersistence.class)
	protected VRCorporationInspectorPersistence vrCorporationInspectorPersistence;
}