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

import com.fds.vr.business.model.VRTemplateNo;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr template no service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRTemplateNoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTemplateNoPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRTemplateNoPersistenceImpl
 * @generated
 */
@ProviderType
public class VRTemplateNoUtil {
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
	public static void clearCache(VRTemplateNo vrTemplateNo) {
		getPersistence().clearCache(vrTemplateNo);
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
	public static List<VRTemplateNo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRTemplateNo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRTemplateNo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRTemplateNo> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRTemplateNo update(VRTemplateNo vrTemplateNo) {
		return getPersistence().update(vrTemplateNo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRTemplateNo update(VRTemplateNo vrTemplateNo,
		ServiceContext serviceContext) {
		return getPersistence().update(vrTemplateNo, serviceContext);
	}

	/**
	* Returns the vr template no where patternNo = &#63; or throws a {@link NoSuchVRTemplateNoException} if it could not be found.
	*
	* @param patternNo the pattern no
	* @return the matching vr template no
	* @throws NoSuchVRTemplateNoException if a matching vr template no could not be found
	*/
	public static VRTemplateNo findByP_N(java.lang.String patternNo)
		throws com.fds.vr.business.exception.NoSuchVRTemplateNoException {
		return getPersistence().findByP_N(patternNo);
	}

	/**
	* Returns the vr template no where patternNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param patternNo the pattern no
	* @return the matching vr template no, or <code>null</code> if a matching vr template no could not be found
	*/
	public static VRTemplateNo fetchByP_N(java.lang.String patternNo) {
		return getPersistence().fetchByP_N(patternNo);
	}

	/**
	* Returns the vr template no where patternNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param patternNo the pattern no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr template no, or <code>null</code> if a matching vr template no could not be found
	*/
	public static VRTemplateNo fetchByP_N(java.lang.String patternNo,
		boolean retrieveFromCache) {
		return getPersistence().fetchByP_N(patternNo, retrieveFromCache);
	}

	/**
	* Removes the vr template no where patternNo = &#63; from the database.
	*
	* @param patternNo the pattern no
	* @return the vr template no that was removed
	*/
	public static VRTemplateNo removeByP_N(java.lang.String patternNo)
		throws com.fds.vr.business.exception.NoSuchVRTemplateNoException {
		return getPersistence().removeByP_N(patternNo);
	}

	/**
	* Returns the number of vr template nos where patternNo = &#63;.
	*
	* @param patternNo the pattern no
	* @return the number of matching vr template nos
	*/
	public static int countByP_N(java.lang.String patternNo) {
		return getPersistence().countByP_N(patternNo);
	}

	/**
	* Returns the vr template no where patternNo = &#63; and year = &#63; or throws a {@link NoSuchVRTemplateNoException} if it could not be found.
	*
	* @param patternNo the pattern no
	* @param year the year
	* @return the matching vr template no
	* @throws NoSuchVRTemplateNoException if a matching vr template no could not be found
	*/
	public static VRTemplateNo findByP_N_Y(java.lang.String patternNo, int year)
		throws com.fds.vr.business.exception.NoSuchVRTemplateNoException {
		return getPersistence().findByP_N_Y(patternNo, year);
	}

	/**
	* Returns the vr template no where patternNo = &#63; and year = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param patternNo the pattern no
	* @param year the year
	* @return the matching vr template no, or <code>null</code> if a matching vr template no could not be found
	*/
	public static VRTemplateNo fetchByP_N_Y(java.lang.String patternNo, int year) {
		return getPersistence().fetchByP_N_Y(patternNo, year);
	}

	/**
	* Returns the vr template no where patternNo = &#63; and year = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param patternNo the pattern no
	* @param year the year
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr template no, or <code>null</code> if a matching vr template no could not be found
	*/
	public static VRTemplateNo fetchByP_N_Y(java.lang.String patternNo,
		int year, boolean retrieveFromCache) {
		return getPersistence().fetchByP_N_Y(patternNo, year, retrieveFromCache);
	}

	/**
	* Removes the vr template no where patternNo = &#63; and year = &#63; from the database.
	*
	* @param patternNo the pattern no
	* @param year the year
	* @return the vr template no that was removed
	*/
	public static VRTemplateNo removeByP_N_Y(java.lang.String patternNo,
		int year)
		throws com.fds.vr.business.exception.NoSuchVRTemplateNoException {
		return getPersistence().removeByP_N_Y(patternNo, year);
	}

	/**
	* Returns the number of vr template nos where patternNo = &#63; and year = &#63;.
	*
	* @param patternNo the pattern no
	* @param year the year
	* @return the number of matching vr template nos
	*/
	public static int countByP_N_Y(java.lang.String patternNo, int year) {
		return getPersistence().countByP_N_Y(patternNo, year);
	}

	/**
	* Caches the vr template no in the entity cache if it is enabled.
	*
	* @param vrTemplateNo the vr template no
	*/
	public static void cacheResult(VRTemplateNo vrTemplateNo) {
		getPersistence().cacheResult(vrTemplateNo);
	}

	/**
	* Caches the vr template nos in the entity cache if it is enabled.
	*
	* @param vrTemplateNos the vr template nos
	*/
	public static void cacheResult(List<VRTemplateNo> vrTemplateNos) {
		getPersistence().cacheResult(vrTemplateNos);
	}

	/**
	* Creates a new vr template no with the primary key. Does not add the vr template no to the database.
	*
	* @param id the primary key for the new vr template no
	* @return the new vr template no
	*/
	public static VRTemplateNo create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr template no with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr template no
	* @return the vr template no that was removed
	* @throws NoSuchVRTemplateNoException if a vr template no with the primary key could not be found
	*/
	public static VRTemplateNo remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRTemplateNoException {
		return getPersistence().remove(id);
	}

	public static VRTemplateNo updateImpl(VRTemplateNo vrTemplateNo) {
		return getPersistence().updateImpl(vrTemplateNo);
	}

	/**
	* Returns the vr template no with the primary key or throws a {@link NoSuchVRTemplateNoException} if it could not be found.
	*
	* @param id the primary key of the vr template no
	* @return the vr template no
	* @throws NoSuchVRTemplateNoException if a vr template no with the primary key could not be found
	*/
	public static VRTemplateNo findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRTemplateNoException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr template no with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr template no
	* @return the vr template no, or <code>null</code> if a vr template no with the primary key could not be found
	*/
	public static VRTemplateNo fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRTemplateNo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr template nos.
	*
	* @return the vr template nos
	*/
	public static List<VRTemplateNo> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr template nos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTemplateNoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr template nos
	* @param end the upper bound of the range of vr template nos (not inclusive)
	* @return the range of vr template nos
	*/
	public static List<VRTemplateNo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr template nos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTemplateNoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr template nos
	* @param end the upper bound of the range of vr template nos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr template nos
	*/
	public static List<VRTemplateNo> findAll(int start, int end,
		OrderByComparator<VRTemplateNo> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr template nos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTemplateNoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr template nos
	* @param end the upper bound of the range of vr template nos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr template nos
	*/
	public static List<VRTemplateNo> findAll(int start, int end,
		OrderByComparator<VRTemplateNo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr template nos from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr template nos.
	*
	* @return the number of vr template nos
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRTemplateNoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRTemplateNoPersistence, VRTemplateNoPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRTemplateNoPersistence.class);
}