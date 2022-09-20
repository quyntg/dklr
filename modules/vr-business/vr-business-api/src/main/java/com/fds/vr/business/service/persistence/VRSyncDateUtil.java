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

import com.fds.vr.business.model.VRSyncDate;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr sync date service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRSyncDatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRSyncDatePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRSyncDatePersistenceImpl
 * @generated
 */
@ProviderType
public class VRSyncDateUtil {
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
	public static void clearCache(VRSyncDate vrSyncDate) {
		getPersistence().clearCache(vrSyncDate);
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
	public static List<VRSyncDate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRSyncDate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRSyncDate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRSyncDate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRSyncDate update(VRSyncDate vrSyncDate) {
		return getPersistence().update(vrSyncDate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRSyncDate update(VRSyncDate vrSyncDate,
		ServiceContext serviceContext) {
		return getPersistence().update(vrSyncDate, serviceContext);
	}

	/**
	* Caches the vr sync date in the entity cache if it is enabled.
	*
	* @param vrSyncDate the vr sync date
	*/
	public static void cacheResult(VRSyncDate vrSyncDate) {
		getPersistence().cacheResult(vrSyncDate);
	}

	/**
	* Caches the vr sync dates in the entity cache if it is enabled.
	*
	* @param vrSyncDates the vr sync dates
	*/
	public static void cacheResult(List<VRSyncDate> vrSyncDates) {
		getPersistence().cacheResult(vrSyncDates);
	}

	/**
	* Creates a new vr sync date with the primary key. Does not add the vr sync date to the database.
	*
	* @param id the primary key for the new vr sync date
	* @return the new vr sync date
	*/
	public static VRSyncDate create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr sync date with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr sync date
	* @return the vr sync date that was removed
	* @throws NoSuchVRSyncDateException if a vr sync date with the primary key could not be found
	*/
	public static VRSyncDate remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRSyncDateException {
		return getPersistence().remove(id);
	}

	public static VRSyncDate updateImpl(VRSyncDate vrSyncDate) {
		return getPersistence().updateImpl(vrSyncDate);
	}

	/**
	* Returns the vr sync date with the primary key or throws a {@link NoSuchVRSyncDateException} if it could not be found.
	*
	* @param id the primary key of the vr sync date
	* @return the vr sync date
	* @throws NoSuchVRSyncDateException if a vr sync date with the primary key could not be found
	*/
	public static VRSyncDate findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRSyncDateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr sync date with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr sync date
	* @return the vr sync date, or <code>null</code> if a vr sync date with the primary key could not be found
	*/
	public static VRSyncDate fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRSyncDate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr sync dates.
	*
	* @return the vr sync dates
	*/
	public static List<VRSyncDate> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr sync dates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr sync dates
	* @param end the upper bound of the range of vr sync dates (not inclusive)
	* @return the range of vr sync dates
	*/
	public static List<VRSyncDate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr sync dates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr sync dates
	* @param end the upper bound of the range of vr sync dates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr sync dates
	*/
	public static List<VRSyncDate> findAll(int start, int end,
		OrderByComparator<VRSyncDate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr sync dates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr sync dates
	* @param end the upper bound of the range of vr sync dates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr sync dates
	*/
	public static List<VRSyncDate> findAll(int start, int end,
		OrderByComparator<VRSyncDate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr sync dates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr sync dates.
	*
	* @return the number of vr sync dates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRSyncDatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRSyncDatePersistence, VRSyncDatePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRSyncDatePersistence.class);
}