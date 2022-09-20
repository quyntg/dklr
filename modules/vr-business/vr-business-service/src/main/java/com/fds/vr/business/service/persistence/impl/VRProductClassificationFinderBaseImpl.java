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

import com.fds.vr.business.model.VRProductClassification;
import com.fds.vr.business.service.persistence.VRProductClassificationPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author LamTV
 * @generated
 */
public class VRProductClassificationFinderBaseImpl extends BasePersistenceImpl<VRProductClassification> {
	/**
	 * Returns the vr product classification persistence.
	 *
	 * @return the vr product classification persistence
	 */
	public VRProductClassificationPersistence getVRProductClassificationPersistence() {
		return vrProductClassificationPersistence;
	}

	/**
	 * Sets the vr product classification persistence.
	 *
	 * @param vrProductClassificationPersistence the vr product classification persistence
	 */
	public void setVRProductClassificationPersistence(
		VRProductClassificationPersistence vrProductClassificationPersistence) {
		this.vrProductClassificationPersistence = vrProductClassificationPersistence;
	}

	@BeanReference(type = VRProductClassificationPersistence.class)
	protected VRProductClassificationPersistence vrProductClassificationPersistence;
}