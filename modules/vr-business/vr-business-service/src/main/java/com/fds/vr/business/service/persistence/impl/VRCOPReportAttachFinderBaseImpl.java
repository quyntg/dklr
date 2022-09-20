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

import com.fds.vr.business.model.VRCOPReportAttach;
import com.fds.vr.business.service.persistence.VRCOPReportAttachPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author LamTV
 * @generated
 */
public class VRCOPReportAttachFinderBaseImpl extends BasePersistenceImpl<VRCOPReportAttach> {
	@Override
	public Set<String> getBadColumnNames() {
		return getVRCOPReportAttachPersistence().getBadColumnNames();
	}

	/**
	 * Returns the vrcop report attach persistence.
	 *
	 * @return the vrcop report attach persistence
	 */
	public VRCOPReportAttachPersistence getVRCOPReportAttachPersistence() {
		return vrcopReportAttachPersistence;
	}

	/**
	 * Sets the vrcop report attach persistence.
	 *
	 * @param vrcopReportAttachPersistence the vrcop report attach persistence
	 */
	public void setVRCOPReportAttachPersistence(
		VRCOPReportAttachPersistence vrcopReportAttachPersistence) {
		this.vrcopReportAttachPersistence = vrcopReportAttachPersistence;
	}

	@BeanReference(type = VRCOPReportAttachPersistence.class)
	protected VRCOPReportAttachPersistence vrcopReportAttachPersistence;
}