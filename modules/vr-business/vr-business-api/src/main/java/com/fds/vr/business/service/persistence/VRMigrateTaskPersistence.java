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

package com.fds.vr.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.exception.NoSuchVRMigrateTaskException;
import com.fds.vr.business.model.VRMigrateTask;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr migrate task service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRMigrateTaskPersistenceImpl
 * @see VRMigrateTaskUtil
 * @generated
 */
@ProviderType
public interface VRMigrateTaskPersistence extends BasePersistence<VRMigrateTask> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRMigrateTaskUtil} to access the vr migrate task persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr migrate task in the entity cache if it is enabled.
	*
	* @param vrMigrateTask the vr migrate task
	*/
	public void cacheResult(VRMigrateTask vrMigrateTask);

	/**
	* Caches the vr migrate tasks in the entity cache if it is enabled.
	*
	* @param vrMigrateTasks the vr migrate tasks
	*/
	public void cacheResult(java.util.List<VRMigrateTask> vrMigrateTasks);

	/**
	* Creates a new vr migrate task with the primary key. Does not add the vr migrate task to the database.
	*
	* @param task_id the primary key for the new vr migrate task
	* @return the new vr migrate task
	*/
	public VRMigrateTask create(long task_id);

	/**
	* Removes the vr migrate task with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param task_id the primary key of the vr migrate task
	* @return the vr migrate task that was removed
	* @throws NoSuchVRMigrateTaskException if a vr migrate task with the primary key could not be found
	*/
	public VRMigrateTask remove(long task_id)
		throws NoSuchVRMigrateTaskException;

	public VRMigrateTask updateImpl(VRMigrateTask vrMigrateTask);

	/**
	* Returns the vr migrate task with the primary key or throws a {@link NoSuchVRMigrateTaskException} if it could not be found.
	*
	* @param task_id the primary key of the vr migrate task
	* @return the vr migrate task
	* @throws NoSuchVRMigrateTaskException if a vr migrate task with the primary key could not be found
	*/
	public VRMigrateTask findByPrimaryKey(long task_id)
		throws NoSuchVRMigrateTaskException;

	/**
	* Returns the vr migrate task with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param task_id the primary key of the vr migrate task
	* @return the vr migrate task, or <code>null</code> if a vr migrate task with the primary key could not be found
	*/
	public VRMigrateTask fetchByPrimaryKey(long task_id);

	@Override
	public java.util.Map<java.io.Serializable, VRMigrateTask> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr migrate tasks.
	*
	* @return the vr migrate tasks
	*/
	public java.util.List<VRMigrateTask> findAll();

	/**
	* Returns a range of all the vr migrate tasks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateTaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr migrate tasks
	* @param end the upper bound of the range of vr migrate tasks (not inclusive)
	* @return the range of vr migrate tasks
	*/
	public java.util.List<VRMigrateTask> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr migrate tasks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateTaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr migrate tasks
	* @param end the upper bound of the range of vr migrate tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr migrate tasks
	*/
	public java.util.List<VRMigrateTask> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateTask> orderByComparator);

	/**
	* Returns an ordered range of all the vr migrate tasks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateTaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr migrate tasks
	* @param end the upper bound of the range of vr migrate tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr migrate tasks
	*/
	public java.util.List<VRMigrateTask> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateTask> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr migrate tasks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr migrate tasks.
	*
	* @return the number of vr migrate tasks
	*/
	public int countAll();
}