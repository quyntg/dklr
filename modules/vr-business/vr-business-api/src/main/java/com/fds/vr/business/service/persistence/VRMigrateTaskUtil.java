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

import com.fds.vr.business.model.VRMigrateTask;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr migrate task service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRMigrateTaskPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRMigrateTaskPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRMigrateTaskPersistenceImpl
 * @generated
 */
@ProviderType
public class VRMigrateTaskUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(VRMigrateTask vrMigrateTask) {
		getPersistence().clearCache(vrMigrateTask);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VRMigrateTask> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRMigrateTask> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRMigrateTask> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRMigrateTask> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRMigrateTask update(VRMigrateTask vrMigrateTask) {
		return getPersistence().update(vrMigrateTask);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRMigrateTask update(VRMigrateTask vrMigrateTask,
		ServiceContext serviceContext) {
		return getPersistence().update(vrMigrateTask, serviceContext);
	}

	/**
	* Caches the vr migrate task in the entity cache if it is enabled.
	*
	* @param vrMigrateTask the vr migrate task
	*/
	public static void cacheResult(VRMigrateTask vrMigrateTask) {
		getPersistence().cacheResult(vrMigrateTask);
	}

	/**
	* Caches the vr migrate tasks in the entity cache if it is enabled.
	*
	* @param vrMigrateTasks the vr migrate tasks
	*/
	public static void cacheResult(List<VRMigrateTask> vrMigrateTasks) {
		getPersistence().cacheResult(vrMigrateTasks);
	}

	/**
	* Creates a new vr migrate task with the primary key. Does not add the vr migrate task to the database.
	*
	* @param task_id the primary key for the new vr migrate task
	* @return the new vr migrate task
	*/
	public static VRMigrateTask create(long task_id) {
		return getPersistence().create(task_id);
	}

	/**
	* Removes the vr migrate task with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param task_id the primary key of the vr migrate task
	* @return the vr migrate task that was removed
	* @throws NoSuchVRMigrateTaskException if a vr migrate task with the primary key could not be found
	*/
	public static VRMigrateTask remove(long task_id)
		throws com.fds.vr.business.exception.NoSuchVRMigrateTaskException {
		return getPersistence().remove(task_id);
	}

	public static VRMigrateTask updateImpl(VRMigrateTask vrMigrateTask) {
		return getPersistence().updateImpl(vrMigrateTask);
	}

	/**
	* Returns the vr migrate task with the primary key or throws a {@link NoSuchVRMigrateTaskException} if it could not be found.
	*
	* @param task_id the primary key of the vr migrate task
	* @return the vr migrate task
	* @throws NoSuchVRMigrateTaskException if a vr migrate task with the primary key could not be found
	*/
	public static VRMigrateTask findByPrimaryKey(long task_id)
		throws com.fds.vr.business.exception.NoSuchVRMigrateTaskException {
		return getPersistence().findByPrimaryKey(task_id);
	}

	/**
	* Returns the vr migrate task with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param task_id the primary key of the vr migrate task
	* @return the vr migrate task, or <code>null</code> if a vr migrate task with the primary key could not be found
	*/
	public static VRMigrateTask fetchByPrimaryKey(long task_id) {
		return getPersistence().fetchByPrimaryKey(task_id);
	}

	public static java.util.Map<java.io.Serializable, VRMigrateTask> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr migrate tasks.
	*
	* @return the vr migrate tasks
	*/
	public static List<VRMigrateTask> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VRMigrateTask> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VRMigrateTask> findAll(int start, int end,
		OrderByComparator<VRMigrateTask> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VRMigrateTask> findAll(int start, int end,
		OrderByComparator<VRMigrateTask> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr migrate tasks from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr migrate tasks.
	*
	* @return the number of vr migrate tasks
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRMigrateTaskPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRMigrateTaskPersistence, VRMigrateTaskPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRMigrateTaskPersistence.class);
}