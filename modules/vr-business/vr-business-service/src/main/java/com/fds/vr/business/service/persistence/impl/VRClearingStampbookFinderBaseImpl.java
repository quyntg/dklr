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

import com.fds.vr.business.model.VRClearingStampbook;
import com.fds.vr.business.service.persistence.VRClearingStampbookPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author LamTV
 * @generated
 */
public class VRClearingStampbookFinderBaseImpl extends BasePersistenceImpl<VRClearingStampbook> {
	/**
	 * Returns the vr clearing stampbook persistence.
	 *
	 * @return the vr clearing stampbook persistence
	 */
	public VRClearingStampbookPersistence getVRClearingStampbookPersistence() {
		return vrClearingStampbookPersistence;
	}

	/**
	 * Sets the vr clearing stampbook persistence.
	 *
	 * @param vrClearingStampbookPersistence the vr clearing stampbook persistence
	 */
	public void setVRClearingStampbookPersistence(
		VRClearingStampbookPersistence vrClearingStampbookPersistence) {
		this.vrClearingStampbookPersistence = vrClearingStampbookPersistence;
	}

	@BeanReference(type = VRClearingStampbookPersistence.class)
	protected VRClearingStampbookPersistence vrClearingStampbookPersistence;
}