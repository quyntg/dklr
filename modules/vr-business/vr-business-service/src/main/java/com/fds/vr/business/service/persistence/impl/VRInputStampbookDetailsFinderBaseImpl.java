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

import com.fds.vr.business.model.VRInputStampbookDetails;
import com.fds.vr.business.service.persistence.VRInputStampbookDetailsPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author LamTV
 * @generated
 */
public class VRInputStampbookDetailsFinderBaseImpl extends BasePersistenceImpl<VRInputStampbookDetails> {
	@Override
	public Set<String> getBadColumnNames() {
		return getVRInputStampbookDetailsPersistence()
				   .getBadColumnNames();
	}

	/**
	 * Returns the vr input stampbook details persistence.
	 *
	 * @return the vr input stampbook details persistence
	 */
	public VRInputStampbookDetailsPersistence getVRInputStampbookDetailsPersistence() {
		return vrInputStampbookDetailsPersistence;
	}

	/**
	 * Sets the vr input stampbook details persistence.
	 *
	 * @param vrInputStampbookDetailsPersistence the vr input stampbook details persistence
	 */
	public void setVRInputStampbookDetailsPersistence(
		VRInputStampbookDetailsPersistence vrInputStampbookDetailsPersistence) {
		this.vrInputStampbookDetailsPersistence = vrInputStampbookDetailsPersistence;
	}

	@BeanReference(type = VRInputStampbookDetailsPersistence.class)
	protected VRInputStampbookDetailsPersistence vrInputStampbookDetailsPersistence;
}