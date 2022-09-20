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

import com.fds.vr.business.model.VRActionconfig;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr actionconfig service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRActionconfigPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRActionconfigPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRActionconfigPersistenceImpl
 * @generated
 */
@ProviderType
public class VRActionconfigUtil {
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
	public static void clearCache(VRActionconfig vrActionconfig) {
		getPersistence().clearCache(vrActionconfig);
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
	public static List<VRActionconfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRActionconfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRActionconfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRActionconfig> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRActionconfig update(VRActionconfig vrActionconfig) {
		return getPersistence().update(vrActionconfig);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRActionconfig update(VRActionconfig vrActionconfig,
		ServiceContext serviceContext) {
		return getPersistence().update(vrActionconfig, serviceContext);
	}

	/**
	* Returns the vr actionconfig where actionCode = &#63; and processNo = &#63; or throws a {@link NoSuchVRActionconfigException} if it could not be found.
	*
	* @param actionCode the action code
	* @param processNo the process no
	* @return the matching vr actionconfig
	* @throws NoSuchVRActionconfigException if a matching vr actionconfig could not be found
	*/
	public static VRActionconfig findByA_P(java.lang.String actionCode,
		java.lang.String processNo)
		throws com.fds.vr.business.exception.NoSuchVRActionconfigException {
		return getPersistence().findByA_P(actionCode, processNo);
	}

	/**
	* Returns the vr actionconfig where actionCode = &#63; and processNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param actionCode the action code
	* @param processNo the process no
	* @return the matching vr actionconfig, or <code>null</code> if a matching vr actionconfig could not be found
	*/
	public static VRActionconfig fetchByA_P(java.lang.String actionCode,
		java.lang.String processNo) {
		return getPersistence().fetchByA_P(actionCode, processNo);
	}

	/**
	* Returns the vr actionconfig where actionCode = &#63; and processNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param actionCode the action code
	* @param processNo the process no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr actionconfig, or <code>null</code> if a matching vr actionconfig could not be found
	*/
	public static VRActionconfig fetchByA_P(java.lang.String actionCode,
		java.lang.String processNo, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByA_P(actionCode, processNo, retrieveFromCache);
	}

	/**
	* Removes the vr actionconfig where actionCode = &#63; and processNo = &#63; from the database.
	*
	* @param actionCode the action code
	* @param processNo the process no
	* @return the vr actionconfig that was removed
	*/
	public static VRActionconfig removeByA_P(java.lang.String actionCode,
		java.lang.String processNo)
		throws com.fds.vr.business.exception.NoSuchVRActionconfigException {
		return getPersistence().removeByA_P(actionCode, processNo);
	}

	/**
	* Returns the number of vr actionconfigs where actionCode = &#63; and processNo = &#63;.
	*
	* @param actionCode the action code
	* @param processNo the process no
	* @return the number of matching vr actionconfigs
	*/
	public static int countByA_P(java.lang.String actionCode,
		java.lang.String processNo) {
		return getPersistence().countByA_P(actionCode, processNo);
	}

	/**
	* Caches the vr actionconfig in the entity cache if it is enabled.
	*
	* @param vrActionconfig the vr actionconfig
	*/
	public static void cacheResult(VRActionconfig vrActionconfig) {
		getPersistence().cacheResult(vrActionconfig);
	}

	/**
	* Caches the vr actionconfigs in the entity cache if it is enabled.
	*
	* @param vrActionconfigs the vr actionconfigs
	*/
	public static void cacheResult(List<VRActionconfig> vrActionconfigs) {
		getPersistence().cacheResult(vrActionconfigs);
	}

	/**
	* Creates a new vr actionconfig with the primary key. Does not add the vr actionconfig to the database.
	*
	* @param id the primary key for the new vr actionconfig
	* @return the new vr actionconfig
	*/
	public static VRActionconfig create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr actionconfig with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr actionconfig
	* @return the vr actionconfig that was removed
	* @throws NoSuchVRActionconfigException if a vr actionconfig with the primary key could not be found
	*/
	public static VRActionconfig remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRActionconfigException {
		return getPersistence().remove(id);
	}

	public static VRActionconfig updateImpl(VRActionconfig vrActionconfig) {
		return getPersistence().updateImpl(vrActionconfig);
	}

	/**
	* Returns the vr actionconfig with the primary key or throws a {@link NoSuchVRActionconfigException} if it could not be found.
	*
	* @param id the primary key of the vr actionconfig
	* @return the vr actionconfig
	* @throws NoSuchVRActionconfigException if a vr actionconfig with the primary key could not be found
	*/
	public static VRActionconfig findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRActionconfigException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr actionconfig with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr actionconfig
	* @return the vr actionconfig, or <code>null</code> if a vr actionconfig with the primary key could not be found
	*/
	public static VRActionconfig fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRActionconfig> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr actionconfigs.
	*
	* @return the vr actionconfigs
	*/
	public static List<VRActionconfig> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr actionconfigs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRActionconfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr actionconfigs
	* @param end the upper bound of the range of vr actionconfigs (not inclusive)
	* @return the range of vr actionconfigs
	*/
	public static List<VRActionconfig> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr actionconfigs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRActionconfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr actionconfigs
	* @param end the upper bound of the range of vr actionconfigs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr actionconfigs
	*/
	public static List<VRActionconfig> findAll(int start, int end,
		OrderByComparator<VRActionconfig> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr actionconfigs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRActionconfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr actionconfigs
	* @param end the upper bound of the range of vr actionconfigs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr actionconfigs
	*/
	public static List<VRActionconfig> findAll(int start, int end,
		OrderByComparator<VRActionconfig> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr actionconfigs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr actionconfigs.
	*
	* @return the number of vr actionconfigs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRActionconfigPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRActionconfigPersistence, VRActionconfigPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRActionconfigPersistence.class);
}