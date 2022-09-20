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

package com.fds.vr.business.service.impl;

import com.fds.vr.business.model.VRMigrateReview;
import com.fds.vr.business.service.base.VRMigrateReviewLocalServiceBaseImpl;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;

import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr migrate review local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRMigrateReviewLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRMigrateReviewLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRMigrateReviewLocalServiceUtil
 */
@ProviderType
public class VRMigrateReviewLocalServiceImpl extends VRMigrateReviewLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRMigrateReviewLocalServiceUtil} to access the vr
	 * migrate review local service.
	 */

	public List<VRMigrateReview> findByTaskMigrateId(int taskMigrationID, int start, int end) {
		return vrMigrateReviewPersistence.findBytaskMigrationID(taskMigrationID, start, end,
				OrderByComparatorFactoryUtil.create("vr_migrate_review", "ID", false));
	}
}