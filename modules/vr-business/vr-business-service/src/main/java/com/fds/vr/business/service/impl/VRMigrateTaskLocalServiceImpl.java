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

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRMigrateTask;
import com.fds.vr.business.service.base.VRMigrateTaskLocalServiceBaseImpl;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;

import java.util.List;

/**
 * The implementation of the vr migrate task local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRMigrateTaskLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRMigrateTaskLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRMigrateTaskLocalServiceUtil
 */
@ProviderType
public class VRMigrateTaskLocalServiceImpl extends VRMigrateTaskLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRMigrateTaskLocalServiceUtil} to access the vr
	 * migrate task local service.
	 */
	public List<VRMigrateTask> findVRMigrateTasks(int start, int end) {
		return vrMigrateTaskPersistence.findAll(start, end,
				OrderByComparatorFactoryUtil.create("vr_migrate_task", "task_id", false));
	}
}