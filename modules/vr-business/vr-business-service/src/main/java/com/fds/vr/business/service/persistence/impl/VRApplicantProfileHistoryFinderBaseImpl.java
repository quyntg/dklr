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

import com.fds.vr.business.model.VRApplicantProfileHistory;
import com.fds.vr.business.service.persistence.VRApplicantProfileHistoryPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author LamTV
 * @generated
 */
public class VRApplicantProfileHistoryFinderBaseImpl extends BasePersistenceImpl<VRApplicantProfileHistory> {
	/**
	 * Returns the vr applicant profile history persistence.
	 *
	 * @return the vr applicant profile history persistence
	 */
	public VRApplicantProfileHistoryPersistence getVRApplicantProfileHistoryPersistence() {
		return vrApplicantProfileHistoryPersistence;
	}

	/**
	 * Sets the vr applicant profile history persistence.
	 *
	 * @param vrApplicantProfileHistoryPersistence the vr applicant profile history persistence
	 */
	public void setVRApplicantProfileHistoryPersistence(
		VRApplicantProfileHistoryPersistence vrApplicantProfileHistoryPersistence) {
		this.vrApplicantProfileHistoryPersistence = vrApplicantProfileHistoryPersistence;
	}

	@BeanReference(type = VRApplicantProfileHistoryPersistence.class)
	protected VRApplicantProfileHistoryPersistence vrApplicantProfileHistoryPersistence;
}