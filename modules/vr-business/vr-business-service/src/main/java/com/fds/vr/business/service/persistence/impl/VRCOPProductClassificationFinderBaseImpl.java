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

import com.fds.vr.business.model.VRCOPProductClassification;
import com.fds.vr.business.service.persistence.VRCOPProductClassificationPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author LamTV
 * @generated
 */
public class VRCOPProductClassificationFinderBaseImpl
	extends BasePersistenceImpl<VRCOPProductClassification> {
	/**
	 * Returns the vrcop product classification persistence.
	 *
	 * @return the vrcop product classification persistence
	 */
	public VRCOPProductClassificationPersistence getVRCOPProductClassificationPersistence() {
		return vrcopProductClassificationPersistence;
	}

	/**
	 * Sets the vrcop product classification persistence.
	 *
	 * @param vrcopProductClassificationPersistence the vrcop product classification persistence
	 */
	public void setVRCOPProductClassificationPersistence(
		VRCOPProductClassificationPersistence vrcopProductClassificationPersistence) {
		this.vrcopProductClassificationPersistence = vrcopProductClassificationPersistence;
	}

	@BeanReference(type = VRCOPProductClassificationPersistence.class)
	protected VRCOPProductClassificationPersistence vrcopProductClassificationPersistence;
}