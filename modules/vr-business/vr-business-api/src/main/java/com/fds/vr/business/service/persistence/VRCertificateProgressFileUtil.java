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

import com.fds.vr.business.model.VRCertificateProgressFile;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr certificate progress file service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRCertificateProgressFilePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCertificateProgressFilePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRCertificateProgressFilePersistenceImpl
 * @generated
 */
@ProviderType
public class VRCertificateProgressFileUtil {
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
	public static void clearCache(
		VRCertificateProgressFile vrCertificateProgressFile) {
		getPersistence().clearCache(vrCertificateProgressFile);
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
	public static List<VRCertificateProgressFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRCertificateProgressFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRCertificateProgressFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRCertificateProgressFile> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRCertificateProgressFile update(
		VRCertificateProgressFile vrCertificateProgressFile) {
		return getPersistence().update(vrCertificateProgressFile);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRCertificateProgressFile update(
		VRCertificateProgressFile vrCertificateProgressFile,
		ServiceContext serviceContext) {
		return getPersistence().update(vrCertificateProgressFile, serviceContext);
	}

	/**
	* Caches the vr certificate progress file in the entity cache if it is enabled.
	*
	* @param vrCertificateProgressFile the vr certificate progress file
	*/
	public static void cacheResult(
		VRCertificateProgressFile vrCertificateProgressFile) {
		getPersistence().cacheResult(vrCertificateProgressFile);
	}

	/**
	* Caches the vr certificate progress files in the entity cache if it is enabled.
	*
	* @param vrCertificateProgressFiles the vr certificate progress files
	*/
	public static void cacheResult(
		List<VRCertificateProgressFile> vrCertificateProgressFiles) {
		getPersistence().cacheResult(vrCertificateProgressFiles);
	}

	/**
	* Creates a new vr certificate progress file with the primary key. Does not add the vr certificate progress file to the database.
	*
	* @param id the primary key for the new vr certificate progress file
	* @return the new vr certificate progress file
	*/
	public static VRCertificateProgressFile create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr certificate progress file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr certificate progress file
	* @return the vr certificate progress file that was removed
	* @throws NoSuchVRCertificateProgressFileException if a vr certificate progress file with the primary key could not be found
	*/
	public static VRCertificateProgressFile remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRCertificateProgressFileException {
		return getPersistence().remove(id);
	}

	public static VRCertificateProgressFile updateImpl(
		VRCertificateProgressFile vrCertificateProgressFile) {
		return getPersistence().updateImpl(vrCertificateProgressFile);
	}

	/**
	* Returns the vr certificate progress file with the primary key or throws a {@link NoSuchVRCertificateProgressFileException} if it could not be found.
	*
	* @param id the primary key of the vr certificate progress file
	* @return the vr certificate progress file
	* @throws NoSuchVRCertificateProgressFileException if a vr certificate progress file with the primary key could not be found
	*/
	public static VRCertificateProgressFile findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRCertificateProgressFileException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr certificate progress file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr certificate progress file
	* @return the vr certificate progress file, or <code>null</code> if a vr certificate progress file with the primary key could not be found
	*/
	public static VRCertificateProgressFile fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRCertificateProgressFile> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr certificate progress files.
	*
	* @return the vr certificate progress files
	*/
	public static List<VRCertificateProgressFile> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr certificate progress files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr certificate progress files
	* @param end the upper bound of the range of vr certificate progress files (not inclusive)
	* @return the range of vr certificate progress files
	*/
	public static List<VRCertificateProgressFile> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr certificate progress files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr certificate progress files
	* @param end the upper bound of the range of vr certificate progress files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr certificate progress files
	*/
	public static List<VRCertificateProgressFile> findAll(int start, int end,
		OrderByComparator<VRCertificateProgressFile> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr certificate progress files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr certificate progress files
	* @param end the upper bound of the range of vr certificate progress files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr certificate progress files
	*/
	public static List<VRCertificateProgressFile> findAll(int start, int end,
		OrderByComparator<VRCertificateProgressFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr certificate progress files from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr certificate progress files.
	*
	* @return the number of vr certificate progress files
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRCertificateProgressFilePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCertificateProgressFilePersistence, VRCertificateProgressFilePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRCertificateProgressFilePersistence.class);
}