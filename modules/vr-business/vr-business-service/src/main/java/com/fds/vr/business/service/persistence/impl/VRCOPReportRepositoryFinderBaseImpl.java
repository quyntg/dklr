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

import com.fds.vr.business.model.VRCOPReportRepository;
import com.fds.vr.business.service.persistence.VRCOPReportRepositoryPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author LamTV
 * @generated
 */
public class VRCOPReportRepositoryFinderBaseImpl extends BasePersistenceImpl<VRCOPReportRepository> {
	/**
	 * Returns the vrcop report repository persistence.
	 *
	 * @return the vrcop report repository persistence
	 */
	public VRCOPReportRepositoryPersistence getVRCOPReportRepositoryPersistence() {
		return vrcopReportRepositoryPersistence;
	}

	/**
	 * Sets the vrcop report repository persistence.
	 *
	 * @param vrcopReportRepositoryPersistence the vrcop report repository persistence
	 */
	public void setVRCOPReportRepositoryPersistence(
		VRCOPReportRepositoryPersistence vrcopReportRepositoryPersistence) {
		this.vrcopReportRepositoryPersistence = vrcopReportRepositoryPersistence;
	}

	@BeanReference(type = VRCOPReportRepositoryPersistence.class)
	protected VRCOPReportRepositoryPersistence vrcopReportRepositoryPersistence;
}