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

import com.fds.vr.business.model.VRCertificateProgress;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr certificate progress service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRCertificateProgressPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCertificateProgressPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRCertificateProgressPersistenceImpl
 * @generated
 */
@ProviderType
public class VRCertificateProgressUtil {
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
	public static void clearCache(VRCertificateProgress vrCertificateProgress) {
		getPersistence().clearCache(vrCertificateProgress);
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
	public static List<VRCertificateProgress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRCertificateProgress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRCertificateProgress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRCertificateProgress> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRCertificateProgress update(
		VRCertificateProgress vrCertificateProgress) {
		return getPersistence().update(vrCertificateProgress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRCertificateProgress update(
		VRCertificateProgress vrCertificateProgress,
		ServiceContext serviceContext) {
		return getPersistence().update(vrCertificateProgress, serviceContext);
	}

	/**
	* Caches the vr certificate progress in the entity cache if it is enabled.
	*
	* @param vrCertificateProgress the vr certificate progress
	*/
	public static void cacheResult(VRCertificateProgress vrCertificateProgress) {
		getPersistence().cacheResult(vrCertificateProgress);
	}

	/**
	* Caches the vr certificate progresses in the entity cache if it is enabled.
	*
	* @param vrCertificateProgresses the vr certificate progresses
	*/
	public static void cacheResult(
		List<VRCertificateProgress> vrCertificateProgresses) {
		getPersistence().cacheResult(vrCertificateProgresses);
	}

	/**
	* Creates a new vr certificate progress with the primary key. Does not add the vr certificate progress to the database.
	*
	* @param id the primary key for the new vr certificate progress
	* @return the new vr certificate progress
	*/
	public static VRCertificateProgress create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr certificate progress with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr certificate progress
	* @return the vr certificate progress that was removed
	* @throws NoSuchVRCertificateProgressException if a vr certificate progress with the primary key could not be found
	*/
	public static VRCertificateProgress remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRCertificateProgressException {
		return getPersistence().remove(id);
	}

	public static VRCertificateProgress updateImpl(
		VRCertificateProgress vrCertificateProgress) {
		return getPersistence().updateImpl(vrCertificateProgress);
	}

	/**
	* Returns the vr certificate progress with the primary key or throws a {@link NoSuchVRCertificateProgressException} if it could not be found.
	*
	* @param id the primary key of the vr certificate progress
	* @return the vr certificate progress
	* @throws NoSuchVRCertificateProgressException if a vr certificate progress with the primary key could not be found
	*/
	public static VRCertificateProgress findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRCertificateProgressException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr certificate progress with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr certificate progress
	* @return the vr certificate progress, or <code>null</code> if a vr certificate progress with the primary key could not be found
	*/
	public static VRCertificateProgress fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRCertificateProgress> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr certificate progresses.
	*
	* @return the vr certificate progresses
	*/
	public static List<VRCertificateProgress> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr certificate progresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr certificate progresses
	* @param end the upper bound of the range of vr certificate progresses (not inclusive)
	* @return the range of vr certificate progresses
	*/
	public static List<VRCertificateProgress> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr certificate progresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr certificate progresses
	* @param end the upper bound of the range of vr certificate progresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr certificate progresses
	*/
	public static List<VRCertificateProgress> findAll(int start, int end,
		OrderByComparator<VRCertificateProgress> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr certificate progresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr certificate progresses
	* @param end the upper bound of the range of vr certificate progresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr certificate progresses
	*/
	public static List<VRCertificateProgress> findAll(int start, int end,
		OrderByComparator<VRCertificateProgress> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr certificate progresses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr certificate progresses.
	*
	* @return the number of vr certificate progresses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRCertificateProgressPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCertificateProgressPersistence, VRCertificateProgressPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRCertificateProgressPersistence.class);
}